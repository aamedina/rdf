(ns net.wikipunk.rdf.role
  {:dcterms/created #inst "2018-02-16T00:00:00.000-00:00",
   :dcterms/creator
   #{{:schema/affiliation #{{:schema/name "Open Geospatial Consortium",
                             :schema/url  {:xsd/anyURI
                                           "https://www.opengeospatial.org/"}}
                            {:schema/name "Metalinkage"}},
      :schema/email       :role/rob%40metalinkage.com.au,
      :schema/identifier  {:xsd/anyURI "http://orcid.org/0000-0002-7878-2693"},
      :schema/name        "Rob Atkinson"}
     {:schema/affiliation {:schema/name "SURROUND Australia Pty Ltd",
                           :schema/url  {:xsd/anyURI
                                         "https://surroundaustralia.com"}},
      :schema/email       :role/nicholas.car%40surroundaustralia.com,
      :schema/identifier  {:xsd/anyURI "http://orcid.org/0000-0002-8742-7730"},
      :schema/name        "Nicholas J. Car"}},
   :dcterms/modified #inst "2019-11-25T00:00:00.000-00:00",
   :namespaces {"dc11"    "http://purl.org/dc/elements/1.1/",
                "dcat"    "http://www.w3.org/ns/dcat#",
                "dcterms" "http://purl.org/dc/terms/",
                "foaf"    "http://xmlns.com/foaf/0.1/",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "prof"    "http://www.w3.org/ns/dx/prof/",
                "prov"    "http://www.w3.org/ns/prov#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "role"    "http://www.w3.org/ns/dx/prof/role/",
                "schema"  "https://schema.org/",
                "skos"    "http://www.w3.org/2004/02/skos/core#",
                "xml"     "http://www.w3.org/XML/1998/namespace",
                "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :skos/ConceptScheme,
   :rdfa/prefix "role",
   :rdfa/uri "http://www.w3.org/ns/dx/prof/role/",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A vocabulary of ResourceRole instances.\n\nThis vocabulary is both a SKOS vocabulary and also a list of instances of the Profiles Vocabulary's [ResourceRole](www.w3.org/ns/dx/prof/ResourceRole) class."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Resource Roles vocabulary"},
   :xsd/anyURI "http://www.w3.org/ns/dx/prof/role/"})

(def constraints
  {:db/ident :role/constraints,
   :rdf/type #{:prof/ResourceRole :owl/NamedIndividual :skos/Concept},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Descriptions of obligations, limitations or extensions that the profile defines"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Constraints"},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Use this Role when you want to indicate the constraints that the associated Profile imposes on top of base specifications"},
   :skos/topConceptOf {:xsd/anyURI "http://www.w3.org/ns/dx/prof/role/"}})

(def example
  {:db/ident :role/example,
   :rdf/type #{:prof/ResourceRole :owl/NamedIndividual :skos/Concept},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sample instance data conforming to the profile"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Example"},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Use this Role when you want to provide instances of data conforming to the profile to inform users"},
   :skos/topConceptOf {:xsd/anyURI "http://www.w3.org/ns/dx/prof/role/"}})

(def guidance
  {:db/ident :role/guidance,
   :rdf/type #{:prof/ResourceRole :owl/NamedIndividual :skos/Concept},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Documents, in human-readable form, how to use the profile"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Guidance"},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Many existing profiles treat their human-readable forms (PDF documents etc.) as authoritative. This role is suggestive of non-authoritativeness. For a role for a human-readable resource that is authoritative, see role:Specification."},
   :skos/topConceptOf {:xsd/anyURI "http://www.w3.org/ns/dx/prof/role/"}})

(def mapping
  {:db/ident          :role/mapping,
   :rdf/type          #{:prof/ResourceRole :owl/NamedIndividual :skos/Concept},
   :skos/definition   {:rdf/language "en",
                       :rdf/value
                       "Describes conversions between two specifications"},
   :skos/prefLabel    {:rdf/language "en",
                       :rdf/value    "Mapping"},
   :skos/topConceptOf {:xsd/anyURI "http://www.w3.org/ns/dx/prof/role/"}})

(def schema
  {:db/ident :role/schema,
   :rdf/type #{:prof/ResourceRole :owl/NamedIndividual :skos/Concept},
   :skos/altLabel #{{:rdf/language "en",
                     :rdf/value    "Shape"}
                    {:rdf/language "en",
                     :rdf/value    "Structure"}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Machine-readable structural descriptions of data defined by the profile"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Schema"},
   :skos/topConceptOf {:xsd/anyURI "http://www.w3.org/ns/dx/prof/role/"}})

(def specification
  {:db/ident :role/specification,
   :rdf/type #{:prof/ResourceRole :owl/NamedIndividual :skos/Concept},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Defining the profile in human-readable form"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Specification"},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This role indicates authoritativeness. For a role for a human-readable resource that is not authoritative, see role:Guidance"},
   :skos/topConceptOf {:xsd/anyURI "http://www.w3.org/ns/dx/prof/role/"}})

(def validation
  {:db/ident :role/validation,
   :rdf/type #{:prof/ResourceRole :owl/NamedIndividual :skos/Concept},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Supplies instructions about how to verify conformance of data to the profile"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Validation"},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This role implies inclusion or import of inherited constraints"},
   :skos/topConceptOf {:xsd/anyURI "http://www.w3.org/ns/dx/prof/role/"}})

(def vocabulary
  {:db/ident          :role/vocabulary,
   :rdf/type          #{:prof/ResourceRole :owl/NamedIndividual :skos/Concept},
   :skos/definition   {:rdf/language "en",
                       :rdf/value
                       "Defines terms used in the profile specification"},
   :skos/prefLabel    {:rdf/language "en",
                       :rdf/value    "Vocabulary"},
   :skos/topConceptOf {:xsd/anyURI "http://www.w3.org/ns/dx/prof/role/"}})

(def urn:uuid:6eb3a738-61fc-5a42-8d4b-6352154a86e0
  {:dcterms/created #inst "2018-02-16T00:00:00.000-00:00",
   :dcterms/creator
   #{{:schema/affiliation #{{:schema/name "Open Geospatial Consortium",
                             :schema/url  {:xsd/anyURI
                                           "https://www.opengeospatial.org/"}}
                            {:schema/name "Metalinkage"}},
      :schema/email       :role/rob%40metalinkage.com.au,
      :schema/identifier  {:xsd/anyURI "http://orcid.org/0000-0002-7878-2693"},
      :schema/name        "Rob Atkinson"}
     {:schema/affiliation {:schema/name "SURROUND Australia Pty Ltd",
                           :schema/url  {:xsd/anyURI
                                         "https://surroundaustralia.com"}},
      :schema/email       :role/nicholas.car%40surroundaustralia.com,
      :schema/identifier  {:xsd/anyURI "http://orcid.org/0000-0002-8742-7730"},
      :schema/name        "Nicholas J. Car"}},
   :dcterms/modified #inst "2019-11-25T00:00:00.000-00:00",
   :rdf/type :skos/ConceptScheme,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A vocabulary of ResourceRole instances.\n\nThis vocabulary is both a SKOS vocabulary and also a list of instances of the Profiles Vocabulary's [ResourceRole](www.w3.org/ns/dx/prof/ResourceRole) class."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Resource Roles vocabulary"},
   :xsd/anyURI "http://www.w3.org/ns/dx/prof/role/"})