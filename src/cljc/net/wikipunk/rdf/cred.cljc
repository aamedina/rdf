(ns net.wikipunk.rdf.cred
  {:dcat/downloadURL "net/wikipunk/ext/cred.ttl",
   :dcterms/date #inst "2024-02-10T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "RDFS [[RDF-SCHEMA]] vocabulary used by the Verifiable Credentials [[VC-DATA-MODEL-2.0]]"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Verifiable Credentials Vocabulary v2.0"},
   :namespaces {"cred"    "https://w3.org/2018/credentials#",
                "dcterms" "http://purl.org/dc/terms/",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "vs"      "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cred",
   :rdfa/uri "https://w3.org/2018/credentials#",
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/"},
   :xsd/anyURI "https://w3.org/2018/credentials#"})

(def ConfidenceMethod
  {:db/ident :cred/ConfidenceMethod,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#bc-confidence-method"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Confidence method",
   :vs/term_status "reserved"})

(def CredentialEvidence
  {:db/ident :cred/CredentialEvidence,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#bc-credential-evidence"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Credential Evidence",
   :vs/term_status "reserved"})

(def CredentialSchema
  {:db/ident :cred/CredentialSchema,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#bc-credential-schema"}},
   :rdfs/label "Credential schema",
   :vs/term_status "stable"})

(def CredentialStatus
  {:db/ident :cred/CredentialStatus,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#bc-credential-status"}},
   :rdfs/label "Credential status",
   :vs/term_status "stable"})

(def EnvelopedVerifiableCredential
  {:db/ident :cred/EnvelopedVerifiableCredential,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-EnvelopedVerifiableCredential"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Enveloped verifiable credential",
   :vs/term_status "stable"})

(def JsonSchema
  {:db/ident         :cred/JsonSchema,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-json-schema/#jsonschema"}
                       {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label       "JSON schema validator",
   :rdfs/subClassOf  :cred/CredentialSchema,
   :vs/term_status   "stable"})

(def JsonSchemaCredential
  {:db/ident :cred/JsonSchemaCredential,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-json-schema/#jsonschemacredential"}},
   :rdfs/label "JSON schema validator with schema contained in a credential",
   :rdfs/subClassOf :cred/VerifiableCredential,
   :vs/term_status "stable"})

(def RefreshService
  {:db/ident :cred/RefreshService,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#bc-refresh-service"}},
   :rdfs/label "Refresh service",
   :vs/term_status "reserved"})

(def RenderMethod
  {:db/ident :cred/RenderMethod,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#bc-render-method"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Render method",
   :vs/term_status "reserved"})

(def TermsOfUse
  {:db/ident :cred/TermsOfUse,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#bc-terms-of-use"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Terms of use",
   :vs/term_status "reserved"})

(def VerifiableCredential
  {:db/ident         :cred/VerifiableCredential,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-model-2.0/#credentials"}
                       {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label       "Verifiable credential",
   :vs/term_status   "stable"})

(def VerifiableCredentialGraph
  {:db/ident :cred/VerifiableCredentialGraph,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>Instances of this class are <a href=\"https://www.w3.org/TR/rdf12-concepts/#section-rdf-graph\">RDF Graphs</a> [[RDF12-CONCEPTS]].</div>"},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#dfn-verifiablecredentialgraph"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Verifiable credential graph",
   :vs/term_status "stable"})

(def VerifiablePresentation
  {:db/ident :cred/VerifiablePresentation,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/2018/credentials#"}
     {:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#presentations"}},
   :rdfs/label "Verifiable presentation",
   :vs/term_status "stable"})

(def confidenceMethod
  {:db/ident         :cred/confidenceMethod,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy #{{:xsd/anyURI "https://www.w3.org/2018/credentials#"}
                       {:xsd/anyURI
                        "https://w3c-ccg.github.io/confidence-method-spec/"}},
   :rdfs/label       "Confidence method",
   :rdfs/range       :cred/ConfidenceMethod,
   :vs/term_status   "reserved"})

(def credentialSchema
  {:db/ident :cred/credentialSchema,
   :rdf/type :rdf/Property,
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-credentialSchema"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Credential schema",
   :rdfs/range :cred/CredentialSchema,
   :vs/term_status "stable"})

(def credentialStatus
  {:db/ident :cred/credentialStatus,
   :rdf/type :rdf/Property,
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-credentialStatus"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Credential status",
   :rdfs/range :cred/CredentialStatus,
   :vs/term_status "stable"})

(def credentialSubject
  {:db/ident :cred/credentialSubject,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-credentialSubject"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Credential subject",
   :vs/term_status "stable"})

(def digestSRI
  {:db/ident :cred/digestSRI,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#defn-digestSRI"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Subresource integrity digest",
   :rdfs/range :cred/sriString,
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/SRI/#the-integrity-attribute"},
   :vs/term_status "stable"})

(def evidence
  {:db/ident :cred/evidence,
   :rdf/type :rdf/Property,
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#defn-evidence"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Evidence",
   :rdfs/range :cred/CredentialEvidence,
   :vs/term_status "reserved"})

(def expirationDate
  {:db/ident :cred/expirationDate,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedProperty :owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>The value of this property was used in the past to express the date and time the credential ceased to be valid. It has been deprecated in favor of <a href=\"#validUntil\">validUntil</a></div>"},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/2022/REC-vc-data-model-20220303/#expiration"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Expiration date",
   :rdfs/range :xsd/dateTime,
   :vs/term_status "deprecated"})

(def holder
  {:db/ident         :cred/holder,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain      :cred/VerifiablePresentation,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-model-2.0/#defn-holder"}
                       {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label       "Holder",
   :vs/term_status   "stable"})

(def issuanceDate
  {:db/ident :cred/issuanceDate,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedProperty :owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>The value of this property was used in the past to represent the earliest date when the information associated with the <a href=\"#credentialSubject\">credentialSubject</a> property became valid. This property has been deprecated in favor of <a href=\"#validFrom\">validFrom</a>.</div>"},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/2022/REC-vc-data-model-20220303/#issuance-date"}},
   :rdfs/label "Issuance date",
   :rdfs/range :xsd/dateTime,
   :vs/term_status "deprecated"})

(def issuer
  {:db/ident         :cred/issuer,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain      :cred/VerifiableCredential,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-model-2.0/#defn-issuer"}
                       {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label       "Issuer",
   :vs/term_status   "stable"})

(def jsonSchema
  {:db/ident         :cred/jsonSchema,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain      :cred/JsonSchema,
   :rdfs/isDefinedBy #{{:xsd/anyURI "https://www.w3.org/2018/credentials#"}
                       {:xsd/anyURI
                        "https://www.w3.org/TR/vc-json-schema/#jsonschema-0"}},
   :rdfs/label       "Referring to a Json Schema",
   :rdfs/range       :rdf/JSON,
   :vs/term_status   "stable"})

(def refreshService
  {:db/ident :cred/refreshService,
   :rdf/type :rdf/Property,
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-refreshService"}},
   :rdfs/label "Refresh service",
   :rdfs/range :cred/RefreshService,
   :vs/term_status "reserved"})

(def relatedResource
  {:db/ident :cred/relatedResource,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-relatedResource"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Related resource",
   :vs/term_status "stable"})

(def renderMethod
  {:db/ident :cred/renderMethod,
   :rdf/type :rdf/Property,
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://w3c-ccg.github.io/vc-render-method/#the-rendermethod-property"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Render method",
   :rdfs/range :cred/RenderMethod,
   :vs/term_status "reserved"})

(def sriString
  {:db/ident :cred/sriString,
   :rdf/type :rdfs/Datatype,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#the-sristring-datatype"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Datatype for digest SRI values",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/SRI/#the-integrity-attribute"},
   :rdfs/subClassOf :xsd/string,
   :vs/term_status "stable"})

(def termsOfUse
  {:db/ident :cred/termsOfUse,
   :rdf/type :rdf/Property,
   :rdfs/domain {:owl/unionOf [:cred/VerifiableCredential
                               :cred/VerifiablePresentation]},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#defn-termsOfUse"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Terms of use",
   :rdfs/range :cred/TermsOfUse,
   :vs/term_status "reserved"})

(def validFrom
  {:db/ident :cred/validFrom,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain {:owl/unionOf [:cred/VerifiableCredential
                               :cred/VerifiablePresentation]},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#defn-validFrom"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Valid from",
   :rdfs/range :xsd/dateTime,
   :vs/term_status "stable"})

(def validUntil
  {:db/ident :cred/validUntil,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain {:owl/unionOf [:cred/VerifiableCredential
                               :cred/VerifiablePresentation]},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#defn-validUntil"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Valid until",
   :rdfs/range :xsd/dateTime,
   :vs/term_status "stable"})

(def verifiableCredential
  {:db/ident :cred/verifiableCredential,
   :rdf/type :rdf/Property,
   :rdfs/domain :cred/VerifiablePresentation,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-verifiableCredential"}
     {:xsd/anyURI "https://www.w3.org/2018/credentials#"}},
   :rdfs/label "Verifiable credential graph",
   :rdfs/range :cred/VerifiableCredentialGraph,
   :vs/term_status "stable"})

(def urn:uuid:11a2a230-e08a-5065-a04c-26fafea69105
  {:dcterms/date #inst "2024-02-10T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "RDFS [[RDF-SCHEMA]] vocabulary used by the Verifiable Credentials [[VC-DATA-MODEL-2.0]]"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Verifiable Credentials Vocabulary v2.0"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/"},
   :xsd/anyURI "https://w3.org/2018/credentials#"})