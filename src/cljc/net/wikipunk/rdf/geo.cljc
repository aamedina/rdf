(ns net.wikipunk.rdf.geo
  {:namespaces  {"dc11" "http://purl.org/dc/elements/1.1/",
                 "geo"  "http://www.w3.org/2003/01/geo/wgs84_pos#",
                 "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "geo",
   :rdfa/uri    "http://www.w3.org/2003/01/geo/wgs84_pos#"}
  (:refer-clojure :exclude [long]))

(def Point
  {:db/ident :geo/Point,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #{"A point, typically described using a coordinate system relative to Earth, such as WGS84.\n  "
     " \nUniquely identified by lat/long/alt. i.e.\n\nspaciallyIntersects(P1, P2) :- lat(P1, LAT), long(P1, LONG), alt(P1, ALT),\n  lat(P2, LAT), long(P2, LONG), alt(P2, ALT).\n\nsameThing(P1, P2) :- type(P1, Point), type(P2, Point), spaciallyIntersects(P1, P2).\n  "},
   :rdfs/label "point",
   :rdfs/subClassOf :geo/SpatialThing})

(def SpatialThing
  {:db/ident :geo/SpatialThing,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Anything with spatial extent, i.e. size, shape, or position.\n e.g. people, places, bowling balls, as well as abstract areas like cubes.\n",
   :rdfs/label "SpatialThing"})

(def alt
  {:db/ident :geo/alt,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The WGS84 altitude of a SpatialThing (decimal meters \nabove the local reference ellipsoid).",
   :rdfs/domain :geo/SpatialThing,
   :rdfs/label "altitude"})

(def lat
  {:db/ident     :geo/lat,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The WGS84 latitude of a SpatialThing (decimal degrees).",
   :rdfs/domain  :geo/SpatialThing,
   :rdfs/label   "latitude"})

(def lat_long
  {:db/ident :geo/lat_long,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A comma-separated representation of a latitude, longitude coordinate.",
   :rdfs/label "lat/long"})

(def location
  {:db/ident :geo/location,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The relation between something and the point, \n or other geometrical thing in space, where it is.  For example, the realtionship between\n a radio tower and a Point with a given lat and long.\n Or a relationship between a park and its outline as a closed arc of points, or a road and\n its location as a arc (a sequence of points).\n Clearly in practice there will be limit to the accuracy of any such statement, but one would expect\n an accuracy appropriate for the size of the object and uses such as mapping .\n ",
   :rdfs/label "location",
   :rdfs/range :geo/SpatialThing,
   :rdfs/subPropertyOf :foaf/based_near})

(def long
  {:db/ident     :geo/long,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The WGS84 longitude of a SpatialThing (decimal degrees).",
   :rdfs/domain  :geo/SpatialThing,
   :rdfs/label   "longitude"})