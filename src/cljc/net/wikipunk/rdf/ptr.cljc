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
   {:rdf/language "en",
    :rdf/value
    "Pointer to a byte range with a defined start and a byte offset from there."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Byte Offset Compound Pointer"},
   :rdfs/subClassOf :ptr/CompoundPointer})

(def ByteOffsetPointer
  "Single pointer using a byte offset from the start of the reference."
  {:db/ident :ptr/ByteOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Single pointer using a byte offset from the start of the reference."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Byte Offset Pointer"},
   :rdfs/subClassOf :ptr/OffsetPointer})

(def ByteSnippetCompoundPointer
  "Pointer to a range with a defined start and a byte snippet from there."
  {:db/ident :ptr/ByteSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Pointer to a range with a defined start and a byte snippet from there."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Byte Snippet Compound Pointer"},
   :rdfs/subClassOf :ptr/CompoundPointer})

(def CSSSelectorPointer
  "Single pointer using a CSS selector."
  {:db/ident        :ptr/CSSSelectorPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Single pointer using a CSS selector."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "CSS selector Pointer"},
   :rdfs/subClassOf :ptr/ExpressionPointer})

(def CharOffsetCompoundPointer
  "Pointer to a char range with a defined start and a char offset from there."
  {:db/ident :ptr/CharOffsetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Pointer to a char range with a defined start and a char offset from there."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Char Offset Compound Pointer"},
   :rdfs/subClassOf :ptr/CompoundPointer})

(def CharOffsetPointer
  "Single pointer using a character offset from the start of the reference."
  {:db/ident :ptr/CharOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Single pointer using a character offset from the start of the reference."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Char Offset Pointer"},
   :rdfs/subClassOf :ptr/OffsetPointer})

(def CharSnippetCompoundPointer
  "Pointer to a range with a defined start and a character snippet from there."
  {:db/ident :ptr/CharSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Pointer to a range with a defined start and a character snippet from there."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Char Snippet Compound Pointer"},
   :rdfs/subClassOf :ptr/CompoundPointer})

(def CompoundPointer
  "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility."
  {:db/ident :ptr/CompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compound Pointer"},
   :rdfs/subClassOf :ptr/Pointer})

(def EquivalentPointers
  "Group of equivalent pointers that point to the same places."
  {:db/ident :ptr/EquivalentPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Group of equivalent pointers that point to the same places."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Equivalent Pointers"},
   :rdfs/subClassOf :ptr/PointersGroup})

(def ExpressionPointer
  "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc."
  {:db/ident :ptr/ExpressionPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Expression Pointer"},
   :rdfs/subClassOf :ptr/SinglePointer})

(def LineCharPointer
  "Single pointer using line and char numbers."
  {:db/ident        :ptr/LineCharPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value "Single pointer using line and char numbers."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Line-Char Pointer"},
   :rdfs/subClassOf :ptr/SinglePointer})

(def OffsetPointer
  "Generic single pointer based on an offset."
  {:db/ident        :ptr/OffsetPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value "Generic single pointer based on an offset."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Offset Pointer"},
   :rdfs/subClassOf :ptr/SinglePointer})

(def Pointer
  "Abstract Pointer to be subclassed for extensibility."
  {:db/ident     :ptr/Pointer,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Abstract Pointer to be subclassed for extensibility."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Pointer"}})

(def PointersGroup
  "Generic container for a group of Pointers"
  {:db/ident        :ptr/PointersGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Generic container for a group of Pointers"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Pointers Group"},
   :rdfs/subClassOf :ptr/Pointer})

(def RelatedPointers
  "Group of related pointers you use together for some purpose."
  {:db/ident :ptr/RelatedPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Group of related pointers you use together for some purpose."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Related Pointers"},
   :rdfs/subClassOf :ptr/PointersGroup})

(def SinglePointer
  "Abstract pointer to a single point to be subclassed for extensibility."
  {:db/ident :ptr/SinglePointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Abstract pointer to a single point to be subclassed for extensibility."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Single Pointer"},
   :rdfs/subClassOf :ptr/Pointer})

(def StartEndPointer
  "Compound pointer to a range with a start and an end point."
  {:db/ident :ptr/StartEndPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Compound pointer to a range with a start and an end point."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Start-End Pointer"},
   :rdfs/subClassOf :ptr/CompoundPointer})

(def XMLNamespace
  "An XML Namespace."
  {:db/ident     :ptr/XMLNamespace,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "An XML Namespace."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "XMLNamespace"}})

(def XPathPointer
  "Single pointer using an XPath expression."
  {:db/ident        :ptr/XPathPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Single pointer using an XPath expression."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "XPath Pointer"},
   :rdfs/subClassOf :ptr/ExpressionPointer})

(def XPointerPointer
  "Single pointer using an XPointer expression."
  {:db/ident        :ptr/XPointerPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value "Single pointer using an XPointer expression."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "XPointer Pointer"},
   :rdfs/subClassOf :ptr/XPathPointer})

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
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Char number within a line starting at one.\n\t\t"},
   :rdfs/domain  :ptr/LineCharPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "char number"},
   :rdfs/range   :xsd/positiveInteger})

(def charOffset
  "Number of characters counting from the start point."
  {:db/ident     :ptr/charOffset,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Number of characters counting from the start point."},
   :rdfs/domain  :ptr/CharOffsetCompoundPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "char offset"},
   :rdfs/range   :xsd/positiveInteger})

(def endPointer
  "Pointer to the end point of the range."
  {:db/ident     :ptr/endPointer,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Pointer to the end point of the range."},
   :rdfs/domain  :ptr/StartEndPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "end pointer"},
   :rdfs/range   :ptr/SinglePointer})

(def expression
  "Expressions, such as xPath or CSS selectors, that identify points."
  {:db/ident :ptr/expression,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Expressions, such as xPath or CSS selectors, that identify points."},
   :rdfs/domain :ptr/ExpressionPointer,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expression"},
   :rdfs/range :rdfs/Literal})

(def groupPointer
  "A Pointer that is part of a Group"
  {:db/ident     :ptr/groupPointer,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A Pointer that is part of a Group"},
   :rdfs/domain  :ptr/PointersGroup,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "groupPointer"},
   :rdfs/range   :ptr/Pointer})

(def lineNumber
  "Line number within the reference starting at one.\n\t\t"
  {:db/ident     :ptr/lineNumber,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Line number within the reference starting at one.\n\t\t"},
   :rdfs/domain  :ptr/LineCharPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "line number"},
   :rdfs/range   :xsd/positiveInteger})

(def namespace
  "The namespace being used for the XPath expression."
  {:db/ident     :ptr/namespace,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The namespace being used for the XPath expression."},
   :rdfs/domain  :ptr/XPathPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "namespace"},
   :rdfs/range   :ptr/XMLNamespace})

(def namespaceName
  "The namespace name being used for an XML Namespace."
  {:db/ident     :ptr/namespaceName,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The namespace name being used for an XML Namespace."},
   :rdfs/domain  :ptr/XMLNamespace,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "namespace name"}})

(def offset
  "Offset from the start of the reference."
  {:db/ident     :ptr/offset,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Offset from the start of the reference."},
   :rdfs/domain  :ptr/OffsetPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "offset"},
   :rdfs/range   :xsd/positiveInteger})

(def prefix
  "The namespace prefix being used for an XML Namespace."
  {:db/ident     :ptr/prefix,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The namespace prefix being used for an XML Namespace."},
   :rdfs/domain  :ptr/XMLNamespace,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "prefix"}})

(def reference
  "Scope within which a single pointer operates."
  {:db/ident     :ptr/reference,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "Scope within which a single pointer operates."},
   :rdfs/domain  :ptr/SinglePointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "reference"}})

(def startPointer
  "Pointer to the start point of the range in a compound pointer."
  {:db/ident :ptr/startPointer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Pointer to the start point of the range in a compound pointer."},
   :rdfs/domain :ptr/CompoundPointer,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "start pointer"},
   :rdfs/range :ptr/SinglePointer})

(def version
  "Version for the expression language being used."
  {:db/ident     :ptr/version,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "Version for the expression language being used."},
   :rdfs/domain  :ptr/ExpressionPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "version"},
   :rdfs/range   :rdfs/Literal})