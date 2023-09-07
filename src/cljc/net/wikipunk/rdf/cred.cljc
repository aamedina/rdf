(ns net.wikipunk.rdf.cred
  ^{:base       "https://w3.org/2018/credentials#",
    :namespaces {"cred" "https://w3.org/2018/credentials#",
                 "dc11" "http://purl.org/dc/terms/",
                 "owl"  "http://www.w3.org/2002/07/owl#",
                 "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "vs"   "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "xsd"  "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "cred",
    :source     "https://w3.org/2018/credentials#"}
  {:dc11/date #inst "2023-09-05T00:00:00.000-00:00",
   :dc11/description
   {:rdf/language "en",
    :rdf/value
    "RDFS [[RDF-SCHEMA]] vocabulary used by the Verifiable Credentials [[VC-DATA-MODEL]]"},
   :dc11/title {:rdf/language "en",
                :rdf/value    "Verifiable Credentials Vocabulary v2.0"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/"},
   :xsd/anyURI "https://w3.org/2018/credentials#"})

(def ConfidenceMethod
  {:db/ident         :cred/ConfidenceMethod,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
                       {:xsd/anyURI
                        "https://w3c-ccg.github.io/confidence-method-spec/"}},
   :rdfs/label       "Confidence method",
   :vs/term_status   "reserved"})

(def CredentialEvidence
  {:db/ident :cred/CredentialEvidence,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>A credential evidence provides evidence schemes that are used by the <a href=\"#evidence\">evidence</a> property. This class serves as a supertype for specific evidence types.</div>"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3.org/2018/credentials#"},
   :rdfs/label "Credential Evidence",
   :vs/term_status "reserved"})

(def CredentialSchema
  {:db/ident :cred/CredentialSchema,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>A credential schema provides verifiers with enough information to determine if the provided data conforms to the provided schema. This class serves as a supertype for specific schemas (e.g., <a href=\"#JsonSchema\">JsonSchema</a>).</div>"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3.org/2018/credentials#"},
   :rdfs/label "Credential schema",
   :vs/term_status "stable"})

(def CredentialStatus
  {:db/ident :cred/CredentialStatus,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>A credential status provides enough information to determine the current status of the credential (for example, suspended or revoked). This class serves as a supertype for specific status types.</div>"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3.org/2018/credentials#"},
   :rdfs/label "Credential status",
   :vs/term_status "stable"})

(def JsonSchema
  {:db/ident         :cred/JsonSchema,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-json-schema/#jsonschema"}
                       {:xsd/anyURI "https://w3.org/2018/credentials#"}},
   :rdfs/label       "JSON schema validator",
   :rdfs/subClassOf  :cred/CredentialSchema,
   :vs/term_status   "stable"})

(def JsonSchemaCredential
  {:db/ident :cred/JsonSchemaCredential,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-json-schema/#jsonschemacredential"}},
   :rdfs/label "JSON schema validator with schema contained in a credential",
   :rdfs/subClassOf :cred/VerifiableCredential,
   :vs/term_status "stable"})

(def RefreshService
  {:db/ident :cred/RefreshService,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>A refresh service is a mechanism that can be utilized by software agents to retrieve an updated copy of a Verifiable Credential. This class serves as a supertype for specific refresh service types.</div>"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3.org/2018/credentials#"},
   :rdfs/label "Refresh service",
   :vs/term_status "reserved"})

(def RenderMethod
  {:db/ident :cred/RenderMethod,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>A specific render method specifies how a software expresses the verifiable credential using a visual, auditory, or haptic mechanism. This class serves as a supertype for specific render method types.</div>"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3.org/2018/credentials#"},
   :rdfs/label "Render method",
   :vs/term_status "reserved"})

(def TermsOfUse
  {:db/ident :cred/TermsOfUse,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>Policy under which the creator issued the credential or presentation. This class serves as a supertype for specific types for terms of use.</div>"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3.org/2018/credentials#"},
   :rdfs/label "Terms of use",
   :vs/term_status "reserved"})

(def VerifiableCredential
  {:db/ident         :cred/VerifiableCredential,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-model-2.0/#credentials"}
                       {:xsd/anyURI "https://w3.org/2018/credentials#"}},
   :rdfs/label       "Verifiable credential",
   :vs/term_status   "stable"})

(def VerifiableCredentialGraph
  {:db/ident :cred/VerifiableCredentialGraph,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>Instances of this class are <a href=\"https://www.w3.org/TR/rdf12-concepts/#section-rdf-graph\">RDF Graphs</a> [[RDF12-CONCEPTS]], where each of these graphs must include exactly one <a href=\"#VerifiableCredential\">Verifiable Credential</a>.</div>"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3.org/2018/credentials#"},
   :rdfs/label "Verifiable credential graph",
   :vs/term_status "stable"})

(def VerifiablePresentation
  {:db/ident :cred/VerifiablePresentation,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#presentations"}},
   :rdfs/label "Verifiable presentation",
   :vs/term_status "stable"})

(def confidenceMethod
  {:db/ident         :cred/confidenceMethod,
   :rdf/type         :rdfs/Property,
   :rdfs/isDefinedBy #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
                       {:xsd/anyURI
                        "https://w3c-ccg.github.io/confidence-method-spec/"}},
   :rdfs/label       "Confidence method",
   :rdfs/range       :cred/ConfidenceMethod,
   :vs/term_status   "reserved"})

(def credentialSchema
  {:db/ident :cred/credentialSchema,
   :rdf/type :rdfs/Property,
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-credentialSchema"}
     {:xsd/anyURI "https://w3.org/2018/credentials#"}},
   :rdfs/label "Credential schema",
   :rdfs/range :cred/CredentialSchema,
   :vs/term_status "stable"})

(def credentialStatus
  {:db/ident :cred/credentialStatus,
   :rdf/type :rdfs/Property,
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-credentialStatus"}},
   :rdfs/label "Credential status",
   :rdfs/range :cred/CredentialStatus,
   :vs/term_status "stable"})

(def credentialSubject
  {:db/ident :cred/credentialSubject,
   :rdf/type #{:rdfs/Property :owl/ObjectProperty},
   :rdfs/comment {:rdf/type :rdf/HTML,
                  :rdf/value
                  "<div>An entity about which claims are made.</div>"},
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-credentialSubject"}},
   :rdfs/label "Credential subject",
   :vs/term_status "stable"})

(def evidence
  {:db/ident :cred/evidence,
   :rdf/type :rdfs/Property,
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#defn-evidence"}},
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
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/2022/REC-vc-data-model-20220303/#expiration"}},
   :rdfs/label "Expiration date",
   :rdfs/range :xsd/dateTime,
   :vs/term_status "deprecated"})

(def holder
  {:db/ident :cred/holder,
   :rdf/type #{:rdfs/Property :owl/ObjectProperty},
   :rdfs/domain :cred/VerifiablePresentation,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#defn-holder"}},
   :rdfs/label "Holder",
   :vs/term_status "stable"})

(def issuanceDate
  {:db/ident :cred/issuanceDate,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedProperty :owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>The value of this property was used in the past to represent the earliest date when the information associated with the <a href=\"#credentialSubject\">credentialSubject</a> property became valid. This property has been deprecated in favor of <a href=\"#validFrom\">validFrom</a>.</div>"},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/2022/REC-vc-data-model-20220303/#issuance-date"}},
   :rdfs/label "Issuance date",
   :rdfs/range :xsd/dateTime,
   :vs/term_status "deprecated"})

(def issuer
  {:db/ident :cred/issuer,
   :rdf/type #{:rdfs/Property :owl/ObjectProperty},
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>The value of this property must be a URL uniquely identifying the issuer.</div>"},
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-model-2.0/#defn-issuer"}
                       {:xsd/anyURI "https://w3.org/2018/credentials#"}},
   :rdfs/label "Issuer",
   :vs/term_status "stable"})

(def refreshService
  {:db/ident :cred/refreshService,
   :rdf/type :rdfs/Property,
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-refreshService"}},
   :rdfs/label "Refresh service",
   :rdfs/range :cred/RefreshService,
   :vs/term_status "reserved"})

(def renderMethod
  {:db/ident :cred/renderMethod,
   :rdf/type :rdfs/Property,
   :rdfs/domain :cred/VerifiableCredential,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://w3c-ccg.github.io/vc-render-method/#the-rendermethod-property"}},
   :rdfs/label "Render method",
   :rdfs/range :cred/RenderMethod,
   :vs/term_status "reserved"})

(def termsOfUse
  {:db/ident :cred/termsOfUse,
   :rdf/type :rdfs/Property,
   :rdfs/domain {:owl/unionOf [:cred/VerifiableCredential
                               :cred/VerifiablePresentation]},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#defn-termsOfUse"}},
   :rdfs/label "Terms of use",
   :rdfs/range :cred/TermsOfUse,
   :vs/term_status "reserved"})

(def validFrom
  {:db/ident :cred/validFrom,
   :rdf/type #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain {:owl/unionOf [:cred/VerifiableCredential
                               :cred/VerifiablePresentation]},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#defn-validFrom"}
     {:xsd/anyURI "https://w3.org/2018/credentials#"}},
   :rdfs/label "Valid from",
   :rdfs/range :xsd/dateTime,
   :vs/term_status "stable"})

(def validUntil
  {:db/ident :cred/validUntil,
   :rdf/type #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain {:owl/unionOf [:cred/VerifiableCredential
                               :cred/VerifiablePresentation]},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/#defn-validUntil"}
     {:xsd/anyURI "https://w3.org/2018/credentials#"}},
   :rdfs/label "Valid until",
   :rdfs/range :xsd/dateTime,
   :vs/term_status "stable"})

(def verifiableCredential
  {:db/ident :cred/verifiableCredential,
   :rdf/type :rdfs/Property,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>The value of this property identifies a <a href=\"#VerifiableCredentialGraph\">Verifiable credential graph</a>. (Informally, it indirectly identifies a <a href=\"#VerifiableCredential\">Verifiable credential</a> contained in a separate graph.)</div>"},
   :rdfs/domain :cred/VerifiablePresentation,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3.org/2018/credentials#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-model-2.0/#defn-verifiableCredential"}},
   :rdfs/label "Verifiable credential graph",
   :rdfs/range :cred/VerifiableCredentialGraph,
   :vs/term_status "stable"})

(def urn:uuid:11a2a230-e08a-5065-a04c-26fafea6910592596
  {:dc11/date #inst "2023-09-05T00:00:00.000-00:00",
   :dc11/description
   {:rdf/language "en",
    :rdf/value
    "RDFS [[RDF-SCHEMA]] vocabulary used by the Verifiable Credentials [[VC-DATA-MODEL]]"},
   :dc11/title {:rdf/language "en",
                :rdf/value    "Verifiable Credentials Vocabulary v2.0"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/TR/vc-data-model-2.0/"},
   :xsd/anyURI "https://w3.org/2018/credentials#"})