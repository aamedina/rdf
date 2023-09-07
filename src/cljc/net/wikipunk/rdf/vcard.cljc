(ns net.wikipunk.rdf.vcard
  ^{:base       "http://www.w3.org/2006/vcard/ns#",
    :namespaces {"owl"   "http://www.w3.org/2002/07/owl#",
                 "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                 "vcard" "http://www.w3.org/2006/vcard/ns#",
                 "xml"   "http://www.w3.org/XML/1998/namespace",
                 "xsd"   "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "vcard",
    :source     "http://www.w3.org/2006/vcard/ns#"}
  {:owl/versionInfo {:rdf/language "en",
                     :rdf/value    "Final"},
   :rdf/type        :owl/Ontology,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Ontology for vCard based on RFC6350"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Ontology for vCard"},
   :xsd/anyURI      "http://www.w3.org/2006/vcard/ns"}
  (:refer-clojure :exclude [agent class fn key]))

(def Acquaintance
  {:db/ident         :vcard/Acquaintance,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Acquaintance"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Address
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
   {:rdf/language "en",
    :rdf/value
    "To specify the components of the delivery address for the  object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Address"}})

(def Agent
  {:db/ident         :vcard/Agent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Agent"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def BBS
  {:db/ident         :vcard/BBS,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "BBS"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Car
  {:db/ident         :vcard/Car,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Car"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Cell
  {:db/ident         :vcard/Cell,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Also called mobile telephone"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Cell"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Child
  {:db/ident         :vcard/Child,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Child"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Colleague
  {:db/ident         :vcard/Colleague,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Colleague"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Contact
  {:db/ident         :vcard/Contact,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Contact"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Coresident
  {:db/ident         :vcard/Coresident,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Coresident"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Coworker
  {:db/ident         :vcard/Coworker,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Coworker"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Crush
  {:db/ident         :vcard/Crush,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Crush"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Date
  {:db/ident         :vcard/Date,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Date"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Dom
  {:db/ident         :vcard/Dom,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Dom"},
   :rdfs/subClassOf  :vcard/Type})

(def Email
  {:db/ident :vcard/Email,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the electronic mail address for communication with the object the vCard represents. Use the hasEmail object property."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email"}})

(def Emergency
  {:db/ident         :vcard/Emergency,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Emergency"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Fax
  {:db/ident         :vcard/Fax,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Fax"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Female
  {:db/ident         :vcard/Female,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Female"},
   :rdfs/subClassOf  :vcard/Gender})

(def Friend
  {:db/ident         :vcard/Friend,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Friend"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Gender
  {:db/ident :vcard/Gender,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used for gender codes. The URI of the gender code must be used as the value for Gender."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gender"}})

(def Group
  {:db/ident :vcard/Group,
   :owl/disjointWith #{:vcard/Organization :vcard/Location :vcard/Individual},
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
   {:rdf/language "en",
    :rdf/value
    "Object representing a group of persons or entities.  A group object will usually contain hasMember properties to specify the members of the group."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Group"},
   :rdfs/subClassOf :vcard/Kind})

(def Home
  {:db/ident :vcard/Home,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This implies that the property is related to an individual's personal life"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Home"},
   :rdfs/subClassOf :vcard/Type})

(def ISDN
  {:db/ident         :vcard/ISDN,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "ISDN"},
   :rdfs/subClassOf  :vcard/Type})

(def Individual
  {:db/ident         :vcard/Individual,
   :owl/disjointWith #{:vcard/Organization :vcard/Location},
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "An object representing a single person or entity"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Individual"},
   :rdfs/subClassOf  :vcard/Kind})

(def Internet
  {:db/ident         :vcard/Internet,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Internet"},
   :rdfs/subClassOf  :vcard/Type})

(def Intl
  {:db/ident         :vcard/Intl,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Intl"},
   :rdfs/subClassOf  :vcard/Type})

(def Kin
  {:db/ident         :vcard/Kin,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Kin"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Kind
  {:db/ident            :vcard/Kind,
   :owl/equivalentClass #{:vcard/VCard
                          {:owl/minQualifiedCardinality 1,
                           :owl/onDataRange :xsd/string,
                           :owl/onProperty  :vcard/fn,
                           :rdf/type        :owl/Restriction}},
   :rdf/type            :owl/Class,
   :rdfs/comment        {:rdf/language "en",
                         :rdf/value    "The parent class for all objects"},
   :rdfs/isDefinedBy    {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Kind"}})

(def Label
  {:db/ident         :vcard/Label,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Label"},
   :rdfs/subClassOf  :vcard/Type})

(def Location
  {:db/ident         :vcard/Location,
   :owl/disjointWith :vcard/Organization,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "An object representing a named geographical place"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Location"},
   :rdfs/subClassOf  :vcard/Kind})

(def Male
  {:db/ident         :vcard/Male,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Male"},
   :rdfs/subClassOf  :vcard/Gender})

(def Me
  {:db/ident         :vcard/Me,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Me"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Met
  {:db/ident         :vcard/Met,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Met"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Modem
  {:db/ident         :vcard/Modem,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Modem"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Msg
  {:db/ident         :vcard/Msg,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Msg"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Muse
  {:db/ident         :vcard/Muse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Muse"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Name
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
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "To specify the components of the name of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Name"}})

(def Neighbor
  {:db/ident         :vcard/Neighbor,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Neighbor"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def None
  {:db/ident         :vcard/None,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "None"},
   :rdfs/subClassOf  :vcard/Gender})

(def Organization
  {:db/ident :vcard/Organization,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An object representing an organization.  An organization is a single entity, and might represent a business or government, a department or division within a business or government, a club, an association, or the like.\n"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Organization"},
   :rdfs/subClassOf :vcard/Kind})

(def Other
  {:db/ident         :vcard/Other,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Other"},
   :rdfs/subClassOf  :vcard/Gender})

(def PCS
  {:db/ident         :vcard/PCS,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "PCS"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Pager
  {:db/ident         :vcard/Pager,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Pager"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Parcel
  {:db/ident         :vcard/Parcel,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Parcel"},
   :rdfs/subClassOf  :vcard/Type})

(def Parent
  {:db/ident         :vcard/Parent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Parent"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Postal
  {:db/ident         :vcard/Postal,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Postal"},
   :rdfs/subClassOf  :vcard/Type})

(def Pref
  {:db/ident         :vcard/Pref,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Pref"},
   :rdfs/subClassOf  :vcard/Type})

(def RelatedType
  {:db/ident :vcard/RelatedType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used for relation type codes. The URI of the relation type code must be used as the value for the Relation Type."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relation Type"}})

(def Sibling
  {:db/ident         :vcard/Sibling,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Sibling"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Spouse
  {:db/ident         :vcard/Spouse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Spouse"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Sweetheart
  {:db/ident         :vcard/Sweetheart,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Sweetheart"},
   :rdfs/subClassOf  :vcard/RelatedType})

(def Tel
  {:db/ident :vcard/Tel,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class is deprecated. Use the hasTelephone object property."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tel"}})

(def TelephoneType
  {:db/ident :vcard/TelephoneType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used for telephone type codes. The URI of the telephone type code must be used as the value for the Telephone Type."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Phone"}})

(def Text
  {:db/ident         :vcard/Text,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Also called sms telephone"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Text"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def TextPhone
  {:db/ident         :vcard/TextPhone,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Text phone"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Type
  {:db/ident :vcard/Type,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used for type codes. The URI of the type code must be used as the value for Type."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Type"}})

(def Unknown
  {:db/ident         :vcard/Unknown,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Unknown"},
   :rdfs/subClassOf  :vcard/Gender})

(def VCard
  {:db/ident :vcard/VCard,
   :owl/equivalentClass :vcard/Kind,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The vCard class is  equivalent to the new Kind class, which is the parent for the four explicit types of vCards (Individual, Organization, Location, Group)"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "VCard"}})

(def Video
  {:db/ident         :vcard/Video,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Video"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Voice
  {:db/ident         :vcard/Voice,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Voice"},
   :rdfs/subClassOf  :vcard/TelephoneType})

(def Work
  {:db/ident :vcard/Work,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This implies that the property is related to an individual's work place"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Work"},
   :rdfs/subClassOf :vcard/Type})

(def X400
  {:db/ident         :vcard/X400,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This class is deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "X400"},
   :rdfs/subClassOf  :vcard/Type})

(def additional-name
  {:db/ident         :vcard/additional-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The additional name associated with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "additional name"},
   :rdfs/range       :xsd/string})

(def adr
  {:db/ident         :vcard/adr,
   :owl/equivalentProperty :vcard/hasAddress,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "address"}})

(def agent
  {:db/ident         :vcard/agent,
   :owl/deprecated   true,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "agent"}})

(def anniversary
  {:db/ident         :vcard/anniversary,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The date of marriage, or equivalent, of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "anniversary"},
   :rdfs/range       {:owl/unionOf [:xsd/dateTime :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def bday
  {:db/ident         :vcard/bday,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "To specify the birth date of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "birth date"},
   :rdfs/range       {:owl/unionOf [:xsd/dateTime
                                    :xsd/dateTimeStamp
                                    :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def category
  {:db/ident :vcard/category,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The category information about the object, also known as tags"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "category"},
   :rdfs/range :xsd/string})

(def class
  {:db/ident         :vcard/class,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This data property has been deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "class"}})

(def country-name
  {:db/ident :vcard/country-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The country name associated with the address of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "country name"},
   :rdfs/range :xsd/string})

(def email
  {:db/ident         :vcard/email,
   :owl/equivalentProperty :vcard/hasEmail,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "email"}})

(def extended-address
  {:db/ident         :vcard/extended-address,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This data property has been deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "extended address"}})

(def family-name
  {:db/ident         :vcard/family-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The family name associated with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "family name"},
   :rdfs/range       :xsd/string})

(def fn
  {:db/ident :vcard/fn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The formatted text corresponding to the name of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "formatted name"},
   :rdfs/range :xsd/string})

(def geo
  {:db/ident         :vcard/geo,
   :owl/equivalentProperty :vcard/hasGeo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "geo"}})

(def given-name
  {:db/ident         :vcard/given-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The given name associated with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "given name"},
   :rdfs/range       :xsd/string})

(def hasAdditionalName
  {:db/ident :vcard/hasAdditionalName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the additional name data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has additional name"}})

(def hasAddress
  {:db/ident :vcard/hasAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the components of the delivery address for the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has address"},
   :rdfs/range :vcard/Address})

(def hasCalendarBusy
  {:db/ident :vcard/hasCalendarBusy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the busy time associated with the object. (Was called FBURL in RFC6350)"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has calendar busy"}})

(def hasCalendarLink
  {:db/ident :vcard/hasCalendarLink,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the calendar associated with the object. (Was called CALURI in RFC6350)"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has calendar link"}})

(def hasCalendarRequest
  {:db/ident :vcard/hasCalendarRequest,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the calendar user address to which a scheduling request be sent for the object. (Was called CALADRURI in RFC6350)"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has calendar request"}})

(def hasCategory
  {:db/ident :vcard/hasCategory,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the category data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has category"}})

(def hasCountryName
  {:db/ident :vcard/hasCountryName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the country name data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has country name"}})

(def hasEmail
  {:db/ident :vcard/hasEmail,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the electronic mail address for communication with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has email"},
   :rdfs/range :vcard/Email})

(def hasFN
  {:db/ident :vcard/hasFN,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the formatted name data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has formatted name"}})

(def hasFamilyName
  {:db/ident :vcard/hasFamilyName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the family name data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has family name"}})

(def hasGender
  {:db/ident :vcard/hasGender,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify  the sex or gender identity of the object. URIs are recommended to enable interoperable sex and gender codes to be used."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has gender"}})

(def hasGeo
  {:db/ident :vcard/hasGeo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify information related to the global positioning of the object. May also be used as a property parameter."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has geo"}})

(def hasGivenName
  {:db/ident :vcard/hasGivenName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the given name data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has given name"}})

(def hasHonorificPrefix
  {:db/ident :vcard/hasHonorificPrefix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the honorific prefix data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has honorific prefix"}})

(def hasHonorificSuffix
  {:db/ident :vcard/hasHonorificSuffix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the honorific suffix data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has honorific suffix"}})

(def hasInstantMessage
  {:db/ident :vcard/hasInstantMessage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the instant messaging and presence protocol communications with the object. (Was called IMPP in RFC6350)"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has messaging"}})

(def hasKey
  {:db/ident :vcard/hasKey,
   :owl/equivalentProperty :vcard/key,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a public key or authentication certificate associated with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has key"}})

(def hasLanguage
  {:db/ident :vcard/hasLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the language data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has language"}})

(def hasLocality
  {:db/ident :vcard/hasLocality,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the locality data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has locality"}})

(def hasLogo
  {:db/ident :vcard/hasLogo,
   :owl/equivalentProperty :vcard/logo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a graphic image of a logo associated with the object "},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has logo"}})

(def hasMember
  {:db/ident :vcard/hasMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To include a member in the group this object represents. (This property can only be used by Group individuals)"},
   :rdfs/domain :vcard/Group,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has member"},
   :rdfs/range :vcard/Kind})

(def hasName
  {:db/ident         :vcard/hasName,
   :owl/equivalentProperty :vcard/n,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "To specify the components of the name of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has name"},
   :rdfs/range       :vcard/Name})

(def hasNickname
  {:db/ident :vcard/hasNickname,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the nickname data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has nickname"},
   :rdfs/seeAlso :vcard/nickname})

(def hasNote
  {:db/ident :vcard/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the note data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has note"}})

(def hasOrganizationName
  {:db/ident :vcard/hasOrganizationName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the organization name data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has organization name"}})

(def hasOrganizationUnit
  {:db/ident :vcard/hasOrganizationUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the organization unit name data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has organization unit name"}})

(def hasPhoto
  {:db/ident :vcard/hasPhoto,
   :owl/equivalentProperty :vcard/photo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify an image or photograph information that annotates some aspect of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has photo"}})

(def hasPostalCode
  {:db/ident :vcard/hasPostalCode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the postal code data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has postal code"}})

(def hasRegion
  {:db/ident :vcard/hasRegion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the region data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has region"}})

(def hasRelated
  {:db/ident :vcard/hasRelated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a relationship between another entity and the entity represented by this object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has related"}})

(def hasRole
  {:db/ident :vcard/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the role data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has role"}})

(def hasSound
  {:db/ident :vcard/hasSound,
   :owl/equivalentProperty :vcard/sound,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a digital sound content information that annotates some aspect of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has sound"}})

(def hasSource
  {:db/ident :vcard/hasSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "To identify the source of directory information of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has source"}})

(def hasStreetAddress
  {:db/ident :vcard/hasStreetAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the street address data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has street address"}})

(def hasTelephone
  {:db/ident :vcard/hasTelephone,
   :owl/equivalentProperty :vcard/tel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the telephone number for telephony communication with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has telephone"}})

(def hasTitle
  {:db/ident :vcard/hasTitle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to support property parameters for the title data property"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has title"}})

(def hasUID
  {:db/ident :vcard/hasUID,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a value that represents a globally unique identifier corresponding to the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has uid"}})

(def hasURL
  {:db/ident :vcard/hasURL,
   :owl/equivalentProperty :vcard/url,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify a uniform resource locator associated with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has url"}})

(def hasValue
  {:db/ident :vcard/hasValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to indicate the resource value of an object property that requires property parameters"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has value"}})

(def honorific-prefix
  {:db/ident :vcard/honorific-prefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The honorific prefix of the name associated with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "honorific prefix"},
   :rdfs/range :xsd/string})

(def honorific-suffix
  {:db/ident :vcard/honorific-suffix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The honorific suffix of the name associated with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "honorific suffix"},
   :rdfs/range :xsd/string})

(def key
  {:db/ident         :vcard/key,
   :owl/equivalentProperty :vcard/hasKey,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "key"}})

(def label
  {:db/ident         :vcard/label,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This data property has been deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "label"}})

(def language
  {:db/ident :vcard/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the language that may be used for contacting the object. May also be used as a property parameter."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "language"}})

(def latitude
  {:db/ident         :vcard/latitude,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "This data property has been deprecated. See hasGeo"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "latitude"}})

(def locality
  {:db/ident :vcard/locality,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The locality (e.g. city or town) associated with the address of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "locality"},
   :rdfs/range :xsd/string})

(def logo
  {:db/ident         :vcard/logo,
   :owl/equivalentProperty :vcard/hasLogo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "logo"}})

(def longitude
  {:db/ident         :vcard/longitude,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "This data property has been deprecated. See hasGeo"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "longitude"}})

(def mailer
  {:db/ident         :vcard/mailer,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This data property has been deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "mailer"}})

(def n
  {:db/ident         :vcard/n,
   :owl/equivalentProperty :vcard/hasName,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "name"}})

(def nickname
  {:db/ident         :vcard/nickname,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The nick name associated with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "nickname"},
   :rdfs/range       :xsd/string})

(def note
  {:db/ident         :vcard/note,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A note associated with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "note"},
   :rdfs/range       :xsd/string})

(def org
  {:db/ident :vcard/org,
   :owl/equivalentProperty :vcard/organization-name,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This object property has been mapped. Use the organization-name data property."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization"}})

(def organization-name
  {:db/ident :vcard/organization-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "To specify the organizational name associated with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization name"},
   :rdfs/range :xsd/string})

(def organization-unit
  {:db/ident :vcard/organization-unit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the organizational unit name associated with the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organizational unit name"},
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :vcard/organization-name})

(def photo
  {:db/ident         :vcard/photo,
   :owl/equivalentProperty :vcard/hasPhoto,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "photo"}})

(def post-office-box
  {:db/ident         :vcard/post-office-box,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This data property has been deprecated"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "post office box"}})

(def postal-code
  {:db/ident :vcard/postal-code,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The postal code associated with the address of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "postal code"},
   :rdfs/range :xsd/string})

(def prodid
  {:db/ident :vcard/prodid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the identifier for the product that created the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "product id"},
   :rdfs/range :xsd/string})

(def region
  {:db/ident :vcard/region,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The region (e.g. state or province) associated with the address of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "region"},
   :rdfs/range :xsd/string})

(def rev
  {:db/ident         :vcard/rev,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "To specify revision information about the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "revision"},
   :rdfs/range       :xsd/dateTime})

(def role
  {:db/ident :vcard/role,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the function or part played in a particular situation by the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "role"},
   :rdfs/range :xsd/string})

(def sort-string
  {:db/ident :vcard/sort-string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To specify the string to be used for national-language-specific sorting. Used as a property parameter only."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sort as"},
   :rdfs/range :xsd/string})

(def sound
  {:db/ident         :vcard/sound,
   :owl/equivalentProperty :vcard/hasSound,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "sound"}})

(def street-address
  {:db/ident :vcard/street-address,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The street address associated with the address of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "street address"},
   :rdfs/range :xsd/string})

(def tel
  {:db/ident         :vcard/tel,
   :owl/equivalentProperty :vcard/hasTelephone,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "telephone"}})

(def title
  {:db/ident         :vcard/title,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "To specify the position or job of the object"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "title"},
   :rdfs/range       :xsd/string})

(def tz
  {:db/ident :vcard/tz,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To indicate time zone information that is specific to the object. May also be used as a property parameter."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "time zone"},
   :rdfs/range :xsd/string})

(def url
  {:db/ident         :vcard/url,
   :owl/equivalentProperty :vcard/hasURL,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "This object property has been mapped"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "url"}})

(def value
  {:db/ident :vcard/value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to indicate the literal value of a data property that requires property parameters"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2006/vcard/ns"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "value"}})

(def urn:uuid:3f4389c5-9b9d-5498-923b-44d1c58dc375112376
  {:owl/versionInfo {:rdf/language "en",
                     :rdf/value    "Final"},
   :rdf/type        :owl/Ontology,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Ontology for vCard based on RFC6350"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Ontology for vCard"},
   :xsd/anyURI      "http://www.w3.org/2006/vcard/ns"})