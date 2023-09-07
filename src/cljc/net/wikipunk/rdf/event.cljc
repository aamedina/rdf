(ns net.wikipunk.rdf.event
  ^{:base "http://purl.org/NET/c4dm/event.owl#",
    :namespaces {"dc11"  "http://purl.org/dc/elements/1.1/",
                 "event" "http://purl.org/NET/c4dm/event.owl#",
                 "foaf"  "http://xmlns.com/foaf/0.1/",
                 "geo"   "http://www.w3.org/2003/01/geo/wgs84_pos#",
                 "owl"   "http://www.w3.org/2002/07/owl#",
                 "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                 "time"  "http://www.w3.org/2006/time#",
                 "vs"    "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
    :prefix "event",
    :source
    "https://lov.linkeddata.es/dataset/lov/vocabs/event/versions/2007-10-25.n3"}
  {:dc11/date "$Date: 2007/06/29 15:25:11 $",
   :dc11/description
   "\n\t\tThis ontology deals with the notion of reified events---\n\t\tevents seen as first-class objects. It only defines one\n\t\tconcept: Event, which may have agents (actively\n\t\tparticipating), factors (passively participating), products,\n\t\tand a location in space and time. \n\n\t\tRegarding the ontological status of event tokens, they are seen\n\t\tas the way cognitive agents classify space/time regions\n\t",
   :dc11/title "The Event ontology",
   :foaf/maker {:xsd/anyURI "http://moustaki.org/foaf.rdf#moustaki"},
   :owl/imports {:xsd/anyURI "http://www.w3.org/2006/time"},
   :owl/versionInfo "Revision: 1.01",
   :rdf/type #{:owl/Thing :owl/Ontology},
   :rdfs/label "The Event ontology",
   :xsd/anyURI "http://purl.org/NET/c4dm/event.owl"}
  (:refer-clojure :exclude [agent time]))

(def Event
  {:db/ident :event/Event,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\t\tAn arbitrary classification of a space/time region, by a \n\t\tcognitive agent. An event may have actively participating agents,\n\t\tpassive factors, products, and a location in space/time.\n\t\t",
   :rdfs/label "Event",
   :vs/term_status "stable"})

(def Factor
  {:db/ident            :event/Factor,
   :owl/disjointWith    :foaf/Agent,
   :owl/equivalentClass {:owl/onProperty     :event/factor_of,
                         :owl/someValuesFrom :event/Event,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/comment        "\n\t\tEverything used as a factor in an event\n\t\t",
   :rdfs/label          "Factor",
   :vs/term_status      "stable"})

(def Product
  {:db/ident            :event/Product,
   :owl/equivalentClass {:owl/onProperty     :event/produced_in,
                         :owl/someValuesFrom :event/Event,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/comment        "\n\t\tEverything produced by an event\n\t\t",
   :rdfs/label          "Product",
   :vs/term_status      "stable"})

(def agent
  {:db/ident :event/agent,
   :owl/equivalentProperty :event/hasAgent,
   :owl/inverseOf :event/agent_in,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n\t\tRelates an event to an active agent (a person, a computer, ... :-) )\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label "agent",
   :rdfs/range :foaf/Agent,
   :vs/term_status "stable"})

(def agent_in
  {:db/ident       :event/agent_in,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "stable"})

(def factor
  {:db/ident :event/factor,
   :owl/equivalentProperty :event/hasFactor,
   :owl/inverseOf :event/factor_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n\t\tRelates an event to a passive factor (a tool, an instrument, an abstract cause...)\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label "factor",
   :vs/term_status "stable"})

(def factor_of
  {:db/ident       :event/factor_of,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "stable"})

(def hasAgent
  {:db/ident       :event/hasAgent,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "deprecated"})

(def hasFactor
  {:db/ident       :event/hasFactor,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "deprecated"})

(def hasLiteralFactor
  {:db/ident       :event/hasLiteralFactor,
   :rdf/type       :owl/DatatypeProperty,
   :vs/term_status "deprecated"})

(def hasProduct
  {:db/ident       :event/hasProduct,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "deprecated"})

(def hasSubEvent
  {:db/ident       :event/hasSubEvent,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "deprecated"})

(def isAgentIn
  {:db/ident       :event/isAgentIn,
   :owl/equivalentProperty :event/agent_in,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/label     "agent in",
   :vs/term_status "deprecated"})

(def isFactorOf
  {:db/ident       :event/isFactorOf,
   :owl/equivalentProperty :event/factor_of,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/label     "factor of",
   :vs/term_status "deprecated"})

(def literal_factor
  {:db/ident :event/literal_factor,
   :owl/equivalentProperty :event/hasLiteralFactor,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n\t\tRelates an event to a factor which can be described as a literal. This property\n\t\tshould not be used as-is, but should be subsumed by other, more specific, properties\n\t\t(like an hypothetic :weatherCelsius, linking an event to a temperature).\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label "literal factor",
   :vs/term_status "stable"})

(def place
  {:db/ident       :event/place,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   "\n\t\tRelates an event to a spatial object.\n\t\t",
   :rdfs/domain    :event/Event,
   :rdfs/label     "place",
   :rdfs/range     :geo/SpatialThing,
   :vs/term_status "stable"})

(def producedIn
  {:db/ident       :event/producedIn,
   :owl/equivalentProperty :event/produced_in,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/label     "produced in",
   :vs/term_status "deprecated"})

(def produced_in
  {:db/ident       :event/produced_in,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "stable"})

(def product
  {:db/ident :event/product,
   :owl/equivalentProperty :event/hasProduct,
   :owl/inverseOf :event/produced_in,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n\t\tRelates an event to something produced during the event---a sound, a pie, whatever...\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label "product",
   :vs/term_status "stable"})

(def sub_event
  {:db/ident :event/sub_event,
   :owl/equivalentProperty :event/hasSubEvent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n\t\tThis property provides a way to split a complex event (for example, a performance involving several \n\t\tmusicians) into simpler ones (one event per musician).\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label "sub-event",
   :rdfs/range :event/Event,
   :vs/term_status "stable"})

(def time
  {:db/ident :event/time,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n\t\tRelates an event to a time object, classifying a time region (either instantaneous or having an extent).\n\t\tBy using the Timeline ontology here, you can define event happening on a recorded track or on any \n\t\tmedia with a temporal extent.\n\t\t",
   :rdfs/domain :event/Event,
   :rdfs/label "time",
   :rdfs/range :time/TemporalEntity,
   :vs/term_status "stable"})

(def urn:uuid:c4df90a1-1490-59b3-adb0-7ab6c2375889
  {:dc11/date "$Date: 2007/06/29 15:25:11 $",
   :dc11/description
   "\n\t\tThis ontology deals with the notion of reified events---\n\t\tevents seen as first-class objects. It only defines one\n\t\tconcept: Event, which may have agents (actively\n\t\tparticipating), factors (passively participating), products,\n\t\tand a location in space and time. \n\n\t\tRegarding the ontological status of event tokens, they are seen\n\t\tas the way cognitive agents classify space/time regions\n\t",
   :dc11/title "The Event ontology",
   :foaf/maker {:xsd/anyURI "http://moustaki.org/foaf.rdf#moustaki"},
   :owl/imports {:xsd/anyURI "http://www.w3.org/2006/time"},
   :owl/versionInfo "Revision: 1.01",
   :rdf/type #{:owl/Thing :owl/Ontology},
   :rdfs/label "The Event ontology",
   :xsd/anyURI "http://purl.org/NET/c4dm/event.owl"})

(def urn:uuid:5680642c-cc74-52bd-944e-36361ef159be
  {:rdf/type   :foaf/Person,
   :xsd/anyURI "http://moustaki.org/foaf.rdf#moustaki"})