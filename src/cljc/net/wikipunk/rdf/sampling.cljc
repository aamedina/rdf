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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Nature of relationship (between samples)"},
   :rdfs/subClassOf :skos/Concept,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Members of this class indicate the nature of a relationship between two samples"},
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sample relationship"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Members of this class represent a relationship between a sample and another"}})

(def hasSampleRelationship
  "Links a sample to a sample relationship (which links to a related sample)"
  {:db/ident :sampling/hasSampleRelationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has sample relationship"},
   :schema/domainIncludes :sosa/Sample,
   :schema/rangeIncludes :sampling/SampleRelationship,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Links a sample to a sample relationship (which links to a related sample)"}})

(def natureOfRelationship
  "Links a SampleRelationship to an indication of the nature of the relationship"
  {:db/ident :sampling/natureOfRelationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "nature of (sample) relationship"},
   :schema/domainIncludes :sampling/SampleRelationship,
   :schema/rangeIncludes :sampling/RelationshipNature,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Links a SampleRelationship to an indication of the nature of the relationship"}})

(def relatedSample
  "Links a sample relationship to the related sample"
  {:db/ident        :sampling/relatedSample,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "related sample"},
   :schema/domainIncludes :sampling/SampleRelationship,
   :schema/rangeIncludes :sosa/Sample,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Links a sample relationship to the related sample"}})