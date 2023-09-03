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
  {:db/ident :rel/Relationship,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A particular type of connection existing between people related to or having dealings with each other."}})

(def acquaintanceOf
  {:db/ident :rel/acquaintanceOf,
   :owl/equivalentClass
   {:xsd/anyURI "http://www.perceive.net/schemas/relationship/acquaintanceOf"},
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Acquaintance Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/ambivalentOf,
   :owl/equivalentClass
   {:xsd/anyURI "http://www.perceive.net/schemas/relationship/ambivalentOf"},
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ambivalent Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person towards whom this person has mixed feelings or emotions."},
   :skos/historyNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to be ambivalent of another without that person knowing the first."}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def ancestorOf
  {:db/ident :rel/ancestorOf,
   :owl/inverseOf :rel/descendantOf,
   :rdf/type :owl/TransitiveProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ancestor Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition {:rdf/language "en",
                     :rdf/value "A person who is a descendant of this person."},
   :skos/historyNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Removed assertion that this property is a sub-property of foaf:knows. foaf:knows requires a reciprocation that may not be possible for distant ancestors."}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def antagonistOf
  {:db/ident :rel/antagonistOf,
   :owl/equivalentClass
   {:xsd/anyURI "http://www.perceive.net/schemas/relationship/antagonistOf"},
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Antagonist Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who opposes and contends against this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def apprenticeTo
  {:db/ident :rel/apprenticeTo,
   :owl/inverseOf :rel/mentorOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Apprentice To"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/childOf,
   :owl/equivalentClass
   {:xsd/anyURI "http://www.perceive.net/schemas/relationship/childOf"},
   :owl/inverseOf :rel/parentOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Child Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/closeFriendOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Close Friend Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/collaboratesWith,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collaborates With"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A person who works towards a common goal with this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def colleagueOf
  {:db/ident :rel/colleagueOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Colleague Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/descendantOf,
   :owl/inverseOf :rel/ancestorOf,
   :rdf/type :owl/TransitiveProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label #{"Descendant Of"
                 {:rdf/language "en",
                  :rdf/value    "Descendant Of"}},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition {:rdf/language "en",
                     :rdf/value "A person from whom this person is descended."},
   :skos/historyNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Removed assertion that this property is a sub-property of foaf:knows. foaf:knows requires a reciprocation that may not be possible for distant descendants."}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def employedBy
  {:db/ident :rel/employedBy,
   :owl/inverseOf :rel/employerOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Employed By"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A person for whom this person's services have been engaged."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def employerOf
  {:db/ident :rel/employerOf,
   :owl/inverseOf :rel/employedBy,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Employer Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who engages the services of this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def enemyOf
  {:db/ident :rel/enemyOf,
   :owl/equivalentClass
   {:xsd/anyURI "http://www.perceive.net/schemas/relationship/enemyOf"},
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Enemy Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/engagedTo,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Engaged To"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition {:rdf/language "en",
                     :rdf/value "A person to whom this person is betrothed."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def friendOf
  {:db/ident :rel/friendOf,
   :owl/equivalentClass
   {:xsd/anyURI "http://www.perceive.net/schemas/relationship/friendOf"},
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Friend Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who shares mutual friendship with this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def grandchildOf
  {:db/ident :rel/grandchildOf,
   :owl/equivalentClass
   {:xsd/anyURI "http://www.perceive.net/schemas/relationship/grandchildOf"},
   :owl/inverseOf :rel/grandparentOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label #{"Grandchild Of"
                 {:rdf/language "en",
                  :rdf/value    "Grandchild Of"}},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A person who is a child of any of this person's children."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def grandparentOf
  {:db/ident :rel/grandparentOf,
   :owl/inverseOf :rel/grandchildOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Grandparent Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A person who is the parent of any of this person's parents."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def hasMet
  {:db/ident :rel/hasMet,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has Met"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/influencedBy,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Influenced By"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "a person who has influenced this person."},
   :skos/historyNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to be influenced by another by reputation without that person knowing the first."}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def knowsByReputation
  {:db/ident :rel/knowsByReputation,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Knows By Reputation"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person known by this person primarily for a particular action, position or field of endeavour."},
   :skos/historyNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to know of another by reputation without that person knowing the first."}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def knowsInPassing
  {:db/ident :rel/knowsInPassing,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Knows In Passing"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/knowsOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Knows Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A person who has come to be known to this person through their actions or position."},
   :skos/historyNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date    "2010-02-09",
      :rdf/value    "Assert that foaf:knows is rdfs:subPropertyOf rel:knowsOf"}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Removed assertion that this property is a sub-property of foaf:knows due to reciprocity requirements. It is possible for one to know of another without that person knowing the first."}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def lifePartnerOf
  {:db/ident :rel/lifePartnerOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Life Partner of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/livesWith,
   :rdf/type #{:owl/SymmetricProperty :owl/TransitiveProperty},
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lives With"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who shares a residence with this person."},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def lostContactWith
  {:db/ident :rel/lostContactWith,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lost Contact With"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/mentorOf,
   :owl/inverseOf :rel/apprenticeTo,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mentor Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/neighborOf,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Neighbor Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A person who lives in the same locality as this person."},
   :skos/historyNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date    "2010-02-09",
      :rdf/value    "Removed assertion that this property is transitive."}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def parentOf
  {:db/ident :rel/parentOf,
   :owl/equivalentClass
   {:xsd/anyURI "http://www.perceive.net/schemas/relationship/parentOf"},
   :owl/inverseOf :rel/childOf,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Parent Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/participant,
   :rdf/type :rdf/Property,
   :rdfs/domain :rel/Relationship,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Participant"},
   :rdfs/range :foaf/Person,
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Removed assertion that this property is a sub-property of foaf:knows."}})

(def participantIn
  {:db/ident :rel/participantIn,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Participant In"},
   :rdfs/range :rel/Relationship,
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Removed assertion that this property is a sub-property of foaf:knows."}})

(def siblingOf
  {:db/ident :rel/siblingOf,
   :owl/equivalentClass
   {:xsd/anyURI "http://www.perceive.net/schemas/relationship/siblingOf"},
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sibling Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
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
  {:db/ident :rel/spouseOf,
   :owl/equivalentClass
   {:xsd/anyURI "http://www.perceive.net/schemas/relationship/spouseOf"},
   :rdf/type :owl/SymmetricProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Spouse Of"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A person who is married to this person"},
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-02-09",
    :rdf/value
    "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}})

(def worksWith
  {:db/ident :rel/worksWith,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Works With"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:owl/differentFrom :foaf/knows},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A person who works for the same employer as this person."},
   :skos/historyNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date    "2010-02-09",
      :rdf/value    "Removed assertion that this property is transitive."}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})

(def wouldLikeToKnow
  {:db/ident :rel/wouldLikeToKnow,
   :rdf/type :rdf/Property,
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/relationship/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Would Like To Know"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A person whom this person would desire to know more closely."},
   :skos/historyNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Removed assertion that this property is a sub-property of foaf:knows which would imply that the two people already know one another."}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Asserted that this property is a sub-property of owl:differentFrom, indicating that this is a relationship between different individuals"}}})