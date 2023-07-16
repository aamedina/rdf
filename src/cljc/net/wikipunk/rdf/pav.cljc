(ns net.wikipunk.rdf.pav
  {:dcat/downloadURL  "https://pav-ontology.github.io/pav/pav.rdf",
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "pav" "http://purl.org/pav",
                       "pav1"
                       "http://swan.mindinformatics.org/ontologies/1.2/pav/",
                       "prov" "http://www.w3.org/ns/prov#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "pav",
   :rdfa/uri          "http://purl.org/pav/"})

(def authoredBy
  "An agent that originated or gave existence to the work that is expressed by the digital resource.\n\nThe author of the content of a resource may be different from the creator of the resource representation (although they are often the same). See pav:createdBy for a discussion.\n\npav:authoredBy is more specific than its superproperty dct:creator - which might or might not be interpreted to also cover the creation of the representation of the artifact.\n\nThe author is usually not a software agent (which would be indicated with pav:createdWith, pav:createdBy or pav:importedBy), unless the software actually authored the content itself; for instance an artificial intelligence algorithm which authored a piece of music or a machine learning algorithm that authored a classification of a tumor sample.\n\nThe date of authoring can be expressed using pav:authoredOn - note however in the case of multiple authors that there is no relationship in PAV identifying which agent contributed when or what. If capturing such lineage is desired, it should be additionally expressed using PROV relationships like prov:qualifiedAttribution or prov:wasGeneratedBy."
  {:db/ident :pav/authoredBy,
   :owl/equivalentProperty :pav1/authoredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An agent that originated or gave existence to the work that is expressed by the digital resource.\n\nThe author of the content of a resource may be different from the creator of the resource representation (although they are often the same). See pav:createdBy for a discussion.\n\npav:authoredBy is more specific than its superproperty dct:creator - which might or might not be interpreted to also cover the creation of the representation of the artifact.\n\nThe author is usually not a software agent (which would be indicated with pav:createdWith, pav:createdBy or pav:importedBy), unless the software actually authored the content itself; for instance an artificial intelligence algorithm which authored a piece of music or a machine learning algorithm that authored a classification of a tumor sample.\n\nThe date of authoring can be expressed using pav:authoredOn - note however in the case of multiple authors that there is no relationship in PAV identifying which agent contributed when or what. If capturing such lineage is desired, it should be additionally expressed using PROV relationships like prov:qualifiedAttribution or prov:wasGeneratedBy.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Authored by@en",
   :rdfs/seeAlso [:pav/createdBy :pav/authoredOn],
   :rdfs/subPropertyOf [:pav/contributedBy
                        :dcterms/creator
                        :dcterms/contributor
                        :prov/wasInfluencedBy
                        :prov/wasAttributedTo]})

(def authoredOn
  "The date this resource was authored.\n\npav:authoredBy gives the authoring agent.\n\nNote that pav:authoredOn is different from pav:createdOn, although they are often the same. See pav:createdBy for a discussion.\n\nThis property is normally used in a functional way, indicating the last time of authoring, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime."
  {:db/ident :pav/authoredOn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The date this resource was authored.\n\npav:authoredBy gives the authoring agent.\n\nNote that pav:authoredOn is different from pav:createdOn, although they are often the same. See pav:createdBy for a discussion.\n\nThis property is normally used in a functional way, indicating the last time of authoring, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Authored on@en",
   :rdfs/seeAlso [:pav/createdOn :pav/createdBy :pav/authoredBy],
   :rdfs/subPropertyOf :pav/contributedOn})

(def contributedBy
  "The resource was contributed to by the given agent.\n\nSpecifies an agent that provided any sort of help in conceiving the work that is expressed by the digital artifact.\n\nContributions can take many forms, of which PAV define the subproperties pav:authoredBy and pav:curatedBy; however other specific roles could also be specified by pav:contributedBy or custom subproperties, such as illustrating, investigating or managing the underlying data source. Contributions can additionally be expressed in detail using prov:qualifiedAttribution and prov:hadRole.\n\nNote that pav:contributedBy identifies only agents that contributed to the work, knowledge or intellectual property, and not agents that made the digital artifact or representation (pav:createdBy), thus the considerations for software agents is similar to for pav:authoredBy and pav:curatedBy.\n\npav:contributedBy is more specific than its superproperty dct:contributor - which might or might not be interpreted to also cover contributions to making the representation of the artifact.\n\n\nThe date of contribution can be expressed using pav:contributedOn - note however in the case of multiple contributors that there is no relationship in PAV identifying which agent contributed when or what. If capturing such lineage is desired, it should be additionally expressed using PROV relationships like prov:qualifiedAttribution or prov:wasGeneratedBy."
  {:db/ident :pav/contributedBy,
   :owl/equivalentProperty :pav1/contributedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The resource was contributed to by the given agent.\n\nSpecifies an agent that provided any sort of help in conceiving the work that is expressed by the digital artifact.\n\nContributions can take many forms, of which PAV define the subproperties pav:authoredBy and pav:curatedBy; however other specific roles could also be specified by pav:contributedBy or custom subproperties, such as illustrating, investigating or managing the underlying data source. Contributions can additionally be expressed in detail using prov:qualifiedAttribution and prov:hadRole.\n\nNote that pav:contributedBy identifies only agents that contributed to the work, knowledge or intellectual property, and not agents that made the digital artifact or representation (pav:createdBy), thus the considerations for software agents is similar to for pav:authoredBy and pav:curatedBy.\n\npav:contributedBy is more specific than its superproperty dct:contributor - which might or might not be interpreted to also cover contributions to making the representation of the artifact.\n\n\nThe date of contribution can be expressed using pav:contributedOn - note however in the case of multiple contributors that there is no relationship in PAV identifying which agent contributed when or what. If capturing such lineage is desired, it should be additionally expressed using PROV relationships like prov:qualifiedAttribution or prov:wasGeneratedBy.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Contributed by@en",
   :rdfs/seeAlso [:pav/createdBy :pav/contributedOn],
   :rdfs/subPropertyOf
   [:prov/wasAttributedTo :dcterms/contributor :prov/wasInfluencedBy]})

(def contributedOn
  "The date this resource was contributed to.\n\npav:contributedBy provides the agent(s) that contributed.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime."
  {:db/ident :pav/contributedOn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The date this resource was contributed to.\n\npav:contributedBy provides the agent(s) that contributed.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Contributed on@en",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso :pav/contributedBy})

(def createdAt
  "The geo-location of the agents when creating the resource (pav:createdBy). For instance  a photographer takes a picture of the Eiffel Tower while standing in front of it."
  {:db/ident :pav/createdAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The geo-location of the agents when creating the resource (pav:createdBy). For instance  a photographer takes a picture of the Eiffel Tower while standing in front of it.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Created at@en",
   :rdfs/seeAlso :pav/createdBy})

(def createdBy
  "An agent primary responsible for making the digital artifact or resource representation.\n\nThis property is distinct from forming the content, which is indicated with pav:contributedBy or its subproperties; pav:authoredBy, which identifies who authored the knowledge expressed by this resource; and pav:curatedBy, which identifies who curated the knowledge into its current form.\n\npav:createdBy is more specific than its superproperty dct:creator - which might or might not be interpreted to cover this creator.\n\nFor instance, the author wrote 'this species has bigger wings than normal' in his log book. The curator, going through the log book and identifying important knowledge, formalizes this as 'locus perculus has wingspan > 0.5m'. The creator enters this knowledge as a digital resource in the knowledge system, thus creating the digital artifact (say as JSON, RDF, XML or HTML).\n\nA different example is a news article. pav:authoredBy indicates the journalist who wrote the article. pav:contributedBy can indicate the artist who added an illustration. pav:curatedBy can indicate the editor who made the article conform to the news paper's style. pav:createdBy can indicate who put the article on the web site.\n\nThe software tool used by the creator to make the digital resource (say Protege, Wordpress or OpenOffice) can be indicated with pav:createdWith.\n\nThe date the digital resource was created can be indicated with pav:createdOn.\n\nThe location the agent was at when creating the digital resource can be made using pav:createdAt."
  {:db/ident :pav/createdBy,
   :owl/equivalentProperty :pav1/createdBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An agent primary responsible for making the digital artifact or resource representation.\n\nThis property is distinct from forming the content, which is indicated with pav:contributedBy or its subproperties; pav:authoredBy, which identifies who authored the knowledge expressed by this resource; and pav:curatedBy, which identifies who curated the knowledge into its current form.\n\npav:createdBy is more specific than its superproperty dct:creator - which might or might not be interpreted to cover this creator.\n\nFor instance, the author wrote 'this species has bigger wings than normal' in his log book. The curator, going through the log book and identifying important knowledge, formalizes this as 'locus perculus has wingspan > 0.5m'. The creator enters this knowledge as a digital resource in the knowledge system, thus creating the digital artifact (say as JSON, RDF, XML or HTML).\n\nA different example is a news article. pav:authoredBy indicates the journalist who wrote the article. pav:contributedBy can indicate the artist who added an illustration. pav:curatedBy can indicate the editor who made the article conform to the news paper's style. pav:createdBy can indicate who put the article on the web site.\n\nThe software tool used by the creator to make the digital resource (say Protege, Wordpress or OpenOffice) can be indicated with pav:createdWith.\n\nThe date the digital resource was created can be indicated with pav:createdOn.\n\nThe location the agent was at when creating the digital resource can be made using pav:createdAt.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Created by@en",
   :rdfs/seeAlso [:pav/createdAt :pav/curatedBy :pav/createdOn :pav/authoredBy],
   :rdfs/subPropertyOf [:dcterms/creator
                        :prov/wasAttributedTo
                        :dcterms/contributor
                        :prov/wasInfluencedBy]})

(def createdOn
  "The date of creation of the resource representation.\n\nThe agents responsible can be indicated with pav:createdBy.\n\nThis property is normally used in a functional way, indicating the time of creation, although PAV does not formally restrict this. pav:lastUpdateOn can be used to indicate minor updates that did not affect the creating date.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime."
  {:db/ident :pav/createdOn,
   :owl/equivalentProperty :pav1/createdOn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The date of creation of the resource representation.\n\nThe agents responsible can be indicated with pav:createdBy.\n\nThis property is normally used in a functional way, indicating the time of creation, although PAV does not formally restrict this. pav:lastUpdateOn can be used to indicate minor updates that did not affect the creating date.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Created on@en",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso :pav/createdBy})

(def createdWith
  "The software/tool used by the creator (pav:createdBy) when making the digital resource, for instance a word processor or an annotation tool. A more independent software agent that creates the resource without direct interaction by a human creator should instead should instead by indicated using pav:createdBy.\n"
  {:db/ident :pav/createdWith,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The software/tool used by the creator (pav:createdBy) when making the digital resource, for instance a word processor or an annotation tool. A more independent software agent that creates the resource without direct interaction by a human creator should instead should instead by indicated using pav:createdBy.\n@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Created with@en",
   :rdfs/seeAlso :pav/createdBy,
   :rdfs/subPropertyOf [:prov/wasAttributedTo :prov/wasInfluencedBy]})

(def curatedBy
  "Specifies an agent specialist responsible for shaping the expression in an appropriate format. Often the primary agent responsible for ensuring the quality of the representation.\n\nThe curator may be different from the author (pav:authoredBy) and creator of the digital resource (pav:createdBy).\n\nThe curator may in some cases be a software agent, for instance text mining software which adds hyperlinks for recognized genome names.\n\nThe date of curating can be expressed using pav:curatedOn - note however in the case of multiple curators that there is no relationship in PAV identifying which agent contributed when or what. If capturing such lineage is desired, it should be additionally expressed using PROV relationships like prov:qualifiedAttribution or prov:wasGeneratedBy."
  {:db/ident :pav/curatedBy,
   :owl/equivalentProperty :pav1/curatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies an agent specialist responsible for shaping the expression in an appropriate format. Often the primary agent responsible for ensuring the quality of the representation.\n\nThe curator may be different from the author (pav:authoredBy) and creator of the digital resource (pav:createdBy).\n\nThe curator may in some cases be a software agent, for instance text mining software which adds hyperlinks for recognized genome names.\n\nThe date of curating can be expressed using pav:curatedOn - note however in the case of multiple curators that there is no relationship in PAV identifying which agent contributed when or what. If capturing such lineage is desired, it should be additionally expressed using PROV relationships like prov:qualifiedAttribution or prov:wasGeneratedBy.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Curated by@en",
   :rdfs/seeAlso [:pav/curatedOn :pav/createdBy],
   :rdfs/subPropertyOf [:pav/contributedBy
                        :dcterms/contributor
                        :prov/wasInfluencedBy
                        :prov/wasAttributedTo]})

(def curatedOn
  "The date this resource was curated.\n\npav:curatedBy gives the agent(s) that performed the curation.\n\nThis property is normally used in a functional way, indicating the last curation date, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime."
  {:db/ident :pav/curatedOn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The date this resource was curated.\n\npav:curatedBy gives the agent(s) that performed the curation.\n\nThis property is normally used in a functional way, indicating the last curation date, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Curated on@en",
   :rdfs/seeAlso :pav/curatedBy,
   :rdfs/subPropertyOf :pav/contributedOn})

(def curates
  "Provided for backwards compatibility. Use instead the inverse pav:curatedBy."
  {:db/ident :pav/curates,
   :owl/deprecated true,
   :owl/inverseOf :pav/curatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Provided for backwards compatibility. Use instead the inverse pav:curatedBy.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Curates@en"})

(def derivedFrom
  "Derived from a different resource.\n\nDerivation conserns itself with derived knowledge. If this resource has the same content as the other resource, but has simply been transcribed to fit a different model (like XML -> RDF or SQL -> CVS), use pav:importedFrom. If a resource was simply retrieved, use pav:retrievedFrom. If the content has however been further refined or modified, pav:derivedFrom should be used.\n\nDetails about who performed the derivation (e.g. who did the refining or modifications) may be indicated with pav:contributedBy and its subproperties.\n"
  {:db/ident :pav/derivedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Derived from a different resource.\n\nDerivation conserns itself with derived knowledge. If this resource has the same content as the other resource, but has simply been transcribed to fit a different model (like XML -> RDF or SQL -> CVS), use pav:importedFrom. If a resource was simply retrieved, use pav:retrievedFrom. If the content has however been further refined or modified, pav:derivedFrom should be used.\n\nDetails about who performed the derivation (e.g. who did the refining or modifications) may be indicated with pav:contributedBy and its subproperties.\n@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Derived from@en",
   :rdfs/seeAlso [:pav/previousVersion :pav/importedFrom],
   :rdfs/subPropertyOf [:prov/wasDerivedFrom :prov/wasInfluencedBy]})

(def hasCurrentVersion
  "This resource has a more specific, versioned resource with equivalent content.\n\nThis property is intended for relating a non-versioned or abstract resource to a single snapshot that can be used as a permalink to indicate the current version of the content.\n\nFor instance, if today is 2013-12-25, then a News page can indicate a corresponding snapshot resource which will refer to the news as they were of 2013-12-25.\n\n    <http://news.example.com/> pav:hasCurrentVersion <http://news.example.com/2013-12-25/> .\n\n\"Equivalent content\" is a loose definition, for instance the snapshot resource might include additional information to indicate it is a snapshot, and is not required to be immutable.\n\nOther versioned resources indicating the content at earlier times MAY be indicated with the superproperty pav:hasVersion, one of which MAY be related to the current version using pav:hasCurrentVersion:\n\n    <http://news.example.com/2013-12-25/> pav:previousVersion <http://news.example.com/2013-12-24/> .\n    <http://news.example.com/> pav:hasVersion <http://news.example.com/2013-12-23/> .\n\nNote that it might be confusing to also indicate pav:previousVersion from a resource that has hasCurrentVersion relations, as such a resource is intended to be a long-living \"unversioned\" resource. The PAV ontology does however not formally restrict this, to cater for more complex scenarios with multiple abstraction levels.\n\nSimilarly, it would normally be incorrect to indicate a pav:hasCurrentVersion from an older version; instead the current version would be found by finding the non-versioned resource that the particular resource is a version of, and then its current version.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this."
  {:db/ident :pav/hasCurrentVersion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "This resource has a more specific, versioned resource with equivalent content.\n\nThis property is intended for relating a non-versioned or abstract resource to a single snapshot that can be used as a permalink to indicate the current version of the content.\n\nFor instance, if today is 2013-12-25, then a News page can indicate a corresponding snapshot resource which will refer to the news as they were of 2013-12-25.\n\n    <http://news.example.com/> pav:hasCurrentVersion <http://news.example.com/2013-12-25/> .\n\n\"Equivalent content\" is a loose definition, for instance the snapshot resource might include additional information to indicate it is a snapshot, and is not required to be immutable.\n\nOther versioned resources indicating the content at earlier times MAY be indicated with the superproperty pav:hasVersion, one of which MAY be related to the current version using pav:hasCurrentVersion:\n\n    <http://news.example.com/2013-12-25/> pav:previousVersion <http://news.example.com/2013-12-24/> .\n    <http://news.example.com/> pav:hasVersion <http://news.example.com/2013-12-23/> .\n\nNote that it might be confusing to also indicate pav:previousVersion from a resource that has hasCurrentVersion relations, as such a resource is intended to be a long-living \"unversioned\" resource. The PAV ontology does however not formally restrict this, to cater for more complex scenarios with multiple abstraction levels.\n\nSimilarly, it would normally be incorrect to indicate a pav:hasCurrentVersion from an older version; instead the current version would be found by finding the non-versioned resource that the particular resource is a version of, and then its current version.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Has current version@en",
   :rdfs/subPropertyOf
   [:pav/hasVersion :dcterms/hasVersion :prov/generalizationOf]})

(def hasEarlierVersion
  "This versioned resource has an earlier version.\n\nAny earlier version of this resource can be indicated with pav:hasEarlierVersion, e.g.:\n\n<http://example.com/v4> pav:hasEarlierVersion <http://example.com/v2> ;\n    pav:hasEarlierVersion <http://example.com/v1> .\n\n\nThe subproperty pav:previousVersion SHOULD be used if the earlier version is the direct ancestor of this version.\n\n<http://example.com/v4> pav:previousVersion <http://example.com/v3> .\n\n\nThis property is transitive, so it should not be necessary to repeat the earlier versions of an earlier version. A chain of previous versions can be declared using the subproperty pav:previousVersion, implying that the previous previous version is also an earlier version. It might however still be useful to declare an earlier version explicitly, for instance because it is an earlier version of high relevance or because the complete chain of pav:previousVersion is not available.\n\n\nTo indicate that this version is a snapshot of a more general, non-versioned resource, e.g. \"Weather Today\" vs. \"Weather Today on 2013-12-07\", see pav:hasVersion."
  {:db/ident :pav/hasEarlierVersion,
   :rdf/type
   [:owl/TransitiveProperty :owl/AsymmetricProperty :owl/ObjectProperty],
   :rdfs/comment
   "This versioned resource has an earlier version.\n\nAny earlier version of this resource can be indicated with pav:hasEarlierVersion, e.g.:\n\n<http://example.com/v4> pav:hasEarlierVersion <http://example.com/v2> ;\n    pav:hasEarlierVersion <http://example.com/v1> .\n\n\nThe subproperty pav:previousVersion SHOULD be used if the earlier version is the direct ancestor of this version.\n\n<http://example.com/v4> pav:previousVersion <http://example.com/v3> .\n\n\nThis property is transitive, so it should not be necessary to repeat the earlier versions of an earlier version. A chain of previous versions can be declared using the subproperty pav:previousVersion, implying that the previous previous version is also an earlier version. It might however still be useful to declare an earlier version explicitly, for instance because it is an earlier version of high relevance or because the complete chain of pav:previousVersion is not available.\n\n\nTo indicate that this version is a snapshot of a more general, non-versioned resource, e.g. \"Weather Today\" vs. \"Weather Today on 2013-12-07\", see pav:hasVersion.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Has earlier version@en",
   :rdfs/subPropertyOf :prov/alternateOf})

(def hasVersion
  "This resource has a more specific, versioned resource.\n\nThis property is intended for relating a non-versioned or abstract resource to several versioned resources, e.g. snapshots. For instance, if there are two snapshots of the News page, made on 23rd and 24th of December, then:\n\n    <http://news.example.com/> pav:hasVersion <http://news.example.com/2013-12-23/> ;\n        pav:hasVersion <http://news.example.com/2013-12-24/> .\n\nIf one of the versions has somewhat the equivalent content to this resource (e.g. can be used as a permalink for this resource), then it should instead be indicated with the subproperty pav:hasCurrentVersion:\n\n    <http://news.example.com/> pav:hasCurrentVersion <http://news.example.com/2013-12-25/> .\n\nTo order the versions, use pav:previousVersion:\n\n    <http://news.example.com/2013-12-25/> pav:previousVersion <http://news.example.com/2013-12-24/> .\n    <http://news.example.com/2013-12-24/> pav:previousVersion <http://news.example.com/2013-12-23/> .\n\nNote that it might be confusing to also indicate pav:previousVersion from a resource that has pav:hasVersion relations, as such a resource is intended to be a long-living \"unversioned\" resource. The PAV ontology does however not formally restrict this, to cater for more complex scenarios with multiple abstraction levels.\n\npav:hasVersion is a subproperty of dcterms:hasVersion to more strongly define this hierarchical pattern. It is therefore also a subproperty of pav:generalizationOf (inverse of prov:specializationOf).\n\nTo indicate the existence of other, non-hierarchical kind of editions and adaptations of this resource that are not versioned snapshots (e.g. Powerpoint slides has a video recording version), use instead dcterms:hasVersion or prov:alternateOf."
  {:db/ident :pav/hasVersion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "This resource has a more specific, versioned resource.\n\nThis property is intended for relating a non-versioned or abstract resource to several versioned resources, e.g. snapshots. For instance, if there are two snapshots of the News page, made on 23rd and 24th of December, then:\n\n    <http://news.example.com/> pav:hasVersion <http://news.example.com/2013-12-23/> ;\n        pav:hasVersion <http://news.example.com/2013-12-24/> .\n\nIf one of the versions has somewhat the equivalent content to this resource (e.g. can be used as a permalink for this resource), then it should instead be indicated with the subproperty pav:hasCurrentVersion:\n\n    <http://news.example.com/> pav:hasCurrentVersion <http://news.example.com/2013-12-25/> .\n\nTo order the versions, use pav:previousVersion:\n\n    <http://news.example.com/2013-12-25/> pav:previousVersion <http://news.example.com/2013-12-24/> .\n    <http://news.example.com/2013-12-24/> pav:previousVersion <http://news.example.com/2013-12-23/> .\n\nNote that it might be confusing to also indicate pav:previousVersion from a resource that has pav:hasVersion relations, as such a resource is intended to be a long-living \"unversioned\" resource. The PAV ontology does however not formally restrict this, to cater for more complex scenarios with multiple abstraction levels.\n\npav:hasVersion is a subproperty of dcterms:hasVersion to more strongly define this hierarchical pattern. It is therefore also a subproperty of pav:generalizationOf (inverse of prov:specializationOf).\n\nTo indicate the existence of other, non-hierarchical kind of editions and adaptations of this resource that are not versioned snapshots (e.g. Powerpoint slides has a video recording version), use instead dcterms:hasVersion or prov:alternateOf.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Has version@en",
   :rdfs/seeAlso [:pav/previousVersion :pav/hasCurrentVersion],
   :rdfs/subPropertyOf [:prov/generalizationOf :dcterms/hasVersion]})

(def importedBy
  "An entity responsible for importing the data.\n\nThe importer is usually a software entity which has done the transcription from the original source.\n\nNote that pav:importedBy may overlap with pav:createdWith.\n\nThe source for the import should be given with pav:importedFrom. The time of the import should be given with pav:importedOn.\n\nSee pav:importedFrom for a discussion of import vs. retrieve vs. derived."
  {:db/ident :pav/importedBy,
   :owl/equivalentProperty :pav1/importedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An entity responsible for importing the data.\n\nThe importer is usually a software entity which has done the transcription from the original source.\n\nNote that pav:importedBy may overlap with pav:createdWith.\n\nThe source for the import should be given with pav:importedFrom. The time of the import should be given with pav:importedOn.\n\nSee pav:importedFrom for a discussion of import vs. retrieve vs. derived.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Imported by@en",
   :rdfs/seeAlso :pav/importedFrom,
   :rdfs/subPropertyOf [:prov/wasAttributedTo :prov/wasInfluencedBy]})

(def importedFrom
  "The original source of imported information.\n\nImport means that the content has been preserved, but transcribed somehow, for instance to fit a different representation model by converting formats. Examples of import are when the original was JSON and the current resource is RDF, or where the original was an document scan, and this resource is the plain text found through OCR.\n\nThe imported resource does not have to be complete, but should be consistent with the knowledge conveyed by the original resource.\n\nIf additional knowledge has been contributed, pav:derivedFrom would be more appropriate.\n\nIf the resource has been copied verbatim from the original representation (e.g. downloaded), use pav:retrievedFrom.\n\nTo indicate which agent(s) performed the import, use pav:importedBy. Use pav:importedOn to indicate when it happened. "
  {:db/ident :pav/importedFrom,
   :owl/equivalentProperty :pav1/importedFromSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The original source of imported information.\n\nImport means that the content has been preserved, but transcribed somehow, for instance to fit a different representation model by converting formats. Examples of import are when the original was JSON and the current resource is RDF, or where the original was an document scan, and this resource is the plain text found through OCR.\n\nThe imported resource does not have to be complete, but should be consistent with the knowledge conveyed by the original resource.\n\nIf additional knowledge has been contributed, pav:derivedFrom would be more appropriate.\n\nIf the resource has been copied verbatim from the original representation (e.g. downloaded), use pav:retrievedFrom.\n\nTo indicate which agent(s) performed the import, use pav:importedBy. Use pav:importedOn to indicate when it happened. @en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Imported from@en",
   :rdfs/seeAlso
   [:pav/importedOn :pav/importedBy :pav/derivedFrom :pav/retrievedFrom],
   :rdfs/subPropertyOf [:prov/wasDerivedFrom :prov/wasInfluencedBy]})

(def importedOn
  "The date this resource was imported from a source (pav:importedFrom).\n\nNote that pav:importedOn may overlap with pav:createdOn, but in cases where they differ, the import time indicates the time of the retrieval and transcription of the original source, while the creation time indicates when the final resource was made, for instance after user approval.\n\nThis property is normally used in a functional way, indicating the first import date, although PAV does not formally restrict this. If the resource is later reimported, this should instead be indicated with pav:lastRefreshedOn.\n\nThe source of the import should be given with pav:importedFrom. The agent that performed the import should be given with pav:importedBy.\n\nSee pav:importedFrom for a discussion about import vs. retrieval.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime."
  {:db/ident :pav/importedOn,
   :owl/equivalentProperty :pav1/importedOn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The date this resource was imported from a source (pav:importedFrom).\n\nNote that pav:importedOn may overlap with pav:createdOn, but in cases where they differ, the import time indicates the time of the retrieval and transcription of the original source, while the creation time indicates when the final resource was made, for instance after user approval.\n\nThis property is normally used in a functional way, indicating the first import date, although PAV does not formally restrict this. If the resource is later reimported, this should instead be indicated with pav:lastRefreshedOn.\n\nThe source of the import should be given with pav:importedFrom. The agent that performed the import should be given with pav:importedBy.\n\nSee pav:importedFrom for a discussion about import vs. retrieval.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Imported on@en",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso [:pav/importedFrom :pav/importedBy]})

(def lastRefreshedOn
  "The date of the last re-import of the resource. This property is used in addition to pav:importedOn if this version has been updated due to a re-import. If the re-import created a new resource rather than refreshing an existing resource, then instead use pav:importedOn together with pav:previousVersion.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime."
  {:db/ident :pav/lastRefreshedOn,
   :owl/equivalentProperty :pav1/importedLastOn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The date of the last re-import of the resource. This property is used in addition to pav:importedOn if this version has been updated due to a re-import. If the re-import created a new resource rather than refreshing an existing resource, then instead use pav:importedOn together with pav:previousVersion.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Last refreshed on@en",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso
   [:pav/previousVersion :pav/importedOn :pav/importedBy :pav/importedFrom]})

(def lastUpdateOn
  "The date of the last update of the resource. An update is a change which did not warrant making a new resource related using pav:previousVersion, for instance correcting a spelling mistake.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime."
  {:db/ident :pav/lastUpdateOn,
   :owl/equivalentProperty :pav1/lastUpdateOn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The date of the last update of the resource. An update is a change which did not warrant making a new resource related using pav:previousVersion, for instance correcting a spelling mistake.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Last updated on@en",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso [:pav/previousVersion :pav/createdOn]})

(def previousVersion
  "The previous version of a resource in a lineage. For instance a news article updated to correct factual information would point to the previous version of the article with pav:previousVersion. If however the content has significantly changed so that the two resources no longer share lineage (say a new article that talks about the same facts), they can instead be related using pav:derivedFrom.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this. Earlier versions which are not direct ancestors of this resource may instead be provided using the superproperty pav:hasEarlierVersion.\n\nA version number of this resource can be provided using the data property pav:version.\n\nTo indicate that this version is a snapshot of a more general, non-versioned resource, e.g. \"Weather Today\" vs. \"Weather Today on 2013-12-07\", see pav:hasVersion.\n\nNote that it might be confusing to indicate pav:previousVersion from a resource that also has pav:hasVersion or pav:hasCurrentVersion relations, as such resources are intended to be a long-living and \"unversioned\", while pav:previousVersion is intended for use between permalink-like \"snapshots\" arranged in a linear history.  "
  {:db/ident :pav/previousVersion,
   :owl/equivalentProperty :pav1/previousVersion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The previous version of a resource in a lineage. For instance a news article updated to correct factual information would point to the previous version of the article with pav:previousVersion. If however the content has significantly changed so that the two resources no longer share lineage (say a new article that talks about the same facts), they can instead be related using pav:derivedFrom.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this. Earlier versions which are not direct ancestors of this resource may instead be provided using the superproperty pav:hasEarlierVersion.\n\nA version number of this resource can be provided using the data property pav:version.\n\nTo indicate that this version is a snapshot of a more general, non-versioned resource, e.g. \"Weather Today\" vs. \"Weather Today on 2013-12-07\", see pav:hasVersion.\n\nNote that it might be confusing to indicate pav:previousVersion from a resource that also has pav:hasVersion or pav:hasCurrentVersion relations, as such resources are intended to be a long-living and \"unversioned\", while pav:previousVersion is intended for use between permalink-like \"snapshots\" arranged in a linear history.  @en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Previous version@en",
   :rdfs/seeAlso [:pav/derivedFrom :pav/version :pav/hasVersion],
   :rdfs/subPropertyOf [:pav/hasEarlierVersion
                        :prov/wasRevisionOf
                        :prov/wasInfluencedBy
                        :prov/wasDerivedFrom
                        :prov/alternateOf]})

(def providedBy
  "The original provider of the encoded information (e.g. PubMed, UniProt, Science Commons).\n\nThe provider might not coincide with the dct:publisher, which would describe the current publisher of the resource. For instance if the resource was retrieved, imported or derived from a source, that source was published by the original provider. pav:providedBy provides a shortcut to indicate that original provider on the new resource.  "
  {:db/ident :pav/providedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The original provider of the encoded information (e.g. PubMed, UniProt, Science Commons).\n\nThe provider might not coincide with the dct:publisher, which would describe the current publisher of the resource. For instance if the resource was retrieved, imported or derived from a source, that source was published by the original provider. pav:providedBy provides a shortcut to indicate that original provider on the new resource.  @en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Provided by@en",
   :rdfs/seeAlso :dcterms/publisher})

(def retrievedBy
  "An entity responsible for retrieving the data from an external source.\n\nThe retrieving agent is usually a software entity, which has done the retrieval from the original source without performing any transcription.\n\nThe source that was retrieved should be given with pav:retrievedFrom. The time of the retrieval should be indicated using pav:retrievedOn.\n\nSee pav:importedFrom for a discussion of import vs. retrieve vs. derived."
  {:db/ident :pav/retrievedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An entity responsible for retrieving the data from an external source.\n\nThe retrieving agent is usually a software entity, which has done the retrieval from the original source without performing any transcription.\n\nThe source that was retrieved should be given with pav:retrievedFrom. The time of the retrieval should be indicated using pav:retrievedOn.\n\nSee pav:importedFrom for a discussion of import vs. retrieve vs. derived.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Retrieved by@en",
   :rdfs/seeAlso :pav/importedFrom,
   :rdfs/subPropertyOf [:prov/wasAttributedTo :prov/wasInfluencedBy]})

(def retrievedFrom
  "The URI where a resource has been retrieved from.\n\nThe retrieving agent is usually a software entity, which has done the retrieval from the original source without performing any transcription.\n\nRetrieval indicates that this resource has the same representation as the original resource. If the resource has been somewhat transformed, use pav:importedFrom instead.\n\nThe time of the retrieval should be indicated using pav:retrievedOn. The agent may be indicated with pav:retrievedBy."
  {:db/ident :pav/retrievedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The URI where a resource has been retrieved from.\n\nThe retrieving agent is usually a software entity, which has done the retrieval from the original source without performing any transcription.\n\nRetrieval indicates that this resource has the same representation as the original resource. If the resource has been somewhat transformed, use pav:importedFrom instead.\n\nThe time of the retrieval should be indicated using pav:retrievedOn. The agent may be indicated with pav:retrievedBy.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Retrieved from@en",
   :rdfs/seeAlso [:pav/retrievedOn :pav/retrievedBy],
   :rdfs/subPropertyOf [:prov/wasDerivedFrom :prov/wasInfluencedBy]})

(def retrievedOn
  "The date the source for this resource was retrieved.\n\nThe source that was retrieved should be indicated with pav:retrievedFrom. The agent that performed the retrieval may be specified with pav:retrievedBy.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime."
  {:db/ident :pav/retrievedOn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The date the source for this resource was retrieved.\n\nThe source that was retrieved should be indicated with pav:retrievedFrom. The agent that performed the retrieval may be specified with pav:retrievedBy.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Retrieved on@en",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso [:pav/retrievedFrom :pav/retrievedBy]})

(def sourceAccessedAt
  "The resource is related to a given source which was accessed or consulted (but not retrieved, imported or derived from). This access can be detailed with pav:sourceAccessedBy and pav:sourceAccessedOn.\n\nFor instance, a curator (pav:curatedBy) might have consulted figures in a published paper to confirm that a dataset was correctly pav:importedFrom the paper's supplementary CSV file.\n\nAnother example: I can access the page for tomorrow weather in Boston (http://www.weather.com/weather/tomorrow/Boston+MA+02143)  and I can blog ‘tomorrow is going to be nice’. The source does not make any claims about the nice weather, that is my interpretation; therefore the blog post has pav:sourceAccessedAt the weather page. "
  {:db/ident :pav/sourceAccessedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The resource is related to a given source which was accessed or consulted (but not retrieved, imported or derived from). This access can be detailed with pav:sourceAccessedBy and pav:sourceAccessedOn.\n\nFor instance, a curator (pav:curatedBy) might have consulted figures in a published paper to confirm that a dataset was correctly pav:importedFrom the paper's supplementary CSV file.\n\nAnother example: I can access the page for tomorrow weather in Boston (http://www.weather.com/weather/tomorrow/Boston+MA+02143)  and I can blog ‘tomorrow is going to be nice’. The source does not make any claims about the nice weather, that is my interpretation; therefore the blog post has pav:sourceAccessedAt the weather page. @en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Source accessed at@en",
   :rdfs/seeAlso [:pav/sourceLastAccessedOn
                  :pav/sourceAccessedBy
                  :pav/retrievedFrom
                  :pav/importedFrom
                  :pav/sourceAccessedOn],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def sourceAccessedBy
  "The resource is related to a source which was accessed or consulted\nby the given agent. The source(s) should be specified using pav:sourceAccessedAt, and the time with pav:sourceAccessedOn.\n\nFor instance, the given agent could be a curator (also pav:curatedBy) which consulted figures in a published paper to confirm that a dataset was correctly pav:importedFrom the paper's supplementary CSV file."
  {:db/ident :pav/sourceAccessedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The resource is related to a source which was accessed or consulted\nby the given agent. The source(s) should be specified using pav:sourceAccessedAt, and the time with pav:sourceAccessedOn.\n\nFor instance, the given agent could be a curator (also pav:curatedBy) which consulted figures in a published paper to confirm that a dataset was correctly pav:importedFrom the paper's supplementary CSV file.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Source accessed by@en",
   :rdfs/seeAlso :pav/sourceAccessedAt})

(def sourceAccessedOn
  "The resource is related to a source which was originally accessed or consulted on the given date as part of creating or authoring the resource. The source(s) should be specified using pav:sourceAccessedAt.\n\nFor instance, if the source accessed described the weather forecast for the next day, the time of source access can be crucial information.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this. If the source is subsequently checked again (say to verify validity), this should be indicated with pav:sourceLastAccessedOn.\n\nIn the case multiple sources being accessed at different times or by different agents, PAV does not distinguish who accessed when what. If such details are required, they may be provided by additionally using prov:qualifiedInfluence.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime."
  {:db/ident :pav/sourceAccessedOn,
   :owl/equivalentProperty [:pav1/sourceAccessedOn :pav1/sourceFirstAccessedOn],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The resource is related to a source which was originally accessed or consulted on the given date as part of creating or authoring the resource. The source(s) should be specified using pav:sourceAccessedAt.\n\nFor instance, if the source accessed described the weather forecast for the next day, the time of source access can be crucial information.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this. If the source is subsequently checked again (say to verify validity), this should be indicated with pav:sourceLastAccessedOn.\n\nIn the case multiple sources being accessed at different times or by different agents, PAV does not distinguish who accessed when what. If such details are required, they may be provided by additionally using prov:qualifiedInfluence.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Source accessed on@en",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso [:pav/createdAt
                  :pav/sourceAccessedBy
                  :pav/sourceLastAccessedOn
                  :pav/sourceAccessedAt]})

(def sourceLastAccessedOn
  "The resource is related to a source which was last accessed or consulted on the given date. The source(s) should be specified using pav:sourceAccessedAt. Usage of this property indicates that the source has been checked previously, which the initial time should be indicated with pav:sourceAccessedOn.\n\nThis property can be useful together with pav:lastRefreshedOn or pav:lastUpdateOn in order to indicate a re-import or update, but could also be used alone, for instance when a source was simply verified and no further action was taken for the resource.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime."
  {:db/ident :pav/sourceLastAccessedOn,
   :owl/equivalentProperty :pav1/sourceLastAccessedOn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The resource is related to a source which was last accessed or consulted on the given date. The source(s) should be specified using pav:sourceAccessedAt. Usage of this property indicates that the source has been checked previously, which the initial time should be indicated with pav:sourceAccessedOn.\n\nThis property can be useful together with pav:lastRefreshedOn or pav:lastUpdateOn in order to indicate a re-import or update, but could also be used alone, for instance when a source was simply verified and no further action was taken for the resource.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this.\n\nThe value is of type xsd:dateTime, for instance \"2013-03-26T14:49:00+01:00\"^^xsd:dateTime. The timezone information (Z for UTC, +01:00 for UTC+1, etc) SHOULD be included unless unknown. If the time (or parts of time) is unknown, use 00:00:00Z. If the day/month is unknown, use 01-01, for instance, if we only know September 1983, then use \"1983-09-01T00:00:00Z\"^^xsd:dateTime.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Source last accessed on@en",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso [:pav/sourceAccessedBy :pav/sourceAccessedAt :pav/createdAt]})

(def version
  "The version number of a resource. This is a freetext string, typical values are \"1.5\" or \"21\". The URI identifying the previous version can be provided using prov:previousVersion.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this."
  {:db/ident :pav/version,
   :owl/equivalentProperty :pav1/versionNumber,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The version number of a resource. This is a freetext string, typical values are \"1.5\" or \"21\". The URI identifying the previous version can be provided using prov:previousVersion.\n\nThis property is normally used in a functional way, although PAV does not formally restrict this.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/pav/"},
   :rdfs/label #xsd/langString "Version@en",
   :rdfs/range :xsd/string,
   :rdfs/seeAlso :pav/previousVersion})