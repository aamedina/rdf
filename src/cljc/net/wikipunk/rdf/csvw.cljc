(ns net.wikipunk.rdf.csvw
  "http://www.w3.org/ns/csvw#"
  {:dc11/date #inst "2017-06-06T00:00:00.000-04:00",
   :dc11/description
   "This document describes the RDFS vocabulary description used in the Metadata Vocabulary for Tabular Data [[tabular-metadata]] along with the default JSON-LD Context.",
   :dc11/title "CSVW Namespace Vocabulary Terms",
   :owl/imports "http://www.w3.org/ns/prov",
   :owl/versionInfo
   "https://github.com/w3c/csvw/commit/fcc9db20ba4de10e41e964eee1b5d01defa4c664",
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
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/tabular-metadata/"},
   :rdfs/seeAlso ["http://www.w3.org/TR/tabular-metadata"]}
  (:refer-clojure :exclude [format name]))

(def Cell
  "A Cell represents a cell at the intersection of a Row and a Column within a Table."
  {:db/ident :csvw/Cell,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Cell represents a cell at the intersection of a Row and a Column within a Table.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Cell",
   :rdfs/subClassOf [:rdfs/Resource :csvw/Cell]})

(def Column
  "A Column represents a vertical arrangement of Cells within a Table."
  {:db/ident :csvw/Column,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Column represents a vertical arrangement of Cells within a Table.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Column Description",
   :rdfs/subClassOf [:rdfs/Resource :csvw/Column]})

(def Datatype
  "Describes facets of a datatype."
  {:db/ident         :csvw/Datatype,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "Describes facets of a datatype.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label       "Datatype",
   :rdfs/subClassOf  [:rdfs/Resource :csvw/Datatype]})

(def Dialect
  "A Dialect Description provides hints to parsers about how to parse a linked file."
  {:db/ident :csvw/Dialect,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Dialect Description provides hints to parsers about how to parse a linked file.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Dialect Description",
   :rdfs/subClassOf [:rdfs/Resource :csvw/Dialect]})

(def Direction
  "The class of table/text directions."
  {:db/ident         :csvw/Direction,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of table/text directions.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label       "Direction",
   :rdfs/subClassOf  [:rdfs/Resource :csvw/Direction]})

(def ForeignKey
  "Describes relationships between Columns in one or more Tables."
  {:db/ident :csvw/ForeignKey,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Describes relationships between Columns in one or more Tables.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Foreign Key Definition",
   :rdfs/subClassOf [:rdfs/Resource :csvw/ForeignKey]})

(def JSON
  "A literal containing JSON."
  {:db/ident         :csvw/JSON,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     "A literal containing JSON.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label       "JSON",
   :rdfs/subClassOf  [:xsd/string :csvw/JSON]})

(def NumericFormat
  "If the datatype is a numeric type, the format property indicates the expected format for that number. Its value must be either a single string or an object with one or more properties."
  {:db/ident :csvw/NumericFormat,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "If the datatype is a numeric type, the format property indicates the expected format for that number. Its value must be either a single string or an object with one or more properties.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Numeric Format",
   :rdfs/subClassOf [:rdfs/Resource :csvw/NumericFormat]})

(def Row
  "A Row represents a horizontal arrangement of cells within a Table."
  {:db/ident :csvw/Row,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Row represents a horizontal arrangement of cells within a Table.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Row",
   :rdfs/subClassOf [:rdfs/Resource :csvw/Row]})

(def Schema
  "A Schema is a definition of a tabular format that may be common to multiple tables."
  {:db/ident :csvw/Schema,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Schema is a definition of a tabular format that may be common to multiple tables.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Schema",
   :rdfs/subClassOf [:rdfs/Resource :csvw/Schema]})

(def Table
  "An annotated table is a table that is annotated with additional metadata."
  {:db/ident :csvw/Table,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An annotated table is a table that is annotated with additional metadata.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Annotated Table",
   :rdfs/subClassOf [:rdfs/Resource :csvw/Table]})

(def TableGroup
  "A Group of Tables comprises a set of Annotated Tables and a set of annotations that relate to those Tables."
  {:db/ident :csvw/TableGroup,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Group of Tables comprises a set of Annotated Tables and a set of annotations that relate to those Tables.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Group of Tables",
   :rdfs/subClassOf [:rdfs/Resource :csvw/TableGroup]})

(def TableReference
  "An object property that identifies a referenced table and a set of referenced columns within that table."
  {:db/ident :csvw/TableReference,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An object property that identifies a referenced table and a set of referenced columns within that table.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Table Reference",
   :rdfs/subClassOf [:rdfs/Resource :csvw/TableReference]})

(def Transformation
  "A Transformation Definition is a definition of how tabular data can be transformed into another format."
  {:db/ident :csvw/Transformation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Transformation Definition is a definition of how tabular data can be transformed into another format.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Transformation Definition",
   :rdfs/subClassOf [:rdfs/Resource :csvw/Transformation]})

(def aboutUrl
  "A URI template property that MAY be used to indicate what a cell contains information about."
  {:db/ident :csvw/aboutUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A URI template property that MAY be used to indicate what a cell contains information about.",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "about URL",
   :rdfs/range :csvw/uriTemplate,
   :rdfs/subPropertyOf :csvw/aboutUrl})

(def auto
  "Indicates whether the tables in the group should be displayed based on the first character in the table that has a specific direction."
  {:db/ident :csvw/auto,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   "Indicates whether the tables in the group should be displayed based on the first character in the table that has a specific direction.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "auto"})

(def base
  "An atomic property that contains a single string: a term defined in the default context representing a built-in datatype URL, as listed above."
  {:db/ident :csvw/base,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that contains a single string: a term defined in the default context representing a built-in datatype URL, as listed above.",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "base",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/base})

(def column
  "An array property of column descriptions as described in section 5.6 Columns."
  {:db/ident :csvw/column,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An array property of column descriptions as described in section 5.6 Columns.",
   :rdfs/domain :csvw/Schema,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "column",
   :rdfs/range :csvw/Column,
   :rdfs/subPropertyOf :csvw/column})

(def columnReference
  "A column reference property that holds either a single reference to a column description object within this schema, or an array of references. These form the referencing columns for the foreign key definition."
  {:db/ident :csvw/columnReference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A column reference property that holds either a single reference to a column description object within this schema, or an array of references. These form the referencing columns for the foreign key definition.",
   :rdfs/domain {:owl/unionOf [:csvw/ForeignKey :csvw/TableReference]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "column reference",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/columnReference})

(def commentPrefix
  "An atomic property that sets the comment prefix flag to the single provided value, which MUST be a string."
  {:db/ident :csvw/commentPrefix,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that sets the comment prefix flag to the single provided value, which MUST be a string.",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "comment prefix",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/commentPrefix})

(def csvEncodedTabularData
  "Describes the role of a CSV file in the tabular data mapping."
  {:db/ident :csvw/csvEncodedTabularData,
   :rdf/type :prov/Role,
   :rdfs/comment
   "Describes the role of a CSV file in the tabular data mapping.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "CSV Encoded Tabular Data"})

(def datatype
  "An object property that contains either a single string that is the main datatype of the values of the cell or a datatype description object. If the value of this property is a string, it MUST be one of the built-in datatypes defined in section 5.11.1 Built-in Datatypes or an absolute URL; if it is an object then it describes a more specialised datatype."
  {:db/ident :csvw/datatype,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An object property that contains either a single string that is the main datatype of the values of the cell or a datatype description object. If the value of this property is a string, it MUST be one of the built-in datatypes defined in section 5.11.1 Built-in Datatypes or an absolute URL; if it is an object then it describes a more specialised datatype.",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "datatype",
   :rdfs/range {:owl/unionOf [:csvw/Datatype :xsd/string]},
   :rdfs/subPropertyOf :csvw/datatype})

(def decimalChar
  "A string whose value is used to represent a decimal point within the number."
  {:db/ident :csvw/decimalChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A string whose value is used to represent a decimal point within the number.",
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "decimal character",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/decimalChar})

(def default
  "An atomic property holding a single string that is used to create a default value for the cell in cases where the original string value is an empty string."
  {:db/ident :csvw/default,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property holding a single string that is used to create a default value for the cell in cases where the original string value is an empty string.",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "default",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/default})

(def delimiter
  "An atomic property that sets the delimiter flag to the single provided value, which MUST be a string."
  {:db/ident :csvw/delimiter,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that sets the delimiter flag to the single provided value, which MUST be a string.",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "delimiter",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/delimiter})

(def describes
  "From IANA describes: The relationship A 'describes' B asserts that resource A provides a description of resource B. There are no constraints on the format or representation of either A or B, neither are there any further constraints on either resource."
  {:db/ident :csvw/describes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "From IANA describes: The relationship A 'describes' B asserts that resource A provides a description of resource B. There are no constraints on the format or representation of either A or B, neither are there any further constraints on either resource.",
   :rdfs/domain :csvw/Row,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "describes",
   :rdfs/subPropertyOf :csvw/describes})

(def dialect
  "An object property that provides a single dialect description. If provided, dialect provides hints to processors about how to parse the referenced files to create tabular data models for the tables in the group."
  {:db/ident :csvw/dialect,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An object property that provides a single dialect description. If provided, dialect provides hints to processors about how to parse the referenced files to create tabular data models for the tables in the group.",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "dialect",
   :rdfs/range :csvw/Dialect,
   :rdfs/subPropertyOf :csvw/dialect})

(def doubleQuote
  "A boolean atomic property that, if `true`, sets the escape character flag to `\"`."
  {:db/ident :csvw/doubleQuote,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A boolean atomic property that, if `true`, sets the escape character flag to `\"`.",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "double quote",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :csvw/doubleQuote})

(def encoding
  "An atomic property that sets the encoding flag to the single provided string value, which MUST be a defined in [[encoding]]. The default is \"utf-8\"."
  {:db/ident :csvw/encoding,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that sets the encoding flag to the single provided string value, which MUST be a defined in [[encoding]]. The default is \"utf-8\".",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "encoding",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/encoding})

(def foreignKey
  "For a Table: a list of foreign keys on the table. For a Schema: an array property of foreign key definitions that define how the values from specified columns within this table link to rows within this table or other tables."
  {:db/ident :csvw/foreignKey,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "For a Table: a list of foreign keys on the table.\n\nFor a Schema: an array property of foreign key definitions that define how the values from specified columns within this table link to rows within this table or other tables.",
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Schema]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "foreign key",
   :rdfs/range :csvw/ForeignKey,
   :rdfs/subPropertyOf :csvw/foreignKey})

(def format
  "An atomic property that contains either a single string or an object that defines the format of a value of this type, used when parsing a string value as described in Parsing Cells in [[tabular-data-model]]."
  {:db/ident :csvw/format,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that contains either a single string or an object that defines the format of a value of this type, used when parsing a string value as described in Parsing Cells in [[tabular-data-model]].",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "format",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/format})

(def groupChar
  "A string whose value is used to group digits within the number."
  {:db/ident :csvw/groupChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A string whose value is used to group digits within the number.",
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "group character",
   :rdfs/range {:owl/unionOf [:csvw/NumericFormat :xsd/string]},
   :rdfs/subPropertyOf :csvw/groupChar})

(def header
  "A boolean atomic property that, if `true`, sets the header row count flag to `1`, and if `false` to `0`, unless headerRowCount is provided, in which case the value provided for the header property is ignored."
  {:db/ident :csvw/header,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A boolean atomic property that, if `true`, sets the header row count flag to `1`, and if `false` to `0`, unless headerRowCount is provided, in which case the value provided for the header property is ignored.",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "header",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :csvw/header})

(def headerRowCount
  "An numeric atomic property that sets the header row count flag to the single provided value, which must be a non-negative integer."
  {:db/ident :csvw/headerRowCount,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An numeric atomic property that sets the header row count flag to the single provided value, which must be a non-negative integer.",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "header row count",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :csvw/headerRowCount})

(def inherit
  "For `textDirection`, indicates that the direction is inherited from the `tableDirection` annotation of the `table`."
  {:db/ident :csvw/inherit,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   "For `textDirection`, indicates that the direction is inherited from the `tableDirection` annotation of the `table`.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "inherit"})

(def lang
  "An atomic property giving a single string language code as defined by [[BCP47]]."
  {:db/ident :csvw/lang,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property giving a single string language code as defined by [[BCP47]].",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "language",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/lang})

(def length
  "The exact length of the value of the cell."
  {:db/ident           :csvw/length,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The exact length of the value of the cell.",
   :rdfs/domain        :csvw/Datatype,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/csvw#",
   :rdfs/label         "length",
   :rdfs/range         :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :csvw/length})

(def lineTerminators
  "An atomic property that sets the line terminators flag to either an array containing the single provided string value, or the provided array."
  {:db/ident :csvw/lineTerminators,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that sets the line terminators flag to either an array containing the single provided string value, or the provided array.",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "line terminators",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/lineTerminators})

(def ltr
  "Indicates whether the tables in the group should be displayed with the first column on the right."
  {:db/ident :csvw/ltr,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   "Indicates whether the tables in the group should be displayed with the first column on the right.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "left to right"})

(def maxExclusive
  "An atomic property that contains a single number that is the maximum valid value (exclusive)."
  {:db/ident :csvw/maxExclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that contains a single number that is the maximum valid value (exclusive).",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "max exclusive",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :csvw/maxExclusive})

(def maxInclusive
  "An atomic property that contains a single number that is the maximum valid value (inclusive)."
  {:db/ident :csvw/maxInclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that contains a single number that is the maximum valid value (inclusive).",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "max inclusive",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :csvw/maxInclusive})

(def maxLength
  "A numeric atomic property that contains a single integer that is the maximum length of the value."
  {:db/ident :csvw/maxLength,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A numeric atomic property that contains a single integer that is the maximum length of the value.",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "max length",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :csvw/maxLength})

(def minExclusive
  "An atomic property that contains a single number that is the minimum valid value (exclusive)."
  {:db/ident :csvw/minExclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that contains a single number that is the minimum valid value (exclusive).",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "min exclusive",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :csvw/minExclusive})

(def minInclusive
  "An atomic property that contains a single number that is the minimum valid value (inclusive)."
  {:db/ident :csvw/minInclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that contains a single number that is the minimum valid value (inclusive).",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "min inclusive",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :csvw/minInclusive})

(def minLength
  "An atomic property that contains a single integer that is the minimum length of the value."
  {:db/ident :csvw/minLength,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that contains a single integer that is the minimum length of the value.",
   :rdfs/domain :csvw/Datatype,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "min length",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :csvw/minLength})

(def name
  "An atomic property that gives a single canonical name for the column. The value of this property becomes the name annotation for the described column."
  {:db/ident :csvw/name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that gives a single canonical name for the column. The value of this property becomes the name annotation for the described column.",
   :rdfs/domain :csvw/Column,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "name",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/name})

(def note
  "An array property that provides an array of objects representing arbitrary annotations on the annotated tabular data model."
  {:db/ident :csvw/note,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An array property that provides an array of objects representing arbitrary annotations on the annotated tabular data model.",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "note",
   :rdfs/subPropertyOf :csvw/note})

(def null
  "An atomic property giving the string or strings used for null values within the data. If the string value of the cell is equal to any one of these values, the cell value is `null`."
  {:db/ident :csvw/null,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property giving the string or strings used for null values within the data. If the string value of the cell is equal to any one of these values, the cell value is `null`.",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "null",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/null})

(def ordered
  "A boolean atomic property taking a single value which indicates whether a list that is the value of the cell is ordered (if `true`) or unordered (if `false`)."
  {:db/ident :csvw/ordered,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A boolean atomic property taking a single value which indicates whether a list that is the value of the cell is ordered (if `true`) or unordered (if `false`).",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "ordered",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :csvw/ordered})

(def pattern
  "A regular expression string, in the syntax and interpreted as defined by [[ECMASCRIPT]]."
  {:db/ident :csvw/pattern,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A regular expression string, in the syntax and interpreted as defined by [[ECMASCRIPT]].",
   :rdfs/domain :csvw/NumericFormat,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "pattern",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/pattern})

(def primaryKey
  "For Schema: A column reference property that holds either a single reference to a column description object or an array of references. For Row: a possibly empty list of cells whose values together provide a unique identifier for this row. This is similar to the name of a column."
  {:db/ident :csvw/primaryKey,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "For Schema: A column reference property that holds either a single reference to a column description object or an array of references.\n\nFor Row: a possibly empty list of cells whose values together provide a unique identifier for this row. This is similar to the name of a column.",
   :rdfs/domain {:owl/unionOf [:csvw/Schema :csvw/Row]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "primary key",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/primaryKey})

(def propertyUrl
  "An URI template property that MAY be used to create a URI for a property if the table is mapped to another format."
  {:db/ident :csvw/propertyUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An URI template property that MAY be used to create a URI for a property if the table is mapped to another format. ",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "property URL",
   :rdfs/range :csvw/uriTemplate,
   :rdfs/subPropertyOf :csvw/propertyUrl})

(def quoteChar
  "An atomic property that sets the quote character flag to the single provided value, which must be a string or `null`."
  {:db/ident :csvw/quoteChar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that sets the quote character flag to the single provided value, which must be a string or `null`.",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "quote char",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/quoteChar})

(def reference
  "An object property that identifies a **referenced table** and a set of **referenced columns** within that table."
  {:db/ident :csvw/reference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An object property that identifies a **referenced table** and a set of **referenced columns** within that table.",
   :rdfs/domain :csvw/ForeignKey,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "reference",
   :rdfs/range :csvw/TableReference,
   :rdfs/subPropertyOf :csvw/reference})

(def referencedRow
  "A possibly empty list of pairs of a foreign key and a row in a table within the same group of tables."
  {:db/ident :csvw/referencedRow,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A possibly empty list of pairs of a foreign key and a row in a table within the same group of tables.",
   :rdfs/domain :csvw/Row,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "referenced rows",
   :rdfs/subPropertyOf :csvw/referencedRow})

(def required
  "A boolean atomic property taking a single value which indicates whether the cell must have a non-null value. The default is `false`."
  {:db/ident :csvw/required,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A boolean atomic property taking a single value which indicates whether the cell must have a non-null value. The default is `false`. ",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "required",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :csvw/required})

(def resource
  "A link property holding a URL that is the identifier for a specific table that is being referenced."
  {:db/ident :csvw/resource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A link property holding a URL that is the identifier for a specific table that is being referenced.",
   :rdfs/domain :csvw/TableReference,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "resource",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :csvw/resource})

(def row
  "Relates a Table to each Row output."
  {:db/ident           :csvw/row,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Relates a Table to each Row output.",
   :rdfs/domain        :csvw/Table,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/csvw#",
   :rdfs/label         "row",
   :rdfs/range         :csvw/Row,
   :rdfs/subPropertyOf [:rdfs/member :csvw/row]})

(def rowTitle
  "A column reference property that holds either a single reference to a column description object or an array of references."
  {:db/ident :csvw/rowTitle,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A column reference property that holds either a single reference to a column description object or an array of references.",
   :rdfs/domain :csvw/Schema,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "row titles",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/rowTitle})

(def rownum
  "The position of the row amongst the rows of the Annotated Tabl, starting from 1"
  {:db/ident :csvw/rownum,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The position of the row amongst the rows of the Annotated Tabl, starting from 1",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "row number",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :csvw/rownum})

(def rtl
  "Indicates whether the tables in the group should be displayed with the first column on the left."
  {:db/ident :csvw/rtl,
   :rdf/type [:csvw/Direction :rdfs/Resource],
   :rdfs/comment
   "Indicates whether the tables in the group should be displayed with the first column on the left.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "right to left"})

(def schemaReference
  "A link property holding a URL that is the identifier for a schema that is being referenced."
  {:db/ident :csvw/schemaReference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A link property holding a URL that is the identifier for a schema that is being referenced.",
   :rdfs/domain :csvw/TableReference,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "schema reference",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :csvw/schemaReference})

(def scriptFormat
  "A link property giving the single URL for the format that is used by the script or template."
  {:db/ident :csvw/scriptFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A link property giving the single URL for the format that is used by the script or template.",
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "script format",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :csvw/scriptFormat})

(def separator
  "An atomic property that MUST have a single string value that is the character used to separate items in the string value of the cell."
  {:db/ident :csvw/separator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that MUST have a single string value that is the character used to separate items in the string value of the cell.",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "separator",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/separator})

(def skipBlankRows
  "An boolean atomic property that sets the `skip blank rows` flag to the single provided boolean value."
  {:db/ident :csvw/skipBlankRows,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An boolean atomic property that sets the `skip blank rows` flag to the single provided boolean value.",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "skip blank rows",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :csvw/skipBlankRows})

(def skipColumns
  "An numeric atomic property that sets the `skip columns` flag to the single provided numeric value, which MUST be a non-negative integer."
  {:db/ident :csvw/skipColumns,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An numeric atomic property that sets the `skip columns` flag to the single provided numeric value, which MUST be a non-negative integer.",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "skip columns",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :csvw/skipColumns})

(def skipInitialSpace
  "A boolean atomic property that, if `true`, sets the trim flag to \"start\". If `false`, to `false`."
  {:db/ident :csvw/skipInitialSpace,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A boolean atomic property that, if `true`, sets the trim flag to \"start\". If `false`, to `false`.",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "skip initial space",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :csvw/skipInitialSpace})

(def skipRows
  "An numeric atomic property that sets the `skip rows` flag to the single provided numeric value, which MUST be a non-negative integer."
  {:db/ident :csvw/skipRows,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An numeric atomic property that sets the `skip rows` flag to the single provided numeric value, which MUST be a non-negative integer.",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "skip rows",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :csvw/skipRows})

(def source
  "A single string atomic property that provides, if specified, the format to which the tabular data should be transformed prior to the transformation using the script or template."
  {:db/ident :csvw/source,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A single string atomic property that provides, if specified, the format to which the tabular data should be transformed prior to the transformation using the script or template.",
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "source",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :csvw/source})

(def suppressOutput
  "A boolean atomic property. If `true`, suppresses any output that would be generated when converting a table or cells within a column."
  {:db/ident :csvw/suppressOutput,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A boolean atomic property. If `true`, suppresses any output that would be generated when converting a table or cells within a column.",
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "suppress output",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :csvw/suppressOutput})

(def table
  "Relates an Table group to annotated tables."
  {:db/ident           :csvw/table,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Relates an Table group to annotated tables.",
   :rdfs/domain        :csvw/TableGroup,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/csvw#",
   :rdfs/label         "table",
   :rdfs/range         :csvw/Table,
   :rdfs/subPropertyOf [:rdfs/member :csvw/table]})

(def tableDirection
  "One of `rtl`, `ltr` or `auto`. Indicates whether the tables in the group should be displayed with the first column on the right, on the left, or based on the first character in the table that has a specific direction."
  {:db/ident :csvw/tableDirection,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "One of `rtl`, `ltr` or `auto`. Indicates whether the tables in the group should be displayed with the first column on the right, on the left, or based on the first character in the table that has a specific direction.",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "table direction",
   :rdfs/range :csvw/Direction,
   :rdfs/subPropertyOf :csvw/tableDirection})

(def tableSchema
  "An object property that provides a single schema description as described in section 5.5 Schemas, used as the default for all the tables in the group"
  {:db/ident :csvw/tableSchema,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An object property that provides a single schema description as described in section 5.5 Schemas, used as the default for all the tables in the group",
   :rdfs/domain {:owl/unionOf [:csvw/TableGroup :csvw/Table]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "table schema",
   :rdfs/range :csvw/Schema,
   :rdfs/subPropertyOf :csvw/tableSchema})

(def tabularMetadata
  "Describes the role of a Metadata file in the tabular data mapping."
  {:db/ident :csvw/tabularMetadata,
   :rdf/type :prov/Role,
   :rdfs/comment
   "Describes the role of a Metadata file in the tabular data mapping.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "Tabular Metadata"})

(def targetFormat
  "A link property giving the single URL for the format that will be created through the transformation."
  {:db/ident :csvw/targetFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A link property giving the single URL for the format that will be created through the transformation.",
   :rdfs/domain :csvw/Transformation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "target format",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :csvw/targetFormat})

(def textDirection
  "An atomic property that must have a single value that is one of `rtl` or `ltr` (the default)."
  {:db/ident :csvw/textDirection,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that must have a single value that is one of `rtl` or `ltr` (the default).",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "text direction",
   :rdfs/range :csvw/Direction,
   :rdfs/subPropertyOf :csvw/textDirection})

(def title
  "For a Transformation A natural language property that describes the format that will be generated from the transformation. For a Column: A natural language property that provides possible alternative names for the column."
  {:db/ident :csvw/title,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "For a Transformation A natural language property that describes the format that will be generated from the transformation.\n\nFor a Column: A natural language property that provides possible alternative names for the column.",
   :rdfs/domain {:owl/unionOf [:csvw/Transformation :csvw/Column :csvw/Row]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "title",
   :rdfs/subPropertyOf :csvw/title})

(def transformations
  "An array property of transformation definitions that provide mechanisms to transform the tabular data into other formats."
  {:db/ident :csvw/transformations,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An array property of transformation definitions that provide mechanisms to transform the tabular data into other formats.",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "transformations",
   :rdfs/range :csvw/Transformation,
   :rdfs/subPropertyOf :csvw/transformations})

(def trim
  "An atomic property that, if the boolean `true`, sets the trim flag to `true` and if the boolean `false` to `false`. If the value provided is a string, sets the trim flag to the provided value, which must be one of \"true\", \"false\", \"start\" or \"end\"."
  {:db/ident :csvw/trim,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An atomic property that, if the boolean `true`, sets the trim flag to `true` and if the boolean `false` to `false`. If the value provided is a string, sets the trim flag to the provided value, which must be one of \"true\", \"false\", \"start\" or \"end\".",
   :rdfs/domain :csvw/Dialect,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "trim",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :csvw/trim})

(def uriTemplate
  ""
  {:db/ident         :csvw/uriTemplate,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     "",
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label       "uri template",
   :rdfs/subClassOf  [:xsd/string :csvw/uriTemplate]})

(def url
  "For a Table: This link property gives the single URL of the CSV file that the table is held in, relative to the location of the metadata document. For a Transformation: A link property giving the single URL of the file that the script or template is held in, relative to the location of the metadata document."
  {:db/ident :csvw/url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "For a Table: This link property gives the single URL of the CSV file that the table is held in, relative to the location of the metadata document.\n\nFor a Transformation: A link property giving the single URL of the file that the script or template is held in, relative to the location of the metadata document.",
   :rdfs/domain {:owl/unionOf [:csvw/Table :csvw/Transformation]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "url",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :csvw/url})

(def valueUrl
  "An URI template property that is used to map the values of cells into URLs."
  {:db/ident :csvw/valueUrl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An URI template property that is used to map the values of cells into URLs.",
   :rdfs/domain
   {:owl/unionOf [:csvw/TableGroup :csvw/Table :csvw/Schema :csvw/Column]},
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "valueUrl",
   :rdfs/range :csvw/uriTemplate,
   :rdfs/subPropertyOf :csvw/valueUrl})

(def virtual
  "A boolean atomic property taking a single value which indicates whether the column is a virtual column not present in the original source"
  {:db/ident :csvw/virtual,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A boolean atomic property taking a single value which indicates whether the column is a virtual column not present in the original source",
   :rdfs/domain :csvw/Column,
   :rdfs/isDefinedBy "http://www.w3.org/ns/csvw#",
   :rdfs/label "virtual",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :csvw/virtual})