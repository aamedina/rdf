(ns net.wikipunk.rdf.dpvo-rights-eu
  "A vocabulary providing EU Fundamental Rights as concepts that can be used with DPV-OWL"
  {:dcat/downloadURL "resources/dpv-owl/rights/eu/rights-eu.ttl",
   :dcterms/abstract
   #xsd/langString
    "A vocabulary providing EU Fundamental Rights as concepts that can be used with DPV-OWL@en",
   :dcterms/contributor "Harshvardhan J. Pandit",
   :dcterms/created #xsd/date #inst "2022-08-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "A vocabulary providing EU Fundamental Rights as concepts that can be used with DPV-OWL@en",
   :dcterms/license {:rdfa/uri
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #xsd/date #inst "2022-10-06T00:00:00.000-04:00",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :dcterms/title #xsd/langString "EU Fundamental Rights@en",
   :owl/imports {:rdfa/uri "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "0.8.2",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "dpv-tech" "https://w3id.org/dpv/dpv-tech#",
                       "dpvo" "https://w3id.org/dpv/dpv-owl#",
                       "dpvo-rights-eu"
                       "https://w3id.org/dpv/dpv-owl/rights/eu#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-rights-eu",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu",
   :vann/preferredNamespacePrefix "dpvo-rights-eu",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/rights/eu#"})

(def A1-HumanDignity
  "A1 Human Dignity"
  {:db/ident         :dpvo-rights-eu/A1-HumanDignity,
   :dcterms/created  #xsd/date #inst "2022-06-24T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T1-Dignity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A1 Human Dignity@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A10-FreedomOfThoughtConscienceReligion
  "A10 Freedom Of Thought Conscience Religion"
  {:db/ident         :dpvo-rights-eu/A10-FreedomOfThoughtConscienceReligion,
   :dcterms/created  #xsd/date #inst "2022-07-04T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A10 Freedom Of Thought Conscience Religion@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A11-FreedomOfExpressionInformation
  "A11 Freedom Of Expression Information"
  {:db/ident         :dpvo-rights-eu/A11-FreedomOfExpressionInformation,
   :dcterms/created  #xsd/date #inst "2022-07-05T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A11 Freedom Of Expression Information@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A12-FreedomOfAssemblyAssociation
  "A12 Freedom Of Assembly Association"
  {:db/ident         :dpvo-rights-eu/A12-FreedomOfAssemblyAssociation,
   :dcterms/created  #xsd/date #inst "2022-07-06T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A12 Freedom Of Assembly Association@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A13-FreedomOfArtsSciences
  "A13 Freedom Of Arts Sciences"
  {:db/ident         :dpvo-rights-eu/A13-FreedomOfArtsSciences,
   :dcterms/created  #xsd/date #inst "2022-07-07T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A13 Freedom Of Arts Sciences@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A14-RightToEducation
  "A14 Right To Education"
  {:db/ident         :dpvo-rights-eu/A14-RightToEducation,
   :dcterms/created  #xsd/date #inst "2022-07-08T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A14 Right To Education@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A15-FreedomToChooseOccuprationEngageWork
  "A15 Freedom To Choose Occupration Engage Work"
  {:db/ident         :dpvo-rights-eu/A15-FreedomToChooseOccuprationEngageWork,
   :dcterms/created  #xsd/date #inst "2022-07-09T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A15 Freedom To Choose Occupration Engage Work@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A16-FreedomToConductBusiness
  "A16 Freedom To Conduct Business"
  {:db/ident         :dpvo-rights-eu/A16-FreedomToConductBusiness,
   :dcterms/created  #xsd/date #inst "2022-07-10T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A16 Freedom To Conduct Business@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A17-RightToProperty
  "A17 Right To Property"
  {:db/ident         :dpvo-rights-eu/A17-RightToProperty,
   :dcterms/created  #xsd/date #inst "2022-07-11T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A17 Right To Property@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A18-RightToAsylum
  "A18 Right To Asylum"
  {:db/ident         :dpvo-rights-eu/A18-RightToAsylum,
   :dcterms/created  #xsd/date #inst "2022-07-12T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A18 Right To Asylum@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A19-ProtectionRemovalExpulsionExtradition
  "A19 Protection Removal Expulsion Extradition"
  {:db/ident         :dpvo-rights-eu/A19-ProtectionRemovalExpulsionExtradition,
   :dcterms/created  #xsd/date #inst "2022-07-13T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A19 Protection Removal Expulsion Extradition@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A2-RightToLife
  "A2 Right To Life"
  {:db/ident         :dpvo-rights-eu/A2-RightToLife,
   :dcterms/created  #xsd/date #inst "2022-06-25T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T1-Dignity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A2 Right To Life@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A20-EqualityBeforeLaw
  "A20 Equality Before Law"
  {:db/ident         :dpvo-rights-eu/A20-EqualityBeforeLaw,
   :dcterms/created  #xsd/date #inst "2022-07-15T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T3-Equality
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A20 Equality Before Law@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A21-NonDiscrimination
  "A21 Non Discrimination"
  {:db/ident         :dpvo-rights-eu/A21-NonDiscrimination,
   :dcterms/created  #xsd/date #inst "2022-07-16T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T3-Equality
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A21 Non Discrimination@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A22-CulturalReligiousLinguisticDiversity
  "A22 Cultural Religious Linguistic Diversity"
  {:db/ident         :dpvo-rights-eu/A22-CulturalReligiousLinguisticDiversity,
   :dcterms/created  #xsd/date #inst "2022-07-17T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T3-Equality
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A22 Cultural Religious Linguistic Diversity@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A23-EqualityBetweenWomenMen
  "A23 Equality Between Women Men"
  {:db/ident         :dpvo-rights-eu/A23-EqualityBetweenWomenMen,
   :dcterms/created  #xsd/date #inst "2022-07-18T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T3-Equality
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A23 Equality Between Women Men@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A24-RightsOfChild
  "A24 Rights Of Child"
  {:db/ident         :dpvo-rights-eu/A24-RightsOfChild,
   :dcterms/created  #xsd/date #inst "2022-07-19T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T3-Equality
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A24 Rights Of Child@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A25-RightsOfElderly
  "A25 Rights Of Elderly"
  {:db/ident         :dpvo-rights-eu/A25-RightsOfElderly,
   :dcterms/created  #xsd/date #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T3-Equality
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A25 Rights Of Elderly@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A26-IntegrationOfPersonsWithDisabilities
  "A26 Integration Of Persons With Disabilities"
  {:db/ident         :dpvo-rights-eu/A26-IntegrationOfPersonsWithDisabilities,
   :dcterms/created  #xsd/date #inst "2022-07-21T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T3-Equality
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A26 Integration Of Persons With Disabilities@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A27-WorkersRightToInformationConsultation
  "A27 Workers Right To Information Consultation"
  {:db/ident         :dpvo-rights-eu/A27-WorkersRightToInformationConsultation,
   :dcterms/created  #xsd/date #inst "2022-07-23T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T4-Solidarity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A27 Workers Right To Information Consultation@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A28-RightOfCollectiveBargainingAction
  "A28 Right Of Collective Bargaining Action"
  {:db/ident         :dpvo-rights-eu/A28-RightOfCollectiveBargainingAction,
   :dcterms/created  #xsd/date #inst "2022-07-24T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T4-Solidarity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A28 Right Of Collective Bargaining Action@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A29-RightOfAccessToPlacementServices
  "A29 Right Of Access To Placement Services"
  {:db/ident         :dpvo-rights-eu/A29-RightOfAccessToPlacementServices,
   :dcterms/created  #xsd/date #inst "2022-07-25T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T4-Solidarity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A29 Right Of Access To Placement Services@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A3-RightToIntegrityOfPerson
  "A3 Right To Integrity Of Person"
  {:db/ident         :dpvo-rights-eu/A3-RightToIntegrityOfPerson,
   :dcterms/created  #xsd/date #inst "2022-06-26T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T1-Dignity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A3 Right To Integrity Of Person@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A30-ProtectionUnjustifiedDismissal
  "A30 Protection Unjustified Dismissal"
  {:db/ident         :dpvo-rights-eu/A30-ProtectionUnjustifiedDismissal,
   :dcterms/created  #xsd/date #inst "2022-07-26T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T4-Solidarity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A30 Protection Unjustified Dismissal@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A31-FairJustWorkingConditions
  "A31 Fair Just Working Conditions"
  {:db/ident         :dpvo-rights-eu/A31-FairJustWorkingConditions,
   :dcterms/created  #xsd/date #inst "2022-07-27T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T4-Solidarity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A31 Fair Just Working Conditions@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A32-ProhibitionOfChildLabourProtectionofYoungAtWork
  "A32 Prohibition Of Child Labour Protectionof Young At Work"
  {:db/ident
   :dpvo-rights-eu/A32-ProhibitionOfChildLabourProtectionofYoungAtWork,
   :dcterms/created #xsd/date #inst "2022-07-28T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source {:rdfa/uri "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type [:dpvo-rights-eu/T4-Solidarity
              :dpvo-rights-eu/EUFundamentalRights
              :owl/NamedIndividual
              :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label #xsd/langString
                "A32 Prohibition Of Child Labour Protectionof Young At Work@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def A33-FamilyProfessionalLife
  "A33 Family Professional Life"
  {:db/ident         :dpvo-rights-eu/A33-FamilyProfessionalLife,
   :dcterms/created  #xsd/date #inst "2022-07-29T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T4-Solidarity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A33 Family Professional Life@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A34-SocialSecuritySocialAssistance
  "A34 Social Security Social Assistance"
  {:db/ident         :dpvo-rights-eu/A34-SocialSecuritySocialAssistance,
   :dcterms/created  #xsd/date #inst "2022-07-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T4-Solidarity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A34 Social Security Social Assistance@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A35-Healthcare
  "A35 Healthcare"
  {:db/ident         :dpvo-rights-eu/A35-Healthcare,
   :dcterms/created  #xsd/date #inst "2022-07-31T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T4-Solidarity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A35 Healthcare@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A36-AccessToServicesOfGeneralEconomicInterest
  "A36 Access To Services Of General Economic Interest"
  {:db/ident :dpvo-rights-eu/A36-AccessToServicesOfGeneralEconomicInterest,
   :dcterms/created #xsd/date #inst "2022-08-01T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source {:rdfa/uri "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type [:dpvo-rights-eu/T4-Solidarity
              :dpvo-rights-eu/EUFundamentalRights
              :owl/NamedIndividual
              :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label #xsd/langString
                "A36 Access To Services Of General Economic Interest@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def A37-EnvironmentalProtection
  "A37 Environmental Protection"
  {:db/ident         :dpvo-rights-eu/A37-EnvironmentalProtection,
   :dcterms/created  #xsd/date #inst "2022-08-02T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T4-Solidarity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A37 Environmental Protection@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A38-ConsumerProtection
  "A38 Consumer Protection"
  {:db/ident         :dpvo-rights-eu/A38-ConsumerProtection,
   :dcterms/created  #xsd/date #inst "2022-08-03T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T4-Solidarity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A38 Consumer Protection@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A39-RightToVoteStandAsCanditateEUParliament
  "A39 Right To Vote Stand As Canditate E U Parliament"
  {:db/ident :dpvo-rights-eu/A39-RightToVoteStandAsCanditateEUParliament,
   :dcterms/created #xsd/date #inst "2022-08-05T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source {:rdfa/uri "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type [:dpvo-rights-eu/T5-CitizensRights
              :dpvo-rights-eu/EUFundamentalRights
              :owl/NamedIndividual
              :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label #xsd/langString
                "A39 Right To Vote Stand As Canditate E U Parliament@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def A4-ProhibitionOfTortureDegradationPunishment
  "A4 Prohibition Of Torture Degradation Punishment"
  {:db/ident :dpvo-rights-eu/A4-ProhibitionOfTortureDegradationPunishment,
   :dcterms/created #xsd/date #inst "2022-06-27T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source {:rdfa/uri "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type [:dpvo-rights-eu/T1-Dignity
              :dpvo-rights-eu/EUFundamentalRights
              :owl/NamedIndividual
              :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label #xsd/langString
                "A4 Prohibition Of Torture Degradation Punishment@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def A40-RightToVoteStandAsCandidateMunicipalElections
  "A40 Right To Vote Stand As Candidate Municipal Elections"
  {:db/ident :dpvo-rights-eu/A40-RightToVoteStandAsCandidateMunicipalElections,
   :dcterms/created #xsd/date #inst "2022-08-06T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source {:rdfa/uri "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type [:dpvo-rights-eu/T5-CitizensRights
              :dpvo-rights-eu/EUFundamentalRights
              :owl/NamedIndividual
              :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label #xsd/langString
                "A40 Right To Vote Stand As Candidate Municipal Elections@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def A41-RightToGoodAdministration
  "A41 Right To Good Administration"
  {:db/ident         :dpvo-rights-eu/A41-RightToGoodAdministration,
   :dcterms/created  #xsd/date #inst "2022-08-07T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T5-CitizensRights
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A41 Right To Good Administration@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A42-RightToAccessToDocuments
  "A42 Right To Access To Documents"
  {:db/ident         :dpvo-rights-eu/A42-RightToAccessToDocuments,
   :dcterms/created  #xsd/date #inst "2022-08-08T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T5-CitizensRights
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A42 Right To Access To Documents@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A43-EuropeanOmbudsman
  "A43 European Ombudsman"
  {:db/ident         :dpvo-rights-eu/A43-EuropeanOmbudsman,
   :dcterms/created  #xsd/date #inst "2022-08-09T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T5-CitizensRights
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A43 European Ombudsman@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A44-RightToPetition
  "A44 Right To Petition"
  {:db/ident         :dpvo-rights-eu/A44-RightToPetition,
   :dcterms/created  #xsd/date #inst "2022-08-10T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T5-CitizensRights
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A44 Right To Petition@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A45-FreedomOfMovementAndResidence
  "A45 Freedom Of Movement And Residence"
  {:db/ident         :dpvo-rights-eu/A45-FreedomOfMovementAndResidence,
   :dcterms/created  #xsd/date #inst "2022-08-11T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T5-CitizensRights
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A45 Freedom Of Movement And Residence@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A46-DiplomaticConsularProtection
  "A46 Diplomatic Consular Protection"
  {:db/ident         :dpvo-rights-eu/A46-DiplomaticConsularProtection,
   :dcterms/created  #xsd/date #inst "2022-08-12T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T5-CitizensRights
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A46 Diplomatic Consular Protection@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A47-RightToEffectiveRemedyFairTrial
  "A47 Right To Effective Remedy Fair Trial"
  {:db/ident         :dpvo-rights-eu/A47-RightToEffectiveRemedyFairTrial,
   :dcterms/created  #xsd/date #inst "2022-08-14T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T6-Justice
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A47 Right To Effective Remedy Fair Trial@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A48-PresumptionOfInnocenceRightOfDefence
  "A48 Presumption Of Innocence Right Of Defence"
  {:db/ident         :dpvo-rights-eu/A48-PresumptionOfInnocenceRightOfDefence,
   :dcterms/created  #xsd/date #inst "2022-08-15T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T6-Justice
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A48 Presumption Of Innocence Right Of Defence@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A49-PrinciplesOfLegalityProportionalityCriminalOffencesPenalties
  "A49 Principles Of Legality Proportionality Criminal Offences Penalties"
  {:db/ident
   :dpvo-rights-eu/A49-PrinciplesOfLegalityProportionalityCriminalOffencesPenalties,
   :dcterms/created #xsd/date #inst "2022-08-16T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source {:rdfa/uri "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type [:dpvo-rights-eu/T6-Justice
              :dpvo-rights-eu/EUFundamentalRights
              :owl/NamedIndividual
              :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label
   #xsd/langString
    "A49 Principles Of Legality Proportionality Criminal Offences Penalties@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def A5-ProhibitionOfSlaveryForcedLabour
  "A5 Prohibition Of Slavery Forced Labour"
  {:db/ident         :dpvo-rights-eu/A5-ProhibitionOfSlaveryForcedLabour,
   :dcterms/created  #xsd/date #inst "2022-06-28T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T1-Dignity
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A5 Prohibition Of Slavery Forced Labour@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A50-RightNotBeTriedPunishedTwiceForSameCriminalOffence
  "A50 Right Not Be Tried Punished Twice For Same Criminal Offence"
  {:db/ident
   :dpvo-rights-eu/A50-RightNotBeTriedPunishedTwiceForSameCriminalOffence,
   :dcterms/created #xsd/date #inst "2022-08-17T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source {:rdfa/uri "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type [:dpvo-rights-eu/T6-Justice
              :dpvo-rights-eu/EUFundamentalRights
              :owl/NamedIndividual
              :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label
   #xsd/langString
    "A50 Right Not Be Tried Punished Twice For Same Criminal Offence@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def A51-FieldOfApplication
  "A51 Field Of Application"
  {:db/ident         :dpvo-rights-eu/A51-FieldOfApplication,
   :dcterms/created  #xsd/date #inst "2022-08-19T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T7-InterpretationAndApplication
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A51 Field Of Application@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A52-ScopeInterpretationOfRightsPrinciples
  "A52 Scope Interpretation Of Rights Principles"
  {:db/ident         :dpvo-rights-eu/A52-ScopeInterpretationOfRightsPrinciples,
   :dcterms/created  #xsd/date #inst "2022-08-20T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T7-InterpretationAndApplication
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString
                      "A52 Scope Interpretation Of Rights Principles@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A53-LevelOfProtection
  "A53 Level Of Protection"
  {:db/ident         :dpvo-rights-eu/A53-LevelOfProtection,
   :dcterms/created  #xsd/date #inst "2022-08-21T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T7-InterpretationAndApplication
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A53 Level Of Protection@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A54-ProhibitionOfAbuseOfRights
  "A54 Prohibition Of Abuse Of Rights"
  {:db/ident         :dpvo-rights-eu/A54-ProhibitionOfAbuseOfRights,
   :dcterms/created  #xsd/date #inst "2022-08-22T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T7-InterpretationAndApplication
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A54 Prohibition Of Abuse Of Rights@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A6-RightToLiberySecurity
  "A6 Right To Libery Security"
  {:db/ident         :dpvo-rights-eu/A6-RightToLiberySecurity,
   :dcterms/created  #xsd/date #inst "2022-06-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A6 Right To Libery Security@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A7-RespectPrivateFamilyLife
  "A7 Respect Private Family Life"
  {:db/ident         :dpvo-rights-eu/A7-RespectPrivateFamilyLife,
   :dcterms/created  #xsd/date #inst "2022-07-01T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A7 Respect Private Family Life@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A8-ProtectionOfPersonalData
  "A8 Protection Of Personal Data"
  {:db/ident         :dpvo-rights-eu/A8-ProtectionOfPersonalData,
   :dcterms/created  #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A8 Protection Of Personal Data@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def A9-RightToMarryFoundFamily
  "A9 Right To Marry Found Family"
  {:db/ident         :dpvo-rights-eu/A9-RightToMarryFoundFamily,
   :dcterms/created  #xsd/date #inst "2022-07-03T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         [:dpvo-rights-eu/T2-Freedoms
                      :dpvo-rights-eu/EUFundamentalRights
                      :owl/NamedIndividual
                      :dpvo/DataSubjectRight],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "A9 Right To Marry Found Family@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def EUFundamentalRights
  "EU Fundamental Rights"
  {:db/ident         :dpvo-rights-eu/EUFundamentalRights,
   :dcterms/created  #xsd/date #inst "2022-06-22T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "EU Fundamental Rights@en",
   :rdfs/subClassOf  :dpvo/DataSubjectRight,
   :vs/term_status   #xsd/langString "accepted@en"})

(def T1-Dignity
  "T1 Dignity"
  {:db/ident         :dpvo-rights-eu/T1-Dignity,
   :dcterms/created  #xsd/date #inst "2022-06-23T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "T1 Dignity@en",
   :rdfs/subClassOf  [:dpvo-rights-eu/EUFundamentalRights
                      :dpvo/DataSubjectRight],
   :vs/term_status   #xsd/langString "accepted@en"})

(def T2-Freedoms
  "T2 Freedoms"
  {:db/ident         :dpvo-rights-eu/T2-Freedoms,
   :dcterms/created  #xsd/date #inst "2022-06-29T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "T2 Freedoms@en",
   :rdfs/subClassOf  [:dpvo-rights-eu/EUFundamentalRights
                      :dpvo/DataSubjectRight],
   :vs/term_status   #xsd/langString "accepted@en"})

(def T3-Equality
  "T3 Equality"
  {:db/ident         :dpvo-rights-eu/T3-Equality,
   :dcterms/created  #xsd/date #inst "2022-07-14T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "T3 Equality@en",
   :rdfs/subClassOf  [:dpvo-rights-eu/EUFundamentalRights
                      :dpvo/DataSubjectRight],
   :vs/term_status   #xsd/langString "accepted@en"})

(def T4-Solidarity
  "T4 Solidarity"
  {:db/ident         :dpvo-rights-eu/T4-Solidarity,
   :dcterms/created  #xsd/date #inst "2022-07-22T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "T4 Solidarity@en",
   :rdfs/subClassOf  [:dpvo-rights-eu/EUFundamentalRights
                      :dpvo/DataSubjectRight],
   :vs/term_status   #xsd/langString "accepted@en"})

(def T5-CitizensRights
  "T5 Citizens Rights"
  {:db/ident         :dpvo-rights-eu/T5-CitizensRights,
   :dcterms/created  #xsd/date #inst "2022-08-04T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "T5 Citizens Rights@en",
   :rdfs/subClassOf  [:dpvo-rights-eu/EUFundamentalRights
                      :dpvo/DataSubjectRight],
   :vs/term_status   #xsd/langString "accepted@en"})

(def T6-Justice
  "T6 Justice"
  {:db/ident         :dpvo-rights-eu/T6-Justice,
   :dcterms/created  #xsd/date #inst "2022-08-13T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "T6 Justice@en",
   :rdfs/subClassOf  [:dpvo-rights-eu/EUFundamentalRights
                      :dpvo/DataSubjectRight],
   :vs/term_status   #xsd/langString "accepted@en"})

(def T7-InterpretationAndApplication
  "T7 Interpretation And Application"
  {:db/ident         :dpvo-rights-eu/T7-InterpretationAndApplication,
   :dcterms/created  #xsd/date #inst "2022-08-18T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/source   {:rdfa/uri
                      "http://data.europa.eu/eli/treaty/char_2012/oj"},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label       #xsd/langString "T7 Interpretation And Application@en",
   :rdfs/subClassOf  [:dpvo-rights-eu/EUFundamentalRights
                      :dpvo/DataSubjectRight],
   :vs/term_status   #xsd/langString "accepted@en"})

(def hasDeveloper
  "Indicates technology developer"
  {:db/ident            :dpvo-rights-eu/hasDeveloper,
   :dcterms/created     #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString "Indicates technology developer@en",
   :dcterms/modified    #xsd/date #inst "2022-10-21T00:00:00.000-04:00",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label          #xsd/langString "has developer@en",
   :rdfs/range          :dpv-tech/TechnologyDeveloper,
   :rdfs/subPropertyOf  :dpv-tech/hasTechnologyActor,
   :vs/term_status      #xsd/langString "changed@en"})

(def hasProvider
  "Indicates technology provider"
  {:db/ident            :dpvo-rights-eu/hasProvider,
   :dcterms/created     #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString "Indicates technology provider@en",
   :dcterms/modified    #xsd/date #inst "2022-10-21T00:00:00.000-04:00",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label          #xsd/langString "has provider@en",
   :rdfs/range          :dpv-tech/TechnologyProvider,
   :rdfs/subPropertyOf  :dpv-tech/hasTechnologyActor,
   :vs/term_status      #xsd/langString "changed@en"})

(def hasSubject
  "Indicates technology subject"
  {:db/ident            :dpvo-rights-eu/hasSubject,
   :dcterms/created     #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString "Indicates technology subject@en",
   :dcterms/modified    #xsd/date #inst "2022-10-21T00:00:00.000-04:00",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label          #xsd/langString "has subject@en",
   :rdfs/range          :dpv-tech/TechnologySubject,
   :rdfs/subPropertyOf  :dpv-tech/hasTechnologyActor,
   :vs/term_status      #xsd/langString "changed@en"})

(def hasUser
  "Indicates technology user"
  {:db/ident            :dpvo-rights-eu/hasUser,
   :dcterms/created     #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString "Indicates technology user@en",
   :dcterms/modified    #xsd/date #inst "2022-10-21T00:00:00.000-04:00",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/rights/eu#"},
   :rdfs/label          #xsd/langString "has user@en",
   :rdfs/range          :dpv-tech/TechnologyUser,
   :rdfs/subPropertyOf  :dpv-tech/hasTechnologyActor,
   :vs/term_status      #xsd/langString "changed@en"})