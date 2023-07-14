(ns net.wikipunk.rdf.odrl
  "The ODRL Vocabulary and Expression defines a set of concepts and terms (the vocabulary) and encoding mechanism (the expression) for permissions and obligations statements describing digital content usage based on the ODRL Information Model."
  {:dcat/downloadURL "https://www.w3.org/ns/odrl/2/ODRL22.jsonld",
   :dcterms/contributor
   #xsd/string "W3C Permissions & Obligations Expression Working Group",
   :dcterms/creator [#xsd/string "Michael Steidl"
                     #xsd/string "Renato Iannella"
                     #xsd/string "Víctor Rodríguez-Doncel"
                     #xsd/string "Stuart Myles"],
   :dcterms/description
   #xsd/langString
    "The ODRL Vocabulary and Expression defines a set of concepts and terms (the vocabulary) and encoding mechanism (the expression) for permissions and obligations statements describing digital content usage based on the ODRL Information Model.@en",
   :dcterms/license
   {:rdfa/uri
    "https://www.w3.org/Consortium/Legal/2002/ipr-notice-20021231#Copyright/"},
   :owl/versionInfo #xsd/string "2.2",
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
   :rdfs/comment #xsd/langString
                  "This is the RDF ontology for ODRL Version 2.2.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/TR/odrl-vocab/"},
   :rdfs/label #xsd/langString "ODRL Version 2.2@en"}
  (:refer-clojure :exclude [and count derive or print read use]))

(def Action
  "Action"
  {:db/ident :odrl/Action,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Action@en",
   :rdfs/subClassOf [:rdfs/Resource :schema/Action],
   :skos/definition #xsd/langString "An operation on an Asset.@en",
   :skos/note
   #xsd/langString
    "Actions may be allowed by Permissions, disallowed by Prohibitions, or made mandatory by Duties.@en"})

(def Agreement
  "Agreement"
  {:db/ident :odrl/Agreement,
   :owl/disjointWith
   [:odrl/Assertion :odrl/Offer :odrl/Ticket :odrl/Privacy :odrl/Request],
   :rdf/type [:owl/Class :rdfs/Class :skos/Concept],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Agreement@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy],
   :skos/definition
   #xsd/langString
    "A Policy that grants the assignee a Rule over an Asset from an assigner.@en",
   :skos/note
   #xsd/langString
    "An Agreement Policy MUST contain at least one Permission or Prohibition rule, a Party with Assigner function, and a Party with Assignee function (in the same Permission or Prohibition). The Agreement Policy will grant the terms of the Policy from the Assigner to the Assignee.@en"})

(def All
  "All"
  {:db/ident :odrl/All,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "All@en",
   :skos/definition
   #xsd/langString
    "Specifies that the scope of the relationship is all of the collective individuals within a context.@en",
   :skos/note
   #xsd/langString
    "For example, may be used to indicate all the users of a specific social network the party is a member of. Note that “group” scope is also assumed.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def All2ndConnections
  "All Second-level Connections"
  {:db/ident :odrl/All2ndConnections,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "All Second-level Connections@en",
   :skos/definition
   #xsd/langString
    "Specifies that the scope of the relationship is all of the second-level connections to the Party.@en",
   :skos/note
   #xsd/langString
    "For example, may be used to indicate all “friends of friends” of the Party. Note that “group” scope is also assumed.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def AllConnections
  "All First-Level Connections"
  {:db/ident :odrl/AllConnections,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "All First-Level Connections@en",
   :skos/definition
   #xsd/langString
    "Specifies that the scope of the relationship is all of the first-level connections of the Party.@en",
   :skos/note
   #xsd/langString
    "For example, may be used to indicate all “friends” of the Party. Note that “group” scope is also assumed.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def AllGroups
  "All Group Connections"
  {:db/ident :odrl/AllGroups,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "All Group Connections@en",
   :skos/definition
   #xsd/langString
    "Specifies that the scope of the relationship is all of the group connections of the Party.@en",
   :skos/note
   #xsd/langString
    "For example, may be used to indicate all groups that the Party is a member of. Note that “group” scope is also assumed.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def Assertion
  "Assertion"
  {:db/ident :odrl/Assertion,
   :owl/disjointWith [:odrl/Offer :odrl/Privacy :odrl/Request :odrl/Ticket],
   :rdf/type [:rdfs/Class :owl/Class :skos/Concept],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Assertion@en",
   :rdfs/subClassOf [:odrl/Policy :rdfs/Resource],
   :skos/definition
   #xsd/langString
    "A Policy that asserts a Rule over an Asset from parties.@en",
   :skos/note
   #xsd/langString
    "For example, a party (an assignee or assigner) can claim what terms they have over an Asset. An Assertion Policy does not grant such permissions/prohibitions but only asserts the parties claims. An Assetion Policy  MUST contain a target Asset, a Party with any functional role, and at least one of a Permission or Prohibition rule.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def Asset
  "Asset"
  {:db/ident :odrl/Asset,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Asset@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "A resource or a collection of resources that are the subject of a Rule.@en",
   :skos/note
   #xsd/langString
    "The Asset entity can be any form of identifiable resource, such as data/information, content/media, applications, or services. Furthermore, it can be used to represent other Asset entities that are needed to undertake the Policy expression, such as with the Duty entity. To describe more details about the Asset, it is recommended to use Dublin Core [[dcterms]] elements or other content metadata.@en"})

(def AssetCollection
  "Asset Collection"
  {:db/ident         :odrl/AssetCollection,
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Asset Collection@en",
   :rdfs/subClassOf  [:rdfs/Resource :odrl/Asset],
   :skos/definition  #xsd/langString
                      "An Asset that is collection of individual resources@en"})

(def AssetScope
  "Asset Scope"
  {:db/ident :odrl/AssetScope,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Asset Scope@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition #xsd/langString "Scopes for Asset Scope expressions.@en",
   :skos/note
   #xsd/langString
    "Instances of the AssetScope class represent the terms for the scope property of Assets.@en"})

(def ConflictTerm
  "Conflict Strategy Preference"
  {:db/ident :odrl/ConflictTerm,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Conflict Strategy Preference@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "Used to establish strategies to resolve conflicts that arise from the merging of Policies or conflicts between Permissions and Prohibitions in the same Policy.@en",
   :skos/note
   #xsd/langString
    "Instances of ConflictTerm describe strategies for resolving conflicts.@en"})

(def Constraint
  "Constraint"
  {:db/ident :odrl/Constraint,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Constraint@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "A boolean expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule.@en"})

(def Duty
  "Duty"
  {:db/ident         :odrl/Duty,
   :owl/disjointWith [:odrl/Permission :odrl/Prohibition],
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Duty@en",
   :rdfs/subClassOf  [:odrl/Rule :rdfs/Resource],
   :skos/definition  #xsd/langString "The obligation to perform an Action@en"})

(def Group
  "Group"
  {:db/ident :odrl/Group,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Group@en",
   :skos/definition
   #xsd/langString
    "Specifies that the scope of the relationship is the defined group with multiple individual members.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def Individual
  "Individual"
  {:db/ident :odrl/Individual,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Individual@en",
   :skos/definition
   #xsd/langString
    "Specifies that the scope of the relationship is the single Party individual.@en"})

(def LeftOperand
  "Left Operand"
  {:db/ident :odrl/LeftOperand,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Left Operand@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition #xsd/langString
                     "Left operand for a constraint expression.@en",
   :skos/note
   #xsd/langString
    "Instances of the LeftOperand class are used as the leftOperand of a Constraint.@en"})

(def LogicalConstraint
  "Logical Constraint"
  {:db/ident :odrl/LogicalConstraint,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Logical Constraint@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "A logical expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule.@en"})

(def Offer
  "Offer"
  {:db/ident :odrl/Offer,
   :owl/disjointWith
   [:odrl/Agreement :odrl/Privacy :odrl/Ticket :odrl/Request :odrl/Assertion],
   :rdf/type [:skos/Concept :rdfs/Class :owl/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Offer@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy],
   :skos/definition
   #xsd/langString
    "A Policy that proposes a Rule over an Asset from an assigner.@en",
   :skos/note
   #xsd/langString
    "An Offer Policy MUST contain at least one Permission or Prohibition rule and a Party with Assigner function (in the same Permission or Prohibition). The Offer Policy MAY contain a Party with Assignee function, but MUST not grant any privileges to that Party.@en"})

(def Operator
  "Operator"
  {:db/ident :odrl/Operator,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Operator@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition #xsd/langString "Operator for constraint expression.@en",
   :skos/note
   #xsd/langString
    "Instances of the Operator class representing relational operators.@en"})

(def Party
  "Party"
  {:db/ident :odrl/Party,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Party@en",
   :rdfs/subClassOf [:rdfs/Resource
                     {:owl/unionOf [:schema/Person
                                    :schema/Organization
                                    :foaf/Person
                                    :foaf/Organization
                                    :foaf/Agent
                                    :vcard/Individual
                                    :vcard/Organization
                                    :vcard/Agent],
                      :rdf/type    :owl/Class}],
   :skos/definition
   #xsd/langString
    "An entity or a collection of entities that undertake Roles in a Rule.@en",
   :skos/note
   #xsd/langString
    "The Party entity could be a person, group of people, organisation, or agent. An agent is a person or thing that takes an active role or produces a specified effect. To describe more details about the Party, it is recommended to use W3C vCard Ontology [[vcard-rdf]] or FOAF Vocabulary [[foaf]].@en"})

(def PartyCollection
  "Party Collection"
  {:db/ident         :odrl/PartyCollection,
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Party Collection@en",
   :rdfs/subClassOf  [:odrl/Party
                      {:owl/unionOf [:schema/Person
                                     :schema/Organization
                                     :foaf/Person
                                     :foaf/Organization
                                     :foaf/Agent
                                     :vcard/Individual
                                     :vcard/Organization
                                     :vcard/Agent],
                       :rdf/type    :owl/Class}
                      :rdfs/Resource],
   :skos/definition  #xsd/langString
                      "A Party that is a group of individual entities@en"})

(def PartyScope
  "Party Scope"
  {:db/ident :odrl/PartyScope,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Party Scope@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition #xsd/langString "Scopes for Party Scope expressions.@en",
   :skos/note
   #xsd/langString
    "Instances of the PartyScope class represent the terms for the scope property of Parties.@en"})

(def Permission
  "Permission"
  {:db/ident         :odrl/Permission,
   :owl/disjointWith [:odrl/Duty :odrl/Prohibition],
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Permission@en",
   :rdfs/subClassOf  [:odrl/Rule :rdfs/Resource],
   :skos/definition  #xsd/langString
                      "The ability to perform an Action over an Asset.@en"})

(def Policy
  "Policy"
  {:db/ident :odrl/Policy,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Policy@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition #xsd/langString
                     "A non-empty group of Permissions and/or Prohibitions.@en",
   :skos/note #xsd/langString "A Policy may contain multiple Rules.@en"})

(def Privacy
  "Privacy Policy"
  {:db/ident :odrl/Privacy,
   :owl/disjointWith
   [:odrl/Assertion :odrl/Ticket :odrl/Offer :odrl/Agreement :odrl/Request],
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Privacy Policy@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy],
   :skos/definition
   #xsd/langString
    "A Policy that expresses a Rule over an Asset containing personal information.@en",
   :skos/note
   #xsd/langString
    "A Privacy Policy  MUST contain a target Asset, a Party with Assigner  is, a Party with Assignee function, and at least one of a Permission or Prohibition rule that MUST include a Duty. The target Asset SHOULD contain or relate to personal information about the Assignee. The Duty MUST describe obligations on the Assigner about managing the Asset. The Assignee is being granted the terms of the Privacy policy from the Assigner.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def Prohibition
  "Prohibition"
  {:db/ident         :odrl/Prohibition,
   :owl/disjointWith [:odrl/Permission :odrl/Duty],
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Prohibition@en",
   :rdfs/subClassOf  [:rdfs/Resource :odrl/Rule],
   :skos/definition  #xsd/langString
                      "The inability to perform an Action over an Asset.@en"})

(def Request
  "Request"
  {:db/ident :odrl/Request,
   :owl/disjointWith
   [:odrl/Assertion :odrl/Agreement :odrl/Privacy :odrl/Ticket :odrl/Offer],
   :rdf/type [:skos/Concept :rdfs/Class :owl/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Request@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy],
   :skos/definition
   #xsd/langString
    "A Policy that proposes a Rule over an Asset from an assignee.@en",
   :skos/note
   #xsd/langString
    "A Request Policy  MUST contain a target Asset, a Party with Assignee function, and at least one of a Permission or Prohibition rule. The Request MAY also contain the Party with Assigner function if this is known. No privileges are granted to any Party.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def RightOperand
  "Right Operand"
  {:db/ident :odrl/RightOperand,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Right Operand@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition #xsd/langString
                     "Right operand for constraint expression.@en",
   :skos/note
   #xsd/langString
    "Instances of the RightOperand class are used as the rightOperand of a Constraint.@en"})

(def Rule
  "Rule"
  {:db/ident :odrl/Rule,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Rule@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "An abstract concept that represents the common characteristics of Permissions, Prohibitions, and Duties.@en",
   :skos/note #xsd/langString "Rule is an abstract concept.@en"})

(def Set
  "Set"
  {:db/ident :odrl/Set,
   :owl/disjointWith [:odrl/Ticket
                      :odrl/Offer
                      :odrl/Assertion
                      :odrl/Agreement
                      :odrl/Request
                      :odrl/Privacy],
   :rdf/type [:owl/Class :rdfs/Class :skos/Concept],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Set@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy],
   :skos/definition #xsd/langString
                     "A Policy that expresses a Rule over an Asset.@en",
   :skos/note
   #xsd/langString
    "A Set Policy MUST contain a target Asset, and at least one Rule. A Set Policy is the default Policy subclass. The Set is aimed at scenarios where there is an open criteria for the semantics of the policy expressions and typically refined by other systems/profiles that process the information at a later time. No privileges are granted to any Party (if defined).@en"})

(def Ticket
  "Ticket"
  {:db/ident :odrl/Ticket,
   :owl/disjointWith
   [:odrl/Agreement :odrl/Privacy :odrl/Request :odrl/Offer :odrl/Assertion],
   :rdf/type [:owl/Class :rdfs/Class :skos/Concept],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Ticket@en",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy],
   :skos/definition
   #xsd/langString
    "A Policy that grants the holder a Rule over an Asset from an assigner.@en",
   :skos/note
   #xsd/langString
    "A Ticket Policy MUST contain a target Asset and at least one of a Permission or Prohibition rule.  The Ticket MAY contain the Party with Assigner function and MUST NOT contain an Assignee. The Ticket Policy will grant the terms of the Policy to the holder of that Ticket. The holder of the Ticket MAY remain unknown or MAY have to be identified at some later stage.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def UndefinedTerm
  "Undefined Term"
  {:db/ident :odrl/UndefinedTerm,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Undefined Term@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "Is used to indicate how to support Actions that are not part of any vocabulary or profile in the policy expression system.@en",
   :skos/note
   #xsd/langString
    "Instances of UndefinedTerm describe strategies for processing unsupported actions.@en"})

(def absolutePosition
  "Absolute Asset Position"
  {:db/ident :odrl/absolutePosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Absolute Asset Position@en",
   :skos/definition
   #xsd/langString
    "A point in space or time defined with absolute coordinates for the positioning of the target Asset.@en",
   :skos/note
   #xsd/langString
    "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def absoluteSize
  "Absolute Asset Size"
  {:db/ident :odrl/absoluteSize,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Absolute Asset Size@en",
   :skos/definition
   #xsd/langString
    "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects of the target Asset.@en",
   :skos/note
   #xsd/langString
    "Example: The image can be resized in width to a maximum of 1000px.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def absoluteSpatialPosition
  "Absolute Spatial Asset Position"
  {:db/ident :odrl/absoluteSpatialPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Absolute Spatial Asset Position@en",
   :skos/broaderTransitive :odrl/absolutePosition,
   :skos/definition
   #xsd/langString
    "The absolute spatial positions of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space for the target Asset to fit.@en",
   :skos/note
   #xsd/langString
    "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it. Note: see also the Left Operand Relative Spatial Asset Position. @en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def absoluteTemporalPosition
  "Absolute Temporal Asset Position"
  {:db/ident :odrl/absoluteTemporalPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Absolute Temporal Asset Position@en",
   :skos/broaderTransitive :odrl/absolutePosition,
   :skos/definition
   #xsd/langString
    "The absolute temporal positions in a media stream the target Asset has to fit.@en",
   :skos/note
   #xsd/langString
    "Use with Actions including the target Asset in a larger media stream. The fragment part of a Media Fragment URI (https://www.w3.org/TR/media-frags/) may be used for the right operand. See the Left Operand realativeTemporalPosition. <br />Example: The MP3 music file must be positioned between second 192 and 250 of the temporal length of a stream.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def acceptTracking
  "Accept Tracking"
  {:db/ident :odrl/acceptTracking,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Accept Tracking@en",
   :skos/definition #xsd/langString
                     "To accept that the use of the Asset may be tracked.@en",
   :skos/note
   #xsd/langString
    "The collected information may be tracked by the Assigner, or may link to a Party with the role 'trackingParty' function.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def action
  "Has Action"
  {:db/ident :odrl/action,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Has Action@en",
   :rdfs/range :odrl/Action,
   :skos/definition
   #xsd/langString
    "The operation relating to the Asset for which the Rule is being subjected.@en"})

(def actionConcepts
  "Action"
  {:db/ident       :odrl/actionConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/implies :odrl/includedIn :odrl/action :odrl/Action],
   :skos/prefLabel #xsd/langString "Action@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def actions
  "Actions for Rules"
  {:db/ident       :odrl/actions,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/transfer :odrl/use],
   :skos/prefLabel #xsd/langString "Actions for Rules@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

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
   :skos/prefLabel #xsd/langString "Actions for Rules@en",
   :skos/scopeNote #xsd/langString "ODRL Common Vocabulary Terms@en"})

(def adHocShare
  "Ad-hoc sharing"
  {:db/ident :odrl/adHocShare,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Ad-hoc sharing@en",
   :skos/definition
   #xsd/langString
    "The act of sharing the asset to parties in close proximity to the owner.@en",
   :skos/note
   #xsd/langString
    "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/adhoc-share .@en"})

(def aggregate
  "Aggregate"
  {:db/ident :odrl/aggregate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Aggregate@en",
   :skos/definition
   #xsd/langString
    "To use the Asset or parts of it as part of a composite collection.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def and
  "And"
  {:db/ident :odrl/and,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "And@en",
   :rdfs/subPropertyOf :odrl/operand,
   :skos/definition
   #xsd/langString
    "The relation is satisfied when all of the Constraints are satisfied.@en",
   :skos/note
   #xsd/langString
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances.@en"})

(def andSequence
  "And Sequence"
  {:db/ident :odrl/andSequence,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "And Sequence@en",
   :rdfs/subPropertyOf :odrl/operand,
   :skos/definition
   #xsd/langString
    "The relation is satisfied when each of the Constraints are satisfied in the order specified.@en",
   :skos/note
   #xsd/langString
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances. The order of the list MUST be preserved. The andSequence operator is an example where there may be temporal conditional requirements between the operands. This may lead to situations where the outcome is unresolvable, such as deadlock if one of the Constraints is unable to be satisfied. ODRL Processing systems SHOULD plan for these scenarios and implement mechanisms to resolve them.@en"})

(def annotate
  "Annotate"
  {:db/ident :odrl/annotate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Annotate@en",
   :skos/definition
   #xsd/langString
    "To add explanatory notations/commentaries to the Asset without modifying the Asset in any other way.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def anonymize
  "Anonymize"
  {:db/ident :odrl/anonymize,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Anonymize@en",
   :skos/definition #xsd/langString
                     "To anonymize all or parts of the Asset.@en",
   :skos/note
   #xsd/langString
    "For example, to remove identifying particulars for statistical or for other comparable purposes, or to use the Asset without stating the author/source.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def append
  "Append"
  {:db/ident         :odrl/append,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Append@en",
   :skos/definition  #xsd/langString
                      "The act of adding to the end of an asset.@en",
   :skos/exactMatch  :odrl/modify})

(def appendTo
  "Append To"
  {:db/ident :odrl/appendTo,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Append To@en",
   :skos/definition
   #xsd/langString
    "The act of appending data to the Asset without modifying the Asset in any other way.@en",
   :skos/exactMatch :odrl/modify})

(def archive
  "Archive"
  {:db/ident :odrl/archive,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Archive@en",
   :skos/definition #xsd/langString
                     "To store the Asset (in a non-transient form).@en",
   :skos/note #xsd/langString
               "Temporal constraints may be used for temporal conditions.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def assetConcepts
  "Asset"
  {:db/ident       :odrl/assetConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/AssetCollection :odrl/Asset],
   :skos/prefLabel #xsd/langString "Asset@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def assetParty
  "Asset and Party"
  {:db/ident       :odrl/assetParty,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/source :odrl/partOf],
   :skos/prefLabel #xsd/langString "Asset and Party@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def assetRelations
  "Asset Relations"
  {:db/ident       :odrl/assetRelations,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/hasPolicy :odrl/target],
   :skos/prefLabel #xsd/langString "Asset Relations@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def assetRelationsCommon
  "Asset Relations"
  {:db/ident       :odrl/assetRelationsCommon,
   :rdf/type       :skos/Collection,
   :skos/member    :odrl/output,
   :skos/prefLabel #xsd/langString "Asset Relations@en",
   :skos/scopeNote #xsd/langString "ODRL Common Vocabulary Terms@en"})

(def assignee
  "Assignee"
  {:db/ident           :odrl/assignee,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        {:owl/unionOf [:odrl/Rule :odrl/Policy],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         #xsd/langString "Assignee@en",
   :rdfs/range         :odrl/Party,
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    #xsd/langString
                        "The Party is the recipient of the Rule.@en"})

(def assigneeOf
  "Assignee Of"
  {:db/ident :odrl/assigneeOf,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Party,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Assignee Of@en",
   :rdfs/range :odrl/Policy,
   :skos/definition
   #xsd/langString
    "Identifies an ODRL Policy for which the identified Party undertakes the assignee functional role.@en",
   :skos/note
   #xsd/langString
    "When assigneeOf has been asserted between a metadata expression and an ODRL Policy, the Party being identified MUST be inferred to undertake the assignee functional role of all the Rules of that Policy.@en"})

(def assigner
  "Assigner"
  {:db/ident           :odrl/assigner,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        {:owl/unionOf [:odrl/Rule :odrl/Policy],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         #xsd/langString "Assigner@en",
   :rdfs/range         :odrl/Party,
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    #xsd/langString
                        "The Party is the issuer of the Rule.@en"})

(def assignerOf
  "Assigner Of"
  {:db/ident :odrl/assignerOf,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Party,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Assigner Of@en",
   :rdfs/range :odrl/Policy,
   :skos/definition
   #xsd/langString
    "Identifies an ODRL Policy for which the identified Party undertakes the assigner functional role.@en",
   :skos/note
   #xsd/langString
    "When assignerOf has been asserted between a metadata expression and an ODRL Policy, the Party being identified MUST be inferred to undertake the assigner functional role of all the Rules of that Policy.@en"})

(def attachPolicy
  "Attach policy"
  {:db/ident         :odrl/attachPolicy,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Attach policy@en",
   :skos/definition  #xsd/langString
                      "The act of keeping the policy notice with the asset.@en",
   :skos/exactMatch  :cc/Notice})

(def attachSource
  "Attach source"
  {:db/ident :odrl/attachSource,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Attach source@en",
   :skos/definition
   #xsd/langString
    "The act of attaching the source of the asset and its derivatives.@en",
   :skos/exactMatch :cc/SourceCode})

(def attribute
  "Attribute"
  {:db/ident :odrl/attribute,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Attribute@en",
   :skos/definition #xsd/langString "To attribute the use of the Asset.@en",
   :skos/note
   #xsd/langString
    "May link to an Asset with the attribution information. May link to a Party with the  role “attributedParty” function.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def attributedParty
  "Attributed Party"
  {:db/ident           :odrl/attributedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         #xsd/langString "Attributed Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    #xsd/langString "The Party to be attributed.@en",
   :skos/note          #xsd/langString
                        "Maybe specified as part of the attribute action.@en",
   :skos/scopeNote     #xsd/langString "Non-Normative@en"})

(def attributingParty
  "Attributing Party"
  {:db/ident           :odrl/attributingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         #xsd/langString "Attributing Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    #xsd/langString
                        "The Party who undertakes the attribution.@en",
   :skos/note          #xsd/langString
                        "Maybe specified as part of the attribute action.@en",
   :skos/scopeNote     #xsd/langString "Non-Normative@en"})

(def commercialize
  "Commercialize"
  {:db/ident :odrl/commercialize,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Commercialize@en",
   :skos/definition #xsd/langString
                     "The act of using the asset in a business environment.@en",
   :skos/exactMatch :cc/CommercialUse})

(def compensate
  "Compensate"
  {:db/ident :odrl/compensate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Compensate@en",
   :skos/definition
   #xsd/langString
    "To compensate by transfer of some amount of value, if defined, for using or selling the Asset.@en",
   :skos/note
   #xsd/langString
    "The compensation may use different types of things with a value: (i) the thing is expressed by the value (term) of the Constraint name; (b) the value is expressed by operator, rightOperand, dataType and unit. Typically the assignee will compensate the assigner, but other compensation party roles may be used.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def compensatedParty
  "Compensated Party"
  {:db/ident :odrl/compensatedParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Compensated Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition #xsd/langString
                     "The Party is the recipient of the compensation.@en",
   :skos/note #xsd/langString
               "Maybe specified as part of the compensate duty action.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def compensatingParty
  "Compensating Party"
  {:db/ident :odrl/compensatingParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Compensating Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition #xsd/langString
                     "The Party that is the provider of the compensation.@en",
   :skos/note #xsd/langString
               "Maybe specified as part of the compensate duty action.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def concurrentUse
  "Concurrent Use"
  {:db/ident :odrl/concurrentUse,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Concurrent Use@en",
   :skos/definition
   #xsd/langString
    "To create multiple copies of the Asset that are being concurrently used.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def conflict
  "Handle Policy Conflicts"
  {:db/ident :odrl/conflict,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Handle Policy Conflicts@en",
   :rdfs/range :odrl/ConflictTerm,
   :skos/definition #xsd/langString
                     "The conflict-resolution strategy for a Policy.@en",
   :skos/note #xsd/langString
               "If no strategy is specified, the default is invalid.@en"})

(def conflictConcepts
  "Policy Conflict Strategy"
  {:db/ident :odrl/conflictConcepts,
   :rdf/type :skos/Collection,
   :skos/member
   [:odrl/invalid :odrl/prohibit :odrl/perm :odrl/conflict :odrl/ConflictTerm],
   :skos/prefLabel #xsd/langString "Policy Conflict Strategy@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def consentedParty
  "Consented Party"
  {:db/ident :odrl/consentedParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Consented Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition #xsd/langString "The Party who obtains the consent.@en",
   :skos/note #xsd/langString
               "Maybe specified as part of the obtainConsent action.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def consentingParty
  "Consenting Party"
  {:db/ident :odrl/consentingParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Consenting Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition #xsd/langString "The Party to obtain consent from.@en",
   :skos/note #xsd/langString
               "Maybe specified as part of the obtainConsent action.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def consequence
  "Consequence"
  {:db/ident :odrl/consequence,
   :rdf/type [:skos/Concept :rdf/Property :owl/ObjectProperty],
   :rdfs/domain :odrl/Duty,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Consequence@en",
   :rdfs/range :odrl/Duty,
   :rdfs/subPropertyOf :odrl/failure,
   :skos/definition
   #xsd/langString
    "Relates a Duty to another Duty, the latter being a consequence of not fulfilling the former.@en",
   :skos/note
   #xsd/langString
    "The consequence property is utilised to express the repercussions of not fulfilling an agreed Policy obligation or duty for a Permission. If either of these fails to be fulfilled, then this will result in the consequence Duty also becoming a new requirement, meaning that the original obligation or duty, as well as the consequence Duty must all be fulfilled@en"})

(def constraint
  "Has Constraint"
  {:db/ident :odrl/constraint,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Policy :odrl/Rule],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Has Constraint@en",
   :rdfs/range {:owl/unionOf [:odrl/Constraint :odrl/LogicalConstraint],
                :rdf/type    :owl/Class},
   :skos/definition #xsd/langString "Constraint applied to a Rule@en",
   :skos/note
   #xsd/langString
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
   :skos/prefLabel #xsd/langString "Constraint Left Operands@en",
   :skos/scopeNote #xsd/langString "ODRL Common Vocabulary Terms@en"})

(def constraintLogicalOperands
  "Logical Constraint Operands"
  {:db/ident       :odrl/constraintLogicalOperands,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/andSequence :odrl/and :odrl/xone :odrl/or],
   :skos/prefLabel #xsd/langString "Logical Constraint Operands@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

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
   :skos/prefLabel #xsd/langString "Constraint Operators@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def constraintRightOpCommon
  "Constraint Right Operands"
  {:db/ident       :odrl/constraintRightOpCommon,
   :rdf/type       :skos/Collection,
   :skos/member    :odrl/policyUsage,
   :skos/prefLabel #xsd/langString "Constraint Right Operands@en",
   :skos/scopeNote #xsd/langString "ODRL Common Vocabulary Terms@en"})

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
   :skos/prefLabel #xsd/langString "Constraint@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def contractedParty
  "Contracted Party"
  {:db/ident           :odrl/contractedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         #xsd/langString "Contracted Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    #xsd/langString "The Party who is being contracted.@en",
   :skos/scopeNote     #xsd/langString "Non-Normative@en"})

(def contractingParty
  "Contracting Party"
  {:db/ident           :odrl/contractingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         #xsd/langString "Contracting Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    #xsd/langString
                        "The Party who is offering the contract.@en",
   :skos/scopeNote     #xsd/langString "Non-Normative@en"})

(def copy
  "Copy"
  {:db/ident :odrl/copy,
   :owl/deprecated true,
   :owl/sameAs :odrl/reproduce,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Copy@en",
   :skos/definition #xsd/langString
                     "The act of making an exact reproduction of the asset.@en",
   :skos/exactMatch :odrl/reproduce})

(def core
  "ODRL Core Profile"
  {:db/ident         :odrl/core,
   :rdf/type         [:skos/Concept :owl/Thing],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "ODRL Core Profile@en",
   :skos/definition  #xsd/langString "Identifier for the ODRL Core Profile@en"})

(def count
  "Count"
  {:db/ident :odrl/count,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Count@en",
   :skos/definition
   #xsd/langString "Numeric count of executions of the action of the Rule.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def dataType
  "Datatype"
  {:db/ident :odrl/dataType,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Datatype@en",
   :rdfs/range :rdfs/Datatype,
   :skos/definition
   #xsd/langString
    "The datatype of the value of the rightOperand or rightOperandReference of a Constraint.@en",
   :skos/note
   #xsd/langString
    "In RDF encodings, use of the rdf:datatype MUST be used. In JSON-LD encoding, the use of @type MUST be used.@en"})

(def dateTime
  "Datetime"
  {:db/ident :odrl/dateTime,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Datetime@en",
   :skos/definition
   #xsd/langString
    "The date (and optional time and timezone) of exercising the action of the Rule. Right operand value MUST be an xsd:date or xsd:dateTime as defined by [[xmlschema11-2]].@en",
   :skos/note
   #xsd/langString
    "The use of Timezone information is strongly recommended. The Rule may be exercised before (with operator lt/lteq) or after (with operator gt/gteq) the date(time) defined by the Right operand. <br />Example: <code>dateTime gteq 2017-12-31T06:00Z</code> means the Rule can only be exercised after (and including) 6:00AM on the 31st Decemeber 2017 UTC time.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def delayPeriod
  "Delay Period"
  {:db/ident :odrl/delayPeriod,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Delay Period@en",
   :skos/definition
   #xsd/langString
    "A time delay period prior to exercising the action of the Rule. The point in time triggering this period MAY be defined by another temporal Constraint combined by a Logical Constraint (utilising the odrl:andSequence operand). Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].@en",
   :skos/note
   #xsd/langString
    "Only the eq, gt, gteq operators SHOULD be used. <br />Example: <code>delayPeriod eq P60M</code> indicates a delay of 60 Minutes before exercising the action.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def delete
  "Delete"
  {:db/ident :odrl/delete,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Delete@en",
   :skos/definition
   #xsd/langString
    "To permanently remove all copies of the Asset after it has been used.@en",
   :skos/note
   #xsd/langString
    "Use a constraint to define under which conditions the Asset must be deleted.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def deliveryChannel
  "Delivery Channel"
  {:db/ident :odrl/deliveryChannel,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Delivery Channel@en",
   :skos/definition
   #xsd/langString
    "The delivery channel used for exercising the action of the Rule.@en",
   :skos/note
   #xsd/langString
    "Example: the asset may be distributed only on mobile networks.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

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
   :skos/prefLabel #xsd/langString "Deprecated Terms@en"})

(def derive
  "Derive"
  {:db/ident :odrl/derive,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Derive@en",
   :skos/definition
   #xsd/langString
    "To create a new derivative Asset from this Asset and to edit or modify the derivative.@en",
   :skos/note
   #xsd/langString
    "A new asset is created and may have significant overlaps with the original Asset. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective). To the derived Asset a next policy may be applied.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def device
  "Device"
  {:db/ident :odrl/device,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Device@en",
   :skos/definition
   #xsd/langString
    "An identified device used for exercising the action of the Rule.@en",
   :skos/exactMatch :odrl/systemDevice,
   :skos/note #xsd/string "See System Device."})

(def digitize
  "Digitize"
  {:db/ident :odrl/digitize,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Digitize@en",
   :skos/definition
   #xsd/langString
    "To produce a digital copy of (or otherwise digitize) the Asset from its analogue form.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def display
  "Display"
  {:db/ident :odrl/display,
   :odrl/includedIn :odrl/play,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Display@en",
   :skos/definition
   #xsd/langString "To create a static and transient rendition of an Asset.@en",
   :skos/note
   #xsd/langString
    "For example, displaying an image on a screen. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def distribute
  "Distribute"
  {:db/ident :odrl/distribute,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Distribute@en",
   :skos/definition #xsd/langString "To supply the Asset to third-parties.@en",
   :skos/note
   #xsd/langString
    "It is recommended to use nextPolicy to express the allowable usages by third-parties.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def duties
  "Duty"
  {:db/ident :odrl/duties,
   :rdf/type :skos/Collection,
   :skos/member
   [:odrl/remedy :odrl/consequence :odrl/duty :odrl/obligation :odrl/Duty],
   :skos/prefLabel #xsd/langString "Duty@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def duty
  "Has Duty"
  {:db/ident :odrl/duty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Permission,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Has Duty@en",
   :rdfs/range :odrl/Duty,
   :skos/definition #xsd/langString
                     "Relates an individual Duty to a Permission.@en",
   :skos/note
   #xsd/langString
    "A Duty is a pre-condition which must be fulfilled in order to receive the Permission.@en"})

(def elapsedTime
  "Elapsed Time"
  {:db/ident :odrl/elapsedTime,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Elapsed Time@en",
   :skos/definition
   #xsd/langString
    "A continuous elapsed time period which may be used for exercising of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].@en",
   :skos/note
   #xsd/string
    "Only the eq, lt, lteq operators SHOULD be used. See also Metered Time. <br />Example: <code>elpasedTime eq P60M</code> indicates a total elapsed time of 60 Minutes.",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def ensureExclusivity
  "Ensure Exclusivity"
  {:db/ident :odrl/ensureExclusivity,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Ensure Exclusivity@en",
   :skos/definition #xsd/langString
                     "To ensure that the Rule on the Asset is exclusive.@en",
   :skos/note
   #xsd/langString
    "If used as a Duty, the assignee should be explicitly indicated as the party that is ensuring the exclusivity of the Rule.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def eq
  "Equal to"
  {:db/ident :odrl/eq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Equal to@en",
   :skos/definition
   #xsd/langString
    "Indicating that a given value equals the right operand of the Constraint.@en"})

(def event
  "Event"
  {:db/ident :odrl/event,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Event@en",
   :skos/definition
   #xsd/langString
    "An identified event setting a context for exercising the action of the Rule.@en",
   :skos/note
   #xsd/langString
    "Events are temporal periods of time, and operators can be used to signal before (lt), during (eq) or after (gt) the event. <br />Example: May be taken during the “FIFA World Cup 2020” only.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def execute
  "Execute"
  {:db/ident :odrl/execute,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Execute@en",
   :skos/definition #xsd/langString "To run the computer program Asset.@en",
   :skos/note
   #xsd/langString
    "For example, machine executable code or Java such as a game or application.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def export
  "Export"
  {:db/ident         :odrl/export,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Export@en",
   :skos/definition  #xsd/langString
                      "The act of transforming the asset into a new form.@en",
   :skos/exactMatch  :odrl/transform})

(def extract
  "Extract"
  {:db/ident :odrl/extract,
   :odrl/includedIn :odrl/reproduce,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Extract@en",
   :skos/definition
   #xsd/langString
    "To extract parts of the Asset and to use it as a new Asset.@en",
   :skos/note
   #xsd/langString
    "A new asset is created and may have very little in common with the original Asset. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective). To the extracted Asset a next policy may be applied.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def extractChar
  "Extract character"
  {:db/ident :odrl/extractChar,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Extract character@en",
   :skos/definition
   #xsd/langString
    "The act of extracting (replicating) unchanged characters from the asset.@en",
   :skos/note
   #xsd/langString
    "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-char .@en"})

(def extractPage
  "Extract page"
  {:db/ident :odrl/extractPage,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Extract page@en",
   :skos/definition
   #xsd/langString
    "The act of extracting (replicating) unchanged pages from the asset.@en",
   :skos/note
   #xsd/langString
    "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-page .@en"})

(def extractWord
  "Extract word"
  {:db/ident :odrl/extractWord,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Extract word@en",
   :skos/definition
   #xsd/langString
    "The act of extracting (replicating) unchanged words from the asset.@en",
   :skos/note
   #xsd/langString
    "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-word .@en"})

(def failure
  "Failure"
  {:db/ident :odrl/failure,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Rule,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Failure@en",
   :rdfs/range :odrl/Rule,
   :skos/definition
   #xsd/langString
    "Failure is an abstract property that defines the violation (or unmet) relationship between Rules.@en",
   :skos/note
   #xsd/langString
    "The parent property to sub-properties that express explicit failure contexts.@en"})

(def fileFormat
  "File Format"
  {:db/ident :odrl/fileFormat,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "File Format@en",
   :skos/definition #xsd/langString
                     "A transformed file format of the target Asset.@en",
   :skos/note #xsd/langString
               "Example: An asset may be transformed into JPEG format.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def function
  "Function"
  {:db/ident :odrl/function,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Function@en",
   :rdfs/range :odrl/Party,
   :skos/definition
   #xsd/langString
    "Function is an abstract property whose sub-properties define the functional roles which may be fulfilled by a party in relation to a Rule.@en"})

(def give
  "Give"
  {:db/ident :odrl/give,
   :odrl/includedIn :odrl/transfer,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Give@en",
   :skos/definition
   #xsd/langString
    "To transfer the ownership of the Asset to a third party without compensation and while deleting the original asset.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def grantUse
  "Grant Use"
  {:db/ident :odrl/grantUse,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Grant Use@en",
   :skos/definition #xsd/langString
                     "To grant the use of the Asset to third parties.@en",
   :skos/note
   #xsd/langString
    "This action enables the assignee to create policies for the use of the Asset for third parties. The nextPolicy is recommended to be agreed with the third party. Use of temporal constraints is recommended.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def gt
  "Greater than"
  {:db/ident :odrl/gt,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Greater than@en",
   :skos/definition
   #xsd/langString
    "Indicating that a given value is greater than the right operand of the Constraint.@en"})

(def gteq
  "Greater than or equal to"
  {:db/ident :odrl/gteq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Greater than or equal to@en",
   :skos/definition
   #xsd/langString
    "Indicating that a given value is greater than or equal to the right operand of the Constraint.@en"})

(def hasPart
  "Has part"
  {:db/ident :odrl/hasPart,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Has part@en",
   :skos/definition
   #xsd/langString
    "A set-based operator indicating that a given value contains the right operand of the Constraint.@en"})

(def hasPolicy
  "Target Policy"
  {:db/ident :odrl/hasPolicy,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Asset,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Target Policy@en",
   :rdfs/range :odrl/Policy,
   :skos/definition
   #xsd/langString
    "Identifies an ODRL Policy for which the identified Asset is the target Asset to all the Rules.@en",
   :skos/note
   #xsd/langString
    "The Asset being identified MUST be inferred to be the target Asset of all of the Rules of the Policy.@en"})

(def ignore
  "Ignore Undefined Actions"
  {:db/ident :odrl/ignore,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/UndefinedTerm :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Ignore Undefined Actions@en",
   :skos/definition
   #xsd/langString
    "The Action is to be ignored and is not part of the policy – and the policy remains valid.@en",
   :skos/note #xsd/langString
               "Used to support actions not known to the policy system.@en"})

(def implies
  "Implies"
  {:db/ident :odrl/implies,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Action,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Implies@en",
   :rdfs/range :odrl/Action,
   :skos/definition
   #xsd/langString
    "An Action asserts that another Action is not prohibited to enable its operational semantics.@en",
   :skos/note
   #xsd/langString
    "The property asserts that an instance of Action entails that the other instance of Action is not prohibited.@en"})

(def include
  "Include"
  {:db/ident :odrl/include,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Include@en",
   :skos/definition #xsd/langString
                     "To include other related assets in the Asset.@en",
   :skos/note
   #xsd/langString
    "For example: bio picture must be included in the attribution. Use of a relation sub-property is required for the related assets.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def includedIn
  "Included In"
  {:db/ident :odrl/includedIn,
   :rdf/type
   [:owl/ObjectProperty :owl/TransitiveProperty :rdf/Property :skos/Concept],
   :rdfs/domain :odrl/Action,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Included In@en",
   :rdfs/range :odrl/Action,
   :skos/definition
   #xsd/langString
    "An Action transitively asserts that another Action that encompasses its operational semantics.@en",
   :skos/note
   #xsd/langString
    "The purpose is to explicitly assert that the semantics of the referenced instance of an other Action encompasses (includes) the semantics of this instance of Action. The includedIn property is transitive, and as such, the Actions form ancestor relationships.@en"})

(def index
  "Index"
  {:db/ident :odrl/index,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Index@en",
   :skos/definition #xsd/langString "To record the Asset in an index.@en",
   :skos/note
   #xsd/langString
    "For example, to include a link to the Asset in a search engine database.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def industry
  "Industry Context"
  {:db/ident :odrl/industry,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Industry Context@en",
   :skos/definition
   #xsd/langString
    "A defined industry sector setting a context for exercising the action of the Rule.@en",
   :skos/note #xsd/langString "Example: publishing or financial industry.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def inform
  "Inform"
  {:db/ident :odrl/inform,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Inform@en",
   :skos/definition
   #xsd/langString
    "To inform that an action has been performed on or in relation to the Asset.@en",
   :skos/note #xsd/langString
               "May link to a Party with the role 'informedParty' function.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def informedParty
  "Informed Party"
  {:db/ident           :odrl/informedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         #xsd/langString "Informed Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    #xsd/langString
                        "The Party to be informed of all uses.@en",
   :skos/note          #xsd/langString
                        "Maybe specified as part of the inform action.@en",
   :skos/scopeNote     #xsd/langString "Non-Normative@en"})

(def informingParty
  "Informing Party"
  {:db/ident           :odrl/informingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         #xsd/langString "Informing Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    #xsd/langString
                        "The Party who provides the inform use data.@en",
   :skos/note          #xsd/langString
                        "Maybe specified as part of the inform action.@en",
   :skos/scopeNote     #xsd/langString "Non-Normative@en"})

(def inheritAllowed
  "Inheritance Allowed"
  {:db/ident         :odrl/inheritAllowed,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Inheritance Allowed@en",
   :skos/definition  #xsd/langString
                      "Indicates if the Policy entity can be inherited.@en",
   :skos/note        #xsd/langString "A boolean value.@en"})

(def inheritFrom
  "Inherits From"
  {:db/ident :odrl/inheritFrom,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Inherits From@en",
   :rdfs/range :odrl/Policy,
   :skos/definition
   #xsd/langString
    "Relates a (child) policy to another (parent) policy from which terms are inherited.@en",
   :skos/note #xsd/langString
               "The child policy will inherit Rules from the parent policy@en"})

(def inheritRelation
  "Inherit Relation"
  {:db/ident :odrl/inheritRelation,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Inherit Relation@en",
   :skos/definition #xsd/langString "Indentifies the type of inheritance.@en",
   :skos/note
   #xsd/langString
    "For example, this may indicate the business scenario, such as subscription, or prior arrangements between the parties (that are not machine representable).@en"})

(def install
  "Install"
  {:db/ident :odrl/install,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Install@en",
   :skos/definition
   #xsd/langString
    "To load the computer program Asset onto a storage device which allows operating or running the Asset.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def invalid
  "Void Policy"
  {:db/ident :odrl/invalid,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/ConflictTerm :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Void Policy@en",
   :skos/definition #xsd/langString "The policy is void.@en",
   :skos/note #xsd/langString
               "Used to indicate the policy is void for Conflict Strategy.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def isA
  "Is a"
  {:db/ident :odrl/isA,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Is a@en",
   :skos/definition
   #xsd/langString
    "A set-based operator indicating that a given value is an instance of the right operand of the Constraint.@en"})

(def isAllOf
  "Is all of"
  {:db/ident :odrl/isAllOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Is all of@en",
   :skos/definition
   #xsd/langString
    "A set-based operator indicating that a given value is all of the right operand of the Constraint.@en"})

(def isAnyOf
  "Is any of"
  {:db/ident :odrl/isAnyOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Is any of@en",
   :skos/definition
   #xsd/langString
    "A set-based operator indicating that a given value is any of the right operand of the Constraint.@en"})

(def isNoneOf
  "Is none of"
  {:db/ident :odrl/isNoneOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Is none of@en",
   :skos/definition
   #xsd/langString
    "A set-based operator indicating that a given value is none of the right operand of the Constraint.@en"})

(def isPartOf
  "Is part of"
  {:db/ident :odrl/isPartOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Is part of@en",
   :skos/definition
   #xsd/langString
    "A set-based operator indicating that a given value is contained by the right operand of the Constraint.@en"})

(def language
  "Language"
  {:db/ident :odrl/language,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Language@en",
   :skos/definition #xsd/langString
                     "A natural language used by the target Asset.@en",
   :skos/note
   #xsd/langString
    "Example: the asset can only be translated into Greek. Must use [[bcp47]] codes for language values.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def lease
  "Lease"
  {:db/ident :odrl/lease,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Lease@en",
   :skos/definition
   #xsd/langString
    "The act of making available the asset to a third-party for a fixed period of time with exchange of value.@en"})

(def leftOperand
  "Has Left Operand"
  {:db/ident         :odrl/leftOperand,
   :rdf/type         [:skos/Concept :rdf/Property],
   :rdfs/domain      :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Has Left Operand@en",
   :rdfs/range       :odrl/LeftOperand,
   :skos/definition  #xsd/langString
                      "The left operand in a constraint expression.@en"})

(def lend
  "Lend"
  {:db/ident :odrl/lend,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Lend@en",
   :skos/definition
   #xsd/langString
    "The act of making available the asset to a third-party for a fixed period of time without exchange of value.@en"})

(def license
  "License"
  {:db/ident :odrl/license,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "License@en",
   :skos/definition
   #xsd/langString
    "The act of granting the right to use the asset to a third-party.@en",
   :skos/exactMatch :odrl/grantUse})

(def logicalConstraints
  "Logical Constraint"
  {:db/ident       :odrl/logicalConstraints,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/operand :odrl/LogicalConstraint],
   :skos/prefLabel #xsd/langString "Logical Constraint@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def lt
  "Less than"
  {:db/ident :odrl/lt,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Less than@en",
   :skos/definition
   #xsd/langString
    "Indicating that a given value is less than the right operand of the Constraint.@en"})

(def lteq
  "Less than or equal to"
  {:db/ident :odrl/lteq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Less than or equal to@en",
   :skos/definition
   #xsd/langString
    "Indicating that a given value is less than or equal to the right operand of the Constraint.@en"})

(def media
  "Media Context"
  {:db/ident :odrl/media,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Media Context@en",
   :skos/definition
   #xsd/langString
    "Category of a media asset setting a context for exercising the action of the Rule.@en",
   :skos/note
   #xsd/langString
    "Example media types: electronic, print, advertising, marketing. Note: The used type should not be an IANA MediaType as they are focused on technical characteristics. @en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def meteredTime
  "Metered Time"
  {:db/ident :odrl/meteredTime,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Metered Time@en",
   :skos/definition
   #xsd/langString
    "An accumulated amount of one to many metered time periods which were used for exercising the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].@en",
   :skos/note
   #xsd/string
    "Only the eq, lt, lteq operators SHOULD be used. See also Elapsed Time. <br />Example: <code>meteredTime lteq P60M</code> indicates an accumulated period of 60 Minutes or less.",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def modify
  "Modify"
  {:db/ident :odrl/modify,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Modify@en",
   :skos/definition
   #xsd/langString
    "To change existing content of the Asset. A new asset is not created by this action.@en",
   :skos/note
   #xsd/langString
    "This action will modify an asset which is typically updated from time to time without creating a new asset. If the result from modifying the asset should be a new asset the actions derive or extract should be used. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective).@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def move
  "Move"
  {:db/ident :odrl/move,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Move@en",
   :skos/definition
   #xsd/langString
    "To move the Asset from one digital location to another including deleting the original copy.@en",
   :skos/note
   #xsd/langString
    "After the Asset has been moved, the original copy must be deleted.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def neq
  "Not equal to"
  {:db/ident :odrl/neq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Not equal to@en",
   :skos/definition
   #xsd/langString
    "Indicating that a given value is not equal to the right operand of the Constraint.@en"})

(def nextPolicy
  "Next Policy"
  {:db/ident :odrl/nextPolicy,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Next Policy@en",
   :skos/definition
   #xsd/langString
    "To grant the specified Policy to a third party for their use of the Asset.@en",
   :skos/note #xsd/langString "Useful for downstream policies.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def obligation
  "Obligation"
  {:db/ident         :odrl/obligation,
   :rdf/type         [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Obligation@en",
   :rdfs/range       :odrl/Duty,
   :skos/definition  #xsd/langString
                      "Relates an individual Duty to a Policy.@en",
   :skos/note        #xsd/langString
                      "The Duty is a requirement which must be fulfilled.@en"})

(def obtainConsent
  "Obtain Consent"
  {:db/ident :odrl/obtainConsent,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Obtain Consent@en",
   :skos/definition
   #xsd/langString
    "To obtain verifiable consent to perform the requested action in relation to the Asset.@en",
   :skos/note
   #xsd/langString
    "May be used as a Duty to ensure that the Assigner or a Party is authorized to approve such actions on a case-by-case basis. May link to a Party with the role “consentingParty” function.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def operand
  "Operand"
  {:db/ident :odrl/operand,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/LogicalConstraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Operand@en",
   :skos/definition
   #xsd/langString
    "Operand is an abstract property for a logical relationship.@en",
   :skos/note
   #xsd/langString
    "Sub-properties of operand are used for Logical Constraints.@en"})

(def operator
  "Has Operator"
  {:db/ident :odrl/operator,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Has Operator@en",
   :rdfs/range :odrl/Operator,
   :skos/definition
   #xsd/langString
    "The operator function applied to operands of a Constraint@en"})

(def or
  "Or"
  {:db/ident :odrl/or,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Or@en",
   :rdfs/subPropertyOf :odrl/operand,
   :skos/definition
   #xsd/langString
    "The relation is satisfied when at least one of the Constraints is satisfied.@en",
   :skos/note
   #xsd/langString
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances.@en"})

(def output
  "Output"
  {:db/ident :odrl/output,
   :rdf/type [:rdf/Property :skos/Concept :owl/ObjectProperty],
   :rdfs/domain :odrl/Rule,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Output@en",
   :rdfs/range :odrl/Asset,
   :rdfs/subPropertyOf :odrl/relation,
   :skos/definition
   #xsd/langString
    "The output property specifies the Asset which is created from the output of the Action.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def partOf
  "Part Of"
  {:db/ident :odrl/partOf,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Asset :odrl/Party],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Part Of@en",
   :rdfs/range {:owl/unionOf [:odrl/AssetCollection :odrl/PartyCollection],
                :rdf/type    :owl/Class},
   :skos/definition
   #xsd/langString
    "Identifies an Asset/PartyCollection that the Asset/Party is a member of.@en"})

(def partyConcepts
  "Party"
  {:db/ident       :odrl/partyConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/PartyCollection :odrl/Party],
   :skos/prefLabel #xsd/langString "Party@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def partyRoles
  "Party Functions"
  {:db/ident       :odrl/partyRoles,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/assignerOf
                    :odrl/assigneeOf
                    :odrl/assigner
                    :odrl/assignee],
   :skos/prefLabel #xsd/langString "Party Functions@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

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
   :skos/prefLabel #xsd/langString "Party Functions@en",
   :skos/scopeNote #xsd/langString "ODRL Common Vocabulary Terms@en"})

(def pay
  "Pay"
  {:db/ident :odrl/pay,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Pay@en",
   :skos/definition
   #xsd/langString
    "The act of paying a financial amount to a party for use of the asset.@en",
   :skos/exactMatch :odrl/compensate})

(def payAmount
  "Payment Amount"
  {:db/ident :odrl/payAmount,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Payment Amount@en",
   :skos/definition
   #xsd/langString
    "The amount of a financial payment. Right operand value MUST be an xsd:decimal. @en",
   :skos/note
   #xsd/langString
    "Can be used for compensation duties with the unit property indicating the currency of the payment.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def payeeParty
  "Payee Party"
  {:db/ident         :odrl/payeeParty,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Payee Party@en",
   :skos/definition  #xsd/langString
                      "The Party is the recipient of the payment.@en",
   :skos/exactMatch  :odrl/compensatedParty,
   :skos/scopeNote   #xsd/langString "Non-Normative@en"})

(def percentage
  "Asset Percentage"
  {:db/ident :odrl/percentage,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Asset Percentage@en",
   :skos/definition
   #xsd/langString
    "A percentage amount of the target Asset relevant for exercising the action of the Rule. Right operand value MUST be an xsd:decimal from 0 to 100.@en",
   :skos/note #xsd/langString "Example: Extract less than or equal to 50%.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def perm
  "Prefer Permissions"
  {:db/ident         :odrl/perm,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/ConflictTerm
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Prefer Permissions@en",
   :skos/definition  #xsd/langString
                      "Permissions take preference over prohibitions.@en",
   :skos/note        #xsd/langString
                      "Used to determine policy conflict outcomes.@en"})

(def permission
  "Has Permission"
  {:db/ident         :odrl/permission,
   :rdf/type         [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Has Permission@en",
   :rdfs/range       :odrl/Permission,
   :skos/definition  #xsd/langString
                      "Relates an individual Permission to a Policy.@en"})

(def permissions
  "Permission"
  {:db/ident       :odrl/permissions,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/permission :odrl/Permission],
   :skos/prefLabel #xsd/langString "Permission@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def play
  "Play"
  {:db/ident :odrl/play,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Play@en",
   :skos/definition
   #xsd/langString
    "To create a sequential and transient rendition of an Asset.@en",
   :skos/note
   #xsd/string
    "For example, to play a video or audio track. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used.",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def policyConcepts
  "Policy"
  {:db/ident       :odrl/policyConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/inheritFrom :odrl/profile :odrl/uid :odrl/Policy],
   :skos/prefLabel #xsd/langString "Policy@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def policySubClasses
  "Policy Subclasses"
  {:db/ident       :odrl/policySubClasses,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/Set :odrl/Offer :odrl/Agreement],
   :skos/prefLabel #xsd/langString "Policy Subclasses@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def policySubClassesCommon
  "Policy Subclasses"
  {:db/ident       :odrl/policySubClassesCommon,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/Ticket :odrl/Request :odrl/Privacy :odrl/Assertion],
   :skos/prefLabel #xsd/langString "Policy Subclasses@en",
   :skos/scopeNote #xsd/langString "ODRL Common Vocabulary Terms@en"})

(def policyUsage
  "Policy Rule Usage"
  {:db/ident :odrl/policyUsage,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/RightOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Policy Rule Usage@en",
   :skos/definition
   #xsd/langString
    "Indicates the actual datetime the action of the Rule was exercised.@en",
   :skos/note
   #xsd/langString
    "This can be used to express constraints with a LeftOperand relative to the time the rule is exercised. Operators indicate before (lt, lteq), during (eq) or after (gt, gteq) the usage of the rule. <br />Example: <code>event lt policyUsage</code> expresses that the identified event must have happened before the action of the rule is exercised.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def present
  "Present"
  {:db/ident         :odrl/present,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Present@en",
   :skos/definition  #xsd/langString "To publicly perform the Asset.@en",
   :skos/note        #xsd/string
                      "The asset can be performed (or communicated) in public.",
   :skos/scopeNote   #xsd/langString "Non-Normative@en"})

(def preview
  "Preview"
  {:db/ident         :odrl/preview,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Preview@en",
   :skos/definition  #xsd/langString
                      "The act of providing a short preview of the asset.@en",
   :skos/note        #xsd/langString
                      "Use a time constraint with the appropriate action.@en"})

(def print
  "Print"
  {:db/ident :odrl/print,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Print@en",
   :skos/definition
   #xsd/langString
    "To create a tangible and permanent rendition of an Asset.@en",
   :skos/note
   #xsd/langString
    "For example, creating a permanent, fixed (static), and directly perceivable representation of the Asset, such as printing onto paper.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def product
  "Product Context"
  {:db/ident :odrl/product,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Product Context@en",
   :skos/definition
   #xsd/langString
    "Category of product or service setting a context for exercising the action of the Rule.@en",
   :skos/note #xsd/langString
               "Example: May only be used in the XYZ Magazine.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def profile
  "Profile"
  {:db/ident :odrl/profile,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Profile@en",
   :skos/definition
   #xsd/langString
    "The identifier(s) of an ODRL Profile that the Policy conforms to.@en",
   :skos/note
   #xsd/langString
    "The profile property is mandatory if the Policy is using an ODRL Profile.@en"})

(def prohibit
  "Prefer Prohibitions"
  {:db/ident         :odrl/prohibit,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/ConflictTerm
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Prefer Prohibitions@en",
   :skos/definition  #xsd/langString
                      "Prohibitions take preference over permissions.@en",
   :skos/note        #xsd/langString
                      "Used to determine policy conflict outcomes.@en"})

(def prohibition
  "Has Prohibition"
  {:db/ident         :odrl/prohibition,
   :rdf/type         [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain      :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Has Prohibition@en",
   :rdfs/range       :odrl/Prohibition,
   :skos/definition  #xsd/langString
                      "Relates an individual Prohibition to a Policy.@en"})

(def prohibitions
  "Prohibition"
  {:db/ident       :odrl/prohibitions,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/prohibition :odrl/Prohibition],
   :skos/prefLabel #xsd/langString "Prohibition@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def proximity
  "proximity"
  {:db/ident :odrl/proximity,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "proximity@en",
   :skos/definition #xsd/langString
                     "An value indicating the closeness or nearness.@en",
   :skos/note
   #xsd/langString
    "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/proximity .@en"})

(def purpose
  "Purpose"
  {:db/ident :odrl/purpose,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Purpose@en",
   :skos/definition
   #xsd/langString
    "A defined purpose for exercising the action of the Rule.@en",
   :skos/note #xsd/langString "Example: Educational use.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def read
  "Read"
  {:db/ident :odrl/read,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Read@en",
   :skos/definition #xsd/langString "To obtain data from the Asset.@en",
   :skos/note
   #xsd/langString
    "For example, the ability to read a record from a database (the Asset).@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def recipient
  "Recipient"
  {:db/ident :odrl/recipient,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Recipient@en",
   :skos/definition
   #xsd/langString
    "The party receiving the result/outcome of exercising the action of the Rule.@en",
   :skos/note
   #xsd/langString
    "The Right Operand must identify one or more specific Parties or category/ies of the Party.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def refinement
  "Refinement"
  {:db/ident :odrl/refinement,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain
   {:owl/unionOf [:odrl/Action :odrl/AssetCollection :odrl/PartyCollection],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Refinement@en",
   :rdfs/range {:owl/unionOf [:odrl/Constraint :odrl/LogicalConstraint],
                :rdf/type    :owl/Class},
   :skos/definition
   #xsd/langString
    "Constraint used to refine the semantics of an Action, or Party/Asset Collection@en",
   :skos/note
   #xsd/langString
    "Example: the Action print is only permitted on 50% of the asset.@en"})

(def relation
  "Relation"
  {:db/ident :odrl/relation,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Relation@en",
   :rdfs/range :odrl/Asset,
   :skos/definition
   #xsd/langString
    "Relation is an abstract property which creates an explicit link between an Action and an Asset.@en",
   :skos/note
   #xsd/langString
    "Sub-properties of relation are used to define the nature of that link.@en"})

(def relativePosition
  "Relative Asset Position"
  {:db/ident :odrl/relativePosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Relative Asset Position@en",
   :skos/definition
   #xsd/langString
    "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset.@en",
   :skos/note
   #xsd/langString
    "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def relativeSize
  "Relative Asset Size"
  {:db/ident :odrl/relativeSize,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Relative Asset Size@en",
   :skos/definition
   #xsd/langString
    "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects - expressed as percentages of full values - of the target Asset.@en",
   :skos/note
   #xsd/langString
    "Example: The image can be resized in width to a maximum of 200%. Note: See the Left Operand absoluteSize. @en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def relativeSpatialPosition
  "Relative Spatial Asset Position"
  {:db/ident :odrl/relativeSpatialPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Relative Spatial Asset Position@en",
   :skos/broaderTransitive :odrl/relativePosition,
   :skos/definition
   #xsd/langString
    "The relative spatial positions - expressed as percentages of full values - of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space of the target Asset.@en",
   :skos/note #xsd/langString "See also Absolute Spatial Asset Position.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def relativeTemporalPosition
  "Relative Temporal Asset Position"
  {:db/ident :odrl/relativeTemporalPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Relative Temporal Asset Position@en",
   :skos/broaderTransitive :odrl/relativePosition,
   :skos/definition
   #xsd/langString
    "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset.@en",
   :skos/note
   #xsd/langString
    "See also Absolute Temporal Asset Position. <br />Example: The MP3 music file must be positioned between the positions at 33% and 48% of the temporal length of a stream. @en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def remedy
  "Remedy"
  {:db/ident :odrl/remedy,
   :rdf/type [:rdf/Property :owl/ObjectProperty :skos/Concept],
   :rdfs/domain :odrl/Prohibition,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Remedy@en",
   :rdfs/range :odrl/Duty,
   :rdfs/subPropertyOf :odrl/failure,
   :skos/definition #xsd/langString
                     "Relates an individual remedy Duty to a Prohibition.@en",
   :skos/note
   #xsd/langString
    "The remedy property expresses an agreed Duty that must be fulfilled in case that a Prohibition has been violated by being exercised.@en"})

(def reproduce
  "Reproduce"
  {:db/ident :odrl/reproduce,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Reproduce@en",
   :skos/definition
   #xsd/langString
    "To make duplicate copies the Asset in any material form.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def resolution
  "Rendition Resolution"
  {:db/ident         :odrl/resolution,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/LeftOperand
                      :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Rendition Resolution@en",
   :skos/definition  #xsd/langString
                      "Resolution of the rendition of the target Asset.@en",
   :skos/note        #xsd/langString
                      "Example: the image may be printed at 1200dpi.@en",
   :skos/scopeNote   #xsd/langString "Non-Normative@en"})

(def reviewPolicy
  "Review Policy"
  {:db/ident :odrl/reviewPolicy,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Review Policy@en",
   :skos/definition #xsd/langString
                     "To review the Policy applicable to the Asset.@en",
   :skos/note
   #xsd/langString
    "Used when human intervention is required to review the Policy. May link to an Asset which represents the full Policy information.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def rightOperand
  "Has Right Operand"
  {:db/ident :odrl/rightOperand,
   :rdf/type [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Has Right Operand@en",
   :rdfs/range {:owl/unionOf [:odrl/RightOperand :rdfs/Literal :xsd/anyURI],
                :rdf/type    :owl/Class},
   :skos/definition
   #xsd/langString
    "The value of the right operand in a constraint expression.@en",
   :skos/note
   #xsd/langString
    "When used with set-based operators, a list of values may be used.@en"})

(def rightOperandReference
  "Has Right Operand Reference"
  {:db/ident :odrl/rightOperandReference,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Has Right Operand Reference@en",
   :skos/definition
   #xsd/langString
    "A reference to a web resource providing the value for the right operand of a Constraint.@en",
   :skos/note
   #xsd/langString
    "An IRI that MUST be dereferenced to obtain the actual right operand value. When used with set-based operators, a list of IRIs may be used@en"})

(def ruleConcepts
  "Rule"
  {:db/ident       :odrl/ruleConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/failure :odrl/function :odrl/relation :odrl/Rule],
   :skos/prefLabel #xsd/langString "Rule@en",
   :skos/scopeNote #xsd/langString "ODRL Core Vocabulary Terms@en"})

(def scope
  "Scope"
  {:db/ident :odrl/scope,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Scope@en",
   :skos/definition
   #xsd/langString
    "The identifier of a scope that provides context to the extent of the entity.@en",
   :skos/note #xsd/langString
               "Used to define scopes for Assets and Parties.@en"})

(def secondaryUse
  "Secondary Use"
  {:db/ident :odrl/secondaryUse,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Secondary Use@en",
   :skos/definition
   #xsd/langString
    "The act of using the asset for a purpose other than the purpose it was intended for.@en"})

(def sell
  "Sell"
  {:db/ident :odrl/sell,
   :odrl/includedIn :odrl/transfer,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Sell@en",
   :skos/definition
   #xsd/langString
    "To transfer the ownership of the Asset to a third party with compensation and while deleting the original asset.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def share
  "Share"
  {:db/ident :odrl/share,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Share@en",
   :skos/definition
   #xsd/langString
    "The act of the non-commercial reproduction and distribution of the asset to third-parties.@en",
   :skos/exactMatch :cc/Sharing})

(def shareAlike
  "Share-alike"
  {:db/ident :odrl/shareAlike,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Share-alike@en",
   :skos/definition
   #xsd/langString
    "The act of distributing any derivative asset under the same terms as the original asset.@en",
   :skos/exactMatch :cc/ShareAlike})

(def source
  "Source"
  {:db/ident :odrl/source,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/AssetCollection :odrl/PartyCollection],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Source@en",
   :skos/definition #xsd/langString "Reference to a Asset/PartyCollection@en",
   :skos/note
   #xsd/langString
    "Used by AssetCollection and PartyCollection when constraints are applied.@en"})

(def spatial
  "Geospatial Named Area"
  {:db/ident :odrl/spatial,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Geospatial Named Area@en",
   :skos/definition
   #xsd/langString
    "A named and identified geospatial area with defined borders which is used for exercising the action of the Rule. An IRI MUST be used to represent this value.@en",
   :skos/note
   #xsd/langString
    "A code value for the area and source of the code must be presented in the Right Operand. <br />Example: the [[iso3166]] Country Codes or the Getty Thesaurus of Geographic Names. @en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def spatialCoordinates
  "Geospatial Coordinates"
  {:db/ident :odrl/spatialCoordinates,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Geospatial Coordinates@en",
   :skos/broaderTransitive :odrl/spatial,
   :skos/definition
   #xsd/langString
    "A set of coordinates setting the borders of a geospatial area used for exercising the action of the Rule. The coordinates MUST include longitude and latitude, they MAY include altitude and the geodetic datum.@en",
   :skos/note
   #xsd/langString
    "The default values are the altitude of earth's surface at this location and the WGS 84 datum.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def status
  "Status"
  {:db/ident :odrl/status,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Status@en",
   :skos/definition
   #xsd/langString
    "the value generated from the leftOperand action or a value related to the leftOperand set as the reference for the comparison.@en"})

(def stream
  "Stream"
  {:db/ident :odrl/stream,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Stream@en",
   :skos/definition #xsd/langString "To deliver the Asset in real-time.@en",
   :skos/note
   #xsd/string
    "The Asset maybe utilised in real-time as it is being delivered. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used.",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def support
  "Support Undefined Actions"
  {:db/ident :odrl/support,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/UndefinedTerm :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Support Undefined Actions@en",
   :skos/definition
   #xsd/langString
    "The Action is to be supported as part of the policy – and the policy remains valid.@en",
   :skos/note #xsd/langString
               "Used to support actions not known to the policy system.@en"})

(def synchronize
  "Synchronize"
  {:db/ident :odrl/synchronize,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Synchronize@en",
   :skos/definition
   #xsd/langString
    "To use the Asset in timed relations with media (audio/visual) elements of another Asset.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def system
  "System"
  {:db/ident :odrl/system,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "System@en",
   :skos/definition
   #xsd/langString
    "An identified computing system used for exercising the action of the Rule.@en",
   :skos/exactMatch :odrl/systemDevice,
   :skos/note #xsd/string "See System Device"})

(def systemDevice
  "System Device"
  {:db/ident :odrl/systemDevice,
   :rdf/type
   [:skos/Concept :odrl/LeftOperand :owl/NamedIndividual :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "System Device@en",
   :skos/definition
   #xsd/langString
    "An identified computing system or computing device used for exercising the action of the Rule.@en",
   :skos/exactMatch [:odrl/system :odrl/device],
   :skos/note
   #xsd/langString
    "Example: The system device can be identified by a unique code created from the used hardware.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def target
  "Target"
  {:db/ident :odrl/target,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Target@en",
   :rdfs/range :odrl/Asset,
   :rdfs/subPropertyOf :odrl/relation,
   :skos/definition
   #xsd/langString
    "The target property indicates the Asset that is the primary subject to which the Rule action directly applies.@en"})

(def textToSpeech
  "Text-to-speech"
  {:db/ident :odrl/textToSpeech,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Text-to-speech@en",
   :skos/definition #xsd/langString "To have a text Asset read out loud.@en",
   :skos/note
   #xsd/string
    "If the action is to be performed to a wider audience than just the Assignees, then the recipient constraint is recommended to be used.",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def timeInterval
  "Recurring Time Interval"
  {:db/ident :odrl/timeInterval,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Recurring Time Interval@en",
   :skos/definition
   #xsd/langString
    "A recurring period of time before the next execution of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].@en",
   :skos/note
   #xsd/string
    "Only the eq operator SHOULD be used. <br />Example: <code>timeInterval eq P7D</code> indicates a recurring 7 day period.",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def timedCount
  "Timed Count"
  {:db/ident :odrl/timedCount,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Timed Count@en",
   :rdfs/range :rdfs/Literal,
   :skos/definition
   #xsd/langString
    "The number of seconds after which timed metering use of the asset begins.@en",
   :skos/note
   #xsd/langString
    "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/timed-count .@en"})

(def trackedParty
  "Tracked Party"
  {:db/ident :odrl/trackedParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Tracked Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition #xsd/langString
                     "The Party whose usage is being tracked.@en",
   :skos/note #xsd/langString
               "May be specified as part of the acceptTracking action.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def trackingParty
  "Tracking Party"
  {:db/ident :odrl/trackingParty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Tracking Party@en",
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition #xsd/langString "The Party who is tracking usage.@en",
   :skos/note #xsd/langString
               "May be specified as part of the acceptTracking action.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def transfer
  "Transfer Ownership"
  {:db/ident :odrl/transfer,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Transfer Ownership@en",
   :skos/definition
   #xsd/langString "To transfer the ownership of the Asset in perpetuity.@en"})

(def transform
  "Transform"
  {:db/ident :odrl/transform,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Transform@en",
   :skos/definition #xsd/langString
                     "To convert the Asset into a different format.@en",
   :skos/note
   #xsd/langString
    "Typically used to convert the Asset into a different format for consumption on/transfer to a third party system.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def translate
  "Translate"
  {:db/ident :odrl/translate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Translate@en",
   :skos/definition
   #xsd/langString
    "To translate the original natural language of an Asset into another natural language.@en",
   :skos/note #xsd/langString
               "A new derivative Asset is created by that action.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def uid
  "Unique Identifier"
  {:db/ident :odrl/uid,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Policy
                               :odrl/Asset
                               :odrl/Rule
                               :odrl/Party
                               :odrl/Constraint
                               :odrl/LogicalConstraint],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Unique Identifier@en",
   :skos/definition #xsd/langString "An unambiguous identifier@en",
   :skos/note
   #xsd/langString
    "Used by the Policy, Rule, Asset, Party, Constraint, and Logical Constraint Classes.@en"})

(def undefined
  "Handle Undefined Term"
  {:db/ident :odrl/undefined,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Handle Undefined Term@en",
   :rdfs/range :odrl/UndefinedTerm,
   :skos/definition
   #xsd/langString
    "Relates the strategy used for handling undefined actions to a Policy.@en",
   :skos/note #xsd/langString
               "If no strategy is specified, the default is invalid.@en"})

(def uninstall
  "Uninstall"
  {:db/ident :odrl/uninstall,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Uninstall@en",
   :skos/definition
   #xsd/langString
    "To unload and delete the computer program Asset from a storage device and disable its readiness for operation.@en",
   :skos/note
   #xsd/langString
    "The Asset is no longer accessible to the assignees after it has been used.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def unit
  "Unit"
  {:db/ident :odrl/unit,
   :rdf/type :rdf/Property,
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Unit@en",
   :skos/definition
   #xsd/langString
    "The unit of measurement of the value of the rightOperand or rightOperandReference of a Constraint.@en"})

(def unitOfCount
  "Unit Of Count"
  {:db/ident :odrl/unitOfCount,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Unit Of Count@en",
   :skos/definition
   #xsd/langString
    "The unit of measure used for counting the executions of the action of the Rule.@en",
   :skos/note
   #xsd/langString
    "Note: Typically used with Duties to indicate the unit entity to be counted of the Action. <br />Example: A duty to compensate and a unitOfCount constraint of 'perUser' would indicate that the compensation by multiplied by the 'number of users'.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def use
  "Use"
  {:db/ident :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Use@en",
   :skos/definition #xsd/langString "To use the Asset@en",
   :skos/note
   #xsd/langString
    "Use is the most generic action for all non-third-party usage. More specific types of the use action can be expressed by more targetted actions.@en"})

(def version
  "Version"
  {:db/ident :odrl/version,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Version@en",
   :skos/definition #xsd/langString "The version of the target Asset.@en",
   :skos/note
   #xsd/langString
    "Example: Single Paperback or Multiple Issues or version 2.0 or higher.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def virtualLocation
  "Virtual IT Communication Location"
  {:db/ident :odrl/virtualLocation,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Virtual IT Communication Location@en",
   :skos/definition
   #xsd/langString
    "An identified location of the IT communication space which is relevant for exercising the action of the Rule.@en",
   :skos/note #xsd/langString
               "Example: an Internet domain or IP address range.@en",
   :skos/scopeNote #xsd/langString "Non-Normative@en"})

(def watermark
  "Watermark"
  {:db/ident         :odrl/watermark,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Watermark@en",
   :skos/definition  #xsd/langString "To apply a watermark to the Asset.@en",
   :skos/scopeNote   #xsd/langString "Non-Normative@en"})

(def write
  "Write"
  {:db/ident         :odrl/write,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Write@en",
   :skos/definition  #xsd/langString "The act of writing to the Asset.@en",
   :skos/exactMatch  :odrl/modify})

(def writeTo
  "Write to"
  {:db/ident         :odrl/writeTo,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       #xsd/langString "Write to@en",
   :skos/definition  #xsd/langString "The act of adding data to the Asset.@en",
   :skos/exactMatch  :odrl/modify})

(def xone
  "Only One"
  {:db/ident :odrl/xone,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label #xsd/langString "Only One@en",
   :rdfs/subPropertyOf :odrl/operand,
   :skos/definition
   #xsd/langString
    "The relation is satisfied when only one, and not more, of the Constaints is satisfied@en",
   :skos/note
   #xsd/langString
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances.@en"})