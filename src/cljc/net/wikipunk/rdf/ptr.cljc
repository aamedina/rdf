(ns net.wikipunk.rdf.ptr
  {:rdf/ns-prefix-map {"ptr"  "http://www.w3.org/2009/pointers#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "ptr",
   :rdfa/uri          "http://www.w3.org/2009/pointers#"}
  (:refer-clojure :exclude [namespace]))

(def ByteOffsetCompoundPointer
  "Pointer to a byte range with a defined start and a byte offset from there."
  {:db/ident :ptr/ByteOffsetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Pointer to a byte range with a defined start and a byte offset from there.@en",
   :rdfs/label #rdf/langString "Byte Offset Compound Pointer@en",
   :rdfs/subClassOf [:ptr/CompoundPointer :ptr/Pointer :rdfs/Resource]})

(def ByteOffsetPointer
  "Single pointer using a byte offset from the start of the reference."
  {:db/ident :ptr/ByteOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Single pointer using a byte offset from the start of the reference.@en",
   :rdfs/label #rdf/langString "Byte Offset Pointer@en",
   :rdfs/subClassOf
   [:ptr/OffsetPointer :ptr/SinglePointer :ptr/Pointer :rdfs/Resource]})

(def ByteSnippetCompoundPointer
  "Pointer to a range with a defined start and a byte snippet from there."
  {:db/ident :ptr/ByteSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Pointer to a range with a defined start and a byte snippet from there.@en",
   :rdfs/label #rdf/langString "Byte Snippet Compound Pointer@en",
   :rdfs/subClassOf [:ptr/CompoundPointer :ptr/Pointer :rdfs/Resource]})

(def CSSSelectorPointer
  "Single pointer using a CSS selector."
  {:db/ident        :ptr/CSSSelectorPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #rdf/langString "Single pointer using a CSS selector.@en",
   :rdfs/label      #rdf/langString "CSS selector Pointer@en",
   :rdfs/subClassOf [:ptr/ExpressionPointer
                     :ptr/SinglePointer
                     :ptr/Pointer
                     :rdfs/Resource]})

(def CharOffsetCompoundPointer
  "Pointer to a char range with a defined start and a char offset from there."
  {:db/ident :ptr/CharOffsetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Pointer to a char range with a defined start and a char offset from there.@en",
   :rdfs/label #rdf/langString "Char Offset Compound Pointer@en",
   :rdfs/subClassOf [:ptr/CompoundPointer :ptr/Pointer :rdfs/Resource]})

(def CharOffsetPointer
  "Single pointer using a character offset from the start of the reference."
  {:db/ident :ptr/CharOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Single pointer using a character offset from the start of the reference.@en",
   :rdfs/label #rdf/langString "Char Offset Pointer@en",
   :rdfs/subClassOf
   [:ptr/OffsetPointer :ptr/SinglePointer :ptr/Pointer :rdfs/Resource]})

(def CharSnippetCompoundPointer
  "Pointer to a range with a defined start and a character snippet from there."
  {:db/ident :ptr/CharSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Pointer to a range with a defined start and a character snippet from there.@en",
   :rdfs/label #rdf/langString "Char Snippet Compound Pointer@en",
   :rdfs/subClassOf [:rdfs/Resource :ptr/CompoundPointer :ptr/Pointer]})

(def CompoundPointer
  "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility."
  {:db/ident :ptr/CompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility.@en",
   :rdfs/label #rdf/langString "Compound Pointer@en",
   :rdfs/subClassOf [:ptr/Pointer :rdfs/Resource]})

(def EquivalentPointers
  "Group of equivalent pointers that point to the same places."
  {:db/ident :ptr/EquivalentPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Group of equivalent pointers that point to the same places.@en",
   :rdfs/label #rdf/langString "Equivalent Pointers@en",
   :rdfs/subClassOf [:ptr/PointersGroup :ptr/Pointer :rdfs/Resource]})

(def ExpressionPointer
  "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc."
  {:db/ident :ptr/ExpressionPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc.@en",
   :rdfs/label #rdf/langString "Expression Pointer@en",
   :rdfs/subClassOf [:ptr/SinglePointer :ptr/Pointer :rdfs/Resource]})

(def LineCharPointer
  "Single pointer using line and char numbers."
  {:db/ident        :ptr/LineCharPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #rdf/langString
                     "Single pointer using line and char numbers.@en",
   :rdfs/label      #rdf/langString "Line-Char Pointer@en",
   :rdfs/subClassOf [:ptr/SinglePointer :ptr/Pointer :rdfs/Resource]})

(def OffsetPointer
  "Generic single pointer based on an offset."
  {:db/ident        :ptr/OffsetPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #rdf/langString
                     "Generic single pointer based on an offset.@en",
   :rdfs/label      #rdf/langString "Offset Pointer@en",
   :rdfs/subClassOf [:ptr/SinglePointer :ptr/Pointer :rdfs/Resource]})

(def Pointer
  "Abstract Pointer to be subclassed for extensibility."
  {:db/ident        :ptr/Pointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #rdf/langString
                     "Abstract Pointer to be subclassed for extensibility.@en",
   :rdfs/label      #rdf/langString "Pointer@en",
   :rdfs/subClassOf :rdfs/Resource})

(def PointersGroup
  "Generic container for a group of Pointers"
  {:db/ident        :ptr/PointersGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #rdf/langString
                     "Generic container for a group of Pointers@en",
   :rdfs/label      #rdf/langString "Pointers Group@en",
   :rdfs/subClassOf [:rdfs/Resource :ptr/Pointer]})

(def RelatedPointers
  "Group of related pointers you use together for some purpose."
  {:db/ident :ptr/RelatedPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Group of related pointers you use together for some purpose.@en",
   :rdfs/label #rdf/langString "Related Pointers@en",
   :rdfs/subClassOf [:ptr/PointersGroup :ptr/Pointer :rdfs/Resource]})

(def SinglePointer
  "Abstract pointer to a single point to be subclassed for extensibility."
  {:db/ident :ptr/SinglePointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Abstract pointer to a single point to be subclassed for extensibility.@en",
   :rdfs/label #rdf/langString "Single Pointer@en",
   :rdfs/subClassOf [:ptr/Pointer :rdfs/Resource]})

(def StartEndPointer
  "Compound pointer to a range with a start and an end point."
  {:db/ident :ptr/StartEndPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "Compound pointer to a range with a start and an end point.@en",
   :rdfs/label #rdf/langString "Start-End Pointer@en",
   :rdfs/subClassOf [:ptr/CompoundPointer :ptr/Pointer :rdfs/Resource]})

(def XMLNamespace
  "An XML Namespace."
  {:db/ident        :ptr/XMLNamespace,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #rdf/langString "An XML Namespace.@en",
   :rdfs/label      #rdf/langString "XMLNamespace@en",
   :rdfs/subClassOf :rdfs/Resource})

(def XPathPointer
  "Single pointer using an XPath expression."
  {:db/ident        :ptr/XPathPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #rdf/langString
                     "Single pointer using an XPath expression.@en",
   :rdfs/label      #rdf/langString "XPath Pointer@en",
   :rdfs/subClassOf [:ptr/ExpressionPointer
                     :ptr/SinglePointer
                     :ptr/Pointer
                     :rdfs/Resource]})

(def XPointerPointer
  "Single pointer using an XPointer expression."
  {:db/ident        :ptr/XPointerPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #rdf/langString
                     "Single pointer using an XPointer expression.@en",
   :rdfs/label      #rdf/langString "XPointer Pointer@en",
   :rdfs/subClassOf [:ptr/XPathPointer
                     :ptr/SinglePointer
                     :ptr/Pointer
                     :ptr/ExpressionPointer
                     :rdfs/Resource]})

(def byteOffset
  "Number of bytes counting from the start point."
  {:db/ident     :ptr/byteOffset,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Number of bytes counting from the start point.",
   :rdfs/domain  :ptr/ByteOffsetCompoundPointer,
   :rdfs/label   "byte offset",
   :rdfs/range   :xsd/positiveInteger})

(def charNumber
  "Char number within a line starting at one.\n\t\t"
  {:db/ident     :ptr/charNumber,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString
                  "Char number within a line starting at one.\n\t\t@en",
   :rdfs/domain  :ptr/LineCharPointer,
   :rdfs/label   #rdf/langString "char number@en",
   :rdfs/range   :xsd/positiveInteger})

(def charOffset
  "Number of characters counting from the start point."
  {:db/ident     :ptr/charOffset,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString
                  "Number of characters counting from the start point.@en",
   :rdfs/domain  :ptr/CharOffsetCompoundPointer,
   :rdfs/label   #rdf/langString "char offset@en",
   :rdfs/range   :xsd/positiveInteger})

(def endPointer
  "Pointer to the end point of the range."
  {:db/ident     :ptr/endPointer,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString "Pointer to the end point of the range.@en",
   :rdfs/domain  :ptr/StartEndPointer,
   :rdfs/label   #rdf/langString "end pointer@en",
   :rdfs/range   :ptr/SinglePointer})

(def expression
  "Expressions, such as xPath or CSS selectors, that identify points."
  {:db/ident :ptr/expression,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Expressions, such as xPath or CSS selectors, that identify points.@en",
   :rdfs/domain :ptr/ExpressionPointer,
   :rdfs/label #rdf/langString "expression@en",
   :rdfs/range :rdfs/Literal})

(def groupPointer
  "A Pointer that is part of a Group"
  {:db/ident     :ptr/groupPointer,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString "A Pointer that is part of a Group@en",
   :rdfs/domain  :ptr/PointersGroup,
   :rdfs/label   #rdf/langString "groupPointer@en",
   :rdfs/range   :ptr/Pointer})

(def lineNumber
  "Line number within the reference starting at one.\n\t\t"
  {:db/ident     :ptr/lineNumber,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString
                  "Line number within the reference starting at one.\n\t\t@en",
   :rdfs/domain  :ptr/LineCharPointer,
   :rdfs/label   #rdf/langString "line number@en",
   :rdfs/range   :xsd/positiveInteger})

(def namespace
  "The namespace being used for the XPath expression."
  {:db/ident     :ptr/namespace,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString
                  "The namespace being used for the XPath expression.@en",
   :rdfs/domain  :ptr/XPathPointer,
   :rdfs/label   #rdf/langString "namespace@en",
   :rdfs/range   :ptr/XMLNamespace})

(def namespaceName
  "The namespace name being used for an XML Namespace."
  {:db/ident     :ptr/namespaceName,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString
                  "The namespace name being used for an XML Namespace.@en",
   :rdfs/domain  :ptr/XMLNamespace,
   :rdfs/label   #rdf/langString "namespace name@en"})

(def offset
  "Offset from the start of the reference."
  {:db/ident     :ptr/offset,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString "Offset from the start of the reference.@en",
   :rdfs/domain  :ptr/OffsetPointer,
   :rdfs/label   #rdf/langString "offset@en",
   :rdfs/range   :xsd/positiveInteger})

(def prefix
  "The namespace prefix being used for an XML Namespace."
  {:db/ident     :ptr/prefix,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString
                  "The namespace prefix being used for an XML Namespace.@en",
   :rdfs/domain  :ptr/XMLNamespace,
   :rdfs/label   #rdf/langString "prefix@en"})

(def reference
  "Scope within which a single pointer operates."
  {:db/ident     :ptr/reference,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString
                  "Scope within which a single pointer operates.@en",
   :rdfs/domain  :ptr/SinglePointer,
   :rdfs/label   #rdf/langString "reference@en"})

(def startPointer
  "Pointer to the start point of the range in a compound pointer."
  {:db/ident :ptr/startPointer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Pointer to the start point of the range in a compound pointer.@en",
   :rdfs/domain :ptr/CompoundPointer,
   :rdfs/label #rdf/langString "start pointer@en",
   :rdfs/range :ptr/SinglePointer})

(def version
  "Version for the expression language being used."
  {:db/ident     :ptr/version,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString
                  "Version for the expression language being used.@en",
   :rdfs/domain  :ptr/ExpressionPointer,
   :rdfs/label   #rdf/langString "version@en",
   :rdfs/range   :rdfs/Literal})
