(ns net.wikipunk.rdf.duv
  "Dataset Usage Vocabulary"
  {:dcterms/created #xsd/date #inst "2015-12-17T00:00:00.000-05:00",
   :dcterms/creator [{:foaf/name #xsd/string "Sumit Purohit"}
                     {:foaf/name #xsd/string "Eric G. Stephan"}
                     {:foaf/name #xsd/string "Bernadette Farias Lóscio"}],
   :dcterms/description
   #xsd/langString
    "The Dataset Usage Vocabulary (DUV) is used to describe consumer experiences, citations, and feedback about datasets from the human perspective.@en",
   :dcterms/modified [#xsd/date #inst "2016-08-30T00:00:00.000-04:00"
                      #xsd/date #inst "2017-01-23T00:00:00.000-05:00"],
   :dcterms/publisher {:rdfa/uri "http://www.w3.org/data#W3C"},
   :dcterms/title #xsd/string "Dataset Usage Vocabulary",
   :dcterms/type {:rdfa/uri "http://purl.org/adms/assettype/Ontology"},
   :rdf/ns-prefix-map {"biro" "http://purl.org/spar/biro/",
                       "dcat" "http://www.w3.org/ns/dcat#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "disco"
                       "http://rdf-vocabulary.ddialliance.org/discovery#",
                       "dqv" "http://www.w3.org/ns/dqv#",
                       "duv" "http://www.w3.org/ns/duv#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "frbr" "http://purl.org/vocab/frbr/core#",
                       "oa" "http://www.w3.org/ns/oa#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "pav" "http://purl.org/pav/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vann" "http://purl.org/vocab/vann/",
                       "voaf" "http://purl.org/vocommons/voaf#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :voaf/Vocabulary,
   :rdfa/prefix "duv",
   :rdfa/uri "http://www.w3.org/ns/duv",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/vocab-duv/"},
   :vann/preferredNamespacePrefix #xsd/string "duv",
   :vann/preferredNamespaceUri #xsd/string "http://www.w3.org/ns/duv#"})

(def RatingFeedback
  {:db/ident :duv/RatingFeedback,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "Predefined criteria used to express a user opinion about a dataset or distribution using a discrete range of values.@en",
   :rdfs/label #xsd/langString "Rating Feedback@en",
   :rdfs/subClassOf :rdfs/Resource,
   :rdfs/subclassOf :duv/UserFeedback})

(def Usage
  {:db/ident :duv/Usage,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "A helpful description of actions that can be performed on a given dataset or distribution.@en",
   :rdfs/label #xsd/langString "Usage@en",
   :rdfs/subClassOf :rdfs/Resource})

(def UsageTool
  {:db/ident :duv/UsageTool,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "A synopsis describing the way a tool can use a dataset or distribution.@en",
   :rdfs/label #xsd/langString "UsageTool@en",
   :rdfs/subClassOf :rdfs/Resource})

(def UserFeedback
  {:db/ident :duv/UserFeedback,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "User feedback on the dataset. Expresses whether the dataset was useful or not, for example.@en",
   :rdfs/label #xsd/langString "User Feedback@en",
   :rdfs/subClassOf :rdfs/Resource})

(def hasDistributor
  {:db/ident :duv/hasDistributor,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The distributor is the organization that makes the dataset available for downloading and use.@en",
   :rdfs/label #xsd/langString "has distributor@en",
   :vann/usageNote
   [#xsd/langString
     "dcat:Distribution (subject) duv:hasDistributor (predicate) foaf:Agent (object)@en"
    #xsd/langString
     "dcat:Dataset (subject) duv:hasDistributor (predicate) foaf:Agent (object)@en"]})

(def hasFeedback
  {:db/ident :duv/hasFeedback,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "User feedback associated with Dataset or distribution@en",
   :rdfs/label #xsd/langString "has dataset feedback@en",
   :vann/usageNote
   [#xsd/langString
     "dcat:Distribution (subject) duv:hasFeedback (predicate) duv:UserFeedback (object)@en"
    #xsd/langString
     "dcat:Dataset (subject) duv:hasFeedback (predicate) duv:UserFeedback (object)@en"]})

(def hasRating
  {:db/ident     :duv/hasRating,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString "Rating Feedback has rating opinion@en",
   :rdfs/label   #xsd/langString "has rating@en"})

(def hasUsage
  {:db/ident     :duv/hasUsage,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "Dataset/distribution usage guidance or instructions.@en",
   :rdfs/label   #xsd/langString "has dataset/distribution usage@en"})

(def hasUsageTool
  {:db/ident     :duv/hasUsageTool,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "Describes the tool that provides the Usage @en",
   :rdfs/label   #xsd/langString "has usage tool@en"})

(def refersTo
  {:db/ident     :duv/refersTo,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString "Dataset associated with Usage. @en",
   :rdfs/label   #xsd/langString "refers to dataset@en"})