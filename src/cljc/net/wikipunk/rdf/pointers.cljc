(ns net.wikipunk.rdf.pointers
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
   #xsd/langString
    "Pointer to a byte range with a defined start and a byte offset from there.@en",
   :rdfs/label #xsd/langString "Byte Offset Compound Pointer@en",
   :rdfs/subClassOf
   [:pointers/CompoundPointer :pointers/Pointer :rdfs/Resource]})

(def ByteOffsetPointer
  "Single pointer using a byte offset from the start of the reference."
  {:db/ident :pointers/ByteOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Single pointer using a byte offset from the start of the reference.@en",
   :rdfs/label #xsd/langString "Byte Offset Pointer@en",
   :rdfs/subClassOf [:pointers/OffsetPointer
                     :pointers/Pointer
                     :rdfs/Resource
                     :pointers/SinglePointer]})

(def ByteSnippetCompoundPointer
  "Pointer to a range with a defined start and a byte snippet from there."
  {:db/ident :pointers/ByteSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Pointer to a range with a defined start and a byte snippet from there.@en",
   :rdfs/label #xsd/langString "Byte Snippet Compound Pointer@en",
   :rdfs/subClassOf
   [:pointers/CompoundPointer :pointers/Pointer :rdfs/Resource]})

(def CSSSelectorPointer
  "Single pointer using a CSS selector."
  {:db/ident        :pointers/CSSSelectorPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString "Single pointer using a CSS selector.@en",
   :rdfs/label      #xsd/langString "CSS selector Pointer@en",
   :rdfs/subClassOf [:pointers/ExpressionPointer
                     :pointers/Pointer
                     :rdfs/Resource
                     :pointers/SinglePointer]})

(def CharOffsetCompoundPointer
  "Pointer to a char range with a defined start and a char offset from there."
  {:db/ident :pointers/CharOffsetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Pointer to a char range with a defined start and a char offset from there.@en",
   :rdfs/label #xsd/langString "Char Offset Compound Pointer@en",
   :rdfs/subClassOf
   [:pointers/CompoundPointer :pointers/Pointer :rdfs/Resource]})

(def CharOffsetPointer
  "Single pointer using a character offset from the start of the reference."
  {:db/ident :pointers/CharOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Single pointer using a character offset from the start of the reference.@en",
   :rdfs/label #xsd/langString "Char Offset Pointer@en",
   :rdfs/subClassOf [:pointers/OffsetPointer
                     :pointers/Pointer
                     :rdfs/Resource
                     :pointers/SinglePointer]})

(def CharSnippetCompoundPointer
  "Pointer to a range with a defined start and a character snippet from there."
  {:db/ident :pointers/CharSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Pointer to a range with a defined start and a character snippet from there.@en",
   :rdfs/label #xsd/langString "Char Snippet Compound Pointer@en",
   :rdfs/subClassOf
   [:rdfs/Resource :pointers/CompoundPointer :pointers/Pointer]})

(def CompoundPointer
  "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility."
  {:db/ident :pointers/CompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility.@en",
   :rdfs/label #xsd/langString "Compound Pointer@en",
   :rdfs/subClassOf [:pointers/Pointer :rdfs/Resource]})

(def EquivalentPointers
  "Group of equivalent pointers that point to the same places."
  {:db/ident :pointers/EquivalentPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Group of equivalent pointers that point to the same places.@en",
   :rdfs/label #xsd/langString "Equivalent Pointers@en",
   :rdfs/subClassOf [:pointers/PointersGroup :pointers/Pointer :rdfs/Resource]})

(def ExpressionPointer
  "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc."
  {:db/ident :pointers/ExpressionPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc.@en",
   :rdfs/label #xsd/langString "Expression Pointer@en",
   :rdfs/subClassOf [:pointers/SinglePointer :pointers/Pointer :rdfs/Resource]})

(def LineCharPointer
  "Single pointer using line and char numbers."
  {:db/ident        :pointers/LineCharPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString
                     "Single pointer using line and char numbers.@en",
   :rdfs/label      #xsd/langString "Line-Char Pointer@en",
   :rdfs/subClassOf [:pointers/SinglePointer :pointers/Pointer :rdfs/Resource]})

(def OffsetPointer
  "Generic single pointer based on an offset."
  {:db/ident        :pointers/OffsetPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString
                     "Generic single pointer based on an offset.@en",
   :rdfs/label      #xsd/langString "Offset Pointer@en",
   :rdfs/subClassOf [:pointers/SinglePointer :pointers/Pointer :rdfs/Resource]})

(def Pointer
  "Abstract Pointer to be subclassed for extensibility."
  {:db/ident        :pointers/Pointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString
                     "Abstract Pointer to be subclassed for extensibility.@en",
   :rdfs/label      #xsd/langString "Pointer@en",
   :rdfs/subClassOf :rdfs/Resource})

(def PointersGroup
  "Generic container for a group of Pointers"
  {:db/ident        :pointers/PointersGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString
                     "Generic container for a group of Pointers@en",
   :rdfs/label      #xsd/langString "Pointers Group@en",
   :rdfs/subClassOf [:rdfs/Resource :pointers/Pointer]})

(def RelatedPointers
  "Group of related pointers you use together for some purpose."
  {:db/ident :pointers/RelatedPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Group of related pointers you use together for some purpose.@en",
   :rdfs/label #xsd/langString "Related Pointers@en",
   :rdfs/subClassOf [:pointers/PointersGroup :pointers/Pointer :rdfs/Resource]})

(def SinglePointer
  "Abstract pointer to a single point to be subclassed for extensibility."
  {:db/ident :pointers/SinglePointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Abstract pointer to a single point to be subclassed for extensibility.@en",
   :rdfs/label #xsd/langString "Single Pointer@en",
   :rdfs/subClassOf [:pointers/Pointer :rdfs/Resource]})

(def StartEndPointer
  "Compound pointer to a range with a start and an end point."
  {:db/ident :pointers/StartEndPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Compound pointer to a range with a start and an end point.@en",
   :rdfs/label #xsd/langString "Start-End Pointer@en",
   :rdfs/subClassOf
   [:pointers/CompoundPointer :pointers/Pointer :rdfs/Resource]})

(def XMLNamespace
  "An XML Namespace."
  {:db/ident        :pointers/XMLNamespace,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString "An XML Namespace.@en",
   :rdfs/label      #xsd/langString "XMLNamespace@en",
   :rdfs/subClassOf :rdfs/Resource})

(def XPathPointer
  "Single pointer using an XPath expression."
  {:db/ident        :pointers/XPathPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString
                     "Single pointer using an XPath expression.@en",
   :rdfs/label      #xsd/langString "XPath Pointer@en",
   :rdfs/subClassOf [:pointers/ExpressionPointer
                     :pointers/Pointer
                     :rdfs/Resource
                     :pointers/SinglePointer]})

(def XPointerPointer
  "Single pointer using an XPointer expression."
  {:db/ident        :pointers/XPointerPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #xsd/langString
                     "Single pointer using an XPointer expression.@en",
   :rdfs/label      #xsd/langString "XPointer Pointer@en",
   :rdfs/subClassOf [:pointers/XPathPointer
                     :pointers/Pointer
                     :pointers/ExpressionPointer
                     :rdfs/Resource
                     :pointers/SinglePointer]})

(def byteOffset
  "Number of bytes counting from the start point."
  {:db/ident     :pointers/byteOffset,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Number of bytes counting from the start point.",
   :rdfs/domain  :pointers/ByteOffsetCompoundPointer,
   :rdfs/label   "byte offset",
   :rdfs/range   :xsd/positiveInteger})

(def charNumber
  "Char number within a line starting at one.\n\t\t"
  {:db/ident     :pointers/charNumber,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "Char number within a line starting at one.\n\t\t@en",
   :rdfs/domain  :pointers/LineCharPointer,
   :rdfs/label   #xsd/langString "char number@en",
   :rdfs/range   :xsd/positiveInteger})

(def charOffset
  "Number of characters counting from the start point."
  {:db/ident     :pointers/charOffset,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "Number of characters counting from the start point.@en",
   :rdfs/domain  :pointers/CharOffsetCompoundPointer,
   :rdfs/label   #xsd/langString "char offset@en",
   :rdfs/range   :xsd/positiveInteger})

(def endPointer
  "Pointer to the end point of the range."
  {:db/ident     :pointers/endPointer,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString "Pointer to the end point of the range.@en",
   :rdfs/domain  :pointers/StartEndPointer,
   :rdfs/label   #xsd/langString "end pointer@en",
   :rdfs/range   :pointers/SinglePointer})

(def expression
  "Expressions, such as xPath or CSS selectors, that identify points."
  {:db/ident :pointers/expression,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Expressions, such as xPath or CSS selectors, that identify points.@en",
   :rdfs/domain :pointers/ExpressionPointer,
   :rdfs/label #xsd/langString "expression@en",
   :rdfs/range :rdfs/Literal})

(def groupPointer
  "A Pointer that is part of a Group"
  {:db/ident     :pointers/groupPointer,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString "A Pointer that is part of a Group@en",
   :rdfs/domain  :pointers/PointersGroup,
   :rdfs/label   #xsd/langString "groupPointer@en",
   :rdfs/range   :pointers/Pointer})

(def lineNumber
  "Line number within the reference starting at one.\n\t\t"
  {:db/ident     :pointers/lineNumber,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "Line number within the reference starting at one.\n\t\t@en",
   :rdfs/domain  :pointers/LineCharPointer,
   :rdfs/label   #xsd/langString "line number@en",
   :rdfs/range   :xsd/positiveInteger})

(def namespace
  "The namespace being used for the XPath expression."
  {:db/ident     :pointers/namespace,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "The namespace being used for the XPath expression.@en",
   :rdfs/domain  :pointers/XPathPointer,
   :rdfs/label   #xsd/langString "namespace@en",
   :rdfs/range   :pointers/XMLNamespace})

(def namespaceName
  "The namespace name being used for an XML Namespace."
  {:db/ident     :pointers/namespaceName,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "The namespace name being used for an XML Namespace.@en",
   :rdfs/domain  :pointers/XMLNamespace,
   :rdfs/label   #xsd/langString "namespace name@en"})

(def offset
  "Offset from the start of the reference."
  {:db/ident     :pointers/offset,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString "Offset from the start of the reference.@en",
   :rdfs/domain  :pointers/OffsetPointer,
   :rdfs/label   #xsd/langString "offset@en",
   :rdfs/range   :xsd/positiveInteger})

(def prefix
  "The namespace prefix being used for an XML Namespace."
  {:db/ident     :pointers/prefix,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "The namespace prefix being used for an XML Namespace.@en",
   :rdfs/domain  :pointers/XMLNamespace,
   :rdfs/label   #xsd/langString "prefix@en"})

(def reference
  "Scope within which a single pointer operates."
  {:db/ident     :pointers/reference,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "Scope within which a single pointer operates.@en",
   :rdfs/domain  :pointers/SinglePointer,
   :rdfs/label   #xsd/langString "reference@en"})

(def startPointer
  "Pointer to the start point of the range in a compound pointer."
  {:db/ident :pointers/startPointer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Pointer to the start point of the range in a compound pointer.@en",
   :rdfs/domain :pointers/CompoundPointer,
   :rdfs/label #xsd/langString "start pointer@en",
   :rdfs/range :pointers/SinglePointer})

(def version
  "Version for the expression language being used."
  {:db/ident     :pointers/version,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "Version for the expression language being used.@en",
   :rdfs/domain  :pointers/ExpressionPointer,
   :rdfs/label   #xsd/langString "version@en",
   :rdfs/range   :rdfs/Literal})