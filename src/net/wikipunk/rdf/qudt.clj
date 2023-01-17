(ns net.wikipunk.rdf.qudt
  "QUDT Schema - Version 2.1.24"
  {:dcat/downloadURL      "https://qudt.org/2.1/schema/qudt.ttl",
   :owl/imports           ["http://www.w3.org/2004/02/skos/core"
                           "http://www.linkedmodel.org/schema/vaem"
                           "http://www.linkedmodel.org/schema/dtype"],
   :owl/versionIRI        "http://qudt.org/2.1/schema/qudt",
   :rdf/ns-prefix-map     {"dcterms" "http://purl.org/dc/elements/1.1/",
                           "dtype" "http://www.linkedmodel.org/schema/dtype#",
                           "owl" "http://www.w3.org/2002/07/owl#",
                           "prov" "http://www.w3.org/ns/prov#",
                           "quantitykind" "http://qudt.org/vocab/quantitykind/",
                           "qudt" "http://qudt.org/schema/qudt/",
                           "qudt.type" "http://qudt.org/vocab/type/",
                           "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                           "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                           "skos" "http://www.w3.org/2004/02/skos/core#",
                           "unit" "http://qudt.org/vocab/unit/",
                           "vaem" "http://www.linkedmodel.org/schema/vaem#",
                           "voag" "http://voag.linkedmodel.org/schema/voag#",
                           "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type              :owl/Ontology,
   :rdf/uri               "http://qudt.org/2.1/schema/qudt",
   :rdfa/prefix           "qudt",
   :rdfa/uri              "http://qudt.org/2.1/schema/qudt/",
   :rdfs/isDefinedBy      "http://qudt.org/2.1/schema/qudt",
   :rdfs/label            "QUDT Schema - Version 2.1.24",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-SCHEMA}
  (:refer-clojure :exclude [bytes symbol type vector]))

(def AbstractDatatype
  "An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument. <p class=\"lm-para\">An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument.</p>"
  {:db/ident :qudt/AbstractDatatype,
   :dcterms/description
   ["An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument."
    "<p class=\"lm-para\">An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument.</p>"],
   :prov/wasInfluencedBy
   ["http://xlinux.nist.gov/dads/HTML/abstractDataType.html"
    "http://en.wikipedia.org/wiki/Abstract_data_type"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Abstract Datatype",
   :rdfs/subClassOf :qudt/StructuredDatatype})

(def AbstractQuantityKind
  "Quantity Kind (abstract)"
  {:db/ident         :qudt/AbstractQuantityKind,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Quantity Kind (abstract)",
   :rdfs/subClassOf  [{:owl/minCardinality 0,
                       :owl/onProperty     :qudt/symbol,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/latexSymbol,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKind,
                       :owl/onProperty    :skos/broader,
                       :rdf/type          :owl/Restriction}
                      :qudt/Concept]})

(def AerospaceCoordinateSystem
  "A sub-type of 'Coordinate system'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/AerospaceCoordinateSystem,
   :dcterms/description
   "A sub-type of 'Coordinate system'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Aerospace coordinate system",
   :rdfs/subClassOf :qudt/CoordinateSystem})

(def AlgebraicDatatype
  "<p class=\"lm-para\">An \"Algebraic Datatype\" is a datatype each of whose values are data from other data types wrapped in one of the constructors of the data type. Any wrapped datum is an argument to the constructor. In contrast to other data types, the constructor is not executed and the only way to operate on the data is to unwrap the constructor using pattern matching.</p> <p class=\"lm-para\">The most common algebraic data type is a list with two constructors: Nil or [] for an empty list, and Cons (an abbreviation of constructor), ::, or : for the combination of a new element with a shorter list (for example (Cons 1 '(2 3 4)) or 1:[2,3,4]).</p> <p class=\"lm-para\">Special cases of algebraic types are product types i.e. records (only one constructor) and enumerated types (many constructors with no arguments). Algebraic types are one kind of composite type (i.e. a type formed by combining other types).</p> <p class=\"lm-para\">An algebraic data type may also be an abstract data type (ADT) if it is exported from a module without its constructors. Values of such a type can only be manipulated using functions defined in the same module as the type itself.</p>"
  {:db/ident :qudt/AlgebraicDatatype,
   :dcterms/description
   "<p class=\"lm-para\">An \"Algebraic Datatype\" is a datatype each of whose values are data from other data types wrapped in one of the constructors of the data type. Any wrapped datum is an argument to the constructor. In contrast to other data types, the constructor is not executed and the only way to operate on the data is to unwrap the constructor using pattern matching.</p>\n<p class=\"lm-para\">The most common algebraic data type is a list with two constructors: Nil or [] for an empty list, and Cons (an abbreviation of constructor), ::, or : for the combination of a new element with a shorter list (for example (Cons 1 '(2 3 4)) or 1:[2,3,4]).</p>\n<p class=\"lm-para\">Special cases of algebraic types are product types i.e. records (only one constructor) and enumerated types (many constructors with no arguments). Algebraic types are one kind of composite type (i.e. a type formed by combining other types).</p>\n<p class=\"lm-para\">An algebraic data type may also be an abstract data type (ADT) if it is exported from a module without its constructors. Values of such a type can only be manipulated using functions defined in the same module as the type itself.</p>",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Algebraic_data_type",
   :rdf/type :owl/Class,
   :rdfs/comment
   "<p>An \"Algebraic Datatype\" is a datatype each of whose values are data from other data types wrapped in one of the constructors of the data type. Any wrapped datum is an argument to the constructor. In contrast to other data types, the constructor is not executed and the only way to operate on the data is to unwrap the constructor using pattern matching.</p>\n\n<p>The most common algebraic data type is a list with two constructors: Nil or [] for an empty list, and Cons (an abbreviation of constructor), ::, or : for the combination of a new element with a shorter list (for example (Cons 1 '(2 3 4)) or 1:[2,3,4]).</p>\n\n<p>Special cases of algebraic types are product types i.e. records (only one constructor) and enumerated types (many constructors with no arguments). Algebraic types are one kind of composite type (i.e. a type formed by combining other types).</p>\n\n<p>An algebraic data type may also be an abstract data type (ADT) if it is exported from a module without its constructors. Values of such a type can only be manipulated using functions defined in the same module as the type itself.</p>",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Algebraic Datatype",
   :rdfs/seeAlso "http://qudt.org/2.1/schema/qudt/AbstractDatatype"
   :rdfs/subClassOf :qudt/StructuredDatatype})

(def AlignmentType
  "Specifies how a physical data field is aligned. The alignment could be at a bit, byte or word boundary."
  {:db/ident :qudt/AlignmentType,
   :dcterms/description
   "Specifies how a physical data field is aligned. The alignment could be at a bit, byte or word boundary.",
   :owl/oneOf
   [:qudt.type/BitAligned :qudt.type/ByteAligned :qudt.type/WordAligned],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Alignment type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def AngleUnit
  "All units relating to specification of angles."
  {:db/ident            :qudt/AngleUnit,
   :dcterms/description "All units relating to specification of angles. ",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/qudt",
   :rdfs/label          "Angle unit",
   :rdfs/subClassOf     :qudt/DimensionlessUnit,
   :skos/exactMatch     "http://dbpedia.org/resource/Category:Units_of_angle"})

(def Array
  "An array is represented as ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'. Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements. If it is not given then the elements can be of different types for each position in the array. The property 'type:typeMatrix' must refer to a matrix of types. If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type."
  {:db/ident :qudt/Array,
   :dcterms/description
   "An array is represented as ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'. Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements.  If it is not given then the elements can be of different types for each position in the array. The property 'type:typeMatrix' must refer to a matrix of types.  If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Array Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dimensionality,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/typeMatrix,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dataOrder,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dimensionVector,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/TypeMatrix,
                      :owl/onProperty    :qudt/typeMatrix,
                      :rdf/type          :owl/Restriction}
                     :qudt/CompositeDatatype
                     {:owl/allValuesFrom :qudt/DimensionVector,
                      :owl/onProperty    :qudt/dimensionVector,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/byRow,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/ArrayDataOrderType,
                      :owl/onProperty    :qudt/dataOrder,
                      :rdf/type          :owl/Restriction}]})

(def ArrayDataOrderType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/ArrayDataOrderType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :owl/oneOf [:qudt/ByColumn :qudt/ByRow :qudt/ByLeftMostIndex],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Array data order type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ArrayIndex
  "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes."
  {:db/ident :qudt/ArrayIndex,
   :dcterms/description
   "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Array Index Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/UNSIGNED-INTEGER,
                      :owl/onProperty :qudt/elementType,
                      :rdf/type       :owl/Restriction}
                     :qudt/Vector]})

(def ArrayIndex-elementType
  "ArrayIndex-elementType"
  {:db/ident    :qudt/ArrayIndex-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/nonNegativeInteger,
   :sh/hasValue :qudt.type/UNSIGNED-INTEGER,
   :sh/path     :qudt/elementType})

(def ArrayIndexType
  "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes."
  {:db/ident :qudt/ArrayIndexType,
   :dcterms/description
   "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Array Index Type",
   :rdfs/subClassOf :qudt/VectorType,
   :sh/property :qudt/ArrayIndex-elementType})

(def ArrayType
  "<p>An <em>array type</em> is a type specification for ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'.</p> <p>Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements. If it is not given then the elements can be of different types for each position in the array.</p> <p>The property <em>qudt:typeMatrix</em> must refer to a matrix of types. If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type.</p>"
  {:db/ident :qudt/ArrayType,
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/comment
   "<p>An <em>array type</em> is a type specification for ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'.</p>\n\n<p>Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements.  If it is not given then the elements can be of different types for each position in the array.</p>\n\n<p>The property <em>qudt:typeMatrix</em> must refer to a matrix of types.  If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type.</p>",
   :rdfs/label "Array Type",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property [:qudt/ArrayType-dimensionVector
                 :qudt/ArrayType-dimensionality
                 :qudt/ArrayType-dataOrder
                 :qudt/ArrayType-byRow
                 :qudt/ArrayType-typeMatrix]})

(def ArrayType-byRow
  "ArrayType-byRow"
  {:db/ident    :qudt/ArrayType-byRow,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt/byRow})

(def ArrayType-dataOrder
  "ArrayType-dataOrder"
  {:db/ident    :qudt/ArrayType-dataOrder,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/ArrayDataOrderType,
   :sh/maxCount 1,
   :sh/path     :qudt/dataOrder})

(def ArrayType-dimensionVector
  "ArrayType-dimensionVector"
  {:db/ident    :qudt/ArrayType-dimensionVector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/DimensionVector,
   :sh/maxCount 1,
   :sh/path     :qudt/dimensionVector})

(def ArrayType-dimensionality
  "ArrayType-dimensionality"
  {:db/ident    :qudt/ArrayType-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/dimensionality})

(def ArrayType-typeMatrix
  "ArrayType-typeMatrix"
  {:db/ident    :qudt/ArrayType-typeMatrix,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/typeMatrix,
   :sh/maxCount 1,
   :sh/path     :qudt/typeMatrix})

(def Article
  "Pub article type"
  {:db/ident      :qudt/Article,
   :dtype/literal "article",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub article type"})

(def Aspect
  "An aspect is an abstract type class that defines properties that can be reused."
  {:db/ident :qudt/Aspect,
   :rdf/type :qudt/AspectClass,
   :rdfs/comment
   "An aspect is an abstract type class that defines properties that can be reused.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "QUDT Aspect",
   :rdfs/subClassOf :owl/Thing})

(def AspectClass
  "Aspect Class"
  {:db/ident         :qudt/AspectClass,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Aspect Class",
   :rdfs/subClassOf  :rdfs/Class})

(def AssociativeArray
  "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident         :qudt/AssociativeArray,
   :dcterms/description
   "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt/Map,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Associative Array",
   :rdfs/subClassOf  :qudt/Collection})

(def AssociativeArrayType
  "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident        :qudt/AssociativeArrayType,
   :dcterms/description
   "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt/MapType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Associative Array Type",
   :rdfs/subClassOf :qudt/CollectionType})

(def AuralCue
  "An aural cue is a sound produced by a device or a system that is used to alert personnel of of an advisory, cautionary, warning, or emergency state."
  {:db/ident :qudt/AuralCue,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An aural cue is a sound produced by a device or a system that is used to alert personnel of of an advisory, cautionary, warning, or emergency state.",
   :rdfs/label "Aural Cue",
   :rdfs/subClassOf :qudt/ModalCue,
   :sh/property :qudt/AuralCue-sound})

(def AuralCue-sound
  "AuralCue-sound"
  {:db/ident    :qudt/AuralCue-sound,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/anyURI,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/sound})

(def AuralCueEnumeration-defaultValue
  "AuralCueEnumeration-defaultValue"
  {:db/ident :qudt/AuralCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/AuralCue,
   :sh/path  :qudt/defaultValue})

(def AxialOrientationType
  "The axial orientation of a coordinate system frame axis."
  {:db/ident :qudt/AxialOrientationType,
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
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def BOOLEAN
  "In computer science, the Boolean or logical data type is a data type, having two values (usually denoted true and false), intended to represent the truth values of logic and Boolean algebra. The Boolean data type is the primary result of conditional statements, which allow different actions and change control flow depending on whether a programmer-specified boolean condition evaluates to true or false."
  {:db/ident :qudt/BOOLEAN,
   :dcterms/description
   "In computer science, the Boolean or logical data type is a data type, having two values (usually denoted true and false), intended to represent the truth values of logic and Boolean algebra. The Boolean data type is the primary result of conditional statements, which allow different actions and change control flow depending on whether a programmer-specified boolean condition evaluates to true or false.",
   :dtype/literal "boolean",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"
    "http://en.wikipedia.org/wiki/Boolean%5Fdata%5Ftype"],
   :qudt/ansiSQLName "BOOLEAN",
   :qudt/encoding :qudt/BooleanEncoding,
   :qudt/javaName "boolean",
   :qudt/jsName "Boolean()",
   :qudt/microsoftSQLServerName "bit",
   :qudt/mySQLName ["BOOLEAN" "TINYINT(1)" "BOOL"],
   :qudt/odbcName "SQL_BIT",
   :qudt/oleDBName "DBTYPE_BOOL",
   :qudt/oracleSQLName "RAW(1)",
   :qudt/protocolBuffersName "bool",
   :qudt/pythonName "bool",
   :qudt/rdfsDatatype :xsd/boolean,
   :rdf/type [:qudt/BooleanType :owl/NamedIndividual],
   :rdfs/label "BOOLEAN"})

(def BYTE
  "The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation."
  {:db/ident :qudt/BYTE,
   :dcterms/description
   "The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.",
   :dtype/literal "byte",
   :prov/wasInfluencedBy
   "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html",
   :qudt/abbreviation "SI8",
   :qudt/cName "Byte",
   :qudt/encoding :qudt/OctetEncoding,
   :qudt/maxInclusive 127,
   :qudt/minInclusive -128,
   :qudt/octets 1,
   :qudt/rdfsDatatype :xsd/byte,
   :qudt/signedness :qudt/SIGNED,
   :rdf/type [:qudt/SignedShortIntegerType :owl/NamedIndividual],
   :rdfs/label "Byte"})

(def BalancedTree
  "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced."
  {:db/ident :qudt/BalancedTree,
   :dcterms/description
   "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Balanced Tree Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/maxDepth,
                      :rdf/type           :owl/Restriction}
                     :qudt/Tree]})

(def BalancedTree-maxDepth
  "BalancedTree-maxDepth"
  {:db/ident    :qudt/BalancedTree-maxDepth,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/maxDepth})

(def BalancedTreeType
  "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced."
  {:db/ident :qudt/BalancedTreeType,
   :dcterms/description
   "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Balanced Tree Type",
   :rdfs/subClassOf :qudt/TreeType,
   :sh/property :qudt/BalancedTree-maxDepth})

(def BaseDimensionMagnitude
  "<p class=\"lm-para\">A <em>Dimension</em> expresses a magnitude for a base quantiy kind such as mass, length and time.</p> <p class=\"lm-para\">DEPRECATED - each exponent is expressed as a property. Keep until a validaiton of this has been done.</p>"
  {:db/ident :qudt/BaseDimensionMagnitude,
   :qudt/informativeReference
   ["http://en.wikipedia.org/wiki/Dimensional_analysis"
    "http://web.mit.edu/2.25/www/pdf/DA_unified.pdf"],
   :rdf/type :owl/Class,
   :rdfs/comment
   "<p class=\"lm-para\">A <em>Dimension</em> expresses a magnitude for a base quantiy kind such as mass, length and time.</p>\n<p class=\"lm-para\">DEPRECATED - each exponent is expressed as a property. Keep until a validaiton of this has been done.</p>",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Base Dimension Magnitude",
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt/vectorMagnitude,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/QuantityKind,
                      :owl/onProperty    :qudt/hasBaseQuantityKind,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/hasBaseQuantityKind,
                      :rdf/type        :owl/Restriction}
                     :qudt/Concept
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/vectorMagnitude,
                      :rdf/type        :owl/Restriction}]})

(def BigEndian
  "Big Endian"
  {:db/ident         :qudt/BigEndian,
   :dtype/literal    "big",
   :rdf/type         [:qudt/EndianType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Big Endian"})

(def BigIntegerType
  "A Big Integer is an integer that can be represented in eight octets (64 bits) of machine memory. Big integers may be signed or unsigned."
  {:db/ident :qudt/BigIntegerType,
   :dcterms/description
   "A Big Integer is an integer that can be represented in eight octets (64 bits) of machine memory. Big integers may be signed or unsigned.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Big Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   8,
                      :owl/onProperty :qudt/octets,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   64,
                      :owl/onProperty :qudt/bits,
                      :rdf/type       :owl/Restriction}
                     :qudt/IntegerDatatype],
   :sh/property :qudt/BigIntegerType-octets})

(def BigIntegerType-octets
  "BigIntegerType-octets"
  {:db/ident    :qudt/BigIntegerType-octets,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue 8,
   :sh/or       [:qudt/NumericUnion],
   :sh/path     :qudt/octets})

(def BinaryPrefix
  "A <em>Binary Prefix</em> is a prefix for multiples of units in data processing, data transmission, and digital information, notably the bit and the byte, to indicate multiplication by a power of 2."
  {:db/ident :qudt/BinaryPrefix,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A <em>Binary Prefix</em> is a prefix for multiples of units in data processing, data transmission, and digital information, notably the bit and the byte, to indicate multiplication by a power of 2.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Binary Prefix",
   :rdfs/subClassOf :qudt/Prefix})

(def BinaryTree
  "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children."
  {:db/ident :qudt/BinaryTree,
   :dcterms/description
   "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children. ",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Binary Tree Type",
   :rdfs/subClassOf :qudt/Tree})

(def BinaryTreeType
  "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children."
  {:db/ident :qudt/BinaryTreeType,
   :dcterms/description
   "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children. ",
   :rdf/type :owl/Class,
   :rdfs/label "Binary Tree Type",
   :rdfs/subClassOf :qudt/TreeType})

(def BitAligned
  "Bit Aligned"
  {:db/ident      :qudt/BitAligned,
   :dtype/literal "bit",
   :rdf/type      [:qudt/AlignmentType :owl/NamedIndividual],
   :rdfs/label    "Bit Aligned"})

(def BitEncoding
  "Bit Encoding"
  {:db/ident         :qudt/BitEncoding,
   :qudt/bits        1,
   :rdf/type         [:qudt/BitEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Bit Encoding"})

(def BitEncodingType
  "A bit encoding is a correspondence between the two possible values of a bit, 0 or 1, and some interpretation. For example, in a boolean encoding, a bit denotes a truth value, where 0 corresponds to False and 1 corresponds to True."
  {:db/ident :qudt/BitEncodingType,
   :dcterms/description
   "A bit encoding is a correspondence between the two possible values of a bit, 0 or 1, and some interpretation. For example, in a boolean encoding, a bit denotes a truth value, where 0 corresponds to False and 1 corresponds to True.",
   :owl/oneOf [:qudt/BitEncoding],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Bit Encoding",
   :rdfs/subClassOf :qudt/Encoding})

(def BitField
  "bitfield"
  {:db/ident         :qudt/BitField,
   :rdf/type         [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "bitfield",
   :rdfs/subClassOf  :xsd/string})

(def BitField01
  "Bit Field of 1 bit"
  {:db/ident             :qudt/BitField01,
   :dtype/literal        "B1",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 1}
                                                 {:xsd/pattern "[0-1]"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf1",
   :qudt/bits            1,
   :qudt/mySQLName       "BIT(1)",
   :rdf/type             [:qudt/BitFieldType :rdfs/Datatype],
   :rdfs/label           "Bit Field of 1 bit",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField02
  "Bit Field of 2 bits"
  {:db/ident             :qudt/BitField02,
   :dtype/literal        "B2",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 2}
                                                 {:xsd/pattern "[0-1]{2}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf2",
   :qudt/bits            2,
   :qudt/mySQLName       "BIT(2)",
   :rdf/type             [:qudt/BitFieldType :rdfs/Datatype],
   :rdfs/label           "Bit Field of 2 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField03
  "Bit Field of 3 bits"
  {:db/ident             :qudt/BitField03,
   :dtype/literal        "B3",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 3}
                                                 {:xsd/pattern "[0-1]{3}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf3",
   :qudt/bits            3,
   :qudt/mySQLName       "BIT(3)",
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 3 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField04
  "Bit Field of 4 bits"
  {:db/ident             :qudt/BitField04,
   :dtype/literal        "B4",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 4}
                                                 {:xsd/pattern "[0-1]{4}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf4",
   :qudt/bits            4,
   :qudt/mySQLName       "BIT(4)",
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 4 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField05
  "Bit Field of 5 bits"
  {:db/ident             :qudt/BitField05,
   :dtype/literal        "B5",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 5}
                                                 {:xsd/pattern "[0-1]{5}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf5",
   :qudt/bits            5,
   :qudt/mySQLName       "BIT(5)",
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 5 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField06
  "Bit Field of 6 bits"
  {:db/ident             :qudt/BitField06,
   :dtype/literal        "B6",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 6}
                                                 {:xsd/pattern "[0-1]{6}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf6",
   :qudt/bits            6,
   :qudt/mySQLName       "BIT(6)",
   :qudt/rdfsDatatype    :qudt/BitField06,
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 6 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField07
  "Bit Field of 7 bits"
  {:db/ident             :qudt/BitField07,
   :dtype/literal        "B7",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 7}
                                                 {:xsd/pattern "[0-1]{7}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf7",
   :qudt/bits            7,
   :qudt/mySQLName       "BIT(7)",
   :qudt/rdfsDatatype    :qudt/BitField07,
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 7 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField08
  "Bit Field of 8 bits"
  {:db/ident             :qudt/BitField08,
   :dtype/literal        "B8",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 8}
                                                 {:xsd/pattern "[0-1]{8}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf8",
   :qudt/bits            8,
   :qudt/mySQLName       "BIT(8)",
   :qudt/rdfsDatatype    :qudt/BitField08,
   :rdf/type             [:qudt/BitFieldType :rdfs/Datatype],
   :rdfs/label           "Bit Field of 8 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField09
  "Bit Field of 9 bits"
  {:db/ident             :qudt/BitField09,
   :dtype/literal        "B9",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 9}
                                                 {:xsd/pattern "[0-1]{9}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf9",
   :qudt/bits            9,
   :qudt/mySQLName       "BIT(9)",
   :qudt/rdfsDatatype    :qudt/BitField09,
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 9 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def BitField10
  "Bit Field Of 10 Bits"
  {:db/ident             :qudt/BitField10,
   :dtype/literal        "B10",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 10}
                                                 {:xsd/pattern "[0-1]{10}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf10",
   :qudt/bitOrder        :qudt/BigEndian,
   :qudt/bits            10,
   :qudt/byteOrder       :qudt/BigEndian,
   :qudt/mySQLName       "BIT(10)",
   :qudt/rdfsDatatype    :qudt/BitField10,
   :rdf/type             [:owl/DataRange :rdfs/Datatype :qudt/BitFieldType],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/schema/datatype",
   :rdfs/label           "Bit Field Of 10 Bits",
   :rdfs/subClassOf      [:rdfs/Literal :qudt/BitField]})

(def BitField11
  "Bit Field Of 11 Bits"
  {:db/ident             :qudt/BitField11,
   :dtype/literal        "B11",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 11}
                                                 {:xsd/pattern "[0-1]{11}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf11",
   :qudt/bits            11,
   :qudt/mySQLName       "BIT(11)",
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType :owl/DataRange],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/schema/datatype",
   :rdfs/label           "Bit Field Of 11 Bits",
   :rdfs/subClassOf      [:qudt/BitField :rdfs/Literal]})

(def BitField12
  "Bit Field of 12 bits"
  {:db/ident            :qudt/BitField12,
   :dtype/literal       "B12",
   :owl/equivalentClass {:owl/onDatatype :xsd/string,
                         :owl/withRestrictions [{:xsd/length 12}
                                                {:xsd/pattern "[0-1]{12}"}],
                         :rdf/type       :rdfs/Datatype},
   :qudt/abbreviation   "bf12",
   :qudt/bits           12,
   :qudt/mySQLName      "BIT(12)",
   :qudt/rdfsDatatype   :qudt/BitField12,
   :rdf/type            [:owl/DataRange :qudt/BitFieldType :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Bit Field of 12 bits",
   :rdfs/subClassOf     [:rdfs/Literal :qudt/BitField]})

(def BitFieldType
  "A bit field is a common idiom used in computer programming to store a set of Boolean datatype flags compactly, as a series of bits. The bit field is stored in an integral type of known, fixed bit-width. Each Boolean flag is stored in a separate bit. Usually the source code will define a set of constants, each a power of two, that semantically associate each individual bit with its respective Boolean flag. The bitwise operators and, or, and not are used in combination to set, reset and test the flags."
  {:db/ident :qudt/BitFieldType,
   :dcterms/description
   "A bit field is a common idiom used in computer programming to store a set of Boolean datatype flags compactly, as a series of bits. The bit field is stored in an integral type of known, fixed bit-width. Each Boolean flag is stored in a separate bit. Usually the source code will define a set of constants, each a power of two, that semantically associate each individual bit with its respective Boolean flag. The bitwise operators and, or, and not are used in combination to set, reset and test the flags.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Bit Field Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/encodedValue,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/BitField,
                      :owl/onProperty    :qudt/encodedValue,
                      :rdf/type          :owl/Restriction}
                     :qudt/ScalarDatatype],
   :sh/property :qudt/BitFieldType-encodedValue})

(def BitFieldType-encodedValue
  "BitFieldType-encodedValue"
  {:db/ident    :qudt/BitFieldType-encodedValue,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/BitField,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/encodedValue})

(def Book
  "Pub book type"
  {:db/ident      :qudt/Book,
   :dtype/literal "book",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub book type"})

(def Booklet
  "Pub booklet type"
  {:db/ident      :qudt/Booklet,
   :dtype/literal "booklet",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub booklet type"})

(def BooleanEncoding
  "Boolean Encoding"
  {:db/ident         :qudt/BooleanEncoding,
   :qudt/bits        1,
   :rdf/type         [:qudt/BooleanEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Boolean Encoding"})

(def BooleanEncodingType
  "Boolean encoding type"
  {:db/ident         :qudt/BooleanEncodingType,
   :owl/oneOf        [:qudt/BooleanEncoding
                      :qudt/BitEncoding
                      :qudt/OctetEncoding],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Boolean encoding type",
   :rdfs/subClassOf  :qudt/Encoding})

(def BooleanType
  "A boolean data type can take on only two values."
  {:db/ident            :qudt/BooleanType,
   :dcterms/description "A boolean data type can take on only two values.",
   :rdf/type            [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Boolean Type",
   :rdfs/subClassOf     [{:owl/allValuesFrom :qudt/BooleanEncodingType,
                          :owl/onProperty    :qudt/encoding,
                          :rdf/type          :owl/Restriction}
                         :qudt/OrdinalType],
   :sh/property         :qudt/BooleanType-encoding})

(def BooleanType-encoding
  "BooleanType-encoding"
  {:db/ident :qudt/BooleanType-encoding,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/BooleanEncodingType,
   :sh/path  :qudt/encoding})

(def BooleanTypeEnumeratedValue
  "Specifies how a boolean value is expressed"
  {:db/ident            :qudt/BooleanTypeEnumeratedValue,
   :dcterms/description "Specifies how a boolean value is expressed",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "boolean value",
   :rdfs/subClassOf     :qudt/EnumeratedValue})

(def ByColumn
  "By Column"
  {:db/ident         :qudt/ByColumn,
   :dtype/literal    "byColumn",
   :rdf/type         [:qudt/ArrayDataOrderType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "By Column"})

(def ByLeftMostIndex
  "By Left Most Index"
  {:db/ident         :qudt/ByLeftMostIndex,
   :dtype/literal    "byLeftMostIndex",
   :rdf/type         [:qudt/ArrayDataOrderType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "By Left Most Index"})

(def ByRow
  "By Row"
  {:db/ident         :qudt/ByRow,
   :dtype/literal    "byRow",
   :rdf/type         [:qudt/ArrayDataOrderType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "By Row"})

(def ByteAligned
  "Byte Aligned"
  {:db/ident      :qudt/ByteAligned,
   :dtype/literal "byte",
   :rdf/type      [:qudt/AlignmentType :owl/NamedIndividual],
   :rdfs/label    "Byte Aligned"})

(def ByteEncodingType
  "This class contains the various ways that information may be encoded into bytes."
  {:db/ident :qudt/ByteEncodingType,
   :dcterms/description
   "This class contains the various ways that information may be encoded into bytes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Byte Encoding",
   :rdfs/subClassOf :qudt/Encoding})

(def CCT_EarthCentered
  "Earth-centered Coordinate System Type"
  {:db/ident   :qudt/CCT_EarthCentered,
   :rdf/type   [:qudt/CoordinateCenterType :owl/NamedIndividual],
   :rdfs/label "Earth-centered Coordinate System Type"})

(def CCT_MarsCentered
  "Mars-centered Coordinate System Type"
  {:db/ident   :qudt/CCT_MarsCentered,
   :rdf/type   [:qudt/CoordinateCenterType :owl/NamedIndividual],
   :rdfs/label "Mars-centered Coordinate System Type"})

(def CCT_MoonCentered
  "Moon-centered Coordinate System Type"
  {:db/ident   :qudt/CCT_MoonCentered,
   :rdf/type   [:qudt/CoordinateCenterType :owl/NamedIndividual],
   :rdfs/label "Moon-centered Coordinate System Type"})

(def CCT_SunCentered
  "Sun-centered Coordinate System Type"
  {:db/ident   :qudt/CCT_SunCentered,
   :rdf/type   [:qudt/CoordinateCenterType :owl/NamedIndividual],
   :rdfs/label "Sun-centered Coordinate System Type"})

(def CCT_VehicleCentered
  "Vehicle-centered Coordinate System Type"
  {:db/ident   :qudt/CCT_VehicleCentered,
   :rdf/type   [:qudt/CoordinateCenterType :owl/NamedIndividual],
   :rdfs/label "Vehicle-centered Coordinate System Type"})

(def CFN_ConcatenateMatrixRows
  "Concatenate matrix rows"
  {:db/ident   :qudt/CFN_ConcatenateMatrixRows,
   :rdf/type   :qudt/CompositionFunction,
   :rdfs/label "Concatenate matrix rows"})

(def COLOR_AMBER
  "Amber Color"
  {:db/ident     :qudt/COLOR_AMBER,
   :qudt/literal "amber",
   :qudt/rgbCode "#FFBF00",
   :rdf/type     [:qudt/ColorCue :owl/NamedIndividual],
   :rdfs/label   "Amber Color"})

(def COLOR_GREEN
  "Green color"
  {:db/ident     :qudt/COLOR_GREEN,
   :qudt/literal "green",
   :qudt/rgbCode "#008000",
   :rdf/type     [:qudt/ColorCue :owl/NamedIndividual],
   :rdfs/label   "Green color"})

(def COLOR_ORANGE
  "Orange color"
  {:db/ident     :qudt/COLOR_ORANGE,
   :qudt/literal "orange",
   :qudt/rgbCode "#FFA500",
   :rdf/type     [:qudt/ColorCue :owl/NamedIndividual],
   :rdfs/label   "Orange color"})

(def COLOR_RED
  "Red color"
  {:db/ident     :qudt/COLOR_RED,
   :qudt/literal "red",
   :qudt/rgbCode "#FF0000",
   :rdf/type     [:qudt/ColorCue :owl/NamedIndividual],
   :rdfs/label   "Red color"})

(def COLOR_YELLOW
  "Yellow color"
  {:db/ident     :qudt/COLOR_YELLOW,
   :qudt/literal "yellow",
   :qudt/rgbCode "#FFFF00",
   :rdf/type     [:qudt/ColorCue :owl/NamedIndividual],
   :rdfs/label   "Yellow color"})

(def CRC32
  "CRC-32"
  {:db/ident            :qudt/CRC32,
   :owl/equivalentClass {:owl/onDatatype :xsd/integer,
                         :owl/withRestrictions [{:xsd/minInclusive 0.0}
                                                {:xsd/maxInclusive 4294967295.0}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "CRC-32",
   :rdfs/subClassOf     :xsd/integer})

(def CT_COUNTABLY-INFINITE
  "A set of numbers is called countably infinite if there is a way to enumerate them. Formally this is done with a bijection function that associates each number in the set with exactly one of the positive integers. The set of all fractions is also countably infinite. In other words, any set \\(X\\) that has the same cardinality as the set of the natural numbers, or \\(| X | \\; = \\; | \\mathbb N | \\; = \\; \\aleph0\\), is said to be a countably infinite set."
  {:db/ident :qudt/CT_COUNTABLY-INFINITE,
   :dcterms/description
   "A set of numbers is called countably infinite if there is a way to enumerate them.  Formally this is done with a bijection function that associates each number in the set with exactly one of the positive integers.  The set of all fractions is also countably infinite.  In other words, any set \\(X\\) that has the same cardinality as the set of the natural numbers, or \\(| X | \\; =  \\; | \\mathbb N | \\; = \\; \\aleph0\\), is said to be a countably infinite set.",
   :qudt/informativeReference
   "http://www.math.vanderbilt.edu/~schectex/courses/infinity.pdf",
   :qudt/literal "countable",
   :rdf/type [:qudt/CardinalityType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Countably Infinite Cardinality Type"})

(def CT_FINITE
  "Any set \\(X\\) with cardinality less than that of the natural numbers, or \\(| X | \\\\; < \\; | \\\\mathbb N | \\), is said to be a finite set."
  {:db/ident :qudt/CT_FINITE,
   :dcterms/description
   "Any set \\(X\\) with cardinality less than that of the natural numbers, or \\(| X | \\\\; <  \\; | \\\\mathbb N | \\), is said to be a finite set.",
   :qudt/literal "finite",
   :rdf/type [:qudt/CardinalityType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Finite Cardinality Type"})

(def CT_UNCOUNTABLE
  "Any set with cardinality greater than that of the natural numbers, or \\(| X | \\; > \\; | \\mathbb N | \\), for example \\(| R| \\; = \\; c \\; > |\\mathbb N |\\), is said to be uncountable."
  {:db/ident :qudt/CT_UNCOUNTABLE,
   :dcterms/description
   "Any set with cardinality greater than that of the natural numbers, or \\(| X | \\; >  \\; | \\mathbb N | \\),  for example \\(| R| \\; =  \\;  c  \\; > |\\mathbb N |\\), is said to be uncountable.",
   :qudt/literal "uncountable",
   :rdf/type [:qudt/CardinalityType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Uncountable Cardinality Type"})

(def CardinalityType
  "In mathematics, the cardinality of a set is a measure of the number of elements of the set.  For example, the set 'A = {2, 4, 6}' contains 3 elements, and therefore 'A' has a cardinality of 3. There are two approaches to cardinality – one which compares sets directly using bijections and injections, and another which uses cardinal numbers."
  {:db/ident :qudt/CardinalityType,
   :dcterms/description
   "<p class=\"lm-para\">In mathematics, the cardinality of a set is a measure of the number of elements of the set.  For example, the set \\(A = {2, 4, 6}\\) contains 3 elements, and therefore \\(A\\) has a cardinality of 3. There are two approaches to cardinality – one which compares sets directly using bijections and injections, and another which uses cardinal numbers.</p>",
   :owl/oneOf [:qudt/CT_COUNTABLY-INFINITE :qudt/CT_FINITE],
   :prov/wasInfluencedBy ["http://en.wikipedia.org/wiki/Cardinality"
                          "http://en.wikipedia.org/wiki/Cardinal_number"],
   :qudt/informativeReference ["http://en.wikipedia.org/wiki/Cardinality"
                               "http://en.wikipedia.org/wiki/Cardinal_number"],
   :qudt/plainTextDescription
   "In mathematics, the cardinality of a set is a measure of the number of elements of the set.  For example, the set 'A = {2, 4, 6}' contains 3 elements, and therefore 'A' has a cardinality of 3. There are two approaches to cardinality – one which compares sets directly using bijections and injections, and another which uses cardinal numbers.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Cardinality Type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def CartesianCoordinates
  "A set of variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates."
  {:db/ident :qudt/CartesianCoordinates,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Cartesian Coordinate Type",
   :rdfs/subClassOf :qudt/Coordinates})

(def CartesianCoordinatesType
  "A set of variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates."
  {:db/ident :qudt/CartesianCoordinatesType,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates.",
   :rdf/type :owl/Class,
   :rdfs/label "Cartesian Coordinate Type",
   :rdfs/subClassOf :qudt/CompositeDatatype})

(def CharEncoding
  "7 bits of 1 octet"
  {:db/ident            :qudt/CharEncoding,
   :dcterms/description "7 bits of 1 octet",
   :qudt/bytes          1,
   :rdf/type            [:qudt/CharEncodingType
                         :qudt/BooleanEncodingType
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/qudt",
   :rdfs/label          "Char Encoding"})

(def CharEncodingType
  "The class of all character encoding schemes, each of which defines a rule or algorithm for encoding character data as a sequence of bits or bytes."
  {:db/ident :qudt/CharEncodingType,
   :dcterms/description
   "The class of all character encoding schemes, each of which defines a rule or algorithm for encoding character data as a sequence of bits or bytes.",
   :owl/oneOf [:qudt/CharEncoding],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Char Encoding Type",
   :rdfs/subClassOf :qudt/Encoding})

(def CharacterType
  "A Character Type is a data type that defines the type and encoding of single characters."
  {:db/ident :qudt/CharacterType,
   :dcterms/description
   "A Character Type is a data type that defines the type and encoding of single characters.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Character Type",
   :rdfs/subClassOf :qudt/OrdinalType})

(def Citation
  "Provides a simple way of making citations."
  {:db/ident         :qudt/Citation,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Provides a simple way of making citations.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Citation",
   :rdfs/subClassOf  [{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :dcterms/description,
                       :rdf/type        :owl/Restriction}
                      :qudt/Concept]})

(def Collection
  "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type."
  {:db/ident :qudt/Collection,
   :dcterms/description
   "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Collection Type",
   :rdfs/subClassOf :qudt/AbstractDatatype})

(def CollectionType
  "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type."
  {:db/ident :qudt/CollectionType,
   :dcterms/description
   "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type.",
   :rdf/type :owl/Class,
   :rdfs/label "Collection Type",
   :rdfs/subClassOf :qudt/AbstractDatatype})

(def ColorCue
  "A visual cue that uses color to distinguish it from other cues. Each color cue has exactly one corresponding coordinate point in the RGB space."
  {:db/ident :qudt/ColorCue,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A visual cue that uses color to distinguish it from other cues. Each color cue has exactly one corresponding coordinate point in the RGB space.",
   :rdfs/label "Color Cue",
   :rdfs/subClassOf :qudt/VisualCue,
   :sh/property :qudt/ColorCue-rgbCode})

(def ColorCue-rgbCode
  "ColorCue-rgbCode"
  {:db/ident    :qudt/ColorCue-rgbCode,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/rgbCode})

(def Comment
  "Comment"
  {:db/ident         :qudt/Comment,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Comment",
   :rdfs/subClassOf  [{:owl/minCardinality 0,
                       :owl/onProperty     :qudt/rationale,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :dcterms/description,
                       :rdf/type           :owl/Restriction}
                      :owl/Thing
                      :qudt/Verifiable]})

(def CompositeDataStructure
  "'Composite Data Structure', also referred to as 'Data Record' is a datatype that aggregates element of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels."
  {:db/ident :qudt/CompositeDataStructure,
   :prov/wasInfluencedBy
   ["https://en.wikipedia.org/wiki/Record_(computer_science)"
    "https://en.wikipedia.org/wiki/List_of_data_structures"],
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "'Composite Data Structure', also referred to as 'Data Record' is a datatype that aggregates element of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels.",
   :rdfs/label "Composite Data Structure",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property :qudt/CompositeDataStructure-dataElement})

(def CompositeDataStructure-dataElement
  "CompositeDataStructure-dataElement"
  {:db/ident :qudt/CompositeDataStructure-dataElement,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/DataSetElement,
   :sh/path  :qudt/field})

(def CompositeDatatype
  "Composite types are datatypes which can be constructed in a programming language out of that language's basic primitive types and other composite types. The act of constructing a composite type is known as composition."
  {:db/ident :qudt/CompositeDatatype,
   :dcterms/description
   "Composite types are datatypes which can be constructed in a programming language out of that language's basic primitive types and other composite types. The act of constructing a composite type is known as composition.",
   :prov/wasInfluencedBy
   "https://en.wikipedia.org/wiki/List_of_data_structures",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Composite Data Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/padding,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/AlignmentType,
                      :owl/onProperty    :qudt/alignment,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/TypeList,
                      :owl/onProperty    :qudt/elementTypeList,
                      :rdf/type          :owl/Restriction}
                     :qudt/StructuredDatatype
                     {:owl/allValuesFrom :qudt/PaddingType,
                      :owl/onProperty    :qudt/padding,
                      :rdf/type          :owl/Restriction}],
   :sh/property [:qudt/CompositeDatatype-alignment
                 :qudt/CompositeDatatype-padding
                 :qudt/CompositeDatatype-elementType]})

(def CompositeDatatype-alignment
  "CompositeDatatype-alignment"
  {:db/ident :qudt/CompositeDatatype-alignment,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/AlignmentType,
   :sh/path  :qudt/alignment})

(def CompositeDatatype-elementType
  "CompositeDatatype-elementType"
  {:db/ident :qudt/CompositeDatatype-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :qudt/elementType})

(def CompositeDatatype-padding
  "CompositeDatatype-padding"
  {:db/ident    :qudt/CompositeDatatype-padding,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/PaddingType,
   :sh/maxCount 1,
   :sh/path     :qudt/padding})

(def CompositeTable
  "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/CompositeTable,
   :dcterms/description
   "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Composite Table Type",
   :rdfs/subClassOf :qudt/Table})

(def CompositionFunction
  "Composition function"
  {:db/ident        :qudt/CompositionFunction,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Composition function",
   :rdfs/subClassOf :qudt/Function})

(def CompositionTreeType
  "CompositionTreeType"
  {:db/ident        :qudt/CompositionTreeType,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/subClassOf :qudt/TreeType,
   :sh/property     :qudt/CompositionTreeType-compositionFunction})

(def CompositionTreeType-compositionFunction
  "CompositionTreeType-compositionFunction"
  {:db/ident    :qudt/CompositionTreeType-compositionFunction,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CompositionFunction,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/Function})

(def Concept
  "The root class for all QUDT concepts."
  {:db/ident         :qudt/Concept,
   :rdf/type         [:sh/NodeShape :owl/Class],
   :rdfs/comment     "The root class for all QUDT concepts.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "QUDT Concept",
   :rdfs/subClassOf  [{:owl/maxCardinality 1,
                       :owl/onProperty     :dcterms/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Rule,
                       :owl/onProperty    :qudt/hasRule,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/plainTextDescription,
                       :rdf/type           :owl/Restriction}
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/abbreviation,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/supercededBy,
                       :rdf/type           :owl/Restriction}]})

(def Conference
  "Pub techreport type"
  {:db/ident      :qudt/Conference,
   :dtype/literal "conference",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub techreport type"})

(def ConstantValue
  "Used to specify the values of a constant."
  {:db/ident         :qudt/ConstantValue,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Used to specify the values of a constant.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Constant value",
   :rdfs/subClassOf  [{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/exactConstant,
                       :rdf/type           :owl/Restriction}
                      :qudt/QuantityValue]})

(def Container
  "A container is a class, a data structure, or an abstract data type (ADT) whose instances are collections of other objects. They are used to store objects in an organized way following specific access rules."
  {:db/ident :qudt/Container,
   :dcterms/description
   "A container is a class, a data structure, or an abstract data type (ADT) whose instances are collections of other objects. They are used to store objects in an organized way following specific access rules.",
   :owl/equivalentClass [:qudt/Collection :qudt/CollectionType],
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Container",
   :rdfs/subClassOf [:qudt/AbstractDatatype
                     {:owl/hasValue   1,
                      :owl/onProperty :qudt/elementTypeCount,
                      :rdf/type       :owl/Restriction}],
   :sh/property :qudt/Container-elementTypeCount})

(def Container-elementTypeCount
  "Container-elementTypeCount"
  {:db/ident    :qudt/Container-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 1,
   :sh/path     :qudt/elementTypeCount})

(def CoordinateCenterType
  "An enumeration of coordinate centers for coordinate systems, such as \"Earth centered\", \"Mars centered\", \"Moon centered\", \"Sun centered\", and \"Vehicle centered\"."
  {:db/ident :qudt/CoordinateCenterType,
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
   :rdfs/subClassOf [:qudt/NominalScale :qudt/EnumeratedValue],
   :skos/prefLabel ["Coordinate center" "Coordinate center type"]})

(def CoordinateMember
  "A Coordinate Member Type is a data type that defines the properties of a coordinate in a coordinate system."
  {:db/ident :qudt/CoordinateMember,
   :dcterms/description
   "A Coordinate Member Type is a data type that defines the properties of a coordinate in a coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinate Member Type",
   :rdfs/subClassOf [:qudt/TupleMemberType :qudt/TupleMember]})

(def CoordinateSystem
  "In geometry, a coordinate system is a system which uses one or more numbers, or coordinates, to uniquely determine the position of a point or other geometric element on a manifold such as Euclidean space. The order of the coordinates is significant and they are sometimes identified by their position in an ordered tuple and sometimes by a letter, as in 'the x-coordinate'. In elementary mathematics the coordinates are taken to be real numbers, but may be complex numbers or elements of a more abstract system such as a commutative ring. The use of a coordinate system allows problems in geometry to be translated into problems about numbers and vice versa; this is the basis of analytic geometry. In astronomy, a celestial coordinate system is a system for specifying positions of celestial objects: satellites, planets, stars, galaxies, and so on. Coordinate systems can specify a position in 3-dimensional space, or merely the direction of the object on the celestial sphere, if its distance is not known or not important. The coordinate systems are implemented in either spherical coordinates or rectangular coordinates. Spherical coordinates, projected on the celestial sphere, are analogous to the geographic coordinate system used on the surface of the Earth. These differ in their choice of fundamental plane, which divides the celestial sphere into two equal hemispheres along a great circle. Rectangular coordinates, in appropriate units, are simply the cartesian equivalent of the spherical coordinates, with the same fundamental (x,y) plane and primary (x-axis) direction. Each coordinate system is named for its choice of fundamental plane."
  {:db/ident :qudt/CoordinateSystem,
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
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/referenceFrame,
                      :rdf/type        :owl/Restriction}
                     :skos/Concept
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/acronym,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/ReferenceFrame,
                      :owl/onProperty    :qudt/referenceFrame,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/abbreviation,
                      :rdf/type        :owl/Restriction}
                     :qudt/Concept
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/coordinateCenter,
                      :rdf/type        :owl/Restriction}],
   :sh/property [:qudt/CoordinateSystem-coordinateCenter
                 :qudt/CoordinateSystem-referenceFrame
                 :qudt/CoordinateSystem-acronym
                 :qudt/CoordinateSystem-abbreviation]})

(def CoordinateSystem-abbreviation
  "CoordinateSystem-abbreviation"
  {:db/ident    :qudt/CoordinateSystem-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/abbreviation})

(def CoordinateSystem-acronym
  "CoordinateSystem-acronym"
  {:db/ident    :qudt/CoordinateSystem-acronym,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :vaem/acronym})

(def CoordinateSystem-coordinateCenter
  "CoordinateSystem-coordinateCenter"
  {:db/ident    :qudt/CoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CoordinateCenterType,
   :sh/maxCount 1,
   :sh/path     :qudt/coordinateCenter})

(def CoordinateSystem-referenceFrame
  "CoordinateSystem-referenceFrame"
  {:db/ident    :qudt/CoordinateSystem-referenceFrame,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/ReferenceFrame,
   :sh/maxCount 1,
   :sh/path     :qudt/referenceFrame})

(def CoordinateSystemFrame
  "Coordinate system frame"
  {:db/ident         :qudt/CoordinateSystemFrame,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Coordinate system frame",
   :rdfs/subClassOf  :skos/Concept})

(def CoordinateSystemType
  "The primary attributes of any coordinate system are the coordinate frame or orientation of the axes of the coordinate system and the coordinate center or origin of the coordinate system. The coordinate center is the easier of the two attributes to define and in trajectory-related coordinate systems is often taken to be the center of mass of natural solar system bodies such as the Earth, the Moon, or Mars. Precise definition of the coordinate frame, however, usually takes much more effort. As a result, the primary purpose of this section is to provide a detailed description of a number of different coordinate frames commonly used in lunar and Mars mission analysis. All of the coordinate frames described in this section are standard, right-handed coordinate frames with orthogonal axes at the origin. In general, the coordinate frame and the coordinate center are independent quantities. In other words, multiple coordinate systems can be defined using the same coordinate center (with different frames) or the same coordinate frame (with different centers)."
  {:db/ident :qudt/CoordinateSystemType,
   :dcterms/description
   "The primary attributes of any coordinate system are the coordinate frame or orientation of the axes of the coordinate system and the coordinate center or origin of the coordinate system. The coordinate center is the easier of the two attributes to define and in trajectory-related coordinate systems is often taken to be the center of mass of natural solar system bodies such as the Earth, the Moon, or Mars. Precise definition of the coordinate frame, however, usually takes much more effort. As a result, the primary purpose of this section is to provide a detailed description of a number of different coordinate frames commonly used in lunar and Mars mission analysis. All of the coordinate frames described in this section are standard, right-handed coordinate frames with orthogonal axes at the origin. In general, the coordinate frame and the coordinate center are independent quantities. In other words, multiple coordinate systems can be defined using the same coordinate center (with different frames) or the same coordinate frame (with different centers). ",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/comment
   "<p>A coordinate system is a mathematical structure for assigning a unique n-tuple of numbers or scalars to each point in an n-dimensional space. A Coordinate System Type is a data type that defines the properties of data structures that represent coordinate systems.</p>\n\n<p>The primary attributes of any coordinate system are the coordinate frame or orientation of the axes of the coordinate system and the coordinate center or origin of the coordinate system. The coordinate center is the easier of the two attributes to define and in trajectory-related coordinate systems is often taken to be the center of mass of natural solar system bodies such as the Earth, the Moon, or Mars. Precise definition of the coordinate frame, however, usually takes much more effort. As a result, the primary purpose of this section is to provide a detailed description of a number of different coordinate frames commonly used in lunar and Mars mission analysis. </p>",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label ["Coordinate System Type" "Coordinate system type"],
   :rdfs/subClassOf [:qudt/TupleType
                     :qudt/EnumeratedValue
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/originDefinition,
                      :rdf/type        :owl/Restriction}],
   :sh/property [:qudt/Coordinates-elementType
                 :qudt/CoordinateSystemType-originDefinition]})

(def CoordinateSystemType-originDefinition
  "CoordinateSystemType-originDefinition"
  {:db/ident    :qudt/CoordinateSystemType-originDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/originDefinition})

(def Coordinates
  "A coordinate system is a mathematical structure for assigning a unique n-tuple of numbers or scalars to each point in an n-dimensional space. A Coordinate System Type is a data type that defines the properties of data structures that represent coordinate systems."
  {:db/ident :qudt/Coordinates,
   :dcterms/description
   "A coordinate system is a mathematical structure for assigning a unique n-tuple of numbers or scalars to each point in an n-dimensional space. A Coordinate System Type is a data type that defines the properties of data structures that represent coordinate systems.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinate System Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/CoordinateMember,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/Tuple]})

(def Coordinates-2D
  "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system."
  {:db/ident :qudt/Coordinates-2D,
   :dcterms/description
   "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "2D Coordinate Type",
   :rdfs/subClassOf [:qudt/Two-Tuple :qudt/CartesianCoordinates]})

(def Coordinates-2D-DoublePrecision
  "2D coordinates in double floating point precision for locating a point in physical space"
  {:db/ident :qudt/Coordinates-2D-DoublePrecision,
   :dcterms/description
   "2D coordinates in double floating point precision for locating a point in physical space",
   :qudt/elementTypeCount 2,
   :rdf/type [:owl/Class :qudt/Coordinates-2D-Type],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinates-2D-Double precision",
   :rdfs/subClassOf
   [{:owl/allValuesFrom :xsd/double,
     :owl/onProperty    :qudt/Coordinates-2D-DoublePrecision-Double_Y,
     :rdf/type          :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/Coordinates-2D-DoublePrecision-Double_Y,
     :rdf/type        :owl/Restriction}
    {:owl/allValuesFrom :xsd/double,
     :owl/onProperty    :qudt/Coordinates-2D-DoublePrecision-Double_X,
     :rdf/type          :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/Coordinates-2D-DoublePrecision-Double_X,
     :rdf/type        :owl/Restriction}
    :qudt/Coordinates-2D]})

(def Coordinates-2D-DoublePrecision-Double_X
  "Coordinates-2D-DoublePrecision-Double_X"
  {:db/ident    :qudt/Coordinates-2D-DoublePrecision-Double_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/Coordinates-2D-DoublePrecision-Double_X})

(def Coordinates-2D-DoublePrecision-Double_Y
  "Coordinates-2D-DoublePrecision-Double_Y"
  {:db/ident    :qudt/Coordinates-2D-DoublePrecision-Double_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/Coordinates-2D-DoublePrecision-Double_Y,})

(def Coordinates-2D-SinglePrecision
  "2D coordinates in single floating point precision for locating a point in physical space"
  {:db/ident :qudt/Coordinates-2D-SinglePrecision,
   :dcterms/description
   "2D coordinates in single floating point precision for locating a point in physical space",
   :qudt/elementTypeCount 2,
   :rdf/type [:owl/Class :qudt/Coordinates-2D-Type],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Cartesian Coordinates 2D Single Precision",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/float_X,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/float_Y,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt/float_Y,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt/float_X,
                      :rdf/type          :owl/Restriction}
                     :qudt/Coordinates-2D]})

(def Coordinates-2D-SinglePrecision-float_X
  "Coordinates-2D-SinglePrecision-float_X"
  {:db/ident    :qudt/Coordinates-2D-SinglePrecision-float_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/float_X})

(def Coordinates-2D-SinglePrecision-float_Y
  "Coordinates-2D-SinglePrecision-float_Y"
  {:db/ident    :qudt/Coordinates-2D-SinglePrecision-float_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/float_Y})

(def Coordinates-2D-Type
  "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system."
  {:db/ident :qudt/Coordinates-2D-Type,
   :dcterms/description
   "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/label "2D Coordinate Type",
   :rdfs/subClassOf [:qudt/TwoTupleType :qudt/CartesianCoordinatesType]})

(def Coordinates-3D
  "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system."
  {:db/ident :qudt/Coordinates-3D,
   :dcterms/description
   "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "3D Coordinate Type",
   :rdfs/subClassOf [:qudt/Three-Tuple :qudt/CartesianCoordinates]})

(def Coordinates-3D-DoublePrecision
  "3D coordinates in double floating point precision for locating a point in physical space"
  {:db/ident :qudt/Coordinates-3D-DoublePrecision,
   :dcterms/description
   "3D coordinates in double floating point precision for locating a point in physical space",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "3D Coordinates (Double Precision)",
   :rdfs/subClassOf
   [{:owl/cardinality 1,
     :owl/onProperty  :qudt/Coordinates-3D-DoublePrecision-Double_Y,
     :rdf/type        :owl/Restriction}
    :qudt/Coordinates-3D
    {:owl/allValuesFrom :xsd/double,
     :owl/onProperty    :qudt/Coordinates-3D-DoublePrecision-Double_Z,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom :xsd/double,
     :owl/onProperty    :qudt/Coordinates-3D-DoublePrecision-Double_Y,
     :rdf/type          :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/Coordinates-3D-DoublePrecision-Double_Z,
     :rdf/type        :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/Coordinates-3D-DoublePrecision-Double_X,
     :rdf/type        :owl/Restriction}
    {:owl/allValuesFrom :xsd/double,
     :owl/onProperty    :qudt/Coordinates-3D-DoublePrecision-Double_X,
     :rdf/type          :owl/Restriction}]})

(def Coordinates-3D-DoublePrecision-Double_X
  "Coordinates-3D-DoublePrecision-Double_X"
  {:db/ident    :qudt/Coordinates-3D-DoublePrecision-Double_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/Coordinates-3D-DoublePrecision-Double_X,})

(def Coordinates-3D-DoublePrecision-Double_Y
  "Coordinates-3D-DoublePrecision-Double_Y"
  {:db/ident    :qudt/Coordinates-3D-DoublePrecision-Double_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/Coordinates-3D-DoublePrecision-Double_Y,})

(def Coordinates-3D-DoublePrecision-Double_Z
  "Coordinates-3D-DoublePrecision-Double_Z"
  {:db/ident    :qudt/Coordinates-3D-DoublePrecision-Double_Z,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/Coordinates-3D-DoublePrecision-Double_Z,})

(def Coordinates-3D-DoublePrecision-Type
  "3D coordinates in double floating point precision for locating a point in physical space"
  {:db/ident   :qudt/Coordinates-3D-DoublePrecision-Type,
   :dcterms/description
   "3D coordinates in double floating point precision for locating a point in physical space",
   :qudt/elementTypeCount 3,
   :rdf/type   :qudt/Coordinates-3D-Type,
   :rdfs/label "3D Coordinates (Double Precision) type"})

(def Coordinates-3D-SinglePrecision
  "3D coordinates in single floating point precision for locating a point in physical space"
  {:db/ident :qudt/Coordinates-3D-SinglePrecision,
   :dcterms/description
   "3D coordinates in single floating point precision for locating a point in physical space",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "3D Coordinates (Single Precision)",
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt/float_Y,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/float_Z,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/float_X,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/float_Y,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt/float_Z,
                      :rdf/type          :owl/Restriction}
                     :qudt/Coordinates-3D
                     {:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt/float_X,
                      :rdf/type          :owl/Restriction}]})

(def Coordinates-3D-SinglePrecision-Type
  "3D coordinates in single floating point precision for locating a point in physical space"
  {:db/ident   :qudt/Coordinates-3D-SinglePrecision-Type,
   :dcterms/description
   "3D coordinates in single floating point precision for locating a point in physical space",
   :qudt/elementTypeCount 3,
   :rdf/type   :qudt/Coordinates-3D-Type,
   :rdfs/label "3D Coordinates (Single Precision)"})

(def Coordinates-3D-SinglePrecision-float_X
  "Coordinates-3D-SinglePrecision-float_X"
  {:db/ident    :qudt/Coordinates-3D-SinglePrecision-float_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/float_X})

(def Coordinates-3D-SinglePrecision-float_Y
  "Coordinates-3D-SinglePrecision-float_Y"
  {:db/ident    :qudt/Coordinates-3D-SinglePrecision-float_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/float_Y})

(def Coordinates-3D-SinglePrecision-float_Z
  "Coordinates-3D-SinglePrecision-float_Z"
  {:db/ident    :qudt/Coordinates-3D-SinglePrecision-float_Z,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/float_Z})

(def Coordinates-3D-Type
  "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system."
  {:db/ident :qudt/Coordinates-3D-Type,
   :dcterms/description
   "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/label "3D Coordinate Type",
   :rdfs/subClassOf [:qudt/ThreeTupleType :qudt/CartesianCoordinatesType]})

(def Coordinates-elementType
  "Coordinates-elementType"
  {:db/ident :qudt/Coordinates-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/CoordinateMember,
   :sh/path  :qudt/elementType})

(def CountingUnit
  "Used for all units that express counts. Examples are Atomic Number, Number, Number per Year, Percent and Sample per Second."
  {:db/ident :qudt/CountingUnit,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Used for all units that express counts. Examples are Atomic Number, Number, Number per Year, Percent and Sample per Second.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Counting Unit",
   :rdfs/subClassOf :qudt/DimensionlessUnit})

(def CurrencyUnit
  "Used for all units that express currency. Currency Units have their own subclass of unit because: (a) they have additonal properites such as 'country' and (b) their URIs do not conform to the same rules as other units."
  {:db/ident :qudt/CurrencyUnit,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Used for all units that express currency."
    "Currency Units have their own subclass of unit because: (a) they have additonal properites such as 'country' and (b) their URIs do not conform to the same rules as other units."],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Currency Unit",
   :rdfs/subClassOf :qudt/DimensionlessUnit})

(def DATE
  "Provides the date expressed in year, month and day."
  {:db/ident          :qudt/DATE,
   :dcterms/description "Provides the date expressed in year, month and day.",
   :dtype/literal     "date",
   :qudt/dimensionality 1,
   :qudt/encodingDescription
   "YYYY:MM:DD, where YYYY is a 4 digit year, MM is a 2 digit month and DD is a 2 digit day.",
   :qudt/rdfsDatatype :xsd/date,
   :rdf/type          [:qudt/DateStringType :owl/NamedIndividual],
   :rdfs/label        "Date"})

(def DATETIME
  "A time stamp encoded as a string 'YYYY-MM-DDThh:mm:ss[.dd]' or 'YYYY-DDDThh:mm:ss[.dd]', where 'YYYY' is the year, 'MM' is the two-digit month, 'DD' is the two-digit day, 'DDD' is the three digit day of year, 'T' is constant, 'hh:mm:ss[.dd]' is the UTC time in hours, minutes, seconds, and optional fractional seconds. As many 'd' characters to the right of the period as required may be used to obtain the required precision. All fields require leading zeros."
  {:db/ident :qudt/DATETIME,
   :dcterms/description
   "A time stamp encoded as a string 'YYYY-MM-DDThh:mm:ss[.dd]' or 'YYYY-DDDThh:mm:ss[.dd]', where 'YYYY' is the year, 'MM' is the two-digit month, 'DD' is the two-digit day, 'DDD' is the three digit day of year, 'T' is constant, 'hh:mm:ss[.dd]' is the UTC time in hours, minutes, seconds, and optional fractional seconds. As many 'd' characters to the right of the period as required may be used to obtain the required precision. All fields require leading zeros.",
   :dtype/literal "datetime",
   :owl/sameAs :qudt/UTC-DATETIME,
   :qudt/dimensionality 1,
   :qudt/rdfsDatatype :xsd/dateTime,
   :rdf/type [:qudt/DateStringType :owl/NamedIndividual],
   :rdfs/label "Date Time"})

(def DECIMAL
  "Decimal"
  {:db/ident           :qudt/DECIMAL,
   :dtype/literal      "numeric",
   :qudt/ansiSQLName   "DECIMAL(p,s)",
   :qudt/odbcName      "SQL_DECIMAL(p,s)",
   :qudt/oracleSQLName "NUMBER(p,s)",
   :qudt/rdfsDatatype  :xsd/decimal,
   :rdf/type           [:qudt/NumericType :owl/NamedIndividual],
   :rdfs/label         "Decimal"})

(def DataElement-type
  "DataElement-type"
  {:db/ident    :qudt/DataElement-type,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/dataType})

(def DataEncoding
  "<p><em>Data Encoding</em> expresses the properties that specify how data is represented at the bit and byte level. These properties are applicable to describing raw data.</p>"
  {:db/ident :qudt/DataEncoding,
   :rdf/type :owl/Class,
   :rdfs/comment
   "<p><em>Data Encoding</em> expresses the properties that specify how data is represented at the bit and byte level. These properties are applicable to describing raw data.</p>",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Data Encoding",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/byteOrder,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bitOrder,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/encoding,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/EndianType,
                      :owl/onProperty    :qudt/bitOrder,
                      :rdf/type          :owl/Restriction}
                     :qudt/Aspect
                     {:owl/allValuesFrom :qudt/Encoding,
                      :owl/onProperty    :qudt/encoding,
                      :rdf/type          :owl/Restriction}]})

(def DataSetElement
  "A field is a tuple that carries a name, a type and optionally other properties that characterize a member element of a composite data strucuture."
  {:db/ident :qudt/DataSetElement,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A field is a tuple that carries a name, a type and optionally other properties that characterize a member element of a composite data strucuture.",
   :rdfs/label "QUDT DataSet Element",
   :rdfs/subClassOf [:qudt/Tuple],
   :sh/property [:qudt/DataSetElement-quantityKind
                 :qudt/DataSetElement-optional
                 :qudt/DataSetElement-elementLabel]})

(def DataSetElement-elementLabel
  "DataSetElement-elementLabel"
  {:db/ident    :qudt/DataSetElement-elementLabel,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/elementLabel})

(def DataSetElement-optional
  "DataSetElement-optional"
  {:db/ident    :qudt/DataSetElement-optional,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/optional})

(def DataSetElement-quantityKind
  "DataSetElement-quantityKind"
  {:db/ident    :qudt/DataSetElement-quantityKind,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/QuantityKind,
   :sh/maxCount 1,
   :sh/path     :qudt/hasQuantityKind})

(def Datatype
  "A data type is a definition of a set of values (for example, \"all integers between 0 and 10\"), and the allowable operations on those values; the meaning of the data; and the way values of that type can be stored. Some types are primitive - built-in to the language, with no visible internal structure - e.g. Boolean; others are composite - constructed from one or more other types (of either kind) - e.g. lists, arrays, structures, unions. Object-oriented programming extends this with classes which encapsulate both the structure of a type and the operations that can be performed on it. Some languages provide strong typing, others allow implicit type conversion and/or explicit type conversion."
  {:db/ident :qudt/Datatype,
   :dcterms/description
   "A data type is a definition of a set of values (for example, \"all integers between 0 and 10\"), and the allowable operations on those values; the meaning of the data; and the way values of that type can be stored. Some types are primitive - built-in to the language, with no visible internal structure - e.g. Boolean; others are composite - constructed from one or more other types (of either kind) - e.g. lists, arrays, structures, unions. Object-oriented programming extends this with classes which encapsulate both the structure of a type and the operations that can be performed on it. Some languages provide strong typing, others allow implicit type conversion and/or explicit type conversion.",
   :qudt/informativeReference
   ["http://en.wikipedia.org/wiki/Data_type"
    "http://foldoc.org/data+type"
    "http://www.princeton.edu/~achaney/tmve/wiki100k/docs/Data_type.html"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "QUDT Datatype",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/pythonName,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :qudt/mySQLName,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :qudt/basis,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/basis,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/jsName,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/oracleSQLName,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/odbcName,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/microsoftSQLServerName,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/oleDBName,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/protocolBuffersName,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/ansiSQLName,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/OrderedType,
                      :owl/onProperty    :qudt/orderedType,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/cName,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bounded,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/id,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/orderedType,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/vbName,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/matlabName,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/CardinalityType,
                      :owl/onProperty    :qudt/cardinality,
                      :rdf/type          :owl/Restriction}
                     :qudt/Concept
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/javaName,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/cardinality,
                      :rdf/type           :owl/Restriction}]})

(def Datatype-ansiSQLName
  "Datatype-ansiSQLName"
  {:db/ident    :qudt/Datatype-ansiSQLName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/ansiSQLName})

(def Datatype-basis
  "Datatype-basis"
  {:db/ident    :qudt/Datatype-basis,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/maxCount 1,
   :sh/path     :qudt/basis})

(def Datatype-bounded
  "Datatype-bounded"
  {:db/ident    :qudt/Datatype-bounded,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt/bounded})

(def Datatype-cName
  "Datatype-cName"
  {:db/ident    :qudt/Datatype-cName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/cName})

(def Datatype-cardinality
  "Datatype-cardinality"
  {:db/ident    :qudt/Datatype-cardinality,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CardinalityType,
   :sh/maxCount 1,
   :sh/path     :qudt/cardinality})

(def Datatype-description
  "Datatype-description"
  {:db/ident       :qudt/Datatype-description,
   :rdf/type       :sh/PropertyShape,
   :sh/deactivated true,
   :sh/maxCount    1,
   :sh/path        :vaem/description})

(def Datatype-id
  "Datatype-id"
  {:db/ident       :qudt/Datatype-id,
   :rdf/type       :sh/PropertyShape,
   :sh/datatype    :xsd/string,
   :sh/deactivated true,
   :sh/path        :qudt/id})

(def Datatype-javaName
  "Datatype-javaName"
  {:db/ident    :qudt/Datatype-javaName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/javaName})

(def Datatype-jsName
  "Datatype-jsName"
  {:db/ident    :qudt/Datatype-jsName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/jsName})

(def Datatype-matlabName
  "Datatype-matlabName"
  {:db/ident    :qudt/Datatype-matlabName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/matlabName})

(def Datatype-microsoftSQLServerName
  "Datatype-microsoftSQLServerName"
  {:db/ident    :qudt/Datatype-microsoftSQLServerName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/microsoftSQLServerName})

(def Datatype-mySQLName
  "Datatype-mySQLName"
  {:db/ident    :qudt/Datatype-mySQLName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/mySQLName})

(def Datatype-odbcName
  "Datatype-odbcName"
  {:db/ident    :qudt/Datatype-odbcName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/odbcName})

(def Datatype-oleDBName
  "Datatype-oleDBName"
  {:db/ident    :qudt/Datatype-oleDBName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/oleDBName})

(def Datatype-oracleSQLName
  "Datatype-oracleSQLName"
  {:db/ident    :qudt/Datatype-oracleSQLName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/oracleSQLName})

(def Datatype-protocolBuffersName
  "Datatype-protocolBuffersName"
  {:db/ident    :qudt/Datatype-protocolBuffersName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/protocolBuffersName})

(def Datatype-pythonName
  "Datatype-pythonName"
  {:db/ident    :qudt/Datatype-pythonName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/pythonName})

(def Datatype-vbName
  "Datatype-vbName"
  {:db/ident    :qudt/Datatype-vbName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/vbName})

(def DateStringType
  "Date String Types are scalar data types that define the properties of strings that represent calendar dates."
  {:db/ident :qudt/DateStringType,
   :dcterms/description
   "Date String Types are scalar data types that define the properties of strings that represent calendar dates.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Date String Type",
   :rdfs/subClassOf :qudt/DateTimeStringType})

(def DateTimeStringEncodingType
  "Date Time encodings are logical encodings for expressing date/time quantities as strings by applying unambiguous formatting and parsing rules."
  {:db/ident :qudt/DateTimeStringEncodingType,
   :dcterms/description
   "Date Time encodings are logical encodings for expressing date/time quantities as strings by applying unambiguous formatting and parsing rules.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Date Time String Encoding Type",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :qudt/allowedPattern,
                      :rdf/type        :owl/Restriction}
                     :qudt/StringEncodingType],
   :sh/property [{:sh/path :qudt/allowedPattern,
                  :sh/qualifiedMinCount 1,
                  :sh/qualifiedValueShape {:sh/datatype :xsd/string}}
                 :qudt/DateTimeStringEncodingType-allowedPattern]})

(def DateTimeStringEncodingType-allowedPattern
  "DateTimeStringEncodingType-allowedPattern"
  {:db/ident    :qudt/DateTimeStringEncodingType-allowedPattern,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :qudt/allowedPattern})

(def DateTimeStringType
  "A class of data types for structures that represent temporal quantities. I.e. calendar dates, times, duration of time since a given epoch, etc."
  {:db/ident :qudt/DateTimeStringType,
   :dcterms/description
   "A class of data types for structures that represent temporal quantities. I.e. calendar dates, times, duration of time since a given epoch, etc.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Temporal Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/encoding,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/DateTimeStringEncodingType,
                      :owl/onProperty    :qudt/encoding,
                      :rdf/type          :owl/Restriction}
                     :qudt/StringType],
   :sh/property :qudt/DateTimeStringType-encoding})

(def DateTimeStringType-encoding
  "DateTimeStringType-encoding"
  {:db/ident    :qudt/DateTimeStringType-encoding,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/DateTimeStringEncodingType,
   :sh/maxCount 1,
   :sh/path     :qudt/encoding})

(def DecimalPrefix
  "A <em>Decimal Prefix</em> is a prefix for multiples of units that are powers of 10."
  {:db/ident :qudt/DecimalPrefix,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A <em>Decimal Prefix</em> is a prefix for multiples of units that are powers of 10.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Decimal Prefix",
   :rdfs/subClassOf :qudt/Prefix})

(def DecimalScaledUnit
  "A sub-type of 'Scaled unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/DecimalScaledUnit,
   :dcterms/description
   "A sub-type of 'Scaled unit'. Detailed desciption to be provided in a future version."})

(def DerivedCoherentUnit
  "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/DerivedCoherentUnit,
   :dcterms/description
   "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."})

(def DerivedNonCoherentUnit
  "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/DerivedNonCoherentUnit,
   :dcterms/description
   "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."})

(def DerivedUnit
  "A DerivedUnit is a type specification for units that are derived from other units."
  {:db/ident :qudt/DerivedUnit,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Category:SI_derived_units",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A DerivedUnit is a type specification for units that are derived from other units.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Derived Unit",
   :rdfs/subClassOf :qudt/Unit})

(def Dictionary
  "A \"Map\"."
  {:db/ident            :qudt/Dictionary,
   :dcterms/description "A \"Map\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Dictionary Type",
   :rdfs/subClassOf     :qudt/Map})

(def DictionaryType
  "A kind of \"Map\"."
  {:db/ident            :qudt/DictionaryType,
   :dcterms/description "A kind of \"Map\".",
   :rdf/type            :owl/Class,
   :rdfs/label          "Dictionary Type",
   :rdfs/subClassOf     :qudt/MapType})

(def DimensionVector
  "Dimension Vector"
  {:db/ident         :qudt/DimensionVector,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Dimension Vector",
   :rdfs/subClassOf  :skos/Concept})

(def DimensionalDatatype
  "A dimensional data type is a data type that specifies a physical quantity or unit of measure. Information about the physical dimensions of the quantities and units is embedded in their types."
  {:db/ident :qudt/DimensionalDatatype,
   :dcterms/description
   "A dimensional data type is a data type that specifies a physical quantity or unit of measure. Information about the physical dimensions of the quantities and units is embedded in their types.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Dimensional Data Type",
   :rdfs/subClassOf :qudt/StructuredDatatype})

(def DimensionlessUnit
  "A Dimensionless Unit is a quantity for which all the exponents of the factors corresponding to the base quantities in its quantity dimension are zero."
  {:db/ident :qudt/DimensionlessUnit,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Dimensionless Unit is a quantity for which all the exponents of the factors corresponding to the base quantities in its quantity dimension are zero.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Dimensionless Unit",
   :rdfs/subClassOf :qudt/Unit})

(def Discipline
  "Discipline"
  {:db/ident         :qudt/Discipline,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Discipline",
   :rdfs/subClassOf  :qudt/Concept})

(def DiscreteState
  "DiscreteState"
  {:db/ident         :qudt/DiscreteState,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/subClassOf  :qudt/EnumeratedValue})

(def DoublePrecisionEncoding
  "Single Precision Real Encoding"
  {:db/ident         :qudt/DoublePrecisionEncoding,
   :qudt/bytes       64,
   :rdf/type         [:qudt/FloatingPointEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Single Precision Real Encoding"})

(def DoublePrecisionType
  "A double precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so double precision data value on a 32-bit machine architecture occupies eight bytes of memory."
  {:db/ident :qudt/DoublePrecisionType,
   :dcterms/description
   "A double precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so double precision data value on a 32-bit machine architecture occupies eight bytes of memory.",
   :owl/disjointWith :qudt/SinglePrecisionType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Double Precision Type",
   :rdfs/subClassOf :qudt/NumericType})

(def EarthCoordinateSystem
  "A\"Trajectory Coordinate System\" for all earth-centered coordinates, such as \"Earth mean equator and prime meridian coordinate system\", \"Earth true equator and prime meridian of epoch coordinate system\", \"International celestial reference system\", \"International terrestrial reference system\", \"Sun centered international celestial reference system\", \"Vehicle centered international celestial reference system\"."
  {:db/ident :qudt/EarthCoordinateSystem,
   :dcterms/description
   "A\"Trajectory Coordinate System\" for all earth-centered coordinates, such as \"Earth mean equator and prime meridian coordinate system\", \"Earth true equator and prime meridian of epoch coordinate system\", \"International celestial reference system\", \"International terrestrial reference system\", \"Sun centered international celestial reference system\", \"Vehicle centered international celestial reference system\".",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Earth Coordinate System Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/CC_EarthCentered,
                      :owl/onProperty :qudt/coordinateCenter,
                      :rdf/type       :owl/Restriction}
                     :qudt/TrajectoryCoordinateSystem],
   :sh/property :qudt/EarthCoordinateSystem-coordinateCenter})

(def EarthCoordinateSystem-coordinateCenter
  "EarthCoordinateSystem-coordinateCenter"
  {:db/ident    :qudt/EarthCoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CoordinateCenterType,
   :sh/hasValue :qudt.type/CC_EarthCentered,
   :sh/path     :qudt/coordinateCenter})

(def Encoding
  "An encoding is a rule or algorithm that is used to convert data from a native, or unspecified form into a specific form that satisfies the encoding rules. Examples of encodings include character encodings, such as UTF-8."
  {:db/ident :qudt/Encoding,
   :dcterms/description
   "An encoding is a rule or algorithm that is used to convert data from a native, or unspecified form into a specific form that satisfies the encoding rules. Examples of encodings include character encodings, such as UTF-8.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Encoding",
   :rdfs/subClassOf [:skos/Concept
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bytes,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bits,
                      :rdf/type           :owl/Restriction}],
   :sh/property [:qudt/Encoding-bytes :qudt/Encoding-bits]})

(def Encoding-bits
  "Encoding-bits"
  {:db/ident    :qudt/Encoding-bits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/bits})

(def Encoding-bytes
  "Encoding-bytes"
  {:db/ident    :qudt/Encoding-bytes,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/bytes})

(def EndianType
  "Endian Type"
  {:db/ident         :qudt/EndianType,
   :owl/oneOf        [:qudt.type/LittleEndian :qudt.type/BigEndian],
   :qudt/informativeReference "http://en.wikipedia.org/wiki/Endianness",
   :qudt/plainTextDescription
   "In computing, endianness is the ordering used to represent some kind of data as a sequence of smaller units. Typical cases are the order in which integer values are stored as bytes in computer memory (relative to a given memory addressing scheme) and the transmission order over a network or other medium. When specifically talking about bytes, endianness is also referred to simply as byte order.  Most computer processors simply store integers as sequences of bytes, so that, conceptually, the encoded value can be obtained by simple concatenation. For an 'n-byte' integer value this allows 'n!' (n factorial) possible representations (one for each byte permutation). The two most common of them are: increasing numeric significance with increasing memory addresses, known as little-endian, and its opposite, called big-endian.",
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Endian Type",
   :rdfs/subClassOf  :qudt/EnumeratedValue})

(def EngineeringValueTupleMember
  "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/EngineeringValueTupleMember,
   :dcterms/description
   "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version.",
   :owl/disjointWith [:qudt/RawValueTupleMemberType :qudt/RawValueTupleMember],
   :owl/equivalentClass {:owl/intersectionOf
                         [:qudt/TupleMemberType
                          {:owl/allValuesFrom :qudt/RealSinglePrecisionType,
                           :owl/onProperty    :qudt/elementType,
                           :rdf/type          :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Engineering Value Tuple Member",
   :rdfs/subClassOf [:qudt/TupleMember
                     {:owl/allValuesFrom :qudt/RealSinglePrecisionType,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/TupleMemberType],
   :sh/property :qudt/EngineeringValueTupleMember-elementType})

(def EngineeringValueTupleMember-elementType
  "EngineeringValueTupleMember-elementType"
  {:db/ident :qudt/EngineeringValueTupleMember-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/RealSinglePrecisionType,
   :sh/path  :qudt/elementType})

(def EnumeratedQuantity
  "Enumerated Quantity"
  {:db/ident        :qudt/EnumeratedQuantity,
   :rdf/type        :qudt/AspectClass,
   :rdfs/label      "Enumerated Quantity",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/Enumeration,
                      :owl/onProperty    :qudt/enumeration,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/EnumeratedValue,
                      :owl/onProperty    :qudt/enumeratedValue,
                      :rdf/type          :owl/Restriction}
                     :qudt/Concept]})

(def EnumeratedValue
  "<p>This class is for all enumerated and/or coded values. For example, it contains the dimension objects that are the basis elements in some abstract vector space associated with a quantity kind system. Another use is for the base dimensions for quantity systems. Each quantity kind system that defines a base set has a corresponding ordered enumeration whose elements are the dimension objects for the base quantity kinds. The order of the dimensions in the enumeration determines the canonical order of the basis elements in the corresponding abstract vector space.</p> <p>An enumeration is a set of literals from which a single value is selected. Each literal can have a tag as an integer within a standard encoding appropriate to the range of integer values. Consistency of enumeration types will allow them, and the enumerated values, to be referred to unambiguously either through symbolic name or encoding. Enumerated values are also controlled vocabularies and as such need to be standardized. Without this consistency enumeration literals can be stated differently and result in data conflicts and misinterpretations.</p> <p>The tags are a set of positive whole numbers, not necessarily contiguous and having no numerical significance, each corresponding to the associated literal identifier. An order attribute can also be given on the enumeration elements. An enumeration can itself be a member of an enumeration. This allows enumerations to be enumerated in a selection. Enumerations are also subclasses of Scalar Datatype. This allows them to be used as the reference of a datatype specification.</p>"
  {:db/ident :qudt/EnumeratedValue,
   :dcterms/description
   "<p>This class is for all enumerated and/or coded values.  For example, it contains the dimension objects that are the basis elements in some abstract vector space associated with a quantity kind system. Another use is for the base dimensions for quantity systems. Each quantity kind system that defines a base set has a corresponding ordered enumeration whose elements are the dimension objects for the base quantity kinds. The order of the dimensions in the enumeration determines the canonical order of the basis elements in the corresponding abstract vector space.</p>\n\n<p>An enumeration is a set of literals from which a single value is selected. Each literal can have a tag as an integer within a standard encoding appropriate to the range of integer values. Consistency of enumeration types will allow them, and the enumerated values, to be referred to unambiguously either through symbolic name or encoding. Enumerated values are also controlled vocabularies and as such need to be standardized. Without this consistency enumeration literals can be stated differently and result in  data conflicts and misinterpretations.</p>\n\n<p>The tags are a set of positive whole numbers, not necessarily contiguous and having no numerical significance, each corresponding to the associated literal identifier. An order attribute can also be given on the enumeration elements. An enumeration can itself be a member of an enumeration. This allows enumerations to be enumerated in a selection. Enumerations are also subclasses of Scalar Datatype. This allows them to be used as the reference of a datatype specification.</p>",
   :qudt/informativeReference "http://en.wikipedia.org/wiki/Enumeration",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Enumerated Value",
   :rdfs/subClassOf [:qudt/Concept
                     :dtype/EnumeratedValue
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/symbol,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :dcterms/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/abbreviation,
                      :rdf/type           :owl/Restriction}]})

(def Enumeration
  "An enumeration is a set of literals from which a single value is selected. Each literal can have a tag as an integer within a standard encoding appropriate to the range of integer values. Consistency of enumeration types will allow them, and the enumerated values, to be referred to unambiguously either through symbolic name or encoding. Enumerated values are also controlled vocabularies and as such need to be standardized. Without this consistency enumeration literals can be stated differently and result in  data conflicts and misinterpretations.</p>\n\n<p>The tags are a set of positive whole numbers, not necessarily contiguous and having no numerical significance, each corresponding to the associated literal identifier. An order attribute can also be given on the enumeration elements. An enumeration can itself be a member of an enumeration. This allows enumerations to be enumerated in a selection. Enumerations are also subclasses of <em>Scalar Datatype</em>. This allows them to be used as the reference of a datatype specification."
  {:db/ident :qudt/Enumeration,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Enumeration",
   :qudt/informativeReference ["http://en.wikipedia.org/wiki/Enumeration"
                               "http://en.wikipedia.org/wiki/Enumerated_type"],
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An enumeration is a set of literals from which a single value is selected. Each literal can have a tag as an integer within a standard encoding appropriate to the range of integer values. Consistency of enumeration types will allow them, and the enumerated values, to be referred to unambiguously either through symbolic name or encoding. Enumerated values are also controlled vocabularies and as such need to be standardized. Without this consistency enumeration literals can be stated differently and result in  data conflicts and misinterpretations.</p>\n\n<p>The tags are a set of positive whole numbers, not necessarily contiguous and having no numerical significance, each corresponding to the associated literal identifier. An order attribute can also be given on the enumeration elements. An enumeration can itself be a member of an enumeration. This allows enumerations to be enumerated in a selection. Enumerations are also subclasses of <em>Scalar Datatype</em>. This allows them to be used as the reference of a datatype specification.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "QUDT Enumeration",
   :rdfs/subClassOf
   [{:owl/allValuesFrom :qudt/EnumeratedValue,
     :owl/onProperty    :dtype/value,
     :rdf/type          :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     :qudt/encoding,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :qudt/EnumeratedValue,
     :owl/onProperty    :qudt/element,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom :qudt/EnumeratedValue,
     :owl/onProperty    :qudt/default,
     :rdf/type          :owl/Restriction}
    :dtype/Enumeration
    {:owl/allValuesFrom :qudt/EnumeratedValue,
     :owl/onProperty    :qudt/defaultValue,
     :rdf/type          :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     :qudt/abbreviation,
     :rdf/type           :owl/Restriction}
    {:dcterms/description
     "The number of bits allocated to the field for encoding any tags associated with elements.",
     :owl/maxCardinality 1,
     :owl/onProperty :qudt/bits,
     :rdf/type :owl/Restriction}
    :qudt/Concept
    :qudt/StructuredDatatype],
   :sh/property [:qudt/Enumeration-encoding
                 :qudt/Enumeration-bits
                 :qudt/Enumeration-defaultValue
                 :qudt/Enumeration-value]})

(def Enumeration-bits
  "Enumeration-bits"
  {:db/ident    :qudt/Enumeration-bits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/bits})

(def Enumeration-defaultValue
  "Enumeration-defaultValue"
  {:db/ident :qudt/Enumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/EnumeratedValue,
   :sh/path  :qudt/defaultValue})

(def Enumeration-encoding
  "Enumeration-encoding"
  {:db/ident    :qudt/Enumeration-encoding,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/encoding})

(def Enumeration-value
  "Enumeration-value"
  {:db/ident :qudt/Enumeration-value,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/EnumeratedValue,
   :sh/path  :dtype/value})

(def EnumerationScale
  "A sub-type of 'Scale'. Detailed desciption to be provided in a future version. A sub-type of 'DTYPE Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/EnumerationScale,
   :dcterms/description
   ["A sub-type of 'Scale'. Detailed desciption to be provided in a future version."
    "A sub-type of 'DTYPE Enumeration'. Detailed desciption to be provided in a future version."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Enumeration scale",
   :rdfs/subClassOf [:dtype/Enumeration :qudt/Scale]})

(def FALSE
  "False"
  {:db/ident         :qudt/FALSE,
   :dtype/literal    "false",
   :rdf/type         [:qudt/BooleanTypeEnumeratedValue :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "False"})

(def FLAG
  "FLAG"
  {:db/ident          :qudt/FLAG,
   :dtype/literal     "flag",
   :qudt/rdfsDatatype :xsd/boolean,
   :rdf/type          [:qudt/BooleanType :owl/NamedIndividual],
   :rdfs/label        "FLAG"})

(def FT_INERTIAL
  "Inertial Frame Type"
  {:db/ident   :qudt/FT_INERTIAL,
   :rdf/type   [:qudt/FrameType :owl/NamedIndividual],
   :rdfs/label "Inertial Frame Type"})

(def FT_NON-ROTATING
  "Non-rotating Frame Type"
  {:db/ident   :qudt/FT_NON-ROTATING,
   :rdf/type   [:qudt/FrameType :owl/NamedIndividual],
   :rdfs/label "Non-rotating Frame Type"})

(def FT_ROTATING
  "Rotating Frame Type"
  {:db/ident   :qudt/FT_ROTATING,
   :rdf/type   [:qudt/FrameType :owl/NamedIndividual],
   :rdfs/label "Rotating Frame Type"})

(def FieldType
  "A sub-type of 'Composite Data Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/FieldType,
   :dcterms/description
   "A sub-type of 'Composite Data Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Field Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/fieldName,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/CompositeDatatype]})

(def FieldType-elementName
  "FieldType-elementName"
  {:db/ident    :qudt/FieldType-elementName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/elementName})

(def FieldType-elementType
  "FieldType-elementType"
  {:db/ident :qudt/FieldType-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :qudt/elementType})

(def FieldType-fieldLabel
  "FieldType-fieldLabel"
  {:db/ident    :qudt/FieldType-fieldLabel,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/fieldLabel})

(def FieldType-fieldType
  "FieldType-fieldType"
  {:db/ident    :qudt/FieldType-fieldType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/minCount 1,
   :sh/path     :qudt/fieldType})

(def FieldType-optional
  "FieldType-optional"
  {:db/ident    :qudt/FieldType-optional,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/optional})

(def Figure
  "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."
  {:db/ident         :qudt/Figure,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Figure",
   :rdfs/subClassOf  [{:owl/cardinality 1,
                       :owl/onProperty  :qudt/imageLocation,
                       :rdf/type        :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/figureCaption,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/figureLabel,
                       :rdf/type           :owl/Restriction}
                      :qudt/Concept
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/image,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/landscape,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/width,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/height,
                       :rdf/type           :owl/Restriction}]})

(def FileFormat
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/FileFormat,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "File format",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def FixedIntervalTimeSeriesArray
  "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals."
  {:db/ident :qudt/FixedIntervalTimeSeriesArray,
   :dcterms/description
   "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Fixed Interval Time Series Array Type",
   :rdfs/subClassOf :qudt/TimeSeriesArray})

(def FixedIntervalTimeSeriesArrayType
  "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals."
  {:db/ident :qudt/FixedIntervalTimeSeriesArrayType,
   :dcterms/description
   "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals.",
   :rdf/type :owl/Class,
   :rdfs/label "Fixed Interval Time Series Array Type",
   :rdfs/subClassOf :qudt/TimeSeriesArrayType})

(def FloatingPointEncodingType
  "A \"Encoding\" with the following instance(s): \"Double Precision Encoding\", \"Single Precision Real Encoding\"."
  {:db/ident :qudt/FloatingPointEncodingType,
   :dcterms/description
   "A \"Encoding\" with the following instance(s): \"Double Precision Encoding\", \"Single Precision Real Encoding\".",
   :owl/oneOf [:qudt/DoublePrecisionEncoding
               :qudt/IEEE754_1985RealEncoding
               :qudt/SinglePrecisionRealEncoding],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Floating Point Encoding",
   :rdfs/subClassOf :qudt/Encoding})

(def FrameType
  "This class contains elements which specify the intertial type of a coordinate frame as either inertial, rotating, or non-rotating."
  {:db/ident :qudt/FrameType,
   :dcterms/description
   "This class contains elements which specify the intertial type of a coordinate frame as either inertial, rotating, or non-rotating.",
   :owl/oneOf [:qudt/FT_ROTATING :qudt/FT_NON-ROTATING :qudt/FT_INERTIAL],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Frame Type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def Function
  "Function"
  {:db/ident        :qudt/Function,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Function",
   :rdfs/subClassOf :qudt/Concept})

(def FunctionDatatype
  "A function data type defines the inputs and outputs for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments. [Wikipedia] A function data type defines the input and output data type for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments."
  {:db/ident :qudt/FunctionDatatype,
   :dcterms/description
   ["A function data type defines the inputs and outputs for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments. [Wikipedia]"
    "A function data type defines the input and output data type for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments."],
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Function Data Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/functionArity,
                      :rdf/type        :owl/Restriction}
                     :qudt/StructuredDatatype
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/returnType,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :qudt/argType,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :qudt/returnType,
                      :rdf/type          :owl/Restriction}],
   :sh/property [:qudt/FunctionDatatype-returnType
                 :qudt/FunctionDatatype-functionArity
                 :qudt/FunctionDatatype-argType]})

(def FunctionDatatype-argType
  "FunctionDatatype-argType"
  {:db/ident :qudt/FunctionDatatype-argType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :qudt/argType})

(def FunctionDatatype-functionArity
  "FunctionDatatype-functionArity"
  {:db/ident    :qudt/FunctionDatatype-functionArity,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/functionArity})

(def FunctionDatatype-returnType
  "FunctionDatatype-returnType"
  {:db/ident    :qudt/FunctionDatatype-returnType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/returnType})

(def Graph
  "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges)."
  {:db/ident :qudt/Graph,
   :dcterms/description
   "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges).",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Graph Type",
   :rdfs/subClassOf :qudt/Collection})

(def GraphType
  "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges)."
  {:db/ident :qudt/GraphType,
   :dcterms/description
   "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges).",
   :rdf/type :owl/Class,
   :rdfs/label "Graph Type",
   :rdfs/subClassOf :qudt/CollectionType})

(def GreekCharacter
  "A sub-type of 'Symbol'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/GreekCharacter,
   :dcterms/description
   "A sub-type of 'Symbol'. Detailed desciption to be provided in a future version."})

(def GroundCoordinateSystem
  "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/GroundCoordinateSystem,
   :dcterms/description
   "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ground coordinate system",
   :rdfs/subClassOf :qudt/AerospaceCoordinateSystem})

(def HEAP
  "HEAP"
  {:db/ident   :qudt/HEAP,
   :rdf/type   [:qudt/HeapType :owl/NamedIndividual],
   :rdfs/label "HEAP"})

(def HEXBINARY
  "HEXBINARY"
  {:db/ident            :qudt/HEXBINARY,
   :dtype/literal       "hexbinary",
   :qudt/dimensionality 1,
   :qudt/rdfsDatatype   :qudt/hexbinary,
   :rdf/type            [:qudt/HexBinaryType :owl/NamedIndividual],
   :rdfs/label          "HEXBINARY"})

(def HashTable
  "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs."
  {:db/ident :qudt/HashTable,
   :dcterms/description
   "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Hash Table Type",
   :rdfs/subClassOf [:qudt/TableType :qudt/Map]})

(def HashTableType
  "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs."
  {:db/ident :qudt/HashTableType,
   :dcterms/description
   "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs.",
   :rdf/type :owl/Class,
   :rdfs/label "Hash Table Type",
   :rdfs/subClassOf :qudt/MapType})

(def Heap
  "<p class=\"lm-para\">A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then \\(key(A) \\ge key(B)\\). This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type.</p>"
  {:db/ident :qudt/Heap,
   :dcterms/description
   "<p class=\"lm-para\">A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then \\(key(A) \\ge key(B)\\). This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type.</p>",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Heap_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Heap Type",
   :rdfs/subClassOf :qudt/OrderedTree})

(def HeapType
  "A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then <em>key(A) &gt; key(B)</em>. This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type."
  {:db/ident :qudt/HeapType,
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Heap_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then <em>key(A) &gt; key(B)</em>. This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type.",
   :rdfs/label "Heap Type",
   :rdfs/subClassOf :qudt/OrderedTreeType})

(def HexBinaryType
  "A string composed of hex characters."
  {:db/ident            :qudt/HexBinaryType,
   :dcterms/description "A string composed of hex characters.",
   :rdf/type            [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Hexidecimal Binary Type",
   :rdfs/subClassOf     [{:owl/maxCardinality 1,
                          :owl/onProperty     :qudt/length,
                          :rdf/type           :owl/Restriction}
                         {:owl/maxCardinality 1,
                          :owl/onProperty     :qudt/minLength,
                          :rdf/type           :owl/Restriction}
                         {:owl/maxCardinality 1,
                          :owl/onProperty     :qudt/pattern,
                          :rdf/type           :owl/Restriction}
                         :qudt/TextStringType
                         {:owl/maxCardinality 1,
                          :owl/onProperty     :qudt/maxLength,
                          :rdf/type           :owl/Restriction}],
   :sh/property         [:qudt/HexBinaryType-length
                         :qudt/HexBinaryType-minLength
                         :qudt/HexBinaryType-maxLength
                         :qudt/HexBinaryType-pattern]})

(def HexBinaryType-length
  "HexBinaryType-length"
  {:db/ident    :qudt/HexBinaryType-length,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/length})

(def HexBinaryType-maxLength
  "HexBinaryType-maxLength"
  {:db/ident    :qudt/HexBinaryType-maxLength,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/maxLength})

(def HexBinaryType-minLength
  "HexBinaryType-minLength"
  {:db/ident    :qudt/HexBinaryType-minLength,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/minLength})

(def HexBinaryType-pattern
  "HexBinaryType-pattern"
  {:db/ident    :qudt/HexBinaryType-pattern,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/pattern})

(def HighToLow
  "High To Low"
  {:db/ident      :qudt/HighToLow,
   :dtype/literal "high",
   :rdf/type      [:qudt/MemoryOrderType :owl/NamedIndividual],
   :rdfs/label    "High To Low"})

(def IEEE754_1985RealEncoding
  "IEEE 754 1985 Real Encoding"
  {:db/ident   :qudt/IEEE754_1985RealEncoding,
   :qudt/bytes 32,
   :rdf/type   [:qudt/FloatingPointEncodingType :owl/NamedIndividual],
   :rdfs/label "IEEE 754 1985 Real Encoding"})

(def IERS-TN-32-2004
  "IERS Conventions (2003), D. D. McCarthy and Gérard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32."
  {:db/ident :qudt/IERS-TN-32-2004,
   :dcterms/description
   "IERS Conventions (2003), D. D. McCarthy and Gérard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32.",
   :qudt/url "http://www.iers.org/iers/publications/tn/tn32.",
   :rdf/type [:qudt/Citation :owl/NamedIndividual],
   :rdfs/label "IERS-TN-32-2004",
   :skos/prefLabel "IERS-TN-32-2004"})

(def IMPERIAL-DimensionVector
  "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/IMPERIAL-DimensionVector,
   :dcterms/description
   "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."})

(def ISO-DimensionVector
  "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/ISO-DimensionVector,
   :dcterms/description
   "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."})

(def ISO8601-UTCDateTime-BasicFormat
  "ISO 8601 UTC Date Time - Basic Format"
  {:db/ident         :qudt/ISO8601-UTCDateTime-BasicFormat,
   :qudt/allowedPattern
   ["[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}Z"
    "[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}.[0-9]+Z"],
   :rdf/type         :qudt/DateTimeStringEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "ISO 8601 UTC Date Time - Basic Format"})

(def IconicCue
  "Iconic enumeration literal"
  {:db/ident         :qudt/IconicCue,
   :owl/disjointWith [:qudt/VisualCue :qudt/KinestheticCue :qudt/AuralCue],
   :rdf/type         [:sh/NodeShape :owl/Class],
   :rdfs/label       "Iconic enumeration literal",
   :rdfs/subClassOf  :qudt/ModalCue,
   :sh/property      :qudt/IconicCue-image})

(def IconicCue-image
  "IconicCue-image"
  {:db/ident    :qudt/IconicCue-image,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/image})

(def IconicCueEnumeration-defaultValue
  "IconicCueEnumeration-defaultValue"
  {:db/ident :qudt/IconicCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/IconicCue,
   :sh/path  :qudt/defaultValue})

(def ImperialUnit
  "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/ImperialUnit,
   :dcterms/description
   "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."})

(def InBook
  "Pub inbook type"
  {:db/ident      :qudt/InBook,
   :dtype/literal "inbook",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub inbook type"})

(def InCollection
  "Pub incollection type"
  {:db/ident      :qudt/InCollection,
   :dtype/literal "incollection",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub incollection type"})

(def InProceedings
  "Pub inproceedings type"
  {:db/ident      :qudt/InProceedings,
   :dtype/literal "inproceedings",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub inproceedings type"})

(def InertialCoordinateFrame
  "A \"Coordinate Frame\"."
  {:db/ident            :qudt/InertialCoordinateFrame,
   :dcterms/description "A \"Coordinate Frame\".",
   :owl/equivalentClass :qudt/NonRotatingInertialFrame,
   :rdf/type            [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Inertial Coordinate Frame",
   :rdfs/subClassOf     [{:owl/hasValue   :qudt.type/FT_NON-ROTATING,
                          :owl/onProperty :qudt/frameType,
                          :rdf/type       :owl/Restriction}
                         :qudt/InertialReferenceFrame],
   :sh/property         :qudt/InertialCoordinateFrame-frameType})

(def InertialCoordinateFrame-frameType
  "InertialCoordinateFrame-frameType"
  {:db/ident    :qudt/InertialCoordinateFrame-frameType,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue :qudt.type/FT_NON-ROTATING,
   :sh/path     :qudt/frameType})

(def InertialReferenceFrame
  "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/InertialReferenceFrame,
   :dcterms/description
   "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Inertial reference frame",
   :rdfs/subClassOf :qudt/ReferenceFrame})

(def IntegerDatatype
  "An Integer Type is a data type that specifies how integer numbers are represented and stored in machine memory."
  {:db/ident :qudt/IntegerDatatype,
   :dcterms/description
   "An Integer Type is a data type that specifies how integer numbers are represented and stored in machine memory.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Integer Datatype",
   :rdfs/subClassOf [:qudt/OrdinalType :qudt/NumericType]})

(def IntegerEncodingType
  "The encoding scheme for integer types"
  {:db/ident            :qudt/IntegerEncodingType,
   :dcterms/description "The encoding scheme for integer types",
   :owl/oneOf           [:qudt/LongUnsignedIntegerEncoding
                         :qudt/ShortUnsignedIntegerEncoding
                         :qudt/ShortUnsignedIntegerEncoding
                         :qudt/SignedIntegerEncoding
                         :qudt/UnsignedIntegerEncoding],
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/qudt",
   :rdfs/label          "Integer Encoding",
   :rdfs/subClassOf     :qudt/Encoding})

(def IntegerList
  "Integer list"
  {:db/ident        :qudt/IntegerList,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Integer list",
   :rdfs/subClassOf :qudt/List,
   :sh/property     [:qudt/IntegerList-rest :qudt/IntegerList-first]})

(def IntegerList-first
  "IntegerList-first"
  {:db/ident    :qudt/IntegerList-first,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/path     :rdf/first})

(def IntegerList-rest
  "IntegerList-rest"
  {:db/ident :qudt/IntegerList-rest,
   :rdf/type :sh/PropertyShape,
   :sh/path  :rdf/rest})

(def IntegerVector
  "Integer vector"
  {:db/ident        :qudt/IntegerVector,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Integer vector",
   :rdfs/subClassOf :qudt/Vector,
   :sh/property     [:qudt/IntegerList-rest :qudt/IntegerList-first]})

(def InterpolatedTable
  "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/InterpolatedTable,
   :dcterms/description
   "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Interpolated Table Type",
   :rdfs/subClassOf [:qudt/TableType :qudt/Table]})

(def IntervalScale
  "median, percentile & Monotonic increasing (order (<)) & totally ordered set <p>The interval type allows for the degree of difference between items, but not the ratio between them. Examples include temperature with the Celsius scale, which has two defined points (the freezing and boiling point of water at specific conditions) and then separated into 100 intervals, date when measured from an arbitrary epoch (such as AD), percentage such as a percentage return on a stock,[16] location in Cartesian coordinates, and direction measured in degrees from true or magnetic north. Ratios are not meaningful since 20 °C cannot be said to be \"twice as hot\" as 10 °C, nor can multiplication/division be carried out between any two dates directly. However, ratios of differences can be expressed; for example, one difference can be twice another. Interval type variables are sometimes also called \"scaled variables\", but the formal mathematical term is an affine space (in this case an affine line).</p> <p>Characteristics: median, percentile &amp; Monotonic increasing (order (&lt;) &amp; totally ordered set</p>"
  {:db/ident :qudt/IntervalScale,
   :qudt/informativeReference
   "https://en.wikipedia.org/wiki/Level_of_measurement",
   :rdf/type :owl/Class,
   :rdfs/comment
   ["median, percentile & Monotonic increasing (order (<)) & totally ordered set"
    "<p>The interval type allows for the degree of difference between items, but not the ratio between them. Examples include temperature with the Celsius scale, which has two defined points (the freezing and boiling point of water at specific conditions) and then separated into 100 intervals, date when measured from an arbitrary epoch (such as AD), percentage such as a percentage return on a stock,[16] location in Cartesian coordinates, and direction measured in degrees from true or magnetic north. Ratios are not meaningful since 20 °C cannot be said to be \"twice as hot\" as 10 °C, nor can multiplication/division be carried out between any two dates directly. However, ratios of differences can be expressed; for example, one difference can be twice another. Interval type variables are sometimes also called \"scaled variables\", but the formal mathematical term is an affine space (in this case an affine line).</p>\n<p>Characteristics: median, percentile &amp; Monotonic increasing (order (&lt;) &amp; totally ordered set</p>"],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Interval scale",
   :rdfs/seeAlso ["http://qudt.org/2.1/schema/qudt/OrdinalScale"
                  "http://qudt.org/2.1/schema/qudt/RatioScale"
                  "http://qudt.org/2.1/schema/qudt/NominalScale"]
   :rdfs/subClassOf :qudt/Scale})

(def KinestheticCue
  "Kinesthetic Cue"
  {:db/ident        :qudt/KinestheticCue,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Kinesthetic Cue",
   :rdfs/subClassOf :qudt/ModalCue,
   :sh/property     :qudt/KinestheticCue-code})

(def KinestheticCue-code
  "KinestheticCue-code"
  {:db/ident    :qudt/KinestheticCue-code,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/code})

(def KinestheticCueEnumeration-defaultValue
  "KinestheticCueEnumeration-defaultValue"
  {:db/ident :qudt/KinestheticCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/KinestheticCue,
   :sh/path  :qudt/defaultValue})

(def LIST
  "LIST"
  {:db/ident   :qudt/LIST,
   :rdf/type   [:qudt/List :owl/NamedIndividual],
   :rdfs/label "LIST"})

(def LargeObject
  "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data."
  {:db/ident :qudt/LargeObject,
   :dcterms/description
   "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Large object",
   :rdfs/subClassOf :qudt/CompositeDatatype})

(def LargeObjectType
  "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data."
  {:db/ident :qudt/LargeObjectType,
   :dcterms/description
   "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data.",
   :rdf/type :owl/Class,
   :rdfs/label "Large object",
   :rdfs/subClassOf :qudt/CompositeDatatype})

(def LatexString
  "A type of string in which some characters may be wrapped with '\\(' and '\\) characters for LaTeX rendering."
  {:db/ident :qudt/LatexString,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A type of string in which some characters may be wrapped with '\\(' and '\\) characters for LaTeX rendering.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Latex String",
   :rdfs/subClassOf :xsd/string})

(def LimitType
  "Limit type"
  {:db/ident        :qudt/LimitType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Limit type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def List
  "A sub-type of 'Collection Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/List,
   :dcterms/description
   "A sub-type of 'Collection Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "List",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/List,
                      :owl/onProperty    :rdf/rest,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :rdf/first,
                      :rdf/type          :owl/Restriction}
                     :qudt/Collection]})

(def List-first
  "List-first"
  {:db/ident :qudt/List-first,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :rdf/first})

(def List-rest
  "List-rest"
  {:db/ident :qudt/List-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/List,
   :sh/path  :rdf/rest})

(def ListType
  "List type"
  {:db/ident        :qudt/ListType,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "List type",
   :rdfs/subClassOf :qudt/CollectionType,
   :sh/property     [:qudt/List-rest :qudt/List-first]})

(def LittleEndian
  "Little Endian"
  {:db/ident         :qudt/LittleEndian,
   :dtype/literal    "little",
   :rdf/type         [:qudt/EndianType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Little Endian"})

(def LocalCoordinateSystem
  "A \"Trajectory Coordinate System\" with the following instance(s): \"Local vertical curvilinear coordinate system\", \"Local vertical local horizontal coordinate system\", \"Vehicle centered local vertical curvilinear coordinate system\"."
  {:db/ident :qudt/LocalCoordinateSystem,
   :dcterms/description
   "A \"Trajectory Coordinate System\" with the following instance(s): \"Local vertical curvilinear coordinate system\", \"Local vertical local horizontal coordinate system\", \"Vehicle centered local vertical curvilinear coordinate system\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Local Coordinate System Type",
   :rdfs/subClassOf :qudt/TrajectoryCoordinateSystem})

(def LogarithmicUnit
  "Logarithmic units are abstract mathematical units that can be used to express any quantities (physical or mathematical) that are defined on a logarithmic scale, that is, as being proportional to the value of a logarithm function. Examples of logarithmic units include common units of information and entropy, such as the bit, and the byte, as well as units of relative signal strength magnitude such as the decibel."
  {:db/ident :qudt/LogarithmicUnit,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Logarithmic units are abstract mathematical units that can be used to express any quantities (physical or mathematical) that are defined on a logarithmic scale, that is, as being proportional to the value of a logarithm function. Examples of logarithmic units include common units of information and entropy, such as the bit, and the byte, as well as units of relative signal strength magnitude such as the decibel.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Logarithmic Unit",
   :rdfs/subClassOf :qudt/DimensionlessUnit})

(def LongIntegerType
  "A Long Integer is an integer that can be represented in four octets (32 bits) of machine memory. Long integers may be signed or unsigned."
  {:db/ident :qudt/LongIntegerType,
   :dcterms/description
   "A Long Integer is an integer that can be represented in four octets (32 bits) of machine memory. Long integers may be signed or unsigned.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Long Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   4,
                      :owl/onProperty :qudt/octets,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   32,
                      :owl/onProperty :qudt/bits,
                      :rdf/type       :owl/Restriction}
                     :qudt/IntegerDatatype],
   :sh/property :qudt/LongIntegerType-octets})

(def LongIntegerType-octets
  "LongIntegerType-octets"
  {:db/ident    :qudt/LongIntegerType-octets,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue 4,
   :sh/or       [:qudt/NumericUnion],
   :sh/path     :qudt/octets})

(def LongUnsignedIntegerEncoding
  "Long Unsigned Integer Encoding"
  {:db/ident   :qudt/LongUnsignedIntegerEncoding,
   :qudt/bytes 8,
   :rdf/type   [:qudt/IntegerEncodingType :owl/NamedIndividual],
   :rdfs/label "Long Unsigned Integer Encoding"})

(def LowToHigh
  "Low To High"
  {:db/ident      :qudt/LowToHigh,
   :dtype/literal "low",
   :rdf/type      [:qudt/MemoryOrderType :owl/NamedIndividual],
   :rdfs/label    "Low To High"})

(def LunarCoordinateSystem
  "Two slightly different coordinate frames are commonly used to define the orientation of the axes of a lunar body-fixed coordinate system: a mean Earth/rotation frame and a principal axis coordinate frame. The mean Earth/rotation frame (sometimes called the \"Mean Earth/polar axis\" frame) is a lunar body-fixed coordinate frame with the X-axis aligned with the mean direction from the Moon to the Earth and the Z-axis aligned with the mean axis of rotation of the Moon. The principal axis frame is a lunar body-fixed coordinate frame aligned with the principal axes of the Moon. Due to the fact that the Moon is synchronously rotating but is not exactly symmetric, the principal axes and the mean Earth/rotation axes of the Moon do not coincide."
  {:db/ident :qudt/LunarCoordinateSystem,
   :dcterms/description
   "Two slightly different coordinate frames are commonly used to define the orientation of the axes of a lunar body-fixed coordinate system: a mean Earth/rotation frame and a principal axis coordinate frame. The mean Earth/rotation frame (sometimes called the \"Mean Earth/polar axis\" frame) is a lunar body-fixed coordinate frame with the X-axis aligned with the mean direction from the Moon to the Earth and the Z-axis aligned with the mean axis of rotation of the Moon. The principal axis frame is a lunar body-fixed coordinate frame aligned with the principal axes of the Moon. Due to the fact that the Moon is synchronously rotating but is not exactly symmetric, the principal axes and the mean Earth/rotation axes of the Moon do not coincide.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Lunar Coordinate System",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/zAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/realization,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/yAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/hasValue   :qudt.type/CC_MoonCentered,
                      :owl/onProperty :qudt/coordinateCenter,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/xAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     :qudt/TrajectoryCoordinateSystem],
   :sh/property [:qudt/LunarCoordinateSystem-yAxisDefinition
                 :qudt/LunarCoordinateSystem-xAxisDefinition
                 :qudt/LunarCoordinateSystem-zAxisDefinition
                 :qudt/LunarCoordinateSystem-realization
                 :qudt/LunarCoordinateSystem-coordinateCenter]})

(def LunarCoordinateSystem-coordinateCenter
  "LunarCoordinateSystem-coordinateCenter"
  {:db/ident    :qudt/LunarCoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CoordinateCenterType,
   :sh/hasValue :qudt.type/CC_MoonCentered,
   :sh/path     :qudt/coordinateCenter})

(def LunarCoordinateSystem-realization
  "LunarCoordinateSystem-realization"
  {:db/ident    :qudt/LunarCoordinateSystem-realization,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/realization})

(def LunarCoordinateSystem-xAxisDefinition
  "LunarCoordinateSystem-xAxisDefinition"
  {:db/ident    :qudt/LunarCoordinateSystem-xAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/xAxisDefinition})

(def LunarCoordinateSystem-yAxisDefinition
  "LunarCoordinateSystem-yAxisDefinition"
  {:db/ident    :qudt/LunarCoordinateSystem-yAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/yAxisDefinition})

(def LunarCoordinateSystem-zAxisDefinition
  "LunarCoordinateSystem-zAxisDefinition"
  {:db/ident    :qudt/LunarCoordinateSystem-zAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/zAxisDefinition})

(def MASS-PROPERTIES-ARRAY
  "MASS PROPERTIES ARRAY"
  {:db/ident   :qudt/MASS-PROPERTIES-ARRAY,
   :rdf/type   [:qudt/MassPropertiesArrayType :owl/NamedIndividual],
   :rdfs/label "MASS PROPERTIES ARRAY"})

(def MATRIX
  "MATRIX"
  {:db/ident   :qudt/MATRIX,
   :rdf/type   [:qudt/MatrixType :owl/NamedIndividual],
   :rdfs/label "MATRIX"})

#_(def MATRIX-TYPE_2x4
  "Matrix type 2x4"
  {:db/ident            :qudt/MATRIX-TYPE_2x4,
   :qudt/byRow          true,
   :qudt/columns        4,
   :qudt/dimensionVector :qudt/DV_2x4,
   :qudt/dimensionality 2,
   :qudt/rows           [4 2],
   :rdf/type            :qudt/MatrixType,
   :rdfs/label          "Matrix type  2x4"})

(def MKS-Unit
  "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/MKS-Unit,
   :dcterms/description
   "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."})

(def MULTi-DIMENSIONAL-ARRAY
  "MULTI-DIMENSIONAL ARRAY"
  {:db/ident   :qudt/MULTi-DIMENSIONAL-ARRAY,
   :rdf/type   :qudt/MultiDimensionalArrayType,
   :rdfs/label "MULTI-DIMENSIONAL ARRAY"})

(def MajorMinorType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/MajorMinorType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :owl/oneOf [:qudt.type/Minor :qudt.type/Major],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Major minor type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def Manual
  "Pub manual type"
  {:db/ident      :qudt/Manual,
   :dtype/literal "manual",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub manual type"})

(def Map
  "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident         :qudt/Map,
   :dcterms/description
   "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt/AssociativeArray,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Map Type",
   :rdfs/subClassOf  :qudt/Collection})

(def MapType
  "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident        :qudt/MapType,
   :dcterms/description
   "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt/AssociativeArrayType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Map Type",
   :rdfs/subClassOf :qudt/CollectionType})

(def MarsCoordinateSystem
  "A \"Trajectory Coordinate System\" with the following instance(s): \"Mars mean equator and IAU-Node of epoch\", \"Mars mean equator and prime meridian body-fixed\"."
  {:db/ident :qudt/MarsCoordinateSystem,
   :dcterms/description
   "A \"Trajectory Coordinate System\" with the following instance(s): \"Mars mean equator and IAU-Node of epoch\", \"Mars mean equator and prime meridian body-fixed\".",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Mars Coordinate System Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/CC_MarsCentered,
                      :owl/onProperty :qudt/coordinateCenter,
                      :rdf/type       :owl/Restriction}
                     :qudt/TrajectoryCoordinateSystem],
   :sh/property :qudt/MarsCoordinateSystem-coordinateCenter})

(def MarsCoordinateSystem-coordinateCenter
  "MarsCoordinateSystem-coordinateCenter"
  {:db/ident    :qudt/MarsCoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CoordinateCenterType,
   :sh/hasValue :qudt.type/CC_MarsCentered,
   :sh/path     :qudt/coordinateCenter})

(def MassPropertiesArray
  "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties."
  {:db/ident :qudt/MassPropertiesArray,
   :dcterms/description
   "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Mass Properties Array Type",
   :rdfs/subClassOf :qudt/Array})

(def MassPropertiesArrayType
  "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties."
  {:db/ident :qudt/MassPropertiesArrayType,
   :dcterms/description
   "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties.",
   :rdf/type :owl/Class,
   :rdfs/label "Mass Properties Array Type",
   :rdfs/subClassOf :qudt/ArrayType})

(def MathsFunctionType
  "A sub-type of 'QUDT Concept'. Detailed description to be provided in a future version."
  {:db/ident :qudt/MathsFunctionType,
   :dcterms/description
   "A sub-type of 'QUDT Concept'. Detailed description to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Maths Function Type",
   :rdfs/subClassOf :qudt/Concept})

(def Matrix
  "A Matrix Type is a data type that specifies the properties of data structures that hold matricies."
  {:db/ident :qudt/Matrix,
   :dcterms/description
   "A Matrix Type is a data type that specifies the properties of data structures that hold matricies.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Matrix Type",
   :rdfs/subClassOf :qudt/MultiDimensionalArray})

(def MatrixType
  "Matrix Type"
  {:db/ident        :qudt/MatrixType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Matrix Type",
   :rdfs/subClassOf :qudt/MultiDimensionalArrayType})

(def MemoryOrderType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/MemoryOrderType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :owl/oneOf [:qudt.type/HighToLow :qudt.type/LowToHigh],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Memory order type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def Misc
  "Pub misc type"
  {:db/ident      :qudt/Misc,
   :dtype/literal "misc",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub misc type"})

(def ModalCue
  "Modal Cue"
  {:db/ident        :qudt/ModalCue,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Modal Cue",
   :rdfs/subClassOf :qudt/EnumeratedValue,
   :sh/property     :qudt/ModalCue-duration})

(def ModalCue-duration
  "ModalCue-duration"
  {:db/ident    :qudt/ModalCue-duration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/duration})

(def ModalEnumeration
  "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/ModalEnumeration,
   :dcterms/description
   "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Modal Enumeration",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/ModalCue,
                      :owl/onProperty    :qudt/defaultValue,
                      :rdf/type          :owl/Restriction}
                     :qudt/Enumeration],
   :sh/property :qudt/ModalEnumeration-defaultValue})

(def ModalEnumeration-defaultValue
  "ModalEnumeration-defaultValue"
  {:db/ident :qudt/ModalEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/ModalCue,
   :sh/path  :qudt/defaultValue})

(def MultiDimensionalArray
  "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions."
  {:db/ident :qudt/MultiDimensionalArray,
   :dcterms/description
   "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi Dimensional Array Type",
   :rdfs/subClassOf :qudt/Array})

(def MultiDimensionalArrayType
  "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions."
  {:db/ident :qudt/MultiDimensionalArrayType,
   :dcterms/description
   "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions.",
   :rdf/type :owl/Class,
   :rdfs/label "Multi Dimensional Array Type",
   :rdfs/subClassOf :qudt/ArrayType})

(def MultiDimensionalDataFormat
  "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF."
  {:db/ident :qudt/MultiDimensionalDataFormat,
   :dcterms/description
   "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi dimensional data format",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty
                      :qudt/MultiDimensionalDataFormat-descriptor,
                      :rdf/type :owl/Restriction}
                     :qudt/CompositeDatatype]})

(def MultiDimensionalDataFormat-descriptor
  "MultiDimensionalDataFormat-descriptor"
  {:db/ident    :qudt/MultiDimensionalDataFormat-descriptor,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/descriptor})

(def MultiDimensionalDataFormatType
  "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF."
  {:db/ident :qudt/MultiDimensionalDataFormatType,
   :dcterms/description
   "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Multi Dimensional Data Format Type",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property :qudt/MultiDimensionalDataFormat-descriptor})

(def MultiModalEnumeration
  "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/MultiModalEnumeration,
   :dcterms/description
   "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi modal enumeration",
   :rdfs/subClassOf
   [{:owl/maxCardinality 1,
     :owl/onProperty     :qudt/MultiModalEnumeration-auralCueEnumeration,
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     :qudt/MultiModalEnumeration-iconicCueEnumeration,
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     :qudt/MultiModalEnumeration-visualCueEnumeration,
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     :qudt/MultiModalEnumeration-kinestheticCueEnumeration,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :qudt/ModalEnumeration,
     :owl/onProperty    :qudt/MultiModalEnumeration-modalCueEnumeration,
     :rdf/type          :owl/Restriction}
    :qudt/Enumeration],
   :sh/property [:qudt/MultiModalEnumeration-kinestheticCueEnumeration
                 :qudt/MultiModalEnumeration-iconicCueEnumeration
                 :qudt/MultiModalEnumeration-visualCueEnumeration
                 :qudt/MultiModalEnumeration-modalCueEnumeration
                 :qudt/MultiModalEnumeration-auralCueEnumeration]})

(def MultiModalEnumeration-auralCueEnumeration
  "MultiModalEnumeration-auralCueEnumeration"
  {:db/ident    :qudt/MultiModalEnumeration-auralCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/auralCueEnumeration})

(def MultiModalEnumeration-iconicCueEnumeration
  "MultiModalEnumeration-iconicCueEnumeration"
  {:db/ident    :qudt/MultiModalEnumeration-iconicCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/iconicCueEnumeration})

(def MultiModalEnumeration-kinestheticCueEnumeration
  "MultiModalEnumeration-kinestheticCueEnumeration"
  {:db/ident    :qudt/MultiModalEnumeration-kinestheticCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/kinestheticCueEnumeration})

(def MultiModalEnumeration-modalCueEnumeration
  "MultiModalEnumeration-modalCueEnumeration"
  {:db/ident :qudt/MultiModalEnumeration-modalCueEnumeration,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/ModalEnumeration,
   :sh/path  :qudt/modalCueEnumeration})

(def MultiModalEnumeration-visualCueEnumeration
  "MultiModalEnumeration-visualCueEnumeration"
  {:db/ident    :qudt/MultiModalEnumeration-visualCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/visualCueEnumeration})

(def MultiModalType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/MultiModalType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi Modal Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/iconicCue,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/kinestheticCue,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/ModalCue,
                      :owl/onProperty    :qudt/modalCue,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/visualCue,
                      :rdf/type           :owl/Restriction}
                     :qudt/EnumeratedValue
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/auralCue,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :qudt/modalCue,
                      :owl/someValuesFrom :qudt/ModalCue,
                      :rdf/type           :owl/Restriction}],
   :sh/property [:qudt/MultiModalType-visualCue
                 :qudt/MultiModalType-kinestheticCue
                 :qudt/MultiModalType-modalCue
                 :qudt/MultiModalType-auralCue
                 :qudt/MultiModalType-iconicCue]})

(def MultiModalType-auralCue
  "MultiModalType-auralCue"
  {:db/ident    :qudt/MultiModalType-auralCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/auralCue})

(def MultiModalType-iconicCue
  "MultiModalType-iconicCue"
  {:db/ident    :qudt/MultiModalType-iconicCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/iconicCue})

(def MultiModalType-kinestheticCue
  "MultiModalType-kinestheticCue"
  {:db/ident    :qudt/MultiModalType-kinestheticCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/kinestheticCue})

(def MultiModalType-modalCue
  "MultiModalType-modalCue"
  {:db/ident :qudt/MultiModalType-modalCue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/ModalCue,
   :sh/path  :qudt/modalCue})

(def MultiModalType-visualCue
  "MultiModalType-visualCue"
  {:db/ident    :qudt/MultiModalType-visualCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/visualCue})

(def MultiSet
  "A bag is a set in which elements may be repeated."
  {:db/ident        :qudt/MultiSet,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A bag is a set in which elements may be repeated.",
   :rdfs/label      "Bag",
   :rdfs/subClassOf :qudt/Collection})

(def N-Tuple
  "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year."
  {:db/ident :qudt/N-Tuple,
   :dcterms/description
   "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "N-Tuple Type",
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty     :qudt/elementType,
                      :rdf/type           :owl/Restriction}
                     :qudt/Tuple]})

(def N-Tuple-elementType
  "N-Tuple-elementType"
  {:db/ident    :qudt/N-Tuple-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/minCount 0,
   :sh/path     :qudt/elementType})

(def N-TupleType
  "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year."
  {:db/ident :qudt/N-TupleType,
   :dcterms/description
   "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "N-Tuple Type",
   :rdfs/subClassOf :qudt/TupleType,
   :sh/property :qudt/N-Tuple-elementType})

(def NIST_SP811_Comment
  "National Institute of Standards and Technology (NIST) Special Publication 811 Comments on some quantities and their units"
  {:db/ident :qudt/NIST_SP811_Comment,
   :dcterms/description
   "National Institute of Standards and Technology (NIST) Special Publication 811 Comments on some quantities and their units",
   :rdf/type [:owl/Class :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "NIST SP~811 Comment",
   :rdfs/subClassOf :qudt/Comment})

(def NUMERIC
  "Numeric"
  {:db/ident           :qudt/NUMERIC,
   :dtype/literal      "numeric",
   :qudt/ansiSQLName   "DECIMAL(p,s)",
   :qudt/odbcName      "SQL_DECIMAL(p,s)",
   :qudt/oracleSQLName "NUMBER(p,s)",
   :rdf/type           [:qudt/NumericType :owl/NamedIndividual],
   :rdfs/label         "Numeric"})

(def No
  "No"
  {:db/ident     :qudt/No,
   :qudt/literal "N",
   :rdf/type     [:qudt/YesNoType :owl/NamedIndividual],
   :rdfs/label   "No"})

(def NominalScale
  "A nominal scale differentiates between items or subjects based only on their names or (meta-)categories and other qualitative classifications they belong to; thus dichotomous data involves the construction of classifications as well as the classification of items. Discovery of an exception to a classification can be viewed as progress. Numbers may be used to represent the variables but the numbers do not have numerical value or relationship: For example, a Globally unique identifier. Examples of these classifications include gender, nationality, ethnicity, language, genre, style, biological species, and form. In a university one could also use hall of affiliation as an example."
  {:db/ident :qudt/NominalScale,
   :qudt/informativeReference
   "https://en.wikipedia.org/wiki/Level_of_measurement",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A nominal scale differentiates between items or subjects based only on their names or (meta-)categories and other qualitative classifications they belong to; thus dichotomous data involves the construction of classifications as well as the classification of items. Discovery of an exception to a classification can be viewed as progress. Numbers may be used to represent the variables but the numbers do not have numerical value or relationship: For example, a Globally unique identifier. Examples of these classifications include gender, nationality, ethnicity, language, genre, style, biological species, and form. In a university one could also use hall of affiliation as an example.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Nominal scale",
   :rdfs/seeAlso ["http://qudt.org/2.1/schema/qudt/RatioScale"
                  "http://qudt.org/2.1/schema/qudt/OrdinalScale"
                  "http://qudt.org/2.1/schema/qudt/IntervalScale"]
   :rdfs/subClassOf :qudt/Scale})

(def NonModifiableParameter
  "Parameter is fixed, not modifiable."
  {:db/ident     :qudt/NonModifiableParameter,
   :qudt/code    "0",
   :qudt/literal "fixed",
   :rdf/type     [:qudt/ParameterModifiabilityType :owl/NamedIndividual],
   :rdfs/comment "Parameter is fixed, not modifiable.",
   :rdfs/label   "Non modifiable parameter"})

(def NonRotatingInertialFrame
  "The non-rotating (or \"inertial\") coordinate frames are defined by taking a \"snapshot\" of the orientation of a particular set of right-handed, orthogonal axes at a specific epoch or time. In other words, the non-rotating coordinate frame, however it is defined, is frozen or fixed at a specific time - for all time. These non-rotating coordinate frames are referred to as \"of Epoch\" coordinate frames."
  {:db/ident :qudt/NonRotatingInertialFrame,
   :dcterms/description
   "The non-rotating (or \"inertial\") coordinate frames are defined by taking a \"snapshot\" of the orientation of a particular set of right-handed, orthogonal axes at a specific epoch or time. In other words, the non-rotating coordinate frame, however it is defined, is frozen or fixed at a specific time - for all time. These non-rotating coordinate frames are referred to as \"of Epoch\" coordinate frames.",
   :owl/equivalentClass :qudt/InertialCoordinateFrame,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Non Rotating Coordinate Frame",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/FT_NON-ROTATING,
                      :owl/onProperty :qudt/frameType,
                      :rdf/type       :owl/Restriction}
                     :qudt/InertialReferenceFrame],
   :sh/property :qudt/NonRotatingInertialFrame-frameType})

(def NonRotatingInertialFrame-frameType
  "NonRotatingInertialFrame-frameType"
  {:db/ident    :qudt/NonRotatingInertialFrame-frameType,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue :qudt.type/FT_NON-ROTATING,
   :sh/path     :qudt/frameType})

(def NumericType
  "Numeric data types are data types whose values denote quantities as defined by a mathematical number system. Numeric data types are data types whose values denote quantities (in some mathematical number system)."
  {:db/ident :qudt/NumericType,
   :dcterms/description
   ["Numeric data types are data types whose values denote quantities as defined by a mathematical number system."
    "Numeric data types are data types whose values denote quantities (in some mathematical number system)."],
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Numeric Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/SignednessType,
                      :owl/onProperty    :qudt/signedness,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/accuracy,
                      :rdf/type           :owl/Restriction}
                     :qudt/ScalarDatatype
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/signedness,
                      :rdf/type           :owl/Restriction}],
   :sh/property [:qudt/NumericType-accuracy :qudt/NumericType-signedness]})

(def NumericType-accuracy
  "NumericType-accuracy"
  {:db/ident    :qudt/NumericType-accuracy,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/accuracy})

(def NumericType-signedness
  "NumericType-signedness"
  {:db/ident    :qudt/NumericType-signedness,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/SignednessType,
   :sh/maxCount 1,
   :sh/path     :qudt/signedness})

(def NumericUnion
  "Numeric union"
  {:db/ident        :qudt/NumericUnion,
   :rdf/type        :owl/Class,
   :rdfs/label      "Numeric union",
   :rdfs/subClassOf [:dtype/numericUnion :qudt/Concept]})

(def OOST_OFF
  "Off"
  {:db/ident         :qudt/OOST_OFF,
   :qudt/code        "0",
   :qudt/literal     "off",
   :rdf/type         [:qudt/OnOffStateType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Off"})

(def OOST_ON
  "On"
  {:db/ident         :qudt/OOST_ON,
   :qudt/code        "0",
   :qudt/literal     "on",
   :rdf/type         [:qudt/OnOffStateType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "On"})

(def OOST_ZERO-MEANS-OFF
  "Zero means off"
  {:db/ident         :qudt/OOST_ZERO-MEANS-OFF,
   :dtype/literal    "zero-means-off",
   :qudt/inverted    true,
   :rdf/type         [:qudt/OnOffStateType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Zero means off"})

(def OOST_ZERO-MEANS-ON
  "Zero means on"
  {:db/ident         :qudt/OOST_ZERO-MEANS-ON,
   :dtype/literal    "zero-means-on",
   :qudt/inverted    true,
   :rdf/type         [:qudt/OnOffStateType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Zero means on"})

(def OctetEncoding
  "OCTET Encoding"
  {:db/ident         :qudt/OctetEncoding,
   :qudt/bytes       1,
   :rdf/type         [:qudt/ByteEncodingType
                      :qudt/BooleanEncodingType
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "OCTET Encoding"})

(def OctetType
  "An 8 bit unsigned integer"
  {:db/ident            :qudt/OctetType,
   :dcterms/description "An 8 bit unsigned integer",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Octet Type",
   :rdfs/subClassOf     :qudt/UnsignedIntegerType})

(def OffOnStateTypeEnumeration
  "A discrete state enumeration whose values are 'off' and 'on'. The 'off' value is encoded as a zero (0) and the 'on' value as a one (1)."
  {:db/ident :qudt/OffOnStateTypeEnumeration,
   :rdfs/comment
   "A discrete state enumeration whose values are 'off' and 'on'. The 'off' value is encoded as a zero (0) and the 'on' value as a one (1)."})

(def OnOffStateType
  "On off state type"
  {:db/ident         :qudt/OnOffStateType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "On off state type",
   :rdfs/subClassOf  :qudt/DiscreteState})

(def OnOffStateTypeEnumeration
  "A discrete state enumeration whose values are 'off' and 'on'. The 'on' value is encoded as a zero (0) and the 'off' value as a one (1)."
  {:db/ident :qudt/OnOffStateTypeEnumeration,
   :qudt/inverted true,
   :rdfs/comment
   "A discrete state enumeration whose values are 'off' and 'on'. The 'on' value is encoded as a zero (0) and the 'off' value as a one (1)."})

(def OneMeansOff
  "One means off"
  {:db/ident         :qudt/OneMeansOff,
   :qudt/inverted    true,
   :qudt/literal     "off",
   :rdf/type         [:qudt/OnOffStateType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "One means off"})

(def Open
  "Open"
  {:db/ident     :qudt/Open,
   :qudt/code    "1",
   :qudt/literal "open",
   :rdf/type     [:qudt/OpenCloseStateType :owl/NamedIndividual],
   :rdfs/label   "Open"})

(def OpenCloseStateType
  "Open Close State Type"
  {:db/ident        :qudt/OpenCloseStateType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Open Close State Type",
   :rdfs/subClassOf :qudt/DiscreteState})

(def OrderedCollection
  "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements."
  {:db/ident :qudt/OrderedCollection,
   :dcterms/description
   "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ordered Collection Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :dtype/ComparisonOperator,
                      :owl/onProperty    :qudt/orderingRelation,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/OrderedCollection,
                      :owl/onProperty    :rdf/rest,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :rdf/first,
                      :rdf/type          :owl/Restriction}
                     :qudt/Collection]})

(def OrderedCollection-first
  "OrderedCollection-first"
  {:db/ident :qudt/OrderedCollection-first,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :rdf/first})

(def OrderedCollection-orderingRelation
  "OrderedCollection-orderingRelation"
  {:db/ident    :qudt/OrderedCollection-orderingRelation,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :dtype/ComparisonOperator,
   :sh/maxCount 1,
   :sh/path     :qudt/orderingRelation})

(def OrderedCollection-rest
  "OrderedCollection-rest"
  {:db/ident :qudt/OrderedCollection-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/OrderedCollectionType,
   :sh/path  :rdf/rest})

(def OrderedCollectionType
  "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements."
  {:db/ident :qudt/OrderedCollectionType,
   :dcterms/description
   "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Ordered Collection Type",
   :rdfs/subClassOf :qudt/CollectionType,
   :sh/property [:qudt/OrderedCollection-rest
                 :qudt/OrderedCollection-orderingRelation
                 :qudt/OrderedCollection-first]})

(def OrderedTree
  "<p class=\"lm-para\">An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as \\(\\lt\\) or \\(\\gt\\)) that is used to order the nodes.</p>"
  {:db/ident :qudt/OrderedTree,
   :dcterms/description
   "<p class=\"lm-para\">An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as \\(\\lt\\) or \\(\\gt\\)) that is used to order the nodes.</p>",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ordered Tree Type",
   :rdfs/subClassOf [:qudt/Tree :qudt/OrderedCollection]})

(def OrderedTreeType
  "An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as $\\lt$ or $\\gt$) that is used to order the nodes."
  {:db/ident :qudt/OrderedTreeType,
   :dcterms/description
   "An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as $\\lt$ or $\\gt$) that is used to order the nodes.",
   :rdf/type :owl/Class,
   :rdfs/label "Ordered Tree Type",
   :rdfs/subClassOf [:qudt/TreeType :qudt/OrderedCollectionType]})

(def OrderedType
  "Describes how a data or information structure is ordered."
  {:db/ident :qudt/OrderedType,
   :dcterms/description
   "Describes how a data or information structure is ordered.",
   :owl/oneOf [:qudt/Unordered :qudt/PartiallyOrdered :qudt/TotallyOrdered],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Ordered type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def OrdinalScale
  "The ordinal type allows for rank order (1st, 2nd, 3rd, etc.) by which data can be sorted, but still does not allow for relative degree of difference between them. Examples include, on one hand, dichotomous data with dichotomous (or dichotomized) values such as 'sick' vs. 'healthy' when measuring health, 'guilty' vs. 'innocent' when making judgments in courts, 'wrong/false' vs. 'right/true' when measuring truth value, and, on the other hand, non-dichotomous data consisting of a spectrum of values, such as 'completely agree', 'mostly agree', 'mostly disagree', 'completely disagree' when measuring opinion."
  {:db/ident :qudt/OrdinalScale,
   :qudt/informativeReference
   "https://en.wikipedia.org/wiki/Level_of_measurement",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The ordinal type allows for rank order (1st, 2nd, 3rd, etc.) by which data can be sorted, but still does not allow for relative degree of difference between them. Examples include, on one hand, dichotomous data with dichotomous (or dichotomized) values such as 'sick' vs. 'healthy' when measuring health, 'guilty' vs. 'innocent' when making judgments in courts, 'wrong/false' vs. 'right/true' when measuring truth value, and, on the other hand, non-dichotomous data consisting of a spectrum of values, such as 'completely agree', 'mostly agree', 'mostly disagree', 'completely disagree' when measuring opinion.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Ordinal scale",
   :rdfs/seeAlso ["http://qudt.org/2.1/schema/qudt/NominalScale"
                  "http://qudt.org/2.1/schema/qudt/IntervalScale"
                  "http://qudt.org/2.1/schema/qudt/RatioScale"]
   :rdfs/subClassOf [:qudt/Scale
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/order,
                      :rdf/type        :owl/Restriction}]})

(def OrdinalType
  "An ordinal data type is a data type that specifies the properties of values that can easily be put in a one to one correspondence with a subset of the natural numbers. Examples include boolean, character, and integer data types."
  {:db/ident :qudt/OrdinalType,
   :dcterms/description
   "An ordinal data type is a data type that specifies the properties of values that can easily be put in a one to one correspondence with a subset of the natural numbers. Examples include boolean, character, and integer data types.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ordinal Data Type",
   :rdfs/subClassOf :qudt/ScalarDatatype})

(def Organization
  "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/Organization,
   :dcterms/description
   "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Organization",
   :rdfs/subClassOf [{:owl/minCardinality 0,
                      :owl/onProperty     :qudt/url,
                      :rdf/type           :owl/Restriction}
                     :qudt/Concept]})

(def PARTIAL-ARRAY
  "PARTIAL ARRAY"
  {:db/ident   :qudt/PARTIAL-ARRAY,
   :rdf/type   [:qudt/ArrayType :owl/NamedIndividual],
   :rdfs/label "PARTIAL ARRAY"})

(def PaddingType
  "This describes how unused bits of a field are filled. Unused bits could be set to one or zero. A third option is \"don't care\"."
  {:db/ident :qudt/PaddingType,
   :dcterms/description
   "This describes how unused bits of a field are filled. Unused bits could be set to one or zero. A third option is \"don't care\".",
   :owl/oneOf
   [:qudt.type/PadWithOnes :qudt.type/PadWithZeros :qudt.type/PadWithAny],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Padding type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ParameterModifiabilityType
  "An enumeration of literals that signify whether a parameter is modifiable and if so, by whom."
  {:db/ident :qudt/ParameterModifiabilityType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An enumeration of literals that signify whether a parameter is modifiable and if so, by whom.",
   :rdfs/label "Parameter modifiability type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def PartiallyOrdered
  "Partially Ordered"
  {:db/ident         :qudt/PartiallyOrdered,
   :qudt/literal     "partial",
   :qudt/plainTextDescription "Partial ordered structure.",
   :rdf/type         [:qudt/OrderedType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Partially Ordered"})

(def Percentage
  "A Scalar Datatype for expressing a dimensionless ratio."
  {:db/ident :qudt/Percentage,
   :dcterms/description
   "A Scalar Datatype for expressing a dimensionless ratio.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Percentage Type",
   :rdfs/subClassOf :qudt/NumericType})

(def PhysicalAddress
  "A physical address is a pointer to a memory location. A \"Structured Datatype\"."
  {:db/ident            :qudt/PhysicalAddress,
   :dcterms/description ["A physical address is a pointer to a memory location."
                         "A \"Structured Datatype\"."],
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Physical Address Type",
   :rdfs/subClassOf     :qudt/CompositeDatatype})

(def PhysicalConstant
  "A physical constant is a physical quantity that is generally believed to be both universal in nature and constant in time. It can be contrasted with a mathematical constant, which is a fixed numerical value but does not directly involve any physical measurement. There are many physical constants in science, some of the most widely recognized being the speed of light in vacuum c, Newton's gravitational constant G, Planck's constant h, the electric permittivity of free space ε0, and the elementary charge e. Physical constants can take many dimensional forms, or may be dimensionless depending on the system of quantities and units used."
  {:db/ident :qudt/PhysicalConstant,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Physical_constant",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A physical constant is a physical quantity that is generally believed to be both universal in nature and constant in time. It can be contrasted with a mathematical constant, which is a fixed numerical value but does not directly involve any physical measurement. There are many physical constants in science, some of the most widely recognized being the speed of light in vacuum c, Newton's gravitational constant G, Planck's constant h, the electric permittivity of free space ε0, and the elementary charge e. Physical constants can take many dimensional forms, or may be dimensionless depending on the system of quantities and units used.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Physical Constant",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/mathMLdefinition,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/latexSymbol,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/latexDefinition,
                      :rdf/type           :owl/Restriction}
                     :qudt/Quantity]})

(def PlaneAngleUnit
  "Plane Angle Unit"
  {:db/ident         :qudt/PlaneAngleUnit,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Plane Angle Unit",
   :rdfs/subClassOf  :qudt/AngleUnit})

(def PolarCoordinates
  "A set of variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis."
  {:db/ident :qudt/PolarCoordinates,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Polar Coordinate System Type",
   :rdfs/subClassOf :qudt/Coordinates})

(def PolarCoordinatesType
  "A set of variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis."
  {:db/ident :qudt/PolarCoordinatesType,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis.",
   :rdf/type :owl/Class,
   :rdfs/label "Polar Coordinate System Type",
   :rdfs/subClassOf :qudt/CoordinateSystemType})

(def Polarity
  "A \"Tagged Enumeration\" with the following instance(s): \"negative\", \"positive\"."
  {:db/ident :qudt/Polarity,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A \"Tagged Enumeration\" with the following instance(s): \"negative\", \"positive\".",
   :rdfs/label "Polarity",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def PositiveIntegerType
  "Positive Integers are integers that are either non-zero and non-negative."
  {:db/ident         :qudt/PositiveIntegerType,
   :dcterms/description
   "Positive Integers are integers that are either non-zero and non-negative.",
   :owl/disjointWith :qudt/SignedIntegerType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt/IntegerDatatype
                                              :qudt/UnsignedType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/label       "Positive Integer Type",
   :rdfs/subClassOf  [:qudt/UnsignedType :qudt/IntegerDatatype]})

(def Prefix
  "Prefix"
  {:db/ident         :qudt/Prefix,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Prefix",
   :rdfs/subClassOf  [{:owl/minCardinality 0,
                       :owl/onProperty     :qudt/symbol,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/latexSymbol,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/prefixMultiplier,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/UCUMcs-term,
                       :owl/onProperty    :qudt/ucumCode,
                       :rdf/type          :owl/Restriction}
                      :qudt/Verifiable
                      :qudt/Concept]})

(def PrefixUnit
  "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/PrefixUnit,
   :dcterms/description
   "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."})

(def Proceedings
  "Pub proceedings type"
  {:db/ident      :qudt/Proceedings,
   :dtype/literal "proceedings",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub proceedings type"})

(def PubEnumeratedType
  "Pub enumerated type"
  {:db/ident        :qudt/PubEnumeratedType,
   :owl/oneOf       [:qudt/Article
                     :qudt/Book
                     :qudt/InBook
                     :qudt/InProceedings
                     :qudt/Proceedings
                     :qudt/Unpublished
                     :qudt/TechReport
                     :qudt/Manual
                     :qudt/InCollection
                     :qudt/Conference
                     :qudt/Booklet
                     :qudt/Misc],
   :rdf/type        :owl/Class,
   :rdfs/label      "Pub enumerated type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def Quantifiable
  "<p><em>Quantifiable</em> ascribes to some thing the capability of being measured, observed, or counted.</p>"
  {:db/ident :qudt/Quantifiable,
   :rdf/type :owl/Class,
   :rdfs/comment
   "<p><em>Quantifiable</em> ascribes to some thing the capability of being measured, observed, or counted.</p>",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Quantifiable",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dataType,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dataEncoding,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/relativeStandardUncertainty,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    :qudt/standardUncertainty,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/value,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/DataEncoding,
                      :owl/onProperty    :qudt/dataEncoding,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/unit,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Unit,
                      :owl/onProperty    :qudt/unit,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    :qudt/relativeStandardUncertainty,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/standardUncertainty,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :qudt/dataType,
                      :rdf/type          :owl/Restriction}
                     :qudt/Aspect]})

(def Quantity
  "<p class=\"lm-para\">A <b>quantity</b> is the measurement of an observable property of a particular object, event, or physical system. A quantity is always associated with the context of measurement (i.e. the thing measured, the measured value, the accuracy of measurement, etc.) whereas the underlying <b>quantity kind</b> is independent of any particular measurement. Thus, length is a quantity kind while the height of a rocket is a specific quantity of length; its magnitude that may be expressed in meters, feet, inches, etc. Examples of physical quantities include physical constants, such as the speed of light in a vacuum, Planck's constant, the electric permittivity of free space, and the fine structure constant. </p> <p class=\"lm-para\">In other words, quantities are quantifiable aspects of the world, such as the duration of a movie, the distance between two points, velocity of a car, the pressure of the atmosphere, and a person's weight; and units are used to describe their numerical measure. <p class=\"lm-para\">Many <b>quantity kinds</b> are related to each other by various physical laws, and as a result, the associated units of some quantity kinds can be expressed as products (or ratios) of powers of other quantity kinds (e.g., momentum is mass times velocity and velocity is defined as distance divided by time). In this way, some quantities can be calculated from other measured quantities using their associations to the quantity kinds in these expressions. These quantity kind relationships are also discussed in dimensional analysis. Those that cannot be so expressed can be regarded as \"fundamental\" in this sense.</p> <p class=\"lm-para\">A quantity is distinguished from a \"quantity kind\" in that the former carries a value and the latter is a type specifier.</p>"
  {:db/ident :qudt/Quantity,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Quantity",
   :rdf/type :owl/Class,
   :rdfs/comment
   "<p class=\"lm-para\">A <b>quantity</b> is the measurement of an observable property of a particular object, event, or physical system. A quantity is always associated with the context of measurement (i.e. the thing measured, the measured value, the accuracy of measurement, etc.) whereas the underlying <b>quantity kind</b> is independent of any particular measurement. Thus, length is a quantity kind while the height of a rocket is a specific quantity of length; its magnitude that may be expressed in meters, feet, inches, etc. Examples of physical quantities include physical constants, such as the speed of light in a vacuum, Planck's constant, the electric permittivity of free space, and the fine structure constant. </p>\n\n<p class=\"lm-para\">In other words, quantities are quantifiable aspects of the world, such as the duration of a movie, the distance between two points, velocity of a car, the pressure of the atmosphere, and a person's weight; and units are used to describe their numerical measure. \n\n<p class=\"lm-para\">Many <b>quantity kinds</b> are related to each other by various physical laws, and as a result, the associated units of some quantity kinds can be expressed as products (or ratios) of powers of other quantity kinds (e.g., momentum is mass times velocity and velocity is defined as distance divided by time). In this way, some quantities can be calculated from other measured quantities using their associations to the quantity kinds in these expressions. These quantity kind relationships are also discussed in dimensional analysis. Those that cannot be so expressed can be regarded as \"fundamental\" in this sense.</p>\n<p class=\"lm-para\">A quantity is distinguished from a \"quantity kind\" in that the former carries a value and the latter is a type specifier.</p>",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Quantity",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/QuantityKind,
                      :owl/onProperty    :qudt/hasQuantityKind,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/QuantityValue,
                      :owl/onProperty    :qudt/quantityValue,
                      :rdf/type          :owl/Restriction}
                     :qudt/Concept
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/hasQuantityKind,
                      :rdf/type           :owl/Restriction}
                     :qudt/Quantifiable
                     {:owl/allValuesFrom :xsd/boolean,
                      :owl/onProperty    :qudt/isDeltaQuantity,
                      :rdf/type          :owl/Restriction}]})

(def QuantityKind
  "A <b>Quantity Kind</b> is any observable property that can be measured and quantified numerically. Familiar examples include physical properties such as length, mass, time, force, energy, power, electric charge, etc. Less familiar examples include currency, interest rate, price to earning ratio, and information capacity."
  {:db/ident :qudt/QuantityKind,
   :qudt/informativeReference
   "http://www.electropedia.org/iev/iev.nsf/display?openform&ievref=112-01-04",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A <b>Quantity Kind</b> is any observable property that can be  measured and quantified numerically. Familiar examples include physical properties such as length, mass, time, force, energy, power, electric charge, etc. Less familiar examples include currency, interest rate, price to earning ratio, and information capacity.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Quantity Kind",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/SystemOfQuantityKinds,
                      :owl/onProperty    :qudt/isQuantityKindOf,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/generalization,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/applicableCGSUnit,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/mathMLdefinition,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/baseSIUnitDimensions,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/latexDefinition,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/baseImperialUnitDimensions,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/baseCGSUnitDimensions,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/applicableISOUnit,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/baseISOUnitDimensions,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/applicableImperialUnit,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/QuantityKind,
                      :owl/onProperty    :qudt/generalization,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/baseUSCustomaryUnitDimensions,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/applicableSIUnit,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/QuantityKindDimensionVector_SI,
                      :owl/onProperty    :qudt/dimensionVectorForSI,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :qudt/QuantityKindDimensionVector,
                      :owl/onProperty :qudt/qkdvNumerator,
                      :rdf/type       :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/applicableUnit,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :qudt/QuantityKindDimensionVector,
                      :owl/onProperty :qudt/qkdvDenominator,
                      :rdf/type       :owl/Restriction}
                     :qudt/AbstractQuantityKind
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dimensionVectorForSI,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/QuantityKindDimensionVector,
                      :owl/onProperty    :qudt/hasDimensionVector,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/expression,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/applicableUSCustomaryUnit,
                      :rdf/type           :owl/Restriction}
                     :qudt/Verifiable]})

(def QuantityKindDimensionVector
  "<p class=\"lm-para\">A <em>Quantity Kind Dimension Vector</em> describes the dimensionality of a quantity kind in the context of a system of units. In the SI system of units, the dimensions of a quantity kind are expressed as a product of the basic physical dimensions mass (\\(M\\)), length (\\(L\\)), time (\\(T\\)) current (\\(I\\)), amount of substance (\\(N\\)), luminous intensity (\\(J\\)) and absolute temperature (\\(\\theta\\)) as \\(dim \\, Q = L^{\\alpha} \\, M^{\\beta} \\, T^{\\gamma} \\, I ^{\\delta} \\, \\theta ^{\\epsilon} \\, N^{\\eta} \\, J ^{\\nu}\\).</p> <p class=\"lm-para\">The rational powers of the dimensional exponents, \\(\\alpha, \\, \\beta, \\, \\gamma, \\, \\delta, \\, \\epsilon, \\, \\eta, \\, \\nu\\), are positive, negative, or zero.</p> <p class=\"lm-para\">For example, the dimension of the physical quantity kind \\(\\it{speed}\\) is \\(\\boxed{length/time}\\), \\(L/T\\) or \\(LT^{-1}\\), and the dimension of the physical quantity kind force is \\(\\boxed{mass \\times acceleration}\\) or \\(\\boxed{mass \\times (length/time)/time}\\), \\(ML/T^2\\) or \\(MLT^{-2}\\) respectively.</p>"
  {:db/ident :qudt/QuantityKindDimensionVector,
   :qudt/informativeReference
   ["http://en.wikipedia.org/wiki/Dimensional_analysis"
    "http://web.mit.edu/2.25/www/pdf/DA_unified.pdf"],
   :rdf/type :owl/Class,
   :rdfs/comment
   "<p class=\"lm-para\">A  <em>Quantity Kind Dimension Vector</em> describes the dimensionality of a quantity kind in the context of a system of units. In the SI system of units, the dimensions of a quantity kind are expressed as a product of the basic physical dimensions mass (\\(M\\)), length (\\(L\\)), time (\\(T\\)) current (\\(I\\)), amount of substance (\\(N\\)), luminous intensity (\\(J\\)) and absolute temperature (\\(\\theta\\)) as \\(dim \\, Q = L^{\\alpha} \\, M^{\\beta} \\, T^{\\gamma} \\, I ^{\\delta} \\, \\theta ^{\\epsilon} \\, N^{\\eta} \\, J ^{\\nu}\\).</p>\n\n<p class=\"lm-para\">The rational powers of the dimensional exponents, \\(\\alpha, \\, \\beta, \\, \\gamma, \\, \\delta, \\, \\epsilon, \\, \\eta, \\, \\nu\\), are positive, negative, or zero.</p>\n\n<p class=\"lm-para\">For example, the dimension of the physical quantity kind \\(\\it{speed}\\) is \\(\\boxed{length/time}\\), \\(L/T\\) or \\(LT^{-1}\\), and the dimension of the physical quantity kind force is \\(\\boxed{mass \\times acceleration}\\) or \\(\\boxed{mass \\times (length/time)/time}\\), \\(ML/T^2\\) or \\(MLT^{-2}\\) respectively.</p>",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Quantity Kind Dimension Vector",
   :rdfs/subClassOf
   [:qudt/Concept
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/dimensionExponentForLength,
     :rdf/type        :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/dimensionExponentForThermodynamicTemperature,
     :rdf/type        :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/dimensionExponentForTime,
     :rdf/type        :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/dimensionExponentForElectricCurrent,
     :rdf/type        :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/dimensionExponentForAmountOfSubstance,
     :rdf/type        :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/dimensionExponentForLuminousIntensity,
     :rdf/type        :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/dimensionlessExponent,
     :rdf/type        :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/dimensionExponentForMass,
     :rdf/type        :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     :qudt/latexDefinition,
     :rdf/type           :owl/Restriction}]})

(def QuantityKindDimensionVector_CGS
  "A <em>CGS Dimension Vector</em> is used to specify the dimensions for a C.G.S. quantity kind."
  {:db/ident :qudt/QuantityKindDimensionVector_CGS,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A <em>CGS Dimension Vector</em> is used to specify the dimensions for a C.G.S. quantity kind.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "CGS Dimension vector",
   :rdfs/subClassOf :qudt/QuantityKindDimensionVector})

(def QuantityKindDimensionVector_CGS-EMU
  "A <em>CGS EMU Dimension Vector</em> is used to specify the dimensions for EMU C.G.S. quantity kind."
  {:db/ident :qudt/QuantityKindDimensionVector_CGS-EMU,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A <em>CGS EMU Dimension Vector</em> is used to specify the dimensions for EMU C.G.S. quantity kind.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "CGS EMU Dimension vector",
   :rdfs/subClassOf :qudt/QuantityKindDimensionVector_CGS})

(def QuantityKindDimensionVector_CGS-ESU
  "A <em>CGS ESU Dimension Vector</em> is used to specify the dimensions for ESU C.G.S. quantity kind."
  {:db/ident :qudt/QuantityKindDimensionVector_CGS-ESU,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A <em>CGS ESU Dimension Vector</em> is used to specify the dimensions for ESU C.G.S. quantity kind.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "CGS ESU Dimension vector",
   :rdfs/subClassOf :qudt/QuantityKindDimensionVector_CGS})

(def QuantityKindDimensionVector_CGS-GAUSS
  "A <em>CGS GAUSS Dimension Vector</em> is used to specify the dimensions for Gaussioan C.G.S. quantity kind."
  {:db/ident :qudt/QuantityKindDimensionVector_CGS-GAUSS,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A <em>CGS GAUSS Dimension Vector</em> is used to specify the dimensions for Gaussioan C.G.S. quantity kind.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "CGS GAUSS Dimension vector",
   :rdfs/subClassOf :qudt/QuantityKindDimensionVector_CGS})

(def QuantityKindDimensionVector_CGS-LH
  "A <em>CGS LH Dimension Vector</em> is used to specify the dimensions for Lorentz-Heaviside C.G.S. quantity kind."
  {:db/ident :qudt/QuantityKindDimensionVector_CGS-LH,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A <em>CGS LH Dimension Vector</em> is used to specify the dimensions for Lorentz-Heaviside C.G.S. quantity kind.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "CGS LH Dimension vector",
   :rdfs/subClassOf :qudt/QuantityKindDimensionVector_CGS})

(def QuantityKindDimensionVector_ISO
  "ISO Dimension vector"
  {:db/ident         :qudt/QuantityKindDimensionVector_ISO,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "ISO Dimension vector",
   :rdfs/subClassOf  :qudt/QuantityKindDimensionVector})

(def QuantityKindDimensionVector_Imperial
  "Imperial dimension vector"
  {:db/ident         :qudt/QuantityKindDimensionVector_Imperial,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Imperial dimension vector",
   :rdfs/subClassOf  :qudt/QuantityKindDimensionVector})

(def QuantityKindDimensionVector_SI
  "Quantity Kind Dimension vector (SI)"
  {:db/ident         :qudt/QuantityKindDimensionVector_SI,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Quantity Kind Dimension vector (SI)",
   :rdfs/subClassOf  :qudt/QuantityKindDimensionVector})

(def QuantityType
  "\\(\\textit{Quantity Type}\\) is an enumeration of quanity kinds. It specializes \\(\\boxed{dtype:EnumeratedValue}\\) by constrinaing \\(\\boxed{dtype:value}\\) to instances of \\(\\boxed{qudt:QuantityKind}\\)."
  {:db/ident :qudt/QuantityType,
   :dcterms/description
   "\\(\\textit{Quantity Type}\\) is an enumeration of quanity kinds. It specializes \\(\\boxed{dtype:EnumeratedValue}\\) by constrinaing \\(\\boxed{dtype:value}\\) to instances of \\(\\boxed{qudt:QuantityKind}\\).",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Quantity type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/QuantityKind,
                      :owl/onProperty    :dtype/value,
                      :rdf/type          :owl/Restriction}
                     :qudt/EnumeratedValue]})

(def QuantityValue
  "A <i>Quantity Value</i> expresses the magnitude and kind of a quantity and is given by the product of a numerical value <code>n</code> and a unit of measure <code>U</code>. The number multiplying the unit is referred to as the numerical value of the quantity expressed in that unit. Refer to <a href=\"http://physics.nist.gov/Pubs/SP811/sec07.html\">NIST SP 811 section 7</a> for more on quantity values."
  {:db/ident :qudt/QuantityValue,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A <i>Quantity Value</i> expresses the magnitude and kind of a quantity and is given by the product of a numerical value <code>n</code> and a unit of measure <code>U</code>. The number multiplying the unit is referred to as the numerical value of the quantity expressed in that unit. Refer to <a href=\"http://physics.nist.gov/Pubs/SP811/sec07.html\">NIST SP 811 section 7</a> for more on quantity values.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Quantity value",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/unit,
                      :rdf/type        :owl/Restriction}
                     :qudt/Quantifiable
                     :qudt/Concept]})

(def QuantityValueType
  "A sub-type of 'Dimensional Data Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/QuantityValueType,
   :dcterms/description
   "A sub-type of 'Dimensional Data Type'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Quantity value type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/Unit,
                      :owl/onProperty    :qudt/elementUnit,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/QuantityType,
                      :owl/onProperty    :qudt/basis,
                      :rdf/type          :owl/Restriction}
                     :qudt/DimensionalDatatype
                     {:owl/allValuesFrom :qudt/NumericType,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}],
   :sh/property [:qudt/QuantityValueType-elementUnit
                 :qudt/QuantityValueType-basis
                 :qudt/QuantityValueType-elementType]})

(def QuantityValueType-basis
  "QuantityValueType-basis"
  {:db/ident :qudt/QuantityValueType-basis,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/QuantityType,
   :sh/path  :qudt/basis})

(def QuantityValueType-elementType
  "QuantityValueType-elementType"
  {:db/ident :qudt/QuantityValueType-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/NumericType,
   :sh/path  :qudt/elementType})

(def QuantityValueType-elementUnit
  "QuantityValueType-elementUnit"
  {:db/ident    :qudt/QuantityValueType-elementUnit,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Unit,
   :sh/maxCount 1,
   :sh/path     :qudt/elementUnit})

(def RELATIVE-DATETIME
  "Days and time relative to some Epoch"
  {:db/ident      :qudt/RELATIVE-DATETIME,
   :dcterms/description "Days and time relative to some Epoch",
   :dtype/literal "reldate",
   :qudt/dimensionality 1,
   :qudt/encodingDescription "TBD",
   :rdf/type      [:qudt/DateStringType :owl/NamedIndividual],
   :rdfs/label    "Relative Date And Time"})

(def RN_BINARY-BASE
  "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 2, and then the values of m and e are determined given this choice of base."
  {:db/ident :qudt/RN_BINARY-BASE,
   :rdf/type [:qudt/RealNumberType :owl/NamedIndividual],
   :rdfs/comment
   "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 2, and then the values of m and e are determined given this choice of base.",
   :rdfs/label "Real number binary base"})

(def RN_DECIMAL-BASE
  "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 10, and then the values of m and e are determined given this choice of base."
  {:db/ident :qudt/RN_DECIMAL-BASE,
   :rdf/type [:qudt/RealNumberType :owl/NamedIndividual],
   :rdfs/comment
   "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 10, and then the values of m and e are determined given this choice of base.",
   :rdfs/label "Real number decminal base"})

(def RatioScale
  "The ratio type takes its name from the fact that measurement is the estimation of the ratio between a magnitude of a continuous quantity and a unit magnitude of the same kind (Michell, 1997, 1999). A ratio scale possesses a meaningful (unique and non-arbitrary) zero value. Most measurement in the physical sciences and engineering is done on ratio scales. Examples include mass, length, duration, plane angle, energy and electric charge. In contrast to interval scales, ratios are now meaningful because having a non-arbitrary zero point makes it meaningful to say, for example, that one object has \"twice the length\" of another (= is \"twice as long\"). Very informally, many ratio scales can be described as specifying \"how much\" of something (i.e. an amount or magnitude) or \"how many\" (a count). The Kelvin temperature scale is a ratio scale because it has a unique, non-arbitrary zero point called absolute zero."
  {:db/ident :qudt/RatioScale,
   :qudt/informativeReference
   "https://en.wikipedia.org/wiki/Level_of_measurement",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The ratio type takes its name from the fact that measurement is the estimation of the ratio between a magnitude of a continuous quantity and a unit magnitude of the same kind (Michell, 1997, 1999). A ratio scale possesses a meaningful (unique and non-arbitrary) zero value. Most measurement in the physical sciences and engineering is done on ratio scales. Examples include mass, length, duration, plane angle, energy and electric charge. In contrast to interval scales, ratios are now meaningful because having a non-arbitrary zero point makes it meaningful to say, for example, that one object has \"twice the length\" of another (= is \"twice as long\"). Very informally, many ratio scales can be described as specifying \"how much\" of something (i.e. an amount or magnitude) or \"how many\" (a count). The Kelvin temperature scale is a ratio scale because it has a unique, non-arbitrary zero point called absolute zero.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Ratio scale",
   :rdfs/seeAlso ["http://qudt.org/2.1/schema/qudt/OrdinalScale"
                  "http://qudt.org/2.1/schema/qudt/NominalScale"
                  "http://qudt.org/2.1/schema/qudt/IntervalScale"]
   :rdfs/subClassOf :qudt/Scale})

(def RawValueTupleMember
  "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version."
  {:db/ident         :qudt/RawValueTupleMember,
   :dcterms/description
   "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version.",
   :owl/equivalentClass
   {:owl/intersectionOf [:qudt/TupleMember
                         {:owl/allValuesFrom :qudt/UnsignedIntegerType,
                          :owl/onProperty    :qudt/elementType,
                          :rdf/type          :owl/Restriction}],
    :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Raw value tuple member",
   :rdfs/subClassOf  [{:owl/allValuesFrom :qudt/UnsignedIntegerType,
                       :owl/onProperty    :qudt/elementType,
                       :rdf/type          :owl/Restriction}
                      :qudt/TupleMember]})

(def RawValueTupleMember-elementType
  "RawValueTupleMember-elementType"
  {:db/ident :qudt/RawValueTupleMember-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/UnsignedIntegerType,
   :sh/path  :qudt/elementType})

(def RawValueTupleMemberType
  "Raw value tuple member type"
  {:db/ident            :qudt/RawValueTupleMemberType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt/TupleMemberType
                                              {:owl/allValuesFrom
                                               :qudt/UnsignedIntegerType,
                                               :owl/onProperty
                                               :qudt/elementType,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type            [:sh/NodeShape :owl/Class],
   :rdfs/label          "Raw value tuple member type",
   :rdfs/subClassOf     :qudt/TupleMemberType,
   :sh/property         :qudt/RawValueTupleMember-elementType})

(def RealDatatype
  "A real number is represented as a factor, called the mantissa, multiplied by a power (the exponent) of a base. Different bases yield different approximations to real numbers, and conversion between them is limited in accuracy. Four floating-point types are defined in 'IEEE-754 Standard for Binary Floating-Point'. These types are 'single', 'extended single', 'double', and 'extended double'."
  {:db/ident :qudt/RealDatatype,
   :dcterms/description
   "A real number is represented as a factor, called the mantissa, multiplied by a power (the exponent) of a base. Different bases yield different approximations to real numbers, and conversion between them is limited in accuracy.  Four floating-point types are defined in 'IEEE-754 Standard for Binary Floating-Point'. These types are 'single', 'extended single', 'double', and 'extended double'.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Real Datatype",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/precision,
                      :rdf/type           :owl/Restriction}
                     :qudt/NumericType
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/base,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/maxExponent,
                      :rdf/type           :owl/Restriction}],
   :sh/property [:qudt/RealDatatype-maxExponent
                 :qudt/RealDatatype-base
                 :qudt/RealDatatype-precision]})

(def RealDatatype-base
  "RealDatatype-base"
  {:db/ident    :qudt/RealDatatype-base,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/base})

(def RealDatatype-maxExponent
  "RealDatatype-maxExponent"
  {:db/ident    :qudt/RealDatatype-maxExponent,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/maxExponent})

(def RealDatatype-precision
  "RealDatatype-precision"
  {:db/ident    :qudt/RealDatatype-precision,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/precision})

(def RealDoublePrecisionType
  "A real double precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes. An example of a real double precision data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 8 bytes for storage on 32-bit machine architectures."
  {:db/ident         :qudt/RealDoublePrecisionType,
   :dcterms/description
   "A real double precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes.\n\nAn example of a real double precision data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 8 bytes for storage on 32-bit machine architectures.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/RealDatatype
                                              :qudt/DoublePrecisionType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Real Double Precision Type",
   :rdfs/subClassOf  [:qudt/RealDatatype :qudt/DoublePrecisionType]})

(def RealNumberType
  "This is the class of data values that approximate real numbers in finite precision. Often, such values are expressed in \"mantissa, base, exponent\" form. Any rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. Typically, b is chosen to be either 2 or 10, and then the values of m and e are determined given the choice of base."
  {:db/ident :qudt/RealNumberType,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "This is the class of data values that approximate real numbers in finite precision. Often, such values are expressed in \"mantissa, base, exponent\" form. Any rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. Typically, b is chosen to be either 2 or 10, and then the values of m and e are determined given the choice of base.",
   :rdfs/label "Real number type",
   :rdfs/subClassOf :qudt/RealDatatype})

(def RealSinglePrecisionType
  "A real single precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes. An example of a real single precisoin data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 4 bytes for storage on 32-bit machine architectures."
  {:db/ident         :qudt/RealSinglePrecisionType,
   :dcterms/description
   "A real single precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes. An example of a real single precisoin data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 4 bytes for storage on 32-bit machine architectures.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/RealDatatype
                                              :qudt/SinglePrecisionType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Real Single Precision Type",
   :rdfs/subClassOf  [:qudt/SinglePrecisionType :qudt/RealDatatype]})

(def Record
  "A Record Type is a type whose values are records, i.e. aggregates of several items of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels."
  {:db/ident :qudt/Record,
   :dcterms/description
   "A Record Type is a type whose values are records, i.e. aggregates of several items of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Record Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/FieldType,
                      :owl/onProperty    :qudt/elementTypeList,
                      :rdf/type          :owl/Restriction}
                     :qudt/CompositeDatatype]})

(def ReferenceDatatype
  "A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer. A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer. [Wikipedia]"
  {:db/ident :qudt/ReferenceDatatype,
   :dcterms/description
   ["A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer."
    "A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer. [Wikipedia]"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Reference Data Type",
   :rdfs/subClassOf :qudt/StructuredDatatype})

(def ReferenceFrame
  "A reference frame (or frame of reference) in physics, may refer to a coordinate system or set of axes. The frame serves as the datum to measure the position, orientation, and other properties of objects in it. Reference frame may refer to an observational reference frame tied to the state of motion of an observer. Reference frame may also refer to both an observational reference frame and an attached coordinate system as a unit."
  {:db/ident :qudt/ReferenceFrame,
   :dcterms/description
   "A reference frame (or frame of reference) in physics, may refer to a coordinate system or set of axes.\nThe frame serves as the datum to measure the position, orientation, and other properties of objects in it.\nReference frame may refer to an observational reference frame tied to the state of motion of an observer. \nReference frame may also refer to both an observational reference frame and an attached coordinate system as a unit.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Reference Frame",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/zAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     :skos/Concept
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/xCoordinateDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/yCoordinateDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/zCoordinateDefinition,
                      :rdf/type        :owl/Restriction}
                     :qudt/Concept
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/yAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/xAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/FrameType,
                      :owl/onProperty    :qudt/frameType,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/realization,
                      :rdf/type        :owl/Restriction}],
   :sh/property [:qudt/ReferenceFrame-realization
                 :qudt/ReferenceFrame-xAxisDefinition
                 :qudt/ReferenceFrame-frameType
                 :qudt/ReferenceFrame-comment
                 :qudt/ReferenceFrame-zAxisDefinition
                 :qudt/ReferenceFrame-xCoordinateDefinition
                 :qudt/ReferenceFrame-zCoordinateDefinition
                 :qudt/ReferenceFrame-description
                 :qudt/ReferenceFrame-yAxisDefinition
                 :qudt/ReferenceFrame-yCoordinateDefinition]})

(def ReferenceFrame-comment
  "ReferenceFrame-comment"
  {:db/ident    :qudt/ReferenceFrame-comment,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :vaem/comment})

(def ReferenceFrame-description
  "ReferenceFrame-description"
  {:db/ident    :qudt/ReferenceFrame-description,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :vaem/description})

(def ReferenceFrame-frameType
  "ReferenceFrame-frameType"
  {:db/ident :qudt/ReferenceFrame-frameType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/FrameType,
   :sh/path  :qudt/frameType})

(def ReferenceFrame-realization
  "ReferenceFrame-realization"
  {:db/ident    :qudt/ReferenceFrame-realization,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/realization})

(def ReferenceFrame-xAxisDefinition
  "ReferenceFrame-xAxisDefinition"
  {:db/ident    :qudt/ReferenceFrame-xAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/xAxisDefinition})

(def ReferenceFrame-xCoordinateDefinition
  "ReferenceFrame-xCoordinateDefinition"
  {:db/ident    :qudt/ReferenceFrame-xCoordinateDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/xCoordinateDefinition})

(def ReferenceFrame-yAxisDefinition
  "ReferenceFrame-yAxisDefinition"
  {:db/ident    :qudt/ReferenceFrame-yAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/yAxisDefinition})

(def ReferenceFrame-yCoordinateDefinition
  "ReferenceFrame-yCoordinateDefinition"
  {:db/ident    :qudt/ReferenceFrame-yCoordinateDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/yCoordinateDefinition})

(def ReferenceFrame-zAxisDefinition
  "ReferenceFrame-zAxisDefinition"
  {:db/ident    :qudt/ReferenceFrame-zAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/zAxisDefinition})

(def ReferenceFrame-zCoordinateDefinition
  "ReferenceFrame-zCoordinateDefinition"
  {:db/ident    :qudt/ReferenceFrame-zCoordinateDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/zCoordinateDefinition})

(def RotatingReferenceFrame
  "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/RotatingReferenceFrame,
   :dcterms/description
   "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Rotating reference frame",
   :rdfs/subClassOf :qudt/ReferenceFrame})

(def Rule
  "Rule"
  {:db/ident         :qudt/Rule,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Rule",
   :rdfs/subClassOf  [{:owl/minCardinality 0,
                       :owl/onProperty     :qudt/rationale,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/example,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/RuleType,
                       :owl/onProperty    :qudt/ruleType,
                       :rdf/type          :owl/Restriction}
                      :qudt/Verifiable
                      :qudt/Concept]})

(def RuleType
  "Rule Type"
  {:db/ident         :qudt/RuleType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Rule Type",
   :rdfs/subClassOf  :qudt/EnumeratedValue})

(def SIGNED
  "Signed"
  {:db/ident         :qudt/SIGNED,
   :dtype/literal    "signed",
   :rdf/type         [:qudt/SignednessType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Signed"})

(def STATE-SPACE-MATRIX
  "STATE SPACE MATRIX"
  {:db/ident   :qudt/STATE-SPACE-MATRIX,
   :rdf/type   [:qudt/StateSpaceMatrixType :owl/NamedIndividual],
   :rdfs/label "STATE SPACE MATRIX"})

(def ScalarDatatype
  "Scalar data types are those that have a single value. The permissible values are defined over a domain that may be integers, float, character or boolean. Often a scalar data type is referred to as a primitive data type."
  {:db/ident :qudt/ScalarDatatype,
   :dcterms/description
   "Scalar data types are those that have a single value. The permissible values are defined over a domain that may be integers, float, character or boolean. Often a scalar data type is referred to as a primitive data type.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Scalar Datatype",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/encoding,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :rdfs/Datatype,
                      :owl/onProperty    :qudt/rdfsDatatype,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/minInclusive,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/minExclusive,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bitOrder,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/rdfsDatatype,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bits,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bytes,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/maxInclusive,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/length,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/maxExclusive,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Encoding,
                      :owl/onProperty    :qudt/encoding,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/byteOrder,
                      :rdf/type           :owl/Restriction}],
   :sh/property [:qudt/ScalarDatatype-rdfsDatatype
                 :qudt/ScalarDatatype-maxInclusive
                 :qudt/ScalarDatatype-maxExclusive
                 :qudt/ScalarDatatype-bitOrder
                 :qudt/ScalarDatatype-length
                 :qudt/ScalarDatatype-encoding
                 :qudt/ScalarDatatype-minExclusive
                 :qudt/ScalarDatatype-bits
                 :qudt/ScalarDatatype-byteOrder
                 :qudt/ScalarDatatype-minInclusive
                 :qudt/ScalarDatatype-bytes]})

(def ScalarDatatype-bitOrder
  "ScalarDatatype-bitOrder"
  {:db/ident    :qudt/ScalarDatatype-bitOrder,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/EndianType,
   :sh/maxCount 1,
   :sh/path     :qudt/bitOrder})

(def ScalarDatatype-bits
  "ScalarDatatype-bits"
  {:db/ident    :qudt/ScalarDatatype-bits,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       [:qudt/NumericUnion],
   :sh/path     :qudt/bits})

(def ScalarDatatype-byteOrder
  "ScalarDatatype-byteOrder"
  {:db/ident    :qudt/ScalarDatatype-byteOrder,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/EndianType,
   :sh/maxCount 1,
   :sh/path     :qudt/byteOrder})

(def ScalarDatatype-bytes
  "ScalarDatatype-bytes"
  {:db/ident    :qudt/ScalarDatatype-bytes,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       [:qudt/NumericUnion],
   :sh/path     :qudt/bytes})

(def ScalarDatatype-encoding
  "ScalarDatatype-encoding"
  {:db/ident    :qudt/ScalarDatatype-encoding,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Encoding,
   :sh/maxCount 1,
   :sh/path     :qudt/encoding})

(def ScalarDatatype-length
  "ScalarDatatype-length"
  {:db/ident    :qudt/ScalarDatatype-length,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/length})

(def ScalarDatatype-maxExclusive
  "ScalarDatatype-maxExclusive"
  {:db/ident         :qudt/ScalarDatatype-maxExclusive,
   :rdf/type         :sh/PropertyShape,
   :rdfs/isDefinedBy "http://edg.topbraid.solutions/1.0/schema/qudt",
   :sh/maxCount      1,
   :sh/or            [:qudt/NumericUnion],
   :sh/path          :qudt/maxExclusive})

(def ScalarDatatype-maxInclusive
  "ScalarDatatype-maxInclusive"
  {:db/ident         :qudt/ScalarDatatype-maxInclusive,
   :rdf/type         :sh/PropertyShape,
   :rdfs/isDefinedBy "http://edg.topbraid.solutions/1.0/schema/qudt",
   :sh/maxCount      1,
   :sh/or            [:qudt/NumericUnion],
   :sh/path          :qudt/maxInclusive})

(def ScalarDatatype-minExclusive
  "ScalarDatatype-minExclusive"
  {:db/ident    :qudt/ScalarDatatype-minExclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       [:qudt/NumericUnion],
   :sh/path     :qudt/minExclusive})

(def ScalarDatatype-minInclusive
  "ScalarDatatype-minInclusive"
  {:db/ident    :qudt/ScalarDatatype-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       [:qudt/NumericUnion],
   :sh/path     :qudt/minInclusive})

(def ScalarDatatype-rdfsDatatype
  "ScalarDatatype-rdfsDatatype"
  {:db/ident    :qudt/ScalarDatatype-rdfsDatatype,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/rdfsDatatype})

(def Scale
  "Scales (also called \"scales of measurement\" or \"levels of measurement\") are expressions that typically refer to the theory of scale types."
  {:db/ident :qudt/Scale,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Scales (also called \"scales of measurement\" or \"levels of measurement\")  are expressions that typically refer to the theory of scale types.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Scale",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/TransformType,
                      :owl/onProperty    :qudt/permissibleTransformation,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/ScaleType,
                      :owl/onProperty    :qudt/scaleType,
                      :rdf/type          :owl/Restriction}
                     :qudt/Concept
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dataStructure,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/scaleType,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/MathsFunctionType,
                      :owl/onProperty    :qudt/permissibleMaths,
                      :rdf/type          :owl/Restriction}]})

(def ScaleType
  "Scale type"
  {:db/ident         :qudt/ScaleType,
   :qudt/plainTextDescription
   "Scales, or scales of measurement (or categorization) provide ways of quantifying measurements, values and other enumerated values according to a normative frame of reference.  Four different types of scales are typically used. These are interval, nominal, ordinal and ratio scales.",
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Scale type",
   :rdfs/subClassOf  [{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/dataStructure,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/TransformType,
                       :owl/onProperty    :qudt/permissibleTransformation,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/MathsFunctionType,
                       :owl/onProperty    :qudt/permissibleMaths,
                       :rdf/type          :owl/Restriction}
                      :qudt/EnumeratedValue]})

(def ScaledUnit
  "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/ScaledUnit,
   :dcterms/description
   "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."})

(def Sequence
  "A \"Structured Datatype\"."
  {:db/ident            :qudt/Sequence,
   :dcterms/description "A \"Structured Datatype\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Sequence",
   :rdfs/subClassOf     [{:owl/allValuesFrom :qudt/Sequence,
                          :owl/onProperty    :rdf/rest,
                          :rdf/type          :owl/Restriction}
                         {:owl/allValuesFrom :qudt/Datatype,
                          :owl/onProperty    :rdf/first,
                          :rdf/type          :owl/Restriction}
                         :qudt/Collection]})

(def Sequence-first
  "Sequence-first"
  {:db/ident :qudt/Sequence-first,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :rdf/first})

(def Sequence-rest
  "Sequence-rest"
  {:db/ident :qudt/Sequence-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/SequenceType,
   :sh/path  :rdf/rest})

(def SequenceType
  "A sequence is an enumerated collection of objects in which repetitions are allowed. Like a set, it contains members (also called elements, or terms). The number of elements (possibly infinite) is called the length of the sequence. Unlike a set, order matters, and exactly the same elements can appear multiple times at different positions in the sequence. Formally, a sequence can be defined as a function whose domain is either the set of the natural numbers (for infinite sequences) or the set of the first n natural numbers (for a sequence of finite length n). The position of an element in a sequence is its rank or index; it is the integer from which the element is the image. It depends on the context or of a specific convention, if the first element has index 0 or 1. [Wikipedia]"
  {:db/ident :qudt/SequenceType,
   :dcterms/description
   "A sequence is an enumerated collection of objects in which repetitions are allowed. Like a set, it contains members (also called elements, or terms). The number of elements (possibly infinite) is called the length of the sequence. Unlike a set, order matters, and exactly the same elements can appear multiple times at different positions in the sequence. Formally, a sequence can be defined as a function whose domain is either the set of the natural numbers (for infinite sequences) or the set of the first n natural numbers (for a sequence of finite length n). The position of an element in a sequence is its rank or index; it is the integer from which the element is the image. It depends on the context or of a specific convention, if the first element has index 0 or 1. [Wikipedia]",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Sequence",
   :rdfs/subClassOf :qudt/CollectionType,
   :sh/property [:qudt/Sequence-rest :qudt/Sequence-first]})

(def Set
  "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics."
  {:db/ident :qudt/Set,
   :dcterms/description
   "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Set Type",
   :rdfs/subClassOf :qudt/Collection})

(def SetType
  "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics."
  {:db/ident :qudt/SetType,
   :dcterms/description
   "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics.",
   :rdf/type :owl/Class,
   :rdfs/label "Set Type",
   :rdfs/subClassOf :qudt/CollectionType})

(def ShortIntegerType
  "A Short Integer is an integer that can be represented in two octets (16 bits) of machine memory. Short integers may be signed or unsigned."
  {:db/ident :qudt/ShortIntegerType,
   :dcterms/description
   "A Short Integer is an integer that can be represented in two octets (16 bits) of machine memory. Short integers may be signed or unsigned.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Short Integer Type",
   :rdfs/subClassOf :qudt/IntegerDatatype})

(def ShortSignedIntegerEncoding
  "Short Signed Integer Encoding"
  {:db/ident         :qudt/ShortSignedIntegerEncoding,
   :qudt/bytes       2,
   :rdf/type         :qudt/IntegerEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Short Signed Integer Encoding"})

(def ShortUnsignedIntegerEncoding
  "Short Unsigned Integer Encoding"
  {:db/ident         :qudt/ShortUnsignedIntegerEncoding,
   :qudt/bytes       2,
   :rdf/type         [:qudt/IntegerEncodingType
                      :qudt/BooleanEncodingType
                      :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Short Unsigned Integer Encoding"})

(def SignedBigIntegerType
  "A Signed Big Integer is a signed integer that can be represented in eight octets (64 bits) of machine memory."
  {:db/ident :qudt/SignedBigIntegerType,
   :dcterms/description
   "A Signed Big Integer is a signed integer that can be represented in eight octets (64 bits) of machine memory.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Big Integer Type",
   :rdfs/subClassOf [:qudt/BigIntegerType
                     :qudt/SignedIntegerType
                     {:owl/hasValue   "-2^{63}",
                      :owl/onProperty :qudt/minInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   "2^{63}-1",
                      :owl/onProperty :qudt/maxInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   "SI64",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt/SignedBigIntegerType-minInclusive
                 :qudt/SignedBigIntegerType-maxInclusive
                 :qudt/SignedBigIntegerType-literal]})

(def SignedBigIntegerType-literal
  "SignedBigIntegerType-literal"
  {:db/ident :qudt/SignedBigIntegerType-literal,
   :rdf/type :sh/PropertyShape,
   :sh/path  :dtype/literal})

(def SignedBigIntegerType-maxInclusive
  "SignedBigIntegerType-maxInclusive"
  {:db/ident :qudt/SignedBigIntegerType-maxInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:qudt/NumericUnion],
   :sh/path  :qudt/maxInclusive})

(def SignedBigIntegerType-minInclusive
  "SignedBigIntegerType-minInclusive"
  {:db/ident :qudt/SignedBigIntegerType-minInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    [{:sh/datatype :xsd/string}
              {:sh/datatype :xsd/integer}
              {:sh/datatype :xsd/float}
              {:sh/datatype :xsd/decimal}],
   :sh/path  :qudt/minInclusive})

(def SignedIntegerEncoding
  "Signed Integer Encoding"
  {:db/ident         :qudt/SignedIntegerEncoding,
   :qudt/bytes       4,
   :rdf/type         [:qudt/IntegerEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Signed Integer Encoding"})

(def SignedIntegerType
  "Signed Integers are integers can take on both positive and negative values."
  {:db/ident         :qudt/SignedIntegerType,
   :dcterms/description
   "Signed Integers are integers can take on both positive and negative values.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/IntegerDatatype
                                              :qudt/SignedType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Signed Integer Type",
   :rdfs/subClassOf  [:qudt/SignedType :qudt/IntegerDatatype]})

(def SignedLongIntegerType
  "A Signed Long Integer is a signed integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt/SignedLongIntegerType,
   :dcterms/description
   "A Signed Long Integer is a signed integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Long Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   "-2^{31}",
                      :owl/onProperty :qudt/minInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt/LongIntegerType
                     :qudt/SignedIntegerType
                     {:owl/hasValue   "2^{31}-1",
                      :owl/onProperty :qudt/maxInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   "UI32",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt/SignedLongIntegerType-abbreviation
                 :qudt/SignedLongIntegerType-minInclusive
                 :qudt/SignedLongIntegerType-maxInclusive]})

(def SignedLongIntegerType-abbreviation
  "SignedLongIntegerType-abbreviation"
  {:db/ident    :qudt/SignedLongIntegerType-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/hasValue "SI32",
   :sh/path     :qudt/abbreviation})

(def SignedLongIntegerType-maxInclusive
  "SignedLongIntegerType-maxInclusive"
  {:db/ident :qudt/SignedLongIntegerType-maxInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:qudt/NumericUnion],
   :sh/path  :qudt/maxInclusive})

(def SignedLongIntegerType-minInclusive
  "SignedLongIntegerType-minInclusive"
  {:db/ident :qudt/SignedLongIntegerType-minInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    [{:sh/datatype :xsd/string}
              {:sh/datatype :xsd/integer}
              {:sh/datatype :xsd/float}
              {:sh/datatype :xsd/decimal}],
   :sh/path  :qudt/minInclusive})

(def SignedMediumIntegerType
  "A \"Signed Medium Integers\" is an integer of 24 bits that can take on both positive and negative values."
  {:db/ident         :qudt/SignedMediumIntegerType,
   :dcterms/description
   "A \"Signed Medium Integers\" is an integer of 24 bits that can take on both positive and negative values.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/IntegerDatatype
                                              :qudt/SignedType
                                              {:owl/hasValue 3,
                                               :owl/onProperty :qudt/bytes,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type         [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Signed Integer Type",
   :rdfs/subClassOf  [{:owl/hasValue   3,
                       :owl/onProperty :qudt/bytes,
                       :rdf/type       :owl/Restriction}
                      :qudt/SignedIntegerType]})

(def SignedShortIntegerType
  "A Signed Short Integer is a signed integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt/SignedShortIntegerType,
   :dcterms/description
   "A Signed Short Integer is a signed integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Short Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   "SI16",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     :qudt/SignedIntegerType
                     :qudt/ShortIntegerType],
   :sh/property :qudt/SignedShortIntegerType-abbreviation})

(def SignedShortIntegerType-abbreviation
  "SignedShortIntegerType-abbreviation"
  {:db/ident :qudt/SignedShortIntegerType-abbreviation,
   :rdf/type :sh/PropertyShape,
   :sh/path  :qudt/abbreviation})

(def SignedType
  "A signed type is a numeric type that distinguishes between positive and negative numbers using an encoding scheme, such as sign and magnitude, one's compliment, and two's compliment to represent negative numbers."
  {:db/ident :qudt/SignedType,
   :dcterms/description
   "A signed type is a numeric type that distinguishes between positive and negative numbers using an encoding scheme, such as sign and magnitude, one's compliment, and two's compliment to represent negative numbers.",
   :owl/disjointWith :qudt/UnsignedType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt/NumericType
                                              {:owl/hasValue :qudt.type/Signed,
                                               :owl/onProperty :qudt/signedness,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/Signed,
                      :owl/onProperty :qudt/signedness,
                      :rdf/type       :owl/Restriction}
                     :qudt/NumericType],
   :sh/property :qudt/SignedType-signedness})

(def SignedType-signedness
  "SignedType-signedness"
  {:db/ident :qudt/SignedType-signedness,
   :rdf/type :sh/PropertyShape,
   :sh/path  :qudt/signedness})

(def SignedVariableLengthIntegerType
  "A Signed Variable Length Integer data type defines a data structure for representing signed integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length."
  {:db/ident :qudt/SignedVariableLengthIntegerType,
   :dcterms/description
   "A Signed Variable Length Integer data type defines a data structure for representing signed integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Variable Length Integer Type",
   :rdfs/subClassOf [:qudt/VariableLengthIntegerType :qudt/SignedIntegerType]})

(def SignednessType
  "Specifics whether a value should be signed or unsigned."
  {:db/ident :qudt/SignednessType,
   :dcterms/description
   "Specifics whether a value should be signed or unsigned.",
   :owl/oneOf [:qudt/SIGNED :qudt/UNSIGNED],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Signedness type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def SinglePrecisionRealEncoding
  "Single Precision Real Encoding"
  {:db/ident         :qudt/SinglePrecisionRealEncoding,
   :qudt/bytes       32,
   :rdf/type         [:qudt/FloatingPointEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Single Precision Real Encoding"})

(def SinglePrecisionType
  "A single precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so a single precision data value on a 32-bit machine architecture occupies four bytes of memory."
  {:db/ident :qudt/SinglePrecisionType,
   :dcterms/description
   "A single precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so a single precision data value on a 32-bit machine architecture occupies four bytes of memory.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Single Precision Type",
   :rdfs/subClassOf :qudt/NumericType})

(def SolidAngleUnit
  "The solid angle subtended by a surface S is defined as the surface area of a unit sphere covered by the surface S's projection onto the sphere. A solid angle is related to the surface of a sphere in the same way an ordinary angle is related to the circumference of a circle. Since the total surface area of the unit sphere is 4*pi, the measure of solid angle will always be between 0 and 4*pi."
  {:db/ident :qudt/SolidAngleUnit,
   :dcterms/description
   "The solid angle subtended by a surface S is defined as the surface area of a unit sphere covered by the surface S's projection onto the sphere. A solid angle is related to the surface of a sphere in the same way an ordinary angle is related to the circumference of a circle. Since the total surface area of the unit sphere is 4*pi, the measure of solid angle will always be between 0 and 4*pi.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Solid Angle Unit",
   :rdfs/subClassOf :qudt/AngleUnit})

(def SplineCalibrator
  "A sub-type of 'Map Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/SplineCalibrator,
   :dcterms/description
   "A sub-type of 'Map Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Spline calibrator",
   :rdfs/subClassOf :qudt/Map})

(def SplineCalibratorType
  "Spline calibrator type"
  {:db/ident        :qudt/SplineCalibratorType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Spline calibrator type",
   :rdfs/subClassOf :qudt/MapType})

(def SplinePoint
  "A sub-type of 'Tuple Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/SplinePoint,
   :dcterms/description
   "A sub-type of 'Tuple Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Spline point",
   :rdfs/subClassOf :qudt/Tuple})

(def SplinePointType
  "Spline point type"
  {:db/ident        :qudt/SplinePointType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Spline point type",
   :rdfs/subClassOf :qudt/TupleType})

(def StandardsUnit
  "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/StandardsUnit,
   :dcterms/description
   "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."})

(def StateSpaceMatrix
  "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant)."
  {:db/ident :qudt/StateSpaceMatrix,
   :dcterms/description
   "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant). ",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "State Space Matrix Type",
   :rdfs/subClassOf :qudt/Matrix})

(def StateSpaceMatrixType
  "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant)."
  {:db/ident :qudt/StateSpaceMatrixType,
   :dcterms/description
   "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant). ",
   :rdf/type :owl/Class,
   :rdfs/label "State Space Matrix Type",
   :rdfs/subClassOf :qudt/MatrixType})

(def StateSpaceVector
  "A state vector in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded."
  {:db/ident :qudt/StateSpaceVector,
   :dcterms/description
   "A state vector in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "State Space Vector Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/coordinateSystem,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/CoordinateSystem,
                      :owl/onProperty    :qudt/coordinateSystem,
                      :rdf/type          :owl/Restriction}
                     :qudt/Vector]})

(def StateSpaceVector-coordinateSystem
  "StateSpaceVector-coordinateSystem"
  {:db/ident    :qudt/StateSpaceVector-coordinateSystem,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CoordinateSystem,
   :sh/maxCount 1,
   :sh/path     :qudt/coordinateSystem})

(def StateSpaceVectorType
  "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded."
  {:db/ident :qudt/StateSpaceVectorType,
   :dcterms/description
   "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "State Space Vector Type",
   :rdfs/subClassOf :qudt/VectorType,
   :sh/property :qudt/StateSpaceVector-coordinateSystem})

(def StateVectorType
  "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded."
  {:db/ident :qudt/StateVectorType,
   :dcterms/description
   "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "State Vector Type",
   :rdfs/subClassOf :qudt/VectorType})

(def Statement
  "Statement"
  {:db/ident         :qudt/Statement,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Statement",
   :rdfs/subClassOf  :rdf/Statement})

(def StringEncodingType
  "A \"Encoding\" with the following instance(s): \"UTF-16 String\", \"UTF-8 Encoding\"."
  {:db/ident :qudt/StringEncodingType,
   :dcterms/description
   "A \"Encoding\" with the following instance(s): \"UTF-16 String\", \"UTF-8 Encoding\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "String Encoding Type",
   :rdfs/subClassOf :qudt/Encoding})

(def StringList
  "String list"
  {:db/ident        :qudt/StringList,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "String list",
   :rdfs/subClassOf :qudt/List,
   :sh/property     [:qudt/StringList-rest :qudt/StringList-first]})

(def StringList-first
  "StringList-first"
  {:db/ident    :qudt/StringList-first,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :rdf/first})

(def StringList-rest
  "StringList-rest"
  {:db/ident :qudt/StringList-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/StringList,
   :sh/path  :rdf/rest})

(def StringType
  "A String Type is a data type that specifies the properties of data structures that hold strings."
  {:db/ident :qudt/StringType,
   :dcterms/description
   "A String Type is a data type that specifies the properties of data structures that hold strings. ",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "String Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/maxLength,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   1,
                      :owl/onProperty :qudt/dimensionality,
                      :rdf/type       :owl/Restriction}
                     :qudt/ScalarDatatype
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/isByteString,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/CharacterType,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :qudt/typeMatrix,
                      :rdf/type        :owl/Restriction}
                     :qudt/Array
                     :qudt/ArrayType],
   :sh/property [:qudt/StringType-elementType
                 :qudt/StringType-dimensionality
                 :qudt/StringType-maxLength
                 :qudt/StringType-typeMatrix
                 :qudt/StringType-isByteString]})

(def StringType-dimensionality
  "StringType-dimensionality"
  {:db/ident    :qudt/StringType-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/path     :qudt/dimensionality})

(def StringType-elementType
  "StringType-elementType"
  {:db/ident :qudt/StringType-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/CharacterType,
   :sh/path  :qudt/elementType})

(def StringType-isByteString
  "StringType-isByteString"
  {:db/ident    :qudt/StringType-isByteString,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt/isByteString})

(def StringType-maxLength
  "StringType-maxLength"
  {:db/ident    :qudt/StringType-maxLength,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/maxLength})

(def StringType-typeMatrix
  "StringType-typeMatrix"
  {:db/ident    :qudt/StringType-typeMatrix,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 0,
   :sh/minCount 0,
   :sh/path     :qudt/typeMatrix})

(def StringUTF16
  "String UTF-16 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-16 encoding. UTF-16 is the native internal representation of text in the Microsoft Windows NT/Windows 2000/Windows XP/Windows CE, Qualcomm BREW, and Symbian operating systems; the Java and .NET byte code environments; Mac OS X's Cocoa and Core Foundation frameworks; and the Qt cross-platform graphical widget toolkit."
  {:db/ident :qudt/StringUTF16,
   :dcterms/description
   "String UTF-16 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-16 encoding. UTF-16 is the native internal representation of text in the Microsoft Windows NT/Windows 2000/Windows XP/Windows CE, Qualcomm BREW, and Symbian operating systems; the Java and .NET byte code environments; Mac OS X's Cocoa and Core Foundation frameworks; and the Qt cross-platform graphical widget toolkit.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "String UTF16 Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/UTF16-CHAR,
                      :owl/onProperty :qudt/elementType,
                      :rdf/type       :owl/Restriction}
                     :qudt/TextStringType
                     :qudt/StringType],
   :sh/property :qudt/StringUTF16-elementType})

(def StringUTF16-elementType
  "StringUTF16-elementType"
  {:db/ident :qudt/StringUTF16-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/CharacterType,
   :sh/path  :qudt/elementType})

(def StringUTF8
  "String UTF-8 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-8 encoding. UTF-8 includes ASCII, otherwise referred to as IA-5 (International Alphabet 5, as standardized by International Organization for Standardization [ISO]) as the first 128 values. The Internet Engineering Task Force (IETF) requires all Internet protocols to identify the encoding used for character data with UTF-8 as at least one supported encoding. The Internet Mail Consortium (IMC) recommends that all e-mail programs must be able to display and create mail using UTF-8."
  {:db/ident :qudt/StringUTF8,
   :dcterms/description
   "String UTF-8 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-8 encoding. UTF-8 includes ASCII, otherwise referred to as IA-5 (International Alphabet 5, as standardized by International Organization for Standardization [ISO]) as the first 128 values. The Internet Engineering Task Force (IETF) requires all Internet protocols to identify the encoding used for character data with UTF-8 as at least one supported encoding. The Internet Mail Consortium (IMC) recommends that all e-mail programs must be able to display and create mail using UTF-8.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "String UTF8 Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/UTF8-CHAR,
                      :owl/onProperty :qudt/elementType,
                      :rdf/type       :owl/Restriction}
                     :qudt/TextStringType
                     :qudt/StringType],
   :sh/property :qudt/StringUTF8-elementType})

(def StringUTF8-elementType
  "StringUTF8-elementType"
  {:db/ident :qudt/StringUTF8-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/CharacterType,
   :sh/path  :qudt/elementType})

(def StructuredDatatype
  "A \"Structured Datatype\", in contrast to scalar data types, is used to characterize classes of more complex data structures, such as linked or indexed lists, trees, ordered trees, and multi-dimensional file formats."
  {:db/ident :qudt/StructuredDatatype,
   :dcterms/description
   "A \"Structured Datatype\", in contrast to scalar data types, is used to characterize classes of more complex data structures, such as linked or indexed lists, trees, ordered trees, and multi-dimensional file formats.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Structured Data Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/elementType,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/Datatype],
   :sh/property :qudt/StructuredDatatype-elementType})

(def StructuredDatatype-elementType
  "StructuredDatatype-elementType"
  {:db/ident    :qudt/StructuredDatatype-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/maxCount 1,
   :sh/path     :qudt/elementType})

(def SubjectArea
  "A \"Enumeration Literal\"."
  {:db/ident        :qudt/SubjectArea,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A \"Enumeration Literal\".",
   :rdfs/label      "Subject Area",
   :rdfs/subClassOf :owl/Thing})

(def Symbol
  "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."
  {:db/ident         :qudt/Symbol,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Symbol",
   :rdfs/subClassOf  :qudt/Concept})

(def SystemModifiableParameter
  "Parameter is modifiable by a (computer) system."
  {:db/ident     :qudt/SystemModifiableParameter,
   :qudt/code    "1",
   :qudt/literal "system",
   :rdf/type     [:qudt/ParameterModifiabilityType :owl/NamedIndividual],
   :rdfs/comment "Parameter is modifiable by a (computer) system.",
   :rdfs/label   "System modifiable parameter"})

(def SystemOfQuantityKinds
  "A system of quantity kinds is a set of one or more quantity kinds together with a set of zero or more algebraic equations that define relationships between quantity kinds in the set. In the physical sciences, the equations relating quantity kinds are typically physical laws and definitional relations, and constants of proportionality. Examples include Newton’s First Law of Motion, Coulomb’s Law, and the definition of velocity as the instantaneous change in position. In almost all cases, the system identifies a subset of base quantity kinds. The base set is chosen so that all other quantity kinds of interest can be derived from the base quantity kinds and the algebraic equations. If the unit system is explicitly associated with a quantity kind system, then the unit system must define at least one unit for each quantity kind. From a scientific point of view, the division of quantities into base quantities and derived quantities is a matter of convention."
  {:db/ident :qudt/SystemOfQuantityKinds,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A system of quantity kinds is a set of one or more quantity kinds together with a set of zero or more algebraic equations that define relationships between quantity kinds in the set. In the physical sciences, the equations relating quantity kinds are typically physical laws and definitional relations, and constants of proportionality. Examples include Newton’s First Law of Motion, Coulomb’s Law, and the definition of velocity as the instantaneous change in position.  In almost all cases, the system identifies a subset of base quantity kinds. The base set is chosen so that all other quantity kinds of interest can be derived from the base quantity kinds and the algebraic equations. If the unit system is explicitly associated with a quantity kind system, then the unit system must define at least one unit for each quantity kind.  From a scientific point of view, the division of quantities into base quantities and derived quantities is a matter of convention.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "System of Quantity Kinds",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/Enumeration,
                      :owl/onProperty    :qudt/baseDimensionEnumeration,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/baseDimensionEnumeration,
                      :rdf/type           :owl/Restriction}
                     :qudt/Concept
                     {:owl/allValuesFrom :qudt/QuantityKind,
                      :owl/onProperty    :qudt/hasQuantityKind,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/hasQuantityKind,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/SystemOfUnits,
                      :owl/onProperty    :qudt/hasUnitSystem,
                      :rdf/type          :owl/Restriction}]})

(def SystemOfUnits
  "A system of units is a set of units which are chosen as the reference scales for some set of quantity kinds together with the definitions of each unit. Units may be defined by experimental observation or by proportion to another unit not included in the system. If the unit system is explicitly associated with a quantity kind system, then the unit system must define at least one unit for each quantity kind."
  {:db/ident :qudt/SystemOfUnits,
   :qudt/informativeReference
   ["http://dbpedia.org/resource/Category:Systems_of_units"
    "http://www.ieeeghn.org/wiki/index.php/System_of_Measurement_Units"],
   :rdf/type :owl/Class,
   :rdfs/comment
   "A system of units is a set of units which are chosen as the reference scales for some set of quantity kinds together with the definitions of each unit. Units may be defined by experimental observation or by proportion to another unit not included in the system. If the unit system is explicitly associated with a quantity kind system, then the unit system must define at least one unit for each quantity kind.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "System of Units",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/Unit,
                      :owl/onProperty    :qudt/hasCoherentUnit,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Unit,
                      :owl/onProperty    :qudt/hasAllowedUnit,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Unit,
                      :owl/onProperty    :qudt/hasDefinedUnit,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Unit,
                      :owl/onProperty    :qudt/hasUnit,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/PhysicalConstant,
                      :owl/onProperty    :qudt/applicablePhysicalConstant,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Unit,
                      :owl/onProperty    :qudt/hasDerivedUnit,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Unit,
                      :owl/onProperty    :qudt/hasDerivedCoherentUnit,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Unit,
                      :owl/onProperty    :qudt/hasBaseUnit,
                      :rdf/type          :owl/Restriction}
                     :qudt/Concept]})

#_(def TABLE-TYPE_2x4
  "Table type 2x4"
  {:db/ident            :qudt/TABLE-TYPE_2x4,
   :qudt/byRow          true,
   :qudt/columns        4,
   :qudt/dimensionVector :qudt/DV_2x4,
   :qudt/dimensionality 2,
   :qudt/rows           2,
   :rdf/type            :qudt/TableType,
   :rdfs/label          "Table type  2x4"})

(def TIME
  "Time in hh:mm:ss[Z|(+|-)hh:mm]format."
  {:db/ident          :qudt/TIME,
   :dcterms/description "Time in hh:mm:ss[Z|(+|-)hh:mm]format.",
   :dtype/literal     "time",
   :qudt/dimensionality 1,
   :qudt/rdfsDatatype :xsd/time,
   :rdf/type          [:qudt/TimeStringType :owl/NamedIndividual],
   :rdfs/label        "TIME"})

(def TRUE
  "True"
  {:db/ident         :qudt/TRUE,
   :dtype/literal    "true",
   :rdf/type         [:qudt/BooleanTypeEnumeratedValue :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "True"})

(def Table
  "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use."
  {:db/ident :qudt/Table,
   :dcterms/description
   "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Table Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/byRow,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   2,
                      :owl/onProperty :qudt/dimensionality,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/rows,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/columns,
                      :rdf/type        :owl/Restriction}
                     :qudt/Array]})

(def Table-byRow
  "Table-byRow"
  {:db/ident    :qudt/Table-byRow,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt/byRow})

(def Table-columns
  "Table-columns"
  {:db/ident    :qudt/Table-columns,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/columns})

(def Table-dimensionality
  "Table-dimensionality"
  {:db/ident    :qudt/Table-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/dimensionality})

(def Table-rows
  "Table-rows"
  {:db/ident    :qudt/Table-rows,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/rows})

(def TableType
  "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use."
  {:db/ident :qudt/TableType,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use.",
   :rdfs/label "Table Type",
   :rdfs/subClassOf :qudt/ArrayType,
   :sh/property [:qudt/Table-rows
                 :qudt/Table-dimensionality
                 :qudt/Table-columns
                 :qudt/Table-byRow]})

(def TaggedEnumeration
  "An enumeration where each literal has a tag that is a non-negative integer. These enumerations are likely to have their literals encoded - hence the need for the tag."
  {:db/ident :qudt/TaggedEnumeration,
   :dcterms/description
   "An enumeration where each literal  has a tag that is a non-negative integer. These enumerations are likely to have their literals encoded - hence the need for the tag.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/Enumeration
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
                     :qudt/Enumeration],
   :sh/property :qudt/TaggedEnumeration-code})

(def TaggedEnumeration-code
  "TaggedEnumeration-code"
  {:db/ident    :qudt/TaggedEnumeration-code,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :dtype/code})

(def TechReport
  "Pub techreport type"
  {:db/ident      :qudt/TechReport,
   :dtype/literal "techreport",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub techreport type"})

(def Term
  "Term"
  {:db/ident        :qudt/Term,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :owl/Thing})

(def TextStringType
  "A text string. Encodings can be specified as subclass or in connection to character arrays in Structured Datatypes."
  {:db/ident :qudt/TextStringType,
   :dcterms/description
   "A text string. Encodings can be specified as subclass or in connection to character arrays in Structured Datatypes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Text String Type",
   :rdfs/subClassOf :qudt/StringType})

(def Three-Tuple
  "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members."
  {:db/ident :qudt/Three-Tuple,
   :dcterms/description
   "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Three-Tuple Type",
   :rdfs/subClassOf [{:owl/hasValue   3,
                      :owl/onProperty :qudt/elementTypeCount,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 3,
                      :owl/onProperty  :qudt/elementType,
                      :rdf/type        :owl/Restriction}
                     :qudt/N-Tuple]})

(def Three-Tuple-elementType
  "Three-Tuple-elementType"
  {:db/ident    :qudt/Three-Tuple-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/TupleMemberType,
   :sh/minCount 0,
   :sh/path     :qudt/elementType})

(def Three-Tuple-elementTypeCount
  "Three-Tuple-elementTypeCount"
  {:db/ident    :qudt/Three-Tuple-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 3,
   :sh/path     :qudt/elementTypeCount})

(def ThreeBodyRotatingCoordinateSystem
  "The lunar coordinate systems are primarily used when operating in close proximity to the Moon. There are, however, a few additional coordinate systems that are also useful when analyzing (and depicting) trajectories in the vicinity of the Earth-Moon system. They are rotating coordinate systems associated with two different three-body systems: the Sun-Earth-spacecraft system and the Earth-Moon-spacecraft system. The Sun-Earth and Earth-Moon rotating coordinate frames are defined as follows. The pole vector or Z-axis of the coordinate frame is set equal to the instantaneous orbit normal of the secondary (smaller) body about the primary (larger) body and the X-axis is set equal to the vector from the primary body center of mass (CM) to the secondary body CM. The X-axis rotates at a rate equal to the instantaneous rotation rate of the secondary body about the primary body."
  {:db/ident :qudt/ThreeBodyRotatingCoordinateSystem,
   :dcterms/description
   "The lunar coordinate systems are primarily used when operating in close proximity to the Moon. There are, however, a few additional coordinate systems that are also useful when analyzing (and depicting) trajectories in the vicinity of the Earth-Moon system. They are rotating coordinate systems associated with two different three-body systems: the Sun-Earth-spacecraft system and the Earth-Moon-spacecraft system. The Sun-Earth and Earth-Moon rotating coordinate frames are defined as follows. The pole vector or Z-axis of the coordinate frame is set equal to the instantaneous orbit normal of the secondary (smaller) body about the primary (larger) body and the X-axis is set equal to the vector from the primary body center of mass (CM) to the secondary body CM. The X-axis rotates at a rate equal to the instantaneous rotation rate of the secondary body about the primary body.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Three Body Rotating Coordinate System Type",
   :rdfs/subClassOf :qudt/AerospaceCoordinateSystem})

(def ThreeTupleType
  "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members."
  {:db/ident :qudt/ThreeTupleType,
   :dcterms/description
   "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Three-Tuple Type",
   :rdfs/subClassOf :qudt/N-TupleType,
   :sh/property [:qudt/Three-Tuple-elementTypeCount
                 :qudt/Three-Tuple-elementType]})

(def Time
  "The class of data values that denote a point in time. Time values may be encoded in a 12-hour clock or a 24-hour clock, such as 1:35 AM, or 13:35."
  {:db/ident :qudt/Time,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "The class of data values that denote a point in time. Time values may be encoded in a 12-hour clock or a 24-hour clock, such as 1:35 AM, or 13:35.",
   :rdfs/label "Time",
   :rdfs/subClassOf :qudt/ScalarDatatype,
   :sh/property :qudt/Time-type})

(def Time-type
  "Time-type"
  {:db/ident :qudt/Time-type,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/TimeStringType,
   :sh/path  :qudt/type})

(def TimeDataType
  "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/TimeDataType,
   :dcterms/description
   "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version.",
   :dtype/value :qudt/TIME,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Time data type",
   :rdfs/subClassOf [:qudt/ScalarDatatype :qudt/Enumeration]})

(def TimeInterval
  "A relative interval that is an increment in time. For example, this is used in time series arrays to express the time point of a vector of values."
  {:db/ident :qudt/TimeInterval,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A relative interval that is an increment in time. For example, this is used in time series arrays to express the time point of a vector of values.",
   :rdfs/label "Time interval",
   :rdfs/subClassOf :sh/Parameter,
   :sh/property :qudt/TimeInterval-type})

(def TimeInterval-type
  "TimeInterval-type"
  {:db/ident :qudt/TimeInterval-type,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/TimeStringType,
   :sh/path  :qudt/type})

(def TimeSeriesArray
  "A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured at successive time intervals. The time intervals may be uniformly or non-uniformly spaced."
  {:db/ident :qudt/TimeSeriesArray,
   :dcterms/description
   ["A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals."
    "A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured at successive time intervals. The time intervals may be uniformly or non-uniformly spaced."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Time Series Array Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/vector,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/TimeStringType,
                      :owl/onProperty :qudt/TimeSeriesArray-incrementDatatype,
                      :rdf/type :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/TimeSeriesArray-incrementDatatype,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/StateSpaceVector,
                      :owl/onProperty    :qudt/vector,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/dimensionVector,
                      :rdf/type        :owl/Restriction}
                     :qudt/Array]})

(def TimeSeriesArray-dimensionVector
  "TimeSeriesArray-dimensionVector"
  {:db/ident    :qudt/TimeSeriesArray-dimensionVector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/IntegerList,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/dimensionVector})

(def TimeSeriesArray-incrementDatatype
  "TimeSeriesArray-incrementDatatype"
  {:db/ident    :qudt/TimeSeriesArray-incrementDatatype,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/TimeStringType,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/incrementDatatype})

(def TimeSeriesArray-vector
  "TimeSeriesArray-vector"
  {:db/ident    :qudt/TimeSeriesArray-vector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/StateSpaceVectorType,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/vector})

(def TimeSeriesArrayType
  "Time Series Array Type"
  {:db/ident :qudt/TimeSeriesArrayType,
   :rdf/comment
   "A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured at successive time intervals. The time intervals may be uniformly or non-uniformly spaced.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Time Series Array Type",
   :rdfs/subClassOf :qudt/ArrayType,
   :sh/property [:qudt/TimeSeriesArray-vector
                 :qudt/TimeSeriesArray-incrementDatatype
                 :qudt/TimeSeriesArray-dimensionVector]})

(def TimeStringType
  "Time takes a number of forms, depending on the units used (e.g., year, day, minute, millisecond, or combinations thereof) and the origin (i.e., time zero) to which the time value is related."
  {:db/ident :qudt/TimeStringType,
   :dcterms/description
   "Time takes a number of forms, depending on the units used (e.g., year, day, minute, millisecond, or combinations thereof) and the origin (i.e., time zero) to which the time value is related.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Time Type",
   :rdfs/subClassOf [:qudt/TextStringType :qudt/DateTimeStringType]})

(def TotallyOrdered
  "Totally Ordered"
  {:db/ident         :qudt/TotallyOrdered,
   :qudt/literal     "total",
   :qudt/plainTextDescription "Totally ordered structure.",
   :rdf/type         [:qudt/OrderedType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Totally Ordered"})

(def TrajectoryCoordinateSystem
  "A \"Coordinate System\"."
  {:db/ident            :qudt/TrajectoryCoordinateSystem,
   :dcterms/description "A \"Coordinate System\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Trajectory Coordinate System",
   :rdfs/subClassOf     :qudt/AerospaceCoordinateSystem})

(def TransformType
  "Transform type"
  {:db/ident         :qudt/TransformType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Transform type",
   :rdfs/subClassOf  :qudt/EnumeratedValue,
   :skos/prefLabel   "Transform type"})

(def Tree
  "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph."
  {:db/ident :qudt/Tree,
   :dcterms/description
   "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph.",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Tree_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Tree Type",
   :rdfs/subClassOf :qudt/Graph})

(def TreeType
  "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph."
  {:db/ident :qudt/TreeType,
   :dcterms/description
   "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph.",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Tree_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/label "Tree Type",
   :rdfs/subClassOf :qudt/GraphType})

(def Triplet
  "A \"Tuple\"."
  {:db/ident         :qudt/Triplet,
   :dcterms/description "A \"Tuple\".",
   :owl/equivalentClass [:qudt/ThreeTupleType :qudt/Three-Tuple],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Triplet",
   :rdfs/subClassOf  [:qudt/ThreeTupleType :qudt/Three-Tuple]})

(def Tuple
  "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple. In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>"
  {:db/ident :qudt/Tuple,
   :dcterms/description
   "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple.  In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Tuple Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/length,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/elementTypeCount,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/TupleMember,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/CompositeDatatype]})

(def Tuple-elementType
  "Tuple-elementType"
  {:db/ident :qudt/Tuple-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/TupleMemberType,
   :sh/path  :qudt/elementType})

(def Tuple-elementTypeCount
  "Tuple-elementTypeCount"
  {:db/ident    :qudt/Tuple-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/minCount 0,
   :sh/path     :qudt/elementTypeCount})

(def Tuple-length
  "Tuple-length"
  {:db/ident    :qudt/Tuple-length,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/length})

(def TupleMember
  "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples."
  {:db/ident :qudt/TupleMember,
   :dcterms/description
   "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Tuple Member Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/orderInStructure,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/ScalarDatatype,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/CompositeDatatype]})

(def TupleMember-elementType
  "TupleMember-elementType"
  {:db/ident :qudt/TupleMember-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/ScalarDatatype,
   :sh/path  :qudt/elementType})

(def TupleMember-orderInStructure
  "TupleMember-orderInStructure"
  {:db/ident    :qudt/TupleMember-orderInStructure,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/orderInStructure})

(def TupleMemberType
  "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples."
  {:db/ident :qudt/TupleMemberType,
   :dcterms/description
   "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Tuple Member Type",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property [:qudt/TupleMember-orderInStructure
                 :qudt/TupleMember-elementType]})

(def TupleType
  "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple. In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>"
  {:db/ident :qudt/TupleType,
   :dcterms/description
   "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple.  In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Tuple Type",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property
   [:qudt/Tuple-length :qudt/Tuple-elementTypeCount :qudt/Tuple-elementType]})

(def Two-Tuple
  "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples."
  {:db/ident :qudt/Two-Tuple,
   :dcterms/description
   "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Two-Tuple Type",
   :rdfs/subClassOf [{:owl/hasValue   2,
                      :owl/onProperty :qudt/elementTypeCount,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 2,
                      :owl/onProperty  :qudt/elementType,
                      :rdf/type        :owl/Restriction}
                     :qudt/N-Tuple]})

(def Two-Tuple-elementType
  "Two-Tuple-elementType"
  {:db/ident    :qudt/Two-Tuple-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/minCount 0,
   :sh/path     :qudt/elementType})

(def Two-Tuple-elementTypeCount
  "Two-Tuple-elementTypeCount"
  {:db/ident    :qudt/Two-Tuple-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 2,
   :sh/path     :qudt/elementTypeCount})

(def TwoTupleType
  "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples."
  {:db/ident :qudt/TwoTupleType,
   :dcterms/description
   "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Two-Tuple Type",
   :rdfs/subClassOf :qudt/N-TupleType,
   :sh/property [:qudt/Two-Tuple-elementTypeCount :qudt/Two-Tuple-elementType]})

(def TypeList
  "A sub-type of 'QUDT Datatype'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/TypeList,
   :dcterms/description
   "A sub-type of 'QUDT Datatype'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Type list",
   :rdfs/subClassOf :qudt/Datatype})

(def TypeMatrix
  "Members of this class are matrix data structures that describe the datatypes of a class of matrices. That is, the members of this class are matrices with cells that contain datatypes (c.f. type:Datatype) and are used to describe the datatype structure of other matrices."
  {:db/ident :qudt/TypeMatrix,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "Members of this class are matrix data structures that describe the datatypes of a class of matrices. That is, the members of this class are matrices with cells that contain datatypes (c.f. type:Datatype) and are used to describe the datatype structure of other matrices.",
   :rdfs/label "Type matrix",
   :rdfs/subClassOf :qudt/MatrixType})

(def TypeVector
  "A Type Vector is a vector whose elements are data types. They are used, for instance, to specify the type of each component of a vector or class of vectors. A Type Vector Type is a further abstraction that specifies the structure of Type Vectors."
  {:db/ident :qudt/TypeVector,
   :dcterms/description
   "A Type Vector is a vector whose elements are data types. They are used, for instance, to specify the type of each component of a vector or class of vectors. A Type Vector Type is a further abstraction that specifies the structure of Type Vectors.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/comment
   "A Type Vector is a vector whose elements are data types. They are used, for instance, to specify the type of each component of a vector or class of vectors. A <em>Type Vector Type</em> is a further abstraction that specifies the structure of Type Vectors.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label ["Type vector" "Type Vector Type"],
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onClass     :qudt/TypeVector,
                      :owl/onProperty  :qudt/typeVector,
                      :rdf/type        :owl/Restriction}
                     :qudt/Vector
                     :qudt/VectorType
                     :qudt/StructuredDatatype],
   :sh/property [:qudt/TypeVector-type
                 :qudt/TypeVector-objectValue
                 :qudt/TypeVector-typeVector]})

(def TypeVector-objectValue
  "TypeVector-objectValue"
  {:db/ident :qudt/TypeVector-objectValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/List,
   :sh/path  :qudt/objectValue})

(def TypeVector-type
  "TypeVector-type"
  {:db/ident :qudt/TypeVector-type,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/TypeVector,
   :sh/path  :qudt/type})

(def TypeVector-typeVector
  "TypeVector-typeVector"
  {:db/ident    :qudt/TypeVector-typeVector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/maxCount 1,
   :sh/path     :qudt/typeVector})

(def UCUMci
  "Lexical pattern for the case-insensitive version of UCUM code"
  {:db/ident :qudt/UCUMci,
   :owl/deprecated true,
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions [{:xsd/pattern "[\\x21-\\x60,\\x7b-\\x7e]+"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "Lexical pattern for the case-insensitive version of UCUM code",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "case-insensitive UCUM code",
   :rdfs/subClassOf :rdfs/Resource})

(def UCUMci-term
  "Lexical pattern for the terminal symbols in the case-insensitive version of UCUM code"
  {:db/ident :qudt/UCUMci-term,
   :owl/deprecated true,
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "[\\x21,\\x23-\\x27,\\x2a,\\x2c,\\x30-\\x3c,\\x3e-\\x5a,\\x5c,\\x5e-\\x60,\\x7c,\\x7e]+"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "Lexical pattern for the terminal symbols in the case-insensitive version of UCUM code",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "case-insensitive UCUM term",
   :rdfs/subClassOf :rdfs/Resource})

(def UCUMcs
  "Lexical pattern for the case-sensitive version of UCUM code"
  {:db/ident :qudt/UCUMcs,
   :dcterms/source "https://ucum.org/ucum.html",
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions [{:xsd/pattern "[\\x21-\\x7e]+"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment "Lexical pattern for the case-sensitive version of UCUM code",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "case-sensitive UCUM code",
   :rdfs/seeAlso "https://ucum.org/ucum.html",
   :rdfs/subClassOf :rdfs/Resource})

(def UCUMcs-term
  "Lexical pattern for the terminal symbols in the case-sensitive version of UCUM code"
  {:db/ident :qudt/UCUMcs-term,
   :dcterms/source "https://ucum.org/ucum.html",
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "[\\x21,\\x23-\\x27,\\x2a,\\x2c,\\x30-\\x3c,\\x3e-\\x5a,\\x5c,\\x5e-\\x7a,\\x7c,\\x7e]+"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "Lexical pattern for the terminal symbols in the case-sensitive version of UCUM code",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "case-sensitive UCUM terminal",
   :rdfs/seeAlso "https://ucum.org/ucum.html",
   :rdfs/subClassOf :rdfs/Resource})

(def UNARY-FUNCTION
  "This type identifies functions that have exactly one argument."
  {:db/ident           :qudt/UNARY-FUNCTION,
   :dcterms/description
   "This type identifies functions that have exactly one argument.",
   :qudt/functionArity 1,
   :rdf/type           [:qudt/FunctionDatatype :owl/NamedIndividual],
   :rdfs/label         "UNARY-FUNCTION"})

(def UNSIGNED
  "Unsigned"
  {:db/ident         :qudt/UNSIGNED,
   :dtype/literal    "unsigned",
   :rdf/type         [:qudt/SignednessType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Unsigned"})

(def UTC-DATETIME
  "UTC is the time-scale maintained by the BIPM, with assistance from the IERS, which forms the basis of a coordinated dissemination of standard frequencies and time signals. It corresponds exactly in rate with the international reference scale of atomic time (TAI) but differs from it by an integer number of seconds. TAI, based on the second (SI), as realized on the rotating geoid, is formed by the BIPM on the basis of clock data supplied by cooperating establishments. It is in the form of a continuous scale, e.g. in days, hours, minutes and seconds from the origin 1 January, 1958 (adopted by the CGPM 1971)."
  {:db/ident :qudt/UTC-DATETIME,
   :dcterms/description
   "UTC is the time-scale maintained by the BIPM, with assistance from the IERS, which forms the basis of a coordinated dissemination of standard frequencies and time signals. It corresponds exactly in rate with  the international reference scale of atomic time (TAI) but differs from it by an integer number of seconds.  TAI, based on the second (SI), as realized on the rotating geoid, is formed by the BIPM on the basis of clock data supplied by cooperating establishments. It is in the form of a continuous scale, e.g. in days, hours, minutes and seconds from the origin 1 January, 1958 (adopted by the CGPM 1971). ",
   :dtype/literal "utc-date",
   :owl/sameAs :qudt/DATETIME,
   :qudt/dimensionality 1,
   :qudt/encodingDescription
   "YYYY-MM-DDThh:mm:ss[.dd] or YYYY-DDDThh:mm:ss[.dd], where 'YYYY' is the year, 'MM' is the two-digit month, 'DD' is the two-digit day, 'DDD' is the three digit day of year, 'T' is constant, 'hh:mm:ss[.dd]' is the UTC time in hours, minutes, seconds, and optional fractional seconds. As many 'd' characters to the right of the period as required may be used to obtain the required precision. All fields require leading zeros.",
   :qudt/rdfsDatatype :xsd/dateTime,
   :rdf/type [:qudt/DateStringType :owl/NamedIndividual],
   :rdfs/label "UTC Date Time"})

(def UTC-DAYTIME
  "UTC DAY TIME"
  {:db/ident            :qudt/UTC-DAYTIME,
   :dtype/literal       "utc-dayTime",
   :qudt/dimensionality 1,
   :qudt/encodingDescription
   "YYYY-DDDThh:mm:ss.ddZ, where each character is an ASCII character using one octet with the following meanings: YYYY = Year in four-character subfield with values 0001-9999, DDD = Day of year in three-character subfield with values 001-365 or -366, T =  Calendar-Time separator, hh = Hour in two-character subfield with values 00-23,  mm = Minute in two-character subfield with values 00-59, ss = Second in two-character subfield with values 00-59 (-58 or -60 during leap seconds), dd = Decimal fraction of second in one- to n-character subfield, each d has values 0-9, and Z = time code terminator (optional)",
   :qudt/rdfsDatatype   :qudt/UTC-DayTime,
   :rdf/type            [:qudt/DateStringType :owl/NamedIndividual],
   :rdfs/label          "UTC DAY TIME"})

(def UTC-DayTime
  "YYYY-DDDThh:mm:ss.ddZ, where each character is an ASCII character using one octet with the following meanings: YYYY = Year in four-character subfield with values 0001-9999, DDD = Day of year in three-character subfield with values 001-365 or -366, T = Calendar-Time separator, hh = Hour in two-character subfield with values 00-23, mm = Minute in two-character subfield with values 00-59, ss = Second in two-character subfield with values 00-59 (-58 or -60 during leap seconds), dd = Decimal fraction of second in one- to n-character subfield, each d has values 0-9, and Z = time code terminator (optional)"
  {:db/ident         :qudt/UTC-DayTime,
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
  {:db/ident            :qudt/UTF16-STRING,
   :dtype/literal       "utf16",
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt.type/UTF16-CHAR,
   :qudt/encoding       :qudt/UTF16-StringEncoding,
   :rdf/type            [:qudt/StringUTF16 :owl/NamedIndividual],
   :rdfs/label          "UTF16 String"})

(def UTF16-StringEncoding
  "UTF-16 String"
  {:db/ident         :qudt/UTF16-StringEncoding,
   :rdf/type         :qudt/StringEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "UTF-16 String"})

(def UTF8-STRING
  "String consisting of UTF-8 characters"
  {:db/ident            :qudt/UTF8-STRING,
   :dcterms/description "String consisting of UTF-8 characters",
   :dtype/literal       "utf8",
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt.type/UTF8-CHAR,
   :qudt/encoding       :qudt/UTF8-StringEncoding,
   :rdf/type            [:qudt/StringUTF8 :owl/NamedIndividual],
   :rdfs/label          "UTF8 String"})

(def UTF8-StringEncoding
  "UTF-8 Encoding"
  {:db/ident   :qudt/UTF8-StringEncoding,
   :qudt/bytes 8,
   :rdf/type   :qudt/StringEncodingType,
   :rdfs/label "UTF-8 Encoding"})

(def Unit
  "A unit of measure, or unit, is a particular quantity value that has been chosen as a scale for measuring other quantities the same kind (more generally of equivalent dimension). For example, the meter is a quantity of length that has been rigorously defined and standardized by the BIPM (International Board of Weights and Measures). Any measurement of the length can be expressed as a number multiplied by the unit meter. More formally, the value of a physical quantity Q with respect to a unit (U) is expressed as the scalar multiple of a real number (n) and U, as \\(Q = nU\\)."
  {:db/ident :qudt/Unit,
   :dcterms/description
   "A unit of measure, or unit, is a particular quantity value that has been chosen as a scale for measuring other quantities the same kind (more generally of equivalent dimension). For example, the meter is a quantity of length that has been rigorously defined and standardized by the BIPM (International Board of Weights and Measures). Any measurement of the length can be expressed as a number multiplied by the unit meter. More formally, the value of a physical quantity Q with respect to a unit (U) is expressed as the scalar multiple of a real number (n) and U, as  \\(Q = nU\\).",
   :qudt/informativeReference
   ["http://www.allmeasures.com/Fullconversion.asp"
    "http://dbpedia.org/resource/Category:Units_of_measure"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Unit",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/SystemOfUnits,
                      :owl/onProperty    :qudt/unitOfSystem,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/mathMLdefinition,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/qkdvDenominator,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/siUnitsExpression,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/hasDimensionVector,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/string,
                      :owl/onProperty    :qudt/udunitsCode,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/symbol,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/SystemOfUnits,
                      :owl/onProperty    :qudt/allowedUnitOfSystem,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/QuantityKind,
                      :owl/onProperty    :qudt/hasQuantityKind,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/conversionMultiplier,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/QuantityKindDimensionVector,
                      :owl/onProperty    :qudt/qkdvDenominator,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/latexSymbol,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/QuantityKindDimensionVector,
                      :owl/onProperty    :qudt/hasDimensionVector,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/string,
                      :owl/onProperty    :qudt/uneceCommonCode,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/conversionOffset,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/string,
                      :owl/onProperty    :qudt/iec61360Code,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/qkdvNumerator,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/UCUMcs,
                      :owl/onProperty    :qudt/ucumCode,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/QuantityKindDimensionVector,
                      :owl/onProperty    :qudt/qkdvNumerator,
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/expression,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/latexDefinition,
                      :rdf/type           :owl/Restriction}
                     :qudt/Verifiable
                     :qudt/Concept]})

(def Unordered
  "Unordered"
  {:db/ident         :qudt/Unordered,
   :qudt/literal     "unordered",
   :qudt/plainTextDescription "Unordered structure.",
   :rdf/type         [:qudt/OrderedType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Unordered"})

(def Unpublished
  "Pub unpublished type"
  {:db/ident      :qudt/Unpublished,
   :dtype/literal "unpublished",
   :rdf/type      [:qudt/PubEnumeratedType :owl/NamedIndividual],
   :rdfs/label    "Pub unpublished type"})

(def UnsignedBigIntegerType
  "An Unsgned Big Integer is an unsigned integer that can be represented in eight octets (64 bits) of machine memory."
  {:db/ident :qudt/UnsignedBigIntegerType,
   :dcterms/description
   "An Unsgned Big Integer is an unsigned integer that can be represented in eight octets (64 bits) of machine memory.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Big Integer Type",
   :rdfs/subClassOf [:qudt/UnsignedIntegerType
                     {:owl/hasValue   "UI64",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   "0",
                      :owl/onProperty :qudt/minInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt/BigIntegerType
                     {:owl/hasValue   "2^{64}-1",
                      :owl/onProperty :qudt/maxInclusive,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt/UnsignedBigIntegerType-maxInclusive
                 :qudt/UnsignedBigIntegerType-abbreviation
                 :qudt/UnsignedBigIntegerType-minInclusive]})

(def UnsignedBigIntegerType-abbreviation
  "UnsignedBigIntegerType-abbreviation"
  {:db/ident    :qudt/UnsignedBigIntegerType-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "UI64",
   :sh/path     :qudt/abbreviation})

(def UnsignedBigIntegerType-maxInclusive
  "UnsignedBigIntegerType-maxInclusive"
  {:db/ident    :qudt/UnsignedBigIntegerType-maxInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "2^{64}-1",
   :sh/or       [:qudt/NumericUnion],
   :sh/path     :qudt/maxInclusive})

(def UnsignedBigIntegerType-minInclusive
  "UnsignedBigIntegerType-minInclusive"
  {:db/ident    :qudt/UnsignedBigIntegerType-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "0",
   :sh/or       [{:sh/datatype :xsd/string}
                 {:sh/datatype :xsd/integer}
                 {:sh/datatype :xsd/float}
                 {:sh/datatype :xsd/decimal}],
   :sh/path     :qudt/minInclusive})

(def UnsignedIntegerEncoding
  "Unsigned Integer Encoding"
  {:db/ident         :qudt/UnsignedIntegerEncoding,
   :qudt/bytes       4,
   :rdf/type         [:qudt/IntegerEncodingType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Unsigned Integer Encoding"})

(def UnsignedIntegerType
  "Unsgned Integers are integers that are either strictly non-negative or non-positive."
  {:db/ident :qudt/UnsignedIntegerType,
   :dcterms/description
   "Unsgned Integers are integers that are either strictly non-negative or non-positive.",
   :owl/disjointWith :qudt/SignedIntegerType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt/IntegerDatatype
                                              :qudt/UnsignedType],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Integer Type",
   :rdfs/subClassOf [:qudt/UnsignedType :qudt/IntegerDatatype]})

(def UnsignedLongIntegerType
  "An Unsigned Long Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt/UnsignedLongIntegerType,
   :dcterms/description
   "An Unsigned Long Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Long Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   "0",
                      :owl/onProperty :qudt/minInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt/UnsignedIntegerType
                     :qudt/LongIntegerType
                     {:owl/hasValue   "UI32",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   "2^{32}-1",
                      :owl/onProperty :qudt/maxInclusive,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt/UnsignedLongIntegerType-minInclusive
                 :qudt/UnsignedLongIntegerType-maxInclusive
                 :qudt/UnsignedLongIntegerType-literal]})

(def UnsignedLongIntegerType-literal
  "UnsignedLongIntegerType-literal"
  {:db/ident :qudt/UnsignedLongIntegerType-literal
   :rdf/type :sh/PropertyShape,
   :sh/path  :dtype/literal})

(def UnsignedLongIntegerType-maxInclusive
  "UnsignedLongIntegerType-maxInclusive"
  {:db/ident    :qudt/UnsignedLongIntegerType-maxInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "2^{32}-1",
   :sh/or       [:qudt/NumericUnion],
   :sh/path     :qudt/maxInclusive})

(def UnsignedLongIntegerType-minInclusive
  "UnsignedLongIntegerType-minInclusive"
  {:db/ident    :qudt/UnsignedLongIntegerType-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "0",
   :sh/or       [{:sh/datatype :xsd/string}
                 {:sh/datatype :xsd/integer}
                 {:sh/datatype :xsd/float}
                 {:sh/datatype :xsd/decimal}],
   :sh/path     :qudt/minInclusive})

(def UnsignedMediumIntegerType
  "An \"Unsigned Medium Integers\" is an integer of 24 bits that only takes on both positive values."
  {:db/ident         :qudt/UnsignedMediumIntegerType,
   :dcterms/description
   "An \"Unsigned Medium Integers\" is an integer of 24 bits that only takes on both positive values.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/IntegerDatatype
                                              :qudt/SignedType],
                         :rdf/type :owl/Class},
   :rdf/type         [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Signed Integer Type",
   :rdfs/subClassOf  [{:owl/hasValue   3,
                       :owl/onProperty :qudt/bytes,
                       :rdf/type       :owl/Restriction}
                      :qudt/UnsignedIntegerType]})

(def UnsignedShortIntegerType
  "An Unsigned Short Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt/UnsignedShortIntegerType,
   :dcterms/description
   "An Unsigned Short Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Short Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   "UI16",
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   "0",
                      :owl/onProperty :qudt/minInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt/ShortIntegerType
                     {:owl/hasValue   "2^{16}-1",
                      :owl/onProperty :qudt/maxInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt/UnsignedIntegerType],
   :sh/property [:qudt/UnsignedShortIntegerType-maxInclusive
                 :qudt/UnsignedShortIntegerType-minInclusive
                 :qudt/UnsignedShortIntegerType-abbreviation]})

(def UnsignedShortIntegerType-abbreviation
  "UnsignedShortIntegerType-abbreviation"
  {:db/ident    :qudt/UnsignedShortIntegerType-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "UI16",
   :sh/path     :qudt/abbreviation})

(def UnsignedShortIntegerType-maxInclusive
  "UnsignedShortIntegerType-maxInclusive"
  {:db/ident    :qudt/UnsignedShortIntegerType-maxInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "2^{16}-1",
   :sh/path     :qudt/maxInclusive})

(def UnsignedShortIntegerType-minInclusive
  "UnsignedShortIntegerType-minInclusive"
  {:db/ident    :qudt/UnsignedShortIntegerType-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "0",
   :sh/path     :qudt/minInclusive})

(def UnsignedType
  "An unsigned data type is a numeric type that does not distinguish between positive and negative values."
  {:db/ident :qudt/UnsignedType,
   :dcterms/description
   "An unsigned data type is a numeric type that does not distinguish between positive and negative values.",
   :owl/disjointWith :qudt/SignedType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt/NumericType
                                              {:owl/hasValue
                                               :qudt.type/Unsigned,
                                               :owl/onProperty :qudt/signedness,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/Unsigned,
                      :owl/onProperty :qudt/signedness,
                      :rdf/type       :owl/Restriction}
                     :qudt/NumericType],
   :sh/property :qudt/UnsignedType-signedness})

(def UnsignedType-signedness
  "UnsignedType-signedness"
  {:db/ident    :qudt/UnsignedType-signedness,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/SignednessType,
   :sh/hasValue :qudt/UNSIGNED,
   :sh/path     :qudt/signedness})

(def UnsignedVariableLengthIntegerType
  "An Unsigned Variable Length Integer data type defines a data structure for representing unsigned integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length."
  {:db/ident :qudt/UnsignedVariableLengthIntegerType,
   :dcterms/description
   "An Unsigned Variable Length Integer data type defines a data structure for representing unsigned integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Variable Length Integer Type",
   :rdfs/subClassOf [:qudt/VariableLengthIntegerType
                     :qudt/UnsignedIntegerType]})

(def UserModifiableParameter
  "Parameter is modifiable by a user."
  {:db/ident     :qudt/UserModifiableParameter,
   :qudt/code    "2",
   :qudt/literal "user",
   :rdf/type     [:qudt/ParameterModifiabilityType :owl/NamedIndividual],
   :rdfs/comment "Parameter is modifiable by a user.",
   :rdfs/label   "User modifiable parameter"})

(def UserQuantityKind
  "User Quantity Kind"
  {:db/ident         :qudt/UserQuantityKind,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "User Quantity Kind",
   :rdfs/subClassOf  [{:owl/cardinality 1,
                       :owl/onProperty  :qudt/hasQuantityKind,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKind,
                       :owl/onProperty    :qudt/hasQuantityKind,
                       :rdf/type          :owl/Restriction}
                      :qudt/AbstractQuantityKind]})

(def VECTOR
  "VECTOR"
  {:db/ident   :qudt/VECTOR,
   :qudt/dimensionality 1,
   :rdf/type   [:qudt/VectorType :owl/NamedIndividual],
   :rdfs/label "VECTOR"})

(def VECTOR_3D
  "VECTOR 3D"
  {:db/ident   :qudt/VECTOR_3D,
   :qudt/dimensionality 1,
   :qudt/protocolBuffersName "Vector3D",
   :rdf/type   [:qudt/VectorType :owl/NamedIndividual],
   :rdfs/label "VECTOR 3D"})

(def VariableIntervalTimeSeriesArray
  "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random."
  {:db/ident :qudt/VariableIntervalTimeSeriesArray,
   :dcterms/description
   "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Variable Interval Time Series Array Type",
   :rdfs/subClassOf :qudt/TimeSeriesArray})

(def VariableIntervalTimeSeriesArrayType
  "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random."
  {:db/ident :qudt/VariableIntervalTimeSeriesArrayType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random.",
   :rdfs/label "Variable Interval Time Series Array Type",
   :rdfs/subClassOf :qudt/TimeSeriesArrayType})

(def VariableLengthIntegerType
  "A Variable Length Integer data type defines a data structure for representing integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length."
  {:db/ident :qudt/VariableLengthIntegerType,
   :dcterms/description
   "A Variable Length Integer data type defines a data structure for representing integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Variable Length Integer Type",
   :rdfs/subClassOf [:qudt/IntegerDatatype
                     {:owl/hasValue   64,
                      :owl/onProperty :qudt/maxBits,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   1,
                      :owl/onProperty :qudt/minBits,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt/VariableLengthIntegerType-maxBits
                 :qudt/VariableLengthIntegerType-minBits]})

(def VariableLengthIntegerType-maxBits
  "VariableLengthIntegerType-maxBits"
  {:db/ident    :qudt/VariableLengthIntegerType-maxBits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 64,
   :sh/path     :qudt/maxBits})

(def VariableLengthIntegerType-minBits
  "VariableLengthIntegerType-minBits"
  {:db/ident    :qudt/VariableLengthIntegerType-minBits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 1,
   :sh/path     :qudt/minBits})

(def Vector
  "A Vector Type is a data type that specifies the properties of data structures that hold vectors."
  {:db/ident :qudt/Vector,
   :dcterms/description
   "A Vector Type is a data type that specifies the properties of data structures that hold vectors.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Vector Type",
   :rdfs/subClassOf [{:owl/hasValue   1,
                      :owl/onProperty :qudt/dimensionality,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dimensionality,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/referenceFrame,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/ReferenceFrame,
                      :owl/onProperty    :qudt/referenceFrame,
                      :rdf/type          :owl/Restriction}
                     :qudt/CompositeDatatype
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/dimension,
                      :rdf/type        :owl/Restriction}]})

(def Vector-dimension
  "Vector-dimension"
  {:db/ident    :qudt/Vector-dimension,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/dimension})

(def Vector-dimensionality
  "Vector-dimensionality"
  {:db/ident    :qudt/Vector-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/dimensionality})

(def Vector-referenceFrame
  "Vector-referenceFrame"
  {:db/ident    :qudt/Vector-referenceFrame,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/ReferenceFrame,
   :sh/maxCount 1,
   :sh/path     :qudt/referenceFrame})

(def VectorArray
  "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements."
  {:db/ident :qudt/VectorArray,
   :dcterms/description
   "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Vector Array Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/StateSpaceVector,
                      :owl/onProperty    :qudt/vector,
                      :rdf/type          :owl/Restriction}
                     :qudt/Array]})

(def VectorArray-vector
  "VectorArray-vector"
  {:db/ident :qudt/VectorArray-vector,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/StateSpaceVectorType,
   :sh/path  :qudt/vector})

(def VectorArrayType
  "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements."
  {:db/ident :qudt/VectorArrayType,
   :dcterms/description
   "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Vector Array Type",
   :rdfs/subClassOf :qudt/ArrayType,
   :sh/property :qudt/VectorArray-vector})

(def VectorType
  "A Vector Type is a data type that specifies the properties of data structures that hold vectors."
  {:db/ident :qudt/VectorType,
   :dcterms/description
   "A Vector Type is a data type that specifies the properties of data structures that hold vectors.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Vector Type",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property [:qudt/Vector-referenceFrame
                 :qudt/Vector-dimensionality
                 :qudt/Vector-dimension]})

(def VehicleCoordinateSystem
  "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/VehicleCoordinateSystem,
   :dcterms/description
   "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Vehicle coordinate system",
   :rdfs/subClassOf [:qudt/AerospaceCoordinateSystem
                     {:owl/allValuesFrom :qudt/AxialOrientationType,
                      :owl/onProperty    :qudt/rollRotationDefinition,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/rollRotationDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/pitchRotationDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/yawRotationDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/AxialOrientationType,
                      :owl/onProperty    :qudt/yawRotationDefinition,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/AxialOrientationType,
                      :owl/onProperty    :qudt/pitchRotationDefinition,
                      :rdf/type          :owl/Restriction}],
   :sh/property [:qudt/VehicleCoordinateSystem-pitchRotationDefinition
                 :qudt/VehicleCoordinateSystem-yawRotationDefinition
                 :qudt/VehicleCoordinateSystem-rollRotationDefinition]})

(def VehicleCoordinateSystem-pitchRotationDefinition
  "VehicleCoordinateSystem-pitchRotationDefinition"
  {:db/ident    :qudt/VehicleCoordinateSystem-pitchRotationDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/AxialOrientationType,
   :sh/maxCount 1,
   :sh/path     :qudt/pitchRotationDefinition})

(def VehicleCoordinateSystem-rollRotationDefinition
  "VehicleCoordinateSystem-rollRotationDefinition"
  {:db/ident    :qudt/VehicleCoordinateSystem-rollRotationDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/AxialOrientationType,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/rollRotationDefinition})

(def VehicleCoordinateSystem-yawRotationDefinition
  "VehicleCoordinateSystem-yawRotationDefinition"
  {:db/ident    :qudt/VehicleCoordinateSystem-yawRotationDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/AxialOrientationType,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/yawRotationDefinition})

(def Verifiable
  "An aspect class that holds properties that provide external knowledge and specifications of a given resource."
  {:db/ident :qudt/Verifiable,
   :rdf/type :qudt/AspectClass,
   :rdfs/comment
   "An aspect class that holds properties that provide external knowledge and specifications of a given resource.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Verifiable",
   :rdfs/subClassOf [{:owl/minCardinality 0,
                      :owl/onProperty     :qudt/dbpediaMatch,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/isoNormativeReference,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/isoNormativeReference,
                      :rdf/type           :owl/Restriction}
                     :qudt/Aspect
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/normativeReference,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/normativeReference,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :qudt/informativeReference,
                      :rdf/type           :owl/Restriction}]})

(def VisualCue
  "Visual Cue"
  {:db/ident        :qudt/VisualCue,
   :rdf/type        :owl/Class,
   :rdfs/label      "Visual Cue",
   :rdfs/subClassOf :qudt/ModalCue})

(def VisualCueEnumeration-defaultValue
  "VisualCueEnumeration-defaultValue"
  {:db/ident :qudt/VisualCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/VisualCue,
   :sh/path  :qudt/defaultValue})

(def WDST_DRY
  "Dry"
  {:db/ident         :qudt/WDST_DRY,
   :dtype/literal    "dry",
   :qudt/code        "2",
   :rdf/type         [:qudt/WetDryStateType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Dry"})

(def WDST_WET
  "Wet"
  {:db/ident         :qudt/WDST_WET,
   :dtype/literal    "wet",
   :qudt/code        "1",
   :rdf/type         [:qudt/WetDryStateType :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Wet"})

(def WetDryStateType
  "Wet dry state type"
  {:db/ident         :qudt/WetDryStateType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Wet dry state type",
   :rdfs/subClassOf  [:qudt/EnumeratedValue :qudt/DiscreteState]})

(def Wikipedia
  "Wikipedia"
  {:db/ident         :qudt/Wikipedia,
   :rdf/type         [:qudt/Organization :owl/NamedIndividual],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "Wikipedia"})

(def WordAligned
  "Word Aligned"
  {:db/ident      :qudt/WordAligned,
   :dtype/literal "word",
   :rdf/type      [:qudt/AlignmentType :owl/NamedIndividual],
   :rdfs/label    "Word Aligned"})

(def YDT
  "Year Day Time"
  {:db/ident            :qudt/YDT,
   :dtype/literal       "YDT",
   :qudt/dimensionality 1,
   :qudt/encodingDescription "TBD",
   :qudt/rdfsDatatype   :xsd/string,
   :rdf/type            [:qudt/DateStringType :owl/NamedIndividual],
   :rdfs/label          "Year Day Time"})

(def Yes
  "Yes"
  {:db/ident     :qudt/Yes,
   :qudt/literal "Y",
   :rdf/type     [:qudt/YesNoType :owl/NamedIndividual],
   :rdfs/label   "Yes"})

(def YesNoType
  "Yes no type"
  {:db/ident        :qudt/YesNoType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Yes no type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def abbreviation
  "An abbreviation for a unit is a short ASCII string that is used in place of the full name for the unit in contexts where non-ASCII characters would be problematic, or where using the abbreviation will enhance readability. When a power of abase unit needs to be expressed, such as squares this can be done using abbreviations rather than symbols. For example, <em>sq ft</em> means <em>square foot</em>, and <em>cu ft</em> means <em>cubic foot</em>."
  {:db/ident :qudt/abbreviation,
   :dcterms/description
   "An abbreviation for a unit is a short ASCII string that is used in place of the full name for the unit in contexts where non-ASCII characters would be problematic, or where using the abbreviation will enhance readability. When a power of abase unit needs to be expressed, such as squares this can be done using abbreviations rather than symbols. For example, <em>sq ft</em> means <em>square foot</em>, and <em>cu ft</em> means <em>cubic foot</em>.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "abbreviation",
   :rdfs/range :xsd/string})

(def accuracy
  "Accuracy is the degree to which a given quantity is correct and free from error. For example, a quantity specified as 100+/-1 has an (absolute) accuracy of +/-1 (meaning its true value can fall in the range 99-101), while a quantity specified as 100+/-2% has a (relative) accuracy of +/-2% (meaning its true value can fall in the range 98-102). The concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits."
  {:db/ident :qudt/accuracy,
   :dcterms/description
   "Accuracy is the degree to which a given quantity is correct and free from error. For example, a quantity specified as 100+/-1 has an (absolute) accuracy of +/-1 (meaning its true value can fall in the range 99-101), while a quantity specified as 100+/-2% has a (relative) accuracy of +/-2% (meaning its true value can fall in the range 98-102).\n\nThe concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits. ",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "accuracy",
   :rdfs/range :xsd/integer})

(def acronym
  "acronym"
  {:db/ident         :qudt/acronym,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "acronym",
   :rdfs/range       :xsd/string})

(def alignment
  "alignment"
  {:db/ident         :qudt/alignment,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "alignment"})

(def allowedPattern
  "This property relates a date string encoding (c.f. type:DateStringEncodingType) to one or more XML Schema compliant regular expressions that together determine the allowed lexical expressions that can be unambiguously parsed to determine a temporal quantity."
  {:db/ident :qudt/allowedPattern,
   :dcterms/description
   "This property relates a date string encoding (c.f. type:DateStringEncodingType) to one or more XML Schema compliant regular expressions that together determine the allowed lexical expressions that can be unambiguously parsed to determine a temporal quantity.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "allowed pattern",
   :rdfs/range :xsd/string})

(def allowedUnitOfSystem
  "This property relates a unit of measure with a unit system that does not define the unit, but allows its use within the system. An allowed unit must be convertible to some dimensionally eqiuvalent unit that is defined by the system."
  {:db/ident :qudt/allowedUnitOfSystem,
   :dcterms/description
   "This property relates a unit of measure with a unit system that does not define the unit, but allows its use within the system. An allowed unit must be convertible to some dimensionally eqiuvalent unit that is defined by the system.",
   :owl/inverseOf :qudt/hasAllowedUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "allowed unit of system",
   :rdfs/subPropertyOf :qudt/unitOfSystem})

(def ansiSQLName
  "ANSI SQL name"
  {:db/ident           :qudt/ansiSQLName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "ANSI SQL name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def applicableCGSUnit
  "applicable CGS unit"
  {:db/ident           :qudt/applicableCGSUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "applicable CGS unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicableISOUnit
  "applicable ISO unit"
  {:db/ident           :qudt/applicableISOUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "applicable ISO unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicableImperialUnit
  "applicable Imperial unit"
  {:db/ident           :qudt/applicableImperialUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "applicable Imperial unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicablePhysicalConstant
  "applicable physical constant"
  {:db/ident         :qudt/applicablePhysicalConstant,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "applicable physical constant"})

(def applicablePlanckUnit
  "applicable Planck unit"
  {:db/ident           :qudt/applicablePlanckUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "applicable Planck unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicableSIUnit
  "applicable SI unit"
  {:db/ident           :qudt/applicableSIUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "applicable SI unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicableUSCustomaryUnit
  "applicable US Customary unit"
  {:db/ident           :qudt/applicableUSCustomaryUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "applicable US Customary unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicableUnit
  "applicable unit"
  {:db/ident         :qudt/applicableUnit,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "applicable unit",
   :rdfs/range       :qudt/Unit})

(def arg1Type
  "This property relates a funciton data type with the type of its arg1."
  {:db/ident           :qudt/arg1Type,
   :dcterms/description
   "This property relates a funciton data type with the type of its arg1.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "arg1Type",
   :rdfs/subPropertyOf :qudt/argType})

(def arg2Type
  "This property relates a funciton data type with the type of its arg2."
  {:db/ident           :qudt/arg2Type,
   :dcterms/description
   "This property relates a funciton data type with the type of its arg2.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "arg2Type",
   :rdfs/subPropertyOf :qudt/argType})

(def arg3Type
  "This property relates a funciton data type with the type of its arg3."
  {:db/ident           :qudt/arg3Type,
   :dcterms/description
   "This property relates a funciton data type with the type of its arg3.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "arg3Type",
   :rdfs/subPropertyOf :qudt/argType})

(def argType
  "This property relates a function data type with the type of one of its arguments."
  {:db/ident           :qudt/argType,
   :dcterms/description
   "This property relates a function data type with the type of one of its arguments.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "argType",
   :rdfs/subPropertyOf :qudt/elementType})

(def auralCue
  "aural cue"
  {:db/ident           :qudt/auralCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "aural cue",
   :rdfs/subPropertyOf :qudt/modalCue})

(def auralCueEnumeration
  "aural cue enumeration"
  {:db/ident           :qudt/auralCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "aural cue enumeration",
   :rdfs/subPropertyOf :qudt/modalCueEnumeration})

(def base
  "base"
  {:db/ident         :qudt/base,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "base",
   :rdfs/range       :xsd/integer})

(def baseDimensionEnumeration
  "This property associates a system of quantities with an enumeration that enumerates the base dimensions of the system in canonical order."
  {:db/ident :qudt/baseDimensionEnumeration,
   :dcterms/description
   "This property associates a system of quantities with an enumeration that enumerates the base dimensions of the system in canonical order.",
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "base dimension enumeration",
   :rdfs/range :qudt/Enumeration})

(def baseUnitOfSystem
  "This property relates a unit of measure to the system of units in which it is defined as a base unit for the system. The base units of a system are used to define the derived units of the system by expressing the derived units as products of the base units raised to a rational power."
  {:db/ident :qudt/baseUnitOfSystem,
   :dcterms/description
   "This property relates a unit of measure to the system of units in which it is defined as a base unit for the system. The base units of a system are used to define the derived units of the system by expressing the derived units as products of the base units raised to a rational power.",
   :owl/inverseOf :qudt/hasBaseUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "is base unit of system",
   :rdfs/subPropertyOf :qudt/coherentUnitOfSystem})

(def baseImperialUnitDimensions
  {:db/ident :qudt/baseImperialUnitDimensions
   :rdf/type :owl/ObjectProperty
   :rdfs/domain :qudt/QuantityKind
   :rdfs/range :xsd/string})

(def baseSIUnitDimensions
  {:db/ident :qudt/baseSIUnitDimensions
   :rdf/type :owl/ObjectProperty
   :rdfs/domain :qudt/QuantityKind
   :rdfs/range :xsd/string})

(def baseCGSUnitDimensions
  {:db/ident :qudt/baseCGSUnitDimensions
   :rdf/type :owl/ObjectProperty
   :rdfs/domain :qudt/QuantityKind
   :rdfs/range :xsd/string})

(def baseISOUnitDimensions
  {:db/ident :qudt/baseISOUnitDimensions
   :rdf/type :owl/ObjectProperty
   :rdfs/domain :qudt/QuantityKind
   :rdfs/range :xsd/string})

(def baseUSCustomaryUnitDimensions
  {:db/ident :qudt/baseISOUnitDimensions
   :rdf/type :owl/ObjectProperty
   :rdfs/domain :qudt/QuantityKind
   :rdfs/range :xsd/string})

(def basis
  "basis"
  {:db/ident         :qudt/basis,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "basis"})

(def belongsToSystemOfQuantities
  "belongs to system of quantities"
  {:db/ident         :qudt/belongsToSystemOfQuantities,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :qudt/QuantityKind,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "belongs to system of quantities",
   :rdfs/range       :qudt/SystemOfQuantityKinds})

(def bitOrder
  "bit order"
  {:db/ident         :qudt/bitOrder,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "bit order",
   :rdfs/range       :qudt/EndianType})

(def bits
  "bits"
  {:db/ident         :qudt/bits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "bits",
   :rdfs/range       :xsd/integer})

(def bounded
  "A datatype is bounded if its value space has either a finite upper and lower bound. Either bound may be inclusive or exclusive."
  {:db/ident :qudt/bounded,
   :dcterms/description
   "A datatype is bounded if its value space has either a finite upper and lower bound. Either bound may be inclusive or exclusive. ",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "bounded",
   :rdfs/range :xsd/boolean})

(def byRow
  "A boolean to specify whether an array is presented row by row or column by column."
  {:db/ident :qudt/byRow,
   :dcterms/description
   "A boolean to specify whether an array is presented row by row or column by column.",
   :rdf/type [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "by row",
   :rdfs/range :xsd/boolean,
   :vaem/rationale "Replaced with an enumeration. See type:ArrayDataOrderType"})

(def byteOrder
  "Byte order is an enumeration of two values: 'Big Endian' and 'Little Endian' and is used to denote whether the most signiticant byte is either first or last, respectively."
  {:db/ident :qudt/byteOrder,
   :dcterms/description
   "Byte order is an enumeration of two values: 'Big Endian' and 'Little Endian' and is used to denote whether the most signiticant byte is either first or last, respectively.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "byte order",
   :rdfs/range :qudt/EndianType})

(def bytes
  "bytes"
  {:db/ident         :qudt/bytes,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "bytes",
   :rdfs/range       :xsd/integer})

(def cName
  "Datatype name in the C programming language"
  {:db/ident           :qudt/cName,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Datatype name in the C programming language",
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "C Language name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def cardinality
  "cardinality"
  {:db/ident         :qudt/cardinality,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "cardinality"})

(def categorizedAs
  "categorized as"
  {:db/ident         :qudt/categorizedAs,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "categorized as"})

(def citation
  "citation"
  {:db/ident         :qudt/citation,
   :qudt/plainTextDescription
   "Used to provide an annotation for an informative reference.",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "citation",
   :rdfs/range       :xsd/string})

(def code
  "A code is a string that uniquely identifies a QUDT concept. The use of this property has been deprecated."
  {:db/ident :qudt/code,
   :dcterms/description
   "A code is a string that uniquely identifies a QUDT concept. The use of this property has been deprecated.",
   :owl/deprecated true,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :qudt/Concept,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "code"})

(def coherentUnitOfSystem
  "A coherent unit of measurement for a unit system is a defined unit that may be expressed as a product of powers of the system's base units with the proportionality factor of one. A system of units is coherent with respect to a system of quantities and equations if the system of units is chosen in such a way that the equations between numerical values have exactly the same form (including the numerical factors) as the corresponding equations between the quantities. For example, the 'newton' and the 'joule'. These two are, respectively, the force that causes one kilogram to be accelerated at 1 metre per second per second, and the work done by 1 newton acting over 1 metre. Being coherent refers to this consistent use of 1. In the old c.g.s. system , with its base units the centimetre and the gram, the corresponding coherent units were the dyne and the erg, respectively the force that causes 1 gram to be accelerated at 1 centimetre per second per second, and the work done by 1 dyne acting over 1 centimetre. So \\(1 newton = 10^5\\,dyne\\), \\(1 joule = 10^7\\,erg\\), making each of the four compatible in a decimal sense within its respective other system, but not coherent therein."
  {:db/ident :qudt/coherentUnitOfSystem,
   :dcterms/description
   "A coherent unit of measurement for a unit system is a defined unit that may be expressed as a product of powers of the system's base units with the proportionality factor of one. A system of units is coherent with respect to a system of quantities and equations if the system of units is chosen in such a way that the equations between numerical values have exactly the same form (including the numerical factors) as the corresponding equations between the quantities. For example, the 'newton' and the 'joule'. These two are, respectively, the force that causes one kilogram to be accelerated at 1 metre per second per  second, and the work done by 1 newton acting over 1 metre. Being coherent refers to this consistent use of 1. In the old c.g.s. system , with its base units the centimetre and the gram, the corresponding coherent units were the dyne and the erg, respectively the force that causes 1 gram to be accelerated at 1 centimetre per second per second, and the work done by 1 dyne acting over 1 centimetre. So \\(1 newton = 10^5\\,dyne\\), \\(1 joule = 10^7\\,erg\\), making each of the four compatible in a decimal sense within its respective other system, but not coherent therein.",
   :owl/inverseOf :qudt/hasCoherentUnit,
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "is coherent unit of system",
   :rdfs/range :qudt/SystemOfUnits,
   :rdfs/subPropertyOf :qudt/definedUnitOfSystem})

(def coherentUnitSystem
  "<p>A system of units is coherent with respect to a system of quantities and equations if the system of units is chosen in such a way that the equations between numerical values have exactly the same form (including the numerical factors) as the corresponding equations between the quantities. In such a coherent system, no numerical factor other than the number 1 ever occurs in the expressions for the derived units in terms of the base units. For example, the \\(newton\\) and the \\(joule\\). These two are, respectively, the force that causes one kilogram to be accelerated at 1 metre per (1) second per (1) second, and the work done by 1 newton acting over 1 metre. Being coherent refers to this consistent use of 1. In the old c.g.s. system , with its base units the centimetre and the gram, the corresponding coherent units were the dyne and the erg, respectively the force that causes 1 gram to be accelerated at 1 centimetre per (1) second per (1) second, and the work done by 1 dyne acting over 1 centimetre. So \\(1\\,newton = 10^5 dyne\\), \\(1 joule = 10^7 erg\\), making each of the four compatible in a decimal sense within its respective other system, but not coherent therein.</p>"
  {:db/ident           :qudt/coherentUnitSystem,
   :dcterms/description
   "<p>A system of units is coherent with respect to a system of quantities and equations if the system of units is chosen in such a way that the equations between numerical values have exactly the same form (including the numerical factors) as the corresponding equations between the quantities. In such a coherent system, no numerical factor other than the number 1 ever occurs in the expressions for the derived units in terms of the base units. For example, the \\(newton\\) and the \\(joule\\). These two are, respectively, the force that causes one kilogram to be accelerated at 1 metre per (1) second per (1) second, and the work done by 1 newton acting over 1 metre. Being coherent refers to this consistent use of 1. In the old c.g.s. system , with its base units the centimetre and the gram, the corresponding coherent units were the dyne and the erg, respectively the force that causes 1 gram to be accelerated at 1 centimetre per (1) second per (1) second, and the work done by 1 dyne acting over 1 centimetre. So \\(1\\,newton = 10^5 dyne\\), \\(1 joule = 10^7 erg\\), making each of the four compatible in a decimal sense within its respective other system, but not coherent therein.</p>",
   :qudt/informativeReference
   "https://en.wikipedia.org/wiki/Coherence_(units_of_measurement)",
   :rdf/type           [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "coherent unit system",
   :rdfs/subPropertyOf :qudt/hasUnitSystem})

(def columns
  "columns"
  {:db/ident         :qudt/columns,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "columns",
   :rdfs/range       :xsd/integer})

(def conversionCoefficient
  "conversion coefficient"
  {:db/ident         :qudt/conversionCoefficient,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "conversion coefficient",
   :rdfs/range       :xsd/double})

(def conversionMultiplier
  "conversion multiplier"
  {:db/ident         :qudt/conversionMultiplier,
   :rdf/type         [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "conversion multiplier",
   :rdfs/range       :dtype/numericUnion})

(def conversionOffset
  "conversion offset"
  {:db/ident         :qudt/conversionOffset,
   :rdf/type         [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "conversion offset",
   :rdfs/range       :dtype/numericUnion})

(def coordinateCenter
  "coordinate center"
  {:db/ident         :qudt/coordinateCenter,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :qudt/CoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "coordinate center",
   :rdfs/range       :qudt/CoordinateCenterType,
   :skos/prefLabel   "coordinate center"})

(def coordinateSystem
  "coordinate system"
  {:db/ident         :qudt/coordinateSystem,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "coordinate system"})

(def coordinateSystemFrame
  "coordinate system frame"
  {:db/ident         :qudt/coordinateSystemFrame,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "coordinate system frame"})

(def currencyCode
  "Alphabetic Currency Code as defined by ISO 4217. For example, US Dollar has the code 'USD'."
  {:db/ident :qudt/currencyCode,
   :dcterms/description
   "Alphabetic Currency Code as defined by ISO 4217. For example, US Dollar has the code 'USD'.",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "currency code",
   :rdfs/range :xsd/string,
   :rdfs/seeAlso "https://en.wikipedia.org/wiki/ISO_4217"})

(def currencyExponent
  "The currency exponent indicates the number of decimal places between a major currency unit and its minor currency unit. For example, the US dollar is the major currency unit of the United States, and the US cent is the minor currency unit. Since one cent is 1/100 of a dollar, the US dollar has a currency exponent of 2. However, the Japanese Yen has no minor currency units, so the yen has a currency exponent of 0."
  {:db/ident :qudt/currencyExponent,
   :dcterms/description
   "The currency exponent indicates the number of decimal places between a major currency unit and its minor currency unit. For example, the US dollar is the major currency unit of the United States, and the US cent is the minor currency unit. Since one cent is 1/100 of a dollar, the US dollar has a currency exponent of 2. However, the Japanese Yen has no minor currency units, so the yen has a currency exponent of 0.",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "currency exponent",
   :rdfs/range :xsd/integer})

(def currencyNumber
  "Numeric currency Code as defined by ISO 4217. For example, US Dollar has the number 840."
  {:db/ident :qudt/currencyNumber,
   :dcterms/description
   "Numeric currency Code as defined by ISO 4217. For example, US Dollar has the number 840.",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "currency number",
   :rdfs/range :xsd/positiveInteger,
   :rdfs/seeAlso "https://en.wikipedia.org/wiki/ISO_4217"})

(def dataEncoding
  "data encoding"
  {:db/ident         :qudt/dataEncoding,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "data encoding",
   :rdfs/range       :qudt/DataEncoding})

(def dataOrder
  "data order"
  {:db/ident         :qudt/dataOrder,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "data order"})

(def dataStructure
  "data structure"
  {:db/ident         :qudt/dataStructure,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "data structure",
   :rdfs/range       :xsd/string})

(def dataType
  "datatype"
  {:db/ident         :qudt/dataType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "datatype"})

(def dbpediaMatch
  "dbpedia match"
  {:db/ident         :qudt/dbpediaMatch,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "dbpedia match",
   :rdfs/range       :xsd/anyURI})

(def default
  "The default element in an enumeration"
  {:db/ident         :qudt/default,
   :dcterms/description "The default element in an enumeration",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "default"})

(def defaultValue
  "Default Value"
  {:db/ident         :qudt/defaultValue,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Default Value"})

(def definedUnitOfSystem
  "This property relates a unit of measure with the unit system that defines the unit."
  {:db/ident :qudt/definedUnitOfSystem,
   :dcterms/description
   "This property relates a unit of measure with the unit system that defines the unit.",
   :owl/inverseOf :qudt/hasDefinedUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "defined unit of system",
   :rdfs/subPropertyOf :qudt/unitOfSystem})

(def denominatorDimensionVector
  "denominator dimension vector"
  {:db/ident         :qudt/denominatorDimensionVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "denominator dimension vector",
   :rdfs/range       :qudt/QuantityKindDimensionVector})

(def derivedCoherentUnitOfSystem
  "This property relates a unit of measure to the unit system in which the unit is derived from the system's base units with a proportionality constant of one."
  {:db/ident :qudt/derivedCoherentUnitOfSystem,
   :dcterms/description
   "This property relates a unit of measure to the unit system in which the unit is derived from the system's base units with a proportionality constant of one.",
   :owl/inverseOf :qudt/hasDerivedCoherentUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "is coherent derived unit of system",
   :rdfs/subPropertyOf [:qudt/derivedUnitOfSystem :qudt/coherentUnitOfSystem]})

(def derivedNonCoherentUnitOfSystem
  "This property relates a unit of measure to the unit system in which the unit is derived from the system's base units without proportionality constant of one."
  {:db/ident :qudt/derivedNonCoherentUnitOfSystem,
   :dcterms/description
   "This property relates a unit of measure to the unit system in which the unit is derived from the system's base units without proportionality constant of one.",
   :owl/inverseOf :qudt/hasDerivedNonCoherentUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "is non-coherent derived unit of system",
   :rdfs/range :qudt/SystemOfUnits,
   :rdfs/subPropertyOf :qudt/derivedUnitOfSystem})

(def derivedQuantityKindOfSystem
  "derived quantity kind of system"
  {:db/ident           :qudt/derivedQuantityKindOfSystem,
   :owl/inverseOf      :qudt/systemDerivedQuantityKind,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "derived quantity kind of system",
   :rdfs/subPropertyOf :qudt/isQuantityKindOf})

(def derivedUnitOfSystem
  "This property relates a unit of measure to the system of units in which it is defined as a derived unit. That is, the derived unit is defined as a product of the base units for the system raised to some rational power."
  {:db/ident :qudt/derivedUnitOfSystem,
   :dcterms/description
   "This property relates a unit of measure to the system of units in which it is defined as a derived unit. That is, the derived unit is defined as a product of the base units for the system raised to some rational power.",
   :owl/inverseOf :qudt/hasDerivedUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "is derived unit of system",
   :rdfs/subPropertyOf :qudt/unitOfSystem})

(def dimension
  "The number of elements in a vector."
  {:db/ident            :qudt/dimension,
   :dcterms/description "The number of elements in a vector.",
   :rdf/type            :owl/DatatypeProperty,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "dimension",
   :rdfs/range          :xsd/integer})

(def dimensionExponent
  "dimension exponent"
  {:db/ident         :qudt/dimensionExponent,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "dimension exponent",
   :rdfs/range       :dtype/numericUnion})

(def dimensionExponentForAmountOfSubstance
  "dimension exponent for amount of substance"
  {:db/ident           :qudt/dimensionExponentForAmountOfSubstance,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "dimension exponent for amount of substance",
   :rdfs/subPropertyOf :qudt/dimensionExponent})

(def dimensionExponentForElectricCurrent
  "dimension exponent for electric current"
  {:db/ident           :qudt/dimensionExponentForElectricCurrent,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "dimension exponent for electric current",
   :rdfs/range         :xsd/integer,
   :rdfs/subPropertyOf :qudt/dimensionExponent})

(def dimensionExponentForLength
  "dimension exponent for length"
  {:db/ident           :qudt/dimensionExponentForLength,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "dimension exponent for length",
   :rdfs/subPropertyOf :qudt/dimensionExponent})

(def dimensionExponentForLuminousIntensity
  "dimension exponent for luminous intensity"
  {:db/ident           :qudt/dimensionExponentForLuminousIntensity,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "dimension exponent for luminous intensity",
   :rdfs/subPropertyOf :qudt/dimensionExponent})

(def dimensionExponentForMass
  "dimension exponent for mass"
  {:db/ident           :qudt/dimensionExponentForMass,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "dimension exponent for mass",
   :rdfs/subPropertyOf :qudt/dimensionExponent})

(def dimensionExponentForThermodynamicTemperature
  "dimension exponent for thermodynamic temperature"
  {:db/ident           :qudt/dimensionExponentForThermodynamicTemperature,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "dimension exponent for thermodynamic temperature",
   :rdfs/subPropertyOf :qudt/dimensionExponent})

(def dimensionExponentForTime
  "dimension exponent for time"
  {:db/ident           :qudt/dimensionExponentForTime,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "dimension exponent for time",
   :rdfs/subPropertyOf :qudt/dimensionExponent})

(def dimensionInverse
  "dimension inverse"
  {:db/ident         :qudt/dimensionInverse,
   :owl/inverseOf    :qudt/dimensionInverse,
   :rdf/type         [:owl/SymmetricProperty
                      :owl/ObjectProperty
                      :owl/InverseFunctionalProperty
                      :owl/FunctionalProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "dimension inverse"})

(def dimensionVector
  "dimension vector"
  {:db/ident         :qudt/dimensionVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "dimension vector",
   :rdfs/range       :qudt/DimensionVector})

(def dimensionVectorForSI
  "dimension vector for SI"
  {:db/ident         :qudt/dimensionVectorForSI,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "dimension vector for SI",
   :rdfs/range       :qudt/QuantityKindDimensionVector_SI})

(def dimensionality
  "The number of dimensions making up an array. For example a 4 by 4 array has a dimensionality of 2. Whereas a vector or a string has a dimensionality of 1."
  {:db/ident :qudt/dimensionality,
   :dcterms/description
   "The number of dimensions making up an array. For example a 4 by 4 array has a dimensionality of 2. Whereas a vector or a string has a dimensionality of 1.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "dimensionality",
   :rdfs/range :xsd/integer})

(def dimensionlessExponent
  "dimensionless exponent"
  {:db/ident           :qudt/dimensionlessExponent,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "dimensionless exponent",
   :rdfs/subPropertyOf :qudt/dimensionExponent})

(def element
  "An element of an enumeration"
  {:db/ident         :qudt/element,
   :dcterms/description "An element of an enumeration",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "element"})

(def elementKind
  "This property is used to describe the quantity kind for a dimensional data type."
  {:db/ident           :qudt/elementKind,
   :dcterms/description
   "This property is used to describe the quantity kind for a dimensional data type.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "element kind",
   :rdfs/subPropertyOf :qudt/elementKind})

(def elementLabel
  "This property is used to label the field of a composite data structure."
  {:db/ident   :qudt/elementLabel,
   :dcterms/description
   "This property is used to label the field of a composite data structure.",
   :rdf/type   :rdf/Property,
   :rdfs/label "element label"})

(def elementName
  "element name"
  {:db/ident   :qudt/elementName,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "element name"})

(def elementType
  "This property is used to relate a structured data type with the data type the structured type's elements. It is used for structured data types with elements that are all of the same type."
  {:db/ident :qudt/elementType,
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
  {:db/ident :qudt/elementTypeCount,
   :dcterms/description
   "This property determines the allowed number of element types that a structured data type may have.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "element type count",
   :rdfs/range :xsd/integer})

(def elementTypeList
  "This property is used to relate a structured data type with a list of data types. The list members determine the types of structured type's elements. It is used for structured data types with elements that are of different types."
  {:db/ident         :qudt/elementTypeList,
   :dcterms/description
   "This property is used to relate a structured data type with a list of data types. The list members determine the types of structured type's elements. It is used for structured data types with elements that are of different types.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "element type list"})

(def elementUnit
  "element unit"
  {:db/ident         :qudt/elementUnit,
   :rdf/type         [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "element unit"})

(def encodedValue
  "encoded value"
  {:db/ident         :qudt/encodedValue,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "encoded value"})

(def encoding
  "encoding"
  {:db/ident         :qudt/encoding,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "encoding"})

(def encodingDescription
  "encoding description"
  {:db/ident         :qudt/encodingDescription,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "encoding description",
   :rdfs/range       :xsd/string})

(def enumeratedValue
  "enumerated value"
  {:db/ident   :qudt/enumeratedValue,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "enumerated value",
   :rdfs/range :qudt/EnumeratedValue})

(def enumeration
  "enumeration"
  {:db/ident   :qudt/enumeration,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "enumeration",
   :rdfs/range :qudt/Enumeration})

(def exactConstant
  "exact constant"
  {:db/ident         :qudt/exactConstant,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "exact constant",
   :rdfs/range       :xsd/boolean})

(def exactMatch
  "exact match"
  {:db/ident           :qudt/exactMatch,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "exact match",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :owl/sameAs})

(def example
  "The 'qudt:example' property is used to annotate an instance of a class with a reference to a concept that is an example. The type of this property is 'rdf:Property'. This allows both scalar and object ranges."
  {:db/ident :qudt/example,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "The 'qudt:example' property is used to annotate an instance of a class with a reference to a concept that is an example. The type of this property is 'rdf:Property'. This allows both scalar and object ranges.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "example"})

(def exponent
  "exponent"
  {:db/ident   :qudt/exponent,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/label "exponent"})

(def expression
  "An 'expression' is a finite combination of symbols that are well-formed according to rules that apply to units of measure, quantity kinds and their dimensions."
  {:db/ident         :qudt/expression,
   :dcterms/description
   "An 'expression' is a finite combination of symbols that are well-formed according to rules that apply to units of measure, quantity kinds and their dimensions.",
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "expression"})

(def field
  "field"
  {:db/ident :qudt/field,
   :rdf/type :rdf/Property})

(def fieldCode
  "field code"
  {:db/ident         :qudt/fieldCode,
   :qudt/plainTextDescription
   "A field code is a generic property for representing unique codes that make up other identifers. For example each QuantityKind class caries a domain code as its field code.",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "field code",
   :rdfs/range       :xsd/string})

(def fieldLabels
  "This property is used to list the field labels for a record type."
  {:db/ident         :qudt/fieldLabels,
   :dcterms/description
   "This property is used to list the field labels for a record type.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "field labels"})

(def fieldName
  "field name"
  {:db/ident         :qudt/fieldName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "field name",
   :rdfs/range       :xsd/string})

(def figure
  "Provides a link to an image."
  {:db/ident            :qudt/figure,
   :dcterms/description "Provides a link to an image.",
   :rdf/type            :owl/ObjectProperty,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/qudt",
   :rdfs/label          "figure",
   :rdfs/range          :qudt/Figure})

(def figureCaption
  "figure caption"
  {:db/ident         :qudt/figureCaption,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "figure caption",
   :rdfs/range       :xsd/string})

(def figureLabel
  "figure label"
  {:db/ident         :qudt/figureLabel,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "figure label",
   :rdfs/range       :xsd/string})

(def floatPercentage
  "float percentage"
  {:db/ident            :qudt/floatPercentage,
   :owl/equivalentClass {:owl/onDatatype :xsd/float,
                         :owl/withRestrictions [{:xsd/minInclusive 0.0}
                                                {:xsd/maxInclusive 100.0}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            :rdfs/Datatype,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/qudt",
   :rdfs/label          "float percentage",
   :rdfs/subClassOf     :xsd/float})

(def float_X
  "float X"
  {:db/ident         :qudt/float_X,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "float X",
   :rdfs/range       :xsd/anySimpleType})

(def float_Y
  "float Y"
  {:db/ident         :qudt/float_Y,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "float Y",
   :rdfs/range       :xsd/anySimpleType})

(def float_Z
  "float Z"
  {:db/ident         :qudt/float_Z,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "float Z",
   :rdfs/range       :xsd/anySimpleType})

(def frameType
  "frame type"
  {:db/ident         :qudt/frameType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "frame type"})

(def functionArity
  "This property is used to state the number of arguments for a function type."
  {:db/ident :qudt/functionArity,
   :dcterms/description
   "This property is used to state the number of arguments for a function type.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "function arity",
   :rdfs/range :xsd/integer})

(def generalization
  "This property relates a quantity kind to its generalization. A quantity kind, PARENT, is a generalization of the quantity kind CHILD only if: 1. PARENT and CHILD have the same dimensions in every system of quantities; 2. Every unit that is a measure of quantities of kind CHILD is also a valid measure of quantities of kind PARENT."
  {:db/ident :qudt/generalization,
   :dcterms/description
   "This property relates a quantity kind to its generalization. A quantity kind, PARENT, is a generalization of the quantity kind CHILD only if:\n\n1. PARENT and CHILD have the same dimensions in every system of quantities;\n2. Every unit that is a measure of quantities of kind CHILD is also a valid measure of quantities of kind PARENT.",
   :owl/inverseOf :qudt/specialization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "generalization"})

(def guidance
  "guidance"
  {:db/ident         :qudt/guidance,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :qudt/Concept,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "guidance",
   :rdfs/range       :rdf/HTML})

(def hasAllowedUnit
  "This property relates a unit system with a unit of measure that is not defined by or part of the system, but is allowed for use within the system. An allowed unit must be convertible to some dimensionally eqiuvalent unit that is defined by the system."
  {:db/ident           :qudt/hasAllowedUnit,
   :dcterms/description
   "This property relates a unit system with a unit of measure that is not defined by or part of the system, but is allowed for use within the system. An allowed unit must be convertible to some dimensionally eqiuvalent unit that is defined by the system.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "allowed unit",
   :rdfs/subPropertyOf :qudt/hasUnit})

(def hasBaseQuantityKind
  "has base quantity kind"
  {:db/ident           :qudt/hasBaseQuantityKind,
   :owl/inverseOf      :qudt/isBaseQuantityKindOfSystem,
   :rdf/type           [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "has base quantity kind",
   :rdfs/subPropertyOf :qudt/hasQuantityKind})

(def hasBaseUnit
  "This property relates a system of units to a base unit defined within the system. The base units of a system are used to define the derived units of the system by expressing the derived units as products of the base units raised to a rational power."
  {:db/ident :qudt/hasBaseUnit,
   :dcterms/description
   "This property relates a system of units to a base unit defined within the system. The base units of a system are used to define the derived units of the system by expressing the derived units as products of the base units raised to a rational power.",
   :owl/inverseOf :qudt/baseUnitOfSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "base unit",
   :rdfs/subPropertyOf :qudt/hasCoherentUnit})

(def hasCoherentUnit
  "A coherent unit of measurement for a unit system is a defined unit that may be expressed as a product of powers of the system's base units with the proportionality factor of one."
  {:db/ident :qudt/hasCoherentUnit,
   :dcterms/description
   "A coherent unit of measurement for a unit system is a defined unit that may be expressed as a product of powers of the system's base units with the proportionality factor of one.",
   :owl/inverseOf :qudt/coherentUnitOfSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "coherent unit",
   :rdfs/subPropertyOf :qudt/hasDefinedUnit})

(def hasDefinedUnit
  "This property relates a unit system with a unit of measure that is defined by the system."
  {:db/ident           :qudt/hasDefinedUnit,
   :dcterms/description
   "This property relates a unit system with a unit of measure that is defined by the system.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "defined unit",
   :rdfs/subPropertyOf :qudt/hasUnit})

(def hasDenominatorPart
  "has quantity kind dimension vector denominator part"
  {:db/ident         :qudt/hasDenominatorPart,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "has quantity kind dimension vector denominator part"})

(def hasDerivedCoherentUnit
  "derived coherent unit"
  {:db/ident           :qudt/hasDerivedCoherentUnit,
   :owl/inverseOf      :qudt/derivedCoherentUnitOfSystem,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "derived coherent unit",
   :rdfs/subPropertyOf [:qudt/hasDerivedUnit :qudt/hasCoherentUnit]})

(def hasDerivedNonCoherentUnit
  "has coherent derived unit"
  {:db/ident           :qudt/hasDerivedNonCoherentUnit,
   :owl/inverseOf      :qudt/derivedNonCoherentUnitOfSystem,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "has coherent derived unit",
   :rdfs/subPropertyOf :qudt/hasDerivedUnit})

(def hasDerivedUnit
  "This property relates a system of units to a unit of measure that is defined within the system in terms of the base units for the system. That is, the derived unit is defined as a product of the base units for the system raised to some rational power."
  {:db/ident :qudt/hasDerivedUnit,
   :dcterms/description
   "This property relates a system of units to a unit of measure that is defined within the system in terms of the base units for the system. That is, the derived unit is defined as a product of the base units for the system raised to some rational power.",
   :owl/inverseOf :qudt/derivedUnitOfSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "derived unit"})

(def hasDimension
  "has dimension"
  {:db/ident         :qudt/hasDimension,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "has dimension"})

(def hasDimensionExpression
  "dimension expression"
  {:db/ident         :qudt/hasDimensionExpression,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "dimension expression"})

(def hasDimensionVector
  "has dimension vector"
  {:db/ident         :qudt/hasDimensionVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "has dimension vector",
   :rdfs/range       :qudt/QuantityKindDimensionVector})

(def hasNonCoherentUnit
  "A coherent unit of measurement for a unit system is a defined unit that may be expressed as a product of powers of the system's base units with the proportionality factor of one."
  {:db/ident :qudt/hasNonCoherentUnit,
   :dcterms/description
   "A coherent unit of measurement for a unit system is a defined unit that may be expressed as a product of powers of the system's base units with the proportionality factor of one.",
   :owl/inverseOf :qudt/coherentUnitOfSystem,
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "has non-coherent unit",
   :rdfs/subPropertyOf :qudt/hasDefinedUnit})

(def hasNumeratorPart
  "has quantity kind dimension vector numerator part"
  {:db/ident         :qudt/hasNumeratorPart,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "has quantity kind dimension vector numerator part"})

(def hasPrefixUnit
  "prefix unit"
  {:db/ident           :qudt/hasPrefixUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "prefix unit",
   :rdfs/subPropertyOf :qudt/hasDefinedUnit})

(def hasQuantity
  "has quantity"
  {:db/ident         :qudt/hasQuantity,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "has quantity",
   :rdfs/range       :qudt/Quantity})

(def hasQuantityKind
  "has quantity kind"
  {:db/ident         :qudt/hasQuantityKind,
   :owl/inverseOf    :qudt/isQuantityKindOf,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "has quantity kind",
   :rdfs/range       :qudt/QuantityKind})

(def hasReferenceQuantityKind
  "has reference quantity kind"
  {:db/ident         :qudt/hasReferenceQuantityKind,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "has reference quantity kind"})

(def hasRule
  "has rule"
  {:db/ident         :qudt/hasRule,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "has rule"})

(def hasUnit
  "This property relates a system of units with a unit of measure that is either a) defined by the system, or b) accepted for use by the system and is convertible to a unit of equivalent dimension that is defined by the system. Systems of units may distinguish between base and derived units. Base units are the units which measure the base quantities for the corresponding system of quantities. The base units are used to define units for all other quantities as products of powers of the base units. Such units are called derived units for the system."
  {:db/ident :qudt/hasUnit,
   :dcterms/description
   "This property relates a system of units with a unit of measure that is either a) defined by the system, or b) accepted for use by the system and is convertible to a unit of equivalent dimension that is defined by the system. Systems of units may distinguish between base and derived units. Base units are the units which measure the base quantities for the corresponding system of quantities. The base units are used to define units for all other quantities as products of powers of the base units. Such units are called derived units for the system.",
   :owl/inverseOf :qudt/unitOfSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "has unit"})

(def hasUnitSystem
  "has unit system"
  {:db/ident         :qudt/hasUnitSystem,
   :rdf/type         [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "has unit system"})

(def hasVocabulary
  "has vocabulary"
  {:db/ident         :qudt/hasVocabulary,
   :qudt/plainTextDescription
   "Used to relate a class to one or more graphs where vocabularies for the class are defined.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "has vocabulary",
   :rdfs/range       :owl/Ontology})

(def height
  "height"
  {:db/ident         :qudt/height,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "height",
   :rdfs/range       :xsd/string})

(def hexbinary
  "hexbinary"
  {:db/ident            :qudt/hexbinary,
   :owl/equivalentClass {:owl/onDatatype :xsd/string,
                         :owl/withRestrictions [{:xsd/pattern "[0-9A-F]*"}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            :rdfs/Datatype,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "hexbinary",
   :rdfs/subClassOf     :xsd/string})

(def iconicCue
  "iconic cue"
  {:db/ident           :qudt/iconicCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "iconic cue",
   :rdfs/subPropertyOf :qudt/modalCue})

(def iconicCueEnumeration
  "iconic cue enumeration"
  {:db/ident           :qudt/iconicCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "iconic cue enumeration",
   :rdfs/subPropertyOf :qudt/modalCueEnumeration})

(def id
  "The \"qudt:id\" is an identifier string that uniquely identifies a QUDT concept. The identifier is constructed using a prefix. For example, units are coded using the pattern: \"UCCCENNNN\", where \"CCC\" is a numeric code or a category and \"NNNN\" is a digit string for a member element of that category. For scaled units there may be an addition field that has the format \"QNN\" where \"NN\" is a digit string representing an exponent power, and \"Q\" is a qualifier that indicates with the code \"P\" that the power is a positive decimal exponent, or the code \"N\" for a negative decimal exponent, or the code \"B\" for binary positive exponents."
  {:db/ident :qudt/id,
   :dcterms/description
   "The \"qudt:id\" is an identifier string that uniquely identifies a QUDT concept.  The identifier is constructed using a prefix. For example, units are coded using the pattern: \"UCCCENNNN\", where \"CCC\" is a numeric code or a category and \"NNNN\" is a digit string for a member element of that category. For scaled units there may be an addition field that has the format \"QNN\" where \"NN\" is a digit string representing an exponent power, and \"Q\" is a qualifier that indicates with the code \"P\" that the power is a positive decimal exponent, or the code \"N\" for a negative decimal exponent, or the code \"B\" for binary positive exponents.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :qudt/Concept,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "qudt id",
   :rdfs/range :xsd/string})

(def iec61360Code
  "iec-61360 code"
  {:db/ident         :qudt/iec61360Code,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "iec-61360 code",
   :rdfs/range       :xsd/string})

(def image
  "image"
  {:db/ident         :qudt/image,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "image",
   :rdfs/range       :xsd/anyURI})

(def imageLocation
  "image location"
  {:db/ident         :qudt/imageLocation,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "image location",
   :rdfs/range       :xsd/anyURI})

(def informativeReference
  "Provides a way to reference a source that provided useful but non-normative information."
  {:db/ident :qudt/informativeReference,
   :dcterms/description
   "Provides a way to reference a source that provided useful but non-normative information.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "informative reference",
   :rdfs/range :xsd/anyURI})

(def integer1to12
  "integer 1..12"
  {:db/ident            :qudt/integer1to12,
   :owl/equivalentClass {:owl/onDatatype :xsd/integer,
                         :owl/withRestrictions [{:xsd/minInclusive 1.0}
                                                {:xsd/maxInclusive 12.0}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "integer 1..12",
   :rdfs/subClassOf     :xsd/integer})

(def integer1to31
  "integer 1..31"
  {:db/ident            :qudt/integer1to31,
   :owl/equivalentClass {:owl/onDatatype :xsd/integer,
                         :owl/withRestrictions [{:xsd/minInclusive 1.0}
                                                {:xsd/maxInclusive 31.0}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "integer 1..31",
   :rdfs/subClassOf     :xsd/integer})

(def integerPercentage
  "integer percentage"
  {:db/ident            :qudt/integerPercentage,
   :owl/equivalentClass {:owl/onDatatype :xsd/integer,
                         :owl/withRestrictions [{:xsd/minInclusive 0.0}
                                                {:xsd/maxInclusive 100.0}],
                         :rdf/type :rdfs/Datatype,
                         :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt"},
   :rdf/type            :rdfs/Datatype,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/qudt",
   :rdfs/label          "integer percentage",
   :rdfs/subClassOf     :xsd/integer})

(def inverted
  "inverted"
  {:db/ident         :qudt/inverted,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "inverted",
   :rdfs/range       :xsd/boolean})

(def isBaseQuantityKindOfSystem
  "is base quantity kind of system"
  {:db/ident           :qudt/isBaseQuantityKindOfSystem,
   :owl/inverseOf      :qudt/hasBaseQuantityKind,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "is base quantity kind of system",
   :rdfs/subPropertyOf :qudt/isQuantityKindOf})

(def isByteString
  "is byte string"
  {:db/ident         :qudt/isByteString,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "is byte string",
   :rdfs/range       :xsd/boolean})

(def isComprisedOf
  "isComprisedOf"
  {:db/ident :qudt/isComprisedOf,
   :rdf/type :rdf/Property})

(def isDeltaQuantity
  "This property is used to identify a Quantity instance that is a measure of a change, or interval, of some property, rather than a measure of its absolute value. This is important for measurements such as temperature differences where the conversion among units would be calculated differently because of offsets."
  {:db/ident :qudt/isDeltaQuantity,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "This property is used to identify a Quantity instance that is a measure of a change, or interval, of some property, rather than a measure of its absolute value. This is important for measurements such as temperature differences where the conversion among units would be calculated differently because of offsets.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "is Delta Quantity",
   :rdfs/range :xsd/boolean})

(def isDimensionInSystem
  "is dimension in system"
  {:db/ident         :qudt/isDimensionInSystem,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "is dimension in system"})

(def isMetricUnit
  "is metric unit"
  {:db/ident         :qudt/isMetricUnit,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "is metric unit",
   :rdfs/range       :xsd/boolean})

(def isQuantityKindOf
  "is quantity kind of"
  {:db/ident         :qudt/isQuantityKindOf,
   :owl/inverseOf    :qudt/hasQuantityKind,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "is quantity kind of"})

(def isScalingOf
  "is scaling of"
  {:db/ident         :qudt/isScalingOf,
   :rdf/type         [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "is scaling of"})

(def isoNormativeReference
  "Provides a way to reference the ISO unit definition."
  {:db/ident            :qudt/isoNormativeReference,
   :dcterms/description "Provides a way to reference the ISO unit definition.",
   :rdf/type            :owl/DatatypeProperty,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/qudt",
   :rdfs/label          "normative reference (ISO)",
   :rdfs/range          :xsd/anyURI,
   :rdfs/subPropertyOf  :qudt/normativeReference})

(def javaName
  "java name"
  {:db/ident           :qudt/javaName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "java name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def jsName
  "Javascript name"
  {:db/ident           :qudt/jsName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Javascript name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def kinestheticCue
  "kinesthetic cue"
  {:db/ident           :qudt/kinestheticCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "kinesthetic cue",
   :rdfs/subPropertyOf :qudt/modalCue})

(def kinestheticCueEnumeration
  "kinesthetic cue enumeration"
  {:db/ident           :qudt/kinestheticCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "kinesthetic cue enumeration",
   :rdfs/subPropertyOf :qudt/modalCueEnumeration})

(def landscape
  "landscape"
  {:db/ident         :qudt/landscape,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "landscape",
   :rdfs/range       :xsd/boolean})

(def latexDefinition
  "latex definition"
  {:db/ident         :qudt/latexDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "latex definition",
   :rdfs/range       :qudt/LatexString})

(def latexSymbol
  "The symbol is a glyph that is used to represent some concept, typically a unit or a quantity, in a compact form. For example, the symbol for an Ohm is \\(ohm\\). This contrasts with 'unit:abbreviation', which gives a short alphanumeric abbreviation for the unit, 'ohm' for Ohm."
  {:db/ident :qudt/latexSymbol,
   :dcterms/description
   "The symbol is a glyph that is used to represent some concept, typically a unit or a quantity, in a compact form. For example, the symbol for an Ohm is \\(ohm\\). This contrasts with 'unit:abbreviation', which gives a short alphanumeric abbreviation for the unit, 'ohm' for Ohm.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "latex symbol",
   :rdfs/range :qudt/LatexString})

(def length
  "The length of a structure, for example the size of a vector"
  {:db/ident :qudt/length,
   :dcterms/description
   "The length of a structure, for example the size of a vector",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "length",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf [:qudt/minLength :qudt/maxLength]})

(def literal
  "literal"
  {:db/ident           :qudt/literal,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "literal",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :dtype/literal})

(def lowerBound
  "lower bound"
  {:db/ident         :qudt/lowerBound,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "lower bound"})

(def mantissa
  "In scientific notation, the mantissa of a real number is the integer coefficient preceding the base raised to the exponent."
  {:db/ident :qudt/mantissa,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "In scientific notation, the mantissa of a real number is the integer coefficient preceding the base raised to the exponent.",
   :rdfs/label "mantissa"})

(def mathDefinition
  "math definition"
  {:db/ident         :qudt/mathDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "math definition",
   :rdfs/range       :xsd/string})

(def mathMLdefinition
  "mathML definition"
  {:db/ident           :qudt/mathMLdefinition,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "mathML definition",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/mathDefinition})

(def matlabName
  "matlab name"
  {:db/ident           :qudt/matlabName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "matlab name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def maxBits
  "maximum bits"
  {:db/ident         :qudt/maxBits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "maximum bits",
   :rdfs/range       :xsd/integer})

(def maxDepth
  "max depth"
  {:db/ident         :qudt/maxDepth,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "max depth",
   :rdfs/range       :xsd/integer})

(def maxExclusive
  "maxExclusive is the exclusive upper bound of the value space for a datatype with the ordered property. The value of maxExclusive must be in the value space of the base type or be equal to {value} in {base type definition}."
  {:db/ident :qudt/maxExclusive,
   :dcterms/description
   "maxExclusive is the exclusive upper bound of the value space for a datatype with the ordered property. The value of maxExclusive must be in the value space of the base type or be equal to {value} in {base type definition}.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "max exclusive",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :qudt/upperBound})

(def maxExponent
  "max exponent"
  {:db/ident         :qudt/maxExponent,
   :rdf/type         [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "max exponent",
   :rdfs/range       :xsd/integer})

(def maxInclusive
  "maxInclusive is the inclusive upper bound of the value space for a datatype with the ordered property. The value of maxInclusive must be in the value space of the base type."
  {:db/ident           :qudt/maxInclusive,
   :dcterms/description
   "maxInclusive is the inclusive upper bound of the value space for a datatype with the ordered property. The value of maxInclusive must be in the value space of the base type.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "max inclusive",
   :rdfs/subPropertyOf :qudt/upperBound})

(def maxLength
  "max length"
  {:db/ident         :qudt/maxLength,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "max length",
   :rdfs/range       :xsd/integer})

(def maxMantissa
  "<p>The maximium mantissa is the largest integer that may appear as a coefficient in a finite precision representation of a real number. For a given numeric data type, the value of <em>maxMantissa}</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and <em>precision</em> (<em>p</em>) are related by the formula: <em>M = b<sup></sup> - 1</em> .</p>"
  {:db/ident :qudt/maxMantissa,
   :dcterms/description
   "<p>The maximium mantissa is the largest integer that may appear as a coefficient in a finite precision representation of a real number.  For a given numeric data type, the value of <em>maxMantissa}</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and  <em>precision</em> (<em>p</em>) are related by the formula: <em>M = b<sup></sup> - 1</em> .</p>",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "max mantissa",
   :rdfs/range :xsd/integer})

(def microsoftSQLServerName
  "Microsoft SQL Server name"
  {:db/ident           :qudt/microsoftSQLServerName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Microsoft SQL Server name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def minBits
  "minimum bits"
  {:db/ident         :qudt/minBits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "minimum bits",
   :rdfs/range       :xsd/integer})

(def minExclusive
  "minExclusive is the exclusive lower bound of the value space for a datatype with the ordered property. The value of minExclusive must be in the value space of the base type or be equal to {value} in {base type definition}."
  {:db/ident           :qudt/minExclusive,
   :dcterms/description
   "minExclusive is the exclusive lower bound of the value space for a datatype with the ordered property. The value of minExclusive must be in the value space of the base type or be equal to {value} in {base type definition}.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "min exclusive",
   :rdfs/subPropertyOf :qudt/lowerBound})

(def minInclusive
  "minInclusive is the inclusive lower bound of the value space for a datatype with the ordered property. The value of minInclusive must be in the value space of the base type."
  {:db/ident           :qudt/minInclusive,
   :dcterms/description
   "minInclusive is the inclusive lower bound of the value space for a datatype with the ordered property. The value of minInclusive must be in the value space of the base type.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "min inclusive",
   :rdfs/subPropertyOf :qudt/lowerBound})

(def minLength
  "min length"
  {:db/ident         :qudt/minLength,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "min length",
   :rdfs/range       :xsd/integer})

(def minMantissa
  "<p>The minimium mantissa is the negative integer with the greatest magnitude that may appear as a coefficient in a finite precision representation of a real number. For a given numeric data type, the value of <em>minMantissa</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and <em>precision</em> (<em>p</em>) are related by the formula: <em>M = -(b<sup>p</sup> - 1)</em>.</p>"
  {:db/ident :qudt/minMantissa,
   :dcterms/description
   "<p>The minimium mantissa is the negative integer with the greatest magnitude that may appear as a coefficient in a finite precision representation of a real number.  For a given numeric data type, the value of <em>minMantissa</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and <em>precision</em> (<em>p</em>) are related by the formula: <em>M = -(b<sup>p</sup> - 1)</em>.</p>",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "min mantissa",
   :rdfs/range :xsd/integer})

(def minValue
  "minimum value"
  {:db/ident         :qudt/minValue,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "minimum value"})

(def modalCue
  "modal cue"
  {:db/ident   :qudt/modalCue,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "modal cue"})

(def modalCueEnumeration
  "modal cue enumeration"
  {:db/ident           :qudt/modalCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "modal cue enumeration",
   :rdfs/subPropertyOf :qudt/enumeration})

(def modifiability
  "Reference to one in a list of enumerated elements that indicates whether data (e.g. variable or parameter) can be changed."
  {:db/ident :qudt/modifiability,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Reference to one in a list of enumerated elements that indicates whether data (e.g. variable or parameter) can be changed.",
   :rdfs/label "modifiability"})

(def mySQLName
  "MySQL name"
  {:db/ident           :qudt/mySQLName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "MySQL name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def negative
  "negative"
  {:db/ident     :qudt/negative,
   :qudt/code    "1",
   :qudt/literal "negative",
   :rdf/type     [:qudt/Polarity :owl/NamedIndividual],
   :rdfs/label   "negative"})

(def negativeDeltaLimit
  "A negative change limit between consecutive sample values for a parameter. The Negative Delta may be the encoded value or engineering units value depending on whether or not a Calibrator is defined."
  {:db/ident :qudt/negativeDeltaLimit,
   :dcterms/description
   "A negative change limit between consecutive sample values for a parameter. The Negative Delta may be the encoded value or engineering units value depending on whether or not a Calibrator is defined.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "negative delta limit",
   :rdfs/range :xsd/string})

(def normativeReference
  "Provides a way to reference information that is an authorative source providing a standard definition"
  {:db/ident :qudt/normativeReference,
   :dcterms/description
   "Provides a way to reference information that is an authorative source providing a standard definition",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "normative reference",
   :rdfs/range :xsd/anyURI})

(def numeratorDimensionVector
  "numerator dimension vector"
  {:db/ident         :qudt/numeratorDimensionVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "numerator dimension vector",
   :rdfs/range       :qudt/QuantityKindDimensionVector})

(def numericValue
  "numeric value"
  {:db/ident         :qudt/numericValue,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "numeric value",
   :rdfs/range       :qudt/NumericUnion})

(def octets
  "octets"
  {:db/ident         :qudt/octets,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "octets",
   :rdfs/range       :xsd/integer})

(def odbcName
  "ODBC name"
  {:db/ident           :qudt/odbcName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "ODBC name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def oleDBName
  "OLE DB (Object Linking and Embedding, Database, sometimes written as OLEDB or OLE-DB), an API designed by Microsoft, allows accessing data from a variety of sources in a uniform manner. The API provides a set of interfaces implemented using the Component Object Model (COM); it is otherwise unrelated to OLE."
  {:db/ident :qudt/oleDBName,
   :dcterms/description
   "OLE DB (Object Linking and Embedding, Database, sometimes written as OLEDB or OLE-DB), an API designed by Microsoft, allows accessing data from a variety of sources in a uniform manner. The API provides a set of interfaces implemented using the Component Object Model (COM); it is otherwise unrelated to OLE. ",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/windows/desktop/ms714931(v=vs.85).aspx"
    "http://en.wikipedia.org/wiki/OLE_DB"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "OLE DB name",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def omUnit
  "om unit"
  {:db/ident         :qudt/omUnit,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :qudt/Unit,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "om unit"})

(def onlineReference
  "online reference"
  {:db/ident         :qudt/onlineReference,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "online reference",
   :rdfs/range       :xsd/anyURI})

(def optional
  "optional"
  {:db/ident   :qudt/optional,
   :rdf/type   :rdf/Property,
   :rdfs/label "optional"})

(def oracleSQLName
  "ORACLE SQL name"
  {:db/ident           :qudt/oracleSQLName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :qudt/Datatype,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "ORACLE SQL name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def order
  "order"
  {:db/ident         :qudt/order,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "order",
   :rdfs/range       :xsd/nonNegativeInteger})

(def orderInStructure
  "order in structure"
  {:db/ident         :qudt/orderInStructure,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "order in structure"})

(def orderedType
  "ordered type"
  {:db/ident         :qudt/orderedType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "ordered type"})

(def orderingRelation
  "This property identifies the mathematical comparison operator (such as \"<\" or \">\") that is used to order the elements of a collection."
  {:db/ident         :qudt/orderingRelation,
   :dcterms/description
   "This property identifies the mathematical comparison operator (such as \"<\" or \">\") that is used to order the elements of a collection.",
   :rdf/type         [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Ordering Relation"})

(def originDefinition
  "origin definition"
  {:db/ident         :qudt/originDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "origin definition",
   :rdfs/range       :xsd/string})

(def outOfScope
  "out of scope"
  {:db/ident         :qudt/outOfScope,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "out of scope",
   :rdfs/range       :xsd/boolean})

(def padding
  "padding"
  {:db/ident         :qudt/padding,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "padding"})

(def pattern
  "A pattern is a constraint on the value space of a datatype which is achieved by constraining the lexical space to literals which match a specific pattern. The value of pattern must be a regular expression."
  {:db/ident :qudt/pattern,
   :dcterms/description
   "A pattern is a constraint on the value space of a datatype which is achieved by constraining the lexical space to literals which match a specific pattern. The value of pattern must be a regular expression.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "pattern",
   :rdfs/range :xsd/string})

(def permissibleMaths
  "permissible maths"
  {:db/ident         :qudt/permissibleMaths,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "permissible maths"})

(def permissibleTransformation
  "permissible transformation"
  {:db/ident         :qudt/permissibleTransformation,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "permissible transformation"})

(def pitchRotationDefinition
  "pitch rotation definition"
  {:db/ident           :qudt/pitchRotationDefinition,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "pitch rotation definition",
   :rdfs/subPropertyOf :qudt/rotationDefinition})

(def plainTextDescription
  "A plain text description is used to provide a description with only simple ASCII characters for cases where LaTeX , HTML or other markup would not be appropriate."
  {:db/ident :qudt/plainTextDescription,
   :dcterms/description
   "A plain text description is used to provide a description with only simple ASCII characters for cases where LaTeX , HTML or other markup would not be appropriate.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "description (plain text)",
   :rdfs/range :xsd/string})

(def positive
  "positive"
  {:db/ident     :qudt/positive,
   :qudt/code    "2",
   :qudt/literal "positive",
   :rdf/type     [:qudt/Polarity :owl/NamedIndividual],
   :rdfs/label   "positive"})

(def positiveDeltaLimit
  "A positive change limit between consecutive sample values for a parameter. The Positive Delta may be the encoded value or engineering units value depending on whether or not a Calibrator is defined."
  {:db/ident :qudt/positiveDeltaLimit,
   :dcterms/description
   "A positive change limit between consecutive sample values for a parameter. The Positive Delta may be the encoded value or engineering units value depending on whether or not a Calibrator is defined.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Positive delta limit",
   :rdfs/range :xsd/string})

(def precision
  "Precision is the number of digits used to perform a given computation. The concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits. For a given numeric data type, the value of type:precision (?p) is related to the values of type:maxMantissa (?M) and type:base (?b) by the formula ?p := log(?b, ?M) where log(a,y) = x iff y=a^x."
  {:db/ident :qudt/precision,
   :dcterms/description
   "Precision is the number of digits used to perform a given computation. The concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits.\n\nFor a given numeric data type, the value of type:precision (?p) is related to the values of type:maxMantissa (?M) and type:base (?b) by the formula \n\n?p := log(?b, ?M) \n\nwhere log(a,y) = x iff y=a^x.",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "precision",
   :rdfs/range :xsd/integer})

(def prefix
  "Associates a unit with the appropriate prefix, if any."
  {:db/ident         :qudt/prefix,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Associates a unit with the appropriate prefix, if any.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "prefix",
   :rdfs/range       :qudt/Prefix})

(def prefixMultiplier
  "prefix multiplier"
  {:db/ident         :qudt/prefixMultiplier,
   :rdf/type         [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "prefix multiplier",
   :rdfs/range       :xsd/double})

(def protocolBuffersName
  "protocol buffers name"
  {:db/ident           :qudt/protocolBuffersName,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "protocol buffers name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def pythonName
  "python name"
  {:db/ident           :qudt/pythonName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "python name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def qkdvDenominator
  "denominator dimension vector"
  {:db/ident         :qudt/qkdvDenominator,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "denominator dimension vector",
   :rdfs/range       :qudt/QuantityKindDimensionVector})

(def qkdvNumerator
  "numerator dimension vector"
  {:db/ident         :qudt/qkdvNumerator,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "numerator dimension vector",
   :rdfs/range       :qudt/QuantityKindDimensionVector})

(def quantity
  "a property to relate an observable thing with a quantity (qud:Quantity)"
  {:db/ident         :qudt/quantity,
   :dcterms/description
   "a property to relate an observable thing with a quantity (qud:Quantity)",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "quantity"})

(def quantityValue
  "quantity value"
  {:db/ident         :qudt/quantityValue,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "quantity value",
   :rdfs/range       :qudt/QuantityValue})

(def rationale
  "rationale"
  {:db/ident         :qudt/rationale,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "rationale",
   :rdfs/range       :rdf/HTML})

(def rdfsDatatype
  "rdfs datatype"
  {:db/ident         :qudt/rdfsDatatype,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "rdfs datatype"})

(def realization
  "realization"
  {:db/ident         :qudt/realization,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "realization",
   :rdfs/range       :xsd/string})

(def reference
  "reference"
  {:db/ident         :qudt/reference,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "reference"})

(def referenceFrame
  "reference frame"
  {:db/ident           :qudt/referenceFrame,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "reference frame",
   :rdfs/subPropertyOf :qudt/coordinateSystemFrame})

(def referenceFrameType
  "reference frame type"
  {:db/ident         :qudt/referenceFrameType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "reference frame type"})

(def referenceUnit
  "reference unit"
  {:db/ident         :qudt/referenceUnit,
   :rdf/type         [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "reference unit"})

(def relativeStandardUncertainty
  "The relative standard uncertainty of a measurement is the (absolute) standard uncertainty divided by the magnitude of the exact value."
  {:db/ident :qudt/relativeStandardUncertainty,
   :dcterms/description
   "The relative standard uncertainty of a measurement is the (absolute) standard uncertainty divided by the magnitude of the exact value.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "relative standard uncertainty",
   :rdfs/range :xsd/double})

(def relevantQuantityKind
  "relevant quantity kind"
  {:db/ident         :qudt/relevantQuantityKind,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "relevant quantity kind",
   :rdfs/range       :qudt/QuantityKind})

(def relevantUnit
  "This property is used for qudt:Discipline instances to identify the Unit instances that are used within a given discipline."
  {:db/ident :qudt/relevantUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This property is used for qudt:Discipline instances to identify the Unit instances that are used within a given discipline.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "Relevant Unit",
   :rdfs/range :qudt/Unit})

(def returnType
  "This property is used to state the return type of a function type."
  {:db/ident           :qudt/returnType,
   :dcterms/description
   "This property is used to state the return type of a function type.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "return type",
   :rdfs/subPropertyOf :qudt/elementType})

(def rgbCode
  "rgb code"
  {:db/ident   :qudt/rgbCode,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "rgb code"})

(def rollRotationDefinition
  "roll rotation definition"
  {:db/ident           :qudt/rollRotationDefinition,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "roll rotation definition",
   :rdfs/subPropertyOf :qudt/rotationDefinition})

(def rotationDefinition
  "rotation definition"
  {:db/ident         :qudt/rotationDefinition,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "rotation definition"})

(def rows
  "rows"
  {:db/ident         :qudt/rows,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "rows",
   :rdfs/range       :xsd/integer})

(def ruleType
  "rule type"
  {:db/ident         :qudt/ruleType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "rule type"})

(def scaleType
  "scale type"
  {:db/ident         :qudt/scaleType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "scale type"})

(def siUnitsExpression
  "si units expression"
  {:db/ident         :qudt/siUnitsExpression,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "si units expression",
   :rdfs/range       :xsd/string})

(def signedness
  "signedness"
  {:db/ident         :qudt/signedness,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "signedness"})

(def significantDigits
  "significant digits"
  {:db/ident         :qudt/significantDigits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "significant digits",
   :rdfs/range       :xsd/integer})

(def sound
  "The intended use of the sound property is to be associated with modal enumerations"
  {:db/ident :qudt/sound,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The intended use of the sound property is to be associated with modal enumerations",
   :rdfs/label "sound"})

(def specialization
  "This property relates a quantity kind to its specialization(s). For example, linear velocity and angular velocity are both specializations of velocity."
  {:db/ident :qudt/specialization,
   :dcterms/description
   "This property relates a quantity kind to its specialization(s). For example, linear velocity and angular velocity are both specializations of velocity.",
   :owl/inverseOf :qudt/generalization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "specialization"})

(def standardUncertainty
  "The standard uncertainty of a quantity is the estimated standard deviation of the mean taken from a series of measurements."
  {:db/ident :qudt/standardUncertainty,
   :dcterms/description
   "The standard uncertainty of a quantity is the estimated standard deviation of the mean taken from a series of measurements.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "standard uncertainty",
   :rdfs/range :xsd/double})

(def stringValue
  "string value"
  {:db/ident           :qudt/stringValue,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/label         "string value",
   :rdfs/subPropertyOf :qudt/value})

(def supercededBy
  "This property is used to refer to the most current definition of an entity, when needed."
  {:db/ident         :qudt/supercededBy,
   :dcterms/description
   "This property is used to refer to the most current definition of an entity, when needed.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "superceded by"})

(def symbol
  "The symbol is a glyph that is used to represent some concept, typically a unit or a quantity, in a compact form. For example, the symbol for an Ohm is \\(ohm\\). This contrasts with 'unit:abbreviation', which gives a short alphanumeric abbreviation for the unit, 'ohm' for Ohm."
  {:db/ident           :qudt/symbol,
   :dcterms/description
   "The symbol is a glyph that is used to represent some concept, typically a unit or a quantity, in a compact form. For example, the symbol for an Ohm is \\(ohm\\). This contrasts with 'unit:abbreviation', which gives a short alphanumeric abbreviation for the unit, 'ohm' for Ohm.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "symbol",
   :rdfs/subPropertyOf :qudt/literal})

(def systemDefinition
  "system definition"
  {:db/ident         :qudt/systemDefinition,
   :rdf/type         [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "system definition"})

(def systemDerivedQuantityKind
  "system derived quantity kind"
  {:db/ident           :qudt/systemDerivedQuantityKind,
   :owl/inverseOf      :qudt/derivedQuantityKindOfSystem,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/qudt",
   :rdfs/label         "system derived quantity kind",
   :rdfs/subPropertyOf :qudt/hasQuantityKind})

(def systemDimension
  "system dimension"
  {:db/ident         :qudt/systemDimension,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "system dimension"})

(def timeDatatype
  "time datatype"
  {:db/ident           :qudt/timeDatatype,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "time datatype",
   :rdfs/subPropertyOf :qudt/type})

(def totalDigits
  "total digits"
  {:db/ident   :qudt/totalDigits,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "total digits"})

(def type
  "A reference to the specification of the data type of a variable or constant."
  {:db/ident :qudt/type,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A reference to the specification of the data type of a variable or constant.",
   :rdfs/label "type"})

(def typeMatrix
  "type matrix"
  {:db/ident         :qudt/typeMatrix,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "type matrix"})

(def typeVector
  "type vector"
  {:db/ident         :qudt/typeVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "type vector"})

(def ucumCaseInsensitiveCode
  "<em>ucumCode</em> associates a QUDT unit with a UCUM case-insensitive code."
  {:db/ident :qudt/ucumCaseInsensitiveCode,
   :dcterms/description
   "<em>ucumCode</em> associates a QUDT unit with a UCUM case-insensitive code.",
   :owl/deprecated true,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "ucum case-insensitive code",
   :rdfs/subPropertyOf :qudt/ucumCode})

(def ucumCaseSensitiveCode
  "<em>ucumCode</em> associates a QUDT unit with with a UCUM case-sensitive code."
  {:db/ident :qudt/ucumCaseSensitiveCode,
   :dcterms/description
   "<em>ucumCode</em> associates a QUDT unit with with a UCUM case-sensitive code.",
   :owl/deprecated true,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "ucum case-sensitive code",
   :rdfs/subPropertyOf :qudt/ucumCode})

(def ucumCode
  "<p><em>ucumCode</em> associates a QUDT unit with its UCUM code (case-sensitive). </p><p>In SHACL the values are derived from specific ucum properties using 'sh:values'.</p>"
  {:db/ident :qudt/ucumCode,
   :dcterms/description
   "<p><em>ucumCode</em> associates a QUDT unit with its UCUM code (case-sensitive). </p><p>In SHACL the values are derived from specific ucum properties using 'sh:values'.</p>",
   :dcterms/source "https://ucum.org/ucum.html",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "ucum code",
   :rdfs/range {:owl/unionOf [:qudt/UCUMcs :qudt/UCUMcs-term],
                :rdf/type    :owl/Class},
   :rdfs/seeAlso "https://ucum.org/ucum.html",
   :rdfs/subPropertyOf :skos/notation})

(def udunitsCode
  "The UDUNITS package supports units of physical quantities. Its C library provides for arithmetic manipulation of units and for conversion of numeric values between compatible units. The package contains an extensive unit database, which is in XML format and user-extendable. The package also contains a command-line utility for investigating units and converting values."
  {:db/ident :qudt/udunitsCode,
   :dcterms/description
   "The UDUNITS package supports units of physical quantities. Its C library provides for arithmetic manipulation of units and for conversion of numeric values between compatible units. The package contains an extensive unit database, which is in XML format and user-extendable. The package also contains a command-line utility for investigating units and converting values.",
   :dcterms/source "https://www.unidata.ucar.edu/software/udunits/",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "udunits code",
   :rdfs/range :xsd/string})

(def uneceCommonCode
  "The UN/CEFACT Recommendation 20 provides three character alphabetic and alphanumeric codes for representing units of measurement for length, area, volume/capacity, mass (weight), time, and other quantities used in international trade. The codes are intended for use in manual and/or automated systems for the exchange of information between participants in international trade."
  {:db/ident :qudt/uneceCommonCode,
   :dcterms/description
   "The UN/CEFACT Recommendation 20 provides three character alphabetic and alphanumeric codes for representing units of measurement for length, area, volume/capacity, mass (weight), time, and other quantities used in international trade. The codes are intended for use in manual and/or automated systems for the exchange of information between participants in international trade.",
   :dcterms/source
   ["https://unece.org/trade/documents/2021/06/uncefact-rec20-0"
    "https://service.unece.org/trade/uncefact/vocabulary/rec20/"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "unece common code",
   :rdfs/range :xsd/string})

(def unit
  "A reference to the unit of measure of a quantity (variable or constant) of interest."
  {:db/ident :qudt/unit,
   :dcterms/description
   "A reference to the unit of measure of a quantity (variable or constant) of interest.",
   :owl/inverseOf :qudt/unitFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "unit",
   :rdfs/range :qudt/Unit})

(def unitFor
  "unit for"
  {:db/ident         :qudt/unitFor,
   :owl/inverseOf    :qudt/unit,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "unit for"})

(def unitOfSystem
  "This property relates a unit of measure with a system of units that either a) defines the unit or b) allows the unit to be used within the system."
  {:db/ident :qudt/unitOfSystem,
   :dcterms/description
   "This property relates a unit of measure with a system of units that either a) defines the unit or b) allows the unit to be used within the system.",
   :owl/inverseOf :qudt/hasUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :qudt/Unit,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "is unit of system",
   :rdfs/range :qudt/SystemOfUnits})

(def upperBound
  "upper bound"
  {:db/ident         :qudt/upperBound,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "upper bound",
   :rdfs/range       :xsd/anySimpleType})

(def url
  "url"
  {:db/ident         :qudt/url,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "url",
   :rdfs/range       :xsd/anyURI})

(def value
  "A property to relate an observable thing with a value of any kind"
  {:db/ident :qudt/value,
   :dcterms/description
   "A property to relate an observable thing with a value of any kind",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This property identifies the value associated with a data structure. The value may be a scalar or a reference to another object. The disjoint sub-properties of this data:value distinguish between scalar values and object references.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label "value",
   :rdfs/subPropertyOf :rdf/value})

(def valueQuantity
  "value for quantity"
  {:db/ident         :qudt/valueQuantity,
   :owl/inverseOf    :qudt/quantityValue,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "value for quantity"})

(def valueRange
  "value range"
  {:db/ident   :qudt/valueRange,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "value range"})

(def valueType
  "value type"
  {:db/ident         :qudt/valueType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "value type"})

(def valueUnion
  "A datatype that is the union of numeric xsd data types. \"numericUnion\" is equivalent to the xsd specification that uses an xsd:union of memberTypes=\"xsd:decimal xsd:double xsd:float xsd:integer\"."
  {:db/ident         :qudt/valueUnion,
   :dcterms/description
   "A datatype that is the union of numeric xsd data types. \"numericUnion\" is equivalent to the xsd specification that uses an xsd:union of memberTypes=\"xsd:decimal xsd:double xsd:float xsd:integer\".",
   :owl/equivalentClass {:owl/unionOf [:xsd/anySimpleType
                                       :dtype/EnumeratedValue],
                         :rdf/type    :owl/Class},
   :rdf/type         :rdfs/Datatype,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "value union",
   :rdfs/subClassOf  :rdfs/Resource})

(def valueVector
  "A list of the values of elements in a Partial Array."
  {:db/ident     :qudt/valueVector,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "A list of the values of elements in a Partial Array.",
   :rdfs/label   "value vector"})

(def vbName
  "Visual Basic name"
  {:db/ident           :qudt/vbName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Visual Basic name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def vector
  "vector"
  {:db/ident   :qudt/vector,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "vector"})

(def vectorMagnitude
  "vector magnitude"
  {:db/ident         :qudt/vectorMagnitude,
   :rdf/type         [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "vector magnitude",
   :rdfs/range       :xsd/float})

(def visualCue
  "visual cue"
  {:db/ident           :qudt/visualCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "visual cue",
   :rdfs/subPropertyOf :qudt/modalCue})

(def visualCueEnumeration
  "visual cue enumeration"
  {:db/ident           :qudt/visualCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "visual cue enumeration",
   :rdfs/subPropertyOf :qudt/modalCueEnumeration})

(def width
  "width"
  {:db/ident         :qudt/width,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt",
   :rdfs/label       "width",
   :rdfs/range       :xsd/string})

(def xAxisDefinition
  "The definition of the X-Axis could be an intersection, cross-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth, Sun, Moon or other celestial body. An epoch might also be given."
  {:db/ident :qudt/xAxisDefinition,
   :dcterms/description
   "The definition of the X-Axis could be an intersection, cross-product or other function of a  meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth,  Sun, Moon or other celestial body. An epoch might also be given.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "X-Axis Definition",
   :rdfs/range :xsd/string})

(def xCoordinateDefinition
  "X-Coordinate definition"
  {:db/ident         :qudt/xCoordinateDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "X-Coordinate definition",
   :rdfs/range       :xsd/string})

(def yAxisDefinition
  "The definition of the Y-Axis could be an intersection, cross-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth, Sun, Moon or other celestial body. An epoch might also be given."
  {:db/ident :qudt/yAxisDefinition,
   :dcterms/description
   "The definition of the Y-Axis could be an intersection, cross-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth,  Sun, Moon or other celestial body. An epoch might also be given.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Y-Axis definition",
   :rdfs/range :xsd/string})

(def yCoordinateDefinition
  "Y-Coordinate definition"
  {:db/ident         :qudt/yCoordinateDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Y-Coordinate definition",
   :rdfs/range       :xsd/string})

(def yawRotationDefinition
  "Yaw rotation definition"
  {:db/ident           :qudt/yawRotationDefinition,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Yaw rotation definition",
   :rdfs/subPropertyOf :qudt/rotationDefinition})

(def zAxisDefinition
  "The definition of the Y-Axis could be an intersection, croos-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth, Sun, Moon or other celestial body. An epoch might also be given."
  {:db/ident :qudt/zAxisDefinition,
   :dcterms/description
   "The definition of the Y-Axis could be an intersection, croos-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth,  Sun, Moon or other celestial body. An epoch might also be given.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Z-Axis definition",
   :rdfs/range :xsd/string})

(def zCoordinateDefinition
  "Z-Coordinate definition"
  {:db/ident         :qudt/zCoordinateDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Z-Coordinate definition",
   :rdfs/range       :xsd/string})
