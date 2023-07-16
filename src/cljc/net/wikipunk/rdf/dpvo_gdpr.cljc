(ns net.wikipunk.rdf.dpvo-gdpr
  "The GDPR extension to Data Privacy Vocabulary provides terms (classes and properties) related to EU General Data Protection Regulation."
  {:dcat/downloadURL "resources/dpv-owl/dpv-gdpr/dpv-gdpr.ttl",
   :dcterms/abstract
   #xsd/langString
    "The GDPR extension to Data Privacy Vocabulary provides terms (classes and properties) related to EU General Data Protection Regulation.@en",
   :dcterms/contributor ["Bud Bruegger"
                         "Fajar J. Ekaputra"
                         "Axel Polleres"
                         "Rob Brennan"
                         "Mark Lizar"
                         "Ramisa Gachpaz Hamed"
                         "Elmar Kiesling"
                         "Simon Steyskal"
                         "Julian Flake"
                         "Eva Schlehahn"
                         "Georg P Krog"
                         "Rigo Wenning"
                         "Piero Bonatti"
                         "Javier D. Fernández"
                         "Paul Ryan"
                         "Harshvardhan J. Pandit"
                         "Bert Bos"
                         "Beatriz Esteves"
                         "David Hickey"],
   :dcterms/created #xsd/date #inst "2019-06-18T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "The GDPR extension to Data Privacy Vocabulary provides terms (classes and properties) related to EU General Data Protection Regulation.@en",
   :dcterms/license {:rdfa/uri
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #xsd/date #inst "2022-12-05T00:00:00.000-05:00",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :dcterms/title #xsd/langString "DPV-GDPR: GDPR Extension for DPV@en",
   :owl/imports {:rdfa/uri "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "1",
   :rdf/ns-prefix-map {"dcat" "http://www.w3.org/ns/dcat#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "dpv" "https://w3id.org/dpv#",
                       "dpvo" "https://w3id.org/dpv/dpv-owl#",
                       "dpvo-gdpr" "https://w3id.org/dpv/dpv-owl/dpv-gdpr#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-gdpr",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr",
   :vann/preferredNamespacePrefix "dpvo-gdpr",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"})

(def A13
  "information to be provided where personal data is directly collected from data subject"
  {:db/ident :dpvo-gdpr/A13,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg Krog"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #xsd/langString
    "information to be provided where personal data is directly collected from data subject@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_13/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "A13 Right to be Informed@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A14
  "information to be provided where personal data is collected from other sources"
  {:db/ident :dpvo-gdpr/A14,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "information to be provided where personal data is collected from other sources@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_14/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "A14 Right to be Informed@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A15
  "Right of access"
  {:db/ident :dpvo-gdpr/A15,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg Krog"}],
   :dcterms/description #xsd/langString "Right of access@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_15/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "A15 Right of Access@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A16
  "Right to rectification"
  {:db/ident :dpvo-gdpr/A16,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #xsd/langString "Right to rectification@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_16/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "A16 Right to Rectification@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A17
  "Right to erasure ('Right to be forgotten')"
  {:db/ident :dpvo-gdpr/A17,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg Krog"}],
   :dcterms/description #xsd/langString
                         "Right to erasure ('Right to be forgotten')@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_17/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "A17 Right to Erasure@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A18
  "Right to restriction of processing"
  {:db/ident :dpvo-gdpr/A18,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg Krog"}],
   :dcterms/description #xsd/langString "Right to restriction of processing@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_18/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "A18 Right to Restrict Processing@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A19
  "Right to be notified in case of rectification or erasure of personal data or restriction of processing"
  {:db/ident :dpvo-gdpr/A19,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "Right to be notified in case of rectification or erasure of personal data or restriction of processing@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_19/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "A19 Right to Rectification@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A20
  "Right to data portability"
  {:db/ident :dpvo-gdpr/A20,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description #xsd/langString "Right to data portability@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_20/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "A20 Right to Data Portability@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A21
  "Right to object to processing of personal data"
  {:db/ident :dpvo-gdpr/A21,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg Krog"}],
   :dcterms/description #xsd/langString
                         "Right to object to processing of personal data@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_21/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "A21 Right to object@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A22
  "Right not to be subject to a decision based solely on automated processing including profiling"
  {:db/ident :dpvo-gdpr/A22,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #xsd/langString
    "Right not to be subject to a decision based solely on automated processing including profiling@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_22/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString
                "A22 Right to object to automated decision making@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A45-3
  "Personal data can flow freely from the EU to a third country with an Adequacy Decision without any further safeguard being necessary."
  {:db/ident :dpvo-gdpr/A45-3,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "Personal data can flow freely from the EU to a third country with an Adequacy Decision without any further safeguard being necessary.@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_45/par_3/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has Adequacy Decision.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 45(3) adequacy decision@en",
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A46-2-a
  "A legally binding and enforceable instrument between public authorities or bodies"
  {:db/ident :dpvo-gdpr/A46-2-a,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "A legally binding and enforceable instrument between public authorities or bodies@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 46(2-a) legal instrument@en",
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A46-2-b
  "Binding corporate rules"
  {:db/ident :dpvo-gdpr/A46-2-b,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description #xsd/langString "Binding corporate rules@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 46(2-b) Binding Corporate Rules (BCR)@en",
   :rdfs/subClassOf [:dpvo-gdpr/BindingCorporateRules
                     :dpvo/DataTransferLegalBasis
                     :dpvo-gdpr/DataTransferTool
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #xsd/langString "accepted@en"})

(def A46-2-c
  "Standard data protection clauses adopted by the Commission"
  {:db/ident :dpvo-gdpr/A46-2-c,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "Standard data protection clauses adopted by the Commission@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_c/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString
                "Art 46(2-c) Standard Contractual Clauses (SCC) by EC@en",
   :rdfs/subClassOf [:dpvo-gdpr/SCCByCommission
                     :dpvo/DataTransferLegalBasis
                     :dpvo-gdpr/StandardContractualClauses
                     :dpvo/Contract
                     :dpvo-gdpr/DataTransferTool
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #xsd/langString "accepted@en"})

(def A46-2-d
  "Standard data protection clauses adopted by a Supervisory Authority"
  {:db/ident :dpvo-gdpr/A46-2-d,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "Standard data protection clauses adopted by a Supervisory Authority@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString
                "Art 46(2-d) Standard Contractual Clauses (SCC) by DPA@en",
   :rdfs/subClassOf [:dpvo-gdpr/SCCBySupervisoryAuthority
                     :dpvo/DataTransferLegalBasis
                     :dpvo-gdpr/StandardContractualClauses
                     :dpvo/Contract
                     :dpvo-gdpr/DataTransferTool
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #xsd/langString "accepted@en"})

(def A46-2-e
  "An approved code of conduct pursuant to GDPR Article 40 together with binding and enforceable commitments of the controller or processor in the third country to apply the appropriate safeguards, including as regards individuals´ rights"
  {:db/ident :dpvo-gdpr/A46-2-e,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "An approved code of conduct pursuant to GDPR Article 40 together with binding and enforceable commitments of the controller or processor in the third country to apply the appropriate safeguards, including as regards individuals´ rights@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 46(2-e) code of conduct@en",
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A46-2-f
  "An approved certification mechanism pursuant to GDPR Article 42 together with binding and enforceable commitments of the controller or processor in the third country to appy the appropriate safeguards, including as regards individuals` rights"
  {:db/ident :dpvo-gdpr/A46-2-f,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "An approved certification mechanism pursuant to GDPR Article 42 together with binding and enforceable commitments of the controller or processor in the third country to appy the appropriate safeguards, including as regards individuals` rights@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 46(2-f) certification@en",
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A46-3-a
  "Contractual clauses with controller, processor or recipient of the personal data in the third country or the international organisation."
  {:db/ident :dpvo-gdpr/A46-3-a,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "Contractual clauses with controller, processor or recipient of the personal data in the third country or the international organisation.@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_3/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards exist. Transfer does requires specific authorisation from a Supervisor Authority.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 46(3-a) contractual clauses@en",
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A46-3-b
  "Provisions to be inserted into administrative arrangements between public authorities or bodies which include enforceable and effective data subject rights"
  {:db/ident :dpvo-gdpr/A46-3-b,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "Provisions to be inserted into administrative arrangements between public authorities or bodies which include enforceable and effective data subject rights@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_3/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards exist. Transfer does requires specific authorisation from a Supervisor Authority.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 46(3-b) administrative arrangements@en",
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A49-1-a
  "The data subject has explicitly consented to the proposed transfer, after having been informed of the possible risks of such transfers for the data subject due to the absence of an adequacy decision and appropriate safeguards."
  {:db/ident :dpvo-gdpr/A49-1-a,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "The data subject has explicitly consented to the proposed transfer, after having been informed of the possible risks of such transfers for the data subject due to the absence of an adequacy decision and appropriate safeguards.@en",
   :dcterms/modified #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 49(1-a) explicit consent@en",
   :rdfs/subClassOf [:dpvo/ExplicitlyExpressedConsent
                     :dpvo/DataTransferLegalBasis],
   :vs/term_status #xsd/langString "changed@en"})

(def A49-1-b
  "The transfer is necessary for the performance of a contract between the data subject and controller or the implementation of pre-contractual measures taken at the data subject´s request."
  {:db/ident :dpvo-gdpr/A49-1-b,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "The transfer is necessary for the performance of a contract between the data subject and controller or the implementation of pre-contractual measures taken at the data subject´s request.@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 49(1-b) performance of contract@en",
   :rdfs/subClassOf [:dpvo/Contract :dpvo/DataTransferLegalBasis],
   :vs/term_status #xsd/langString "accepted@en"})

(def A49-1-c
  "The transfer is necessary for the conclusion or performance of a contract concluded in the interest of the data subject and controller and another natural or legal person."
  {:db/ident :dpvo-gdpr/A49-1-c,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "The transfer is necessary for the conclusion or performance of a contract concluded in the interest of the data subject and controller and another natural or legal person.@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_c/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 49(1-c) conclusion of contract@en",
   :rdfs/subClassOf [:dpvo/Contract :dpvo/DataTransferLegalBasis],
   :vs/term_status #xsd/langString "accepted@en"})

(def A49-1-d
  "The transfer is necessary for important reasons of public interest."
  {:db/ident :dpvo-gdpr/A49-1-d,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "The transfer is necessary for important reasons of public interest.@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 49(1-d) public interest@en",
   :rdfs/subClassOf [:dpvo/DataTransferLegalBasis :dpvo/PublicInterest],
   :vs/term_status #xsd/langString "accepted@en"})

(def A49-1-e
  "The transfer is necessary for the establishment, exercise or defence of legal claims."
  {:db/ident :dpvo-gdpr/A49-1-e,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "The transfer is necessary for the establishment, exercise or defence of legal claims.@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 49(1-e) legal claims@en",
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A49-1-f
  "The transfer is necessary in order to protect the vital interests of the data subject or of other persons, where the person is physically or legally incapable of giving consent."
  {:db/ident :dpvo-gdpr/A49-1-f,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "The transfer is necessary in order to protect the vital interests of the data subject or of other persons, where the person is physically or legally incapable of giving consent.@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 49(1-f) protect vital interests@en",
   :rdfs/subClassOf [:dpvo/DataTransferLegalBasis
                     :dpvo/VitalInterestOfNaturalPerson],
   :vs/term_status #xsd/langString "accepted@en"})

(def A49-1-g
  "The transfer is made from a register which according to Union or Member State law is intended to provide information to the public in general or by any person who can demonstrate a legitimate interest, but only to the extent that the conditions laid down by Union or Member State law for consultation are fulfilled in the particular case."
  {:db/ident :dpvo-gdpr/A49-1-g,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "The transfer is made from a register which according to Union or Member State law is intended to provide information to the public in general or by any person who can demonstrate a legitimate interest, but only to the extent that the conditions laid down by Union or Member State law for consultation are fulfilled in the particular case.@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_g/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has not Adequacy Decision. Appropriate safeguards do not exist.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 49(1-g) public register@en",
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A49-2
  "The transfer is not repetetive, concerns only a limited number of data subjects, is necessary for the purposes of compelling legitimate interests pursued by controller which are not overridden by the interests or rights and freedoms of the data subject, and controller has assessed all the circumstances surrounding the data transfer and have on the basis of that assessment provided suitable safeguards with regard to the protection of personal data."
  {:db/ident :dpvo-gdpr/A49-2,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "The transfer is not repetetive, concerns only a limited number of data subjects, is necessary for the purposes of compelling legitimate interests pursued by controller which are not overridden by the interests or rights and freedoms of the data subject, and controller has assessed all the circumstances surrounding the data transfer and have on the basis of that assessment provided suitable safeguards with regard to the protection of personal data.@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist and no other options apply.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 49(2) legitimate interests@en",
   :rdfs/subClassOf [:dpvo/DataTransferLegalBasis :dpvo/LegitimateInterest],
   :vs/term_status #xsd/langString "accepted@en"})

(def A6-1-a
  "Legal basis based on data subject's given consent to the processing of his or her personal data for one or more specific purposes"
  {:db/ident :dpvo-gdpr/A6-1-a,
   :dcterms/created #xsd/date #inst "2022-09-07T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "Legal basis based on data subject's given consent to the processing of his or her personal data for one or more specific purposes@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Consent can be explicit or non-explicit. To express these specifically, see the explicit and non-explicit variations provided for Art.6-1a.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art.6(1-a) consent@en",
   :rdfs/subClassOf :dpvo/ExpressedConsent,
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-a-explicit-consent
  "Legal basis based on data subject's given explicit consent to the processing of his or her personal data for one or more specific purposes"
  {:db/ident :dpvo-gdpr/A6-1-a-explicit-consent,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Rigo Wenning"}
                     {:xsd/string "Eva Schlehahn"}
                     {:xsd/string "Bud Bruegger"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "Legal basis based on data subject's given explicit consent to the processing of his or her personal data for one or more specific purposes@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Valid consent in this case would have requirements for being 'explicit' in addition to requirements defined by A4-11. This is also mentioned in the Article 29 Working Party document \"Guidelines on Consent under Regulation 2016/679 (wp259rev.01)\"@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 6(1-a) explicit consent@en",
   :rdfs/subClassOf
   [:dpvo-gdpr/A6-1-a :dpvo/ExplicitlyExpressedConsent :dpvo/ExpressedConsent],
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-a-non-explicit-consent
  "Legal basis based on data subject's given non-explicit express consent to the processing of his or her personal data for one or more specific purposes"
  {:db/ident :dpvo-gdpr/A6-1-a-non-explicit-consent,
   :dcterms/created #xsd/date #inst "2019-04-10T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Eva Schlehahn"}
                     {:xsd/string "Rigo Wenning"}
                     {:xsd/string "Bud Bruegger"}],
   :dcterms/description
   #xsd/langString
    "Legal basis based on data subject's given non-explicit express consent to the processing of his or her personal data for one or more specific purposes@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Definition of consent: A data subject's unambigious/clear affirmative action that signifies an agreement to process their personal data (Rigo Wenning) . What is referred to as 'non-explicit consent' here is also termed as 'regular' consent in the Article 29 Working Party document \"Guidelines on Consent under Regulation 2016/679 (wp259rev.01)\". This is the legal basis that requires consent but not at the level of being 'explicit'.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art.6(1-a) regular consent@en",
   :rdfs/subClassOf [:dpvo-gdpr/A6-1-a :dpvo/ExpressedConsent],
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-b
  "Legal basis based on performance of a contract to which the data subject is party or in order to take steps at the request of the data subject prior to entering into a contract"
  {:db/ident :dpvo-gdpr/A6-1-b,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "Legal basis based on performance of a contract to which the data subject is party or in order to take steps at the request of the data subject prior to entering into a contract@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 6(1-b) contract@en",
   :rdfs/subClassOf :dpvo/Contract,
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-b-contract-performance
  "Legal basis based on performance of a contract to which the data subject is party"
  {:db/ident :dpvo-gdpr/A6-1-b-contract-performance,
   :dcterms/created #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "Legal basis based on performance of a contract to which the data subject is party@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 6(1-b) contract performance@en",
   :rdfs/subClassOf
   [:dpvo/ContractPerformance :dpvo-gdpr/A6-1-b :dpvo/Contract],
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-b-enter-into-contract
  "Legal basis based on taking steps at the request of the data subject prior to entering into a contract"
  {:db/ident :dpvo-gdpr/A6-1-b-enter-into-contract,
   :dcterms/created #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "Legal basis based on taking steps at the request of the data subject prior to entering into a contract@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 6(1-b) enter into contract@en",
   :rdfs/subClassOf [:dpvo-gdpr/A6-1-b :dpvo/EnterIntoContract :dpvo/Contract],
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-c
  "Legal basis based on compliance with a legal obligation to which the controller is subject"
  {:db/ident :dpvo-gdpr/A6-1-c,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}],
   :dcterms/description
   #xsd/langString
    "Legal basis based on compliance with a legal obligation to which the controller is subject@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_c/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 6(1-c) legal obligation@en",
   :rdfs/subClassOf :dpvo/LegalObligation,
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-d
  "Legal basis based on protecting the vital interests of the data subject or of another natural person"
  {:db/ident :dpvo-gdpr/A6-1-d,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "Legal basis based on protecting the vital interests of the data subject or of another natural person@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 6(1-d) protect vital interests@en",
   :rdfs/subClassOf :dpvo/VitalInterest,
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-d-data-subject
  "Legal basis based on protecting the vital interests of the data subject"
  {:db/ident :dpvo-gdpr/A6-1-d-data-subject,
   :dcterms/created #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "Legal basis based on protecting the vital interests of the data subject@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString
                "Art 6(1-d) protect vital interests of data subject@en",
   :rdfs/subClassOf
   [:dpvo-gdpr/A6-1-d :dpvo/VitalInterestOfDataSubject :dpvo/VitalInterest],
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-d-natural-person
  "Legal basis based on protecting the vital interests of another natural person that is not the data subject"
  {:db/ident :dpvo-gdpr/A6-1-d-natural-person,
   :dcterms/created #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "Legal basis based on protecting the vital interests of another natural person that is not the data subject@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString
                "Art 6(1-d) protect vital interests of natural person@en",
   :rdfs/subClassOf
   [:dpvo-gdpr/A6-1-d :dpvo/VitalInterestOfNaturalPerson :dpvo/VitalInterest],
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-e
  "Legal basis based on performance of a task carried out in the public interest or in the exercise of official authority vested in the controller"
  {:db/ident :dpvo-gdpr/A6-1-e,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "Legal basis based on performance of a task carried out in the public interest or in the exercise of official authority vested in the controller@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString
                "Art 6(1-e) public interest or official authority@en",
   :rdfs/subClassOf [:dpvo/OfficialAuthorityOfController :dpvo/PublicInterest],
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-e-official-authority
  "Legal basis based on the exercise of official authority vested in the controller"
  {:db/ident :dpvo-gdpr/A6-1-e-official-authority,
   :dcterms/created #xsd/date #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "Legal basis based on the exercise of official authority vested in the controller@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 6(1-e) official authority@en",
   :rdfs/subClassOf
   [:dpvo/OfficialAuthorityOfController :dpvo-gdpr/A6-1-e :dpvo/PublicInterest],
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-e-public-interest
  "Legal basis based on performance of a task carried out in the public interest"
  {:db/ident :dpvo-gdpr/A6-1-e-public-interest,
   :dcterms/created #xsd/date #inst "2022-08-24T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "Legal basis based on performance of a task carried out in the public interest@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 6(1-e) public interest@en",
   :rdfs/subClassOf
   [:dpvo/PublicInterest :dpvo-gdpr/A6-1-e :dpvo/OfficialAuthorityOfController],
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-f
  "Legal basis based on the purposes of the legitimate interests pursued by the controller or by a third party, except where such interests are overridden by the interests or fundamental rights and freedoms of the data subject which require protection of personal data, in particular where the data subject is a child"
  {:db/ident :dpvo-gdpr/A6-1-f,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "Legal basis based on the purposes of the legitimate interests pursued by the controller or by a third party, except where such interests are overridden by the interests or fundamental rights and freedoms of the data subject which require protection of personal data, in particular where the data subject is a child@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 6(1-f) legitimate interest@en",
   :rdfs/subClassOf :dpvo/LegitimateInterest,
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-f-controller
  "Legal basis based on the purposes of the legitimate interests pursued by the controller, except where such interests are overridden by the interests or fundamental rights and freedoms of the data subject which require protection of personal data, in particular where the data subject is a child"
  {:db/ident :dpvo-gdpr/A6-1-f-controller,
   :dcterms/created #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "Legal basis based on the purposes of the legitimate interests pursued by the controller, except where such interests are overridden by the interests or fundamental rights and freedoms of the data subject which require protection of personal data, in particular where the data subject is a child@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString
                "Art 6(1-f) legitimate interest of controller@en",
   :rdfs/subClassOf [:dpvo-gdpr/A6-1-f
                     :dpvo/LegitimateInterestOfController
                     :dpvo/LegitimateInterest],
   :vs/term_status #xsd/langString "changed@en"})

(def A6-1-f-third-party
  "Legal basis based on the purposes of the legitimate interests pursued by a third party, except where such interests are overridden by the interests or fundamental rights and freedoms of the data subject which require protection of personal data, in particular where the data subject is a child"
  {:db/ident :dpvo-gdpr/A6-1-f-third-party,
   :dcterms/created #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #xsd/langString
    "Legal basis based on the purposes of the legitimate interests pursued by a third party, except where such interests are overridden by the interests or fundamental rights and freedoms of the data subject which require protection of personal data, in particular where the data subject is a child@en",
   :dcterms/modified #xsd/date #inst "2022-11-24T00:00:00.000-05:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString
                "Art 6(1-f) legitimate interest of third party@en",
   :rdfs/subClassOf [:dpvo-gdpr/A6-1-f
                     :dpvo/LegitimateInterestOfThirdParty
                     :dpvo/LegitimateInterest],
   :vs/term_status #xsd/langString "changed@en"})

(def A7-3
  "Right to withdraw consent at any time"
  {:db/ident :dpvo-gdpr/A7-3,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #xsd/langString
                         "Right to withdraw consent at any time@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_7/par_3/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "A7-3 Right to Withdraw Consent@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A77
  "Right to lodge a complaint with a supervisory authority"
  {:db/ident :dpvo-gdpr/A77,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #xsd/langString "Right to lodge a complaint with a supervisory authority@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_77/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "A77 Right to Complaint@en",
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status #xsd/langString "accepted@en"})

(def A9-2-a
  "explicit consent with special categories of data"
  {:db/ident :dpvo-gdpr/A9-2-a,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}],
   :dcterms/description #xsd/langString
                         "explicit consent with special categories of data@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 9(2-a) explicit consent@en",
   :rdfs/subClassOf :dpvo/ExplicitlyExpressedConsent,
   :vs/term_status #xsd/langString "accepted@en"})

(def A9-2-b
  "employment and social security and social protection law"
  {:db/ident :dpvo-gdpr/A9-2-b,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}],
   :dcterms/description
   #xsd/langString
    "employment and social security and social protection law@en",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label
   #xsd/langString
    "Art 9(2-b) employment, social security, social protection law@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A9-2-c
  "protection of the vital interests"
  {:db/ident :dpvo-gdpr/A9-2-c,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}],
   :dcterms/description #xsd/langString "protection of the vital interests@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_c/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 9(2-c) protect vital interest@en",
   :rdfs/subClassOf :dpvo/VitalInterest,
   :vs/term_status #xsd/langString "accepted@en"})

(def A9-2-d
  "legitimate activities with appropriate safeguards by a foundation, association or any other not-for-profit body with a political, philosophical, religious or trade union aim and on condition that the processing relates solely to the members or to former members of the body or to persons who have regular contact with it in connection with its purposes and that the personal data are not disclosed outside that body without the consent of the data subjects;"
  {:db/ident :dpvo-gdpr/A9-2-d,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}],
   :dcterms/description
   #xsd/langString
    "legitimate activities with appropriate safeguards by a foundation, association or any other not-for-profit body with a political, philosophical, religious or trade union aim and on condition that the processing relates solely to the members or to former members of the body or to persons who have regular contact with it in connection with its purposes and that the personal data are not disclosed outside that body without the consent of the data subjects;@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 9(2-d) legitimate activities@en",
   :rdfs/subClassOf :dpvo/LegitimateInterest,
   :vs/term_status #xsd/langString "accepted@en"})

(def A9-2-e
  "data manifestly made public by the data subject"
  {:db/ident :dpvo-gdpr/A9-2-e,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}],
   :dcterms/description #xsd/langString
                         "data manifestly made public by the data subject@en",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 9(2-e) data made public@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A9-2-f
  "establishment, exercise or defence of legal claims / courts acting in their judicial capacity"
  {:db/ident :dpvo-gdpr/A9-2-f,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}],
   :dcterms/description
   #xsd/langString
    "establishment, exercise or defence of legal claims / courts acting in their judicial capacity@en",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 9(2-f) judicial process@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A9-2-g
  "substantial public interest, on the basis of Union or Member State law"
  {:db/ident :dpvo-gdpr/A9-2-g,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}],
   :dcterms/description
   #xsd/langString
    "substantial public interest, on the basis of Union or Member State law@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_g/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 9(2-g) public interest@en",
   :rdfs/subClassOf :dpvo/PublicInterest,
   :vs/term_status #xsd/langString "accepted@en"})

(def A9-2-h
  "preventive or occupational medicine, for the assessment of the working capacity of the employee, medical diagnosis, the provision of health or social care or treatment or the management of health or social care systems and services on the basis of Union or Member State law or pursuant to contract with a health professional and subject to the conditions and safeguards referred to in paragraph 3"
  {:db/ident :dpvo-gdpr/A9-2-h,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}],
   :dcterms/description
   #xsd/langString
    "preventive or occupational medicine, for the assessment of the working capacity of the employee, medical diagnosis, the provision of health or social care or treatment or the management of health or social care systems and services on the basis of Union or Member State law or pursuant to contract with a health professional and subject to the conditions and safeguards referred to in paragraph 3@en",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_h/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 9(2-h) health & medicine@en",
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status #xsd/langString "accepted@en"})

(def A9-2-i
  "public interest in public health"
  {:db/ident :dpvo-gdpr/A9-2-i,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}],
   :dcterms/description #xsd/langString "public interest in public health@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_i/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Art 9(2-i) public interest in public health@en",
   :rdfs/subClassOf :dpvo/PublicInterest,
   :vs/term_status #xsd/langString "accepted@en"})

(def A9-2-j
  "public interest, scientific or historical research purposes or statistical purposes based on Union or Member State law"
  {:db/ident :dpvo-gdpr/A9-2-j,
   :dcterms/created #xsd/date #inst "2019-04-05T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Bud Bruegger"}
                     {:xsd/string "Eva Schlehahn"}],
   :dcterms/description
   #xsd/langString
    "public interest, scientific or historical research purposes or statistical purposes based on Union or Member State law@en",
   :dcterms/modified #xsd/date #inst "2021-09-08T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_j/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label
   #xsd/langString
    "Art 9(2-j) public interest, scientific research, statistical purpose@en",
   :rdfs/subClassOf :dpvo/PublicInterest,
   :vs/term_status #xsd/langString "accepted@en"})

(def AdHocContractualClauses
  "Contractual Clauses not drafted by the EU Commission, e.g. by the Controller"
  {:db/ident :dpvo-gdpr/AdHocContractualClauses,
   :dcterms/created #xsd/date #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "Contractual Clauses not drafted by the EU Commission, e.g. by the Controller@en",
   :dcterms/source
   {:rdfa/uri
    "https://edpb.europa.eu/system/files/2021-06/edpb_recommendations_202001vo.2.0_supplementarymeasurestransferstools_en.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "AdHoc Contractual Clauses@en",
   :rdfs/subClassOf [:dpvo-gdpr/DataTransferTool
                     :dpvo/Contract
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #xsd/langString "accepted@en"})

(def BindingCorporateRules
  "Binding corporate rules (BCR) are data protection policies adhered to by companies established in the EU for transfers of personal data outside the EU within a group of undertakings or enterprises."
  {:db/ident :dpvo-gdpr/BindingCorporateRules,
   :dcterms/created #xsd/date #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "David Hickey"}],
   :dcterms/description
   #xsd/langString
    "Binding corporate rules (BCR) are data protection policies adhered to by companies established in the EU for transfers of personal data outside the EU within a group of undertakings or enterprises.@en",
   :dcterms/source
   {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_20/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Binding Corporate Rules (BCR)@en",
   :rdfs/subClassOf [:dpvo-gdpr/DataTransferTool
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #xsd/langString "accepted@en"})

(def CertificationMechanismsForDataTransfers
  "Certification and its binding or specified mechanisms intended to provide sufficient safeguards for data transfers"
  {:db/ident :dpvo-gdpr/CertificationMechanismsForDataTransfers,
   :dcterms/created #xsd/date #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "Certification and its binding or specified mechanisms intended to provide sufficient safeguards for data transfers@en",
   :dcterms/source
   {:rdfa/uri
    "https://edpb.europa.eu/system/files/2021-06/edpb_recommendations_202001vo.2.0_supplementarymeasurestransferstools_en.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Certification Mechanisms for Data Transfers@en",
   :rdfs/subClassOf [:dpvo-gdpr/DataTransferTool
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #xsd/langString "accepted@en"})

(def CodesOfConductForDataTransfers
  "Codes of Conduct that outline sufficient safeguards for carrying out data transfers"
  {:db/ident :dpvo-gdpr/CodesOfConductForDataTransfers,
   :dcterms/created #xsd/date #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "Codes of Conduct that outline sufficient safeguards for carrying out data transfers@en",
   :dcterms/source
   {:rdfa/uri
    "https://edpb.europa.eu/system/files/2021-06/edpb_recommendations_202001vo.2.0_supplementarymeasurestransferstools_en.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Codes of Conduct for Data Transfers@en",
   :rdfs/subClassOf [:dpvo-gdpr/DataTransferTool
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPIAConformant
  "Expressing the specified process is conformant with a DPIA"
  {:db/ident :dpvo-gdpr/DPIAConformant,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #xsd/langString
    "Expressing the specified process is conformant with a DPIA@en",
   :rdf/type
   [:dpvo-gdpr/DPIAConformity :owl/NamedIndividual :dpvo/ConformanceStatus],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "DPIA Conformant@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPIAConformity
  "Conformity of a process with a DPIA"
  {:db/ident            :dpvo-gdpr/DPIAConformity,
   :dcterms/created     #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #xsd/langString
                         "Conformity of a process with a DPIA@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          #xsd/langString "DPIA Conformity@en",
   :rdfs/subClassOf     :dpvo/ConformanceStatus,
   :vs/term_status      #xsd/langString "accepted@en"})

(def DPIAIndicatesHighRisk
  "DPIA identifying high risk levels"
  {:db/ident            :dpvo-gdpr/DPIAIndicatesHighRisk,
   :dcterms/created     #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString "DPIA identifying high risk levels@en",
   :rdf/type            [:dpvo-gdpr/DPIARiskStatus
                         :owl/NamedIndividual
                         :dpvo/AuditStatus],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          #xsd/langString "DPIA Indicates High Risk@en",
   :vs/term_status      #xsd/langString "accepted@en"})

(def DPIAIndicatesLowRisk
  "DPIA identifying low risk levels"
  {:db/ident            :dpvo-gdpr/DPIAIndicatesLowRisk,
   :dcterms/created     #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString "DPIA identifying low risk levels@en",
   :rdf/type            [:dpvo-gdpr/DPIARiskStatus
                         :owl/NamedIndividual
                         :dpvo/AuditStatus],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          #xsd/langString "DPIA Indicates Low Risk@en",
   :vs/term_status      #xsd/langString "accepted@en"})

(def DPIAIndicatesNoRisk
  "DPIA identifying no risk is present"
  {:db/ident            :dpvo-gdpr/DPIAIndicatesNoRisk,
   :dcterms/created     #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString
                         "DPIA identifying no risk is present@en",
   :rdf/type            [:dpvo-gdpr/DPIARiskStatus
                         :owl/NamedIndividual
                         :dpvo/AuditStatus],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          #xsd/langString "DPIA Indicates No Risk@en",
   :vs/term_status      #xsd/langString "accepted@en"})

(def DPIANecessityAssessment
  "Process that determines whether a DPIA is necessary"
  {:db/ident :dpvo-gdpr/DPIANecessityAssessment,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString "Process that determines whether a DPIA is necessary@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "DPIA Necessity Assessment@en",
   :rdfs/subClassOf :dpvo/DPIA,
   :vs/term_status #xsd/langString "accepted@en"})

(def DPIANecessityStatus
  "Status reflecting whether a DPIA is necessary"
  {:db/ident            :dpvo-gdpr/DPIANecessityStatus,
   :dcterms/created     #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString
                         "Status reflecting whether a DPIA is necessary@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          #xsd/langString "DPIA Necessity Status@en",
   :rdfs/subClassOf     :dpvo/AuditStatus,
   :vs/term_status      #xsd/langString "accepted@en"})

(def DPIANonConformant
  "Expressing the specified process is not conformant with a DPIA"
  {:db/ident :dpvo-gdpr/DPIANonConformant,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #xsd/langString
    "Expressing the specified process is not conformant with a DPIA@en",
   :rdf/type
   [:dpvo-gdpr/DPIAConformity :owl/NamedIndividual :dpvo/ConformanceStatus],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "DPIA Non-Conformant@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPIANotRequired
  "Condition where a DPIA is not required"
  {:db/ident            :dpvo-gdpr/DPIANotRequired,
   :dcterms/created     #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString
                         "Condition where a DPIA is not required@en",
   :rdf/type            [:dpvo-gdpr/DPIANecessityStatus
                         :owl/NamedIndividual
                         :dpvo/AuditStatus],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          #xsd/langString "DPIA Not Required@en",
   :vs/term_status      #xsd/langString "accepted@en"})

(def DPIAOutcome
  "Process representing determining outcome of a DPIA"
  {:db/ident :dpvo-gdpr/DPIAOutcome,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString "Process representing determining outcome of a DPIA@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "DPIA Outcome@en",
   :rdfs/subClassOf :dpvo/DPIA,
   :vs/term_status #xsd/langString "accepted@en"})

(def DPIAOutcomeDPAConsultation
  "DPIA outcome status indicating a DPA consultation is required"
  {:db/ident :dpvo-gdpr/DPIAOutcomeDPAConsultation,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "DPIA outcome status indicating a DPA consultation is required@en",
   :rdf/type
   [:dpvo-gdpr/DPIAOutcomeStatus :owl/NamedIndividual :dpvo/AuditStatus],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "DPIA Outcome DPA Consultation@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPIAOutcomeHighResidualRisk
  "DPIA outcome status indicating high residual risk which are not acceptable for continuation"
  {:db/ident :dpvo-gdpr/DPIAOutcomeHighResidualRisk,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "DPIA outcome status indicating high residual risk which are not acceptable for continuation@en",
   :rdf/type
   [:dpvo-gdpr/DPIAOutcomeStatus :owl/NamedIndividual :dpvo/AuditStatus],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "DPIA Outcome High Residual Risk@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPIAOutcomeRisksMitigated
  "DPIA outcome status indicating (all) risks have been mitigated"
  {:db/ident :dpvo-gdpr/DPIAOutcomeRisksMitigated,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "DPIA outcome status indicating (all) risks have been mitigated@en",
   :rdf/type
   [:dpvo-gdpr/DPIAOutcomeStatus :owl/NamedIndividual :dpvo/AuditStatus],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "DPIA Outcome Risks Mitigated@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPIAOutcomeStatus
  "Status reflecting the outcomes of a DPIA"
  {:db/ident            :dpvo-gdpr/DPIAOutcomeStatus,
   :dcterms/created     #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString
                         "Status reflecting the outcomes of a DPIA@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          #xsd/langString "DPIA Outcome Status@en",
   :rdfs/subClassOf     :dpvo/AuditStatus,
   :vs/term_status      #xsd/langString "accepted@en"})

(def DPIAProcedure
  "Process representing carrying out a DPIA"
  {:db/ident            :dpvo-gdpr/DPIAProcedure,
   :dcterms/created     #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString
                         "Process representing carrying out a DPIA@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          #xsd/langString "DPIA Procedure@en",
   :rdfs/subClassOf     :dpvo/DPIA,
   :vs/term_status      #xsd/langString "accepted@en"})

(def DPIAProcessingRecommendation
  "Recommendation from the DPIA regarding processing"
  {:db/ident            :dpvo-gdpr/DPIAProcessingRecommendation,
   :dcterms/created     #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Harshvardhan J. Pandit"}
                         {:xsd/string "Georg P Krog"}],
   :dcterms/description #xsd/langString
                         "Recommendation from the DPIA regarding processing@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          #xsd/langString "DPIA Processing Recommendation@en",
   :rdfs/subClassOf     :dpvo/AuditStatus,
   :vs/term_status      #xsd/langString "accepted@en"})

(def DPIARecommendsProcessingContinue
  "Recommendation from a DPIA that the processing may continue"
  {:db/ident :dpvo-gdpr/DPIARecommendsProcessingContinue,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #xsd/langString
    "Recommendation from a DPIA that the processing may continue@en",
   :rdf/type [:dpvo-gdpr/DPIAProcessingRecommendation
              :owl/NamedIndividual
              :dpvo/AuditStatus],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "DPIA Recommends Processing Continue@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPIARecommendsProcessingNotContinue
  "Recommendation from a DPIA that the processing should not continue"
  {:db/ident :dpvo-gdpr/DPIARecommendsProcessingNotContinue,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #xsd/langString
    "Recommendation from a DPIA that the processing should not continue@en",
   :rdf/type [:dpvo-gdpr/DPIAProcessingRecommendation
              :owl/NamedIndividual
              :dpvo/AuditStatus],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "DPIA Recommends Processing Not Continue@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPIARequired
  "Condition where a DPIA is required"
  {:db/ident            :dpvo-gdpr/DPIARequired,
   :dcterms/created     #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString "Condition where a DPIA is required@en",
   :rdf/type            [:dpvo-gdpr/DPIANecessityStatus
                         :owl/NamedIndividual
                         :dpvo/AuditStatus],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          #xsd/langString "DPIA Required@en",
   :vs/term_status      #xsd/langString "accepted@en"})

(def DPIARiskStatus
  "Status reflecting the status of risk associated with a DPIA"
  {:db/ident :dpvo-gdpr/DPIARiskStatus,
   :dcterms/created #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "Status reflecting the status of risk associated with a DPIA@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "DPIA Risk Status@en",
   :rdfs/subClassOf :dpvo/AuditStatus,
   :vs/term_status #xsd/langString "accepted@en"})

(def DataTransferTool
  "A legal instrument or tool intended to assist or justify data transfers"
  {:db/ident :dpvo-gdpr/DataTransferTool,
   :dcterms/created #xsd/date #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "David Hickey"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "A legal instrument or tool intended to assist or justify data transfers@en",
   :dcterms/source
   [{:rdfa/uri
     "https://edpb.europa.eu/sites/default/files/consultation/edpb_recommendations_202001_supplementarymeasurestransferstools_en.pdf"}
    {:rdfa/uri "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/pnt_c/oj"}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Data Transfer Tool@en",
   :rdfs/subClassOf :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status #xsd/langString "accepted@en"})

(def DirectDataCollectionNotice
  "A Notice provided in fulfilment of GDPR's Art.13 regarding information to be provided where personal data are collected from the data subject"
  {:db/ident :dpvo-gdpr/DirectDataCollectionNotice,
   :dcterms/created #xsd/date #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Georg Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "A Notice provided in fulfilment of GDPR's Art.13 regarding information to be provided where personal data are collected from the data subject@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Direct Data Collection Notice@en",
   :rdfs/subClassOf :dpvo/RightFulfilmentNotice,
   :vs/term_status #xsd/langString "accepted@en"})

(def GDPRComplianceUnknown
  "State where lawfulness or compliance with GDPR is unknown"
  {:db/ident :dpvo-gdpr/GDPRComplianceUnknown,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "State where lawfulness or compliance with GDPR is unknown@en",
   :rdf/type [:dpvo-gdpr/GDPRLawfulness :owl/NamedIndividual :dpvo/Lawfulness],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "GDPR Compliance Unknown@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def GDPRCompliant
  "State of being lawful or legally compliant for GDPR"
  {:db/ident :dpvo-gdpr/GDPRCompliant,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString "State of being lawful or legally compliant for GDPR@en",
   :rdf/type [:dpvo-gdpr/GDPRLawfulness :owl/NamedIndividual :dpvo/Lawfulness],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "GDPR Compliant@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def GDPRLawfulness
  "Status or state associated with being lawful or legally compliant regarding GDPR"
  {:db/ident :dpvo-gdpr/GDPRLawfulness,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "Status or state associated with being lawful or legally compliant regarding GDPR@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "GDPR Lawfulness@en",
   :rdfs/subClassOf :dpvo/Lawfulness,
   :vs/term_status #xsd/langString "accepted@en"})

(def GDPRNonCompliant
  "State of being unlawful or legally non-compliant for GDPR"
  {:db/ident :dpvo-gdpr/GDPRNonCompliant,
   :dcterms/created #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "State of being unlawful or legally non-compliant for GDPR@en",
   :rdf/type [:dpvo-gdpr/GDPRLawfulness :owl/NamedIndividual :dpvo/Lawfulness],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "GDPR Non-compliant@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def IndirectDataCollectionNotice
  "A Notice provided in fulfilment of GDPR's Art.14 regarding information to be provided where personal data are not collected from the data subject"
  {:db/ident :dpvo-gdpr/IndirectDataCollectionNotice,
   :dcterms/created #xsd/date #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg Krog"}
                     {:xsd/string "Beatriz Esteves"}],
   :dcterms/description
   #xsd/langString
    "A Notice provided in fulfilment of GDPR's Art.14 regarding information to be provided where personal data are not collected from the data subject@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Indirect Data Collection Notice@en",
   :rdfs/subClassOf :dpvo/RightFulfilmentNotice,
   :vs/term_status #xsd/langString "accepted@en"})

(def RightsRecipientsNotice
  "A Notice provided in fulfilment of GDPR's Art.19 regarding Recipients to whom a rights exercise has been communicated, such as regarding rectification (A.16) or erasure of personal data (A.17) or restriction of processing (A.18)"
  {:db/ident :dpvo-gdpr/RightsRecipientsNotice,
   :dcterms/created #xsd/date #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg Krog"}],
   :dcterms/description
   #xsd/langString
    "A Notice provided in fulfilment of GDPR's Art.19 regarding Recipients to whom a rights exercise has been communicated, such as regarding rectification (A.16) or erasure of personal data (A.17) or restriction of processing (A.18)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Rights Recipients Notice@en",
   :rdfs/subClassOf :dpvo/RightFulfilmentNotice,
   :vs/term_status #xsd/langString "accepted@en"})

(def SARNotice
  "A Notice provided in fulfilment of GDPR's Art.15 regarding information to be provided for Right of Access or Subject Access Request (SAR)"
  {:db/ident :dpvo-gdpr/SARNotice,
   :dcterms/created #xsd/date #inst "2022-11-09T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "A Notice provided in fulfilment of GDPR's Art.15 regarding information to be provided for Right of Access or Subject Access Request (SAR)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "SAR Notice@en",
   :rdfs/subClassOf :dpvo/RightFulfilmentNotice,
   :vs/term_status #xsd/langString "accepted@en"})

(def SCCByCommission
  "Standard contractual clauses adopted by the Commission in accordance with the examination procedure referred to in GDPR Article 93(2)"
  {:db/ident :dpvo-gdpr/SCCByCommission,
   :dcterms/created #xsd/date #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #xsd/langString
    "Standard contractual clauses adopted by the Commission in accordance with the examination procedure referred to in GDPR Article 93(2)@en",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_c/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "SCCs adopted by Commission@en",
   :rdfs/subClassOf [:dpvo-gdpr/StandardContractualClauses
                     :dpvo-gdpr/DataTransferTool
                     :dpvo/Contract
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #xsd/langString "accepted@en"})

(def SCCBySupervisoryAuthority
  "Standard data protection clauses adopted by a supervisory authority and approved by the Commission pursuant to the examination procedure referred to in GDPR Article 93(2)"
  {:db/ident :dpvo-gdpr/SCCBySupervisoryAuthority,
   :dcterms/created #xsd/date #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "David Hickey"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #xsd/langString
    "Standard data protection clauses adopted by a supervisory authority and approved by the Commission pursuant to the examination procedure referred to in GDPR Article 93(2)@en",
   :dcterms/source
   {:rdfa/uri
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "SCCs adopted by Supervisory Authority@en",
   :rdfs/subClassOf [:dpvo-gdpr/StandardContractualClauses
                     :dpvo-gdpr/DataTransferTool
                     :dpvo/Contract
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #xsd/langString "accepted@en"})

(def StandardContractualClauses
  "Standard Contractual Clauses (SCCs) are pre-approved clauses by the EU for ensuring appropriate data protection safeguards intended for data transfers from the EU to third countries"
  {:db/ident :dpvo-gdpr/StandardContractualClauses,
   :dcterms/created #xsd/date #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "David Hickey"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #xsd/langString
    "Standard Contractual Clauses (SCCs) are pre-approved clauses by the EU for ensuring appropriate data protection safeguards intended for data transfers from the EU to third countries@en",
   :dcterms/source {:rdfa/uri
                    "https://eur-lex.europa.eu/eli/dec_impl/2021/914/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Standard Contractual Clauses (SCC)@en",
   :rdfs/subClassOf [:dpvo-gdpr/DataTransferTool
                     :dpvo/Contract
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #xsd/langString "accepted@en"})

(def SupplementaryMeasure
  "Supplementary measures are intended to additionally provide safeguards or guarentees to bring the resulting protection in line with EU requirements"
  {:db/ident :dpvo-gdpr/SupplementaryMeasure,
   :dcterms/created #xsd/date #inst "2021-09-22T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "David Hickey"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #xsd/langString
    "Supplementary measures are intended to additionally provide safeguards or guarentees to bring the resulting protection in line with EU requirements@en",
   :dcterms/source
   {:rdfa/uri
    "https://edpb.europa.eu/system/files/2021-06/edpb_recommendations_202001vo.2.0_supplementarymeasurestransferstools_en.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label #xsd/langString "Supplementary Measure@en",
   :rdfs/subClassOf [:dpvo-gdpr/DataTransferTool
                     :dpvo/TechnicalOrganisationalMeasure],
   :vs/term_status #xsd/langString "accepted@en"})