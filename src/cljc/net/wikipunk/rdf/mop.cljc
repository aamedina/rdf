(ns net.wikipunk.rdf.mop
  "RDF vocabulary for the Metaobject Protocol.
  
  A metaobject represents one program element--usually a class or
  property in your RDF graph.

  Associated with each metaobject is the information required to serve
  its role. This includes information provided directly by a RDF model
  or computed indirectly from other relevant metaobjects related to
  its metaclass's initialization protocol."
  {:rdf/type :owl/Ontology})

(def class-direct-slots
  {:db/ident       :mop/class-direct-slots
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/ref
   :rdf/type       :owl/ObjectProperty
   :rdfs/range     :rdfs/Class
   :rdfs/domain    :rdf/Property})

(def class-direct-subclasses
  "A class metaobject's direct subclasses."
  {:db/ident       :mop/class-direct-subclasses
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/ref
   :rdf/type       :owl/ObjectProperty
   :rdfs/range     :rdfs/Class
   :rdfs/domain    :rdfs/Class})

(def class-slots
  {:db/ident       :mop/class-slots
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/ref
   :rdf/type       :owl/ObjectProperty
   :rdfs/range     :rdfs/Class
   :rdfs/domain    :rdf/Property})
