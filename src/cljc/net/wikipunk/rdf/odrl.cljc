(ns net.wikipunk.rdf.odrl
  "The ODRL Vocabulary and Expression defines a set of concepts and terms (the vocabulary) and encoding mechanism (the expression) for permissions and obligations statements describing digital content usage based on the ODRL Information Model."
  {:dcat/downloadURL "https://www.w3.org/ns/odrl/2/ODRL22.jsonld",
   :dcterms/contributor
   "W3C Permissions & Obligations Expression Working Group",
   :dcterms/creator ["Michael Steidl"
                     "Renato Iannella"
                     "Víctor Rodríguez-Doncel"
                     "Stuart Myles"],
   :dcterms/description
   #voc/lstr
    "The ODRL Vocabulary and Expression defines a set of concepts and terms (the vocabulary) and encoding mechanism (the expression) for permissions and obligations statements describing digital content usage based on the ODRL Information Model.@en",
   :dcterms/license
   "https://www.w3.org/Consortium/Legal/2002/ipr-notice-20021231#Copyright/",
   :owl/versionInfo "2.2",
   :rdf/ns-prefix-map {"cc"      "http://creativecommons.org/ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "odrl"    "http://www.w3.org/ns/odrl/2/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "schema"  "http://schema.org/",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "vcard"   "http://www.w3.org/2006/vcard/ns#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "odrl",
   :rdfa/uri "http://www.w3.org/ns/odrl/2/",
   :rdfs/comment #voc/lstr "This is the RDF ontology for ODRL Version 2.2.@en",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/odrl-vocab/"},
   :rdfs/label #voc/lstr "ODRL Version 2.2@en"}
  (:refer-clojure :exclude [and count derive or print read use]))

(def Action
  "An operation on an Asset."
  {:db/ident :odrl/Action,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Action@en",
   :rdfs/subClassOf [:rdfs/Resource :schema/Action :odrl/Action],
   :skos/definition #voc/lstr "An operation on an Asset.@en",
   :skos/note
   #voc/lstr
    "Actions may be allowed by Permissions, disallowed by Prohibitions, or made mandatory by Duties.@en"})

(def Agreement
  "A Policy that grants the assignee a Rule over an Asset from an assigner."
  {:db/ident :odrl/Agreement,
   :owl/disjointWith
   [:odrl/Assertion :odrl/Offer :odrl/Ticket :odrl/Privacy :odrl/Request],
   :rdf/type [:owl/Class :rdfs/Class :skos/Concept],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Agreement@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Agreement],
   :skos/definition
   #voc/lstr
    "A Policy that grants the assignee a Rule over an Asset from an assigner.@en",
   :skos/note
   #voc/lstr
    "An Agreement Policy MUST contain at least one Permission or Prohibition rule, a Party with Assigner function, and a Party with Assignee function (in the same Permission or Prohibition). The Agreement Policy will grant the terms of the Policy from the Assigner to the Assignee.@en"})

(def All
  "Specifies that the scope of the relationship is all of the collective individuals within a context."
  {:db/ident :odrl/All,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "All@en",
   :skos/definition
   #voc/lstr
    "Specifies that the scope of the relationship is all of the collective individuals within a context.@en",
   :skos/note
   #voc/lstr
    "For example, may be used to indicate all the users of a specific social network the party is a member of. Note that “group” scope is also assumed.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def All2ndConnections
  "Specifies that the scope of the relationship is all of the second-level connections to the Party."
  {:db/ident :odrl/All2ndConnections,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "All Second-level Connections@en",
   :skos/definition
   #voc/lstr
    "Specifies that the scope of the relationship is all of the second-level connections to the Party.@en",
   :skos/note
   #voc/lstr
    "For example, may be used to indicate all “friends of friends” of the Party. Note that “group” scope is also assumed.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def AllConnections
  "Specifies that the scope of the relationship is all of the first-level connections of the Party."
  {:db/ident :odrl/AllConnections,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "All First-Level Connections@en",
   :skos/definition
   #voc/lstr
    "Specifies that the scope of the relationship is all of the first-level connections of the Party.@en",
   :skos/note
   #voc/lstr
    "For example, may be used to indicate all “friends” of the Party. Note that “group” scope is also assumed.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def AllGroups
  "Specifies that the scope of the relationship is all of the group connections of the Party."
  {:db/ident :odrl/AllGroups,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "All Group Connections@en",
   :skos/definition
   #voc/lstr
    "Specifies that the scope of the relationship is all of the group connections of the Party.@en",
   :skos/note
   #voc/lstr
    "For example, may be used to indicate all groups that the Party is a member of. Note that “group” scope is also assumed.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def Assertion
  "A Policy that asserts a Rule over an Asset from parties."
  {:db/ident :odrl/Assertion,
   :owl/disjointWith [:odrl/Offer :odrl/Privacy :odrl/Request :odrl/Ticket],
   :rdf/type [:rdfs/Class :owl/Class :skos/Concept],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Assertion@en",
   :rdfs/subClassOf [:odrl/Policy :odrl/Assertion :rdfs/Resource],
   :skos/definition
   #voc/lstr "A Policy that asserts a Rule over an Asset from parties.@en",
   :skos/note
   #voc/lstr
    "For example, a party (an assignee or assigner) can claim what terms they have over an Asset. An Assertion Policy does not grant such permissions/prohibitions but only asserts the parties claims. An Assetion Policy  MUST contain a target Asset, a Party with any functional role, and at least one of a Permission or Prohibition rule.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def Asset
  "A resource or a collection of resources that are the subject of a Rule."
  {:db/ident :odrl/Asset,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Asset@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Asset],
   :skos/definition
   #voc/lstr
    "A resource or a collection of resources that are the subject of a Rule.@en",
   :skos/note
   #voc/lstr
    "The Asset entity can be any form of identifiable resource, such as data/information, content/media, applications, or services. Furthermore, it can be used to represent other Asset entities that are needed to undertake the Policy expression, such as with the Duty entity. To describe more details about the Asset, it is recommended to use Dublin Core [[dcterms]] elements or other content metadata.@en"})

(def AssetCollection
  "An Asset that is collection of individual resources"
  {:db/ident         :odrl/AssetCollection,
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Asset Collection@en",
   :rdfs/subClassOf  [:rdfs/Resource :odrl/Asset :odrl/AssetCollection],
   :skos/definition  #voc/lstr
                      "An Asset that is collection of individual resources@en"})

(def AssetScope
  "Scopes for Asset Scope expressions."
  {:db/ident :odrl/AssetScope,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Asset Scope@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/AssetScope],
   :skos/definition #voc/lstr "Scopes for Asset Scope expressions.@en",
   :skos/note
   #voc/lstr
    "Instances of the AssetScope class represent the terms for the scope property of Assets.@en"})

(def ConflictTerm
  "Used to establish strategies to resolve conflicts that arise from the merging of Policies or conflicts between Permissions and Prohibitions in the same Policy."
  {:db/ident :odrl/ConflictTerm,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Conflict Strategy Preference@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/ConflictTerm],
   :skos/definition
   #voc/lstr
    "Used to establish strategies to resolve conflicts that arise from the merging of Policies or conflicts between Permissions and Prohibitions in the same Policy.@en",
   :skos/note
   #voc/lstr
    "Instances of ConflictTerm describe strategies for resolving conflicts.@en"})

(def Constraint
  "A boolean expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule."
  {:db/ident :odrl/Constraint,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Constraint@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Constraint],
   :skos/definition
   #voc/lstr
    "A boolean expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule.@en"})

(def Duty
  "The obligation to perform an Action"
  {:db/ident         :odrl/Duty,
   :owl/disjointWith [:odrl/Permission :odrl/Prohibition],
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Duty@en",
   :rdfs/subClassOf  [:odrl/Rule :odrl/Duty :rdfs/Resource],
   :skos/definition  #voc/lstr "The obligation to perform an Action@en"})

(def Group
  "Specifies that the scope of the relationship is the defined group with multiple individual members."
  {:db/ident :odrl/Group,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Group@en",
   :skos/definition
   #voc/lstr
    "Specifies that the scope of the relationship is the defined group with multiple individual members.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def Individual
  "Specifies that the scope of the relationship is the single Party individual."
  {:db/ident :odrl/Individual,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Individual@en",
   :skos/definition
   #voc/lstr
    "Specifies that the scope of the relationship is the single Party individual.@en"})

(def LeftOperand
  "Left operand for a constraint expression."
  {:db/ident :odrl/LeftOperand,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Left Operand@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/LeftOperand],
   :skos/definition #voc/lstr "Left operand for a constraint expression.@en",
   :skos/note
   #voc/lstr
    "Instances of the LeftOperand class are used as the leftOperand of a Constraint.@en"})

(def LogicalConstraint
  "A logical expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule."
  {:db/ident :odrl/LogicalConstraint,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Logical Constraint@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/LogicalConstraint],
   :skos/definition
   #voc/lstr
    "A logical expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule.@en"})

(def Offer
  "A Policy that proposes a Rule over an Asset from an assigner."
  {:db/ident :odrl/Offer,
   :owl/disjointWith
   [:odrl/Agreement :odrl/Privacy :odrl/Ticket :odrl/Request :odrl/Assertion],
   :rdf/type [:skos/Concept :rdfs/Class :owl/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Offer@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Offer],
   :skos/definition
   #voc/lstr "A Policy that proposes a Rule over an Asset from an assigner.@en",
   :skos/note
   #voc/lstr
    "An Offer Policy MUST contain at least one Permission or Prohibition rule and a Party with Assigner function (in the same Permission or Prohibition). The Offer Policy MAY contain a Party with Assignee function, but MUST not grant any privileges to that Party.@en"})

(def Operator
  "Operator for constraint expression."
  {:db/ident :odrl/Operator,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Operator@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Operator],
   :skos/definition #voc/lstr "Operator for constraint expression.@en",
   :skos/note
   #voc/lstr
    "Instances of the Operator class representing relational operators.@en"})

(def Party
  "An entity or a collection of entities that undertake Roles in a Rule."
  {:db/ident :odrl/Party,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Party@en",
   :rdfs/subClassOf [:rdfs/Resource
                     {:owl/unionOf [:schema/Person
                                    :schema/Organization
                                    :foaf/Person
                                    :foaf/Organization
                                    :foaf/Agent
                                    :vcard/Individual
                                    :vcard/Organization
                                    :vcard/Agent],
                      :rdf/type    :owl/Class}
                     :odrl/Party],
   :skos/definition
   #voc/lstr
    "An entity or a collection of entities that undertake Roles in a Rule.@en",
   :skos/note
   #voc/lstr
    "The Party entity could be a person, group of people, organisation, or agent. An agent is a person or thing that takes an active role or produces a specified effect. To describe more details about the Party, it is recommended to use W3C vCard Ontology [[vcard-rdf]] or FOAF Vocabulary [[foaf]].@en"})

(def PartyCollection
  "A Party that is a group of individual entities"
  {:db/ident         :odrl/PartyCollection,
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Party Collection@en",
   :rdfs/subClassOf  [:odrl/Party
                      :odrl/PartyCollection
                      :rdfs/Resource
                      {:owl/unionOf [:schema/Person
                                     :schema/Organization
                                     :foaf/Person
                                     :foaf/Organization
                                     :foaf/Agent
                                     :vcard/Individual
                                     :vcard/Organization
                                     :vcard/Agent],
                       :rdf/type    :owl/Class}],
   :skos/definition  #voc/lstr
                      "A Party that is a group of individual entities@en"})

(def PartyScope
  "Scopes for Party Scope expressions."
  {:db/ident :odrl/PartyScope,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Party Scope@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/PartyScope],
   :skos/definition #voc/lstr "Scopes for Party Scope expressions.@en",
   :skos/note
   #voc/lstr
    "Instances of the PartyScope class represent the terms for the scope property of Parties.@en"})

(def Permission
  "The ability to perform an Action over an Asset."
  {:db/ident         :odrl/Permission,
   :owl/disjointWith [:odrl/Duty :odrl/Prohibition],
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Permission@en",
   :rdfs/subClassOf  [:odrl/Rule :odrl/Permission :rdfs/Resource],
   :skos/definition  #voc/lstr
                      "The ability to perform an Action over an Asset.@en"})

(def Policy
  "A non-empty group of Permissions and/or Prohibitions."
  {:db/ident :odrl/Policy,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Policy@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy],
   :skos/definition #voc/lstr
                     "A non-empty group of Permissions and/or Prohibitions.@en",
   :skos/note #voc/lstr "A Policy may contain multiple Rules.@en"})

(def Privacy
  "A Policy that expresses a Rule over an Asset containing personal information."
  {:db/ident :odrl/Privacy,
   :owl/disjointWith
   [:odrl/Assertion :odrl/Ticket :odrl/Offer :odrl/Agreement :odrl/Request],
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Privacy Policy@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Privacy],
   :skos/definition
   #voc/lstr
    "A Policy that expresses a Rule over an Asset containing personal information.@en",
   :skos/note
   #voc/lstr
    "A Privacy Policy  MUST contain a target Asset, a Party with Assigner  is, a Party with Assignee function, and at least one of a Permission or Prohibition rule that MUST include a Duty. The target Asset SHOULD contain or relate to personal information about the Assignee. The Duty MUST describe obligations on the Assigner about managing the Asset. The Assignee is being granted the terms of the Privacy policy from the Assigner.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def Prohibition
  "The inability to perform an Action over an Asset."
  {:db/ident         :odrl/Prohibition,
   :owl/disjointWith [:odrl/Permission :odrl/Duty],
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Prohibition@en",
   :rdfs/subClassOf  [:rdfs/Resource :odrl/Rule :odrl/Prohibition],
   :skos/definition  #voc/lstr
                      "The inability to perform an Action over an Asset.@en"})

(def Request
  "A Policy that proposes a Rule over an Asset from an assignee."
  {:db/ident :odrl/Request,
   :owl/disjointWith
   [:odrl/Assertion :odrl/Agreement :odrl/Privacy :odrl/Ticket :odrl/Offer],
   :rdf/type [:skos/Concept :rdfs/Class :owl/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Request@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Request],
   :skos/definition
   #voc/lstr "A Policy that proposes a Rule over an Asset from an assignee.@en",
   :skos/note
   #voc/lstr
    "A Request Policy  MUST contain a target Asset, a Party with Assignee function, and at least one of a Permission or Prohibition rule. The Request MAY also contain the Party with Assigner function if this is known. No privileges are granted to any Party.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def RightOperand
  "Right operand for constraint expression."
  {:db/ident :odrl/RightOperand,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Right Operand@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/RightOperand],
   :skos/definition #voc/lstr "Right operand for constraint expression.@en",
   :skos/note
   #voc/lstr
    "Instances of the RightOperand class are used as the rightOperand of a Constraint.@en"})

(def Rule
  "An abstract concept that represents the common characteristics of Permissions, Prohibitions, and Duties."
  {:db/ident :odrl/Rule,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Rule@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Rule],
   :skos/definition
   #voc/lstr
    "An abstract concept that represents the common characteristics of Permissions, Prohibitions, and Duties.@en",
   :skos/note #voc/lstr "Rule is an abstract concept.@en"})

(def Set
  "A Policy that expresses a Rule over an Asset."
  {:db/ident :odrl/Set,
   :owl/disjointWith [:odrl/Ticket
                      :odrl/Offer
                      :odrl/Assertion
                      :odrl/Agreement
                      :odrl/Request
                      :odrl/Privacy],
   :rdf/type [:owl/Class :rdfs/Class :skos/Concept],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Set@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Set],
   :skos/definition #voc/lstr
                     "A Policy that expresses a Rule over an Asset.@en",
   :skos/note
   #voc/lstr
    "A Set Policy MUST contain a target Asset, and at least one Rule. A Set Policy is the default Policy subclass. The Set is aimed at scenarios where there is an open criteria for the semantics of the policy expressions and typically refined by other systems/profiles that process the information at a later time. No privileges are granted to any Party (if defined).@en"})

(def Ticket
  "A Policy that grants the holder a Rule over an Asset from an assigner."
  {:db/ident :odrl/Ticket,
   :owl/disjointWith
   [:odrl/Agreement :odrl/Privacy :odrl/Request :odrl/Offer :odrl/Assertion],
   :rdf/type [:owl/Class :rdfs/Class :skos/Concept],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Ticket@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Ticket],
   :skos/definition
   #voc/lstr
    "A Policy that grants the holder a Rule over an Asset from an assigner.@en",
   :skos/note
   #voc/lstr
    "A Ticket Policy MUST contain a target Asset and at least one of a Permission or Prohibition rule.  The Ticket MAY contain the Party with Assigner function and MUST NOT contain an Assignee. The Ticket Policy will grant the terms of the Policy to the holder of that Ticket. The holder of the Ticket MAY remain unknown or MAY have to be identified at some later stage.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def UndefinedTerm
  "Is used to indicate how to support Actions that are not part of any vocabulary or profile in the policy expression system."
  {:db/ident :odrl/UndefinedTerm,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Undefined Term@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/UndefinedTerm],
   :skos/definition
   #voc/lstr
    "Is used to indicate how to support Actions that are not part of any vocabulary or profile in the policy expression system.@en",
   :skos/note
   #voc/lstr
    "Instances of UndefinedTerm describe strategies for processing unsupported actions.@en"})

(def absolutePosition
  "A point in space or time defined with absolute coordinates for the positioning of the target Asset."
  {:db/ident :odrl/absolutePosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Absolute Asset Position@en",
   :skos/definition
   #voc/lstr
    "A point in space or time defined with absolute coordinates for the positioning of the target Asset.@en",
   :skos/note
   #voc/lstr
    "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def absoluteSize
  "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects of the target Asset."
  {:db/ident :odrl/absoluteSize,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Absolute Asset Size@en",
   :skos/definition
   #voc/lstr
    "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects of the target Asset.@en",
   :skos/note
   #voc/lstr
    "Example: The image can be resized in width to a maximum of 1000px.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def absoluteSpatialPosition
  "The absolute spatial positions of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space for the target Asset to fit."
  {:db/ident :odrl/absoluteSpatialPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Absolute Spatial Asset Position@en",
   :skos/broaderTransitive :odrl/absolutePosition,
   :skos/definition
   #voc/lstr
    "The absolute spatial positions of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space for the target Asset to fit.@en",
   :skos/note
   #voc/lstr
    "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it. Note: see also the Left Operand Relative Spatial Asset Position. @en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def absoluteTemporalPosition
  "The absolute temporal positions in a media stream the target Asset has to fit."
  {:db/ident :odrl/absoluteTemporalPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Absolute Temporal Asset Position@en",
   :skos/broaderTransitive :odrl/absolutePosition,
   :skos/definition
   #voc/lstr
    "The absolute temporal positions in a media stream the target Asset has to fit.@en",
   :skos/note
   #voc/lstr
    "Use with Actions including the target Asset in a larger media stream. The fragment part of a Media Fragment URI (https://www.w3.org/TR/media-frags/) may be used for the right operand. See the Left Operand realativeTemporalPosition. <br />Example: The MP3 music file must be positioned between second 192 and 250 of the temporal length of a stream.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def acceptTracking
  "To accept that the use of the Asset may be tracked."
  {:db/ident :odrl/acceptTracking,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Accept Tracking@en",
   :skos/definition #voc/lstr
                     "To accept that the use of the Asset may be tracked.@en",
   :skos/note
   #voc/lstr
    "The collected information may be tracked by the Assigner, or may link to a Party with the role 'trackingParty' function.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def action
  "The operation relating to the Asset for which the Rule is being subjected."
  {:db/ident :odrl/action,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Has Action@en",
   :rdfs/range :odrl/Action,
   :rdfs/subPropertyOf :odrl/action,
   :skos/definition
   #voc/lstr
    "The operation relating to the Asset for which the Rule is being subjected.@en"})

(def actionConcepts
  "Action"
  {:db/ident       :odrl/actionConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/implies :odrl/includedIn :odrl/action :odrl/Action],
   :skos/prefLabel #voc/lstr "Action@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def actions
  "Actions for Rules"
  {:db/ident       :odrl/actions,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/transfer :odrl/use],
   :skos/prefLabel #voc/lstr "Actions for Rules@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def actionsCommon
  "Actions for Rules"
  {:db/ident       :odrl/actionsCommon,
   :rdf/type       :skos/Collection,
   :skos/member    [:cc/DerivativeWorks
                    :odrl/extract
                    :cc/CommercialUse
                    :odrl/watermark
                    :odrl/move
                    :odrl/print
                    :odrl/uninstall
                    :cc/Reproduction
                    :odrl/install
                    :cc/ShareAlike
                    :odrl/transform
                    :odrl/compensate
                    :odrl/attribute
                    :odrl/read
                    :odrl/digitize
                    :odrl/distribute
                    :odrl/include
                    :odrl/sell
                    :odrl/anonymize
                    :odrl/textToSpeech
                    :odrl/synchronize
                    :odrl/obtainConsent
                    :cc/SourceCode
                    :odrl/concurrentUse
                    :odrl/ensureExclusivity
                    :odrl/play
                    :odrl/index
                    :cc/Sharing
                    :cc/Attribution
                    :odrl/give
                    :odrl/present
                    :odrl/nextPolicy
                    :odrl/delete
                    :odrl/modify
                    :odrl/derive
                    :odrl/translate
                    :odrl/display
                    :odrl/acceptTracking
                    :odrl/reviewPolicy
                    :cc/Distribution
                    :cc/Notice
                    :odrl/archive
                    :odrl/inform
                    :odrl/execute
                    :odrl/reproduce
                    :odrl/aggregate
                    :odrl/grantUse
                    :odrl/annotate
                    :odrl/stream],
   :skos/prefLabel #voc/lstr "Actions for Rules@en",
   :skos/scopeNote #voc/lstr "ODRL Common Vocabulary Terms@en"})

(def adHocShare
  "The act of sharing the asset to parties in close proximity to the owner."
  {:db/ident :odrl/adHocShare,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Ad-hoc sharing@en",
   :skos/definition
   #voc/lstr
    "The act of sharing the asset to parties in close proximity to the owner.@en",
   :skos/note
   #voc/lstr
    "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/adhoc-share .@en"})

(def aggregate
  "To use the Asset or parts of it as part of a composite collection."
  {:db/ident :odrl/aggregate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Aggregate@en",
   :skos/definition
   #voc/lstr
    "To use the Asset or parts of it as part of a composite collection.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def and
  "The relation is satisfied when all of the Constraints are satisfied."
  {:db/ident :odrl/and,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "And@en",
   :rdfs/subPropertyOf [:odrl/operand :odrl/and],
   :skos/definition
   #voc/lstr
    "The relation is satisfied when all of the Constraints are satisfied.@en",
   :skos/note
   #voc/lstr
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances.@en"})

(def andSequence
  "The relation is satisfied when each of the Constraints are satisfied in the order specified."
  {:db/ident :odrl/andSequence,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "And Sequence@en",
   :rdfs/subPropertyOf [:odrl/operand :odrl/andSequence],
   :skos/definition
   #voc/lstr
    "The relation is satisfied when each of the Constraints are satisfied in the order specified.@en",
   :skos/note
   #voc/lstr
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances. The order of the list MUST be preserved. The andSequence operator is an example where there may be temporal conditional requirements between the operands. This may lead to situations where the outcome is unresolvable, such as deadlock if one of the Constraints is unable to be satisfied. ODRL Processing systems SHOULD plan for these scenarios and implement mechanisms to resolve them.@en"})

(def annotate
  "To add explanatory notations/commentaries to the Asset without modifying the Asset in any other way."
  {:db/ident :odrl/annotate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Annotate@en",
   :skos/definition
   #voc/lstr
    "To add explanatory notations/commentaries to the Asset without modifying the Asset in any other way.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def anonymize
  "To anonymize all or parts of the Asset."
  {:db/ident :odrl/anonymize,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Anonymize@en",
   :skos/definition #voc/lstr "To anonymize all or parts of the Asset.@en",
   :skos/note
   #voc/lstr
    "For example, to remove identifying particulars for statistical or for other comparable purposes, or to use the Asset without stating the author/source.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def append
  "The act of adding to the end of an asset."
  {:db/ident         :odrl/append,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Append@en",
   :skos/definition  #voc/lstr "The act of adding to the end of an asset.@en",
   :skos/exactMatch  :odrl/modify})

(def appendTo
  "The act of appending data to the Asset without modifying the Asset in any other way."
  {:db/ident :odrl/appendTo,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Append To@en",
   :skos/definition
   #voc/lstr
    "The act of appending data to the Asset without modifying the Asset in any other way.@en",
   :skos/exactMatch :odrl/modify})

(def archive
  "To store the Asset (in a non-transient form)."
  {:db/ident :odrl/archive,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Archive@en",
   :skos/definition #voc/lstr
                     "To store the Asset (in a non-transient form).@en",
   :skos/note #voc/lstr
               "Temporal constraints may be used for temporal conditions.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def assetConcepts
  "Asset"
  {:db/ident       :odrl/assetConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/AssetCollection :odrl/Asset],
   :skos/prefLabel #voc/lstr "Asset@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def assetParty
  "Asset and Party"
  {:db/ident       :odrl/assetParty,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/source :odrl/partOf],
   :skos/prefLabel #voc/lstr "Asset and Party@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def assetRelations
  "Asset Relations"
  {:db/ident       :odrl/assetRelations,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/hasPolicy :odrl/target],
   :skos/prefLabel #voc/lstr "Asset Relations@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def assetRelationsCommon
  "Asset Relations"
  {:db/ident       :odrl/assetRelationsCommon,
   :rdf/type       :skos/Collection,
   :skos/member    :odrl/output,
   :skos/prefLabel #voc/lstr "Asset Relations@en",
   :skos/scopeNote #voc/lstr "ODRL Common Vocabulary Terms@en"})

(def assignee
  "The Party is the recipient of the Rule."
  {:db/ident           :odrl/assignee,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        {:owl/unionOf [:odrl/Rule :odrl/Policy],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Assignee@en",
   :rdfs/range         :odrl/Party,
   :rdfs/subPropertyOf [:odrl/function :odrl/assignee],
   :skos/definition    #voc/lstr "The Party is the recipient of the Rule.@en"})

(def assigneeOf
  "Identifies an ODRL Policy for which the identified Party undertakes the assignee functional role."
  {:db/ident :odrl/assigneeOf,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Party,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Assignee Of@en",
   :rdfs/range :odrl/Policy,
   :rdfs/subPropertyOf :odrl/assigneeOf,
   :skos/definition
   #voc/lstr
    "Identifies an ODRL Policy for which the identified Party undertakes the assignee functional role.@en",
   :skos/note
   #voc/lstr
    "When assigneeOf has been asserted between a metadata expression and an ODRL Policy, the Party being identified MUST be inferred to undertake the assignee functional role of all the Rules of that Policy.@en"})

(def assigner
  "The Party is the issuer of the Rule."
  {:db/ident           :odrl/assigner,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        {:owl/unionOf [:odrl/Rule :odrl/Policy],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Assigner@en",
   :rdfs/range         :odrl/Party,
   :rdfs/subPropertyOf [:odrl/function :odrl/assigner],
   :skos/definition    #voc/lstr "The Party is the issuer of the Rule.@en"})

(def assignerOf
  "Identifies an ODRL Policy for which the identified Party undertakes the assigner functional role."
  {:db/ident :odrl/assignerOf,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Party,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Assigner Of@en",
   :rdfs/range :odrl/Policy,
   :rdfs/subPropertyOf :odrl/assignerOf,
   :skos/definition
   #voc/lstr
    "Identifies an ODRL Policy for which the identified Party undertakes the assigner functional role.@en",
   :skos/note
   #voc/lstr
    "When assignerOf has been asserted between a metadata expression and an ODRL Policy, the Party being identified MUST be inferred to undertake the assigner functional role of all the Rules of that Policy.@en"})

(def attachPolicy
  "The act of keeping the policy notice with the asset."
  {:db/ident         :odrl/attachPolicy,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Attach policy@en",
   :skos/definition  #voc/lstr
                      "The act of keeping the policy notice with the asset.@en",
   :skos/exactMatch  :cc/Notice})

(def attachSource
  "The act of attaching the source of the asset and its derivatives."
  {:db/ident :odrl/attachSource,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Attach source@en",
   :skos/definition
   #voc/lstr
    "The act of attaching the source of the asset and its derivatives.@en",
   :skos/exactMatch :cc/SourceCode})

(def attribute
  "To attribute the use of the Asset."
  {:db/ident :odrl/attribute,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Attribute@en",
   :skos/definition #voc/lstr "To attribute the use of the Asset.@en",
   :skos/note
   #voc/lstr
    "May link to an Asset with the attribution information. May link to a Party with the  role “attributedParty” function.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def attributedParty
  "The Party to be attributed."
  {:db/ident           :odrl/attributedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Attributed Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/attributedParty],
   :skos/definition    #voc/lstr "The Party to be attributed.@en",
   :skos/note          #voc/lstr
                        "Maybe specified as part of the attribute action.@en",
   :skos/scopeNote     #voc/lstr "Non-Normative@en"})

(def attributingParty
  "The Party who undertakes the attribution."
  {:db/ident           :odrl/attributingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Attributing Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/attributingParty],
   :skos/definition    #voc/lstr "The Party who undertakes the attribution.@en",
   :skos/note          #voc/lstr
                        "Maybe specified as part of the attribute action.@en",
   :skos/scopeNote     #voc/lstr "Non-Normative@en"})

(def commercialize
  "The act of using the asset in a business environment."
  {:db/ident :odrl/commercialize,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Commercialize@en",
   :skos/definition #voc/lstr
                     "The act of using the asset in a business environment.@en",
   :skos/exactMatch :cc/CommercialUse})

(def compensate
  "To compensate by transfer of some amount of value, if defined, for using or selling the Asset."
  {:db/ident :odrl/compensate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Compensate@en",
   :skos/definition
   #voc/lstr
    "To compensate by transfer of some amount of value, if defined, for using or selling the Asset.@en",
   :skos/note
   #voc/lstr
    "The compensation may use different types of things with a value: (i) the thing is expressed by the value (term) of the Constraint name; (b) the value is expressed by operator, rightOperand, dataType and unit. Typically the assignee will compensate the assigner, but other compensation party roles may be used.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def compensatedParty
  "The Party is the recipient of the compensation."
  {:db/ident :odrl/compensatedParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Compensated Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/compensatedParty],
   :skos/definition #voc/lstr
                     "The Party is the recipient of the compensation.@en",
   :skos/note #voc/lstr
               "Maybe specified as part of the compensate duty action.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def compensatingParty
  "The Party that is the provider of the compensation."
  {:db/ident :odrl/compensatingParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Compensating Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/compensatingParty],
   :skos/definition #voc/lstr
                     "The Party that is the provider of the compensation.@en",
   :skos/note #voc/lstr
               "Maybe specified as part of the compensate duty action.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def concurrentUse
  "To create multiple copies of the Asset that are being concurrently used."
  {:db/ident :odrl/concurrentUse,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Concurrent Use@en",
   :skos/definition
   #voc/lstr
    "To create multiple copies of the Asset that are being concurrently used.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def conflict
  "The conflict-resolution strategy for a Policy."
  {:db/ident :odrl/conflict,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Policy,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Handle Policy Conflicts@en",
   :rdfs/range :odrl/ConflictTerm,
   :rdfs/subPropertyOf :odrl/conflict,
   :skos/definition #voc/lstr
                     "The conflict-resolution strategy for a Policy.@en",
   :skos/note #voc/lstr
               "If no strategy is specified, the default is invalid.@en"})

(def conflictConcepts
  "Policy Conflict Strategy"
  {:db/ident :odrl/conflictConcepts,
   :rdf/type :skos/Collection,
   :skos/member
   [:odrl/invalid :odrl/prohibit :odrl/perm :odrl/conflict :odrl/ConflictTerm],
   :skos/prefLabel #voc/lstr "Policy Conflict Strategy@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def consentedParty
  "The Party who obtains the consent."
  {:db/ident :odrl/consentedParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Consented Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/consentedParty],
   :skos/definition #voc/lstr "The Party who obtains the consent.@en",
   :skos/note #voc/lstr
               "Maybe specified as part of the obtainConsent action.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def consentingParty
  "The Party to obtain consent from."
  {:db/ident :odrl/consentingParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Consenting Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/consentingParty],
   :skos/definition #voc/lstr "The Party to obtain consent from.@en",
   :skos/note #voc/lstr
               "Maybe specified as part of the obtainConsent action.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def consequence
  "Relates a Duty to another Duty, the latter being a consequence of not fulfilling the former."
  {:db/ident :odrl/consequence,
   :rdf/type [:skos/Concept :rdf/Property :owl/ObjectProperty],
   :rdfs/domain :odrl/Duty,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Consequence@en",
   :rdfs/range :odrl/Duty,
   :rdfs/subPropertyOf [:odrl/failure :odrl/consequence],
   :skos/definition
   #voc/lstr
    "Relates a Duty to another Duty, the latter being a consequence of not fulfilling the former.@en",
   :skos/note
   #voc/lstr
    "The consequence property is utilised to express the repercussions of not fulfilling an agreed Policy obligation or duty for a Permission. If either of these fails to be fulfilled, then this will result in the consequence Duty also becoming a new requirement, meaning that the original obligation or duty, as well as the consequence Duty must all be fulfilled@en"})

(def constraint
  "Constraint applied to a Rule"
  {:db/ident :odrl/constraint,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Policy :odrl/Rule],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Has Constraint@en",
   :rdfs/range {:owl/unionOf [:odrl/Constraint :odrl/LogicalConstraint],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :odrl/constraint,
   :skos/definition #voc/lstr "Constraint applied to a Rule@en",
   :skos/note
   #voc/lstr
    "Constraints on Rules are used to determine if a rule is Active or not. Example: the Permission rule is only active during the year 2018.@en"})

(def constraintLeftOperandCommon
  "Constraint Left Operands"
  {:db/ident       :odrl/constraintLeftOperandCommon,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/resolution
                    :odrl/purpose
                    :odrl/relativeTemporalPosition
                    :odrl/timeInterval
                    :odrl/elapsedTime
                    :odrl/spatialCoordinates
                    :odrl/fileFormat
                    :odrl/dateTime
                    :odrl/event
                    :odrl/systemDevice
                    :odrl/absoluteSpatialPosition
                    :odrl/payAmount
                    :odrl/absoluteSize
                    :odrl/spatial
                    :odrl/deliveryChannel
                    :odrl/absolutePosition
                    :odrl/virtualLocation
                    :odrl/percentage
                    :odrl/relativePosition
                    :odrl/product
                    :odrl/relativeSize
                    :odrl/relativeSpatialPosition
                    :odrl/count
                    :odrl/media
                    :odrl/language
                    :odrl/industry
                    :odrl/unitOfCount
                    :odrl/delayPeriod
                    :odrl/version
                    :odrl/meteredTime
                    :odrl/recipient
                    :odrl/absoluteTemporalPosition],
   :skos/prefLabel #voc/lstr "Constraint Left Operands@en",
   :skos/scopeNote #voc/lstr "ODRL Common Vocabulary Terms@en"})

(def constraintLogicalOperands
  "Logical Constraint Operands"
  {:db/ident       :odrl/constraintLogicalOperands,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/andSequence :odrl/and :odrl/xone :odrl/or],
   :skos/prefLabel #voc/lstr "Logical Constraint Operands@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def constraintRelationalOperators
  "Constraint Operators"
  {:db/ident       :odrl/constraintRelationalOperators,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/gteq
                    :odrl/isA
                    :odrl/lt
                    :odrl/hasPart
                    :odrl/eq
                    :odrl/lteq
                    :odrl/isAllOf
                    :odrl/isNoneOf
                    :odrl/neq
                    :odrl/isPartOf
                    :odrl/gt
                    :odrl/isAnyOf],
   :skos/prefLabel #voc/lstr "Constraint Operators@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def constraintRightOpCommon
  "Constraint Right Operands"
  {:db/ident       :odrl/constraintRightOpCommon,
   :rdf/type       :skos/Collection,
   :skos/member    :odrl/policyUsage,
   :skos/prefLabel #voc/lstr "Constraint Right Operands@en",
   :skos/scopeNote #voc/lstr "ODRL Common Vocabulary Terms@en"})

(def constraints
  "Constraint"
  {:db/ident       :odrl/constraints,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/constraint
                    :odrl/rightOperand
                    :odrl/unit
                    :odrl/LeftOperand
                    :odrl/leftOperand
                    :odrl/rightOperandReference
                    :odrl/RightOperand
                    :odrl/status
                    :odrl/operator
                    :odrl/Operator
                    :odrl/refinement
                    :odrl/Constraint
                    :odrl/dataType],
   :skos/prefLabel #voc/lstr "Constraint@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def contractedParty
  "The Party who is being contracted."
  {:db/ident           :odrl/contractedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Contracted Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/contractedParty],
   :skos/definition    #voc/lstr "The Party who is being contracted.@en",
   :skos/scopeNote     #voc/lstr "Non-Normative@en"})

(def contractingParty
  "The Party who is offering the contract."
  {:db/ident           :odrl/contractingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Contracting Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/contractingParty],
   :skos/definition    #voc/lstr "The Party who is offering the contract.@en",
   :skos/scopeNote     #voc/lstr "Non-Normative@en"})

(def copy
  "The act of making an exact reproduction of the asset."
  {:db/ident :odrl/copy,
   :owl/deprecated true,
   :owl/sameAs :odrl/reproduce,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Copy@en",
   :skos/definition #voc/lstr
                     "The act of making an exact reproduction of the asset.@en",
   :skos/exactMatch :odrl/reproduce})

(def core
  "Identifier for the ODRL Core Profile"
  {:db/ident         :odrl/core,
   :rdf/type         [:skos/Concept :owl/Thing],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "ODRL Core Profile@en",
   :skos/definition  #voc/lstr "Identifier for the ODRL Core Profile@en"})

(def count
  "Numeric count of executions of the action of the Rule."
  {:db/ident :odrl/count,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Count@en",
   :skos/definition
   #voc/lstr "Numeric count of executions of the action of the Rule.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def dataType
  "The datatype of the value of the rightOperand or rightOperandReference of a Constraint."
  {:db/ident :odrl/dataType,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Datatype@en",
   :rdfs/range :rdfs/Datatype,
   :rdfs/subPropertyOf :odrl/dataType,
   :skos/definition
   #voc/lstr
    "The datatype of the value of the rightOperand or rightOperandReference of a Constraint.@en",
   :skos/note
   #voc/lstr
    "In RDF encodings, use of the rdf:datatype MUST be used. In JSON-LD encoding, the use of @type MUST be used.@en"})

(def dateTime
  "The date (and optional time and timezone) of exercising the action of the Rule. Right operand value MUST be an xsd:date or xsd:dateTime as defined by [[xmlschema11-2]]."
  {:db/ident :odrl/dateTime,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Datetime@en",
   :skos/definition
   #voc/lstr
    "The date (and optional time and timezone) of exercising the action of the Rule. Right operand value MUST be an xsd:date or xsd:dateTime as defined by [[xmlschema11-2]].@en",
   :skos/note
   #voc/lstr
    "The use of Timezone information is strongly recommended. The Rule may be exercised before (with operator lt/lteq) or after (with operator gt/gteq) the date(time) defined by the Right operand. <br />Example: <code>dateTime gteq 2017-12-31T06:00Z</code> means the Rule can only be exercised after (and including) 6:00AM on the 31st Decemeber 2017 UTC time.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def delayPeriod
  "A time delay period prior to exercising the action of the Rule. The point in time triggering this period MAY be defined by another temporal Constraint combined by a Logical Constraint (utilising the odrl:andSequence operand). Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."
  {:db/ident :odrl/delayPeriod,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Delay Period@en",
   :skos/definition
   #voc/lstr
    "A time delay period prior to exercising the action of the Rule. The point in time triggering this period MAY be defined by another temporal Constraint combined by a Logical Constraint (utilising the odrl:andSequence operand). Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].@en",
   :skos/note
   #voc/lstr
    "Only the eq, gt, gteq operators SHOULD be used. <br />Example: <code>delayPeriod eq P60M</code> indicates a delay of 60 Minutes before exercising the action.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def delete
  "To permanently remove all copies of the Asset after it has been used."
  {:db/ident :odrl/delete,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Delete@en",
   :skos/definition
   #voc/lstr
    "To permanently remove all copies of the Asset after it has been used.@en",
   :skos/note
   #voc/lstr
    "Use a constraint to define under which conditions the Asset must be deleted.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def deliveryChannel
  "The delivery channel used for exercising the action of the Rule."
  {:db/ident :odrl/deliveryChannel,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Delivery Channel@en",
   :skos/definition
   #voc/lstr
    "The delivery channel used for exercising the action of the Rule.@en",
   :skos/note
   #voc/lstr
    "Example: the asset may be distributed only on mobile networks.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def deprecatedTerms
  "Deprecated Terms"
  {:db/ident       :odrl/deprecatedTerms,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/shareAlike
                    :odrl/All
                    :odrl/All2ndConnections
                    :odrl/PartyScope
                    :odrl/scope
                    :odrl/device
                    :odrl/write
                    :odrl/pay
                    :odrl/payeeParty
                    :odrl/copy
                    :odrl/inheritRelation
                    :odrl/lend
                    :odrl/timedCount
                    :odrl/lease
                    :odrl/Group
                    :odrl/writeTo
                    :odrl/system
                    :odrl/AssetScope
                    :odrl/inheritAllowed
                    :odrl/proximity
                    :odrl/commercialize
                    :odrl/Individual
                    :odrl/ignore
                    :odrl/preview
                    :odrl/appendTo
                    :odrl/attachSource
                    :odrl/export
                    :odrl/attachPolicy
                    :odrl/extractChar
                    :odrl/share
                    :odrl/extractPage
                    :odrl/secondaryUse
                    :odrl/adHocShare
                    :odrl/AllConnections
                    :odrl/support
                    :odrl/AllGroups
                    :odrl/UndefinedTerm
                    :odrl/extractWord
                    :odrl/undefined
                    :odrl/append
                    :odrl/license],
   :skos/prefLabel #voc/lstr "Deprecated Terms@en"})

(def derive
  "To create a new derivative Asset from this Asset and to edit or modify the derivative."
  {:db/ident :odrl/derive,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Derive@en",
   :skos/definition
   #voc/lstr
    "To create a new derivative Asset from this Asset and to edit or modify the derivative.@en",
   :skos/note
   #voc/lstr
    "A new asset is created and may have significant overlaps with the original Asset. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective). To the derived Asset a next policy may be applied.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def device
  "An identified device used for exercising the action of the Rule."
  {:db/ident :odrl/device,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Device@en",
   :skos/definition
   #voc/lstr
    "An identified device used for exercising the action of the Rule.@en",
   :skos/exactMatch :odrl/systemDevice,
   :skos/note "See System Device."})

(def digitize
  "To produce a digital copy of (or otherwise digitize) the Asset from its analogue form."
  {:db/ident :odrl/digitize,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Digitize@en",
   :skos/definition
   #voc/lstr
    "To produce a digital copy of (or otherwise digitize) the Asset from its analogue form.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def display
  "To create a static and transient rendition of an Asset."
  {:db/ident :odrl/display,
   :odrl/includedIn :odrl/play,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Display@en",
   :skos/definition
   #voc/lstr "To create a static and transient rendition of an Asset.@en",
   :skos/note
   #voc/lstr
    "For example, displaying an image on a screen. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def distribute
  "To supply the Asset to third-parties."
  {:db/ident :odrl/distribute,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Distribute@en",
   :skos/definition #voc/lstr "To supply the Asset to third-parties.@en",
   :skos/note
   #voc/lstr
    "It is recommended to use nextPolicy to express the allowable usages by third-parties.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def duties
  "Duty"
  {:db/ident :odrl/duties,
   :rdf/type :skos/Collection,
   :skos/member
   [:odrl/remedy :odrl/consequence :odrl/duty :odrl/obligation :odrl/Duty],
   :skos/prefLabel #voc/lstr "Duty@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def duty
  "Relates an individual Duty to a Permission."
  {:db/ident :odrl/duty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Permission,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Has Duty@en",
   :rdfs/range :odrl/Duty,
   :rdfs/subPropertyOf :odrl/duty,
   :skos/definition #voc/lstr "Relates an individual Duty to a Permission.@en",
   :skos/note
   #voc/lstr
    "A Duty is a pre-condition which must be fulfilled in order to receive the Permission.@en"})

(def elapsedTime
  "A continuous elapsed time period which may be used for exercising of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."
  {:db/ident :odrl/elapsedTime,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Elapsed Time@en",
   :skos/definition
   #voc/lstr
    "A continuous elapsed time period which may be used for exercising of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].@en",
   :skos/note
   "Only the eq, lt, lteq operators SHOULD be used. See also Metered Time. <br />Example: <code>elpasedTime eq P60M</code> indicates a total elapsed time of 60 Minutes.",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def ensureExclusivity
  "To ensure that the Rule on the Asset is exclusive."
  {:db/ident :odrl/ensureExclusivity,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Ensure Exclusivity@en",
   :skos/definition #voc/lstr
                     "To ensure that the Rule on the Asset is exclusive.@en",
   :skos/note
   #voc/lstr
    "If used as a Duty, the assignee should be explicitly indicated as the party that is ensuring the exclusivity of the Rule.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def eq
  "Indicating that a given value equals the right operand of the Constraint."
  {:db/ident :odrl/eq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Equal to@en",
   :skos/definition
   #voc/lstr
    "Indicating that a given value equals the right operand of the Constraint.@en"})

(def event
  "An identified event setting a context for exercising the action of the Rule."
  {:db/ident :odrl/event,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Event@en",
   :skos/definition
   #voc/lstr
    "An identified event setting a context for exercising the action of the Rule.@en",
   :skos/note
   #voc/lstr
    "Events are temporal periods of time, and operators can be used to signal before (lt), during (eq) or after (gt) the event. <br />Example: May be taken during the “FIFA World Cup 2020” only.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def execute
  "To run the computer program Asset."
  {:db/ident :odrl/execute,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Execute@en",
   :skos/definition #voc/lstr "To run the computer program Asset.@en",
   :skos/note
   #voc/lstr
    "For example, machine executable code or Java such as a game or application.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def export
  "The act of transforming the asset into a new form."
  {:db/ident         :odrl/export,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Export@en",
   :skos/definition  #voc/lstr
                      "The act of transforming the asset into a new form.@en",
   :skos/exactMatch  :odrl/transform})

(def extract
  "To extract parts of the Asset and to use it as a new Asset."
  {:db/ident :odrl/extract,
   :odrl/includedIn :odrl/reproduce,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Extract@en",
   :skos/definition
   #voc/lstr "To extract parts of the Asset and to use it as a new Asset.@en",
   :skos/note
   #voc/lstr
    "A new asset is created and may have very little in common with the original Asset. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective). To the extracted Asset a next policy may be applied.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def extractChar
  "The act of extracting (replicating) unchanged characters from the asset."
  {:db/ident :odrl/extractChar,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Extract character@en",
   :skos/definition
   #voc/lstr
    "The act of extracting (replicating) unchanged characters from the asset.@en",
   :skos/note
   #voc/lstr
    "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-char .@en"})

(def extractPage
  "The act of extracting (replicating) unchanged pages from the asset."
  {:db/ident :odrl/extractPage,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Extract page@en",
   :skos/definition
   #voc/lstr
    "The act of extracting (replicating) unchanged pages from the asset.@en",
   :skos/note
   #voc/lstr
    "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-page .@en"})

(def extractWord
  "The act of extracting (replicating) unchanged words from the asset."
  {:db/ident :odrl/extractWord,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Extract word@en",
   :skos/definition
   #voc/lstr
    "The act of extracting (replicating) unchanged words from the asset.@en",
   :skos/note
   #voc/lstr
    "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-word .@en"})

(def failure
  "Failure is an abstract property that defines the violation (or unmet) relationship between Rules."
  {:db/ident :odrl/failure,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Rule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Failure@en",
   :rdfs/range :odrl/Rule,
   :rdfs/subPropertyOf :odrl/failure,
   :skos/definition
   #voc/lstr
    "Failure is an abstract property that defines the violation (or unmet) relationship between Rules.@en",
   :skos/note
   #voc/lstr
    "The parent property to sub-properties that express explicit failure contexts.@en"})

(def fileFormat
  "A transformed file format of the target Asset."
  {:db/ident :odrl/fileFormat,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "File Format@en",
   :skos/definition #voc/lstr
                     "A transformed file format of the target Asset.@en",
   :skos/note #voc/lstr
               "Example: An asset may be transformed into JPEG format.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def function
  "Function is an abstract property whose sub-properties define the functional roles which may be fulfilled by a party in relation to a Rule."
  {:db/ident :odrl/function,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Function@en",
   :rdfs/range :odrl/Party,
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition
   #voc/lstr
    "Function is an abstract property whose sub-properties define the functional roles which may be fulfilled by a party in relation to a Rule.@en"})

(def give
  "To transfer the ownership of the Asset to a third party without compensation and while deleting the original asset."
  {:db/ident :odrl/give,
   :odrl/includedIn :odrl/transfer,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Give@en",
   :skos/definition
   #voc/lstr
    "To transfer the ownership of the Asset to a third party without compensation and while deleting the original asset.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def grantUse
  "To grant the use of the Asset to third parties."
  {:db/ident :odrl/grantUse,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Grant Use@en",
   :skos/definition #voc/lstr
                     "To grant the use of the Asset to third parties.@en",
   :skos/note
   #voc/lstr
    "This action enables the assignee to create policies for the use of the Asset for third parties. The nextPolicy is recommended to be agreed with the third party. Use of temporal constraints is recommended.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def gt
  "Indicating that a given value is greater than the right operand of the Constraint."
  {:db/ident :odrl/gt,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Greater than@en",
   :skos/definition
   #voc/lstr
    "Indicating that a given value is greater than the right operand of the Constraint.@en"})

(def gteq
  "Indicating that a given value is greater than or equal to the right operand of the Constraint."
  {:db/ident :odrl/gteq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Greater than or equal to@en",
   :skos/definition
   #voc/lstr
    "Indicating that a given value is greater than or equal to the right operand of the Constraint.@en"})

(def hasPart
  "A set-based operator indicating that a given value contains the right operand of the Constraint."
  {:db/ident :odrl/hasPart,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Has part@en",
   :skos/definition
   #voc/lstr
    "A set-based operator indicating that a given value contains the right operand of the Constraint.@en"})

(def hasPolicy
  "Identifies an ODRL Policy for which the identified Asset is the target Asset to all the Rules."
  {:db/ident :odrl/hasPolicy,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Asset,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Target Policy@en",
   :rdfs/range :odrl/Policy,
   :rdfs/subPropertyOf :odrl/hasPolicy,
   :skos/definition
   #voc/lstr
    "Identifies an ODRL Policy for which the identified Asset is the target Asset to all the Rules.@en",
   :skos/note
   #voc/lstr
    "The Asset being identified MUST be inferred to be the target Asset of all of the Rules of the Policy.@en"})

(def ignore
  "The Action is to be ignored and is not part of the policy – and the policy remains valid."
  {:db/ident :odrl/ignore,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/UndefinedTerm :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Ignore Undefined Actions@en",
   :skos/definition
   #voc/lstr
    "The Action is to be ignored and is not part of the policy – and the policy remains valid.@en",
   :skos/note #voc/lstr
               "Used to support actions not known to the policy system.@en"})

(def implies
  "An Action asserts that another Action is not prohibited to enable its operational semantics."
  {:db/ident :odrl/implies,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Action,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Implies@en",
   :rdfs/range :odrl/Action,
   :rdfs/subPropertyOf :odrl/implies,
   :skos/definition
   #voc/lstr
    "An Action asserts that another Action is not prohibited to enable its operational semantics.@en",
   :skos/note
   #voc/lstr
    "The property asserts that an instance of Action entails that the other instance of Action is not prohibited.@en"})

(def include
  "To include other related assets in the Asset."
  {:db/ident :odrl/include,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Include@en",
   :skos/definition #voc/lstr
                     "To include other related assets in the Asset.@en",
   :skos/note
   #voc/lstr
    "For example: bio picture must be included in the attribution. Use of a relation sub-property is required for the related assets.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def includedIn
  "An Action transitively asserts that another Action that encompasses its operational semantics."
  {:db/ident :odrl/includedIn,
   :rdf/type
   [:owl/ObjectProperty :owl/TransitiveProperty :rdf/Property :skos/Concept],
   :rdfs/domain :odrl/Action,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Included In@en",
   :rdfs/range :odrl/Action,
   :rdfs/subPropertyOf :odrl/includedIn,
   :skos/definition
   #voc/lstr
    "An Action transitively asserts that another Action that encompasses its operational semantics.@en",
   :skos/note
   #voc/lstr
    "The purpose is to explicitly assert that the semantics of the referenced instance of an other Action encompasses (includes) the semantics of this instance of Action. The includedIn property is transitive, and as such, the Actions form ancestor relationships.@en"})

(def index
  "To record the Asset in an index."
  {:db/ident :odrl/index,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Index@en",
   :skos/definition #voc/lstr "To record the Asset in an index.@en",
   :skos/note
   #voc/lstr
    "For example, to include a link to the Asset in a search engine database.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def industry
  "A defined industry sector setting a context for exercising the action of the Rule."
  {:db/ident :odrl/industry,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Industry Context@en",
   :skos/definition
   #voc/lstr
    "A defined industry sector setting a context for exercising the action of the Rule.@en",
   :skos/note #voc/lstr "Example: publishing or financial industry.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def inform
  "To inform that an action has been performed on or in relation to the Asset."
  {:db/ident :odrl/inform,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Inform@en",
   :skos/definition
   #voc/lstr
    "To inform that an action has been performed on or in relation to the Asset.@en",
   :skos/note #voc/lstr
               "May link to a Party with the role 'informedParty' function.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def informedParty
  "The Party to be informed of all uses."
  {:db/ident           :odrl/informedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Informed Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/informedParty],
   :skos/definition    #voc/lstr "The Party to be informed of all uses.@en",
   :skos/note          #voc/lstr
                        "Maybe specified as part of the inform action.@en",
   :skos/scopeNote     #voc/lstr "Non-Normative@en"})

(def informingParty
  "The Party who provides the inform use data."
  {:db/ident           :odrl/informingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Informing Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/informingParty],
   :skos/definition    #voc/lstr
                        "The Party who provides the inform use data.@en",
   :skos/note          #voc/lstr
                        "Maybe specified as part of the inform action.@en",
   :skos/scopeNote     #voc/lstr "Non-Normative@en"})

(def inheritAllowed
  "Indicates if the Policy entity can be inherited."
  {:db/ident           :odrl/inheritAllowed,
   :owl/deprecated     true,
   :rdf/type           [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Inheritance Allowed@en",
   :rdfs/subPropertyOf :odrl/inheritAllowed,
   :skos/definition    #voc/lstr
                        "Indicates if the Policy entity can be inherited.@en",
   :skos/note          #voc/lstr "A boolean value.@en"})

(def inheritFrom
  "Relates a (child) policy to another (parent) policy from which terms are inherited."
  {:db/ident :odrl/inheritFrom,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Policy,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Inherits From@en",
   :rdfs/range :odrl/Policy,
   :rdfs/subPropertyOf :odrl/inheritFrom,
   :skos/definition
   #voc/lstr
    "Relates a (child) policy to another (parent) policy from which terms are inherited.@en",
   :skos/note #voc/lstr
               "The child policy will inherit Rules from the parent policy@en"})

(def inheritRelation
  "Indentifies the type of inheritance."
  {:db/ident :odrl/inheritRelation,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Inherit Relation@en",
   :rdfs/subPropertyOf :odrl/inheritRelation,
   :skos/definition #voc/lstr "Indentifies the type of inheritance.@en",
   :skos/note
   #voc/lstr
    "For example, this may indicate the business scenario, such as subscription, or prior arrangements between the parties (that are not machine representable).@en"})

(def install
  "To load the computer program Asset onto a storage device which allows operating or running the Asset."
  {:db/ident :odrl/install,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Install@en",
   :skos/definition
   #voc/lstr
    "To load the computer program Asset onto a storage device which allows operating or running the Asset.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def invalid
  "The policy is void."
  {:db/ident :odrl/invalid,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/ConflictTerm :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Void Policy@en",
   :skos/definition #voc/lstr "The policy is void.@en",
   :skos/note #voc/lstr
               "Used to indicate the policy is void for Conflict Strategy.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def isA
  "A set-based operator indicating that a given value is an instance of the right operand of the Constraint."
  {:db/ident :odrl/isA,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Is a@en",
   :skos/definition
   #voc/lstr
    "A set-based operator indicating that a given value is an instance of the right operand of the Constraint.@en"})

(def isAllOf
  "A set-based operator indicating that a given value is all of the right operand of the Constraint."
  {:db/ident :odrl/isAllOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Is all of@en",
   :skos/definition
   #voc/lstr
    "A set-based operator indicating that a given value is all of the right operand of the Constraint.@en"})

(def isAnyOf
  "A set-based operator indicating that a given value is any of the right operand of the Constraint."
  {:db/ident :odrl/isAnyOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Is any of@en",
   :skos/definition
   #voc/lstr
    "A set-based operator indicating that a given value is any of the right operand of the Constraint.@en"})

(def isNoneOf
  "A set-based operator indicating that a given value is none of the right operand of the Constraint."
  {:db/ident :odrl/isNoneOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Is none of@en",
   :skos/definition
   #voc/lstr
    "A set-based operator indicating that a given value is none of the right operand of the Constraint.@en"})

(def isPartOf
  "A set-based operator indicating that a given value is contained by the right operand of the Constraint."
  {:db/ident :odrl/isPartOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Is part of@en",
   :skos/definition
   #voc/lstr
    "A set-based operator indicating that a given value is contained by the right operand of the Constraint.@en"})

(def language
  "A natural language used by the target Asset."
  {:db/ident :odrl/language,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Language@en",
   :skos/definition #voc/lstr "A natural language used by the target Asset.@en",
   :skos/note
   #voc/lstr
    "Example: the asset can only be translated into Greek. Must use [[bcp47]] codes for language values.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def lease
  "The act of making available the asset to a third-party for a fixed period of time with exchange of value."
  {:db/ident :odrl/lease,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Lease@en",
   :skos/definition
   #voc/lstr
    "The act of making available the asset to a third-party for a fixed period of time with exchange of value.@en"})

(def leftOperand
  "The left operand in a constraint expression."
  {:db/ident           :odrl/leftOperand,
   :rdf/type           [:skos/Concept :rdf/Property],
   :rdfs/domain        :odrl/Constraint,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Has Left Operand@en",
   :rdfs/range         :odrl/LeftOperand,
   :rdfs/subPropertyOf :odrl/leftOperand,
   :skos/definition    #voc/lstr
                        "The left operand in a constraint expression.@en"})

(def lend
  "The act of making available the asset to a third-party for a fixed period of time without exchange of value."
  {:db/ident :odrl/lend,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Lend@en",
   :skos/definition
   #voc/lstr
    "The act of making available the asset to a third-party for a fixed period of time without exchange of value.@en"})

(def license
  "The act of granting the right to use the asset to a third-party."
  {:db/ident :odrl/license,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "License@en",
   :skos/definition
   #voc/lstr
    "The act of granting the right to use the asset to a third-party.@en",
   :skos/exactMatch :odrl/grantUse})

(def logicalConstraints
  "Logical Constraint"
  {:db/ident       :odrl/logicalConstraints,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/operand :odrl/LogicalConstraint],
   :skos/prefLabel #voc/lstr "Logical Constraint@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def lt
  "Indicating that a given value is less than the right operand of the Constraint."
  {:db/ident :odrl/lt,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Less than@en",
   :skos/definition
   #voc/lstr
    "Indicating that a given value is less than the right operand of the Constraint.@en"})

(def lteq
  "Indicating that a given value is less than or equal to the right operand of the Constraint."
  {:db/ident :odrl/lteq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Less than or equal to@en",
   :skos/definition
   #voc/lstr
    "Indicating that a given value is less than or equal to the right operand of the Constraint.@en"})

(def media
  "Category of a media asset setting a context for exercising the action of the Rule."
  {:db/ident :odrl/media,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Media Context@en",
   :skos/definition
   #voc/lstr
    "Category of a media asset setting a context for exercising the action of the Rule.@en",
   :skos/note
   #voc/lstr
    "Example media types: electronic, print, advertising, marketing. Note: The used type should not be an IANA MediaType as they are focused on technical characteristics. @en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def meteredTime
  "An accumulated amount of one to many metered time periods which were used for exercising the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."
  {:db/ident :odrl/meteredTime,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Metered Time@en",
   :skos/definition
   #voc/lstr
    "An accumulated amount of one to many metered time periods which were used for exercising the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].@en",
   :skos/note
   "Only the eq, lt, lteq operators SHOULD be used. See also Elapsed Time. <br />Example: <code>meteredTime lteq P60M</code> indicates an accumulated period of 60 Minutes or less.",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def modify
  "To change existing content of the Asset. A new asset is not created by this action."
  {:db/ident :odrl/modify,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Modify@en",
   :skos/definition
   #voc/lstr
    "To change existing content of the Asset. A new asset is not created by this action.@en",
   :skos/note
   #voc/lstr
    "This action will modify an asset which is typically updated from time to time without creating a new asset. If the result from modifying the asset should be a new asset the actions derive or extract should be used. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective).@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def move
  "To move the Asset from one digital location to another including deleting the original copy."
  {:db/ident :odrl/move,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Move@en",
   :skos/definition
   #voc/lstr
    "To move the Asset from one digital location to another including deleting the original copy.@en",
   :skos/note
   #voc/lstr
    "After the Asset has been moved, the original copy must be deleted.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def neq
  "Indicating that a given value is not equal to the right operand of the Constraint."
  {:db/ident :odrl/neq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Not equal to@en",
   :skos/definition
   #voc/lstr
    "Indicating that a given value is not equal to the right operand of the Constraint.@en"})

(def nextPolicy
  "To grant the specified Policy to a third party for their use of the Asset."
  {:db/ident :odrl/nextPolicy,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Next Policy@en",
   :skos/definition
   #voc/lstr
    "To grant the specified Policy to a third party for their use of the Asset.@en",
   :skos/note #voc/lstr "Useful for downstream policies.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def obligation
  "Relates an individual Duty to a Policy."
  {:db/ident :odrl/obligation,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Policy,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Obligation@en",
   :rdfs/range :odrl/Duty,
   :rdfs/subPropertyOf :odrl/obligation,
   :skos/definition #voc/lstr "Relates an individual Duty to a Policy.@en",
   :skos/note #voc/lstr
               "The Duty is a requirement which must be fulfilled.@en"})

(def obtainConsent
  "To obtain verifiable consent to perform the requested action in relation to the Asset."
  {:db/ident :odrl/obtainConsent,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Obtain Consent@en",
   :skos/definition
   #voc/lstr
    "To obtain verifiable consent to perform the requested action in relation to the Asset.@en",
   :skos/note
   #voc/lstr
    "May be used as a Duty to ensure that the Assigner or a Party is authorized to approve such actions on a case-by-case basis. May link to a Party with the role “consentingParty” function.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def operand
  "Operand is an abstract property for a logical relationship."
  {:db/ident :odrl/operand,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/LogicalConstraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Operand@en",
   :rdfs/subPropertyOf :odrl/operand,
   :skos/definition
   #voc/lstr "Operand is an abstract property for a logical relationship.@en",
   :skos/note
   #voc/lstr "Sub-properties of operand are used for Logical Constraints.@en"})

(def operator
  "The operator function applied to operands of a Constraint"
  {:db/ident :odrl/operator,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Has Operator@en",
   :rdfs/range :odrl/Operator,
   :rdfs/subPropertyOf :odrl/operator,
   :skos/definition
   #voc/lstr "The operator function applied to operands of a Constraint@en"})

(def or
  "The relation is satisfied when at least one of the Constraints is satisfied."
  {:db/ident :odrl/or,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Or@en",
   :rdfs/subPropertyOf [:odrl/operand :odrl/or],
   :skos/definition
   #voc/lstr
    "The relation is satisfied when at least one of the Constraints is satisfied.@en",
   :skos/note
   #voc/lstr
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances.@en"})

(def output
  "The output property specifies the Asset which is created from the output of the Action."
  {:db/ident :odrl/output,
   :rdf/type [:rdf/Property :skos/Concept :owl/ObjectProperty],
   :rdfs/domain :odrl/Rule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Output@en",
   :rdfs/range :odrl/Asset,
   :rdfs/subPropertyOf [:odrl/relation :odrl/output],
   :skos/definition
   #voc/lstr
    "The output property specifies the Asset which is created from the output of the Action.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def partOf
  "Identifies an Asset/PartyCollection that the Asset/Party is a member of."
  {:db/ident :odrl/partOf,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Asset :odrl/Party],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Part Of@en",
   :rdfs/range {:owl/unionOf [:odrl/AssetCollection :odrl/PartyCollection],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :odrl/partOf,
   :skos/definition
   #voc/lstr
    "Identifies an Asset/PartyCollection that the Asset/Party is a member of.@en"})

(def partyConcepts
  "Party"
  {:db/ident       :odrl/partyConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/PartyCollection :odrl/Party],
   :skos/prefLabel #voc/lstr "Party@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def partyRoles
  "Party Functions"
  {:db/ident       :odrl/partyRoles,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/assignerOf
                    :odrl/assigneeOf
                    :odrl/assigner
                    :odrl/assignee],
   :skos/prefLabel #voc/lstr "Party Functions@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def partyRolesCommon
  "Party Functions"
  {:db/ident       :odrl/partyRolesCommon,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/consentingParty
                    :odrl/contractingParty
                    :odrl/attributedParty
                    :odrl/compensatedParty
                    :odrl/informedParty
                    :odrl/trackingParty
                    :odrl/informingParty
                    :odrl/compensatingParty
                    :odrl/trackedParty
                    :odrl/contractedParty
                    :odrl/attributingParty
                    :odrl/consentedParty],
   :skos/prefLabel #voc/lstr "Party Functions@en",
   :skos/scopeNote #voc/lstr "ODRL Common Vocabulary Terms@en"})

(def pay
  "The act of paying a financial amount to a party for use of the asset."
  {:db/ident :odrl/pay,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Pay@en",
   :skos/definition
   #voc/lstr
    "The act of paying a financial amount to a party for use of the asset.@en",
   :skos/exactMatch :odrl/compensate})

(def payAmount
  "The amount of a financial payment. Right operand value MUST be an xsd:decimal."
  {:db/ident :odrl/payAmount,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Payment Amount@en",
   :skos/definition
   #voc/lstr
    "The amount of a financial payment. Right operand value MUST be an xsd:decimal. @en",
   :skos/note
   #voc/lstr
    "Can be used for compensation duties with the unit property indicating the currency of the payment.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def payeeParty
  "The Party is the recipient of the payment."
  {:db/ident           :odrl/payeeParty,
   :owl/deprecated     true,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Payee Party@en",
   :rdfs/subPropertyOf :odrl/payeeParty,
   :skos/definition    #voc/lstr
                        "The Party is the recipient of the payment.@en",
   :skos/exactMatch    :odrl/compensatedParty,
   :skos/scopeNote     #voc/lstr "Non-Normative@en"})

(def percentage
  "A percentage amount of the target Asset relevant for exercising the action of the Rule. Right operand value MUST be an xsd:decimal from 0 to 100."
  {:db/ident :odrl/percentage,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Asset Percentage@en",
   :skos/definition
   #voc/lstr
    "A percentage amount of the target Asset relevant for exercising the action of the Rule. Right operand value MUST be an xsd:decimal from 0 to 100.@en",
   :skos/note #voc/lstr "Example: Extract less than or equal to 50%.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def perm
  "Permissions take preference over prohibitions."
  {:db/ident         :odrl/perm,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/ConflictTerm
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Prefer Permissions@en",
   :skos/definition  #voc/lstr
                      "Permissions take preference over prohibitions.@en",
   :skos/note        #voc/lstr
                      "Used to determine policy conflict outcomes.@en"})

(def permission
  "Relates an individual Permission to a Policy."
  {:db/ident           :odrl/permission,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        :odrl/Policy,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Has Permission@en",
   :rdfs/range         :odrl/Permission,
   :rdfs/subPropertyOf :odrl/permission,
   :skos/definition    #voc/lstr
                        "Relates an individual Permission to a Policy.@en"})

(def permissions
  "Permission"
  {:db/ident       :odrl/permissions,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/permission :odrl/Permission],
   :skos/prefLabel #voc/lstr "Permission@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def play
  "To create a sequential and transient rendition of an Asset."
  {:db/ident :odrl/play,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Play@en",
   :skos/definition
   #voc/lstr "To create a sequential and transient rendition of an Asset.@en",
   :skos/note
   "For example, to play a video or audio track. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used.",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def policyConcepts
  "Policy"
  {:db/ident       :odrl/policyConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/inheritFrom :odrl/profile :odrl/uid :odrl/Policy],
   :skos/prefLabel #voc/lstr "Policy@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def policySubClasses
  "Policy Subclasses"
  {:db/ident       :odrl/policySubClasses,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/Set :odrl/Offer :odrl/Agreement],
   :skos/prefLabel #voc/lstr "Policy Subclasses@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def policySubClassesCommon
  "Policy Subclasses"
  {:db/ident       :odrl/policySubClassesCommon,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/Ticket :odrl/Request :odrl/Privacy :odrl/Assertion],
   :skos/prefLabel #voc/lstr "Policy Subclasses@en",
   :skos/scopeNote #voc/lstr "ODRL Common Vocabulary Terms@en"})

(def policyUsage
  "Indicates the actual datetime the action of the Rule was exercised."
  {:db/ident :odrl/policyUsage,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/RightOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Policy Rule Usage@en",
   :skos/definition
   #voc/lstr
    "Indicates the actual datetime the action of the Rule was exercised.@en",
   :skos/note
   #voc/lstr
    "This can be used to express constraints with a LeftOperand relative to the time the rule is exercised. Operators indicate before (lt, lteq), during (eq) or after (gt, gteq) the usage of the rule. <br />Example: <code>event lt policyUsage</code> expresses that the identified event must have happened before the action of the rule is exercised.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def present
  "To publicly perform the Asset."
  {:db/ident         :odrl/present,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Present@en",
   :skos/definition  #voc/lstr "To publicly perform the Asset.@en",
   :skos/note        "The asset can be performed (or communicated) in public.",
   :skos/scopeNote   #voc/lstr "Non-Normative@en"})

(def preview
  "The act of providing a short preview of the asset."
  {:db/ident         :odrl/preview,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Preview@en",
   :skos/definition  #voc/lstr
                      "The act of providing a short preview of the asset.@en",
   :skos/note        #voc/lstr
                      "Use a time constraint with the appropriate action.@en"})

(def print
  "To create a tangible and permanent rendition of an Asset."
  {:db/ident :odrl/print,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Print@en",
   :skos/definition
   #voc/lstr "To create a tangible and permanent rendition of an Asset.@en",
   :skos/note
   #voc/lstr
    "For example, creating a permanent, fixed (static), and directly perceivable representation of the Asset, such as printing onto paper.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def product
  "Category of product or service setting a context for exercising the action of the Rule."
  {:db/ident :odrl/product,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Product Context@en",
   :skos/definition
   #voc/lstr
    "Category of product or service setting a context for exercising the action of the Rule.@en",
   :skos/note #voc/lstr "Example: May only be used in the XYZ Magazine.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def profile
  "The identifier(s) of an ODRL Profile that the Policy conforms to."
  {:db/ident :odrl/profile,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Policy,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Profile@en",
   :rdfs/subPropertyOf :odrl/profile,
   :skos/definition
   #voc/lstr
    "The identifier(s) of an ODRL Profile that the Policy conforms to.@en",
   :skos/note
   #voc/lstr
    "The profile property is mandatory if the Policy is using an ODRL Profile.@en"})

(def prohibit
  "Prohibitions take preference over permissions."
  {:db/ident         :odrl/prohibit,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/ConflictTerm
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Prefer Prohibitions@en",
   :skos/definition  #voc/lstr
                      "Prohibitions take preference over permissions.@en",
   :skos/note        #voc/lstr
                      "Used to determine policy conflict outcomes.@en"})

(def prohibition
  "Relates an individual Prohibition to a Policy."
  {:db/ident           :odrl/prohibition,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        :odrl/Policy,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         #voc/lstr "Has Prohibition@en",
   :rdfs/range         :odrl/Prohibition,
   :rdfs/subPropertyOf :odrl/prohibition,
   :skos/definition    #voc/lstr
                        "Relates an individual Prohibition to a Policy.@en"})

(def prohibitions
  "Prohibition"
  {:db/ident       :odrl/prohibitions,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/prohibition :odrl/Prohibition],
   :skos/prefLabel #voc/lstr "Prohibition@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def proximity
  "An value indicating the closeness or nearness."
  {:db/ident :odrl/proximity,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "proximity@en",
   :rdfs/subPropertyOf :odrl/proximity,
   :skos/definition #voc/lstr
                     "An value indicating the closeness or nearness.@en",
   :skos/note
   #voc/lstr
    "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/proximity .@en"})

(def purpose
  "A defined purpose for exercising the action of the Rule."
  {:db/ident :odrl/purpose,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Purpose@en",
   :skos/definition
   #voc/lstr "A defined purpose for exercising the action of the Rule.@en",
   :skos/note #voc/lstr "Example: Educational use.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def read
  "To obtain data from the Asset."
  {:db/ident :odrl/read,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Read@en",
   :skos/definition #voc/lstr "To obtain data from the Asset.@en",
   :skos/note
   #voc/lstr
    "For example, the ability to read a record from a database (the Asset).@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def recipient
  "The party receiving the result/outcome of exercising the action of the Rule."
  {:db/ident :odrl/recipient,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Recipient@en",
   :skos/definition
   #voc/lstr
    "The party receiving the result/outcome of exercising the action of the Rule.@en",
   :skos/note
   #voc/lstr
    "The Right Operand must identify one or more specific Parties or category/ies of the Party.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def refinement
  "Constraint used to refine the semantics of an Action, or Party/Asset Collection"
  {:db/ident :odrl/refinement,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain
   {:owl/unionOf [:odrl/Action :odrl/AssetCollection :odrl/PartyCollection],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Refinement@en",
   :rdfs/range {:owl/unionOf [:odrl/Constraint :odrl/LogicalConstraint],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :odrl/refinement,
   :skos/definition
   #voc/lstr
    "Constraint used to refine the semantics of an Action, or Party/Asset Collection@en",
   :skos/note
   #voc/lstr
    "Example: the Action print is only permitted on 50% of the asset.@en"})

(def relation
  "Relation is an abstract property which creates an explicit link between an Action and an Asset."
  {:db/ident :odrl/relation,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Relation@en",
   :rdfs/range :odrl/Asset,
   :rdfs/subPropertyOf :odrl/relation,
   :skos/definition
   #voc/lstr
    "Relation is an abstract property which creates an explicit link between an Action and an Asset.@en",
   :skos/note
   #voc/lstr
    "Sub-properties of relation are used to define the nature of that link.@en"})

(def relativePosition
  "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset."
  {:db/ident :odrl/relativePosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Relative Asset Position@en",
   :skos/definition
   #voc/lstr
    "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset.@en",
   :skos/note
   #voc/lstr
    "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def relativeSize
  "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects - expressed as percentages of full values - of the target Asset."
  {:db/ident :odrl/relativeSize,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Relative Asset Size@en",
   :skos/definition
   #voc/lstr
    "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects - expressed as percentages of full values - of the target Asset.@en",
   :skos/note
   #voc/lstr
    "Example: The image can be resized in width to a maximum of 200%. Note: See the Left Operand absoluteSize. @en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def relativeSpatialPosition
  "The relative spatial positions - expressed as percentages of full values - of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space of the target Asset."
  {:db/ident :odrl/relativeSpatialPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Relative Spatial Asset Position@en",
   :skos/broaderTransitive :odrl/relativePosition,
   :skos/definition
   #voc/lstr
    "The relative spatial positions - expressed as percentages of full values - of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space of the target Asset.@en",
   :skos/note #voc/lstr "See also Absolute Spatial Asset Position.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def relativeTemporalPosition
  "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset."
  {:db/ident :odrl/relativeTemporalPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Relative Temporal Asset Position@en",
   :skos/broaderTransitive :odrl/relativePosition,
   :skos/definition
   #voc/lstr
    "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset.@en",
   :skos/note
   #voc/lstr
    "See also Absolute Temporal Asset Position. <br />Example: The MP3 music file must be positioned between the positions at 33% and 48% of the temporal length of a stream. @en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def remedy
  "Relates an individual remedy Duty to a Prohibition."
  {:db/ident :odrl/remedy,
   :rdf/type [:rdf/Property :owl/ObjectProperty :skos/Concept],
   :rdfs/domain :odrl/Prohibition,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Remedy@en",
   :rdfs/range :odrl/Duty,
   :rdfs/subPropertyOf [:odrl/failure :odrl/remedy],
   :skos/definition #voc/lstr
                     "Relates an individual remedy Duty to a Prohibition.@en",
   :skos/note
   #voc/lstr
    "The remedy property expresses an agreed Duty that must be fulfilled in case that a Prohibition has been violated by being exercised.@en"})

(def reproduce
  "To make duplicate copies the Asset in any material form."
  {:db/ident :odrl/reproduce,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Reproduce@en",
   :skos/definition
   #voc/lstr "To make duplicate copies the Asset in any material form.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def resolution
  "Resolution of the rendition of the target Asset."
  {:db/ident         :odrl/resolution,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/LeftOperand
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Rendition Resolution@en",
   :skos/definition  #voc/lstr
                      "Resolution of the rendition of the target Asset.@en",
   :skos/note        #voc/lstr
                      "Example: the image may be printed at 1200dpi.@en",
   :skos/scopeNote   #voc/lstr "Non-Normative@en"})

(def reviewPolicy
  "To review the Policy applicable to the Asset."
  {:db/ident :odrl/reviewPolicy,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Review Policy@en",
   :skos/definition #voc/lstr
                     "To review the Policy applicable to the Asset.@en",
   :skos/note
   #voc/lstr
    "Used when human intervention is required to review the Policy. May link to an Asset which represents the full Policy information.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def rightOperand
  "The value of the right operand in a constraint expression."
  {:db/ident :odrl/rightOperand,
   :rdf/type [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Has Right Operand@en",
   :rdfs/range {:owl/unionOf [:odrl/RightOperand :rdfs/Literal :xsd/anyURI],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :odrl/rightOperand,
   :skos/definition
   #voc/lstr "The value of the right operand in a constraint expression.@en",
   :skos/note
   #voc/lstr
    "When used with set-based operators, a list of values may be used.@en"})

(def rightOperandReference
  "A reference to a web resource providing the value for the right operand of a Constraint."
  {:db/ident :odrl/rightOperandReference,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Has Right Operand Reference@en",
   :rdfs/subPropertyOf :odrl/rightOperandReference,
   :skos/definition
   #voc/lstr
    "A reference to a web resource providing the value for the right operand of a Constraint.@en",
   :skos/note
   #voc/lstr
    "An IRI that MUST be dereferenced to obtain the actual right operand value. When used with set-based operators, a list of IRIs may be used@en"})

(def ruleConcepts
  "Rule"
  {:db/ident       :odrl/ruleConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/failure :odrl/function :odrl/relation :odrl/Rule],
   :skos/prefLabel #voc/lstr "Rule@en",
   :skos/scopeNote #voc/lstr "ODRL Core Vocabulary Terms@en"})

(def scope
  "The identifier of a scope that provides context to the extent of the entity."
  {:db/ident :odrl/scope,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Scope@en",
   :rdfs/subPropertyOf :odrl/scope,
   :skos/definition
   #voc/lstr
    "The identifier of a scope that provides context to the extent of the entity.@en",
   :skos/note #voc/lstr "Used to define scopes for Assets and Parties.@en"})

(def secondaryUse
  "The act of using the asset for a purpose other than the purpose it was intended for."
  {:db/ident :odrl/secondaryUse,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Secondary Use@en",
   :skos/definition
   #voc/lstr
    "The act of using the asset for a purpose other than the purpose it was intended for.@en"})

(def sell
  "To transfer the ownership of the Asset to a third party with compensation and while deleting the original asset."
  {:db/ident :odrl/sell,
   :odrl/includedIn :odrl/transfer,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Sell@en",
   :skos/definition
   #voc/lstr
    "To transfer the ownership of the Asset to a third party with compensation and while deleting the original asset.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def share
  "The act of the non-commercial reproduction and distribution of the asset to third-parties."
  {:db/ident :odrl/share,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Share@en",
   :skos/definition
   #voc/lstr
    "The act of the non-commercial reproduction and distribution of the asset to third-parties.@en",
   :skos/exactMatch :cc/Sharing})

(def shareAlike
  "The act of distributing any derivative asset under the same terms as the original asset."
  {:db/ident :odrl/shareAlike,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Share-alike@en",
   :skos/definition
   #voc/lstr
    "The act of distributing any derivative asset under the same terms as the original asset.@en",
   :skos/exactMatch :cc/ShareAlike})

(def source
  "Reference to a Asset/PartyCollection"
  {:db/ident :odrl/source,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/AssetCollection :odrl/PartyCollection],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Source@en",
   :rdfs/subPropertyOf :odrl/source,
   :skos/definition #voc/lstr "Reference to a Asset/PartyCollection@en",
   :skos/note
   #voc/lstr
    "Used by AssetCollection and PartyCollection when constraints are applied.@en"})

(def spatial
  "A named and identified geospatial area with defined borders which is used for exercising the action of the Rule. An IRI MUST be used to represent this value."
  {:db/ident :odrl/spatial,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Geospatial Named Area@en",
   :skos/definition
   #voc/lstr
    "A named and identified geospatial area with defined borders which is used for exercising the action of the Rule. An IRI MUST be used to represent this value.@en",
   :skos/note
   #voc/lstr
    "A code value for the area and source of the code must be presented in the Right Operand. <br />Example: the [[iso3166]] Country Codes or the Getty Thesaurus of Geographic Names. @en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def spatialCoordinates
  "A set of coordinates setting the borders of a geospatial area used for exercising the action of the Rule. The coordinates MUST include longitude and latitude, they MAY include altitude and the geodetic datum."
  {:db/ident :odrl/spatialCoordinates,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Geospatial Coordinates@en",
   :skos/broaderTransitive :odrl/spatial,
   :skos/definition
   #voc/lstr
    "A set of coordinates setting the borders of a geospatial area used for exercising the action of the Rule. The coordinates MUST include longitude and latitude, they MAY include altitude and the geodetic datum.@en",
   :skos/note
   #voc/lstr
    "The default values are the altitude of earth's surface at this location and the WGS 84 datum.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def status
  "the value generated from the leftOperand action or a value related to the leftOperand set as the reference for the comparison."
  {:db/ident :odrl/status,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Status@en",
   :rdfs/subPropertyOf :odrl/status,
   :skos/definition
   #voc/lstr
    "the value generated from the leftOperand action or a value related to the leftOperand set as the reference for the comparison.@en"})

(def stream
  "To deliver the Asset in real-time."
  {:db/ident :odrl/stream,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Stream@en",
   :skos/definition #voc/lstr "To deliver the Asset in real-time.@en",
   :skos/note
   "The Asset maybe utilised in real-time as it is being delivered. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used.",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def support
  "The Action is to be supported as part of the policy – and the policy remains valid."
  {:db/ident :odrl/support,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/UndefinedTerm :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Support Undefined Actions@en",
   :skos/definition
   #voc/lstr
    "The Action is to be supported as part of the policy – and the policy remains valid.@en",
   :skos/note #voc/lstr
               "Used to support actions not known to the policy system.@en"})

(def synchronize
  "To use the Asset in timed relations with media (audio/visual) elements of another Asset."
  {:db/ident :odrl/synchronize,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Synchronize@en",
   :skos/definition
   #voc/lstr
    "To use the Asset in timed relations with media (audio/visual) elements of another Asset.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def system
  "An identified computing system used for exercising the action of the Rule."
  {:db/ident :odrl/system,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "System@en",
   :skos/definition
   #voc/lstr
    "An identified computing system used for exercising the action of the Rule.@en",
   :skos/exactMatch :odrl/systemDevice,
   :skos/note "See System Device"})

(def systemDevice
  "An identified computing system or computing device used for exercising the action of the Rule."
  {:db/ident :odrl/systemDevice,
   :rdf/type
   [:skos/Concept :odrl/LeftOperand :owl/NamedIndividual :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "System Device@en",
   :skos/definition
   #voc/lstr
    "An identified computing system or computing device used for exercising the action of the Rule.@en",
   :skos/exactMatch [:odrl/system :odrl/device],
   :skos/note
   #voc/lstr
    "Example: The system device can be identified by a unique code created from the used hardware.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def target
  "The target property indicates the Asset that is the primary subject to which the Rule action directly applies."
  {:db/ident :odrl/target,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Target@en",
   :rdfs/range :odrl/Asset,
   :rdfs/subPropertyOf [:odrl/relation :odrl/target],
   :skos/definition
   #voc/lstr
    "The target property indicates the Asset that is the primary subject to which the Rule action directly applies.@en"})

(def textToSpeech
  "To have a text Asset read out loud."
  {:db/ident :odrl/textToSpeech,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Text-to-speech@en",
   :skos/definition #voc/lstr "To have a text Asset read out loud.@en",
   :skos/note
   "If the action is to be performed to a wider audience than just the Assignees, then the recipient constraint is recommended to be used.",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def timeInterval
  "A recurring period of time before the next execution of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."
  {:db/ident :odrl/timeInterval,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Recurring Time Interval@en",
   :skos/definition
   #voc/lstr
    "A recurring period of time before the next execution of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].@en",
   :skos/note
   "Only the eq operator SHOULD be used. <br />Example: <code>timeInterval eq P7D</code> indicates a recurring 7 day period.",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def timedCount
  "The number of seconds after which timed metering use of the asset begins."
  {:db/ident :odrl/timedCount,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Timed Count@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :odrl/timedCount,
   :skos/definition
   #voc/lstr
    "The number of seconds after which timed metering use of the asset begins.@en",
   :skos/note
   #voc/lstr
    "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/timed-count .@en"})

(def trackedParty
  "The Party whose usage is being tracked."
  {:db/ident :odrl/trackedParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Tracked Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/trackedParty],
   :skos/definition #voc/lstr "The Party whose usage is being tracked.@en",
   :skos/note #voc/lstr
               "May be specified as part of the acceptTracking action.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def trackingParty
  "The Party who is tracking usage."
  {:db/ident :odrl/trackingParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Tracking Party@en",
   :rdfs/subPropertyOf [:odrl/function :odrl/trackingParty],
   :skos/definition #voc/lstr "The Party who is tracking usage.@en",
   :skos/note #voc/lstr
               "May be specified as part of the acceptTracking action.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def transfer
  "To transfer the ownership of the Asset in perpetuity."
  {:db/ident :odrl/transfer,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Transfer Ownership@en",
   :skos/definition
   #voc/lstr "To transfer the ownership of the Asset in perpetuity.@en"})

(def transform
  "To convert the Asset into a different format."
  {:db/ident :odrl/transform,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Transform@en",
   :skos/definition #voc/lstr
                     "To convert the Asset into a different format.@en",
   :skos/note
   #voc/lstr
    "Typically used to convert the Asset into a different format for consumption on/transfer to a third party system.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def translate
  "To translate the original natural language of an Asset into another natural language."
  {:db/ident :odrl/translate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Translate@en",
   :skos/definition
   #voc/lstr
    "To translate the original natural language of an Asset into another natural language.@en",
   :skos/note #voc/lstr "A new derivative Asset is created by that action.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def uid
  "An unambiguous identifier"
  {:db/ident :odrl/uid,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Policy
                               :odrl/Asset
                               :odrl/Rule
                               :odrl/Party
                               :odrl/Constraint
                               :odrl/LogicalConstraint],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Unique Identifier@en",
   :rdfs/subPropertyOf :odrl/uid,
   :skos/definition #voc/lstr "An unambiguous identifier@en",
   :skos/note
   #voc/lstr
    "Used by the Policy, Rule, Asset, Party, Constraint, and Logical Constraint Classes.@en"})

(def undefined
  "Relates the strategy used for handling undefined actions to a Policy."
  {:db/ident :odrl/undefined,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Handle Undefined Term@en",
   :rdfs/range :odrl/UndefinedTerm,
   :rdfs/subPropertyOf :odrl/undefined,
   :skos/definition
   #voc/lstr
    "Relates the strategy used for handling undefined actions to a Policy.@en",
   :skos/note #voc/lstr
               "If no strategy is specified, the default is invalid.@en"})

(def uninstall
  "To unload and delete the computer program Asset from a storage device and disable its readiness for operation."
  {:db/ident :odrl/uninstall,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Uninstall@en",
   :skos/definition
   #voc/lstr
    "To unload and delete the computer program Asset from a storage device and disable its readiness for operation.@en",
   :skos/note
   #voc/lstr
    "The Asset is no longer accessible to the assignees after it has been used.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def unit
  "The unit of measurement of the value of the rightOperand or rightOperandReference of a Constraint."
  {:db/ident :odrl/unit,
   :rdf/type :rdf/Property,
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Unit@en",
   :rdfs/subPropertyOf :odrl/unit,
   :skos/definition
   #voc/lstr
    "The unit of measurement of the value of the rightOperand or rightOperandReference of a Constraint.@en"})

(def unitOfCount
  "The unit of measure used for counting the executions of the action of the Rule."
  {:db/ident :odrl/unitOfCount,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Unit Of Count@en",
   :skos/definition
   #voc/lstr
    "The unit of measure used for counting the executions of the action of the Rule.@en",
   :skos/note
   #voc/lstr
    "Note: Typically used with Duties to indicate the unit entity to be counted of the Action. <br />Example: A duty to compensate and a unitOfCount constraint of 'perUser' would indicate that the compensation by multiplied by the 'number of users'.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def use
  "To use the Asset"
  {:db/ident :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Use@en",
   :skos/definition #voc/lstr "To use the Asset@en",
   :skos/note
   #voc/lstr
    "Use is the most generic action for all non-third-party usage. More specific types of the use action can be expressed by more targetted actions.@en"})

(def version
  "The version of the target Asset."
  {:db/ident :odrl/version,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Version@en",
   :skos/definition #voc/lstr "The version of the target Asset.@en",
   :skos/note
   #voc/lstr
    "Example: Single Paperback or Multiple Issues or version 2.0 or higher.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def virtualLocation
  "An identified location of the IT communication space which is relevant for exercising the action of the Rule."
  {:db/ident :odrl/virtualLocation,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Virtual IT Communication Location@en",
   :skos/definition
   #voc/lstr
    "An identified location of the IT communication space which is relevant for exercising the action of the Rule.@en",
   :skos/note #voc/lstr "Example: an Internet domain or IP address range.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def watermark
  "To apply a watermark to the Asset."
  {:db/ident         :odrl/watermark,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Watermark@en",
   :skos/definition  #voc/lstr "To apply a watermark to the Asset.@en",
   :skos/scopeNote   #voc/lstr "Non-Normative@en"})

(def write
  "The act of writing to the Asset."
  {:db/ident         :odrl/write,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Write@en",
   :skos/definition  #voc/lstr "The act of writing to the Asset.@en",
   :skos/exactMatch  :odrl/modify})

(def writeTo
  "The act of adding data to the Asset."
  {:db/ident         :odrl/writeTo,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Write to@en",
   :skos/definition  #voc/lstr "The act of adding data to the Asset.@en",
   :skos/exactMatch  :odrl/modify})

(def xone
  "The relation is satisfied when only one, and not more, of the Constaints is satisfied"
  {:db/ident :odrl/xone,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Only One@en",
   :rdfs/subPropertyOf [:odrl/operand :odrl/xone],
   :skos/definition
   #voc/lstr
    "The relation is satisfied when only one, and not more, of the Constaints is satisfied@en",
   :skos/note
   #voc/lstr
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances.@en"})

(def ^{:private true} Attribution
  "Credit be given to copyright holder and/or author."
  {:db/ident         :cc/Attribution,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Attribution@en",
   :skos/definition  #voc/lstr
                      "Credit be given to copyright holder and/or author.@en",
   :skos/note        #voc/lstr "This term is defined by Creative Commons.@en",
   :skos/scopeNote   #voc/lstr "Non-Normative@en"})

(def ^{:private true} CommercialUse
  "Exercising rights for commercial purposes."
  {:db/ident         :cc/CommercialUse,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Commercial Use@en",
   :skos/definition  #voc/lstr "Exercising rights for commercial purposes.@en",
   :skos/note        #voc/lstr "This term is defined by Creative Commons.@en",
   :skos/scopeNote   #voc/lstr "Non-Normative@en"})

(def ^{:private true} DerivativeWorks
  "Distribution of derivative works."
  {:db/ident         :cc/DerivativeWorks,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Derivative Works@en",
   :skos/definition  #voc/lstr "Distribution of derivative works.@en",
   :skos/note        #voc/lstr "This term is defined by Creative Commons.@en",
   :skos/scopeNote   #voc/lstr "Non-Normative@en"})

(def ^{:private true} Distribution
  "Distribution, public display, and publicly performance."
  {:db/ident :cc/Distribution,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Distribution@en",
   :skos/definition
   #voc/lstr "Distribution, public display, and publicly performance.@en",
   :skos/note #voc/lstr "This term is defined by Creative Commons.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def ^{:private true} Notice
  "Copyright and license notices be kept intact."
  {:db/ident         :cc/Notice,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Notice@en",
   :skos/definition  #voc/lstr
                      "Copyright and license notices be kept intact.@en",
   :skos/note        #voc/lstr "This term is defined by Creative Commons.@en",
   :skos/scopeNote   #voc/lstr "Non-Normative@en"})

(def ^{:private true} Reproduction
  "Making multiple copies."
  {:db/ident         :cc/Reproduction,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       #voc/lstr "Reproduction@en",
   :skos/definition  #voc/lstr "Making multiple copies.@en",
   :skos/note        #voc/lstr "This term is defined by Creative Commons.@en",
   :skos/scopeNote   #voc/lstr "Non-Normative@en"})

(def ^{:private true} ShareAlike
  "Derivative works be licensed under the same terms or compatible terms as the original work."
  {:db/ident :cc/ShareAlike,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Share Alike@en",
   :skos/definition
   #voc/lstr
    "Derivative works be licensed under the same terms or compatible terms as the original work.@en",
   :skos/note #voc/lstr "This term is defined by Creative Commons.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def ^{:private true} Sharing
  "Permits commercial derivatives, but only non-commercial distribution."
  {:db/ident :cc/Sharing,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Sharing@en",
   :skos/definition
   #voc/lstr
    "Permits commercial derivatives, but only non-commercial distribution.@en",
   :skos/note #voc/lstr "This term is defined by Creative Commons.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def ^{:private true} SourceCode
  "Source code (the preferred form for making modifications) must be provided when exercising some rights granted by the license."
  {:db/ident :cc/SourceCode,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label #voc/lstr "Source Code@en",
   :skos/definition
   #voc/lstr
    "Source code (the preferred form for making modifications) must be provided when exercising some rights granted by the license.@en",
   :skos/note #voc/lstr "This term is defined by Creative Commons.@en",
   :skos/scopeNote #voc/lstr "Non-Normative@en"})

(def ^{:private true} Action
  {:db/ident        :schema/Action,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :schema/Action})

(def ^{:private true} Collection
  {:db/ident :skos/Collection,
   :rdf/type :owl/Class})

(def ^{:private true} Concept
  {:db/ident :skos/Concept,
   :rdf/type :owl/Class})

(def ^{:private true} ConceptScheme
  {:db/ident :skos/ConceptScheme,
   :rdf/type :owl/Class})

(def ^{:private true} broader
  {:db/ident :skos/broader,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} broaderTransitive
  {:db/ident :skos/broaderTransitive,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} definition
  {:db/ident :skos/definition,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} hasTopConcept
  {:db/ident :skos/hasTopConcept,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} member
  {:db/ident :skos/member,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} note
  {:db/ident :skos/note,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} prefLabel
  {:db/ident :skos/prefLabel,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} scopeNote
  {:db/ident :skos/scopeNote,
   :rdf/type :owl/AnnotationProperty})