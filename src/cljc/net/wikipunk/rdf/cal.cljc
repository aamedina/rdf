(ns net.wikipunk.rdf.cal
  {:dcat/downloadURL  "https://www.w3.org/2002/12/cal/icaltzd.rdf",
   :private           true,
   :rdf/ns-prefix-map {"cal"  "http://www.w3.org/2002/12/cal/icaltzd#",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "spec" "http://www.w3.org/2002/12/cal/icalSpec#",
                       "xhv"  "http://www.w3.org/1999/xhtml",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :owl/Thing,
   :rdfa/prefix       "cal",
   :rdfa/uri          "http://www.ietf.org/rfc/rfc2445.txt",
   :rdfs/isDefinedBy  {:rdfa/uri "http://www.w3.org/2002/12/cal/icaltzd#"}}
  (:refer-clojure :exclude [class comment count range repeat sequence]))

(def DomainOf_rrule
  {:db/ident :cal/DomainOf_rrule,
   :rdf/type :owl/Class})

(def List_of_Float
  {:db/ident :cal/List_of_Float,
   :rdf/type :owl/Class})

(def Valarm
  "Provide a grouping of component properties that define an alarm."
  {:db/ident :cal/Valarm,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of component properties that define an alarm.",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/repeat,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/attach,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/summary,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/attendee,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/action,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/trigger,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/duration,
                      :rdf/type           :owl/Restriction}]})

(def Value_CAL-ADDRESS
  {:db/ident :cal/Value_CAL-ADDRESS,
   :rdf/type :owl/Class})

(def Value_DATE
  {:db/ident :cal/Value_DATE,
   :rdf/type :owl/Class})

(def Value_DATE-TIME
  {:db/ident :cal/Value_DATE-TIME,
   :rdf/type :rdfs/Datatype})

(def Value_DURATION
  {:db/ident :cal/Value_DURATION,
   :rdf/type :owl/Class})

(def Value_PERIOD
  {:db/ident :cal/Value_PERIOD,
   :rdf/type :owl/Class})

(def Value_RECUR
  {:db/ident :cal/Value_RECUR,
   :rdf/type :owl/Class})

(def Vcalendar
  "VCALENDAR"
  {:db/ident   :cal/Vcalendar,
   :rdf/type   :owl/Class,
   :rdfs/label #xsd/string "VCALENDAR"})

(def Vevent
  "Provide a grouping of component properties that describe an event."
  {:db/ident :cal/Vevent,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of component properties that describe an event.",
   :rdfs/label #xsd/string "Event",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/contact,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/rrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/categories,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/organizer,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/recurrenceId,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/class,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/duration,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/sequence,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/attach,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/exdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/attendee,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/rdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/uid,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/lastModified,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/dtstamp,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/url,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/dtstart,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/trigger,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/summary,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/status,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/requestStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/created,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/relatedTo,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/priority,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/location,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/exrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/transp,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/dtend,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/geo,
                      :rdf/type           :owl/Restriction}]})

(def Vfreebusy
  "Provide a grouping of component properties that describe either a request for free/busy time, describe a response to a request for free/busy time or describe a published set of busy time."
  {:db/ident :cal/Vfreebusy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of component properties that describe either a request for free/busy time, describe a response to a request for free/busy time or describe a published set of busy time.",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/freebusy,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/requestStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/dtstamp,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/dtstart,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/uid,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/contact,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/duration,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/dtend,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/url,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/attendee,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/organizer,
                      :rdf/type           :owl/Restriction}]})

(def Vjournal
  "Provide a grouping of component properties that describe a journal entry."
  {:db/ident :cal/Vjournal,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of component properties that describe a journal entry.",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/lastModified,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/recurrenceId,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/exdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/rdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/attendee,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/requestStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/url,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/created,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/summary,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/relatedTo,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/contact,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/sequence,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/class,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/dtstamp,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/exrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/categories,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/rrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/uid,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/status,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/attach,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/organizer,
                      :rdf/type           :owl/Restriction}]})

(def Vtimezone
  "Provide a grouping of component properties that defines a time zone."
  {:db/ident :cal/Vtimezone,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of component properties that defines a time zone.",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/tzname,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/tzoffsetto,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/tzurl,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/rrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/dtstart,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/recurrenceId,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/rdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/tzoffsetfrom,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/lastModified,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/exdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/tzid,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/comment,
                      :rdf/type           :owl/Restriction}]})

(def Vtodo
  "Provide a grouping of calendar properties that describe a to-do."
  {:db/ident :cal/Vtodo,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of calendar properties that describe a to-do.",
   :rdfs/label #xsd/string "To-do",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/priority,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/location,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/uid,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/exdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/trigger,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/dtstamp,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/sequence,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/duration,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/geo,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/attendee,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/completed,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/exrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/recurrenceId,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/contact,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/percentComplete,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/created,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/summary,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/class,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/relatedTo,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/status,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/dtstart,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/categories,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/attach,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/url,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/organizer,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/due,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/lastModified,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/requestStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/rdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :cal/rrule,
                      :rdf/type           :owl/Restriction}]})

(def X-
  {:db/ident :cal/X-,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This class of property provides a framework for defining non-standard properties."],
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def action
  {:db/ident :cal/action,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property defines the action to be invoked when an alarm is triggered."],
   :rdfs/domain {:owl/unionOf [:cal/Valarm :cal/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def altrep
  "To specify an alternate text representation for the property value."
  {:db/ident :cal/altrep,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify an alternate text representation for the property value."})

(def attach
  {:db/ident :cal/attach,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string "\n\t    default value type: URI"
    #xsd/string
     "The property provides the capability to associate a document object with a calendar component."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Valarm
                               :cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Valarm],
                 :rdf/type    :owl/Class},
   :spec/valueType #xsd/string "URI"})

(def attendee
  "attendee"
  {:db/ident :cal/attendee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: CAL-ADDRESS"
    #xsd/string
     "The property defines an \"Attendee\" within a calendar component."],
   :rdfs/domain {:owl/unionOf [:cal/Valarm
                               :cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Vfreebusy
                               :cal/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "attendee",
   :rdfs/range :cal/Value_CAL-ADDRESS,
   :spec/valueType #xsd/string "CAL-ADDRESS"})

(def byday
  "BYDAY"
  {:db/ident   :cal/byday,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "BYDAY"})

(def byhour
  "BYHOUR"
  {:db/ident   :cal/byhour,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "BYHOUR"})

(def byminute
  "BYMINUTE"
  {:db/ident   :cal/byminute,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "BYMINUTE"})

(def bymonth
  "BYMONTH"
  {:db/ident   :cal/bymonth,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "BYMONTH"})

(def bysecond
  "BYSECOND"
  {:db/ident   :cal/bysecond,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "BYSECOND"})

(def bysetpos
  "BYSETPOS"
  {:db/ident   :cal/bysetpos,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "BYSETPOS"})

(def byweekno
  "BYWEEKNO"
  {:db/ident   :cal/byweekno,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "BYWEEKNO"})

(def byyearday
  "BYYEARDAY"
  {:db/ident   :cal/byyearday,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "BYYEARDAY"})

(def calAddress
  {:db/ident :cal/calAddress,
   :rdf/type :owl/ObjectProperty})

(def calscale
  {:db/ident :cal/calscale,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property defines the calendar scale used for the calendar information specified in the iCalendar object."],
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def categories
  {:db/ident :cal/categories,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property defines the categories for a calendar component."],
   :rdfs/domain
   {:owl/unionOf
    [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vevent :cal/Vtodo :cal/Vjournal],
    :rdf/type :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def class
  {:db/ident :cal/class,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property defines the access classification for a calendar component."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def cn
  "To specify the common name to be associated with the calendar user specified by the property."
  {:db/ident :cal/cn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the common name to be associated with the calendar user specified by the property."})

(def comment
  {:db/ident :cal/comment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property specifies non-processing information intended to provide a comment to the calendar user."],
   :rdfs/domain
   {:owl/unionOf
    [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vtimezone :cal/Vfreebusy],
    :rdf/type :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def completed
  {:db/ident :cal/completed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: DATE-TIME"
    #xsd/string
     "This property defines the date and time that a to-do was actually completed."],
   :rdfs/domain :cal/Vtodo,
   :rdfs/range :cal/Value_DATE-TIME,
   :spec/valueType #xsd/string "DATE-TIME"})

(def component
  {:db/ident :cal/component,
   :rdf/type :owl/ObjectProperty})

(def contact
  {:db/ident :cal/contact,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "The property is used to represent contact information or alternately a reference to contact information associated with the calendar component."],
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def count
  "COUNT"
  {:db/ident   :cal/count,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "COUNT"})

(def created
  {:db/ident :cal/created,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: DATE-TIME"
    #xsd/string
     "This property specifies the date and time that the calendar information was created by the calendar user agent in the calendar store. Note: This is analogous to the creation date and time for a file in the file system."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_DATE-TIME,
   :spec/valueType #xsd/string "DATE-TIME"})

(def cutype
  "To specify the type of calendar user specified by the property."
  {:db/ident :cal/cutype,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the type of calendar user specified by the property."})

(def dateTime
  {:db/ident :cal/dateTime,
   :rdf/type :rdfs/Datatype})

(def daylight
  "DAYLIGHT"
  {:db/ident   :cal/daylight,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label #xsd/string "DAYLIGHT"})

(def delegatedFrom
  "To specify the calendar users that have delegated their participation to the calendar user specified by the property."
  {:db/ident :cal/delegatedFrom,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the calendar users that have delegated their participation to the calendar user specified by the property."})

(def delegatedTo
  "To specify the calendar users to whom the calendar user specified by the property has delegated participation."
  {:db/ident :cal/delegatedTo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the calendar users to whom the calendar user specified by the property has delegated participation."})

(def description
  {:db/ident :cal/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property provides a more complete description of the calendar component, than that provided by the \"SUMMARY\" property."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Valarm
                               :cal/Vjournal
                               :cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def dir
  "To specify reference to a directory entry associated with the calendar user specified by the property."
  {:db/ident :cal/dir,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify reference to a directory entry associated with the calendar user specified by the property."})

(def dtend
  "end"
  {:db/ident :cal/dtend,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    default value type: DATE-TIME"
    #xsd/string
     "This property specifies the date and time that a calendar component ends."],
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vfreebusy :cal/Vevent :cal/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "end",
   :spec/valueType #xsd/string "DATE-TIME"})

(def dtstamp
  {:db/ident :cal/dtstamp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: DATE-TIME"
    #xsd/string
     "The property indicates the date/time that the instance of the iCalendar object was created."],
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_DATE-TIME,
   :spec/valueType #xsd/string "DATE-TIME"})

(def dtstart
  "start"
  {:db/ident :cal/dtstart,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    default value type: DATE-TIME"
    #xsd/string "This property specifies when the calendar component begins."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent
                               :cal/Vtodo
                               :cal/Vfreebusy
                               :cal/Vtimezone
                               :cal/Vevent
                               :cal/Vevent
                               :cal/Vfreebusy
                               :cal/Vtimezone
                               :cal/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "start",
   :spec/valueType #xsd/string "DATE-TIME"})

(def due
  {:db/ident :cal/due,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    default value type: DATE-TIME"
    #xsd/string
     "This property defines the date and time that a to-do is expected to be completed."],
   :rdfs/domain :cal/Vtodo,
   :spec/valueType #xsd/string "DATE-TIME"})

(def duration
  {:db/ident       :cal/duration,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   [#xsd/string "\n\t    value type: DURATION"
                    #xsd/string
                     "The property specifies a positive duration of time."],
   :rdfs/domain    {:owl/unionOf [:cal/Vevent
                                  :cal/Vtodo
                                  :cal/Vfreebusy
                                  :cal/Valarm
                                  :cal/Vevent
                                  :cal/Vtodo
                                  :cal/Vfreebusy
                                  :cal/Valarm],
                    :rdf/type    :owl/Class},
   :rdfs/range     :cal/Value_DURATION,
   :spec/valueType #xsd/string "DURATION"})

(def encoding
  "To specify an alternate inline encoding for the property value."
  {:db/ident :cal/encoding,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify an alternate inline encoding for the property value."})

(def exdate
  {:db/ident :cal/exdate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    default value type: DATE-TIME"
    #xsd/string
     "This property defines the list of date/time exceptions for a recurring calendar component."],
   :rdfs/domain :cal/DomainOf_rrule,
   :spec/valueType #xsd/string "DATE-TIME"})

(def exrule
  {:db/ident :cal/exrule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: RECUR"
    #xsd/string
     "This property defines a rule or repeating pattern for an exception to a recurrence set."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_RECUR,
   :spec/valueType #xsd/string "RECUR"})

(def fbtype
  "To specify the free or busy time type."
  {:db/ident     :cal/fbtype,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string "To specify the free or busy time type."})

(def fmttype
  "To specify the content type of a referenced object."
  {:db/ident     :cal/fmttype,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string
                  "To specify the content type of a referenced object."})

(def freebusy
  {:db/ident :cal/freebusy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: PERIOD"
    #xsd/string
     "The property defines one or more free or busy time intervals."],
   :rdfs/domain {:owl/unionOf [:cal/Vfreebusy :cal/Vfreebusy],
                 :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_PERIOD,
   :spec/valueType #xsd/string "PERIOD"})

(def freq
  "FREQ"
  {:db/ident   :cal/freq,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "FREQ"})

(def geo
  {:db/ident :cal/geo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: list of FLOAT"
    #xsd/string
     "This property specifies information related to the global position for the activity specified by a calendar component."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/range :cal/List_of_Float,
   :spec/valueListType #xsd/string "FLOAT"})

(def interval
  "INTERVAL"
  {:db/ident   :cal/interval,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "INTERVAL"})

(def language
  "To specify the language for text values in a property or property parameter."
  {:db/ident :cal/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the language for text values in a property or property parameter."})

(def lastModified
  {:db/ident :cal/lastModified,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: DATE-TIME"
    #xsd/string
     "The property specifies the date and time that the information associated with the calendar component was last revised in the calendar store. Note: This is analogous to the modification date and time for a file in the file system."],
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vtimezone],
    :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_DATE-TIME,
   :spec/valueType #xsd/string "DATE-TIME"})

(def location
  "location"
  {:db/ident :cal/location,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "The property defines the intended venue for the activity defined by a calendar component."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "location",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def member
  "To specify the group or list membership of the calendar user specified by the property."
  {:db/ident :cal/member,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the group or list membership of the calendar user specified by the property."})

(def method
  {:db/ident :cal/method,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property defines the iCalendar object method associated with the calendar object."],
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def organizer
  {:db/ident :cal/organizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: CAL-ADDRESS"
    #xsd/string "The property defines the organizer for a calendar component."],
   :rdfs/domain
   {:owl/unionOf
    [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vfreebusy :cal/Vfreebusy],
    :rdf/type :owl/Class},
   :rdfs/range :cal/Value_CAL-ADDRESS,
   :spec/valueType #xsd/string "CAL-ADDRESS"})

(def partstat
  "To specify the participation status for the calendar user specified by the property."
  {:db/ident :cal/partstat,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the participation status for the calendar user specified by the property."})

(def percentComplete
  {:db/ident :cal/percentComplete,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: INTEGER"
    #xsd/string
     "This property is used by an assignee or delegatee of a to-do to convey the percent completion of a to-do to the Organizer."],
   :rdfs/domain :cal/Vtodo,
   :rdfs/range :xsd/integer,
   :spec/valueType #xsd/string "INTEGER"})

(def priority
  {:db/ident :cal/priority,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: INTEGER"
    #xsd/string
     "The property defines the relative priority for a calendar component."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vevent :cal/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/integer,
   :spec/valueType #xsd/string "INTEGER"})

(def prodid
  {:db/ident :cal/prodid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property specifies the identifier for the product that created the iCalendar object."],
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def range
  "To specify the effective range of recurrence instances from the instance specified by the recurrence identifier specified by the property."
  {:db/ident :cal/range,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the effective range of recurrence instances from the instance specified by the recurrence identifier specified by the property."})

(def rdate
  {:db/ident :cal/rdate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    default value type: DATE-TIME"
    #xsd/string
     "This property defines the list of date/times for a recurrence set."],
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vtimezone],
    :rdf/type    :owl/Class},
   :spec/valueType #xsd/string "DATE-TIME"})

(def recurrenceId
  {:db/ident :cal/recurrenceId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    default value type: DATE-TIME"
    #xsd/string
     "This property is used in conjunction with the \"UID\" and \"SEQUENCE\" property to identify a specific instance of a recurring \"VEVENT\", \"VTODO\" or \"VJOURNAL\" calendar component. The property value is the effective value of the \"DTSTART\" property of the recurrence instance."],
   :rdfs/domain :cal/DomainOf_rrule,
   :spec/valueType #xsd/string "DATE-TIME"})

(def related
  "To specify the relationship of the alarm trigger with respect to the start or end of the calendar component."
  {:db/ident :cal/related,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the relationship of the alarm trigger with respect to the start or end of the calendar component."})

(def relatedTo
  {:db/ident :cal/relatedTo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "The property is used to represent a relationship or reference between one calendar component and another."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def reltype
  "To specify the type of hierarchical relationship associated with the calendar component specified by the property."
  {:db/ident :cal/reltype,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the type of hierarchical relationship associated with the calendar component specified by the property."})

(def repeat
  {:db/ident :cal/repeat,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: INTEGER"
    #xsd/string
     "This property defines the number of time the alarm should be repeated, after the initial trigger."],
   :rdfs/domain :cal/Valarm,
   :rdfs/range :xsd/integer,
   :spec/valueType #xsd/string "INTEGER"})

(def requestStatus
  {:db/ident :cal/requestStatus,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property defines the status code returned for a scheduling request."],
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def resources
  {:db/ident :cal/resources,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property defines the equipment or resources anticipated for an activity specified by a calendar entity.."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def role
  "To specify the participation role for the calendar user specified by the property."
  {:db/ident :cal/role,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the participation role for the calendar user specified by the property."})

(def rrule
  {:db/ident :cal/rrule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: RECUR"
    #xsd/string
     "This property defines a rule or repeating pattern for recurring events, to-dos, or time zone definitions."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Vtimezone
                               :cal/Vtimezone
                               :cal/Vtimezone
                               :cal/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_RECUR,
   :spec/valueType #xsd/string "RECUR"})

(def rsvp
  "To specify whether there is an expectation of a favor of a reply from the calendar user specified by the property value."
  {:db/ident :cal/rsvp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify whether there is an expectation of a favor of a reply from the calendar user specified by the property value."})

(def sentBy
  "To specify the calendar user that is acting on behalf of the calendar user specified by the property."
  {:db/ident :cal/sentBy,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "To specify the calendar user that is acting on behalf of the calendar user specified by the property."})

(def sequence
  {:db/ident :cal/sequence,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: integer"
    #xsd/string
     "This property defines the revision sequence number of the calendar component within a sequence of revisions."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/integer,
   :spec/valueType #xsd/string "integer"})

(def standard
  "STANDARD"
  {:db/ident   :cal/standard,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label #xsd/string "STANDARD"})

(def status
  {:db/ident :cal/status,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property defines the overall status or confirmation for the calendar component."],
   :rdfs/domain
   {:owl/unionOf
    [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vevent :cal/Vtodo :cal/Vjournal],
    :rdf/type :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def summary
  "summary"
  {:db/ident :cal/summary,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property defines a short summary or subject for the calendar component."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Valarm
                               :cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "summary",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :rdfs/label,
   :spec/valueType #xsd/string "TEXT"})

(def transp
  {:db/ident :cal/transp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property defines whether an event is transparent or not to busy time searches."],
   :rdfs/domain :cal/Vevent,
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def trigger
  {:db/ident       :cal/trigger,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   [#xsd/string "\n\t    default value type: DURATION"
                    #xsd/string
                     "This property specifies when an alarm will trigger."],
   :rdfs/domain    {:owl/unionOf [:cal/Valarm
                                  :cal/Valarm
                                  :cal/Vevent
                                  :cal/Vtodo
                                  :cal/Vevent
                                  :cal/Vtodo],
                    :rdf/type    :owl/Class},
   :rdfs/range     {:owl/unionOf [:cal/Value_DURATION
                                  :cal/Value_DATE
                                  :cal/Value_DATE],
                    :rdf/type    :owl/Class},
   :spec/valueType #xsd/string "DURATION"})

(def tzid
  {:db/ident :cal/tzid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "To specify the identifier for the time zone definition for a time component in the property value."
    #xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property specifies the text value that uniquely identifies the \"VTIMEZONE\" calendar component."],
   :rdfs/domain :cal/Vtimezone,
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def tzname
  {:db/ident :cal/tzname,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property specifies the customary designation for a time zone description."],
   :rdfs/domain :cal/Vtimezone,
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def tzoffsetfrom
  {:db/ident :cal/tzoffsetfrom,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: UTC-OFFSET"
    #xsd/string
     "This property specifies the offset which is in use prior to this time zone observance."],
   :rdfs/domain {:owl/unionOf [:cal/Vtimezone :cal/Vtimezone :cal/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "UTC-OFFSET"})

(def tzoffsetto
  {:db/ident :cal/tzoffsetto,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: UTC-OFFSET"
    #xsd/string
     "This property specifies the offset which is in use in this time zone observance."],
   :rdfs/domain :cal/Vtimezone,
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "UTC-OFFSET"})

(def tzurl
  {:db/ident :cal/tzurl,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: URI"
    #xsd/string
     "The TZURL provides a means for a VTIMEZONE component to point to a network location that can be used to retrieve an up-to- date version of itself."],
   :rdfs/domain {:owl/unionOf [:cal/Vtimezone :cal/Vtimezone :cal/Vtimezone],
                 :rdf/type    :owl/Class},
   :spec/valueType #xsd/string "URI"})

(def uid
  {:db/ident :cal/uid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property defines the persistent, globally unique identifier for the calendar component."],
   :rdfs/domain {:owl/unionOf [:cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Vfreebusy
                               :cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def until
  "UNTIL"
  {:db/ident   :cal/until,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "UNTIL"})

(def url
  "see also"
  {:db/ident :cal/url,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: URI"
    #xsd/string
     "This property defines a Uniform Resource Locator (URL) associated with the iCalendar object."],
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "see also",
   :spec/valueType #xsd/string "URI"})

(def version
  {:db/ident :cal/version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "\n\t    value type: TEXT"
    #xsd/string
     "This property specifies the identifier corresponding to the highest version number or the minimum and maximum range of the iCalendar specification that is required in order to interpret the iCalendar object."],
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def wkst
  "WKST"
  {:db/ident   :cal/wkst,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label #xsd/string "WKST"})