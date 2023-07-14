(ns net.wikipunk.rdf.spec
  {:owl/minCardinality #xsd/integer 0,
   :owl/onProperty     :spec/class,
   :rdf/ns-prefix-map  {"cal"  "http://www.w3.org/2002/12/cal/icaltzd#",
                        "dc11" "http://purl.org/dc/elements/1.1/",
                        "owl"  "http://www.w3.org/2002/07/owl#",
                        "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                        "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                        "spec" "http://www.w3.org/2002/12/cal/icalSpec#",
                        "xhv"  "http://www.w3.org/1999/xhtml",
                        "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type           :owl/Restriction,
   :rdfa/prefix        "spec",
   :rdfa/uri           "8ee072e3355cfaf56f2515108a0e19af"}
  (:refer-clojure :exclude [class comment repeat sequence]))

(def Valarm
  "Provide a grouping of component properties that define an alarm."
  {:db/ident :spec/Valarm,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of component properties that define an alarm.",
   :rdfs/label #xsd/string "VALARM",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/duration,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/summary,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/trigger,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/repeat,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/action,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/attendee,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/attach,
                      :rdf/type           :owl/Restriction}]})

(def Value_CAL-ADDRESS
  {:db/ident :spec/Value_CAL-ADDRESS,
   :rdf/type :owl/Class})

(def Value_DATE
  {:db/ident :spec/Value_DATE,
   :rdf/type :owl/Class})

(def Value_DATE-TIME
  {:db/ident :spec/Value_DATE-TIME,
   :rdf/type :owl/Class})

(def Value_DURATION
  {:db/ident :spec/Value_DURATION,
   :rdf/type :owl/Class})

(def Value_PERIOD
  {:db/ident :spec/Value_PERIOD,
   :rdf/type :owl/Class})

(def Value_RECUR
  {:db/ident :spec/Value_RECUR,
   :rdf/type :owl/Class})

(def Vevent
  "Provide a grouping of component properties that describe an event."
  {:db/ident :spec/Vevent,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of component properties that describe an event.",
   :rdfs/label #xsd/string "VEVENT",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/lastModified,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/exrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/status,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/class,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/rdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/priority,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/trigger,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/organizer,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/duration,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/contact,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/categories,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/requestStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/uid,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/summary,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/attendee,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/relatedTo,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/sequence,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/transp,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/created,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/dtstart,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/url,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/location,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/dtend,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/dtstamp,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/rrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/geo,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/attach,
                      :rdf/type           :owl/Restriction}]})

(def Vfreebusy
  "Provide a grouping of component properties that describe either a request for free/busy time, describe a response to a request for free/busy time or describe a published set of busy time."
  {:db/ident :spec/Vfreebusy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of component properties that describe either a request for free/busy time, describe a response to a request for free/busy time or describe a published set of busy time.",
   :rdfs/label #xsd/string "VFREEBUSY",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/uid,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/dtend,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/organizer,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/dtstart,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/url,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/dtstamp,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/attendee,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/requestStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/contact,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/freebusy,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/duration,
                      :rdf/type           :owl/Restriction}]})

(def Vjournal
  "Provide a grouping of component properties that describe a journal entry."
  {:db/ident :spec/Vjournal,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of component properties that describe a journal entry.",
   :rdfs/label #xsd/string "VJOURNAL",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/attach,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/sequence,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/relatedTo,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/status,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/rdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/lastModified,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/contact,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/class,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/organizer,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/created,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/url,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/requestStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/attendee,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/categories,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/exrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/summary,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/rrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/dtstamp,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/uid,
                      :rdf/type           :owl/Restriction}]})

(def Vtimezone
  "Provide a grouping of component properties that defines a time zone."
  {:db/ident :spec/Vtimezone,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of component properties that defines a time zone.",
   :rdfs/label #xsd/string "VTIMEZONE",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/tzoffsetfrom,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/lastModified,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/tzid,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/dtstart,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/rrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/tzname,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/tzurl,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/rdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/tzoffsetto,
                      :rdf/type           :owl/Restriction}]})

(def Vtodo
  "Provide a grouping of calendar properties that describe a to-do."
  {:db/ident :spec/Vtodo,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Provide a grouping of calendar properties that describe a to-do.",
   :rdfs/label #xsd/string "VTODO",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/location,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/dtstamp,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/categories,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/attendee,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/due,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/lastModified,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/uid,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/status,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/created,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/organizer,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/relatedTo,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/trigger,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/duration,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/rrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/sequence,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/geo,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/completed,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/contact,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/exrule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/priority,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/percentComplete,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/class,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/rdate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/url,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/attach,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/requestStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/summary,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality #xsd/integer 0,
                      :owl/onProperty     :spec/dtstart,
                      :rdf/type           :owl/Restriction}]})

(def X-
  "Any property name with a \"X-\" prefix"
  {:db/ident :spec/X-,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This class of property provides a framework for defining non-standard properties."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/label #xsd/string "Any property name with a \"X-\" prefix",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def action
  "ACTION"
  {:db/ident :spec/action,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the action to be invoked when an alarm is triggered."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain {:owl/unionOf [:spec/Valarm :spec/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "ACTION",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def attach
  "ATTACH"
  {:db/ident :spec/attach,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "The property provides the capability to associate a document object with a calendar component."
    #xsd/string "\n\t    default value type: URI"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Valarm
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "ATTACH",
   :spec/valueType #xsd/string "URI"})

(def attendee
  "ATTENDEE"
  {:db/ident :spec/attendee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "The property defines an \"Attendee\" within a calendar component."
    #xsd/string "\n\t    value type: CAL-ADDRESS"],
   :rdfs/domain {:owl/unionOf [:spec/Valarm
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Vfreebusy
                               :spec/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "ATTENDEE",
   :rdfs/range :spec/Value_CAL-ADDRESS,
   :spec/valueType #xsd/string "CAL-ADDRESS"})

(def calscale
  "CALSCALE"
  {:db/ident :spec/calscale,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the calendar scale used for the calendar information specified in the iCalendar object."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/label #xsd/string "CALSCALE",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def categories
  "CATEGORIES"
  {:db/ident :spec/categories,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string "This property defines the categories for a calendar component."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "CATEGORIES",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def class
  "CLASS"
  {:db/ident :spec/class,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the access classification for a calendar component."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "CLASS",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def comment
  "COMMENT"
  {:db/ident :spec/comment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property specifies non-processing information intended to provide a comment to the calendar user."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain
   {:owl/unionOf
    [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vtimezone :spec/Vfreebusy],
    :rdf/type :owl/Class},
   :rdfs/label #xsd/string "COMMENT",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def completed
  "COMPLETED"
  {:db/ident :spec/completed,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the date and time that a to-do was actually completed."
    #xsd/string "\n\t    value type: DATE-TIME"],
   :rdfs/domain :spec/Vtodo,
   :rdfs/label #xsd/string "COMPLETED",
   :rdfs/range :spec/Value_DATE-TIME,
   :spec/valueType #xsd/string "DATE-TIME"})

(def contact
  "CONTACT"
  {:db/ident :spec/contact,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property is used to represent contact information or alternately a reference to contact information associated with the calendar component."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "CONTACT",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def created
  "CREATED"
  {:db/ident :spec/created,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "This property specifies the date and time that the calendar information was created by the calendar user agent in the calendar store. Note: This is analogous to the creation date and time for a file in the file system."
    #xsd/string "\n\t    value type: DATE-TIME"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "CREATED",
   :rdfs/range :spec/Value_DATE-TIME,
   :spec/valueType #xsd/string "DATE-TIME"})

(def description
  "DESCRIPTION"
  {:db/ident :spec/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property provides a more complete description of the calendar component, than that provided by the \"SUMMARY\" property."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Valarm
                               :spec/Vjournal
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "DESCRIPTION",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def dtend
  "DTEND"
  {:db/ident :spec/dtend,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "This property specifies the date and time that a calendar component ends."
    #xsd/string "\n\t    default value type: DATE-TIME"],
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vfreebusy :spec/Vevent :spec/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "DTEND",
   :rdfs/range {:owl/unionOf [:spec/Value_DATE-TIME :spec/Value_DATE],
                :rdf/type    :owl/Class},
   :spec/valueType #xsd/string "DATE-TIME"})

(def dtstamp
  "DTSTAMP"
  {:db/ident :spec/dtstamp,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "The property indicates the date/time that the instance of the iCalendar object was created."
    #xsd/string "\n\t    value type: DATE-TIME"],
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "DTSTAMP",
   :rdfs/range :spec/Value_DATE-TIME,
   :spec/valueType #xsd/string "DATE-TIME"})

(def dtstart
  "DTSTART"
  {:db/ident :spec/dtstart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment [#xsd/string
                   "This property specifies when the calendar component begins."
                  #xsd/string "\n\t    default value type: DATE-TIME"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vfreebusy
                               :spec/Vtimezone
                               :spec/Vevent
                               :spec/Vevent
                               :spec/Vfreebusy
                               :spec/Vtimezone
                               :spec/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "DTSTART",
   :rdfs/range
   {:owl/unionOf [:spec/Value_DATE-TIME :spec/Value_DATE :spec/Value_DATE],
    :rdf/type    :owl/Class},
   :spec/valueType #xsd/string "DATE-TIME"})

(def due
  "DUE"
  {:db/ident :spec/due,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the date and time that a to-do is expected to be completed."
    #xsd/string "\n\t    default value type: DATE-TIME"],
   :rdfs/domain :spec/Vtodo,
   :rdfs/label #xsd/string "DUE",
   :rdfs/range {:owl/unionOf [:spec/Value_DATE-TIME :spec/Value_DATE],
                :rdf/type    :owl/Class},
   :spec/valueType #xsd/string "DATE-TIME"})

(def duration
  "DURATION"
  {:db/ident       :spec/duration,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   [#xsd/string
                     "The property specifies a positive duration of time."
                    #xsd/string "\n\t    value type: DURATION"],
   :rdfs/domain    {:owl/unionOf [:spec/Vevent
                                  :spec/Vtodo
                                  :spec/Vfreebusy
                                  :spec/Valarm
                                  :spec/Vevent
                                  :spec/Vtodo
                                  :spec/Vfreebusy
                                  :spec/Valarm],
                    :rdf/type    :owl/Class},
   :rdfs/label     #xsd/string "DURATION",
   :rdfs/range     :spec/Value_DURATION,
   :spec/valueType #xsd/string "DURATION"})

(def exdate
  "EXDATE"
  {:db/ident :spec/exdate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the list of date/time exceptions for a recurring calendar component."
    #xsd/string "\n\t    default value type: DATE-TIME"],
   :rdfs/label #xsd/string "EXDATE",
   :rdfs/range {:owl/unionOf [:spec/Value_DATE-TIME :spec/Value_DATE],
                :rdf/type    :owl/Class},
   :spec/valueType #xsd/string "DATE-TIME"})

(def exrule
  "EXRULE"
  {:db/ident :spec/exrule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines a rule or repeating pattern for an exception to a recurrence set."
    #xsd/string "\n\t    value type: RECUR"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "EXRULE",
   :rdfs/range :spec/Value_RECUR,
   :spec/valueType #xsd/string "RECUR"})

(def freebusy
  "FREEBUSY"
  {:db/ident :spec/freebusy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string "The property defines one or more free or busy time intervals."
    #xsd/string "\n\t    value type: PERIOD"],
   :rdfs/domain {:owl/unionOf [:spec/Vfreebusy :spec/Vfreebusy],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "FREEBUSY",
   :rdfs/range :spec/Value_PERIOD,
   :spec/valueType #xsd/string "PERIOD"})

(def geo
  "This property specifies information related to the global position for the activity specified by a calendar component."
  {:db/ident :spec/geo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "This property specifies information related to the global position for the activity specified by a calendar component.",
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "GEO"})

(def lastModified
  "LAST-MODIFIED"
  {:db/ident :spec/lastModified,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "The property specifies the date and time that the information associated with the calendar component was last revised in the calendar store. Note: This is analogous to the modification date and time for a file in the file system."
    #xsd/string "\n\t    value type: DATE-TIME"],
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vtimezone],
    :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "LAST-MODIFIED",
   :rdfs/range :spec/Value_DATE-TIME,
   :spec/valueType #xsd/string "DATE-TIME"})

(def location
  "LOCATION"
  {:db/ident :spec/location,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property defines the intended venue for the activity defined by a calendar component."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "LOCATION",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def method
  "METHOD"
  {:db/ident :spec/method,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the iCalendar object method associated with the calendar object."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/label #xsd/string "METHOD",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def organizer
  "ORGANIZER"
  {:db/ident :spec/organizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string "The property defines the organizer for a calendar component."
    #xsd/string "\n\t    value type: CAL-ADDRESS"],
   :rdfs/domain
   {:owl/unionOf
    [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vfreebusy :spec/Vfreebusy],
    :rdf/type :owl/Class},
   :rdfs/label #xsd/string "ORGANIZER",
   :rdfs/range :spec/Value_CAL-ADDRESS,
   :spec/valueType #xsd/string "CAL-ADDRESS"})

(def percentComplete
  "PERCENT-COMPLETE"
  {:db/ident :spec/percentComplete,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property is used by an assignee or delegatee of a to-do to convey the percent completion of a to-do to the Organizer."
    #xsd/string "\n\t    value type: INTEGER"],
   :rdfs/domain :spec/Vtodo,
   :rdfs/label #xsd/string "PERCENT-COMPLETE",
   :rdfs/range :xsd/integer,
   :spec/valueType #xsd/string "INTEGER"})

(def priority
  "PRIORITY"
  {:db/ident :spec/priority,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property defines the relative priority for a calendar component."
    #xsd/string "\n\t    value type: INTEGER"],
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vevent :spec/Vtodo],
    :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "PRIORITY",
   :rdfs/range :xsd/integer,
   :spec/valueType #xsd/string "INTEGER"})

(def prodid
  "PRODID"
  {:db/ident :spec/prodid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property specifies the identifier for the product that created the iCalendar object."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/label #xsd/string "PRODID",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def rdate
  "RDATE"
  {:db/ident :spec/rdate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the list of date/times for a recurrence set."
    #xsd/string "\n\t    default value type: DATE-TIME"],
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vtimezone],
    :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "RDATE",
   :rdfs/range
   {:owl/unionOf [:spec/Value_DATE-TIME :spec/Value_DATE :spec/Value_PERIOD],
    :rdf/type    :owl/Class},
   :spec/valueType #xsd/string "DATE-TIME"})

(def recurrenceId
  "RECURRENCE-ID"
  {:db/ident :spec/recurrenceId,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "This property is used in conjunction with the \"UID\" and \"SEQUENCE\" property to identify a specific instance of a recurring \"VEVENT\", \"VTODO\" or \"VJOURNAL\" calendar component. The property value is the effective value of the \"DTSTART\" property of the recurrence instance."
    #xsd/string "\n\t    default value type: DATE-TIME"],
   :rdfs/label #xsd/string "RECURRENCE-ID",
   :rdfs/range {:owl/unionOf [:spec/Value_DATE-TIME
                              :spec/Value_DATE
                              :spec/Value_DATE
                              :spec/Value_DATE],
                :rdf/type    :owl/Class},
   :spec/valueType #xsd/string "DATE-TIME"})

(def relatedTo
  "RELATED-TO"
  {:db/ident :spec/relatedTo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property is used to represent a relationship or reference between one calendar component and another."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "RELATED-TO",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def repeat
  "REPEAT"
  {:db/ident :spec/repeat,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the number of time the alarm should be repeated, after the initial trigger."
    #xsd/string "\n\t    value type: INTEGER"],
   :rdfs/domain :spec/Valarm,
   :rdfs/label #xsd/string "REPEAT",
   :rdfs/range :xsd/integer,
   :spec/valueType #xsd/string "INTEGER"})

(def requestStatus
  "REQUEST-STATUS"
  {:db/ident :spec/requestStatus,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the status code returned for a scheduling request."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "REQUEST-STATUS",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def resources
  "RESOURCES"
  {:db/ident :spec/resources,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the equipment or resources anticipated for an activity specified by a calendar entity.."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "RESOURCES",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def rrule
  "RRULE"
  {:db/ident :spec/rrule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines a rule or repeating pattern for recurring events, to-dos, or time zone definitions."
    #xsd/string "\n\t    value type: RECUR"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Vtimezone
                               :spec/Vtimezone
                               :spec/Vtimezone
                               :spec/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "RRULE",
   :rdfs/range :spec/Value_RECUR,
   :spec/valueType #xsd/string "RECUR"})

(def sequence
  "SEQUENCE"
  {:db/ident :spec/sequence,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the revision sequence number of the calendar component within a sequence of revisions."
    #xsd/string "\n\t    value type: integer"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "SEQUENCE",
   :rdfs/range :xsd/integer,
   :spec/valueType #xsd/string "integer"})

(def status
  "STATUS"
  {:db/ident :spec/status,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the overall status or confirmation for the calendar component."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "STATUS",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def summary
  "SUMMARY"
  {:db/ident :spec/summary,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines a short summary or subject for the calendar component."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Valarm
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "SUMMARY",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def transp
  "TRANSP"
  {:db/ident :spec/transp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines whether an event is transparent or not to busy time searches."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain :spec/Vevent,
   :rdfs/label #xsd/string "TRANSP",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def trigger
  "TRIGGER"
  {:db/ident       :spec/trigger,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   [#xsd/string
                     "This property specifies when an alarm will trigger."
                    #xsd/string "\n\t    default value type: DURATION"],
   :rdfs/domain    {:owl/unionOf [:spec/Valarm
                                  :spec/Valarm
                                  :spec/Vevent
                                  :spec/Vtodo
                                  :spec/Vevent
                                  :spec/Vtodo],
                    :rdf/type    :owl/Class},
   :rdfs/label     #xsd/string "TRIGGER",
   :rdfs/range     {:owl/unionOf [:spec/Value_DURATION
                                  :spec/Value_DATE
                                  :spec/Value_DATE],
                    :rdf/type    :owl/Class},
   :spec/valueType #xsd/string "DURATION"})

(def tzid
  "TZID"
  {:db/ident :spec/tzid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property specifies the text value that uniquely identifies the \"VTIMEZONE\" calendar component."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain :spec/Vtimezone,
   :rdfs/label #xsd/string "TZID",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def tzname
  "TZNAME"
  {:db/ident :spec/tzname,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property specifies the customary designation for a time zone description."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain :spec/Vtimezone,
   :rdfs/label #xsd/string "TZNAME",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def tzoffsetfrom
  "TZOFFSETFROM"
  {:db/ident :spec/tzoffsetfrom,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property specifies the offset which is in use prior to this time zone observance."
    #xsd/string "\n\t    value type: UTC-OFFSET"],
   :rdfs/domain {:owl/unionOf [:spec/Vtimezone :spec/Vtimezone :spec/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "TZOFFSETFROM",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "UTC-OFFSET"})

(def tzoffsetto
  "TZOFFSETTO"
  {:db/ident :spec/tzoffsetto,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property specifies the offset which is in use in this time zone observance."
    #xsd/string "\n\t    value type: UTC-OFFSET"],
   :rdfs/domain :spec/Vtimezone,
   :rdfs/label #xsd/string "TZOFFSETTO",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "UTC-OFFSET"})

(def tzurl
  "TZURL"
  {:db/ident :spec/tzurl,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "The TZURL provides a means for a VTIMEZONE component to point to a network location that can be used to retrieve an up-to- date version of itself."
    #xsd/string "\n\t    value type: URI"],
   :rdfs/domain {:owl/unionOf [:spec/Vtimezone :spec/Vtimezone :spec/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "TZURL",
   :spec/valueType #xsd/string "URI"})

(def uid
  "UID"
  {:db/ident :spec/uid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines the persistent, globally unique identifier for the calendar component."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Vfreebusy
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "UID",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})

(def url
  "URL"
  {:db/ident :spec/url,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "This property defines a Uniform Resource Locator (URL) associated with the iCalendar object."
    #xsd/string "\n\t    value type: URI"],
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label #xsd/string "URL",
   :spec/valueType #xsd/string "URI"})

(def version
  "VERSION"
  {:db/ident :spec/version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "This property specifies the identifier corresponding to the highest version number or the minimum and maximum range of the iCalendar specification that is required in order to interpret the iCalendar object."
    #xsd/string "\n\t    value type: TEXT"],
   :rdfs/label #xsd/string "VERSION",
   :rdfs/range :xsd/string,
   :spec/valueType #xsd/string "TEXT"})