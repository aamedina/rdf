(ns net.wikipunk.rdf.dcat
  "DCAT is an RDF vocabulary designed to facilitate interoperability between data catalogs published on the Web. By using DCAT to describe datasets in data catalogs, publishers increase discoverability and enable applications easily to consume metadata from multiple catalogs. It further enables decentralized publishing of catalogs and facilitates federated dataset search across sites. Aggregated DCAT metadata can serve as a manifest file to facilitate digital preservation. DCAT is defined at http://www.w3.org/TR/vocab-dcat/. Any variance between that normative document and this schema is an error in this schema."
  {:dcterms/contributor
   #{{:foaf/homepage {:xsd/anyURI "https://jakub.klímek.com/"},
      :foaf/name     "Jakub Klímek",
      :rdfs/seeAlso  {:xsd/anyURI "https://jakub.klímek.com/#me"}}
     {:foaf/homepage {:xsd/anyURI "http://makxdekkers.com/"},
      :foaf/name     "Makx Dekkers",
      :rdfs/seeAlso  {:xsd/anyURI "http://makxdekkers.com/makxdekkers.rdf#me"}}
     {:foaf/name "Richard Cyganiak"} {:foaf/name "Boris Villazón-Terrazas"}
     {:foaf/name "David Browning",
      :schema/affiliation {:foaf/homepage {:xsd/anyURI
                                           "http://www.refinitiv.com"},
                           :foaf/name     "Refinitiv"}}
     {:foaf/name "Marios Meimaris"}
     {:foaf/name "Simon J D Cox",
      :foaf/workInfoHomepage {:xsd/anyURI "http://people.csiro.au/Simon-Cox"},
      :rdf/type :foaf/Person,
      :rdfs/seeAlso {:xsd/anyURI "https://orcid.org/0000-0002-3884-3420"},
      :schema/affiliation
      {:foaf/homepage {:xsd/anyURI "https://csiro.au"},
       :foaf/name
       "Commonwealth Scientific and Industrial Research Organisation"}}
     {:foaf/name "Rufus Pollock",
      :schema/affiliation {:foaf/homepage {:xsd/anyURI "http://okfn.org"},
                           :foaf/name     "Open Knowledge Foundation"}}
     {:foaf/homepage      {:xsd/anyURI "https://agbeltran.github.io"},
      :foaf/name          "Alejandra Gonzalez-Beltran",
      :rdfs/seeAlso       {:xsd/anyURI "https://orcid.org/0000-0003-3499-8262"},
      :schema/affiliation {:foaf/homepage {:xsd/anyURI "http://stfc.ac.uk"},
                           :foaf/name
                           "Science and Technology Facilities Council, UK"}}
     {:foaf/name "Vassilios Peristeras",
      :schema/affiliation {:foaf/homepage
                           {:xsd/anyURI "http://ec.europa.eu/dgs/informatics/"},
                           :foaf/name "European Commission, DG DIGIT"}}
     {:foaf/homepage {:xsd/anyURI "http://www.andrea-perego.name/foaf/#me"},
      :foaf/name     "Andrea Perego",
      :rdfs/seeAlso  {:xsd/anyURI "https://orcid.org/0000-0001-9300-2694"}}
     {:foaf/homepage      {:xsd/anyURI "http://www.w3.org/People/all#phila"},
      :foaf/name          "Phil Archer",
      :rdfs/seeAlso       {:xsd/anyURI "http://philarcher.org/foaf.rdf#me"},
      :schema/affiliation {:xsd/anyURI "http://www.w3.org/data#W3C"}}
     {:foaf/homepage {:xsd/anyURI "http://www.asahi-net.or.jp/~ax2s-kmtn/"},
      :foaf/name     "Shuji Kamitsuna"}
     {:foaf/homepage
      #{{:xsd/anyURI "https://w3id.org/people/ralbertoni/"}
        {:xsd/anyURI
         "http://www.imati.cnr.it/index.php/people/8-curricula/178-riccardo-albertoni"}},
      :foaf/name "Riccardo Albertoni",
      :rdfs/seeAlso {:xsd/anyURI "https://orcid.org/0000-0001-5648-2713"}}
     {:foaf/name "Martin Alvarez-Espinar"}
     {:foaf/name    "Ghislain Auguste Atemezing",
      :rdfs/seeAlso {:xsd/anyURI
                     "http://www.eurecom.fr/~atemezin/gatemezing-foaf.rdf"}}},
   :dcterms/creator #{{:foaf/name "John Erickson"}
                      {:foaf/name    "Fadi Maali",
                       :rdfs/seeAlso {:xsd/anyURI
                                      "http://fadmaa.me/foaf.ttl"}}},
   :dcterms/license {:xsd/anyURI
                     "https://creativecommons.org/licenses/by/4.0/"},
   :dcterms/modified
   #{#inst "2017-12-19T00:00:00.000-00:00" #inst "2013-09-20T00:00:00.000-00:00"
     #inst "2013-11-28T00:00:00.000-00:00" #inst "2012-04-24T00:00:00.000-00:00"
     #inst "2020-11-30T00:00:00.000-00:00" "2019"
     #inst "2021-09-14T00:00:00.000-00:00"},
   :foaf/maker {:foaf/homepage {:xsd/anyURI "http://www.w3.org/2011/gld/"},
                :foaf/name     "Government Linked Data WG"},
   :owl/imports #{{:xsd/anyURI "http://www.w3.org/ns/prov-o#"}
                  {:xsd/anyURI "http://purl.org/dc/terms/"}
                  {:xsd/anyURI "http://www.w3.org/2004/02/skos/core"}},
   :owl/versionInfo
   #{{:rdf/language "es",
      :rdf/value
      "Esta es una copia del vocabulario DCAT v2.0 disponible en https://www.w3.org/ns/dcat.ttl"}
     {:rdf/language "en",
      :rdf/value
      "This is an updated copy of v2.0 of the DCAT vocabulary, taken from https://www.w3.org/ns/dcat.ttl"}
     {:rdf/language "da",
      :rdf/value
      "Dette er en opdateret kopi af DCAT v. 2.0 som er tilgænglig på https://www.w3.org/ns/dcat.ttl"}
     {:rdf/language "en",
      :rdf/value
      "Questa è una copia aggiornata del vocabolario DCAT v2.0 disponibile in https://www.w3.org/ns/dcat.ttl"}
     {:rdf/language "cs",
      :rdf/value
      "Toto je aktualizovaná kopie slovníku DCAT verze 2.0, převzatá z https://www.w3.org/ns/dcat.ttl"}},
   :rdf/ns-prefix-map {"dcat"     "http://www.w3.org/ns/dcat#",
                       "dcmitype" "http://purl.org/dc/dcmitype/",
                       "dcterms"  "http://purl.org/dc/terms/",
                       "foaf"     "http://xmlns.com/foaf/0.1/",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "prov"     "http://www.w3.org/ns/prov#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "schema"   "http://schema.org/",
                       "skos"     "http://www.w3.org/2004/02/skos/core#",
                       "vcard"    "http://www.w3.org/2006/vcard/ns#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dcat",
   :rdfa/uri "http://www.w3.org/ns/dcat#",
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "DCAT is an RDF vocabulary designed to facilitate interoperability between data catalogs published on the Web. By using DCAT to describe datasets in data catalogs, publishers increase discoverability and enable applications easily to consume metadata from multiple catalogs. It further enables decentralized publishing of catalogs and facilitates federated dataset search across sites. Aggregated DCAT metadata can serve as a manifest file to facilitate digital preservation. DCAT is defined at http://www.w3.org/TR/vocab-dcat/. Any variance between that normative document and this schema is an error in this schema."}
     {:rdf/language "fr",
      :rdf/value
      "DCAT est un vocabulaire développé pour faciliter l'interopérabilité entre les jeux de données publiées sur le Web. En utilisant DCAT pour décrire les jeux de données dans les catalogues de données, les fournisseurs de données augmentent leur découverte et permettent que les applications facilement les métadonnées de plusieurs catalogues. Il permet en plus la publication décentralisée des catalogues et facilitent la recherche fédérée des données entre plusieurs sites. Les métadonnées DCAT aggrégées peuvent servir comme un manifeste pour faciliter la préservation digitale des ressources. DCAT est définie à l'adresse http://www.w3.org/TR/vocab-dcat/. Une quelconque version de ce document normatif et ce vocabulaire est une erreur dans ce vocabulaire."}
     {:rdf/language "it",
      :rdf/value
      "DCAT è un vocabolario RDF progettato per facilitare l'interoperabilità tra i cataloghi di dati pubblicati nel Web. Utilizzando DCAT per descrivere i dataset nei cataloghi di dati, i fornitori migliorano la capacità di individuazione dei dati e abilitano le  applicazioni al consumo di dati provenienti da cataloghi differenti. DCAT permette di decentralizzare la pubblicazione di cataloghi e facilita la ricerca federata dei dataset. L'aggregazione dei metadati federati può fungere da file manifesto per facilitare la conservazione digitale. DCAT è definito all'indirizzo http://www.w3.org/TR/vocab-dcat/. Qualsiasi scostamento tra tale definizione normativa e questo schema è da considerarsi un errore di questo schema."}
     {:rdf/language "ar",
      :rdf/value
      "هي أنطولوجية تسهل تبادل البيانات بين مختلف الفهارس على الوب. استخدام هذه الأنطولوجية يساعد على اكتشاف قوائم  البيانات المنشورة على الوب و يمكن التطبيقات المختلفة من الاستفادة أتوماتيكيا من البيانات المتاحة من مختلف الفهارس."}
     {:rdf/language "es",
      :rdf/value
      "DCAT es un vocabulario RDF diseñado para facilitar la interoperabilidad entre catálogos de datos publicados en la Web. Utilizando DCAT para describir datos disponibles en catálogos se aumenta la posibilidad de que sean descubiertos y se permite que las aplicaciones consuman fácilmente los metadatos de varios catálogos."}
     {:rdf/language "cs",
      :rdf/value
      "DCAT je RDF slovník navržený pro zprostředkování interoperability mezi datovými katalogy publikovanými na Webu. Poskytovatelé dat používáním slovníku DCAT pro popis datových sad v datových katalozích zvyšují jejich dohledatelnost a umožňují aplikacím konzumovat metadata z více katalogů. Dále je umožňena decentralizovaná publikace katalogů a federované dotazování na datové sady napříč katalogy. Agregovaná DCAT metadata mohou také sloužit jako průvodka umožňující digitální uchování informace. DCAT je definován na http://www.w3.org/TR/vocab-dcat/. Jakýkoliv nesoulad mezi odkazovaným dokumentem a tímto schématem je chybou v tomto schématu."}
     {:rdf/language "el",
      :rdf/value
      "Το DCAT είναι ένα RDF λεξιλόγιο που σχεδιάσθηκε για να κάνει εφικτή τη διαλειτουργικότητα μεταξύ καταλόγων δεδομένων στον Παγκόσμιο Ιστό. Χρησιμοποιώντας το DCAT για την περιγραφή συνόλων δεδομένων, οι εκδότες αυτών αυξάνουν την ανακαλυψιμότητα και επιτρέπουν στις εφαρμογές την εύκολη κατανάλωση μεταδεδομένων από πολλαπλούς καταλόγους. Επιπλέον, δίνει τη δυνατότητα για αποκεντρωμένη έκδοση και διάθεση καταλόγων και επιτρέπει δυνατότητες ενοποιημένης αναζήτησης μεταξύ διαφορετικών πηγών. Συγκεντρωτικά μεταδεδομένα που έχουν περιγραφεί με το DCAT μπορούν να χρησιμοποιηθούν σαν ένα δηλωτικό αρχείο (manifest file) ώστε να διευκολύνουν την ψηφιακή συντήρηση."}
     {:rdf/language "ja",
      :rdf/value
      "DCATは、ウェブ上で公開されたデータ・カタログ間の相互運用性の促進を目的とするRDFの語彙です。このドキュメントでは、その利用のために、スキーマを定義し、例を提供します。データ・カタログ内のデータセットを記述するためにDCATを用いると、公開者が、発見可能性を増加させ、アプリケーションが複数のカタログのメタデータを容易に利用できるようになります。さらに、カタログの分散公開を可能にし、複数のサイトにまたがるデータセットの統合検索を促進します。集約されたDCATメタデータは、ディジタル保存を促進するためのマニフェスト・ファイルとして使用できます。"}
     {:rdf/language "da",
      :rdf/value
      "DCAT er et RDF-vokabular som har til formål at understøtte interoperabilitet mellem datakataloger udgivet på nettet. Ved at anvende DCAT til at beskrive datasæt i datakataloger, kan udgivere øge findbarhed og gøre det gøre det lettere for applikationer at anvende metadata fra forskellige kataloger. Derudover understøttes decentraliseret udstilling af kataloger og fødererede datasætsøgninger på tværs af websider. Aggregerede DCAT-metadata kan fungere som fortegnelsesfiler der kan understøtte digital bevaring. DCAT er defineret på http://www.w3.org/TR/vocab-dcat/. Enhver forskel mellem det normative dokument og dette schema er en fejl i dette schema."}},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "ja",
                  :rdf/value    "データ・カタログ語彙（DCAT）"}
                 {:rdf/language "fr",
                  :rdf/value    "Le vocabulaire des jeux de données"}
                 {:rdf/language "da",
                  :rdf/value    "Datakatalogvokabular"}
                 {:rdf/language "es",
                  :rdf/value    "El vocabulario de catálogo de datos"}
                 {:rdf/language "it",
                  :rdf/value    "Il vocabolario del catalogo dei dati"}
                 {:rdf/language "cs",
                  :rdf/value    "Slovník pro datové katalogy"}
                 {:rdf/language "en",
                  :rdf/value    "The data catalog vocabulary"}
                 {:rdf/language "ar",
                  :rdf/value    "أنطولوجية فهارس قوائم البيانات"}
                 {:rdf/language "el",
                  :rdf/value    "Το λεξιλόγιο των καταλόγων δεδομένων"}},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "English language definitions updated in this revision in line with ED. Multilingual text unevenly updated."},
   :xsd/anyURI "http://www.w3.org/ns/dcat"}
  (:refer-clojure :exclude [keyword]))

(def Catalog
  {:db/ident :dcat/Catalog,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A curated collection of metadata about resources (e.g., datasets and data services in the context of a data catalog)."}
     {:rdf/language "cs",
      :rdf/value "Řízená kolekce metadat o datových sadách a datových službách"}
     {:rdf/language "el",
      :rdf/value "Μια επιμελημένη συλλογή μεταδεδομένων περί συνόλων δεδομένων"}
     {:rdf/language "it",
      :rdf/value
      "Una raccolta curata di metadati sulle risorse (ad es. sui dataset e relativi servizi nel contesto di cataloghi di dati)."}
     {:rdf/language "ar",
      :rdf/value    "مجموعة من توصيفات قوائم البيانات"}
     {:rdf/language "es",
      :rdf/value
      "Una colección curada de metadatos sobre recursos (por ejemplo, conjuntos de datos y servicios de datos en el contexto de un catálogo de datos)."}
     {:rdf/language "da",
      :rdf/value
      "En udvalgt og arrangeret samling af metadata om ressourcer (fx datasæt og datatjenester i kontekst af et datakatalog). "}
     {:rdf/language "ja",
      :rdf/value    "データ・カタログは、データセットに関するキュレートされたメタデータの集合です。"}
     {:rdf/language "fr",
      :rdf/value
      "Une collection élaborée de métadonnées sur les jeux de données"}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "cs",
                  :rdf/value    "Katalog"}
                 {:rdf/language "en",
                  :rdf/value    "Catalog"}
                 {:rdf/language "fr",
                  :rdf/value    "Catalogue"}
                 {:rdf/language "ja",
                  :rdf/value    "カタログ"}
                 {:rdf/language "da",
                  :rdf/value    "Katalog"}
                 {:rdf/language "es",
                  :rdf/value    "Catálogo"}
                 {:rdf/language "el",
                  :rdf/value    "Κατάλογος"}
                 {:rdf/language "ar",
                  :rdf/value    "فهرس قوائم البيانات"}
                 {:rdf/language "it",
                  :rdf/value    "Catalogo"}},
   :rdfs/subClassOf :dcat/Dataset,
   :skos/definition
   #{{:rdf/language "en",
      :rdf/value
      "A curated collection of metadata about resources (e.g., datasets and data services in the context of a data catalog)."}
     {:rdf/language "it",
      :rdf/value
      "Una raccolta curata di metadati sulle risorse (ad es. sui dataset e relativi servizi nel contesto di cataloghi di dati)."}
     {:rdf/language "fr",
      :rdf/value
      "Une collection élaborée de métadonnées sur les jeux de données."}
     {:rdf/language "cs",
      :rdf/value
      "Řízená kolekce metadat o datových sadách a datových službách."}
     {:rdf/language "ar",
      :rdf/value    "مجموعة من توصيفات قوائم البيانات"}
     {:rdf/language "es",
      :rdf/value
      "Una colección curada de metadatos sobre recursos (por ejemplo, conjuntos de datos y servicios de datos en el contexto de un catálogo de datos)."}
     {:rdf/language "da",
      :rdf/value
      "En samling af metadata om ressourcer (fx datasæt og datatjenester i kontekst af et datakatalog)."}
     {:rdf/language "el",
      :rdf/value
      "Μια επιμελημένη συλλογή μεταδεδομένων περί συνόλων δεδομένων."}
     {:rdf/language "ja",
      :rdf/value    "データ・カタログは、データセットに関するキュレートされたメタデータの集合です。"}},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "English, Italian, Spanish definitions updated in this revision. Multilingual text not yet updated."},
   :skos/scopeNote
   #{{:rdf/language "ja",
      :rdf/value    "通常、ウェブ・ベースのデータ・カタログは、このクラスの1つのインスタンスとして表わされます。"}
     {:rdf/language "es",
      :rdf/value
      "Normalmente, un catálogo de datos disponible en la web se representa como una única instancia de esta clase."}
     {:rdf/language "cs",
      :rdf/value
      "Webový datový katalog je typicky reprezentován jako jedna instance této třídy."}
     {:rdf/language "it",
      :rdf/value
      "Normalmente, un catalogo di dati nel web viene rappresentato come una singola istanza di questa classe."}
     {:rdf/language "da",
      :rdf/value
      "Et webbaseret datakatalog repræsenteres typisk ved en enkelt instans af denne klasse."}
     {:rdf/language "en",
      :rdf/value
      "A web-based data catalog is typically represented as a single instance of this class."}
     {:rdf/language "el",
      :rdf/value
      "Συνήθως, ένας κατάλογος δεδομένων στον Παγκόσμιο Ιστό αναπαρίσταται ως ένα στιγμιότυπο αυτής της κλάσης."}}})

(def CatalogRecord
  {:db/ident :dcat/CatalogRecord,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   #{{:rdf/language "it",
      :rdf/value
      "Un record in un catalogo di dati che descrive un singolo dataset o servizio di dati."}
     {:rdf/language "da",
      :rdf/value
      "En post i et datakatalog der beskriver registreringen af et enkelt datasæt eller en datatjeneste."}
     {:rdf/language "cs",
      :rdf/value
      "Záznam v datovém katalogu popisující jednu datovou sadu či datovou službu."}
     {:rdf/language "ja",
      :rdf/value    "1つのデータセットを記述したデータ・カタログ内のレコード。"}
     {:rdf/language "el",
      :rdf/value
      "Μία καταγραφή ενός καταλόγου, η οποία περιγράφει ένα συγκεκριμένο σύνολο δεδομένων."}
     {:rdf/language "fr",
      :rdf/value
      "Un registre du catalogue ou une entrée du catalogue, décrivant un seul jeu de données."}
     {:rdf/language "es",
      :rdf/value
      "Un registro en un catálogo de datos que describe un solo conjunto de datos o un servicio de datos."}
     {:rdf/language "en",
      :rdf/value
      "A record in a data catalog, describing the registration of a single dataset or data service."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "Registro del catálogo"}
                 {:rdf/language "cs",
                  :rdf/value    "Katalogizační záznam"}
                 {:rdf/language "ja",
                  :rdf/value    "カタログ・レコード"}
                 {:rdf/language "fr",
                  :rdf/value    "Registre du catalogue"}
                 {:rdf/language "el",
                  :rdf/value    "Καταγραφή καταλόγου"}
                 {:rdf/language "ar",
                  :rdf/value    "سجل"}
                 {:rdf/language "it",
                  :rdf/value    "Record di catalogo"}
                 {:rdf/language "da",
                  :rdf/value    "Katalogpost"}
                 {:rdf/language "en",
                  :rdf/value    "Catalog Record"}},
   :rdfs/subClassOf #{{:owl/allValuesFrom :dcat/Resource,
                       :owl/onProperty    :foaf/primaryTopic,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :foaf/primaryTopic,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   #{{:rdf/language "it",
      :rdf/value
      "Un record in un catalogo di dati che descrive un singolo dataset o servizio di dati."}
     {:rdf/language "da",
      :rdf/value
      "En post i et datakatalog der beskriver registreringen af et enkelt datasæt eller en datatjeneste."}
     {:rdf/language "cs",
      :rdf/value
      "Záznam v datovém katalogu popisující jednu datovou sadu či datovou službu."}
     {:rdf/language "ja",
      :rdf/value    "1つのデータセットを記述したデータ・カタログ内のレコード。"}
     {:rdf/language "el",
      :rdf/value
      "Μία καταγραφή ενός καταλόγου, η οποία περιγράφει ένα συγκεκριμένο σύνολο δεδομένων."}
     {:rdf/language "fr",
      :rdf/value
      "Un registre du catalogue ou une entrée du catalogue, décrivant un seul jeu de données."}
     {:rdf/language "es",
      :rdf/value
      "Un registro en un catálogo de datos que describe un solo conjunto de datos o un servicio de datos."}
     {:rdf/language "en",
      :rdf/value
      "A record in a data catalog, describing the registration of a single dataset or data service."}},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "English definition updated in this revision. Multilingual text not yet updated except the Spanish one and the Czech one and Italian one."},
   :skos/scopeNote
   #{{:rdf/language "it",
      :rdf/value
      "Questa classe è opzionale e non tutti i cataloghi la utilizzeranno. Esiste per cataloghi in cui si opera una distinzione tra i metadati relativi al dataset ed i metadati relativi alla gestione del dataset nel catalogo. Ad esempio, la  proprietà per indicare la data di pubblicazione del dataset rifletterà la data in cui l'informazione è stata originariamente messa a disposizione dalla casa editrice, mentre la data di pubblicazione per il record nel catalogo rifletterà la data in cui il dataset è stato aggiunto al catalogo. Nei casi dove solo quest'ultima sia nota, si utilizzerà esclusivamente la data di  pubblicazione relativa al record del catalogo. Si noti che l'Ontologia W3C PROV permette di descrivere ulteriori informazioni sulla provenienza, quali i dettagli del processo, la procedura e l'agente coinvolto in una particolare modifica di un dataset."}
     {:rdf/language "cs",
      :rdf/value
      "Tato třída je volitelná a ne všechny katalogy ji využijí. Existuje pro katalogy, ve kterých se rozlišují metadata datové sady či datové služby a metadata o záznamu o datové sadě či datové službě v katalogu. Například datum publikace datové sady odráží datum, kdy byla datová sada původně zveřejněna poskytovatelem dat, zatímco datum publikace katalogizačního záznamu je datum zanesení datové sady do katalogu. V případech kdy se obě data liší, nebo je známo jen to druhé, by mělo být specifikováno jen datum publikace katalogizačního záznamu. Všimněte si, že ontologie W3C PROV umožňuje popsat další informace o původu jako například podrobnosti o procesu konkrétní změny datové sady a jeho účastnících."}
     {:rdf/language "el",
      :rdf/value
      "Αυτή η κλάση είναι προαιρετική και δεν χρησιμοποιείται από όλους τους καταλόγους. Υπάρχει για τις περιπτώσεις καταλόγων όπου γίνεται διαχωρισμός μεταξύ των μεταδεδομένων για το σύνολο των δεδομένων και των μεταδεδομένων για την καταγραφή του συνόλου δεδομένων εντός του καταλόγου. Για παράδειγμα, η ιδιότητα της ημερομηνίας δημοσίευσης του συνόλου δεδομένων δείχνει την ημερομηνία κατά την οποία οι πληροφορίες έγιναν διαθέσιμες από τον φορέα δημοσίευσης, ενώ η ημερομηνία δημοσίευσης της καταγραφής του καταλόγου δείχνει την ημερομηνία που το σύνολο δεδομένων προστέθηκε στον κατάλογο. Σε περιπτώσεις που οι δύο ημερομηνίες διαφέρουν, ή που μόνο η τελευταία είναι γνωστή, η ημερομηνία δημοσίευσης θα πρέπει να δίνεται για την καταγραφή του καταλόγου. Να σημειωθεί πως η οντολογία W3C PROV επιτρέπει την περιγραφή επιπλέον πληροφοριών ιστορικού όπως λεπτομέρειες για τη διαδικασία και τον δράστη που εμπλέκονται σε μία συγκεκριμένη αλλαγή εντός του συνόλου δεδομένων."}
     {:rdf/language "ja",
      :rdf/value
      "このクラスはオプションで、すべてのカタログがそれを用いるとは限りません。これは、データセットに関するメタデータとカタログ内のデータセットのエントリーに関するメタデータとで区別が行われるカタログのために存在しています。例えば、データセットの公開日プロパティーは、公開機関が情報を最初に利用可能とした日付を示しますが、カタログ・レコードの公開日は、データセットがカタログに追加された日付です。両方の日付が異っていたり、後者だけが分かっている場合は、カタログ・レコードに対してのみ公開日を指定すべきです。W3CのPROVオントロジー[prov-o]を用いれば、データセットに対する特定の変更に関連するプロセスやエージェントの詳細などの、さらに詳しい来歴情報の記述が可能となることに注意してください。"}
     {:rdf/language "en",
      :rdf/value
      "This class is optional and not all catalogs will use it. It exists for catalogs where a distinction is made between metadata about a dataset or data service and metadata about the entry for the dataset or data service in the catalog. For example, the publication date property of the dataset reflects the date when the information was originally made available by the publishing agency, while the publication date of the catalog record is the date when the dataset was added to the catalog. In cases where both dates differ, or where only the latter is known, the publication date should only be specified for the catalog record. Notice that the W3C PROV Ontology allows describing further provenance information such as the details of the process and the agent involved in a particular change to a dataset."}
     {:rdf/language "es",
      :rdf/value
      "Esta clase es opcional y no todos los catálogos la utilizarán. Esta clase existe para catálogos que hacen una distinción entre los metadatos acerca de un conjunto de datos o un servicio de datos y los metadatos acerca de una entrada en ese conjunto de datos en el catálogo. Por ejemplo, la propiedad sobre la fecha de la publicación de los datos refleja la fecha en que la información fue originalmente publicada, mientras que la fecha de publicación del registro del catálogo es la fecha en que los datos se agregaron al mismo. En caso en que ambas fechas fueran diferentes, o en que sólo la fecha de publicación del registro del catálogo estuviera disponible, sólo debe especificarse en el registro del catálogo. Tengan en cuenta que la ontología PROV de W3C permite describir otra información sobre la proveniencia de los datos, como por ejemplo detalles del proceso y de los agentes involucrados en algún cambio específico a los datos."}
     {:rdf/language "fr",
      :rdf/value
      "C'est une classe facultative et tous les catalogues ne l'utiliseront pas. Cette classe existe pour les catalogues\tayant une distinction entre les métadonnées sur le jeu de données et les métadonnées sur une entrée du jeu de données dans le catalogue."}
     {:rdf/language "da",
      :rdf/value
      "Denne klasse er valgfri og ikke alle kataloger vil anvende denne klasse. Den kan anvendes i de kataloger hvor der skelnes mellem metadata om datasættet eller datatjenesten og metadata om selve posten til registreringen af datasættet eller datatjenesten i kataloget. Udgivelsesdatoen for datasættet afspejler for eksempel den dato hvor informationerne oprindeligt blev gjort tilgængelige af udgiveren, hvorimod udgivelsesdatoen for katalogposten er den dato hvor datasættet blev føjet til kataloget. I de tilfælde hvor de to datoer er forskellige eller hvor blot sidstnævnte er kendt, bør udgivelsesdatoen kun angives for katalogposten. Bemærk at W3Cs PROV ontologi gør til muligt at tilføje yderligere proveniensoplysninger eksempelvis om processen eller aktøren involveret i en given ændring af datasættet."}}})

(def DataService
  {:db/ident :dcat/DataService,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "it",
      :rdf/value
      "Un sito o end-point che fornisce operazioni relative alla scoperta, all'accesso o all'elaborazione di funzioni su dati o risorse correlate."}
     {:rdf/language "en",
      :rdf/value
      "A site or end-point providing operations related to the discovery of, access to, or processing functions on, data or related resources."}
     {:rdf/language "cs",
      :rdf/value
      "Umístění či přístupový bod poskytující operace související s hledáním, přistupem k, či výkonem funkcí na datech či souvisejících zdrojích."}
     {:rdf/language "es",
      :rdf/value
      "Un sitio o end-point que provee operaciones relacionadas a funciones de descubrimiento, acceso, o procesamiento de datos o recursos relacionados."}
     {:rdf/language "da",
      :rdf/value
      "Et websted eller endpoint der udstiller operationer relateret til opdagelse af, adgang til eller behandlende funktioner på data eller relaterede ressourcer."}},
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "Servizio di dati"}
                 {:rdf/language "en",
                  :rdf/value    "Data service"}
                 {:rdf/language "es",
                  :rdf/value    "Servicio de datos"}
                 {:rdf/language "da",
                  :rdf/value    "Datatjeneste"}},
   :rdfs/subClassOf #{:dcat/Resource :dcmitype/Service},
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "Dataservice"},
   :skos/changeNote #{{:rdf/language "en",
                       :rdf/value    "New class added in DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva clase añadida en DCAT 2.0."}
                      {:rdf/language "it",
                       :rdf/value    "Nuova classe aggiunta in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value    "Nová třída přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "da",
                       :rdf/value    "Ny klasse tilføjet i DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "it",
      :rdf/value
      "Un sito o end-point che fornisce operazioni relative alla scoperta, all'accesso o all'elaborazione di funzioni su dati o risorse correlate."}
     {:rdf/language "en",
      :rdf/value
      "A site or end-point providing operations related to the discovery of, access to, or processing functions on, data or related resources."}
     {:rdf/language "da",
      :rdf/value
      "Et site eller endpoint der udstiller operationer relateret til opdagelse af, adgang til eller behandlende funktioner på data eller relaterede ressourcer."}
     {:rdf/language "cs",
      :rdf/value
      "Umístění či přístupový bod poskytující operace související s hledáním, přistupem k, či výkonem funkcí na datech či souvisejících zdrojích."}
     {:rdf/language "es",
      :rdf/value
      "Un sitio o end-point que provee operaciones relacionadas a funciones de descubrimiento, acceso, o procesamiento de datos o recursos relacionados."}},
   :skos/scopeNote
   #{{:rdf/language "en",
      :rdf/value
      "If a dcat:DataService is bound to one or more specified Datasets, they are indicated by the dcat:servesDataset property."}
     {:rdf/language "en",
      :rdf/value
      "The kind of service can be indicated using the dct:type property. Its value may be taken from a controlled vocabulary such as the INSPIRE spatial data service type vocabulary."}
     {:rdf/language "da",
      :rdf/value
      "Hvis en dcat:DataService er bundet til en eller flere specifikke datasæt kan dette indikeres ved hjælp af egenskaben dcat:servesDataset. "}
     {:rdf/language "cs",
      :rdf/value
      "Druh služby může být indikován vlastností dct:type. Její hodnota může být z řízeného slovníku, kterým je například slovník typů prostorových datových služeb INSPIRE."}
     {:rdf/language "da",
      :rdf/value
      "Datatjenestetypen kan indikeres ved hjælp af egenskaben dct:type. Værdien kan tages fra kontrollerede udfaldsrum såsom INSPIRE spatial data service vocabulary."}
     {:rdf/language "es",
      :rdf/value
      "Si un dcat:DataService está asociado con uno o más conjuntos de datos especificados, dichos conjuntos de datos pueden indicarse con la propiedad dcat:servesDataset."}
     {:rdf/language "it",
      :rdf/value
      "Se un dcat:DataService è associato a uno o più Dataset specificati, questi sono indicati dalla proprietà dcat:serveDataset."}
     {:rdf/language "it",
      :rdf/value
      "Il tipo di servizio può essere indicato usando la proprietà dct:type. Il suo valore può essere preso da un vocabolario controllato come il vocabolario dei tipi di servizi per dati spaziali di INSPIRE."}
     {:rdf/language "es",
      :rdf/value
      "El tipo de servicio puede indicarse usando la propiedad dct:type. Su valor puede provenir de un vocabulario controlado, como por ejemplo el vocabulario de servicios de datos espaciales de INSPIRE."}
     {:rdf/language "cs",
      :rdf/value
      "Pokud je dcat:DataService navázána na jednu či více Datových sad, jsou tyto indikovány vlstností dcat:servesDataset."}}})

(def Dataset
  {:db/ident :dcat/Dataset,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   #{{:rdf/language "cs",
      :rdf/value
      "Kolekce dat poskytovaná či řízená jedním zdrojem, která je k dispozici pro přístup či stažení v jednom či více formátech."}
     {:rdf/language "fr",
      :rdf/value
      "Une collection de données, publiée ou élaborée par une seule source, et disponible pour accès ou téléchargement dans un ou plusieurs formats."}
     {:rdf/language "it",
      :rdf/value
      "Raccolta di dati, pubblicati o curati da un'unica fonte, disponibili per l'accesso o il download in uno o più formati."}
     {:rdf/language "da",
      :rdf/value
      "En samling af data, udgivet eller udvalgt og arrangeret af en enkelt kilde og som er til råde for adgang til eller download af i en eller flere repræsentationer."}
     {:rdf/language "en",
      :rdf/value
      "A collection of data, published or curated by a single source, and available for access or download in one or more representations."}
     {:rdf/language "ar",
      :rdf/value
      "قائمة بيانات منشورة أو مجموعة من قبل مصدر ما و متاح الوصول إليها أو تحميلها"}
     {:rdf/language "el",
      :rdf/value
      "Μία συλλογή από δεδομένα, δημοσιευμένη ή επιμελημένη από μία και μόνο πηγή, διαθέσιμη δε προς πρόσβαση ή μεταφόρτωση σε μία ή περισσότερες μορφές."}
     {:rdf/language "es",
      :rdf/value
      "Una colección de datos, publicados o conservados por una única fuente, y disponibles para ser accedidos o descargados en uno o más formatos."}
     {:rdf/language "ja",
      :rdf/value "1つのエージェントによって公開またはキュレートされ、1つ以上の形式でアクセスまたはダウンロードできるデータの集合。"}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "ja",
                  :rdf/value    "データセット"}
                 {:rdf/language "ar",
                  :rdf/value    "قائمة بيانات"}
                 {:rdf/language "el",
                  :rdf/value    "Σύνολο Δεδομένων"}
                 {:rdf/language "fr",
                  :rdf/value    "Jeu de données"}
                 {:rdf/language "it",
                  :rdf/value    "Dataset"}
                 {:rdf/language "es",
                  :rdf/value    "Conjunto de datos"}
                 {:rdf/language "en",
                  :rdf/value    "Dataset"}
                 {:rdf/language "cs",
                  :rdf/value    "Datová sada"}
                 {:rdf/language "da",
                  :rdf/value    "Datasæt"}},
   :rdfs/subClassOf :dcat/Resource,
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "Datasamling"},
   :skos/changeNote
   #{{:rdf/language "it",
      :rdf/value
      "2018-02 - sottoclasse di dctype:Dataset rimosso perché l'ambito di dcat:Dataset include diversi altri tipi dal vocabolario dctype."}
     {:rdf/language "en",
      :rdf/value
      "2018-02 - subclass of dctype:Dataset removed because scope of dcat:Dataset includes several other types from the dctype vocabulary."}
     {:rdf/language "da",
      :rdf/value
      "2018-02 - subklasse af dctype:Dataset fjernet da scope af dcat:Dataset omfatter flere forskellige typer fra dctype-vokabularet."}
     {:rdf/language "es",
      :rdf/value
      "2018-02 - se eliminó el axioma de subclase con dctype:Dataset porque el alcance de dcat:Dataset incluye muchos otros tipos del vocabulario dctype."}
     {:rdf/language "cs",
      :rdf/value
      "2018-02 - odstraněno tvrzení o podtřídě dctype:Dataset, jelikož rozsah dcat:Dataset zahrnuje několik dalších typů ze slovníku dctype."}},
   :skos/definition
   #{{:rdf/language "da",
      :rdf/value
      "En samling a data, udgivet eller udvalgt og arrangeret af en enkelt kilde og som der er adgang til i en eller flere repræsentationer."}
     {:rdf/language "cs",
      :rdf/value
      "Kolekce dat poskytovaná či řízená jedním zdrojem, která je k dispozici pro přístup či stažení v jednom či více formátech."}
     {:rdf/language "fr",
      :rdf/value
      "Une collection de données, publiée ou élaborée par une seule source, et disponible pour accès ou téléchargement dans un ou plusieurs formats."}
     {:rdf/language "it",
      :rdf/value
      "Raccolta di dati, pubblicati o curati da un'unica fonte, disponibili per l'accesso o il download in uno o più formati."}
     {:rdf/language "en",
      :rdf/value
      "A collection of data, published or curated by a single source, and available for access or download in one or more represenations."}
     {:rdf/language "ar",
      :rdf/value
      "قائمة بيانات منشورة أو مجموعة من قبل مصدر ما و متاح الوصول إليها أو تحميلها"}
     {:rdf/language "el",
      :rdf/value
      "Μία συλλογή από δεδομένα, δημοσιευμένη ή επιμελημένη από μία και μόνο πηγή, διαθέσιμη δε προς πρόσβαση ή μεταφόρτωση σε μία ή περισσότερες μορφές."}
     {:rdf/language "es",
      :rdf/value
      "Una colección de datos, publicados o conservados por una única fuente, y disponibles para ser accedidos o descargados en uno o más formatos."}
     {:rdf/language "ja",
      :rdf/value "1つのエージェントによって公開またはキュレートされ、1つ以上の形式でアクセスまたはダウンロードできるデータの集合。"}},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value    "2020-03-16 A new scopenote added and need to be translated"},
   :skos/scopeNote
   #{{:rdf/language "es",
      :rdf/value
      "Esta clase representa el conjunto de datos publicados. En los casos donde es necesario distinguir entre el conjunto de datos y su entrada en el catálogo de datos, se debe utilizar la clase 'registro del catálogo'."}
     {:rdf/language "da",
      :rdf/value
      "Denne klasse beskriver det konceptuelle datasæt. En eller flere repræsentationer kan være tilgængelige med forskellige skematiske opsætninger, formater eller serialiseringer."}
     {:rdf/language "ja",
      :rdf/value
      "このクラスは、データセットの公開者が公開する実際のデータセットを表わします。カタログ内の実際のデータセットとそのエントリーとの区別が必要な場合（修正日と維持者などのメタデータが異なるかもしれないので）は、後者にcatalog recordというクラスを使用できます。"}
     {:rdf/language "da",
      :rdf/value
      "Denne klasse repræsenterer det konkrete datasæt som det udgives af datasætleverandøren. I de tilfælde hvor det er nødvendigt at skelne mellem det konkrete datasæt og dets registrering i kataloget (fordi metadata såsom ændringsdato og vedligeholder er forskellige), så kan klassen katalogpost anvendes. "}
     {:rdf/language "it",
      :rdf/value
      "Questa classe rappresenta il dataset come pubblicato dall’editore. Nel caso in cui sia necessario operare  una distinzione fra i metadati originali del dataset e il record dei metadati ad esso associato nel catalogo (ad esempio, per distinguere la data di modifica del dataset da quella del dataset nel catalogo) si può impiegare la classe catalog record."}
     {:rdf/language "cs",
      :rdf/value
      "Tato třída reprezentuje datovou sadu tak, jak je publikována poskytovatelem dat. V případě potřeby rozlišení datové sady a jejího katalogizačního záznamu (jelikož metadata jako datum modifikace se mohou lišit) pro něj může být použita třída \"katalogizační záznam\"."}
     {:rdf/language "en",
      :rdf/value
      "This class describes the conceptual dataset. One or more representations might be available, with differing schematic layouts and formats or serializations."}
     {:rdf/language "it",
      :rdf/value
      "Questa classe descrive il dataset dal punto di vista concettuale. Possono essere disponibili una o più rappresentazioni, con diversi layout e formati schematici o serializzazioni."}
     {:rdf/language "el",
      :rdf/value
      "Η κλάση αυτή αναπαριστά το σύνολο δεδομένων αυτό καθ'εαυτό, όπως έχει δημοσιευθεί από τον εκδότη. Σε περιπτώσεις όπου είναι απαραίτητος ο διαχωρισμός μεταξύ του συνόλου δεδομένων και της καταγραφής αυτού στον κατάλογο (γιατί μεταδεδομένα όπως η ημερομηνία αλλαγής και ο συντηρητής μπορεί να διαφέρουν) η κλάση της καταγραφής καταλόγου μπορεί να χρησιμοποιηθεί για το τελευταίο."}
     {:rdf/language "fr",
      :rdf/value
      "Cette classe représente le jeu de données publié par le fournisseur de données. Dans les cas où une distinction est nécessaire entre le jeu de donénes et son entrée dans le catalogue, la classe registre de données peut être utilisée pour ce dernier."}
     {:rdf/language "en",
      :rdf/value
      "The notion of dataset in DCAT is broad and inclusive, with the intention of accommodating resource types arising from all communities. Data comes in many forms including numbers, text, pixels, imagery, sound and other multi-media, and potentially other types, any of which might be collected into a dataset."}
     {:rdf/language "en",
      :rdf/value
      "This class represents the actual dataset as published by the dataset provider. In cases where a distinction between the actual dataset and its entry in the catalog is necessary (because metadata such as modification date and maintainer might differ), the catalog record class can be used for the latter."}}})

(def Distribution
  {:db/ident :dcat/Distribution,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   #{{:rdf/language "el",
      :rdf/value
      "Αναπαριστά μία συγκεκριμένη διαθέσιμη μορφή ενός συνόλου δεδομένων. Κάθε σύνολο δεδομενων μπορεί να είναι διαθέσιμο σε διαφορετικές μορφές, οι μορφές αυτές μπορεί να αναπαριστούν διαφορετικές μορφές αρχείων ή διαφορετικά σημεία διάθεσης. Παραδείγματα διανομών συμπεριλαμβάνουν ένα μεταφορτώσιμο αρχείο μορφής CSV, ένα API ή ένα RSS feed."}
     {:rdf/language "cs",
      :rdf/value
      "Konkrétní reprezentace datové sady. Datová sada může být dostupná v různých serializacích, které se mohou navzájem lišit různými způsoby, mimo jiné přirozeným jazykem, media-typem či formátem, schematickou organizací, časovým a prostorovým rozlišením, úrovní detailu či profily (které mohou specifikovat některé či všechny tyto rozdíly)."}
     {:rdf/language "it",
      :rdf/value
      "Rappresenta una forma disponibile e specifica del dataset. Ciascun dataset può essere disponibile in forme differenti, che possono rappresentare formati diversi o diversi punti di accesso per un dataset. Esempi di distribuzioni sono un file CSV scaricabile, una API o un RSS feed."}
     {:rdf/language "en",
      :rdf/value
      "A specific representation of a dataset. A dataset might be available in multiple serializations that may differ in various ways, including natural language, media-type or format, schematic organization, temporal and spatial resolution, level of detail or profiles (which might specify any or all of the above)."}
     {:rdf/language "fr",
      :rdf/value
      "Représente une forme spécifique d'un jeu de données. Caque jeu de données peut être disponible sous différentes formes, celles-ci pouvant représenter différents formats du jeu de données ou différents endpoint. Des exemples de distribution sont des fichirs CSV, des API ou des flux RSS."}
     {:rdf/language "ja",
      :rdf/value
      "データセットの特定の利用可能な形式を表わします。各データセットは、異なる形式で利用できることがあり、これらの形式は、データセットの異なる形式や、異なるエンドポイントを表わす可能性があります。配信の例には、ダウンロード可能なCSVファイル、API、RSSフィードが含まれます。"}
     {:rdf/language "da",
      :rdf/value
      "En specifik repræsentation af et datasæt. Et datasæt kan være tilgængelig i mange serialiseringer der kan variere på forskellige vis, herunder sprog, medietype eller format, systemorganisering, tidslig- og geografisk opløsning, detaljeringsniveau eller profiler (der kan specificere en eller flere af ovenstående)."}
     {:rdf/language "es",
      :rdf/value
      "Una representación específica de los datos. Cada conjunto de datos puede estar disponible en formas diferentes, las cuáles pueden variar en distintas formas, incluyendo el idioma, 'media-type' o formato, organización esquemática, resolución temporal y espacial, nivel de detalle o perfiles (que pueden especificar cualquiera o todas las diferencias anteriores)."}
     {:rdf/language "ar",
      :rdf/value
      "شكل محدد لقائمة البيانات يمكن الوصول إليه. قائمة بيانات ما يمكن أن تكون متاحه باشكال و أنواع متعددة.  ملف يمكن تحميله أو واجهة برمجية يمكن من خلالها الوصول إلى البيانات هي أمثلة على ذلك."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "ja",
                  :rdf/value    "配信"}
                 {:rdf/language "ar",
                  :rdf/value    "التوزيع"}
                 {:rdf/language "cs",
                  :rdf/value    "Distribuce"}
                 {:rdf/language "en",
                  :rdf/value    "Distribution"}
                 {:rdf/language "fr",
                  :rdf/value    "Distribution"}
                 {:rdf/language "el",
                  :rdf/value    "Διανομή"}
                 {:rdf/language "da",
                  :rdf/value    "Distribution"}
                 {:rdf/language "es",
                  :rdf/value    "Distribución"}
                 {:rdf/language "it",
                  :rdf/value    "Distribuzione"}},
   :skos/altLabel #{{:rdf/language "da",
                     :rdf/value    "Datarepræsentation"}
                    {:rdf/language "da",
                     :rdf/value    "Dataudstilling"}
                    {:rdf/language "da",
                     :rdf/value    "Datamanifestation"}
                    {:rdf/language "da",
                     :rdf/value    "Datadistribution"}},
   :skos/definition
   #{{:rdf/language "el",
      :rdf/value
      "Αναπαριστά μία συγκεκριμένη διαθέσιμη μορφή ενός συνόλου δεδομένων. Κάθε σύνολο δεδομενων μπορεί να είναι διαθέσιμο σε διαφορετικές μορφές, οι μορφές αυτές μπορεί να αναπαριστούν διαφορετικές μορφές αρχείων ή διαφορετικά σημεία διάθεσης. Παραδείγματα διανομών συμπεριλαμβάνουν ένα μεταφορτώσιμο αρχείο μορφής CSV, ένα API ή ένα RSS feed."}
     {:rdf/language "cs",
      :rdf/value
      "Konkrétní reprezentace datové sady. Datová sada může být dostupná v různých serializacích, které se mohou navzájem lišit různými způsoby, mimo jiné přirozeným jazykem, media-typem či formátem, schematickou organizací, časovým a prostorovým rozlišením, úrovní detailu či profily (které mohou specifikovat některé či všechny tyto rozdíly)."}
     {:rdf/language "it",
      :rdf/value
      "Rappresenta una forma disponibile e specifica del dataset. Ciascun dataset può essere disponibile in forme differenti, che possono rappresentare formati diversi o diversi punti di accesso per un dataset. Esempi di distribuzioni sono un file CSV scaricabile, una API o un RSS feed."}
     {:rdf/language "en",
      :rdf/value
      "A specific representation of a dataset. A dataset might be available in multiple serializations that may differ in various ways, including natural language, media-type or format, schematic organization, temporal and spatial resolution, level of detail or profiles (which might specify any or all of the above)."}
     {:rdf/language "fr",
      :rdf/value
      "Représente une forme spécifique d'un jeu de données. Caque jeu de données peut être disponible sous différentes formes, celles-ci pouvant représenter différents formats du jeu de données ou différents endpoint. Des exemples de distribution sont des fichirs CSV, des API ou des flux RSS."}
     {:rdf/language "ja",
      :rdf/value
      "データセットの特定の利用可能な形式を表わします。各データセットは、異なる形式で利用できることがあり、これらの形式は、データセットの異なる形式や、異なるエンドポイントを表わす可能性があります。配信の例には、ダウンロード可能なCSVファイル、API、RSSフィードが含まれます。"}
     {:rdf/language "da",
      :rdf/value
      "En specifik repræsentation af et datasæt. Et datasæt kan være tilgængelig i mange serialiseringer der kan variere på forskellige vis, herunder sprog, medietype eller format, systemorganisering, tidslig- og geografisk opløsning, detaljeringsniveau eller profiler (der kan specificere en eller flere af ovenstående)."}
     {:rdf/language "es",
      :rdf/value
      "Una representación específica de los datos. Cada conjunto de datos puede estar disponible en formas diferentes, las cuáles pueden variar en distintas formas, incluyendo el idioma, 'media-type' o formato, organización esquemática, resolución temporal y espacial, nivel de detalle o perfiles (que pueden especificar cualquiera o todas las diferencias anteriores)."}
     {:rdf/language "ar",
      :rdf/value
      "شكل محدد لقائمة البيانات يمكن الوصول إليه. قائمة بيانات ما يمكن أن تكون متاحه باشكال و أنواع متعددة.  ملف يمكن تحميله أو واجهة برمجية يمكن من خلالها الوصول إلى البيانات هي أمثلة على ذلك."}},
   :skos/scopeNote
   #{{:rdf/language "it",
      :rdf/value
      "Questa classe rappresenta una disponibilità generale di un dataset e non implica alcuna informazione sul metodo di accesso effettivo ai dati, ad esempio se si tratta di un accesso a download diretto, API, o attraverso una pagina Web. L'utilizzo della proprietà dcat:downloadURL indica distribuzioni direttamente scaricabili."}
     {:rdf/language "da",
      :rdf/value
      "Denne klasse repræsenterer datasættets overordnede tilgængelighed og giver ikke oplysninger om hvilken metode der kan anvendes til at få adgang til data, dvs. om adgang til datasættet realiseres ved direkte download, API eller via et websted. Anvendelsen af egenskaben dcat:downloadURL indikerer at distributionen kan downloades direkte."}
     {:rdf/language "ja",
      :rdf/value
      "これは、データセットの一般的な利用可能性を表わし、データの実際のアクセス方式に関する情報（つまり、直接ダウンロードなのか、APIなのか、ウェブページを介したものなのか）を意味しません。dcat:downloadURLプロパティーの使用は、直接ダウンロード可能な配信を意味します。"}
     {:rdf/language "es",
      :rdf/value
      "Esta clase representa una disponibilidad general de un conjunto de datos, e implica que no existe información acerca del método de acceso real a los datos, i.e., si es un enlace de descarga directa o a través de una página Web."}
     {:rdf/language "cs",
      :rdf/value
      "Toto popisuje obecnou dostupnost datové sady. Neimplikuje žádnou informaci o skutečné metodě přístupu k datům, tj. zda jsou přímo ke stažení, skrze API či přes webovou stránku. Použití vlastnosti dcat:downloadURL indikuje přímo stažitelné distribuce."}
     {:rdf/language "el",
      :rdf/value
      "Αυτό αναπαριστά μία γενική διαθεσιμότητα ενός συνόλου δεδομένων και δεν υπονοεί τίποτα περί του πραγματικού τρόπου πρόσβασης στα δεδομένα, αν είναι άμεσα μεταφορτώσιμα, μέσω API ή μέσω μίας ιστοσελίδας. Η χρήση της ιδιότητας dcat:downloadURL δείχνει μόνο άμεσα μεταφορτώσιμες διανομές."}
     {:rdf/language "en",
      :rdf/value
      "This represents a general availability of a dataset it implies no information about the actual access method of the data, i.e. whether by direct download, API, or through a Web page. The use of dcat:downloadURL property indicates directly downloadable distributions."}
     {:rdf/language "fr",
      :rdf/value
      "Ceci représente une disponibilité générale du jeu de données, et implique qu'il n'existe pas d'information sur la méthode d'accès réelle des données, par exple, si c'est un lien de téléchargement direct ou à travers une page Web."}}})

(def Relationship
  {:db/ident :dcat/Relationship,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "da",
      :rdf/value
      "En associationsklasse til brug for tilknytning af yderligere information til en relation mellem DCAT-ressourcer."}
     {:rdf/language "es",
      :rdf/value
      "Una clase de asociación para adjuntar información adicional a una relación entre recursos DCAT."}
     {:rdf/language "it",
      :rdf/value
      "Una classe di associazione per il collegamento di informazioni aggiuntive a una relazione tra le risorse DCAT."}
     {:rdf/language "cs",
      :rdf/value
      "Asociační třída pro připojení dodatečných informací ke vztahu mezi zdroji DCAT."}
     {:rdf/language "en",
      :rdf/value
      "An association class for attaching additional information to a relationship between DCAT Resources."}},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "Relación"}
                 {:rdf/language "cs",
                  :rdf/value    "Vztah"}
                 {:rdf/language "da",
                  :rdf/value    "Relation"}
                 {:rdf/language "it",
                  :rdf/value    "Relazione"}
                 {:rdf/language "en",
                  :rdf/value    "Relationship"}},
   :skos/changeNote #{{:rdf/language "da",
                       :rdf/value    "Ny klasse i DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New class added in DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva clase añadida en DCAT 2.0."}
                      {:rdf/language "it",
                       :rdf/value    "Nuova classe aggiunta in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value    "Nová třída přidaná ve verzi DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "da",
      :rdf/value
      "En associationsklasse til brug for tilknytning af yderligere information til en relation mellem DCAT-ressourcer."}
     {:rdf/language "es",
      :rdf/value
      "Una clase de asociación para adjuntar información adicional a una relación entre recursos DCAT."}
     {:rdf/language "it",
      :rdf/value
      "Una classe di associazione per il collegamento di informazioni aggiuntive a una relazione tra le risorse DCAT."}
     {:rdf/language "cs",
      :rdf/value
      "Asociační třída pro připojení dodatečných informací ke vztahu mezi zdroji DCAT."}
     {:rdf/language "en",
      :rdf/value
      "An association class for attaching additional information to a relationship between DCAT Resources."}},
   :skos/scopeNote
   #{{:rdf/language "da",
      :rdf/value
      "Anvendes til at karakterisere en relation mellem datasæt, og potentielt andre ressourcer, hvor relationen er kendt men ikke tilstrækkeligt beskrevet af de standardiserede egenskaber i Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) eller PROV-O-egenskaber (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf)."}
     {:rdf/language "it",
      :rdf/value
      "Viene utilizzato per caratterizzare la relazione tra insiemi di dati, e potenzialmente altri tipi di risorse, nei casi in cui la natura della relazione è nota ma non adeguatamente caratterizzata dalle proprietà dello standard 'Dublin Core' (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:require, dct:isRequiredBy) o dalle propietà fornite da PROV-O  (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov: hadPrimarySource, prov:alternateOf, prov:specializationOf)."}
     {:rdf/language "es",
      :rdf/value
      "Se usa para caracterizar la relación entre conjuntos de datos, y potencialmente otros recursos, donde la naturaleza de la relación se conoce pero no está caracterizada adecuadamente con propiedades del estándar 'Dublin Core' (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf)."}
     {:rdf/language "cs",
      :rdf/value
      "Používá se pro charakterizaci vztahu mezi datovými sadami a případně i jinými zdroji, kde druh vztahu je sice znám, ale není přiměřeně charakterizován standardními vlastnostmi slovníku Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) či vlastnostmi slovníku PROV-O (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf)."}
     {:rdf/language "en",
      :rdf/value
      "Use to characterize a relationship between datasets, and potentially other resources, where the nature of the relationship is known but is not adequately characterized by the standard Dublin Core properties (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf)."}}})

(def Resource
  {:db/ident :dcat/Resource,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "es",
      :rdf/value    "Recurso publicado o curado por un agente único."}
     {:rdf/language "en",
      :rdf/value    "Resource published or curated by a single agent."}
     {:rdf/language "da",
      :rdf/value
      "Ressource udgivet eller udvalgt og arrangeret af en enkelt aktør."}
     {:rdf/language "it",
      :rdf/value    "Risorsa pubblicata o curata da un singolo agente."}
     {:rdf/language "cs",
      :rdf/value    "Zdroj publikovaný či řízený jediným činitelem."}},
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "Katalogiseret ressource"}
                 {:rdf/language "cs",
                  :rdf/value    "Katalogizovaný zdroj"}
                 {:rdf/language "en",
                  :rdf/value    "Catalogued resource"}
                 {:rdf/language "it",
                  :rdf/value    "Risorsa catalogata"}
                 {:rdf/language "es",
                  :rdf/value    "Recurso catalogado"}},
   :skos/changeNote #{{:rdf/language "da",
                       :rdf/value    "Ny klasse i DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New class added in DCAT 2.0."}
                      {:rdf/language "it",
                       :rdf/value    "Nuova classe aggiunta in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value    "Nová třída přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva clase agregada en DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "es",
      :rdf/value    "Recurso publicado o curado por un agente único."}
     {:rdf/language "en",
      :rdf/value    "Resource published or curated by a single agent."}
     {:rdf/language "da",
      :rdf/value
      "Ressource udgivet eller udvalgt og arrangeret af en enkelt aktør."}
     {:rdf/language "it",
      :rdf/value    "Risorsa pubblicata o curata da un singolo agente."}
     {:rdf/language "cs",
      :rdf/value    "Zdroj publikovaný či řízený jediným činitelem."}},
   :skos/scopeNote
   #{{:rdf/language "es",
      :rdf/value
      "La clase de todos los recursos catalogados, la superclase de dcat:Dataset, dcat:DataService, dcat:Catalog y cualquier otro miembro de un dcat:Catalog. Esta clase tiene propiedades comunes a todos los recursos catalogados, incluyendo conjuntos de datos y servicios de datos. Se recomienda fuertemente que se use una clase más específica. Cuando se describe un recurso que no es un dcat:Dataset o dcat:DataService, se recomienda crear una sub-clase apropiada de dcat:Resource, o usar dcat:Resource con la propiedad dct:type to indicar el tipo específico."}
     {:rdf/language "es",
      :rdf/value
      "dcat:Resource es un punto de extensión que permite la definición de cualquier tipo de catálogo. Se pueden definir subclases adicionales en perfil de DCAT o una aplicación para catálogos de otro tipo de recursos."}
     {:rdf/language "en",
      :rdf/value
      "dcat:Resource is an extension point that enables the definition of any kind of catalog. Additional subclasses may be defined in a DCAT profile or application for catalogs of other kinds of resources."}
     {:rdf/language "cs",
      :rdf/value
      "Třída všech katalogizovaných zdrojů, nadtřída dcat:Dataset, dcat:DataService, dcat:Catalog a všech ostatních členů dcat:Catalog. Tato třída nese vlastnosti společné všem katalogizovaným zdrojům včetně datových sad a datových služeb. Je silně doporučeno používat specifičtější podtřídy, pokud je to možné. Při popisu zdroje, který není ani dcat:Dataset, ani dcat:DataService se doporučuje vytvořit odpovídající podtřídu dcat:Resrouce a nebo použít dcat:Resource s vlastností dct:type pro určení konkrétního typu."}
     {:rdf/language "it",
      :rdf/value
      "dcat:Resource è un punto di estensione che consente la definizione di qualsiasi tipo di catalogo. Sottoclassi aggiuntive possono essere definite in un profilo DCAT o in un'applicazione per cataloghi di altri tipi di risorse."}
     {:rdf/language "da",
      :rdf/value
      "dcat:Resource er et udvidelsespunkt der tillader oprettelsen af enhver type af kataloger. Yderligere subklasser kan defineres i en DCAT-profil eller i en applikation til kataloger med andre typer af ressourcer."}
     {:rdf/language "it",
      :rdf/value
      "La classe di tutte le risorse catalogate, la Superclasse di dcat:Dataset, dcat:DataService, dcat:Catalog e qualsiasi altro membro di dcat:Catalog. Questa classe porta proprietà comuni a tutte le risorse catalogate, inclusi set di dati e servizi dati. Si raccomanda vivamente di utilizzare una sottoclasse più specifica. Quando si descrive una risorsa che non è un dcat:Dataset o dcat:DataService, si raccomanda di creare una sottoclasse di dcat:Resource appropriata, o utilizzare dcat:Resource con la proprietà dct:type per indicare il tipo specifico."}
     {:rdf/language "en",
      :rdf/value
      "The class of all catalogued resources, the Superclass of dcat:Dataset, dcat:DataService, dcat:Catalog and any other member of a dcat:Catalog. This class carries properties common to all catalogued resources, including datasets and data services. It is strongly recommended to use a more specific sub-class. When describing a resource which is not a dcat:Dataset or dcat:DataService, it is recommended to create a suitable sub-class of dcat:Resource, or use dcat:Resource with the dct:type property to indicate the specific type."}
     {:rdf/language "cs",
      :rdf/value
      "dcat:Resource je bod pro rozšíření umožňující definici různých druhů katalogů. Další podtřídy lze definovat v profilech DCAT či aplikacích pro katalogy zdrojů jiných druhů."}
     {:rdf/language "da",
      :rdf/value
      "Klassen for alle katalogiserede ressourcer, den overordnede klasse for dcat:Dataset, dcat:DataService, dcat:Catalog og enhvert medlem af et dcat:Catalog. Denne klasse bærer egenskaber der gælder alle katalogiserede ressourcer, herunder dataset og datatjenester. Det anbefales kraftigt at mere specifikke subklasser oprettes. Når der beskrives ressourcer der ikke er dcat:Dataset eller dcat:DataService, anbefales det at oprette passende subklasser af dcat:Resource eller at dcat:Resource anvendes sammen med egenskaben dct:type til opmærkning med en specifik typeangivelse."}}})

(def Role
  {:db/ident :dcat/Role,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A role is the function of a resource or agent with respect to another resource, in the context of resource attribution or resource relationships."}
     {:rdf/language "es",
      :rdf/value
      "Un rol es la función de un recurso o agente con respecto a otro recuros, en el contexto de atribución del recurso o de las relaciones entre recursos."}
     {:rdf/language "cs",
      :rdf/value
      "Role je funkce zdroje či agenta ve vztahu k jinému zdroji, v kontextu přiřazení zdrojů či vztahů mezi zdroji."}
     {:rdf/language "it",
      :rdf/value
      "Un ruolo è la funzione di una risorsa o di un agente rispetto ad un'altra risorsa, nel contesto dell'attribuzione delle risorse o delle relazioni tra risorse."}
     {:rdf/language "da",
      :rdf/value
      "En rolle er den funktion en ressource eller aktør har i forhold til en anden ressource, i forbindelse med ressourcekreditering eller ressourcerelationer."}},
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "Ruolo"}
                 {:rdf/language "en",
                  :rdf/value    "Role"}
                 {:rdf/language "cs",
                  :rdf/value    "Role"}
                 {:rdf/language "es",
                  :rdf/value    "Rol"}
                 {:rdf/language "da",
                  :rdf/value    "Rolle"}},
   :rdfs/seeAlso :dcat/hadRole,
   :rdfs/subClassOf :skos/Concept,
   :skos/changeNote #{{:rdf/language "en",
                       :rdf/value    "New class added in DCAT 2.0."}
                      {:rdf/language "it",
                       :rdf/value    "Nuova classe aggiunta in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value    "Nová třída přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "Ny klasse tilføjet i DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva clase agregada en DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "en",
      :rdf/value
      "A role is the function of a resource or agent with respect to another resource, in the context of resource attribution or resource relationships."}
     {:rdf/language "es",
      :rdf/value
      "Un rol es la función de un recurso o agente con respecto a otro recuros, en el contexto de atribución del recurso o de las relaciones entre recursos."}
     {:rdf/language "cs",
      :rdf/value
      "Role je funkce zdroje či agenta ve vztahu k jinému zdroji, v kontextu přiřazení zdrojů či vztahů mezi zdroji."}
     {:rdf/language "it",
      :rdf/value
      "Un ruolo è la funzione di una risorsa o di un agente rispetto ad un'altra risorsa, nel contesto dell'attribuzione delle risorse o delle relazioni tra risorse."}
     {:rdf/language "da",
      :rdf/value
      "En rolle er den funktion en ressource eller aktør har i forhold til en anden ressource, i forbindelse med ressourcekreditering eller ressourcerelationer."}},
   :skos/editorialNote
   #{{:rdf/language "cs",
      :rdf/value
      "Přidáno do DCAT pro doplnění třídy prov:Role (jejíž užití je omezeno na role v kontextu aktivit, jakožto obor hodnot vlastnosti prov:hadRole)."}
     {:rdf/language "da",
      :rdf/value
      "Introduceret i DCAT for at supplere prov:Role (hvis anvendelse er begrænset til roller i forbindelse med en aktivitet, som er rækkevidde for prov:hadRole)."}
     {:rdf/language "es",
      :rdf/value
      "Incluída en DCAT para complementar prov:Role (cuyo uso está limitado a roles en el contexto de una actividad, ya que es el rango es prov:hadRole)."}
     {:rdf/language "it",
      :rdf/value
      "Introdotta in DCAT per completare prov:Role (il cui uso è limitato ai ruoli nel contesto di un'attività, in conseguenza alla definizione del codominio di prov:hadRole)."}
     {:rdf/language "en",
      :rdf/value
      "Introduced into DCAT to complement prov:Role (whose use is limited to roles in the context of an activity, as the range of prov:hadRole)."}},
   :skos/scopeNote
   #{{:rdf/language "en",
      :rdf/value
      "Used in a qualified-relation to specify the role of an Entity with respect to another Entity. It is recommended that the values be managed as a controlled vocabulary of entity roles such as: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation;  DataCite metadata schema;  MARC relators https://id.loc.gov/vocabulary/relators."}
     {:rdf/language "es",
      :rdf/value
      "Se usa en una atribución cualificada para especificar el rol de un Agente con respecto a una Entidad. Se recomienda que los valores se administren como un vocabulario controlado de roles de agente, como por ejemplo http://registry.it.csiro.au/def/isotc211/CI_RoleCode."}
     {:rdf/language "da",
      :rdf/value
      "Anvendes i forbindelse med kvalificerede krediteringer til at angive aktørens rolle i forhold til en entitet. Det anbefales at værdierne styres som et kontrolleret udfaldsrum med aktørroller, såsom http://registry.it.csiro.au/def/isotc211/CI_RoleCode."}
     {:rdf/language "en",
      :rdf/value
      "Used in a qualified-attribution to specify the role of an Agent with respect to an Entity. It is recommended that the values be managed as a controlled vocabulary of agent roles, such as http://registry.it.csiro.au/def/isotc211/CI_RoleCode."}
     {:rdf/language "it",
      :rdf/value
      "Utilizzato in un'attribuzione qualificata per specificare il ruolo di un agente rispetto a un'entità. Si consiglia di attribuire i valori considerando un vocabolario controllato dei ruoli dell'agente, ad esempio http://registry.it.csiro.au/def/isotc211/CI_RoleCode."}
     {:rdf/language "it",
      :rdf/value
      "Utilizzato in una relazione qualificata per specificare il ruolo di un'entità rispetto a un'altra entità. Si raccomanda che il valore sia preso da un vocabolario controllato di ruoli di entità come ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, o MARC relators https://id.loc.gov/vocabulary/relators."}
     {:rdf/language "cs",
      :rdf/value
      "Použito v kvalifikovaném přiřazení pro specifikaci role Agenta ve vztahu k Entitě. Je doporučeno množinu hodnot spravovat jako řízený slovník rolí agentů, jako například http://registry.it.csiro.au/def/isotc211/CI_RoleCode."}
     {:rdf/language "es",
      :rdf/value
      "Se usa en una relación cualificada para especificar el rol de una Entidad con respecto a otra Entidad. Se recomienda que los valores se administren como los valores de un vocabulario controlado de roles de entidad como por ejemplo: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation; el esquema de metadatos de DataCite; MARC relators https://id.loc.gov/vocabulary/relators."}
     {:rdf/language "da",
      :rdf/value
      "Anvendes i forbindelse med kvalificerede relationer til at specificere en entitets rolle i forhold til en anden entitet. Det anbefales at værdierne styres med et kontrolleret udfaldsrum for for entitetsroller såsom: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation;  DataCite metadata schema;  MARC relators https://id.loc.gov/vocabulary/relators."}
     {:rdf/language "cs",
      :rdf/value
      "Použito v kvalifikovaném vztahu pro specifikaci role Entity ve vztahu k jiné Entitě. Je doporučeno množinu hodnot spravovat jako řízený slovník rolí entit, jako například ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, či MARC relators https://id.loc.gov/vocabulary/relators."}}})

(def accessService
  {:db/ident :dcat/accessService,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "da",
      :rdf/value
      "Et websted eller endpoint der giver adgang til en repræsentation af datasættet."}
     {:rdf/language "en",
      :rdf/value
      "A site or end-point that gives access to the distribution of the dataset."}
     {:rdf/language "cs",
      :rdf/value
      "Umístění či přístupový bod zpřístupňující distribuci datové sady."}
     {:rdf/language "es",
      :rdf/value
      "Un sitio o end-point que da acceso a la distribución de un conjunto de datos."}
     {:rdf/language "it",
      :rdf/value
      "Un sito o end-point che dà accesso alla distribuzione del set di dati."}},
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "dataadgangstjeneste"}
                 {:rdf/language "cs",
                  :rdf/value    "služba pro přístup k datům"}
                 {:rdf/language "it",
                  :rdf/value    "servizio di accesso ai dati"}
                 {:rdf/language "en",
                  :rdf/value    "data access service"}
                 {:rdf/language "es",
                  :rdf/value    "servicio de acceso de datos"}},
   :rdfs/range :dcat/DataService,
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad agregada en DCAT 2.0."}
                      {:rdf/language "da",
                       :rdf/value    "Ny egenskab tilføjet i DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "da",
      :rdf/value
      "Et websted eller endpoint der giver adgang til en repræsentation af datasættet."}
     {:rdf/language "en",
      :rdf/value
      "A site or end-point that gives access to the distribution of the dataset."}
     {:rdf/language "cs",
      :rdf/value
      "Umístění či přístupový bod zpřístupňující distribuci datové sady."}
     {:rdf/language "es",
      :rdf/value
      "Un sitio o end-point que da acceso a la distribución de un conjunto de datos."}
     {:rdf/language "it",
      :rdf/value
      "Un sito o end-point che dà accesso alla distribuzione del set di dati."}}})

(def accessURL
  {:db/ident :dcat/accessURL,
   :owl/propertyChainAxiom [:dcat/accessService :dcat/endpointURL],
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A URL of a resource that gives access to a distribution of the dataset. E.g. landing page, feed, SPARQL endpoint. Use for all cases except a simple download link, in which case downloadURL is preferred."}
     {:rdf/language "es",
      :rdf/value
      "Puede ser cualquier tipo de URL que de acceso a una distribución del conjunto de datos, e.g., página de destino, descarga, URL feed, punto de acceso SPARQL. Esta propriedad se debe usar cuando su catálogo de datos no tiene información sobre donde está o cuando no se puede descargar."}
     {:rdf/language "da",
      :rdf/value
      "En URL for en ressource som giver adgang til en repræsentation af datsættet. Fx destinationsside, feed, SPARQL-endpoint. Anvendes i alle sammenhænge undtagen til angivelse af et simpelt download link hvor anvendelse af egenskaben downloadURL foretrækkes."}
     {:rdf/language "it",
      :rdf/value
      "Un URL di una risorsa che consente di accedere a una distribuzione del set di dati. Per esempio, pagina di destinazione, feed, endpoint SPARQL. Da utilizzare per tutti i casi, tranne  quando  si tratta di un semplice link per il download nel qual caso è preferito downloadURL."}
     {:rdf/language "ar",
      :rdf/value
      "أي رابط يتيح الوصول إلى البيانات. إذا كان الرابط هو ربط مباشر لملف يمكن تحميله استخدم الخاصية downloadURL"}
     {:rdf/language "fr",
      :rdf/value
      "Ceci peut être tout type d'URL qui donne accès à une distribution du jeu de données. Par exemple, un lien à une page HTML contenant un lien au jeu de données, un Flux RSS, un point d'accès SPARQL. Utilisez le lorsque votre catalogue ne contient pas d'information sur quoi il est ou quand ce n'est pas téléchargeable."}
     {:rdf/language "cs",
      :rdf/value
      "URL zdroje, přes které je přístupná distribuce datové sady. Příkladem může být vstupní stránka, RSS kanál či SPARQL endpoint. Použijte ve všech případech kromě URL souboru ke stažení, pro které je lepší použít dcat:downloadURL."}
     {:rdf/language "el",
      :rdf/value
      "Μπορεί να είναι οποιουδήποτε είδους URL που δίνει πρόσβαση στη διανομή ενός συνόλου δεδομένων. Π.χ. ιστοσελίδα αρχικής πρόσβασης, μεταφόρτωση, feed URL, σημείο διάθεσης SPARQL. Να χρησιμοποιείται όταν ο κατάλογος δεν περιέχει πληροφορίες εαν πρόκειται ή όχι για μεταφορτώσιμο αρχείο."}
     {:rdf/language "ja",
      :rdf/value
      "データセットの配信にアクセス権を与えるランディング・ページ、フィード、SPARQLエンドポイント、その他の種類の資源。"}},
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "adgangsadresse"}
                 {:rdf/language "fr",
                  :rdf/value    "URL d'accès"}
                 {:rdf/language "ar",
                  :rdf/value    "رابط وصول"}
                 {:rdf/language "ja",
                  :rdf/value    "アクセスURL"}
                 {:rdf/language "el",
                  :rdf/value    "URL πρόσβασης"}
                 {:rdf/language "en",
                  :rdf/value    "access address"}
                 {:rdf/language "cs",
                  :rdf/value    "přístupová adresa"}
                 {:rdf/language "it",
                  :rdf/value    "indirizzo di accesso"}
                 {:rdf/language "es",
                  :rdf/value    "URL de acceso"}},
   :rdfs/range :rdfs/Resource,
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "adgangsURL"},
   :skos/definition
   #{{:rdf/language "en",
      :rdf/value
      "A URL of a resource that gives access to a distribution of the dataset. E.g. landing page, feed, SPARQL endpoint. Use for all cases except a simple download link, in which case downloadURL is preferred."}
     {:rdf/language "es",
      :rdf/value
      "Puede ser cualquier tipo de URL que de acceso a una distribución del conjunto de datos, e.g., página de destino, descarga, URL feed, punto de acceso SPARQL. Esta propriedad se debe usar cuando su catálogo de datos no tiene información sobre donde está o cuando no se puede descargar."}
     {:rdf/language "da",
      :rdf/value
      "En URL for en ressource som giver adgang til en repræsentation af datsættet. Fx destinationsside, feed, SPARQL-endpoint. Anvendes i alle sammenhænge undtagen til angivelse af et simpelt download link hvor anvendelse af egenskaben downloadURL foretrækkes."}
     {:rdf/language "it",
      :rdf/value
      "Un URL di una risorsa che consente di accedere a una distribuzione del set di dati. Per esempio, pagina di destinazione, feed, endpoint SPARQL. Da utilizzare per tutti i casi, tranne  quando  si tratta di un semplice link per il download nel qual caso è preferito downloadURL."}
     {:rdf/language "ar",
      :rdf/value
      "أي رابط يتيح الوصول إلى البيانات. إذا كان الرابط هو ربط مباشر لملف يمكن تحميله استخدم الخاصية downloadURL"}
     {:rdf/language "fr",
      :rdf/value
      "Ceci peut être tout type d'URL qui donne accès à une distribution du jeu de données. Par exemple, un lien à une page HTML contenant un lien au jeu de données, un Flux RSS, un point d'accès SPARQL. Utilisez le lorsque votre catalogue ne contient pas d'information sur quoi il est ou quand ce n'est pas téléchargeable."}
     {:rdf/language "cs",
      :rdf/value
      "URL zdroje, přes které je přístupná distribuce datové sady. Příkladem může být vstupní stránka, RSS kanál či SPARQL endpoint. Použijte ve všech případech kromě URL souboru ke stažení, pro které je lepší použít dcat:downloadURL."}
     {:rdf/language "el",
      :rdf/value
      "Μπορεί να είναι οποιουδήποτε είδους URL που δίνει πρόσβαση στη διανομή ενός συνόλου δεδομένων. Π.χ. ιστοσελίδα αρχικής πρόσβασης, μεταφόρτωση, feed URL, σημείο διάθεσης SPARQL. Να χρησιμοποιείται όταν ο κατάλογος δεν περιέχει πληροφορίες εαν πρόκειται ή όχι για μεταφορτώσιμο αρχείο."}
     {:rdf/language "ja",
      :rdf/value
      "データセットの配信にアクセス権を与えるランディング・ページ、フィード、SPARQLエンドポイント、その他の種類の資源。"}},
   :skos/editorialNote
   #{{:rdf/language "en",
      :rdf/value
      "rdfs:label, rdfs:comment and skos:scopeNote have been modified. Non-english versions except for Italian must be updated."}
     {:rdf/language "en",
      :rdf/value
      "Status: English Definition text modified by DCAT revision team, updated Italian and Czech translation provided, translations for other languages pending."}},
   :skos/scopeNote
   #{{:rdf/language "da",
      :rdf/value
      "Hvis en eller flere distributioner kun er tilgængelige via en destinationsside (dvs. en URL til direkte download er ikke kendt), så bør destinationssidelinket gentages som adgangsadresse for distributionen."}
     {:rdf/language "ja",
      :rdf/value
      "確実にダウンロードでない場合や、ダウンロードかどうかが不明である場合は、downloadURLではなく、accessURLを用いてください。ランディング・ページを通じてしか配信にアクセスできない場合（つまり、直接的なダウンロードURLが不明）は、配信におけるaccessURLとしてランディング・ページのリンクをコピーすべきです（SHOULD）。"}
     {:rdf/language "it",
      :rdf/value
      "Se le distribuzioni sono accessibili solo attraverso una pagina web (ad esempio, gli URL per il download diretto non sono noti), allora il link della pagina web deve essere duplicato come accessURL sulla distribuzione."}
     {:rdf/language "cs",
      :rdf/value
      "Pokud jsou distribuce přístupné pouze přes vstupní stránku (tj. URL pro přímé stažení nejsou známa), pak by URL přístupové stránky mělo být duplikováno ve vlastnosti distribuce accessURL."}
     {:rdf/language "en",
      :rdf/value
      "If the distribution(s) are accessible only through a landing page (i.e. direct download URLs are not known), then the landing page link should be duplicated as accessURL on a distribution."}
     {:rdf/language "fr",
      :rdf/value
      "La valeur est une URL. Si la distribution est accessible seulement au travers d'une page d'atterrissage (c-à-dire on n'ignore une URL de téléchargement direct), alors le lien à la page d'atterrissage doit être dupliqué comee accessURL sur la distribution."}
     {:rdf/language "es",
      :rdf/value
      "El rango es una URL. Si la distribución es accesible solamente través de una página de destino (es decir, si no se conoce una URL de descarga directa), entonces el enlance a la página de destino debe ser duplicado como accessURL en la distribución."}
     {:rdf/language "el",
      :rdf/value
      "Η τιμή είναι ένα URL. Αν η/οι διανομή/ές είναι προσβάσιμη/ες μόνο μέσω μίας ιστοσελίδας αρχικής πρόσβασης (δηλαδή αν δεν υπάρχουν γνωστές διευθύνσεις άμεσης μεταφόρτωσης), τότε ο σύνδεσμος της ιστοσελίδας αρχικής πρόσβασης πρέπει να αναπαραχθεί ως accessURL σε μία διανομή."}}})

(def bbox
  {:db/ident :dcat/bbox,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :dcterms/Location,
   :rdfs/label #{{:rdf/language "cs",
                  :rdf/value    "ohraničení oblasti"}
                 {:rdf/language "it",
                  :rdf/value    "quadro di delimitazione"}
                 {:rdf/language "da",
                  :rdf/value    "bounding box"}
                 {:rdf/language "en",
                  :rdf/value    "bounding box"}
                 {:rdf/language "es",
                  :rdf/value    "cuadro delimitador"}},
   :rdfs/range :rdfs/Literal,
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Propiedad nueva agregada en DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "da",
                       :rdf/value    "Ny egenskab tilføjet i DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "cs",
      :rdf/value    "Ohraničení geografické oblasti zdroje."}
     {:rdf/language "da",
      :rdf/value    "Den geografiske omskrevne firkant af en ressource."}
     {:rdf/language "es",
      :rdf/value    "El cuadro delimitador geográfico para un recurso."}
     {:rdf/language "it",
      :rdf/value    "Il riquadro di delimitazione geografica di una risorsa."}
     {:rdf/language "en",
      :rdf/value    "The geographic bounding box of a resource."}},
   :skos/scopeNote
   #{{:rdf/language "da",
      :rdf/value
      "Rækkevidden for denne egenskab er bevidst generisk defineret med det formål at tillade forskellige kodninger af geometrier. Geometrien kan eksempelvis repræsenteres som WKT (geosparql:asWKT [GeoSPARQL]) eller [GML] (geosparql:asGML [GeoSPARQL])."}
     {:rdf/language "cs",
      :rdf/value
      "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé kódování geometrií. Geometrie by kupříkladu mohla být kódována jako WKT (geosparql:wktLiteral [GeoSPARQL]) či [GML] (geosparql:asGML [GeoSPARQL])."}
     {:rdf/language "es",
      :rdf/value
      "El rango de esta propiedad es intencionalmente genérico con el propósito de permitir distintas codificaciones geométricas. Por ejemplo, la geometría puede ser codificada como WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL])."}
     {:rdf/language "en",
      :rdf/value
      "The range of this property is intentionally generic, with the purpose of allowing different geometry encodings. E.g., the geometry could be encoded with as WKT (geosparql:wktLiteral [GeoSPARQL]) or [GML] (geosparql:asGML [GeoSPARQL])."}
     {:rdf/language "it",
      :rdf/value
      "Il range di questa proprietà è volutamente generica, con lo scopo di consentire diverse codifiche geometriche. Ad esempio, la geometria potrebbe essere codificata con WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL])."}}})

(def byteSize
  {:db/ident :dcat/byteSize,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment #{{:rdf/language "fr",
                    :rdf/value    "La taille de la distribution en octects"}
                   {:rdf/language "en",
                    :rdf/value    "The size of a distribution in bytes."}
                   {:rdf/language "da",
                    :rdf/value
                    "Størrelsen af en distributionen angivet i bytes."}
                   {:rdf/language "es",
                    :rdf/value    "El tamaño de una distribución en bytes."}
                   {:rdf/language "it",
                    :rdf/value    "La dimensione di una distribuzione in byte."}
                   {:rdf/language "cs",
                    :rdf/value    "Velikost distribuce v bajtech."}
                   {:rdf/language "el",
                    :rdf/value    "Το μέγεθος μιας διανομής σε bytes."}
                   {:rdf/language "ar",
                    :rdf/value    "الحجم بالبايتات "}
                   {:rdf/language "ja",
                    :rdf/value    "バイトによる配信のサイズ。"}},
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "byte size"}
                 {:rdf/language "it",
                  :rdf/value    "dimensione in byte"}
                 {:rdf/language "es",
                  :rdf/value    "tamaño en bytes"}
                 {:rdf/language "da",
                  :rdf/value    "bytestørrelse"}
                 {:rdf/language "ar",
                  :rdf/value    "الحجم بالبايت"}
                 {:rdf/language "cs",
                  :rdf/value    "velikost v bajtech"}
                 {:rdf/language "ja",
                  :rdf/value    "バイト・サイズ"}
                 {:rdf/language "fr",
                  :rdf/value    "taille en octects"}
                 {:rdf/language "el",
                  :rdf/value    "μέγεθος σε bytes"}},
   :rdfs/range :rdfs/Literal,
   :skos/definition #{{:rdf/language "en",
                       :rdf/value    "The size of a distribution in bytes."}
                      {:rdf/language "fr",
                       :rdf/value    "La taille de la distribution en octects."}
                      {:rdf/language "es",
                       :rdf/value    "El tamaño de una distribución en bytes."}
                      {:rdf/language "da",
                       :rdf/value
                       "Størrelsen af en distribution angivet i bytes."}
                      {:rdf/language "it",
                       :rdf/value "La dimensione di una distribuzione in byte."}
                      {:rdf/language "cs",
                       :rdf/value    "Velikost distribuce v bajtech."}
                      {:rdf/language "el",
                       :rdf/value    "Το μέγεθος μιας διανομής σε bytes."}
                      {:rdf/language "ar",
                       :rdf/value    "الحجم بالبايتات "}
                      {:rdf/language "ja",
                       :rdf/value    "バイトによる配信のサイズ。"}},
   :skos/scopeNote
   #{{:rdf/language "da",
      :rdf/value
      "Bytestørrelsen kan approximeres hvis den præcise størrelse ikke er kendt. Værdien af dcat:byteSize bør angives som xsd:decimal."}
     {:rdf/language "it",
      :rdf/value
      "La dimensione in byte può essere approssimata quando non si conosce la dimensione precisa. Il valore di dcat:byteSize dovrebbe essere espresso come un xsd:decimal."}
     {:rdf/language "fr",
      :rdf/value
      "La taille en octects peut être approximative lorsque l'on ignore la taille réelle. La valeur littérale de dcat:byteSize doit être de type xsd:decimal."}
     {:rdf/language "en",
      :rdf/value
      "The size in bytes can be approximated when the precise size is not known. The literal value of dcat:byteSize should by typed as xsd:decimal."}
     {:rdf/language "ar",
      :rdf/value    "الحجم يمكن أن يكون تقريبي إذا كان الحجم الدقيق غير معروف"}
     {:rdf/language "es",
      :rdf/value
      "El tamaño en bytes puede ser aproximado cuando se desconoce el tamaño exacto. El valor literal de dcat:byteSize debe tener tipo 'xsd:decimal'."}
     {:rdf/language "ja",
      :rdf/value    "正確なサイズが不明である場合、サイズは、バイトによる近似値を示すことができます。"}
     {:rdf/language "el",
      :rdf/value
      "Το μέγεθος σε bytes μπορεί να προσεγγιστεί όταν η ακριβής τιμή δεν είναι γνωστή. Η τιμή της dcat:byteSize θα πρέπει να δίνεται με τύπο δεδομένων xsd:decimal."}
     {:rdf/language "cs",
      :rdf/value
      "Velikost v bajtech může být přibližná, pokud její přesná hodnota není známa. Literál s hodnotou dcat:byteSize by měl mít datový typ xsd:decimal."}}})

(def catalog
  {:db/ident :dcat/catalog,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A catalog whose contents are of interest in the context of this catalog."}
     {:rdf/language "es",
      :rdf/value
      "Un catálogo cuyo contenido es de interés en el contexto del catálogo que está siendo descripto."}
     {:rdf/language "cs",
      :rdf/value "Katalog, jehož obsah je v kontextu tohoto katalogu zajímavý."}
     {:rdf/language "it",
      :rdf/value
      "Un catalogo i cui contenuti sono di interesse nel contesto di questo catalogo."}
     {:rdf/language "da",
      :rdf/value
      "Et katalog hvis indhold er relevant i forhold til det aktuelle katalog."}},
   :rdfs/domain :dcat/Catalog,
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "catalogo"}
                 {:rdf/language "da",
                  :rdf/value    "katalog"}
                 {:rdf/language "es",
                  :rdf/value    "catálogo"}
                 {:rdf/language "cs",
                  :rdf/value    "katalog"}
                 {:rdf/language "en",
                  :rdf/value    "catalog"}},
   :rdfs/range :dcat/Catalog,
   :rdfs/subPropertyOf #{:dcterms/hasPart :rdfs/member},
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "har delkatalog"},
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad agregada en DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "en",
      :rdf/value
      "A catalog whose contents are of interest in the context of this catalog."}
     {:rdf/language "es",
      :rdf/value
      "Un catálogo cuyo contenido es de interés en el contexto del catálogo que está siendo descripto."}
     {:rdf/language "cs",
      :rdf/value "Katalog, jehož obsah je v kontextu tohoto katalogu zajímavý."}
     {:rdf/language "it",
      :rdf/value
      "Un catalogo i cui contenuti sono di interesse nel contesto di questo catalogo."}
     {:rdf/language "da",
      :rdf/value
      "Et katalog hvis indhold er relevant i forhold til det aktuelle katalog."}}})

(def centroid
  {:db/ident :dcat/centroid,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :dcterms/Location,
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "centroid"}
                 {:rdf/language "it",
                  :rdf/value    "centroide"}
                 {:rdf/language "cs",
                  :rdf/value    "centroid"}
                 {:rdf/language "es",
                  :rdf/value    "centroide"}
                 {:rdf/language "da",
                  :rdf/value    "geometrisk tyngdepunkt"}},
   :rdfs/range :rdfs/Literal,
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "centroide"},
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad agregada en DCAT 2.0."}
                      {:rdf/language "da",
                       :rdf/value    "Ny egenskab tilføjet i DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "it",
      :rdf/value    "Il centro geografico (centroide) di una risorsa."}
     {:rdf/language "da",
      :rdf/value    "Det geometrisk tyngdepunkt (centroid) for en ressource."}
     {:rdf/language "en",
      :rdf/value    "The geographic center (centroid) of a resource."}
     {:rdf/language "cs",
      :rdf/value    "Geografický střed (centroid) zdroje."}
     {:rdf/language "es",
      :rdf/value    "El centro geográfico (centroide) de un recurso."}},
   :skos/scopeNote
   #{{:rdf/language "cs",
      :rdf/value
      "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé kódování geometrií. Geometrie by kupříkladu mohla být kódována jako WKT (geosparql:wktLiteral [GeoSPARQL]) či [GML] (geosparql:asGML [GeoSPARQL])."}
     {:rdf/language "en",
      :rdf/value
      "The range of this property is intentionally generic, with the purpose of allowing different geometry encodings. E.g., the geometry could be encoded with as WKT (geosparql:wktLiteral [GeoSPARQL]) or [GML] (geosparql:asGML [GeoSPARQL])."}
     {:rdf/language "es",
      :rdf/value
      "El rango de esta propiedad es intencionalmente genérico con el objetivo de permitir distintas codificaciones geométricas. Por ejemplo, la geometría puede codificarse como WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL])."}
     {:rdf/language "da",
      :rdf/value
      "Rækkevidden for denne egenskab er bevidst generisk definere med det formål at tillade forskellige geokodninger. Geometrien kan eksempelvis repræsenteres som WKT (geosparql:asWKT [GeoSPARQL]) eller [GML] (geosparql:asGML [GeoSPARQL])."}
     {:rdf/language "it",
      :rdf/value
      "Il range di questa proprietà è volutamente generica, con lo scopo di consentire diverse codifiche geometriche. Ad esempio, la geometria potrebbe essere codificata con WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL])."}}})

(def compressFormat
  {:db/ident :dcat/compressFormat,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "it",
      :rdf/value
      "Il formato di compressione della distribuzione nel quale i dati sono in forma compressa, ad es. per ridurre le dimensioni del file da scaricare."}
     {:rdf/language "cs",
      :rdf/value
      "Formát komprese souboru, ve kterém jsou data poskytována v komprimované podobě, např. ke snížení velikosti souboru ke stažení."}
     {:rdf/language "en",
      :rdf/value
      "The compression format of the distribution in which the data is contained in a compressed form, e.g. to reduce the size of the downloadable file."}
     {:rdf/language "es",
      :rdf/value
      "El formato de la distribución en el que los datos están en forma comprimida, e.g. para reducir el tamaño del archivo a bajar."}
     {:rdf/language "da",
      :rdf/value
      "Kompressionsformatet for distributionen som indeholder data i et komprimeret format, fx for at reducere størrelsen af downloadfilen."}},
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/TR/vocab-dcat-2/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "formato de compresión"}
                 {:rdf/language "en",
                  :rdf/value    "compression format"}
                 {:rdf/language "it",
                  :rdf/value    "formato di compressione"}
                 {:rdf/language "da",
                  :rdf/value    "kompressionsformat"}
                 {:rdf/language "cs",
                  :rdf/value    "formát komprese"}},
   :rdfs/range :dcterms/MediaType,
   :rdfs/subPropertyOf :dcterms/format,
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad agregada en DCAT 2.0."}
                      {:rdf/language "da",
                       :rdf/value    "Ny egenskab tilføjet i DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "it",
      :rdf/value
      "Il formato di compressione della distribuzione nel quale i dati sono in forma compressa, ad es. per ridurre le dimensioni del file da scaricare."}
     {:rdf/language "cs",
      :rdf/value
      "Formát komprese souboru, ve kterém jsou data poskytována v komprimované podobě, např. ke snížení velikosti souboru ke stažení."}
     {:rdf/language "en",
      :rdf/value
      "The compression format of the distribution in which the data is contained in a compressed form, e.g. to reduce the size of the downloadable file."}
     {:rdf/language "es",
      :rdf/value
      "El formato de la distribución en el que los datos están en forma comprimida, e.g. para reducir el tamaño del archivo a bajar."}
     {:rdf/language "da",
      :rdf/value
      "Kompressionsformatet for distributionen som indeholder data i et komprimeret format, fx for at reducere størrelsen af downloadfilen."}},
   :skos/scopeNote
   #{{:rdf/language "da",
      :rdf/value
      "Denne egenskab kan anvendes når filerne i en distribution er blevet komprimeret, fx i en ZIP-fil. Formatet BØR udtrykkes ved en medietype som defineret i 'IANA media types registry', hvis der optræder en relevant medietype dér: https://www.iana.org/assignments/media-types/."}
     {:rdf/language "en",
      :rdf/value
      "This property is to be used when the files in the distribution are compressed, e.g. in a ZIP file. The format SHOULD be expressed using a media type as defined by IANA media types registry https://www.iana.org/assignments/media-types/, if available."}
     {:rdf/language "cs",
      :rdf/value
      "Tato vlastnost se použije, když jsou soubory v distribuci komprimovány, např. v ZIP souboru. Formát BY MĚL být vyjádřen pomocí typu média definovaného v registru IANA https://www.iana.org/assignments/media-types/, pokud existuje."}
     {:rdf/language "it",
      :rdf/value
      "Questa proprietà deve essere utilizzata quando i file nella distribuzione sono compressi, ad es. in un file ZIP. Il formato DOVREBBE essere espresso usando un tipo di media come definito dal registro dei tipi di media IANA https://www.iana.org/assignments/media-types/, se disponibile."}
     {:rdf/language "es",
      :rdf/value
      "Esta propiedad se debe usar cuando los archivos de la distribución están comprimidos, por ejemplo en un archivo ZIP. El formato DEBERÍA expresarse usando un 'media type', tales como los definidos en el registro IANA de 'media types' https://www.iana.org/assignments/media-types/, si está disponibles."}}})

(def contactPoint
  {:db/ident :dcat/contactPoint,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "ar",
      :rdf/value    "تربط قائمة البيانات بعنوان اتصال موصف  باستخدام VCard"}
     {:rdf/language "ja",
      :rdf/value    "データセットを、VCardを用いて提供されている適切な連絡先情報にリンクします。"}
     {:rdf/language "es",
      :rdf/value
      "Información relevante de contacto para el recurso catalogado. Se recomienda el uso de vCard."}
     {:rdf/language "el",
      :rdf/value
      "Συνδέει ένα σύνολο δεδομένων με ένα σχετικό σημείο επικοινωνίας, μέσω VCard."}
     {:rdf/language "en",
      :rdf/value
      "Relevant contact information for the catalogued resource. Use of vCard is recommended."}
     {:rdf/language "cs",
      :rdf/value
      "Relevantní kontaktní informace pro katalogizovaný zdroj. Doporučuje se použít slovník VCard."}
     {:rdf/language "it",
      :rdf/value
      "Informazioni di contatto rilevanti per la risorsa catalogata. Si raccomanda l'uso di vCard."}
     {:rdf/language "fr",
      :rdf/value
      "Relie un jeu de données à une information de contact utile en utilisant VCard."}
     {:rdf/language "da",
      :rdf/value
      "Relevante kontaktoplysninger for den katalogiserede ressource. Anvendelse af vCard anbefales."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "point de contact"}
                 {:rdf/language "en",
                  :rdf/value    "contact point"}
                 {:rdf/language "da",
                  :rdf/value    "kontaktpunkt"}
                 {:rdf/language "el",
                  :rdf/value    "σημείο επικοινωνίας"}
                 {:rdf/language "ja",
                  :rdf/value    "窓口"}
                 {:rdf/language "es",
                  :rdf/value    "Punto de contacto"}
                 {:rdf/language "it",
                  :rdf/value    "punto di contatto"}
                 {:rdf/language "ar",
                  :rdf/value    "عنوان اتصال"}
                 {:rdf/language "cs",
                  :rdf/value    "kontaktní bod"}},
   :rdfs/range :vcard/Kind,
   :skos/definition
   #{{:rdf/language "ar",
      :rdf/value    "تربط قائمة البيانات بعنوان اتصال موصف  باستخدام VCard"}
     {:rdf/language "ja",
      :rdf/value    "データセットを、VCardを用いて提供されている適切な連絡先情報にリンクします。"}
     {:rdf/language "es",
      :rdf/value
      "Información relevante de contacto para el recurso catalogado. Se recomienda el uso de vCard."}
     {:rdf/language "el",
      :rdf/value
      "Συνδέει ένα σύνολο δεδομένων με ένα σχετικό σημείο επικοινωνίας, μέσω VCard."}
     {:rdf/language "en",
      :rdf/value
      "Relevant contact information for the catalogued resource. Use of vCard is recommended."}
     {:rdf/language "cs",
      :rdf/value
      "Relevantní kontaktní informace pro katalogizovaný zdroj. Doporučuje se použít slovník VCard."}
     {:rdf/language "it",
      :rdf/value
      "Informazioni di contatto rilevanti per la risorsa catalogata. Si raccomanda l'uso di vCard."}
     {:rdf/language "fr",
      :rdf/value
      "Relie un jeu de données à une information de contact utile en utilisant VCard."}
     {:rdf/language "da",
      :rdf/value
      "Relevante kontaktoplysninger for den katalogiserede ressource. Anvendelse af vCard anbefales."}},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Status: English Definition text modified by DCAT revision team, Italian, Spanish and Czech translations provided, other translations pending."}})

(def dataset
  {:db/ident :dcat/dataset,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value    "A collection of data that is listed in the catalog."}
     {:rdf/language "da",
      :rdf/value    "En samling af data som er opført i kataloget."}
     {:rdf/language "it",
      :rdf/value    "Una raccolta di dati che è elencata nel catalogo."}
     {:rdf/language "es",
      :rdf/value    "Un conjunto de datos que se lista en el catálogo."}
     {:rdf/language "ja",
      :rdf/value    "カタログの一部であるデータセット。"}
     {:rdf/language "cs",
      :rdf/value    "Kolekce dat, která je katalogizována v katalogu."}
     {:rdf/language "el",
      :rdf/value
      "Συνδέει έναν κατάλογο με ένα σύνολο δεδομένων το οποίο ανήκει στον εν λόγω κατάλογο."}
     {:rdf/language "ar",
      :rdf/value    "تربط الفهرس بقائمة بيانات ضمنه"}
     {:rdf/language "fr",
      :rdf/value
      "Relie un catalogue à un jeu de données faisant partie de ce catalogue."}},
   :rdfs/domain :dcat/Catalog,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "conjunto de datos"}
                 {:rdf/language "ja",
                  :rdf/value    "データセット"}
                 {:rdf/language "da",
                  :rdf/value    "datasæt"}
                 {:rdf/language "ar",
                  :rdf/value    "قائمة بيانات"}
                 {:rdf/language "it",
                  :rdf/value    "dataset"}
                 {:rdf/language "cs",
                  :rdf/value    "datová sada"}
                 {:rdf/language "fr",
                  :rdf/value    "jeu de données"}
                 {:rdf/language "el",
                  :rdf/value    "σύνολο δεδομένων"}
                 {:rdf/language "en",
                  :rdf/value    "dataset"}},
   :rdfs/range :dcat/Dataset,
   :rdfs/subPropertyOf #{:dcterms/hasPart :rdfs/member},
   :skos/altLabel #{{:rdf/language "da",
                     :rdf/value    "datasamling"}
                    {:rdf/language "da",
                     :rdf/value    "har datasæt"}},
   :skos/definition
   #{{:rdf/language "en",
      :rdf/value    "A collection of data that is listed in the catalog."}
     {:rdf/language "da",
      :rdf/value    "En samling af data som er opført i kataloget."}
     {:rdf/language "it",
      :rdf/value    "Una raccolta di dati che è elencata nel catalogo."}
     {:rdf/language "es",
      :rdf/value    "Un conjunto de datos que se lista en el catálogo."}
     {:rdf/language "ja",
      :rdf/value    "カタログの一部であるデータセット。"}
     {:rdf/language "cs",
      :rdf/value    "Kolekce dat, která je katalogizována v katalogu."}
     {:rdf/language "el",
      :rdf/value
      "Συνδέει έναν κατάλογο με ένα σύνολο δεδομένων το οποίο ανήκει στον εν λόγω κατάλογο."}
     {:rdf/language "ar",
      :rdf/value    "تربط الفهرس بقائمة بيانات ضمنه"}
     {:rdf/language "fr",
      :rdf/value
      "Relie un catalogue à un jeu de données faisant partie de ce catalogue."}},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Status: English Definition text modified by DCAT revision team, Italian, Spanish and Czech translation provided, other translations pending."}})

(def distribution
  {:db/ident :dcat/distribution,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value    "An available distribution of the dataset."}
     {:rdf/language "it",
      :rdf/value    "Una distribuzione disponibile per il set di dati."}
     {:rdf/language "da",
      :rdf/value    "En tilgængelig repræsentation af datasættet."}
     {:rdf/language "es",
      :rdf/value    "Una distribución disponible del conjunto de datos."}
     {:rdf/language "ar",
      :rdf/value "تربط قائمة البيانات بطريقة أو بشكل يسمح  الوصول الى البيانات"}
     {:rdf/language "el",
      :rdf/value
      "Συνδέει ένα σύνολο δεδομένων με μία από τις διαθέσιμες διανομές του."}
     {:rdf/language "fr",
      :rdf/value "Connecte un jeu de données à des distributions disponibles."}
     {:rdf/language "cs",
      :rdf/value    "Dostupná distribuce datové sady."}
     {:rdf/language "ja",
      :rdf/value    "データセットを、その利用可能な配信に接続します。"}},
   :rdfs/domain :dcat/Dataset,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "cs",
                  :rdf/value    "distribuce"}
                 {:rdf/language "fr",
                  :rdf/value    "distribution"}
                 {:rdf/language "en",
                  :rdf/value    "distribution"}
                 {:rdf/language "it",
                  :rdf/value    "distribuzione"}
                 {:rdf/language "es",
                  :rdf/value    "distribución"}
                 {:rdf/language "da",
                  :rdf/value    "distribution"}
                 {:rdf/language "ar",
                  :rdf/value    "توزيع"}
                 {:rdf/language "el",
                  :rdf/value    "διανομή"}
                 {:rdf/language "ja",
                  :rdf/value    "データセット配信"}},
   :rdfs/range :dcat/Distribution,
   :rdfs/subPropertyOf :dcterms/relation,
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "har distribution"},
   :skos/definition
   #{{:rdf/language "en",
      :rdf/value    "An available distribution of the dataset."}
     {:rdf/language "it",
      :rdf/value    "Una distribuzione disponibile per il set di dati."}
     {:rdf/language "da",
      :rdf/value    "En tilgængelig repræsentation af datasættet."}
     {:rdf/language "es",
      :rdf/value    "Una distribución disponible del conjunto de datos."}
     {:rdf/language "ar",
      :rdf/value "تربط قائمة البيانات بطريقة أو بشكل يسمح  الوصول الى البيانات"}
     {:rdf/language "el",
      :rdf/value
      "Συνδέει ένα σύνολο δεδομένων με μία από τις διαθέσιμες διανομές του."}
     {:rdf/language "fr",
      :rdf/value "Connecte un jeu de données à des distributions disponibles."}
     {:rdf/language "cs",
      :rdf/value    "Dostupná distribuce datové sady."}
     {:rdf/language "ja",
      :rdf/value    "データセットを、その利用可能な配信に接続します。"}},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Status: English Definition text modified by DCAT revision team, translations pending (except for Italian, Spanish and Czech)."}})

(def downloadURL
  {:db/ident :dcat/downloadURL,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "fr",
      :rdf/value
      "Ceci est un lien direct à un fichier téléchargeable en un format donnée. Exple fichier CSV ou RDF. Le format est décrit par les propriétés de distribution dct:format et/ou dcat:mediaType."}
     {:rdf/language "es",
      :rdf/value
      "La URL de un archivo descargable en el formato dato. Por ejemplo, archivo CSV o archivo RDF. El formato se describe con las propiedades de la distribución dct:format y/o dcat:mediaType."}
     {:rdf/language "da",
      :rdf/value
      "URL til fil der kan downloades i et bestemt format. Fx en CSV-fil eller en RDF-fil. Formatet for distributionen angives ved hjælp af egenskaberne dct:format og/eller dcat:mediaType."}
     {:rdf/language "en",
      :rdf/value
      "The URL of the downloadable file in a given format. E.g. CSV file or RDF file. The format is indicated by the distribution's dct:format and/or dcat:mediaType."}
     {:rdf/language "el",
      :rdf/value
      "Είναι ένας σύνδεσμος άμεσης μεταφόρτωσης ενός αρχείου σε μια δεδομένη μορφή. Π.χ. ένα αρχείο CSV ή RDF. Η μορφη αρχείου περιγράφεται από τις ιδιότητες dct:format ή/και dcat:mediaType της διανομής."}
     {:rdf/language "ja",
      :rdf/value
      "dcat:downloadURLはdcat:accessURLの特定の形式です。しかし、DCATプロファイルが非ダウンロード・ロケーションに対してのみaccessURLを用いる場合には、より強い分離を課すことを望む可能性があるため、この含意を強化しないように、DCATは、dcat:downloadURLをdcat:accessURLのサブプロパティーであると定義しません。"}
     {:rdf/language "it",
      :rdf/value
      "Questo è un link diretto al file scaricabile in un dato formato. E.g. un file CSV o un file RDF. Il formato è descritto dal dct:format e/o dal dcat:mediaType della distribuzione."}
     {:rdf/language "cs",
      :rdf/value
      "URL souboru ke stažení v daném formátu, například CSV nebo RDF soubor. Formát je popsán vlastností distribuce dct:format a/nebo dcat:mediaType."}
     {:rdf/language "ar",
      :rdf/value
      "رابط مباشر لملف يمكن تحميله. نوع الملف يتم توصيفه باستخدام الخاصية dct:format dcat:mediaType "}},
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "download URL"}
                 {:rdf/language "fr",
                  :rdf/value    "URL de téléchargement"}
                 {:rdf/language "cs",
                  :rdf/value    "URL souboru ke stažení"}
                 {:rdf/language "ja",
                  :rdf/value    "ダウンロードURL"}
                 {:rdf/language "it",
                  :rdf/value    "URL di scarico"}
                 {:rdf/language "ar",
                  :rdf/value    "رابط تحميل"}
                 {:rdf/language "da",
                  :rdf/value    "downloadURL"}
                 {:rdf/language "el",
                  :rdf/value    "URL μεταφόρτωσης"}
                 {:rdf/language "es",
                  :rdf/value    "URL de descarga"}},
   :rdfs/range :rdfs/Resource,
   :skos/definition
   #{{:rdf/language "fr",
      :rdf/value
      "Ceci est un lien direct à un fichier téléchargeable en un format donnée. Exple fichier CSV ou RDF. Le format est décrit par les propriétés de distribution dct:format et/ou dcat:mediaType."}
     {:rdf/language "es",
      :rdf/value
      "La URL de un archivo descargable en el formato dato. Por ejemplo, archivo CSV o archivo RDF. El formato se describe con las propiedades de la distribución dct:format y/o dcat:mediaType."}
     {:rdf/language "da",
      :rdf/value
      "URL til fil der kan downloades i et bestemt format. Fx en CSV-fil eller en RDF-fil. Formatet for distributionen angives ved hjælp af egenskaberne dct:format og/eller dcat:mediaType."}
     {:rdf/language "en",
      :rdf/value
      "The URL of the downloadable file in a given format. E.g. CSV file or RDF file. The format is indicated by the distribution's dct:format and/or dcat:mediaType."}
     {:rdf/language "el",
      :rdf/value
      "Είναι ένας σύνδεσμος άμεσης μεταφόρτωσης ενός αρχείου σε μια δεδομένη μορφή. Π.χ. ένα αρχείο CSV ή RDF. Η μορφη αρχείου περιγράφεται από τις ιδιότητες dct:format ή/και dcat:mediaType της διανομής."}
     {:rdf/language "ja",
      :rdf/value
      "dcat:downloadURLはdcat:accessURLの特定の形式です。しかし、DCATプロファイルが非ダウンロード・ロケーションに対してのみaccessURLを用いる場合には、より強い分離を課すことを望む可能性があるため、この含意を強化しないように、DCATは、dcat:downloadURLをdcat:accessURLのサブプロパティーであると定義しません。"}
     {:rdf/language "it",
      :rdf/value
      "Questo è un link diretto al file scaricabile in un dato formato. E.g. un file CSV o un file RDF. Il formato è descritto dal dct:format e/o dal dcat:mediaType della distribuzione."}
     {:rdf/language "cs",
      :rdf/value
      "URL souboru ke stažení v daném formátu, například CSV nebo RDF soubor. Formát je popsán vlastností distribuce dct:format a/nebo dcat:mediaType."}
     {:rdf/language "ar",
      :rdf/value
      "رابط مباشر لملف يمكن تحميله. نوع الملف يتم توصيفه باستخدام الخاصية dct:format dcat:mediaType "}},
   :skos/editorialNote
   #{{:rdf/language "en",
      :rdf/value
      "Status: English  Definition text modified by DCAT revision team, Italian, Spanish and Czech translation updated, other translations pending."}
     {:rdf/language "en",
      :rdf/value
      "rdfs:label, rdfs:comment and/or skos:scopeNote have been modified. Non-english versions must be updated."}},
   :skos/scopeNote
   #{{:rdf/language "en",
      :rdf/value
      "dcat:downloadURL SHOULD be used for the address at which this distribution is available directly, typically through a HTTP Get request."}
     {:rdf/language "it",
      :rdf/value
      "dcat:downloadURL DOVREBBE essere utilizzato per l'indirizzo a cui questa distribuzione è disponibile direttamente, in genere attraverso una richiesta Get HTTP."}
     {:rdf/language "da",
      :rdf/value
      "dcat:downloadURL BØR anvendes til angivelse af den adresse hvor distributionen er tilgængelig direkte, typisk gennem et HTTP Get request."}
     {:rdf/language "cs",
      :rdf/value
      "dcat:downloadURL BY MĚLA být použita pro adresu, ze které je distribuce přímo přístupná, typicky skrze požadavek HTTP Get."}
     {:rdf/language "el",
      :rdf/value    "Η τιμή είναι ένα URL."}
     {:rdf/language "es",
      :rdf/value    "El valor es una URL."}
     {:rdf/language "fr",
      :rdf/value    "La valeur est une URL."}}})

(def endDate
  {:db/ident :dcat/endDate,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :dcterms/PeriodOfTime,
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "data di fine"}
                 {:rdf/language "cs",
                  :rdf/value    "datum konce"}
                 {:rdf/language "en",
                  :rdf/value    "end date"}
                 {:rdf/language "da",
                  :rdf/value    "slutdato"}
                 {:rdf/language "es",
                  :rdf/value    "fecha final"}},
   :rdfs/range :rdfs/Literal,
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "sluttidspunkt"},
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad agregada en DCAT 2.0."}
                      {:rdf/language "da",
                       :rdf/value    "Ny egenskab i DCAT 2.0."}},
   :skos/definition #{{:rdf/language "cs",
                       :rdf/value    "Konec doby trvání."}
                      {:rdf/language "da",
                       :rdf/value    "Slutningen på perioden."}
                      {:rdf/language "es",
                       :rdf/value    "El fin del período."}
                      {:rdf/language "it",
                       :rdf/value    "La fine del periodo."}
                      {:rdf/language "en",
                       :rdf/value    "The end of the period."}},
   :skos/scopeNote
   #{{:rdf/language "da",
      :rdf/value
      "Rækkeviden for denne egenskab er bevidst generisk defineret med det formål at tillade forskellige niveauer af tidslig præcision ifm. angivelse af slutdatoen for en periode. Den kan eksempelvis udtrykkes som en dato (xsd:date), en dato og et tidspunkt (xsd:dateTime), eller et årstal (xsd:gYear)."}
     {:rdf/language "en",
      :rdf/value
      "The range of this property is intentionally generic, with the purpose of allowing different level of temporal precision for specifying the end of a period. E.g., it can be expressed with a date (xsd:date), a date and time (xsd:dateTime), or a year (xsd:gYear)."}
     {:rdf/language "es",
      :rdf/value
      "El rango de esta propiedad es intencionalmente genérico con el propósito de permitir distintos niveles de precisión temporal para especificar el fin del período. Por ejemplo, puede expresarse como una fecha (xsd:date), una fecha y un tiempo (xsd:dateTime), o un año (xsd:gYear)."}
     {:rdf/language "cs",
      :rdf/value
      "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé úrovně časového rozlišení pro specifikaci konce doby trvání. Ten může být kupříkladu vyjádřen datumem (xsd:date), datumem a časem (xsd:dateTime) či rokem (xsd:gYear)."}
     {:rdf/language "it",
      :rdf/value
      "La range di questa proprietà è volutamente generico, con lo scopo di consentire diversi livelli di precisione temporale per specificare la fine di un periodo. Ad esempio, può essere espresso con una data (xsd:date), una data e un'ora (xsd:dateTime), o un anno (xsd:gYear)."}}})

(def endpointDescription
  {:db/ident :dcat/endpointDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "it",
      :rdf/value
      "Una descrizione dell'endpoint del servizio, incluse le sue operazioni, parametri, ecc."}
     {:rdf/language "da",
      :rdf/value
      "En beskrivelse af det pågældende tjenesteendpoint, inklusiv dets operationer, parametre etc."}
     {:rdf/language "es",
      :rdf/value
      "Una descripción del end-point del servicio, incluyendo sus operaciones, parámetros, etc."}
     {:rdf/language "cs",
      :rdf/value
      "Popis přístupového bodu služby včetně operací, parametrů apod."}
     {:rdf/language "en",
      :rdf/value
      "A description of the service end-point, including its operations, parameters etc."}},
   :rdfs/domain :dcat/DataService,
   :rdfs/label #{{:rdf/language "cs",
                  :rdf/value    "popis přístupového bodu služby"}
                 {:rdf/language "es",
                  :rdf/value    "descripción del end-point del servicio"}
                 {:rdf/language "en",
                  :rdf/value    "description of service end-point"}
                 {:rdf/language "it",
                  :rdf/value    "descrizione dell'endpoint del servizio"}
                 {:rdf/language "da",
                  :rdf/value    "endpointbeskrivelse"}},
   :skos/changeNote #{{:rdf/language "en",
                       :rdf/value    "Nueva propiedad agregada en DCAT 2.0."}
                      {:rdf/language "it",
                       :rdf/value    "Nuova proprietà in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property in DCAT 2.0."}
                      {:rdf/language "da",
                       :rdf/value    "Ny egenskab i DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "it",
      :rdf/value
      "Una descrizione dell'endpoint del servizio, incluse le sue operazioni, parametri, ecc."}
     {:rdf/language "da",
      :rdf/value
      "En beskrivelse af det pågældende tjenesteendpoint, inklusiv dets operationer, parametre etc."}
     {:rdf/language "es",
      :rdf/value
      "Una descripción del end-point del servicio, incluyendo sus operaciones, parámetros, etc.."}
     {:rdf/language "cs",
      :rdf/value
      "Popis přístupového bodu služby včetně operací, parametrů apod."}
     {:rdf/language "en",
      :rdf/value
      "A description of the service end-point, including its operations, parameters etc."}},
   :skos/scopeNote
   #{{:rdf/language "it",
      :rdf/value
      "La descrizione dell'endpoint fornisce dettagli specifici dell'istanza dell'endpoint reale, mentre dct:conformsTo viene utilizzato per indicare lo standard o le specifiche implementate dall'endpoint."}
     {:rdf/language "cs",
      :rdf/value
      "Popis přístupového bodu může být vyjádřen ve strojově čitelné formě, například jako popis OpenAPI (Swagger), odpověď služby OGC getCapabilities, pomocí slovníku SPARQL Service Description, jako OpenSearch či WSDL document, jako popis API dle slovníku Hydra, a nebo textově nebo jiným neformálním způsobem, pokud není možno použít formální reprezentaci."}
     {:rdf/language "en",
      :rdf/value
      "The endpoint description gives specific details of the actual endpoint instance, while dct:conformsTo is used to indicate the general standard or specification that the endpoint implements."}
     {:rdf/language "es",
      :rdf/value
      "Una descripción del endpoint del servicio puede expresarse en un formato que la máquina puede interpretar, tal como una descripción basada en OpenAPI (Swagger), una respuesta OGC GetCapabilities, una descripción de un servicio SPARQL, un documento OpenSearch o WSDL, una descripción con la Hydra API, o en texto u otro modo informal si la representación formal no es posible."}
     {:rdf/language "es",
      :rdf/value
      "La descripción del endpoint brinda detalles específicos de la instancia del endpoint, mientras que dct:conformsTo se usa para indicar el estándar general o especificación que implementa el endpoint."}
     {:rdf/language "da",
      :rdf/value
      "En beskrivelse af et endpoint kan udtrykkes i et maskinlæsbart format, såsom OpenAPI (Swagger)-beskrivelser, et OGC GetCapabilities svar, en SPARQL tjenestebeskrivelse, en OpenSearch- eller et WSDL-dokument, en Hydra-API-beskrivelse, eller i tekstformat eller i et andet uformelt format, hvis en formel repræsentation ikke er mulig."}
     {:rdf/language "en",
      :rdf/value
      "An endpoint description may be expressed in a machine-readable form, such as an OpenAPI (Swagger) description, an OGC GetCapabilities response, a SPARQL Service Description, an OpenSearch or WSDL document, a Hydra API description, else in text or some other informal mode if a formal representation is not possible."}
     {:rdf/language "it",
      :rdf/value
      "Una descrizione dell'endpoint può essere espressa in un formato leggibile dalla macchina, come una descrizione OpenAPI (Swagger), una risposta GetCapabilities OGC, una descrizione del servizio SPARQL, un documento OpenSearch o WSDL, una descrizione API Hydra, o con del testo o qualche altra modalità informale se una rappresentazione formale non è possibile."}
     {:rdf/language "cs",
      :rdf/value
      "Popis přístupového bodu dává specifické detaily jeho konkrétní instance, zatímco dct:conformsTo indikuje obecný standard či specifikaci kterou přístupový bod implementuje."}
     {:rdf/language "da",
      :rdf/value
      "Endpointbeskrivelsen giver specifikke oplysninger om den konkrete endpointinstans, mens dct:conformsTo anvendes til at indikere den overordnede standard eller specifikation som endpointet er i overensstemmelse med."}}})

(def endpointURL
  {:db/ident :dcat/endpointURL,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The root location or primary endpoint of the service (a web-resolvable IRI)."}
     {:rdf/language "it",
      :rdf/value
      "La locazione principale o l'endpoint primario del servizio (un IRI risolvibile via web)."}
     {:rdf/language "cs",
      :rdf/value
      "Kořenové umístění nebo hlavní přístupový bod služby (IRI přístupné přes Web)."}
     {:rdf/language "es",
      :rdf/value
      "La posición raíz o end-point principal del servicio (una IRI web)."}
     {:rdf/language "da",
      :rdf/value
      "Rodplaceringen eller det primære endpoint for en tjeneste (en web-resolverbar IRI)."}},
   :rdfs/domain :dcat/DataService,
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "tjenesteendpoint"}
                 {:rdf/language "cs",
                  :rdf/value    "přístupový bod služby"}
                 {:rdf/language "es",
                  :rdf/value    "end-point del servicio"}
                 {:rdf/language "en",
                  :rdf/value    "service end-point"}
                 {:rdf/language "it",
                  :rdf/value    "end-point del servizio"}},
   :rdfs/range :rdfs/Resource,
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad agregada en DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property in DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "en",
      :rdf/value
      "The root location or primary endpoint of the service (a web-resolvable IRI)."}
     {:rdf/language "it",
      :rdf/value
      "La locazione principale o l'endpoint primario del servizio (un IRI risolvibile via web)."}
     {:rdf/language "cs",
      :rdf/value
      "Kořenové umístění nebo hlavní přístupový bod služby (IRI přístupné přes Web)."}
     {:rdf/language "es",
      :rdf/value
      "La posición raíz o end-point principal del servicio (una IRI web)."}
     {:rdf/language "da",
      :rdf/value
      "Rodplaceringen eller det primære endpoint for en tjeneste (en web-resolverbar IRI)."}}})

(def hadRole
  {:db/ident :dcat/hadRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "da",
      :rdf/value
      "Den funktion en entitet eller aktør har i forhold til en anden ressource."}
     {:rdf/language "es",
      :rdf/value
      "La función de una entidad o agente con respecto a otra entidad o recurso."}
     {:rdf/language "it",
      :rdf/value
      "La funzione di un'entità o un agente rispetto ad un'altra entità o risorsa."}
     {:rdf/language "cs",
      :rdf/value "Funkce entity či agenta ve vztahu k jiné entitě či zdroji."}
     {:rdf/language "en",
      :rdf/value
      "The function of an entity or agent with respect to another entity or resource."}},
   :rdfs/domain {:owl/unionOf [:prov/Attribution :dcat/Relationship],
                 :rdf/type    :owl/Class},
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "havde rolle"}
                 {:rdf/language "en",
                  :rdf/value    "hadRole"}
                 {:rdf/language "it",
                  :rdf/value    "tiene rol"}
                 {:rdf/language "it",
                  :rdf/value    "haRuolo"}
                 {:rdf/language "cs",
                  :rdf/value    "sehraná role"}},
   :rdfs/range :dcat/Role,
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad agregada en DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "da",
      :rdf/value
      "Den funktion en entitet eller aktør har i forhold til en anden ressource."}
     {:rdf/language "es",
      :rdf/value
      "La función de una entidad o agente con respecto a otra entidad o recurso."}
     {:rdf/language "it",
      :rdf/value
      "La funzione di un'entità o un agente rispetto ad un'altra entità o risorsa."}
     {:rdf/language "cs",
      :rdf/value "Funkce entity či agenta ve vztahu k jiné entitě či zdroji."}
     {:rdf/language "en",
      :rdf/value
      "The function of an entity or agent with respect to another entity or resource."}},
   :skos/editorialNote
   #{{:rdf/language "cs",
      :rdf/value
      "Přidáno do DCAT pro doplnění vlastnosti prov:hadRole (jejíž užití je omezeno na role v kontextu aktivity, s definičním oborem prov:Association)."}
     {:rdf/language "en",
      :rdf/value
      "Introduced into DCAT to complement prov:hadRole (whose use is limited to roles in the context of an activity, with the domain of prov:Association."}
     {:rdf/language "es",
      :rdf/value
      "Agregada en DCAT para complementar prov:hadRole (cuyo uso está limitado a roles en el contexto de una actividad, con dominio prov:Association."}
     {:rdf/language "da",
      :rdf/value
      "Introduceret i DCAT for at supplere prov:hadRole (hvis anvendelse er begrænset til roller i forbindelse med en aktivitet med domænet prov:Association)."}
     {:rdf/language "it",
      :rdf/value
      "Introdotta in DCAT per completare prov:hadRole (il cui uso è limitato ai ruoli nel contesto di un'attività, con il dominio di prov:Association."}},
   :skos/scopeNote
   #{{:rdf/language "cs",
      :rdf/value
      "Může být použito v kvalifikovaném vztahu pro specifikaci role Entity ve vztahu k jiné Entitě. Je doporučeno použít hodnotu z řízeného slovníku rolí entit, jako například ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, MARC relators https://id.loc.gov/vocabulary/relators."}
     {:rdf/language "en",
      :rdf/value
      "May be used in a qualified-attribution to specify the role of an Agent with respect to an Entity. It is recommended that the value be taken from a controlled vocabulary of agent roles, such as http://registry.it.csiro.au/def/isotc211/CI_RoleCode."}
     {:rdf/language "cs",
      :rdf/value
      "Může být použito v kvalifikovaném přiřazení pro specifikaci role Agenta ve vztahu k Entitě. Je doporučeno hodnotu vybrat z řízeného slovníku rolí agentů, jako například http://registry.it.csiro.au/def/isotc211/CI_RoleCode."}
     {:rdf/language "da",
      :rdf/value
      "Kan vendes ved kvalificerede krediteringer til at angive en aktørs rolle i forhold en entitet. Det anbefales at værdierne styres som et kontrolleret udfaldsrum med aktørroller, såsom http://registry.it.csiro.au/def/isotc211/CI_RoleCode."}
     {:rdf/language "es",
      :rdf/value
      "Puede usarse en una atribución cualificada para especificar el rol de una Entidad con respecto a otra Entidad. Se recomienda que su valor se tome de un vocabulario controlado de roles de entidades como por ejemplo: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation; esquema de metadatos de DataCite; MARC relators https://id.loc.gov/vocabulary/relators."}
     {:rdf/language "en",
      :rdf/value
      "May be used in a qualified-relation to specify the role of an Entity with respect to another Entity.  It is recommended that the value be taken from a controlled vocabulary of entity roles such as: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation; DataCite metadata schema; MARC relators https://id.loc.gov/vocabulary/relators."}
     {:rdf/language "es",
      :rdf/value
      "Puede usarse en una atribución cualificada para especificar el rol de un Agente con respecto a una Entidad. Se recomienda que el valor sea de un vocabulario controlado de roles de agentes, como por ejemplo http://registry.it.csiro.au/def/isotc211/CI_RoleCode."}
     {:rdf/language "it",
      :rdf/value
      "Può essere utilizzato in un'attribuzione qualificata per specificare il ruolo di un agente rispetto a un'entità. Si raccomanda che il valore sia preso da un vocabolario controllato di ruoli di agente, come ad esempio http://registry.it.csiro.au/def/isotc211/CI_RoleCode."}
     {:rdf/language "it",
      :rdf/value
      "Può essere utilizzata in una relazione qualificata per specificare il ruolo di un'entità rispetto a un'altra entità. Si raccomanda che il valore sia preso da un vocabolario controllato di ruoli di entità come ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, o MARC relators https://id.loc.gov/vocabulary/relators."}}})

(def keyword
  {:db/ident :dcat/keyword,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "ja",
      :rdf/value    "データセットを記述しているキーワードまたはタグ。"}
     {:rdf/language "es",
      :rdf/value    "Una palabra clave o etiqueta que describe un recurso."}
     {:rdf/language "fr",
      :rdf/value    "Un mot-clé ou étiquette décrivant une ressource."}
     {:rdf/language "el",
      :rdf/value
      "Μία λέξη-κλειδί ή μία ετικέτα που περιγράφει το σύνολο δεδομένων."}
     {:rdf/language "da",
      :rdf/value    "Et nøgleord eller tag til beskrivelse af en ressource."}
     {:rdf/language "en",
      :rdf/value    "A keyword or tag describing a resource."}
     {:rdf/language "ar",
      :rdf/value    "كلمة  مفتاحيه توصف قائمة البيانات"}
     {:rdf/language "it",
      :rdf/value "Una parola chiave o un'etichetta per descrivere la risorsa."}
     {:rdf/language "cs",
      :rdf/value    "Klíčové slovo nebo značka popisující zdroj."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "el",
                  :rdf/value    "λέξη-κλειδί"}
                 {:rdf/language "en",
                  :rdf/value    "keyword"}
                 {:rdf/language "cs",
                  :rdf/value    "klíčové slovo"}
                 {:rdf/language "ar",
                  :rdf/value    "كلمة  مفتاحية "}
                 {:rdf/language "ja",
                  :rdf/value    "キーワード/タグ"}
                 {:rdf/language "it",
                  :rdf/value    "parola chiave"}
                 {:rdf/language "fr",
                  :rdf/value    "mot-clés "}
                 {:rdf/language "da",
                  :rdf/value    "nøgleord"}
                 {:rdf/language "es",
                  :rdf/value    "palabra clave"}},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/subject,
   :skos/definition
   #{{:rdf/language "ja",
      :rdf/value    "データセットを記述しているキーワードまたはタグ。"}
     {:rdf/language "es",
      :rdf/value    "Una palabra clave o etiqueta que describe un recurso."}
     {:rdf/language "fr",
      :rdf/value    "Un mot-clé ou étiquette décrivant une ressource."}
     {:rdf/language "el",
      :rdf/value
      "Μία λέξη-κλειδί ή μία ετικέτα που περιγράφει το σύνολο δεδομένων."}
     {:rdf/language "da",
      :rdf/value    "Et nøgleord eller tag til beskrivelse af en ressource."}
     {:rdf/language "en",
      :rdf/value    "A keyword or tag describing a resource."}
     {:rdf/language "ar",
      :rdf/value    "كلمة  مفتاحيه توصف قائمة البيانات"}
     {:rdf/language "it",
      :rdf/value "Una parola chiave o un'etichetta per descrivere la risorsa."}
     {:rdf/language "cs",
      :rdf/value    "Klíčové slovo nebo značka popisující zdroj."}}})

(def landingPage
  {:db/ident :dcat/landingPage,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "da",
      :rdf/value
      "En webside som der kan navigeres til i en webbrowser for at få adgang til kataloget, et datasæt, dets distributioner og/eller yderligere information."}
     {:rdf/language "el",
      :rdf/value
      "Μία ιστοσελίδα πλοηγίσιμη μέσω ενός φυλλομετρητή (Web browser) που δίνει πρόσβαση στο σύνολο δεδομένων, τις διανομές αυτού ή/και επιπρόσθετες πληροφορίες."}
     {:rdf/language "en",
      :rdf/value
      "A Web page that can be navigated to in a Web browser to gain access to the catalog, a dataset, its distributions and/or additional information."}
     {:rdf/language "cs",
      :rdf/value
      "Webová stránka, na kterou lze pro získání přístupu ke katalogu, datové sadě, jejím distribucím a/nebo dalším informacím přistoupit webovým prohlížečem."}
     {:rdf/language "ar",
      :rdf/value
      "صفحة وب يمكن من خلالها الوصول الى قائمة البيانات أو إلى معلومات إضافية متعلقة بها "}
     {:rdf/language "it",
      :rdf/value
      "Una pagina web che può essere navigata per ottenere l'accesso al catalogo, ad un dataset, alle distribuzioni del dataset e/o ad informazioni addizionali."}
     {:rdf/language "fr",
      :rdf/value
      "Une page Web accessible par un navigateur Web donnant accès au catalogue, un jeu de données, ses distributions et/ou des informations additionnelles."}
     {:rdf/language "es",
      :rdf/value
      "Una página web que puede ser visitada en un explorador Web para tener acceso el catálogo, un conjunto de datos, sus distribuciones y/o información adicional."}
     {:rdf/language "ja",
      :rdf/value "データセット、その配信および（または）追加情報にアクセスするためにウエブ・ブラウザでナビゲートできるウェブページ。"}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "el",
                  :rdf/value    "ιστοσελίδα αρχικής πρόσβασης"}
                 {:rdf/language "ja",
                  :rdf/value    "ランディング・ページ"}
                 {:rdf/language "da",
                  :rdf/value    "destinationsside"}
                 {:rdf/language "cs",
                  :rdf/value    "vstupní stránka"}
                 {:rdf/language "fr",
                  :rdf/value    "page d'atterrissage"}
                 {:rdf/language "ar",
                  :rdf/value    "صفحة وصول"}
                 {:rdf/language "it",
                  :rdf/value    "pagina di destinazione"}
                 {:rdf/language "es",
                  :rdf/value    "página de destino"}
                 {:rdf/language "en",
                  :rdf/value    "landing page"}},
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/page,
   :skos/definition
   #{{:rdf/language "el",
      :rdf/value
      "Μία ιστοσελίδα πλοηγίσιμη μέσω ενός φυλλομετρητή (Web browser) που δίνει πρόσβαση στο σύνολο δεδομένων, τις διανομές αυτού ή/και επιπρόσθετες πληροφορίες."}
     {:rdf/language "en",
      :rdf/value
      "A Web page that can be navigated to in a Web browser to gain access to the catalog, a dataset, its distributions and/or additional information."}
     {:rdf/language "cs",
      :rdf/value
      "Webová stránka, na kterou lze pro získání přístupu ke katalogu, datové sadě, jejím distribucím a/nebo dalším informacím přistoupit webovým prohlížečem."}
     {:rdf/language "ar",
      :rdf/value
      "صفحة وب يمكن من خلالها الوصول الى قائمة البيانات أو إلى معلومات إضافية متعلقة بها "}
     {:rdf/language "it",
      :rdf/value
      "Una pagina web che può essere navigata per ottenere l'accesso al catalogo, ad un dataset, alle distribuzioni del dataset e/o ad informazioni addizionali."}
     {:rdf/language "da",
      :rdf/value
      "En webside som en webbrowser kan navigeres til for at få adgang til kataloget, et datasæt, dets distritbutioner og/eller yderligere information."}
     {:rdf/language "fr",
      :rdf/value
      "Une page Web accessible par un navigateur Web donnant accès au catalogue, un jeu de données, ses distributions et/ou des informations additionnelles."}
     {:rdf/language "es",
      :rdf/value
      "Una página web que puede ser visitada en un explorador Web para tener acceso el catálogo, un conjunto de datos, sus distribuciones y/o información adicional."}
     {:rdf/language "ja",
      :rdf/value "データセット、その配信および（または）追加情報にアクセスするためにウエブ・ブラウザでナビゲートできるウェブページ。"}},
   :skos/scopeNote
   #{{:rdf/language "fr",
      :rdf/value
      "Si la distribution est seulement accessible à travers une page d'atterrissage (exple. pas de connaissance d'URLS de téléchargement direct ), alors le lien de la page d'atterrissage doit être dupliqué comme accessURL sur la distribution."}
     {:rdf/language "cs",
      :rdf/value
      "Pokud je distribuce dostupná pouze přes vstupní stránku, t.j. přímý URL odkaz ke stažení není znám, URL přístupové stránky by mělo být duplikováno ve vlastnosti distribuce accessURL."}
     {:rdf/language "da",
      :rdf/value
      "Hvis en eller flere distributioner kun er tilgængelige via en destinationsside (dvs. en URL til direkte download er ikke kendt), så bør destinationssidelinket gentages som adgangsadresse for en distribution."}
     {:rdf/language "en",
      :rdf/value
      "If the distribution(s) are accessible only through a landing page (i.e. direct download URLs are not known), then the landing page link should be duplicated as accessURL on a distribution."}
     {:rdf/language "ja",
      :rdf/value
      "ランディング・ページを通じてしか配信にアクセスできない場合（つまり、直接的なダウンロードURLが不明）には、配信におけるaccessURLとしてランディング・ページのリンクをコピーすべきです（SHOULD）。"}
     {:rdf/language "it",
      :rdf/value
      "Se la distribuzione è accessibile solo attraverso una pagina di destinazione (cioè, un URL di download diretto non è noto), il link alla pagina di destinazione deve essere duplicato come accessURL sulla distribuzione."}
     {:rdf/language "el",
      :rdf/value
      "Αν η/οι διανομή/ές είναι προσβάσιμη/ες μόνο μέσω μίας ιστοσελίδας αρχικής πρόσβασης (δηλαδή αν δεν υπάρχουν γνωστές διευθύνσεις άμεσης μεταφόρτωσης), τότε ο σύνδεσμος της ιστοσελίδας αρχικής πρόσβασης πρέπει να αναπαραχθεί ως accessURL σε μία διανομή."}
     {:rdf/language "es",
      :rdf/value
      "Si la distribución es accesible solamente través de una página de aterrizaje (i.e., no se conoce una URL de descarga directa), entonces el enlance a la página de aterrizaje debe ser duplicado como accessURL sobre la distribución."}}})

(def mediaType
  {:db/ident :dcat/mediaType,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "it",
      :rdf/value "Il tipo di media della distribuzione come definito da IANA"}
     {:rdf/language "ja",
      :rdf/value
      "このプロパティーは、配信のメディア・タイプがIANAで定義されているときに使用すべきで（SHOULD）、そうでない場合には、dct:formatを様々な値と共に使用できます（MAY）。"}
     {:rdf/language "en",
      :rdf/value    "The media type of the distribution as defined by IANA"}
     {:rdf/language "da",
      :rdf/value "Medietypen for distributionen som den er defineret af IANA."}
     {:rdf/language "cs",
      :rdf/value    "Typ média distribuce definovaný v IANA."}
     {:rdf/language "es",
      :rdf/value
      "Esta propiedad debe ser usada cuando está definido el tipo de media de la distribución en IANA, de otra manera dct:format puede ser utilizado con diferentes valores"}
     {:rdf/language "el",
      :rdf/value
      "Η ιδιότητα αυτή ΘΑ ΠΡΕΠΕΙ να χρησιμοποιείται όταν ο τύπος μέσου μίας διανομής είναι ορισμένος στο IANA, αλλιώς η ιδιότητα dct:format ΔΥΝΑΤΑΙ να χρησιμοποιηθεί με διαφορετικές τιμές."}
     {:rdf/language "ar",
      :rdf/value    "يجب استخدام هذه الخاصية إذا كان نوع الملف معرف ضمن IANA"}
     {:rdf/language "fr",
      :rdf/value
      "Cette propriété doit être utilisée quand c'est définit le type de média de la distribution en IANA, sinon dct:format DOIT être utilisé avec différentes valeurs."}},
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "tipo de media"}
                 {:rdf/language "ja",
                  :rdf/value    "メディア・タイプ"}
                 {:rdf/language "el",
                  :rdf/value    "τύπος μέσου"}
                 {:rdf/language "cs",
                  :rdf/value    "typ média"}
                 {:rdf/language "en",
                  :rdf/value    "media type"}
                 {:rdf/language "it",
                  :rdf/value    "tipo di media"}
                 {:rdf/language "da",
                  :rdf/value    "medietype"}
                 {:rdf/language "ar",
                  :rdf/value    "نوع الميديا"}
                 {:rdf/language "fr",
                  :rdf/value    "type de média"}},
   :rdfs/range :dcterms/MediaType,
   :rdfs/subPropertyOf :dcterms/format,
   :skos/changeNote
   #{{:rdf/language "en",
      :rdf/value
      "The range of dcat:mediaType has been tightened as part of the revision of DCAT."}
     {:rdf/language "it",
      :rdf/value
      "Il range di dcat:mediaType è stato ristretto  come parte della revisione di DCAT."}
     {:rdf/language "cs",
      :rdf/value "Obor hodnot dcat:mediaType byl zúžen v této revizi DCAT."}},
   :skos/definition
   #{{:rdf/language "es",
      :rdf/value
      "Esta propiedad debe ser usada cuando está definido el tipo de media de la distribución en IANA, de otra manera dct:format puede ser utilizado con diferentes valores."}
     {:rdf/language "ja",
      :rdf/value
      "このプロパティーは、配信のメディア・タイプがIANAで定義されているときに使用すべきで（SHOULD）、そうでない場合には、dct:formatを様々な値と共に使用できます（MAY）。"}
     {:rdf/language "en",
      :rdf/value    "The media type of the distribution as defined by IANA."}
     {:rdf/language "da",
      :rdf/value "Medietypen for distributionen som den er defineret af IANA."}
     {:rdf/language "cs",
      :rdf/value    "Typ média distribuce definovaný v IANA."}
     {:rdf/language "el",
      :rdf/value
      "Η ιδιότητα αυτή ΘΑ ΠΡΕΠΕΙ να χρησιμοποιείται όταν ο τύπος μέσου μίας διανομής είναι ορισμένος στο IANA, αλλιώς η ιδιότητα dct:format ΔΥΝΑΤΑΙ να χρησιμοποιηθεί με διαφορετικές τιμές."}
     {:rdf/language "it",
      :rdf/value "Il tipo di media della distribuzione come definito da IANA."}
     {:rdf/language "ar",
      :rdf/value    "يجب استخدام هذه الخاصية إذا كان نوع الملف معرف ضمن IANA"}
     {:rdf/language "fr",
      :rdf/value
      "Cette propriété doit être utilisée quand c'est définit le type de média de la distribution en IANA, sinon dct:format DOIT être utilisé avec différentes valeurs."}},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Status: English Definition text modified by DCAT revision team, Italian and Czech translation provided, other translations pending. Note some inconsistency on def vs. usage."},
   :skos/scopeNote
   #{{:rdf/language "it",
      :rdf/value
      "Questa proprietà DEVE essere usata quando il tipo di media della distribuzione è definito nel registro dei tipi di media IANA https://www.iana.org/assignments/media-types/, altrimenti dct:format PUO 'essere usato con differenti valori."}
     {:rdf/language "cs",
      :rdf/value
      "Tato vlastnost BY MĚLA být použita, je-li typ média distribuce definován v registru IANA https://www.iana.org/assignments/media-types/. V ostatních případech MŮŽE být použita vlastnost dct:format s jinými hodnotami."}
     {:rdf/language "da",
      :rdf/value
      "Denne egenskab BØR anvendes hvis distributionens medietype optræder i 'IANA media types registry' https://www.iana.org/assignments/media-types/, ellers KAN egenskaben dct:format anvendes med et andet udfaldsrum."}
     {:rdf/language "en",
      :rdf/value
      "This property SHOULD be used when the media type of the distribution is defined in the IANA media types registry https://www.iana.org/assignments/media-types/, otherwise dct:format MAY be used with different values."}
     {:rdf/language "es",
      :rdf/value
      "Esta propiedad DEBERÍA usarse cuando el 'media type' de la distribución está definido en el registro IANA de 'media types' https://www.iana.org/assignments/media-types/, de lo contrario, dct:format PUEDE usarse con distintos valores."}}})

(def packageFormat
  {:db/ident :dcat/packageFormat,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "da",
      :rdf/value
      "Format til pakning af data med henblik på distribution af en eller flere relaterede datafiler der samles til en enhed med henblik på samlet distribution. "}
     {:rdf/language "it",
      :rdf/value
      "Il formato di impacchettamento della distribuzione in cui uno o più file di dati sono raggruppati insieme, ad es. per abilitare un insieme di file correlati da scaricare insieme."}
     {:rdf/language "en",
      :rdf/value
      "The package format of the distribution in which one or more data files are grouped together, e.g. to enable a set of related files to be downloaded together."}
     {:rdf/language "es",
      :rdf/value
      "El formato del archivo en que se agrupan uno o más archivos de datos, e.g. para permitir que un conjunto de archivos relacionados se bajen juntos."}
     {:rdf/language "cs",
      :rdf/value
      "Balíčkový formát souboru, ve kterém je jeden či více souborů seskupeno dohromady, např. aby bylo možné stáhnout sadu souvisejících souborů naráz."}},
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/TR/vocab-dcat-2/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "packaging format"}
                 {:rdf/language "da",
                  :rdf/value    "pakkeformat"}
                 {:rdf/language "cs",
                  :rdf/value    "formát balíčku"}
                 {:rdf/language "it",
                  :rdf/value    "formato di impacchettamento"}
                 {:rdf/language "es",
                  :rdf/value    "formato de empaquetado"}},
   :rdfs/range :dcterms/MediaType,
   :rdfs/subPropertyOf :dcterms/format,
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad agregada en DCAT 2.0."}
                      {:rdf/language "da",
                       :rdf/value    "Ny egenskab tilføjet i DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "it",
      :rdf/value
      "Il formato di impacchettamento della distribuzione in cui uno o più file di dati sono raggruppati insieme, ad es. per abilitare un insieme di file correlati da scaricare insieme."}
     {:rdf/language "en",
      :rdf/value
      "The package format of the distribution in which one or more data files are grouped together, e.g. to enable a set of related files to be downloaded together."}
     {:rdf/language "es",
      :rdf/value
      "El formato del archivo en que se agrupan uno o más archivos de datos, e.g. para permitir que un conjunto de archivos relacionados se bajen juntos."}
     {:rdf/language "cs",
      :rdf/value
      "Balíčkový formát souboru, ve kterém je jeden či více souborů seskupeno dohromady, např. aby bylo možné stáhnout sadu souvisejících souborů naráz."}},
   :skos/scopeNote
   #{{:rdf/language "cs",
      :rdf/value
      "Tato vlastnost se použije, když jsou soubory v distribuci zabaleny, např. v souboru TAR, v balíčku Frictionless Data Package nebo v souboru Bagit. Formát BY MĚL být vyjádřen pomocí typu média definovaného v registru IANA https://www.iana.org/assignments/media-types/, pokud existuje."}
     {:rdf/language "es",
      :rdf/value
      "Esta propiedad se debe usar cuando los archivos de la distribución están empaquetados, por ejemplo en un archivo TAR, Frictionless Data Package o Bagit. El formato DEBERÍA expresarse usando un 'media type', tales como los definidos en el registro IANA de 'media types' https://www.iana.org/assignments/media-types/, si está disponibles."}
     {:rdf/language "en",
      :rdf/value
      "This property to be used when the files in the distribution are packaged, e.g. in a TAR file, a Frictionless Data Package or a Bagit file. The format SHOULD be expressed using a media type as defined by IANA media types registry https://www.iana.org/assignments/media-types/, if available."}
     {:rdf/language "it",
      :rdf/value
      "Questa proprietà deve essere utilizzata quando i file nella distribuzione sono impacchettati, ad esempio in un file TAR, Frictionless Data Package o Bagit. Il formato DOVREBBE essere espresso utilizzando un tipo di supporto come definito dal registro dei tipi di media IANA https://www.iana.org/assignments/media-types/, se disponibili."}
     {:rdf/language "da",
      :rdf/value
      "Denne egenskab kan anvendes hvis filerne i en distribution er pakket, fx i en TAR-fil, en Frictionless Data Package eller en Bagit-fil. Formatet BØR udtrykkes ved en medietype som defineret i 'IANA media types registry', hvis der optræder en relevant medietype dér: https://www.iana.org/assignments/media-types/."}}})

(def qualifiedRelation
  {:db/ident :dcat/qualifiedRelation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "it",
      :rdf/value
      "Link a una descrizione di una relazione con un'altra risorsa."}
     {:rdf/language "en",
      :rdf/value
      "Link to a description of a relationship with another resource."}
     {:rdf/language "cs",
      :rdf/value    "Odkaz na popis vztahu s jiným zdrojem."}
     {:rdf/language "es",
      :rdf/value    "Enlace a una descripción de la relación con otro recurso."}
     {:rdf/language "da",
      :rdf/value
      "Reference til en beskrivelse af en relation til en anden ressource."}},
   :rdfs/domain :dcat/Resource,
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "Kvalificeret relation"}
                 {:rdf/language "it",
                  :rdf/value    "relazione qualificata"}
                 {:rdf/language "en",
                  :rdf/value    "qualified relation"}
                 {:rdf/language "cs",
                  :rdf/value    "kvalifikovaný vztah"}
                 {:rdf/language "es",
                  :rdf/value    "relación calificada"}},
   :rdfs/range :dcat/Relationship,
   :skos/changeNote #{{:rdf/language "es",
                       :rdf/value    "Propiedad nueva añadida en DCAT 2.0."}
                      {:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "da",
                       :rdf/value    "Ny egenskab tilføjet i DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "it",
      :rdf/value
      "Link a una descrizione di una relazione con un'altra risorsa."}
     {:rdf/language "en",
      :rdf/value
      "Link to a description of a relationship with another resource."}
     {:rdf/language "cs",
      :rdf/value    "Odkaz na popis vztahu s jiným zdrojem."}
     {:rdf/language "es",
      :rdf/value    "Enlace a una descripción de la relación con otro recurso."}
     {:rdf/language "da",
      :rdf/value
      "Reference til en beskrivelse af en relation til en anden ressource."}},
   :skos/editorialNote
   #{{:rdf/language "it",
      :rdf/value
      "Introdotta in DCAT per integrare le altre relazioni qualificate di PROV."}
     {:rdf/language "cs",
      :rdf/value
      "Přidáno do DCAT k doplnění jiných kvalifikovaných vztahů ze slovníku PROV."}
     {:rdf/language "da",
      :rdf/value
      "Introduceret i DCAT med henblik på at supplere de øvrige kvalificerede relationer fra PROV. "}
     {:rdf/language "en",
      :rdf/value
      "Introduced into DCAT to complement the other PROV qualified relations. "}
     {:rdf/language "es",
      :rdf/value
      "Se incluyó en DCAT para complementar las relaciones calificadas disponibles en PROV."}},
   :skos/scopeNote
   #{{:rdf/language "es",
      :rdf/value
      "Se usa para asociar con otro recurso para el cuál la naturaleza de la relación es conocida pero no es ninguna de las propiedades que provee el estándar Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf)."}
     {:rdf/language "en",
      :rdf/value
      "Used to link to another resource where the nature of the relationship is known but does not match one of the standard Dublin Core properties (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf)."}
     {:rdf/language "it",
      :rdf/value
      "Viene utilizzato per associarsi a un'altra risorsa nei casi per i quali la natura della relazione è nota ma non è alcuna delle proprietà fornite dallo standard Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat , dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:require, dct:isRequiredBy) o dalle proprietà fornite da PROV-O (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom , prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf)."}
     {:rdf/language "cs",
      :rdf/value
      "Použito pro odkazování na jiný zdroj, kde druh vztahu je znám, ale neodpovídá standardním vlastnostem ze slovníku Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) či slovníku PROV-O (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf)."}
     {:rdf/language "da",
      :rdf/value
      "Anvendes til at referere til en anden ressource hvor relationens betydning er kendt men ikke matcher en af de standardiserede egenskaber fra Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) eller PROV-O-egenskaber (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf)."}}})

(def record
  {:db/ident :dcat/record,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "cs",
      :rdf/value
      "Záznam popisující registraci jedné datové sady či datové služby jakožto součásti katalogu."}
     {:rdf/language "ar",
      :rdf/value    "تربط الفهرس بسجل ضمنه"}
     {:rdf/language "da",
      :rdf/value
      "En post der beskriver registreringen af et enkelt datasæt eller en datatjeneste som er opført i kataloget."}
     {:rdf/language "en",
      :rdf/value
      "A record describing the registration of a single dataset or data service that is part of the catalog."}
     {:rdf/language "fr",
      :rdf/value    "Relie un catalogue à ses registres."}
     {:rdf/language "ja",
      :rdf/value    "カタログの一部であるカタログ・レコード。"}
     {:rdf/language "es",
      :rdf/value
      "Describe la registración de un conjunto de datos o un servicio de datos en el catálogo."}
     {:rdf/language "it",
      :rdf/value
      "Un record che descrive la registrazione di un singolo set di dati o di un servizio dati che fa parte del catalogo."}
     {:rdf/language "cs",
      :rdf/value    "Propojuje katalog a jeho záznamy."}
     {:rdf/language "el",
      :rdf/value    "Συνδέει έναν κατάλογο με τις καταγραφές του."}},
   :rdfs/domain :dcat/Catalog,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "registro"}
                 {:rdf/language "ja",
                  :rdf/value    "カタログ・レコード"}
                 {:rdf/language "it",
                  :rdf/value    "record"}
                 {:rdf/language "el",
                  :rdf/value    "καταγραφή"}
                 {:rdf/language "fr",
                  :rdf/value    "registre"}
                 {:rdf/language "ar",
                  :rdf/value    "سجل"}
                 {:rdf/language "cs",
                  :rdf/value    "záznam"}
                 {:rdf/language "en",
                  :rdf/value    "record"}
                 {:rdf/language "da",
                  :rdf/value    "post"}},
   :rdfs/range :dcat/CatalogRecord,
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "har post"},
   :skos/definition
   #{{:rdf/language "cs",
      :rdf/value
      "Záznam popisující registraci jedné datové sady či datové služby jakožto součásti katalogu."}
     {:rdf/language "ar",
      :rdf/value    "تربط الفهرس بسجل ضمنه"}
     {:rdf/language "da",
      :rdf/value
      "En post der beskriver registreringen af et enkelt datasæt eller en datatjeneste som er opført i kataloget."}
     {:rdf/language "en",
      :rdf/value
      "A record describing the registration of a single dataset or data service that is part of the catalog."}
     {:rdf/language "fr",
      :rdf/value    "Relie un catalogue à ses registres."}
     {:rdf/language "ja",
      :rdf/value    "カタログの一部であるカタログ・レコード。"}
     {:rdf/language "es",
      :rdf/value
      "Describe la registración de un conjunto de datos o un servicio de datos en el catálogo."}
     {:rdf/language "it",
      :rdf/value
      "Un record che descrive la registrazione di un singolo set di dati o di un servizio dati che fa parte del catalogo."}
     {:rdf/language "cs",
      :rdf/value    "Propojuje katalog a jeho záznamy."}
     {:rdf/language "el",
      :rdf/value    "Συνδέει έναν κατάλογο με τις καταγραφές του."}},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Status: English, Italian, Spanish and Czech Definitions modified by DCAT revision team, other translations pending."}})

(def servesDataset
  {:db/ident :dcat/servesDataset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value "A collection of data that this DataService can distribute."}
     {:rdf/language "da",
      :rdf/value "En samling af data som denne datatjeneste kan distribuere."}
     {:rdf/language "cs",
      :rdf/value
      "Kolekce dat, kterou je tato Datová služba schopna poskytnout."}
     {:rdf/language "it",
      :rdf/value "Una raccolta di dati che questo DataService può distribuire."}
     {:rdf/language "es",
      :rdf/value
      "Una colección de datos que este Servicio de Datos puede distribuir."}},
   :rdfs/domain :dcat/DataService,
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "serves dataset"}
                 {:rdf/language "es",
                  :rdf/value    "provee conjunto de datos"}
                 {:rdf/language "cs",
                  :rdf/value    "poskytuje datovou sadu"}
                 {:rdf/language "da",
                  :rdf/value    "datatjeneste for datasæt"}
                 {:rdf/language "it",
                  :rdf/value    "serve set di dati"}},
   :rdfs/range :dcat/Dataset,
   :skos/altLabel #{{:rdf/language "da",
                     :rdf/value    "udstiller"}
                    {:rdf/language "da",
                     :rdf/value    "ekspederer"}
                    {:rdf/language "da",
                     :rdf/value    "distribuerer"}},
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad agregada en DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property in DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "en",
      :rdf/value "A collection of data that this DataService can distribute."}
     {:rdf/language "da",
      :rdf/value "En samling af data som denne datatjeneste kan distribuere."}
     {:rdf/language "cs",
      :rdf/value
      "Kolekce dat, kterou je tato Datová služba schopna poskytnout."}
     {:rdf/language "it",
      :rdf/value "Una raccolta di dati che questo DataService può distribuire."}
     {:rdf/language "es",
      :rdf/value
      "Una colección de datos que este Servicio de Datos puede distribuir."}}})

(def service
  {:db/ident :dcat/service,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "es",
      :rdf/value    "Un sitio o 'endpoint' que está listado en el catálogo."}
     {:rdf/language "cs",
      :rdf/value    "Umístění či přístupový bod registrovaný v katalogu."}
     {:rdf/language "en",
      :rdf/value    "A site or endpoint that is listed in the catalog."}
     {:rdf/language "da",
      :rdf/value    "Et websted eller et endpoint som er opført i kataloget."}
     {:rdf/language "it",
      :rdf/value    "Un sito o endpoint elencato nel catalogo."}},
   :rdfs/domain :dcat/Catalog,
   :rdfs/label #{{:rdf/language "cs",
                  :rdf/value    "služba"}
                 {:rdf/language "da",
                  :rdf/value    "datatjeneste"}
                 {:rdf/language "es",
                  :rdf/value    "servicio"}
                 {:rdf/language "it",
                  :rdf/value    "servizio"}
                 {:rdf/language "en",
                  :rdf/value    "service"}},
   :rdfs/range :dcat/DataService,
   :rdfs/subPropertyOf #{:dcterms/hasPart :rdfs/member},
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "har datatjeneste"},
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad añadida en DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "es",
      :rdf/value    "Un sitio o 'endpoint' que está listado en el catálogo."}
     {:rdf/language "cs",
      :rdf/value    "Umístění či přístupový bod registrovaný v katalogu."}
     {:rdf/language "en",
      :rdf/value    "A site or endpoint that is listed in the catalog."}
     {:rdf/language "da",
      :rdf/value    "Et websted eller et endpoint som er opført i kataloget."}
     {:rdf/language "it",
      :rdf/value    "Un sito o endpoint elencato nel catalogo."}}})

(def spatialResolutionInMeters
  {:db/ident :dcat/spatialResolutionInMeters,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "it",
      :rdf/value
      "separazione spaziale minima risolvibile in un set di dati, misurata in metri."}
     {:rdf/language "en-GB",
      :rdf/value
      "minimum spatial separation resolvable in a dataset, measured in metres."}
     {:rdf/language "cs",
      :rdf/value
      "minimální prostorový rozestup rozeznatelný v datové sadě, měřeno v metrech."}
     {:rdf/language "da",
      :rdf/value
      "mindste geografiske afstand som kan erkendes i et datasæt, målt i meter."}
     {:rdf/language "en-US",
      :rdf/value
      "minimum spatial separation resolvable in a dataset, measured in meters."}
     {:rdf/language "es",
      :rdf/value
      "mínima separacíon espacial disponible en un conjunto de datos, medida en metros."}},
   :rdfs/label #{{:rdf/language "en-US",
                  :rdf/value    "spatial resolution (meters)"}
                 {:rdf/language "it",
                  :rdf/value    "risoluzione spaziale (metros)"}
                 {:rdf/language "da",
                  :rdf/value    "geografisk opløsning (meter)"}
                 {:rdf/language "en-GB",
                  :rdf/value    "spatial resolution (metres)"}
                 {:rdf/language "cs",
                  :rdf/value    "prostorové rozlišení (metry)"}
                 {:rdf/language "es",
                  :rdf/value    "resolución espacial (metros)"}},
   :rdfs/range :xsd/decimal,
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "da",
                       :rdf/value    "Ny genskab tilføjet i DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad añadida en DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "it",
      :rdf/value
      "separazione spaziale minima risolvibile in un set di dati, misurata in metri."}
     {:rdf/language "en-GB",
      :rdf/value
      "minimum spatial separation resolvable in a dataset, measured in metres."}
     {:rdf/language "cs",
      :rdf/value
      "minimální prostorový rozestup rozeznatelný v datové sadě, měřeno v metrech."}
     {:rdf/language "en-US",
      :rdf/value
      "minimum spatial separation resolvable in a dataset, measured in meters."}
     {:rdf/language "es",
      :rdf/value
      "mínima separacíon espacial disponible en un conjunto de datos, medida en metros."}
     {:rdf/language "da",
      :rdf/value
      "mindste geografiske afstand som kan resolveres i et datasæt, målt i meter."}},
   :skos/editorialNote
   #{{:rdf/language "cs",
      :rdf/value
      "Může se vyskytnout v popisu Datové sady nebo Distribuce, takže nebyl specifikován definiční obor."}
     {:rdf/language "da",
      :rdf/value
      "Kan optræde i forbindelse med beskrivelse af datasættet eller datasætditributionen, så der er ikke angivet et domæne for egenskaben."}
     {:rdf/language "en",
      :rdf/value
      "Might appear in the description of a Dataset or a Distribution, so no domain is specified."}},
   :skos/scopeNote
   #{{:rdf/language "en",
      :rdf/value
      "If the dataset is an image or grid this should correspond to the spacing of items. For other kinds of spatial dataset, this property will usually indicate the smallest distance between items in the dataset."}
     {:rdf/language "it",
      :rdf/value
      "Risoluzioni spaziali alternative possono essere fornite come diverse distribuzioni di set di dati."}
     {:rdf/language "it",
      :rdf/value
      "Se il set di dati è un'immagine o una griglia, questo dovrebbe corrispondere alla spaziatura degli elementi. Per altri tipi di set di dati spaziali, questa proprietà di solito indica la distanza minima tra gli elementi nel set di dati."}
     {:rdf/language "es",
      :rdf/value
      "Distintas distribuciones de un conjunto de datos pueden tener resoluciones espaciales diferentes."}
     {:rdf/language "da",
      :rdf/value
      "Hvis datasættet udgøres af et billede eller et grid, så bør dette svare til afstanden mellem elementerne. For andre typer af spatiale datasæt, vil denne egenskab typisk indikere den mindste afstand mellem elementerne i datasættet."}
     {:rdf/language "cs",
      :rdf/value
      "Různá prostorová rozlišení mohou být poskytována jako různé distribuce datové sady."}
     {:rdf/language "es",
      :rdf/value
      "Si el conjunto de datos es una imágen o grilla, esta propiedad corresponde al espaciado de los elementos. Para otro tipo de conjunto de datos espaciales, esta propieda usualmente indica la menor distancia entre los elementos de dichos datos."}
     {:rdf/language "en",
      :rdf/value
      "Alternative spatial resolutions might be provided as different dataset distributions."}
     {:rdf/language "cs",
      :rdf/value
      "Pokud je datová sada obraz či mřížka, měla by tato vlastnost odpovídat rozestupu položek. Pro ostatní druhy prostorových datových sad bude tato vlastnost obvykle indikovat nejmenší vzdálenost mezi položkami této datové sady."}
     {:rdf/language "da",
      :rdf/value
      "Alternative geografiske opløsninger kan leveres som forskellige datasætdistributioner."}}})

(def startDate
  {:db/ident :dcat/startDate,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :dcterms/PeriodOfTime,
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "data di inizio"}
                 {:rdf/language "cs",
                  :rdf/value    "datum začátku"}
                 {:rdf/language "da",
                  :rdf/value    "startdato"}
                 {:rdf/language "en",
                  :rdf/value    "start date"}},
   :rdfs/range :rdfs/Literal,
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "starttidspunkt"},
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad agregada en DCAT 2.0."}
                      {:rdf/language "da",
                       :rdf/value    "Ny egenskab tilføjet i DCAT 2.0."}},
   :skos/definition #{{:rdf/language "es",
                       :rdf/value    "El comienzo del período"}
                      {:rdf/language "en",
                       :rdf/value    "The start of the period"}
                      {:rdf/language "da",
                       :rdf/value    "Start på perioden."}
                      {:rdf/language "cs",
                       :rdf/value    "Začátek doby trvání"}
                      {:rdf/language "it",
                       :rdf/value    "L'inizio del periodo"}},
   :skos/scopeNote
   #{{:rdf/language "da",
      :rdf/value
      "Rækkeviden for denne egenskab er bevidst generisk defineret med det formål at tillade forskellige niveauer af tidslig præcision ifm. angivelse af startdatoen for en periode. Den kan eksempelvis udtrykkes som en dato (xsd:date), en dato og et tidspunkt (xsd:dateTime), eller et årstal (xsd:gYear)."}
     {:rdf/language "es",
      :rdf/value
      "El rango de esta propiedad es intencionalmente genérico con el propósito de permitir distintos niveles de precisión temporal para especificar el comienzo de un período. Por ejemplo, puede expresarse como una fecha (xsd:date), una fecha y un tiempo (xsd:dateTime), o un año (xsd:gYear)."}
     {:rdf/language "cs",
      :rdf/value
      "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé úrovně časového rozlišení pro specifikaci začátku doby trvání. Ten může být kupříkladu vyjádřen datumem (xsd:date), datumem a časem (xsd:dateTime) či rokem (xsd:gYear)."}
     {:rdf/language "en",
      :rdf/value
      "The range of this property is intentionally generic, with the purpose of allowing different level of temporal precision for specifying the start of a period. E.g., it can be expressed with a date (xsd:date), a date and time (xsd:dateTime), or a year (xsd:gYear)."}
     {:rdf/language "it",
      :rdf/value
      "Il range di questa proprietà è volutamente generico, con lo scopo di consentire diversi livelli di precisione temporale per specificare l'inizio di un periodo. Ad esempio, può essere espresso con una data (xsd:date), una data e un'ora (xsd:dateTime), o un anno (xsd:gYear)."}}})

(def temporalResolution
  {:db/ident :dcat/temporalResolution,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "da",
      :rdf/value    "mindste tidsperiode der kan resolveres i datasættet."}
     {:rdf/language "en",
      :rdf/value    "minimum time period resolvable in a dataset."}
     {:rdf/language "it",
      :rdf/value    "periodo di tempo minimo risolvibile in un set di dati."}
     {:rdf/language "es",
      :rdf/value    "período de tiempo mínimo en el conjunto de datos."}
     {:rdf/language "cs",
      :rdf/value    "minimální doba trvání rozlišitelná v datové sadě."}},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "resolución temporal"}
                 {:rdf/language "da",
                  :rdf/value    "tidslig opløsning"}
                 {:rdf/language "it",
                  :rdf/value    "risoluzione temporale"}
                 {:rdf/language "en",
                  :rdf/value    "temporal resolution"}
                 {:rdf/language "cs",
                  :rdf/value    "časové rozlišení"}},
   :rdfs/range :xsd/duration,
   :skos/changeNote #{{:rdf/language "it",
                       :rdf/value    "Nuova proprietà aggiunta in DCAT 2.0."}
                      {:rdf/language "en",
                       :rdf/value    "New property added in DCAT 2.0."}
                      {:rdf/language "cs",
                       :rdf/value "Nová vlastnost přidaná ve verzi DCAT 2.0."}
                      {:rdf/language "es",
                       :rdf/value    "Nueva propiedad añadida en DCAT 2.0."}},
   :skos/definition
   #{{:rdf/language "da",
      :rdf/value    "mindste tidsperiode der kan resolveres i datasættet."}
     {:rdf/language "en",
      :rdf/value    "minimum time period resolvable in a dataset."}
     {:rdf/language "it",
      :rdf/value    "periodo di tempo minimo risolvibile in un set di dati."}
     {:rdf/language "es",
      :rdf/value    "período de tiempo mínimo en el conjunto de datos."}
     {:rdf/language "cs",
      :rdf/value    "minimální doba trvání rozlišitelná v datové sadě."}},
   :skos/editorialNote
   #{{:rdf/language "cs",
      :rdf/value
      "Může se vyskytnout v popisu Datové sady nebo Distribuce, takže nebyl specifikován definiční obor."}
     {:rdf/language "da",
      :rdf/value
      "Kan optræde i forbindelse med beskrivelse af datasættet eller datasætditributionen, så der er ikke angivet et domæne for egenskaben."}
     {:rdf/language "en",
      :rdf/value
      "Might appear in the description of a Dataset or a Distribution, so no domain is specified."}},
   :skos/scopeNote
   #{{:rdf/language "es",
      :rdf/value
      "Distintas distribuciones del conjunto de datos pueden tener resoluciones temporales diferentes."}
     {:rdf/language "en",
      :rdf/value
      "Alternative temporal resolutions might be provided as different dataset distributions."}
     {:rdf/language "cs",
      :rdf/value
      "Různá časová rozlišení mohou být poskytována jako různé distribuce datové sady."}
     {:rdf/language "en",
      :rdf/value
      "If the dataset is a time-series this should correspond to the spacing of items in the series. For other kinds of dataset, this property will usually indicate the smallest time difference between items in the dataset."}
     {:rdf/language "da",
      :rdf/value
      "Alternative tidslige opløsninger kan leveres som forskellige datasætdistributioner."}
     {:rdf/language "it",
      :rdf/value
      "Risoluzioni temporali alternative potrebbero essere fornite come diverse distribuzioni di set di dati."}
     {:rdf/language "es",
      :rdf/value
      "Si el conjunto de datos es una serie temporal, debe corresponder al espaciado de los elementos de la serie. Para otro tipo de conjuntos de datos, esta propiedad indicará usualmente la menor diferencia de tiempo entre elementos en el dataset."}
     {:rdf/language "da",
      :rdf/value
      "Hvis datasættet er en tidsserie, så bør denne egenskab svare til afstanden mellem elementerne i tidsserien. For andre typer af datasæt indikerer denne egenskab den mindste tidsforskel mellem elementer i datasættet."}
     {:rdf/language "cs",
      :rdf/value
      "Pokud je datová sada časovou řadou, měla by tato vlastnost odpovídat rozestupu položek v řadě. Pro ostatní druhy datových sad bude tato vlastnost obvykle indikovat nejmenší časovou vzdálenost mezi položkami této datové sady."}
     {:rdf/language "it",
      :rdf/value
      "Se il set di dati è una serie temporale, questo dovrebbe corrispondere alla spaziatura degli elementi della serie. Per altri tipi di set di dati, questa proprietà di solito indica la più piccola differenza di tempo tra gli elementi nel set di dati."}}})

(def theme
  {:db/ident :dcat/theme,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "ar",
      :rdf/value
      "التصنيف الرئيسي لقائمة البيانات. قائمة البيانات يمكن أن تملك أكثر من تصنيف رئيسي واحد."}
     {:rdf/language "en",
      :rdf/value
      "A main category of the resource. A resource can have multiple themes."}
     {:rdf/language "el",
      :rdf/value
      "Η κύρια κατηγορία του συνόλου δεδομένων. Ένα σύνολο δεδομένων δύναται να έχει πολλαπλά θέματα."}
     {:rdf/language "ja",
      :rdf/value    "データセットの主要カテゴリー。データセットは複数のテーマを持つことができます。"}
     {:rdf/language "da",
      :rdf/value
      "Et centralt emne for ressourcen. En ressource kan have flere centrale emner."}
     {:rdf/language "es",
      :rdf/value
      "La categoría principal del recurso. Un recurso puede tener varios temas."}
     {:rdf/language "cs",
      :rdf/value    "Hlavní téma zdroje. Zdroj může mít více témat."}
     {:rdf/language "fr",
      :rdf/value
      "La catégorie principale de la ressource. Une ressource peut avoir plusieurs thèmes."}
     {:rdf/language "it",
      :rdf/value
      "La categoria principale della risorsa. Una risorsa può avere più temi."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "tema"}
                 {:rdf/language "cs",
                  :rdf/value    "téma"}
                 {:rdf/language "en",
                  :rdf/value    "theme"}
                 {:rdf/language "el",
                  :rdf/value    "Θέμα"}
                 {:rdf/language "ar",
                  :rdf/value    "التصنيف"}
                 {:rdf/language "es",
                  :rdf/value    "tema"}
                 {:rdf/language "ja",
                  :rdf/value    "テーマ/カテゴリー"}
                 {:rdf/language "fr",
                  :rdf/value    "thème"}
                 {:rdf/language "da",
                  :rdf/value    "emne"}},
   :rdfs/range :skos/Concept,
   :rdfs/subPropertyOf :dcterms/subject,
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "tema"},
   :skos/definition
   #{{:rdf/language "ar",
      :rdf/value
      "التصنيف الرئيسي لقائمة البيانات. قائمة البيانات يمكن أن تملك أكثر من تصنيف رئيسي واحد."}
     {:rdf/language "en",
      :rdf/value
      "A main category of the resource. A resource can have multiple themes."}
     {:rdf/language "el",
      :rdf/value
      "Η κύρια κατηγορία του συνόλου δεδομένων. Ένα σύνολο δεδομένων δύναται να έχει πολλαπλά θέματα."}
     {:rdf/language "ja",
      :rdf/value    "データセットの主要カテゴリー。データセットは複数のテーマを持つことができます。"}
     {:rdf/language "da",
      :rdf/value
      "Et centralt emne for ressourcen. En ressource kan have flere centrale emner."}
     {:rdf/language "es",
      :rdf/value
      "La categoría principal del recurso. Un recurso puede tener varios temas."}
     {:rdf/language "cs",
      :rdf/value    "Hlavní téma zdroje. Zdroj může mít více témat."}
     {:rdf/language "fr",
      :rdf/value
      "La catégorie principale de la ressource. Une ressource peut avoir plusieurs thèmes."}
     {:rdf/language "it",
      :rdf/value
      "La categoria principale della risorsa. Una risorsa può avere più temi."}},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Status: English Definition text modified by DCAT revision team, all except for Italian and Czech translations are pending."},
   :skos/scopeNote
   #{{:rdf/language "da",
      :rdf/value
      "Samlingen af begreber (skos:Concept) der anvendes til at emneinddele ressourcer organiseres i et begrebssystem (skos:ConceptScheme) som beskriver alle emnerne og deres relationer i kataloget."}
     {:rdf/language "es",
      :rdf/value
      "El conjunto de skos:Concepts utilizados para categorizar los recursos están organizados en un skos:ConceptScheme que describe todas las categorías y sus relaciones en el catálogo."}
     {:rdf/language "fr",
      :rdf/value
      "Un ensemble de skos:Concepts utilisés pour catégoriser les ressources sont organisés en un skos:ConceptScheme décrivant toutes les catégories et ses relations dans le catalogue."}
     {:rdf/language "ja",
      :rdf/value
      "データセットを分類するために用いられるskos:Conceptの集合は、カタログのすべてのカテゴリーとそれらの関係を記述しているskos:ConceptSchemeで組織化されます。"}
     {:rdf/language "el",
      :rdf/value
      "Το σετ των skos:Concepts που χρησιμοποιείται για να κατηγοριοποιήσει τα σύνολα δεδομένων είναι οργανωμένο εντός ενός skos:ConceptScheme που περιγράφει όλες τις κατηγορίες και τις σχέσεις αυτών στον κατάλογο."}
     {:rdf/language "cs",
      :rdf/value
      "Sada instancí třídy skos:Concept použitá pro kategorizaci zdrojů je organizována do schématu konceptů skos:ConceptScheme, které popisuje všechny kategorie v katalogu a jejich vztahy."}
     {:rdf/language "it",
      :rdf/value
      "Il set di concetti skos usati per categorizzare le risorse sono organizzati in skos:ConceptScheme che descrive tutte le categorie e le loro relazioni nel catalogo."}
     {:rdf/language "en",
      :rdf/value
      "The set of skos:Concepts used to categorize the resources are organized in a skos:ConceptScheme describing all the categories and their relations in the catalog."}}})

(def themeTaxonomy
  {:db/ident :dcat/themeTaxonomy,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   #{{:rdf/language "el",
      :rdf/value
      "Το σύστημα οργάνωσης γνώσης που χρησιμοποιείται για την κατηγοριοποίηση των συνόλων δεδομένων του καταλόγου."}
     {:rdf/language "cs",
      :rdf/value
      "Systém organizace znalostí (KOS) použitý pro klasifikaci datových sad v katalogu."}
     {:rdf/language "ja",
      :rdf/value
      "カタログのデータセットを分類するために用いられる知識組織化体系（KOS；knowledge organization system）。"}
     {:rdf/language "en",
      :rdf/value
      "The knowledge organization system (KOS) used to classify catalog's datasets."}
     {:rdf/language "ar",
      :rdf/value "لائحة التصنيفات المستخدمه لتصنيف قوائم البيانات ضمن الفهرس"}
     {:rdf/language "da",
      :rdf/value
      "Vidensorganiseringssystem (KOS) som anvendes til at klassificere datasæt i kataloget."}
     {:rdf/language "it",
      :rdf/value
      "Il sistema di organizzazione della conoscenza (KOS) usato per classificare i dataset del catalogo."}
     {:rdf/language "fr",
      :rdf/value
      "Le systhème d'ogranisation de connaissances utilisé pour classifier les jeux de données du catalogue."}
     {:rdf/language "es",
      :rdf/value
      "El sistema de organización del conocimiento utilizado para clasificar conjuntos de datos de catálogos."}},
   :rdfs/domain :dcat/Catalog,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label #{{:rdf/language "ja",
                  :rdf/value    "テーマ"}
                 {:rdf/language "it",
                  :rdf/value    "tassonomia dei temi"}
                 {:rdf/language "da",
                  :rdf/value    "emnetaksonomi"}
                 {:rdf/language "cs",
                  :rdf/value    "taxonomie témat"}
                 {:rdf/language "el",
                  :rdf/value    "Ταξινομία θεματικών κατηγοριών."}
                 {:rdf/language "en",
                  :rdf/value    "theme taxonomy"}
                 {:rdf/language "ar",
                  :rdf/value    "قائمة التصنيفات"}
                 {:rdf/language "fr",
                  :rdf/value    "taxonomie de thèmes"}
                 {:rdf/language "es",
                  :rdf/value    "taxonomía de temas"}},
   :rdfs/range :rdfs/Resource,
   :schema/rangeIncludes #{:skos/ConceptScheme :owl/Ontology :skos/Collection},
   :skos/altLabel {:rdf/language "da",
                   :rdf/value    "temataksonomi"},
   :skos/definition
   #{{:rdf/language "el",
      :rdf/value
      "Το σύστημα οργάνωσης γνώσης που χρησιμοποιείται για την κατηγοριοποίηση των συνόλων δεδομένων του καταλόγου."}
     {:rdf/language "cs",
      :rdf/value
      "Systém organizace znalostí (KOS) použitý pro klasifikaci datových sad v katalogu."}
     {:rdf/language "ja",
      :rdf/value
      "カタログのデータセットを分類するために用いられる知識組織化体系（KOS；knowledge organization system）。"}
     {:rdf/language "en",
      :rdf/value
      "The knowledge organization system (KOS) used to classify catalog's datasets."}
     {:rdf/language "ar",
      :rdf/value "لائحة التصنيفات المستخدمه لتصنيف قوائم البيانات ضمن الفهرس"}
     {:rdf/language "da",
      :rdf/value
      "Vidensorganiseringssystem (KOS) som anvendes til at klassificere datasæt i kataloget."}
     {:rdf/language "it",
      :rdf/value
      "Il sistema di organizzazione della conoscenza (KOS) usato per classificare i dataset del catalogo."}
     {:rdf/language "fr",
      :rdf/value
      "Le systhème d'ogranisation de connaissances utilisé pour classifier les jeux de données du catalogue."}
     {:rdf/language "es",
      :rdf/value
      "El sistema de organización del conocimiento utilizado para clasificar conjuntos de datos de catálogos."}},
   :skos/scopeNote
   #{{:rdf/language "da",
      :rdf/value
      "Det anbefales at taksonomien organiseres i et skos:ConceptScheme, skos:Collection, owl:Ontology eller lignende, som giver mulighed for at ethvert medlem af taksonomien kan forsynes med en IRI og udgives som linked-data."}
     {:rdf/language "it",
      :rdf/value
      "Si raccomanda che la tassonomia sia organizzata in uno skos:ConceptScheme, skos:Collection, owl:Ontology o simili, che permette ad ogni membro di essere indicato da un IRI e pubblicato come linked-data."}
     {:rdf/language "en",
      :rdf/value
      "It is recommended that the taxonomy is organized in a skos:ConceptScheme, skos:Collection, owl:Ontology or similar, which allows each member to be denoted by an IRI and published as linked-data."}
     {:rdf/language "cs",
      :rdf/value
      "Je doporučeno, aby byla taxonomie vyjádřena jako skos:ConceptScheme, skos:Collection, owl:Ontology nebo podobné, aby mohla být každá položka identifikována pomocí IRI a publikována jako propojená data."}
     {:rdf/language "es",
      :rdf/value
      "Se recomienda que la taxonomía se organice como un skos:ConceptScheme, skos:Collection, owl:Ontology o similar, los cuáles permiten que cada miembro se denote con una IRI y se publique como datos enlazados."}}})