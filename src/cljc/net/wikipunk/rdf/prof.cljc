(ns net.wikipunk.rdf.prof
  {:dc11/contributor #{"Nicholas Car" "Simon Cox" "Alejandra Gonzalez-Beltran"},
   :dc11/creator "Rob Atkinson",
   :dcterms/contributor #{{:xsd/anyURI "http://orcid.org/0000-0002-3884-3420"}
                          {:xsd/anyURI "http://orcid.org/0000-0002-8742-7730"}},
   :dcterms/created #inst "2018-02-16T00:00:00.000-00:00",
   :dcterms/modified #inst "2018-11-15T00:00:00.000-00:00",
   :namespaces {"dc11"    "http://purl.org/dc/elements/1.1/",
                "dcat"    "http://www.w3.org/ns/dcat#",
                "dcterms" "http://purl.org/dc/terms/",
                "foaf"    "http://xmlns.com/foaf/0.1/",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "prof"    "http://www.w3.org/ns/dx/prof/",
                "prov"    "http://www.w3.org/ns/prov#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "skos"    "http://www.w3.org/2004/02/skos/core#",
                "xml"     "http://www.w3.org/XML/1998/namespace",
                "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/versionIRI :prof/|1.0|,
   :owl/versionInfo "1.0",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "prof",
   :rdfa/uri "http://www.w3.org/ns/dx/prof/",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This vocabulary is for describing relationships between standards/specifications, profiles of them and supporting artifacts such as validating resources.\n\nThis model starts with [http://dublincore.org/2012/06/14/dcterms#Standard](dct:Standard) entities which can either be Base Specifications (a standard not profiling any other Standard) or Profiles (Standards which do profile others). Base Specifications or Profiles can have Resource Descriptors associated with them that defines implementing rules for the it. Resource Descriptors must indicate the role they play (to guide, to validate etc.) and the formalism they adhere to (dct:format) to allow for content negotiation. A vocabulary of Resource Roles are provided alongside this vocabulary but that list is extensible."},
   :rdfs/label "Profiles Vocabulary",
   :xsd/anyURI "http://www.w3.org/ns/dx/prof"})

(def Profile
  {:db/ident :prof/Profile,
   :dcterms/source {:xsd/anyURI
                    "https://www.w3.org/2017/dxwg/wiki/ProfileContext"},
   :rdf/type :owl/Class,
   :rdfs/label "Profile",
   :rdfs/subClassOf :dcterms/Standard,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A named set of constraints on one or more identified base specifications or other profiles, including the identification of any implementing subclasses of datatypes, semantic interpretations, vocabularies, options and parameters of those base specifications necessary to accomplish a particular function.\n\nThis definition includes what are often called \"application profiles\", \"metadata application profiles\", or \"metadata profiles\"."}})

(def ResourceDescriptor
  {:db/ident :prof/ResourceDescriptor,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Resource Descriptor"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A resource that defines an aspect - a particular part or feature - of a Profile"},
   :skos/usageNote
   {:rdf/language "en",
    :rdf/value
    "Can be use to indicate the formalism (via dct:format) and any adherence to a dct:Standard (via dct:conformsTo) to allow for machine mediation as well as its purpose via relation to a ResourceRole (via hasRole)"}})

(def ResourceRole
  {:db/ident        :prof/ResourceRole,
   :rdf/type        :owl/Class,
   :rdfs/label      "Resource Role",
   :rdfs/subClassOf :skos/Concept,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The role that an Resource plays"},
   :skos/usageNote  {:rdf/language "en",
                     :rdf/value "Specific terms must come from a vocabulary"}})

(def hasArtifact
  {:db/ident :prof/hasArtifact,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prof/ResourceDescriptor,
   :rdfs/label "has artifact",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The URL of a downloadable file with particulars such as its format and role indicated by a Resource Descriptor"},
   :skos/usageNote {:rdf/language "en",
                    :rdf/value    ""}})

(def hasResource
  {:db/ident :prof/hasResource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has resource"},
   :rdfs/range :prof/ResourceDescriptor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A resource which describes the nature of an artifact and the role it plays in relation to a profile"},
   :skos/usageNote
   {:rdf/language "en",
    :rdf/value
    "This property is analogous to dcat:distribution however the domain is not necessarily dcat:Dataset. dcat:Dataset and prof:Profile are not disjoint, so it is up to implementations to decide if these are equivalent properties"}})

(def hasRole
  {:db/ident :prof/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prof/ResourceDescriptor,
   :rdfs/label "has role",
   :rdfs/range :skos/Concept,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The function of the described artifactresource in the expression of the Profile, such as a specification, guidance documentation, SHACL file etc."},
   :skos/usageNote
   {:rdf/language "en",
    :rdf/value
    "A set of common roles are defined by the Profiles Vocabulary. These are not exhaustive or disjoint, and may be extended for situations where finer grained description of purpose is necessary. A resource may perform multiple roles"}})

(def hasToken
  {:db/ident :prof/hasToken,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :prof/Profile,
   :rdfs/label "has token",
   :rdfs/range :xsd/token,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A preferred alternative identifier for the Profile"},
   :skos/usageNote
   {:rdf/language "en",
    :rdf/value
    "A simple lexical form of identifier that may be accepted in some circumstances, such as API arguments to reference this profile. This is a “preferred term”, since alternative identifiers may be declared and used by any implementation"}})

(def isInheritedFrom
  {:db/ident :prof/isInheritedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prof/ResourceDescriptor,
   :rdfs/label "is inherited from",
   :rdfs/range :prof/Profile,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This property indicates a Resource Descriptor described by this Profile’s base specification that is to be considered a Resource Descriptor for this Profile also"},
   :skos/usageNote
   {:rdf/language "en",
    :rdf/value
    "This property is created for the convenience of clients. When profile describers wish to allow clients to discover all resources relevant to a Profile without having to navigating an inheritance hierarchy of prof:profileOf relations, this predicate may be used to directly associate inherited Profile Descriptors with the Profile. If this property is present, it should be used consistently and all relevant resources a client may need to utilise the profile should be present and described using this predicate"}})

(def isProfileOf
  {:db/ident :prof/isProfileOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prof/Profile,
   :rdfs/label "is profile of",
   :rdfs/range :dcterms/Standard,
   :rdfs/subPropertyOf :prof/isTransitiveProfileOf,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Profile is a profile of a dct:Standard (or a Base Specification or another Profile)"},
   :skos/usageNote
   {:rdf/language "en",
    :rdf/value
    "A Profile may define constraints on the usage of one or more specifications. All constraints of these specifications are inherited, in the sense that an object conforming to a profile conforms to all the constraints specified the targets of prof:isProfileOf relations. This property is optional, allowing any specification to be declared at the root of a profile hierarchy using the Profile class"}})

(def isTransitiveProfileOf
  {:db/ident :prof/isTransitiveProfileOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prof/Profile,
   :rdfs/label "is transitive profile of",
   :rdfs/range :dcterms/Standard,
   :skos/definition {:rdf/language "en",
                     :rdf/value "A base specification an Profile conforms to"},
   :skos/usageNote
   {:rdf/language "en",
    :rdf/value
    "This is a convenience predicate that may be used to declare all specifications (including profiles) that the subject profile requires an information resource to conform to. This avoids forcing clients to traverse a profile hierarchy to find all conformance implications and available resources. If present all such relationships should be present so a client can safely avoid hierarchy traversal"}})

(def urn:uuid:398f7720-e835-563e-ac95-36bc41c61681
  {:dc11/contributor #{"Nicholas Car" "Simon Cox" "Alejandra Gonzalez-Beltran"},
   :dc11/creator "Rob Atkinson",
   :dcterms/contributor #{{:xsd/anyURI "http://orcid.org/0000-0002-3884-3420"}
                          {:xsd/anyURI "http://orcid.org/0000-0002-8742-7730"}},
   :dcterms/created #inst "2018-02-16T00:00:00.000-00:00",
   :dcterms/modified #inst "2018-11-15T00:00:00.000-00:00",
   :owl/versionIRI :prof/|1.0|,
   :owl/versionInfo "1.0",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This vocabulary is for describing relationships between standards/specifications, profiles of them and supporting artifacts such as validating resources.\n\nThis model starts with [http://dublincore.org/2012/06/14/dcterms#Standard](dct:Standard) entities which can either be Base Specifications (a standard not profiling any other Standard) or Profiles (Standards which do profile others). Base Specifications or Profiles can have Resource Descriptors associated with them that defines implementing rules for the it. Resource Descriptors must indicate the role they play (to guide, to validate etc.) and the formalism they adhere to (dct:format) to allow for content negotiation. A vocabulary of Resource Roles are provided alongside this vocabulary but that list is extensible."},
   :rdfs/label "Profiles Vocabulary",
   :xsd/anyURI "http://www.w3.org/ns/dx/prof"})