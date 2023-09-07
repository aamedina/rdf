(ns net.wikipunk.rdf.dpvo-rights-eu
  ^{:base       "https://w3id.org/dpv/dpv-owl/rights/eu#",
    :namespaces {"dcterms" "http://purl.org/dc/terms/",
                 "dpvo" "https://w3id.org/dpv/dpv-owl#",
                 "dpvo-rights-eu" "https://w3id.org/dpv/dpv-owl/rights/eu#",
                 "dpvo-tech" "https://w3id.org/dpv/dpv-owl/dpv-tech#",
                 "owl" "http://www.w3.org/2002/07/owl#",
                 "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "vann" "http://purl.org/vocab/vann/",
                 "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "dpvo-rights-eu",
    :source     "net/wikipunk/ext/dpv-owl/rights/eu/rights-eu.ttl"}
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "A vocabulary providing EU Fundamental Rights as concepts that can be used with DPV-OWL"},
   :dcterms/contributor "Harshvardhan J. Pandit",
   :dcterms/created #inst "2022-08-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A vocabulary providing EU Fundamental Rights as concepts that can be used with DPV-OWL"},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-10-06T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "EU Fundamental Rights"},
   :owl/imports {:xsd/anyURI "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "0.8.2",
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dpvo-rights-eu",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/rights/eu#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu"})

(def A1-HumanDignity
  {:db/ident         :dpvo-rights-eu/A1-HumanDignity,
   :dcterms/created  #inst "2022-06-24T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T1-Dignity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A1 Human Dignity"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A10-FreedomOfThoughtConscienceReligion
  {:db/ident         :dpvo-rights-eu/A10-FreedomOfThoughtConscienceReligion,
   :dcterms/created  #inst "2022-07-04T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value "A10 Freedom Of Thought Conscience Religion"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A11-FreedomOfExpressionInformation
  {:db/ident         :dpvo-rights-eu/A11-FreedomOfExpressionInformation,
   :dcterms/created  #inst "2022-07-05T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A11 Freedom Of Expression Information"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A12-FreedomOfAssemblyAssociation
  {:db/ident         :dpvo-rights-eu/A12-FreedomOfAssemblyAssociation,
   :dcterms/created  #inst "2022-07-06T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A12 Freedom Of Assembly Association"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A13-FreedomOfArtsSciences
  {:db/ident         :dpvo-rights-eu/A13-FreedomOfArtsSciences,
   :dcterms/created  #inst "2022-07-07T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A13 Freedom Of Arts Sciences"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A14-RightToEducation
  {:db/ident         :dpvo-rights-eu/A14-RightToEducation,
   :dcterms/created  #inst "2022-07-08T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A14 Right To Education"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A15-FreedomToChooseOccupationEngageWork
  {:db/ident         :dpvo-rights-eu/A15-FreedomToChooseOccupationEngageWork,
   :dcterms/created  #inst "2022-07-09T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value
                      "A15 Freedom To Choose Occupation Engage Work"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A16-FreedomToConductBusiness
  {:db/ident         :dpvo-rights-eu/A16-FreedomToConductBusiness,
   :dcterms/created  #inst "2022-07-10T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A16 Freedom To Conduct Business"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A17-RightToProperty
  {:db/ident         :dpvo-rights-eu/A17-RightToProperty,
   :dcterms/created  #inst "2022-07-11T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A17 Right To Property"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A18-RightToAsylum
  {:db/ident         :dpvo-rights-eu/A18-RightToAsylum,
   :dcterms/created  #inst "2022-07-12T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A18 Right To Asylum"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A19-ProtectionRemovalExpulsionExtradition
  {:db/ident         :dpvo-rights-eu/A19-ProtectionRemovalExpulsionExtradition,
   :dcterms/created  #inst "2022-07-13T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value
                      "A19 Protection Removal Expulsion Extradition"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A2-RightToLife
  {:db/ident         :dpvo-rights-eu/A2-RightToLife,
   :dcterms/created  #inst "2022-06-25T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T1-Dignity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A2 Right To Life"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A20-EqualityBeforeLaw
  {:db/ident         :dpvo-rights-eu/A20-EqualityBeforeLaw,
   :dcterms/created  #inst "2022-07-15T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T3-Equality :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A20 Equality Before Law"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A21-NonDiscrimination
  {:db/ident         :dpvo-rights-eu/A21-NonDiscrimination,
   :dcterms/created  #inst "2022-07-16T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T3-Equality :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A21 Non Discrimination"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A22-CulturalReligiousLinguisticDiversity
  {:db/ident         :dpvo-rights-eu/A22-CulturalReligiousLinguisticDiversity,
   :dcterms/created  #inst "2022-07-17T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T3-Equality :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value "A22 Cultural Religious Linguistic Diversity"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A23-EqualityBetweenWomenMen
  {:db/ident         :dpvo-rights-eu/A23-EqualityBetweenWomenMen,
   :dcterms/created  #inst "2022-07-18T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T3-Equality :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A23 Equality Between Women Men"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A24-RightsOfChild
  {:db/ident         :dpvo-rights-eu/A24-RightsOfChild,
   :dcterms/created  #inst "2022-07-19T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T3-Equality :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A24 Rights Of Child"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A25-RightsOfElderly
  {:db/ident         :dpvo-rights-eu/A25-RightsOfElderly,
   :dcterms/created  #inst "2022-07-20T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T3-Equality :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A25 Rights Of Elderly"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A26-IntegrationOfPersonsWithDisabilities
  {:db/ident         :dpvo-rights-eu/A26-IntegrationOfPersonsWithDisabilities,
   :dcterms/created  #inst "2022-07-21T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T3-Equality :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value
                      "A26 Integration Of Persons With Disabilities"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A27-WorkersRightToInformationConsultation
  {:db/ident         :dpvo-rights-eu/A27-WorkersRightToInformationConsultation,
   :dcterms/created  #inst "2022-07-23T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value
                      "A27 Workers Right To Information Consultation"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A28-RightOfCollectiveBargainingAction
  {:db/ident         :dpvo-rights-eu/A28-RightOfCollectiveBargainingAction,
   :dcterms/created  #inst "2022-07-24T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value "A28 Right Of Collective Bargaining Action"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A29-RightOfAccessToPlacementServices
  {:db/ident         :dpvo-rights-eu/A29-RightOfAccessToPlacementServices,
   :dcterms/created  #inst "2022-07-25T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value "A29 Right Of Access To Placement Services"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A3-RightToIntegrityOfPerson
  {:db/ident         :dpvo-rights-eu/A3-RightToIntegrityOfPerson,
   :dcterms/created  #inst "2022-06-26T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T1-Dignity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A3 Right To Integrity Of Person"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A30-ProtectionUnjustifiedDismissal
  {:db/ident         :dpvo-rights-eu/A30-ProtectionUnjustifiedDismissal,
   :dcterms/created  #inst "2022-07-26T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A30 Protection Unjustified Dismissal"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A31-FairJustWorkingConditions
  {:db/ident         :dpvo-rights-eu/A31-FairJustWorkingConditions,
   :dcterms/created  #inst "2022-07-27T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A31 Fair Just Working Conditions"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A32-ProhibitionOfChildLabourProtectionofYoungAtWork
  {:db/ident
   :dpvo-rights-eu/A32-ProhibitionOfChildLabourProtectionofYoungAtWork,
   :dcterms/created #inst "2022-07-28T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source {:xsd/anyURI
                    "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
               :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "A32 Prohibition Of Child Labour Protectionof Young At Work"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A33-FamilyProfessionalLife
  {:db/ident         :dpvo-rights-eu/A33-FamilyProfessionalLife,
   :dcterms/created  #inst "2022-07-29T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A33 Family Professional Life"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A34-SocialSecuritySocialAssistance
  {:db/ident         :dpvo-rights-eu/A34-SocialSecuritySocialAssistance,
   :dcterms/created  #inst "2022-07-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A34 Social Security Social Assistance"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A35-Healthcare
  {:db/ident         :dpvo-rights-eu/A35-Healthcare,
   :dcterms/created  #inst "2022-07-31T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A35 Healthcare"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A36-AccessToServicesOfGeneralEconomicInterest
  {:db/ident :dpvo-rights-eu/A36-AccessToServicesOfGeneralEconomicInterest,
   :dcterms/created #inst "2022-08-01T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source {:xsd/anyURI
                    "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
               :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "A36 Access To Services Of General Economic Interest"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A37-EnvironmentalProtection
  {:db/ident         :dpvo-rights-eu/A37-EnvironmentalProtection,
   :dcterms/created  #inst "2022-08-02T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A37 Environmental Protection"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A38-ConsumerProtection
  {:db/ident         :dpvo-rights-eu/A38-ConsumerProtection,
   :dcterms/created  #inst "2022-08-03T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T4-Solidarity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A38 Consumer Protection"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A39-RightToVoteStandAsCanditateEUParliament
  {:db/ident :dpvo-rights-eu/A39-RightToVoteStandAsCanditateEUParliament,
   :dcterms/created #inst "2022-08-05T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source {:xsd/anyURI
                    "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type #{:dpvo-rights-eu/T5-CitizensRights :owl/NamedIndividual
               :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "A39 Right To Vote Stand As Canditate E U Parliament"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A4-ProhibitionOfTortureDegradationPunishment
  {:db/ident :dpvo-rights-eu/A4-ProhibitionOfTortureDegradationPunishment,
   :dcterms/created #inst "2022-06-27T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source {:xsd/anyURI
                    "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type #{:dpvo-rights-eu/T1-Dignity :owl/NamedIndividual
               :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "A4 Prohibition Of Torture Degradation Punishment"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A40-RightToVoteStandAsCandidateMunicipalElections
  {:db/ident :dpvo-rights-eu/A40-RightToVoteStandAsCandidateMunicipalElections,
   :dcterms/created #inst "2022-08-06T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source {:xsd/anyURI
                    "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type #{:dpvo-rights-eu/T5-CitizensRights :owl/NamedIndividual
               :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "A40 Right To Vote Stand As Candidate Municipal Elections"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A41-RightToGoodAdministration
  {:db/ident         :dpvo-rights-eu/A41-RightToGoodAdministration,
   :dcterms/created  #inst "2022-08-07T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T5-CitizensRights :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A41 Right To Good Administration"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A42-RightToAccessToDocuments
  {:db/ident         :dpvo-rights-eu/A42-RightToAccessToDocuments,
   :dcterms/created  #inst "2022-08-08T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T5-CitizensRights :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A42 Right To Access To Documents"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A43-EuropeanOmbudsman
  {:db/ident         :dpvo-rights-eu/A43-EuropeanOmbudsman,
   :dcterms/created  #inst "2022-08-09T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T5-CitizensRights :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A43 European Ombudsman"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A44-RightToPetition
  {:db/ident         :dpvo-rights-eu/A44-RightToPetition,
   :dcterms/created  #inst "2022-08-10T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T5-CitizensRights :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A44 Right To Petition"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A45-FreedomOfMovementAndResidence
  {:db/ident         :dpvo-rights-eu/A45-FreedomOfMovementAndResidence,
   :dcterms/created  #inst "2022-08-11T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T5-CitizensRights :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A45 Freedom Of Movement And Residence"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A46-DiplomaticConsularProtection
  {:db/ident         :dpvo-rights-eu/A46-DiplomaticConsularProtection,
   :dcterms/created  #inst "2022-08-12T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T5-CitizensRights :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A46 Diplomatic Consular Protection"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A47-RightToEffectiveRemedyFairTrial
  {:db/ident         :dpvo-rights-eu/A47-RightToEffectiveRemedyFairTrial,
   :dcterms/created  #inst "2022-08-14T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T6-Justice :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A47 Right To Effective Remedy Fair Trial"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A48-PresumptionOfInnocenceRightOfDefence
  {:db/ident         :dpvo-rights-eu/A48-PresumptionOfInnocenceRightOfDefence,
   :dcterms/created  #inst "2022-08-15T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T6-Justice :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value
                      "A48 Presumption Of Innocence Right Of Defence"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A49-PrinciplesOfLegalityProportionalityCriminalOffencesPenalties
  {:db/ident
   :dpvo-rights-eu/A49-PrinciplesOfLegalityProportionalityCriminalOffencesPenalties,
   :dcterms/created #inst "2022-08-16T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source {:xsd/anyURI
                    "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type #{:dpvo-rights-eu/T6-Justice :owl/NamedIndividual
               :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "A49 Principles Of Legality Proportionality Criminal Offences Penalties"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A5-ProhibitionOfSlaveryForcedLabour
  {:db/ident         :dpvo-rights-eu/A5-ProhibitionOfSlaveryForcedLabour,
   :dcterms/created  #inst "2022-06-28T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T1-Dignity :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A5 Prohibition Of Slavery Forced Labour"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A50-RightNotBeTriedPunishedTwiceForSameCriminalOffence
  {:db/ident
   :dpvo-rights-eu/A50-RightNotBeTriedPunishedTwiceForSameCriminalOffence,
   :dcterms/created #inst "2022-08-17T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source {:xsd/anyURI
                    "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type #{:dpvo-rights-eu/T6-Justice :owl/NamedIndividual
               :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "A50 Right Not Be Tried Punished Twice For Same Criminal Offence"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def A51-FieldOfApplication
  {:db/ident         :dpvo-rights-eu/A51-FieldOfApplication,
   :dcterms/created  #inst "2022-08-19T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T7-InterpretationAndApplication
                       :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A51 Field Of Application"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A52-ScopeInterpretationOfRightsPrinciples
  {:db/ident         :dpvo-rights-eu/A52-ScopeInterpretationOfRightsPrinciples,
   :dcterms/created  #inst "2022-08-20T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T7-InterpretationAndApplication
                       :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value
                      "A52 Scope Interpretation Of Rights Principles"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A53-LevelOfProtection
  {:db/ident         :dpvo-rights-eu/A53-LevelOfProtection,
   :dcterms/created  #inst "2022-08-21T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T7-InterpretationAndApplication
                       :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A53 Level Of Protection"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A54-ProhibitionOfAbuseOfRights
  {:db/ident         :dpvo-rights-eu/A54-ProhibitionOfAbuseOfRights,
   :dcterms/created  #inst "2022-08-22T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T7-InterpretationAndApplication
                       :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A54 Prohibition Of Abuse Of Rights"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A6-RightToLiberySecurity
  {:db/ident         :dpvo-rights-eu/A6-RightToLiberySecurity,
   :dcterms/created  #inst "2022-06-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A6 Right To Libery Security"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A7-RespectPrivateFamilyLife
  {:db/ident         :dpvo-rights-eu/A7-RespectPrivateFamilyLife,
   :dcterms/created  #inst "2022-07-01T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A7 Respect Private Family Life"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A8-ProtectionOfPersonalData
  {:db/ident         :dpvo-rights-eu/A8-ProtectionOfPersonalData,
   :dcterms/created  #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A8 Protection Of Personal Data"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def A9-RightToMarryFoundFamily
  {:db/ident         :dpvo-rights-eu/A9-RightToMarryFoundFamily,
   :dcterms/created  #inst "2022-07-03T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         #{:dpvo-rights-eu/T2-Freedoms :owl/NamedIndividual
                       :dpvo-rights-eu/EUFundamentalRights},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "A9 Right To Marry Found Family"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def EUFundamentalRights
  {:db/ident         :dpvo-rights-eu/EUFundamentalRights,
   :dcterms/created  #inst "2022-06-22T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "EU Fundamental Rights"},
   :rdfs/subClassOf  :dpvo/DataSubjectRight,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def T1-Dignity
  {:db/ident         :dpvo-rights-eu/T1-Dignity,
   :dcterms/created  #inst "2022-06-23T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "T1 Dignity"},
   :rdfs/subClassOf  :dpvo-rights-eu/EUFundamentalRights,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def T2-Freedoms
  {:db/ident         :dpvo-rights-eu/T2-Freedoms,
   :dcterms/created  #inst "2022-06-29T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "T2 Freedoms"},
   :rdfs/subClassOf  :dpvo-rights-eu/EUFundamentalRights,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def T3-Equality
  {:db/ident         :dpvo-rights-eu/T3-Equality,
   :dcterms/created  #inst "2022-07-14T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "T3 Equality"},
   :rdfs/subClassOf  :dpvo-rights-eu/EUFundamentalRights,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def T4-Solidarity
  {:db/ident         :dpvo-rights-eu/T4-Solidarity,
   :dcterms/created  #inst "2022-07-22T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "T4 Solidarity"},
   :rdfs/subClassOf  :dpvo-rights-eu/EUFundamentalRights,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def T5-CitizensRights
  {:db/ident         :dpvo-rights-eu/T5-CitizensRights,
   :dcterms/created  #inst "2022-08-04T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "T5 Citizens Rights"},
   :rdfs/subClassOf  :dpvo-rights-eu/EUFundamentalRights,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def T6-Justice
  {:db/ident         :dpvo-rights-eu/T6-Justice,
   :dcterms/created  #inst "2022-08-13T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "T6 Justice"},
   :rdfs/subClassOf  :dpvo-rights-eu/EUFundamentalRights,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def T7-InterpretationAndApplication
  {:db/ident         :dpvo-rights-eu/T7-InterpretationAndApplication,
   :dcterms/created  #inst "2022-08-18T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/source   {:xsd/anyURI
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "T7 Interpretation And Application"},
   :rdfs/subClassOf  :dpvo-rights-eu/EUFundamentalRights,
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def hasDeveloper
  {:db/ident            :dpvo-rights-eu/hasDeveloper,
   :dcterms/created     #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates technology developer"},
   :dcterms/modified    #inst "2022-10-21T00:00:00.000-00:00",
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has developer"},
   :rdfs/range          :dpvo-tech/TechnologyDeveloper,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def hasProvider
  {:db/ident            :dpvo-rights-eu/hasProvider,
   :dcterms/created     #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates technology provider"},
   :dcterms/modified    #inst "2022-10-21T00:00:00.000-00:00",
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has provider"},
   :rdfs/range          :dpvo-tech/TechnologyProvider,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def hasSubject
  {:db/ident            :dpvo-rights-eu/hasSubject,
   :dcterms/created     #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates technology subject"},
   :dcterms/modified    #inst "2022-10-21T00:00:00.000-00:00",
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has subject"},
   :rdfs/range          :dpvo-tech/TechnologySubject,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def hasUser
  {:db/ident            :dpvo-rights-eu/hasUser,
   :dcterms/created     #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates technology user"},
   :dcterms/modified    #inst "2022-10-21T00:00:00.000-00:00",
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has user"},
   :rdfs/range          :dpvo-tech/TechnologyUser,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def urn:uuid:bd7c11e0-21eb-5751-b04b-5a54fa68719c
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "A vocabulary providing EU Fundamental Rights as concepts that can be used with DPV-OWL"},
   :dcterms/contributor "Harshvardhan J. Pandit",
   :dcterms/created #inst "2022-08-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A vocabulary providing EU Fundamental Rights as concepts that can be used with DPV-OWL"},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-10-06T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "EU Fundamental Rights"},
   :owl/imports {:xsd/anyURI "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "0.8.2",
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dpvo-rights-eu",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/rights/eu#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl/rights/eu"})