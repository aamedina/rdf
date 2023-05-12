(ns net.wikipunk.rdf.time
  "OWL-Time Tiempo en OWL"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/w3c/sdw/gh-pages/time/rdf/time.ttl",
   :dcterms/contributor ["https://orcid.org/0000-0001-8269-8171"
                         "mailto:chris.little@metoffice.gov.uk"],
   :dcterms/created #inst "2006-09-27T00:00:00.000-04:00",
   :dcterms/creator ["http://orcid.org/0000-0002-3884-3420"
                     "mailto:panfeng66@gmail.com"
                     "https://en.wikipedia.org/wiki/Jerry_Hobbs"],
   :dcterms/isVersionOf "http://www.w3.org/TR/owl-time",
   :dcterms/license "https://creativecommons.org/licenses/by/4.0/",
   :dcterms/modified #inst "2021-01-27T00:00:00.000-05:00",
   :dcterms/rights
   "Copyright © 2006-2021 W3C, OGC. W3C and OGC liability, trademark and document use rules apply.",
   :owl/priorVersion :time/|2006|,
   :owl/versionIRI :time/|2016|,
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "time"    "http://www.w3.org/2006/time#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "time",
   :rdfa/uri "http://www.w3.org/2006/time",
   :rdfs/isDefinedBy {:rdf/uri
                      "https://www.w3.org/TR/2017/REC-owl-time-20171019/"},
   :rdfs/label ["OWL-Time" "Tiempo en OWL"],
   :rdfs/seeAlso
   ["http://www.w3.org/TR/owl-time"
    "http://dx.doi.org/10.3233/SW-150187"
    "http://www.semantic-web-journal.net/content/time-ontology-extended-non-gregorian-calendar-applications"],
   :skos/changeNote
   ["2016-12-20 - adjust range of time:timeZone to time:TimeZone, moved up from the tzont ontology.  "
    "2016-06-15 - initial update of OWL-Time - modified to support arbitrary temporal reference systems. "
    "2017-02 - intervalIn, intervalDisjoint, monthOfYear added; TemporalUnit subclass of TemporalDuration"
    "2021-01-27 - clarified definition and label for time:after and time:before"
    "2016-12-20 - restore time:Year and time:January which were present in the 2006 version of the ontology, but now marked \"deprecated\". "
    "2017-04-06 - hasTime, hasXSDDuration added; Number removed; all duration elements changed to xsd:decimal"],
   :skos/historyNote
   "Update of OWL-Time ontology, extended to support general temporal reference systems. \n\nOntology engineering by Simon J D Cox"}
  (:refer-clojure :exclude [second]))

(def DateTimeDescription
  "Descripción de fecha y tiempo estructurada con valores separados para los diferentes elementos de un sistema calendario-reloj. El sistema de referencia temporal está fijado al calendario gregoriano, y el rango de las propiedades año, mes, día restringidas a los correspondientes tipos del XML Schema xsd:gYear, xsd:gMonth y xsd:gDay respectivamente. Description of date and time structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of year, month, day properties restricted to corresponding XML Schema types xsd:gYear, xsd:gMonth and xsd:gDay, respectively."
  {:db/ident :time/DateTimeDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Descripción de fecha y tiempo estructurada con valores separados para los diferentes elementos de un sistema calendario-reloj. El sistema de referencia temporal está fijado al calendario gregoriano, y el rango de las propiedades año, mes, día restringidas a los correspondientes tipos del XML Schema xsd:gYear, xsd:gMonth y xsd:gDay respectivamente."
    "Description of date and time structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of year, month, day properties restricted to corresponding XML Schema types xsd:gYear, xsd:gMonth and xsd:gDay, respectively."],
   :rdfs/label ["descripción de fecha-tiempo" "Date-Time description"],
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/gMonth,
                      :owl/onProperty    :time/month,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gYear,
                      :owl/onProperty    :time/year,
                      :rdf/type          :owl/Restriction}
                     {:owl/hasValue
                      {:rdfa/uri
                       "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian"},
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gDay,
                      :owl/onProperty    :time/day,
                      :rdf/type          :owl/Restriction}
                     :time/GeneralDateTimeDescription
                     :time/DateTimeDescription
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hour,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/day,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalPosition
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/month,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/year,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/timeZone,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minute,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/week,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfYear,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfWeek,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/second,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/monthOfYear,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   ["Descripción de fecha y tiempo estructurada con valores separados para los diferentes elementos de un sistema calendario-reloj. El sistema de referencia temporal está fijado al calendario gregoriano, y el rango de las propiedades año, mes, día restringidas a los correspondientes tipos del XML Schema xsd:gYear, xsd:gMonth y xsd:gDay respectivamente."
    "Description of date and time structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of year, month, day properties restricted to corresponding XML Schema types xsd:gYear, xsd:gMonth and xsd:gDay, respectively."]})

(def DateTimeInterval
  "DateTimeInterval is a subclass of ProperInterval, defined using the multi-element DateTimeDescription. 'intervalo de fecha-hora' es una subclase de 'intervalo propio', definida utilizando el multi-elemento 'descripción de fecha-hora'."
  {:db/ident :time/DateTimeInterval,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["DateTimeInterval is a subclass of ProperInterval, defined using the multi-element DateTimeDescription."
    "'intervalo de fecha-hora' es una subclase de 'intervalo propio', definida utilizando el multi-elemento 'descripción de fecha-hora'."],
   :rdfs/label ["intervalo de fecha-hora" "Date-time interval"],
   :rdfs/subClassOf [:time/ProperInterval
                     :time/DateTimeInterval
                     :time/Interval
                     :owl/Thing
                     :time/TemporalEntity],
   :skos/definition
   ["DateTimeInterval is a subclass of ProperInterval, defined using the multi-element DateTimeDescription."
    "'intervalo de fecha-hora' es una subclase de 'intervalo propio', definida utilizando el multi-elemento 'descripción de fecha-hora'."],
   :skos/note
   [":DateTimeInterval can only be used for an interval whose limits coincide with a date-time element aligned to the calendar and timezone indicated. For example, while both have a duration of one day, the 24-hour interval beginning at midnight at the beginning of 8 May in Central Europe can be expressed as a :DateTimeInterval, but the 24-hour interval starting at 1:30pm cannot."
    "'intervalo de fecha-hora' se puede utilizar sólo para un intervalo cuyos límites coinciden con un elemento de fecha-hora alineados con el calendario y la zona horaria indicados. Por ejemplo, aunque ambos tienen una duración de un día, el intervalo de 24 horas que empieza en la media noche del comienzo del 8 mayo en Europa Central se puede expresar como un 'intervalo de fecha-hora', el intervalo de 24 horas que empieza a las 1:30pm no."]})

(def DayOfWeek
  "The day of week El día de la semana"
  {:db/ident :time/DayOfWeek,
   :rdf/type :owl/Class,
   :rdfs/comment ["The day of week" "El día de la semana"],
   :rdfs/label ["día de la semana" "Day of week"],
   :rdfs/subClassOf [:owl/Thing :time/DayOfWeek],
   :skos/changeNote
   "Remove enumeration from definition, in order to allow other days to be used when required in other calendars. \nNOTE: existing days are still present as members of the class, but the class membership is now open. \n\nIn the original OWL-Time the following constraint appeared: \n  owl:oneOf (\n      time:Monday\n      time:Tuesday\n      time:Wednesday\n      time:Thursday\n      time:Friday\n      time:Saturday\n      time:Sunday\n    ) ;",
   :skos/definition ["The day of week" "El día de la semana"],
   :skos/note
   ["Membership of the class :DayOfWeek is open, to allow for alternative week lengths and different day names."
    "La pertenencia a la clase 'día de la semana' está abierta, para permitir longitudes de semana alternativas y diferentes nombres de días."]})

(def Duration
  "Duration of a temporal extent expressed as a number scaled by a temporal unit Duración de una extensión temporal expresada como un número escalado por una unidad temporal."
  {:db/ident :time/Duration,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Duration of a temporal extent expressed as a number scaled by a temporal unit"
    "Duración de una extensión temporal expresada como un número escalado por una unidad temporal."],
   :rdfs/label ["duración de tiempo" "Time duration"],
   :rdfs/subClassOf [:time/TemporalDuration
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/numericDuration,
                      :rdf/type        :owl/Restriction}
                     :time/Duration],
   :skos/definition
   ["Duration of a temporal extent expressed as a number scaled by a temporal unit"
    "Duración de una extensión temporal expresada como un número escalado por una unidad temporal."],
   :skos/note
   ["Alternative to time:DurationDescription to support description of a temporal duration other than using a calendar/clock system."
    "Alternativa a 'descripción de tiempo' para proporcionar descripción soporte a una duración temporal diferente a utilizar un sistema de calendario/reloj."]})

(def DurationDescription
  "Description of temporal extent structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of each of the numeric properties is restricted to xsd:decimal Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario. El sistema de referencia temporal se fija al calendario gregoriano, y el intervalo de cada una de las propiedades numéricas se restringe a xsd:decimal."
  {:db/ident :time/DurationDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Description of temporal extent structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of each of the numeric properties is restricted to xsd:decimal"
    "Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario. El sistema de referencia temporal se fija al calendario gregoriano, y el intervalo de cada una de las propiedades numéricas se restringe a xsd:decimal."],
   :rdfs/label ["descripción de duración" "Duration description"],
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/years,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/days,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/months,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/weeks,
                      :rdf/type          :owl/Restriction}
                     :time/GeneralDurationDescription
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/seconds,
                      :rdf/type          :owl/Restriction}
                     {:owl/hasValue
                      {:rdfa/uri
                       "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian"},
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/minutes,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/hours,
                      :rdf/type          :owl/Restriction}
                     :time/DurationDescription
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minutes,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/weeks,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/months,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/years,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/seconds,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hours,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/days,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalDuration],
   :skos/definition
   ["Description of temporal extent structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of each of the numeric properties is restricted to xsd:decimal"
    "Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario. El sistema de referencia temporal se fija al calendario gregoriano, y el intervalo de cada una de las propiedades numéricas se restringe a xsd:decimal."],
   :skos/note
   ["In the Gregorian calendar the length of the month is not fixed. Therefore, a value like \"2.5 months\" cannot be exactly compared with a similar duration expressed in terms of weeks or days."
    "En el calendario gregoriano la longitud de los meses no es fija. Por lo tanto, un valor como \"2,5 meses\" no se puede comparar exactamente con una duración similar expresada en términos de semanas o días."]})

(def Friday
  "Venerdì Vendredi Viernes Friday Piątek Vrijdag Freitag 金曜日 Пятница الجمعة 星期五 Sexta-feira"
  {:db/ident       :time/Friday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     "Friday",
   :skos/prefLabel ["Venerdì"
                    "Vendredi"
                    "Viernes"
                    "Friday"
                    "Piątek"
                    "Vrijdag"
                    "Freitag"
                    "金曜日"
                    "Пятница"
                    "الجمعة"
                    "星期五"
                    "Sexta-feira"]})

(def GeneralDateTimeDescription
  "Descripción de fecha y hora estructurada con valores separados para los distintos elementos de un sistema calendario-reloj. Description of date and time structured with separate values for the various elements of a calendar-clock system"
  {:db/ident :time/GeneralDateTimeDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Descripción de fecha y hora estructurada con valores separados para los distintos elementos de un sistema calendario-reloj."
    "Description of date and time structured with separate values for the various elements of a calendar-clock system"],
   :rdfs/label ["descripción de fecha-hora generalizada"
                "Generalized date-time description"],
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/second,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/day,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/monthOfYear,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalPosition
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/timeZone,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hour,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/year,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/week,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minute,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfWeek,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/month,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfYear,
                      :rdf/type           :owl/Restriction}
                     :time/GeneralDateTimeDescription
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   ["Descripción de fecha y hora estructurada con valores separados para los distintos elementos de un sistema calendario-reloj."
    "Description of date and time structured with separate values for the various elements of a calendar-clock system"],
   :skos/note
   ["Algunas combinaciones de propiedades son redundantes - por ejemplo, dentro de un 'año' especificado si se proporciona 'día del año' entonces 'día' y 'mes' se pueden computar, y viceversa. Los valores individuales deberían ser consistentes entre ellos y con el calendario, indicado a través del valor de la propiedad 'tiene TRS'."
    "Some combinations of properties are redundant - for example, within a specified :year if :dayOfYear is provided then :day and :month can be computed, and vice versa. Individual values should be consistent with each other and the calendar, indicated through the value of the :hasTRS property."]})

(def GeneralDurationDescription
  "Description of temporal extent structured with separate values for the various elements of a calendar-clock system. Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario."
  {:db/ident :time/GeneralDurationDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario."
    "Description of temporal extent structured with separate values for the various elements of a calendar-clock system."],
   :rdfs/label ["descripción de duración generalizada"
                "Generalized duration description"],
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/seconds,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/years,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/months,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalDuration
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/days,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hours,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minutes,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/weeks,
                      :rdf/type           :owl/Restriction}
                     :time/GeneralDurationDescription],
   :skos/definition
   ["Description of temporal extent structured with separate values for the various elements of a calendar-clock system."
    "Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario."],
   :skos/note
   ["La extensión de una duración de tiempo expresada como una 'descripción de duración general' depende del Sistema de Referencia Temporal. En algunos calendarios la longitud de la semana o del mes no es constante a lo largo del año. Por tanto, un valor como \"25 meses\" puede no ser necesariamente ser comparado con un duración similar expresada en términos de semanas o días. Cuando se consideran calendarios que no están basados en el movimiento de la Tierra, se deben tomar incluso más precauciones en la comparación de duraciones."
    "The extent of a time duration expressed as a GeneralDurationDescription depends on the Temporal Reference System. In some calendars the length of the week or month is not constant within the year. Therefore, a value like \"2.5 months\" may not necessarily be exactly compared with a similar duration expressed in terms of weeks or days. When non-earth-based calendars are considered even more care must be taken in comparing durations."]})

(def Instant
  "Una entidad temporal con una extensión o duración cero. A temporal entity with zero extent or duration"
  {:db/ident        :time/Instant,
   :rdf/type        :owl/Class,
   :rdfs/comment    ["Una entidad temporal con una extensión o duración cero."
                     "A temporal entity with zero extent or duration"],
   :rdfs/label      ["instante de tiempo." "Time instant"],
   :rdfs/subClassOf [:time/TemporalEntity :time/Instant :owl/Thing],
   :skos/definition ["Una entidad temporal con una extensión o duración cero."
                     "A temporal entity with zero extent or duration"]})

(def Interval
  "Una entidad temporal con una extensión o duración. A temporal entity with an extent or duration"
  {:db/ident        :time/Interval,
   :rdf/type        :owl/Class,
   :rdfs/comment    ["Una entidad temporal con una extensión o duración."
                     "A temporal entity with an extent or duration"],
   :rdfs/label      ["intervalo de tiempo" "Time interval"],
   :rdfs/subClassOf [:time/TemporalEntity :time/Interval :owl/Thing],
   :skos/definition ["Una entidad temporal con una extensión o duración."
                     "A temporal entity with an extent or duration"]})

(def January
  "January"
  {:db/ident :time/January,
   :owl/deprecated true,
   :rdf/type [:owl/DeprecatedClass :owl/Class],
   :rdfs/label "January",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/string "--01"},
                      :owl/onProperty :time/month,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   :time/unitMonth,
                      :owl/onProperty :time/unitType,
                      :rdf/type       :owl/Restriction}
                     :time/DateTimeDescription
                     :time/January
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hour,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/day,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalPosition
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/month,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/year,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/timeZone,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gMonth,
                      :owl/onProperty    :time/month,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minute,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gDay,
                      :owl/onProperty    :time/day,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/hasValue
                      {:rdfa/uri
                       "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian"},
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/week,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfYear,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfWeek,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/second,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/monthOfYear,
                      :rdf/type           :owl/Restriction}
                     :time/GeneralDateTimeDescription
                     {:owl/allValuesFrom :xsd/gYear,
                      :owl/onProperty    :time/year,
                      :rdf/type          :owl/Restriction}],
   :skos/historyNote
   "This class was present in the 2006 version of OWL-Time. It was presented as an example of how DateTimeDescription could be specialized, but does not belong in the revised ontology. "})

(def Monday
  "Monday Lunes Lundi Montag الاثنين 月曜日 Lunedì Понедельник Maandag Poniedziałek 星期一 Segunda-feira"
  {:db/ident       :time/Monday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     "Monday",
   :skos/prefLabel ["Monday"
                    "Lunes"
                    "Lundi"
                    "Montag"
                    "الاثنين"
                    "月曜日"
                    "Lunedì"
                    "Понедельник"
                    "Maandag"
                    "Poniedziałek"
                    "星期一"
                    "Segunda-feira"]})

(def MonthOfYear
  "The month of the year El mes del año."
  {:db/ident :time/MonthOfYear,
   :rdf/type :owl/Class,
   :rdfs/comment ["El mes del año." "The month of the year"],
   :rdfs/label ["Month of year" "mes del año"],
   :rdfs/subClassOf [{:owl/cardinality 0,
                      :owl/onProperty  :time/minute,
                      :rdf/type        :owl/Restriction}
                     {:owl/hasValue   :time/unitMonth,
                      :owl/onProperty :time/unitType,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/hour,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/day,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/month,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/week,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/second,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/year,
                      :rdf/type        :owl/Restriction}
                     :time/DateTimeDescription
                     :time/MonthOfYear
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hour,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/day,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/month,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minute,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/week,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/second,
                      :rdf/type           :owl/Restriction}
                     :time/GeneralDateTimeDescription
                     {:owl/allValuesFrom :xsd/gYear,
                      :owl/onProperty    :time/year,
                      :rdf/type          :owl/Restriction}
                     :time/TemporalPosition
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/year,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/timeZone,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gMonth,
                      :owl/onProperty    :time/month,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gDay,
                      :owl/onProperty    :time/day,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/hasValue
                      {:rdfa/uri
                       "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian"},
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfYear,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfWeek,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/monthOfYear,
                      :rdf/type           :owl/Restriction}],
   :skos/definition ["The month of the year" "El mes del año."],
   :skos/editorialNote
   ["Característica en riesgo - añadida en la revisión de 2017, y no utilizada todavía de forma amplia."
    "Feature at risk - added in 2017 revision, and not yet widely used. "],
   :skos/note
   ["Membership of the class :MonthOfYear is open, to allow for alternative annual calendars and different month names."
    "La pertenencia a la clase 'mes del año' está abierta, a permitir calendarios anuales alternativos y diferentes nombres de meses."]})

(def ProperInterval
  "Una entidad temporal con extensión o duración distinta de cero, es decir, para la cual los valores de principio y fin del intervalo son diferentes. A temporal entity with non-zero extent or duration, i.e. for which the value of the beginning and end are different"
  {:db/ident :time/ProperInterval,
   :owl/disjointWith :time/Instant,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Una entidad temporal con extensión o duración distinta de cero, es decir, para la cual los valores de principio y fin del intervalo son diferentes."
    "A temporal entity with non-zero extent or duration, i.e. for which the value of the beginning and end are different"],
   :rdfs/label ["intervalo propio" "Proper interval"],
   :rdfs/subClassOf
   [:time/Interval :time/ProperInterval :owl/Thing :time/TemporalEntity],
   :skos/definition
   ["Una entidad temporal con extensión o duración distinta de cero, es decir, para la cual los valores de principio y fin del intervalo son diferentes."
    "A temporal entity with non-zero extent or duration, i.e. for which the value of the beginning and end are different"]})

(def Saturday
  "السبت 土曜日 Sabato Sábado Sábado Zaterdag Суббота Sobota 星期六 Samedi Saturday Samstag"
  {:db/ident       :time/Saturday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     "Saturday",
   :skos/prefLabel ["السبت"
                    "土曜日"
                    "Sabato"
                    "Sábado"
                    "Sábado"
                    "Zaterdag"
                    "Суббота"
                    "Sobota"
                    "星期六"
                    "Samedi"
                    "Saturday"
                    "Samstag"]})

(def Sunday
  "Zondag Sunday Воскресенье Sonntag Domingo Domingo الأحد (يوم) Niedziela Dimanche 日曜日 Domenica 星期日"
  {:db/ident       :time/Sunday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     "Sunday",
   :skos/prefLabel ["Zondag"
                    "Sunday"
                    "Воскресенье"
                    "Sonntag"
                    "Domingo"
                    "Domingo"
                    "الأحد (يوم)"
                    "Niedziela"
                    "Dimanche"
                    "日曜日"
                    "Domenica"
                    "星期日"]})

(def TRS
  "Un sistema de referencia temporal, tal como un sistema de coordenadas temporales (con un origen, una dirección y una escala), una combinación calendario-reloj, o un sistema ordinal (posiblemente jerárquico). Esta clase comodín representa el conjunto de todos los sistemas de referencia temporal. A temporal reference system, such as a temporal coordinate system (with an origin, direction, and scale), a calendar-clock combination, or a (possibly hierarchical) ordinal system. This is a stub class, representing the set of all temporal reference systems."
  {:db/ident :time/TRS,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Un sistema de referencia temporal, tal como un sistema de coordenadas temporales (con un origen, una dirección y una escala), una combinación calendario-reloj, o un sistema ordinal (posiblemente jerárquico).\n        Esta clase comodín representa el conjunto de todos los sistemas de referencia temporal."
    "A temporal reference system, such as a temporal coordinate system (with an origin, direction, and scale), a calendar-clock combination, or a (possibly hierarchical) ordinal system. \n\nThis is a stub class, representing the set of all temporal reference systems."],
   :rdfs/label ["sistema de referencia temporal" "Temporal Reference System"],
   :skos/definition
   ["Un sistema de referencia temporal, tal como un sistema de coordenadas temporales (con un origen, una dirección y una escala), una combinación calendario-reloj, o un sistema ordinal (posiblemente jerárquico).\n    Esta clase comodín representa el conjunto de todos los sistemas de referencia temporal."
    "A temporal reference system, such as a temporal coordinate system (with an origin, direction, and scale), a calendar-clock combination, or a (possibly hierarchical) ordinal system. \n\nThis is a stub class, representing the set of all temporal reference systems."],
   :skos/note
   ["En el ISO 19108:2002 [ISO19108] se proporciona una taxonomía de sistemas de referencia temporal, incluyendo (a) sistemas de calendario + reloj; (b) sistemas de coordenadas temporales (es decir, desplazamiento numérico a partir de una época); (c) sistemas de referencia ordinales temporales (es decir, secuencia ordenada de intervalos nombrados, no necesariamente de igual duración)."
    "A taxonomy of temporal reference systems is provided in ISO 19108:2002 [ISO19108], including (a) calendar + clock systems; (b) temporal coordinate systems (i.e. numeric offset from an epoch); (c) temporal ordinal reference systems (i.e. ordered sequence of named intervals, not necessarily of equal duration)."]})

(def TemporalDuration
  "Extensión de tiempo; duración de un intervalo de tiempo independiente de su posición de inicio particular. Time extent; duration of a time interval separate from its particular start position"
  {:db/ident :time/TemporalDuration,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Extensión de tiempo; duración de un intervalo de tiempo independiente de su posición de inicio particular."
    "Time extent; duration of a time interval separate from its particular start position"],
   :rdfs/label ["duración temporal" "Temporal duration"],
   :rdfs/subClassOf :time/TemporalDuration,
   :skos/definition
   ["Extensión de tiempo; duración de un intervalo de tiempo independiente de su posición de inicio particular."
    "Time extent; duration of a time interval separate from its particular start position"]})

(def TemporalEntity
  "Un intervalo temporal o un instante. A temporal interval or instant."
  {:db/ident        :time/TemporalEntity,
   :owl/unionOf     [:time/Instant :time/Interval],
   :rdf/type        :owl/Class,
   :rdfs/comment    ["Un intervalo temporal o un instante."
                     "A temporal interval or instant."],
   :rdfs/label      ["entidad temporal" "Temporal entity"],
   :rdfs/subClassOf [:owl/Thing :time/TemporalEntity],
   :skos/definition ["Un intervalo temporal o un instante."
                     "A temporal interval or instant."]})

(def TemporalPosition
  "Una posición sobre una línea de tiempo. A position on a time-line"
  {:db/ident        :time/TemporalPosition,
   :rdf/type        :owl/Class,
   :rdfs/comment    ["Una posición sobre una línea de tiempo."
                     "A position on a time-line"],
   :rdfs/label      ["posición temporal" "Temporal position"],
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     :time/TemporalPosition],
   :skos/definition ["Una posición sobre una línea de tiempo."
                     "A position on a time-line"]})

(def TemporalUnit
  "Una duración estándar, que proporciona un factor de escala para una extensión de tiempo, o la granularidad o precisión para una posición de tiempo. A standard duration, which provides a scale factor for a time extent, or the granularity or precision for a time position."
  {:db/ident :time/TemporalUnit,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["A standard duration, which provides a scale factor for a time extent, or the granularity or precision for a time position."
    "Una duración estándar, que proporciona un factor de escala para una extensión de tiempo, o la granularidad o precisión para una posición de tiempo."],
   :rdfs/label ["unidad de tiempo" "Temporal unit"],
   :rdfs/subClassOf [:time/TemporalDuration :time/TemporalUnit],
   :skos/changeNote
   "Remove enumeration from definition, in order to allow other units to be used when required in other coordinate systems. \nNOTE: existing units are still present as members of the class, but the class membership is now open. \n\nIn the original OWL-Time the following constraint appeared: \n  owl:oneOf (\n      time:unitSecond\n      time:unitMinute\n      time:unitHour\n      time:unitDay\n      time:unitWeek\n      time:unitMonth\n      time:unitYear\n    ) ;",
   :skos/definition
   ["Una duración estándar, que proporciona un factor de escala para una extensión de tiempo, o la granularidad o precisión para una posición de tiempo."
    "A standard duration, which provides a scale factor for a time extent, or the granularity or precision for a time position."],
   :skos/note
   ["La pertenencia de la clase 'unidad de tiempo' está abierta, para permitir otras unidades de tiempo utilizadas en algunas aplicaciones técnicas (por ejemplo, millones de años o el mes Baha'i)."
    "Membership of the class TemporalUnit is open, to allow for other temporal units used in some technical applications (e.g. millions of years, Baha'i month)."]})

(def Thursday
  "Четверг الخميس Donnerstag Czwartek Donderdag Jeudi Quinta-feira Jueves 星期四 木曜日 Thursday Giovedì"
  {:db/ident       :time/Thursday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     "Thursday",
   :skos/prefLabel ["Четверг"
                    "الخميس"
                    "Donnerstag"
                    "Czwartek"
                    "Donderdag"
                    "Jeudi"
                    "Quinta-feira"
                    "Jueves"
                    "星期四"
                    "木曜日"
                    "Thursday"
                    "Giovedì"]})

(def TimePosition
  "Una posición temporal descrita utilizando bien un valor (nominal) de un sistema de referencia ordinal, o un valor (numérico) en un sistema de coordenadas temporales. A temporal position described using either a (nominal) value from an ordinal reference system, or a (numeric) value in a temporal coordinate system."
  {:db/ident :time/TimePosition,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Una posición temporal descrita utilizando bien un valor (nominal) de un sistema de referencia ordinal, o un valor (numérico) en un sistema de coordenadas temporales."
    "A temporal position described using either a (nominal) value from an ordinal reference system, or a (numeric) value in a temporal coordinate system. "],
   :rdfs/label ["posición de tiempo" "Time position"],
   :rdfs/subClassOf [{:owl/unionOf [{:owl/cardinality 1,
                                     :owl/onProperty  :time/numericPosition,
                                     :rdf/type        :owl/Restriction}
                                    {:owl/cardinality 1,
                                     :owl/onProperty  :time/nominalPosition,
                                     :rdf/type        :owl/Restriction}],
                      :rdf/type    :owl/Class}
                     :time/TemporalPosition
                     :time/TimePosition
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   ["Una posición temporal descrita utilizando bien un valor (nominal) de un sistema de referencia ordinal, o un valor (numérico) en un sistema de coordenadas temporales."
    "A temporal position described using either a (nominal) value from an ordinal reference system, or a (numeric) value in a temporal coordinate system. "]})

(def TimeZone
  "Un huso horario especifica la cantidad en que la hora local está desplazada con respecto a UTC. Un huso horario normalmente se denota geográficamente (p.ej. el horario de verano del este de Australia), con un valor constante en una región dada. La región donde aplica y el desplazamiento desde UTC las especifica una autoridad gubernamental localmente reconocida. A Time Zone specifies the amount by which the local time is offset from UTC. A time zone is usually denoted geographically (e.g. Australian Eastern Daylight Time), with a constant value in a given region. The region where it applies and the offset from UTC are specified by a locally recognised governing authority."
  {:db/ident :time/TimeZone,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Un huso horario especifica la cantidad en que la hora local está desplazada con respecto a UTC.\n        Un huso horario normalmente se denota geográficamente (p.ej. el horario de verano del este de Australia), con un valor constante en una región dada.\n        La región donde aplica y el desplazamiento desde UTC las especifica una autoridad gubernamental localmente reconocida."
    "A Time Zone specifies the amount by which the local time is offset from UTC. \n\tA time zone is usually denoted geographically (e.g. Australian Eastern Daylight Time), with a constant value in a given region. \nThe region where it applies and the offset from UTC are specified by a locally recognised governing authority."],
   :rdfs/label ["Time Zone" "huso horario"],
   :skos/definition
   ["Un huso horario especifica la cantidad en que la hora local está desplazada con respecto a UTC.\n    Un huso horario normalmente se denota geográficamente (p.ej. el horario de verano del este de Australia), con un valor constante en una región dada.\n    La región donde aplica y el desplazamiento desde UTC las especifica una autoridad gubernamental localmente reconocida."
    "A Time Zone specifies the amount by which the local time is offset from UTC. \n\tA time zone is usually denoted geographically (e.g. Australian Eastern Daylight Time), with a constant value in a given region. \nThe region where it applies and the offset from UTC are specified by a locally recognised governing authority."],
   :skos/historyNote
   ["En la versión original de OWL-Time de 2006, se definió, en un espacio de nombres diferente \"http://www.w3.org/2006/timezone#\", la clase 'huso horario', con varias propiedades específicas correspondientes a un modelo específico de huso horario.\n    En la versión actual hay una clase con el mismo nombre local en el espacio de nombres de OWL-Time, eliminando la dependencia del espacio de nombres externo.\n    Un axioma de alineación permite que los datos codificados de acuerdo con la versión anterior sean consistentes con la ontología actualizada."
    "In the original 2006 version of OWL-Time, the TimeZone class, with several properties corresponding to a specific model of time-zones, was defined in a separate namespace \"http://www.w3.org/2006/timezone#\". \n\nIn the current version a class with same local name is put into the main OWL-Time namespace, removing the dependency on the external namespace. \n\nAn alignment axiom \n\ttzont:TimeZone rdfs:subClassOf time:TimeZone . \nallows data encoded according to the previous version to be consistent with the updated ontology. "],
   :skos/note
   ["A designated timezone is associated with a geographic region. However, for a particular region the offset from UTC often varies seasonally, and the dates of the changes may vary from year to year. The timezone designation usually changes for the different seasons (e.g. Australian Eastern Standard Time vs. Australian Eastern Daylight Time). Furthermore, the offset for a timezone may change over longer timescales, though its designation might not.  \n\nDetailed guidance about working with time zones is given in http://www.w3.org/TR/timezone/ ."
    "An ontology for time zone descriptions was described in [owl-time-20060927] and provided as RDF in a separate namespace tzont:. However, that ontology was incomplete in scope, and the example datasets were selective. Furthermore, since the use of a class from an external ontology as the range of an ObjectProperty in OWL-Time creates a dependency, reference to the time zone class has been replaced with the 'stub' class in the normative part of this version of OWL-Time."
    "Un huso horario designado está asociado con una región geográfica. Sin embargo, para una región particular el desplazamiento desde UTC a menudo varía según las estaciones, y las fechas de los cambios pueden variar de un año a otro. La designación de huso horario  normalmente cambia de una estación a otra (por ejemplo, el horario estándar frente al horario de verano ambos del este de Australia). Además, del desplazamiento para un huso horario puede cambiar sobre escalas de tiempo mayores, aunque su designación no lo haga.\n    Se puede encontrar una guía detallada sobre el funcionamiento de husos horarios en http://www.w3.org/TR/timezone/.\"@es , \"En [owl-time-20060927] se describió una ontología para descripciones de husos horarios, y se proporcionó en un espacio de nombres separado tzont:. Sin embargo, dicha ontología estaba incompleta en su alcance, y el ejemplo de conjuntos de datos (datasets) era selectivo. Además, puesto que el uso de una clase de una ontología externa como el rango de una propiedad de objeto en OWL-Time crea una dependencia, la referencia a la clase huso horario se ha reemplazado por una clase que viene a ser un \"cajón de sastre\" en la en la parte normativa de esta versión de OWL-Time."],
   :skos/scopeNote
   ["En esta implementación 'huso horario' no tiene definidas propiedades. Se debería pensar como una superclase \"abstracta\" de todas las implementaciones de huso horario específicas."
    "In this implementation TimeZone has no properties defined. It should be thought of as an 'abstract' superclass of all specific timezone implementations."]})

(def Tuesday
  "Dienstag Terça-feira الثلاثاء Mardi Вторник Dinsdag 火曜日 Wtorek Tuesday Martes 星期二 Martedì"
  {:db/ident       :time/Tuesday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     "Tuesday",
   :skos/prefLabel ["Dienstag"
                    "Terça-feira"
                    "الثلاثاء"
                    "Mardi"
                    "Вторник"
                    "Dinsdag"
                    "火曜日"
                    "Wtorek"
                    "Tuesday"
                    "Martes"
                    "星期二"
                    "Martedì"]})

(def Wednesday
  "Mercoledì Среда Woensdag Mercredi 水曜日 Quarta-feira Środa 星期三 الأربعاء Mittwoch Miércoles Wednesday"
  {:db/ident       :time/Wednesday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     "Wednesday",
   :skos/prefLabel ["Mercoledì"
                    "Среда"
                    "Woensdag"
                    "Mercredi"
                    "水曜日"
                    "Quarta-feira"
                    "Środa"
                    "星期三"
                    "الأربعاء"
                    "Mittwoch"
                    "Miércoles"
                    "Wednesday"]})

(def Year
  "Year duration"
  {:db/ident :time/Year,
   :owl/deprecated true,
   :rdf/type [:owl/DeprecatedClass :owl/Class],
   :rdfs/comment "Year duration",
   :rdfs/label "Year",
   :rdfs/subClassOf [{:owl/cardinality 0,
                      :owl/onProperty  :time/weeks,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/seconds,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/minutes,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/hours,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/years,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/days,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/months,
                      :rdf/type        :owl/Restriction}
                     :time/DurationDescription
                     :time/Year
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/weeks,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/weeks,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/seconds,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/minutes,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/months,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/years,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hours,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/months,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/days,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minutes,
                      :rdf/type           :owl/Restriction}
                     :time/GeneralDurationDescription
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/seconds,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/years,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/hours,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/days,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue
                      {:rdfa/uri
                       "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian"},
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     :time/TemporalDuration],
   :skos/definition "Year duration",
   :skos/historyNote
   "Year was proposed in the 2006 version of OWL-Time as an example of how DurationDescription could be specialized to allow for a duration to be restricted to a number of years. \n\nIt is deprecated in this edition of OWL-Time. ",
   :skos/prefLabel ["Ano"
                    "Anno"
                    "سنة"
                    "Rok"
                    "Jaar"
                    "Año"
                    "Jahr"
                    "Année (calendrier)"
                    "Year"
                    "Год"
                    "年"
                    "年"]})

(def after
  "Asume una dirección en el tiempo. Si una entidad temporal T1 está después de otra entidad temporal T2, entonces el principio de T1 está después del final de T2. Gives directionality to time. If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after the end of T2."
  {:db/ident :time/after,
   :owl/inverseOf :time/before,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Asume una dirección en el tiempo. Si una entidad temporal T1 está después de otra entidad temporal T2, entonces el principio de T1 está después del final de T2."
    "The subject is a temporal entity that occurs after the object. If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after the end of T2."],
   :rdfs/domain :time/TemporalEntity,
   :rdfs/label ["después" "is after"],
   :rdfs/range :time/TemporalEntity,
   :rdfs/subPropertyOf :time/after,
   :skos/definition
   ["Asume una dirección en el tiempo. Si una entidad temporal T1 está después de otra entidad temporal T2, entonces el principio de T1 está después del final de T2."
    "Gives directionality to time. If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after the end of T2."]})

(def before
  "Gives directionality to time. If a temporal entity T1 is before another temporal entity T2, then the end of T1 is before the beginning of T2. Thus, \"before\" can be considered to be basic to instants and derived for intervals. Asume una dirección en el tiempo. Si una entidad temporal T1 está antes que otra entidad temporal T2, entonces el final de T1 está antes que el principio de T2. Así, \"antes\" se puede considerar básica para instantes y derivada para intervalos."
  {:db/ident :time/before,
   :owl/inverseOf :time/after,
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/comment
   ["The subject is a temporal entity that occurs before the object. If a temporal entity T1 is before another temporal entity T2, then the end of T1 is before the beginning of T2. Thus, \"before\" can be considered to be basic to instants and derived for intervals."
    "Asume una dirección en el tiempo. Si una entidad temporal T1 está antes que otra entidad temporal T2, entonces el final de T1 está antes que el principio de T2. Así, \"antes\" se puede considerar básica para instantes y derivada para intervalos."],
   :rdfs/domain :time/TemporalEntity,
   :rdfs/label ["antes" "is before"],
   :rdfs/range :time/TemporalEntity,
   :rdfs/subPropertyOf :time/before,
   :skos/definition
   ["Gives directionality to time. If a temporal entity T1 is before another temporal entity T2, then the end of T1 is before the beginning of T2. Thus, \"before\" can be considered to be basic to instants and derived for intervals."
    "Asume una dirección en el tiempo. Si una entidad temporal T1 está antes que otra entidad temporal T2, entonces el final de T1 está antes que el principio de T2. Así, \"antes\" se puede considerar básica para instantes y derivada para intervalos."]})

(def day
  "Posición de día en un sistema calendario-reloj. El rango de esta propiedad no está especificado, por tanto, se puede reemplazar por una representación específica de un día de calendario de cualquier calendario. Day position in a calendar-clock system. The range of this property is not specified, so can be replaced by any specific representation of a calendar day from any calendar."
  {:db/ident :time/day,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Posición de día en un sistema calendario-reloj."
    "Day position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar day from any calendar. "],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label ["día" "day"],
   :skos/definition
   ["Posición de día en un sistema calendario-reloj.\n\nEl rango de esta propiedad no está especificado, por tanto, se puede reemplazar por una representación específica de un día de calendario de cualquier calendario."
    "Day position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar day from any calendar. "]})

(def dayOfWeek
  "El día de la semana, cuyo valor es un miembro de la clase 'día de la semana'. The day of week, whose value is a member of the class time:DayOfWeek"
  {:db/ident :time/dayOfWeek,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["El día de la semana, cuyo valor es un miembro de la clase 'día de la semana'."
    "The day of week, whose value is a member of the class time:DayOfWeek"],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label ["día de la semana" "day of week"],
   :rdfs/range :time/DayOfWeek,
   :skos/definition
   ["El día de la semana, cuyo valor es un miembro de la clase 'día de la semana'."
    "The day of week, whose value is a member of the class time:DayOfWeek"]})

(def dayOfYear
  "El número de día en el año. The number of the day within the year"
  {:db/ident        :time/dayOfYear,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    ["El número de día en el año."
                     "The number of the day within the year"],
   :rdfs/domain     :time/GeneralDateTimeDescription,
   :rdfs/label      ["día del año" "day of year"],
   :rdfs/range      :xsd/nonNegativeInteger,
   :skos/definition ["El número de día en el año."
                     "The number of the day within the year"]})

(def days
  "Longitud de, o elemento de la longitud de, una extensión temporal expresada en días. length of, or element of the length of, a temporal extent expressed in days"
  {:db/ident :time/days,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Longitud de, o elemento de la longitud de, una extensión temporal expresada en días."
    "length of, or element of the length of, a temporal extent expressed in days"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label ["duración en días" "days duration"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   ["Longitud de, o elemento de la longitud de, una extensión temporal expresada en días."
    "length of, or element of the length of, a temporal extent expressed in days"]})

(def generalDay
  "Día del mes - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gDay, excepto que se permiten valores hasta el 99, con el propósito de proporcionar soporte a calendarios con meses con más de 31 días. Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo. Day of month - formulated as a text string with a pattern constraint to reproduce the same lexical form as gDay, except that values up to 99 are permitted, in order to support calendars with more than 31 days in a month. Note that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."
  {:db/ident :time/generalDay,
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "---(0[1-9]|[1-9][0-9])(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   ["Día del mes - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gDay, excepto que se permiten valores hasta el 99, con el propósito de proporcionar soporte a calendarios con meses con más de 31 días.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."
    "Day of month - formulated as a text string with a pattern constraint to reproduce the same lexical form as gDay, except that values up to 99 are permitted, in order to support calendars with more than 31 days in a month. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."],
   :rdfs/label ["Día generalizado" "Generalized day"],
   :skos/definition
   ["Día del mes - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gDay, excepto que se permiten valores hasta el 99, con el propósito de proporcionar soporte a calendarios con meses con más de 31 días.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."
    "Day of month - formulated as a text string with a pattern constraint to reproduce the same lexical form as gDay, except that values up to 99 are permitted, in order to support calendars with more than 31 days in a month. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."]})

(def generalMonth
  "Mes del año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gMonth, excepto que se permiten valores hasta el 20, con el propósito de proporcionar soporte a calendarios con años con más de 12 meses. Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo. Month of year - formulated as a text string with a pattern constraint to reproduce the same lexical form as gMonth, except that values up to 20 are permitted, in order to support calendars with more than 12 months in the year. Note that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."
  {:db/ident :time/generalMonth,
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "--(0[1-9]|1[0-9]|20)(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   ["Mes del año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gMonth, excepto que se permiten valores hasta el 20, con el propósito de proporcionar soporte a calendarios con años con más de 12 meses.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."
    "Month of year - formulated as a text string with a pattern constraint to reproduce the same lexical form as gMonth, except that values up to 20 are permitted, in order to support calendars with more than 12 months in the year. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."],
   :rdfs/label ["Mes generalizado" "Generalized month"],
   :skos/definition
   ["Mes del año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gMonth, excepto que se permiten valores hasta el 20, con el propósito de proporcionar soporte a calendarios con años con más de 12 meses.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."
    "Month of year - formulated as a text string with a pattern constraint to reproduce the same lexical form as gMonth, except that values up to 20 are permitted, in order to support calendars with more than 12 months in the year. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."]})

(def generalYear
  "Número de año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gYear, aunque no está restringido a valores del calendario gregoriano. Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo. Year number - formulated as a text string with a pattern constraint to reproduce the same lexical form as gYear, but not restricted to values from the Gregorian calendar. Note that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."
  {:db/ident :time/generalYear,
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?([1-9][0-9]{3,}|0[0-9]{3})(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   ["Número de año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gYear, aunque no está restringido a valores del calendario gregoriano.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."
    "Year number - formulated as a text string with a pattern constraint to reproduce the same lexical form as gYear, but not restricted to values from the Gregorian calendar. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."],
   :rdfs/label ["Año generalizado" "Generalized year"],
   :skos/definition
   ["Número de año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gYear, aunque no está restringido a valores del calendario gregoriano.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo."
    "Year number - formulated as a text string with a pattern constraint to reproduce the same lexical form as gYear, but not restricted to values from the Gregorian calendar. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."]})

(def hasBeginning
  "Beginning of a temporal entity. Comienzo de una entidad temporal."
  {:db/ident           :time/hasBeginning,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Beginning of a temporal entity"
                        "Comienzo de una entidad temporal."],
   :rdfs/domain        :time/TemporalEntity,
   :rdfs/label         ["has beginning" "tiene principio"],
   :rdfs/range         :time/Instant,
   :rdfs/subPropertyOf [:time/hasTime :time/hasBeginning],
   :skos/definition    ["Beginning of a temporal entity."
                        "Comienzo de una entidad temporal."]})

(def hasDateTimeDescription
  "Valor de intervalo de fecha-hora expresado como un valor estructurado. El principio y el final del intervalo coincide con los límites del elemento más corto en la descripción. Value of DateTimeInterval expressed as a structured value. The beginning and end of the interval coincide with the limits of the shortest element in the description."
  {:db/ident :time/hasDateTimeDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Valor de intervalo de fecha-hora expresado como un valor estructurado. El principio y el final del intervalo coincide con los límites del elemento más corto en la descripción."
    "Value of DateTimeInterval expressed as a structured value. The beginning and end of the interval coincide with the limits of the shortest element in the description."],
   :rdfs/domain :time/DateTimeInterval,
   :rdfs/label ["tiene descripción fecha-hora" "has Date-Time description"],
   :rdfs/range :time/GeneralDateTimeDescription,
   :skos/definition
   ["Valor de intervalo de fecha-hora expresado como un valor estructurado. El principio y el final del intervalo coincide con los límites del elemento más corto en la descripción."
    "Value of DateTimeInterval expressed as a structured value. The beginning and end of the interval coincide with the limits of the shortest element in the description."]})

(def hasDuration
  "Duración de una entidad temporal, evento o actividad, o cosa, expresada como un valor escalado. Duration of a temporal entity, event or activity, or thing, expressed as a scaled value"
  {:db/ident :time/hasDuration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Duración de una entidad temporal, expresada como un valor escalado o un valor nominal."
    "Duration of a temporal entity, expressed as a scaled value or nominal value"],
   :rdfs/label ["tiene duración" "has duration"],
   :rdfs/range :time/Duration,
   :rdfs/subPropertyOf [:time/hasTemporalDuration :time/hasDuration],
   :skos/definition
   ["Duración de una entidad temporal, evento o actividad, o cosa, expresada como un valor escalado."
    "Duration of a temporal entity, event or activity, or thing, expressed as a scaled value"]})

(def hasDurationDescription
  "Duración de una entidad temporal, expresada utilizando una descripción estructurada. Duration of a temporal entity, expressed using a structured description"
  {:db/ident :time/hasDurationDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Duración de una entidad temporal, expresada utilizando una descripción estructurada."
    "Duration of a temporal entity, expressed using a structured description"],
   :rdfs/label ["tiene descripción de duración" "has duration description"],
   :rdfs/range :time/GeneralDurationDescription,
   :rdfs/subPropertyOf [:time/hasTemporalDuration :time/hasDurationDescription],
   :skos/definition
   ["Duración de una entidad temporal, expresada utilizando una descripción estructurada."
    "Duration of a temporal entity, expressed using a structured description"]})

(def hasEnd
  "Final de una entidad temporal. End of a temporal entity."
  {:db/ident           :time/hasEnd,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["End of a temporal entity."
                        "Final de una entidad temporal."],
   :rdfs/domain        :time/TemporalEntity,
   :rdfs/label         ["tiene fin" "has end"],
   :rdfs/range         :time/Instant,
   :rdfs/subPropertyOf [:time/hasTime :time/hasEnd],
   :skos/definition    ["Final de una entidad temporal."
                        "End of a temporal entity."]})

(def hasTRS
  "The temporal reference system used by a temporal position or extent description. El sistema de referencia temporal utilizado por una posición temporal o descripción de extensión."
  {:db/ident :time/hasTRS,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   ["El sistema de referencia temporal utilizado por una posición temporal o descripción de extensión."
    "The temporal reference system used by a temporal position or extent description. "],
   :rdfs/domain {:owl/unionOf [:time/TemporalPosition
                               :time/GeneralDurationDescription],
                 :rdf/type    :owl/Class},
   :rdfs/label ["sistema de referencia temporal utilizado"
                "Temporal reference system used"],
   :rdfs/range :time/TRS,
   :skos/definition
   ["The temporal reference system used by a temporal position or extent description. "
    "El sistema de referencia temporal utilizado por una posición temporal o descripción de extensión."]})

(def hasTemporalDuration
  "Duración de una entidad temporal. Duration of a temporal entity."
  {:db/ident           :time/hasTemporalDuration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Duración de una entidad temporal."
                        "Duration of a temporal entity."],
   :rdfs/domain        :time/TemporalEntity,
   :rdfs/label         ["tiene duración temporal" "has temporal duration"],
   :rdfs/range         :time/TemporalDuration,
   :rdfs/subPropertyOf :time/hasTemporalDuration,
   :skos/definition    ["Duración de una entidad temporal."
                        "Duration of a temporal entity."]})

(def hasTime
  "Proporciona soporte a la asociación de una entidad temporal (instante o intervalo) a cualquier cosa. Supports the association of a temporal entity (instant or interval) to any thing"
  {:db/ident :time/hasTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Proporciona soporte a la asociación de una entidad temporal (instante o intervalo) a cualquier cosa."
    "Supports the association of a temporal entity (instant or interval) to any thing"],
   :rdfs/label ["tiene tiempo" "has time"],
   :rdfs/range :time/TemporalEntity,
   :rdfs/subPropertyOf :time/hasTime,
   :skos/definition
   ["Proporciona soporte a la asociación de una entidad temporal (instante o intervalo) a cualquier cosa."
    "Supports the association of a temporal entity (instant or interval) to any thing"],
   :skos/editorialNote
   ["Feature at risk - added in 2017 revision, and not yet widely used. "
    "Característica arriesgada -añadida en la revisión del 2017 que no ha sido todavía utilizada de forma amplia."]})

(def hasXSDDuration
  "Extensión de una entidad temporal, expresada utilizando xsd:duration. Extent of a temporal entity, expressed using xsd:duration"
  {:db/ident :time/hasXSDDuration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Extensión de una entidad temporal, expresada utilizando xsd:duration."
    "Extent of a temporal entity, expressed using xsd:duration"],
   :rdfs/domain :time/TemporalEntity,
   :rdfs/label ["has XSD duration" "tiene duración XSD"],
   :rdfs/range :xsd/duration,
   :skos/definition
   ["Extensión de una entidad temporal, expresada utilizando xsd:duration."
    "Extent of a temporal entity, expressed using xsd:duration"],
   :skos/editorialNote
   ["Característica arriesgada - añadida en la revisión de 2017, y todavía no ampliamente utilizada."
    "Feature at risk - added in 2017 revision, and not yet widely used. "]})

(def hour
  "Posición de hora en un sistema calendario-reloj. Hour position in a calendar-clock system."
  {:db/ident        :time/hour,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    ["Posición de hora en un sistema calendario-reloj."
                     "Hour position in a calendar-clock system."],
   :rdfs/domain     :time/GeneralDateTimeDescription,
   :rdfs/label      ["hora" "hour"],
   :rdfs/range      :xsd/nonNegativeInteger,
   :skos/definition ["Posición de hora en un sistema calendario-reloj."
                     "Hour position in a calendar-clock system."]})

(def hours
  "Longitud de, o elemento de la longitud de, una extensión temporal expresada en horas. length of, or element of the length of, a temporal extent expressed in hours"
  {:db/ident :time/hours,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Longitud de, o elemento de la longitud de, una extensión temporal expresada en horas."
    "length of, or element of the length of, a temporal extent expressed in hours"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label ["duración en horas" "hours duration"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   ["Longitud de, o elemento de la longitud de, una extensión temporal expresada en horas."
    "length of, or element of the length of, a temporal extent expressed in hours"]})

(def inDateTime
  "Posición de un instante, expresada utilizando una descripción estructurada. Position of an instant, expressed using a structured description"
  {:db/ident :time/inDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Position of an instant, expressed using a structured description"
    "Posición de un instante, expresada utilizando una descripción estructurada."],
   :rdfs/domain :time/Instant,
   :rdfs/label ["in date-time description" "en descripción de fecha-hora"],
   :rdfs/range :time/GeneralDateTimeDescription,
   :rdfs/subPropertyOf [:time/inTemporalPosition :time/inDateTime],
   :skos/definition
   ["Posición de un instante, expresada utilizando una descripción estructurada."
    "Position of an instant, expressed using a structured description"]})

(def inTemporalPosition
  "Posición de un instante de tiempo. Position of a time instant"
  {:db/ident           :time/inTemporalPosition,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       ["Posición de un instante de tiempo."
                        "Position of a time instant"],
   :rdfs/domain        :time/Instant,
   :rdfs/label         ["posición temporal" "Temporal position"],
   :rdfs/range         :time/TemporalPosition,
   :rdfs/subPropertyOf :time/inTemporalPosition,
   :skos/definition    ["Posición de un instante de tiempo."
                        "Position of a time instant"]})

(def inTimePosition
  "Position of a time instant expressed as a TimePosition Posición de un instante, expresada como una coordenada temporal o un valor nominal."
  {:db/ident :time/inTimePosition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Posición de un instante, expresada como una coordenada temporal o un valor nominal."
    "Position of an instant, expressed as a temporal coordinate or nominal value"],
   :rdfs/domain :time/Instant,
   :rdfs/label ["posición de tiempo" "Time position"],
   :rdfs/range :time/TimePosition,
   :rdfs/subPropertyOf [:time/inTemporalPosition :time/inTimePosition],
   :skos/definition
   ["Position of a time instant expressed as a TimePosition"
    "Posición de un instante, expresada como una coordenada temporal o un valor nominal."]})

(def inXSDDate
  "Posición de un instante, expresado utilizando xsd:date. Position of an instant, expressed using xsd:date"
  {:db/ident        :time/inXSDDate,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    ["Posición de un instante, expresado utilizando xsd:date."
                     "Position of an instant, expressed using xsd:date"],
   :rdfs/domain     :time/Instant,
   :rdfs/label      ["en fecha XSD" "in XSD date"],
   :rdfs/range      :xsd/date,
   :skos/definition ["Posición de un instante, expresado utilizando xsd:date."
                     "Position of an instant, expressed using xsd:date"]})

(def inXSDDateTime
  "Posición de un instante, expresado utilizando xsd:dateTime. Position of an instant, expressed using xsd:dateTime"
  {:db/ident :time/inXSDDateTime,
   :owl/deprecated true,
   :rdf/type [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/comment ["Posición de un instante, expresado utilizando xsd:dateTime."
                  "Position of an instant, expressed using xsd:dateTime"],
   :rdfs/domain :time/Instant,
   :rdfs/label ["en fecha-tiempo XSD" "in XSD Date-Time"],
   :rdfs/range :xsd/dateTime,
   :skos/definition
   ["Posición de un instante, expresado utilizando xsd:dateTime."
    "Position of an instant, expressed using xsd:dateTime"],
   :skos/note
   ["La propiedad 'en fecha-hora XSD' ha sido reemplazada por 'en fecha-sello de tiempo XSD' que hace obligatorio el campo 'huso horario'."
    "The property :inXSDDateTime is replaced by :inXSDDateTimeStamp which makes the time-zone field mandatory."]})

(def inXSDDateTimeStamp
  "Posición de un instante, expresado utilizando xsd:dateTimeStamp. Position of an instant, expressed using xsd:dateTimeStamp"
  {:db/ident :time/inXSDDateTimeStamp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Posición de un instante, expresado utilizando xsd:dateTimeStamp."
    "Position of an instant, expressed using xsd:dateTimeStamp"],
   :rdfs/domain :time/Instant,
   :rdfs/label ["en fecha-sello de tiempo XSD" "in XSD Date-Time-Stamp"],
   :rdfs/range :xsd/dateTimeStamp,
   :skos/definition
   ["Posición de un instante, expresado utilizando xsd:dateTimeStamp."
    "Position of an instant, expressed using xsd:dateTimeStamp"]})

(def inXSDgYear
  "Posición de un instante, expresado utilizando xsd:gYear. Position of an instant, expressed using xsd:gYear"
  {:db/ident        :time/inXSDgYear,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    ["Posición de un instante, expresado utilizando xsd:gYear."
                     "Position of an instant, expressed using xsd:gYear"],
   :rdfs/domain     :time/Instant,
   :rdfs/label      ["en año gregoriano XSD" "in XSD g-Year"],
   :rdfs/range      :xsd/gYear,
   :skos/definition ["Posición de un instante, expresado utilizando xsd:gYear."
                     "Position of an instant, expressed using xsd:gYear"]})

(def inXSDgYearMonth
  "Posición de un instante, expresado utilizando xsd:gYearMonth. Position of an instant, expressed using xsd:gYearMonth"
  {:db/ident :time/inXSDgYearMonth,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Posición de un instante, expresado utilizando xsd:gYearMonth."
    "Position of an instant, expressed using xsd:gYearMonth"],
   :rdfs/domain :time/Instant,
   :rdfs/label ["en año-mes gregoriano XSD" "in XSD g-YearMonth"],
   :rdfs/range :xsd/gYearMonth,
   :skos/definition
   ["Posición de un instante, expresado utilizando xsd:gYearMonth."
    "Position of an instant, expressed using xsd:gYearMonth"]})

(def inside
  "Un instante que cae dentro del intervalo. Se asume que no es ni el principio ni el final de ningún intervalo. An instant that falls inside the interval. It is not intended to include beginnings and ends of intervals."
  {:db/ident :time/inside,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Un instante que cae dentro del intervalo. Se asume que no es ni el principio ni el final de ningún intervalo."
    "An instant that falls inside the interval. It is not intended to include beginnings and ends of intervals."],
   :rdfs/domain :time/Interval,
   :rdfs/label ["tiene instante de tiempo dentro" "has time instant inside"],
   :rdfs/range :time/Instant,
   :skos/definition
   ["Un instante que cae dentro del intervalo. Se asume que no es ni el principio ni el final de ningún intervalo."
    "An instant that falls inside the interval. It is not intended to include beginnings and ends of intervals."]})

(def intervalAfter
  "If a proper interval T1 is intervalAfter another proper interval T2, then the beginning of T1 is after the end of T2. Si un intervalo propio T1 es posterior a otro intervalo propio T2, entonces el principio de T1 está después que el final de T2."
  {:db/ident :time/intervalAfter,
   :owl/inverseOf :time/intervalBefore,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["If a proper interval T1 is intervalAfter another proper interval T2, then the beginning of T1 is after the end of T2."
    "Si un intervalo propio T1 es posterior a otro intervalo propio T2, entonces el principio de T1 está después que el final de T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["interval after" "intervalo posterior"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf [:time/after :time/intervalDisjoint :time/intervalAfter],
   :skos/definition
   ["If a proper interval T1 is intervalAfter another proper interval T2, then the beginning of T1 is after the end of T2."
    "Si un intervalo propio T1 es posterior a otro intervalo propio T2, entonces el principio de T1 está después que el final de T2."]})

(def intervalBefore
  "Si un intervalo propio T1 está antes que otro intervalo propio T2, entonces el final de T1 está antes que el principio de T2. If a proper interval T1 is intervalBefore another proper interval T2, then the end of T1 is before the beginning of T2."
  {:db/ident :time/intervalBefore,
   :owl/inverseOf :time/intervalAfter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 está antes que otro intervalo propio T2, entonces el final de T1 está antes que el principio de T2."
    "If a proper interval T1 is intervalBefore another proper interval T2, then the end of T1 is before the beginning of T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["interval before" "intervalo anterior"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf
   [:time/intervalDisjoint :time/before :time/intervalBefore],
   :skos/definition
   ["Si un intervalo propio T1 está antes que otro intervalo propio T2, entonces el final de T1 está antes que el principio de T2."
    "If a proper interval T1 is intervalBefore another proper interval T2, then the end of T1 is before the beginning of T2."]})

(def intervalContains
  "Si un intervalo propio T1 contiene otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 está después del final de T2. If a proper interval T1 is intervalContains another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is after the end of T2."
  {:db/ident :time/intervalContains,
   :owl/inverseOf :time/intervalDuring,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 contiene otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 está después del final de T2."
    "If a proper interval T1 is intervalContains another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is after the end of T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["intervalo contiene" "interval contains"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   ["Si un intervalo propio T1 contiene otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 está después del final de T2."
    "If a proper interval T1 is intervalContains another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is after the end of T2."]})

(def intervalDisjoint
  "If a proper interval T1 is intervalDisjoint another proper interval T2, then the beginning of T1 is after the end of T2, or the end of T1 is before the beginning of T2, i.e. the intervals do not overlap in any way, but their ordering relationship is not known. Si un intervalo propio T1 es disjunto con otro intervalo propio T2, entonces el principio de T1 está después del final de T2, o el final de T1 está antes que el principio de T2, es decir, los intervalos no se solapan de ninguna forma, aunque su relación de orden no se conozca."
  {:db/ident :time/intervalDisjoint,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 es disjunto con otro intervalo propio T2, entonces el principio de T1 está después del final de T2, o el final de T1 está antes que el principio de T2, es decir, los intervalos no se solapan de ninguna forma, aunque su relación de orden no se conozca."
    "If a proper interval T1 is intervalDisjoint another proper interval T2, then the beginning of T1 is after the end of T2, or the end of T1 is before the beginning of T2, i.e. the intervals do not overlap in any way, but their ordering relationship is not known."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["interval disjoint" "intervalo disjunto"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf :time/intervalDisjoint,
   :skos/definition
   ["If a proper interval T1 is intervalDisjoint another proper interval T2, then the beginning of T1 is after the end of T2, or the end of T1 is before the beginning of T2, i.e. the intervals do not overlap in any way, but their ordering relationship is not known."
    "Si un intervalo propio T1 es disjunto con otro intervalo propio T2, entonces el principio de T1 está después del final de T2, o el final de T1 está antes que el principio de T2, es decir, los intervalos no se solapan de ninguna forma, aunque su relación de orden no se conozca."],
   :skos/note
   ["This interval relation is not included in the 13 basic relationships defined in Allen (1984), but is defined in (T.3) as the union of :intervalBefore v :intervalAfter . However, that is outside OWL2 expressivity, so is implemented as an explicit property, with :intervalBefore , :intervalAfter as sub-properties"
    "Esta relación entre intervalos no estaba incluida en las 13 relaciones básicas definidas por Allen (1984), pero está definida en T.3 como la unión de 'intervalo anterior' con 'intervalo posterior'. Sin embargo, esto está fuera de la expresividad de OWL2, por tanto, está implementado como una propiedad explícita, con 'intervalo anterior' e 'intervalo posterior' como sub-propiedades."]})

(def intervalDuring
  "Si un intervalo propio T1 está durante otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 está antes que el final de T2. If a proper interval T1 is intervalDuring another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is before the end of T2."
  {:db/ident :time/intervalDuring,
   :owl/inverseOf :time/intervalContains,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 está durante otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 está antes que el final de T2."
    "If a proper interval T1 is intervalDuring another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is before the end of T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["intervalo durante" "interval during"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf [:time/intervalIn :time/intervalDuring],
   :skos/definition
   ["Si un intervalo propio T1 está durante otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 está antes que el final de T2."
    "If a proper interval T1 is intervalDuring another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is before the end of T2."]})

(def intervalEquals
  "If a proper interval T1 is intervalEquals another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is coincident with the end of T2. Si un intervalo propio T1 es igual a otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 coincide con el final de T2."
  {:db/ident :time/intervalEquals,
   :owl/propertyDisjointWith :time/intervalIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["If a proper interval T1 is intervalEquals another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is coincident with the end of T2."
    "Si un intervalo propio T1 es igual a otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 coincide con el final de T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["intervalo igual" "interval equals"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   ["If a proper interval T1 is intervalEquals another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is coincident with the end of T2."
    "Si un intervalo propio T1 es igual a otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 coincide con el final de T2."]})

(def intervalFinishedBy
  "Si un intervalo propio T1 está terminado por otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 coincide con el final de T2. If a proper interval T1 is intervalFinishedBy another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is coincident with the end of T2."
  {:db/ident :time/intervalFinishedBy,
   :owl/inverseOf :time/intervalFinishes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["If a proper interval T1 is intervalFinishedBy another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is coincident with the end of T2."
    "Si un intervalo propio T1 está terminado por otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 coincide con el final de T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["intervalo terminado por" "interval finished by"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   ["Si un intervalo propio T1 está terminado por otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 coincide con el final de T2."
    "If a proper interval T1 is intervalFinishedBy another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is coincident with the end of T2."]})

(def intervalFinishes
  "If a proper interval T1 is intervalFinishes another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is coincident with the end of T2. Si un intervalo propio T1 termina otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 coincide con el final de T2."
  {:db/ident :time/intervalFinishes,
   :owl/inverseOf :time/intervalFinishedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 termina otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 coincide con el final de T2."
    "If a proper interval T1 is intervalFinishes another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is coincident with the end of T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["intervalo termina" "interval finishes"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf [:time/intervalIn :time/intervalFinishes],
   :skos/definition
   ["If a proper interval T1 is intervalFinishes another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is coincident with the end of T2."
    "Si un intervalo propio T1 termina otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 coincide con el final de T2."]})

(def intervalIn
  "If a proper interval T1 is intervalIn another proper interval T2, then the beginning of T1 is after the beginning of T2 or is coincident with the beginning of T2, and the end of T1 is before the end of T2, or is coincident with the end of T2, except that end of T1 may not be coincident with the end of T2 if the beginning of T1 is coincident with the beginning of T2. Si un intervalo propio T1 es un intervalo interior a otro intervalo propio T2, entonces el principio de T1 está después del principio de T2 o coincide con el principio de T2, y el final de T1 está antes que el final de T2, o coincide con el final de T2, excepto que el final de T1 puede no coincidir con el final de T2 si el principio de T1 coincide con el principio de T2."
  {:db/ident :time/intervalIn,
   :owl/propertyDisjointWith :time/intervalEquals,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 es un intervalo interior a otro intervalo propio T2, entonces el principio de T1 está después del principio de T2 o coincide con el principio de T2, y el final de T1 está antes que el final de T2, o coincide con el final de T2, excepto que el final de T1 puede no coincidir con el final de T2 si el principio de T1 coincide con el principio de T2."
    "If a proper interval T1 is intervalIn another proper interval T2, then the beginning of T1 is after the beginning of T2 or is coincident with the beginning of T2, and the end of T1 is before the end of T2, or is coincident with the end of T2, except that end of T1 may not be coincident with the end of T2 if the beginning of T1 is coincident with the beginning of T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["interval in" "intervalo interior"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf :time/intervalIn,
   :skos/definition
   ["If a proper interval T1 is intervalIn another proper interval T2, then the beginning of T1 is after the beginning of T2 or is coincident with the beginning of T2, and the end of T1 is before the end of T2, or is coincident with the end of T2, except that end of T1 may not be coincident with the end of T2 if the beginning of T1 is coincident with the beginning of T2."
    "Si un intervalo propio T1 es un intervalo interior a otro intervalo propio T2, entonces el principio de T1 está después del principio de T2 o coincide con el principio de T2, y el final de T1 está antes que el final de T2, o coincide con el final de T2, excepto que el final de T1 puede no coincidir con el final de T2 si el principio de T1 coincide con el principio de T2."],
   :skos/note
   ["This interval relation is not included in the 13 basic relationships defined in Allen (1984), but is referred to as 'an important relationship' in Allen and Ferguson (1997). It is the disjoint union of :intervalStarts v :intervalDuring v :intervalFinishes . However, that is outside OWL2 expressivity, so is implemented as an explicit property, with :intervalStarts , :intervalDuring , :intervalFinishes as sub-properties"
    "Esta relación entre intervalos no estaba incluida en las 13 relaciones básicas definidas por Allen (1984), pero se hace referencia a ella como \"una relación importante\" en Allen y Ferguson (1997). Es la unión disjunta de 'intervalo empieza', 'intervalo durante' y con 'intervalo termina'. Sin embargo, esto está fuera de la expresividad de OWL2, por tanto, se implementa como una propiedad explícita, con 'intervalo empieza', 'intervalo durante' e 'intervalo termina' como sub-propiedades."]})

(def intervalMeets
  "If a proper interval T1 is intervalMeets another proper interval T2, then the end of T1 is coincident with the beginning of T2. Si un intervalo propio T1 se encuentra con otro intervalo propio T2, entonces el final de T1 coincide con el principio de T2."
  {:db/ident :time/intervalMeets,
   :owl/inverseOf :time/intervalMetBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 se encuentra con otro intervalo propio T2, entonces el final de T1 coincide con el principio de T2."
    "If a proper interval T1 is intervalMeets another proper interval T2, then the end of T1 is coincident with the beginning of T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["intervalo se encuentra" "interval meets"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   ["If a proper interval T1 is intervalMeets another proper interval T2, then the end of T1 is coincident with the beginning of T2."
    "Si un intervalo propio T1 se encuentra con otro intervalo propio T2, entonces el final de T1 coincide con el principio de T2."]})

(def intervalMetBy
  "If a proper interval T1 is intervalMetBy another proper interval T2, then the beginning of T1 is coincident with the end of T2. Si un intervalo propio T1 es 'intervalo encontrado por' otro intervalo propio T2, entonces el principio de T1 coincide con el final de T2."
  {:db/ident :time/intervalMetBy,
   :owl/inverseOf :time/intervalMeets,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 es 'intervalo encontrado por' otro intervalo propio T2, entonces el principio de T1 coincide con el final de T2."
    "If a proper interval T1 is intervalMetBy another proper interval T2, then the beginning of T1 is coincident with the end of T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["intervalo encontrado por" "interval met by"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   ["If a proper interval T1 is intervalMetBy another proper interval T2, then the beginning of T1 is coincident with the end of T2."
    "Si un intervalo propio T1 es 'intervalo encontrado por' otro intervalo propio T2, entonces el principio de T1 coincide con el final de T2."]})

(def intervalOverlappedBy
  "If a proper interval T1 is intervalOverlappedBy another proper interval T2, then the beginning of T1 is after the beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end of T2. Si un intervalo propio T1 es 'intervalo solapado por' otro intervalo propio T2, entonces el principio de T1 es posterior al principio de T2, y el principio de T1 es anterior al final de T2, y el final de T1 es posterior al final de T2."
  {:db/ident :time/intervalOverlappedBy,
   :owl/inverseOf :time/intervalOverlaps,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 es 'intervalo solapado por' otro intervalo propio T2, entonces el principio de T1 es posterior al principio de T2, y el principio de T1 es anterior al final de T2, y el final de T1 es posterior al final de T2."
    "If a proper interval T1 is intervalOverlappedBy another proper interval T2, then the beginning of T1 is after the beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end of T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["intervalo solapado por" "interval overlapped by"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   ["If a proper interval T1 is intervalOverlappedBy another proper interval T2, then the beginning of T1 is after the beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end of T2."
    "Si un intervalo propio T1 es 'intervalo solapado por' otro intervalo propio T2, entonces el principio de T1 es posterior al principio de T2, y el principio de T1 es anterior al final de T2, y el final de T1 es posterior al final de T2."]})

(def intervalOverlaps
  "If a proper interval T1 is intervalOverlaps another proper interval T2, then the beginning of T1 is before the beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end of T2. Si un intervalo propio T1 se solapa con otro intervalo propio T2, entonces el principio de T1 es anterior al principio de T2, el final de T1 es posterior al principio de T2, y el final de T1 es anterior al final de T2."
  {:db/ident :time/intervalOverlaps,
   :owl/inverseOf :time/intervalOverlappedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["If a proper interval T1 is intervalOverlaps another proper interval T2, then the beginning of T1 is before the beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end of T2."
    "Si un intervalo propio T1 se solapa con otro intervalo propio T2, entonces el principio de T1 es anterior al principio de T2, el final de T1 es posterior al principio de T2, y el final de T1 es anterior al final de T2."
    "Asume una dirección en el tiempo. Si una entidad temporal T1 está después de otra entidad temporal T2, entonces el principio de T1 está después del final de T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["interval overlaps" "intervalo se solapa"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   ["If a proper interval T1 is intervalOverlaps another proper interval T2, then the beginning of T1 is before the beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end of T2."
    "Si un intervalo propio T1 se solapa con otro intervalo propio T2, entonces el principio de T1 es anterior al principio de T2, el final de T1 es posterior al principio de T2, y el final de T1 es anterior al final de T2."]})

(def intervalStartedBy
  "Si un intervalo propio T1 es empezado por otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 es posterior al final de T2. If a proper interval T1 is intervalStarted another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is after the end of T2."
  {:db/ident :time/intervalStartedBy,
   :owl/inverseOf :time/intervalStarts,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 es empezado por otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 es posterior al final de T2."
    "If a proper interval T1 is intervalStarted another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is after the end of T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label "interval started by",
   :rdfs/range :time/ProperInterval,
   :skos/definition
   ["Si un intervalo propio T1 es empezado por otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 es posterior al final de T2."
    "If a proper interval T1 is intervalStarted another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is after the end of T2."]})

(def intervalStarts
  "If a proper interval T1 is intervalStarts another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is before the end of T2. Si un intervalo propio T1 empieza otro intervalo propio T2, entonces del principio de T1 con el final de T2, y el final de T1 es anterior al final de T2."
  {:db/ident :time/intervalStarts,
   :owl/inverseOf :time/intervalStartedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 empieza otro intervalo propio T2, entonces del principio de T1 con el principio de T2, y el final de T1 es anterior al final de T2."
    "If a proper interval T1 is intervalStarts another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is before the end of T2."],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label ["interval starts" "intervalo empieza"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf [:time/intervalIn :time/intervalStarts],
   :skos/definition
   ["If a proper interval T1 is intervalStarts another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is before the end of T2."
    "Si un intervalo propio T1 empieza otro intervalo propio T2, entonces del principio de T1 con el final de T2, y el final de T1 es anterior al final de T2."]})

(def minute
  "Posición de minuto en un sistema calendario-reloj. Minute position in a calendar-clock system."
  {:db/ident        :time/minute,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    ["Posición de minuto en un sistema calendario-reloj."
                     "Minute position in a calendar-clock system."],
   :rdfs/domain     :time/GeneralDateTimeDescription,
   :rdfs/label      ["minuto" "minute"],
   :rdfs/range      :xsd/nonNegativeInteger,
   :skos/definition ["Posición de minuto en un sistema calendario-reloj."
                     "Minute position in a calendar-clock system."]})

(def minutes
  "Longitud de, o elemento de la longitud de, una extensión temporal expresada en minutos. length, or element of, a temporal extent expressed in minutes"
  {:db/ident :time/minutes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Longitud de, o elemento de la longitud de, una extensión temporal expresada en minutos."
    "length, or element of, a temporal extent expressed in minutes"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label ["minutos" "minutes"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   ["Longitud de, o elemento de la longitud de, una extensión temporal expresada en minutos."
    "length, or element of, a temporal extent expressed in minutes"]})

(def month
  "Posición de mes en un sistema calendario-reloj. El rango de esta propiedad no está especificado, por tanto, se puede reemplazar por cualquier representación específica de un mes de calendario de un calendario cualquiera. Month position in a calendar-clock system. The range of this property is not specified, so can be replaced by any specific representation of a calendar month from any calendar."
  {:db/ident :time/month,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Posición de mes en un sistema calendario-reloj.\n    El rango de esta propiedad no está especificado, por tanto, se puede reemplazar por cualquier representación específica de un mes de calendario de un calendario cualquiera."
    "Month position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar month from any calendar. "],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label ["mes" "month"],
   :skos/definition
   ["Posición de mes en un sistema calendario-reloj.\n            El rango de esta propiedad no está especificado, por tanto, se puede reemplazar por cualquier representación específica de un mes de calendario de un calendario cualquiera."
    "Month position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar month from any calendar. "]})

(def monthOfYear
  "The month of the year, whose value is a member of the class time:MonthOfYear El mes del año, cuyo valor es un miembro de la clase 'mes del año'."
  {:db/ident :time/monthOfYear,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["The month of the year, whose value is a member of the class time:MonthOfYear"
    "El mes del año, cuyo valor es un miembro de la clase 'mes del año'."],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label ["month of year" "mes del año"],
   :rdfs/range :time/MonthOfYear,
   :skos/definition
   ["The month of the year, whose value is a member of the class time:MonthOfYear"
    "El mes del año, cuyo valor es un miembro de la clase 'mes del año'."],
   :skos/editorialNote
   ["Característica arriesgada - añadida en la revisión de 2017, y todavía no ampliamente utilizada."
    "Feature at risk - added in 2017 revision, and not yet widely used. "]})

(def months
  "Longitud de, o elemento de la longitud de, una extensión temporal expresada en meses. length of, or element of the length of, a temporal extent expressed in months"
  {:db/ident :time/months,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Longitud de, o elemento de la longitud de, una extensión temporal expresada en meses."
    "length of, or element of the length of, a temporal extent expressed in months"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label ["duración en meses" "months duration"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   ["Longitud de, o elemento de la longitud de, una extensión temporal expresada en meses."
    "length of, or element of the length of, a temporal extent expressed in months"]})

(def nominalPosition
  "El valor (nominal) que indica posición temporal en un sistema de referencia ordinal. The (nominal) value indicating temporal position in an ordinal reference system"
  {:db/ident :time/nominalPosition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["El valor (nominal) que indica posición temporal en un sistema de referencia ordinal."
    "The (nominal) value indicating temporal position in an ordinal reference system "],
   :rdfs/domain :time/TimePosition,
   :rdfs/label ["nombre de posición temporal" "Name of temporal position"],
   :rdfs/range :xsd/string,
   :skos/definition
   ["El valor (nominal) que indica posición temporal en un sistema de referencia ordinal."
    "The (nominal) value indicating temporal position in an ordinal reference system "]})

(def numericDuration
  "Valor de una extensión temporal expresada como un número decimal escalado por una unidad de tiempo. Value of a temporal extent expressed as a decimal number scaled by a temporal unit"
  {:db/ident :time/numericDuration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Valor de una extensión temporal expresada como un número decimal escalado por una unidad de tiempo."
    "Value of a temporal extent expressed as a decimal number scaled by a temporal unit"],
   :rdfs/domain :time/Duration,
   :rdfs/label ["valor numérico de duración temporal"
                "Numeric value of temporal duration"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   ["Valor de una extensión temporal expresada como un número decimal escalado por una unidad de tiempo."
    "Value of a temporal extent expressed as a decimal number scaled by a temporal unit"]})

(def numericPosition
  "El valor (numérico) que indica posición temporal en un sistema de referencia ordinal. The (numeric) value indicating position within a temporal coordinate system"
  {:db/ident :time/numericPosition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["El valor (numérico) que indica posición temporal en un sistema de referencia ordinal."
    "The (numeric) value indicating position within a temporal coordinate system "],
   :rdfs/domain :time/TimePosition,
   :rdfs/label ["valor numérico de posición temporal"
                "Numeric value of temporal position"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   ["El valor (numérico) que indica posición temporal en un sistema de referencia ordinal."
    "The (numeric) value indicating position within a temporal coordinate system "]})

(def second
  "Posición de segundo en un sistema calendario-reloj. Second position in a calendar-clock system."
  {:db/ident     :time/second,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment ["Posición de segundo en un sistema calendario-reloj."
                  "Second position in a calendar-clock system."],
   :rdfs/domain  :time/GeneralDateTimeDescription,
   :rdfs/label   ["segundo" "second"],
   :rdfs/range   :xsd/decimal})

(def seconds
  "Longitud de, o elemento de la longitud de, una extensión temporal expresada en segundos. length of, or element of the length of, a temporal extent expressed in seconds"
  {:db/ident :time/seconds,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Longitud de, o elemento de la longitud de, una extensión temporal expresada en segundos."
    "length of, or element of the length of, a temporal extent expressed in seconds"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label ["duración en segundos" "seconds duration"],
   :rdfs/range :xsd/decimal,
   :rdfs/seeAlso
   ["http://www.bipm.org/en/publications/si-brochure/second.html"]})

(def timeZone
  "The time zone for clock elements in the temporal position"
  {:db/ident :time/timeZone,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "The time zone for clock elements in the temporal position",
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label ["in time zone" "en huso horario"],
   :rdfs/range :time/TimeZone,
   :skos/historyNote
   ["En la versión original de OWL-Time de 2006, el rango de 'en huso horario' se definió en un espacio de nombres diferente \"http://www.w3.org/2006/timezone#\".\n            Un axioma de alineación permite que los datos codificados de acuerdo con la versión anterior sean consistentes con la ontología actualizada."
    "In the original 2006 version of OWL-Time, the range of time:timeZone was a TimeZone class in a separate namespace \"http://www.w3.org/2006/timezone#\". \nAn alignment axiom \n\ttzont:TimeZone rdfs:subClassOf time:TimeZone . \nallows data encoded according to the previous version to be consistent with the updated ontology. "],
   :skos/note
   ["IANA maintains a database of timezones. These are well maintained and generally considered authoritative, but individual items are not available at individual URIs, so cannot be used directly in data expressed using OWL-Time.\n\nDBPedia provides a set of resources corresponding to the IANA timezones, with a URI for each (e.g. http://dbpedia.org/resource/Australia/Eucla). The World Clock service also provides a list of time zones with the description of each available as an individual webpage with a convenient individual URI (e.g. https://www.timeanddate.com/time/zones/acwst). These or other, similar, resources might be used as a value of the time:timeZone property."
    "IANA mantiene una base de datos de husos horarios. Éstas están bien mantenidas y generalmente se consideran autorizadas, pero los ítems individuales no están disponibles en URIs individuales, por tanto, no se pueden utilizar directamente en datos expresados utilizando OWL-Time.\n            La BDPedia proporciona un conjunto de recursos correspondientes a los husos horarios de IANA, con una URI para cada uno (por ejemplo, http://dbpedia.org/resource/Australia/Eucla). El Servicio de Reloj Mundial también proporciona una lista de husos horarios con la descripción de cada uno de los disponibles como una página Web individual con una URI adecuada individual (por ejemplo, https://www.timeanddate.com/time/zones/acwst). Éstos, y otros recursos similares, se puden usar como un valor de la propiedad 'huso horario'."]})

(def unitCentury
  "siècle secolo قرن واحد eeuw siglo 一世紀 stulecie 一个世纪 век Jahrhundert 한 세기 century século"
  {:db/ident       :time/unitCentury,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     "Century (unit of temporal duration)",
   :skos/prefLabel ["siècle"
                    "secolo"
                    "قرن واحد"
                    "eeuw"
                    "siglo"
                    "一世紀"
                    "stulecie"
                    "一个世纪"
                    "век"
                    "Jahrhundert"
                    "한 세기"
                    "century"
                    "século"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     100})

(def unitDay
  "Tag day dag dia día doba ある日 يوماً ما giorno 언젠가 jour 一天"
  {:db/ident       :time/unitDay,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     "Day (unit of temporal duration)",
   :skos/prefLabel ["Tag"
                    "day"
                    "dag"
                    "dia"
                    "día"
                    "doba"
                    "ある日"
                    "يوماً ما"
                    "giorno"
                    "언젠가"
                    "jour"
                    "一天"],
   :time/days      1,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitDecade
  "decade dekada 1 열개의 Dekade década una década 十年 одно десятилетие decennio 10年 decennium décennie عقد واحد"
  {:db/ident       :time/unitDecade,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     "Decade (unit of temporal duration)",
   :skos/prefLabel ["decade"
                    "dekada"
                    "1 열개의"
                    "Dekade"
                    "década"
                    "una década"
                    "十年"
                    "одно десятилетие"
                    "decennio"
                    "10年"
                    "decennium"
                    "décennie"
                    "عقد واحد"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     10})

(def unitHour
  "один час\"@ru 一時間 godzina Stunde 一小時 한 시간 hora hora ora hour ساعة واحدة uur heure"
  {:db/ident       :time/unitHour,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     "Hour (unit of temporal duration)",
   :skos/prefLabel ["один час\"@ru"
                    "一時間"
                    "godzina"
                    "Stunde"
                    "一小時"
                    "한 시간"
                    "hora"
                    "hora"
                    "ora"
                    "hour"
                    "ساعة واحدة"
                    "uur"
                    "heure"],
   :time/days      0,
   :time/hours     1,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitMillenium
  "millenium tysiąclecie ミレニアム millénaire тысячелетие millennio الألفية Jahrtausend milenio millennium 千年 milênio 밀레니엄"
  {:db/ident       :time/unitMillenium,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     "Century (unit of temporal duration)",
   :skos/prefLabel ["millenium"
                    "tysiąclecie"
                    "ミレニアム"
                    "millénaire"
                    "тысячелетие"
                    "millennio"
                    "الألفية"
                    "Jahrtausend"
                    "milenio"
                    "millennium"
                    "千年"
                    "milênio"
                    "밀레니엄"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     1000})

(def unitMinute
  "دقيقة واحدة minuut одна минута Minute minuto minuto minuto 분 等一下 一分 minute minute minuta"
  {:db/ident       :time/unitMinute,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     "Minute (unit of temporal duration)",
   :skos/prefLabel ["دقيقة واحدة"
                    "minuut"
                    "одна минута"
                    "Minute"
                    "minuto"
                    "minuto"
                    "minuto"
                    "분"
                    "等一下"
                    "一分"
                    "minute"
                    "minute"
                    "minuta"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   1,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitMonth
  "month mese mois mes 한달 один месяц Monat maand miesiąc 一個月 شهر واحد 一か月"
  {:db/ident       :time/unitMonth,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     "Month (unit of temporal duration)",
   :skos/prefLabel ["month"
                    "mese"
                    "mois"
                    "mes"
                    "한달"
                    "один месяц"
                    "Monat"
                    "maand"
                    "miesiąc"
                    "一個月"
                    "شهر واحد"
                    "一か月"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    1,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitSecond
  "segundo segundo seconde seconde sekundę Sekunde second ثانية واحدة 一秒 一秒 일초 secondo"
  {:db/ident       :time/unitSecond,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     "Second (unit of temporal duration)",
   :skos/prefLabel ["segundo"
                    "segundo"
                    "seconde"
                    "seconde"
                    "sekundę"
                    "Sekunde"
                    "second"
                    "ثانية واحدة"
                    "一秒"
                    "一秒"
                    "일초"
                    "secondo"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   1,
   :time/weeks     0,
   :time/years     0})

(def unitType
  "La unidad de tiempo que proporciona la precisión de un valor fecha-hora o la escala de una extensión temporal. The temporal unit which provides the precision of a date-time value or scale of a temporal extent"
  {:db/ident :time/unitType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["La unidad de tiempo que proporciona la precisión de un valor fecha-hora o la escala de una extensión temporal."
    "The temporal unit which provides the precision of a date-time value or scale of a temporal extent"],
   :rdfs/domain {:owl/unionOf [:time/GeneralDateTimeDescription :time/Duration],
                 :rdf/type    :owl/Class},
   :rdfs/label ["tipo de unidad temporal" "temporal unit type"],
   :rdfs/range :time/TemporalUnit})

(def unitWeek
  "一週間 week week settimana semana semana одна неделя tydzień 일주일 一周 semaine سبوع واحد Woche"
  {:db/ident       :time/unitWeek,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     "Week (unit of temporal duration)",
   :skos/prefLabel ["一週間"
                    "week"
                    "week"
                    "settimana"
                    "semana"
                    "semana"
                    "одна неделя"
                    "tydzień"
                    "일주일"
                    "一周"
                    "semaine"
                    "سبوع واحد"
                    "Woche"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     1,
   :time/years     0})

(def unitYear
  "anno سنة واحدة 一年 一年 jaar Jahr один год un año year an 1 년 ano rok"
  {:db/ident       :time/unitYear,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     "Year (unit of temporal duration)",
   :skos/prefLabel ["anno"
                    "سنة واحدة"
                    "一年"
                    "一年"
                    "jaar"
                    "Jahr"
                    "один год"
                    "un año"
                    "year"
                    "an"
                    "1 년"
                    "ano"
                    "rok"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     1})

(def week
  "Número de semana en el año. Week number within the year."
  {:db/ident :time/week,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment ["Número de semana en el año." "Week number within the year."],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label ["semana" "week"],
   :rdfs/range :xsd/nonNegativeInteger,
   :skos/note
   "Weeks are numbered differently depending on the calendar in use and the local language or cultural conventions (locale). ISO-8601 specifies that the first week of the year includes at least four days, and that Monday is the first day of the week. In that system, week 1 is the week that contains the first Thursday in the year.",
   :skos/scopeNote
   "Las semanas están numeradas de forma diferente dependiendo del calendario en uso y de las convenciones lingüísticas y culturales locales (locale en inglés). El ISO-8601 especifica que la primera semana del año incluye al menos cuatro días, y que el lunes es el primer día de la semana. En ese sistema, la semana 1 es la semana que contiene el primer jueves del año."})

(def weeks
  "Longitud de, o elemento de la longitud de, una extensión temporal expresada en semanas. length of, or element of the length of, a temporal extent expressed in weeks"
  {:db/ident :time/weeks,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Longitud de, o elemento de la longitud de, una extensión temporal expresada en semanas."
    "length of, or element of the length of, a temporal extent expressed in weeks"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label ["duración en semanas" "weeks duration"],
   :rdfs/range :xsd/decimal})

(def xsdDateTime
  "Valor de 'intervalo de fecha-hora' expresado como un valor compacto. Value of DateTimeInterval expressed as a compact value."
  {:db/ident :time/xsdDateTime,
   :owl/deprecated true,
   :rdf/type [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/comment
   ["Valor de 'intervalo de fecha-hora' expresado como un valor compacto."
    "Value of DateTimeInterval expressed as a compact value."],
   :rdfs/domain :time/DateTimeInterval,
   :rdfs/label ["has XSD date-time" "tiene fecha-hora XSD"],
   :rdfs/range :xsd/dateTime,
   :skos/note
   ["Utilizando xsd:dateTime en este lugar significa que la duración del intervalo está implícita: se corresponde con la longitud del elemento más pequeño distinto de cero del literal fecha-hora. Sin embargo, esta regla no se puede utilizar para intervalos cuya duración es mayor que un rango más pequeño que el tiempo de comienzo - p.ej. el primer minuto o segundo del día, la primera hora del mes, o el primer día del año. En estos casos el intervalo deseado no se puede distinguir del intervalo correspondiente al próximo rango más alto. Debido a esta ambigüedad esencial, no se recomienda el uso de esta propiedad y está desaprobada."
    "Using xsd:dateTime in this place means that the duration of the interval is implicit: it corresponds to the length of the smallest non-zero element of the date-time literal. However, this rule cannot be used for intervals whose duration is more than one rank smaller than the starting time - e.g. the first minute or second of a day, the first hour of a month, or the first day of a year. In these cases the desired interval cannot be distinguished from the interval corresponding to the next rank up. Because of this essential ambiguity, use of this property is not recommended and it is deprecated."]})

(def year
  "Posición de año en un sistema calendario-reloj. l rango de esta propiedad no está especificado, por tanto, se puede reemplazar por cualquier representación específica de un año de calendario de un calendario cualquiera. Year position in a calendar-clock system. The range of this property is not specified, so can be replaced by any specific representation of a calendar year from any calendar."
  {:db/ident :time/year,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Posición de año en un sistema calendario-reloj.\n\nl rango de esta propiedad no está especificado, por tanto, se puede reemplazar por cualquier representación específica de un año de calendario de un calendario cualquiera."
    "Year position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar year from any calendar. "],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label "year"})

(def years
  "Longitud de, o elemento de la longitud de, una extensión temporal expresada en años. length of, or element of the length of, a temporal extent expressed in years"
  {:db/ident :time/years,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   ["Longitud de, o elemento de la longitud de, una extensión temporal expresada en años."
    "length of, or element of the length of, a temporal extent expressed in years"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label ["duración en años" "years duration"],
   :rdfs/range :xsd/decimal})