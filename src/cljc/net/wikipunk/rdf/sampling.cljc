(ns net.wikipunk.rdf.sampling
  {:owl/imports       [{:rdfa/uri "http://www.w3.org/ns/sosa/"}
                       {:rdfa/uri "http://www.w3.org/2004/02/skos/core"}],
   :rdf/ns-prefix-map {"owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "sampling" "http://www.w3.org/ns/sosa/sampling/",
                       "schema"   "http://schema.org/",
                       "skos"     "http://www.w3.org/2004/02/skos/core#",
                       "sosa"     "http://www.w3.org/ns/sosa/",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "sampling",
   :rdfa/uri          "http://www.w3.org/ns/sosa/sampling/"})

(def RelationshipNature
  "Nature of relationship (between samples)"
  {:db/ident :sampling/RelationshipNature,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/label #xsd/langString "Nature of relationship (between samples)@en",
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept],
   :skos/definition
   #xsd/langString
    "Members of this class indicate the nature of a relationship between two samples@en",
   :skos/example
   [#xsd/string "Adjacent flight-line"
    #xsd/string "Probe spot on polished specimen"
    #xsd/string "Pixel within image or scene"
    #xsd/string "Sub-sample with grain size smaller than specified seive mesh"
    #xsd/string "Males"
    #xsd/string "Females"
    #xsd/string "Station along a traverse"
    #xsd/string "Specimen taken from borehole"
    #xsd/string "Split of core sample"
    #xsd/string "Juveniles"]})

(def SampleRelationship
  "Sample relationship"
  {:db/ident :sampling/SampleRelationship,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/label #xsd/langString "Sample relationship@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "Members of this class represent a relationship between a sample and another@en"})

(def hasSampleRelationship
  "has sample relationship"
  {:db/ident :sampling/hasSampleRelationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label #xsd/langString "has sample relationship@en",
   :schema/domainIncludes :sosa/Sample,
   :schema/rangeIncludes :sampling/SampleRelationship,
   :skos/definition
   #xsd/langString
    "Links a sample to a sample relationship (which links to a related sample)@en"})

(def natureOfRelationship
  "nature of (sample) relationship"
  {:db/ident :sampling/natureOfRelationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label #xsd/langString "nature of (sample) relationship@en",
   :schema/domainIncludes :sampling/SampleRelationship,
   :schema/rangeIncludes :sampling/RelationshipNature,
   :skos/definition
   #xsd/langString
    "Links a SampleRelationship to an indication of the nature of the relationship@en"})

(def relatedSample
  "related sample"
  {:db/ident        :sampling/relatedSample,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      #xsd/langString "related sample@en",
   :schema/domainIncludes :sampling/SampleRelationship,
   :schema/rangeIncludes :sosa/Sample,
   :skos/definition #xsd/langString
                     "Links a sample relationship to the related sample@en"})