(ns net.wikipunk.rdf.ov
  "http://purl.org/net/opmv/ns#Artefact"
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/ov/versions/2011-11-25.n3",
   :rdf/ns-prefix-map {"ov"  "http://open.vocab.org/terms/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "ov",
   :rdfa/uri "http://purl.org/net/opmv/ns#Artefact",
   :rdfs/subClassOf "http://purl.org/net/opmv/ns#Artefact"}
  (:refer-clojure :exclude [test name]))

(def AfricanRedSlip
  "The ceramic ware produced during the Roman period in the region of what is now the modern country of Tunisia."
  {:db/ident :ov/AfricanRedSlip,
   :ov/markdownDescription
   "Identifies the ware of any African Red-Slip vessel.",
   :owl/equivalentClass :dbr/African_Red_Slip,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The ceramic ware produced during the Roman period in the region of what is now the modern country of Tunisia.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "African Red Slip",
   :rdfs/subClassOf [:ov/Ware :ov/AfricanRedSlip],
   :skos/note "http://open.vocab.org/changes/a1c05e65219d9b345a2782d2977dd102",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "9bb5567d-9f87-47cd-8f0d-2ed0f9fbd24f"})

(def AmateurRadioContact
  "It is a major goal of Amateur Radio Operators to make contact with each other. This contact is formally defined as the exchange of certain information, usually consisting of each operator's call sign and a signal report (how well each operator receives the signal of the other). A contact can last a few seconds to many minutes. Nickname \"QSL\"."
  {:db/ident :ov/AmateurRadioContact,
   :dc11/created #inst "2010-06-25T17:28:25.000-00:00",
   :label/plural "Events that are a contact between two AmateurRadioOperators",
   :rdf/type :owl/Class,
   :rdfs/comment
   "It is a major goal of Amateur Radio Operators to make contact with each other.  This contact is formally defined as the exchange of certain information, usually consisting of each operator's call sign and a signal report (how well each operator receives the signal of the other).  A contact can last a few seconds to many minutes.  Nickname \"QSL\".",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "An event that is a contact between two AmateurRadioOperators",
   :skos/note
   ["http://open.vocab.org/changes/5bb6ac8ed573eab20eca171eb6521932"
    "http://open.vocab.org/changes/3b85ef90699be917133ff9ab187284ee"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/AmateurRadioContact"})

(def AmateurRadioOperator
  "A person who is licensed in at least one ITU region to operate (transmit and receive) a radio using frequencies and modes permitted only to licensed persons."
  {:db/ident :ov/AmateurRadioOperator,
   :dc11/created #inst "2010-06-25T16:45:26.000-00:00",
   :label/plural "Amateur Radio Operators",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A person who is licensed in at least one ITU region to operate (transmit and receive) a radio using frequencies and modes permitted only  to licensed persons.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Amateur Radio Operator",
   :rdfs/subClassOf [:foaf/Person :ov/AmateurRadioOperator],
   :skos/note
   ["http://open.vocab.org/changes/2830e3b461e81fa2d2b16a950c926587"
    "http://open.vocab.org/changes/33885d5ab715f2e23586a7c058b077e7"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/AmateurRadioOperator"})

(def AnnotationSet
  "A type of dataset that contains annotations on a set of resources."
  {:db/ident :ov/AnnotationSet,
   :dc11/created #inst "2010-06-08T23:54:47.000-00:00",
   :label/plural "Annotation Sets",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A type of dataset that contains annotations on a set of resources.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Annotation Set",
   :rdfs/subClassOf [:void/Dataset :ov/AnnotationSet],
   :skos/note "http://open.vocab.org/changes/65bb15b88c623f1fe5f2d9affc2c3b95",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/AnnotationSet"})

(def AutomobileCataologType
  "Automobiles, when presented as a catalog, are generally categorized using the Car Maker / Car Model / Trim Package hierarchy."
  {:db/ident :ov/AutomobileCataologType,
   :label/plural "Automobile Catalog Types",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Automobiles, when presented as a catalog, are generally categorized using the Car Maker / Car Model / Trim Package hierarchy.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Automobile Catalog Type",
   :rdfs/subClassOf :ov/AutomobileCataologType,
   :vs/term_status "unstable",
   :vs/userdocs :ov/AutomobileCataologType.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"48cdcf7d-9cf6-4ea7-95a9-4792e564882d\""})

(def AutomobileModel
  "From en.wikipedia.org: \"A car model is a particular brand of vehicle sold under a marque. From an engineering point of view, a particular car model is usually defined and/or constrained by the use of a particular car chassis/bodywork combination or the same monocoque.\""
  {:db/ident :ov/AutomobileModel,
   :label/plural "Automobile Models",
   :rdf/type :owl/Class,
   :rdfs/comment
   "From en.wikipedia.org:\n\"A car model is a particular brand of vehicle sold under a marque. From an engineering point of view, a particular car model is usually defined and/or constrained by the use of a particular car chassis/bodywork combination or the same monocoque.\"",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Automobile Model",
   :rdfs/subClassOf [:ov/AutomobileCataologType :ov/AutomobileModel],
   :vs/term_status "unstable",
   :vs/userdocs :ov/AutomobileModel.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"3ff64331-76bf-48aa-8274-a5d770e52376\""})

(def AvatarCharacterTraits
  "This class of character traits was created to describe the characters in the graphic novel Avatar-The Last Airbender. The motivation was to create a unique class identifying the characters in the trilogy."
  {:db/ident :ov/AvatarCharacterTraits,
   :dc11/created #inst "2011-03-22T17:22:00.000-00:00",
   :label/plural
   "General Trait of Characters in the Animated Series Avatar-The Last Airbender",
   :rdf/type :owl/Class,
   :rdfs/comment
   "This class of character traits was created to describe the characters in the graphic novel Avatar-The Last Airbender.\nThe motivation was to create a unique class identifying the characters in the trilogy.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label
   "General Trait of Characters in the Animated Series Avatar-The Last Airbender",
   :skos/note "http://open.vocab.org/changes/3fecad34211977e28fd7f5eb73ff6f93",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/AvatarCharacterTraits"})

(def BiologicalDatabase
  "Database for Biologists (Bioinformatics)"
  {:db/ident               :ov/BiologicalDatabase,
   :label/plural           "Biological Databases",
   :ov/markdownDescription "A Database for Biologists (Bioinformatics)",
   :rdf/type               :owl/Class,
   :rdfs/comment           "Database for Biologists (Bioinformatics)",
   :rdfs/isDefinedBy       "http://open.vocab.org/terms",
   :rdfs/label             "Biological Database",
   :rdfs/subClassOf        [:ov/ScientificDatabase
                            :ov/BiologicalDatabase
                            :ov/Database],
   :vs/term_status         "unstable",
   :vs/userdocs            :ov/BiologicalDatabase.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"40782fae-0f4c-44d7-aa93-d14b7fd2b04a\""})

(def Birth
  "Birth class"
  {:db/ident :ov/Birth,
   :owl/disjointWith :ov/Death,
   :rdf/type :owl/Class,
   :rdfs/comment "Birth class",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Birth",
   :rdfs/subClassOf [:event/Event :ov/Birth],
   :skos/note "http://open.vocab.org/changes/77f206215ac97fe9219069768374c155",
   :vs/term_status "unstable",
   :vs/userdocs :ov/Birth.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"305dfbd5-de80-4237-8e8a-19628893ff87\""})

(def Calendar
  "Calendar"
  {:db/ident         :ov/Calendar,
   :label/plural     "Calendars",
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Calendar",
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/Calendar.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"772fef82-9a62-4040-afac-80149a2de2b3\""})

(def Cheese
  "Cheese is a food made from milk, usually the milk of cows, buffalo, goats, or sheep, by coagulation."
  {:db/ident :ov/Cheese,
   :label/plural "Cheeses",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Cheese is a food made from milk, usually the milk of cows, buffalo, goats, or sheep, by coagulation. ",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Cheese",
   :vs/term_status "unstable",
   :vs/userdocs :ov/Cheese.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"25455282-4ad8-4515-b3da-49185e075fc1\""})

(def ClassSkeleton
  "Members of this class represent class skeletons which are sort of templates of a class. Members of a class which has a class skeleton (http://open.vocab.org/terms/classSkeleton property) should have the triples relating from/to the skeleton, which don't use property http://open.vocab.org/terms/classSkeletonIgnore and its sub-properties as predicate, relating from/to them too. This materialization of triples is expected to be carried out by for example some kind of rule engine. Important: This kind of inference is already possible with OWL using property restrictions (Functional-Style Syntax): EquivalentClasses(  :JohnsChildren ObjectHasValue( :hasParent :John ) ) So you might better use OWL since the functionality is the same. http://www.w3.org/TR/owl2-primer/#Property_Restrictions"
  {:db/ident :ov/ClassSkeleton,
   :label/plural "class skeletons",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Members of this class represent class skeletons which are sort of templates of a class. \n\nMembers of a class which has a class skeleton (http://open.vocab.org/terms/classSkeleton property) should have the triples relating from/to the skeleton, which don't use property http://open.vocab.org/terms/classSkeletonIgnore and its sub-properties as predicate, relating from/to them too.\n\nThis materialization of triples is expected to be carried out by for example some kind of rule engine.\n\nImportant: This kind of inference is already possible with OWL using property restrictions (Functional-Style Syntax): \n  EquivalentClasses( \n    :JohnsChildren \n    ObjectHasValue( :hasParent :John )\n  )\nSo you might better use OWL since the functionality is the same.\nhttp://www.w3.org/TR/owl2-primer/#Property_Restrictions",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Class Skeleton",
   :skos/note
   ["http://open.vocab.org/changes/d3d0d504034ce57cc39566bd6f532c15"
    "http://open.vocab.org/changes/85c4765f65df830da0e9bc46c3f587c9"
    "http://open.vocab.org/changes/dfa59b5a8f58a0a4344c2b3b4433ecfe"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "b5031dc2-fcd7-4d33-b05c-d600b00600f9"})

(def Country
  "A country is a geographical region. A country may be the territory of a sovereign state, the territory of a non-sovereign (or formerly sovereign) political division, or a region associated with a certain people or certain characteristics."
  {:db/ident :ov/Country,
   :dc11/created #inst "2011-10-25T14:34:06.000-00:00",
   :label/plural "Countries",
   :owl/equivalentClass :schema/Country,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A country is a geographical region. A country may be the territory of a sovereign state, the territory of a non-sovereign (or formerly sovereign) political division, or a region associated with a certain people or certain characteristics.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Country",
   :skos/note "http://open.vocab.org/changes/f8f0cf79593500ed4827aa9e120a8af6",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/Country"})

(def Course
  "Course"
  {:db/ident :ov/Course,
   :owl/equivalentClass
   "http://www.lehigh.edu/~zhp2/2004/0401/univ-bench.owl#Course",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Course",
   :rdfs/subClassOf :ov/Course,
   :vs/term_status "unstable",
   :vs/userdocs :ov/Course.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"caec9189-b5dc-43c1-a1b1-3ab2f73c21ee\""})

(def DOMBoundaryPoint
  "A boundary-point's position in a Document or DocumentFragment tree can be characterized by a node and an offset. http://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113/ranges.html#Level-2-Range-Definitions"
  {:db/ident :ov/DOMBoundaryPoint,
   :label/plural "DOMBoundaryPoints",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A boundary-point's position in a Document or DocumentFragment tree can be characterized by a node and an offset.\nhttp://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113/ranges.html#Level-2-Range-Definitions",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "DOMBoundaryPoint",
   :vs/term_status "unstable",
   :vs/userdocs :ov/DOMBoundaryPoint.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"63b8cdd0-a5bf-4c9c-b229-8bab040a4797\""})

(def DOMBoundaryPointPosition
  "A boundary-point's position in a Document or DocumentFragment tree can be characterized by a node and an offset http://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113/ranges.html#Level-2-Range-Definitions"
  {:db/ident :ov/DOMBoundaryPointPosition,
   :label/plural "DOMBoundaryPointPositions",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A boundary-point's position in a Document or DocumentFragment tree can be characterized by a node and an offset\n\nhttp://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113/ranges.html#Level-2-Range-Definitions",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "DOMBoundaryPointPosition",
   :vs/term_status "unstable",
   :vs/userdocs :ov/DOMBoundaryPointPosition.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"7b174e16-0fdf-47e5-9d7e-85cdcc367903\""})

(def DOMNode
  "DOMNode can be a Attribute, Document, DocumentFragment, Element or EntityReference node."
  {:db/ident :ov/DOMNode,
   :label/plural "DOMNodes",
   :rdf/type :owl/Class,
   :rdfs/comment
   "DOMNode can be a Attribute, Document, DocumentFragment, Element or EntityReference node.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "DOMNode",
   :vs/term_status "unstable",
   :vs/userdocs :ov/DOMNode.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"f234d851-4c0f-4dae-ae7a-a85f8bbbfdfc\""})

(def DOMOffset
  "the offset within a DOM node"
  {:db/ident         :ov/DOMOffset,
   :label/plural     "Offsets",
   :rdf/type         :owl/Class,
   :rdfs/comment     "the offset within a DOM node",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "DOMOffset",
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/DOMOffset.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"73c4a8f2-68f1-4a7b-b483-bda0c29bacfc\""})

(def DOMRange
  "A DOM Range consists of two boundary-points corresponding to the start and the end of the Range. http://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113/ranges.html#Level-2-Range-Definitions"
  {:db/ident :ov/DOMRange,
   :label/plural "DOMRanges",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A DOM Range consists of two boundary-points corresponding to the start and the end of the Range.\nhttp://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113/ranges.html#Level-2-Range-Definitions",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "DOMRange",
   :vs/term_status "unstable",
   :vs/userdocs :ov/DOMRange.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"c5ec7935-1f5f-44c7-b957-8989b185f1ac\""})

(def Database
  "A Database"
  {:db/ident               :ov/Database,
   :label/plural           "Databases",
   :ov/markdownDescription "A Database",
   :rdf/type               :owl/Class,
   :rdfs/comment           "A Database",
   :rdfs/isDefinedBy       "http://open.vocab.org/terms",
   :rdfs/label             "Database",
   :rdfs/subClassOf        :ov/Database,
   :vs/term_status         "unstable",
   :vs/userdocs            :ov/Database.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"8b432287-3652-439c-b38d-7e07ce5c5a9d\""})

(def DeletedEntry
  "A construct representing a deleted entry in an Atom feed."
  {:db/ident :ov/DeletedEntry,
   :label/plural "Deleted Entries",
   :ov/markdownDescription
   "This is an extension of [AtomOwl](http://bblfish.net/work/atom-owl/2006-06-06/AtomOwl.html) to describe deleted entries (a.k.a. \"tombstones\"), as defined by [The Atom \"deleted-entry\" Element](http://tools.ietf.org/html/draft-snell-atompub-tombstones-06).",
   :rdf/type :owl/Class,
   :rdfs/comment "A construct representing a deleted entry in an Atom feed.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Deleted Entry",
   :rdfs/subClassOf ["http://bblfish.net/work/atom-owl/2006-06-06/#Entry"
                     :ov/DeletedEntry],
   :vs/term_status "unstable",
   :vs/userdocs :ov/DeletedEntry.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "65372006-0c7a-4a8b-a2b7-ea6f4f2c7317"})

(def Diff
  "A diff, showing the difference between a source resource and a target resource."
  {:db/ident :ov/Diff,
   :label/plural "diffs",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A diff, showing the difference between a source resource and a target resource.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "diff",
   :vs/term_status "unstable",
   :vs/userdocs :ov/Diff.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"a39df784-180e-48e6-b19a-df6b56bfadf1\""})

(def DigitalAsset
  "DAs would be typically files. Audio, movies, software licenses, software installers, documents, etc. Anything stored that needs a computer to get it and/or read it."
  {:db/ident :ov/DigitalAsset,
   :label/plural "DigitalAssets",
   :ov/markdownDescription
   "No doubt a hundred different classes already for this! There is a good opportunity to define nice, specific sub-classes for the various things this can track. ",
   :rdf/type :owl/Class,
   :rdfs/comment
   "DAs would be typically files. Audio, movies, software licenses, software installers, documents, etc. Anything stored that needs a computer to get it and/or read it.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "DigitalAsset",
   :vs/term_status "unstable",
   :vs/userdocs :ov/DigitalAsset.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"977812c0-587a-469e-9e8d-dba555516fac\""})

(def Distance
  "A Distance should have two distance points and a distance value. eg: <distances/a/b> a ov:Distance ; ov:distancePoint <a> , <b> ; ov:kilometres 0.5 ; ."
  {:db/ident :ov/Distance,
   :label/plural "Distances",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Distance should have two distance points and a distance value. eg:\n\n<distances/a/b>\n    a ov:Distance ;\n    ov:distancePoint <a> , <b> ;\n    ov:kilometres 0.5 ;\n.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Distance",
   :skos/note
   ["http://open.vocab.org/changes/247df28ea8f553a1d1073032ad8bf4c2"
    "http://open.vocab.org/changes/75a724c0e4b933f154a205a845a6d645"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "739df7a1-d131-4f80-9946-b839848eb6fe"})

(def EarWorm
  "class is now deprecated in favour of Earworm class."
  {:db/ident         :ov/EarWorm,
   :rdf/type         :owl/Class,
   :rdfs/comment     "class is now deprecated in favour of Earworm class.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "EarWorm",
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/EarWorm.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"185b2e77-3bb0-494c-8eab-d66bbce468b5\""})

(def Earworm
  "The experience of having a song in your head which you can't get rid of."
  {:db/ident :ov/Earworm,
   :label/plural "Earworms",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The experience of having a song in your head which you can't get rid of.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Earworm",
   :vs/term_status "unstable",
   :vs/userdocs :ov/Earworm.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"6fba532c-e7ed-41dd-9e1f-9be1ba93f247\""})

(def Film
  "The class of all motion pictures"
  {:db/ident         :ov/Film,
   :label/plural     "Films",
   :rdf/type         :owl/Class,
   :rdfs/comment     "The class of all motion pictures",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Film",
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/Film.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"5d241a36-1ab7-4177-9065-f6f7540fa98b\""})

(def Formula
  "A formula or graph literal, in the sense used by Notation 3. This is intended to be used as a datatype. e.g. <#bob> ex:believes \"<#alice> a <http://xmlns.com/foaf/0.1/Person> .\"^^ov:Formula . Note that the wrapping \"{\"...\"}\" are omitted from the value."
  {:db/ident :ov/Formula,
   :label/plural "Formulae",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A formula or graph literal, in the sense used by Notation 3.\n\nThis is intended to be used as a datatype. e.g.\n\n  <#bob> ex:believes \"<#alice> a <http://xmlns.com/foaf/0.1/Person> .\"^^ov:Formula .\n\nNote that the wrapping \"{\"...\"}\" are omitted from the value.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Formula",
   :skos/note
   ["http://open.vocab.org/changes/47edc256e842ce07c0e679f5b2aa0262"
    "http://open.vocab.org/changes/3e4f748a8876f2dedbb78000bacced32"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "ef5d417e-a4b8-4fd5-9605-b11428a153ab"})

(def HUDCourseLoan
  "Course Loan History"
  {:db/ident         :ov/HUDCourseLoan,
   :label/plural     "The loan history for a book by course",
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Course Loan History",
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/HUDCourseLoan.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"e4953ad2-8b23-4202-b6d6-fff3d5bbe77f\""})

(def HUDSchoolLoan
  "The loan history of a book within a school"
  {:db/ident         :ov/HUDSchoolLoan,
   :rdf/type         :owl/Class,
   :rdfs/comment     "The loan history of a book within a school",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "School Loan History",
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/HUDSchoolLoan.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"df31df81-ec72-4679-b264-22a78704932c\""})

(def HUDSuggestion
  "Suggested book based on circulation data"
  {:db/ident         :ov/HUDSuggestion,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Suggested book based on circulation data",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Suggestion",
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/HUDSuggestion.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"de162105-efcd-4f5d-8f1d-f31e6afa2a4d\""})

(def HUDYearLoan
  "The loan history for a book by year."
  {:db/ident         :ov/HUDYearLoan,
   :rdf/type         :owl/Class,
   :rdfs/comment     "The loan history for a book by year.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Year Loan History",
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/HUDYearLoan.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"58471450-bbce-4b51-84e8-122eee13c146\""})

(def House
  "Structure in which someone lives"
  {:db/ident               :ov/House,
   :label/plural           "Houses",
   :ov/markdownDescription "This is just a test",
   :owl/disjointWith       :ov/horse,
   :owl/equivalentClass    :ov/domicile,
   :rdf/type               :owl/Class,
   :rdfs/comment           "Structure in which someone lives",
   :rdfs/isDefinedBy       "http://open.vocab.org/terms",
   :rdfs/label             "House",
   :rdfs/subClassOf        [:ov/building :ov/House],
   :vs/term_status         "unstable",
   :vs/userdocs            :ov/House.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"ff550d4a-c1ac-4b1c-99b3-6f06a66c77b9\""})

(def ITUREgion
  "The ITU defines a set of world-wide regions which uniquely describe locations for radio operation (in particular, amateur radio operation). These regions are widely-used by amateur radio operators to report operation and radio contacts. Each region has a unique abbreviation."
  {:db/ident :ov/ITUREgion,
   :dc11/created #inst "2010-06-25T17:07:49.000-00:00",
   :label/plural "ITU Regions for governance of radio operation",
   :rdf/type :owl/Class,
   :rdfs/comment
   "The ITU defines a set of world-wide regions which uniquely describe locations for radio operation (in particular, amateur radio operation).  These regions are widely-used by amateur radio operators to report operation and radio contacts.  Each region has a unique abbreviation.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "ITU Region for governance of radio operation",
   :rdfs/subClassOf ["http://dublincore.org/documents/2006/04/10/dcmi-box/"
                     :ov/ITUREgion],
   :skos/note
   ["http://open.vocab.org/changes/27c49fab3b31049d859c1b2c189c4319"
    "http://open.vocab.org/changes/f2e25317213ca568cf808022ba0b5faa"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/ITUREgion"})

(def IllegalRDFXMLStatement
  "A statement that would be illegal to express in a non-reified form in RDF/XML - usually because the predicate cannot be converted to a QName."
  {:db/ident :ov/IllegalRDFXMLStatement,
   :label/plural "Illegal RDF/XML Statements",
   :ov/markdownDescription
   "For example:\n\n    []\n      rdf:type openvocab:IllegalRDFXMLStatement ;\n      rdf:subject <http://example.com/some_competition> ;\n      rdf:predicate <http://example.com/prizes/1> ;\n      rdf:object <http://example.com/some_person> .\n\nTools *may* automatically convert between openvocab:IllegalRDFXMLStatement statements and unreified statements when parsing or serialising RDF/XML.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A statement that would be illegal to express in a non-reified form in RDF/XML - usually because the predicate cannot be converted to a QName.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Illegal RDF/XML Statement",
   :rdfs/subClassOf [:rdf/Statement :ov/IllegalRDFXMLStatement],
   :vs/term_status "unstable",
   :vs/userdocs :ov/IllegalRDFXMLStatement.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"55f19a46-1987-4752-b7c7-92a45ae19046\""})

(def IrcBot
  "An irc chat bot"
  {:db/ident         :ov/IrcBot,
   :label/plural     "IrcBots",
   :rdf/type         :owl/Class,
   :rdfs/comment     "An irc chat bot",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "IrcBot",
   :rdfs/subClassOf  ["http://xmlns.com/foaf/spec/#term_Agent" :ov/IrcBot],
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/IrcBot.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "804ec318-5912-4bb1-a461-793d2bc90033"})

(def JavascriptThis
  "the concept of \"this\" in a javascript object. In other words a mean in which to refer to \"self\""
  {:db/ident :ov/JavascriptThis,
   :label/plural "JavascriptThises",
   :ov/markdownDescription
   "the concept of \"this\" in an object. In other words a mean in which to refer to \"self\"",
   :rdf/type :owl/Class,
   :rdfs/comment
   "the concept of \"this\" in a javascript object. In other words a mean in which to refer to \"self\"",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "JavascriptThis",
   :vs/term_status "unstable",
   :vs/userdocs :ov/JavascriptThis.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"92acb8b3-c04c-48eb-a312-0191eac3b016\""})

(def KillerGorilla
  "A gorilla that kills or has the inclination to do so."
  {:db/ident         :ov/KillerGorilla,
   :label/plural     "Killer Gorillas",
   :owl/disjointWith :ov/NotAKillerGorilla,
   :rdf/type         :owl/Class,
   :rdfs/comment     "A gorilla that kills or has the inclination to do so.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Killer Gorilla",
   :rdfs/subClassOf  ["http://umbel.org/umbel/sc/Gorilla" :ov/KillerGorilla],
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/KillerGorilla.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"8cc63a5f-fdf2-4288-9210-0dafb247fae5\""})

(def MOTTestingStation
  "The class of all MOT Testing Stations."
  {:db/ident :ov/MOTTestingStation,
   :dc11/created #inst "2011-07-26T14:04:06.000-00:00",
   :label/plural "MOT Testing Stations",
   :rdf/type :owl/Class,
   :rdfs/comment "The class of all MOT Testing Stations.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "MOT Testing Station",
   :rdfs/subClassOf [:geo/SpatialThing :ov/MOTTestingStation],
   :skos/note "http://open.vocab.org/changes/c4537cbf6e15d5e0d5b1f43fd2c1b09e",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/MOTTestingStation"})

(def Madre
  "Madre"
  {:db/ident         :ov/Madre,
   :label/plural     "Madres",
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Madre",
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/Madre.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"9032bd12-9c48-405c-a88b-f8933bfe044f\""})

(def Manifest
  "A manifest is a listing of files or URIs or resources of some sort encoded in some way"
  {:db/ident :ov/Manifest,
   :dc11/created #inst "2011-11-25T10:19:01.000-00:00",
   :label/plural "Manifests",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A manifest is a listing of files or URIs or resources of some sort encoded in some way",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Manifest",
   :rdfs/subClassOf ["http://purl.org/net/opmv/ns#Artefact" :ov/Manifest],
   :skos/note "http://open.vocab.org/changes/003d8e98950c6b9ecb5f5b2b3ccd9d17",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/Manifest"})

(def MicroblogPost
  "A post on a microblogging service like Twitter, identi.ca, Jaiku or FriendFeed. Usually untitled and with a limited number of characters, and sometimes containing in-line text-based syntactical elements like at-replies, hashtags, group 'bangtags' etc."
  {:db/ident :ov/MicroblogPost,
   :label/plural "Microblog Post",
   :ov/markdownDescription
   "Use sioctypes' MicroBlogPost at <http://rdfs.org/sioc/types#MicroblogPost> instead.",
   :owl/equivalentClass :sioc.types/MicroblogPost,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A post on a microblogging service like Twitter, identi.ca, Jaiku or FriendFeed. Usually untitled and with a limited number of characters, and sometimes containing in-line text-based syntactical elements like at-replies, hashtags, group 'bangtags' etc.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "MicroblogPost",
   :vs/term_status "unstable",
   :vs/userdocs :ov/MicroblogPost.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"8607aed0-827c-4bda-b131-b4166b4c8af4\""})

(def MultiSportEvent
  "MultiSportEvent"
  {:db/ident         :ov/MultiSportEvent,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "MultiSportEvent",
   :rdfs/subClassOf  [:event/Event :ov/MultiSportEvent],
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/MultiSportEvent.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"b6186590-a786-4bff-a376-0b2e52d7558b\""})

(def NewsItem
  "A piece of News"
  {:db/ident :ov/NewsItem,
   :dc11/created #inst "2010-11-16T02:21:58.000-00:00",
   :label/plural "News items",
   :rdf/type :owl/Class,
   :rdfs/comment "A piece of News",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "News item",
   :rdfs/subClassOf [:sioc/Item :ov/NewsItem],
   :skos/note "http://open.vocab.org/changes/2e07bb5c195fde8447ae776dd287fc39",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/NewsItem"})

(def NotAKillerGorilla
  "Indicates that something is definitely not a Killer-Gorilla. (It may still be a killer though. Or a gorilla.)"
  {:db/ident :ov/NotAKillerGorilla,
   :label/plural "Non Killer-Gorillas",
   :owl/disjointWith :ov/KillerGorilla,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Indicates that something is definitely not a Killer-Gorilla. (It may still be a killer though. Or a gorilla.)",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Non Killer-Gorilla",
   :rdfs/subClassOf [:owl/Thing :ov/NotAKillerGorilla],
   :vs/term_status "unstable",
   :vs/userdocs :ov/NotAKillerGorilla.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"5236de5a-f4e8-47d8-9f06-6f80b2b70df0\""})

(def Numismatics
  "Numismatics is the study of coins, medals and other related items."
  {:db/ident :ov/Numismatics,
   :ov/markdownDescription
   "Numismatics is  the study of coins, medals and other related items.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Numismatics is  the study of coins, medals and other related items.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Numismatics",
   :vs/term_status "unstable",
   :vs/userdocs :ov/Numismatics.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"7f375a7e-1689-46d3-b57f-a4fedd73bc3f\""})

(def OkkamEntity
  "Any entity that can be identified using the OKKAM entity naming system. In general one could say this is equivalent to resource but there are certain entity types that will work better on the OKKAM system"
  {:db/ident :ov/OkkamEntity,
   :label/plural "Okkam entities",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any entity that can be identified using the OKKAM entity naming system. In general one could say this is equivalent to resource but there are certain entity types that will work better on the OKKAM system",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Okkam Entity",
   :vs/term_status "unstable",
   :vs/userdocs :ov/OkkamEntity.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"10b866d1-5d06-4c28-82f1-349d56044222\""})

(def OlympicGames
  "The Olympic Games are an international multi-sport event established for both summer and winter sports."
  {:db/ident :ov/OlympicGames,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The Olympic Games are an international multi-sport event established for both summer and winter sports.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Olympic games",
   :rdfs/subClassOf [:ov/MultiSportEvent :ov/OlympicGames :event/Event],
   :vs/term_status "unstable",
   :vs/userdocs :ov/OlympicGames.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"41789c0e-3be8-4c07-9b27-0b972563eedf\""})

(def Plot
  "A Plot of anything."
  {:db/ident :ov/Plot,
   :label/plural "Plots",
   :ov/markdownDescription
   "Example: a film's plot (http://en.wikipedia.org/wiki/Forrest_Gump#Plot).\n\nSee elso http://open.vocab.org/terms/Plot.",
   :owl/disjointWith
   [:foaf/Person :foaf/Project :foaf/Agent :foaf/Organization],
   :owl/equivalentClass :bibo/Document,
   :rdf/type :owl/Class,
   :rdfs/comment "A Plot of anything.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Plot",
   :rdfs/subClassOf [:foaf/Document :ov/Plot],
   :vs/term_status "unstable",
   :vs/userdocs :ov/Plot.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"1783d6b3-c71a-43f4-b5ee-9bbe5a4de9d7\""})

(def PrimaryVisualElement
  "Primary Visual Element"
  {:db/ident         :ov/PrimaryVisualElement,
   :label/plural     "Primary Visual Elements",
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Primary Visual Element",
   :rdfs/subClassOf  [:ov/VisualElement :ov/PrimaryVisualElement],
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/PrimaryVisualElement.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"feca0d81-0e01-46b9-afd4-370edb4399af\""})

(def RTFMImperative
  "RTFMImperative is an instruction for foaf:Agent(s) to read a given document."
  {:db/ident :ov/RTFMImperative,
   :label/plural "instructions to RTFM",
   :rdf/type :owl/Class,
   :rdfs/comment
   "RTFMImperative is an instruction for foaf:Agent(s) to read a given document.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "instruction to RTFM",
   :vs/term_status "unstable",
   :vs/userdocs :ov/RTFMImperative.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"6b4810b0-1701-4561-9523-c5f3e1704940\""})

(def RadioOperationFrequency
  "When a radio transmits a signal, a range of frequencies is used to carry information. This range may be continuous or dis-contiguous (\"spread spectrum\"). There is usually a single frequency that is used to \"name\" the tranmission frequency, although this naming depends on the mode used. (See RadioOperationMode). The standard method of expression is \"Herz\" (or a multiple). Sometimes, surprisingly, the \"frequency\" is expressed in terms of length (actually wavelength, often in meters). This is merely an colloquial and equivalent expresssion, since freq(Herz) = the-speed-of-light / wavelength."
  {:db/ident :ov/RadioOperationFrequency,
   :dc11/created #inst "2010-06-25T17:15:10.000-00:00",
   :label/plural "Frequencies of operation of a radio.",
   :rdf/type :owl/Class,
   :rdfs/comment
   "When a radio transmits a signal, a range of frequencies is used to carry information.  This range may be continuous or dis-contiguous (\"spread spectrum\").  There is usually a single frequency that is used to \"name\" the tranmission frequency, although this naming depends on the mode used.  (See RadioOperationMode).  The standard method of expression is \"Herz\" (or a multiple).  Sometimes, surprisingly, the \"frequency\" is expressed in terms of length (actually wavelength, often in meters).  This is merely an colloquial and equivalent expresssion, since freq(Herz) = the-speed-of-light / wavelength.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Frequency of operation of a radio.",
   :skos/note "http://open.vocab.org/changes/cf1cd786b1ca7a1d1f2bec0b9b1e6ff9",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/RadioOperationFrequency"})

(def ScientificDatabase
  "A Scientific Database"
  {:db/ident         :ov/ScientificDatabase,
   :label/plural     "Scientific Databases",
   :rdf/type         :owl/Class,
   :rdfs/comment     "A Scientific Database",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Scientific Database",
   :rdfs/subClassOf  [:ov/Database :ov/ScientificDatabase],
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/ScientificDatabase.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"b4296af5-1c30-406e-be89-8e3c8b3d2bdb\""})

(def SportEvent
  "e.g. : 100m in Beijing 2008"
  {:db/ident         :ov/SportEvent,
   :rdf/type         :owl/Class,
   :rdfs/comment     "e.g. : 100m in Beijing 2008",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Sport Event ",
   :rdfs/subClassOf  [:event/Event :ov/SportEvent],
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/SportEvent.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"306d5bc0-a01b-4df9-a86d-ca05856cacdb\""})

(def StillAKillerGorilla
  "Indicates that the subject is a non-deceased killer gorilla."
  {:db/ident :ov/StillAKillerGorilla,
   :label/plural "Living Killer Gorillas",
   :ov/markdownDescription
   "Zombie killer gorillas are an edge case. It is hoped that we'll be able to decide how they are modelled once we gain more experience in this area.",
   :owl/disjointWith :ov/NotAKillerGorilla,
   :rdf/type :owl/Class,
   :rdfs/comment "Indicates that the subject is a non-deceased killer gorilla.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Living Killer Gorilla",
   :rdfs/subClassOf [:ov/KillerGorilla
                     :ov/StillAKillerGorilla
                     "http://umbel.org/umbel/sc/Gorilla"],
   :vs/term_status "unstable",
   :vs/userdocs :ov/StillAKillerGorilla.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"b8d9a0b9-e2be-4502-a418-2ade8533805b\""})

(def SummerOlympicGames
  "Summer Olympic Games"
  {:db/ident         :ov/SummerOlympicGames,
   :owl/disjointWith :ov/WinterOlympicGames,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Summer Olympic Games",
   :rdfs/subClassOf  [:ov/OlympicGames
                      :ov/SummerOlympicGames
                      :ov/MultiSportEvent
                      :event/Event],
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/SummerOlympicGames.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"daa558f3-c5ce-4b69-a5b7-4066a7430077\""})

(def Test
  {:db/ident :ov/Test,
   :skos/note "http://open.vocab.org/changes/2bf811af5c27d629e2d9c3053d51b92c",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "5f2e2bc8-3ecc-4d50-9a19-6d715765088a"})

(def TrimPackage
  "A Trim Package represents a standard configuration of options for an automobile. Usually, a Car Model will be available as several Trim Packages."
  {:db/ident :ov/TrimPackage,
   :label/plural "Trim Packages",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Trim Package represents a standard configuration of options for an automobile.  Usually, a Car Model will be available as several Trim Packages.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Trim Package",
   :rdfs/subClassOf [:ov/AutomobileCataologType :ov/TrimPackage],
   :vs/term_status "unstable",
   :vs/userdocs :ov/TrimPackage.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"fb106a26-a7ca-4184-b93a-05119cf00eb7\""})

(def UnivCourse
  "A course taught at a university"
  {:db/ident         :ov/UnivCourse,
   :rdf/type         :owl/Class,
   :rdfs/comment     "A course taught at a university",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "University Course",
   :rdfs/subClassOf  [:ov/Course :ov/UnivCourse],
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/UnivCourse.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"d4796e2e-d861-442b-ad09-0d66399a0994\""})

(def UnivSchool
  "A school of a university (e.g., School of Business)."
  {:db/ident         :ov/UnivSchool,
   :rdf/type         :owl/Class,
   :rdfs/comment     "A school of a university (e.g., School of Business).",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "University School",
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/UnivSchool.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"12c38e7e-a5a6-4890-86b1-34a097dbf48c\""})

(def UuOjngyFVCE
  {:db/ident :ov/UuOjngyFVCE,
   :ov/markdownDescription
   "xRrGkE  <a href=\"http://tnddwztwfavt.com/\">tnddwztwfavt</a>, [url=http://ivpomxvblqzq.com/]ivpomxvblqzq[/url], [link=http://imdmenezcjwo.com/]imdmenezcjwo[/link], http://zbgficehatfl.com/",
   :skos/note "http://open.vocab.org/changes/96a163ef2e8dac7ff185541319b72062",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "15df64a2-d1ae-4694-a5c0-6117f574c1e1"})

(def VisualElement
  "A thing that manifests visually."
  {:db/ident :ov/VisualElement,
   :label/plural "Visual Elements",
   :ov/markdownDescription
   "a box in a powerpoint diagram is a VisualElement and can ov:depicts mit:TBL.\n\nAnother box on a different slide is a different VisualElement and can also ov:depicts mit:TBL.",
   :rdf/type :owl/Class,
   :rdfs/comment "A thing that manifests visually.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Visual Element",
   :rdfs/subClassOf :ov/VisualElement,
   :vs/term_status "unstable",
   :vs/userdocs :ov/VisualElement.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"02480410-26e1-4f17-a435-53849497cf51\""})

(def Vocabulary
  "A set of terms or names, each one having an assigned meaning."
  {:db/ident :ov/Vocabulary,
   :label/plural "vocabularies",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A set of terms or names, each one having an assigned meaning.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Vocabulary",
   :vs/term_status "unstable",
   :vs/userdocs :ov/Vocabulary.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"7b7177d8-ef11-4bb6-8eb1-21f77125592a\""})

(def Ware
  "Generic term for category of ceramics that may be distinguished by function, surface treatment, distinguishing features of clay, or other set of criteria as defined by usage. Commonly used in the discipline of Archaeology."
  {:db/ident :ov/Ware,
   :label/plural "Wares",
   :ov/markdownDescription
   "The term \"Ware\" is used by archaeologists and collectors to identify any similar set of ceramic vessels, often by reference to some combination of the physical characteristics of the clay, surface treatment, overall shape, functional class, or place of manufacture. It is a common term in the field of archaeology. Usages include \"Halaf Ware\", a Sixth Millenium BC product of the Neolithic Halaf Culture of Northern Mesopotamia; \"Deptford Ware\" from England; \"African Red Slip\" a Roman period product from what is now the modern country of Tunisia; ",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Generic term for category of ceramics that may be distinguished by function, surface treatment, distinguishing features of clay, or other set of criteria as defined by usage. Commonly used in the discipline of Archaeology.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Ware",
   :rdfs/subClassOf :ov/Ware,
   :vs/term_status "unstable",
   :vs/userdocs :ov/Ware.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"7e358f56-84a8-4175-91d5-f4a62075c089\""})

(def WheelChairEnabled
  "A place that is accessible with a wheel chair."
  {:db/ident :ov/WheelChairEnabled,
   :dc11/created #inst "2010-12-04T14:53:07.000-00:00",
   :label/plural "wheel chair enabled",
   :rdf/type :owl/Class,
   :rdfs/comment "A place that is accessible with a wheel chair.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "wheel chair enabled",
   :skos/note "http://open.vocab.org/changes/c2d81d27a043b772dbcdebaa607f5cf5",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/WheelChairEnabled"})

(def WinterOlympicGames
  "Winter Olympic Games"
  {:db/ident         :ov/WinterOlympicGames,
   :owl/disjointWith :ov/SummerOlympicGames,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "Winter Olympic Games",
   :rdfs/subClassOf  [:ov/OlympicGames
                      :ov/WinterOlympicGames
                      :ov/MultiSportEvent
                      :event/Event],
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/WinterOlympicGames.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"08c64b6a-d0cc-4364-9c80-e3ecc9a169f7\""})

(def Yoli
  {:db/ident :ov/Yoli,
   :skos/note "http://open.vocab.org/changes/bfb72b690fb1c39f1a0c1f7a03a1913f",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "7d90314f-0e21-4480-b225-5b4f8716cc77"})

(def ZoiaCommand
  "A command issued to the code4lib IRC chat bot, zoia."
  {:db/ident         :ov/ZoiaCommand,
   :label/plural     "ZoiaCommands",
   :rdf/type         :owl/Class,
   :rdfs/comment     "A command issued to the code4lib IRC chat bot, zoia.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label       "ZoiaCommand",
   :rdfs/subClassOf  ["http://rdfs.org/sioc/spec/#term_Post" :ov/ZoiaCommand],
   :vs/term_status   "unstable",
   :vs/userdocs      :ov/ZoiaCommand.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "d7091da8-aaa6-4f7b-8b8a-39a8e8aeddc4"})

(def accountIdentifier
  "foaf:OnlineAccount's can have an accountName, but plenty of services use an account identifier internally that is not the same as the public account name: for instance, Twitter uses a nickname and a user_id property. Facebook now assigns usernames as well as internal identification numbers. Google's various services assign a unique identifier so that people are not revealing their e-mail address or username. This property is for these kind of identifiers."
  {:db/ident :ov/accountIdentifier,
   :dc11/created #inst "2010-07-03T19:17:39.000-00:00",
   :label/plural "Account Identifiers",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "foaf:OnlineAccount's can have an accountName, but plenty of services use an account identifier internally that is not the same as the public account name: for instance, Twitter uses a nickname and a user_id property. Facebook now assigns usernames as well as internal identification numbers. Google's various services assign a unique identifier so that people are not revealing their e-mail address or username. This property is for these kind of identifiers.",
   :rdfs/domain :foaf/OnlineAccount,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Account Identifier",
   :rdfs/subPropertyOf :ov/accountIdentifier,
   :skos/note "http://open.vocab.org/changes/2a9f5971d34c6f031f26509e9c90eecc",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/accountIdentifier"})

(def admWIUQRlVUqNMadZQ
  {:db/ident :ov/admWIUQRlVUqNMadZQ,
   :ov/markdownDescription
   "Excellent site. It was pleasant to me., <a href= http://vampirefreaks.com/replicarolexwatches >All about replica rolex watches</a>, [url= http://vampirefreaks.com/replicarolexwatches ]All about replica rolex watches[/url],  8-]], ",
   :skos/note "http://open.vocab.org/changes/644cb9a48dc00e40579fb6db0f6204ba",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "e95d1305-acf6-42de-a7a2-ba948c1e2164"})

(def aeNumber
  "The Authorised Examiner Number of an MOT Testing Station."
  {:db/ident :ov/aeNumber,
   :dc11/created #inst "2011-07-26T14:10:10.000-00:00",
   :label/plural "AE Numbers",
   :rdf/type [:rdf/Property :owl/InverseFunctionalProperty],
   :rdfs/comment "The Authorised Examiner Number of an MOT Testing Station.",
   :rdfs/domain :ov/MOTTestingStation,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "AE Number",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :ov/aeNumber,
   :skos/note "http://open.vocab.org/changes/ae4f6686ae1cda79a770e3db68d8497b",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/aeNumber"})

(def affiliation
  "Used to describe the affiliation, place of work or association of a foaf:Person when the source data is too ambiguous to model into its own resource."
  {:db/ident :ov/affiliation,
   :label/plural "Personal or Professional Affiliations",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Used to describe the affiliation, place of work or association of a foaf:Person when the source data is too ambiguous to model into its own resource.",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Personal or Professional Affiliation",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/affiliation,
   :vs/term_status "unstable",
   :vs/userdocs :ov/affiliation.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"bec2de41-2196-4eae-9375-52180179deb6\""})

(def aggregates
  "An agent syndicates a document some way."
  {:db/ident :ov/aggregates,
   :label/plural "syndicates",
   :rdf/type :rdf/Property,
   :rdfs/comment "An agent syndicates a document some way.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "syndicates",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :ov/aggregates,
   :skos/note
   ["http://open.vocab.org/changes/6af621544ccf8f64ee5d852b6e43577c"
    "http://open.vocab.org/changes/0d39d8327b8e32ca374bf478244ddcd6"
    "http://open.vocab.org/changes/d7d77fad5449f29f7c5e318ba770c895"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "8292a082-1b27-4e4b-aac0-20750acaac82"})

(def anniversary
  "The anniversary of some event"
  {:db/ident :ov/anniversary,
   :label/plural "Anniversaries",
   :ov/markdownDescription
   "P1DBUm  <a href=\"http://tlretrishzly.com/\">tlretrishzly</a>, [url=http://ywdctirrpimo.com/]ywdctirrpimo[/url], [link=http://azbcchuxcjzl.com/]azbcchuxcjzl[/link], http://jhvgdshuwxci.com/",
   :rdf/type :rdf/Property,
   :rdfs/comment "The anniversary of some event",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Anniversary",
   :rdfs/subPropertyOf :ov/anniversary,
   :skos/note "http://open.vocab.org/changes/bfa7e9aa44b6ccb13c0d4a4165b14223",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "f8e48112-3798-434d-a7d4-0233aab6c5a1"})

(def areaHectares
  "The area of some physical thing in hectares."
  {:db/ident :ov/areaHectares,
   :label/plural "Area in Hectares",
   :owl/equivalentProperty
   "http://data.ordnancesurvey.co.uk/ontology/geometry/hectares",
   :rdf/type :rdf/Property,
   :rdfs/comment "The area of some physical thing in hectares.",
   :rdfs/domain :geo/SpatialThing,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Area in Hectares",
   :rdfs/subPropertyOf :ov/areaHectares,
   :skos/note
   ["http://open.vocab.org/changes/95643421f4d6271170c8d871855bfce5"
    "http://open.vocab.org/changes/f07ca76699a536dd38b5cbbbe1ba181d"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "f7db4219-177f-41f9-b1fe-b78a398b39d0"})

(def associatedEntity
  "This property is used to relate two FRBR Endeavours/entities (http://vocab.org/frbr/core.html#Endeavour) together even if the entire Work-Expression-Manifestation-Item hierarchy does not exist. For example, it could be used to relate a frbr:Work to a frbr:Manifestation without the need of a frbr:Expression to link them through. The property is symmetric (if a <_:work> ov:associatedEntity <_:item> then <_:item> ov:associatedEntity <_:work>. It is not transitive (items may be associated with the same work but not be in the same WEMI chain, for example)."
  {:db/ident :ov/associatedEntity,
   :label/plural "Associated Entities",
   :rdf/type [:rdf/Property :owl/SymmetricProperty],
   :rdfs/comment
   "This property is used to relate two FRBR Endeavours/entities (http://vocab.org/frbr/core.html#Endeavour) together even if the entire Work-Expression-Manifestation-Item hierarchy does not exist.  For example, it could be used to relate a frbr:Work to a frbr:Manifestation without the need of a frbr:Expression to link them through.  The property is symmetric (if a <_:work> ov:associatedEntity <_:item> then <_:item> ov:associatedEntity <_:work>.  It is not transitive (items may be associated with the same work but not be in the same WEMI chain, for example).",
   :rdfs/domain :frbr/Endeavour,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Associated Entity",
   :rdfs/range :frbr/Endeavour,
   :rdfs/subPropertyOf :ov/associatedEntity,
   :skos/note
   ["http://open.vocab.org/changes/a42c1b5adec3d9726de570db00473349"
    "http://open.vocab.org/changes/858f9d725057f7d7814d33390975df00"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "9660a248-90f4-4aff-94ec-26dd8a279791"})

(def attestsTo
  "A thing that provides evidence for the existence or historicity of another thing attests to that other thing."
  {:db/ident :ov/attestsTo,
   :label/plural "Providing evidence for existence or historicity",
   :ov/markdownDescription
   "For example: the inscription described at http://insaph.kcl.ac.uk/iaph2007/iAph120214.html attests to the existence of the historical places Claudiopolis, Ancyra of Galatia, Pessinus, Damascus, Beirut, Tyre, Caesarea Stratonos, Neapolis of Samaria, Scythopolis, Gaza, Caesarea Panias, Hieropolis, Anazarbus, Mopsuestia, Tripolis of Syria, Philadelphia of Arabia, at Zeugma by the Euphrates, and Kibyra.",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A thing that provides evidence for the existence or historicity of another thing attests to that other thing.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Providing evidence for existence or historicity",
   :rdfs/subPropertyOf :ov/attestsTo,
   :vs/term_status "unstable",
   :vs/userdocs :ov/attestsTo.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"dfb9077f-bea2-4d8b-a63a-423e70dcc9a6\""})

(def authorString
  "The literal, human readable author string of a Document."
  {:db/ident :ov/authorString,
   :label/plural "Author strings",
   :ov/markdownDescription
   "Useful for retaining the author sequence information without reification, rdf:Seq, etc.",
   :rdf/type :rdf/Property,
   :rdfs/comment "The literal, human readable author string of a Document.",
   :rdfs/domain :foaf/Document,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Author string",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/authorString,
   :vs/term_status "unstable",
   :vs/userdocs :ov/authorString.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"0a19b995-d483-4cdb-8c95-6d93ca13b80e\""})

(def avatarBendingElement
  "One or more of the four elements viz. Air, Water, Fire and Earth that can be bent."
  {:db/ident :ov/avatarBendingElement,
   :dc11/created #inst "2011-03-22T17:44:44.000-00:00",
   :label/plural "The Elements an Individual Can Bend",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "One or more of the four elements viz. Air, Water, Fire and Earth that can be bent.",
   :rdfs/domain :ov/AvatarCharacterTraits,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "The Element an Individual Can Bend",
   :rdfs/subPropertyOf :ov/avatarBendingElement,
   :skos/note "http://open.vocab.org/changes/3372ecb5debd5e8ab08ea17fef1526d4",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/avatarBendingElement"})

(def avatarEyeColor
  "Describes the eye color of an individual"
  {:db/ident :ov/avatarEyeColor,
   :dc11/created #inst "2011-03-22T17:51:05.000-00:00",
   :label/plural "Color of Eyes of an Individual",
   :rdf/type :rdf/Property,
   :rdfs/comment "Describes the eye color of an individual",
   :rdfs/domain :ov/AvatarCharacterTraits,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Color of Eyes of an Individual",
   :rdfs/subPropertyOf :ov/avatarEyeColor,
   :skos/note "http://open.vocab.org/changes/d10ac116ea14990313c949ec98fc0504",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/avatarEyeColor"})

(def avatarFirstAppearance
  "Describes when the character was introduced in the series."
  {:db/ident :ov/avatarFirstAppearance,
   :dc11/created #inst "2011-03-22T17:52:38.000-00:00",
   :label/plural "First Appearances of Character",
   :rdf/type :rdf/Property,
   :rdfs/comment "Describes when the character was introduced in the series.",
   :rdfs/domain :ov/AvatarCharacterTraits,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "First Appearance of Character",
   :rdfs/subPropertyOf :ov/avatarFirstAppearance,
   :skos/note "http://open.vocab.org/changes/0c662c0d6eca9d0d4adfca604a0ce4b9",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/avatarFirstAppearance"})

(def avatarHairColor
  "Defines the hair color (or no hair at all!) of an individual"
  {:db/ident :ov/avatarHairColor,
   :dc11/created #inst "2011-03-22T17:47:03.000-00:00",
   :label/plural "Hair Color of an Individual",
   :rdf/type :rdf/Property,
   :rdfs/comment "Defines the hair color (or no hair at all!) of an individual",
   :rdfs/domain :ov/AvatarCharacterTraits,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Color of Hair of an Individual",
   :rdfs/subPropertyOf :ov/avatarHairColor,
   :skos/note "http://open.vocab.org/changes/6054e1d5045e23a92106c9d85e703d44",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/avatarHairColor"})

(def avatarNationality
  "The nationality of a character in Avatar. It can be one of Air, Fire, Water and Earth."
  {:db/ident :ov/avatarNationality,
   :label/plural "Nationalities of a Character in Graphic Novel Avatar",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The nationality of a character in Avatar. It can be one of Air, Fire, Water and Earth.",
   :rdfs/domain :ov/AvatarCharacterTraits,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Nationality of a Character in Graphic Novel Avatar",
   :rdfs/subPropertyOf :ov/avatarNationality,
   :skos/note
   ["http://open.vocab.org/changes/bafe3c78c3594a08dc22907b7af85320"
    "http://open.vocab.org/changes/026b1c38656bf6ddaad2361554d7011d"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "817ab5ce-bebb-42c0-84a9-29b5c89210dd"})

(def avatarPosition
  "Determines if the character is protagonist, antagonist, supporting character etc."
  {:db/ident :ov/avatarPosition,
   :dc11/created #inst "2011-03-22T17:49:42.000-00:00",
   :label/plural "Position of the Character in Graphic Novel Avatar",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Determines if the character is protagonist, antagonist, supporting character etc.",
   :rdfs/domain :ov/AvatarCharacterTraits,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Position of the Character in Graphic Novel Avatar",
   :rdfs/subPropertyOf :ov/avatarPosition,
   :skos/note "http://open.vocab.org/changes/62d141a916add2a81efaec8cd489bb31",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/avatarPosition"})

(def bbcWeatherId
  "The BBC provides IDs for places. This can be used to link BBC weather IDs to places."
  {:db/ident :ov/bbcWeatherId,
   :dc11/created #inst "2010-08-25T12:54:11.000-00:00",
   :label/plural "BBC Weather IDs",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The BBC provides IDs for places. This can be used to link BBC weather IDs to places.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "BBC Weather ID",
   :rdfs/subPropertyOf :ov/bbcWeatherId,
   :skos/note "http://open.vocab.org/changes/fb2b182ed72d24ca635f7e008b42a4ac",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/bbcWeatherId"})

(def beam-componentOf
  "Following an EAD description, collections consist of one or more \"components\". Components act much like files and folders - a component may contain others (folder) or it may be a leaf node (file) - EAD is vague enough not to make this distinction, but provides a \"level\" attribute instead. This property is used by a component to show that if is a \"componentOf\" either another component or a collection or both."
  {:db/ident :ov/beam-componentOf,
   :label/plural "ComponentsOf",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Following an EAD description, collections consist of one or more \"components\". Components act much like files and folders - a component may contain others (folder) or it may be a leaf node (file) - EAD is vague enough not to make this distinction, but provides a \"level\" attribute instead. This property is used by a component to show that if is a \"componentOf\" either another component or a collection or both.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "ComponentOf",
   :rdfs/subPropertyOf :ov/beam-componentOf,
   :vs/term_status "unstable",
   :vs/userdocs :ov/beam-componentOf.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"86d3c156-dea8-49af-9188-24037f86ec27\""})

(def blid
  "A sub-classing of bibo:identifier to narrow the range to be the numeric part of a BL identifier. For example: '(Uk)33994949' ---> '<foo> <ov:blid> \"33994949\"'"
  {:db/ident :ov/blid,
   :dc11/created #inst "2010-11-09T02:14:29.000-00:00",
   :label/plural "British Library identifiers",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A sub-classing of bibo:identifier to narrow the range to be the numeric part of a BL identifier. For example:\n\n'(Uk)33994949'  --->  '<foo> <ov:blid> \"33994949\"'",
   :rdfs/domain :bibo/Document,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "British Library identifier",
   :rdfs/subPropertyOf [:bibo/identifier :ov/blid],
   :skos/note "http://open.vocab.org/changes/96b44361e89a958a8540475d09c13276",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/blid"})

(def bsRGyjqyy
  {:db/ident :ov/bsRGyjqyy,
   :ov/markdownDescription
   "Perfect work, http://vampirefreaks.com/buy_viagra Best buy viagra,  pwvku, ",
   :skos/note "http://open.vocab.org/changes/75fdfa17f388e9a9e535f475980f6007",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "9dac55e7-1dc4-4eda-9c9b-6adadf2b6bc0"})

(def bthPpNLjjQHuCC
  {:db/ident :ov/bthPpNLjjQHuCC,
   :ov/markdownDescription
   "comment2, <a href= http://www.ipetitions.com/petition/indian_reservation_cigarettes/#1 >Best indian reservation cigarettes</a> [url=http://www.ipetitions.com/petition/indian_reservation_cigarettes/#1]Best indian reservation cigarettes[/url],  zcu, <a href= http://www.ipetitions.com/petition/fake_coach_purses/#1 >Buy fake coach purses</a> [url=http://www.ipetitions.com/petition/fake_coach_purses/#1]Buy fake coach purses[/url],  663, <a href= http://www.ipetitions.com/petition/cheap_cigarettes/#1 >cheap cigarettes</a> [url=http://www.ipetitions.com/petition/cheap_cigarettes/#1]cheap cigarettes[/url],  wln, <a href= http://www.ipetitions.com/petition/knock_off_designer_purses/#1 >knock off designer purses</a> [url=http://www.ipetitions.com/petition/knock_off_designer_purses/#1]knock off designer purses[/url],  coskhb, <a href= http://www.ipetitions.com/petition/knock_off_coach_purses/#1 >knock off coach purses</a> [url=http://www.ipetitions.com/petition/knock_off_coach_purses/#1]knock off coach purses[/url],  5618, ",
   :skos/note "http://open.vocab.org/changes/5f99bae47315e040f8a040af91a25ff9",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "53ab4754-f75e-417c-90e2-a5224364ed0c"})

(def building
  {:db/ident        :ov/building,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ov/building})

(def businessCard
  "A business card associated with this resource."
  {:db/ident :ov/businessCard,
   :label/plural "Business Cards",
   :owl/equivalentProperty "http://purl.org/uF/hCard/terms/hasCard",
   :rdf/type :rdf/Property,
   :rdfs/comment "A business card associated with this resource.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Business Card",
   :rdfs/range :vcard/VCard,
   :rdfs/subPropertyOf :ov/businessCard,
   :skos/note
   ["http://open.vocab.org/changes/0a8d6d27db41d0a297e67d0da3f0c45b"
    "http://open.vocab.org/changes/4d316062a929a47b0313fddaa68084b5"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "b7eaec45-5c0e-4ae8-b880-131b4ee9129d"})

(def businessInterest
  "Business Interest"
  {:db/ident           :ov/businessInterest,
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Business Interest",
   :rdfs/subPropertyOf :ov/businessInterest,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/businessInterest.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"e3c06d28-b842-4264-9fa4-75c008ae1fda\""})

(def calendar
  "A calendar associated with this resource."
  {:db/ident :ov/calendar,
   :label/plural "Calendars",
   :ov/markdownDescription
   "X8MZrJ  <a href=\"http://lsxkhoxxsuwb.com/\">lsxkhoxxsuwb</a>, [url=http://aswturqaprud.com/]aswturqaprud[/url], [link=http://yxtryhogdakn.com/]yxtryhogdakn[/link], http://rasuuqixgaff.com/",
   :rdf/type :rdf/Property,
   :rdfs/comment "A calendar associated with this resource.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Calendar",
   :rdfs/subPropertyOf :ov/calendar,
   :skos/note "http://open.vocab.org/changes/696e85da9edec64d68eba889bd8c6707",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "bc1bcb98-0116-46e1-8073-dd3e5579a70a"})

(def canonicalInformationResource
  {:db/ident :ov/canonicalInformationResource,
   :ov/markdownDescription
   "http://usuarios.lycos.es/cpucrfqk/3m\nhttp://members.lycos.co.uk/kjhbcuf/14\nhttp://utenti.lycos.it/hyycnaqo/1u\nhttp://usuarios.lycos.es/onnrxf/11\nhttp://mitglied.lycos.de/ahroib/3v\nhttp://members.lycos.co.uk/wljpff/7\nhttp://usuarios.lycos.es/giugie/2f\nhttp://mitglied.lycos.de/uzdywue/15\nhttp://utenti.lycos.it/pzbvjm/3k\nhttp://usuarios.lycos.es/kjwsof/40\nhttp://mitglied.lycos.de/xwohaa/m\nhttp://utenti.lycos.it/ddzzxn/34\nhttp://members.lycos.co.uk/uuinnh/2m\nhttp://mitglied.lycos.de/alcenn/2v\nhttp://utenti.lycos.it/uunybmui/49\nhttp://usuarios.lycos.es/giugie/o\nhttp://members.lycos.co.uk/qldxerf/24\nhttp://utenti.lycos.it/ddzzxn/35\nhttp://members.lycos.co.uk/ykfktvm/1d\nhttp://usuarios.lycos.es/hndvrpks/2d\nhttp://mitglied.lycos.de/oirizt/1p\nhttp://usuarios.lycos.es/lfgcmz/\nhttp://members.lycos.co.uk/qldxerf/\nhttp://mitglied.lycos.de/vqiafzz/v\nhttp://utenti.lycos.it/vfjlxd/b\nhttp://members.lycos.co.uk/ykfktvm/m\nhttp://utenti.lycos.it/nhbliuhf/2b\nhttp://usuarios.lycos.es/xasyjkti/9\nhttp://mitglied.lycos.de/vqiafzz/4c\nhttp://members.lycos.co.uk/qldxerf/1a\n",
   :skos/note "http://open.vocab.org/changes/12eda94cfbf7954bcea9a1e43d011a19",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "3a09dbfb-c6d3-4c86-9372-3dbdd66b37a9"})

(def canonicalUri
  "Denotes the canonical URI that should be used to refer to this resource."
  {:db/ident :ov/canonicalUri,
   :label/plural "Canonical URIs",
   :ov/markdownDescription
   "This property should have a literal as its value, not a resource.\n\nRDF driven systems can use this property to redirect requests to the preferred URI for a resource.",
   :rdf/type
   [:rdf/Property :owl/InverseFunctionalProperty :owl/FunctionalProperty],
   :rdfs/comment
   "Denotes the canonical URI that should be used to refer to this resource.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Canonical URI",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/canonicalUri,
   :vs/term_status "unstable",
   :vs/userdocs :ov/canonicalUri.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"5e2afc39-395c-479b-a9cc-a421e2e6d3e8\""})

(def category
  "A category that the resource has been classified under"
  {:db/ident           :ov/category,
   :label/plural       "categories",
   :owl/inverseOf      :ov/isCategoryOf,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A category that the resource has been classified under",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "category",
   :rdfs/range         "http://www.w3.org/2008/05/skos#Concept",
   :rdfs/subPropertyOf :ov/category,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/category.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"f1f8e17c-fdcb-422a-8555-e258ba36d535\""})

(def classSkeleton
  "Relates class to a class skeleton. If class has more than one of this relations, it should use them all."
  {:db/ident :ov/classSkeleton,
   :dc11/created #inst "2010-04-13T18:40:41.000-00:00",
   :label/plural "class skeletons",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Relates class to a class skeleton. If class has more than one of this relations, it should use them all.",
   :rdfs/domain :rdfs/Class,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Class Skeleton",
   :rdfs/range :ov/ClassSkeleton,
   :rdfs/subPropertyOf [:ov/classSkeletonIgnore :ov/classSkeleton],
   :skos/note "http://open.vocab.org/changes/6ba88e47491c248085e4228f37e1be3c",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/classSkeleton"})

(def classSkeletonIgnore
  "Triples using his property and its sub-properties as predicate are to be ignored by the class skeleton materialization process (http://open.vocab.org/terms/ClassSkeleton). This property is not to be used in real data, it serves just to exist and have sub-properties."
  {:db/ident :ov/classSkeletonIgnore,
   :dc11/created #inst "2010-04-13T19:02:15.000-00:00",
   :label/plural "class skeleton ignore",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Triples using his property and its sub-properties as predicate are to be ignored by the class skeleton materialization process (http://open.vocab.org/terms/ClassSkeleton).\n\nThis property is not to be used in real data, it serves just to exist and have sub-properties.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Class Skeleton Ignore",
   :rdfs/subPropertyOf :ov/classSkeletonIgnore,
   :skos/note "http://open.vocab.org/changes/c7214234665b5f9368df5c2ee32cec08",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/classSkeletonIgnore"})

(def colour
  "Colour"
  {:db/ident           :ov/colour,
   :label/plural       "Colours",
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Colour",
   :rdfs/subPropertyOf :ov/colour,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/colour.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"ea851fab-d330-47b5-a23a-eda4deef052e\""})

(def commonEndeavour
  "commonEndeavour is intended to define a FRBR (Functional Requirements for Bibliographic Records) relationship between two resources that may or may not be modeled as FRBR. This makes it possible to assert that a resource modeled using a vocabulary that does not use the FRBR entity model explicitly is describing the same Work, Expression, Manifestation, and/or Item as another resource (which may or may not use the FRBR model, as well). commonEndeavour is intended to be used merely as a superproperty for WEMI-specific subproperties to inherit from, but there are no restrictions on its use."
  {:db/ident :ov/commonEndeavour,
   :label/plural "Common Endeavours",
   :rdf/type [:owl/SymmetricProperty :rdf/Property],
   :rdfs/comment
   "commonEndeavour is intended to define a FRBR (Functional Requirements for Bibliographic Records) relationship between two resources that may or may not be modeled as FRBR.  This makes it possible to assert that a resource modeled using a vocabulary that does not use the FRBR entity model explicitly is describing the same Work, Expression, Manifestation, and/or Item as another resource (which may or may not use the FRBR model, as well).\n\ncommonEndeavour is intended to be used merely as a superproperty for WEMI-specific subproperties to inherit from, but there are no restrictions on its use.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Common Endeavour",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :ov/commonEndeavour,
   :skos/note
   ["http://open.vocab.org/changes/1c4448a6a1450ae6b123bfbab8c9e9bc"
    "http://open.vocab.org/changes/f4bb90b3d66d4b6225e79dd8a5aaf2e0"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "87624008-ebed-489e-94bc-0f61fd0830f0"})

(def commonExpression
  "This property is used to declare that two resources which may or may not conform to the FRBR (Functional Requirements for Bibliographic Resources) entity model share the same Expression. An example of its use would be to relate a resource described with a vocabulary such as bibo (which does not acknowledge the FRBR model) to other resources that describe endeavours which have the same implied Expression (which could be other bibo resources or FRBR entities or anything else). The property is symmetrical, so if <_:someBiboBook> <ov:commonExpression> <_:otherEdition>, this also means <_:otherEdition> <ov:commonExpression> <_:someBiboBook>. It is not transitive. Having this property also implies ov:commonWork."
  {:db/ident :ov/commonExpression,
   :dc11/created #inst "2010-12-06T17:43:57.000-00:00",
   :label/plural "Common Expressions",
   :rdf/type [:rdf/Property :owl/SymmetricProperty],
   :rdfs/comment
   "This property is used to declare that two resources which may or may not conform to the FRBR (Functional Requirements for Bibliographic Resources) entity model share the same Expression. An example of its use would be to relate a resource described with a vocabulary such as bibo (which does not acknowledge the FRBR model) to other resources that describe endeavours which have the same implied Expression (which could be other bibo resources or FRBR entities or anything else). \n\nThe property is symmetrical, so if <_:someBiboBook> <ov:commonExpression> <_:otherEdition>, this also means <_:otherEdition> <ov:commonExpression> <_:someBiboBook>. \n\nIt is not transitive. \n\nHaving this property also implies ov:commonWork.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Common Expression",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf [:ov/commonEndeavour :ov/commonExpression],
   :skos/note "http://open.vocab.org/changes/86a4f8ed109d61399297c12ac96ba4e4",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/commonExpression"})

(def commonItem
  "This property is used to declare that two resources which may or may not conform to the FRBR (Functional Requirements for Bibliographic Resources) entity model share the same Item. An example of its use would be to relate a resource described with a vocabulary such as bibo (which does not acknowledge the FRBR model) to other resources that describe endeavours which contains the same specific Item (which could be other bibo resources or FRBR entities or anything else). This implies identical WEMI hierarchies. The property is symmetrical, so if <_:specificPhysicalItem> <ov:commonItem> <_:someArchive>, this also means <_:someArchive> <ov:commonItem> <_:specificPhysicalItem>. It is not transitive. Having this property also entails ov:commonManifestation, ov:commonExpression and ov:commonWork."
  {:db/ident :ov/commonItem,
   :dc11/created #inst "2010-12-06T17:52:51.000-00:00",
   :label/plural "Common Items",
   :rdf/type [:owl/SymmetricProperty :rdf/Property],
   :rdfs/comment
   "This property is used to declare that two resources which may or may not conform to the FRBR (Functional Requirements for Bibliographic Resources) entity model share the same Item. An example of its use would be to relate a resource described with a vocabulary such as bibo (which does not acknowledge the FRBR model) to other resources that describe endeavours which contains the same specific Item (which could be other bibo resources or FRBR entities or anything else). This implies identical WEMI hierarchies.\n\nThe property is symmetrical, so if <_:specificPhysicalItem> <ov:commonItem> <_:someArchive>, this also means <_:someArchive> <ov:commonItem> <_:specificPhysicalItem>. \n\nIt is not transitive. \n\nHaving this property also entails ov:commonManifestation, ov:commonExpression and ov:commonWork.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Common Item",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf [:ov/commonEndeavour :ov/commonItem],
   :skos/note "http://open.vocab.org/changes/ff9fe956a8ecdfc589ec8ce8c8bfdb7c",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/commonItem"})

(def commonManifestation
  "This property is used to declare that two resources which may or may not conform to the FRBR (Functional Requirements for Bibliographic Resources) entity model share the same Manifestation. An example of its use would be to relate a resource described with a vocabulary such as bibo (which does not acknowledge the FRBR model) to other resources that describe endeavours which include the same implied Manifestation (which could be other bibo resources or FRBR entities or anything else). The property is symmetrical, so if <_:someBiboBook> <ov:commonManifestation> <_:someFrbrWork>, this also means <_:someFrbrWork> <ov:commonManifestation> <_:someBiboBook>. It is not transitive. Having this property also implies ov:commonExpression and ov:commonWork."
  {:db/ident :ov/commonManifestation,
   :label/plural "Common Manifestations",
   :rdf/type [:rdf/Property :owl/SymmetricProperty],
   :rdfs/comment
   "This property is used to declare that two resources which may or may not conform to the FRBR (Functional Requirements for Bibliographic Resources) entity model share the same Manifestation.  An example of its use would be to relate a resource described with a vocabulary such as bibo (which does not acknowledge the FRBR model) to other resources that describe endeavours which include the same implied Manifestation (which could be other bibo resources or FRBR entities or anything else).\n\nThe property is symmetrical, so if <_:someBiboBook> <ov:commonManifestation> <_:someFrbrWork>, this also means <_:someFrbrWork> <ov:commonManifestation> <_:someBiboBook>.  It is not transitive.\n\nHaving this property also implies ov:commonExpression and ov:commonWork.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Common Manifestation",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf [:ov/commonEndeavour :ov/commonManifestation],
   :skos/note
   ["http://open.vocab.org/changes/eb54915b9158f343feacb0c7cb03dade"
    "http://open.vocab.org/changes/f4c354ac688a3dd54750034b7cf3746d"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "f78eed93-fa94-4591-ac90-1846598f3920"})

(def commonWork
  "This property is used to declare that two resources which may or may not conform to the FRBR (Functional Requirements for Bibliographic Resources) entity model share the same Work. An example of its use would be to relate a resource described with a vocabulary such as bibo (which does not acknowledge the FRBR model) to other resources that describe endeavours that fall within the same implied Work (which could be other bibo resources or FRBR entities or anything else). The property is symmetrical, so if <_:someBiboBook> <ov:commonWork> <_:someOtherBiboBook>, this also means <_:someOtherBiboBook> <ov:commonWork> <_:someBiboBook>. It is not transitive."
  {:db/ident :ov/commonWork,
   :dc11/created #inst "2010-12-06T17:18:34.000-00:00",
   :label/plural "Common Works",
   :rdf/type [:owl/SymmetricProperty :rdf/Property],
   :rdfs/comment
   "This property is used to declare that two resources which may or may not conform to the FRBR (Functional Requirements for Bibliographic Resources) entity model share the same Work. An example of its use would be to relate a resource described with a vocabulary such as bibo (which does not acknowledge the FRBR model) to other resources that describe endeavours that fall within the same implied Work (which could be other bibo resources or FRBR entities or anything else). \n\nThe property is symmetrical, so if <_:someBiboBook> <ov:commonWork> <_:someOtherBiboBook>, this also means <_:someOtherBiboBook> <ov:commonWork> <_:someBiboBook>. \n\nIt is not transitive.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Common Work",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf [:ov/commonEndeavour :ov/commonWork],
   :skos/note "http://open.vocab.org/changes/0524c589f9c5a22734e5f2974dc558eb",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/commonWork"})

(def compassDirection
  "The Compass Direction that a Thing faces."
  {:db/ident :ov/compassDirection,
   :label/plural "Compass Directions",
   :ov/markdownDescription
   "Eg: :NordWand rdfs:label \"North Face of the Eiger\" ; ov:compassDirection \"N\" .\n\nValues should be compass directions, eg: N, NE, E, SE, S, SW, W, NW\n",
   :rdf/type :rdf/Property,
   :rdfs/comment "The Compass Direction that a Thing faces.",
   :rdfs/domain :geo/SpatialThing,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Compass Direction",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/compassDirection,
   :vs/term_status "unstable",
   :vs/userdocs :ov/compassDirection.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"b2a1a580-f238-49af-95ca-fd0bb0798a67\""})

(def composedBy
  ":s :composedBy :o . :o is a \"larger thing\" that composes :s and potentially other \"smaller things\". :s may also establish some structural organization of the things it composes."
  {:db/ident :ov/composedBy,
   :label/plural "composed by",
   :ov/markdownDescription
   "for current task, domain and range would be Visual form. However, the range could be more generally Form.",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ":s :composedBy :o .\n:o is a \"larger thing\" that composes :s and potentially other \"smaller things\". :s may also establish some structural organization of the things it composes.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "composed by",
   :rdfs/subPropertyOf :ov/composedBy,
   :vs/term_status "unstable",
   :vs/userdocs :ov/composedBy.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "0806f709-0905-4750-b0ea-b4df356f2072"})

(def composer
  "associates a manifestation of a musical work with music artist who composed the work"
  {:db/ident :ov/composer,
   :label/plural "Composers",
   :ov/markdownDescription
   "this property is a shortcut that allows one to abuse the Music Ontology to some extent",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "associates a manifestation of a musical work with music artist who composed the work",
   :rdfs/domain "http://purl.org/ontology/mo/MusicalManifestation",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Composer",
   :rdfs/range "http://purl.org/ontology/mo/MusicArtist",
   :rdfs/subPropertyOf :ov/composer,
   :vs/term_status "unstable",
   :vs/userdocs :ov/composer.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"7dfe86b3-9ddd-417d-884c-8622394e3f4d\""})

(def compressedFileSize
  "Describes the size of the file of a dataset in compressed state"
  {:db/ident :ov/compressedFileSize,
   :dc11/created #inst "2010-05-15T18:53:16.000-00:00",
   :rdf/type [:owl/FunctionalProperty :rdf/Property],
   :rdfs/comment
   "Describes the size of the file of a dataset in compressed state",
   :rdfs/domain :void/Dataset,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "compressed dataset file has fileSize",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :ov/compressedFileSize,
   :skos/note "http://open.vocab.org/changes/d35855421f1a39665817797a299e23f3",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/compressedFileSize"})

(def confidence
  "A confidence level for a calculation or value. Usually between 0 and 1."
  {:db/ident :ov/confidence,
   :label/plural "ConfidenceLevels",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A confidence level for a calculation or value.  Usually between 0 and 1.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "ConfidenceLevel",
   :rdfs/subPropertyOf :ov/confidence,
   :vs/term_status "unstable",
   :vs/userdocs :ov/confidence.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"c3cfcbe5-c138-41a5-9c86-22b5600ceb27\""})

(def country
  "A country associated with this resource. This could be a country of origin or operation of an entity. For example a company may be based in a country and operate from there."
  {:db/ident :ov/country,
   :dc11/created #inst "2010-07-12T10:26:32.000-00:00",
   :label/plural "Countries",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A country associated with this resource. This could be a country of origin or operation of an entity. For example a company may be based in a country and operate from there.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Country",
   :rdfs/subPropertyOf :ov/country,
   :skos/note "http://open.vocab.org/changes/1eab2104e6d7359508c548a22b0d3d17",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/country"})

(def creation-tool-used
  {:db/ident :ov/creation-tool-used,
   :ov/markdownDescription
   "GrnKvJ  <a href=\"http://sxbgaiusvhvl.com/\">sxbgaiusvhvl</a>, [url=http://ltciyvdyouzt.com/]ltciyvdyouzt[/url], [link=http://tfkmaksfvkgl.com/]tfkmaksfvkgl[/link], http://rkwqwcsgvzlm.com/",
   :skos/note "http://open.vocab.org/changes/bb2a5529cbd86b2499312da016da9ed1",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "e4d5aee4-7292-4333-ac12-d391a69f3463"})

(def creatorUserAgent
  "The user-agent string of the software used by the creator of an item."
  {:db/ident :ov/creatorUserAgent,
   :label/plural "Creator User Agents",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The user-agent string of the software used by the creator of an item.",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Creator User Agent",
   :rdfs/subPropertyOf :ov/creatorUserAgent,
   :vs/term_status "unstable",
   :vs/userdocs :ov/creatorUserAgent.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"f76d1653-768d-4a3b-acb8-8e3311f4ffdb\""})

(def csvCol
  "The column of a comma separated value file from which this property was created."
  {:db/ident :ov/csvCol,
   :label/plural "csv columns",
   :ov/markdownDescription "see also http://open.vocab.org/terms/csvRow",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The column of a comma separated value file from which this property was created.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "csv column",
   :rdfs/subPropertyOf :ov/csvCol,
   :vs/term_status "unstable",
   :vs/userdocs :ov/csvCol.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "e4007e2d-4707-40f5-8e9c-82c216a5b1d4"})

(def csvRow
  "The row number of a csv from which this instance was created. This is different from the r-th entry within the table, which may be less than the csv row if the csv has title information and a header above the data."
  {:db/ident :ov/csvRow,
   :label/plural "csv rows",
   :ov/markdownDescription
   "Add this property to any instance you make from a row when converting csv to rdf.\n\nsee also http://open.vocab.org/terms/csvCol",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The row number of a csv from which this instance was created. This is different from the r-th entry within the table, which may be less than the csv row if the csv has title information and a header above the data.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "csv row",
   :rdfs/subPropertyOf :ov/csvRow,
   :vs/term_status "unstable",
   :vs/userdocs :ov/csvRow.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "1cdb728e-f479-45ce-a18f-0fd34373bce8"})

(def dateOfDeath
  "The date someone died."
  {:db/ident           :ov/dateOfDeath,
   :label/plural       "Dates of Death",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The date someone died.",
   :rdfs/domain        :foaf/Person,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Date of Death",
   :rdfs/subPropertyOf :ov/dateOfDeath,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/dateOfDeath.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"27095cdd-ef17-415a-b792-4d09cbc7994a\""})

(def defaultProperty
  "Associates properties to a class where the properties are meant to be present in some default view - basically a very light version of fresnel ;-)"
  {:db/ident :ov/defaultProperty,
   :label/plural "default properties",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Associates properties to a class where the properties are meant to be present in some default view - basically a very light version of fresnel ;-)",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "default property",
   :rdfs/subPropertyOf :ov/defaultProperty,
   :vs/term_status "unstable",
   :vs/userdocs :ov/defaultProperty.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"d30de59f-edd3-460e-b59f-77a495c7eadd\""})

(def defines
  "The things defined by this resource - for example, the terms defined by an Ontology."
  {:db/ident :ov/defines,
   :dc11/created #inst "2010-08-03T11:04:11.000-00:00",
   :owl/inverseOf :rdfs/isDefinedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The things defined by this resource - for example, the terms defined by an Ontology.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Defines",
   :rdfs/subPropertyOf :ov/defines,
   :skos/note "http://open.vocab.org/changes/89a196c05ef659bcf5d7b369b80b7142",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/defines"})

(def deliveredBy
  "Teacher of the course. Should belong to the organization specified by ov:offeredBy of the course"
  {:db/ident :ov/deliveredBy,
   :dc11/created #inst "2011-06-23T12:50:14.000-00:00",
   :rdf/type
   [:rdf/Property :owl/FunctionalProperty :owl/InverseFunctionalProperty],
   :rdfs/comment
   "Teacher of the course. Should belong to the organization specified by ov:offeredBy of the course",
   :rdfs/domain :ov/Course,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Course teacher",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :ov/deliveredBy,
   :skos/note "http://open.vocab.org/changes/bc68f4d24211375b48d108817f606a20",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/deliveredBy"})

(def departureDate
  "Date and time your travel will commence"
  {:db/ident           :ov/departureDate,
   :label/plural       "departure dates",
   :rdf/type           [:owl/FunctionalProperty :rdf/Property],
   :rdfs/comment       "Date and time your travel will commence",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "departure date",
   :rdfs/subPropertyOf :ov/departureDate,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/departureDate.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"9214e313-1750-4026-8619-a2279a289ab7\""})

(def depicts
  "When :s :depicts :o, :s is communicable via a visual medium and, when transmitted, depicts the resource :o."
  {:db/ident :ov/depicts,
   :label/plural "depicts",
   :ov/markdownDescription
   "The predicate-object of a :depicts triple could be embedded on a powerpoint diagram element. We could then ask for documents that depict a resource of interest and, conversely, ask what an ambiguous blob of pink on the monitor is actually trying to depict.\n\nfoaf:depicts would be a rdfs:subPropertyOf :depicts. :depicts is more general because other things besides foaf:Images can be communicated via a visual medium.\n\nIs :depicts an ObjectProperty or DatatypeProperty? It could be either.\n\n",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "When :s :depicts :o, :s is communicable via a visual medium and, when transmitted, depicts the resource :o.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "depicts",
   :rdfs/subPropertyOf :ov/depicts,
   :vs/term_status "unstable",
   :vs/userdocs :ov/depicts.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"53f9ed8f-1ad7-4085-8eb2-3e86a08c9307\""})

(def depictsSameResourceAs
  "depicts same resource as"
  {:db/ident :ov/depictsSameResourceAs,
   :label/plural "depict same resource as",
   :ov/markdownDescription
   "depictsSameResourceAs is used by a VisualElement to point to the PrimaryVisualElement within the current display. \n\nboth :a and :b are in same display.\n\n:a ov:depicts :r .\n:b ov:depicts :r .\n:a ov:depictsSameResourceAs :b .\n-----\n:a a ov:VisualElement .\n:b a ov:PrimaryVisualElement .\n:b a ov:VisualElement .\n\n",
   :rdf/type [:rdf/Property :owl/TransitiveProperty],
   :rdfs/domain :ov/VisualElement,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "depicts same resource as",
   :rdfs/range :ov/PrimaryVisualElement,
   :rdfs/subPropertyOf :ov/depictsSameResourceAs,
   :vs/term_status "unstable",
   :vs/userdocs :ov/depictsSameResourceAs.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"64e4a9da-d199-4ec2-a7f1-616765f8a5bb\""})

(def describes
  "The subject is a document that, to any extent, describes the object."
  {:db/ident :ov/describes,
   :label/plural "describes",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The subject is a document that, to any extent, describes the object.",
   :rdfs/domain :foaf/Document,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "describes",
   :rdfs/subPropertyOf :ov/describes,
   :skos/note
   ["http://open.vocab.org/changes/ad090fa220576dd1e5f7e4c4d8e48ce3"
    "http://open.vocab.org/changes/09a35d1cc124c6008b08cf333f3367b4"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "d18ba60e-c03f-4781-8098-6008b0f371b4"})

(def diffFromOther
  "A diff that goes from another resource to this one."
  {:db/ident           :ov/diffFromOther,
   :owl/inverseOf      :ov/diffTarget,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A diff that goes from another resource to this one.",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "diff from other",
   :rdfs/range         :ov/Diff,
   :rdfs/subPropertyOf :ov/diffFromOther,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/diffFromOther.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"c2a683c4-4b22-4ddf-a8e9-d2eb71309152\""})

(def diffSource
  "The resource that this diff goes from."
  {:db/ident           :ov/diffSource,
   :rdf/type           [:owl/FunctionalProperty :rdf/Property],
   :rdfs/comment       "The resource that this diff goes from.",
   :rdfs/domain        :ov/Diff,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "source",
   :rdfs/subPropertyOf :ov/diffSource,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/diffSource.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"d564cc82-bcb9-472d-add8-b794ea0cc92f\""})

(def diffTarget
  "The resource that this diff goes to."
  {:db/ident           :ov/diffTarget,
   :rdf/type           [:owl/FunctionalProperty :rdf/Property],
   :rdfs/comment       "The resource that this diff goes to.",
   :rdfs/domain        :ov/Diff,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "target",
   :rdfs/subPropertyOf :ov/diffTarget,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/diffTarget.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"90e6138e-f106-48a2-8e7d-c91a35b27350\""})

(def diffToOther
  "A diff that goes from this resource to another one."
  {:db/ident           :ov/diffToOther,
   :owl/inverseOf      :ov/diffSource,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A diff that goes from this resource to another one.",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "diff to other",
   :rdfs/range         :ov/Diff,
   :rdfs/subPropertyOf :ov/diffToOther,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/diffToOther.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"f50cd934-9b3a-4d10-833a-5c3ae6425a9b\""})

(def dimensionProperty
  "Relates a property to a Dimension Property with identical meaning for use with the RDF DataCube vocabulary."
  {:db/ident :ov/dimensionProperty,
   :dc11/created #inst "2011-06-22T09:29:42.000-00:00",
   :label/plural "Dimension Properties",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Relates a property to a Dimension Property with identical meaning for use with the RDF DataCube vocabulary.",
   :rdfs/domain :rdf/Property,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Dimension Property",
   :rdfs/range :qb/DimensionProperty,
   :rdfs/subPropertyOf :ov/dimensionProperty,
   :skos/note "http://open.vocab.org/changes/f281fe581b35030a9d62a98591d907e6",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/dimensionProperty"})

(def disclaimer
  "The disclaimer property links a resource to a document that details a disclaimer applied to the resource by the resource owner or other relevant party."
  {:db/ident :ov/disclaimer,
   :dc11/created #inst "2011-03-10T16:33:42.000-00:00",
   :label/plural "disclaimers",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The disclaimer property links a resource to a document that details a disclaimer applied to the resource by the resource owner or other relevant party.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "disclaimer",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf [:foaf/page :ov/disclaimer],
   :skos/note "http://open.vocab.org/changes/5a37615fdc914ee1b71abd3859b86a3a",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/disclaimer"})

(def disclaimerText
  "The disclaimerText property associates a resource with the text of a disclaimer (in the form of an rdfs:Literal) applied to the resource by the resource owner or other relevant party."
  {:db/ident :ov/disclaimerText,
   :dc11/created #inst "2011-03-10T16:28:11.000-00:00",
   :label/plural "disclaimer texts",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The disclaimerText property associates a resource with the text of a disclaimer (in the form of an rdfs:Literal) applied to the resource by the resource owner or other relevant party.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "disclaimer text",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/disclaimerText,
   :skos/note "http://open.vocab.org/changes/1c6f401a896f2e45e6087f4bda507475",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/disclaimerText"})

(def distancePoint
  "A location from which a distance is measured. (A distance measurement will have two points, and a distance measurement value)."
  {:db/ident :ov/distancePoint,
   :label/plural "Distance Points",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A location from which a distance is measured. (A distance measurement will have two points, and a distance measurement value).",
   :rdfs/domain :ov/Distance,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Distance Point",
   :rdfs/range :geo/SpatialThing,
   :rdfs/subPropertyOf :ov/distancePoint,
   :skos/note
   ["http://open.vocab.org/changes/fbbe2c3b9f9f6ca9da408358476dbaec"
    "http://open.vocab.org/changes/3e3c05672cdb096f869c7f1d5dbffa53"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "0dfaa487-6c26-49ed-b2a3-f44024963385"})

(def doesnt-live-here-anymore
  {:db/ident :ov/doesnt-live-here-anymore,
   :ov/markdownDescription
   "Example Usage:  \n\nhttp://dilettantes.code4lib.org/about-me/#me ov:doesnt-live-here-anymore _:bn1 .  \n_:bn1 rdf:type geo:SpatialThing .  \n_:bn1 foaf:name \"Temple Bar\" .  \n",
   :skos/note "http://open.vocab.org/changes/fc7eedeb9727e27998b4ab3e3efc7642",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "4fcdbef8-b859-4e4d-9b81-c5d0a9280d18"})

(def earwormSong
  "The song that is the focus of a particular earworm"
  {:db/ident           :ov/earwormSong,
   :label/plural       "Earworm Songs",
   :owl/inverseOf      :ov/isSongOfEarworm,
   :rdf/type           [:owl/FunctionalProperty :rdf/Property],
   :rdfs/comment       "The song that is the focus of a particular earworm",
   :rdfs/domain        :ov/Earworm,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Earworm Song",
   :rdfs/range         "http://purl.org/ontology/mo/MusicalWork",
   :rdfs/subPropertyOf :ov/earwormSong,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/earwormSong.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"bae2faae-baf8-4a4b-9e5d-0d4d644d8e8f\""})

(def earwormSufferer
  "The person who experiences or suffers from a particular ear worm"
  {:db/ident :ov/earwormSufferer,
   :label/plural "Earworm Sufferers",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The person who experiences or suffers from a particular ear worm",
   :rdfs/domain :ov/Earworm,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Earworm Sufferer",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :ov/earwormSufferer,
   :vs/term_status "unstable",
   :vs/userdocs :ov/earwormSufferer.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"c200f00c-80ff-4204-9fa3-140bd40025a3\""})

(def earwormTransmitter
  "The transmitter of a particular Earworm"
  {:db/ident           :ov/earwormTransmitter,
   :label/plural       "Earworm Transmitters",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The transmitter of a particular Earworm",
   :rdfs/domain        :ov/Earworm,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Earworm Transmitter",
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :ov/earwormTransmitter,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/earwormTransmitter.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"20cb8959-0536-45ab-b44c-e992ee66edbd\""})

(def editForm
  "Associates a resource with a form that can be used to edit its description. See http://patterns.dataincubator.org/book/edit-trail.html for more information."
  {:db/ident :ov/editForm,
   :dc11/created #inst "2010-07-30T15:09:08.000-00:00",
   :label/plural "Edit Forms",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Associates a resource with a form that can be used to edit its description. See http://patterns.dataincubator.org/book/edit-trail.html for more information.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Edit Form",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :ov/editForm,
   :skos/note "http://open.vocab.org/changes/c3e7659038285b49febf4eec5a55115c",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/editForm"})

(def endTime
  "The time of day that something ends."
  {:db/ident           :ov/endTime,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The time of day that something ends.",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "End Time",
   :rdfs/subPropertyOf :ov/endTime,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/endTime.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"0479db41-f51c-4faa-8486-ae8337692dd4\""})

(def enhancedDescription
  "This property is to be used to relate a resource to an \"enhanced description\". An enhanced description is one that provides additional, richer detail about a resource than may typically be obtained by a simple de-reference of the resource's URI."
  {:db/ident :ov/enhancedDescription,
   :label/plural "enhanced descriptions",
   :ov/markdownDescription
   "The property can be used in several scenarios the simplest being to refer to an RDF document that provides additional context about a resource. This alone adds little more than rdfs:seeAlso.\n\nHowever it is expected that typically a user agent may be issued with an authentication challenge (e.g. at the HTTP protocol level) when attempting to access the document. This would support delivery of \"premium\" views of a resource as Linked Data. Using this property a user agent could distinguish those documents from others that are simply referred to with an rdfs:seeAlso.",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This property is to be used to relate a resource to an \"enhanced description\". An enhanced description is one that provides additional, richer detail about a resource than may typically be obtained by a simple de-reference of the resource's URI.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "enhanced description",
   :rdfs/subPropertyOf [:rdfs/seeAlso :ov/enhancedDescription],
   :vs/term_status "unstable",
   :vs/userdocs :ov/enhancedDescription.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "09a37218-ac62-494c-9b02-27aee3f6e129"})

(def exampleInstance
  {:db/ident :ov/exampleInstance,
   :ov/markdownDescription
   "Vocabulary authors can use this to to provide an example of how their term(s) can be used.",
   :skos/note "http://open.vocab.org/changes/1f4feb53eef5a881a926d36576b084f6",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "96c48aa7-3e04-4cb0-b2e5-b360bef347f7"})

(def exampleResource
  "an example resource using a vocabulary term or terms"
  {:db/ident :ov/exampleResource,
   :label/plural "Example Resources",
   :ov/markdownDescription
   "ex:p ov:exampleResource [ ex:p \"example\" ] .\nex:C ov:exampleResource [ a ex:C  ] .",
   :rdf/type :rdf/Property,
   :rdfs/comment "an example resource using a vocabulary term or terms",
   :rdfs/domain :rdf/Schema,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Example Resource",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :ov/exampleResource,
   :vs/term_status "unstable",
   :vs/userdocs :ov/exampleResource.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"08960a15-69ec-4190-9759-d67256c68570\""})

(def eyeColor
  "Eye Color"
  {:db/ident :ov/eyeColor,
   :dc11/created #inst "2011-03-22T20:04:08.000-00:00",
   :label/plural "Color of Eyes of an Individual",
   :rdf/type :rdf/Property,
   :rdfs/comment "Eye Color",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Color of Eye of an Individual",
   :rdfs/subPropertyOf :ov/eyeColor,
   :skos/note "http://open.vocab.org/changes/3f7cdce55970ad1fcf06f451dac4deca",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/eyeColor"})

(def familiarName
  "The name used in familiar situations by friends, e.g. Ian"
  {:db/ident :ov/familiarName,
   :label/plural "Familiar Names",
   :rdf/type :rdf/Property,
   :rdfs/comment "The name used in familiar situations by friends, e.g. Ian\n",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Familiar Name",
   :rdfs/subPropertyOf [:foaf/name :ov/familiarName],
   :vs/term_status "unstable",
   :vs/userdocs :ov/familiarName.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"97bc7f71-3dd9-4e51-b75b-686bf817687e\""})

(def favouriteDrink
  "A drink, alcoholic or not, that the person in question is particularly fond of. It's what they would typically order in a place where the drink is available. The object can be a literal stating the name of the drink, or (preferred) an RDF resource."
  {:db/ident :ov/favouriteDrink,
   :label/plural "Favourite Drink",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A drink, alcoholic or not, that the person in question is particularly fond of. It's what they would typically order in a place where the drink is available. The object can be a literal stating the name of the drink, or (preferred) an RDF resource.",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Favourite Drink",
   :rdfs/subPropertyOf :ov/favouriteDrink,
   :vs/term_status "unstable",
   :vs/userdocs :ov/favouriteDrink.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"97ec2442-9a4f-4af2-bbaa-5a5542983d60\""})

(def favouritedBy
  "favourite"
  {:db/ident           :ov/favouritedBy,
   :label/plural       "favourite",
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "favourite",
   :rdfs/subPropertyOf :ov/favouritedBy,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/favouritedBy.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"a0be6559-7fb1-43b2-ad95-b4a32c99763a\""})

(def faxNumber
  "A fax number that can be used to send faxes to a Person or Organisation."
  {:db/ident :ov/faxNumber,
   :label/plural "Fax Numbers",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A fax number that can be used to send faxes to a Person or Organisation.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Fax Number",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/faxNumber,
   :skos/note
   ["http://open.vocab.org/changes/3a9709d7b102dcf4d1dd3e80aec9ef54"
    "http://open.vocab.org/changes/55db37ee437e5885084cdf1525a75304"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "f6d8ddb3-cc24-42b6-b86e-a794a1621f9b"})

(def featurefile
  "associates a musical item with a feature file describing that item"
  {:db/ident :ov/featurefile,
   :label/plural "Feature Files",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "associates a musical item with a feature file describing that item",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Feature File",
   :rdfs/subPropertyOf :ov/featurefile,
   :vs/term_status "unstable",
   :vs/userdocs :ov/featurefile.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"e19352ad-928d-4393-ae82-170efedca7a7\""})

(def fileSize
  "Describes the size of the file of a dataset in the normal (uncompressed) state"
  {:db/ident :ov/fileSize,
   :dc11/created #inst "2010-05-15T18:50:31.000-00:00",
   :rdf/type [:owl/FunctionalProperty :rdf/Property],
   :rdfs/comment
   "Describes the size of the file of a dataset in the normal (uncompressed) state",
   :rdfs/domain :void/Dataset,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "dataset file has fileSize",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :ov/fileSize,
   :skos/note "http://open.vocab.org/changes/c760869682c68fd435c797716bd1ed02",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/fileSize"})

(def findspot
  "The place at which a thing is found."
  {:db/ident           :ov/findspot,
   :label/plural       "Findspots",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The place at which a thing is found.",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Findspot",
   :rdfs/subPropertyOf :ov/findspot,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/findspot.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"4a451a70-cf10-41d0-af79-5153a339e112\""})

(def firstSentence
  "The first sentence of a resource."
  {:db/ident           :ov/firstSentence,
   :label/plural       "First Sentences",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The first sentence of a resource.",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "First Sentence",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :ov/firstSentence,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/firstSentence.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"d0c054eb-1301-4435-b0e9-c26543ceea6d\""})

(def foafro
  "Use this property to state that you admire a friend's fro"
  {:db/ident :ov/foafro,
   :rdf/type :rdf/Property,
   :rdfs/comment "Use this property to state that you admire a friend's fro",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Friend of a Fro",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :ov/foafro,
   :vs/term_status "unstable",
   :vs/userdocs :ov/foafro.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"b00f1516-b2a6-4844-8dbe-5d4cce398e33\""})

(def formalName
  "The name used when referred to in formal situations, e.g. Mr. Davis"
  {:db/ident :ov/formalName,
   :label/plural "Formal Names",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The name used when referred to in formal situations, e.g. Mr. Davis\n",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Formal Name",
   :rdfs/subPropertyOf [:foaf/name :ov/formalName],
   :vs/term_status "unstable",
   :vs/userdocs :ov/formalName.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"d6ea7b0b-ee99-4220-b060-38293560747c\""})

(def fullName
  "The full name as expected to be used on an identifying document e.g. Mr Ian Robert Davis"
  {:db/ident :ov/fullName,
   :label/plural "Full Name",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The full name as expected to be used on an identifying document e.g. Mr Ian Robert Davis\n",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Full Name",
   :rdfs/subPropertyOf [:foaf/name :ov/fullName],
   :vs/term_status "unstable",
   :vs/userdocs :ov/fullName.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"64dbc931-a343-46ea-9438-4f279a69cf09\""})

(def geoBoundaryDefiner
  "The agent that defines the boundaries of a geographic area."
  {:db/ident :ov/geoBoundaryDefiner,
   :dc11/created #inst "2010-11-10T21:13:29.000-00:00",
   :label/plural "Geographic Boundary Definers",
   :rdf/type :rdf/Property,
   :rdfs/comment "The agent that defines the boundaries of a geographic area.",
   :rdfs/domain "http://www.geonames.org/ontology#Feature",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Geographic Boundary Definer",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :ov/geoBoundaryDefiner,
   :skos/note "http://open.vocab.org/changes/71047b1e64f46bf00a97639ff3afdb34",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/geoBoundaryDefiner"})

(def geoqrcode
  "The value of this property is a QRCode image that encodes the geographic coordinates of the resource. The coordinates are encoded using the WGS84 datum in the following form - geo:[lat],[long]"
  {:db/ident :ov/geoqrcode,
   :dc11/created #inst "2011-07-11T23:24:29.000-00:00",
   :label/plural "Geographic QRCodes",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The value of this property is a QRCode image that encodes the geographic coordinates of the resource. The coordinates are encoded using the WGS84 datum in the following form - geo:[lat],[long]",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Geographic QRCode",
   :rdfs/subPropertyOf :ov/geoqrcode,
   :skos/note "http://open.vocab.org/changes/0131fa01293988cba6e31a1a697cf158",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/geoqrcode"})

(def has
  "Boundary point has a position"
  {:db/ident           :ov/has,
   :label/plural       "have",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Boundary point has a position",
   :rdfs/domain        :ov/DOMBoundaryPoint,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "has",
   :rdfs/range         :ov/DOMBoundaryPointPosition,
   :rdfs/subPropertyOf :ov/has,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/has.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"5d58c32e-8d88-4aab-83e3-df7f1b0bb76e\""})

(def hasBoundary
  "DOMRange has 2 boundary points"
  {:db/ident           :ov/hasBoundary,
   :label/plural       "have boundaries",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "DOMRange has 2 boundary points",
   :rdfs/domain        :ov/DOMRange,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "has boundary",
   :rdfs/range         :ov/DOMBoundaryPoint,
   :rdfs/subPropertyOf :ov/hasBoundary,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hasBoundary.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"00ec0301-e6b3-4235-9737-cf33cef44950\""})

(def hasChecksum
  "has checksum - expecting (acronym/name):(checksum hexdigest) eg ov:hasChecksum \"sha1:a526a7c1bc65348dc7649556bee283ee3c999b92\""
  {:db/ident :ov/hasChecksum,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "has checksum - expecting (acronym/name):(checksum hexdigest)\n\neg        ov:hasChecksum  \"sha1:a526a7c1bc65348dc7649556bee283ee3c999b92\"",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "has checksum",
   :rdfs/subPropertyOf :ov/hasChecksum,
   :vs/term_status "unstable",
   :vs/userdocs :ov/hasChecksum.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"7b9d69fd-2df4-4c7d-9a68-c8890ae90543\""})

(def hasContentType
  "Encoding MIME-Type information in a trivial manner - equivalent to HTTP header: Content-Type."
  {:db/ident :ov/hasContentType,
   :label/plural "Content Types",
   :ov/markdownDescription
   "Use to encode MIME information alongside URIs that correspond to representations of the noted MIME formats.",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Encoding MIME-Type information in a trivial manner - equivalent to HTTP header: Content-Type.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Content Type",
   :rdfs/subPropertyOf :ov/hasContentType,
   :vs/term_status "unstable",
   :vs/userdocs :ov/hasContentType.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"0e8079a2-2449-4887-8568-9acf36c700ed\""})

(def hasFavourited
  "favourite"
  {:db/ident           :ov/hasFavourited,
   :label/plural       "favourites",
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "favourite",
   :rdfs/subPropertyOf :ov/hasFavourited,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hasFavourited.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"874e8311-ec05-49a7-b641-38a5772bef31\""})

(def hasLender
  "Domain: any institution or individual who borrows money from loaner Range: any institution or individual who loans a borrower money"
  {:db/ident :ov/hasLender,
   :dc11/created #inst "2010-11-28T14:41:53.000-00:00",
   :label/plural "has lenders",
   :owl/inverseOf :ov/hasLender,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Domain: any institution or individual who borrows money from loaner\nRange: any institution or individual who loans a borrower money",
   :rdfs/domain :ov/Borrower,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Has lender",
   :rdfs/range :ov/Loaner,
   :rdfs/subPropertyOf :ov/hasLender,
   :skos/note "http://open.vocab.org/changes/e13d3c73563e94e04fd36e02c6c76ad1",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/hasLender"})

(def hasMD5
  "has MD5 checksum"
  {:db/ident           :ov/hasMD5,
   :label/plural       "has MD5 checksums",
   :rdf/type           :rdf/Property,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "has MD5 checksum",
   :rdfs/subPropertyOf :ov/hasMD5,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hasMD5.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"9424ae05-85f0-4975-8e56-9fb295e3f447\""})

(def hasNationality
  "Links a person to a country that he or she may be a member. (A person can have multiple nationalities). The domain is foaf:Person but the range is open (although http://dbpedia.org/ontology/Country or http://umbel.org/umbel/rc/Country are suggested)"
  {:db/ident :ov/hasNationality,
   :label/plural "Nationalities",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a person to a country that he or she may be a member. (A person can have multiple nationalities). The domain is foaf:Person but the range is open (although http://dbpedia.org/ontology/Country or http://umbel.org/umbel/rc/Country are suggested)",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "nationality",
   :rdfs/subPropertyOf :ov/hasNationality,
   :skos/note
   ["http://open.vocab.org/changes/b015cb92932515f28d43cca6a5ac9a2a"
    "http://open.vocab.org/changes/dc254ba1192dfd2a668ff941bb474f73"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "3c2fe92a-a7ec-4576-afd8-2ad23964ad7b"})

(def hasNode
  "has node"
  {:db/ident           :ov/hasNode,
   :label/plural       "has nodes",
   :rdf/type           :rdf/Property,
   :rdfs/domain        :ov/DOMBoundaryPoint,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "has node",
   :rdfs/subPropertyOf :ov/hasNode,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hasNode.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"b1b98130-8b8d-4021-b125-3f44a2399e21\""})

(def hasOffset
  "has offset"
  {:db/ident               :ov/hasOffset,
   :label/plural           "has offsets",
   :ov/markdownDescription "TODO: How should this be used? Offset from what?",
   :rdf/type               :rdf/Property,
   :rdfs/isDefinedBy       "http://open.vocab.org/terms",
   :rdfs/label             "has offset",
   :rdfs/subPropertyOf     :ov/hasOffset,
   :vs/term_status         "unstable",
   :vs/userdocs            :ov/hasOffset.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"74194e9d-3a50-4d43-851e-5e297456fe9d\""})

(def hasPlot
  "Something has a plot."
  {:db/ident :ov/hasPlot,
   :label/plural "hasPlots",
   :ov/markdownDescription
   "Example: a film's plot (http://en.wikipedia.org/wiki/Forrest_Gump#Plot).\n\nSee also http://open.vocab.org/terms/hasPlot",
   :owl/inverseOf :dcterms/isPartOf,
   :rdf/type :rdf/Property,
   :rdfs/comment "Something has a plot.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "hasPlot",
   :rdfs/range :ov/Plot,
   :rdfs/subPropertyOf [:dcterms/hasPart :ov/hasPlot],
   :vs/term_status "unstable",
   :vs/userdocs :ov/hasPlot.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"4619db81-f615-4463-b183-969917bfce32\""})

(def hasPosition
  "has position"
  {:db/ident           :ov/hasPosition,
   :label/plural       "have positions",
   :rdf/type           :rdf/Property,
   :rdfs/domain        :ov/DOMBoundaryPoint,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "has position",
   :rdfs/range         :ov/DOMBoundaryPointPosition,
   :rdfs/subPropertyOf :ov/hasPosition,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hasPosition.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"2e423a23-cde7-48cb-9e92-cc21332fdafe\""})

(def hasRange
  "a resource (e.g. HTML content --> awol:Content) has a DOM range"
  {:db/ident :ov/hasRange,
   :label/plural "has ranges",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "a resource (e.g. HTML content --> awol:Content) has a DOM range",
   :rdfs/domain "http://bblfish.net/work/atom-owl/2006-06-06/#Content",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "has range",
   :rdfs/range :ov/DOMRange,
   :rdfs/subPropertyOf :ov/hasRange,
   :vs/term_status "unstable",
   :vs/userdocs :ov/hasRange.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"94e2e475-f1bd-4ac0-884e-c59418ea5a2c\""})

(def hearts
  "Slang for loves."
  {:db/ident           :ov/hearts,
   :label/plural       "Hearts",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Slang for loves.",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Hearts",
   :rdfs/range         :owl/Thing,
   :rdfs/subPropertyOf :ov/hearts,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hearts.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"d8b21121-64c8-429d-a07e-fbcb39d22ff4\""})

(def homepage
  {:db/ident :ov/homepage,
   :skos/note "http://open.vocab.org/changes/c3ff83e5ff4906adf412f03ba8268cf5",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "d9c6f58e-a847-490b-91dd-b51ace8586ac"})

(def houseColor
  "color of a house"
  {:db/ident               :ov/houseColor,
   :label/plural           "houseColor",
   :ov/markdownDescription "I bet I'm going to wish i could delete this",
   :owl/equivalentProperty :ov/housePaintColor,
   :owl/inverseOf          :ov/colorsOfHouses,
   :rdf/type               [:rdf/Property :owl/TransitiveProperty],
   :rdfs/comment           "color of a house",
   :rdfs/domain            :ov/House,
   :rdfs/isDefinedBy       "http://open.vocab.org/terms",
   :rdfs/label             "houseColor",
   :rdfs/range             :ov/Colors,
   :rdfs/subPropertyOf     [:foaf/depiction :ov/houseColor],
   :vs/term_status         "unstable",
   :vs/userdocs            :ov/houseColor.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"15b175cf-e249-4dce-a2b3-ae6cccb18065\""})

(def hudBefore
  "loans before"
  {:db/ident           :ov/hudBefore,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :ov/HUDSuggestion,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "loans before",
   :rdfs/subPropertyOf :ov/hudBefore,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hudBefore.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"2d376bac-23a8-4e2c-9a7d-423e84fb5ecf\""})

(def hudCommon
  "The number of loans two books have in common"
  {:db/ident           :ov/hudCommon,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The number of loans two books have in common",
   :rdfs/domain        :ov/HUDSuggestion,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "loans in common",
   :rdfs/subPropertyOf :ov/hudCommon,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hudCommon.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"7fca85bb-d0eb-4be2-a4ae-cb5df73a0ac1\""})

(def hudCourse
  "A course associated with a book loan"
  {:db/ident           :ov/hudCourse,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A course associated with a book loan",
   :rdfs/domain        :ov/HUDCourseLoan,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "course",
   :rdfs/range         :ov/UnivCourse,
   :rdfs/subPropertyOf :ov/hudCourse,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hudCourse.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"773741a1-9842-42ce-bd24-9caebdf550ef\""})

(def hudLoanCount
  "The number of loans of a book within a year, school, or course"
  {:db/ident :ov/hudLoanCount,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The number of loans of a book within a year, school, or course",
   :rdfs/domain :ov/HUDCourseLoan,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "loan count",
   :rdfs/subPropertyOf :ov/hudLoanCount,
   :vs/term_status "unstable",
   :vs/userdocs :ov/hudLoanCount.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"d86a7d2d-8120-4bee-bbb1-6889fca9bf59\""})

(def hudLoanTotal
  "total loans"
  {:db/ident           :ov/hudLoanTotal,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :bibo/Book,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "total loans",
   :rdfs/subPropertyOf :ov/hudLoanTotal,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hudLoanTotal.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"238d57c2-e3cd-49ac-9aed-93b4712872a7\""})

(def hudSame
  "simultaneous loans"
  {:db/ident           :ov/hudSame,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "simultaneous loans",
   :rdfs/domain        :ov/HUDSuggestion,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "same",
   :rdfs/subPropertyOf :ov/hudSame,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hudSame.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"e6903663-ad44-42c7-82bf-d3c3b396acfc\""})

(def hudSchool
  "The school associated with the loan history of a book"
  {:db/ident           :ov/hudSchool,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The school associated with the loan history of a book",
   :rdfs/domain        :ov/HUDSchoolLoan,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "school",
   :rdfs/range         :ov/UnivSchool,
   :rdfs/subPropertyOf :ov/hudSchool,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hudSchool.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"52a9580b-e410-4397-93c4-007e0c8a7468\""})

(def hudSchoolLoan
  "school loan"
  {:db/ident           :ov/hudSchoolLoan,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :bibo/Book,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "school loan",
   :rdfs/range         :ov/HUDSchoolLoan,
   :rdfs/subPropertyOf :ov/hudSchoolLoan,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hudSchoolLoan.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"ab3c1def-5064-4d20-b57d-28bf990264f1\""})

(def hudSuggestedBook
  {:db/ident :ov/hudSuggestedBook,
   :ov/markdownDescription
   "zUTCZl  <a href=\"http://ecwkzljhhcsn.com/\">ecwkzljhhcsn</a>, [url=http://ixsydgixkdex.com/]ixsydgixkdex[/url], [link=http://cqrudtojtdym.com/]cqrudtojtdym[/link], http://otzumfcnltce.com/",
   :skos/note "http://open.vocab.org/changes/b8fa72eeabd10490836a465768f64fa4",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "c8bfe586-5fc7-4173-9d57-14df9eeec093"})

(def hudSuggestion
  "suggestion"
  {:db/ident           :ov/hudSuggestion,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :bibo/Book,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "suggestion",
   :rdfs/range         :ov/HUDSuggestion,
   :rdfs/subPropertyOf :ov/hudSuggestion,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hudSuggestion.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"10325d0c-c101-44d9-bfc7-1d01b09954d5\""})

(def hudYear
  "The year associated with a loan history"
  {:db/ident           :ov/hudYear,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The year associated with a loan history",
   :rdfs/domain        :ov/HUDYearLoan,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "year",
   :rdfs/subPropertyOf :ov/hudYear,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/hudYear.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"32c3dfd5-b6da-44f6-b36a-4fd2aa4d4991\""})

(def icon
  "a pictorial representation for something."
  {:db/ident :ov/icon,
   :dc11/created #inst "2010-11-13T17:10:32.000-00:00",
   :label/plural "Icons",
   :rdf/type :rdf/Property,
   :rdfs/comment "a pictorial representation for something.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Icon",
   :rdfs/range :foaf/Image,
   :rdfs/subPropertyOf :ov/icon,
   :skos/note "http://open.vocab.org/changes/11b99e13946186a32dd147da150437c9",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/icon"})

(def imWsBhgGVLi
  {:db/ident :ov/imWsBhgGVLi,
   :ov/markdownDescription
   "comment2, http://www.ipetitions.com/petition/carmen_electra_sex_tape/ carmen electra sex tape,  3492, ",
   :skos/note "http://open.vocab.org/changes/18d46a92bbdb858693932e8e7f7f659f",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "4b785fb8-93d3-42ea-879d-65ef4dd93319"})

(def image
  "an image of the resource, whatever it may be. Typically the value of this property will be the URI of some sort of digital image."
  {:db/ident :ov/image,
   :dc11/created #inst "2010-04-20T15:03:38.000-00:00",
   :label/plural "Images",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "an image of the resource, whatever it may be. Typically the value of this property will be the URI of some sort of digital image.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Image",
   :rdfs/subPropertyOf :ov/image,
   :skos/note "http://open.vocab.org/changes/71a8f47de6d907d319467235cc3a39af",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/image"})

(def informalName
  "The name used when referred to in informal situations, e.g. Ian Davis"
  {:db/ident :ov/informalName,
   :label/plural "Informal Names",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The name used when referred to in informal situations, e.g. Ian Davis\n",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Informal Name",
   :rdfs/subPropertyOf [:foaf/name :ov/informalName],
   :vs/term_status "unstable",
   :vs/userdocs :ov/informalName.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"01be552d-7adf-4404-a476-a352b647a839\""})

(def isCategoryOf
  "The value of this property is something that has been classified under the resource"
  {:db/ident :ov/isCategoryOf,
   :label/plural "are categories of",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The value of this property is something that has been classified under the resource",
   :rdfs/domain "http://www.w3.org/2008/05/skos#Concept",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "is category of",
   :rdfs/subPropertyOf :ov/isCategoryOf,
   :vs/term_status "unstable",
   :vs/userdocs :ov/isCategoryOf.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"967965ac-1341-47b9-9548-12d51fb5050b\""})

(def isCuratedBy
  "curated by"
  {:db/ident           :ov/isCuratedBy,
   :label/plural       "curated by",
   :rdf/type           :rdf/Property,
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "curated by",
   :rdfs/subPropertyOf :ov/isCuratedBy,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/isCuratedBy.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"0dfc11b3-e58e-435e-87bb-9f91f9421cf9\""})

(def isDefinedBy
  "DOMBoundaryPointPosition is defines by a DOMNode and a DOMOffset"
  {:db/ident :ov/isDefinedBy,
   :label/plural "are defined by",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "DOMBoundaryPointPosition is defines by a DOMNode and a DOMOffset",
   :rdfs/domain :ov/DOMBoundaryPointPosition,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "is defined by",
   :rdfs/range :ov/DOMOffset,
   :rdfs/subPropertyOf :ov/isDefinedBy,
   :vs/term_status "unstable",
   :vs/userdocs :ov/isDefinedBy.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"90391756-74b0-4325-a851-7e1a4b6e07dd\""})

(def isHeaderOf
  "Header"
  {:db/ident           :ov/isHeaderOf,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :foaf/Person,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Header",
   :rdfs/range         :foaf/Organization,
   :rdfs/subPropertyOf [:ov/isMemberOf :ov/isHeaderOf],
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/isHeaderOf.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"463ac0dc-1778-456b-8653-4efdd97da7e5\""})

(def isMemberOf
  "Property to link an agent with an organization (inverse property of http://xmlns.com/foaf/0.1/member)"
  {:db/ident :ov/isMemberOf,
   :owl/inverseOf :foaf/member,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Property to link an agent with an organization (inverse property of http://xmlns.com/foaf/0.1/member)",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "is member of",
   :rdfs/range :foaf/Organization,
   :rdfs/subPropertyOf :ov/isMemberOf,
   :skos/note "http://open.vocab.org/changes/2082134e6f00f0e8bf21552c055ff7fa",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "37ef7bf9-9e9b-4ac0-a8fd-56164a51dab9"})

(def isSongOfEarworm
  "A song which is the focus of a particular Earworm"
  {:db/ident           :ov/isSongOfEarworm,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A song which is the focus of a particular Earworm",
   :rdfs/domain        "http://purl.org/ontology/mo/MusicalWork",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "is Song of Earworm",
   :rdfs/range         :ov/Earworm,
   :rdfs/subPropertyOf :ov/isSongOfEarworm,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/isSongOfEarworm.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"ae14c996-3b3a-440f-984d-cd79e4df59fc\""})

(def json
  "The JSON representation of a (usually small) dataset."
  {:db/ident :ov/json,
   :label/plural "JSON representations",
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment "The JSON representation of a (usually small) dataset.",
   :rdfs/domain :dcmitype/Dataset,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "JSON",
   :rdfs/subPropertyOf :ov/json,
   :skos/note
   ["http://open.vocab.org/changes/c5ee58b9f1c56ab89de6822e2369e465"
    "http://open.vocab.org/changes/7c9eab6675375ec38c948702c9907f4d"
    "http://open.vocab.org/changes/abbbaac0b1fd8be1630de25771dd0299"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "a5b686c5-df11-46df-8eb5-2b94c207f500"})

(def keywords
  "A comma separated list of words that are particularly pertinent to this resource."
  {:db/ident :ov/keywords,
   :dc11/created #inst "2010-04-13T19:54:30.000-00:00",
   :label/plural "keywords",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A comma separated list of words that are particularly pertinent to this resource.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "keywords",
   :rdfs/subPropertyOf :ov/keywords,
   :skos/note "http://open.vocab.org/changes/f9e40e4de03487020a6dfcbf4e87f3d5",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/keywords"})

(def kilometres
  "The number of kilometres of a distance measurement."
  {:db/ident :ov/kilometres,
   :dc11/created #inst "2011-08-19T07:40:06.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment "The number of kilometres of a distance measurement.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Kilometres",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :ov/kilometres,
   :skos/note "http://open.vocab.org/changes/8081494b4d05ee944f76ce88e2e43f02",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/kilometres"})

(def kudosTo
  "to express kudos to someone (acknowledge a contribution, feedback, etc.)"
  {:db/ident :ov/kudosTo,
   :label/plural "kudos to",
   :ov/markdownDescription
   "For example, if you have a DOAP project and want to ack some input re contribution, tester, feedback, etc. you would go like:\n\n    :myproject a doap:Project ;\n               ov:kudos :John .\n\nor, on a more personal level, it would be:\n\n    :me ov:kudos :John .",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "to express kudos to someone (acknowledge a contribution, feedback, etc.) ",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "kudos to",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf [:rdfs/seeAlso :ov/kudosTo],
   :vs/term_status "unstable",
   :vs/userdocs :ov/kudosTo.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"cd58f6d1-d6a7-45f6-9de0-67b0ac5c4d84\""})

(def lastCachedPage
  "The most recently cached static page describing the resource."
  {:db/ident :ov/lastCachedPage,
   :dc11/created #inst "2011-04-26T14:37:11.000-00:00",
   :rdf/type [:rdf/Property :owl/FunctionalProperty],
   :rdfs/comment
   "The most recently cached static page describing the resource.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Last Cached Page",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :ov/lastCachedPage,
   :skos/note "http://open.vocab.org/changes/c83a1eb1ce7f7dbd99dc5122e611aa61",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/lastCachedPage"})

(def length
  "The linear extent of a thing."
  {:db/ident               :ov/length,
   :label/plural           "Lengths",
   :ov/markdownDescription "For example: the road has a length of 1 mile.",
   :rdf/type               :rdf/Property,
   :rdfs/comment           "The linear extent of a thing.",
   :rdfs/isDefinedBy       "http://open.vocab.org/terms",
   :rdfs/label             "Length",
   :rdfs/subPropertyOf     :ov/length,
   :vs/term_status         "unstable",
   :vs/userdocs            :ov/length.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"688982a5-ddaa-4d03-9a3f-0fe23b1385be\""})

(def libraryService
  "A service providing access to bibliographic resources."
  {:db/ident :ov/libraryService,
   :label/plural "Library Services",
   :owl/inverseOf
   "http://schemas.talis.com/2005/library/schema#isLibraryServiceOf",
   :rdf/type :rdf/Property,
   :rdfs/comment "A service providing access to bibliographic resources.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Library Service",
   :rdfs/subPropertyOf :ov/libraryService,
   :skos/note
   ["http://open.vocab.org/changes/64e2aa207329fbe60c7326caba86e0c5"
    "http://open.vocab.org/changes/0a5b5404ad9798ef085d7b424d6aa6f7"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "f1fda987-bf88-4b60-be43-c69e24f1cbb6"})

(def machineTag
  "a machine tag that can be used to identify the domain resource in tagging applications."
  {:db/ident :ov/machineTag,
   :ov/markdownDescription "eg:\n\n_:x ov:machineTag \"lastfm:event=863464\" .",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "a machine tag that can be used to identify the domain resource in tagging applications. ",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "machine-tag",
   :rdfs/subPropertyOf :ov/machineTag,
   :vs/term_status "unstable",
   :vs/userdocs :ov/machineTag.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"88817428-a23c-444b-abf8-c9c10d6778f6\""})

(def madeIn
  "The place where a particular object was made. (Made is left intentionally vague and follows the same semantics as foaf:maker, foaf:made etc.)"
  {:db/ident :ov/madeIn,
   :dc11/created #inst "2011-03-10T16:56:41.000-00:00",
   :label/plural "places where made",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The place where a particular object was made. (Made is left intentionally vague and follows the same semantics as foaf:maker, foaf:made etc.)",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "place where made",
   :rdfs/subPropertyOf :ov/madeIn,
   :skos/note "http://open.vocab.org/changes/43f0f8a7bab5ea2662277a47c5bc4893",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/madeIn"})

(def maidenName
  "A person's maiden name."
  {:db/ident :ov/maidenName,
   :dc11/created #inst "2010-11-29T21:48:32.000-00:00",
   :label/plural "Maiden Names",
   :rdf/type :rdf/Property,
   :rdfs/comment "A person's maiden name.",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Maiden Name",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/maidenName,
   :skos/note "http://open.vocab.org/changes/499c8f64bc910793ce4fffce765146f5",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/maidenName"})

(def manchax
  "The Manchester Syntax for a owl construct (e.g., Restriction). :manchex rdfs:subPropertyOf rdfs:label ."
  {:db/ident :ov/manchax,
   :label/plural "manchester syntax",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The Manchester Syntax for a owl construct (e.g., Restriction).\n\n:manchex rdfs:subPropertyOf rdfs:label .",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "manchester syntax",
   :rdfs/subPropertyOf :ov/manchax,
   :vs/term_status "unstable",
   :vs/userdocs :ov/manchax.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"61eea541-a1e1-4d83-acc9-5cc85222842b\""})

(def mirror
  "Indicates a resource that is designed to be a mirror or surrogate of the object resource; a backup copy, should the object resource be lost or unobtainable."
  {:db/ident :ov/mirror,
   :label/plural "Mirrors",
   :ov/markdownDescription
   "Consider a resource at http://flickr/set/image1.jpg - if you make a backup or mirror of this resource at a resolvable location, such as http://mirror/flickr_bkup1.jpg, you can indicate it like this:\n\n&lt;http://mirror/flickr_bkup1.jpg&gt; &lt;o:mirror&gt; &lt;http://flickr/set/image1.jpg&gt;",
   :rdf/type [:rdf/Property :owl/TransitiveProperty],
   :rdfs/comment
   "Indicates a resource that is designed to be a mirror or surrogate of the object resource; a backup copy, should the object resource be lost or unobtainable.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Mirror",
   :rdfs/subPropertyOf :ov/mirror,
   :vs/term_status "unstable",
   :vs/userdocs :ov/mirror.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"13f9dd34-e86a-4fb2-99d4-5ff2f872c1d3\""})

(def mllxMBbjeh
  {:db/ident :ov/mllxMBbjeh,
   :ov/markdownDescription "comment1, ",
   :skos/note "http://open.vocab.org/changes/95b9bacda69d4783469b35f0c01e81ce",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "c344f1e6-4f3e-4ab3-8303-98402cf6ec75"})

(def motVehicleClasses
  "The Vehicle Classes an MOT Test Station is authorised to test, as a comma separated list using Arabic numerals (plus A where appropriate), e.g \"3, 4, 4A, 5\"."
  {:db/ident :ov/motVehicleClasses,
   :dc11/created #inst "2011-07-26T14:39:30.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The Vehicle Classes an MOT Test Station is authorised to test, as a comma separated list using Arabic numerals (plus A where appropriate), e.g \"3, 4, 4A, 5\".",
   :rdfs/domain :ov/MOTTestingStation,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "MOT Vehicle Classes",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :ov/motVehicleClasses,
   :skos/note "http://open.vocab.org/changes/e6e226a36eda1fc4757e0886fe44d923",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/motVehicleClasses"})

(def namedPlace
  "Places named in a text."
  {:db/ident           :ov/namedPlace,
   :label/plural       "Named places",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Places named in a text.",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Named place",
   :rdfs/subPropertyOf [:dcterms/subject :ov/namedPlace],
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/namedPlace.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"2a8698b8-4369-44c6-94b9-a0a31fd80853\""})

(def national-grid-reference
  "A (UK) national grid reference for a given location, using the alphanumeric syntax."
  {:db/ident :ov/national-grid-reference,
   :label/plural "National Grid References",
   :ov/markdownDescription
   "e.g. HU396753.\n\nrdfs:seeAlso <http://en.wikipedia.org/wiki/British_national_grid_reference_system> .",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A (UK) national grid reference for a given location, using the alphanumeric syntax.",
   :rdfs/domain :geo/SpatialThing,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "National Grid Reference",
   :rdfs/subPropertyOf :ov/national-grid-reference,
   :vs/term_status "unstable",
   :vs/userdocs :ov/national-grid-reference.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"ffea01be-32b5-4e1c-bcfe-93e2bac816cb\""})

(def nationalContextMap
  "This property is a relationship between some thing and a map that shows that thing's location at a national scale."
  {:db/ident :ov/nationalContextMap,
   :label/plural "National Context Maps",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This property is a relationship between some thing and a map that shows that thing's location at a national scale.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "National Context Map",
   :rdfs/subPropertyOf :ov/nationalContextMap,
   :vs/term_status "unstable",
   :vs/userdocs :ov/nationalContextMap.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"f99aea55-e85d-4d9e-aadd-be6400b4aeb5\""})

(def near
  "x is 'near' y if they are near to each other in physical space, for a deliberately vague notion of near."
  {:db/ident :ov/near,
   :dc11/created #inst "2010-08-09T14:20:53.000-00:00",
   :rdf/type [:rdf/Property :owl/SymmetricProperty],
   :rdfs/comment
   "x is 'near' y if they are near to each other in physical space, for a deliberately vague notion of near.",
   :rdfs/domain :geo/SpatialThing,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Near",
   :rdfs/range :geo/SpatialThing,
   :rdfs/subPropertyOf :ov/near,
   :skos/note "http://open.vocab.org/changes/0fd4ca150be31d995a437d8c8e59dfd3",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/near"})

(def networkVisibility
  "The desired visibility of a User's social network. Suggested options: \"Just Me\", \"My Network\", \"Everyone\"."
  {:db/ident :ov/networkVisibility,
   :label/plural "Network Visibilities",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The desired visibility of a User's social network. Suggested options: \"Just Me\", \"My Network\", \"Everyone\".",
   :rdfs/domain "http://schemas.talis.com/2005/user/schema#User",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Network Visibility",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/networkVisibility,
   :vs/term_status "unstable",
   :vs/userdocs :ov/networkVisibility.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"ef877b9e-598f-4503-846f-9b061ade7d37\""})

(def noOfReviewsWritten
  "a total count of the number of resources of type <http://purl.org/stuff/rev#Review> that an Agent is known to have created"
  {:db/ident :ov/noOfReviewsWritten,
   :rdf/type [:owl/FunctionalProperty :rdf/Property],
   :rdfs/comment
   "a total count of the number of resources of type <http://purl.org/stuff/rev#Review> that an Agent is known to have created ",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Number of Reviews Written",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/noOfReviewsWritten,
   :vs/term_status "unstable",
   :vs/userdocs :ov/noOfReviewsWritten.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"0f61ce69-5841-4fe4-94fb-d743fa063462\""})

(def numberOfPages
  "The number of pages a resource has"
  {:db/ident           :ov/numberOfPages,
   :label/plural       "Numbers of Pages",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The number of pages a resource has",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Number of Pages",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :ov/numberOfPages,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/numberOfPages.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"3a8091eb-3d1d-495f-80c2-765fb4218564\""})

(def offeredBy
  "Organization who offers the course, e.g. a department, a school, a research institute"
  {:db/ident :ov/offeredBy,
   :dc11/created #inst "2011-06-23T07:43:22.000-00:00",
   :rdf/type
   [:rdf/Property :owl/InverseFunctionalProperty :owl/FunctionalProperty],
   :rdfs/comment
   "Organization who offers the course, e.g. a department, a school, a research institute",
   :rdfs/domain :ov/Course,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Offering organization",
   :rdfs/range :foaf/Organization,
   :rdfs/subPropertyOf :ov/offeredBy,
   :skos/note "http://open.vocab.org/changes/56b1175e1f611d96cd7d2d4de6d9f444",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/offeredBy"})

(def offersCourse
  "Course offered by the organization"
  {:db/ident :ov/offersCourse,
   :dc11/created #inst "2011-06-23T07:45:21.000-00:00",
   :label/plural "Offered courses",
   :owl/inverseOf :ov/offeredBy,
   :rdf/type
   [:owl/FunctionalProperty :rdf/Property :owl/InverseFunctionalProperty],
   :rdfs/comment "Course offered by the organization",
   :rdfs/domain :foaf/Organization,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Offered course",
   :rdfs/range :ov/Course,
   :rdfs/subPropertyOf :ov/offersCourse,
   :skos/note "http://open.vocab.org/changes/ff52567f3bd555da818c3d7c2dfcd62d",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/offersCourse"})

(def okkamID
  "the okkam ID of the entity, given in human legible form (literal)"
  {:db/ident :ov/okkamID,
   :label/plural "Okkam IDs",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "the okkam ID of the entity, given in human legible form (literal)",
   :rdfs/domain :ov/OkkamEntity,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Okkam ID",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/identifier :ov/okkamID],
   :vs/term_status "unstable",
   :vs/userdocs :ov/okkamID.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"192d3251-24d6-4765-93a1-8f9c93a1dccf\""})

(def origin
  "The source of a thing."
  {:db/ident :ov/origin,
   :label/plural "Origins",
   :ov/markdownDescription
   "For example: the Macedonian mint at Acanthus is the origin of the coin described at http://numismatics.org/collection/2008.39.18.",
   :rdf/type :rdf/Property,
   :rdfs/comment "The source of a thing.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Origin",
   :rdfs/subPropertyOf :ov/origin,
   :vs/term_status "unstable",
   :vs/userdocs :ov/origin.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"fdfa050f-e161-49f0-8565-bb7974ff908e\""})

(def originatesFrom
  "A thing that came into existence at a place and time originates from that place and time."
  {:db/ident :ov/originatesFrom,
   :label/plural "Originally from time and place",
   :ov/markdownDescription
   "The inscription described at http://insaph.kcl.ac.uk/iaph2007/iAph120214.html originates from the ancient place known as Aphrodisias.",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A thing that came into existence at a place and time originates from that place and time.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Originally from time and place",
   :rdfs/subPropertyOf :ov/originatesFrom,
   :vs/term_status "unstable",
   :vs/userdocs :ov/originatesFrom.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"f458a16b-81d5-454b-97ac-76e768f5e727\""})

(def part
  "An element of a whole."
  {:db/ident               :ov/part,
   :label/plural           "Parts",
   :ov/markdownDescription "Example: wheel is a part of a car.",
   :rdf/type               :rdf/Property,
   :rdfs/comment           "An element of a whole.",
   :rdfs/isDefinedBy       "http://open.vocab.org/terms",
   :rdfs/label             "Part",
   :rdfs/subPropertyOf     :ov/part,
   :vs/term_status         "unstable",
   :vs/userdocs            :ov/part.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"9e7b32aa-090e-466f-99d2-979d738b5416\""})

(def passwd
  "a password usually stored in md5"
  {:db/ident :ov/passwd,
   :label/plural "Passwords",
   :ov/markdownDescription
   "this is just adding a password property to a user so SIOC can be used to completely specify logins - not sure if this violates a whole lotta best practice etc :P",
   :rdf/type :rdf/Property,
   :rdfs/comment "a password usually stored in md5",
   :rdfs/domain :sioc/User,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Password",
   :rdfs/subPropertyOf :ov/passwd,
   :vs/term_status "unstable",
   :vs/userdocs :ov/passwd.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"3e65757b-cecc-42c7-a45f-51c6c9ac3087\""})

(def performer
  "7dFHvo <a href=\"http://nussehqldled.com/\">nussehqldled</a>, [url=http://uvurwqyxjgik.com/]uvurwqyxjgik[/url], [link=http://yqeuzuciwezi.com/]yqeuzuciwezi[/link], http://sdzwxhzsaaqq.com/"
  {:db/ident :ov/performer,
   :label/plural "Performers",
   :ov/markdownDescription
   "7dFHvo  <a href=\"http://nussehqldled.com/\">nussehqldled</a>, [url=http://uvurwqyxjgik.com/]uvurwqyxjgik[/url], [link=http://yqeuzuciwezi.com/]yqeuzuciwezi[/link], http://sdzwxhzsaaqq.com/",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "7dFHvo  <a href=\"http://nussehqldled.com/\">nussehqldled</a>, [url=http://uvurwqyxjgik.com/]uvurwqyxjgik[/url], [link=http://yqeuzuciwezi.com/]yqeuzuciwezi[/link], http://sdzwxhzsaaqq.com/",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Performer",
   :rdfs/subPropertyOf :ov/performer,
   :vs/term_status "unstable",
   :vs/userdocs :ov/performer.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "092dcc48-9721-454d-834e-e365ced438da"})

(def phoneNumber
  "A telephone number that can be used to contact a Person or Organisation."
  {:db/ident :ov/phoneNumber,
   :dc11/created #inst "2011-05-09T14:40:02.000-00:00",
   :label/plural "Phone Numbers",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A telephone number that can be used to contact a Person or Organisation.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Phone Number",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/phoneNumber,
   :skos/note "http://open.vocab.org/changes/f38c99c873e2c800c79eed29885ad64e",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/phoneNumber"})

(def plot
  "A plot of anything."
  {:db/ident               :ov/plot,
   :label/plural           "Plots",
   :ov/markdownDescription "Example: a film's plot.",
   :rdf/type               :rdf/Property,
   :rdfs/comment           "A plot of anything.",
   :rdfs/isDefinedBy       "http://open.vocab.org/terms",
   :rdfs/label             "Plot",
   :rdfs/subPropertyOf     :ov/plot,
   :vs/term_status         "unstable",
   :vs/userdocs            :ov/plot.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"bd674106-2f64-43d4-a80b-9a1aaac45c3c\""})

(def postalAddress
  "A postal address to which letters and parcels can be sent to a Person or Organisation."
  {:db/ident :ov/postalAddress,
   :dc11/created #inst "2011-05-09T14:56:05.000-00:00",
   :label/plural "Postal Addresses",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A postal address to which letters and parcels can be sent to a Person or Organisation.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Postal Address",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/postalAddress,
   :skos/note "http://open.vocab.org/changes/0a25d0c90e12975a61316ba9e15445e4",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/postalAddress"})

(def prefAcronym
  "Preferred or official acronym as used by the subject."
  {:db/ident           :ov/prefAcronym,
   :label/plural       "preferred acronyms",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Preferred or official acronym as used by the subject.",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "preferred acronym",
   :rdfs/subPropertyOf [:foaf/name :ov/prefAcronym],
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/prefAcronym.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"94a8c193-11e3-4145-9487-e42fa044264a\""})

(def preferredAnimal
  "The preferred animal of a person."
  {:db/ident :ov/preferredAnimal,
   :dc11/created #inst "2011-10-26T16:41:18.000-00:00",
   :label/plural "Preferred animals",
   :rdf/type :rdf/Property,
   :rdfs/comment "The preferred animal of a person.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Preferred animal",
   :rdfs/subPropertyOf :ov/preferredAnimal,
   :skos/note "http://open.vocab.org/changes/25406eb71ea18adc4b423169881a4f17",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/preferredAnimal"})

(def primaryMaterial
  "The primary material from which something is made. Examples: leather (shoe), paper (book), cotton (t-shirt), nylon (tights), plastic (carrier bag), rubber (wellington boots), iron (pipe) etc."
  {:db/ident :ov/primaryMaterial,
   :dc11/created #inst "2011-03-10T17:05:00.000-00:00",
   :label/plural "primary materials",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The primary material from which something is made.\n\nExamples: leather (shoe), paper (book), cotton (t-shirt), nylon (tights), plastic (carrier bag), rubber (wellington boots), iron (pipe) etc.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "primary material",
   :rdfs/subPropertyOf :ov/primaryMaterial,
   :skos/note "http://open.vocab.org/changes/aeb384cca452ad8a95ed05b5f3ca7cea",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/primaryMaterial"})

(def provenance
  "It is about provenance of web data."
  {:db/ident :ov/provenance,
   :dc11/created #inst "2011-09-21T15:47:49.000-00:00",
   :label/plural "provenance",
   :rdf/type [:owl/SymmetricProperty :rdf/Property],
   :rdfs/comment "It is about provenance of web data.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "provenance",
   :rdfs/subPropertyOf :ov/provenance,
   :skos/note "http://open.vocab.org/changes/c5d83def5fafac12b8f9f86d40a61d76",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/provenance"})

(def quote
  {:db/ident :ov/quote,
   :skos/note "http://open.vocab.org/changes/ce062180af1117cca275fa1ba6d02ef8",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "82a64691-67b9-4388-acd7-43b1febb9759"})

(def rank
  "The rank of the resource within the ordered collection represented by the current document"
  {:db/ident :ov/rank,
   :label/plural "ranks",
   :ov/markdownDescription "The first resource has an ov:rank of 1.",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The rank of the resource within the ordered collection represented by the current document",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "rank",
   :rdfs/range :xsd/int,
   :rdfs/subPropertyOf :ov/rank,
   :vs/term_status "unstable",
   :vs/userdocs :ov/rank.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"654d9139-0ddb-4688-9ad3-ae61fbf6880d\""})

(def readGraph
  "express the ability/right to read from a graph"
  {:db/ident           :ov/readGraph,
   :label/plural       "Read Graph",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "express the ability/right to read from a graph",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Read Graph",
   :rdfs/subPropertyOf :ov/readGraph,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/readGraph.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"286bc858-e567-4471-9c6f-376728559aab\""})

(def recordedAddress
  "A property to capture an un-intepreted written address, notably for addresses that have yet to be or can never be semantically represented using an existing scheme, such as the vcard ontology."
  {:db/ident :ov/recordedAddress,
   :dc11/created #inst "2010-09-30T23:51:51.000-00:00",
   :label/plural "recorded addresses",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A property to capture an un-intepreted written address, notably for addresses that have yet to be or can never be semantically represented using an existing scheme, such as the vcard ontology.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "recorded address",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/recordedAddress,
   :skos/note "http://open.vocab.org/changes/95f02f437c4bc0b5c8e80fd639b7194d",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/recordedAddress"})

(def regionalContextMap
  "This property is a relationship between some thing and a map that shows that thing's location at a regional scale."
  {:db/ident :ov/regionalContextMap,
   :label/plural "Regional Context Maps",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This property is a relationship between some thing and a map that shows that thing's location at a regional scale.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Regional Context Map",
   :rdfs/subPropertyOf :ov/regionalContextMap,
   :vs/term_status "unstable",
   :vs/userdocs :ov/regionalContextMap.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"0207514f-eb63-4a0b-882b-6491576f8925\""})

(def reincarnationOf
  "Defines reincarnation of someone"
  {:db/ident :ov/reincarnationOf,
   :dc11/created #inst "2011-03-22T21:36:14.000-00:00",
   :label/plural "Reincarnations of an Individual",
   :rdf/type :rdf/Property,
   :rdfs/comment "Defines reincarnation of someone",
   :rdfs/domain "http://purl.org/vocab/relationship/",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Reincarnation of an Individual",
   :rdfs/subPropertyOf :ov/reincarnationOf,
   :skos/note "http://open.vocab.org/changes/029db5b302a489c9474f2f3e6c1f5f25",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/reincarnationOf"})

(def responsiblityOf
  "Organization who is responsible for (offers) the course. Like a department, a school..."
  {:db/ident :ov/responsiblityOf,
   :dc11/created #inst "2011-06-23T07:39:37.000-00:00",
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   "Organization who is responsible for (offers) the course. Like a department, a school...",
   :rdfs/domain :ov/Course,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Responsible organization",
   :rdfs/range :foaf/Organization,
   :rdfs/subPropertyOf :ov/responsiblityOf,
   :skos/note
   ["http://open.vocab.org/changes/b432cd78e9f49c85c500b621fff32257"
    "http://open.vocab.org/changes/6989815371f718d270c6e8f937057509"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/responsiblityOf"})

(def resultFrom
  "The result of the test case obtained from the target specified. For example, the target could be a script that is executed."
  {:db/ident :ov/resultFrom,
   :dc11/created #inst "2010-07-03T09:13:15.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The result of the test case obtained from the target specified. For example, the target could be a script that is executed.",
   :rdfs/domain "http://www.w3.org/2006/03/test-description#TestCase",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "result from",
   :rdfs/subPropertyOf :ov/resultFrom,
   :skos/note "http://open.vocab.org/changes/f4577e13c365ef3467af73a58351b6bf",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/resultFrom"})

(def rimDiameter
  "The diameter of a thing measured at its rim."
  {:db/ident :ov/rimDiameter,
   :ov/markdownDescription
   "Indicates that a property is the measurement of the diameter of a rim.",
   :rdf/type :rdf/Property,
   :rdfs/comment "The diameter of a thing measured at its rim.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Diameter at rim",
   :rdfs/subPropertyOf :ov/rimDiameter,
   :vs/term_status "unstable",
   :vs/userdocs :ov/rimDiameter.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"10f94170-61b1-4482-8ad6-125705b3b490\""})

(def rtfm
  {:db/ident :ov/rtfm,
   :ov/markdownDescription
   "YsDG2v  <a href=\"http://gvjhbhoshjgl.com/\">gvjhbhoshjgl</a>, [url=http://beckgvwlfjld.com/]beckgvwlfjld[/url], [link=http://qmbppmhjmsja.com/]qmbppmhjmsja[/link], http://gqytiapadhjt.com/",
   :skos/note "http://open.vocab.org/changes/123ba94afafcc0d3787d8c736f412ed4",
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "17819391-23e9-4de4-8e43-47c1514db8bd"})

(def screenshot
  "A screenshot showing the (software) project in action. Since DOAP only has a property to link a \"web page with screenshots of project\", not a specific screenshot, this property is sometimes more useful."
  {:db/ident :ov/screenshot,
   :label/plural "screenshots",
   :owl/inverseOf :foaf/depicts,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A screenshot showing the (software) project in action. Since DOAP only has a property to link a \"web page with screenshots of project\", not a specific screenshot, this property is sometimes more useful.",
   :rdfs/domain :foaf/Project,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "screenshot",
   :rdfs/range :foaf/Image,
   :rdfs/subPropertyOf [:foaf/depiction :ov/screenshot],
   :skos/note
   ["http://open.vocab.org/changes/ac977ae6ec5671995b49d1095a99e668"
    "http://open.vocab.org/changes/123cb355920c774922541cc846ee04b2"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "8d11d38d-217b-4c9f-bab0-de0af3c3a269"})

(def semester
  "Semester in which the course is offered"
  {:db/ident :ov/semester,
   :dc11/created #inst "2011-06-23T09:56:11.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment "Semester in which the course is offered",
   :rdfs/domain :ov/Course,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Semester",
   :rdfs/subPropertyOf :ov/semester,
   :skos/note "http://open.vocab.org/changes/a7a139149a01d64d8fd2e3c4b9bff9a3",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/semester"})

(def shape
  "The shape of something"
  {:db/ident           :ov/shape,
   :label/plural       "Shapes",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The shape of something",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Shape",
   :rdfs/subPropertyOf :ov/shape,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/shape.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"c3070d4a-3b2c-4fbf-af84-54446f760470\""})

(def shortName
  "Just a simple readable name, a mnemonic."
  {:db/ident           :ov/shortName,
   :label/plural       "Short Names",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Just a simple readable name, a mnemonic. ",
   :rdfs/domain        :ov/DigitalAsset,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Short Name",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :ov/shortName,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/shortName.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"fea8a476-61dd-41d4-a80f-afb8aab80658\""})

(def signatureScent
  "Relate a thing (usually a person) to the scent with which they are most commonly associated."
  {:db/ident :ov/signatureScent,
   :dc11/created #inst "2011-01-14T15:36:51.000-00:00",
   :label/plural "Signature Scents",
   :rdf/type [:rdf/Property :owl/FunctionalProperty],
   :rdfs/comment
   "Relate a thing (usually a person) to the scent with which they are most commonly associated.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Signature Scent",
   :rdfs/subPropertyOf :ov/signatureScent,
   :skos/note "http://open.vocab.org/changes/340850939b103112e44e5c339423bd15",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/signatureScent"})

(def similarTo
  "Having two things that are not the owl:sameAs but are similar to a certain extent. It is thought of being used where owl:sameAs is too strong but rdfs:seeAlso is too loose. Motivation: http://lists.w3.org/Archives/Public/public-lod/2009Feb/0189.html"
  {:db/ident :ov/similarTo,
   :rdf/type [:rdf/Property :owl/TransitiveProperty :owl/SymmetricProperty],
   :rdfs/comment
   "Having two things that are not the owl:sameAs but are similar to a certain extent. It is thought of being used where owl:sameAs is too strong but rdfs:seeAlso is too loose. Motivation: http://lists.w3.org/Archives/Public/public-lod/2009Feb/0189.html",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "similar to",
   :rdfs/range :owl/Thing,
   :rdfs/subPropertyOf :ov/similarTo,
   :skos/note
   ["http://open.vocab.org/changes/c63961b7972a1d52e563cb1a8d4536ee"
    "http://open.vocab.org/changes/1e0717f3c6dcf23f0aff8b2f82a22afb"],
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "bc9f8c5f-96b2-4812-a1eb-e2aafe15525d"})

(def sindiceResultCount
  "The number of results retrieved for a search on that uri from the Search Engine sindice"
  {:db/ident :ov/sindiceResultCount,
   :label/plural "Sindice Result Counts",
   :rdf/type [:owl/FunctionalProperty :rdf/Property],
   :rdfs/comment
   "The number of results retrieved for a search on that uri from the Search Engine sindice",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Sindice Result Count",
   :rdfs/subPropertyOf :ov/sindiceResultCount,
   :vs/term_status "unstable",
   :vs/userdocs :ov/sindiceResultCount.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"89321468-019a-42b2-88ff-e90d52001ecf\""})

(def skypeID
  "Someone's ID in the Skype chat and telephony service."
  {:db/ident           :ov/skypeID,
   :label/plural       "Skype IDs",
   :rdf/type           [:rdf/Property :owl/InverseFunctionalProperty],
   :rdfs/comment       "Someone's ID in the Skype chat and telephony service.",
   :rdfs/domain        :foaf/Person,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Skype ID",
   :rdfs/subPropertyOf :ov/skypeID,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/skypeID.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"2c9baf94-f6ec-45d3-a97d-2f2ed36b4d47\""})

(def sort-name
  "Associate a name that can be used for sorting to a foaf:Agent"
  {:db/ident :ov/sort-name,
   :label/plural "Sort names",
   :ov/markdownDescription "Isn't this the same thing as sortLabel?",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Associate a name that can be used for sorting to a foaf:Agent",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Sort name",
   :rdfs/subPropertyOf :ov/sort-name,
   :vs/term_status "unstable",
   :vs/userdocs :ov/sort-name.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"dbdb6bb8-f865-42d5-858c-787e94137cc2\""})

(def sortLabel
  "A label for a resource that is syntactically arranged to be suitable for sorting"
  {:db/ident :ov/sortLabel,
   :label/plural "Sort Labels",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A label for a resource that is syntactically arranged to be suitable for sorting",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Sort Label",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/sortLabel,
   :vs/term_status "unstable",
   :vs/userdocs :ov/sortLabel.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"32eeb99b-1398-41ea-af96-d212e85dc1e3\""})

(def sourcefile
  "associates a given feature file document with the audio file that is described by that document"
  {:db/ident :ov/sourcefile,
   :label/plural "Source Files",
   :owl/inverseOf :ov/featurefile,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "associates a given feature file document with the audio file that is described by that document",
   :rdfs/domain :foaf/Document,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Source File",
   :rdfs/range ["http://purl.org/ontology/mo/Track"
                "http://purl.org/ontology/mo/Signal"],
   :rdfs/subPropertyOf :ov/sourcefile,
   :vs/term_status "unstable",
   :vs/userdocs :ov/sourcefile.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"f8f8af21-127d-4a4a-93ec-2628a215fb3b\""})

(def specification
  "The specification(s) that the resource implemented."
  {:db/ident :ov/specification,
   :label/plural "Specifications",
   :ov/markdownDescription
   "a foaf Personal Profile Document could use this property to link to the foaf specification. a voiD Document could point to the void guide. ",
   :rdf/type :rdf/Property,
   :rdfs/comment "The specification(s) that the resource implemented. ",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Specification",
   :rdfs/subPropertyOf [:rdfs/seeAlso :ov/specification],
   :vs/term_status "unstable",
   :vs/userdocs :ov/specification.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"665d3614-3642-4c39-9aa6-79025e52593e\""})

(def startTime
  "The time of day that something starts at."
  {:db/ident           :ov/startTime,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The time of day that something starts at.",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Start Time",
   :rdfs/subPropertyOf :ov/startTime,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/startTime.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"ed5a1325-8187-45d1-806c-84041c640dd4\""})

(def statement
  "Asserts that a reified rdf:Statement is asserted (in a non-reified form) by a particular RDF graph."
  {:db/ident :ov/statement,
   :label/plural "statements",
   :ov/markdownDescription
   "Note that http://www.w3.org/2000/10/swap/log#Formula is not equivalent to an RDF/XML, Turtle, etc document. Instead, there is a log:semantics relationship between the two.",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Asserts that a reified rdf:Statement is asserted (in a non-reified form) by a particular RDF graph.",
   :rdfs/domain :rdfg/Graph,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "statement",
   :rdfs/range :rdf/Statement,
   :rdfs/subPropertyOf :ov/statement,
   :vs/term_status "unstable",
   :vs/userdocs :ov/statement.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"d4fff330-663b-47e8-a0b5-445d1a2558d8\""})

(def status
  "A human readable description of the status of an opmv:Process upon completion."
  {:db/ident :ov/status,
   :dc11/created #inst "2011-11-15T16:43:35.000-00:00",
   :label/plural "Status",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A human readable description of the status of an opmv:Process upon completion.",
   :rdfs/domain "http://purl.org/net/opmv/ns#Process",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Status",
   :rdfs/subPropertyOf [:rdfs/comment :ov/status],
   :skos/note "http://open.vocab.org/changes/921b7c2fe4ddb4fda3eae005329018d1",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/status"})

(def stickiness
  "The the measure of how sticky something is"
  {:db/ident           :ov/stickiness,
   :label/plural       "Stickiness",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The the measure of how sticky something is",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Stickiness",
   :rdfs/subPropertyOf :ov/stickiness,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/stickiness.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"4162307a-3a97-4e5e-82c1-dc28da32b515\""})

(def studies
  "A topic or work that is studied by a person or group (e.g., a university course)"
  {:db/ident :ov/studies,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A topic or work that is studied by a person or group (e.g., a university course)",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "studies",
   :rdfs/subPropertyOf :ov/studies,
   :vs/term_status "unstable",
   :vs/userdocs :ov/studies.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"cd417984-645d-4269-ad0b-96eaaf088d71\""})

(def subtitle
  "An additional or secondary title usually used expand or limit the main title"
  {:db/ident :ov/subtitle,
   :label/plural "Subtitles",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An additional or secondary title usually used expand or limit the main title",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Subtitle",
   :rdfs/subPropertyOf :ov/subtitle,
   :vs/term_status "unstable",
   :vs/userdocs :ov/subtitle.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"0792f83f-5f04-472d-8af5-4d3463e43296\""})

(def suffersEarworm
  "Relates a person to an earworm that they suffer."
  {:db/ident :ov/suffersEarworm,
   :label/plural "Suffers Earworm",
   :ov/markdownDescription
   "OPmgaB  <a href=\"http://rzhwdczsolbm.com/\">rzhwdczsolbm</a>, [url=http://vzwzwxpxvscp.com/]vzwzwxpxvscp[/url], [link=http://heqqpioawnyl.com/]heqqpioawnyl[/link], http://otywxgzucbbi.com/",
   :rdf/type :rdf/Property,
   :rdfs/comment "Relates a person to an earworm that they suffer.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Suffers Earworm",
   :rdfs/subPropertyOf :ov/suffersEarworm,
   :skos/note "http://open.vocab.org/changes/2c93baecce25b6ed59c644f43fcad1b0",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "2e4b1f01-6923-4773-a03e-ba4f161ad91b"})

(def syndicates
  "An agent syndicates a document some way."
  {:db/ident :ov/syndicates,
   :dc11/created #inst "2011-03-16T22:53:07.000-00:00",
   :label/plural "syndicate",
   :rdf/type :rdf/Property,
   :rdfs/comment "An agent syndicates a document some way.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "syndicates",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :ov/syndicates,
   :skos/note "http://open.vocab.org/changes/b7964aacde533dd31b0beda0b671c897",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/syndicates"})

(def taggingCount
  "the number of times a tag has been used in taggings of things"
  {:db/ident :ov/taggingCount,
   :label/plural "Tagging Counts",
   :rdf/type [:rdf/Property :owl/FunctionalProperty],
   :rdfs/comment
   "the number of times a tag has been used in taggings of things",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Tagging Count",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/taggingCount,
   :vs/term_status "unstable",
   :vs/userdocs :ov/taggingCount.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"7139ef2e-4956-480b-8506-59ae4f7b1dab\""})

(def teaches
  "Teaches"
  {:db/ident           :ov/teaches,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :foaf/Person,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Teaches",
   :rdfs/range         :ov/Course,
   :rdfs/subPropertyOf [:dcterms/relation :ov/teaches],
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/teaches.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"52cd80c3-44c2-47d3-9744-6d0ffb813ed1\""})

(def test
  {:db/ident :ov/test,
   :ov/markdownDescription
   "vAa153  <a href=\"http://ldbpfqlmutno.com/\">ldbpfqlmutno</a>, [url=http://jddqdntnurbg.com/]jddqdntnurbg[/url], [link=http://dsahozaszvuw.com/]dsahozaszvuw[/link], http://mlqcyawvwhxh.com/",
   :skos/note
   ["http://open.vocab.org/changes/b4548e14391b8bcb70514a564dca20d0"
    "http://open.vocab.org/changes/7bb239e545610da777c2c828e6dd8632"],
   :vs/term_status "deprecated",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "300c5a5e-cfda-4741-a16b-214f07e687a5"})

(def twitter-id
  "Twitter ID"
  {:db/ident           :ov/twitter-id,
   :label/plural       "Twitter IDs",
   :rdf/type           [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Twitter ID",
   :rdfs/subPropertyOf :ov/twitter-id,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/twitter-id.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"dfa592b1-730b-41a8-bd1d-00301ca33b8f\""})

(def usedHost
  "An Internet host used in the context of an opmv:Process."
  {:db/ident :ov/usedHost,
   :dc11/created #inst "2011-11-15T16:56:41.000-00:00",
   :label/plural "Used Hosts",
   :rdf/type :rdf/Property,
   :rdfs/comment "An Internet host used in the context of an opmv:Process.",
   :rdfs/domain "http://purl.org/net/opmv/ns#Process",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Used Host",
   :rdfs/range "http://river.styx.org/network#Host",
   :rdfs/subPropertyOf ["http://purl.org/net/opmv/ns#used" :ov/usedHost],
   :skos/note "http://open.vocab.org/changes/6b1685ac439099f5c7d7f6fdef6e0581",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/usedHost"})

(def usedHttpHeader
  "The subject (perhaps a foaf:Agent) made HTTP requests with a header described by this http:MessageHeader resource."
  {:db/ident :ov/usedHttpHeader,
   :dc11/created #inst "2010-06-29T06:26:42.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The subject (perhaps a foaf:Agent) made HTTP requests with a header described by this http:MessageHeader resource.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Used HTTP Header",
   :rdfs/range "http://www.w3.org/2006/http#MessageHeader",
   :rdfs/subPropertyOf :ov/usedHttpHeader,
   :skos/note "http://open.vocab.org/changes/271795ffc97054ff5dfb4a1671a8f8b2",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/usedHttpHeader"})

(def uses
  "links to a thing used by an agent"
  {:db/ident           :ov/uses,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "links to a thing used by an agent",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "uses",
   :rdfs/subPropertyOf :ov/uses,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/uses.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"035ceecf-9ac7-489f-b9e9-9a7e3f720c53\""})

(def validFrom
  "To mark the beginning date or event at which the named graph object is true/accurate."
  {:db/ident :ov/validFrom,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "To mark the beginning date or event at which the named graph object is true/accurate.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "is valid from",
   :rdfs/subPropertyOf :ov/validFrom,
   :vs/term_status "unstable",
   :vs/userdocs :ov/validFrom.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"5df13ac3-9283-48a6-be44-caed596ec11f\""})

(def validUntil
  "To mark the date or event at which the named graph object ceases to be accurate."
  {:db/ident :ov/validUntil,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "To mark the date or event at which the named graph object ceases to be accurate.",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "is valid until",
   :rdfs/subPropertyOf :ov/validUntil,
   :vs/term_status "unstable",
   :vs/userdocs :ov/validUntil.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"e8c8fe7b-c19c-4b12-80a6-15431e9d7692\""})

(def versionnumber
  "Property to encode the version of things - simple intent, to record the sequence of items. (The items themselves will have temporal/finer grained detail)"
  {:db/ident :ov/versionnumber,
   :label/plural "Version Numbers",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Property to encode the version of things - simple intent, to record the sequence of items. (The items themselves will have temporal/finer grained detail)",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Version Number",
   :rdfs/subPropertyOf :ov/versionnumber,
   :vs/term_status "unstable",
   :vs/userdocs :ov/versionnumber.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"86041105-91c5-4924-9886-f8b2cf4b4b90\""})

(def visibility
  "The visibility of a resource (e.g. public, internal), expressed as a literal term."
  {:db/ident :ov/visibility,
   :dc11/created #inst "2011-03-10T15:28:23.000-00:00",
   :label/plural "visibilities",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The visibility of a resource (e.g. public, internal), expressed as a literal term.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "visibility",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :ov/visibility,
   :skos/note "http://open.vocab.org/changes/2a5e68d84f13c974b81c488200e99849",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/visibility"})

(def weight
  "The weight of a resource"
  {:db/ident           :ov/weight,
   :label/plural       "Weight",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The weight of a resource",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Weight",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :ov/weight,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/weight.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"a49c5649-4162-4fb0-b241-6bb3593d3d65\""})

(def wikiPage
  "A wiki page associated with this resource"
  {:db/ident :ov/wikiPage,
   :label/plural "Wiki Pages",
   :rdf/type :rdf/Property,
   :rdfs/comment "A wiki page associated with this resource",
   :rdfs/isDefinedBy "http://open.vocab.org/terms",
   :rdfs/label "Wiki Page",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf [:foaf/page :ov/wikiPage],
   :skos/note "http://open.vocab.org/changes/cc69621e33ba54364d28bd5c1884ae57",
   :vs/term_status "unstable",
   :vs/userdocs "http://open.vocab.org/docs/",
   "http://schemas.talis.com/2005/dir/schema#etag"
   "1ed02cd7-c488-4380-b897-224749fb3b59"})

(def writeGraph
  "express the ability/right to write to a graph"
  {:db/ident           :ov/writeGraph,
   :label/plural       "Write Graph",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "express the ability/right to write to a graph",
   :rdfs/isDefinedBy   "http://open.vocab.org/terms",
   :rdfs/label         "Write Graph",
   :rdfs/subPropertyOf :ov/writeGraph,
   :vs/term_status     "unstable",
   :vs/userdocs        :ov/writeGraph.html,
   "http://schemas.talis.com/2005/dir/schema#etag"
   "\"6168f084-4cfc-4626-8d9d-0255d0e0bfdd\""})

(def ^{:private true} identifier
  {:db/ident :bibo/identifier,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :bibo/identifier})

(def ^{:private true} Event
  {:db/ident        :event/Event,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :event/Event})

(def ^{:private true} Document
  {:db/ident        :foaf/Document,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :foaf/Document})

(def ^{:private true} Person
  {:db/ident        :foaf/Person,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :foaf/Person})

(def ^{:private true} depiction
  {:db/ident :foaf/depiction,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :foaf/depiction})

(def ^{:private true} name
  {:db/ident :foaf/name,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :foaf/name})

(def ^{:private true} page
  {:db/ident :foaf/page,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :foaf/page})

(def ^{:private true} SpatialThing
  {:db/ident        :geo/SpatialThing,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :geo/SpatialThing})

(def ^{:private true} Item
  {:db/ident        :sioc/Item,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :sioc/Item})

(def ^{:private true} Dataset
  {:db/ident        :void/Dataset,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :void/Dataset})