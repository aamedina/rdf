(ns net.wikipunk.rdf.cal
  {:dcat/downloadURL  "https://www.w3.org/2002/12/cal/icaltzd.rdf",
   :rdf/ns-prefix-map {"cal"  "http://www.w3.org/2002/12/cal/icaltzd#",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "spec" "http://www.w3.org/2002/12/cal/icalSpec#",
                       "xhv"  "http://www.w3.org/1999/xhtml",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "cal",
   :rdfa/uri          "http://www.w3.org/2002/12/cal/icaltzd#",
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
   "Provide a grouping of component properties that define an alarm.",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :cal/repeat,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/trigger,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/attendee,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/action,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/attach,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/summary,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/duration,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/description,
                       :rdf/type           :owl/Restriction}}})

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
   :rdfs/label "VCALENDAR"})

(def Vevent
  "Provide a grouping of component properties that describe an event."
  {:db/ident :cal/Vevent,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provide a grouping of component properties that describe an event.",
   :rdfs/label "Event",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :cal/exrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/trigger,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/relatedTo,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/priority,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/exdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/class,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/created,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/rdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/uid,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/sequence,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/status,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/attendee,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/categories,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/attach,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/dtstart,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/location,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/summary,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/transp,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/resources,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/recurrenceId,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/dtstamp,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/comment,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/contact,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/duration,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/lastModified,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/rrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/dtend,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/requestStatus,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/organizer,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/geo,
                       :rdf/type           :owl/Restriction}}})

(def Vfreebusy
  "Provide a grouping of component properties that describe either a request for free/busy time, describe a response to a request for free/busy time or describe a published set of busy time."
  {:db/ident :cal/Vfreebusy,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provide a grouping of component properties that describe either a request for free/busy time, describe a response to a request for free/busy time or describe a published set of busy time.",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :cal/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/uid,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/attendee,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/dtstart,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/freebusy,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/dtstamp,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/comment,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/contact,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/duration,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/dtend,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/requestStatus,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/organizer,
                       :rdf/type           :owl/Restriction}}})

(def Vjournal
  "Provide a grouping of component properties that describe a journal entry."
  {:db/ident :cal/Vjournal,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provide a grouping of component properties that describe a journal entry.",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :cal/exrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/relatedTo,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/exdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/class,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/created,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/rdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/uid,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/sequence,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/status,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/attendee,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/categories,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/attach,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/summary,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/recurrenceId,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/dtstamp,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/comment,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/contact,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/lastModified,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/rrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/requestStatus,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/organizer,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/description,
                       :rdf/type           :owl/Restriction}}})

(def Vtimezone
  "Provide a grouping of component properties that defines a time zone."
  {:db/ident :cal/Vtimezone,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provide a grouping of component properties that defines a time zone.",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :cal/exdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/tzurl,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/rdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/tzoffsetto,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/tzname,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/tzid,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/dtstart,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/tzoffsetfrom,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/recurrenceId,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/comment,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/lastModified,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/rrule,
                       :rdf/type           :owl/Restriction}}})

(def Vtodo
  "Provide a grouping of calendar properties that describe a to-do."
  {:db/ident :cal/Vtodo,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provide a grouping of calendar properties that describe a to-do.",
   :rdfs/label "To-do",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :cal/exrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/trigger,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/relatedTo,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/priority,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/exdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/class,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/created,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/rdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/percentComplete,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/due,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/uid,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/sequence,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/status,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/attendee,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/categories,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/completed,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/attach,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/dtstart,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/location,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/summary,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/resources,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/recurrenceId,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/dtstamp,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/comment,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/contact,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/duration,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/lastModified,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/rrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/requestStatus,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/organizer,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :cal/geo,
                       :rdf/type           :owl/Restriction}}})

(def X-
  "\n\t    value type: TEXT"
  {:db/ident :cal/X-,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This class of property provides a framework for defining non-standard properties."},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def action
  "\n\t    value type: TEXT"
  {:db/ident :cal/action,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the action to be invoked when an alarm is triggered."},
   :rdfs/domain {:owl/unionOf [:cal/Valarm :cal/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def altrep
  "To specify an alternate text representation for the property value."
  {:db/ident :cal/altrep,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify an alternate text representation for the property value."})

(def attach
  "\n\t    default value type: URI"
  {:db/ident :cal/attach,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    default value type: URI"
     "The property provides the capability to associate a document object with a calendar component."},
   :rdfs/domain {:owl/unionOf [:cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Valarm
                               :cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Valarm],
                 :rdf/type    :owl/Class},
   :spec/valueType "URI"})

(def attendee
  "\n\t    value type: CAL-ADDRESS"
  {:db/ident :cal/attendee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: CAL-ADDRESS"
     "The property defines an \"Attendee\" within a calendar component."},
   :rdfs/domain {:owl/unionOf [:cal/Valarm
                               :cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Vfreebusy
                               :cal/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label "attendee",
   :rdfs/range :cal/Value_CAL-ADDRESS,
   :spec/valueType "CAL-ADDRESS"})

(def byday
  "BYDAY"
  {:db/ident   :cal/byday,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "BYDAY"})

(def byhour
  "BYHOUR"
  {:db/ident   :cal/byhour,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "BYHOUR"})

(def byminute
  "BYMINUTE"
  {:db/ident   :cal/byminute,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "BYMINUTE"})

(def bymonth
  "BYMONTH"
  {:db/ident   :cal/bymonth,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "BYMONTH"})

(def bysecond
  "BYSECOND"
  {:db/ident   :cal/bysecond,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "BYSECOND"})

(def bysetpos
  "BYSETPOS"
  {:db/ident   :cal/bysetpos,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "BYSETPOS"})

(def byweekno
  "BYWEEKNO"
  {:db/ident   :cal/byweekno,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "BYWEEKNO"})

(def byyearday
  "BYYEARDAY"
  {:db/ident   :cal/byyearday,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "BYYEARDAY"})

(def calAddress
  {:db/ident :cal/calAddress,
   :rdf/type :owl/ObjectProperty})

(def calscale
  "\n\t    value type: TEXT"
  {:db/ident :cal/calscale,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the calendar scale used for the calendar information specified in the iCalendar object."},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def categories
  "\n\t    value type: TEXT"
  {:db/ident :cal/categories,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the categories for a calendar component."},
   :rdfs/domain
   {:owl/unionOf
    [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vevent :cal/Vtodo :cal/Vjournal],
    :rdf/type :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def class
  "\n\t    value type: TEXT"
  {:db/ident :cal/class,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the access classification for a calendar component."},
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def cn
  "To specify the common name to be associated with the calendar user specified by the property."
  {:db/ident :cal/cn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the common name to be associated with the calendar user specified by the property."})

(def comment
  "\n\t    value type: TEXT"
  {:db/ident :cal/comment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property specifies non-processing information intended to provide a comment to the calendar user."},
   :rdfs/domain
   {:owl/unionOf
    [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vtimezone :cal/Vfreebusy],
    :rdf/type :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def completed
  "\n\t    value type: DATE-TIME"
  {:db/ident :cal/completed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: DATE-TIME"
     "This property defines the date and time that a to-do was actually completed."},
   :rdfs/domain :cal/Vtodo,
   :rdfs/range :cal/Value_DATE-TIME,
   :spec/valueType "DATE-TIME"})

(def component
  {:db/ident :cal/component,
   :rdf/type :owl/ObjectProperty})

(def contact
  "The property is used to represent contact information or alternately a reference to contact information associated with the calendar component."
  {:db/ident :cal/contact,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"The property is used to represent contact information or alternately a reference to contact information associated with the calendar component."
     "\n\t    value type: TEXT"},
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def count
  "COUNT"
  {:db/ident   :cal/count,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "COUNT"})

(def created
  "This property specifies the date and time that the calendar information was created by the calendar user agent in the calendar store. Note: This is analogous to the creation date and time for a file in the file system."
  {:db/ident :cal/created,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"This property specifies the date and time that the calendar information was created by the calendar user agent in the calendar store. Note: This is analogous to the creation date and time for a file in the file system."
     "\n\t    value type: DATE-TIME"},
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_DATE-TIME,
   :spec/valueType "DATE-TIME"})

(def cutype
  "To specify the type of calendar user specified by the property."
  {:db/ident :cal/cutype,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the type of calendar user specified by the property."})

(def dateTime
  {:db/ident :cal/dateTime,
   :rdf/type :rdfs/Datatype})

(def daylight
  "DAYLIGHT"
  {:db/ident   :cal/daylight,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "DAYLIGHT"})

(def delegatedFrom
  "To specify the calendar users that have delegated their participation to the calendar user specified by the property."
  {:db/ident :cal/delegatedFrom,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the calendar users that have delegated their participation to the calendar user specified by the property."})

(def delegatedTo
  "To specify the calendar users to whom the calendar user specified by the property has delegated participation."
  {:db/ident :cal/delegatedTo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the calendar users to whom the calendar user specified by the property has delegated participation."})

(def description
  "\n\t    value type: TEXT"
  {:db/ident :cal/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property provides a more complete description of the calendar component, than that provided by the \"SUMMARY\" property."},
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
   :spec/valueType "TEXT"})

(def dir
  "To specify reference to a directory entry associated with the calendar user specified by the property."
  {:db/ident :cal/dir,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify reference to a directory entry associated with the calendar user specified by the property."})

(def dtend
  "\n\t    default value type: DATE-TIME"
  {:db/ident :cal/dtend,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    default value type: DATE-TIME"
     "This property specifies the date and time that a calendar component ends."},
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vfreebusy :cal/Vevent :cal/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label "end",
   :spec/valueType "DATE-TIME"})

(def dtstamp
  "\n\t    value type: DATE-TIME"
  {:db/ident :cal/dtstamp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: DATE-TIME"
     "The property indicates the date/time that the instance of the iCalendar object was created."},
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_DATE-TIME,
   :spec/valueType "DATE-TIME"})

(def dtstart
  "\n\t    default value type: DATE-TIME"
  {:db/ident :cal/dtstart,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    default value type: DATE-TIME"
     "This property specifies when the calendar component begins."},
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
   :rdfs/label "start",
   :spec/valueType "DATE-TIME"})

(def due
  "\n\t    default value type: DATE-TIME"
  {:db/ident :cal/due,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    default value type: DATE-TIME"
     "This property defines the date and time that a to-do is expected to be completed."},
   :rdfs/domain :cal/Vtodo,
   :spec/valueType "DATE-TIME"})

(def duration
  "The property specifies a positive duration of time."
  {:db/ident       :cal/duration,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #{"The property specifies a positive duration of time."
                     "\n\t    value type: DURATION"},
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
   :spec/valueType "DURATION"})

(def encoding
  "To specify an alternate inline encoding for the property value."
  {:db/ident :cal/encoding,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify an alternate inline encoding for the property value."})

(def exdate
  "\n\t    default value type: DATE-TIME"
  {:db/ident :cal/exdate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    default value type: DATE-TIME"
     "This property defines the list of date/time exceptions for a recurring calendar component."},
   :rdfs/domain :cal/DomainOf_rrule,
   :spec/valueType "DATE-TIME"})

(def exrule
  "\n\t    value type: RECUR"
  {:db/ident :cal/exrule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: RECUR"
     "This property defines a rule or repeating pattern for an exception to a recurrence set."},
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_RECUR,
   :spec/valueType "RECUR"})

(def fbtype
  "To specify the free or busy time type."
  {:db/ident     :cal/fbtype,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "To specify the free or busy time type."})

(def fmttype
  "To specify the content type of a referenced object."
  {:db/ident     :cal/fmttype,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "To specify the content type of a referenced object."})

(def freebusy
  "\n\t    value type: PERIOD"
  {:db/ident :cal/freebusy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: PERIOD"
     "The property defines one or more free or busy time intervals."},
   :rdfs/domain {:owl/unionOf [:cal/Vfreebusy :cal/Vfreebusy],
                 :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_PERIOD,
   :spec/valueType "PERIOD"})

(def freq
  "FREQ"
  {:db/ident   :cal/freq,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "FREQ"})

(def geo
  "This property specifies information related to the global position for the activity specified by a calendar component."
  {:db/ident :cal/geo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"This property specifies information related to the global position for the activity specified by a calendar component."
     "\n\t    value type: list of FLOAT"},
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/range :cal/List_of_Float,
   :spec/valueListType "FLOAT"})

(def interval
  "INTERVAL"
  {:db/ident   :cal/interval,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "INTERVAL"})

(def language
  "To specify the language for text values in a property or property parameter."
  {:db/ident :cal/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the language for text values in a property or property parameter."})

(def lastModified
  "\n\t    value type: DATE-TIME"
  {:db/ident :cal/lastModified,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: DATE-TIME"
     "The property specifies the date and time that the information associated with the calendar component was last revised in the calendar store. Note: This is analogous to the modification date and time for a file in the file system."},
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vtimezone],
    :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_DATE-TIME,
   :spec/valueType "DATE-TIME"})

(def location
  "\n\t    value type: TEXT"
  {:db/ident :cal/location,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "The property defines the intended venue for the activity defined by a calendar component."},
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/label "location",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def member
  "To specify the group or list membership of the calendar user specified by the property."
  {:db/ident :cal/member,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the group or list membership of the calendar user specified by the property."})

(def method
  "This property defines the iCalendar object method associated with the calendar object."
  {:db/ident :cal/method,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"This property defines the iCalendar object method associated with the calendar object."
     "\n\t    value type: TEXT"},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def organizer
  "\n\t    value type: CAL-ADDRESS"
  {:db/ident :cal/organizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: CAL-ADDRESS"
     "The property defines the organizer for a calendar component."},
   :rdfs/domain
   {:owl/unionOf
    [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vfreebusy :cal/Vfreebusy],
    :rdf/type :owl/Class},
   :rdfs/range :cal/Value_CAL-ADDRESS,
   :spec/valueType "CAL-ADDRESS"})

(def partstat
  "To specify the participation status for the calendar user specified by the property."
  {:db/ident :cal/partstat,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the participation status for the calendar user specified by the property."})

(def percentComplete
  "\n\t    value type: INTEGER"
  {:db/ident :cal/percentComplete,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: INTEGER"
     "This property is used by an assignee or delegatee of a to-do to convey the percent completion of a to-do to the Organizer."},
   :rdfs/domain :cal/Vtodo,
   :rdfs/range :xsd/integer,
   :spec/valueType "INTEGER"})

(def priority
  "\n\t    value type: INTEGER"
  {:db/ident :cal/priority,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: INTEGER"
     "The property defines the relative priority for a calendar component."},
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vevent :cal/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/integer,
   :spec/valueType "INTEGER"})

(def prodid
  "\n\t    value type: TEXT"
  {:db/ident :cal/prodid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property specifies the identifier for the product that created the iCalendar object."},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def range
  "To specify the effective range of recurrence instances from the instance specified by the recurrence identifier specified by the property."
  {:db/ident :cal/range,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the effective range of recurrence instances from the instance specified by the recurrence identifier specified by the property."})

(def rdate
  "\n\t    default value type: DATE-TIME"
  {:db/ident :cal/rdate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    default value type: DATE-TIME"
     "This property defines the list of date/times for a recurrence set."},
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vtimezone],
    :rdf/type    :owl/Class},
   :spec/valueType "DATE-TIME"})

(def recurrenceId
  "This property is used in conjunction with the \"UID\" and \"SEQUENCE\" property to identify a specific instance of a recurring \"VEVENT\", \"VTODO\" or \"VJOURNAL\" calendar component. The property value is the effective value of the \"DTSTART\" property of the recurrence instance."
  {:db/ident :cal/recurrenceId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"This property is used in conjunction with the \"UID\" and \"SEQUENCE\" property to identify a specific instance of a recurring \"VEVENT\", \"VTODO\" or \"VJOURNAL\" calendar component. The property value is the effective value of the \"DTSTART\" property of the recurrence instance."
     "\n\t    default value type: DATE-TIME"},
   :rdfs/domain :cal/DomainOf_rrule,
   :spec/valueType "DATE-TIME"})

(def related
  "To specify the relationship of the alarm trigger with respect to the start or end of the calendar component."
  {:db/ident :cal/related,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the relationship of the alarm trigger with respect to the start or end of the calendar component."})

(def relatedTo
  "\n\t    value type: TEXT"
  {:db/ident :cal/relatedTo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "The property is used to represent a relationship or reference between one calendar component and another."},
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def reltype
  "To specify the type of hierarchical relationship associated with the calendar component specified by the property."
  {:db/ident :cal/reltype,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the type of hierarchical relationship associated with the calendar component specified by the property."})

(def repeat
  "\n\t    value type: INTEGER"
  {:db/ident :cal/repeat,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: INTEGER"
     "This property defines the number of time the alarm should be repeated, after the initial trigger."},
   :rdfs/domain :cal/Valarm,
   :rdfs/range :xsd/integer,
   :spec/valueType "INTEGER"})

(def requestStatus
  "\n\t    value type: TEXT"
  {:db/ident :cal/requestStatus,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the status code returned for a scheduling request."},
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def resources
  "\n\t    value type: TEXT"
  {:db/ident :cal/resources,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the equipment or resources anticipated for an activity specified by a calendar entity.."},
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def role
  "To specify the participation role for the calendar user specified by the property."
  {:db/ident :cal/role,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the participation role for the calendar user specified by the property."})

(def rrule
  "\n\t    value type: RECUR"
  {:db/ident :cal/rrule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: RECUR"
     "This property defines a rule or repeating pattern for recurring events, to-dos, or time zone definitions."},
   :rdfs/domain {:owl/unionOf [:cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Vtimezone
                               :cal/Vtimezone
                               :cal/Vtimezone
                               :cal/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/range :cal/Value_RECUR,
   :spec/valueType "RECUR"})

(def rsvp
  "To specify whether there is an expectation of a favor of a reply from the calendar user specified by the property value."
  {:db/ident :cal/rsvp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify whether there is an expectation of a favor of a reply from the calendar user specified by the property value."})

(def sentBy
  "To specify the calendar user that is acting on behalf of the calendar user specified by the property."
  {:db/ident :cal/sentBy,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "To specify the calendar user that is acting on behalf of the calendar user specified by the property."})

(def sequence
  "This property defines the revision sequence number of the calendar component within a sequence of revisions."
  {:db/ident :cal/sequence,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"This property defines the revision sequence number of the calendar component within a sequence of revisions."
     "\n\t    value type: integer"},
   :rdfs/domain {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/integer,
   :spec/valueType "integer"})

(def standard
  "STANDARD"
  {:db/ident   :cal/standard,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "STANDARD"})

(def status
  "\n\t    value type: TEXT"
  {:db/ident :cal/status,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the overall status or confirmation for the calendar component."},
   :rdfs/domain
   {:owl/unionOf
    [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vevent :cal/Vtodo :cal/Vjournal],
    :rdf/type :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def summary
  "\n\t    value type: TEXT"
  {:db/ident :cal/summary,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines a short summary or subject for the calendar component."},
   :rdfs/domain {:owl/unionOf [:cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Valarm
                               :cal/Vevent
                               :cal/Vtodo
                               :cal/Vjournal
                               :cal/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label "summary",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :rdfs/label,
   :spec/valueType "TEXT"})

(def transp
  "\n\t    value type: TEXT"
  {:db/ident :cal/transp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines whether an event is transparent or not to busy time searches."},
   :rdfs/domain :cal/Vevent,
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def trigger
  "\n\t    default value type: DURATION"
  {:db/ident       :cal/trigger,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #{"\n\t    default value type: DURATION"
                     "This property specifies when an alarm will trigger."},
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
   :spec/valueType "DURATION"})

(def tzid
  "To specify the identifier for the time zone definition for a time component in the property value."
  {:db/ident :cal/tzid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"To specify the identifier for the time zone definition for a time component in the property value."
     "\n\t    value type: TEXT"
     "This property specifies the text value that uniquely identifies the \"VTIMEZONE\" calendar component."},
   :rdfs/domain :cal/Vtimezone,
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def tzname
  "\n\t    value type: TEXT"
  {:db/ident :cal/tzname,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property specifies the customary designation for a time zone description."},
   :rdfs/domain :cal/Vtimezone,
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def tzoffsetfrom
  "\n\t    value type: UTC-OFFSET"
  {:db/ident :cal/tzoffsetfrom,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: UTC-OFFSET"
     "This property specifies the offset which is in use prior to this time zone observance."},
   :rdfs/domain {:owl/unionOf [:cal/Vtimezone :cal/Vtimezone :cal/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :spec/valueType "UTC-OFFSET"})

(def tzoffsetto
  "\n\t    value type: UTC-OFFSET"
  {:db/ident :cal/tzoffsetto,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: UTC-OFFSET"
     "This property specifies the offset which is in use in this time zone observance."},
   :rdfs/domain :cal/Vtimezone,
   :rdfs/range :xsd/string,
   :spec/valueType "UTC-OFFSET"})

(def tzurl
  "The TZURL provides a means for a VTIMEZONE component to point to a network location that can be used to retrieve an up-to- date version of itself."
  {:db/ident :cal/tzurl,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"The TZURL provides a means for a VTIMEZONE component to point to a network location that can be used to retrieve an up-to- date version of itself."
     "\n\t    value type: URI"},
   :rdfs/domain {:owl/unionOf [:cal/Vtimezone :cal/Vtimezone :cal/Vtimezone],
                 :rdf/type    :owl/Class},
   :spec/valueType "URI"})

(def uid
  "\n\t    value type: TEXT"
  {:db/ident :cal/uid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the persistent, globally unique identifier for the calendar component."},
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
   :spec/valueType "TEXT"})

(def until
  "UNTIL"
  {:db/ident   :cal/until,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "UNTIL"})

(def url
  "This property defines a Uniform Resource Locator (URL) associated with the iCalendar object."
  {:db/ident :cal/url,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"This property defines a Uniform Resource Locator (URL) associated with the iCalendar object."
     "\n\t    value type: URI"},
   :rdfs/domain
   {:owl/unionOf [:cal/Vevent :cal/Vtodo :cal/Vjournal :cal/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label "see also",
   :spec/valueType "URI"})

(def version
  "\n\t    value type: TEXT"
  {:db/ident :cal/version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property specifies the identifier corresponding to the highest version number or the minimum and maximum range of the iCalendar specification that is required in order to interpret the iCalendar object."},
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def wkst
  "WKST"
  {:db/ident   :cal/wkst,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "WKST"})