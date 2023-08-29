(ns net.wikipunk.rdf.csvw
  "This document describes the RDFS vocabulary description used in the Metadata Vocabulary for Tabular Data [[tabular-metadata]] along with the default JSON-LD Context."
  {:dc11/date #xsd/date #inst "2017-06-06T00:00:00.000-04:00",
   :dc11/description
   #rdf/langString
    "This document describes the RDFS vocabulary description used in the Metadata Vocabulary for Tabular Data [[tabular-metadata]] along with the default JSON-LD Context.@en",
   :dc11/title #rdf/langString "CSVW Namespace Vocabulary Terms@en",
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
  "A Cell represents a cell at the intersection of a Row and a Column within a Table."
  {:db/ident :csvw/Cell,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "A Cell represents a cell at the intersection of a Row and a Column within a Table.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Cell@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Column
  "A Column represents a vertical arrangement of Cells within a Table."
  {:db/ident :csvw/Column,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "A Column represents a vertical arrangement of Cells within a Table.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Column Description@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Datatype
  "Describes facets of a datatype."
  {:db/ident         :csvw/Datatype,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #rdf/langString "Describes facets of a datatype.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label       #rdf/langString "Datatype@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def Dialect
  "A Dialect Description provides hints to parsers about how to parse a linked file."
  {:db/ident :csvw/Dialect,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "A Dialect Description provides hints to parsers about how to parse a linked file.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Dialect Description@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Direction
  "The class of table/text directions."
  {:db/ident         :csvw/Direction,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #rdf/langString "The class of table/text directions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label       #rdf/langString "Direction@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def ForeignKey
  "Describes relationships between Columns in one or more Tables."
  {:db/ident :csvw/ForeignKey,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Describes relationships between Columns in one or more Tables.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Foreign Key Definition@en",
   :rdfs/subClassOf :rdfs/Resource})

(def JSON
  "A literal containing JSON."
  {:db/ident         :csvw/JSON,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     #rdf/langString "A literal containing JSON.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label       #rdf/langString "JSON@en",
   :rdfs/subClassOf  :xsd/string})

(def NumericFormat
  "If the datatype is a numeric type, the format property indicates the expected format for that number. Its value must be either a single string or an object with one or more properties."
  {:db/ident :csvw/NumericFormat,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "If the datatype is a numeric type, the format property indicates the expected format for that number. Its value must be either a single string or an object with one or more properties.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Numeric Format@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Row
  "A Row represents a horizontal arrangement of cells within a Table."
  {:db/ident :csvw/Row,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "A Row represents a horizontal arrangement of cells within a Table.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Row@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Schema
  "A Schema is a definition of a tabular format that may be common to multiple tables."
  {:db/ident :csvw/Schema,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "A Schema is a definition of a tabular format that may be common to multiple tables.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Schema@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Table
  "An annotated table is a table that is annotated with additional metadata."
  {:db/ident :csvw/Table,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "An annotated table is a table that is annotated with additional metadata.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Annotated Table@en",
   :rdfs/subClassOf :rdfs/Resource})

(def TableGroup
  "A Group of Tables comprises a set of Annotated Tables and a set of annotations that relate to those Tables."
  {:db/ident :csvw/TableGroup,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "A Group of Tables comprises a set of Annotated Tables and a set of annotations that relate to those Tables.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Group of Tables@en",
   :rdfs/subClassOf :rdfs/Resource})

(def TableReference
  "An object property that identifies a referenced table and a set of referenced columns within that table."
  {:db/ident :csvw/TableReference,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "An object property that identifies a referenced table and a set of referenced columns within that table.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Table Reference@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Transformation
  "A Transformation Definition is a definition of how tabular data can be transformed into another format."
  {:db/ident :csvw/Transformation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "A Transformation Definition is a definition of how tabular data can be transformed into another format.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Transformation Definition@en",
   :rdfs/subClassOf :rdfs/Resource})

(def aboutUrl
  "A URI template property that MAY be used to indicate what a cell contains information about."
  {:db/ident :csvw/aboutUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A URI template property that MAY be used to indicate what a cell contains information about.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "about URL@en",
   :rdfs/range :csvw/uriTemplate})

(def auto
  "Indicates whether the tables in the group should be displayed based on the first character in the table that has a specific direction."
  {:db/ident :csvw/auto,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   #rdf/langString
    "Indicates whether the tables in the group should be displayed based on the first character in the table that has a specific direction.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "auto@en"})

(def base
  "An atomic property that contains a single string: a term defined in the default context representing a built-in datatype URL, as listed above."
  {:db/ident :csvw/base,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that contains a single string: a term defined in the default context representing a built-in datatype URL, as listed above.@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "base@en",
   :rdfs/range :xsd/string})

(def column
  "An array property of column descriptions as described in section 5.6 Columns."
  {:db/ident :csvw/column,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An array property of column descriptions as described in section 5.6 Columns.@en",
   :rdfs/domain :csvw/Schema,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "column@en",
   :rdfs/range :csvw/Column})

(def columnReference
  "A column reference property that holds either a single reference to a column description object within this schema, or an array of references. These form the referencing columns for the foreign key definition."
  {:db/ident :csvw/columnReference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A column reference property that holds either a single reference to a column description object within this schema, or an array of references. These form the referencing columns for the foreign key definition.@en",
   :rdfs/domain {:owl/unionOf [:csvw/ForeignKey :csvw/TableReference]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "column reference@en",
   :rdfs/range :xsd/string})

(def commentPrefix
  "An atomic property that sets the comment prefix flag to the single provided value, which MUST be a string."
  {:db/ident :csvw/commentPrefix,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that sets the comment prefix flag to the single provided value, which MUST be a string.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "comment prefix@en",
   :rdfs/range :xsd/string})

(def csvEncodedTabularData
  "Describes the role of a CSV file in the tabular data mapping."
  {:db/ident :csvw/csvEncodedTabularData,
   :rdf/type :prov/Role,
   :rdfs/comment
   #rdf/langString
    "Describes the role of a CSV file in the tabular data mapping.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "CSV Encoded Tabular Data@en"})

(def datatype
  "An object property that contains either a single string that is the main datatype of the values of the cell or a datatype description object. If the value of this property is a string, it MUST be one of the built-in datatypes defined in section 5.11.1 Built-in Datatypes or an absolute URL; if it is an object then it describes a more specialised datatype."
  {:db/ident :csvw/datatype,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An object property that contains either a single string that is the main datatype of the values of the cell or a datatype description object. If the value of this property is a string, it MUST be one of the built-in datatypes defined in section 5.11.1 Built-in Datatypes or an absolute URL; if it is an object then it describes a more specialised datatype.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "datatype@en",
   :rdfs/range {:owl/unionOf [:csvw/Datatype :xsd/string]}})

(def decimalChar
  "A string whose value is used to represent a decimal point within the number."
  {:db/ident :csvw/decimalChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A string whose value is used to represent a decimal point within the number.@en",
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "decimal character@en",
   :rdfs/range :xsd/string})

(def default
  "An atomic property holding a single string that is used to create a default value for the cell in cases where the original string value is an empty string."
  {:db/ident :csvw/default,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property holding a single string that is used to create a default value for the cell in cases where the original string value is an empty string.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "default@en",
   :rdfs/range :xsd/string})

(def delimiter
  "An atomic property that sets the delimiter flag to the single provided value, which MUST be a string."
  {:db/ident :csvw/delimiter,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that sets the delimiter flag to the single provided value, which MUST be a string.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "delimiter@en",
   :rdfs/range :xsd/string})

(def describes
  "From IANA describes: The relationship A 'describes' B asserts that resource A provides a description of resource B. There are no constraints on the format or representation of either A or B, neither are there any further constraints on either resource."
  {:db/ident :csvw/describes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "From IANA describes: The relationship A 'describes' B asserts that resource A provides a description of resource B. There are no constraints on the format or representation of either A or B, neither are there any further constraints on either resource.@en",
   :rdfs/domain :csvw/Row,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "describes@en"})

(def dialect
  "An object property that provides a single dialect description. If provided, dialect provides hints to processors about how to parse the referenced files to create tabular data models for the tables in the group."
  {:db/ident :csvw/dialect,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An object property that provides a single dialect description. If provided, dialect provides hints to processors about how to parse the referenced files to create tabular data models for the tables in the group.@en",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "dialect@en",
   :rdfs/range :csvw/Dialect})

(def doubleQuote
  "A boolean atomic property that, if `true`, sets the escape character flag to `\"`."
  {:db/ident :csvw/doubleQuote,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A boolean atomic property that, if `true`, sets the escape character flag to `\"`.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "double quote@en",
   :rdfs/range :xsd/boolean})

(def encoding
  "An atomic property that sets the encoding flag to the single provided string value, which MUST be a defined in [[encoding]]. The default is \"utf-8\"."
  {:db/ident :csvw/encoding,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that sets the encoding flag to the single provided string value, which MUST be a defined in [[encoding]]. The default is \"utf-8\".@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "encoding@en",
   :rdfs/range :xsd/string})

(def foreignKey
  "For a Table: a list of foreign keys on the table.\n\nFor a Schema: an array property of foreign key definitions that define how the values from specified columns within this table link to rows within this table or other tables."
  {:db/ident :csvw/foreignKey,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "For a Table: a list of foreign keys on the table.\n\nFor a Schema: an array property of foreign key definitions that define how the values from specified columns within this table link to rows within this table or other tables.@en",
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Schema]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "foreign key@en",
   :rdfs/range :csvw/ForeignKey})

(def format
  "An atomic property that contains either a single string or an object that defines the format of a value of this type, used when parsing a string value as described in Parsing Cells in [[tabular-data-model]]."
  {:db/ident :csvw/format,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that contains either a single string or an object that defines the format of a value of this type, used when parsing a string value as described in Parsing Cells in [[tabular-data-model]].@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "format@en",
   :rdfs/range :xsd/string})

(def groupChar
  "A string whose value is used to group digits within the number."
  {:db/ident :csvw/groupChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A string whose value is used to group digits within the number.@en",
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "group character@en",
   :rdfs/range {:owl/unionOf [:csvw/NumericFormat :xsd/string]}})

(def header
  "A boolean atomic property that, if `true`, sets the header row count flag to `1`, and if `false` to `0`, unless headerRowCount is provided, in which case the value provided for the header property is ignored."
  {:db/ident :csvw/header,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A boolean atomic property that, if `true`, sets the header row count flag to `1`, and if `false` to `0`, unless headerRowCount is provided, in which case the value provided for the header property is ignored.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "header@en",
   :rdfs/range :xsd/boolean})

(def headerRowCount
  "An numeric atomic property that sets the header row count flag to the single provided value, which must be a non-negative integer."
  {:db/ident :csvw/headerRowCount,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An numeric atomic property that sets the header row count flag to the single provided value, which must be a non-negative integer.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "header row count@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def inherit
  "For `textDirection`, indicates that the direction is inherited from the `tableDirection` annotation of the `table`."
  {:db/ident :csvw/inherit,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   #rdf/langString
    "For `textDirection`, indicates that the direction is inherited from the `tableDirection` annotation of the `table`.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "inherit@en"})

(def lang
  "An atomic property giving a single string language code as defined by [[BCP47]]."
  {:db/ident :csvw/lang,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property giving a single string language code as defined by [[BCP47]].@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "language@en",
   :rdfs/range :xsd/string})

(def length
  "The exact length of the value of the cell."
  {:db/ident         :csvw/length,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #rdf/langString
                      "The exact length of the value of the cell.@en",
   :rdfs/domain      :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label       #rdf/langString "length@en",
   :rdfs/range       :xsd/nonNegativeInteger})

(def lineTerminators
  "An atomic property that sets the line terminators flag to either an array containing the single provided string value, or the provided array."
  {:db/ident :csvw/lineTerminators,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that sets the line terminators flag to either an array containing the single provided string value, or the provided array.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "line terminators@en",
   :rdfs/range :xsd/string})

(def ltr
  "Indicates whether the tables in the group should be displayed with the first column on the right."
  {:db/ident :csvw/ltr,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   #rdf/langString
    "Indicates whether the tables in the group should be displayed with the first column on the right.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "left to right@en"})

(def maxExclusive
  "An atomic property that contains a single number that is the maximum valid value (exclusive)."
  {:db/ident :csvw/maxExclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that contains a single number that is the maximum valid value (exclusive).@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "max exclusive@en",
   :rdfs/range :xsd/integer})

(def maxInclusive
  "An atomic property that contains a single number that is the maximum valid value (inclusive)."
  {:db/ident :csvw/maxInclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that contains a single number that is the maximum valid value (inclusive).@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "max inclusive@en",
   :rdfs/range :xsd/integer})

(def maxLength
  "A numeric atomic property that contains a single integer that is the maximum length of the value."
  {:db/ident :csvw/maxLength,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A numeric atomic property that contains a single integer that is the maximum length of the value.@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "max length@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def minExclusive
  "An atomic property that contains a single number that is the minimum valid value (exclusive)."
  {:db/ident :csvw/minExclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that contains a single number that is the minimum valid value (exclusive).@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "min exclusive@en",
   :rdfs/range :xsd/integer})

(def minInclusive
  "An atomic property that contains a single number that is the minimum valid value (inclusive)."
  {:db/ident :csvw/minInclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that contains a single number that is the minimum valid value (inclusive).@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "min inclusive@en",
   :rdfs/range :xsd/integer})

(def minLength
  "An atomic property that contains a single integer that is the minimum length of the value."
  {:db/ident :csvw/minLength,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that contains a single integer that is the minimum length of the value.@en",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "min length@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def name
  "An atomic property that gives a single canonical name for the column. The value of this property becomes the name annotation for the described column."
  {:db/ident :csvw/name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that gives a single canonical name for the column. The value of this property becomes the name annotation for the described column.@en",
   :rdfs/domain :csvw/Column,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "name@en",
   :rdfs/range :xsd/string})

(def note
  "An array property that provides an array of objects representing arbitrary annotations on the annotated tabular data model."
  {:db/ident :csvw/note,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An array property that provides an array of objects representing arbitrary annotations on the annotated tabular data model.@en",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "note@en"})

(def null
  "An atomic property giving the string or strings used for null values within the data. If the string value of the cell is equal to any one of these values, the cell value is `null`."
  {:db/ident :csvw/null,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property giving the string or strings used for null values within the data. If the string value of the cell is equal to any one of these values, the cell value is `null`.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "null@en",
   :rdfs/range :xsd/string})

(def ordered
  "A boolean atomic property taking a single value which indicates whether a list that is the value of the cell is ordered (if `true`) or unordered (if `false`)."
  {:db/ident :csvw/ordered,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A boolean atomic property taking a single value which indicates whether a list that is the value of the cell is ordered (if `true`) or unordered (if `false`).@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "ordered@en",
   :rdfs/range :xsd/boolean})

(def pattern
  "A regular expression string, in the syntax and interpreted as defined by [[ECMASCRIPT]]."
  {:db/ident :csvw/pattern,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A regular expression string, in the syntax and interpreted as defined by [[ECMASCRIPT]].@en",
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "pattern@en",
   :rdfs/range :xsd/string})

(def primaryKey
  "For Schema: A column reference property that holds either a single reference to a column description object or an array of references.\n\nFor Row: a possibly empty list of cells whose values together provide a unique identifier for this row. This is similar to the name of a column."
  {:db/ident :csvw/primaryKey,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "For Schema: A column reference property that holds either a single reference to a column description object or an array of references.\n\nFor Row: a possibly empty list of cells whose values together provide a unique identifier for this row. This is similar to the name of a column.@en",
   :rdfs/domain {:owl/unionOf [:csvw/Schema :csvw/Row]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "primary key@en",
   :rdfs/range :xsd/string})

(def propertyUrl
  "An URI template property that MAY be used to create a URI for a property if the table is mapped to another format. "
  {:db/ident :csvw/propertyUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An URI template property that MAY be used to create a URI for a property if the table is mapped to another format. @en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "property URL@en",
   :rdfs/range :csvw/uriTemplate})

(def quoteChar
  "An atomic property that sets the quote character flag to the single provided value, which must be a string or `null`."
  {:db/ident :csvw/quoteChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that sets the quote character flag to the single provided value, which must be a string or `null`.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "quote char@en",
   :rdfs/range :xsd/string})

(def reference
  "An object property that identifies a **referenced table** and a set of **referenced columns** within that table."
  {:db/ident :csvw/reference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An object property that identifies a **referenced table** and a set of **referenced columns** within that table.@en",
   :rdfs/domain :csvw/ForeignKey,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "reference@en",
   :rdfs/range :csvw/TableReference})

(def referencedRow
  "A possibly empty list of pairs of a foreign key and a row in a table within the same group of tables."
  {:db/ident :csvw/referencedRow,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A possibly empty list of pairs of a foreign key and a row in a table within the same group of tables.@en",
   :rdfs/domain :csvw/Row,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "referenced rows@en"})

(def required
  "A boolean atomic property taking a single value which indicates whether the cell must have a non-null value. The default is `false`. "
  {:db/ident :csvw/required,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A boolean atomic property taking a single value which indicates whether the cell must have a non-null value. The default is `false`. @en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "required@en",
   :rdfs/range :xsd/boolean})

(def resource
  "A link property holding a URL that is the identifier for a specific table that is being referenced."
  {:db/ident :csvw/resource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A link property holding a URL that is the identifier for a specific table that is being referenced.@en",
   :rdfs/domain :csvw/TableReference,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "resource@en",
   :rdfs/range :xsd/anyURI})

(def row
  "Relates a Table to each Row output."
  {:db/ident           :csvw/row,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "Relates a Table to each Row output.@en",
   :rdfs/domain        :csvw/Table,
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label         #rdf/langString "row@en",
   :rdfs/range         :csvw/Row,
   :rdfs/subPropertyOf :rdfs/member})

(def rowTitle
  "A column reference property that holds either a single reference to a column description object or an array of references."
  {:db/ident :csvw/rowTitle,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A column reference property that holds either a single reference to a column description object or an array of references.@en",
   :rdfs/domain :csvw/Schema,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "row titles@en",
   :rdfs/range :xsd/string})

(def rownum
  "The position of the row amongst the rows of the Annotated Tabl, starting from 1"
  {:db/ident :csvw/rownum,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The position of the row amongst the rows of the Annotated Tabl, starting from 1@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "row number@en",
   :rdfs/range :xsd/integer})

(def rtl
  "Indicates whether the tables in the group should be displayed with the first column on the left."
  {:db/ident :csvw/rtl,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   #rdf/langString
    "Indicates whether the tables in the group should be displayed with the first column on the left.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "right to left@en"})

(def schemaReference
  "A link property holding a URL that is the identifier for a schema that is being referenced."
  {:db/ident :csvw/schemaReference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A link property holding a URL that is the identifier for a schema that is being referenced.@en",
   :rdfs/domain :csvw/TableReference,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "schema reference@en",
   :rdfs/range :xsd/anyURI})

(def scriptFormat
  "A link property giving the single URL for the format that is used by the script or template."
  {:db/ident :csvw/scriptFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A link property giving the single URL for the format that is used by the script or template.@en",
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "script format@en",
   :rdfs/range :xsd/anyURI})

(def separator
  "An atomic property that MUST have a single string value that is the character used to separate items in the string value of the cell."
  {:db/ident :csvw/separator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that MUST have a single string value that is the character used to separate items in the string value of the cell.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "separator@en",
   :rdfs/range :xsd/string})

(def skipBlankRows
  "An boolean atomic property that sets the `skip blank rows` flag to the single provided boolean value."
  {:db/ident :csvw/skipBlankRows,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An boolean atomic property that sets the `skip blank rows` flag to the single provided boolean value.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "skip blank rows@en",
   :rdfs/range :xsd/boolean})

(def skipColumns
  "An numeric atomic property that sets the `skip columns` flag to the single provided numeric value, which MUST be a non-negative integer."
  {:db/ident :csvw/skipColumns,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An numeric atomic property that sets the `skip columns` flag to the single provided numeric value, which MUST be a non-negative integer.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "skip columns@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def skipInitialSpace
  "A boolean atomic property that, if `true`, sets the trim flag to \"start\". If `false`, to `false`."
  {:db/ident :csvw/skipInitialSpace,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A boolean atomic property that, if `true`, sets the trim flag to \"start\". If `false`, to `false`.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "skip initial space@en",
   :rdfs/range :xsd/boolean})

(def skipRows
  "An numeric atomic property that sets the `skip rows` flag to the single provided numeric value, which MUST be a non-negative integer."
  {:db/ident :csvw/skipRows,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An numeric atomic property that sets the `skip rows` flag to the single provided numeric value, which MUST be a non-negative integer.@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "skip rows@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def source
  "A single string atomic property that provides, if specified, the format to which the tabular data should be transformed prior to the transformation using the script or template."
  {:db/ident :csvw/source,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A single string atomic property that provides, if specified, the format to which the tabular data should be transformed prior to the transformation using the script or template.@en",
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "source@en",
   :rdfs/range :xsd/string})

(def suppressOutput
  "A boolean atomic property. If `true`, suppresses any output that would be generated when converting a table or cells within a column."
  {:db/ident :csvw/suppressOutput,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A boolean atomic property. If `true`, suppresses any output that would be generated when converting a table or cells within a column.@en",
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "suppress output@en",
   :rdfs/range :xsd/boolean})

(def table
  "Relates an Table group to annotated tables."
  {:db/ident           :csvw/table,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "Relates an Table group to annotated tables.@en",
   :rdfs/domain        :csvw/TableGroup,
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label         #rdf/langString "table@en",
   :rdfs/range         :csvw/Table,
   :rdfs/subPropertyOf :rdfs/member})

(def tableDirection
  "One of `rtl`, `ltr` or `auto`. Indicates whether the tables in the group should be displayed with the first column on the right, on the left, or based on the first character in the table that has a specific direction."
  {:db/ident :csvw/tableDirection,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "One of `rtl`, `ltr` or `auto`. Indicates whether the tables in the group should be displayed with the first column on the right, on the left, or based on the first character in the table that has a specific direction.@en",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "table direction@en",
   :rdfs/range :csvw/Direction})

(def tableSchema
  "An object property that provides a single schema description as described in section 5.5 Schemas, used as the default for all the tables in the group"
  {:db/ident :csvw/tableSchema,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An object property that provides a single schema description as described in section 5.5 Schemas, used as the default for all the tables in the group@en",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "table schema@en",
   :rdfs/range :csvw/Schema})

(def tabularMetadata
  "Describes the role of a Metadata file in the tabular data mapping."
  {:db/ident :csvw/tabularMetadata,
   :rdf/type :prov/Role,
   :rdfs/comment
   #rdf/langString
    "Describes the role of a Metadata file in the tabular data mapping.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "Tabular Metadata@en"})

(def targetFormat
  "A link property giving the single URL for the format that will be created through the transformation."
  {:db/ident :csvw/targetFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A link property giving the single URL for the format that will be created through the transformation.@en",
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "target format@en",
   :rdfs/range :xsd/anyURI})

(def textDirection
  "An atomic property that must have a single value that is one of `rtl` or `ltr` (the default)."
  {:db/ident :csvw/textDirection,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that must have a single value that is one of `rtl` or `ltr` (the default).@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "text direction@en",
   :rdfs/range :csvw/Direction})

(def title
  "For a Transformation A natural language property that describes the format that will be generated from the transformation.\n\nFor a Column: A natural language property that provides possible alternative names for the column."
  {:db/ident :csvw/title,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "For a Transformation A natural language property that describes the format that will be generated from the transformation.\n\nFor a Column: A natural language property that provides possible alternative names for the column.@en",
   :rdfs/domain {:owl/unionOf [:csvw/Transformation :csvw/Column :csvw/Row]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "title@en"})

(def transformations
  "An array property of transformation definitions that provide mechanisms to transform the tabular data into other formats."
  {:db/ident :csvw/transformations,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An array property of transformation definitions that provide mechanisms to transform the tabular data into other formats.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "transformations@en",
   :rdfs/range :csvw/Transformation})

(def trim
  "An atomic property that, if the boolean `true`, sets the trim flag to `true` and if the boolean `false` to `false`. If the value provided is a string, sets the trim flag to the provided value, which must be one of \"true\", \"false\", \"start\" or \"end\"."
  {:db/ident :csvw/trim,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An atomic property that, if the boolean `true`, sets the trim flag to `true` and if the boolean `false` to `false`. If the value provided is a string, sets the trim flag to the provided value, which must be one of \"true\", \"false\", \"start\" or \"end\".@en",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "trim@en",
   :rdfs/range :xsd/boolean})

(def uriTemplate
  ""
  {:db/ident         :csvw/uriTemplate,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     #rdf/langString "@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label       #rdf/langString "uri template@en",
   :rdfs/subClassOf  :xsd/string})

(def url
  "For a Table: This link property gives the single URL of the CSV file that the table is held in, relative to the location of the metadata document.\n\nFor a Transformation: A link property giving the single URL of the file that the script or template is held in, relative to the location of the metadata document."
  {:db/ident :csvw/url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "For a Table: This link property gives the single URL of the CSV file that the table is held in, relative to the location of the metadata document.\n\nFor a Transformation: A link property giving the single URL of the file that the script or template is held in, relative to the location of the metadata document.@en",
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Transformation]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "url@en",
   :rdfs/range :xsd/anyURI})

(def valueUrl
  "An URI template property that is used to map the values of cells into URLs."
  {:db/ident :csvw/valueUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An URI template property that is used to map the values of cells into URLs.@en",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "valueUrl@en",
   :rdfs/range :csvw/uriTemplate})

(def virtual
  "A boolean atomic property taking a single value which indicates whether the column is a virtual column not present in the original source"
  {:db/ident :csvw/virtual,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A boolean atomic property taking a single value which indicates whether the column is a virtual column not present in the original source@en",
   :rdfs/domain :csvw/Column,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/csvw#"},
   :rdfs/label #rdf/langString "virtual@en",
   :rdfs/range :xsd/boolean})
