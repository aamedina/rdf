(ns net.wikipunk.rdf.doap
  "http://usefulinc.com/ns/doap#"
  {:dc11/creator "Edd Wilder-James",
   :dc11/description
   ["Slovník Description of a Project (DOAP, Popis projektu), popsaný použitím W3C RDF Schema a Web Ontology Language."
    "Das Vokabular \"Description of a Project (DOAP)\", beschrieben durch W3C RDF Schema and the Web Ontology Language."
    "Le vocabulaire Description Of A Project (DOAP, Description D'Un Projet),\n\t\tdécrit en utilisant RDF Schema du W3C et OWL."
    "El vocabulario Description of a Project (DOAP, Descripción de un Proyecto), descrito usando RDF Schema de W3C\n\t\ty Web Ontology Language."
    "The Description of a Project (DOAP) vocabulary, described using W3C RDF Schema and the Web Ontology Language."
    "Vocabulário de descrição de um Projeto (DOAP - Description of a Project), descrito no esquema (schema) W3C RDF e na Web Ontology Language."],
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
  "GNU Arch source code repository. Úložiště zdrojových kódů GNU Arch. Dépôt GNU Arch du code source. Repositorio GNU Arch del código fuente. Repositório GNU Arch do código fonte. GNU Arch Quellcode-Versionierungssystem."
  {:db/ident         :doap/ArchRepository,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     ["GNU Arch source code repository."
                      "Úložiště zdrojových kódů GNU Arch."
                      "Dépôt GNU Arch du code source."
                      "Repositorio GNU Arch del código fuente."
                      "Repositório GNU Arch do código fonte."
                      "GNU Arch Quellcode-Versionierungssystem."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       ["Dépôt GNU Arch"
                      "Repositório GNU Arch"
                      "Repositorio GNU Arch"
                      "Úložiště GNU Arch"
                      "GNU Arch repository"
                      "GNU Arch repository"],
   :rdfs/subClassOf  [:doap/Repository :doap/ArchRepository :rdfs/Resource]})

(def BKRepository
  "Dépôt BitKeeper du code source. Repositório BitKeeper do código fonte. Úložiště zdrojových kódů BitKeeper. BitKeeper Quellcode-Versionierungssystem. Repositorio BitKeeper del código fuente. BitKeeper source code repository."
  {:db/ident         :doap/BKRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     ["Dépôt BitKeeper du code source."
                      "Repositório BitKeeper do código fonte."
                      "Úložiště zdrojových kódů BitKeeper."
                      "BitKeeper Quellcode-Versionierungssystem."
                      "Repositorio BitKeeper del código fuente."
                      "BitKeeper source code repository."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       ["BitKeeper Repository"
                      "BitKeeper Repository"
                      "Repositório Bitkeeper"
                      "Dépôt BitKeeper"
                      "Úložiště BitKeeper"
                      "Repositorio BitKeeper"],
   :rdfs/subClassOf  [:doap/Repository :doap/BKRepository :rdfs/Resource]})

(def BazaarBranch
  "Código fonte da ramificação Bazaar. Bazaar source code branch."
  {:db/ident         :doap/BazaarBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     ["Código fonte da ramificação Bazaar."
                      "Bazaar source code branch."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       ["Ramificação Bazaar" "Bazaar Branch"],
   :rdfs/subClassOf  [:doap/Repository :doap/BazaarBranch :rdfs/Resource]})

(def CVSRepository
  "Dépôt CVS du code source. Úložiště zdrojových kódů CVS. Repositório CVS do código fonte. CVS Quellcode-Versionierungssystem. CVS source code repository. Repositorio CVS del código fuente."
  {:db/ident         :doap/CVSRepository,
   :rdf/type         [:rdfs/Class :owl/Class],
   :rdfs/comment     ["Dépôt CVS du code source."
                      "Úložiště zdrojových kódů CVS."
                      "Repositório CVS do código fonte."
                      "CVS Quellcode-Versionierungssystem."
                      "CVS source code repository."
                      "Repositorio CVS del código fuente."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       ["CVS Repository"
                      "CVS Repository"
                      "Úložiště CVS"
                      "Dépôt CVS"
                      "Repositório CVS"
                      "Repositorio CVS"],
   :rdfs/subClassOf  [:doap/Repository :doap/CVSRepository :rdfs/Resource]})

(def DarcsRepository
  "Dépôt darcs du code source. Repositorio darcs del código fuente. Repositório darcs do código fonte. darcs source code repository."
  {:db/ident         :doap/DarcsRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     ["Dépôt darcs du code source."
                      "Repositorio darcs del código fuente."
                      "Repositório darcs do código fonte."
                      "darcs source code repository."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       ["darcs Repository"
                      "Dépôt darcs"
                      "Repositório darcs"
                      "Repositorio darcs"],
   :rdfs/subClassOf  [:doap/Repository :doap/DarcsRepository :rdfs/Resource]})

(def GitBranch
  "Código fonte da ramificação Git. Git source code branch."
  {:db/ident         :doap/GitBranch,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     ["Código fonte da ramificação Git."
                      "Git source code branch."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       ["Ramificação Git" "Git Branch"],
   :rdfs/subClassOf  [:doap/Repository :doap/GitBranch :rdfs/Resource]})

(def GitRepository
  "Repositorio Git del código fuente. Dépôt Git du code source. Úložiště zdrojových kódů Git. Repositório Git do código fonte. Git source code repository. Git Quellcode-Versionierungssystem."
  {:db/ident         :doap/GitRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     ["Repositorio Git del código fuente."
                      "Dépôt Git du code source."
                      "Úložiště zdrojových kódů Git."
                      "Repositório Git do código fonte."
                      "Git source code repository."
                      "Git Quellcode-Versionierungssystem."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       ["Dépôt Git"
                      "Git Repository"
                      "Git Repository"
                      "Úložiště Git"
                      "Repositório Git"
                      "Repositorio Git"],
   :rdfs/subClassOf  [:doap/Repository :doap/GitRepository :rdfs/Resource]})

(def HgRepository
  "Repositório Mercurial do código fonte. Mercurial source code repository."
  {:db/ident         :doap/HgRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     ["Repositório Mercurial do código fonte."
                      "Mercurial source code repository."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       ["Repositório Mercurial" "Mercurial Repository"],
   :rdfs/subClassOf  [:doap/Repository :doap/HgRepository :rdfs/Resource]})

(def Project
  "Projeto. Projekt. Un proyecto. Ein Projekt. Un projet. A project."
  {:db/ident :doap/Project,
   :rdf/type :rdfs/Class,
   :rdfs/comment ["Projeto."
                  "Projekt."
                  "Un proyecto."
                  "Ein Projekt."
                  "Un projet."
                  "A project."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["Proyecto" "Projeto" "Projet" "Project" "Projekt" "Projekt"],
   :rdfs/subClassOf [:rdfs/Resource
                     "http://xmlns.com/wordnet/1.6/Project"
                     :foaf/Project
                     :doap/Project]})

(def Repository
  "Repositório do código fonte. Source code repository. Dépôt du code source. Quellcode-Versionierungssystem. Úložiště zdrojových kódů. Repositorio del código fuente."
  {:db/ident :doap/Repository,
   :rdf/type :rdfs/Class,
   :rdfs/comment ["Repositório do código fonte."
                  "Source code repository."
                  "Dépôt du code source."
                  "Quellcode-Versionierungssystem."
                  "Úložiště zdrojových kódů."
                  "Repositorio del código fuente."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label
   ["Úložiště" "Repository" "Repository" "Repositório" "Dépôt" "Repositorio"],
   :rdfs/subClassOf [:rdfs/Resource :doap/Repository]})

(def SVNRepository
  "Subversion source code repository. Úložiště zdrojových kódů Subversion. Dépôt Subversion du code source. Repositório Subversion do código fonte. Subversion Quellcode-Versionierungssystem. Repositorio Subversion del código fuente."
  {:db/ident         :doap/SVNRepository,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     ["Subversion source code repository."
                      "Úložiště zdrojových kódů Subversion."
                      "Dépôt Subversion du code source."
                      "Repositório Subversion do código fonte."
                      "Subversion Quellcode-Versionierungssystem."
                      "Repositorio Subversion del código fuente."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       ["Dépôt Subversion"
                      "Subversion Repository"
                      "Subversion Repository"
                      "Úložiště Subversion"
                      "Repositorio Subversion"
                      "Repositório Subversion"],
   :rdfs/subClassOf  [:doap/Repository :doap/SVNRepository :rdfs/Resource]})

(def Specification
  "A especificação de aspetos, técnicas ou outros do sistema. A specification of a system's aspects, technical or otherwise."
  {:db/ident :doap/Specification,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   ["A especificação de aspetos, técnicas ou outros do sistema."
    "A specification of a system's aspects, technical or otherwise."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["Especificação" "Specification"],
   :rdfs/subClassOf [:rdfs/Resource :doap/Specification]})

(def Version
  "Información sobre la versión de un release del proyecto. Informace o uvolněné verzi projektu. Version information of a project release. Versionsinformation eines Projekt Releases. Informação sobre a versão do projeto lançado. Détails sur une version d'une release d'un projet."
  {:db/ident         :doap/Version,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     ["Información sobre la versión de un release del proyecto."
                      "Informace o uvolněné verzi projektu."
                      "Version information of a project release."
                      "Versionsinformation eines Projekt Releases."
                      "Informação sobre a versão do projeto lançado."
                      "Détails sur une version d'une release d'un projet."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label       ["Versão" "Version" "Version" "Version" "Verze" "Versión"],
   :rdfs/subClassOf  [:rdfs/Resource :doap/Version]})

(def anon-root
  "Repository für anonymen Zugriff Repositorio para acceso anónimo. Úložiště pro anonymní přístup. Dépôt pour accès anonyme. Repositório para acesso anónimo. Repository for anonymous access."
  {:db/ident           :doap/anon-root,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["Repository für anonymen Zugriff"
                        "Repositorio para acceso anónimo."
                        "Úložiště pro anonymní přístup."
                        "Dépôt pour accès anonyme."
                        "Repositório para acesso anónimo."
                        "Repository for anonymous access."],
   :rdfs/domain        :doap/Repository,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["raíz anónima"
                        "raíz anónima"
                        "anonymní kořen"
                        "anonymous root"
                        "racine anonyme"
                        "Anonymes Root"],
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :doap/anon-root})

(def audience
  "Descrição do utilizador base alvo Description of target user base"
  {:db/ident           :doap/audience,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["Descrição do utilizador base alvo"
                        "Description of target user base"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["audiência" "audience"],
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :doap/audience})

(def blog
  "URI de um blog relacionado com um projeto URI of a blog related to a project"
  {:db/ident           :doap/blog,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["URI de um blog relacionado com um projeto"
                        "URI of a blog related to a project"],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["blog" "blog"],
   :rdfs/range         [:sioc.types/Weblog :rdfs/Resource],
   :rdfs/subPropertyOf :doap/blog})

(def browse
  "Interface web do repositório. Webové rozhraní pro prohlížení úložiště. Web browser interface to repository. Interface web au dépôt. Interface web del repositorio. Web-Browser Interface für das Repository."
  {:db/ident :doap/browse,
   :rdf/type :rdf/Property,
   :rdfs/comment ["Interface web do repositório."
                  "Webové rozhraní pro prohlížení úložiště."
                  "Web browser interface to repository."
                  "Interface web au dépôt."
                  "Interface web del repositorio."
                  "Web-Browser Interface für das Repository."],
   :rdfs/domain :doap/Repository,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["browse" "navegar" "navegar" "visualiser" "prohlížeč" "browse"],
   :rdfs/subPropertyOf :doap/browse})

(def bug-database
  "Bug tracker para um projeto. Suivi des bugs pour un projet. Bug tracker for a project. Fehlerdatenbank eines Projektes. Bug tracker para un proyecto. Správa chyb projektu."
  {:db/ident           :doap/bug-database,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["Bug tracker para um projeto."
                        "Suivi des bugs pour un projet."
                        "Bug tracker for a project."
                        "Fehlerdatenbank eines Projektes."
                        "Bug tracker para un proyecto."
                        "Správa chyb projektu."],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["databáze chyb"
                        "suivi des bugs"
                        "Fehlerdatenbank"
                        "bug database"
                        "base de datos de bugs"
                        "base de dados de bugs"],
   :rdfs/subPropertyOf :doap/bug-database})

(def category
  "Kategorie projektu. Eine Kategorie eines Projektes. A category of project. Una categoría de proyecto. Uma categoría de projeto. Une catégorie de projet."
  {:db/ident :doap/category,
   :rdf/type :rdf/Property,
   :rdfs/comment ["Kategorie projektu."
                  "Eine Kategorie eines Projektes."
                  "A category of project."
                  "Una categoría de proyecto."
                  "Uma categoría de projeto."
                  "Une catégorie de projet."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label
   ["category" "categoría" "kategorie" "Kategorie" "catégorie" "categoria"],
   :rdfs/subPropertyOf :doap/category})

(def created
  "Erstellungsdatum von Irgendwas, angegeben im YYYY-MM-DD Format, z.B. 2004-04-05. Datum, kdy bylo něco vytvořeno ve formátu RRRR-MM-DD, např. 2004-04-05 Fecha en la que algo fue creado, en formato AAAA-MM-DD. e.g. 2004-04-05 Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05 Date à laquelle a été créé quelque chose, au format AAAA-MM-JJ (par ex. 2004-04-05) Data em que algo foi criado, no formato AAAA-MM-DD. e.g. 2004-04-05"
  {:db/ident :doap/created,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Erstellungsdatum von Irgendwas, angegeben im YYYY-MM-DD Format, z.B. 2004-04-05."
    "Datum, kdy bylo něco vytvořeno ve formátu RRRR-MM-DD, např. 2004-04-05"
    "Fecha en la que algo fue creado, en formato AAAA-MM-DD. e.g. 2004-04-05"
    "Date when something was created, in YYYY-MM-DD form. e.g. 2004-04-05"
    "Date à laquelle a été créé quelque chose, au format AAAA-MM-JJ (par ex. 2004-04-05)"
    "Data em que algo foi criado, no formato AAAA-MM-DD. e.g. 2004-04-05"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["created" "erstellt" "vytvořeno" "criado" "creado" "créé"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/created})

(def description
  "Čistě textový, 2 až 4 věty dlouhý popis projektu. Texte descriptif d'un projet, long de 2 à 4 phrases. Descrição de um projeto em texto apenas, com 2 a 4 frases de comprimento. Descripción en texto plano de un proyecto, de 2 a 4 enunciados de longitud. Beschreibung eines Projekts als einfacher Text mit der Länge von 2 bis 4 Sätzen. Plain text description of a project, of 2-4 sentences in length."
  {:db/ident :doap/description,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Čistě textový, 2 až 4 věty dlouhý popis projektu."
    "Texte descriptif d'un projet, long de 2 à 4 phrases."
    "Descrição de um projeto em texto apenas, com 2 a 4 frases de comprimento."
    "Descripción en texto plano de un proyecto, de 2 a 4 enunciados de longitud."
    "Beschreibung eines Projekts als einfacher Text mit der Länge von 2 bis 4 Sätzen."
    "Plain text description of a project, of 2-4 sentences in length."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["descripción"
                "popis"
                "description"
                "description"
                "descrição"
                "Beschreibung"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/description})

(def developer
  "Vývojář softwaru projektu. Programador de software para o projeto. Desarrollador de software para el proyecto. Développeur pour le projet. Developer of software for the project. Software-Entwickler für das Projekt."
  {:db/ident           :doap/developer,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["Vývojář softwaru projektu."
                        "Programador de software para o projeto."
                        "Desarrollador de software para el proyecto."
                        "Développeur pour le projet."
                        "Developer of software for the project."
                        "Software-Entwickler für das Projekt."],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["Entwickler"
                        "vývojář"
                        "développeur"
                        "desarrollador"
                        "programador"
                        "developer"],
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :doap/developer})

(def developer-forum
  "A forum or community for developers of this project."
  {:db/ident           :doap/developer-forum,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A forum or community for developers of this project.",
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         "developer forum",
   :rdfs/range         :sioc/Container,
   :rdfs/subPropertyOf :doap/developer-forum})

(def documentation
  "Aide pour l’utilisation de ce projet. Documentation of the project."
  {:db/ident           :doap/documentation,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["Aide pour l’utilisation de ce projet."
                        "Documentation of the project."],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["aide" "documentation"],
   :rdfs/subPropertyOf :doap/documentation})

(def documenter
  "Contribuidor para a documentação do projeto. Proveedor de documentación para el proyecto. Collaborateur à la documentation du projet. Spoluautor dokumentace projektu. Mitarbeiter an der Dokumentation des Projektes. Contributor of documentation to the project."
  {:db/ident           :doap/documenter,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["Contribuidor para a documentação do projeto."
                        "Proveedor de documentación para el proyecto."
                        "Collaborateur à la documentation du projet."
                        "Spoluautor dokumentace projektu."
                        "Mitarbeiter an der Dokumentation des Projektes."
                        "Contributor of documentation to the project."],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["documenter"
                        "dokumentarista"
                        "Dokumentator"
                        "escritor de ayuda"
                        "rédacteur de l'aide"
                        "documentador"],
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :doap/documenter})

(def download-mirror
  "Mirror of software download web page. Spiegel der Seite von die Projekt-Software heruntergeladen werden kann. Zrcadlo stránky pro stažení softwaru. Mirror de la página web de descarga. Miroir de la page de téléchargement du programme. Mirror da página web para fazer download."
  {:db/ident :doap/download-mirror,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Mirror of software download web page."
    "Spiegel der Seite von die Projekt-Software heruntergeladen werden kann."
    "Zrcadlo stránky pro stažení softwaru."
    "Mirror de la página web de descarga."
    "Miroir de la page de téléchargement du programme."
    "Mirror da página web para fazer download."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["zrcadlo stránky pro stažení"
                "miroir pour le téléchargement"
                "download mirror"
                "mirror para download"
                "Spiegel der Seite zum Herunterladen"
                "mirror de descarga"],
   :rdfs/subPropertyOf :doap/download-mirror})

(def download-page
  "Web-Seite von der die Projekt-Software heruntergeladen werden kann. Webová stránka, na které lze stáhnout projektový software. Web page from which the project software can be downloaded. Page web à partir de laquelle on peut télécharger le programme. Página web da qual o projeto de software pode ser descarregado. Página web de la cuál se puede bajar el software."
  {:db/ident :doap/download-page,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Web-Seite von der die Projekt-Software heruntergeladen werden kann."
    "Webová stránka, na které lze stáhnout projektový software."
    "Web page from which the project software can be downloaded."
    "Page web à partir de laquelle on peut télécharger le programme."
    "Página web da qual o projeto de software pode ser descarregado."
    "Página web de la cuál se puede bajar el software."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["stránka pro stažení"
                "página para download"
                "page de téléchargement"
                "Seite zum Herunterladen"
                "download page"
                "página de descarga"],
   :rdfs/subPropertyOf :doap/download-page})

(def file-release
  "URI para download associado com a publicação. URI adresa stažení asociované s revizí. URI of download associated with this release."
  {:db/ident           :doap/file-release,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["URI para download associado com a publicação."
                        "URI adresa stažení asociované s revizí."
                        "URI of download associated with this release."],
   :rdfs/domain        :doap/Version,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["publicação do ficheiro"
                        "soubor revize"
                        "file-release"],
   :rdfs/subPropertyOf :doap/file-release})

(def helper
  "Ajudante ou colaborador do projeto. Spoluautor projektu. Projekt-Mitarbeiter. Collaborateur au projet. Project contributor. Colaborador del proyecto."
  {:db/ident :doap/helper,
   :rdf/type :rdf/Property,
   :rdfs/comment ["Ajudante ou colaborador do projeto."
                  "Spoluautor projektu."
                  "Projekt-Mitarbeiter."
                  "Collaborateur au projet."
                  "Project contributor."
                  "Colaborador del proyecto."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label
   ["helper" "collaborateur" "colaborador" "colaborador" "Helfer" "spoluautor"],
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :doap/helper})

(def homepage
  "O URL da página de um projeto, asociada com exactamente um projeto. El URL de la página de un proyecto, asociada con exactamente un proyecto. URL of a project's homepage, associated with exactly one project. URL der Projekt-Homepage, verbunden mit genau einem Projekt. L'URL de la page web d'un projet, associée avec un unique projet. URL adresa domovské stránky projektu asociované s právě jedním projektem."
  {:db/ident :doap/homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   ["O URL da página de um projeto,\n\t\tasociada com exactamente um projeto."
    "El URL de la página de un proyecto,\n\t\tasociada con exactamente un proyecto."
    "URL of a project's homepage,\n\t\tassociated with exactly one project."
    "URL der Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt."
    "L'URL de la page web d'un projet,\n\t\tassociée avec un unique projet."
    "URL adresa domovské stránky projektu asociované s právě jedním projektem."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["page web"
                "Homepage"
                "página web"
                "página web"
                "homepage"
                "domovská stránka"],
   :rdfs/subPropertyOf [:foaf/homepage :doap/homepage]})

(def implements
  "Uma especificação que um projeto implementa. Pode ser uma padrão, API ou um nível de conformidade definida legalmente. A specification that a project implements. Could be a standard, API or legally defined level of conformance."
  {:db/ident :doap/implements,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Uma especificação que um projeto implementa. Pode ser uma padrão, API ou um nível de conformidade definida legalmente."
    "A specification that a project implements. Could be a standard, API or legally defined level of conformance."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["Especificações para implementação" "Implements specification"],
   :rdfs/range :doap/Specification,
   :rdfs/subPropertyOf :doap/implements})

(def language
  "Código de idioma BCP47 do projeto para o qual foi traduzido BCP47 language code a project has been translated into"
  {:db/ident :doap/language,
   :rdf/type :rdf/Property,
   :rdfs/comment ["Código de idioma BCP47 do projeto para o qual foi traduzido"
                  "BCP47 language code a project has been translated into"],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["idioma" "language"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/language})

(def license
  "L'URI d'une description RDF de la licence sous laquelle le programme est distribué. El URI de una descripción RDF de la licencia bajo la cuál se distribuye el software. O URI de uma descrição RDF da licença do software sob a qual é distribuída. Ex.: referência SPDX URI adresa RDF popisu licence, pod kterou je software distribuován. Die URI einer RDF-Beschreibung einer Lizenz unter der die Software herausgegeben wird. z.B. eine SPDX Referenz The URI of an RDF description of the license the software is distributed under. E.g. a SPDX reference"
  {:db/ident :doap/license,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["L'URI d'une description RDF de la licence sous laquelle le programme est distribué."
    "El URI de una descripción RDF de la licencia bajo la cuál se distribuye el software."
    "O URI de uma descrição RDF da licença do software sob a qual é distribuída. Ex.: referência SPDX"
    "URI adresa RDF popisu licence, pod kterou je software distribuován."
    "Die URI einer RDF-Beschreibung einer Lizenz unter der die Software herausgegeben wird. z.B. eine SPDX Referenz"
    "The URI of an RDF description of the license the software is distributed under. E.g. a SPDX reference"],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["Lizenz" "licence" "licence" "license" "licencia" "licença"],
   :rdfs/subPropertyOf :doap/license})

(def location
  "Lokation eines Repositorys. Location of a repository. lugar de un repositorio. Localização de um repositório. Emplacement d'un dépôt. Umístění úložiště."
  {:db/ident           :doap/location,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["Lokation eines Repositorys."
                        "Location of a repository."
                        "lugar de un repositorio."
                        "Localização de um repositório."
                        "Emplacement d'un dépôt."
                        "Umístění úložiště."],
   :rdfs/domain        :doap/Repository,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["repository location"
                        "umístění úložiště"
                        "localização do respositório"
                        "lugar del respositorio"
                        "emplacement du dépôt"
                        "Repository Lokation"],
   :rdfs/subPropertyOf :doap/location})

(def mailing-list
  "Domovská stránka nebo e–mailová adresa e–mailové diskuse. Homepage der Mailing Liste oder E-Mail Adresse. Page web de la liste de diffusion, ou adresse de courriel. Página web da lista de distribuição de e-mail ou dos endereços. Mailing list home page or email address. Página web de la lista de correo o dirección de correo."
  {:db/ident :doap/mailing-list,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Domovská stránka nebo e–mailová adresa e–mailové diskuse."
    "Homepage der Mailing Liste oder E-Mail Adresse."
    "Page web de la liste de diffusion, ou adresse de courriel."
    "Página web da lista de distribuição de e-mail ou dos endereços."
    "Mailing list home page or email address."
    "Página web de la lista de correo o dirección de correo."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["lista de correo"
                "lista de distribuição de e-mail"
                "mailing list"
                "liste de diffusion"
                "Mailing Liste"
                "e–mailová diskuse"],
   :rdfs/range :sioc.types/MailingList,
   :rdfs/subPropertyOf :doap/mailing-list})

(def maintainer
  "Správce projektu, vedoucí projektu. Développeur principal d'un projet, un meneur du projet. Hauptentwickler eines Projektes, der Projektleiter Desarrollador principal de un proyecto, un líder de proyecto. Programador principal de um projeto, um líder de projeto. Maintainer of a project, a project leader."
  {:db/ident :doap/maintainer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Správce projektu, vedoucí projektu."
    "Développeur principal d'un projet, un meneur du projet."
    "Hauptentwickler eines Projektes, der Projektleiter"
    "Desarrollador principal de un proyecto, un líder de proyecto."
    "Programador principal de um projeto, um líder de projeto."
    "Maintainer of a project, a project leader."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["Projektverantwortlicher"
                "développeur principal"
                "správce"
                "maintainer"
                "desarrollador principal"
                "programador principal"],
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :doap/maintainer})

(def module
  "Nom du module d'un dépôt Subversion, CVS, BitKeeper ou Arch. Modul-Name eines Subversion, CVS, BitKeeper oder Arch Repositorys. Jméno modulu v CVS, BitKeeper nebo Arch úložišti. Module name of a Subversion, CVS, BitKeeper or Arch repository. Nombre del módulo de un repositorio Subversion, CVS, BitKeeper o Arch. Nome do módulo de um repositório Subversion, CVS, BitKeeper ou Arch."
  {:db/ident :doap/module,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Nom du module d'un dépôt Subversion, CVS, BitKeeper ou Arch."
    "Modul-Name eines Subversion, CVS, BitKeeper oder Arch Repositorys."
    "Jméno modulu v CVS, BitKeeper nebo Arch úložišti."
    "Module name of a Subversion, CVS, BitKeeper or Arch repository."
    "Nombre del módulo de un repositorio Subversion, CVS, BitKeeper o Arch."
    "Nome do módulo de um repositório Subversion, CVS, BitKeeper ou Arch."],
   :rdfs/domain
   {:owl/unionOf [:doap/CVSRepository :doap/ArchRepository :doap/BKRepository],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["module" "module" "modul" "Modul" "módulo" "módulo"],
   :rdfs/subPropertyOf :doap/module})

(def name
  "O nome de alguma coisa. A name of something. Der Name von Irgendwas El nombre de algo. Jméno něčeho. Le nom de quelque chose."
  {:db/ident           :doap/name,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["O nome de alguma coisa."
                        "A name of something."
                        "Der Name von Irgendwas"
                        "El nombre de algo."
                        "Jméno něčeho."
                        "Le nom de quelque chose."],
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["nombre" "nom" "nome" "Name" "name" "jméno"],
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf [:rdfs/label :doap/name]})

(def old-homepage
  "URL adresa předešlé domovské stránky projektu asociované s právě jedním projektem. URL of a project's past homepage, associated with exactly one project. L'URL d'une ancienne page web d'un projet, associée avec un unique projet. O URL antigo da página de um projeto, associada com exactamente um projeto. URL der letzten Projekt-Homepage, verbunden mit genau einem Projekt. El URL de la antigua página de un proyecto, asociada con exactamente un proyecto."
  {:db/ident :doap/old-homepage,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   ["URL adresa předešlé domovské stránky projektu asociované s právě jedním projektem."
    "URL of a project's past homepage,\n\t\tassociated with exactly one project."
    "L'URL d'une ancienne page web d'un\n\t\tprojet, associée avec un unique projet."
    "O URL antigo da página de um projeto,\n\t\tassociada com exactamente um projeto."
    "URL der letzten Projekt-Homepage,\n\t\tverbunden mit genau einem Projekt."
    "El URL de la antigua página de un proyecto,\n\t\tasociada con exactamente un proyecto."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["stará domovská stránka"
                "ancienne page web"
                "Alte Homepage"
                "página web antiga"
                "old homepage"
                "página web antigua"],
   :rdfs/subPropertyOf [:foaf/homepage :doap/old-homepage]})

(def os
  "Système d'exploitation auquel est limité le projet. Omettez cette propriété si le projet n'est pas limité à un système d'exploitation. Sistema operativo a que o projeto está limitado. Omita esta propriedade se o projeto não é condicionado pelo SO usado. Sistema opertivo al cuál está limitado el proyecto. Omita esta propiedad si el proyecto no es específico de un sistema opertaivo en particular. Betriebssystem auf dem das Projekt eingesetzt werden kann. Diese Eigenschaft kann ausgelassen werden, wenn das Projekt nicht BS-spezifisch ist. Operační systém, na jehož použití je projekt limitován. Vynechejte tuto vlastnost, pokud je projekt nezávislý na operačním systému. Operating system that a project is limited to. Omit this property if the project is not OS-specific."
  {:db/ident :doap/os,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Système d'exploitation auquel est limité le projet. Omettez cette propriété si le\n\t\tprojet n'est pas limité à un système d'exploitation."
    "Sistema operativo a que o projeto está limitado. Omita esta propriedade se o projeto não é condicionado pelo SO usado."
    "Sistema opertivo al cuál está limitado el proyecto.  Omita esta propiedad si el proyecto no es específico\n\t\tde un sistema opertaivo en particular."
    "Betriebssystem auf dem das Projekt eingesetzt werden kann. Diese Eigenschaft kann ausgelassen werden, wenn das Projekt nicht BS-spezifisch ist."
    "Operační systém, na jehož použití je projekt limitován. Vynechejte tuto vlastnost, pokud je projekt nezávislý na operačním systému."
    "Operating system that a project is limited to.  Omit this property if the project is not OS-specific."],
   :rdfs/domain [:doap/Project :doap/Version],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["operační systém"
                "système d'exploitation"
                "Betriebssystem"
                "sistema operativo"
                "sistema operativo"
                "operating system"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/os})

(def platform
  "Indicador da plataforma do software (não específico a nenhum SO), ex.: Java, Firefox, ECMA CLR Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR"
  {:db/ident :doap/platform,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Indicador da plataforma do software (não específico a nenhum SO), ex.: Java, Firefox, ECMA CLR"
    "Indicator of software platform (non-OS specific), e.g. Java, Firefox, ECMA CLR"],
   :rdfs/domain [:doap/Version :doap/Project],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["plataforma" "platform"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/platform})

(def programming-language
  "Programming language a project is implemented in or intended for use with. Lenguaje de programación en el que un proyecto es implementado o con el cuál pretende usarse. Programmiersprache in der ein Projekt implementiert ist oder intendiert wird zu benutzen. Langage de programmation avec lequel un projet est implémenté, ou avec lequel il est prévu de l'utiliser. Programovací jazyk, ve kterém je projekt implementován nebo pro který je zamýšlen k použití. Linguagem de programação que o projeto usa ou é para ser utilizada."
  {:db/ident :doap/programming-language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Programming language a project is implemented in or intended for use with."
    "Lenguaje de programación en el que un proyecto es implementado o con el cuál pretende usarse."
    "Programmiersprache in der ein Projekt implementiert ist oder intendiert wird zu benutzen."
    "Langage de programmation avec lequel un projet est implémenté,\n\t\tou avec lequel il est prévu de l'utiliser."
    "Programovací jazyk, ve kterém je projekt implementován nebo pro který je zamýšlen k použití."
    "Linguagem de programação que o projeto usa ou é para ser utilizada."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["programovací jazyk"
                "langage de programmation"
                "programming language"
                "lenguaje de programación"
                "Programmiersprache"
                "linguagem de programação"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/programming-language})

(def release
  "Un release (versión) de un proyecto. Une release (révision) d'un projet. A project release. Relase (verze) projektu. A publicação de um projeto. Ein Release (Version) eines Projekts."
  {:db/ident :doap/release,
   :rdf/type :rdf/Property,
   :rdfs/comment ["Un release (versión) de un proyecto."
                  "Une release (révision) d'un projet."
                  "A project release."
                  "Relase (verze) projektu."
                  "A publicação de um projeto."
                  "Ein Release (Version) eines Projekts."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["Release" "release" "release" "release" "release" "publicação"],
   :rdfs/range :doap/Version,
   :rdfs/subPropertyOf :doap/release})

(def repository
  "Repositorio del código fuente. Úložiště zdrojových kódů. Source code repository. Repositório do código fonte. Dépôt du code source. Quellcode-Versionierungssystem."
  {:db/ident :doap/repository,
   :owl/inverseOf :doap/repositoryOf,
   :rdf/type :rdf/Property,
   :rdfs/comment ["Repositorio del código fuente."
                  "Úložiště zdrojových kódů."
                  "Source code repository."
                  "Repositório do código fonte."
                  "Dépôt du code source."
                  "Quellcode-Versionierungssystem."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label
   ["repository" "repositorio" "repositório" "dépôt" "Repository" "úložiště"],
   :rdfs/range :doap/Repository,
   :rdfs/subPropertyOf :doap/repository})

(def repositoryOf
  "The project that uses a repository."
  {:db/ident           :doap/repositoryOf,
   :owl/inverseOf      :doap/repository,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The project that uses a repository.",
   :rdfs/domain        :doap/Repository,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         "repository of",
   :rdfs/range         :doap/Project,
   :rdfs/subPropertyOf :doap/repositoryOf})

(def revision
  "Revision identifier of a software release. Indentificador de la versión de un release de software. Identificador do lançamento da revisão do software. Identifikátor zpřístupněné revize softwaru. Versionsidentifikator eines Software-Releases. Identifiant de révision d'une release du programme."
  {:db/ident :doap/revision,
   :rdf/type :rdf/Property,
   :rdfs/comment ["Revision identifier of a software release."
                  "Indentificador de la versión de un release de software."
                  "Identificador do lançamento da revisão do software."
                  "Identifikátor zpřístupněné revize softwaru."
                  "Versionsidentifikator eines Software-Releases."
                  "Identifiant de révision d'une release du programme."],
   :rdfs/domain :doap/Version,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["Version" "revision" "revisão" "révision" "versión" "verze"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/revision})

(def screenshots
  "Web page with screenshots of project. Página web con capturas de pantalla del proyecto. Page web avec des captures d'écran du projet. Página web com as capturas de ecrãn do projeto. Webová stránka projektu se snímky obrazovky. Web-Seite mit Screenshots eines Projektes."
  {:db/ident           :doap/screenshots,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["Web page with screenshots of project."
                        "Página web con capturas de pantalla del proyecto."
                        "Page web avec des captures d'écran du projet."
                        "Página web com as capturas de ecrãn do projeto."
                        "Webová stránka projektu se snímky obrazovky."
                        "Web-Seite mit Screenshots eines Projektes."],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["snímek obrazovky"
                        "capturas de ecrãs"
                        "Screenshots"
                        "screenshots"
                        "captures d'écran"
                        "capturas de pantalla"],
   :rdfs/subPropertyOf :doap/screenshots})

(def security-contact
  "The Agent that should be contacted if security issues are found with the project."
  {:db/ident :doap/security-contact,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The Agent that should be contacted\n\tif security issues are found with the project.",
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label "security contact",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :doap/security-contact})

(def security-policy
  "URL of the security policy of a project."
  {:db/ident           :doap/security-policy,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "URL of the security policy of a project.",
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         "security policy",
   :rdfs/subPropertyOf [:foaf/page :doap/security-policy]})

(def service-endpoint
  "The URI of a web service endpoint where software as a service may be accessed"
  {:db/ident :doap/service-endpoint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The URI of a web service endpoint where software as a service may be accessed",
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label "service endpoint",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :doap/service-endpoint})

(def shortdesc
  "Descripción corta (8 o 9 palabras) en texto plano de un proyecto. Short (8 or 9 words) plain text description of a project. Kurzbeschreibung (8 oder 9 Wörter) eines Projekts als einfacher Text. Descrição curta (com 8 ou 9 palavras) de um projeto em texto apenas. Krátký (8 nebo 9 slov) čistě textový popis projektu. Texte descriptif concis (8 ou 9 mots) d'un projet."
  {:db/ident :doap/shortdesc,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Descripción corta (8 o 9 palabras) en texto plano de un proyecto."
    "Short (8 or 9 words) plain text description of a project."
    "Kurzbeschreibung (8 oder 9 Wörter) eines Projekts als einfacher Text."
    "Descrição curta (com 8 ou 9 palavras) de um projeto em texto apenas."
    "Krátký (8 nebo 9 slov) čistě textový popis projektu."
    "Texte descriptif concis (8 ou 9 mots) d'un projet."],
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["Kurzbeschreibung"
                "description courte"
                "descrição curta"
                "descripción corta"
                "krátký popis"
                "short description"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :doap/shortdesc})

(def support-forum
  "A forum or community that supports this project."
  {:db/ident           :doap/support-forum,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A forum or community that supports this project.",
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         "supporting forum",
   :rdfs/range         :sioc/Container,
   :rdfs/subPropertyOf :doap/support-forum})

(def tester
  "Tester nebo jiný spoluautor kontrolující kvalitu. Ein Tester oder anderer Mitarbeiter der Qualitätskontrolle. Un testeur ou un collaborateur au contrôle qualité. A tester or other quality control contributor. Um controlador ou outro contribuidor para o controlo de qualidade. Un tester u otro proveedor de control de calidad."
  {:db/ident :doap/tester,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Tester nebo jiný spoluautor kontrolující kvalitu."
    "Ein Tester oder anderer Mitarbeiter der Qualitätskontrolle."
    "Un testeur ou un collaborateur au contrôle qualité."
    "A tester or other quality control contributor."
    "Um controlador ou outro contribuidor para o controlo de qualidade."
    "Un tester u otro proveedor de control de calidad."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["testeur" "Tester" "controlador" "tester" "tester" "tester"],
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :doap/tester})

(def translator
  "Contribuidor das traduções para o projeto. Proveedor de traducciones al proyecto. Mitarbeiter an den Übersetzungen des Projektes. Contributor of translations to the project. Collaborateur à la traduction du projet. Spoluautor překladu projektu."
  {:db/ident           :doap/translator,
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["Contribuidor das traduções para o projeto."
                        "Proveedor de traducciones al proyecto."
                        "Mitarbeiter an den Übersetzungen des Projektes."
                        "Contributor of translations to the project."
                        "Collaborateur à la traduction du projet."
                        "Spoluautor překladu projektu."],
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         ["traductor"
                        "translator"
                        "tradutor"
                        "Übersetzer"
                        "traducteur"
                        "překladatel"],
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :doap/translator})

(def vendor
  "Vendor organization: commercial, free or otherwise"
  {:db/ident           :doap/vendor,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Vendor organization: commercial, free or otherwise",
   :rdfs/domain        :doap/Project,
   :rdfs/isDefinedBy   "http://usefulinc.com/ns/doap#",
   :rdfs/label         "vendor",
   :rdfs/range         :foaf/Organization,
   :rdfs/subPropertyOf :doap/vendor})

(def wiki
  "L'URL du Wiki pour la discussion collaborative sur le projet. URL of Wiki for collaborative discussion of project. URL adresa wiki projektu pro společné diskuse. Wiki-URL für die kollaborative Dikussion eines Projektes. URL da Wiki para discussão em grupo do projeto. URL del Wiki para discusión colaborativa del proyecto."
  {:db/ident :doap/wiki,
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["L'URL du Wiki pour la discussion collaborative sur le projet."
    "URL of Wiki for collaborative discussion of project."
    "URL adresa wiki projektu pro společné diskuse."
    "Wiki-URL für die kollaborative Dikussion eines Projektes."
    "URL da Wiki para discussão em grupo do projeto."
    "URL del Wiki para discusión colaborativa del proyecto."],
   :rdfs/domain :doap/Project,
   :rdfs/isDefinedBy "http://usefulinc.com/ns/doap#",
   :rdfs/label ["Wiki" "wiki" "wiki" "wiki" "wiki" "wiki"],
   :rdfs/range :sioc.types/Wiki,
   :rdfs/subPropertyOf :doap/wiki})

(def ^{:private true} Project
  {:db/ident        :foaf/Project,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :foaf/Project})

(def ^{:private true} homepage
  {:db/ident :foaf/homepage,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :foaf/homepage})

(def ^{:private true} page
  {:db/ident :foaf/page,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :foaf/page})