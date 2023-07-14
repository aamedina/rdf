(ns net.wikipunk.rdf.event
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/event/versions/2007-10-25.n3",
   :rdf/ns-prefix-map {"dc11"  "http://purl.org/dc/elements/1.1/",
                       "event" "http://purl.org/NET/c4dm/event.owl#",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "geo"   "http://www.w3.org/2003/01/geo/wgs84_pos#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "time"  "http://www.w3.org/2006/time#",
                       "vs"    "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "event",
   :rdfa/uri "http://purl.org/NET/c4dm/event.owl#"}
  (:refer-clojure :exclude [agent time]))

(def Event
  "\n\t\tAn arbitrary classification of a space/time region, by a \n\t\tcognitive agent. An event may have actively participating agents,\n\t\tpassive factors, products, and a location in space/time.\n\t\t"
  {:db/ident :event/Event,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "\n\t\tAn arbitrary classification of a space/time region, by a \n\t\tcognitive agent. An event may have actively participating agents,\n\t\tpassive factors, products, and a location in space/time.\n\t\t",
   :rdfs/label #xsd/string "Event",
   :vs/term_status #xsd/string "stable"})

(def Factor
  "\n\t\tEverything used as a factor in an event\n\t\t"
  {:db/ident            :event/Factor,
   :owl/disjointWith    :foaf/Agent,
   :owl/equivalentClass {:owl/onProperty     :event/factor_of,
                         :owl/someValuesFrom :event/Event,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/comment        #xsd/string
                         "\n\t\tEverything used as a factor in an event\n\t\t",
   :rdfs/label          #xsd/string "Factor",
   :vs/term_status      #xsd/string "stable"})

(def Product
  "\n\t\tEverything produced by an event\n\t\t"
  {:db/ident            :event/Product,
   :owl/equivalentClass {:owl/onProperty     :event/produced_in,
                         :owl/someValuesFrom :event/Event,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/comment        #xsd/string
                         "\n\t\tEverything produced by an event\n\t\t",
   :rdfs/label          #xsd/string "Product",
   :vs/term_status      #xsd/string "stable"})

(def agent
  "\n\t\tRelates an event to an active agent (a person, a computer, ... :-) )\n\t\t"
  {:db/ident :event/agent,
   :owl/equivalentProperty :event/hasAgent,
   :owl/inverseOf :event/agent_in,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "\n\t\tRelates an event to an active agent (a person, a computer, ... :-) )\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label #xsd/string "agent",
   :rdfs/range :foaf/Agent,
   :vs/term_status #xsd/string "stable"})

(def agent_in
  {:db/ident       :event/agent_in,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status #xsd/string "stable"})

(def factor
  "\n\t\tRelates an event to a passive factor (a tool, an instrument, an abstract cause...)\n\t\t"
  {:db/ident :event/factor,
   :owl/equivalentProperty :event/hasFactor,
   :owl/inverseOf :event/factor_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "\n\t\tRelates an event to a passive factor (a tool, an instrument, an abstract cause...)\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label #xsd/string "factor",
   :vs/term_status #xsd/string "stable"})

(def factor_of
  {:db/ident       :event/factor_of,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status #xsd/string "stable"})

(def hasAgent
  {:db/ident       :event/hasAgent,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status #xsd/string "deprecated"})

(def hasFactor
  {:db/ident       :event/hasFactor,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status #xsd/string "deprecated"})

(def hasLiteralFactor
  {:db/ident       :event/hasLiteralFactor,
   :rdf/type       :owl/DatatypeProperty,
   :vs/term_status #xsd/string "deprecated"})

(def hasProduct
  {:db/ident       :event/hasProduct,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status #xsd/string "deprecated"})

(def hasSubEvent
  {:db/ident       :event/hasSubEvent,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status #xsd/string "deprecated"})

(def isAgentIn
  "agent in"
  {:db/ident       :event/isAgentIn,
   :owl/equivalentProperty :event/agent_in,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/label     #xsd/string "agent in",
   :vs/term_status #xsd/string "deprecated"})

(def isFactorOf
  "factor of"
  {:db/ident       :event/isFactorOf,
   :owl/equivalentProperty :event/factor_of,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/label     #xsd/string "factor of",
   :vs/term_status #xsd/string "deprecated"})

(def literal_factor
  "\n\t\tRelates an event to a factor which can be described as a literal. This property\n\t\tshould not be used as-is, but should be subsumed by other, more specific, properties\n\t\t(like an hypothetic :weatherCelsius, linking an event to a temperature).\n\t\t"
  {:db/ident :event/literal_factor,
   :owl/equivalentProperty :event/hasLiteralFactor,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "\n\t\tRelates an event to a factor which can be described as a literal. This property\n\t\tshould not be used as-is, but should be subsumed by other, more specific, properties\n\t\t(like an hypothetic :weatherCelsius, linking an event to a temperature).\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label #xsd/string "literal factor",
   :vs/term_status #xsd/string "stable"})

(def place
  "\n\t\tRelates an event to a spatial object.\n\t\t"
  {:db/ident       :event/place,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #xsd/string
                    "\n\t\tRelates an event to a spatial object.\n\t\t",
   :rdfs/domain    :event/Event,
   :rdfs/label     #xsd/string "place",
   :rdfs/range     :geo/SpatialThing,
   :vs/term_status #xsd/string "stable"})

(def producedIn
  "produced in"
  {:db/ident       :event/producedIn,
   :owl/equivalentProperty :event/produced_in,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/label     #xsd/string "produced in",
   :vs/term_status #xsd/string "deprecated"})

(def produced_in
  {:db/ident       :event/produced_in,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status #xsd/string "stable"})

(def product
  "\n\t\tRelates an event to something produced during the event---a sound, a pie, whatever...\n\t\t"
  {:db/ident :event/product,
   :owl/equivalentProperty :event/hasProduct,
   :owl/inverseOf :event/produced_in,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "\n\t\tRelates an event to something produced during the event---a sound, a pie, whatever...\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label #xsd/string "product",
   :vs/term_status #xsd/string "stable"})

(def sub_event
  "\n\t\tThis property provides a way to split a complex event (for example, a performance involving several \n\t\tmusicians) into simpler ones (one event per musician).\n\t\t"
  {:db/ident :event/sub_event,
   :owl/equivalentProperty :event/hasSubEvent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "\n\t\tThis property provides a way to split a complex event (for example, a performance involving several \n\t\tmusicians) into simpler ones (one event per musician).\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label #xsd/string "sub-event",
   :rdfs/range :event/Event,
   :vs/term_status #xsd/string "stable"})

(def time
  "\n\t\tRelates an event to a time object, classifying a time region (either instantaneous or having an extent).\n\t\tBy using the Timeline ontology here, you can define event happening on a recorded track or on any \n\t\tmedia with a temporal extent.\n\t\t"
  {:db/ident :event/time,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "\n\t\tRelates an event to a time object, classifying a time region (either instantaneous or having an extent).\n\t\tBy using the Timeline ontology here, you can define event happening on a recorded track or on any \n\t\tmedia with a temporal extent.\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label #xsd/string "time",
   :rdfs/range :time/TemporalEntity,
   :vs/term_status #xsd/string "stable"})