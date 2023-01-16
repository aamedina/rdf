(ns net.wikipunk.rdf.qudt.type
  "QUDT Vocabulary of Datatypes v2.1.23"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/qudt/qudt-public-repo/main/vocab/types/VOCAB_QUDT-DATATYPES-v2.1.ttl",
   :owl/imports           ["http://www.linkedmodel.org/schema/vaem"
                           "http://www.linkedmodel.org/schema/dtype"
                           "http://qudt.org/2.1/schema/facade/qudt"
                           "http://qudt.org/2.1/schema/datatype"],
   :rdf/ns-prefix-map     {"dcterms"      "http://purl.org/dc/elements/1.1/",
                           "dtype"        "http://www.linkedmodel.org/schema/dtype#",
                           "owl"          "http://www.w3.org/2002/07/owl#",
                           "prov"         "http://www.w3.org/ns/prov#",
                           "qudt"         "http://qudt.org/schema/qudt/",
                           "qudt-refdata" "http://qudt.org/vocab/refdata/",
                           "rdf"          "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                           "rdfs"         "http://www.w3.org/2000/01/rdf-schema#",
                           "skos"         "http://www.w3.org/2004/02/skos/core#",
                           "vaem"         "http://www.linkedmodel.org/schema/vaem#",
                           "voag"         "http://voag.linkedmodel.org/schema/voag#",
                           "xsd"          "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type              :owl/Ontology,
   :rdf/uri               "http://qudt.org/2.1/vocab/datatype",
   :rdfa/prefix           "qudt.type",
   :rdfa/uri              "http://qudt.org/2.1/vocab/type/",
   :rdfs/label            "QUDT Vocabulary of Datatypes v2.1.23",
   :vaem/hasGraphMetadata "http://qudt.org/vocab/datatype/GMD_datatypes",
   :vaem/hasGraphRole     :vaem/VocabularyGraph})

(def ACYCLIC-GRAPH
  "Acyclic Graph"
  {:db/ident         :qudt.type/ACYCLIC-GRAPH,
   :rdf/type         [:qudt/Graph :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Acyclic Graph"})

(def ALPHANUMERIC
  "ALPHANUMERIC"
  {:db/ident          :qudt.type/ALPHANUMERIC,
   :dtype/literal     "alphanumeric",
   :qudt/bits         8,
   :qudt/code         106,
   :qudt/id           "T001-00",
   :qudt/literal      "alphanumeric",
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type          [:qudt/CharacterType :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "ALPHANUMERIC"})

(def ARRAY
  "Multi-dimensional array of elements of scalar types. The number of array dimensions are expressed as an unsigned integer (octet). Elements are arranged in a sequence with the most significant dimension occurs first."
  {:db/ident         :qudt.type/ARRAY,
   :dcterms/description
   "Multi-dimensional array of elements of scalar types. The number of array dimensions are expressed as an unsigned integer (octet). Elements are arranged in a sequence with the most significant dimension occurs first.",
   :rdf/type         [:qudt/Array :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "ARRAY"})

(def B-TREE
  "B-Tree"
  {:db/ident         :qudt.type/B-TREE,
   :rdf/type         [:qudt/BalancedTree :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "B-Tree"})

(def BALANCED-TREE
  "Balanced Tree"
  {:db/ident         :qudt.type/BALANCED-TREE,
   :rdf/type         [:qudt/BalancedTree :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Balanced Tree"})

(def BINARY-HEAP
  "A \"Binary Heap\" is one where the maximum number of children each node can have is at most two."
  {:db/ident         :qudt.type/BINARY-HEAP,
   :dcterms/description
   "A \"Binary Heap\" is one where the maximum number of children each node can have is at most two.",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Heap_(data_structure)",
   :rdf/type         [:qudt/Heap :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Binary Heap"})

(def BINARY-TREE
  "<p class=\"lm-para\">A \"Binary Tree\" is a tree data structure in which each node has at most two child nodes, usually distinguished as \"left\" and \"right\". Nodes with children are parent nodes, and child nodes may contain references to their parents. Outside the tree, there is often a reference to the \"root\" node (the ancestor of all nodes), if it exists. Any node in the data structure can be reached by starting at root node and repeatedly following references to either the left or right child. A tree which does not have any node other than root node is called a null tree. In a binary tree, a degree of every node is maximum two. A tree with <i>n</i> nodes has exactly <i>n-1</i> branches or degree.</p>"
  {:db/ident          :qudt.type/BINARY-TREE,
   :dcterms/description
   "<p class=\"lm-para\">A \"Binary Tree\" is a tree data structure in which each node has at most two child nodes, usually distinguished as \"left\" and \"right\". Nodes with children are parent nodes, and child nodes may contain references to their parents. Outside the tree, there is often a reference to the \"root\" node (the ancestor of all nodes), if it exists. Any node in the data structure can be reached by starting at root node and repeatedly following references to either the left or right child. A tree which does not have any node other than root node is called a null tree. In a binary tree, a degree of every node is maximum two. A tree with <i>n</i> nodes has exactly <i>n-1</i> branches or degree.</p>",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Binary_Tree",
   :qudt.type/literal "binaryTree",
   :rdf/type          [:qudt/BinaryTree :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "Binary Tree"})

(def BOOLEAN
  "In computer science, the Boolean or logical data type is a data type, having two values (usually denoted true and false), intended to represent the truth values of logic and Boolean algebra. The Boolean data type is the primary result of conditional statements, which allow different actions and change control flow depending on whether a programmer-specified boolean condition evaluates to true or false."
  {:db/ident :qudt.type/BOOLEAN,
   :dcterms/description
   "In computer science, the Boolean or logical data type is a data type, having two values (usually denoted true and false), intended to represent the truth values of logic and Boolean algebra. The Boolean data type is the primary result of conditional statements, which allow different actions and change control flow depending on whether a programmer-specified boolean condition evaluates to true or false.",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"
    "http://en.wikipedia.org/wiki/Boolean%5Fdata%5Ftype"],
   :qudt/ansiSQLName "BOOLEAN",
   :qudt/code 1,
   :qudt/encoding :qudt.type/BooleanEncoding,
   :qudt/id "T000-01",
   :qudt/javaName "boolean",
   :qudt/jsName "Boolean()",
   :qudt/literal "boolean",
   :qudt/microsoftSQLServerName "bit",
   :qudt/mySQLName ["BOOLEAN" "TINYINT(1)" "BOOL"],
   :qudt/odbcName "SQL_BIT",
   :qudt/oleDBName "DBTYPE_BOOL",
   :qudt/oracleSQLName "RAW(1)",
   :qudt/pythonName "bool",
   :qudt/rdfsDatatype :xsd/boolean,
   :rdf/type [:qudt/BooleanType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "BOOLEAN"})

(def BYTE
  "The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation."
  {:db/ident :qudt.type/BYTE,
   :dcterms/description
   "The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.",
   :prov/wasInfluencedBy
   "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html",
   :qudt/abbreviation "byte",
   :qudt/cName "Byte",
   :qudt/code "800",
   :qudt/encoding :qudt.type/OctetEncoding,
   :qudt/id "T002-01",
   :qudt/literal "byte",
   :qudt/maxInclusive 127,
   :qudt/minInclusive "-128",
   :qudt/octets 1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type [:qudt/SignedShortIntegerType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Byte"})

(def BigEndian
  "A big-endian machine stores the most significant byte first."
  {:db/ident :qudt.type/BigEndian,
   :dcterms/description
   "A big-endian machine stores the most significant byte first.",
   :qudt/code 1,
   :qudt/literal "big",
   :rdf/type [:qudt/EndianType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Big Endian"})

(def BitAligned
  "Alignment at a bit level."
  {:db/ident            :qudt.type/BitAligned,
   :dcterms/description "Alignment at a bit level.",
   :qudt/literal        "bit",
   :rdf/type            [:qudt/AlignmentType :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Bit aligned"})

(def BitField01
  "Bit Field 01"
  {:db/ident             :qudt.type/BitField01,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf1",
   :qudt/bits            1,
   :qudt/id              "T010-01",
   :qudt/literal         "B1",
   :qudt/mySQLName       "BIT(1)",
   :qudt/rdfsDatatype    :qudt/BitField01,
   :rdf/type             [:qudt/BitFieldType :owl/NamedIndividual],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 01"})

(def BitField02
  "Bit Field 02"
  {:db/ident             :qudt.type/BitField02,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf2",
   :qudt/bits            2,
   :qudt/code            182,
   :qudt/id              "T010-02",
   :qudt/literal         "B2",
   :qudt/mySQLName       "BIT(2)",
   :qudt/rdfsDatatype    :qudt/BitField02,
   :rdf/type             [:qudt/BitFieldType :owl/NamedIndividual],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 02"})

(def BitField03
  "Bit Field 03"
  {:db/ident             :qudt.type/BitField03,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf3",
   :qudt/bits            3,
   :qudt/code            183,
   :qudt/id              "T010-03",
   :qudt/literal         "B3",
   :qudt/mySQLName       "BIT(3)",
   :qudt/rdfsDatatype    :qudt/BitField03,
   :rdf/type             [:qudt/BitFieldType :owl/NamedIndividual],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 03"})

(def BitField04
  "Bit Field 04"
  {:db/ident             :qudt.type/BitField04,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf4",
   :qudt/bits            4,
   :qudt/code            184,
   :qudt/id              "T010-04",
   :qudt/literal         "B4",
   :qudt/mySQLName       "BIT(4)",
   :qudt/rdfsDatatype    :qudt/BitField04,
   :rdf/type             [:qudt/BitFieldType :owl/NamedIndividual],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 04"})

(def BitField05
  "Bit Field 05"
  {:db/ident             :qudt.type/BitField05,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf5",
   :qudt/bits            5,
   :qudt/code            185,
   :qudt/id              "T010-05",
   :qudt/literal         "B5",
   :qudt/mySQLName       "BIT(5)",
   :qudt/rdfsDatatype    :qudt/BitField05,
   :rdf/type             [:qudt/BitFieldType :owl/NamedIndividual],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 05"})

(def BitField06
  "Bit Field 06"
  {:db/ident             :qudt.type/BitField06,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf6",
   :qudt/bits            6,
   :qudt/code            186,
   :qudt/id              "T010-06",
   :qudt/literal         "B6",
   :qudt/mySQLName       "BIT(6)",
   :qudt/rdfsDatatype    :qudt/BitField06,
   :rdf/type             [:qudt/BitFieldType :owl/NamedIndividual],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 06"})

(def BitField07
  "Bit Field 07"
  {:db/ident             :qudt.type/BitField07,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf7",
   :qudt/bits            7,
   :qudt/code            187,
   :qudt/id              "T010-07",
   :qudt/literal         "B7",
   :qudt/mySQLName       "BIT(7)",
   :qudt/rdfsDatatype    :qudt/BitField07,
   :rdf/type             [:qudt/BitFieldType :owl/NamedIndividual],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 07"})

(def BitField08
  "Bit Field 08"
  {:db/ident             :qudt.type/BitField08,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf8",
   :qudt/bits            8,
   :qudt/code            188,
   :qudt/id              "T010-08",
   :qudt/literal         "B8",
   :qudt/mySQLName       "BIT(8)",
   :qudt/rdfsDatatype    :qudt/BitField08,
   :rdf/type             [:qudt/BitFieldType :owl/NamedIndividual],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 08"})

(def BitField09
  "Bit Field 09"
  {:db/ident             :qudt.type/BitField09,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf9",
   :qudt/bits            9,
   :qudt/code            189,
   :qudt/id              "T010-09",
   :qudt/literal         "B9",
   :qudt/mySQLName       "BIT(9)",
   :qudt/rdfsDatatype    :qudt/BitField09,
   :rdf/type             [:qudt/BitFieldType :owl/NamedIndividual],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 09"})

(def BitField10
  "Bit Field 10"
  {:db/ident             :qudt.type/BitField10,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf10",
   :qudt/bitOrder        :qudt/BigEndian,
   :qudt/bits            10,
   :qudt/byteOrder       :qudt/BigEndian,
   :qudt/code            190,
   :qudt/id              "T010-02",
   :qudt/literal         "B10",
   :qudt/mySQLName       "BIT(10)",
   :qudt/rdfsDatatype    :qudt/BitField10,
   :rdf/type             [:qudt/BitFieldType :owl/NamedIndividual],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 10"})

(def BitField11
  "Bit Field 11"
  {:db/ident             :qudt.type/BitField11,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf11",
   :qudt/bits            11,
   :qudt/code            191,
   :qudt/id              "T010-11",
   :qudt/literal         "B11",
   :qudt/mySQLName       "BIT(11)",
   :qudt/rdfsDatatype    :qudt/BitField11,
   :rdf/type             [:qudt/BitFieldType :owl/NamedIndividual],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 11"})

(def BooleanEncoding
  "Boolean Encoding"
  {:db/ident         :qudt.type/BooleanEncoding,
   :rdf/type         [:qudt/BooleanEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Boolean Encoding"})

(def BooleanTypeEnumeration
  "The elements of the 'BooleanEnumeration' with two values, 'true' and 'false'."
  {:db/ident :qudt.type/BooleanTypeEnumeration,
   :dcterms/description
   "The elements of the 'BooleanEnumeration' with two values, 'true' and 'false'.",
   :qudt/code 1002,
   :qudt/value [:qudt/TRUE :qudt/FALSE],
   :rdf/type [:qudt/DiscreteState :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Boolean value"})

(def ByteAligned
  "Alignment of a field at a byte boundary."
  {:db/ident            :qudt.type/ByteAligned,
   :dcterms/description "Alignment of a field at a byte boundary.",
   :qudt/literal        "byte",
   :rdf/type            [:qudt/AlignmentType :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Byte aligned"})

(def CC_EarthCentered
  "Earth centered"
  {:db/ident         :qudt.type/CC_EarthCentered,
   :qudt/literal     "earthCentered",
   :rdf/type         [:qudt/CoordinateCenterType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Earth centered"})

(def CC_MarsCentered
  "Mars centered"
  {:db/ident         :qudt.type/CC_MarsCentered,
   :qudt/literal     "marsCentered",
   :rdf/type         [:qudt/CoordinateCenterType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Mars centered"})

(def CC_MoonCentered
  "Moon centered"
  {:db/ident         :qudt.type/CC_MoonCentered,
   :qudt/literal     "moonCentered",
   :rdf/type         [:qudt/CoordinateCenterType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Moon centered"})

(def CC_SunCentered
  "Sun centered"
  {:db/ident         :qudt.type/CC_SunCentered,
   :qudt/literal     "sunCentered",
   :rdf/type         [:qudt/CoordinateCenterType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Sun centered"})

(def CC_VehicleCentered
  "Vehicle centered"
  {:db/ident         :qudt.type/CC_VehicleCentered,
   :qudt/literal     "vehicleCentered",
   :rdf/type         [:qudt/CoordinateCenterType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Vehicle centered"})

(def CDF
  "CDF (Common Data format), a data format for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, making interoperability between applications and tools easier. CDF provides device independent view of the CDF data model by software programming interface insulting developers from actual physical file format. CDF was developed by NASA, and is described at http://cdf.gsfc.nasa.gov/."
  {:db/ident         :qudt.type/CDF,
   :dcterms/description
   "CDF (Common Data format), a data format for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, making interoperability between applications and tools easier. CDF provides device independent view of the CDF data model by software programming interface insulting developers from actual physical file format. CDF was developed by NASA, and is described at http://cdf.gsfc.nasa.gov/.",
   :rdf/type         [:qudt/MultiDimensionalDataFormat
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Common Data Format (CDF)"})

(def CHAR
  "CHAR"
  {:db/ident          :qudt.type/CHAR,
   :dtype/literal     "char",
   :qudt/bits         8,
   :qudt/encoding     :qudt/CharEncoding,
   :qudt/id           "T001-01",
   :qudt/literal      "char",
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type          [:qudt/CharacterType :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "CHAR"})

(def COORDS-2D-DOUBLE
  "COORDS-2D-DOUBLE"
  {:db/ident         :qudt.type/COORDS-2D-DOUBLE,
   :qudt/elementType :qudt.type/FLOAT-DP,
   :rdf/type         [:qudt/Coordinates-2D-DoublePrecision
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "COORDS-2D-DOUBLE"})

(def COORDS-2D-SINGLE
  "COORDS-2D-SINGLE"
  {:db/ident         :qudt.type/COORDS-2D-SINGLE,
   :qudt/elementType :qudt.type/FLOAT-SP,
   :qudt/elementTypeCount 2,
   :rdf/type         [:qudt/Coordinates-2D-SinglePrecision
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "COORDS-2D-SINGLE"})

(def COORDS-3D-DOUBLE
  "COORDS-3D-DOUBLE"
  {:db/ident         :qudt.type/COORDS-3D-DOUBLE,
   :qudt/elementTypeCount 3,
   :rdf/type         [:qudt/Coordinates-3D-DoublePrecision
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "COORDS-3D-DOUBLE"})

(def COORDS-3D-SINGLE
  "COORDS-3D-SINGLE"
  {:db/ident         :qudt.type/COORDS-3D-SINGLE,
   :rdf/type         [:qudt/Coordinates-3D-SinglePrecision
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "COORDS-3D-SINGLE"})

(def COORDS-RH-DP
  "A three-dimensional coordinate system in which the axes satisfy the right-hand rule."
  {:db/ident         :qudt.type/COORDS-RH-DP,
   :dcterms/description
   "A three-dimensional coordinate system in which the axes satisfy the right-hand rule. ",
   :rdf/type         [:qudt/Coordinates-3D-DoublePrecision
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "COORDS - RH DP"})

(def CharEncoding
  "7 bits of 1 octet"
  {:db/ident            :qudt.type/CharEncoding,
   :dcterms/description "7 bits of 1 octet",
   :qudt/bytes          1,
   :rdf/type            [:qudt/CharEncodingType
                         :qudt/BooleanEncodingType
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Char Encoding"})

(def CompositeTABLE
  "Composite table"
  {:db/ident         :qudt.type/CompositeTABLE,
   :rdf/type         [:qudt/CompositeTable :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Composite table"})

(def DATE
  "Provides the date expressed in year, month and day."
  {:db/ident            :qudt.type/DATE,
   :dcterms/description "Provides the date expressed in year, month and day.",
   :qudt/code           255,
   :qudt/encodingDescription
   "YYYY:MM:DD, where YYYY is a 4 digit year, MM is a 2 digit month and DD is a 2 digit day.",
   :qudt/id             "T004-01",
   :qudt/literal        "date",
   :qudt/rdfsDatatype   :xsd/dateTime,
   :rdf/type            [:qudt/DateStringType :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Date"})

(def DECIMAL
  "Decimal"
  {:db/ident           :qudt.type/DECIMAL,
   :qudt/ansiSQLName   "DECIMAL(p,s)",
   :qudt/code          101,
   :qudt/literal       "numeric",
   :qudt/odbcName      "SQL_DECIMAL(p,s)",
   :qudt/oracleSQLName "NUMBER(p,s)",
   :qudt/rdfsDatatype  :qudt/NumericUnion,
   :rdf/type           [:qudt/NumericType :owl/NamedIndividual],
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label         "Decimal"})

(def DICTIONARY
  "DICTIONARY"
  {:db/ident         :qudt.type/DICTIONARY,
   :rdf/type         [:qudt/Dictionary :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "DICTIONARY"})

(def DIGIT
  "DIGIT"
  {:db/ident          :qudt.type/DIGIT,
   :dtype/literal     "digit",
   :qudt/bits         8,
   :qudt/id           "T001-02",
   :qudt/literal      "digit",
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type          [:qudt/CharacterType :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "DIGIT"})

(def DoublePrecisionEncoding
  "Double Precision Encoding"
  {:db/ident         :qudt.type/DoublePrecisionEncoding,
   :qudt/bytes       64,
   :rdf/type         [:qudt/FloatingPointEncodingType
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Double Precision Encoding"})

(def ECS_EC-EMEPM
  "Earth Centered Earth Mean Equator And Prime Meridian Coordinate System"
  {:db/ident :qudt.type/ECS_EC-EMEPM,
   :qudt/code 10,
   :qudt/coordinateCenter :qudt.type/CC_EarthCentered,
   :qudt/id "TECS-03",
   :qudt/literal "EC-EMEP",
   :qudt/referenceFrame :qudt.type/RRF_EMEPM,
   :rdf/type [:qudt/EarthCoordinateSystem :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "Earth centered earth mean equator and prime meridian coordinate system",
   :skos/definition
   "Earth Centered Earth Mean Equator And Prime Meridian Coordinate System",
   :vaem/acronym "EC-EMEP"})

(def ECS_EC-ETEPME
  "Earth Centered Earth True Equator And Prime Meridian Of Epoch Coordinate System"
  {:db/ident :qudt.type/ECS_EC-ETEPME,
   :qudt/code 12,
   :qudt/coordinateCenter :qudt.type/CC_EarthCentered,
   :qudt/id "TECS-04",
   :qudt/literal "EC-ETEP",
   :qudt/referenceFrame :qudt.type/NRIF_ETEPME,
   :rdf/type [:qudt/EarthCoordinateSystem :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "Earth centered earth true equator and prime meridian of epoch coordinate system",
   :skos/definition
   "Earth Centered Earth True Equator And Prime Meridian Of Epoch Coordinate System"})

(def ECS_EC-ICRF
  "Earth Centered International Celestial Reference System"
  {:db/ident :qudt.type/ECS_EC-ICRF,
   :qudt/code 14,
   :qudt/coordinateCenter :qudt.type/CC_EarthCentered,
   :qudt/id "TECS-01",
   :qudt/literal "EC-IC",
   :qudt/referenceFrame :qudt.type/NRIF_ICRF,
   :rdf/type [:qudt/EarthCoordinateSystem :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth centered international celestial reference system",
   :skos/definition "Earth Centered International Celestial Reference System"})

(def ECS_EC-ITRF
  "Earth Centered International Terrestrial Reference System"
  {:db/ident :qudt.type/ECS_EC-ITRF,
   :qudt/code 16,
   :qudt/coordinateCenter :qudt.type/CC_EarthCentered,
   :qudt/id "TECS-02",
   :qudt/literal "EC-IT",
   :qudt/referenceFrame :qudt.type/RRF_ITRF,
   :rdf/type [:qudt/EarthCoordinateSystem :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth centered international terrestrial reference system",
   :skos/definition
   "Earth Centered International Terrestrial Reference System"})

(def ECS_SC-ICRF
  "Sun Centered International Celestial Reference System"
  {:db/ident :qudt.type/ECS_SC-ICRF,
   :qudt/code 90,
   :qudt/coordinateCenter :qudt.type/CC_EarthCentered,
   :qudt/id "TECS-05",
   :qudt/referenceFrame :qudt.type/NRIF_ICRF,
   :rdf/type [:qudt/EarthCoordinateSystem :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Sun-Centered international celestial reference system",
   :skos/definition "Sun Centered International Celestial Reference System"})

(def ECS_VC-ICRF
  "Vehicle Centered International Celestial Reference System"
  {:db/ident :qudt.type/ECS_VC-ICRF,
   :qudt/code 100,
   :qudt/coordinateCenter :qudt.type/CC_EarthCentered,
   :qudt/id "TECS-06",
   :qudt/literal "VC-IC",
   :qudt/referenceFrame :qudt.type/NRIF_ICRF,
   :rdf/type [:qudt/EarthCoordinateSystem :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Vehicle centered international celestial reference system",
   :skos/definition
   "Vehicle Centered International Celestial Reference System"})

(def FIG_EM-ETEPME
  "COORDINATE FRAME: EARTH TRUE EQUATOR AND PRIME MERIDIAN OF EPOCH (ETEPME)"
  {:db/ident :qudt.type/FIG_EM-ETEPME,
   :qudt/figureCaption
   "COORDINATE FRAME: EARTH TRUE EQUATOR AND PRIME MERIDIAN OF EPOCH (ETEPME)",
   :qudt/figureLabel "EM-ROT",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/ETEPME.png",
   :qudt/imageLocation "../images/coordinate-systems/ETEPME.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type [:qudt/Figure :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "COORDINATE FRAME: EARTH TRUE EQUATOR AND PRIME MERIDIAN OF EPOCH (ETEPME)"})

(def FIG_EM-ROT
  "COORDINATE FRAME: EARTH-MOON ROTATING (EM-ROT)"
  {:db/ident :qudt.type/FIG_EM-ROT,
   :qudt/figureCaption "COORDINATE FRAME: EARTH-MOON ROTATING (EM-ROT)",
   :qudt/figureLabel "EM-ROT",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/SE-ROT.png",
   :qudt/imageLocation "../images/coordinate-systems/SE-ROT.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type [:qudt/Figure :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "COORDINATE FRAME: EARTH-MOON ROTATING (EM-ROT)"})

(def FIG_ICRF
  "COORDINATE FRAME: INTERNATIONAL CELESTIAL REFERENCE FRAME (ICRF)"
  {:db/ident :qudt.type/FIG_ICRF,
   :qudt/figureCaption
   "COORDINATE FRAME: INTERNATIONAL CELESTIAL REFERENCE FRAME (ICRF)",
   :qudt/figureLabel "ICRF",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/ICRF.png",
   :qudt/imageLocation "../images/coordinate-systems/ICRF.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type [:qudt/Figure :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "COORDINATE FRAME: INTERNATIONAL CELESTIAL REFERENCE FRAME (ICRF)"})

(def FIG_ICRF_EME-EMEPM
  "COORDINATE FRAME: EARTH MEAN EQUATOR AND PRIME MERIDIAN (EMEPM)"
  {:db/ident :qudt.type/FIG_ICRF_EME-EMEPM,
   :qudt/figureCaption
   "COORDINATE FRAME: EARTH MEAN EQUATOR AND PRIME MERIDIAN (EMEPM)",
   :qudt/figureLabel "EME-EMEPM",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/EMEPM.png",
   :qudt/imageLocation "../images/coordinate-systems/EMEPM.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type [:qudt/Figure :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "COORDINATE FRAME: EARTH MEAN EQUATOR AND PRIME MERIDIAN (EMEPM)"})

(def FIG_ICRF_EMEPM
  "FIG ICRF"
  {:db/ident :qudt.type/FIG_ICRF_EMEPM,
   :qudt/figureCaption "test caption",
   :qudt/figureLabel "ICRF",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/EMEPM.png",
   :qudt/imageLocation "../images/coordinate-systems/EMEPM.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type [:qudt/Figure :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "FIG ICRF"})

(def FIG_ITRF
  "COORDINATE FRAME: INTERNATIONAL TERRESTRIAL REFERENCE FRAME (ITRF)"
  {:db/ident :qudt.type/FIG_ITRF,
   :qudt/figureCaption
   "COORDINATE FRAME: INTERNATIONAL TERRESTRIAL REFERENCE FRAME (ITRF)",
   :qudt/figureLabel "ICRF",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/ITRF.png",
   :qudt/imageLocation "../images/coordinate-systems/ITRF.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type [:qudt/Figure :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "COORDINATE FRAME: INTERNATIONAL TERRESTRIAL REFERENCE FRAME (ITRF)"})

(def FIG_LPAE
  "COORDINATE FRAME: LUNAR PRINCIPAL AXIS OF EPOCH (LPAE) (NON-ROTATING/\"INERTIAL\") OR BODY-FIXED (LPABF) (ROTATING)"
  {:db/ident :qudt.type/FIG_LPAE,
   :qudt/figureCaption
   "COORDINATE FRAME: LUNAR PRINCIPAL AXIS OF EPOCH (LPAE) (NON-ROTATING/\"INERTIAL\") OR BODY-FIXED (LPABF) (ROTATING)",
   :qudt/figureLabel "ICRF",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/LPAE.png",
   :qudt/imageLocation "../images/coordinate-systems/LPAE.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type [:qudt/Figure :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "COORDINATE FRAME: LUNAR PRINCIPAL AXIS OF EPOCH (LPAE) (NON-ROTATING/\"INERTIAL\") OR BODY-FIXED (LPABF) (ROTATING)"})

(def FIG_SE-ROT
  "COORDINATE FRAME: SUN-EARTH ROTATING (SE-ROT)"
  {:db/ident :qudt.type/FIG_SE-ROT,
   :qudt/figureCaption "COORDINATE FRAME: SUN-EARTH ROTATING (SE-ROT)",
   :qudt/figureLabel "SE-ROT",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/SE-ROT.png",
   :qudt/imageLocation "../images/coordinate-systems/SE-ROT.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type [:qudt/Figure :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "COORDINATE FRAME: SUN-EARTH ROTATING (SE-ROT)"})

(def FLAG
  "FLAG"
  {:db/ident          :qudt.type/FLAG,
   :qudt/code         2,
   :qudt/id           "T000-02",
   :qudt/literal      "flag",
   :qudt/rdfsDatatype :xsd/boolean,
   :rdf/type          [:qudt/BooleanType :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "FLAG"})

(def FLOAT-DP
  "A double precision floating point datatype. Numbers of this type are stored using 64 bits, they require more memory than numbers of type single, which use 32 bits. However, because they are stored with more bits, numbers of type double are represented to more precision than numbers of type single. The double-precision (or double) data type is represented according to IEEE Standard 754 for double precision. A value is formatted with bit-fields for sign, mantissa and exponent."
  {:db/ident :qudt.type/FLOAT-DP,
   :dcterms/description
   "A double precision floating point datatype.  Numbers of this type are stored using 64 bits, they require more memory than numbers of type single, which use 32 bits. However, because they are stored with more bits, numbers of type double are represented to more precision than numbers of type single. The double-precision (or double) data type is represented according to IEEE Standard 754 for double precision. A value is formatted with bit-fields for sign, mantissa and exponent.",
   :owl/sameAs :qudt.type/FLOAT_IEEE754-BINARY64,
   :prov/wasInfluencedBy
   ["http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"
    "http://en.wikipedia.org/wiki/IEEE_floating_point"
    "http://www.mathworks.com/help/matlab/matlab_prog/floating-point-numbers.html"
    "http://en.wikipedia.org/wiki/Floating_point"
    "http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"
    "http://dev.mysql.com/doc/refman/5.0/en/floating-point-types.html"],
   :qudt/abbreviation "F64",
   :qudt/ansiSQLName "DOUPLE PRECISION",
   :qudt/base 2,
   :qudt/bits 64,
   :qudt/bytes 8,
   :qudt/code 405,
   :qudt/encoding :qudt/DoublePrecisionEncoding,
   :qudt/id "T006-03",
   :qudt/javaName "double",
   :qudt/jsName "double",
   :qudt/literal "double",
   :qudt/matlabName "double",
   :qudt/maxExclusive "(1-2^{-53}) \\times 2^{1024}",
   :qudt/maxExponent 1023,
   :qudt/maxMantissa 9007199254740991,
   :qudt/microsoftSQLServerName "float",
   :qudt/minExclusive "-(1-2^{-53}) \\times 2^{1024}",
   :qudt/minMantissa -9007199254740991,
   :qudt/mySQLName "DOUBLE",
   :qudt/octets 8,
   :qudt/odbcName "SQL_DOUBLE",
   :qudt/oleDBName "DBTYPE_R8",
   :qudt/oracleSQLName "FLOAT(49)",
   :qudt/rdfsDatatype :xsd/double,
   :rdf/type [:qudt/RealDoublePrecisionType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Double Precision Real"})

(def FLOAT-SP
  "A single precision real is a 32 bit signed floating point representation. Numbers of type single are stored using 32 bits, they require less memory than numbers of type double, which use 64 bits. However, because they are stored with fewer bits, numbers of type single are represented to less precision than numbers of type double."
  {:db/ident :qudt.type/FLOAT-SP,
   :dcterms/description
   "A single precision real is a 32 bit signed floating point representation. Numbers of type single are stored using 32 bits, they require less memory than numbers of type double, which use 64 bits. However, because they are stored with fewer bits, numbers of type single are represented to less precision than numbers of type double.",
   :prov/wasInfluencedBy
   ["http://www.mathworks.com/help/matlab/matlab_prog/floating-point-numbers.html"
    "http://www-01.ibm.com/support/docview.wss?uid=swg21325957"
    "http://www.stanford.edu/dept/itss/docs/oracle/10g/server.101/b10764/apb.htm"
    "http://en.wikipedia.org/wiki/Floating_point"
    "http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"
    "http://dev.mysql.com/doc/refman/5.0/en/floating-point-types.html"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"],
   :qudt/ansiSQLName "FLOAT",
   :qudt/bits 32,
   :qudt/bytes 4,
   :qudt/cName "float",
   :qudt/encoding :qudt/SinglePrecisionRealEncoding,
   :qudt/id "T006-01",
   :qudt/javaName "float",
   :qudt/jsName "float",
   :qudt/literal "single",
   :qudt/matlabName "single",
   :qudt/maxExclusive "$(2-2^{-23}) \\times 2^127$",
   :qudt/maxExponent 23,
   :qudt/microsoftSQLServerName "real",
   :qudt/minExclusive "-(2-2^{-23}) \\times 2^{127}",
   :qudt/mySQLName "FLOAT",
   :qudt/octets 4,
   :qudt/odbcName "SQL_FLOAT",
   :qudt/oleDBName "DBTYPE_R4",
   :qudt/oracleSQLName "FLOAT(23)",
   :qudt/rdfsDatatype :xsd/float,
   :rdf/type [:qudt/RealSinglePrecisionType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Single Precision Real"})

(def FLOAT_IEEE754-BINARY64
  "IEEE-754 floating point datatype is a technical standar established in 1985 by the Institute of Electrical and Electronics Engineers (IEEE). Many hardware floating point units use the IEEE 754 standard.."
  {:db/ident :qudt.type/FLOAT_IEEE754-BINARY64,
   :dcterms/description
   "IEEE-754 floating point datatype is a technical standar established in 1985 by the Institute of Electrical and Electronics Engineers (IEEE). Many hardware floating point units use the IEEE 754 standard..",
   :owl/sameAs :qudt.type/FLOAT-DP,
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/IEEE_floating_point",
   :qudt/base 2,
   :qudt/bits 64,
   :qudt/id "T006-05",
   :qudt/maxExponent 970,
   :qudt/maxMantissa 9007199254740991,
   :qudt/minMantissa -9007199254740991,
   :qudt/rdfsDatatype :xsd/double,
   :rdf/type [:qudt/RealDoublePrecisionType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "IEEE754 BINARY64"})

(def FT_INERTIAL
  "Inertial"
  {:db/ident         :qudt.type/FT_INERTIAL,
   :qudt/literal     "inertial",
   :rdf/type         [:qudt/FrameType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Inertial"})

(def FT_NON-ROTATING
  "Non rotating"
  {:db/ident         :qudt.type/FT_NON-ROTATING,
   :qudt/literal     "nonrotating",
   :rdf/type         [:qudt/FrameType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Non rotating"})

(def FT_ROTATING
  "Rotating"
  {:db/ident         :qudt.type/FT_ROTATING,
   :qudt/literal     "rotating",
   :rdf/type         [:qudt/FrameType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Rotating"})

(def GRAPH
  "GRAPH"
  {:db/ident         :qudt.type/GRAPH,
   :rdf/type         [:qudt/Graph :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "GRAPH"})

(def GlobalPositionVector-DP
  "Global Position Vector - double precision"
  {:db/ident            :qudt.type/GlobalPositionVector-DP,
   :qudt/code           360,
   :qudt/dimension      3,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt.type/FLOAT-DP,
   :rdf/type            [:qudt/StateSpaceVector :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Global Position Vector - double precision"})

(def HASH-TABLE
  "Hash Table"
  {:db/ident         :qudt.type/HASH-TABLE,
   :rdf/type         [:qudt/HashTable :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Hash Table"})

(def HDF5
  "The Hierarchical Data Format (HDF) is a common data format and a collection of application programming libraries developed at the NSCA primarily for the scientific community and for the exchange of scientific datasets. The present version of HDF is HDF5 which offers a simple data model and application interfaces for encoding and exchanging data without the added burden of defining mappings to the underlying machine representations."
  {:db/ident         :qudt.type/HDF5,
   :dcterms/description
   "The Hierarchical Data Format (HDF) is a common data format and a collection of application programming libraries developed at the NSCA primarily for the scientific community and for the exchange of scientific datasets. The present version of HDF is HDF5 which offers a simple data model and application interfaces for encoding and exchanging data without the added burden of defining mappings to the underlying machine representations.",
   :rdf/type         [:qudt/MultiDimensionalDataFormat
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "HDF5"})

(def HDF6
  "A \"Hierarchical Data Format\"."
  {:db/ident         :qudt.type/HDF6,
   :dcterms/description "A \"Hierarchical Data Format\".",
   :rdf/type         [:qudt/MultiDimensionalDataFormat
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "HDF6"})

(def HEAP
  "In computer science, a heap is a specialized tree-based data structure that satisfies the heap property: If A is a parent node of B then key(A) is ordered with respect to key(B) with the same ordering applying across the heap. Either the keys of parent nodes are always greater than or equal to those of the children and the highest key is in the root node (this kind of heap is called max heap) or the keys of parent nodes are less than or equal to those of the children and the least key is in the root node (min heap). The heap relation mentioned above applies only between nodes and their immediate parents. The maximum number of children each node can have depends on the type of heap, but in many types it is at most two, which is known as a \"binary heap\"."
  {:db/ident         :qudt.type/HEAP,
   :dcterms/description
   "In computer science, a heap is a specialized tree-based data structure that satisfies the heap property: If A is a parent node of B then key(A) is ordered with respect to key(B) with the same ordering applying across the heap. Either the keys of parent nodes are always greater than or equal to those of the children and the highest key is in the root node (this kind of heap is called max heap) or the keys of parent nodes are less than or equal to those of the children and the least key is in the root node (min heap). The heap relation mentioned above applies only between nodes and their immediate parents. The maximum number of children each node can have depends on the type of heap, but in many types it is at most two, which is known as a \"binary heap\".",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Heap_(data_structure)",
   :rdf/type         [:qudt/Heap :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Heap"})

(def HEXBINARY
  "HEXBINARY"
  {:db/ident          :qudt.type/HEXBINARY,
   :qudt/code         803,
   :qudt/literal      "hexbinary",
   :qudt/rdfsDatatype :qudt/hexbinary,
   :rdf/type          [:qudt/HexBinaryType :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "HEXBINARY"})

(def HighToLow
  "High to low"
  {:db/ident         :qudt.type/HighToLow,
   :qudt/literal     "high",
   :rdf/type         [:qudt/MemoryOrderType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "High to low"})

(def IEEE754_1985RealEncoding
  "IEEE 754 1985 Real Encoding"
  {:db/ident         :qudt.type/IEEE754_1985RealEncoding,
   :qudt/bytes       32,
   :rdf/type         [:qudt/FloatingPointEncodingType
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "IEEE 754 1985 Real Encoding"})

(def IERS-TN-32-2004
  "IERS Conventions (2003), D. D. McCarthy and Gérard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32."
  {:db/ident :qudt.type/IERS-TN-32-2004,
   :dcterms/description
   "IERS Conventions (2003), D. D. McCarthy and Gérard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32.",
   :qudt/url "http://www.iers.org/iers/publications/tn/tn32.",
   :rdf/type [:qudt/Citation :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "IERS-TN-32-2004",
   :skos/prefLabel "IERS-TN-32-2004"})

(def ISO8601-UTCDateTime-BasicFormat
  "ISO 8601 UTC Date Time - Basic Format"
  {:db/ident         :qudt.type/ISO8601-UTCDateTime-BasicFormat,
   :qudt/allowedPattern
   ["[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}Z"
    "[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}.[0-9]+Z"],
   :rdf/type         [:qudt/DateTimeStringEncodingType
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "ISO 8601 UTC Date Time - Basic Format"})

(def InterpolatedTABLE
  "Interpolated table"
  {:db/ident         :qudt.type/InterpolatedTABLE,
   :rdf/type         [:qudt/InterpolatedTable :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Interpolated table"})

(def Konopliv2001
  "\"Recent Gravity Models as a Result of the Lunar Prospector Mission\", A. S. Konopliv, S. W. Asmar, E. Carranza, W. L. Sjogren, and D. N. Yuan, Academic Press, Icarus 150, 1-18 (2001)."
  {:db/ident :qudt.type/Konopliv2001,
   :dcterms/description
   "\"Recent Gravity Models as a Result of the Lunar Prospector Mission\", A. S. Konopliv, S. W. Asmar, E. Carranza, W. L. Sjogren, and D. N. Yuan, Academic Press, Icarus 150, 1-18 (2001).",
   :rdf/type [:qudt/Citation :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Konopliv2001",
   :skos/prefLabel "Konopliv2001"})

(def LCS_LC-LMEBF
  "Lunar Mean Earth Body Fixed Coordinate System"
  {:db/ident            :qudt.type/LCS_LC-LMEBF,
   :qudt/code           40,
   :qudt/coordinateCenter :qudt.type/CC_MoonCentered,
   :qudt/id             "TLCS-01",
   :qudt/literal        "LMEBF",
   :qudt/referenceFrame :qudt.type/RRF_LMEBF,
   :rdf/type            [:qudt/LunarCoordinateSystem
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Lunar mean earth body fixed Coordinate System",
   :skos/definition     "Lunar Mean Earth Body Fixed Coordinate System"})

(def LCS_LC-LPABF
  "Lunar body-fixed coordinate frame aligned with the principal axes of the Moon."
  {:db/ident :qudt.type/LCS_LC-LPABF,
   :dcterms/description
   "Lunar body-fixed coordinate frame aligned with the principal axes of the Moon.",
   :qudt/code 42,
   :qudt/coordinateCenter :qudt.type/CC_MoonCentered,
   :qudt/id "TLCS-02",
   :qudt/literal "LPABF",
   :qudt/realization "This is a fixed rotation from LMEBF",
   :qudt/referenceFrame :qudt.type/RRF_LPABF,
   :rdf/type [:qudt/LunarCoordinateSystem :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Lunar principal axis body fixed Coordinate System",
   :skos/definition "Lunar Principal Axis Body Fixed Coordinate System"})

(def LCS_LC-LPAE
  "Lunar Principal Axis of Epoch Coordinate System"
  {:db/ident            :qudt.type/LCS_LC-LPAE,
   :qudt/code           42,
   :qudt/coordinateCenter :qudt.type/CC_MoonCentered,
   :qudt/id             "TLCS-03",
   :qudt/literal        "LPABF",
   :qudt/referenceFrame :qudt.type/NRIF_LPAE,
   :rdf/type            [:qudt/LunarCoordinateSystem
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Lunar Principal Axis of Epoch Coordinate System"})

(def LETTER
  "LETTER"
  {:db/ident          :qudt.type/LETTER,
   :dtype/literal     "letter",
   :qudt/bits         8,
   :qudt/id           "T001-03",
   :qudt/literal      "letter",
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type          [:qudt/CharacterType :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "LETTER"})

(def LIST
  "LIST"
  {:db/ident         :qudt.type/LIST,
   :rdf/type         [:qudt/List :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "LIST"})

(def LittleEndian
  "A little-endian machine stores the least significant byte first."
  {:db/ident :qudt.type/LittleEndian,
   :dcterms/description
   "A little-endian machine stores the least significant byte first.",
   :qudt/code 2,
   :qudt/literal "little",
   :rdf/type [:qudt/EndianType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Little Endian"})

(def LongUnsignedIntegerEncoding
  "Long Unsigned Integer Encoding"
  {:db/ident         :qudt.type/LongUnsignedIntegerEncoding,
   :qudt/bytes       8,
   :rdf/type         [:qudt/IntegerEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Long Unsigned Integer Encoding"})

(def LowToHigh
  "Low to high"
  {:db/ident         :qudt.type/LowToHigh,
   :qudt/literal     "low",
   :rdf/type         [:qudt/MemoryOrderType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Low to high"})

(def MAP
  "MAP"
  {:db/ident         :qudt.type/MAP,
   :rdf/type         [:qudt/Map :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "MAP"})

(def MATRIX
  "MATRIX"
  {:db/ident         :qudt.type/MATRIX,
   :qudt/code        300,
   :rdf/type         [:qudt/Matrix :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "MATRIX"})

(def MATRIX-4X4-FLOATDP
  "MATRIX-4 X 4 Double precision"
  {:db/ident            :qudt.type/MATRIX-4X4-FLOATDP,
   :qudt/code           320,
   :qudt/dimensionality 2,
   :qudt/elementType    :qudt.type/FLOAT-DP,
   :qudt/hasDimensionVector [4 4],
   :qudt/typeMatrix     :qudt.type/TYPE-MATRIX-4by4-FLOATDP
   :rdf/type            [:qudt/Matrix :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "MATRIX-4 X 4 Double precision"})

(def MCS_MC-MMEIAUE
  "Mars Mean Equator And IAU-Node Of Epoch Coordinate System"
  {:db/ident :qudt.type/MCS_MC-MMEIAUE,
   :qudt/code 50,
   :qudt/coordinateCenter :qudt.type/CC_MarsCentered,
   :qudt/id "TMCS-01",
   :qudt/literal "MMEIAUE",
   :qudt/referenceFrame :qudt.type/NRIF_MMEIAUE,
   :rdf/type [:qudt/MarsCoordinateSystem :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Mars mean equator and IAU-Node of epoch Coordinate System",
   :skos/definition
   "Mars Mean Equator And IAU-Node Of Epoch Coordinate System"})

(def MCS_MC-MMEPMBF
  "Mars Mean Equator And Prime Meridian Body-Fixed Coordinate System"
  {:db/ident :qudt.type/MCS_MC-MMEPMBF,
   :qudt/code 52,
   :qudt/coordinateCenter :qudt.type/CC_MarsCentered,
   :qudt/id "TMCS-02",
   :qudt/literal "MMEPMBF",
   :qudt/referenceFrame :qudt.type/RRF_MMEPMBF,
   :rdf/type [:qudt/MarsCoordinateSystem :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "Mars mean equator and prime meridian body-fixed Coordinate System",
   :skos/definition
   "Mars Mean Equator And Prime Meridian Body-Fixed Coordinate System"})

(def Major
  "Major"
  {:db/ident         :qudt.type/Major,
   :qudt/code        2,
   :qudt/literal     "major",
   :qudt/order       2,
   :rdf/type         [:qudt/MajorMinorType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Major"})

(def MassPropertiesARRAY
  "Mass properties ARRAY"
  {:db/ident         :qudt.type/MassPropertiesARRAY,
   :rdf/type         [:qudt/MassPropertiesArray :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Mass properties ARRAY"})

(def MassPropertiesStateVector-DP
  "Mass properties State Vector - double precision"
  {:db/ident            :qudt.type/MassPropertiesStateVector-DP,
   :qudt/code           440,
   :qudt/dimension      4,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt.type/FLOAT-DP,
   :rdf/type            [:qudt/TypeVector :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Mass properties State Vector - double precision"})

(def Minor
  "Minor"
  {:db/ident         :qudt.type/Minor,
   :qudt/code        1,
   :qudt/literal     "minor",
   :qudt/order       1,
   :rdf/type         [:qudt/MajorMinorType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Minor"})

(def NRIF_ETEPMBF
  "Earth True Equator and Prime Meridian Body Fixed"
  {:db/ident :qudt.type/NRIF_ETEPMBF,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-01",
   :qudt/literal "ETEPMBF",
   :qudt/realization
   "The International Terrestrial Reference Frame (ITRF) is realized by the locations of a set of points or stations on a tide-free Earth. As measurements and models have improved or changed, these locations have been changed also and the ITRF has moved slightly with respect to the physical Earth every few years.",
   :qudt/xAxisDefinition
   "The intersection of the prime meridian and the rotation equator of the Earth.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition "The rotation pole of the Earth.",
   :rdf/type [:qudt/NonRotatingInertialFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth True Equator and Prime Meridian Body Fixed"})

(def NRIF_ETEPME
  "Earth True Equator and Prime Meridian of Epoch"
  {:db/ident :qudt.type/NRIF_ETEPME,
   :qudt/figure :qudt.type/FIG_EM-ETEPME,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-02",
   :qudt/literal "ETEPME",
   :dcterms/description
   "The relationship between ITRF and ICRS is discussed extensively in [IERS-TN-32-2004]. Different models of this relationship are used. The NASA Deep Space Network uses the Lieske precession model (1976) and the corresponding nutation model is realized by nutations provided on DE405; the corresponding timing and polar motion data as measured for times past are maintained in internal files at the Jet Propulsion Laboratory. The IERS has proposed use of more recent precession (two flavors available) and nutation models and publishes timing and polar motion data for times past in its Earth Orientation Parameters (EOP) file available at http://www.iers.org. Either algorithm should be sufficiently accurate and it should be stated which is being used. However, the data and models must not be mixed. Do not, for example, use IERS EOP data with the Lieske precession model and DE405 nutations.",
   :qudt/realization
   "The International Terrestrial Reference Frame as defined for 1993 (ITRF93), as located in the ICRF at the epoch given using a consistent set of precession, nutation, and timing and polar motion models.",
   :qudt/xAxisDefinition
   "The intersection of the prime meridian and the rotation equator of the Earth, in the ICRF and at the epoch given.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "The rotation pole of the Earth, in the ICRF and at the epoch given.",
   :rdf/type [:qudt/NonRotatingInertialFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth True Equator and Prime Meridian of Epoch",
   :rdfs/seeAlso :qudt/IERS-TN-32-2004,
   :skos/prefLabel "Earth True Equator and Prime Meridian of Epoch"})

(def NRIF_ICRF
  "The International celestial reference frame (ICRF) is the best-determined and most stable reference frame and is the root frame. Other reference frames are often given with respect to the ICRF."
  {:db/ident :qudt.type/NRIF_ICRF,
   :dcterms/description
   "The International celestial reference frame (ICRF) is the best-determined and most stable reference frame and is the root frame.  Other reference frames are often given with respect to the ICRF.",
   :qudt/figure :qudt.type/FIG_ICRF,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-03",
   :qudt/literal "ICRF",
   :qudt/realization
   "The International Celestial Reference Frame (ICRF) was defined in 1995 with locations given for 22 quasars and other bright radio objects. This definition was extended by the addition of more sources in 2000.",
   :qudt/xAxisDefinition
   "Defined as the cross product of the Z-axis (as defined above) and the Earth mean orbit pole of J2000 (i.e. the ecliptic pole of J2000). The X-axis of this coordinate frame is the Earth vernal equinox of J2000.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Defined as the pole vector of the Earth Mean Equator of J2000 (where J2000 = Julian date 2451545.0 TDB (Barycentric Dynamical Time)).",
   :rdf/type [:qudt/NonRotatingInertialFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "International celestial reference frame"})

(def NRIF_LPAE
  "Lunar Principal Axis Of Epoch Coordinate System"
  {:db/ident :qudt.type/NRIF_LPAE,
   :qudt/abbreviation "LPAE",
   :qudt/code 44,
   :qudt/figure :qudt.type/FIG_LPAE,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-04",
   :qudt/literal "LPAE",
   :qudt/xAxisDefinition
   "Points in the direction of the Moon’s prime meridian principal axis of Epoch (minimum moment of inertia).",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Points in the direction of the Moon’s North pole principal axis of Epoch (maximum moment of inertia).",
   :rdf/type [:qudt/NonRotatingInertialFrame :owl/NamedIndividual],
   :rdfs/comment
   "Finding the principal axes depends on solving for the dynamics of the Moon’s orientation, which must be done in conjunction with solving for its motion in space, though the Moon’s motion in space can also be solved for independently. The terms “north pole” and “prime meridian” are loosely used for the Z and X axes respectively of both this and the Lunar Mean Earth frames.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Lunar Principal Axis of Epoch",
   :skos/definition "Lunar Principal Axis Of Epoch Coordinate System",
   :skos/prefLabel "Lunar Principal Axis of Epoch"})

(def NRIF_MMEIAUE
  "Mars Mean Equator And IAU-Node Of Epoch Coordinate System"
  {:db/ident :qudt.type/NRIF_MMEIAUE,
   :qudt/code 50,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-05",
   :qudt/literal "MMEIAUE",
   :qudt/realization
   "This frame is realized from the ICRF, precessed and rotated Relationships: according to the formulae in IAU2000, [Seidelmann2000]",
   :qudt/xAxisDefinition
   "Defined as the cross product of the ICRF Z-axis with the Z-axis (as defined above).",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Defined as the pole vector of the Mars Mean Equator of Epoch.",
   :rdf/type [:qudt/NonRotatingInertialFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Mars Mean Equator and IAU-Node of Epoch",
   :skos/definition "Mars Mean Equator And IAU-Node Of Epoch Coordinate System",
   :skos/prefLabel "Mars Mean Equator and IAU-Node of Epoch"})

(def NUMERIC
  "Numeric"
  {:db/ident           :qudt.type/NUMERIC,
   :qudt/ansiSQLName   "DECIMAL(p,s)",
   :qudt/code          101,
   :qudt/literal       "numeric",
   :qudt/odbcName      "SQL_DECIMAL(p,s)",
   :qudt/oracleSQLName "NUMBER(p,s)",
   :rdf/type           [:qudt/NumericType :owl/NamedIndividual],
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label         "Numeric"})

(def NegativeX
  "The axis that is in the negative X direction."
  {:db/ident            :qudt.type/NegativeX,
   :dcterms/description "The axis that is in the negative X direction.",
   :qudt/code           1,
   :qudt/literal        "negativeX",
   :rdf/type            [:qudt/AxialOrientationType
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Negative X"})

(def NegativeY
  "The axis that is in the negative Y direction."
  {:db/ident            :qudt.type/NegativeY,
   :dcterms/description "The axis that is in the negative Y direction.",
   :qudt/code           2,
   :qudt/literal        "negativeY",
   :rdf/type            [:qudt/AxialOrientationType
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Negative Y"})

(def NegativeZ
  "The axis that is in the negative Z direction."
  {:db/ident            :qudt.type/NegativeZ,
   :dcterms/description "The axis that is in the negative Z direction.",
   :qudt/code           3,
   :qudt/literal        "negativeZ",
   :rdf/type            [:qudt/AxialOrientationType
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Negative Z"})

(def NetCDF
  "NetCDF (network Common Data Form) is a set of interfaces for array-oriented data access and a freely-distributed collection of data access libraries for C, Fortran, C++, Java, and other languages. The netCDF libraries support a machine-independent format for representing scientific data. Together, the interfaces, libraries, and format support the creation, access, and sharing of scientific data."
  {:db/ident         :qudt.type/NetCDF,
   :dcterms/description
   "NetCDF (network Common Data Form) is a set of interfaces for array-oriented data access and a freely-distributed collection of data access libraries for C, Fortran, C++, Java, and other languages. The netCDF libraries support a machine-independent format for representing scientific data. Together, the interfaces, libraries, and format support the creation, access, and sharing of scientific data.",
   :rdf/type         [:qudt/MultiDimensionalDataFormat
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "NetCDF"})

(def OCTET
  "Octet"
  {:db/ident          :qudt.type/OCTET,
   :dtype/literal     "octet",
   :qudt/abbreviation "octet",
   :qudt/bits         8,
   :qudt/bytes        1,
   :qudt/cName        "Byte",
   :qudt/code         "800",
   :qudt/encoding     :qudt/OctetEncoding,
   :qudt/id           "T002-01",
   :qudt/literal      "octet",
   :qudt/maxInclusive 255,
   :qudt/minInclusive [0 "0"],
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :qudt/signedness   :qudt/UNSIGNED,
   :rdf/type          [:qudt/OctetType :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "Octet"})

(def ORDERED-TREE
  "Ordered Tree"
  {:db/ident         :qudt.type/ORDERED-TREE,
   :rdf/type         [:qudt/OrderedTree :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Ordered Tree"})

(def OctetEncoding
  "OCTET Encoding"
  {:db/ident         :qudt.type/OctetEncoding,
   :qudt/bytes       1,
   :rdf/type         [:qudt/ByteEncodingType
                      :qudt/BooleanEncodingType
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "OCTET Encoding"})

(def OffOnStateTypeEnumeration
  "A discrete state enumeration whose values are 'off' and 'on'. The 'off' value is encoded as a zero (0) and the 'on' value as a one (1)."
  {:db/ident :qudt.type/OffOnStateTypeEnumeration,
   :dcterms/description
   "A discrete state enumeration whose values are 'off' and 'on'. The 'off' value is encoded as a zero (0) and the 'on' value as a one (1).",
   :qudt/code 1014,
   :qudt/value [:qudt/OOST_ON
                :qudt/OOST_OFF],
   :rdf/type [:qudt/DiscreteState :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Off/On State Type Enumeration"})

(def OnOffStateTypeEnumeration
  "A discrete state enumeration whose values are 'off' and 'on'. The 'on' value is encoded as a zero (0) and the 'off' value as a one (1)."
  {:db/ident :qudt.type/OnOffStateTypeEnumeration,
   :dcterms/description
   "A discrete state enumeration whose values are 'off' and 'on'. The 'on' value is encoded as a zero (0) and the 'off' value as a one (1).",
   :qudt/code 1016,
   :qudt/inverted true,
   :qudt/value [:qudt/OOST_ON
                :qudt/OOST_OFF],
   :rdf/type [:qudt/DiscreteState :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "On/Off State Type Enumeration"})

(def OrderedCOLLECTION
  "Ordered COLLECTION"
  {:db/ident         :qudt.type/OrderedCOLLECTION,
   :rdf/type         [:qudt/OrderedCollection :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Ordered COLLECTION"})

(def Other_TBD
  "2. “The adoption of ICRS on 1 January 1998: meaning and consequences”, Letter to the Editor, M. Feissel and F. Mignard, Astronomy and Astrophysics, 331, L33-L36, 1998, http://adsabs.harvard.edu/cgi-bin/nph- bib_query?bibcode=1998A%26A...331L..33F&amp;db_key=AST&amp;data_typ e=HTML&amp;format= 4. “Lunar Laser Ranging Science: Gravitational Physics and Lunar Interior and Geodesy”, J. G. Williams, S. G. Turyshev, D. H. Boggs, and J. T. Ratcliff, 35th COSPAR Scientific Assembly, Paris, France, July 18-24, 2004, Advances in Space Research, in press 2005, http://arxiv.org/abs/gr-qc/?412049. 6. “JPL Planetary and Lunar Ephemerides, DE403/LE403”, E. M. Standish, X. X. Newhall, J. G. Williams, and W. M. Folkner, JPL IOM 314.10-127, May 22, 1995, http://ssd.jpl.nasa.gov/iau-comm4/de403iom/. 8. IERS Conventions (2003), D. D. McCarthy and Gérard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32. 9. “Lunar coordinates in the regions of the Apollo lander,” M. E. Davies and T. R. Coltin, Journal Of Geophysical Research, V. 105, No. E8, Pages 20, 277-20, 280, August 25, 2000. 10. “A Meaningful Relative Motion Coordinate System For Generic Use,” D. R. Adamo, AAS Paper No. 05-306, presented at the AAS/AIAA Astrodynamics Specialists Conference, Lake Tahoe, California, August 7 - 11, 2005. 11. “Lunar moments, tides, orientation, and coordinate frames,” J. G. Williams, X. X. Newhall, and J. O. Dickey, Planet. Space Sci. 44:1077-1080, 1996."
  {:db/ident :qudt.type/Other_TBD,
   :dcterms/description
   "2. “The adoption of ICRS on 1 January 1998: meaning and consequences”, Letter to the Editor, M. Feissel and F. Mignard, Astronomy and Astrophysics, 331, L33-L36, 1998, http://adsabs.harvard.edu/cgi-bin/nph- bib_query?bibcode=1998A%26A...331L..33F&amp;db_key=AST&amp;data_typ e=HTML&amp;format= \n\n4. “Lunar Laser Ranging Science: Gravitational Physics and Lunar Interior and Geodesy”, J. G. Williams, S. G. Turyshev, D. H. Boggs, and J. T. Ratcliff, 35th COSPAR Scientific Assembly, Paris, France, July 18-24, 2004, Advances in Space Research, in press 2005, http://arxiv.org/abs/gr-qc/?412049.\n\n6. “JPL Planetary and Lunar Ephemerides, DE403/LE403”, E. M. Standish, X. X. Newhall, J. G. Williams, and W. M. Folkner, JPL IOM 314.10-127, May 22, 1995, http://ssd.jpl.nasa.gov/iau-comm4/de403iom/.\n\n8. IERS Conventions (2003), D. D. McCarthy and Gérard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32.\n\n9. “Lunar coordinates in the regions of the Apollo lander,” M. E. Davies and T. R. Coltin, Journal Of Geophysical Research, V. 105, No. E8, Pages 20, 277-20, 280, August 25, 2000.\n\n10. “A Meaningful Relative Motion Coordinate System For Generic Use,” D. R. Adamo, AAS Paper No. 05-306, presented at the AAS/AIAA Astrodynamics Specialists Conference, Lake Tahoe, California, August 7 - 11, 2005.\n11. “Lunar moments, tides, orientation, and coordinate frames,” J. G. Williams, X. X. Newhall, and J. O. Dickey, Planet. Space Sci. 44:1077-1080, 1996.",
   :rdf/type [:qudt/Citation :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Other (TBD)",
   :skos/prefLabel "Other"})

(def POSITIVE-BIG-INTEGER
  "Positive Big Integer"
  {:db/ident          :qudt.type/POSITIVE-BIG-INTEGER,
   :dtype/literal     "PI64",
   :qudt/abbreviation "PI64",
   :qudt/bits         64,
   :qudt/maxInclusive "2^{64}-1",
   :qudt/minInclusive "1",
   :qudt/mySQLName    "BIGINT",
   :qudt/octets       8,
   :qudt/rdfsDatatype :xsd/unsignedLong,
   :qudt/signedness   :qudt/UNSIGNED,
   :rdf/type          [:qudt/PositiveIntegerType :owl/NamedIndividual],
   :rdfs/label        "Positive Big Integer"})

(def POSITIVE-LONG-INTEGER
  "Unsigned Long Integer"
  {:db/ident          :qudt.type/POSITIVE-LONG-INTEGER,
   :dtype/literal     "PI32",
   :qudt/abbreviation "UI32",
   :qudt/bits         32,
   :qudt/encoding     :qudt/UnsignedIntegerEncoding,
   :qudt/maxInclusive "2^{32}-1",
   :qudt/minInclusive "1",
   :qudt/mySQLName    "INT",
   :qudt/octets       4,
   :qudt/rdfsDatatype :xsd/unsignedInt,
   :qudt/signedness   :qudt/UNSIGNED,
   :rdf/type          [:qudt/PositiveIntegerType :owl/NamedIndividual],
   :rdfs/label        "Unsigned Long Integer"})

(def PRIORITY-QUEUE
  "A \"Priority Queue \"is an abstract data type which is like a regular queue or stack data structure, but where additionally each element has a \"priority\" associated with it. In a priority queue, an element with high priority is served before an element with low priority. If two elements have the same priority, they are served according to their order in the queue."
  {:db/ident :qudt.type/PRIORITY-QUEUE,
   :dcterms/description
   "A \"Priority Queue \"is an abstract data type which is like a regular queue or stack data structure, but where additionally each element has a \"priority\" associated with it. In a priority queue, an element with high priority is served before an element with low priority. If two elements have the same priority, they are served according to their order in the queue.",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Priority_queue",
   :rdf/type [:qudt/OrderedCollection :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Priority Queue",
   :rdfs/seeAlso :qudt/HEAP})

(def PadWithAny
  "Pad with either a one or a zero. In other words, this is the \"don't care\" situation."
  {:db/ident :qudt.type/PadWithAny,
   :dcterms/description
   "Pad with either a one or a zero. In other words, this is the \"don't care\" situation.",
   :qudt/literal "none",
   :rdf/type [:qudt/PaddingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Pad with any"})

(def PadWithOnes
  "Pad unused bits of a field with a one."
  {:db/ident            :qudt.type/PadWithOnes,
   :dcterms/description "Pad unused bits of a field with a one.",
   :qudt/literal        "ones",
   :rdf/type            [:qudt/PaddingType :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Pad with ones"})

(def PadWithZeros
  "Pad unused bits of a field with a zero."
  {:db/ident            :qudt.type/PadWithZeros,
   :dcterms/description "Pad unused bits of a field with a zero.",
   :qudt/literal        "zeros",
   :rdf/type            [:qudt/PaddingType :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Pad with zeros"})

(def PartialArray
  "A partial array is an Array with two attributes that define the starting and ending indices of the elements that are provided."
  {:db/ident         :qudt.type/PartialArray,
   :dcterms/description
   "A partial array is an Array with two attributes that define the starting and ending indices of the elements that are provided.",
   :rdf/type         [:qudt/Array :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Partial Array"})

(def Pointer
  "A pointer is a programming language data type whose value refers directly to (or \"points to\") another value stored elsewhere in the computer memory using its address. A pointer references a value stored elsewhere in memory, and obtaining or requesting the value to which a pointer refers is called dereferencing the pointer. A pointer is a simple implementation of the general reference data type. Pointers to data improve performance for repetitive operations such as traversing string and tree structures, and pointers to functions are used for binding methods in Object-oriented programming and run-time linking to dynamic link libraries (DLLs). While \"pointer\" has been used to refer to references in general, it more properly applies to data structures whose interface explicitly allows the pointer to be manipulated as a memory address."
  {:db/ident         :qudt.type/Pointer,
   :dcterms/description
   "A pointer is a programming language data type whose value refers directly to (or \"points to\") another value stored elsewhere in the computer memory using its address. A pointer references a value stored elsewhere in memory, and obtaining or requesting the value to which a pointer refers is called dereferencing the pointer. A pointer is a simple implementation of the general reference data type. Pointers to data improve performance for repetitive operations such as traversing string and tree structures, and pointers to functions are used for binding methods in Object-oriented programming and run-time linking to dynamic link libraries (DLLs).\n\nWhile \"pointer\" has been used to refer to references in general, it more properly applies to data structures whose interface explicitly allows the pointer to be manipulated as a memory address.",
   :rdf/type         [:qudt/ReferenceDatatype :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Pointer"})

(def PositiveX
  "The axis that is in the positive X direction."
  {:db/ident            :qudt.type/PositiveX,
   :dcterms/description "The axis that is in the positive X direction.",
   :qudt/code           4,
   :qudt/literal        "positiveX",
   :rdf/type            [:qudt/AxialOrientationType
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Positive X"})

(def PositiveY
  "The axis that is in the positive Y direction."
  {:db/ident            :qudt.type/PositiveY,
   :dcterms/description "The axis that is in the positive Y direction.",
   :qudt/code           5,
   :qudt/literal        "positiveY",
   :rdf/type            [:qudt/AxialOrientationType
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Positive Y"})

(def PositiveZ
  "The axis that is in the positive Z direction."
  {:db/ident            :qudt.type/PositiveZ,
   :dcterms/description "The axis that is in the positive Z direction.",
   :qudt/code           6,
   :qudt/literal        "positiveZ",
   :rdf/type            [:qudt/AxialOrientationType
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Positive Z"})

(def QUEUE
  "Queue"
  {:db/ident         :qudt.type/QUEUE,
   :rdf/type         [:qudt/OrderedCollection :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Queue"})

(def QuaternionVector-DP
  "<p class=\"lm-para\">This vector type is intended to hold the (real-valued) coefficients to a quaternion number. That is, if \\(V=[a,b,c,d]\\) is a vector of type <i>QUATERNION-VECTOR</i>, then the proper interpretation of this vector is with respect to the basis elements \\(1,i,j,k\\) of the quaternion algebra. Specifically, the V corresponds to the quaternion \\(v = a*1 + b*i + c*j + d*k\\). Note that for most computations, the quaternion basis elements will be replaced with their 4 X 4 dimensional matrix representations, which are elements of type <i>QuaternionBasisMatrix</i>. In this case, the resulting quaternion will be a 4 X 4 dimensional matrix of the form:</p> <pre> a b c d -b a -d c -c d a -b -d -c b a </pre>"
  {:db/ident :qudt.type/QuaternionVector-DP,
   :dcterms/description
   "<p class=\"lm-para\">This vector type is intended to hold the (real-valued) coefficients to a quaternion number. That is, if \\(V=[a,b,c,d]\\) is a vector of type <i>QUATERNION-VECTOR</i>, then the proper interpretation of this vector is with respect to the basis elements \\(1,i,j,k\\) of the quaternion algebra. Specifically, the V corresponds to the quaternion \\(v = a*1 + b*i + c*j + d*k\\). Note that for most computations, the quaternion basis elements will be replaced with their 4 X 4 dimensional matrix representations, which are elements of type <i>QuaternionBasisMatrix</i>. In this case, the resulting quaternion will be a 4 X 4 dimensional matrix of the form:</p>\n<pre>\n  a   b  c  d\n-b   a -d  c\n-c   d  a -b\n-d -c  b   a\n</pre>",
   :qudt/code 340,
   :qudt/dimension 4,
   :qudt/dimensionality 1,
   :qudt/elementType :qudt.type/FLOAT-DP,
   :rdf/type [:qudt/Vector :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Quaternion Vector - double precision"})

(def RELATIVE-DATETIME
  "Days and time relative to some Epoch"
  {:db/ident         :qudt.type/RELATIVE-DATETIME,
   :dcterms/description "Days and time relative to some Epoch",
   :qudt/code        76,
   :qudt/dimensionality 1,
   :qudt/encodingDescription "TBD",
   :qudt/id          "T004-08",
   :qudt/literal     "reldate",
   :rdf/type         [:qudt/DateStringType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Relative date and time"})

(def RRF_EMEPM
  "Earth Mean Equator and Prime Meridian"
  {:db/ident :qudt.type/RRF_EMEPM,
   :qudt/figure :qudt.type/FIG_ICRF_EME-EMEPM,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-07",
   :qudt/literal "EMEPM",
   :dcterms/description
   "Reasonable alternatives include the ICRF precessed and rotated according to any standard precession model, but since the “mean” is an approximation, it seems not worthwhile to additional computation to this definition. Although [Seidelmann2000] specifies TCB (Barycentric Coordinate Time), this in fact was an error introduced late in the preparation of the paper; the correct time scale for use in the IAU formulae given in Table 2.0-1 in the paper is TDB (Barycentric Dynamical Time, i.e., ephemeris time) and the standard epoch is 2451545.0 TDB.",
   :qudt/realization
   "This frame is realized from the ICRF, precessed and rotated according to the formulae in IAU2000.",
   :qudt/xAxisDefinition
   "The intersection of the prime meridian and the rotation equator of the Earth, in the ICRF and as a function of time.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "The mean rotation pole of the Earth, in the ICRF and as a function of time.",
   :rdf/type [:qudt/RotatingReferenceFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth Mean Equator and Prime Meridian",
   :skos/prefLabel "Earth Mean Equator and Prime Meridian"})

(def RRF_EMR
  "In this coordinate frame, the two collinear Lagrange points LL_1 and LL_2 (sometimes called Libration points) both lie along the positive X-axis approximately 60000 kilometers from the Moon. The LL_1 point lies on the X-axis between the Moon and the Earth and the LL_2 point lies on the X-axis on the other side of the Moon away from the Earth. See [Roncoli2005] for more information about Lagrange points."
  {:db/ident :qudt.type/RRF_EMR,
   :dcterms/description
   "In this coordinate frame, the two collinear Lagrange points LL_1 and LL_2 (sometimes called Libration points) both lie along the positive X-axis approximately 60000 kilometers from the Moon. The LL_1 point lies on the X-axis between the Moon and the Earth and the LL_2 point lies on the X-axis on the other side of the Moon away from the Earth. See [Roncoli2005] for more information about Lagrange points.",
   :qudt/code 20,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-08",
   :qudt/literal "EM-ROT",
   :qudt/xAxisDefinition
   "Points in the direction of the vector from the Earth to the Moon.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Points in the direction of the instantaneous orbit normal of the Moon about the Earth.",
   :rdf/type [:qudt/RotatingReferenceFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth-Moon Rotating",
   :skos/definition "Earth-Moon Rotating Coordinate System",
   :skos/prefLabel "Earth-Moon Rotating"})

(def RRF_ICRF
  "The vehicle-centered,EME2000coordinatesystemisusefulforvehicleattitude determination since the positions of stars in star catalogs used with star trackers and other celestial sensors are generally expressed in the EME2000 coordinate frame. However, caution must be exercised here since the EME2000 frames realized in the past by various star catalogs (such as FK5) and ephemerides (such as DE205) were actually slightly different frames because estimates of the actual location EME2000 changed with improvements in models and new data. For this reason the ICRF is the recommended standard.",
  {:db/ident :qudt.type/RRF_ICRF,
   :dcterms/description
   "The ICRF is the best-determined and most stable reference frame and is the “root” frame—other reference frames are often given with respect to the ICRF.",
   :owl/sameAs :qudt.type/NRIF_ICRF,
   :qudt/figure :qudt.type/FIG_ICRF,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-06",
   :qudt/literal "ICRF",
   :qudt/realization
   "The International Celestial Reference Frame (ICRF) was defined in 1995 with locations given for 22 quasars and other bright radio objects. This definition was extended by the addition of more sources in 2000. See Reference 8 for further information.",
   :qudt/xAxisDefinition
   "Defined as the cross product of the Z-axis (as defined above) and the Earth mean orbit pole of J2000 (i.e. the ecliptic pole of J2000). The X-axis of this coordinate frame is the Earth vernal equinox of J2000.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Defined as the pole vector of the Earth Mean Equator of J2000 (where J2000 = Julian date 2451545.0 TDB (Barycentric Dynamical Time)).",
   :rdf/type [:qudt/ReferenceFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "International Celestial Reference Frame",
   :skos/altLabel "Earth Mean Equator and Equinox of J2000",
   :skos/prefLabel "International Celestial Reference Frame"})

(def RRF_ITRF
  "At current levels of accuracy and precision the location of the ITRF at any point in time with respect to the ICRF cannot be predicted because the Earth (and its weather!) are not modeled that accurately. The location of the true pole depends on modeling precession and nutation and then measuring the actual rotation pole relative to the modeled pole with respect to both the ITRF and the ICRF. One can use either the NASA Deep Space Network’s models and file of pole locations, which also includes timing information to tell where the prime meridian was OR one can use the IERS models and file of pole locations and timing called the Earth Orientation Parameters (EOP) file BUT NOT BOTH, e.g., do not use the IERS EOP with the DSN models for precession and nutation. The IERS information is more publicly available and is recommended. See Reference 8 for more information, including the relationships between the various ITRF frames."
  {:db/ident :qudt.type/RRF_ITRF,
   :dcterms/description
   "At current levels of accuracy and precision the location of the ITRF at any point in time with respect to the ICRF cannot be predicted because the Earth (and its weather!) are not modeled that accurately. The location of the true pole depends on modeling precession and nutation and then measuring the actual rotation pole relative to the modeled pole with respect to both the ITRF and the ICRF. One can use either the NASA Deep Space Network’s models and file of pole locations, which also includes timing information to tell where the prime meridian was OR one can use the IERS models and file of pole locations and timing called the Earth Orientation Parameters (EOP) file BUT NOT BOTH, e.g., do not use the IERS EOP with the DSN models for precession and nutation. The IERS information is more publicly available and is recommended. See Reference 8 for more information, including the relationships between the various ITRF frames.",
   :owl/sameAs :qudt.type/NRIF_ETEPMBF,
   :qudt/figure :qudt.type/FIG_ITRF,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-09",
   :qudt/literal "ITRF",
   :qudt/realization
   "The International Terrestrial Reference Frame (ITRF) is realized by the locations of a set of points or stations on a tide-free Earth. As measurements and models have improved or changed, these locations have been changed also and the ITRF has moved slightly with respect to the physical Earth every few years; ITRF93 is recommended.",
   :qudt/xAxisDefinition
   "The intersection of the prime meridian and the rotation equator of the Earth.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition "The rotation pole of the Earth.",
   :rdf/type [:qudt/RotatingReferenceFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "International Terrestrial Reference Frame",
   :rdfs/seeAlso :qudt.type/RRF_ICRF,
   :skos/prefLabel "International Terrestrial Reference Frame"})

(def RRF_LMEBF
  "The location of the LMEBF is a fixed rotation from the LPABF given in [Williams96] as: “The three rotations (in arcseconds) from Principal (P) to Mean (M) axes are M = R_1(-0.15′′) R_2(-79.12′′) R_3(-66.48′′) P.\"\n\nHistorical data and surface maps are given in this frame. Finding the rotation axes and principal axes depends on solving for the dynamics of the Moon’s orientation, which must be done in conjunction with solving for its motion in space, though the Moon’s motion in space can also be solved for independently.\n\nUsing the traditional terminology and syntax for trajectory-related coordinate frames, this frame probably could have been called “Moon True Equator and Prime Meridian Body-Fixed” since the lunar principal axes directions represent the best (or “true”) orientations of the Moon’s pole and prime meridian at any given time. These axes are slightly rotated away from the Moon’s principal axes because the Moon is tidally locked to Earth so that perturbations from higher order terms in the gravity field are not averaged out by rotation.",
  {:db/ident :qudt.type/RRF_LMEBF,
   :dcterms/description
   "Lunar body-fixed coordinate frame aligned with the rotation axis of the Moon.",
   :qudt/citation
   "“Lunar moments, tides, orientation, and coordinate frames,” J. G. Williams, X. X. Newhall, and J. O. Dickey, Planet. Space Sci. 44:1077-1080, 1996.",
   :qudt/code 40,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-10",
   :qudt/literal "LMEBF",
   :qudt/realization
   "This is realized by the locations of the three Apollo and one Lunar laser ranging retroreflectors",
   :qudt/xAxisDefinition
   "Points in the direction of the Moon’s historical prime meridian (mean direction toward Earth).",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Points in the direction of the Moon’s North rotation pole (mean rotation axis).",
   :rdf/type [:qudt/RotatingReferenceFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Lunar Mean Earth Body-Fixed",
   :skos/definition "Lunar Mean Earth Body Fixed Coordinate System",
   :skos/prefLabel "Lunar Mean Earth Body-Fixed"})

(def RRF_LPABF
  "Lunar body-fixed coordinate frame aligned with the principal axes of the Moon. The location of the LPABF in the ICRF should be solved for in conjunction with solving for the Moon’s motion in space."
  {:db/ident :qudt.type/RRF_LPABF,
   :dcterms/description
   "Lunar body-fixed coordinate frame aligned with the principal axes of the Moon. The location of the LPABF in the ICRF should be solved for in conjunction with solving for the Moon’s motion in space.",
   :qudt/code 42,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-11",
   :qudt/literal "LPABF",
   :qudt/realization "This is a fixed rotation from LMEBF",
   :qudt/xAxisDefinition
   "Points in the direction of the Moon's prime meridian principal axis (minimum moment of inertia).",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Points in the direction of the Moon's North pole principal axis (maximum moment of inertia).",
   :rdf/type [:qudt/RotatingReferenceFrame :owl/NamedIndividual],
   :rdfs/comment
   "Lunar gravity fields are defined in this frame. Finding the principal axes depends on solving for the dynamics of the Moon’s orientation, which must be done in conjunction with solving for its motion in space, though the Moon’s motion in space can also be solved for independently. The terms “north pole” and “prime meridian” are loosely used for the Z and X axes respectively of both this and the Lunar Mean Earth frames",
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Lunar Principal Axis Body-Fixed",
   :skos/prefLabel "Lunar Principal Axis Body-Fixed"})

(def RRF_LVC
  "Since this coordinate system is non-Euclidean, the axes are not defined by vectors but are lines and circles in space through an origin at a vehicle in orbit around a central body."
  {:db/ident :qudt.type/RRF_LVC,
   :dcterms/description
   "Since this coordinate system is non-Euclidean, the axes are not defined by vectors but are lines and circles in space through an origin at a vehicle in orbit around a central body.",
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-12",
   :qudt/literal "LVC",
   :qudt/realization
   "Defined by the position and velocity vectors associated with a vehicle and thus directly related to the coordinate system in which those vectors are expressed.",
   :qudt/xAxisDefinition
   "Defined as the circle that intersects the vehicle center-of-mass, is centered on the central body center, and lies in the vehicle orbit plane, positive in the direction of motion.",
   :qudt/xCoordinateDefinition
   "Defined as the distance on C between the radial projection of P onto C and the Y-axis; this is taken to be positive if P is on the same side from the Y-Z plane as the vehicle velocity vector points and negative otherwise. Equivalently, if we let θ be the centralbody-centered angle from the vehicle to the projection of P onto the orbit plane (measured positively in a right-handed sense with respect to the vehicle orbit angular momentum), then the xcoordinate of the point is θ (in radians) times the radius of the vehicle. Note that the LVC x-coordinate is arbitrary for P located on N.",
   :qudt/yAxisDefinition
   "Defined as the line that intersects the vehicle center-of-mass and is normal to the vehicle orbit plane, positive opposite the direction of the orbit angular momentum vector (thus completing a right-handed coordinate system).",
   :qudt/yCoordinateDefinition
   "Defined as the distance from the orbit plane, positive on the side opposite the angular momentum direction.",
   :qudt/zAxisDefinition
   "Defined as the line through the vehicle center-of-mass and the central body center, positive toward the central body center.",
   :qudt/zCoordinateDefinition
   "Defined as the distance from the central body center to the vehicle center-of-mass minus the distance between P and N; equivalently, the radius of C minus the radius of the projection of P onto the vehicle orbit plane.",
   :rdf/type [:qudt/RotatingReferenceFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Local Vertical Curvilinear",
   :skos/prefLabel "Local Vertical Curvilinear"})

(def RRF_LVLH
  "Local Vertical Local Horizontal"
  {:db/ident :qudt.type/RRF_LVLH,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-13",
   :qudt/literal "LVLH",
   :qudt/realization
   "Defined by the position and velocity vectors associated with a Relationships: vehicle and thus directly related to the coordinate system in which those vectors are expressed.",
   :qudt/xAxisDefinition
   "Defined as the circle that intersects the vehicle center-of-mass, is centered on the central body center, and lies in the vehicle orbit plane, positive in the direction of motion.",
   :qudt/yAxisDefinition
   "Completes a standard, right-handed coordinate frame and is positive in the direction of vehicle motion.",
   :qudt/zAxisDefinition
   "Defined as a line that lies along the radius vector from the central body center to the vehicle center-of-mass and is positive toward the central body center.",
   :rdf/type [:qudt/RotatingReferenceFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Local Vertical Local Horizontal"})

(def RRF_MMEPMBF
  "Mars body-fixed coordinate frame with the Mars North pole and prime meridian directions defined by the IAU/IAG [@Seidelmann:2000]."
  {:db/ident :qudt.type/RRF_MMEPMBF,
   :dcterms/description
   "Mars body-fixed coordinate frame with the Mars North pole and prime meridian directions defined by the IAU/IAG [@Seidelmann:2000].",
   :qudt/code 52,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-14",
   :qudt/literal "MMEPMBF",
   :rdf/type [:qudt/RotatingReferenceFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Mars Mean Equator and Prime Meridian Body-Fixed",
   :skos/definition
   "Mars Mean Equator And Prime Meridian Body-Fixed Coordinate System",
   :skos/prefLabel "Mars Mean Equator and Prime Meridian Body-Fixed"})

(def RRF_SER
  "In this coordinate frame, the two collinear Lagrange points EL_1 and EL_2 (sometimes called Libration points) both lie along the positive X-axis approximately 1.5 million kilometers from the Earth. The EL_1 point lies on the X-axis between the Earth and the Sun and the EL_2 point lies on the X-axis on the other side of the Earth away from the Sun. See [Roncoli2005] for more information about Lagrange points."
  {:db/ident :qudt.type/RRF_SER,
   :dcterms/description
   "In this coordinate frame, the two collinear Lagrange points EL_1 and EL_2 (sometimes called Libration points) both lie along the positive X-axis approximately 1.5 million kilometers from the Earth. The EL_1 point lies on the X-axis between the Earth and the Sun and the EL_2 point lies on the X-axis on the other side of the Earth away from the Sun. See [Roncoli2005] for more information about Lagrange points.",
   :qudt/code 92,
   :qudt/figure :qudt.type/FIG_EM-ROT,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-15",
   :qudt/literal "SE-ROT",
   :qudt/xAxisDefinition
   "Points in the direction of the vector from the Sun to the Earth.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Points in the direction of the instantaneous orbit normal of the Earth about the Sun.",
   :rdf/type [:qudt/RotatingReferenceFrame :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Sun-Earth Rotating"})

(def Roncoli2005
  "\"Lunar Constants and Models Document”, R. Roncoli, JPL D-32296, September 23, 2005, http://ssd.jpl.nasa.gov/?lunar_doc."
  {:db/ident :qudt.type/Roncoli2005,
   :dcterms/description
   "\"Lunar Constants and Models Document”, R. Roncoli, JPL D-32296, September 23, 2005, http://ssd.jpl.nasa.gov/?lunar_doc.",
   :qudt/url "http://ssd.jpl.nasa.gov/?lunar_doc",
   :rdf/type [:qudt/Citation :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Roncoli2005",
   :skos/prefLabel "Roncoli2005"})

(def SEQUENCE
  "SEQUENCE"
  {:db/ident         :qudt.type/SEQUENCE,
   :rdf/type         [:qudt/Sequence :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "SEQUENCE"})

(def SET
  "SET"
  {:db/ident         :qudt.type/SET,
   :rdf/type         [:qudt/Set :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "SET"})

(def SIGNED-BIG-INTEGER
  "<p>The <em>Signed Big Integer</em>, (<em>long</em> in Java) data type is a 64-bit signed two's complement integer. It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive). Use this data type when you need a range of values wider than those provided by int.</p> The\"Signed Big Integer\", (\\textit{long) in Java) data type is a 64-bit signed two's complement integer. It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive). Use this data type when you need a range of values wider than those provided by int."
  {:db/ident :qudt.type/SIGNED-BIG-INTEGER,
   :dcterms/description
   ["<p>The <em>Signed Big Integer</em>, (<em>long</em> in Java) data type is a 64-bit signed two's complement integer. It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive). Use this data type when you need a range of values wider than those provided by int.</p>"
    "The\"Signed Big Integer\", (\\textit{long) in Java) data type is a 64-bit signed two's complement integer. It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive). Use this data type when you need a range of values wider than those provided by int."],
   :dtype/literal "SI64",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/4xwz0t37(v=vs.71).aspx"
    "http://msdn.microsoft.com/en-us/library/4xwz0t37(v=vs.71).aspx"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"
    "http://www.mathworks.com/help/matlab/ref/int16.html"
    "http://docs.python.org/2/library/stdtypes.html"
    "http://docs.python.org/2/library/stdtypes.html"
    "http://www.mathworks.com/help/matlab/ref/int16.html"],
   :qudt/abbreviation "SI64",
   :qudt/bits 64,
   :qudt/code 109,
   :qudt/encoding :qudt/LongUnsignedIntegerEncoding,
   :qudt/id "T002-02",
   :qudt/javaName "long",
   :qudt/literal "SI64",
   :qudt/matlabName "int64",
   :qudt/maxInclusive "2^{63}-1",
   :qudt/minInclusive ["-2^{63}" "- 2^{63}-1"],
   :qudt/mySQLName "BIGINT",
   :qudt/octets 8,
   :qudt/protocolBuffersName "int64",
   :qudt/rdfsDatatype :xsd/long,
   :qudt/signedness :qudt/SIGNED,
   :rdf/type [:qudt/SignedBigIntegerType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Signed Big Integer"})

(def SIGNED-INTEGER
  "The \"Signed Integer} or \\textit{short} data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 ( $-2^{15}$ ) and a maximum (inclusive) value of 32,767 ($2^{15\"$). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters."
  {:db/ident :qudt.type/SIGNED-INTEGER,
   :dcterms/description
   "The \"Signed Integer} or \\textit{short} data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 ( $-2^{15}$ ) and a maximum (inclusive) value of 32,767 ($2^{15\"$). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/4xwz0t37(v=vs.71).aspx"
    "http://www.mathworks.com/help/matlab/ref/int16.html"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"
    "http://docs.python.org/2/library/stdtypes.html"],
   :qudt/abbreviation "SI16",
   :qudt/ansiSQLName "SMALLINT",
   :qudt/bits 16,
   :qudt/bytes 2,
   :qudt/code 105,
   :qudt/encoding :qudt/ShortSignedIntegerEncoding,
   :qudt/id "T002-03",
   :qudt/javaName "short",
   :qudt/jsName "short",
   :qudt/literal "SI16",
   :qudt/matlabName "int16",
   :qudt/maxInclusive "32767",
   :qudt/microsoftSQLServerName "smallint",
   :qudt/minInclusive "-32767",
   :qudt/mySQLName "SMALLINT",
   :qudt/rdfsDatatype :xsd/short,
   :rdf/type [:qudt/SignedIntegerType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Signed Integer"})

(def SIGNED-LONG-INTEGER
  "A \\textit{Signed Long Integer) is a 32 bit signed integer in 2's complement form. It has a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive). For integral values, this data type is generally the default choice unless there is a reason (like the above) to choose something else. This data type will most likely be large enough for the numbers your program will use, but if you need a wider range of values, use long instead."
  {:db/ident :qudt.type/SIGNED-LONG-INTEGER,
   :dcterms/description
   "A \\textit{Signed Long Integer) is a 32 bit signed integer in 2's complement form.  It has a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive). For integral values, this data type is generally the default choice unless there is a reason (like the above) to choose something else. This data type will most likely be large enough for the numbers your program will use, but if you need a wider range of values, use long instead.",
   :dtype/literal "SI32",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/4xwz0t37(v=vs.71).aspx"
    "http://msdn.microsoft.com/en-us/library/4xwz0t37(v=vs.71).aspx"
    "http://docs.python.org/2/library/stdtypes.html"
    "http://docs.python.org/2/library/stdtypes.html"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"],
   :qudt/abbreviation "SI32",
   :qudt/ansiSQLName "INTEGER",
   :qudt/bits 32,
   :qudt/bytes 4,
   :qudt/cName "int",
   :qudt/id "T002-04",
   :qudt/javaName "int",
   :qudt/jsName "int",
   :qudt/literal "SI32",
   :qudt/matlabName "int32",
   :qudt/maxInclusive ["2^{31}-1" "2^{31}- 1"],
   :qudt/microsoftSQLServerName "integer",
   :qudt/minInclusive ["-2^31 -1" "-2^{31}"],
   :qudt/mySQLName "INT",
   :qudt/octets 4,
   :qudt/odbcName "SQL_INTEGER",
   :qudt/oleDBName "DBTYPE_I4",
   :qudt/oracleSQLName "NUMBER(10)",
   :qudt/protocolBuffersName "int32",
   :qudt/rdfsDatatype :xsd/int,
   :qudt/signedness :qudt/SIGNED
   :rdf/type [:qudt/SignedLongIntegerType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Signed Long Integer"})

(def SIGNED-MEDIUM-INTEGER
  "Signed Medium Integer"
  {:db/ident :qudt.type/SIGNED-MEDIUM-INTEGER,
   :prov/wasInfluencedBy
   "http://dev.mysql.com/doc/refman/5.0/en/integer-types.html",
   :qudt/abbreviation "SI24",
   :qudt/bits 24,
   :qudt/bytes 3,
   :qudt/maxInclusive 8388607,
   :qudt/minInclusive -8388608,
   :qudt/mySQLName "MEDIUMINT",
   :rdf/type [:qudt/SignedMediumIntegerType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Signed Medium Integer"})

(def SIGNED-SHORT-INTEGER
  "Unsigned 8 bit integer."
  {:db/ident            :qudt.type/SIGNED-SHORT-INTEGER,
   :dcterms/description "Unsigned 8 bit integer.",
   :qudt/abbreviation   "SI8",
   :qudt/ansiSQLName    "NUMERIC(3,0)",
   :qudt/bits           8,
   :qudt/bytes          1,
   :qudt/code           103,
   :qudt/encoding       :qudt/OctetEncoding,
   :qudt/id             "T002-06",
   :qudt/literal        "SI8",
   :qudt/maxInclusive   "127",
   :qudt/microsoftSQLServerName "tinyint",
   :qudt/minInclusive   "-127",
   :qudt/mySQLName      "TINYINT",
   :qudt/octets         1,
   :qudt/odbcName       "SQL_TINYINT",
   :qudt/oleDBName      "DBTYPE_I1",
   :qudt/rdfsDatatype   :xsd/byte,
   :rdf/type            [:qudt/SignedShortIntegerType
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Signed Short Integer"})

(def STRING
  "String consisting of UTF-8 characters"
  {:db/ident            :qudt.type/STRING,
   :dcterms/description "String consisting of UTF-8 characters",
   :dtype/literal       "string",
   :owl/sameAs          :qudt/UTF8-STRING,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt.type/UTF8-CHAR,
   :qudt/encoding       :qudt/UTF8-StringEncoding,
   :qudt/protocolBuffersName "string",
   :qudt/rdfsDatatype   :xsd/string,
   :rdf/type            [:qudt/StringUTF8 :owl/NamedIndividual],
   :rdfs/label          "String"})

(def STRUCT
  "A struct is C's and C++'s notion of a composite type, a datatype that composes a fixed set of labeled fields or members. It is so called because of the struct keyword used in declaring them, which is short for structure or, more precisely, user-defined data structure. A struct declaration consists of a list of fields, each of which can have any type. The total storage required for a struct object is the sum of the storage requirements of all the fields, plus any internal padding. [Wikipedia]"
  {:db/ident         :qudt.type/STRUCT,
   :dcterms/description
   "A struct is C's and C++'s notion of a composite type, a datatype that composes a fixed set of labeled fields or members. It is so called because of the struct keyword used in declaring them, which is short for structure or, more precisely, user-defined data structure. A struct declaration consists of a list of fields, each of which can have any type. The total storage required for a struct object is the sum of the storage requirements of all the fields, plus any internal padding. [Wikipedia]",
   :rdf/type         [:qudt/CompositeDatatype :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "STRUCT"})

(def ScaleVector3D-DP
  "Scale 3D Vector - double precision"
  {:db/ident            :qudt.type/ScaleVector3D-DP,
   :qudt/code           350,
   :qudt/dimension      3,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt.type/FLOAT-DP,
   :rdf/type            [:qudt/Vector :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Scale 3D Vector - double precision"})

(def Seidelmann2000
  "“Report of the IAU/IAG Working Group on Cartographic Coordinates and Rotational Elements of the Planets and Satellites: 2000”, P.K. Seidelmann, V. K. Abalakin, M. Bursa, M. E. Davies, C. DeBergh, J. H. Lieske, J. Oberst, J. L. Simon, E. M. Standish, P. Stooke, and P. C. Thomas, Celestial Mechanics and Dynamical Astronomy 82: 83-110, 2002 (http://springerlink.metapress.com, follow the links from “Browse by Online Libraries (subject areas)”, then “Physics and Astronomy”, then “Celestial Mechanics and Dynamical Astronomy”, then “Volume 82 - Number 1/January 2002”, then follow the links to download the paper."
  {:db/ident :qudt.type/Seidelmann2000,
   :dcterms/description
   "“Report of the IAU/IAG Working Group on Cartographic Coordinates and Rotational Elements of the Planets and Satellites: 2000”, P.K. Seidelmann, V. K. Abalakin, M. Bursa, M. E. Davies, C. DeBergh, J. H. Lieske, J. Oberst, J. L. Simon, E. M. Standish, P. Stooke, and P. C. Thomas, Celestial Mechanics and Dynamical Astronomy 82: 83-110, 2002 (http://springerlink.metapress.com, follow the links from “Browse by Online Libraries (subject areas)”, then “Physics and Astronomy”, then “Celestial Mechanics and Dynamical Astronomy”, then “Volume 82 - Number 1/January 2002”, then follow the links to download the paper.",
   :rdf/type [:qudt/Citation :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Seidelmann2000",
   :skos/prefLabel "Seidelmann2000"})

(def ShortSignedIntegerEncoding
  "Short Signed Integer Encoding"
  {:db/ident         :qudt.type/ShortSignedIntegerEncoding,
   :qudt/bytes       2,
   :rdf/type         [:qudt/IntegerEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Short Signed Integer Encoding"})

(def ShortUnsignedIntegerEncoding
  "Short Unsigned Integer Encoding"
  {:db/ident         :qudt.type/ShortUnsignedIntegerEncoding,
   :qudt/bytes       2,
   :rdf/type         [:qudt/IntegerEncodingType
                      :qudt/BooleanEncodingType
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Short Unsigned Integer Encoding"})

(def Signed
  "Signed"
  {:db/ident         :qudt.type/Signed,
   :qudt/literal     "signed",
   :rdf/type         [:qudt/SignednessType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Signed"})

(def SignedIntegerEncoding
  "Signed Integer Encoding"
  {:db/ident         :qudt.type/SignedIntegerEncoding,
   :qudt/bytes       4,
   :rdf/type         [:qudt/IntegerEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Signed Integer Encoding"})

(def SinglePrecisionRealEncoding
  "Single Precision Real Encoding"
  {:db/ident         :qudt.type/SinglePrecisionRealEncoding,
   :qudt/bytes       32,
   :rdf/type         [:qudt/FloatingPointEncodingType
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Single Precision Real Encoding"})

(def Stack
  "Stack"
  {:db/ident         :qudt.type/Stack,
   :rdf/type         [:qudt/OrderedCollection :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Stack"})

(def StateSpaceMatrix-2X2-DP
  "State space matrix 2 by 2 Double Precision"
  {:db/ident            :qudt.type/StateSpaceMatrix-2X2-DP,
   :qudt/code           321,
   :qudt/dimensionality 2,
   :qudt/elementType    :qudt.type/FLOAT-DP,
   :qudt/hasDimensionVector [2 2],
   :rdf/type            [:qudt/StateSpaceMatrix :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State space matrix 2 by 2 Double Precision"})

(def StateSpaceMatrix-2by4-FLOATDP
  "State space matrix 2 by 4 Double Precision"
  {:db/ident            :qudt.type/StateSpaceMatrix-2by4-FLOATDP,
   :qudt/code           323,
   :qudt/dimensionality 2,
   :qudt/elementType    :qudt.type/FLOAT-DP,
   :qudt/hasDimensionVector [2 4],
   :rdf/type            [:qudt/StateSpaceMatrix :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State space matrix 2 by 4 Double Precision"})

(def StateSpaceMatrix-4X4-DP
  "State space matrix 4 by 4 Double Precision"
  {:db/ident            :qudt.type/StateSpaceMatrix-4X4-DP,
   :qudt/code           327,
   :qudt/dimensionality 2,
   :qudt/elementType    :qudt.type/FLOAT-DP,
   :qudt/hasDimensionVector [4 4],
   :rdf/type            [:qudt/StateSpaceMatrix :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State space matrix 4 by 4 Double Precision"})

(def StateSpaceMatrix-4by2-DoublePrecision
  "State space matrix 4 by 2 Double Precision"
  {:db/ident            :qudt.type/StateSpaceMatrix-4by2-DoublePrecision,
   :qudt/code           325,
   :qudt/dimensionality 2,
   :qudt/elementType    :qudt.type/FLOAT-DP,
   :qudt/hasDimensionVector [4 2],
   :rdf/type            [:qudt/StateSpaceMatrix :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State space matrix 4 by 2 Double Precision"})

(def StateVector-DP
  "State Vector Double Precision"
  {:db/ident            :qudt.type/StateVector-DP,
   :qudt/code           353,
   :qudt/dimension      3,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt.type/FLOAT-DP,
   :rdf/type            [:qudt/StateSpaceVector :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State Vector Double Precision"})

(def StateVector-SP
  "State Vector Single Precision"
  {:db/ident            :qudt.type/StateVector-SP,
   :qudt/code           351,
   :qudt/dimension      3,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt.type/FLOAT-SP,
   :rdf/type            [:qudt/StateSpaceVector :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State Vector Single Precision"})

(def TABLE
  "TABLE"
  {:db/ident         :qudt.type/TABLE,
   :rdf/type         [:qudt/Table :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "TABLE"})

(def TABLE-2x4
  "TABLE-2x4"
  {:db/ident            :qudt.type/TABLE-2x4,
   :qudt/byRow          true,
   :qudt/columns        4,
   :qudt/dimensionality 2,
   :qudt/hasDimensionVector [2 4],
   :qudt/rows           2,
   :rdf/type            [:qudt/Table :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "TABLE-2x4"})

(def TBRCS_EC-EMR
  "Earth-Centered Earth-Moon Rotating Coordinate System"
  {:db/ident            :qudt.type/TBRCS_EC-EMR,
   :qudt/code           20,
   :qudt/coordinateCenter :qudt.type/CC_EarthCentered,
   :qudt/id             "TTBRCS-01",
   :qudt/literal        "EM-ROT",
   :qudt/referenceFrame :qudt.type/RRF_EMR,
   :rdf/type            [:qudt/ThreeBodyRotatingCoordinateSystem
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Earth-Centered Earth-Moon Rotating Coordinate System"})

(def TBRCS_EC-SER
  "Earth-Centered Sun Earth Rotating Coordinate System"
  {:db/ident            :qudt.type/TBRCS_EC-SER,
   :qudt/code           92,
   :qudt/coordinateCenter :qudt.type/CC_EarthCentered,
   :qudt/id             "TTBRCS-02",
   :qudt/literal        "SE-ROT",
   :qudt/referenceFrame :qudt.type/RRF_SER,
   :rdf/type            [:qudt/ThreeBodyRotatingCoordinateSystem
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Earth-Centered Sun Earth Rotating Coordinate System",
   :skos/definition     "Earth-Centered Sun Earth Rotating Coordinate System"})

(def TBRCS_MC-EMR
  "Moon-Centered Earth-Moon Rotating Coordinate System"
  {:db/ident            :qudt.type/TBRCS_MC-EMR,
   :qudt/code           20,
   :qudt/coordinateCenter :qudt.type/CC_MoonCentered,
   :qudt/id             "TTBRCS-03",
   :qudt/literal        "EM-ROT",
   :qudt/referenceFrame :qudt.type/RRF_EMR,
   :rdf/type            [:qudt/ThreeBodyRotatingCoordinateSystem
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Moon-Centered Earth-Moon Rotating Coordinate System"})

(def TBRCS_SC-SER
  "Sun-Centered Sun Earth Rotating Coordinate System"
  {:db/ident            :qudt.type/TBRCS_SC-SER,
   :qudt/code           92,
   :qudt/coordinateCenter :qudt.type/CC_SunCentered,
   :qudt/id             "TTBRCS-04",
   :qudt/literal        "SE-ROT",
   :qudt/referenceFrame :qudt.type/RRF_SER,
   :rdf/type            [:qudt/ThreeBodyRotatingCoordinateSystem
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Sun-Centered Sun Earth Rotating Coordinate System",
   :skos/definition     "Sun-Centered Sun Earth Rotating Coordinate System"})

(def TIME
  "Time in hh:mm:ss[Z|(+|-)hh:mm]format."
  {:db/ident            :qudt.type/TIME,
   :dcterms/description "Time in hh:mm:ss[Z|(+|-)hh:mm]format.",
   :qudt/code           68,
   :qudt/id             "T004-12",
   :qudt/literal        "time",
   :qudt/rdfsDatatype   :xsd/time,
   :rdf/type            [:qudt/TimeStringType :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "TIME"})

(def TREE
  "TREE"
  {:db/ident         :qudt.type/TREE,
   :rdf/type         [:qudt/Tree :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "TREE"})

(def TYPE-MATRIX-4by4-FLOATDP
  "TYPE-MATRIX-4by4-FLOATDP"
  {:db/ident         :qudt.type/TYPE-MATRIX-4by4-FLOATDP,
   :rdf/type         [:qudt/TypeList :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "TYPE-MATRIX-4by4-FLOATDP"})

(def UNARY-FUNCTION
  "This type identifies functions that have exactly one argument."
  {:db/ident           :qudt.type/UNARY-FUNCTION,
   :dcterms/description
   "This type identifies functions that have exactly one argument.",
   :qudt/functionArity 1,
   :rdf/type           [:qudt/FunctionDatatype :owl/NamedIndividual],
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label         "UNARY-FUNCTION"})

(def UNSIGNED-BIG-INTEGER
  "Unsigned Big Integer"
  {:db/ident          :qudt.type/UNSIGNED-BIG-INTEGER,
   :dtype/literal     "UI64",
   :qudt/abbreviation "UI64",
   :qudt/bits         64,
   :qudt/code         117,
   :qudt/id           "T002-08",
   :qudt/literal      "UI64",
   :qudt/maxInclusive "2^{64}-1",
   :qudt/minInclusive "0",
   :qudt/mySQLName    "BIGINT",
   :qudt/octets       8,
   :qudt/rdfsDatatype :xsd/unsignedLong,
   :qudt/signedness   :qudt/UNSIGNED,
   :rdf/type          [:qudt/UnsignedBigIntegerType
                       :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "Unsigned Big Integer"})

(def UNSIGNED-INTEGER
  "An unsigned 16-bit integer in the range 0 to 65,535"
  {:db/ident            :qudt.type/UNSIGNED-INTEGER,
   :dcterms/description "An unsigned 16-bit integer in the range 0 to 65,535",
   :qudt/abbreviation   "UI16",
   :qudt/bits           16,
   :qudt/code           113,
   :qudt/id             "T002-09",
   :qudt/literal        "UI16",
   :qudt/maxInclusive   "65535",
   :qudt/microsoftSQLServerName "smallint",
   :qudt/minInclusive   "0",
   :qudt/mySQLName      "SMALLINT",
   :qudt/rdfsDatatype   :xsd/unsignedShort,
   :qudt/signedness     :qudt/UNSIGNED,
   :rdf/type            [:qudt/UnsignedIntegerType
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Unsigned Integer"})

(def UNSIGNED-LONG-INTEGER
  "Unsigned Long Integer"
  {:db/ident          :qudt.type/UNSIGNED-LONG-INTEGER,
   :dtype/literal     "UI32",
   :qudt/abbreviation "UI32",
   :qudt/bits         32,
   :qudt/code         115,
   :qudt/encoding     :qudt/UnsignedIntegerEncoding,
   :qudt/id           "T002-10",
   :qudt/literal      "UI32",
   :qudt/maxInclusive "2^{32}-1",
   :qudt/minInclusive "0",
   :qudt/mySQLName    "INT",
   :qudt/octets       4,
   :qudt/rdfsDatatype :xsd/unsignedInt,
   :qudt/signedness   :qudt/UNSIGNED,
   :rdf/type          [:qudt/UnsignedLongIntegerType
                       :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "Unsigned Long Integer"})

(def UNSIGNED-MEDIUM-INTEGER
  "Unsigned Medium Integer"
  {:db/ident :qudt.type/UNSIGNED-MEDIUM-INTEGER,
   :prov/wasInfluencedBy
   "http://dev.mysql.com/doc/refman/5.0/en/integer-types.html",
   :qudt/abbreviation "UI24",
   :qudt/bits 24,
   :qudt/bytes 3,
   :qudt/maxInclusive 8388607,
   :qudt/minInclusive -8388608,
   :qudt/mySQLName "MEDIUMINT",
   :qudt/signedness :qudt/UNSIGNED,
   :rdf/type [:qudt/UnsignedMediumIntegerType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Unsigned Medium Integer"})

(def UNSIGNED-SHORT-INTEGER
  "Unsigned Short Integer"
  {:db/ident :qudt.type/UNSIGNED-SHORT-INTEGER,
   :dtype/literal "UI8",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"
    "http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"],
   :qudt/abbreviation "UI8",
   :qudt/bits 8,
   :qudt/code 111,
   :qudt/id "T002-13",
   :qudt/literal "UI8",
   :qudt/maxInclusive 255,
   :qudt/microsoftSQLServerName "tinyint",
   :qudt/minInclusive [0 "0"],
   :qudt/octets 1,
   :qudt/oleDBName "DBTYPE_UI1",
   :qudt/rdfsDatatype :xsd/unsignedByte,
   :qudt/signedness :qudt/UNSIGNED,
   :rdf/type [:qudt/OctetType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Unsigned Short Integer"})

(def UTC-DATETIME
  "UTC is the time-scale maintained by the BIPM, with assistance from the IERS, which forms the basis of a coordinated dissemination of standard frequencies and time signals. It corresponds exactly in rate with the international reference scale of atomic time (TAI) but differs from it by an integer number of seconds. TAI, based on the second (SI), as realized on the rotating geoid, is formed by the BIPM on the basis of clock data supplied by cooperating establishments. It is in the form of a continuous scale, e.g. in days, hours, minutes and seconds from the origin 1 January, 1958 (adopted by the CGPM 1971)."
  {:db/ident :qudt.type/UTC-DATETIME,
   :dcterms/description
   "UTC is the time-scale maintained by the BIPM, with assistance from the IERS, which forms the basis of a coordinated dissemination of standard frequencies and time signals. It corresponds exactly in rate with  the international reference scale of atomic time (TAI) but differs from it by an integer number of seconds.  TAI, based on the second (SI), as realized on the rotating geoid, is formed by the BIPM on the basis of clock data supplied by cooperating establishments. It is in the form of a continuous scale, e.g. in days, hours, minutes and seconds from the origin 1 January, 1958 (adopted by the CGPM 1971). ",
   :qudt/code 78,
   :qudt/encodingDescription
   "YYYY-MM-DDThh:mm:ss[.dd] or YYYY-DDDThh:mm:ss[.dd], where 'YYYY' is the year, 'MM' is the two-digit month, 'DD' is the two-digit day, 'DDD' is the three digit day of year, 'T' is constant, 'hh:mm:ss[.dd]' is the UTC time in hours, minutes, seconds, and optional fractional seconds. As many 'd' characters to the right of the period as required may be used to obtain the required precision. All fields require leading zeros.",
   :qudt/id "T004-13",
   :qudt/literal "utc-date",
   :qudt/rdfsDatatype :xsd/dateTime,
   :rdf/type [:qudt/DateStringType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "UTC Date Time"})

(def UTC-DAYTIME
  "UTC DAY TIME"
  {:db/ident          :qudt.type/UTC-DAYTIME,
   :qudt/code         79,
   :qudt/encodingDescription
   "YYYY-DDDThh:mm:ss.ddZ, where each character is an ASCII character using one octet with the following meanings: YYYY = Year in four-character subfield with values 0001-9999, DDD = Day of year in three-character subfield with values 001-365 or -366, T =  Calendar-Time separator, hh = Hour in two-character subfield with values 00-23,  mm = Minute in two-character subfield with values 00-59, ss = Second in two-character subfield with values 00-59 (-58 or -60 during leap seconds), dd = Decimal fraction of second in one- to n-character subfield, each d has values 0-9, and Z = time code terminator (optional)",
   :qudt/id           "T004-14",
   :qudt/literal      "utc-dayTime",
   :qudt/rdfsDatatype :qudt/UTC-DayTime,
   :rdf/type          [:qudt/DateStringType :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "UTC DAY TIME"})

(def UTF16-CHAR
  "UTF16 CHAR"
  {:db/ident          :qudt.type/UTF16-CHAR,
   :dtype/literal     "utf16",
   :qudt/bits         16,
   :qudt/code         150,
   :qudt/id           "T001-04",
   :qudt/literal      "utf16",
   :qudt/octets       2,
   :qudt/rdfsDatatype :xsd/short,
   :rdf/type          [:qudt/CharacterType :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "UTF16 CHAR"})

(def UTF16STRING
  "UTF-16 String"
  {:db/ident            :qudt.type/UTF16STRING,
   :qudt/code           600,
   :qudt/dimensionality 1,
   :qudt/encoding       :qudt/UTF16-StringEncoding,
   :qudt/literal        "utf16",
   :rdf/type            [:qudt/StringUTF16 :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "UTF-16 String"})

(def UTF16StringEncoding
  "UTF-16 String"
  {:db/ident         :qudt.type/UTF16StringEncoding,
   :rdf/type         [:qudt/StringEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "UTF-16 String"})

(def UTF8-CHAR
  "UTF8 CHAR"
  {:db/ident          :qudt.type/UTF8-CHAR,
   :dtype/literal     "utf8",
   :qudt/bits         8,
   :qudt/code         122,
   :qudt/id           "T001-05",
   :qudt/literal      "utf8",
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type          [:qudt/CharacterType :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "UTF8 CHAR"})

(def UTF8STRING
  "String consisting of UTF-8 characters"
  {:db/ident            :qudt.type/UTF8STRING,
   :dcterms/description "String consisting of UTF-8 characters",
   :qudt/code           500,
   :qudt/dimensionality 1,
   :qudt/encoding       :qudt/UTF8-StringEncoding,
   :qudt/literal        "utf8",
   :rdf/type            [:qudt/StringUTF8 :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "UTF-8 String"})

(def UTF8StringEncoding
  "UTF-8 Encoding"
  {:db/ident         :qudt.type/UTF8StringEncoding,
   :qudt/bytes       8,
   :rdf/type         [:qudt/StringEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "UTF-8 Encoding"})

(def Unsigned
  "Unsigned"
  {:db/ident         :qudt.type/Unsigned,
   :qudt/literal     "unsigned",
   :rdf/type         [:qudt/SignednessType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Unsigned"})

(def UnsignedIntegerEncoding
  "Unsigned Integer Encoding"
  {:db/ident         :qudt.type/UnsignedIntegerEncoding,
   :qudt/bytes       4,
   :rdf/type         [:qudt/IntegerEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Unsigned Integer Encoding"})

(def VCS_VC-LVC
  "Vehicle centered local vertical curvilinear coordinate system"
  {:db/ident :qudt.type/VCS_VC-LVC,
   :qudt/code 30,
   :qudt/coordinateCenter :qudt.type/CC_VehicleCentered,
   :qudt/id "TVCS-01",
   :qudt/literal "VC-LVC",
   :qudt/referenceFrame :qudt.type/RRF_LVC,
   :rdf/type [:qudt/VehicleCoordinateSystem
              :qudt/LocalCoordinateSystem
              :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Vehicle centered local vertical curvilinear coordinate system"})

(def VCS_VC-LVLH
  "Local Vertical Local Horizontal Coordinate System"
  {:db/ident              :qudt.type/VCS_VC-LVLH,
   :qudt/code             32,
   :qudt/coordinateCenter :qudt.type/CC_VehicleCentered,
   :qudt/id               "TVCS-02",
   :qudt/literal          "LVLH",
   :rdf/type              [:qudt/VehicleCoordinateSystem
                           :qudt/LocalCoordinateSystem
                           :owl/NamedIndividual],
   :rdfs/isDefinedBy      "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label            "Local vertical local horizontal coordinate system",
   :skos/definition       "Local Vertical Local Horizontal Coordinate System"})

(def VECTOR
  "VECTOR"
  {:db/ident            :qudt.type/VECTOR,
   :qudt/code           450,
   :qudt/dimensionality 1,
   :rdf/type            [:qudt/Vector :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "VECTOR"})

(def WordAligned
  "Alignment of a field at a word boundary, that is 2 bytes."
  {:db/ident :qudt.type/WordAligned,
   :dcterms/description
   "Alignment of a field at a word boundary, that is 2 bytes.",
   :qudt/literal "word",
   :rdf/type [:qudt/AlignmentType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Word aligned"})

(def YDT
  "Year Day Time"
  {:db/ident          :qudt.type/YDT,
   :qudt/code         215,
   :qudt/encodingDescription "TBD",
   :qudt/id           "T004-16",
   :qudt/literal      "YDT",
   :qudt/rdfsDatatype :xsd/string,
   :rdf/type          [:qudt/DateStringType :owl/NamedIndividual],
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "Year Day Time"})
