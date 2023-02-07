(ns net.wikipunk.rdf.wn
  "An ontology describing the data types used in the WordNet RDF model"
  {:dcterms/contributor ["http://john.mccr.ae/"
                         "http://www.cimiano.de/"
                         "http://www.cs.princeton.edu/~fellbaum/"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An ontology describing the data types used in the WordNet RDF model"},
   :dcterms/issued "\"2014-3-3\"^^http://www.w3.org/2001/XMLSchema#date",
   :dcterms/license "http://wordnet-rdf.princeton.edu/license.html",
   :dcterms/modified "\"2011-4-17\"^^http://www.w3.org/2001/XMLSchema#date",
   :dcterms/publisher "http://www.cs.princeton.edu/",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "WordNet RDF Ontology"},
   :owl/imports "http://lemon-model.net/lemon",
   :owl/versionInfo 3.1M,
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "isocat" "http://www.isocat.org/ns/dcr.rdf#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vann" "http://purl.org/vocab/vann/",
                       "void" "http://rdfs.org/ns/void#",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "wn" "http://wordnet-rdf.princeton.edu/ontology#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://wordnet-rdf.princeton.edu/ontology",
   :rdfa/prefix "wn",
   :rdfa/uri "http://wordnet-rdf.princeton.edu/ontology#",
   :vann/preferredNamespacePrefix "wordnet-ontology",
   :vann/preferredNamespaceUri "http://wordnet-rdf.princeton.edu/ontology#",
   :void/dataDump "http://wordnet-rdf.princeton.edu/wn31.nt.gz"}
  (:refer-clojure :exclude [agent]))

(def AdjectivePosition
  "Adjective position"
  {:db/ident   :wn/AdjectivePosition,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Adjective position"}})

(def LexicalDomain
  "Lexical domain"
  {:db/ident   :wn/LexicalDomain,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lexical domain"}})

(def PartOfSpeech
  "Part of speech"
  {:db/ident      :wn/PartOfSpeech,
   :isocat/datcat "http://www.isocat.org/datcat/DC-396",
   :rdf/type      :owl/Class,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Part of speech"}})

(def PhraseType
  "Phrase type"
  {:db/ident   :wn/PhraseType,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Phrase type"}})

(def Synset
  "Synset"
  {:db/ident      :wn/Synset,
   :isocat/datcat "http://www.isocat.org/datcat/DC-4613",
   :rdf/type      :owl/Class,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Synset"}})

(def action
  "Action"
  {:db/ident           :wn/action,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Action"},
   :rdfs/subPropertyOf :wn/link})

(def adjective
  "Adjective"
  {:db/ident      :wn/adjective,
   :isocat/datcat "http://www.isocat.org/datcat/DC-1230",
   :rdf/type      :wn/PartOfSpeech,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Adjective"}})

(def adjective_satellite
  "Adjective satellite"
  {:db/ident   :wn/adjective_satellite,
   :rdf/type   :wn/PartOfSpeech,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Adjective satellite"}})

(def adverb
  "Adverb"
  {:db/ident      :wn/adverb,
   :isocat/datcat "http://www.isocat.org/datcat/DC-1232",
   :rdf/type      :wn/PartOfSpeech,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Adverb"}})

(def agent
  "Agent"
  {:db/ident           :wn/agent,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Agent"},
   :rdfs/subPropertyOf :wn/link})

(def also
  "Also"
  {:db/ident           :wn/also,
   :isocat/datcat      "http://www.isocat.org/datcat/DC-461",
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Also"},
   :rdfs/subPropertyOf :wn/link})

(def antonym
  "Antonym"
  {:db/ident           :wn/antonym,
   :isocat/datcat      "http://www.isocat.org/datcat/DC-83",
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Antonym"},
   :rdfs/subPropertyOf :wn/link})

(def attribute
  "Attribute"
  {:db/ident           :wn/attribute,
   :isocat/datcat      "http://www.isocat.org/datcat/DC-2267",
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Attribute"},
   :rdfs/subPropertyOf :wn/link})

(def attributive
  "Attributive"
  {:db/ident      :wn/attributive,
   :isocat/datcat "http://www.isocat.org/datcat/DC-5242",
   :rdf/type      :wn/AdjectivePosition,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Attributive"}})

(def beneficiary
  "Beneficiary"
  {:db/ident           :wn/beneficiary,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Beneficiary"},
   :rdfs/subPropertyOf :wn/link})

(def cause
  "Cause"
  {:db/ident           :wn/cause,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Cause"},
   :rdfs/subPropertyOf :wn/link})

(def creator
  "Creator"
  {:db/ident           :wn/creator,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Creator"},
   :rdfs/subPropertyOf :wn/link})

(def derivation
  "Derivation"
  {:db/ident           :wn/derivation,
   :isocat/datcat      "http://www.isocat.org/datcat/DC-4611",
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Derivation"},
   :rdfs/subPropertyOf :wn/link})

(def domain
  "Domain"
  {:db/ident           :wn/domain,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Domain"},
   :rdfs/subPropertyOf :wn/link})

(def domain_category
  "Domain category"
  {:db/ident           :wn/domain_category,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Domain category"},
   :rdfs/subPropertyOf :wn/link})

(def domain_member_category
  "Domain member category"
  {:db/ident           :wn/domain_member_category,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Domain member category"},
   :rdfs/subPropertyOf :wn/link})

(def domain_member_region
  "Domain member region"
  {:db/ident           :wn/domain_member_region,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Domain member region"},
   :rdfs/subPropertyOf :wn/link})

(def domain_member_usage
  "Domain member usage"
  {:db/ident           :wn/domain_member_usage,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Domain member usage"},
   :rdfs/subPropertyOf :wn/link})

(def domain_region
  "Domain region"
  {:db/ident           :wn/domain_region,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Domain region"},
   :rdfs/subPropertyOf :wn/link})

(def domain_usage
  "Domain usage"
  {:db/ident           :wn/domain_usage,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Domain usage"},
   :rdfs/subPropertyOf :wn/link})

(def entail
  "Entail"
  {:db/ident           :wn/entail,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Entail"},
   :rdfs/subPropertyOf :wn/link})

(def experiencer
  "Experiencer"
  {:db/ident           :wn/experiencer,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Experiencer"},
   :rdfs/subPropertyOf :wn/link})

(def gloss
  "Gloss"
  {:db/ident      :wn/gloss,
   :isocat/datcat "http://www.isocat.org/datcat/DC-244",
   :rdf/type      :owl/DatatypeProperty,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Gloss"}})

(def goal
  "Goal"
  {:db/ident           :wn/goal,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Goal"},
   :rdfs/subPropertyOf :wn/link})

(def hypernym
  "Hypernym"
  {:db/ident           :wn/hypernym,
   :isocat/datcat      "http://www.isocat.org/datcat/DC-31",
   :owl/equivalentProperty :skos/broader,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Hypernym"},
   :rdfs/subPropertyOf :wn/link})

(def hyponym
  "Hyponym"
  {:db/ident           :wn/hyponym,
   :owl/equivalentProperty :skos/narrower,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Hyponym"},
   :rdfs/subPropertyOf :wn/link})

(def idiom
  "Idiom"
  {:db/ident      :wn/idiom,
   :isocat/datcat "http://www.isocat.org/datcat/DC-351",
   :rdf/type      :wn/PhraseType,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Idiom"}})

(def immediately_postnominal
  "Immediately postnominal"
  {:db/ident   :wn/immediately_postnominal,
   :rdf/type   :wn/AdjectivePosition,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Immediately postnominal"}})

(def instance_hypernym
  "Instance hypernym"
  {:db/ident           :wn/instance_hypernym,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Instance hypernym"},
   :rdfs/subPropertyOf :wn/link})

(def instance_hyponym
  "Instance hyponym"
  {:db/ident           :wn/instance_hyponym,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Instance hyponym"},
   :rdfs/subPropertyOf :wn/link})

(def instrument
  "Instrument"
  {:db/ident           :wn/instrument,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Instrument"},
   :rdfs/subPropertyOf :wn/link})

(def lexical_domain
  "Lexical domain"
  {:db/ident   :wn/lexical_domain,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lexical domain"}})

(def link
  "Link"
  {:db/ident   :wn/link,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Link"}})

(def location
  "Location"
  {:db/ident           :wn/location,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Location"},
   :rdfs/subPropertyOf :wn/link})

(def member
  "Member"
  {:db/ident           :wn/member,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Member"},
   :rdfs/subPropertyOf :wn/link})

(def member_holonym
  "Member holonym"
  {:db/ident           :wn/member_holonym,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Member holonym"},
   :rdfs/subPropertyOf :wn/link})

(def member_meronym
  "Member meronym"
  {:db/ident           :wn/member_meronym,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Member meronym"},
   :rdfs/subPropertyOf :wn/link})

(def noun
  "Noun"
  {:db/ident      :wn/noun,
   :isocat/datcat "http://www.isocat.org/datcat/DC-1333",
   :rdf/type      :wn/PartOfSpeech,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Noun"}})

(def old_sense_key
  "Old sense key"
  {:db/ident   :wn/old_sense_key,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Old sense key"}})

(def part_holonym
  "Part holonym"
  {:db/ident           :wn/part_holonym,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Part holonym"},
   :rdfs/subPropertyOf :wn/link})

(def part_meronym
  "Part meronym"
  {:db/ident           :wn/part_meronym,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Part meronym"},
   :rdfs/subPropertyOf :wn/link})

(def part_of_speech
  "Part of speech"
  {:db/ident      :wn/part_of_speech,
   :isocat/datcat "http://www.isocat.org/datcat/DC-396",
   :rdf/type      :owl/ObjectProperty,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Part of speech"}})

(def participle
  "Participle"
  {:db/ident           :wn/participle,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Participle"},
   :rdfs/subPropertyOf :wn/link})

(def patient
  "Patient"
  {:db/ident           :wn/patient,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Patient"},
   :rdfs/subPropertyOf :wn/link})

(def pertainym
  "Pertainym"
  {:db/ident           :wn/pertainym,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Pertainym"},
   :rdfs/subPropertyOf :wn/link})

(def phrase
  "Phrase"
  {:db/ident      :wn/phrase,
   :isocat/datcat "http://www.isocat.org/datcat/DC-2282",
   :rdf/type      :wn/PartOfSpeech,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Phrase"}})

(def phrase_type
  "Phrase type"
  {:db/ident   :wn/phrase_type,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Phrase type"}})

(def predicate
  "Predicate"
  {:db/ident      :wn/predicate,
   :isocat/datcat "http://www.isocat.org/datcat/DC-2710",
   :rdf/type      :wn/AdjectivePosition,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Predicate"}})

(def product
  "Product"
  {:db/ident           :wn/product,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Product"},
   :rdfs/subPropertyOf :wn/link})

(def result
  "Result"
  {:db/ident           :wn/result,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Result"},
   :rdfs/subPropertyOf :wn/link})

(def sample
  "Sample"
  {:db/ident      :wn/sample,
   :isocat/datcat "http://www.isocat.org/datcat/DC-455",
   :rdf/type      :owl/DatatypeProperty,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Sample"}})

(def sense_number
  "Sense number"
  {:db/ident   :wn/sense_number,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sense number"}})

(def sense_tag
  "Sense tag"
  {:db/ident   :wn/sense_tag,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sense tag"}})

(def similar
  "Similar"
  {:db/ident           :wn/similar,
   :isocat/datcat      "http://www.isocat.org/datcat/DC-438",
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Similar"},
   :rdfs/subPropertyOf :wn/link})

(def substance_holonym
  "Substance holonym"
  {:db/ident           :wn/substance_holonym,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Substance holonym"},
   :rdfs/subPropertyOf :wn/link})

(def substance_meronym
  "Substance meronym"
  {:db/ident           :wn/substance_meronym,
   :rdf/type           :owl/TransitiveProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Substance meronym"},
   :rdfs/subPropertyOf :wn/link})

(def synset_member
  "Synset member"
  {:db/ident   :wn/synset_member,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Synset member"}})

(def tag_count
  "Tag count"
  {:db/ident   :wn/tag_count,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tag count"}})

(def theme
  "Theme"
  {:db/ident           :wn/theme,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Theme"},
   :rdfs/subPropertyOf :wn/link})

(def translation
  "Translation"
  {:db/ident      :wn/translation,
   :isocat/datcat "http://www.isocat.org/datcat/DC-2970",
   :rdf/type      :owl/ObjectProperty,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Translation"}})

(def unlabeled
  "Unlabeled"
  {:db/ident   :wn/unlabeled,
   :rdf/type   :wn/LexicalDomain,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unlabeled"}})

(def verb
  "Verb"
  {:db/ident      :wn/verb,
   :isocat/datcat "http://www.isocat.org/datcat/DC-1424",
   :rdf/type      :wn/PartOfSpeech,
   :rdfs/label    {:rdf/language "en",
                   :rdf/value    "Verb"}})

(def verb_frame_sentence
  "Verb frame sentence"
  {:db/ident   :wn/verb_frame_sentence,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Verb frame sentence"}})

(def verb_group
  "Verb group"
  {:db/ident           :wn/verb_group,
   :rdf/type           :rdf/Property,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Verb group"},
   :rdfs/subPropertyOf :wn/link})

(def verbnet_class
  "Verbnet class"
  {:db/ident   :wn/verbnet_class,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Verbnet class"}})

(def ^{:private true} datcat
  {:db/ident :isocat/datcat,
   :rdf/type :owl/AnnotationProperty})