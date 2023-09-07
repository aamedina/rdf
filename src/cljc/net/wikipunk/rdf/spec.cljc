(ns net.wikipunk.rdf.spec
  ^{:base       "http://www.w3.org/2002/12/cal/icalSpec#",
    :namespaces {"cal"  "http://www.w3.org/2002/12/cal/icaltzd#",
                 "dc11" "http://purl.org/dc/elements/1.1/",
                 "owl"  "http://www.w3.org/2002/07/owl#",
                 "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "spec" "http://www.w3.org/2002/12/cal/icalSpec#",
                 "xhv"  "http://www.w3.org/1999/xhtml",
                 "xsd"  "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "spec",
    :source     "http://www.w3.org/2002/12/cal/icalSpec#"}
  {:rdf/type :owl/Ontology}
  (:refer-clojure :exclude [class comment repeat sequence]))

(def Valarm
  {:db/ident :spec/Valarm,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provide a grouping of component properties that define an alarm.",
   :rdfs/label "VALARM",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :spec/summary,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/repeat,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/action,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/attendee,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/attach,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/duration,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/trigger,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/description,
                       :rdf/type           :owl/Restriction}}})

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
  {:db/ident :spec/Vevent,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provide a grouping of component properties that describe an event.",
   :rdfs/label "VEVENT",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :spec/rdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/resources,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/exrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/summary,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/created,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/contact,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/requestStatus,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/geo,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/status,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/dtend,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/transp,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/comment,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/dtstart,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/attendee,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/attach,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/lastModified,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/duration,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/uid,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/trigger,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/class,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/priority,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/location,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/relatedTo,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/sequence,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/organizer,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/rrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/dtstamp,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/categories,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/description,
                       :rdf/type           :owl/Restriction}}})

(def Vfreebusy
  {:db/ident :spec/Vfreebusy,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provide a grouping of component properties that describe either a request for free/busy time, describe a response to a request for free/busy time or describe a published set of busy time.",
   :rdfs/label "VFREEBUSY",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :spec/freebusy,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/contact,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/requestStatus,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/dtend,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/comment,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/dtstart,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/attendee,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/duration,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/uid,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/organizer,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/dtstamp,
                       :rdf/type           :owl/Restriction}}})

(def Vjournal
  {:db/ident :spec/Vjournal,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provide a grouping of component properties that describe a journal entry.",
   :rdfs/label "VJOURNAL",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :spec/rdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/exrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/summary,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/created,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/contact,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/requestStatus,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/status,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/comment,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/attendee,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/attach,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/lastModified,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/uid,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/class,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/relatedTo,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/sequence,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/organizer,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/rrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/dtstamp,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/categories,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/description,
                       :rdf/type           :owl/Restriction}}})

(def Vtimezone
  {:db/ident :spec/Vtimezone,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provide a grouping of component properties that defines a time zone.",
   :rdfs/label "VTIMEZONE",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :spec/rdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/tzoffsetfrom,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/tzid,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/tzoffsetto,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/comment,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/dtstart,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/lastModified,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/tzname,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/tzurl,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/rrule,
                       :rdf/type           :owl/Restriction}}})

(def Vtodo
  {:db/ident :spec/Vtodo,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provide a grouping of calendar properties that describe a to-do.",
   :rdfs/label "VTODO",
   :rdfs/subClassOf #{{:owl/minCardinality 0,
                       :owl/onProperty     :spec/rdate,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/resources,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/exrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/summary,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/created,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/contact,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/requestStatus,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/geo,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/status,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/comment,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/dtstart,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/attendee,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/attach,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/lastModified,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/duration,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/completed,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/uid,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/trigger,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/class,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/priority,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/percentComplete,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/location,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/due,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/relatedTo,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/sequence,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/organizer,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/rrule,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/dtstamp,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/categories,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :spec/description,
                       :rdf/type           :owl/Restriction}}})

(def X-
  {:db/ident :spec/X-,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This class of property provides a framework for defining non-standard properties."},
   :rdfs/label "Any property name with a \"X-\" prefix",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def action
  {:db/ident :spec/action,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the action to be invoked when an alarm is triggered."},
   :rdfs/domain {:owl/unionOf [:spec/Valarm :spec/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label "ACTION",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def attach
  {:db/ident :spec/attach,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    default value type: URI"
     "The property provides the capability to associate a document object with a calendar component."},
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Valarm
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label "ATTACH",
   :spec/valueType "URI"})

(def attendee
  {:db/ident :spec/attendee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: CAL-ADDRESS"
     "The property defines an \"Attendee\" within a calendar component."},
   :rdfs/domain {:owl/unionOf [:spec/Valarm
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Vfreebusy
                               :spec/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label "ATTENDEE",
   :rdfs/range :spec/Value_CAL-ADDRESS,
   :spec/valueType "CAL-ADDRESS"})

(def calscale
  {:db/ident :spec/calscale,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the calendar scale used for the calendar information specified in the iCalendar object."},
   :rdfs/label "CALSCALE",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def categories
  {:db/ident :spec/categories,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the categories for a calendar component."},
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label "CATEGORIES",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def class
  {:db/ident :spec/class,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the access classification for a calendar component."},
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label "CLASS",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def comment
  {:db/ident :spec/comment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property specifies non-processing information intended to provide a comment to the calendar user."},
   :rdfs/domain
   {:owl/unionOf
    [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vtimezone :spec/Vfreebusy],
    :rdf/type :owl/Class},
   :rdfs/label "COMMENT",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def completed
  {:db/ident :spec/completed,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: DATE-TIME"
     "This property defines the date and time that a to-do was actually completed."},
   :rdfs/domain :spec/Vtodo,
   :rdfs/label "COMPLETED",
   :rdfs/range :spec/Value_DATE-TIME,
   :spec/valueType "DATE-TIME"})

(def contact
  {:db/ident :spec/contact,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"The property is used to represent contact information or alternately a reference to contact information associated with the calendar component."
     "\n\t    value type: TEXT"},
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label "CONTACT",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def created
  {:db/ident :spec/created,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"This property specifies the date and time that the calendar information was created by the calendar user agent in the calendar store. Note: This is analogous to the creation date and time for a file in the file system."
     "\n\t    value type: DATE-TIME"},
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label "CREATED",
   :rdfs/range :spec/Value_DATE-TIME,
   :spec/valueType "DATE-TIME"})

(def description
  {:db/ident :spec/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property provides a more complete description of the calendar component, than that provided by the \"SUMMARY\" property."},
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
   :rdfs/label "DESCRIPTION",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def dtend
  {:db/ident :spec/dtend,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    default value type: DATE-TIME"
     "This property specifies the date and time that a calendar component ends."},
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vfreebusy :spec/Vevent :spec/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label "DTEND",
   :rdfs/range {:owl/unionOf [:spec/Value_DATE-TIME :spec/Value_DATE],
                :rdf/type    :owl/Class},
   :spec/valueType "DATE-TIME"})

(def dtstamp
  {:db/ident :spec/dtstamp,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: DATE-TIME"
     "The property indicates the date/time that the instance of the iCalendar object was created."},
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label "DTSTAMP",
   :rdfs/range :spec/Value_DATE-TIME,
   :spec/valueType "DATE-TIME"})

(def dtstart
  {:db/ident :spec/dtstart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    default value type: DATE-TIME"
     "This property specifies when the calendar component begins."},
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
   :rdfs/label "DTSTART",
   :rdfs/range
   {:owl/unionOf [:spec/Value_DATE-TIME :spec/Value_DATE :spec/Value_DATE],
    :rdf/type    :owl/Class},
   :spec/valueType "DATE-TIME"})

(def due
  {:db/ident :spec/due,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    default value type: DATE-TIME"
     "This property defines the date and time that a to-do is expected to be completed."},
   :rdfs/domain :spec/Vtodo,
   :rdfs/label "DUE",
   :rdfs/range {:owl/unionOf [:spec/Value_DATE-TIME :spec/Value_DATE],
                :rdf/type    :owl/Class},
   :spec/valueType "DATE-TIME"})

(def duration
  {:db/ident       :spec/duration,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #{"The property specifies a positive duration of time."
                     "\n\t    value type: DURATION"},
   :rdfs/domain    {:owl/unionOf [:spec/Vevent
                                  :spec/Vtodo
                                  :spec/Vfreebusy
                                  :spec/Valarm
                                  :spec/Vevent
                                  :spec/Vtodo
                                  :spec/Vfreebusy
                                  :spec/Valarm],
                    :rdf/type    :owl/Class},
   :rdfs/label     "DURATION",
   :rdfs/range     :spec/Value_DURATION,
   :spec/valueType "DURATION"})

(def exdate
  {:db/ident :spec/exdate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    default value type: DATE-TIME"
     "This property defines the list of date/time exceptions for a recurring calendar component."},
   :rdfs/label "EXDATE",
   :rdfs/range {:owl/unionOf [:spec/Value_DATE-TIME :spec/Value_DATE],
                :rdf/type    :owl/Class},
   :spec/valueType "DATE-TIME"})

(def exrule
  {:db/ident :spec/exrule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: RECUR"
     "This property defines a rule or repeating pattern for an exception to a recurrence set."},
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label "EXRULE",
   :rdfs/range :spec/Value_RECUR,
   :spec/valueType "RECUR"})

(def freebusy
  {:db/ident :spec/freebusy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: PERIOD"
     "The property defines one or more free or busy time intervals."},
   :rdfs/domain {:owl/unionOf [:spec/Vfreebusy :spec/Vfreebusy],
                 :rdf/type    :owl/Class},
   :rdfs/label "FREEBUSY",
   :rdfs/range :spec/Value_PERIOD,
   :spec/valueType "PERIOD"})

(def geo
  {:db/ident :spec/geo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This property specifies information related to the global position for the activity specified by a calendar component.",
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/label "GEO"})

(def lastModified
  {:db/ident :spec/lastModified,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: DATE-TIME"
     "The property specifies the date and time that the information associated with the calendar component was last revised in the calendar store. Note: This is analogous to the modification date and time for a file in the file system."},
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vtimezone],
    :rdf/type    :owl/Class},
   :rdfs/label "LAST-MODIFIED",
   :rdfs/range :spec/Value_DATE-TIME,
   :spec/valueType "DATE-TIME"})

(def location
  {:db/ident :spec/location,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "The property defines the intended venue for the activity defined by a calendar component."},
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/label "LOCATION",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def method
  {:db/ident :spec/method,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"This property defines the iCalendar object method associated with the calendar object."
     "\n\t    value type: TEXT"},
   :rdfs/label "METHOD",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def organizer
  {:db/ident :spec/organizer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: CAL-ADDRESS"
     "The property defines the organizer for a calendar component."},
   :rdfs/domain
   {:owl/unionOf
    [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vfreebusy :spec/Vfreebusy],
    :rdf/type :owl/Class},
   :rdfs/label "ORGANIZER",
   :rdfs/range :spec/Value_CAL-ADDRESS,
   :spec/valueType "CAL-ADDRESS"})

(def percentComplete
  {:db/ident :spec/percentComplete,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: INTEGER"
     "This property is used by an assignee or delegatee of a to-do to convey the percent completion of a to-do to the Organizer."},
   :rdfs/domain :spec/Vtodo,
   :rdfs/label "PERCENT-COMPLETE",
   :rdfs/range :xsd/integer,
   :spec/valueType "INTEGER"})

(def priority
  {:db/ident :spec/priority,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: INTEGER"
     "The property defines the relative priority for a calendar component."},
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vevent :spec/Vtodo],
    :rdf/type    :owl/Class},
   :rdfs/label "PRIORITY",
   :rdfs/range :xsd/integer,
   :spec/valueType "INTEGER"})

(def prodid
  {:db/ident :spec/prodid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property specifies the identifier for the product that created the iCalendar object."},
   :rdfs/label "PRODID",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def rdate
  {:db/ident :spec/rdate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    default value type: DATE-TIME"
     "This property defines the list of date/times for a recurrence set."},
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vtimezone],
    :rdf/type    :owl/Class},
   :rdfs/label "RDATE",
   :rdfs/range
   {:owl/unionOf [:spec/Value_DATE-TIME :spec/Value_DATE :spec/Value_PERIOD],
    :rdf/type    :owl/Class},
   :spec/valueType "DATE-TIME"})

(def recurrenceId
  {:db/ident :spec/recurrenceId,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"This property is used in conjunction with the \"UID\" and \"SEQUENCE\" property to identify a specific instance of a recurring \"VEVENT\", \"VTODO\" or \"VJOURNAL\" calendar component. The property value is the effective value of the \"DTSTART\" property of the recurrence instance."
     "\n\t    default value type: DATE-TIME"},
   :rdfs/label "RECURRENCE-ID",
   :rdfs/range {:owl/unionOf [:spec/Value_DATE-TIME
                              :spec/Value_DATE
                              :spec/Value_DATE
                              :spec/Value_DATE],
                :rdf/type    :owl/Class},
   :spec/valueType "DATE-TIME"})

(def relatedTo
  {:db/ident :spec/relatedTo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "The property is used to represent a relationship or reference between one calendar component and another."},
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label "RELATED-TO",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def repeat
  {:db/ident :spec/repeat,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: INTEGER"
     "This property defines the number of time the alarm should be repeated, after the initial trigger."},
   :rdfs/domain :spec/Valarm,
   :rdfs/label "REPEAT",
   :rdfs/range :xsd/integer,
   :spec/valueType "INTEGER"})

(def requestStatus
  {:db/ident :spec/requestStatus,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the status code returned for a scheduling request."},
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label "REQUEST-STATUS",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def resources
  {:db/ident :spec/resources,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the equipment or resources anticipated for an activity specified by a calendar entity.."},
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo],
                 :rdf/type    :owl/Class},
   :rdfs/label "RESOURCES",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def rrule
  {:db/ident :spec/rrule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"\n\t    value type: RECUR"
     "This property defines a rule or repeating pattern for recurring events, to-dos, or time zone definitions."},
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Vtimezone
                               :spec/Vtimezone
                               :spec/Vtimezone
                               :spec/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/label "RRULE",
   :rdfs/range :spec/Value_RECUR,
   :spec/valueType "RECUR"})

(def sequence
  {:db/ident :spec/sequence,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"This property defines the revision sequence number of the calendar component within a sequence of revisions."
     "\n\t    value type: integer"},
   :rdfs/domain {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label "SEQUENCE",
   :rdfs/range :xsd/integer,
   :spec/valueType "integer"})

(def status
  {:db/ident :spec/status,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the overall status or confirmation for the calendar component."},
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal],
                 :rdf/type    :owl/Class},
   :rdfs/label "STATUS",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def summary
  {:db/ident :spec/summary,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines a short summary or subject for the calendar component."},
   :rdfs/domain {:owl/unionOf [:spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Valarm
                               :spec/Vevent
                               :spec/Vtodo
                               :spec/Vjournal
                               :spec/Valarm],
                 :rdf/type    :owl/Class},
   :rdfs/label "SUMMARY",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def transp
  {:db/ident :spec/transp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines whether an event is transparent or not to busy time searches."},
   :rdfs/domain :spec/Vevent,
   :rdfs/label "TRANSP",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def trigger
  {:db/ident       :spec/trigger,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #{"\n\t    default value type: DURATION"
                     "This property specifies when an alarm will trigger."},
   :rdfs/domain    {:owl/unionOf [:spec/Valarm
                                  :spec/Valarm
                                  :spec/Vevent
                                  :spec/Vtodo
                                  :spec/Vevent
                                  :spec/Vtodo],
                    :rdf/type    :owl/Class},
   :rdfs/label     "TRIGGER",
   :rdfs/range     {:owl/unionOf [:spec/Value_DURATION
                                  :spec/Value_DATE
                                  :spec/Value_DATE],
                    :rdf/type    :owl/Class},
   :spec/valueType "DURATION"})

(def tzid
  {:db/ident :spec/tzid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property specifies the text value that uniquely identifies the \"VTIMEZONE\" calendar component."},
   :rdfs/domain :spec/Vtimezone,
   :rdfs/label "TZID",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def tzname
  {:db/ident :spec/tzname,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property specifies the customary designation for a time zone description."},
   :rdfs/domain :spec/Vtimezone,
   :rdfs/label "TZNAME",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def tzoffsetfrom
  {:db/ident :spec/tzoffsetfrom,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: UTC-OFFSET"
     "This property specifies the offset which is in use prior to this time zone observance."},
   :rdfs/domain {:owl/unionOf [:spec/Vtimezone :spec/Vtimezone :spec/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/label "TZOFFSETFROM",
   :rdfs/range :xsd/string,
   :spec/valueType "UTC-OFFSET"})

(def tzoffsetto
  {:db/ident :spec/tzoffsetto,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: UTC-OFFSET"
     "This property specifies the offset which is in use in this time zone observance."},
   :rdfs/domain :spec/Vtimezone,
   :rdfs/label "TZOFFSETTO",
   :rdfs/range :xsd/string,
   :spec/valueType "UTC-OFFSET"})

(def tzurl
  {:db/ident :spec/tzurl,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"The TZURL provides a means for a VTIMEZONE component to point to a network location that can be used to retrieve an up-to- date version of itself."
     "\n\t    value type: URI"},
   :rdfs/domain {:owl/unionOf [:spec/Vtimezone :spec/Vtimezone :spec/Vtimezone],
                 :rdf/type    :owl/Class},
   :rdfs/label "TZURL",
   :spec/valueType "URI"})

(def uid
  {:db/ident :spec/uid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property defines the persistent, globally unique identifier for the calendar component."},
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
   :rdfs/label "UID",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})

(def url
  {:db/ident :spec/url,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"This property defines a Uniform Resource Locator (URL) associated with the iCalendar object."
     "\n\t    value type: URI"},
   :rdfs/domain
   {:owl/unionOf [:spec/Vevent :spec/Vtodo :spec/Vjournal :spec/Vfreebusy],
    :rdf/type    :owl/Class},
   :rdfs/label "URL",
   :spec/valueType "URI"})

(def version
  {:db/ident :spec/version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"\n\t    value type: TEXT"
     "This property specifies the identifier corresponding to the highest version number or the minimum and maximum range of the iCalendar specification that is required in order to interpret the iCalendar object."},
   :rdfs/label "VERSION",
   :rdfs/range :xsd/string,
   :spec/valueType "TEXT"})