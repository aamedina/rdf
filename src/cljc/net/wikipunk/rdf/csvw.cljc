(ns net.wikipunk.rdf.csvw
  {:dc11/date #xsd/date #inst "2017-06-06T00:00:00.000-04:00",
   :dc11/description
   #xsd/langString
    "This document describes the RDFS vocabulary description used in the Metadata Vocabulary for Tabular Data [[tabular-metadata]] along with the default JSON-LD Context.@en",
   :dc11/title #xsd/langString "CSVW Namespace Vocabulary Terms@en",
   :owl/imports {:rdfa/uri "http://www.w3.org/ns/prov"},
   :owl/versionInfo
   {:rdfa/uri
    "https://github.com/w3c/csvw/commit/fcc9db20ba4de10e41e964eee1b5d01defa4c664"},
   :rdf/ns-prefix-map {"as" "https://www.w3.org/ns/activitystreams#",
                       "cc" "http://creativecommons.org/ns#",
                       "csvw" "http://www.w3.org/ns/csvw#",
                       "ctag" "http://commontag.org/ns#",
                       "dc11" "http://purl.org/dc/terms/",
                       "dcat" "http://www.w3.org/ns/dcat#",
                       "dcmitype" "http://purl.org/dc/dcmitype/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "dqv" "http://www.w3.org/ns/dqv#",
                       "duv" "https://www.w3.org/TR/vocab-duv#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "gr" "http://purl.org/goodrelations/v1#",
                       "grddl" "http://www.w3.org/2003/g/data-view#",
                       "ical" "http://www.w3.org/2002/12/cal/icaltzd#",
                       "ldp" "http://www.w3.org/ns/ldp#",
                       "ma" "http://www.w3.org/ns/ma-ont#",
                       "oa" "http://www.w3.org/ns/oa#",
                       "og" "http://ogp.me/ns#",
                       "org" "http://www.w3.org/ns/org#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "qb" "http://purl.org/linked-data/cube#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfa" "http://www.w3.org/ns/rdfa#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "rev" "http://purl.org/stuff/rev#",
                       "rif" "http://www.w3.org/2007/rif#",
                       "rr" "http://www.w3.org/ns/r2rml#",
                       "schema" "http://schema.org/",
                       "sd" "http://www.w3.org/ns/sparql-service-description#",
                       "sioc" "http://rdfs.org/sioc/ns#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "skosxl" "http://www.w3.org/2008/05/skos-xl#",
                       "v" "http://rdf.data-vocabulary.org/#",
                       "vcard" "http://www.w3.org/2006/vcard/ns#",
                       "void" "http://rdfs.org/ns/void#",
                       "wdr" "http://www.w3.org/2007/05/powder#",
                       "wrds" "http://www.w3.org/2007/05/powder-s#",
                       "xhv" "http://www.w3.org/1999/xhtml/vocab#",
                       "xml" "http://www.w3.org/XML/1998/namespace",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "csvw",
   :rdfa/uri "http://www.w3.org/ns/csvw#",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/TR/tabular-metadata/"},
   :rdfs/seeAlso {:rdfa/uri "http://www.w3.org/TR/tabular-metadata"}}
  (:refer-clojure :exclude [format name]))

(def Cell
  {:db/ident :csvw/Cell,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A Cell represents a cell at the intersection of a Row and a Column within a Table.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Cell@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Column
  {:db/ident :csvw/Column,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A Column represents a vertical arrangement of Cells within a Table.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Column Description@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Datatype
  {:db/ident         :csvw/Datatype,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/langString "Describes facets of a datatype.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label       #xsd/langString "Datatype@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def Dialect
  {:db/ident :csvw/Dialect,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A Dialect Description provides hints to parsers about how to parse a linked file.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Dialect Description@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Direction
  {:db/ident         :csvw/Direction,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/langString "The class of table/text directions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label       #xsd/langString "Direction@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def ForeignKey
  {:db/ident :csvw/ForeignKey,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Describes relationships between Columns in one or more Tables.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Foreign Key Definition@en",
   :rdfs/subClassOf :rdfs/Resource})

(def JSON
  {:db/ident         :csvw/JSON,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     #xsd/langString "A literal containing JSON.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label       #xsd/langString "JSON@en",
   :rdfs/subClassOf  :xsd/string})

(def NumericFormat
  {:db/ident :csvw/NumericFormat,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "If the datatype is a numeric type, the format property indicates the expected format for that number. Its value must be either a single string or an object with one or more properties.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Numeric Format@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Row
  {:db/ident :csvw/Row,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A Row represents a horizontal arrangement of cells within a Table.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Row@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Schema
  {:db/ident :csvw/Schema,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A Schema is a definition of a tabular format that may be common to multiple tables.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Schema@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Table
  {:db/ident :csvw/Table,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "An annotated table is a table that is annotated with additional metadata.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Annotated Table@en",
   :rdfs/subClassOf :rdfs/Resource})

(def TableGroup
  {:db/ident :csvw/TableGroup,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A Group of Tables comprises a set of Annotated Tables and a set of annotations that relate to those Tables.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Group of Tables@en",
   :rdfs/subClassOf :rdfs/Resource})

(def TableReference
  {:db/ident :csvw/TableReference,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "An object property that identifies a referenced table and a set of referenced columns within that table.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Table Reference@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Transformation
  {:db/ident :csvw/Transformation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A Transformation Definition is a definition of how tabular data can be transformed into another format.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Transformation Definition@en",
   :rdfs/subClassOf :rdfs/Resource})

(def aboutUrl
  {:db/ident :csvw/aboutUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A URI template property that MAY be used to indicate what a cell contains information about.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "about URL@en",
   :rdfs/range :csvw/uriTemplate})

(def auto
  {:db/ident :csvw/auto,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Indicates whether the tables in the group should be displayed based on the first character in the table that has a specific direction.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "auto@en"})

(def base
  {:db/ident :csvw/base,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that contains a single string: a term defined in the default context representing a built-in datatype URL, as listed above.@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "base@en",
   :rdfs/range :xsd/string})

(def column
  {:db/ident :csvw/column,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An array property of column descriptions as described in section 5.6 Columns.@en",
   :rdfs/domain :csvw/Schema,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "column@en",
   :rdfs/range :csvw/Column})

(def columnReference
  {:db/ident :csvw/columnReference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A column reference property that holds either a single reference to a column description object within this schema, or an array of references. These form the referencing columns for the foreign key definition.@en",
   :rdfs/domain {:owl/unionOf [:csvw/ForeignKey :csvw/TableReference]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "column reference@en",
   :rdfs/range :xsd/string})

(def commentPrefix
  {:db/ident :csvw/commentPrefix,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that sets the comment prefix flag to the single provided value, which MUST be a string.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "comment prefix@en",
   :rdfs/range :xsd/string})

(def csvEncodedTabularData
  {:db/ident :csvw/csvEncodedTabularData,
   :rdf/type :prov/Role,
   :rdfs/comment
   #xsd/langString
    "Describes the role of a CSV file in the tabular data mapping.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "CSV Encoded Tabular Data@en"})

(def datatype
  {:db/ident :csvw/datatype,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An object property that contains either a single string that is the main datatype of the values of the cell or a datatype description object. If the value of this property is a string, it MUST be one of the built-in datatypes defined in section 5.11.1 Built-in Datatypes or an absolute URL; if it is an object then it describes a more specialised datatype.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "datatype@en",
   :rdfs/range {:owl/unionOf [:csvw/Datatype :xsd/string]}})

(def decimalChar
  {:db/ident :csvw/decimalChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A string whose value is used to represent a decimal point within the number.@en",
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "decimal character@en",
   :rdfs/range :xsd/string})

(def default
  {:db/ident :csvw/default,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property holding a single string that is used to create a default value for the cell in cases where the original string value is an empty string.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "default@en",
   :rdfs/range :xsd/string})

(def delimiter
  {:db/ident :csvw/delimiter,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that sets the delimiter flag to the single provided value, which MUST be a string.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "delimiter@en",
   :rdfs/range :xsd/string})

(def describes
  {:db/ident :csvw/describes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "From IANA describes: The relationship A 'describes' B asserts that resource A provides a description of resource B. There are no constraints on the format or representation of either A or B, neither are there any further constraints on either resource.@en",
   :rdfs/domain :csvw/Row,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "describes@en"})

(def dialect
  {:db/ident :csvw/dialect,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An object property that provides a single dialect description. If provided, dialect provides hints to processors about how to parse the referenced files to create tabular data models for the tables in the group.@en",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "dialect@en",
   :rdfs/range :csvw/Dialect})

(def doubleQuote
  {:db/ident :csvw/doubleQuote,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A boolean atomic property that, if `true`, sets the escape character flag to `\"`.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "double quote@en",
   :rdfs/range :xsd/boolean})

(def encoding
  {:db/ident :csvw/encoding,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that sets the encoding flag to the single provided string value, which MUST be a defined in [[encoding]]. The default is \"utf-8\".@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "encoding@en",
   :rdfs/range :xsd/string})

(def foreignKey
  {:db/ident :csvw/foreignKey,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "For a Table: a list of foreign keys on the table.\n\nFor a Schema: an array property of foreign key definitions that define how the values from specified columns within this table link to rows within this table or other tables.@en",
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Schema]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "foreign key@en",
   :rdfs/range :csvw/ForeignKey})

(def format
  {:db/ident :csvw/format,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that contains either a single string or an object that defines the format of a value of this type, used when parsing a string value as described in Parsing Cells in [[tabular-data-model]].@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "format@en",
   :rdfs/range :xsd/string})

(def groupChar
  {:db/ident :csvw/groupChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A string whose value is used to group digits within the number.@en",
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "group character@en",
   :rdfs/range {:owl/unionOf [:csvw/NumericFormat :xsd/string]}})

(def header
  {:db/ident :csvw/header,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A boolean atomic property that, if `true`, sets the header row count flag to `1`, and if `false` to `0`, unless headerRowCount is provided, in which case the value provided for the header property is ignored.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "header@en",
   :rdfs/range :xsd/boolean})

(def headerRowCount
  {:db/ident :csvw/headerRowCount,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An numeric atomic property that sets the header row count flag to the single provided value, which must be a non-negative integer.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "header row count@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def inherit
  {:db/ident :csvw/inherit,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "For `textDirection`, indicates that the direction is inherited from the `tableDirection` annotation of the `table`.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "inherit@en"})

(def lang
  {:db/ident :csvw/lang,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property giving a single string language code as defined by [[BCP47]].@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "language@en",
   :rdfs/range :xsd/string})

(def length
  {:db/ident         :csvw/length,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "The exact length of the value of the cell.@en",
   :rdfs/domain      :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label       #xsd/langString "length@en",
   :rdfs/range       :xsd/nonNegativeInteger})

(def lineTerminators
  {:db/ident :csvw/lineTerminators,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that sets the line terminators flag to either an array containing the single provided string value, or the provided array.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "line terminators@en",
   :rdfs/range :xsd/string})

(def ltr
  {:db/ident :csvw/ltr,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Indicates whether the tables in the group should be displayed with the first column on the right.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "left to right@en"})

(def maxExclusive
  {:db/ident :csvw/maxExclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that contains a single number that is the maximum valid value (exclusive).@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "max exclusive@en",
   :rdfs/range :xsd/integer})

(def maxInclusive
  {:db/ident :csvw/maxInclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that contains a single number that is the maximum valid value (inclusive).@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "max inclusive@en",
   :rdfs/range :xsd/integer})

(def maxLength
  {:db/ident :csvw/maxLength,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A numeric atomic property that contains a single integer that is the maximum length of the value.@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "max length@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def minExclusive
  {:db/ident :csvw/minExclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that contains a single number that is the minimum valid value (exclusive).@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "min exclusive@en",
   :rdfs/range :xsd/integer})

(def minInclusive
  {:db/ident :csvw/minInclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that contains a single number that is the minimum valid value (inclusive).@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "min inclusive@en",
   :rdfs/range :xsd/integer})

(def minLength
  {:db/ident :csvw/minLength,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that contains a single integer that is the minimum length of the value.@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "min length@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def name
  {:db/ident :csvw/name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that gives a single canonical name for the column. The value of this property becomes the name annotation for the described column.@en",
   :rdfs/domain :csvw/Column,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "name@en",
   :rdfs/range :xsd/string})

(def note
  {:db/ident :csvw/note,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An array property that provides an array of objects representing arbitrary annotations on the annotated tabular data model.@en",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "note@en"})

(def null
  {:db/ident :csvw/null,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property giving the string or strings used for null values within the data. If the string value of the cell is equal to any one of these values, the cell value is `null`.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "null@en",
   :rdfs/range :xsd/string})

(def ordered
  {:db/ident :csvw/ordered,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A boolean atomic property taking a single value which indicates whether a list that is the value of the cell is ordered (if `true`) or unordered (if `false`).@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "ordered@en",
   :rdfs/range :xsd/boolean})

(def pattern
  {:db/ident :csvw/pattern,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A regular expression string, in the syntax and interpreted as defined by [[ECMASCRIPT]].@en",
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "pattern@en",
   :rdfs/range :xsd/string})

(def primaryKey
  {:db/ident :csvw/primaryKey,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "For Schema: A column reference property that holds either a single reference to a column description object or an array of references.\n\nFor Row: a possibly empty list of cells whose values together provide a unique identifier for this row. This is similar to the name of a column.@en",
   :rdfs/domain {:owl/unionOf [:csvw/Schema :csvw/Row]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "primary key@en",
   :rdfs/range :xsd/string})

(def propertyUrl
  {:db/ident :csvw/propertyUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An URI template property that MAY be used to create a URI for a property if the table is mapped to another format. @en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "property URL@en",
   :rdfs/range :csvw/uriTemplate})

(def quoteChar
  {:db/ident :csvw/quoteChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that sets the quote character flag to the single provided value, which must be a string or `null`.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "quote char@en",
   :rdfs/range :xsd/string})

(def reference
  {:db/ident :csvw/reference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An object property that identifies a **referenced table** and a set of **referenced columns** within that table.@en",
   :rdfs/domain :csvw/ForeignKey,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "reference@en",
   :rdfs/range :csvw/TableReference})

(def referencedRow
  {:db/ident :csvw/referencedRow,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A possibly empty list of pairs of a foreign key and a row in a table within the same group of tables.@en",
   :rdfs/domain :csvw/Row,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "referenced rows@en"})

(def required
  {:db/ident :csvw/required,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A boolean atomic property taking a single value which indicates whether the cell must have a non-null value. The default is `false`. @en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "required@en",
   :rdfs/range :xsd/boolean})

(def resource
  {:db/ident :csvw/resource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A link property holding a URL that is the identifier for a specific table that is being referenced.@en",
   :rdfs/domain :csvw/TableReference,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "resource@en",
   :rdfs/range :xsd/anyURI})

(def row
  {:db/ident           :csvw/row,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString "Relates a Table to each Row output.@en",
   :rdfs/domain        :csvw/Table,
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label         #xsd/langString "row@en",
   :rdfs/range         :csvw/Row,
   :rdfs/subPropertyOf :rdfs/member})

(def rowTitle
  {:db/ident :csvw/rowTitle,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A column reference property that holds either a single reference to a column description object or an array of references.@en",
   :rdfs/domain :csvw/Schema,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "row titles@en",
   :rdfs/range :xsd/string})

(def rownum
  {:db/ident :csvw/rownum,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The position of the row amongst the rows of the Annotated Tabl, starting from 1@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "row number@en",
   :rdfs/range :xsd/integer})

(def rtl
  {:db/ident :csvw/rtl,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Indicates whether the tables in the group should be displayed with the first column on the left.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "right to left@en"})

(def schemaReference
  {:db/ident :csvw/schemaReference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A link property holding a URL that is the identifier for a schema that is being referenced.@en",
   :rdfs/domain :csvw/TableReference,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "schema reference@en",
   :rdfs/range :xsd/anyURI})

(def scriptFormat
  {:db/ident :csvw/scriptFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A link property giving the single URL for the format that is used by the script or template.@en",
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "script format@en",
   :rdfs/range :xsd/anyURI})

(def separator
  {:db/ident :csvw/separator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that MUST have a single string value that is the character used to separate items in the string value of the cell.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "separator@en",
   :rdfs/range :xsd/string})

(def skipBlankRows
  {:db/ident :csvw/skipBlankRows,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An boolean atomic property that sets the `skip blank rows` flag to the single provided boolean value.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "skip blank rows@en",
   :rdfs/range :xsd/boolean})

(def skipColumns
  {:db/ident :csvw/skipColumns,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An numeric atomic property that sets the `skip columns` flag to the single provided numeric value, which MUST be a non-negative integer.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "skip columns@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def skipInitialSpace
  {:db/ident :csvw/skipInitialSpace,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A boolean atomic property that, if `true`, sets the trim flag to \"start\". If `false`, to `false`.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "skip initial space@en",
   :rdfs/range :xsd/boolean})

(def skipRows
  {:db/ident :csvw/skipRows,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An numeric atomic property that sets the `skip rows` flag to the single provided numeric value, which MUST be a non-negative integer.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "skip rows@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def source
  {:db/ident :csvw/source,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A single string atomic property that provides, if specified, the format to which the tabular data should be transformed prior to the transformation using the script or template.@en",
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "source@en",
   :rdfs/range :xsd/string})

(def suppressOutput
  {:db/ident :csvw/suppressOutput,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A boolean atomic property. If `true`, suppresses any output that would be generated when converting a table or cells within a column.@en",
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "suppress output@en",
   :rdfs/range :xsd/boolean})

(def table
  {:db/ident           :csvw/table,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #xsd/langString
                        "Relates an Table group to annotated tables.@en",
   :rdfs/domain        :csvw/TableGroup,
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label         #xsd/langString "table@en",
   :rdfs/range         :csvw/Table,
   :rdfs/subPropertyOf :rdfs/member})

(def tableDirection
  {:db/ident :csvw/tableDirection,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "One of `rtl`, `ltr` or `auto`. Indicates whether the tables in the group should be displayed with the first column on the right, on the left, or based on the first character in the table that has a specific direction.@en",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "table direction@en",
   :rdfs/range :csvw/Direction})

(def tableSchema
  {:db/ident :csvw/tableSchema,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An object property that provides a single schema description as described in section 5.5 Schemas, used as the default for all the tables in the group@en",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "table schema@en",
   :rdfs/range :csvw/Schema})

(def tabularMetadata
  {:db/ident :csvw/tabularMetadata,
   :rdf/type :prov/Role,
   :rdfs/comment
   #xsd/langString
    "Describes the role of a Metadata file in the tabular data mapping.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "Tabular Metadata@en"})

(def targetFormat
  {:db/ident :csvw/targetFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A link property giving the single URL for the format that will be created through the transformation.@en",
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "target format@en",
   :rdfs/range :xsd/anyURI})

(def textDirection
  {:db/ident :csvw/textDirection,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that must have a single value that is one of `rtl` or `ltr` (the default).@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "text direction@en",
   :rdfs/range :csvw/Direction})

(def title
  {:db/ident :csvw/title,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "For a Transformation A natural language property that describes the format that will be generated from the transformation.\n\nFor a Column: A natural language property that provides possible alternative names for the column.@en",
   :rdfs/domain {:owl/unionOf [:csvw/Transformation :csvw/Column :csvw/Row]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "title@en"})

(def transformations
  {:db/ident :csvw/transformations,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An array property of transformation definitions that provide mechanisms to transform the tabular data into other formats.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "transformations@en",
   :rdfs/range :csvw/Transformation})

(def trim
  {:db/ident :csvw/trim,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An atomic property that, if the boolean `true`, sets the trim flag to `true` and if the boolean `false` to `false`. If the value provided is a string, sets the trim flag to the provided value, which must be one of \"true\", \"false\", \"start\" or \"end\".@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "trim@en",
   :rdfs/range :xsd/boolean})

(def uriTemplate
  {:db/ident         :csvw/uriTemplate,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     #xsd/langString "@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label       #xsd/langString "uri template@en",
   :rdfs/subClassOf  :xsd/string})

(def url
  {:db/ident :csvw/url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "For a Table: This link property gives the single URL of the CSV file that the table is held in, relative to the location of the metadata document.\n\nFor a Transformation: A link property giving the single URL of the file that the script or template is held in, relative to the location of the metadata document.@en",
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Transformation]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "url@en",
   :rdfs/range :xsd/anyURI})

(def valueUrl
  {:db/ident :csvw/valueUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An URI template property that is used to map the values of cells into URLs.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "valueUrl@en",
   :rdfs/range :csvw/uriTemplate})

(def virtual
  {:db/ident :csvw/virtual,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A boolean atomic property taking a single value which indicates whether the column is a virtual column not present in the original source@en",
   :rdfs/domain :csvw/Column,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #xsd/langString "virtual@en",
   :rdfs/range :xsd/boolean})