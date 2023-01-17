(ns net.wikipunk.rdf.pointers
  "http://www.w3.org/2009/pointers#"
  {:rdf/ns-prefix-map {"pointers" "http://www.w3.org/2009/pointers#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "pointers",
   :rdfa/uri          "http://www.w3.org/2009/pointers#"}
  (:refer-clojure :exclude [namespace]))

(def ByteOffsetCompoundPointer
  "Pointer to a byte range with a defined start and a byte offset from there."
  {:db/ident :pointers/ByteOffsetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Pointer to a byte range with a defined start and a byte offset from there."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Byte Offset Compound Pointer"},
   :rdfs/subClassOf :pointers/CompoundPointer})

(def ByteOffsetPointer
  "Single pointer using a byte offset from the start of the reference."
  {:db/ident :pointers/ByteOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Single pointer using a byte offset from the start of the reference."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Byte Offset Pointer"},
   :rdfs/subClassOf :pointers/OffsetPointer})

(def ByteSnippetCompoundPointer
  "Pointer to a range with a defined start and a byte snippet from there."
  {:db/ident :pointers/ByteSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Pointer to a range with a defined start and a byte snippet from there."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Byte Snippet Compound Pointer"},
   :rdfs/subClassOf :pointers/CompoundPointer})

(def CSSSelectorPointer
  "Single pointer using a CSS selector."
  {:db/ident        :pointers/CSSSelectorPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Single pointer using a CSS selector."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "CSS selector Pointer"},
   :rdfs/subClassOf :pointers/ExpressionPointer})

(def CharOffsetCompoundPointer
  "Pointer to a char range with a defined start and a char offset from there."
  {:db/ident :pointers/CharOffsetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Pointer to a char range with a defined start and a char offset from there."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Char Offset Compound Pointer"},
   :rdfs/subClassOf :pointers/CompoundPointer})

(def CharOffsetPointer
  "Single pointer using a character offset from the start of the reference."
  {:db/ident :pointers/CharOffsetPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Single pointer using a character offset from the start of the reference."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Char Offset Pointer"},
   :rdfs/subClassOf :pointers/OffsetPointer})

(def CharSnippetCompoundPointer
  "Pointer to a range with a defined start and a character snippet from there."
  {:db/ident :pointers/CharSnippetCompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Pointer to a range with a defined start and a character snippet from there."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Char Snippet Compound Pointer"},
   :rdfs/subClassOf :pointers/CompoundPointer})

(def CompoundPointer
  "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility."
  {:db/ident :pointers/CompoundPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An abstract method made of a pair of pointers to a defined section to be subclassed for extensibility."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compound Pointer"},
   :rdfs/subClassOf :pointers/Pointer})

(def EquivalentPointers
  "Group of equivalent pointers that point to the same places."
  {:db/ident :pointers/EquivalentPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Group of equivalent pointers that point to the same places."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Equivalent Pointers"},
   :rdfs/subClassOf :pointers/PointersGroup})

(def ExpressionPointer
  "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc."
  {:db/ident :pointers/ExpressionPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Generic single pointer that make use of an expression language such as xPath, CSS selectors, etc."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Expression Pointer"},
   :rdfs/subClassOf :pointers/SinglePointer})

(def LineCharPointer
  "Single pointer using line and char numbers."
  {:db/ident        :pointers/LineCharPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value "Single pointer using line and char numbers."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Line-Char Pointer"},
   :rdfs/subClassOf :pointers/SinglePointer})

(def OffsetPointer
  "Generic single pointer based on an offset."
  {:db/ident        :pointers/OffsetPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value "Generic single pointer based on an offset."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Offset Pointer"},
   :rdfs/subClassOf :pointers/SinglePointer})

(def Pointer
  "Abstract Pointer to be subclassed for extensibility."
  {:db/ident     :pointers/Pointer,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Abstract Pointer to be subclassed for extensibility."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Pointer"}})

(def PointersGroup
  "Generic container for a group of Pointers"
  {:db/ident        :pointers/PointersGroup,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Generic container for a group of Pointers"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Pointers Group"},
   :rdfs/subClassOf :pointers/Pointer})

(def RelatedPointers
  "Group of related pointers you use together for some purpose."
  {:db/ident :pointers/RelatedPointers,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Group of related pointers you use together for some purpose."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Related Pointers"},
   :rdfs/subClassOf :pointers/PointersGroup})

(def SinglePointer
  "Abstract pointer to a single point to be subclassed for extensibility."
  {:db/ident :pointers/SinglePointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Abstract pointer to a single point to be subclassed for extensibility."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Single Pointer"},
   :rdfs/subClassOf :pointers/Pointer})

(def StartEndPointer
  "Compound pointer to a range with a start and an end point."
  {:db/ident :pointers/StartEndPointer,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Compound pointer to a range with a start and an end point."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Start-End Pointer"},
   :rdfs/subClassOf :pointers/CompoundPointer})

(def XMLNamespace
  "An XML Namespace."
  {:db/ident     :pointers/XMLNamespace,
   :rdf/type     :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "An XML Namespace."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "XMLNamespace"}})

(def XPathPointer
  "Single pointer using an XPath expression."
  {:db/ident        :pointers/XPathPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Single pointer using an XPath expression."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "XPath Pointer"},
   :rdfs/subClassOf :pointers/ExpressionPointer})

(def XPointerPointer
  "Single pointer using an XPointer expression."
  {:db/ident        :pointers/XPointerPointer,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value "Single pointer using an XPointer expression."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "XPointer Pointer"},
   :rdfs/subClassOf :pointers/XPathPointer})

(def byteOffset
  "Number of bytes counting from the start point."
  {:db/ident     :pointers/byteOffset,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Number of bytes counting from the start point.",
   :rdfs/domain  :pointers/ByteOffsetCompoundPointer,
   :rdfs/label   "byte offset",
   :rdfs/range   :xsd/positiveInteger})

(def charNumber
  "Char number within a line starting at one."
  {:db/ident     :pointers/charNumber,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Char number within a line starting at one.\n\t\t"},
   :rdfs/domain  :pointers/LineCharPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "char number"},
   :rdfs/range   :xsd/positiveInteger})

(def charOffset
  "Number of characters counting from the start point."
  {:db/ident     :pointers/charOffset,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Number of characters counting from the start point."},
   :rdfs/domain  :pointers/CharOffsetCompoundPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "char offset"},
   :rdfs/range   :xsd/positiveInteger})

(def endPointer
  "Pointer to the end point of the range."
  {:db/ident     :pointers/endPointer,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Pointer to the end point of the range."},
   :rdfs/domain  :pointers/StartEndPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "end pointer"},
   :rdfs/range   :pointers/SinglePointer})

(def expression
  "Expressions, such as xPath or CSS selectors, that identify points."
  {:db/ident :pointers/expression,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Expressions, such as xPath or CSS selectors, that identify points."},
   :rdfs/domain :pointers/ExpressionPointer,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expression"},
   :rdfs/range :rdfs/Literal})

(def groupPointer
  "A Pointer that is part of a Group"
  {:db/ident     :pointers/groupPointer,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A Pointer that is part of a Group"},
   :rdfs/domain  :pointers/PointersGroup,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "groupPointer"},
   :rdfs/range   :pointers/Pointer})

(def lineNumber
  "Line number within the reference starting at one."
  {:db/ident     :pointers/lineNumber,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Line number within the reference starting at one.\n\t\t"},
   :rdfs/domain  :pointers/LineCharPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "line number"},
   :rdfs/range   :xsd/positiveInteger})

(def namespace
  "The namespace being used for the XPath expression."
  {:db/ident     :pointers/namespace,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The namespace being used for the XPath expression."},
   :rdfs/domain  :pointers/XPathPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "namespace"},
   :rdfs/range   :pointers/XMLNamespace})

(def namespaceName
  "The namespace name being used for an XML Namespace."
  {:db/ident     :pointers/namespaceName,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The namespace name being used for an XML Namespace."},
   :rdfs/domain  :pointers/XMLNamespace,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "namespace name"}})

(def offset
  "Offset from the start of the reference."
  {:db/ident     :pointers/offset,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Offset from the start of the reference."},
   :rdfs/domain  :pointers/OffsetPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "offset"},
   :rdfs/range   :xsd/positiveInteger})

(def prefix
  "The namespace prefix being used for an XML Namespace."
  {:db/ident     :pointers/prefix,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The namespace prefix being used for an XML Namespace."},
   :rdfs/domain  :pointers/XMLNamespace,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "prefix"}})

(def reference
  "Scope within which a single pointer operates."
  {:db/ident     :pointers/reference,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "Scope within which a single pointer operates."},
   :rdfs/domain  :pointers/SinglePointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "reference"}})

(def startPointer
  "Pointer to the start point of the range in a compound pointer."
  {:db/ident :pointers/startPointer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Pointer to the start point of the range in a compound pointer."},
   :rdfs/domain :pointers/CompoundPointer,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "start pointer"},
   :rdfs/range :pointers/SinglePointer})

(def version
  "Version for the expression language being used."
  {:db/ident     :pointers/version,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "Version for the expression language being used."},
   :rdfs/domain  :pointers/ExpressionPointer,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "version"},
   :rdfs/range   :rdfs/Literal})