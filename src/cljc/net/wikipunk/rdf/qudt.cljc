(ns net.wikipunk.rdf.qudt
  {:namespaces            {"dc11" "http://purl.org/dc/elements/1.1/",
                           "dcterms" "http://purl.org/dc/terms/",
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
   :owl/imports           #{{:xsd/anyURI
                             "http://www.linkedmodel.org/schema/dtype"}
                            {:xsd/anyURI
                             "http://www.linkedmodel.org/schema/vaem"}
                            {:xsd/anyURI
                             "http://www.w3.org/2004/02/skos/core"}},
   :rdf/type              :owl/Ontology,
   :rdfa/prefix           "qudt",
   :rdfa/uri              "http://qudt.org/schema/qudt/",
   :rdfs/label            "QUDT Schema - Version 2.1.35",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-SCHEMA,
   :xsd/anyURI            "http://qudt.org/schema/qudt"}
  (:refer-clojure :exclude [bytes symbol]))

(def AbstractQuantityKind
  {:db/ident         :qudt/AbstractQuantityKind,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Quantity Kind (abstract)",
   :rdfs/subClassOf  #{{:owl/allValuesFrom :qudt/QuantityKind,
                        :owl/onProperty    :skos/broader,
                        :rdf/type          :owl/Restriction}
                       {:owl/minCardinality 0,
                        :owl/onProperty     :qudt/symbol,
                        :rdf/type           :owl/Restriction}
                       {:owl/minCardinality 0,
                        :owl/onProperty     :qudt/latexSymbol,
                        :rdf/type           :owl/Restriction} :qudt/Concept}})

(def AngleUnit
  {:db/ident :qudt/AngleUnit,
   :dcterms/description "All units relating to specification of angles. ",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Angle unit",
   :rdfs/subClassOf :qudt/DimensionlessUnit,
   :skos/exactMatch {:xsd/anyURI
                     "http://dbpedia.org/resource/Category:Units_of_angle"}})

(def Aspect
  {:db/ident :qudt/Aspect,
   :rdf/type :qudt/AspectClass,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "An aspect is an abstract type class that defines properties that can be reused."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "QUDT Aspect",
   :rdfs/subClassOf :owl/Thing})

(def AspectClass
  {:db/ident         :qudt/AspectClass,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Aspect Class",
   :rdfs/subClassOf  :rdfs/Class})

(def BaseDimensionMagnitude
  {:db/ident :qudt/BaseDimensionMagnitude,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://en.wikipedia.org/wiki/Dimensional_analysis"}
     {:xsd/anyURI "http://web.mit.edu/2.25/www/pdf/DA_unified.pdf"}},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<p class=\"lm-para\">A <em>Dimension</em> expresses a magnitude for a base quantiy kind such as mass, length and time.</p>\n<p class=\"lm-para\">DEPRECATED - each exponent is expressed as a property. Keep until a validaiton of this has been done.</p>"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Base Dimension Magnitude",
   :rdfs/subClassOf #{{:owl/allValuesFrom :qudt/QuantityKind,
                       :owl/onProperty    :qudt/hasBaseQuantityKind,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :qudt/vectorMagnitude,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :xsd/float,
                       :owl/onProperty    :qudt/vectorMagnitude,
                       :rdf/type          :owl/Restriction} :qudt/Concept
                      {:owl/cardinality 1,
                       :owl/onProperty  :qudt/hasBaseQuantityKind,
                       :rdf/type        :owl/Restriction}}})

(def BigEndian
  {:db/ident         :qudt/BigEndian,
   :dtype/literal    "big",
   :rdf/type         :qudt/EndianType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Big Endian"})

(def BinaryPrefix
  {:db/ident :qudt/BinaryPrefix,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A <em>Binary Prefix</em> is a prefix for multiples of units in data processing, data transmission, and digital information, notably the bit and the byte, to indicate multiplication by a power of 2.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Binary Prefix",
   :rdfs/subClassOf :qudt/Prefix})

(def BitEncoding
  {:db/ident         :qudt/BitEncoding,
   :qudt/bits        1,
   :rdf/type         :qudt/BitEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Bit Encoding"})

(def BitEncodingType
  {:db/ident :qudt/BitEncodingType,
   :dcterms/description
   "A bit encoding is a correspondence between the two possible values of a bit, 0 or 1, and some interpretation. For example, in a boolean encoding, a bit denotes a truth value, where 0 corresponds to False and 1 corresponds to True.",
   :owl/oneOf [:qudt/BitEncoding],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Bit Encoding",
   :rdfs/subClassOf :qudt/Encoding})

(def BooleanEncoding
  {:db/ident         :qudt/BooleanEncoding,
   :qudt/bits        1,
   :rdf/type         :qudt/BooleanEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Boolean Encoding"})

(def BooleanEncodingType
  {:db/ident         :qudt/BooleanEncodingType,
   :owl/oneOf        [:qudt/BooleanEncoding
                      :qudt/BitEncoding
                      :qudt/OctetEncoding],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Boolean encoding type",
   :rdfs/subClassOf  :qudt/Encoding})

(def ByteEncodingType
  {:db/ident :qudt/ByteEncodingType,
   :dcterms/description
   "This class contains the various ways that information may be encoded into bytes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Byte Encoding",
   :rdfs/subClassOf :qudt/Encoding})

(def CT_COUNTABLY-INFINITE
  {:db/ident :qudt/CT_COUNTABLY-INFINITE,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "A set of numbers is called countably infinite if there is a way to enumerate them.  Formally this is done with a bijection function that associates each number in the set with exactly one of the positive integers.  The set of all fractions is also countably infinite.  In other words, any set \\(X\\) that has the same cardinality as the set of the natural numbers, or \\(| X | \\; =  \\; | \\mathbb N | \\; = \\; \\aleph0\\), is said to be a countably infinite set."},
   :qudt/informativeReference
   {:xsd/anyURI
    "http://www.math.vanderbilt.edu/~schectex/courses/infinity.pdf"},
   :qudt/literal "countable",
   :rdf/type :qudt/CardinalityType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Countably Infinite Cardinality Type"})

(def CT_FINITE
  {:db/ident :qudt/CT_FINITE,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "Any set \\(X\\) with cardinality less than that of the natural numbers, or \\(| X | \\\\; <  \\; | \\\\mathbb N | \\), is said to be a finite set."},
   :qudt/literal "finite",
   :rdf/type :qudt/CardinalityType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Finite Cardinality Type"})

(def CT_UNCOUNTABLE
  {:db/ident :qudt/CT_UNCOUNTABLE,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "Any set with cardinality greater than that of the natural numbers, or \\(| X | \\; >  \\; | \\mathbb N | \\),  for example \\(| R| \\; =  \\;  c  \\; > |\\mathbb N |\\), is said to be uncountable."},
   :qudt/literal "uncountable",
   :rdf/type :qudt/CardinalityType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Uncountable Cardinality Type"})

(def CardinalityType
  {:db/ident :qudt/CardinalityType,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "In mathematics, the cardinality of a set is a measure of the number of elements of the set.  For example, the set \\(A = {2, 4, 6}\\) contains 3 elements, and therefore \\(A\\) has a cardinality of 3. There are two approaches to cardinality – one which compares sets directly using bijections and injections, and another which uses cardinal numbers."},
   :owl/oneOf
   [:qudt/CT_COUNTABLY-INFINITE :qudt/CT_FINITE :qudt/CT_UNCOUNTABLE],
   :qudt/informativeReference
   #{{:xsd/anyURI "http://en.wikipedia.org/wiki/Cardinality"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Cardinal_number"}},
   :qudt/plainTextDescription
   "In mathematics, the cardinality of a set is a measure of the number of elements of the set.  For example, the set 'A = {2, 4, 6}' contains 3 elements, and therefore 'A' has a cardinality of 3. There are two approaches to cardinality – one which compares sets directly using bijections and injections, and another which uses cardinal numbers.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Cardinality Type",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/literal,
                       :rdf/type           :owl/Restriction}
                      :qudt/EnumeratedValue}})

(def CharEncoding
  {:db/ident         :qudt/CharEncoding,
   :dc11/description "7 bits of 1 octet",
   :qudt/bytes       1,
   :rdf/type         #{:qudt/BooleanEncodingType :qudt/CharEncodingType},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Char Encoding"})

(def CharEncodingType
  {:db/ident :qudt/CharEncodingType,
   :dcterms/description
   "The class of all character encoding schemes, each of which defines a rule or algorithm for encoding character data as a sequence of bits or bytes.",
   :owl/oneOf [:qudt/CharEncoding],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Char Encoding Type",
   :rdfs/subClassOf :qudt/Encoding})

(def Citation
  {:db/ident         :qudt/Citation,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/type  :rdf/HTML,
                      :rdf/value "Provides a simple way of making citations."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Citation",
   :rdfs/subClassOf  #{{:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/url,
                        :rdf/type           :owl/Restriction}
                       {:owl/cardinality 1,
                        :owl/onProperty  :dcterms/description,
                        :rdf/type        :owl/Restriction} :qudt/Concept}})

(def Comment
  {:db/ident         :qudt/Comment,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Comment",
   :rdfs/subClassOf  #{{:owl/minCardinality 0,
                        :owl/onProperty     :qudt/rationale,
                        :rdf/type           :owl/Restriction} :owl/Thing
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :dcterms/description,
                        :rdf/type           :owl/Restriction}
                       :qudt/Verifiable}})

(def Concept
  {:db/ident         :qudt/Concept,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/type  :rdf/HTML,
                      :rdf/value "The root class for all QUDT concepts."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "QUDT Concept",
   :rdfs/subClassOf  #{{:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/deprecated,
                        :rdf/type           :owl/Restriction}
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/id,
                        :rdf/type           :owl/Restriction} :owl/Thing
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/abbreviation,
                        :rdf/type           :owl/Restriction}
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :dcterms/description,
                        :rdf/type           :owl/Restriction}
                       {:owl/allValuesFrom :qudt/Rule,
                        :owl/onProperty    :qudt/hasRule,
                        :rdf/type          :owl/Restriction}
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :dcterms/isReplacedBy,
                        :rdf/type           :owl/Restriction}
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/plainTextDescription,
                        :rdf/type           :owl/Restriction}}})

(def ConstantValue
  {:db/ident         :qudt/ConstantValue,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/type  :rdf/HTML,
                      :rdf/value "Used to specify the values of a constant."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Constant value",
   :rdfs/subClassOf  #{{:owl/minCardinality 0,
                        :owl/onProperty     :qudt/exactConstant,
                        :rdf/type           :owl/Restriction}
                       :qudt/QuantityValue}})

(def CountingUnit
  {:db/ident :qudt/CountingUnit,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "Used for all units that express counts. Examples are Atomic Number, Number, Number per Year, Percent and Sample per Second."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Counting Unit",
   :rdfs/subClassOf :qudt/DimensionlessUnit})

(def CurrencyUnit
  {:db/ident :qudt/CurrencyUnit,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/type  :rdf/HTML,
      :rdf/value "Used for all units that express currency."}
     {:rdf/type :rdf/HTML,
      :rdf/value
      "Currency Units have their own subclass of unit because: (a) they have additonal properites such as 'country' and (b) their URIs do not conform to the same rules as other units."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Currency Unit",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/currencyExponent,
                       :rdf/type           :owl/Restriction}
                      :qudt/DimensionlessUnit}})

(def DataEncoding
  {:db/ident :qudt/DataEncoding,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<p><em>Data Encoding</em> expresses the properties that specify how data is represented at the bit and byte level. These properties are applicable to describing raw data.</p>"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Data Encoding",
   :rdfs/subClassOf #{{:owl/allValuesFrom :qudt/Encoding,
                       :owl/onProperty    :qudt/encoding,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/EndianType,
                       :owl/onProperty    :qudt/bitOrder,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/byteOrder,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/encoding,
                       :rdf/type           :owl/Restriction} :qudt/Aspect
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/bitOrder,
                       :rdf/type           :owl/Restriction}}})

(def Datatype
  {:db/ident :qudt/Datatype,
   :dcterms/description
   "A data type is a definition of a set of values (for example, \"all integers between 0 and 10\"), and the allowable operations on those values; the meaning of the data; and the way values of that type can be stored. Some types are primitive - built-in to the language, with no visible internal structure - e.g. Boolean; others are composite - constructed from one or more other types (of either kind) - e.g. lists, arrays, structures, unions. Object-oriented programming extends this with classes which encapsulate both the structure of a type and the operations that can be performed on it. Some languages provide strong typing, others allow implicit type conversion and/or explicit type conversion.",
   :qudt/informativeReference
   #{{:xsd/anyURI "http://en.wikipedia.org/wiki/Data_type"}
     {:xsd/anyURI "http://foldoc.org/data+type"}
     {:xsd/anyURI
      "http://www.princeton.edu/~achaney/tmve/wiki100k/docs/Data_type.html"}},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "QUDT Datatype",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/ansiSQLName,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/OrderedType,
                       :owl/onProperty    :qudt/orderedType,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/basis,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/vbName,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/oracleSQLName,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/protocolBuffersName,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/matlabName,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/cName,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/orderedType,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Datatype,
                       :owl/onProperty    :qudt/basis,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/mySQLName,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/cardinality,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/pythonName,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/microsoftSQLServerName,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/odbcName,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/jsName,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/javaName,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/bounded,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/oleDBName,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/CardinalityType,
                       :owl/onProperty    :qudt/cardinality,
                       :rdf/type          :owl/Restriction} :qudt/Concept}})

(def DateTimeStringEncodingType
  {:db/ident :qudt/DateTimeStringEncodingType,
   :dcterms/description
   "Date Time encodings are logical encodings for expressing date/time quantities as strings by applying unambiguous formatting and parsing rules.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Date Time String Encoding Type",
   :rdfs/subClassOf #{{:owl/minCardinality 1,
                       :owl/onProperty     :qudt/allowedPattern,
                       :rdf/type           :owl/Restriction}
                      :qudt/StringEncodingType}})

(def DecimalPrefix
  {:db/ident :qudt/DecimalPrefix,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A <em>Decimal Prefix</em> is a prefix for multiples of units that are powers of 10.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Decimal Prefix",
   :rdfs/subClassOf :qudt/Prefix})

(def DerivedUnit
  {:db/ident :qudt/DerivedUnit,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Category:SI_derived_units"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A DerivedUnit is a type specification for units that are derived from other units."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Derived Unit",
   :rdfs/subClassOf :qudt/Unit})

(def DimensionlessUnit
  {:db/ident :qudt/DimensionlessUnit,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A Dimensionless Unit is a quantity for which all the exponents of the factors corresponding to the base quantities in its quantity dimension are zero."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Dimensionless Unit",
   :rdfs/subClassOf :qudt/Unit})

(def Discipline
  {:db/ident         :qudt/Discipline,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Discipline",
   :rdfs/subClassOf  :qudt/Concept})

(def DoublePrecisionEncoding
  {:db/ident         :qudt/DoublePrecisionEncoding,
   :qudt/bytes       64,
   :rdf/type         :qudt/FloatingPointEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Single Precision Real Encoding"})

(def Encoding
  {:db/ident :qudt/Encoding,
   :dcterms/description
   "An encoding is a rule or algorithm that is used to convert data from a native, or unspecified form into a specific form that satisfies the encoding rules. Examples of encodings include character encodings, such as UTF-8.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Encoding",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/bytes,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/bits,
                       :rdf/type           :owl/Restriction} :qudt/Concept}})

(def EndianType
  {:db/ident         :qudt/EndianType,
   :owl/oneOf        [:qudt/LittleEndian :qudt/BigEndian],
   :qudt/informativeReference {:xsd/anyURI
                               "http://en.wikipedia.org/wiki/Endianness"},
   :qudt/plainTextDescription
   "In computing, endianness is the ordering used to represent some kind of data as a sequence of smaller units. Typical cases are the order in which integer values are stored as bytes in computer memory (relative to a given memory addressing scheme) and the transmission order over a network or other medium. When specifically talking about bytes, endianness is also referred to simply as byte order.  Most computer processors simply store integers as sequences of bytes, so that, conceptually, the encoded value can be obtained by simple concatenation. For an 'n-byte' integer value this allows 'n!' (n factorial) possible representations (one for each byte permutation). The two most common of them are: increasing numeric significance with increasing memory addresses, known as little-endian, and its opposite, called big-endian.",
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Endian Type",
   :rdfs/subClassOf  :qudt/EnumeratedValue})

(def EnumeratedQuantity
  {:db/ident        :qudt/EnumeratedQuantity,
   :rdf/type        :qudt/AspectClass,
   :rdfs/label      "Enumerated Quantity",
   :rdfs/subClassOf #{{:owl/allValuesFrom :qudt/Enumeration,
                       :owl/onProperty    :qudt/enumeration,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/EnumeratedValue,
                       :owl/onProperty    :qudt/enumeratedValue,
                       :rdf/type          :owl/Restriction} :qudt/Concept}})

(def EnumeratedValue
  {:db/ident :qudt/EnumeratedValue,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<p>This class is for all enumerated and/or coded values.  For example, it contains the dimension objects that are the basis elements in some abstract vector space associated with a quantity kind system. Another use is for the base dimensions for quantity systems. Each quantity kind system that defines a base set has a corresponding ordered enumeration whose elements are the dimension objects for the base quantity kinds. The order of the dimensions in the enumeration determines the canonical order of the basis elements in the corresponding abstract vector space.</p>\n\n<p>An enumeration is a set of literals from which a single value is selected. Each literal can have a tag as an integer within a standard encoding appropriate to the range of integer values. Consistency of enumeration types will allow them, and the enumerated values, to be referred to unambiguously either through symbolic name or encoding. Enumerated values are also controlled vocabularies and as such need to be standardized. Without this consistency enumeration literals can be stated differently and result in  data conflicts and misinterpretations.</p>\n\n<p>The tags are a set of positive whole numbers, not necessarily contiguous and having no numerical significance, each corresponding to the associated literal identifier. An order attribute can also be given on the enumeration elements. An enumeration can itself be a member of an enumeration. This allows enumerations to be enumerated in a selection. Enumerations are also subclasses of Scalar Datatype. This allows them to be used as the reference of a datatype specification.</p>"},
   :qudt/informativeReference {:xsd/anyURI
                               "http://en.wikipedia.org/wiki/Enumeration"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Enumerated Value",
   :rdfs/subClassOf
   #{{:owl/maxCardinality 1,
      :owl/onProperty     :qudt/symbol,
      :rdf/type           :owl/Restriction} :dtype/EnumeratedValue
     {:owl/maxCardinality 1,
      :owl/onProperty     :qudt/abbreviation,
      :rdf/type           :owl/Restriction}
     {:owl/maxCardinality 1,
      :owl/onProperty     :dcterms/description,
      :rdf/type           :owl/Restriction} :qudt/Verifiable :qudt/Concept}})

(def Enumeration
  {:db/ident :qudt/Enumeration,
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Enumeration"},
   :qudt/informativeReference
   #{{:xsd/anyURI "http://en.wikipedia.org/wiki/Enumeration"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Enumerated_type"}},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<p>An enumeration is a set of literals from which a single value is selected. Each literal can have a tag as an integer within a standard encoding appropriate to the range of integer values. Consistency of enumeration types will allow them, and the enumerated values, to be referred to unambiguously either through symbolic name or encoding. Enumerated values are also controlled vocabularies and as such need to be standardized. Without this consistency enumeration literals can be stated differently and result in  data conflicts and misinterpretations.</p>\n\n<p>The tags are a set of positive whole numbers, not necessarily contiguous and having no numerical significance, each corresponding to the associated literal identifier. An order attribute can also be given on the enumeration elements. An enumeration can itself be a member of an enumeration. This allows enumerations to be enumerated in a selection. Enumerations are also subclasses of <em>Scalar Datatype</em>. This allows them to be used as the reference of a datatype specification.</p>"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Enumeration",
   :rdfs/subClassOf #{:dtype/Enumeration
                      {:owl/allValuesFrom :qudt/EnumeratedValue,
                       :owl/onProperty    :qudt/default,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/abbreviation,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/EnumeratedValue,
                       :owl/onProperty    :qudt/element,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/default,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :qudt/element,
                       :rdf/type           :owl/Restriction} :qudt/Concept}})

(def EnumerationScale
  {:db/ident         :qudt/EnumerationScale,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Enumeration scale",
   :rdfs/subClassOf  #{:dtype/Enumeration :qudt/Scale}})

(def Figure
  {:db/ident         :qudt/Figure,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Figure",
   :rdfs/subClassOf  #{{:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/figureLabel,
                        :rdf/type           :owl/Restriction}
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/width,
                        :rdf/type           :owl/Restriction}
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/height,
                        :rdf/type           :owl/Restriction}
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/image,
                        :rdf/type           :owl/Restriction}
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/landscape,
                        :rdf/type           :owl/Restriction}
                       {:owl/cardinality 1,
                        :owl/onProperty  :qudt/imageLocation,
                        :rdf/type        :owl/Restriction}
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/figureCaption,
                        :rdf/type           :owl/Restriction} :qudt/Concept}})

(def FloatingPointEncodingType
  {:db/ident :qudt/FloatingPointEncodingType,
   :dcterms/description
   "A \"Encoding\" with the following instance(s): \"Double Precision Encoding\", \"Single Precision Real Encoding\".",
   :owl/oneOf [:qudt/DoublePrecisionEncoding
               :qudt/IEEE754_1985RealEncoding
               :qudt/SinglePrecisionRealEncoding],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Floating Point Encoding",
   :rdfs/subClassOf :qudt/Encoding})

(def IEEE754_1985RealEncoding
  {:db/ident         :qudt/IEEE754_1985RealEncoding,
   :qudt/bytes       32,
   :rdf/type         :qudt/FloatingPointEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "IEEE 754 1985 Real Encoding"})

(def ISO8601-UTCDateTime-BasicFormat
  {:db/ident         :qudt/ISO8601-UTCDateTime-BasicFormat,
   :qudt/allowedPattern
   #{"[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}Z"
     "[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}.[0-9]+Z"},
   :rdf/type         :qudt/DateTimeStringEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "ISO 8601 UTC Date Time - Basic Format"})

(def IntegerEncodingType
  {:db/ident            :qudt/IntegerEncodingType,
   :dcterms/description "The encoding scheme for integer types",
   :owl/oneOf           [:qudt/LongUnsignedIntegerEncoding
                         :qudt/ShortUnsignedIntegerEncoding
                         :qudt/ShortUnsignedIntegerEncoding
                         :qudt/SignedIntegerEncoding
                         :qudt/UnsignedIntegerEncoding],
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label          "Integer Encoding",
   :rdfs/subClassOf     :qudt/Encoding})

(def IntervalScale
  {:db/ident :qudt/IntervalScale,
   :qudt/informativeReference
   {:xsd/anyURI "https://en.wikipedia.org/wiki/Level_of_measurement"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/type :rdf/HTML,
      :rdf/value
      "<p>The interval type allows for the degree of difference between items, but not the ratio between them. Examples include temperature with the Celsius scale, which has two defined points (the freezing and boiling point of water at specific conditions) and then separated into 100 intervals, date when measured from an arbitrary epoch (such as AD), percentage such as a percentage return on a stock,[16] location in Cartesian coordinates, and direction measured in degrees from true or magnetic north. Ratios are not meaningful since 20 °C cannot be said to be \"twice as hot\" as 10 °C, nor can multiplication/division be carried out between any two dates directly. However, ratios of differences can be expressed; for example, one difference can be twice another. Interval type variables are sometimes also called \"scaled variables\", but the formal mathematical term is an affine space (in this case an affine line).</p>\n<p>Characteristics: median, percentile &amp; Monotonic increasing (order (&lt;) &amp; totally ordered set</p>"}
     {:rdf/type :rdf/HTML,
      :rdf/value
      "median, percentile & Monotonic increasing (order (<)) & totally ordered set"}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Interval scale",
   :rdfs/seeAlso #{:qudt/NominalScale :qudt/RatioScale :qudt/OrdinalScale},
   :rdfs/subClassOf :qudt/Scale})

(def LatexString
  {:db/ident :qudt/LatexString,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A type of string in which some characters may be wrapped with '\\(' and '\\) characters for LaTeX rendering.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Latex String",
   :rdfs/subClassOf :xsd/string})

(def LittleEndian
  {:db/ident         :qudt/LittleEndian,
   :dtype/literal    "little",
   :rdf/type         :qudt/EndianType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Little Endian"})

(def LogarithmicUnit
  {:db/ident :qudt/LogarithmicUnit,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "Logarithmic units are abstract mathematical units that can be used to express any quantities (physical or mathematical) that are defined on a logarithmic scale, that is, as being proportional to the value of a logarithm function. Examples of logarithmic units include common units of information and entropy, such as the bit, and the byte, as well as units of relative signal strength magnitude such as the decibel."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Logarithmic Unit",
   :rdfs/subClassOf :qudt/DimensionlessUnit})

(def LongUnsignedIntegerEncoding
  {:db/ident         :qudt/LongUnsignedIntegerEncoding,
   :qudt/bytes       8,
   :rdf/type         :qudt/IntegerEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Long Unsigned Integer Encoding"})

(def MathsFunctionType
  {:db/ident         :qudt/MathsFunctionType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Maths Function Type",
   :rdfs/subClassOf  :qudt/Concept})

(def NIST_SP811_Comment
  {:db/ident :qudt/NIST_SP811_Comment,
   :dc11/description
   "National Institute of Standards and Technology (NIST) Special Publication 811 Comments on some quantities and their units",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "NIST SP~811 Comment",
   :rdfs/subClassOf :qudt/Comment})

(def NominalScale
  {:db/ident :qudt/NominalScale,
   :qudt/informativeReference
   {:xsd/anyURI "https://en.wikipedia.org/wiki/Level_of_measurement"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A nominal scale differentiates between items or subjects based only on their names or (meta-)categories and other qualitative classifications they belong to; thus dichotomous data involves the construction of classifications as well as the classification of items. Discovery of an exception to a classification can be viewed as progress. Numbers may be used to represent the variables but the numbers do not have numerical value or relationship: For example, a Globally unique identifier. Examples of these classifications include gender, nationality, ethnicity, language, genre, style, biological species, and form. In a university one could also use hall of affiliation as an example."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Nominal scale",
   :rdfs/seeAlso #{:qudt/IntervalScale :qudt/RatioScale :qudt/OrdinalScale},
   :rdfs/subClassOf :qudt/Scale})

(def NumericUnion
  {:db/ident        :qudt/NumericUnion,
   :rdf/type        :owl/Class,
   :rdfs/label      "Numeric union",
   :rdfs/subClassOf #{:dtype/numericUnion :qudt/Concept}})

(def OctetEncoding
  {:db/ident         :qudt/OctetEncoding,
   :qudt/bytes       1,
   :rdf/type         #{:qudt/ByteEncodingType :qudt/BooleanEncodingType},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "OCTET Encoding"})

(def OrderedType
  {:db/ident :qudt/OrderedType,
   :dcterms/description
   "Describes how a data or information structure is ordered.",
   :owl/oneOf [:qudt/Unordered :qudt/PartiallyOrdered :qudt/TotallyOrdered],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Ordered type",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/literal,
                       :rdf/type           :owl/Restriction}
                      :qudt/EnumeratedValue}})

(def OrdinalScale
  {:db/ident :qudt/OrdinalScale,
   :qudt/informativeReference
   {:xsd/anyURI "https://en.wikipedia.org/wiki/Level_of_measurement"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The ordinal type allows for rank order (1st, 2nd, 3rd, etc.) by which data can be sorted, but still does not allow for relative degree of difference between them. Examples include, on one hand, dichotomous data with dichotomous (or dichotomized) values such as 'sick' vs. 'healthy' when measuring health, 'guilty' vs. 'innocent' when making judgments in courts, 'wrong/false' vs. 'right/true' when measuring truth value, and, on the other hand, non-dichotomous data consisting of a spectrum of values, such as 'completely agree', 'mostly agree', 'mostly disagree', 'completely disagree' when measuring opinion."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Ordinal scale",
   :rdfs/seeAlso #{:qudt/IntervalScale :qudt/NominalScale :qudt/RatioScale},
   :rdfs/subClassOf #{{:owl/cardinality 1,
                       :owl/onProperty  :qudt/order,
                       :rdf/type        :owl/Restriction} :qudt/Scale}})

(def Organization
  {:db/ident         :qudt/Organization,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Organization",
   :rdfs/subClassOf  #{{:owl/minCardinality 0,
                        :owl/onProperty     :qudt/url,
                        :rdf/type           :owl/Restriction} :qudt/Concept}})

(def PartiallyOrdered
  {:db/ident         :qudt/PartiallyOrdered,
   :qudt/literal     "partial",
   :qudt/plainTextDescription "Partial ordered structure.",
   :rdf/type         :qudt/OrderedType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Partially Ordered"})

(def PhysicalConstant
  {:db/ident :qudt/PhysicalConstant,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Physical_constant"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A physical constant is a physical quantity that is generally believed to be both universal in nature and constant in time. It can be contrasted with a mathematical constant, which is a fixed numerical value but does not directly involve any physical measurement. There are many physical constants in science, some of the most widely recognized being the speed of light in vacuum c, Newton's gravitational constant G, Planck's constant h, the electric permittivity of free space ε0, and the elementary charge e. Physical constants can take many dimensional forms, or may be dimensionless depending on the system of quantities and units used."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Physical Constant",
   :rdfs/subClassOf #{{:owl/allValuesFrom :qudt/Unit,
                       :owl/onProperty    :qudt/applicableUnit,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/SystemOfUnits,
                       :owl/onProperty    :qudt/applicableSystem,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/PhysicalConstant,
                       :owl/onProperty    :qudt/exactMatch,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/isoNormativeReference,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/normativeReference,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/symbol,
                       :rdf/type           :owl/Restriction} :qudt/Quantity
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/latexSymbol,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/mathMLdefinition,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/ucumCode,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKindDimensionVector,
                       :owl/onProperty    :qudt/hasDimensionVector,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/dbpediaMatch,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/latexDefinition,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :xsd/boolean,
                       :owl/onProperty    :qudt/exactConstant,
                       :rdf/type          :owl/Restriction}}})

(def PlaneAngleUnit
  {:db/ident         :qudt/PlaneAngleUnit,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Plane Angle Unit",
   :rdfs/subClassOf  :qudt/AngleUnit})

(def Prefix
  {:db/ident         :qudt/Prefix,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Prefix",
   :rdfs/subClassOf  #{{:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/prefixMultiplier,
                        :rdf/type           :owl/Restriction}
                       {:owl/minCardinality 0,
                        :owl/onProperty     :qudt/symbol,
                        :rdf/type           :owl/Restriction}
                       {:owl/minCardinality 0,
                        :owl/onProperty     :qudt/latexSymbol,
                        :rdf/type           :owl/Restriction}
                       {:owl/allValuesFrom :qudt/UCUMcs-term,
                        :owl/onProperty    :qudt/ucumCode,
                        :rdf/type          :owl/Restriction}
                       {:owl/allValuesFrom :qudt/Prefix,
                        :owl/onProperty    :qudt/exactMatch,
                        :rdf/type          :owl/Restriction} :qudt/Verifiable
                       :qudt/Concept}})

(def Quantifiable
  {:db/ident :qudt/Quantifiable,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<p><em>Quantifiable</em> ascribes to some thing the capability of being measured, observed, or counted.</p>"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Quantifiable",
   :rdfs/subClassOf #{{:owl/allValuesFrom :qudt/DataEncoding,
                       :owl/onProperty    :qudt/dataEncoding,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/unit,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :xsd/double,
                       :owl/onProperty    :qudt/standardUncertainty,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/hasUnit,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Unit,
                       :owl/onProperty    :qudt/unit,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Unit,
                       :owl/onProperty    :qudt/hasUnit,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/relativeStandardUncertainty,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/dataType,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :xsd/double,
                       :owl/onProperty    :qudt/relativeStandardUncertainty,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/standardUncertainty,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/dataEncoding,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/value,
                       :rdf/type           :owl/Restriction} :qudt/Aspect
                      {:owl/allValuesFrom :qudt/Datatype,
                       :owl/onProperty    :qudt/dataType,
                       :rdf/type          :owl/Restriction}}})

(def Quantity
  {:db/ident :qudt/Quantity,
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Quantity"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<p class=\"lm-para\">A <b>quantity</b> is the measurement of an observable property of a particular object, event, or physical system. A quantity is always associated with the context of measurement (i.e. the thing measured, the measured value, the accuracy of measurement, etc.) whereas the underlying <b>quantity kind</b> is independent of any particular measurement. Thus, length is a quantity kind while the height of a rocket is a specific quantity of length; its magnitude that may be expressed in meters, feet, inches, etc. Examples of physical quantities include physical constants, such as the speed of light in a vacuum, Planck's constant, the electric permittivity of free space, and the fine structure constant. </p>\n\n<p class=\"lm-para\">In other words, quantities are quantifiable aspects of the world, such as the duration of a movie, the distance between two points, velocity of a car, the pressure of the atmosphere, and a person's weight; and units are used to describe their numerical measure. \n\n<p class=\"lm-para\">Many <b>quantity kinds</b> are related to each other by various physical laws, and as a result, the associated units of some quantity kinds can be expressed as products (or ratios) of powers of other quantity kinds (e.g., momentum is mass times velocity and velocity is defined as distance divided by time). In this way, some quantities can be calculated from other measured quantities using their associations to the quantity kinds in these expressions. These quantity kind relationships are also discussed in dimensional analysis. Those that cannot be so expressed can be regarded as \"fundamental\" in this sense.</p>\n<p class=\"lm-para\">A quantity is distinguished from a \"quantity kind\" in that the former carries a value and the latter is a type specifier.</p>"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Quantity",
   :rdfs/subClassOf #{:qudt/Quantifiable
                      {:owl/allValuesFrom :xsd/boolean,
                       :owl/onProperty    :qudt/isDeltaQuantity,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityValue,
                       :owl/onProperty    :qudt/quantityValue,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/hasQuantityKind,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKind,
                       :owl/onProperty    :qudt/hasQuantityKind,
                       :rdf/type          :owl/Restriction} :qudt/Concept}})

(def QuantityKind
  {:db/ident :qudt/QuantityKind,
   :qudt/informativeReference
   {:xsd/anyURI
    "http://www.electropedia.org/iev/iev.nsf/display?openform&ievref=112-01-04"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A <b>Quantity Kind</b> is any observable property that can be  measured and quantified numerically. Familiar examples include physical properties such as length, mass, time, force, energy, power, electric charge, etc. Less familiar examples include currency, interest rate, price to earning ratio, and information capacity."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Quantity Kind",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/dimensionVectorForSI,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :qudt/QuantityKindDimensionVector,
                       :owl/onProperty :qudt/qkdvDenominator,
                       :rdf/type       :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/applicableSIUnit,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/applicableCGSUnit,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :xsd/string,
                       :owl/onProperty    :qudt/iec61360Code,
                       :rdf/type          :owl/Restriction}
                      :qudt/AbstractQuantityKind
                      {:owl/allValuesFrom :qudt/QuantityKind,
                       :owl/onProperty    :qudt/exactMatch,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/applicableUSCustomaryUnit,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/mathMLdefinition,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/applicableISOUnit,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKind,
                       :owl/onProperty    :qudt/generalization,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKindDimensionVector_SI,
                       :owl/onProperty    :qudt/dimensionVectorForSI,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/generalization,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKindDimensionVector,
                       :owl/onProperty    :qudt/hasDimensionVector,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :qudt/QuantityKindDimensionVector,
                       :owl/onProperty :qudt/qkdvNumerator,
                       :rdf/type       :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/applicableImperialUnit,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/applicableUnit,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/latexDefinition,
                       :rdf/type           :owl/Restriction} :qudt/Verifiable}})

(def QuantityKindDimensionVector
  {:db/ident :qudt/QuantityKindDimensionVector,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://en.wikipedia.org/wiki/Dimensional_analysis"}
     {:xsd/anyURI "http://web.mit.edu/2.25/www/pdf/DA_unified.pdf"}},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<p class=\"lm-para\">A  <em>Quantity Kind Dimension Vector</em> describes the dimensionality of a quantity kind in the context of a system of units. In the SI system of units, the dimensions of a quantity kind are expressed as a product of the basic physical dimensions mass (\\(M\\)), length (\\(L\\)), time (\\(T\\)) current (\\(I\\)), amount of substance (\\(N\\)), luminous intensity (\\(J\\)) and absolute temperature (\\(\\theta\\)) as \\(dim \\, Q = L^{\\alpha} \\, M^{\\beta} \\, T^{\\gamma} \\, I ^{\\delta} \\, \\theta ^{\\epsilon} \\, N^{\\eta} \\, J ^{\\nu}\\).</p>\n\n<p class=\"lm-para\">The rational powers of the dimensional exponents, \\(\\alpha, \\, \\beta, \\, \\gamma, \\, \\delta, \\, \\epsilon, \\, \\eta, \\, \\nu\\), are positive, negative, or zero.</p>\n\n<p class=\"lm-para\">For example, the dimension of the physical quantity kind \\(\\it{speed}\\) is \\(\\boxed{length/time}\\), \\(L/T\\) or \\(LT^{-1}\\), and the dimension of the physical quantity kind force is \\(\\boxed{mass \\times acceleration}\\) or \\(\\boxed{mass \\times (length/time)/time}\\), \\(ML/T^2\\) or \\(MLT^{-2}\\) respectively.</p>"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Quantity Kind Dimension Vector",
   :rdfs/subClassOf
   #{{:owl/cardinality 1,
      :owl/onProperty  :qudt/dimensionExponentForTime,
      :rdf/type        :owl/Restriction}
     {:owl/cardinality 1,
      :owl/onProperty  :qudt/dimensionExponentForElectricCurrent,
      :rdf/type        :owl/Restriction}
     {:owl/cardinality 1,
      :owl/onProperty  :qudt/dimensionExponentForThermodynamicTemperature,
      :rdf/type        :owl/Restriction}
     {:owl/allValuesFrom :qudt/QuantityKind,
      :owl/onProperty    :qudt/hasReferenceQuantityKind,
      :rdf/type          :owl/Restriction}
     {:owl/cardinality 1,
      :owl/onProperty  :qudt/dimensionExponentForLength,
      :rdf/type        :owl/Restriction}
     {:owl/cardinality 1,
      :owl/onProperty  :qudt/dimensionlessExponent,
      :rdf/type        :owl/Restriction}
     {:owl/cardinality 1,
      :owl/onProperty  :qudt/dimensionExponentForMass,
      :rdf/type        :owl/Restriction}
     {:owl/minCardinality 0,
      :owl/onProperty     :qudt/latexSymbol,
      :rdf/type           :owl/Restriction}
     {:owl/cardinality 1,
      :owl/onProperty  :qudt/dimensionExponentForAmountOfSubstance,
      :rdf/type        :owl/Restriction}
     {:owl/cardinality 1,
      :owl/onProperty  :qudt/dimensionExponentForLuminousIntensity,
      :rdf/type        :owl/Restriction}
     {:owl/maxCardinality 1,
      :owl/onProperty     :qudt/latexDefinition,
      :rdf/type           :owl/Restriction} :qudt/Concept}})

(def QuantityKindDimensionVector_CGS
  {:db/ident :qudt/QuantityKindDimensionVector_CGS,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A <em>CGS Dimension Vector</em> is used to specify the dimensions for a C.G.S. quantity kind."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "CGS Dimension vector",
   :rdfs/subClassOf :qudt/QuantityKindDimensionVector})

(def QuantityKindDimensionVector_CGS-EMU
  {:db/ident :qudt/QuantityKindDimensionVector_CGS-EMU,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A <em>CGS EMU Dimension Vector</em> is used to specify the dimensions for EMU C.G.S. quantity kind."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "CGS EMU Dimension vector",
   :rdfs/subClassOf :qudt/QuantityKindDimensionVector_CGS})

(def QuantityKindDimensionVector_CGS-ESU
  {:db/ident :qudt/QuantityKindDimensionVector_CGS-ESU,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A <em>CGS ESU Dimension Vector</em> is used to specify the dimensions for ESU C.G.S. quantity kind."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "CGS ESU Dimension vector",
   :rdfs/subClassOf :qudt/QuantityKindDimensionVector_CGS})

(def QuantityKindDimensionVector_CGS-GAUSS
  {:db/ident :qudt/QuantityKindDimensionVector_CGS-GAUSS,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A <em>CGS GAUSS Dimension Vector</em> is used to specify the dimensions for Gaussioan C.G.S. quantity kind."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "CGS GAUSS Dimension vector",
   :rdfs/subClassOf :qudt/QuantityKindDimensionVector_CGS})

(def QuantityKindDimensionVector_CGS-LH
  {:db/ident :qudt/QuantityKindDimensionVector_CGS-LH,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A <em>CGS LH Dimension Vector</em> is used to specify the dimensions for Lorentz-Heaviside C.G.S. quantity kind."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "CGS LH Dimension vector",
   :rdfs/subClassOf :qudt/QuantityKindDimensionVector_CGS})

(def QuantityKindDimensionVector_ISO
  {:db/ident         :qudt/QuantityKindDimensionVector_ISO,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "ISO Dimension vector",
   :rdfs/subClassOf  :qudt/QuantityKindDimensionVector})

(def QuantityKindDimensionVector_Imperial
  {:db/ident         :qudt/QuantityKindDimensionVector_Imperial,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Imperial dimension vector",
   :rdfs/subClassOf  :qudt/QuantityKindDimensionVector})

(def QuantityKindDimensionVector_SI
  {:db/ident         :qudt/QuantityKindDimensionVector_SI,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Quantity Kind Dimension vector (SI)",
   :rdfs/subClassOf  :qudt/QuantityKindDimensionVector})

(def QuantityType
  {:db/ident :qudt/QuantityType,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "\\(\\textit{Quantity Type}\\) is an enumeration of quanity kinds. It specializes \\(\\boxed{dtype:EnumeratedValue}\\) by constrinaing \\(\\boxed{dtype:value}\\) to instances of \\(\\boxed{qudt:QuantityKind}\\)."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Quantity type",
   :rdfs/subClassOf #{{:owl/allValuesFrom :qudt/QuantityKind,
                       :owl/onProperty    :dtype/value,
                       :rdf/type          :owl/Restriction}
                      :qudt/EnumeratedValue}})

(def QuantityValue
  {:db/ident :qudt/QuantityValue,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A <i>Quantity Value</i> expresses the magnitude and kind of a quantity and is given by the product of a numerical value <code>n</code> and a unit of measure <code>U</code>. The number multiplying the unit is referred to as the numerical value of the quantity expressed in that unit. Refer to <a href=\"http://physics.nist.gov/Pubs/SP811/sec07.html\">NIST SP 811 section 7</a> for more on quantity values."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Quantity value",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/unit,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/hasUnit,
                       :rdf/type           :owl/Restriction} :qudt/Quantifiable
                      :qudt/Concept}})

(def RatioScale
  {:db/ident :qudt/RatioScale,
   :qudt/informativeReference
   {:xsd/anyURI "https://en.wikipedia.org/wiki/Level_of_measurement"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The ratio type takes its name from the fact that measurement is the estimation of the ratio between a magnitude of a continuous quantity and a unit magnitude of the same kind (Michell, 1997, 1999). A ratio scale possesses a meaningful (unique and non-arbitrary) zero value. Most measurement in the physical sciences and engineering is done on ratio scales. Examples include mass, length, duration, plane angle, energy and electric charge. In contrast to interval scales, ratios are now meaningful because having a non-arbitrary zero point makes it meaningful to say, for example, that one object has \"twice the length\" of another (= is \"twice as long\"). Very informally, many ratio scales can be described as specifying \"how much\" of something (i.e. an amount or magnitude) or \"how many\" (a count). The Kelvin temperature scale is a ratio scale because it has a unique, non-arbitrary zero point called absolute zero."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Ratio scale",
   :rdfs/seeAlso #{:qudt/IntervalScale :qudt/NominalScale :qudt/OrdinalScale},
   :rdfs/subClassOf :qudt/Scale})

(def Rule
  {:db/ident         :qudt/Rule,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Rule",
   :rdfs/subClassOf  #{{:owl/minCardinality 0,
                        :owl/onProperty     :qudt/rationale,
                        :rdf/type           :owl/Restriction}
                       {:owl/allValuesFrom :qudt/RuleType,
                        :owl/onProperty    :qudt/ruleType,
                        :rdf/type          :owl/Restriction} :qudt/Verifiable
                       :qudt/Concept}})

(def RuleType
  {:db/ident         :qudt/RuleType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Rule Type",
   :rdfs/subClassOf  :qudt/EnumeratedValue})

(def SIGNED
  {:db/ident         :qudt/SIGNED,
   :dtype/literal    "signed",
   :rdf/type         :qudt/SignednessType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Signed"})

(def ScalarDatatype
  {:db/ident :qudt/ScalarDatatype,
   :dcterms/description
   "Scalar data types are those that have a single value. The permissible values are defined over a domain that may be integers, float, character or boolean. Often a scalar data type is referred to as a primitive data type.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Scalar Datatype",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/maxExclusive,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/rdfsDatatype,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/maxInclusive,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/length,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/bytes,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/bits,
                       :rdf/type           :owl/Restriction} :qudt/Datatype
                      {:owl/allValuesFrom :rdfs/Datatype,
                       :owl/onProperty    :qudt/rdfsDatatype,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/minExclusive,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/minInclusive,
                       :rdf/type           :owl/Restriction}}})

(def Scale
  {:db/ident :qudt/Scale,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "Scales (also called \"scales of measurement\" or \"levels of measurement\")  are expressions that typically refer to the theory of scale types."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Scale",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/scaleType,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/MathsFunctionType,
                       :owl/onProperty    :qudt/permissibleMaths,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/ScaleType,
                       :owl/onProperty    :qudt/scaleType,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/TransformType,
                       :owl/onProperty    :qudt/permissibleTransformation,
                       :rdf/type          :owl/Restriction} :qudt/Concept
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/dataStructure,
                       :rdf/type           :owl/Restriction}}})

(def ScaleType
  {:db/ident         :qudt/ScaleType,
   :qudt/plainTextDescription
   "Scales, or scales of measurement (or categorization) provide ways of quantifying measurements, values and other enumerated values according to a normative frame of reference.  Four different types of scales are typically used. These are interval, nominal, ordinal and ratio scales.",
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Scale type",
   :rdfs/subClassOf  #{{:owl/allValuesFrom :qudt/MathsFunctionType,
                        :owl/onProperty    :qudt/permissibleMaths,
                        :rdf/type          :owl/Restriction}
                       {:owl/allValuesFrom :qudt/TransformType,
                        :owl/onProperty    :qudt/permissibleTransformation,
                        :rdf/type          :owl/Restriction}
                       {:owl/maxCardinality 1,
                        :owl/onProperty     :qudt/dataStructure,
                        :rdf/type           :owl/Restriction}
                       :qudt/EnumeratedValue}})

(def ShortSignedIntegerEncoding
  {:db/ident         :qudt/ShortSignedIntegerEncoding,
   :qudt/bytes       2,
   :rdf/type         :qudt/IntegerEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Short Signed Integer Encoding"})

(def ShortUnsignedIntegerEncoding
  {:db/ident         :qudt/ShortUnsignedIntegerEncoding,
   :qudt/bytes       2,
   :rdf/type         #{:qudt/BooleanEncodingType :qudt/IntegerEncodingType},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Short Unsigned Integer Encoding"})

(def SignedIntegerEncoding
  {:db/ident         :qudt/SignedIntegerEncoding,
   :qudt/bytes       4,
   :rdf/type         :qudt/IntegerEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Signed Integer Encoding"})

(def SignednessType
  {:db/ident :qudt/SignednessType,
   :dcterms/description
   "Specifics whether a value should be signed or unsigned.",
   :owl/oneOf [:qudt/SIGNED :qudt/UNSIGNED],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Signedness type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def SinglePrecisionRealEncoding
  {:db/ident         :qudt/SinglePrecisionRealEncoding,
   :qudt/bytes       32,
   :rdf/type         :qudt/FloatingPointEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Single Precision Real Encoding"})

(def SolidAngleUnit
  {:db/ident :qudt/SolidAngleUnit,
   :dcterms/description
   "The solid angle subtended by a surface S is defined as the surface area of a unit sphere covered by the surface S's projection onto the sphere. A solid angle is related to the surface of a sphere in the same way an ordinary angle is related to the circumference of a circle. Since the total surface area of the unit sphere is 4*pi, the measure of solid angle will always be between 0 and 4*pi.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Solid Angle Unit",
   :rdfs/subClassOf :qudt/AngleUnit})

(def Statement
  {:db/ident         :qudt/Statement,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Statement",
   :rdfs/subClassOf  :rdf/Statement})

(def StringEncodingType
  {:db/ident :qudt/StringEncodingType,
   :dcterms/description
   "A \"Encoding\" with the following instance(s): \"UTF-16 String\", \"UTF-8 Encoding\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "String Encoding Type",
   :rdfs/subClassOf :qudt/Encoding})

(def StructuredDatatype
  {:db/ident :qudt/StructuredDatatype,
   :dcterms/description
   "A \"Structured Datatype\", in contrast to scalar data types, is used to characterize classes of more complex data structures, such as linked or indexed lists, trees, ordered trees, and multi-dimensional file formats.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Structured Data Type",
   :rdfs/subClassOf #{:qudt/Datatype
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/elementType,
                       :rdf/type           :owl/Restriction}}})

(def Symbol
  {:db/ident         :qudt/Symbol,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Symbol",
   :rdfs/subClassOf  :qudt/Concept})

(def SystemOfQuantityKinds
  {:db/ident :qudt/SystemOfQuantityKinds,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A system of quantity kinds is a set of one or more quantity kinds together with a set of zero or more algebraic equations that define relationships between quantity kinds in the set. In the physical sciences, the equations relating quantity kinds are typically physical laws and definitional relations, and constants of proportionality. Examples include Newton’s First Law of Motion, Coulomb’s Law, and the definition of velocity as the instantaneous change in position.  In almost all cases, the system identifies a subset of base quantity kinds. The base set is chosen so that all other quantity kinds of interest can be derived from the base quantity kinds and the algebraic equations. If the unit system is explicitly associated with a quantity kind system, then the unit system must define at least one unit for each quantity kind.  From a scientific point of view, the division of quantities into base quantities and derived quantities is a matter of convention."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "System of Quantity Kinds",
   :rdfs/subClassOf #{{:owl/allValuesFrom :qudt/QuantityKind,
                       :owl/onProperty    :qudt/hasBaseQuantityKind,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/SystemOfUnits,
                       :owl/onProperty    :qudt/hasUnitSystem,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/baseDimensionEnumeration,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Enumeration,
                       :owl/onProperty    :qudt/baseDimensionEnumeration,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKind,
                       :owl/onProperty    :qudt/systemDerivedQuantityKind,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/hasQuantityKind,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKind,
                       :owl/onProperty    :qudt/hasQuantityKind,
                       :rdf/type          :owl/Restriction} :qudt/Concept}})

(def SystemOfUnits
  {:db/ident :qudt/SystemOfUnits,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://dbpedia.org/resource/Category:Systems_of_units"}
     {:xsd/anyURI
      "http://www.ieeeghn.org/wiki/index.php/System_of_Measurement_Units"}},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A system of units is a set of units which are chosen as the reference scales for some set of quantity kinds together with the definitions of each unit. Units may be defined by experimental observation or by proportion to another unit not included in the system. If the unit system is explicitly associated with a quantity kind system, then the unit system must define at least one unit for each quantity kind."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "System of Units",
   :rdfs/subClassOf #{{:owl/allValuesFrom :qudt/PhysicalConstant,
                       :owl/onProperty    :qudt/applicablePhysicalConstant,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Unit,
                       :owl/onProperty    :qudt/hasBaseUnit,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Unit,
                       :owl/onProperty    :qudt/hasDerivedUnit,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Prefix,
                       :owl/onProperty    :qudt/prefix,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Unit,
                       :owl/onProperty    :qudt/hasUnit,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Unit,
                       :owl/onProperty    :qudt/hasCoherentUnit,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Unit,
                       :owl/onProperty    :qudt/hasAllowedUnit,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Unit,
                       :owl/onProperty    :qudt/hasDefinedUnit,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Unit,
                       :owl/onProperty    :qudt/hasDerivedCoherentUnit,
                       :rdf/type          :owl/Restriction} :qudt/Verifiable
                      :qudt/Concept}})

(def TotallyOrdered
  {:db/ident         :qudt/TotallyOrdered,
   :qudt/literal     "total",
   :qudt/plainTextDescription "Totally ordered structure.",
   :rdf/type         :qudt/OrderedType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Totally Ordered"})

(def TransformType
  {:db/ident         :qudt/TransformType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Transform type",
   :rdfs/subClassOf  :qudt/EnumeratedValue,
   :skos/prefLabel   "Transform type"})

(def UCUMci
  {:db/ident :qudt/UCUMci,
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions [{:xsd/pattern "[\\x21-\\x60,\\x7b-\\x7e]+"}],
   :qudt/deprecated true,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "Lexical pattern for the case-insensitive version of UCUM code",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "case-insensitive UCUM code",
   :rdfs/subClassOf :rdfs/Resource})

(def UCUMci-term
  {:db/ident :qudt/UCUMci-term,
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "[\\x21,\\x23-\\x27,\\x2a,\\x2c,\\x30-\\x3c,\\x3e-\\x5a,\\x5c,\\x5e-\\x60,\\x7c,\\x7e]+"}],
   :qudt/deprecated true,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "Lexical pattern for the terminal symbols in the case-insensitive version of UCUM code",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "case-insensitive UCUM term",
   :rdfs/subClassOf :rdfs/Resource})

(def UCUMcs
  {:db/ident :qudt/UCUMcs,
   :dcterms/source {:xsd/anyURI "https://ucum.org/ucum.html"},
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions [{:xsd/pattern "[\\x21-\\x7e]+"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment "Lexical pattern for the case-sensitive version of UCUM code",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "case-sensitive UCUM code",
   :rdfs/seeAlso {:xsd/anyURI "https://ucum.org/ucum.html"},
   :rdfs/subClassOf :rdfs/Resource})

(def UCUMcs-term
  {:db/ident :qudt/UCUMcs-term,
   :dcterms/source {:xsd/anyURI "https://ucum.org/ucum.html"},
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "[\\x21,\\x23-\\x27,\\x2a,\\x2c,\\x30-\\x3c,\\x3e-\\x5a,\\x5c,\\x5e-\\x7a,\\x7c,\\x7e]+"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "Lexical pattern for the terminal symbols in the case-sensitive version of UCUM code",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "case-sensitive UCUM terminal",
   :rdfs/seeAlso {:xsd/anyURI "https://ucum.org/ucum.html"},
   :rdfs/subClassOf :rdfs/Resource})

(def UNSIGNED
  {:db/ident         :qudt/UNSIGNED,
   :dtype/literal    "unsigned",
   :rdf/type         :qudt/SignednessType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Unsigned"})

(def UTF16-StringEncoding
  {:db/ident         :qudt/UTF16-StringEncoding,
   :rdf/type         :qudt/StringEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "UTF-16 String"})

(def UTF8-StringEncoding
  {:db/ident         :qudt/UTF8-StringEncoding,
   :qudt/bytes       8,
   :rdf/type         :qudt/StringEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "UTF-8 Encoding"})

(def Unit
  {:db/ident :qudt/Unit,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "A unit of measure, or unit, is a particular quantity value that has been chosen as a scale for measuring other quantities the same kind (more generally of equivalent dimension). For example, the meter is a quantity of length that has been rigorously defined and standardized by the BIPM (International Board of Weights and Measures). Any measurement of the length can be expressed as a number multiplied by the unit meter. More formally, the value of a physical quantity Q with respect to a unit (U) is expressed as the scalar multiple of a real number (n) and U, as  \\(Q = nU\\)."},
   :qudt/informativeReference
   #{{:xsd/anyURI "http://www.allmeasures.com/Fullconversion.asp"}
     {:xsd/anyURI "http://dbpedia.org/resource/Category:Units_of_measure"}},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Unit",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/conversionMultiplier,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :xsd/string,
                       :owl/onProperty    :qudt/iec61360Code,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :xsd/string,
                       :owl/onProperty    :qudt/uneceCommonCode,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/SystemOfUnits,
                       :owl/onProperty    :qudt/derivedCoherentUnitOfSystem,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/SystemOfUnits,
                       :owl/onProperty    :qudt/applicableSystem,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/latexDefinition,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKindDimensionVector,
                       :owl/onProperty    :qudt/qkdvDenominator,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/UCUMcs,
                       :owl/onProperty    :qudt/ucumCode,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Prefix,
                       :owl/onProperty    :qudt/prefix,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/symbol,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/hasDimensionVector,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/conversionOffset,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/latexSymbol,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/mathMLdefinition,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/Unit,
                       :owl/onProperty    :qudt/exactMatch,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/SystemOfUnits,
                       :owl/onProperty    :qudt/derivedUnitOfSystem,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/SystemOfUnits,
                       :owl/onProperty    :qudt/definedUnitOfSystem,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/qkdvDenominator,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/siUnitsExpression,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :qudt/qkdvNumerator,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKindDimensionVector,
                       :owl/onProperty    :qudt/hasDimensionVector,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKindDimensionVector,
                       :owl/onProperty    :qudt/qkdvNumerator,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :xsd/string,
                       :owl/onProperty    :qudt/udunitsCode,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :qudt/QuantityKind,
                       :owl/onProperty    :qudt/hasQuantityKind,
                       :rdf/type          :owl/Restriction} :qudt/Verifiable
                      :qudt/Concept}})

(def Unordered
  {:db/ident         :qudt/Unordered,
   :qudt/literal     "unordered",
   :qudt/plainTextDescription "Unordered structure.",
   :rdf/type         :qudt/OrderedType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Unordered"})

(def UnsignedIntegerEncoding
  {:db/ident         :qudt/UnsignedIntegerEncoding,
   :qudt/bytes       4,
   :rdf/type         :qudt/IntegerEncodingType,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Unsigned Integer Encoding"})

(def UserQuantityKind
  {:db/ident         :qudt/UserQuantityKind,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "User Quantity Kind",
   :rdfs/subClassOf  #{:qudt/AbstractQuantityKind
                       {:owl/cardinality 1,
                        :owl/onProperty  :qudt/hasQuantityKind,
                        :rdf/type        :owl/Restriction}
                       {:owl/allValuesFrom :qudt/QuantityKind,
                        :owl/onProperty    :qudt/hasQuantityKind,
                        :rdf/type          :owl/Restriction}}})

(def Verifiable
  {:db/ident :qudt/Verifiable,
   :rdf/type :qudt/AspectClass,
   :rdfs/comment
   "An aspect class that holds properties that provide external knowledge and specifications of a given resource.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Verifiable",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :qudt/isoNormativeReference,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/normativeReference,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :qudt/dbpediaMatch,
                       :rdf/type           :owl/Restriction} :qudt/Aspect}})

(def Wikipedia
  {:db/ident         :qudt/Wikipedia,
   :rdf/type         :qudt/Organization,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Wikipedia"})

(def abbreviation
  {:db/ident :qudt/abbreviation,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "An abbreviation for a unit is a short ASCII string that is used in place of the full name for the unit in contexts where non-ASCII characters would be problematic, or where using the abbreviation will enhance readability. When a power of abase unit needs to be expressed, such as squares this can be done using abbreviations rather than symbols. For example, <em>sq ft</em> means <em>square foot</em>, and <em>cu ft</em> means <em>cubic foot</em>."},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "abbreviation",
   :rdfs/range :xsd/string})

(def acronym
  {:db/ident         :qudt/acronym,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "acronym",
   :rdfs/range       :xsd/string})

(def allowedPattern
  {:db/ident         :qudt/allowedPattern,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "allowed pattern"})

(def allowedUnitOfSystem
  {:db/ident :qudt/allowedUnitOfSystem,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a unit of measure with a unit system that does not define the unit, but allows its use within the system. An allowed unit must be convertible to some dimensionally eqiuvalent unit that is defined by the system."},
   :dcterms/isReplacedBy :qudt/applicableSystem,
   :owl/inverseOf :qudt/hasAllowedUnit,
   :qudt/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "allowed unit of system",
   :rdfs/subPropertyOf :qudt/isUnitOfSystem})

(def ansiSQLName
  {:db/ident         :qudt/ansiSQLName,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "ANSI SQL Name",
   :rdfs/range       :xsd/string})

(def applicableCGSUnit
  {:db/ident           :qudt/applicableCGSUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "applicable CGS unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicableISOUnit
  {:db/ident           :qudt/applicableISOUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "applicable ISO unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicableImperialUnit
  {:db/ident           :qudt/applicableImperialUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "applicable Imperial unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicablePhysicalConstant
  {:db/ident         :qudt/applicablePhysicalConstant,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "applicable physical constant"})

(def applicablePlanckUnit
  {:db/ident           :qudt/applicablePlanckUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "applicable Planck unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicableSIUnit
  {:db/ident           :qudt/applicableSIUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "applicable SI unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicableSystem
  {:db/ident         :qudt/applicableSystem,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a unit of measure with a unit system that may or may not define the unit, but within which the unit is compatible."},
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "applicable system"})

(def applicableUSCustomaryUnit
  {:db/ident           :qudt/applicableUSCustomaryUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "applicable US Customary unit",
   :rdfs/range         :qudt/Unit,
   :rdfs/subPropertyOf :qudt/applicableUnit})

(def applicableUnit
  {:db/ident :qudt/applicableUnit,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "See https://github.com/qudt/qudt-public-repo/wiki/Advanced-User-Guide#4-computing-applicable-units-for-a-quantitykind on how `qudt:applicableUnit` is computed from `qudt:hasQuantityKind` and then materialized"},
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "applicable unit",
   :rdfs/range :qudt/Unit})

(def baseDimensionEnumeration
  {:db/ident :qudt/baseDimensionEnumeration,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property associates a system of quantities with an enumeration that enumerates the base dimensions of the system in canonical order."},
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "base dimension enumeration",
   :rdfs/range :qudt/Enumeration})

(def baseUnitOfSystem
  {:db/ident :qudt/baseUnitOfSystem,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a unit of measure to the system of units in which it is defined as a base unit for the system. The base units of a system are used to define the derived units of the system by expressing the derived units as products of the base units raised to a rational power."},
   :owl/inverseOf :qudt/hasBaseUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "is base unit of system",
   :rdfs/subPropertyOf :qudt/coherentUnitOfSystem})

(def basis
  {:db/ident         :qudt/basis,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "basis"})

(def belongsToSystemOfQuantities
  {:db/ident         :qudt/belongsToSystemOfQuantities,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :qudt/QuantityKind,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "belongs to system of quantities",
   :rdfs/range       :qudt/SystemOfQuantityKinds})

(def bitOrder
  {:db/ident         :qudt/bitOrder,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "bit order",
   :rdfs/range       :qudt/EndianType})

(def bits
  {:db/ident         :qudt/bits,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "bits",
   :rdfs/range       :xsd/integer})

(def bounded
  {:db/ident         :qudt/bounded,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "bounded"})

(def byteOrder
  {:db/ident :qudt/byteOrder,
   :dcterms/description
   "Byte order is an enumeration of two values: 'Big Endian' and 'Little Endian' and is used to denote whether the most signiticant byte is either first or last, respectively.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "byte order",
   :rdfs/range :qudt/EndianType})

(def bytes
  {:db/ident         :qudt/bytes,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "bytes",
   :rdfs/range       :xsd/integer})

(def cName
  {:db/ident         :qudt/cName,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "Datatype name in the C programming language",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "C Language name",
   :rdfs/range       :xsd/string})

(def cardinality
  {:db/ident         :qudt/cardinality,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "cardinality"})

(def categorizedAs
  {:db/ident         :qudt/categorizedAs,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "categorized as"})

(def citation
  {:db/ident         :qudt/citation,
   :qudt/plainTextDescription
   "Used to provide an annotation for an informative reference.",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "citation",
   :rdfs/range       :xsd/string})

(def code
  {:db/ident :qudt/code,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A code is a string that uniquely identifies a QUDT concept. The use of this property has been deprecated."},
   :qudt/deprecated true,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :qudt/Concept,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "code"})

(def coherentUnitOfSystem
  {:db/ident :qudt/coherentUnitOfSystem,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "A coherent unit of measurement for a unit system is a defined unit that may be expressed as a product of powers of the system's base units with the proportionality factor of one. A system of units is coherent with respect to a system of quantities and equations if the system of units is chosen in such a way that the equations between numerical values have exactly the same form (including the numerical factors) as the corresponding equations between the quantities. For example, the 'newton' and the 'joule'. These two are, respectively, the force that causes one kilogram to be accelerated at 1 metre per second per  second, and the work done by 1 newton acting over 1 metre. Being coherent refers to this consistent use of 1. In the old c.g.s. system , with its base units the centimetre and the gram, the corresponding coherent units were the dyne and the erg, respectively the force that causes 1 gram to be accelerated at 1 centimetre per second per second, and the work done by 1 dyne acting over 1 centimetre. So \\(1 newton = 10^5\\,dyne\\), \\(1 joule = 10^7\\,erg\\), making each of the four compatible in a decimal sense within its respective other system, but not coherent therein."},
   :owl/inverseOf :qudt/hasCoherentUnit,
   :qudt/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "is coherent unit of system",
   :rdfs/range :qudt/SystemOfUnits,
   :rdfs/subPropertyOf :qudt/definedUnitOfSystem})

(def coherentUnitSystem
  {:db/ident           :qudt/coherentUnitSystem,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "<p>A system of units is coherent with respect to a system of quantities and equations if the system of units is chosen in such a way that the equations between numerical values have exactly the same form (including the numerical factors) as the corresponding equations between the quantities. In such a coherent system, no numerical factor other than the number 1 ever occurs in the expressions for the derived units in terms of the base units. For example, the \\(newton\\) and the \\(joule\\). These two are, respectively, the force that causes one kilogram to be accelerated at 1 metre per (1) second per (1) second, and the work done by 1 newton acting over 1 metre. Being coherent refers to this consistent use of 1. In the old c.g.s. system , with its base units the centimetre and the gram, the corresponding coherent units were the dyne and the erg, respectively the force that causes 1 gram to be accelerated at 1 centimetre per (1) second per (1) second, and the work done by 1 dyne acting over 1 centimetre. So \\(1\\,newton = 10^5 dyne\\), \\(1 joule = 10^7 erg\\), making each of the four compatible in a decimal sense within its respective other system, but not coherent therein.</p>"},
   :qudt/informativeReference
   {:xsd/anyURI
    "https://en.wikipedia.org/wiki/Coherence_(units_of_measurement)"},
   :rdf/type           #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "coherent unit system",
   :rdfs/subPropertyOf :qudt/hasUnitSystem})

(def conversionMultiplier
  {:db/ident         :qudt/conversionMultiplier,
   :rdf/type         #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "conversion multiplier",
   :rdfs/range       :dtype/numericUnion})

(def conversionOffset
  {:db/ident         :qudt/conversionOffset,
   :rdf/type         #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "conversion offset",
   :rdfs/range       :dtype/numericUnion})

(def currencyCode
  {:db/ident :qudt/currencyCode,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "Alphabetic Currency Code as defined by ISO 4217. For example, US Dollar has the code 'USD'."},
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "currency code",
   :rdfs/range :xsd/string,
   :rdfs/seeAlso {:xsd/anyURI "https://en.wikipedia.org/wiki/ISO_4217"}})

(def currencyExponent
  {:db/ident :qudt/currencyExponent,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The currency exponent indicates the number of decimal places between a major currency unit and its minor currency unit. For example, the US dollar is the major currency unit of the United States, and the US cent is the minor currency unit. Since one cent is 1/100 of a dollar, the US dollar has a currency exponent of 2. However, the Japanese Yen has no minor currency units, so the yen has a currency exponent of 0."},
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "currency exponent",
   :rdfs/range :xsd/integer})

(def currencyNumber
  {:db/ident :qudt/currencyNumber,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "Numeric currency Code as defined by ISO 4217. For example, US Dollar has the number 840."},
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "currency number",
   :rdfs/range :xsd/positiveInteger,
   :rdfs/seeAlso {:xsd/anyURI "https://en.wikipedia.org/wiki/ISO_4217"}})

(def dataEncoding
  {:db/ident         :qudt/dataEncoding,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "data encoding",
   :rdfs/range       :qudt/DataEncoding})

(def dataStructure
  {:db/ident         :qudt/dataStructure,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "data structure",
   :rdfs/range       :xsd/string})

(def dataType
  {:db/ident         :qudt/dataType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "datatype"})

(def dbpediaMatch
  {:db/ident         :qudt/dbpediaMatch,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dbpedia match",
   :rdfs/range       :xsd/anyURI})

(def default
  {:db/ident         :qudt/default,
   :dcterms/description {:rdf/type  :rdf/HTML,
                         :rdf/value "The default element in an enumeration"},
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "default"})

(def definedUnitOfSystem
  {:db/ident :qudt/definedUnitOfSystem,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a unit of measure with the unit system that defines the unit."},
   :owl/inverseOf :qudt/hasDefinedUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "defined unit of system",
   :rdfs/subPropertyOf :qudt/isUnitOfSystem})

(def denominatorDimensionVector
  {:db/ident         :qudt/denominatorDimensionVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "denominator dimension vector",
   :rdfs/range       :qudt/QuantityKindDimensionVector})

(def deprecated
  {:db/ident         :qudt/deprecated,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "deprecated",
   :rdfs/range       :xsd/boolean})

(def derivedCoherentUnitOfSystem
  {:db/ident :qudt/derivedCoherentUnitOfSystem,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a unit of measure to the unit system in which the unit is derived from the system's base units with a proportionality constant of one."},
   :owl/inverseOf :qudt/hasDerivedCoherentUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "is coherent derived unit of system",
   :rdfs/subPropertyOf #{:qudt/derivedUnitOfSystem :qudt/coherentUnitOfSystem}})

(def derivedNonCoherentUnitOfSystem
  {:db/ident :qudt/derivedNonCoherentUnitOfSystem,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a unit of measure to the unit system in which the unit is derived from the system's base units without proportionality constant of one."},
   :owl/inverseOf :qudt/hasDerivedNonCoherentUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "is non-coherent derived unit of system",
   :rdfs/range :qudt/SystemOfUnits,
   :rdfs/subPropertyOf :qudt/derivedUnitOfSystem})

(def derivedQuantityKindOfSystem
  {:db/ident         :qudt/derivedQuantityKindOfSystem,
   :qudt/deprecated  true,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "derived quantity kind of system"})

(def derivedUnitOfSystem
  {:db/ident :qudt/derivedUnitOfSystem,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a unit of measure to the system of units in which it is defined as a derived unit. That is, the derived unit is defined as a product of the base units for the system raised to some rational power."},
   :owl/inverseOf :qudt/hasDerivedUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "is derived unit of system",
   :rdfs/subPropertyOf :qudt/isUnitOfSystem})

(def dimensionExponent
  {:db/ident         :qudt/dimensionExponent,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimension exponent"})

(def dimensionExponentForAmountOfSubstance
  {:db/ident         :qudt/dimensionExponentForAmountOfSubstance,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimension exponent for amount of substance"})

(def dimensionExponentForElectricCurrent
  {:db/ident         :qudt/dimensionExponentForElectricCurrent,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimension exponent for electric current"})

(def dimensionExponentForLength
  {:db/ident         :qudt/dimensionExponentForLength,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimension exponent for length"})

(def dimensionExponentForLuminousIntensity
  {:db/ident         :qudt/dimensionExponentForLuminousIntensity,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimension exponent for luminous intensity"})

(def dimensionExponentForMass
  {:db/ident         :qudt/dimensionExponentForMass,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimension exponent for mass"})

(def dimensionExponentForThermodynamicTemperature
  {:db/ident         :qudt/dimensionExponentForThermodynamicTemperature,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimension exponent for thermodynamic temperature"})

(def dimensionExponentForTime
  {:db/ident         :qudt/dimensionExponentForTime,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimension exponent for time"})

(def dimensionInverse
  {:db/ident         :qudt/dimensionInverse,
   :rdf/type         #{:owl/SymmetricProperty :owl/ObjectProperty
                       :owl/InverseFunctionalProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimension inverse"})

(def dimensionVectorForSI
  {:db/ident         :qudt/dimensionVectorForSI,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimension vector for SI",
   :rdfs/range       :qudt/QuantityKindDimensionVector_SI})

(def dimensionlessExponent
  {:db/ident         :qudt/dimensionlessExponent,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimensionless exponent"})

(def element
  {:db/ident         :qudt/element,
   :dcterms/description {:rdf/type  :rdf/HTML,
                         :rdf/value "An element of an enumeration"},
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "element"})

(def elementKind
  {:db/ident         :qudt/elementKind,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "element kind"})

(def elementType
  {:db/ident         :qudt/elementType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "element type"})

(def encoding
  {:db/ident         :qudt/encoding,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "encoding"})

(def enumeratedValue
  {:db/ident   :qudt/enumeratedValue,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "enumerated value",
   :rdfs/range :qudt/EnumeratedValue})

(def enumeration
  {:db/ident   :qudt/enumeration,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "enumeration",
   :rdfs/range :qudt/Enumeration})

(def exactConstant
  {:db/ident         :qudt/exactConstant,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "exact constant",
   :rdfs/range       :xsd/boolean})

(def exactMatch
  {:db/ident         :qudt/exactMatch,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "exact match"})

(def example
  {:db/ident :qudt/example,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The 'qudt:example' property is used to annotate an instance of a class with a reference to a concept that is an example. The type of this property is 'rdf:Property'. This allows both scalar and object ranges."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "example"})

(def expression
  {:db/ident         :qudt/expression,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "An 'expression' is a finite combination of symbols that are well-formed according to rules that apply to units of measure, quantity kinds and their dimensions."},
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "expression"})

(def fieldCode
  {:db/ident         :qudt/fieldCode,
   :qudt/plainTextDescription
   "A field code is a generic property for representing unique codes that make up other identifers. For example each QuantityKind class caries a domain code as its field code.",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "field code",
   :rdfs/range       :xsd/string})

(def figure
  {:db/ident            :qudt/figure,
   :dcterms/description {:rdf/type  :rdf/HTML,
                         :rdf/value "Provides a link to an image."},
   :rdf/type            :owl/ObjectProperty,
   :rdfs/isDefinedBy    {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label          "figure",
   :rdfs/range          :qudt/Figure})

(def figureCaption
  {:db/ident         :qudt/figureCaption,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "figure caption",
   :rdfs/range       :xsd/string})

(def figureLabel
  {:db/ident         :qudt/figureLabel,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "figure label",
   :rdfs/range       :xsd/string})

(def floatPercentage
  {:db/ident         :qudt/floatPercentage,
   :owl/equivalentClass {:owl/onDatatype :xsd/float,
                         :owl/withRestrictions [{:xsd/minInclusive 0.0M}
                                                {:xsd/maxInclusive 100.0M}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type         :rdfs/Datatype,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "float percentage"})

(def generalization
  {:db/ident :qudt/generalization,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This deprecated property was intended to relate a quantity kind to its generalization."},
   :dcterms/isReplacedBy :skos/broader,
   :owl/inverseOf :qudt/specialization,
   :qudt/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "generalization"})

(def guidance
  {:db/ident         :qudt/guidance,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :qudt/Concept,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "guidance",
   :rdfs/range       :rdf/HTML})

(def hasAllowedUnit
  {:db/ident           :qudt/hasAllowedUnit,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a unit system with a unit of measure that is not defined by or part of the system, but is allowed for use within the system. An allowed unit must be convertible to some dimensionally eqiuvalent unit that is defined by the system."},
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "allowed unit",
   :rdfs/subPropertyOf :qudt/hasUnit})

(def hasBaseQuantityKind
  {:db/ident           :qudt/hasBaseQuantityKind,
   :rdf/type           #{:owl/ObjectProperty},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "has base quantity kind",
   :rdfs/subPropertyOf :qudt/hasQuantityKind})

(def hasBaseUnit
  {:db/ident :qudt/hasBaseUnit,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a system of units to a base unit defined within the system. The base units of a system are used to define the derived units of the system by expressing the derived units as products of the base units raised to a rational power."},
   :owl/inverseOf :qudt/baseUnitOfSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "base unit",
   :rdfs/subPropertyOf :qudt/hasCoherentUnit})

(def hasCoherentUnit
  {:db/ident :qudt/hasCoherentUnit,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A coherent unit of measurement for a unit system is a defined unit that may be expressed as a product of powers of the system's base units with the proportionality factor of one."},
   :owl/inverseOf :qudt/coherentUnitOfSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "coherent unit",
   :rdfs/subPropertyOf :qudt/hasDefinedUnit})

(def hasDefinedUnit
  {:db/ident           :qudt/hasDefinedUnit,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a unit system with a unit of measure that is defined by the system."},
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "defined unit",
   :rdfs/subPropertyOf :qudt/hasUnit})

(def hasDenominatorPart
  {:db/ident         :qudt/hasDenominatorPart,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "has quantity kind dimension vector denominator part"})

(def hasDerivedCoherentUnit
  {:db/ident           :qudt/hasDerivedCoherentUnit,
   :owl/inverseOf      :qudt/derivedCoherentUnitOfSystem,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "derived coherent unit",
   :rdfs/subPropertyOf #{:qudt/hasCoherentUnit :qudt/hasDerivedUnit}})

(def hasDerivedNonCoherentUnit
  {:db/ident           :qudt/hasDerivedNonCoherentUnit,
   :owl/inverseOf      :qudt/derivedNonCoherentUnitOfSystem,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "has coherent derived unit",
   :rdfs/subPropertyOf :qudt/hasDerivedUnit})

(def hasDerivedUnit
  {:db/ident :qudt/hasDerivedUnit,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a system of units to a unit of measure that is defined within the system in terms of the base units for the system. That is, the derived unit is defined as a product of the base units for the system raised to some rational power."},
   :owl/inverseOf :qudt/derivedUnitOfSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "derived unit"})

(def hasDimension
  {:db/ident         :qudt/hasDimension,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "has dimension"})

(def hasDimensionExpression
  {:db/ident         :qudt/hasDimensionExpression,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "dimension expression"})

(def hasDimensionVector
  {:db/ident         :qudt/hasDimensionVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "has dimension vector",
   :rdfs/range       :qudt/QuantityKindDimensionVector})

(def hasNonCoherentUnit
  {:db/ident :qudt/hasNonCoherentUnit,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A coherent unit of measurement for a unit system is a defined unit that may be expressed as a product of powers of the system's base units with the proportionality factor of one."},
   :owl/inverseOf :qudt/coherentUnitOfSystem,
   :qudt/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "has non-coherent unit",
   :rdfs/subPropertyOf :qudt/hasDefinedUnit})

(def hasNumeratorPart
  {:db/ident         :qudt/hasNumeratorPart,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "has quantity kind dimension vector numerator part"})

(def hasPrefixUnit
  {:db/ident           :qudt/hasPrefixUnit,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "prefix unit",
   :rdfs/subPropertyOf :qudt/hasDefinedUnit})

(def hasQuantity
  {:db/ident         :qudt/hasQuantity,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "has quantity",
   :rdfs/range       :qudt/Quantity})

(def hasQuantityKind
  {:db/ident         :qudt/hasQuantityKind,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "has quantity kind",
   :rdfs/range       :qudt/QuantityKind})

(def hasReferenceQuantityKind
  {:db/ident         :qudt/hasReferenceQuantityKind,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "has reference quantity kind"})

(def hasRule
  {:db/ident         :qudt/hasRule,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "has rule"})

(def hasUnit
  {:db/ident         :qudt/hasUnit,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a system of units with a unit of measure that is either a) defined by the system, or b) accepted for use by the system and is convertible to a unit of equivalent dimension that is defined by the system. Systems of units may distinguish between base and derived units. Base units are the units which measure the base quantities for the corresponding system of quantities. The base units are used to define units for all other quantities as products of powers of the base units. Such units are called derived units for the system."},
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "has unit"})

(def hasUnitSystem
  {:db/ident         :qudt/hasUnitSystem,
   :rdf/type         #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "has unit system"})

(def hasVocabulary
  {:db/ident         :qudt/hasVocabulary,
   :qudt/plainTextDescription
   "Used to relate a class to one or more graphs where vocabularies for the class are defined.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "has vocabulary",
   :rdfs/range       :owl/Ontology})

(def height
  {:db/ident         :qudt/height,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "height",
   :rdfs/range       :xsd/string})

(def id
  {:db/ident :qudt/id,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The \"qudt:id\" is an identifier string that uniquely identifies a QUDT concept.  The identifier is constructed using a prefix. For example, units are coded using the pattern: \"UCCCENNNN\", where \"CCC\" is a numeric code or a category and \"NNNN\" is a digit string for a member element of that category. For scaled units there may be an addition field that has the format \"QNN\" where \"NN\" is a digit string representing an exponent power, and \"Q\" is a qualifier that indicates with the code \"P\" that the power is a positive decimal exponent, or the code \"N\" for a negative decimal exponent, or the code \"B\" for binary positive exponents."},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :qudt/Concept,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "qudt id",
   :rdfs/range :xsd/string})

(def iec61360Code
  {:db/ident         :qudt/iec61360Code,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "iec-61360 code",
   :rdfs/range       :xsd/string})

(def image
  {:db/ident         :qudt/image,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "image",
   :rdfs/range       :xsd/anyURI})

(def imageLocation
  {:db/ident         :qudt/imageLocation,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "image location",
   :rdfs/range       :xsd/anyURI})

(def informativeReference
  {:db/ident :qudt/informativeReference,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "Provides a way to reference a source that provided useful but non-normative information."},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "informative reference",
   :rdfs/range :xsd/anyURI})

(def integerPercentage
  {:db/ident         :qudt/integerPercentage,
   :owl/equivalentClass {:owl/onDatatype :xsd/integer,
                         :owl/withRestrictions [{:xsd/minInclusive 0M}
                                                {:xsd/maxInclusive 100M}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type         :rdfs/Datatype,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "integer percentage"})

(def isBaseQuantityKindOfSystem
  {:db/ident         :qudt/isBaseQuantityKindOfSystem,
   :qudt/deprecated  true,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "is base quantity kind of system"})

(def isDeltaQuantity
  {:db/ident :qudt/isDeltaQuantity,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "This property is used to identify a Quantity instance that is a measure of a change, or interval, of some property, rather than a measure of its absolute value. This is important for measurements such as temperature differences where the conversion among units would be calculated differently because of offsets.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "is Delta Quantity",
   :rdfs/range :xsd/boolean})

(def isDimensionInSystem
  {:db/ident         :qudt/isDimensionInSystem,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "is dimension in system"})

(def isMetricUnit
  {:db/ident         :qudt/isMetricUnit,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "is metric unit",
   :rdfs/range       :xsd/boolean})

(def isQuantityKindOf
  {:db/ident :qudt/isQuantityKindOf,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "`qudt:isQuantityKindOf` was a strict inverse of `qudt:hasQuantityKind` but is now deprecated."},
   :qudt/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "is quantity kind of"})

(def isUnitOfSystem
  {:db/ident :qudt/isUnitOfSystem,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This property relates a unit of measure with a system of units that either a) defines the unit or b) allows the unit to be used within the system."},
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :qudt/Unit,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "is unit of system",
   :rdfs/range :qudt/SystemOfUnits})

(def isoNormativeReference
  {:db/ident :qudt/isoNormativeReference,
   :dcterms/description
   {:rdf/type  :rdf/HTML,
    :rdf/value "Provides a way to reference the ISO unit definition."},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "normative reference (ISO)",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :qudt/normativeReference})

(def javaName
  {:db/ident         :qudt/javaName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "java name",
   :rdfs/range       :xsd/string})

(def jsName
  {:db/ident         :qudt/jsName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Javascript name",
   :rdfs/range       :xsd/string})

(def landscape
  {:db/ident         :qudt/landscape,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "landscape",
   :rdfs/range       :xsd/boolean})

(def latexDefinition
  {:db/ident         :qudt/latexDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "latex definition",
   :rdfs/range       :qudt/LatexString})

(def latexSymbol
  {:db/ident :qudt/latexSymbol,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "The symbol is a glyph that is used to represent some concept, typically a unit or a quantity, in a compact form. For example, the symbol for an Ohm is \\(ohm\\). This contrasts with 'unit:abbreviation', which gives a short alphanumeric abbreviation for the unit, 'ohm' for Ohm."},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "latex symbol",
   :rdfs/range :qudt/LatexString})

(def length
  {:db/ident         :qudt/length,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "length",
   :rdfs/range       :xsd/integer})

(def literal
  {:db/ident           :qudt/literal,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "literal",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :dtype/literal})

(def lowerBound
  {:db/ident         :qudt/lowerBound,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "lower bound"})

(def mathDefinition
  {:db/ident         :qudt/mathDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "math definition",
   :rdfs/range       :xsd/string})

(def mathMLdefinition
  {:db/ident           :qudt/mathMLdefinition,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "mathML definition",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/mathDefinition})

(def matlabName
  {:db/ident         :qudt/matlabName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "matlab name",
   :rdfs/range       :xsd/string})

(def maxExclusive
  {:db/ident :qudt/maxExclusive,
   :dcterms/description
   "maxExclusive is the exclusive upper bound of the value space for a datatype with the ordered property. The value of maxExclusive must be in the value space of the base type or be equal to {value} in {base type definition}.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "max exclusive",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :qudt/upperBound})

(def maxInclusive
  {:db/ident           :qudt/maxInclusive,
   :dcterms/description
   "maxInclusive is the inclusive upper bound of the value space for a datatype with the ordered property. The value of maxInclusive must be in the value space of the base type.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "max inclusive",
   :rdfs/subPropertyOf :qudt/upperBound})

(def microsoftSQLServerName
  {:db/ident         :qudt/microsoftSQLServerName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Microsoft SQL Server name",
   :rdfs/range       :xsd/string})

(def minExclusive
  {:db/ident           :qudt/minExclusive,
   :dcterms/description
   "minExclusive is the exclusive lower bound of the value space for a datatype with the ordered property. The value of minExclusive must be in the value space of the base type or be equal to {value} in {base type definition}.",
   :rdf/type           #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "min exclusive",
   :rdfs/subPropertyOf :qudt/lowerBound})

(def minInclusive
  {:db/ident           :qudt/minInclusive,
   :dcterms/description
   "minInclusive is the inclusive lower bound of the value space for a datatype with the ordered property. The value of minInclusive must be in the value space of the base type.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "min inclusive",
   :rdfs/subPropertyOf :qudt/lowerBound})

(def mySQLName
  {:db/ident         :qudt/mySQLName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "MySQL name",
   :rdfs/range       :xsd/string})

(def negativeDeltaLimit
  {:db/ident :qudt/negativeDeltaLimit,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A negative change limit between consecutive sample values for a parameter. The Negative Delta may be the encoded value or engineering units value depending on whether or not a Calibrator is defined."},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "negative delta limit",
   :rdfs/range :xsd/string})

(def normativeReference
  {:db/ident :qudt/normativeReference,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "Provides a way to reference information that is an authorative source providing a standard definition"},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "normative reference",
   :rdfs/range :xsd/anyURI})

(def numeratorDimensionVector
  {:db/ident         :qudt/numeratorDimensionVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "numerator dimension vector",
   :rdfs/range       :qudt/QuantityKindDimensionVector})

(def numericValue
  {:db/ident         :qudt/numericValue,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "numeric value",
   :rdfs/range       :qudt/NumericUnion})

(def odbcName
  {:db/ident         :qudt/odbcName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "ODBC name",
   :rdfs/range       :xsd/string})

(def oleDBName
  {:db/ident :qudt/oleDBName,
   :dcterms/description
   "OLE DB (Object Linking and Embedding, Database, sometimes written as OLEDB or OLE-DB), an API designed by Microsoft, allows accessing data from a variety of sources in a uniform manner. The API provides a set of interfaces implemented using the Component Object Model (COM); it is otherwise unrelated to OLE. ",
   :qudt/informativeReference
   #{{:xsd/anyURI "http://en.wikipedia.org/wiki/OLE_DB"}
     {:xsd/anyURI
      "http://msdn.microsoft.com/en-us/library/windows/desktop/ms714931(v=vs.85).aspx"}},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "OLE DB name",
   :rdfs/range :xsd/string})

(def omUnit
  {:db/ident         :qudt/omUnit,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :qudt/Unit,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "om unit"})

(def onlineReference
  {:db/ident         :qudt/onlineReference,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "online reference",
   :rdfs/range       :xsd/anyURI})

(def oracleSQLName
  {:db/ident         :qudt/oracleSQLName,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "ORACLE SQL name",
   :rdfs/range       :xsd/string})

(def order
  {:db/ident         :qudt/order,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "order",
   :rdfs/range       :xsd/nonNegativeInteger})

(def orderedType
  {:db/ident         :qudt/orderedType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "ordered type"})

(def outOfScope
  {:db/ident         :qudt/outOfScope,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "out of scope",
   :rdfs/range       :xsd/boolean})

(def permissibleMaths
  {:db/ident         :qudt/permissibleMaths,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "permissible maths"})

(def permissibleTransformation
  {:db/ident         :qudt/permissibleTransformation,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "permissible transformation"})

(def plainTextDescription
  {:db/ident :qudt/plainTextDescription,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A plain text description is used to provide a description with only simple ASCII characters for cases where LaTeX , HTML or other markup would not be appropriate."},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "description (plain text)",
   :rdfs/range :xsd/string})

(def positiveDeltaLimit
  {:db/ident :qudt/positiveDeltaLimit,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A positive change limit between consecutive sample values for a parameter. The Positive Delta may be the encoded value or engineering units value depending on whether or not a Calibrator is defined."},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Positive delta limit",
   :rdfs/range :xsd/string})

(def prefix
  {:db/ident         :qudt/prefix,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Associates a unit with the appropriate prefix, if any.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "prefix",
   :rdfs/range       :qudt/Prefix})

(def prefixMultiplier
  {:db/ident         :qudt/prefixMultiplier,
   :rdf/type         #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "prefix multiplier",
   :rdfs/range       :xsd/double})

(def protocolBuffersName
  {:db/ident         :qudt/protocolBuffersName,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "protocol buffers name",
   :rdfs/range       :xsd/string})

(def pythonName
  {:db/ident         :qudt/pythonName,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "python name",
   :rdfs/range       :xsd/string})

(def qkdvDenominator
  {:db/ident         :qudt/qkdvDenominator,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "denominator dimension vector",
   :rdfs/range       :qudt/QuantityKindDimensionVector})

(def qkdvNumerator
  {:db/ident         :qudt/qkdvNumerator,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "numerator dimension vector",
   :rdfs/range       :qudt/QuantityKindDimensionVector})

(def quantity
  {:db/ident         :qudt/quantity,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "a property to relate an observable thing with a quantity (qud:Quantity)"},
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "quantity"})

(def quantityValue
  {:db/ident         :qudt/quantityValue,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "quantity value",
   :rdfs/range       :qudt/QuantityValue})

(def rationale
  {:db/ident         :qudt/rationale,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "rationale",
   :rdfs/range       :rdf/HTML})

(def rdfsDatatype
  {:db/ident         :qudt/rdfsDatatype,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "rdfs datatype"})

(def reference
  {:db/ident         :qudt/reference,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "reference"})

(def referenceUnit
  {:db/ident         :qudt/referenceUnit,
   :rdf/type         #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "reference unit"})

(def relativeStandardUncertainty
  {:db/ident :qudt/relativeStandardUncertainty,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The relative standard uncertainty of a measurement is the (absolute) standard uncertainty divided by the magnitude of the exact value."},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "relative standard uncertainty",
   :rdfs/range :xsd/double})

(def relevantQuantityKind
  {:db/ident         :qudt/relevantQuantityKind,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "relevant quantity kind",
   :rdfs/range       :qudt/QuantityKind})

(def relevantUnit
  {:db/ident :qudt/relevantUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This property is used for qudt:Discipline instances to identify the Unit instances that are used within a given discipline.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "Relevant Unit",
   :rdfs/range :qudt/Unit})

(def ruleType
  {:db/ident         :qudt/ruleType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "rule type"})

(def scaleType
  {:db/ident         :qudt/scaleType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "scale type"})

(def siUnitsExpression
  {:db/ident         :qudt/siUnitsExpression,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "si units expression",
   :rdfs/range       :xsd/string})

(def specialization
  {:db/ident :qudt/specialization,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This deprecated property originally related a quantity kind to its specialization(s). For example, linear velocity and angular velocity are both specializations of velocity."},
   :owl/inverseOf :qudt/generalization,
   :qudt/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "specialization"})

(def standardUncertainty
  {:db/ident :qudt/standardUncertainty,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The standard uncertainty of a quantity is the estimated standard deviation of the mean taken from a series of measurements."},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "standard uncertainty",
   :rdfs/range :xsd/double})

(def symbol
  {:db/ident           :qudt/symbol,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "The symbol is a glyph that is used to represent some concept, typically a unit or a quantity, in a compact form. For example, the symbol for an Ohm is \\(ohm\\). This contrasts with 'unit:abbreviation', which gives a short alphanumeric abbreviation for the unit, 'ohm' for Ohm."},
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "symbol",
   :rdfs/subPropertyOf :qudt/literal})

(def systemDefinition
  {:db/ident         :qudt/systemDefinition,
   :rdf/type         #{:owl/TransitiveProperty :owl/ObjectProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "system definition"})

(def systemDerivedQuantityKind
  {:db/ident           :qudt/systemDerivedQuantityKind,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label         "system derived quantity kind",
   :rdfs/subPropertyOf :qudt/hasQuantityKind})

(def systemDimension
  {:db/ident         :qudt/systemDimension,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "system dimension"})

(def ucumCaseInsensitiveCode
  {:db/ident :qudt/ucumCaseInsensitiveCode,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<em>ucumCode</em> associates a QUDT unit with a UCUM case-insensitive code."},
   :qudt/deprecated true,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "ucum case-insensitive code",
   :rdfs/subPropertyOf :qudt/ucumCode})

(def ucumCaseSensitiveCode
  {:db/ident :qudt/ucumCaseSensitiveCode,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<em>ucumCode</em> associates a QUDT unit with with a UCUM case-sensitive code."},
   :qudt/deprecated true,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "ucum case-sensitive code",
   :rdfs/subPropertyOf :qudt/ucumCode})

(def ucumCode
  {:db/ident :qudt/ucumCode,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<p><em>ucumCode</em> associates a QUDT unit with its UCUM code (case-sensitive). </p><p>In SHACL the values are derived from specific ucum properties using 'sh:values'.</p>"},
   :dcterms/source {:xsd/anyURI "https://ucum.org/ucum.html"},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "ucum code",
   :rdfs/range {:owl/unionOf [:qudt/UCUMcs :qudt/UCUMcs-term],
                :rdf/type    :owl/Class},
   :rdfs/seeAlso {:xsd/anyURI "https://ucum.org/ucum.html"},
   :rdfs/subPropertyOf :skos/notation})

(def udunitsCode
  {:db/ident :qudt/udunitsCode,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The UDUNITS package supports units of physical quantities. Its C library provides for arithmetic manipulation of units and for conversion of numeric values between compatible units. The package contains an extensive unit database, which is in XML format and user-extendable. The package also contains a command-line utility for investigating units and converting values."},
   :dcterms/source {:xsd/anyURI
                    "https://www.unidata.ucar.edu/software/udunits/"},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "udunits code",
   :rdfs/range :xsd/string})

(def uneceCommonCode
  {:db/ident :qudt/uneceCommonCode,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The UN/CEFACT Recommendation 20 provides three character alphabetic and alphanumeric codes for representing units of measurement for length, area, volume/capacity, mass (weight), time, and other quantities used in international trade. The codes are intended for use in manual and/or automated systems for the exchange of information between participants in international trade."},
   :dcterms/source
   #{{:xsd/anyURI "https://service.unece.org/trade/uncefact/vocabulary/rec20/"}
     {:xsd/anyURI
      "https://unece.org/trade/documents/2021/06/uncefact-rec20-0"}},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "unece common code",
   :rdfs/range :xsd/string})

(def unit
  {:db/ident :qudt/unit,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A reference to the unit of measure of a quantity (variable or constant) of interest."},
   :dcterms/isReplacedBy :qudt/hasUnit,
   :owl/inverseOf :qudt/unitFor,
   :qudt/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label "unit",
   :rdfs/range :qudt/Unit})

(def unitFor
  {:db/ident         :qudt/unitFor,
   :owl/inverseOf    :qudt/unit,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "unit for"})

(def upperBound
  {:db/ident         :qudt/upperBound,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "upper bound",
   :rdfs/range       :xsd/anySimpleType})

(def url
  {:db/ident         :qudt/url,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "url",
   :rdfs/range       :xsd/anyURI})

(def value
  {:db/ident         :qudt/value,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A property to relate an observable thing with a value of any kind"},
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "value"})

(def valueQuantity
  {:db/ident         :qudt/valueQuantity,
   :owl/inverseOf    :qudt/quantityValue,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "value for quantity"})

(def valueUnion
  {:db/ident         :qudt/valueUnion,
   :dcterms/description
   "A datatype that is the union of numeric xsd data types. \"numericUnion\" is equivalent to the xsd specification that uses an xsd:union of memberTypes=\"xsd:decimal xsd:double xsd:float xsd:integer\".",
   :owl/equivalentClass {:owl/unionOf [:xsd/anySimpleType
                                       :dtype/EnumeratedValue],
                         :rdf/type    :owl/Class},
   :rdf/type         :rdfs/Datatype,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "value union",
   :rdfs/subClassOf  :rdfs/Resource})

(def vbName
  {:db/ident         :qudt/vbName,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "Vusal Basic name",
   :rdfs/range       :xsd/string})

(def vectorMagnitude
  {:db/ident         :qudt/vectorMagnitude,
   :rdf/type         #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "vector magnitude",
   :rdfs/range       :xsd/float})

(def width
  {:db/ident         :qudt/width,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/schema/qudt"},
   :rdfs/label       "width",
   :rdfs/range       :xsd/string})

(def urn:uuid:176e3494-01ba-5f8c-83dd-4b536f92a12f
  {:owl/imports #{{:xsd/anyURI "http://www.linkedmodel.org/schema/dtype"}
                  {:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                  {:xsd/anyURI "http://www.w3.org/2004/02/skos/core"}},
   :rdf/type    :owl/Ontology,
   :rdfs/label  "QUDT Schema - Version 2.1.35",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-SCHEMA,
   :xsd/anyURI  "http://qudt.org/schema/qudt"})

(def urn:uuid:c2ade4ca-38f5-5111-b981-a054570ea7e7
  {:vaem/namespace       {:xsd/anyURI
                          "http://www.linkedmodel.org/schema/dtype#"},
   :vaem/namespacePrefix "dtype",
   :xsd/anyURI           "http://www.linkedmodel.org/schema/dtype"})
