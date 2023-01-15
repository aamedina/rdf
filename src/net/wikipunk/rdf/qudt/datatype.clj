(ns net.wikipunk.rdf.qudt.datatype
  "QUDT SCHEMA - Datatypes"
  {:dcat/downloadURL "https://qudt.org/2.1/schema/datatype.ttl",
   :owl/imports ["http://www.linkedmodel.org/schema/dtype"
                 "http://www.w3.org/ns/shacl#"
                 "http://www.linkedmodel.org/schema/vaem"
                 "http://www.w3.org/2004/02/skos/core"
                 "http://qudt.org/2.1/schema/facade/qudt"],
   :rdf/ns-prefix-map {"datatype" "http://qudt.org/vocab/datatype/",
                       "dcterms" "http://purl.org/dc/elements/1.1/",
                       "dtype" "http://www.linkedmodel.org/schema/dtype#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "qudt" "http://qudt.org/schema/qudt/",
                       "qudt-refdata" "http://qudt.org/vocab/refdata/",
                       "qudt.type" "http://qudt.org/vocab/type/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sh" "http://www.w3.org/ns/shacl#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vaem" "http://www.linkedmodel.org/schema/vaem#",
                       "voag" "http://voag.linkedmodel.org/schema/voag#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://qudt.org/2.1/schema/datatype",
   :rdfa/prefix "qudt.datatype",
   :rdfa/uri "http://qudt.org/2.1/vocab/qudt/",
   :rdfs/label "QUDT SCHEMA - Datatypes",
   :vaem/hasCatalogEntry :voag/QUDT-SchemaCatalogEntry,
   :vaem/hasGraphMetadata "http://qudt.org/schema/datatype/GMD_datatype",
   :vaem/hasGraphRole :vaem/SchemaGraph,
   :vaem/intent
   "This ontology is to be used by other ontologies that need to reference type definitions.",
   :vaem/namespace "http://qudt.org/schema/dtype/",
   :vaem/namespacePrefix "qudt",
   :vaem/specificity 1,
   :vaem/url "http://qudt.org/2.0/schema/dtype"}
  (:refer-clojure :exclude [bytes type vector]))

(def AbstractDatatype
  "An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument. <p class=\"lm-para\">An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument.</p>"
  {:db/ident :qudt.datatype/AbstractDatatype,
   :dcterms/description
   ["An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument."
    "<p class=\"lm-para\">An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument.</p>"],
   :prov/wasInfluencedBy
   ["http://xlinux.nist.gov/dads/HTML/abstractDataType.html"
    "http://en.wikipedia.org/wiki/Abstract_data_type"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Abstract Datatype",
   :rdfs/subClassOf :qudt.datatype/StructuredDatatype})

(def AerospaceCoordinateSystem
  "A sub-type of 'Coordinate system'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/AerospaceCoordinateSystem,
   :dcterms/description
   "A sub-type of 'Coordinate system'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Aerospace coordinate system",
   :rdfs/subClassOf :qudt.datatype/CoordinateSystem})

(def AlgebraicDatatype
  "<p class=\"lm-para\">An \"Algebraic Datatype\" is a datatype each of whose values are data from other data types wrapped in one of the constructors of the data type. Any wrapped datum is an argument to the constructor. In contrast to other data types, the constructor is not executed and the only way to operate on the data is to unwrap the constructor using pattern matching.</p> <p class=\"lm-para\">The most common algebraic data type is a list with two constructors: Nil or [] for an empty list, and Cons (an abbreviation of constructor), ::, or : for the combination of a new element with a shorter list (for example (Cons 1 '(2 3 4)) or 1:[2,3,4]).</p> <p class=\"lm-para\">Special cases of algebraic types are product types i.e. records (only one constructor) and enumerated types (many constructors with no arguments). Algebraic types are one kind of composite type (i.e. a type formed by combining other types).</p> <p class=\"lm-para\">An algebraic data type may also be an abstract data type (ADT) if it is exported from a module without its constructors. Values of such a type can only be manipulated using functions defined in the same module as the type itself.</p>"
  {:db/ident :qudt.datatype/AlgebraicDatatype,
   :dcterms/description
   "<p class=\"lm-para\">An \"Algebraic Datatype\" is a datatype each of whose values are data from other data types wrapped in one of the constructors of the data type. Any wrapped datum is an argument to the constructor. In contrast to other data types, the constructor is not executed and the only way to operate on the data is to unwrap the constructor using pattern matching.</p>\n<p class=\"lm-para\">The most common algebraic data type is a list with two constructors: Nil or [] for an empty list, and Cons (an abbreviation of constructor), ::, or : for the combination of a new element with a shorter list (for example (Cons 1 '(2 3 4)) or 1:[2,3,4]).</p>\n<p class=\"lm-para\">Special cases of algebraic types are product types i.e. records (only one constructor) and enumerated types (many constructors with no arguments). Algebraic types are one kind of composite type (i.e. a type formed by combining other types).</p>\n<p class=\"lm-para\">An algebraic data type may also be an abstract data type (ADT) if it is exported from a module without its constructors. Values of such a type can only be manipulated using functions defined in the same module as the type itself.</p>",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Algebraic_data_type",
   :rdf/type :owl/Class,
   :rdfs/comment
   "<p>An \"Algebraic Datatype\" is a datatype each of whose values are data from other data types wrapped in one of the constructors of the data type. Any wrapped datum is an argument to the constructor. In contrast to other data types, the constructor is not executed and the only way to operate on the data is to unwrap the constructor using pattern matching.</p>\n\n<p>The most common algebraic data type is a list with two constructors: Nil or [] for an empty list, and Cons (an abbreviation of constructor), ::, or : for the combination of a new element with a shorter list (for example (Cons 1 '(2 3 4)) or 1:[2,3,4]).</p>\n\n<p>Special cases of algebraic types are product types i.e. records (only one constructor) and enumerated types (many constructors with no arguments). Algebraic types are one kind of composite type (i.e. a type formed by combining other types).</p>\n\n<p>An algebraic data type may also be an abstract data type (ADT) if it is exported from a module without its constructors. Values of such a type can only be manipulated using functions defined in the same module as the type itself.</p>",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Algebraic Datatype",
   :rdfs/seeAlso :qudt.datatype/AbstractDatatype,
   :rdfs/subClassOf :qudt.datatype/StructuredDatatype})

(def AlignmentType
  "Specifies how a physical data field is aligned. The alignment could be at a bit, byte or word boundary."
  {:db/ident :qudt.datatype/AlignmentType,
   :dcterms/description
   "Specifies how a physical data field is aligned. The alignment could be at a bit, byte or word boundary.",
   :owl/oneOf
   [:qudt.type/BitAligned :qudt.type/ByteAligned :qudt.type/WordAligned],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Alignment type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def Array
  "An array is represented as ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'. Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements. If it is not given then the elements can be of different types for each position in the array. The property 'type:typeMatrix' must refer to a matrix of types. If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type."
  {:db/ident :qudt.datatype/Array,
   :dcterms/description
   "An array is represented as ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'. Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements.  If it is not given then the elements can be of different types for each position in the array. The property 'type:typeMatrix' must refer to a matrix of types.  If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Array Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt.datatype/DimensionVector,
                      :owl/onProperty    :qudt.datatype/dimensionVector,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/typeMatrix,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/dataOrder,
                      :rdf/type           :owl/Restriction}
                     :qudt.datatype/CompositeDatatype
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/dimensionality,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/type#TypeMatrix",
                      :owl/onProperty :qudt.datatype/typeMatrix,
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/ArrayDataOrderType,
                      :owl/onProperty    :qudt.datatype/dataOrder,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/byRow,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/dimensionVector,
                      :rdf/type           :owl/Restriction}]})

(def ArrayDataOrderType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/ArrayDataOrderType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :owl/oneOf [:qudt.datatype/ByColumn :qudt.datatype/ByRow :qudt.datatype/ByLeftMostIndex],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Array data order type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def ArrayIndex
  "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes."
  {:db/ident :qudt.datatype/ArrayIndex,
   :dcterms/description
   "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Array Index Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/UNSIGNED-INTEGER,
                      :owl/onProperty :qudt.datatype/elementType,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/Vector]})

(def ArrayIndex-elementType
  {:db/ident    :qudt.datatype/ArrayIndex-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/nonNegativeInteger,
   :sh/hasValue :qudt.datatype/UNSIGNED-INTEGER,
   :sh/path     :qudt.datatype/elementType})

(def ArrayIndexType
  "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes."
  {:db/ident :qudt.datatype/ArrayIndexType,
   :dcterms/description
   "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Array Index Type",
   :rdfs/subClassOf :qudt.datatype/VectorType,
   :sh/property :qudt.datatype/ArrayIndex-elementType})

(def ArrayType
  "<p>An <em>array type</em> is a type specification for ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'.</p> <p>Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements. If it is not given then the elements can be of different types for each position in the array.</p> <p>The property <em>qudt:typeMatrix</em> must refer to a matrix of types. If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type.</p>"
  {:db/ident :qudt.datatype/ArrayType,
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/comment
   "<p>An <em>array type</em> is a type specification for ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'.</p>\n\n<p>Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements.  If it is not given then the elements can be of different types for each position in the array.</p>\n\n<p>The property <em>qudt:typeMatrix</em> must refer to a matrix of types.  If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type.</p>",
   :rdfs/label "Array Type",
   :rdfs/subClassOf :qudt.datatype/CompositeDatatype,
   :sh/property [:qudt.datatype/ArrayType-dimensionVector
                 :qudt.datatype/ArrayType-dimensionality
                 :qudt.datatype/ArrayType-dataOrder
                 :qudt.datatype/ArrayType-byRow
                 :qudt.datatype/ArrayType-typeMatrix]})

(def ArrayType-byRow
  {:db/ident    :qudt.datatype/ArrayType-byRow,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/byRow})

(def ArrayType-dataOrder
  {:db/ident    :qudt.datatype/ArrayType-dataOrder,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/ArrayDataOrderType,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/dataOrder})

(def ArrayType-dimensionVector
  {:db/ident    :qudt.datatype/ArrayType-dimensionVector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/DimensionVector,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/dimensionVector})

(def ArrayType-dimensionality
  {:db/ident    :qudt.datatype/ArrayType-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/dimensionality})

(def ArrayType-typeMatrix
  {:db/ident    :qudt.datatype/ArrayType-typeMatrix,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/typeMatrix,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/typeMatrix})

(def Article
  "Pub article type"
  {:db/ident      :qudt.datatype/Article,
   :dtype/literal "article",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub article type"})

(def AssociativeArray
  "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident         :qudt.datatype/AssociativeArray,
   :dcterms/description
   "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt.datatype/Map,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Associative Array",
   :rdfs/subClassOf  :qudt.datatype/Collection})

(def AssociativeArrayType
  "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident        :qudt.datatype/AssociativeArrayType,
   :dcterms/description
   "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt.datatype/MapType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Associative Array Type",
   :rdfs/subClassOf :qudt.datatype/CollectionType})

(def AuralCue
  "An aural cue is a sound produced by a device or a system that is used to alert personnel of of an advisory, cautionary, warning, or emergency state."
  {:db/ident :qudt.datatype/AuralCue,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An aural cue is a sound produced by a device or a system that is used to alert personnel of of an advisory, cautionary, warning, or emergency state.",
   :rdfs/label "Aural Cue",
   :rdfs/subClassOf :qudt.datatype/ModalCue,
   :sh/property :qudt.datatype/AuralCue-sound})

(def AuralCue-sound
  {:db/ident    :qudt.datatype/AuralCue-sound,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/anyURI,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/sound})

(def AuralCueEnumeration-defaultValue
  {:db/ident :qudt.datatype/AuralCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/AuralCue,
   :sh/path  :qudt.datatype/defaultValue})

(def AxialOrientationType
  "The axial orientation of a coordinate system frame axis."
  {:db/ident :qudt.datatype/AxialOrientationType,
   :dcterms/description
   "The axial orientation of a coordinate system frame axis.",
   :owl/oneOf [:qudt.type/PositiveZ
               :qudt.type/PositiveY
               :qudt.type/NegativeY
               :qudt.type/NegativeZ
               :qudt.type/PositiveX
               :qudt.type/NegativeX],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Axial Orientation Type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def BOOLEAN
  "In computer science, the Boolean or logical data type is a data type, having two values (usually denoted true and false), intended to represent the truth values of logic and Boolean algebra. The Boolean data type is the primary result of conditional statements, which allow different actions and change control flow depending on whether a programmer-specified boolean condition evaluates to true or false."
  {:db/ident :qudt.datatype/BOOLEAN,
   :dcterms/description
   "In computer science, the Boolean or logical data type is a data type, having two values (usually denoted true and false), intended to represent the truth values of logic and Boolean algebra. The Boolean data type is the primary result of conditional statements, which allow different actions and change control flow depending on whether a programmer-specified boolean condition evaluates to true or false.",
   :dtype/literal "boolean",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"
    "http://en.wikipedia.org/wiki/Boolean%5Fdata%5Ftype"],
   :qudt.datatype/ansiSQLName "BOOLEAN",
   :qudt.datatype/encoding :qudt.datatype/BooleanEncoding,
   :qudt.datatype/javaName "boolean",
   :qudt.datatype/jsName "Boolean()",
   :qudt.datatype/microsoftSQLServerName "bit",
   :qudt.datatype/mySQLName ["BOOLEAN" "TINYINT(1)" "BOOL"],
   :qudt.datatype/odbcName "SQL_BIT",
   :qudt.datatype/oleDBName "DBTYPE_BOOL",
   :qudt.datatype/oracleSQLName "RAW(1)",
   :qudt.datatype/protocolBuffersName "bool",
   :qudt.datatype/pythonName "bool",
   :qudt.datatype/rdfsDatatype :xsd/boolean,
   :rdf/type :qudt.datatype/BooleanType,
   :rdfs/label "BOOLEAN"})

(def BYTE
  "The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation."
  {:db/ident :qudt.datatype/BYTE,
   :dcterms/description
   "The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.",
   :dtype/literal "byte",
   :prov/wasInfluencedBy
   "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html",
   :qudt.datatype/abbreviation "SI8",
   :qudt.datatype/cName "Byte",
   :qudt.datatype/encoding :qudt.datatype/OctetEncoding,
   :qudt.datatype/maxInclusive 127,
   :qudt.datatype/minInclusive -128,
   :qudt.datatype/octets 1,
   :qudt.datatype/rdfsDatatype :xsd/byte,
   :qudt.datatype/signedness :qudt.datatype/SIGNED,
   :rdf/type :qudt.datatype/SignedShortIntegerType,
   :rdfs/label "Byte"})

(def BalancedTree
  "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced."
  {:db/ident :qudt.datatype/BalancedTree,
   :dcterms/description
   "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Balanced Tree Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/maxDepth,
                      :rdf/type           :owl/Restriction}
                     :qudt.datatype/Tree]})

(def BalancedTree-maxDepth
  {:db/ident    :qudt.datatype/BalancedTree-maxDepth,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/maxDepth})

(def BalancedTreeType
  "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced."
  {:db/ident :qudt.datatype/BalancedTreeType,
   :dcterms/description
   "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Balanced Tree Type",
   :rdfs/subClassOf :qudt.datatype/TreeType,
   :sh/property :qudt.datatype/BalancedTree-maxDepth})

(def BigEndian
  "Big Endian"
  {:db/ident      :qudt.datatype/BigEndian,
   :dtype/literal "big",
   :rdf/type      :qudt.datatype/EndianType,
   :rdfs/label    "Big Endian"})

(def BigIntegerType
  "A Big Integer is an integer that can be represented in eight octets (64 bits) of machine memory. Big integers may be signed or unsigned."
  {:db/ident :qudt.datatype/BigIntegerType,
   :dcterms/description
   "A Big Integer is an integer that can be represented in eight octets (64 bits) of machine memory. Big integers may be signed or unsigned.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Big Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   8,
                      :owl/onProperty :qudt.datatype/octets,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   64,
                      :owl/onProperty :qudt.datatype/bits,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/IntegerDatatype],
   :sh/property :qudt.datatype/BigIntegerType-octets})

(def BigIntegerType-octets
  {:db/ident    :qudt.datatype/BigIntegerType-octets,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue 8,
   :sh/or       :qudt.datatype/IntegerUnionList,
   :sh/path     :qudt.datatype/octets})

(def BinaryTree
  "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children."
  {:db/ident :qudt.datatype/BinaryTree,
   :dcterms/description
   "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children. ",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Binary Tree Type",
   :rdfs/subClassOf :qudt.datatype/Tree})

(def BinaryTreeType
  "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children."
  {:db/ident :qudt.datatype/BinaryTreeType,
   :dcterms/description
   "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children. ",
   :rdf/type :owl/Class,
   :rdfs/label "Binary Tree Type",
   :rdfs/subClassOf :qudt.datatype/TreeType})

(def BitAligned
  "Bit Aligned"
  {:db/ident      :qudt.datatype/BitAligned,
   :dtype/literal "bit",
   :rdf/type      :qudt.datatype/AlignmentType,
   :rdfs/label    "Bit Aligned"})

(def BitEncodingType
  "A bit encoding is a correspondence between the two possible values of a bit, 0 or 1, and some interpretation. For example, in a boolean encoding, a bit denotes a truth value, where 0 corresponds to False and 1 corresponds to True."
  {:db/ident :qudt.datatype/BitEncodingType,
   :dcterms/description
   "A bit encoding is a correspondence between the two possible values of a bit, 0 or 1, and some interpretation. For example, in a boolean encoding, a bit denotes a truth value, where 0 corresponds to False and 1 corresponds to True.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Bit Encoding",
   :rdfs/subClassOf :qudt.datatype/Encoding})

(def BitField
  "bitfield"
  {:db/ident         :qudt.datatype/BitField,
   :rdf/type         [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "bitfield",
   :rdfs/subClassOf  :xsd/string})

(def BitField01
  "Bit Field of 1 bit"
  {:db/ident             :qudt.datatype/BitField01,
   :dtype/literal        "B1",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 1}
                                                 {:xsd/pattern "[0-1]"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt.datatype/abbreviation    "bf1",
   :qudt.datatype/bits            1,
   :qudt.datatype/mySQLName       "BIT(1)",
   :rdf/type             [:qudt.datatype/BitFieldType :rdfs/Datatype],
   :rdfs/label           "Bit Field of 1 bit",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField02
  "Bit Field of 2 bits"
  {:db/ident             :qudt.datatype/BitField02,
   :dtype/literal        "B2",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 2}
                                                 {:xsd/pattern "[0-1]{2}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt.datatype/abbreviation    "bf2",
   :qudt.datatype/bits            2,
   :qudt.datatype/mySQLName       "BIT(2)",
   :rdf/type             [:qudt.datatype/BitFieldType :rdfs/Datatype],
   :rdfs/label           "Bit Field of 2 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField03
  "Bit Field of 3 bits"
  {:db/ident             :qudt.datatype/BitField03,
   :dtype/literal        "B3",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 3}
                                                 {:xsd/pattern "[0-1]{3}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt.datatype/abbreviation    "bf3",
   :qudt.datatype/bits            3,
   :qudt.datatype/mySQLName       "BIT(3)",
   :rdf/type             [:rdfs/Datatype :qudt.datatype/BitFieldType],
   :rdfs/label           "Bit Field of 3 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField04
  "Bit Field of 4 bits"
  {:db/ident             :qudt.datatype/BitField04,
   :dtype/literal        "B4",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 4}
                                                 {:xsd/pattern "[0-1]{4}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt.datatype/abbreviation    "bf4",
   :qudt.datatype/bits            4,
   :qudt.datatype/mySQLName       "BIT(4)",
   :rdf/type             [:rdfs/Datatype :qudt.datatype/BitFieldType],
   :rdfs/label           "Bit Field of 4 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField05
  "Bit Field of 5 bits"
  {:db/ident             :qudt.datatype/BitField05,
   :dtype/literal        "B5",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 5}
                                                 {:xsd/pattern "[0-1]{5}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt.datatype/abbreviation    "bf5",
   :qudt.datatype/bits            5,
   :qudt.datatype/mySQLName       "BIT(5)",
   :rdf/type             [:rdfs/Datatype :qudt.datatype/BitFieldType],
   :rdfs/label           "Bit Field of 5 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField06
  "Bit Field of 6 bits"
  {:db/ident             :qudt.datatype/BitField06,
   :dtype/literal        "B6",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 6}
                                                 {:xsd/pattern "[0-1]{6}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt.datatype/abbreviation    "bf6",
   :qudt.datatype/bits            6,
   :qudt.datatype/mySQLName       "BIT(6)",
   :qudt.datatype/rdfsDatatype    :qudt.datatype/BitField06,
   :rdf/type             [:rdfs/Datatype :qudt.datatype/BitFieldType],
   :rdfs/label           "Bit Field of 6 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField07
  "Bit Field of 7 bits"
  {:db/ident             :qudt.datatype/BitField07,
   :dtype/literal        "B7",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 7}
                                                 {:xsd/pattern "[0-1]{7}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt.datatype/abbreviation    "bf7",
   :qudt.datatype/bits            7,
   :qudt.datatype/mySQLName       "BIT(7)",
   :qudt.datatype/rdfsDatatype    :qudt.datatype/BitField07,
   :rdf/type             [:rdfs/Datatype :qudt.datatype/BitFieldType],
   :rdfs/label           "Bit Field of 7 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField08
  "Bit Field of 8 bits"
  {:db/ident             :qudt.datatype/BitField08,
   :dtype/literal        "B8",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 8}
                                                 {:xsd/pattern "[0-1]{8}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt.datatype/abbreviation    "bf8",
   :qudt.datatype/bits            8,
   :qudt.datatype/mySQLName       "BIT(8)",
   :qudt.datatype/rdfsDatatype    :qudt.datatype/BitField08,
   :rdf/type             [:qudt.datatype/BitFieldType :rdfs/Datatype],
   :rdfs/label           "Bit Field of 8 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField09
  "Bit Field of 9 bits"
  {:db/ident             :qudt.datatype/BitField09,
   :dtype/literal        "B9",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 9}
                                                 {:xsd/pattern "[0-1]{9}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt.datatype/abbreviation    "bf9",
   :qudt.datatype/bits            9,
   :qudt.datatype/mySQLName       "BIT(9)",
   :qudt.datatype/rdfsDatatype    :qudt.datatype/BitField09,
   :rdf/type             [:rdfs/Datatype :qudt.datatype/BitFieldType],
   :rdfs/label           "Bit Field of 9 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField10
  "Bit Field Of 10 Bits"
  {:db/ident             :qudt.datatype/BitField10,
   :dtype/literal        "B10",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 10}
                                                 {:xsd/pattern "[0-1]{10}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt.datatype/abbreviation    "bf10",
   :qudt.datatype/bitOrder        :qudt.datatype/BigEndian,
   :qudt.datatype/bits            10,
   :qudt.datatype/byteOrder       :qudt.datatype/BigEndian,
   :qudt.datatype/mySQLName       "BIT(10)",
   :qudt.datatype/rdfsDatatype    :qudt.datatype/BitField10,
   :rdf/type             [:owl/DataRange :rdfs/Datatype :qudt.datatype/BitFieldType],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/schema/datatype",
   :rdfs/label           "Bit Field Of 10 Bits",
   :rdfs/subClassOf      [:rdfs/Literal :qudt.datatype/BitField]})

(def BitField11
  "Bit Field Of 11 Bits"
  {:db/ident             :qudt.datatype/BitField11,
   :dtype/literal        "B11",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 11}
                                                 {:xsd/pattern "[0-1]{11}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt.datatype/abbreviation    "bf11",
   :qudt.datatype/bits            11,
   :qudt.datatype/mySQLName       "BIT(11)",
   :rdf/type             [:rdfs/Datatype :qudt.datatype/BitFieldType :owl/DataRange],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/schema/datatype",
   :rdfs/label           "Bit Field Of 11 Bits",
   :rdfs/subClassOf      [:qudt.datatype/BitField :rdfs/Literal]})

(def BitField12
  "Bit Field of 12 bits"
  {:db/ident            :qudt.datatype/BitField12,
   :dtype/literal       "B12",
   :owl/equivalentClass {:owl/onDatatype :xsd/string,
                         :owl/withRestrictions [{:xsd/length 12}
                                                {:xsd/pattern "[0-1]{12}"}],
                         :rdf/type       :rdfs/Datatype},
   :qudt.datatype/abbreviation   "bf12",
   :qudt.datatype/bits           12,
   :qudt.datatype/mySQLName      "BIT(12)",
   :qudt.datatype/rdfsDatatype   :qudt.datatype/BitField12,
   :rdf/type            [:owl/DataRange :qudt.datatype/BitFieldType :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Bit Field of 12 bits",
   :rdfs/subClassOf     [:rdfs/Literal :qudt.datatype/BitField]})

(def BitFieldType
  "A bit field is a common idiom used in computer programming to store a set of Boolean datatype flags compactly, as a series of bits. The bit field is stored in an integral type of known, fixed bit-width. Each Boolean flag is stored in a separate bit. Usually the source code will define a set of constants, each a power of two, that semantically associate each individual bit with its respective Boolean flag. The bitwise operators and, or, and not are used in combination to set, reset and test the flags."
  {:db/ident :qudt.datatype/BitFieldType,
   :dcterms/description
   "A bit field is a common idiom used in computer programming to store a set of Boolean datatype flags compactly, as a series of bits. The bit field is stored in an integral type of known, fixed bit-width. Each Boolean flag is stored in a separate bit. Usually the source code will define a set of constants, each a power of two, that semantically associate each individual bit with its respective Boolean flag. The bitwise operators and, or, and not are used in combination to set, reset and test the flags.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Bit Field Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/encodedValue,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/BitField,
                      :owl/onProperty    :qudt.datatype/encodedValue,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/ScalarDatatype],
   :sh/property :qudt.datatype/BitFieldType-encodedValue})

(def BitFieldType-encodedValue
  {:db/ident    :qudt.datatype/BitFieldType-encodedValue,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/BitField,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/encodedValue})

(def Book
  "Pub book type"
  {:db/ident      :qudt.datatype/Book,
   :dtype/literal "book",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub book type"})

(def Booklet
  "Pub booklet type"
  {:db/ident      :qudt.datatype/Booklet,
   :dtype/literal "booklet",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub booklet type"})

(def BooleanEncoding
  "Boolean Encoding"
  {:db/ident   :qudt.datatype/BooleanEncoding,
   :rdf/type   :qudt.datatype/BooleanEncodingType,
   :rdfs/label "Boolean Encoding"})

(def BooleanEncodingType
  "Boolean encoding type"
  {:db/ident         :qudt.datatype/BooleanEncodingType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Boolean encoding type",
   :rdfs/subClassOf  :qudt.datatype/Encoding})

(def BooleanType
  "A boolean data type can take on only two values."
  {:db/ident            :qudt.datatype/BooleanType,
   :dcterms/description "A boolean data type can take on only two values.",
   :rdf/type            [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Boolean Type",
   :rdfs/subClassOf     [{:owl/allValuesFrom :qudt.datatype/BooleanEncodingType,
                          :owl/onProperty    :qudt.datatype/encoding,
                          :rdf/type          :owl/Restriction}
                         :qudt.datatype/OrdinalType],
   :sh/property         :qudt.datatype/BooleanType-encoding})

(def BooleanType-encoding
  {:db/ident :qudt.datatype/BooleanType-encoding,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/BooleanEncodingType,
   :sh/path  :qudt.datatype/encoding})

(def BooleanTypeEnumeratedValue
  "Specifies how a boolean value is expressed"
  {:db/ident            :qudt.datatype/BooleanTypeEnumeratedValue,
   :dcterms/description "Specifies how a boolean value is expressed",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "boolean value",
   :rdfs/subClassOf     :qudt.datatype/EnumeratedValue})

(def ByColumn
  "By Column"
  {:db/ident         :qudt.datatype/ByColumn,
   :dtype/literal    "byColumn",
   :rdf/type         :qudt.datatype/ArrayDataOrderType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "By Column"})

(def ByLeftMostIndex
  "By Left Most Index"
  {:db/ident         :qudt.datatype/ByLeftMostIndex,
   :dtype/literal    "byLeftMostIndex",
   :rdf/type         :qudt.datatype/ArrayDataOrderType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "By Left Most Index"})

(def ByRow
  "By Row"
  {:db/ident         :qudt.datatype/ByRow,
   :dtype/literal    "byRow",
   :rdf/type         :qudt.datatype/ArrayDataOrderType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "By Row"})

(def ByteAligned
  "Byte Aligned"
  {:db/ident      :qudt.datatype/ByteAligned,
   :dtype/literal "byte",
   :rdf/type      :qudt.datatype/AlignmentType,
   :rdfs/label    "Byte Aligned"})

(def ByteEncodingType
  "This class contains the various ways that information may be encoded into bytes."
  {:db/ident :qudt.datatype/ByteEncodingType,
   :dcterms/description
   "This class contains the various ways that information may be encoded into bytes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Byte Encoding",
   :rdfs/subClassOf :qudt.datatype/Encoding})

(def CCT_EarthCentered
  "Earth-centered Coordinate System Type"
  {:db/ident   :qudt.datatype/CCT_EarthCentered,
   :rdf/type   :qudt.datatype/CoordinateCenterType,
   :rdfs/label "Earth-centered Coordinate System Type"})

(def CCT_MarsCentered
  "Mars-centered Coordinate System Type"
  {:db/ident   :qudt.datatype/CCT_MarsCentered,
   :rdf/type   :qudt.datatype/CoordinateCenterType,
   :rdfs/label "Mars-centered Coordinate System Type"})

(def CCT_MoonCentered
  "Moon-centered Coordinate System Type"
  {:db/ident   :qudt.datatype/CCT_MoonCentered,
   :rdf/type   :qudt.datatype/CoordinateCenterType,
   :rdfs/label "Moon-centered Coordinate System Type"})

(def CCT_SunCentered
  "Sun-centered Coordinate System Type"
  {:db/ident   :qudt.datatype/CCT_SunCentered,
   :rdf/type   :qudt.datatype/CoordinateCenterType,
   :rdfs/label "Sun-centered Coordinate System Type"})

(def CCT_VehicleCentered
  "Vehicle-centered Coordinate System Type"
  {:db/ident   :qudt.datatype/CCT_VehicleCentered,
   :rdf/type   :qudt.datatype/CoordinateCenterType,
   :rdfs/label "Vehicle-centered Coordinate System Type"})

(def CFN_ConcatenateMatrixRows
  "Concatenate matrix rows"
  {:db/ident   :qudt.datatype/CFN_ConcatenateMatrixRows,
   :rdf/type   :qudt.datatype/CompositionFunction,
   :rdfs/label "Concatenate matrix rows"})

(def COLOR_AMBER
  "Amber Color"
  {:db/ident     :qudt.datatype/COLOR_AMBER,
   :qudt.datatype/literal "amber",
   :qudt.datatype/rgbCode "#FFBF00",
   :rdf/type     :qudt.datatype/ColorCue,
   :rdfs/label   "Amber Color"})

(def COLOR_GREEN
  "Green color"
  {:db/ident     :qudt.datatype/COLOR_GREEN,
   :qudt.datatype/literal "green",
   :qudt.datatype/rgbCode "#008000",
   :rdf/type     :qudt.datatype/ColorCue,
   :rdfs/label   "Green color"})

(def COLOR_ORANGE
  "Orange color"
  {:db/ident     :qudt.datatype/COLOR_ORANGE,
   :qudt.datatype/literal "orange",
   :qudt.datatype/rgbCode "#FFA500",
   :rdf/type     :qudt.datatype/ColorCue,
   :rdfs/label   "Orange color"})

(def COLOR_RED
  "Red color"
  {:db/ident     :qudt.datatype/COLOR_RED,
   :qudt.datatype/literal "red",
   :qudt.datatype/rgbCode "#FF0000",
   :rdf/type     :qudt.datatype/ColorCue,
   :rdfs/label   "Red color"})

(def COLOR_YELLOW
  "Yellow color"
  {:db/ident     :qudt.datatype/COLOR_YELLOW,
   :qudt.datatype/literal "yellow",
   :qudt.datatype/rgbCode "#FFFF00",
   :rdf/type     :qudt.datatype/ColorCue,
   :rdfs/label   "Yellow color"})

(def CRC32
  "CRC-32"
  {:db/ident            :qudt.datatype/CRC32,
   :owl/equivalentClass {:owl/onDatatype :xsd/integer,
                         :owl/withRestrictions [{:xsd/minInclusive 0}
                                                {:xsd/maxInclusive 4294967295}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "CRC-32",
   :rdfs/subClassOf     :xsd/integer})

(def CardinalityType
  "<p class=\"lm-para\">In mathematics, the cardinality of a set is a measure of the number of elements of the set. For example, the set \\(A = {2, 4, 6}\\) contains 3 elements, and therefore \\(A\\) has a cardinality of 3. There are two approaches to cardinality – one which compares sets directly using bijections and injections, and another which uses cardinal numbers.</p>"
  {:db/ident :qudt.datatype/CardinalityType,
   :dcterms/description
   "<p class=\"lm-para\">In mathematics, the cardinality of a set is a measure of the number of elements of the set.  For example, the set \\(A = {2, 4, 6}\\) contains 3 elements, and therefore \\(A\\) has a cardinality of 3. There are two approaches to cardinality – one which compares sets directly using bijections and injections, and another which uses cardinal numbers.</p>",
   :owl/oneOf [:qudt.datatype/CT_COUNTABLY-INFINITE :qudt.datatype/CT_FINITE],
   :prov/wasInfluencedBy ["http://en.wikipedia.org/wiki/Cardinality"
                          "http://en.wikipedia.org/wiki/Cardinal_number"],
   :rdf/type :owl/Class,
   :rdfs/label "Cardinality Type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def CartesianCoordinates
  "A set of variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates."
  {:db/ident :qudt.datatype/CartesianCoordinates,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Cartesian Coordinate Type",
   :rdfs/subClassOf :qudt.datatype/Coordinates})

(def CartesianCoordinatesType
  "A set of variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates."
  {:db/ident :qudt.datatype/CartesianCoordinatesType,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates.",
   :rdf/type :owl/Class,
   :rdfs/label "Cartesian Coordinate Type",
   :rdfs/subClassOf :qudt.datatype/CompositeDatatype})

(def CharEncoding
  "7 bits of 1 octet"
  {:db/ident            :qudt.datatype/CharEncoding,
   :dcterms/description "7 bits of 1 octet",
   :qudt.datatype/bytes          1,
   :rdf/type            [:qudt.datatype/CharEncodingType :qudt.datatype/BooleanEncodingType],
   :rdfs/label          "Char Encoding"})

(def CharEncodingType
  "The class of all character encoding schemes, each of which defines a rule or algorithm for encoding character data as a sequence of bits or bytes."
  {:db/ident :qudt.datatype/CharEncodingType,
   :dcterms/description
   "The class of all character encoding schemes, each of which defines a rule or algorithm for encoding character data as a sequence of bits or bytes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Char Encoding Type",
   :rdfs/subClassOf :qudt.datatype/Encoding})

(def CharacterType
  "A Character Type is a data type that defines the type and encoding of single characters."
  {:db/ident :qudt.datatype/CharacterType,
   :dcterms/description
   "A Character Type is a data type that defines the type and encoding of single characters.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Character Type",
   :rdfs/subClassOf :qudt.datatype/OrdinalType})

(def Collection
  "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type."
  {:db/ident :qudt.datatype/Collection,
   :dcterms/description
   "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Collection Type",
   :rdfs/subClassOf :qudt.datatype/AbstractDatatype})

(def CollectionType
  "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type."
  {:db/ident :qudt.datatype/CollectionType,
   :dcterms/description
   "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type.",
   :rdf/type :owl/Class,
   :rdfs/label "Collection Type",
   :rdfs/subClassOf :qudt.datatype/AbstractDatatype})

(def ColorCue
  "A visual cue that uses color to distinguish it from other cues. Each color cue has exactly one corresponding coordinate point in the RGB space."
  {:db/ident :qudt.datatype/ColorCue,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A visual cue that uses color to distinguish it from other cues. Each color cue has exactly one corresponding coordinate point in the RGB space.",
   :rdfs/label "Color Cue",
   :rdfs/subClassOf :qudt.datatype/VisualCue,
   :sh/property :qudt.datatype/ColorCue-rgbCode})

(def ColorCue-rgbCode
  {:db/ident    :qudt.datatype/ColorCue-rgbCode,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/rgbCode})

(def CompositeDataStructure
  "'Composite Data Structure', also referred to as 'Data Record' is a datatype that aggregates element of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels."
  {:db/ident :qudt.datatype/CompositeDataStructure,
   :prov/wasInfluencedBy
   ["https://en.wikipedia.org/wiki/Record_(computer_science)"
    "https://en.wikipedia.org/wiki/List_of_data_structures"],
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "'Composite Data Structure', also referred to as 'Data Record' is a datatype that aggregates element of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels.",
   :rdfs/label "Composite Data Structure",
   :rdfs/subClassOf :qudt.datatype/CompositeDatatype,
   :sh/property :qudt.datatype/CompositeDataStructure-dataElement})

(def CompositeDataStructure-dataElement
  {:db/ident :qudt.datatype/CompositeDataStructure-dataElement,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/DataSetElement,
   :sh/path  :qudt.datatype/field})

(def CompositeDatatype
  "Composite types are datatypes which can be constructed in a programming language out of that language's basic primitive types and other composite types. The act of constructing a composite type is known as composition."
  {:db/ident :qudt.datatype/CompositeDatatype,
   :dcterms/description
   "Composite types are datatypes which can be constructed in a programming language out of that language's basic primitive types and other composite types. The act of constructing a composite type is known as composition.",
   :prov/wasInfluencedBy
   "https://en.wikipedia.org/wiki/List_of_data_structures",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Composite Data Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt.datatype/AlignmentType,
                      :owl/onProperty    :qudt.datatype/alignment,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/TypeList,
                      :owl/onProperty    :qudt.datatype/elementTypeList,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/PaddingType,
                      :owl/onProperty    :qudt.datatype/padding,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/padding,
                      :rdf/type           :owl/Restriction}
                     :qudt.datatype/StructuredDatatype],
   :sh/property [:qudt.datatype/CompositeDatatype-alignment
                 :qudt.datatype/CompositeDatatype-padding
                 :qudt.datatype/CompositeDatatype-elementType]})

(def CompositeDatatype-alignment
  {:db/ident :qudt.datatype/CompositeDatatype-alignment,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/AlignmentType,
   :sh/path  :qudt.datatype/alignment})

(def CompositeDatatype-elementType
  {:db/ident :qudt.datatype/CompositeDatatype-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/Datatype,
   :sh/path  :qudt.datatype/elementType})

(def CompositeDatatype-padding
  {:db/ident    :qudt.datatype/CompositeDatatype-padding,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/PaddingType,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/padding})

(def CompositeTable
  "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/CompositeTable,
   :dcterms/description
   "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Composite Table Type",
   :rdfs/subClassOf :qudt.datatype/Table})

(def CompositionFunction
  "Composition function"
  {:db/ident        :qudt.datatype/CompositionFunction,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Composition function",
   :rdfs/subClassOf :qudt.datatype/Function})

(def CompositionTreeType
  {:db/ident        :qudt.datatype/CompositionTreeType,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/subClassOf :qudt.datatype/TreeType,
   :sh/property     :qudt.datatype/CompositionTreeType-compositionFunction})

(def CompositionTreeType-compositionFunction
  {:db/ident    :qudt.datatype/CompositionTreeType-compositionFunction,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/CompositionFunction,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/function})

(def Concept
  "QUDT Concept"
  {:db/ident        :qudt.datatype/Concept,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "QUDT Concept",
   :rdfs/subClassOf :owl/Thing})

(def Conference
  "Pub techreport type"
  {:db/ident      :qudt.datatype/Conference,
   :dtype/literal "conference",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub techreport type"})

(def Container
  "A container is a class, a data structure, or an abstract data type (ADT) whose instances are collections of other objects. They are used to store objects in an organized way following specific access rules."
  {:db/ident :qudt.datatype/Container,
   :dcterms/description
   "A container is a class, a data structure, or an abstract data type (ADT) whose instances are collections of other objects. They are used to store objects in an organized way following specific access rules.",
   :owl/equivalentClass [:qudt.datatype/Collection :qudt.datatype/CollectionType],
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Container",
   :rdfs/subClassOf [{:owl/hasValue   1,
                      :owl/onProperty :qudt.datatype/elementTypeCount,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/AbstractDatatype],
   :sh/property :qudt.datatype/Container-elementTypeCount})

(def Container-elementTypeCount
  {:db/ident    :qudt.datatype/Container-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 1,
   :sh/path     :qudt.datatype/elementTypeCount})

(def CoordinateCenterType
  "An enumeration of coordinate centers for coordinate systems, such as \"Earth centered\", \"Mars centered\", \"Moon centered\", \"Sun centered\", and \"Vehicle centered\"."
  {:db/ident :qudt.datatype/CoordinateCenterType,
   :dcterms/description
   "An enumeration of coordinate centers for coordinate systems, such as \"Earth centered\", \"Mars centered\", \"Moon centered\", \"Sun centered\",  and \"Vehicle centered\".",
   :owl/oneOf [:qudt.type/CC_MarsCentered
               :qudt.type/CC_EarthCentered
               :qudt.type/CC_MoonCentered
               :qudt.type/CC_VehicleCentered
               :qudt.type/CC_SunCentered],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinate Center Type",
   :rdfs/subClassOf [:qudt.datatype/NominalScale :qudt.datatype/EnumeratedValue],
   :skos/prefLabel ["Coordinate center" "Coordinate center type"]})

(def CoordinateMember
  "A Coordinate Member Type is a data type that defines the properties of a coordinate in a coordinate system."
  {:db/ident :qudt.datatype/CoordinateMember,
   :dcterms/description
   "A Coordinate Member Type is a data type that defines the properties of a coordinate in a coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinate Member Type",
   :rdfs/subClassOf [:qudt.datatype/TupleMemberType :qudt.datatype/TupleMember]})

(def CoordinateSystem
  "In geometry, a coordinate system is a system which uses one or more numbers, or coordinates, to uniquely determine the position of a point or other geometric element on a manifold such as Euclidean space. The order of the coordinates is significant and they are sometimes identified by their position in an ordered tuple and sometimes by a letter, as in 'the x-coordinate'. In elementary mathematics the coordinates are taken to be real numbers, but may be complex numbers or elements of a more abstract system such as a commutative ring. The use of a coordinate system allows problems in geometry to be translated into problems about numbers and vice versa; this is the basis of analytic geometry. In astronomy, a celestial coordinate system is a system for specifying positions of celestial objects: satellites, planets, stars, galaxies, and so on. Coordinate systems can specify a position in 3-dimensional space, or merely the direction of the object on the celestial sphere, if its distance is not known or not important. The coordinate systems are implemented in either spherical coordinates or rectangular coordinates. Spherical coordinates, projected on the celestial sphere, are analogous to the geographic coordinate system used on the surface of the Earth. These differ in their choice of fundamental plane, which divides the celestial sphere into two equal hemispheres along a great circle. Rectangular coordinates, in appropriate units, are simply the cartesian equivalent of the spherical coordinates, with the same fundamental (x,y) plane and primary (x-axis) direction. Each coordinate system is named for its choice of fundamental plane."
  {:db/ident :qudt.datatype/CoordinateSystem,
   :dcterms/description
   "In geometry, a coordinate system is a system which uses one or more numbers, or coordinates, to uniquely determine the position of a point or other geometric element on a manifold such as Euclidean space. The order of the coordinates is significant and they are sometimes identified by their position in an ordered tuple and sometimes by a letter, as in 'the x-coordinate'. \n\n\n\nIn elementary mathematics the coordinates are taken to be real numbers, but may be complex numbers or elements of a more abstract system such as a commutative ring. The use of a coordinate system allows problems in geometry to be translated into problems about numbers and vice versa; this is the basis of analytic geometry. \n\n\n\nIn astronomy, a celestial coordinate system is a system for specifying positions of celestial objects: satellites, planets, stars, galaxies, and so on. Coordinate systems can specify a position in 3-dimensional space, or merely the direction of the object on the celestial sphere, if its distance is not known or not important.\n\n\n\nThe coordinate systems are implemented in either spherical coordinates or rectangular coordinates. Spherical coordinates, projected on the celestial sphere, are analogous to the geographic coordinate system used on the surface of the Earth. These differ in their choice of fundamental plane, which divides the celestial sphere into two equal hemispheres along a great circle. Rectangular coordinates, in appropriate units, are simply the cartesian equivalent of the spherical coordinates, with the same fundamental (x,y) plane and primary (x-axis) direction. Each coordinate system is named for its choice of fundamental plane.",
   :owl/sameAs "http://dbpedia.org/resource/Coordinate_system",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinate system",
   :rdfs/seeAlso
   ["http://mathworld.wolfram.com/CoordinateSystem.html"
    "http://mathworld.wolfram.com/Coordinates.html"
    "http://en.wikipedia.org/wiki/Coordinate_system"
    "http://en.wikipedia.org/wiki/Astronomical_coordinate_systems"],
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt.datatype/ReferenceFrame,
                      :owl/onProperty    :qudt.datatype/referenceFrame,
                      :rdf/type          :owl/Restriction}
                     :skos/Concept
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/acronym,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/referenceFrame,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/abbreviation,
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/Concept
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/coordinateCenter,
                      :rdf/type        :owl/Restriction}],
   :sh/property [:qudt.datatype/CoordinateSystem-coordinateCenter
                 :qudt.datatype/CoordinateSystem-referenceFrame
                 :qudt.datatype/CoordinateSystem-acronym
                 :qudt.datatype/CoordinateSystem-abbreviation]})

(def CoordinateSystem-abbreviation
  {:db/ident    :qudt.datatype/CoordinateSystem-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/abbreviation})

(def CoordinateSystem-acronym
  {:db/ident    :qudt.datatype/CoordinateSystem-acronym,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :vaem/acronym})

(def CoordinateSystem-coordinateCenter
  {:db/ident    :qudt.datatype/CoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/CoordinateCenterType,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/coordinateCenter})

(def CoordinateSystem-referenceFrame
  {:db/ident    :qudt.datatype/CoordinateSystem-referenceFrame,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/ReferenceFrame,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/referenceFrame})

(def CoordinateSystemFrame
  "Coordinate system frame"
  {:db/ident         :qudt.datatype/CoordinateSystemFrame,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Coordinate system frame",
   :rdfs/subClassOf  :skos/Concept})

(def CoordinateSystemType
  "The primary attributes of any coordinate system are the coordinate frame or orientation of the axes of the coordinate system and the coordinate center or origin of the coordinate system. The coordinate center is the easier of the two attributes to define and in trajectory-related coordinate systems is often taken to be the center of mass of natural solar system bodies such as the Earth, the Moon, or Mars. Precise definition of the coordinate frame, however, usually takes much more effort. As a result, the primary purpose of this section is to provide a detailed description of a number of different coordinate frames commonly used in lunar and Mars mission analysis. All of the coordinate frames described in this section are standard, right-handed coordinate frames with orthogonal axes at the origin. In general, the coordinate frame and the coordinate center are independent quantities. In other words, multiple coordinate systems can be defined using the same coordinate center (with different frames) or the same coordinate frame (with different centers)."
  {:db/ident :qudt.datatype/CoordinateSystemType,
   :dcterms/description
   "The primary attributes of any coordinate system are the coordinate frame or orientation of the axes of the coordinate system and the coordinate center or origin of the coordinate system. The coordinate center is the easier of the two attributes to define and in trajectory-related coordinate systems is often taken to be the center of mass of natural solar system bodies such as the Earth, the Moon, or Mars. Precise definition of the coordinate frame, however, usually takes much more effort. As a result, the primary purpose of this section is to provide a detailed description of a number of different coordinate frames commonly used in lunar and Mars mission analysis. All of the coordinate frames described in this section are standard, right-handed coordinate frames with orthogonal axes at the origin. In general, the coordinate frame and the coordinate center are independent quantities. In other words, multiple coordinate systems can be defined using the same coordinate center (with different frames) or the same coordinate frame (with different centers). ",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/comment
   "<p>A coordinate system is a mathematical structure for assigning a unique n-tuple of numbers or scalars to each point in an n-dimensional space. A Coordinate System Type is a data type that defines the properties of data structures that represent coordinate systems.</p>\n\n<p>The primary attributes of any coordinate system are the coordinate frame or orientation of the axes of the coordinate system and the coordinate center or origin of the coordinate system. The coordinate center is the easier of the two attributes to define and in trajectory-related coordinate systems is often taken to be the center of mass of natural solar system bodies such as the Earth, the Moon, or Mars. Precise definition of the coordinate frame, however, usually takes much more effort. As a result, the primary purpose of this section is to provide a detailed description of a number of different coordinate frames commonly used in lunar and Mars mission analysis. </p>",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label ["Coordinate System Type" "Coordinate system type"],
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/originDefinition,
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/TupleType
                     :qudt.datatype/EnumeratedValue],
   :sh/property [:qudt.datatype/Coordinates-elementType
                 :qudt.datatype/CoordinateSystemType-originDefinition]})

(def CoordinateSystemType-originDefinition
  {:db/ident    :qudt.datatype/CoordinateSystemType-originDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/originDefinition})

(def Coordinates
  "A coordinate system is a mathematical structure for assigning a unique n-tuple of numbers or scalars to each point in an n-dimensional space. A Coordinate System Type is a data type that defines the properties of data structures that represent coordinate systems."
  {:db/ident :qudt.datatype/Coordinates,
   :dcterms/description
   "A coordinate system is a mathematical structure for assigning a unique n-tuple of numbers or scalars to each point in an n-dimensional space. A Coordinate System Type is a data type that defines the properties of data structures that represent coordinate systems.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinate System Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt.datatype/CoordinateMember,
                      :owl/onProperty    :qudt.datatype/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/Tuple]})

(def Coordinates-2D
  "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system."
  {:db/ident :qudt.datatype/Coordinates-2D,
   :dcterms/description
   "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "2D Coordinate Type",
   :rdfs/subClassOf [:qudt.datatype/Two-Tuple :qudt.datatype/CartesianCoordinates]})

(def Coordinates-2D-DoublePrecision
  "2D coordinates in double floating point precision for locating a point in physical space"
  {:db/ident :qudt.datatype/Coordinates-2D-DoublePrecision,
   :dcterms/description
   "2D coordinates in double floating point precision for locating a point in physical space",
   :qudt.datatype/elementTypeCount 2,
   :rdf/type [:owl/Class :qudt.datatype/Coordinates-2D-Type],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinates-2D-Double precision",
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    "http://qudt.org/schema/type#Double_Y",
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#Double_X",
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#Double_Y",
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/Coordinates-2D
                     {:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    "http://qudt.org/schema/type#Double_X",
                      :rdf/type          :owl/Restriction}]})

(def Coordinates-2D-DoublePrecision-Double_X
  {:db/ident    :qudt.datatype/Coordinates-2D-DoublePrecision-Double_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/Double_X})

(def Coordinates-2D-DoublePrecision-Double_Y
  {:db/ident    :qudt.datatype/Coordinates-2D-DoublePrecision-Double_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/Double_Y})

(def Coordinates-2D-SinglePrecision
  "2D coordinates in single floating point precision for locating a point in physical space"
  {:db/ident :qudt.datatype/Coordinates-2D-SinglePrecision,
   :dcterms/description
   "2D coordinates in single floating point precision for locating a point in physical space",
   :qudt.datatype/elementTypeCount 2,
   :rdf/type [:owl/Class :qudt.datatype/Coordinates-2D-Type],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Cartesian Coordinates 2D Single Precision",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/float_X,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt.datatype/float_Y,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/float_Y,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt.datatype/float_X,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/Coordinates-2D]})

(def Coordinates-2D-SinglePrecision-float_X
  {:db/ident    :qudt.datatype/Coordinates-2D-SinglePrecision-float_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/float_X})

(def Coordinates-2D-SinglePrecision-float_Y
  {:db/ident    :qudt.datatype/Coordinates-2D-SinglePrecision-float_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/float_Y})

(def Coordinates-2D-Type
  "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system."
  {:db/ident :qudt.datatype/Coordinates-2D-Type,
   :dcterms/description
   "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/label "2D Coordinate Type",
   :rdfs/subClassOf [:qudt.datatype/TwoTupleType :qudt.datatype/CartesianCoordinatesType]})

(def Coordinates-3D
  "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system."
  {:db/ident :qudt.datatype/Coordinates-3D,
   :dcterms/description
   "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "3D Coordinate Type",
   :rdfs/subClassOf [:qudt.datatype/Three-Tuple :qudt.datatype/CartesianCoordinates]})

(def Coordinates-3D-DoublePrecision
  "3D coordinates in double floating point precision for locating a point in physical space"
  {:db/ident :qudt.datatype/Coordinates-3D-DoublePrecision,
   :dcterms/description
   "3D coordinates in double floating point precision for locating a point in physical space",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "3D Coordinates (Double Precision)",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#Double_Z",
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    "http://qudt.org/schema/type#Double_X",
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/Coordinates-3D
                     {:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#Double_Y",
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    "http://qudt.org/schema/type#Double_Z",
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#Double_X",
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    "http://qudt.org/schema/type#Double_Y",
                      :rdf/type          :owl/Restriction}]})

(def Coordinates-3D-DoublePrecision-Double_X
  {:db/ident    :qudt.datatype/Coordinates-3D-DoublePrecision-Double_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/Double_X})

(def Coordinates-3D-DoublePrecision-Double_Y
  {:db/ident    :qudt.datatype/Coordinates-3D-DoublePrecision-Double_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/Double_Y})

(def Coordinates-3D-DoublePrecision-Double_Z
  {:db/ident    :qudt.datatype/Coordinates-3D-DoublePrecision-Double_Z,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/Double_Z})

(def Coordinates-3D-DoublePrecision-Type
  "3D coordinates in double floating point precision for locating a point in physical space"
  {:db/ident   :qudt.datatype/Coordinates-3D-DoublePrecision-Type,
   :dcterms/description
   "3D coordinates in double floating point precision for locating a point in physical space",
   :qudt.datatype/elementTypeCount 3,
   :rdf/type   :qudt.datatype/Coordinates-3D-Type,
   :rdfs/label "3D Coordinates (Double Precision) type"})

(def Coordinates-3D-SinglePrecision
  "3D coordinates in single floating point precision for locating a point in physical space"
  {:db/ident :qudt.datatype/Coordinates-3D-SinglePrecision,
   :dcterms/description
   "3D coordinates in single floating point precision for locating a point in physical space",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "3D Coordinates (Single Precision)",
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt.datatype/float_Y,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt.datatype/float_Z,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/float_Y,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/float_Z,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt.datatype/float_X,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/float_X,
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/Coordinates-3D]})

(def Coordinates-3D-SinglePrecision-Type
  "3D coordinates in single floating point precision for locating a point in physical space"
  {:db/ident   :qudt.datatype/Coordinates-3D-SinglePrecision-Type,
   :dcterms/description
   "3D coordinates in single floating point precision for locating a point in physical space",
   :qudt.datatype/elementTypeCount 3,
   :rdf/type   :qudt.datatype/Coordinates-3D-Type,
   :rdfs/label "3D Coordinates (Single Precision)"})

(def Coordinates-3D-SinglePrecision-float_X
  {:db/ident    :qudt.datatype/Coordinates-3D-SinglePrecision-float_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/float_X})

(def Coordinates-3D-SinglePrecision-float_Y
  {:db/ident    :qudt.datatype/Coordinates-3D-SinglePrecision-float_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/float_Y})

(def Coordinates-3D-SinglePrecision-float_Z
  {:db/ident    :qudt.datatype/Coordinates-3D-SinglePrecision-float_Z,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/float_Z})

(def Coordinates-3D-Type
  "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system."
  {:db/ident :qudt.datatype/Coordinates-3D-Type,
   :dcterms/description
   "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/label "3D Coordinate Type",
   :rdfs/subClassOf [:qudt.datatype/ThreeTupleType :qudt.datatype/CartesianCoordinatesType]})

(def Coordinates-elementType
  {:db/ident :qudt.datatype/Coordinates-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/CoordinateMember,
   :sh/path  :qudt.datatype/elementType})

(def DATE
  "Provides the date expressed in year, month and day."
  {:db/ident          :qudt.datatype/DATE,
   :dcterms/description "Provides the date expressed in year, month and day.",
   :dtype/literal     "date",
   :qudt.datatype/dimensionality 1,
   :qudt.datatype/encodingDescription
   "YYYY:MM:DD, where YYYY is a 4 digit year, MM is a 2 digit month and DD is a 2 digit day.",
   :qudt.datatype/rdfsDatatype :xsd/date,
   :rdf/type          :qudt.datatype/DateStringType,
   :rdfs/label        "Date"})

(def DATETIME
  "A time stamp encoded as a string 'YYYY-MM-DDThh:mm:ss[.dd]' or 'YYYY-DDDThh:mm:ss[.dd]', where 'YYYY' is the year, 'MM' is the two-digit month, 'DD' is the two-digit day, 'DDD' is the three digit day of year, 'T' is constant, 'hh:mm:ss[.dd]' is the UTC time in hours, minutes, seconds, and optional fractional seconds. As many 'd' characters to the right of the period as required may be used to obtain the required precision. All fields require leading zeros."
  {:db/ident :qudt.datatype/DATETIME,
   :dcterms/description
   "A time stamp encoded as a string 'YYYY-MM-DDThh:mm:ss[.dd]' or 'YYYY-DDDThh:mm:ss[.dd]', where 'YYYY' is the year, 'MM' is the two-digit month, 'DD' is the two-digit day, 'DDD' is the three digit day of year, 'T' is constant, 'hh:mm:ss[.dd]' is the UTC time in hours, minutes, seconds, and optional fractional seconds. As many 'd' characters to the right of the period as required may be used to obtain the required precision. All fields require leading zeros.",
   :dtype/literal "datetime",
   :owl/sameAs :qudt.datatype/UTC-DATETIME,
   :qudt.datatype/dimensionality 1,
   :qudt.datatype/rdfsDatatype :xsd/dateTime,
   :rdf/type :qudt.datatype/DateStringType,
   :rdfs/label "Date Time"})

(def DECIMAL
  "Decimal"
  {:db/ident           :qudt.datatype/DECIMAL,
   :dtype/literal      "numeric",
   :qudt.datatype/ansiSQLName   "DECIMAL(p,s)",
   :qudt.datatype/odbcName      "SQL_DECIMAL(p,s)",
   :qudt.datatype/oracleSQLName "NUMBER(p,s)",
   :qudt.datatype/rdfsDatatype  :xsd/decimal,
   :rdf/type           :qudt.datatype/NumericType,
   :rdfs/label         "Decimal"})

(def DataElement-type
  {:db/ident    :qudt.datatype/DataElement-type,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/Datatype,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/dataType})

(def DataSetElement
  "A field is a tuple that carries a name, a type and optionally other properties that characterize a member element of a composite data strucuture."
  {:db/ident :qudt.datatype/DataSetElement,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A field is a tuple that carries a name, a type and optionally other properties that characterize a member element of a composite data strucuture.",
   :rdfs/label "QUDT DataSet Element",
   :rdfs/subClassOf [:qudt.datatype/Tuple :qudt.datatype/DataElement],
   :sh/property [:qudt.datatype/DataSetElement-quantityKind
                 :qudt.datatype/DataSetElement-optional
                 :qudt.datatype/DataSetElement-elementLabel]})

(def DataSetElement-elementLabel
  {:db/ident    :qudt.datatype/DataSetElement-elementLabel,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/elementLabel})

(def DataSetElement-optional
  {:db/ident    :qudt.datatype/DataSetElement-optional,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/optional})

(def DataSetElement-quantityKind
  {:db/ident    :qudt.datatype/DataSetElement-quantityKind,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/QuantityKind,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/hasQuantityKind})

(def Datatype-ansiSQLName
  {:db/ident    :qudt.datatype/Datatype-ansiSQLName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/ansiSQLName})

(def Datatype-basis
  {:db/ident    :qudt.datatype/Datatype-basis,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/Datatype,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/basis})

(def Datatype-bounded
  {:db/ident    :qudt.datatype/Datatype-bounded,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/bounded})

(def Datatype-cName
  {:db/ident    :qudt.datatype/Datatype-cName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/cName})

(def Datatype-cardinality
  {:db/ident    :qudt.datatype/Datatype-cardinality,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/CardinalityType,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/cardinality})

(def Datatype-description
  {:db/ident       :qudt.datatype/Datatype-description,
   :rdf/type       :sh/PropertyShape,
   :sh/deactivated true,
   :sh/maxCount    1,
   :sh/path        :vaem/description})

(def Datatype-id
  {:db/ident       :qudt.datatype/Datatype-id,
   :rdf/type       :sh/PropertyShape,
   :sh/datatype    :xsd/string,
   :sh/deactivated true,
   :sh/path        :qudt.datatype/id})

(def Datatype-javaName
  {:db/ident    :qudt.datatype/Datatype-javaName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/javaName})

(def Datatype-jsName
  {:db/ident    :qudt.datatype/Datatype-jsName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/jsName})

(def Datatype-matlabName
  {:db/ident    :qudt.datatype/Datatype-matlabName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/matlabName})

(def Datatype-microsoftSQLServerName
  {:db/ident    :qudt.datatype/Datatype-microsoftSQLServerName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/microsoftSQLServerName})

(def Datatype-mySQLName
  {:db/ident    :qudt.datatype/Datatype-mySQLName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/mySQLName})

(def Datatype-odbcName
  {:db/ident    :qudt.datatype/Datatype-odbcName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/odbcName})

(def Datatype-oleDBName
  {:db/ident    :qudt.datatype/Datatype-oleDBName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/oleDBName})

(def Datatype-oracleSQLName
  {:db/ident    :qudt.datatype/Datatype-oracleSQLName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/oracleSQLName})

(def Datatype-protocolBuffersName
  {:db/ident    :qudt.datatype/Datatype-protocolBuffersName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/protocolBuffersName})

(def Datatype-pythonName
  {:db/ident    :qudt.datatype/Datatype-pythonName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/pythonName})

(def Datatype-vbName
  {:db/ident    :qudt.datatype/Datatype-vbName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/vbName})

(def DateStringType
  "Date String Types are scalar data types that define the properties of strings that represent calendar dates."
  {:db/ident :qudt.datatype/DateStringType,
   :dcterms/description
   "Date String Types are scalar data types that define the properties of strings that represent calendar dates.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Date String Type",
   :rdfs/subClassOf :qudt.datatype/DateTimeStringType})

(def DateTimeStringEncodingType
  "Date Time encodings are logical encodings for expressing date/time quantities as strings by applying unambiguous formatting and parsing rules."
  {:db/ident :qudt.datatype/DateTimeStringEncodingType,
   :dcterms/description
   "Date Time encodings are logical encodings for expressing date/time quantities as strings by applying unambiguous formatting and parsing rules.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Date Time String Encoding Type",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :qudt.datatype/allowedPattern,
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/StringEncodingType],
   :sh/property [{:sh/path :qudt.datatype/allowedPattern,
                  :sh/qualifiedMinCount 1,
                  :sh/qualifiedValueShape {:sh/datatype :xsd/string}}
                 :qudt.datatype/DateTimeStringEncodingType-allowedPattern]})

(def DateTimeStringEncodingType-allowedPattern
  {:db/ident    :qudt.datatype/DateTimeStringEncodingType-allowedPattern,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :qudt.datatype/allowedPattern})

(def DateTimeStringType
  "A class of data types for structures that represent temporal quantities. I.e. calendar dates, times, duration of time since a given epoch, etc."
  {:db/ident :qudt.datatype/DateTimeStringType,
   :dcterms/description
   "A class of data types for structures that represent temporal quantities. I.e. calendar dates, times, duration of time since a given epoch, etc.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Temporal Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/encoding,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/DateTimeStringEncodingType,
                      :owl/onProperty    :qudt.datatype/encoding,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/StringType],
   :sh/property :qudt.datatype/DateTimeStringType-encoding})

(def DateTimeStringType-encoding
  {:db/ident    :qudt.datatype/DateTimeStringType-encoding,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/DateTimeStringEncodingType,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/encoding})

(def DecimalScaledUnit
  "A sub-type of 'Scaled unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/DecimalScaledUnit,
   :dcterms/description
   "A sub-type of 'Scaled unit'. Detailed desciption to be provided in a future version."})

(def DerivedCoherentUnit
  "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/DerivedCoherentUnit,
   :dcterms/description
   "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."})

(def DerivedNonCoherentUnit
  "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/DerivedNonCoherentUnit,
   :dcterms/description
   "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."})

(def Dictionary
  "A \"Map\"."
  {:db/ident            :qudt.datatype/Dictionary,
   :dcterms/description "A \"Map\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Dictionary Type",
   :rdfs/subClassOf     :qudt.datatype/Map})

(def DictionaryType
  "A kind of \"Map\"."
  {:db/ident            :qudt.datatype/DictionaryType,
   :dcterms/description "A kind of \"Map\".",
   :rdf/type            :owl/Class,
   :rdfs/label          "Dictionary Type",
   :rdfs/subClassOf     :qudt.datatype/MapType})

(def DimensionVector
  "Dimension Vector"
  {:db/ident         :qudt.datatype/DimensionVector,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Dimension Vector",
   :rdfs/subClassOf  :skos/Concept})

(def DimensionalDatatype
  "A dimensional data type is a data type that specifies a physical quantity or unit of measure. Information about the physical dimensions of the quantities and units is embedded in their types."
  {:db/ident :qudt.datatype/DimensionalDatatype,
   :dcterms/description
   "A dimensional data type is a data type that specifies a physical quantity or unit of measure. Information about the physical dimensions of the quantities and units is embedded in their types.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Dimensional Data Type",
   :rdfs/subClassOf :qudt.datatype/StructuredDatatype})

(def DiscreteState
  {:db/ident         :qudt.datatype/DiscreteState,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/subClassOf  :qudt.datatype/EnumeratedValue})

(def DoublePrecisionEncoding
  "Single Precision Real Encoding"
  {:db/ident   :qudt.datatype/DoublePrecisionEncoding,
   :qudt.datatype/bytes 64,
   :rdf/type   :qudt.datatype/FloatingPointEncodingType,
   :rdfs/label "Single Precision Real Encoding"})

(def DoublePrecisionType
  "A double precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so double precision data value on a 32-bit machine architecture occupies eight bytes of memory."
  {:db/ident :qudt.datatype/DoublePrecisionType,
   :dcterms/description
   "A double precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so double precision data value on a 32-bit machine architecture occupies eight bytes of memory.",
   :owl/disjointWith :qudt.datatype/SinglePrecisionType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Double Precision Type",
   :rdfs/subClassOf :qudt.datatype/NumericType})

(def EarthCoordinateSystem
  "A\"Trajectory Coordinate System\" for all earth-centered coordinates, such as \"Earth mean equator and prime meridian coordinate system\", \"Earth true equator and prime meridian of epoch coordinate system\", \"International celestial reference system\", \"International terrestrial reference system\", \"Sun centered international celestial reference system\", \"Vehicle centered international celestial reference system\"."
  {:db/ident :qudt.datatype/EarthCoordinateSystem,
   :dcterms/description
   "A\"Trajectory Coordinate System\" for all earth-centered coordinates, such as \"Earth mean equator and prime meridian coordinate system\", \"Earth true equator and prime meridian of epoch coordinate system\", \"International celestial reference system\", \"International terrestrial reference system\", \"Sun centered international celestial reference system\", \"Vehicle centered international celestial reference system\".",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Earth Coordinate System Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/CC_EarthCentered,
                      :owl/onProperty :qudt.datatype/coordinateCenter,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/TrajectoryCoordinateSystem],
   :sh/property :qudt.datatype/EarthCoordinateSystem-coordinateCenter})

(def EarthCoordinateSystem-coordinateCenter
  {:db/ident    :qudt.datatype/EarthCoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/CoordinateCenterType,
   :sh/hasValue :qudt.type/CC_EarthCentered,
   :sh/path     :qudt.datatype/coordinateCenter})

(def Encoding
  "An encoding is a rule or algorithm that is used to convert data from a native, or unspecified form into a specific form that satisfies the encoding rules. Examples of encodings include character encodings, such as UTF-8."
  {:db/ident :qudt.datatype/Encoding,
   :dcterms/description
   "An encoding is a rule or algorithm that is used to convert data from a native, or unspecified form into a specific form that satisfies the encoding rules. Examples of encodings include character encodings, such as UTF-8.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Encoding",
   :rdfs/subClassOf [:skos/Concept
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/bytes,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/bits,
                      :rdf/type           :owl/Restriction}],
   :sh/property [:qudt.datatype/Encoding-bytes :qudt.datatype/Encoding-bits]})

(def Encoding-bits
  {:db/ident    :qudt.datatype/Encoding-bits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/bits})

(def Encoding-bytes
  {:db/ident    :qudt.datatype/Encoding-bytes,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/bytes})

(def EngineeringValueTupleMember
  "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/EngineeringValueTupleMember,
   :dcterms/description
   "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version.",
   :owl/disjointWith [:qudt.datatype/RawValueTupleMemberType :qudt.datatype/RawValueTupleMember],
   :owl/equivalentClass {:owl/intersectionOf
                         [:qudt.datatype/TupleMemberType
                          {:owl/allValuesFrom :qudt.datatype/RealSinglePrecisionType,
                           :owl/onProperty    :qudt.datatype/elementType,
                           :rdf/type          :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Engineering Value Tuple Member",
   :rdfs/subClassOf [:qudt.datatype/TupleMember
                     {:owl/allValuesFrom :qudt.datatype/RealSinglePrecisionType,
                      :owl/onProperty    :qudt.datatype/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/TupleMemberType],
   :sh/property :qudt.datatype/EngineeringValueTupleMember-elementType})

(def EngineeringValueTupleMember-elementType
  {:db/ident :qudt.datatype/EngineeringValueTupleMember-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/RealSinglePrecisionType,
   :sh/path  :qudt.datatype/elementType})

(def Enumeration
  "QUDT Enumeration"
  {:db/ident :qudt.datatype/Enumeration,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "QUDT Enumeration",
   :rdfs/subClassOf
   [{:dcterms/description
     "The number of bits allocated to the field for encoding any tags associated with elements.",
     :owl/maxCardinality 1,
     :owl/onProperty :qudt.datatype/bits,
     :rdf/type :owl/Restriction}
    {:owl/allValuesFrom :qudt.datatype/EnumeratedValue,
     :owl/onProperty    :qudt.datatype/defaultValue,
     :rdf/type          :owl/Restriction}
    :dtype/Enumeration
    :qudt.datatype/StructuredDatatype
    {:owl/maxCardinality 1,
     :owl/onProperty     :qudt.datatype/encoding,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :qudt.datatype/EnumeratedValue,
     :owl/onProperty    :dtype/value,
     :rdf/type          :owl/Restriction}],
   :sh/property [:qudt.datatype/Enumeration-encoding
                 :qudt.datatype/Enumeration-bits
                 :qudt.datatype/Enumeration-defaultValue
                 :qudt.datatype/Enumeration-value]})

(def Enumeration-bits
  {:db/ident    :qudt.datatype/Enumeration-bits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/bits})

(def Enumeration-defaultValue
  {:db/ident :qudt.datatype/Enumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/EnumeratedValue,
   :sh/path  :qudt.datatype/defaultValue})

(def Enumeration-encoding
  {:db/ident    :qudt.datatype/Enumeration-encoding,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/encoding})

(def Enumeration-value
  {:db/ident :qudt.datatype/Enumeration-value,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/EnumeratedValue,
   :sh/path  :dtype/value})

(def EnumerationScale
  "A sub-type of 'Scale'. Detailed desciption to be provided in a future version. A sub-type of 'DTYPE Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/EnumerationScale,
   :dcterms/description
   ["A sub-type of 'Scale'. Detailed desciption to be provided in a future version."
    "A sub-type of 'DTYPE Enumeration'. Detailed desciption to be provided in a future version."]})

(def FALSE
  "False"
  {:db/ident         :qudt.datatype/FALSE,
   :dtype/literal    "false",
   :rdf/type         :qudt.datatype/BooleanTypeEnumeratedValue,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "False"})

(def FLAG
  "FLAG"
  {:db/ident          :qudt.datatype/FLAG,
   :dtype/literal     "flag",
   :qudt.datatype/rdfsDatatype :xsd/boolean,
   :rdf/type          :qudt.datatype/BooleanType,
   :rdfs/label        "FLAG"})

(def FT_INERTIAL
  "Inertial Frame Type"
  {:db/ident   :qudt.datatype/FT_INERTIAL,
   :rdf/type   :qudt.datatype/FrameType,
   :rdfs/label "Inertial Frame Type"})

(def FT_NON-ROTATING
  "Non-rotating Frame Type"
  {:db/ident   :qudt.datatype/FT_NON-ROTATING,
   :rdf/type   :qudt.datatype/FrameType,
   :rdfs/label "Non-rotating Frame Type"})

(def FT_ROTATING
  "Rotating Frame Type"
  {:db/ident   :qudt.datatype/FT_ROTATING,
   :rdf/type   :qudt.datatype/FrameType,
   :rdfs/label "Rotating Frame Type"})

(def FieldType
  "A sub-type of 'Composite Data Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/FieldType,
   :dcterms/description
   "A sub-type of 'Composite Data Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Field Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/fieldName,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/Datatype,
                      :owl/onProperty    :qudt.datatype/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/CompositeDatatype]})

(def FieldType-elementName
  {:db/ident    :qudt.datatype/FieldType-elementName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/elementName})

(def FieldType-elementType
  {:db/ident :qudt.datatype/FieldType-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/Datatype,
   :sh/path  :qudt.datatype/elementType})

(def FieldType-fieldLabel
  {:db/ident    :qudt.datatype/FieldType-fieldLabel,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/fieldLabel})

(def FieldType-fieldType
  {:db/ident    :qudt.datatype/FieldType-fieldType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/Datatype,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/fieldType})

(def FieldType-optional
  {:db/ident    :qudt.datatype/FieldType-optional,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/optional})

(def Figure
  "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/Figure,
   :dcterms/description
   "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."})

(def FileFormat
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/FileFormat,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "File format",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def FixedIntervalTimeSeriesArray
  "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals."
  {:db/ident :qudt.datatype/FixedIntervalTimeSeriesArray,
   :dcterms/description
   "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Fixed Interval Time Series Array Type",
   :rdfs/subClassOf :qudt.datatype/TimeSeriesArray})

(def FixedIntervalTimeSeriesArrayType
  "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals."
  {:db/ident :qudt.datatype/FixedIntervalTimeSeriesArrayType,
   :dcterms/description
   "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals.",
   :rdf/type :owl/Class,
   :rdfs/label "Fixed Interval Time Series Array Type",
   :rdfs/subClassOf :qudt.datatype/TimeSeriesArrayType})

(def FloatingPointEncodingType
  "A \"Encoding\" with the following instance(s): \"Double Precision Encoding\", \"Single Precision Real Encoding\"."
  {:db/ident :qudt.datatype/FloatingPointEncodingType,
   :dcterms/description
   "A \"Encoding\" with the following instance(s): \"Double Precision Encoding\", \"Single Precision Real Encoding\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Floating Point Encoding",
   :rdfs/subClassOf :qudt.datatype/Encoding})

(def FrameType
  "This class contains elements which specify the intertial type of a coordinate frame as either inertial, rotating, or non-rotating."
  {:db/ident :qudt.datatype/FrameType,
   :dcterms/description
   "This class contains elements which specify the intertial type of a coordinate frame as either inertial, rotating, or non-rotating.",
   :owl/oneOf [:qudt.datatype/FT_ROTATING :qudt.datatype/FT_NON-ROTATING :qudt.datatype/FT_INERTIAL],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Frame Type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def Function
  "Function"
  {:db/ident        :qudt.datatype/Function,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Function",
   :rdfs/subClassOf :qudt.datatype/Concept})

(def FunctionDatatype
  "A function data type defines the inputs and outputs for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments. [Wikipedia] A function data type defines the input and output data type for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments."
  {:db/ident :qudt.datatype/FunctionDatatype,
   :dcterms/description
   ["A function data type defines the inputs and outputs for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments. [Wikipedia]"
    "A function data type defines the input and output data type for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments."],
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Function Data Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/functionArity,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/returnType,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/Datatype,
                      :owl/onProperty    :qudt.datatype/argType,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/StructuredDatatype
                     {:owl/allValuesFrom :qudt.datatype/Datatype,
                      :owl/onProperty    :qudt.datatype/returnType,
                      :rdf/type          :owl/Restriction}],
   :sh/property [:qudt.datatype/FunctionDatatype-returnType
                 :qudt.datatype/FunctionDatatype-functionArity
                 :qudt.datatype/FunctionDatatype-argType]})

(def FunctionDatatype-argType
  {:db/ident :qudt.datatype/FunctionDatatype-argType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/Datatype,
   :sh/path  :qudt.datatype/argType})

(def FunctionDatatype-functionArity
  {:db/ident    :qudt.datatype/FunctionDatatype-functionArity,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/functionArity})

(def FunctionDatatype-returnType
  {:db/ident    :qudt.datatype/FunctionDatatype-returnType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/Datatype,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/returnType})

(def Graph
  "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges)."
  {:db/ident :qudt.datatype/Graph,
   :dcterms/description
   "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges).",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Graph Type",
   :rdfs/subClassOf :qudt.datatype/Collection})

(def GraphType
  "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges)."
  {:db/ident :qudt.datatype/GraphType,
   :dcterms/description
   "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges).",
   :rdf/type :owl/Class,
   :rdfs/label "Graph Type",
   :rdfs/subClassOf :qudt.datatype/CollectionType})

(def GreekCharacter
  "A sub-type of 'Symbol'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/GreekCharacter,
   :dcterms/description
   "A sub-type of 'Symbol'. Detailed desciption to be provided in a future version."})

(def GroundCoordinateSystem
  "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/GroundCoordinateSystem,
   :dcterms/description
   "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ground coordinate system",
   :rdfs/subClassOf :qudt.datatype/AerospaceCoordinateSystem})

(def HEAP
  "HEAP"
  {:db/ident   :qudt.datatype/HEAP,
   :rdf/type   :qudt.datatype/HeapType,
   :rdfs/label "HEAP"})

(def HEXBINARY
  "HEXBINARY"
  {:db/ident            :qudt.datatype/HEXBINARY,
   :dtype/literal       "hexbinary",
   :qudt.datatype/dimensionality 1,
   :qudt.datatype/rdfsDatatype   :qudt.datatype/hexbinary,
   :rdf/type            :qudt.datatype/HexBinaryType,
   :rdfs/label          "HEXBINARY"})

(def HashTable
  "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs."
  {:db/ident :qudt.datatype/HashTable,
   :dcterms/description
   "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Hash Table Type",
   :rdfs/subClassOf [:qudt.datatype/TableType :qudt.datatype/Map]})

(def HashTableType
  "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs."
  {:db/ident :qudt.datatype/HashTableType,
   :dcterms/description
   "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs.",
   :rdf/type :owl/Class,
   :rdfs/label "Hash Table Type",
   :rdfs/subClassOf :qudt.datatype/MapType})

(def Heap
  "<p class=\"lm-para\">A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then \\(key(A) \\ge key(B)\\). This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type.</p>"
  {:db/ident :qudt.datatype/Heap,
   :dcterms/description
   "<p class=\"lm-para\">A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then \\(key(A) \\ge key(B)\\). This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type.</p>",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Heap_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Heap Type",
   :rdfs/subClassOf :qudt.datatype/OrderedTree})

(def HeapType
  "A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then <em>key(A) &gt; key(B)</em>. This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type."
  {:db/ident :qudt.datatype/HeapType,
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Heap_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then <em>key(A) &gt; key(B)</em>. This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type.",
   :rdfs/label "Heap Type",
   :rdfs/subClassOf :qudt.datatype/OrderedTreeType})

(def HexBinaryType
  "A string composed of hex characters."
  {:db/ident            :qudt.datatype/HexBinaryType,
   :dcterms/description "A string composed of hex characters.",
   :rdf/type            [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Hexidecimal Binary Type",
   :rdfs/subClassOf     [{:owl/maxCardinality 1,
                          :owl/onProperty     :qudt.datatype/length,
                          :rdf/type           :owl/Restriction}
                         {:owl/maxCardinality 1,
                          :owl/onProperty     :qudt.datatype/minLength,
                          :rdf/type           :owl/Restriction}
                         {:owl/maxCardinality 1,
                          :owl/onProperty     :qudt.datatype/pattern,
                          :rdf/type           :owl/Restriction}
                         :qudt.datatype/TextStringType
                         {:owl/maxCardinality 1,
                          :owl/onProperty     :qudt.datatype/maxLength,
                          :rdf/type           :owl/Restriction}],
   :sh/property         [:qudt.datatype/HexBinaryType-length
                         :qudt.datatype/HexBinaryType-minLength
                         :qudt.datatype/HexBinaryType-maxLength
                         :qudt.datatype/HexBinaryType-pattern]})

(def HexBinaryType-length
  {:db/ident    :qudt.datatype/HexBinaryType-length,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/length})

(def HexBinaryType-maxLength
  {:db/ident    :qudt.datatype/HexBinaryType-maxLength,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/maxLength})

(def HexBinaryType-minLength
  {:db/ident    :qudt.datatype/HexBinaryType-minLength,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/minLength})

(def HexBinaryType-pattern
  {:db/ident    :qudt.datatype/HexBinaryType-pattern,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/pattern})

(def HighToLow
  "High To Low"
  {:db/ident      :qudt.datatype/HighToLow,
   :dtype/literal "high",
   :rdf/type      :qudt.datatype/MemoryOrderType,
   :rdfs/label    "High To Low"})

(def IEEE754_1985RealEncoding
  "IEEE 754 1985 Real Encoding"
  {:db/ident   :qudt.datatype/IEEE754_1985RealEncoding,
   :qudt.datatype/bytes 32,
   :rdf/type   :qudt.datatype/FloatingPointEncodingType,
   :rdfs/label "IEEE 754 1985 Real Encoding"})

(def IERS-TN-32-2004
  "IERS Conventions (2003), D. D. McCarthy and Gérard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32."
  {:db/ident :qudt.datatype/IERS-TN-32-2004,
   :dcterms/description
   "IERS Conventions (2003), D. D. McCarthy and Gérard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32.",
   :qudt.datatype/url "http://www.iers.org/iers/publications/tn/tn32.",
   :rdf/type :qudt.datatype/Citation,
   :rdfs/label "IERS-TN-32-2004",
   :skos/prefLabel "IERS-TN-32-2004"})

(def IMPERIAL-DimensionVector
  "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/IMPERIAL-DimensionVector,
   :dcterms/description
   "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."})

(def ISO-DimensionVector
  "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/ISO-DimensionVector,
   :dcterms/description
   "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."})

(def ISO8601-UTCDateTime-BasicFormat
  "ISO 8601 UTC Date Time - Basic Format"
  {:db/ident   :qudt.datatype/ISO8601-UTCDateTime-BasicFormat,
   :qudt.datatype/allowedPattern
   ["[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}Z"
    "[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}.[0-9]+Z"],
   :rdf/type   :qudt.datatype/DateTimeStringEncodingType,
   :rdfs/label "ISO 8601 UTC Date Time - Basic Format"})

(def IconicCue
  "Iconic enumeration literal"
  {:db/ident         :qudt.datatype/IconicCue,
   :owl/disjointWith [:qudt.datatype/VisualCue :qudt.datatype/KinestheticCue :qudt.datatype/AuralCue],
   :rdf/type         [:sh/NodeShape :owl/Class],
   :rdfs/label       "Iconic enumeration literal",
   :rdfs/subClassOf  :qudt.datatype/ModalCue,
   :sh/property      :qudt.datatype/IconicCue-image})

(def IconicCue-image
  {:db/ident    :qudt.datatype/IconicCue-image,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/image})

(def IconicCueEnumeration-defaultValue
  {:db/ident :qudt.datatype/IconicCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/IconicCue,
   :sh/path  :qudt.datatype/defaultValue})

(def ImperialUnit
  "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/ImperialUnit,
   :dcterms/description
   "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."})

(def InBook
  "Pub inbook type"
  {:db/ident      :qudt.datatype/InBook,
   :dtype/literal "inbook",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub inbook type"})

(def InCollection
  "Pub incollection type"
  {:db/ident      :qudt.datatype/InCollection,
   :dtype/literal "incollection",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub incollection type"})

(def InProceedings
  "Pub inproceedings type"
  {:db/ident      :qudt.datatype/InProceedings,
   :dtype/literal "inproceedings",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub inproceedings type"})

(def InertialCoordinateFrame
  "A \"Coordinate Frame\"."
  {:db/ident            :qudt.datatype/InertialCoordinateFrame,
   :dcterms/description "A \"Coordinate Frame\".",
   :owl/equivalentClass :qudt.datatype/NonRotatingInertialFrame,
   :rdf/type            [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Inertial Coordinate Frame",
   :rdfs/subClassOf     [{:owl/hasValue   :qudt.type/FT_NON-ROTATING,
                          :owl/onProperty :qudt.datatype/frameType,
                          :rdf/type       :owl/Restriction}
                         :qudt.datatype/InertialReferenceFrame],
   :sh/property         :qudt.datatype/InertialCoordinateFrame-frameType})

(def InertialCoordinateFrame-frameType
  {:db/ident    :qudt.datatype/InertialCoordinateFrame-frameType,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue :qudt.type/FT_NON-ROTATING,
   :sh/path     :qudt.datatype/frameType})

(def InertialReferenceFrame
  "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/InertialReferenceFrame,
   :dcterms/description
   "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Inertial reference frame",
   :rdfs/subClassOf :qudt.datatype/ReferenceFrame})

(def IntegerDatatype
  "An Integer Type is a data type that specifies how integer numbers are represented and stored in machine memory."
  {:db/ident :qudt.datatype/IntegerDatatype,
   :dcterms/description
   "An Integer Type is a data type that specifies how integer numbers are represented and stored in machine memory.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Integer Datatype",
   :rdfs/subClassOf [:qudt.datatype/OrdinalType :qudt.datatype/NumericType]})

(def IntegerEncodingType
  "The encoding scheme for integer types"
  {:db/ident            :qudt.datatype/IntegerEncodingType,
   :dcterms/description "The encoding scheme for integer types",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Integer Encoding",
   :rdfs/subClassOf     :qudt.datatype/Encoding})

(def IntegerList
  "Integer list"
  {:db/ident        :qudt.datatype/IntegerList,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Integer list",
   :rdfs/subClassOf :qudt.datatype/List,
   :sh/property     [:qudt.datatype/IntegerList-rest :qudt.datatype/IntegerList-first]})

(def IntegerList-first
  {:db/ident    :qudt.datatype/IntegerList-first,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/path     :rdf/first})

(def IntegerList-rest
  {:db/ident :qudt.datatype/IntegerList-rest,
   :rdf/type :sh/PropertyShape,
   :sh/path  :rdf/rest})

(def IntegerVector
  "Integer vector"
  {:db/ident        :qudt.datatype/IntegerVector,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Integer vector",
   :rdfs/subClassOf :qudt.datatype/Vector,
   :sh/property     [:qudt.datatype/IntegerList-rest :qudt.datatype/IntegerList-first]})

(def InterpolatedTable
  "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/InterpolatedTable,
   :dcterms/description
   "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Interpolated Table Type",
   :rdfs/subClassOf [:qudt.datatype/TableType :qudt.datatype/Table]})

(def KinestheticCue
  "Kinesthetic Cue"
  {:db/ident        :qudt.datatype/KinestheticCue,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Kinesthetic Cue",
   :rdfs/subClassOf :qudt.datatype/ModalCue,
   :sh/property     :qudt.datatype/KinestheticCue-code})

(def KinestheticCue-code
  {:db/ident    :qudt.datatype/KinestheticCue-code,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/code})

(def KinestheticCueEnumeration-defaultValue
  {:db/ident :qudt.datatype/KinestheticCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/KinestheticCue,
   :sh/path  :qudt.datatype/defaultValue})

(def LIST
  "LIST"
  {:db/ident   :qudt.datatype/LIST,
   :rdf/type   :qudt.datatype/List,
   :rdfs/label "LIST"})

(def LargeObject
  "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data."
  {:db/ident :qudt.datatype/LargeObject,
   :dcterms/description
   "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Large object",
   :rdfs/subClassOf :qudt.datatype/CompositeDatatype})

(def LargeObjectType
  "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data."
  {:db/ident :qudt.datatype/LargeObjectType,
   :dcterms/description
   "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data.",
   :rdf/type :owl/Class,
   :rdfs/label "Large object",
   :rdfs/subClassOf :qudt.datatype/CompositeDatatype})

(def LimitType
  "Limit type"
  {:db/ident        :qudt.datatype/LimitType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Limit type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def List
  "A sub-type of 'Collection Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/List,
   :dcterms/description
   "A sub-type of 'Collection Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "List",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt.datatype/List,
                      :owl/onProperty    :rdf/rest,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/Datatype,
                      :owl/onProperty    :rdf/first,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/Collection]})

(def List-first
  {:db/ident :qudt.datatype/List-first,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/Datatype,
   :sh/path  :rdf/first})

(def List-rest
  {:db/ident :qudt.datatype/List-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/List,
   :sh/path  :rdf/rest})

(def ListType
  "List type"
  {:db/ident        :qudt.datatype/ListType,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "List type",
   :rdfs/subClassOf :qudt.datatype/CollectionType,
   :sh/property     [:qudt.datatype/List-rest :qudt.datatype/List-first]})

(def LittleEndian
  "Little Endian"
  {:db/ident      :qudt.datatype/LittleEndian,
   :dtype/literal "little",
   :rdf/type      :qudt.datatype/EndianType,
   :rdfs/label    "Little Endian"})

(def LocalCoordinateSystem
  "A \"Trajectory Coordinate System\" with the following instance(s): \"Local vertical curvilinear coordinate system\", \"Local vertical local horizontal coordinate system\", \"Vehicle centered local vertical curvilinear coordinate system\"."
  {:db/ident :qudt.datatype/LocalCoordinateSystem,
   :dcterms/description
   "A \"Trajectory Coordinate System\" with the following instance(s): \"Local vertical curvilinear coordinate system\", \"Local vertical local horizontal coordinate system\", \"Vehicle centered local vertical curvilinear coordinate system\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Local Coordinate System Type",
   :rdfs/subClassOf :qudt.datatype/TrajectoryCoordinateSystem})

(def LongIntegerType
  "A Long Integer is an integer that can be represented in four octets (32 bits) of machine memory. Long integers may be signed or unsigned."
  {:db/ident :qudt.datatype/LongIntegerType,
   :dcterms/description
   "A Long Integer is an integer that can be represented in four octets (32 bits) of machine memory. Long integers may be signed or unsigned.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Long Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   4,
                      :owl/onProperty :qudt.datatype/octets,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   32,
                      :owl/onProperty :qudt.datatype/bits,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/IntegerDatatype],
   :sh/property :qudt.datatype/LongIntegerType-octets})

(def LongIntegerType-octets
  {:db/ident    :qudt.datatype/LongIntegerType-octets,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue 4,
   :sh/or       :qudt.datatype/IntegerUnionList,
   :sh/path     :qudt.datatype/octets})

(def LongUnsignedIntegerEncoding
  "Long Unsigned Integer Encoding"
  {:db/ident   :qudt.datatype/LongUnsignedIntegerEncoding,
   :qudt.datatype/bytes 8,
   :rdf/type   :qudt.datatype/IntegerEncodingType,
   :rdfs/label "Long Unsigned Integer Encoding"})

(def LowToHigh
  "Low To High"
  {:db/ident      :qudt.datatype/LowToHigh,
   :dtype/literal "low",
   :rdf/type      :qudt.datatype/MemoryOrderType,
   :rdfs/label    "Low To High"})

(def LunarCoordinateSystem
  "Two slightly different coordinate frames are commonly used to define the orientation of the axes of a lunar body-fixed coordinate system: a mean Earth/rotation frame and a principal axis coordinate frame. The mean Earth/rotation frame (sometimes called the \"Mean Earth/polar axis\" frame) is a lunar body-fixed coordinate frame with the X-axis aligned with the mean direction from the Moon to the Earth and the Z-axis aligned with the mean axis of rotation of the Moon. The principal axis frame is a lunar body-fixed coordinate frame aligned with the principal axes of the Moon. Due to the fact that the Moon is synchronously rotating but is not exactly symmetric, the principal axes and the mean Earth/rotation axes of the Moon do not coincide."
  {:db/ident :qudt.datatype/LunarCoordinateSystem,
   :dcterms/description
   "Two slightly different coordinate frames are commonly used to define the orientation of the axes of a lunar body-fixed coordinate system: a mean Earth/rotation frame and a principal axis coordinate frame. The mean Earth/rotation frame (sometimes called the \"Mean Earth/polar axis\" frame) is a lunar body-fixed coordinate frame with the X-axis aligned with the mean direction from the Moon to the Earth and the Z-axis aligned with the mean axis of rotation of the Moon. The principal axis frame is a lunar body-fixed coordinate frame aligned with the principal axes of the Moon. Due to the fact that the Moon is synchronously rotating but is not exactly symmetric, the principal axes and the mean Earth/rotation axes of the Moon do not coincide.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Lunar Coordinate System",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/realization,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/xAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/zAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/hasValue   :qudt.type/CC_MoonCentered,
                      :owl/onProperty :qudt.datatype/coordinateCenter,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/TrajectoryCoordinateSystem
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/yAxisDefinition,
                      :rdf/type        :owl/Restriction}],
   :sh/property [:qudt.datatype/LunarCoordinateSystem-yAxisDefinition
                 :qudt.datatype/LunarCoordinateSystem-xAxisDefinition
                 :qudt.datatype/LunarCoordinateSystem-zAxisDefinition
                 :qudt.datatype/LunarCoordinateSystem-realization
                 :qudt.datatype/LunarCoordinateSystem-coordinateCenter]})

(def LunarCoordinateSystem-coordinateCenter
  {:db/ident    :qudt.datatype/LunarCoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/CoordinateCenterType,
   :sh/hasValue :qudt.type/CC_MoonCentered,
   :sh/path     :qudt.datatype/coordinateCenter})

(def LunarCoordinateSystem-realization
  {:db/ident    :qudt.datatype/LunarCoordinateSystem-realization,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/realization})

(def LunarCoordinateSystem-xAxisDefinition
  {:db/ident    :qudt.datatype/LunarCoordinateSystem-xAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/xAxisDefinition})

(def LunarCoordinateSystem-yAxisDefinition
  {:db/ident    :qudt.datatype/LunarCoordinateSystem-yAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/yAxisDefinition})

(def LunarCoordinateSystem-zAxisDefinition
  {:db/ident    :qudt.datatype/LunarCoordinateSystem-zAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/zAxisDefinition})

(def MASS-PROPERTIES-ARRAY
  "MASS PROPERTIES ARRAY"
  {:db/ident   :qudt.datatype/MASS-PROPERTIES-ARRAY,
   :rdf/type   :qudt.datatype/MassPropertiesArrayType,
   :rdfs/label "MASS PROPERTIES ARRAY"})

(def MATRIX
  "MATRIX"
  {:db/ident   :qudt.datatype/MATRIX,
   :rdf/type   :qudt.datatype/MatrixType,
   :rdfs/label "MATRIX"})

(def MATRIX-TYPE_2x4
  "Matrix type 2x4"
  {:db/ident            :qudt.datatype/MATRIX-TYPE_2x4,
   :qudt.datatype/byRow          true,
   :qudt.datatype/columns        4,
   :qudt.datatype/dimensionVector :qudt.datatype/DV_2x4,
   :qudt.datatype/dimensionality 2,
   :qudt.datatype/rows           [4 2],
   :rdf/type            :qudt.datatype/MatrixType,
   :rdfs/label          "Matrix type  2x4"})

(def MKS-Unit
  "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/MKS-Unit,
   :dcterms/description
   "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."})

(def MULTi-DIMENSIONAL-ARRAY
  "MULTI-DIMENSIONAL ARRAY"
  {:db/ident   :qudt.datatype/MULTi-DIMENSIONAL-ARRAY,
   :rdf/type   :qudt.datatype/MultiDimensionalArrayType,
   :rdfs/label "MULTI-DIMENSIONAL ARRAY"})

(def MajorMinorType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/MajorMinorType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :owl/oneOf [:qudt.type/Minor :qudt.type/Major],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Major minor type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def Manual
  "Pub manual type"
  {:db/ident      :qudt.datatype/Manual,
   :dtype/literal "manual",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub manual type"})

(def Map
  "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident         :qudt.datatype/Map,
   :dcterms/description
   "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt.datatype/AssociativeArray,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Map Type",
   :rdfs/subClassOf  :qudt.datatype/Collection})

(def MapType
  "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident        :qudt.datatype/MapType,
   :dcterms/description
   "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt.datatype/AssociativeArrayType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Map Type",
   :rdfs/subClassOf :qudt.datatype/CollectionType})

(def MarsCoordinateSystem
  "A \"Trajectory Coordinate System\" with the following instance(s): \"Mars mean equator and IAU-Node of epoch\", \"Mars mean equator and prime meridian body-fixed\"."
  {:db/ident :qudt.datatype/MarsCoordinateSystem,
   :dcterms/description
   "A \"Trajectory Coordinate System\" with the following instance(s): \"Mars mean equator and IAU-Node of epoch\", \"Mars mean equator and prime meridian body-fixed\".",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Mars Coordinate System Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/CC_MarsCentered,
                      :owl/onProperty :qudt.datatype/coordinateCenter,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/TrajectoryCoordinateSystem],
   :sh/property :qudt.datatype/MarsCoordinateSystem-coordinateCenter})

(def MarsCoordinateSystem-coordinateCenter
  {:db/ident    :qudt.datatype/MarsCoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/CoordinateCenterType,
   :sh/hasValue :qudt.type/CC_MarsCentered,
   :sh/path     :qudt.datatype/coordinateCenter})

(def MassPropertiesArray
  "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties."
  {:db/ident :qudt.datatype/MassPropertiesArray,
   :dcterms/description
   "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Mass Properties Array Type",
   :rdfs/subClassOf :qudt.datatype/Array})

(def MassPropertiesArrayType
  "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties."
  {:db/ident :qudt.datatype/MassPropertiesArrayType,
   :dcterms/description
   "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties.",
   :rdf/type :owl/Class,
   :rdfs/label "Mass Properties Array Type",
   :rdfs/subClassOf :qudt.datatype/ArrayType})

(def MathsFunctionType
  "A sub-type of 'QUDT Concept'. Detailed description to be provided in a future version."
  {:db/ident :qudt.datatype/MathsFunctionType,
   :dcterms/description
   "A sub-type of 'QUDT Concept'. Detailed description to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Maths Function Type",
   :rdfs/subClassOf :qudt.datatype/Concept})

(def Matrix
  "A Matrix Type is a data type that specifies the properties of data structures that hold matricies."
  {:db/ident :qudt.datatype/Matrix,
   :dcterms/description
   "A Matrix Type is a data type that specifies the properties of data structures that hold matricies.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Matrix Type",
   :rdfs/subClassOf :qudt.datatype/MultiDimensionalArray})

(def MatrixType
  "Matrix Type"
  {:db/ident        :qudt.datatype/MatrixType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Matrix Type",
   :rdfs/subClassOf :qudt.datatype/MultiDimensionalArrayType})

(def MemoryOrderType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/MemoryOrderType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :owl/oneOf [:qudt.type/HighToLow :qudt.type/LowToHigh],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Memory order type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def Misc
  "Pub misc type"
  {:db/ident      :qudt.datatype/Misc,
   :dtype/literal "misc",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub misc type"})

(def ModalCue
  "Modal Cue"
  {:db/ident        :qudt.datatype/ModalCue,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Modal Cue",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue,
   :sh/property     :qudt.datatype/ModalCue-duration})

(def ModalCue-duration
  {:db/ident    :qudt.datatype/ModalCue-duration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/duration})

(def ModalEnumeration
  "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/ModalEnumeration,
   :dcterms/description
   "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Modal Enumeration",
   :rdfs/subClassOf [{:owl/allValuesFrom "http://qudt.org/schema/type#ModalCue",
                      :owl/onProperty    :qudt.datatype/defaultValue,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/Enumeration],
   :sh/property :qudt.datatype/ModalEnumeration-defaultValue})

(def ModalEnumeration-defaultValue
  {:db/ident :qudt.datatype/ModalEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/ModalCue,
   :sh/path  :qudt.datatype/defaultValue})

(def MultiDimensionalArray
  "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions."
  {:db/ident :qudt.datatype/MultiDimensionalArray,
   :dcterms/description
   "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi Dimensional Array Type",
   :rdfs/subClassOf :qudt.datatype/Array})

(def MultiDimensionalArrayType
  "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions."
  {:db/ident :qudt.datatype/MultiDimensionalArrayType,
   :dcterms/description
   "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions.",
   :rdf/type :owl/Class,
   :rdfs/label "Multi Dimensional Array Type",
   :rdfs/subClassOf :qudt.datatype/ArrayType})

(def MultiDimensionalDataFormat
  "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF."
  {:db/ident :qudt.datatype/MultiDimensionalDataFormat,
   :dcterms/description
   "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi dimensional data format",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#descriptor",
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/CompositeDatatype]})

(def MultiDimensionalDataFormat-descriptor
  {:db/ident    :qudt.datatype/MultiDimensionalDataFormat-descriptor,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/descriptor})

(def MultiDimensionalDataFormatType
  "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF."
  {:db/ident :qudt.datatype/MultiDimensionalDataFormatType,
   :dcterms/description
   "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Multi Dimensional Data Format Type",
   :rdfs/subClassOf :qudt.datatype/CompositeDatatype,
   :sh/property :qudt.datatype/MultiDimensionalDataFormat-descriptor})

(def MultiModalEnumeration
  "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/MultiModalEnumeration,
   :dcterms/description
   "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi modal enumeration",
   :rdfs/subClassOf
   [{:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#iconicCueEnumeration",
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#visualCueEnumeration",
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty "http://qudt.org/schema/type#kinestheticCueEnumeration",
     :rdf/type :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#auralCueEnumeration",
     :rdf/type           :owl/Restriction}
    :qudt.datatype/Enumeration
    {:owl/allValuesFrom :qudt.datatype/ModalEnumeration,
     :owl/onProperty    "http://qudt.org/schema/type#modalCueEnumeration",
     :rdf/type          :owl/Restriction}],
   :sh/property [:qudt.datatype/MultiModalEnumeration-kinestheticCueEnumeration
                 :qudt.datatype/MultiModalEnumeration-iconicCueEnumeration
                 :qudt.datatype/MultiModalEnumeration-visualCueEnumeration
                 :qudt.datatype/MultiModalEnumeration-modalCueEnumeration
                 :qudt.datatype/MultiModalEnumeration-auralCueEnumeration]})

(def MultiModalEnumeration-auralCueEnumeration
  {:db/ident    :qudt.datatype/MultiModalEnumeration-auralCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/auralCueEnumeration})

(def MultiModalEnumeration-iconicCueEnumeration
  {:db/ident    :qudt.datatype/MultiModalEnumeration-iconicCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/iconicCueEnumeration})

(def MultiModalEnumeration-kinestheticCueEnumeration
  {:db/ident    :qudt.datatype/MultiModalEnumeration-kinestheticCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/kinestheticCueEnumeration})

(def MultiModalEnumeration-modalCueEnumeration
  {:db/ident :qudt.datatype/MultiModalEnumeration-modalCueEnumeration,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/ModalEnumeration,
   :sh/path  :qudt.datatype/modalCueEnumeration})

(def MultiModalEnumeration-visualCueEnumeration
  {:db/ident    :qudt.datatype/MultiModalEnumeration-visualCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/visualCueEnumeration})

(def MultiModalType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/MultiModalType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi Modal Type",
   :rdfs/subClassOf
   [{:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#kinestheticCue",
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     "http://qudt.org/schema/type#modalCue",
     :owl/someValuesFrom "http://qudt.org/schema/type#ModalCue",
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#iconicCue",
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#visualCue",
     :rdf/type           :owl/Restriction}
    :qudt.datatype/EnumeratedValue
    {:owl/allValuesFrom "http://qudt.org/schema/type#ModalCue",
     :owl/onProperty    "http://qudt.org/schema/type#modalCue",
     :rdf/type          :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#auralCue",
     :rdf/type           :owl/Restriction}],
   :sh/property [:qudt.datatype/MultiModalType-visualCue
                 :qudt.datatype/MultiModalType-kinestheticCue
                 :qudt.datatype/MultiModalType-modalCue
                 :qudt.datatype/MultiModalType-auralCue
                 :qudt.datatype/MultiModalType-iconicCue]})

(def MultiModalType-auralCue
  {:db/ident    :qudt.datatype/MultiModalType-auralCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/auralCue})

(def MultiModalType-iconicCue
  {:db/ident    :qudt.datatype/MultiModalType-iconicCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/iconicCue})

(def MultiModalType-kinestheticCue
  {:db/ident    :qudt.datatype/MultiModalType-kinestheticCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/kinestheticCue})

(def MultiModalType-modalCue
  {:db/ident :qudt.datatype/MultiModalType-modalCue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/ModalCue,
   :sh/path  :qudt.datatype/modalCue})

(def MultiModalType-visualCue
  {:db/ident    :qudt.datatype/MultiModalType-visualCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/visualCue})

(def MultiSet
  "A bag is a set in which elements may be repeated."
  {:db/ident        :qudt.datatype/MultiSet,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A bag is a set in which elements may be repeated.",
   :rdfs/label      "Bag",
   :rdfs/subClassOf :qudt.datatype/Collection})

(def N-Tuple
  "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year."
  {:db/ident :qudt.datatype/N-Tuple,
   :dcterms/description
   "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "N-Tuple Type",
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty     :qudt.datatype/elementType,
                      :rdf/type           :owl/Restriction}
                     :qudt.datatype/Tuple]})

(def N-Tuple-elementType
  {:db/ident    :qudt.datatype/N-Tuple-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/Datatype,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/elementType})

(def N-TupleType
  "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year."
  {:db/ident :qudt.datatype/N-TupleType,
   :dcterms/description
   "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "N-Tuple Type",
   :rdfs/subClassOf :qudt.datatype/TupleType,
   :sh/property :qudt.datatype/N-Tuple-elementType})

(def NUMERIC
  "Numeric"
  {:db/ident           :qudt.datatype/NUMERIC,
   :dtype/literal      "numeric",
   :qudt.datatype/ansiSQLName   "DECIMAL(p,s)",
   :qudt.datatype/odbcName      "SQL_DECIMAL(p,s)",
   :qudt.datatype/oracleSQLName "NUMBER(p,s)",
   :rdf/type           :qudt.datatype/NumericType,
   :rdfs/label         "Numeric"})

(def No
  "No"
  {:db/ident     :qudt.datatype/No,
   :qudt.datatype/literal "N",
   :rdf/type     :qudt.datatype/YesNoType,
   :rdfs/label   "No"})

(def NonModifiableParameter
  "Parameter is fixed, not modifiable."
  {:db/ident     :qudt.datatype/NonModifiableParameter,
   :qudt.datatype/code    "0",
   :qudt.datatype/literal "fixed",
   :rdf/type     :qudt.datatype/ParameterModifiabilityType,
   :rdfs/comment "Parameter is fixed, not modifiable.",
   :rdfs/label   "Non modifiable parameter"})

(def NonRotatingInertialFrame
  "The non-rotating (or \"inertial\") coordinate frames are defined by taking a \"snapshot\" of the orientation of a particular set of right-handed, orthogonal axes at a specific epoch or time. In other words, the non-rotating coordinate frame, however it is defined, is frozen or fixed at a specific time - for all time. These non-rotating coordinate frames are referred to as \"of Epoch\" coordinate frames."
  {:db/ident :qudt.datatype/NonRotatingInertialFrame,
   :dcterms/description
   "The non-rotating (or \"inertial\") coordinate frames are defined by taking a \"snapshot\" of the orientation of a particular set of right-handed, orthogonal axes at a specific epoch or time. In other words, the non-rotating coordinate frame, however it is defined, is frozen or fixed at a specific time - for all time. These non-rotating coordinate frames are referred to as \"of Epoch\" coordinate frames.",
   :owl/equivalentClass :qudt.datatype/InertialCoordinateFrame,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Non Rotating Coordinate Frame",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/FT_NON-ROTATING,
                      :owl/onProperty :qudt.datatype/frameType,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/InertialReferenceFrame],
   :sh/property :qudt.datatype/NonRotatingInertialFrame-frameType})

(def NonRotatingInertialFrame-frameType
  {:db/ident    :qudt.datatype/NonRotatingInertialFrame-frameType,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue :qudt.type/FT_NON-ROTATING,
   :sh/path     :qudt.datatype/frameType})

(def NumericType
  "Numeric data types are data types whose values denote quantities as defined by a mathematical number system. Numeric data types are data types whose values denote quantities (in some mathematical number system)."
  {:db/ident :qudt.datatype/NumericType,
   :dcterms/description
   ["Numeric data types are data types whose values denote quantities as defined by a mathematical number system."
    "Numeric data types are data types whose values denote quantities (in some mathematical number system)."],
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Numeric Type",
   :rdfs/subClassOf [:qudt.datatype/ScalarDatatype
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/signedness,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/SignednessType,
                      :owl/onProperty    :qudt.datatype/signedness,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/accuracy,
                      :rdf/type           :owl/Restriction}],
   :sh/property [:qudt.datatype/NumericType-accuracy :qudt.datatype/NumericType-signedness]})

(def NumericType-accuracy
  {:db/ident    :qudt.datatype/NumericType-accuracy,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/accuracy})

(def NumericType-signedness
  {:db/ident    :qudt.datatype/NumericType-signedness,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/SignednessType,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/signedness})

(def OOST_OFF
  "Off"
  {:db/ident         :qudt.datatype/OOST_OFF,
   :qudt.datatype/code        "0",
   :qudt.datatype/literal     "off",
   :rdf/type         :qudt.datatype/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Off"})

(def OOST_ON
  "On"
  {:db/ident         :qudt.datatype/OOST_ON,
   :qudt.datatype/code        "0",
   :qudt.datatype/literal     "on",
   :rdf/type         :qudt.datatype/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "On"})

(def OOST_ZERO-MEANS-OFF
  "Zero means off"
  {:db/ident         :qudt.datatype/OOST_ZERO-MEANS-OFF,
   :dtype/literal    "zero-means-off",
   :qudt.datatype/inverted    true,
   :rdf/type         :qudt.datatype/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Zero means off"})

(def OOST_ZERO-MEANS-ON
  "Zero means on"
  {:db/ident         :qudt.datatype/OOST_ZERO-MEANS-ON,
   :dtype/literal    "zero-means-on",
   :qudt.datatype/inverted    true,
   :rdf/type         :qudt.datatype/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Zero means on"})

(def OctetEncoding
  "OCTET Encoding"
  {:db/ident   :qudt.datatype/OctetEncoding,
   :qudt.datatype/bytes 1,
   :rdf/type   [:qudt.datatype/ByteEncodingType :qudt.datatype/BooleanEncodingType],
   :rdfs/label "OCTET Encoding"})

(def OctetType
  "An 8 bit unsigned integer"
  {:db/ident            :qudt.datatype/OctetType,
   :dcterms/description "An 8 bit unsigned integer",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Octet Type",
   :rdfs/subClassOf     :qudt.datatype/UnsignedIntegerType})

(def OffOnStateTypeEnumeration
  "A discrete state enumeration whose values are 'off' and 'on'. The 'off' value is encoded as a zero (0) and the 'on' value as a one (1)."
  {:db/ident :qudt.datatype/OffOnStateTypeEnumeration,
   :rdfs/comment
   "A discrete state enumeration whose values are 'off' and 'on'. The 'off' value is encoded as a zero (0) and the 'on' value as a one (1)."})

(def On
  "On"
  {:db/ident         :qudt.datatype/On,
   :qudt.datatype/code        "1",
   :qudt.datatype/literal     "on",
   :rdf/type         :qudt.datatype/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "On"})

(def OnOffStateType
  "On off state type"
  {:db/ident         :qudt.datatype/OnOffStateType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "On off state type",
   :rdfs/subClassOf  :qudt.datatype/DiscreteState})

(def OnOffStateTypeEnumeration
  "A discrete state enumeration whose values are 'off' and 'on'. The 'on' value is encoded as a zero (0) and the 'off' value as a one (1)."
  {:db/ident :qudt.datatype/OnOffStateTypeEnumeration,
   :qudt.datatype/inverted true,
   :rdfs/comment
   "A discrete state enumeration whose values are 'off' and 'on'. The 'on' value is encoded as a zero (0) and the 'off' value as a one (1)."})

(def OneMeansOff
  "One means off"
  {:db/ident         :qudt.datatype/OneMeansOff,
   :qudt.datatype/inverted    true,
   :qudt.datatype/literal     "off",
   :rdf/type         :qudt.datatype/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "One means off"})

(def Open
  "Open"
  {:db/ident     :qudt.datatype/Open,
   :qudt.datatype/code    "1",
   :qudt.datatype/literal "open",
   :rdf/type     :qudt.datatype/OpenCloseStateType,
   :rdfs/label   "Open"})

(def OpenCloseStateType
  "Open Close State Type"
  {:db/ident        :qudt.datatype/OpenCloseStateType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Open Close State Type",
   :rdfs/subClassOf :qudt.datatype/DiscreteState})

(def OrderedCollection
  "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements."
  {:db/ident :qudt.datatype/OrderedCollection,
   :dcterms/description
   "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ordered Collection Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :dtype/ComparisonOperator,
                      :owl/onProperty    :qudt.datatype/orderingRelation,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/OrderedCollection,
                      :owl/onProperty    :rdf/rest,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/Datatype,
                      :owl/onProperty    :rdf/first,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/Collection]})

(def OrderedCollection-first
  {:db/ident :qudt.datatype/OrderedCollection-first,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/Datatype,
   :sh/path  :rdf/first})

(def OrderedCollection-orderingRelation
  {:db/ident    :qudt.datatype/OrderedCollection-orderingRelation,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :dtype/ComparisonOperator,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/orderingRelation})

(def OrderedCollection-rest
  {:db/ident :qudt.datatype/OrderedCollection-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/OrderedCollectionType,
   :sh/path  :rdf/rest})

(def OrderedCollectionType
  "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements."
  {:db/ident :qudt.datatype/OrderedCollectionType,
   :dcterms/description
   "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Ordered Collection Type",
   :rdfs/subClassOf :qudt.datatype/CollectionType,
   :sh/property [:qudt.datatype/OrderedCollection-rest
                 :qudt.datatype/OrderedCollection-orderingRelation
                 :qudt.datatype/OrderedCollection-first]})

(def OrderedTree
  "<p class=\"lm-para\">An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as \\(\\lt\\) or \\(\\gt\\)) that is used to order the nodes.</p>"
  {:db/ident :qudt.datatype/OrderedTree,
   :dcterms/description
   "<p class=\"lm-para\">An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as \\(\\lt\\) or \\(\\gt\\)) that is used to order the nodes.</p>",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ordered Tree Type",
   :rdfs/subClassOf [:qudt.datatype/Tree :qudt.datatype/OrderedCollection]})

(def OrderedTreeType
  "An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as $\\lt$ or $\\gt$) that is used to order the nodes."
  {:db/ident :qudt.datatype/OrderedTreeType,
   :dcterms/description
   "An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as $\\lt$ or $\\gt$) that is used to order the nodes.",
   :rdf/type :owl/Class,
   :rdfs/label "Ordered Tree Type",
   :rdfs/subClassOf [:qudt.datatype/TreeType :qudt.datatype/OrderedCollectionType]})

(def OrdinalType
  "An ordinal data type is a data type that specifies the properties of values that can easily be put in a one to one correspondence with a subset of the natural numbers. Examples include boolean, character, and integer data types."
  {:db/ident :qudt.datatype/OrdinalType,
   :dcterms/description
   "An ordinal data type is a data type that specifies the properties of values that can easily be put in a one to one correspondence with a subset of the natural numbers. Examples include boolean, character, and integer data types.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ordinal Data Type",
   :rdfs/subClassOf :qudt.datatype/ScalarDatatype})

(def Organization
  "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/Organization,
   :dcterms/description
   "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."})

(def PARTIAL-ARRAY
  "PARTIAL ARRAY"
  {:db/ident   :qudt.datatype/PARTIAL-ARRAY,
   :rdf/type   :qudt.datatype/ArrayType,
   :rdfs/label "PARTIAL ARRAY"})

(def PaddingType
  "This describes how unused bits of a field are filled. Unused bits could be set to one or zero. A third option is \"don't care\"."
  {:db/ident :qudt.datatype/PaddingType,
   :dcterms/description
   "This describes how unused bits of a field are filled. Unused bits could be set to one or zero. A third option is \"don't care\".",
   :owl/oneOf
   [:qudt.type/PadWithOnes :qudt.type/PadWithZeros :qudt.type/PadWithAny],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Padding type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def ParameterModifiabilityType
  "An enumeration of literals that signify whether a parameter is modifiable and if so, by whom."
  {:db/ident :qudt.datatype/ParameterModifiabilityType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An enumeration of literals that signify whether a parameter is modifiable and if so, by whom.",
   :rdfs/label "Parameter modifiability type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def Percentage
  "A Scalar Datatype for expressing a dimensionless ratio."
  {:db/ident :qudt.datatype/Percentage,
   :dcterms/description
   "A Scalar Datatype for expressing a dimensionless ratio.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Percentage Type",
   :rdfs/subClassOf :qudt.datatype/NumericType})

(def PhysicalAddress
  "A physical address is a pointer to a memory location. A \"Structured Datatype\"."
  {:db/ident            :qudt.datatype/PhysicalAddress,
   :dcterms/description ["A physical address is a pointer to a memory location."
                         "A \"Structured Datatype\"."],
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Physical Address Type",
   :rdfs/subClassOf     :qudt.datatype/CompositeDatatype})

(def PolarCoordinates
  "A set of variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis."
  {:db/ident :qudt.datatype/PolarCoordinates,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Polar Coordinate System Type",
   :rdfs/subClassOf :qudt.datatype/Coordinates})

(def PolarCoordinatesType
  "A set of variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis."
  {:db/ident :qudt.datatype/PolarCoordinatesType,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis.",
   :rdf/type :owl/Class,
   :rdfs/label "Polar Coordinate System Type",
   :rdfs/subClassOf :qudt.datatype/CoordinateSystemType})

(def Polarity
  "A \"Tagged Enumeration\" with the following instance(s): \"negative\", \"positive\"."
  {:db/ident :qudt.datatype/Polarity,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A \"Tagged Enumeration\" with the following instance(s): \"negative\", \"positive\".",
   :rdfs/label "Polarity",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def PositiveIntegerType
  "Positive Integers are integers that are either non-zero and non-negative."
  {:db/ident         :qudt.datatype/PositiveIntegerType,
   :dcterms/description
   "Positive Integers are integers that are either non-zero and non-negative.",
   :owl/disjointWith :qudt.datatype/SignedIntegerType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt.datatype/IntegerDatatype
                                              :qudt.datatype/UnsignedType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/label       "Positive Integer Type",
   :rdfs/subClassOf  [:qudt.datatype/UnsignedType :qudt.datatype/IntegerDatatype]})

(def PrefixUnit
  "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/PrefixUnit,
   :dcterms/description
   "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."})

(def Proceedings
  "Pub proceedings type"
  {:db/ident      :qudt.datatype/Proceedings,
   :dtype/literal "proceedings",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub proceedings type"})

(def PubEnumeratedType
  "Pub enumerated type"
  {:db/ident        :qudt.datatype/PubEnumeratedType,
   :owl/oneOf       [:qudt.datatype/Article
                     :qudt.datatype/Book
                     :qudt.datatype/InBook
                     :qudt.datatype/InProceedings
                     :qudt.datatype/Proceedings
                     :qudt.datatype/Unpublished
                     :qudt.datatype/TechReport
                     :qudt.datatype/Manual
                     :qudt.datatype/InCollection
                     :qudt.datatype/Conference
                     :qudt.datatype/Booklet
                     :qudt.datatype/Misc],
   :rdf/type        :owl/Class,
   :rdfs/label      "Pub enumerated type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def QuantityKindDimensionVector_SI
  "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/QuantityKindDimensionVector_SI,
   :dcterms/description
   "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."})

(def QuantityValueType
  "A sub-type of 'Dimensional Data Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/QuantityValueType,
   :dcterms/description
   "A sub-type of 'Dimensional Data Type'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Quantity value type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt.datatype/NumericType,
                      :owl/onProperty    :qudt.datatype/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/DimensionalDatatype
                     {:owl/allValuesFrom :qudt.datatype/Unit,
                      :owl/onProperty    :qudt.datatype/elementUnit,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/QuantityType,
                      :owl/onProperty    :qudt.datatype/basis,
                      :rdf/type          :owl/Restriction}],
   :sh/property [:qudt.datatype/QuantityValueType-elementUnit
                 :qudt.datatype/QuantityValueType-basis
                 :qudt.datatype/QuantityValueType-elementType]})

(def QuantityValueType-basis
  {:db/ident :qudt.datatype/QuantityValueType-basis,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/QuantityType,
   :sh/path  :qudt.datatype/basis})

(def QuantityValueType-elementType
  {:db/ident :qudt.datatype/QuantityValueType-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/NumericType,
   :sh/path  :qudt.datatype/elementType})

(def QuantityValueType-elementUnit
  {:db/ident    :qudt.datatype/QuantityValueType-elementUnit,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/Unit,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/elementUnit})

(def RELATIVE-DATETIME
  "Days and time relative to some Epoch"
  {:db/ident      :qudt.datatype/RELATIVE-DATETIME,
   :dcterms/description "Days and time relative to some Epoch",
   :dtype/literal "reldate",
   :qudt.datatype/dimensionality 1,
   :qudt.datatype/encodingDescription "TBD",
   :rdf/type      :qudt.datatype/DateStringType,
   :rdfs/label    "Relative Date And Time"})

(def RN_BINARY-BASE
  "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 2, and then the values of m and e are determined given this choice of base."
  {:db/ident :qudt.datatype/RN_BINARY-BASE,
   :rdf/type :qudt.datatype/RealNumberType,
   :rdfs/comment
   "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 2, and then the values of m and e are determined given this choice of base.",
   :rdfs/label "Real number binary base"})

(def RN_DECIMAL-BASE
  "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 10, and then the values of m and e are determined given this choice of base."
  {:db/ident :qudt.datatype/RN_DECIMAL-BASE,
   :rdf/type :qudt.datatype/RealNumberType,
   :rdfs/comment
   "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 10, and then the values of m and e are determined given this choice of base.",
   :rdfs/label "Real number decminal base"})

(def RawValueTupleMember
  "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version."
  {:db/ident         :qudt.datatype/RawValueTupleMember,
   :dcterms/description
   "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version.",
   :owl/equivalentClass
   {:owl/intersectionOf [:qudt.datatype/TupleMember
                         {:owl/allValuesFrom :qudt.datatype/UnsignedIntegerType,
                          :owl/onProperty    :qudt.datatype/elementType,
                          :rdf/type          :owl/Restriction}],
    :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Raw value tuple member",
   :rdfs/subClassOf  [{:owl/allValuesFrom :qudt.datatype/UnsignedIntegerType,
                       :owl/onProperty    :qudt.datatype/elementType,
                       :rdf/type          :owl/Restriction}
                      :qudt.datatype/TupleMember]})

(def RawValueTupleMember-elementType
  {:db/ident :qudt.datatype/RawValueTupleMember-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/UnsignedIntegerType,
   :sh/path  :qudt.datatype/elementType})

(def RawValueTupleMemberType
  "Raw value tuple member type"
  {:db/ident            :qudt.datatype/RawValueTupleMemberType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt.datatype/TupleMemberType
                                              {:owl/allValuesFrom
                                               :qudt.datatype/UnsignedIntegerType,
                                               :owl/onProperty
                                               :qudt.datatype/elementType,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type            [:sh/NodeShape :owl/Class],
   :rdfs/label          "Raw value tuple member type",
   :rdfs/subClassOf     :qudt.datatype/TupleMemberType,
   :sh/property         :qudt.datatype/RawValueTupleMember-elementType})

(def RealDatatype
  "A real number is represented as a factor, called the mantissa, multiplied by a power (the exponent) of a base. Different bases yield different approximations to real numbers, and conversion between them is limited in accuracy. Four floating-point types are defined in 'IEEE-754 Standard for Binary Floating-Point'. These types are 'single', 'extended single', 'double', and 'extended double'."
  {:db/ident :qudt.datatype/RealDatatype,
   :dcterms/description
   "A real number is represented as a factor, called the mantissa, multiplied by a power (the exponent) of a base. Different bases yield different approximations to real numbers, and conversion between them is limited in accuracy.  Four floating-point types are defined in 'IEEE-754 Standard for Binary Floating-Point'. These types are 'single', 'extended single', 'double', and 'extended double'.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Real Datatype",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/precision,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/maxExponent,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/base,
                      :rdf/type           :owl/Restriction}
                     :qudt.datatype/NumericType],
   :sh/property [:qudt.datatype/RealDatatype-maxExponent
                 :qudt.datatype/RealDatatype-base
                 :qudt.datatype/RealDatatype-precision]})

(def RealDatatype-base
  {:db/ident    :qudt.datatype/RealDatatype-base,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/base})

(def RealDatatype-maxExponent
  {:db/ident    :qudt.datatype/RealDatatype-maxExponent,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/maxExponent})

(def RealDatatype-precision
  {:db/ident    :qudt.datatype/RealDatatype-precision,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/precision})

(def RealDoublePrecisionType
  "A real double precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes. An example of a real double precision data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 8 bytes for storage on 32-bit machine architectures."
  {:db/ident         :qudt.datatype/RealDoublePrecisionType,
   :dcterms/description
   "A real double precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes.\n\nAn example of a real double precision data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 8 bytes for storage on 32-bit machine architectures.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt.datatype/RealDatatype
                                              :qudt.datatype/DoublePrecisionType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Real Double Precision Type",
   :rdfs/subClassOf  [:qudt.datatype/RealDatatype :qudt.datatype/DoublePrecisionType]})

(def RealNumberType
  "This is the class of data values that approximate real numbers in finite precision. Often, such values are expressed in \"mantissa, base, exponent\" form. Any rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. Typically, b is chosen to be either 2 or 10, and then the values of m and e are determined given the choice of base."
  {:db/ident :qudt.datatype/RealNumberType,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "This is the class of data values that approximate real numbers in finite precision. Often, such values are expressed in \"mantissa, base, exponent\" form. Any rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. Typically, b is chosen to be either 2 or 10, and then the values of m and e are determined given the choice of base.",
   :rdfs/label "Real number type",
   :rdfs/subClassOf :qudt.datatype/RealDatatype})

(def RealSinglePrecisionType
  "A real single precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes. An example of a real single precisoin data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 4 bytes for storage on 32-bit machine architectures."
  {:db/ident         :qudt.datatype/RealSinglePrecisionType,
   :dcterms/description
   "A real single precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes. An example of a real single precisoin data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 4 bytes for storage on 32-bit machine architectures.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt.datatype/RealDatatype
                                              :qudt.datatype/SinglePrecisionType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Real Single Precision Type",
   :rdfs/subClassOf  [:qudt.datatype/SinglePrecisionType :qudt.datatype/RealDatatype]})

(def Record
  "A Record Type is a type whose values are records, i.e. aggregates of several items of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels."
  {:db/ident :qudt.datatype/Record,
   :dcterms/description
   "A Record Type is a type whose values are records, i.e. aggregates of several items of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Record Type",
   :rdfs/subClassOf [{:owl/allValuesFrom
                      "http://qudt.org/schema/type#FieldTypeList",
                      :owl/onProperty :qudt.datatype/elementTypeList,
                      :rdf/type :owl/Restriction}
                     :qudt.datatype/CompositeDatatype]})

(def ReferenceDatatype
  "A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer. A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer. [Wikipedia]"
  {:db/ident :qudt.datatype/ReferenceDatatype,
   :dcterms/description
   ["A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer."
    "A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer. [Wikipedia]"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Reference Data Type",
   :rdfs/subClassOf :qudt.datatype/StructuredDatatype})

(def ReferenceFrame
  "A reference frame (or frame of reference) in physics, may refer to a coordinate system or set of axes. The frame serves as the datum to measure the position, orientation, and other properties of objects in it. Reference frame may refer to an observational reference frame tied to the state of motion of an observer. Reference frame may also refer to both an observational reference frame and an attached coordinate system as a unit."
  {:db/ident :qudt.datatype/ReferenceFrame,
   :dcterms/description
   "A reference frame (or frame of reference) in physics, may refer to a coordinate system or set of axes.\nThe frame serves as the datum to measure the position, orientation, and other properties of objects in it.\nReference frame may refer to an observational reference frame tied to the state of motion of an observer. \nReference frame may also refer to both an observational reference frame and an attached coordinate system as a unit.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Reference Frame",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/realization,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/xAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/yAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/yCoordinateDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/zCoordinateDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/zAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     :skos/Concept
                     {:owl/allValuesFrom :qudt.datatype/FrameType,
                      :owl/onProperty    :qudt.datatype/frameType,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/Concept
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/xCoordinateDefinition,
                      :rdf/type        :owl/Restriction}],
   :sh/property [:qudt.datatype/ReferenceFrame-xAxisDefinition
                 :qudt.datatype/ReferenceFrame-realization
                 :qudt.datatype/ReferenceFrame-frameType
                 :qudt.datatype/ReferenceFrame-comment
                 :qudt.datatype/ReferenceFrame-zAxisDefinition
                 :qudt.datatype/ReferenceFrame-xCoordinateDefinition
                 :qudt.datatype/ReferenceFrame-zCoordinateDefinition
                 :qudt.datatype/ReferenceFrame-description
                 :qudt.datatype/ReferenceFrame-yAxisDefinition
                 :qudt.datatype/ReferenceFrame-yCoordinateDefinition]})

(def ReferenceFrame-comment
  {:db/ident    :qudt.datatype/ReferenceFrame-comment,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :vaem/comment})

(def ReferenceFrame-description
  {:db/ident    :qudt.datatype/ReferenceFrame-description,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :vaem/description})

(def ReferenceFrame-frameType
  {:db/ident :qudt.datatype/ReferenceFrame-frameType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/FrameType,
   :sh/path  :qudt.datatype/frameType})

(def ReferenceFrame-realization
  {:db/ident    :qudt.datatype/ReferenceFrame-realization,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/realization})

(def ReferenceFrame-xAxisDefinition
  {:db/ident    :qudt.datatype/ReferenceFrame-xAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/xAxisDefinition})

(def ReferenceFrame-xCoordinateDefinition
  {:db/ident    :qudt.datatype/ReferenceFrame-xCoordinateDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/xCoordinateDefinition})

(def ReferenceFrame-yAxisDefinition
  {:db/ident    :qudt.datatype/ReferenceFrame-yAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/yAxisDefinition})

(def ReferenceFrame-yCoordinateDefinition
  {:db/ident    :qudt.datatype/ReferenceFrame-yCoordinateDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/yCoordinateDefinition})

(def ReferenceFrame-zAxisDefinition
  {:db/ident    :qudt.datatype/ReferenceFrame-zAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/zAxisDefinition})

(def ReferenceFrame-zCoordinateDefinition
  {:db/ident    :qudt.datatype/ReferenceFrame-zCoordinateDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/zCoordinateDefinition})

(def RotatingReferenceFrame
  "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/RotatingReferenceFrame,
   :dcterms/description
   "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Rotating reference frame",
   :rdfs/subClassOf :qudt.datatype/ReferenceFrame})

(def STATE-SPACE-MATRIX
  "STATE SPACE MATRIX"
  {:db/ident   :qudt.datatype/STATE-SPACE-MATRIX,
   :rdf/type   :qudt.datatype/StateSpaceMatrixType,
   :rdfs/label "STATE SPACE MATRIX"})

(def STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-1
  "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"
  {:db/ident      :qudt.datatype/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-1,
   :qudt.datatype/index    1,
   :qudt.datatype/next     :qudt.datatype/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-2,
   :qudt.datatype/order    1,
   :qudt.datatype/previous :rdf/nil,
   :qudt.datatype/type     :qudt.datatype/FLOAT-DP,
   :rdf/type      :qudt.datatype/IndexedCollectionMember,
   :rdfs/label    "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"})

(def STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-2
  "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"
  {:db/ident   :qudt.datatype/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-2,
   :qudt.datatype/next  :qudt.datatype/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-3,
   :qudt.datatype/order 2,
   :qudt.datatype/type  :qudt.datatype/FLOAT-DP,
   :rdf/type   :qudt.datatype/IndexedCollectionMember,
   :rdfs/label "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"})

(def STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-3
  "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"
  {:db/ident   :qudt.datatype/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-3,
   :qudt.datatype/next  :qudt.datatype/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-4,
   :qudt.datatype/order 3,
   :qudt.datatype/type  :qudt.datatype/FLOAT-DP,
   :rdf/type   :qudt.datatype/IndexedCollectionMember,
   :rdfs/label "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"})

(def STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-4
  "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"
  {:db/ident   :qudt.datatype/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-4,
   :qudt.datatype/next  :rdf/nil,
   :qudt.datatype/order 4,
   :qudt.datatype/type  :qudt.datatype/FLOAT-DP,
   :rdf/type   :qudt.datatype/IndexedCollectionMember,
   :rdfs/label "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"})

(def STATE-VECTOR-TYPE-LIST_MASS-PROPERTIES
  "STATE-VECTOR-TYPE-LIST_MASS-PROPERTIES"
  {:db/ident :qudt.datatype/STATE-VECTOR-TYPE-LIST_MASS-PROPERTIES,
   :qudt.datatype/element
   [:qudt.datatype/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-4
    :qudt.datatype/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-3
    :qudt.datatype/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-2
    :qudt.datatype/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-1],
   :rdf/type :qudt.datatype/IndexedList,
   :rdfs/label "STATE-VECTOR-TYPE-LIST_MASS-PROPERTIES"})

(def STATE-VECTOR_MASS-PROPERTIES
  "STATE-VECTOR-MASS-PROPERTIES"
  {:db/ident         :qudt.datatype/STATE-VECTOR_MASS-PROPERTIES,
   :qudt.datatype/objectValue :qudt.datatype/STATE-VECTOR-TYPE-LIST_MASS-PROPERTIES,
   :qudt.datatype/type        :qudt.datatype/StateSpaceVectorType,
   :rdf/type         :qudt.datatype/StateSpaceVectorType,
   :rdfs/label       "STATE-VECTOR-MASS-PROPERTIES"})

(def ScalarDatatype
  {:db/ident        :qudt.datatype/ScalarDatatype,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/rdfsDatatype,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/length,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/bits,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/byteOrder,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/bitOrder,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/bytes,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/Encoding,
                      :owl/onProperty    :qudt.datatype/encoding,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/minInclusive,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/maxInclusive,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/minExclusive,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/encoding,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :rdfs/Datatype,
                      :owl/onProperty    :qudt.datatype/rdfsDatatype,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/maxExclusive,
                      :rdf/type           :owl/Restriction}],
   :sh/property     [:qudt.datatype/ScalarDatatype-rdfsDatatype
                     :qudt.datatype/ScalarDatatype-maxInclusive
                     :qudt.datatype/ScalarDatatype-maxExclusive
                     :qudt.datatype/ScalarDatatype-bitOrder
                     :qudt.datatype/ScalarDatatype-length
                     :qudt.datatype/ScalarDatatype-encoding
                     :qudt.datatype/ScalarDatatype-minExclusive
                     :qudt.datatype/ScalarDatatype-bits
                     :qudt.datatype/ScalarDatatype-byteOrder
                     :qudt.datatype/ScalarDatatype-minInclusive
                     :qudt.datatype/ScalarDatatype-bytes]})

(def ScalarDatatype-bitOrder
  {:db/ident    :qudt.datatype/ScalarDatatype-bitOrder,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/EndianType,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/bitOrder})

(def ScalarDatatype-bits
  {:db/ident    :qudt.datatype/ScalarDatatype-bits,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       :qudt.datatype/IntegerUnionList,
   :sh/path     :qudt.datatype/bits})

(def ScalarDatatype-byteOrder
  {:db/ident    :qudt.datatype/ScalarDatatype-byteOrder,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/EndianType,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/byteOrder})

(def ScalarDatatype-bytes
  {:db/ident    :qudt.datatype/ScalarDatatype-bytes,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       :qudt.datatype/IntegerUnionList,
   :sh/path     :qudt.datatype/bytes})

(def ScalarDatatype-encoding
  {:db/ident    :qudt.datatype/ScalarDatatype-encoding,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/Encoding,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/encoding})

(def ScalarDatatype-length
  {:db/ident    :qudt.datatype/ScalarDatatype-length,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/length})

(def ScalarDatatype-maxExclusive
  {:db/ident         :qudt.datatype/ScalarDatatype-maxExclusive,
   :rdf/type         :sh/PropertyShape,
   :rdfs/isDefinedBy "http://edg.topbraid.solutions/1.0/schema/qudt",
   :sh/maxCount      1,
   :sh/or            :qudt.datatype/NumericUnionList,
   :sh/path          :qudt.datatype/maxExclusive})

(def ScalarDatatype-maxInclusive
  {:db/ident         :qudt.datatype/ScalarDatatype-maxInclusive,
   :rdf/type         :sh/PropertyShape,
   :rdfs/isDefinedBy "http://edg.topbraid.solutions/1.0/schema/qudt",
   :sh/maxCount      1,
   :sh/or            :qudt.datatype/NumericUnionList,
   :sh/path          :qudt.datatype/maxInclusive})

(def ScalarDatatype-minExclusive
  {:db/ident    :qudt.datatype/ScalarDatatype-minExclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       :qudt.datatype/NumericUnionList,
   :sh/path     :qudt.datatype/minExclusive})

(def ScalarDatatype-minInclusive
  {:db/ident    :qudt.datatype/ScalarDatatype-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       :qudt.datatype/NumericUnionList,
   :sh/path     :qudt.datatype/minInclusive})

(def ScalarDatatype-rdfsDatatype
  {:db/ident    :qudt.datatype/ScalarDatatype-rdfsDatatype,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/rdfsDatatype})

(def ScaledUnit
  "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/ScaledUnit,
   :dcterms/description
   "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."})

(def Sequence
  "A \"Structured Datatype\"."
  {:db/ident            :qudt.datatype/Sequence,
   :dcterms/description "A \"Structured Datatype\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Sequence",
   :rdfs/subClassOf     [{:owl/allValuesFrom :qudt.datatype/Sequence,
                          :owl/onProperty    :rdf/rest,
                          :rdf/type          :owl/Restriction}
                         {:owl/allValuesFrom :qudt.datatype/Datatype,
                          :owl/onProperty    :rdf/first,
                          :rdf/type          :owl/Restriction}
                         :qudt.datatype/Collection]})

(def Sequence-first
  {:db/ident :qudt.datatype/Sequence-first,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/Datatype,
   :sh/path  :rdf/first})

(def Sequence-rest
  {:db/ident :qudt.datatype/Sequence-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/SequenceType,
   :sh/path  :rdf/rest})

(def SequenceType
  "A sequence is an enumerated collection of objects in which repetitions are allowed. Like a set, it contains members (also called elements, or terms). The number of elements (possibly infinite) is called the length of the sequence. Unlike a set, order matters, and exactly the same elements can appear multiple times at different positions in the sequence. Formally, a sequence can be defined as a function whose domain is either the set of the natural numbers (for infinite sequences) or the set of the first n natural numbers (for a sequence of finite length n). The position of an element in a sequence is its rank or index; it is the integer from which the element is the image. It depends on the context or of a specific convention, if the first element has index 0 or 1. [Wikipedia]"
  {:db/ident :qudt.datatype/SequenceType,
   :dcterms/description
   "A sequence is an enumerated collection of objects in which repetitions are allowed. Like a set, it contains members (also called elements, or terms). The number of elements (possibly infinite) is called the length of the sequence. Unlike a set, order matters, and exactly the same elements can appear multiple times at different positions in the sequence. Formally, a sequence can be defined as a function whose domain is either the set of the natural numbers (for infinite sequences) or the set of the first n natural numbers (for a sequence of finite length n). The position of an element in a sequence is its rank or index; it is the integer from which the element is the image. It depends on the context or of a specific convention, if the first element has index 0 or 1. [Wikipedia]",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Sequence",
   :rdfs/subClassOf :qudt.datatype/CollectionType,
   :sh/property [:qudt.datatype/Sequence-rest :qudt.datatype/Sequence-first]})

(def Set
  "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics."
  {:db/ident :qudt.datatype/Set,
   :dcterms/description
   "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Set Type",
   :rdfs/subClassOf :qudt.datatype/Collection})

(def SetType
  "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics."
  {:db/ident :qudt.datatype/SetType,
   :dcterms/description
   "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics.",
   :rdf/type :owl/Class,
   :rdfs/label "Set Type",
   :rdfs/subClassOf :qudt.datatype/CollectionType})

(def ShortIntegerType
  "A Short Integer is an integer that can be represented in two octets (16 bits) of machine memory. Short integers may be signed or unsigned."
  {:db/ident :qudt.datatype/ShortIntegerType,
   :dcterms/description
   "A Short Integer is an integer that can be represented in two octets (16 bits) of machine memory. Short integers may be signed or unsigned.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Short Integer Type",
   :rdfs/subClassOf :qudt.datatype/IntegerDatatype})

(def ShortSignedIntegerEncoding
  "Short Signed Integer Encoding"
  {:db/ident   :qudt.datatype/ShortSignedIntegerEncoding,
   :qudt.datatype/bytes 2,
   :rdf/type   :qudt.datatype/IntegerEncodingType,
   :rdfs/label "Short Signed Integer Encoding"})

(def ShortUnsignedIntegerEncoding
  "Short Unsigned Integer Encoding"
  {:db/ident   :qudt.datatype/ShortUnsignedIntegerEncoding,
   :qudt.datatype/bytes 2,
   :rdf/type   [:qudt.datatype/IntegerEncodingType :qudt.datatype/BooleanEncodingType],
   :rdfs/label "Short Unsigned Integer Encoding"})

(def SignedBigIntegerType
  "A Signed Big Integer is a signed integer that can be represented in eight octets (64 bits) of machine memory."
  {:db/ident :qudt.datatype/SignedBigIntegerType,
   :dcterms/description
   "A Signed Big Integer is a signed integer that can be represented in eight octets (64 bits) of machine memory.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Big Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   "-2^{63}",
                      :owl/onProperty :qudt.datatype/minInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   "SI64",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/BigIntegerType
                     :qudt.datatype/SignedIntegerType
                     {:owl/hasValue   "2^{63}-1",
                      :owl/onProperty :qudt.datatype/maxInclusive,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt.datatype/SignedBigIntegerType-minInclusive
                 :qudt.datatype/SignedBigIntegerType-maxInclusive
                 :qudt.datatype/SignedBigIntegerType-literal]})

(def SignedBigIntegerType-literal
  {:db/ident :qudt.datatype/SignedBigIntegerType-literal,
   :rdf/type :sh/PropertyShape,
   :sh/path  :dtype/literal})

(def SignedBigIntegerType-maxInclusive
  {:db/ident :qudt.datatype/SignedBigIntegerType-maxInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    :qudt.datatype/NumericUnionList,
   :sh/path  :qudt.datatype/maxInclusive})

(def SignedBigIntegerType-minInclusive
  {:db/ident :qudt.datatype/SignedBigIntegerType-minInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    [{:sh/datatype :xsd/string}
              {:sh/datatype :xsd/integer}
              {:sh/datatype :xsd/float}
              {:sh/datatype :xsd/decimal}],
   :sh/path  :qudt.datatype/minInclusive})

(def SignedIntegerEncoding
  "Signed Integer Encoding"
  {:db/ident   :qudt.datatype/SignedIntegerEncoding,
   :qudt.datatype/bytes 4,
   :rdf/type   :qudt.datatype/IntegerEncodingType,
   :rdfs/label "Signed Integer Encoding"})

(def SignedIntegerType
  "Signed Integers are integers can take on both positive and negative values."
  {:db/ident         :qudt.datatype/SignedIntegerType,
   :dcterms/description
   "Signed Integers are integers can take on both positive and negative values.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt.datatype/IntegerDatatype
                                              :qudt.datatype/SignedType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Signed Integer Type",
   :rdfs/subClassOf  [:qudt.datatype/SignedType :qudt.datatype/IntegerDatatype]})

(def SignedLongIntegerType
  "A Signed Long Integer is a signed integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt.datatype/SignedLongIntegerType,
   :dcterms/description
   "A Signed Long Integer is a signed integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Long Integer Type",
   :rdfs/subClassOf [:qudt.datatype/LongIntegerType
                     {:owl/hasValue   "2^{31}-1",
                      :owl/onProperty :qudt.datatype/maxInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/SignedIntegerType
                     {:owl/hasValue   "-2^{31}",
                      :owl/onProperty :qudt.datatype/minInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   "UI32",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt.datatype/SignedLongIntegerType-abbreviation
                 :qudt.datatype/SignedLongIntegerType-minInclusive
                 :qudt.datatype/SignedLongIntegerType-maxInclusive]})

(def SignedLongIntegerType-abbreviation
  {:db/ident    :qudt.datatype/SignedLongIntegerType-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/hasValue "SI32",
   :sh/path     :qudt.datatype/abbreviation})

(def SignedLongIntegerType-maxInclusive
  {:db/ident :qudt.datatype/SignedLongIntegerType-maxInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    :qudt.datatype/NumericUnionList,
   :sh/path  :qudt.datatype/maxInclusive})

(def SignedLongIntegerType-minInclusive
  {:db/ident :qudt.datatype/SignedLongIntegerType-minInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    [{:sh/datatype :xsd/string}
              {:sh/datatype :xsd/integer}
              {:sh/datatype :xsd/float}
              {:sh/datatype :xsd/decimal}],
   :sh/path  :qudt.datatype/minInclusive})

(def SignedMediumIntegerType
  "A \"Signed Medium Integers\" is an integer of 24 bits that can take on both positive and negative values."
  {:db/ident         :qudt.datatype/SignedMediumIntegerType,
   :dcterms/description
   "A \"Signed Medium Integers\" is an integer of 24 bits that can take on both positive and negative values.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt.datatype/IntegerDatatype
                                              :qudt.datatype/SignedType
                                              {:owl/hasValue 3,
                                               :owl/onProperty :qudt.datatype/bytes,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type         [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Signed Integer Type",
   :rdfs/subClassOf  [{:owl/hasValue   3,
                       :owl/onProperty :qudt.datatype/bytes,
                       :rdf/type       :owl/Restriction}
                      :qudt.datatype/SignedIntegerType]})

(def SignedShortIntegerType
  "A Signed Short Integer is a signed integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt.datatype/SignedShortIntegerType,
   :dcterms/description
   "A Signed Short Integer is a signed integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Short Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   "SI16",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/SignedIntegerType
                     :qudt.datatype/ShortIntegerType],
   :sh/property :qudt.datatype/SignedShortIntegerType-abbreviation})

(def SignedShortIntegerType-abbreviation
  {:db/ident :qudt.datatype/SignedShortIntegerType-abbreviation,
   :rdf/type :sh/PropertyShape,
   :sh/path  :qudt.datatype/abbreviation})

(def SignedType
  "A signed type is a numeric type that distinguishes between positive and negative numbers using an encoding scheme, such as sign and magnitude, one's compliment, and two's compliment to represent negative numbers."
  {:db/ident :qudt.datatype/SignedType,
   :dcterms/description
   "A signed type is a numeric type that distinguishes between positive and negative numbers using an encoding scheme, such as sign and magnitude, one's compliment, and two's compliment to represent negative numbers.",
   :owl/disjointWith :qudt.datatype/UnsignedType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt.datatype/NumericType
                                              {:owl/hasValue :qudt.type/Signed,
                                               :owl/onProperty :qudt.datatype/signedness,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/Signed,
                      :owl/onProperty :qudt.datatype/signedness,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/NumericType],
   :sh/property :qudt.datatype/SignedType-signedness})

(def SignedType-signedness
  {:db/ident :qudt.datatype/SignedType-signedness,
   :rdf/type :sh/PropertyShape,
   :sh/path  :qudt.datatype/signedness})

(def SignedVariableLengthIntegerType
  "A Signed Variable Length Integer data type defines a data structure for representing signed integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length."
  {:db/ident :qudt.datatype/SignedVariableLengthIntegerType,
   :dcterms/description
   "A Signed Variable Length Integer data type defines a data structure for representing signed integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Variable Length Integer Type",
   :rdfs/subClassOf [:qudt.datatype/VariableLengthIntegerType :qudt.datatype/SignedIntegerType]})

(def SinglePrecisionRealEncoding
  "Single Precision Real Encoding"
  {:db/ident   :qudt.datatype/SinglePrecisionRealEncoding,
   :qudt.datatype/bytes 32,
   :rdf/type   :qudt.datatype/FloatingPointEncodingType,
   :rdfs/label "Single Precision Real Encoding"})

(def SinglePrecisionType
  "A single precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so a single precision data value on a 32-bit machine architecture occupies four bytes of memory."
  {:db/ident :qudt.datatype/SinglePrecisionType,
   :dcterms/description
   "A single precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so a single precision data value on a 32-bit machine architecture occupies four bytes of memory.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Single Precision Type",
   :rdfs/subClassOf :qudt.datatype/NumericType})

(def SplineCalibrator
  "A sub-type of 'Map Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/SplineCalibrator,
   :dcterms/description
   "A sub-type of 'Map Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Spline calibrator",
   :rdfs/subClassOf :qudt.datatype/Map})

(def SplineCalibratorType
  "Spline calibrator type"
  {:db/ident        :qudt.datatype/SplineCalibratorType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Spline calibrator type",
   :rdfs/subClassOf :qudt.datatype/MapType})

(def SplinePoint
  "A sub-type of 'Tuple Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/SplinePoint,
   :dcterms/description
   "A sub-type of 'Tuple Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Spline point",
   :rdfs/subClassOf :qudt.datatype/Tuple})

(def SplinePointType
  "Spline point type"
  {:db/ident        :qudt.datatype/SplinePointType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Spline point type",
   :rdfs/subClassOf :qudt.datatype/TupleType})

(def StandardsUnit
  "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/StandardsUnit,
   :dcterms/description
   "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."})

(def StateSpaceMatrix
  "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant)."
  {:db/ident :qudt.datatype/StateSpaceMatrix,
   :dcterms/description
   "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant). ",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "State Space Matrix Type",
   :rdfs/subClassOf :qudt.datatype/Matrix})

(def StateSpaceMatrixType
  "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant)."
  {:db/ident :qudt.datatype/StateSpaceMatrixType,
   :dcterms/description
   "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant). ",
   :rdf/type :owl/Class,
   :rdfs/label "State Space Matrix Type",
   :rdfs/subClassOf :qudt.datatype/MatrixType})

(def StateSpaceVector
  "A state vector in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded."
  {:db/ident :qudt.datatype/StateSpaceVector,
   :dcterms/description
   "A state vector in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "State Space Vector Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/coordinateSystem,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/CoordinateSystem,
                      :owl/onProperty    :qudt.datatype/coordinateSystem,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/Vector]})

(def StateSpaceVector-coordinateSystem
  {:db/ident    :qudt.datatype/StateSpaceVector-coordinateSystem,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/CoordinateSystem,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/coordinateSystem})

(def StateSpaceVectorType
  "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded."
  {:db/ident :qudt.datatype/StateSpaceVectorType,
   :dcterms/description
   "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "State Space Vector Type",
   :rdfs/subClassOf :qudt.datatype/VectorType,
   :sh/property :qudt.datatype/StateSpaceVector-coordinateSystem})

(def StateVectorType
  "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded."
  {:db/ident :qudt.datatype/StateVectorType,
   :dcterms/description
   "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "State Vector Type",
   :rdfs/subClassOf :qudt.datatype/VectorType})

(def StringEncodingType
  "A \"Encoding\" with the following instance(s): \"UTF-16 String\", \"UTF-8 Encoding\"."
  {:db/ident :qudt.datatype/StringEncodingType,
   :dcterms/description
   "A \"Encoding\" with the following instance(s): \"UTF-16 String\", \"UTF-8 Encoding\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "String Encoding Type",
   :rdfs/subClassOf :qudt.datatype/Encoding})

(def StringList
  "String list"
  {:db/ident        :qudt.datatype/StringList,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "String list",
   :rdfs/subClassOf :qudt.datatype/List,
   :sh/property     [:qudt.datatype/StringList-rest :qudt.datatype/StringList-first]})

(def StringList-first
  {:db/ident    :qudt.datatype/StringList-first,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :rdf/first})

(def StringList-rest
  {:db/ident :qudt.datatype/StringList-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/StringList,
   :sh/path  :rdf/rest})

(def StringType
  "A String Type is a data type that specifies the properties of data structures that hold strings."
  {:db/ident :qudt.datatype/StringType,
   :dcterms/description
   "A String Type is a data type that specifies the properties of data structures that hold strings. ",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "String Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/maxLength,
                      :rdf/type           :owl/Restriction}
                     :qudt.datatype/ScalarDatatype
                     {:owl/cardinality 0,
                      :owl/onProperty  :qudt.datatype/typeMatrix,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/isByteString,
                      :rdf/type           :owl/Restriction}
                     :qudt.datatype/Array
                     {:owl/allValuesFrom :qudt.datatype/CharacterType,
                      :owl/onProperty    :qudt.datatype/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/ArrayType
                     {:owl/hasValue   1,
                      :owl/onProperty :qudt.datatype/dimensionality,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt.datatype/StringType-elementType
                 :qudt.datatype/StringType-dimensionality
                 :qudt.datatype/StringType-maxLength
                 :qudt.datatype/StringType-typeMatrix
                 :qudt.datatype/StringType-isByteString]})

(def StringType-dimensionality
  {:db/ident    :qudt.datatype/StringType-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/path     :qudt.datatype/dimensionality})

(def StringType-elementType
  {:db/ident :qudt.datatype/StringType-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/CharacterType,
   :sh/path  :qudt.datatype/elementType})

(def StringType-isByteString
  {:db/ident    :qudt.datatype/StringType-isByteString,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/isByteString})

(def StringType-maxLength
  {:db/ident    :qudt.datatype/StringType-maxLength,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/maxLength})

(def StringType-typeMatrix
  {:db/ident    :qudt.datatype/StringType-typeMatrix,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 0,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/typeMatrix})

(def StringUTF16
  "String UTF-16 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-16 encoding. UTF-16 is the native internal representation of text in the Microsoft Windows NT/Windows 2000/Windows XP/Windows CE, Qualcomm BREW, and Symbian operating systems; the Java and .NET byte code environments; Mac OS X's Cocoa and Core Foundation frameworks; and the Qt cross-platform graphical widget toolkit."
  {:db/ident :qudt.datatype/StringUTF16,
   :dcterms/description
   "String UTF-16 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-16 encoding. UTF-16 is the native internal representation of text in the Microsoft Windows NT/Windows 2000/Windows XP/Windows CE, Qualcomm BREW, and Symbian operating systems; the Java and .NET byte code environments; Mac OS X's Cocoa and Core Foundation frameworks; and the Qt cross-platform graphical widget toolkit.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "String UTF16 Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.datatype/UTF16-CHAR,
                      :owl/onProperty :qudt.datatype/elementType,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/TextStringType
                     :qudt.datatype/StringType],
   :sh/property :qudt.datatype/StringUTF16-elementType})

(def StringUTF16-elementType
  {:db/ident :qudt.datatype/StringUTF16-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/CharacterType,
   :sh/path  :qudt.datatype/elementType})

(def StringUTF8
  "String UTF-8 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-8 encoding. UTF-8 includes ASCII, otherwise referred to as IA-5 (International Alphabet 5, as standardized by International Organization for Standardization [ISO]) as the first 128 values. The Internet Engineering Task Force (IETF) requires all Internet protocols to identify the encoding used for character data with UTF-8 as at least one supported encoding. The Internet Mail Consortium (IMC) recommends that all e-mail programs must be able to display and create mail using UTF-8."
  {:db/ident :qudt.datatype/StringUTF8,
   :dcterms/description
   "String UTF-8 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-8 encoding. UTF-8 includes ASCII, otherwise referred to as IA-5 (International Alphabet 5, as standardized by International Organization for Standardization [ISO]) as the first 128 values. The Internet Engineering Task Force (IETF) requires all Internet protocols to identify the encoding used for character data with UTF-8 as at least one supported encoding. The Internet Mail Consortium (IMC) recommends that all e-mail programs must be able to display and create mail using UTF-8.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "String UTF8 Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.datatype/UTF8-CHAR,
                      :owl/onProperty :qudt.datatype/elementType,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/TextStringType
                     :qudt.datatype/StringType],
   :sh/property :qudt.datatype/StringUTF8-elementType})

(def StringUTF8-elementType
  {:db/ident :qudt.datatype/StringUTF8-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/CharacterType,
   :sh/path  :qudt.datatype/elementType})

(def StructuredDatatype
  {:db/ident        :qudt.datatype/StructuredDatatype,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/elementType,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/Datatype,
                      :owl/onProperty    :qudt.datatype/elementType,
                      :rdf/type          :owl/Restriction}],
   :sh/property     :qudt.datatype/StructuredDatatype-elementType})

(def StructuredDatatype-elementType
  {:db/ident    :qudt.datatype/StructuredDatatype-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/Datatype,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/elementType})

(def SubjectArea
  "A \"Enumeration Literal\"."
  {:db/ident        :qudt.datatype/SubjectArea,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A \"Enumeration Literal\".",
   :rdfs/label      "Subject Area",
   :rdfs/subClassOf :owl/Thing})

(def Symbol
  "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/Symbol,
   :dcterms/description
   "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."})

(def SystemModifiableParameter
  "Parameter is modifiable by a (computer) system."
  {:db/ident     :qudt.datatype/SystemModifiableParameter,
   :qudt.datatype/code    "1",
   :qudt.datatype/literal "system",
   :rdf/type     :qudt.datatype/ParameterModifiabilityType,
   :rdfs/comment "Parameter is modifiable by a (computer) system.",
   :rdfs/label   "System modifiable parameter"})

(def TABLE-COMPOSITION-EXAMPLE-SUBTREE_1
  "TABLE-COMPOSITION-EXAMPLE-SUBTREE_1"
  {:db/ident   :qudt.datatype/TABLE-COMPOSITION-EXAMPLE-SUBTREE_1,
   :qudt.datatype/node  :qudt.datatype/TIME-SERIES-TABLE-A-2x4,
   :rdf/type   :qudt.datatype/Tree,
   :rdfs/label "TABLE-COMPOSITION-EXAMPLE-SUBTREE_1"})

(def TABLE-COMPOSITION-EXAMPLE-SUBTREE_2
  "TABLE-COMPOSITION-EXAMPLE-SUBTREE_2"
  {:db/ident   :qudt.datatype/TABLE-COMPOSITION-EXAMPLE-SUBTREE_2,
   :qudt.datatype/node  :qudt.datatype/TIME-SERIES-TABLE-B-2x4,
   :rdf/type   :qudt.datatype/Tree,
   :rdfs/label "TABLE-COMPOSITION-EXAMPLE-SUBTREE_2"})

(def TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_1
  "TABLE-COMPOSITION-SUBTREE-1"
  {:db/ident   :qudt.datatype/TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_1,
   :qudt.datatype/order 1,
   :qudt.datatype/value :qudt.datatype/TABLE-COMPOSITION-EXAMPLE-SUBTREE_1,
   :rdf/type   :qudt.datatype/TreeListMember,
   :rdfs/label "TABLE-COMPOSITION-SUBTREE-1"})

(def TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_2
  "TABLE-COMPOSITION-SUBTREE_2"
  {:db/ident   :qudt.datatype/TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_2,
   :qudt.datatype/order 2,
   :qudt.datatype/value :qudt.datatype/TABLE-COMPOSITION-EXAMPLE-SUBTREE_2,
   :rdf/type   :qudt.datatype/IndexedCollectionMember,
   :rdfs/label "TABLE-COMPOSITION-SUBTREE_2"})

(def TABLE-COMPOSTION-SUBTREE-LIST-EXAMPLE_1
  "TABLE-COMPOSTION-SUBTREES-EXAMPLE_1"
  {:db/ident     :qudt.datatype/TABLE-COMPOSTION-SUBTREE-LIST-EXAMPLE_1,
   :qudt.datatype/element [:qudt.datatype/TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_2
                  :qudt.datatype/TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_1],
   :rdf/type     :qudt.datatype/TreeListMember,
   :rdfs/label   "TABLE-COMPOSTION-SUBTREES-EXAMPLE_1"})

(def TABLE-TYPE_2x4
  "Table type 2x4"
  {:db/ident            :qudt.datatype/TABLE-TYPE_2x4,
   :qudt.datatype/byRow          true,
   :qudt.datatype/columns        4,
   :qudt.datatype/dimensionVector :qudt.datatype/DV_2x4,
   :qudt.datatype/dimensionality 2,
   :qudt.datatype/rows           2,
   :rdf/type            :qudt.datatype/TableType,
   :rdfs/label          "Table type  2x4"})

(def TIME
  "Time in hh:mm:ss[Z|(+|-)hh:mm]format."
  {:db/ident          :qudt.datatype/TIME,
   :dcterms/description "Time in hh:mm:ss[Z|(+|-)hh:mm]format.",
   :dtype/literal     "time",
   :qudt.datatype/dimensionality 1,
   :qudt.datatype/rdfsDatatype :xsd/time,
   :rdf/type          :qudt.datatype/TimeStringType,
   :rdfs/label        "TIME"})

(def TRUE
  "True"
  {:db/ident         :qudt.datatype/TRUE,
   :dtype/literal    "true",
   :rdf/type         :qudt.datatype/BooleanTypeEnumeratedValue,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "True"})

(def Table
  "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use."
  {:db/ident :qudt.datatype/Table,
   :dcterms/description
   "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Table Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/byRow,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   2,
                      :owl/onProperty :qudt.datatype/dimensionality,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/rows,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/columns,
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/Array]})

(def Table-byRow
  {:db/ident    :qudt.datatype/Table-byRow,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/byRow})

(def Table-columns
  {:db/ident    :qudt.datatype/Table-columns,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/columns})

(def Table-dimensionality
  {:db/ident    :qudt.datatype/Table-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/dimensionality})

(def Table-rows
  {:db/ident    :qudt.datatype/Table-rows,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/rows})

(def TableType
  "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use."
  {:db/ident :qudt.datatype/TableType,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use.",
   :rdfs/label "Table Type",
   :rdfs/subClassOf :qudt.datatype/ArrayType,
   :sh/property [:qudt.datatype/Table-rows
                 :qudt.datatype/Table-dimensionality
                 :qudt.datatype/Table-columns
                 :qudt.datatype/Table-byRow]})

(def TaggedEnumeration
  "An enumeration where each literal has a tag that is a non-negative integer. These enumerations are likely to have their literals encoded - hence the need for the tag."
  {:db/ident :qudt.datatype/TaggedEnumeration,
   :dcterms/description
   "An enumeration where each literal  has a tag that is a non-negative integer. These enumerations are likely to have their literals encoded - hence the need for the tag.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt.datatype/Enumeration
                                              {:owl/cardinality 1,
                                               :owl/onProperty :dtype/code,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Tagged Enumeration",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :dtype/code,
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/Enumeration],
   :sh/property :qudt.datatype/TaggedEnumeration-code})

(def TaggedEnumeration-code
  {:db/ident    :qudt.datatype/TaggedEnumeration-code,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :dtype/code})

(def TechReport
  "Pub techreport type"
  {:db/ident      :qudt.datatype/TechReport,
   :dtype/literal "techreport",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub techreport type"})

(def Term
  {:db/ident        :qudt.datatype/Term,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :owl/Thing})

(def TextStringType
  "A text string. Encodings can be specified as subclass or in connection to character arrays in Structured Datatypes."
  {:db/ident :qudt.datatype/TextStringType,
   :dcterms/description
   "A text string. Encodings can be specified as subclass or in connection to character arrays in Structured Datatypes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Text String Type",
   :rdfs/subClassOf :qudt.datatype/StringType})

(def Three-Tuple
  "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members."
  {:db/ident :qudt.datatype/Three-Tuple,
   :dcterms/description
   "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Three-Tuple Type",
   :rdfs/subClassOf [{:owl/hasValue   3,
                      :owl/onProperty :qudt.datatype/elementTypeCount,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 3,
                      :owl/onProperty  :qudt.datatype/elementType,
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/N-Tuple]})

(def Three-Tuple-elementType
  {:db/ident    :qudt.datatype/Three-Tuple-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/TupleMemberType,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/elementType})

(def Three-Tuple-elementTypeCount
  {:db/ident    :qudt.datatype/Three-Tuple-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 3,
   :sh/path     :qudt.datatype/elementTypeCount})

(def ThreeBodyRotatingCoordinateSystem
  "The lunar coordinate systems are primarily used when operating in close proximity to the Moon. There are, however, a few additional coordinate systems that are also useful when analyzing (and depicting) trajectories in the vicinity of the Earth-Moon system. They are rotating coordinate systems associated with two different three-body systems: the Sun-Earth-spacecraft system and the Earth-Moon-spacecraft system. The Sun-Earth and Earth-Moon rotating coordinate frames are defined as follows. The pole vector or Z-axis of the coordinate frame is set equal to the instantaneous orbit normal of the secondary (smaller) body about the primary (larger) body and the X-axis is set equal to the vector from the primary body center of mass (CM) to the secondary body CM. The X-axis rotates at a rate equal to the instantaneous rotation rate of the secondary body about the primary body."
  {:db/ident :qudt.datatype/ThreeBodyRotatingCoordinateSystem,
   :dcterms/description
   "The lunar coordinate systems are primarily used when operating in close proximity to the Moon. There are, however, a few additional coordinate systems that are also useful when analyzing (and depicting) trajectories in the vicinity of the Earth-Moon system. They are rotating coordinate systems associated with two different three-body systems: the Sun-Earth-spacecraft system and the Earth-Moon-spacecraft system. The Sun-Earth and Earth-Moon rotating coordinate frames are defined as follows. The pole vector or Z-axis of the coordinate frame is set equal to the instantaneous orbit normal of the secondary (smaller) body about the primary (larger) body and the X-axis is set equal to the vector from the primary body center of mass (CM) to the secondary body CM. The X-axis rotates at a rate equal to the instantaneous rotation rate of the secondary body about the primary body.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Three Body Rotating Coordinate System Type",
   :rdfs/subClassOf :qudt.datatype/AerospaceCoordinateSystem})

(def ThreeTupleType
  "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members."
  {:db/ident :qudt.datatype/ThreeTupleType,
   :dcterms/description
   "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Three-Tuple Type",
   :rdfs/subClassOf :qudt.datatype/N-TupleType,
   :sh/property [:qudt.datatype/Three-Tuple-elementTypeCount
                 :qudt.datatype/Three-Tuple-elementType]})

(def Time
  "The class of data values that denote a point in time. Time values may be encoded in a 12-hour clock or a 24-hour clock, such as 1:35 AM, or 13:35."
  {:db/ident :qudt.datatype/Time,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "The class of data values that denote a point in time. Time values may be encoded in a 12-hour clock or a 24-hour clock, such as 1:35 AM, or 13:35.",
   :rdfs/label "Time",
   :rdfs/subClassOf :qudt.datatype/Scalar,
   :sh/property :qudt.datatype/Time-type})

(def Time-type
  {:db/ident :qudt.datatype/Time-type,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/TimeStringType,
   :sh/path  :qudt.datatype/type})

(def TimeDataType
  "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/TimeDataType,
   :dcterms/description
   "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version.",
   :dtype/value :qudt.datatype/TIME,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Time data type",
   :rdfs/subClassOf [:qudt.datatype/ScalarDatatype :qudt.datatype/Enumeration]})

(def TimeInterval
  "A relative interval that is an increment in time. For example, this is used in time series arrays to express the time point of a vector of values."
  {:db/ident :qudt.datatype/TimeInterval,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A relative interval that is an increment in time. For example, this is used in time series arrays to express the time point of a vector of values.",
   :rdfs/label "Time interval",
   :rdfs/subClassOf :qudt.datatype/Parameter,
   :sh/property :qudt.datatype/TimeInterval-type})

(def TimeInterval-type
  {:db/ident :qudt.datatype/TimeInterval-type,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/TimeStringType,
   :sh/path  :qudt.datatype/type})

(def TimeSeriesArray
  "A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured at successive time intervals. The time intervals may be uniformly or non-uniformly spaced."
  {:db/ident :qudt.datatype/TimeSeriesArray,
   :dcterms/description
   ["A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals."
    "A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured at successive time intervals. The time intervals may be uniformly or non-uniformly spaced."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Time Series Array Type",
   :rdfs/subClassOf
   [{:owl/cardinality 1,
     :owl/onProperty  "http://qudt.org/schema/type#incrementDatatype",
     :rdf/type        :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  "http://qudt.org/schema/type#vector",
     :rdf/type        :owl/Restriction}
    :qudt.datatype/Array
    {:owl/cardinality 1,
     :owl/onProperty  :qudt.datatype/dimensionVector,
     :rdf/type        :owl/Restriction}
    {:owl/allValuesFrom :qudt.datatype/TimeStringType,
     :owl/onProperty    "http://qudt.org/schema/type#incrementDatatype",
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom :qudt.datatype/StateSpaceVector,
     :owl/onProperty    "http://qudt.org/schema/type#vector",
     :rdf/type          :owl/Restriction}]})

(def TimeSeriesArray-dimensionVector
  {:db/ident    :qudt.datatype/TimeSeriesArray-dimensionVector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/IntegerList,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/dimensionVector})

(def TimeSeriesArray-incrementDatatype
  {:db/ident    :qudt.datatype/TimeSeriesArray-incrementDatatype,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/TimeStringType,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/incrementDatatype})

(def TimeSeriesArray-vector
  {:db/ident    :qudt.datatype/TimeSeriesArray-vector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/StateSpaceVectorType,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/vector})

(def TimeSeriesArrayType
  "Time Series Array Type"
  {:db/ident :qudt.datatype/TimeSeriesArrayType,
   :rdf/comment
   "A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured at successive time intervals. The time intervals may be uniformly or non-uniformly spaced.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Time Series Array Type",
   :rdfs/subClassOf :qudt.datatype/ArrayType,
   :sh/property [:qudt.datatype/TimeSeriesArray-vector
                 :qudt.datatype/TimeSeriesArray-incrementDatatype
                 :qudt.datatype/TimeSeriesArray-dimensionVector]})

(def TimeStringType
  "Time takes a number of forms, depending on the units used (e.g., year, day, minute, millisecond, or combinations thereof) and the origin (i.e., time zero) to which the time value is related."
  {:db/ident :qudt.datatype/TimeStringType,
   :dcterms/description
   "Time takes a number of forms, depending on the units used (e.g., year, day, minute, millisecond, or combinations thereof) and the origin (i.e., time zero) to which the time value is related.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Time Type",
   :rdfs/subClassOf [:qudt.datatype/TextStringType :qudt.datatype/DateTimeStringType]})

(def TrajectoryCoordinateSystem
  "A \"Coordinate System\"."
  {:db/ident            :qudt.datatype/TrajectoryCoordinateSystem,
   :dcterms/description "A \"Coordinate System\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Trajectory Coordinate System",
   :rdfs/subClassOf     :qudt.datatype/AerospaceCoordinateSystem})

(def Tree
  "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph."
  {:db/ident :qudt.datatype/Tree,
   :dcterms/description
   "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph.",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Tree_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Tree Type",
   :rdfs/subClassOf :qudt.datatype/Graph})

(def TreeType
  "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph."
  {:db/ident :qudt.datatype/TreeType,
   :dcterms/description
   "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph.",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Tree_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/label "Tree Type",
   :rdfs/subClassOf :qudt.datatype/GraphType})

(def Triplet
  "A \"Tuple\"."
  {:db/ident         :qudt.datatype/Triplet,
   :dcterms/description "A \"Tuple\".",
   :owl/equivalentClass [:qudt.datatype/ThreeTupleType :qudt.datatype/Three-Tuple],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Triplet",
   :rdfs/subClassOf  [:qudt.datatype/ThreeTupleType :qudt.datatype/Three-Tuple]})

(def True
  "true"
  {:db/ident     :qudt.datatype/True,
   :qudt.datatype/code    "1",
   :qudt.datatype/literal "true",
   :rdf/type     :qudt.datatype/BooleanStateType,
   :rdfs/label   "true"})

(def Tuple
  "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple. In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>"
  {:db/ident :qudt.datatype/Tuple,
   :dcterms/description
   "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple.  In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Tuple Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/length,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/elementTypeCount,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/TupleMember,
                      :owl/onProperty    :qudt.datatype/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/CompositeDatatype]})

(def Tuple-elementType
  {:db/ident :qudt.datatype/Tuple-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/TupleMemberType,
   :sh/path  :qudt.datatype/elementType})

(def Tuple-elementTypeCount
  {:db/ident    :qudt.datatype/Tuple-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/elementTypeCount})

(def Tuple-length
  {:db/ident    :qudt.datatype/Tuple-length,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/length})

(def TupleMember
  "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples."
  {:db/ident :qudt.datatype/TupleMember,
   :dcterms/description
   "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Tuple Member Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/orderInStructure,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/ScalarDatatype,
                      :owl/onProperty    :qudt.datatype/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/CompositeDatatype]})

(def TupleMember-elementType
  {:db/ident :qudt.datatype/TupleMember-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/ScalarDatatype,
   :sh/path  :qudt.datatype/elementType})

(def TupleMember-orderInStructure
  {:db/ident    :qudt.datatype/TupleMember-orderInStructure,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt.datatype/orderInStructure})

(def TupleMemberType
  "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples."
  {:db/ident :qudt.datatype/TupleMemberType,
   :dcterms/description
   "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Tuple Member Type",
   :rdfs/subClassOf :qudt.datatype/CompositeDatatype,
   :sh/property [:qudt.datatype/TupleMember-orderInStructure
                 :qudt.datatype/TupleMember-elementType]})

(def TupleType
  "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple. In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>"
  {:db/ident :qudt.datatype/TupleType,
   :dcterms/description
   "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple.  In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Tuple Type",
   :rdfs/subClassOf :qudt.datatype/CompositeDatatype,
   :sh/property
   [:qudt.datatype/Tuple-length :qudt.datatype/Tuple-elementTypeCount :qudt.datatype/Tuple-elementType]})

(def Two-Tuple
  "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples."
  {:db/ident :qudt.datatype/Two-Tuple,
   :dcterms/description
   "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Two-Tuple Type",
   :rdfs/subClassOf [{:owl/hasValue   2,
                      :owl/onProperty :qudt.datatype/elementTypeCount,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 2,
                      :owl/onProperty  :qudt.datatype/elementType,
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/N-Tuple]})

(def Two-Tuple-elementType
  {:db/ident    :qudt.datatype/Two-Tuple-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/elementType})

(def Two-Tuple-elementTypeCount
  {:db/ident    :qudt.datatype/Two-Tuple-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 2,
   :sh/path     :qudt.datatype/elementTypeCount})

(def TwoTupleType
  "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples."
  {:db/ident :qudt.datatype/TwoTupleType,
   :dcterms/description
   "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Two-Tuple Type",
   :rdfs/subClassOf :qudt.datatype/N-TupleType,
   :sh/property [:qudt.datatype/Two-Tuple-elementTypeCount :qudt.datatype/Two-Tuple-elementType]})

(def TypeList
  "A sub-type of 'QUDT Datatype'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/TypeList,
   :dcterms/description
   "A sub-type of 'QUDT Datatype'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Type list",
   :rdfs/subClassOf :qudt.datatype/Datatype})

(def TypeMatrix
  "Members of this class are matrix data structures that describe the datatypes of a class of matrices. That is, the members of this class are matrices with cells that contain datatypes (c.f. type:Datatype) and are used to describe the datatype structure of other matrices."
  {:db/ident :qudt.datatype/TypeMatrix,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "Members of this class are matrix data structures that describe the datatypes of a class of matrices. That is, the members of this class are matrices with cells that contain datatypes (c.f. type:Datatype) and are used to describe the datatype structure of other matrices.",
   :rdfs/label "Type matrix",
   :rdfs/subClassOf :qudt.datatype/MatrixType})

(def TypeVector
  "A Type Vector is a vector whose elements are data types. They are used, for instance, to specify the type of each component of a vector or class of vectors. A Type Vector Type is a further abstraction that specifies the structure of Type Vectors."
  {:db/ident :qudt.datatype/TypeVector,
   :dcterms/description
   "A Type Vector is a vector whose elements are data types. They are used, for instance, to specify the type of each component of a vector or class of vectors. A Type Vector Type is a further abstraction that specifies the structure of Type Vectors.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/comment
   "A Type Vector is a vector whose elements are data types. They are used, for instance, to specify the type of each component of a vector or class of vectors. A <em>Type Vector Type</em> is a further abstraction that specifies the structure of Type Vectors.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label ["Type vector" "Type Vector Type"],
   :rdfs/subClassOf [:qudt.datatype/Vector
                     {:owl/cardinality 1,
                      :owl/onClass     :qudt.datatype/TypeVector,
                      :owl/onProperty  :qudt.datatype/typeVector,
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/VectorType
                     :qudt.datatype/DatatypeStructuredData],
   :sh/property [:qudt.datatype/TypeVector-typeVector
                 :qudt.datatype/TypeVector-type
                 :qudt.datatype/TypeVector-objectValue]})

(def TypeVector-objectValue
  {:db/ident :qudt.datatype/TypeVector-objectValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/IndexedList,
   :sh/path  :qudt.datatype/objectValue})

(def TypeVector-type
  {:db/ident :qudt.datatype/TypeVector-type,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/TypeVector,
   :sh/path  :qudt.datatype/type})

(def TypeVector-typeVector
  {:db/ident    :qudt.datatype/TypeVector-typeVector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/Datatype,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/typeVector})

(def UNARY-FUNCTION
  "This type identifies functions that have exactly one argument."
  {:db/ident           :qudt.datatype/UNARY-FUNCTION,
   :dcterms/description
   "This type identifies functions that have exactly one argument.",
   :qudt.datatype/functionArity 1,
   :rdf/type           :qudt.datatype/FunctionDatatype,
   :rdfs/label         "UNARY-FUNCTION"})

(def UTC-DATETIME
  "UTC is the time-scale maintained by the BIPM, with assistance from the IERS, which forms the basis of a coordinated dissemination of standard frequencies and time signals. It corresponds exactly in rate with the international reference scale of atomic time (TAI) but differs from it by an integer number of seconds. TAI, based on the second (SI), as realized on the rotating geoid, is formed by the BIPM on the basis of clock data supplied by cooperating establishments. It is in the form of a continuous scale, e.g. in days, hours, minutes and seconds from the origin 1 January, 1958 (adopted by the CGPM 1971)."
  {:db/ident :qudt.datatype/UTC-DATETIME,
   :dcterms/description
   "UTC is the time-scale maintained by the BIPM, with assistance from the IERS, which forms the basis of a coordinated dissemination of standard frequencies and time signals. It corresponds exactly in rate with  the international reference scale of atomic time (TAI) but differs from it by an integer number of seconds.  TAI, based on the second (SI), as realized on the rotating geoid, is formed by the BIPM on the basis of clock data supplied by cooperating establishments. It is in the form of a continuous scale, e.g. in days, hours, minutes and seconds from the origin 1 January, 1958 (adopted by the CGPM 1971). ",
   :dtype/literal "utc-date",
   :owl/sameAs :qudt.datatype/DATETIME,
   :qudt.datatype/dimensionality 1,
   :qudt.datatype/encodingDescription
   "YYYY-MM-DDThh:mm:ss[.dd] or YYYY-DDDThh:mm:ss[.dd], where 'YYYY' is the year, 'MM' is the two-digit month, 'DD' is the two-digit day, 'DDD' is the three digit day of year, 'T' is constant, 'hh:mm:ss[.dd]' is the UTC time in hours, minutes, seconds, and optional fractional seconds. As many 'd' characters to the right of the period as required may be used to obtain the required precision. All fields require leading zeros.",
   :qudt.datatype/rdfsDatatype :xsd/dateTime,
   :rdf/type :qudt.datatype/DateStringType,
   :rdfs/label "UTC Date Time"})

(def UTC-DAYTIME
  "UTC DAY TIME"
  {:db/ident            :qudt.datatype/UTC-DAYTIME,
   :dtype/literal       "utc-dayTime",
   :qudt.datatype/dimensionality 1,
   :qudt.datatype/encodingDescription
   "YYYY-DDDThh:mm:ss.ddZ, where each character is an ASCII character using one octet with the following meanings: YYYY = Year in four-character subfield with values 0001-9999, DDD = Day of year in three-character subfield with values 001-365 or -366, T =  Calendar-Time separator, hh = Hour in two-character subfield with values 00-23,  mm = Minute in two-character subfield with values 00-59, ss = Second in two-character subfield with values 00-59 (-58 or -60 during leap seconds), dd = Decimal fraction of second in one- to n-character subfield, each d has values 0-9, and Z = time code terminator (optional)",
   :qudt.datatype/rdfsDatatype   :qudt.datatype/UTC-DayTime,
   :rdf/type            :qudt.datatype/DateStringType,
   :rdfs/label          "UTC DAY TIME"})

(def UTC-DayTime
  "YYYY-DDDThh:mm:ss.ddZ, where each character is an ASCII character using one octet with the following meanings: YYYY = Year in four-character subfield with values 0001-9999, DDD = Day of year in three-character subfield with values 001-365 or -366, T = Calendar-Time separator, hh = Hour in two-character subfield with values 00-23, mm = Minute in two-character subfield with values 00-59, ss = Second in two-character subfield with values 00-59 (-58 or -60 during leap seconds), dd = Decimal fraction of second in one- to n-character subfield, each d has values 0-9, and Z = time code terminator (optional)"
  {:db/ident         :qudt.datatype/UTC-DayTime,
   :dcterms/description
   "YYYY-DDDThh:mm:ss.ddZ, where each character is an ASCII character using one octet with the following meanings: YYYY = Year in four-character subfield with values 0001-9999, DDD = Day of year in three-character subfield with values 001-365 or -366, T =  Calendar-Time separator, hh = Hour in two-character subfield with values 00-23,  mm = Minute in two-character subfield with values 00-59, ss = Second in two-character subfield with values 00-59 (-58 or -60 during leap seconds), dd = Decimal fraction of second in one- to n-character subfield, each d has values 0-9, and Z = time code terminator (optional)",
   :owl/equivalentClass
   {:owl/onDatatype :xsd/string,
    :owl/withRestrictions
    [{:xsd/length 22}
     {:xsd/pattern
      "[0-9]{4}\\\\-[0-9]{3}T[0-9]{2}:[0-9]{2}:[0-9]{2}\\\\.[0-9]{2}Z?"}],
    :rdf/type       :rdfs/Datatype},
   :rdf/type         [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "UTC Day time",
   :rdfs/subClassOf  :xsd/string})

(def UTF16-STRING
  "UTF16 String"
  {:db/ident            :qudt.datatype/UTF16-STRING,
   :dtype/literal       "utf16",
   :qudt.datatype/dimensionality 1,
   :qudt.datatype/elementType    :qudt.datatype/UTF16-CHAR,
   :qudt.datatype/encoding       :qudt.datatype/UTF16-StringEncoding,
   :rdf/type            :qudt.datatype/StringUTF16,
   :rdfs/label          "UTF16 String"})

(def UTF16-StringEncoding
  "UTF-16 String"
  {:db/ident   :qudt.datatype/UTF16-StringEncoding,
   :rdf/type   :qudt.datatype/StringEncodingType,
   :rdfs/label "UTF-16 String"})

(def UTF8-STRING
  "String consisting of UTF-8 characters"
  {:db/ident            :qudt.datatype/UTF8-STRING,
   :dcterms/description "String consisting of UTF-8 characters",
   :dtype/literal       "utf8",
   :owl/sameAs          :qudt.datatype/STRING,
   :qudt.datatype/dimensionality 1,
   :qudt.datatype/elementType    :qudt.datatype/UTF8-CHAR,
   :qudt.datatype/encoding       :qudt.datatype/UTF8-StringEncoding,
   :rdf/type            :qudt.datatype/StringUTF8,
   :rdfs/label          "UTF8 String"})

(def UTF8-StringEncoding
  "UTF-8 Encoding"
  {:db/ident   :qudt.datatype/UTF8-StringEncoding,
   :qudt.datatype/bytes 8,
   :rdf/type   :qudt.datatype/StringEncodingType,
   :rdfs/label "UTF-8 Encoding"})

(def Unpublished
  "Pub unpublished type"
  {:db/ident      :qudt.datatype/Unpublished,
   :dtype/literal "unpublished",
   :rdf/type      :qudt.datatype/PubEnumeratedType,
   :rdfs/label    "Pub unpublished type"})

(def UnsignedBigIntegerType
  "An Unsgned Big Integer is an unsigned integer that can be represented in eight octets (64 bits) of machine memory."
  {:db/ident :qudt.datatype/UnsignedBigIntegerType,
   :dcterms/description
   "An Unsgned Big Integer is an unsigned integer that can be represented in eight octets (64 bits) of machine memory.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Big Integer Type",
   :rdfs/subClassOf [:qudt.datatype/UnsignedIntegerType
                     {:owl/hasValue   "UI64",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   "0",
                      :owl/onProperty :qudt.datatype/minInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/BigIntegerType
                     {:owl/hasValue   "2^{64}-1",
                      :owl/onProperty :qudt.datatype/maxInclusive,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt.datatype/UnsignedBigIntegerType-maxInclusive
                 :qudt.datatype/UnsignedBigIntegerType-abbreviation
                 :qudt.datatype/UnsignedBigIntegerType-minInclusive]})

(def UnsignedBigIntegerType-abbreviation
  {:db/ident    :qudt.datatype/UnsignedBigIntegerType-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "UI64",
   :sh/path     :qudt.datatype/abbreviation})

(def UnsignedBigIntegerType-maxInclusive
  {:db/ident    :qudt.datatype/UnsignedBigIntegerType-maxInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "2^{64}-1",
   :sh/or       :qudt.datatype/NumericUnionList,
   :sh/path     :qudt.datatype/maxInclusive})

(def UnsignedBigIntegerType-minInclusive
  {:db/ident    :qudt.datatype/UnsignedBigIntegerType-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "0",
   :sh/or       [{:sh/datatype :xsd/string}
                 {:sh/datatype :xsd/integer}
                 {:sh/datatype :xsd/float}
                 {:sh/datatype :xsd/decimal}],
   :sh/path     :qudt.datatype/minInclusive})

(def UnsignedIntegerEncoding
  "Unsigned Integer Encoding"
  {:db/ident   :qudt.datatype/UnsignedIntegerEncoding,
   :qudt.datatype/bytes 4,
   :rdf/type   :qudt.datatype/IntegerEncodingType,
   :rdfs/label "Unsigned Integer Encoding"})

(def UnsignedIntegerType
  "Unsgned Integers are integers that are either strictly non-negative or non-positive."
  {:db/ident :qudt.datatype/UnsignedIntegerType,
   :dcterms/description
   "Unsgned Integers are integers that are either strictly non-negative or non-positive.",
   :owl/disjointWith :qudt.datatype/SignedIntegerType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt.datatype/IntegerDatatype
                                              :qudt.datatype/UnsignedType],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Integer Type",
   :rdfs/subClassOf [:qudt.datatype/UnsignedType :qudt.datatype/IntegerDatatype]})

(def UnsignedLongIntegerType
  "An Unsigned Long Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt.datatype/UnsignedLongIntegerType,
   :dcterms/description
   "An Unsigned Long Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Long Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   "UI32",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   "0",
                      :owl/onProperty :qudt.datatype/minInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/UnsignedIntegerType
                     :qudt.datatype/LongIntegerType
                     {:owl/hasValue   "2^{32}-1",
                      :owl/onProperty :qudt.datatype/maxInclusive,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt.datatype/UnsignedLongIntegerType-minInclusive
                 :qudt.datatype/UnsignedLongIntegerType-maxInclusive
                 :qudt.datatype/UnsignedLongIntegerType-literal]})

(def UnsignedLongIntegerType-maxInclusive
  {:db/ident    :qudt.datatype/UnsignedLongIntegerType-maxInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "2^{32}-1",
   :sh/or       :qudt.datatype/NumericUnionList,
   :sh/path     :qudt.datatype/maxInclusive})

(def UnsignedLongIntegerType-minInclusive
  {:db/ident    :qudt.datatype/UnsignedLongIntegerType-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "0",
   :sh/or       [{:sh/datatype :xsd/string}
                 {:sh/datatype :xsd/integer}
                 {:sh/datatype :xsd/float}
                 {:sh/datatype :xsd/decimal}],
   :sh/path     :qudt.datatype/minInclusive})

(def UnsignedMediumIntegerType
  "An \"Unsigned Medium Integers\" is an integer of 24 bits that only takes on both positive values."
  {:db/ident         :qudt.datatype/UnsignedMediumIntegerType,
   :dcterms/description
   "An \"Unsigned Medium Integers\" is an integer of 24 bits that only takes on both positive values.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt.datatype/IntegerDatatype
                                              :qudt.datatype/SignedType],
                         :rdf/type :owl/Class},
   :rdf/type         [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Signed Integer Type",
   :rdfs/subClassOf  [{:owl/hasValue   3,
                       :owl/onProperty :qudt.datatype/bytes,
                       :rdf/type       :owl/Restriction}
                      :qudt.datatype/UnsignedIntegerType]})

(def UnsignedShortIntegerType
  "An Unsigned Short Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt.datatype/UnsignedShortIntegerType,
   :dcterms/description
   "An Unsigned Short Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Short Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   "2^{16}-1",
                      :owl/onProperty :qudt.datatype/maxInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   "UI16",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/ShortIntegerType
                     {:owl/hasValue   "0",
                      :owl/onProperty :qudt.datatype/minInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/UnsignedIntegerType],
   :sh/property [:qudt.datatype/UnsignedShortIntegerType-maxInclusive
                 :qudt.datatype/UnsignedShortIntegerType-minInclusive
                 :qudt.datatype/UnsignedShortIntegerType-abbreviation]})

(def UnsignedShortIntegerType-abbreviation
  {:db/ident    :qudt.datatype/UnsignedShortIntegerType-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "UI16",
   :sh/path     :qudt.datatype/abbreviation})

(def UnsignedShortIntegerType-maxInclusive
  {:db/ident    :qudt.datatype/UnsignedShortIntegerType-maxInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "2^{16}-1",
   :sh/path     :qudt.datatype/maxInclusive})

(def UnsignedShortIntegerType-minInclusive
  {:db/ident    :qudt.datatype/UnsignedShortIntegerType-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "0",
   :sh/path     :qudt.datatype/minInclusive})

(def UnsignedType
  "An unsigned data type is a numeric type that does not distinguish between positive and negative values."
  {:db/ident :qudt.datatype/UnsignedType,
   :dcterms/description
   "An unsigned data type is a numeric type that does not distinguish between positive and negative values.",
   :owl/disjointWith :qudt.datatype/SignedType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt.datatype/NumericType
                                              {:owl/hasValue
                                               :qudt.type/Unsigned,
                                               :owl/onProperty :qudt.datatype/signedness,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/Unsigned,
                      :owl/onProperty :qudt.datatype/signedness,
                      :rdf/type       :owl/Restriction}
                     :qudt.datatype/NumericType],
   :sh/property :qudt.datatype/UnsignedType-signedness})

(def UnsignedType-signedness
  {:db/ident    :qudt.datatype/UnsignedType-signedness,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/SignednessType,
   :sh/hasValue :qudt.datatype/UNSIGNED,
   :sh/path     :qudt.datatype/signedness})

(def UnsignedVariableLengthIntegerType
  "An Unsigned Variable Length Integer data type defines a data structure for representing unsigned integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length."
  {:db/ident :qudt.datatype/UnsignedVariableLengthIntegerType,
   :dcterms/description
   "An Unsigned Variable Length Integer data type defines a data structure for representing unsigned integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Variable Length Integer Type",
   :rdfs/subClassOf [:qudt.datatype/VariableLengthIntegerType
                     :qudt.datatype/UnsignedIntegerType]})

(def UserModifiableParameter
  "Parameter is modifiable by a user."
  {:db/ident     :qudt.datatype/UserModifiableParameter,
   :qudt.datatype/code    "2",
   :qudt.datatype/literal "user",
   :rdf/type     :qudt.datatype/ParameterModifiabilityType,
   :rdfs/comment "Parameter is modifiable by a user.",
   :rdfs/label   "User modifiable parameter"})

(def VECTOR
  "VECTOR"
  {:db/ident   :qudt.datatype/VECTOR,
   :qudt.datatype/dimensionality 1,
   :rdf/type   :qudt.datatype/VectorType,
   :rdfs/label "VECTOR"})

(def VECTOR_3D
  "VECTOR 3D"
  {:db/ident   :qudt.datatype/VECTOR_3D,
   :qudt.datatype/dimensionality 1,
   :qudt.datatype/protocolBuffersName "Vector3D",
   :rdf/type   :qudt.datatype/VectorType,
   :rdfs/label "VECTOR 3D"})

(def VariableIntervalTimeSeriesArray
  "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random."
  {:db/ident :qudt.datatype/VariableIntervalTimeSeriesArray,
   :dcterms/description
   "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Variable Interval Time Series Array Type",
   :rdfs/subClassOf :qudt.datatype/TimeSeriesArray})

(def VariableIntervalTimeSeriesArrayType
  "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random."
  {:db/ident :qudt.datatype/VariableIntervalTimeSeriesArrayType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random.",
   :rdfs/label "Variable Interval Time Series Array Type",
   :rdfs/subClassOf :qudt.datatype/TimeSeriesArrayType})

(def VariableLengthIntegerType
  "A Variable Length Integer data type defines a data structure for representing integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length."
  {:db/ident :qudt.datatype/VariableLengthIntegerType,
   :dcterms/description
   "A Variable Length Integer data type defines a data structure for representing integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Variable Length Integer Type",
   :rdfs/subClassOf [:qudt.datatype/IntegerDatatype
                     {:owl/hasValue   1,
                      :owl/onProperty :qudt.datatype/minBits,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   64,
                      :owl/onProperty :qudt.datatype/maxBits,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt.datatype/VariableLengthIntegerType-maxBits
                 :qudt.datatype/VariableLengthIntegerType-minBits]})

(def VariableLengthIntegerType-maxBits
  {:db/ident    :qudt.datatype/VariableLengthIntegerType-maxBits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 64,
   :sh/path     :qudt.datatype/maxBits})

(def VariableLengthIntegerType-minBits
  {:db/ident    :qudt.datatype/VariableLengthIntegerType-minBits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 1,
   :sh/path     :qudt.datatype/minBits})

(def Vector
  "A Vector Type is a data type that specifies the properties of data structures that hold vectors."
  {:db/ident :qudt.datatype/Vector,
   :dcterms/description
   "A Vector Type is a data type that specifies the properties of data structures that hold vectors.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Vector Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/dimensionality,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt.datatype/referenceFrame,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   1,
                      :owl/onProperty :qudt.datatype/dimensionality,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/dimension,
                      :rdf/type        :owl/Restriction}
                     :qudt.datatype/CompositeDatatype
                     {:owl/allValuesFrom :qudt.datatype/ReferenceFrame,
                      :owl/onProperty    :qudt.datatype/referenceFrame,
                      :rdf/type          :owl/Restriction}]})

(def Vector-dimension
  {:db/ident    :qudt.datatype/Vector-dimension,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/dimension})

(def Vector-dimensionality
  {:db/ident    :qudt.datatype/Vector-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/dimensionality})

(def Vector-referenceFrame
  {:db/ident    :qudt.datatype/Vector-referenceFrame,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/ReferenceFrame,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/referenceFrame})

(def VectorArray
  "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements."
  {:db/ident :qudt.datatype/VectorArray,
   :dcterms/description
   "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Vector Array Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt.datatype/StateSpaceVector,
                      :owl/onProperty    "http://qudt.org/schema/type#vector",
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/Array]})

(def VectorArray-vector
  {:db/ident :qudt.datatype/VectorArray-vector,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/StateSpaceVectorType,
   :sh/path  :qudt.datatype/vector})

(def VectorArrayType
  "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements."
  {:db/ident :qudt.datatype/VectorArrayType,
   :dcterms/description
   "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Vector Array Type",
   :rdfs/subClassOf :qudt.datatype/ArrayType,
   :sh/property :qudt.datatype/VectorArray-vector})

(def VectorType
  "A Vector Type is a data type that specifies the properties of data structures that hold vectors."
  {:db/ident :qudt.datatype/VectorType,
   :dcterms/description
   "A Vector Type is a data type that specifies the properties of data structures that hold vectors.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Vector Type",
   :rdfs/subClassOf :qudt.datatype/CompositeDatatype,
   :sh/property [:qudt.datatype/Vector-referenceFrame
                 :qudt.datatype/Vector-dimensionality
                 :qudt.datatype/Vector-dimension]})

(def VehicleCoordinateSystem
  "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt.datatype/VehicleCoordinateSystem,
   :dcterms/description
   "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Vehicle coordinate system",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt.datatype/AxialOrientationType,
                      :owl/onProperty    :qudt.datatype/rollRotationDefinition,
                      :rdf/type          :owl/Restriction}
                     :qudt.datatype/AerospaceCoordinateSystem
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/pitchRotationDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/AxialOrientationType,
                      :owl/onProperty    :qudt.datatype/yawRotationDefinition,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt.datatype/AxialOrientationType,
                      :owl/onProperty    :qudt.datatype/pitchRotationDefinition,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/yawRotationDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt.datatype/rollRotationDefinition,
                      :rdf/type        :owl/Restriction}],
   :sh/property [:qudt.datatype/VehicleCoordinateSystem-pitchRotationDefinition
                 :qudt.datatype/VehicleCoordinateSystem-yawRotationDefinition
                 :qudt.datatype/VehicleCoordinateSystem-rollRotationDefinition]})

(def VehicleCoordinateSystem-pitchRotationDefinition
  {:db/ident    :qudt.datatype/VehicleCoordinateSystem-pitchRotationDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/AxialOrientationType,
   :sh/maxCount 1,
   :sh/path     :qudt.datatype/pitchRotationDefinition})

(def VehicleCoordinateSystem-rollRotationDefinition
  {:db/ident    :qudt.datatype/VehicleCoordinateSystem-rollRotationDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/AxialOrientationType,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/rollRotationDefinition})

(def VehicleCoordinateSystem-yawRotationDefinition
  {:db/ident    :qudt.datatype/VehicleCoordinateSystem-yawRotationDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt.datatype/AxialOrientationType,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt.datatype/yawRotationDefinition})

(def VisualCue
  "Visual Cue"
  {:db/ident        :qudt.datatype/VisualCue,
   :rdf/type        :owl/Class,
   :rdfs/label      "Visual Cue",
   :rdfs/subClassOf :qudt.datatype/ModalCue})

(def VisualCueEnumeration-defaultValue
  {:db/ident :qudt.datatype/VisualCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt.datatype/VisualCue,
   :sh/path  :qudt.datatype/defaultValue})

(def WDST_DRY
  "Dry"
  {:db/ident         :qudt.datatype/WDST_DRY,
   :dtype/literal    "dry",
   :qudt.datatype/code        "2",
   :rdf/type         :qudt.datatype/WetDryStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Dry"})

(def WDST_WET
  "Wet"
  {:db/ident         :qudt.datatype/WDST_WET,
   :dtype/literal    "wet",
   :qudt.datatype/code        "1",
   :rdf/type         :qudt.datatype/WetDryStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Wet"})

(def WetDryStateType
  "Wet dry state type"
  {:db/ident         :qudt.datatype/WetDryStateType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Wet dry state type",
   :rdfs/subClassOf  [:qudt.datatype/EnumeratedValue :qudt.datatype/DiscreteState]})

(def WordAligned
  "Word Aligned"
  {:db/ident      :qudt.datatype/WordAligned,
   :dtype/literal "word",
   :rdf/type      :qudt.datatype/AlignmentType,
   :rdfs/label    "Word Aligned"})

(def YDT
  "Year Day Time"
  {:db/ident            :qudt.datatype/YDT,
   :dtype/literal       "YDT",
   :qudt.datatype/dimensionality 1,
   :qudt.datatype/encodingDescription "TBD",
   :qudt.datatype/rdfsDatatype   :xsd/string,
   :rdf/type            :qudt.datatype/DateStringType,
   :rdfs/label          "Year Day Time"})

(def Yes
  "Yes"
  {:db/ident     :qudt.datatype/Yes,
   :qudt.datatype/literal "Y",
   :rdf/type     :qudt.datatype/YesNoType,
   :rdfs/label   "Yes"})

(def YesNoType
  "Yes no type"
  {:db/ident        :qudt.datatype/YesNoType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Yes no type",
   :rdfs/subClassOf :qudt.datatype/EnumeratedValue})

(def abbreviation
  "abbreviation"
  {:db/ident         :qudt.datatype/abbreviation,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "abbreviation"})

(def accuracy
  "Accuracy is the degree to which a given quantity is correct and free from error. For example, a quantity specified as 100+/-1 has an (absolute) accuracy of +/-1 (meaning its true value can fall in the range 99-101), while a quantity specified as 100+/-2% has a (relative) accuracy of +/-2% (meaning its true value can fall in the range 98-102). The concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits."
  {:db/ident :qudt.datatype/accuracy,
   :dcterms/description
   "Accuracy is the degree to which a given quantity is correct and free from error. For example, a quantity specified as 100+/-1 has an (absolute) accuracy of +/-1 (meaning its true value can fall in the range 99-101), while a quantity specified as 100+/-2% has a (relative) accuracy of +/-2% (meaning its true value can fall in the range 98-102).\n\nThe concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits. ",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "accuracy",
   :rdfs/range :xsd/integer})

(def alignment
  "alignment"
  {:db/ident         :qudt.datatype/alignment,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "alignment"})

(def allowedPattern
  "This property relates a date string encoding (c.f. type:DateStringEncodingType) to one or more XML Schema compliant regular expressions that together determine the allowed lexical expressions that can be unambiguously parsed to determine a temporal quantity."
  {:db/ident :qudt.datatype/allowedPattern,
   :dcterms/description
   "This property relates a date string encoding (c.f. type:DateStringEncodingType) to one or more XML Schema compliant regular expressions that together determine the allowed lexical expressions that can be unambiguously parsed to determine a temporal quantity.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "allowed pattern",
   :rdfs/range :xsd/string})

(def ansiSQLName
  "ANSI SQL name"
  {:db/ident           :qudt.datatype/ansiSQLName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "ANSI SQL name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def arg1Type
  "This property relates a funciton data type with the type of its arg1."
  {:db/ident           :qudt.datatype/arg1Type,
   :dcterms/description
   "This property relates a funciton data type with the type of its arg1.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "arg1Type",
   :rdfs/subPropertyOf :qudt.datatype/argType})

(def arg2Type
  "This property relates a funciton data type with the type of its arg2."
  {:db/ident           :qudt.datatype/arg2Type,
   :dcterms/description
   "This property relates a funciton data type with the type of its arg2.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "arg2Type",
   :rdfs/subPropertyOf :qudt.datatype/argType})

(def arg3Type
  "This property relates a funciton data type with the type of its arg3."
  {:db/ident           :qudt.datatype/arg3Type,
   :dcterms/description
   "This property relates a funciton data type with the type of its arg3.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "arg3Type",
   :rdfs/subPropertyOf :qudt.datatype/argType})

(def argType
  "This property relates a function data type with the type of one of its arguments."
  {:db/ident           :qudt.datatype/argType,
   :dcterms/description
   "This property relates a function data type with the type of one of its arguments.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "argType",
   :rdfs/subPropertyOf :qudt.datatype/elementType})

(def auralCue
  "aural cue"
  {:db/ident           :qudt.datatype/auralCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "aural cue",
   :rdfs/subPropertyOf :qudt.datatype/modalCue})

(def auralCueEnumeration
  "aural cue enumeration"
  {:db/ident           :qudt.datatype/auralCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "aural cue enumeration",
   :rdfs/subPropertyOf :qudt.datatype/modalCueEnumeration})

(def base
  "base"
  {:db/ident         :qudt.datatype/base,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "base",
   :rdfs/range       :xsd/integer})

(def basis
  "basis"
  {:db/ident         :qudt.datatype/basis,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "basis"})

(def bitOrder
  "bit order"
  {:db/ident         :qudt.datatype/bitOrder,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "bit order",
   :rdfs/range       :qudt.datatype/EndianType})

(def bits
  "bits"
  {:db/ident         :qudt.datatype/bits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "bits",
   :rdfs/range       :xsd/integer})

(def bounded
  "A datatype is bounded if its value space has either a finite upper and lower bound. Either bound may be inclusive or exclusive."
  {:db/ident :qudt.datatype/bounded,
   :dcterms/description
   "A datatype is bounded if its value space has either a finite upper and lower bound. Either bound may be inclusive or exclusive. ",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "bounded",
   :rdfs/range :xsd/boolean})

(def byRow
  "A boolean to specify whether an array is presented row by row or column by column."
  {:db/ident :qudt.datatype/byRow,
   :dcterms/description
   "A boolean to specify whether an array is presented row by row or column by column.",
   :rdf/type [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "by row",
   :rdfs/range :xsd/boolean,
   :vaem/rationale "Replaced with an enumeration. See type:ArrayDataOrderType"})

(def byteOrder
  "Byte order is an enumeration of two values: 'Big Endian' and 'Little Endian' and is used to denote whether the most signiticant byte is either first or last, respectively."
  {:db/ident :qudt.datatype/byteOrder,
   :dcterms/description
   "Byte order is an enumeration of two values: 'Big Endian' and 'Little Endian' and is used to denote whether the most signiticant byte is either first or last, respectively.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "byte order",
   :rdfs/range :qudt.datatype/EndianType})

(def bytes
  "bytes"
  {:db/ident         :qudt.datatype/bytes,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "bytes",
   :rdfs/range       :xsd/integer})

(def cName
  {:db/ident :qudt.datatype/cName,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def cardinality
  "cardinality"
  {:db/ident         :qudt.datatype/cardinality,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "cardinality"})

(def columns
  "columns"
  {:db/ident         :qudt.datatype/columns,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "columns",
   :rdfs/range       :xsd/integer})

(def coordinateCenter
  "coordinate center"
  {:db/ident         :qudt.datatype/coordinateCenter,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :qudt.datatype/CoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "coordinate center",
   :rdfs/range       :qudt.datatype/CoordinateCenterType,
   :skos/prefLabel   "coordinate center"})

(def coordinateSystem
  "coordinate system"
  {:db/ident         :qudt.datatype/coordinateSystem,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "coordinate system"})

(def coordinateSystemFrame
  "coordinate system frame"
  {:db/ident         :qudt.datatype/coordinateSystemFrame,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "coordinate system frame"})

(def dataOrder
  "data order"
  {:db/ident         :qudt.datatype/dataOrder,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "data order"})

(def dataType
  {:db/ident :qudt.datatype/dataType,
   :rdf/type :owl/ObjectProperty})

(def defaultValue
  "Default Value"
  {:db/ident         :qudt.datatype/defaultValue,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Default Value"})

(def dimension
  "The number of elements in a vector."
  {:db/ident            :qudt.datatype/dimension,
   :dcterms/description "The number of elements in a vector.",
   :rdf/type            :owl/DatatypeProperty,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "dimension",
   :rdfs/range          :xsd/integer})

(def dimensionVector
  "dimension vector"
  {:db/ident         :qudt.datatype/dimensionVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "dimension vector",
   :rdfs/range       :qudt.datatype/DimensionVector})

(def dimensionality
  "The number of dimensions making up an array. For example a 4 by 4 array has a dimensionality of 2. Whereas a vector or a string has a dimensionality of 1."
  {:db/ident :qudt.datatype/dimensionality,
   :dcterms/description
   "The number of dimensions making up an array. For example a 4 by 4 array has a dimensionality of 2. Whereas a vector or a string has a dimensionality of 1.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "dimensionality",
   :rdfs/range :xsd/integer})

(def elementKind
  "This property is used to describe the quantity kind for a dimensional data type."
  {:db/ident           :qudt.datatype/elementKind,
   :dcterms/description
   "This property is used to describe the quantity kind for a dimensional data type.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "element kind",
   :rdfs/subPropertyOf :qudt.datatype/elementKind})

(def elementLabel
  "This property is used to label the field of a composite data structure."
  {:db/ident   :qudt.datatype/elementLabel,
   :dcterms/description
   "This property is used to label the field of a composite data structure.",
   :rdf/type   :rdf/Property,
   :rdfs/label "element label"})

(def elementName
  "element name"
  {:db/ident   :qudt.datatype/elementName,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "element name"})

(def elementType
  "This property is used to relate a structured data type with the data type the structured type's elements. It is used for structured data types with elements that are all of the same type."
  {:db/ident :qudt.datatype/elementType,
   :dcterms/description
   "This property is used to relate a structured data type with the data type the structured type's elements. It is used for structured data types with elements that are all of the same type.",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property is used to relate a structured data type with the data type of the structured type's elements. It is used for homogeneous structured data types, that is, those whose elements that are all of the same type.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "element type",
   :vaem/todo "Change name to type:elementDataType"})

(def elementTypeCount
  "This property determines the allowed number of element types that a structured data type may have."
  {:db/ident :qudt.datatype/elementTypeCount,
   :dcterms/description
   "This property determines the allowed number of element types that a structured data type may have.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "element type count",
   :rdfs/range :xsd/integer})

(def elementTypeList
  "This property is used to relate a structured data type with a list of data types. The list members determine the types of structured type's elements. It is used for structured data types with elements that are of different types."
  {:db/ident         :qudt.datatype/elementTypeList,
   :dcterms/description
   "This property is used to relate a structured data type with a list of data types. The list members determine the types of structured type's elements. It is used for structured data types with elements that are of different types.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "element type list"})

(def elementUnit
  "element unit"
  {:db/ident         :qudt.datatype/elementUnit,
   :rdf/type         [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "element unit"})

(def encodedValue
  "encoded value"
  {:db/ident         :qudt.datatype/encodedValue,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "encoded value"})

(def encoding
  "encoding"
  {:db/ident         :qudt.datatype/encoding,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "encoding"})

(def encodingDescription
  "encoding description"
  {:db/ident         :qudt.datatype/encodingDescription,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "encoding description",
   :rdfs/range       :xsd/string})

(def enumeration
  "enumeration"
  {:db/ident   :qudt.datatype/enumeration,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "enumeration"})

(def exponent
  "exponent"
  {:db/ident   :qudt.datatype/exponent,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/label "exponent"})

(def field
  {:db/ident :qudt.datatype/field,
   :rdf/type :rdf/Property})

(def fieldLabels
  "This property is used to list the field labels for a record type."
  {:db/ident         :qudt.datatype/fieldLabels,
   :dcterms/description
   "This property is used to list the field labels for a record type.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "field labels"})

(def fieldName
  "field name"
  {:db/ident         :qudt.datatype/fieldName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "field name",
   :rdfs/range       :xsd/string})

(def float_X
  "float X"
  {:db/ident         :qudt.datatype/float_X,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "float X",
   :rdfs/range       :xsd/anySimpleType})

(def float_Y
  "float Y"
  {:db/ident         :qudt.datatype/float_Y,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "float Y",
   :rdfs/range       :xsd/anySimpleType})

(def float_Z
  "float Z"
  {:db/ident         :qudt.datatype/float_Z,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "float Z",
   :rdfs/range       :xsd/anySimpleType})

(def frameType
  "frame type"
  {:db/ident         :qudt.datatype/frameType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "frame type"})

(def functionArity
  "This property is used to state the number of arguments for a function type."
  {:db/ident :qudt.datatype/functionArity,
   :dcterms/description
   "This property is used to state the number of arguments for a function type.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "function arity",
   :rdfs/range :xsd/integer})

(def hexbinary
  "hexbinary"
  {:db/ident            :qudt.datatype/hexbinary,
   :owl/equivalentClass {:owl/onDatatype :xsd/string,
                         :owl/withRestrictions [{:xsd/pattern "[0-9A-F]*"}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            :rdfs/Datatype,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "hexbinary",
   :rdfs/subClassOf     :xsd/string})

(def iconicCue
  "iconic cue"
  {:db/ident           :qudt.datatype/iconicCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "iconic cue",
   :rdfs/subPropertyOf :qudt.datatype/modalCue})

(def iconicCueEnumeration
  "iconic cue enumeration"
  {:db/ident           :qudt.datatype/iconicCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "iconic cue enumeration",
   :rdfs/subPropertyOf :qudt.datatype/modalCueEnumeration})

(def id
  "id"
  {:db/ident         :qudt.datatype/id,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "id"})

(def integer1to12
  "integer 1..12"
  {:db/ident            :qudt.datatype/integer1to12,
   :owl/equivalentClass {:owl/onDatatype :xsd/integer,
                         :owl/withRestrictions [{:xsd/minInclusive 1}
                                                {:xsd/maxInclusive 12}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "integer 1..12",
   :rdfs/subClassOf     :xsd/integer})

(def integer1to31
  "integer 1..31"
  {:db/ident            :qudt.datatype/integer1to31,
   :owl/equivalentClass {:owl/onDatatype :xsd/integer,
                         :owl/withRestrictions [{:xsd/minInclusive 1}
                                                {:xsd/maxInclusive 31}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "integer 1..31",
   :rdfs/subClassOf     :xsd/integer})

(def inverted
  "inverted"
  {:db/ident         :qudt.datatype/inverted,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "inverted",
   :rdfs/range       :xsd/boolean})

(def isByteString
  "is byte string"
  {:db/ident         :qudt.datatype/isByteString,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "is byte string",
   :rdfs/range       :xsd/boolean})

(def isComprisedOf
  {:db/ident :qudt.datatype/isComprisedOf,
   :rdf/type :rdf/Property})

(def javaName
  "java name"
  {:db/ident           :qudt.datatype/javaName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "java name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def jsName
  "Javascript name"
  {:db/ident           :qudt.datatype/jsName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Javascript name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def kinestheticCue
  "kinesthetic cue"
  {:db/ident           :qudt.datatype/kinestheticCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "kinesthetic cue",
   :rdfs/subPropertyOf :qudt.datatype/modalCue})

(def kinestheticCueEnumeration
  "kinesthetic cue enumeration"
  {:db/ident           :qudt.datatype/kinestheticCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "kinesthetic cue enumeration",
   :rdfs/subPropertyOf :qudt.datatype/modalCueEnumeration})

(def length
  "The length of a structure, for example the size of a vector"
  {:db/ident :qudt.datatype/length,
   :dcterms/description
   "The length of a structure, for example the size of a vector",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "length",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf [:qudt.datatype/minLength :qudt.datatype/maxLength]})

(def lowerBound
  "lower bound"
  {:db/ident         :qudt.datatype/lowerBound,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "lower bound"})

(def mantissa
  "In scientific notation, the mantissa of a real number is the integer coefficient preceding the base raised to the exponent."
  {:db/ident :qudt.datatype/mantissa,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "In scientific notation, the mantissa of a real number is the integer coefficient preceding the base raised to the exponent.",
   :rdfs/label "mantissa"})

(def matlabName
  "matlab name"
  {:db/ident           :qudt.datatype/matlabName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "matlab name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def maxBits
  "maximum bits"
  {:db/ident         :qudt.datatype/maxBits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "maximum bits",
   :rdfs/range       :xsd/integer})

(def maxDepth
  "max depth"
  {:db/ident         :qudt.datatype/maxDepth,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "max depth",
   :rdfs/range       :xsd/integer})

(def maxExclusive
  "maxExclusive is the exclusive upper bound of the value space for a datatype with the ordered property. The value of maxExclusive must be in the value space of the base type or be equal to {value} in {base type definition}."
  {:db/ident :qudt.datatype/maxExclusive,
   :dcterms/description
   "maxExclusive is the exclusive upper bound of the value space for a datatype with the ordered property. The value of maxExclusive must be in the value space of the base type or be equal to {value} in {base type definition}.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "max exclusive",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/upperBound})

(def maxExponent
  "max exponent"
  {:db/ident         :qudt.datatype/maxExponent,
   :rdf/type         [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "max exponent",
   :rdfs/range       :xsd/integer})

(def maxInclusive
  "maxInclusive is the inclusive upper bound of the value space for a datatype with the ordered property. The value of maxInclusive must be in the value space of the base type."
  {:db/ident           :qudt.datatype/maxInclusive,
   :dcterms/description
   "maxInclusive is the inclusive upper bound of the value space for a datatype with the ordered property. The value of maxInclusive must be in the value space of the base type.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "max inclusive",
   :rdfs/subPropertyOf :qudt.datatype/upperBound})

(def maxLength
  "max length"
  {:db/ident         :qudt.datatype/maxLength,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "max length",
   :rdfs/range       :xsd/integer})

(def maxMantissa
  "<p>The maximium mantissa is the largest integer that may appear as a coefficient in a finite precision representation of a real number. For a given numeric data type, the value of <em>maxMantissa}</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and <em>precision</em> (<em>p</em>) are related by the formula: <em>M = b<sup></sup> - 1</em> .</p>"
  {:db/ident :qudt.datatype/maxMantissa,
   :dcterms/description
   "<p>The maximium mantissa is the largest integer that may appear as a coefficient in a finite precision representation of a real number.  For a given numeric data type, the value of <em>maxMantissa}</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and  <em>precision</em> (<em>p</em>) are related by the formula: <em>M = b<sup></sup> - 1</em> .</p>",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "max mantissa",
   :rdfs/range :xsd/integer})

(def microsoftSQLServerName
  "Microsoft SQL Server name"
  {:db/ident           :qudt.datatype/microsoftSQLServerName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Microsoft SQL Server name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def minBits
  "minimum bits"
  {:db/ident         :qudt.datatype/minBits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "minimum bits",
   :rdfs/range       :xsd/integer})

(def minExclusive
  "minExclusive is the exclusive lower bound of the value space for a datatype with the ordered property. The value of minExclusive must be in the value space of the base type or be equal to {value} in {base type definition}."
  {:db/ident           :qudt.datatype/minExclusive,
   :dcterms/description
   "minExclusive is the exclusive lower bound of the value space for a datatype with the ordered property. The value of minExclusive must be in the value space of the base type or be equal to {value} in {base type definition}.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "min exclusive",
   :rdfs/subPropertyOf :qudt.datatype/lowerBound})

(def minInclusive
  "minInclusive is the inclusive lower bound of the value space for a datatype with the ordered property. The value of minInclusive must be in the value space of the base type."
  {:db/ident           :qudt.datatype/minInclusive,
   :dcterms/description
   "minInclusive is the inclusive lower bound of the value space for a datatype with the ordered property. The value of minInclusive must be in the value space of the base type.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "min inclusive",
   :rdfs/subPropertyOf :qudt.datatype/lowerBound})

(def minLength
  "min length"
  {:db/ident         :qudt.datatype/minLength,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "min length",
   :rdfs/range       :xsd/integer})

(def minMantissa
  "<p>The minimium mantissa is the negative integer with the greatest magnitude that may appear as a coefficient in a finite precision representation of a real number. For a given numeric data type, the value of <em>minMantissa</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and <em>precision</em> (<em>p</em>) are related by the formula: <em>M = -(b<sup>p</sup> - 1)</em>.</p>"
  {:db/ident :qudt.datatype/minMantissa,
   :dcterms/description
   "<p>The minimium mantissa is the negative integer with the greatest magnitude that may appear as a coefficient in a finite precision representation of a real number.  For a given numeric data type, the value of <em>minMantissa</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and <em>precision</em> (<em>p</em>) are related by the formula: <em>M = -(b<sup>p</sup> - 1)</em>.</p>",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "min mantissa",
   :rdfs/range :xsd/integer})

(def minValue
  "minimum value"
  {:db/ident         :qudt.datatype/minValue,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "minimum value"})

(def modalCue
  "modal cue"
  {:db/ident   :qudt.datatype/modalCue,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "modal cue"})

(def modalCueEnumeration
  "modal cue enumeration"
  {:db/ident           :qudt.datatype/modalCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "modal cue enumeration",
   :rdfs/subPropertyOf :qudt.datatype/enumeration})

(def modifiability
  "Reference to one in a list of enumerated elements that indicates whether data (e.g. variable or parameter) can be changed."
  {:db/ident :qudt.datatype/modifiability,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Reference to one in a list of enumerated elements that indicates whether data (e.g. variable or parameter) can be changed.",
   :rdfs/label "modifiability"})

(def mySQLName
  "MySQL name"
  {:db/ident           :qudt.datatype/mySQLName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "MySQL name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def negative
  "negative"
  {:db/ident     :qudt.datatype/negative,
   :qudt.datatype/code    "1",
   :qudt.datatype/literal "negative",
   :rdf/type     :qudt.datatype/Polarity,
   :rdfs/label   "negative"})

(def octets
  "octets"
  {:db/ident         :qudt.datatype/octets,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "octets",
   :rdfs/range       :xsd/integer})

(def odbcName
  "ODBC name"
  {:db/ident           :qudt.datatype/odbcName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "ODBC name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def oleDBName
  "OLE DB (Object Linking and Embedding, Database, sometimes written as OLEDB or OLE-DB), an API designed by Microsoft, allows accessing data from a variety of sources in a uniform manner. The API provides a set of interfaces implemented using the Component Object Model (COM); it is otherwise unrelated to OLE."
  {:db/ident :qudt.datatype/oleDBName,
   :dcterms/description
   "OLE DB (Object Linking and Embedding, Database, sometimes written as OLEDB or OLE-DB), an API designed by Microsoft, allows accessing data from a variety of sources in a uniform manner. The API provides a set of interfaces implemented using the Component Object Model (COM); it is otherwise unrelated to OLE. ",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/windows/desktop/ms714931(v=vs.85).aspx"
    "http://en.wikipedia.org/wiki/OLE_DB"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "OLE DB name",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def optional
  "optional"
  {:db/ident   :qudt.datatype/optional,
   :rdf/type   :rdf/Property,
   :rdfs/label "optional"})

(def oracleSQLName
  "ORACLE SQL name"
  {:db/ident           :qudt.datatype/oracleSQLName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :qudt.datatype/Datatype,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "ORACLE SQL name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def orderInStructure
  "order in structure"
  {:db/ident         :qudt.datatype/orderInStructure,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "order in structure"})

(def orderedType
  "ordered type"
  {:db/ident         :qudt.datatype/orderedType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "ordered type"})

(def orderingRelation
  "This property identifies the mathematical comparison operator (such as \"<\" or \">\") that is used to order the elements of a collection."
  {:db/ident         :qudt.datatype/orderingRelation,
   :dcterms/description
   "This property identifies the mathematical comparison operator (such as \"<\" or \">\") that is used to order the elements of a collection.",
   :rdf/type         [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Ordering Relation"})

(def originDefinition
  "origin definition"
  {:db/ident         :qudt.datatype/originDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "origin definition",
   :rdfs/range       :xsd/string})

(def padding
  "padding"
  {:db/ident         :qudt.datatype/padding,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "padding"})

(def pattern
  "A pattern is a constraint on the value space of a datatype which is achieved by constraining the lexical space to literals which match a specific pattern. The value of pattern must be a regular expression."
  {:db/ident :qudt.datatype/pattern,
   :dcterms/description
   "A pattern is a constraint on the value space of a datatype which is achieved by constraining the lexical space to literals which match a specific pattern. The value of pattern must be a regular expression.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "pattern",
   :rdfs/range :xsd/string})

(def pitchRotationDefinition
  "pitch rotation definition"
  {:db/ident           :qudt.datatype/pitchRotationDefinition,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "pitch rotation definition",
   :rdfs/subPropertyOf :qudt.datatype/rotationDefinition})

(def positive
  "positive"
  {:db/ident     :qudt.datatype/positive,
   :qudt.datatype/code    "2",
   :qudt.datatype/literal "positive",
   :rdf/type     :qudt.datatype/Polarity,
   :rdfs/label   "positive"})

(def precision
  "Precision is the number of digits used to perform a given computation. The concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits. For a given numeric data type, the value of type:precision (?p) is related to the values of type:maxMantissa (?M) and type:base (?b) by the formula ?p := log(?b, ?M) where log(a,y) = x iff y=a^x."
  {:db/ident :qudt.datatype/precision,
   :dcterms/description
   "Precision is the number of digits used to perform a given computation. The concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits.\n\nFor a given numeric data type, the value of type:precision (?p) is related to the values of type:maxMantissa (?M) and type:base (?b) by the formula \n\n?p := log(?b, ?M) \n\nwhere log(a,y) = x iff y=a^x.",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "precision",
   :rdfs/range :xsd/integer})

(def protocolBuffersName
  "protocol buffers name"
  {:db/ident           :qudt.datatype/protocolBuffersName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/label         "protocol buffers name",
   :rdfs/subPropertyOf :qudt.datatype/id})

(def pythonName
  "python name"
  {:db/ident           :qudt.datatype/pythonName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "python name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def rdfsDatatype
  "rdfs datatype"
  {:db/ident         :qudt.datatype/rdfsDatatype,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "rdfs datatype"})

(def realization
  "realization"
  {:db/ident         :qudt.datatype/realization,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "realization",
   :rdfs/range       :xsd/string})

(def referenceFrame
  "reference frame"
  {:db/ident           :qudt.datatype/referenceFrame,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "reference frame",
   :rdfs/subPropertyOf :qudt.datatype/coordinateSystemFrame})

(def referenceFrameType
  "reference frame type"
  {:db/ident         :qudt.datatype/referenceFrameType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "reference frame type"})

(def returnType
  "This property is used to state the return type of a function type."
  {:db/ident           :qudt.datatype/returnType,
   :dcterms/description
   "This property is used to state the return type of a function type.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "return type",
   :rdfs/subPropertyOf :qudt.datatype/elementType})

(def rgbCode
  "rgb code"
  {:db/ident   :qudt.datatype/rgbCode,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "rgb code"})

(def rollRotationDefinition
  "roll rotation definition"
  {:db/ident           :qudt.datatype/rollRotationDefinition,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "roll rotation definition",
   :rdfs/subPropertyOf :qudt.datatype/rotationDefinition})

(def rotationDefinition
  "rotation definition"
  {:db/ident         :qudt.datatype/rotationDefinition,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "rotation definition"})

(def rows
  "rows"
  {:db/ident         :qudt.datatype/rows,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "rows",
   :rdfs/range       :xsd/integer})

(def signedness
  "signedness"
  {:db/ident         :qudt.datatype/signedness,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "signedness"})

(def significantDigits
  "significant digits"
  {:db/ident         :qudt.datatype/significantDigits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "significant digits",
   :rdfs/range       :xsd/integer})

(def sound
  "The intended use of the sound property is to be associated with modal enumerations"
  {:db/ident :qudt.datatype/sound,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The intended use of the sound property is to be associated with modal enumerations",
   :rdfs/label "sound"})

(def stringValue
  "string value"
  {:db/ident           :qudt.datatype/stringValue,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/label         "string value",
   :rdfs/subPropertyOf :qudt.datatype/scalarValue})

(def timeDatatype
  "time datatype"
  {:db/ident           :qudt.datatype/timeDatatype,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "time datatype",
   :rdfs/subPropertyOf :qudt.datatype/type})

(def totalDigits
  "total digits"
  {:db/ident   :qudt.datatype/totalDigits,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "total digits"})

(def type
  "A reference to the specification of the data type of a variable or constant."
  {:db/ident :qudt.datatype/type,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A reference to the specification of the data type of a variable or constant.",
   :rdfs/label "type"})

(def typeMatrix
  "type matrix"
  {:db/ident         :qudt.datatype/typeMatrix,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "type matrix"})

(def typeVector
  "type vector"
  {:db/ident         :qudt.datatype/typeVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "type vector"})

(def upperBound
  "upper bound"
  {:db/ident         :qudt.datatype/upperBound,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "upper bound",
   :rdfs/range       :xsd/anySimpleType})

(def value
  "This property identifies the value associated with a data structure. The value may be a scalar or a reference to another object. The disjoint sub-properties of this data:value distinguish between scalar values and object references."
  {:db/ident :qudt.datatype/value,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This property identifies the value associated with a data structure. The value may be a scalar or a reference to another object. The disjoint sub-properties of this data:value distinguish between scalar values and object references.",
   :rdfs/label "value",
   :rdfs/subPropertyOf :rdf/value})

(def valueRange
  "value range"
  {:db/ident   :qudt.datatype/valueRange,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "value range"})

(def valueType
  "value type"
  {:db/ident         :qudt.datatype/valueType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "value type"})

(def valueVector
  "A list of the values of elements in a Partial Array."
  {:db/ident     :qudt.datatype/valueVector,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "A list of the values of elements in a Partial Array.",
   :rdfs/label   "value vector"})

(def vbName
  "Visual Basic name"
  {:db/ident           :qudt.datatype/vbName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Visual Basic name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt.datatype/id})

(def vector
  "vector"
  {:db/ident   :qudt.datatype/vector,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "vector"})

(def visualCue
  "visual cue"
  {:db/ident           :qudt.datatype/visualCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "visual cue",
   :rdfs/subPropertyOf :qudt.datatype/modalCue})

(def visualCueEnumeration
  "visual cue enumeration"
  {:db/ident           :qudt.datatype/visualCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "visual cue enumeration",
   :rdfs/subPropertyOf :qudt.datatype/modalCueEnumeration})

(def xAxisDefinition
  "The definition of the X-Axis could be an intersection, cross-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth, Sun, Moon or other celestial body. An epoch might also be given."
  {:db/ident :qudt.datatype/xAxisDefinition,
   :dcterms/description
   "The definition of the X-Axis could be an intersection, cross-product or other function of a  meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth,  Sun, Moon or other celestial body. An epoch might also be given.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "X-Axis Definition",
   :rdfs/range :xsd/string})

(def xCoordinateDefinition
  "X-Coordinate definition"
  {:db/ident         :qudt.datatype/xCoordinateDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "X-Coordinate definition",
   :rdfs/range       :xsd/string})

(def yAxisDefinition
  "The definition of the Y-Axis could be an intersection, cross-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth, Sun, Moon or other celestial body. An epoch might also be given."
  {:db/ident :qudt.datatype/yAxisDefinition,
   :dcterms/description
   "The definition of the Y-Axis could be an intersection, cross-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth,  Sun, Moon or other celestial body. An epoch might also be given.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Y-Axis definition",
   :rdfs/range :xsd/string})

(def yCoordinateDefinition
  "Y-Coordinate definition"
  {:db/ident         :qudt.datatype/yCoordinateDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Y-Coordinate definition",
   :rdfs/range       :xsd/string})

(def yawRotationDefinition
  "Yaw rotation definition"
  {:db/ident           :qudt.datatype/yawRotationDefinition,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Yaw rotation definition",
   :rdfs/subPropertyOf :qudt.datatype/rotationDefinition})

(def zAxisDefinition
  "The definition of the Y-Axis could be an intersection, croos-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth, Sun, Moon or other celestial body. An epoch might also be given."
  {:db/ident :qudt.datatype/zAxisDefinition,
   :dcterms/description
   "The definition of the Y-Axis could be an intersection, croos-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth,  Sun, Moon or other celestial body. An epoch might also be given.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Z-Axis definition",
   :rdfs/range :xsd/string})

(def zCoordinateDefinition
  "Z-Coordinate definition"
  {:db/ident         :qudt.datatype/zCoordinateDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Z-Coordinate definition",
   :rdfs/range       :xsd/string})
