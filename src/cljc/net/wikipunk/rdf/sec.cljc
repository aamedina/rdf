(ns net.wikipunk.rdf.sec
  ^{:base "https://w3id.org/security#",
    :namespaces {"cred"    "https://w3.org/2018/credentials#",
                 "dcterms" "http://purl.org/dc/terms/",
                 "owl"     "http://www.w3.org/2002/07/owl#",
                 "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                 "sec"     "https://w3id.org/security#",
                 "vs"      "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "xsd"     "http://www.w3.org/2001/XMLSchema#"},
    :prefix "sec",
    :source
    "https://w3c.github.io/vc-data-integrity/vocab/security/vocabulary.ttl"}
  {:dcterms/date #inst "2023-09-02T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "vocabulary used to ensure the authenticity and integrity of Verifiable Credentials and similar types of constrained digital documents using cryptography, especially through the use of digital signatures and related mathematical proofs\n"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Security Vocabulary"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/"},
   :xsd/anyURI "https://w3id.org/security#"})

(def BbsBlsSignature2020
  {:db/ident :sec/BbsBlsSignature2020,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://w3c-ccg.github.io/security-vocab/#BbsBlsSignature2020"}},
   :rdfs/label "BBS Signature, 2020 version",
   :vs/term_status "deprecated"})

(def BbsBlsSignatureProof2020
  {:db/ident :sec/BbsBlsSignatureProof2020,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://w3c-ccg.github.io/security-vocab/#BbsBlsSignatureProof2020"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "BBS Signature Proof, 2020 version",
   :vs/term_status "deprecated"})

(def Bls12381G1Key2020
  {:db/ident :sec/Bls12381G1Key2020,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://w3c-ccg.github.io/security-vocab/#Bls12381G1Key2020"}},
   :rdfs/label "BLS 12381 G1 Signature Key, 2020 version",
   :vs/term_status "deprecated"})

(def Bls12381G2Key2020
  {:db/ident :sec/Bls12381G2Key2020,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3c-ccg.github.io/security-vocab/#Bls12381G2Key2020"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "BLS 12381 G2 Signature Key, 2020 version",
   :vs/term_status "deprecated"})

(def DataIntegrityProof
  {:db/ident :sec/DataIntegrityProof,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#dataintegrityproof"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "A Data Integrity Proof",
   :rdfs/subClassOf :sec/Proof,
   :vs/term_status "stable"})

(def EcdsaSecp256k1RecoveryMethod2020
  {:db/ident :sec/EcdsaSecp256k1RecoveryMethod2020,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://w3c-ccg.github.io/ld-cryptosuite-registry/#ecdsasecp256k1recoverymethod2020"}},
   :rdfs/label "ecdsa-secp256k1 recovery method, 2020 version",
   :vs/term_status "deprecated"})

(def EcdsaSecp256k1RecoverySignature2020
  {:db/ident :sec/EcdsaSecp256k1RecoverySignature2020,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://w3c-ccg.github.io/ld-cryptosuite-registry/#ecdsasecp256k1recoverysignature2020"}},
   :rdfs/label "ecdsa-secp256k1 recovery signature, 2020 version",
   :vs/term_status "deprecated"})

(def EcdsaSecp256k1Signature2019
  {:db/ident :sec/EcdsaSecp256k1Signature2019,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://w3c-ccg.github.io/ld-cryptosuite-registry/#ecdsa-secp256k1"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "ecdsa-sep256k1, 2019 version",
   :vs/term_status "deprecated"})

(def EcdsaSecp256k1Signature2020
  {:db/ident :sec/EcdsaSecp256k1Signature2020,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://w3c-ccg.github.io/ld-cryptosuite-registry/#ecdsa-secp256k1"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "ecdsa-sep256k1, 2020 version",
   :vs/term_status "deprecated"})

(def EcdsaSecp256k1VerificationKey2019
  {:db/ident :sec/EcdsaSecp256k1VerificationKey2019,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://w3c-ccg.github.io/ld-cryptosuite-registry/#ecdsasecp256k1recoverysignature2020"}},
   :rdfs/label "ecdsa-secp256k1 verification key, 2019 version",
   :rdfs/subClassOf :sec/Key,
   :vs/term_status "deprecated"})

(def Ed25519Signature2020
  {:db/ident :sec/Ed25519Signature2020,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-di-eddsa/#ed25519signature2020"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Ed25519 Signature Suite, 2020 version",
   :rdfs/subClassOf :sec/Proof,
   :vs/term_status "stable"})

(def Ed25519VerificationKey2018
  {:db/ident :sec/Ed25519VerificationKey2018,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://w3c-ccg.github.io/ld-cryptosuite-registry/#ed25519"}},
   :rdfs/label "ED2559 Verification Key, 2018 version",
   :vs/term_status "deprecated"})

(def Ed25519VerificationKey2020
  {:db/ident :sec/Ed25519VerificationKey2020,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-di-eddsa/#ed25519verificationkey2020"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "ED2559 Verification Key, 2020 version",
   :rdfs/subClassOf :sec/VerificationMethod,
   :vs/term_status "stable"})

(def INVALID_CHALLENGE_ERROR
  {:db/ident :sec/INVALID_CHALLENGE_ERROR,
   :rdf/type :sec/ProcessingError,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#INVALID_CHALLENGE_ERROR"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Invalid challenge",
   :vs/term_status "stable"})

(def INVALID_CONTROLLER_DOCUMENT
  {:db/ident :sec/INVALID_CONTROLLER_DOCUMENT,
   :rdf/type :sec/ProcessingError,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#INVALID_CONTROLLER_DOCUMENT"}},
   :rdfs/label "Invalid controller document",
   :vs/term_status "stable"})

(def INVALID_CONTROLLER_DOCUMENT_ID
  {:db/ident :sec/INVALID_CONTROLLER_DOCUMENT_ID,
   :rdf/type :sec/ProcessingError,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#INVALID_CONTROLLER_DOCUMENT_ID"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Invalid controller document id",
   :vs/term_status "stable"})

(def INVALID_DOMAIN_ERROR
  {:db/ident :sec/INVALID_DOMAIN_ERROR,
   :rdf/type :sec/ProcessingError,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#INVALID_DOMAIN_ERROR"}},
   :rdfs/label "Invalid proof domain",
   :vs/term_status "stable"})

(def INVALID_PROOF_PURPOSE_FOR_VERIFICATION_METHOD
  {:db/ident :sec/INVALID_PROOF_PURPOSE_FOR_VERIFICATION_METHOD,
   :rdf/type :sec/ProcessingError,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#INVALID_PROOF_PURPOSE_FOR_VERIFICATION_METHOD"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Invalid proof purpose for verification method",
   :vs/term_status "stable"})

(def INVALID_VERIFICATION_METHOD
  {:db/ident :sec/INVALID_VERIFICATION_METHOD,
   :rdf/type :sec/ProcessingError,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#INVALID_VERIFICATION_METHOD"}},
   :rdfs/label "Invalid verification method",
   :vs/term_status "stable"})

(def INVALID_VERIFICATION_METHOD_URL
  {:db/ident :sec/INVALID_VERIFICATION_METHOD_URL,
   :rdf/type :sec/ProcessingError,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#INVALID_VERIFICATION_METHOD_URL"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Invalid verification method URL",
   :vs/term_status "stable"})

(def JsonWebKey
  {:db/ident         :sec/JsonWebKey,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-integrity/#jsonwebkey"}
                       {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label       "JSON Web Key Verification Method",
   :rdfs/subClassOf  :sec/VerificationMethod,
   :vs/term_status   "stable"})

(def JsonWebKey2020
  {:db/ident :sec/JsonWebKey2020,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>A linked data proof suite verification method type used with <a href=\"#JsonWebSignature2020\">`JsonWebSignature2020`</a></div>"},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3c-ccg.github.io/security-vocab/#JsonWebKey2020"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "JSON Web Key, 2020 version",
   :vs/term_status "deprecated"})

(def JsonWebSignature2020
  {:db/ident :sec/JsonWebSignature2020,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://w3c-ccg.github.io/security-vocab/#JsonWebSignature2020"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "JSON Web Signature, 2020 version",
   :vs/term_status "deprecated"})

(def Key
  {:db/ident :sec/Key,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>This class represents a cryptographic key that may be used for encryption, decryption, or digitally signing data. This class serves as a supertype for specific key types.</div>"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/security#"},
   :rdfs/label "Cryptographic key",
   :vs/term_status "deprecated"})

(def MALFORMED_PROOF_ERROR
  {:db/ident :sec/MALFORMED_PROOF_ERROR,
   :rdf/type :sec/ProcessingError,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#MALFORMED_PROOF_ERROR"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Malformed proof",
   :vs/term_status "stable"})

(def MISMATCHED_PROOF_PURPOSE_ERROR
  {:db/ident :sec/MISMATCHED_PROOF_PURPOSE_ERROR,
   :rdf/type :sec/ProcessingError,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#MISMATCHED_PROOF_PURPOSE_ERROR"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Mismatched proof purpose",
   :vs/term_status "stable"})

(def MerkleProof2019
  {:db/ident         :sec/MerkleProof2019,
   :owl/deprecated   true,
   :rdf/type         #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://w3c-ccg.github.io/lds-merkle-proof-2019/"}
                       {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label       "Merkle Proof",
   :vs/term_status   "deprecated"})

(def Multikey
  {:db/ident         :sec/Multikey,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #{{:xsd/anyURI "https://w3id.org/security#"}
                       {:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-integrity/#multikey"}},
   :rdfs/label       "Multikey Verification Method",
   :rdfs/seeAlso     {:xsd/anyURI
                      "https://www.w3.org/TR/vc-di-eddsa/#multikey"},
   :rdfs/subClassOf  :sec/VerificationMethod,
   :vs/term_status   "stable"})

(def PROOF_GENERATION_ERROR
  {:db/ident :sec/PROOF_GENERATION_ERROR,
   :rdf/type :sec/ProcessingError,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#PROOF_GENERATION_ERROR"}},
   :rdfs/label "Proof generation error",
   :vs/term_status "stable"})

(def ProcessingError
  {:db/ident         :sec/ProcessingError,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy #{{:xsd/anyURI "https://w3id.org/security#"}
                       {:xsd/anyURI
                        "https://www.w3.org/TR/vc-di-eddsa/#errors"}},
   :rdfs/label       "Processing error",
   :vs/term_status   "stable"})

(def Proof
  {:db/ident :sec/Proof,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>This class represents a digital proof on serialized data.</div>"},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#dfn-data-integrity-proof"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Digital proof",
   :vs/term_status "stable"})

(def ProofGraph
  {:db/ident :sec/ProofGraph,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<div>Instances of this class are <a href=\"https://www.w3.org/TR/rdf12-concepts/#section-rdf-graph\">RDF Graphs</a> [[RDF12-CONCEPTS]], where each of these graphs must include exactly one <a href=\"#Proof\">Proof</a> instance.</div>"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/security#"},
   :rdfs/label "An RDF Graph for a digital proof",
   :vs/term_status "stable"})

(def VerificationMethod
  {:db/ident :sec/VerificationMethod,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#verification-methods"}},
   :rdfs/label "Verification method",
   :vs/term_status "stable"})

(def X25519KeyAgreementKey2019
  {:db/ident :sec/X25519KeyAgreementKey2019,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedClass :rdfs/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://w3c-ccg.github.io/security-vocab/#X25519KeyAgreementKey2019"}},
   :rdfs/label "X25519 Key Agreement Key, 2019 version",
   :vs/term_status "deprecated"})

(def allowedAction
  {:db/ident :sec/allowedAction,
   :rdf/type :rdfs/Property,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3c-ccg.github.io/zcap-spec/#delegated-capability"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Allowed action",
   :vs/term_status "reserved"})

(def assertionMethod
  {:db/ident :sec/assertionMethod,
   :rdf/type :rdfs/Property,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#dfn-assertionmethod"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Assertion method",
   :rdfs/range :sec/VerificationMethod,
   :vs/term_status "stable"})

(def authentication
  {:db/ident :sec/authentication,
   :rdf/type :rdfs/Property,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#dfn-authentication"}},
   :rdfs/label "Authentication method",
   :rdfs/range :sec/VerificationMethod,
   :vs/term_status "stable"})

(def blockchainAccountId
  {:db/ident :sec/blockchainAccountId,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedProperty :owl/DatatypeProperty :rdf/Property},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://w3c-ccg.github.io/security-vocab/#blockchainAccountId"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Blockchain account ID",
   :rdfs/range :xsd/string,
   :vs/term_status "deprecated"})

(def capabilityAction
  {:db/ident :sec/capabilityAction,
   :rdf/type :rdfs/Property,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI
      "https://w3c-ccg.github.io/zcap-spec/#invoking-root-capability"}},
   :rdfs/label "Capability action",
   :vs/term_status "reserved"})

(def capabilityChain
  {:db/ident         :sec/capabilityChain,
   :rdf/type         :rdfs/Property,
   :rdfs/isDefinedBy #{{:xsd/anyURI "https://w3id.org/security#"}
                       {:xsd/anyURI
                        "https://w3c-ccg.github.io/zcap-spec/#delegation"}},
   :rdfs/label       "Capability chain",
   :vs/term_status   "reserved"})

(def capabilityDelegation
  {:db/ident :sec/capabilityDelegation,
   :rdf/type :rdfs/Property,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#dfn-capabilitydelegation"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Capability delegation method",
   :rdfs/range :sec/VerificationMethod,
   :vs/term_status "stable"})

(def capabilityInvocation
  {:db/ident :sec/capabilityInvocation,
   :rdf/type :rdfs/Property,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#dfn-capabilityinvocation"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Capability invocation method",
   :rdfs/range :sec/VerificationMethod,
   :vs/term_status "stable"})

(def caveat
  {:db/ident         :sec/caveat,
   :rdf/type         :rdfs/Property,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://w3c-ccg.github.io/zcap-spec/#caveats"}
                       {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label       "Caveat",
   :vs/term_status   "reserved"})

(def challenge
  {:db/ident :sec/challenge,
   :rdf/type #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain :sec/Proof,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#defn-challenge"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Challenge of a proof",
   :rdfs/range :xsd/string,
   :vs/term_status "stable"})

(def controller
  {:db/ident :sec/controller,
   :rdf/type #{:rdfs/Property :owl/ObjectProperty},
   :rdfs/domain :sec/VerificationMethod,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#defn-controller"}},
   :rdfs/label "Controller",
   :vs/term_status "stable"})

(def created
  {:db/ident         :sec/created,
   :rdf/type         #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain      :sec/Proof,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-integrity/#dfn-created"}
                       {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label       "Proof creation time",
   :rdfs/range       :xsd/dateTime,
   :vs/term_status   "stable"})

(def cryptosuite
  {:db/ident :sec/cryptosuite,
   :rdf/type #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain :sec/DataIntegrityProof,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#dfn-cryptosuite"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Cryptographic suite",
   :rdfs/range :sec/cryptosuiteString,
   :vs/term_status "stable"})

(def cryptosuiteString
  {:db/ident :sec/cryptosuiteString,
   :rdf/type :rdfs/Datatype,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#cryptosuiteString"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Datatype for cryptosuite Identifiers",
   :rdfs/subClassOf :xsd/string,
   :vs/term_status "stable"})

(def delegator
  {:db/ident         :sec/delegator,
   :rdf/type         :rdfs/Property,
   :rdfs/isDefinedBy #{{:xsd/anyURI "https://w3id.org/security#"}
                       {:xsd/anyURI
                        "https://w3c-ccg.github.io/zcap-spec/#delegation"}},
   :rdfs/label       "Delegator",
   :vs/term_status   "reserved"})

(def domain
  {:db/ident         :sec/domain,
   :rdf/type         #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain      :sec/Proof,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-integrity/#defn-domain"}
                       {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label       "Domain of a proof",
   :rdfs/range       :xsd/string,
   :vs/term_status   "stable"})

(def ethereumAddress
  {:db/ident :sec/ethereumAddress,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedProperty :owl/DatatypeProperty :rdf/Property},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3c-ccg.github.io/security-vocab/#ethereumAddress"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Ethereum address",
   :rdfs/range :xsd/string,
   :rdfs/seeAlso #{{:xsd/anyURI "https://eips.ethereum.org/EIPS/eip-55"}
                   {:xsd/anyURI
                    "https://ethereum.github.io/yellowpaper/paper.pdf"}},
   :vs/term_status "deprecated"})

(def expires
  {:db/ident :sec/expires,
   :rdf/type #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain {:owl/unionOf [:sec/Proof :sec/VerificationMethod]},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#defn-proof-expires"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Expiration time for a proof or verification method",
   :rdfs/range :xsd/dateTime,
   :vs/term_status "stable"})

(def invocationTarget
  {:db/ident :sec/invocationTarget,
   :rdf/type :rdfs/Property,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI "https://w3c-ccg.github.io/zcap-spec/#root-capability"}},
   :rdfs/label "Invocation target",
   :vs/term_status "reserved"})

(def invoker
  {:db/ident         :sec/invoker,
   :rdf/type         :rdfs/Property,
   :rdfs/isDefinedBy #{{:xsd/anyURI "https://w3id.org/security#"}
                       {:xsd/anyURI
                        "https://w3c-ccg.github.io/zcap-spec/#invocation"}},
   :rdfs/label       "Invoker",
   :vs/term_status   "reserved"})

(def jws
  {:db/ident         :sec/jws,
   :owl/deprecated   true,
   :rdf/type         #{:owl/DeprecatedProperty :rdf/Property},
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://w3c-ccg.github.io/security-vocab/#jws"}
                       {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label       "Json Web Signature",
   :rdfs/seeAlso     {:xsd/anyURI "https://tools.ietf.org/html/rfc7797"},
   :vs/term_status   "deprecated"})

(def keyAgreement
  {:db/ident :sec/keyAgreement,
   :rdf/type :rdfs/Property,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#dfn-keyagreement"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Key agreement protocols",
   :rdfs/range :sec/VerificationMethod,
   :vs/term_status "stable"})

(def multibase
  {:db/ident         :sec/multibase,
   :rdf/type         :rdfs/Datatype,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-integrity/#multibase"}
                       {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label       "Datatype for multibase values",
   :rdfs/subClassOf  :xsd/string,
   :vs/term_status   "stable"})

(def nonce
  {:db/ident         :sec/nonce,
   :rdf/type         #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain      :sec/Proof,
   :rdfs/isDefinedBy #{{:xsd/anyURI "https://w3id.org/security#"}
                       {:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-integrity/#dfn-nonce"}},
   :rdfs/label       "Nonce supplied by proof creator",
   :rdfs/range       :xsd/string,
   :vs/term_status   "stable"})

(def previousProof
  {:db/ident :sec/previousProof,
   :rdf/type :rdfs/Property,
   :rdfs/domain :sec/Proof,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#dfn-previousproof"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Previous proof",
   :rdfs/range :sec/Proof,
   :vs/term_status "stable"})

(def proof
  {:db/ident         :sec/proof,
   :rdf/type         :rdfs/Property,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-integrity/#proof-sets"}
                       {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label       "Proof sets",
   :rdfs/range       :sec/ProofGraph,
   :vs/term_status   "stable"})

(def proofPurpose
  {:db/ident :sec/proofPurpose,
   :rdf/type #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain :sec/Proof,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#dfn-proofpurpose"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Proof purpose",
   :rdfs/range :xsd/string,
   :vs/term_status "stable"})

(def proofValue
  {:db/ident :sec/proofValue,
   :rdf/type #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain :sec/Proof,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#dfn-proofvalue"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Proof value",
   :rdfs/range :sec/multibase,
   :vs/term_status "stable"})

(def publicKeyBase58
  {:db/ident :sec/publicKeyBase58,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedProperty :owl/DatatypeProperty :rdf/Property},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3c-ccg.github.io/security-vocab/#publicKeyBase58"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Base58-encoded Public Key",
   :rdfs/range :xsd/string,
   :vs/term_status "deprecated"})

(def publicKeyHex
  {:db/ident :sec/publicKeyHex,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedProperty :owl/DatatypeProperty :rdf/Property},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3c-ccg.github.io/security-vocab/#publicKeyHex"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Hex-encoded version of public Key",
   :rdfs/range :xsd/string,
   :rdfs/seeAlso {:xsd/anyURI "https://tools.ietf.org/html/rfc4648#section-8"},
   :vs/term_status "deprecated"})

(def publicKeyJwk
  {:db/ident :sec/publicKeyJwk,
   :rdf/type #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain :sec/JsonWebKey,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#dfn-publickeyjwk"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Public key JWK",
   :rdfs/range :rdf/JSON,
   :rdfs/seeAlso #{{:xsd/anyURI "https://tools.ietf.org/html/rfc7517"}
                   {:xsd/anyURI
                    "https://www.iana.org/assignments/jose/jose.xhtml"}},
   :vs/term_status "stable"})

(def publicKeyMultibase
  {:db/ident :sec/publicKeyMultibase,
   :rdf/type #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain :sec/Multikey,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#dfn-publickeymultibase"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Public key multibase",
   :rdfs/range :sec/multibase,
   :rdfs/seeAlso
   #{{:xsd/anyURI "https://w3c-ccg.github.io/lds-ed25519-2020/"}
     {:xsd/anyURI
      "https://datatracker.ietf.org/doc/html/draft-multiformats-multibase-03"}
     {:xsd/anyURI
      "https://github.com/multiformats/multicodec/blob/master/table.csv"}},
   :vs/term_status "stable"})

(def publicKeyPem
  {:db/ident :sec/publicKeyPem,
   :owl/deprecated true,
   :rdf/type #{:owl/DeprecatedProperty :owl/DatatypeProperty :rdf/Property},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://w3id.org/security#"}
     {:xsd/anyURI "https://w3c-ccg.github.io/security-vocab/#publicKeyPem"}},
   :rdfs/label "Public key PEM",
   :rdfs/range :xsd/string,
   :vs/term_status "deprecated"})

(def revoked
  {:db/ident         :sec/revoked,
   :rdf/type         #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain      :sec/VerificationMethod,
   :rdfs/isDefinedBy #{{:xsd/anyURI
                        "https://www.w3.org/TR/vc-data-integrity/#dfn-revoked"}
                       {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label       "Revocation time",
   :rdfs/range       :xsd/dateTime,
   :vs/term_status   "stable"})

(def secretKeyJwk
  {:db/ident :sec/secretKeyJwk,
   :rdf/type #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain :sec/JsonWebKey,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/#dfn-secretkeyjwk"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Secret key JWK",
   :rdfs/range :rdf/JSON,
   :rdfs/seeAlso #{{:xsd/anyURI "https://tools.ietf.org/html/rfc7517"}
                   {:xsd/anyURI
                    "https://www.iana.org/assignments/jose/jose.xhtml"}},
   :vs/term_status "stable"})

(def secretKeyMultibase
  {:db/ident :sec/secretKeyMultibase,
   :rdf/type #{:rdfs/Property :owl/DatatypeProperty},
   :rdfs/domain :sec/Multikey,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#dfn-secretkeymultibase"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Secret key multibase",
   :rdfs/range :sec/multibase,
   :rdfs/seeAlso
   #{{:xsd/anyURI "https://w3c-ccg.github.io/lds-ed25519-2020/"}
     {:xsd/anyURI
      "https://datatracker.ietf.org/doc/html/draft-multiformats-multibase-03"}
     {:xsd/anyURI
      "https://github.com/multiformats/multicodec/blob/master/table.csv"}},
   :vs/term_status "stable"})

(def verificationMethod
  {:db/ident :sec/verificationMethod,
   :rdf/type :rdfs/Property,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.w3.org/TR/vc-data-integrity/#dfn-verificationmethod"}
     {:xsd/anyURI "https://w3id.org/security#"}},
   :rdfs/label "Verification method",
   :rdfs/range :sec/VerificationMethod,
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/did-core/#verification-methods"},
   :vs/term_status "stable"})

(def urn:uuid:a2b9860c-cd32-559a-880b-ce2e60f5e54196031
  {:dcterms/date #inst "2023-09-02T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "vocabulary used to ensure the authenticity and integrity of Verifiable Credentials and similar types of constrained digital documents using cryptography, especially through the use of digital signatures and related mathematical proofs\n"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Security Vocabulary"},
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/TR/vc-data-integrity/"},
   :xsd/anyURI "https://w3id.org/security#"})