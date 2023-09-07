(ns net.wikipunk.rdf.voaf
  ^{:base       "http://purl.org/vocommons/voaf#",
    :namespaces {"cc"      "http://creativecommons.org/ns#",
                 "dcterms" "http://purl.org/dc/terms/",
                 "foaf"    "http://xmlns.com/foaf/0.1/",
                 "frbr"    "http://purl.org/vocab/frbr/core#",
                 "owl"     "http://www.w3.org/2002/07/owl#",
                 "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                 "spin"    "http://spinrdf.org/spin#",
                 "spinsp"  "http://spinrdf.org/sp#",
                 "vann"    "http://purl.org/vocab/vann/",
                 "voaf"    "http://purl.org/vocommons/voaf#",
                 "vs"      "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
    :prefix     "voaf",
    :source     "net/wikipunk/ext/voaf.ttl"}
  {:cc/license {:xsd/anyURI "http://creativecommons.org/licenses/by/3.0/"},
   :dcterms/contributor
   #{{:xsd/anyURI
      "http://data.semanticweb.org/person/pierre-yves-vandenbussche"}
     {:xsd/anyURI "http://data.semanticweb.org/person/lise-rozat"}},
   :dcterms/creator {:xsd/anyURI
                     "http://data.semanticweb.org/person/bernard-vatant"},
   :dcterms/description
   #{{:rdf/language "fr",
      :rdf/value
      "Un vocabulaire de description des vocabulaires RDF et de leurs relations mutuelles"}
     {:rdf/language "en",
      :rdf/value
      "A vocabulary to describe linked data vocabularies and their relations."}},
   :dcterms/issued #inst "2011-03-11T00:00:00.000-00:00",
   :dcterms/modified #inst "2013-05-24T00:00:00.000-00:00",
   :dcterms/publisher {:xsd/anyURI
                       "http://dbpedia.org/resource/Open_Knowledge_Foundation"},
   :dcterms/title #{{:rdf/language "fr",
                     :rdf/value    "Vocabulaire d'un ami"}
                    {:rdf/language "en",
                     :rdf/value    "Vocabulary of a Friend"}},
   :frbr/realization #{{:xsd/anyURI "http://purl.org/vocommons/voaf/v1.0"}
                       {:xsd/anyURI "http://purl.org/vocommons/voaf/v1.1"}
                       {:xsd/anyURI "http://purl.org/vocommons/voaf/v2.3"}
                       {:xsd/anyURI "http://purl.org/vocommons/voaf/v2.2"}
                       {:xsd/anyURI "http://purl.org/vocommons/voaf/v2.0"}
                       {:xsd/anyURI "http://purl.org/vocommons/voaf/v2.1"}},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :vann/preferredNamespacePrefix "voaf",
   :vann/preferredNamespaceUri "http://purl.org/vocommons/voaf#",
   :voaf/exampleDataset {:xsd/anyURI "http://lov.okfn.org/dataset/lov/lov.rdf"},
   :xsd/anyURI "http://purl.org/vocommons/voaf"})

(def DatasetOccurrences
  {:db/ident :voaf/DatasetOccurrences,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "fr",
      :rdf/value
      "Classe utilisée pour stocker l'information d'occurences d'un vocabulaire dans un jeu de données"}
     {:rdf/language "en",
      :rdf/value
      "Class used to store the number of occurences of a vocabulary in a particular dataset"}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Dataset occurrences"}
                 {:rdf/language "fr",
                  :rdf/value    "Occurrences dans un jeu de données"}},
   :vs/term_status "testing"})

(def Vocabulary
  {:db/ident :voaf/Vocabulary,
   :owl/unionOf [{:owl/minCardinality 1,
                  :owl/onProperty     :voaf/reliesOn,
                  :rdf/type           :owl/Restriction}
                 {:owl/minCardinality 1,
                  :owl/onProperty     :voaf/usedBy,
                  :rdf/type           :owl/Restriction}],
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A vocabulary used in the linked data cloud. An instance of voaf:Vocabulary relies on or is used by at least another instance of voaf:Vocabulary"}
     {:rdf/language "fr",
      :rdf/value
      "Un vocabulaire utilisé ou utilisable dans le Web des données. Une instance de voaf:Vocabulary s'appuie at/ou est utilisée par au moins une autre instance of voaf:Vocabulary"}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "Vocabulaire"}
                 {:rdf/language "en",
                  :rdf/value    "Vocabulary"}},
   :rdfs/subClassOf #{:frbr/Work :void/Dataset},
   :vs/term_status "stable"})

(def VocabularySpace
  {:db/ident :voaf/VocabularySpace,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A vocabulary space defines any relevant grouping of vocabularies e.g., designed for similar purposes or domains, or designed by the same publisher or the same project, etc.\n          A vocabulary can belong to zero, one or more vocabulary spaces.Dublin Core properties isPartOf and hasPart are used to link a vocabulary to a vocabulary space."}
     {:rdf/language "fr",
      :rdf/value
      "Un Espace de vocabulaires définit un regroupement pertinent de vocabulaires, par exemple construits pour des domaines ou objectifs similaires, ou par le même déditeur ou le même projet, etc.\n         Un Vocabulaire peut appartenir à zéro, un ou plusieurs Espace de vocabulaires. Les propriétés Dublin Core isPartOf et hasPart sont utilisées pour relier un Vocabulaire à un Espace de vocabulaires."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Vocabulary Space"}
                 {:rdf/language "fr",
                  :rdf/value    "Espace de vocabulaires"}},
   :vs/term_status "testing"})

(def classNumber
  {:db/ident :voaf/classNumber,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t?vocab voaf:classNumber ?nbClass\n\t\t}\n\t\tWHERE{\n\t\t\tSELECT (COUNT(distinct ?class) AS ?nbClass) ?vocab\n\t\t\tWHERE{\n\t\t\t\t{?class a rdfs:Class.}\n\t\t\t\tUNION{?class a owl:Class.}\n\t\t\t\t?class a ?type.\n\t\t\t\tFILTER(?type!=owl:DeprecatedClass)\n\t\t\t\t?class rdfs:isDefinedBy ?vocab.\n\t\t\t\t?vocab a voaf:Vocabulary.\n\t\t\t}GROUP BY ?vocab\n\t\t}\n\t",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The number of classes defined in the vocabulary namespace. Classes imported from other namespaces are not taken into account."}
     {:rdf/language "fr",
      :rdf/value
      "Le nombre de classes définies dans l'espace de noms du Vocabulaire. Les classes importées d'autres vocabulaires ne sont pas comptabilisées."}},
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "number of classes"}
                 {:rdf/language "fr",
                  :rdf/value    "nombre de classes"}},
   :rdfs/range :xsd/integer,
   :vs/term_status "stable"})

(def dataset
  {:db/ident             :voaf/dataset,
   :dcterms/isReplacedBy :voaf/DatasetOccurrences,
   :owl/inverseOf        :void/vocabulary,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         #{{:rdf/language "en",
                            :rdf/value    "Deprecated since v2.4"}
                           {:rdf/language "fr",
                            :rdf/value    "Déprécié depuis la v2.4"}},
   :rdfs/domain          :voaf/Vocabulary,
   :rdfs/isDefinedBy     {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label           #{{:rdf/language "fr",
                            :rdf/value    "jeu de données"}
                           {:rdf/language "en",
                            :rdf/value    "dataset"}},
   :rdfs/range           :void/Dataset,
   :vs/term_status       "deprecated"})

(def exampleDataset
  {:db/ident             :voaf/exampleDataset,
   :dcterms/isReplacedBy :voaf/dataset,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         #{{:rdf/language "fr",
                            :rdf/value    "Déprécié depuis la v1.1"}
                           {:rdf/language "en",
                            :rdf/value    "Deprecated since v1.1"}},
   :rdfs/isDefinedBy     {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label           #{{:rdf/language "fr",
                            :rdf/value    "exemple de jeu de données"}
                           {:rdf/language "en",
                            :rdf/value    "example dataset"}},
   :vs/term_status       "deprecated"})

(def extends
  {:db/ident :voaf/extends,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:extends ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 owl:inverseOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:domain ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:range ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem2 rdfs:domain ?elem1. FILTER(!isBlank(?elem1))}\n\t\t\tUNION{?elem2 rdfs:range ?elem1. FILTER(!isBlank(?elem1))}\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Indicates that the subject vocabulary extends the expressivity of the object vocabulary by declaring subsumption relationships, using object vocabulary class as domain or range of a subject vocabulary property, defining local restrictions etc ..."}
     {:rdf/language "fr",
      :rdf/value
      "Indique que le vocabulaire sujet étend l'expressivité du vocabulaire objet en déclarant des relations de subsomption avec ce dernier, ou en utilisant ses classes comme domaine ou co-domaine d'un propriété du vocabulaire sujet, ou en définissant des contraintes locales etc."}},
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "étend"}
                 {:rdf/language "en",
                  :rdf/value    "extends"}},
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "stable"})

(def generalizes
  {:db/ident :voaf/generalizes,
   :dcterms/description
   "\n\t\tPREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:generalizes ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 skos:narrowMatch ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem2 rdfs:subPropertyOf ?elem1.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:rest ?union4. ?union4 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:rest ?union4. ?union4 rdf:rest ?union5. ?union5 rdf:first ?elem2.}\n\t\t\tFILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Indicates that the subject vocabulary generalizes by some superclasses or superproperties the object vocabulary."}
     {:rdf/language "fr",
      :rdf/value
      "Indique que le vocabulaire sujet définit des super-classes ou super-propriétés du vocabulaire objet"}},
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "generalizes"}
                 {:rdf/language "fr",
                  :rdf/value    "généralise"}},
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "stable"})

(def hasDisjunctionsWith
  {:db/ident :voaf/hasDisjunctionsWith,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:hasDisjunctionsWith ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t?elem1 owl:disjointWith ?elem2. FILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Indicates that the subject vocabulary contains some declaration of disjoint classes with the object vocabulary."}
     {:rdf/language "fr",
      :rdf/value
      "Indique que le vocabulaire sujet contient des déclarations de classes disjointes avec le vocabulaire objet"}},
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "a des disjonctions avec"}
                 {:rdf/language "en",
                  :rdf/value    "has disjunctions with"}},
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "testing"})

(def hasEquivalencesWith
  {:db/ident :voaf/hasEquivalencesWith,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:hasEquivalencesWith ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 owl:equivalentProperty ?elem2.}\n\t\t\tUNION{?elem1 owl:sameAs ?elem2.}\n\t\t\tUNION{?elem1 owl:equivalentClass ?elem2.}\n\t\t\tUNION{?elem2 owl:equivalentProperty ?elem1.}\n\t\t\tUNION{?elem2 owl:equivalentClass ?elem1.}\n\t\t\tUNION{?elem1 skos:exactMatch ?elem2.}\n\t\t\tUNION{?elem2 skos:exactMatch ?elem1.}\n\t\t\tFILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Indicates that the subject vocabulary declares some equivalent classes or properties with the object vocabulary."}
     {:rdf/language "fr",
      :rdf/value
      "Indique que le vocabulaire sujet déclare des équivalences de classes ou de propriétés avec le vocabulaire objet"}},
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "a des équivalences avec"}
                 {:rdf/language "en",
                  :rdf/value    "has equivalences with"}},
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "testing"})

(def inDataset
  {:db/ident         :voaf/inDataset,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #{{:rdf/language "fr",
                        :rdf/value
                        "jeu de données dans lequel un vocabulaire apparait"}
                       {:rdf/language "en",
                        :rdf/value "dataset in which a vocabulary occurred"}},
   :rdfs/domain      :voaf/DatasetOccurrences,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "in dataset"}
                       {:rdf/language "fr",
                        :rdf/value    "dans le jeu de données"}},
   :rdfs/range       :void/Dataset,
   :vs/term_status   "testing"})

(def metadataVoc
  {:db/ident :voaf/metadataVoc,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:metadataVoc ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t?elem1 ?elem2 ?o.\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "fr",
      :rdf/value
      "Indique que le vocabulaire sujet utilise le vocabulaire objet pour décrire ses métadonnées, au niveau global du vocabulaire ou au niveau des éléments"}
     {:rdf/language "en",
      :rdf/value
      "Indicates that the subject vocabulary uses the object vocabulary in metadata at global vocabulary level or at element level"}},
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "vocabulaire de métadonnées"}
                 {:rdf/language "en",
                  :rdf/value    "metadata vocabulary"}},
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "stable"})

(def occurrences
  {:db/ident         :voaf/occurrences,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #{{:rdf/language "fr",
                        :rdf/value
                        "nombre d'occurrences d'un vocabulaire dans un dataset"}
                       {:rdf/language "en",
                        :rdf/value
                        "Number of occurrences of a vocabulary in a dataset"}},
   :rdfs/domain      :voaf/DatasetOccurrences,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label       #{{:rdf/language "fr",
                        :rdf/value    "occurrences"}
                       {:rdf/language "en",
                        :rdf/value    "occurrences"}},
   :rdfs/range       :xsd/integer,
   :vs/term_status   "testing"})

(def occurrencesInDatasets
  {:db/ident         :voaf/occurrencesInDatasets,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #{{:rdf/language "fr",
                        :rdf/value
                        "Nombre de jeux de données utilisant une ressource."}
                       {:rdf/language "en",
                        :rdf/value    "Number of datasets using a resource."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "occurrences in datasets"}
                       {:rdf/language "fr",
                        :rdf/value    "occurences dans des datasets"}},
   :rdfs/range       :xsd/integer,
   :vs/term_status   "testing"})

(def occurrencesInVocabularies
  {:db/ident         :voaf/occurrencesInVocabularies,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #{{:rdf/language "en",
                        :rdf/value    "Number of vocabularies using a resource"}
                       {:rdf/language "fr",
                        :rdf/value
                        "Nombre de vocabulaires utilisant une ressource."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label       #{{:rdf/language "fr",
                        :rdf/value    "occurences dans des vocabulaires"}
                       {:rdf/language "en",
                        :rdf/value    "occurrences in vocabularies"}},
   :rdfs/range       :xsd/integer,
   :vs/term_status   "testing"})

(def propertyNumber
  {:db/ident :voaf/propertyNumber,
   :dcterms/description
   "\n\t\tPREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t?vocab voaf:propertyNumber ?nbProp\n\t\t}\n\t\tWHERE{\n\t\t\tSELECT (COUNT(distinct ?prop) AS ?nbProp) ?vocab\n\t\t\tWHERE{\n\t\t\t\t{?prop a rdf:Property.}\n\t\t\t\tUNION{?prop a owl:ObjectProperty.}\n\t\t\t\tUNION{?prop a owl:DatatypeProperty.}\n\t\t\t\tUNION{?prop a owl:AnnotationProperty.}\n\t\t\t\tUNION{?prop a owl:FunctionalProperty.}\n\t\t\t\tUNION{?prop a owl:OntologyProperty.}\n\t\t\t\tUNION{?prop a owl:AsymmetricProperty.}\n\t\t\t\tUNION{?prop a owl:InverseFunctionalProperty.}\n\t\t\t\tUNION{?prop a owl:IrreflexiveProperty.}\n\t\t\t\tUNION{?prop a owl:ReflexiveProperty.}\n\t\t\t\tUNION{?prop a owl:SymmetricProperty.}\n\t\t\t\tUNION{?prop a owl:TransitiveProperty.}\n\t\t\t\t?prop a ?type.\n\t\t\t\tFILTER(?type!=owl:DeprecatedProperty)\n\t\t\t\t?prop rdfs:isDefinedBy ?vocab.\n\t\t\t\t?vocab a voaf:Vocabulary.\n\t\t\t}GROUP BY ?vocab\n\t\t}\n\t",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "fr",
      :rdf/value
      "Le nombre de propriétés définies dans l'espace de noms du Vocabulaire. Les propriétés importées d'autres vocabulaires ne sont pas comptabilisées."}
     {:rdf/language "en",
      :rdf/value
      "The number of properties defined in the vocabulary namespace. Properties imported from other namespaces are not taken into account."}},
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "number of properties"}
                 {:rdf/language "fr",
                  :rdf/value    "nombre de propriétés"}},
   :rdfs/range :xsd/integer,
   :vs/term_status "stable"})

(def reliesOn
  {:db/ident :voaf/reliesOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Indicates that the subject vocabulary uses or extends some class or property of the object vocabulary"}
     {:rdf/language "fr",
      :rdf/value
      "Indique que le vocabulaire sujet utilise ou étend au moins une classe ou propriété du vocabulaire objet"}},
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "réutilise"}
                 {:rdf/language "en",
                  :rdf/value    "relies on"}},
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf #{:void/vocabulary :dcterms/references},
   :vs/term_status "stable"})

(def reusedByDatasets
  {:db/ident :voaf/reusedByDatasets,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value    "Distinct number of datasets reusing a resource."}
     {:rdf/language "fr",
      :rdf/value
      "Nombre distinct de jeux de données reutilisant une resource."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "réutilisé par des jeux de données"}
                 {:rdf/language "en",
                  :rdf/value    "reused by datasets"}},
   :rdfs/range :xsd/integer,
   :vs/term_status "testing"})

(def reusedByVocabularies
  {:db/ident :voaf/reusedByVocabularies,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value    "Distinct number of vocabularies reusing a resource."}
     {:rdf/language "fr",
      :rdf/value "Nombre distinct de vocabulaires reutilisant une resource."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "reused by vocabularies"}
                 {:rdf/language "fr",
                  :rdf/value    "réutilisé par des vocabulaires"}},
   :rdfs/range :xsd/integer,
   :vs/term_status "testing"})

(def similar
  {:db/ident :voaf/similar,
   :rdf/type #{:owl/SymmetricProperty :owl/ObjectProperty},
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Used to assert that two vocabularies are similar in scope and objectives, independently of the fact that they otherwise refer to each other."}
     {:rdf/language "fr",
      :rdf/value
      "Indique que deux vocabulaires sont similaires dans leur domaine et/ou leurs objectifs, sans être nécessairement reliés par des références."}},
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "similaire"}
                 {:rdf/language "en",
                  :rdf/value    "similar"}},
   :rdfs/range :voaf/Vocabulary,
   :vs/term_status "testing"})

(def specializes
  {:db/ident :voaf/specializes,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:specializes ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 rdfs:subPropertyOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:subClassOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 skos:broadMatch ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Indicates that the subject vocabulary defines some subclasses or subproperties of the object vocabulary, or local restrictions on those."}
     {:rdf/language "fr",
      :rdf/value
      "Indique que le vocabulaire sujet définit des sous-classes ou sous-propriétés du vocabulaire objet"}},
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "spécialise"}
                 {:rdf/language "en",
                  :rdf/value    "specializes"}},
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "stable"})

(def toDoList
  {:db/ident :voaf/toDoList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "fr",
      :rdf/value
      "Liste des tâches prévues par le gestionnaire d'une ressource. Cette propriété est destinée à l'usage des gestionnaires de vocabulaires ou de jeu de données mais son doamine est ouvert, elle peut être utilisée pour n'importe quelle ressource. Utiliser la classe ical:Vtodo pour une description fine des tâches : calendrier, priorités etc"}
     {:rdf/language "en",
      :rdf/value
      "Describes future tasks planned by a resource curator. This property is primarily intended to be used for vocabularies or datasets, but the domain is left open, it can be used for any resource. Use iCalendar Vtodo class and its properties to further describe the task calendar, priorities etc."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "liste des choses à faire"}
                 {:rdf/language "en",
                  :rdf/value    "to-do list"}},
   :rdfs/range {:xsd/anyURI "http://www.w3.org/2002/12/cal/ical#Vtodo"},
   :vs/term_status "stable"})

(def usageInDataset
  {:db/ident         :voaf/usageInDataset,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #{{:rdf/language "fr",
                        :rdf/value
                        "statistiques d'utilisation dans un jeu de données"}
                       {:rdf/language "en",
                        :rdf/value    "usage statistics in a dataset"}},
   :rdfs/domain      :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label       #{{:rdf/language "fr",
                        :rdf/value    "utilisation dans un jeu de données"}
                       {:rdf/language "en",
                        :rdf/value    "usage in dataset"}},
   :rdfs/range       :voaf/DatasetOccurrences,
   :vs/term_status   "testing"})

(def usedBy
  {:db/ident :voaf/usedBy,
   :owl/inverseOf :voaf/reliesOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "fr",
      :rdf/value
      "Indique que le vocabulaire sujet est utilisé par le vocabulaire objet"}
     {:rdf/language "en",
      :rdf/value
      "Indicates that the subject vocabulary is used by the object vocabulary"}},
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocommons/voaf"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "used by"}
                 {:rdf/language "fr",
                  :rdf/value    "utilisé par"}},
   :rdfs/range :voaf/Vocabulary,
   :vs/term_status "stable"})

(def urn:uuid:2a6508ef-6c86-56db-96fa-50b8f7262964
  {:frbr/alternate {:xsd/anyURI
                    "http://purl.org/vocommons/voaf/v2.3/index.html"},
   :rdf/type       :frbr/Manifestation,
   :xsd/anyURI     "http://purl.org/vocommons/voaf/v2.3/voaf_v2.3.rdf"})

(def urn:uuid:7435d409-1c45-58ed-92ee-f1a8d3e742d4
  {:rdf/type   :frbr/Manifestation,
   :xsd/anyURI "http://purl.org/vocommons/voaf/v2.2/index.html"})

(def urn:uuid:ee51b09b-9e5f-5021-b29f-7be4ef9995b8
  {:dcterms/date    "2011-03-11",
   :frbr/embodiment {:xsd/anyURI
                     "http://purl.org/vocommons/voaf/v1.0/voaf_v1.0.rdf"},
   :owl/versionInfo "1.0",
   :rdf/type        :frbr/Expression,
   :rdfs/comment    #{{:rdf/language "fr",
                       :rdf/value    "Première publication"}
                      {:rdf/language "en",
                       :rdf/value    "First published version"}},
   :xsd/anyURI      "http://purl.org/vocommons/voaf/v1.0"})

(def urn:uuid:6440ee41-c6d9-50c5-adbd-85b19b3c4838
  {:frbr/alternate {:xsd/anyURI
                    "http://purl.org/vocommons/voaf/v1.0/index.html"},
   :rdf/type       :frbr/Manifestation,
   :xsd/anyURI     "http://purl.org/vocommons/voaf/v1.0/voaf_v1.0.rdf"})

(def urn:uuid:519521a3-faaa-5d4a-be04-493ce92d49f9
  {:dcterms/date "2011-11-16",
   :frbr/embodiment {:xsd/anyURI
                     "http://purl.org/vocommons/voaf/v1.1/voaf_v1.1.rdf"},
   :owl/versionInfo "1.1",
   :rdf/type :frbr/Expression,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Depreciation of voaf:exampleDataset, replaced by voaf:dataset"}
     {:rdf/language "fr",
      :rdf/value
      "Dépréciation de voaf:exampleDataset, remplacé par voaf:dataset"}},
   :xsd/anyURI "http://purl.org/vocommons/voaf/v1.1"})

(def urn:uuid:492dc11f-e8ea-5573-b807-f4c03239facd
  {:rdf/type   :foaf/Person,
   :xsd/anyURI "http://data.semanticweb.org/person/bernard-vatant"})

(def urn:uuid:2db7f569-9de1-5011-8b65-0c276fd9febd
  {:rdf/type   :frbr/Manifestation,
   :xsd/anyURI "http://purl.org/vocommons/voaf/v2.0/index.html"})

(def urn:uuid:6c86b106-025b-5743-be55-4e39f9f1e1ad
  {:frbr/alternate {:xsd/anyURI
                    "http://purl.org/vocommons/voaf/v2.2/index.html"},
   :rdf/type       :frbr/Manifestation,
   :xsd/anyURI     "http://purl.org/vocommons/voaf/v2.2/voaf_v2.2.rdf"})

(def urn:uuid:5aec2dbd-a353-560c-92df-961dd11962b4
  {:rdf/type   :foaf/Person,
   :xsd/anyURI "http://data.semanticweb.org/person/pierre-yves-vandenbussche"})

(def urn:uuid:750860e9-1605-53e7-a6e4-ce1d81931a8a
  {:rdf/type   :frbr/Manifestation,
   :xsd/anyURI "http://purl.org/vocommons/voaf/v2.1/index.html"})

(def urn:uuid:07ce2da5-80c9-5a8f-8e12-ba0e2471d7de
  {:rdf/type   :frbr/Manifestation,
   :xsd/anyURI "http://purl.org/vocommons/voaf/v2.3/index.html"})

(def urn:uuid:8435f637-baa8-5e96-bc44-70e49bbac833
  {:dcterms/creator
   {:xsd/anyURI "http://data.semanticweb.org/person/pierre-yves-vandenbussche"},
   :dcterms/date "2013-04-24",
   :frbr/embodiment {:xsd/anyURI
                     "http://purl.org/vocommons/voaf/v2.2/voaf_v2.2.rdf"},
   :owl/versionInfo "2.2",
   :rdf/type :frbr/Expression,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Added properties to represent metrics of vocabulary elements usage in LOV and LOD"}
     {:rdf/language "fr",
      :rdf/value
      "Ajout de propriétés pour représenter les métriques d'usage d'éléments de vocabulaire dans le LOV et le LOD"}},
   :xsd/anyURI "http://purl.org/vocommons/voaf/v2.2"})

(def urn:uuid:0b472bbc-f2a2-589f-95d3-c0c846121284
  {:rdf/type   :foaf/Person,
   :xsd/anyURI "http://data.semanticweb.org/person/lise-rozat"})

(def urn:uuid:61f3164d-5985-5cfb-83cf-b8075f195b01
  {:dcterms/creator
   {:xsd/anyURI "http://data.semanticweb.org/person/pierre-yves-vandenbussche"},
   :dcterms/date "2012-10-15",
   :frbr/embodiment {:xsd/anyURI
                     "http://purl.org/vocommons/voaf/v2.1/voaf_v2.1.rdf"},
   :owl/versionInfo "2.1",
   :rdf/type :frbr/Expression,
   :rdfs/comment
   #{{:rdf/language "fr",
      :rdf/value
      "Ajout des requêtes pour générer des relations VOAF entre deux vocabulaires"}
     {:rdf/language "en",
      :rdf/value
      "Added desrciption of queries used to infer a particular VOAF relation between two vocabularies"}},
   :xsd/anyURI "http://purl.org/vocommons/voaf/v2.1"})

(def urn:uuid:c0ef5b87-3f14-5d49-ae6f-3df246537b1b
  {:dcterms/creator {:xsd/anyURI
                     "http://data.semanticweb.org/person/bernard-vatant"},
   :dcterms/date "2012-07-03",
   :frbr/embodiment {:xsd/anyURI
                     "http://purl.org/vocommons/voaf/v2.0/voaf_v2.0.rdf"},
   :owl/versionInfo "2.0",
   :rdf/type :frbr/Expression,
   :rdfs/comment
   #{{:rdf/language "fr",
      :rdf/value
      "Namespace migré sous purl. Introduction des versions avec FRBR. voaf:Vocabulary rdfs:subClassOf  frbr:Work. Ajout des traductions françaises"}
     {:rdf/language "en",
      :rdf/value
      "Namespace moved to purl. Introduction of versions using FRBR. voaf:Vocabulary rdfs:subClassOf  frbr:Work. Added labels and comments in French"}},
   :xsd/anyURI "http://purl.org/vocommons/voaf/v2.0"})

(def urn:uuid:0d8076ab-9a8b-5427-876c-61c24c07ffdf
  {:frbr/alternate {:xsd/anyURI
                    "http://purl.org/vocommons/voaf/v2.1/index.html"},
   :rdf/type       :frbr/Manifestation,
   :xsd/anyURI     "http://purl.org/vocommons/voaf/v2.1/voaf_v2.1.rdf"})

(def urn:uuid:7fbd5e90-408f-581f-97d6-d4249a43f693
  {:rdf/type   :frbr/Manifestation,
   :xsd/anyURI "http://purl.org/vocommons/voaf/v1.1/index.html"})

(def urn:uuid:9ae541b6-eb98-5969-b3e1-b0a3bff53c81
  {:frbr/alternate {:xsd/anyURI
                    "http://purl.org/vocommons/voaf/v1.1/index.html"},
   :rdf/type       :frbr/Manifestation,
   :xsd/anyURI     "http://purl.org/vocommons/voaf/v1.1/voaf_v1.1.rdf"})

(def urn:uuid:aa5c81b6-15c2-5ebd-a59d-aff454353c16
  {:rdf/type   :frbr/Manifestation,
   :xsd/anyURI "http://purl.org/vocommons/voaf/v1.0/index.html"})

(def urn:uuid:ef095782-7d45-5340-92e5-fa98b0a99333
  {:dcterms/creator
   {:xsd/anyURI "http://data.semanticweb.org/person/pierre-yves-vandenbussche"},
   :dcterms/date "2013-05-24",
   :frbr/embodiment {:xsd/anyURI
                     "http://purl.org/vocommons/voaf/v2.3/voaf_v2.3.rdf"},
   :owl/versionInfo "2.3",
   :rdf/type :frbr/Expression,
   :rdfs/comment
   #{{:rdf/language "fr",
      :rdf/value
      "Remplacement de voaf:dataset par un objet permettant d'attacher la notion d'occurrenceet ajout supplémentaire de propriétés pour représenter les métriques d'usage d'éléments de vocabulaire dans le LOV et le LOD"}
     {:rdf/language "en",
      :rdf/value
      "Refined the voaf:dataset to a more complex element with occurrences information and added extra properties to represent metrics of vocabulary elements usage in LOV and LOD"}},
   :xsd/anyURI "http://purl.org/vocommons/voaf/v2.3"})

(def urn:uuid:6137f943-7d5d-51ea-a995-0fd4f581beed
  {:rdf/type   :foaf/Organization,
   :xsd/anyURI "http://dbpedia.org/resource/Open_Knowledge_Foundation"})

(def urn:uuid:e5c160a6-a5a1-5119-9aa9-641b7ab3d4d8
  {:cc/license {:xsd/anyURI "http://creativecommons.org/licenses/by/3.0/"},
   :dcterms/contributor
   #{{:xsd/anyURI
      "http://data.semanticweb.org/person/pierre-yves-vandenbussche"}
     {:xsd/anyURI "http://data.semanticweb.org/person/lise-rozat"}},
   :dcterms/creator {:xsd/anyURI
                     "http://data.semanticweb.org/person/bernard-vatant"},
   :dcterms/description
   #{{:rdf/language "fr",
      :rdf/value
      "Un vocabulaire de description des vocabulaires RDF et de leurs relations mutuelles"}
     {:rdf/language "en",
      :rdf/value
      "A vocabulary to describe linked data vocabularies and their relations."}},
   :dcterms/issued #inst "2011-03-11T00:00:00.000-00:00",
   :dcterms/modified #inst "2013-05-24T00:00:00.000-00:00",
   :dcterms/publisher {:xsd/anyURI
                       "http://dbpedia.org/resource/Open_Knowledge_Foundation"},
   :dcterms/title #{{:rdf/language "fr",
                     :rdf/value    "Vocabulaire d'un ami"}
                    {:rdf/language "en",
                     :rdf/value    "Vocabulary of a Friend"}},
   :frbr/realization #{{:xsd/anyURI "http://purl.org/vocommons/voaf/v1.0"}
                       {:xsd/anyURI "http://purl.org/vocommons/voaf/v1.1"}
                       {:xsd/anyURI "http://purl.org/vocommons/voaf/v2.3"}
                       {:xsd/anyURI "http://purl.org/vocommons/voaf/v2.2"}
                       {:xsd/anyURI "http://purl.org/vocommons/voaf/v2.0"}
                       {:xsd/anyURI "http://purl.org/vocommons/voaf/v2.1"}},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :vann/preferredNamespacePrefix "voaf",
   :vann/preferredNamespaceUri "http://purl.org/vocommons/voaf#",
   :voaf/exampleDataset {:xsd/anyURI "http://lov.okfn.org/dataset/lov/lov.rdf"},
   :xsd/anyURI "http://purl.org/vocommons/voaf"})

(def urn:uuid:232407d5-63dd-5903-9b3b-83ec7764e21a
  {:frbr/alternate {:xsd/anyURI
                    "http://purl.org/vocommons/voaf/v2.0/index.html"},
   :rdf/type       :frbr/Manifestation,
   :xsd/anyURI     "http://purl.org/vocommons/voaf/v2.0/voaf_v2.0.rdf"})