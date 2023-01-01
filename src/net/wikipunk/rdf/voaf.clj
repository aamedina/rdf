(ns net.wikipunk.rdf.voaf
  "A vocabulary to describe linked data vocabularies and their relations."
  {:cc/license "http://creativecommons.org/licenses/by/3.0/",
   :dcat/downloadURL
   "https://lov.linkeddata.es/vocommons/voaf/v2.3/voaf_v2.3.rdf",
   :dcterms/contributor
   ["http://data.semanticweb.org/person/lise-rozat"
    "http://data.semanticweb.org/person/pierre-yves-vandenbussche"],
   :dcterms/creator "http://data.semanticweb.org/person/bernard-vatant",
   :dcterms/description
   [{:rdf/language "en",
     :rdf/value
     "A vocabulary to describe linked data vocabularies and their relations."}
    {:rdf/language "fr",
     :rdf/value
     "Un vocabulaire de description des vocabulaires RDF et de leurs relations mutuelles"}],
   :dcterms/issued #inst "2011-03-11T00:00:00.000-05:00",
   :dcterms/modified #inst "2013-05-24T00:00:00.000-04:00",
   :dcterms/publisher "http://dbpedia.org/resource/Open_Knowledge_Foundation",
   :dcterms/title [{:rdf/language "en",
                    :rdf/value    "Vocabulary of a Friend"}
                   {:rdf/language "fr",
                    :rdf/value    "Vocabulaire d'un ami"}],
   :frbr/realization ["http://purl.org/vocommons/voaf/v1.0"
                      "http://purl.org/vocommons/voaf/v2.0"
                      "http://purl.org/vocommons/voaf/v2.2"
                      "http://purl.org/vocommons/voaf/v2.1"
                      "http://purl.org/vocommons/voaf/v1.1"
                      "http://purl.org/vocommons/voaf/v2.3"],
   :rdf/ns-prefix-map {"cc" "http://creativecommons.org/ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "frbr" "http://purl.org/vocab/frbr/core#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "spin" "http://spinrdf.org/spin#",
                       "spinsp" "http://spinrdf.org/sp#",
                       "vann" "http://purl.org/vocab/vann/",
                       "voaf" "http://purl.org/vocommons/voaf#",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type [:owl/Ontology :voaf/Vocabulary],
   :rdf/uri "http://purl.org/vocommons/voaf",
   :rdfa/prefix "voaf",
   :rdfa/uri "http://purl.org/vocommons/voaf#",
   :vann/preferredNamespacePrefix "voaf",
   :vann/preferredNamespaceUri "http://purl.org/vocommons/voaf#",
   :voaf/exampleDataset "http://lov.okfn.org/dataset/lov/lov.rdf"})

(def DatasetOccurrences
  "Class used to store the number of occurences of a vocabulary in a particular dataset"
  {:db/ident :voaf/DatasetOccurrences,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value
     "Classe utilisée pour stocker l'information d'occurences d'un vocabulaire dans un jeu de données"}
    {:rdf/language "en",
     :rdf/value
     "Class used to store the number of occurences of a vocabulary in a particular dataset"}],
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Occurrences dans un jeu de données"}
                {:rdf/language "en",
                 :rdf/value    "Dataset occurrences"}],
   :vs/term_status "testing"})

(def Vocabulary
  "A vocabulary used in the linked data cloud. An instance of voaf:Vocabulary relies on or is used by at least another instance of voaf:Vocabulary"
  {:db/ident :voaf/Vocabulary,
   :owl/unionOf [{:owl/minCardinality "1",
                  :owl/onProperty     :voaf/reliesOn,
                  :rdf/type           :owl/Restriction}
                 {:owl/minCardinality "1",
                  :owl/onProperty     :voaf/usedBy,
                  :rdf/type           :owl/Restriction}],
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "A vocabulary used in the linked data cloud. An instance of voaf:Vocabulary relies on or is used by at least another instance of voaf:Vocabulary"}
    {:rdf/language "fr",
     :rdf/value
     "Un vocabulaire utilisé ou utilisable dans le Web des données. Une instance de voaf:Vocabulary s'appuie at/ou est utilisée par au moins une autre instance of voaf:Vocabulary"}],
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Vocabulaire"}
                {:rdf/language "en",
                 :rdf/value    "Vocabulary"}],
   :rdfs/subClassOf [:frbr/Work :void/Dataset],
   :vs/term_status "stable"})

(def VocabularySpace
  "A vocabulary space defines any relevant grouping of vocabularies e.g., designed for similar purposes or domains, or designed by the same publisher or the same project, etc. A vocabulary can belong to zero, one or more vocabulary spaces.Dublin Core properties isPartOf and hasPart are used to link a vocabulary to a vocabulary space."
  {:db/ident :voaf/VocabularySpace,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value
     "Un Espace de vocabulaires définit un regroupement pertinent de vocabulaires, par exemple construits pour des domaines ou objectifs similaires, ou par le même déditeur ou le même projet, etc.\n         Un Vocabulaire peut appartenir à zéro, un ou plusieurs Espace de vocabulaires. Les propriétés Dublin Core isPartOf et hasPart sont utilisées pour relier un Vocabulaire à un Espace de vocabulaires."}
    {:rdf/language "en",
     :rdf/value
     "A vocabulary space defines any relevant grouping of vocabularies e.g., designed for similar purposes or domains, or designed by the same publisher or the same project, etc.\n          A vocabulary can belong to zero, one or more vocabulary spaces.Dublin Core properties isPartOf and hasPart are used to link a vocabulary to a vocabulary space."}],
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Espace de vocabulaires"}
                {:rdf/language "en",
                 :rdf/value    "Vocabulary Space"}],
   :vs/term_status "testing"})

(def classNumber
  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#> PREFIX owl:<http://www.w3.org/2002/07/owl#> PREFIX voaf:<http://purl.org/vocommons/voaf#> CONSTRUCT{ ?vocab voaf:classNumber ?nbClass } WHERE{ SELECT (COUNT(distinct ?class) AS ?nbClass) ?vocab WHERE{ {?class a rdfs:Class.} UNION{?class a owl:Class.} ?class a ?type. FILTER(?type!=owl:DeprecatedClass) ?class rdfs:isDefinedBy ?vocab. ?vocab a voaf:Vocabulary. }GROUP BY ?vocab }"
  {:db/ident :voaf/classNumber,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t?vocab voaf:classNumber ?nbClass\n\t\t}\n\t\tWHERE{\n\t\t\tSELECT (COUNT(distinct ?class) AS ?nbClass) ?vocab\n\t\t\tWHERE{\n\t\t\t\t{?class a rdfs:Class.}\n\t\t\t\tUNION{?class a owl:Class.}\n\t\t\t\t?class a ?type.\n\t\t\t\tFILTER(?type!=owl:DeprecatedClass)\n\t\t\t\t?class rdfs:isDefinedBy ?vocab.\n\t\t\t\t?vocab a voaf:Vocabulary.\n\t\t\t}GROUP BY ?vocab\n\t\t}\n\t",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The number of classes defined in the vocabulary namespace. Classes imported from other namespaces are not taken into account."}
    {:rdf/language "fr",
     :rdf/value
     "Le nombre de classes définies dans l'espace de noms du Vocabulaire. Les classes importées d'autres vocabulaires ne sont pas comptabilisées."}],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "nombre de classes"}
                {:rdf/language "en",
                 :rdf/value    "number of classes"}],
   :rdfs/range :xsd/integer,
   :vs/term_status "stable"})

(def dataset
  "Deprecated since v2.4"
  {:db/ident             :voaf/dataset,
   :dcterms/isReplacedBy :voaf/DatasetOccurrences,
   :owl/inverseOf        :void/vocabulary,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         [{:rdf/language "fr",
                           :rdf/value    "Déprécié depuis la v2.4"}
                          {:rdf/language "en",
                           :rdf/value    "Deprecated since v2.4"}],
   :rdfs/domain          :voaf/Vocabulary,
   :rdfs/isDefinedBy     "http://purl.org/vocommons/voaf",
   :rdfs/label           [{:rdf/language "en",
                           :rdf/value    "dataset"}
                          {:rdf/language "fr",
                           :rdf/value    "jeu de données"}],
   :rdfs/range           :void/Dataset,
   :vs/term_status       "deprecated"})

(def exampleDataset
  "Deprecated since v1.1"
  {:db/ident             :voaf/exampleDataset,
   :dcterms/isReplacedBy :voaf/dataset,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         [{:rdf/language "fr",
                           :rdf/value    "Déprécié depuis la v1.1"}
                          {:rdf/language "en",
                           :rdf/value    "Deprecated since v1.1"}],
   :rdfs/isDefinedBy     "http://purl.org/vocommons/voaf",
   :rdfs/label           [{:rdf/language "fr",
                           :rdf/value    "exemple de jeu de données"}
                          {:rdf/language "en",
                           :rdf/value    "example dataset"}],
   :vs/term_status       "deprecated"})

(def extends
  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#> PREFIX owl:<http://www.w3.org/2002/07/owl#> PREFIX voaf:<http://purl.org/vocommons/voaf#> CONSTRUCT{ ?vocab1 voaf:extends ?vocab2 } WHERE{ {?elem1 owl:inverseOf ?elem2. FILTER(!isBlank(?elem2))} UNION{?elem1 rdfs:domain ?elem2. FILTER(!isBlank(?elem2))} UNION{?elem1 rdfs:range ?elem2. FILTER(!isBlank(?elem2))} UNION{?elem2 rdfs:domain ?elem1. FILTER(!isBlank(?elem1))} UNION{?elem2 rdfs:range ?elem1. FILTER(!isBlank(?elem1))} ?elem1 rdfs:isDefinedBy ?vocab1. ?vocab1 a voaf:Vocabulary. ?elem2 rdfs:isDefinedBy ?vocab2. ?vocab2 a voaf:Vocabulary. FILTER(?vocab1!=?vocab2) }"
  {:db/ident :voaf/extends,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:extends ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 owl:inverseOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:domain ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:range ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem2 rdfs:domain ?elem1. FILTER(!isBlank(?elem1))}\n\t\t\tUNION{?elem2 rdfs:range ?elem1. FILTER(!isBlank(?elem1))}\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Indicates that the subject vocabulary extends the expressivity of the object vocabulary by declaring subsumption relationships, using object vocabulary class as domain or range of a subject vocabulary property, defining local restrictions etc ..."}
    {:rdf/language "fr",
     :rdf/value
     "Indique que le vocabulaire sujet étend l'expressivité du vocabulaire objet en déclarant des relations de subsomption avec ce dernier, ou en utilisant ses classes comme domaine ou co-domaine d'un propriété du vocabulaire sujet, ou en définissant des contraintes locales etc."}],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "étend"}
                {:rdf/language "en",
                 :rdf/value    "extends"}],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "stable"})

(def generalizes
  "PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#> PREFIX owl:<http://www.w3.org/2002/07/owl#> PREFIX voaf:<http://purl.org/vocommons/voaf#> PREFIX skos:<http://www.w3.org/2004/02/skos/core#> CONSTRUCT{ ?vocab1 voaf:generalizes ?vocab2 } WHERE{ {?elem1 skos:narrowMatch ?elem2. FILTER(!isBlank(?elem2))} UNION{?elem2 rdfs:subPropertyOf ?elem1.} UNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:first ?elem2.} UNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:first ?elem2.} UNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:first ?elem2.} UNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:rest ?union4. ?union4 rdf:first ?elem2.} UNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:rest ?union4. ?union4 rdf:rest ?union5. ?union5 rdf:first ?elem2.} FILTER(!isBlank(?elem2)) ?elem1 rdfs:isDefinedBy ?vocab1. ?vocab1 a voaf:Vocabulary. ?elem2 rdfs:isDefinedBy ?vocab2. ?vocab2 a voaf:Vocabulary. FILTER(?vocab1!=?vocab2) }"
  {:db/ident :voaf/generalizes,
   :dcterms/description
   "\n\t\tPREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:generalizes ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 skos:narrowMatch ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem2 rdfs:subPropertyOf ?elem1.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:rest ?union4. ?union4 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:rest ?union4. ?union4 rdf:rest ?union5. ?union5 rdf:first ?elem2.}\n\t\t\tFILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Indicates that the subject vocabulary generalizes by some superclasses or superproperties the object vocabulary."}
    {:rdf/language "fr",
     :rdf/value
     "Indique que le vocabulaire sujet définit des super-classes ou super-propriétés du vocabulaire objet"}],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "généralise"}
                {:rdf/language "en",
                 :rdf/value    "generalizes"}],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "stable"})

(def hasDisjunctionsWith
  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#> PREFIX owl:<http://www.w3.org/2002/07/owl#> PREFIX voaf:<http://purl.org/vocommons/voaf#> CONSTRUCT{ ?vocab1 voaf:hasDisjunctionsWith ?vocab2 } WHERE{ ?elem1 owl:disjointWith ?elem2. FILTER(!isBlank(?elem2)) ?elem1 rdfs:isDefinedBy ?vocab1. ?vocab1 a voaf:Vocabulary. ?elem2 rdfs:isDefinedBy ?vocab2. ?vocab2 a voaf:Vocabulary. FILTER(?vocab1!=?vocab2) }"
  {:db/ident :voaf/hasDisjunctionsWith,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:hasDisjunctionsWith ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t?elem1 owl:disjointWith ?elem2. FILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Indicates that the subject vocabulary contains some declaration of disjoint classes with the object vocabulary."}
    {:rdf/language "fr",
     :rdf/value
     "Indique que le vocabulaire sujet contient des déclarations de classes disjointes avec le vocabulaire objet"}],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "a des disjonctions avec"}
                {:rdf/language "en",
                 :rdf/value    "has disjunctions with"}],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "testing"})

(def hasEquivalencesWith
  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#> PREFIX owl:<http://www.w3.org/2002/07/owl#> PREFIX voaf:<http://purl.org/vocommons/voaf#> PREFIX skos:<http://www.w3.org/2004/02/skos/core#> CONSTRUCT{ ?vocab1 voaf:hasEquivalencesWith ?vocab2 } WHERE{ {?elem1 owl:equivalentProperty ?elem2.} UNION{?elem1 owl:sameAs ?elem2.} UNION{?elem1 owl:equivalentClass ?elem2.} UNION{?elem2 owl:equivalentProperty ?elem1.} UNION{?elem2 owl:equivalentClass ?elem1.} UNION{?elem1 skos:exactMatch ?elem2.} UNION{?elem2 skos:exactMatch ?elem1.} FILTER(!isBlank(?elem2)) ?elem1 rdfs:isDefinedBy ?vocab1. ?vocab1 a voaf:Vocabulary. ?elem2 rdfs:isDefinedBy ?vocab2. ?vocab2 a voaf:Vocabulary. FILTER(?vocab1!=?vocab2) }"
  {:db/ident :voaf/hasEquivalencesWith,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:hasEquivalencesWith ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 owl:equivalentProperty ?elem2.}\n\t\t\tUNION{?elem1 owl:sameAs ?elem2.}\n\t\t\tUNION{?elem1 owl:equivalentClass ?elem2.}\n\t\t\tUNION{?elem2 owl:equivalentProperty ?elem1.}\n\t\t\tUNION{?elem2 owl:equivalentClass ?elem1.}\n\t\t\tUNION{?elem1 skos:exactMatch ?elem2.}\n\t\t\tUNION{?elem2 skos:exactMatch ?elem1.}\n\t\t\tFILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value
     "Indique que le vocabulaire sujet déclare des équivalences de classes ou de propriétés avec le vocabulaire objet"}
    {:rdf/language "en",
     :rdf/value
     "Indicates that the subject vocabulary declares some equivalent classes or properties with the object vocabulary."}],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "a des équivalences avec"}
                {:rdf/language "en",
                 :rdf/value    "has equivalences with"}],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "testing"})

(def inDataset
  "dataset in which a vocabulary occurred"
  {:db/ident         :voaf/inDataset,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value
                       "jeu de données dans lequel un vocabulaire apparait"}
                      {:rdf/language "en",
                       :rdf/value    "dataset in which a vocabulary occurred"}],
   :rdfs/domain      :voaf/DatasetOccurrences,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "dans le jeu de données"}
                      {:rdf/language "en",
                       :rdf/value    "in dataset"}],
   :rdfs/range       :void/Dataset,
   :vs/term_status   "testing"})

(def metadataVoc
  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#> PREFIX owl:<http://www.w3.org/2002/07/owl#> PREFIX voaf:<http://purl.org/vocommons/voaf#> CONSTRUCT{ ?vocab1 voaf:metadataVoc ?vocab2 } WHERE{ ?elem1 ?elem2 ?o. ?elem1 rdfs:isDefinedBy ?vocab1. ?vocab1 a voaf:Vocabulary. ?elem2 rdfs:isDefinedBy ?vocab2. ?vocab2 a voaf:Vocabulary. FILTER(?vocab1!=?vocab2) }"
  {:db/ident :voaf/metadataVoc,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:metadataVoc ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t?elem1 ?elem2 ?o.\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value
     "Indique que le vocabulaire sujet utilise le vocabulaire objet pour décrire ses métadonnées, au niveau global du vocabulaire ou au niveau des éléments"}
    {:rdf/language "en",
     :rdf/value
     "Indicates that the subject vocabulary uses the object vocabulary in metadata at global vocabulary level or at element level"}],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "vocabulaire de métadonnées"}
                {:rdf/language "en",
                 :rdf/value    "metadata vocabulary"}],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "stable"})

(def occurrences
  "Number of occurrences of a vocabulary in a dataset"
  {:db/ident         :voaf/occurrences,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value
                       "nombre d'occurrences d'un vocabulaire dans un dataset"}
                      {:rdf/language "en",
                       :rdf/value
                       "Number of occurrences of a vocabulary in a dataset"}],
   :rdfs/domain      :voaf/DatasetOccurrences,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "occurrences"}
                      {:rdf/language "en",
                       :rdf/value    "occurrences"}],
   :rdfs/range       :xsd/integer,
   :vs/term_status   "testing"})

(def occurrencesInDatasets
  "Number of datasets using a resource."
  {:db/ident         :voaf/occurrencesInDatasets,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value
                       "Nombre de jeux de données utilisant une ressource."}
                      {:rdf/language "en",
                       :rdf/value    "Number of datasets using a resource."}],
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "occurences dans des datasets"}
                      {:rdf/language "en",
                       :rdf/value    "occurrences in datasets"}],
   :rdfs/range       :xsd/integer,
   :vs/term_status   "testing"})

(def occurrencesInVocabularies
  "Number of vocabularies using a resource"
  {:db/ident         :voaf/occurrencesInVocabularies,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value
                       "Nombre de vocabulaires utilisant une ressource."}
                      {:rdf/language "en",
                       :rdf/value "Number of vocabularies using a resource"}],
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "occurences dans des vocabulaires"}
                      {:rdf/language "en",
                       :rdf/value    "occurrences in vocabularies"}],
   :rdfs/range       :xsd/integer,
   :vs/term_status   "testing"})

(def propertyNumber
  "PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#> PREFIX owl:<http://www.w3.org/2002/07/owl#> PREFIX voaf:<http://purl.org/vocommons/voaf#> CONSTRUCT{ ?vocab voaf:propertyNumber ?nbProp } WHERE{ SELECT (COUNT(distinct ?prop) AS ?nbProp) ?vocab WHERE{ {?prop a rdf:Property.} UNION{?prop a owl:ObjectProperty.} UNION{?prop a owl:DatatypeProperty.} UNION{?prop a owl:AnnotationProperty.} UNION{?prop a owl:FunctionalProperty.} UNION{?prop a owl:OntologyProperty.} UNION{?prop a owl:AsymmetricProperty.} UNION{?prop a owl:InverseFunctionalProperty.} UNION{?prop a owl:IrreflexiveProperty.} UNION{?prop a owl:ReflexiveProperty.} UNION{?prop a owl:SymmetricProperty.} UNION{?prop a owl:TransitiveProperty.} ?prop a ?type. FILTER(?type!=owl:DeprecatedProperty) ?prop rdfs:isDefinedBy ?vocab. ?vocab a voaf:Vocabulary. }GROUP BY ?vocab }"
  {:db/ident :voaf/propertyNumber,
   :dcterms/description
   "\n\t\tPREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t?vocab voaf:propertyNumber ?nbProp\n\t\t}\n\t\tWHERE{\n\t\t\tSELECT (COUNT(distinct ?prop) AS ?nbProp) ?vocab\n\t\t\tWHERE{\n\t\t\t\t{?prop a rdf:Property.}\n\t\t\t\tUNION{?prop a owl:ObjectProperty.}\n\t\t\t\tUNION{?prop a owl:DatatypeProperty.}\n\t\t\t\tUNION{?prop a owl:AnnotationProperty.}\n\t\t\t\tUNION{?prop a owl:FunctionalProperty.}\n\t\t\t\tUNION{?prop a owl:OntologyProperty.}\n\t\t\t\tUNION{?prop a owl:AsymmetricProperty.}\n\t\t\t\tUNION{?prop a owl:InverseFunctionalProperty.}\n\t\t\t\tUNION{?prop a owl:IrreflexiveProperty.}\n\t\t\t\tUNION{?prop a owl:ReflexiveProperty.}\n\t\t\t\tUNION{?prop a owl:SymmetricProperty.}\n\t\t\t\tUNION{?prop a owl:TransitiveProperty.}\n\t\t\t\t?prop a ?type.\n\t\t\t\tFILTER(?type!=owl:DeprecatedProperty)\n\t\t\t\t?prop rdfs:isDefinedBy ?vocab.\n\t\t\t\t?vocab a voaf:Vocabulary.\n\t\t\t}GROUP BY ?vocab\n\t\t}\n\t",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The number of properties defined in the vocabulary namespace. Properties imported from other namespaces are not taken into account."}
    {:rdf/language "fr",
     :rdf/value
     "Le nombre de propriétés définies dans l'espace de noms du Vocabulaire. Les propriétés importées d'autres vocabulaires ne sont pas comptabilisées."}],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "number of properties"}
                {:rdf/language "fr",
                 :rdf/value    "nombre de propriétés"}],
   :rdfs/range :xsd/integer,
   :vs/term_status "stable"})

(def reliesOn
  "Indicates that the subject vocabulary uses or extends some class or property of the object vocabulary"
  {:db/ident :voaf/reliesOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value
     "Indique que le vocabulaire sujet utilise ou étend au moins une classe ou propriété du vocabulaire objet"}
    {:rdf/language "en",
     :rdf/value
     "Indicates that the subject vocabulary uses or extends some class or property of the object vocabulary"}],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "réutilise"}
                {:rdf/language "en",
                 :rdf/value    "relies on"}],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf [:void/vocabulary :dcterms/references],
   :vs/term_status "stable"})

(def reusedByDatasets
  "Distinct number of datasets reusing a resource."
  {:db/ident :voaf/reusedByDatasets,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value "Nombre distinct de jeux de données reutilisant une resource."}
    {:rdf/language "en",
     :rdf/value    "Distinct number of datasets reusing a resource."}],
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "réutilisé par des jeux de données"}
                {:rdf/language "en",
                 :rdf/value    "reused by datasets"}],
   :rdfs/range :xsd/integer,
   :vs/term_status "testing"})

(def reusedByVocabularies
  "Distinct number of vocabularies reusing a resource."
  {:db/ident :voaf/reusedByVocabularies,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value    "Nombre distinct de vocabulaires reutilisant une resource."}
    {:rdf/language "en",
     :rdf/value    "Distinct number of vocabularies reusing a resource."}],
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "réutilisé par des vocabulaires"}
                {:rdf/language "en",
                 :rdf/value    "reused by vocabularies"}],
   :rdfs/range :xsd/integer,
   :vs/term_status "testing"})

(def similar
  "Used to assert that two vocabularies are similar in scope and objectives, independently of the fact that they otherwise refer to each other."
  {:db/ident :voaf/similar,
   :rdf/type [:owl/ObjectProperty :owl/SymmetricProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Used to assert that two vocabularies are similar in scope and objectives, independently of the fact that they otherwise refer to each other."}
    {:rdf/language "fr",
     :rdf/value
     "Indique que deux vocabulaires sont similaires dans leur domaine et/ou leurs objectifs, sans être nécessairement reliés par des références."}],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "similaire"}
                {:rdf/language "en",
                 :rdf/value    "similar"}],
   :rdfs/range :voaf/Vocabulary,
   :vs/term_status "testing"})

(def specializes
  "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#> PREFIX voaf:<http://purl.org/vocommons/voaf#> PREFIX skos:<http://www.w3.org/2004/02/skos/core#> CONSTRUCT{ ?vocab1 voaf:specializes ?vocab2 } WHERE{ {?elem1 rdfs:subPropertyOf ?elem2. FILTER(!isBlank(?elem2))} UNION{?elem1 rdfs:subClassOf ?elem2. FILTER(!isBlank(?elem2))} UNION{?elem1 skos:broadMatch ?elem2. FILTER(!isBlank(?elem2))} ?elem1 rdfs:isDefinedBy ?vocab1. ?vocab1 a voaf:Vocabulary. ?elem2 rdfs:isDefinedBy ?vocab2. ?vocab2 a voaf:Vocabulary. FILTER(?vocab1!=?vocab2) }"
  {:db/ident :voaf/specializes,
   :dcterms/description
   "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:specializes ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 rdfs:subPropertyOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:subClassOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 skos:broadMatch ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Indicates that the subject vocabulary defines some subclasses or subproperties of the object vocabulary, or local restrictions on those."}
    {:rdf/language "fr",
     :rdf/value
     "Indique que le vocabulaire sujet définit des sous-classes ou sous-propriétés du vocabulaire objet"}],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "specializes"}
                {:rdf/language "fr",
                 :rdf/value    "spécialise"}],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf :voaf/reliesOn,
   :vs/term_status "stable"})

(def toDoList
  "Describes future tasks planned by a resource curator. This property is primarily intended to be used for vocabularies or datasets, but the domain is left open, it can be used for any resource. Use iCalendar Vtodo class and its properties to further describe the task calendar, priorities etc."
  {:db/ident :voaf/toDoList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "fr",
     :rdf/value
     "Liste des tâches prévues par le gestionnaire d'une ressource. Cette propriété est destinée à l'usage des gestionnaires de vocabulaires ou de jeu de données mais son doamine est ouvert, elle peut être utilisée pour n'importe quelle ressource. Utiliser la classe ical:Vtodo pour une description fine des tâches : calendrier, priorités etc"}
    {:rdf/language "en",
     :rdf/value
     "Describes future tasks planned by a resource curator. This property is primarily intended to be used for vocabularies or datasets, but the domain is left open, it can be used for any resource. Use iCalendar Vtodo class and its properties to further describe the task calendar, priorities etc."}],
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "liste des choses à faire"}
                {:rdf/language "en",
                 :rdf/value    "to-do list"}],
   :rdfs/range "http://www.w3.org/2002/12/cal/ical#Vtodo",
   :vs/term_status "stable"})

(def usageInDataset
  "usage statistics in a dataset"
  {:db/ident         :voaf/usageInDataset,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     [{:rdf/language "fr",
                       :rdf/value
                       "statistiques d'utilisation dans un jeu de données"}
                      {:rdf/language "en",
                       :rdf/value    "usage statistics in a dataset"}],
   :rdfs/domain      :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "utilisation dans un jeu de données"}
                      {:rdf/language "en",
                       :rdf/value    "usage in dataset"}],
   :rdfs/range       :voaf/DatasetOccurrences,
   :vs/term_status   "testing"})

(def usedBy
  "Indicates that the subject vocabulary is used by the object vocabulary"
  {:db/ident :voaf/usedBy,
   :owl/inverseOf :voaf/reliesOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Indicates that the subject vocabulary is used by the object vocabulary"}
    {:rdf/language "fr",
     :rdf/value
     "Indique que le vocabulaire sujet est utilisé par le vocabulaire objet"}],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy "http://purl.org/vocommons/voaf",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "used by"}
                {:rdf/language "fr",
                 :rdf/value    "utilisé par"}],
   :rdfs/range :voaf/Vocabulary,
   :vs/term_status "stable"})