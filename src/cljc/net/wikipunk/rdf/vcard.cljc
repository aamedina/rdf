(ns net.wikipunk.rdf.vcard
  "Ontology for vCard based on RFC6350"
  {:owl/versionInfo #rdf/langString "Final@en",
   :rdf/ns-prefix-map {"owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "vcard" "http://www.w3.org/2006/vcard/ns#",
                       "xml"   "http://www.w3.org/XML/1998/namespace",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "vcard",
   :rdfa/uri "http://www.w3.org/2006/vcard/ns",
   :rdfs/comment #rdf/langString "Ontology for vCard based on RFC6350@en",
   :rdfs/isDefinedBy
   {:rdfa/uri "http://www.w3.org/Submission/2010/SUBM-vcard-rdf-20100120/"},
   :rdfs/label #rdf/langString "Ontology for vCard@en"}
  (:refer-clojure :exclude [agent class fn key]))

(def Acquaintance
  "Acquaintance"
  {:db/ident         :vcard/Acquaintance,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Acquaintance@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Address
  "To specify the components of the delivery address for the  object"
  {:db/ident :vcard/Address,
   :owl/equivalentClass
   {:owl/unionOf
    [{:owl/intersectionOf [{:owl/onProperty     :vcard/country-name,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                            :owl/onProperty     :vcard/country-name,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/locality,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                            :owl/onProperty     :vcard/locality,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/postal-code,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                            :owl/onProperty     :vcard/postal-code,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/region,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                            :owl/onProperty     :vcard/region,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/street-address,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                            :owl/onProperty     :vcard/street-address,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}],
    :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "To specify the components of the delivery address for the  object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Address@en"})

(def Agent
  "Agent"
  {:db/ident         :vcard/Agent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Agent@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def BBS
  "This class is deprecated"
  {:db/ident         :vcard/BBS,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "BBS@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Car
  "This class is deprecated"
  {:db/ident         :vcard/Car,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Car@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Cell
  "Also called mobile telephone"
  {:db/ident         :vcard/Cell,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "Also called mobile telephone@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Cell@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Child
  "Child"
  {:db/ident         :vcard/Child,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Child@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Colleague
  "Colleague"
  {:db/ident         :vcard/Colleague,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Colleague@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Contact
  "Contact"
  {:db/ident         :vcard/Contact,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Contact@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Coresident
  "Coresident"
  {:db/ident         :vcard/Coresident,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Coresident@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Coworker
  "Coworker"
  {:db/ident         :vcard/Coworker,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Coworker@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Crush
  "Crush"
  {:db/ident         :vcard/Crush,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Crush@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Date
  "Date"
  {:db/ident         :vcard/Date,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Date@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Dom
  "This class is deprecated"
  {:db/ident         :vcard/Dom,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Dom@en",
   :rdfs/subClassOf  :vcard/Type})

(def Email
  "To specify the electronic mail address for communication with the object the vCard represents. Use the hasEmail object property."
  {:db/ident :vcard/Email,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "To specify the electronic mail address for communication with the object the vCard represents. Use the hasEmail object property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Email@en"})

(def Emergency
  "Emergency"
  {:db/ident         :vcard/Emergency,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Emergency@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Fax
  "Fax"
  {:db/ident         :vcard/Fax,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Fax@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Female
  "Female"
  {:db/ident         :vcard/Female,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Female@en",
   :rdfs/subClassOf  :vcard/Gender})

(def Friend
  "Friend"
  {:db/ident         :vcard/Friend,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Friend@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Gender
  "Used for gender codes. The URI of the gender code must be used as the value for Gender."
  {:db/ident :vcard/Gender,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Used for gender codes. The URI of the gender code must be used as the value for Gender.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Gender@en"})

(def Group
  "Object representing a group of persons or entities.  A group object will usually contain hasMember properties to specify the members of the group."
  {:db/ident :vcard/Group,
   :owl/disjointWith [:vcard/Organization :vcard/Location :vcard/Individual],
   :owl/equivalentClass {:owl/intersectionOf [{:owl/onProperty :vcard/hasMember,
                                               :owl/someValuesFrom :vcard/Kind,
                                               :rdf/type :owl/Restriction}
                                              {:owl/minQualifiedCardinality
                                               #xsd/nonNegativeInteger 1,
                                               :owl/onClass :vcard/Kind,
                                               :owl/onProperty :vcard/hasMember,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Object representing a group of persons or entities.  A group object will usually contain hasMember properties to specify the members of the group.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Group@en",
   :rdfs/subClassOf :vcard/Kind})

(def Home
  "This implies that the property is related to an individual's personal life"
  {:db/ident :vcard/Home,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This implies that the property is related to an individual's personal life@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Home@en",
   :rdfs/subClassOf :vcard/Type})

(def ISDN
  "This class is deprecated"
  {:db/ident         :vcard/ISDN,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "ISDN@en",
   :rdfs/subClassOf  :vcard/Type})

(def Individual
  "An object representing a single person or entity"
  {:db/ident         :vcard/Individual,
   :owl/disjointWith [:vcard/Organization :vcard/Location],
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString
                      "An object representing a single person or entity@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Individual@en",
   :rdfs/subClassOf  :vcard/Kind})

(def Internet
  "This class is deprecated"
  {:db/ident         :vcard/Internet,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Internet@en",
   :rdfs/subClassOf  :vcard/Type})

(def Intl
  "This class is deprecated"
  {:db/ident         :vcard/Intl,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Intl@en",
   :rdfs/subClassOf  :vcard/Type})

(def Kin
  "Kin"
  {:db/ident         :vcard/Kin,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Kin@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Kind
  "The parent class for all objects"
  {:db/ident            :vcard/Kind,
   :owl/equivalentClass [:vcard/VCard
                         {:owl/minQualifiedCardinality #xsd/nonNegativeInteger
                                                        1,
                          :owl/onDataRange :xsd/string,
                          :owl/onProperty  :vcard/fn,
                          :rdf/type        :owl/Restriction}],
   :rdf/type            :owl/Class,
   :rdfs/comment        #rdf/langString "The parent class for all objects@en",
   :rdfs/isDefinedBy    {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label          #rdf/langString "Kind@en"})

(def Label
  "This class is deprecated"
  {:db/ident         :vcard/Label,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Label@en",
   :rdfs/subClassOf  :vcard/Type})

(def Location
  "An object representing a named geographical place"
  {:db/ident         :vcard/Location,
   :owl/disjointWith :vcard/Organization,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString
                      "An object representing a named geographical place@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Location@en",
   :rdfs/subClassOf  :vcard/Kind})

(def Male
  "Male"
  {:db/ident         :vcard/Male,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Male@en",
   :rdfs/subClassOf  :vcard/Gender})

(def Me
  "Me"
  {:db/ident         :vcard/Me,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Me@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Met
  "Met"
  {:db/ident         :vcard/Met,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Met@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Modem
  "This class is deprecated"
  {:db/ident         :vcard/Modem,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Modem@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Msg
  "This class is deprecated"
  {:db/ident         :vcard/Msg,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Msg@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Muse
  "Muse"
  {:db/ident         :vcard/Muse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Muse@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Name
  "To specify the components of the name of the object"
  {:db/ident :vcard/Name,
   :owl/equivalentClass
   {:owl/unionOf
    [{:owl/intersectionOf [{:owl/onProperty     :vcard/additional-name,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/minCardinality #xsd/nonNegativeInteger 0,
                            :owl/onProperty     :vcard/additional-name,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/family-name,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                            :owl/onProperty     :vcard/family-name,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/given-name,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                            :owl/onProperty     :vcard/given-name,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/honorific-prefix,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/minCardinality #xsd/nonNegativeInteger 0,
                            :owl/onProperty     :vcard/honorific-prefix,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/honorific-suffix,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/minCardinality #xsd/nonNegativeInteger 0,
                            :owl/onProperty     :vcard/honorific-suffix,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}],
    :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment #rdf/langString
                  "To specify the components of the name of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Name@en"})

(def Neighbor
  "Neighbor"
  {:db/ident         :vcard/Neighbor,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Neighbor@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def None
  "None"
  {:db/ident         :vcard/None,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "None@en",
   :rdfs/subClassOf  :vcard/Gender})

(def Organization
  "An object representing an organization.  An organization is a single entity, and might represent a business or government, a department or division within a business or government, a club, an association, or the like.\n"
  {:db/ident :vcard/Organization,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "An object representing an organization.  An organization is a single entity, and might represent a business or government, a department or division within a business or government, a club, an association, or the like.\n@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Organization@en",
   :rdfs/subClassOf :vcard/Kind})

(def Other
  "Other"
  {:db/ident         :vcard/Other,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Other@en",
   :rdfs/subClassOf  :vcard/Gender})

(def PCS
  "This class is deprecated"
  {:db/ident         :vcard/PCS,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "PCS@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Pager
  "Pager"
  {:db/ident         :vcard/Pager,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Pager@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Parcel
  "This class is deprecated"
  {:db/ident         :vcard/Parcel,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Parcel@en",
   :rdfs/subClassOf  :vcard/Type})

(def Parent
  "Parent"
  {:db/ident         :vcard/Parent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Parent@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Postal
  "This class is deprecated"
  {:db/ident         :vcard/Postal,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Postal@en",
   :rdfs/subClassOf  :vcard/Type})

(def Pref
  "This class is deprecated"
  {:db/ident         :vcard/Pref,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Pref@en",
   :rdfs/subClassOf  :vcard/Type})

(def RelatedType
  "Used for relation type codes. The URI of the relation type code must be used as the value for the Relation Type."
  {:db/ident :vcard/RelatedType,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Used for relation type codes. The URI of the relation type code must be used as the value for the Relation Type.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Relation Type@en"})

(def Sibling
  "Sibling"
  {:db/ident         :vcard/Sibling,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Sibling@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Spouse
  "Spouse"
  {:db/ident         :vcard/Spouse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Spouse@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Sweetheart
  "Sweetheart"
  {:db/ident         :vcard/Sweetheart,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Sweetheart@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Tel
  "This class is deprecated. Use the hasTelephone object property."
  {:db/ident :vcard/Tel,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This class is deprecated. Use the hasTelephone object property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Tel@en"})

(def TelephoneType
  "Used for telephone type codes. The URI of the telephone type code must be used as the value for the Telephone Type."
  {:db/ident :vcard/TelephoneType,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Used for telephone type codes. The URI of the telephone type code must be used as the value for the Telephone Type.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Phone@en"})

(def Text
  "Also called sms telephone"
  {:db/ident         :vcard/Text,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "Also called sms telephone@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Text@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def TextPhone
  "Text phone"
  {:db/ident         :vcard/TextPhone,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Text phone@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Type
  "Used for type codes. The URI of the type code must be used as the value for Type."
  {:db/ident :vcard/Type,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Used for type codes. The URI of the type code must be used as the value for Type.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Type@en"})

(def Unknown
  "Unknown"
  {:db/ident         :vcard/Unknown,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Unknown@en",
   :rdfs/subClassOf  :vcard/Gender})

(def VCard
  "The vCard class is  equivalent to the new Kind class, which is the parent for the four explicit types of vCards (Individual, Organization, Location, Group)"
  {:db/ident :vcard/VCard,
   :owl/equivalentClass :vcard/Kind,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "The vCard class is  equivalent to the new Kind class, which is the parent for the four explicit types of vCards (Individual, Organization, Location, Group)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "VCard@en"})

(def Video
  "Video"
  {:db/ident         :vcard/Video,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Video@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Voice
  "Voice"
  {:db/ident         :vcard/Voice,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "Voice@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Work
  "This implies that the property is related to an individual's work place"
  {:db/ident :vcard/Work,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "This implies that the property is related to an individual's work place@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "Work@en",
   :rdfs/subClassOf :vcard/Type})

(def X400
  "This class is deprecated"
  {:db/ident         :vcard/X400,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "X400@en",
   :rdfs/subClassOf  :vcard/Type})

(def additional-name
  "The additional name associated with the object"
  {:db/ident         :vcard/additional-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "The additional name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "additional name@en",
   :rdfs/range       :xsd/string})

(def adr
  "This object property has been mapped"
  {:db/ident         :vcard/adr,
   :owl/equivalentProperty :vcard/hasAddress,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "address@en"})

(def agent
  "This object property has been deprecated"
  {:db/ident         :vcard/agent,
   :owl/deprecated   true,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString
                      "This object property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "agent@en"})

(def anniversary
  "The date of marriage, or equivalent, of the object"
  {:db/ident         :vcard/anniversary,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "The date of marriage, or equivalent, of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "anniversary@en",
   :rdfs/range       {:owl/unionOf [:xsd/dateTime :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def bday
  "To specify the birth date of the object"
  {:db/ident         :vcard/bday,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "To specify the birth date of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "birth date@en",
   :rdfs/range       {:owl/unionOf [:xsd/dateTime
                                    :xsd/dateTimeStamp
                                    :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def category
  "The category information about the object, also known as tags"
  {:db/ident :vcard/category,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "The category information about the object, also known as tags@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "category@en",
   :rdfs/range :xsd/string})

(def class
  "This data property has been deprecated"
  {:db/ident         :vcard/class,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "This data property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "class@en"})

(def country-name
  "The country name associated with the address of the object"
  {:db/ident :vcard/country-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "The country name associated with the address of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "country name@en",
   :rdfs/range :xsd/string})

(def email
  "This object property has been mapped"
  {:db/ident         :vcard/email,
   :owl/equivalentProperty :vcard/hasEmail,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "email@en"})

(def extended-address
  "This data property has been deprecated"
  {:db/ident         :vcard/extended-address,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "This data property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "extended address@en"})

(def family-name
  "The family name associated with the object"
  {:db/ident         :vcard/family-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "The family name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "family name@en",
   :rdfs/range       :xsd/string})

(def fn
  "The formatted text corresponding to the name of the object"
  {:db/ident :vcard/fn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "The formatted text corresponding to the name of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "formatted name@en",
   :rdfs/range :xsd/string})

(def geo
  "This object property has been mapped"
  {:db/ident         :vcard/geo,
   :owl/equivalentProperty :vcard/hasGeo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "geo@en"})

(def given-name
  "The given name associated with the object"
  {:db/ident         :vcard/given-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "The given name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "given name@en",
   :rdfs/range       :xsd/string})

(def hasAdditionalName
  "Used to support property parameters for the additional name data property"
  {:db/ident :vcard/hasAdditionalName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the additional name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has additional name@en"})

(def hasAddress
  "To specify the components of the delivery address for the object"
  {:db/ident :vcard/hasAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the components of the delivery address for the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has address@en",
   :rdfs/range :vcard/Address})

(def hasCalendarBusy
  "To specify the busy time associated with the object. (Was called FBURL in RFC6350)"
  {:db/ident :vcard/hasCalendarBusy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the busy time associated with the object. (Was called FBURL in RFC6350)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has calendar busy@en"})

(def hasCalendarLink
  "To specify the calendar associated with the object. (Was called CALURI in RFC6350)"
  {:db/ident :vcard/hasCalendarLink,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the calendar associated with the object. (Was called CALURI in RFC6350)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has calendar link@en"})

(def hasCalendarRequest
  "To specify the calendar user address to which a scheduling request be sent for the object. (Was called CALADRURI in RFC6350)"
  {:db/ident :vcard/hasCalendarRequest,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the calendar user address to which a scheduling request be sent for the object. (Was called CALADRURI in RFC6350)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has calendar request@en"})

(def hasCategory
  "Used to support property parameters for the category data property"
  {:db/ident :vcard/hasCategory,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the category data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has category@en"})

(def hasCountryName
  "Used to support property parameters for the country name data property"
  {:db/ident :vcard/hasCountryName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the country name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has country name@en"})

(def hasEmail
  "To specify the electronic mail address for communication with the object"
  {:db/ident :vcard/hasEmail,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the electronic mail address for communication with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has email@en",
   :rdfs/range :vcard/Email})

(def hasFN
  "Used to support property parameters for the formatted name data property"
  {:db/ident :vcard/hasFN,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the formatted name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has formatted name@en"})

(def hasFamilyName
  "Used to support property parameters for the family name data property"
  {:db/ident :vcard/hasFamilyName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the family name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has family name@en"})

(def hasGender
  "To specify  the sex or gender identity of the object. URIs are recommended to enable interoperable sex and gender codes to be used."
  {:db/ident :vcard/hasGender,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify  the sex or gender identity of the object. URIs are recommended to enable interoperable sex and gender codes to be used.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has gender@en"})

(def hasGeo
  "To specify information related to the global positioning of the object. May also be used as a property parameter."
  {:db/ident :vcard/hasGeo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify information related to the global positioning of the object. May also be used as a property parameter.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has geo@en"})

(def hasGivenName
  "Used to support property parameters for the given name data property"
  {:db/ident :vcard/hasGivenName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the given name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has given name@en"})

(def hasHonorificPrefix
  "Used to support property parameters for the honorific prefix data property"
  {:db/ident :vcard/hasHonorificPrefix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the honorific prefix data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has honorific prefix@en"})

(def hasHonorificSuffix
  "Used to support property parameters for the honorific suffix data property"
  {:db/ident :vcard/hasHonorificSuffix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the honorific suffix data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has honorific suffix@en"})

(def hasInstantMessage
  "To specify the instant messaging and presence protocol communications with the object. (Was called IMPP in RFC6350)"
  {:db/ident :vcard/hasInstantMessage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the instant messaging and presence protocol communications with the object. (Was called IMPP in RFC6350)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has messaging@en"})

(def hasKey
  "To specify a public key or authentication certificate associated with the object"
  {:db/ident :vcard/hasKey,
   :owl/equivalentProperty :vcard/key,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify a public key or authentication certificate associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has key@en"})

(def hasLanguage
  "Used to support property parameters for the language data property"
  {:db/ident :vcard/hasLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the language data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has language@en"})

(def hasLocality
  "Used to support property parameters for the locality data property"
  {:db/ident :vcard/hasLocality,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the locality data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has locality@en"})

(def hasLogo
  "To specify a graphic image of a logo associated with the object "
  {:db/ident :vcard/hasLogo,
   :owl/equivalentProperty :vcard/logo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify a graphic image of a logo associated with the object @en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has logo@en"})

(def hasMember
  "To include a member in the group this object represents. (This property can only be used by Group individuals)"
  {:db/ident :vcard/hasMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To include a member in the group this object represents. (This property can only be used by Group individuals)@en",
   :rdfs/domain :vcard/Group,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has member@en",
   :rdfs/range :vcard/Kind})

(def hasName
  "To specify the components of the name of the object"
  {:db/ident         :vcard/hasName,
   :owl/equivalentProperty :vcard/n,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString
                      "To specify the components of the name of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "has name@en",
   :rdfs/range       :vcard/Name})

(def hasNickname
  "Used to support property parameters for the nickname data property"
  {:db/ident :vcard/hasNickname,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the nickname data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has nickname@en",
   :rdfs/seeAlso :vcard/nickname})

(def hasNote
  "Used to support property parameters for the note data property"
  {:db/ident :vcard/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the note data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has note@en"})

(def hasOrganizationName
  "Used to support property parameters for the organization name data property"
  {:db/ident :vcard/hasOrganizationName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the organization name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has organization name@en"})

(def hasOrganizationUnit
  "Used to support property parameters for the organization unit name data property"
  {:db/ident :vcard/hasOrganizationUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the organization unit name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has organization unit name@en"})

(def hasPhoto
  "To specify an image or photograph information that annotates some aspect of the object"
  {:db/ident :vcard/hasPhoto,
   :owl/equivalentProperty :vcard/photo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify an image or photograph information that annotates some aspect of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has photo@en"})

(def hasPostalCode
  "Used to support property parameters for the postal code data property"
  {:db/ident :vcard/hasPostalCode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the postal code data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has postal code@en"})

(def hasRegion
  "Used to support property parameters for the region data property"
  {:db/ident :vcard/hasRegion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the region data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has region@en"})

(def hasRelated
  "To specify a relationship between another entity and the entity represented by this object"
  {:db/ident :vcard/hasRelated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify a relationship between another entity and the entity represented by this object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has related@en"})

(def hasRole
  "Used to support property parameters for the role data property"
  {:db/ident :vcard/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the role data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has role@en"})

(def hasSound
  "To specify a digital sound content information that annotates some aspect of the object"
  {:db/ident :vcard/hasSound,
   :owl/equivalentProperty :vcard/sound,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify a digital sound content information that annotates some aspect of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has sound@en"})

(def hasSource
  "To identify the source of directory information of the object"
  {:db/ident :vcard/hasSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To identify the source of directory information of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has source@en"})

(def hasStreetAddress
  "Used to support property parameters for the street address data property"
  {:db/ident :vcard/hasStreetAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the street address data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has street address@en"})

(def hasTelephone
  "To specify the telephone number for telephony communication with the object"
  {:db/ident :vcard/hasTelephone,
   :owl/equivalentProperty :vcard/tel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the telephone number for telephony communication with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has telephone@en"})

(def hasTitle
  "Used to support property parameters for the title data property"
  {:db/ident :vcard/hasTitle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to support property parameters for the title data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has title@en"})

(def hasUID
  "To specify a value that represents a globally unique identifier corresponding to the object"
  {:db/ident :vcard/hasUID,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify a value that represents a globally unique identifier corresponding to the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has uid@en"})

(def hasURL
  "To specify a uniform resource locator associated with the object"
  {:db/ident :vcard/hasURL,
   :owl/equivalentProperty :vcard/url,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "To specify a uniform resource locator associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has url@en"})

(def hasValue
  "Used to indicate the resource value of an object property that requires property parameters"
  {:db/ident :vcard/hasValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "Used to indicate the resource value of an object property that requires property parameters@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "has value@en"})

(def honorific-prefix
  "The honorific prefix of the name associated with the object"
  {:db/ident :vcard/honorific-prefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "The honorific prefix of the name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "honorific prefix@en",
   :rdfs/range :xsd/string})

(def honorific-suffix
  "The honorific suffix of the name associated with the object"
  {:db/ident :vcard/honorific-suffix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "The honorific suffix of the name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "honorific suffix@en",
   :rdfs/range :xsd/string})

(def key
  "This object property has been mapped"
  {:db/ident         :vcard/key,
   :owl/equivalentProperty :vcard/hasKey,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "key@en"})

(def label
  "This data property has been deprecated"
  {:db/ident         :vcard/label,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "This data property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "label@en"})

(def language
  "To specify the language that may be used for contacting the object. May also be used as a property parameter."
  {:db/ident :vcard/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the language that may be used for contacting the object. May also be used as a property parameter.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "language@en"})

(def latitude
  "This data property has been deprecated. See hasGeo"
  {:db/ident         :vcard/latitude,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "This data property has been deprecated. See hasGeo@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "latitude@en"})

(def locality
  "The locality (e.g. city or town) associated with the address of the object"
  {:db/ident :vcard/locality,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "The locality (e.g. city or town) associated with the address of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "locality@en",
   :rdfs/range :xsd/string})

(def logo
  "This object property has been mapped"
  {:db/ident         :vcard/logo,
   :owl/equivalentProperty :vcard/hasLogo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "logo@en"})

(def longitude
  "This data property has been deprecated. See hasGeo"
  {:db/ident         :vcard/longitude,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "This data property has been deprecated. See hasGeo@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "longitude@en"})

(def mailer
  "This data property has been deprecated"
  {:db/ident         :vcard/mailer,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "This data property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "mailer@en"})

(def n
  "This object property has been mapped"
  {:db/ident         :vcard/n,
   :owl/equivalentProperty :vcard/hasName,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "name@en"})

(def nickname
  "The nick name associated with the object"
  {:db/ident         :vcard/nickname,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "The nick name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "nickname@en",
   :rdfs/range       :xsd/string})

(def note
  "A note associated with the object"
  {:db/ident         :vcard/note,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString "A note associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "note@en",
   :rdfs/range       :xsd/string})

(def org
  "This object property has been mapped. Use the organization-name data property."
  {:db/ident :vcard/org,
   :owl/equivalentProperty :vcard/organization-name,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "This object property has been mapped. Use the organization-name data property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "organization@en"})

(def organization-name
  "To specify the organizational name associated with the object"
  {:db/ident :vcard/organization-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the organizational name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "organization name@en",
   :rdfs/range :xsd/string})

(def organization-unit
  "To specify the organizational unit name associated with the object"
  {:db/ident :vcard/organization-unit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the organizational unit name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "organizational unit name@en",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :vcard/organization-name})

(def photo
  "This object property has been mapped"
  {:db/ident         :vcard/photo,
   :owl/equivalentProperty :vcard/hasPhoto,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "photo@en"})

(def post-office-box
  "This data property has been deprecated"
  {:db/ident         :vcard/post-office-box,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "This data property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "post office box@en"})

(def postal-code
  "The postal code associated with the address of the object"
  {:db/ident :vcard/postal-code,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "The postal code associated with the address of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "postal code@en",
   :rdfs/range :xsd/string})

(def prodid
  "To specify the identifier for the product that created the object"
  {:db/ident :vcard/prodid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the identifier for the product that created the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "product id@en",
   :rdfs/range :xsd/string})

(def region
  "The region (e.g. state or province) associated with the address of the object"
  {:db/ident :vcard/region,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "The region (e.g. state or province) associated with the address of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "region@en",
   :rdfs/range :xsd/string})

(def rev
  "To specify revision information about the object"
  {:db/ident         :vcard/rev,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "To specify revision information about the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "revision@en",
   :rdfs/range       :xsd/dateTime})

(def role
  "To specify the function or part played in a particular situation by the object"
  {:db/ident :vcard/role,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the function or part played in a particular situation by the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "role@en",
   :rdfs/range :xsd/string})

(def sort-string
  "To specify the string to be used for national-language-specific sorting. Used as a property parameter only."
  {:db/ident :vcard/sort-string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "To specify the string to be used for national-language-specific sorting. Used as a property parameter only.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "sort as@en",
   :rdfs/range :xsd/string})

(def sound
  "This object property has been mapped"
  {:db/ident         :vcard/sound,
   :owl/equivalentProperty :vcard/hasSound,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "sound@en"})

(def street-address
  "The street address associated with the address of the object"
  {:db/ident :vcard/street-address,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "The street address associated with the address of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "street address@en",
   :rdfs/range :xsd/string})

(def tel
  "This object property has been mapped"
  {:db/ident         :vcard/tel,
   :owl/equivalentProperty :vcard/hasTelephone,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "telephone@en"})

(def title
  "To specify the position or job of the object"
  {:db/ident         :vcard/title,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #rdf/langString
                      "To specify the position or job of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "title@en",
   :rdfs/range       :xsd/string})

(def tz
  "To indicate time zone information that is specific to the object. May also be used as a property parameter."
  {:db/ident :vcard/tz,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "To indicate time zone information that is specific to the object. May also be used as a property parameter.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "time zone@en",
   :rdfs/range :xsd/string})

(def url
  "This object property has been mapped"
  {:db/ident         :vcard/url,
   :owl/equivalentProperty :vcard/hasURL,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #rdf/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #rdf/langString "url@en"})

(def value
  "Used to indicate the literal value of a data property that requires property parameters"
  {:db/ident :vcard/value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "Used to indicate the literal value of a data property that requires property parameters@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #rdf/langString "value@en"})
