(ns net.wikipunk.rdf.wikibase
  "The system ontology of Wikibase"
  {:cc/licence {:rdfa/uri "http://creativecommons.org/publicdomain/zero/1.0/"},
   :rdf/ns-prefix-map {"cc"       "http://creativecommons.org/ns#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "wikibase" "http://wikiba.se/ontology#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "wikibase",
   :rdfa/uri "http://wikiba.se/ontology#",
   :rdfs/comment #xsd/string "The system ontology of Wikibase",
   :rdfs/label #xsd/string "Wikibase system ontology",
   :rdfs/seeAlso
   [{:rdfa/uri
     "https://www.mediawiki.org/wiki/Extension:WikibaseLexeme/RDF_mapping"}
    {:rdfa/uri
     "https://www.mediawiki.org/wiki/Wikibase/Indexing/RDF_Dump_Format"}]})

(def BestRank
  "This class marks statement that has the best rank for its property."
  {:db/ident :wikibase/BestRank,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "This class marks statement that has the best rank for its property.",
   :rdfs/label #xsd/string "BestRank"})

(def CommonsMedia
  "Wikimedia Commons reference type."
  {:db/ident     :wikibase/CommonsMedia,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Wikimedia Commons reference type.",
   :rdfs/label   #xsd/string "CommonsMedia"})

(def DeprecatedRank
  "Deprecated statement rank."
  {:db/ident     :wikibase/DeprecatedRank,
   :rdf/type     [:wikibase/Rank :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Deprecated statement rank.",
   :rdfs/label   #xsd/string "DeprecatedRank"})

(def Dump
  "A dump of wikidata content."
  {:db/ident     :wikibase/Dump,
   :rdf/type     :owl/Class,
   :rdfs/comment #xsd/string "A dump of wikidata content.",
   :rdfs/label   #xsd/string "Dump"})

(def Entity
  "Wikibase entity."
  {:db/ident     :wikibase/Entity,
   :rdf/type     :owl/Class,
   :rdfs/comment #xsd/string "Wikibase entity.",
   :rdfs/label   #xsd/string "Entity"})

(def ExternalId
  "Type for referring to ID defined by external authority."
  {:db/ident     :wikibase/ExternalId,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string
                  "Type for referring to ID defined by external authority.",
   :rdfs/label   #xsd/string "WikibaseExternalId"})

(def Form
  "Wikibase Form."
  {:db/ident        :wikibase/Form,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/string "Wikibase Form.",
   :rdfs/label      #xsd/string "Form",
   :rdfs/subClassOf :wikibase/Entity})

(def GeoAutoPrecision
  "This coordinate value uses automatic precision since the user did not specify one."
  {:db/ident :wikibase/GeoAutoPrecision,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "This coordinate value uses automatic precision since the user did not specify one.",
   :rdfs/label #xsd/string "GeoAutoPrecision"})

(def GeoShape
  "Type for storing links to geoshape data."
  {:db/ident     :wikibase/GeoShape,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Type for storing links to geoshape data.",
   :rdfs/label   #xsd/string "GeoShape"})

(def Globecoordinate
  "Coordinate type."
  {:db/ident     :wikibase/Globecoordinate,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Coordinate type.",
   :rdfs/label   #xsd/string "Globecoordinate"})

(def GlobecoordinateValue
  "Wikibase extended value representing geographic coordinate."
  {:db/ident :wikibase/GlobecoordinateValue,
   :rdf/type :owl/Class,
   :rdfs/comment #xsd/string
                  "Wikibase extended value representing geographic coordinate.",
   :rdfs/label #xsd/string "GlobecoordinateValue",
   :rdfs/subClassOf :wikibase/Value})

(def Item
  "Wikibase item."
  {:db/ident        :wikibase/Item,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/string "Wikibase item.",
   :rdfs/label      #xsd/string "Item",
   :rdfs/subClassOf :wikibase/Entity})

(def Lexeme
  "Wikibase Lexeme."
  {:db/ident        :wikibase/Lexeme,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/string "Wikibase Lexeme.",
   :rdfs/label      #xsd/string "Lexeme",
   :rdfs/subClassOf :wikibase/Entity})

(def MathClass
  "Type for mathematical expressions as supported by the Math extension."
  {:db/ident :wikibase/Math,
   :rdf/type [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/string
    "Type for mathematical expressions as supported by the Math extension.",
   :rdfs/label #xsd/string "Mathematial expression"})

(def Monolingualtext
  "Type for text in single language."
  {:db/ident     :wikibase/Monolingualtext,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Type for text in single language.",
   :rdfs/label   #xsd/string "Monolingualtext"})

(def MusicalNotation
  "Type for storing musical scores written in LilyPond notation as supported by the Score extension."
  {:db/ident :wikibase/MusicalNotation,
   :rdf/type [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/string
    "Type for storing musical scores written in LilyPond notation as supported by the Score extension.",
   :rdfs/label #xsd/string "MusicalNotation"})

(def NormalRank
  "Normal statement rank."
  {:db/ident     :wikibase/NormalRank,
   :rdf/type     [:wikibase/Rank :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Normal statement rank.",
   :rdfs/label   #xsd/string "NormalRank"})

(def PreferredRank
  "Preferred statement rank."
  {:db/ident     :wikibase/PreferredRank,
   :rdf/type     [:wikibase/Rank :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Preferred statement rank.",
   :rdfs/label   #xsd/string "PreferredRank"})

(def Property
  "Wikibase property."
  {:db/ident        :wikibase/Property,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/string "Wikibase property.",
   :rdfs/label      #xsd/string "Property",
   :rdfs/subClassOf :wikibase/Entity})

(def PropertyType
  "Type of a wikibase property."
  {:db/ident     :wikibase/PropertyType,
   :rdf/type     :owl/Class,
   :rdfs/comment #xsd/string "Type of a wikibase property.",
   :rdfs/label   #xsd/string "PropertyType"})

(def Quantity
  "Type for numerical quantity."
  {:db/ident     :wikibase/Quantity,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Type for numerical quantity.",
   :rdfs/label   #xsd/string "Quantity"})

(def QuantityValue
  "Wikibase extended value representing quantity."
  {:db/ident        :wikibase/QuantityValue,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/string
                     "Wikibase extended value representing quantity.",
   :rdfs/label      #xsd/string "QuantityValue",
   :rdfs/subClassOf :wikibase/Value})

(def Rank
  "Wikibase statement rank."
  {:db/ident     :wikibase/Rank,
   :rdf/type     :owl/Class,
   :rdfs/comment #xsd/string "Wikibase statement rank.",
   :rdfs/label   #xsd/string "Rank"})

(def Reference
  "A reference to sources supporting the claim."
  {:db/ident     :wikibase/Reference,
   :rdf/type     :owl/Class,
   :rdfs/comment #xsd/string "A reference to sources supporting the claim.",
   :rdfs/label   #xsd/string "Reference"})

(def Sense
  "Wikibase sense."
  {:db/ident        :wikibase/Sense,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/string "Wikibase sense.",
   :rdfs/label      #xsd/string "Sense",
   :rdfs/subClassOf :wikibase/Entity})

(def Statement
  "A reified statement."
  {:db/ident     :wikibase/Statement,
   :rdf/type     :owl/Class,
   :rdfs/comment #xsd/string "A reified statement.",
   :rdfs/label   #xsd/string "Statement"})

(def StringClass
  "Basic string type."
  {:db/ident     :wikibase/String,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Basic string type.",
   :rdfs/label   #xsd/string "String"})

(def TabularData
  "Type for storing links to tabular data."
  {:db/ident     :wikibase/TabularData,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Type for storing links to tabular data.",
   :rdfs/label   #xsd/string "TabularData"})

(def Time
  "Date and time value type."
  {:db/ident     :wikibase/Time,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Date and time value type.",
   :rdfs/label   #xsd/string "Time"})

(def TimeValue
  "Wikibase extended value representing time."
  {:db/ident        :wikibase/TimeValue,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/string "Wikibase extended value representing time.",
   :rdfs/label      #xsd/string "TimeValue",
   :rdfs/subClassOf :wikibase/Value})

(def Url
  "URL link type."
  {:db/ident     :wikibase/Url,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string "URL link type.",
   :rdfs/label   #xsd/string "Url"})

(def Value
  "Wikibase extended value."
  {:db/ident     :wikibase/Value,
   :rdf/type     :owl/Class,
   :rdfs/comment #xsd/string "Wikibase extended value.",
   :rdfs/label   #xsd/string "Value"})

(def WikibaseItem
  "Type for referring to another Wikibase item."
  {:db/ident     :wikibase/WikibaseItem,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Type for referring to another Wikibase item.",
   :rdfs/label   #xsd/string "WikibaseItem"})

(def WikibaseProperty
  "Type for referring to a Wikibase property."
  {:db/ident     :wikibase/WikibaseProperty,
   :rdf/type     [:wikibase/PropertyType :owl/NamedIndividual],
   :rdfs/comment #xsd/string "Type for referring to a Wikibase property.",
   :rdfs/label   #xsd/string "WikibaseProperty"})

(def badge
  "Badge on the Wiki page."
  {:db/ident     :wikibase/badge,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string "Badge on the Wiki page.",
   :rdfs/label   #xsd/string "badge",
   :rdfs/range   :wikibase/Item})

(def claim
  "Link between Wikibase Property and claim predicate."
  {:db/ident     :wikibase/claim,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string
                  "Link between Wikibase Property and claim predicate.",
   :rdfs/domain  :wikibase/Property,
   :rdfs/label   #xsd/string "claim"})

(def directClaim
  "Link between Wikibase Property and direct claim predicate."
  {:db/ident     :wikibase/directClaim,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string
                  "Link between Wikibase Property and direct claim predicate.",
   :rdfs/domain  :wikibase/Property,
   :rdfs/label   #xsd/string "directClaim"})

(def geoGlobe
  "Globe reference URL."
  {:db/ident     :wikibase/geoGlobe,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string "Globe reference URL.",
   :rdfs/domain  :wikibase/GlobecoordinateValue,
   :rdfs/label   #xsd/string "geoGlobe",
   :rdfs/range   :wikibase/Item})

(def geoLatitude
  "Coordinate latitude."
  {:db/ident     :wikibase/geoLatitude,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "Coordinate latitude.",
   :rdfs/domain  :wikibase/GlobecoordinateValue,
   :rdfs/label   #xsd/string "geoLatitude",
   :rdfs/range   :xsd/decimal})

(def geoLongitude
  "Coordinate longitude."
  {:db/ident     :wikibase/geoLongitude,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "Coordinate longitude.",
   :rdfs/domain  :wikibase/GlobecoordinateValue,
   :rdfs/label   #xsd/string "geoLongitude",
   :rdfs/range   :xsd/decimal})

(def geoPrecision
  "Coordinate precision."
  {:db/ident     :wikibase/geoPrecision,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "Coordinate precision.",
   :rdfs/domain  :wikibase/GlobecoordinateValue,
   :rdfs/label   #xsd/string "geoPrecision",
   :rdfs/range   :xsd/decimal})

(def grammaticalFeature
  "Form grammatical feature."
  {:db/ident     :wikibase/grammaticalFeature,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string "Form grammatical feature.",
   :rdfs/domain  :wikibase/Form,
   :rdfs/label   #xsd/string "grammaticalFeature",
   :rdfs/range   :wikibase/Item})

(def hasViolationForConstraint
  "Link between statement violating constraint and the constraint."
  {:db/ident :wikibase/hasViolationForConstraint,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Link between statement violating constraint and the constraint.",
   :rdfs/domain :wikibase/Statement,
   :rdfs/label #xsd/string "hasViolationForConstraint",
   :rdfs/range :wikibase/Statement})

(def lemma
  "Lexeme lemma."
  {:db/ident     :wikibase/lemma,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "Lexeme lemma.",
   :rdfs/domain  :wikibase/Lexeme,
   :rdfs/label   #xsd/string "lemma",
   :rdfs/range   :rdf/langString})

(def lexicalCategory
  "Lexeme lexical category."
  {:db/ident     :wikibase/lexicalCategory,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string "Lexeme lexical category.",
   :rdfs/domain  :wikibase/Lexeme,
   :rdfs/label   #xsd/string "lexicalCategory",
   :rdfs/range   :wikibase/Item})

(def novalue
  "Link between Wikibase Property and no value class."
  {:db/ident     :wikibase/novalue,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string
                  "Link between Wikibase Property and no value class.",
   :rdfs/domain  :wikibase/Property,
   :rdfs/label   #xsd/string "novalue"})

(def qualifier
  "Link between Wikibase Property and qualifier predicate."
  {:db/ident     :wikibase/qualifier,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string
                  "Link between Wikibase Property and qualifier predicate.",
   :rdfs/domain  :wikibase/Property,
   :rdfs/label   #xsd/string "qualifier"})

(def qualifierValue
  "Link between Wikibase Property and qualifier value predicate."
  {:db/ident :wikibase/qualifierValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string "Link between Wikibase Property and qualifier value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label #xsd/string "qualifierValue"})

(def qualifierValueNormalized
  "Link between Wikibase Property and qualifier normalized value predicate."
  {:db/ident :wikibase/qualifierValueNormalized,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Link between Wikibase Property and qualifier normalized value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label #xsd/string "qualifierValueNormalized"})

(def quantityAmount
  "Amount of quantity."
  {:db/ident     :wikibase/quantityAmount,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "Amount of quantity.",
   :rdfs/domain  :wikibase/QuantityValue,
   :rdfs/label   #xsd/string "quantityAmount",
   :rdfs/range   :xsd/decimal})

(def quantityLowerBound
  "Lower bound of the value."
  {:db/ident     :wikibase/quantityLowerBound,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "Lower bound of the value.",
   :rdfs/domain  :wikibase/QuantityValue,
   :rdfs/label   #xsd/string "quantityLowerBound",
   :rdfs/range   :xsd/decimal})

(def quantityNormalized
  "Representation of this quantity in standard units."
  {:db/ident     :wikibase/quantityNormalized,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string
                  "Representation of this quantity in standard units.",
   :rdfs/domain  :wikibase/QuantityValue,
   :rdfs/label   #xsd/string "quantityNormalized",
   :rdfs/range   :wikibase/QuantityValue})

(def quantityUnit
  "Unit of measurement."
  {:db/ident     :wikibase/quantityUnit,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string "Unit of measurement.",
   :rdfs/domain  :wikibase/QuantityValue,
   :rdfs/label   #xsd/string "quantityUnit",
   :rdfs/range   :wikibase/Item})

(def quantityUpperBound
  "Upper bound of the value."
  {:db/ident     :wikibase/quantityUpperBound,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "Upper bound of the value.",
   :rdfs/domain  :wikibase/QuantityValue,
   :rdfs/label   #xsd/string "quantityUpperBound",
   :rdfs/range   :xsd/decimal})

(def rank
  "Statement rank."
  {:db/ident     :wikibase/rank,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string "Statement rank.",
   :rdfs/domain  :wikibase/Statement,
   :rdfs/label   #xsd/string "rank",
   :rdfs/range   :wikibase/Rank})

(def reference
  "Link between Wikibase Property and reference predicate."
  {:db/ident     :wikibase/reference,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string
                  "Link between Wikibase Property and reference predicate.",
   :rdfs/domain  :wikibase/Property,
   :rdfs/label   #xsd/string "reference"})

(def referenceValue
  "Link between Wikibase Property and reference value predicate."
  {:db/ident :wikibase/referenceValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string "Link between Wikibase Property and reference value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label #xsd/string "referenceValue"})

(def referenceValueNormalized
  "Link between Wikibase Property and reference normalized value predicate."
  {:db/ident :wikibase/referenceValueNormalized,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Link between Wikibase Property and reference normalized value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label #xsd/string "referenceValueNormalized"})

(def statementProperty
  "Link between Wikibase Property and statement property predicate."
  {:db/ident :wikibase/statementProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Link between Wikibase Property and statement property predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label #xsd/string "statementProperty"})

(def statementValue
  "Link between Wikibase Property and statement value predicate."
  {:db/ident :wikibase/statementValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string "Link between Wikibase Property and statement value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label #xsd/string "statementValue"})

(def statementValueNormalized
  "Link between Wikibase Property and statement normalized value predicate."
  {:db/ident :wikibase/statementValueNormalized,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Link between Wikibase Property and statement normalized value predicate.",
   :rdfs/domain :wikibase/Property,
   :rdfs/label #xsd/string "statementValueNormalized"})

(def timeCalendarModel
  "Preferred calendar used to display this date to the user."
  {:db/ident     :wikibase/timeCalendarModel,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string
                  "Preferred calendar used to display this date to the user.",
   :rdfs/domain  :wikibase/TimeValue,
   :rdfs/label   #xsd/string "timeCalendarModel",
   :rdfs/range   :wikibase/Item})

(def timePrecision
  "Datetime precision."
  {:db/ident     :wikibase/timePrecision,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "Datetime precision.",
   :rdfs/domain  :wikibase/TimeValue,
   :rdfs/label   #xsd/string "timePrecision",
   :rdfs/range   :xsd/nonNegativeInteger})

(def timeTimezone
  "Timezone offset from UTC in minutes."
  {:db/ident     :wikibase/timeTimezone,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "Timezone offset from UTC in minutes.",
   :rdfs/domain  :wikibase/TimeValue,
   :rdfs/label   #xsd/string "timeTimezone",
   :rdfs/range   :xsd/decimal})

(def timeValue
  "Time value as datetime literal."
  {:db/ident     :wikibase/timeValue,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "Time value as datetime literal.",
   :rdfs/domain  :wikibase/TimeValue,
   :rdfs/label   #xsd/string "timeValue",
   :rdfs/range   :xsd/dateTime})

(def wikiGroup
  "Wiki group that the site belongs to."
  {:db/ident     :wikibase/wikiGroup,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "Wiki group that the site belongs to.",
   :rdfs/label   #xsd/string "wikiGroup"})