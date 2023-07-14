(ns net.wikipunk.rdf.vcard
  {:owl/versionInfo #xsd/langString "Final@en",
   :rdf/ns-prefix-map {"owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "vcard" "http://www.w3.org/2006/vcard/ns#",
                       "xml"   "http://www.w3.org/XML/1998/namespace",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "vcard",
   :rdfa/uri "http://www.w3.org/2006/vcard/ns",
   :rdfs/comment #xsd/langString "Ontology for vCard based on RFC6350@en",
   :rdfs/isDefinedBy
   {:rdfa/uri "http://www.w3.org/Submission/2010/SUBM-vcard-rdf-20100120/"},
   :rdfs/label #xsd/langString "Ontology for vCard@en"}
  (:refer-clojure :exclude [agent class fn key]))

(def Acquaintance
  {:db/ident         :vcard/Acquaintance,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Acquaintance@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Address
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
   #xsd/langString
    "To specify the components of the delivery address for the  object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Address@en"})

(def Agent
  {:db/ident         :vcard/Agent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Agent@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def BBS
  {:db/ident         :vcard/BBS,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "BBS@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Car
  {:db/ident         :vcard/Car,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Car@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Cell
  {:db/ident         :vcard/Cell,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "Also called mobile telephone@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Cell@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Child
  {:db/ident         :vcard/Child,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Child@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Colleague
  {:db/ident         :vcard/Colleague,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Colleague@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Contact
  {:db/ident         :vcard/Contact,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Contact@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Coresident
  {:db/ident         :vcard/Coresident,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Coresident@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Coworker
  {:db/ident         :vcard/Coworker,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Coworker@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Crush
  {:db/ident         :vcard/Crush,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Crush@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Date
  {:db/ident         :vcard/Date,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Date@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Dom
  {:db/ident         :vcard/Dom,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Dom@en",
   :rdfs/subClassOf  :vcard/Type})

(def Email
  {:db/ident :vcard/Email,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "To specify the electronic mail address for communication with the object the vCard represents. Use the hasEmail object property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Email@en"})

(def Emergency
  {:db/ident         :vcard/Emergency,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Emergency@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Fax
  {:db/ident         :vcard/Fax,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Fax@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Female
  {:db/ident         :vcard/Female,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Female@en",
   :rdfs/subClassOf  :vcard/Gender})

(def Friend
  {:db/ident         :vcard/Friend,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Friend@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Gender
  {:db/ident :vcard/Gender,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Used for gender codes. The URI of the gender code must be used as the value for Gender.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Gender@en"})

(def Group
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
   #xsd/langString
    "Object representing a group of persons or entities.  A group object will usually contain hasMember properties to specify the members of the group.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Group@en",
   :rdfs/subClassOf :vcard/Kind})

(def Home
  {:db/ident :vcard/Home,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "This implies that the property is related to an individual's personal life@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Home@en",
   :rdfs/subClassOf :vcard/Type})

(def ISDN
  {:db/ident         :vcard/ISDN,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "ISDN@en",
   :rdfs/subClassOf  :vcard/Type})

(def Individual
  {:db/ident         :vcard/Individual,
   :owl/disjointWith [:vcard/Organization :vcard/Location],
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "An object representing a single person or entity@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Individual@en",
   :rdfs/subClassOf  :vcard/Kind})

(def Internet
  {:db/ident         :vcard/Internet,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Internet@en",
   :rdfs/subClassOf  :vcard/Type})

(def Intl
  {:db/ident         :vcard/Intl,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Intl@en",
   :rdfs/subClassOf  :vcard/Type})

(def Kin
  {:db/ident         :vcard/Kin,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Kin@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Kind
  {:db/ident            :vcard/Kind,
   :owl/equivalentClass [:vcard/VCard
                         {:owl/minQualifiedCardinality #xsd/nonNegativeInteger
                                                        1,
                          :owl/onDataRange :xsd/string,
                          :owl/onProperty  :vcard/fn,
                          :rdf/type        :owl/Restriction}],
   :rdf/type            :owl/Class,
   :rdfs/comment        #xsd/langString "The parent class for all objects@en",
   :rdfs/isDefinedBy    {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label          #xsd/langString "Kind@en"})

(def Label
  {:db/ident         :vcard/Label,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Label@en",
   :rdfs/subClassOf  :vcard/Type})

(def Location
  {:db/ident         :vcard/Location,
   :owl/disjointWith :vcard/Organization,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "An object representing a named geographical place@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Location@en",
   :rdfs/subClassOf  :vcard/Kind})

(def Male
  {:db/ident         :vcard/Male,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Male@en",
   :rdfs/subClassOf  :vcard/Gender})

(def Me
  {:db/ident         :vcard/Me,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Me@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Met
  {:db/ident         :vcard/Met,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Met@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Modem
  {:db/ident         :vcard/Modem,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Modem@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Msg
  {:db/ident         :vcard/Msg,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Msg@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Muse
  {:db/ident         :vcard/Muse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Muse@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Name
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
   :rdfs/comment #xsd/langString
                  "To specify the components of the name of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Name@en"})

(def Neighbor
  {:db/ident         :vcard/Neighbor,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Neighbor@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def None
  {:db/ident         :vcard/None,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "None@en",
   :rdfs/subClassOf  :vcard/Gender})

(def Organization
  {:db/ident :vcard/Organization,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An object representing an organization.  An organization is a single entity, and might represent a business or government, a department or division within a business or government, a club, an association, or the like.\n@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Organization@en",
   :rdfs/subClassOf :vcard/Kind})

(def Other
  {:db/ident         :vcard/Other,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Other@en",
   :rdfs/subClassOf  :vcard/Gender})

(def PCS
  {:db/ident         :vcard/PCS,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "PCS@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Pager
  {:db/ident         :vcard/Pager,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Pager@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Parcel
  {:db/ident         :vcard/Parcel,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Parcel@en",
   :rdfs/subClassOf  :vcard/Type})

(def Parent
  {:db/ident         :vcard/Parent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Parent@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Postal
  {:db/ident         :vcard/Postal,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Postal@en",
   :rdfs/subClassOf  :vcard/Type})

(def Pref
  {:db/ident         :vcard/Pref,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Pref@en",
   :rdfs/subClassOf  :vcard/Type})

(def RelatedType
  {:db/ident :vcard/RelatedType,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Used for relation type codes. The URI of the relation type code must be used as the value for the Relation Type.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Relation Type@en"})

(def Sibling
  {:db/ident         :vcard/Sibling,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Sibling@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Spouse
  {:db/ident         :vcard/Spouse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Spouse@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Sweetheart
  {:db/ident         :vcard/Sweetheart,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Sweetheart@en",
   :rdfs/subClassOf  :vcard/RelatedType})

(def Tel
  {:db/ident :vcard/Tel,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "This class is deprecated. Use the hasTelephone object property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Tel@en"})

(def TelephoneType
  {:db/ident :vcard/TelephoneType,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Used for telephone type codes. The URI of the telephone type code must be used as the value for the Telephone Type.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Phone@en"})

(def Text
  {:db/ident         :vcard/Text,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "Also called sms telephone@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Text@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def TextPhone
  {:db/ident         :vcard/TextPhone,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Text phone@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Type
  {:db/ident :vcard/Type,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Used for type codes. The URI of the type code must be used as the value for Type.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Type@en"})

(def Unknown
  {:db/ident         :vcard/Unknown,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Unknown@en",
   :rdfs/subClassOf  :vcard/Gender})

(def VCard
  {:db/ident :vcard/VCard,
   :owl/equivalentClass :vcard/Kind,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The vCard class is  equivalent to the new Kind class, which is the parent for the four explicit types of vCards (Individual, Organization, Location, Group)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "VCard@en"})

(def Video
  {:db/ident         :vcard/Video,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Video@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Voice
  {:db/ident         :vcard/Voice,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "Voice@en",
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Work
  {:db/ident :vcard/Work,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "This implies that the property is related to an individual's work place@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "Work@en",
   :rdfs/subClassOf :vcard/Type})

(def X400
  {:db/ident         :vcard/X400,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "This class is deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "X400@en",
   :rdfs/subClassOf  :vcard/Type})

(def additional-name
  {:db/ident         :vcard/additional-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "The additional name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "additional name@en",
   :rdfs/range       :xsd/string})

(def adr
  {:db/ident         :vcard/adr,
   :owl/equivalentProperty :vcard/hasAddress,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "address@en"})

(def agent
  {:db/ident         :vcard/agent,
   :owl/deprecated   true,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "This object property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "agent@en"})

(def anniversary
  {:db/ident         :vcard/anniversary,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "The date of marriage, or equivalent, of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "anniversary@en",
   :rdfs/range       {:owl/unionOf [:xsd/dateTime :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def bday
  {:db/ident         :vcard/bday,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "To specify the birth date of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "birth date@en",
   :rdfs/range       {:owl/unionOf [:xsd/dateTime
                                    :xsd/dateTimeStamp
                                    :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def category
  {:db/ident :vcard/category,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The category information about the object, also known as tags@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "category@en",
   :rdfs/range :xsd/string})

(def class
  {:db/ident         :vcard/class,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "This data property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "class@en"})

(def country-name
  {:db/ident :vcard/country-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The country name associated with the address of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "country name@en",
   :rdfs/range :xsd/string})

(def email
  {:db/ident         :vcard/email,
   :owl/equivalentProperty :vcard/hasEmail,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "email@en"})

(def extended-address
  {:db/ident         :vcard/extended-address,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "This data property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "extended address@en"})

(def family-name
  {:db/ident         :vcard/family-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "The family name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "family name@en",
   :rdfs/range       :xsd/string})

(def fn
  {:db/ident :vcard/fn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The formatted text corresponding to the name of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "formatted name@en",
   :rdfs/range :xsd/string})

(def geo
  {:db/ident         :vcard/geo,
   :owl/equivalentProperty :vcard/hasGeo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "geo@en"})

(def given-name
  {:db/ident         :vcard/given-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "The given name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "given name@en",
   :rdfs/range       :xsd/string})

(def hasAdditionalName
  {:db/ident :vcard/hasAdditionalName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the additional name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has additional name@en"})

(def hasAddress
  {:db/ident :vcard/hasAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the components of the delivery address for the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has address@en",
   :rdfs/range :vcard/Address})

(def hasCalendarBusy
  {:db/ident :vcard/hasCalendarBusy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the busy time associated with the object. (Was called FBURL in RFC6350)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has calendar busy@en"})

(def hasCalendarLink
  {:db/ident :vcard/hasCalendarLink,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the calendar associated with the object. (Was called CALURI in RFC6350)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has calendar link@en"})

(def hasCalendarRequest
  {:db/ident :vcard/hasCalendarRequest,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the calendar user address to which a scheduling request be sent for the object. (Was called CALADRURI in RFC6350)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has calendar request@en"})

(def hasCategory
  {:db/ident :vcard/hasCategory,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the category data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has category@en"})

(def hasCountryName
  {:db/ident :vcard/hasCountryName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the country name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has country name@en"})

(def hasEmail
  {:db/ident :vcard/hasEmail,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the electronic mail address for communication with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has email@en",
   :rdfs/range :vcard/Email})

(def hasFN
  {:db/ident :vcard/hasFN,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the formatted name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has formatted name@en"})

(def hasFamilyName
  {:db/ident :vcard/hasFamilyName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the family name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has family name@en"})

(def hasGender
  {:db/ident :vcard/hasGender,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify  the sex or gender identity of the object. URIs are recommended to enable interoperable sex and gender codes to be used.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has gender@en"})

(def hasGeo
  {:db/ident :vcard/hasGeo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify information related to the global positioning of the object. May also be used as a property parameter.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has geo@en"})

(def hasGivenName
  {:db/ident :vcard/hasGivenName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the given name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has given name@en"})

(def hasHonorificPrefix
  {:db/ident :vcard/hasHonorificPrefix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the honorific prefix data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has honorific prefix@en"})

(def hasHonorificSuffix
  {:db/ident :vcard/hasHonorificSuffix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the honorific suffix data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has honorific suffix@en"})

(def hasInstantMessage
  {:db/ident :vcard/hasInstantMessage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the instant messaging and presence protocol communications with the object. (Was called IMPP in RFC6350)@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has messaging@en"})

(def hasKey
  {:db/ident :vcard/hasKey,
   :owl/equivalentProperty :vcard/key,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify a public key or authentication certificate associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has key@en"})

(def hasLanguage
  {:db/ident :vcard/hasLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the language data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has language@en"})

(def hasLocality
  {:db/ident :vcard/hasLocality,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the locality data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has locality@en"})

(def hasLogo
  {:db/ident :vcard/hasLogo,
   :owl/equivalentProperty :vcard/logo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify a graphic image of a logo associated with the object @en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has logo@en"})

(def hasMember
  {:db/ident :vcard/hasMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To include a member in the group this object represents. (This property can only be used by Group individuals)@en",
   :rdfs/domain :vcard/Group,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has member@en",
   :rdfs/range :vcard/Kind})

(def hasName
  {:db/ident         :vcard/hasName,
   :owl/equivalentProperty :vcard/n,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "To specify the components of the name of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "has name@en",
   :rdfs/range       :vcard/Name})

(def hasNickname
  {:db/ident :vcard/hasNickname,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the nickname data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has nickname@en",
   :rdfs/seeAlso :vcard/nickname})

(def hasNote
  {:db/ident :vcard/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the note data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has note@en"})

(def hasOrganizationName
  {:db/ident :vcard/hasOrganizationName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the organization name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has organization name@en"})

(def hasOrganizationUnit
  {:db/ident :vcard/hasOrganizationUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the organization unit name data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has organization unit name@en"})

(def hasPhoto
  {:db/ident :vcard/hasPhoto,
   :owl/equivalentProperty :vcard/photo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify an image or photograph information that annotates some aspect of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has photo@en"})

(def hasPostalCode
  {:db/ident :vcard/hasPostalCode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the postal code data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has postal code@en"})

(def hasRegion
  {:db/ident :vcard/hasRegion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the region data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has region@en"})

(def hasRelated
  {:db/ident :vcard/hasRelated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify a relationship between another entity and the entity represented by this object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has related@en"})

(def hasRole
  {:db/ident :vcard/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the role data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has role@en"})

(def hasSound
  {:db/ident :vcard/hasSound,
   :owl/equivalentProperty :vcard/sound,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify a digital sound content information that annotates some aspect of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has sound@en"})

(def hasSource
  {:db/ident :vcard/hasSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To identify the source of directory information of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has source@en"})

(def hasStreetAddress
  {:db/ident :vcard/hasStreetAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the street address data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has street address@en"})

(def hasTelephone
  {:db/ident :vcard/hasTelephone,
   :owl/equivalentProperty :vcard/tel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the telephone number for telephony communication with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has telephone@en"})

(def hasTitle
  {:db/ident :vcard/hasTitle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to support property parameters for the title data property@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has title@en"})

(def hasUID
  {:db/ident :vcard/hasUID,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify a value that represents a globally unique identifier corresponding to the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has uid@en"})

(def hasURL
  {:db/ident :vcard/hasURL,
   :owl/equivalentProperty :vcard/url,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "To specify a uniform resource locator associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has url@en"})

(def hasValue
  {:db/ident :vcard/hasValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Used to indicate the resource value of an object property that requires property parameters@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "has value@en"})

(def honorific-prefix
  {:db/ident :vcard/honorific-prefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The honorific prefix of the name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "honorific prefix@en",
   :rdfs/range :xsd/string})

(def honorific-suffix
  {:db/ident :vcard/honorific-suffix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The honorific suffix of the name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "honorific suffix@en",
   :rdfs/range :xsd/string})

(def key
  {:db/ident         :vcard/key,
   :owl/equivalentProperty :vcard/hasKey,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "key@en"})

(def label
  {:db/ident         :vcard/label,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "This data property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "label@en"})

(def language
  {:db/ident :vcard/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the language that may be used for contacting the object. May also be used as a property parameter.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "language@en"})

(def latitude
  {:db/ident         :vcard/latitude,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "This data property has been deprecated. See hasGeo@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "latitude@en"})

(def locality
  {:db/ident :vcard/locality,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The locality (e.g. city or town) associated with the address of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "locality@en",
   :rdfs/range :xsd/string})

(def logo
  {:db/ident         :vcard/logo,
   :owl/equivalentProperty :vcard/hasLogo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "logo@en"})

(def longitude
  {:db/ident         :vcard/longitude,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "This data property has been deprecated. See hasGeo@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "longitude@en"})

(def mailer
  {:db/ident         :vcard/mailer,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "This data property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "mailer@en"})

(def n
  {:db/ident         :vcard/n,
   :owl/equivalentProperty :vcard/hasName,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "name@en"})

(def nickname
  {:db/ident         :vcard/nickname,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "The nick name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "nickname@en",
   :rdfs/range       :xsd/string})

(def note
  {:db/ident         :vcard/note,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString "A note associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "note@en",
   :rdfs/range       :xsd/string})

(def org
  {:db/ident :vcard/org,
   :owl/equivalentProperty :vcard/organization-name,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "This object property has been mapped. Use the organization-name data property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "organization@en"})

(def organization-name
  {:db/ident :vcard/organization-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the organizational name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "organization name@en",
   :rdfs/range :xsd/string})

(def organization-unit
  {:db/ident :vcard/organization-unit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the organizational unit name associated with the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "organizational unit name@en",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :vcard/organization-name})

(def photo
  {:db/ident         :vcard/photo,
   :owl/equivalentProperty :vcard/hasPhoto,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "photo@en"})

(def post-office-box
  {:db/ident         :vcard/post-office-box,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "This data property has been deprecated@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "post office box@en"})

(def postal-code
  {:db/ident :vcard/postal-code,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The postal code associated with the address of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "postal code@en",
   :rdfs/range :xsd/string})

(def prodid
  {:db/ident :vcard/prodid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the identifier for the product that created the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "product id@en",
   :rdfs/range :xsd/string})

(def region
  {:db/ident :vcard/region,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The region (e.g. state or province) associated with the address of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "region@en",
   :rdfs/range :xsd/string})

(def rev
  {:db/ident         :vcard/rev,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "To specify revision information about the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "revision@en",
   :rdfs/range       :xsd/dateTime})

(def role
  {:db/ident :vcard/role,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the function or part played in a particular situation by the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "role@en",
   :rdfs/range :xsd/string})

(def sort-string
  {:db/ident :vcard/sort-string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "To specify the string to be used for national-language-specific sorting. Used as a property parameter only.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "sort as@en",
   :rdfs/range :xsd/string})

(def sound
  {:db/ident         :vcard/sound,
   :owl/equivalentProperty :vcard/hasSound,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "sound@en"})

(def street-address
  {:db/ident :vcard/street-address,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The street address associated with the address of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "street address@en",
   :rdfs/range :xsd/string})

(def tel
  {:db/ident         :vcard/tel,
   :owl/equivalentProperty :vcard/hasTelephone,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "telephone@en"})

(def title
  {:db/ident         :vcard/title,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #xsd/langString
                      "To specify the position or job of the object@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "title@en",
   :rdfs/range       :xsd/string})

(def tz
  {:db/ident :vcard/tz,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "To indicate time zone information that is specific to the object. May also be used as a property parameter.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "time zone@en",
   :rdfs/range :xsd/string})

(def url
  {:db/ident         :vcard/url,
   :owl/equivalentProperty :vcard/hasURL,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString "This object property has been mapped@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       #xsd/langString "url@en"})

(def value
  {:db/ident :vcard/value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Used to indicate the literal value of a data property that requires property parameters@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label #xsd/langString "value@en"})