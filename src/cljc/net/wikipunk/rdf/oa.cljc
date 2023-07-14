(ns net.wikipunk.rdf.oa
  "The Web Annotation ontology defines the terms of the Web Annotation vocabulary. Any changes to this document MUST be from a Working Group in the W3C that has established expertise in the area."
  {:dc11/title #xsd/string "Web Annotation Ontology",
   :dcterms/creator [{:foaf/name #xsd/string "Robert Sanderson",
                      :rdf/type  :foaf/Person}
                     {:foaf/name #xsd/string "Paolo Ciccarese",
                      :rdf/type  :foaf/Person}
                     {:foaf/name #xsd/string "Benjamin Young",
                      :rdf/type  :foaf/Person}],
   :dcterms/modified #xsd/string "2016-11-12T21:28:11Z",
   :owl/versionInfo #xsd/string "2016-11-12T21:28:11Z",
   :prov/wasRevisionOf
   {:rdfa/uri "http://www.openannotation.org/spec/core/20130208/oa.owl"},
   :rdf/ns-prefix-map {"acl"      "http://www.w3.org/ns/auth/acl#",
                       "as"       "http://www.w3.org/ns/activitystreams#",
                       "bibo"     "http://purl.org/ontology/bibo/",
                       "cnt"      "http://www.w3.org/2011/content#",
                       "dc11"     "http://purl.org/dc/elements/1.1/",
                       "dcmitype" "http://purl.org/dc/dcmitype/",
                       "dcterms"  "http://purl.org/dc/terms/",
                       "exif"     "http://www.w3.org/2003/12/exif/ns#",
                       "foaf"     "http://xmlns.com/foaf/0.1/",
                       "geo"      "http://www.w3.org/2003/01/geo/wgs84_pos#",
                       "gr"       "http://purl.org/goodrelations/v1#",
                       "iana"     "http://www.iana.org/assignments/relation/",
                       "iiif"     "http://iiif.io/api/image/2#",
                       "ldp"      "http://www.w3.org/ns/ldp#",
                       "oa"       "http://www.w3.org/ns/oa#",
                       "ore"      "http://www.openarchives.org/ore/terms/",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "pcdm"     "http://pcdm.org/models#",
                       "prov"     "http://www.w3.org/ns/prov#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "sc"       "http://iiif.io/api/presentation/2#",
                       "sioc"     "http://rdfs.org/sioc/ns#",
                       "skos"     "http://www.w3.org/2004/02/skos/core#",
                       "svcs"     "http://rdfs.org/sioc/services#",
                       "time"     "http://www.w3.org/2006/time#",
                       "trig"     "http://www.w3.org/2004/03/trix/rdfg-1/",
                       "xml"      "http://www.w3.org/XML/1998/namespace",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "oa",
   :rdfa/uri "http://www.w3.org/ns/oa#",
   :rdfs/comment
   #xsd/string
    "The Web Annotation ontology defines the terms of the Web Annotation vocabulary. Any changes to this document MUST be from a Working Group in the W3C that has established expertise in the area.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/annotation-vocab/"},
   :rdfs/seeAlso {:rdfa/uri "http://www.w3.org/TR/annotation-vocab/"}})

(def Annotation
  "The class for Web Annotations."
  {:db/ident         :oa/Annotation,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/string "The class for Web Annotations.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label       #xsd/string "Annotation",
   :rdfs/subClassOf  :rdfs/Resource})

(def Choice
  "A subClass of  as:OrderedCollection  that conveys to a consuming application that it should select one of the resources in the  as:items  list to use, rather than all of them.  This is typically used to provide a choice of resources to render to the user, based on further supplied properties.  If the consuming application cannot determine the user's preference, then it should use the first in the list."
  {:db/ident :oa/Choice,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A subClass of  as:OrderedCollection  that conveys to a consuming application that it should select one of the resources in the  as:items  list to use, rather than all of them.  This is typically used to provide a choice of resources to render to the user, based on further supplied properties.  If the consuming application cannot determine the user's preference, then it should use the first in the list.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "Choice",
   :rdfs/subClassOf [:rdfs/Resource :as/OrderedCollection]})

(def CssSelector
  "A CssSelector describes a Segment of interest in a representation that conforms to the Document Object Model through the use of the CSS selector specification."
  {:db/ident :oa/CssSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A CssSelector describes a Segment of interest in a representation that conforms to the Document Object Model through the use of the CSS selector specification.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "CssSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector]})

(def CssStyle
  "A resource which describes styles for resources participating in the Annotation using CSS."
  {:db/ident :oa/CssStyle,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A resource which describes styles for resources participating in the Annotation using CSS.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "CssStyle",
   :rdfs/subClassOf [:oa/Style :rdfs/Resource]})

(def DataPositionSelector
  "DataPositionSelector describes a range of data by recording the start and end positions of the selection in the stream. Position 0 would be immediately before the first byte, position 1 would be immediately before the second byte, and so on. The start byte is thus included in the list, but the end byte is not."
  {:db/ident :oa/DataPositionSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "DataPositionSelector describes a range of data by recording the start and end positions of the selection in the stream. Position 0 would be immediately before the first byte, position 1 would be immediately before the second byte, and so on. The start byte is thus included in the list, but the end byte is not.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "DataPositionSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector]})

(def Direction
  "A class to encapsulate the different text directions that a textual resource might take.  It is not used directly in the Annotation Model, only its three instances."
  {:db/ident :oa/Direction,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A class to encapsulate the different text directions that a textual resource might take.  It is not used directly in the Annotation Model, only its three instances.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "Direction",
   :rdfs/subClassOf :rdfs/Resource})

(def FragmentSelector
  "The FragmentSelector class is used to record the segment of a representation using the IRI fragment specification defined by the representation's media type."
  {:db/ident :oa/FragmentSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "The FragmentSelector class is used to record the segment of a representation using the IRI fragment specification defined by the representation's media type.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "FragmentSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector]})

(def HttpRequestState
  "The HttpRequestState class is used to record the HTTP request headers that a client SHOULD use to request the correct representation from the resource. "
  {:db/ident :oa/HttpRequestState,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "The HttpRequestState class is used to record the HTTP request headers that a client SHOULD use to request the correct representation from the resource. ",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "HttpRequestState",
   :rdfs/subClassOf [:rdfs/Resource :oa/State]})

(def Motivation
  "The Motivation class is used to record the user's intent or motivation for the creation of the Annotation, or the inclusion of the body or target, that it is associated with."
  {:db/ident :oa/Motivation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "The Motivation class is used to record the user's intent or motivation for the creation of the Annotation, or the inclusion of the body or target, that it is associated with.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "Motivation",
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept]})

(def PreferContainedDescriptions
  "An IRI to signal the client prefers to receive full descriptions of the Annotations from a container, not just their IRIs."
  {:db/ident :oa/PreferContainedDescriptions,
   :rdf/type :rdfs/Resource,
   :rdfs/comment
   #xsd/string
    "An IRI to signal the client prefers to receive full descriptions of the Annotations from a container, not just their IRIs.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "PreferContainedDescriptions"})

(def PreferContainedIRIs
  "An IRI to signal that the client prefers to receive only the IRIs of the Annotations from a container, not their full descriptions."
  {:db/ident :oa/PreferContainedIRIs,
   :rdf/type :rdfs/Resource,
   :rdfs/comment
   #xsd/string
    "An IRI to signal that the client prefers to receive only the IRIs of the Annotations from a container, not their full descriptions.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "PreferContainedIRIs"})

(def RangeSelector
  "A Range Selector can be used to identify the beginning and the end of the selection by using other Selectors. The selection consists of everything from the beginning of the starting selector through to the beginning of the ending selector, but not including it."
  {:db/ident :oa/RangeSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A Range Selector can be used to identify the beginning and the end of the selection by using other Selectors. The selection consists of everything from the beginning of the starting selector through to the beginning of the ending selector, but not including it.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "RangeSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector]})

(def ResourceSelection
  "Instances of the ResourceSelection class identify part (described by an oa:Selector) of another resource (referenced with oa:hasSource), possibly from a particular representation of a resource (described by an oa:State). Please note that ResourceSelection is not used directly in the Web Annotation model, but is provided as a separate class for further application profiles to use, separate from oa:SpecificResource which has many Annotation specific features."
  {:db/ident :oa/ResourceSelection,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "Instances of the ResourceSelection class identify part (described by an oa:Selector) of another resource (referenced with oa:hasSource), possibly from a particular representation of a resource (described by an oa:State). Please note that ResourceSelection is not used directly in the Web Annotation model, but is provided as a separate class for further application profiles to use, separate from oa:SpecificResource which has many Annotation specific features.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "ResourceSelection",
   :rdfs/subClassOf :rdfs/Resource})

(def Selector
  "A resource which describes the segment of interest in a representation of a Source resource, indicated with oa:hasSelector from the Specific Resource. This class is not used directly in the Annotation model, only its subclasses."
  {:db/ident :oa/Selector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A resource which describes the segment of interest in a representation of a Source resource, indicated with oa:hasSelector from the Specific Resource. This class is not used directly in the Annotation model, only its subclasses.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "Selector",
   :rdfs/subClassOf :rdfs/Resource})

(def SpecificResource
  "Instances of the SpecificResource class identify part of another resource (referenced with oa:hasSource), a particular representation of a resource, a resource with styling hints for renders, or any combination of these, as used within an Annotation."
  {:db/ident :oa/SpecificResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "Instances of the SpecificResource class identify part of another resource (referenced with oa:hasSource), a particular representation of a resource, a resource with styling hints for renders, or any combination of these, as used within an Annotation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "SpecificResource",
   :rdfs/subClassOf [:rdfs/Resource :oa/ResourceSelection]})

(def State
  "A State describes the intended state of a resource as applied to the particular Annotation, and thus provides the information needed to retrieve the correct representation of that resource."
  {:db/ident :oa/State,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A State describes the intended state of a resource as applied to the particular Annotation, and thus provides the information needed to retrieve the correct representation of that resource.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "State",
   :rdfs/subClassOf :rdfs/Resource})

(def Style
  "A Style describes the intended styling of a resource as applied to the particular Annotation, and thus provides the information to ensure that rendering is consistent across implementations."
  {:db/ident :oa/Style,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A Style describes the intended styling of a resource as applied to the particular Annotation, and thus provides the information to ensure that rendering is consistent across implementations.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "Style",
   :rdfs/subClassOf :rdfs/Resource})

(def SvgSelector
  "An SvgSelector defines an area through the use of the Scalable Vector Graphics [SVG] standard. This allows the user to select a non-rectangular area of the content, such as a circle or polygon by describing the region using SVG. The SVG may be either embedded within the Annotation or referenced as an External Resource."
  {:db/ident :oa/SvgSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An SvgSelector defines an area through the use of the Scalable Vector Graphics [SVG] standard. This allows the user to select a non-rectangular area of the content, such as a circle or polygon by describing the region using SVG. The SVG may be either embedded within the Annotation or referenced as an External Resource.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "SvgSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector]})

(def TextPositionSelector
  "The TextPositionSelector describes a range of text by recording the start and end positions of the selection in the stream. Position 0 would be immediately before the first character, position 1 would be immediately before the second character, and so on."
  {:db/ident :oa/TextPositionSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "The TextPositionSelector describes a range of text by recording the start and end positions of the selection in the stream. Position 0 would be immediately before the first character, position 1 would be immediately before the second character, and so on.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "TextPositionSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector]})

(def TextQuoteSelector
  "The TextQuoteSelector describes a range of text by copying it, and including some of the text immediately before (a prefix) and after (a suffix) it to distinguish between multiple copies of the same sequence of characters."
  {:db/ident :oa/TextQuoteSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "The TextQuoteSelector describes a range of text by copying it, and including some of the text immediately before (a prefix) and after (a suffix) it to distinguish between multiple copies of the same sequence of characters.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "TextQuoteSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector]})

(def TextualBody
  ""
  {:db/ident         :oa/TextualBody,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/string "",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label       #xsd/string "TextualBody",
   :rdfs/subClassOf  :rdfs/Resource})

(def TimeState
  "A TimeState records the time at which the resource's state is appropriate for the Annotation, typically the time that the Annotation was created and/or a link to a persistent copy of the current version."
  {:db/ident :oa/TimeState,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "A TimeState records the time at which the resource's state is appropriate for the Annotation, typically the time that the Annotation was created and/or a link to a persistent copy of the current version.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "TimeState",
   :rdfs/subClassOf [:rdfs/Resource :oa/State]})

(def XPathSelector
  " An XPathSelector is used to select elements and content within a resource that supports the Document Object Model via a specified XPath value."
  {:db/ident :oa/XPathSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    " An XPathSelector is used to select elements and content within a resource that supports the Document Object Model via a specified XPath value.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "XPathSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector]})

(def annotationService
  "The object of the relationship is the end point of a service that conforms to the annotation-protocol, and it may be associated with any resource.  The expectation of asserting the relationship is that the object is the preferred service for maintaining annotations about the subject resource, according to the publisher of the relationship.\n\n  This relationship is intended to be used both within Linked Data descriptions and as the  rel  type of a Link, via HTTP Link Headers rfc5988 for binary resources and in HTML <link> elements.  For more information about these, please see the Annotation Protocol specification annotation-protocol.\n  "
  {:db/ident :oa/annotationService,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The object of the relationship is the end point of a service that conforms to the annotation-protocol, and it may be associated with any resource.  The expectation of asserting the relationship is that the object is the preferred service for maintaining annotations about the subject resource, according to the publisher of the relationship.\n\n  This relationship is intended to be used both within Linked Data descriptions and as the  rel  type of a Link, via HTTP Link Headers rfc5988 for binary resources and in HTML <link> elements.  For more information about these, please see the Annotation Protocol specification annotation-protocol.\n  ",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "annotationService"})

(def assessing
  "The motivation for when the user intends to provide an assessment about the Target resource."
  {:db/ident :oa/assessing,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to provide an assessment about the Target resource.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "assessing"})

(def bodyValue
  "The object of the predicate is a plain text string to be used as the content of the body of the Annotation.  The value MUST be an  xsd:string  and that data type MUST NOT be expressed in the serialization. Note that language MUST NOT be associated with the value either as a language tag, as that is only available for  rdf:langString .\n  "
  {:db/ident :oa/bodyValue,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The object of the predicate is a plain text string to be used as the content of the body of the Annotation.  The value MUST be an  xsd:string  and that data type MUST NOT be expressed in the serialization. Note that language MUST NOT be associated with the value either as a language tag, as that is only available for  rdf:langString .\n  ",
   :rdfs/domain :oa/Annotation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "bodyValue",
   :rdfs/range :xsd/string})

(def bookmarking
  "The motivation for when the user intends to create a bookmark to the Target or part thereof."
  {:db/ident :oa/bookmarking,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to create a bookmark to the Target or part thereof.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "bookmarking"})

(def cachedSource
  "A object of the relationship is a copy of the Source resource's representation, appropriate for the Annotation."
  {:db/ident :oa/cachedSource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "A object of the relationship is a copy of the Source resource's representation, appropriate for the Annotation.",
   :rdfs/domain :oa/TimeState,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "cachedSource"})

(def canonical
  "A object of the relationship is the canonical IRI that can always be used to deduplicate the Annotation, regardless of the current IRI used to access the representation."
  {:db/ident :oa/canonical,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "A object of the relationship is the canonical IRI that can always be used to deduplicate the Annotation, regardless of the current IRI used to access the representation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "canonical"})

(def classifying
  "The motivation for when the user intends to that classify the Target as something."
  {:db/ident :oa/classifying,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to that classify the Target as something.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "classifying"})

(def commenting
  "The motivation for when the user intends to comment about the Target."
  {:db/ident :oa/commenting,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to comment about the Target.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "commenting"})

(def describing
  "The motivation for when the user intends to describe the Target, as opposed to a comment about them."
  {:db/ident :oa/describing,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to describe the Target, as opposed to a comment about them.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "describing"})

(def editing
  "The motivation for when the user intends to request a change or edit to the Target resource."
  {:db/ident :oa/editing,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to request a change or edit to the Target resource.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "editing"})

(def end
  "The end property is used to convey the 0-based index of the end position of a range of content."
  {:db/ident :oa/end,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The end property is used to convey the 0-based index of the end position of a range of content.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "end",
   :rdfs/range :xsd/nonNegativeInteger})

(def exact
  "The object of the predicate is a copy of the text which is being selected, after normalization."
  {:db/ident :oa/exact,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The object of the predicate is a copy of the text which is being selected, after normalization.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "exact",
   :rdfs/range :xsd/string})

(def hasBody
  "The object of the relationship is a resource that is a body of the Annotation."
  {:db/ident :oa/hasBody,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The object of the relationship is a resource that is a body of the Annotation.",
   :rdfs/domain :oa/Annotation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "hasBody"})

(def hasEndSelector
  "The relationship between a RangeSelector and the Selector that describes the end position of the range. "
  {:db/ident :oa/hasEndSelector,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The relationship between a RangeSelector and the Selector that describes the end position of the range. ",
   :rdfs/domain :oa/RangeSelector,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "hasEndSelector",
   :rdfs/range :oa/Selector})

(def hasPurpose
  "The purpose served by the resource in the Annotation."
  {:db/ident         :oa/hasPurpose,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/string
                      "The purpose served by the resource in the Annotation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label       #xsd/string "hasPurpose",
   :rdfs/range       :oa/Motivation})

(def hasScope
  "The scope or context in which the resource is used within the Annotation."
  {:db/ident :oa/hasScope,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The scope or context in which the resource is used within the Annotation.",
   :rdfs/domain :oa/SpecificResource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "hasScope"})

(def hasSelector
  "The object of the relationship is a Selector that describes the segment or region of interest within the source resource.  Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model."
  {:db/ident :oa/hasSelector,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The object of the relationship is a Selector that describes the segment or region of interest within the source resource.  Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model.",
   :rdfs/domain :oa/ResourceSelection,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "hasSelector",
   :rdfs/range :oa/Selector})

(def hasSource
  "The resource that the ResourceSelection, or its subclass SpecificResource, is refined from, or more specific than. Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model."
  {:db/ident :oa/hasSource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The resource that the ResourceSelection, or its subclass SpecificResource, is refined from, or more specific than. Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model.",
   :rdfs/domain :oa/ResourceSelection,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "hasSource"})

(def hasStartSelector
  "The relationship between a RangeSelector and the Selector that describes the start position of the range. "
  {:db/ident :oa/hasStartSelector,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The relationship between a RangeSelector and the Selector that describes the start position of the range. ",
   :rdfs/domain :oa/RangeSelector,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "hasStartSelector",
   :rdfs/range :oa/Selector})

(def hasState
  "The relationship between the ResourceSelection, or its subclass SpecificResource, and a State resource. Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model."
  {:db/ident :oa/hasState,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The relationship between the ResourceSelection, or its subclass SpecificResource, and a State resource. Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model.",
   :rdfs/domain :oa/ResourceSelection,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "hasState",
   :rdfs/range :oa/State})

(def hasTarget
  "The relationship between an Annotation and its Target."
  {:db/ident         :oa/hasTarget,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/string
                      "The relationship between an Annotation and its Target.",
   :rdfs/domain      :oa/Annotation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label       #xsd/string "hasTarget"})

(def highlighting
  "The motivation for when the user intends to highlight the Target resource or segment of it."
  {:db/ident :oa/highlighting,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to highlight the Target resource or segment of it.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "highlighting"})

(def identifying
  "The motivation for when the user intends to assign an identity to the Target or identify what is being depicted or described in the Target."
  {:db/ident :oa/identifying,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to assign an identity to the Target or identify what is being depicted or described in the Target.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "identifying"})

(def linking
  "The motivation for when the user intends to link to a resource related to the Target."
  {:db/ident :oa/linking,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to link to a resource related to the Target.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "linking"})

(def ltrDirection
  "The direction of text that is read from left to right."
  {:db/ident         :oa/ltrDirection,
   :rdf/type         [:oa/Direction :rdfs/Resource],
   :rdfs/comment     #xsd/string
                      "The direction of text that is read from left to right.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label       #xsd/string "ltrDirection"})

(def moderating
  "The motivation for when the user intends to assign some value or quality to the Target."
  {:db/ident :oa/moderating,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to assign some value or quality to the Target.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "moderating"})

(def motivatedBy
  "The relationship between an Annotation and a Motivation that describes the reason for the Annotation's creation."
  {:db/ident :oa/motivatedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The relationship between an Annotation and a Motivation that describes the reason for the Annotation's creation.",
   :rdfs/domain :oa/Annotation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "motivatedBy",
   :rdfs/range :oa/Motivation})

(def prefix
  "The object of the property is a snippet of content that occurs immediately before the content which is being selected by the Selector."
  {:db/ident :oa/prefix,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The object of the property is a snippet of content that occurs immediately before the content which is being selected by the Selector.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "prefix",
   :rdfs/range :xsd/string})

(def processingLanguage
  "The object of the property is the language that should be used for textual processing algorithms when dealing with the content of the resource, including hyphenation, line breaking, which font to use for rendering and so forth.  The value must follow the recommendations of BCP47."
  {:db/ident :oa/processingLanguage,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The object of the property is the language that should be used for textual processing algorithms when dealing with the content of the resource, including hyphenation, line breaking, which font to use for rendering and so forth.  The value must follow the recommendations of BCP47.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "processingLanguage",
   :rdfs/range :xsd/string})

(def questioning
  "The motivation for when the user intends to ask a question about the Target."
  {:db/ident :oa/questioning,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to ask a question about the Target.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "questioning"})

(def refinedBy
  "The relationship between a Selector and another Selector or a State and a Selector or State that should be applied to the results of the first to refine the processing of the source resource. "
  {:db/ident :oa/refinedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The relationship between a Selector and another Selector or a State and a Selector or State that should be applied to the results of the first to refine the processing of the source resource. ",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "refinedBy"})

(def renderedVia
  "A system that was used by the application that created the Annotation to render the resource."
  {:db/ident :oa/renderedVia,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "A system that was used by the application that created the Annotation to render the resource.",
   :rdfs/domain :oa/SpecificResource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "renderedVia"})

(def replying
  "The motivation for when the user intends to reply to a previous statement, either an Annotation or another resource."
  {:db/ident :oa/replying,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to reply to a previous statement, either an Annotation or another resource.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "replying"})

(def rtlDirection
  "The direction of text that is read from right to left."
  {:db/ident         :oa/rtlDirection,
   :rdf/type         [:oa/Direction :rdfs/Resource],
   :rdfs/comment     #xsd/string
                      "The direction of text that is read from right to left.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label       #xsd/string "rtlDirection"})

(def sourceDate
  "The timestamp at which the Source resource should be interpreted as being applicable to the Annotation."
  {:db/ident :oa/sourceDate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The timestamp at which the Source resource should be interpreted as being applicable to the Annotation.",
   :rdfs/domain :oa/TimeState,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "sourceDate",
   :rdfs/range :xsd/dateTime})

(def sourceDateEnd
  "The end timestamp of the interval over which the Source resource should be interpreted as being applicable to the Annotation."
  {:db/ident :oa/sourceDateEnd,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The end timestamp of the interval over which the Source resource should be interpreted as being applicable to the Annotation.",
   :rdfs/domain :oa/TimeState,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "sourceDateEnd",
   :rdfs/range :xsd/dateTime})

(def sourceDateStart
  "The start timestamp of the interval over which the Source resource should be interpreted as being applicable to the Annotation."
  {:db/ident :oa/sourceDateStart,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The start timestamp of the interval over which the Source resource should be interpreted as being applicable to the Annotation.",
   :rdfs/domain :oa/TimeState,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "sourceDateStart",
   :rdfs/range :xsd/dateTime})

(def start
  "The start position in a 0-based index at which a range of content is selected from the data in the source resource."
  {:db/ident :oa/start,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The start position in a 0-based index at which a range of content is selected from the data in the source resource.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "start",
   :rdfs/range :xsd/nonNegativeInteger})

(def styleClass
  "The name of the class used in the CSS description referenced from the Annotation that should be applied to the Specific Resource."
  {:db/ident :oa/styleClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The name of the class used in the CSS description referenced from the Annotation that should be applied to the Specific Resource.",
   :rdfs/domain :oa/SpecificResource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "styleClass",
   :rdfs/range :xsd/string})

(def styledBy
  "A reference to a Stylesheet that should be used to apply styles to the Annotation rendering."
  {:db/ident :oa/styledBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "A reference to a Stylesheet that should be used to apply styles to the Annotation rendering.",
   :rdfs/domain :oa/Annotation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "styledBy",
   :rdfs/range :oa/Style})

(def suffix
  "The snippet of text that occurs immediately after the text which is being selected."
  {:db/ident :oa/suffix,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The snippet of text that occurs immediately after the text which is being selected.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "suffix",
   :rdfs/range :xsd/string})

(def tagging
  "The motivation for when the user intends to associate a tag with the Target."
  {:db/ident :oa/tagging,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   #xsd/string
    "The motivation for when the user intends to associate a tag with the Target.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "tagging"})

(def textDirection
  "The direction of the text of the subject resource. There MUST only be one text direction associated with any given resource."
  {:db/ident :oa/textDirection,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "The direction of the text of the subject resource. There MUST only be one text direction associated with any given resource.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "textDirection",
   :rdfs/range :oa/Direction})

(def via
  "A object of the relationship is a resource from which the source resource was retrieved by the providing system."
  {:db/ident :oa/via,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "A object of the relationship is a resource from which the source resource was retrieved by the providing system.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/oa#"},
   :rdfs/label #xsd/string "via"})