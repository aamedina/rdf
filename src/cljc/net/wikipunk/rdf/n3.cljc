(ns net.wikipunk.rdf.n3
  {:dcat/downloadURL "net/wikipunk/ext/n3.ttl",
   :namespaces       {"n3"   "http://www.w3.org/2004/06/rei#",
                      "owl"  "http://www.w3.org/2002/07/owl#",
                      "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                      "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                      "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type         :owl/Ontology,
   :rdfa/prefix      "n3",
   :rdfa/uri         "http://www.w3.org/2004/06/rei#",
   :rdfs/seeAlso     {:xsd/anyURI "https://www.w3.org/DesignIssues/Reify.html"},
   :xsd/anyURI       "http://www.w3.org/2004/06/rei#"})

(def BNode
  {:db/ident        :n3/BNode,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "blank node",
   :rdfs/subClassOf :n3/Term})

(def Formula
  {:db/ident :n3/Formula,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A formula is identified by an unordered set of statements,\n\twith a sets of existentially and universally quantified symbols.\n\tFor example, \n\t\t[ :forAll  ( [:uri \"ex:#x\"] [:uri \"ex:#y\"]);\n\t\t  :forSome ( [:uri \"ex:#a\"] [:uri \"ex:#b\"]);\n\t\t  :statements ( :s1 :s2 :s3 )\n\t\t]\n\tis equivalent to e.g. in loose math\n\t\tforall x,y,x there exists a,b,c such that s1 and s2 and s3\n\tThat is, the universals are always outside the existentials.\n\tTwo formulae are the equal if the contents\n\tof their forAll, forSome, and statements lists are the same\n\tirrespective of order.\n\tTwo formulae are equivalent if there is a 1:1 mapping between\n\tvariable names of one and variable names in the other\n\twhich used as subsitution bindings on one gives a formula\n\tequal to the other.\n\t",
   :rdfs/label "Formula",
   :rdfs/subClassOf :n3/Term})

(def Literal
  {:db/ident :n3/Literal,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Literals are identified by their string value, their\n\tdatatype (or absence thereof) and their language code\n\t(or absencethereof). As we are modeling RDF in RDF,\n\twe can just use a literal the value of a literal.\n\t",
   :rdfs/label "Literal",
   :rdfs/subClassOf :n3/RDFTerm})

(def RDFGraph
  {:db/ident :n3/RDFGraph,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A formula which meets the constraints of being\n\tan RDF Graph as per the RDF spec. No universally qualified variables,\n\tno nested formulae, no literals as subject, etc.",
   :rdfs/label "RDF Graph",
   :rdfs/subClassOf :n3/Formula})

(def RDFTerm
  {:db/ident        :n3/RDFTerm,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :n3/Term})

(def Statement
  {:db/ident :n3/Statement,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A statement is the unit of information.\n\tIt expresses a binary relation.\n\tIts significance is determined by the relation,\n\tgenerally referred to as its predicate.\n\t",
   :rdfs/label "Statement"})

(def Symbol
  {:db/ident        :n3/Symbol,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "RDF symbol; identified by a URI.",
   :rdfs/label      "Symbol",
   :rdfs/subClassOf :n3/RDFTerm})

(def Term
  {:db/ident   :n3/Term,
   :rdf/type   :rdfs/Class,
   :rdfs/label "term"})

(def existentials
  {:db/ident     :n3/existentials,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The set of existentially quantified symbols.",
   :rdfs/domain  :n3/Formula,
   :rdfs/label   "for all",
   :rdfs/range   :rdfs/Class})

(def objURI
  {:db/ident     :n3/objURI,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "Shorthand for object!uri",
   :rdfs/domain  :n3/Statement,
   :rdfs/label   "object URI",
   :rdfs/range   :xsd/string})

(def objValue
  {:db/ident     :n3/objValue,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "Shorthand for object!Literal",
   :rdfs/domain  :n3/Statement,
   :rdfs/label   "object value",
   :rdfs/range   :xsd/string})

(def object
  {:db/ident    :n3/object,
   :rdf/type    #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/domain :n3/Statement,
   :rdfs/label  "object",
   :rdfs/range  :n3/Term})

(def predURI
  {:db/ident     :n3/predURI,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "Shorthand for predicate!uri",
   :rdfs/domain  :n3/Statement,
   :rdfs/label   "predicate URI",
   :rdfs/range   :xsd/string})

(def predValue
  {:db/ident     :n3/predValue,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "Shorthand for predicate!Literal. Not RDF 1.0.",
   :rdfs/domain  :n3/Statement,
   :rdfs/label   "predicate value",
   :rdfs/range   :xsd/string})

(def predicate
  {:db/ident    :n3/predicate,
   :rdf/type    #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/domain :n3/Statement,
   :rdfs/label  "predicate",
   :rdfs/range  :n3/Term})

(def statements
  {:db/ident :n3/statements,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A closed set of statements. The order of the statements is irrelevant.",
   :rdfs/domain :n3/Formula,
   :rdfs/label "statements",
   :rdfs/range :rdfs/Class})

(def subjURI
  {:db/ident     :n3/subjURI,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "Shorthand for subject!uri",
   :rdfs/domain  :n3/Statement,
   :rdfs/label   "subject URI",
   :rdfs/range   :xsd/string})

(def subjValue
  {:db/ident     :n3/subjValue,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "Shorthand for subject!Literal. Not in RDF 1.0",
   :rdfs/domain  :n3/Statement,
   :rdfs/label   "subject value",
   :rdfs/range   :xsd/string})

(def subject
  {:db/ident    :n3/subject,
   :rdf/type    #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/domain :n3/Statement,
   :rdfs/label  "subject",
   :rdfs/range  :n3/Term})

(def universals
  {:db/ident     :n3/universals,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The set of universally quantified symbols.",
   :rdfs/domain  :n3/Formula,
   :rdfs/label   "for all",
   :rdfs/range   :rdfs/Class})

(def uri
  {:db/ident :n3/uri,
   :rdf/type #{:rdf/Property :owl/InverseFunctionalProperty},
   :rdfs/comment
   "The URI of the symbol is all that is needed to identify it.\n\tThis is the name string.",
   :rdfs/domain :n3/Symbol,
   :rdfs/label "symbol URI, not arbitrary",
   :rdfs/range :xsd/string})

(def value
  {:db/ident :n3/value,
   :rdf/type #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment
   "The value of a literal.\n\n\tValue is the relation between a node (which happens to be a literal, list etc,..) and the value it takes.",
   :rdfs/domain :n3/Literal,
   :rdfs/label "Value"})

(def urn:uuid:e59ecc7b-08c9-58d0-b082-95cdca3e2724
  {:rdf/type     :owl/Ontology,
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/DesignIssues/Reify.html"},
   :xsd/anyURI   "http://www.w3.org/2004/06/rei#"})