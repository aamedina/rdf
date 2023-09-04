(ns net.wikipunk.rdf.gr
  "The GoodRelations ontology provides the vocabulary for annotating e-commerce offerings (1) to sell, lease, repair, dispose, or maintain commodity products and (2) to provide commodity services.\n\nGoodRelations allows describing the relationship between (1) Web resources, (2) offerings made by those Web resources, (3) legal entities, (4) prices, (5) terms and conditions, and the aforementioned ontologies for products and services (6).\n \nFor more information, see http://purl.org/goodrelations/\n\nNote: The base URI of GoodRelations is http://purl.org/goodrelations/v1. Please make sure you are only using element identifiers in this namespace, e.g. http://purl.org/goodrelations/v1#BusinessEntity. There may be copies of the ontology file on the Web which can be retrieved from other locations, BUT THOSE LOCATIONS MUST NOT BE USED AS THE BASIS OF IDENTIFIERS.\n\nIf you use GoodRelations for scientific purposes, please cite our paper:\n\nHepp, Martin: GoodRelations: An Ontology for Describing Products and Services Offers on the Web, Proceedings of the 16th International Conference on Knowledge Engineering and Knowledge Management (EKAW2008), September 29 - October 3, 2008, Acitrezza, Italy, Springer LNCS, Vol. 5268, pp. 332-347.\n\nPDF at http://www.heppnetz.de/publications/"
  {:dc11/contributor
   {:rdf/language "en",
    :rdf/value
    "Work on the GoodRelations ontology and related research and development has been partly supported by the Austrian BMVIT/FFG under the FIT-IT Semantic Systems project myOntology (grant no. 812515/9284), by a Young Researcher's Grant (Nachwuchsfoerderung 2005-2006) from the Leopold-Franzens-Universitaet Innsbruck, by the European Commission under the project SUPER (FP6-026850), and by the German Federal Ministry of Research (BMBF) by a grant under the KMU Innovativ program as part of the Intelligent Match project (FKZ 01IS10022B). The"},
   :dc11/creator {:rdf/language "en",
                  :rdf/value    "Martin Hepp"},
   :dc11/rights
   {:rdf/language "en",
    :rdf/value
    "The GoodRelations ontology is available under the Creative Commons Attribution 3.0 Unported license; see http://creativecommons.org/licenses/by/3.0/. In a nutshell, you are free to copy, distribute and transmit the work; to remix/adapt the work (e.g. to import the ontology and create specializations of its elements), as long as you attribute the work in the manner specified by the author or licensor (but not in any way that suggests that they endorse you or your use of the work). Proper Attribution: Simply include the statement \"This work is based on the GoodRelations ontology, developed by Martin Hepp\" and link back to http://purl.org/goodrelations/"},
   :dc11/subject
   {:rdf/language "en",
    :rdf/value
    "E-Commerce, E-Business, GoodRelations, Microdata, Ontology, Semantic SEO, RDFa, Linked Data, RDF, Semantic Web, Recommender Systems"},
   :dc11/title
   {:rdf/language "en",
    :rdf/value
    "The GoodRelations Vocabulary for Semantic Web-based E-Commerce"},
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/gr/versions/2011-10-01.n3",
   :dcterms/license {:xsd/anyURI "http://creativecommons.org/licenses/by/3.0/"},
   :foaf/homepage {:xsd/anyURI "http://purl.org/goodrelations/"},
   :namespaces {"dc11"    "http://purl.org/dc/elements/1.1/",
                "dcterms" "http://purl.org/dc/terms/",
                "foaf"    "http://xmlns.com/foaf/0.1/",
                "gr"      "http://purl.org/goodrelations/v1#",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :owl/versionInfo {:rdf/language "en",
                     :rdf/value    "V 1.0, Release 2011-10-01"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "gr",
   :rdfa/uri "http://purl.org/goodrelations/v1#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The GoodRelations ontology provides the vocabulary for annotating e-commerce offerings (1) to sell, lease, repair, dispose, or maintain commodity products and (2) to provide commodity services.\n\nGoodRelations allows describing the relationship between (1) Web resources, (2) offerings made by those Web resources, (3) legal entities, (4) prices, (5) terms and conditions, and the aforementioned ontologies for products and services (6).\n \nFor more information, see http://purl.org/goodrelations/\n\nNote: The base URI of GoodRelations is http://purl.org/goodrelations/v1. Please make sure you are only using element identifiers in this namespace, e.g. http://purl.org/goodrelations/v1#BusinessEntity. There may be copies of the ontology file on the Web which can be retrieved from other locations, BUT THOSE LOCATIONS MUST NOT BE USED AS THE BASIS OF IDENTIFIERS.\n\nIf you use GoodRelations for scientific purposes, please cite our paper:\n\nHepp, Martin: GoodRelations: An Ontology for Describing Products and Services Offers on the Web, Proceedings of the 16th International Conference on Knowledge Engineering and Knowledge Management (EKAW2008), September 29 - October 3, 2008, Acitrezza, Italy, Springer LNCS, Vol. 5268, pp. 332-347.\n\nPDF at http://www.heppnetz.de/publications/"},
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.heppnetz.de/ontologies/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GoodRelations Ontology"},
   :xsd/anyURI "http://purl.org/goodrelations/v1"}
  (:refer-clojure :exclude [name]))

(def ActualProductOrServiceInstance
  {:db/ident :gr/ActualProductOrServiceInstance,
   :owl/deprecated true,
   :owl/equivalentClass :gr/Individual,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "DEPRECATED - This class is superseded by gr:Individual. Replace all occurrences of gr:ActualProductOrServiceInstance by gr:Individual, if possible."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "Actual product or service instance (DEPRECATED)"},
   :rdfs/subClassOf :gr/ProductOrService})

(def AmericanExpress
  {:db/ident :gr/AmericanExpress,
   :rdf/type :gr/PaymentMethodCreditCard,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Payment by credit or debit cards issued by the American Express network."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "American Express (payment method)"}})

(def Brand
  {:db/ident :gr/Brand,
   :owl/disjointWith
   #{:gr/WarrantyScope :gr/PaymentMethod :gr/BusinessEntityType
     :gr/BusinessFunction :gr/OpeningHoursSpecification :gr/WarrantyPromise
     :gr/Offering :gr/TypeAndQuantityNode :gr/Location :gr/BusinessEntity
     :gr/QuantitativeValue :gr/DayOfWeek :gr/PriceSpecification
     :gr/DeliveryMethod :gr/ProductOrService},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A brand is the identity of a specific product, service, or business. Use foaf:logo for attaching a brand logo and gr:name or rdfs:label for attaching the brand name.\t\n\n(Source: Wikipedia, the free encyclopedia, see http://en.wikipedia.org/wiki/Brand)"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Brand"}})

(def Business
  {:db/ident :gr/Business,
   :rdf/type :gr/BusinessEntityType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The gr:BusinessEntityType representing such agents that are themselves offering commercial services or products on the market. Usually, businesses are characterized by the fact that they are officially registered with the public administration and strive for profits by their activities."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Business (business entity type)"}})

(def BusinessEntity
  {:db/ident :gr/BusinessEntity,
   :owl/disjointWith
   #{:gr/WarrantyScope :gr/PaymentMethod :gr/BusinessEntityType
     :gr/BusinessFunction :gr/OpeningHoursSpecification :gr/WarrantyPromise
     :gr/Offering :gr/TypeAndQuantityNode :gr/Location :gr/QuantitativeValue
     :gr/DayOfWeek :gr/PriceSpecification :gr/DeliveryMethod :gr/Brand},
   :owl/equivalentClass {:owl/unionOf [:schema/Person :schema/Organization],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of this class represents the legal agent making (or seeking) a particular offering. This can be a legal body or a person. A business entity has at least a primary mailing address and contact details. For this, typical address standards (vCard) and location data (geo, WGS84) can be attached. Note that the location of the business entity is not necessarily the location from which the product or service is being available (e.g. the branch or store). Use gr:Location for stores and branches.\n\t\t\nExample: Siemens Austria AG, Volkswagen Ltd., Peter Miller's Cell phone Shop LLC\n\nCompatibility with schema.org: This class is equivalent to the union of http://schema.org/Person and http://schema.org/Organization.\t\t\n"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Business entity"}})

(def BusinessEntityType
  {:db/ident :gr/BusinessEntityType,
   :owl/disjointWith #{:gr/WarrantyScope :gr/PaymentMethod :gr/BusinessFunction
                       :gr/OpeningHoursSpecification :gr/WarrantyPromise
                       :gr/Offering :gr/TypeAndQuantityNode :gr/Location
                       :gr/BusinessEntity :gr/QuantitativeValue :gr/DayOfWeek
                       :gr/PriceSpecification :gr/DeliveryMethod
                       :gr/ProductOrService :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A business entity type is a conceptual entity representing the legal form, the size, the main line of business, the position in the value chain, or any combination thereof, of a gr:BusinessEntity. From the ontological point of view, business entity types are mostly roles that a business entity has in the market. Business entity types are important for specifying eligible customers, since a gr:Offering is often valid only for business entities of a certain size, legal structure, or role in the value chain. \n\nExamples: Consumers, Retailers, Wholesalers, or Public Institutions"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Business entity type"}})

(def BusinessFunction
  {:db/ident :gr/BusinessFunction,
   :owl/disjointWith #{:gr/WarrantyScope :gr/PaymentMethod
                       :gr/BusinessEntityType :gr/OpeningHoursSpecification
                       :gr/WarrantyPromise :gr/Offering :gr/TypeAndQuantityNode
                       :gr/Location :gr/BusinessEntity :gr/QuantitativeValue
                       :gr/DayOfWeek :gr/PriceSpecification :gr/DeliveryMethod
                       :gr/ProductOrService :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The business function specifies the type of activity or access (i.e., the bundle of rights) offered by the gr:BusinessEntity on the gr:ProductOrService through the gr:Offering. Typical are sell, rental or lease, maintenance or repair, manufacture / produce, recycle / dispose, engineering / construction, or installation.\n\nLicenses and other proprietary specifications of access rights are also instances of this class.\n\nExamples: A particular offering made by Miller Rentals Ltd. says that they (1) sell Volkswagen Golf convertibles, (2) lease out a particular Ford pick-up truck, and (3) dispose car wrecks of any make and model."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Business function"}})

(def Buy
  {:db/ident :gr/Buy,
   :owl/deprecated true,
   :rdf/type :gr/BusinessFunction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This gr:BusinessFunction indicates that the gr:BusinessEntity is in general interested in purchasing the specified gr:ProductOrService.\nDEPRECATED. Use gr:seeks instead."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Buy (business function, DEPRECATED)"}})

(def ByBankTransferInAdvance
  {:db/ident :gr/ByBankTransferInAdvance,
   :rdf/type :gr/PaymentMethod,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Payment by bank transfer in advance, i.e., the offering gr:BusinessEntity will inform the buying party about their bank account details and will deliver the goods upon receipt of the due amount.\nThis is equivalent to payment by wire transfer."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "By bank transfer in advance (payment method)"}})

(def ByInvoice
  {:db/ident :gr/ByInvoice,
   :rdf/type :gr/PaymentMethod,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Payment by bank transfer after delivery, i.e., the offering gr:BusinessEntity will deliver first, inform the buying party about the due amount and their bank account details, and expect payment shortly after delivery."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "By invoice (payment method)"}})

(def COD
  {:db/ident :gr/COD,
   :rdf/type :gr/PaymentMethod,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Collect on delivery / Cash on delivery - A payment method where the recipient of goods pays at the time of delivery. Usually, the amount of money is collected by the transportation company handling the goods."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "COD (payment method)"}})

(def Cash
  {:db/ident         :gr/Cash,
   :rdf/type         :gr/PaymentMethod,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Payment by cash upon delivery or pickup."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Cash (payment method)"}})

(def CheckInAdvance
  {:db/ident :gr/CheckInAdvance,
   :rdf/type :gr/PaymentMethod,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Payment by sending a check in advance, i.e., the offering gr:BusinessEntity will deliver the goods upon receipt of a check over the due amount. There are variations in handling payment by check - sometimes, shipment will be upon receipt of the check as a document, sometimes the shipment will take place only upon successful crediting of the check."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Check in advance (payment method)"}})

(def ConstructionInstallation
  {:db/ident :gr/ConstructionInstallation,
   :rdf/type :gr/BusinessFunction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This gr:BusinessFunction indicates that the gr:BusinessEntity offers (or seeks) the construction and/or installation of the specified gr:ProductOrService at the customer's location."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "Construction / installation (business function)"}})

(def DHL
  {:db/ident         :gr/DHL,
   :rdf/type         :gr/DeliveryModeParcelService,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Delivery via the parcel service DHL."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "DHL (delivery method)"}})

(def DayOfWeek
  {:db/ident :gr/DayOfWeek,
   :owl/disjointWith
   #{:gr/WarrantyScope :gr/PaymentMethod :gr/BusinessEntityType
     :gr/BusinessFunction :gr/OpeningHoursSpecification :gr/WarrantyPromise
     :gr/Offering :gr/TypeAndQuantityNode :gr/Location :gr/BusinessEntity
     :gr/QuantitativeValue :gr/PriceSpecification :gr/DeliveryMethod
     :gr/ProductOrService :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The day of the week, used to specify  to which day the opening hours of a gr:OpeningHoursSpecification refer.\n\nExamples: Monday, Tuesday, Wednesday,..."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Day of week"}})

(def DeliveryChargeSpecification
  {:db/ident :gr/DeliveryChargeSpecification,
   :owl/disjointWith #{:gr/UnitPriceSpecification
                       :gr/PaymentChargeSpecification},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A delivery charge specification is a conceptual entity that specifies the additional costs asked for the delivery of a given gr:Offering using a particular gr:DeliveryMethod by the respective gr:BusinessEntity. A delivery charge specification is characterized by (1) a monetary amount per order, specified as a literal value of type float in combination with a currency, (2) the delivery method, (3) the target country or region, and (4)  whether this charge includes local sales taxes, namely VAT.\nA gr:Offering may be linked to multiple gr:DeliveryChargeSpecification nodes that specify alternative charges for disjoint combinations of target countries or regions, and delivery methods.\n\nExamples: Delivery by direct download is free of charge worldwide, delivery by UPS to Germany is 10 Euros per order, delivery by mail within the US is 5 Euros per order.\n\nThe total amount of this charge is specified as a float value of the gr:hasCurrencyValue property. The currency is specified via the gr:hasCurrency datatype property. Whether the price includes VAT or not is indicated by the gr:valueAddedTaxIncluded property. The gr:DeliveryMethod to which this charge applies is specified using the gr:appliesToDeliveryMethod object property. The region or regions to which this charge applies is specified using the gr:eligibleRegions property, which uses ISO 3166-1 and ISO 3166-2 codes.\n\nIf the price can only be given as a range, use gr:hasMaxCurrencyValue and gr:hasMinCurrencyValue for the upper and lower bounds.\n\nImportant: When querying for the price, always use gr:hasMaxCurrencyValue and gr:hasMinCurrencyValue."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delivery charge specification"},
   :rdfs/subClassOf :gr/PriceSpecification})

(def DeliveryMethod
  {:db/ident :gr/DeliveryMethod,
   :owl/disjointWith #{:gr/WarrantyScope :gr/PaymentMethod
                       :gr/BusinessEntityType :gr/BusinessFunction
                       :gr/OpeningHoursSpecification :gr/WarrantyPromise
                       :gr/Offering :gr/TypeAndQuantityNode :gr/Location
                       :gr/BusinessEntity :gr/QuantitativeValue :gr/DayOfWeek
                       :gr/PriceSpecification :gr/ProductOrService :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A delivery method is a standardized procedure for transferring the product or service to the destination of fulfilment chosen by the customer. Delivery methods are characterized by the means of transportation used, and by the organization or group that is the contracting party for the sending gr:BusinessEntity (this is important, since the contracted party may subcontract the fulfilment to smaller, regional businesses).\n\nExamples: Delivery by mail, delivery by direct download, delivery by UPS"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delivery method"}})

(def DeliveryModeDirectDownload
  {:db/ident :gr/DeliveryModeDirectDownload,
   :rdf/type :gr/DeliveryMethod,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Delivery of the goods via direct download from the Internet, i.e., the offering gr:BusinessEntity provides the buying party with details on how to retrieve the goods online. Connection fees and other costs of using the infrastructure are to be carried by the buying party."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "Delivery mode direct download (delivery method)"}})

(def DeliveryModeFreight
  {:db/ident :gr/DeliveryModeFreight,
   :rdf/type :gr/DeliveryMethod,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Delivery by an unspecified air, sea, or ground freight carrier or cargo company."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delivery mode freight (delivery method)"}})

(def DeliveryModeMail
  {:db/ident :gr/DeliveryModeMail,
   :rdf/type :gr/DeliveryMethod,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Delivery via regular mail service (private or public postal services)."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delivery mode mail (delivery method)"}})

(def DeliveryModeOwnFleet
  {:db/ident :gr/DeliveryModeOwnFleet,
   :rdf/type :gr/DeliveryMethod,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Delivery of the goods by using a fleet of vehicles either owned and operated or subcontracted by the gr:BusinessEntity."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delivery mode own fleet (delivery method)"}})

(def DeliveryModeParcelService
  {:db/ident :gr/DeliveryModeParcelService,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A private parcel service as the delivery mode available for a certain offering.\n\nExamples: UPS, DHL"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delivery mode parcel service"},
   :rdfs/subClassOf :gr/DeliveryMethod})

(def DeliveryModePickUp
  {:db/ident :gr/DeliveryModePickUp,
   :rdf/type :gr/DeliveryMethod,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Delivery of the goods by picking them up at one of the stores etc. (gr:Location) during the opening hours as specified by respective instances of gr:OpeningHoursSpecification."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Delivery mode pick up (delivery method)"}})

(def DinersClub
  {:db/ident :gr/DinersClub,
   :rdf/type :gr/PaymentMethodCreditCard,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Payment by credit or debit cards issued by the Diner's Club network."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Diners Club (payment method)"}})

(def DirectDebit
  {:db/ident :gr/DirectDebit,
   :rdf/type :gr/PaymentMethod,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Payment by direct debit, i.e., the buying party will inform the offering gr:BusinessEntity about its bank account details and authorizes the gr:BusinessEntity to collect the agreed amount directly from that account."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Direct debit (payment method)"}})

(def Discover
  {:db/ident :gr/Discover,
   :rdf/type :gr/PaymentMethodCreditCard,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Payment by credit or debit cards issued by the Discover network."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Discover (payment method)"}})

(def Dispose
  {:db/ident :gr/Dispose,
   :rdf/type :gr/BusinessFunction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This gr:BusinessFunction indicates that the gr:BusinessEntity offers (or seeks) the acceptance of the specified gr:ProductOrService for proper disposal, recycling, or any other kind of allowed usages, freeing the current owner from all rights and obligations of ownership."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dispose (business function)"}})

(def Enduser
  {:db/ident :gr/Enduser,
   :rdf/type :gr/BusinessEntityType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The gr:BusinessEntityType representing such agents that are purchasing the good or service for private consumption, in particular not for resale or for usage within an industrial enterprise. By default, a Business Entity is an Enduser."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Enduser (business entity type)"}})

(def FederalExpress
  {:db/ident         :gr/FederalExpress,
   :rdf/type         :gr/DeliveryModeParcelService,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Delivery via the parcel service Federal Express."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Federal Express (delivery method)"}})

(def Friday
  {:db/ident           :gr/Friday,
   :gr/displayPosition 5,
   :gr/hasNext         :gr/Saturday,
   :gr/hasPrevious     :gr/Thursday,
   :rdf/type           :gr/DayOfWeek,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Friday as a day of the week."},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Friday (day of week)"}})

(def GoogleCheckout
  {:db/ident         :gr/GoogleCheckout,
   :rdf/type         :gr/PaymentMethod,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Payment via the Google Checkout payment service."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Google Checkout (payment method)"}})

(def Individual
  {:db/ident :gr/Individual,
   :owl/disjointWith #{:gr/ProductOrServiceModel :gr/SomeItems},
   :owl/equivalentClass :gr/ActualProductOrServiceInstance,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A gr:Individual is an actual product or service instance, i.e., a single identifiable object or action that creates some increase in utility (in the economic sense) for the individual possessing or using this very object (product) or for the individual in whose favor this very action is being taken (service). Products or services are types of goods in the economic sense. For an overview of goods and commodities in economics, see Milgate (1987).\n\nExamples: MyThinkpad T60, the pint of beer standing in front of me, my Volkswagen Golf, the haircut that I received or will be receiving at a given date and time.\n\nNote 1: In many cases, product or service instances are not explicitly exposed on the Web but only claimed to exist (i.e. existentially quantified). In this case, use gr:SomeItems.\nNote 2: This class is the new, shorter form of the former gr:ActualProductOrServiceInstance.\n\nCompatibility with schema.org: This class is a subclass of http://schema.org/Product."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Individual"},
   :rdfs/subClassOf #{:schema/Product :gr/ProductOrService}})

(def JCB
  {:db/ident :gr/JCB,
   :rdf/type :gr/PaymentMethodCreditCard,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Payment by credit or debit cards issued by the JCB network."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JCB (payment method)"}})

(def Labor-BringIn
  {:db/ident :gr/Labor-BringIn,
   :rdf/type :gr/WarrantyScope,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "In case of a defect or malfunction, the buying party has the right to transport the good to a service location determined by the the selling gr:BusinessEntity and will be charged only for parts and materials needed to fix the problem. Labor will be covered by the selling business entity or one of its partnering business entities.\n\nNote: This is just a rough classification for filtering offers. It is up to the buying party to check the exact scope and terms and conditions of the gr:WarrantyPromise."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Labor / bring-in (warranty scope)"}})

(def LeaseOut
  {:db/ident :gr/LeaseOut,
   :rdf/type :gr/BusinessFunction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This gr:BusinessFunction indicates that the gr:BusinessEntity offers (or seeks) the temporary right to use the specified gr:ProductOrService."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Lease Out (business function)"}})

(def License
  {:db/ident :gr/License,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A license is the specification of a bundle of rights that determines the type of activity or access offered by the gr:BusinessEntity on the gr:ProductOrService through the gr:Offering.\n\t\nLicenses can be standardized (e.g. LPGL, Creative Commons, ...), vendor-specific, or individually defined for a single offer or product. Whether there is a fee for obtaining the license is specified using the gr:UnitPriceSpecification attached to the gr:Offering. Use foaf:page for linking to a document containing the license, e.g. in PDF or HTML."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "License"},
   :rdfs/subClassOf :gr/BusinessFunction})

(def Location
  {:db/ident :gr/Location,
   :owl/disjointWith #{:gr/WarrantyScope :gr/PaymentMethod
                       :gr/BusinessEntityType :gr/BusinessFunction
                       :gr/OpeningHoursSpecification :gr/WarrantyPromise
                       :gr/Offering :gr/TypeAndQuantityNode :gr/BusinessEntity
                       :gr/QuantitativeValue :gr/DayOfWeek
                       :gr/PriceSpecification :gr/DeliveryMethod :gr/Brand},
   :owl/equivalentClass :gr/LocationOfSalesOrServiceProvisioning,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A location is a point or area of interest from which a particular product or service is available, e.g. a store, a bus stop, a gas station, or a ticket booth. The difference to gr:BusinessEntity is that the gr:BusinessEntity is the legal entity (e.g. a person or corporation) making the offer, while gr:Location is the store, office, or place. A chain restaurant will e.g. have one legal entity but multiple restaurant locations. Locations are characterized by an address or geographical position and a set of opening hour specifications for various days of the week.\n\t\t\nExample: A rental car company may offer the Business Function Lease Out of cars from two locations, one in Fort Myers, Florida, and one in Boston, Massachussetts. Both stations are open 7:00 - 23:00 Mondays through Saturdays.\n\nNote: Typical address standards (vcard) and location data (geo, WGC84) should be attached to a gr:Location node. Since there already exist established vocabularies for this, the GoodRelations ontology does not provide respective attributes. Instead, the use of respective vocabularies is recommended. However, the gr:hasGlobalLocationNumber property is  provided for linking to public identifiers for business locations.\n\t\t\nCompatibility with schema.org: This class is equivalent to http://schema.org/Place."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Location"}})

(def LocationOfSalesOrServiceProvisioning
  {:db/ident :gr/LocationOfSalesOrServiceProvisioning,
   :owl/deprecated true,
   :owl/equivalentClass :gr/Location,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "DEPRECATED - This class is superseded by gr:Location. Replace all occurrences of gr:LocationOfSalesOrServiceProvisioning by gr:Location, if possible."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Location of sales or service provisioning (DEPRECATED)"}})

(def Maintain
  {:db/ident :gr/Maintain,
   :rdf/type :gr/BusinessFunction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This gr:BusinessFunction indicates that the gr:BusinessEntity offers (or seeks) typical maintenance tasks for the specified gr:ProductOrService. Maintenance tasks are actions that undo or compensate for wear or other deterioriation caused by regular usage, in order to restore the originally intended function of the product, or to prevent outage or malfunction."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Maintain (business function)"}})

(def MasterCard
  {:db/ident :gr/MasterCard,
   :rdf/type :gr/PaymentMethodCreditCard,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Payment by credit or debit cards issued by the MasterCard network."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MasterCard (payment method)"}})

(def Monday
  {:db/ident           :gr/Monday,
   :gr/displayPosition 1,
   :gr/hasNext         :gr/Tuesday,
   :gr/hasPrevious     :gr/Sunday,
   :rdf/type           :gr/DayOfWeek,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Monday as a day of the week."},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Monday (day of week)"}})

(def N-Ary-Relations
  {:db/ident :gr/N-Ary-Relations,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This is the superclass for all classes that are placeholders for n-ary relations, which OWL cannot represent.\nDEPRECATED. Do not use this class in data or queries."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "N-ary relations (DEPRECATED)"}})

(def Offering
  {:db/ident :gr/Offering,
   :owl/disjointWith
   #{:gr/WarrantyScope :gr/PaymentMethod :gr/BusinessEntityType
     :gr/BusinessFunction :gr/OpeningHoursSpecification :gr/WarrantyPromise
     :gr/TypeAndQuantityNode :gr/Location :gr/QualitativeValue
     :gr/BusinessEntity :gr/QuantitativeValue :gr/DayOfWeek
     :gr/PriceSpecification :gr/DeliveryMethod :gr/ProductOrService :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An offering represents the public, not necessarily binding, not necessarily exclusive, announcement by a gr:BusinessEntity to provide (or seek) a certain gr:BusinessFunction for a certain gr:ProductOrService to a specified target audience. An offering is specified by the type of product or service or bundle it refers to, what business function is being offered (sales, rental, ...), and a set of commercial properties. It can either refer to \n(1) a clearly specified instance (gr:Individual),\n(2) to a set of anonymous instances of a given type (gr:SomeItems),\n(3) a product model specification (gr:ProductOrServiceModel), see also section 3.3.3 of the GoodRelations Technical Report. \n\nAn offering may be constrained in terms of the eligible type of business partner, countries, quantities, and other commercial properties. The definition of the commercial properties, the type of product offered, and the business function are explained in other parts of this vocabulary in more detail.\n\nExample: Peter Miller offers to repair TV sets made by Siemens, Volkswagen Innsbruck sells a particular instance of a Volkswagen Golf at $10,000.\n\nCompatibility with schema.org: This class is a superclass to http://schema.org/Offer, since gr:Offering can also represent demand."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Offering"}})

(def OpeningHoursSpecification
  {:db/ident :gr/OpeningHoursSpecification,
   :owl/disjointWith #{:gr/WarrantyScope :gr/PaymentMethod
                       :gr/BusinessEntityType :gr/BusinessFunction
                       :gr/WarrantyPromise :gr/Offering :gr/TypeAndQuantityNode
                       :gr/Location :gr/BusinessEntity :gr/QuantitativeValue
                       :gr/DayOfWeek :gr/PriceSpecification :gr/DeliveryMethod
                       :gr/ProductOrService :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This is a conceptual entity that holds together all information about the opening hours on a given day (gr:DayOfWeek)."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Opening hours specification"}})

(def PartsAndLabor-BringIn
  {:db/ident :gr/PartsAndLabor-BringIn,
   :rdf/type :gr/WarrantyScope,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "In case of a defect or malfunction, the buying party has the right to transport the good to a service location determined by the the selling gr:BusinessEntity and will not be be charged for labor, parts, and materials needed to fix the problem. All those costs will be covered by the selling business entity or one of its partnering business entities.\n\nNote: This is just a rough classification for filtering offers. It is up to the buying party to check the exact scope and terms and conditions of the gr:WarrantyPromise."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Parts and labor / bring-in (warranty scope)"}})

(def PartsAndLabor-PickUp
  {:db/ident :gr/PartsAndLabor-PickUp,
   :rdf/type :gr/WarrantyScope,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "In case of a defect or malfunction, the buying party has the right to request from the selling gr:Business Entity to pick-up the good from its current location to a suitable service location, where the functionality of the good will be restored. All transportation, labor, parts, and materials needed to fix the problem will be covered by the selling business entity or one of its partnering business entities.\n  \nNote: This is just a rough classification for filtering offers. It is up to the buying party to check the exact scope and terms and conditions of the gr:WarrantyPromise."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Parts and labor / pick up (warranty scope)"}})

(def PayPal
  {:db/ident         :gr/PayPal,
   :rdf/type         :gr/PaymentMethod,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Payment via the PayPal payment service."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "PayPal (payment method)"}})

(def PaySwarm
  {:db/ident :gr/PaySwarm,
   :rdf/type :gr/PaymentMethod,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Payment via the PaySwarm distributed micropayment service."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PaySwarm (payment method)"}})

(def PaymentChargeSpecification
  {:db/ident :gr/PaymentChargeSpecification,
   :owl/disjointWith #{:gr/UnitPriceSpecification
                       :gr/DeliveryChargeSpecification},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A payment charge specification is a conceptual entity that specifies the additional costs asked for settling the payment after accepting a given gr:Offering using a particular gr:PaymentMethod. A payment charge specification is characterized by (1) a monetary amount per order specified as a literal value of type float in combination with a Currency, (2) the payment method, and (3) a whether this charge includes local sales taxes, namely VAT.\nA gr:Offering may be linked to multiple payment charge specifications that specify alternative charges for various payment methods.\n\nExamples: Payment by VISA or Mastercard costs a fee of 3 Euros including VAT, payment by bank transfer in advance is free of charge.\n\nThe total amount of this surcharge is specified as a float value of the gr:hasCurrencyValue property. The currency is specified via the gr:hasCurrency datatype property. Whether the price includes VAT or not is indicated by the gr:valueAddedTaxIncluded datatype property. The gr:PaymentMethod to which this charge applies is specified using the gr:appliesToPaymentMethod object property.\n\nIf the price can only be given as a range, use gr:hasMaxCurrencyValue and gr:hasMinCurrencyValue for the upper and lower bounds.\n\nImportant: When querying for the price, always use gr:hasMaxCurrencyValue and gr:hasMinCurrencyValue."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment charge specification"},
   :rdfs/subClassOf :gr/PriceSpecification})

(def PaymentMethod
  {:db/ident :gr/PaymentMethod,
   :owl/disjointWith #{:gr/WarrantyScope :gr/BusinessEntityType
                       :gr/BusinessFunction :gr/OpeningHoursSpecification
                       :gr/WarrantyPromise :gr/Offering :gr/TypeAndQuantityNode
                       :gr/Location :gr/BusinessEntity :gr/QuantitativeValue
                       :gr/DayOfWeek :gr/PriceSpecification :gr/DeliveryMethod
                       :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A payment method is a standardized procedure for transferring the monetary amount for a purchase. Payment methods are characterized by the legal and technical structures used, and by the organization or group carrying out the transaction. This element is mostly used for specifying the types of payment accepted by a gr:BusinessEntity.\n\nExamples: VISA, MasterCard, Diners, cash, or bank transfer in advance."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment method"}})

(def PaymentMethodCreditCard
  {:db/ident :gr/PaymentMethodCreditCard,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The subclass of gr:PaymentMethod represents all variants and brands of credit or debit cards as a standardized procedure for transferring the monetary amount for a purchase. It is mostly used for specifying the types of payment accepted by a gr:Business Entity.\n\nExamples: VISA, MasterCard, or American Express."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment method credit card"},
   :rdfs/subClassOf :gr/PaymentMethod})

(def PriceSpecification
  {:db/ident         :gr/PriceSpecification,
   :owl/disjointWith #{:gr/WarrantyScope :gr/PaymentMethod
                       :gr/BusinessEntityType :gr/BusinessFunction
                       :gr/OpeningHoursSpecification :gr/WarrantyPromise
                       :gr/Offering :gr/TypeAndQuantityNode :gr/Location
                       :gr/BusinessEntity :gr/QuantitativeValue :gr/DayOfWeek
                       :gr/DeliveryMethod :gr/ProductOrService :gr/Brand},
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The superclass of all price specifications."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Price specification"}})

(def ProductOrService
  {:db/ident :gr/ProductOrService,
   :owl/disjointWith #{:gr/WarrantyScope :gr/BusinessEntityType
                       :gr/BusinessFunction :gr/OpeningHoursSpecification
                       :gr/WarrantyPromise :gr/Offering :gr/TypeAndQuantityNode
                       :gr/QuantitativeValue :gr/DayOfWeek
                       :gr/PriceSpecification :gr/DeliveryMethod :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The superclass of all classes describing products or services types, either by nature or purpose. Examples for such subclasses are \"TV set\", \"vacuum cleaner\", etc. An instance of this class can be either an actual product or service (gr:Individual), a placeholder instance for unknown instances of a mass-produced commodity (gr:SomeItems), or a model / prototype specification (gr:ProductOrServiceModel). When in doubt, use gr:SomeItems.\n\nExamples: \na) MyCellphone123, i.e. my personal, tangible cell phone (gr:Individual)\nb) Siemens1234, i.e. the Siemens cell phone make and model 1234 (gr:ProductOrServiceModel)\nc) dummyCellPhone123 as a placeholder for actual instances of a certain kind of cell phones (gr:SomeItems)\n\t\nNote: Your first choice for specializations of gr:ProductOrService should be http://www.productontology.org.\n\nCompatibility with schema.org: This class is (approximately) equivalent to http://schema.org/Product."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Product or service"}})

(def ProductOrServiceModel
  {:db/ident :gr/ProductOrServiceModel,
   :owl/disjointWith #{:gr/Individual :gr/SomeItems :gr/BusinessEntity
                       :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A product or service model is a intangible entity that specifies some characteristics of a group of similar, usually mass-produced products, in the sense of a prototype. In case of mass-produced products, there exists a relation gr:hasMakeAndModel between the actual product or service (gr:Individual or gr:SomeItems) and the prototype (gr:ProductOrServiceModel). GoodRelations treats product or service models as \"prototypes\" instead of a completely separate kind of entities, because this allows using the same domain-specific properties (e.g. gr:weight) for describing makes and models and for describing actual products.\n\nExamples: Ford T, Volkswagen Golf, Sony Ericsson W123 cell phone\n\nNote: An actual product or service (gr:Individual) by default shares the features of its model (e.g. the weight). However, this requires non-standard reasoning. See http://wiki.goodrelations-vocabulary.org/Axioms for respective rule sets.\n\t\nCompatibility with schema.org: This class is (approximately) a subclass of http://schema.org/Product."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Product or service model"},
   :rdfs/subClassOf #{:schema/Product :gr/ProductOrService}})

(def ProductOrServicesSomeInstancesPlaceholder
  {:db/ident :gr/ProductOrServicesSomeInstancesPlaceholder,
   :owl/deprecated true,
   :owl/equivalentClass :gr/SomeItems,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "DEPRECATED - This class is superseded by gr:SomeItems. Replace all occurrences of gr:ProductOrServicesSomeInstancesPlaceholder by gr:SomeItems, if possible."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Product or services some instances placeholder (DEPRECATED)"},
   :rdfs/subClassOf :gr/ProductOrService})

(def ProvideService
  {:db/ident :gr/ProvideService,
   :rdf/type :gr/BusinessFunction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This gr:BusinessFunction indicates that the gr:BusinessEntity offers (or seeks) the respective type of service.\n\nNote: Maintain and Repair are also types of Services. However, products and services ontologies often provide classes for tangible products as well as for types of services. The business function gr:ProvideService is to be used with such goods that are services, while gr:Maintain and gr:Repair can be used with goods for which only the class of product exists in the ontology, but not the respective type of service.\n\nExample: Car maintenance could be expressed both as \"provide the service car maintenance\" or \"maintain cars\"."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Provide service (business function)"}})

(def PublicHolidays
  {:db/ident :gr/PublicHolidays,
   :gr/displayPosition 8,
   :rdf/type :gr/DayOfWeek,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A placeholder for all official public holidays at the gr:Location. This allows specifying the opening hours on public holidays. If a given day is a public holiday, this specification supersedes the opening hours for the respective day of the week."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Public holidays (day of week)"}})

(def PublicInstitution
  {:db/ident :gr/PublicInstitution,
   :rdf/type :gr/BusinessEntityType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The gr:BusinessEntityType representing such agents that are part of the adminstration or owned by the public."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Public institution (business entity type)"}})

(def QualitativeValue
  {:db/ident :gr/QualitativeValue,
   :owl/disjointWith #{:gr/Offering :gr/TypeAndQuantityNode
                       :gr/QuantitativeValue},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A qualitative value is a predefined value for a product characteristic. \n\t\nExamples: the color \"green\" or the power cord plug type \"US\"; the garment sizes \"S\", \"M\", \"L\", and \"XL\".\n\t\nNote: Value sets are supported by creating subclasses of this class. Ordinal relations between values (gr:greater, gr:lesser, ...) are provided directly by GoodRelations.\n\nCompatibility with schema.org: This class is equivalent to http://schema.org/Enumeration."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Qualitative value"}})

(def QuantitativeValue
  {:db/ident :gr/QuantitativeValue,
   :owl/disjointWith
   #{:gr/WarrantyScope :gr/PaymentMethod :gr/BusinessEntityType
     :gr/BusinessFunction :gr/OpeningHoursSpecification :gr/WarrantyPromise
     :gr/Offering :gr/TypeAndQuantityNode :gr/Location :gr/QualitativeValue
     :gr/BusinessEntity :gr/DayOfWeek :gr/PriceSpecification :gr/DeliveryMethod
     :gr/ProductOrService :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A quantitative value is a numerical interval that represents the range of a certain gr:quantitativeProductOrServiceProperty in terms of the lower and upper bounds for a particular gr:ProductOrService. It is to be interpreted in combination with the respective unit of measurement. Most quantitative values are intervals even if they are in practice often treated as a single point value.\n\t\nExample: a weight between 10 and 25 kilogramms, a length between 10 and 15 milimeters.\n\nCompatibility with schema.org: This class is equivalent to http://schema.org/Quantity."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quantitative value"}})

(def QuantitativeValueFloat
  {:db/ident :gr/QuantitativeValueFloat,
   :owl/disjointWith :gr/QuantitativeValueInteger,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of this class is an actual float value for a quantitative property of a product. This instance is usually characterized by a minimal value, a maximal value, and a unit of measurement.\n\nExamples: The intervals \"between 10.0  and 25.4 kilogramms\" or \"10.2 and 15.5 milimeters\".\n\nCompatibility with schema.org: This class is a subclass of http://schema.org/Quantity."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quantitative value float"},
   :rdfs/subClassOf :gr/QuantitativeValue})

(def QuantitativeValueInteger
  {:db/ident :gr/QuantitativeValueInteger,
   :owl/disjointWith :gr/QuantitativeValueFloat,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of this class is an actual integer value for a quantitative property of a product. This instance is usually characterized by a minimal value, a maximal value, and a unit of measurement. \n\nExample: A seating capacity between 1 and 8 persons.\n\nNote: Users must keep in mind that ranges in here mean that ALL possible values in this interval are covered. (Sometimes, the actual commitment may be less than that: \"We sell cars from 2 - 12 seats\" does often not really mean that they have cars with 2,3,4,...12 seats.). Someone renting out two types of rowing boats, one that fits for 1 or 2 people, and another that must be operated by 4 people cannot claim to rent boats with a seating capacity between 1 and 4 people. He or she is offering two boat types for 1-2 and 4 persons.\n\t\t\nCompatibility with schema.org: This class is a subclass of http://schema.org/Quantity."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quantitative value integer"},
   :rdfs/subClassOf :gr/QuantitativeValue})

(def Repair
  {:db/ident :gr/Repair,
   :rdf/type :gr/BusinessFunction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This gr:BusinessFunction indicates that the gr:BusinessEntity offers (or seeks) the evaluation of the chances for repairing, and, if positive, repair of the specified gr:ProductOrService. Repairing means actions that restore the originally intended function of a product that suffers from outage or malfunction."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Repair (business function)"}})

(def Reseller
  {:db/ident :gr/Reseller,
   :rdf/type :gr/BusinessEntityType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The gr:BusinessEntityType representing such agents that are purchasing the scope of products included in the gr:Offering for resale on the market. Resellers are also businesses, i.e., they are officially registered with the public administration and strive for profits by their activities."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reseller (business entity type)"}})

(def Saturday
  {:db/ident           :gr/Saturday,
   :gr/displayPosition 6,
   :gr/hasNext         :gr/Sunday,
   :gr/hasPrevious     :gr/Friday,
   :rdf/type           :gr/DayOfWeek,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Saturday as a day of the week."},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Saturday (day of week)"}})

(def Sell
  {:db/ident :gr/Sell,
   :rdf/type :gr/BusinessFunction,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This gr:BusinessFunction indicates that the gr:BusinessEntity offers to permanently transfer all property rights on the specified gr:ProductOrService."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sell (business function)"}})

(def SomeItems
  {:db/ident :gr/SomeItems,
   :owl/disjointWith #{:gr/ProductOrServiceModel :gr/Individual},
   :owl/equivalentClass :gr/ProductOrServicesSomeInstancesPlaceholder,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A placeholder instance for unknown instances of a mass-produced commodity. This is used as a computationally cheap work-around for such instances that are not individually exposed on the Web but just stated to exist (i.e., which are existentially quantified).\n\nExample: An instance of this class can represent an anonymous set of green Siemens1234 phones. It is different from the gr:ProductOrServiceModel Siemens1234, since this refers to the make and model, and it is different from a particular instance of this make and model (e.g. my individual phone) since the latter can be sold only once.\n\nNote: This class is the new, shorter form of the former gr:ProductOrServicesSomeInstancesPlaceholder.\n\t\t\nCompatibility with schema.org: This class is (approximately) a subclass of http://schema.org/Product."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Some items"},
   :rdfs/subClassOf #{:schema/Product :gr/ProductOrService}})

(def Sunday
  {:db/ident           :gr/Sunday,
   :gr/displayPosition 7,
   :gr/hasNext         :gr/Monday,
   :gr/hasPrevious     :gr/Saturday,
   :rdf/type           :gr/DayOfWeek,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Sunday as a day of the week."},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Sunday (day of week)"}})

(def Thursday
  {:db/ident           :gr/Thursday,
   :gr/displayPosition 4,
   :gr/hasNext         :gr/Friday,
   :gr/hasPrevious     :gr/Wednesday,
   :rdf/type           :gr/DayOfWeek,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Thursday as a day of the week."},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Thursday (day of week)"}})

(def Tuesday
  {:db/ident           :gr/Tuesday,
   :gr/displayPosition 2,
   :gr/hasNext         :gr/Wednesday,
   :gr/hasPrevious     :gr/Monday,
   :rdf/type           :gr/DayOfWeek,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Tuesday as a day of the week."},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Tuesday (day of week)"}})

(def TypeAndQuantityNode
  {:db/ident :gr/TypeAndQuantityNode,
   :owl/disjointWith
   #{:gr/WarrantyScope :gr/PaymentMethod :gr/BusinessEntityType
     :gr/BusinessFunction :gr/OpeningHoursSpecification :gr/WarrantyPromise
     :gr/Offering :gr/Location :gr/QualitativeValue :gr/BusinessEntity
     :gr/QuantitativeValue :gr/DayOfWeek :gr/PriceSpecification
     :gr/DeliveryMethod :gr/ProductOrService :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class collates all the information about a gr:ProductOrService included in a bundle. If a gr:Offering contains just one item, you can directly link from the gr:Offering to the gr:ProductOrService using gr:includes. If the offering contains multiple items, use an instance of this class for each component to indicate the quantity, unit of measurement, and type of product, and link from the gr:Offering via gr:includesObject.\n\nExample: An offering may include of 100g of Butter and 1 kg of potatoes, or 1 cell phone and 2 headsets."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Type and quantity node"}})

(def UPS
  {:db/ident         :gr/UPS,
   :rdf/type         :gr/DeliveryModeParcelService,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Delivery via the parcel service UPS."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "UPS (delivery method)"}})

(def UnitPriceSpecification
  {:db/ident :gr/UnitPriceSpecification,
   :owl/disjointWith #{:gr/PaymentChargeSpecification
                       :gr/DeliveryChargeSpecification},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A unit price specification is a conceptual entity that specifies the price asked for a given gr:Offering by the respective gr:Business Entity. An offering may be linked to multiple unit price specifications that specify alternative prices for non-overlapping sets of conditions (e.g. quantities or sales regions) or with differing validity periods. \n\nA unit price specification is characterized by (1) the lower and upper limits and the unit of measurement of the eligible quantity, (2) by a monetary amount per unit of the product or service, and (3)  whether this prices includes local sales taxes, namely VAT.\n\t\nExample: The price, including VAT, for 1 kg of a given material is 5 Euros per kg for 0 - 5 kg and 4 Euros for quantities above 5 kg.\n\nThe eligible quantity interval for a given price is specified using the object property gr:hasEligibleQuantity, which points to an instance of gr:QuantitativeValue. The currency is specified using the gr:hasCurrency property, which points to an ISO 4217 currency code. The unit of measurement for the eligible quantity is specified using the gr:hasUnitOfMeasurement datatype property, which points to an UN/CEFACT Common Code (3 characters).\n\t\nIn most cases, the appropriate unit of measurement is the UN/CEFACT Common Code \"C62\" for \"Unit or piece\", since a gr:Offering is defined by the quantity and unit of measurement of all items included (e.g. \"1 kg of bananas plus a 2 kg of apples\"). As long at the offering consists of only one item, it is also possible to use an unit of measurement of choice for specifying the price per unit. For bundles, however, only  \"C62\" for \"Unit or piece\" is a valid unit of measurement.\n\nYou can assume that the price is given per unit or piece if there is no gr:hasUnitOfMeasurement property attached to the price.\n\t\nWhether VAT and sales taxes are included in this price is specified using the property gr:valueAddedTaxIncluded (xsd:boolean).\n\t\nThe price per unit of measurement is specified as a float value of the gr:hasCurrencyValue property. The currency is specified via the gr:hasCurrency datatype property. Whether the price includes VAT or not is indicated by the gr:valueAddedTaxIncluded datatype property.\n\nThe property priceType can be used to indicate that the price is a retail price recommendation only (i.e. a list price). \n\nIf the price can only be given as a range, use gr:hasMaxCurrencyValue and gr:hasMinCurrencyValue for the upper and lower bounds.\n\nImportant: When querying for the price, always use gr:hasMaxCurrencyValue and gr:hasMinCurrencyValue.\n\nNote 1: Due to the complexity of pricing scenarios in various industries, it may be necessary to create extensions of this fundamental model of price specifications. Such can be done easily by importing and refining the GoodRelations ontology.\n\nNote 2: For Google, attaching a gr:validThrough statement to a gr:UnitPriceSpecification is mandatory. \n"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unit price specification"},
   :rdfs/subClassOf :gr/PriceSpecification})

(def VISA
  {:db/ident :gr/VISA,
   :rdf/type :gr/PaymentMethodCreditCard,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Payment by credit or debit cards issued by the VISA network."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "VISA (payment method)"}})

(def WarrantyPromise
  {:db/ident :gr/WarrantyPromise,
   :owl/disjointWith
   #{:gr/WarrantyScope :gr/PaymentMethod :gr/BusinessEntityType
     :gr/BusinessFunction :gr/OpeningHoursSpecification :gr/Offering
     :gr/TypeAndQuantityNode :gr/Location :gr/BusinessEntity
     :gr/QuantitativeValue :gr/DayOfWeek :gr/PriceSpecification
     :gr/DeliveryMethod :gr/ProductOrService :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This is a conceptual entity that holds together all aspects of the n-ary relation gr:hasWarrantyPromise.\n\nA Warranty promise is an entity representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of the gr:ProductOrService. A warranty promise is characterized by its temporal duration (usually starting with the date of purchase) and its gr:WarrantyScope. The warranty scope represents the types of services provided (e.g. labor and parts, just parts) of the warranty included in an gr:Offering. The actual services may be provided by the gr:BusinessEntity making the offering, by the manufacturer of the product, or by a third party. There may be multiple warranty promises associated with a particular offering, which differ in duration and scope (e.g. pick-up service during the first 12 months, just parts and labor for 36 months).\n\nExamples: 12 months parts and labor, 36 months parts"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Warranty promise"}})

(def WarrantyScope
  {:db/ident :gr/WarrantyScope,
   :owl/disjointWith #{:gr/PaymentMethod :gr/BusinessEntityType
                       :gr/BusinessFunction :gr/OpeningHoursSpecification
                       :gr/WarrantyPromise :gr/Offering :gr/TypeAndQuantityNode
                       :gr/Location :gr/BusinessEntity :gr/QuantitativeValue
                       :gr/DayOfWeek :gr/PriceSpecification :gr/DeliveryMethod
                       :gr/ProductOrService :gr/Brand},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The warranty scope represents types of services that will be provided free of charge by the vendor or manufacturer in the case of a defect (e.g. labor and parts, just parts), as part of the warranty included in an gr:Offering. The actual services may be provided by the gr:BusinessEntity making the offering, by the manufacturer of the product, or by a third party. \n\nExamples: Parts and Labor, Parts"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Warranty scope"}})

(def Wednesday
  {:db/ident           :gr/Wednesday,
   :gr/displayPosition 3,
   :gr/hasNext         :gr/Thursday,
   :gr/hasPrevious     :gr/Tuesday,
   :rdf/type           :gr/DayOfWeek,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Wednesday as a day of the week."},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Wednesday (day of week)"}})

(def acceptedPaymentMethods
  {:db/ident :gr/acceptedPaymentMethods,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The gr:PaymentMethod or methods accepted by the gr:BusinessEntity for the given gr:Offering."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accepted payment methods (0..*)"},
   :rdfs/range :gr/PaymentMethod})

(def addOn
  {:db/ident :gr/addOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property points from a gr:Offering to additional offerings that can only be obtained in combination with the first offering. This can be used to model supplements and extensions that are available for a surcharge. Any gr:PriceSpecification attached to the secondary offering is to be understood as an additional charge."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "add-on (0..*)"},
   :rdfs/range :gr/Offering})

(def advanceBookingRequirement
  {:db/ident :gr/advanceBookingRequirement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The minimal and maximal amount of time that is required between accepting the gr:Offering and the actual usage of the resource or service. This is mostly relevant for offers regarding hotel rooms, the rental of objects, or the provisioning of services. The duration is specified relatively to the beginning of the usage of the contracted object. It is represented by attaching an instance of the class gr:QuantitativeValueInteger. The lower and upper boundaries are specified using the properties gr:hasMinValueInteger and gr:hasMaxValueInteger to that instance. The unit of measurement is specified using the property gr:hasUnitOfMeasurement with a string holding a UN/CEFACT code suitable for durations, e.g. MON (months), DAY (days), HUR (hours), or MIN (minutes).\n\nThe difference to the gr:validFrom and gr:validThrough properties is that those specify the interval during which the gr:Offering is valid, while gr:advanceBookingRequirement specifies the acceptable relative amount of time between accepting the offer and the fulfilment or usage."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "advance booking requirement (0..1)"},
   :rdfs/range :gr/QuantitativeValueInteger})

(def amountOfThisGood
  {:db/ident :gr/amountOfThisGood,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the quantity of the goods included in the gr:Offering via this gr:TypeAndQuantityNode. The quantity is given in the unit of measurement attached to the gr:TypeAndQuantityNode."},
   :rdfs/domain :gr/TypeAndQuantityNode,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "amount of this good (1..1)"},
   :rdfs/range :xsd/float})

(def appliesToDeliveryMethod
  {:db/ident :gr/appliesToDeliveryMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the gr:DeliveryMethod to which the gr:DeliveryChargeSpecification applies."},
   :rdfs/domain :gr/DeliveryChargeSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "applies to delivery method (0..*)"},
   :rdfs/range :gr/DeliveryMethod})

(def appliesToPaymentMethod
  {:db/ident :gr/appliesToPaymentMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the gr:PaymentMethod to which the gr:PaymentChargeSpecification applies."},
   :rdfs/domain :gr/PaymentChargeSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "applies to payment method (1..*)"},
   :rdfs/range :gr/PaymentMethod})

(def availabilityEnds
  {:db/ident :gr/availabilityEnds,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the end of the availability of the gr:ProductOrService included in the gr:Offering.\nThe difference to the properties gr:validFrom and gr:validThrough is that those specify the period of time during which the offer is valid and can be accepted.\n\nExample: I offer to lease my boat for the period of August 1 - August 31, 2010, but you must accept by offer no later than July 15.\n\nA time-zone should be specified. For a time in GMT/UTC, simply add a \"Z\" following the time:\n\n2008-05-30T09:30:10Z.\n\nAlternatively, you can specify an offset from the UTC time by adding a positive or negative time following the time:\n\n2008-05-30T09:30:10-09:00\n\nor\n\n2008-05-30T09:30:10+09:00.\n\nNote: There is another property gr:availableAtOrFrom, which is used to indicate the gr:Location (e.g. store or shop) from which the goods would be available."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "availability ends (0..1)"},
   :rdfs/range :xsd/dateTime})

(def availabilityStarts
  {:db/ident :gr/availabilityStarts,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the beginning of the availability of the gr:ProductOrService included in the gr:Offering.\nThe difference to the properties gr:validFrom and gr:validThrough is that those specify the period of time during which the offer is valid and can be accepted.\n\nExample: I offer to lease my boat for the period of August 1 - August 31, 2010, but you must accept by offer no later than July 15.\n\nA time-zone should be specified. For a time in GMT/UTC, simply add a \"Z\" following the time:\n\n2008-05-30T09:30:10Z.\n\nAlternatively, you can specify an offset from the UTC time by adding a positive or negative time following the time:\n\n2008-05-30T09:30:10-09:00\n\nor\n\n2008-05-30T09:30:10+09:00.\n\nNote: There is another property gr:availableAtOrFrom, which is used to indicate the gr:Location (e.g. store or shop) from which the goods would be available."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "availability starts (0..1)"},
   :rdfs/range :xsd/dateTime})

(def availableAtOrFrom
  {:db/ident :gr/availableAtOrFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This states that a particular gr:Offering is available at or from the given gr:Location (e.g. shop or branch)."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "available at or from (0..*)"},
   :rdfs/range :gr/Location})

(def availableDeliveryMethods
  {:db/ident :gr/availableDeliveryMethods,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This specifies the gr:DeliveryMethod or methods available for a given gr:Offering."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "available delivery methods (0..*)"},
   :rdfs/range :gr/DeliveryMethod})

(def billingIncrement
  {:db/ident :gr/billingIncrement,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the minimal quantity and rounding increment that will be the basis for the billing. \nThe unit of measurement is specified by the UN/CEFACT code attached to the gr:UnitPriceSpecification via the gr:hasUnitOfMeasurement property.\n\nExamples: \n- The price for gasoline is 4 USD per gallon at the pump, but you will be charged in units of 0.1 gallons.\n- The price for legal consulting is 100 USD per hour, but you will be charged in units of 15 minutes.\n\nThis property makes sense only for instances of gr:Offering that include not more than one type of good or service."},
   :rdfs/domain :gr/UnitPriceSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "billing increment (0..1)"},
   :rdfs/range :xsd/float})

(def category
  {:db/ident :gr/category,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The name of a category to which this gr:ProductOrService, gr:Offering, gr:BusinessEntity, or gr:Location belongs.\n\t\nNote 1: For products, it is better to add an rdf:type statement referring to a GoodRelations-compliant ontology for vertical industries instead, but if you just have a short text label, gr:category is simpler.\nNote 2: You can use greater signs or slashes to informally indicate a category hierarchy, e.g. \"restaurants/asian_restaurants\" or \"cables > usb_cables\"\n"},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService
                               :gr/Offering
                               :gr/Location
                               :gr/BusinessEntity
                               :schema/Offer
                               :schema/Product
                               :schema/Place
                               :schema/Organization],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "category (0..*)"},
   :rdfs/range :rdfs/Literal})

(def closes
  {:db/ident :gr/closes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The closing  hour of the gr:Location on the given gr:DayOfWeek.\nIf no time-zone suffix is included, the time is given in the local time valid at the gr:Location.\n\nFor a time in GMT/UTC, simply add a \"Z\" following the time:\n\n09:30:10Z.\n\nAlternatively, you can specify an offset from the UTC time by adding a positive or negative time following the time:\n\n09:30:10-09:00\n\n09:30:10+09:00.\n\nNote 1: Use 00:00:00 for the first second of the respective day and 23:59:59 for the last second of that day.\nNote 2: If a store opens at 17:00 on Saturdays and closes at 03:00:00 a.m. next morning, use two instances of this class, one with 17:00:00 - 23:59:59 for Saturday and another one with 00:00:00 - 03:00:00 for Sunday.\nNote 3: If the shop re-opens on the same day of the week or set of days of the week, you must create a second instance of gr:OpeningHoursSpecification."},
   :rdfs/domain :gr/OpeningHoursSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "closes (1..1)"},
   :rdfs/range :xsd/time})

(def color
  {:db/ident           :gr/color,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "The color of the product."},
   :rdfs/domain        {:owl/unionOf [:gr/ProductOrService :schema/Product],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "color (0..1)"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :gr/datatypeProductOrServiceProperty})

(def condition
  {:db/ident :gr/condition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A textual description of the condition of the product or service, or the products or services included in the offer (when attached to a gr:Offering)"},
   :rdfs/domain
   {:owl/unionOf [:gr/Offering :gr/ProductOrService :schema/Product],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "condition (0..1)"},
   :rdfs/range :rdfs/Literal})

(def datatypeProductOrServiceProperty
  {:db/ident :gr/datatypeProductOrServiceProperty,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property is the super property for all pure datatype properties that can be used to describe a gr:ProductOrService.\n\nIn products and services ontologies, only such properties that are no quantitative properties and that have no predefined gr:QualitativeValue instances are subproperties of this property. In practice, this refers to a few integer properties for which the integer value represents qualitative aspects, for string datatypes (as long as no predefined values exist), for boolean datatype properties, and for dates and times."},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "datatype product or service property (0..*)"},
   :rdfs/range :rdfs/Literal})

(def deliveryLeadTime
  {:db/ident :gr/deliveryLeadTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property can be used to indicate the promised delay between the receipt of the order and the goods leaving the warehouse.\n\nThe duration is specified by attaching an instance of gr:QuantitativeValueInteger. The lower and upper boundaries are specified using the properties gr:hasMinValueInteger and gr:hasMaxValueInteger to that instance. A point value can be modeled with the gr:hasValueInteger property. The unit of measurement is specified using the property gr:hasUnitOfMeasurement with a string holding a UN/CEFACT code suitable for durations, e.g. MON (months), DAY (days), HUR (hours), or MIN (minutes)."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "delivery lead time (0..1)"},
   :rdfs/range :gr/QuantitativeValueInteger})

(def depth
  {:db/ident :gr/depth,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The depth of the product.\nTypical unit code(s): CMT for centimeters, INH for inches"},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "depth (0..1)"},
   :rdfs/range :gr/QuantitativeValue,
   :rdfs/subPropertyOf :gr/quantitativeProductOrServiceProperty})

(def description
  {:db/ident :gr/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A short textual description of the resource. \n\nThis property is semantically equivalent to rdfs:comment and just meant as a handy shortcut for marking up data."},
   :rdfs/domain {:owl/unionOf [:owl/Thing
                               :gr/Brand
                               :gr/BusinessEntity
                               :gr/BusinessEntityType
                               :gr/BusinessFunction
                               :gr/DayOfWeek
                               :gr/DeliveryChargeSpecification
                               :gr/DeliveryMethod
                               :gr/DeliveryModeParcelService
                               :gr/Individual
                               :gr/Location
                               :gr/Offering
                               :gr/OpeningHoursSpecification
                               :gr/PaymentChargeSpecification
                               :gr/PaymentMethod
                               :gr/PaymentMethodCreditCard
                               :gr/PriceSpecification
                               :gr/ProductOrService
                               :gr/ProductOrServiceModel
                               :gr/QualitativeValue
                               :gr/QuantitativeValue
                               :gr/QuantitativeValueFloat
                               :gr/QuantitativeValueInteger
                               :gr/SomeItems
                               :gr/TypeAndQuantityNode
                               :gr/UnitPriceSpecification
                               :gr/WarrantyPromise
                               :gr/WarrantyScope],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "description (0..1)"},
   :rdfs/range :rdfs/Literal})

(def displayPosition
  {:db/ident :gr/displayPosition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The position at which the option or element should be listed in a menu or user dialog, lower numbers come first.\n\nThe main usage of this property are the days of the week (gr:DayOfWeek), but it is also possible to apply it e.g. to product features or any other conceptual element.\nNote: Rely on this property only for data originating from a single RDF graph; otherwise, unpredictable results are possible."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "display position (0..1)"}})

(def durationOfWarrantyInMonths
  {:db/ident :gr/durationOfWarrantyInMonths,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the duration of the gr:WarrantyPromise in months."},
   :rdfs/domain :gr/WarrantyPromise,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "duration of warranty in months (0..1)"},
   :rdfs/range :xsd/int})

(def eligibleCustomerTypes
  {:db/ident :gr/eligibleCustomerTypes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The types of customers (gr:BusinessEntityType) for which the given gr:Offering is valid."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "eligible customer types (0..*)"},
   :rdfs/range :gr/BusinessEntityType})

(def eligibleDuration
  {:db/ident :gr/eligibleDuration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The minimal and maximal duration for which the given gr:Offering or gr:License is valid. This is mostly used for offers regarding accommodation, the rental of objects, or software licenses. The duration is specified by attaching an instance of gr:QuantitativeValue. The lower and upper boundaries are specified using the properties gr:hasMinValue and gr:hasMaxValue to that instance. If they are the same, use the gr:hasValue property. The unit of measurement is specified using the property gr:hasUnitOfMeasurement with a string holding a UN/CEFACT code suitable for durations, e.g. MON (months), DAY (days), HUR (hours), or MIN (minutes).\n\nThe difference to the gr:validFrom and gr:validThrough properties is that those specify the absiolute interval during which the gr:Offering or gr:License is valid, while gr:eligibleDuration specifies the acceptable duration of the contract or usage."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :gr/License :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "eligible duration (0..1)"},
   :rdfs/range :gr/QuantitativeValue})

(def eligibleRegions
  {:db/ident :gr/eligibleRegions,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the geo-political region or regions for which the gr:Offering, gr:License, or gr:DeliveryChargeSpecification is valid using the two-character version of ISO 3166-1 (ISO 3166-1 alpha-2)  for regions or ISO 3166-2 , which breaks down the countries from ISO 3166-1 into administrative subdivisions.\n\nImportant: Do NOT use 3-letter ISO 3166-1 codes!"},
   :rdfs/domain {:owl/unionOf [:gr/DeliveryChargeSpecification
                               :gr/Offering
                               :gr/License
                               :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "eligible regions (0..*)"},
   :rdfs/range :xsd/string})

(def eligibleTransactionVolume
  {:db/ident :gr/eligibleTransactionVolume,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property can be used to indicate the transaction volume, in a monetary unit, for which the gr:Offering or gr:PriceSpecification is valid. This is mostly used to specify a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases above a certain amount.\n\nThe object is a gr:PriceSpecification that uses the properties gr:hasMaxCurrencyValue and gr:hasMinCurrencyValue to indicate the lower and upper boundaries and gr:hasCurrency to indicate the currency using the ISO 4217 standard (3 characters)."},
   :rdfs/domain
   {:owl/unionOf [:gr/Offering :gr/PriceSpecification :schema/Offer],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "eligible transaction volume (0..1)"},
   :rdfs/range :gr/PriceSpecification})

(def equal
  {:db/ident :gr/equal,
   :rdf/type #{:owl/SymmetricProperty :owl/TransitiveProperty
               :owl/ObjectProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ordering relation for qualitative values indicates that the subject is equal to the object."},
   :rdfs/domain :gr/QualitativeValue,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equal (0..*)"},
   :rdfs/range :gr/QualitativeValue})

(def greater
  {:db/ident :gr/greater,
   :owl/inverseOf :gr/lesser,
   :rdf/type #{:owl/TransitiveProperty :owl/ObjectProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ordering relation for qualitative values indicates that the subject is greater than the object."},
   :rdfs/domain :gr/QualitativeValue,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "greater (0..*)"},
   :rdfs/range :gr/QualitativeValue})

(def greaterOrEqual
  {:db/ident :gr/greaterOrEqual,
   :owl/inverseOf :gr/lesserOrEqual,
   :rdf/type #{:owl/TransitiveProperty :owl/ObjectProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ordering relation for qualitative values indicates that the subject is greater than or equal to the object."},
   :rdfs/domain :gr/QualitativeValue,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "greater or equal (0..*)"},
   :rdfs/range :gr/QualitativeValue})

(def hasBrand
  {:db/ident :gr/hasBrand,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This specifies the brand or brands (gr:Brand) associated with a gr:ProductOrService, or the brand or brands maintained by a gr:BusinessEntity."},
   :rdfs/domain {:owl/unionOf [:gr/BusinessEntity
                               :gr/ProductOrService
                               :schema/Organization
                               :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has brand (0..*)"},
   :rdfs/range :gr/Brand})

(def hasBusinessFunction
  {:db/ident :gr/hasBusinessFunction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This specifies the business function of the gr:Offering, i.e. whether the gr:BusinessEntity is offering to sell, to lease, or to repair the particular type of product. In the case of bundles, it is also possible to attach individual business functions to each gr:TypeAndQuantityNode. The business function of the main gr:Offering determines the business function for all included objects or services, unless a business function attached to a gr:TypeAndQuantityNode overrides it.\n\t\nNote: While it is possible that an entity is offering multiple types of business functions for the same set of objects (e.g. rental and sales), this should usually not be stated by attaching multiple business functions to the same gr:Offering, since the gr:UnitPriceSpecification for the varying business functions will typically be very different."},
   :rdfs/domain
   {:owl/unionOf [:gr/Offering :gr/TypeAndQuantityNode :schema/Offer],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has business function (1..*)"},
   :rdfs/range :gr/BusinessFunction})

(def hasCurrency
  {:db/ident :gr/hasCurrency,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The currency for all prices in the gr:PriceSpecification given using the ISO 4217 standard (3 characters)."},
   :rdfs/domain :gr/PriceSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has currency (1..1)"},
   :rdfs/range :xsd/string})

(def hasCurrencyValue
  {:db/ident :gr/hasCurrencyValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the amount of money for a price per unit, shipping charges, or payment charges. The currency and other relevant details are attached to the respective gr:PriceSpecification etc.\n\nFor a gr:UnitPriceSpecification, this is the price for one unit or bundle (as specified in the unit of measurement of the unit price specification) of the respective gr:ProductOrService. For a gr:DeliveryChargeSpecification or a gr:PaymentChargeSpecification, it is the price per delivery or payment.\n\nGoodRelations also supports giving price information as intervals only. If this is needed, use gr:hasMaxCurrencyValue for the upper bound and gr:hasMinCurrencyValue for the lower bound. \n\nUsing gr:hasCurrencyValue sets the upper and lower bounds to the same given value, i.e., x gr:hasCurrencyValue y implies x gr:hasMinCurrencyValue y, x gr:hasMaxCurrencyValue y."},
   :rdfs/domain :gr/PriceSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has currency value (0..1)"},
   :rdfs/range :xsd/float,
   :rdfs/subPropertyOf #{:gr/hasMinCurrencyValue :gr/hasMaxCurrencyValue}})

(def hasDUNS
  {:db/ident :gr/hasDUNS,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Dun & Bradstreet DUNS number for identifying a gr:BusinessEntity. The Dun & Bradstreet DUNS is a nine-digit number used to identify legal entities (but usually not branches or locations of logistical importance only)."},
   :rdfs/domain {:owl/unionOf [:gr/BusinessEntity :schema/Organization],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has DUNS (0..1)"},
   :rdfs/range :xsd/string})

(def hasEAN_UCC-13
  {:db/ident :gr/hasEAN_UCC-13,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The EAN·UCC-13 code of the given gr:ProductOrService or gr:Offering. This code is now officially called GTIN-13 (Global Trade Identifier Number) or EAN·UCC-13. Former 12-digit UPC codes can be converted into EAN·UCC-13 code by simply adding a preceeding zero.\n\nNote 1: When using this property for searching by 12-digit UPC codes, you must add a preceeding zero digit.\nNote 2: As of January 1, 2007, the former ISBN numbers for books etc. have been integrated into the EAN·UCC-13 code. For each old ISBN-10 code, there exists a proper translation into EAN·UCC-13 by adding \"978\" or \"979\" as prefix. Since the old ISBN-10 is now deprecated, GoodRelations does not provide a property for ISBNs."},
   :rdfs/domain
   {:owl/unionOf [:gr/Offering :gr/ProductOrService :schema/Product],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has EAN/UCC-13 (0..*)"},
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/productID})

(def hasEligibleQuantity
  {:db/ident :gr/hasEligibleQuantity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This specifies the interval and unit of measurement of ordering quantities for which the gr:Offering or gr:PriceSpecification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.\nNote that if an offering is a bundle, i.e. it consists of more than one unit of a single type of good, or if the unit of measurement for the good is different from unit (Common Code C62), then gr:hasEligibleQuantity refers to units of this bundle. In other words, \"C62\" for \"Units or pieces\" is usually the appropriate unit of measurement."},
   :rdfs/domain
   {:owl/unionOf [:gr/Offering :gr/PriceSpecification :schema/Offer],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has eligible quantity (0..1)"},
   :rdfs/range :gr/QuantitativeValue})

(def hasGTIN-14
  {:db/ident :gr/hasGTIN-14,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Global Trade Item Number (GTIN-14) of the given gr:ProductOrService or gr:Offering."},
   :rdfs/domain
   {:owl/unionOf [:gr/Offering :gr/ProductOrService :schema/Product],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has GTIN-14 (0..*)"},
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/productID})

(def hasGTIN-8
  {:db/ident :gr/hasGTIN-8,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The 8-digit Global Trade Item Number (GTIN-8) of the given gr:ProductOrService or gr:Offering, also known as EAN/UCC-8 (8-digit EAN)."},
   :rdfs/domain
   {:owl/unionOf [:gr/Offering :gr/ProductOrService :schema/Product],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has GTIN-8 (0..*)"},
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/productID})

(def hasGlobalLocationNumber
  {:db/ident :gr/hasGlobalLocationNumber,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Global Location Number (GLN, sometimes also referred to as International Location Number or ILN) of the respective gr:BusinessEntity or gr:Location.\nThe Global Location Number is a thirteen-digit number used to identify parties and physical locations."},
   :rdfs/domain {:owl/unionOf [:gr/BusinessEntity
                               :gr/Location
                               :schema/Place
                               :schema/Organization],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has Global Location Number (0..1)"},
   :rdfs/range :xsd/string})

(def hasISICv4
  {:db/ident :gr/hasISICv4,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular gr:BusinessEntity or gr:Location. See http://unstats.un.org/unsd/cr/registry/isic-4.asp for more information.\n\nNote: While ISIC codes are sometimes misused for classifying products or services, they are designed and suited only for classifying business establishments."},
   :rdfs/domain {:owl/unionOf [:gr/BusinessEntity
                               :gr/Location
                               :schema/Organization
                               :schema/Place],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has ISIC v4 (0..*)"},
   :rdfs/range :xsd/int})

(def hasInventoryLevel
  {:db/ident :gr/hasInventoryLevel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the current approximate inventory level for gr:SomeItems. The unit of measurement and the point value or interval are indicated using the attached gr:QuantitativeValueFloat instance.\n\nThis property can also be attached to a gr:Offering in cases where the included products are not modeled in more detail."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :gr/SomeItems :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has inventory level (0..1)"},
   :rdfs/range :gr/QuantitativeValueFloat})

(def hasMPN
  {:db/ident :gr/hasMPN,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Manufacturer Part Number or MPN is a unique identifier for a product, service, or bundle from the perspective of a particular manufacturer. MPNs can be assigned to products or product datasheets, or bundles. Accordingly, the domain of this property is the union of gr:ProductOrService (the common superclass of goods and datasheets), and gr:Offering.\n\nImportant: Be careful when assuming two products or services instances or offering instances to be identical based on the MPN. Since MPNs are unique only for the same gr:BusinessEntity, this holds only when the two MPN values refer to the same gr:BusinessEntity. Such can be done by taking into account the provenance of the data. \n\nUsually, the properties gr:hasEAN_UCC-13 and gr:hasGTIN-14 are much more reliable identifiers, because they are globally unique.\n\nSee also http://en.wikipedia.org/wiki/Part_number"},
   :rdfs/domain
   {:owl/unionOf [:gr/Offering :gr/ProductOrService :schema/Product],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has MPN (0..*)"},
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/productID})

(def hasMakeAndModel
  {:db/ident :gr/hasMakeAndModel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This states that an actual product instance (gr:Individual) or a placeholder instance for multiple, unidentified such instances (gr:SomeItems) is one occurence of a particular gr:ProductOrServiceModel.\n\nExample: myFordT hasMakeAndModel FordT."},
   :rdfs/domain {:owl/unionOf [:gr/Individual :gr/SomeItems :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has make and model (0..1)"},
   :rdfs/range :gr/ProductOrServiceModel})

(def hasManufacturer
  {:db/ident :gr/hasManufacturer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This object property links a gr:ProductOrService to the gr:BusinessEntity that produces it. Mostly used with gr:ProductOrServiceModel."},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has manufacturer (0..1)"},
   :rdfs/range :gr/BusinessEntity})

(def hasMaxCurrencyValue
  {:db/ident :gr/hasMaxCurrencyValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the UPPER BOUND of the amount of money for a price RANGE per unit, shipping charges, or payment charges. The currency and other relevant details are attached to the respective gr:PriceSpecification etc.\nFor a gr:UnitPriceSpecification, this is the UPPER BOUND for the price for one unit or bundle (as specified in the unit of measurement of the unit price specification) of the respective gr:ProductOrService. For a gr:DeliveryChargeSpecification or a gr:PaymentChargeSpecification, it is the UPPER BOUND of the price per delivery or payment.\n\nUsing gr:hasCurrencyValue sets the upper and lower bounds to the same given value, i.e., x gr:hasCurrencyValue y implies x gr:hasMinCurrencyValue y, x gr:hasMaxCurrencyValue y."},
   :rdfs/domain :gr/PriceSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has max currency value (1..1)"},
   :rdfs/range :xsd/float})

(def hasMaxValue
  {:db/ident :gr/hasMaxValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property captures the upper limit of a gr:QuantitativeValue instance."},
   :rdfs/domain :gr/QuantitativeValue,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has max value (0..1)"},
   :rdfs/range :rdfs/Literal})

(def hasMaxValueFloat
  {:db/ident :gr/hasMaxValueFloat,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property captures the upper limit of a gr:QuantitativeValueFloat instance."},
   :rdfs/domain :gr/QuantitativeValueFloat,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has max value float (1..1)"},
   :rdfs/range :xsd/float,
   :rdfs/subPropertyOf :gr/hasMaxValue})

(def hasMaxValueInteger
  {:db/ident :gr/hasMaxValueInteger,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property captures the upper limit of a gr:QuantitativeValueInteger instance."},
   :rdfs/domain :gr/QuantitativeValueInteger,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has max value integer (1..1)"},
   :rdfs/range :xsd/int,
   :rdfs/subPropertyOf :gr/hasMaxValue})

(def hasMinCurrencyValue
  {:db/ident :gr/hasMinCurrencyValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the LOWER BOUND of the amount of money for a price RANGE per unit, shipping charges, or payment charges. The currency and other relevant details are attached to the respective gr:PriceSpecification etc.\nFor a gr:UnitPriceSpecification, this is the LOWER BOUND for the price for one unit or bundle (as specified in the unit of measurement of the unit price specification) of the respective gr:ProductOrService. For a gr:DeliveryChargeSpecification or a gr:PaymentChargeSpecification, it is the LOWER BOUND of the price per delivery or payment.\n\nUsing gr:hasCurrencyValue sets the upper and lower bounds to the same given value, i.e., x gr:hasCurrencyValue y implies x gr:hasMinCurrencyValue y, x gr:hasMaxCurrencyValue y."},
   :rdfs/domain :gr/PriceSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has min currency value (1..1)"},
   :rdfs/range :xsd/float})

(def hasMinValue
  {:db/ident :gr/hasMinValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property captures the lower limit of a gr:QuantitativeValue instance."},
   :rdfs/domain :gr/QuantitativeValue,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has min value (0..1)"},
   :rdfs/range :rdfs/Literal})

(def hasMinValueFloat
  {:db/ident :gr/hasMinValueFloat,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property captures the lower limit of a gr:QuantitativeValueFloat instance."},
   :rdfs/domain :gr/QuantitativeValueFloat,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has min value float (1..1)"},
   :rdfs/range :xsd/float,
   :rdfs/subPropertyOf :gr/hasMinValue})

(def hasMinValueInteger
  {:db/ident :gr/hasMinValueInteger,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property captures the lower limit of a gr:QuantitativeValueInteger instance."},
   :rdfs/domain :gr/QuantitativeValueInteger,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has min value integer (1..1)"},
   :rdfs/range :xsd/int,
   :rdfs/subPropertyOf :gr/hasMinValue})

(def hasNAICS
  {:db/ident :gr/hasNAICS,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The North American Industry Classification System (NAICS) code for a particular gr:BusinessEntity.\nSee http://www.census.gov/eos/www/naics/ for more details.\n\nNote: While NAICS codes are sometimes misused for classifying products or services, they are designed and suited only for classifying business establishments."},
   :rdfs/domain {:owl/unionOf [:gr/BusinessEntity :schema/Organization],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has NAICS (0..*)"},
   :rdfs/range :xsd/int})

(def hasNext
  {:db/ident :gr/hasNext,
   :owl/inverseOf :gr/hasPrevious,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ordering relation for gr:DayOfWeek indicates that the subject is directly followed by the object.\n\nExample: Monday hasNext Tuesday\n\nSince days of the week are a cycle, this property is not transitive."},
   :rdfs/domain :gr/DayOfWeek,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has next (0..1)"},
   :rdfs/range :gr/DayOfWeek})

(def hasOpeningHoursDayOfWeek
  {:db/ident :gr/hasOpeningHoursDayOfWeek,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This specifies the gr:DayOfWeek to which the gr:OpeningHoursSpecification is related.\n\nNote: Use multiple instances of gr:OpeningHoursSpecification for specifying the opening hours for multiple days if the opening hours differ."},
   :rdfs/domain :gr/OpeningHoursSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has opening hours day of week (1..*)"},
   :rdfs/range :gr/DayOfWeek})

(def hasOpeningHoursSpecification
  {:db/ident :gr/hasOpeningHoursSpecification,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property links a gr:Location to a gr:OpeningHoursSpecification."},
   :rdfs/domain {:owl/unionOf [:gr/Location :schema/Place],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has opening hours specification (0..*)"},
   :rdfs/range :gr/OpeningHoursSpecification})

(def hasPOS
  {:db/ident :gr/hasPOS,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property states that the respective gr:Location is a point of sale for the respective gr:BusinessEntity. It allows linking those two types of entities without the need for a particular gr:Offering."},
   :rdfs/domain {:owl/unionOf [:gr/BusinessEntity :schema/Organization],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has POS (0..*)"},
   :rdfs/range :gr/Location})

(def hasPrevious
  {:db/ident :gr/hasPrevious,
   :owl/inverseOf :gr/hasNext,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ordering relation for gr:DayOfWeek indicates that the subject is directly preceeded by the object.\n\nExample: Tuesday hasPrevious Monday\n\nSince days of the week are a cycle, this property is not transitive."},
   :rdfs/domain :gr/DayOfWeek,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has previous (0..1)"},
   :rdfs/range :gr/DayOfWeek})

(def hasPriceSpecification
  {:db/ident :gr/hasPriceSpecification,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This links a gr:Offering to a gr:PriceSpecification or specifications. There can be unit price specifications, payment charge specifications, and delivery charge specifications. For each type, multiple specifications for the same gr:Offering are possible, e.g. for different quantity ranges or for different currencies, or for different combinations of gr:DeliveryMethod and target destinations.\n\nRecommended retail prices etc. can be marked by the gr:priceType property of the gr:UnitPriceSpecification."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has price specification (0..*)"},
   :rdfs/range :gr/PriceSpecification})

(def hasStockKeepingUnit
  {:db/ident :gr/hasStockKeepingUnit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Stock Keeping Unit, or SKU is a unique identifier for a product, service, or bundle from the perspective of a particular supplier, i.e. SKUs are mostly assigned and serialized at the merchant level. \nExamples of SKUs are the ordering or parts numbers used by a particular Web shop or catalog.\n\nConsequently, the domain of gr:hasStockKeepingUnit is the union of the classes gr:Offering and gr:ProductOrService. \nIf attached to a gr:Offering, the SKU will usually reflect a merchant-specific identifier, i.e. one valid only for that particular retailer or shop. \nIf attached to a gr:ProductOrServiceModel, the SKU can reflect either the identifier used by the merchant or the part number used by the official manufacturer of that part. For the latter, gr:hasMPN is a better choice.\n\nImportant: Be careful when assuming two products or services instances or offering instances to be identical based on the SKU. Since SKUs are unique only for the same gr:BusinessEntity, this can be assumed only when you are sure that the two SKU values refer to the same business entity. Such can be done by taking into account the provenance of the data. As long as instances of gr:Offering are concerned, you can also check that the offerings are being offered by the same gr:Business Entity.\n\nUsually, the properties gr:hasEAN_UCC-13 and gr:hasGTIN-14 are much more reliable identifiers, because they are globally unique.\n\nSee also http://en.wikipedia.org/wiki/Stock_Keeping_Unit."},
   :rdfs/domain {:owl/unionOf [:gr/Offering
                               :gr/ProductOrService
                               :schema/Offer
                               :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has Stock Keeping Unit (0..*)"},
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/productID})

(def hasUnitOfMeasurement
  {:db/ident :gr/hasUnitOfMeasurement,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The unit of measurement for a gr:QuantitativeValue, a gr:UnitPriceSpecification, or a gr:TypeAndQuantityNode given using the UN/CEFACT Common Code (3 characters)."},
   :rdfs/domain {:owl/unionOf [:gr/QuantitativeValue
                               :gr/TypeAndQuantityNode
                               :gr/UnitPriceSpecification],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has unit of measurement (1..1)"},
   :rdfs/range :xsd/string})

(def hasValue
  {:db/ident :gr/hasValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This subproperty specifies that the upper and lower limit of the given gr:QuantitativeValue are identical and have the respective value. It is a shortcut for such cases where a quantitative property is (at least practically) a single point value and not an interval."},
   :rdfs/domain :gr/QuantitativeValue,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has value (0..1)"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf #{:gr/hasMaxValue :gr/hasMinValue}})

(def hasValueFloat
  {:db/ident :gr/hasValueFloat,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This subproperty specifies that the upper and lower limit of the given gr:QuantitativeValueFloat are identical and have the respective float value. It is a shortcut for such cases where a quantitative property is (at least practically) a single point value and not an interval."},
   :rdfs/domain :gr/QuantitativeValueFloat,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has value float (0..1)"},
   :rdfs/range :xsd/float,
   :rdfs/subPropertyOf #{:gr/hasMaxValueFloat :gr/hasMinValueFloat}})

(def hasValueInteger
  {:db/ident :gr/hasValueInteger,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This subproperty specifies that the upper and lower limit of the given gr:QuantitativeValueInteger are identical and have the respective integer value. It is a shortcut for such cases where a quantitative property is (at least practically) a single point value and not an interval."},
   :rdfs/domain :gr/QuantitativeValueInteger,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has value integer (0..1)"},
   :rdfs/range :xsd/int,
   :rdfs/subPropertyOf #{:gr/hasMinValueInteger :gr/hasMaxValueInteger}})

(def hasWarrantyPromise
  {:db/ident :gr/hasWarrantyPromise,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This specifies the gr:WarrantyPromise made by the gr:BusinessEntity for the given gr:Offering."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has warranty promise (0..*)"},
   :rdfs/range :gr/WarrantyPromise})

(def hasWarrantyScope
  {:db/ident :gr/hasWarrantyScope,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This states the gr:WarrantyScope of a given gr:WarrantyPromise."},
   :rdfs/domain :gr/WarrantyPromise,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has warranty scope (0..1)"},
   :rdfs/range :gr/WarrantyScope})

(def height
  {:db/ident :gr/height,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The height of the product.\nTypical unit code(s): CMT for centimeters, INH for inches"},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "height (0..1)"},
   :rdfs/range :gr/QuantitativeValue,
   :rdfs/subPropertyOf :gr/quantitativeProductOrServiceProperty})

(def includes
  {:db/ident :gr/includes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This object property is a shortcut for the original gr:includesObject property for the common case of having exactly one single gr:ProductOrService instance included in an Offering. \n\nWhen linking to an instance of gr:SomeItems or gr:Individual, it is equivalent to using a gr:TypeAndQuantityNode with gr:hasUnitOfMeasurement=\"C62\"^^xsd:string and gr:amountOfThisGood=\"1.0\"^^xsd:float for that good.\n\nWhen linking to a gr:ProductOrServiceModel, it is equivalent to \n1. defining an blank node for a gr:SomeItems\n2. linking that blank node via gr:hasMakeAndModel to the gr:ProductOrServiceModel, and\n3. linking from the gr:Offering to that blank node using another blank node of type gr:TypeAndQuantityNode with gr:hasUnitOfMeasurement=\"C62\"^^xsd:string and gr:amountOfThisGood=\"1.0\"^^xsd:float for that good."},
   :rdfs/domain :gr/Offering,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "includes (0..1)"},
   :rdfs/range :gr/ProductOrService})

(def includesObject
  {:db/ident :gr/includesObject,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This object property links a gr:Offering to one or multiple gr:TypeAndQuantityNode or nodes that specify the components that are included in the respective offer."},
   :rdfs/domain {:owl/unionOf [:gr/Offering :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "includes object (0..*)"},
   :rdfs/range :gr/TypeAndQuantityNode})

(def isAccessoryOrSparePartFor
  {:db/ident :gr/isAccessoryOrSparePartFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This states that a particular gr:ProductOrService is an accessory or spare part for another product or service."},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is accessory or spare part for (0..*)"},
   :rdfs/range :gr/ProductOrService})

(def isConsumableFor
  {:db/ident :gr/isConsumableFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This states that a particular gr:ProductOrService is a consumable for another product or service."},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is consumable for (0..*)"},
   :rdfs/range :gr/ProductOrService})

(def isListPrice
  {:db/ident :gr/isListPrice,
   :owl/deprecated true,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This boolean attribute indicates whether a gr:UnitPriceSpecification is a list price (usually a vendor recommendation) or not. \"true\"  indicates it is a list price, \"false\" indicates it is not.\nDEPRECATED. Use the gr:priceType property instead."},
   :rdfs/domain :gr/UnitPriceSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is list price (DEPRECATED)"},
   :rdfs/range :xsd/boolean})

(def isSimilarTo
  {:db/ident :gr/isSimilarTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This states that a given gr:ProductOrService is similar to another product or service. Of course, this is a subjective statement; when interpreting it, the trust in the origin of the statement should be taken into account."},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is similar to (0..*)"},
   :rdfs/range :gr/ProductOrService})

(def isVariantOf
  {:db/ident :gr/isVariantOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This states that a particular gr:ProductOrServiceModel is a variant of another product or service model. It is pretty safe to infer that the variant inherits all gr:quantitativeProductOrServiceProperty, gr:qualitativeProductOrServiceProperty, and gr:datatypeProductOrServiceProperty values that are defined for the first gr:ProductOrServiceModel.\n\nExample:\nfoo:Red_Ford_T_Model gr:isVariantOf foo:Ford_T_Model"},
   :rdfs/domain :gr/ProductOrServiceModel,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is variant of (0..1)"},
   :rdfs/range :gr/ProductOrServiceModel})

(def legalName
  {:db/ident         :gr/legalName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The legal name of the gr:BusinessEntity."},
   :rdfs/domain      {:owl/unionOf [:gr/BusinessEntity :schema/Organization],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "legal name (0..1)"},
   :rdfs/range       :rdfs/Literal})

(def lesser
  {:db/ident :gr/lesser,
   :owl/inverseOf :gr/greater,
   :rdf/type #{:owl/TransitiveProperty :owl/ObjectProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ordering relation for gr:QualitativeValue pairs indicates that the subject is lesser than the object."},
   :rdfs/domain :gr/QualitativeValue,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lesser (0..*)"},
   :rdfs/range :gr/QualitativeValue})

(def lesserOrEqual
  {:db/ident :gr/lesserOrEqual,
   :owl/inverseOf :gr/greaterOrEqual,
   :rdf/type #{:owl/TransitiveProperty :owl/ObjectProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ordering relation for gr:QualitativeValue pairs indicates that the subject is lesser than or equal to the object."},
   :rdfs/domain :gr/QualitativeValue,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lesser or equal (0..*)"},
   :rdfs/range :gr/QualitativeValue})

(def name
  {:db/ident :gr/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A short text describing the respective resource.\n\nThis property is semantically equivalent to dcterms:title and rdfs:label and just meant as a handy shortcut for marking up data."},
   :rdfs/domain {:owl/unionOf [:owl/Thing
                               :gr/Brand
                               :gr/BusinessEntity
                               :gr/BusinessEntityType
                               :gr/BusinessFunction
                               :gr/DayOfWeek
                               :gr/DeliveryChargeSpecification
                               :gr/DeliveryMethod
                               :gr/DeliveryModeParcelService
                               :gr/Individual
                               :gr/Location
                               :gr/Offering
                               :gr/OpeningHoursSpecification
                               :gr/PaymentChargeSpecification
                               :gr/PaymentMethod
                               :gr/PaymentMethodCreditCard
                               :gr/PriceSpecification
                               :gr/ProductOrService
                               :gr/ProductOrServiceModel
                               :gr/QualitativeValue
                               :gr/QuantitativeValue
                               :gr/QuantitativeValueFloat
                               :gr/QuantitativeValueInteger
                               :gr/SomeItems
                               :gr/TypeAndQuantityNode
                               :gr/UnitPriceSpecification
                               :gr/WarrantyPromise
                               :gr/WarrantyScope],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "name (0..1)"},
   :rdfs/range :rdfs/Literal})

(def nonEqual
  {:db/ident :gr/nonEqual,
   :rdf/type #{:owl/SymmetricProperty :owl/ObjectProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ordering relation for gr:QualitativeValue pairs indicates that the subject is not equal to the object."},
   :rdfs/domain :gr/QualitativeValue,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non equal (0..*)"},
   :rdfs/range :gr/QualitativeValue})

(def offers
  {:db/ident :gr/offers,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This links a gr:BusinessEntity to the offers (gr:Offering) it makes. If you want to express interest in receiving offers, use gr:seeks instead."},
   :rdfs/domain {:owl/unionOf [:gr/BusinessEntity :schema/Organization],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "offers (0..*)"},
   :rdfs/range :gr/Offering})

(def opens
  {:db/ident :gr/opens,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The opening hour of the gr:Location on the given gr:DayOfWeek.\nIf no time-zone suffix is included, the time is given in the local time valid at the gr:Location.\n\nFor a time in GMT/UTC, simply add a \"Z\" following the time:\n\n09:30:10Z.\n\nAlternatively, you can specify an offset from the UTC time by adding a positive or negative time following the time:\n\n09:30:10-09:00\n\nor\n\n09:30:10+09:00.\n\nNote 1: Use 00:00:00 for the first second of the respective day and 23:59:59 for the last second of that day.\nNote 2: If a store opens at 17:00 on Saturdays and closes at 03:00:00 a.m. next morning, use 17:00:00 - 23:59:59 for Saturday and 00:00:00 - 03:00:00 for Sunday.\nNote 3: If the shop re-opens on the same day of the week or set of days of the week, you must create a second instance of gr:OpeningHoursSpecification."},
   :rdfs/domain :gr/OpeningHoursSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "opens (1..1)"},
   :rdfs/range :xsd/time})

(def owns
  {:db/ident :gr/owns,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property indicates that a particular person or business owns a particular product. It can be used to expose the products in one's posession in order to empower recommender systems to suggest matching offers.\n\nNote that the product must be an instance of the class gr:Individual.\n\nThis property can also be safely applied to foaf:Agent instances."},
   :rdfs/domain
   {:owl/unionOf [:gr/BusinessEntity :schema/Organization :schema/Person],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "owns (0..*)"},
   :rdfs/range :gr/Individual})

(def predecessorOf
  {:db/ident :gr/predecessorOf,
   :owl/inverseOf :gr/successorOf,
   :rdf/type #{:owl/TransitiveProperty :owl/ObjectProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property indicates that the subject is a previous, often discontinued variant of the gr:ProductOrServiceModel used as the object.\n\nExample: Golf III predecessorOf Golf IV\n\nThis relation is transitive."},
   :rdfs/domain :gr/ProductOrServiceModel,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "predecessor of (0..*)"},
   :rdfs/range :gr/ProductOrServiceModel})

(def priceType
  {:db/ident :gr/priceType,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This attribute can be used to distinguish multiple different price specifications for the same gr:Offering. It supersedes the former gr:isListPrice property. The following values are recommended:\n\nThe absence of this property marks the actual sales price.\n\nSRP: \"suggested retail price\" - applicable for all sorts of a non-binding retail price recommendations, e.g. such published by the manufacturer or the distributor. This value replaces the former gr:isListPrice property.\n\nINVOICE: The invoice price, mostly used in the car industry - this is the price a dealer pays to the manufacturer, excluding rebates and charges."},
   :rdfs/domain :gr/UnitPriceSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "price type (0..1)"},
   :rdfs/range :xsd/string})

(def qualitativeProductOrServiceProperty
  {:db/ident :gr/qualitativeProductOrServiceProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This is the super property of all qualitative properties for products and services. All properties in product or service ontologies for which gr:QualitativeValue instances are specified are subproperties of this property."},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "qualitative product or service property (0..*)"},
   :rdfs/range :gr/QualitativeValue})

(def quantitativeProductOrServiceProperty
  {:db/ident :gr/quantitativeProductOrServiceProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This is the super property of all quantitative  properties for products and services. All properties in product or service ontologies that specify quantitative characteristics, for which an interval is at least theoretically an appropriate value, are subproperties of this property."},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "quantitative product or service property (0..*)"},
   :rdfs/range :gr/QuantitativeValue})

(def relatedWebService
  {:db/ident :gr/relatedWebService,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The URI of a SOAP or REST Web Service from which additional information about the gr:BusinessEntity, gr:Offering, gr:PriceSpecification, or gr:ProductOrService, or any other element,  can be obtained. The recommended range is xsd:anyURI i.e., the URI of a SOAP or REST Web Service.\n\nIn principle, any existing or upcoming vocabulary for Web Services can be used in combination with GoodRelations, because the association between (a) the service description and (b) the GoodRelations description can be found via the Web Service URI value used with this gr:relatedWebService property."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "related Web Service (0..*)"}})

(def seeks
  {:db/ident :gr/seeks,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This links a gr:BusinessEntity to gr:Offering nodes that describe what the business entity is interested in (i.e., the buy side). If you want to express interest in offering something, use gr:offers instead. Note that this substitutes the former gr:BusinessFunction gr:Buy, which is now deprecated."},
   :rdfs/domain
   {:owl/unionOf [:gr/BusinessEntity :schema/Organization :schema/Person],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seeks (0..*)"},
   :rdfs/range :gr/Offering})

(def serialNumber
  {:db/ident :gr/serialNumber,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The serial number or any alphanumeric identifier of a particular product. Note that serial number are unique only for the same brand or the same model, so you cannot infer from two occurrences of the same serial number that the objects to which they are attached are identical.\n\nThis property can also be attached to a gr:Offering in cases where the included products are not modeled in more detail."},
   :rdfs/domain {:owl/unionOf [:gr/Individual :gr/Offering :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "serial number (0..*)"},
   :rdfs/range :xsd/string})

(def successorOf
  {:db/ident :gr/successorOf,
   :owl/inverseOf :gr/predecessorOf,
   :rdf/type #{:owl/TransitiveProperty :owl/ObjectProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property indicates that the subject is a newer, often updated or improved variant of the gr:ProductOrServiceModel used as the object.\n\nExample: Golf III successorOf Golf II\n\nThis relation is transitive."},
   :rdfs/domain :gr/ProductOrServiceModel,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "successor of (0..*)"},
   :rdfs/range :gr/ProductOrServiceModel})

(def taxID
  {:db/ident :gr/taxID,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Tax / Fiscal ID of the gr:BusinessEntity, e.g. the TIN in the US or the CIF/NIF in Spain. It is usually assigned by the country of residence"},
   :rdfs/domain
   {:owl/unionOf [:gr/BusinessEntity :schema/Organization :schema/Person],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tax ID (0..1)"},
   :rdfs/range :xsd/string})

(def typeOfGood
  {:db/ident :gr/typeOfGood,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This specifies the gr:ProductOrService that the gr:TypeAndQuantityNode is referring to."},
   :rdfs/domain :gr/TypeAndQuantityNode,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "type of good (1..1)"},
   :rdfs/range {:owl/unionOf [:gr/Individual :gr/SomeItems],
                :rdf/type    :owl/Class}})

(def validFrom
  {:db/ident :gr/validFrom,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the beginning of the validity of the gr:Offering, gr:PriceSpecification, gr:License, or gr:OpeningHoursSpecification.\nA time-zone should be specified. For a time in GMT/UTC, simply add a \"Z\" following the time:\n\n2008-05-30T09:30:10Z.\n\nAlternatively, you can specify an offset from the UTC time by adding a positive or negative time following the time:\n\n2008-05-30T09:30:10-09:00\n\nor\n\n2008-05-30T09:30:10+09:00.\n\nNote: If multiple contradicting instances of a gr:Offering, gr:PriceSpecification, or gr:OpeningHoursSpecification exist, it is a good heuristics to assume that\n1. Information with validity information for the respective period of time ranks higher than information without validity information.\n2. Among conflicting nodes both having validity information, the one with the shorter validity span ranks higher."},
   :rdfs/domain {:owl/unionOf [:gr/Offering
                               :gr/OpeningHoursSpecification
                               :gr/PriceSpecification
                               :gr/License
                               :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "valid from (0..1)"},
   :rdfs/range :xsd/dateTime})

(def validThrough
  {:db/ident :gr/validThrough,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies the end of the validity of the gr:Offering, gr:PriceSpecification, gr:License, or gr:OpeningHoursSpecification.\nA time-zone should be specified. For a time in GMT/UTC, simply add a \"Z\" following the time:\n\n2008-05-30T09:30:10Z.\n\nAlternatively, you can specify an offset from the UTC time by adding a positive or negative time following the time:\n\n2008-05-30T09:30:10-09:00\n\nor\n2008-05-30T09:30:10+09:00.\n\nNote 1: If multiple contradicting instances of a gr:Offering, gr:PriceSpecification, or gr:OpeningHoursSpecification exist, it is a good heuristics to assume that\n1. Information with validity information for the respective period of time ranks higher than information without validity information.\n2. Among conflicting nodes both having validity information, the one with the shorter validity span ranks higher.\nNote 2: For Google, attaching a gr:validThrough statement to a gr:UnitPriceSpecification is mandatory. \n"},
   :rdfs/domain {:owl/unionOf [:gr/Offering
                               :gr/OpeningHoursSpecification
                               :gr/PriceSpecification
                               :gr/License
                               :schema/Offer],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "valid through (0..1)"},
   :rdfs/range :xsd/dateTime})

(def valueAddedTaxIncluded
  {:db/ident :gr/valueAddedTaxIncluded,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies whether the applicable value-added tax (VAT)  is included in the price of the gr:PriceSpecification or not.\n\nNote: This is a simple representation which may not properly reflect all details of local taxation."},
   :rdfs/domain :gr/PriceSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "value added tax included (0..1)"},
   :rdfs/range :xsd/boolean})

(def valueReference
  {:db/ident :gr/valueReference,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The superclass of properties that link a gr:QuantitativeValue or a gr:QualitativeValue to a second gr:QuantitativeValue or a gr:QualitativeValue that provides additional information on the original value. A good modeling practice is to define specializations of this property (e.g. foo:referenceTemperature) for your particular domain."},
   :rdfs/domain {:owl/unionOf [:gr/QualitativeValue :gr/QuantitativeValue],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "value reference (0..*)"},
   :rdfs/range {:owl/unionOf [:gr/QualitativeValue :gr/QuantitativeValue],
                :rdf/type    :owl/Class}})

(def vatID
  {:db/ident :gr/vatID,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Value-added Tax ID of the gr:BusinessEntity. See http://en.wikipedia.org/wiki/Value_added_tax_identification_number for details."},
   :rdfs/domain
   {:owl/unionOf [:gr/BusinessEntity :schema/Organization :schema/Person],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "VAT ID (0..1)"},
   :rdfs/range :xsd/string})

(def weight
  {:db/ident :gr/weight,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The weight of the gr:ProductOrService.\nTypical unit code(s): GRM for gram, KGM for kilogram, LBR for pound"},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "weight (0..1)"},
   :rdfs/range :gr/QuantitativeValue,
   :rdfs/subPropertyOf :gr/quantitativeProductOrServiceProperty})

(def width
  {:db/ident :gr/width,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The width of the gr:ProductOrService.\nTypical unit code(s): CMT for centimeters, INH for inches"},
   :rdfs/domain {:owl/unionOf [:gr/ProductOrService :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/goodrelations/v1"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "width (0..1)"},
   :rdfs/range :gr/QuantitativeValue,
   :rdfs/subPropertyOf :gr/quantitativeProductOrServiceProperty})