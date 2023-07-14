(ns net.wikipunk.rdf.voaf
  {:dcat/downloadURL  "resources/voaf.ttl",
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
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "voaf",
   :rdfa/uri          "http://purl.org/vocommons/voaf#"})

(def DatasetOccurrences
  {:db/ident :voaf/DatasetOccurrences,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Classe utilisée pour stocker l'information d'occurences d'un vocabulaire dans un jeu de données@fr"
    #xsd/langString
     "Class used to store the number of occurences of a vocabulary in a particular dataset@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "Occurrences dans un jeu de données@fr"
                #xsd/langString "Dataset occurrences@en"],
   :vs/term_status #xsd/string "testing"})

(def Vocabulary
  {:db/ident :voaf/Vocabulary,
   :owl/unionOf [{:owl/minCardinality #xsd/nonNegativeInteger 1,
                  :owl/onProperty     :voaf/reliesOn,
                  :rdf/type           :owl/Restriction}
                 {:owl/minCardinality #xsd/nonNegativeInteger 1,
                  :owl/onProperty     :voaf/usedBy,
                  :rdf/type           :owl/Restriction}],
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "A vocabulary used in the linked data cloud. An instance of voaf:Vocabulary relies on or is used by at least another instance of voaf:Vocabulary@en"
    #xsd/langString
     "Un vocabulaire utilisé ou utilisable dans le Web des données. Une instance de voaf:Vocabulary s'appuie at/ou est utilisée par au moins une autre instance of voaf:Vocabulary@fr"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "Vocabulaire@fr"
                #xsd/langString "Vocabulary@en"],
   :rdfs/subClassOf [:frbr/Work :void/Dataset],
   :vs/term_status #xsd/string "stable"})

(def VocabularySpace
  {:db/ident :voaf/VocabularySpace,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Un Espace de vocabulaires définit un regroupement pertinent de vocabulaires, par exemple construits pour des domaines ou objectifs similaires, ou par le même déditeur ou le même projet, etc.\n         Un Vocabulaire peut appartenir à zéro, un ou plusieurs Espace de vocabulaires. Les propriétés Dublin Core isPartOf et hasPart sont utilisées pour relier un Vocabulaire à un Espace de vocabulaires.@fr"
    #xsd/langString
     "A vocabulary space defines any relevant grouping of vocabularies e.g., designed for similar purposes or domains, or designed by the same publisher or the same project, etc.\n          A vocabulary can belong to zero, one or more vocabulary spaces.Dublin Core properties isPartOf and hasPart are used to link a vocabulary to a vocabulary space.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "Espace de vocabulaires@fr"
                #xsd/langString "Vocabulary Space@en"],
   :vs/term_status #xsd/string "testing"})

(def classNumber
  "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t?vocab voaf:classNumber ?nbClass\n\t\t}\n\t\tWHERE{\n\t\t\tSELECT (COUNT(distinct ?class) AS ?nbClass) ?vocab\n\t\t\tWHERE{\n\t\t\t\t{?class a rdfs:Class.}\n\t\t\t\tUNION{?class a owl:Class.}\n\t\t\t\t?class a ?type.\n\t\t\t\tFILTER(?type!=owl:DeprecatedClass)\n\t\t\t\t?class rdfs:isDefinedBy ?vocab.\n\t\t\t\t?vocab a voaf:Vocabulary.\n\t\t\t}GROUP BY ?vocab\n\t\t}\n\t"
  {:db/ident :voaf/classNumber,
   :dcterms/description
   #xsd/string
    "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t?vocab voaf:classNumber ?nbClass\n\t\t}\n\t\tWHERE{\n\t\t\tSELECT (COUNT(distinct ?class) AS ?nbClass) ?vocab\n\t\t\tWHERE{\n\t\t\t\t{?class a rdfs:Class.}\n\t\t\t\tUNION{?class a owl:Class.}\n\t\t\t\t?class a ?type.\n\t\t\t\tFILTER(?type!=owl:DeprecatedClass)\n\t\t\t\t?class rdfs:isDefinedBy ?vocab.\n\t\t\t\t?vocab a voaf:Vocabulary.\n\t\t\t}GROUP BY ?vocab\n\t\t}\n\t",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "The number of classes defined in the vocabulary namespace. Classes imported from other namespaces are not taken into account.@en"
    #xsd/langString
     "Le nombre de classes définies dans l'espace de noms du Vocabulaire. Les classes importées d'autres vocabulaires ne sont pas comptabilisées.@fr"],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "nombre de classes@fr"
                #xsd/langString "number of classes@en"],
   :rdfs/range :xsd/integer,
   :vs/term_status #xsd/string "stable"})

(def dataset
  {:db/ident             :voaf/dataset,
   :dcterms/isReplacedBy :voaf/DatasetOccurrences,
   :owl/inverseOf        :void/vocabulary,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         [#xsd/langString "Déprécié depuis la v2.4@fr"
                          #xsd/langString "Deprecated since v2.4@en"],
   :rdfs/domain          :voaf/Vocabulary,
   :rdfs/isDefinedBy     {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label           [#xsd/langString "dataset@en"
                          #xsd/langString "jeu de données@fr"],
   :rdfs/range           :void/Dataset,
   :vs/term_status       #xsd/string "deprecated"})

(def exampleDataset
  {:db/ident             :voaf/exampleDataset,
   :dcterms/isReplacedBy :voaf/dataset,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         [#xsd/langString "Déprécié depuis la v1.1@fr"
                          #xsd/langString "Deprecated since v1.1@en"],
   :rdfs/isDefinedBy     {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label           [#xsd/langString "exemple de jeu de données@fr"
                          #xsd/langString "example dataset@en"],
   :vs/term_status       #xsd/string "deprecated"})

(def extends
  "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:extends ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 owl:inverseOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:domain ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:range ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem2 rdfs:domain ?elem1. FILTER(!isBlank(?elem1))}\n\t\t\tUNION{?elem2 rdfs:range ?elem1. FILTER(!isBlank(?elem1))}\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t"
  {:db/ident :voaf/extends,
   :dcterms/description
   #xsd/string
    "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:extends ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 owl:inverseOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:domain ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:range ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem2 rdfs:domain ?elem1. FILTER(!isBlank(?elem1))}\n\t\t\tUNION{?elem2 rdfs:range ?elem1. FILTER(!isBlank(?elem1))}\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Indicates that the subject vocabulary extends the expressivity of the object vocabulary by declaring subsumption relationships, using object vocabulary class as domain or range of a subject vocabulary property, defining local restrictions etc ...@en"
    #xsd/langString
     "Indique que le vocabulaire sujet étend l'expressivité du vocabulaire objet en déclarant des relations de subsomption avec ce dernier, ou en utilisant ses classes comme domaine ou co-domaine d'un propriété du vocabulaire sujet, ou en définissant des contraintes locales etc.@fr"],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "étend@fr" #xsd/langString "extends@en"],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf [:voaf/reliesOn :void/vocabulary :dcterms/references],
   :vs/term_status #xsd/string "stable"})

(def generalizes
  "\n\t\tPREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:generalizes ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 skos:narrowMatch ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem2 rdfs:subPropertyOf ?elem1.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:rest ?union4. ?union4 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:rest ?union4. ?union4 rdf:rest ?union5. ?union5 rdf:first ?elem2.}\n\t\t\tFILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t"
  {:db/ident :voaf/generalizes,
   :dcterms/description
   #xsd/string
    "\n\t\tPREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:generalizes ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 skos:narrowMatch ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem2 rdfs:subPropertyOf ?elem1.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:rest ?union4. ?union4 rdf:first ?elem2.}\n\t\t\tUNION{?elem1 a owl:Class. ?elem1 owl:unionOf ?union. ?union rdf:rest ?union2. ?union2 rdf:rest ?union3. ?union3 rdf:rest ?union4. ?union4 rdf:rest ?union5. ?union5 rdf:first ?elem2.}\n\t\t\tFILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Indicates that the subject vocabulary generalizes by some superclasses or superproperties the object vocabulary.@en"
    #xsd/langString
     "Indique que le vocabulaire sujet définit des super-classes ou super-propriétés du vocabulaire objet@fr"],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "généralise@fr"
                #xsd/langString "generalizes@en"],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf [:voaf/reliesOn :void/vocabulary :dcterms/references],
   :vs/term_status #xsd/string "stable"})

(def hasDisjunctionsWith
  "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:hasDisjunctionsWith ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t?elem1 owl:disjointWith ?elem2. FILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t"
  {:db/ident :voaf/hasDisjunctionsWith,
   :dcterms/description
   #xsd/string
    "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:hasDisjunctionsWith ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t?elem1 owl:disjointWith ?elem2. FILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Indicates that the subject vocabulary contains some declaration of disjoint classes with the object vocabulary.@en"
    #xsd/langString
     "Indique que le vocabulaire sujet contient des déclarations de classes disjointes avec le vocabulaire objet@fr"],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "a des disjonctions avec@fr"
                #xsd/langString "has disjunctions with@en"],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf [:voaf/reliesOn :void/vocabulary :dcterms/references],
   :vs/term_status #xsd/string "testing"})

(def hasEquivalencesWith
  "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:hasEquivalencesWith ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 owl:equivalentProperty ?elem2.}\n\t\t\tUNION{?elem1 owl:sameAs ?elem2.}\n\t\t\tUNION{?elem1 owl:equivalentClass ?elem2.}\n\t\t\tUNION{?elem2 owl:equivalentProperty ?elem1.}\n\t\t\tUNION{?elem2 owl:equivalentClass ?elem1.}\n\t\t\tUNION{?elem1 skos:exactMatch ?elem2.}\n\t\t\tUNION{?elem2 skos:exactMatch ?elem1.}\n\t\t\tFILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t"
  {:db/ident :voaf/hasEquivalencesWith,
   :dcterms/description
   #xsd/string
    "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:hasEquivalencesWith ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 owl:equivalentProperty ?elem2.}\n\t\t\tUNION{?elem1 owl:sameAs ?elem2.}\n\t\t\tUNION{?elem1 owl:equivalentClass ?elem2.}\n\t\t\tUNION{?elem2 owl:equivalentProperty ?elem1.}\n\t\t\tUNION{?elem2 owl:equivalentClass ?elem1.}\n\t\t\tUNION{?elem1 skos:exactMatch ?elem2.}\n\t\t\tUNION{?elem2 skos:exactMatch ?elem1.}\n\t\t\tFILTER(!isBlank(?elem2))\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Indique que le vocabulaire sujet déclare des équivalences de classes ou de propriétés avec le vocabulaire objet@fr"
    #xsd/langString
     "Indicates that the subject vocabulary declares some equivalent classes or properties with the object vocabulary.@en"],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "a des équivalences avec@fr"
                #xsd/langString "has equivalences with@en"],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf [:voaf/reliesOn :void/vocabulary :dcterms/references],
   :vs/term_status #xsd/string "testing"})

(def inDataset
  {:db/ident         :voaf/inDataset,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     [#xsd/langString
                       "jeu de données dans lequel un vocabulaire apparait@fr"
                      #xsd/langString
                       "dataset in which a vocabulary occurred@en"],
   :rdfs/domain      :voaf/DatasetOccurrences,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label       [#xsd/langString "dans le jeu de données@fr"
                      #xsd/langString "in dataset@en"],
   :rdfs/range       :void/Dataset,
   :vs/term_status   #xsd/string "testing"})

(def metadataVoc
  "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:metadataVoc ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t?elem1 ?elem2 ?o.\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t"
  {:db/ident :voaf/metadataVoc,
   :dcterms/description
   #xsd/string
    "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:metadataVoc ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t?elem1 ?elem2 ?o.\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Indique que le vocabulaire sujet utilise le vocabulaire objet pour décrire ses métadonnées, au niveau global du vocabulaire ou au niveau des éléments@fr"
    #xsd/langString
     "Indicates that the subject vocabulary uses the object vocabulary in metadata at global vocabulary level or at element level@en"],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "vocabulaire de métadonnées@fr"
                #xsd/langString "metadata vocabulary@en"],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf [:voaf/reliesOn :void/vocabulary :dcterms/references],
   :vs/term_status #xsd/string "stable"})

(def occurrences
  {:db/ident :voaf/occurrences,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString "nombre d'occurrences d'un vocabulaire dans un dataset@fr"
    #xsd/langString "Number of occurrences of a vocabulary in a dataset@en"],
   :rdfs/domain :voaf/DatasetOccurrences,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "occurrences@fr"
                #xsd/langString "occurrences@en"],
   :rdfs/range :xsd/integer,
   :vs/term_status #xsd/string "testing"})

(def occurrencesInDatasets
  {:db/ident         :voaf/occurrencesInDatasets,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     [#xsd/langString
                       "Nombre de jeux de données utilisant une ressource.@fr"
                      #xsd/langString
                       "Number of datasets using a resource.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label       [#xsd/langString "occurences dans des datasets@fr"
                      #xsd/langString "occurrences in datasets@en"],
   :rdfs/range       :xsd/integer,
   :vs/term_status   #xsd/string "testing"})

(def occurrencesInVocabularies
  {:db/ident         :voaf/occurrencesInVocabularies,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     [#xsd/langString
                       "Nombre de vocabulaires utilisant une ressource.@fr"
                      #xsd/langString
                       "Number of vocabularies using a resource@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label       [#xsd/langString "occurences dans des vocabulaires@fr"
                      #xsd/langString "occurrences in vocabularies@en"],
   :rdfs/range       :xsd/integer,
   :vs/term_status   #xsd/string "testing"})

(def propertyNumber
  "\n\t\tPREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t?vocab voaf:propertyNumber ?nbProp\n\t\t}\n\t\tWHERE{\n\t\t\tSELECT (COUNT(distinct ?prop) AS ?nbProp) ?vocab\n\t\t\tWHERE{\n\t\t\t\t{?prop a rdf:Property.}\n\t\t\t\tUNION{?prop a owl:ObjectProperty.}\n\t\t\t\tUNION{?prop a owl:DatatypeProperty.}\n\t\t\t\tUNION{?prop a owl:AnnotationProperty.}\n\t\t\t\tUNION{?prop a owl:FunctionalProperty.}\n\t\t\t\tUNION{?prop a owl:OntologyProperty.}\n\t\t\t\tUNION{?prop a owl:AsymmetricProperty.}\n\t\t\t\tUNION{?prop a owl:InverseFunctionalProperty.}\n\t\t\t\tUNION{?prop a owl:IrreflexiveProperty.}\n\t\t\t\tUNION{?prop a owl:ReflexiveProperty.}\n\t\t\t\tUNION{?prop a owl:SymmetricProperty.}\n\t\t\t\tUNION{?prop a owl:TransitiveProperty.}\n\t\t\t\t?prop a ?type.\n\t\t\t\tFILTER(?type!=owl:DeprecatedProperty)\n\t\t\t\t?prop rdfs:isDefinedBy ?vocab.\n\t\t\t\t?vocab a voaf:Vocabulary.\n\t\t\t}GROUP BY ?vocab\n\t\t}\n\t"
  {:db/ident :voaf/propertyNumber,
   :dcterms/description
   #xsd/string
    "\n\t\tPREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX owl:<http://www.w3.org/2002/07/owl#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\t\n\t\tCONSTRUCT{\n\t\t?vocab voaf:propertyNumber ?nbProp\n\t\t}\n\t\tWHERE{\n\t\t\tSELECT (COUNT(distinct ?prop) AS ?nbProp) ?vocab\n\t\t\tWHERE{\n\t\t\t\t{?prop a rdf:Property.}\n\t\t\t\tUNION{?prop a owl:ObjectProperty.}\n\t\t\t\tUNION{?prop a owl:DatatypeProperty.}\n\t\t\t\tUNION{?prop a owl:AnnotationProperty.}\n\t\t\t\tUNION{?prop a owl:FunctionalProperty.}\n\t\t\t\tUNION{?prop a owl:OntologyProperty.}\n\t\t\t\tUNION{?prop a owl:AsymmetricProperty.}\n\t\t\t\tUNION{?prop a owl:InverseFunctionalProperty.}\n\t\t\t\tUNION{?prop a owl:IrreflexiveProperty.}\n\t\t\t\tUNION{?prop a owl:ReflexiveProperty.}\n\t\t\t\tUNION{?prop a owl:SymmetricProperty.}\n\t\t\t\tUNION{?prop a owl:TransitiveProperty.}\n\t\t\t\t?prop a ?type.\n\t\t\t\tFILTER(?type!=owl:DeprecatedProperty)\n\t\t\t\t?prop rdfs:isDefinedBy ?vocab.\n\t\t\t\t?vocab a voaf:Vocabulary.\n\t\t\t}GROUP BY ?vocab\n\t\t}\n\t",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "The number of properties defined in the vocabulary namespace. Properties imported from other namespaces are not taken into account.@en"
    #xsd/langString
     "Le nombre de propriétés définies dans l'espace de noms du Vocabulaire. Les propriétés importées d'autres vocabulaires ne sont pas comptabilisées.@fr"],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "number of properties@en"
                #xsd/langString "nombre de propriétés@fr"],
   :rdfs/range :xsd/integer,
   :vs/term_status #xsd/string "stable"})

(def reliesOn
  {:db/ident :voaf/reliesOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Indique que le vocabulaire sujet utilise ou étend au moins une classe ou propriété du vocabulaire objet@fr"
    #xsd/langString
     "Indicates that the subject vocabulary uses or extends some class or property of the object vocabulary@en"],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "réutilise@fr" #xsd/langString "relies on@en"],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf [:void/vocabulary :dcterms/references],
   :vs/term_status #xsd/string "stable"})

(def reusedByDatasets
  {:db/ident :voaf/reusedByDatasets,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Nombre distinct de jeux de données reutilisant une resource.@fr"
    #xsd/langString "Distinct number of datasets reusing a resource.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "réutilisé par des jeux de données@fr"
                #xsd/langString "reused by datasets@en"],
   :rdfs/range :xsd/integer,
   :vs/term_status #xsd/string "testing"})

(def reusedByVocabularies
  {:db/ident :voaf/reusedByVocabularies,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Nombre distinct de vocabulaires reutilisant une resource.@fr"
    #xsd/langString "Distinct number of vocabularies reusing a resource.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "réutilisé par des vocabulaires@fr"
                #xsd/langString "reused by vocabularies@en"],
   :rdfs/range :xsd/integer,
   :vs/term_status #xsd/string "testing"})

(def similar
  {:db/ident :voaf/similar,
   :rdf/type [:owl/ObjectProperty :owl/SymmetricProperty],
   :rdfs/comment
   [#xsd/langString
     "Used to assert that two vocabularies are similar in scope and objectives, independently of the fact that they otherwise refer to each other.@en"
    #xsd/langString
     "Indique que deux vocabulaires sont similaires dans leur domaine et/ou leurs objectifs, sans être nécessairement reliés par des références.@fr"],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "similaire@fr" #xsd/langString "similar@en"],
   :rdfs/range :voaf/Vocabulary,
   :vs/term_status #xsd/string "testing"})

(def specializes
  "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:specializes ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 rdfs:subPropertyOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:subClassOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 skos:broadMatch ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t"
  {:db/ident :voaf/specializes,
   :dcterms/description
   #xsd/string
    "\n\t\tPREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n\t\tPREFIX voaf:<http://purl.org/vocommons/voaf#>\n\t\tPREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n\t\t\n\t\tCONSTRUCT{\n\t\t\t?vocab1 voaf:specializes ?vocab2\n\t\t}\n\t\tWHERE{\n\t\t\t{?elem1 rdfs:subPropertyOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 rdfs:subClassOf ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\tUNION{?elem1 skos:broadMatch ?elem2. FILTER(!isBlank(?elem2))}\n\t\t\t?elem1 rdfs:isDefinedBy ?vocab1.\n\t\t\t?vocab1 a voaf:Vocabulary.\n\t\t\t?elem2 rdfs:isDefinedBy ?vocab2.\n\t\t\t?vocab2 a voaf:Vocabulary.\n\t\t\tFILTER(?vocab1!=?vocab2)\n\t\t}\n\t",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Indicates that the subject vocabulary defines some subclasses or subproperties of the object vocabulary, or local restrictions on those.@en"
    #xsd/langString
     "Indique que le vocabulaire sujet définit des sous-classes ou sous-propriétés du vocabulaire objet@fr"],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "specializes@en"
                #xsd/langString "spécialise@fr"],
   :rdfs/range :voaf/Vocabulary,
   :rdfs/subPropertyOf [:voaf/reliesOn :void/vocabulary :dcterms/references],
   :vs/term_status #xsd/string "stable"})

(def toDoList
  {:db/ident :voaf/toDoList,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Liste des tâches prévues par le gestionnaire d'une ressource. Cette propriété est destinée à l'usage des gestionnaires de vocabulaires ou de jeu de données mais son doamine est ouvert, elle peut être utilisée pour n'importe quelle ressource. Utiliser la classe ical:Vtodo pour une description fine des tâches : calendrier, priorités etc@fr"
    #xsd/langString
     "Describes future tasks planned by a resource curator. This property is primarily intended to be used for vocabularies or datasets, but the domain is left open, it can be used for any resource. Use iCalendar Vtodo class and its properties to further describe the task calendar, priorities etc.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "liste des choses à faire@fr"
                #xsd/langString "to-do list@en"],
   :rdfs/range {:rdfa/uri "http://www.w3.org/2002/12/cal/ical#Vtodo"},
   :vs/term_status #xsd/string "stable"})

(def usageInDataset
  {:db/ident         :voaf/usageInDataset,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     [#xsd/langString
                       "statistiques d'utilisation dans un jeu de données@fr"
                      #xsd/langString "usage statistics in a dataset@en"],
   :rdfs/domain      :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label       [#xsd/langString "utilisation dans un jeu de données@fr"
                      #xsd/langString "usage in dataset@en"],
   :rdfs/range       :voaf/DatasetOccurrences,
   :vs/term_status   #xsd/string "testing"})

(def usedBy
  {:db/ident :voaf/usedBy,
   :owl/inverseOf :voaf/reliesOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Indicates that the subject vocabulary is used by the object vocabulary@en"
    #xsd/langString
     "Indique que le vocabulaire sujet est utilisé par le vocabulaire objet@fr"],
   :rdfs/domain :voaf/Vocabulary,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocommons/voaf"},
   :rdfs/label [#xsd/langString "used by@en" #xsd/langString "utilisé par@fr"],
   :rdfs/range :voaf/Vocabulary,
   :vs/term_status #xsd/string "stable"})