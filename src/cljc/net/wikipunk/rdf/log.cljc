(ns net.wikipunk.rdf.log
  {:dcat/downloadURL "net/wikipunk/ext/log.n3",
   :namespaces       {"doc"  "http://www.w3.org/2000/10/swap/pim/doc#",
                      "log"  "http://www.w3.org/2000/10/swap/log#",
                      "n3"   "http://www.w3.org/2004/06/rei#",
                      "owl"  "http://www.w3.org/2002/07/owl#",
                      "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                      "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                      "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type         :owl/Ontology,
   :rdfa/prefix      "log",
   :rdfa/uri         "http://www.w3.org/2000/10/swap/log#"})

(def Chaff
  {:db/ident :log/Chaff,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Any statement mentioning anything in this class\nis considered boring and purged by the cwm --purge option.\nThis is a convenience, and does not have any value when published as a\ngeneral fact on the web."})

(def Formula
  {:db/ident :log/Formula,
   :rdf/type :rdfs/Class})

(def List
  {:db/ident :log/List,
   :rdf/type :rdfs/Class})

(def N3Document
  {:db/ident :log/N3Document,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A document which, which parsed as Notation3\nas defined in general by http://www.w3.org/DesignIssues/Notation3.html\nand this schema, conveys the intent of the author by the semantics defined\non those specifications, and the semantics defined by the specifications\nof any other identifiers used in the document.\n"})

(def Other
  {:db/ident :log/Other,
   :rdf/type :rdfs/Class})

(def Truth
  {:db/ident :log/Truth,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Something which is true: believe it as you would believe this.\n    \n\tUnderstood natively by cwm in that it will execute rules in a formula\n\tdeclared a Truth within a formula it is already taking rules from."})

(def conclusion
  {:db/ident :log/conclusion,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "All possible conclusions which can be drawn from a formula.\n\nThe object of this function, a formula, is the set of conclusions which can be\ndrawn from the subject formula, by successively applying any\nrules it contains to the data it contains. This is equivalent to\ncwm's \"--think\" command line function.  It does use built-ins, so\nit may for example indirectly invoke other documents, validate\nsignatures, etc.\n",
   :rdfs/domain :log/Formula,
   :rdfs/label "conclusion",
   :rdfs/range :log/Formula})

(def conjunction
  {:db/ident :log/conjunction,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "\"A function to merge formulae: logical AND.\n\nThe subject is a list of formulae.\nThe object, which can be generated, is a formula containing a copy\nof each of the formulae in the list on the left.\nA cwm built-in function.\n",
   :rdfs/domain :log/List,
   :rdfs/label "conjunction",
   :rdfs/range :log/Formula})

(def content
  {:db/ident :log/content,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This connects a document and a string that represents it.\n(Cwm knows how to go get a document in order to evaluate this.)\nNote that the content-type of the information is not given and\nso must be known or guessed.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "content",
   :rdfs/range :xsd/string})

(def definitiveDocument
  {:db/ident :log/definitiveDocument,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "\tWhen document D is the definitiveDocument for property P,\nany statement X P Y is true iff and only if the semantics of document D\ninclude that statement.\n\nFor example, there may be a definitive document for the zipcode of\nairports by airport code, and so on. This is useful to let a reasoner\nknow that it can extend its query to the given document.\n(Cwm will do this if its mode includes \"r\").\n",
   :rdfs/domain :rdf/Property,
   :rdfs/label "definitive document",
   :rdfs/range :rdfs/Resource})

(def definitiveService
  {:db/ident :log/definitiveService,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "\tWhen service S is the definitiveService for property P,\nany statement X P Y is true iff and only if a query to S returns\nthat it is.  The protocol for the service S depends on the scheme.\nFor mysql protocol, the URI of the service is like\nsql://user:password@host.domain/database/.\n\nFor example, there may be a definitive service for the zipcode of\nairports by airport code, and so on. This is useful to let a reasoner\nknow that it can help resolve a query by delegating it to the service\nin question.\n(Cwm will do this if its mode includes \"r\").\n",
   :rdfs/domain :rdf/Property,
   :rdfs/label "definitive service"})

(def dtlit
  {:db/ident :log/dtlit,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Takes a list of a string and a URI and creates a datatyped\n     literal. For example, { (\"2005-03-30T11:00:00\" :tz) log:dtlit ?X } => { ?X a :Answer } .\n    will produce \"2005-03-30T11:00:00\"^^:tz a :Answer ."})

(def equalTo
  {:db/ident :log/equalTo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "True if the subject and object are the same RDF node (symbol or literal).\nDo not confuse with owl:sameAs.\nA cwm built-in logical operator, RDF graph level.\n"})

(def impliedBy
  {:db/ident :log/impliedBy,
   :owl/inverseOf :log/implies,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The <= predicate, which is syntactic sugar for log:impliedBy, indicates a backward chaining mode. ",
   :rdfs/label "<="})

(def implies
  {:db/ident :log/implies,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Logical implication. \nThis is the relation between the antecedent (subject) and\nconclusion (object) of a rule.\nThe application of a rule to a knowledge-base is as follows.\nFor every substitution which, applied to the antecedent,\ngives a formula which is a subset of the knowledge-base,\nthen the result of applying that same substitution to the\nconclusion may be added to the knowledge-base.\n\nrelated: See log:conclusion. \n(See the CWM manual for command line options to determine how\nrules from different sources are applied to and the results\nadded to various formula.)\n",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/10/swap/log#"},
   :rdfs/label "=>",
   :rdfs/range :log/Formula})

(def includes
  {:db/ident :log/includes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The subject formula includes the object formula.\nFormula A includes formula B if there exists some substitution\nwhich when applied to B creates a formula B' such that for\nevery statement in B' is also in A, every variable\nuniversally (or existentially) quantified in B' is quantified in\nthe same way in A. \n\nVariable substitution is applied recursively to nested compound terms such as\nformulae, lists and sets.\n\n(Understood natively by cwm when in in the antecedent of a rule.\nYou can use this to peer inside nested formulae.)",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/10/swap/log#"},
   :rdfs/range :log/Formula})

(def n3String
  {:db/ident     :log/n3String,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The subject formula, expressed as N3, gives this string.",
   :rdfs/domain  :log/Formula,
   :rdfs/label   "n3 string",
   :rdfs/range   :xsd/string})

(def notEqualTo
  {:db/ident :log/notEqualTo,
   :owl/inverseOf :log/equalTo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Equality in this sense is actually the same URI.\nA cwm built-in logical operator.\n"})

(def notIncludes
  {:db/ident :log/notIncludes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The object formula is NOT a subset of subject.\n    True iff log:includes is false.\n    The converse of log:includes. (Understood natively by cwm.\n    The subject formula may contain variables.\n    (In cwm, variables must of course end up getting bound\n    before the log:include test can be done, or an infinite result set\n    would result)\n    Related: See includes",
   :rdfs/domain :log/Formula,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2000/10/swap/log#"},
   :rdfs/range :log/Formula})

(def outputString
  {:db/ident :log/outputString,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The subject is a key and the object is a string,\nwhere the strings are to be output in the order of the keys.\nSee cwm --strings in cwm --help.\n",
   :rdfs/label "output string"})

(def parsedAsN3
  {:db/ident     :log/parsedAsN3,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The subject string, parsed as N3, gives this formula.",
   :rdfs/domain  :xsd/string,
   :rdfs/label   "parses to",
   :rdfs/range   :log/Formula})

(def racine
  {:db/ident :log/racine,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "For anything identified by a URI with a fragid, this is the\nthing identified by the same URI without a hash or fragid.\nFor anything else, it is itself."})

(def rawType
  {:db/ident :log/rawType,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "\nThis is a low-level language type, one of log:Formula, log:Literal, \nlog:List, log:Set or log:Other. \nExample: log:semanticsOrError returns either a formula or a string,\nand you can check which using log:rawType.\n"})

(def rawUri
  {:db/ident :log/rawUri,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This allows one to look at the actual string of the URI which identifies this,\nfor anything, even a blank node or a formula. This peeks into the internal\nworkings of cwm, and so is not normally used. Use log:uri instead.\n",
   :rdfs/range :xsd/string})

(def semantics
  {:db/ident :log/semantics,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The log:semantics of a document is the formula.\nachieved by parsing representation of the document.\n For a document in Notation3, log:semantics is the\nlog:parsedAsN3 of the log:contents of the document.\nFor a document in RDF/XML, it is parsed according to the\nRDF/XML specification to yield an RDF formula\n(a subclass of N3 log:Formula).\n\n[Aside: Philosophers will be distracted here into worrying about the meaning\nof meaning. At least we didn't call this function \"meaning\"!\nIn as much as N3 is used as an interlingua for interoperability\nfor different systems, this for an N3 based system is the meaning \nexpressed by a document.]\n\n(Cwm knows how to go get a document and parse N3 and RDF/XML\nit in order to evaluate this.\nOther languages for web documents \nmay be defined whose N3 semantics are therefore\nalso calculable, and so they could be added in due course.\nSee for example GRDDL, RDFa, etc)",
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "semantics",
   :rdfs/range :log/Formula})

(def semanticsOrError
  {:db/ident :log/semanticsOrError,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This connects a document and either the formula it parses to,\nor an error message explaining what went wrong with trying. See log:semantics.\n(Cwm knows how to go get a document and parse it in order to evaluate this.)\n",
   :rdfs/domain :rdfs/Resource,
   :rdfs/label "semantics or error message"})

(def uri
  {:db/ident :log/uri,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This allows one to look at the actual string of the URI which identifies this.\n\n(Cwm can get the URI of a resource or get the resource from the URI.)\nThis is a level breaker, breaking the rule of not looking inside a\nURI.   Use (eg with  string:match) to replace RDF's old \"aboutEach\"\nfunctionality. Use to implement the URI spec and protocol specs, etc.\n",
   :rdfs/range :xsd/string})