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
   "Pointer to a byte range with a defined start and a byte offset from there.",
   :rdfs/label "Byte Offset Compound Pointer",
   :rdfs/subClassOf [:pointers/CompoundPointer
                     :pointers/ByteOffsetCompoundPointer
                     :pointers/Pointer
                     :rdfs/Resource]})

(def ByteOffsetPointer
  "Single pointer using a byte offset from the start of the reference."
  {:db/ident :pointers/ByteOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Single pointer using a byte offset from the start of the reference.",
   :rdfs/label "Byte Offset Pointer",
   :rdfs/subClassOf [:pointers/OffsetPointer
                     :pointers/ByteOffsetPointer
                     :pointers/SinglePointer
                     :pointers/Pointer
                     :rdfs/Resource]})

(def ByteSnippetCompoundPointer
  "Pointer to a range with a defined start and a byte snippet from there."
  {:db/ident :pointers/ByteSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Pointer to a range with a defined start and a byte snippet from there.",
   :rdfs/label "Byte Snippet Compound Pointer",
   :rdfs/subClassOf [:pointers/CompoundPointer
                     :pointers/ByteSnippetCompoundPointer
                     :pointers/Pointer
                     :rdfs/Resource]})

(def CSSSelectorPointer
  "Single pointer using a CSS selector."
  {:db/ident        :pointers/CSSSelectorPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Single pointer using a CSS selector.",
   :rdfs/label      "CSS selector Pointer",
   :rdfs/subClassOf [:pointers/ExpressionPointer
                     :pointers/CSSSelectorPointer
                     :pointers/SinglePointer
                     :pointers/Pointer
                     :rdfs/Resource]})

(def CharOffsetCompoundPointer
  "Pointer to a char range with a defined start and a char offset from there."
  {:db/ident :pointers/CharOffsetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Pointer to a char range with a defined start and a char offset from there.",
   :rdfs/label "Char Offset Compound Pointer",
   :rdfs/subClassOf [:pointers/CompoundPointer
                     :pointers/CharOffsetCompoundPointer
                     :pointers/Pointer
                     :rdfs/Resource]})

(def CharOffsetPointer
  "Single pointer using a character offset from the start of the reference."
  {:db/ident :pointers/CharOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Single pointer using a character offset from the start of the reference.",
   :rdfs/label "Char Offset Pointer",
   :rdfs/subClassOf [:pointers/OffsetPointer
                     :pointers/CharOffsetPointer
                     :pointers/SinglePointer
                     :pointers/Pointer
                     :rdfs/Resource]})

(def CharSnippetCompoundPointer
  "Pointer to a range with a defined start and a character snippet from there."
  {:db/ident :pointers/CharSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Pointer to a range with a defined start and a character snippet from there.",
   :rdfs/label "Char Snippet Compound Pointer",
   :rdfs/subClassOf [:rdfs/Resource
                     :pointers/CompoundPointer
                     :pointers/CharSnippetCompoundPointer
                     :pointers/Pointer]})

(def CompoundPointer
  "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility."
  {:db/ident :pointers/CompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility.",
   :rdfs/label "Compound Pointer",
   :rdfs/subClassOf
   [:pointers/Pointer :pointers/CompoundPointer :rdfs/Resource]})

(def EquivalentPointers
  "Group of equivalent pointers that point to the same places."
  {:db/ident :pointers/EquivalentPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment "Group of equivalent pointers that point to the same places.",
   :rdfs/label "Equivalent Pointers",
   :rdfs/subClassOf [:pointers/PointersGroup
                     :pointers/EquivalentPointers
                     :pointers/Pointer
                     :rdfs/Resource]})

(def ExpressionPointer
  "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc."
  {:db/ident :pointers/ExpressionPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc.",
   :rdfs/label "Expression Pointer",
   :rdfs/subClassOf [:pointers/SinglePointer
                     :pointers/ExpressionPointer
                     :pointers/Pointer
                     :rdfs/Resource]})

(def LineCharPointer
  "Single pointer using line and char numbers."
  {:db/ident        :pointers/LineCharPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Single pointer using line and char numbers.",
   :rdfs/label      "Line-Char Pointer",
   :rdfs/subClassOf [:pointers/SinglePointer
                     :pointers/LineCharPointer
                     :pointers/Pointer
                     :rdfs/Resource]})

(def OffsetPointer
  "Generic single pointer based on an offset."
  {:db/ident        :pointers/OffsetPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Generic single pointer based on an offset.",
   :rdfs/label      "Offset Pointer",
   :rdfs/subClassOf [:pointers/SinglePointer
                     :pointers/OffsetPointer
                     :pointers/Pointer
                     :rdfs/Resource]})

(def Pointer
  "Abstract Pointer to be subclassed for extensibility."
  {:db/ident        :pointers/Pointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Abstract Pointer to be subclassed for extensibility.",
   :rdfs/label      "Pointer",
   :rdfs/subClassOf [:rdfs/Resource :pointers/Pointer]})

(def PointersGroup
  "Generic container for a group of Pointers"
  {:db/ident        :pointers/PointersGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Generic container for a group of Pointers",
   :rdfs/label      "Pointers Group",
   :rdfs/subClassOf [:rdfs/Resource :pointers/Pointer :pointers/PointersGroup]})

(def RelatedPointers
  "Group of related pointers you use together for some purpose."
  {:db/ident :pointers/RelatedPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment "Group of related pointers you use together for some purpose.",
   :rdfs/label "Related Pointers",
   :rdfs/subClassOf [:pointers/PointersGroup
                     :pointers/RelatedPointers
                     :pointers/Pointer
                     :rdfs/Resource]})

(def SinglePointer
  "Abstract pointer to a single point to be subclassed for extensibility."
  {:db/ident :pointers/SinglePointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Abstract pointer to a single point to be subclassed for extensibility.",
   :rdfs/label "Single Pointer",
   :rdfs/subClassOf [:pointers/Pointer :pointers/SinglePointer :rdfs/Resource]})

(def StartEndPointer
  "Compound pointer to a range with a start and an end point."
  {:db/ident :pointers/StartEndPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment "Compound pointer to a range with a start and an end point.",
   :rdfs/label "Start-End Pointer",
   :rdfs/subClassOf [:pointers/CompoundPointer
                     :pointers/StartEndPointer
                     :pointers/Pointer
                     :rdfs/Resource]})

(def XMLNamespace
  "An XML Namespace."
  {:db/ident        :pointers/XMLNamespace,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An XML Namespace.",
   :rdfs/label      "XMLNamespace",
   :rdfs/subClassOf [:rdfs/Resource :pointers/XMLNamespace]})

(def XPathPointer
  "Single pointer using an XPath expression."
  {:db/ident        :pointers/XPathPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Single pointer using an XPath expression.",
   :rdfs/label      "XPath Pointer",
   :rdfs/subClassOf [:pointers/ExpressionPointer
                     :pointers/XPathPointer
                     :pointers/SinglePointer
                     :pointers/Pointer
                     :rdfs/Resource]})

(def XPointerPointer
  "Single pointer using an XPointer expression."
  {:db/ident        :pointers/XPointerPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Single pointer using an XPointer expression.",
   :rdfs/label      "XPointer Pointer",
   :rdfs/subClassOf [:pointers/XPathPointer
                     :pointers/XPointerPointer
                     :pointers/SinglePointer
                     :pointers/ExpressionPointer
                     :pointers/Pointer
                     :rdfs/Resource]})

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
   :rdfs/comment       "Char number within a line starting at one.\n\t\t",
   :rdfs/domain        :pointers/LineCharPointer,
   :rdfs/label         "char number",
   :rdfs/range         :xsd/positiveInteger,
   :rdfs/subPropertyOf :pointers/charNumber})

(def charOffset
  "Number of characters counting from the start point."
  {:db/ident           :pointers/charOffset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Number of characters counting from the start point.",
   :rdfs/domain        :pointers/CharOffsetCompoundPointer,
   :rdfs/label         "char offset",
   :rdfs/range         :xsd/positiveInteger,
   :rdfs/subPropertyOf :pointers/charOffset})

(def endPointer
  "Pointer to the end point of the range."
  {:db/ident           :pointers/endPointer,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Pointer to the end point of the range.",
   :rdfs/domain        :pointers/StartEndPointer,
   :rdfs/label         "end pointer",
   :rdfs/range         :pointers/SinglePointer,
   :rdfs/subPropertyOf :pointers/endPointer})

(def expression
  "Expressions, such as xPath or CSS selectors, that identify points."
  {:db/ident :pointers/expression,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Expressions, such as xPath or CSS selectors, that identify points.",
   :rdfs/domain :pointers/ExpressionPointer,
   :rdfs/label "expression",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :pointers/expression})

(def groupPointer
  "A Pointer that is part of a Group"
  {:db/ident           :pointers/groupPointer,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A Pointer that is part of a Group",
   :rdfs/domain        :pointers/PointersGroup,
   :rdfs/label         "groupPointer",
   :rdfs/range         :pointers/Pointer,
   :rdfs/subPropertyOf :pointers/groupPointer})

(def lineNumber
  "Line number within the reference starting at one."
  {:db/ident :pointers/lineNumber,
   :rdf/type :rdf/Property,
   :rdfs/comment "Line number within the reference starting at one.\n\t\t",
   :rdfs/domain :pointers/LineCharPointer,
   :rdfs/label "line number",
   :rdfs/range :xsd/positiveInteger,
   :rdfs/subPropertyOf :pointers/lineNumber})

(def namespace
  "The namespace being used for the XPath expression."
  {:db/ident           :pointers/namespace,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The namespace being used for the XPath expression.",
   :rdfs/domain        :pointers/XPathPointer,
   :rdfs/label         "namespace",
   :rdfs/range         :pointers/XMLNamespace,
   :rdfs/subPropertyOf :pointers/namespace})

(def namespaceName
  "The namespace name being used for an XML Namespace."
  {:db/ident           :pointers/namespaceName,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The namespace name being used for an XML Namespace.",
   :rdfs/domain        :pointers/XMLNamespace,
   :rdfs/label         "namespace name",
   :rdfs/subPropertyOf :pointers/namespaceName})

(def offset
  "Offset from the start of the reference."
  {:db/ident           :pointers/offset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Offset from the start of the reference.",
   :rdfs/domain        :pointers/OffsetPointer,
   :rdfs/label         "offset",
   :rdfs/range         :xsd/positiveInteger,
   :rdfs/subPropertyOf :pointers/offset})

(def prefix
  "The namespace prefix being used for an XML Namespace."
  {:db/ident           :pointers/prefix,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The namespace prefix being used for an XML Namespace.",
   :rdfs/domain        :pointers/XMLNamespace,
   :rdfs/label         "prefix",
   :rdfs/subPropertyOf :pointers/prefix})

(def reference
  "Scope within which a single pointer operates."
  {:db/ident           :pointers/reference,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Scope within which a single pointer operates.",
   :rdfs/domain        :pointers/SinglePointer,
   :rdfs/label         "reference",
   :rdfs/subPropertyOf :pointers/reference})

(def startPointer
  "Pointer to the start point of the range in a compound pointer."
  {:db/ident :pointers/startPointer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Pointer to the start point of the range in a compound pointer.",
   :rdfs/domain :pointers/CompoundPointer,
   :rdfs/label "start pointer",
   :rdfs/range :pointers/SinglePointer,
   :rdfs/subPropertyOf :pointers/startPointer})

(def version
  "Version for the expression language being used."
  {:db/ident           :pointers/version,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Version for the expression language being used.",
   :rdfs/domain        :pointers/ExpressionPointer,
   :rdfs/label         "version",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :pointers/version})