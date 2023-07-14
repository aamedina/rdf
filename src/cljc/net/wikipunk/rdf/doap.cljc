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
   :rdfs/comment     [#xsd/langString "GNU Arch source code repository.@en"
                      #xsd/langString "Úložiště zdrojových kódů GNU Arch.@cs"
                      #xsd/langString "Dépôt GNU Arch du code source.@fr"
                      #xsd/langString
                       "Repositorio GNU Arch del código fuente.@es"
                      #xsd/langString "Repositório GNU Arch do código fonte.@pt"
                      #xsd/langString
                       "GNU Arch Quellcode-Versionierungssystem.@de"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "Dépôt GNU Arch@fr"
                      #xsd/langString "Repositório GNU Arch@pt"
                      #xsd/langString "Repositorio GNU Arch@es"
                      #xsd/langString "Úložiště GNU Arch@cs"
                      #xsd/langString "GNU Arch repository@de"
                      #xsd/langString "GNU Arch repository@en"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def BKRepository
  {:db/ident         :doap/BKRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     [#xsd/langString "Dépôt BitKeeper du code source.@fr"
                      #xsd/langString
                       "Repositório BitKeeper do código fonte.@pt"
                      #xsd/langString "Úložiště zdrojových kódů BitKeeper.@cs"
                      #xsd/langString
                       "BitKeeper Quellcode-Versionierungssystem.@de"
                      #xsd/langString
                       "Repositorio BitKeeper del código fuente.@es"
                      #xsd/langString "BitKeeper source code repository.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "BitKeeper Repository@de"
                      #xsd/langString "BitKeeper Repository@en"
                      #xsd/langString "Repositório Bitkeeper@pt"
                      #xsd/langString "Dépôt BitKeeper@fr"
                      #xsd/langString "Úložiště BitKeeper@cs"
                      #xsd/langString "Repositorio BitKeeper@es"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def BazaarBranch
  {:db/ident         :doap/BazaarBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#xsd/langString "Código fonte da ramificação Bazaar.@pt"
                      #xsd/langString "Bazaar source code branch.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "Ramificação Bazaar@pt"
                      #xsd/langString "Bazaar Branch@en"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def CVSRepository
  {:db/ident         :doap/CVSRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     [#xsd/langString "Dépôt CVS du code source.@fr"
                      #xsd/langString "Úložiště zdrojových kódů CVS.@cs"
                      #xsd/langString "Repositório CVS do código fonte.@pt"
                      #xsd/langString "CVS Quellcode-Versionierungssystem.@de"
                      #xsd/langString "CVS source code repository.@en"
                      #xsd/langString "Repositorio CVS del código fuente.@es"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "CVS Repository@de"
                      #xsd/langString "CVS Repository@en"
                      #xsd/langString "Úložiště CVS@cs"
                      #xsd/langString "Dépôt CVS@fr"
                      #xsd/langString "Repositório CVS@pt"
                      #xsd/langString "Repositorio CVS@es"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def DarcsRepository
  {:db/ident         :doap/DarcsRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#xsd/langString "Dépôt darcs du code source.@fr"
                      #xsd/langString "Repositorio darcs del código fuente.@es"
                      #xsd/langString "Repositório darcs do código fonte.@pt"
                      #xsd/langString "darcs source code repository.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "darcs Repository@en"
                      #xsd/langString "Dépôt darcs@fr"
                      #xsd/langString "Repositório darcs@pt"
                      #xsd/langString "Repositorio darcs@es"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def GitBranch
  {:db/ident         :doap/GitBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#xsd/langString "Código fonte da ramificação Git.@pt"
                      #xsd/langString "Git source code branch.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "Ramificação Git@pt"
                      #xsd/langString "Git Branch@en"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def GitRepository
  {:db/ident         :doap/GitRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#xsd/langString "Repositorio Git del código fuente.@es"
                      #xsd/langString "Dépôt Git du code source.@fr"
                      #xsd/langString "Úložiště zdrojových kódů Git.@cs"
                      #xsd/langString "Repositório Git do código fonte.@pt"
                      #xsd/langString "Git source code repository.@en"
                      #xsd/langString "Git Quellcode-Versionierungssystem.@de"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "Dépôt Git@fr"
                      #xsd/langString "Git Repository@de"
                      #xsd/langString "Git Repository@en"
                      #xsd/langString "Úložiště Git@cs"
                      #xsd/langString "Repositório Git@pt"
                      #xsd/langString "Repositorio Git@es"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def HgRepository
  {:db/ident         :doap/HgRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#xsd/langString
                       "Repositório Mercurial do código fonte.@pt"
                      #xsd/langString "Mercurial source code repository.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "Repositório Mercurial@pt"
                      #xsd/langString "Mercurial Repository@en"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def Project
  {:db/ident         :doap/Project,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#xsd/langString "Projeto.@pt"
                      #xsd/langString "Projekt.@cs"
                      #xsd/langString "Un proyecto.@es"
                      #xsd/langString "Ein Projekt.@de"
                      #xsd/langString "Un projet.@fr"
                      #xsd/langString "A project.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "Proyecto@es"
                      #xsd/langString "Projeto@pt"
                      #xsd/langString "Projet@fr"
                      #xsd/langString "Project@en"
                      #xsd/langString "Projekt@cs"
                      #xsd/langString "Projekt@de"],
   :rdfs/subClassOf  [:rdfs/Resource
                      {:rdfa/uri "http://xmlns.com/wordnet/1.6/Project"}
                      :foaf/Project]})

(def Repository
  {:db/ident         :doap/Repository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#xsd/langString "Repositório do código fonte.@pt"
                      #xsd/langString "Source code repository.@en"
                      #xsd/langString "Dépôt du code source.@fr"
                      #xsd/langString "Quellcode-Versionierungssystem.@de"
                      #xsd/langString "Úložiště zdrojových kódů.@cs"
                      #xsd/langString "Repositorio del código fuente.@es"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "Úložiště@cs"
                      #xsd/langString "Repository@de"
                      #xsd/langString "Repository@en"
                      #xsd/langString "Repositório@pt"
                      #xsd/langString "Dépôt@fr"
                      #xsd/langString "Repositorio@es"],
   :rdfs/subClassOf  :rdfs/Resource})

(def SVNRepository
  {:db/ident         :doap/SVNRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     [#xsd/langString "Subversion source code repository.@en"
                      #xsd/langString "Úložiště zdrojových kódů Subversion.@cs"
                      #xsd/langString "Dépôt Subversion du code source.@fr"
                      #xsd/langString
                       "Repositório Subversion do código fonte.@pt"
                      #xsd/langString
                       "Subversion Quellcode-Versionierungssystem.@de"
                      #xsd/langString
                       "Repositorio Subversion del código fuente.@es"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "Dépôt Subversion@fr"
                      #xsd/langString "Subversion Repository@de"
                      #xsd/langString "Subversion Repository@en"
                      #xsd/langString "Úložiště Subversion@cs"
                      #xsd/langString "Repositorio Subversion@es"
                      #xsd/langString "Repositório Subversion@pt"],
   :rdfs/subClassOf  [:doap/Repository :rdfs/Resource]})

(def Specification
  {:db/ident :doap/Specification,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   [#xsd/langString
     "A especificação de aspetos, técnicas ou outros do sistema.@pt"
    #xsd/langString
     "A specification of a system's aspects, technical or otherwise.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "Especificação@pt"
                #xsd/langString "Specification@en"],
   :rdfs/subClassOf :rdfs/Resource})

(def Version
  {:db/ident :doap/Version,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   [#xsd/langString
     "Información sobre la versión de un release del proyecto.@es"
    #xsd/langString "Informace o uvolněné verzi projektu.@cs"
    #xsd/langString "Version information of a project release.@en"
    #xsd/langString "Versionsinformation eines Projekt Releases.@de"
    #xsd/langString "Informação sobre a versão do projeto lançado.@pt"
    #xsd/langString "Détails sur une version d'une release d'un projet.@fr"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "Versão@pt"
                #xsd/langString "Version@de"
                #xsd/langString "Version@fr"
                #xsd/langString "Version@en"
                #xsd/langString "Verze@cs"
                #xsd/langString "Versión@es"],
   :rdfs/subClassOf :rdfs/Resource})

(def anon-root
  {:db/ident         :doap/anon-root,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Repository für anonymen Zugriff@de"
                      #xsd/langString "Repositorio para acceso anónimo.@es"
                      #xsd/langString "Úložiště pro anonymní přístup.@cs"
                      #xsd/langString "Dépôt pour accès anonyme.@fr"
                      #xsd/langString "Repositório para acesso anónimo.@pt"
                      #xsd/langString "Repository for anonymous access.@en"],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "raíz anónima@pt"
                      #xsd/langString "raíz anónima@es"
                      #xsd/langString "anonymní kořen@cs"
                      #xsd/langString "anonymous root@en"
                      #xsd/langString "racine anonyme@fr"
                      #xsd/langString "Anonymes Root@de"],
   :rdfs/range       :rdfs/Literal})

(def audience
  {:db/ident         :doap/audience,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Descrição do utilizador base alvo@pt"
                      #xsd/langString "Description of target user base@en"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "audiência@pt"
                      #xsd/langString "audience@en"],
   :rdfs/range       :rdfs/Literal})

(def blog
  {:db/ident         :doap/blog,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString
                       "URI de um blog relacionado com um projeto@pt"
                      #xsd/langString "URI of a blog related to a project@en"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "blog@pt" #xsd/langString "blog@en"],
   :rdfs/range       [:sioc.types/Weblog :rdfs/Resource]})

(def browse
  {:db/ident         :doap/browse,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Interface web do repositório.@pt"
                      #xsd/langString
                       "Webové rozhraní pro prohlížení úložiště.@cs"
                      #xsd/langString "Web browser interface to repository.@en"
                      #xsd/langString "Interface web au dépôt.@fr"
                      #xsd/langString "Interface web del repositorio.@es"
                      #xsd/langString
                       "Web-Browser Interface für das Repository.@de"],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "browse@en"
                      #xsd/langString "navegar@pt"
                      #xsd/langString "navegar@es"
                      #xsd/langString "visualiser@fr"
                      #xsd/langString "prohlížeč@cs"
                      #xsd/langString "browse@de"]})

(def bug-database
  {:db/ident         :doap/bug-database,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Bug tracker para um projeto.@pt"
                      #xsd/langString "Suivi des bugs pour un projet.@fr"
                      #xsd/langString "Bug tracker for a project.@en"
                      #xsd/langString "Fehlerdatenbank eines Projektes.@de"
                      #xsd/langString "Bug tracker para un proyecto.@es"
                      #xsd/langString "Správa chyb projektu.@cs"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "databáze chyb@cs"
                      #xsd/langString "suivi des bugs@fr"
                      #xsd/langString "Fehlerdatenbank@de"
                      #xsd/langString "bug database@en"
                      #xsd/langString "base de datos de bugs@es"
                      #xsd/langString "base de dados de bugs@pt"]})

(def category
  {:db/ident         :doap/category,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Kategorie projektu.@cs"
                      #xsd/langString "Eine Kategorie eines Projektes.@de"
                      #xsd/langString "A category of project.@en"
                      #xsd/langString "Una categoría de proyecto.@es"
                      #xsd/langString "Uma categoría de projeto.@pt"
                      #xsd/langString "Une catégorie de projet.@fr"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "category@en"
                      #xsd/langString "categoría@es"
                      #xsd/langString "kategorie@cs"
                      #xsd/langString "Kategorie@de"
                      #xsd/langString "catégorie@fr"
                      #xsd/langString "categoria@pt"]})

(def created
  {:db/ident :doap/created,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "Erstellungsdatum von Irgendwas, angegeben im YYYY-MM-DD Format, z.B. 2004-04-05.@de"
    #xsd/langString
     "Datum, kdy bylo něco vytvořeno ve formátu RRRR-MM-DD, např. 2004-04-05@cs"
    #xsd/langString
     "Fecha en la que algo fue creado, en formato AAAA-MM-DD. e.g. 2004-04-05@es"
    #xsd/langString
     "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05@en"
    #xsd/langString
     "Date à laquelle a été créé quelque chose, au format AAAA-MM-JJ (par ex. 2004-04-05)@fr"
    #xsd/langString
     "Data em que algo foi criado, no formato AAAA-MM-DD. e.g. 2004-04-05@pt"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "created@en"
                #xsd/langString "erstellt@de"
                #xsd/langString "vytvořeno@cs"
                #xsd/langString "criado@pt"
                #xsd/langString "creado@es"
                #xsd/langString "créé@fr"],
   :rdfs/range :rdfs/Literal})

(def description
  {:db/ident :doap/description,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "Čistě textový, 2 až 4 věty dlouhý popis projektu.@cs"
    #xsd/langString "Texte descriptif d'un projet, long de 2 à 4 phrases.@fr"
    #xsd/langString
     "Descrição de um projeto em texto apenas, com 2 a 4 frases de comprimento.@pt"
    #xsd/langString
     "Descripción en texto plano de un proyecto, de 2 a 4 enunciados de longitud.@es"
    #xsd/langString
     "Beschreibung eines Projekts als einfacher Text mit der Länge von 2 bis 4 Sätzen.@de"
    #xsd/langString
     "Plain text description of a project, of 2-4 sentences in length.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "descripción@es"
                #xsd/langString "popis@cs"
                #xsd/langString "description@en"
                #xsd/langString "description@fr"
                #xsd/langString "descrição@pt"
                #xsd/langString "Beschreibung@de"],
   :rdfs/range :rdfs/Literal})

(def developer
  {:db/ident         :doap/developer,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Vývojář softwaru projektu.@cs"
                      #xsd/langString
                       "Programador de software para o projeto.@pt"
                      #xsd/langString
                       "Desarrollador de software para el proyecto.@es"
                      #xsd/langString "Développeur pour le projet.@fr"
                      #xsd/langString
                       "Developer of software for the project.@en"
                      #xsd/langString
                       "Software-Entwickler für das Projekt.@de"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "Entwickler@de"
                      #xsd/langString "vývojář@cs"
                      #xsd/langString "développeur@fr"
                      #xsd/langString "desarrollador@es"
                      #xsd/langString "programador@pt"
                      #xsd/langString "developer@en"],
   :rdfs/range       :foaf/Person})

(def developer-forum
  "A forum or community for developers of this project."
  {:db/ident         :doap/developer-forum,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "A forum or community for developers of this project.@en",
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #xsd/langString "developer forum@en",
   :rdfs/range       :sioc/Container})

(def documentation
  {:db/ident         :doap/documentation,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Aide pour l’utilisation de ce projet.@fr"
                      #xsd/langString "Documentation of the project.@en"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "aide@fr"
                      #xsd/langString "documentation@en"]})

(def documenter
  {:db/ident         :doap/documenter,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString
                       "Contribuidor para a documentação do projeto.@pt"
                      #xsd/langString
                       "Proveedor de documentación para el proyecto.@es"
                      #xsd/langString
                       "Collaborateur à la documentation du projet.@fr"
                      #xsd/langString "Spoluautor dokumentace projektu.@cs"
                      #xsd/langString
                       "Mitarbeiter an der Dokumentation des Projektes.@de"
                      #xsd/langString
                       "Contributor of documentation to the project.@en"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "documenter@en"
                      #xsd/langString "dokumentarista@cs"
                      #xsd/langString "Dokumentator@de"
                      #xsd/langString "escritor de ayuda@es"
                      #xsd/langString "rédacteur de l'aide@fr"
                      #xsd/langString "documentador@pt"],
   :rdfs/range       :foaf/Person})

(def download-mirror
  {:db/ident :doap/download-mirror,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "Mirror of software download web page.@en"
    #xsd/langString
     "Spiegel der Seite von die Projekt-Software heruntergeladen werden kann.@de"
    #xsd/langString "Zrcadlo stránky pro stažení softwaru.@cs"
    #xsd/langString "Mirror de la página web de descarga.@es"
    #xsd/langString "Miroir de la page de téléchargement du programme.@fr"
    #xsd/langString "Mirror da página web para fazer download.@pt"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "zrcadlo stránky pro stažení@cs"
                #xsd/langString "miroir pour le téléchargement@fr"
                #xsd/langString "download mirror@en"
                #xsd/langString "mirror para download@pt"
                #xsd/langString "Spiegel der Seite zum Herunterladen@de"
                #xsd/langString "mirror de descarga@es"]})

(def download-page
  {:db/ident :doap/download-page,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "Web-Seite von der die Projekt-Software heruntergeladen werden kann.@de"
    #xsd/langString
     "Webová stránka, na které lze stáhnout projektový software.@cs"
    #xsd/langString
     "Web page from which the project software can be downloaded.@en"
    #xsd/langString
     "Page web à partir de laquelle on peut télécharger le programme.@fr"
    #xsd/langString
     "Página web da qual o projeto de software pode ser descarregado.@pt"
    #xsd/langString "Página web de la cuál se puede bajar el software.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "stránka pro stažení@cs"
                #xsd/langString "página para download@pt"
                #xsd/langString "page de téléchargement@fr"
                #xsd/langString "Seite zum Herunterladen@de"
                #xsd/langString "download page@en"
                #xsd/langString "página de descarga@es"]})

(def file-release
  {:db/ident         :doap/file-release,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString
                       "URI para download associado com a publicação.@pt"
                      #xsd/langString
                       "URI adresa stažení asociované s revizí.@cs"
                      #xsd/langString
                       "URI of download associated with this release.@en"],
   :rdfs/domain      :doap/Version,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "publicação do ficheiro@pt"
                      #xsd/langString "soubor revize@cs"
                      #xsd/langString "file-release@en"]})

(def helper
  {:db/ident         :doap/helper,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Ajudante ou colaborador do projeto.@pt"
                      #xsd/langString "Spoluautor projektu.@cs"
                      #xsd/langString "Projekt-Mitarbeiter.@de"
                      #xsd/langString "Collaborateur au projet.@fr"
                      #xsd/langString "Project contributor.@en"
                      #xsd/langString "Colaborador del proyecto.@es"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "helper@en"
                      #xsd/langString "collaborateur@fr"
                      #xsd/langString "colaborador@pt"
                      #xsd/langString "colaborador@es"
                      #xsd/langString "Helfer@de"
                      #xsd/langString "spoluautor@cs"],
   :rdfs/range       :foaf/Person})

(def homepage
  {:db/ident :doap/homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [#xsd/langString
     "O URL da página de um projeto,\n\t\tasociada com exactamente um projeto.@pt"
    #xsd/langString
     "El URL de la página de un proyecto,\n\t\tasociada con exactamente un proyecto.@es"
    #xsd/langString
     "URL of a project's homepage,\n\t\tassociated with exactly one project.@en"
    #xsd/langString
     "URL der Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt.@de"
    #xsd/langString
     "L'URL de la page web d'un projet,\n\t\tassociée avec un unique projet.@fr"
    #xsd/langString
     "URL adresa domovské stránky projektu asociované s právě jedním projektem.@cs"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "page web@fr"
                #xsd/langString "Homepage@de"
                #xsd/langString "página web@pt"
                #xsd/langString "página web@es"
                #xsd/langString "homepage@en"
                #xsd/langString "domovská stránka@cs"],
   :rdfs/subPropertyOf :foaf/homepage})

(def implements
  {:db/ident :doap/implements,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "Uma especificação que um projeto implementa. Pode ser uma padrão, API ou um nível de conformidade definida legalmente.@pt"
    #xsd/langString
     "A specification that a project implements. Could be a standard, API or legally defined level of conformance.@en"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "Especificações para implementação@pt"
                #xsd/langString "Implements specification@en"],
   :rdfs/range :doap/Specification})

(def language
  {:db/ident :doap/language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "Código de idioma BCP47 do projeto para o qual foi traduzido@pt"
    #xsd/langString
     "BCP47 language code a project has been translated into@en"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "idioma@pt" #xsd/langString "language@en"],
   :rdfs/range :rdfs/Literal})

(def license
  {:db/ident :doap/license,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "L'URI d'une description RDF de la licence sous laquelle le programme est distribué.@fr"
    #xsd/langString
     "El URI de una descripción RDF de la licencia bajo la cuál se distribuye el software.@es"
    #xsd/langString
     "O URI de uma descrição RDF da licença do software sob a qual é distribuída. Ex.: referência SPDX@pt"
    #xsd/langString
     "URI adresa RDF popisu licence, pod kterou je software distribuován.@cs"
    #xsd/langString
     "Die URI einer RDF-Beschreibung einer Lizenz unter der die Software herausgegeben wird. z.B. eine SPDX Referenz@de"
    #xsd/langString
     "The URI of an RDF description of the license the software is distributed under. E.g. a SPDX reference@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "Lizenz@de"
                #xsd/langString "licence@cs"
                #xsd/langString "licence@fr"
                #xsd/langString "license@en"
                #xsd/langString "licencia@es"
                #xsd/langString "licença@pt"]})

(def location
  {:db/ident         :doap/location,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Lokation eines Repositorys.@de"
                      #xsd/langString "Location of a repository.@en"
                      #xsd/langString "lugar de un repositorio.@es"
                      #xsd/langString "Localização de um repositório.@pt"
                      #xsd/langString "Emplacement d'un dépôt.@fr"
                      #xsd/langString "Umístění úložiště.@cs"],
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "repository location@en"
                      #xsd/langString "umístění úložiště@cs"
                      #xsd/langString "localização do respositório@pt"
                      #xsd/langString "lugar del respositorio@es"
                      #xsd/langString "emplacement du dépôt@fr"
                      #xsd/langString "Repository Lokation@de"]})

(def mailing-list
  {:db/ident :doap/mailing-list,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "Domovská stránka nebo e–mailová adresa e–mailové diskuse.@cs"
    #xsd/langString "Homepage der Mailing Liste oder E-Mail Adresse.@de"
    #xsd/langString
     "Page web de la liste de diffusion, ou adresse de courriel.@fr"
    #xsd/langString
     "Página web da lista de distribuição de e-mail ou dos endereços.@pt"
    #xsd/langString "Mailing list home page or email address.@en"
    #xsd/langString
     "Página web de la lista de correo o dirección de correo.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "lista de correo@es"
                #xsd/langString "lista de distribuição de e-mail@pt"
                #xsd/langString "mailing list@en"
                #xsd/langString "liste de diffusion@fr"
                #xsd/langString "Mailing Liste@de"
                #xsd/langString "e–mailová diskuse@cs"],
   :rdfs/range :sioc.types/MailingList})

(def maintainer
  {:db/ident :doap/maintainer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "Správce projektu, vedoucí projektu.@cs"
    #xsd/langString "Développeur principal d'un projet, un meneur du projet.@fr"
    #xsd/langString "Hauptentwickler eines Projektes, der Projektleiter@de"
    #xsd/langString
     "Desarrollador principal de un proyecto, un líder de proyecto.@es"
    #xsd/langString
     "Programador principal de um projeto, um líder de projeto.@pt"
    #xsd/langString "Maintainer of a project, a project leader.@en"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "Projektverantwortlicher@de"
                #xsd/langString "développeur principal@fr"
                #xsd/langString "správce@cs"
                #xsd/langString "maintainer@en"
                #xsd/langString "desarrollador principal@es"
                #xsd/langString "programador principal@pt"],
   :rdfs/range :foaf/Person})

(def module
  {:db/ident :doap/module,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "Nom du module d'un dépôt Subversion, CVS, BitKeeper ou Arch.@fr"
    #xsd/langString
     "Modul-Name eines Subversion, CVS, BitKeeper oder Arch Repositorys.@de"
    #xsd/langString "Jméno modulu v CVS, BitKeeper nebo Arch úložišti.@cs"
    #xsd/langString
     "Module name of a Subversion, CVS, BitKeeper or Arch repository.@en"
    #xsd/langString
     "Nombre del módulo de un repositorio Subversion, CVS, BitKeeper o Arch.@es"
    #xsd/langString
     "Nome do módulo de um repositório Subversion, CVS, BitKeeper ou Arch.@pt"],
   :rdfs/domain
   {:owl/unionOf [:doap/CVSRepository :doap/ArchRepository :doap/BKRepository],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "module@fr"
                #xsd/langString "module@en"
                #xsd/langString "modul@cs"
                #xsd/langString "Modul@de"
                #xsd/langString "módulo@pt"
                #xsd/langString "módulo@es"]})

(def name
  {:db/ident           :doap/name,
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#xsd/langString "O nome de alguma coisa.@pt"
                        #xsd/langString "A name of something.@en"
                        #xsd/langString "Der Name von Irgendwas@de"
                        #xsd/langString "El nombre de algo.@es"
                        #xsd/langString "Jméno něčeho.@cs"
                        #xsd/langString "Le nom de quelque chose.@fr"],
   :rdfs/isDefinedBy   {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label         [#xsd/langString "nombre@es"
                        #xsd/langString "nom@fr"
                        #xsd/langString "nome@pt"
                        #xsd/langString "Name@de"
                        #xsd/langString "name@en"
                        #xsd/langString "jméno@cs"],
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :rdfs/label})

(def old-homepage
  {:db/ident :doap/old-homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   [#xsd/langString
     "URL adresa předešlé domovské stránky projektu asociované s právě jedním projektem.@cs"
    #xsd/langString
     "URL of a project's past homepage,\n\t\tassociated with exactly one project.@en"
    #xsd/langString
     "L'URL d'une ancienne page web d'un\n\t\tprojet, associée avec un unique projet.@fr"
    #xsd/langString
     "O URL antigo da página de um projeto,\n\t\tassociada com exactamente um projeto.@pt"
    #xsd/langString
     "URL der letzten Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt.@de"
    #xsd/langString
     "El URL de la antigua página de un proyecto,\n\t\tasociada con exactamente un proyecto.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "stará domovská stránka@cs"
                #xsd/langString "ancienne page web@fr"
                #xsd/langString "Alte Homepage@de"
                #xsd/langString "página web antiga@pt"
                #xsd/langString "old homepage@en"
                #xsd/langString "página web antigua@es"],
   :rdfs/subPropertyOf :foaf/homepage})

(def os
  {:db/ident :doap/os,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "Système d'exploitation auquel est limité le projet. Omettez cette propriété si le\n\t\tprojet n'est pas limité à un système d'exploitation.@fr"
    #xsd/langString
     "Sistema operativo a que o projeto está limitado. Omita esta propriedade se o projeto não é condicionado pelo SO usado.@en"
    #xsd/langString
     "Sistema opertivo al cuál está limitado el proyecto.  Omita esta propiedad si el proyecto no es específico\n\t\tde un sistema opertaivo en particular.@es"
    #xsd/langString
     "Betriebssystem auf dem das Projekt eingesetzt werden kann. Diese Eigenschaft kann ausgelassen werden, wenn das Projekt nicht BS-spezifisch ist.@de"
    #xsd/langString
     "Operační systém, na jehož použití je projekt limitován. Vynechejte tuto vlastnost, pokud je projekt nezávislý na operačním systému.@cs"
    #xsd/langString
     "Operating system that a project is limited to.  Omit this property if the project is not OS-specific.@en"],
   :rdfs/domain [:doap/Project :doap/Version],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "operační systém@cs"
                #xsd/langString "système d'exploitation@fr"
                #xsd/langString "Betriebssystem@de"
                #xsd/langString "sistema operativo@pt"
                #xsd/langString "sistema operativo@es"
                #xsd/langString "operating system@en"],
   :rdfs/range :rdfs/Literal})

(def platform
  {:db/ident :doap/platform,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "Indicador da plataforma do software (não específico a nenhum SO), ex.: Java, Firefox, ECMA CLR@pt"
    #xsd/langString
     "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR@en"],
   :rdfs/domain [:doap/Version :doap/Project],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "plataforma@pt" #xsd/langString "platform@en"],
   :rdfs/range :rdfs/Literal})

(def programming-language
  {:db/ident :doap/programming-language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "Programming language a project is implemented in or intended for use with.@en"
    #xsd/langString
     "Lenguaje de programación en el que un proyecto es implementado o con el cuál pretende usarse.@es"
    #xsd/langString
     "Programmiersprache in der ein Projekt implementiert ist oder intendiert wird zu benutzen.@de"
    #xsd/langString
     "Langage de programmation avec lequel un projet est implémenté,\n\t\tou avec lequel il est prévu de l'utiliser.@fr"
    #xsd/langString
     "Programovací jazyk, ve kterém je projekt implementován nebo pro který je zamýšlen k použití.@cs"
    #xsd/langString
     "Linguagem de programação que o projeto usa ou é para ser utilizada.@pt"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "programovací jazyk@cs"
                #xsd/langString "langage de programmation@fr"
                #xsd/langString "programming language@en"
                #xsd/langString "lenguaje de programación@es"
                #xsd/langString "Programmiersprache@de"
                #xsd/langString "linguagem de programação@pt"],
   :rdfs/range :rdfs/Literal})

(def release
  {:db/ident         :doap/release,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Un release (versión) de un proyecto.@es"
                      #xsd/langString "Une release (révision) d'un projet.@fr"
                      #xsd/langString "A project release.@en"
                      #xsd/langString "Relase (verze) projektu.@cs"
                      #xsd/langString "A publicação de um projeto.@pt"
                      #xsd/langString
                       "Ein Release (Version) eines Projekts.@de"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "Release@de"
                      #xsd/langString "release@cs"
                      #xsd/langString "release@es"
                      #xsd/langString "release@fr"
                      #xsd/langString "release@en"
                      #xsd/langString "publicação@pt"],
   :rdfs/range       :doap/Version})

(def repository
  {:db/ident         :doap/repository,
   :owl/inverseOf    :doap/repositoryOf,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Repositorio del código fuente.@es"
                      #xsd/langString "Úložiště zdrojových kódů.@cs"
                      #xsd/langString "Source code repository.@en"
                      #xsd/langString "Repositório do código fonte.@pt"
                      #xsd/langString "Dépôt du code source.@fr"
                      #xsd/langString "Quellcode-Versionierungssystem.@de"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "repository@en"
                      #xsd/langString "repositorio@es"
                      #xsd/langString "repositório@pt"
                      #xsd/langString "dépôt@fr"
                      #xsd/langString "Repository@de"
                      #xsd/langString "úložiště@cs"],
   :rdfs/range       :doap/Repository})

(def repositoryOf
  "The project that uses a repository."
  {:db/ident         :doap/repositoryOf,
   :owl/inverseOf    :doap/repository,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The project that uses a repository.@en",
   :rdfs/domain      :doap/Repository,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #xsd/langString "repository of@en",
   :rdfs/range       :doap/Project})

(def revision
  {:db/ident :doap/revision,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "Revision identifier of a software release.@en"
    #xsd/langString "Indentificador de la versión de un release de software.@es"
    #xsd/langString "Identificador do lançamento da revisão do software.@pt"
    #xsd/langString "Identifikátor zpřístupněné revize softwaru.@cs"
    #xsd/langString "Versionsidentifikator eines Software-Releases.@de"
    #xsd/langString "Identifiant de révision d'une release du programme.@fr"],
   :rdfs/domain :doap/Version,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "Version@de"
                #xsd/langString "revision@en"
                #xsd/langString "revisão@pt"
                #xsd/langString "révision@fr"
                #xsd/langString "versión@es"
                #xsd/langString "verze@cs"],
   :rdfs/range :rdfs/Literal})

(def screenshots
  {:db/ident         :doap/screenshots,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString "Web page with screenshots of project.@en"
                      #xsd/langString
                       "Página web con capturas de pantalla del proyecto.@es"
                      #xsd/langString
                       "Page web avec des captures d'écran du projet.@fr"
                      #xsd/langString
                       "Página web com as capturas de ecrãn do projeto.@pt"
                      #xsd/langString
                       "Webová stránka projektu se snímky obrazovky.@cs"
                      #xsd/langString
                       "Web-Seite mit Screenshots eines Projektes.@de"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "snímek obrazovky@cs"
                      #xsd/langString "capturas de ecrãs@pt"
                      #xsd/langString "Screenshots@de"
                      #xsd/langString "screenshots@en"
                      #xsd/langString "captures d'écran@fr"
                      #xsd/langString "capturas de pantalla@es"]})

(def security-contact
  "The Agent that should be contacted\n\tif security issues are found with the project."
  {:db/ident :doap/security-contact,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The Agent that should be contacted\n\tif security issues are found with the project.@en",
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label #xsd/langString "security contact@en",
   :rdfs/range :foaf/Agent})

(def security-policy
  "URL of the security policy of a project."
  {:db/ident           :doap/security-policy,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "URL of the security policy of a project.@en",
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label         #xsd/langString "security policy@en",
   :rdfs/subPropertyOf :foaf/page})

(def service-endpoint
  "The URI of a web service endpoint where software as a service may be accessed"
  {:db/ident :doap/service-endpoint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The URI of a web service endpoint where software as a service may be accessed@en",
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label #xsd/langString "service endpoint@en",
   :rdfs/range :rdfs/Resource})

(def shortdesc
  {:db/ident :doap/shortdesc,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "Descripción corta (8 o 9 palabras) en texto plano de un proyecto.@es"
    #xsd/langString
     "Short (8 or 9 words) plain text description of a project.@en"
    #xsd/langString
     "Kurzbeschreibung (8 oder 9 Wörter) eines Projekts als einfacher Text.@de"
    #xsd/langString
     "Descrição curta (com 8 ou 9 palavras) de um projeto em texto apenas.@pt"
    #xsd/langString "Krátký (8 nebo 9 slov) čistě textový popis projektu.@cs"
    #xsd/langString "Texte descriptif concis (8 ou 9 mots) d'un projet.@fr"],
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "Kurzbeschreibung@de"
                #xsd/langString "description courte@fr"
                #xsd/langString "descrição curta@pt"
                #xsd/langString "descripción corta@es"
                #xsd/langString "krátký popis@cs"
                #xsd/langString "short description@en"],
   :rdfs/range :rdfs/Literal})

(def support-forum
  "A forum or community that supports this project."
  {:db/ident         :doap/support-forum,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "A forum or community that supports this project.@en",
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #xsd/langString "supporting forum@en",
   :rdfs/range       :sioc/Container})

(def tester
  {:db/ident :doap/tester,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString "Tester nebo jiný spoluautor kontrolující kvalitu.@cs"
    #xsd/langString
     "Ein Tester oder anderer Mitarbeiter der Qualitätskontrolle.@de"
    #xsd/langString "Un testeur ou un collaborateur au contrôle qualité.@fr"
    #xsd/langString "A tester or other quality control contributor.@en"
    #xsd/langString
     "Um controlador ou outro contribuidor para o controlo de qualidade.@pt"
    #xsd/langString "Un tester u otro proveedor de control de calidad.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "testeur@fr"
                #xsd/langString "Tester@de"
                #xsd/langString "controlador@pt"
                #xsd/langString "tester@cs"
                #xsd/langString "tester@es"
                #xsd/langString "tester@en"],
   :rdfs/range :foaf/Person})

(def translator
  {:db/ident         :doap/translator,
   :rdf/type         :rdf/Property,
   :rdfs/comment     [#xsd/langString
                       "Contribuidor das traduções para o projeto.@pt"
                      #xsd/langString
                       "Proveedor de traducciones al proyecto.@es"
                      #xsd/langString
                       "Mitarbeiter an den Übersetzungen des Projektes.@de"
                      #xsd/langString
                       "Contributor of translations to the project.@en"
                      #xsd/langString
                       "Collaborateur à la traduction du projet.@fr"
                      #xsd/langString "Spoluautor překladu projektu.@cs"],
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       [#xsd/langString "traductor@es"
                      #xsd/langString "translator@en"
                      #xsd/langString "tradutor@pt"
                      #xsd/langString "Übersetzer@de"
                      #xsd/langString "traducteur@fr"
                      #xsd/langString "překladatel@cs"],
   :rdfs/range       :foaf/Person})

(def vendor
  "Vendor organization: commercial, free or otherwise"
  {:db/ident         :doap/vendor,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "Vendor organization: commercial, free or otherwise@en",
   :rdfs/domain      :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label       #xsd/langString "vendor@en",
   :rdfs/range       :foaf/Organization})

(def wiki
  {:db/ident :doap/wiki,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/langString
     "L'URL du Wiki pour la discussion collaborative sur le projet.@fr"
    #xsd/langString "URL of Wiki for collaborative discussion of project.@en"
    #xsd/langString "URL adresa wiki projektu pro společné diskuse.@cs"
    #xsd/langString
     "Wiki-URL für die kollaborative Dikussion eines Projektes.@de"
    #xsd/langString "URL da Wiki para discussão em grupo do projeto.@pt"
    #xsd/langString
     "URL del Wiki para discusión colaborativa del proyecto.@es"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy {:rdfa/uri "http://usefulinc.com/ns/doap#"},
   :rdfs/label [#xsd/langString "Wiki@de"
                #xsd/langString "wiki@pt"
                #xsd/langString "wiki@cs"
                #xsd/langString "wiki@es"
                #xsd/langString "wiki@fr"
                #xsd/langString "wiki@en"],
   :rdfs/range :sioc.types/Wiki})