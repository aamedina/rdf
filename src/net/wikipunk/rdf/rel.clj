(ns net.wikipunk.rdf.rel
  "http://purl.org/vocab/relationship/"
  {:dc11/creator ["http://iandavis.com/id/me"
                  {:foaf/name "Eric Vitiello Jr",
                   :rdf/type  :foaf/Person}],
   :dc11/description "A vocabulary for describing relationships between people",
   :dc11/identifier "http://purl.org/vocab/relationship/rel-vocab-20050810",
   :dc11/title
   "RELATIONSHIP: A vocabulary for describing relationships between people",
   :dcat/downloadURL "https://vocab.org/relationship/rel-vocab-20100607.rdf",
   :dcterms/isVersionOf "http://purl.org/vocab/relationship/",
   :dcterms/issued "2004-02-11",
   :dcterms/replaces :rel/rel-vocab-20090515,
   :ov/discussionList "http://lists.foaf-project.org/mailman/listinfo/foaf-dev",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "ov"      "http://open.vocab.org/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "rel"     "http://purl.org/vocab/relationship/",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "vann"    "http://purl.org/vocab/vann/",
                       "wot"     "http://xmlns.com/wot/0.1/"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://purl.org/vocab/relationship/",
   :rdfa/prefix "rel",
   :rdfa/uri "http://purl.org/vocab/relationship/",
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2005-08-10",
     :rdf/value    "Added isDefinedBy properties and updated documentation"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-04-19",
     :rdf/value
     "Inlined the examples that had been orphaned by publishing software changes"}],
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2009-05-15",
     :rdf/value    "Typed vocabulary as owl:Ontology"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2010-02-09",
     :rdf/value    "Asserted that foaf:knows is rdfs:subPropertyOf rel:knowsOf"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Incorporated changes suggested by Henry Story on foaf-dev list"}],
   :vann/example ["http://purl.org/vocab/relationship/examples/1"
                  "http://purl.org/vocab/relationship/examples/2"],
   :vann/preferredNamespacePrefix "rel",
   :vann/preferredNamespaceUri "http://purl.org/vocab/relationship"})

(def Relationship
  "A particular type of connection existing between people related to or having dealings with each other."
  {:db/ident :rel/Relationship,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A particular type of connection existing between people related to or having dealings with each other."}})

(def acquaintanceOf
  "A person having more than slight or superficial knowledge of this person but short of friendship."
  {:db/ident :rel/acquaintanceOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Acquaintance Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person having more than slight or superficial knowledge of this person but short of friendship."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def ambivalentOf
  "A person towards whom this person has mixed feelings or emotions."
  {:db/ident :rel/ambivalentOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ambivalent Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person towards whom this person has mixed feelings or emotions."},
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to be ambivalent of another without that person knowing the first."}]})

(def ancestorOf
  "A person who is a descendant of this person."
  {:db/ident :rel/ancestorOf,
   :owl/inverseOf :rel/descendantOf,
   :rdf/type :owl/TransitiveProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ancestor Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition {:rdf/language "en",
                     :rdf/value "A person who is a descendant of this person."},
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Removed assertion that this property is a sub-property of foaf:knows. foaf:knows requires a reciprocation that may not be possible for distant ancestors."}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}]})

(def antagonistOf
  "A person who opposes and contends against this person."
  {:db/ident :rel/antagonistOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Antagonist Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who opposes and contends against this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def apprenticeTo
  "A person to whom this person serves as a trusted counselor or teacher."
  {:db/ident :rel/apprenticeTo,
   :owl/inverseOf :rel/mentorOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Apprentice To"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person to whom this person serves as a trusted counselor or teacher."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def childOf
  "A person who was given birth to or nurtured and raised by this person."
  {:db/ident :rel/childOf,
   :owl/inverseOf :rel/parentOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Child Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who was given birth to or nurtured and raised by this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def closeFriendOf
  "A person who shares a close mutual friendship with this person."
  {:db/ident :rel/closeFriendOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Close Friend Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who shares a close mutual friendship with this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def collaboratesWith
  "A person who works towards a common goal with this person."
  {:db/ident :rel/collaboratesWith,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collaborates With"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A person who works towards a common goal with this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def colleagueOf
  "A person who is a member of the same profession as this person."
  {:db/ident :rel/colleagueOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Colleague Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who is a member of the same profession as this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def descendantOf
  "A person from whom this person is descended."
  {:db/ident :rel/descendantOf,
   :owl/inverseOf :rel/ancestorOf,
   :rdf/type :owl/TransitiveProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Descendant Of"}
                "Descendant Of"],
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition {:rdf/language "en",
                     :rdf/value "A person from whom this person is descended."},
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Removed assertion that this property is a sub-property of foaf:knows. foaf:knows requires a reciprocation that may not be possible for distant descendants."}]})

(def employedBy
  "A person for whom this person's services have been engaged."
  {:db/ident :rel/employedBy,
   :owl/inverseOf :rel/employerOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Employed By"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A person for whom this person's services have been engaged."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def employerOf
  "A person who engages the services of this person."
  {:db/ident :rel/employerOf,
   :owl/inverseOf :rel/employedBy,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Employer Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who engages the services of this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def enemyOf
  "A person towards whom this person feels hatred, intends injury to, or opposes the interests of."
  {:db/ident :rel/enemyOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Enemy Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person towards whom this person feels hatred, intends injury to, or opposes the interests of."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def engagedTo
  "A person to whom this person is betrothed."
  {:db/ident :rel/engagedTo,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Engaged To"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition {:rdf/language "en",
                     :rdf/value "A person to whom this person is betrothed."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def friendOf
  "A person who shares mutual friendship with this person."
  {:db/ident :rel/friendOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Friend Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who shares mutual friendship with this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def grandchildOf
  "A person who is a child of any of this person's children."
  {:db/ident :rel/grandchildOf,
   :owl/inverseOf :rel/grandparentOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label ["Grandchild Of"
                {:rdf/language "en",
                 :rdf/value    "Grandchild Of"}],
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A person who is a child of any of this person's children."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def grandparentOf
  "A person who is the parent of any of this person's parents."
  {:db/ident :rel/grandparentOf,
   :owl/inverseOf :rel/grandchildOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Grandparent Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A person who is the parent of any of this person's parents."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def hasMet
  "A person who has met this person whether in passing or longer."
  {:db/ident :rel/hasMet,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Met"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who has met this person whether in passing or longer."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def influencedBy
  "a person who has influenced this person."
  {:db/ident :rel/influencedBy,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Influenced By"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "a person who has influenced this person."},
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to be influenced by another by reputation without that person knowing the first."}]})

(def knowsByReputation
  "A person known by this person primarily for a particular action, position or field of endeavour."
  {:db/ident :rel/knowsByReputation,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Knows By Reputation"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person known by this person primarily for a particular action, position or field of endeavour."},
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to know of another by reputation without that person knowing the first."}]})

(def knowsInPassing
  "A person whom this person has slight or superficial knowledge of."
  {:db/ident :rel/knowsInPassing,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Knows In Passing"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person whom this person has slight or superficial knowledge of."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def knowsOf
  "A person who has come to be known to this person through their actions or position."
  {:db/ident :rel/knowsOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Knows Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who has come to be known to this person through their actions or position."},
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to know of another without that person knowing the first."}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2010-02-09",
     :rdf/value    "Assert that foaf:knows is rdfs:subPropertyOf rel:knowsOf"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}]})

(def lifePartnerOf
  "A person who has made a long-term commitment to this person's."
  {:db/ident :rel/lifePartnerOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Life Partner of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who has made a long-term commitment to this person's."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def livesWith
  "A person who shares a residence with this person."
  {:db/ident :rel/livesWith,
   :rdf/type [:owl/TransitiveProperty :owl/SymmetricProperty],
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lives With"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who shares a residence with this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def lostContactWith
  "A person who was once known by this person but has subsequently become uncontactable."
  {:db/ident :rel/lostContactWith,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lost Contact With"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who was once known by this person but has subsequently become uncontactable."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def mentorOf
  "A person who serves as a trusted counselor or teacher to this person."
  {:db/ident :rel/mentorOf,
   :owl/inverseOf :rel/apprenticeTo,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mentor Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who serves as a trusted counselor or teacher to this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def neighborOf
  "A person who lives in the same locality as this person."
  {:db/ident :rel/neighborOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Neighbor Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who lives in the same locality as this person."},
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2010-02-09",
     :rdf/value    "Removed assertion that this property is transitive."}]})

(def parentOf
  "A person who has given birth to or nurtured and raised this person."
  {:db/ident :rel/parentOf,
   :owl/inverseOf :rel/childOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Parent Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who has given birth to or nurtured and raised this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def participant
  "Participant"
  {:db/ident :rel/participant,
   :rdf/type :rdf/Property,
   :rdfs/domain :rel/Relationship,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Participant"},
   :rdfs/range :foaf/Person,
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Removed assertion that this property is a sub-property of foaf:knows."}})

(def participantIn
  "Participant In"
  {:db/ident :rel/participantIn,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Participant In"},
   :rdfs/range :rel/Relationship,
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Removed assertion that this property is a sub-property of foaf:knows."}})

(def siblingOf
  "A person having one or both parents in common with this person."
  {:db/ident :rel/siblingOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sibling Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person having one or both parents in common with this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def spouseOf
  "A person who is married to this person"
  {:db/ident :rel/spouseOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Spouse Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :foaf/knows],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A person who is married to this person"},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def worksWith
  "A person who works for the same employer as this person."
  {:db/ident :rel/worksWith,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Works With"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:foaf/knows :owl/differentFrom],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A person who works for the same employer as this person."},
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2010-02-09",
     :rdf/value    "Removed assertion that this property is transitive."}]})

(def wouldLikeToKnow
  "A person whom this person would desire to know more closely."
  {:db/ident :rel/wouldLikeToKnow,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/relationship/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Would Like To Know"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A person whom this person would desire to know more closely."},
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-02-09",
     :rdf/value
     "Removed assertion that this property is a sub-property of foaf:knows which would imply that the two people already know one another."}]})
