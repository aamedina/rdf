(ns net.wikipunk.rdf.rel
  {:dcat/downloadURL  "https://vocab.org/relationship/rel-vocab-20100607.rdf",
   :rdf/ns-prefix-map {"dc11"    "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "ov"      "http://open.vocab.org/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "rel"     "http://purl.org/vocab/relationship/",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "vann"    "http://purl.org/vocab/vann/",
                       "wot"     "http://xmlns.com/wot/0.1/"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "rel",
   :rdfa/uri          "http://purl.org/vocab/relationship/"})

(def Relationship
  "Relationship"
  {:db/ident :rel/Relationship,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Relationship@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "A particular type of connection existing between people related to or having dealings with each other.@en"})

(def acquaintanceOf
  "Acquaintance Of"
  {:db/ident :rel/acquaintanceOf,
   :owl/equivalentClass
   {:rdfa/uri "http://www.perceive.net/schemas/relationship/acquaintanceOf"},
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Acquaintance Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person having more than slight or superficial knowledge of this person but short of friendship.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def ambivalentOf
  "Ambivalent Of"
  {:db/ident :rel/ambivalentOf,
   :owl/equivalentClass
   {:rdfa/uri "http://www.perceive.net/schemas/relationship/ambivalentOf"},
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Ambivalent Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   #xsd/langString
    "A person towards whom this person has mixed feelings or emotions.@en",
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to be ambivalent of another without that person knowing the first."}}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}]})

(def ancestorOf
  "Ancestor Of"
  {:db/ident :rel/ancestorOf,
   :owl/inverseOf :rel/descendantOf,
   :rdf/type :owl/TransitiveProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Ancestor Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition #xsd/langString
                     "A person who is a descendant of this person.@en",
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Removed assertion that this property is a sub-property of foaf:knows. foaf:knows requires a reciprocation that may not be possible for distant ancestors."}}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}]})

(def antagonistOf
  "Antagonist Of"
  {:db/ident :rel/antagonistOf,
   :owl/equivalentClass
   {:rdfa/uri "http://www.perceive.net/schemas/relationship/antagonistOf"},
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Antagonist Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom :rel/knowsOf],
   :skos/definition
   #xsd/langString "A person who opposes and contends against this person.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def apprenticeTo
  "Apprentice To"
  {:db/ident :rel/apprenticeTo,
   :owl/inverseOf :rel/mentorOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Apprentice To@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person to whom this person serves as a trusted counselor or teacher.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def childOf
  "Child Of"
  {:db/ident :rel/childOf,
   :owl/equivalentClass
   {:rdfa/uri "http://www.perceive.net/schemas/relationship/childOf"},
   :owl/inverseOf :rel/parentOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Child Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who was given birth to or nurtured and raised by this person.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def closeFriendOf
  "Close Friend Of"
  {:db/ident :rel/closeFriendOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Close Friend Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who shares a close mutual friendship with this person.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def collaboratesWith
  "Collaborates With"
  {:db/ident :rel/collaboratesWith,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Collaborates With@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who works towards a common goal with this person.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def colleagueOf
  "Colleague Of"
  {:db/ident :rel/colleagueOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Colleague Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who is a member of the same profession as this person.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def descendantOf
  {:db/ident :rel/descendantOf,
   :owl/inverseOf :rel/ancestorOf,
   :rdf/type :owl/TransitiveProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label [#xsd/langString "Descendant Of@en" "Descendant Of"],
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition #xsd/langString
                     "A person from whom this person is descended.@en",
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Removed assertion that this property is a sub-property of foaf:knows. foaf:knows requires a reciprocation that may not be possible for distant descendants."}}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}]})

(def employedBy
  "Employed By"
  {:db/ident :rel/employedBy,
   :owl/inverseOf :rel/employerOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Employed By@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person for whom this person's services have been engaged.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def employerOf
  "Employer Of"
  {:db/ident :rel/employerOf,
   :owl/inverseOf :rel/employedBy,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Employer Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition #xsd/langString
                     "A person who engages the services of this person.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def enemyOf
  "Enemy Of"
  {:db/ident :rel/enemyOf,
   :owl/equivalentClass
   {:rdfa/uri "http://www.perceive.net/schemas/relationship/enemyOf"},
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Enemy Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person towards whom this person feels hatred, intends injury to, or opposes the interests of.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def engagedTo
  "Engaged To"
  {:db/ident :rel/engagedTo,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Engaged To@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition #xsd/langString
                     "A person to whom this person is betrothed.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def friendOf
  "Friend Of"
  {:db/ident :rel/friendOf,
   :owl/equivalentClass
   {:rdfa/uri "http://www.perceive.net/schemas/relationship/friendOf"},
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Friend Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString "A person who shares mutual friendship with this person.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def grandchildOf
  {:db/ident :rel/grandchildOf,
   :owl/equivalentClass
   {:rdfa/uri "http://www.perceive.net/schemas/relationship/grandchildOf"},
   :owl/inverseOf :rel/grandparentOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label ["Grandchild Of" #xsd/langString "Grandchild Of@en"],
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who is a child of any of this person's children.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def grandparentOf
  "Grandparent Of"
  {:db/ident :rel/grandparentOf,
   :owl/inverseOf :rel/grandchildOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Grandparent Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who is the parent of any of this person's parents.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def hasMet
  "Has Met"
  {:db/ident :rel/hasMet,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Has Met@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who has met this person whether in passing or longer.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def influencedBy
  "Influenced By"
  {:db/ident :rel/influencedBy,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Influenced By@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition #xsd/langString
                     "a person who has influenced this person.@en",
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to be influenced by another by reputation without that person knowing the first."}}]})

(def knowsByReputation
  "Knows By Reputation"
  {:db/ident :rel/knowsByReputation,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Knows By Reputation@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   #xsd/langString
    "A person known by this person primarily for a particular action, position or field of endeavour.@en",
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to know of another by reputation without that person knowing the first."}}]})

(def knowsInPassing
  "Knows In Passing"
  {:db/ident :rel/knowsInPassing,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Knows In Passing@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person whom this person has slight or superficial knowledge of.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def knowsOf
  "Knows Of"
  {:db/ident :rel/knowsOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Knows Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   #xsd/langString
    "A person who has come to be known to this person through their actions or position.@en",
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to know of another without that person knowing the first."}}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value {:xsd/string
                 "Assert that foaf:knows is rdfs:subPropertyOf rel:knowsOf"}}]})

(def lifePartnerOf
  "Life Partner of"
  {:db/ident :rel/lifePartnerOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Life Partner of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who has made a long-term commitment to this person's.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def livesWith
  "Lives With"
  {:db/ident :rel/livesWith,
   :rdf/type [:owl/TransitiveProperty :owl/SymmetricProperty],
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Lives With@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom :rel/knowsOf],
   :skos/definition #xsd/langString
                     "A person who shares a residence with this person.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def lostContactWith
  "Lost Contact With"
  {:db/ident :rel/lostContactWith,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Lost Contact With@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who was once known by this person but has subsequently become uncontactable.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def mentorOf
  "Mentor Of"
  {:db/ident :rel/mentorOf,
   :owl/inverseOf :rel/apprenticeTo,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Mentor Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who serves as a trusted counselor or teacher to this person.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def neighborOf
  "Neighbor Of"
  {:db/ident :rel/neighborOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Neighbor Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom :rel/knowsOf],
   :skos/definition
   #xsd/langString "A person who lives in the same locality as this person.@en",
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2010-02-09",
     :rdf/value    {:xsd/string
                    "Removed assertion that this property is transitive."}}]})

(def parentOf
  "Parent Of"
  {:db/ident :rel/parentOf,
   :owl/equivalentClass
   {:rdfa/uri "http://www.perceive.net/schemas/relationship/parentOf"},
   :owl/inverseOf :rel/childOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Parent Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who has given birth to or nurtured and raised this person.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def participant
  "Participant"
  {:db/ident :rel/participant,
   :rdf/type :rdf/Property,
   :rdfs/domain :rel/Relationship,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Participant@en",
   :rdfs/range :foaf/Person,
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Removed assertion that this property is a sub-property of foaf:knows."}}})

(def participantIn
  "Participant In"
  {:db/ident :rel/participantIn,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Participant In@en",
   :rdfs/range :rel/Relationship,
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Removed assertion that this property is a sub-property of foaf:knows."}}})

(def siblingOf
  "Sibling Of"
  {:db/ident :rel/siblingOf,
   :owl/equivalentClass
   {:rdfa/uri "http://www.perceive.net/schemas/relationship/siblingOf"},
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Sibling Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person having one or both parents in common with this person.@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def spouseOf
  "Spouse Of"
  {:db/ident :rel/spouseOf,
   :owl/equivalentClass
   {:rdfa/uri "http://www.perceive.net/schemas/relationship/spouseOf"},
   :rdf/type :owl/SymmetricProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Spouse Of@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows :rel/knowsOf],
   :skos/definition #xsd/langString "A person who is married to this person@en",
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    {:xsd/string
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def worksWith
  "Works With"
  {:db/ident :rel/worksWith,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Works With@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom :rel/knowsOf],
   :skos/definition
   #xsd/langString
    "A person who works for the same employer as this person.@en",
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2010-02-09",
     :rdf/value    {:xsd/string
                    "Removed assertion that this property is transitive."}}]})

(def wouldLikeToKnow
  "Would Like To Know"
  {:db/ident :rel/wouldLikeToKnow,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/relationship/"},
   :rdfs/label #xsd/langString "Would Like To Know@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   #xsd/langString
    "A person whom this person would desire to know more closely.@en",
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     {:xsd/string
      "Removed assertion that this property is a sub-property of foaf:knows which would imply that the two people already know one another."}}]})