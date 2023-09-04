(ns net.wikipunk.rdf.dpvo-gdpr
  "The GDPR extension to Data Privacy Vocabulary provides terms (classes and properties) related to EU General Data Protection Regulation."
  {:dcat/downloadURL "net/wikipunk/ext/dpv-owl/dpv-gdpr/dpv-gdpr.ttl",
   :dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "The GDPR extension to Data Privacy Vocabulary provides terms (classes and properties) related to EU General Data Protection Regulation."},
   :dcterms/contributor
   #{"Fajar J. Ekaputra" "Rigo Wenning" "David Hickey" "Georg P Krog"
     "Ramisa Gachpaz Hamed" "Axel Polleres" "Simon Steyskal"
     "Harshvardhan J. Pandit" "Beatriz Esteves" "Eva Schlehahn" "Rob Brennan"
     "Bert Bos" "Julian Flake" "Paul Ryan" "Bud Bruegger" "Piero Bonatti"
     "Elmar Kiesling" "Javier D. Fernández" "Mark Lizar"},
   :dcterms/created #inst "2019-06-18T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Axel Polleres"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The GDPR extension to Data Privacy Vocabulary provides terms (classes and properties) related to EU General Data Protection Regulation."},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-12-05T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "DPV-GDPR: GDPR Extension for DPV"},
   :namespaces {"dcat"      "http://www.w3.org/ns/dcat#",
                "dcterms"   "http://purl.org/dc/terms/",
                "dpv"       "https://w3id.org/dpv#",
                "dpvo"      "https://w3id.org/dpv/dpv-owl#",
                "dpvo-gdpr" "https://w3id.org/dpv/dpv-owl/dpv-gdpr#",
                "owl"       "http://www.w3.org/2002/07/owl#",
                "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
                "skos"      "http://www.w3.org/2004/02/skos/core#",
                "vann"      "http://purl.org/vocab/vann/",
                "vs"        "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                "xsd"       "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports {:xsd/anyURI "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "1",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-gdpr",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#",
   :vann/preferredNamespacePrefix "dpvo-gdpr",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-gdpr#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr"})

(def A13
  {:db/ident :dpvo-gdpr/A13,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "information to be provided where personal data is directly collected from data subject"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_13/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A13 Right to be Informed"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A14
  {:db/ident :dpvo-gdpr/A14,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "information to be provided where personal data is collected from other sources"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_14/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A14 Right to be Informed"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A15
  {:db/ident :dpvo-gdpr/A15,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Right of access"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_15/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A15 Right of Access"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A16
  {:db/ident :dpvo-gdpr/A16,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Right to rectification"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_16/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A16 Right to Rectification"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A17
  {:db/ident :dpvo-gdpr/A17,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Right to erasure ('Right to be forgotten')"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_17/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A17 Right to Erasure"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A18
  {:db/ident :dpvo-gdpr/A18,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Right to restriction of processing"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_18/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A18 Right to Restrict Processing"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A19
  {:db/ident :dpvo-gdpr/A19,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Right to be notified in case of rectification or erasure of personal data or restriction of processing"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_19/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A19 Right to Rectification"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A20
  {:db/ident :dpvo-gdpr/A20,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Right to data portability"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_20/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A20 Right to Data Portability"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A21
  {:db/ident :dpvo-gdpr/A21,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Right to object to processing of personal data"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_21/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A21 Right to object"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A22
  {:db/ident :dpvo-gdpr/A22,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Right not to be subject to a decision based solely on automated processing including profiling"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_22/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "A22 Right to object to automated decision making"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A45-3
  {:db/ident :dpvo-gdpr/A45-3,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Personal data can flow freely from the EU to a third country with an Adequacy Decision without any further safeguard being necessary."},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_45/par_3/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has Adequacy Decision."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 45(3) adequacy decision"},
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A46-2-a
  {:db/ident :dpvo-gdpr/A46-2-a,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A legally binding and enforceable instrument between public authorities or bodies"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 46(2-a) legal instrument"},
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A46-2-b
  {:db/ident :dpvo-gdpr/A46-2-b,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Binding corporate rules"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 46(2-b) Binding Corporate Rules (BCR)"},
   :rdfs/subClassOf #{:dpvo-gdpr/BindingCorporateRules
                      :dpvo/DataTransferLegalBasis},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A46-2-c
  {:db/ident :dpvo-gdpr/A46-2-c,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Standard data protection clauses adopted by the Commission"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_c/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Art 46(2-c) Standard Contractual Clauses (SCC) by EC"},
   :rdfs/subClassOf #{:dpvo-gdpr/SCCByCommission :dpvo/DataTransferLegalBasis},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A46-2-d
  {:db/ident :dpvo-gdpr/A46-2-d,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Standard data protection clauses adopted by a Supervisory Authority"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Art 46(2-d) Standard Contractual Clauses (SCC) by DPA"},
   :rdfs/subClassOf #{:dpvo-gdpr/SCCBySupervisoryAuthority
                      :dpvo/DataTransferLegalBasis},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A46-2-e
  {:db/ident :dpvo-gdpr/A46-2-e,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An approved code of conduct pursuant to GDPR Article 40 together with binding and enforceable commitments of the controller or processor in the third country to apply the appropriate safeguards, including as regards individuals´ rights"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 46(2-e) code of conduct"},
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A46-2-f
  {:db/ident :dpvo-gdpr/A46-2-f,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "An approved certification mechanism pursuant to GDPR Article 42 together with binding and enforceable commitments of the controller or processor in the third country to appy the appropriate safeguards, including as regards individuals` rights"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Third country has appropriate safeguards. Transfer does not require specific authorisation from a Supervisor Authority."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 46(2-f) certification"},
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A46-3-a
  {:db/ident :dpvo-gdpr/A46-3-a,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Contractual clauses with controller, processor or recipient of the personal data in the third country or the international organisation."},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_3/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards exist. Transfer does requires specific authorisation from a Supervisor Authority."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 46(3-a) contractual clauses"},
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A46-3-b
  {:db/ident :dpvo-gdpr/A46-3-b,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Provisions to be inserted into administrative arrangements between public authorities or bodies which include enforceable and effective data subject rights"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_3/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards exist. Transfer does requires specific authorisation from a Supervisor Authority."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 46(3-b) administrative arrangements"},
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A49-1-a
  {:db/ident :dpvo-gdpr/A49-1-a,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The data subject has explicitly consented to the proposed transfer, after having been informed of the possible risks of such transfers for the data subject due to the absence of an adequacy decision and appropriate safeguards."},
   :dcterms/modified #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 49(1-a) explicit consent"},
   :rdfs/subClassOf #{:dpvo/DataTransferLegalBasis
                      :dpvo/ExplicitlyExpressedConsent},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A49-1-b
  {:db/ident :dpvo-gdpr/A49-1-b,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The transfer is necessary for the performance of a contract between the data subject and controller or the implementation of pre-contractual measures taken at the data subject´s request."},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 49(1-b) performance of contract"},
   :rdfs/subClassOf #{:dpvo/DataTransferLegalBasis :dpvo/Contract},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A49-1-c
  {:db/ident :dpvo-gdpr/A49-1-c,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The transfer is necessary for the conclusion or performance of a contract concluded in the interest of the data subject and controller and another natural or legal person."},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_c/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 49(1-c) conclusion of contract"},
   :rdfs/subClassOf #{:dpvo/DataTransferLegalBasis :dpvo/Contract},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A49-1-d
  {:db/ident :dpvo-gdpr/A49-1-d,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The transfer is necessary for important reasons of public interest."},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 49(1-d) public interest"},
   :rdfs/subClassOf #{:dpvo/PublicInterest :dpvo/DataTransferLegalBasis},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A49-1-e
  {:db/ident :dpvo-gdpr/A49-1-e,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The transfer is necessary for the establishment, exercise or defence of legal claims."},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 49(1-e) legal claims"},
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A49-1-f
  {:db/ident :dpvo-gdpr/A49-1-f,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The transfer is necessary in order to protect the vital interests of the data subject or of other persons, where the person is physically or legally incapable of giving consent."},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 49(1-f) protect vital interests"},
   :rdfs/subClassOf #{:dpvo/VitalInterestOfNaturalPerson
                      :dpvo/DataTransferLegalBasis},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A49-1-g
  {:db/ident :dpvo-gdpr/A49-1-g,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The transfer is made from a register which according to Union or Member State law is intended to provide information to the public in general or by any person who can demonstrate a legitimate interest, but only to the extent that the conditions laid down by Union or Member State law for consultation are fulfilled in the particular case."},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_1/pnt_g/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has not Adequacy Decision. Appropriate safeguards do not exist."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 49(1-g) public register"},
   :rdfs/subClassOf :dpvo/DataTransferLegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A49-2
  {:db/ident :dpvo-gdpr/A49-2,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The transfer is not repetetive, concerns only a limited number of data subjects, is necessary for the purposes of compelling legitimate interests pursued by controller which are not overridden by the interests or rights and freedoms of the data subject, and controller has assessed all the circumstances surrounding the data transfer and have on the basis of that assessment provided suitable safeguards with regard to the protection of personal data."},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_49/par_2/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Transfer from EU to a third country. Third country has no Adequacy Decision. Appropriate safeguards do not exist and no other options apply."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 49(2) legitimate interests"},
   :rdfs/subClassOf #{:dpvo/LegitimateInterest :dpvo/DataTransferLegalBasis},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A6-1-a
  {:db/ident :dpvo-gdpr/A6-1-a,
   :dcterms/created #inst "2022-09-07T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on data subject's given consent to the processing of his or her personal data for one or more specific purposes"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Consent can be explicit or non-explicit. To express these specifically, see the explicit and non-explicit variations provided for Art.6-1a."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art.6(1-a) consent"},
   :rdfs/subClassOf :dpvo/ExpressedConsent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-a-explicit-consent
  {:db/ident :dpvo-gdpr/A6-1-a-explicit-consent,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"} {:xsd/string "Bud Bruegger"}
                      {:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Rigo Wenning"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on data subject's given explicit consent to the processing of his or her personal data for one or more specific purposes"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Valid consent in this case would have requirements for being 'explicit' in addition to requirements defined by A4-11. This is also mentioned in the Article 29 Working Party document \"Guidelines on Consent under Regulation 2016/679 (wp259rev.01)\""},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 6(1-a) explicit consent"},
   :rdfs/subClassOf #{:dpvo-gdpr/A6-1-a :dpvo/ExplicitlyExpressedConsent},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-a-non-explicit-consent
  {:db/ident :dpvo-gdpr/A6-1-a-non-explicit-consent,
   :dcterms/created #inst "2019-04-10T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"} {:xsd/string "Bud Bruegger"}
                      {:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Rigo Wenning"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on data subject's given non-explicit express consent to the processing of his or her personal data for one or more specific purposes"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Definition of consent: A data subject's unambigious/clear affirmative action that signifies an agreement to process their personal data (Rigo Wenning) . What is referred to as 'non-explicit consent' here is also termed as 'regular' consent in the Article 29 Working Party document \"Guidelines on Consent under Regulation 2016/679 (wp259rev.01)\". This is the legal basis that requires consent but not at the level of being 'explicit'."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art.6(1-a) regular consent"},
   :rdfs/subClassOf #{:dpvo-gdpr/A6-1-a :dpvo/ExpressedConsent},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-b
  {:db/ident :dpvo-gdpr/A6-1-b,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"} {:xsd/string "Bud Bruegger"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on performance of a contract to which the data subject is party or in order to take steps at the request of the data subject prior to entering into a contract"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 6(1-b) contract"},
   :rdfs/subClassOf :dpvo/Contract,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-b-contract-performance
  {:db/ident :dpvo-gdpr/A6-1-b-contract-performance,
   :dcterms/created #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on performance of a contract to which the data subject is party"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 6(1-b) contract performance"},
   :rdfs/subClassOf #{:dpvo-gdpr/A6-1-b :dpvo/ContractPerformance},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-b-enter-into-contract
  {:db/ident :dpvo-gdpr/A6-1-b-enter-into-contract,
   :dcterms/created #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on taking steps at the request of the data subject prior to entering into a contract"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 6(1-b) enter into contract"},
   :rdfs/subClassOf #{:dpvo/EnterIntoContract :dpvo-gdpr/A6-1-b},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-c
  {:db/ident :dpvo-gdpr/A6-1-c,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"} {:xsd/string "Bud Bruegger"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on compliance with a legal obligation to which the controller is subject"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_c/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 6(1-c) legal obligation"},
   :rdfs/subClassOf :dpvo/LegalObligation,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-d
  {:db/ident :dpvo-gdpr/A6-1-d,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"} {:xsd/string "Bud Bruegger"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on protecting the vital interests of the data subject or of another natural person"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 6(1-d) protect vital interests"},
   :rdfs/subClassOf :dpvo/VitalInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-d-data-subject
  {:db/ident :dpvo-gdpr/A6-1-d-data-subject,
   :dcterms/created #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on protecting the vital interests of the data subject"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Art 6(1-d) protect vital interests of data subject"},
   :rdfs/subClassOf #{:dpvo-gdpr/A6-1-d :dpvo/VitalInterestOfDataSubject},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-d-natural-person
  {:db/ident :dpvo-gdpr/A6-1-d-natural-person,
   :dcterms/created #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on protecting the vital interests of another natural person that is not the data subject"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Art 6(1-d) protect vital interests of natural person"},
   :rdfs/subClassOf #{:dpvo/VitalInterestOfNaturalPerson :dpvo-gdpr/A6-1-d},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-e
  {:db/ident :dpvo-gdpr/A6-1-e,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"} {:xsd/string "Bud Bruegger"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on performance of a task carried out in the public interest or in the exercise of official authority vested in the controller"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "Art 6(1-e) public interest or official authority"},
   :rdfs/subClassOf #{:dpvo/PublicInterest :dpvo/OfficialAuthorityOfController},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-e-official-authority
  {:db/ident :dpvo-gdpr/A6-1-e-official-authority,
   :dcterms/created #inst "2022-08-24T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on the exercise of official authority vested in the controller"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 6(1-e) official authority"},
   :rdfs/subClassOf #{:dpvo/OfficialAuthorityOfController :dpvo-gdpr/A6-1-e},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-e-public-interest
  {:db/ident :dpvo-gdpr/A6-1-e-public-interest,
   :dcterms/created #inst "2022-08-24T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on performance of a task carried out in the public interest"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 6(1-e) public interest"},
   :rdfs/subClassOf #{:dpvo/PublicInterest :dpvo-gdpr/A6-1-e},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-f
  {:db/ident :dpvo-gdpr/A6-1-f,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"} {:xsd/string "Bud Bruegger"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on the purposes of the legitimate interests pursued by the controller or by a third party, except where such interests are overridden by the interests or fundamental rights and freedoms of the data subject which require protection of personal data, in particular where the data subject is a child"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 6(1-f) legitimate interest"},
   :rdfs/subClassOf :dpvo/LegitimateInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-f-controller
  {:db/ident :dpvo-gdpr/A6-1-f-controller,
   :dcterms/created #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on the purposes of the legitimate interests pursued by the controller, except where such interests are overridden by the interests or fundamental rights and freedoms of the data subject which require protection of personal data, in particular where the data subject is a child"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 6(1-f) legitimate interest of controller"},
   :rdfs/subClassOf #{:dpvo/LegitimateInterestOfController :dpvo-gdpr/A6-1-f},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A6-1-f-third-party
  {:db/ident :dpvo-gdpr/A6-1-f-third-party,
   :dcterms/created #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Legal basis based on the purposes of the legitimate interests pursued by a third party, except where such interests are overridden by the interests or fundamental rights and freedoms of the data subject which require protection of personal data, in particular where the data subject is a child"},
   :dcterms/modified #inst "2022-11-24T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_6/par_1/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 6(1-f) legitimate interest of third party"},
   :rdfs/subClassOf #{:dpvo/LegitimateInterestOfThirdParty :dpvo-gdpr/A6-1-f},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def A7-3
  {:db/ident :dpvo-gdpr/A7-3,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Right to withdraw consent at any time"},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_7/par_3/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A7-3 Right to Withdraw Consent"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A77
  {:db/ident :dpvo-gdpr/A77,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Right to lodge a complaint with a supervisory authority"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/reg/2016/679/art_77/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "A77 Right to Complaint"},
   :rdfs/subClassOf :dpvo/DataSubjectRight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A9-2-a
  {:db/ident :dpvo-gdpr/A9-2-a,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"}
                      {:xsd/string "Bud Bruegger"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "explicit consent with special categories of data"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_a/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 9(2-a) explicit consent"},
   :rdfs/subClassOf :dpvo/ExplicitlyExpressedConsent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A9-2-b
  {:db/ident :dpvo-gdpr/A9-2-b,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"}
                      {:xsd/string "Bud Bruegger"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "employment and social security and social protection law"},
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_b/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label
   {:rdf/language "en",
    :rdf/value "Art 9(2-b) employment, social security, social protection law"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A9-2-c
  {:db/ident :dpvo-gdpr/A9-2-c,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"}
                      {:xsd/string "Bud Bruegger"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "protection of the vital interests"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_c/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 9(2-c) protect vital interest"},
   :rdfs/subClassOf :dpvo/VitalInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A9-2-d
  {:db/ident :dpvo-gdpr/A9-2-d,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"}
                      {:xsd/string "Bud Bruegger"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "legitimate activities with appropriate safeguards by a foundation, association or any other not-for-profit body with a political, philosophical, religious or trade union aim and on condition that the processing relates solely to the members or to former members of the body or to persons who have regular contact with it in connection with its purposes and that the personal data are not disclosed outside that body without the consent of the data subjects;"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 9(2-d) legitimate activities"},
   :rdfs/subClassOf :dpvo/LegitimateInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A9-2-e
  {:db/ident :dpvo-gdpr/A9-2-e,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"}
                      {:xsd/string "Bud Bruegger"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "data manifestly made public by the data subject"},
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_e/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 9(2-e) data made public"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A9-2-f
  {:db/ident :dpvo-gdpr/A9-2-f,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"}
                      {:xsd/string "Bud Bruegger"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "establishment, exercise or defence of legal claims / courts acting in their judicial capacity"},
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_f/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 9(2-f) judicial process"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A9-2-g
  {:db/ident :dpvo-gdpr/A9-2-g,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"}
                      {:xsd/string "Bud Bruegger"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "substantial public interest, on the basis of Union or Member State law"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_g/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 9(2-g) public interest"},
   :rdfs/subClassOf :dpvo/PublicInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A9-2-h
  {:db/ident :dpvo-gdpr/A9-2-h,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"}
                      {:xsd/string "Bud Bruegger"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "preventive or occupational medicine, for the assessment of the working capacity of the employee, medical diagnosis, the provision of health or social care or treatment or the management of health or social care systems and services on the basis of Union or Member State law or pursuant to contract with a health professional and subject to the conditions and safeguards referred to in paragraph 3"},
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_h/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 9(2-h) health & medicine"},
   :rdfs/subClassOf :dpvo/LegalBasis,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A9-2-i
  {:db/ident :dpvo-gdpr/A9-2-i,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"}
                      {:xsd/string "Bud Bruegger"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "public interest in public health"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_i/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Art 9(2-i) public interest in public health"},
   :rdfs/subClassOf :dpvo/PublicInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A9-2-j
  {:db/ident :dpvo-gdpr/A9-2-j,
   :dcterms/created #inst "2019-04-05T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Eva Schlehahn"}
                      {:xsd/string "Bud Bruegger"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "public interest, scientific or historical research purposes or statistical purposes based on Union or Member State law"},
   :dcterms/modified #inst "2021-09-08T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_9/par_2/pnt_j/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "Art 9(2-j) public interest, scientific research, statistical purpose"},
   :rdfs/subClassOf :dpvo/PublicInterest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AdHocContractualClauses
  {:db/ident :dpvo-gdpr/AdHocContractualClauses,
   :dcterms/created #inst "2021-09-22T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Contractual Clauses not drafted by the EU Commission, e.g. by the Controller"},
   :dcterms/source
   {:xsd/anyURI
    "https://edpb.europa.eu/system/files/2021-06/edpb_recommendations_202001vo.2.0_supplementarymeasurestransferstools_en.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "AdHoc Contractual Clauses"},
   :rdfs/subClassOf #{:dpvo-gdpr/DataTransferTool :dpvo/Contract},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BindingCorporateRules
  {:db/ident :dpvo-gdpr/BindingCorporateRules,
   :dcterms/created #inst "2021-09-22T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Georg P Krog"} {:xsd/string "David Hickey"}
                      {:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Binding corporate rules (BCR) are data protection policies adhered to by companies established in the EU for transfers of personal data outside the EU within a group of undertakings or enterprises."},
   :dcterms/source
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_4/par_20/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Binding Corporate Rules (BCR)"},
   :rdfs/subClassOf :dpvo-gdpr/DataTransferTool,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CertificationMechanismsForDataTransfers
  {:db/ident :dpvo-gdpr/CertificationMechanismsForDataTransfers,
   :dcterms/created #inst "2021-09-22T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Certification and its binding or specified mechanisms intended to provide sufficient safeguards for data transfers"},
   :dcterms/source
   {:xsd/anyURI
    "https://edpb.europa.eu/system/files/2021-06/edpb_recommendations_202001vo.2.0_supplementarymeasurestransferstools_en.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Certification Mechanisms for Data Transfers"},
   :rdfs/subClassOf :dpvo-gdpr/DataTransferTool,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CodesOfConductForDataTransfers
  {:db/ident :dpvo-gdpr/CodesOfConductForDataTransfers,
   :dcterms/created #inst "2021-09-22T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Codes of Conduct that outline sufficient safeguards for carrying out data transfers"},
   :dcterms/source
   {:xsd/anyURI
    "https://edpb.europa.eu/system/files/2021-06/edpb_recommendations_202001vo.2.0_supplementarymeasurestransferstools_en.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Codes of Conduct for Data Transfers"},
   :rdfs/subClassOf :dpvo-gdpr/DataTransferTool,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPIAConformant
  {:db/ident :dpvo-gdpr/DPIAConformant,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Georg P Krog"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Expressing the specified process is conformant with a DPIA"},
   :rdf/type #{:dpvo-gdpr/DPIAConformity :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DPIA Conformant"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPIAConformity
  {:db/ident            :dpvo-gdpr/DPIAConformity,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     #{{:xsd/string "Georg P Krog"}
                          {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Conformity of a process with a DPIA"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Conformity"},
   :rdfs/subClassOf     :dpvo/ConformanceStatus,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIAIndicatesHighRisk
  {:db/ident            :dpvo-gdpr/DPIAIndicatesHighRisk,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "DPIA identifying high risk levels"},
   :rdf/type            #{:dpvo-gdpr/DPIARiskStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Indicates High Risk"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIAIndicatesLowRisk
  {:db/ident            :dpvo-gdpr/DPIAIndicatesLowRisk,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "DPIA identifying low risk levels"},
   :rdf/type            #{:dpvo-gdpr/DPIARiskStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Indicates Low Risk"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIAIndicatesNoRisk
  {:db/ident            :dpvo-gdpr/DPIAIndicatesNoRisk,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "DPIA identifying no risk is present"},
   :rdf/type            #{:dpvo-gdpr/DPIARiskStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Indicates No Risk"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIANecessityAssessment
  {:db/ident            :dpvo-gdpr/DPIANecessityAssessment,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Process that determines whether a DPIA is necessary"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Necessity Assessment"},
   :rdfs/subClassOf     :dpvo/DPIA,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIANecessityStatus
  {:db/ident            :dpvo-gdpr/DPIANecessityStatus,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Status reflecting whether a DPIA is necessary"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Necessity Status"},
   :rdfs/subClassOf     :dpvo/AuditStatus,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIANonConformant
  {:db/ident :dpvo-gdpr/DPIANonConformant,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Georg P Krog"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Expressing the specified process is not conformant with a DPIA"},
   :rdf/type #{:dpvo-gdpr/DPIAConformity :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DPIA Non-Conformant"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPIANotRequired
  {:db/ident            :dpvo-gdpr/DPIANotRequired,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Condition where a DPIA is not required"},
   :rdf/type            #{:dpvo-gdpr/DPIANecessityStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Not Required"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIAOutcome
  {:db/ident            :dpvo-gdpr/DPIAOutcome,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Process representing determining outcome of a DPIA"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Outcome"},
   :rdfs/subClassOf     :dpvo/DPIA,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIAOutcomeDPAConsultation
  {:db/ident :dpvo-gdpr/DPIAOutcomeDPAConsultation,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "DPIA outcome status indicating a DPA consultation is required"},
   :rdf/type #{:dpvo-gdpr/DPIAOutcomeStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DPIA Outcome DPA Consultation"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPIAOutcomeHighResidualRisk
  {:db/ident :dpvo-gdpr/DPIAOutcomeHighResidualRisk,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "DPIA outcome status indicating high residual risk which are not acceptable for continuation"},
   :rdf/type #{:dpvo-gdpr/DPIAOutcomeStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DPIA Outcome High Residual Risk"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPIAOutcomeRisksMitigated
  {:db/ident :dpvo-gdpr/DPIAOutcomeRisksMitigated,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "DPIA outcome status indicating (all) risks have been mitigated"},
   :rdf/type #{:dpvo-gdpr/DPIAOutcomeStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DPIA Outcome Risks Mitigated"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPIAOutcomeStatus
  {:db/ident            :dpvo-gdpr/DPIAOutcomeStatus,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Status reflecting the outcomes of a DPIA"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Outcome Status"},
   :rdfs/subClassOf     :dpvo/AuditStatus,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIAProcedure
  {:db/ident            :dpvo-gdpr/DPIAProcedure,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Process representing carrying out a DPIA"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Procedure"},
   :rdfs/subClassOf     :dpvo/DPIA,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIAProcessingRecommendation
  {:db/ident            :dpvo-gdpr/DPIAProcessingRecommendation,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     #{{:xsd/string "Georg P Krog"}
                          {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Recommendation from the DPIA regarding processing"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Processing Recommendation"},
   :rdfs/subClassOf     :dpvo/AuditStatus,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIARecommendsProcessingContinue
  {:db/ident :dpvo-gdpr/DPIARecommendsProcessingContinue,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Georg P Krog"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Recommendation from a DPIA that the processing may continue"},
   :rdf/type #{:dpvo-gdpr/DPIAProcessingRecommendation :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DPIA Recommends Processing Continue"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPIARecommendsProcessingNotContinue
  {:db/ident :dpvo-gdpr/DPIARecommendsProcessingNotContinue,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Georg P Krog"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Recommendation from a DPIA that the processing should not continue"},
   :rdf/type #{:dpvo-gdpr/DPIAProcessingRecommendation :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DPIA Recommends Processing Not Continue"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPIARequired
  {:db/ident            :dpvo-gdpr/DPIARequired,
   :dcterms/created     #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Condition where a DPIA is required"},
   :rdf/type            #{:dpvo-gdpr/DPIANecessityStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "DPIA Required"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DPIARiskStatus
  {:db/ident :dpvo-gdpr/DPIARiskStatus,
   :dcterms/created #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Status reflecting the status of risk associated with a DPIA"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DPIA Risk Status"},
   :rdfs/subClassOf :dpvo/AuditStatus,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataTransferTool
  {:db/ident :dpvo-gdpr/DataTransferTool,
   :dcterms/created #inst "2021-09-22T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "David Hickey"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A legal instrument or tool intended to assist or justify data transfers"},
   :dcterms/source
   #{{:xsd/anyURI "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/pnt_c/oj"}
     {:xsd/anyURI
      "https://edpb.europa.eu/sites/default/files/consultation/edpb_recommendations_202001_supplementarymeasurestransferstools_en.pdf"}},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Transfer Tool"},
   :rdfs/subClassOf :dpvo/TechnicalOrganisationalMeasure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DirectDataCollectionNotice
  {:db/ident :dpvo-gdpr/DirectDataCollectionNotice,
   :dcterms/created #inst "2022-11-09T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A Notice provided in fulfilment of GDPR's Art.13 regarding information to be provided where personal data are collected from the data subject"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Direct Data Collection Notice"},
   :rdfs/subClassOf :dpvo/RightFulfilmentNotice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GDPRComplianceUnknown
  {:db/ident :dpvo-gdpr/GDPRComplianceUnknown,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "State where lawfulness or compliance with GDPR is unknown"},
   :rdf/type #{:dpvo-gdpr/GDPRLawfulness :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GDPR Compliance Unknown"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GDPRCompliant
  {:db/ident            :dpvo-gdpr/GDPRCompliant,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "State of being lawful or legally compliant for GDPR"},
   :rdf/type            #{:dpvo-gdpr/GDPRLawfulness :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "GDPR Compliant"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GDPRLawfulness
  {:db/ident :dpvo-gdpr/GDPRLawfulness,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Status or state associated with being lawful or legally compliant regarding GDPR"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GDPR Lawfulness"},
   :rdfs/subClassOf :dpvo/Lawfulness,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GDPRNonCompliant
  {:db/ident :dpvo-gdpr/GDPRNonCompliant,
   :dcterms/created #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "State of being unlawful or legally non-compliant for GDPR"},
   :rdf/type #{:dpvo-gdpr/GDPRLawfulness :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GDPR Non-compliant"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IndirectDataCollectionNotice
  {:db/ident :dpvo-gdpr/IndirectDataCollectionNotice,
   :dcterms/created #inst "2022-11-09T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A Notice provided in fulfilment of GDPR's Art.14 regarding information to be provided where personal data are not collected from the data subject"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Indirect Data Collection Notice"},
   :rdfs/subClassOf :dpvo/RightFulfilmentNotice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RightsRecipientsNotice
  {:db/ident :dpvo-gdpr/RightsRecipientsNotice,
   :dcterms/created #inst "2022-11-09T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A Notice provided in fulfilment of GDPR's Art.19 regarding Recipients to whom a rights exercise has been communicated, such as regarding rectification (A.16) or erasure of personal data (A.17) or restriction of processing (A.18)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights Recipients Notice"},
   :rdfs/subClassOf :dpvo/RightFulfilmentNotice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SARNotice
  {:db/ident :dpvo-gdpr/SARNotice,
   :dcterms/created #inst "2022-11-09T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Georg Krog"}
                      {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A Notice provided in fulfilment of GDPR's Art.15 regarding information to be provided for Right of Access or Subject Access Request (SAR)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SAR Notice"},
   :rdfs/subClassOf :dpvo/RightFulfilmentNotice,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SCCByCommission
  {:db/ident :dpvo-gdpr/SCCByCommission,
   :dcterms/created #inst "2021-09-22T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Georg P Krog"} {:xsd/string "David Hickey"}
                      {:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Standard contractual clauses adopted by the Commission in accordance with the examination procedure referred to in GDPR Article 93(2)"},
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_c/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SCCs adopted by Commission"},
   :rdfs/subClassOf #{:dpvo-gdpr/StandardContractualClauses
                      :dpvo-gdpr/DataTransferTool},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SCCBySupervisoryAuthority
  {:db/ident :dpvo-gdpr/SCCBySupervisoryAuthority,
   :dcterms/created #inst "2021-09-22T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Georg P Krog"} {:xsd/string "David Hickey"}
                      {:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Standard data protection clauses adopted by a supervisory authority and approved by the Commission pursuant to the examination procedure referred to in GDPR Article 93(2)"},
   :dcterms/source
   {:xsd/anyURI
    "https://eur-lex.europa.eu/eli/reg/2016/679/art_46/par_2/pnt_d/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SCCs adopted by Supervisory Authority"},
   :rdfs/subClassOf #{:dpvo-gdpr/StandardContractualClauses
                      :dpvo-gdpr/DataTransferTool},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def StandardContractualClauses
  {:db/ident :dpvo-gdpr/StandardContractualClauses,
   :dcterms/created #inst "2021-09-22T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Georg P Krog"} {:xsd/string "David Hickey"}
                      {:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Standard Contractual Clauses (SCCs) are pre-approved clauses by the EU for ensuring appropriate data protection safeguards intended for data transfers from the EU to third countries"},
   :dcterms/source {:xsd/anyURI
                    "https://eur-lex.europa.eu/eli/dec_impl/2021/914/oj"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Standard Contractual Clauses (SCC)"},
   :rdfs/subClassOf #{:dpvo-gdpr/DataTransferTool :dpvo/Contract},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SupplementaryMeasure
  {:db/ident :dpvo-gdpr/SupplementaryMeasure,
   :dcterms/created #inst "2021-09-22T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Georg P Krog"} {:xsd/string "David Hickey"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Supplementary measures are intended to additionally provide safeguards or guarentees to bring the resulting protection in line with EU requirements"},
   :dcterms/source
   {:xsd/anyURI
    "https://edpb.europa.eu/system/files/2021-06/edpb_recommendations_202001vo.2.0_supplementarymeasurestransferstools_en.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Supplementary Measure"},
   :rdfs/subClassOf #{:dpvo-gdpr/DataTransferTool
                      :dpvo/TechnicalOrganisationalMeasure},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})