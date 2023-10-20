(ns net.wikipunk.rdf.mop
  {:dcat/downloadURL "net/wikipunk/ext/mop.ttl",
   :namespaces {"mop"  "https://wikipunk.net/mop/",
                "owl"  "http://www.w3.org/2002/07/owl#",
                "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "mop",
   :rdfa/uri "https://wikipunk.net/mop/",
   :rdfs/comment
   "RDF vocabulary for the Metaobject Protocol.\n  \n  A metaobject represents one program element--usually a class or\n  property in your RDF graph.\n\n  Associated with each metaobject is the information required to serve\n  its role. This includes information provided directly by a RDF model\n  or computed indirectly from other relevant metaobjects related to\n  its metaclass's initialization protocol.",
   :rdfs/label "Metaobject Protocol",
   :xsd/anyURI "https://wikipunk.net/mop/"}
  (:refer-clojure :exclude [ancestors descendants parents]))

(def ancestors
  {:db/ident    :mop/ancestors,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/range  :rdfs/Resource})

(def classDirectSlots
  {:db/ident    :mop/classDirectSlots,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :rdfs/Class,
   :rdfs/range  :rdf/Property})

(def classDirectSubclasses
  {:db/ident    :mop/classDirectSubclasses,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :rdfs/Class,
   :rdfs/range  :rdfs/Class})

(def classDirectSuperclasses
  {:db/ident    :mop/classDirectSuperclasses,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :rdfs/Class,
   :rdfs/range  :rdfs/Class})

(def classPrecedenceList
  {:db/ident    :mop/classPrecedenceList,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :rdfs/Class,
   :rdfs/range  :rdf/List})

(def classSlots
  {:db/ident    :mop/classSlots,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :rdfs/Class,
   :rdfs/range  :rdf/Property})

(def descendants
  {:db/ident    :mop/descendants,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/range  :rdfs/Resource})

(def parents
  {:db/ident    :mop/parents,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :rdfs/Resource,
   :rdfs/range  :rdfs/Resource})

(def urn:uuid:5ff362e3-87bd-52b2-b624-8f2e6e44d361
  {:rdf/type :owl/Ontology,
   :rdfs/comment
   "RDF vocabulary for the Metaobject Protocol.\n  \n  A metaobject represents one program element--usually a class or\n  property in your RDF graph.\n\n  Associated with each metaobject is the information required to serve\n  its role. This includes information provided directly by a RDF model\n  or computed indirectly from other relevant metaobjects related to\n  its metaclass's initialization protocol.",
   :rdfs/label "Metaobject Protocol",
   :xsd/anyURI "https://wikipunk.net/mop/"})