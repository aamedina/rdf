(ns net.wikipunk.rdf.dcat
  {:dcterms/contributor
   [{:foaf/name "Martin Alvarez-Espinar"}
    {:foaf/homepage {:rdfa/uri "http://makxdekkers.com/"},
     :foaf/name     "Makx Dekkers",
     :rdfs/seeAlso  {:rdfa/uri "http://makxdekkers.com/makxdekkers.rdf#me"}}
    {:foaf/homepage {:rdfa/uri "http://www.andrea-perego.name/foaf/#me"},
     :foaf/name     "Andrea Perego",
     :rdfs/seeAlso  {:rdfa/uri "https://orcid.org/0000-0001-9300-2694"}}
    {:foaf/name "Marios Meimaris"}
    {:foaf/name "Richard Cyganiak"}
    {:foaf/homepage {:rdfa/uri "https://jakub.klímek.com/"},
     :foaf/name     "Jakub Klímek",
     :rdfs/seeAlso  {:rdfa/uri "https://jakub.klímek.com/#me"}}
    {:foaf/homepage      {:rdfa/uri "http://www.w3.org/People/all#phila"},
     :foaf/name          "Phil Archer",
     :rdfs/seeAlso       {:rdfa/uri "http://philarcher.org/foaf.rdf#me"},
     :schema/affiliation {:rdfa/uri "http://www.w3.org/data#W3C"}}
    {:foaf/name "Boris Villazón-Terrazas"}
    {:foaf/name "Vassilios Peristeras",
     :schema/affiliation {:foaf/homepage
                          {:rdfa/uri "http://ec.europa.eu/dgs/informatics/"},
                          :foaf/name "European Commission, DG DIGIT"}}
    {:foaf/name    "Ghislain Auguste Atemezing",
     :rdfs/seeAlso {:rdfa/uri
                    "http://www.eurecom.fr/~atemezin/gatemezing-foaf.rdf"}}
    {:foaf/homepage {:rdfa/uri "http://www.asahi-net.or.jp/~ax2s-kmtn/"},
     :foaf/name     "Shuji Kamitsuna"}
    {:foaf/name "Simon J D Cox",
     :foaf/workInfoHomepage {:rdfa/uri "http://people.csiro.au/Simon-Cox"},
     :rdf/type :foaf/Person,
     :rdfs/seeAlso {:rdfa/uri "https://orcid.org/0000-0002-3884-3420"},
     :schema/affiliation
     {:foaf/homepage {:rdfa/uri "https://csiro.au"},
      :foaf/name
      "Commonwealth Scientific and Industrial Research Organisation"}}
    {:foaf/name "Rufus Pollock",
     :schema/affiliation {:foaf/homepage {:rdfa/uri "http://okfn.org"},
                          :foaf/name     "Open Knowledge Foundation"}}
    {:foaf/name "David Browning",
     :schema/affiliation {:foaf/homepage {:rdfa/uri "http://www.refinitiv.com"},
                          :foaf/name     "Refinitiv"}}
    {:foaf/homepage
     [{:rdfa/uri "https://w3id.org/people/ralbertoni/"}
      {:rdfa/uri
       "http://www.imati.cnr.it/index.php/people/8-curricula/178-riccardo-albertoni"}],
     :foaf/name "Riccardo Albertoni",
     :rdfs/seeAlso {:rdfa/uri "https://orcid.org/0000-0001-5648-2713"}}
    {:foaf/homepage      {:rdfa/uri "https://agbeltran.github.io"},
     :foaf/name          "Alejandra Gonzalez-Beltran",
     :rdfs/seeAlso       {:rdfa/uri "https://orcid.org/0000-0003-3499-8262"},
     :schema/affiliation {:foaf/homepage {:rdfa/uri "http://stfc.ac.uk"},
                          :foaf/name
                          "Science and Technology Facilities Council, UK"}}],
   :dcterms/creator [{:foaf/name    "Fadi Maali",
                      :rdfs/seeAlso {:rdfa/uri "http://fadmaa.me/foaf.ttl"}}
                     {:foaf/name "John Erickson"}],
   :dcterms/license {:rdfa/uri "https://creativecommons.org/licenses/by/4.0/"},
   :dcterms/modified [#xsd/date #inst "2013-09-20T00:00:00.000-04:00"
                      #xsd/date #inst "2020-11-30T00:00:00.000-05:00"
                      "2019"
                      #xsd/date #inst "2012-04-24T00:00:00.000-04:00"
                      #xsd/date #inst "2021-09-14T00:00:00.000-04:00"
                      #xsd/date #inst "2013-11-28T00:00:00.000-05:00"
                      #xsd/date #inst "2017-12-19T00:00:00.000-05:00"],
   :foaf/maker {:foaf/homepage {:rdfa/uri "http://www.w3.org/2011/gld/"},
                :foaf/name     "Government Linked Data WG"},
   :owl/imports [{:rdfa/uri "http://www.w3.org/2004/02/skos/core"}
                 {:rdfa/uri "http://www.w3.org/ns/prov-o#"}
                 {:rdfa/uri "http://purl.org/dc/terms/"}],
   :owl/versionInfo
   [#rdf/langString
     "Questa è una copia aggiornata del vocabolario DCAT v2.0 disponibile in https://www.w3.org/ns/dcat.ttl@en"
    #rdf/langString
     "This is an updated copy of v2.0 of the DCAT vocabulary, taken from https://www.w3.org/ns/dcat.ttl@en"
    #rdf/langString
     "Esta es una copia del vocabulario DCAT v2.0 disponible en https://www.w3.org/ns/dcat.ttl@es"
    #rdf/langString
     "Dette er en opdateret kopi af DCAT v. 2.0 som er tilgænglig på https://www.w3.org/ns/dcat.ttl@da"
    #rdf/langString
     "Toto je aktualizovaná kopie slovníku DCAT verze 2.0, převzatá z https://www.w3.org/ns/dcat.ttl@cs"],
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
   :rdfa/uri "http://www.w3.org/ns/dcat",
   :rdfs/comment
   [#rdf/langString
     "DCAT er et RDF-vokabular som har til formål at understøtte interoperabilitet mellem datakataloger udgivet på nettet. Ved at anvende DCAT til at beskrive datasæt i datakataloger, kan udgivere øge findbarhed og gøre det gøre det lettere for applikationer at anvende metadata fra forskellige kataloger. Derudover understøttes decentraliseret udstilling af kataloger og fødererede datasætsøgninger på tværs af websider. Aggregerede DCAT-metadata kan fungere som fortegnelsesfiler der kan understøtte digital bevaring. DCAT er defineret på http://www.w3.org/TR/vocab-dcat/. Enhver forskel mellem det normative dokument og dette schema er en fejl i dette schema.@da"
    #rdf/langString
     "DCAT est un vocabulaire développé pour faciliter l'interopérabilité entre les jeux de données publiées sur le Web. En utilisant DCAT pour décrire les jeux de données dans les catalogues de données, les fournisseurs de données augmentent leur découverte et permettent que les applications facilement les métadonnées de plusieurs catalogues. Il permet en plus la publication décentralisée des catalogues et facilitent la recherche fédérée des données entre plusieurs sites. Les métadonnées DCAT aggrégées peuvent servir comme un manifeste pour faciliter la préservation digitale des ressources. DCAT est définie à l'adresse http://www.w3.org/TR/vocab-dcat/. Une quelconque version de ce document normatif et ce vocabulaire est une erreur dans ce vocabulaire.@fr"
    #rdf/langString
     "DCAT je RDF slovník navržený pro zprostředkování interoperability mezi datovými katalogy publikovanými na Webu. Poskytovatelé dat používáním slovníku DCAT pro popis datových sad v datových katalozích zvyšují jejich dohledatelnost a umožňují aplikacím konzumovat metadata z více katalogů. Dále je umožňena decentralizovaná publikace katalogů a federované dotazování na datové sady napříč katalogy. Agregovaná DCAT metadata mohou také sloužit jako průvodka umožňující digitální uchování informace. DCAT je definován na http://www.w3.org/TR/vocab-dcat/. Jakýkoliv nesoulad mezi odkazovaným dokumentem a tímto schématem je chybou v tomto schématu.@cs"
    #rdf/langString
     "هي أنطولوجية تسهل تبادل البيانات بين مختلف الفهارس على الوب. استخدام هذه الأنطولوجية يساعد على اكتشاف قوائم  البيانات المنشورة على الوب و يمكن التطبيقات المختلفة من الاستفادة أتوماتيكيا من البيانات المتاحة من مختلف الفهارس.@ar"
    #rdf/langString
     "DCATは、ウェブ上で公開されたデータ・カタログ間の相互運用性の促進を目的とするRDFの語彙です。このドキュメントでは、その利用のために、スキーマを定義し、例を提供します。データ・カタログ内のデータセットを記述するためにDCATを用いると、公開者が、発見可能性を増加させ、アプリケーションが複数のカタログのメタデータを容易に利用できるようになります。さらに、カタログの分散公開を可能にし、複数のサイトにまたがるデータセットの統合検索を促進します。集約されたDCATメタデータは、ディジタル保存を促進するためのマニフェスト・ファイルとして使用できます。@ja"
    #rdf/langString
     "DCAT is an RDF vocabulary designed to facilitate interoperability between data catalogs published on the Web. By using DCAT to describe datasets in data catalogs, publishers increase discoverability and enable applications easily to consume metadata from multiple catalogs. It further enables decentralized publishing of catalogs and facilitates federated dataset search across sites. Aggregated DCAT metadata can serve as a manifest file to facilitate digital preservation. DCAT is defined at http://www.w3.org/TR/vocab-dcat/. Any variance between that normative document and this schema is an error in this schema.@en"
    #rdf/langString
     "DCAT es un vocabulario RDF diseñado para facilitar la interoperabilidad entre catálogos de datos publicados en la Web. Utilizando DCAT para describir datos disponibles en catálogos se aumenta la posibilidad de que sean descubiertos y se permite que las aplicaciones consuman fácilmente los metadatos de varios catálogos.@es"
    #rdf/langString
     "Το DCAT είναι ένα RDF λεξιλόγιο που σχεδιάσθηκε για να κάνει εφικτή τη διαλειτουργικότητα μεταξύ καταλόγων δεδομένων στον Παγκόσμιο Ιστό. Χρησιμοποιώντας το DCAT για την περιγραφή συνόλων δεδομένων, οι εκδότες αυτών αυξάνουν την ανακαλυψιμότητα και επιτρέπουν στις εφαρμογές την εύκολη κατανάλωση μεταδεδομένων από πολλαπλούς καταλόγους. Επιπλέον, δίνει τη δυνατότητα για αποκεντρωμένη έκδοση και διάθεση καταλόγων και επιτρέπει δυνατότητες ενοποιημένης αναζήτησης μεταξύ διαφορετικών πηγών. Συγκεντρωτικά μεταδεδομένα που έχουν περιγραφεί με το DCAT μπορούν να χρησιμοποιηθούν σαν ένα δηλωτικό αρχείο (manifest file) ώστε να διευκολύνουν την ψηφιακή συντήρηση.@el"
    #rdf/langString
     "DCAT è un vocabolario RDF progettato per facilitare l'interoperabilità tra i cataloghi di dati pubblicati nel Web. Utilizzando DCAT per descrivere i dataset nei cataloghi di dati, i fornitori migliorano la capacità di individuazione dei dati e abilitano le  applicazioni al consumo di dati provenienti da cataloghi differenti. DCAT permette di decentralizzare la pubblicazione di cataloghi e facilita la ricerca federata dei dataset. L'aggregazione dei metadati federati può fungere da file manifesto per facilitare la conservazione digitale. DCAT è definito all'indirizzo http://www.w3.org/TR/vocab-dcat/. Qualsiasi scostamento tra tale definizione normativa e questo schema è da considerarsi un errore di questo schema.@it"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "Slovník pro datové katalogy@cs"
                #rdf/langString "Il vocabolario del catalogo dei dati@it"
                #rdf/langString "Le vocabulaire des jeux de données@fr"
                #rdf/langString "El vocabulario de catálogo de datos@es"
                #rdf/langString "Datakatalogvokabular@da"
                #rdf/langString "أنطولوجية فهارس قوائم البيانات@ar"
                #rdf/langString "Το λεξιλόγιο των καταλόγων δεδομένων@el"
                #rdf/langString "データ・カタログ語彙（DCAT）@ja"
                #rdf/langString "The data catalog vocabulary@en"],
   :skos/editorialNote
   #rdf/langString
    "English language definitions updated in this revision in line with ED. Multilingual text unevenly updated.@en"}
  (:refer-clojure :exclude [keyword]))

(def Catalog
  {:db/ident :dcat/Catalog,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   [#rdf/langString
     "A curated collection of metadata about resources (e.g., datasets and data services in the context of a data catalog).@en"
    #rdf/langString
     "Una raccolta curata di metadati sulle risorse (ad es. sui dataset e relativi servizi nel contesto di cataloghi di dati).@it"
    #rdf/langString
     "Řízená kolekce metadat o datových sadách a datových službách@cs"
    #rdf/langString
     "Una colección curada de metadatos sobre recursos (por ejemplo, conjuntos de datos y servicios de datos en el contexto de un catálogo de datos).@es"
    #rdf/langString
     "Μια επιμελημένη συλλογή μεταδεδομένων περί συνόλων δεδομένων@el"
    #rdf/langString
     "Une collection élaborée de métadonnées sur les jeux de données@fr"
    #rdf/langString "مجموعة من توصيفات قوائم البيانات@ar"
    #rdf/langString
     "En udvalgt og arrangeret samling af metadata om ressourcer (fx datasæt og datatjenester i kontekst af et datakatalog). @da"
    #rdf/langString "データ・カタログは、データセットに関するキュレートされたメタデータの集合です。@ja"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "Katalog@da"
                #rdf/langString "Katalog@cs"
                #rdf/langString "Κατάλογος@el"
                #rdf/langString "Catalogo@it"
                #rdf/langString "فهرس قوائم البيانات@ar"
                #rdf/langString "カタログ@ja"
                #rdf/langString "Catálogo@es"
                #rdf/langString "Catalog@en"
                #rdf/langString "Catalogue@fr"],
   :rdfs/subClassOf [:rdfs/Resource :dcat/Dataset :dcat/Resource],
   :skos/definition
   [#rdf/langString "データ・カタログは、データセットに関するキュレートされたメタデータの集合です。@ja"
    #rdf/langString
     "Řízená kolekce metadat o datových sadách a datových službách.@cs"
    #rdf/langString
     "Una raccolta curata di metadati sulle risorse (ad es. sui dataset e relativi servizi nel contesto di cataloghi di dati).@it"
    #rdf/langString "مجموعة من توصيفات قوائم البيانات@ar"
    #rdf/langString
     "Una colección curada de metadatos sobre recursos (por ejemplo, conjuntos de datos y servicios de datos en el contexto de un catálogo de datos).@es"
    #rdf/langString
     "Μια επιμελημένη συλλογή μεταδεδομένων περί συνόλων δεδομένων.@el"
    #rdf/langString
     "Une collection élaborée de métadonnées sur les jeux de données.@fr"
    #rdf/langString
     "En samling af metadata om ressourcer (fx datasæt og datatjenester i kontekst af et datakatalog).@da"
    #rdf/langString
     "A curated collection of metadata about resources (e.g., datasets and data services in the context of a data catalog).@en"],
   :skos/editorialNote
   #rdf/langString
    "English, Italian, Spanish definitions updated in this revision. Multilingual text not yet updated.@en",
   :skos/scopeNote
   [#rdf/langString
     "Normalmente, un catálogo de datos disponible en la web se representa como una única instancia de esta clase.@es"
    #rdf/langString
     "Et webbaseret datakatalog repræsenteres typisk ved en enkelt instans af denne klasse.@da"
    #rdf/langString
     "Συνήθως, ένας κατάλογος δεδομένων στον Παγκόσμιο Ιστό αναπαρίσταται ως ένα στιγμιότυπο αυτής της κλάσης.@el"
    #rdf/langString
     "Webový datový katalog je typicky reprezentován jako jedna instance této třídy.@cs"
    #rdf/langString
     "A web-based data catalog is typically represented as a single instance of this class.@en"
    #rdf/langString
     "Normalmente, un catalogo di dati nel web viene rappresentato come una singola istanza di questa classe.@it"
    #rdf/langString "通常、ウェブ・ベースのデータ・カタログは、このクラスの1つのインスタンスとして表わされます。@ja"]})

(def CatalogRecord
  {:db/ident :dcat/CatalogRecord,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   [#rdf/langString
     "A record in a data catalog, describing the registration of a single dataset or data service.@en"
    #rdf/langString "1つのデータセットを記述したデータ・カタログ内のレコード。@ja"
    #rdf/langString
     "En post i et datakatalog der beskriver registreringen af et enkelt datasæt eller en datatjeneste.@da"
    #rdf/langString
     "Záznam v datovém katalogu popisující jednu datovou sadu či datovou službu.@cs"
    #rdf/langString
     "Un registre du catalogue ou une entrée du catalogue, décrivant un seul jeu de données.@fr"
    #rdf/langString
     "Μία καταγραφή ενός καταλόγου, η οποία περιγράφει ένα συγκεκριμένο σύνολο δεδομένων.@el"
    #rdf/langString
     "Un record in un catalogo di dati che descrive un singolo dataset o servizio di dati.@it"
    #rdf/langString
     "Un registro en un catálogo de datos que describe un solo conjunto de datos o un servicio de datos.@es"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "カタログ・レコード@ja"
                #rdf/langString "Καταγραφή καταλόγου@el"
                #rdf/langString "سجل@ar"
                #rdf/langString "Registro del catálogo@es"
                #rdf/langString "Record di catalogo@it"
                #rdf/langString "Catalog Record@en"
                #rdf/langString "Katalogpost@da"
                #rdf/langString "Katalogizační záznam@cs"
                #rdf/langString "Registre du catalogue@fr"],
   :rdfs/subClassOf [:rdfs/Resource
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :foaf/primaryTopic,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :dcat/Resource,
                      :owl/onProperty    :foaf/primaryTopic,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   [#rdf/langString
     "Un record in un catalogo di dati che descrive un singolo dataset o servizio di dati.@it"
    #rdf/langString
     "Záznam v datovém katalogu popisující jednu datovou sadu či datovou službu.@cs"
    #rdf/langString
     "Un registro en un catálogo de datos que describe un solo conjunto de datos o un servicio de datos.@es"
    #rdf/langString
     "En post i et datakatalog der beskriver registreringen af et enkelt datasæt eller en datatjeneste.@da"
    #rdf/langString "1つのデータセットを記述したデータ・カタログ内のレコード。@ja"
    #rdf/langString
     "Μία καταγραφή ενός καταλόγου, η οποία περιγράφει ένα συγκεκριμένο σύνολο δεδομένων.@el"
    #rdf/langString
     "Un registre du catalogue ou une entrée du catalogue, décrivant un seul jeu de données.@fr"
    #rdf/langString
     "A record in a data catalog, describing the registration of a single dataset or data service.@en"],
   :skos/editorialNote
   #rdf/langString
    "English definition updated in this revision. Multilingual text not yet updated except the Spanish one and the Czech one and Italian one.@en",
   :skos/scopeNote
   [#rdf/langString
     "このクラスはオプションで、すべてのカタログがそれを用いるとは限りません。これは、データセットに関するメタデータとカタログ内のデータセットのエントリーに関するメタデータとで区別が行われるカタログのために存在しています。例えば、データセットの公開日プロパティーは、公開機関が情報を最初に利用可能とした日付を示しますが、カタログ・レコードの公開日は、データセットがカタログに追加された日付です。両方の日付が異っていたり、後者だけが分かっている場合は、カタログ・レコードに対してのみ公開日を指定すべきです。W3CのPROVオントロジー[prov-o]を用いれば、データセットに対する特定の変更に関連するプロセスやエージェントの詳細などの、さらに詳しい来歴情報の記述が可能となることに注意してください。@ja"
    #rdf/langString
     "Questa classe è opzionale e non tutti i cataloghi la utilizzeranno. Esiste per cataloghi in cui si opera una distinzione tra i metadati relativi al dataset ed i metadati relativi alla gestione del dataset nel catalogo. Ad esempio, la  proprietà per indicare la data di pubblicazione del dataset rifletterà la data in cui l'informazione è stata originariamente messa a disposizione dalla casa editrice, mentre la data di pubblicazione per il record nel catalogo rifletterà la data in cui il dataset è stato aggiunto al catalogo. Nei casi dove solo quest'ultima sia nota, si utilizzerà esclusivamente la data di  pubblicazione relativa al record del catalogo. Si noti che l'Ontologia W3C PROV permette di descrivere ulteriori informazioni sulla provenienza, quali i dettagli del processo, la procedura e l'agente coinvolto in una particolare modifica di un dataset.@it"
    #rdf/langString
     "Tato třída je volitelná a ne všechny katalogy ji využijí. Existuje pro katalogy, ve kterých se rozlišují metadata datové sady či datové služby a metadata o záznamu o datové sadě či datové službě v katalogu. Například datum publikace datové sady odráží datum, kdy byla datová sada původně zveřejněna poskytovatelem dat, zatímco datum publikace katalogizačního záznamu je datum zanesení datové sady do katalogu. V případech kdy se obě data liší, nebo je známo jen to druhé, by mělo být specifikováno jen datum publikace katalogizačního záznamu. Všimněte si, že ontologie W3C PROV umožňuje popsat další informace o původu jako například podrobnosti o procesu konkrétní změny datové sady a jeho účastnících.@cs"
    #rdf/langString
     "Esta clase es opcional y no todos los catálogos la utilizarán. Esta clase existe para catálogos que hacen una distinción entre los metadatos acerca de un conjunto de datos o un servicio de datos y los metadatos acerca de una entrada en ese conjunto de datos en el catálogo. Por ejemplo, la propiedad sobre la fecha de la publicación de los datos refleja la fecha en que la información fue originalmente publicada, mientras que la fecha de publicación del registro del catálogo es la fecha en que los datos se agregaron al mismo. En caso en que ambas fechas fueran diferentes, o en que sólo la fecha de publicación del registro del catálogo estuviera disponible, sólo debe especificarse en el registro del catálogo. Tengan en cuenta que la ontología PROV de W3C permite describir otra información sobre la proveniencia de los datos, como por ejemplo detalles del proceso y de los agentes involucrados en algún cambio específico a los datos.@es"
    #rdf/langString
     "This class is optional and not all catalogs will use it. It exists for catalogs where a distinction is made between metadata about a dataset or data service and metadata about the entry for the dataset or data service in the catalog. For example, the publication date property of the dataset reflects the date when the information was originally made available by the publishing agency, while the publication date of the catalog record is the date when the dataset was added to the catalog. In cases where both dates differ, or where only the latter is known, the publication date should only be specified for the catalog record. Notice that the W3C PROV Ontology allows describing further provenance information such as the details of the process and the agent involved in a particular change to a dataset.@en"
    #rdf/langString
     "Αυτή η κλάση είναι προαιρετική και δεν χρησιμοποιείται από όλους τους καταλόγους. Υπάρχει για τις περιπτώσεις καταλόγων όπου γίνεται διαχωρισμός μεταξύ των μεταδεδομένων για το σύνολο των δεδομένων και των μεταδεδομένων για την καταγραφή του συνόλου δεδομένων εντός του καταλόγου. Για παράδειγμα, η ιδιότητα της ημερομηνίας δημοσίευσης του συνόλου δεδομένων δείχνει την ημερομηνία κατά την οποία οι πληροφορίες έγιναν διαθέσιμες από τον φορέα δημοσίευσης, ενώ η ημερομηνία δημοσίευσης της καταγραφής του καταλόγου δείχνει την ημερομηνία που το σύνολο δεδομένων προστέθηκε στον κατάλογο. Σε περιπτώσεις που οι δύο ημερομηνίες διαφέρουν, ή που μόνο η τελευταία είναι γνωστή, η ημερομηνία δημοσίευσης θα πρέπει να δίνεται για την καταγραφή του καταλόγου. Να σημειωθεί πως η οντολογία W3C PROV επιτρέπει την περιγραφή επιπλέον πληροφοριών ιστορικού όπως λεπτομέρειες για τη διαδικασία και τον δράστη που εμπλέκονται σε μία συγκεκριμένη αλλαγή εντός του συνόλου δεδομένων.@el"
    #rdf/langString
     "Denne klasse er valgfri og ikke alle kataloger vil anvende denne klasse. Den kan anvendes i de kataloger hvor der skelnes mellem metadata om datasættet eller datatjenesten og metadata om selve posten til registreringen af datasættet eller datatjenesten i kataloget. Udgivelsesdatoen for datasættet afspejler for eksempel den dato hvor informationerne oprindeligt blev gjort tilgængelige af udgiveren, hvorimod udgivelsesdatoen for katalogposten er den dato hvor datasættet blev føjet til kataloget. I de tilfælde hvor de to datoer er forskellige eller hvor blot sidstnævnte er kendt, bør udgivelsesdatoen kun angives for katalogposten. Bemærk at W3Cs PROV ontologi gør til muligt at tilføje yderligere proveniensoplysninger eksempelvis om processen eller aktøren involveret i en given ændring af datasættet.@da"
    #rdf/langString
     "C'est une classe facultative et tous les catalogues ne l'utiliseront pas. Cette classe existe pour les catalogues\tayant une distinction entre les métadonnées sur le jeu de données et les métadonnées sur une entrée du jeu de données dans le catalogue.@fr"]})

(def DataService
  "Dataservice"
  {:db/ident :dcat/DataService,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#rdf/langString
     "A site or end-point providing operations related to the discovery of, access to, or processing functions on, data or related resources.@en"
    #rdf/langString
     "Umístění či přístupový bod poskytující operace související s hledáním, přistupem k, či výkonem funkcí na datech či souvisejících zdrojích.@cs"
    #rdf/langString
     "Et websted eller endpoint der udstiller operationer relateret til opdagelse af, adgang til eller behandlende funktioner på data eller relaterede ressourcer.@da"
    #rdf/langString
     "Un sitio o end-point que provee operaciones relacionadas a funciones de descubrimiento, acceso, o procesamiento de datos o recursos relacionados.@es"
    #rdf/langString
     "Un sito o end-point che fornisce operazioni relative alla scoperta, all'accesso o all'elaborazione di funzioni su dati o risorse correlate.@it"],
   :rdfs/label [#rdf/langString "Servizio di dati@it"
                #rdf/langString "Data service@en"
                #rdf/langString "Servicio de datos@es"
                #rdf/langString "Datatjeneste@da"],
   :rdfs/subClassOf [:dcmitype/Service :dcat/Resource],
   :skos/altLabel #rdf/langString "Dataservice@da",
   :skos/changeNote [#rdf/langString "New class added in DCAT 2.0.@en"
                     #rdf/langString "Nová třída přidaná ve verzi DCAT 2.0.@cs"
                     #rdf/langString "Ny klasse tilføjet i DCAT 2.0.@da"
                     #rdf/langString "Nueva clase añadida en DCAT 2.0.@es"
                     #rdf/langString "Nuova classe aggiunta in DCAT 2.0.@it"],
   :skos/definition
   [#rdf/langString
     "Un sitio o end-point que provee operaciones relacionadas a funciones de descubrimiento, acceso, o procesamiento de datos o recursos relacionados.@es"
    #rdf/langString
     "Umístění či přístupový bod poskytující operace související s hledáním, přistupem k, či výkonem funkcí na datech či souvisejících zdrojích.@cs"
    #rdf/langString
     "A site or end-point providing operations related to the discovery of, access to, or processing functions on, data or related resources.@en"
    #rdf/langString
     "Et site eller endpoint der udstiller operationer relateret til opdagelse af, adgang til eller behandlende funktioner på data eller relaterede ressourcer.@da"
    #rdf/langString
     "Un sito o end-point che fornisce operazioni relative alla scoperta, all'accesso o all'elaborazione di funzioni su dati o risorse correlate.@it"],
   :skos/scopeNote
   [#rdf/langString
     "Pokud je dcat:DataService navázána na jednu či více Datových sad, jsou tyto indikovány vlstností dcat:servesDataset.@cs"
    #rdf/langString
     "El tipo de servicio puede indicarse usando la propiedad dct:type. Su valor puede provenir de un vocabulario controlado, como por ejemplo el vocabulario de servicios de datos espaciales de INSPIRE.@es"
    #rdf/langString
     "Hvis en dcat:DataService er bundet til en eller flere specifikke datasæt kan dette indikeres ved hjælp af egenskaben dcat:servesDataset. @da"
    #rdf/langString
     "Druh služby může být indikován vlastností dct:type. Její hodnota může být z řízeného slovníku, kterým je například slovník typů prostorových datových služeb INSPIRE.@cs"
    #rdf/langString
     "If a dcat:DataService is bound to one or more specified Datasets, they are indicated by the dcat:servesDataset property.@en"
    #rdf/langString
     "Si un dcat:DataService está asociado con uno o más conjuntos de datos especificados, dichos conjuntos de datos pueden indicarse con la propiedad dcat:servesDataset.@es"
    #rdf/langString
     "Il tipo di servizio può essere indicato usando la proprietà dct:type. Il suo valore può essere preso da un vocabolario controllato come il vocabolario dei tipi di servizi per dati spaziali di INSPIRE.@it"
    #rdf/langString
     "Datatjenestetypen kan indikeres ved hjælp af egenskaben dct:type. Værdien kan tages fra kontrollerede udfaldsrum såsom INSPIRE spatial data service vocabulary.@da"
    #rdf/langString
     "The kind of service can be indicated using the dct:type property. Its value may be taken from a controlled vocabulary such as the INSPIRE spatial data service type vocabulary.@en"
    #rdf/langString
     "Se un dcat:DataService è associato a uno o più Dataset specificati, questi sono indicati dalla proprietà dcat:serveDataset.@it"]})

(def Dataset
  "Datasamling"
  {:db/ident :dcat/Dataset,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   [#rdf/langString
     "1つのエージェントによって公開またはキュレートされ、1つ以上の形式でアクセスまたはダウンロードできるデータの集合。@ja"
    #rdf/langString
     "Raccolta di dati, pubblicati o curati da un'unica fonte, disponibili per l'accesso o il download in uno o più formati.@it"
    #rdf/langString
     "Μία συλλογή από δεδομένα, δημοσιευμένη ή επιμελημένη από μία και μόνο πηγή, διαθέσιμη δε προς πρόσβαση ή μεταφόρτωση σε μία ή περισσότερες μορφές.@el"
    #rdf/langString
     "قائمة بيانات منشورة أو مجموعة من قبل مصدر ما و متاح الوصول إليها أو تحميلها@ar"
    #rdf/langString
     "A collection of data, published or curated by a single source, and available for access or download in one or more representations.@en"
    #rdf/langString
     "Une collection de données, publiée ou élaborée par une seule source, et disponible pour accès ou téléchargement dans un ou plusieurs formats.@fr"
    #rdf/langString
     "Kolekce dat poskytovaná či řízená jedním zdrojem, která je k dispozici pro přístup či stažení v jednom či více formátech.@cs"
    #rdf/langString
     "Una colección de datos, publicados o conservados por una única fuente, y disponibles para ser accedidos o descargados en uno o más formatos.@es"
    #rdf/langString
     "En samling af data, udgivet eller udvalgt og arrangeret af en enkelt kilde og som er til råde for adgang til eller download af i en eller flere repræsentationer.@da"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "データセット@ja"
                #rdf/langString "Dataset@en"
                #rdf/langString "Dataset@it"
                #rdf/langString "قائمة بيانات@ar"
                #rdf/langString "Conjunto de datos@es"
                #rdf/langString "Σύνολο Δεδομένων@el"
                #rdf/langString "Jeu de données@fr"
                #rdf/langString "Datová sada@cs"
                #rdf/langString "Datasæt@da"],
   :rdfs/subClassOf [:rdfs/Resource :dcat/Resource],
   :skos/altLabel #rdf/langString "Datasamling@da",
   :skos/changeNote
   [#rdf/langString
     "2018-02 - subklasse af dctype:Dataset fjernet da scope af dcat:Dataset omfatter flere forskellige typer fra dctype-vokabularet.@da"
    #rdf/langString
     "2018-02 - odstraněno tvrzení o podtřídě dctype:Dataset, jelikož rozsah dcat:Dataset zahrnuje několik dalších typů ze slovníku dctype.@cs"
    #rdf/langString
     "2018-02 - subclass of dctype:Dataset removed because scope of dcat:Dataset includes several other types from the dctype vocabulary.@en"
    #rdf/langString
     "2018-02 - se eliminó el axioma de subclase con dctype:Dataset porque el alcance de dcat:Dataset incluye muchos otros tipos del vocabulario dctype.@es"
    #rdf/langString
     "2018-02 - sottoclasse di dctype:Dataset rimosso perché l'ambito di dcat:Dataset include diversi altri tipi dal vocabolario dctype.@it"],
   :skos/definition
   [#rdf/langString
     "Une collection de données, publiée ou élaborée par une seule source, et disponible pour accès ou téléchargement dans un ou plusieurs formats.@fr"
    #rdf/langString
     "قائمة بيانات منشورة أو مجموعة من قبل مصدر ما و متاح الوصول إليها أو تحميلها@ar"
    #rdf/langString
     "Una colección de datos, publicados o conservados por una única fuente, y disponibles para ser accedidos o descargados en uno o más formatos.@es"
    #rdf/langString
     "Raccolta di dati, pubblicati o curati da un'unica fonte, disponibili per l'accesso o il download in uno o più formati.@it"
    #rdf/langString
     "Kolekce dat poskytovaná či řízená jedním zdrojem, která je k dispozici pro přístup či stažení v jednom či více formátech.@cs"
    #rdf/langString
     "En samling a data, udgivet eller udvalgt og arrangeret af en enkelt kilde og som der er adgang til i en eller flere repræsentationer.@da"
    #rdf/langString
     "1つのエージェントによって公開またはキュレートされ、1つ以上の形式でアクセスまたはダウンロードできるデータの集合。@ja"
    #rdf/langString
     "Μία συλλογή από δεδομένα, δημοσιευμένη ή επιμελημένη από μία και μόνο πηγή, διαθέσιμη δε προς πρόσβαση ή μεταφόρτωση σε μία ή περισσότερες μορφές.@el"
    #rdf/langString
     "A collection of data, published or curated by a single source, and available for access or download in one or more represenations.@en"],
   :skos/editorialNote
   #rdf/langString
    "2020-03-16 A new scopenote added and need to be translated@en",
   :skos/scopeNote
   [#rdf/langString
     "Questa classe rappresenta il dataset come pubblicato dall’editore. Nel caso in cui sia necessario operare  una distinzione fra i metadati originali del dataset e il record dei metadati ad esso associato nel catalogo (ad esempio, per distinguere la data di modifica del dataset da quella del dataset nel catalogo) si può impiegare la classe catalog record.@it"
    #rdf/langString
     "Cette classe représente le jeu de données publié par le fournisseur de données. Dans les cas où une distinction est nécessaire entre le jeu de donénes et son entrée dans le catalogue, la classe registre de données peut être utilisée pour ce dernier.@fr"
    #rdf/langString
     "Esta clase representa el conjunto de datos publicados. En los casos donde es necesario distinguir entre el conjunto de datos y su entrada en el catálogo de datos, se debe utilizar la clase 'registro del catálogo'.@es"
    #rdf/langString
     "Η κλάση αυτή αναπαριστά το σύνολο δεδομένων αυτό καθ'εαυτό, όπως έχει δημοσιευθεί από τον εκδότη. Σε περιπτώσεις όπου είναι απαραίτητος ο διαχωρισμός μεταξύ του συνόλου δεδομένων και της καταγραφής αυτού στον κατάλογο (γιατί μεταδεδομένα όπως η ημερομηνία αλλαγής και ο συντηρητής μπορεί να διαφέρουν) η κλάση της καταγραφής καταλόγου μπορεί να χρησιμοποιηθεί για το τελευταίο.@el"
    #rdf/langString
     "This class represents the actual dataset as published by the dataset provider. In cases where a distinction between the actual dataset and its entry in the catalog is necessary (because metadata such as modification date and maintainer might differ), the catalog record class can be used for the latter.@en"
    #rdf/langString
     "Tato třída reprezentuje datovou sadu tak, jak je publikována poskytovatelem dat. V případě potřeby rozlišení datové sady a jejího katalogizačního záznamu (jelikož metadata jako datum modifikace se mohou lišit) pro něj může být použita třída \"katalogizační záznam\".@cs"
    #rdf/langString
     "Questa classe descrive il dataset dal punto di vista concettuale. Possono essere disponibili una o più rappresentazioni, con diversi layout e formati schematici o serializzazioni.@it"
    #rdf/langString
     "This class describes the conceptual dataset. One or more representations might be available, with differing schematic layouts and formats or serializations.@en"
    #rdf/langString
     "このクラスは、データセットの公開者が公開する実際のデータセットを表わします。カタログ内の実際のデータセットとそのエントリーとの区別が必要な場合（修正日と維持者などのメタデータが異なるかもしれないので）は、後者にcatalog recordというクラスを使用できます。@ja"
    #rdf/langString
     "The notion of dataset in DCAT is broad and inclusive, with the intention of accommodating resource types arising from all communities. Data comes in many forms including numbers, text, pixels, imagery, sound and other multi-media, and potentially other types, any of which might be collected into a dataset.@en"
    #rdf/langString
     "Denne klasse beskriver det konceptuelle datasæt. En eller flere repræsentationer kan være tilgængelige med forskellige skematiske opsætninger, formater eller serialiseringer.@da"
    #rdf/langString
     "Denne klasse repræsenterer det konkrete datasæt som det udgives af datasætleverandøren. I de tilfælde hvor det er nødvendigt at skelne mellem det konkrete datasæt og dets registrering i kataloget (fordi metadata såsom ændringsdato og vedligeholder er forskellige), så kan klassen katalogpost anvendes. @da"]})

(def Distribution
  {:db/ident :dcat/Distribution,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   [#rdf/langString
     "En specifik repræsentation af et datasæt. Et datasæt kan være tilgængelig i mange serialiseringer der kan variere på forskellige vis, herunder sprog, medietype eller format, systemorganisering, tidslig- og geografisk opløsning, detaljeringsniveau eller profiler (der kan specificere en eller flere af ovenstående).@da"
    #rdf/langString
     "Représente une forme spécifique d'un jeu de données. Caque jeu de données peut être disponible sous différentes formes, celles-ci pouvant représenter différents formats du jeu de données ou différents endpoint. Des exemples de distribution sont des fichirs CSV, des API ou des flux RSS.@fr"
    #rdf/langString
     "Αναπαριστά μία συγκεκριμένη διαθέσιμη μορφή ενός συνόλου δεδομένων. Κάθε σύνολο δεδομενων μπορεί να είναι διαθέσιμο σε διαφορετικές μορφές, οι μορφές αυτές μπορεί να αναπαριστούν διαφορετικές μορφές αρχείων ή διαφορετικά σημεία διάθεσης. Παραδείγματα διανομών συμπεριλαμβάνουν ένα μεταφορτώσιμο αρχείο μορφής CSV, ένα API ή ένα RSS feed.@el"
    #rdf/langString
     "شكل محدد لقائمة البيانات يمكن الوصول إليه. قائمة بيانات ما يمكن أن تكون متاحه باشكال و أنواع متعددة.  ملف يمكن تحميله أو واجهة برمجية يمكن من خلالها الوصول إلى البيانات هي أمثلة على ذلك.@ar"
    #rdf/langString
     "Konkrétní reprezentace datové sady. Datová sada může být dostupná v různých serializacích, které se mohou navzájem lišit různými způsoby, mimo jiné přirozeným jazykem, media-typem či formátem, schematickou organizací, časovým a prostorovým rozlišením, úrovní detailu či profily (které mohou specifikovat některé či všechny tyto rozdíly).@cs"
    #rdf/langString
     "データセットの特定の利用可能な形式を表わします。各データセットは、異なる形式で利用できることがあり、これらの形式は、データセットの異なる形式や、異なるエンドポイントを表わす可能性があります。配信の例には、ダウンロード可能なCSVファイル、API、RSSフィードが含まれます。@ja"
    #rdf/langString
     "Rappresenta una forma disponibile e specifica del dataset. Ciascun dataset può essere disponibile in forme differenti, che possono rappresentare formati diversi o diversi punti di accesso per un dataset. Esempi di distribuzioni sono un file CSV scaricabile, una API o un RSS feed.@it"
    #rdf/langString
     "A specific representation of a dataset. A dataset might be available in multiple serializations that may differ in various ways, including natural language, media-type or format, schematic organization, temporal and spatial resolution, level of detail or profiles (which might specify any or all of the above).@en"
    #rdf/langString
     "Una representación específica de los datos. Cada conjunto de datos puede estar disponible en formas diferentes, las cuáles pueden variar en distintas formas, incluyendo el idioma, 'media-type' o formato, organización esquemática, resolución temporal y espacial, nivel de detalle o perfiles (que pueden especificar cualquiera o todas las diferencias anteriores).@es"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "التوزيع@ar"
                #rdf/langString "Διανομή@el"
                #rdf/langString "Distribuce@cs"
                #rdf/langString "Distribuzione@it"
                #rdf/langString "配信@ja"
                #rdf/langString "Distribution@en"
                #rdf/langString "Distribution@fr"
                #rdf/langString "Distribution@da"
                #rdf/langString "Distribución@es"],
   :rdfs/subClassOf :rdfs/Resource,
   :skos/altLabel [#rdf/langString "Datamanifestation@da"
                   #rdf/langString "Datarepræsentation@da"
                   #rdf/langString "Dataudstilling@da"
                   #rdf/langString "Datadistribution@da"],
   :skos/definition
   [#rdf/langString
     "Konkrétní reprezentace datové sady. Datová sada může být dostupná v různých serializacích, které se mohou navzájem lišit různými způsoby, mimo jiné přirozeným jazykem, media-typem či formátem, schematickou organizací, časovým a prostorovým rozlišením, úrovní detailu či profily (které mohou specifikovat některé či všechny tyto rozdíly).@cs"
    #rdf/langString
     "Rappresenta una forma disponibile e specifica del dataset. Ciascun dataset può essere disponibile in forme differenti, che possono rappresentare formati diversi o diversi punti di accesso per un dataset. Esempi di distribuzioni sono un file CSV scaricabile, una API o un RSS feed.@it"
    #rdf/langString
     "Una representación específica de los datos. Cada conjunto de datos puede estar disponible en formas diferentes, las cuáles pueden variar en distintas formas, incluyendo el idioma, 'media-type' o formato, organización esquemática, resolución temporal y espacial, nivel de detalle o perfiles (que pueden especificar cualquiera o todas las diferencias anteriores).@es"
    #rdf/langString
     "Représente une forme spécifique d'un jeu de données. Caque jeu de données peut être disponible sous différentes formes, celles-ci pouvant représenter différents formats du jeu de données ou différents endpoint. Des exemples de distribution sont des fichirs CSV, des API ou des flux RSS.@fr"
    #rdf/langString
     "A specific representation of a dataset. A dataset might be available in multiple serializations that may differ in various ways, including natural language, media-type or format, schematic organization, temporal and spatial resolution, level of detail or profiles (which might specify any or all of the above).@en"
    #rdf/langString
     "Αναπαριστά μία συγκεκριμένη διαθέσιμη μορφή ενός συνόλου δεδομένων. Κάθε σύνολο δεδομενων μπορεί να είναι διαθέσιμο σε διαφορετικές μορφές, οι μορφές αυτές μπορεί να αναπαριστούν διαφορετικές μορφές αρχείων ή διαφορετικά σημεία διάθεσης. Παραδείγματα διανομών συμπεριλαμβάνουν ένα μεταφορτώσιμο αρχείο μορφής CSV, ένα API ή ένα RSS feed.@el"
    #rdf/langString
     "データセットの特定の利用可能な形式を表わします。各データセットは、異なる形式で利用できることがあり、これらの形式は、データセットの異なる形式や、異なるエンドポイントを表わす可能性があります。配信の例には、ダウンロード可能なCSVファイル、API、RSSフィードが含まれます。@ja"
    #rdf/langString
     "شكل محدد لقائمة البيانات يمكن الوصول إليه. قائمة بيانات ما يمكن أن تكون متاحه باشكال و أنواع متعددة.  ملف يمكن تحميله أو واجهة برمجية يمكن من خلالها الوصول إلى البيانات هي أمثلة على ذلك.@ar"
    #rdf/langString
     "En specifik repræsentation af et datasæt. Et datasæt kan være tilgængelig i mange serialiseringer der kan variere på forskellige vis, herunder sprog, medietype eller format, systemorganisering, tidslig- og geografisk opløsning, detaljeringsniveau eller profiler (der kan specificere en eller flere af ovenstående).@da"],
   :skos/scopeNote
   [#rdf/langString
     "Esta clase representa una disponibilidad general de un conjunto de datos, e implica que no existe información acerca del método de acceso real a los datos, i.e., si es un enlace de descarga directa o a través de una página Web.@es"
    #rdf/langString
     "これは、データセットの一般的な利用可能性を表わし、データの実際のアクセス方式に関する情報（つまり、直接ダウンロードなのか、APIなのか、ウェブページを介したものなのか）を意味しません。dcat:downloadURLプロパティーの使用は、直接ダウンロード可能な配信を意味します。@ja"
    #rdf/langString
     "Ceci représente une disponibilité générale du jeu de données, et implique qu'il n'existe pas d'information sur la méthode d'accès réelle des données, par exple, si c'est un lien de téléchargement direct ou à travers une page Web.@fr"
    #rdf/langString
     "Denne klasse repræsenterer datasættets overordnede tilgængelighed og giver ikke oplysninger om hvilken metode der kan anvendes til at få adgang til data, dvs. om adgang til datasættet realiseres ved direkte download, API eller via et websted. Anvendelsen af egenskaben dcat:downloadURL indikerer at distributionen kan downloades direkte.@da"
    #rdf/langString
     "Αυτό αναπαριστά μία γενική διαθεσιμότητα ενός συνόλου δεδομένων και δεν υπονοεί τίποτα περί του πραγματικού τρόπου πρόσβασης στα δεδομένα, αν είναι άμεσα μεταφορτώσιμα, μέσω API ή μέσω μίας ιστοσελίδας. Η χρήση της ιδιότητας dcat:downloadURL δείχνει μόνο άμεσα μεταφορτώσιμες διανομές.@el"
    #rdf/langString
     "This represents a general availability of a dataset it implies no information about the actual access method of the data, i.e. whether by direct download, API, or through a Web page. The use of dcat:downloadURL property indicates directly downloadable distributions.@en"
    #rdf/langString
     "Toto popisuje obecnou dostupnost datové sady. Neimplikuje žádnou informaci o skutečné metodě přístupu k datům, tj. zda jsou přímo ke stažení, skrze API či přes webovou stránku. Použití vlastnosti dcat:downloadURL indikuje přímo stažitelné distribuce.@cs"
    #rdf/langString
     "Questa classe rappresenta una disponibilità generale di un dataset e non implica alcuna informazione sul metodo di accesso effettivo ai dati, ad esempio se si tratta di un accesso a download diretto, API, o attraverso una pagina Web. L'utilizzo della proprietà dcat:downloadURL indica distribuzioni direttamente scaricabili.@it"]})

(def Relationship
  {:db/ident :dcat/Relationship,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#rdf/langString
     "Una clase de asociación para adjuntar información adicional a una relación entre recursos DCAT.@es"
    #rdf/langString
     "Asociační třída pro připojení dodatečných informací ke vztahu mezi zdroji DCAT.@cs"
    #rdf/langString
     "An association class for attaching additional information to a relationship between DCAT Resources.@en"
    #rdf/langString
     "En associationsklasse til brug for tilknytning af yderligere information til en relation mellem DCAT-ressourcer.@da"
    #rdf/langString
     "Una classe di associazione per il collegamento di informazioni aggiuntive a una relazione tra le risorse DCAT.@it"],
   :rdfs/label [#rdf/langString "Relazione@it"
                #rdf/langString "Relation@da"
                #rdf/langString "Vztah@cs"
                #rdf/langString "Relación@es"
                #rdf/langString "Relationship@en"],
   :skos/changeNote [#rdf/langString "Nuova classe aggiunta in DCAT 2.0.@it"
                     #rdf/langString "Nueva clase añadida en DCAT 2.0.@es"
                     #rdf/langString "Nová třída přidaná ve verzi DCAT 2.0.@cs"
                     #rdf/langString "New class added in DCAT 2.0.@en"
                     #rdf/langString "Ny klasse i DCAT 2.0.@da"],
   :skos/definition
   [#rdf/langString
     "An association class for attaching additional information to a relationship between DCAT Resources.@en"
    #rdf/langString
     "Una classe di associazione per il collegamento di informazioni aggiuntive a una relazione tra le risorse DCAT.@it"
    #rdf/langString
     "En associationsklasse til brug for tilknytning af yderligere information til en relation mellem DCAT-ressourcer.@da"
    #rdf/langString
     "Asociační třída pro připojení dodatečných informací ke vztahu mezi zdroji DCAT.@cs"
    #rdf/langString
     "Una clase de asociación para adjuntar información adicional a una relación entre recursos DCAT.@es"],
   :skos/scopeNote
   [#rdf/langString
     "Se usa para caracterizar la relación entre conjuntos de datos, y potencialmente otros recursos, donde la naturaleza de la relación se conoce pero no está caracterizada adecuadamente con propiedades del estándar 'Dublin Core' (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@es"
    #rdf/langString
     "Use to characterize a relationship between datasets, and potentially other resources, where the nature of the relationship is known but is not adequately characterized by the standard Dublin Core properties (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@en"
    #rdf/langString
     "Anvendes til at karakterisere en relation mellem datasæt, og potentielt andre ressourcer, hvor relationen er kendt men ikke tilstrækkeligt beskrevet af de standardiserede egenskaber i Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) eller PROV-O-egenskaber (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@da"
    #rdf/langString
     "Používá se pro charakterizaci vztahu mezi datovými sadami a případně i jinými zdroji, kde druh vztahu je sice znám, ale není přiměřeně charakterizován standardními vlastnostmi slovníku Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) či vlastnostmi slovníku PROV-O (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@cs"
    #rdf/langString
     "Viene utilizzato per caratterizzare la relazione tra insiemi di dati, e potenzialmente altri tipi di risorse, nei casi in cui la natura della relazione è nota ma non adeguatamente caratterizzata dalle proprietà dello standard 'Dublin Core' (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:require, dct:isRequiredBy) o dalle propietà fornite da PROV-O  (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov: hadPrimarySource, prov:alternateOf, prov:specializationOf).@it"]})

(def Resource
  {:db/ident :dcat/Resource,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#rdf/langString
     "Ressource udgivet eller udvalgt og arrangeret af en enkelt aktør.@da"
    #rdf/langString "Recurso publicado o curado por un agente único.@es"
    #rdf/langString "Risorsa pubblicata o curata da un singolo agente.@it"
    #rdf/langString "Zdroj publikovaný či řízený jediným činitelem.@cs"
    #rdf/langString "Resource published or curated by a single agent.@en"],
   :rdfs/label [#rdf/langString "Katalogizovaný zdroj@cs"
                #rdf/langString "Recurso catalogado@es"
                #rdf/langString "Risorsa catalogata@it"
                #rdf/langString "Katalogiseret ressource@da"
                #rdf/langString "Catalogued resource@en"],
   :skos/changeNote [#rdf/langString "New class added in DCAT 2.0.@en"
                     #rdf/langString "Nuova classe aggiunta in DCAT 2.0.@it"
                     #rdf/langString "Ny klasse i DCAT 2.0.@da"
                     #rdf/langString "Nová třída přidaná ve verzi DCAT 2.0.@cs"
                     #rdf/langString "Nueva clase agregada en DCAT 2.0.@es"],
   :skos/definition
   [#rdf/langString "Resource published or curated by a single agent.@en"
    #rdf/langString "Risorsa pubblicata o curata da un singolo agente.@it"
    #rdf/langString
     "Ressource udgivet eller udvalgt og arrangeret af en enkelt aktør.@da"
    #rdf/langString "Recurso publicado o curado por un agente único.@es"
    #rdf/langString "Zdroj publikovaný či řízený jediným činitelem.@cs"],
   :skos/scopeNote
   [#rdf/langString
     "dcat:Resource es un punto de extensión que permite la definición de cualquier tipo de catálogo. Se pueden definir subclases adicionales en perfil de DCAT o una aplicación para catálogos de otro tipo de recursos.@es"
    #rdf/langString
     "dcat:Resource je bod pro rozšíření umožňující definici různých druhů katalogů. Další podtřídy lze definovat v profilech DCAT či aplikacích pro katalogy zdrojů jiných druhů.@cs"
    #rdf/langString
     "Klassen for alle katalogiserede ressourcer, den overordnede klasse for dcat:Dataset, dcat:DataService, dcat:Catalog og enhvert medlem af et dcat:Catalog. Denne klasse bærer egenskaber der gælder alle katalogiserede ressourcer, herunder dataset og datatjenester. Det anbefales kraftigt at mere specifikke subklasser oprettes. Når der beskrives ressourcer der ikke er dcat:Dataset eller dcat:DataService, anbefales det at oprette passende subklasser af dcat:Resource eller at dcat:Resource anvendes sammen med egenskaben dct:type til opmærkning med en specifik typeangivelse.@da"
    #rdf/langString
     "Třída všech katalogizovaných zdrojů, nadtřída dcat:Dataset, dcat:DataService, dcat:Catalog a všech ostatních členů dcat:Catalog. Tato třída nese vlastnosti společné všem katalogizovaným zdrojům včetně datových sad a datových služeb. Je silně doporučeno používat specifičtější podtřídy, pokud je to možné. Při popisu zdroje, který není ani dcat:Dataset, ani dcat:DataService se doporučuje vytvořit odpovídající podtřídu dcat:Resrouce a nebo použít dcat:Resource s vlastností dct:type pro určení konkrétního typu.@cs"
    #rdf/langString
     "dcat:Resource è un punto di estensione che consente la definizione di qualsiasi tipo di catalogo. Sottoclassi aggiuntive possono essere definite in un profilo DCAT o in un'applicazione per cataloghi di altri tipi di risorse.@it"
    #rdf/langString
     "La classe di tutte le risorse catalogate, la Superclasse di dcat:Dataset, dcat:DataService, dcat:Catalog e qualsiasi altro membro di dcat:Catalog. Questa classe porta proprietà comuni a tutte le risorse catalogate, inclusi set di dati e servizi dati. Si raccomanda vivamente di utilizzare una sottoclasse più specifica. Quando si descrive una risorsa che non è un dcat:Dataset o dcat:DataService, si raccomanda di creare una sottoclasse di dcat:Resource appropriata, o utilizzare dcat:Resource con la proprietà dct:type per indicare il tipo specifico.@it"
    #rdf/langString
     "The class of all catalogued resources, the Superclass of dcat:Dataset, dcat:DataService, dcat:Catalog and any other member of a dcat:Catalog. This class carries properties common to all catalogued resources, including datasets and data services. It is strongly recommended to use a more specific sub-class. When describing a resource which is not a dcat:Dataset or dcat:DataService, it is recommended to create a suitable sub-class of dcat:Resource, or use dcat:Resource with the dct:type property to indicate the specific type.@en"
    #rdf/langString
     "La clase de todos los recursos catalogados, la superclase de dcat:Dataset, dcat:DataService, dcat:Catalog y cualquier otro miembro de un dcat:Catalog. Esta clase tiene propiedades comunes a todos los recursos catalogados, incluyendo conjuntos de datos y servicios de datos. Se recomienda fuertemente que se use una clase más específica. Cuando se describe un recurso que no es un dcat:Dataset o dcat:DataService, se recomienda crear una sub-clase apropiada de dcat:Resource, o usar dcat:Resource con la propiedad dct:type to indicar el tipo específico.@es"
    #rdf/langString
     "dcat:Resource er et udvidelsespunkt der tillader oprettelsen af enhver type af kataloger. Yderligere subklasser kan defineres i en DCAT-profil eller i en applikation til kataloger med andre typer af ressourcer.@da"
    #rdf/langString
     "dcat:Resource is an extension point that enables the definition of any kind of catalog. Additional subclasses may be defined in a DCAT profile or application for catalogs of other kinds of resources.@en"]})

(def Role
  {:db/ident :dcat/Role,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#rdf/langString
     "Role je funkce zdroje či agenta ve vztahu k jinému zdroji, v kontextu přiřazení zdrojů či vztahů mezi zdroji.@cs"
    #rdf/langString
     "Un rol es la función de un recurso o agente con respecto a otro recuros, en el contexto de atribución del recurso o de las relaciones entre recursos.@es"
    #rdf/langString
     "A role is the function of a resource or agent with respect to another resource, in the context of resource attribution or resource relationships.@en"
    #rdf/langString
     "En rolle er den funktion en ressource eller aktør har i forhold til en anden ressource, i forbindelse med ressourcekreditering eller ressourcerelationer.@da"
    #rdf/langString
     "Un ruolo è la funzione di una risorsa o di un agente rispetto ad un'altra risorsa, nel contesto dell'attribuzione delle risorse o delle relazioni tra risorse.@it"],
   :rdfs/label [#rdf/langString "Rolle@da"
                #rdf/langString "Rol@es"
                #rdf/langString "Ruolo@it"
                #rdf/langString "Role@en"
                #rdf/langString "Role@cs"],
   :rdfs/seeAlso :dcat/hadRole,
   :rdfs/subClassOf :skos/Concept,
   :skos/changeNote [#rdf/langString "Nuova classe aggiunta in DCAT 2.0.@it"
                     #rdf/langString "Nueva clase agregada en DCAT 2.0.@es"
                     #rdf/langString "Ny klasse tilføjet i DCAT 2.0.@en"
                     #rdf/langString "Nová třída přidaná ve verzi DCAT 2.0.@cs"
                     #rdf/langString "New class added in DCAT 2.0.@en"],
   :skos/definition
   [#rdf/langString
     "Role je funkce zdroje či agenta ve vztahu k jinému zdroji, v kontextu přiřazení zdrojů či vztahů mezi zdroji.@cs"
    #rdf/langString
     "A role is the function of a resource or agent with respect to another resource, in the context of resource attribution or resource relationships.@en"
    #rdf/langString
     "Un ruolo è la funzione di una risorsa o di un agente rispetto ad un'altra risorsa, nel contesto dell'attribuzione delle risorse o delle relazioni tra risorse.@it"
    #rdf/langString
     "Un rol es la función de un recurso o agente con respecto a otro recuros, en el contexto de atribución del recurso o de las relaciones entre recursos.@es"
    #rdf/langString
     "En rolle er den funktion en ressource eller aktør har i forhold til en anden ressource, i forbindelse med ressourcekreditering eller ressourcerelationer.@da"],
   :skos/editorialNote
   [#rdf/langString
     "Introduced into DCAT to complement prov:Role (whose use is limited to roles in the context of an activity, as the range of prov:hadRole).@en"
    #rdf/langString
     "Introduceret i DCAT for at supplere prov:Role (hvis anvendelse er begrænset til roller i forbindelse med en aktivitet, som er rækkevidde for prov:hadRole).@da"
    #rdf/langString
     "Přidáno do DCAT pro doplnění třídy prov:Role (jejíž užití je omezeno na role v kontextu aktivit, jakožto obor hodnot vlastnosti prov:hadRole).@cs"
    #rdf/langString
     "Introdotta in DCAT per completare prov:Role (il cui uso è limitato ai ruoli nel contesto di un'attività, in conseguenza alla definizione del codominio di prov:hadRole).@it"
    #rdf/langString
     "Incluída en DCAT para complementar prov:Role (cuyo uso está limitado a roles en el contexto de una actividad, ya que es el rango es prov:hadRole).@es"],
   :skos/scopeNote
   [#rdf/langString
     "Se usa en una relación cualificada para especificar el rol de una Entidad con respecto a otra Entidad. Se recomienda que los valores se administren como los valores de un vocabulario controlado de roles de entidad como por ejemplo: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation; el esquema de metadatos de DataCite; MARC relators https://id.loc.gov/vocabulary/relators.@es"
    #rdf/langString
     "Used in a qualified-attribution to specify the role of an Agent with respect to an Entity. It is recommended that the values be managed as a controlled vocabulary of agent roles, such as http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@en"
    #rdf/langString
     "Anvendes i forbindelse med kvalificerede krediteringer til at angive aktørens rolle i forhold til en entitet. Det anbefales at værdierne styres som et kontrolleret udfaldsrum med aktørroller, såsom http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@da"
    #rdf/langString
     "Used in a qualified-relation to specify the role of an Entity with respect to another Entity. It is recommended that the values be managed as a controlled vocabulary of entity roles such as: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation;  DataCite metadata schema;  MARC relators https://id.loc.gov/vocabulary/relators.@en"
    #rdf/langString
     "Použito v kvalifikovaném přiřazení pro specifikaci role Agenta ve vztahu k Entitě. Je doporučeno množinu hodnot spravovat jako řízený slovník rolí agentů, jako například http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@cs"
    #rdf/langString
     "Se usa en una atribución cualificada para especificar el rol de un Agente con respecto a una Entidad. Se recomienda que los valores se administren como un vocabulario controlado de roles de agente, como por ejemplo http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@es"
    #rdf/langString
     "Utilizzato in un'attribuzione qualificata per specificare il ruolo di un agente rispetto a un'entità. Si consiglia di attribuire i valori considerando un vocabolario controllato dei ruoli dell'agente, ad esempio http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@it"
    #rdf/langString
     "Anvendes i forbindelse med kvalificerede relationer til at specificere en entitets rolle i forhold til en anden entitet. Det anbefales at værdierne styres med et kontrolleret udfaldsrum for for entitetsroller såsom: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation;  DataCite metadata schema;  MARC relators https://id.loc.gov/vocabulary/relators.@da"
    #rdf/langString
     "Utilizzato in una relazione qualificata per specificare il ruolo di un'entità rispetto a un'altra entità. Si raccomanda che il valore sia preso da un vocabolario controllato di ruoli di entità come ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, o MARC relators https://id.loc.gov/vocabulary/relators.@it"
    #rdf/langString
     "Použito v kvalifikovaném vztahu pro specifikaci role Entity ve vztahu k jiné Entitě. Je doporučeno množinu hodnot spravovat jako řízený slovník rolí entit, jako například ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, či MARC relators https://id.loc.gov/vocabulary/relators.@cs"]})

(def accessService
  {:db/ident :dcat/accessService,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#rdf/langString
     "A site or end-point that gives access to the distribution of the dataset.@en"
    #rdf/langString
     "Un sito o end-point che dà accesso alla distribuzione del set di dati.@it"
    #rdf/langString
     "Un sitio o end-point que da acceso a la distribución de un conjunto de datos.@es"
    #rdf/langString
     "Umístění či přístupový bod zpřístupňující distribuci datové sady.@cs"
    #rdf/langString
     "Et websted eller endpoint der giver adgang til en repræsentation af datasættet.@da"],
   :rdfs/label [#rdf/langString "služba pro přístup k datům@cs"
                #rdf/langString "data access service@en"
                #rdf/langString "servicio de acceso de datos@es"
                #rdf/langString "dataadgangstjeneste@da"
                #rdf/langString "servizio di accesso ai dati@it"],
   :rdfs/range :dcat/DataService,
   :skos/changeNote
   [#rdf/langString "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
    #rdf/langString "New property added in DCAT 2.0.@en"
    #rdf/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
    #rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
    #rdf/langString "Nueva propiedad agregada en DCAT 2.0.@es"],
   :skos/definition
   [#rdf/langString
     "Umístění či přístupový bod zpřístupňující distribuci datové sady.@cs"
    #rdf/langString
     "Un sito o end-point che dà accesso alla distribuzione del set di dati.@it"
    #rdf/langString
     "Un sitio o end-point que da acceso a la distribución de un conjunto de datos.@es"
    #rdf/langString
     "Et websted eller endpoint der giver adgang til en repræsentation af datasættet.@da"
    #rdf/langString
     "A site or end-point that gives access to the distribution of the dataset.@en"]})

(def accessURL
  "adgangsURL"
  {:db/ident :dcat/accessURL,
   :owl/propertyChainAxiom [:dcat/accessService :dcat/endpointURL],
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#rdf/langString
     "A URL of a resource that gives access to a distribution of the dataset. E.g. landing page, feed, SPARQL endpoint. Use for all cases except a simple download link, in which case downloadURL is preferred.@en"
    #rdf/langString
     "Puede ser cualquier tipo de URL que de acceso a una distribución del conjunto de datos, e.g., página de destino, descarga, URL feed, punto de acceso SPARQL. Esta propriedad se debe usar cuando su catálogo de datos no tiene información sobre donde está o cuando no se puede descargar.@es"
    #rdf/langString
     "En URL for en ressource som giver adgang til en repræsentation af datsættet. Fx destinationsside, feed, SPARQL-endpoint. Anvendes i alle sammenhænge undtagen til angivelse af et simpelt download link hvor anvendelse af egenskaben downloadURL foretrækkes.@da"
    #rdf/langString
     "URL zdroje, přes které je přístupná distribuce datové sady. Příkladem může být vstupní stránka, RSS kanál či SPARQL endpoint. Použijte ve všech případech kromě URL souboru ke stažení, pro které je lepší použít dcat:downloadURL.@cs"
    #rdf/langString
     "Μπορεί να είναι οποιουδήποτε είδους URL που δίνει πρόσβαση στη διανομή ενός συνόλου δεδομένων. Π.χ. ιστοσελίδα αρχικής πρόσβασης, μεταφόρτωση, feed URL, σημείο διάθεσης SPARQL. Να χρησιμοποιείται όταν ο κατάλογος δεν περιέχει πληροφορίες εαν πρόκειται ή όχι για μεταφορτώσιμο αρχείο.@el"
    #rdf/langString
     "Un URL di una risorsa che consente di accedere a una distribuzione del set di dati. Per esempio, pagina di destinazione, feed, endpoint SPARQL. Da utilizzare per tutti i casi, tranne  quando  si tratta di un semplice link per il download nel qual caso è preferito downloadURL.@it"
    #rdf/langString
     "データセットの配信にアクセス権を与えるランディング・ページ、フィード、SPARQLエンドポイント、その他の種類の資源。@ja"
    #rdf/langString
     "Ceci peut être tout type d'URL qui donne accès à une distribution du jeu de données. Par exemple, un lien à une page HTML contenant un lien au jeu de données, un Flux RSS, un point d'accès SPARQL. Utilisez le lorsque votre catalogue ne contient pas d'information sur quoi il est ou quand ce n'est pas téléchargeable.@fr"
    #rdf/langString
     "أي رابط يتيح الوصول إلى البيانات. إذا كان الرابط هو ربط مباشر لملف يمكن تحميله استخدم الخاصية downloadURL@ar"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "přístupová adresa@cs"
                #rdf/langString "URL d'accès@fr"
                #rdf/langString "アクセスURL@ja"
                #rdf/langString "access address@en"
                #rdf/langString "URL πρόσβασης@el"
                #rdf/langString "رابط وصول@ar"
                #rdf/langString "URL de acceso@es"
                #rdf/langString "indirizzo di accesso@it"
                #rdf/langString "adgangsadresse@da"],
   :rdfs/range :rdfs/Resource,
   :skos/altLabel #rdf/langString "adgangsURL@da",
   :skos/definition
   [#rdf/langString
     "En URL for en ressource som giver adgang til en repræsentation af datsættet. Fx destinationsside, feed, SPARQL-endpoint. Anvendes i alle sammenhænge undtagen til angivelse af et simpelt download link hvor anvendelse af egenskaben downloadURL foretrækkes.@da"
    #rdf/langString
     "データセットの配信にアクセス権を与えるランディング・ページ、フィード、SPARQLエンドポイント、その他の種類の資源。@ja"
    #rdf/langString
     "A URL of a resource that gives access to a distribution of the dataset. E.g. landing page, feed, SPARQL endpoint. Use for all cases except a simple download link, in which case downloadURL is preferred.@en"
    #rdf/langString
     "Ceci peut être tout type d'URL qui donne accès à une distribution du jeu de données. Par exemple, un lien à une page HTML contenant un lien au jeu de données, un Flux RSS, un point d'accès SPARQL. Utilisez le lorsque votre catalogue ne contient pas d'information sur quoi il est ou quand ce n'est pas téléchargeable.@fr"
    #rdf/langString
     "Un URL di una risorsa che consente di accedere a una distribuzione del set di dati. Per esempio, pagina di destinazione, feed, endpoint SPARQL. Da utilizzare per tutti i casi, tranne  quando  si tratta di un semplice link per il download nel qual caso è preferito downloadURL.@it"
    #rdf/langString
     "Μπορεί να είναι οποιουδήποτε είδους URL που δίνει πρόσβαση στη διανομή ενός συνόλου δεδομένων. Π.χ. ιστοσελίδα αρχικής πρόσβασης, μεταφόρτωση, feed URL, σημείο διάθεσης SPARQL. Να χρησιμοποιείται όταν ο κατάλογος δεν περιέχει πληροφορίες εαν πρόκειται ή όχι για μεταφορτώσιμο αρχείο.@el"
    #rdf/langString
     "Puede ser cualquier tipo de URL que de acceso a una distribución del conjunto de datos, e.g., página de destino, descarga, URL feed, punto de acceso SPARQL. Esta propriedad se debe usar cuando su catálogo de datos no tiene información sobre donde está o cuando no se puede descargar.@es"
    #rdf/langString
     "URL zdroje, přes které je přístupná distribuce datové sady. Příkladem může být vstupní stránka, RSS kanál či SPARQL endpoint. Použijte ve všech případech kromě URL souboru ke stažení, pro které je lepší použít dcat:downloadURL.@cs"
    #rdf/langString
     "أي رابط يتيح الوصول إلى البيانات. إذا كان الرابط هو ربط مباشر لملف يمكن تحميله استخدم الخاصية downloadURL@ar"],
   :skos/editorialNote
   [#rdf/langString
     "rdfs:label, rdfs:comment and skos:scopeNote have been modified. Non-english versions except for Italian must be updated.@en"
    #rdf/langString
     "Status: English Definition text modified by DCAT revision team, updated Italian and Czech translation provided, translations for other languages pending.@en"],
   :skos/scopeNote
   [#rdf/langString
     "Se le distribuzioni sono accessibili solo attraverso una pagina web (ad esempio, gli URL per il download diretto non sono noti), allora il link della pagina web deve essere duplicato come accessURL sulla distribuzione.@it"
    #rdf/langString
     "Hvis en eller flere distributioner kun er tilgængelige via en destinationsside (dvs. en URL til direkte download er ikke kendt), så bør destinationssidelinket gentages som adgangsadresse for distributionen.@da"
    #rdf/langString
     "Pokud jsou distribuce přístupné pouze přes vstupní stránku (tj. URL pro přímé stažení nejsou známa), pak by URL přístupové stránky mělo být duplikováno ve vlastnosti distribuce accessURL.@cs"
    #rdf/langString
     "El rango es una URL. Si la distribución es accesible solamente través de una página de destino (es decir, si no se conoce una URL de descarga directa), entonces el enlance a la página de destino debe ser duplicado como accessURL en la distribución.@es"
    #rdf/langString
     "Η τιμή είναι ένα URL. Αν η/οι διανομή/ές είναι προσβάσιμη/ες μόνο μέσω μίας ιστοσελίδας αρχικής πρόσβασης (δηλαδή αν δεν υπάρχουν γνωστές διευθύνσεις άμεσης μεταφόρτωσης), τότε ο σύνδεσμος της ιστοσελίδας αρχικής πρόσβασης πρέπει να αναπαραχθεί ως accessURL σε μία διανομή.@el"
    #rdf/langString
     "La valeur est une URL. Si la distribution est accessible seulement au travers d'une page d'atterrissage (c-à-dire on n'ignore une URL de téléchargement direct), alors le lien à la page d'atterrissage doit être dupliqué comee accessURL sur la distribution.@fr"
    #rdf/langString
     "確実にダウンロードでない場合や、ダウンロードかどうかが不明である場合は、downloadURLではなく、accessURLを用いてください。ランディング・ページを通じてしか配信にアクセスできない場合（つまり、直接的なダウンロードURLが不明）は、配信におけるaccessURLとしてランディング・ページのリンクをコピーすべきです（SHOULD）。@ja"
    #rdf/langString
     "If the distribution(s) are accessible only through a landing page (i.e. direct download URLs are not known), then the landing page link should be duplicated as accessURL on a distribution.@en"]})

(def bbox
  {:db/ident :dcat/bbox,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/domain :dcterms/Location,
   :rdfs/label [#rdf/langString "bounding box@da"
                #rdf/langString "bounding box@en"
                #rdf/langString "cuadro delimitador@es"
                #rdf/langString "ohraničení oblasti@cs"
                #rdf/langString "quadro di delimitazione@it"],
   :rdfs/range :rdfs/Literal,
   :skos/changeNote
   [#rdf/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
    #rdf/langString "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
    #rdf/langString "Propiedad nueva agregada en DCAT 2.0.@es"
    #rdf/langString "New property added in DCAT 2.0.@en"
    #rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"],
   :skos/definition
   [#rdf/langString "Den geografiske omskrevne firkant af en ressource.@da"
    #rdf/langString "Il riquadro di delimitazione geografica di una risorsa.@it"
    #rdf/langString "Ohraničení geografické oblasti zdroje.@cs"
    #rdf/langString "El cuadro delimitador geográfico para un recurso.@es"
    #rdf/langString "The geographic bounding box of a resource.@en"],
   :skos/scopeNote
   [#rdf/langString
     "El rango de esta propiedad es intencionalmente genérico con el propósito de permitir distintas codificaciones geométricas. Por ejemplo, la geometría puede ser codificada como WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL]).@es"
    #rdf/langString
     "The range of this property is intentionally generic, with the purpose of allowing different geometry encodings. E.g., the geometry could be encoded with as WKT (geosparql:wktLiteral [GeoSPARQL]) or [GML] (geosparql:asGML [GeoSPARQL]).@en"
    #rdf/langString
     "Il range di questa proprietà è volutamente generica, con lo scopo di consentire diverse codifiche geometriche. Ad esempio, la geometria potrebbe essere codificata con WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL]).@it"
    #rdf/langString
     "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé kódování geometrií. Geometrie by kupříkladu mohla být kódována jako WKT (geosparql:wktLiteral [GeoSPARQL]) či [GML] (geosparql:asGML [GeoSPARQL]).@cs"
    #rdf/langString
     "Rækkevidden for denne egenskab er bevidst generisk defineret med det formål at tillade forskellige kodninger af geometrier. Geometrien kan eksempelvis repræsenteres som WKT (geosparql:asWKT [GeoSPARQL]) eller [GML] (geosparql:asGML [GeoSPARQL]).@da"]})

(def byteSize
  {:db/ident :dcat/byteSize,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   [#rdf/langString "الحجم بالبايتات @ar"
    #rdf/langString "Το μέγεθος μιας διανομής σε bytes.@el"
    #rdf/langString "The size of a distribution in bytes.@en"
    #rdf/langString "Velikost distribuce v bajtech.@cs"
    #rdf/langString "バイトによる配信のサイズ。@ja"
    #rdf/langString "La taille de la distribution en octects@fr"
    #rdf/langString "Størrelsen af en distributionen angivet i bytes.@da"
    #rdf/langString "La dimensione di una distribuzione in byte.@it"
    #rdf/langString "El tamaño de una distribución en bytes.@es"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "μέγεθος σε bytes@el"
                #rdf/langString "velikost v bajtech@cs"
                #rdf/langString "byte size@en"
                #rdf/langString "tamaño en bytes@es"
                #rdf/langString "dimensione in byte@it"
                #rdf/langString "الحجم بالبايت@ar"
                #rdf/langString "バイト・サイズ@ja"
                #rdf/langString "taille en octects@fr"
                #rdf/langString "bytestørrelse@da"],
   :rdfs/range :rdfs/Literal,
   :skos/definition
   [#rdf/langString "Το μέγεθος μιας διανομής σε bytes.@el"
    #rdf/langString "Størrelsen af en distribution angivet i bytes.@da"
    #rdf/langString "الحجم بالبايتات @ar"
    #rdf/langString "El tamaño de una distribución en bytes.@es"
    #rdf/langString "Velikost distribuce v bajtech.@cs"
    #rdf/langString "La dimensione di una distribuzione in byte.@it"
    #rdf/langString "The size of a distribution in bytes.@en"
    #rdf/langString "La taille de la distribution en octects.@fr"
    #rdf/langString "バイトによる配信のサイズ。@ja"],
   :skos/scopeNote
   [#rdf/langString
     "Το μέγεθος σε bytes μπορεί να προσεγγιστεί όταν η ακριβής τιμή δεν είναι γνωστή. Η τιμή της dcat:byteSize θα πρέπει να δίνεται με τύπο δεδομένων xsd:decimal.@el"
    #rdf/langString
     "الحجم يمكن أن يكون تقريبي إذا كان الحجم الدقيق غير معروف@ar"
    #rdf/langString
     "Bytestørrelsen kan approximeres hvis den præcise størrelse ikke er kendt. Værdien af dcat:byteSize bør angives som xsd:decimal.@da"
    #rdf/langString
     "Velikost v bajtech může být přibližná, pokud její přesná hodnota není známa. Literál s hodnotou dcat:byteSize by měl mít datový typ xsd:decimal.@cs"
    #rdf/langString
     "El tamaño en bytes puede ser aproximado cuando se desconoce el tamaño exacto. El valor literal de dcat:byteSize debe tener tipo 'xsd:decimal'.@es"
    #rdf/langString "正確なサイズが不明である場合、サイズは、バイトによる近似値を示すことができます。@ja"
    #rdf/langString
     "La taille en octects peut être approximative lorsque l'on ignore la taille réelle. La valeur littérale de dcat:byteSize doit être de type xsd:decimal.@fr"
    #rdf/langString
     "The size in bytes can be approximated when the precise size is not known. The literal value of dcat:byteSize should by typed as xsd:decimal.@en"
    #rdf/langString
     "La dimensione in byte può essere approssimata quando non si conosce la dimensione precisa. Il valore di dcat:byteSize dovrebbe essere espresso come un xsd:decimal.@it"]})

(def catalog
  "har delkatalog"
  {:db/ident :dcat/catalog,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#rdf/langString
     "Un catálogo cuyo contenido es de interés en el contexto del catálogo que está siendo descripto.@es"
    #rdf/langString
     "Un catalogo i cui contenuti sono di interesse nel contesto di questo catalogo.@it"
    #rdf/langString
     "Et katalog hvis indhold er relevant i forhold til det aktuelle katalog.@da"
    #rdf/langString
     "Katalog, jehož obsah je v kontextu tohoto katalogu zajímavý.@cs"
    #rdf/langString
     "A catalog whose contents are of interest in the context of this catalog.@en"],
   :rdfs/domain :dcat/Catalog,
   :rdfs/label [#rdf/langString "catálogo@es"
                #rdf/langString "catalogo@it"
                #rdf/langString "katalog@da"
                #rdf/langString "katalog@cs"
                #rdf/langString "catalog@en"],
   :rdfs/range :dcat/Catalog,
   :rdfs/subPropertyOf [:rdfs/member :dcterms/hasPart],
   :skos/altLabel #rdf/langString "har delkatalog@da",
   :skos/changeNote [#rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #rdf/langString "New property added in DCAT 2.0.@en"
                     #rdf/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #rdf/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"],
   :skos/definition
   [#rdf/langString
     "Un catalogo i cui contenuti sono di interesse nel contesto di questo catalogo.@it"
    #rdf/langString
     "Katalog, jehož obsah je v kontextu tohoto katalogu zajímavý.@cs"
    #rdf/langString
     "Et katalog hvis indhold er relevant i forhold til det aktuelle katalog.@da"
    #rdf/langString
     "Un catálogo cuyo contenido es de interés en el contexto del catálogo que está siendo descripto.@es"
    #rdf/langString
     "A catalog whose contents are of interest in the context of this catalog.@en"]})

(def centroid
  "centroide"
  {:db/ident :dcat/centroid,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :dcterms/Location,
   :rdfs/label [#rdf/langString "centroide@es"
                #rdf/langString "centroide@it"
                #rdf/langString "centroid@en"
                #rdf/langString "centroid@cs"
                #rdf/langString "geometrisk tyngdepunkt@da"],
   :rdfs/range :rdfs/Literal,
   :skos/altLabel #rdf/langString "centroide@da",
   :skos/changeNote [#rdf/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
                     #rdf/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #rdf/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #rdf/langString "New property added in DCAT 2.0.@en"],
   :skos/definition
   [#rdf/langString "Il centro geografico (centroide) di una risorsa.@it"
    #rdf/langString "Geografický střed (centroid) zdroje.@cs"
    #rdf/langString "Det geometrisk tyngdepunkt (centroid) for en ressource.@da"
    #rdf/langString "El centro geográfico (centroide) de un recurso.@es"
    #rdf/langString "The geographic center (centroid) of a resource.@en"],
   :skos/scopeNote
   [#rdf/langString
     "Rækkevidden for denne egenskab er bevidst generisk definere med det formål at tillade forskellige geokodninger. Geometrien kan eksempelvis repræsenteres som WKT (geosparql:asWKT [GeoSPARQL]) eller [GML] (geosparql:asGML [GeoSPARQL]).@da"
    #rdf/langString
     "The range of this property is intentionally generic, with the purpose of allowing different geometry encodings. E.g., the geometry could be encoded with as WKT (geosparql:wktLiteral [GeoSPARQL]) or [GML] (geosparql:asGML [GeoSPARQL]).@en"
    #rdf/langString
     "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé kódování geometrií. Geometrie by kupříkladu mohla být kódována jako WKT (geosparql:wktLiteral [GeoSPARQL]) či [GML] (geosparql:asGML [GeoSPARQL]).@cs"
    #rdf/langString
     "El rango de esta propiedad es intencionalmente genérico con el objetivo de permitir distintas codificaciones geométricas. Por ejemplo, la geometría puede codificarse como WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL]).@es"
    #rdf/langString
     "Il range di questa proprietà è volutamente generica, con lo scopo di consentire diverse codifiche geometriche. Ad esempio, la geometria potrebbe essere codificata con WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL]).@it"]})

(def compressFormat
  {:db/ident :dcat/compressFormat,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#rdf/langString
     "Il formato di compressione della distribuzione nel quale i dati sono in forma compressa, ad es. per ridurre le dimensioni del file da scaricare.@it"
    #rdf/langString
     "Formát komprese souboru, ve kterém jsou data poskytována v komprimované podobě, např. ke snížení velikosti souboru ke stažení.@cs"
    #rdf/langString
     "The compression format of the distribution in which the data is contained in a compressed form, e.g. to reduce the size of the downloadable file.@en"
    #rdf/langString
     "Kompressionsformatet for distributionen som indeholder data i et komprimeret format, fx for at reducere størrelsen af downloadfilen.@da"
    #rdf/langString
     "El formato de la distribución en el que los datos están en forma comprimida, e.g. para reducir el tamaño del archivo a bajar.@es"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/TR/vocab-dcat-2/"},
   :rdfs/label [#rdf/langString "compression format@en"
                #rdf/langString "kompressionsformat@da"
                #rdf/langString "formato de compresión@es"
                #rdf/langString "formato di compressione@it"
                #rdf/langString "formát komprese@cs"],
   :rdfs/range :dcterms/MediaType,
   :rdfs/subPropertyOf :dcterms/format,
   :skos/changeNote [#rdf/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
                     #rdf/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #rdf/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #rdf/langString "New property added in DCAT 2.0.@en"],
   :skos/definition
   [#rdf/langString
     "Kompressionsformatet for distributionen som indeholder data i et komprimeret format, fx for at reducere størrelsen af downloadfilen.@da"
    #rdf/langString
     "Formát komprese souboru, ve kterém jsou data poskytována v komprimované podobě, např. ke snížení velikosti souboru ke stažení.@cs"
    #rdf/langString
     "El formato de la distribución en el que los datos están en forma comprimida, e.g. para reducir el tamaño del archivo a bajar.@es"
    #rdf/langString
     "Il formato di compressione della distribuzione nel quale i dati sono in forma compressa, ad es. per ridurre le dimensioni del file da scaricare.@it"
    #rdf/langString
     "The compression format of the distribution in which the data is contained in a compressed form, e.g. to reduce the size of the downloadable file.@en"],
   :skos/scopeNote
   [#rdf/langString
     "Questa proprietà deve essere utilizzata quando i file nella distribuzione sono compressi, ad es. in un file ZIP. Il formato DOVREBBE essere espresso usando un tipo di media come definito dal registro dei tipi di media IANA https://www.iana.org/assignments/media-types/, se disponibile.@it"
    #rdf/langString
     "Denne egenskab kan anvendes når filerne i en distribution er blevet komprimeret, fx i en ZIP-fil. Formatet BØR udtrykkes ved en medietype som defineret i 'IANA media types registry', hvis der optræder en relevant medietype dér: https://www.iana.org/assignments/media-types/.@da"
    #rdf/langString
     "This property is to be used when the files in the distribution are compressed, e.g. in a ZIP file. The format SHOULD be expressed using a media type as defined by IANA media types registry https://www.iana.org/assignments/media-types/, if available.@en"
    #rdf/langString
     "Tato vlastnost se použije, když jsou soubory v distribuci komprimovány, např. v ZIP souboru. Formát BY MĚL být vyjádřen pomocí typu média definovaného v registru IANA https://www.iana.org/assignments/media-types/, pokud existuje.@cs"
    #rdf/langString
     "Esta propiedad se debe usar cuando los archivos de la distribución están comprimidos, por ejemplo en un archivo ZIP. El formato DEBERÍA expresarse usando un 'media type', tales como los definidos en el registro IANA de 'media types' https://www.iana.org/assignments/media-types/, si está disponibles.@es"]})

(def contactPoint
  {:db/ident :dcat/contactPoint,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#rdf/langString
     "Relevante kontaktoplysninger for den katalogiserede ressource. Anvendelse af vCard anbefales.@da"
    #rdf/langString
     "Relevant contact information for the catalogued resource. Use of vCard is recommended.@en"
    #rdf/langString
     "Relie un jeu de données à une information de contact utile en utilisant VCard.@fr"
    #rdf/langString
     "Información relevante de contacto para el recurso catalogado. Se recomienda el uso de vCard.@es"
    #rdf/langString
     "Informazioni di contatto rilevanti per la risorsa catalogata. Si raccomanda l'uso di vCard.@it"
    #rdf/langString "データセットを、VCardを用いて提供されている適切な連絡先情報にリンクします。@ja"
    #rdf/langString "تربط قائمة البيانات بعنوان اتصال موصف  باستخدام VCard@ar"
    #rdf/langString
     "Συνδέει ένα σύνολο δεδομένων με ένα σχετικό σημείο επικοινωνίας, μέσω VCard.@el"
    #rdf/langString
     "Relevantní kontaktní informace pro katalogizovaný zdroj. Doporučuje se použít slovník VCard.@cs"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "point de contact@fr"
                #rdf/langString "عنوان اتصال@ar"
                #rdf/langString "窓口@ja"
                #rdf/langString "contact point@en"
                #rdf/langString "σημείο επικοινωνίας@el"
                #rdf/langString "kontaktní bod@cs"
                #rdf/langString "punto di contatto@it"
                #rdf/langString "Punto de contacto@es"
                #rdf/langString "kontaktpunkt@da"],
   :rdfs/range :vcard/Kind,
   :skos/definition
   [#rdf/langString
     "Relie un jeu de données à une information de contact utile en utilisant VCard.@fr"
    #rdf/langString
     "Informazioni di contatto rilevanti per la risorsa catalogata. Si raccomanda l'uso di vCard.@it"
    #rdf/langString
     "Συνδέει ένα σύνολο δεδομένων με ένα σχετικό σημείο επικοινωνίας, μέσω VCard.@el"
    #rdf/langString
     "Relevant contact information for the catalogued resource. Use of vCard is recommended.@en"
    #rdf/langString
     "Información relevante de contacto para el recurso catalogado. Se recomienda el uso de vCard.@es"
    #rdf/langString "データセットを、VCardを用いて提供されている適切な連絡先情報にリンクします。@ja"
    #rdf/langString
     "Relevante kontaktoplysninger for den katalogiserede ressource. Anvendelse af vCard anbefales.@da"
    #rdf/langString "تربط قائمة البيانات بعنوان اتصال موصف  باستخدام VCard@ar"
    #rdf/langString
     "Relevantní kontaktní informace pro katalogizovaný zdroj. Doporučuje se použít slovník VCard.@cs"],
   :skos/editorialNote
   #rdf/langString
    "Status: English Definition text modified by DCAT revision team, Italian, Spanish and Czech translations provided, other translations pending.@en"})

(def dataset
  {:db/ident :dcat/dataset,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#rdf/langString "Kolekce dat, která je katalogizována v katalogu.@cs"
    #rdf/langString "Una raccolta di dati che è elencata nel catalogo.@it"
    #rdf/langString "Un conjunto de datos que se lista en el catálogo.@es"
    #rdf/langString "En samling af data som er opført i kataloget.@da"
    #rdf/langString "تربط الفهرس بقائمة بيانات ضمنه@ar"
    #rdf/langString "A collection of data that is listed in the catalog.@en"
    #rdf/langString "カタログの一部であるデータセット。@ja"
    #rdf/langString
     "Relie un catalogue à un jeu de données faisant partie de ce catalogue.@fr"
    #rdf/langString
     "Συνδέει έναν κατάλογο με ένα σύνολο δεδομένων το οποίο ανήκει στον εν λόγω κατάλογο.@el"],
   :rdfs/domain :dcat/Catalog,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "σύνολο δεδομένων@el"
                #rdf/langString "قائمة بيانات@ar"
                #rdf/langString "conjunto de datos@es"
                #rdf/langString "datová sada@cs"
                #rdf/langString "dataset@it"
                #rdf/langString "dataset@en"
                #rdf/langString "jeu de données@fr"
                #rdf/langString "データセット@ja"
                #rdf/langString "datasæt@da"],
   :rdfs/range :dcat/Dataset,
   :rdfs/subPropertyOf [:rdfs/member :dcterms/hasPart],
   :skos/altLabel [#rdf/langString "har datasæt@da"
                   #rdf/langString "datasamling@da"],
   :skos/definition
   [#rdf/langString
     "Συνδέει έναν κατάλογο με ένα σύνολο δεδομένων το οποίο ανήκει στον εν λόγω κατάλογο.@el"
    #rdf/langString "カタログの一部であるデータセット。@ja"
    #rdf/langString
     "Relie un catalogue à un jeu de données faisant partie de ce catalogue.@fr"
    #rdf/langString "Kolekce dat, která je katalogizována v katalogu.@cs"
    #rdf/langString "Una raccolta di dati che è elencata nel catalogo.@it"
    #rdf/langString "تربط الفهرس بقائمة بيانات ضمنه@ar"
    #rdf/langString "A collection of data that is listed in the catalog.@en"
    #rdf/langString "En samling af data som er opført i kataloget.@da"
    #rdf/langString "Un conjunto de datos que se lista en el catálogo.@es"],
   :skos/editorialNote
   #rdf/langString
    "Status: English Definition text modified by DCAT revision team, Italian, Spanish and Czech translation provided, other translations pending.@en"})

(def distribution
  "har distribution"
  {:db/ident :dcat/distribution,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#rdf/langString
     "Connecte un jeu de données à des distributions disponibles.@fr"
    #rdf/langString "Una distribución disponible del conjunto de datos.@es"
    #rdf/langString "An available distribution of the dataset.@en"
    #rdf/langString "En tilgængelig repræsentation af datasættet.@da"
    #rdf/langString "Una distribuzione disponibile per il set di dati.@it"
    #rdf/langString
     "تربط قائمة البيانات بطريقة أو بشكل يسمح  الوصول الى البيانات@ar"
    #rdf/langString "データセットを、その利用可能な配信に接続します。@ja"
    #rdf/langString "Dostupná distribuce datové sady.@cs"
    #rdf/langString
     "Συνδέει ένα σύνολο δεδομένων με μία από τις διαθέσιμες διανομές του.@el"],
   :rdfs/domain :dcat/Dataset,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "データセット配信@ja"
                #rdf/langString "distribution@da"
                #rdf/langString "distribution@fr"
                #rdf/langString "distribution@en"
                #rdf/langString "distribuzione@it"
                #rdf/langString "διανομή@el"
                #rdf/langString "توزيع@ar"
                #rdf/langString "distribución@es"
                #rdf/langString "distribuce@cs"],
   :rdfs/range :dcat/Distribution,
   :rdfs/subPropertyOf :dcterms/relation,
   :skos/altLabel #rdf/langString "har distribution@da",
   :skos/definition
   [#rdf/langString
     "Συνδέει ένα σύνολο δεδομένων με μία από τις διαθέσιμες διανομές του.@el"
    #rdf/langString
     "Connecte un jeu de données à des distributions disponibles.@fr"
    #rdf/langString "Una distribución disponible del conjunto de datos.@es"
    #rdf/langString "データセットを、その利用可能な配信に接続します。@ja"
    #rdf/langString
     "تربط قائمة البيانات بطريقة أو بشكل يسمح  الوصول الى البيانات@ar"
    #rdf/langString "En tilgængelig repræsentation af datasættet.@da"
    #rdf/langString "Una distribuzione disponibile per il set di dati.@it"
    #rdf/langString "An available distribution of the dataset.@en"
    #rdf/langString "Dostupná distribuce datové sady.@cs"],
   :skos/editorialNote
   #rdf/langString
    "Status: English Definition text modified by DCAT revision team, translations pending (except for Italian, Spanish and Czech).@en"})

(def downloadURL
  {:db/ident :dcat/downloadURL,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#rdf/langString
     "URL til fil der kan downloades i et bestemt format. Fx en CSV-fil eller en RDF-fil. Formatet for distributionen angives ved hjælp af egenskaberne dct:format og/eller dcat:mediaType.@da"
    #rdf/langString
     "The URL of the downloadable file in a given format. E.g. CSV file or RDF file. The format is indicated by the distribution's dct:format and/or dcat:mediaType.@en"
    #rdf/langString
     "Ceci est un lien direct à un fichier téléchargeable en un format donnée. Exple fichier CSV ou RDF. Le format est décrit par les propriétés de distribution dct:format et/ou dcat:mediaType.@fr"
    #rdf/langString
     "La URL de un archivo descargable en el formato dato. Por ejemplo, archivo CSV o archivo RDF. El formato se describe con las propiedades de la distribución dct:format y/o dcat:mediaType.@es"
    #rdf/langString
     "Questo è un link diretto al file scaricabile in un dato formato. E.g. un file CSV o un file RDF. Il formato è descritto dal dct:format e/o dal dcat:mediaType della distribuzione.@it"
    #rdf/langString
     "URL souboru ke stažení v daném formátu, například CSV nebo RDF soubor. Formát je popsán vlastností distribuce dct:format a/nebo dcat:mediaType.@cs"
    #rdf/langString
     "dcat:downloadURLはdcat:accessURLの特定の形式です。しかし、DCATプロファイルが非ダウンロード・ロケーションに対してのみaccessURLを用いる場合には、より強い分離を課すことを望む可能性があるため、この含意を強化しないように、DCATは、dcat:downloadURLをdcat:accessURLのサブプロパティーであると定義しません。@ja"
    #rdf/langString
     "Είναι ένας σύνδεσμος άμεσης μεταφόρτωσης ενός αρχείου σε μια δεδομένη μορφή. Π.χ. ένα αρχείο CSV ή RDF. Η μορφη αρχείου περιγράφεται από τις ιδιότητες dct:format ή/και dcat:mediaType της διανομής.@el"
    #rdf/langString
     "رابط مباشر لملف يمكن تحميله. نوع الملف يتم توصيفه باستخدام الخاصية dct:format dcat:mediaType @ar"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "downloadURL@da"
                #rdf/langString "URL de descarga@es"
                #rdf/langString "رابط تحميل@ar"
                #rdf/langString "ダウンロードURL@ja"
                #rdf/langString "URL di scarico@it"
                #rdf/langString "download URL@en"
                #rdf/langString "URL souboru ke stažení@cs"
                #rdf/langString "URL μεταφόρτωσης@el"
                #rdf/langString "URL de téléchargement@fr"],
   :rdfs/range :rdfs/Resource,
   :skos/definition
   [#rdf/langString
     "Ceci est un lien direct à un fichier téléchargeable en un format donnée. Exple fichier CSV ou RDF. Le format est décrit par les propriétés de distribution dct:format et/ou dcat:mediaType.@fr"
    #rdf/langString
     "dcat:downloadURLはdcat:accessURLの特定の形式です。しかし、DCATプロファイルが非ダウンロード・ロケーションに対してのみaccessURLを用いる場合には、より強い分離を課すことを望む可能性があるため、この含意を強化しないように、DCATは、dcat:downloadURLをdcat:accessURLのサブプロパティーであると定義しません。@ja"
    #rdf/langString
     "Questo è un link diretto al file scaricabile in un dato formato. E.g. un file CSV o un file RDF. Il formato è descritto dal dct:format e/o dal dcat:mediaType della distribuzione.@it"
    #rdf/langString
     "The URL of the downloadable file in a given format. E.g. CSV file or RDF file. The format is indicated by the distribution's dct:format and/or dcat:mediaType.@en"
    #rdf/langString
     "رابط مباشر لملف يمكن تحميله. نوع الملف يتم توصيفه باستخدام الخاصية dct:format dcat:mediaType @ar"
    #rdf/langString
     "URL souboru ke stažení v daném formátu, například CSV nebo RDF soubor. Formát je popsán vlastností distribuce dct:format a/nebo dcat:mediaType.@cs"
    #rdf/langString
     "Είναι ένας σύνδεσμος άμεσης μεταφόρτωσης ενός αρχείου σε μια δεδομένη μορφή. Π.χ. ένα αρχείο CSV ή RDF. Η μορφη αρχείου περιγράφεται από τις ιδιότητες dct:format ή/και dcat:mediaType της διανομής.@el"
    #rdf/langString
     "URL til fil der kan downloades i et bestemt format. Fx en CSV-fil eller en RDF-fil. Formatet for distributionen angives ved hjælp af egenskaberne dct:format og/eller dcat:mediaType.@da"
    #rdf/langString
     "La URL de un archivo descargable en el formato dato. Por ejemplo, archivo CSV o archivo RDF. El formato se describe con las propiedades de la distribución dct:format y/o dcat:mediaType.@es"],
   :skos/editorialNote
   [#rdf/langString
     "Status: English  Definition text modified by DCAT revision team, Italian, Spanish and Czech translation updated, other translations pending.@en"
    #rdf/langString
     "rdfs:label, rdfs:comment and/or skos:scopeNote have been modified. Non-english versions must be updated.@en"],
   :skos/scopeNote
   [#rdf/langString "La valeur est une URL.@fr"
    #rdf/langString
     "dcat:downloadURL SHOULD be used for the address at which this distribution is available directly, typically through a HTTP Get request.@en"
    #rdf/langString
     "dcat:downloadURL BY MĚLA být použita pro adresu, ze které je distribuce přímo přístupná, typicky skrze požadavek HTTP Get.@cs"
    #rdf/langString
     "dcat:downloadURL DOVREBBE essere utilizzato per l'indirizzo a cui questa distribuzione è disponibile direttamente, in genere attraverso una richiesta Get HTTP.@it"
    #rdf/langString "El valor es una URL.@es"
    #rdf/langString
     "dcat:downloadURL BØR anvendes til angivelse af den adresse hvor distributionen er tilgængelig direkte, typisk gennem et HTTP Get request.@da"
    #rdf/langString "Η τιμή είναι ένα URL.@el"]})

(def endDate
  "sluttidspunkt"
  {:db/ident :dcat/endDate,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/domain :dcterms/PeriodOfTime,
   :rdfs/label [#rdf/langString "data di fine@it"
                #rdf/langString "datum konce@cs"
                #rdf/langString "slutdato@da"
                #rdf/langString "end date@en"
                #rdf/langString "fecha final@es"],
   :rdfs/range :rdfs/Literal,
   :skos/altLabel #rdf/langString "sluttidspunkt@da",
   :skos/changeNote [#rdf/langString "New property added in DCAT 2.0.@en"
                     #rdf/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #rdf/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #rdf/langString "Ny egenskab i DCAT 2.0.@da"],
   :skos/definition [#rdf/langString "El fin del período.@es"
                     #rdf/langString "Slutningen på perioden.@da"
                     #rdf/langString "La fine del periodo.@it"
                     #rdf/langString "Konec doby trvání.@cs"
                     #rdf/langString "The end of the period.@en"],
   :skos/scopeNote
   [#rdf/langString
     "La range di questa proprietà è volutamente generico, con lo scopo di consentire diversi livelli di precisione temporale per specificare la fine di un periodo. Ad esempio, può essere espresso con una data (xsd:date), una data e un'ora (xsd:dateTime), o un anno (xsd:gYear).@it"
    #rdf/langString
     "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé úrovně časového rozlišení pro specifikaci konce doby trvání. Ten může být kupříkladu vyjádřen datumem (xsd:date), datumem a časem (xsd:dateTime) či rokem (xsd:gYear).@cs"
    #rdf/langString
     "Rækkeviden for denne egenskab er bevidst generisk defineret med det formål at tillade forskellige niveauer af tidslig præcision ifm. angivelse af slutdatoen for en periode. Den kan eksempelvis udtrykkes som en dato (xsd:date), en dato og et tidspunkt (xsd:dateTime), eller et årstal (xsd:gYear).@da"
    #rdf/langString
     "El rango de esta propiedad es intencionalmente genérico con el propósito de permitir distintos niveles de precisión temporal para especificar el fin del período. Por ejemplo, puede expresarse como una fecha (xsd:date), una fecha y un tiempo (xsd:dateTime), o un año (xsd:gYear).@es"
    #rdf/langString
     "The range of this property is intentionally generic, with the purpose of allowing different level of temporal precision for specifying the end of a period. E.g., it can be expressed with a date (xsd:date), a date and time (xsd:dateTime), or a year (xsd:gYear).@en"]})

(def endpointDescription
  {:db/ident :dcat/endpointDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#rdf/langString
     "En beskrivelse af det pågældende tjenesteendpoint, inklusiv dets operationer, parametre etc.@da"
    #rdf/langString
     "Una descripción del end-point del servicio, incluyendo sus operaciones, parámetros, etc.@es"
    #rdf/langString
     "Una descrizione dell'endpoint del servizio, incluse le sue operazioni, parametri, ecc.@it"
    #rdf/langString
     "A description of the service end-point, including its operations, parameters etc.@en"
    #rdf/langString
     "Popis přístupového bodu služby včetně operací, parametrů apod.@cs"],
   :rdfs/domain :dcat/DataService,
   :rdfs/label [#rdf/langString "endpointbeskrivelse@da"
                #rdf/langString "descripción del end-point del servicio@es"
                #rdf/langString "description of service end-point@en"
                #rdf/langString "popis přístupového bodu služby@cs"
                #rdf/langString "descrizione dell'endpoint del servizio@it"],
   :skos/changeNote [#rdf/langString "Nuova proprietà in DCAT 2.0.@it"
                     #rdf/langString "Nueva propiedad agregada en DCAT 2.0.@en"
                     #rdf/langString "Ny egenskab i DCAT 2.0.@da"
                     #rdf/langString "New property in DCAT 2.0.@en"
                     #rdf/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"],
   :skos/definition
   [#rdf/langString
     "A description of the service end-point, including its operations, parameters etc.@en"
    #rdf/langString
     "Una descrizione dell'endpoint del servizio, incluse le sue operazioni, parametri, ecc.@it"
    #rdf/langString
     "En beskrivelse af det pågældende tjenesteendpoint, inklusiv dets operationer, parametre etc.@da"
    #rdf/langString
     "Una descripción del end-point del servicio, incluyendo sus operaciones, parámetros, etc..@es"
    #rdf/langString
     "Popis přístupového bodu služby včetně operací, parametrů apod.@cs"],
   :skos/scopeNote
   [#rdf/langString
     "Una descrizione dell'endpoint può essere espressa in un formato leggibile dalla macchina, come una descrizione OpenAPI (Swagger), una risposta GetCapabilities OGC, una descrizione del servizio SPARQL, un documento OpenSearch o WSDL, una descrizione API Hydra, o con del testo o qualche altra modalità informale se una rappresentazione formale non è possibile.@it"
    #rdf/langString
     "La descripción del endpoint brinda detalles específicos de la instancia del endpoint, mientras que dct:conformsTo se usa para indicar el estándar general o especificación que implementa el endpoint.@es"
    #rdf/langString
     "Popis přístupového bodu dává specifické detaily jeho konkrétní instance, zatímco dct:conformsTo indikuje obecný standard či specifikaci kterou přístupový bod implementuje.@cs"
    #rdf/langString
     "The endpoint description gives specific details of the actual endpoint instance, while dct:conformsTo is used to indicate the general standard or specification that the endpoint implements.@en"
    #rdf/langString
     "Una descripción del endpoint del servicio puede expresarse en un formato que la máquina puede interpretar, tal como una descripción basada en OpenAPI (Swagger), una respuesta OGC GetCapabilities, una descripción de un servicio SPARQL, un documento OpenSearch o WSDL, una descripción con la Hydra API, o en texto u otro modo informal si la representación formal no es posible.@es"
    #rdf/langString
     "La descrizione dell'endpoint fornisce dettagli specifici dell'istanza dell'endpoint reale, mentre dct:conformsTo viene utilizzato per indicare lo standard o le specifiche implementate dall'endpoint.@it"
    #rdf/langString
     "En beskrivelse af et endpoint kan udtrykkes i et maskinlæsbart format, såsom OpenAPI (Swagger)-beskrivelser, et OGC GetCapabilities svar, en SPARQL tjenestebeskrivelse, en OpenSearch- eller et WSDL-dokument, en Hydra-API-beskrivelse, eller i tekstformat eller i et andet uformelt format, hvis en formel repræsentation ikke er mulig.@da"
    #rdf/langString
     "Popis přístupového bodu může být vyjádřen ve strojově čitelné formě, například jako popis OpenAPI (Swagger), odpověď služby OGC getCapabilities, pomocí slovníku SPARQL Service Description, jako OpenSearch či WSDL document, jako popis API dle slovníku Hydra, a nebo textově nebo jiným neformálním způsobem, pokud není možno použít formální reprezentaci.@cs"
    #rdf/langString
     "An endpoint description may be expressed in a machine-readable form, such as an OpenAPI (Swagger) description, an OGC GetCapabilities response, a SPARQL Service Description, an OpenSearch or WSDL document, a Hydra API description, else in text or some other informal mode if a formal representation is not possible.@en"
    #rdf/langString
     "Endpointbeskrivelsen giver specifikke oplysninger om den konkrete endpointinstans, mens dct:conformsTo anvendes til at indikere den overordnede standard eller specifikation som endpointet er i overensstemmelse med.@da"]})

(def endpointURL
  {:db/ident :dcat/endpointURL,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#rdf/langString
     "La posición raíz o end-point principal del servicio (una IRI web).@es"
    #rdf/langString
     "La locazione principale o l'endpoint primario del servizio (un IRI risolvibile via web).@it"
    #rdf/langString
     "The root location or primary endpoint of the service (a web-resolvable IRI).@en"
    #rdf/langString
     "Kořenové umístění nebo hlavní přístupový bod služby (IRI přístupné přes Web).@cs"
    #rdf/langString
     "Rodplaceringen eller det primære endpoint for en tjeneste (en web-resolverbar IRI).@da"],
   :rdfs/domain :dcat/DataService,
   :rdfs/label [#rdf/langString "end-point del servizio@it"
                #rdf/langString "service end-point@en"
                #rdf/langString "end-point del servicio@es"
                #rdf/langString "přístupový bod služby@cs"
                #rdf/langString "tjenesteendpoint@da"],
   :rdfs/range :rdfs/Resource,
   :skos/changeNote [#rdf/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #rdf/langString "Nuova proprietà in DCAT 2.0.@it"
                     #rdf/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #rdf/langString "New property in DCAT 2.0.@en"],
   :skos/definition
   [#rdf/langString
     "Rodplaceringen eller det primære endpoint for en tjeneste (en web-resolverbar IRI).@da"
    #rdf/langString
     "The root location or primary endpoint of the service (a web-resolvable IRI).@en"
    #rdf/langString
     "La locazione principale o l'endpoint primario del servizio (un IRI risolvibile via web).@it"
    #rdf/langString
     "Kořenové umístění nebo hlavní přístupový bod služby (IRI přístupné přes Web).@cs"
    #rdf/langString
     "La posición raíz o end-point principal del servicio (una IRI web).@es"]})

(def hadRole
  {:db/ident :dcat/hadRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#rdf/langString
     "La función de una entidad o agente con respecto a otra entidad o recurso.@es"
    #rdf/langString
     "La funzione di un'entità o un agente rispetto ad un'altra entità o risorsa.@it"
    #rdf/langString
     "Den funktion en entitet eller aktør har i forhold til en anden ressource.@da"
    #rdf/langString
     "Funkce entity či agenta ve vztahu k jiné entitě či zdroji.@cs"
    #rdf/langString
     "The function of an entity or agent with respect to another entity or resource.@en"],
   :rdfs/domain {:owl/unionOf [:prov/Attribution :dcat/Relationship],
                 :rdf/type    :owl/Class},
   :rdfs/label [#rdf/langString "tiene rol@it"
                #rdf/langString "sehraná role@cs"
                #rdf/langString "hadRole@en"
                #rdf/langString "havde rolle@da"
                #rdf/langString "haRuolo@it"],
   :rdfs/range :dcat/Role,
   :skos/changeNote [#rdf/langString "New property added in DCAT 2.0.@en"
                     #rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #rdf/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #rdf/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"],
   :skos/definition
   [#rdf/langString
     "Den funktion en entitet eller aktør har i forhold til en anden ressource.@da"
    #rdf/langString
     "La funzione di un'entità o un agente rispetto ad un'altra entità o risorsa.@it"
    #rdf/langString
     "The function of an entity or agent with respect to another entity or resource.@en"
    #rdf/langString
     "La función de una entidad o agente con respecto a otra entidad o recurso.@es"
    #rdf/langString
     "Funkce entity či agenta ve vztahu k jiné entitě či zdroji.@cs"],
   :skos/editorialNote
   [#rdf/langString
     "Přidáno do DCAT pro doplnění vlastnosti prov:hadRole (jejíž užití je omezeno na role v kontextu aktivity, s definičním oborem prov:Association).@cs"
    #rdf/langString
     "Introduceret i DCAT for at supplere prov:hadRole (hvis anvendelse er begrænset til roller i forbindelse med en aktivitet med domænet prov:Association).@da"
    #rdf/langString
     "Introduced into DCAT to complement prov:hadRole (whose use is limited to roles in the context of an activity, with the domain of prov:Association.@en"
    #rdf/langString
     "Introdotta in DCAT per completare prov:hadRole (il cui uso è limitato ai ruoli nel contesto di un'attività, con il dominio di prov:Association.@it"
    #rdf/langString
     "Agregada en DCAT para complementar prov:hadRole (cuyo uso está limitado a roles en el contexto de una actividad, con dominio prov:Association.@es"],
   :skos/scopeNote
   [#rdf/langString
     "Può essere utilizzata in una relazione qualificata per specificare il ruolo di un'entità rispetto a un'altra entità. Si raccomanda che il valore sia preso da un vocabolario controllato di ruoli di entità come ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, o MARC relators https://id.loc.gov/vocabulary/relators.@it"
    #rdf/langString
     "Může být použito v kvalifikovaném vztahu pro specifikaci role Entity ve vztahu k jiné Entitě. Je doporučeno použít hodnotu z řízeného slovníku rolí entit, jako například ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, MARC relators https://id.loc.gov/vocabulary/relators.@cs"
    #rdf/langString
     "May be used in a qualified-relation to specify the role of an Entity with respect to another Entity.  It is recommended that the value be taken from a controlled vocabulary of entity roles such as: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation; DataCite metadata schema; MARC relators https://id.loc.gov/vocabulary/relators.@en"
    #rdf/langString
     "May be used in a qualified-attribution to specify the role of an Agent with respect to an Entity. It is recommended that the value be taken from a controlled vocabulary of agent roles, such as http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@en"
    #rdf/langString
     "Může být použito v kvalifikovaném přiřazení pro specifikaci role Agenta ve vztahu k Entitě. Je doporučeno hodnotu vybrat z řízeného slovníku rolí agentů, jako například http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@cs"
    #rdf/langString
     "Può essere utilizzato in un'attribuzione qualificata per specificare il ruolo di un agente rispetto a un'entità. Si raccomanda che il valore sia preso da un vocabolario controllato di ruoli di agente, come ad esempio http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@it"
    #rdf/langString
     "Puede usarse en una atribución cualificada para especificar el rol de un Agente con respecto a una Entidad. Se recomienda que el valor sea de un vocabulario controlado de roles de agentes, como por ejemplo http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@es"
    #rdf/langString
     "Kan vendes ved kvalificerede krediteringer til at angive en aktørs rolle i forhold en entitet. Det anbefales at værdierne styres som et kontrolleret udfaldsrum med aktørroller, såsom http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@da"
    #rdf/langString
     "Puede usarse en una atribución cualificada para especificar el rol de una Entidad con respecto a otra Entidad. Se recomienda que su valor se tome de un vocabulario controlado de roles de entidades como por ejemplo: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation; esquema de metadatos de DataCite; MARC relators https://id.loc.gov/vocabulary/relators.@es"]})

(def keyword
  {:db/ident :dcat/keyword,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   [#rdf/langString
     "Una parola chiave o un'etichetta per descrivere la risorsa.@it"
    #rdf/langString "Et nøgleord eller tag til beskrivelse af en ressource.@da"
    #rdf/langString
     "Μία λέξη-κλειδί ή μία ετικέτα που περιγράφει το σύνολο δεδομένων.@el"
    #rdf/langString "Un mot-clé ou étiquette décrivant une ressource.@fr"
    #rdf/langString "Una palabra clave o etiqueta que describe un recurso.@es"
    #rdf/langString "Klíčové slovo nebo značka popisující zdroj.@cs"
    #rdf/langString "A keyword or tag describing a resource.@en"
    #rdf/langString "データセットを記述しているキーワードまたはタグ。@ja"
    #rdf/langString "كلمة  مفتاحيه توصف قائمة البيانات@ar"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "كلمة  مفتاحية @ar"
                #rdf/langString "mot-clés @fr"
                #rdf/langString "λέξη-κλειδί@el"
                #rdf/langString "キーワード/タグ@ja"
                #rdf/langString "nøgleord@da"
                #rdf/langString "palabra clave@es"
                #rdf/langString "keyword@en"
                #rdf/langString "parola chiave@it"
                #rdf/langString "klíčové slovo@cs"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/subject,
   :skos/definition
   [#rdf/langString "Klíčové slovo nebo značka popisující zdroj.@cs"
    #rdf/langString "データセットを記述しているキーワードまたはタグ。@ja"
    #rdf/langString "Un mot-clé ou étiquette décrivant une ressource.@fr"
    #rdf/langString "A keyword or tag describing a resource.@en"
    #rdf/langString "Una palabra clave o etiqueta que describe un recurso.@es"
    #rdf/langString "Et nøgleord eller tag til beskrivelse af en ressource.@da"
    #rdf/langString "كلمة  مفتاحيه توصف قائمة البيانات@ar"
    #rdf/langString
     "Μία λέξη-κλειδί ή μία ετικέτα που περιγράφει το σύνολο δεδομένων.@el"
    #rdf/langString
     "Una parola chiave o un'etichetta per descrivere la risorsa.@it"]})

(def landingPage
  {:db/ident :dcat/landingPage,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#rdf/langString
     "Una página web que puede ser visitada en un explorador Web para tener acceso el catálogo, un conjunto de datos, sus distribuciones y/o información adicional.@es"
    #rdf/langString
     "A Web page that can be navigated to in a Web browser to gain access to the catalog, a dataset, its distributions and/or additional information.@en"
    #rdf/langString
     "Μία ιστοσελίδα πλοηγίσιμη μέσω ενός φυλλομετρητή (Web browser) που δίνει πρόσβαση στο σύνολο δεδομένων, τις διανομές αυτού ή/και επιπρόσθετες πληροφορίες.@el"
    #rdf/langString
     "Una pagina web che può essere navigata per ottenere l'accesso al catalogo, ad un dataset, alle distribuzioni del dataset e/o ad informazioni addizionali.@it"
    #rdf/langString
     "データセット、その配信および（または）追加情報にアクセスするためにウエブ・ブラウザでナビゲートできるウェブページ。@ja"
    #rdf/langString
     "صفحة وب يمكن من خلالها الوصول الى قائمة البيانات أو إلى معلومات إضافية متعلقة بها @ar"
    #rdf/langString
     "En webside som der kan navigeres til i en webbrowser for at få adgang til kataloget, et datasæt, dets distributioner og/eller yderligere information.@da"
    #rdf/langString
     "Webová stránka, na kterou lze pro získání přístupu ke katalogu, datové sadě, jejím distribucím a/nebo dalším informacím přistoupit webovým prohlížečem.@cs"
    #rdf/langString
     "Une page Web accessible par un navigateur Web donnant accès au catalogue, un jeu de données, ses distributions et/ou des informations additionnelles.@fr"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "página de destino@es"
                #rdf/langString "landing page@en"
                #rdf/langString "vstupní stránka@cs"
                #rdf/langString "destinationsside@da"
                #rdf/langString "ランディング・ページ@ja"
                #rdf/langString "page d'atterrissage@fr"
                #rdf/langString "صفحة وصول@ar"
                #rdf/langString "pagina di destinazione@it"
                #rdf/langString "ιστοσελίδα αρχικής πρόσβασης@el"],
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/page,
   :skos/definition
   [#rdf/langString
     "Una pagina web che può essere navigata per ottenere l'accesso al catalogo, ad un dataset, alle distribuzioni del dataset e/o ad informazioni addizionali.@it"
    #rdf/langString
     "A Web page that can be navigated to in a Web browser to gain access to the catalog, a dataset, its distributions and/or additional information.@en"
    #rdf/langString
     "Una página web que puede ser visitada en un explorador Web para tener acceso el catálogo, un conjunto de datos, sus distribuciones y/o información adicional.@es"
    #rdf/langString
     "صفحة وب يمكن من خلالها الوصول الى قائمة البيانات أو إلى معلومات إضافية متعلقة بها @ar"
    #rdf/langString
     "En webside som en webbrowser kan navigeres til for at få adgang til kataloget, et datasæt, dets distritbutioner og/eller yderligere information.@da"
    #rdf/langString
     "Webová stránka, na kterou lze pro získání přístupu ke katalogu, datové sadě, jejím distribucím a/nebo dalším informacím přistoupit webovým prohlížečem.@cs"
    #rdf/langString
     "Μία ιστοσελίδα πλοηγίσιμη μέσω ενός φυλλομετρητή (Web browser) που δίνει πρόσβαση στο σύνολο δεδομένων, τις διανομές αυτού ή/και επιπρόσθετες πληροφορίες.@el"
    #rdf/langString
     "Une page Web accessible par un navigateur Web donnant accès au catalogue, un jeu de données, ses distributions et/ou des informations additionnelles.@fr"
    #rdf/langString
     "データセット、その配信および（または）追加情報にアクセスするためにウエブ・ブラウザでナビゲートできるウェブページ。@ja"],
   :skos/scopeNote
   [#rdf/langString
     "Hvis en eller flere distributioner kun er tilgængelige via en destinationsside (dvs. en URL til direkte download er ikke kendt), så bør destinationssidelinket gentages som adgangsadresse for en distribution.@da"
    #rdf/langString
     "Si la distribución es accesible solamente través de una página de aterrizaje (i.e., no se conoce una URL de descarga directa), entonces el enlance a la página de aterrizaje debe ser duplicado como accessURL sobre la distribución.@es"
    #rdf/langString
     "ランディング・ページを通じてしか配信にアクセスできない場合（つまり、直接的なダウンロードURLが不明）には、配信におけるaccessURLとしてランディング・ページのリンクをコピーすべきです（SHOULD）。@ja"
    #rdf/langString
     "If the distribution(s) are accessible only through a landing page (i.e. direct download URLs are not known), then the landing page link should be duplicated as accessURL on a distribution.@en"
    #rdf/langString
     "Αν η/οι διανομή/ές είναι προσβάσιμη/ες μόνο μέσω μίας ιστοσελίδας αρχικής πρόσβασης (δηλαδή αν δεν υπάρχουν γνωστές διευθύνσεις άμεσης μεταφόρτωσης), τότε ο σύνδεσμος της ιστοσελίδας αρχικής πρόσβασης πρέπει να αναπαραχθεί ως accessURL σε μία διανομή.@el"
    #rdf/langString
     "Pokud je distribuce dostupná pouze přes vstupní stránku, t.j. přímý URL odkaz ke stažení není znám, URL přístupové stránky by mělo být duplikováno ve vlastnosti distribuce accessURL.@cs"
    #rdf/langString
     "Se la distribuzione è accessibile solo attraverso una pagina di destinazione (cioè, un URL di download diretto non è noto), il link alla pagina di destinazione deve essere duplicato come accessURL sulla distribuzione.@it"
    #rdf/langString
     "Si la distribution est seulement accessible à travers une page d'atterrissage (exple. pas de connaissance d'URLS de téléchargement direct ), alors le lien de la page d'atterrissage doit être dupliqué comme accessURL sur la distribution.@fr"]})

(def mediaType
  {:db/ident :dcat/mediaType,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#rdf/langString
     "Il tipo di media della distribuzione come definito da IANA@it"
    #rdf/langString
     "このプロパティーは、配信のメディア・タイプがIANAで定義されているときに使用すべきで（SHOULD）、そうでない場合には、dct:formatを様々な値と共に使用できます（MAY）。@ja"
    #rdf/langString
     "Η ιδιότητα αυτή ΘΑ ΠΡΕΠΕΙ να χρησιμοποιείται όταν ο τύπος μέσου μίας διανομής είναι ορισμένος στο IANA, αλλιώς η ιδιότητα dct:format ΔΥΝΑΤΑΙ να χρησιμοποιηθεί με διαφορετικές τιμές.@el"
    #rdf/langString
     "Cette propriété doit être utilisée quand c'est définit le type de média de la distribution en IANA, sinon dct:format DOIT être utilisé avec différentes valeurs.@fr"
    #rdf/langString "The media type of the distribution as defined by IANA@en"
    #rdf/langString "يجب استخدام هذه الخاصية إذا كان نوع الملف معرف ضمن IANA@ar"
    #rdf/langString
     "Medietypen for distributionen som den er defineret af IANA.@da"
    #rdf/langString "Typ média distribuce definovaný v IANA.@cs"
    #rdf/langString
     "Esta propiedad debe ser usada cuando está definido el tipo de media de la distribución en IANA, de otra manera dct:format puede ser utilizado con diferentes valores@es"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "tipo de media@es"
                #rdf/langString "media type@en"
                #rdf/langString "نوع الميديا@ar"
                #rdf/langString "typ média@cs"
                #rdf/langString "メディア・タイプ@ja"
                #rdf/langString "type de média@fr"
                #rdf/langString "τύπος μέσου@el"
                #rdf/langString "medietype@da"
                #rdf/langString "tipo di media@it"],
   :rdfs/range :dcterms/MediaType,
   :rdfs/subPropertyOf :dcterms/format,
   :skos/changeNote
   [#rdf/langString
     "Obor hodnot dcat:mediaType byl zúžen v této revizi DCAT.@cs"
    #rdf/langString
     "Il range di dcat:mediaType è stato ristretto  come parte della revisione di DCAT.@it"
    #rdf/langString
     "The range of dcat:mediaType has been tightened as part of the revision of DCAT.@en"],
   :skos/definition
   [#rdf/langString "يجب استخدام هذه الخاصية إذا كان نوع الملف معرف ضمن IANA@ar"
    #rdf/langString
     "Η ιδιότητα αυτή ΘΑ ΠΡΕΠΕΙ να χρησιμοποιείται όταν ο τύπος μέσου μίας διανομής είναι ορισμένος στο IANA, αλλιώς η ιδιότητα dct:format ΔΥΝΑΤΑΙ να χρησιμοποιηθεί με διαφορετικές τιμές.@el"
    #rdf/langString
     "Cette propriété doit être utilisée quand c'est définit le type de média de la distribution en IANA, sinon dct:format DOIT être utilisé avec différentes valeurs.@fr"
    #rdf/langString
     "Esta propiedad debe ser usada cuando está definido el tipo de media de la distribución en IANA, de otra manera dct:format puede ser utilizado con diferentes valores.@es"
    #rdf/langString
     "Il tipo di media della distribuzione come definito da IANA.@it"
    #rdf/langString "The media type of the distribution as defined by IANA.@en"
    #rdf/langString
     "このプロパティーは、配信のメディア・タイプがIANAで定義されているときに使用すべきで（SHOULD）、そうでない場合には、dct:formatを様々な値と共に使用できます（MAY）。@ja"
    #rdf/langString "Typ média distribuce definovaný v IANA.@cs"
    #rdf/langString
     "Medietypen for distributionen som den er defineret af IANA.@da"],
   :skos/editorialNote
   #rdf/langString
    "Status: English Definition text modified by DCAT revision team, Italian and Czech translation provided, other translations pending. Note some inconsistency on def vs. usage.@en",
   :skos/scopeNote
   [#rdf/langString
     "Questa proprietà DEVE essere usata quando il tipo di media della distribuzione è definito nel registro dei tipi di media IANA https://www.iana.org/assignments/media-types/, altrimenti dct:format PUO 'essere usato con differenti valori.@it"
    #rdf/langString
     "Tato vlastnost BY MĚLA být použita, je-li typ média distribuce definován v registru IANA https://www.iana.org/assignments/media-types/. V ostatních případech MŮŽE být použita vlastnost dct:format s jinými hodnotami.@cs"
    #rdf/langString
     "Esta propiedad DEBERÍA usarse cuando el 'media type' de la distribución está definido en el registro IANA de 'media types' https://www.iana.org/assignments/media-types/, de lo contrario, dct:format PUEDE usarse con distintos valores.@es"
    #rdf/langString
     "This property SHOULD be used when the media type of the distribution is defined in the IANA media types registry https://www.iana.org/assignments/media-types/, otherwise dct:format MAY be used with different values.@en"
    #rdf/langString
     "Denne egenskab BØR anvendes hvis distributionens medietype optræder i 'IANA media types registry' https://www.iana.org/assignments/media-types/, ellers KAN egenskaben dct:format anvendes med et andet udfaldsrum.@da"]})

(def packageFormat
  {:db/ident :dcat/packageFormat,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#rdf/langString
     "The package format of the distribution in which one or more data files are grouped together, e.g. to enable a set of related files to be downloaded together.@en"
    #rdf/langString
     "Balíčkový formát souboru, ve kterém je jeden či více souborů seskupeno dohromady, např. aby bylo možné stáhnout sadu souvisejících souborů naráz.@cs"
    #rdf/langString
     "Il formato di impacchettamento della distribuzione in cui uno o più file di dati sono raggruppati insieme, ad es. per abilitare un insieme di file correlati da scaricare insieme.@it"
    #rdf/langString
     "El formato del archivo en que se agrupan uno o más archivos de datos, e.g. para permitir que un conjunto de archivos relacionados se bajen juntos.@es"
    #rdf/langString
     "Format til pakning af data med henblik på distribution af en eller flere relaterede datafiler der samles til en enhed med henblik på samlet distribution. @da"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/TR/vocab-dcat-2/"},
   :rdfs/label [#rdf/langString "formát balíčku@cs"
                #rdf/langString "packaging format@en"
                #rdf/langString "formato di impacchettamento@it"
                #rdf/langString "pakkeformat@da"
                #rdf/langString "formato de empaquetado@es"],
   :rdfs/range :dcterms/MediaType,
   :rdfs/subPropertyOf :dcterms/format,
   :skos/changeNote
   [#rdf/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
    #rdf/langString "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
    #rdf/langString "New property added in DCAT 2.0.@en"
    #rdf/langString "Nueva propiedad agregada en DCAT 2.0.@es"
    #rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"],
   :skos/definition
   [#rdf/langString
     "Il formato di impacchettamento della distribuzione in cui uno o più file di dati sono raggruppati insieme, ad es. per abilitare un insieme di file correlati da scaricare insieme.@it"
    #rdf/langString
     "The package format of the distribution in which one or more data files are grouped together, e.g. to enable a set of related files to be downloaded together.@en"
    #rdf/langString
     "El formato del archivo en que se agrupan uno o más archivos de datos, e.g. para permitir que un conjunto de archivos relacionados se bajen juntos.@es"
    #rdf/langString
     "Balíčkový formát souboru, ve kterém je jeden či více souborů seskupeno dohromady, např. aby bylo možné stáhnout sadu souvisejících souborů naráz.@cs"],
   :skos/scopeNote
   [#rdf/langString
     "Questa proprietà deve essere utilizzata quando i file nella distribuzione sono impacchettati, ad esempio in un file TAR, Frictionless Data Package o Bagit. Il formato DOVREBBE essere espresso utilizzando un tipo di supporto come definito dal registro dei tipi di media IANA https://www.iana.org/assignments/media-types/, se disponibili.@it"
    #rdf/langString
     "Esta propiedad se debe usar cuando los archivos de la distribución están empaquetados, por ejemplo en un archivo TAR, Frictionless Data Package o Bagit. El formato DEBERÍA expresarse usando un 'media type', tales como los definidos en el registro IANA de 'media types' https://www.iana.org/assignments/media-types/, si está disponibles.@es"
    #rdf/langString
     "Denne egenskab kan anvendes hvis filerne i en distribution er pakket, fx i en TAR-fil, en Frictionless Data Package eller en Bagit-fil. Formatet BØR udtrykkes ved en medietype som defineret i 'IANA media types registry', hvis der optræder en relevant medietype dér: https://www.iana.org/assignments/media-types/.@da"
    #rdf/langString
     "This property to be used when the files in the distribution are packaged, e.g. in a TAR file, a Frictionless Data Package or a Bagit file. The format SHOULD be expressed using a media type as defined by IANA media types registry https://www.iana.org/assignments/media-types/, if available.@en"
    #rdf/langString
     "Tato vlastnost se použije, když jsou soubory v distribuci zabaleny, např. v souboru TAR, v balíčku Frictionless Data Package nebo v souboru Bagit. Formát BY MĚL být vyjádřen pomocí typu média definovaného v registru IANA https://www.iana.org/assignments/media-types/, pokud existuje.@cs"]})

(def qualifiedRelation
  {:db/ident :dcat/qualifiedRelation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#rdf/langString "Odkaz na popis vztahu s jiným zdrojem.@cs"
    #rdf/langString
     "Link a una descrizione di una relazione con un'altra risorsa.@it"
    #rdf/langString
     "Link to a description of a relationship with another resource.@en"
    #rdf/langString
     "Enlace a una descripción de la relación con otro recurso.@es"
    #rdf/langString
     "Reference til en beskrivelse af en relation til en anden ressource.@da"],
   :rdfs/domain :dcat/Resource,
   :rdfs/label [#rdf/langString "qualified relation@en"
                #rdf/langString "relazione qualificata@it"
                #rdf/langString "Kvalificeret relation@da"
                #rdf/langString "relación calificada@es"
                #rdf/langString "kvalifikovaný vztah@cs"],
   :rdfs/range :dcat/Relationship,
   :skos/changeNote [#rdf/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #rdf/langString "New property added in DCAT 2.0.@en"
                     #rdf/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
                     #rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #rdf/langString "Propiedad nueva añadida en DCAT 2.0.@es"],
   :skos/definition
   [#rdf/langString "Odkaz na popis vztahu s jiným zdrojem.@cs"
    #rdf/langString
     "Reference til en beskrivelse af en relation til en anden ressource.@da"
    #rdf/langString
     "Link a una descrizione di una relazione con un'altra risorsa.@it"
    #rdf/langString
     "Enlace a una descripción de la relación con otro recurso.@es"
    #rdf/langString
     "Link to a description of a relationship with another resource.@en"],
   :skos/editorialNote
   [#rdf/langString
     "Introduced into DCAT to complement the other PROV qualified relations. @en"
    #rdf/langString
     "Přidáno do DCAT k doplnění jiných kvalifikovaných vztahů ze slovníku PROV.@cs"
    #rdf/langString
     "Se incluyó en DCAT para complementar las relaciones calificadas disponibles en PROV.@es"
    #rdf/langString
     "Introdotta in DCAT per integrare le altre relazioni qualificate di PROV.@it"
    #rdf/langString
     "Introduceret i DCAT med henblik på at supplere de øvrige kvalificerede relationer fra PROV. @da"],
   :skos/scopeNote
   [#rdf/langString
     "Used to link to another resource where the nature of the relationship is known but does not match one of the standard Dublin Core properties (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@en"
    #rdf/langString
     "Anvendes til at referere til en anden ressource hvor relationens betydning er kendt men ikke matcher en af de standardiserede egenskaber fra Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) eller PROV-O-egenskaber (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@da"
    #rdf/langString
     "Viene utilizzato per associarsi a un'altra risorsa nei casi per i quali la natura della relazione è nota ma non è alcuna delle proprietà fornite dallo standard Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat , dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:require, dct:isRequiredBy) o dalle proprietà fornite da PROV-O (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom , prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@it"
    #rdf/langString
     "Použito pro odkazování na jiný zdroj, kde druh vztahu je znám, ale neodpovídá standardním vlastnostem ze slovníku Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) či slovníku PROV-O (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@cs"
    #rdf/langString
     "Se usa para asociar con otro recurso para el cuál la naturaleza de la relación es conocida pero no es ninguna de las propiedades que provee el estándar Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@es"]})

(def record
  "har post"
  {:db/ident :dcat/record,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#rdf/langString "Συνδέει έναν κατάλογο με τις καταγραφές του.@el"
    #rdf/langString
     "Un record che descrive la registrazione di un singolo set di dati o di un servizio dati che fa parte del catalogo.@it"
    #rdf/langString "Relie un catalogue à ses registres.@fr"
    #rdf/langString "Propojuje katalog a jeho záznamy.@cs"
    #rdf/langString
     "Describe la registración de un conjunto de datos o un servicio de datos en el catálogo.@es"
    #rdf/langString
     "Záznam popisující registraci jedné datové sady či datové služby jakožto součásti katalogu.@cs"
    #rdf/langString "تربط الفهرس بسجل ضمنه@ar"
    #rdf/langString
     "En post der beskriver registreringen af et enkelt datasæt eller en datatjeneste som er opført i kataloget.@da"
    #rdf/langString
     "A record describing the registration of a single dataset or data service that is part of the catalog.@en"
    #rdf/langString "カタログの一部であるカタログ・レコード。@ja"],
   :rdfs/domain :dcat/Catalog,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "カタログ・レコード@ja"
                #rdf/langString "سجل@ar"
                #rdf/langString "registre@fr"
                #rdf/langString "záznam@cs"
                #rdf/langString "record@it"
                #rdf/langString "record@en"
                #rdf/langString "registro@es"
                #rdf/langString "καταγραφή@el"
                #rdf/langString "post@da"],
   :rdfs/range :dcat/CatalogRecord,
   :skos/altLabel #rdf/langString "har post@da",
   :skos/definition
   [#rdf/langString "Propojuje katalog a jeho záznamy.@cs"
    #rdf/langString "Relie un catalogue à ses registres.@fr"
    #rdf/langString
     "Záznam popisující registraci jedné datové sady či datové služby jakožto součásti katalogu.@cs"
    #rdf/langString
     "En post der beskriver registreringen af et enkelt datasæt eller en datatjeneste som er opført i kataloget.@da"
    #rdf/langString
     "Un record che descrive la registrazione di un singolo set di dati o di un servizio dati che fa parte del catalogo.@it"
    #rdf/langString "Συνδέει έναν κατάλογο με τις καταγραφές του.@el"
    #rdf/langString "カタログの一部であるカタログ・レコード。@ja"
    #rdf/langString
     "Describe la registración de un conjunto de datos o un servicio de datos en el catálogo.@es"
    #rdf/langString "تربط الفهرس بسجل ضمنه@ar"
    #rdf/langString
     "A record describing the registration of a single dataset or data service that is part of the catalog.@en"],
   :skos/editorialNote
   #rdf/langString
    "Status: English, Italian, Spanish and Czech Definitions modified by DCAT revision team, other translations pending.@en"})

(def servesDataset
  {:db/ident :dcat/servesDataset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#rdf/langString
     "Una colección de datos que este Servicio de Datos puede distribuir.@es"
    #rdf/langString
     "En samling af data som denne datatjeneste kan distribuere.@da"
    #rdf/langString
     "Una raccolta di dati che questo DataService può distribuire.@it"
    #rdf/langString
     "Kolekce dat, kterou je tato Datová služba schopna poskytnout.@cs"
    #rdf/langString
     "A collection of data that this DataService can distribute.@en"],
   :rdfs/domain :dcat/DataService,
   :rdfs/label [#rdf/langString "datatjeneste for datasæt@da"
                #rdf/langString "serve set di dati@it"
                #rdf/langString "poskytuje datovou sadu@cs"
                #rdf/langString "serves dataset@en"
                #rdf/langString "provee conjunto de datos@es"],
   :rdfs/range :dcat/Dataset,
   :skos/altLabel [#rdf/langString "udstiller@da"
                   #rdf/langString "ekspederer@da"
                   #rdf/langString "distribuerer@da"],
   :skos/changeNote
   [#rdf/langString "New property in DCAT 2.0.@en"
    #rdf/langString "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
    #rdf/langString "Nuova proprietà in DCAT 2.0.@it"
    #rdf/langString "Nueva propiedad agregada en DCAT 2.0.@es"],
   :skos/definition
   [#rdf/langString
     "En samling af data som denne datatjeneste kan distribuere.@da"
    #rdf/langString
     "Una raccolta di dati che questo DataService può distribuire.@it"
    #rdf/langString
     "A collection of data that this DataService can distribute.@en"
    #rdf/langString
     "Una colección de datos que este Servicio de Datos puede distribuir.@es"
    #rdf/langString
     "Kolekce dat, kterou je tato Datová služba schopna poskytnout.@cs"]})

(def service
  "har datatjeneste"
  {:db/ident :dcat/service,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#rdf/langString "Umístění či přístupový bod registrovaný v katalogu.@cs"
    #rdf/langString "A site or endpoint that is listed in the catalog.@en"
    #rdf/langString "Un sito o endpoint elencato nel catalogo.@it"
    #rdf/langString "Et websted eller et endpoint som er opført i kataloget.@da"
    #rdf/langString
     "Un sitio o 'endpoint' que está listado en el catálogo.@es"],
   :rdfs/domain :dcat/Catalog,
   :rdfs/label [#rdf/langString "service@en"
                #rdf/langString "datatjeneste@da"
                #rdf/langString "servicio@es"
                #rdf/langString "servizio@it"
                #rdf/langString "služba@cs"],
   :rdfs/range :dcat/DataService,
   :rdfs/subPropertyOf [:dcterms/hasPart :rdfs/member],
   :skos/altLabel #rdf/langString "har datatjeneste@da",
   :skos/changeNote [#rdf/langString "Nueva propiedad añadida en DCAT 2.0.@es"
                     #rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #rdf/langString "New property added in DCAT 2.0.@en"
                     #rdf/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"],
   :skos/definition
   [#rdf/langString "Un sitio o 'endpoint' que está listado en el catálogo.@es"
    #rdf/langString "Umístění či přístupový bod registrovaný v katalogu.@cs"
    #rdf/langString "Et websted eller et endpoint som er opført i kataloget.@da"
    #rdf/langString "A site or endpoint that is listed in the catalog.@en"
    #rdf/langString "Un sito o endpoint elencato nel catalogo.@it"]})

(def spatialResolutionInMeters
  {:db/ident :dcat/spatialResolutionInMeters,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#rdf/langString
     "minimum spatial separation resolvable in a dataset, measured in metres.@en-GB"
    #rdf/langString
     "minimum spatial separation resolvable in a dataset, measured in meters.@en-US"
    #rdf/langString
     "mínima separacíon espacial disponible en un conjunto de datos, medida en metros.@es"
    #rdf/langString
     "separazione spaziale minima risolvibile in un set di dati, misurata in metri.@it"
    #rdf/langString
     "mindste geografiske afstand som kan erkendes i et datasæt, målt i meter.@da"
    #rdf/langString
     "minimální prostorový rozestup rozeznatelný v datové sadě, měřeno v metrech.@cs"],
   :rdfs/label [#rdf/langString "resolución espacial (metros)@es"
                #rdf/langString "spatial resolution (metres)@en-GB"
                #rdf/langString "spatial resolution (meters)@en-US"
                #rdf/langString "prostorové rozlišení (metry)@cs"
                #rdf/langString "risoluzione spaziale (metros)@it"
                #rdf/langString "geografisk opløsning (meter)@da"],
   :rdfs/range :xsd/decimal,
   :skos/changeNote [#rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #rdf/langString "Nueva propiedad añadida en DCAT 2.0.@es"
                     #rdf/langString "New property added in DCAT 2.0.@en"
                     #rdf/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #rdf/langString "Ny genskab tilføjet i DCAT 2.0.@da"],
   :skos/definition
   [#rdf/langString
     "minimum spatial separation resolvable in a dataset, measured in meters.@en-US"
    #rdf/langString
     "separazione spaziale minima risolvibile in un set di dati, misurata in metri.@it"
    #rdf/langString
     "minimální prostorový rozestup rozeznatelný v datové sadě, měřeno v metrech.@cs"
    #rdf/langString
     "minimum spatial separation resolvable in a dataset, measured in metres.@en-GB"
    #rdf/langString
     "mínima separacíon espacial disponible en un conjunto de datos, medida en metros.@es"
    #rdf/langString
     "mindste geografiske afstand som kan resolveres i et datasæt, målt i meter.@da"],
   :skos/editorialNote
   [#rdf/langString
     "Může se vyskytnout v popisu Datové sady nebo Distribuce, takže nebyl specifikován definiční obor.@cs"
    #rdf/langString
     "Might appear in the description of a Dataset or a Distribution, so no domain is specified.@en"
    #rdf/langString
     "Kan optræde i forbindelse med beskrivelse af datasættet eller datasætditributionen, så der er ikke angivet et domæne for egenskaben.@da"],
   :skos/scopeNote
   [#rdf/langString
     "Pokud je datová sada obraz či mřížka, měla by tato vlastnost odpovídat rozestupu položek. Pro ostatní druhy prostorových datových sad bude tato vlastnost obvykle indikovat nejmenší vzdálenost mezi položkami této datové sady.@cs"
    #rdf/langString
     "Hvis datasættet udgøres af et billede eller et grid, så bør dette svare til afstanden mellem elementerne. For andre typer af spatiale datasæt, vil denne egenskab typisk indikere den mindste afstand mellem elementerne i datasættet.@da"
    #rdf/langString
     "Různá prostorová rozlišení mohou být poskytována jako různé distribuce datové sady.@cs"
    #rdf/langString
     "Distintas distribuciones de un conjunto de datos pueden tener resoluciones espaciales diferentes.@es"
    #rdf/langString
     "Alternative geografiske opløsninger kan leveres som forskellige datasætdistributioner.@da"
    #rdf/langString
     "Se il set di dati è un'immagine o una griglia, questo dovrebbe corrispondere alla spaziatura degli elementi. Per altri tipi di set di dati spaziali, questa proprietà di solito indica la distanza minima tra gli elementi nel set di dati.@it"
    #rdf/langString
     "Alternative spatial resolutions might be provided as different dataset distributions.@en"
    #rdf/langString
     "Risoluzioni spaziali alternative possono essere fornite come diverse distribuzioni di set di dati.@it"
    #rdf/langString
     "Si el conjunto de datos es una imágen o grilla, esta propiedad corresponde al espaciado de los elementos. Para otro tipo de conjunto de datos espaciales, esta propieda usualmente indica la menor distancia entre los elementos de dichos datos.@es"
    #rdf/langString
     "If the dataset is an image or grid this should correspond to the spacing of items. For other kinds of spatial dataset, this property will usually indicate the smallest distance between items in the dataset.@en"]})

(def startDate
  "starttidspunkt"
  {:db/ident :dcat/startDate,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/domain :dcterms/PeriodOfTime,
   :rdfs/label [#rdf/langString "data di inizio@it"
                #rdf/langString "datum začátku@cs"
                #rdf/langString "start date@en"
                #rdf/langString "startdato@da"],
   :rdfs/range :rdfs/Literal,
   :skos/altLabel #rdf/langString "starttidspunkt@da",
   :skos/changeNote
   [#rdf/langString "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
    #rdf/langString "New property added in DCAT 2.0.@en"
    #rdf/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
    #rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
    #rdf/langString "Nueva propiedad agregada en DCAT 2.0.@es"],
   :skos/definition [#rdf/langString "El comienzo del período@es"
                     #rdf/langString "Začátek doby trvání@cs"
                     #rdf/langString "The start of the period@en"
                     #rdf/langString "Start på perioden.@da"
                     #rdf/langString "L'inizio del periodo@it"],
   :skos/scopeNote
   [#rdf/langString
     "Rækkeviden for denne egenskab er bevidst generisk defineret med det formål at tillade forskellige niveauer af tidslig præcision ifm. angivelse af startdatoen for en periode. Den kan eksempelvis udtrykkes som en dato (xsd:date), en dato og et tidspunkt (xsd:dateTime), eller et årstal (xsd:gYear).@da"
    #rdf/langString
     "The range of this property is intentionally generic, with the purpose of allowing different level of temporal precision for specifying the start of a period. E.g., it can be expressed with a date (xsd:date), a date and time (xsd:dateTime), or a year (xsd:gYear).@en"
    #rdf/langString
     "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé úrovně časového rozlišení pro specifikaci začátku doby trvání. Ten může být kupříkladu vyjádřen datumem (xsd:date), datumem a časem (xsd:dateTime) či rokem (xsd:gYear).@cs"
    #rdf/langString
     "Il range di questa proprietà è volutamente generico, con lo scopo di consentire diversi livelli di precisione temporale per specificare l'inizio di un periodo. Ad esempio, può essere espresso con una data (xsd:date), una data e un'ora (xsd:dateTime), o un anno (xsd:gYear).@it"
    #rdf/langString
     "El rango de esta propiedad es intencionalmente genérico con el propósito de permitir distintos niveles de precisión temporal para especificar el comienzo de un período. Por ejemplo, puede expresarse como una fecha (xsd:date), una fecha y un tiempo (xsd:dateTime), o un año (xsd:gYear).@es"]})

(def temporalResolution
  {:db/ident :dcat/temporalResolution,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#rdf/langString "minimum time period resolvable in a dataset.@en"
    #rdf/langString "minimální doba trvání rozlišitelná v datové sadě.@cs"
    #rdf/langString "período de tiempo mínimo en el conjunto de datos.@es"
    #rdf/langString "mindste tidsperiode der kan resolveres i datasættet.@da"
    #rdf/langString
     "periodo di tempo minimo risolvibile in un set di dati.@it"],
   :rdfs/label [#rdf/langString "resolución temporal@es"
                #rdf/langString "tidslig opløsning@da"
                #rdf/langString "temporal resolution@en"
                #rdf/langString "časové rozlišení@cs"
                #rdf/langString "risoluzione temporale@it"],
   :rdfs/range :xsd/duration,
   :skos/changeNote [#rdf/langString "Nueva propiedad añadida en DCAT 2.0.@es"
                     #rdf/langString "New property added in DCAT 2.0.@en"
                     #rdf/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #rdf/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"],
   :skos/definition
   [#rdf/langString "minimální doba trvání rozlišitelná v datové sadě.@cs"
    #rdf/langString "período de tiempo mínimo en el conjunto de datos.@es"
    #rdf/langString "minimum time period resolvable in a dataset.@en"
    #rdf/langString "periodo di tempo minimo risolvibile in un set di dati.@it"
    #rdf/langString "mindste tidsperiode der kan resolveres i datasættet.@da"],
   :skos/editorialNote
   [#rdf/langString
     "Může se vyskytnout v popisu Datové sady nebo Distribuce, takže nebyl specifikován definiční obor.@cs"
    #rdf/langString
     "Might appear in the description of a Dataset or a Distribution, so no domain is specified.@en"
    #rdf/langString
     "Kan optræde i forbindelse med beskrivelse af datasættet eller datasætditributionen, så der er ikke angivet et domæne for egenskaben.@da"],
   :skos/scopeNote
   [#rdf/langString
     "Alternative temporal resolutions might be provided as different dataset distributions.@en"
    #rdf/langString
     "Různá časová rozlišení mohou být poskytována jako různé distribuce datové sady.@cs"
    #rdf/langString
     "Alternative tidslige opløsninger kan leveres som forskellige datasætdistributioner.@da"
    #rdf/langString
     "Si el conjunto de datos es una serie temporal, debe corresponder al espaciado de los elementos de la serie. Para otro tipo de conjuntos de datos, esta propiedad indicará usualmente la menor diferencia de tiempo entre elementos en el dataset.@es"
    #rdf/langString
     "Pokud je datová sada časovou řadou, měla by tato vlastnost odpovídat rozestupu položek v řadě. Pro ostatní druhy datových sad bude tato vlastnost obvykle indikovat nejmenší časovou vzdálenost mezi položkami této datové sady.@cs"
    #rdf/langString
     "Distintas distribuciones del conjunto de datos pueden tener resoluciones temporales diferentes.@es"
    #rdf/langString
     "If the dataset is a time-series this should correspond to the spacing of items in the series. For other kinds of dataset, this property will usually indicate the smallest time difference between items in the dataset.@en"
    #rdf/langString
     "Se il set di dati è una serie temporale, questo dovrebbe corrispondere alla spaziatura degli elementi della serie. Per altri tipi di set di dati, questa proprietà di solito indica la più piccola differenza di tempo tra gli elementi nel set di dati.@it"
    #rdf/langString
     "Hvis datasættet er en tidsserie, så bør denne egenskab svare til afstanden mellem elementerne i tidsserien. For andre typer af datasæt indikerer denne egenskab den mindste tidsforskel mellem elementer i datasættet.@da"
    #rdf/langString
     "Risoluzioni temporali alternative potrebbero essere fornite come diverse distribuzioni di set di dati.@it"]})

(def theme
  "tema"
  {:db/ident :dcat/theme,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#rdf/langString
     "La categoria principale della risorsa. Una risorsa può avere più temi.@it"
    #rdf/langString "Hlavní téma zdroje. Zdroj může mít více témat.@cs"
    #rdf/langString
     "La categoría principal del recurso. Un recurso puede tener varios temas.@es"
    #rdf/langString
     "A main category of the resource. A resource can have multiple themes.@en"
    #rdf/langString
     "التصنيف الرئيسي لقائمة البيانات. قائمة البيانات يمكن أن تملك أكثر من تصنيف رئيسي واحد.@ar"
    #rdf/langString
     "Et centralt emne for ressourcen. En ressource kan have flere centrale emner.@da"
    #rdf/langString
     "La catégorie principale de la ressource. Une ressource peut avoir plusieurs thèmes.@fr"
    #rdf/langString "データセットの主要カテゴリー。データセットは複数のテーマを持つことができます。@ja"
    #rdf/langString
     "Η κύρια κατηγορία του συνόλου δεδομένων. Ένα σύνολο δεδομένων δύναται να έχει πολλαπλά θέματα.@el"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "emne@da"
                #rdf/langString "Θέμα@el"
                #rdf/langString "theme@en"
                #rdf/langString "tema@es"
                #rdf/langString "tema@it"
                #rdf/langString "テーマ/カテゴリー@ja"
                #rdf/langString "téma@cs"
                #rdf/langString "التصنيف@ar"
                #rdf/langString "thème@fr"],
   :rdfs/range :skos/Concept,
   :rdfs/subPropertyOf :dcterms/subject,
   :skos/altLabel #rdf/langString "tema@da",
   :skos/definition
   [#rdf/langString "Hlavní téma zdroje. Zdroj může mít více témat.@cs"
    #rdf/langString
     "La catégorie principale de la ressource. Une ressource peut avoir plusieurs thèmes.@fr"
    #rdf/langString
     "La categoría principal del recurso. Un recurso puede tener varios temas.@es"
    #rdf/langString
     "Η κύρια κατηγορία του συνόλου δεδομένων. Ένα σύνολο δεδομένων δύναται να έχει πολλαπλά θέματα.@el"
    #rdf/langString
     "La categoria principale della risorsa. Una risorsa può avere più temi.@it"
    #rdf/langString "データセットの主要カテゴリー。データセットは複数のテーマを持つことができます。@ja"
    #rdf/langString
     "A main category of the resource. A resource can have multiple themes.@en"
    #rdf/langString
     "Et centralt emne for ressourcen. En ressource kan have flere centrale emner.@da"
    #rdf/langString
     "التصنيف الرئيسي لقائمة البيانات. قائمة البيانات يمكن أن تملك أكثر من تصنيف رئيسي واحد.@ar"],
   :skos/editorialNote
   #rdf/langString
    "Status: English Definition text modified by DCAT revision team, all except for Italian and Czech translations are pending.@en",
   :skos/scopeNote
   [#rdf/langString
     "El conjunto de skos:Concepts utilizados para categorizar los recursos están organizados en un skos:ConceptScheme que describe todas las categorías y sus relaciones en el catálogo.@es"
    #rdf/langString
     "データセットを分類するために用いられるskos:Conceptの集合は、カタログのすべてのカテゴリーとそれらの関係を記述しているskos:ConceptSchemeで組織化されます。@ja"
    #rdf/langString
     "Sada instancí třídy skos:Concept použitá pro kategorizaci zdrojů je organizována do schématu konceptů skos:ConceptScheme, které popisuje všechny kategorie v katalogu a jejich vztahy.@cs"
    #rdf/langString
     "Il set di concetti skos usati per categorizzare le risorse sono organizzati in skos:ConceptScheme che descrive tutte le categorie e le loro relazioni nel catalogo.@it"
    #rdf/langString
     "Samlingen af begreber (skos:Concept) der anvendes til at emneinddele ressourcer organiseres i et begrebssystem (skos:ConceptScheme) som beskriver alle emnerne og deres relationer i kataloget.@da"
    #rdf/langString
     "Un ensemble de skos:Concepts utilisés pour catégoriser les ressources sont organisés en un skos:ConceptScheme décrivant toutes les catégories et ses relations dans le catalogue.@fr"
    #rdf/langString
     "The set of skos:Concepts used to categorize the resources are organized in a skos:ConceptScheme describing all the categories and their relations in the catalog.@en"
    #rdf/langString
     "Το σετ των skos:Concepts που χρησιμοποιείται για να κατηγοριοποιήσει τα σύνολα δεδομένων είναι οργανωμένο εντός ενός skos:ConceptScheme που περιγράφει όλες τις κατηγορίες και τις σχέσεις αυτών στον κατάλογο.@el"]})

(def themeTaxonomy
  "temataksonomi"
  {:db/ident :dcat/themeTaxonomy,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#rdf/langString
     "Il sistema di organizzazione della conoscenza (KOS) usato per classificare i dataset del catalogo.@it"
    #rdf/langString
     "The knowledge organization system (KOS) used to classify catalog's datasets.@en"
    #rdf/langString
     "Le systhème d'ogranisation de connaissances utilisé pour classifier les jeux de données du catalogue.@fr"
    #rdf/langString
     "El sistema de organización del conocimiento utilizado para clasificar conjuntos de datos de catálogos.@es"
    #rdf/langString
     "Vidensorganiseringssystem (KOS) som anvendes til at klassificere datasæt i kataloget.@da"
    #rdf/langString
     "Systém organizace znalostí (KOS) použitý pro klasifikaci datových sad v katalogu.@cs"
    #rdf/langString
     "カタログのデータセットを分類するために用いられる知識組織化体系（KOS；knowledge organization system）。@ja"
    #rdf/langString
     "لائحة التصنيفات المستخدمه لتصنيف قوائم البيانات ضمن الفهرس@ar"
    #rdf/langString
     "Το σύστημα οργάνωσης γνώσης που χρησιμοποιείται για την κατηγοριοποίηση των συνόλων δεδομένων του καταλόγου.@el"],
   :rdfs/domain :dcat/Catalog,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#rdf/langString "taxonomie de thèmes@fr"
                #rdf/langString "tassonomia dei temi@it"
                #rdf/langString "テーマ@ja"
                #rdf/langString "theme taxonomy@en"
                #rdf/langString "قائمة التصنيفات@ar"
                #rdf/langString "Ταξινομία θεματικών κατηγοριών.@el"
                #rdf/langString "emnetaksonomi@da"
                #rdf/langString "taxonomie témat@cs"
                #rdf/langString "taxonomía de temas@es"],
   :rdfs/range :rdfs/Resource,
   :schema/rangeIncludes [:skos/ConceptScheme :owl/Ontology :skos/Collection],
   :skos/altLabel #rdf/langString "temataksonomi@da",
   :skos/definition
   [#rdf/langString
     "Vidensorganiseringssystem (KOS) som anvendes til at klassificere datasæt i kataloget.@da"
    #rdf/langString
     "لائحة التصنيفات المستخدمه لتصنيف قوائم البيانات ضمن الفهرس@ar"
    #rdf/langString
     "El sistema de organización del conocimiento utilizado para clasificar conjuntos de datos de catálogos.@es"
    #rdf/langString
     "Systém organizace znalostí (KOS) použitý pro klasifikaci datových sad v katalogu.@cs"
    #rdf/langString
     "カタログのデータセットを分類するために用いられる知識組織化体系（KOS；knowledge organization system）。@ja"
    #rdf/langString
     "The knowledge organization system (KOS) used to classify catalog's datasets.@en"
    #rdf/langString
     "Il sistema di organizzazione della conoscenza (KOS) usato per classificare i dataset del catalogo.@it"
    #rdf/langString
     "Το σύστημα οργάνωσης γνώσης που χρησιμοποιείται για την κατηγοριοποίηση των συνόλων δεδομένων του καταλόγου.@el"
    #rdf/langString
     "Le systhème d'ogranisation de connaissances utilisé pour classifier les jeux de données du catalogue.@fr"],
   :skos/scopeNote
   [#rdf/langString
     "Det anbefales at taksonomien organiseres i et skos:ConceptScheme, skos:Collection, owl:Ontology eller lignende, som giver mulighed for at ethvert medlem af taksonomien kan forsynes med en IRI og udgives som linked-data.@da"
    #rdf/langString
     "It is recommended that the taxonomy is organized in a skos:ConceptScheme, skos:Collection, owl:Ontology or similar, which allows each member to be denoted by an IRI and published as linked-data.@en"
    #rdf/langString
     "Je doporučeno, aby byla taxonomie vyjádřena jako skos:ConceptScheme, skos:Collection, owl:Ontology nebo podobné, aby mohla být každá položka identifikována pomocí IRI a publikována jako propojená data.@cs"
    #rdf/langString
     "Se recomienda que la taxonomía se organice como un skos:ConceptScheme, skos:Collection, owl:Ontology o similar, los cuáles permiten que cada miembro se denote con una IRI y se publique como datos enlazados.@es"
    #rdf/langString
     "Si raccomanda che la tassonomia sia organizzata in uno skos:ConceptScheme, skos:Collection, owl:Ontology o simili, che permette ad ogni membro di essere indicato da un IRI e pubblicato come linked-data.@it"]})
