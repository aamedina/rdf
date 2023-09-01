(ns net.wikipunk.rdf.odrl
  "The ODRL Vocabulary and Expression defines a set of concepts and terms (the vocabulary) and encoding mechanism (the expression) for permissions and obligations statements describing digital content usage based on the ODRL Information Model."
  {:dcat/downloadURL "https://www.w3.org/ns/odrl/2/ODRL22.jsonld",
   :dcterms/contributor
   "W3C Permissions & Obligations Expression Working Group",
   :dcterms/creator
   #{{:xsd/string "Víctor Rodríguez-Doncel"} {:xsd/string "Stuart Myles"}
     {:xsd/string "Michael Steidl"} {:xsd/string "Renato Iannella"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The ODRL Vocabulary and Expression defines a set of concepts and terms (the vocabulary) and encoding mechanism (the expression) for permissions and obligations statements describing digital content usage based on the ODRL Information Model."},
   :dcterms/license
   {:rdfa/uri
    "https://www.w3.org/Consortium/Legal/2002/ipr-notice-20021231#Copyright/"},
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
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "This is the RDF ontology for ODRL Version 2.2."},
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/TR/odrl-vocab/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ODRL Version 2.2"}}
  (:refer-clojure :exclude [and count derive or print read use]))

(def Action
  "Action"
  {:db/ident :odrl/Action,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Action"},
   :rdfs/subClassOf :schema/Action,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An operation on an Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Actions may be allowed by Permissions, disallowed by Prohibitions, or made mandatory by Duties."}})

(def Agreement
  "Agreement"
  {:db/ident :odrl/Agreement,
   :owl/disjointWith #{:odrl/Ticket :odrl/Offer :odrl/Request :odrl/Assertion
                       :odrl/Privacy},
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Agreement"},
   :rdfs/subClassOf :odrl/Policy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Policy that grants the assignee a Rule over an Asset from an assigner."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "An Agreement Policy MUST contain at least one Permission or Prohibition rule, a Party with Assigner function, and a Party with Assignee function (in the same Permission or Prohibition). The Agreement Policy will grant the terms of the Policy from the Assigner to the Assignee."}})

(def All
  "All"
  {:db/ident :odrl/All,
   :owl/deprecated true,
   :rdf/type #{:odrl/PartyScope :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "All"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specifies that the scope of the relationship is all of the collective individuals within a context."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, may be used to indicate all the users of a specific social network the party is a member of. Note that “group” scope is also assumed."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def All2ndConnections
  "All Second-level Connections"
  {:db/ident :odrl/All2ndConnections,
   :owl/deprecated true,
   :rdf/type #{:odrl/PartyScope :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "All Second-level Connections"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specifies that the scope of the relationship is all of the second-level connections to the Party."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, may be used to indicate all “friends of friends” of the Party. Note that “group” scope is also assumed."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def AllConnections
  "All First-Level Connections"
  {:db/ident :odrl/AllConnections,
   :owl/deprecated true,
   :rdf/type #{:odrl/PartyScope :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "All First-Level Connections"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specifies that the scope of the relationship is all of the first-level connections of the Party."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, may be used to indicate all “friends” of the Party. Note that “group” scope is also assumed."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def AllGroups
  "All Group Connections"
  {:db/ident :odrl/AllGroups,
   :owl/deprecated true,
   :rdf/type #{:odrl/PartyScope :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "All Group Connections"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specifies that the scope of the relationship is all of the group connections of the Party."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, may be used to indicate all groups that the Party is a member of. Note that “group” scope is also assumed."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def Assertion
  "Assertion"
  {:db/ident :odrl/Assertion,
   :owl/disjointWith #{:odrl/Ticket :odrl/Offer :odrl/Request :odrl/Privacy},
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Assertion"},
   :rdfs/subClassOf :odrl/Policy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A Policy that asserts a Rule over an Asset from parties."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, a party (an assignee or assigner) can claim what terms they have over an Asset. An Assertion Policy does not grant such permissions/prohibitions but only asserts the parties claims. An Assetion Policy  MUST contain a target Asset, a Party with any functional role, and at least one of a Permission or Prohibition rule."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def Asset
  "Asset"
  {:db/ident :odrl/Asset,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asset"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A resource or a collection of resources that are the subject of a Rule."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The Asset entity can be any form of identifiable resource, such as data/information, content/media, applications, or services. Furthermore, it can be used to represent other Asset entities that are needed to undertake the Policy expression, such as with the Duty entity. To describe more details about the Asset, it is recommended to use Dublin Core [[dcterms]] elements or other content metadata."}})

(def AssetCollection
  "Asset Collection"
  {:db/ident         :odrl/AssetCollection,
   :rdf/type         #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Asset Collection"},
   :rdfs/subClassOf  :odrl/Asset,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "An Asset that is collection of individual resources"}})

(def AssetScope
  "Asset Scope"
  {:db/ident :odrl/AssetScope,
   :owl/deprecated true,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asset Scope"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Scopes for Asset Scope expressions."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Instances of the AssetScope class represent the terms for the scope property of Assets."}})

(def ConflictTerm
  "Conflict Strategy Preference"
  {:db/ident :odrl/ConflictTerm,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Conflict Strategy Preference"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to establish strategies to resolve conflicts that arise from the merging of Policies or conflicts between Permissions and Prohibitions in the same Policy."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Instances of ConflictTerm describe strategies for resolving conflicts."}})

(def Constraint
  "Constraint"
  {:db/ident :odrl/Constraint,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Constraint"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A boolean expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule."}})

(def Duty
  "Duty"
  {:db/ident         :odrl/Duty,
   :owl/disjointWith #{:odrl/Prohibition :odrl/Permission},
   :rdf/type         #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Duty"},
   :rdfs/subClassOf  :odrl/Rule,
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "The obligation to perform an Action"}})

(def Group
  "Group"
  {:db/ident :odrl/Group,
   :owl/deprecated true,
   :rdf/type #{:odrl/PartyScope :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Group"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specifies that the scope of the relationship is the defined group with multiple individual members."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def Individual
  "Individual"
  {:db/ident :odrl/Individual,
   :owl/deprecated true,
   :rdf/type #{:odrl/PartyScope :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Individual"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specifies that the scope of the relationship is the single Party individual."}})

(def LeftOperand
  "Left Operand"
  {:db/ident :odrl/LeftOperand,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Left Operand"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Left operand for a constraint expression."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Instances of the LeftOperand class are used as the leftOperand of a Constraint."}})

(def LogicalConstraint
  "Logical Constraint"
  {:db/ident :odrl/LogicalConstraint,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Logical Constraint"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A logical expression that refines the semantics of an Action and Party/Asset Collection or declare the conditions applicable to a Rule."}})

(def Offer
  "Offer"
  {:db/ident :odrl/Offer,
   :owl/disjointWith #{:odrl/Agreement :odrl/Ticket :odrl/Request
                       :odrl/Assertion :odrl/Privacy},
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Offer"},
   :rdfs/subClassOf :odrl/Policy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A Policy that proposes a Rule over an Asset from an assigner."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "An Offer Policy MUST contain at least one Permission or Prohibition rule and a Party with Assigner function (in the same Permission or Prohibition). The Offer Policy MAY contain a Party with Assignee function, but MUST not grant any privileges to that Party."}})

(def Operator
  "Operator"
  {:db/ident :odrl/Operator,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Operator"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Operator for constraint expression."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Instances of the Operator class representing relational operators."}})

(def Party
  "Party"
  {:db/ident :odrl/Party,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Party"},
   :rdfs/subClassOf {:owl/unionOf [:schema/Person
                                   :schema/Organization
                                   :foaf/Person
                                   :foaf/Organization
                                   :foaf/Agent
                                   :vcard/Individual
                                   :vcard/Organization
                                   :vcard/Agent],
                     :rdf/type    :owl/Class},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity or a collection of entities that undertake Roles in a Rule."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The Party entity could be a person, group of people, organisation, or agent. An agent is a person or thing that takes an active role or produces a specified effect. To describe more details about the Party, it is recommended to use W3C vCard Ontology [[vcard-rdf]] or FOAF Vocabulary [[foaf]]."}})

(def PartyCollection
  "Party Collection"
  {:db/ident         :odrl/PartyCollection,
   :rdf/type         #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Party Collection"},
   :rdfs/subClassOf  :odrl/Party,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "A Party that is a group of individual entities"}})

(def PartyScope
  "Party Scope"
  {:db/ident :odrl/PartyScope,
   :owl/deprecated true,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Party Scope"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Scopes for Party Scope expressions."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Instances of the PartyScope class represent the terms for the scope property of Parties."}})

(def Permission
  "Permission"
  {:db/ident         :odrl/Permission,
   :owl/disjointWith #{:odrl/Prohibition :odrl/Duty},
   :rdf/type         #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Permission"},
   :rdfs/subClassOf  :odrl/Rule,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "The ability to perform an Action over an Asset."}})

(def Policy
  "Policy"
  {:db/ident         :odrl/Policy,
   :rdf/type         #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Policy"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "A non-empty group of Permissions and/or Prohibitions."},
   :skos/note        {:rdf/language "en",
                      :rdf/value    "A Policy may contain multiple Rules."}})

(def Privacy
  "Privacy Policy"
  {:db/ident :odrl/Privacy,
   :owl/disjointWith #{:odrl/Agreement :odrl/Ticket :odrl/Offer :odrl/Request
                       :odrl/Assertion},
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Policy"},
   :rdfs/subClassOf :odrl/Policy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Policy that expresses a Rule over an Asset containing personal information."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "A Privacy Policy  MUST contain a target Asset, a Party with Assigner  is, a Party with Assignee function, and at least one of a Permission or Prohibition rule that MUST include a Duty. The target Asset SHOULD contain or relate to personal information about the Assignee. The Duty MUST describe obligations on the Assigner about managing the Asset. The Assignee is being granted the terms of the Privacy policy from the Assigner."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def Prohibition
  "Prohibition"
  {:db/ident         :odrl/Prohibition,
   :owl/disjointWith #{:odrl/Permission :odrl/Duty},
   :rdf/type         #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Prohibition"},
   :rdfs/subClassOf  :odrl/Rule,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "The inability to perform an Action over an Asset."}})

(def Request
  "Request"
  {:db/ident :odrl/Request,
   :owl/disjointWith #{:odrl/Agreement :odrl/Ticket :odrl/Offer :odrl/Assertion
                       :odrl/Privacy},
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Request"},
   :rdfs/subClassOf :odrl/Policy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A Policy that proposes a Rule over an Asset from an assignee."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "A Request Policy  MUST contain a target Asset, a Party with Assignee function, and at least one of a Permission or Prohibition rule. The Request MAY also contain the Party with Assigner function if this is known. No privileges are granted to any Party."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def RightOperand
  "Right Operand"
  {:db/ident :odrl/RightOperand,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Right Operand"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Right operand for constraint expression."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Instances of the RightOperand class are used as the rightOperand of a Constraint."}})

(def Rule
  "Rule"
  {:db/ident :odrl/Rule,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rule"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An abstract concept that represents the common characteristics of Permissions, Prohibitions, and Duties."},
   :skos/note {:rdf/language "en",
               :rdf/value    "Rule is an abstract concept."}})

(def Set
  "Set"
  {:db/ident :odrl/Set,
   :owl/disjointWith #{:odrl/Agreement :odrl/Ticket :odrl/Offer :odrl/Request
                       :odrl/Assertion :odrl/Privacy},
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Set"},
   :rdfs/subClassOf :odrl/Policy,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A Policy that expresses a Rule over an Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "A Set Policy MUST contain a target Asset, and at least one Rule. A Set Policy is the default Policy subclass. The Set is aimed at scenarios where there is an open criteria for the semantics of the policy expressions and typically refined by other systems/profiles that process the information at a later time. No privileges are granted to any Party (if defined)."}})

(def Ticket
  "Ticket"
  {:db/ident :odrl/Ticket,
   :owl/disjointWith #{:odrl/Agreement :odrl/Offer :odrl/Request :odrl/Assertion
                       :odrl/Privacy},
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ticket"},
   :rdfs/subClassOf :odrl/Policy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Policy that grants the holder a Rule over an Asset from an assigner."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "A Ticket Policy MUST contain a target Asset and at least one of a Permission or Prohibition rule.  The Ticket MAY contain the Party with Assigner function and MUST NOT contain an Assignee. The Ticket Policy will grant the terms of the Policy to the holder of that Ticket. The holder of the Ticket MAY remain unknown or MAY have to be identified at some later stage."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def UndefinedTerm
  "Undefined Term"
  {:db/ident :odrl/UndefinedTerm,
   :owl/deprecated true,
   :rdf/type #{:skos/Concept :rdfs/Class :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Undefined Term"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Is used to indicate how to support Actions that are not part of any vocabulary or profile in the policy expression system."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Instances of UndefinedTerm describe strategies for processing unsupported actions."}})

(def absolutePosition
  "Absolute Asset Position"
  {:db/ident :odrl/absolutePosition,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Absolute Asset Position"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A point in space or time defined with absolute coordinates for the positioning of the target Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def absoluteSize
  "Absolute Asset Size"
  {:db/ident :odrl/absoluteSize,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Absolute Asset Size"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects of the target Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Example: The image can be resized in width to a maximum of 1000px."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def absoluteSpatialPosition
  "Absolute Spatial Asset Position"
  {:db/ident :odrl/absoluteSpatialPosition,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Absolute Spatial Asset Position"},
   :skos/broaderTransitive :odrl/absolutePosition,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The absolute spatial positions of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space for the target Asset to fit."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it. Note: see also the Left Operand Relative Spatial Asset Position. "},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def absoluteTemporalPosition
  "Absolute Temporal Asset Position"
  {:db/ident :odrl/absoluteTemporalPosition,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Absolute Temporal Asset Position"},
   :skos/broaderTransitive :odrl/absolutePosition,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The absolute temporal positions in a media stream the target Asset has to fit."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Use with Actions including the target Asset in a larger media stream. The fragment part of a Media Fragment URI (https://www.w3.org/TR/media-frags/) may be used for the right operand. See the Left Operand realativeTemporalPosition. <br />Example: The MP3 music file must be positioned between second 192 and 250 of the temporal length of a stream."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def acceptTracking
  "Accept Tracking"
  {:db/ident :odrl/acceptTracking,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accept Tracking"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "To accept that the use of the Asset may be tracked."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The collected information may be tracked by the Assigner, or may link to a Party with the role 'trackingParty' function."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def action
  "Has Action"
  {:db/ident :odrl/action,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Action"},
   :rdfs/range :odrl/Action,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The operation relating to the Asset for which the Rule is being subjected."}})

(def actionConcepts
  "Action"
  {:db/ident       :odrl/actionConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/Action :odrl/action :odrl/implies :odrl/includedIn},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Action"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def actions
  "Actions for Rules"
  {:db/ident       :odrl/actions,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/use :odrl/transfer},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Actions for Rules"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def actionsCommon
  "Actions for Rules"
  {:db/ident       :odrl/actionsCommon,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/distribute :odrl/digitize :odrl/sell :cc/Reproduction
                     :odrl/synchronize :cc/Sharing :odrl/textToSpeech
                     :odrl/display :odrl/translate :cc/Distribution
                     :odrl/reviewPolicy :odrl/uninstall :cc/SourceCode
                     :cc/Notice :odrl/obtainConsent :odrl/nextPolicy
                     :cc/CommercialUse :odrl/play :odrl/acceptTracking
                     :odrl/extract :odrl/anonymize :odrl/modify :cc/Attribution
                     :odrl/archive :odrl/give :odrl/ensureExclusivity
                     :odrl/aggregate :odrl/inform :odrl/install :cc/ShareAlike
                     :odrl/compensate :odrl/reproduce :odrl/attribute
                     :odrl/watermark :odrl/include :odrl/transform :odrl/index
                     :odrl/read :odrl/concurrentUse :odrl/present :odrl/execute
                     :odrl/annotate :odrl/delete :odrl/move :cc/DerivativeWorks
                     :odrl/stream :odrl/derive :odrl/grantUse :odrl/print},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Actions for Rules"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Common Vocabulary Terms"}})

(def adHocShare
  "Ad-hoc sharing"
  {:db/ident :odrl/adHocShare,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ad-hoc sharing"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of sharing the asset to parties in close proximity to the owner."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/adhoc-share ."}})

(def aggregate
  "Aggregate"
  {:db/ident :odrl/aggregate,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Aggregate"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To use the Asset or parts of it as part of a composite collection."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def and
  "And"
  {:db/ident :odrl/and,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "And"},
   :rdfs/subPropertyOf :odrl/operand,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The relation is satisfied when all of the Constraints are satisfied."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances."}})

(def andSequence
  "And Sequence"
  {:db/ident :odrl/andSequence,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "And Sequence"},
   :rdfs/subPropertyOf :odrl/operand,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The relation is satisfied when each of the Constraints are satisfied in the order specified."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances. The order of the list MUST be preserved. The andSequence operator is an example where there may be temporal conditional requirements between the operands. This may lead to situations where the outcome is unresolvable, such as deadlock if one of the Constraints is unable to be satisfied. ODRL Processing systems SHOULD plan for these scenarios and implement mechanisms to resolve them."}})

(def annotate
  "Annotate"
  {:db/ident :odrl/annotate,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Annotate"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To add explanatory notations/commentaries to the Asset without modifying the Asset in any other way."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def anonymize
  "Anonymize"
  {:db/ident :odrl/anonymize,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Anonymize"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "To anonymize all or parts of the Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, to remove identifying particulars for statistical or for other comparable purposes, or to use the Asset without stating the author/source."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def append
  "Append"
  {:db/ident         :odrl/append,
   :owl/deprecated   true,
   :rdf/type         #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Append"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value "The act of adding to the end of an asset."},
   :skos/exactMatch  :odrl/modify})

(def appendTo
  "Append To"
  {:db/ident :odrl/appendTo,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Append To"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of appending data to the Asset without modifying the Asset in any other way."},
   :skos/exactMatch :odrl/modify})

(def archive
  "Archive"
  {:db/ident :odrl/archive,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Archive"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "To store the Asset (in a non-transient form)."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "Temporal constraints may be used for temporal conditions."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def assetConcepts
  "Asset"
  {:db/ident       :odrl/assetConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/Asset :odrl/AssetCollection},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Asset"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def assetParty
  "Asset and Party"
  {:db/ident       :odrl/assetParty,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/source :odrl/partOf},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Asset and Party"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def assetRelations
  "Asset Relations"
  {:db/ident       :odrl/assetRelations,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/target :odrl/hasPolicy},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Asset Relations"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def assetRelationsCommon
  "Asset Relations"
  {:db/ident       :odrl/assetRelationsCommon,
   :rdf/type       :skos/Collection,
   :skos/member    :odrl/output,
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Asset Relations"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Common Vocabulary Terms"}})

(def assignee
  "Assignee"
  {:db/ident           :odrl/assignee,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain        {:owl/unionOf [:odrl/Rule :odrl/Policy],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Assignee"},
   :rdfs/range         :odrl/Party,
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    {:rdf/language "en",
                        :rdf/value "The Party is the recipient of the Rule."}})

(def assigneeOf
  "Assignee Of"
  {:db/ident :odrl/assigneeOf,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Party,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Assignee Of"},
   :rdfs/range :odrl/Policy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Identifies an ODRL Policy for which the identified Party undertakes the assignee functional role."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "When assigneeOf has been asserted between a metadata expression and an ODRL Policy, the Party being identified MUST be inferred to undertake the assignee functional role of all the Rules of that Policy."}})

(def assigner
  "Assigner"
  {:db/ident           :odrl/assigner,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain        {:owl/unionOf [:odrl/Rule :odrl/Policy],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Assigner"},
   :rdfs/range         :odrl/Party,
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "The Party is the issuer of the Rule."}})

(def assignerOf
  "Assigner Of"
  {:db/ident :odrl/assignerOf,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Party,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Assigner Of"},
   :rdfs/range :odrl/Policy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Identifies an ODRL Policy for which the identified Party undertakes the assigner functional role."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "When assignerOf has been asserted between a metadata expression and an ODRL Policy, the Party being identified MUST be inferred to undertake the assigner functional role of all the Rules of that Policy."}})

(def attachPolicy
  "Attach policy"
  {:db/ident         :odrl/attachPolicy,
   :owl/deprecated   true,
   :rdf/type         #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Attach policy"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "The act of keeping the policy notice with the asset."},
   :skos/exactMatch  :cc/Notice})

(def attachSource
  "Attach source"
  {:db/ident :odrl/attachSource,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Attach source"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of attaching the source of the asset and its derivatives."},
   :skos/exactMatch :cc/SourceCode})

(def attribute
  "Attribute"
  {:db/ident :odrl/attribute,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Attribute"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "To attribute the use of the Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "May link to an Asset with the attribution information. May link to a Party with the  role “attributedParty” function."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def attributedParty
  "Attributed Party"
  {:db/ident           :odrl/attributedParty,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Attributed Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "The Party to be attributed."},
   :skos/note          {:rdf/language "en",
                        :rdf/value
                        "Maybe specified as part of the attribute action."},
   :skos/scopeNote     {:rdf/language "en",
                        :rdf/value    "Non-Normative"}})

(def attributingParty
  "Attributing Party"
  {:db/ident           :odrl/attributingParty,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Attributing Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    {:rdf/language "en",
                        :rdf/value "The Party who undertakes the attribution."},
   :skos/note          {:rdf/language "en",
                        :rdf/value
                        "Maybe specified as part of the attribute action."},
   :skos/scopeNote     {:rdf/language "en",
                        :rdf/value    "Non-Normative"}})

(def commercialize
  "Commercialize"
  {:db/ident         :odrl/commercialize,
   :owl/deprecated   true,
   :rdf/type         #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Commercialize"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "The act of using the asset in a business environment."},
   :skos/exactMatch  :cc/CommercialUse})

(def compensate
  "Compensate"
  {:db/ident :odrl/compensate,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compensate"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To compensate by transfer of some amount of value, if defined, for using or selling the Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The compensation may use different types of things with a value: (i) the thing is expressed by the value (term) of the Constraint name; (b) the value is expressed by operator, rightOperand, dataType and unit. Typically the assignee will compensate the assigner, but other compensation party roles may be used."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def compensatedParty
  "Compensated Party"
  {:db/ident :odrl/compensatedParty,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compensated Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The Party is the recipient of the compensation."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "Maybe specified as part of the compensate duty action."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def compensatingParty
  "Compensating Party"
  {:db/ident :odrl/compensatingParty,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compensating Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The Party that is the provider of the compensation."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "Maybe specified as part of the compensate duty action."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def concurrentUse
  "Concurrent Use"
  {:db/ident :odrl/concurrentUse,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Concurrent Use"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To create multiple copies of the Asset that are being concurrently used."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def conflict
  "Handle Policy Conflicts"
  {:db/ident         :odrl/conflict,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain      :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Handle Policy Conflicts"},
   :rdfs/range       :odrl/ConflictTerm,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "The conflict-resolution strategy for a Policy."},
   :skos/note        {:rdf/language "en",
                      :rdf/value
                      "If no strategy is specified, the default is invalid."}})

(def conflictConcepts
  "Policy Conflict Strategy"
  {:db/ident       :odrl/conflictConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/prohibit :odrl/perm :odrl/conflict :odrl/ConflictTerm
                     :odrl/invalid},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Policy Conflict Strategy"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def consentedParty
  "Consented Party"
  {:db/ident           :odrl/consentedParty,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Consented Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "The Party who obtains the consent."},
   :skos/note          {:rdf/language "en",
                        :rdf/value
                        "Maybe specified as part of the obtainConsent action."},
   :skos/scopeNote     {:rdf/language "en",
                        :rdf/value    "Non-Normative"}})

(def consentingParty
  "Consenting Party"
  {:db/ident           :odrl/consentingParty,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Consenting Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "The Party to obtain consent from."},
   :skos/note          {:rdf/language "en",
                        :rdf/value
                        "Maybe specified as part of the obtainConsent action."},
   :skos/scopeNote     {:rdf/language "en",
                        :rdf/value    "Non-Normative"}})

(def consequence
  "Consequence"
  {:db/ident :odrl/consequence,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Duty,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consequence"},
   :rdfs/range :odrl/Duty,
   :rdfs/subPropertyOf :odrl/failure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relates a Duty to another Duty, the latter being a consequence of not fulfilling the former."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The consequence property is utilised to express the repercussions of not fulfilling an agreed Policy obligation or duty for a Permission. If either of these fails to be fulfilled, then this will result in the consequence Duty also becoming a new requirement, meaning that the original obligation or duty, as well as the consequence Duty must all be fulfilled"}})

(def constraint
  "Has Constraint"
  {:db/ident :odrl/constraint,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain {:owl/unionOf [:odrl/Policy :odrl/Rule],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Constraint"},
   :rdfs/range {:owl/unionOf [:odrl/Constraint :odrl/LogicalConstraint],
                :rdf/type    :owl/Class},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Constraint applied to a Rule"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Constraints on Rules are used to determine if a rule is Active or not. Example: the Permission rule is only active during the year 2018."}})

(def constraintLeftOperandCommon
  "Constraint Left Operands"
  {:db/ident       :odrl/constraintLeftOperandCommon,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/fileFormat :odrl/virtualLocation :odrl/timeInterval
                     :odrl/event :odrl/relativeSize :odrl/spatialCoordinates
                     :odrl/product :odrl/dateTime :odrl/resolution
                     :odrl/deliveryChannel :odrl/language :odrl/delayPeriod
                     :odrl/systemDevice :odrl/version :odrl/absoluteSize
                     :odrl/count :odrl/relativePosition :odrl/payAmount
                     :odrl/media :odrl/absoluteTemporalPosition
                     :odrl/meteredTime :odrl/elapsedTime :odrl/unitOfCount
                     :odrl/relativeSpatialPosition :odrl/industry :odrl/purpose
                     :odrl/relativeTemporalPosition :odrl/recipient
                     :odrl/spatial :odrl/absoluteSpatialPosition
                     :odrl/percentage :odrl/absolutePosition},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Constraint Left Operands"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Common Vocabulary Terms"}})

(def constraintLogicalOperands
  "Logical Constraint Operands"
  {:db/ident       :odrl/constraintLogicalOperands,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/and :odrl/xone :odrl/andSequence :odrl/or},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Logical Constraint Operands"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def constraintRelationalOperators
  "Constraint Operators"
  {:db/ident       :odrl/constraintRelationalOperators,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/gt :odrl/neq :odrl/hasPart :odrl/isA :odrl/isAnyOf
                     :odrl/isPartOf :odrl/lt :odrl/gteq :odrl/eq :odrl/lteq
                     :odrl/isAllOf :odrl/isNoneOf},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Constraint Operators"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def constraintRightOpCommon
  "Constraint Right Operands"
  {:db/ident       :odrl/constraintRightOpCommon,
   :rdf/type       :skos/Collection,
   :skos/member    :odrl/policyUsage,
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Constraint Right Operands"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Common Vocabulary Terms"}})

(def constraints
  "Constraint"
  {:db/ident       :odrl/constraints,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/status :odrl/dataType :odrl/operator :odrl/refinement
                     :odrl/Operator :odrl/constraint :odrl/rightOperand
                     :odrl/Constraint :odrl/LeftOperand :odrl/unit
                     :odrl/RightOperand :odrl/leftOperand
                     :odrl/rightOperandReference},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Constraint"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def contractedParty
  "Contracted Party"
  {:db/ident           :odrl/contractedParty,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Contracted Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "The Party who is being contracted."},
   :skos/scopeNote     {:rdf/language "en",
                        :rdf/value    "Non-Normative"}})

(def contractingParty
  "Contracting Party"
  {:db/ident           :odrl/contractingParty,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Contracting Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    {:rdf/language "en",
                        :rdf/value "The Party who is offering the contract."},
   :skos/scopeNote     {:rdf/language "en",
                        :rdf/value    "Non-Normative"}})

(def copy
  "Copy"
  {:db/ident         :odrl/copy,
   :owl/deprecated   true,
   :owl/sameAs       :odrl/reproduce,
   :rdf/type         #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Copy"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "The act of making an exact reproduction of the asset."},
   :skos/exactMatch  :odrl/reproduce})

(def core
  "ODRL Core Profile"
  {:db/ident         :odrl/core,
   :rdf/type         #{:owl/Thing :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "ODRL Core Profile"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "Identifier for the ODRL Core Profile"}})

(def count
  "Count"
  {:db/ident         :odrl/count,
   :rdf/type         #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Count"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Numeric count of executions of the action of the Rule."},
   :skos/scopeNote   {:rdf/language "en",
                      :rdf/value    "Non-Normative"}})

(def dataType
  "Datatype"
  {:db/ident :odrl/dataType,
   :rdf/type #{:rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Datatype"},
   :rdfs/range :rdfs/Datatype,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The datatype of the value of the rightOperand or rightOperandReference of a Constraint."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "In RDF encodings, use of the rdf:datatype MUST be used. In JSON-LD encoding, the use of @type MUST be used."}})

(def dateTime
  "Datetime"
  {:db/ident :odrl/dateTime,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Datetime"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date (and optional time and timezone) of exercising the action of the Rule. Right operand value MUST be an xsd:date or xsd:dateTime as defined by [[xmlschema11-2]]."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The use of Timezone information is strongly recommended. The Rule may be exercised before (with operator lt/lteq) or after (with operator gt/gteq) the date(time) defined by the Right operand. <br />Example: <code>dateTime gteq 2017-12-31T06:00Z</code> means the Rule can only be exercised after (and including) 6:00AM on the 31st Decemeber 2017 UTC time."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def delayPeriod
  "Delay Period"
  {:db/ident :odrl/delayPeriod,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delay Period"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A time delay period prior to exercising the action of the Rule. The point in time triggering this period MAY be defined by another temporal Constraint combined by a Logical Constraint (utilising the odrl:andSequence operand). Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Only the eq, gt, gteq operators SHOULD be used. <br />Example: <code>delayPeriod eq P60M</code> indicates a delay of 60 Minutes before exercising the action."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def delete
  "Delete"
  {:db/ident :odrl/delete,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delete"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To permanently remove all copies of the Asset after it has been used."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Use a constraint to define under which conditions the Asset must be deleted."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def deliveryChannel
  "Delivery Channel"
  {:db/ident :odrl/deliveryChannel,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delivery Channel"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The delivery channel used for exercising the action of the Rule."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Example: the asset may be distributed only on mobile networks."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def deprecatedTerms
  "Deprecated Terms"
  {:db/ident       :odrl/deprecatedTerms,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/lend :odrl/undefined :odrl/share :odrl/ignore
                     :odrl/PartyScope :odrl/preview :odrl/device
                     :odrl/attachSource :odrl/proximity :odrl/AssetScope
                     :odrl/pay :odrl/payeeParty :odrl/AllConnections
                     :odrl/All2ndConnections :odrl/adHocShare :odrl/Group
                     :odrl/Individual :odrl/commercialize :odrl/copy
                     :odrl/system :odrl/inheritAllowed :odrl/secondaryUse
                     :odrl/support :odrl/UndefinedTerm :odrl/lease
                     :odrl/extractPage :odrl/All :odrl/inheritRelation
                     :odrl/extractWord :odrl/appendTo :odrl/license
                     :odrl/writeTo :odrl/shareAlike :odrl/AllGroups :odrl/append
                     :odrl/attachPolicy :odrl/scope :odrl/export
                     :odrl/extractChar :odrl/write :odrl/timedCount},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Deprecated Terms"}})

(def derive
  "Derive"
  {:db/ident :odrl/derive,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Derive"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To create a new derivative Asset from this Asset and to edit or modify the derivative."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "A new asset is created and may have significant overlaps with the original Asset. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective). To the derived Asset a next policy may be applied."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def device
  "Device"
  {:db/ident :odrl/device,
   :owl/deprecated true,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An identified device used for exercising the action of the Rule."},
   :skos/exactMatch :odrl/systemDevice,
   :skos/note "See System Device."})

(def digitize
  "Digitize"
  {:db/ident :odrl/digitize,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Digitize"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To produce a digital copy of (or otherwise digitize) the Asset from its analogue form."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def display
  "Display"
  {:db/ident :odrl/display,
   :odrl/includedIn :odrl/play,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Display"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "To create a static and transient rendition of an Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, displaying an image on a screen. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def distribute
  "Distribute"
  {:db/ident :odrl/distribute,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Distribute"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "To supply the Asset to third-parties."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "It is recommended to use nextPolicy to express the allowable usages by third-parties."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def duties
  "Duty"
  {:db/ident       :odrl/duties,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/duty :odrl/remedy :odrl/obligation :odrl/consequence
                     :odrl/Duty},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Duty"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def duty
  "Has Duty"
  {:db/ident :odrl/duty,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Permission,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Duty"},
   :rdfs/range :odrl/Duty,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Relates an individual Duty to a Permission."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "A Duty is a pre-condition which must be fulfilled in order to receive the Permission."}})

(def elapsedTime
  "Elapsed Time"
  {:db/ident :odrl/elapsedTime,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Elapsed Time"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A continuous elapsed time period which may be used for exercising of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."},
   :skos/note
   "Only the eq, lt, lteq operators SHOULD be used. See also Metered Time. <br />Example: <code>elpasedTime eq P60M</code> indicates a total elapsed time of 60 Minutes.",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def ensureExclusivity
  "Ensure Exclusivity"
  {:db/ident :odrl/ensureExclusivity,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ensure Exclusivity"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "To ensure that the Rule on the Asset is exclusive."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "If used as a Duty, the assignee should be explicitly indicated as the party that is ensuring the exclusivity of the Rule."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def eq
  "Equal to"
  {:db/ident :odrl/eq,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Equal to"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicating that a given value equals the right operand of the Constraint."}})

(def event
  "Event"
  {:db/ident :odrl/event,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An identified event setting a context for exercising the action of the Rule."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Events are temporal periods of time, and operators can be used to signal before (lt), during (eq) or after (gt) the event. <br />Example: May be taken during the “FIFA World Cup 2020” only."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def execute
  "Execute"
  {:db/ident :odrl/execute,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Execute"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "To run the computer program Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, machine executable code or Java such as a game or application."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def export
  "Export"
  {:db/ident         :odrl/export,
   :owl/deprecated   true,
   :rdf/type         #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Export"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "The act of transforming the asset into a new form."},
   :skos/exactMatch  :odrl/transform})

(def extract
  "Extract"
  {:db/ident :odrl/extract,
   :odrl/includedIn :odrl/reproduce,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extract"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "To extract parts of the Asset and to use it as a new Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "A new asset is created and may have very little in common with the original Asset. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective). To the extracted Asset a next policy may be applied."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def extractChar
  "Extract character"
  {:db/ident :odrl/extractChar,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extract character"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of extracting (replicating) unchanged characters from the asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-char ."}})

(def extractPage
  "Extract page"
  {:db/ident :odrl/extractPage,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extract page"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of extracting (replicating) unchanged pages from the asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-page ."}})

(def extractWord
  "Extract word"
  {:db/ident :odrl/extractWord,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extract word"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of extracting (replicating) unchanged words from the asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This original term and URI from the ONIX specification should be used: http://www.editeur.org/onix-pl/extract-word ."}})

(def failure
  "Failure"
  {:db/ident :odrl/failure,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Rule,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Failure"},
   :rdfs/range :odrl/Rule,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Failure is an abstract property that defines the violation (or unmet) relationship between Rules."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The parent property to sub-properties that express explicit failure contexts."}})

(def fileFormat
  "File Format"
  {:db/ident         :odrl/fileFormat,
   :rdf/type         #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "File Format"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "A transformed file format of the target Asset."},
   :skos/note        {:rdf/language "en",
                      :rdf/value
                      "Example: An asset may be transformed into JPEG format."},
   :skos/scopeNote   {:rdf/language "en",
                      :rdf/value    "Non-Normative"}})

(def function
  "Function"
  {:db/ident :odrl/function,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Function"},
   :rdfs/range :odrl/Party,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Function is an abstract property whose sub-properties define the functional roles which may be fulfilled by a party in relation to a Rule."}})

(def give
  "Give"
  {:db/ident :odrl/give,
   :odrl/includedIn :odrl/transfer,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Give"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To transfer the ownership of the Asset to a third party without compensation and while deleting the original asset."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def grantUse
  "Grant Use"
  {:db/ident :odrl/grantUse,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Grant Use"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "To grant the use of the Asset to third parties."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This action enables the assignee to create policies for the use of the Asset for third parties. The nextPolicy is recommended to be agreed with the third party. Use of temporal constraints is recommended."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def gt
  "Greater than"
  {:db/ident :odrl/gt,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Greater than"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicating that a given value is greater than the right operand of the Constraint."}})

(def gteq
  "Greater than or equal to"
  {:db/ident :odrl/gteq,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Greater than or equal to"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicating that a given value is greater than or equal to the right operand of the Constraint."}})

(def hasPart
  "Has part"
  {:db/ident :odrl/hasPart,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has part"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A set-based operator indicating that a given value contains the right operand of the Constraint."}})

(def hasPolicy
  "Target Policy"
  {:db/ident :odrl/hasPolicy,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Asset,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Target Policy"},
   :rdfs/range :odrl/Policy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Identifies an ODRL Policy for which the identified Asset is the target Asset to all the Rules."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The Asset being identified MUST be inferred to be the target Asset of all of the Rules of the Policy."}})

(def ignore
  "Ignore Undefined Actions"
  {:db/ident :odrl/ignore,
   :owl/deprecated true,
   :rdf/type #{:odrl/UndefinedTerm :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ignore Undefined Actions"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Action is to be ignored and is not part of the policy – and the policy remains valid."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "Used to support actions not known to the policy system."}})

(def implies
  "Implies"
  {:db/ident :odrl/implies,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Action,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Implies"},
   :rdfs/range :odrl/Action,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An Action asserts that another Action is not prohibited to enable its operational semantics."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The property asserts that an instance of Action entails that the other instance of Action is not prohibited."}})

(def include
  "Include"
  {:db/ident :odrl/include,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Include"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "To include other related assets in the Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example: bio picture must be included in the attribution. Use of a relation sub-property is required for the related assets."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def includedIn
  "Included In"
  {:db/ident :odrl/includedIn,
   :rdf/type #{:owl/TransitiveProperty :owl/ObjectProperty :rdf/Property
               :skos/Concept},
   :rdfs/domain :odrl/Action,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Included In"},
   :rdfs/range :odrl/Action,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An Action transitively asserts that another Action that encompasses its operational semantics."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The purpose is to explicitly assert that the semantics of the referenced instance of an other Action encompasses (includes) the semantics of this instance of Action. The includedIn property is transitive, and as such, the Actions form ancestor relationships."}})

(def index
  "Index"
  {:db/ident :odrl/index,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Index"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "To record the Asset in an index."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, to include a link to the Asset in a search engine database."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def industry
  "Industry Context"
  {:db/ident :odrl/industry,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Industry Context"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A defined industry sector setting a context for exercising the action of the Rule."},
   :skos/note {:rdf/language "en",
               :rdf/value    "Example: publishing or financial industry."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def inform
  "Inform"
  {:db/ident :odrl/inform,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inform"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To inform that an action has been performed on or in relation to the Asset."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "May link to a Party with the role 'informedParty' function."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def informedParty
  "Informed Party"
  {:db/ident           :odrl/informedParty,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Informed Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    {:rdf/language "en",
                        :rdf/value    "The Party to be informed of all uses."},
   :skos/note          {:rdf/language "en",
                        :rdf/value
                        "Maybe specified as part of the inform action."},
   :skos/scopeNote     {:rdf/language "en",
                        :rdf/value    "Non-Normative"}})

(def informingParty
  "Informing Party"
  {:db/ident           :odrl/informingParty,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Informing Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "The Party who provides the inform use data."},
   :skos/note          {:rdf/language "en",
                        :rdf/value
                        "Maybe specified as part of the inform action."},
   :skos/scopeNote     {:rdf/language "en",
                        :rdf/value    "Non-Normative"}})

(def inheritAllowed
  "Inheritance Allowed"
  {:db/ident         :odrl/inheritAllowed,
   :owl/deprecated   true,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Inheritance Allowed"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Indicates if the Policy entity can be inherited."},
   :skos/note        {:rdf/language "en",
                      :rdf/value    "A boolean value."}})

(def inheritFrom
  "Inherits From"
  {:db/ident :odrl/inheritFrom,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inherits From"},
   :rdfs/range :odrl/Policy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relates a (child) policy to another (parent) policy from which terms are inherited."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "The child policy will inherit Rules from the parent policy"}})

(def inheritRelation
  "Inherit Relation"
  {:db/ident :odrl/inheritRelation,
   :owl/deprecated true,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inherit Relation"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Indentifies the type of inheritance."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, this may indicate the business scenario, such as subscription, or prior arrangements between the parties (that are not machine representable)."}})

(def install
  "Install"
  {:db/ident :odrl/install,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Install"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To load the computer program Asset onto a storage device which allows operating or running the Asset."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def invalid
  "Void Policy"
  {:db/ident :odrl/invalid,
   :rdf/type #{:owl/NamedIndividual :skos/Concept :odrl/ConflictTerm},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Void Policy"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The policy is void."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "Used to indicate the policy is void for Conflict Strategy."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def isA
  "Is a"
  {:db/ident :odrl/isA,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is a"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A set-based operator indicating that a given value is an instance of the right operand of the Constraint."}})

(def isAllOf
  "Is all of"
  {:db/ident :odrl/isAllOf,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is all of"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A set-based operator indicating that a given value is all of the right operand of the Constraint."}})

(def isAnyOf
  "Is any of"
  {:db/ident :odrl/isAnyOf,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is any of"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A set-based operator indicating that a given value is any of the right operand of the Constraint."}})

(def isNoneOf
  "Is none of"
  {:db/ident :odrl/isNoneOf,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is none of"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A set-based operator indicating that a given value is none of the right operand of the Constraint."}})

(def isPartOf
  "Is part of"
  {:db/ident :odrl/isPartOf,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Is part of"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A set-based operator indicating that a given value is contained by the right operand of the Constraint."}})

(def language
  "Language"
  {:db/ident :odrl/language,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Language"},
   :skos/definition {:rdf/language "en",
                     :rdf/value "A natural language used by the target Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Example: the asset can only be translated into Greek. Must use [[bcp47]] codes for language values."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def lease
  "Lease"
  {:db/ident :odrl/lease,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lease"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of making available the asset to a third-party for a fixed period of time with exchange of value."}})

(def leftOperand
  "Has Left Operand"
  {:db/ident         :odrl/leftOperand,
   :rdf/type         #{:rdf/Property :skos/Concept},
   :rdfs/domain      :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Has Left Operand"},
   :rdfs/range       :odrl/LeftOperand,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "The left operand in a constraint expression."}})

(def lend
  "Lend"
  {:db/ident :odrl/lend,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lend"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of making available the asset to a third-party for a fixed period of time without exchange of value."}})

(def license
  "License"
  {:db/ident :odrl/license,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "License"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of granting the right to use the asset to a third-party."},
   :skos/exactMatch :odrl/grantUse})

(def logicalConstraints
  "Logical Constraint"
  {:db/ident       :odrl/logicalConstraints,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/operand :odrl/LogicalConstraint},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Logical Constraint"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def lt
  "Less than"
  {:db/ident :odrl/lt,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Less than"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicating that a given value is less than the right operand of the Constraint."}})

(def lteq
  "Less than or equal to"
  {:db/ident :odrl/lteq,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Less than or equal to"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicating that a given value is less than or equal to the right operand of the Constraint."}})

(def media
  "Media Context"
  {:db/ident :odrl/media,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Media Context"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Category of a media asset setting a context for exercising the action of the Rule."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Example media types: electronic, print, advertising, marketing. Note: The used type should not be an IANA MediaType as they are focused on technical characteristics. "},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def meteredTime
  "Metered Time"
  {:db/ident :odrl/meteredTime,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Metered Time"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An accumulated amount of one to many metered time periods which were used for exercising the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."},
   :skos/note
   "Only the eq, lt, lteq operators SHOULD be used. See also Elapsed Time. <br />Example: <code>meteredTime lteq P60M</code> indicates an accumulated period of 60 Minutes or less.",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def modify
  "Modify"
  {:db/ident :odrl/modify,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Modify"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To change existing content of the Asset. A new asset is not created by this action."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This action will modify an asset which is typically updated from time to time without creating a new asset. If the result from modifying the asset should be a new asset the actions derive or extract should be used. (Note that the notion of whether or not the change is significant enough to qualify as a new asset is subjective)."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def move
  "Move"
  {:db/ident :odrl/move,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Move"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To move the Asset from one digital location to another including deleting the original copy."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "After the Asset has been moved, the original copy must be deleted."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def neq
  "Not equal to"
  {:db/ident :odrl/neq,
   :rdf/type #{:odrl/Operator :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Not equal to"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicating that a given value is not equal to the right operand of the Constraint."}})

(def nextPolicy
  "Next Policy"
  {:db/ident :odrl/nextPolicy,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Next Policy"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To grant the specified Policy to a third party for their use of the Asset."},
   :skos/note {:rdf/language "en",
               :rdf/value    "Useful for downstream policies."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def obligation
  "Obligation"
  {:db/ident         :odrl/obligation,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain      :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Obligation"},
   :rdfs/range       :odrl/Duty,
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "Relates an individual Duty to a Policy."},
   :skos/note        {:rdf/language "en",
                      :rdf/value
                      "The Duty is a requirement which must be fulfilled."}})

(def obtainConsent
  "Obtain Consent"
  {:db/ident :odrl/obtainConsent,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Obtain Consent"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To obtain verifiable consent to perform the requested action in relation to the Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "May be used as a Duty to ensure that the Assigner or a Party is authorized to approve such actions on a case-by-case basis. May link to a Party with the role “consentingParty” function."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def operand
  "Operand"
  {:db/ident :odrl/operand,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/LogicalConstraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Operand"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Operand is an abstract property for a logical relationship."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "Sub-properties of operand are used for Logical Constraints."}})

(def operator
  "Has Operator"
  {:db/ident :odrl/operator,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Operator"},
   :rdfs/range :odrl/Operator,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The operator function applied to operands of a Constraint"}})

(def or
  "Or"
  {:db/ident :odrl/or,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Or"},
   :rdfs/subPropertyOf :odrl/operand,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The relation is satisfied when at least one of the Constraints is satisfied."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances."}})

(def output
  "Output"
  {:db/ident :odrl/output,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Rule,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Output"},
   :rdfs/range :odrl/Asset,
   :rdfs/subPropertyOf :odrl/relation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The output property specifies the Asset which is created from the output of the Action."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def partOf
  "Part Of"
  {:db/ident :odrl/partOf,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain {:owl/unionOf [:odrl/Asset :odrl/Party],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Part Of"},
   :rdfs/range {:owl/unionOf [:odrl/AssetCollection :odrl/PartyCollection],
                :rdf/type    :owl/Class},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Identifies an Asset/PartyCollection that the Asset/Party is a member of."}})

(def partyConcepts
  "Party"
  {:db/ident       :odrl/partyConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/PartyCollection :odrl/Party},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Party"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def partyRoles
  "Party Functions"
  {:db/ident       :odrl/partyRoles,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/assignerOf :odrl/assigner :odrl/assignee
                     :odrl/assigneeOf},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Party Functions"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def partyRolesCommon
  "Party Functions"
  {:db/ident       :odrl/partyRolesCommon,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/contractedParty :odrl/consentedParty
                     :odrl/consentingParty :odrl/trackedParty
                     :odrl/trackingParty :odrl/attributedParty
                     :odrl/compensatingParty :odrl/informingParty
                     :odrl/informedParty :odrl/attributingParty
                     :odrl/contractingParty :odrl/compensatedParty},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Party Functions"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Common Vocabulary Terms"}})

(def pay
  "Pay"
  {:db/ident :odrl/pay,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pay"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of paying a financial amount to a party for use of the asset."},
   :skos/exactMatch :odrl/compensate})

(def payAmount
  "Payment Amount"
  {:db/ident :odrl/payAmount,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment Amount"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The amount of a financial payment. Right operand value MUST be an xsd:decimal. "},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Can be used for compensation duties with the unit property indicating the currency of the payment."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def payeeParty
  "Payee Party"
  {:db/ident         :odrl/payeeParty,
   :owl/deprecated   true,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Payee Party"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value "The Party is the recipient of the payment."},
   :skos/exactMatch  :odrl/compensatedParty,
   :skos/scopeNote   {:rdf/language "en",
                      :rdf/value    "Non-Normative"}})

(def percentage
  "Asset Percentage"
  {:db/ident :odrl/percentage,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asset Percentage"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A percentage amount of the target Asset relevant for exercising the action of the Rule. Right operand value MUST be an xsd:decimal from 0 to 100."},
   :skos/note {:rdf/language "en",
               :rdf/value    "Example: Extract less than or equal to 50%."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def perm
  "Prefer Permissions"
  {:db/ident         :odrl/perm,
   :rdf/type         #{:owl/NamedIndividual :skos/Concept :odrl/ConflictTerm},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Prefer Permissions"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Permissions take preference over prohibitions."},
   :skos/note        {:rdf/language "en",
                      :rdf/value
                      "Used to determine policy conflict outcomes."}})

(def permission
  "Has Permission"
  {:db/ident         :odrl/permission,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain      :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Has Permission"},
   :rdfs/range       :odrl/Permission,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Relates an individual Permission to a Policy."}})

(def permissions
  "Permission"
  {:db/ident       :odrl/permissions,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/permission :odrl/Permission},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Permission"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def play
  "Play"
  {:db/ident :odrl/play,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Play"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "To create a sequential and transient rendition of an Asset."},
   :skos/note
   "For example, to play a video or audio track. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used.",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def policyConcepts
  "Policy"
  {:db/ident       :odrl/policyConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/inheritFrom :odrl/profile :odrl/Policy :odrl/uid},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Policy"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def policySubClasses
  "Policy Subclasses"
  {:db/ident       :odrl/policySubClasses,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/Agreement :odrl/Offer :odrl/Set},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Policy Subclasses"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def policySubClassesCommon
  "Policy Subclasses"
  {:db/ident       :odrl/policySubClassesCommon,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/Ticket :odrl/Request :odrl/Assertion :odrl/Privacy},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Policy Subclasses"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Common Vocabulary Terms"}})

(def policyUsage
  "Policy Rule Usage"
  {:db/ident :odrl/policyUsage,
   :rdf/type #{:owl/NamedIndividual :skos/Concept :odrl/RightOperand},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Policy Rule Usage"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Indicates the actual datetime the action of the Rule was exercised."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This can be used to express constraints with a LeftOperand relative to the time the rule is exercised. Operators indicate before (lt, lteq), during (eq) or after (gt, gteq) the usage of the rule. <br />Example: <code>event lt policyUsage</code> expresses that the identified event must have happened before the action of the rule is exercised."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def present
  "Present"
  {:db/ident         :odrl/present,
   :odrl/includedIn  :odrl/use,
   :rdf/type         #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Present"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "To publicly perform the Asset."},
   :skos/note        "The asset can be performed (or communicated) in public.",
   :skos/scopeNote   {:rdf/language "en",
                      :rdf/value    "Non-Normative"}})

(def preview
  "Preview"
  {:db/ident         :odrl/preview,
   :owl/deprecated   true,
   :rdf/type         #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Preview"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "The act of providing a short preview of the asset."},
   :skos/note        {:rdf/language "en",
                      :rdf/value
                      "Use a time constraint with the appropriate action."}})

(def print
  "Print"
  {:db/ident :odrl/print,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Print"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "To create a tangible and permanent rendition of an Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, creating a permanent, fixed (static), and directly perceivable representation of the Asset, such as printing onto paper."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def product
  "Product Context"
  {:db/ident :odrl/product,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Product Context"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Category of product or service setting a context for exercising the action of the Rule."},
   :skos/note {:rdf/language "en",
               :rdf/value    "Example: May only be used in the XYZ Magazine."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def profile
  "Profile"
  {:db/ident :odrl/profile,
   :rdf/type #{:rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Profile"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The identifier(s) of an ODRL Profile that the Policy conforms to."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The profile property is mandatory if the Policy is using an ODRL Profile."}})

(def prohibit
  "Prefer Prohibitions"
  {:db/ident         :odrl/prohibit,
   :rdf/type         #{:owl/NamedIndividual :skos/Concept :odrl/ConflictTerm},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Prefer Prohibitions"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Prohibitions take preference over permissions."},
   :skos/note        {:rdf/language "en",
                      :rdf/value
                      "Used to determine policy conflict outcomes."}})

(def prohibition
  "Has Prohibition"
  {:db/ident         :odrl/prohibition,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain      :odrl/Policy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Has Prohibition"},
   :rdfs/range       :odrl/Prohibition,
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Relates an individual Prohibition to a Policy."}})

(def prohibitions
  "Prohibition"
  {:db/ident       :odrl/prohibitions,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/Prohibition :odrl/prohibition},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Prohibition"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def proximity
  "proximity"
  {:db/ident :odrl/proximity,
   :owl/deprecated true,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "proximity"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An value indicating the closeness or nearness."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/proximity ."}})

(def purpose
  "Purpose"
  {:db/ident :odrl/purpose,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Purpose"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A defined purpose for exercising the action of the Rule."},
   :skos/note {:rdf/language "en",
               :rdf/value    "Example: Educational use."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def read
  "Read"
  {:db/ident :odrl/read,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Read"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "To obtain data from the Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For example, the ability to read a record from a database (the Asset)."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def recipient
  "Recipient"
  {:db/ident :odrl/recipient,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Recipient"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party receiving the result/outcome of exercising the action of the Rule."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The Right Operand must identify one or more specific Parties or category/ies of the Party."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def refinement
  "Refinement"
  {:db/ident :odrl/refinement,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain
   {:owl/unionOf [:odrl/Action :odrl/AssetCollection :odrl/PartyCollection],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Refinement"},
   :rdfs/range {:owl/unionOf [:odrl/Constraint :odrl/LogicalConstraint],
                :rdf/type    :owl/Class},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Constraint used to refine the semantics of an Action, or Party/Asset Collection"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Example: the Action print is only permitted on 50% of the asset."}})

(def relation
  "Relation"
  {:db/ident :odrl/relation,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relation"},
   :rdfs/range :odrl/Asset,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation is an abstract property which creates an explicit link between an Action and an Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Sub-properties of relation are used to define the nature of that link."}})

(def relativePosition
  "Relative Asset Position"
  {:db/ident :odrl/relativePosition,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relative Asset Position"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Example: The upper left corner of a picture may be constrained to a specific position of the canvas rendering it."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def relativeSize
  "Relative Asset Size"
  {:db/ident :odrl/relativeSize,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relative Asset Size"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Measure(s) of one or two axes for 2D-objects or measure(s) of one to tree axes for 3D-objects - expressed as percentages of full values - of the target Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Example: The image can be resized in width to a maximum of 200%. Note: See the Left Operand absoluteSize. "},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def relativeSpatialPosition
  "Relative Spatial Asset Position"
  {:db/ident :odrl/relativeSpatialPosition,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relative Spatial Asset Position"},
   :skos/broaderTransitive :odrl/relativePosition,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The relative spatial positions - expressed as percentages of full values - of four corners of a rectangle on a 2D-canvas or the eight corners of a cuboid in a 3D-space of the target Asset."},
   :skos/note {:rdf/language "en",
               :rdf/value    "See also Absolute Spatial Asset Position."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def relativeTemporalPosition
  "Relative Temporal Asset Position"
  {:db/ident :odrl/relativeTemporalPosition,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relative Temporal Asset Position"},
   :skos/broaderTransitive :odrl/relativePosition,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A point in space or time defined with coordinates relative to full measures the positioning of the target Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "See also Absolute Temporal Asset Position. <br />Example: The MP3 music file must be positioned between the positions at 33% and 48% of the temporal length of a stream. "},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def remedy
  "Remedy"
  {:db/ident :odrl/remedy,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Prohibition,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Remedy"},
   :rdfs/range :odrl/Duty,
   :rdfs/subPropertyOf :odrl/failure,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Relates an individual remedy Duty to a Prohibition."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The remedy property expresses an agreed Duty that must be fulfilled in case that a Prohibition has been violated by being exercised."}})

(def reproduce
  "Reproduce"
  {:db/ident :odrl/reproduce,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reproduce"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "To make duplicate copies the Asset in any material form."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def resolution
  "Rendition Resolution"
  {:db/ident         :odrl/resolution,
   :rdf/type         #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Rendition Resolution"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Resolution of the rendition of the target Asset."},
   :skos/note        {:rdf/language "en",
                      :rdf/value
                      "Example: the image may be printed at 1200dpi."},
   :skos/scopeNote   {:rdf/language "en",
                      :rdf/value    "Non-Normative"}})

(def reviewPolicy
  "Review Policy"
  {:db/ident :odrl/reviewPolicy,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Review Policy"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "To review the Policy applicable to the Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Used when human intervention is required to review the Policy. May link to an Asset which represents the full Policy information."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def rightOperand
  "Has Right Operand"
  {:db/ident :odrl/rightOperand,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Right Operand"},
   :rdfs/range {:owl/unionOf [:odrl/RightOperand :rdfs/Literal :xsd/anyURI],
                :rdf/type    :owl/Class},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The value of the right operand in a constraint expression."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "When used with set-based operators, a list of values may be used."}})

(def rightOperandReference
  "Has Right Operand Reference"
  {:db/ident :odrl/rightOperandReference,
   :rdf/type #{:rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Right Operand Reference"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A reference to a web resource providing the value for the right operand of a Constraint."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "An IRI that MUST be dereferenced to obtain the actual right operand value. When used with set-based operators, a list of IRIs may be used"}})

(def ruleConcepts
  "Rule"
  {:db/ident       :odrl/ruleConcepts,
   :rdf/type       :skos/Collection,
   :skos/member    #{:odrl/function :odrl/relation :odrl/Rule :odrl/failure},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Rule"},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "ODRL Core Vocabulary Terms"}})

(def scope
  "Scope"
  {:db/ident :odrl/scope,
   :owl/deprecated true,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scope"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The identifier of a scope that provides context to the extent of the entity."},
   :skos/note {:rdf/language "en",
               :rdf/value    "Used to define scopes for Assets and Parties."}})

(def secondaryUse
  "Secondary Use"
  {:db/ident :odrl/secondaryUse,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Secondary Use"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of using the asset for a purpose other than the purpose it was intended for."}})

(def sell
  "Sell"
  {:db/ident :odrl/sell,
   :odrl/includedIn :odrl/transfer,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sell"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To transfer the ownership of the Asset to a third party with compensation and while deleting the original asset."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def share
  "Share"
  {:db/ident :odrl/share,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Share"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of the non-commercial reproduction and distribution of the asset to third-parties."},
   :skos/exactMatch :cc/Sharing})

(def shareAlike
  "Share-alike"
  {:db/ident :odrl/shareAlike,
   :owl/deprecated true,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Share-alike"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The act of distributing any derivative asset under the same terms as the original asset."},
   :skos/exactMatch :cc/ShareAlike})

(def source
  "Source"
  {:db/ident :odrl/source,
   :rdf/type #{:rdf/Property :skos/Concept},
   :rdfs/domain {:owl/unionOf [:odrl/AssetCollection :odrl/PartyCollection],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Source"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Reference to a Asset/PartyCollection"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Used by AssetCollection and PartyCollection when constraints are applied."}})

(def spatial
  "Geospatial Named Area"
  {:db/ident :odrl/spatial,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Geospatial Named Area"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A named and identified geospatial area with defined borders which is used for exercising the action of the Rule. An IRI MUST be used to represent this value."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "A code value for the area and source of the code must be presented in the Right Operand. <br />Example: the [[iso3166]] Country Codes or the Getty Thesaurus of Geographic Names. "},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def spatialCoordinates
  "Geospatial Coordinates"
  {:db/ident :odrl/spatialCoordinates,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Geospatial Coordinates"},
   :skos/broaderTransitive :odrl/spatial,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A set of coordinates setting the borders of a geospatial area used for exercising the action of the Rule. The coordinates MUST include longitude and latitude, they MAY include altitude and the geodetic datum."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The default values are the altitude of earth's surface at this location and the WGS 84 datum."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def status
  "Status"
  {:db/ident :odrl/status,
   :rdf/type #{:rdf/Property :skos/Concept},
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Status"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the value generated from the leftOperand action or a value related to the leftOperand set as the reference for the comparison."}})

(def stream
  "Stream"
  {:db/ident :odrl/stream,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Stream"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "To deliver the Asset in real-time."},
   :skos/note
   "The Asset maybe utilised in real-time as it is being delivered. If the action is to be performed to a wider audience than just the Assignees, then the Recipient constraint is recommended to be used.",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def support
  "Support Undefined Actions"
  {:db/ident :odrl/support,
   :owl/deprecated true,
   :rdf/type #{:odrl/UndefinedTerm :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Support Undefined Actions"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Action is to be supported as part of the policy – and the policy remains valid."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "Used to support actions not known to the policy system."}})

(def synchronize
  "Synchronize"
  {:db/ident :odrl/synchronize,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Synchronize"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To use the Asset in timed relations with media (audio/visual) elements of another Asset."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def system
  "System"
  {:db/ident :odrl/system,
   :owl/deprecated true,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "System"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An identified computing system used for exercising the action of the Rule."},
   :skos/exactMatch :odrl/systemDevice,
   :skos/note "See System Device"})

(def systemDevice
  "System Device"
  {:db/ident :odrl/systemDevice,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "System Device"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An identified computing system or computing device used for exercising the action of the Rule."},
   :skos/exactMatch #{:odrl/device :odrl/system},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Example: The system device can be identified by a unique code created from the used hardware."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def target
  "Target"
  {:db/ident :odrl/target,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/domain {:owl/unionOf [:odrl/Rule :odrl/Policy],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Target"},
   :rdfs/range :odrl/Asset,
   :rdfs/subPropertyOf :odrl/relation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The target property indicates the Asset that is the primary subject to which the Rule action directly applies."}})

(def textToSpeech
  "Text-to-speech"
  {:db/ident :odrl/textToSpeech,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Text-to-speech"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "To have a text Asset read out loud."},
   :skos/note
   "If the action is to be performed to a wider audience than just the Assignees, then the recipient constraint is recommended to be used.",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def timeInterval
  "Recurring Time Interval"
  {:db/ident :odrl/timeInterval,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Recurring Time Interval"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A recurring period of time before the next execution of the action of the Rule. Right operand value MUST be an xsd:duration as defined by [[xmlschema11-2]]."},
   :skos/note
   "Only the eq operator SHOULD be used. <br />Example: <code>timeInterval eq P7D</code> indicates a recurring 7 day period.",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def timedCount
  "Timed Count"
  {:db/ident :odrl/timedCount,
   :owl/deprecated true,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Timed Count"},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The number of seconds after which timed metering use of the asset begins."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This original term and URI from the OMA specification should be used: http://www.openmobilealliance.com/oma-dd/timed-count ."}})

(def trackedParty
  "Tracked Party"
  {:db/ident :odrl/trackedParty,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tracked Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The Party whose usage is being tracked."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "May be specified as part of the acceptTracking action."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def trackingParty
  "Tracking Party"
  {:db/ident :odrl/trackingParty,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tracking Party"},
   :rdfs/subPropertyOf :odrl/function,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The Party who is tracking usage."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "May be specified as part of the acceptTracking action."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def transfer
  "Transfer Ownership"
  {:db/ident         :odrl/transfer,
   :rdf/type         #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Transfer Ownership"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "To transfer the ownership of the Asset in perpetuity."}})

(def transform
  "Transform"
  {:db/ident :odrl/transform,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transform"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "To convert the Asset into a different format."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Typically used to convert the Asset into a different format for consumption on/transfer to a third party system."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def translate
  "Translate"
  {:db/ident :odrl/translate,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Translate"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To translate the original natural language of an Asset into another natural language."},
   :skos/note {:rdf/language "en",
               :rdf/value "A new derivative Asset is created by that action."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def uid
  "Unique Identifier"
  {:db/ident :odrl/uid,
   :rdf/type #{:rdf/Property :skos/Concept},
   :rdfs/domain {:owl/unionOf [:odrl/Policy
                               :odrl/Asset
                               :odrl/Rule
                               :odrl/Party
                               :odrl/Constraint
                               :odrl/LogicalConstraint],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unique Identifier"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An unambiguous identifier"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Used by the Policy, Rule, Asset, Party, Constraint, and Logical Constraint Classes."}})

(def undefined
  "Handle Undefined Term"
  {:db/ident :odrl/undefined,
   :owl/deprecated true,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Handle Undefined Term"},
   :rdfs/range :odrl/UndefinedTerm,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relates the strategy used for handling undefined actions to a Policy."},
   :skos/note {:rdf/language "en",
               :rdf/value
               "If no strategy is specified, the default is invalid."}})

(def uninstall
  "Uninstall"
  {:db/ident :odrl/uninstall,
   :odrl/includedIn :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Uninstall"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To unload and delete the computer program Asset from a storage device and disable its readiness for operation."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The Asset is no longer accessible to the assignees after it has been used."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def unit
  "Unit"
  {:db/ident :odrl/unit,
   :rdf/type :rdf/Property,
   :rdfs/domain :odrl/Constraint,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unit"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The unit of measurement of the value of the rightOperand or rightOperandReference of a Constraint."}})

(def unitOfCount
  "Unit Of Count"
  {:db/ident :odrl/unitOfCount,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unit Of Count"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The unit of measure used for counting the executions of the action of the Rule."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Note: Typically used with Duties to indicate the unit entity to be counted of the Action. <br />Example: A duty to compensate and a unitOfCount constraint of 'perUser' would indicate that the compensation by multiplied by the 'number of users'."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def use
  "Use"
  {:db/ident :odrl/use,
   :rdf/type #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Use"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "To use the Asset"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Use is the most generic action for all non-third-party usage. More specific types of the use action can be expressed by more targetted actions."}})

(def version
  "Version"
  {:db/ident :odrl/version,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Version"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The version of the target Asset."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Example: Single Paperback or Multiple Issues or version 2.0 or higher."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def virtualLocation
  "Virtual IT Communication Location"
  {:db/ident :odrl/virtualLocation,
   :rdf/type #{:odrl/LeftOperand :owl/NamedIndividual :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Virtual IT Communication Location"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An identified location of the IT communication space which is relevant for exercising the action of the Rule."},
   :skos/note {:rdf/language "en",
               :rdf/value "Example: an Internet domain or IP address range."},
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "Non-Normative"}})

(def watermark
  "Watermark"
  {:db/ident         :odrl/watermark,
   :odrl/includedIn  :odrl/use,
   :rdf/type         #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Watermark"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "To apply a watermark to the Asset."},
   :skos/scopeNote   {:rdf/language "en",
                      :rdf/value    "Non-Normative"}})

(def write
  "Write"
  {:db/ident         :odrl/write,
   :owl/deprecated   true,
   :rdf/type         #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Write"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "The act of writing to the Asset."},
   :skos/exactMatch  :odrl/modify})

(def writeTo
  "Write to"
  {:db/ident         :odrl/writeTo,
   :owl/deprecated   true,
   :rdf/type         #{:odrl/Action :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Write to"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value    "The act of adding data to the Asset."},
   :skos/exactMatch  :odrl/modify})

(def xone
  "Only One"
  {:db/ident :odrl/xone,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :skos/Concept},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/odrl/2/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Only One"},
   :rdfs/subPropertyOf :odrl/operand,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The relation is satisfied when only one, and not more, of the Constaints is satisfied"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This property MUST only be used for Logical Constraints, and the list of operand values MUST be Constraint instances."}})