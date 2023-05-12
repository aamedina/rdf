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
   "The ODRL Vocabulary and Expression defines a set of concepts and terms (the vocabulary) and encoding mechanism (the expression) for permissions and obligations statements describing digital content usage based on the ODRL Information Model.",
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
   :rdfs/comment "This is the RDF ontology for ODRL Version 2.2.",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/odrl-vocab/"},
   :rdfs/label "ODRL Version 2.2"}
  (:refer-clojure :exclude [and count derive or print read use]))

(def Action
  "An operation on an Asset."
  {:db/ident :odrl/Action,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Action",
   :rdfs/subClassOf [:rdfs/Resource :schema/Action :odrl/Action],
   :skos/definition "An operation on an Asset.",
   :skos/note
   "Actions may be allowed by Permissions, disallowed by Prohibitions, or made mandatory by Duties."})

(def Agreement
  "A Policy that grants the assignee a Rule over an Asset from an assigner."
  {:db/ident :odrl/Agreement,
   :owl/disjointWith
   [:odrl/Assertion :odrl/Offer :odrl/Ticket :odrl/Privacy :odrl/Request],
   :rdf/type [:owl/Class :rdfs/Class :skos/Concept],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Agreement",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Agreement],
   :skos/definition
   "A Policy that grants the assignee a Rule over an Asset from an assigner.",
   :skos/note
   "An Agreement Policy MUST contain at least one Permission or Prohibition rule, a Party with Assigner function, and a Party with Assignee function (in the same Permission or Prohibition). The Agreement Policy will grant the terms of the Policy from the Assigner to the Assignee."})

(def All
  "Specifies that the scope of the relationship is all of the collective individuals within a context."
  {:db/ident :odrl/All,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "All",
   :skos/definition
   "Specifies that the scope of the relationship is all of the collective individuals within a context.",
   :skos/note
   "For example, may be used to indicate all the users of a specific social network the party is a member of. Note that “group” scope is also assumed.",
   :skos/scopeNote "Non-Normative"})

(def All2ndConnections
  "Specifies that the scope of the relationship is all of the second-level connections to the Party."
  {:db/ident :odrl/All2ndConnections,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "All Second-level Connections",
   :skos/definition
   "Specifies that the scope of the relationship is all of the second-level connections to the Party.",
   :skos/note
   "For example, may be used to indicate all “friends of friends” of the Party. Note that “group” scope is also assumed.",
   :skos/scopeNote "Non-Normative"})

(def AllConnections
  "Specifies that the scope of the relationship is all of the first-level connections of the Party."
  {:db/ident :odrl/AllConnections,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "All First-Level Connections",
   :skos/definition
   "Specifies that the scope of the relationship is all of the first-level connections of the Party.",
   :skos/note
   "For example, may be used to indicate all “friends” of the Party. Note that “group” scope is also assumed.",
   :skos/scopeNote "Non-Normative"})

(def AllGroups
  "Specifies that the scope of the relationship is all of the group connections of the Party."
  {:db/ident :odrl/AllGroups,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "All Group Connections",
   :skos/definition
   "Specifies that the scope of the relationship is all of the group connections of the Party.",
   :skos/note
   "For example, may be used to indicate all groups that the Party is a member of. Note that “group” scope is also assumed.",
   :skos/scopeNote "Non-Normative"})

(def Assertion
  "A Policy that asserts a Rule over an Asset from parties."
  {:db/ident :odrl/Assertion,
   :owl/disjointWith [:odrl/Offer :odrl/Privacy :odrl/Request :odrl/Ticket],
   :rdf/type [:rdfs/Class :owl/Class :skos/Concept],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Assertion",
   :rdfs/subClassOf [:odrl/Policy :odrl/Assertion :rdfs/Resource],
   :skos/definition "A Policy that asserts a Rule over an Asset from parties.",
   :skos/note
   "For example, a party (an assignee or assigner) can claim what terms they have over an Asset. An Assertion Policy does not grant such permissions/prohibitions but only asserts the parties claims. An Assetion Policy  MUST contain a target Asset, a Party with any functional role, and at least one of a Permission or Prohibition rule.",
   :skos/scopeNote "Non-Normative"})

(def Asset
  "A resource or a collection of resources that are the subject of a Rule."
  {:db/ident :odrl/Asset,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Asset",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Asset],
   :skos/definition
   "A resource or a collection of resources that are the subject of a Rule.",
   :skos/note
   "The Asset entity can be any form of identifiable resource, such as data/information, content/media, applications, or services. Furthermore, it can be used to represent other Asset entities that are needed to undertake the Policy expression, such as with the Duty entity. To describe more details about the Asset, it is recommended to use Dublin Core [[dcterms]] elements or other content metadata."})

(def AssetCollection
  "An Asset that is collection of individual resources"
  {:db/ident         :odrl/AssetCollection,
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Asset Collection",
   :rdfs/subClassOf  [:rdfs/Resource :odrl/Asset :odrl/AssetCollection],
   :skos/definition  "An Asset that is collection of individual resources"})

(def AssetScope
  "Scopes for Asset Scope expressions."
  {:db/ident :odrl/AssetScope,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Asset Scope",
   :rdfs/subClassOf [:rdfs/Resource :odrl/AssetScope],
   :skos/definition "Scopes for Asset Scope expressions.",
   :skos/note
   "Instances of the AssetScope class represent the terms for the scope property of Assets."})

(def ConflictTerm
  "Used to establish strategies to resolve conflicts that arise from the merging of Policies or conflicts between Permissions and Prohibitions in the same Policy."
  {:db/ident :odrl/ConflictTerm,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Conflict Strategy Preference",
   :rdfs/subClassOf [:rdfs/Resource :odrl/ConflictTerm],
   :skos/definition
   "Used to establish strategies to resolve conflicts that arise from the merging of Policies or conflicts between Permissions and Prohibitions in the same Policy.",
   :skos/note
   "Instances of ConflictTerm describe strategies for resolving conflicts."})

(def Constraint
  "A boolean expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule."
  {:db/ident :odrl/Constraint,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Constraint",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Constraint],
   :skos/definition
   "A boolean expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule."})

(def Duty
  "The obligation to perform an Action"
  {:db/ident         :odrl/Duty,
   :owl/disjointWith [:odrl/Permission :odrl/Prohibition],
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Duty",
   :rdfs/subClassOf  [:odrl/Rule :odrl/Duty :rdfs/Resource],
   :skos/definition  "The obligation to perform an Action"})

(def Group
  "Specifies that the scope of the relationship is the defined group with multiple individual members."
  {:db/ident :odrl/Group,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Group",
   :skos/definition
   "Specifies that the scope of the relationship is the defined group with multiple individual members.",
   :skos/scopeNote "Non-Normative"})

(def Individual
  "Specifies that the scope of the relationship is the single Party individual."
  {:db/ident :odrl/Individual,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/PartyScope :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Individual",
   :skos/definition
   "Specifies that the scope of the relationship is the single Party individual."})

(def LeftOperand
  "Left operand for a constraint expression."
  {:db/ident :odrl/LeftOperand,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Left Operand",
   :rdfs/subClassOf [:rdfs/Resource :odrl/LeftOperand],
   :skos/definition "Left operand for a constraint expression.",
   :skos/note
   "Instances of the LeftOperand class are used as the leftOperand of a Constraint."})

(def LogicalConstraint
  "A logical expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule."
  {:db/ident :odrl/LogicalConstraint,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Logical Constraint",
   :rdfs/subClassOf [:rdfs/Resource :odrl/LogicalConstraint],
   :skos/definition
   "A logical expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule."})

(def Offer
  "A Policy that proposes a Rule over an Asset from an assigner."
  {:db/ident :odrl/Offer,
   :owl/disjointWith
   [:odrl/Agreement :odrl/Privacy :odrl/Ticket :odrl/Request :odrl/Assertion],
   :rdf/type [:skos/Concept :rdfs/Class :owl/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Offer",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Offer],
   :skos/definition
   "A Policy that proposes a Rule over an Asset from an assigner.",
   :skos/note
   "An Offer Policy MUST contain at least one Permission or Prohibition rule and a Party with Assigner function (in the same Permission or Prohibition). The Offer Policy MAY contain a Party with Assignee function, but MUST not grant any privileges to that Party."})

(def Operator
  "Operator for constraint expression."
  {:db/ident :odrl/Operator,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Operator",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Operator],
   :skos/definition "Operator for constraint expression.",
   :skos/note
   "Instances of the Operator class representing relational operators."})

(def Party
  "An entity or a collection of entities that undertake Roles in a Rule."
  {:db/ident :odrl/Party,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Party",
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
   "An entity or a collection of entities that undertake Roles in a Rule.",
   :skos/note
   "The Party entity could be a person, group of people, organisation, or agent. An agent is a person or thing that takes an active role or produces a specified effect. To describe more details about the Party, it is recommended to use W3C vCard Ontology [[vcard-rdf]] or FOAF Vocabulary [[foaf]]."})

(def PartyCollection
  "A Party that is a group of individual entities"
  {:db/ident         :odrl/PartyCollection,
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Party Collection",
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
   :skos/definition  "A Party that is a group of individual entities"})

(def PartyScope
  "Scopes for Party Scope expressions."
  {:db/ident :odrl/PartyScope,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Party Scope",
   :rdfs/subClassOf [:rdfs/Resource :odrl/PartyScope],
   :skos/definition "Scopes for Party Scope expressions.",
   :skos/note
   "Instances of the PartyScope class represent the terms for the scope property of Parties."})

(def Permission
  "The ability to perform an Action over an Asset."
  {:db/ident         :odrl/Permission,
   :owl/disjointWith [:odrl/Duty :odrl/Prohibition],
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Permission",
   :rdfs/subClassOf  [:odrl/Rule :odrl/Permission :rdfs/Resource],
   :skos/definition  "The ability to perform an Action over an Asset."})

(def Policy
  "A non-empty group of Permissions and/or Prohibitions."
  {:db/ident         :odrl/Policy,
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Policy",
   :rdfs/subClassOf  [:rdfs/Resource :odrl/Policy],
   :skos/definition  "A non-empty group of Permissions and/or Prohibitions.",
   :skos/note        "A Policy may contain multiple Rules."})

(def Privacy
  "A Policy that expresses a Rule over an Asset containing personal information."
  {:db/ident :odrl/Privacy,
   :owl/disjointWith
   [:odrl/Assertion :odrl/Ticket :odrl/Offer :odrl/Agreement :odrl/Request],
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Privacy Policy",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Privacy],
   :skos/definition
   "A Policy that expresses a Rule over an Asset containing personal information.",
   :skos/note
   "A Privacy Policy  MUST contain a target Asset, a Party with Assigner  is, a Party with Assignee function, and at least one of a Permission or Prohibition rule that MUST include a Duty. The target Asset SHOULD contain or relate to personal information about the Assignee. The Duty MUST describe obligations on the Assigner about managing the Asset. The Assignee is being granted the terms of the Privacy policy from the Assigner.",
   :skos/scopeNote "Non-Normative"})

(def Prohibition
  "The inability to perform an Action over an Asset."
  {:db/ident         :odrl/Prohibition,
   :owl/disjointWith [:odrl/Permission :odrl/Duty],
   :rdf/type         [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Prohibition",
   :rdfs/subClassOf  [:rdfs/Resource :odrl/Rule :odrl/Prohibition],
   :skos/definition  "The inability to perform an Action over an Asset."})

(def Request
  "A Policy that proposes a Rule over an Asset from an assignee."
  {:db/ident :odrl/Request,
   :owl/disjointWith
   [:odrl/Assertion :odrl/Agreement :odrl/Privacy :odrl/Ticket :odrl/Offer],
   :rdf/type [:skos/Concept :rdfs/Class :owl/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Request",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Request],
   :skos/definition
   "A Policy that proposes a Rule over an Asset from an assignee.",
   :skos/note
   "A Request Policy  MUST contain a target Asset, a Party with Assignee function, and at least one of a Permission or Prohibition rule. The Request MAY also contain the Party with Assigner function if this is known. No privileges are granted to any Party.",
   :skos/scopeNote "Non-Normative"})

(def RightOperand
  "Right operand for constraint expression."
  {:db/ident :odrl/RightOperand,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Right Operand",
   :rdfs/subClassOf [:rdfs/Resource :odrl/RightOperand],
   :skos/definition "Right operand for constraint expression.",
   :skos/note
   "Instances of the RightOperand class are used as the rightOperand of a Constraint."})

(def Rule
  "An abstract concept that represents the common characteristics of Permissions, Prohibitions, and Duties."
  {:db/ident :odrl/Rule,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Rule",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Rule],
   :skos/definition
   "An abstract concept that represents the common characteristics of Permissions, Prohibitions, and Duties.",
   :skos/note "Rule is an abstract concept."})

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
   :rdfs/label "Set",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Set],
   :skos/definition "A Policy that expresses a Rule over an Asset.",
   :skos/note
   "A Set Policy MUST contain a target Asset, and at least one Rule. A Set Policy is the default Policy subclass. The Set is aimed at scenarios where there is an open criteria for the semantics of the policy expressions and typically refined by other systems/profiles that process the information at a later time. No privileges are granted to any Party (if defined)."})

(def Ticket
  "A Policy that grants the holder a Rule over an Asset from an assigner."
  {:db/ident :odrl/Ticket,
   :owl/disjointWith
   [:odrl/Agreement :odrl/Privacy :odrl/Request :odrl/Offer :odrl/Assertion],
   :rdf/type [:owl/Class :rdfs/Class :skos/Concept],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Ticket",
   :rdfs/subClassOf [:rdfs/Resource :odrl/Policy :odrl/Ticket],
   :skos/definition
   "A Policy that grants the holder a Rule over an Asset from an assigner.",
   :skos/note
   "A Ticket Policy MUST contain a target Asset and at least one of a Permission or Prohibition rule.  The Ticket MAY contain the Party with Assigner function and MUST NOT contain an Assignee. The Ticket Policy will grant the terms of the Policy to the holder of that Ticket. The holder of the Ticket MAY remain unknown or MAY have to be identified at some later stage.",
   :skos/scopeNote "Non-Normative"})

(def UndefinedTerm
  "Is used to indicate how to support Actions that are not part of any vocabulary or profile in the policy expression system."
  {:db/ident :odrl/UndefinedTerm,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/Class :rdfs/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Undefined Term",
   :rdfs/subClassOf [:rdfs/Resource :odrl/UndefinedTerm],
   :skos/definition
   "Is used to indicate how to support Actions that are not part of any vocabulary or profile in the policy expression system.",
   :skos/note
   "Instances of UndefinedTerm describe strategies for processing unsupported actions."})

(def absolutePosition
  "A point in space or time defined with absolute coordinates for the positioning of the target Asset."
  {:db/ident :odrl/absolutePosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Absolute Asset Position",
   :skos/definition
   "A point in space or time defined with absolute coordinates for the positioning of the target Asset.",
   :skos/note
   "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it.",
   :skos/scopeNote "Non-Normative"})

(def absoluteSize
  "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects of the target Asset."
  {:db/ident :odrl/absoluteSize,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Absolute Asset Size",
   :skos/definition
   "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects of the target Asset.",
   :skos/note
   "Example: The image can be resized in width to a maximum of 1000px.",
   :skos/scopeNote "Non-Normative"})

(def absoluteSpatialPosition
  "The absolute spatial positions of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space for the target Asset to fit."
  {:db/ident :odrl/absoluteSpatialPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Absolute Spatial Asset Position",
   :skos/broaderTransitive :odrl/absolutePosition,
   :skos/definition
   "The absolute spatial positions of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space for the target Asset to fit.",
   :skos/note
   "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it. Note: see also the Left Operand Relative Spatial Asset Position. ",
   :skos/scopeNote "Non-Normative"})

(def absoluteTemporalPosition
  "The absolute temporal positions in a media stream the target Asset has to fit."
  {:db/ident :odrl/absoluteTemporalPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Absolute Temporal Asset Position",
   :skos/broaderTransitive :odrl/absolutePosition,
   :skos/definition
   "The absolute temporal positions in a media stream the target Asset has to fit.",
   :skos/note
   "Use with Actions including the target Asset in a larger media stream. The fragment part of a Media Fragment URI (https://www.w3.org/TR/media-frags/) may be used for the right operand. See the Left Operand realativeTemporalPosition. <br />Example: The MP3 music file must be positioned between second 192 and 250 of the temporal length of a stream.",
   :skos/scopeNote "Non-Normative"})

(def acceptTracking
  "To accept that the use of the Asset may be tracked."
  {:db/ident :odrl/acceptTracking,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Accept Tracking",
   :skos/definition "To accept that the use of the Asset may be tracked.",
   :skos/note
   "The collected information may be tracked by the Assigner, or may link to a Party with the role 'trackingParty' function.",
   :skos/scopeNote "Non-Normative"})

(def action
  "The operation relating to the Asset for which the Rule is being subjected."
  {:db/ident :odrl/action,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Has Action",
   :rdfs/range :odrl/Action,
   :rdfs/subPropertyOf :odrl/action,
   :skos/definition
   "The operation relating to the Asset for which the Rule is being subjected."})

(def actionConcepts
  "Action"
  {:db/ident       :odrl/actionConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/implies :odrl/includedIn :odrl/action :odrl/Action],
   :skos/prefLabel "Action",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def actions
  "Actions for Rules"
  {:db/ident       :odrl/actions,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/transfer :odrl/use],
   :skos/prefLabel "Actions for Rules",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

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
   :skos/prefLabel "Actions for Rules",
   :skos/scopeNote "ODRL Common Vocabulary Terms"})

(def adHocShare
  "The act of sharing the asset to parties in close proximity to the owner."
  {:db/ident :odrl/adHocShare,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Ad-hoc sharing",
   :skos/definition
   "The act of sharing the asset to parties in close proximity to the owner.",
   :skos/note
   "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/adhoc-share ."})

(def aggregate
  "To use the Asset or parts of it as part of a composite collection."
  {:db/ident :odrl/aggregate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Aggregate",
   :skos/definition
   "To use the Asset or parts of it as part of a composite collection.",
   :skos/scopeNote "Non-Normative"})

(def and
  "The relation is satisfied when all of the Constraints are satisfied."
  {:db/ident :odrl/and,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "And",
   :rdfs/subPropertyOf [:odrl/operand :odrl/and],
   :skos/definition
   "The relation is satisfied when all of the Constraints are satisfied.",
   :skos/note
   "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances."})

(def andSequence
  "The relation is satisfied when each of the Constraints are satisfied in the order specified."
  {:db/ident :odrl/andSequence,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "And Sequence",
   :rdfs/subPropertyOf [:odrl/operand :odrl/andSequence],
   :skos/definition
   "The relation is satisfied when each of the Constraints are satisfied in the order specified.",
   :skos/note
   "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances. The order of the list MUST be preserved. The andSequence operator is an example where there may be temporal conditional requirements between the operands. This may lead to situations where the outcome is unresolvable, such as deadlock if one of the Constraints is unable to be satisfied. ODRL Processing systems SHOULD plan for these scenarios and implement mechanisms to resolve them."})

(def annotate
  "To add explanatory notations/commentaries to the Asset without modifying the Asset in any other way."
  {:db/ident :odrl/annotate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Annotate",
   :skos/definition
   "To add explanatory notations/commentaries to the Asset without modifying the Asset in any other way.",
   :skos/scopeNote "Non-Normative"})

(def anonymize
  "To anonymize all or parts of the Asset."
  {:db/ident :odrl/anonymize,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Anonymize",
   :skos/definition "To anonymize all or parts of the Asset.",
   :skos/note
   "For example, to remove identifying particulars for statistical or for other comparable purposes, or to use the Asset without stating the author/source.",
   :skos/scopeNote "Non-Normative"})

(def append
  "The act of adding to the end of an asset."
  {:db/ident         :odrl/append,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Append",
   :skos/definition  "The act of adding to the end of an asset.",
   :skos/exactMatch  :odrl/modify})

(def appendTo
  "The act of appending data to the Asset without modifying the Asset in any other way."
  {:db/ident :odrl/appendTo,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Append To",
   :skos/definition
   "The act of appending data to the Asset without modifying the Asset in any other way.",
   :skos/exactMatch :odrl/modify})

(def archive
  "To store the Asset (in a non-transient form)."
  {:db/ident :odrl/archive,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Archive",
   :skos/definition "To store the Asset (in a non-transient form).",
   :skos/note "Temporal constraints may be used for temporal conditions.",
   :skos/scopeNote "Non-Normative"})

(def assetConcepts
  "Asset"
  {:db/ident       :odrl/assetConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/AssetCollection :odrl/Asset],
   :skos/prefLabel "Asset",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def assetParty
  "Asset and Party"
  {:db/ident       :odrl/assetParty,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/source :odrl/partOf],
   :skos/prefLabel "Asset and Party",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def assetRelations
  "Asset Relations"
  {:db/ident       :odrl/assetRelations,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/hasPolicy :odrl/target],
   :skos/prefLabel "Asset Relations",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def assetRelationsCommon
  "Asset Relations"
  {:db/ident       :odrl/assetRelationsCommon,
   :rdf/type       :skos/Collection,
   :skos/member    :odrl/output,
   :skos/prefLabel "Asset Relations",
   :skos/scopeNote "ODRL Common Vocabulary Terms"})

(def assignee
  "The Party is the recipient of the Rule."
  {:db/ident           :odrl/assignee,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        {:owl/unionOf [:odrl/Rule :odrl/Policy],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Assignee",
   :rdfs/range         :odrl/Party,
   :rdfs/subPropertyOf [:odrl/function :odrl/assignee],
   :skos/definition    "The Party is the recipient of the Rule."})

(def assigneeOf
  "Identifies an ODRL Policy for which the identified Party undertakes the assignee functional role."
  {:db/ident :odrl/assigneeOf,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Party,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Assignee Of",
   :rdfs/range :odrl/Policy,
   :rdfs/subPropertyOf :odrl/assigneeOf,
   :skos/definition
   "Identifies an ODRL Policy for which the identified Party undertakes the assignee functional role.",
   :skos/note
   "When assigneeOf has been asserted between a metadata expression and an ODRL Policy, the Party being identified MUST be inferred to undertake the assignee functional role of all the Rules of that Policy."})

(def assigner
  "The Party is the issuer of the Rule."
  {:db/ident           :odrl/assigner,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        {:owl/unionOf [:odrl/Rule :odrl/Policy],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Assigner",
   :rdfs/range         :odrl/Party,
   :rdfs/subPropertyOf [:odrl/function :odrl/assigner],
   :skos/definition    "The Party is the issuer of the Rule."})

(def assignerOf
  "Identifies an ODRL Policy for which the identified Party undertakes the assigner functional role."
  {:db/ident :odrl/assignerOf,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Party,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Assigner Of",
   :rdfs/range :odrl/Policy,
   :rdfs/subPropertyOf :odrl/assignerOf,
   :skos/definition
   "Identifies an ODRL Policy for which the identified Party undertakes the assigner functional role.",
   :skos/note
   "When assignerOf has been asserted between a metadata expression and an ODRL Policy, the Party being identified MUST be inferred to undertake the assigner functional role of all the Rules of that Policy."})

(def attachPolicy
  "The act of keeping the policy notice with the asset."
  {:db/ident         :odrl/attachPolicy,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Attach policy",
   :skos/definition  "The act of keeping the policy notice with the asset.",
   :skos/exactMatch  :cc/Notice})

(def attachSource
  "The act of attaching the source of the asset and its derivatives."
  {:db/ident :odrl/attachSource,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Attach source",
   :skos/definition
   "The act of attaching the source of the asset and its derivatives.",
   :skos/exactMatch :cc/SourceCode})

(def attribute
  "To attribute the use of the Asset."
  {:db/ident :odrl/attribute,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Attribute",
   :skos/definition "To attribute the use of the Asset.",
   :skos/note
   "May link to an Asset with the attribution information. May link to a Party with the  role “attributedParty” function.",
   :skos/scopeNote "Non-Normative"})

(def attributedParty
  "The Party to be attributed."
  {:db/ident           :odrl/attributedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Attributed Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/attributedParty],
   :skos/definition    "The Party to be attributed.",
   :skos/note          "Maybe specified as part of the attribute action.",
   :skos/scopeNote     "Non-Normative"})

(def attributingParty
  "The Party who undertakes the attribution."
  {:db/ident           :odrl/attributingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Attributing Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/attributingParty],
   :skos/definition    "The Party who undertakes the attribution.",
   :skos/note          "Maybe specified as part of the attribute action.",
   :skos/scopeNote     "Non-Normative"})

(def commercialize
  "The act of using the asset in a business environment."
  {:db/ident         :odrl/commercialize,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Commercialize",
   :skos/definition  "The act of using the asset in a business environment.",
   :skos/exactMatch  :cc/CommercialUse})

(def compensate
  "To compensate by transfer of some amount of value, if defined, for using or selling the Asset."
  {:db/ident :odrl/compensate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Compensate",
   :skos/definition
   "To compensate by transfer of some amount of value, if defined, for using or selling the Asset.",
   :skos/note
   "The compensation may use different types of things with a value: (i) the thing is expressed by the value (term) of the Constraint name; (b) the value is expressed by operator, rightOperand, dataType and unit. Typically the assignee will compensate the assigner, but other compensation party roles may be used.",
   :skos/scopeNote "Non-Normative"})

(def compensatedParty
  "The Party is the recipient of the compensation."
  {:db/ident           :odrl/compensatedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Compensated Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/compensatedParty],
   :skos/definition    "The Party is the recipient of the compensation.",
   :skos/note          "Maybe specified as part of the compensate duty action.",
   :skos/scopeNote     "Non-Normative"})

(def compensatingParty
  "The Party that is the provider of the compensation."
  {:db/ident           :odrl/compensatingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Compensating Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/compensatingParty],
   :skos/definition    "The Party that is the provider of the compensation.",
   :skos/note          "Maybe specified as part of the compensate duty action.",
   :skos/scopeNote     "Non-Normative"})

(def concurrentUse
  "To create multiple copies of the Asset that are being concurrently used."
  {:db/ident :odrl/concurrentUse,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Concurrent Use",
   :skos/definition
   "To create multiple copies of the Asset that are being concurrently used.",
   :skos/scopeNote "Non-Normative"})

(def conflict
  "The conflict-resolution strategy for a Policy."
  {:db/ident           :odrl/conflict,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        :odrl/Policy,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Handle Policy Conflicts",
   :rdfs/range         :odrl/ConflictTerm,
   :rdfs/subPropertyOf :odrl/conflict,
   :skos/definition    "The conflict-resolution strategy for a Policy.",
   :skos/note          "If no strategy is specified, the default is invalid."})

(def conflictConcepts
  "Policy Conflict Strategy"
  {:db/ident :odrl/conflictConcepts,
   :rdf/type :skos/Collection,
   :skos/member
   [:odrl/invalid :odrl/prohibit :odrl/perm :odrl/conflict :odrl/ConflictTerm],
   :skos/prefLabel "Policy Conflict Strategy",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def consentedParty
  "The Party who obtains the consent."
  {:db/ident           :odrl/consentedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Consented Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/consentedParty],
   :skos/definition    "The Party who obtains the consent.",
   :skos/note          "Maybe specified as part of the obtainConsent action.",
   :skos/scopeNote     "Non-Normative"})

(def consentingParty
  "The Party to obtain consent from."
  {:db/ident           :odrl/consentingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Consenting Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/consentingParty],
   :skos/definition    "The Party to obtain consent from.",
   :skos/note          "Maybe specified as part of the obtainConsent action.",
   :skos/scopeNote     "Non-Normative"})

(def consequence
  "Relates a Duty to another Duty, the latter being a consequence of not fulfilling the former."
  {:db/ident :odrl/consequence,
   :rdf/type [:skos/Concept :rdf/Property :owl/ObjectProperty],
   :rdfs/domain :odrl/Duty,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Consequence",
   :rdfs/range :odrl/Duty,
   :rdfs/subPropertyOf [:odrl/failure :odrl/consequence],
   :skos/definition
   "Relates a Duty to another Duty, the latter being a consequence of not fulfilling the former.",
   :skos/note
   "The consequence property is utilised to express the repercussions of not fulfilling an agreed Policy obligation or duty for a Permission. If either of these fails to be fulfilled, then this will result in the consequence Duty also becoming a new requirement, meaning that the original obligation or duty, as well as the consequence Duty must all be fulfilled"})

(def constraint
  "Constraint applied to a Rule"
  {:db/ident :odrl/constraint,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Policy :odrl/Rule],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Has Constraint",
   :rdfs/range {:owl/unionOf [:odrl/Constraint :odrl/LogicalConstraint],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :odrl/constraint,
   :skos/definition "Constraint applied to a Rule",
   :skos/note
   "Constraints on Rules are used to determine if a rule is Active or not. Example: the Permission rule is only active during the year 2018."})

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
   :skos/prefLabel "Constraint Left Operands",
   :skos/scopeNote "ODRL Common Vocabulary Terms"})

(def constraintLogicalOperands
  "Logical Constraint Operands"
  {:db/ident       :odrl/constraintLogicalOperands,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/andSequence :odrl/and :odrl/xone :odrl/or],
   :skos/prefLabel "Logical Constraint Operands",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

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
   :skos/prefLabel "Constraint Operators",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def constraintRightOpCommon
  "Constraint Right Operands"
  {:db/ident       :odrl/constraintRightOpCommon,
   :rdf/type       :skos/Collection,
   :skos/member    :odrl/policyUsage,
   :skos/prefLabel "Constraint Right Operands",
   :skos/scopeNote "ODRL Common Vocabulary Terms"})

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
   :skos/prefLabel "Constraint",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def contractedParty
  "The Party who is being contracted."
  {:db/ident           :odrl/contractedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Contracted Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/contractedParty],
   :skos/definition    "The Party who is being contracted.",
   :skos/scopeNote     "Non-Normative"})

(def contractingParty
  "The Party who is offering the contract."
  {:db/ident           :odrl/contractingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Contracting Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/contractingParty],
   :skos/definition    "The Party who is offering the contract.",
   :skos/scopeNote     "Non-Normative"})

(def copy
  "The act of making an exact reproduction of the asset."
  {:db/ident         :odrl/copy,
   :owl/deprecated   true,
   :owl/sameAs       :odrl/reproduce,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Copy",
   :skos/definition  "The act of making an exact reproduction of the asset.",
   :skos/exactMatch  :odrl/reproduce})

(def core
  "Identifier for the ODRL Core Profile"
  {:db/ident         :odrl/core,
   :rdf/type         [:skos/Concept :owl/Thing],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "ODRL Core Profile",
   :skos/definition  "Identifier for the ODRL Core Profile"})

(def count
  "Numeric count of executions of the action of the Rule."
  {:db/ident         :odrl/count,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/LeftOperand
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Count",
   :skos/definition  "Numeric count of executions of the action of the Rule.",
   :skos/scopeNote   "Non-Normative"})

(def dataType
  "The datatype of the value of the rightOperand or rightOperandReference of a Constraint."
  {:db/ident :odrl/dataType,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Datatype",
   :rdfs/range :rdfs/Datatype,
   :rdfs/subPropertyOf :odrl/dataType,
   :skos/definition
   "The datatype of the value of the rightOperand or rightOperandReference of a Constraint.",
   :skos/note
   "In RDF encodings, use of the rdf:datatype MUST be used. In JSON-LD encoding, the use of @type MUST be used."})

(def dateTime
  "The date (and optional time and timezone) of exercising the action of the Rule. Right operand value MUST be an xsd:date or xsd:dateTime as defined by [[xmlschema11-2]]."
  {:db/ident :odrl/dateTime,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Datetime",
   :skos/definition
   "The date (and optional time and timezone) of exercising the action of the Rule. Right operand value MUST be an xsd:date or xsd:dateTime as defined by [[xmlschema11-2]].",
   :skos/note
   "The use of Timezone information is strongly recommended. The Rule may be exercised before (with operator lt/lteq) or after (with operator gt/gteq) the date(time) defined by the Right operand. <br />Example: <code>dateTime gteq 2017-12-31T06:00Z</code> means the Rule can only be exercised after (and including) 6:00AM on the 31st Decemeber 2017 UTC time.",
   :skos/scopeNote "Non-Normative"})

(def delayPeriod
  "A time delay period prior to exercising the action of the Rule. The point in time triggering this period MAY be defined by another temporal Constraint combined by a Logical Constraint (utilising the odrl:andSequence operand). Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."
  {:db/ident :odrl/delayPeriod,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Delay Period",
   :skos/definition
   "A time delay period prior to exercising the action of the Rule. The point in time triggering this period MAY be defined by another temporal Constraint combined by a Logical Constraint (utilising the odrl:andSequence operand). Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].",
   :skos/note
   "Only the eq, gt, gteq operators SHOULD be used. <br />Example: <code>delayPeriod eq P60M</code> indicates a delay of 60 Minutes before exercising the action.",
   :skos/scopeNote "Non-Normative"})

(def delete
  "To permanently remove all copies of the Asset after it has been used."
  {:db/ident :odrl/delete,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Delete",
   :skos/definition
   "To permanently remove all copies of the Asset after it has been used.",
   :skos/note
   "Use a constraint to define under which conditions the Asset must be deleted.",
   :skos/scopeNote "Non-Normative"})

(def deliveryChannel
  "The delivery channel used for exercising the action of the Rule."
  {:db/ident :odrl/deliveryChannel,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Delivery Channel",
   :skos/definition
   "The delivery channel used for exercising the action of the Rule.",
   :skos/note "Example: the asset may be distributed only on mobile networks.",
   :skos/scopeNote "Non-Normative"})

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
   :skos/prefLabel "Deprecated Terms"})

(def derive
  "To create a new derivative Asset from this Asset and to edit or modify the derivative."
  {:db/ident :odrl/derive,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Derive",
   :skos/definition
   "To create a new derivative Asset from this Asset and to edit or modify the derivative.",
   :skos/note
   "A new asset is created and may have significant overlaps with the original Asset. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective). To the derived Asset a next policy may be applied.",
   :skos/scopeNote "Non-Normative"})

(def device
  "An identified device used for exercising the action of the Rule."
  {:db/ident :odrl/device,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Device",
   :skos/definition
   "An identified device used for exercising the action of the Rule.",
   :skos/exactMatch :odrl/systemDevice,
   :skos/note "See System Device."})

(def digitize
  "To produce a digital copy of (or otherwise digitize) the Asset from its analogue form."
  {:db/ident :odrl/digitize,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Digitize",
   :skos/definition
   "To produce a digital copy of (or otherwise digitize) the Asset from its analogue form.",
   :skos/scopeNote "Non-Normative"})

(def display
  "To create a static and transient rendition of an Asset."
  {:db/ident :odrl/display,
   :odrl/includedIn :odrl/play,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Display",
   :skos/definition "To create a static and transient rendition of an Asset.",
   :skos/note
   "For example, displaying an image on a screen. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used.",
   :skos/scopeNote "Non-Normative"})

(def distribute
  "To supply the Asset to third-parties."
  {:db/ident :odrl/distribute,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Distribute",
   :skos/definition "To supply the Asset to third-parties.",
   :skos/note
   "It is recommended to use nextPolicy to express the allowable usages by third-parties.",
   :skos/scopeNote "Non-Normative"})

(def duties
  "Duty"
  {:db/ident :odrl/duties,
   :rdf/type :skos/Collection,
   :skos/member
   [:odrl/remedy :odrl/consequence :odrl/duty :odrl/obligation :odrl/Duty],
   :skos/prefLabel "Duty",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def duty
  "Relates an individual Duty to a Permission."
  {:db/ident :odrl/duty,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Permission,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Has Duty",
   :rdfs/range :odrl/Duty,
   :rdfs/subPropertyOf :odrl/duty,
   :skos/definition "Relates an individual Duty to a Permission.",
   :skos/note
   "A Duty is a pre-condition which must be fulfilled in order to receive the Permission."})

(def elapsedTime
  "A continuous elapsed time period which may be used for exercising of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."
  {:db/ident :odrl/elapsedTime,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Elapsed Time",
   :skos/definition
   "A continuous elapsed time period which may be used for exercising of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].",
   :skos/note
   "Only the eq, lt, lteq operators SHOULD be used. See also Metered Time. <br />Example: <code>elpasedTime eq P60M</code> indicates a total elapsed time of 60 Minutes.",
   :skos/scopeNote "Non-Normative"})

(def ensureExclusivity
  "To ensure that the Rule on the Asset is exclusive."
  {:db/ident :odrl/ensureExclusivity,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Ensure Exclusivity",
   :skos/definition "To ensure that the Rule on the Asset is exclusive.",
   :skos/note
   "If used as a Duty, the assignee should be explicitly indicated as the party that is ensuring the exclusivity of the Rule.",
   :skos/scopeNote "Non-Normative"})

(def eq
  "Indicating that a given value equals the right operand of the Constraint."
  {:db/ident :odrl/eq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Equal to",
   :skos/definition
   "Indicating that a given value equals the right operand of the Constraint."})

(def event
  "An identified event setting a context for exercising the action of the Rule."
  {:db/ident :odrl/event,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Event",
   :skos/definition
   "An identified event setting a context for exercising the action of the Rule.",
   :skos/note
   "Events are temporal periods of time, and operators can be used to signal before (lt), during (eq) or after (gt) the event. <br />Example: May be taken during the “FIFA World Cup 2020” only.",
   :skos/scopeNote "Non-Normative"})

(def execute
  "To run the computer program Asset."
  {:db/ident :odrl/execute,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Execute",
   :skos/definition "To run the computer program Asset.",
   :skos/note
   "For example, machine executable code or Java such as a game or application.",
   :skos/scopeNote "Non-Normative"})

(def export
  "The act of transforming the asset into a new form."
  {:db/ident         :odrl/export,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Export",
   :skos/definition  "The act of transforming the asset into a new form.",
   :skos/exactMatch  :odrl/transform})

(def extract
  "To extract parts of the Asset and to use it as a new Asset."
  {:db/ident :odrl/extract,
   :odrl/includedIn :odrl/reproduce,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Extract",
   :skos/definition
   "To extract parts of the Asset and to use it as a new Asset.",
   :skos/note
   "A new asset is created and may have very little in common with the original Asset. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective). To the extracted Asset a next policy may be applied.",
   :skos/scopeNote "Non-Normative"})

(def extractChar
  "The act of extracting (replicating) unchanged characters from the asset."
  {:db/ident :odrl/extractChar,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Extract character",
   :skos/definition
   "The act of extracting (replicating) unchanged characters from the asset.",
   :skos/note
   "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-char ."})

(def extractPage
  "The act of extracting (replicating) unchanged pages from the asset."
  {:db/ident :odrl/extractPage,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Extract page",
   :skos/definition
   "The act of extracting (replicating) unchanged pages from the asset.",
   :skos/note
   "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-page ."})

(def extractWord
  "The act of extracting (replicating) unchanged words from the asset."
  {:db/ident :odrl/extractWord,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Extract word",
   :skos/definition
   "The act of extracting (replicating) unchanged words from the asset.",
   :skos/note
   "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-word ."})

(def failure
  "Failure is an abstract property that defines the violation (or unmet) relationship between Rules."
  {:db/ident :odrl/failure,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Rule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Failure",
   :rdfs/range :odrl/Rule,
   :rdfs/subPropertyOf :odrl/failure,
   :skos/definition
   "Failure is an abstract property that defines the violation (or unmet) relationship between Rules.",
   :skos/note
   "The parent property to sub-properties that express explicit failure contexts."})

(def fileFormat
  "A transformed file format of the target Asset."
  {:db/ident         :odrl/fileFormat,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/LeftOperand
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "File Format",
   :skos/definition  "A transformed file format of the target Asset.",
   :skos/note        "Example: An asset may be transformed into JPEG format.",
   :skos/scopeNote   "Non-Normative"})

(def function
  "Function is an abstract property whose sub-properties define the functional roles which may be fulfilled by a party in relation to a Rule."
  {:db/ident :odrl/function,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Function",
   :rdfs/range :odrl/Party,
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition
   "Function is an abstract property whose sub-properties define the functional roles which may be fulfilled by a party in relation to a Rule."})

(def give
  "To transfer the ownership of the Asset to a third party without compensation and while deleting the original asset."
  {:db/ident :odrl/give,
   :odrl/includedIn :odrl/transfer,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Give",
   :skos/definition
   "To transfer the ownership of the Asset to a third party without compensation and while deleting the original asset.",
   :skos/scopeNote "Non-Normative"})

(def grantUse
  "To grant the use of the Asset to third parties."
  {:db/ident :odrl/grantUse,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Grant Use",
   :skos/definition "To grant the use of the Asset to third parties.",
   :skos/note
   "This action enables the assignee to create policies for the use of the Asset for third parties. The nextPolicy is recommended to be agreed with the third party. Use of temporal constraints is recommended.",
   :skos/scopeNote "Non-Normative"})

(def gt
  "Indicating that a given value is greater than the right operand of the Constraint."
  {:db/ident :odrl/gt,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Greater than",
   :skos/definition
   "Indicating that a given value is greater than the right operand of the Constraint."})

(def gteq
  "Indicating that a given value is greater than or equal to the right operand of the Constraint."
  {:db/ident :odrl/gteq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Greater than or equal to",
   :skos/definition
   "Indicating that a given value is greater than or equal to the right operand of the Constraint."})

(def hasPart
  "A set-based operator indicating that a given value contains the right operand of the Constraint."
  {:db/ident :odrl/hasPart,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Has part",
   :skos/definition
   "A set-based operator indicating that a given value contains the right operand of the Constraint."})

(def hasPolicy
  "Identifies an ODRL Policy for which the identified Asset is the target Asset to all the Rules."
  {:db/ident :odrl/hasPolicy,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Asset,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Target Policy",
   :rdfs/range :odrl/Policy,
   :rdfs/subPropertyOf :odrl/hasPolicy,
   :skos/definition
   "Identifies an ODRL Policy for which the identified Asset is the target Asset to all the Rules.",
   :skos/note
   "The Asset being identified MUST be inferred to be the target Asset of all of the Rules of the Policy."})

(def ignore
  "The Action is to be ignored and is not part of the policy – and the policy remains valid."
  {:db/ident :odrl/ignore,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/UndefinedTerm :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Ignore Undefined Actions",
   :skos/definition
   "The Action is to be ignored and is not part of the policy – and the policy remains valid.",
   :skos/note "Used to support actions not known to the policy system."})

(def implies
  "An Action asserts that another Action is not prohibited to enable its operational semantics."
  {:db/ident :odrl/implies,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Action,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Implies",
   :rdfs/range :odrl/Action,
   :rdfs/subPropertyOf :odrl/implies,
   :skos/definition
   "An Action asserts that another Action is not prohibited to enable its operational semantics.",
   :skos/note
   "The property asserts that an instance of Action entails that the other instance of Action is not prohibited."})

(def include
  "To include other related assets in the Asset."
  {:db/ident :odrl/include,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Include",
   :skos/definition "To include other related assets in the Asset.",
   :skos/note
   "For example: bio picture must be included in the attribution. Use of a relation sub-property is required for the related assets.",
   :skos/scopeNote "Non-Normative"})

(def includedIn
  "An Action transitively asserts that another Action that encompasses its operational semantics."
  {:db/ident :odrl/includedIn,
   :rdf/type
   [:owl/ObjectProperty :owl/TransitiveProperty :rdf/Property :skos/Concept],
   :rdfs/domain :odrl/Action,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Included In",
   :rdfs/range :odrl/Action,
   :rdfs/subPropertyOf :odrl/includedIn,
   :skos/definition
   "An Action transitively asserts that another Action that encompasses its operational semantics.",
   :skos/note
   "The purpose is to explicitly assert that the semantics of the referenced instance of an other Action encompasses (includes) the semantics of this instance of Action. The includedIn property is transitive, and as such, the Actions form ancestor relationships."})

(def index
  "To record the Asset in an index."
  {:db/ident :odrl/index,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Index",
   :skos/definition "To record the Asset in an index.",
   :skos/note
   "For example, to include a link to the Asset in a search engine database.",
   :skos/scopeNote "Non-Normative"})

(def industry
  "A defined industry sector setting a context for exercising the action of the Rule."
  {:db/ident :odrl/industry,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Industry Context",
   :skos/definition
   "A defined industry sector setting a context for exercising the action of the Rule.",
   :skos/note "Example: publishing or financial industry.",
   :skos/scopeNote "Non-Normative"})

(def inform
  "To inform that an action has been performed on or in relation to the Asset."
  {:db/ident :odrl/inform,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Inform",
   :skos/definition
   "To inform that an action has been performed on or in relation to the Asset.",
   :skos/note "May link to a Party with the role 'informedParty' function.",
   :skos/scopeNote "Non-Normative"})

(def informedParty
  "The Party to be informed of all uses."
  {:db/ident           :odrl/informedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Informed Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/informedParty],
   :skos/definition    "The Party to be informed of all uses.",
   :skos/note          "Maybe specified as part of the inform action.",
   :skos/scopeNote     "Non-Normative"})

(def informingParty
  "The Party who provides the inform use data."
  {:db/ident           :odrl/informingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Informing Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/informingParty],
   :skos/definition    "The Party who provides the inform use data.",
   :skos/note          "Maybe specified as part of the inform action.",
   :skos/scopeNote     "Non-Normative"})

(def inheritAllowed
  "Indicates if the Policy entity can be inherited."
  {:db/ident           :odrl/inheritAllowed,
   :owl/deprecated     true,
   :rdf/type           [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Inheritance Allowed",
   :rdfs/subPropertyOf :odrl/inheritAllowed,
   :skos/definition    "Indicates if the Policy entity can be inherited.",
   :skos/note          "A boolean value."})

(def inheritFrom
  "Relates a (child) policy to another (parent) policy from which terms are inherited."
  {:db/ident :odrl/inheritFrom,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Policy,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Inherits From",
   :rdfs/range :odrl/Policy,
   :rdfs/subPropertyOf :odrl/inheritFrom,
   :skos/definition
   "Relates a (child) policy to another (parent) policy from which terms are inherited.",
   :skos/note "The child policy will inherit Rules from the parent policy"})

(def inheritRelation
  "Indentifies the type of inheritance."
  {:db/ident :odrl/inheritRelation,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Inherit Relation",
   :rdfs/subPropertyOf :odrl/inheritRelation,
   :skos/definition "Indentifies the type of inheritance.",
   :skos/note
   "For example, this may indicate the business scenario, such as subscription, or prior arrangements between the parties (that are not machine representable)."})

(def install
  "To load the computer program Asset onto a storage device which allows operating or running the Asset."
  {:db/ident :odrl/install,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Install",
   :skos/definition
   "To load the computer program Asset onto a storage device which allows operating or running the Asset.",
   :skos/scopeNote "Non-Normative"})

(def invalid
  "The policy is void."
  {:db/ident :odrl/invalid,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/ConflictTerm :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Void Policy",
   :skos/definition "The policy is void.",
   :skos/note "Used to indicate the policy is void for Conflict Strategy.",
   :skos/scopeNote "Non-Normative"})

(def isA
  "A set-based operator indicating that a given value is an instance of the right operand of the Constraint."
  {:db/ident :odrl/isA,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Is a",
   :skos/definition
   "A set-based operator indicating that a given value is an instance of the right operand of the Constraint."})

(def isAllOf
  "A set-based operator indicating that a given value is all of the right operand of the Constraint."
  {:db/ident :odrl/isAllOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Is all of",
   :skos/definition
   "A set-based operator indicating that a given value is all of the right operand of the Constraint."})

(def isAnyOf
  "A set-based operator indicating that a given value is any of the right operand of the Constraint."
  {:db/ident :odrl/isAnyOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Is any of",
   :skos/definition
   "A set-based operator indicating that a given value is any of the right operand of the Constraint."})

(def isNoneOf
  "A set-based operator indicating that a given value is none of the right operand of the Constraint."
  {:db/ident :odrl/isNoneOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Is none of",
   :skos/definition
   "A set-based operator indicating that a given value is none of the right operand of the Constraint."})

(def isPartOf
  "A set-based operator indicating that a given value is contained by the right operand of the Constraint."
  {:db/ident :odrl/isPartOf,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Is part of",
   :skos/definition
   "A set-based operator indicating that a given value is contained by the right operand of the Constraint."})

(def language
  "A natural language used by the target Asset."
  {:db/ident :odrl/language,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Language",
   :skos/definition "A natural language used by the target Asset.",
   :skos/note
   "Example: the asset can only be translated into Greek. Must use [[bcp47]] codes for language values.",
   :skos/scopeNote "Non-Normative"})

(def lease
  "The act of making available the asset to a third-party for a fixed period of time with exchange of value."
  {:db/ident :odrl/lease,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Lease",
   :skos/definition
   "The act of making available the asset to a third-party for a fixed period of time with exchange of value."})

(def leftOperand
  "The left operand in a constraint expression."
  {:db/ident           :odrl/leftOperand,
   :rdf/type           [:skos/Concept :rdf/Property],
   :rdfs/domain        :odrl/Constraint,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Has Left Operand",
   :rdfs/range         :odrl/LeftOperand,
   :rdfs/subPropertyOf :odrl/leftOperand,
   :skos/definition    "The left operand in a constraint expression."})

(def lend
  "The act of making available the asset to a third-party for a fixed period of time without exchange of value."
  {:db/ident :odrl/lend,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Lend",
   :skos/definition
   "The act of making available the asset to a third-party for a fixed period of time without exchange of value."})

(def license
  "The act of granting the right to use the asset to a third-party."
  {:db/ident :odrl/license,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "License",
   :skos/definition
   "The act of granting the right to use the asset to a third-party.",
   :skos/exactMatch :odrl/grantUse})

(def logicalConstraints
  "Logical Constraint"
  {:db/ident       :odrl/logicalConstraints,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/operand :odrl/LogicalConstraint],
   :skos/prefLabel "Logical Constraint",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def lt
  "Indicating that a given value is less than the right operand of the Constraint."
  {:db/ident :odrl/lt,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Less than",
   :skos/definition
   "Indicating that a given value is less than the right operand of the Constraint."})

(def lteq
  "Indicating that a given value is less than or equal to the right operand of the Constraint."
  {:db/ident :odrl/lteq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Less than or equal to",
   :skos/definition
   "Indicating that a given value is less than or equal to the right operand of the Constraint."})

(def media
  "Category of a media asset setting a context for exercising the action of the Rule."
  {:db/ident :odrl/media,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Media Context",
   :skos/definition
   "Category of a media asset setting a context for exercising the action of the Rule.",
   :skos/note
   "Example media types: electronic, print, advertising, marketing. Note: The used type should not be an IANA MediaType as they are focused on technical characteristics. ",
   :skos/scopeNote "Non-Normative"})

(def meteredTime
  "An accumulated amount of one to many metered time periods which were used for exercising the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."
  {:db/ident :odrl/meteredTime,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Metered Time",
   :skos/definition
   "An accumulated amount of one to many metered time periods which were used for exercising the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].",
   :skos/note
   "Only the eq, lt, lteq operators SHOULD be used. See also Elapsed Time. <br />Example: <code>meteredTime lteq P60M</code> indicates an accumulated period of 60 Minutes or less.",
   :skos/scopeNote "Non-Normative"})

(def modify
  "To change existing content of the Asset. A new asset is not created by this action."
  {:db/ident :odrl/modify,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Modify",
   :skos/definition
   "To change existing content of the Asset. A new asset is not created by this action.",
   :skos/note
   "This action will modify an asset which is typically updated from time to time without creating a new asset. If the result from modifying the asset should be a new asset the actions derive or extract should be used. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective).",
   :skos/scopeNote "Non-Normative"})

(def move
  "To move the Asset from one digital location to another including deleting the original copy."
  {:db/ident :odrl/move,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Move",
   :skos/definition
   "To move the Asset from one digital location to another including deleting the original copy.",
   :skos/note
   "After the Asset has been moved, the original copy must be deleted.",
   :skos/scopeNote "Non-Normative"})

(def neq
  "Indicating that a given value is not equal to the right operand of the Constraint."
  {:db/ident :odrl/neq,
   :rdf/type [:skos/Concept :owl/NamedIndividual :odrl/Operator :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Not equal to",
   :skos/definition
   "Indicating that a given value is not equal to the right operand of the Constraint."})

(def nextPolicy
  "To grant the specified Policy to a third party for their use of the Asset."
  {:db/ident :odrl/nextPolicy,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Next Policy",
   :skos/definition
   "To grant the specified Policy to a third party for their use of the Asset.",
   :skos/note "Useful for downstream policies.",
   :skos/scopeNote "Non-Normative"})

(def obligation
  "Relates an individual Duty to a Policy."
  {:db/ident           :odrl/obligation,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        :odrl/Policy,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Obligation",
   :rdfs/range         :odrl/Duty,
   :rdfs/subPropertyOf :odrl/obligation,
   :skos/definition    "Relates an individual Duty to a Policy.",
   :skos/note          "The Duty is a requirement which must be fulfilled."})

(def obtainConsent
  "To obtain verifiable consent to perform the requested action in relation to the Asset."
  {:db/ident :odrl/obtainConsent,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Obtain Consent",
   :skos/definition
   "To obtain verifiable consent to perform the requested action in relation to the Asset.",
   :skos/note
   "May be used as a Duty to ensure that the Assigner or a Party is authorized to approve such actions on a case-by-case basis. May link to a Party with the role “consentingParty” function.",
   :skos/scopeNote "Non-Normative"})

(def operand
  "Operand is an abstract property for a logical relationship."
  {:db/ident :odrl/operand,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/LogicalConstraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Operand",
   :rdfs/subPropertyOf :odrl/operand,
   :skos/definition
   "Operand is an abstract property for a logical relationship.",
   :skos/note "Sub-properties of operand are used for Logical Constraints."})

(def operator
  "The operator function applied to operands of a Constraint"
  {:db/ident :odrl/operator,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Has Operator",
   :rdfs/range :odrl/Operator,
   :rdfs/subPropertyOf :odrl/operator,
   :skos/definition
   "The operator function applied to operands of a Constraint"})

(def or
  "The relation is satisfied when at least one of the Constraints is satisfied."
  {:db/ident :odrl/or,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Or",
   :rdfs/subPropertyOf [:odrl/operand :odrl/or],
   :skos/definition
   "The relation is satisfied when at least one of the Constraints is satisfied.",
   :skos/note
   "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances."})

(def output
  "The output property specifies the Asset which is created from the output of the Action."
  {:db/ident :odrl/output,
   :rdf/type [:rdf/Property :skos/Concept :owl/ObjectProperty],
   :rdfs/domain :odrl/Rule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Output",
   :rdfs/range :odrl/Asset,
   :rdfs/subPropertyOf [:odrl/relation :odrl/output],
   :skos/definition
   "The output property specifies the Asset which is created from the output of the Action.",
   :skos/scopeNote "Non-Normative"})

(def partOf
  "Identifies an Asset/PartyCollection that the Asset/Party is a member of."
  {:db/ident :odrl/partOf,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Asset :odrl/Party],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Part Of",
   :rdfs/range {:owl/unionOf [:odrl/AssetCollection :odrl/PartyCollection],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :odrl/partOf,
   :skos/definition
   "Identifies an Asset/PartyCollection that the Asset/Party is a member of."})

(def partyConcepts
  "Party"
  {:db/ident       :odrl/partyConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/PartyCollection :odrl/Party],
   :skos/prefLabel "Party",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def partyRoles
  "Party Functions"
  {:db/ident       :odrl/partyRoles,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/assignerOf
                    :odrl/assigneeOf
                    :odrl/assigner
                    :odrl/assignee],
   :skos/prefLabel "Party Functions",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

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
   :skos/prefLabel "Party Functions",
   :skos/scopeNote "ODRL Common Vocabulary Terms"})

(def pay
  "The act of paying a financial amount to a party for use of the asset."
  {:db/ident :odrl/pay,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Pay",
   :skos/definition
   "The act of paying a financial amount to a party for use of the asset.",
   :skos/exactMatch :odrl/compensate})

(def payAmount
  "The amount of a financial payment. Right operand value MUST be an xsd:decimal."
  {:db/ident :odrl/payAmount,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Payment Amount",
   :skos/definition
   "The amount of a financial payment. Right operand value MUST be an xsd:decimal. ",
   :skos/note
   "Can be used for compensation duties with the unit property indicating the currency of the payment.",
   :skos/scopeNote "Non-Normative"})

(def payeeParty
  "The Party is the recipient of the payment."
  {:db/ident           :odrl/payeeParty,
   :owl/deprecated     true,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Payee Party",
   :rdfs/subPropertyOf :odrl/payeeParty,
   :skos/definition    "The Party is the recipient of the payment.",
   :skos/exactMatch    :odrl/compensatedParty,
   :skos/scopeNote     "Non-Normative"})

(def percentage
  "A percentage amount of the target Asset relevant for exercising the action of the Rule. Right operand value MUST be an xsd:decimal from 0 to 100."
  {:db/ident :odrl/percentage,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Asset Percentage",
   :skos/definition
   "A percentage amount of the target Asset relevant for exercising the action of the Rule. Right operand value MUST be an xsd:decimal from 0 to 100.",
   :skos/note "Example: Extract less than or equal to 50%.",
   :skos/scopeNote "Non-Normative"})

(def perm
  "Permissions take preference over prohibitions."
  {:db/ident         :odrl/perm,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/ConflictTerm
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Prefer Permissions",
   :skos/definition  "Permissions take preference over prohibitions.",
   :skos/note        "Used to determine policy conflict outcomes."})

(def permission
  "Relates an individual Permission to a Policy."
  {:db/ident           :odrl/permission,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        :odrl/Policy,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Has Permission",
   :rdfs/range         :odrl/Permission,
   :rdfs/subPropertyOf :odrl/permission,
   :skos/definition    "Relates an individual Permission to a Policy."})

(def permissions
  "Permission"
  {:db/ident       :odrl/permissions,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/permission :odrl/Permission],
   :skos/prefLabel "Permission",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def play
  "To create a sequential and transient rendition of an Asset."
  {:db/ident :odrl/play,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Play",
   :skos/definition
   "To create a sequential and transient rendition of an Asset.",
   :skos/note
   "For example, to play a video or audio track. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used.",
   :skos/scopeNote "Non-Normative"})

(def policyConcepts
  "Policy"
  {:db/ident       :odrl/policyConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/inheritFrom :odrl/profile :odrl/uid :odrl/Policy],
   :skos/prefLabel "Policy",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def policySubClasses
  "Policy Subclasses"
  {:db/ident       :odrl/policySubClasses,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/Set :odrl/Offer :odrl/Agreement],
   :skos/prefLabel "Policy Subclasses",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def policySubClassesCommon
  "Policy Subclasses"
  {:db/ident       :odrl/policySubClassesCommon,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/Ticket :odrl/Request :odrl/Privacy :odrl/Assertion],
   :skos/prefLabel "Policy Subclasses",
   :skos/scopeNote "ODRL Common Vocabulary Terms"})

(def policyUsage
  "Indicates the actual datetime the action of the Rule was exercised."
  {:db/ident :odrl/policyUsage,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/RightOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Policy Rule Usage",
   :skos/definition
   "Indicates the actual datetime the action of the Rule was exercised.",
   :skos/note
   "This can be used to express constraints with a LeftOperand relative to the time the rule is exercised. Operators indicate before (lt, lteq), during (eq) or after (gt, gteq) the usage of the rule. <br />Example: <code>event lt policyUsage</code> expresses that the identified event must have happened before the action of the rule is exercised.",
   :skos/scopeNote "Non-Normative"})

(def present
  "To publicly perform the Asset."
  {:db/ident         :odrl/present,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Present",
   :skos/definition  "To publicly perform the Asset.",
   :skos/note        "The asset can be performed (or communicated) in public.",
   :skos/scopeNote   "Non-Normative"})

(def preview
  "The act of providing a short preview of the asset."
  {:db/ident         :odrl/preview,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Preview",
   :skos/definition  "The act of providing a short preview of the asset.",
   :skos/note        "Use a time constraint with the appropriate action."})

(def print
  "To create a tangible and permanent rendition of an Asset."
  {:db/ident :odrl/print,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Print",
   :skos/definition "To create a tangible and permanent rendition of an Asset.",
   :skos/note
   "For example, creating a permanent, fixed (static), and directly perceivable representation of the Asset, such as printing onto paper.",
   :skos/scopeNote "Non-Normative"})

(def product
  "Category of product or service setting a context for exercising the action of the Rule."
  {:db/ident :odrl/product,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Product Context",
   :skos/definition
   "Category of product or service setting a context for exercising the action of the Rule.",
   :skos/note "Example: May only be used in the XYZ Magazine.",
   :skos/scopeNote "Non-Normative"})

(def profile
  "The identifier(s) of an ODRL Profile that the Policy conforms to."
  {:db/ident :odrl/profile,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Policy,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Profile",
   :rdfs/subPropertyOf :odrl/profile,
   :skos/definition
   "The identifier(s) of an ODRL Profile that the Policy conforms to.",
   :skos/note
   "The profile property is mandatory if the Policy is using an ODRL Profile."})

(def prohibit
  "Prohibitions take preference over permissions."
  {:db/ident         :odrl/prohibit,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/ConflictTerm
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Prefer Prohibitions",
   :skos/definition  "Prohibitions take preference over permissions.",
   :skos/note        "Used to determine policy conflict outcomes."})

(def prohibition
  "Relates an individual Prohibition to a Policy."
  {:db/ident           :odrl/prohibition,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain        :odrl/Policy,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Has Prohibition",
   :rdfs/range         :odrl/Prohibition,
   :rdfs/subPropertyOf :odrl/prohibition,
   :skos/definition    "Relates an individual Prohibition to a Policy."})

(def prohibitions
  "Prohibition"
  {:db/ident       :odrl/prohibitions,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/prohibition :odrl/Prohibition],
   :skos/prefLabel "Prohibition",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def proximity
  "An value indicating the closeness or nearness."
  {:db/ident :odrl/proximity,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "proximity",
   :rdfs/subPropertyOf :odrl/proximity,
   :skos/definition "An value indicating the closeness or nearness.",
   :skos/note
   "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/proximity ."})

(def purpose
  "A defined purpose for exercising the action of the Rule."
  {:db/ident         :odrl/purpose,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/LeftOperand
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Purpose",
   :skos/definition  "A defined purpose for exercising the action of the Rule.",
   :skos/note        "Example: Educational use.",
   :skos/scopeNote   "Non-Normative"})

(def read
  "To obtain data from the Asset."
  {:db/ident :odrl/read,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Read",
   :skos/definition "To obtain data from the Asset.",
   :skos/note
   "For example, the ability to read a record from a database (the Asset).",
   :skos/scopeNote "Non-Normative"})

(def recipient
  "The party receiving the result/outcome of exercising the action of the Rule."
  {:db/ident :odrl/recipient,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Recipient",
   :skos/definition
   "The party receiving the result/outcome of exercising the action of the Rule.",
   :skos/note
   "The Right Operand must identify one or more specific Parties or category/ies of the Party.",
   :skos/scopeNote "Non-Normative"})

(def refinement
  "Constraint used to refine the semantics of an Action, or Party/Asset Collection"
  {:db/ident :odrl/refinement,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain
   {:owl/unionOf [:odrl/Action :odrl/AssetCollection :odrl/PartyCollection],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Refinement",
   :rdfs/range {:owl/unionOf [:odrl/Constraint :odrl/LogicalConstraint],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :odrl/refinement,
   :skos/definition
   "Constraint used to refine the semantics of an Action, or Party/Asset Collection",
   :skos/note
   "Example: the Action print is only permitted on 50% of the asset."})

(def relation
  "Relation is an abstract property which creates an explicit link between an Action and an Asset."
  {:db/ident :odrl/relation,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Relation",
   :rdfs/range :odrl/Asset,
   :rdfs/subPropertyOf :odrl/relation,
   :skos/definition
   "Relation is an abstract property which creates an explicit link between an Action and an Asset.",
   :skos/note
   "Sub-properties of relation are used to define the nature of that link."})

(def relativePosition
  "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset."
  {:db/ident :odrl/relativePosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Relative Asset Position",
   :skos/definition
   "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset.",
   :skos/note
   "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it.",
   :skos/scopeNote "Non-Normative"})

(def relativeSize
  "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects - expressed as percentages of full values - of the target Asset."
  {:db/ident :odrl/relativeSize,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Relative Asset Size",
   :skos/definition
   "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects - expressed as percentages of full values - of the target Asset.",
   :skos/note
   "Example: The image can be resized in width to a maximum of 200%. Note: See the Left Operand absoluteSize. ",
   :skos/scopeNote "Non-Normative"})

(def relativeSpatialPosition
  "The relative spatial positions - expressed as percentages of full values - of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space of the target Asset."
  {:db/ident :odrl/relativeSpatialPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Relative Spatial Asset Position",
   :skos/broaderTransitive :odrl/relativePosition,
   :skos/definition
   "The relative spatial positions - expressed as percentages of full values - of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space of the target Asset.",
   :skos/note "See also Absolute Spatial Asset Position.",
   :skos/scopeNote "Non-Normative"})

(def relativeTemporalPosition
  "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset."
  {:db/ident :odrl/relativeTemporalPosition,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Relative Temporal Asset Position",
   :skos/broaderTransitive :odrl/relativePosition,
   :skos/definition
   "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset.",
   :skos/note
   "See also Absolute Temporal Asset Position. <br />Example: The MP3 music file must be positioned between the positions at 33% and 48% of the temporal length of a stream. ",
   :skos/scopeNote "Non-Normative"})

(def remedy
  "Relates an individual remedy Duty to a Prohibition."
  {:db/ident :odrl/remedy,
   :rdf/type [:rdf/Property :owl/ObjectProperty :skos/Concept],
   :rdfs/domain :odrl/Prohibition,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Remedy",
   :rdfs/range :odrl/Duty,
   :rdfs/subPropertyOf [:odrl/failure :odrl/remedy],
   :skos/definition "Relates an individual remedy Duty to a Prohibition.",
   :skos/note
   "The remedy property expresses an agreed Duty that must be fulfilled in case that a Prohibition has been violated by being exercised."})

(def reproduce
  "To make duplicate copies the Asset in any material form."
  {:db/ident         :odrl/reproduce,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Reproduce",
   :skos/definition  "To make duplicate copies the Asset in any material form.",
   :skos/scopeNote   "Non-Normative"})

(def resolution
  "Resolution of the rendition of the target Asset."
  {:db/ident         :odrl/resolution,
   :rdf/type         [:skos/Concept
                      :owl/NamedIndividual
                      :odrl/LeftOperand
                      :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Rendition Resolution",
   :skos/definition  "Resolution of the rendition of the target Asset.",
   :skos/note        "Example: the image may be printed at 1200dpi.",
   :skos/scopeNote   "Non-Normative"})

(def reviewPolicy
  "To review the Policy applicable to the Asset."
  {:db/ident :odrl/reviewPolicy,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Review Policy",
   :skos/definition "To review the Policy applicable to the Asset.",
   :skos/note
   "Used when human intervention is required to review the Policy. May link to an Asset which represents the full Policy information.",
   :skos/scopeNote "Non-Normative"})

(def rightOperand
  "The value of the right operand in a constraint expression."
  {:db/ident :odrl/rightOperand,
   :rdf/type [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Has Right Operand",
   :rdfs/range {:owl/unionOf [:odrl/RightOperand :rdfs/Literal :xsd/anyURI],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :odrl/rightOperand,
   :skos/definition
   "The value of the right operand in a constraint expression.",
   :skos/note
   "When used with set-based operators, a list of values may be used."})

(def rightOperandReference
  "A reference to a web resource providing the value for the right operand of a Constraint."
  {:db/ident :odrl/rightOperandReference,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Has Right Operand Reference",
   :rdfs/subPropertyOf :odrl/rightOperandReference,
   :skos/definition
   "A reference to a web resource providing the value for the right operand of a Constraint.",
   :skos/note
   "An IRI that MUST be dereferenced to obtain the actual right operand value. When used with set-based operators, a list of IRIs may be used"})

(def ruleConcepts
  "Rule"
  {:db/ident       :odrl/ruleConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    [:odrl/failure :odrl/function :odrl/relation :odrl/Rule],
   :skos/prefLabel "Rule",
   :skos/scopeNote "ODRL Core Vocabulary Terms"})

(def scope
  "The identifier of a scope that provides context to the extent of the entity."
  {:db/ident :odrl/scope,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Scope",
   :rdfs/subPropertyOf :odrl/scope,
   :skos/definition
   "The identifier of a scope that provides context to the extent of the entity.",
   :skos/note "Used to define scopes for Assets and Parties."})

(def secondaryUse
  "The act of using the asset for a purpose other than the purpose it was intended for."
  {:db/ident :odrl/secondaryUse,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Secondary Use",
   :skos/definition
   "The act of using the asset for a purpose other than the purpose it was intended for."})

(def sell
  "To transfer the ownership of the Asset to a third party with compensation and while deleting the original asset."
  {:db/ident :odrl/sell,
   :odrl/includedIn :odrl/transfer,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Sell",
   :skos/definition
   "To transfer the ownership of the Asset to a third party with compensation and while deleting the original asset.",
   :skos/scopeNote "Non-Normative"})

(def share
  "The act of the non-commercial reproduction and distribution of the asset to third-parties."
  {:db/ident :odrl/share,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Share",
   :skos/definition
   "The act of the non-commercial reproduction and distribution of the asset to third-parties.",
   :skos/exactMatch :cc/Sharing})

(def shareAlike
  "The act of distributing any derivative asset under the same terms as the original asset."
  {:db/ident :odrl/shareAlike,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Share-alike",
   :skos/definition
   "The act of distributing any derivative asset under the same terms as the original asset.",
   :skos/exactMatch :cc/ShareAlike})

(def source
  "Reference to a Asset/PartyCollection"
  {:db/ident :odrl/source,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/AssetCollection :odrl/PartyCollection],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Source",
   :rdfs/subPropertyOf :odrl/source,
   :skos/definition "Reference to a Asset/PartyCollection",
   :skos/note
   "Used by AssetCollection and PartyCollection when constraints are applied."})

(def spatial
  "A named and identified geospatial area with defined borders which is used for exercising the action of the Rule. An IRI MUST be used to represent this value."
  {:db/ident :odrl/spatial,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Geospatial Named Area",
   :skos/definition
   "A named and identified geospatial area with defined borders which is used for exercising the action of the Rule. An IRI MUST be used to represent this value.",
   :skos/note
   "A code value for the area and source of the code must be presented in the Right Operand. <br />Example: the [[iso3166]] Country Codes or the Getty Thesaurus of Geographic Names. ",
   :skos/scopeNote "Non-Normative"})

(def spatialCoordinates
  "A set of coordinates setting the borders of a geospatial area used for exercising the action of the Rule. The coordinates MUST include longitude and latitude, they MAY include altitude and the geodetic datum."
  {:db/ident :odrl/spatialCoordinates,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Geospatial Coordinates",
   :skos/broaderTransitive :odrl/spatial,
   :skos/definition
   "A set of coordinates setting the borders of a geospatial area used for exercising the action of the Rule. The coordinates MUST include longitude and latitude, they MAY include altitude and the geodetic datum.",
   :skos/note
   "The default values are the altitude of earth's surface at this location and the WGS 84 datum.",
   :skos/scopeNote "Non-Normative"})

(def status
  "the value generated from the leftOperand action or a value related to the leftOperand set as the reference for the comparison."
  {:db/ident :odrl/status,
   :rdf/type [:skos/Concept :rdf/Property],
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Status",
   :rdfs/subPropertyOf :odrl/status,
   :skos/definition
   "the value generated from the leftOperand action or a value related to the leftOperand set as the reference for the comparison."})

(def stream
  "To deliver the Asset in real-time."
  {:db/ident :odrl/stream,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Stream",
   :skos/definition "To deliver the Asset in real-time.",
   :skos/note
   "The Asset maybe utilised in real-time as it is being delivered. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used.",
   :skos/scopeNote "Non-Normative"})

(def support
  "The Action is to be supported as part of the policy – and the policy remains valid."
  {:db/ident :odrl/support,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/UndefinedTerm :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Support Undefined Actions",
   :skos/definition
   "The Action is to be supported as part of the policy – and the policy remains valid.",
   :skos/note "Used to support actions not known to the policy system."})

(def synchronize
  "To use the Asset in timed relations with media (audio/visual) elements of another Asset."
  {:db/ident :odrl/synchronize,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Synchronize",
   :skos/definition
   "To use the Asset in timed relations with media (audio/visual) elements of another Asset.",
   :skos/scopeNote "Non-Normative"})

(def system
  "An identified computing system used for exercising the action of the Rule."
  {:db/ident :odrl/system,
   :owl/deprecated true,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "System",
   :skos/definition
   "An identified computing system used for exercising the action of the Rule.",
   :skos/exactMatch :odrl/systemDevice,
   :skos/note "See System Device"})

(def systemDevice
  "An identified computing system or computing device used for exercising the action of the Rule."
  {:db/ident :odrl/systemDevice,
   :rdf/type
   [:skos/Concept :odrl/LeftOperand :owl/NamedIndividual :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "System Device",
   :skos/definition
   "An identified computing system or computing device used for exercising the action of the Rule.",
   :skos/exactMatch [:odrl/system :odrl/device],
   :skos/note
   "Example: The system device can be identified by a unique code created from the used hardware.",
   :skos/scopeNote "Non-Normative"})

(def target
  "The target property indicates the Asset that is the primary subject to which the Rule action directly applies."
  {:db/ident :odrl/target,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Target",
   :rdfs/range :odrl/Asset,
   :rdfs/subPropertyOf [:odrl/relation :odrl/target],
   :skos/definition
   "The target property indicates the Asset that is the primary subject to which the Rule action directly applies."})

(def textToSpeech
  "To have a text Asset read out loud."
  {:db/ident :odrl/textToSpeech,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Text-to-speech",
   :skos/definition "To have a text Asset read out loud.",
   :skos/note
   "If the action is to be performed to a wider audience than just the Assignees, then the recipient constraint is recommended to be used.",
   :skos/scopeNote "Non-Normative"})

(def timeInterval
  "A recurring period of time before the next execution of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."
  {:db/ident :odrl/timeInterval,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Recurring Time Interval",
   :skos/definition
   "A recurring period of time before the next execution of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]].",
   :skos/note
   "Only the eq operator SHOULD be used. <br />Example: <code>timeInterval eq P7D</code> indicates a recurring 7 day period.",
   :skos/scopeNote "Non-Normative"})

(def timedCount
  "The number of seconds after which timed metering use of the asset begins."
  {:db/ident :odrl/timedCount,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/DatatypeProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Timed Count",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :odrl/timedCount,
   :skos/definition
   "The number of seconds after which timed metering use of the asset begins.",
   :skos/note
   "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/timed-count ."})

(def trackedParty
  "The Party whose usage is being tracked."
  {:db/ident           :odrl/trackedParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Tracked Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/trackedParty],
   :skos/definition    "The Party whose usage is being tracked.",
   :skos/note          "May be specified as part of the acceptTracking action.",
   :skos/scopeNote     "Non-Normative"})

(def trackingParty
  "The Party who is tracking usage."
  {:db/ident           :odrl/trackingParty,
   :rdf/type           [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://www.w3.org/ns/odrl/2/",
   :rdfs/label         "Tracking Party",
   :rdfs/subPropertyOf [:odrl/function :odrl/trackingParty],
   :skos/definition    "The Party who is tracking usage.",
   :skos/note          "May be specified as part of the acceptTracking action.",
   :skos/scopeNote     "Non-Normative"})

(def transfer
  "To transfer the ownership of the Asset in perpetuity."
  {:db/ident         :odrl/transfer,
   :rdf/type         [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Transfer Ownership",
   :skos/definition  "To transfer the ownership of the Asset in perpetuity."})

(def transform
  "To convert the Asset into a different format."
  {:db/ident :odrl/transform,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Transform",
   :skos/definition "To convert the Asset into a different format.",
   :skos/note
   "Typically used to convert the Asset into a different format for consumption on/transfer to a third party system.",
   :skos/scopeNote "Non-Normative"})

(def translate
  "To translate the original natural language of an Asset into another natural language."
  {:db/ident :odrl/translate,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Translate",
   :skos/definition
   "To translate the original natural language of an Asset into another natural language.",
   :skos/note "A new derivative Asset is created by that action.",
   :skos/scopeNote "Non-Normative"})

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
   :rdfs/label "Unique Identifier",
   :rdfs/subPropertyOf :odrl/uid,
   :skos/definition "An unambiguous identifier",
   :skos/note
   "Used by the Policy, Rule, Asset, Party, Constraint, and Logical Constraint Classes."})

(def undefined
  "Relates the strategy used for handling undefined actions to a Policy."
  {:db/ident :odrl/undefined,
   :owl/deprecated true,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Handle Undefined Term",
   :rdfs/range :odrl/UndefinedTerm,
   :rdfs/subPropertyOf :odrl/undefined,
   :skos/definition
   "Relates the strategy used for handling undefined actions to a Policy.",
   :skos/note "If no strategy is specified, the default is invalid."})

(def uninstall
  "To unload and delete the computer program Asset from a storage device and disable its readiness for operation."
  {:db/ident :odrl/uninstall,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Uninstall",
   :skos/definition
   "To unload and delete the computer program Asset from a storage device and disable its readiness for operation.",
   :skos/note
   "The Asset is no longer accessible to the assignees after it has been used.",
   :skos/scopeNote "Non-Normative"})

(def unit
  "The unit of measurement of the value of the rightOperand or rightOperandReference of a Constraint."
  {:db/ident :odrl/unit,
   :rdf/type :rdf/Property,
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Unit",
   :rdfs/subPropertyOf :odrl/unit,
   :skos/definition
   "The unit of measurement of the value of the rightOperand or rightOperandReference of a Constraint."})

(def unitOfCount
  "The unit of measure used for counting the executions of the action of the Rule."
  {:db/ident :odrl/unitOfCount,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Unit Of Count",
   :skos/definition
   "The unit of measure used for counting the executions of the action of the Rule.",
   :skos/note
   "Note: Typically used with Duties to indicate the unit entity to be counted of the Action. <br />Example: A duty to compensate and a unitOfCount constraint of 'perUser' would indicate that the compensation by multiplied by the 'number of users'.",
   :skos/scopeNote "Non-Normative"})

(def use
  "To use the Asset"
  {:db/ident :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Use",
   :skos/definition "To use the Asset",
   :skos/note
   "Use is the most generic action for all non-third-party usage. More specific types of the use action can be expressed by more targetted actions."})

(def version
  "The version of the target Asset."
  {:db/ident :odrl/version,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Version",
   :skos/definition "The version of the target Asset.",
   :skos/note
   "Example: Single Paperback or Multiple Issues or version 2.0 or higher.",
   :skos/scopeNote "Non-Normative"})

(def virtualLocation
  "An identified location of the IT communication space which is relevant for exercising the action of the Rule."
  {:db/ident :odrl/virtualLocation,
   :rdf/type
   [:skos/Concept :owl/NamedIndividual :odrl/LeftOperand :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Virtual IT Communication Location",
   :skos/definition
   "An identified location of the IT communication space which is relevant for exercising the action of the Rule.",
   :skos/note "Example: an Internet domain or IP address range.",
   :skos/scopeNote "Non-Normative"})

(def watermark
  "To apply a watermark to the Asset."
  {:db/ident         :odrl/watermark,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :rdfs/Resource :schema/Action],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Watermark",
   :skos/definition  "To apply a watermark to the Asset.",
   :skos/scopeNote   "Non-Normative"})

(def write
  "The act of writing to the Asset."
  {:db/ident         :odrl/write,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Write",
   :skos/definition  "The act of writing to the Asset.",
   :skos/exactMatch  :odrl/modify})

(def writeTo
  "The act of adding data to the Asset."
  {:db/ident         :odrl/writeTo,
   :owl/deprecated   true,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Write to",
   :skos/definition  "The act of adding data to the Asset.",
   :skos/exactMatch  :odrl/modify})

(def xone
  "The relation is satisfied when only one, and not more, of the Constaints is satisfied"
  {:db/ident :odrl/xone,
   :rdf/type [:skos/Concept :owl/ObjectProperty :rdf/Property],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Only One",
   :rdfs/subPropertyOf [:odrl/operand :odrl/xone],
   :skos/definition
   "The relation is satisfied when only one, and not more, of the Constaints is satisfied",
   :skos/note
   "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances."})

(def ^{:private true} Attribution
  "Credit be given to copyright holder and/or author."
  {:db/ident         :cc/Attribution,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Attribution",
   :skos/definition  "Credit be given to copyright holder and/or author.",
   :skos/note        "This term is defined by Creative Commons.",
   :skos/scopeNote   "Non-Normative"})

(def ^{:private true} CommercialUse
  "Exercising rights for commercial purposes."
  {:db/ident         :cc/CommercialUse,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Commercial Use",
   :skos/definition  "Exercising rights for commercial purposes.",
   :skos/note        "This term is defined by Creative Commons.",
   :skos/scopeNote   "Non-Normative"})

(def ^{:private true} DerivativeWorks
  "Distribution of derivative works."
  {:db/ident         :cc/DerivativeWorks,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Derivative Works",
   :skos/definition  "Distribution of derivative works.",
   :skos/note        "This term is defined by Creative Commons.",
   :skos/scopeNote   "Non-Normative"})

(def ^{:private true} Distribution
  "Distribution, public display, and publicly performance."
  {:db/ident         :cc/Distribution,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Distribution",
   :skos/definition  "Distribution, public display, and publicly performance.",
   :skos/note        "This term is defined by Creative Commons.",
   :skos/scopeNote   "Non-Normative"})

(def ^{:private true} Notice
  "Copyright and license notices be kept intact."
  {:db/ident         :cc/Notice,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Notice",
   :skos/definition  "Copyright and license notices be kept intact.",
   :skos/note        "This term is defined by Creative Commons.",
   :skos/scopeNote   "Non-Normative"})

(def ^{:private true} Reproduction
  "Making multiple copies."
  {:db/ident         :cc/Reproduction,
   :odrl/includedIn  :odrl/use,
   :rdf/type         [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label       "Reproduction",
   :skos/definition  "Making multiple copies.",
   :skos/note        "This term is defined by Creative Commons.",
   :skos/scopeNote   "Non-Normative"})

(def ^{:private true} ShareAlike
  "Derivative works be licensed under the same terms or compatible terms as the original work."
  {:db/ident :cc/ShareAlike,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Share Alike",
   :skos/definition
   "Derivative works be licensed under the same terms or compatible terms as the original work.",
   :skos/note "This term is defined by Creative Commons.",
   :skos/scopeNote "Non-Normative"})

(def ^{:private true} Sharing
  "Permits commercial derivatives, but only non-commercial distribution."
  {:db/ident :cc/Sharing,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Sharing",
   :skos/definition
   "Permits commercial derivatives, but only non-commercial distribution.",
   :skos/note "This term is defined by Creative Commons.",
   :skos/scopeNote "Non-Normative"})

(def ^{:private true} SourceCode
  "Source code (the preferred form for making modifications) must be provided when exercising some rights granted by the license."
  {:db/ident :cc/SourceCode,
   :odrl/includedIn :odrl/use,
   :rdf/type [:skos/Concept :odrl/Action :schema/Action :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/odrl/2/",
   :rdfs/label "Source Code",
   :skos/definition
   "Source code (the preferred form for making modifications) must be provided when exercising some rights granted by the license.",
   :skos/note "This term is defined by Creative Commons.",
   :skos/scopeNote "Non-Normative"})

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