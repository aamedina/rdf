(ns net.wikipunk.rdf.rel
  ^{:base       "http://purl.org/vocab/relationship/",
    :namespaces {"dc11"    "http://purl.org/dc/elements/1.1/",
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
    :prefix     "rel",
    :source     "https://vocab.org/relationship/rel-vocab-20100607.rdf"}
  {:dc11/creator #{{:foaf/name "Eric Vitiello Jr",
                    :rdf/type  :foaf/Person}
                   {:xsd/anyURI "http://iandavis.com/id/me"}},
   :dc11/description "A vocabulary for describing relationships between people",
   :dc11/identifier "http://purl.org/vocab/relationship/rel-vocab-20050810",
   :dc11/title
   "RELATIONSHIP: A vocabulary for describing relationships between people",
   :dcterms/issued "2004-02-11",
   :dcterms/replaces :rel/rel-vocab-20090515,
   :ov/discussionList
   {:xsd/anyURI "http://lists.foaf-project.org/mailman/listinfo/foaf-dev"},
   :rdf/type :owl/Ontology,
   :skos/changeNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date    "2005-08-10",
      :rdf/value    "Added isDefinedBy properties and updated documentation"}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-04-19",
      :rdf/value
      "Inlined the examples that had been orphaned by publishing software changes"}},
   :skos/historyNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Incorporated changes suggested by Henry Story on foaf-dev list"}
     {:dc11/creator "Ian Davis",
      :dc11/date    "2009-05-15",
      :rdf/value    "Typed vocabulary as owl:Ontology"}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value "Asserted that foaf:knows is rdfs:subPropertyOf rel:knowsOf"}},
   :vann/example #{{:xsd/anyURI "http://purl.org/vocab/relationship/examples/2"}
                   {:xsd/anyURI
                    "http://purl.org/vocab/relationship/examples/1"}},
   :vann/preferredNamespacePrefix "rel",
   :vann/preferredNamespaceUri "http://purl.org/vocab/relationship",
   :xsd/anyURI "http://purl.org/vocab/relationship/"})

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

(def urn:uuid:6a60ce50-fac7-51e2-a21e-6b4cb7d75a65
  {:rdfs/label "FOAF-DEV mailing list",
   :xsd/anyURI "http://lists.foaf-project.org/mailman/listinfo/foaf-dev"})

(def urn:uuid:1c0518bf-db8a-5fb3-992f-4b1a72de2f68
  {:rdf/type :ov/SchemaExample,
   :rdfs/comment
   "<p>The RELATIONSHIP vocabulary can be used without modification with <a href=\"http://xmlns.com/foaf/0.1/\">FOAF</a> documents. Simply replace <code>foaf:knows</code> properties with a more specific property from this vocabulary. For backwards compatibility with older, non-RDF aware,  tools, you may want to keep the <code>foaf:knows</code> property as well.</p>     <pre>\n<code class=\"xml\">\n&lt;rdf:RDF\n      xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n      xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n      xmlns:foaf=\"http://xmlns.com/foaf/0.1/\"\n      xmlns:rel=\"http://purl.org/vocab/relationship/\"\n      &gt;\n\n  &lt;foaf:Person rdf:nodeID=\"ian\"&gt;\n    &lt;foaf:name&gt;Ian Davis&lt;/foaf:name&gt;\n    &lt;foaf:title&gt;Mr&lt;/foaf:title&gt;\n    &lt;foaf:firstName&gt;Ian&lt;/foaf:firstName&gt;\n    &lt;foaf:surname&gt;Davis&lt;/foaf:surname&gt;\n\n    &lt;rel:hasMet&gt;\n      &lt;foaf:Person&gt;\n        &lt;foaf:name&gt;William Tell&lt;/foaf:name&gt;\n      &lt;/foaf:Person&gt;\n    &lt;/rel:hasMet&gt;\n\n    &lt;rel:collaboratesWith rdf:nodeID=\"eric\"/&gt;\n  &lt;/foaf:Person&gt;\n\n  &lt;foaf:Person rdf:nodeID=\"eric\"&gt;\n    &lt;foaf:nick&gt;pixel&lt;/foaf:nick&gt;\n  &lt;/foaf:Person&gt;\n\n\n\n&lt;/rdf:RDF&gt;\n</code>\n    </pre>\n",
   :rdfs/label "Using With FOAF",
   :xsd/anyURI "http://purl.org/vocab/relationship/examples/1"})

(def urn:uuid:911abe2b-b082-51b0-812e-49bd161f1514
  {:dc11/creator #{{:foaf/name "Eric Vitiello Jr",
                    :rdf/type  :foaf/Person}
                   {:xsd/anyURI "http://iandavis.com/id/me"}},
   :dc11/description "A vocabulary for describing relationships between people",
   :dc11/identifier "http://purl.org/vocab/relationship/rel-vocab-20050810",
   :dc11/title
   "RELATIONSHIP: A vocabulary for describing relationships between people",
   :dcterms/issued "2004-02-11",
   :dcterms/replaces :rel/rel-vocab-20090515,
   :ov/discussionList
   {:xsd/anyURI "http://lists.foaf-project.org/mailman/listinfo/foaf-dev"},
   :rdf/type :owl/Ontology,
   :skos/changeNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date    "2005-08-10",
      :rdf/value    "Added isDefinedBy properties and updated documentation"}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-04-19",
      :rdf/value
      "Inlined the examples that had been orphaned by publishing software changes"}},
   :skos/historyNote
   #{{:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value
      "Incorporated changes suggested by Henry Story on foaf-dev list"}
     {:dc11/creator "Ian Davis",
      :dc11/date    "2009-05-15",
      :rdf/value    "Typed vocabulary as owl:Ontology"}
     {:dc11/creator "Ian Davis",
      :dc11/date "2010-02-09",
      :rdf/value "Asserted that foaf:knows is rdfs:subPropertyOf rel:knowsOf"}},
   :vann/example #{{:xsd/anyURI "http://purl.org/vocab/relationship/examples/2"}
                   {:xsd/anyURI
                    "http://purl.org/vocab/relationship/examples/1"}},
   :vann/preferredNamespacePrefix "rel",
   :vann/preferredNamespaceUri "http://purl.org/vocab/relationship",
   :xsd/anyURI "http://purl.org/vocab/relationship/"})

(def urn:uuid:4eb14714-4e98-5f44-a05e-96d598935f5a
  {:rdf/type :ov/SchemaExample,
   :rdfs/comment
   "    <p>\n\n      The relationship vocabulary can be used to describe relationships with the people linked from a web page. This is particularly useful for blogrolls or contact lists but can be used with any type of link. The HTML <code>a</code> element provides two attributes, <a href=\"http://www.w3.org/TR/html401/struct/links.html#adef-rel\">rel and rev</a>, that can be used to specify the relationship. Both <code>rel</code> and <code>rev</code> take a space separated list of keywords as their value. To use a term from the relationship vocabulary just drop the <code>http://purl.org/vocab/relationship/</code> namespace to leave the property name, e.g. <code>http://purl.org/vocab/relationship/worksWith</code> would become <code>worksWith</code> which can be added as the value of <code>rel</code> or <code>rev</code>.\n    </p>\n    <dl>\n      <dt>\n        <code>rel</code>\n      </dt>\n      <dd>\n        <p>\n          The <code>rel</code> attribute specifies a relationship that the author of the <em>linked</em> page has with the author of the <em>linking</em> page.\n          For example:\n        </p>\n        <pre><code><span class=\"elem\">&lt;a</span><span class=\"attr\">href</span>=\"<span class=\"attrVal\">http://example.com/boats</span>\" <span class=\"attr highlight\">rel</span>=\"<span class=\"attrVal\">childOf</span>\"<span class=\"elem\">&gt;</span><span class=\"text\">The boat we restored</span><span class=\"elem\">\"&lt;/a&gt;</span></code></pre>\n        <p>This link states that the author of <code>http://example.com/boats</code> is a child of the author of the html above. </p>\n      </dd>\n      <dt>\n        <code>rev</code>\n      </dt>\n      <dd>\n        <p>\n          The <code>rev</code> attribute specifies a relationship that the author of the <em>linking</em> page has with the author of the   <em>linked</em> page. The example here is:\n        </p>\n        <pre><code><span class=\"elem\">&lt;a</span><span class=\"attr\">href</span>=\"<span class=\"attrVal\">http://example.com/boats</span>\" <span class=\"attr highlight\">rev</span>=\"<span class=\"attrVal\">childOf</span>\"<span class=\"elem\">&gt;</span><span class=\"text\">The boat we restored</span><span class=\"elem\">\"&lt;/a&gt;</span></code></pre>\n        <p>In this case the meaning of the link is reversed: the author of the html above is a child of the author of <code>http://example.com/boats</code>.</p>\n      </dd>\n    </dl>\n    <p>The HTML and XHTML recommendations require an HTML document to declare a custom profile if it uses any non-standard <code>rel</code> or <code>rev</code> types. This is done by adding a <code>profile</code> attribute with a value of <code>http://purl.org/vocab/relationship/</code> to the document's <code>head</code> element. </p>\n    <pre><code>  &lt;head profile=\"http://purl.org/vocab/relationship/\"&gt;\n    &lt;title&gt;People I Know&lt;/title&gt;\n  &lt;/head&gt;</code></pre>\n    <h3>Complete Example</h3>\n    <pre><code>  &lt;html profile=\"http://purl.org/vocab/relationship/\"&gt;\n    &lt;head&gt;\n      &lt;title&gt;People I Know&lt;/title&gt;\n    &lt;/head&gt;\n    &lt;body&gt;\n      &lt;p&gt;Here are the people I know:&lt;/p&gt;\n        &lt;ul&gt;\n          &lt;li&gt;&lt;a href=\"http://example.com/~freddy\" rel=\"closeFriendOf\"&gt;Freddy (he's cool!)&lt;/a&gt;&lt;/li&gt;\n          &lt;li&gt;&lt;a href=\"http://frooble.com/\" rel=\"mentorOf\"&gt;Jimbo&lt;/a&gt;&lt;/li&gt;\n          &lt;li&gt;&lt;a href=\"http://mmmm.com/klm\" rel=\"friendOf\"&gt;Katie&lt;/a&gt;&lt;/li&gt;\n          &lt;li&gt;&lt;a href=\"http://example.com/~omah\" rel=\"worksWith\"&gt;Omah (does the coding)&lt;/a&gt;&lt;/li&gt;\n          &lt;li&gt;&lt;a href=\"http://example.com/~jason\" rev=\"closeFriendOf employedBy\"&gt;Jason, my henchman&lt;/a&gt;&lt;/li&gt;\n        &lt;/ul&gt;\n      &lt;/body&gt;\n    &lt;/html&gt;\n</code></pre>\n    <h3>RDF Interpretation</h3>\n    <p>Custom parsers that extract RDF from (X)HTML can use the relationships expressed in the links to infer the\n  equivilent RDF triples. It should be remembered that the relationship is between the authors of the pages not between\n  the pages themselves. Given the following link on a document at <code>http://example.com/mypage.html</code>:\n  </p>\n    <pre><code><span class=\"elem\">&lt;a</span><span class=\"attr\">href</span>=\"<span class=\"attrVal\">http://example.com/boats</span>\" <span class=\"attr highlight\">rel</span>=\"<span class=\"attrVal\">childOf</span>\"<span class=\"elem\">&gt;</span><span class=\"text\">The boat we restored</span><span class=\"elem\">\"&lt;/a&gt;</span></code></pre>\n    <p>a suggested RDF extraction is:</p>\n    <pre><code>  &lt;foaf:Person&gt;\n    &lt;foaf:maker rdf:resource=\"http://example.com/boats\"/&gt;\n    &lt;rel:childOf&gt;\n      &lt;foaf:Person&gt;\n        &lt;foaf:maker rdf:resource=\"http://example.com/mypage.html\"/&gt;\n      &lt;/foaf:Person&gt;\n    &lt;/rel:childOf&gt;\n  &lt;/foaf:Person&gt;</code></pre>\n",
   :rdfs/label "Using With HTML and XHTML",
   :xsd/anyURI "http://purl.org/vocab/relationship/examples/2"})

(def urn:uuid:af127918-c803-5fba-98c2-af1e164a64b6
  {:foaf/name  "Ian Davis",
   :rdf/type   :foaf/Person,
   :xsd/anyURI "http://iandavis.com/id/me"})