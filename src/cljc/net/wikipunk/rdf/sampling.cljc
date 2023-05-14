(ns net.wikipunk.rdf.sampling
  "http://www.w3.org/ns/sosa/sampling/"
  {:owl/imports       ["http://www.w3.org/ns/sosa/"
                       "http://www.w3.org/2004/02/skos/core"],
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
  "Members of this class indicate the nature of a relationship between two samples"
  {:db/ident :sampling/RelationshipNature,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/label #voc/lstr "Nature of relationship (between samples)@en",
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept :sampling/RelationshipNature],
   :skos/definition
   #voc/lstr
    "Members of this class indicate the nature of a relationship between two samples@en",
   :skos/example ["Adjacent flight-line"
                  "Probe spot on polished specimen"
                  "Pixel within image or scene"
                  "Sub-sample with grain size smaller than specified seive mesh"
                  "Males"
                  "Females"
                  "Station along a traverse"
                  "Specimen taken from borehole"
                  "Split of core sample"
                  "Juveniles"]})

(def SampleRelationship
  "Members of this class represent a relationship between a sample and another"
  {:db/ident :sampling/SampleRelationship,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/label #voc/lstr "Sample relationship@en",
   :rdfs/subClassOf [:rdfs/Resource :sampling/SampleRelationship],
   :skos/definition
   #voc/lstr
    "Members of this class represent a relationship between a sample and another@en"})

(def hasSampleRelationship
  "Links a sample to a sample relationship (which links to a related sample)"
  {:db/ident :sampling/hasSampleRelationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label #voc/lstr "has sample relationship@en",
   :schema/domainIncludes :sosa/Sample,
   :schema/rangeIncludes :sampling/SampleRelationship,
   :skos/definition
   #voc/lstr
    "Links a sample to a sample relationship (which links to a related sample)@en"})

(def natureOfRelationship
  "Links a SampleRelationship to an indication of the nature of the relationship"
  {:db/ident :sampling/natureOfRelationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label #voc/lstr "nature of (sample) relationship@en",
   :schema/domainIncludes :sampling/SampleRelationship,
   :schema/rangeIncludes :sampling/RelationshipNature,
   :skos/definition
   #voc/lstr
    "Links a SampleRelationship to an indication of the nature of the relationship@en"})

(def relatedSample
  "Links a sample relationship to the related sample"
  {:db/ident        :sampling/relatedSample,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      #voc/lstr "related sample@en",
   :schema/domainIncludes :sampling/SampleRelationship,
   :schema/rangeIncludes :sosa/Sample,
   :skos/definition #voc/lstr
                     "Links a sample relationship to the related sample@en"})

(def ^{:private true} Concept
  {:db/ident        :skos/Concept,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :skos/Concept})