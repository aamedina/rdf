(ns net.wikipunk.rdf.vcard
  "Ontology for vCard based on RFC6350"
  {:owl/versionInfo "Final",
   :rdf/ns-prefix-map {"owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "vcard" "http://www.w3.org/2006/vcard/ns#",
                       "xml"   "http://www.w3.org/XML/1998/namespace",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "vcard",
   :rdfa/uri "http://www.w3.org/2006/vcard/ns",
   :rdfs/comment "Ontology for vCard based on RFC6350",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/Submission/2010/SUBM-vcard-rdf-20100120/"},
   :rdfs/label "Ontology for vCard"}
  (:refer-clojure :exclude [agent class fn key]))

(def Acquaintance
  "Acquaintance"
  {:db/ident         :vcard/Acquaintance,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Acquaintance",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Acquaintance]})

(def Address
  "To specify the components of the delivery address for the object"
  {:db/ident :vcard/Address,
   :owl/equivalentClass
   {:owl/unionOf [{:owl/intersectionOf [{:owl/onProperty :vcard/country-name,
                                         :owl/someValuesFrom :xsd/string,
                                         :rdf/type :owl/Restriction}
                                        {:owl/maxCardinality 1,
                                         :owl/onProperty :vcard/country-name,
                                         :rdf/type :owl/Restriction}],
                   :rdf/type :owl/Class}
                  {:owl/intersectionOf [{:owl/onProperty     :vcard/locality,
                                         :owl/someValuesFrom :xsd/string,
                                         :rdf/type           :owl/Restriction}
                                        {:owl/maxCardinality 1,
                                         :owl/onProperty     :vcard/locality,
                                         :rdf/type           :owl/Restriction}],
                   :rdf/type :owl/Class}
                  {:owl/intersectionOf [{:owl/onProperty     :vcard/postal-code,
                                         :owl/someValuesFrom :xsd/string,
                                         :rdf/type           :owl/Restriction}
                                        {:owl/maxCardinality 1,
                                         :owl/onProperty     :vcard/postal-code,
                                         :rdf/type           :owl/Restriction}],
                   :rdf/type :owl/Class}
                  {:owl/intersectionOf [{:owl/onProperty     :vcard/region,
                                         :owl/someValuesFrom :xsd/string,
                                         :rdf/type           :owl/Restriction}
                                        {:owl/maxCardinality 1,
                                         :owl/onProperty     :vcard/region,
                                         :rdf/type           :owl/Restriction}],
                   :rdf/type :owl/Class}
                  {:owl/intersectionOf [{:owl/onProperty :vcard/street-address,
                                         :owl/someValuesFrom :xsd/string,
                                         :rdf/type :owl/Restriction}
                                        {:owl/maxCardinality 1,
                                         :owl/onProperty :vcard/street-address,
                                         :rdf/type :owl/Restriction}],
                   :rdf/type :owl/Class}],
    :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   "To specify the components of the delivery address for the  object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Address"})

(def Agent
  "Agent"
  {:db/ident         :vcard/Agent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Agent",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Agent]})

(def BBS
  "This class is deprecated"
  {:db/ident         :vcard/BBS,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "BBS",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/BBS]})

(def Car
  "This class is deprecated"
  {:db/ident         :vcard/Car,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Car",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Car]})

(def Cell
  "Also called mobile telephone"
  {:db/ident         :vcard/Cell,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Also called mobile telephone",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Cell",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Cell]})

(def Child
  "Child"
  {:db/ident         :vcard/Child,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Child",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Child]})

(def Colleague
  "Colleague"
  {:db/ident         :vcard/Colleague,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Colleague",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Colleague]})

(def Contact
  "Contact"
  {:db/ident         :vcard/Contact,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Contact",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Contact]})

(def Coresident
  "Coresident"
  {:db/ident         :vcard/Coresident,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Coresident",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Coresident]})

(def Coworker
  "Coworker"
  {:db/ident         :vcard/Coworker,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Coworker",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Coworker]})

(def Crush
  "Crush"
  {:db/ident         :vcard/Crush,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Crush",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Crush]})

(def Date
  "Date"
  {:db/ident         :vcard/Date,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Date",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Date]})

(def Dom
  "This class is deprecated"
  {:db/ident         :vcard/Dom,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Dom",
   :rdfs/subClassOf  [:vcard/Type :vcard/Dom]})

(def Email
  "To specify the electronic mail address for communication with the object the vCard represents. Use the hasEmail object property."
  {:db/ident :vcard/Email,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   "To specify the electronic mail address for communication with the object the vCard represents. Use the hasEmail object property.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Email"})

(def Emergency
  "Emergency"
  {:db/ident         :vcard/Emergency,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Emergency",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Emergency]})

(def Fax
  "Fax"
  {:db/ident         :vcard/Fax,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Fax",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Fax]})

(def Female
  "Female"
  {:db/ident         :vcard/Female,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Female",
   :rdfs/subClassOf  [:vcard/Gender :vcard/Female]})

(def Friend
  "Friend"
  {:db/ident         :vcard/Friend,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Friend",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Friend]})

(def Gender
  "Used for gender codes. The URI of the gender code must be used as the value for Gender."
  {:db/ident :vcard/Gender,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Used for gender codes. The URI of the gender code must be used as the value for Gender.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Gender",
   :rdfs/subClassOf :vcard/Gender})

(def Group
  "Object representing a group of persons or entities. A group object will usually contain hasMember properties to specify the members of the group."
  {:db/ident :vcard/Group,
   :owl/disjointWith [:vcard/Organization :vcard/Location :vcard/Individual],
   :owl/equivalentClass {:owl/intersectionOf [{:owl/onProperty :vcard/hasMember,
                                               :owl/someValuesFrom :vcard/Kind,
                                               :rdf/type :owl/Restriction}
                                              {:owl/minQualifiedCardinality 1,
                                               :owl/onClass :vcard/Kind,
                                               :owl/onProperty :vcard/hasMember,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   "Object representing a group of persons or entities.  A group object will usually contain hasMember properties to specify the members of the group.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Group",
   :rdfs/subClassOf [:vcard/Kind :vcard/Group]})

(def Home
  "This implies that the property is related to an individual's personal life"
  {:db/ident :vcard/Home,
   :rdf/type :owl/Class,
   :rdfs/comment
   "This implies that the property is related to an individual's personal life",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Home",
   :rdfs/subClassOf [:vcard/Type :vcard/Home]})

(def ISDN
  "This class is deprecated"
  {:db/ident         :vcard/ISDN,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "ISDN",
   :rdfs/subClassOf  [:vcard/Type :vcard/ISDN]})

(def Individual
  "An object representing a single person or entity"
  {:db/ident         :vcard/Individual,
   :owl/disjointWith [:vcard/Organization :vcard/Location],
   :rdf/type         :owl/Class,
   :rdfs/comment     "An object representing a single person or entity",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Individual",
   :rdfs/subClassOf  [:vcard/Kind :vcard/Individual]})

(def Internet
  "This class is deprecated"
  {:db/ident         :vcard/Internet,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Internet",
   :rdfs/subClassOf  [:vcard/Type :vcard/Internet]})

(def Intl
  "This class is deprecated"
  {:db/ident         :vcard/Intl,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Intl",
   :rdfs/subClassOf  [:vcard/Type :vcard/Intl]})

(def Kin
  "Kin"
  {:db/ident         :vcard/Kin,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Kin",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Kin]})

(def Kind
  "The parent class for all objects"
  {:db/ident            :vcard/Kind,
   :owl/equivalentClass [:vcard/VCard
                         {:owl/minQualifiedCardinality 1,
                          :owl/onDataRange :xsd/string,
                          :owl/onProperty  :vcard/fn,
                          :rdf/type        :owl/Restriction}],
   :rdf/type            :owl/Class,
   :rdfs/comment        "The parent class for all objects",
   :rdfs/isDefinedBy    "http://www.w3.org/2006/vcard/ns",
   :rdfs/label          "Kind",
   :rdfs/subClassOf     :vcard/Kind})

(def Label
  "This class is deprecated"
  {:db/ident         :vcard/Label,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Label",
   :rdfs/subClassOf  [:vcard/Type :vcard/Label]})

(def Location
  "An object representing a named geographical place"
  {:db/ident         :vcard/Location,
   :owl/disjointWith :vcard/Organization,
   :rdf/type         :owl/Class,
   :rdfs/comment     "An object representing a named geographical place",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Location",
   :rdfs/subClassOf  [:vcard/Kind :vcard/Location]})

(def Male
  "Male"
  {:db/ident         :vcard/Male,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Male",
   :rdfs/subClassOf  [:vcard/Gender :vcard/Male]})

(def Me
  "Me"
  {:db/ident         :vcard/Me,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Me",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Me]})

(def Met
  "Met"
  {:db/ident         :vcard/Met,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Met",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Met]})

(def Modem
  "This class is deprecated"
  {:db/ident         :vcard/Modem,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Modem",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Modem]})

(def Msg
  "This class is deprecated"
  {:db/ident         :vcard/Msg,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Msg",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Msg]})

(def Muse
  "Muse"
  {:db/ident         :vcard/Muse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Muse",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Muse]})

(def Name
  "To specify the components of the name of the object"
  {:db/ident :vcard/Name,
   :owl/equivalentClass
   {:owl/unionOf
    [{:owl/intersectionOf [{:owl/onProperty     :vcard/additional-name,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/minCardinality 0,
                            :owl/onProperty     :vcard/additional-name,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/family-name,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/maxCardinality 1,
                            :owl/onProperty     :vcard/family-name,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/given-name,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/maxCardinality 1,
                            :owl/onProperty     :vcard/given-name,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/honorific-prefix,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/minCardinality 0,
                            :owl/onProperty     :vcard/honorific-prefix,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}
     {:owl/intersectionOf [{:owl/onProperty     :vcard/honorific-suffix,
                            :owl/someValuesFrom :xsd/string,
                            :rdf/type           :owl/Restriction}
                           {:owl/minCardinality 0,
                            :owl/onProperty     :vcard/honorific-suffix,
                            :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class}],
    :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment "To specify the components of the name of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Name"})

(def Neighbor
  "Neighbor"
  {:db/ident         :vcard/Neighbor,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Neighbor",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Neighbor]})

(def None
  "None"
  {:db/ident         :vcard/None,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "None",
   :rdfs/subClassOf  [:vcard/Gender :vcard/None]})

(def Organization
  "An object representing an organization. An organization is a single entity, and might represent a business or government, a department or division within a business or government, a club, an association, or the like."
  {:db/ident :vcard/Organization,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An object representing an organization.  An organization is a single entity, and might represent a business or government, a department or division within a business or government, a club, an association, or the like.\n",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Organization",
   :rdfs/subClassOf [:vcard/Kind :vcard/Organization]})

(def Other
  "Other"
  {:db/ident         :vcard/Other,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Other",
   :rdfs/subClassOf  [:vcard/Gender :vcard/Other]})

(def PCS
  "This class is deprecated"
  {:db/ident         :vcard/PCS,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "PCS",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/PCS]})

(def Pager
  "Pager"
  {:db/ident         :vcard/Pager,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Pager",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Pager]})

(def Parcel
  "This class is deprecated"
  {:db/ident         :vcard/Parcel,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Parcel",
   :rdfs/subClassOf  [:vcard/Type :vcard/Parcel]})

(def Parent
  "Parent"
  {:db/ident         :vcard/Parent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Parent",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Parent]})

(def Postal
  "This class is deprecated"
  {:db/ident         :vcard/Postal,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Postal",
   :rdfs/subClassOf  [:vcard/Type :vcard/Postal]})

(def Pref
  "This class is deprecated"
  {:db/ident         :vcard/Pref,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Pref",
   :rdfs/subClassOf  [:vcard/Type :vcard/Pref]})

(def RelatedType
  "Used for relation type codes. The URI of the relation type code must be used as the value for the Relation Type."
  {:db/ident :vcard/RelatedType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Used for relation type codes. The URI of the relation type code must be used as the value for the Relation Type.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Relation Type",
   :rdfs/subClassOf :vcard/RelatedType})

(def Sibling
  "Sibling"
  {:db/ident         :vcard/Sibling,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Sibling",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Sibling]})

(def Spouse
  "Spouse"
  {:db/ident         :vcard/Spouse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Spouse",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Spouse]})

(def Sweetheart
  "Sweetheart"
  {:db/ident         :vcard/Sweetheart,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Sweetheart",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Sweetheart]})

(def Tel
  "This class is deprecated. Use the hasTelephone object property."
  {:db/ident :vcard/Tel,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   "This class is deprecated. Use the hasTelephone object property.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Tel"})

(def TelephoneType
  "Used for telephone type codes. The URI of the telephone type code must be used as the value for the Telephone Type."
  {:db/ident :vcard/TelephoneType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Used for telephone type codes. The URI of the telephone type code must be used as the value for the Telephone Type.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Phone",
   :rdfs/subClassOf :vcard/TelephoneType})

(def Text
  "Also called sms telephone"
  {:db/ident         :vcard/Text,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Also called sms telephone",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Text",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Text]})

(def TextPhone
  "Text phone"
  {:db/ident         :vcard/TextPhone,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Text phone",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/TextPhone]})

(def Type
  "Used for type codes. The URI of the type code must be used as the value for Type."
  {:db/ident :vcard/Type,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Used for type codes. The URI of the type code must be used as the value for Type.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Type",
   :rdfs/subClassOf :vcard/Type})

(def Unknown
  "Unknown"
  {:db/ident         :vcard/Unknown,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Unknown",
   :rdfs/subClassOf  [:vcard/Gender :vcard/Unknown]})

(def VCard
  "The vCard class is equivalent to the new Kind class, which is the parent for the four explicit types of vCards (Individual, Organization, Location, Group)"
  {:db/ident :vcard/VCard,
   :owl/equivalentClass :vcard/Kind,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The vCard class is  equivalent to the new Kind class, which is the parent for the four explicit types of vCards (Individual, Organization, Location, Group)",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "VCard"})

(def Video
  "Video"
  {:db/ident         :vcard/Video,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Video",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Video]})

(def Voice
  "Voice"
  {:db/ident         :vcard/Voice,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "Voice",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Voice]})

(def Work
  "This implies that the property is related to an individual's work place"
  {:db/ident :vcard/Work,
   :rdf/type :owl/Class,
   :rdfs/comment
   "This implies that the property is related to an individual's work place",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "Work",
   :rdfs/subClassOf [:vcard/Type :vcard/Work]})

(def X400
  "This class is deprecated"
  {:db/ident         :vcard/X400,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This class is deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "X400",
   :rdfs/subClassOf  [:vcard/Type :vcard/X400]})

(def additional-name
  "The additional name associated with the object"
  {:db/ident         :vcard/additional-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "The additional name associated with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "additional name",
   :rdfs/range       :xsd/string})

(def adr
  "This object property has been mapped"
  {:db/ident         :vcard/adr,
   :owl/equivalentProperty :vcard/hasAddress,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "This object property has been mapped",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "address"})

(def agent
  "This object property has been deprecated"
  {:db/ident         :vcard/agent,
   :owl/deprecated   true,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "This object property has been deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "agent"})

(def anniversary
  "The date of marriage, or equivalent, of the object"
  {:db/ident         :vcard/anniversary,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "The date of marriage, or equivalent, of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "anniversary",
   :rdfs/range       {:owl/unionOf [:xsd/dateTime :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def bday
  "To specify the birth date of the object"
  {:db/ident         :vcard/bday,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "To specify the birth date of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "birth date",
   :rdfs/range       {:owl/unionOf [:xsd/dateTime
                                    :xsd/dateTimeStamp
                                    :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def category
  "The category information about the object, also known as tags"
  {:db/ident :vcard/category,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The category information about the object, also known as tags",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "category",
   :rdfs/range :xsd/string})

(def class
  "This data property has been deprecated"
  {:db/ident         :vcard/class,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "This data property has been deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "class"})

(def country-name
  "The country name associated with the address of the object"
  {:db/ident :vcard/country-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "The country name associated with the address of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "country name",
   :rdfs/range :xsd/string})

(def email
  "This object property has been mapped"
  {:db/ident         :vcard/email,
   :owl/equivalentProperty :vcard/hasEmail,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "This object property has been mapped",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "email"})

(def extended-address
  "This data property has been deprecated"
  {:db/ident         :vcard/extended-address,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "This data property has been deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "extended address"})

(def family-name
  "The family name associated with the object"
  {:db/ident         :vcard/family-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "The family name associated with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "family name",
   :rdfs/range       :xsd/string})

(def fn
  "The formatted text corresponding to the name of the object"
  {:db/ident :vcard/fn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "The formatted text corresponding to the name of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "formatted name",
   :rdfs/range :xsd/string})

(def geo
  "This object property has been mapped"
  {:db/ident         :vcard/geo,
   :owl/equivalentProperty :vcard/hasGeo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "This object property has been mapped",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "geo"})

(def given-name
  "The given name associated with the object"
  {:db/ident         :vcard/given-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "The given name associated with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "given name",
   :rdfs/range       :xsd/string})

(def hasAdditionalName
  "Used to support property parameters for the additional name data property"
  {:db/ident :vcard/hasAdditionalName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the additional name data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has additional name"})

(def hasAddress
  "To specify the components of the delivery address for the object"
  {:db/ident :vcard/hasAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify the components of the delivery address for the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has address",
   :rdfs/range :vcard/Address})

(def hasCalendarBusy
  "To specify the busy time associated with the object. (Was called FBURL in RFC6350)"
  {:db/ident :vcard/hasCalendarBusy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify the busy time associated with the object. (Was called FBURL in RFC6350)",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has calendar busy"})

(def hasCalendarLink
  "To specify the calendar associated with the object. (Was called CALURI in RFC6350)"
  {:db/ident :vcard/hasCalendarLink,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify the calendar associated with the object. (Was called CALURI in RFC6350)",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has calendar link"})

(def hasCalendarRequest
  "To specify the calendar user address to which a scheduling request be sent for the object. (Was called CALADRURI in RFC6350)"
  {:db/ident :vcard/hasCalendarRequest,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify the calendar user address to which a scheduling request be sent for the object. (Was called CALADRURI in RFC6350)",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has calendar request"})

(def hasCategory
  "Used to support property parameters for the category data property"
  {:db/ident :vcard/hasCategory,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the category data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has category"})

(def hasCountryName
  "Used to support property parameters for the country name data property"
  {:db/ident :vcard/hasCountryName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the country name data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has country name"})

(def hasEmail
  "To specify the electronic mail address for communication with the object"
  {:db/ident :vcard/hasEmail,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify the electronic mail address for communication with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has email",
   :rdfs/range :vcard/Email})

(def hasFN
  "Used to support property parameters for the formatted name data property"
  {:db/ident :vcard/hasFN,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the formatted name data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has formatted name"})

(def hasFamilyName
  "Used to support property parameters for the family name data property"
  {:db/ident :vcard/hasFamilyName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the family name data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has family name"})

(def hasGender
  "To specify the sex or gender identity of the object. URIs are recommended to enable interoperable sex and gender codes to be used."
  {:db/ident :vcard/hasGender,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify  the sex or gender identity of the object. URIs are recommended to enable interoperable sex and gender codes to be used.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has gender"})

(def hasGeo
  "To specify information related to the global positioning of the object. May also be used as a property parameter."
  {:db/ident :vcard/hasGeo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify information related to the global positioning of the object. May also be used as a property parameter.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has geo"})

(def hasGivenName
  "Used to support property parameters for the given name data property"
  {:db/ident :vcard/hasGivenName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the given name data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has given name"})

(def hasHonorificPrefix
  "Used to support property parameters for the honorific prefix data property"
  {:db/ident :vcard/hasHonorificPrefix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the honorific prefix data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has honorific prefix"})

(def hasHonorificSuffix
  "Used to support property parameters for the honorific suffix data property"
  {:db/ident :vcard/hasHonorificSuffix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the honorific suffix data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has honorific suffix"})

(def hasInstantMessage
  "To specify the instant messaging and presence protocol communications with the object. (Was called IMPP in RFC6350)"
  {:db/ident :vcard/hasInstantMessage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify the instant messaging and presence protocol communications with the object. (Was called IMPP in RFC6350)",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has messaging"})

(def hasKey
  "To specify a public key or authentication certificate associated with the object"
  {:db/ident :vcard/hasKey,
   :owl/equivalentProperty :vcard/key,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify a public key or authentication certificate associated with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has key"})

(def hasLanguage
  "Used to support property parameters for the language data property"
  {:db/ident :vcard/hasLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the language data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has language"})

(def hasLocality
  "Used to support property parameters for the locality data property"
  {:db/ident :vcard/hasLocality,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the locality data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has locality"})

(def hasLogo
  "To specify a graphic image of a logo associated with the object"
  {:db/ident :vcard/hasLogo,
   :owl/equivalentProperty :vcard/logo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify a graphic image of a logo associated with the object ",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has logo"})

(def hasMember
  "To include a member in the group this object represents. (This property can only be used by Group individuals)"
  {:db/ident :vcard/hasMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To include a member in the group this object represents. (This property can only be used by Group individuals)",
   :rdfs/domain :vcard/Group,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has member",
   :rdfs/range :vcard/Kind})

(def hasName
  "To specify the components of the name of the object"
  {:db/ident         :vcard/hasName,
   :owl/equivalentProperty :vcard/n,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "To specify the components of the name of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "has name",
   :rdfs/range       :vcard/Name})

(def hasNickname
  "Used to support property parameters for the nickname data property"
  {:db/ident :vcard/hasNickname,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the nickname data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has nickname",
   :rdfs/seeAlso ["http://www.w3.org/2006/vcard/ns#nickname"]})

(def hasNote
  "Used to support property parameters for the note data property"
  {:db/ident :vcard/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the note data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has note"})

(def hasOrganizationName
  "Used to support property parameters for the organization name data property"
  {:db/ident :vcard/hasOrganizationName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the organization name data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has organization name"})

(def hasOrganizationUnit
  "Used to support property parameters for the organization unit name data property"
  {:db/ident :vcard/hasOrganizationUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the organization unit name data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has organization unit name"})

(def hasPhoto
  "To specify an image or photograph information that annotates some aspect of the object"
  {:db/ident :vcard/hasPhoto,
   :owl/equivalentProperty :vcard/photo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify an image or photograph information that annotates some aspect of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has photo"})

(def hasPostalCode
  "Used to support property parameters for the postal code data property"
  {:db/ident :vcard/hasPostalCode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the postal code data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has postal code"})

(def hasRegion
  "Used to support property parameters for the region data property"
  {:db/ident :vcard/hasRegion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the region data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has region"})

(def hasRelated
  "To specify a relationship between another entity and the entity represented by this object"
  {:db/ident :vcard/hasRelated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify a relationship between another entity and the entity represented by this object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has related"})

(def hasRole
  "Used to support property parameters for the role data property"
  {:db/ident :vcard/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the role data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has role"})

(def hasSound
  "To specify a digital sound content information that annotates some aspect of the object"
  {:db/ident :vcard/hasSound,
   :owl/equivalentProperty :vcard/sound,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify a digital sound content information that annotates some aspect of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has sound"})

(def hasSource
  "To identify the source of directory information of the object"
  {:db/ident :vcard/hasSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To identify the source of directory information of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has source"})

(def hasStreetAddress
  "Used to support property parameters for the street address data property"
  {:db/ident :vcard/hasStreetAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the street address data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has street address"})

(def hasTelephone
  "To specify the telephone number for telephony communication with the object"
  {:db/ident :vcard/hasTelephone,
   :owl/equivalentProperty :vcard/tel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify the telephone number for telephony communication with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has telephone"})

(def hasTitle
  "Used to support property parameters for the title data property"
  {:db/ident :vcard/hasTitle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to support property parameters for the title data property",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has title"})

(def hasUID
  "To specify a value that represents a globally unique identifier corresponding to the object"
  {:db/ident :vcard/hasUID,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify a value that represents a globally unique identifier corresponding to the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has uid"})

(def hasURL
  "To specify a uniform resource locator associated with the object"
  {:db/ident :vcard/hasURL,
   :owl/equivalentProperty :vcard/url,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "To specify a uniform resource locator associated with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has url"})

(def hasValue
  "Used to indicate the resource value of an object property that requires property parameters"
  {:db/ident :vcard/hasValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to indicate the resource value of an object property that requires property parameters",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "has value"})

(def honorific-prefix
  "The honorific prefix of the name associated with the object"
  {:db/ident :vcard/honorific-prefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "The honorific prefix of the name associated with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "honorific prefix",
   :rdfs/range :xsd/string})

(def honorific-suffix
  "The honorific suffix of the name associated with the object"
  {:db/ident :vcard/honorific-suffix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "The honorific suffix of the name associated with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "honorific suffix",
   :rdfs/range :xsd/string})

(def key
  "This object property has been mapped"
  {:db/ident         :vcard/key,
   :owl/equivalentProperty :vcard/hasKey,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "This object property has been mapped",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "key"})

(def label
  "This data property has been deprecated"
  {:db/ident         :vcard/label,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "This data property has been deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "label"})

(def language
  "To specify the language that may be used for contacting the object. May also be used as a property parameter."
  {:db/ident :vcard/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the language that may be used for contacting the object. May also be used as a property parameter.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "language"})

(def latitude
  "This data property has been deprecated. See hasGeo"
  {:db/ident         :vcard/latitude,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "This data property has been deprecated. See hasGeo",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "latitude"})

(def locality
  "The locality (e.g. city or town) associated with the address of the object"
  {:db/ident :vcard/locality,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The locality (e.g. city or town) associated with the address of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "locality",
   :rdfs/range :xsd/string})

(def logo
  "This object property has been mapped"
  {:db/ident         :vcard/logo,
   :owl/equivalentProperty :vcard/hasLogo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "This object property has been mapped",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "logo"})

(def longitude
  "This data property has been deprecated. See hasGeo"
  {:db/ident         :vcard/longitude,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "This data property has been deprecated. See hasGeo",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "longitude"})

(def mailer
  "This data property has been deprecated"
  {:db/ident         :vcard/mailer,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "This data property has been deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "mailer"})

(def n
  "This object property has been mapped"
  {:db/ident         :vcard/n,
   :owl/equivalentProperty :vcard/hasName,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "This object property has been mapped",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "name"})

(def nickname
  "The nick name associated with the object"
  {:db/ident         :vcard/nickname,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "The nick name associated with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "nickname",
   :rdfs/range       :xsd/string})

(def note
  "A note associated with the object"
  {:db/ident         :vcard/note,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "A note associated with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "note",
   :rdfs/range       :xsd/string})

(def org
  "This object property has been mapped. Use the organization-name data property."
  {:db/ident :vcard/org,
   :owl/equivalentProperty :vcard/organization-name,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This object property has been mapped. Use the organization-name data property.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "organization"})

(def organization-name
  "To specify the organizational name associated with the object"
  {:db/ident :vcard/organization-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the organizational name associated with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "organization name",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :vcard/organization-name})

(def organization-unit
  "To specify the organizational unit name associated with the object"
  {:db/ident :vcard/organization-unit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the organizational unit name associated with the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "organizational unit name",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf [:vcard/organization-name :vcard/organization-unit]})

(def photo
  "This object property has been mapped"
  {:db/ident         :vcard/photo,
   :owl/equivalentProperty :vcard/hasPhoto,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "This object property has been mapped",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "photo"})

(def post-office-box
  "This data property has been deprecated"
  {:db/ident         :vcard/post-office-box,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "This data property has been deprecated",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "post office box"})

(def postal-code
  "The postal code associated with the address of the object"
  {:db/ident :vcard/postal-code,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "The postal code associated with the address of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "postal code",
   :rdfs/range :xsd/string})

(def prodid
  "To specify the identifier for the product that created the object"
  {:db/ident :vcard/prodid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the identifier for the product that created the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "product id",
   :rdfs/range :xsd/string})

(def region
  "The region (e.g. state or province) associated with the address of the object"
  {:db/ident :vcard/region,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The region (e.g. state or province) associated with the address of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "region",
   :rdfs/range :xsd/string})

(def rev
  "To specify revision information about the object"
  {:db/ident         :vcard/rev,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "To specify revision information about the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "revision",
   :rdfs/range       :xsd/dateTime})

(def role
  "To specify the function or part played in a particular situation by the object"
  {:db/ident :vcard/role,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the function or part played in a particular situation by the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "role",
   :rdfs/range :xsd/string})

(def sort-string
  "To specify the string to be used for national-language-specific sorting. Used as a property parameter only."
  {:db/ident :vcard/sort-string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the string to be used for national-language-specific sorting. Used as a property parameter only.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "sort as",
   :rdfs/range :xsd/string})

(def sound
  "This object property has been mapped"
  {:db/ident         :vcard/sound,
   :owl/equivalentProperty :vcard/hasSound,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "This object property has been mapped",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "sound"})

(def street-address
  "The street address associated with the address of the object"
  {:db/ident :vcard/street-address,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "The street address associated with the address of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "street address",
   :rdfs/range :xsd/string})

(def tel
  "This object property has been mapped"
  {:db/ident         :vcard/tel,
   :owl/equivalentProperty :vcard/hasTelephone,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "This object property has been mapped",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "telephone"})

(def title
  "To specify the position or job of the object"
  {:db/ident         :vcard/title,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "To specify the position or job of the object",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "title",
   :rdfs/range       :xsd/string})

(def tz
  "To indicate time zone information that is specific to the object. May also be used as a property parameter."
  {:db/ident :vcard/tz,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To indicate time zone information that is specific to the object. May also be used as a property parameter.",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "time zone",
   :rdfs/range :xsd/string})

(def url
  "This object property has been mapped"
  {:db/ident         :vcard/url,
   :owl/equivalentProperty :vcard/hasURL,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "This object property has been mapped",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       "url"})

(def value
  "Used to indicate the literal value of a data property that requires property parameters"
  {:db/ident :vcard/value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Used to indicate the literal value of a data property that requires property parameters",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label "value"})