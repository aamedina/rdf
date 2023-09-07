(ns net.wikipunk.rdf.wikibase
  ^{:base       "http://wikiba.se/ontology#",
    :namespaces {"cc"       "http://creativecommons.org/ns#",
                 "owl"      "http://www.w3.org/2002/07/owl#",
                 "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                 "wikibase" "http://wikiba.se/ontology#",
                 "xsd"      "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "wikibase",
    :source     "http://wikiba.se/ontology#"}
  {:cc/licence {:xsd/anyURI
                "http://creativecommons.org/publicdomain/zero/1.0/"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "The system ontology of Wikibase",
   :rdfs/label "Wikibase system ontology",
   :rdfs/seeAlso
   #{{:xsd/anyURI
      "https://www.mediawiki.org/wiki/Extension:WikibaseLexeme/RDF_mapping"}
     {:xsd/anyURI
      "https://www.mediawiki.org/wiki/Wikibase/Indexing/RDF_Dump_Format"}},
   :xsd/anyURI "http://wikiba.se/ontology#"})

(def BestRank
  {:db/ident :wikibase/BestRank,
   :rdf/type :owl/Class,
   :rdfs/comment
   "This class marks statement that has the best rank for its property.",
   :rdfs/label "BestRank"})

(def CommonsMedia
  {:db/ident     :wikibase/CommonsMedia,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "Wikimedia Commons reference type.",
   :rdfs/label   "CommonsMedia"})

(def DeprecatedRank
  {:db/ident     :wikibase/DeprecatedRank,
   :rdf/type     #{:wikibase/Rank :owl/NamedIndividual},
   :rdfs/comment "Deprecated statement rank.",
   :rdfs/label   "DeprecatedRank"})

(def Dump
  {:db/ident     :wikibase/Dump,
   :rdf/type     :owl/Class,
   :rdfs/comment "A dump of wikidata content.",
   :rdfs/label   "Dump"})

(def Entity
  {:db/ident     :wikibase/Entity,
   :rdf/type     :owl/Class,
   :rdfs/comment "Wikibase entity.",
   :rdfs/label   "Entity"})

(def ExternalId
  {:db/ident     :wikibase/ExternalId,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "Type for referring to ID defined by external authority.",
   :rdfs/label   "WikibaseExternalId"})

(def Form
  {:db/ident        :wikibase/Form,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Wikibase Form.",
   :rdfs/label      "Form",
   :rdfs/subClassOf :wikibase/Entity})

(def GeoAutoPrecision
  {:db/ident :wikibase/GeoAutoPrecision,
   :rdf/type :owl/Class,
   :rdfs/comment
   "This coordinate value uses automatic precision since the user did not specify one.",
   :rdfs/label "GeoAutoPrecision"})

(def GeoShape
  {:db/ident     :wikibase/GeoShape,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "Type for storing links to geoshape data.",
   :rdfs/label   "GeoShape"})

(def Globecoordinate
  {:db/ident     :wikibase/Globecoordinate,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "Coordinate type.",
   :rdfs/label   "Globecoordinate"})

(def GlobecoordinateValue
  {:db/ident :wikibase/GlobecoordinateValue,
   :rdf/type :owl/Class,
   :rdfs/comment "Wikibase extended value representing geographic coordinate.",
   :rdfs/label "GlobecoordinateValue",
   :rdfs/subClassOf :wikibase/Value})

(def Item
  {:db/ident        :wikibase/Item,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Wikibase item.",
   :rdfs/label      "Item",
   :rdfs/subClassOf :wikibase/Entity})

(def Lexeme
  {:db/ident        :wikibase/Lexeme,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Wikibase Lexeme.",
   :rdfs/label      "Lexeme",
   :rdfs/subClassOf :wikibase/Entity})

(def MathClass
  {:db/ident :wikibase/Math,
   :rdf/type #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment
   "Type for mathematical expressions as supported by the Math extension.",
   :rdfs/label "Mathematial expression"})

(def Monolingualtext
  {:db/ident     :wikibase/Monolingualtext,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "Type for text in single language.",
   :rdfs/label   "Monolingualtext"})

(def MusicalNotation
  {:db/ident :wikibase/MusicalNotation,
   :rdf/type #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment
   "Type for storing musical scores written in LilyPond notation as supported by the Score extension.",
   :rdfs/label "MusicalNotation"})

(def NormalRank
  {:db/ident     :wikibase/NormalRank,
   :rdf/type     #{:wikibase/Rank :owl/NamedIndividual},
   :rdfs/comment "Normal statement rank.",
   :rdfs/label   "NormalRank"})

(def PreferredRank
  {:db/ident     :wikibase/PreferredRank,
   :rdf/type     #{:wikibase/Rank :owl/NamedIndividual},
   :rdfs/comment "Preferred statement rank.",
   :rdfs/label   "PreferredRank"})

(def Property
  {:db/ident        :wikibase/Property,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Wikibase property.",
   :rdfs/label      "Property",
   :rdfs/subClassOf :wikibase/Entity})

(def PropertyType
  {:db/ident     :wikibase/PropertyType,
   :rdf/type     :owl/Class,
   :rdfs/comment "Type of a wikibase property.",
   :rdfs/label   "PropertyType"})

(def Quantity
  {:db/ident     :wikibase/Quantity,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "Type for numerical quantity.",
   :rdfs/label   "Quantity"})

(def QuantityValue
  {:db/ident        :wikibase/QuantityValue,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Wikibase extended value representing quantity.",
   :rdfs/label      "QuantityValue",
   :rdfs/subClassOf :wikibase/Value})

(def Rank
  {:db/ident     :wikibase/Rank,
   :rdf/type     :owl/Class,
   :rdfs/comment "Wikibase statement rank.",
   :rdfs/label   "Rank"})

(def Reference
  {:db/ident     :wikibase/Reference,
   :rdf/type     :owl/Class,
   :rdfs/comment "A reference to sources supporting the claim.",
   :rdfs/label   "Reference"})

(def Sense
  {:db/ident        :wikibase/Sense,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Wikibase sense.",
   :rdfs/label      "Sense",
   :rdfs/subClassOf :wikibase/Entity})

(def Statement
  {:db/ident     :wikibase/Statement,
   :rdf/type     :owl/Class,
   :rdfs/comment "A reified statement.",
   :rdfs/label   "Statement"})

(def StringClass
  {:db/ident     :wikibase/String,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "Basic string type.",
   :rdfs/label   "String"})

(def TabularData
  {:db/ident     :wikibase/TabularData,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "Type for storing links to tabular data.",
   :rdfs/label   "TabularData"})

(def Time
  {:db/ident     :wikibase/Time,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "Date and time value type.",
   :rdfs/label   "Time"})

(def TimeValue
  {:db/ident        :wikibase/TimeValue,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Wikibase extended value representing time.",
   :rdfs/label      "TimeValue",
   :rdfs/subClassOf :wikibase/Value})

(def Url
  {:db/ident     :wikibase/Url,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "URL link type.",
   :rdfs/label   "Url"})

(def Value
  {:db/ident     :wikibase/Value,
   :rdf/type     :owl/Class,
   :rdfs/comment "Wikibase extended value.",
   :rdfs/label   "Value"})

(def WikibaseItem
  {:db/ident     :wikibase/WikibaseItem,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "Type for referring to another Wikibase item.",
   :rdfs/label   "WikibaseItem"})

(def WikibaseProperty
  {:db/ident     :wikibase/WikibaseProperty,
   :rdf/type     #{:wikibase/PropertyType :owl/NamedIndividual},
   :rdfs/comment "Type for referring to a Wikibase property.",
   :rdfs/label   "WikibaseProperty"})

(def badge
  {:db/ident     :wikibase/badge,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Badge on the Wiki page.",
   :rdfs/label   "badge",
   :rdfs/range   :wikibase/Item})

(def claim
  {:db/ident     :wikibase/claim,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Link between Wikibase Property and claim predicate.",
   :rdfs/domain  :wikibase/Property,
   :rdfs/label   "claim"})

(def directClaim
  {:db/ident     :wikibase/directClaim,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Link between Wikibase Property and direct claim predicate.",
   :rdfs/domain  :wikibase/Property,
   :rdfs/label   "directClaim"})

(def geoGlobe
  {:db/ident     :wikibase/geoGlobe,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Globe reference URL.",
   :rdfs/domain  :wikibase/GlobecoordinateValue,
   :rdfs/label   "geoGlobe",
   :rdfs/range   :wikibase/Item})

(def geoLatitude
  {:db/ident     :wikibase/geoLatitude,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Coordinate latitude.",
   :rdfs/domain  :wikibase/GlobecoordinateValue,
   :rdfs/label   "geoLatitude",
   :rdfs/range   :xsd/decimal})

(def geoLongitude
  {:db/ident     :wikibase/geoLongitude,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Coordinate longitude.",
   :rdfs/domain  :wikibase/GlobecoordinateValue,
   :rdfs/label   "geoLongitude",
   :rdfs/range   :xsd/decimal})

(def geoPrecision
  {:db/ident     :wikibase/geoPrecision,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Coordinate precision.",
   :rdfs/domain  :wikibase/GlobecoordinateValue,
   :rdfs/label   "geoPrecision",
   :rdfs/range   :xsd/decimal})

(def grammaticalFeature
  {:db/ident     :wikibase/grammaticalFeature,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Form grammatical feature.",
   :rdfs/domain  :wikibase/Form,
   :rdfs/label   "grammaticalFeature",
   :rdfs/range   :wikibase/Item})

(def hasViolationForConstraint
  {:db/ident :wikibase/hasViolationForConstraint,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Link between statement violating constraint and the constraint.",
   :rdfs/domain :wikibase/Statement,
   :rdfs/label "hasViolationForConstraint",
   :rdfs/range :wikibase/Statement})

(def lemma
  {:db/ident     :wikibase/lemma,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Lexeme lemma.",
   :rdfs/domain  :wikibase/Lexeme,
   :rdfs/label   "lemma",
   :rdfs/range   :rdf/langString})

(def lexicalCategory
  {:db/ident     :wikibase/lexicalCategory,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Lexeme lexical category.",
   :rdfs/domain  :wikibase/Lexeme,
   :rdfs/label   "lexicalCategory",
   :rdfs/range   :wikibase/Item})

(def novalue
  {:db/ident     :wikibase/novalue,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Link between Wikibase Property and no value class.",
   :rdfs/domain  :wikibase/Property,
   :rdfs/label   "novalue"})

(def qualifier
  {:db/ident     :wikibase/qualifier,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Link between Wikibase Property and qualifier predicate.",
   :rdfs/domain  :wikibase/Property,
   :rdfs/label   "qualifier"})

(def qualifierValue
  {:db/ident :wikibase/qualifierValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Link between Wikibase Property and qualifier value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label "qualifierValue"})

(def qualifierValueNormalized
  {:db/ident :wikibase/qualifierValueNormalized,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Link between Wikibase Property and qualifier normalized value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label "qualifierValueNormalized"})

(def quantityAmount
  {:db/ident     :wikibase/quantityAmount,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Amount of quantity.",
   :rdfs/domain  :wikibase/QuantityValue,
   :rdfs/label   "quantityAmount",
   :rdfs/range   :xsd/decimal})

(def quantityLowerBound
  {:db/ident     :wikibase/quantityLowerBound,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Lower bound of the value.",
   :rdfs/domain  :wikibase/QuantityValue,
   :rdfs/label   "quantityLowerBound",
   :rdfs/range   :xsd/decimal})

(def quantityNormalized
  {:db/ident     :wikibase/quantityNormalized,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Representation of this quantity in standard units.",
   :rdfs/domain  :wikibase/QuantityValue,
   :rdfs/label   "quantityNormalized",
   :rdfs/range   :wikibase/QuantityValue})

(def quantityUnit
  {:db/ident     :wikibase/quantityUnit,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Unit of measurement.",
   :rdfs/domain  :wikibase/QuantityValue,
   :rdfs/label   "quantityUnit",
   :rdfs/range   :wikibase/Item})

(def quantityUpperBound
  {:db/ident     :wikibase/quantityUpperBound,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Upper bound of the value.",
   :rdfs/domain  :wikibase/QuantityValue,
   :rdfs/label   "quantityUpperBound",
   :rdfs/range   :xsd/decimal})

(def rank
  {:db/ident     :wikibase/rank,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Statement rank.",
   :rdfs/domain  :wikibase/Statement,
   :rdfs/label   "rank",
   :rdfs/range   :wikibase/Rank})

(def reference
  {:db/ident     :wikibase/reference,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Link between Wikibase Property and reference predicate.",
   :rdfs/domain  :wikibase/Property,
   :rdfs/label   "reference"})

(def referenceValue
  {:db/ident :wikibase/referenceValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Link between Wikibase Property and reference value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label "referenceValue"})

(def referenceValueNormalized
  {:db/ident :wikibase/referenceValueNormalized,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Link between Wikibase Property and reference normalized value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label "referenceValueNormalized"})

(def statementProperty
  {:db/ident :wikibase/statementProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Link between Wikibase Property and statement property predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label "statementProperty"})

(def statementValue
  {:db/ident :wikibase/statementValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Link between Wikibase Property and statement value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label "statementValue"})

(def statementValueNormalized
  {:db/ident :wikibase/statementValueNormalized,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Link between Wikibase Property and statement normalized value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label "statementValueNormalized"})

(def timeCalendarModel
  {:db/ident     :wikibase/timeCalendarModel,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Preferred calendar used to display this date to the user.",
   :rdfs/domain  :wikibase/TimeValue,
   :rdfs/label   "timeCalendarModel",
   :rdfs/range   :wikibase/Item})

(def timePrecision
  {:db/ident     :wikibase/timePrecision,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Datetime precision.",
   :rdfs/domain  :wikibase/TimeValue,
   :rdfs/label   "timePrecision",
   :rdfs/range   :xsd/nonNegativeInteger})

(def timeTimezone
  {:db/ident     :wikibase/timeTimezone,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Timezone offset from UTC in minutes.",
   :rdfs/domain  :wikibase/TimeValue,
   :rdfs/label   "timeTimezone",
   :rdfs/range   :xsd/decimal})

(def timeValue
  {:db/ident     :wikibase/timeValue,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Time value as datetime literal.",
   :rdfs/domain  :wikibase/TimeValue,
   :rdfs/label   "timeValue",
   :rdfs/range   :xsd/dateTime})

(def wikiGroup
  {:db/ident     :wikibase/wikiGroup,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Wiki group that the site belongs to.",
   :rdfs/label   "wikiGroup"})

(def urn:uuid:64bacc41-0a21-56f0-9ae8-afdd6601edc6
  {:cc/licence {:xsd/anyURI
                "http://creativecommons.org/publicdomain/zero/1.0/"},
   :rdf/type :owl/Ontology,
   :rdfs/comment "The system ontology of Wikibase",
   :rdfs/label "Wikibase system ontology",
   :rdfs/seeAlso
   #{{:xsd/anyURI
      "https://www.mediawiki.org/wiki/Extension:WikibaseLexeme/RDF_mapping"}
     {:xsd/anyURI
      "https://www.mediawiki.org/wiki/Wikibase/Indexing/RDF_Dump_Format"}},
   :xsd/anyURI "http://wikiba.se/ontology#"})