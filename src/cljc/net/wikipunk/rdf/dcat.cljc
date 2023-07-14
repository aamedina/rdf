(ns net.wikipunk.rdf.dcat
  {:dcterms/contributor
   [{:foaf/name #xsd/string "Martin Alvarez-Espinar"}
    {:foaf/homepage      {:rdfa/uri "http://www.w3.org/People/all#phila"},
     :foaf/name          #xsd/string "Phil Archer",
     :rdfs/seeAlso       {:rdfa/uri "http://philarcher.org/foaf.rdf#me"},
     :schema/affiliation {:rdfa/uri "http://www.w3.org/data#W3C"}}
    {:foaf/homepage {:rdfa/uri "http://www.andrea-perego.name/foaf/#me"},
     :foaf/name     #xsd/string "Andrea Perego",
     :rdfs/seeAlso  {:rdfa/uri "https://orcid.org/0000-0001-9300-2694"}}
    {:foaf/homepage
     [{:rdfa/uri "https://w3id.org/people/ralbertoni/"}
      {:rdfa/uri
       "http://www.imati.cnr.it/index.php/people/8-curricula/178-riccardo-albertoni"}],
     :foaf/name #xsd/string "Riccardo Albertoni",
     :rdfs/seeAlso {:rdfa/uri "https://orcid.org/0000-0001-5648-2713"}}
    {:foaf/name #xsd/string "Marios Meimaris"}
    {:foaf/name    #xsd/string "Ghislain Auguste Atemezing",
     :rdfs/seeAlso {:rdfa/uri
                    "http://www.eurecom.fr/~atemezin/gatemezing-foaf.rdf"}}
    {:foaf/homepage {:rdfa/uri "http://www.asahi-net.or.jp/~ax2s-kmtn/"},
     :foaf/name     #xsd/string "Shuji Kamitsuna"}
    {:foaf/name #xsd/string "Richard Cyganiak"}
    {:foaf/homepage      {:rdfa/uri "https://agbeltran.github.io"},
     :foaf/name          #xsd/string "Alejandra Gonzalez-Beltran",
     :rdfs/seeAlso       {:rdfa/uri "https://orcid.org/0000-0003-3499-8262"},
     :schema/affiliation {:foaf/homepage {:rdfa/uri "http://stfc.ac.uk"},
                          :foaf/name
                          #xsd/string
                           "Science and Technology Facilities Council, UK"}}
    {:foaf/name #xsd/string "Vassilios Peristeras",
     :schema/affiliation
     {:foaf/homepage {:rdfa/uri "http://ec.europa.eu/dgs/informatics/"},
      :foaf/name     #xsd/string "European Commission, DG DIGIT"}}
    {:foaf/name #xsd/string "Boris Villazón-Terrazas"}
    {:foaf/homepage {:rdfa/uri "http://makxdekkers.com/"},
     :foaf/name     #xsd/string "Makx Dekkers",
     :rdfs/seeAlso  {:rdfa/uri "http://makxdekkers.com/makxdekkers.rdf#me"}}
    {:foaf/name #xsd/string "Simon J D Cox",
     :foaf/workInfoHomepage {:rdfa/uri "http://people.csiro.au/Simon-Cox"},
     :rdf/type :foaf/Person,
     :rdfs/seeAlso {:rdfa/uri "https://orcid.org/0000-0002-3884-3420"},
     :schema/affiliation
     {:foaf/homepage {:rdfa/uri "https://csiro.au"},
      :foaf/name
      #xsd/string
       "Commonwealth Scientific and Industrial Research Organisation"}}
    {:foaf/name #xsd/string "Rufus Pollock",
     :schema/affiliation {:foaf/homepage {:rdfa/uri "http://okfn.org"},
                          :foaf/name     #xsd/string
                                          "Open Knowledge Foundation"}}
    {:foaf/homepage {:rdfa/uri "https://jakub.klímek.com/"},
     :foaf/name     #xsd/string "Jakub Klímek",
     :rdfs/seeAlso  {:rdfa/uri "https://jakub.klímek.com/#me"}}
    {:foaf/name #xsd/string "David Browning",
     :schema/affiliation {:foaf/homepage {:rdfa/uri "http://www.refinitiv.com"},
                          :foaf/name     #xsd/string "Refinitiv"}}],
   :dcterms/creator [{:foaf/name    #xsd/string "Fadi Maali",
                      :rdfs/seeAlso {:rdfa/uri "http://fadmaa.me/foaf.ttl"}}
                     {:foaf/name #xsd/string "John Erickson"}],
   :dcterms/license {:rdfa/uri "https://creativecommons.org/licenses/by/4.0/"},
   :dcterms/modified [#xsd/date #inst "2013-09-20T00:00:00.000-04:00"
                      #xsd/date #inst "2020-11-30T00:00:00.000-05:00"
                      #xsd/string "2019"
                      #xsd/date #inst "2012-04-24T00:00:00.000-04:00"
                      #xsd/date #inst "2021-09-14T00:00:00.000-04:00"
                      #xsd/date #inst "2013-11-28T00:00:00.000-05:00"
                      #xsd/date #inst "2017-12-19T00:00:00.000-05:00"],
   :foaf/maker {:foaf/homepage {:rdfa/uri "http://www.w3.org/2011/gld/"},
                :foaf/name     #xsd/string "Government Linked Data WG"},
   :owl/imports [{:rdfa/uri "http://www.w3.org/2004/02/skos/core"}
                 {:rdfa/uri "http://www.w3.org/ns/prov-o#"}
                 {:rdfa/uri "http://purl.org/dc/terms/"}],
   :owl/versionInfo
   [#xsd/langString
     "Questa è una copia aggiornata del vocabolario DCAT v2.0 disponibile in https://www.w3.org/ns/dcat.ttl@en"
    #xsd/langString
     "This is an updated copy of v2.0 of the DCAT vocabulary, taken from https://www.w3.org/ns/dcat.ttl@en"
    #xsd/langString
     "Esta es una copia del vocabulario DCAT v2.0 disponible en https://www.w3.org/ns/dcat.ttl@es"
    #xsd/langString
     "Dette er en opdateret kopi af DCAT v. 2.0 som er tilgænglig på https://www.w3.org/ns/dcat.ttl@da"
    #xsd/langString
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
   [#xsd/langString
     "DCAT er et RDF-vokabular som har til formål at understøtte interoperabilitet mellem datakataloger udgivet på nettet. Ved at anvende DCAT til at beskrive datasæt i datakataloger, kan udgivere øge findbarhed og gøre det gøre det lettere for applikationer at anvende metadata fra forskellige kataloger. Derudover understøttes decentraliseret udstilling af kataloger og fødererede datasætsøgninger på tværs af websider. Aggregerede DCAT-metadata kan fungere som fortegnelsesfiler der kan understøtte digital bevaring. DCAT er defineret på http://www.w3.org/TR/vocab-dcat/. Enhver forskel mellem det normative dokument og dette schema er en fejl i dette schema.@da"
    #xsd/langString
     "DCAT est un vocabulaire développé pour faciliter l'interopérabilité entre les jeux de données publiées sur le Web. En utilisant DCAT pour décrire les jeux de données dans les catalogues de données, les fournisseurs de données augmentent leur découverte et permettent que les applications facilement les métadonnées de plusieurs catalogues. Il permet en plus la publication décentralisée des catalogues et facilitent la recherche fédérée des données entre plusieurs sites. Les métadonnées DCAT aggrégées peuvent servir comme un manifeste pour faciliter la préservation digitale des ressources. DCAT est définie à l'adresse http://www.w3.org/TR/vocab-dcat/. Une quelconque version de ce document normatif et ce vocabulaire est une erreur dans ce vocabulaire.@fr"
    #xsd/langString
     "DCAT je RDF slovník navržený pro zprostředkování interoperability mezi datovými katalogy publikovanými na Webu. Poskytovatelé dat používáním slovníku DCAT pro popis datových sad v datových katalozích zvyšují jejich dohledatelnost a umožňují aplikacím konzumovat metadata z více katalogů. Dále je umožňena decentralizovaná publikace katalogů a federované dotazování na datové sady napříč katalogy. Agregovaná DCAT metadata mohou také sloužit jako průvodka umožňující digitální uchování informace. DCAT je definován na http://www.w3.org/TR/vocab-dcat/. Jakýkoliv nesoulad mezi odkazovaným dokumentem a tímto schématem je chybou v tomto schématu.@cs"
    #xsd/langString
     "هي أنطولوجية تسهل تبادل البيانات بين مختلف الفهارس على الوب. استخدام هذه الأنطولوجية يساعد على اكتشاف قوائم  البيانات المنشورة على الوب و يمكن التطبيقات المختلفة من الاستفادة أتوماتيكيا من البيانات المتاحة من مختلف الفهارس.@ar"
    #xsd/langString
     "DCATは、ウェブ上で公開されたデータ・カタログ間の相互運用性の促進を目的とするRDFの語彙です。このドキュメントでは、その利用のために、スキーマを定義し、例を提供します。データ・カタログ内のデータセットを記述するためにDCATを用いると、公開者が、発見可能性を増加させ、アプリケーションが複数のカタログのメタデータを容易に利用できるようになります。さらに、カタログの分散公開を可能にし、複数のサイトにまたがるデータセットの統合検索を促進します。集約されたDCATメタデータは、ディジタル保存を促進するためのマニフェスト・ファイルとして使用できます。@ja"
    #xsd/langString
     "DCAT is an RDF vocabulary designed to facilitate interoperability between data catalogs published on the Web. By using DCAT to describe datasets in data catalogs, publishers increase discoverability and enable applications easily to consume metadata from multiple catalogs. It further enables decentralized publishing of catalogs and facilitates federated dataset search across sites. Aggregated DCAT metadata can serve as a manifest file to facilitate digital preservation. DCAT is defined at http://www.w3.org/TR/vocab-dcat/. Any variance between that normative document and this schema is an error in this schema.@en"
    #xsd/langString
     "DCAT es un vocabulario RDF diseñado para facilitar la interoperabilidad entre catálogos de datos publicados en la Web. Utilizando DCAT para describir datos disponibles en catálogos se aumenta la posibilidad de que sean descubiertos y se permite que las aplicaciones consuman fácilmente los metadatos de varios catálogos.@es"
    #xsd/langString
     "Το DCAT είναι ένα RDF λεξιλόγιο που σχεδιάσθηκε για να κάνει εφικτή τη διαλειτουργικότητα μεταξύ καταλόγων δεδομένων στον Παγκόσμιο Ιστό. Χρησιμοποιώντας το DCAT για την περιγραφή συνόλων δεδομένων, οι εκδότες αυτών αυξάνουν την ανακαλυψιμότητα και επιτρέπουν στις εφαρμογές την εύκολη κατανάλωση μεταδεδομένων από πολλαπλούς καταλόγους. Επιπλέον, δίνει τη δυνατότητα για αποκεντρωμένη έκδοση και διάθεση καταλόγων και επιτρέπει δυνατότητες ενοποιημένης αναζήτησης μεταξύ διαφορετικών πηγών. Συγκεντρωτικά μεταδεδομένα που έχουν περιγραφεί με το DCAT μπορούν να χρησιμοποιηθούν σαν ένα δηλωτικό αρχείο (manifest file) ώστε να διευκολύνουν την ψηφιακή συντήρηση.@el"
    #xsd/langString
     "DCAT è un vocabolario RDF progettato per facilitare l'interoperabilità tra i cataloghi di dati pubblicati nel Web. Utilizzando DCAT per descrivere i dataset nei cataloghi di dati, i fornitori migliorano la capacità di individuazione dei dati e abilitano le  applicazioni al consumo di dati provenienti da cataloghi differenti. DCAT permette di decentralizzare la pubblicazione di cataloghi e facilita la ricerca federata dei dataset. L'aggregazione dei metadati federati può fungere da file manifesto per facilitare la conservazione digitale. DCAT è definito all'indirizzo http://www.w3.org/TR/vocab-dcat/. Qualsiasi scostamento tra tale definizione normativa e questo schema è da considerarsi un errore di questo schema.@it"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "Slovník pro datové katalogy@cs"
                #xsd/langString "Il vocabolario del catalogo dei dati@it"
                #xsd/langString "Le vocabulaire des jeux de données@fr"
                #xsd/langString "El vocabulario de catálogo de datos@es"
                #xsd/langString "Datakatalogvokabular@da"
                #xsd/langString "أنطولوجية فهارس قوائم البيانات@ar"
                #xsd/langString "Το λεξιλόγιο των καταλόγων δεδομένων@el"
                #xsd/langString "データ・カタログ語彙（DCAT）@ja"
                #xsd/langString "The data catalog vocabulary@en"],
   :skos/editorialNote
   #xsd/langString
    "English language definitions updated in this revision in line with ED. Multilingual text unevenly updated.@en"}
  (:refer-clojure :exclude [keyword]))

(def Catalog
  {:db/ident :dcat/Catalog,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   [#xsd/langString
     "A curated collection of metadata about resources (e.g., datasets and data services in the context of a data catalog).@en"
    #xsd/langString
     "Una raccolta curata di metadati sulle risorse (ad es. sui dataset e relativi servizi nel contesto di cataloghi di dati).@it"
    #xsd/langString
     "Řízená kolekce metadat o datových sadách a datových službách@cs"
    #xsd/langString
     "Una colección curada de metadatos sobre recursos (por ejemplo, conjuntos de datos y servicios de datos en el contexto de un catálogo de datos).@es"
    #xsd/langString
     "Μια επιμελημένη συλλογή μεταδεδομένων περί συνόλων δεδομένων@el"
    #xsd/langString
     "Une collection élaborée de métadonnées sur les jeux de données@fr"
    #xsd/langString "مجموعة من توصيفات قوائم البيانات@ar"
    #xsd/langString
     "En udvalgt og arrangeret samling af metadata om ressourcer (fx datasæt og datatjenester i kontekst af et datakatalog). @da"
    #xsd/langString "データ・カタログは、データセットに関するキュレートされたメタデータの集合です。@ja"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "Katalog@da"
                #xsd/langString "Katalog@cs"
                #xsd/langString "Κατάλογος@el"
                #xsd/langString "Catalogo@it"
                #xsd/langString "فهرس قوائم البيانات@ar"
                #xsd/langString "カタログ@ja"
                #xsd/langString "Catálogo@es"
                #xsd/langString "Catalog@en"
                #xsd/langString "Catalogue@fr"],
   :rdfs/subClassOf [:rdfs/Resource :dcat/Dataset :dcat/Resource],
   :skos/definition
   [#xsd/langString "データ・カタログは、データセットに関するキュレートされたメタデータの集合です。@ja"
    #xsd/langString
     "Řízená kolekce metadat o datových sadách a datových službách.@cs"
    #xsd/langString
     "Una raccolta curata di metadati sulle risorse (ad es. sui dataset e relativi servizi nel contesto di cataloghi di dati).@it"
    #xsd/langString "مجموعة من توصيفات قوائم البيانات@ar"
    #xsd/langString
     "Una colección curada de metadatos sobre recursos (por ejemplo, conjuntos de datos y servicios de datos en el contexto de un catálogo de datos).@es"
    #xsd/langString
     "Μια επιμελημένη συλλογή μεταδεδομένων περί συνόλων δεδομένων.@el"
    #xsd/langString
     "Une collection élaborée de métadonnées sur les jeux de données.@fr"
    #xsd/langString
     "En samling af metadata om ressourcer (fx datasæt og datatjenester i kontekst af et datakatalog).@da"
    #xsd/langString
     "A curated collection of metadata about resources (e.g., datasets and data services in the context of a data catalog).@en"],
   :skos/editorialNote
   #xsd/langString
    "English, Italian, Spanish definitions updated in this revision. Multilingual text not yet updated.@en",
   :skos/scopeNote
   [#xsd/langString
     "Normalmente, un catálogo de datos disponible en la web se representa como una única instancia de esta clase.@es"
    #xsd/langString
     "Et webbaseret datakatalog repræsenteres typisk ved en enkelt instans af denne klasse.@da"
    #xsd/langString
     "Συνήθως, ένας κατάλογος δεδομένων στον Παγκόσμιο Ιστό αναπαρίσταται ως ένα στιγμιότυπο αυτής της κλάσης.@el"
    #xsd/langString
     "Webový datový katalog je typicky reprezentován jako jedna instance této třídy.@cs"
    #xsd/langString
     "A web-based data catalog is typically represented as a single instance of this class.@en"
    #xsd/langString
     "Normalmente, un catalogo di dati nel web viene rappresentato come una singola istanza di questa classe.@it"
    #xsd/langString "通常、ウェブ・ベースのデータ・カタログは、このクラスの1つのインスタンスとして表わされます。@ja"]})

(def CatalogRecord
  {:db/ident :dcat/CatalogRecord,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   [#xsd/langString
     "A record in a data catalog, describing the registration of a single dataset or data service.@en"
    #xsd/langString "1つのデータセットを記述したデータ・カタログ内のレコード。@ja"
    #xsd/langString
     "En post i et datakatalog der beskriver registreringen af et enkelt datasæt eller en datatjeneste.@da"
    #xsd/langString
     "Záznam v datovém katalogu popisující jednu datovou sadu či datovou službu.@cs"
    #xsd/langString
     "Un registre du catalogue ou une entrée du catalogue, décrivant un seul jeu de données.@fr"
    #xsd/langString
     "Μία καταγραφή ενός καταλόγου, η οποία περιγράφει ένα συγκεκριμένο σύνολο δεδομένων.@el"
    #xsd/langString
     "Un record in un catalogo di dati che descrive un singolo dataset o servizio di dati.@it"
    #xsd/langString
     "Un registro en un catálogo de datos que describe un solo conjunto de datos o un servicio de datos.@es"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "カタログ・レコード@ja"
                #xsd/langString "Καταγραφή καταλόγου@el"
                #xsd/langString "سجل@ar"
                #xsd/langString "Registro del catálogo@es"
                #xsd/langString "Record di catalogo@it"
                #xsd/langString "Catalog Record@en"
                #xsd/langString "Katalogpost@da"
                #xsd/langString "Katalogizační záznam@cs"
                #xsd/langString "Registre du catalogue@fr"],
   :rdfs/subClassOf [:rdfs/Resource
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :foaf/primaryTopic,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :dcat/Resource,
                      :owl/onProperty    :foaf/primaryTopic,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   [#xsd/langString
     "Un record in un catalogo di dati che descrive un singolo dataset o servizio di dati.@it"
    #xsd/langString
     "Záznam v datovém katalogu popisující jednu datovou sadu či datovou službu.@cs"
    #xsd/langString
     "Un registro en un catálogo de datos que describe un solo conjunto de datos o un servicio de datos.@es"
    #xsd/langString
     "En post i et datakatalog der beskriver registreringen af et enkelt datasæt eller en datatjeneste.@da"
    #xsd/langString "1つのデータセットを記述したデータ・カタログ内のレコード。@ja"
    #xsd/langString
     "Μία καταγραφή ενός καταλόγου, η οποία περιγράφει ένα συγκεκριμένο σύνολο δεδομένων.@el"
    #xsd/langString
     "Un registre du catalogue ou une entrée du catalogue, décrivant un seul jeu de données.@fr"
    #xsd/langString
     "A record in a data catalog, describing the registration of a single dataset or data service.@en"],
   :skos/editorialNote
   #xsd/langString
    "English definition updated in this revision. Multilingual text not yet updated except the Spanish one and the Czech one and Italian one.@en",
   :skos/scopeNote
   [#xsd/langString
     "Questa classe è opzionale e non tutti i cataloghi la utilizzeranno. Esiste per cataloghi in cui si opera una distinzione tra i metadati relativi al dataset ed i metadati relativi alla gestione del dataset nel catalogo. Ad esempio, la  proprietà per indicare la data di pubblicazione del dataset rifletterà la data in cui l'informazione è stata originariamente messa a disposizione dalla casa editrice, mentre la data di pubblicazione per il record nel catalogo rifletterà la data in cui il dataset è stato aggiunto al catalogo. Nei casi dove solo quest'ultima sia nota, si utilizzerà esclusivamente la data di  pubblicazione relativa al record del catalogo. Si noti che l'Ontologia W3C PROV permette di descrivere ulteriori informazioni sulla provenienza, quali i dettagli del processo, la procedura e l'agente coinvolto in una particolare modifica di un dataset.@it"
    #xsd/langString
     "Tato třída je volitelná a ne všechny katalogy ji využijí. Existuje pro katalogy, ve kterých se rozlišují metadata datové sady či datové služby a metadata o záznamu o datové sadě či datové službě v katalogu. Například datum publikace datové sady odráží datum, kdy byla datová sada původně zveřejněna poskytovatelem dat, zatímco datum publikace katalogizačního záznamu je datum zanesení datové sady do katalogu. V případech kdy se obě data liší, nebo je známo jen to druhé, by mělo být specifikováno jen datum publikace katalogizačního záznamu. Všimněte si, že ontologie W3C PROV umožňuje popsat další informace o původu jako například podrobnosti o procesu konkrétní změny datové sady a jeho účastnících.@cs"
    #xsd/langString
     "Esta clase es opcional y no todos los catálogos la utilizarán. Esta clase existe para catálogos que hacen una distinción entre los metadatos acerca de un conjunto de datos o un servicio de datos y los metadatos acerca de una entrada en ese conjunto de datos en el catálogo. Por ejemplo, la propiedad sobre la fecha de la publicación de los datos refleja la fecha en que la información fue originalmente publicada, mientras que la fecha de publicación del registro del catálogo es la fecha en que los datos se agregaron al mismo. En caso en que ambas fechas fueran diferentes, o en que sólo la fecha de publicación del registro del catálogo estuviera disponible, sólo debe especificarse en el registro del catálogo. Tengan en cuenta que la ontología PROV de W3C permite describir otra información sobre la proveniencia de los datos, como por ejemplo detalles del proceso y de los agentes involucrados en algún cambio específico a los datos.@es"
    #xsd/langString
     "This class is optional and not all catalogs will use it. It exists for catalogs where a distinction is made between metadata about a dataset or data service and metadata about the entry for the dataset or data service in the catalog. For example, the publication date property of the dataset reflects the date when the information was originally made available by the publishing agency, while the publication date of the catalog record is the date when the dataset was added to the catalog. In cases where both dates differ, or where only the latter is known, the publication date should only be specified for the catalog record. Notice that the W3C PROV Ontology allows describing further provenance information such as the details of the process and the agent involved in a particular change to a dataset.@en"
    #xsd/langString
     "Αυτή η κλάση είναι προαιρετική και δεν χρησιμοποιείται από όλους τους καταλόγους. Υπάρχει για τις περιπτώσεις καταλόγων όπου γίνεται διαχωρισμός μεταξύ των μεταδεδομένων για το σύνολο των δεδομένων και των μεταδεδομένων για την καταγραφή του συνόλου δεδομένων εντός του καταλόγου. Για παράδειγμα, η ιδιότητα της ημερομηνίας δημοσίευσης του συνόλου δεδομένων δείχνει την ημερομηνία κατά την οποία οι πληροφορίες έγιναν διαθέσιμες από τον φορέα δημοσίευσης, ενώ η ημερομηνία δημοσίευσης της καταγραφής του καταλόγου δείχνει την ημερομηνία που το σύνολο δεδομένων προστέθηκε στον κατάλογο. Σε περιπτώσεις που οι δύο ημερομηνίες διαφέρουν, ή που μόνο η τελευταία είναι γνωστή, η ημερομηνία δημοσίευσης θα πρέπει να δίνεται για την καταγραφή του καταλόγου. Να σημειωθεί πως η οντολογία W3C PROV επιτρέπει την περιγραφή επιπλέον πληροφοριών ιστορικού όπως λεπτομέρειες για τη διαδικασία και τον δράστη που εμπλέκονται σε μία συγκεκριμένη αλλαγή εντός του συνόλου δεδομένων.@el"
    #xsd/langString
     "Denne klasse er valgfri og ikke alle kataloger vil anvende denne klasse. Den kan anvendes i de kataloger hvor der skelnes mellem metadata om datasættet eller datatjenesten og metadata om selve posten til registreringen af datasættet eller datatjenesten i kataloget. Udgivelsesdatoen for datasættet afspejler for eksempel den dato hvor informationerne oprindeligt blev gjort tilgængelige af udgiveren, hvorimod udgivelsesdatoen for katalogposten er den dato hvor datasættet blev føjet til kataloget. I de tilfælde hvor de to datoer er forskellige eller hvor blot sidstnævnte er kendt, bør udgivelsesdatoen kun angives for katalogposten. Bemærk at W3Cs PROV ontologi gør til muligt at tilføje yderligere proveniensoplysninger eksempelvis om processen eller aktøren involveret i en given ændring af datasættet.@da"
    #xsd/langString
     "このクラスはオプションで、すべてのカタログがそれを用いるとは限りません。これは、データセットに関するメタデータとカタログ内のデータセットのエントリーに関するメタデータとで区別が行われるカタログのために存在しています。例えば、データセットの公開日プロパティーは、公開機関が情報を最初に利用可能とした日付を示しますが、カタログ・レコードの公開日は、データセットがカタログに追加された日付です。両方の日付が異っていたり、後者だけが分かっている場合は、カタログ・レコードに対してのみ公開日を指定すべきです。W3CのPROVオントロジー[prov-o]を用いれば、データセットに対する特定の変更に関連するプロセスやエージェントの詳細などの、さらに詳しい来歴情報の記述が可能となることに注意してください。@ja"
    #xsd/langString
     "C'est une classe facultative et tous les catalogues ne l'utiliseront pas. Cette classe existe pour les catalogues\tayant une distinction entre les métadonnées sur le jeu de données et les métadonnées sur une entrée du jeu de données dans le catalogue.@fr"]})

(def DataService
  "Dataservice"
  {:db/ident :dcat/DataService,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "A site or end-point providing operations related to the discovery of, access to, or processing functions on, data or related resources.@en"
    #xsd/langString
     "Umístění či přístupový bod poskytující operace související s hledáním, přistupem k, či výkonem funkcí na datech či souvisejících zdrojích.@cs"
    #xsd/langString
     "Et websted eller endpoint der udstiller operationer relateret til opdagelse af, adgang til eller behandlende funktioner på data eller relaterede ressourcer.@da"
    #xsd/langString
     "Un sitio o end-point que provee operaciones relacionadas a funciones de descubrimiento, acceso, o procesamiento de datos o recursos relacionados.@es"
    #xsd/langString
     "Un sito o end-point che fornisce operazioni relative alla scoperta, all'accesso o all'elaborazione di funzioni su dati o risorse correlate.@it"],
   :rdfs/label [#xsd/langString "Servizio di dati@it"
                #xsd/langString "Data service@en"
                #xsd/langString "Servicio de datos@es"
                #xsd/langString "Datatjeneste@da"],
   :rdfs/subClassOf [:dcmitype/Service :dcat/Resource],
   :skos/altLabel #xsd/langString "Dataservice@da",
   :skos/changeNote [#xsd/langString "New class added in DCAT 2.0.@en"
                     #xsd/langString "Nová třída přidaná ve verzi DCAT 2.0.@cs"
                     #xsd/langString "Ny klasse tilføjet i DCAT 2.0.@da"
                     #xsd/langString "Nueva clase añadida en DCAT 2.0.@es"
                     #xsd/langString "Nuova classe aggiunta in DCAT 2.0.@it"],
   :skos/definition
   [#xsd/langString
     "Un sitio o end-point que provee operaciones relacionadas a funciones de descubrimiento, acceso, o procesamiento de datos o recursos relacionados.@es"
    #xsd/langString
     "Umístění či přístupový bod poskytující operace související s hledáním, přistupem k, či výkonem funkcí na datech či souvisejících zdrojích.@cs"
    #xsd/langString
     "A site or end-point providing operations related to the discovery of, access to, or processing functions on, data or related resources.@en"
    #xsd/langString
     "Et site eller endpoint der udstiller operationer relateret til opdagelse af, adgang til eller behandlende funktioner på data eller relaterede ressourcer.@da"
    #xsd/langString
     "Un sito o end-point che fornisce operazioni relative alla scoperta, all'accesso o all'elaborazione di funzioni su dati o risorse correlate.@it"],
   :skos/scopeNote
   [#xsd/langString
     "Pokud je dcat:DataService navázána na jednu či více Datových sad, jsou tyto indikovány vlstností dcat:servesDataset.@cs"
    #xsd/langString
     "El tipo de servicio puede indicarse usando la propiedad dct:type. Su valor puede provenir de un vocabulario controlado, como por ejemplo el vocabulario de servicios de datos espaciales de INSPIRE.@es"
    #xsd/langString
     "Hvis en dcat:DataService er bundet til en eller flere specifikke datasæt kan dette indikeres ved hjælp af egenskaben dcat:servesDataset. @da"
    #xsd/langString
     "Druh služby může být indikován vlastností dct:type. Její hodnota může být z řízeného slovníku, kterým je například slovník typů prostorových datových služeb INSPIRE.@cs"
    #xsd/langString
     "If a dcat:DataService is bound to one or more specified Datasets, they are indicated by the dcat:servesDataset property.@en"
    #xsd/langString
     "Si un dcat:DataService está asociado con uno o más conjuntos de datos especificados, dichos conjuntos de datos pueden indicarse con la propiedad dcat:servesDataset.@es"
    #xsd/langString
     "Il tipo di servizio può essere indicato usando la proprietà dct:type. Il suo valore può essere preso da un vocabolario controllato come il vocabolario dei tipi di servizi per dati spaziali di INSPIRE.@it"
    #xsd/langString
     "Datatjenestetypen kan indikeres ved hjælp af egenskaben dct:type. Værdien kan tages fra kontrollerede udfaldsrum såsom INSPIRE spatial data service vocabulary.@da"
    #xsd/langString
     "The kind of service can be indicated using the dct:type property. Its value may be taken from a controlled vocabulary such as the INSPIRE spatial data service type vocabulary.@en"
    #xsd/langString
     "Se un dcat:DataService è associato a uno o più Dataset specificati, questi sono indicati dalla proprietà dcat:serveDataset.@it"]})

(def Dataset
  "Datasamling"
  {:db/ident :dcat/Dataset,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   [#xsd/langString
     "1つのエージェントによって公開またはキュレートされ、1つ以上の形式でアクセスまたはダウンロードできるデータの集合。@ja"
    #xsd/langString
     "Raccolta di dati, pubblicati o curati da un'unica fonte, disponibili per l'accesso o il download in uno o più formati.@it"
    #xsd/langString
     "Μία συλλογή από δεδομένα, δημοσιευμένη ή επιμελημένη από μία και μόνο πηγή, διαθέσιμη δε προς πρόσβαση ή μεταφόρτωση σε μία ή περισσότερες μορφές.@el"
    #xsd/langString
     "قائمة بيانات منشورة أو مجموعة من قبل مصدر ما و متاح الوصول إليها أو تحميلها@ar"
    #xsd/langString
     "A collection of data, published or curated by a single source, and available for access or download in one or more representations.@en"
    #xsd/langString
     "Une collection de données, publiée ou élaborée par une seule source, et disponible pour accès ou téléchargement dans un ou plusieurs formats.@fr"
    #xsd/langString
     "Kolekce dat poskytovaná či řízená jedním zdrojem, která je k dispozici pro přístup či stažení v jednom či více formátech.@cs"
    #xsd/langString
     "Una colección de datos, publicados o conservados por una única fuente, y disponibles para ser accedidos o descargados en uno o más formatos.@es"
    #xsd/langString
     "En samling af data, udgivet eller udvalgt og arrangeret af en enkelt kilde og som er til råde for adgang til eller download af i en eller flere repræsentationer.@da"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "データセット@ja"
                #xsd/langString "Dataset@en"
                #xsd/langString "Dataset@it"
                #xsd/langString "قائمة بيانات@ar"
                #xsd/langString "Conjunto de datos@es"
                #xsd/langString "Σύνολο Δεδομένων@el"
                #xsd/langString "Jeu de données@fr"
                #xsd/langString "Datová sada@cs"
                #xsd/langString "Datasæt@da"],
   :rdfs/subClassOf [:rdfs/Resource :dcat/Resource],
   :skos/altLabel #xsd/langString "Datasamling@da",
   :skos/changeNote
   [#xsd/langString
     "2018-02 - subklasse af dctype:Dataset fjernet da scope af dcat:Dataset omfatter flere forskellige typer fra dctype-vokabularet.@da"
    #xsd/langString
     "2018-02 - odstraněno tvrzení o podtřídě dctype:Dataset, jelikož rozsah dcat:Dataset zahrnuje několik dalších typů ze slovníku dctype.@cs"
    #xsd/langString
     "2018-02 - subclass of dctype:Dataset removed because scope of dcat:Dataset includes several other types from the dctype vocabulary.@en"
    #xsd/langString
     "2018-02 - se eliminó el axioma de subclase con dctype:Dataset porque el alcance de dcat:Dataset incluye muchos otros tipos del vocabulario dctype.@es"
    #xsd/langString
     "2018-02 - sottoclasse di dctype:Dataset rimosso perché l'ambito di dcat:Dataset include diversi altri tipi dal vocabolario dctype.@it"],
   :skos/definition
   [#xsd/langString
     "Une collection de données, publiée ou élaborée par une seule source, et disponible pour accès ou téléchargement dans un ou plusieurs formats.@fr"
    #xsd/langString
     "قائمة بيانات منشورة أو مجموعة من قبل مصدر ما و متاح الوصول إليها أو تحميلها@ar"
    #xsd/langString
     "Una colección de datos, publicados o conservados por una única fuente, y disponibles para ser accedidos o descargados en uno o más formatos.@es"
    #xsd/langString
     "Raccolta di dati, pubblicati o curati da un'unica fonte, disponibili per l'accesso o il download in uno o più formati.@it"
    #xsd/langString
     "Kolekce dat poskytovaná či řízená jedním zdrojem, která je k dispozici pro přístup či stažení v jednom či více formátech.@cs"
    #xsd/langString
     "En samling a data, udgivet eller udvalgt og arrangeret af en enkelt kilde og som der er adgang til i en eller flere repræsentationer.@da"
    #xsd/langString
     "1つのエージェントによって公開またはキュレートされ、1つ以上の形式でアクセスまたはダウンロードできるデータの集合。@ja"
    #xsd/langString
     "Μία συλλογή από δεδομένα, δημοσιευμένη ή επιμελημένη από μία και μόνο πηγή, διαθέσιμη δε προς πρόσβαση ή μεταφόρτωση σε μία ή περισσότερες μορφές.@el"
    #xsd/langString
     "A collection of data, published or curated by a single source, and available for access or download in one or more represenations.@en"],
   :skos/editorialNote
   #xsd/langString
    "2020-03-16 A new scopenote added and need to be translated@en",
   :skos/scopeNote
   [#xsd/langString
     "Questa classe rappresenta il dataset come pubblicato dall’editore. Nel caso in cui sia necessario operare  una distinzione fra i metadati originali del dataset e il record dei metadati ad esso associato nel catalogo (ad esempio, per distinguere la data di modifica del dataset da quella del dataset nel catalogo) si può impiegare la classe catalog record.@it"
    #xsd/langString
     "Cette classe représente le jeu de données publié par le fournisseur de données. Dans les cas où une distinction est nécessaire entre le jeu de donénes et son entrée dans le catalogue, la classe registre de données peut être utilisée pour ce dernier.@fr"
    #xsd/langString
     "Esta clase representa el conjunto de datos publicados. En los casos donde es necesario distinguir entre el conjunto de datos y su entrada en el catálogo de datos, se debe utilizar la clase 'registro del catálogo'.@es"
    #xsd/langString
     "Η κλάση αυτή αναπαριστά το σύνολο δεδομένων αυτό καθ'εαυτό, όπως έχει δημοσιευθεί από τον εκδότη. Σε περιπτώσεις όπου είναι απαραίτητος ο διαχωρισμός μεταξύ του συνόλου δεδομένων και της καταγραφής αυτού στον κατάλογο (γιατί μεταδεδομένα όπως η ημερομηνία αλλαγής και ο συντηρητής μπορεί να διαφέρουν) η κλάση της καταγραφής καταλόγου μπορεί να χρησιμοποιηθεί για το τελευταίο.@el"
    #xsd/langString
     "This class represents the actual dataset as published by the dataset provider. In cases where a distinction between the actual dataset and its entry in the catalog is necessary (because metadata such as modification date and maintainer might differ), the catalog record class can be used for the latter.@en"
    #xsd/langString
     "Tato třída reprezentuje datovou sadu tak, jak je publikována poskytovatelem dat. V případě potřeby rozlišení datové sady a jejího katalogizačního záznamu (jelikož metadata jako datum modifikace se mohou lišit) pro něj může být použita třída \"katalogizační záznam\".@cs"
    #xsd/langString
     "Questa classe descrive il dataset dal punto di vista concettuale. Possono essere disponibili una o più rappresentazioni, con diversi layout e formati schematici o serializzazioni.@it"
    #xsd/langString
     "This class describes the conceptual dataset. One or more representations might be available, with differing schematic layouts and formats or serializations.@en"
    #xsd/langString
     "このクラスは、データセットの公開者が公開する実際のデータセットを表わします。カタログ内の実際のデータセットとそのエントリーとの区別が必要な場合（修正日と維持者などのメタデータが異なるかもしれないので）は、後者にcatalog recordというクラスを使用できます。@ja"
    #xsd/langString
     "The notion of dataset in DCAT is broad and inclusive, with the intention of accommodating resource types arising from all communities. Data comes in many forms including numbers, text, pixels, imagery, sound and other multi-media, and potentially other types, any of which might be collected into a dataset.@en"
    #xsd/langString
     "Denne klasse beskriver det konceptuelle datasæt. En eller flere repræsentationer kan være tilgængelige med forskellige skematiske opsætninger, formater eller serialiseringer.@da"
    #xsd/langString
     "Denne klasse repræsenterer det konkrete datasæt som det udgives af datasætleverandøren. I de tilfælde hvor det er nødvendigt at skelne mellem det konkrete datasæt og dets registrering i kataloget (fordi metadata såsom ændringsdato og vedligeholder er forskellige), så kan klassen katalogpost anvendes. @da"]})

(def Distribution
  {:db/ident :dcat/Distribution,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   [#xsd/langString
     "En specifik repræsentation af et datasæt. Et datasæt kan være tilgængelig i mange serialiseringer der kan variere på forskellige vis, herunder sprog, medietype eller format, systemorganisering, tidslig- og geografisk opløsning, detaljeringsniveau eller profiler (der kan specificere en eller flere af ovenstående).@da"
    #xsd/langString
     "Représente une forme spécifique d'un jeu de données. Caque jeu de données peut être disponible sous différentes formes, celles-ci pouvant représenter différents formats du jeu de données ou différents endpoint. Des exemples de distribution sont des fichirs CSV, des API ou des flux RSS.@fr"
    #xsd/langString
     "Αναπαριστά μία συγκεκριμένη διαθέσιμη μορφή ενός συνόλου δεδομένων. Κάθε σύνολο δεδομενων μπορεί να είναι διαθέσιμο σε διαφορετικές μορφές, οι μορφές αυτές μπορεί να αναπαριστούν διαφορετικές μορφές αρχείων ή διαφορετικά σημεία διάθεσης. Παραδείγματα διανομών συμπεριλαμβάνουν ένα μεταφορτώσιμο αρχείο μορφής CSV, ένα API ή ένα RSS feed.@el"
    #xsd/langString
     "شكل محدد لقائمة البيانات يمكن الوصول إليه. قائمة بيانات ما يمكن أن تكون متاحه باشكال و أنواع متعددة.  ملف يمكن تحميله أو واجهة برمجية يمكن من خلالها الوصول إلى البيانات هي أمثلة على ذلك.@ar"
    #xsd/langString
     "Konkrétní reprezentace datové sady. Datová sada může být dostupná v různých serializacích, které se mohou navzájem lišit různými způsoby, mimo jiné přirozeným jazykem, media-typem či formátem, schematickou organizací, časovým a prostorovým rozlišením, úrovní detailu či profily (které mohou specifikovat některé či všechny tyto rozdíly).@cs"
    #xsd/langString
     "データセットの特定の利用可能な形式を表わします。各データセットは、異なる形式で利用できることがあり、これらの形式は、データセットの異なる形式や、異なるエンドポイントを表わす可能性があります。配信の例には、ダウンロード可能なCSVファイル、API、RSSフィードが含まれます。@ja"
    #xsd/langString
     "Rappresenta una forma disponibile e specifica del dataset. Ciascun dataset può essere disponibile in forme differenti, che possono rappresentare formati diversi o diversi punti di accesso per un dataset. Esempi di distribuzioni sono un file CSV scaricabile, una API o un RSS feed.@it"
    #xsd/langString
     "A specific representation of a dataset. A dataset might be available in multiple serializations that may differ in various ways, including natural language, media-type or format, schematic organization, temporal and spatial resolution, level of detail or profiles (which might specify any or all of the above).@en"
    #xsd/langString
     "Una representación específica de los datos. Cada conjunto de datos puede estar disponible en formas diferentes, las cuáles pueden variar en distintas formas, incluyendo el idioma, 'media-type' o formato, organización esquemática, resolución temporal y espacial, nivel de detalle o perfiles (que pueden especificar cualquiera o todas las diferencias anteriores).@es"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "التوزيع@ar"
                #xsd/langString "Διανομή@el"
                #xsd/langString "Distribuce@cs"
                #xsd/langString "Distribuzione@it"
                #xsd/langString "配信@ja"
                #xsd/langString "Distribution@en"
                #xsd/langString "Distribution@fr"
                #xsd/langString "Distribution@da"
                #xsd/langString "Distribución@es"],
   :rdfs/subClassOf :rdfs/Resource,
   :skos/altLabel [#xsd/langString "Datamanifestation@da"
                   #xsd/langString "Datarepræsentation@da"
                   #xsd/langString "Dataudstilling@da"
                   #xsd/langString "Datadistribution@da"],
   :skos/definition
   [#xsd/langString
     "Konkrétní reprezentace datové sady. Datová sada může být dostupná v různých serializacích, které se mohou navzájem lišit různými způsoby, mimo jiné přirozeným jazykem, media-typem či formátem, schematickou organizací, časovým a prostorovým rozlišením, úrovní detailu či profily (které mohou specifikovat některé či všechny tyto rozdíly).@cs"
    #xsd/langString
     "Rappresenta una forma disponibile e specifica del dataset. Ciascun dataset può essere disponibile in forme differenti, che possono rappresentare formati diversi o diversi punti di accesso per un dataset. Esempi di distribuzioni sono un file CSV scaricabile, una API o un RSS feed.@it"
    #xsd/langString
     "Una representación específica de los datos. Cada conjunto de datos puede estar disponible en formas diferentes, las cuáles pueden variar en distintas formas, incluyendo el idioma, 'media-type' o formato, organización esquemática, resolución temporal y espacial, nivel de detalle o perfiles (que pueden especificar cualquiera o todas las diferencias anteriores).@es"
    #xsd/langString
     "Représente une forme spécifique d'un jeu de données. Caque jeu de données peut être disponible sous différentes formes, celles-ci pouvant représenter différents formats du jeu de données ou différents endpoint. Des exemples de distribution sont des fichirs CSV, des API ou des flux RSS.@fr"
    #xsd/langString
     "A specific representation of a dataset. A dataset might be available in multiple serializations that may differ in various ways, including natural language, media-type or format, schematic organization, temporal and spatial resolution, level of detail or profiles (which might specify any or all of the above).@en"
    #xsd/langString
     "Αναπαριστά μία συγκεκριμένη διαθέσιμη μορφή ενός συνόλου δεδομένων. Κάθε σύνολο δεδομενων μπορεί να είναι διαθέσιμο σε διαφορετικές μορφές, οι μορφές αυτές μπορεί να αναπαριστούν διαφορετικές μορφές αρχείων ή διαφορετικά σημεία διάθεσης. Παραδείγματα διανομών συμπεριλαμβάνουν ένα μεταφορτώσιμο αρχείο μορφής CSV, ένα API ή ένα RSS feed.@el"
    #xsd/langString
     "データセットの特定の利用可能な形式を表わします。各データセットは、異なる形式で利用できることがあり、これらの形式は、データセットの異なる形式や、異なるエンドポイントを表わす可能性があります。配信の例には、ダウンロード可能なCSVファイル、API、RSSフィードが含まれます。@ja"
    #xsd/langString
     "شكل محدد لقائمة البيانات يمكن الوصول إليه. قائمة بيانات ما يمكن أن تكون متاحه باشكال و أنواع متعددة.  ملف يمكن تحميله أو واجهة برمجية يمكن من خلالها الوصول إلى البيانات هي أمثلة على ذلك.@ar"
    #xsd/langString
     "En specifik repræsentation af et datasæt. Et datasæt kan være tilgængelig i mange serialiseringer der kan variere på forskellige vis, herunder sprog, medietype eller format, systemorganisering, tidslig- og geografisk opløsning, detaljeringsniveau eller profiler (der kan specificere en eller flere af ovenstående).@da"],
   :skos/scopeNote
   [#xsd/langString
     "Esta clase representa una disponibilidad general de un conjunto de datos, e implica que no existe información acerca del método de acceso real a los datos, i.e., si es un enlace de descarga directa o a través de una página Web.@es"
    #xsd/langString
     "これは、データセットの一般的な利用可能性を表わし、データの実際のアクセス方式に関する情報（つまり、直接ダウンロードなのか、APIなのか、ウェブページを介したものなのか）を意味しません。dcat:downloadURLプロパティーの使用は、直接ダウンロード可能な配信を意味します。@ja"
    #xsd/langString
     "Ceci représente une disponibilité générale du jeu de données, et implique qu'il n'existe pas d'information sur la méthode d'accès réelle des données, par exple, si c'est un lien de téléchargement direct ou à travers une page Web.@fr"
    #xsd/langString
     "Denne klasse repræsenterer datasættets overordnede tilgængelighed og giver ikke oplysninger om hvilken metode der kan anvendes til at få adgang til data, dvs. om adgang til datasættet realiseres ved direkte download, API eller via et websted. Anvendelsen af egenskaben dcat:downloadURL indikerer at distributionen kan downloades direkte.@da"
    #xsd/langString
     "Αυτό αναπαριστά μία γενική διαθεσιμότητα ενός συνόλου δεδομένων και δεν υπονοεί τίποτα περί του πραγματικού τρόπου πρόσβασης στα δεδομένα, αν είναι άμεσα μεταφορτώσιμα, μέσω API ή μέσω μίας ιστοσελίδας. Η χρήση της ιδιότητας dcat:downloadURL δείχνει μόνο άμεσα μεταφορτώσιμες διανομές.@el"
    #xsd/langString
     "This represents a general availability of a dataset it implies no information about the actual access method of the data, i.e. whether by direct download, API, or through a Web page. The use of dcat:downloadURL property indicates directly downloadable distributions.@en"
    #xsd/langString
     "Toto popisuje obecnou dostupnost datové sady. Neimplikuje žádnou informaci o skutečné metodě přístupu k datům, tj. zda jsou přímo ke stažení, skrze API či přes webovou stránku. Použití vlastnosti dcat:downloadURL indikuje přímo stažitelné distribuce.@cs"
    #xsd/langString
     "Questa classe rappresenta una disponibilità generale di un dataset e non implica alcuna informazione sul metodo di accesso effettivo ai dati, ad esempio se si tratta di un accesso a download diretto, API, o attraverso una pagina Web. L'utilizzo della proprietà dcat:downloadURL indica distribuzioni direttamente scaricabili.@it"]})

(def Relationship
  {:db/ident :dcat/Relationship,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Una clase de asociación para adjuntar información adicional a una relación entre recursos DCAT.@es"
    #xsd/langString
     "Asociační třída pro připojení dodatečných informací ke vztahu mezi zdroji DCAT.@cs"
    #xsd/langString
     "An association class for attaching additional information to a relationship between DCAT Resources.@en"
    #xsd/langString
     "En associationsklasse til brug for tilknytning af yderligere information til en relation mellem DCAT-ressourcer.@da"
    #xsd/langString
     "Una classe di associazione per il collegamento di informazioni aggiuntive a una relazione tra le risorse DCAT.@it"],
   :rdfs/label [#xsd/langString "Relazione@it"
                #xsd/langString "Relation@da"
                #xsd/langString "Vztah@cs"
                #xsd/langString "Relación@es"
                #xsd/langString "Relationship@en"],
   :skos/changeNote [#xsd/langString "Nuova classe aggiunta in DCAT 2.0.@it"
                     #xsd/langString "Nueva clase añadida en DCAT 2.0.@es"
                     #xsd/langString "Nová třída přidaná ve verzi DCAT 2.0.@cs"
                     #xsd/langString "New class added in DCAT 2.0.@en"
                     #xsd/langString "Ny klasse i DCAT 2.0.@da"],
   :skos/definition
   [#xsd/langString
     "An association class for attaching additional information to a relationship between DCAT Resources.@en"
    #xsd/langString
     "Una classe di associazione per il collegamento di informazioni aggiuntive a una relazione tra le risorse DCAT.@it"
    #xsd/langString
     "En associationsklasse til brug for tilknytning af yderligere information til en relation mellem DCAT-ressourcer.@da"
    #xsd/langString
     "Asociační třída pro připojení dodatečných informací ke vztahu mezi zdroji DCAT.@cs"
    #xsd/langString
     "Una clase de asociación para adjuntar información adicional a una relación entre recursos DCAT.@es"],
   :skos/scopeNote
   [#xsd/langString
     "Se usa para caracterizar la relación entre conjuntos de datos, y potencialmente otros recursos, donde la naturaleza de la relación se conoce pero no está caracterizada adecuadamente con propiedades del estándar 'Dublin Core' (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@es"
    #xsd/langString
     "Use to characterize a relationship between datasets, and potentially other resources, where the nature of the relationship is known but is not adequately characterized by the standard Dublin Core properties (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@en"
    #xsd/langString
     "Anvendes til at karakterisere en relation mellem datasæt, og potentielt andre ressourcer, hvor relationen er kendt men ikke tilstrækkeligt beskrevet af de standardiserede egenskaber i Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) eller PROV-O-egenskaber (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@da"
    #xsd/langString
     "Používá se pro charakterizaci vztahu mezi datovými sadami a případně i jinými zdroji, kde druh vztahu je sice znám, ale není přiměřeně charakterizován standardními vlastnostmi slovníku Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) či vlastnostmi slovníku PROV-O (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@cs"
    #xsd/langString
     "Viene utilizzato per caratterizzare la relazione tra insiemi di dati, e potenzialmente altri tipi di risorse, nei casi in cui la natura della relazione è nota ma non adeguatamente caratterizzata dalle proprietà dello standard 'Dublin Core' (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:require, dct:isRequiredBy) o dalle propietà fornite da PROV-O  (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov: hadPrimarySource, prov:alternateOf, prov:specializationOf).@it"]})

(def Resource
  {:db/ident :dcat/Resource,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Ressource udgivet eller udvalgt og arrangeret af en enkelt aktør.@da"
    #xsd/langString "Recurso publicado o curado por un agente único.@es"
    #xsd/langString "Risorsa pubblicata o curata da un singolo agente.@it"
    #xsd/langString "Zdroj publikovaný či řízený jediným činitelem.@cs"
    #xsd/langString "Resource published or curated by a single agent.@en"],
   :rdfs/label [#xsd/langString "Katalogizovaný zdroj@cs"
                #xsd/langString "Recurso catalogado@es"
                #xsd/langString "Risorsa catalogata@it"
                #xsd/langString "Katalogiseret ressource@da"
                #xsd/langString "Catalogued resource@en"],
   :skos/changeNote [#xsd/langString "New class added in DCAT 2.0.@en"
                     #xsd/langString "Nuova classe aggiunta in DCAT 2.0.@it"
                     #xsd/langString "Ny klasse i DCAT 2.0.@da"
                     #xsd/langString "Nová třída přidaná ve verzi DCAT 2.0.@cs"
                     #xsd/langString "Nueva clase agregada en DCAT 2.0.@es"],
   :skos/definition
   [#xsd/langString "Resource published or curated by a single agent.@en"
    #xsd/langString "Risorsa pubblicata o curata da un singolo agente.@it"
    #xsd/langString
     "Ressource udgivet eller udvalgt og arrangeret af en enkelt aktør.@da"
    #xsd/langString "Recurso publicado o curado por un agente único.@es"
    #xsd/langString "Zdroj publikovaný či řízený jediným činitelem.@cs"],
   :skos/scopeNote
   [#xsd/langString
     "dcat:Resource es un punto de extensión que permite la definición de cualquier tipo de catálogo. Se pueden definir subclases adicionales en perfil de DCAT o una aplicación para catálogos de otro tipo de recursos.@es"
    #xsd/langString
     "dcat:Resource je bod pro rozšíření umožňující definici různých druhů katalogů. Další podtřídy lze definovat v profilech DCAT či aplikacích pro katalogy zdrojů jiných druhů.@cs"
    #xsd/langString
     "Klassen for alle katalogiserede ressourcer, den overordnede klasse for dcat:Dataset, dcat:DataService, dcat:Catalog og enhvert medlem af et dcat:Catalog. Denne klasse bærer egenskaber der gælder alle katalogiserede ressourcer, herunder dataset og datatjenester. Det anbefales kraftigt at mere specifikke subklasser oprettes. Når der beskrives ressourcer der ikke er dcat:Dataset eller dcat:DataService, anbefales det at oprette passende subklasser af dcat:Resource eller at dcat:Resource anvendes sammen med egenskaben dct:type til opmærkning med en specifik typeangivelse.@da"
    #xsd/langString
     "Třída všech katalogizovaných zdrojů, nadtřída dcat:Dataset, dcat:DataService, dcat:Catalog a všech ostatních členů dcat:Catalog. Tato třída nese vlastnosti společné všem katalogizovaným zdrojům včetně datových sad a datových služeb. Je silně doporučeno používat specifičtější podtřídy, pokud je to možné. Při popisu zdroje, který není ani dcat:Dataset, ani dcat:DataService se doporučuje vytvořit odpovídající podtřídu dcat:Resrouce a nebo použít dcat:Resource s vlastností dct:type pro určení konkrétního typu.@cs"
    #xsd/langString
     "dcat:Resource è un punto di estensione che consente la definizione di qualsiasi tipo di catalogo. Sottoclassi aggiuntive possono essere definite in un profilo DCAT o in un'applicazione per cataloghi di altri tipi di risorse.@it"
    #xsd/langString
     "La classe di tutte le risorse catalogate, la Superclasse di dcat:Dataset, dcat:DataService, dcat:Catalog e qualsiasi altro membro di dcat:Catalog. Questa classe porta proprietà comuni a tutte le risorse catalogate, inclusi set di dati e servizi dati. Si raccomanda vivamente di utilizzare una sottoclasse più specifica. Quando si descrive una risorsa che non è un dcat:Dataset o dcat:DataService, si raccomanda di creare una sottoclasse di dcat:Resource appropriata, o utilizzare dcat:Resource con la proprietà dct:type per indicare il tipo specifico.@it"
    #xsd/langString
     "The class of all catalogued resources, the Superclass of dcat:Dataset, dcat:DataService, dcat:Catalog and any other member of a dcat:Catalog. This class carries properties common to all catalogued resources, including datasets and data services. It is strongly recommended to use a more specific sub-class. When describing a resource which is not a dcat:Dataset or dcat:DataService, it is recommended to create a suitable sub-class of dcat:Resource, or use dcat:Resource with the dct:type property to indicate the specific type.@en"
    #xsd/langString
     "La clase de todos los recursos catalogados, la superclase de dcat:Dataset, dcat:DataService, dcat:Catalog y cualquier otro miembro de un dcat:Catalog. Esta clase tiene propiedades comunes a todos los recursos catalogados, incluyendo conjuntos de datos y servicios de datos. Se recomienda fuertemente que se use una clase más específica. Cuando se describe un recurso que no es un dcat:Dataset o dcat:DataService, se recomienda crear una sub-clase apropiada de dcat:Resource, o usar dcat:Resource con la propiedad dct:type to indicar el tipo específico.@es"
    #xsd/langString
     "dcat:Resource er et udvidelsespunkt der tillader oprettelsen af enhver type af kataloger. Yderligere subklasser kan defineres i en DCAT-profil eller i en applikation til kataloger med andre typer af ressourcer.@da"
    #xsd/langString
     "dcat:Resource is an extension point that enables the definition of any kind of catalog. Additional subclasses may be defined in a DCAT profile or application for catalogs of other kinds of resources.@en"]})

(def Role
  {:db/ident :dcat/Role,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Role je funkce zdroje či agenta ve vztahu k jinému zdroji, v kontextu přiřazení zdrojů či vztahů mezi zdroji.@cs"
    #xsd/langString
     "Un rol es la función de un recurso o agente con respecto a otro recuros, en el contexto de atribución del recurso o de las relaciones entre recursos.@es"
    #xsd/langString
     "A role is the function of a resource or agent with respect to another resource, in the context of resource attribution or resource relationships.@en"
    #xsd/langString
     "En rolle er den funktion en ressource eller aktør har i forhold til en anden ressource, i forbindelse med ressourcekreditering eller ressourcerelationer.@da"
    #xsd/langString
     "Un ruolo è la funzione di una risorsa o di un agente rispetto ad un'altra risorsa, nel contesto dell'attribuzione delle risorse o delle relazioni tra risorse.@it"],
   :rdfs/label [#xsd/langString "Rolle@da"
                #xsd/langString "Rol@es"
                #xsd/langString "Ruolo@it"
                #xsd/langString "Role@en"
                #xsd/langString "Role@cs"],
   :rdfs/seeAlso :dcat/hadRole,
   :rdfs/subClassOf :skos/Concept,
   :skos/changeNote [#xsd/langString "Nuova classe aggiunta in DCAT 2.0.@it"
                     #xsd/langString "Nueva clase agregada en DCAT 2.0.@es"
                     #xsd/langString "Ny klasse tilføjet i DCAT 2.0.@en"
                     #xsd/langString "Nová třída přidaná ve verzi DCAT 2.0.@cs"
                     #xsd/langString "New class added in DCAT 2.0.@en"],
   :skos/definition
   [#xsd/langString
     "Role je funkce zdroje či agenta ve vztahu k jinému zdroji, v kontextu přiřazení zdrojů či vztahů mezi zdroji.@cs"
    #xsd/langString
     "A role is the function of a resource or agent with respect to another resource, in the context of resource attribution or resource relationships.@en"
    #xsd/langString
     "Un ruolo è la funzione di una risorsa o di un agente rispetto ad un'altra risorsa, nel contesto dell'attribuzione delle risorse o delle relazioni tra risorse.@it"
    #xsd/langString
     "Un rol es la función de un recurso o agente con respecto a otro recuros, en el contexto de atribución del recurso o de las relaciones entre recursos.@es"
    #xsd/langString
     "En rolle er den funktion en ressource eller aktør har i forhold til en anden ressource, i forbindelse med ressourcekreditering eller ressourcerelationer.@da"],
   :skos/editorialNote
   [#xsd/langString
     "Introduced into DCAT to complement prov:Role (whose use is limited to roles in the context of an activity, as the range of prov:hadRole).@en"
    #xsd/langString
     "Introduceret i DCAT for at supplere prov:Role (hvis anvendelse er begrænset til roller i forbindelse med en aktivitet, som er rækkevidde for prov:hadRole).@da"
    #xsd/langString
     "Přidáno do DCAT pro doplnění třídy prov:Role (jejíž užití je omezeno na role v kontextu aktivit, jakožto obor hodnot vlastnosti prov:hadRole).@cs"
    #xsd/langString
     "Introdotta in DCAT per completare prov:Role (il cui uso è limitato ai ruoli nel contesto di un'attività, in conseguenza alla definizione del codominio di prov:hadRole).@it"
    #xsd/langString
     "Incluída en DCAT para complementar prov:Role (cuyo uso está limitado a roles en el contexto de una actividad, ya que es el rango es prov:hadRole).@es"],
   :skos/scopeNote
   [#xsd/langString
     "Se usa en una relación cualificada para especificar el rol de una Entidad con respecto a otra Entidad. Se recomienda que los valores se administren como los valores de un vocabulario controlado de roles de entidad como por ejemplo: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation; el esquema de metadatos de DataCite; MARC relators https://id.loc.gov/vocabulary/relators.@es"
    #xsd/langString
     "Used in a qualified-attribution to specify the role of an Agent with respect to an Entity. It is recommended that the values be managed as a controlled vocabulary of agent roles, such as http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@en"
    #xsd/langString
     "Anvendes i forbindelse med kvalificerede krediteringer til at angive aktørens rolle i forhold til en entitet. Det anbefales at værdierne styres som et kontrolleret udfaldsrum med aktørroller, såsom http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@da"
    #xsd/langString
     "Used in a qualified-relation to specify the role of an Entity with respect to another Entity. It is recommended that the values be managed as a controlled vocabulary of entity roles such as: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation;  DataCite metadata schema;  MARC relators https://id.loc.gov/vocabulary/relators.@en"
    #xsd/langString
     "Použito v kvalifikovaném přiřazení pro specifikaci role Agenta ve vztahu k Entitě. Je doporučeno množinu hodnot spravovat jako řízený slovník rolí agentů, jako například http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@cs"
    #xsd/langString
     "Se usa en una atribución cualificada para especificar el rol de un Agente con respecto a una Entidad. Se recomienda que los valores se administren como un vocabulario controlado de roles de agente, como por ejemplo http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@es"
    #xsd/langString
     "Utilizzato in un'attribuzione qualificata per specificare il ruolo di un agente rispetto a un'entità. Si consiglia di attribuire i valori considerando un vocabolario controllato dei ruoli dell'agente, ad esempio http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@it"
    #xsd/langString
     "Anvendes i forbindelse med kvalificerede relationer til at specificere en entitets rolle i forhold til en anden entitet. Det anbefales at værdierne styres med et kontrolleret udfaldsrum for for entitetsroller såsom: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation;  DataCite metadata schema;  MARC relators https://id.loc.gov/vocabulary/relators.@da"
    #xsd/langString
     "Utilizzato in una relazione qualificata per specificare il ruolo di un'entità rispetto a un'altra entità. Si raccomanda che il valore sia preso da un vocabolario controllato di ruoli di entità come ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, o MARC relators https://id.loc.gov/vocabulary/relators.@it"
    #xsd/langString
     "Použito v kvalifikovaném vztahu pro specifikaci role Entity ve vztahu k jiné Entitě. Je doporučeno množinu hodnot spravovat jako řízený slovník rolí entit, jako například ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, či MARC relators https://id.loc.gov/vocabulary/relators.@cs"]})

(def accessService
  {:db/ident :dcat/accessService,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "A site or end-point that gives access to the distribution of the dataset.@en"
    #xsd/langString
     "Un sito o end-point che dà accesso alla distribuzione del set di dati.@it"
    #xsd/langString
     "Un sitio o end-point que da acceso a la distribución de un conjunto de datos.@es"
    #xsd/langString
     "Umístění či přístupový bod zpřístupňující distribuci datové sady.@cs"
    #xsd/langString
     "Et websted eller endpoint der giver adgang til en repræsentation af datasættet.@da"],
   :rdfs/label [#xsd/langString "služba pro přístup k datům@cs"
                #xsd/langString "data access service@en"
                #xsd/langString "servicio de acceso de datos@es"
                #xsd/langString "dataadgangstjeneste@da"
                #xsd/langString "servizio di accesso ai dati@it"],
   :rdfs/range :dcat/DataService,
   :skos/changeNote
   [#xsd/langString "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
    #xsd/langString "New property added in DCAT 2.0.@en"
    #xsd/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
    #xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
    #xsd/langString "Nueva propiedad agregada en DCAT 2.0.@es"],
   :skos/definition
   [#xsd/langString
     "Umístění či přístupový bod zpřístupňující distribuci datové sady.@cs"
    #xsd/langString
     "Un sito o end-point che dà accesso alla distribuzione del set di dati.@it"
    #xsd/langString
     "Un sitio o end-point que da acceso a la distribución de un conjunto de datos.@es"
    #xsd/langString
     "Et websted eller endpoint der giver adgang til en repræsentation af datasættet.@da"
    #xsd/langString
     "A site or end-point that gives access to the distribution of the dataset.@en"]})

(def accessURL
  "adgangsURL"
  {:db/ident :dcat/accessURL,
   :owl/propertyChainAxiom [:dcat/accessService :dcat/endpointURL],
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#xsd/langString
     "A URL of a resource that gives access to a distribution of the dataset. E.g. landing page, feed, SPARQL endpoint. Use for all cases except a simple download link, in which case downloadURL is preferred.@en"
    #xsd/langString
     "Puede ser cualquier tipo de URL que de acceso a una distribución del conjunto de datos, e.g., página de destino, descarga, URL feed, punto de acceso SPARQL. Esta propriedad se debe usar cuando su catálogo de datos no tiene información sobre donde está o cuando no se puede descargar.@es"
    #xsd/langString
     "En URL for en ressource som giver adgang til en repræsentation af datsættet. Fx destinationsside, feed, SPARQL-endpoint. Anvendes i alle sammenhænge undtagen til angivelse af et simpelt download link hvor anvendelse af egenskaben downloadURL foretrækkes.@da"
    #xsd/langString
     "URL zdroje, přes které je přístupná distribuce datové sady. Příkladem může být vstupní stránka, RSS kanál či SPARQL endpoint. Použijte ve všech případech kromě URL souboru ke stažení, pro které je lepší použít dcat:downloadURL.@cs"
    #xsd/langString
     "Μπορεί να είναι οποιουδήποτε είδους URL που δίνει πρόσβαση στη διανομή ενός συνόλου δεδομένων. Π.χ. ιστοσελίδα αρχικής πρόσβασης, μεταφόρτωση, feed URL, σημείο διάθεσης SPARQL. Να χρησιμοποιείται όταν ο κατάλογος δεν περιέχει πληροφορίες εαν πρόκειται ή όχι για μεταφορτώσιμο αρχείο.@el"
    #xsd/langString
     "Un URL di una risorsa che consente di accedere a una distribuzione del set di dati. Per esempio, pagina di destinazione, feed, endpoint SPARQL. Da utilizzare per tutti i casi, tranne  quando  si tratta di un semplice link per il download nel qual caso è preferito downloadURL.@it"
    #xsd/langString
     "データセットの配信にアクセス権を与えるランディング・ページ、フィード、SPARQLエンドポイント、その他の種類の資源。@ja"
    #xsd/langString
     "Ceci peut être tout type d'URL qui donne accès à une distribution du jeu de données. Par exemple, un lien à une page HTML contenant un lien au jeu de données, un Flux RSS, un point d'accès SPARQL. Utilisez le lorsque votre catalogue ne contient pas d'information sur quoi il est ou quand ce n'est pas téléchargeable.@fr"
    #xsd/langString
     "أي رابط يتيح الوصول إلى البيانات. إذا كان الرابط هو ربط مباشر لملف يمكن تحميله استخدم الخاصية downloadURL@ar"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "přístupová adresa@cs"
                #xsd/langString "URL d'accès@fr"
                #xsd/langString "アクセスURL@ja"
                #xsd/langString "access address@en"
                #xsd/langString "URL πρόσβασης@el"
                #xsd/langString "رابط وصول@ar"
                #xsd/langString "URL de acceso@es"
                #xsd/langString "indirizzo di accesso@it"
                #xsd/langString "adgangsadresse@da"],
   :rdfs/range :rdfs/Resource,
   :skos/altLabel #xsd/langString "adgangsURL@da",
   :skos/definition
   [#xsd/langString
     "En URL for en ressource som giver adgang til en repræsentation af datsættet. Fx destinationsside, feed, SPARQL-endpoint. Anvendes i alle sammenhænge undtagen til angivelse af et simpelt download link hvor anvendelse af egenskaben downloadURL foretrækkes.@da"
    #xsd/langString
     "データセットの配信にアクセス権を与えるランディング・ページ、フィード、SPARQLエンドポイント、その他の種類の資源。@ja"
    #xsd/langString
     "A URL of a resource that gives access to a distribution of the dataset. E.g. landing page, feed, SPARQL endpoint. Use for all cases except a simple download link, in which case downloadURL is preferred.@en"
    #xsd/langString
     "Ceci peut être tout type d'URL qui donne accès à une distribution du jeu de données. Par exemple, un lien à une page HTML contenant un lien au jeu de données, un Flux RSS, un point d'accès SPARQL. Utilisez le lorsque votre catalogue ne contient pas d'information sur quoi il est ou quand ce n'est pas téléchargeable.@fr"
    #xsd/langString
     "Un URL di una risorsa che consente di accedere a una distribuzione del set di dati. Per esempio, pagina di destinazione, feed, endpoint SPARQL. Da utilizzare per tutti i casi, tranne  quando  si tratta di un semplice link per il download nel qual caso è preferito downloadURL.@it"
    #xsd/langString
     "Μπορεί να είναι οποιουδήποτε είδους URL που δίνει πρόσβαση στη διανομή ενός συνόλου δεδομένων. Π.χ. ιστοσελίδα αρχικής πρόσβασης, μεταφόρτωση, feed URL, σημείο διάθεσης SPARQL. Να χρησιμοποιείται όταν ο κατάλογος δεν περιέχει πληροφορίες εαν πρόκειται ή όχι για μεταφορτώσιμο αρχείο.@el"
    #xsd/langString
     "Puede ser cualquier tipo de URL que de acceso a una distribución del conjunto de datos, e.g., página de destino, descarga, URL feed, punto de acceso SPARQL. Esta propriedad se debe usar cuando su catálogo de datos no tiene información sobre donde está o cuando no se puede descargar.@es"
    #xsd/langString
     "URL zdroje, přes které je přístupná distribuce datové sady. Příkladem může být vstupní stránka, RSS kanál či SPARQL endpoint. Použijte ve všech případech kromě URL souboru ke stažení, pro které je lepší použít dcat:downloadURL.@cs"
    #xsd/langString
     "أي رابط يتيح الوصول إلى البيانات. إذا كان الرابط هو ربط مباشر لملف يمكن تحميله استخدم الخاصية downloadURL@ar"],
   :skos/editorialNote
   [#xsd/langString
     "rdfs:label, rdfs:comment and skos:scopeNote have been modified. Non-english versions except for Italian must be updated.@en"
    #xsd/langString
     "Status: English Definition text modified by DCAT revision team, updated Italian and Czech translation provided, translations for other languages pending.@en"],
   :skos/scopeNote
   [#xsd/langString
     "Se le distribuzioni sono accessibili solo attraverso una pagina web (ad esempio, gli URL per il download diretto non sono noti), allora il link della pagina web deve essere duplicato come accessURL sulla distribuzione.@it"
    #xsd/langString
     "Hvis en eller flere distributioner kun er tilgængelige via en destinationsside (dvs. en URL til direkte download er ikke kendt), så bør destinationssidelinket gentages som adgangsadresse for distributionen.@da"
    #xsd/langString
     "Pokud jsou distribuce přístupné pouze přes vstupní stránku (tj. URL pro přímé stažení nejsou známa), pak by URL přístupové stránky mělo být duplikováno ve vlastnosti distribuce accessURL.@cs"
    #xsd/langString
     "El rango es una URL. Si la distribución es accesible solamente través de una página de destino (es decir, si no se conoce una URL de descarga directa), entonces el enlance a la página de destino debe ser duplicado como accessURL en la distribución.@es"
    #xsd/langString
     "Η τιμή είναι ένα URL. Αν η/οι διανομή/ές είναι προσβάσιμη/ες μόνο μέσω μίας ιστοσελίδας αρχικής πρόσβασης (δηλαδή αν δεν υπάρχουν γνωστές διευθύνσεις άμεσης μεταφόρτωσης), τότε ο σύνδεσμος της ιστοσελίδας αρχικής πρόσβασης πρέπει να αναπαραχθεί ως accessURL σε μία διανομή.@el"
    #xsd/langString
     "La valeur est une URL. Si la distribution est accessible seulement au travers d'une page d'atterrissage (c-à-dire on n'ignore une URL de téléchargement direct), alors le lien à la page d'atterrissage doit être dupliqué comee accessURL sur la distribution.@fr"
    #xsd/langString
     "確実にダウンロードでない場合や、ダウンロードかどうかが不明である場合は、downloadURLではなく、accessURLを用いてください。ランディング・ページを通じてしか配信にアクセスできない場合（つまり、直接的なダウンロードURLが不明）は、配信におけるaccessURLとしてランディング・ページのリンクをコピーすべきです（SHOULD）。@ja"
    #xsd/langString
     "If the distribution(s) are accessible only through a landing page (i.e. direct download URLs are not known), then the landing page link should be duplicated as accessURL on a distribution.@en"]})

(def bbox
  {:db/ident :dcat/bbox,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/domain :dcterms/Location,
   :rdfs/label [#xsd/langString "bounding box@da"
                #xsd/langString "bounding box@en"
                #xsd/langString "cuadro delimitador@es"
                #xsd/langString "ohraničení oblasti@cs"
                #xsd/langString "quadro di delimitazione@it"],
   :rdfs/range :rdfs/Literal,
   :skos/changeNote
   [#xsd/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
    #xsd/langString "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
    #xsd/langString "Propiedad nueva agregada en DCAT 2.0.@es"
    #xsd/langString "New property added in DCAT 2.0.@en"
    #xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"],
   :skos/definition
   [#xsd/langString "Den geografiske omskrevne firkant af en ressource.@da"
    #xsd/langString "Il riquadro di delimitazione geografica di una risorsa.@it"
    #xsd/langString "Ohraničení geografické oblasti zdroje.@cs"
    #xsd/langString "El cuadro delimitador geográfico para un recurso.@es"
    #xsd/langString "The geographic bounding box of a resource.@en"],
   :skos/scopeNote
   [#xsd/langString
     "El rango de esta propiedad es intencionalmente genérico con el propósito de permitir distintas codificaciones geométricas. Por ejemplo, la geometría puede ser codificada como WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL]).@es"
    #xsd/langString
     "The range of this property is intentionally generic, with the purpose of allowing different geometry encodings. E.g., the geometry could be encoded with as WKT (geosparql:wktLiteral [GeoSPARQL]) or [GML] (geosparql:asGML [GeoSPARQL]).@en"
    #xsd/langString
     "Il range di questa proprietà è volutamente generica, con lo scopo di consentire diverse codifiche geometriche. Ad esempio, la geometria potrebbe essere codificata con WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL]).@it"
    #xsd/langString
     "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé kódování geometrií. Geometrie by kupříkladu mohla být kódována jako WKT (geosparql:wktLiteral [GeoSPARQL]) či [GML] (geosparql:asGML [GeoSPARQL]).@cs"
    #xsd/langString
     "Rækkevidden for denne egenskab er bevidst generisk defineret med det formål at tillade forskellige kodninger af geometrier. Geometrien kan eksempelvis repræsenteres som WKT (geosparql:asWKT [GeoSPARQL]) eller [GML] (geosparql:asGML [GeoSPARQL]).@da"]})

(def byteSize
  {:db/ident :dcat/byteSize,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   [#xsd/langString "الحجم بالبايتات @ar"
    #xsd/langString "Το μέγεθος μιας διανομής σε bytes.@el"
    #xsd/langString "The size of a distribution in bytes.@en"
    #xsd/langString "Velikost distribuce v bajtech.@cs"
    #xsd/langString "バイトによる配信のサイズ。@ja"
    #xsd/langString "La taille de la distribution en octects@fr"
    #xsd/langString "Størrelsen af en distributionen angivet i bytes.@da"
    #xsd/langString "La dimensione di una distribuzione in byte.@it"
    #xsd/langString "El tamaño de una distribución en bytes.@es"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "μέγεθος σε bytes@el"
                #xsd/langString "velikost v bajtech@cs"
                #xsd/langString "byte size@en"
                #xsd/langString "tamaño en bytes@es"
                #xsd/langString "dimensione in byte@it"
                #xsd/langString "الحجم بالبايت@ar"
                #xsd/langString "バイト・サイズ@ja"
                #xsd/langString "taille en octects@fr"
                #xsd/langString "bytestørrelse@da"],
   :rdfs/range :rdfs/Literal,
   :skos/definition
   [#xsd/langString "Το μέγεθος μιας διανομής σε bytes.@el"
    #xsd/langString "Størrelsen af en distribution angivet i bytes.@da"
    #xsd/langString "الحجم بالبايتات @ar"
    #xsd/langString "El tamaño de una distribución en bytes.@es"
    #xsd/langString "Velikost distribuce v bajtech.@cs"
    #xsd/langString "La dimensione di una distribuzione in byte.@it"
    #xsd/langString "The size of a distribution in bytes.@en"
    #xsd/langString "La taille de la distribution en octects.@fr"
    #xsd/langString "バイトによる配信のサイズ。@ja"],
   :skos/scopeNote
   [#xsd/langString
     "Το μέγεθος σε bytes μπορεί να προσεγγιστεί όταν η ακριβής τιμή δεν είναι γνωστή. Η τιμή της dcat:byteSize θα πρέπει να δίνεται με τύπο δεδομένων xsd:decimal.@el"
    #xsd/langString
     "الحجم يمكن أن يكون تقريبي إذا كان الحجم الدقيق غير معروف@ar"
    #xsd/langString
     "Bytestørrelsen kan approximeres hvis den præcise størrelse ikke er kendt. Værdien af dcat:byteSize bør angives som xsd:decimal.@da"
    #xsd/langString
     "Velikost v bajtech může být přibližná, pokud její přesná hodnota není známa. Literál s hodnotou dcat:byteSize by měl mít datový typ xsd:decimal.@cs"
    #xsd/langString
     "El tamaño en bytes puede ser aproximado cuando se desconoce el tamaño exacto. El valor literal de dcat:byteSize debe tener tipo 'xsd:decimal'.@es"
    #xsd/langString "正確なサイズが不明である場合、サイズは、バイトによる近似値を示すことができます。@ja"
    #xsd/langString
     "La taille en octects peut être approximative lorsque l'on ignore la taille réelle. La valeur littérale de dcat:byteSize doit être de type xsd:decimal.@fr"
    #xsd/langString
     "The size in bytes can be approximated when the precise size is not known. The literal value of dcat:byteSize should by typed as xsd:decimal.@en"
    #xsd/langString
     "La dimensione in byte può essere approssimata quando non si conosce la dimensione precisa. Il valore di dcat:byteSize dovrebbe essere espresso come un xsd:decimal.@it"]})

(def catalog
  "har delkatalog"
  {:db/ident :dcat/catalog,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Un catálogo cuyo contenido es de interés en el contexto del catálogo que está siendo descripto.@es"
    #xsd/langString
     "Un catalogo i cui contenuti sono di interesse nel contesto di questo catalogo.@it"
    #xsd/langString
     "Et katalog hvis indhold er relevant i forhold til det aktuelle katalog.@da"
    #xsd/langString
     "Katalog, jehož obsah je v kontextu tohoto katalogu zajímavý.@cs"
    #xsd/langString
     "A catalog whose contents are of interest in the context of this catalog.@en"],
   :rdfs/domain :dcat/Catalog,
   :rdfs/label [#xsd/langString "catálogo@es"
                #xsd/langString "catalogo@it"
                #xsd/langString "katalog@da"
                #xsd/langString "katalog@cs"
                #xsd/langString "catalog@en"],
   :rdfs/range :dcat/Catalog,
   :rdfs/subPropertyOf [:rdfs/member :dcterms/hasPart],
   :skos/altLabel #xsd/langString "har delkatalog@da",
   :skos/changeNote [#xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #xsd/langString "New property added in DCAT 2.0.@en"
                     #xsd/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #xsd/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"],
   :skos/definition
   [#xsd/langString
     "Un catalogo i cui contenuti sono di interesse nel contesto di questo catalogo.@it"
    #xsd/langString
     "Katalog, jehož obsah je v kontextu tohoto katalogu zajímavý.@cs"
    #xsd/langString
     "Et katalog hvis indhold er relevant i forhold til det aktuelle katalog.@da"
    #xsd/langString
     "Un catálogo cuyo contenido es de interés en el contexto del catálogo que está siendo descripto.@es"
    #xsd/langString
     "A catalog whose contents are of interest in the context of this catalog.@en"]})

(def centroid
  "centroide"
  {:db/ident :dcat/centroid,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :dcterms/Location,
   :rdfs/label [#xsd/langString "centroide@es"
                #xsd/langString "centroide@it"
                #xsd/langString "centroid@en"
                #xsd/langString "centroid@cs"
                #xsd/langString "geometrisk tyngdepunkt@da"],
   :rdfs/range :rdfs/Literal,
   :skos/altLabel #xsd/langString "centroide@da",
   :skos/changeNote [#xsd/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
                     #xsd/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #xsd/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #xsd/langString "New property added in DCAT 2.0.@en"],
   :skos/definition
   [#xsd/langString "Il centro geografico (centroide) di una risorsa.@it"
    #xsd/langString "Geografický střed (centroid) zdroje.@cs"
    #xsd/langString "Det geometrisk tyngdepunkt (centroid) for en ressource.@da"
    #xsd/langString "El centro geográfico (centroide) de un recurso.@es"
    #xsd/langString "The geographic center (centroid) of a resource.@en"],
   :skos/scopeNote
   [#xsd/langString
     "Rækkevidden for denne egenskab er bevidst generisk definere med det formål at tillade forskellige geokodninger. Geometrien kan eksempelvis repræsenteres som WKT (geosparql:asWKT [GeoSPARQL]) eller [GML] (geosparql:asGML [GeoSPARQL]).@da"
    #xsd/langString
     "The range of this property is intentionally generic, with the purpose of allowing different geometry encodings. E.g., the geometry could be encoded with as WKT (geosparql:wktLiteral [GeoSPARQL]) or [GML] (geosparql:asGML [GeoSPARQL]).@en"
    #xsd/langString
     "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé kódování geometrií. Geometrie by kupříkladu mohla být kódována jako WKT (geosparql:wktLiteral [GeoSPARQL]) či [GML] (geosparql:asGML [GeoSPARQL]).@cs"
    #xsd/langString
     "El rango de esta propiedad es intencionalmente genérico con el objetivo de permitir distintas codificaciones geométricas. Por ejemplo, la geometría puede codificarse como WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL]).@es"
    #xsd/langString
     "Il range di questa proprietà è volutamente generica, con lo scopo di consentire diverse codifiche geometriche. Ad esempio, la geometria potrebbe essere codificata con WKT (geosparql:wktLiteral [GeoSPARQL]) o [GML] (geosparql:asGML [GeoSPARQL]).@it"]})

(def compressFormat
  {:db/ident :dcat/compressFormat,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#xsd/langString
     "Il formato di compressione della distribuzione nel quale i dati sono in forma compressa, ad es. per ridurre le dimensioni del file da scaricare.@it"
    #xsd/langString
     "Formát komprese souboru, ve kterém jsou data poskytována v komprimované podobě, např. ke snížení velikosti souboru ke stažení.@cs"
    #xsd/langString
     "The compression format of the distribution in which the data is contained in a compressed form, e.g. to reduce the size of the downloadable file.@en"
    #xsd/langString
     "Kompressionsformatet for distributionen som indeholder data i et komprimeret format, fx for at reducere størrelsen af downloadfilen.@da"
    #xsd/langString
     "El formato de la distribución en el que los datos están en forma comprimida, e.g. para reducir el tamaño del archivo a bajar.@es"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/TR/vocab-dcat-2/"},
   :rdfs/label [#xsd/langString "compression format@en"
                #xsd/langString "kompressionsformat@da"
                #xsd/langString "formato de compresión@es"
                #xsd/langString "formato di compressione@it"
                #xsd/langString "formát komprese@cs"],
   :rdfs/range :dcterms/MediaType,
   :rdfs/subPropertyOf :dcterms/format,
   :skos/changeNote [#xsd/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
                     #xsd/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #xsd/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #xsd/langString "New property added in DCAT 2.0.@en"],
   :skos/definition
   [#xsd/langString
     "Kompressionsformatet for distributionen som indeholder data i et komprimeret format, fx for at reducere størrelsen af downloadfilen.@da"
    #xsd/langString
     "Formát komprese souboru, ve kterém jsou data poskytována v komprimované podobě, např. ke snížení velikosti souboru ke stažení.@cs"
    #xsd/langString
     "El formato de la distribución en el que los datos están en forma comprimida, e.g. para reducir el tamaño del archivo a bajar.@es"
    #xsd/langString
     "Il formato di compressione della distribuzione nel quale i dati sono in forma compressa, ad es. per ridurre le dimensioni del file da scaricare.@it"
    #xsd/langString
     "The compression format of the distribution in which the data is contained in a compressed form, e.g. to reduce the size of the downloadable file.@en"],
   :skos/scopeNote
   [#xsd/langString
     "Questa proprietà deve essere utilizzata quando i file nella distribuzione sono compressi, ad es. in un file ZIP. Il formato DOVREBBE essere espresso usando un tipo di media come definito dal registro dei tipi di media IANA https://www.iana.org/assignments/media-types/, se disponibile.@it"
    #xsd/langString
     "Denne egenskab kan anvendes når filerne i en distribution er blevet komprimeret, fx i en ZIP-fil. Formatet BØR udtrykkes ved en medietype som defineret i 'IANA media types registry', hvis der optræder en relevant medietype dér: https://www.iana.org/assignments/media-types/.@da"
    #xsd/langString
     "This property is to be used when the files in the distribution are compressed, e.g. in a ZIP file. The format SHOULD be expressed using a media type as defined by IANA media types registry https://www.iana.org/assignments/media-types/, if available.@en"
    #xsd/langString
     "Tato vlastnost se použije, když jsou soubory v distribuci komprimovány, např. v ZIP souboru. Formát BY MĚL být vyjádřen pomocí typu média definovaného v registru IANA https://www.iana.org/assignments/media-types/, pokud existuje.@cs"
    #xsd/langString
     "Esta propiedad se debe usar cuando los archivos de la distribución están comprimidos, por ejemplo en un archivo ZIP. El formato DEBERÍA expresarse usando un 'media type', tales como los definidos en el registro IANA de 'media types' https://www.iana.org/assignments/media-types/, si está disponibles.@es"]})

(def contactPoint
  {:db/ident :dcat/contactPoint,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#xsd/langString
     "Relevante kontaktoplysninger for den katalogiserede ressource. Anvendelse af vCard anbefales.@da"
    #xsd/langString
     "Relevant contact information for the catalogued resource. Use of vCard is recommended.@en"
    #xsd/langString
     "Relie un jeu de données à une information de contact utile en utilisant VCard.@fr"
    #xsd/langString
     "Información relevante de contacto para el recurso catalogado. Se recomienda el uso de vCard.@es"
    #xsd/langString
     "Informazioni di contatto rilevanti per la risorsa catalogata. Si raccomanda l'uso di vCard.@it"
    #xsd/langString "データセットを、VCardを用いて提供されている適切な連絡先情報にリンクします。@ja"
    #xsd/langString "تربط قائمة البيانات بعنوان اتصال موصف  باستخدام VCard@ar"
    #xsd/langString
     "Συνδέει ένα σύνολο δεδομένων με ένα σχετικό σημείο επικοινωνίας, μέσω VCard.@el"
    #xsd/langString
     "Relevantní kontaktní informace pro katalogizovaný zdroj. Doporučuje se použít slovník VCard.@cs"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "point de contact@fr"
                #xsd/langString "عنوان اتصال@ar"
                #xsd/langString "窓口@ja"
                #xsd/langString "contact point@en"
                #xsd/langString "σημείο επικοινωνίας@el"
                #xsd/langString "kontaktní bod@cs"
                #xsd/langString "punto di contatto@it"
                #xsd/langString "Punto de contacto@es"
                #xsd/langString "kontaktpunkt@da"],
   :rdfs/range :vcard/Kind,
   :skos/definition
   [#xsd/langString
     "Relie un jeu de données à une information de contact utile en utilisant VCard.@fr"
    #xsd/langString
     "Informazioni di contatto rilevanti per la risorsa catalogata. Si raccomanda l'uso di vCard.@it"
    #xsd/langString
     "Συνδέει ένα σύνολο δεδομένων με ένα σχετικό σημείο επικοινωνίας, μέσω VCard.@el"
    #xsd/langString
     "Relevant contact information for the catalogued resource. Use of vCard is recommended.@en"
    #xsd/langString
     "Información relevante de contacto para el recurso catalogado. Se recomienda el uso de vCard.@es"
    #xsd/langString "データセットを、VCardを用いて提供されている適切な連絡先情報にリンクします。@ja"
    #xsd/langString
     "Relevante kontaktoplysninger for den katalogiserede ressource. Anvendelse af vCard anbefales.@da"
    #xsd/langString "تربط قائمة البيانات بعنوان اتصال موصف  باستخدام VCard@ar"
    #xsd/langString
     "Relevantní kontaktní informace pro katalogizovaný zdroj. Doporučuje se použít slovník VCard.@cs"],
   :skos/editorialNote
   #xsd/langString
    "Status: English Definition text modified by DCAT revision team, Italian, Spanish and Czech translations provided, other translations pending.@en"})

(def dataset
  {:db/ident :dcat/dataset,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#xsd/langString "Kolekce dat, která je katalogizována v katalogu.@cs"
    #xsd/langString "Una raccolta di dati che è elencata nel catalogo.@it"
    #xsd/langString "Un conjunto de datos que se lista en el catálogo.@es"
    #xsd/langString "En samling af data som er opført i kataloget.@da"
    #xsd/langString "تربط الفهرس بقائمة بيانات ضمنه@ar"
    #xsd/langString "A collection of data that is listed in the catalog.@en"
    #xsd/langString "カタログの一部であるデータセット。@ja"
    #xsd/langString
     "Relie un catalogue à un jeu de données faisant partie de ce catalogue.@fr"
    #xsd/langString
     "Συνδέει έναν κατάλογο με ένα σύνολο δεδομένων το οποίο ανήκει στον εν λόγω κατάλογο.@el"],
   :rdfs/domain :dcat/Catalog,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "σύνολο δεδομένων@el"
                #xsd/langString "قائمة بيانات@ar"
                #xsd/langString "conjunto de datos@es"
                #xsd/langString "datová sada@cs"
                #xsd/langString "dataset@it"
                #xsd/langString "dataset@en"
                #xsd/langString "jeu de données@fr"
                #xsd/langString "データセット@ja"
                #xsd/langString "datasæt@da"],
   :rdfs/range :dcat/Dataset,
   :rdfs/subPropertyOf [:rdfs/member :dcterms/hasPart],
   :skos/altLabel [#xsd/langString "har datasæt@da"
                   #xsd/langString "datasamling@da"],
   :skos/definition
   [#xsd/langString
     "Συνδέει έναν κατάλογο με ένα σύνολο δεδομένων το οποίο ανήκει στον εν λόγω κατάλογο.@el"
    #xsd/langString "カタログの一部であるデータセット。@ja"
    #xsd/langString
     "Relie un catalogue à un jeu de données faisant partie de ce catalogue.@fr"
    #xsd/langString "Kolekce dat, která je katalogizována v katalogu.@cs"
    #xsd/langString "Una raccolta di dati che è elencata nel catalogo.@it"
    #xsd/langString "تربط الفهرس بقائمة بيانات ضمنه@ar"
    #xsd/langString "A collection of data that is listed in the catalog.@en"
    #xsd/langString "En samling af data som er opført i kataloget.@da"
    #xsd/langString "Un conjunto de datos que se lista en el catálogo.@es"],
   :skos/editorialNote
   #xsd/langString
    "Status: English Definition text modified by DCAT revision team, Italian, Spanish and Czech translation provided, other translations pending.@en"})

(def distribution
  "har distribution"
  {:db/ident :dcat/distribution,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#xsd/langString
     "Connecte un jeu de données à des distributions disponibles.@fr"
    #xsd/langString "Una distribución disponible del conjunto de datos.@es"
    #xsd/langString "An available distribution of the dataset.@en"
    #xsd/langString "En tilgængelig repræsentation af datasættet.@da"
    #xsd/langString "Una distribuzione disponibile per il set di dati.@it"
    #xsd/langString
     "تربط قائمة البيانات بطريقة أو بشكل يسمح  الوصول الى البيانات@ar"
    #xsd/langString "データセットを、その利用可能な配信に接続します。@ja"
    #xsd/langString "Dostupná distribuce datové sady.@cs"
    #xsd/langString
     "Συνδέει ένα σύνολο δεδομένων με μία από τις διαθέσιμες διανομές του.@el"],
   :rdfs/domain :dcat/Dataset,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "データセット配信@ja"
                #xsd/langString "distribution@da"
                #xsd/langString "distribution@fr"
                #xsd/langString "distribution@en"
                #xsd/langString "distribuzione@it"
                #xsd/langString "διανομή@el"
                #xsd/langString "توزيع@ar"
                #xsd/langString "distribución@es"
                #xsd/langString "distribuce@cs"],
   :rdfs/range :dcat/Distribution,
   :rdfs/subPropertyOf :dcterms/relation,
   :skos/altLabel #xsd/langString "har distribution@da",
   :skos/definition
   [#xsd/langString
     "Συνδέει ένα σύνολο δεδομένων με μία από τις διαθέσιμες διανομές του.@el"
    #xsd/langString
     "Connecte un jeu de données à des distributions disponibles.@fr"
    #xsd/langString "Una distribución disponible del conjunto de datos.@es"
    #xsd/langString "データセットを、その利用可能な配信に接続します。@ja"
    #xsd/langString
     "تربط قائمة البيانات بطريقة أو بشكل يسمح  الوصول الى البيانات@ar"
    #xsd/langString "En tilgængelig repræsentation af datasættet.@da"
    #xsd/langString "Una distribuzione disponibile per il set di dati.@it"
    #xsd/langString "An available distribution of the dataset.@en"
    #xsd/langString "Dostupná distribuce datové sady.@cs"],
   :skos/editorialNote
   #xsd/langString
    "Status: English Definition text modified by DCAT revision team, translations pending (except for Italian, Spanish and Czech).@en"})

(def downloadURL
  {:db/ident :dcat/downloadURL,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#xsd/langString
     "URL til fil der kan downloades i et bestemt format. Fx en CSV-fil eller en RDF-fil. Formatet for distributionen angives ved hjælp af egenskaberne dct:format og/eller dcat:mediaType.@da"
    #xsd/langString
     "The URL of the downloadable file in a given format. E.g. CSV file or RDF file. The format is indicated by the distribution's dct:format and/or dcat:mediaType.@en"
    #xsd/langString
     "Ceci est un lien direct à un fichier téléchargeable en un format donnée. Exple fichier CSV ou RDF. Le format est décrit par les propriétés de distribution dct:format et/ou dcat:mediaType.@fr"
    #xsd/langString
     "La URL de un archivo descargable en el formato dato. Por ejemplo, archivo CSV o archivo RDF. El formato se describe con las propiedades de la distribución dct:format y/o dcat:mediaType.@es"
    #xsd/langString
     "Questo è un link diretto al file scaricabile in un dato formato. E.g. un file CSV o un file RDF. Il formato è descritto dal dct:format e/o dal dcat:mediaType della distribuzione.@it"
    #xsd/langString
     "URL souboru ke stažení v daném formátu, například CSV nebo RDF soubor. Formát je popsán vlastností distribuce dct:format a/nebo dcat:mediaType.@cs"
    #xsd/langString
     "dcat:downloadURLはdcat:accessURLの特定の形式です。しかし、DCATプロファイルが非ダウンロード・ロケーションに対してのみaccessURLを用いる場合には、より強い分離を課すことを望む可能性があるため、この含意を強化しないように、DCATは、dcat:downloadURLをdcat:accessURLのサブプロパティーであると定義しません。@ja"
    #xsd/langString
     "Είναι ένας σύνδεσμος άμεσης μεταφόρτωσης ενός αρχείου σε μια δεδομένη μορφή. Π.χ. ένα αρχείο CSV ή RDF. Η μορφη αρχείου περιγράφεται από τις ιδιότητες dct:format ή/και dcat:mediaType της διανομής.@el"
    #xsd/langString
     "رابط مباشر لملف يمكن تحميله. نوع الملف يتم توصيفه باستخدام الخاصية dct:format dcat:mediaType @ar"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "downloadURL@da"
                #xsd/langString "URL de descarga@es"
                #xsd/langString "رابط تحميل@ar"
                #xsd/langString "ダウンロードURL@ja"
                #xsd/langString "URL di scarico@it"
                #xsd/langString "download URL@en"
                #xsd/langString "URL souboru ke stažení@cs"
                #xsd/langString "URL μεταφόρτωσης@el"
                #xsd/langString "URL de téléchargement@fr"],
   :rdfs/range :rdfs/Resource,
   :skos/definition
   [#xsd/langString
     "Ceci est un lien direct à un fichier téléchargeable en un format donnée. Exple fichier CSV ou RDF. Le format est décrit par les propriétés de distribution dct:format et/ou dcat:mediaType.@fr"
    #xsd/langString
     "dcat:downloadURLはdcat:accessURLの特定の形式です。しかし、DCATプロファイルが非ダウンロード・ロケーションに対してのみaccessURLを用いる場合には、より強い分離を課すことを望む可能性があるため、この含意を強化しないように、DCATは、dcat:downloadURLをdcat:accessURLのサブプロパティーであると定義しません。@ja"
    #xsd/langString
     "Questo è un link diretto al file scaricabile in un dato formato. E.g. un file CSV o un file RDF. Il formato è descritto dal dct:format e/o dal dcat:mediaType della distribuzione.@it"
    #xsd/langString
     "The URL of the downloadable file in a given format. E.g. CSV file or RDF file. The format is indicated by the distribution's dct:format and/or dcat:mediaType.@en"
    #xsd/langString
     "رابط مباشر لملف يمكن تحميله. نوع الملف يتم توصيفه باستخدام الخاصية dct:format dcat:mediaType @ar"
    #xsd/langString
     "URL souboru ke stažení v daném formátu, například CSV nebo RDF soubor. Formát je popsán vlastností distribuce dct:format a/nebo dcat:mediaType.@cs"
    #xsd/langString
     "Είναι ένας σύνδεσμος άμεσης μεταφόρτωσης ενός αρχείου σε μια δεδομένη μορφή. Π.χ. ένα αρχείο CSV ή RDF. Η μορφη αρχείου περιγράφεται από τις ιδιότητες dct:format ή/και dcat:mediaType της διανομής.@el"
    #xsd/langString
     "URL til fil der kan downloades i et bestemt format. Fx en CSV-fil eller en RDF-fil. Formatet for distributionen angives ved hjælp af egenskaberne dct:format og/eller dcat:mediaType.@da"
    #xsd/langString
     "La URL de un archivo descargable en el formato dato. Por ejemplo, archivo CSV o archivo RDF. El formato se describe con las propiedades de la distribución dct:format y/o dcat:mediaType.@es"],
   :skos/editorialNote
   [#xsd/langString
     "Status: English  Definition text modified by DCAT revision team, Italian, Spanish and Czech translation updated, other translations pending.@en"
    #xsd/langString
     "rdfs:label, rdfs:comment and/or skos:scopeNote have been modified. Non-english versions must be updated.@en"],
   :skos/scopeNote
   [#xsd/langString "La valeur est une URL.@fr"
    #xsd/langString
     "dcat:downloadURL SHOULD be used for the address at which this distribution is available directly, typically through a HTTP Get request.@en"
    #xsd/langString
     "dcat:downloadURL BY MĚLA být použita pro adresu, ze které je distribuce přímo přístupná, typicky skrze požadavek HTTP Get.@cs"
    #xsd/langString
     "dcat:downloadURL DOVREBBE essere utilizzato per l'indirizzo a cui questa distribuzione è disponibile direttamente, in genere attraverso una richiesta Get HTTP.@it"
    #xsd/langString "El valor es una URL.@es"
    #xsd/langString
     "dcat:downloadURL BØR anvendes til angivelse af den adresse hvor distributionen er tilgængelig direkte, typisk gennem et HTTP Get request.@da"
    #xsd/langString "Η τιμή είναι ένα URL.@el"]})

(def endDate
  "sluttidspunkt"
  {:db/ident :dcat/endDate,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/domain :dcterms/PeriodOfTime,
   :rdfs/label [#xsd/langString "data di fine@it"
                #xsd/langString "datum konce@cs"
                #xsd/langString "slutdato@da"
                #xsd/langString "end date@en"
                #xsd/langString "fecha final@es"],
   :rdfs/range :rdfs/Literal,
   :skos/altLabel #xsd/langString "sluttidspunkt@da",
   :skos/changeNote [#xsd/langString "New property added in DCAT 2.0.@en"
                     #xsd/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #xsd/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #xsd/langString "Ny egenskab i DCAT 2.0.@da"],
   :skos/definition [#xsd/langString "El fin del período.@es"
                     #xsd/langString "Slutningen på perioden.@da"
                     #xsd/langString "La fine del periodo.@it"
                     #xsd/langString "Konec doby trvání.@cs"
                     #xsd/langString "The end of the period.@en"],
   :skos/scopeNote
   [#xsd/langString
     "La range di questa proprietà è volutamente generico, con lo scopo di consentire diversi livelli di precisione temporale per specificare la fine di un periodo. Ad esempio, può essere espresso con una data (xsd:date), una data e un'ora (xsd:dateTime), o un anno (xsd:gYear).@it"
    #xsd/langString
     "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé úrovně časového rozlišení pro specifikaci konce doby trvání. Ten může být kupříkladu vyjádřen datumem (xsd:date), datumem a časem (xsd:dateTime) či rokem (xsd:gYear).@cs"
    #xsd/langString
     "Rækkeviden for denne egenskab er bevidst generisk defineret med det formål at tillade forskellige niveauer af tidslig præcision ifm. angivelse af slutdatoen for en periode. Den kan eksempelvis udtrykkes som en dato (xsd:date), en dato og et tidspunkt (xsd:dateTime), eller et årstal (xsd:gYear).@da"
    #xsd/langString
     "El rango de esta propiedad es intencionalmente genérico con el propósito de permitir distintos niveles de precisión temporal para especificar el fin del período. Por ejemplo, puede expresarse como una fecha (xsd:date), una fecha y un tiempo (xsd:dateTime), o un año (xsd:gYear).@es"
    #xsd/langString
     "The range of this property is intentionally generic, with the purpose of allowing different level of temporal precision for specifying the end of a period. E.g., it can be expressed with a date (xsd:date), a date and time (xsd:dateTime), or a year (xsd:gYear).@en"]})

(def endpointDescription
  {:db/ident :dcat/endpointDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "En beskrivelse af det pågældende tjenesteendpoint, inklusiv dets operationer, parametre etc.@da"
    #xsd/langString
     "Una descripción del end-point del servicio, incluyendo sus operaciones, parámetros, etc.@es"
    #xsd/langString
     "Una descrizione dell'endpoint del servizio, incluse le sue operazioni, parametri, ecc.@it"
    #xsd/langString
     "A description of the service end-point, including its operations, parameters etc.@en"
    #xsd/langString
     "Popis přístupového bodu služby včetně operací, parametrů apod.@cs"],
   :rdfs/domain :dcat/DataService,
   :rdfs/label [#xsd/langString "endpointbeskrivelse@da"
                #xsd/langString "descripción del end-point del servicio@es"
                #xsd/langString "description of service end-point@en"
                #xsd/langString "popis přístupového bodu služby@cs"
                #xsd/langString "descrizione dell'endpoint del servizio@it"],
   :skos/changeNote [#xsd/langString "Nuova proprietà in DCAT 2.0.@it"
                     #xsd/langString "Nueva propiedad agregada en DCAT 2.0.@en"
                     #xsd/langString "Ny egenskab i DCAT 2.0.@da"
                     #xsd/langString "New property in DCAT 2.0.@en"
                     #xsd/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"],
   :skos/definition
   [#xsd/langString
     "A description of the service end-point, including its operations, parameters etc.@en"
    #xsd/langString
     "Una descrizione dell'endpoint del servizio, incluse le sue operazioni, parametri, ecc.@it"
    #xsd/langString
     "En beskrivelse af det pågældende tjenesteendpoint, inklusiv dets operationer, parametre etc.@da"
    #xsd/langString
     "Una descripción del end-point del servicio, incluyendo sus operaciones, parámetros, etc..@es"
    #xsd/langString
     "Popis přístupového bodu služby včetně operací, parametrů apod.@cs"],
   :skos/scopeNote
   [#xsd/langString
     "Una descrizione dell'endpoint può essere espressa in un formato leggibile dalla macchina, come una descrizione OpenAPI (Swagger), una risposta GetCapabilities OGC, una descrizione del servizio SPARQL, un documento OpenSearch o WSDL, una descrizione API Hydra, o con del testo o qualche altra modalità informale se una rappresentazione formale non è possibile.@it"
    #xsd/langString
     "La descripción del endpoint brinda detalles específicos de la instancia del endpoint, mientras que dct:conformsTo se usa para indicar el estándar general o especificación que implementa el endpoint.@es"
    #xsd/langString
     "Popis přístupového bodu dává specifické detaily jeho konkrétní instance, zatímco dct:conformsTo indikuje obecný standard či specifikaci kterou přístupový bod implementuje.@cs"
    #xsd/langString
     "The endpoint description gives specific details of the actual endpoint instance, while dct:conformsTo is used to indicate the general standard or specification that the endpoint implements.@en"
    #xsd/langString
     "Una descripción del endpoint del servicio puede expresarse en un formato que la máquina puede interpretar, tal como una descripción basada en OpenAPI (Swagger), una respuesta OGC GetCapabilities, una descripción de un servicio SPARQL, un documento OpenSearch o WSDL, una descripción con la Hydra API, o en texto u otro modo informal si la representación formal no es posible.@es"
    #xsd/langString
     "La descrizione dell'endpoint fornisce dettagli specifici dell'istanza dell'endpoint reale, mentre dct:conformsTo viene utilizzato per indicare lo standard o le specifiche implementate dall'endpoint.@it"
    #xsd/langString
     "En beskrivelse af et endpoint kan udtrykkes i et maskinlæsbart format, såsom OpenAPI (Swagger)-beskrivelser, et OGC GetCapabilities svar, en SPARQL tjenestebeskrivelse, en OpenSearch- eller et WSDL-dokument, en Hydra-API-beskrivelse, eller i tekstformat eller i et andet uformelt format, hvis en formel repræsentation ikke er mulig.@da"
    #xsd/langString
     "Popis přístupového bodu může být vyjádřen ve strojově čitelné formě, například jako popis OpenAPI (Swagger), odpověď služby OGC getCapabilities, pomocí slovníku SPARQL Service Description, jako OpenSearch či WSDL document, jako popis API dle slovníku Hydra, a nebo textově nebo jiným neformálním způsobem, pokud není možno použít formální reprezentaci.@cs"
    #xsd/langString
     "An endpoint description may be expressed in a machine-readable form, such as an OpenAPI (Swagger) description, an OGC GetCapabilities response, a SPARQL Service Description, an OpenSearch or WSDL document, a Hydra API description, else in text or some other informal mode if a formal representation is not possible.@en"
    #xsd/langString
     "Endpointbeskrivelsen giver specifikke oplysninger om den konkrete endpointinstans, mens dct:conformsTo anvendes til at indikere den overordnede standard eller specifikation som endpointet er i overensstemmelse med.@da"]})

(def endpointURL
  {:db/ident :dcat/endpointURL,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "La posición raíz o end-point principal del servicio (una IRI web).@es"
    #xsd/langString
     "La locazione principale o l'endpoint primario del servizio (un IRI risolvibile via web).@it"
    #xsd/langString
     "The root location or primary endpoint of the service (a web-resolvable IRI).@en"
    #xsd/langString
     "Kořenové umístění nebo hlavní přístupový bod služby (IRI přístupné přes Web).@cs"
    #xsd/langString
     "Rodplaceringen eller det primære endpoint for en tjeneste (en web-resolverbar IRI).@da"],
   :rdfs/domain :dcat/DataService,
   :rdfs/label [#xsd/langString "end-point del servizio@it"
                #xsd/langString "service end-point@en"
                #xsd/langString "end-point del servicio@es"
                #xsd/langString "přístupový bod služby@cs"
                #xsd/langString "tjenesteendpoint@da"],
   :rdfs/range :rdfs/Resource,
   :skos/changeNote [#xsd/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #xsd/langString "Nuova proprietà in DCAT 2.0.@it"
                     #xsd/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #xsd/langString "New property in DCAT 2.0.@en"],
   :skos/definition
   [#xsd/langString
     "Rodplaceringen eller det primære endpoint for en tjeneste (en web-resolverbar IRI).@da"
    #xsd/langString
     "The root location or primary endpoint of the service (a web-resolvable IRI).@en"
    #xsd/langString
     "La locazione principale o l'endpoint primario del servizio (un IRI risolvibile via web).@it"
    #xsd/langString
     "Kořenové umístění nebo hlavní přístupový bod služby (IRI přístupné přes Web).@cs"
    #xsd/langString
     "La posición raíz o end-point principal del servicio (una IRI web).@es"]})

(def hadRole
  {:db/ident :dcat/hadRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "La función de una entidad o agente con respecto a otra entidad o recurso.@es"
    #xsd/langString
     "La funzione di un'entità o un agente rispetto ad un'altra entità o risorsa.@it"
    #xsd/langString
     "Den funktion en entitet eller aktør har i forhold til en anden ressource.@da"
    #xsd/langString
     "Funkce entity či agenta ve vztahu k jiné entitě či zdroji.@cs"
    #xsd/langString
     "The function of an entity or agent with respect to another entity or resource.@en"],
   :rdfs/domain {:owl/unionOf [:prov/Attribution :dcat/Relationship],
                 :rdf/type    :owl/Class},
   :rdfs/label [#xsd/langString "tiene rol@it"
                #xsd/langString "sehraná role@cs"
                #xsd/langString "hadRole@en"
                #xsd/langString "havde rolle@da"
                #xsd/langString "haRuolo@it"],
   :rdfs/range :dcat/Role,
   :skos/changeNote [#xsd/langString "New property added in DCAT 2.0.@en"
                     #xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #xsd/langString "Nueva propiedad agregada en DCAT 2.0.@es"
                     #xsd/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"],
   :skos/definition
   [#xsd/langString
     "Den funktion en entitet eller aktør har i forhold til en anden ressource.@da"
    #xsd/langString
     "La funzione di un'entità o un agente rispetto ad un'altra entità o risorsa.@it"
    #xsd/langString
     "The function of an entity or agent with respect to another entity or resource.@en"
    #xsd/langString
     "La función de una entidad o agente con respecto a otra entidad o recurso.@es"
    #xsd/langString
     "Funkce entity či agenta ve vztahu k jiné entitě či zdroji.@cs"],
   :skos/editorialNote
   [#xsd/langString
     "Přidáno do DCAT pro doplnění vlastnosti prov:hadRole (jejíž užití je omezeno na role v kontextu aktivity, s definičním oborem prov:Association).@cs"
    #xsd/langString
     "Introduceret i DCAT for at supplere prov:hadRole (hvis anvendelse er begrænset til roller i forbindelse med en aktivitet med domænet prov:Association).@da"
    #xsd/langString
     "Introduced into DCAT to complement prov:hadRole (whose use is limited to roles in the context of an activity, with the domain of prov:Association.@en"
    #xsd/langString
     "Introdotta in DCAT per completare prov:hadRole (il cui uso è limitato ai ruoli nel contesto di un'attività, con il dominio di prov:Association.@it"
    #xsd/langString
     "Agregada en DCAT para complementar prov:hadRole (cuyo uso está limitado a roles en el contexto de una actividad, con dominio prov:Association.@es"],
   :skos/scopeNote
   [#xsd/langString
     "Può essere utilizzata in una relazione qualificata per specificare il ruolo di un'entità rispetto a un'altra entità. Si raccomanda che il valore sia preso da un vocabolario controllato di ruoli di entità come ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, o MARC relators https://id.loc.gov/vocabulary/relators.@it"
    #xsd/langString
     "Může být použito v kvalifikovaném vztahu pro specifikaci role Entity ve vztahu k jiné Entitě. Je doporučeno použít hodnotu z řízeného slovníku rolí entit, jako například ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode, IANA Registry of Link Relations https://www.iana.org/assignments/link-relation, DataCite metadata schema, MARC relators https://id.loc.gov/vocabulary/relators.@cs"
    #xsd/langString
     "May be used in a qualified-relation to specify the role of an Entity with respect to another Entity.  It is recommended that the value be taken from a controlled vocabulary of entity roles such as: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation; DataCite metadata schema; MARC relators https://id.loc.gov/vocabulary/relators.@en"
    #xsd/langString
     "May be used in a qualified-attribution to specify the role of an Agent with respect to an Entity. It is recommended that the value be taken from a controlled vocabulary of agent roles, such as http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@en"
    #xsd/langString
     "Může být použito v kvalifikovaném přiřazení pro specifikaci role Agenta ve vztahu k Entitě. Je doporučeno hodnotu vybrat z řízeného slovníku rolí agentů, jako například http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@cs"
    #xsd/langString
     "Può essere utilizzato in un'attribuzione qualificata per specificare il ruolo di un agente rispetto a un'entità. Si raccomanda che il valore sia preso da un vocabolario controllato di ruoli di agente, come ad esempio http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@it"
    #xsd/langString
     "Puede usarse en una atribución cualificada para especificar el rol de un Agente con respecto a una Entidad. Se recomienda que el valor sea de un vocabulario controlado de roles de agentes, como por ejemplo http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@es"
    #xsd/langString
     "Kan vendes ved kvalificerede krediteringer til at angive en aktørs rolle i forhold en entitet. Det anbefales at værdierne styres som et kontrolleret udfaldsrum med aktørroller, såsom http://registry.it.csiro.au/def/isotc211/CI_RoleCode.@da"
    #xsd/langString
     "Puede usarse en una atribución cualificada para especificar el rol de una Entidad con respecto a otra Entidad. Se recomienda que su valor se tome de un vocabulario controlado de roles de entidades como por ejemplo: ISO 19115 DS_AssociationTypeCode http://registry.it.csiro.au/def/isotc211/DS_AssociationTypeCode; IANA Registry of Link Relations https://www.iana.org/assignments/link-relation; esquema de metadatos de DataCite; MARC relators https://id.loc.gov/vocabulary/relators.@es"]})

(def keyword
  {:db/ident :dcat/keyword,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment
   [#xsd/langString
     "Una parola chiave o un'etichetta per descrivere la risorsa.@it"
    #xsd/langString "Et nøgleord eller tag til beskrivelse af en ressource.@da"
    #xsd/langString
     "Μία λέξη-κλειδί ή μία ετικέτα που περιγράφει το σύνολο δεδομένων.@el"
    #xsd/langString "Un mot-clé ou étiquette décrivant une ressource.@fr"
    #xsd/langString "Una palabra clave o etiqueta que describe un recurso.@es"
    #xsd/langString "Klíčové slovo nebo značka popisující zdroj.@cs"
    #xsd/langString "A keyword or tag describing a resource.@en"
    #xsd/langString "データセットを記述しているキーワードまたはタグ。@ja"
    #xsd/langString "كلمة  مفتاحيه توصف قائمة البيانات@ar"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "كلمة  مفتاحية @ar"
                #xsd/langString "mot-clés @fr"
                #xsd/langString "λέξη-κλειδί@el"
                #xsd/langString "キーワード/タグ@ja"
                #xsd/langString "nøgleord@da"
                #xsd/langString "palabra clave@es"
                #xsd/langString "keyword@en"
                #xsd/langString "parola chiave@it"
                #xsd/langString "klíčové slovo@cs"],
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/subject,
   :skos/definition
   [#xsd/langString "Klíčové slovo nebo značka popisující zdroj.@cs"
    #xsd/langString "データセットを記述しているキーワードまたはタグ。@ja"
    #xsd/langString "Un mot-clé ou étiquette décrivant une ressource.@fr"
    #xsd/langString "A keyword or tag describing a resource.@en"
    #xsd/langString "Una palabra clave o etiqueta que describe un recurso.@es"
    #xsd/langString "Et nøgleord eller tag til beskrivelse af en ressource.@da"
    #xsd/langString "كلمة  مفتاحيه توصف قائمة البيانات@ar"
    #xsd/langString
     "Μία λέξη-κλειδί ή μία ετικέτα που περιγράφει το σύνολο δεδομένων.@el"
    #xsd/langString
     "Una parola chiave o un'etichetta per descrivere la risorsa.@it"]})

(def landingPage
  {:db/ident :dcat/landingPage,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#xsd/langString
     "Una página web que puede ser visitada en un explorador Web para tener acceso el catálogo, un conjunto de datos, sus distribuciones y/o información adicional.@es"
    #xsd/langString
     "A Web page that can be navigated to in a Web browser to gain access to the catalog, a dataset, its distributions and/or additional information.@en"
    #xsd/langString
     "Μία ιστοσελίδα πλοηγίσιμη μέσω ενός φυλλομετρητή (Web browser) που δίνει πρόσβαση στο σύνολο δεδομένων, τις διανομές αυτού ή/και επιπρόσθετες πληροφορίες.@el"
    #xsd/langString
     "Una pagina web che può essere navigata per ottenere l'accesso al catalogo, ad un dataset, alle distribuzioni del dataset e/o ad informazioni addizionali.@it"
    #xsd/langString
     "データセット、その配信および（または）追加情報にアクセスするためにウエブ・ブラウザでナビゲートできるウェブページ。@ja"
    #xsd/langString
     "صفحة وب يمكن من خلالها الوصول الى قائمة البيانات أو إلى معلومات إضافية متعلقة بها @ar"
    #xsd/langString
     "En webside som der kan navigeres til i en webbrowser for at få adgang til kataloget, et datasæt, dets distributioner og/eller yderligere information.@da"
    #xsd/langString
     "Webová stránka, na kterou lze pro získání přístupu ke katalogu, datové sadě, jejím distribucím a/nebo dalším informacím přistoupit webovým prohlížečem.@cs"
    #xsd/langString
     "Une page Web accessible par un navigateur Web donnant accès au catalogue, un jeu de données, ses distributions et/ou des informations additionnelles.@fr"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "página de destino@es"
                #xsd/langString "landing page@en"
                #xsd/langString "vstupní stránka@cs"
                #xsd/langString "destinationsside@da"
                #xsd/langString "ランディング・ページ@ja"
                #xsd/langString "page d'atterrissage@fr"
                #xsd/langString "صفحة وصول@ar"
                #xsd/langString "pagina di destinazione@it"
                #xsd/langString "ιστοσελίδα αρχικής πρόσβασης@el"],
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/page,
   :skos/definition
   [#xsd/langString
     "Una pagina web che può essere navigata per ottenere l'accesso al catalogo, ad un dataset, alle distribuzioni del dataset e/o ad informazioni addizionali.@it"
    #xsd/langString
     "A Web page that can be navigated to in a Web browser to gain access to the catalog, a dataset, its distributions and/or additional information.@en"
    #xsd/langString
     "Una página web que puede ser visitada en un explorador Web para tener acceso el catálogo, un conjunto de datos, sus distribuciones y/o información adicional.@es"
    #xsd/langString
     "صفحة وب يمكن من خلالها الوصول الى قائمة البيانات أو إلى معلومات إضافية متعلقة بها @ar"
    #xsd/langString
     "En webside som en webbrowser kan navigeres til for at få adgang til kataloget, et datasæt, dets distritbutioner og/eller yderligere information.@da"
    #xsd/langString
     "Webová stránka, na kterou lze pro získání přístupu ke katalogu, datové sadě, jejím distribucím a/nebo dalším informacím přistoupit webovým prohlížečem.@cs"
    #xsd/langString
     "Μία ιστοσελίδα πλοηγίσιμη μέσω ενός φυλλομετρητή (Web browser) που δίνει πρόσβαση στο σύνολο δεδομένων, τις διανομές αυτού ή/και επιπρόσθετες πληροφορίες.@el"
    #xsd/langString
     "Une page Web accessible par un navigateur Web donnant accès au catalogue, un jeu de données, ses distributions et/ou des informations additionnelles.@fr"
    #xsd/langString
     "データセット、その配信および（または）追加情報にアクセスするためにウエブ・ブラウザでナビゲートできるウェブページ。@ja"],
   :skos/scopeNote
   [#xsd/langString
     "Hvis en eller flere distributioner kun er tilgængelige via en destinationsside (dvs. en URL til direkte download er ikke kendt), så bør destinationssidelinket gentages som adgangsadresse for en distribution.@da"
    #xsd/langString
     "Si la distribución es accesible solamente través de una página de aterrizaje (i.e., no se conoce una URL de descarga directa), entonces el enlance a la página de aterrizaje debe ser duplicado como accessURL sobre la distribución.@es"
    #xsd/langString
     "ランディング・ページを通じてしか配信にアクセスできない場合（つまり、直接的なダウンロードURLが不明）には、配信におけるaccessURLとしてランディング・ページのリンクをコピーすべきです（SHOULD）。@ja"
    #xsd/langString
     "If the distribution(s) are accessible only through a landing page (i.e. direct download URLs are not known), then the landing page link should be duplicated as accessURL on a distribution.@en"
    #xsd/langString
     "Αν η/οι διανομή/ές είναι προσβάσιμη/ες μόνο μέσω μίας ιστοσελίδας αρχικής πρόσβασης (δηλαδή αν δεν υπάρχουν γνωστές διευθύνσεις άμεσης μεταφόρτωσης), τότε ο σύνδεσμος της ιστοσελίδας αρχικής πρόσβασης πρέπει να αναπαραχθεί ως accessURL σε μία διανομή.@el"
    #xsd/langString
     "Pokud je distribuce dostupná pouze přes vstupní stránku, t.j. přímý URL odkaz ke stažení není znám, URL přístupové stránky by mělo být duplikováno ve vlastnosti distribuce accessURL.@cs"
    #xsd/langString
     "Se la distribuzione è accessibile solo attraverso una pagina di destinazione (cioè, un URL di download diretto non è noto), il link alla pagina di destinazione deve essere duplicato come accessURL sulla distribuzione.@it"
    #xsd/langString
     "Si la distribution est seulement accessible à travers une page d'atterrissage (exple. pas de connaissance d'URLS de téléchargement direct ), alors le lien de la page d'atterrissage doit être dupliqué comme accessURL sur la distribution.@fr"]})

(def mediaType
  {:db/ident :dcat/mediaType,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#xsd/langString
     "Il tipo di media della distribuzione come definito da IANA@it"
    #xsd/langString
     "このプロパティーは、配信のメディア・タイプがIANAで定義されているときに使用すべきで（SHOULD）、そうでない場合には、dct:formatを様々な値と共に使用できます（MAY）。@ja"
    #xsd/langString
     "Η ιδιότητα αυτή ΘΑ ΠΡΕΠΕΙ να χρησιμοποιείται όταν ο τύπος μέσου μίας διανομής είναι ορισμένος στο IANA, αλλιώς η ιδιότητα dct:format ΔΥΝΑΤΑΙ να χρησιμοποιηθεί με διαφορετικές τιμές.@el"
    #xsd/langString
     "Cette propriété doit être utilisée quand c'est définit le type de média de la distribution en IANA, sinon dct:format DOIT être utilisé avec différentes valeurs.@fr"
    #xsd/langString "The media type of the distribution as defined by IANA@en"
    #xsd/langString "يجب استخدام هذه الخاصية إذا كان نوع الملف معرف ضمن IANA@ar"
    #xsd/langString
     "Medietypen for distributionen som den er defineret af IANA.@da"
    #xsd/langString "Typ média distribuce definovaný v IANA.@cs"
    #xsd/langString
     "Esta propiedad debe ser usada cuando está definido el tipo de media de la distribución en IANA, de otra manera dct:format puede ser utilizado con diferentes valores@es"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "tipo de media@es"
                #xsd/langString "media type@en"
                #xsd/langString "نوع الميديا@ar"
                #xsd/langString "typ média@cs"
                #xsd/langString "メディア・タイプ@ja"
                #xsd/langString "type de média@fr"
                #xsd/langString "τύπος μέσου@el"
                #xsd/langString "medietype@da"
                #xsd/langString "tipo di media@it"],
   :rdfs/range :dcterms/MediaType,
   :rdfs/subPropertyOf :dcterms/format,
   :skos/changeNote
   [#xsd/langString
     "Obor hodnot dcat:mediaType byl zúžen v této revizi DCAT.@cs"
    #xsd/langString
     "Il range di dcat:mediaType è stato ristretto  come parte della revisione di DCAT.@it"
    #xsd/langString
     "The range of dcat:mediaType has been tightened as part of the revision of DCAT.@en"],
   :skos/definition
   [#xsd/langString "يجب استخدام هذه الخاصية إذا كان نوع الملف معرف ضمن IANA@ar"
    #xsd/langString
     "Η ιδιότητα αυτή ΘΑ ΠΡΕΠΕΙ να χρησιμοποιείται όταν ο τύπος μέσου μίας διανομής είναι ορισμένος στο IANA, αλλιώς η ιδιότητα dct:format ΔΥΝΑΤΑΙ να χρησιμοποιηθεί με διαφορετικές τιμές.@el"
    #xsd/langString
     "Cette propriété doit être utilisée quand c'est définit le type de média de la distribution en IANA, sinon dct:format DOIT être utilisé avec différentes valeurs.@fr"
    #xsd/langString
     "Esta propiedad debe ser usada cuando está definido el tipo de media de la distribución en IANA, de otra manera dct:format puede ser utilizado con diferentes valores.@es"
    #xsd/langString
     "Il tipo di media della distribuzione come definito da IANA.@it"
    #xsd/langString "The media type of the distribution as defined by IANA.@en"
    #xsd/langString
     "このプロパティーは、配信のメディア・タイプがIANAで定義されているときに使用すべきで（SHOULD）、そうでない場合には、dct:formatを様々な値と共に使用できます（MAY）。@ja"
    #xsd/langString "Typ média distribuce definovaný v IANA.@cs"
    #xsd/langString
     "Medietypen for distributionen som den er defineret af IANA.@da"],
   :skos/editorialNote
   #xsd/langString
    "Status: English Definition text modified by DCAT revision team, Italian and Czech translation provided, other translations pending. Note some inconsistency on def vs. usage.@en",
   :skos/scopeNote
   [#xsd/langString
     "Questa proprietà DEVE essere usata quando il tipo di media della distribuzione è definito nel registro dei tipi di media IANA https://www.iana.org/assignments/media-types/, altrimenti dct:format PUO 'essere usato con differenti valori.@it"
    #xsd/langString
     "Tato vlastnost BY MĚLA být použita, je-li typ média distribuce definován v registru IANA https://www.iana.org/assignments/media-types/. V ostatních případech MŮŽE být použita vlastnost dct:format s jinými hodnotami.@cs"
    #xsd/langString
     "Esta propiedad DEBERÍA usarse cuando el 'media type' de la distribución está definido en el registro IANA de 'media types' https://www.iana.org/assignments/media-types/, de lo contrario, dct:format PUEDE usarse con distintos valores.@es"
    #xsd/langString
     "This property SHOULD be used when the media type of the distribution is defined in the IANA media types registry https://www.iana.org/assignments/media-types/, otherwise dct:format MAY be used with different values.@en"
    #xsd/langString
     "Denne egenskab BØR anvendes hvis distributionens medietype optræder i 'IANA media types registry' https://www.iana.org/assignments/media-types/, ellers KAN egenskaben dct:format anvendes med et andet udfaldsrum.@da"]})

(def packageFormat
  {:db/ident :dcat/packageFormat,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#xsd/langString
     "The package format of the distribution in which one or more data files are grouped together, e.g. to enable a set of related files to be downloaded together.@en"
    #xsd/langString
     "Balíčkový formát souboru, ve kterém je jeden či více souborů seskupeno dohromady, např. aby bylo možné stáhnout sadu souvisejících souborů naráz.@cs"
    #xsd/langString
     "Il formato di impacchettamento della distribuzione in cui uno o più file di dati sono raggruppati insieme, ad es. per abilitare un insieme di file correlati da scaricare insieme.@it"
    #xsd/langString
     "El formato del archivo en que se agrupan uno o más archivos de datos, e.g. para permitir que un conjunto de archivos relacionados se bajen juntos.@es"
    #xsd/langString
     "Format til pakning af data med henblik på distribution af en eller flere relaterede datafiler der samles til en enhed med henblik på samlet distribution. @da"],
   :rdfs/domain :dcat/Distribution,
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/TR/vocab-dcat-2/"},
   :rdfs/label [#xsd/langString "formát balíčku@cs"
                #xsd/langString "packaging format@en"
                #xsd/langString "formato di impacchettamento@it"
                #xsd/langString "pakkeformat@da"
                #xsd/langString "formato de empaquetado@es"],
   :rdfs/range :dcterms/MediaType,
   :rdfs/subPropertyOf :dcterms/format,
   :skos/changeNote
   [#xsd/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
    #xsd/langString "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
    #xsd/langString "New property added in DCAT 2.0.@en"
    #xsd/langString "Nueva propiedad agregada en DCAT 2.0.@es"
    #xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"],
   :skos/definition
   [#xsd/langString
     "Il formato di impacchettamento della distribuzione in cui uno o più file di dati sono raggruppati insieme, ad es. per abilitare un insieme di file correlati da scaricare insieme.@it"
    #xsd/langString
     "The package format of the distribution in which one or more data files are grouped together, e.g. to enable a set of related files to be downloaded together.@en"
    #xsd/langString
     "El formato del archivo en que se agrupan uno o más archivos de datos, e.g. para permitir que un conjunto de archivos relacionados se bajen juntos.@es"
    #xsd/langString
     "Balíčkový formát souboru, ve kterém je jeden či více souborů seskupeno dohromady, např. aby bylo možné stáhnout sadu souvisejících souborů naráz.@cs"],
   :skos/scopeNote
   [#xsd/langString
     "Questa proprietà deve essere utilizzata quando i file nella distribuzione sono impacchettati, ad esempio in un file TAR, Frictionless Data Package o Bagit. Il formato DOVREBBE essere espresso utilizzando un tipo di supporto come definito dal registro dei tipi di media IANA https://www.iana.org/assignments/media-types/, se disponibili.@it"
    #xsd/langString
     "Esta propiedad se debe usar cuando los archivos de la distribución están empaquetados, por ejemplo en un archivo TAR, Frictionless Data Package o Bagit. El formato DEBERÍA expresarse usando un 'media type', tales como los definidos en el registro IANA de 'media types' https://www.iana.org/assignments/media-types/, si está disponibles.@es"
    #xsd/langString
     "Denne egenskab kan anvendes hvis filerne i en distribution er pakket, fx i en TAR-fil, en Frictionless Data Package eller en Bagit-fil. Formatet BØR udtrykkes ved en medietype som defineret i 'IANA media types registry', hvis der optræder en relevant medietype dér: https://www.iana.org/assignments/media-types/.@da"
    #xsd/langString
     "This property to be used when the files in the distribution are packaged, e.g. in a TAR file, a Frictionless Data Package or a Bagit file. The format SHOULD be expressed using a media type as defined by IANA media types registry https://www.iana.org/assignments/media-types/, if available.@en"
    #xsd/langString
     "Tato vlastnost se použije, když jsou soubory v distribuci zabaleny, např. v souboru TAR, v balíčku Frictionless Data Package nebo v souboru Bagit. Formát BY MĚL být vyjádřen pomocí typu média definovaného v registru IANA https://www.iana.org/assignments/media-types/, pokud existuje.@cs"]})

(def qualifiedRelation
  {:db/ident :dcat/qualifiedRelation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString "Odkaz na popis vztahu s jiným zdrojem.@cs"
    #xsd/langString
     "Link a una descrizione di una relazione con un'altra risorsa.@it"
    #xsd/langString
     "Link to a description of a relationship with another resource.@en"
    #xsd/langString
     "Enlace a una descripción de la relación con otro recurso.@es"
    #xsd/langString
     "Reference til en beskrivelse af en relation til en anden ressource.@da"],
   :rdfs/domain :dcat/Resource,
   :rdfs/label [#xsd/langString "qualified relation@en"
                #xsd/langString "relazione qualificata@it"
                #xsd/langString "Kvalificeret relation@da"
                #xsd/langString "relación calificada@es"
                #xsd/langString "kvalifikovaný vztah@cs"],
   :rdfs/range :dcat/Relationship,
   :skos/changeNote [#xsd/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #xsd/langString "New property added in DCAT 2.0.@en"
                     #xsd/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
                     #xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #xsd/langString "Propiedad nueva añadida en DCAT 2.0.@es"],
   :skos/definition
   [#xsd/langString "Odkaz na popis vztahu s jiným zdrojem.@cs"
    #xsd/langString
     "Reference til en beskrivelse af en relation til en anden ressource.@da"
    #xsd/langString
     "Link a una descrizione di una relazione con un'altra risorsa.@it"
    #xsd/langString
     "Enlace a una descripción de la relación con otro recurso.@es"
    #xsd/langString
     "Link to a description of a relationship with another resource.@en"],
   :skos/editorialNote
   [#xsd/langString
     "Introduced into DCAT to complement the other PROV qualified relations. @en"
    #xsd/langString
     "Přidáno do DCAT k doplnění jiných kvalifikovaných vztahů ze slovníku PROV.@cs"
    #xsd/langString
     "Se incluyó en DCAT para complementar las relaciones calificadas disponibles en PROV.@es"
    #xsd/langString
     "Introdotta in DCAT per integrare le altre relazioni qualificate di PROV.@it"
    #xsd/langString
     "Introduceret i DCAT med henblik på at supplere de øvrige kvalificerede relationer fra PROV. @da"],
   :skos/scopeNote
   [#xsd/langString
     "Used to link to another resource where the nature of the relationship is known but does not match one of the standard Dublin Core properties (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@en"
    #xsd/langString
     "Anvendes til at referere til en anden ressource hvor relationens betydning er kendt men ikke matcher en af de standardiserede egenskaber fra Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) eller PROV-O-egenskaber (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@da"
    #xsd/langString
     "Viene utilizzato per associarsi a un'altra risorsa nei casi per i quali la natura della relazione è nota ma non è alcuna delle proprietà fornite dallo standard Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat , dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:require, dct:isRequiredBy) o dalle proprietà fornite da PROV-O (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom , prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@it"
    #xsd/langString
     "Použito pro odkazování na jiný zdroj, kde druh vztahu je znám, ale neodpovídá standardním vlastnostem ze slovníku Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) či slovníku PROV-O (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@cs"
    #xsd/langString
     "Se usa para asociar con otro recurso para el cuál la naturaleza de la relación es conocida pero no es ninguna de las propiedades que provee el estándar Dublin Core (dct:hasPart, dct:isPartOf, dct:conformsTo, dct:isFormatOf, dct:hasFormat, dct:isVersionOf, dct:hasVersion, dct:replaces, dct:isReplacedBy, dct:references, dct:isReferencedBy, dct:requires, dct:isRequiredBy) or PROV-O properties (prov:wasDerivedFrom, prov:wasInfluencedBy, prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource, prov:alternateOf, prov:specializationOf).@es"]})

(def record
  "har post"
  {:db/ident :dcat/record,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#xsd/langString "Συνδέει έναν κατάλογο με τις καταγραφές του.@el"
    #xsd/langString
     "Un record che descrive la registrazione di un singolo set di dati o di un servizio dati che fa parte del catalogo.@it"
    #xsd/langString "Relie un catalogue à ses registres.@fr"
    #xsd/langString "Propojuje katalog a jeho záznamy.@cs"
    #xsd/langString
     "Describe la registración de un conjunto de datos o un servicio de datos en el catálogo.@es"
    #xsd/langString
     "Záznam popisující registraci jedné datové sady či datové služby jakožto součásti katalogu.@cs"
    #xsd/langString "تربط الفهرس بسجل ضمنه@ar"
    #xsd/langString
     "En post der beskriver registreringen af et enkelt datasæt eller en datatjeneste som er opført i kataloget.@da"
    #xsd/langString
     "A record describing the registration of a single dataset or data service that is part of the catalog.@en"
    #xsd/langString "カタログの一部であるカタログ・レコード。@ja"],
   :rdfs/domain :dcat/Catalog,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "カタログ・レコード@ja"
                #xsd/langString "سجل@ar"
                #xsd/langString "registre@fr"
                #xsd/langString "záznam@cs"
                #xsd/langString "record@it"
                #xsd/langString "record@en"
                #xsd/langString "registro@es"
                #xsd/langString "καταγραφή@el"
                #xsd/langString "post@da"],
   :rdfs/range :dcat/CatalogRecord,
   :skos/altLabel #xsd/langString "har post@da",
   :skos/definition
   [#xsd/langString "Propojuje katalog a jeho záznamy.@cs"
    #xsd/langString "Relie un catalogue à ses registres.@fr"
    #xsd/langString
     "Záznam popisující registraci jedné datové sady či datové služby jakožto součásti katalogu.@cs"
    #xsd/langString
     "En post der beskriver registreringen af et enkelt datasæt eller en datatjeneste som er opført i kataloget.@da"
    #xsd/langString
     "Un record che descrive la registrazione di un singolo set di dati o di un servizio dati che fa parte del catalogo.@it"
    #xsd/langString "Συνδέει έναν κατάλογο με τις καταγραφές του.@el"
    #xsd/langString "カタログの一部であるカタログ・レコード。@ja"
    #xsd/langString
     "Describe la registración de un conjunto de datos o un servicio de datos en el catálogo.@es"
    #xsd/langString "تربط الفهرس بسجل ضمنه@ar"
    #xsd/langString
     "A record describing the registration of a single dataset or data service that is part of the catalog.@en"],
   :skos/editorialNote
   #xsd/langString
    "Status: English, Italian, Spanish and Czech Definitions modified by DCAT revision team, other translations pending.@en"})

(def servesDataset
  {:db/ident :dcat/servesDataset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Una colección de datos que este Servicio de Datos puede distribuir.@es"
    #xsd/langString
     "En samling af data som denne datatjeneste kan distribuere.@da"
    #xsd/langString
     "Una raccolta di dati che questo DataService può distribuire.@it"
    #xsd/langString
     "Kolekce dat, kterou je tato Datová služba schopna poskytnout.@cs"
    #xsd/langString
     "A collection of data that this DataService can distribute.@en"],
   :rdfs/domain :dcat/DataService,
   :rdfs/label [#xsd/langString "datatjeneste for datasæt@da"
                #xsd/langString "serve set di dati@it"
                #xsd/langString "poskytuje datovou sadu@cs"
                #xsd/langString "serves dataset@en"
                #xsd/langString "provee conjunto de datos@es"],
   :rdfs/range :dcat/Dataset,
   :skos/altLabel [#xsd/langString "udstiller@da"
                   #xsd/langString "ekspederer@da"
                   #xsd/langString "distribuerer@da"],
   :skos/changeNote
   [#xsd/langString "New property in DCAT 2.0.@en"
    #xsd/langString "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
    #xsd/langString "Nuova proprietà in DCAT 2.0.@it"
    #xsd/langString "Nueva propiedad agregada en DCAT 2.0.@es"],
   :skos/definition
   [#xsd/langString
     "En samling af data som denne datatjeneste kan distribuere.@da"
    #xsd/langString
     "Una raccolta di dati che questo DataService può distribuire.@it"
    #xsd/langString
     "A collection of data that this DataService can distribute.@en"
    #xsd/langString
     "Una colección de datos que este Servicio de Datos puede distribuir.@es"
    #xsd/langString
     "Kolekce dat, kterou je tato Datová služba schopna poskytnout.@cs"]})

(def service
  "har datatjeneste"
  {:db/ident :dcat/service,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString "Umístění či přístupový bod registrovaný v katalogu.@cs"
    #xsd/langString "A site or endpoint that is listed in the catalog.@en"
    #xsd/langString "Un sito o endpoint elencato nel catalogo.@it"
    #xsd/langString "Et websted eller et endpoint som er opført i kataloget.@da"
    #xsd/langString
     "Un sitio o 'endpoint' que está listado en el catálogo.@es"],
   :rdfs/domain :dcat/Catalog,
   :rdfs/label [#xsd/langString "service@en"
                #xsd/langString "datatjeneste@da"
                #xsd/langString "servicio@es"
                #xsd/langString "servizio@it"
                #xsd/langString "služba@cs"],
   :rdfs/range :dcat/DataService,
   :rdfs/subPropertyOf [:dcterms/hasPart :rdfs/member],
   :skos/altLabel #xsd/langString "har datatjeneste@da",
   :skos/changeNote [#xsd/langString "Nueva propiedad añadida en DCAT 2.0.@es"
                     #xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #xsd/langString "New property added in DCAT 2.0.@en"
                     #xsd/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"],
   :skos/definition
   [#xsd/langString "Un sitio o 'endpoint' que está listado en el catálogo.@es"
    #xsd/langString "Umístění či přístupový bod registrovaný v katalogu.@cs"
    #xsd/langString "Et websted eller et endpoint som er opført i kataloget.@da"
    #xsd/langString "A site or endpoint that is listed in the catalog.@en"
    #xsd/langString "Un sito o endpoint elencato nel catalogo.@it"]})

(def spatialResolutionInMeters
  {:db/ident :dcat/spatialResolutionInMeters,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "minimum spatial separation resolvable in a dataset, measured in metres.@en-GB"
    #xsd/langString
     "minimum spatial separation resolvable in a dataset, measured in meters.@en-US"
    #xsd/langString
     "mínima separacíon espacial disponible en un conjunto de datos, medida en metros.@es"
    #xsd/langString
     "separazione spaziale minima risolvibile in un set di dati, misurata in metri.@it"
    #xsd/langString
     "mindste geografiske afstand som kan erkendes i et datasæt, målt i meter.@da"
    #xsd/langString
     "minimální prostorový rozestup rozeznatelný v datové sadě, měřeno v metrech.@cs"],
   :rdfs/label [#xsd/langString "resolución espacial (metros)@es"
                #xsd/langString "spatial resolution (metres)@en-GB"
                #xsd/langString "spatial resolution (meters)@en-US"
                #xsd/langString "prostorové rozlišení (metry)@cs"
                #xsd/langString "risoluzione spaziale (metros)@it"
                #xsd/langString "geografisk opløsning (meter)@da"],
   :rdfs/range :xsd/decimal,
   :skos/changeNote [#xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #xsd/langString "Nueva propiedad añadida en DCAT 2.0.@es"
                     #xsd/langString "New property added in DCAT 2.0.@en"
                     #xsd/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
                     #xsd/langString "Ny genskab tilføjet i DCAT 2.0.@da"],
   :skos/definition
   [#xsd/langString
     "minimum spatial separation resolvable in a dataset, measured in meters.@en-US"
    #xsd/langString
     "separazione spaziale minima risolvibile in un set di dati, misurata in metri.@it"
    #xsd/langString
     "minimální prostorový rozestup rozeznatelný v datové sadě, měřeno v metrech.@cs"
    #xsd/langString
     "minimum spatial separation resolvable in a dataset, measured in metres.@en-GB"
    #xsd/langString
     "mínima separacíon espacial disponible en un conjunto de datos, medida en metros.@es"
    #xsd/langString
     "mindste geografiske afstand som kan resolveres i et datasæt, målt i meter.@da"],
   :skos/editorialNote
   [#xsd/langString
     "Může se vyskytnout v popisu Datové sady nebo Distribuce, takže nebyl specifikován definiční obor.@cs"
    #xsd/langString
     "Might appear in the description of a Dataset or a Distribution, so no domain is specified.@en"
    #xsd/langString
     "Kan optræde i forbindelse med beskrivelse af datasættet eller datasætditributionen, så der er ikke angivet et domæne for egenskaben.@da"],
   :skos/scopeNote
   [#xsd/langString
     "Pokud je datová sada obraz či mřížka, měla by tato vlastnost odpovídat rozestupu položek. Pro ostatní druhy prostorových datových sad bude tato vlastnost obvykle indikovat nejmenší vzdálenost mezi položkami této datové sady.@cs"
    #xsd/langString
     "Hvis datasættet udgøres af et billede eller et grid, så bør dette svare til afstanden mellem elementerne. For andre typer af spatiale datasæt, vil denne egenskab typisk indikere den mindste afstand mellem elementerne i datasættet.@da"
    #xsd/langString
     "Různá prostorová rozlišení mohou být poskytována jako různé distribuce datové sady.@cs"
    #xsd/langString
     "Distintas distribuciones de un conjunto de datos pueden tener resoluciones espaciales diferentes.@es"
    #xsd/langString
     "Alternative geografiske opløsninger kan leveres som forskellige datasætdistributioner.@da"
    #xsd/langString
     "Se il set di dati è un'immagine o una griglia, questo dovrebbe corrispondere alla spaziatura degli elementi. Per altri tipi di set di dati spaziali, questa proprietà di solito indica la distanza minima tra gli elementi nel set di dati.@it"
    #xsd/langString
     "Alternative spatial resolutions might be provided as different dataset distributions.@en"
    #xsd/langString
     "Risoluzioni spaziali alternative possono essere fornite come diverse distribuzioni di set di dati.@it"
    #xsd/langString
     "Si el conjunto de datos es una imágen o grilla, esta propiedad corresponde al espaciado de los elementos. Para otro tipo de conjunto de datos espaciales, esta propieda usualmente indica la menor distancia entre los elementos de dichos datos.@es"
    #xsd/langString
     "If the dataset is an image or grid this should correspond to the spacing of items. For other kinds of spatial dataset, this property will usually indicate the smallest distance between items in the dataset.@en"]})

(def startDate
  "starttidspunkt"
  {:db/ident :dcat/startDate,
   :rdf/type [:rdf/Property :owl/DatatypeProperty],
   :rdfs/domain :dcterms/PeriodOfTime,
   :rdfs/label [#xsd/langString "data di inizio@it"
                #xsd/langString "datum začátku@cs"
                #xsd/langString "start date@en"
                #xsd/langString "startdato@da"],
   :rdfs/range :rdfs/Literal,
   :skos/altLabel #xsd/langString "starttidspunkt@da",
   :skos/changeNote
   [#xsd/langString "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"
    #xsd/langString "New property added in DCAT 2.0.@en"
    #xsd/langString "Ny egenskab tilføjet i DCAT 2.0.@da"
    #xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
    #xsd/langString "Nueva propiedad agregada en DCAT 2.0.@es"],
   :skos/definition [#xsd/langString "El comienzo del período@es"
                     #xsd/langString "Začátek doby trvání@cs"
                     #xsd/langString "The start of the period@en"
                     #xsd/langString "Start på perioden.@da"
                     #xsd/langString "L'inizio del periodo@it"],
   :skos/scopeNote
   [#xsd/langString
     "Rækkeviden for denne egenskab er bevidst generisk defineret med det formål at tillade forskellige niveauer af tidslig præcision ifm. angivelse af startdatoen for en periode. Den kan eksempelvis udtrykkes som en dato (xsd:date), en dato og et tidspunkt (xsd:dateTime), eller et årstal (xsd:gYear).@da"
    #xsd/langString
     "The range of this property is intentionally generic, with the purpose of allowing different level of temporal precision for specifying the start of a period. E.g., it can be expressed with a date (xsd:date), a date and time (xsd:dateTime), or a year (xsd:gYear).@en"
    #xsd/langString
     "Obor hodnot této vlastnosti je úmyslně obecný, aby umožnil různé úrovně časového rozlišení pro specifikaci začátku doby trvání. Ten může být kupříkladu vyjádřen datumem (xsd:date), datumem a časem (xsd:dateTime) či rokem (xsd:gYear).@cs"
    #xsd/langString
     "Il range di questa proprietà è volutamente generico, con lo scopo di consentire diversi livelli di precisione temporale per specificare l'inizio di un periodo. Ad esempio, può essere espresso con una data (xsd:date), una data e un'ora (xsd:dateTime), o un anno (xsd:gYear).@it"
    #xsd/langString
     "El rango de esta propiedad es intencionalmente genérico con el propósito de permitir distintos niveles de precisión temporal para especificar el comienzo de un período. Por ejemplo, puede expresarse como una fecha (xsd:date), una fecha y un tiempo (xsd:dateTime), o un año (xsd:gYear).@es"]})

(def temporalResolution
  {:db/ident :dcat/temporalResolution,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString "minimum time period resolvable in a dataset.@en"
    #xsd/langString "minimální doba trvání rozlišitelná v datové sadě.@cs"
    #xsd/langString "período de tiempo mínimo en el conjunto de datos.@es"
    #xsd/langString "mindste tidsperiode der kan resolveres i datasættet.@da"
    #xsd/langString
     "periodo di tempo minimo risolvibile in un set di dati.@it"],
   :rdfs/label [#xsd/langString "resolución temporal@es"
                #xsd/langString "tidslig opløsning@da"
                #xsd/langString "temporal resolution@en"
                #xsd/langString "časové rozlišení@cs"
                #xsd/langString "risoluzione temporale@it"],
   :rdfs/range :xsd/duration,
   :skos/changeNote [#xsd/langString "Nueva propiedad añadida en DCAT 2.0.@es"
                     #xsd/langString "New property added in DCAT 2.0.@en"
                     #xsd/langString "Nuova proprietà aggiunta in DCAT 2.0.@it"
                     #xsd/langString
                      "Nová vlastnost přidaná ve verzi DCAT 2.0.@cs"],
   :skos/definition
   [#xsd/langString "minimální doba trvání rozlišitelná v datové sadě.@cs"
    #xsd/langString "período de tiempo mínimo en el conjunto de datos.@es"
    #xsd/langString "minimum time period resolvable in a dataset.@en"
    #xsd/langString "periodo di tempo minimo risolvibile in un set di dati.@it"
    #xsd/langString "mindste tidsperiode der kan resolveres i datasættet.@da"],
   :skos/editorialNote
   [#xsd/langString
     "Může se vyskytnout v popisu Datové sady nebo Distribuce, takže nebyl specifikován definiční obor.@cs"
    #xsd/langString
     "Might appear in the description of a Dataset or a Distribution, so no domain is specified.@en"
    #xsd/langString
     "Kan optræde i forbindelse med beskrivelse af datasættet eller datasætditributionen, så der er ikke angivet et domæne for egenskaben.@da"],
   :skos/scopeNote
   [#xsd/langString
     "Alternative temporal resolutions might be provided as different dataset distributions.@en"
    #xsd/langString
     "Různá časová rozlišení mohou být poskytována jako různé distribuce datové sady.@cs"
    #xsd/langString
     "Alternative tidslige opløsninger kan leveres som forskellige datasætdistributioner.@da"
    #xsd/langString
     "Si el conjunto de datos es una serie temporal, debe corresponder al espaciado de los elementos de la serie. Para otro tipo de conjuntos de datos, esta propiedad indicará usualmente la menor diferencia de tiempo entre elementos en el dataset.@es"
    #xsd/langString
     "Pokud je datová sada časovou řadou, měla by tato vlastnost odpovídat rozestupu položek v řadě. Pro ostatní druhy datových sad bude tato vlastnost obvykle indikovat nejmenší časovou vzdálenost mezi položkami této datové sady.@cs"
    #xsd/langString
     "Distintas distribuciones del conjunto de datos pueden tener resoluciones temporales diferentes.@es"
    #xsd/langString
     "If the dataset is a time-series this should correspond to the spacing of items in the series. For other kinds of dataset, this property will usually indicate the smallest time difference between items in the dataset.@en"
    #xsd/langString
     "Se il set di dati è una serie temporale, questo dovrebbe corrispondere alla spaziatura degli elementi della serie. Per altri tipi di set di dati, questa proprietà di solito indica la più piccola differenza di tempo tra gli elementi nel set di dati.@it"
    #xsd/langString
     "Hvis datasættet er en tidsserie, så bør denne egenskab svare til afstanden mellem elementerne i tidsserien. For andre typer af datasæt indikerer denne egenskab den mindste tidsforskel mellem elementer i datasættet.@da"
    #xsd/langString
     "Risoluzioni temporali alternative potrebbero essere fornite come diverse distribuzioni di set di dati.@it"]})

(def theme
  "tema"
  {:db/ident :dcat/theme,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   [#xsd/langString
     "La categoria principale della risorsa. Una risorsa può avere più temi.@it"
    #xsd/langString "Hlavní téma zdroje. Zdroj může mít více témat.@cs"
    #xsd/langString
     "La categoría principal del recurso. Un recurso puede tener varios temas.@es"
    #xsd/langString
     "A main category of the resource. A resource can have multiple themes.@en"
    #xsd/langString
     "التصنيف الرئيسي لقائمة البيانات. قائمة البيانات يمكن أن تملك أكثر من تصنيف رئيسي واحد.@ar"
    #xsd/langString
     "Et centralt emne for ressourcen. En ressource kan have flere centrale emner.@da"
    #xsd/langString
     "La catégorie principale de la ressource. Une ressource peut avoir plusieurs thèmes.@fr"
    #xsd/langString "データセットの主要カテゴリー。データセットは複数のテーマを持つことができます。@ja"
    #xsd/langString
     "Η κύρια κατηγορία του συνόλου δεδομένων. Ένα σύνολο δεδομένων δύναται να έχει πολλαπλά θέματα.@el"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "emne@da"
                #xsd/langString "Θέμα@el"
                #xsd/langString "theme@en"
                #xsd/langString "tema@es"
                #xsd/langString "tema@it"
                #xsd/langString "テーマ/カテゴリー@ja"
                #xsd/langString "téma@cs"
                #xsd/langString "التصنيف@ar"
                #xsd/langString "thème@fr"],
   :rdfs/range :skos/Concept,
   :rdfs/subPropertyOf :dcterms/subject,
   :skos/altLabel #xsd/langString "tema@da",
   :skos/definition
   [#xsd/langString "Hlavní téma zdroje. Zdroj může mít více témat.@cs"
    #xsd/langString
     "La catégorie principale de la ressource. Une ressource peut avoir plusieurs thèmes.@fr"
    #xsd/langString
     "La categoría principal del recurso. Un recurso puede tener varios temas.@es"
    #xsd/langString
     "Η κύρια κατηγορία του συνόλου δεδομένων. Ένα σύνολο δεδομένων δύναται να έχει πολλαπλά θέματα.@el"
    #xsd/langString
     "La categoria principale della risorsa. Una risorsa può avere più temi.@it"
    #xsd/langString "データセットの主要カテゴリー。データセットは複数のテーマを持つことができます。@ja"
    #xsd/langString
     "A main category of the resource. A resource can have multiple themes.@en"
    #xsd/langString
     "Et centralt emne for ressourcen. En ressource kan have flere centrale emner.@da"
    #xsd/langString
     "التصنيف الرئيسي لقائمة البيانات. قائمة البيانات يمكن أن تملك أكثر من تصنيف رئيسي واحد.@ar"],
   :skos/editorialNote
   #xsd/langString
    "Status: English Definition text modified by DCAT revision team, all except for Italian and Czech translations are pending.@en",
   :skos/scopeNote
   [#xsd/langString
     "El conjunto de skos:Concepts utilizados para categorizar los recursos están organizados en un skos:ConceptScheme que describe todas las categorías y sus relaciones en el catálogo.@es"
    #xsd/langString
     "データセットを分類するために用いられるskos:Conceptの集合は、カタログのすべてのカテゴリーとそれらの関係を記述しているskos:ConceptSchemeで組織化されます。@ja"
    #xsd/langString
     "Sada instancí třídy skos:Concept použitá pro kategorizaci zdrojů je organizována do schématu konceptů skos:ConceptScheme, které popisuje všechny kategorie v katalogu a jejich vztahy.@cs"
    #xsd/langString
     "Il set di concetti skos usati per categorizzare le risorse sono organizzati in skos:ConceptScheme che descrive tutte le categorie e le loro relazioni nel catalogo.@it"
    #xsd/langString
     "Samlingen af begreber (skos:Concept) der anvendes til at emneinddele ressourcer organiseres i et begrebssystem (skos:ConceptScheme) som beskriver alle emnerne og deres relationer i kataloget.@da"
    #xsd/langString
     "Un ensemble de skos:Concepts utilisés pour catégoriser les ressources sont organisés en un skos:ConceptScheme décrivant toutes les catégories et ses relations dans le catalogue.@fr"
    #xsd/langString
     "The set of skos:Concepts used to categorize the resources are organized in a skos:ConceptScheme describing all the categories and their relations in the catalog.@en"
    #xsd/langString
     "Το σετ των skos:Concepts που χρησιμοποιείται για να κατηγοριοποιήσει τα σύνολα δεδομένων είναι οργανωμένο εντός ενός skos:ConceptScheme που περιγράφει όλες τις κατηγορίες και τις σχέσεις αυτών στον κατάλογο.@el"]})

(def themeTaxonomy
  "temataksonomi"
  {:db/ident :dcat/themeTaxonomy,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   [#xsd/langString
     "Il sistema di organizzazione della conoscenza (KOS) usato per classificare i dataset del catalogo.@it"
    #xsd/langString
     "The knowledge organization system (KOS) used to classify catalog's datasets.@en"
    #xsd/langString
     "Le systhème d'ogranisation de connaissances utilisé pour classifier les jeux de données du catalogue.@fr"
    #xsd/langString
     "El sistema de organización del conocimiento utilizado para clasificar conjuntos de datos de catálogos.@es"
    #xsd/langString
     "Vidensorganiseringssystem (KOS) som anvendes til at klassificere datasæt i kataloget.@da"
    #xsd/langString
     "Systém organizace znalostí (KOS) použitý pro klasifikaci datových sad v katalogu.@cs"
    #xsd/langString
     "カタログのデータセットを分類するために用いられる知識組織化体系（KOS；knowledge organization system）。@ja"
    #xsd/langString
     "لائحة التصنيفات المستخدمه لتصنيف قوائم البيانات ضمن الفهرس@ar"
    #xsd/langString
     "Το σύστημα οργάνωσης γνώσης που χρησιμοποιείται για την κατηγοριοποίηση των συνόλων δεδομένων του καταλόγου.@el"],
   :rdfs/domain :dcat/Catalog,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-dcat/"},
   :rdfs/label [#xsd/langString "taxonomie de thèmes@fr"
                #xsd/langString "tassonomia dei temi@it"
                #xsd/langString "テーマ@ja"
                #xsd/langString "theme taxonomy@en"
                #xsd/langString "قائمة التصنيفات@ar"
                #xsd/langString "Ταξινομία θεματικών κατηγοριών.@el"
                #xsd/langString "emnetaksonomi@da"
                #xsd/langString "taxonomie témat@cs"
                #xsd/langString "taxonomía de temas@es"],
   :rdfs/range :rdfs/Resource,
   :schema/rangeIncludes [:skos/ConceptScheme :owl/Ontology :skos/Collection],
   :skos/altLabel #xsd/langString "temataksonomi@da",
   :skos/definition
   [#xsd/langString
     "Vidensorganiseringssystem (KOS) som anvendes til at klassificere datasæt i kataloget.@da"
    #xsd/langString
     "لائحة التصنيفات المستخدمه لتصنيف قوائم البيانات ضمن الفهرس@ar"
    #xsd/langString
     "El sistema de organización del conocimiento utilizado para clasificar conjuntos de datos de catálogos.@es"
    #xsd/langString
     "Systém organizace znalostí (KOS) použitý pro klasifikaci datových sad v katalogu.@cs"
    #xsd/langString
     "カタログのデータセットを分類するために用いられる知識組織化体系（KOS；knowledge organization system）。@ja"
    #xsd/langString
     "The knowledge organization system (KOS) used to classify catalog's datasets.@en"
    #xsd/langString
     "Il sistema di organizzazione della conoscenza (KOS) usato per classificare i dataset del catalogo.@it"
    #xsd/langString
     "Το σύστημα οργάνωσης γνώσης που χρησιμοποιείται για την κατηγοριοποίηση των συνόλων δεδομένων του καταλόγου.@el"
    #xsd/langString
     "Le systhème d'ogranisation de connaissances utilisé pour classifier les jeux de données du catalogue.@fr"],
   :skos/scopeNote
   [#xsd/langString
     "Det anbefales at taksonomien organiseres i et skos:ConceptScheme, skos:Collection, owl:Ontology eller lignende, som giver mulighed for at ethvert medlem af taksonomien kan forsynes med en IRI og udgives som linked-data.@da"
    #xsd/langString
     "It is recommended that the taxonomy is organized in a skos:ConceptScheme, skos:Collection, owl:Ontology or similar, which allows each member to be denoted by an IRI and published as linked-data.@en"
    #xsd/langString
     "Je doporučeno, aby byla taxonomie vyjádřena jako skos:ConceptScheme, skos:Collection, owl:Ontology nebo podobné, aby mohla být každá položka identifikována pomocí IRI a publikována jako propojená data.@cs"
    #xsd/langString
     "Se recomienda que la taxonomía se organice como un skos:ConceptScheme, skos:Collection, owl:Ontology o similar, los cuáles permiten que cada miembro se denote con una IRI y se publique como datos enlazados.@es"
    #xsd/langString
     "Si raccomanda che la tassonomia sia organizzata in uno skos:ConceptScheme, skos:Collection, owl:Ontology o simili, che permette ad ogni membro di essere indicato da un IRI e pubblicato come linked-data.@it"]})