(ns net.wikipunk.rdf.mop
  "RDF vocabulary for the Metaobject Protocol.
  
  A metaobject represents one program element--usually a class or
  property in your RDF graph.

  Associated with each metaobject is the information required to serve
  its role. This includes information provided directly by a RDF model
  or computed indirectly from other relevant metaobjects related to
  its metaclass's initialization protocol."
  {:rdf/type :owl/Ontology})

(def classDirectSlots
  {:db/ident       :mop/classDirectSlots
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/ref
   :rdf/type       :owl/ObjectProperty
   :rdfs/domain    :rdfs/Class
   :rdfs/range     :rdf/Property})

(def classDirectSubclasses
  "A class metaobject's direct subclasses."
  {:db/ident       :mop/classDirectSubclasses
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/ref
   :rdf/type       :owl/ObjectProperty
   :rdfs/range     :rdfs/Class
   :rdfs/domain    :rdfs/Class})

(def classSlots
  {:db/ident       :mop/classSlots
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/ref
   :rdf/type       :owl/ObjectProperty
   :rdfs/domain    :rdfs/Class
   :rdfs/range     :rdf/Property})

;; unordered in Datomic for now, use sort isa?
(def classPrecedenceList
  {:db/ident    :mop/classPrecedenceList   
   :rdf/type    :owl/ObjectProperty
   :rdfs/domain :rdfs/Class
   :rdfs/range  :rdf/List})
