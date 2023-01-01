(ns net.wikipunk.rdf.ore
  "http://www.openarchives.org/ore/terms/"
  {:rdf/ns-prefix-map {"dcmitype" "http://purl.org/dc/dcmitype/",
                       "dcterms"  "http://purl.org/dc/elements/1.1/",
                       "ore"      "http://www.openarchives.org/ore/terms/",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfg"     "http://www.w3.org/2004/03/trix/rdfg-1/",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "ore",
   :rdfa/uri          "http://www.openarchives.org/ore/terms/"})

(def AggregatedResource
  "A resource which is included in an Aggregation. Note that asserting that a resource is a member of the class of Aggregated Resources does not imply anything other than that it is aggregated by at least one Aggregation."
  {:db/ident :ore/AggregatedResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource which is included in an Aggregation. Note that asserting that a resource is a member of the class of Aggregated Resources does not imply anything other than that it is aggregated by at least one Aggregation.",
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Aggregated Resource"})

(def Aggregation
  "A set of related resources (Aggregated Resources), grouped together such that the set can be treated as a single resource. This is the entity described within the ORE interoperability framework by a Resource Map."
  {:db/ident :ore/Aggregation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A set of related resources (Aggregated Resources), grouped together such that the set can be treated as a single resource. This is the entity described within the ORE interoperability framework by a Resource Map.",
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Aggregation",
   :rdfs/subClassOf :dcmitype/Collection})

(def Proxy
  "A Proxy represents an Aggregated Resource as it exists in a specific Aggregation. All assertions made about an entity are globally true, not only within the context of the Aggregation. As such, in order to make assertions which are only true of a resource as it exists in an Aggregation, a Proxy object is required. For example, one might want to cite an article as it appears in a specific journal, or assign aggregation-specific metadata to a Resource."
  {:db/ident :ore/Proxy,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Proxy represents an Aggregated Resource as it exists in a specific Aggregation. All assertions made about an entity are globally true, not only within the context of the Aggregation. As such, in order to make assertions which are only true of a resource as it exists in an Aggregation, a Proxy object is required. For example, one might want to cite an article as it appears in a specific journal, or assign aggregation-specific metadata to a Resource.",
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Proxy"})

(def ResourceMap
  "A description of an Aggregation according to the OAI-ORE data model. Resource Maps are serialised to a machine readable format according to the implementation guidelines."
  {:db/ident :ore/ResourceMap,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A description of an Aggregation according to the OAI-ORE data model. Resource Maps are serialised to a machine readable format according to the implementation guidelines.",
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Resource Map",
   :rdfs/subClassOf :rdfg/Graph})

(def aggregates
  "Aggregations, by definition, aggregate resources. The ore:aggregates relationship expresses that the object resource is a member of the set of Aggregated Resources of the subject (the Aggregation). This relationship between the Aggregation and its Aggregated Resources is thus more specific than a simple part/whole relationship, as expressed by dcterms:hasPart for example."
  {:db/ident :ore/aggregates,
   :owl/inverseOf :ore/isAggregatedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Aggregations, by definition, aggregate resources. The ore:aggregates relationship expresses that the object resource is a member of the set of Aggregated Resources of the subject (the Aggregation). This relationship between the Aggregation and its Aggregated Resources is thus more specific than a simple part/whole relationship, as expressed by dcterms:hasPart for example.",
   :rdfs/domain :ore/Aggregation,
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Aggregates",
   :rdfs/range :ore/AggregatedResource,
   :rdfs/subPropertyOf :dcterms/hasPart})

(def describes
  "This relationship asserts that the subject (a Resource Map) describes the object (an Aggregation)."
  {:db/ident :ore/describes,
   :owl/inverseOf :ore/isDescribedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This relationship asserts that the subject (a Resource Map) describes the object (an Aggregation).",
   :rdfs/domain :ore/ResourceMap,
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Describes",
   :rdfs/range :ore/Aggregation})

(def isAggregatedBy
  "The inverse relationship of ore:aggregates, ore:isAggregatedBy asserts that an Aggregated Resource is aggregated by an Aggregation."
  {:db/ident :ore/isAggregatedBy,
   :owl/inverseOf :ore/aggregates,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The inverse relationship of ore:aggregates, ore:isAggregatedBy asserts that an Aggregated Resource is aggregated by an Aggregation.",
   :rdfs/domain :ore/AggregatedResource,
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Is Aggregated By",
   :rdfs/range :ore/Aggregation,
   :rdfs/subPropertyOf :dcterms/isPartOf})

(def isDescribedBy
  "The inverse relationship of ore:describes, in this case the object of the relationship is the Resource Map and the subject is the Aggregation which it describes."
  {:db/ident :ore/isDescribedBy,
   :owl/inverseOf :ore/describes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The inverse relationship of ore:describes, in this case the object of the relationship is the Resource Map and the subject is the Aggregation which it describes.",
   :rdfs/domain :ore/Aggregation,
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Is Described By",
   :rdfs/range :ore/ResourceMap})

(def lineage
  "ore:lineage is a relationship between two Proxy objects, both of which MUST have the same Resource for which they are proxies. The meaning is that the Resource for which the subject of the relationship is a Proxy was discovered in the Aggregation in which the object Proxy's resource is aggregated."
  {:db/ident :ore/lineage,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "ore:lineage is a relationship between two Proxy objects, both of which MUST have the same Resource for which they are proxies. The meaning is that the Resource for which the subject of the relationship is a Proxy was discovered in the Aggregation in which the object Proxy's resource is aggregated.",
   :rdfs/domain :ore/Proxy,
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Lineage",
   :rdfs/range :ore/Proxy})

(def proxyFor
  "Proxy objects are used to represent a Resource as it is aggregated in a particular Aggregation. The ore:proxyFor relationship is used to link the proxy to the Aggregated Resource it is a proxy for. The subject of the relationship is a Proxy object, and the object of the relationship is the Aggregated Resource."
  {:db/ident :ore/proxyFor,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Proxy objects are used to represent a Resource as it is aggregated in a particular Aggregation. The ore:proxyFor relationship is used to link the proxy to the Aggregated Resource it is a proxy for. The subject of the relationship is a Proxy object, and the object of the relationship is the Aggregated Resource.",
   :rdfs/domain :ore/Proxy,
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Proxy For",
   :rdfs/range :ore/AggregatedResource})

(def proxyIn
  "Proxy objects must link to the Aggregation in which the resource being proxied is aggregated. The ore:proxyIn relationship is used for this purpose. The subject of the relationship is a Proxy object, and the object of the relationship is the Aggregation."
  {:db/ident :ore/proxyIn,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Proxy objects must link to the Aggregation in which the resource being proxied is aggregated. The ore:proxyIn relationship is used for this purpose. The subject of the relationship is a Proxy object, and the object of the relationship is the Aggregation.",
   :rdfs/domain :ore/Proxy,
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Proxy In",
   :rdfs/range :ore/Aggregation})

(def similarTo
  "The subject of this relationship MUST be an Aggregation.  This Aggregation should be considered an expression within the ORE context of the object of the relationship, as it is broadly equivalent to the resource. For example, the Aggregation may consist of the resources which, together, make up a journal article which has a DOI assigned to it. The Aggregation is not the article to which the DOI was assigned, but is a representation of it in some manner."
  {:db/ident :ore/similarTo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The subject of this relationship MUST be an Aggregation.  This Aggregation should be considered an expression within the ORE context of the object of the relationship, as it is broadly equivalent to the resource. For example, the Aggregation may consist of the resources which, together, make up a journal article which has a DOI assigned to it. The Aggregation is not the article to which the DOI was assigned, but is a representation of it in some manner.",
   :rdfs/domain :ore/Aggregation,
   :rdfs/isDefinedBy "http://www.openarchives.org/ore/terms/",
   :rdfs/label "Similar To"})