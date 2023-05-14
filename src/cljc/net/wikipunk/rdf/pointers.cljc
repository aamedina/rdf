(ns net.wikipunk.rdf.pointers
  "http://www.w3.org/2009/pointers#"
  {:rdf/ns-prefix-map {"pointers" "http://www.w3.org/2009/pointers#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "pointers",
   :rdfa/uri          "http://www.w3.org/2009/pointers#"}
  (:refer-clojure :exclude [namespace]))

(def ByteOffsetCompoundPointer
  "Pointer to a byte range with a defined start and a byte offset from there."
  {:db/ident :pointers/ByteOffsetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Pointer to a byte range with a defined start and a byte offset from there.@en",
   :rdfs/label #voc/lstr "Byte Offset Compound Pointer@en",
   :rdfs/subClassOf [:pointers/CompoundPointer
                     :pointers/ByteOffsetCompoundPointer
                     :rdfs/Resource
                     :pointers/Pointer]})

(def ByteOffsetPointer
  "Single pointer using a byte offset from the start of the reference."
  {:db/ident :pointers/ByteOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Single pointer using a byte offset from the start of the reference.@en",
   :rdfs/label #voc/lstr "Byte Offset Pointer@en",
   :rdfs/subClassOf [:pointers/OffsetPointer
                     :pointers/ByteOffsetPointer
                     :rdfs/Resource
                     :pointers/SinglePointer
                     :pointers/Pointer]})

(def ByteSnippetCompoundPointer
  "Pointer to a range with a defined start and a byte snippet from there."
  {:db/ident :pointers/ByteSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Pointer to a range with a defined start and a byte snippet from there.@en",
   :rdfs/label #voc/lstr "Byte Snippet Compound Pointer@en",
   :rdfs/subClassOf [:pointers/CompoundPointer
                     :pointers/ByteSnippetCompoundPointer
                     :rdfs/Resource
                     :pointers/Pointer]})

(def CSSSelectorPointer
  "Single pointer using a CSS selector."
  {:db/ident        :pointers/CSSSelectorPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "Single pointer using a CSS selector.@en",
   :rdfs/label      #voc/lstr "CSS selector Pointer@en",
   :rdfs/subClassOf [:pointers/ExpressionPointer
                     :pointers/CSSSelectorPointer
                     :rdfs/Resource
                     :pointers/SinglePointer
                     :pointers/Pointer]})

(def CharOffsetCompoundPointer
  "Pointer to a char range with a defined start and a char offset from there."
  {:db/ident :pointers/CharOffsetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Pointer to a char range with a defined start and a char offset from there.@en",
   :rdfs/label #voc/lstr "Char Offset Compound Pointer@en",
   :rdfs/subClassOf [:pointers/CompoundPointer
                     :pointers/CharOffsetCompoundPointer
                     :rdfs/Resource
                     :pointers/Pointer]})

(def CharOffsetPointer
  "Single pointer using a character offset from the start of the reference."
  {:db/ident :pointers/CharOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Single pointer using a character offset from the start of the reference.@en",
   :rdfs/label #voc/lstr "Char Offset Pointer@en",
   :rdfs/subClassOf [:pointers/OffsetPointer
                     :pointers/CharOffsetPointer
                     :rdfs/Resource
                     :pointers/SinglePointer
                     :pointers/Pointer]})

(def CharSnippetCompoundPointer
  "Pointer to a range with a defined start and a character snippet from there."
  {:db/ident :pointers/CharSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Pointer to a range with a defined start and a character snippet from there.@en",
   :rdfs/label #voc/lstr "Char Snippet Compound Pointer@en",
   :rdfs/subClassOf [:rdfs/Resource
                     :pointers/CompoundPointer
                     :pointers/CharSnippetCompoundPointer
                     :pointers/Pointer]})

(def CompoundPointer
  "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility."
  {:db/ident :pointers/CompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility.@en",
   :rdfs/label #voc/lstr "Compound Pointer@en",
   :rdfs/subClassOf
   [:pointers/Pointer :pointers/CompoundPointer :rdfs/Resource]})

(def EquivalentPointers
  "Group of equivalent pointers that point to the same places."
  {:db/ident :pointers/EquivalentPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "Group of equivalent pointers that point to the same places.@en",
   :rdfs/label #voc/lstr "Equivalent Pointers@en",
   :rdfs/subClassOf [:pointers/PointersGroup
                     :pointers/EquivalentPointers
                     :rdfs/Resource
                     :pointers/Pointer]})

(def ExpressionPointer
  "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc."
  {:db/ident :pointers/ExpressionPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc.@en",
   :rdfs/label #voc/lstr "Expression Pointer@en",
   :rdfs/subClassOf [:pointers/SinglePointer
                     :pointers/ExpressionPointer
                     :rdfs/Resource
                     :pointers/Pointer]})

(def LineCharPointer
  "Single pointer using line and char numbers."
  {:db/ident        :pointers/LineCharPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "Single pointer using line and char numbers.@en",
   :rdfs/label      #voc/lstr "Line-Char Pointer@en",
   :rdfs/subClassOf [:pointers/SinglePointer
                     :pointers/LineCharPointer
                     :rdfs/Resource
                     :pointers/Pointer]})

(def OffsetPointer
  "Generic single pointer based on an offset."
  {:db/ident        :pointers/OffsetPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "Generic single pointer based on an offset.@en",
   :rdfs/label      #voc/lstr "Offset Pointer@en",
   :rdfs/subClassOf [:pointers/SinglePointer
                     :pointers/OffsetPointer
                     :rdfs/Resource
                     :pointers/Pointer]})

(def Pointer
  "Abstract Pointer to be subclassed for extensibility."
  {:db/ident        :pointers/Pointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr
                     "Abstract Pointer to be subclassed for extensibility.@en",
   :rdfs/label      #voc/lstr "Pointer@en",
   :rdfs/subClassOf [:rdfs/Resource :pointers/Pointer]})

(def PointersGroup
  "Generic container for a group of Pointers"
  {:db/ident        :pointers/PointersGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "Generic container for a group of Pointers@en",
   :rdfs/label      #voc/lstr "Pointers Group@en",
   :rdfs/subClassOf [:rdfs/Resource :pointers/Pointer :pointers/PointersGroup]})

(def RelatedPointers
  "Group of related pointers you use together for some purpose."
  {:db/ident :pointers/RelatedPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "Group of related pointers you use together for some purpose.@en",
   :rdfs/label #voc/lstr "Related Pointers@en",
   :rdfs/subClassOf [:pointers/PointersGroup
                     :pointers/RelatedPointers
                     :rdfs/Resource
                     :pointers/Pointer]})

(def SinglePointer
  "Abstract pointer to a single point to be subclassed for extensibility."
  {:db/ident :pointers/SinglePointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Abstract pointer to a single point to be subclassed for extensibility.@en",
   :rdfs/label #voc/lstr "Single Pointer@en",
   :rdfs/subClassOf [:pointers/Pointer :pointers/SinglePointer :rdfs/Resource]})

(def StartEndPointer
  "Compound pointer to a range with a start and an end point."
  {:db/ident :pointers/StartEndPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "Compound pointer to a range with a start and an end point.@en",
   :rdfs/label #voc/lstr "Start-End Pointer@en",
   :rdfs/subClassOf [:pointers/CompoundPointer
                     :pointers/StartEndPointer
                     :rdfs/Resource
                     :pointers/Pointer]})

(def XMLNamespace
  "An XML Namespace."
  {:db/ident        :pointers/XMLNamespace,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "An XML Namespace.@en",
   :rdfs/label      #voc/lstr "XMLNamespace@en",
   :rdfs/subClassOf [:rdfs/Resource :pointers/XMLNamespace]})

(def XPathPointer
  "Single pointer using an XPath expression."
  {:db/ident        :pointers/XPathPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "Single pointer using an XPath expression.@en",
   :rdfs/label      #voc/lstr "XPath Pointer@en",
   :rdfs/subClassOf [:pointers/ExpressionPointer
                     :pointers/XPathPointer
                     :rdfs/Resource
                     :pointers/SinglePointer
                     :pointers/Pointer]})

(def XPointerPointer
  "Single pointer using an XPointer expression."
  {:db/ident        :pointers/XPointerPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "Single pointer using an XPointer expression.@en",
   :rdfs/label      #voc/lstr "XPointer Pointer@en",
   :rdfs/subClassOf [:pointers/XPathPointer
                     :pointers/XPointerPointer
                     :pointers/ExpressionPointer
                     :rdfs/Resource
                     :pointers/SinglePointer
                     :pointers/Pointer]})

(def byteOffset
  "Number of bytes counting from the start point."
  {:db/ident           :pointers/byteOffset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Number of bytes counting from the start point.",
   :rdfs/domain        :pointers/ByteOffsetCompoundPointer,
   :rdfs/label         "byte offset",
   :rdfs/range         :xsd/positiveInteger,
   :rdfs/subPropertyOf :pointers/byteOffset})

(def charNumber
  "Char number within a line starting at one."
  {:db/ident           :pointers/charNumber,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "Char number within a line starting at one.\n\t\t@en",
   :rdfs/domain        :pointers/LineCharPointer,
   :rdfs/label         #voc/lstr "char number@en",
   :rdfs/range         :xsd/positiveInteger,
   :rdfs/subPropertyOf :pointers/charNumber})

(def charOffset
  "Number of characters counting from the start point."
  {:db/ident :pointers/charOffset,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "Number of characters counting from the start point.@en",
   :rdfs/domain :pointers/CharOffsetCompoundPointer,
   :rdfs/label #voc/lstr "char offset@en",
   :rdfs/range :xsd/positiveInteger,
   :rdfs/subPropertyOf :pointers/charOffset})

(def endPointer
  "Pointer to the end point of the range."
  {:db/ident           :pointers/endPointer,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Pointer to the end point of the range.@en",
   :rdfs/domain        :pointers/StartEndPointer,
   :rdfs/label         #voc/lstr "end pointer@en",
   :rdfs/range         :pointers/SinglePointer,
   :rdfs/subPropertyOf :pointers/endPointer})

(def expression
  "Expressions, such as xPath or CSS selectors, that identify points."
  {:db/ident :pointers/expression,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Expressions, such as xPath or CSS selectors, that identify points.@en",
   :rdfs/domain :pointers/ExpressionPointer,
   :rdfs/label #voc/lstr "expression@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :pointers/expression})

(def groupPointer
  "A Pointer that is part of a Group"
  {:db/ident           :pointers/groupPointer,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "A Pointer that is part of a Group@en",
   :rdfs/domain        :pointers/PointersGroup,
   :rdfs/label         #voc/lstr "groupPointer@en",
   :rdfs/range         :pointers/Pointer,
   :rdfs/subPropertyOf :pointers/groupPointer})

(def lineNumber
  "Line number within the reference starting at one."
  {:db/ident :pointers/lineNumber,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "Line number within the reference starting at one.\n\t\t@en",
   :rdfs/domain :pointers/LineCharPointer,
   :rdfs/label #voc/lstr "line number@en",
   :rdfs/range :xsd/positiveInteger,
   :rdfs/subPropertyOf :pointers/lineNumber})

(def namespace
  "The namespace being used for the XPath expression."
  {:db/ident           :pointers/namespace,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "The namespace being used for the XPath expression.@en",
   :rdfs/domain        :pointers/XPathPointer,
   :rdfs/label         #voc/lstr "namespace@en",
   :rdfs/range         :pointers/XMLNamespace,
   :rdfs/subPropertyOf :pointers/namespace})

(def namespaceName
  "The namespace name being used for an XML Namespace."
  {:db/ident :pointers/namespaceName,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "The namespace name being used for an XML Namespace.@en",
   :rdfs/domain :pointers/XMLNamespace,
   :rdfs/label #voc/lstr "namespace name@en",
   :rdfs/subPropertyOf :pointers/namespaceName})

(def offset
  "Offset from the start of the reference."
  {:db/ident           :pointers/offset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Offset from the start of the reference.@en",
   :rdfs/domain        :pointers/OffsetPointer,
   :rdfs/label         #voc/lstr "offset@en",
   :rdfs/range         :xsd/positiveInteger,
   :rdfs/subPropertyOf :pointers/offset})

(def prefix
  "The namespace prefix being used for an XML Namespace."
  {:db/ident :pointers/prefix,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "The namespace prefix being used for an XML Namespace.@en",
   :rdfs/domain :pointers/XMLNamespace,
   :rdfs/label #voc/lstr "prefix@en",
   :rdfs/subPropertyOf :pointers/prefix})

(def reference
  "Scope within which a single pointer operates."
  {:db/ident           :pointers/reference,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "Scope within which a single pointer operates.@en",
   :rdfs/domain        :pointers/SinglePointer,
   :rdfs/label         #voc/lstr "reference@en",
   :rdfs/subPropertyOf :pointers/reference})

(def startPointer
  "Pointer to the start point of the range in a compound pointer."
  {:db/ident :pointers/startPointer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Pointer to the start point of the range in a compound pointer.@en",
   :rdfs/domain :pointers/CompoundPointer,
   :rdfs/label #voc/lstr "start pointer@en",
   :rdfs/range :pointers/SinglePointer,
   :rdfs/subPropertyOf :pointers/startPointer})

(def version
  "Version for the expression language being used."
  {:db/ident           :pointers/version,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "Version for the expression language being used.@en",
   :rdfs/domain        :pointers/ExpressionPointer,
   :rdfs/label         #voc/lstr "version@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :pointers/version})