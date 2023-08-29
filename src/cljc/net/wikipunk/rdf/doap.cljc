(ns net.wikipunk.rdf.doap
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/ewilderj/doap/master/schema/doap.rdf",
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vs"   "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "doap",
   :rdfa/uri "http://usefulinc.com/ns/doap#"}
  (:refer-clojure :exclude [name]))

(def ArchRepository
  {:db/ident         :doap/ArchRepository,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     [#rdf/langString "GNU Arch source code repository.@en"
                      #rdf/langString "Úložiště zdrojových kódů GNU Arch.@cs"
                      #rdf/langString "Dépôt GNU Arch du code source.@fr"
                      #rdf/langString
                       "Repositorio GNU Arch del código fuente.@es"
                      #rdf/langString "Repositório GNU Arch do código fonte.@pt"
                      #rdf/langString
                       "GNU Arch Quellcode-Versionierungssystem.@de"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "Dépôt GNU Arch@fr"
                      #rdf/langString "Repositório GNU Arch@pt"
                      #rdf/langString "Repositorio GNU Arch@es"
                      #rdf/langString "Úložiště GNU Arch@cs"
                      #rdf/langString "GNU Arch repository@de"
                      #rdf/langString "GNU Arch repository@en"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def BKRepository
  {:db/ident         :doap/BKRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     [#rdf/langString "Dépôt BitKeeper du code source.@fr"
                      #rdf/langString
                       "Repositório BitKeeper do código fonte.@pt"
                      #rdf/langString "Úložiště zdrojových kódů BitKeeper.@cs"
                      #rdf/langString
                       "BitKeeper Quellcode-Versionierungssystem.@de"
                      #rdf/langString
                       "Repositorio BitKeeper del código fuente.@es"
                      #rdf/langString "BitKeeper source code repository.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "BitKeeper Repository@de"
                      #rdf/langString "BitKeeper Repository@en"
                      #rdf/langString "Repositório Bitkeeper@pt"
                      #rdf/langString "Dépôt BitKeeper@fr"
                      #rdf/langString "Úložiště BitKeeper@cs"
                      #rdf/langString "Repositorio BitKeeper@es"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def BazaarBranch
  {:db/ident         :doap/BazaarBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#rdf/langString "Código fonte da ramificação Bazaar.@pt"
                      #rdf/langString "Bazaar source code branch.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "Ramificação Bazaar@pt"
                      #rdf/langString "Bazaar Branch@en"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def CVSRepository
  {:db/ident         :doap/CVSRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     [#rdf/langString "Dépôt CVS du code source.@fr"
                      #rdf/langString "Úložiště zdrojových kódů CVS.@cs"
                      #rdf/langString "Repositório CVS do código fonte.@pt"
                      #rdf/langString "CVS Quellcode-Versionierungssystem.@de"
                      #rdf/langString "CVS source code repository.@en"
                      #rdf/langString "Repositorio CVS del código fuente.@es"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "CVS Repository@de"
                      #rdf/langString "CVS Repository@en"
                      #rdf/langString "Úložiště CVS@cs"
                      #rdf/langString "Dépôt CVS@fr"
                      #rdf/langString "Repositório CVS@pt"
                      #rdf/langString "Repositorio CVS@es"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def DarcsRepository
  {:db/ident         :doap/DarcsRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#rdf/langString "Dépôt darcs du code source.@fr"
                      #rdf/langString "Repositorio darcs del código fuente.@es"
                      #rdf/langString "Repositório darcs do código fonte.@pt"
                      #rdf/langString "darcs source code repository.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "darcs Repository@en"
                      #rdf/langString "Dépôt darcs@fr"
                      #rdf/langString "Repositório darcs@pt"
                      #rdf/langString "Repositorio darcs@es"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def GitBranch
  {:db/ident         :doap/GitBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#rdf/langString "Código fonte da ramificação Git.@pt"
                      #rdf/langString "Git source code branch.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "Ramificação Git@pt"
                      #rdf/langString "Git Branch@en"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def GitRepository
  {:db/ident         :doap/GitRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#rdf/langString "Repositorio Git del código fuente.@es"
                      #rdf/langString "Dépôt Git du code source.@fr"
                      #rdf/langString "Úložiště zdrojových kódů Git.@cs"
                      #rdf/langString "Repositório Git do código fonte.@pt"
                      #rdf/langString "Git source code repository.@en"
                      #rdf/langString "Git Quellcode-Versionierungssystem.@de"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "Dépôt Git@fr"
                      #rdf/langString "Git Repository@de"
                      #rdf/langString "Git Repository@en"
                      #rdf/langString "Úložiště Git@cs"
                      #rdf/langString "Repositório Git@pt"
                      #rdf/langString "Repositorio Git@es"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def HgRepository
  {:db/ident         :doap/HgRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#rdf/langString
                       "Repositório Mercurial do código fonte.@pt"
                      #rdf/langString "Mercurial source code repository.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "Repositório Mercurial@pt"
                      #rdf/langString "Mercurial Repository@en"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def Project
  {:db/ident         :doap/Project,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#rdf/langString "Projeto.@pt"
                      #rdf/langString "Projekt.@cs"
                      #rdf/langString "Un proyecto.@es"
                      #rdf/langString "Ein Projekt.@de"
                      #rdf/langString "Un projet.@fr"
                      #rdf/langString "A project.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "Proyecto@es"
                      #rdf/langString "Projeto@pt"
                      #rdf/langString "Projet@fr"
                      #rdf/langString "Project@en"
                      #rdf/langString "Projekt@cs"
                      #rdf/langString "Projekt@de"],
   :rdfs/subClassOf  [:rdfs/Resource
                      {:rdfa/uri "http://xmlns.com/wordnet/1.6/Project"}
                      :foaf/Project]})

(def Repository
  {:db/ident         :doap/Repository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#rdf/langString "Repositório do código fonte.@pt"
                      #rdf/langString "Source code repository.@en"
                      #rdf/langString "Dépôt du code source.@fr"
                      #rdf/langString "Quellcode-Versionierungssystem.@de"
                      #rdf/langString "Úložiště zdrojových kódů.@cs"
                      #rdf/langString "Repositorio del código fuente.@es"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "Úložiště@cs"
                      #rdf/langString "Repository@de"
                      #rdf/langString "Repository@en"
                      #rdf/langString "Repositório@pt"
                      #rdf/langString "Dépôt@fr"
                      #rdf/langString "Repositorio@es"],
   :rdfs/subClassOf  :rdfs/Resource})

(def SVNRepository
  {:db/ident         :doap/SVNRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#rdf/langString "Subversion source code repository.@en"
                      #rdf/langString "Úložiště zdrojových kódů Subversion.@cs"
                      #rdf/langString "Dépôt Subversion du code source.@fr"
                      #rdf/langString
                       "Repositório Subversion do código fonte.@pt"
                      #rdf/langString
                       "Subversion Quellcode-Versionierungssystem.@de"
                      #rdf/langString
                       "Repositorio Subversion del código fuente.@es"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "Dépôt Subversion@fr"
                      #rdf/langString "Subversion Repository@de"
                      #rdf/langString "Subversion Repository@en"
                      #rdf/langString "Úložiště Subversion@cs"
                      #rdf/langString "Repositorio Subversion@es"
                      #rdf/langString "Repositório Subversion@pt"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def Specification
  {:db/ident :doap/Specification,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   [#rdf/langString
     "A especificação de aspetos, técnicas ou outros do sistema.@pt"
    #rdf/langString
     "A specification of a system's aspects, technical or otherwise.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "Especificação@pt"
                #rdf/langString "Specification@en"],
   :rdfs/subClassOf :rdfs/Resource})

(def Version
  {:db/ident :doap/Version,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   [#rdf/langString
     "Información sobre la versión de un release del proyecto.@es"
    #rdf/langString "Informace o uvolněné verzi projektu.@cs"
    #rdf/langString "Version information of a project release.@en"
    #rdf/langString "Versionsinformation eines Projekt Releases.@de"
    #rdf/langString "Informação sobre a versão do projeto lançado.@pt"
    #rdf/langString "Détails sur une version d'une release d'un projet.@fr"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "Versão@pt"
                #rdf/langString "Version@de"
                #rdf/langString "Version@fr"
                #rdf/langString "Version@en"
                #rdf/langString "Verze@cs"
                #rdf/langString "Versión@es"],
   :rdfs/subClassOf :rdfs/Resource})

(def anon-root
  {:db/ident         :doap/anon-root,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Repository für anonymen Zugriff@de"
                      #rdf/langString "Repositorio para acceso anónimo.@es"
                      #rdf/langString "Úložiště pro anonymní přístup.@cs"
                      #rdf/langString "Dépôt pour accès anonyme.@fr"
                      #rdf/langString "Repositório para acesso anónimo.@pt"
                      #rdf/langString "Repository for anonymous access.@en"],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "raíz anónima@pt"
                      #rdf/langString "raíz anónima@es"
                      #rdf/langString "anonymní kořen@cs"
                      #rdf/langString "anonymous root@en"
                      #rdf/langString "racine anonyme@fr"
                      #rdf/langString "Anonymes Root@de"],
   :rdfs/range       :rdfs/Literal})

(def audience
  {:db/ident         :doap/audience,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Descrição do utilizador base alvo@pt"
                      #rdf/langString "Description of target user base@en"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "audiência@pt"
                      #rdf/langString "audience@en"],
   :rdfs/range       :rdfs/Literal})

(def blog
  {:db/ident         :doap/blog,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString
                       "URI de um blog relacionado com um projeto@pt"
                      #rdf/langString "URI of a blog related to a project@en"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "blog@pt" #rdf/langString "blog@en"],
   :rdfs/range       [:sioc.types/Weblog :rdfs/Resource]})

(def browse
  {:db/ident         :doap/browse,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Interface web do repositório.@pt"
                      #rdf/langString
                       "Webové rozhraní pro prohlížení úložiště.@cs"
                      #rdf/langString "Web browser interface to repository.@en"
                      #rdf/langString "Interface web au dépôt.@fr"
                      #rdf/langString "Interface web del repositorio.@es"
                      #rdf/langString
                       "Web-Browser Interface für das Repository.@de"],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "browse@en"
                      #rdf/langString "navegar@pt"
                      #rdf/langString "navegar@es"
                      #rdf/langString "visualiser@fr"
                      #rdf/langString "prohlížeč@cs"
                      #rdf/langString "browse@de"]})

(def bug-database
  {:db/ident         :doap/bug-database,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Bug tracker para um projeto.@pt"
                      #rdf/langString "Suivi des bugs pour un projet.@fr"
                      #rdf/langString "Bug tracker for a project.@en"
                      #rdf/langString "Fehlerdatenbank eines Projektes.@de"
                      #rdf/langString "Bug tracker para un proyecto.@es"
                      #rdf/langString "Správa chyb projektu.@cs"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "databáze chyb@cs"
                      #rdf/langString "suivi des bugs@fr"
                      #rdf/langString "Fehlerdatenbank@de"
                      #rdf/langString "bug database@en"
                      #rdf/langString "base de datos de bugs@es"
                      #rdf/langString "base de dados de bugs@pt"]})

(def category
  {:db/ident         :doap/category,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Kategorie projektu.@cs"
                      #rdf/langString "Eine Kategorie eines Projektes.@de"
                      #rdf/langString "A category of project.@en"
                      #rdf/langString "Una categoría de proyecto.@es"
                      #rdf/langString "Uma categoría de projeto.@pt"
                      #rdf/langString "Une catégorie de projet.@fr"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "category@en"
                      #rdf/langString "categoría@es"
                      #rdf/langString "kategorie@cs"
                      #rdf/langString "Kategorie@de"
                      #rdf/langString "catégorie@fr"
                      #rdf/langString "categoria@pt"]})

(def created
  {:db/ident :doap/created,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "Erstellungsdatum von Irgendwas, angegeben im YYYY-MM-DD Format, z.B. 2004-04-05.@de"
    #rdf/langString
     "Datum, kdy bylo něco vytvořeno ve formátu RRRR-MM-DD, např. 2004-04-05@cs"
    #rdf/langString
     "Fecha en la que algo fue creado, en formato AAAA-MM-DD. e.g. 2004-04-05@es"
    #rdf/langString
     "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05@en"
    #rdf/langString
     "Date à laquelle a été créé quelque chose, au format AAAA-MM-JJ (par ex. 2004-04-05)@fr"
    #rdf/langString
     "Data em que algo foi criado, no formato AAAA-MM-DD. e.g. 2004-04-05@pt"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "created@en"
                #rdf/langString "erstellt@de"
                #rdf/langString "vytvořeno@cs"
                #rdf/langString "criado@pt"
                #rdf/langString "creado@es"
                #rdf/langString "créé@fr"],
   :rdfs/range :rdfs/Literal})

(def description
  {:db/ident :doap/description,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "Čistě textový, 2 až 4 věty dlouhý popis projektu.@cs"
    #rdf/langString "Texte descriptif d'un projet, long de 2 à 4 phrases.@fr"
    #rdf/langString
     "Descrição de um projeto em texto apenas, com 2 a 4 frases de comprimento.@pt"
    #rdf/langString
     "Descripción en texto plano de un proyecto, de 2 a 4 enunciados de longitud.@es"
    #rdf/langString
     "Beschreibung eines Projekts als einfacher Text mit der Länge von 2 bis 4 Sätzen.@de"
    #rdf/langString
     "Plain text description of a project, of 2-4 sentences in length.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "descripción@es"
                #rdf/langString "popis@cs"
                #rdf/langString "description@en"
                #rdf/langString "description@fr"
                #rdf/langString "descrição@pt"
                #rdf/langString "Beschreibung@de"],
   :rdfs/range :rdfs/Literal})

(def developer
  {:db/ident         :doap/developer,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Vývojář softwaru projektu.@cs"
                      #rdf/langString
                       "Programador de software para o projeto.@pt"
                      #rdf/langString
                       "Desarrollador de software para el proyecto.@es"
                      #rdf/langString "Développeur pour le projet.@fr"
                      #rdf/langString
                       "Developer of software for the project.@en"
                      #rdf/langString
                       "Software-Entwickler für das Projekt.@de"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "Entwickler@de"
                      #rdf/langString "vývojář@cs"
                      #rdf/langString "développeur@fr"
                      #rdf/langString "desarrollador@es"
                      #rdf/langString "programador@pt"
                      #rdf/langString "developer@en"],
   :rdfs/range       :foaf/Person})

(def developer-forum
  "A forum or community for developers of this project."
  {:db/ident         :doap/developer-forum,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #rdf/langString
                      "A forum or community for developers of this project.@en",
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #rdf/langString "developer forum@en",
   :rdfs/range       :sioc/Container})

(def documentation
  {:db/ident         :doap/documentation,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Aide pour l’utilisation de ce projet.@fr"
                      #rdf/langString "Documentation of the project.@en"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "aide@fr"
                      #rdf/langString "documentation@en"]})

(def documenter
  {:db/ident         :doap/documenter,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString
                       "Contribuidor para a documentação do projeto.@pt"
                      #rdf/langString
                       "Proveedor de documentación para el proyecto.@es"
                      #rdf/langString
                       "Collaborateur à la documentation du projet.@fr"
                      #rdf/langString "Spoluautor dokumentace projektu.@cs"
                      #rdf/langString
                       "Mitarbeiter an der Dokumentation des Projektes.@de"
                      #rdf/langString
                       "Contributor of documentation to the project.@en"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "documenter@en"
                      #rdf/langString "dokumentarista@cs"
                      #rdf/langString "Dokumentator@de"
                      #rdf/langString "escritor de ayuda@es"
                      #rdf/langString "rédacteur de l'aide@fr"
                      #rdf/langString "documentador@pt"],
   :rdfs/range       :foaf/Person})

(def download-mirror
  {:db/ident :doap/download-mirror,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "Mirror of software download web page.@en"
    #rdf/langString
     "Spiegel der Seite von die Projekt-Software heruntergeladen werden kann.@de"
    #rdf/langString "Zrcadlo stránky pro stažení softwaru.@cs"
    #rdf/langString "Mirror de la página web de descarga.@es"
    #rdf/langString "Miroir de la page de téléchargement du programme.@fr"
    #rdf/langString "Mirror da página web para fazer download.@pt"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "zrcadlo stránky pro stažení@cs"
                #rdf/langString "miroir pour le téléchargement@fr"
                #rdf/langString "download mirror@en"
                #rdf/langString "mirror para download@pt"
                #rdf/langString "Spiegel der Seite zum Herunterladen@de"
                #rdf/langString "mirror de descarga@es"]})

(def download-page
  {:db/ident :doap/download-page,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "Web-Seite von der die Projekt-Software heruntergeladen werden kann.@de"
    #rdf/langString
     "Webová stránka, na které lze stáhnout projektový software.@cs"
    #rdf/langString
     "Web page from which the project software can be downloaded.@en"
    #rdf/langString
     "Page web à partir de laquelle on peut télécharger le programme.@fr"
    #rdf/langString
     "Página web da qual o projeto de software pode ser descarregado.@pt"
    #rdf/langString "Página web de la cuál se puede bajar el software.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "stránka pro stažení@cs"
                #rdf/langString "página para download@pt"
                #rdf/langString "page de téléchargement@fr"
                #rdf/langString "Seite zum Herunterladen@de"
                #rdf/langString "download page@en"
                #rdf/langString "página de descarga@es"]})

(def file-release
  {:db/ident         :doap/file-release,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString
                       "URI para download associado com a publicação.@pt"
                      #rdf/langString
                       "URI adresa stažení asociované s revizí.@cs"
                      #rdf/langString
                       "URI of download associated with this release.@en"],
   :rdfs/domain      :doap/Version,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "publicação do ficheiro@pt"
                      #rdf/langString "soubor revize@cs"
                      #rdf/langString "file-release@en"]})

(def helper
  {:db/ident         :doap/helper,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Ajudante ou colaborador do projeto.@pt"
                      #rdf/langString "Spoluautor projektu.@cs"
                      #rdf/langString "Projekt-Mitarbeiter.@de"
                      #rdf/langString "Collaborateur au projet.@fr"
                      #rdf/langString "Project contributor.@en"
                      #rdf/langString "Colaborador del proyecto.@es"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "helper@en"
                      #rdf/langString "collaborateur@fr"
                      #rdf/langString "colaborador@pt"
                      #rdf/langString "colaborador@es"
                      #rdf/langString "Helfer@de"
                      #rdf/langString "spoluautor@cs"],
   :rdfs/range       :foaf/Person})

(def homepage
  {:db/ident :doap/homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [#rdf/langString
     "O URL da página de um projeto,\n\t\tasociada com exactamente um projeto.@pt"
    #rdf/langString
     "El URL de la página de un proyecto,\n\t\tasociada con exactamente un proyecto.@es"
    #rdf/langString
     "URL of a project's homepage,\n\t\tassociated with exactly one project.@en"
    #rdf/langString
     "URL der Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt.@de"
    #rdf/langString
     "L'URL de la page web d'un projet,\n\t\tassociée avec un unique projet.@fr"
    #rdf/langString
     "URL adresa domovské stránky projektu asociované s právě jedním projektem.@cs"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "page web@fr"
                #rdf/langString "Homepage@de"
                #rdf/langString "página web@pt"
                #rdf/langString "página web@es"
                #rdf/langString "homepage@en"
                #rdf/langString "domovská stránka@cs"],
   :rdfs/subPropertyOf :foaf/homepage})

(def implements
  {:db/ident :doap/implements,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "Uma especificação que um projeto implementa. Pode ser uma padrão, API ou um nível de conformidade definida legalmente.@pt"
    #rdf/langString
     "A specification that a project implements. Could be a standard, API or legally defined level of conformance.@en"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "Especificações para implementação@pt"
                #rdf/langString "Implements specification@en"],
   :rdfs/range :doap/Specification})

(def language
  {:db/ident :doap/language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "Código de idioma BCP47 do projeto para o qual foi traduzido@pt"
    #rdf/langString
     "BCP47 language code a project has been translated into@en"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "idioma@pt" #rdf/langString "language@en"],
   :rdfs/range :rdfs/Literal})

(def license
  {:db/ident :doap/license,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "L'URI d'une description RDF de la licence sous laquelle le programme est distribué.@fr"
    #rdf/langString
     "El URI de una descripción RDF de la licencia bajo la cuál se distribuye el software.@es"
    #rdf/langString
     "O URI de uma descrição RDF da licença do software sob a qual é distribuída. Ex.: referência SPDX@pt"
    #rdf/langString
     "URI adresa RDF popisu licence, pod kterou je software distribuován.@cs"
    #rdf/langString
     "Die URI einer RDF-Beschreibung einer Lizenz unter der die Software herausgegeben wird. z.B. eine SPDX Referenz@de"
    #rdf/langString
     "The URI of an RDF description of the license the software is distributed under. E.g. a SPDX reference@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "Lizenz@de"
                #rdf/langString "licence@cs"
                #rdf/langString "licence@fr"
                #rdf/langString "license@en"
                #rdf/langString "licencia@es"
                #rdf/langString "licença@pt"]})

(def location
  {:db/ident         :doap/location,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Lokation eines Repositorys.@de"
                      #rdf/langString "Location of a repository.@en"
                      #rdf/langString "lugar de un repositorio.@es"
                      #rdf/langString "Localização de um repositório.@pt"
                      #rdf/langString "Emplacement d'un dépôt.@fr"
                      #rdf/langString "Umístění úložiště.@cs"],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "repository location@en"
                      #rdf/langString "umístění úložiště@cs"
                      #rdf/langString "localização do respositório@pt"
                      #rdf/langString "lugar del respositorio@es"
                      #rdf/langString "emplacement du dépôt@fr"
                      #rdf/langString "Repository Lokation@de"]})

(def mailing-list
  {:db/ident :doap/mailing-list,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "Domovská stránka nebo e–mailová adresa e–mailové diskuse.@cs"
    #rdf/langString "Homepage der Mailing Liste oder E-Mail Adresse.@de"
    #rdf/langString
     "Page web de la liste de diffusion, ou adresse de courriel.@fr"
    #rdf/langString
     "Página web da lista de distribuição de e-mail ou dos endereços.@pt"
    #rdf/langString "Mailing list home page or email address.@en"
    #rdf/langString
     "Página web de la lista de correo o dirección de correo.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "lista de correo@es"
                #rdf/langString "lista de distribuição de e-mail@pt"
                #rdf/langString "mailing list@en"
                #rdf/langString "liste de diffusion@fr"
                #rdf/langString "Mailing Liste@de"
                #rdf/langString "e–mailová diskuse@cs"],
   :rdfs/range :sioc.types/MailingList})

(def maintainer
  {:db/ident :doap/maintainer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "Správce projektu, vedoucí projektu.@cs"
    #rdf/langString "Développeur principal d'un projet, un meneur du projet.@fr"
    #rdf/langString "Hauptentwickler eines Projektes, der Projektleiter@de"
    #rdf/langString
     "Desarrollador principal de un proyecto, un líder de proyecto.@es"
    #rdf/langString
     "Programador principal de um projeto, um líder de projeto.@pt"
    #rdf/langString "Maintainer of a project, a project leader.@en"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "Projektverantwortlicher@de"
                #rdf/langString "développeur principal@fr"
                #rdf/langString "správce@cs"
                #rdf/langString "maintainer@en"
                #rdf/langString "desarrollador principal@es"
                #rdf/langString "programador principal@pt"],
   :rdfs/range :foaf/Person})

(def module
  {:db/ident :doap/module,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "Nom du module d'un dépôt Subversion, CVS, BitKeeper ou Arch.@fr"
    #rdf/langString
     "Modul-Name eines Subversion, CVS, BitKeeper oder Arch Repositorys.@de"
    #rdf/langString "Jméno modulu v CVS, BitKeeper nebo Arch úložišti.@cs"
    #rdf/langString
     "Module name of a Subversion, CVS, BitKeeper or Arch repository.@en"
    #rdf/langString
     "Nombre del módulo de un repositorio Subversion, CVS, BitKeeper o Arch.@es"
    #rdf/langString
     "Nome do módulo de um repositório Subversion, CVS, BitKeeper ou Arch.@pt"],
   :rdfs/domain
   {:owl/unionOf [:doap/CVSRepository :doap/ArchRepository :doap/BKRepository],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "module@fr"
                #rdf/langString "module@en"
                #rdf/langString "modul@cs"
                #rdf/langString "Modul@de"
                #rdf/langString "módulo@pt"
                #rdf/langString "módulo@es"]})

(def name
  {:db/ident           :doap/name,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString "O nome de alguma coisa.@pt"
                        #rdf/langString "A name of something.@en"
                        #rdf/langString "Der Name von Irgendwas@de"
                        #rdf/langString "El nombre de algo.@es"
                        #rdf/langString "Jméno něčeho.@cs"
                        #rdf/langString "Le nom de quelque chose.@fr"],
   :rdfs/isDefinedBy   {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label         [#rdf/langString "nombre@es"
                        #rdf/langString "nom@fr"
                        #rdf/langString "nome@pt"
                        #rdf/langString "Name@de"
                        #rdf/langString "name@en"
                        #rdf/langString "jméno@cs"],
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :rdfs/label})

(def old-homepage
  {:db/ident :doap/old-homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [#rdf/langString
     "URL adresa předešlé domovské stránky projektu asociované s právě jedním projektem.@cs"
    #rdf/langString
     "URL of a project's past homepage,\n\t\tassociated with exactly one project.@en"
    #rdf/langString
     "L'URL d'une ancienne page web d'un\n\t\tprojet, associée avec un unique projet.@fr"
    #rdf/langString
     "O URL antigo da página de um projeto,\n\t\tassociada com exactamente um projeto.@pt"
    #rdf/langString
     "URL der letzten Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt.@de"
    #rdf/langString
     "El URL de la antigua página de un proyecto,\n\t\tasociada con exactamente un proyecto.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "stará domovská stránka@cs"
                #rdf/langString "ancienne page web@fr"
                #rdf/langString "Alte Homepage@de"
                #rdf/langString "página web antiga@pt"
                #rdf/langString "old homepage@en"
                #rdf/langString "página web antigua@es"],
   :rdfs/subPropertyOf :foaf/homepage})

(def os
  {:db/ident :doap/os,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "Système d'exploitation auquel est limité le projet. Omettez cette propriété si le\n\t\tprojet n'est pas limité à un système d'exploitation.@fr"
    #rdf/langString
     "Sistema operativo a que o projeto está limitado. Omita esta propriedade se o projeto não é condicionado pelo SO usado.@en"
    #rdf/langString
     "Sistema opertivo al cuál está limitado el proyecto.  Omita esta propiedad si el proyecto no es específico\n\t\tde un sistema opertaivo en particular.@es"
    #rdf/langString
     "Betriebssystem auf dem das Projekt eingesetzt werden kann. Diese Eigenschaft kann ausgelassen werden, wenn das Projekt nicht BS-spezifisch ist.@de"
    #rdf/langString
     "Operační systém, na jehož použití je projekt limitován. Vynechejte tuto vlastnost, pokud je projekt nezávislý na operačním systému.@cs"
    #rdf/langString
     "Operating system that a project is limited to.  Omit this property if the project is not OS-specific.@en"],
   :rdfs/domain [:doap/Project :doap/Version],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "operační systém@cs"
                #rdf/langString "système d'exploitation@fr"
                #rdf/langString "Betriebssystem@de"
                #rdf/langString "sistema operativo@pt"
                #rdf/langString "sistema operativo@es"
                #rdf/langString "operating system@en"],
   :rdfs/range :rdfs/Literal})

(def platform
  {:db/ident :doap/platform,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "Indicador da plataforma do software (não específico a nenhum SO), ex.: Java, Firefox, ECMA CLR@pt"
    #rdf/langString
     "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR@en"],
   :rdfs/domain [:doap/Version :doap/Project],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "plataforma@pt" #rdf/langString "platform@en"],
   :rdfs/range :rdfs/Literal})

(def programming-language
  {:db/ident :doap/programming-language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "Programming language a project is implemented in or intended for use with.@en"
    #rdf/langString
     "Lenguaje de programación en el que un proyecto es implementado o con el cuál pretende usarse.@es"
    #rdf/langString
     "Programmiersprache in der ein Projekt implementiert ist oder intendiert wird zu benutzen.@de"
    #rdf/langString
     "Langage de programmation avec lequel un projet est implémenté,\n\t\tou avec lequel il est prévu de l'utiliser.@fr"
    #rdf/langString
     "Programovací jazyk, ve kterém je projekt implementován nebo pro který je zamýšlen k použití.@cs"
    #rdf/langString
     "Linguagem de programação que o projeto usa ou é para ser utilizada.@pt"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "programovací jazyk@cs"
                #rdf/langString "langage de programmation@fr"
                #rdf/langString "programming language@en"
                #rdf/langString "lenguaje de programación@es"
                #rdf/langString "Programmiersprache@de"
                #rdf/langString "linguagem de programação@pt"],
   :rdfs/range :rdfs/Literal})

(def release
  {:db/ident         :doap/release,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Un release (versión) de un proyecto.@es"
                      #rdf/langString "Une release (révision) d'un projet.@fr"
                      #rdf/langString "A project release.@en"
                      #rdf/langString "Relase (verze) projektu.@cs"
                      #rdf/langString "A publicação de um projeto.@pt"
                      #rdf/langString
                       "Ein Release (Version) eines Projekts.@de"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "Release@de"
                      #rdf/langString "release@cs"
                      #rdf/langString "release@es"
                      #rdf/langString "release@fr"
                      #rdf/langString "release@en"
                      #rdf/langString "publicação@pt"],
   :rdfs/range       :doap/Version})

(def repository
  {:db/ident         :doap/repository,
   :owl/inverseOf    :doap/repositoryOf,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Repositorio del código fuente.@es"
                      #rdf/langString "Úložiště zdrojových kódů.@cs"
                      #rdf/langString "Source code repository.@en"
                      #rdf/langString "Repositório do código fonte.@pt"
                      #rdf/langString "Dépôt du code source.@fr"
                      #rdf/langString "Quellcode-Versionierungssystem.@de"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "repository@en"
                      #rdf/langString "repositorio@es"
                      #rdf/langString "repositório@pt"
                      #rdf/langString "dépôt@fr"
                      #rdf/langString "Repository@de"
                      #rdf/langString "úložiště@cs"],
   :rdfs/range       :doap/Repository})

(def repositoryOf
  "The project that uses a repository."
  {:db/ident         :doap/repositoryOf,
   :owl/inverseOf    :doap/repository,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #rdf/langString "The project that uses a repository.@en",
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #rdf/langString "repository of@en",
   :rdfs/range       :doap/Project})

(def revision
  {:db/ident :doap/revision,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "Revision identifier of a software release.@en"
    #rdf/langString "Indentificador de la versión de un release de software.@es"
    #rdf/langString "Identificador do lançamento da revisão do software.@pt"
    #rdf/langString "Identifikátor zpřístupněné revize softwaru.@cs"
    #rdf/langString "Versionsidentifikator eines Software-Releases.@de"
    #rdf/langString "Identifiant de révision d'une release du programme.@fr"],
   :rdfs/domain :doap/Version,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "Version@de"
                #rdf/langString "revision@en"
                #rdf/langString "revisão@pt"
                #rdf/langString "révision@fr"
                #rdf/langString "versión@es"
                #rdf/langString "verze@cs"],
   :rdfs/range :rdfs/Literal})

(def screenshots
  {:db/ident         :doap/screenshots,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString "Web page with screenshots of project.@en"
                      #rdf/langString
                       "Página web con capturas de pantalla del proyecto.@es"
                      #rdf/langString
                       "Page web avec des captures d'écran du projet.@fr"
                      #rdf/langString
                       "Página web com as capturas de ecrãn do projeto.@pt"
                      #rdf/langString
                       "Webová stránka projektu se snímky obrazovky.@cs"
                      #rdf/langString
                       "Web-Seite mit Screenshots eines Projektes.@de"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "snímek obrazovky@cs"
                      #rdf/langString "capturas de ecrãs@pt"
                      #rdf/langString "Screenshots@de"
                      #rdf/langString "screenshots@en"
                      #rdf/langString "captures d'écran@fr"
                      #rdf/langString "capturas de pantalla@es"]})

(def security-contact
  "The Agent that should be contacted\n\tif security issues are found with the project."
  {:db/ident :doap/security-contact,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The Agent that should be contacted\n\tif security issues are found with the project.@en",
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label #rdf/langString "security contact@en",
   :rdfs/range :foaf/Agent})

(def security-policy
  "URL of the security policy of a project."
  {:db/ident           :doap/security-policy,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "URL of the security policy of a project.@en",
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label         #rdf/langString "security policy@en",
   :rdfs/subPropertyOf :foaf/page})

(def service-endpoint
  "The URI of a web service endpoint where software as a service may be accessed"
  {:db/ident :doap/service-endpoint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The URI of a web service endpoint where software as a service may be accessed@en",
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label #rdf/langString "service endpoint@en",
   :rdfs/range :rdfs/Resource})

(def shortdesc
  {:db/ident :doap/shortdesc,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "Descripción corta (8 o 9 palabras) en texto plano de un proyecto.@es"
    #rdf/langString
     "Short (8 or 9 words) plain text description of a project.@en"
    #rdf/langString
     "Kurzbeschreibung (8 oder 9 Wörter) eines Projekts als einfacher Text.@de"
    #rdf/langString
     "Descrição curta (com 8 ou 9 palavras) de um projeto em texto apenas.@pt"
    #rdf/langString "Krátký (8 nebo 9 slov) čistě textový popis projektu.@cs"
    #rdf/langString "Texte descriptif concis (8 ou 9 mots) d'un projet.@fr"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "Kurzbeschreibung@de"
                #rdf/langString "description courte@fr"
                #rdf/langString "descrição curta@pt"
                #rdf/langString "descripción corta@es"
                #rdf/langString "krátký popis@cs"
                #rdf/langString "short description@en"],
   :rdfs/range :rdfs/Literal})

(def support-forum
  "A forum or community that supports this project."
  {:db/ident         :doap/support-forum,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #rdf/langString
                      "A forum or community that supports this project.@en",
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #rdf/langString "supporting forum@en",
   :rdfs/range       :sioc/Container})

(def tester
  {:db/ident :doap/tester,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "Tester nebo jiný spoluautor kontrolující kvalitu.@cs"
    #rdf/langString
     "Ein Tester oder anderer Mitarbeiter der Qualitätskontrolle.@de"
    #rdf/langString "Un testeur ou un collaborateur au contrôle qualité.@fr"
    #rdf/langString "A tester or other quality control contributor.@en"
    #rdf/langString
     "Um controlador ou outro contribuidor para o controlo de qualidade.@pt"
    #rdf/langString "Un tester u otro proveedor de control de calidad.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "testeur@fr"
                #rdf/langString "Tester@de"
                #rdf/langString "controlador@pt"
                #rdf/langString "tester@cs"
                #rdf/langString "tester@es"
                #rdf/langString "tester@en"],
   :rdfs/range :foaf/Person})

(def translator
  {:db/ident         :doap/translator,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#rdf/langString
                       "Contribuidor das traduções para o projeto.@pt"
                      #rdf/langString
                       "Proveedor de traducciones al proyecto.@es"
                      #rdf/langString
                       "Mitarbeiter an den Übersetzungen des Projektes.@de"
                      #rdf/langString
                       "Contributor of translations to the project.@en"
                      #rdf/langString
                       "Collaborateur à la traduction du projet.@fr"
                      #rdf/langString "Spoluautor překladu projektu.@cs"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#rdf/langString "traductor@es"
                      #rdf/langString "translator@en"
                      #rdf/langString "tradutor@pt"
                      #rdf/langString "Übersetzer@de"
                      #rdf/langString "traducteur@fr"
                      #rdf/langString "překladatel@cs"],
   :rdfs/range       :foaf/Person})

(def vendor
  "Vendor organization: commercial, free or otherwise"
  {:db/ident         :doap/vendor,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #rdf/langString
                      "Vendor organization: commercial, free or otherwise@en",
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #rdf/langString "vendor@en",
   :rdfs/range       :foaf/Organization})

(def wiki
  {:db/ident :doap/wiki,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "L'URL du Wiki pour la discussion collaborative sur le projet.@fr"
    #rdf/langString "URL of Wiki for collaborative discussion of project.@en"
    #rdf/langString "URL adresa wiki projektu pro společné diskuse.@cs"
    #rdf/langString
     "Wiki-URL für die kollaborative Dikussion eines Projektes.@de"
    #rdf/langString "URL da Wiki para discussão em grupo do projeto.@pt"
    #rdf/langString
     "URL del Wiki para discusión colaborativa del proyecto.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#rdf/langString "Wiki@de"
                #rdf/langString "wiki@pt"
                #rdf/langString "wiki@cs"
                #rdf/langString "wiki@es"
                #rdf/langString "wiki@fr"
                #rdf/langString "wiki@en"],
   :rdfs/range :sioc.types/Wiki})
