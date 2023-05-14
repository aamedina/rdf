(ns net.wikipunk.rdf.vcard
  "Ontology for vCard based on RFC6350"
  {:owl/versionInfo #voc/lstr "Final@en",
   :rdf/ns-prefix-map {"owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "vcard" "http://www.w3.org/2006/vcard/ns#",
                       "xml"   "http://www.w3.org/XML/1998/namespace",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "vcard",
   :rdfa/uri "http://www.w3.org/2006/vcard/ns",
   :rdfs/comment #voc/lstr "Ontology for vCard based on RFC6350@en",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/Submission/2010/SUBM-vcard-rdf-20100120/"},
   :rdfs/label #voc/lstr "Ontology for vCard@en"}
  (:refer-clojure :exclude [agent class fn key]))

(def Acquaintance
  "Acquaintance"
  {:db/ident         :vcard/Acquaintance,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Acquaintance@en",
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
   #voc/lstr
    "To specify the components of the delivery address for the  object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Address@en"})

(def Agent
  "Agent"
  {:db/ident         :vcard/Agent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Agent@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Agent]})

(def BBS
  "This class is deprecated"
  {:db/ident         :vcard/BBS,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "BBS@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/BBS]})

(def Car
  "This class is deprecated"
  {:db/ident         :vcard/Car,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Car@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Car]})

(def Cell
  "Also called mobile telephone"
  {:db/ident         :vcard/Cell,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "Also called mobile telephone@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Cell@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Cell]})

(def Child
  "Child"
  {:db/ident         :vcard/Child,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Child@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Child]})

(def Colleague
  "Colleague"
  {:db/ident         :vcard/Colleague,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Colleague@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Colleague]})

(def Contact
  "Contact"
  {:db/ident         :vcard/Contact,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Contact@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Contact]})

(def Coresident
  "Coresident"
  {:db/ident         :vcard/Coresident,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Coresident@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Coresident]})

(def Coworker
  "Coworker"
  {:db/ident         :vcard/Coworker,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Coworker@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Coworker]})

(def Crush
  "Crush"
  {:db/ident         :vcard/Crush,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Crush@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Crush]})

(def Date
  "Date"
  {:db/ident         :vcard/Date,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Date@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Date]})

(def Dom
  "This class is deprecated"
  {:db/ident         :vcard/Dom,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Dom@en",
   :rdfs/subClassOf  [:vcard/Type :vcard/Dom]})

(def Email
  "To specify the electronic mail address for communication with the object the vCard represents. Use the hasEmail object property."
  {:db/ident :vcard/Email,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "To specify the electronic mail address for communication with the object the vCard represents. Use the hasEmail object property.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Email@en"})

(def Emergency
  "Emergency"
  {:db/ident         :vcard/Emergency,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Emergency@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Emergency]})

(def Fax
  "Fax"
  {:db/ident         :vcard/Fax,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Fax@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Fax]})

(def Female
  "Female"
  {:db/ident         :vcard/Female,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Female@en",
   :rdfs/subClassOf  [:vcard/Gender :vcard/Female]})

(def Friend
  "Friend"
  {:db/ident         :vcard/Friend,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Friend@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Friend]})

(def Gender
  "Used for gender codes. The URI of the gender code must be used as the value for Gender."
  {:db/ident :vcard/Gender,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Used for gender codes. The URI of the gender code must be used as the value for Gender.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Gender@en",
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
   #voc/lstr
    "Object representing a group of persons or entities.  A group object will usually contain hasMember properties to specify the members of the group.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Group@en",
   :rdfs/subClassOf [:vcard/Kind :vcard/Group]})

(def Home
  "This implies that the property is related to an individual's personal life"
  {:db/ident :vcard/Home,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This implies that the property is related to an individual's personal life@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Home@en",
   :rdfs/subClassOf [:vcard/Type :vcard/Home]})

(def ISDN
  "This class is deprecated"
  {:db/ident         :vcard/ISDN,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "ISDN@en",
   :rdfs/subClassOf  [:vcard/Type :vcard/ISDN]})

(def Individual
  "An object representing a single person or entity"
  {:db/ident         :vcard/Individual,
   :owl/disjointWith [:vcard/Organization :vcard/Location],
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "An object representing a single person or entity@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Individual@en",
   :rdfs/subClassOf  [:vcard/Kind :vcard/Individual]})

(def Internet
  "This class is deprecated"
  {:db/ident         :vcard/Internet,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Internet@en",
   :rdfs/subClassOf  [:vcard/Type :vcard/Internet]})

(def Intl
  "This class is deprecated"
  {:db/ident         :vcard/Intl,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Intl@en",
   :rdfs/subClassOf  [:vcard/Type :vcard/Intl]})

(def Kin
  "Kin"
  {:db/ident         :vcard/Kin,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Kin@en",
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
   :rdfs/comment        #voc/lstr "The parent class for all objects@en",
   :rdfs/isDefinedBy    "http://www.w3.org/2006/vcard/ns",
   :rdfs/label          #voc/lstr "Kind@en",
   :rdfs/subClassOf     :vcard/Kind})

(def Label
  "This class is deprecated"
  {:db/ident         :vcard/Label,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Label@en",
   :rdfs/subClassOf  [:vcard/Type :vcard/Label]})

(def Location
  "An object representing a named geographical place"
  {:db/ident         :vcard/Location,
   :owl/disjointWith :vcard/Organization,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "An object representing a named geographical place@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Location@en",
   :rdfs/subClassOf  [:vcard/Kind :vcard/Location]})

(def Male
  "Male"
  {:db/ident         :vcard/Male,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Male@en",
   :rdfs/subClassOf  [:vcard/Gender :vcard/Male]})

(def Me
  "Me"
  {:db/ident         :vcard/Me,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Me@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Me]})

(def Met
  "Met"
  {:db/ident         :vcard/Met,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Met@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Met]})

(def Modem
  "This class is deprecated"
  {:db/ident         :vcard/Modem,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Modem@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Modem]})

(def Msg
  "This class is deprecated"
  {:db/ident         :vcard/Msg,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Msg@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Msg]})

(def Muse
  "Muse"
  {:db/ident         :vcard/Muse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Muse@en",
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
   :rdfs/comment #voc/lstr
                  "To specify the components of the name of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Name@en"})

(def Neighbor
  "Neighbor"
  {:db/ident         :vcard/Neighbor,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Neighbor@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Neighbor]})

(def None
  "None"
  {:db/ident         :vcard/None,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "None@en",
   :rdfs/subClassOf  [:vcard/Gender :vcard/None]})

(def Organization
  "An object representing an organization. An organization is a single entity, and might represent a business or government, a department or division within a business or government, a club, an association, or the like."
  {:db/ident :vcard/Organization,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An object representing an organization.  An organization is a single entity, and might represent a business or government, a department or division within a business or government, a club, an association, or the like.\n@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Organization@en",
   :rdfs/subClassOf [:vcard/Kind :vcard/Organization]})

(def Other
  "Other"
  {:db/ident         :vcard/Other,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Other@en",
   :rdfs/subClassOf  [:vcard/Gender :vcard/Other]})

(def PCS
  "This class is deprecated"
  {:db/ident         :vcard/PCS,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "PCS@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/PCS]})

(def Pager
  "Pager"
  {:db/ident         :vcard/Pager,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Pager@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Pager]})

(def Parcel
  "This class is deprecated"
  {:db/ident         :vcard/Parcel,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Parcel@en",
   :rdfs/subClassOf  [:vcard/Type :vcard/Parcel]})

(def Parent
  "Parent"
  {:db/ident         :vcard/Parent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Parent@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Parent]})

(def Postal
  "This class is deprecated"
  {:db/ident         :vcard/Postal,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Postal@en",
   :rdfs/subClassOf  [:vcard/Type :vcard/Postal]})

(def Pref
  "This class is deprecated"
  {:db/ident         :vcard/Pref,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Pref@en",
   :rdfs/subClassOf  [:vcard/Type :vcard/Pref]})

(def RelatedType
  "Used for relation type codes. The URI of the relation type code must be used as the value for the Relation Type."
  {:db/ident :vcard/RelatedType,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Used for relation type codes. The URI of the relation type code must be used as the value for the Relation Type.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Relation Type@en",
   :rdfs/subClassOf :vcard/RelatedType})

(def Sibling
  "Sibling"
  {:db/ident         :vcard/Sibling,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Sibling@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Sibling]})

(def Spouse
  "Spouse"
  {:db/ident         :vcard/Spouse,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Spouse@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Spouse]})

(def Sweetheart
  "Sweetheart"
  {:db/ident         :vcard/Sweetheart,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Sweetheart@en",
   :rdfs/subClassOf  [:vcard/RelatedType :vcard/Sweetheart]})

(def Tel
  "This class is deprecated. Use the hasTelephone object property."
  {:db/ident :vcard/Tel,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This class is deprecated. Use the hasTelephone object property.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Tel@en"})

(def TelephoneType
  "Used for telephone type codes. The URI of the telephone type code must be used as the value for the Telephone Type."
  {:db/ident :vcard/TelephoneType,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Used for telephone type codes. The URI of the telephone type code must be used as the value for the Telephone Type.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Phone@en",
   :rdfs/subClassOf :vcard/TelephoneType})

(def Text
  "Also called sms telephone"
  {:db/ident         :vcard/Text,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "Also called sms telephone@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Text@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Text]})

(def TextPhone
  "Text phone"
  {:db/ident         :vcard/TextPhone,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Text phone@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/TextPhone]})

(def Type
  "Used for type codes. The URI of the type code must be used as the value for Type."
  {:db/ident :vcard/Type,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Used for type codes. The URI of the type code must be used as the value for Type.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Type@en",
   :rdfs/subClassOf :vcard/Type})

(def Unknown
  "Unknown"
  {:db/ident         :vcard/Unknown,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Unknown@en",
   :rdfs/subClassOf  [:vcard/Gender :vcard/Unknown]})

(def VCard
  "The vCard class is equivalent to the new Kind class, which is the parent for the four explicit types of vCards (Individual, Organization, Location, Group)"
  {:db/ident :vcard/VCard,
   :owl/equivalentClass :vcard/Kind,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The vCard class is  equivalent to the new Kind class, which is the parent for the four explicit types of vCards (Individual, Organization, Location, Group)@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "VCard@en"})

(def Video
  "Video"
  {:db/ident         :vcard/Video,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Video@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Video]})

(def Voice
  "Voice"
  {:db/ident         :vcard/Voice,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "Voice@en",
   :rdfs/subClassOf  [:vcard/TelephoneType :vcard/Voice]})

(def Work
  "This implies that the property is related to an individual's work place"
  {:db/ident :vcard/Work,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "This implies that the property is related to an individual's work place@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "Work@en",
   :rdfs/subClassOf [:vcard/Type :vcard/Work]})

(def X400
  "This class is deprecated"
  {:db/ident         :vcard/X400,
   :owl/deprecated   true,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "This class is deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "X400@en",
   :rdfs/subClassOf  [:vcard/Type :vcard/X400]})

(def additional-name
  "The additional name associated with the object"
  {:db/ident         :vcard/additional-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr
                      "The additional name associated with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "additional name@en",
   :rdfs/range       :xsd/string})

(def adr
  "This object property has been mapped"
  {:db/ident         :vcard/adr,
   :owl/equivalentProperty :vcard/hasAddress,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "This object property has been mapped@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "address@en"})

(def agent
  "This object property has been deprecated"
  {:db/ident         :vcard/agent,
   :owl/deprecated   true,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "This object property has been deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "agent@en"})

(def anniversary
  "The date of marriage, or equivalent, of the object"
  {:db/ident         :vcard/anniversary,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr
                      "The date of marriage, or equivalent, of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "anniversary@en",
   :rdfs/range       {:owl/unionOf [:xsd/dateTime :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def bday
  "To specify the birth date of the object"
  {:db/ident         :vcard/bday,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "To specify the birth date of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "birth date@en",
   :rdfs/range       {:owl/unionOf [:xsd/dateTime
                                    :xsd/dateTimeStamp
                                    :xsd/gYear],
                      :rdf/type    :rdfs/Datatype}})

(def category
  "The category information about the object, also known as tags"
  {:db/ident :vcard/category,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr "The category information about the object, also known as tags@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "category@en",
   :rdfs/range :xsd/string})

(def class
  "This data property has been deprecated"
  {:db/ident         :vcard/class,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "This data property has been deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "class@en"})

(def country-name
  "The country name associated with the address of the object"
  {:db/ident :vcard/country-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr "The country name associated with the address of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "country name@en",
   :rdfs/range :xsd/string})

(def email
  "This object property has been mapped"
  {:db/ident         :vcard/email,
   :owl/equivalentProperty :vcard/hasEmail,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "This object property has been mapped@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "email@en"})

(def extended-address
  "This data property has been deprecated"
  {:db/ident         :vcard/extended-address,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "This data property has been deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "extended address@en"})

(def family-name
  "The family name associated with the object"
  {:db/ident         :vcard/family-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "The family name associated with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "family name@en",
   :rdfs/range       :xsd/string})

(def fn
  "The formatted text corresponding to the name of the object"
  {:db/ident :vcard/fn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr "The formatted text corresponding to the name of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "formatted name@en",
   :rdfs/range :xsd/string})

(def geo
  "This object property has been mapped"
  {:db/ident         :vcard/geo,
   :owl/equivalentProperty :vcard/hasGeo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "This object property has been mapped@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "geo@en"})

(def given-name
  "The given name associated with the object"
  {:db/ident         :vcard/given-name,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "The given name associated with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "given name@en",
   :rdfs/range       :xsd/string})

(def hasAdditionalName
  "Used to support property parameters for the additional name data property"
  {:db/ident :vcard/hasAdditionalName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the additional name data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has additional name@en"})

(def hasAddress
  "To specify the components of the delivery address for the object"
  {:db/ident :vcard/hasAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the components of the delivery address for the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has address@en",
   :rdfs/range :vcard/Address})

(def hasCalendarBusy
  "To specify the busy time associated with the object. (Was called FBURL in RFC6350)"
  {:db/ident :vcard/hasCalendarBusy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the busy time associated with the object. (Was called FBURL in RFC6350)@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has calendar busy@en"})

(def hasCalendarLink
  "To specify the calendar associated with the object. (Was called CALURI in RFC6350)"
  {:db/ident :vcard/hasCalendarLink,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the calendar associated with the object. (Was called CALURI in RFC6350)@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has calendar link@en"})

(def hasCalendarRequest
  "To specify the calendar user address to which a scheduling request be sent for the object. (Was called CALADRURI in RFC6350)"
  {:db/ident :vcard/hasCalendarRequest,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the calendar user address to which a scheduling request be sent for the object. (Was called CALADRURI in RFC6350)@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has calendar request@en"})

(def hasCategory
  "Used to support property parameters for the category data property"
  {:db/ident :vcard/hasCategory,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the category data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has category@en"})

(def hasCountryName
  "Used to support property parameters for the country name data property"
  {:db/ident :vcard/hasCountryName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the country name data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has country name@en"})

(def hasEmail
  "To specify the electronic mail address for communication with the object"
  {:db/ident :vcard/hasEmail,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the electronic mail address for communication with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has email@en",
   :rdfs/range :vcard/Email})

(def hasFN
  "Used to support property parameters for the formatted name data property"
  {:db/ident :vcard/hasFN,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the formatted name data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has formatted name@en"})

(def hasFamilyName
  "Used to support property parameters for the family name data property"
  {:db/ident :vcard/hasFamilyName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the family name data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has family name@en"})

(def hasGender
  "To specify the sex or gender identity of the object. URIs are recommended to enable interoperable sex and gender codes to be used."
  {:db/ident :vcard/hasGender,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify  the sex or gender identity of the object. URIs are recommended to enable interoperable sex and gender codes to be used.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has gender@en"})

(def hasGeo
  "To specify information related to the global positioning of the object. May also be used as a property parameter."
  {:db/ident :vcard/hasGeo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify information related to the global positioning of the object. May also be used as a property parameter.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has geo@en"})

(def hasGivenName
  "Used to support property parameters for the given name data property"
  {:db/ident :vcard/hasGivenName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the given name data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has given name@en"})

(def hasHonorificPrefix
  "Used to support property parameters for the honorific prefix data property"
  {:db/ident :vcard/hasHonorificPrefix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the honorific prefix data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has honorific prefix@en"})

(def hasHonorificSuffix
  "Used to support property parameters for the honorific suffix data property"
  {:db/ident :vcard/hasHonorificSuffix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the honorific suffix data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has honorific suffix@en"})

(def hasInstantMessage
  "To specify the instant messaging and presence protocol communications with the object. (Was called IMPP in RFC6350)"
  {:db/ident :vcard/hasInstantMessage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the instant messaging and presence protocol communications with the object. (Was called IMPP in RFC6350)@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has messaging@en"})

(def hasKey
  "To specify a public key or authentication certificate associated with the object"
  {:db/ident :vcard/hasKey,
   :owl/equivalentProperty :vcard/key,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify a public key or authentication certificate associated with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has key@en"})

(def hasLanguage
  "Used to support property parameters for the language data property"
  {:db/ident :vcard/hasLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the language data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has language@en"})

(def hasLocality
  "Used to support property parameters for the locality data property"
  {:db/ident :vcard/hasLocality,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the locality data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has locality@en"})

(def hasLogo
  "To specify a graphic image of a logo associated with the object"
  {:db/ident :vcard/hasLogo,
   :owl/equivalentProperty :vcard/logo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify a graphic image of a logo associated with the object @en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has logo@en"})

(def hasMember
  "To include a member in the group this object represents. (This property can only be used by Group individuals)"
  {:db/ident :vcard/hasMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To include a member in the group this object represents. (This property can only be used by Group individuals)@en",
   :rdfs/domain :vcard/Group,
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has member@en",
   :rdfs/range :vcard/Kind})

(def hasName
  "To specify the components of the name of the object"
  {:db/ident         :vcard/hasName,
   :owl/equivalentProperty :vcard/n,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "To specify the components of the name of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "has name@en",
   :rdfs/range       :vcard/Name})

(def hasNickname
  "Used to support property parameters for the nickname data property"
  {:db/ident :vcard/hasNickname,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the nickname data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has nickname@en",
   :rdfs/seeAlso ["http://www.w3.org/2006/vcard/ns#nickname"]})

(def hasNote
  "Used to support property parameters for the note data property"
  {:db/ident :vcard/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the note data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has note@en"})

(def hasOrganizationName
  "Used to support property parameters for the organization name data property"
  {:db/ident :vcard/hasOrganizationName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the organization name data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has organization name@en"})

(def hasOrganizationUnit
  "Used to support property parameters for the organization unit name data property"
  {:db/ident :vcard/hasOrganizationUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the organization unit name data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has organization unit name@en"})

(def hasPhoto
  "To specify an image or photograph information that annotates some aspect of the object"
  {:db/ident :vcard/hasPhoto,
   :owl/equivalentProperty :vcard/photo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify an image or photograph information that annotates some aspect of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has photo@en"})

(def hasPostalCode
  "Used to support property parameters for the postal code data property"
  {:db/ident :vcard/hasPostalCode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the postal code data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has postal code@en"})

(def hasRegion
  "Used to support property parameters for the region data property"
  {:db/ident :vcard/hasRegion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the region data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has region@en"})

(def hasRelated
  "To specify a relationship between another entity and the entity represented by this object"
  {:db/ident :vcard/hasRelated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify a relationship between another entity and the entity represented by this object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has related@en"})

(def hasRole
  "Used to support property parameters for the role data property"
  {:db/ident :vcard/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the role data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has role@en"})

(def hasSound
  "To specify a digital sound content information that annotates some aspect of the object"
  {:db/ident :vcard/hasSound,
   :owl/equivalentProperty :vcard/sound,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify a digital sound content information that annotates some aspect of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has sound@en"})

(def hasSource
  "To identify the source of directory information of the object"
  {:db/ident :vcard/hasSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr "To identify the source of directory information of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has source@en"})

(def hasStreetAddress
  "Used to support property parameters for the street address data property"
  {:db/ident :vcard/hasStreetAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the street address data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has street address@en"})

(def hasTelephone
  "To specify the telephone number for telephony communication with the object"
  {:db/ident :vcard/hasTelephone,
   :owl/equivalentProperty :vcard/tel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the telephone number for telephony communication with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has telephone@en"})

(def hasTitle
  "Used to support property parameters for the title data property"
  {:db/ident :vcard/hasTitle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to support property parameters for the title data property@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has title@en"})

(def hasUID
  "To specify a value that represents a globally unique identifier corresponding to the object"
  {:db/ident :vcard/hasUID,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify a value that represents a globally unique identifier corresponding to the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has uid@en"})

(def hasURL
  "To specify a uniform resource locator associated with the object"
  {:db/ident :vcard/hasURL,
   :owl/equivalentProperty :vcard/url,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "To specify a uniform resource locator associated with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has url@en"})

(def hasValue
  "Used to indicate the resource value of an object property that requires property parameters"
  {:db/ident :vcard/hasValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to indicate the resource value of an object property that requires property parameters@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "has value@en"})

(def honorific-prefix
  "The honorific prefix of the name associated with the object"
  {:db/ident :vcard/honorific-prefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr "The honorific prefix of the name associated with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "honorific prefix@en",
   :rdfs/range :xsd/string})

(def honorific-suffix
  "The honorific suffix of the name associated with the object"
  {:db/ident :vcard/honorific-suffix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr "The honorific suffix of the name associated with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "honorific suffix@en",
   :rdfs/range :xsd/string})

(def key
  "This object property has been mapped"
  {:db/ident         :vcard/key,
   :owl/equivalentProperty :vcard/hasKey,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "This object property has been mapped@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "key@en"})

(def label
  "This data property has been deprecated"
  {:db/ident         :vcard/label,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "This data property has been deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "label@en"})

(def language
  "To specify the language that may be used for contacting the object. May also be used as a property parameter."
  {:db/ident :vcard/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the language that may be used for contacting the object. May also be used as a property parameter.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "language@en"})

(def latitude
  "This data property has been deprecated. See hasGeo"
  {:db/ident         :vcard/latitude,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr
                      "This data property has been deprecated. See hasGeo@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "latitude@en"})

(def locality
  "The locality (e.g. city or town) associated with the address of the object"
  {:db/ident :vcard/locality,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The locality (e.g. city or town) associated with the address of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "locality@en",
   :rdfs/range :xsd/string})

(def logo
  "This object property has been mapped"
  {:db/ident         :vcard/logo,
   :owl/equivalentProperty :vcard/hasLogo,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "This object property has been mapped@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "logo@en"})

(def longitude
  "This data property has been deprecated. See hasGeo"
  {:db/ident         :vcard/longitude,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr
                      "This data property has been deprecated. See hasGeo@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "longitude@en"})

(def mailer
  "This data property has been deprecated"
  {:db/ident         :vcard/mailer,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "This data property has been deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "mailer@en"})

(def n
  "This object property has been mapped"
  {:db/ident         :vcard/n,
   :owl/equivalentProperty :vcard/hasName,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "This object property has been mapped@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "name@en"})

(def nickname
  "The nick name associated with the object"
  {:db/ident         :vcard/nickname,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "The nick name associated with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "nickname@en",
   :rdfs/range       :xsd/string})

(def note
  "A note associated with the object"
  {:db/ident         :vcard/note,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "A note associated with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "note@en",
   :rdfs/range       :xsd/string})

(def org
  "This object property has been mapped. Use the organization-name data property."
  {:db/ident :vcard/org,
   :owl/equivalentProperty :vcard/organization-name,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "This object property has been mapped. Use the organization-name data property.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "organization@en"})

(def organization-name
  "To specify the organizational name associated with the object"
  {:db/ident :vcard/organization-name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr "To specify the organizational name associated with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "organization name@en",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :vcard/organization-name})

(def organization-unit
  "To specify the organizational unit name associated with the object"
  {:db/ident :vcard/organization-unit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the organizational unit name associated with the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "organizational unit name@en",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf [:vcard/organization-name :vcard/organization-unit]})

(def photo
  "This object property has been mapped"
  {:db/ident         :vcard/photo,
   :owl/equivalentProperty :vcard/hasPhoto,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "This object property has been mapped@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "photo@en"})

(def post-office-box
  "This data property has been deprecated"
  {:db/ident         :vcard/post-office-box,
   :owl/deprecated   true,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr "This data property has been deprecated@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "post office box@en"})

(def postal-code
  "The postal code associated with the address of the object"
  {:db/ident :vcard/postal-code,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr "The postal code associated with the address of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "postal code@en",
   :rdfs/range :xsd/string})

(def prodid
  "To specify the identifier for the product that created the object"
  {:db/ident :vcard/prodid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the identifier for the product that created the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "product id@en",
   :rdfs/range :xsd/string})

(def region
  "The region (e.g. state or province) associated with the address of the object"
  {:db/ident :vcard/region,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The region (e.g. state or province) associated with the address of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "region@en",
   :rdfs/range :xsd/string})

(def rev
  "To specify revision information about the object"
  {:db/ident         :vcard/rev,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr
                      "To specify revision information about the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "revision@en",
   :rdfs/range       :xsd/dateTime})

(def role
  "To specify the function or part played in a particular situation by the object"
  {:db/ident :vcard/role,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the function or part played in a particular situation by the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "role@en",
   :rdfs/range :xsd/string})

(def sort-string
  "To specify the string to be used for national-language-specific sorting. Used as a property parameter only."
  {:db/ident :vcard/sort-string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "To specify the string to be used for national-language-specific sorting. Used as a property parameter only.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "sort as@en",
   :rdfs/range :xsd/string})

(def sound
  "This object property has been mapped"
  {:db/ident         :vcard/sound,
   :owl/equivalentProperty :vcard/hasSound,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "This object property has been mapped@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "sound@en"})

(def street-address
  "The street address associated with the address of the object"
  {:db/ident :vcard/street-address,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr "The street address associated with the address of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "street address@en",
   :rdfs/range :xsd/string})

(def tel
  "This object property has been mapped"
  {:db/ident         :vcard/tel,
   :owl/equivalentProperty :vcard/hasTelephone,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "This object property has been mapped@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "telephone@en"})

(def title
  "To specify the position or job of the object"
  {:db/ident         :vcard/title,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr
                      "To specify the position or job of the object@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "title@en",
   :rdfs/range       :xsd/string})

(def tz
  "To indicate time zone information that is specific to the object. May also be used as a property parameter."
  {:db/ident :vcard/tz,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "To indicate time zone information that is specific to the object. May also be used as a property parameter.@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "time zone@en",
   :rdfs/range :xsd/string})

(def url
  "This object property has been mapped"
  {:db/ident         :vcard/url,
   :owl/equivalentProperty :vcard/hasURL,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "This object property has been mapped@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label       #voc/lstr "url@en"})

(def value
  "Used to indicate the literal value of a data property that requires property parameters"
  {:db/ident :vcard/value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "Used to indicate the literal value of a data property that requires property parameters@en",
   :rdfs/isDefinedBy "http://www.w3.org/2006/vcard/ns",
   :rdfs/label #voc/lstr "value@en"})