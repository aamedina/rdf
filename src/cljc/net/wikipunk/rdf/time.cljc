(ns net.wikipunk.rdf.time
  "OWL-Time"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/w3c/sdw/gh-pages/time/rdf/time.ttl",
   :dcterms/contributor [{:rdfa/uri "mailto:chris.little@metoffice.gov.uk"}
                         {:rdfa/uri "https://orcid.org/0000-0001-8269-8171"}],
   :dcterms/created #inst "2006-09-27T00:00:00.000-00:00",
   :dcterms/creator [{:rdfa/uri "https://en.wikipedia.org/wiki/Jerry_Hobbs"}
                     {:rdfa/uri "mailto:panfeng66@gmail.com"}
                     {:rdfa/uri "http://orcid.org/0000-0002-3884-3420"}],
   :dcterms/isVersionOf {:rdfa/uri "http://www.w3.org/TR/owl-time"},
   :dcterms/license {:rdfa/uri "https://creativecommons.org/licenses/by/4.0/"},
   :dcterms/modified #inst "2021-01-27T00:00:00.000-00:00",
   :dcterms/rights
   #xsd/langString
    "Copyright © 2006-2021 W3C, OGC. W3C and OGC liability, trademark and document use rules apply.@en",
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
   :rdfs/isDefinedBy {:rdfa/uri
                      "https://www.w3.org/TR/2017/REC-owl-time-20171019/"},
   :rdfs/label [#xsd/langString "Tiempo en OWL@es"
                #xsd/langString "OWL-Time@en"],
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.semantic-web-journal.net/content/time-ontology-extended-non-gregorian-calendar-applications"}
    {:rdfa/uri "http://dx.doi.org/10.3233/SW-150187"}
    {:rdfa/uri "http://www.w3.org/TR/owl-time"}],
   :skos/changeNote
   ["2017-04-06 - hasTime, hasXSDDuration added; Number removed; all duration elements changed to xsd:decimal"
    "2016-12-20 - restore time:Year and time:January which were present in the 2006 version of the ontology, but now marked \"deprecated\". "
    "2021-01-27 - clarified definition and label for time:after and time:before"
    "2017-02 - intervalIn, intervalDisjoint, monthOfYear added; TemporalUnit subclass of TemporalDuration"
    "2016-06-15 - initial update of OWL-Time - modified to support arbitrary temporal reference systems. "
    "2016-12-20 - adjust range of time:timeZone to time:TimeZone, moved up from the tzont ontology.  "],
   :skos/historyNote
   #xsd/langString
    "Update of OWL-Time ontology, extended to support general temporal reference systems. \n\nOntology engineering by Simon J D Cox@en"}
  (:refer-clojure :exclude [second]))

(def DateTimeDescription
  "Description of date and time structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of year, month, day properties restricted to corresponding XML Schema types xsd:gYear, xsd:gMonth and xsd:gDay, respectively."
  {:db/ident :time/DateTimeDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Description of date and time structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of year, month, day properties restricted to corresponding XML Schema types xsd:gYear, xsd:gMonth and xsd:gDay, respectively.@en"
    #xsd/langString
     "Descripción de fecha y tiempo estructurada con valores separados para los diferentes elementos de un sistema calendario-reloj. El sistema de referencia temporal está fijado al calendario gregoriano, y el rango de las propiedades año, mes, día restringidas a los correspondientes tipos del XML Schema xsd:gYear, xsd:gMonth y xsd:gDay respectivamente.@es"],
   :rdfs/label [#xsd/langString "Date-Time description@en"
                #xsd/langString "descripción de fecha-tiempo@es"],
   :rdfs/subClassOf [{:owl/hasValue
                      {:rdfa/uri
                       "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian"},
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     :time/GeneralDateTimeDescription
                     {:owl/allValuesFrom :xsd/gYear,
                      :owl/onProperty    :time/year,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gDay,
                      :owl/onProperty    :time/day,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gMonth,
                      :owl/onProperty    :time/month,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/timeZone,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/second,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/week,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/month,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/monthOfYear,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfWeek,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalPosition
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfYear,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hour,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/year,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/day,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minute,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   [#xsd/langString
     "Description of date and time structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of year, month, day properties restricted to corresponding XML Schema types xsd:gYear, xsd:gMonth and xsd:gDay, respectively.@en"
    #xsd/langString
     "Descripción de fecha y tiempo estructurada con valores separados para los diferentes elementos de un sistema calendario-reloj. El sistema de referencia temporal está fijado al calendario gregoriano, y el rango de las propiedades año, mes, día restringidas a los correspondientes tipos del XML Schema xsd:gYear, xsd:gMonth y xsd:gDay respectivamente.@es"]})

(def DateTimeInterval
  "DateTimeInterval is a subclass of ProperInterval, defined using the multi-element DateTimeDescription."
  {:db/ident :time/DateTimeInterval,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "'intervalo de fecha-hora' es una subclase de 'intervalo propio', definida utilizando el multi-elemento 'descripción de fecha-hora'.@es"
    #xsd/langString
     "DateTimeInterval is a subclass of ProperInterval, defined using the multi-element DateTimeDescription.@en"],
   :rdfs/label [#xsd/langString "Date-time interval@en"
                #xsd/langString "intervalo de fecha-hora@es"],
   :rdfs/subClassOf
   [:time/ProperInterval :time/Interval :owl/Thing :time/TemporalEntity],
   :skos/definition
   [#xsd/langString
     "'intervalo de fecha-hora' es una subclase de 'intervalo propio', definida utilizando el multi-elemento 'descripción de fecha-hora'.@es"
    #xsd/langString
     "DateTimeInterval is a subclass of ProperInterval, defined using the multi-element DateTimeDescription.@en"],
   :skos/note
   [#xsd/langString
     "'intervalo de fecha-hora' se puede utilizar sólo para un intervalo cuyos límites coinciden con un elemento de fecha-hora alineados con el calendario y la zona horaria indicados. Por ejemplo, aunque ambos tienen una duración de un día, el intervalo de 24 horas que empieza en la media noche del comienzo del 8 mayo en Europa Central se puede expresar como un 'intervalo de fecha-hora', el intervalo de 24 horas que empieza a las 1:30pm no.@es"
    #xsd/langString
     ":DateTimeInterval can only be used for an interval whose limits coincide with a date-time element aligned to the calendar and timezone indicated. For example, while both have a duration of one day, the 24-hour interval beginning at midnight at the beginning of 8 May in Central Europe can be expressed as a :DateTimeInterval, but the 24-hour interval starting at 1:30pm cannot.@en"]})

(def DayOfWeek
  "The day of week"
  {:db/ident :time/DayOfWeek,
   :rdf/type :owl/Class,
   :rdfs/comment [#xsd/langString "El día de la semana@es"
                  #xsd/langString "The day of week@en"],
   :rdfs/label [#xsd/langString "Day of week@en"
                #xsd/langString "día de la semana@es"],
   :rdfs/subClassOf :owl/Thing,
   :skos/changeNote
   #xsd/langString
    "Remove enumeration from definition, in order to allow other days to be used when required in other calendars. \nNOTE: existing days are still present as members of the class, but the class membership is now open. \n\nIn the original OWL-Time the following constraint appeared: \n  owl:oneOf (\n      time:Monday\n      time:Tuesday\n      time:Wednesday\n      time:Thursday\n      time:Friday\n      time:Saturday\n      time:Sunday\n    ) ;@en",
   :skos/definition [#xsd/langString "El día de la semana@es"
                     #xsd/langString "The day of week@en"],
   :skos/note
   [#xsd/langString
     "La pertenencia a la clase 'día de la semana' está abierta, para permitir longitudes de semana alternativas y diferentes nombres de días.@es"
    #xsd/langString
     "Membership of the class :DayOfWeek is open, to allow for alternative week lengths and different day names.@en"]})

(def Duration
  "Duration of a temporal extent expressed as a number scaled by a temporal unit"
  {:db/ident :time/Duration,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Duración de una extensión temporal expresada como un número escalado por una unidad temporal.@es"
    #xsd/langString
     "Duration of a temporal extent expressed as a number scaled by a temporal unit@en"],
   :rdfs/label [#xsd/langString "Time duration@en" "duración de tiempo"],
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/numericDuration,
                      :rdf/type        :owl/Restriction}
                     :time/TemporalDuration],
   :skos/definition
   [#xsd/langString
     "Duración de una extensión temporal expresada como un número escalado por una unidad temporal.@es"
    #xsd/langString
     "Duration of a temporal extent expressed as a number scaled by a temporal unit@en"],
   :skos/note
   [#xsd/langString
     "Alternativa a 'descripción de tiempo' para proporcionar descripción soporte a una duración temporal diferente a utilizar un sistema de calendario/reloj.@es"
    #xsd/langString
     "Alternative to time:DurationDescription to support description of a temporal duration other than using a calendar/clock system.@en"]})

(def DurationDescription
  "Description of temporal extent structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of each of the numeric properties is restricted to xsd:decimal"
  {:db/ident :time/DurationDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario. El sistema de referencia temporal se fija al calendario gregoriano, y el intervalo de cada una de las propiedades numéricas se restringe a xsd:decimal.@es"
    #xsd/langString
     "Description of temporal extent structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of each of the numeric properties is restricted to xsd:decimal@en"],
   :rdfs/label [#xsd/langString "Duration description@en"
                #xsd/langString "descripción de duración@es"],
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/hours,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/seconds,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/weeks,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/years,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/months,
                      :rdf/type          :owl/Restriction}
                     {:owl/hasValue
                      {:rdfa/uri
                       "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian"},
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     :time/GeneralDurationDescription
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/minutes,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/days,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/months,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/years,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/seconds,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalDuration
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hours,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/weeks,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/days,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minutes,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   [#xsd/langString
     "Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario. El sistema de referencia temporal se fija al calendario gregoriano, y el intervalo de cada una de las propiedades numéricas se restringe a xsd:decimal.@es"
    #xsd/langString
     "Description of temporal extent structured with separate values for the various elements of a calendar-clock system. The temporal reference system is fixed to Gregorian Calendar, and the range of each of the numeric properties is restricted to xsd:decimal@en"],
   :skos/note
   [#xsd/langString
     "En el calendario gregoriano la longitud de los meses no es fija. Por lo tanto, un valor como \"2,5 meses\" no se puede comparar exactamente con una duración similar expresada en términos de semanas o días.@es"
    #xsd/langString
     "In the Gregorian calendar the length of the month is not fixed. Therefore, a value like \"2.5 months\" cannot be exactly compared with a similar duration expressed in terms of weeks or days.@en"]})

(def Friday
  "Friday"
  {:db/ident       :time/Friday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     #xsd/langString "Friday@en",
   :skos/prefLabel [#xsd/langString "Sexta-feira@pt"
                    #xsd/langString "星期五@zh"
                    #xsd/langString "الجمعة@ar"
                    #xsd/langString "Пятница@ru"
                    #xsd/langString "金曜日@ja"
                    #xsd/langString "Freitag@de"
                    #xsd/langString "Vrijdag@nl"
                    #xsd/langString "Piątek@pl"
                    #xsd/langString "Friday@en"
                    #xsd/langString "Viernes@es"
                    #xsd/langString "Vendredi@fr"
                    #xsd/langString "Venerdì@it"]})

(def GeneralDateTimeDescription
  "Description of date and time structured with separate values for the various elements of a calendar-clock system"
  {:db/ident :time/GeneralDateTimeDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Description of date and time structured with separate values for the various elements of a calendar-clock system@en"
    #xsd/langString
     "Descripción de fecha y hora estructurada con valores separados para los distintos elementos de un sistema calendario-reloj.@es"],
   :rdfs/label [#xsd/langString "Generalized date-time description@en"
                #xsd/langString "descripción de fecha-hora generalizada@es"],
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :time/minute,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfWeek,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/week,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfYear,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/second,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/month,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/day,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/timeZone,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalPosition
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/year,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hour,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/monthOfYear,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   [#xsd/langString
     "Description of date and time structured with separate values for the various elements of a calendar-clock system@en"
    "Descripción de fecha y hora estructurada con valores separados para los distintos elementos de un sistema calendario-reloj."],
   :skos/note
   ["Some combinations of properties are redundant - for example, within a specified :year if :dayOfYear is provided then :day and :month can be computed, and vice versa. Individual values should be consistent with each other and the calendar, indicated through the value of the :hasTRS property."
    #xsd/langString
     "Algunas combinaciones de propiedades son redundantes - por ejemplo, dentro de un 'año' especificado si se proporciona 'día del año' entonces 'día' y 'mes' se pueden computar, y viceversa. Los valores individuales deberían ser consistentes entre ellos y con el calendario, indicado a través del valor de la propiedad 'tiene TRS'.@es"]})

(def GeneralDurationDescription
  "Description of temporal extent structured with separate values for the various elements of a calendar-clock system."
  {:db/ident :time/GeneralDurationDescription,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Description of temporal extent structured with separate values for the various elements of a calendar-clock system.@en"
    #xsd/langString
     "Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario.@es"],
   :rdfs/label [#xsd/langString "Generalized duration description@en"
                #xsd/langString "descripción de duración generalizada@es"],
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :time/hours,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     :time/TemporalDuration
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/weeks,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/days,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minutes,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/months,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/seconds,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/years,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   [#xsd/langString
     "Descripción de extensión temporal estructurada con valores separados para los distintos elementos de un sistema de horario-calendario.@es"
    #xsd/langString
     "Description of temporal extent structured with separate values for the various elements of a calendar-clock system.@en"],
   :skos/note
   [#xsd/langString
     "The extent of a time duration expressed as a GeneralDurationDescription depends on the Temporal Reference System. In some calendars the length of the week or month is not constant within the year. Therefore, a value like \"2.5 months\" may not necessarily be exactly compared with a similar duration expressed in terms of weeks or days. When non-earth-based calendars are considered even more care must be taken in comparing durations.@en"
    #xsd/langString
     "La extensión de una duración de tiempo expresada como una 'descripción de duración general' depende del Sistema de Referencia Temporal. En algunos calendarios la longitud de la semana o del mes no es constante a lo largo del año. Por tanto, un valor como \"25 meses\" puede no ser necesariamente ser comparado con un duración similar expresada en términos de semanas o días. Cuando se consideran calendarios que no están basados en el movimiento de la Tierra, se deben tomar incluso más precauciones en la comparación de duraciones.@es"]})

(def Instant
  "A temporal entity with zero extent or duration"
  {:db/ident :time/Instant,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString "Una entidad temporal con una extensión o duración cero.@es"
    #xsd/langString "A temporal entity with zero extent or duration@en"],
   :rdfs/label [#xsd/langString "instante de tiempo.@es"
                #xsd/langString "Time instant@en"],
   :rdfs/subClassOf [:time/TemporalEntity :owl/Thing],
   :skos/definition
   [#xsd/langString "Una entidad temporal con una extensión o duración cero.@es"
    #xsd/langString "A temporal entity with zero extent or duration@en"]})

(def Interval
  "A temporal entity with an extent or duration"
  {:db/ident        :time/Interval,
   :rdf/type        :owl/Class,
   :rdfs/comment    [#xsd/langString
                      "Una entidad temporal con una extensión o duración.@es"
                     #xsd/langString
                      "A temporal entity with an extent or duration@en"],
   :rdfs/label      [#xsd/langString "intervalo de tiempo@es"
                     #xsd/langString "Time interval@en"],
   :rdfs/subClassOf [:time/TemporalEntity :owl/Thing],
   :skos/definition [#xsd/langString
                      "Una entidad temporal con una extensión o duración.@es"
                     #xsd/langString
                      "A temporal entity with an extent or duration@en"]})

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
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/timeZone,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/second,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/week,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gYear,
                      :owl/onProperty    :time/year,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/month,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/monthOfYear,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gDay,
                      :owl/onProperty    :time/day,
                      :rdf/type          :owl/Restriction}
                     {:owl/hasValue
                      {:rdfa/uri
                       "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian"},
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gMonth,
                      :owl/onProperty    :time/month,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfWeek,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalPosition
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfYear,
                      :rdf/type           :owl/Restriction}
                     :time/GeneralDateTimeDescription
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hour,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/year,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/day,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minute,
                      :rdf/type           :owl/Restriction}],
   :skos/historyNote
   "This class was present in the 2006 version of OWL-Time. It was presented as an example of how DateTimeDescription could be specialized, but does not belong in the revised ontology. "})

(def Monday
  "Monday"
  {:db/ident       :time/Monday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     #xsd/langString "Monday@en",
   :skos/prefLabel [#xsd/langString "Segunda-feira@pt"
                    #xsd/langString "星期一@zh"
                    #xsd/langString "Poniedziałek@pl"
                    #xsd/langString "Maandag@nl"
                    #xsd/langString "Понедельник@ru"
                    #xsd/langString "Lunedì@it"
                    #xsd/langString "月曜日@ja"
                    #xsd/langString "الاثنين@ar"
                    #xsd/langString "Montag@de"
                    #xsd/langString "Lundi@fr"
                    #xsd/langString "Lunes@es"
                    #xsd/langString "Monday@en"]})

(def MonthOfYear
  "The month of the year"
  {:db/ident :time/MonthOfYear,
   :rdf/type :owl/Class,
   :rdfs/comment [#xsd/langString "The month of the year@en"
                  #xsd/langString "El mes del año.@es"],
   :rdfs/label [#xsd/langString "mes del año@es"
                #xsd/langString "Month of year@en"],
   :rdfs/subClassOf [:time/DateTimeDescription
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/hour,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/year,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/day,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/week,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/second,
                      :rdf/type        :owl/Restriction}
                     {:owl/hasValue   :time/unitMonth,
                      :owl/onProperty :time/unitType,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/month,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/minute,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/unitType,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/timeZone,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/week,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/monthOfYear,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gDay,
                      :owl/onProperty    :time/day,
                      :rdf/type          :owl/Restriction}
                     {:owl/hasValue
                      {:rdfa/uri
                       "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian"},
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gMonth,
                      :owl/onProperty    :time/month,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfWeek,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalPosition
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/year,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/day,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/second,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/gYear,
                      :owl/onProperty    :time/year,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/month,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/dayOfYear,
                      :rdf/type           :owl/Restriction}
                     :time/GeneralDateTimeDescription
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hour,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minute,
                      :rdf/type           :owl/Restriction}],
   :skos/definition [#xsd/langString "El mes del año.@es"
                     #xsd/langString "The month of the year@en"],
   :skos/editorialNote
   [#xsd/langString
     "Feature at risk - added in 2017 revision, and not yet widely used. @en"
    #xsd/langString
     "Característica en riesgo - añadida en la revisión de 2017, y no utilizada todavía de forma amplia.@es"],
   :skos/note
   [#xsd/langString
     "La pertenencia a la clase 'mes del año' está abierta, a permitir calendarios anuales alternativos y diferentes nombres de meses.@es"
    #xsd/langString
     "Membership of the class :MonthOfYear is open, to allow for alternative annual calendars and different month names.@en"]})

(def ProperInterval
  "A temporal entity with non-zero extent or duration, i.e. for which the value of the beginning and end are different"
  {:db/ident :time/ProperInterval,
   :owl/disjointWith :time/Instant,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Una entidad temporal con extensión o duración distinta de cero, es decir, para la cual los valores de principio y fin del intervalo son diferentes.@es"
    #xsd/langString
     "A temporal entity with non-zero extent or duration, i.e. for which the value of the beginning and end are different@en"],
   :rdfs/label [#xsd/langString "intervalo propio@es"
                #xsd/langString "Proper interval@en"],
   :rdfs/subClassOf [:time/Interval :owl/Thing :time/TemporalEntity],
   :skos/definition
   [#xsd/langString
     "Una entidad temporal con extensión o duración distinta de cero, es decir, para la cual los valores de principio y fin del intervalo son diferentes.@es"
    #xsd/langString
     "A temporal entity with non-zero extent or duration, i.e. for which the value of the beginning and end are different@en"]})

(def Saturday
  "Saturday"
  {:db/ident       :time/Saturday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     #xsd/langString "Saturday@en",
   :skos/prefLabel [#xsd/langString "Samstag@de"
                    #xsd/langString "Saturday@en"
                    #xsd/langString "Samedi@fr"
                    #xsd/langString "星期六@zh"
                    #xsd/langString "Sobota@pl"
                    #xsd/langString "Суббота@ru"
                    #xsd/langString "Zaterdag@nl"
                    #xsd/langString "Sábado@es"
                    #xsd/langString "Sábado@pt"
                    #xsd/langString "Sabato@it"
                    #xsd/langString "土曜日@ja"
                    #xsd/langString "السبت@ar"]})

(def Sunday
  "Sunday"
  {:db/ident       :time/Sunday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     #xsd/langString "Sunday@en",
   :skos/prefLabel [#xsd/langString "星期日@zh"
                    #xsd/langString "Domenica@it"
                    #xsd/langString "日曜日@ja"
                    #xsd/langString "Dimanche@fr"
                    #xsd/langString "Niedziela@pl"
                    #xsd/langString "الأحد (يوم)@ar"
                    #xsd/langString "Domingo@es"
                    #xsd/langString "Domingo@pt"
                    #xsd/langString "Sonntag@de"
                    #xsd/langString "Воскресенье@ru"
                    #xsd/langString "Sunday@en"
                    #xsd/langString "Zondag@nl"]})

(def TRS
  "A temporal reference system, such as a temporal coordinate system (with an origin, direction, and scale), a calendar-clock combination, or a (possibly hierarchical) ordinal system. \n\nThis is a stub class, representing the set of all temporal reference systems."
  {:db/ident :time/TRS,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Un sistema de referencia temporal, tal como un sistema de coordenadas temporales (con un origen, una dirección y una escala), una combinación calendario-reloj, o un sistema ordinal (posiblemente jerárquico).\n        Esta clase comodín representa el conjunto de todos los sistemas de referencia temporal.@es"
    #xsd/langString
     "A temporal reference system, such as a temporal coordinate system (with an origin, direction, and scale), a calendar-clock combination, or a (possibly hierarchical) ordinal system. \n\nThis is a stub class, representing the set of all temporal reference systems.@en"],
   :rdfs/label [#xsd/langString "sistema de referencia temporal@es"
                #xsd/langString "Temporal Reference System@en"],
   :skos/definition
   [#xsd/langString
     "Un sistema de referencia temporal, tal como un sistema de coordenadas temporales (con un origen, una dirección y una escala), una combinación calendario-reloj, o un sistema ordinal (posiblemente jerárquico).\n    Esta clase comodín representa el conjunto de todos los sistemas de referencia temporal.@es"
    #xsd/langString
     "A temporal reference system, such as a temporal coordinate system (with an origin, direction, and scale), a calendar-clock combination, or a (possibly hierarchical) ordinal system. \n\nThis is a stub class, representing the set of all temporal reference systems.@en"],
   :skos/note
   [#xsd/langString
     "En el ISO 19108:2002 [ISO19108] se proporciona una taxonomía de sistemas de referencia temporal, incluyendo (a) sistemas de calendario + reloj; (b) sistemas de coordenadas temporales (es decir, desplazamiento numérico a partir de una época); (c) sistemas de referencia ordinales temporales (es decir, secuencia ordenada de intervalos nombrados, no necesariamente de igual duración).@es"
    #xsd/langString
     "A taxonomy of temporal reference systems is provided in ISO 19108:2002 [ISO19108], including (a) calendar + clock systems; (b) temporal coordinate systems (i.e. numeric offset from an epoch); (c) temporal ordinal reference systems (i.e. ordered sequence of named intervals, not necessarily of equal duration).@en"]})

(def TemporalDuration
  "Time extent; duration of a time interval separate from its particular start position"
  {:db/ident :time/TemporalDuration,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Extensión de tiempo; duración de un intervalo de tiempo independiente de su posición de inicio particular.@es"
    #xsd/langString
     "Time extent; duration of a time interval separate from its particular start position@en"],
   :rdfs/label [#xsd/langString "duración temporal@es"
                #xsd/langString "Temporal duration@en"],
   :skos/definition
   [#xsd/langString
     "Extensión de tiempo; duración de un intervalo de tiempo independiente de su posición de inicio particular.@es"
    #xsd/langString
     "Time extent; duration of a time interval separate from its particular start position@en"]})

(def TemporalEntity
  "A temporal interval or instant."
  {:db/ident        :time/TemporalEntity,
   :owl/unionOf     [:time/Instant :time/Interval],
   :rdf/type        :owl/Class,
   :rdfs/comment    [#xsd/langString "Un intervalo temporal o un instante.@es"
                     #xsd/langString "A temporal interval or instant.@en"],
   :rdfs/label      [#xsd/langString "entidad temporal@es"
                     #xsd/langString "Temporal entity@en"],
   :rdfs/subClassOf :owl/Thing,
   :skos/definition [#xsd/langString "Un intervalo temporal o un instante.@es"
                     #xsd/langString "A temporal interval or instant.@en"]})

(def TemporalPosition
  "A position on a time-line"
  {:db/ident        :time/TemporalPosition,
   :rdf/type        :owl/Class,
   :rdfs/comment    [#xsd/langString
                      "Una posición sobre una línea de tiempo.@es"
                     #xsd/langString "A position on a time-line@en"],
   :rdfs/label      [#xsd/langString "posición temporal@es"
                     #xsd/langString "Temporal position@en"],
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction},
   :skos/definition [#xsd/langString
                      "Una posición sobre una línea de tiempo.@es"
                     #xsd/langString "A position on a time-line@en"]})

(def TemporalUnit
  "A standard duration, which provides a scale factor for a time extent, or the granularity or precision for a time position."
  {:db/ident :time/TemporalUnit,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Una duración estándar, que proporciona un factor de escala para una extensión de tiempo, o la granularidad o precisión para una posición de tiempo.@es"
    #xsd/langString
     "A standard duration, which provides a scale factor for a time extent, or the granularity or precision for a time position.@en"],
   :rdfs/label [#xsd/langString "Temporal unit@en"
                #xsd/langString "unidad de tiempo@es"],
   :rdfs/subClassOf :time/TemporalDuration,
   :skos/changeNote
   #xsd/langString
    "Remove enumeration from definition, in order to allow other units to be used when required in other coordinate systems. \nNOTE: existing units are still present as members of the class, but the class membership is now open. \n\nIn the original OWL-Time the following constraint appeared: \n  owl:oneOf (\n      time:unitSecond\n      time:unitMinute\n      time:unitHour\n      time:unitDay\n      time:unitWeek\n      time:unitMonth\n      time:unitYear\n    ) ;@en",
   :skos/definition
   [#xsd/langString
     "A standard duration, which provides a scale factor for a time extent, or the granularity or precision for a time position.@en"
    #xsd/langString
     "Una duración estándar, que proporciona un factor de escala para una extensión de tiempo, o la granularidad o precisión para una posición de tiempo.@es"],
   :skos/note
   [#xsd/langString
     "Membership of the class TemporalUnit is open, to allow for other temporal units used in some technical applications (e.g. millions of years, Baha'i month).@en"
    #xsd/langString
     "La pertenencia de la clase 'unidad de tiempo' está abierta, para permitir otras unidades de tiempo utilizadas en algunas aplicaciones técnicas (por ejemplo, millones de años o el mes Baha'i).@es"]})

(def Thursday
  "Thursday"
  {:db/ident       :time/Thursday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     #xsd/langString "Thursday@en",
   :skos/prefLabel [#xsd/langString "Giovedì@it"
                    #xsd/langString "Thursday@en"
                    #xsd/langString "木曜日@ja"
                    #xsd/langString "星期四@zh"
                    #xsd/langString "Jueves@es"
                    #xsd/langString "Quinta-feira@pt"
                    #xsd/langString "Jeudi@fr"
                    #xsd/langString "Donderdag@nl"
                    #xsd/langString "Czwartek@pl"
                    #xsd/langString "Donnerstag@de"
                    #xsd/langString "الخميس@ar"
                    #xsd/langString "Четверг@ru"]})

(def TimePosition
  "A temporal position described using either a (nominal) value from an ordinal reference system, or a (numeric) value in a temporal coordinate system. "
  {:db/ident :time/TimePosition,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "Una posición temporal descrita utilizando bien un valor (nominal) de un sistema de referencia ordinal, o un valor (numérico) en un sistema de coordenadas temporales.@es"
    #xsd/langString
     "A temporal position described using either a (nominal) value from an ordinal reference system, or a (numeric) value in a temporal coordinate system. @en"],
   :rdfs/label [#xsd/langString "posición de tiempo@es"
                #xsd/langString "Time position@en"],
   :rdfs/subClassOf [{:owl/unionOf [{:owl/cardinality 1,
                                     :owl/onProperty  :time/numericPosition,
                                     :rdf/type        :owl/Restriction}
                                    {:owl/cardinality 1,
                                     :owl/onProperty  :time/nominalPosition,
                                     :rdf/type        :owl/Restriction}],
                      :rdf/type    :owl/Class}
                     :time/TemporalPosition
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   [#xsd/langString
     "Una posición temporal descrita utilizando bien un valor (nominal) de un sistema de referencia ordinal, o un valor (numérico) en un sistema de coordenadas temporales.@es"
    #xsd/langString
     "A temporal position described using either a (nominal) value from an ordinal reference system, or a (numeric) value in a temporal coordinate system. @en"]})

(def TimeZone
  "A Time Zone specifies the amount by which the local time is offset from UTC. \n\tA time zone is usually denoted geographically (e.g. Australian Eastern Daylight Time), with a constant value in a given region. \nThe region where it applies and the offset from UTC are specified by a locally recognised governing authority."
  {:db/ident :time/TimeZone,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "A Time Zone specifies the amount by which the local time is offset from UTC. \n\tA time zone is usually denoted geographically (e.g. Australian Eastern Daylight Time), with a constant value in a given region. \nThe region where it applies and the offset from UTC are specified by a locally recognised governing authority.@en"
    #xsd/langString
     "Un huso horario especifica la cantidad en que la hora local está desplazada con respecto a UTC.\n        Un huso horario normalmente se denota geográficamente (p.ej. el horario de verano del este de Australia), con un valor constante en una región dada.\n        La región donde aplica y el desplazamiento desde UTC las especifica una autoridad gubernamental localmente reconocida.@es"],
   :rdfs/label [#xsd/langString "huso horario@es"
                #xsd/langString "Time Zone@en"],
   :skos/definition
   [#xsd/langString
     "A Time Zone specifies the amount by which the local time is offset from UTC. \n\tA time zone is usually denoted geographically (e.g. Australian Eastern Daylight Time), with a constant value in a given region. \nThe region where it applies and the offset from UTC are specified by a locally recognised governing authority.@en"
    #xsd/langString
     "Un huso horario especifica la cantidad en que la hora local está desplazada con respecto a UTC.\n    Un huso horario normalmente se denota geográficamente (p.ej. el horario de verano del este de Australia), con un valor constante en una región dada.\n    La región donde aplica y el desplazamiento desde UTC las especifica una autoridad gubernamental localmente reconocida.@es"],
   :skos/historyNote
   ["In the original 2006 version of OWL-Time, the TimeZone class, with several properties corresponding to a specific model of time-zones, was defined in a separate namespace \"http://www.w3.org/2006/timezone#\". \n\nIn the current version a class with same local name is put into the main OWL-Time namespace, removing the dependency on the external namespace. \n\nAn alignment axiom \n\ttzont:TimeZone rdfs:subClassOf time:TimeZone . \nallows data encoded according to the previous version to be consistent with the updated ontology. "
    #xsd/langString
     "En la versión original de OWL-Time de 2006, se definió, en un espacio de nombres diferente \"http://www.w3.org/2006/timezone#\", la clase 'huso horario', con varias propiedades específicas correspondientes a un modelo específico de huso horario.\n    En la versión actual hay una clase con el mismo nombre local en el espacio de nombres de OWL-Time, eliminando la dependencia del espacio de nombres externo.\n    Un axioma de alineación permite que los datos codificados de acuerdo con la versión anterior sean consistentes con la ontología actualizada.@es"],
   :skos/note
   [#xsd/langString
     "Un huso horario designado está asociado con una región geográfica. Sin embargo, para una región particular el desplazamiento desde UTC a menudo varía según las estaciones, y las fechas de los cambios pueden variar de un año a otro. La designación de huso horario  normalmente cambia de una estación a otra (por ejemplo, el horario estándar frente al horario de verano ambos del este de Australia). Además, del desplazamiento para un huso horario puede cambiar sobre escalas de tiempo mayores, aunque su designación no lo haga.\n    Se puede encontrar una guía detallada sobre el funcionamiento de husos horarios en http://www.w3.org/TR/timezone/.\"@es , \"En [owl-time-20060927] se describió una ontología para descripciones de husos horarios, y se proporcionó en un espacio de nombres separado tzont:. Sin embargo, dicha ontología estaba incompleta en su alcance, y el ejemplo de conjuntos de datos (datasets) era selectivo. Además, puesto que el uso de una clase de una ontología externa como el rango de una propiedad de objeto en OWL-Time crea una dependencia, la referencia a la clase huso horario se ha reemplazado por una clase que viene a ser un \"cajón de sastre\" en la en la parte normativa de esta versión de OWL-Time.@es"
    #xsd/langString
     "An ontology for time zone descriptions was described in [owl-time-20060927] and provided as RDF in a separate namespace tzont:. However, that ontology was incomplete in scope, and the example datasets were selective. Furthermore, since the use of a class from an external ontology as the range of an ObjectProperty in OWL-Time creates a dependency, reference to the time zone class has been replaced with the 'stub' class in the normative part of this version of OWL-Time.@en"
    #xsd/langString
     "A designated timezone is associated with a geographic region. However, for a particular region the offset from UTC often varies seasonally, and the dates of the changes may vary from year to year. The timezone designation usually changes for the different seasons (e.g. Australian Eastern Standard Time vs. Australian Eastern Daylight Time). Furthermore, the offset for a timezone may change over longer timescales, though its designation might not.  \n\nDetailed guidance about working with time zones is given in http://www.w3.org/TR/timezone/ .@en"],
   :skos/scopeNote
   ["In this implementation TimeZone has no properties defined. It should be thought of as an 'abstract' superclass of all specific timezone implementations."
    #xsd/langString
     "En esta implementación 'huso horario' no tiene definidas propiedades. Se debería pensar como una superclase \"abstracta\" de todas las implementaciones de huso horario específicas.@es"]})

(def Tuesday
  "Tuesday"
  {:db/ident       :time/Tuesday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     #xsd/langString "Tuesday@en",
   :skos/prefLabel [#xsd/langString "Martedì@it"
                    #xsd/langString "星期二@zh"
                    #xsd/langString "Martes@es"
                    #xsd/langString "Tuesday@en"
                    #xsd/langString "Wtorek@pl"
                    #xsd/langString "火曜日@ja"
                    #xsd/langString "Dinsdag@nl"
                    #xsd/langString "Вторник@ru"
                    #xsd/langString "Mardi@fr"
                    #xsd/langString "الثلاثاء@ar"
                    #xsd/langString "Terça-feira@pt"
                    #xsd/langString "Dienstag@de"]})

(def Wednesday
  "Wednesday"
  {:db/ident       :time/Wednesday,
   :rdf/type       [:time/DayOfWeek :owl/Thing],
   :rdfs/label     #xsd/langString "Wednesday@en",
   :skos/prefLabel [#xsd/langString "Wednesday@en"
                    #xsd/langString "Miércoles@es"
                    #xsd/langString "Mittwoch@de"
                    #xsd/langString "الأربعاء@ar"
                    #xsd/langString "星期三@zh"
                    #xsd/langString "Środa@pl"
                    #xsd/langString "Quarta-feira@pt"
                    #xsd/langString "水曜日@ja"
                    #xsd/langString "Mercredi@fr"
                    #xsd/langString "Woensdag@nl"
                    #xsd/langString "Среда@ru"
                    #xsd/langString "Mercoledì@it"]})

(def Year
  "Year duration"
  {:db/ident :time/Year,
   :owl/deprecated true,
   :rdf/type [:owl/Class :owl/DeprecatedClass],
   :rdfs/comment "Year duration",
   :rdfs/label #xsd/langString "Year@en",
   :rdfs/subClassOf [{:owl/cardinality 0,
                      :owl/onProperty  :time/hours,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/seconds,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/days,
                      :rdf/type        :owl/Restriction}
                     :time/DurationDescription
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/minutes,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/years,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/weeks,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :time/months,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/minutes,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/months,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/days,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/years,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/years,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/hours,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :time/hasTRS,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/hours,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue
                      {:rdfa/uri
                       "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian"},
                      :owl/onProperty :time/hasTRS,
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/seconds,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/weeks,
                      :rdf/type          :owl/Restriction}
                     :time/GeneralDurationDescription
                     {:owl/allValuesFrom :xsd/decimal,
                      :owl/onProperty    :time/months,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/seconds,
                      :rdf/type           :owl/Restriction}
                     :time/TemporalDuration
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/weeks,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/days,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :time/minutes,
                      :rdf/type           :owl/Restriction}],
   :skos/definition "Year duration",
   :skos/historyNote
   "Year was proposed in the 2006 version of OWL-Time as an example of how DurationDescription could be specialized to allow for a duration to be restricted to a number of years. \n\nIt is deprecated in this edition of OWL-Time. ",
   :skos/prefLabel [#xsd/langString "年@ja"
                    #xsd/langString "年@zh"
                    #xsd/langString "Год@ru"
                    #xsd/langString "Year@en"
                    #xsd/langString "Année (calendrier)@fr"
                    #xsd/langString "Jahr@de"
                    #xsd/langString "Año@es"
                    #xsd/langString "Jaar@nl"
                    #xsd/langString "Rok@pl"
                    #xsd/langString "سنة@ar"
                    #xsd/langString "Anno@it"
                    #xsd/langString "Ano@pt"]})

(def after
  "The subject is a temporal entity that occurs after the object. If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after the end of T2."
  {:db/ident :time/after,
   :owl/inverseOf :time/before,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "The subject is a temporal entity that occurs after the object. If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after the end of T2.@en"
    #xsd/langString
     "Asume una dirección en el tiempo. Si una entidad temporal T1 está después de otra entidad temporal T2, entonces el principio de T1 está después del final de T2.@es"],
   :rdfs/domain :time/TemporalEntity,
   :rdfs/label [#xsd/langString "is after@en" #xsd/langString "después@es"],
   :rdfs/range :time/TemporalEntity,
   :skos/definition
   [#xsd/langString
     "Gives directionality to time. If a temporal entity T1 is after another temporal entity T2, then the beginning of T1 is after the end of T2.@en"
    #xsd/langString
     "Asume una dirección en el tiempo. Si una entidad temporal T1 está después de otra entidad temporal T2, entonces el principio de T1 está después del final de T2.@es"]})

(def before
  "The subject is a temporal entity that occurs before the object. If a temporal entity T1 is before another temporal entity T2, then the end of T1 is before the beginning of T2. Thus, \"before\" can be considered to be basic to instants and derived for intervals."
  {:db/ident :time/before,
   :owl/inverseOf :time/after,
   :rdf/type [:owl/ObjectProperty :owl/TransitiveProperty],
   :rdfs/comment
   [#xsd/langString
     "Asume una dirección en el tiempo. Si una entidad temporal T1 está antes que otra entidad temporal T2, entonces el final de T1 está antes que el principio de T2. Así, \"antes\" se puede considerar básica para instantes y derivada para intervalos.@es"
    #xsd/langString
     "The subject is a temporal entity that occurs before the object. If a temporal entity T1 is before another temporal entity T2, then the end of T1 is before the beginning of T2. Thus, \"before\" can be considered to be basic to instants and derived for intervals.@en"],
   :rdfs/domain :time/TemporalEntity,
   :rdfs/label [#xsd/langString "is before@en" #xsd/langString "antes@es"],
   :rdfs/range :time/TemporalEntity,
   :skos/definition
   [#xsd/langString
     "Asume una dirección en el tiempo. Si una entidad temporal T1 está antes que otra entidad temporal T2, entonces el final de T1 está antes que el principio de T2. Así, \"antes\" se puede considerar básica para instantes y derivada para intervalos.@es"
    #xsd/langString
     "Gives directionality to time. If a temporal entity T1 is before another temporal entity T2, then the end of T1 is before the beginning of T2. Thus, \"before\" can be considered to be basic to instants and derived for intervals.@en"]})

(def day
  "Day position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar day from any calendar. "
  {:db/ident :time/day,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString "Posición de día en un sistema calendario-reloj.@es"
    #xsd/langString
     "Day position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar day from any calendar. @en"],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [#xsd/langString "día@es" #xsd/langString "day@en"],
   :skos/definition
   [#xsd/langString
     "Posición de día en un sistema calendario-reloj.\n\nEl rango de esta propiedad no está especificado, por tanto, se puede reemplazar por una representación específica de un día de calendario de cualquier calendario.@es"
    #xsd/langString
     "Day position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar day from any calendar. @en"]})

(def dayOfWeek
  "El día de la semana, cuyo valor es un miembro de la clase 'día de la semana'."
  {:db/ident :time/dayOfWeek,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["El día de la semana, cuyo valor es un miembro de la clase 'día de la semana'."
    #xsd/langString
     "The day of week, whose value is a member of the class time:DayOfWeek@en"],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [#xsd/langString "día de la semana@es"
                #xsd/langString "day of week@en"],
   :rdfs/range :time/DayOfWeek,
   :skos/definition
   [#xsd/langString
     "El día de la semana, cuyo valor es un miembro de la clase 'día de la semana'.@es"
    #xsd/langString
     "The day of week, whose value is a member of the class time:DayOfWeek@en"]})

(def dayOfYear
  "The number of the day within the year"
  {:db/ident        :time/dayOfYear,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    [#xsd/langString "El número de día en el año.@es"
                     #xsd/langString
                      "The number of the day within the year@en"],
   :rdfs/domain     :time/GeneralDateTimeDescription,
   :rdfs/label      [#xsd/langString "día del año@es"
                     #xsd/langString "day of year@en"],
   :rdfs/range      :xsd/nonNegativeInteger,
   :skos/definition [#xsd/langString "El número de día en el año.@es"
                     #xsd/langString
                      "The number of the day within the year@en"]})

(def days
  "length of, or element of the length of, a temporal extent expressed in days"
  {:db/ident :time/days,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en días.@es"
    #xsd/langString
     "length of, or element of the length of, a temporal extent expressed in days@en"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [#xsd/langString "duración en días@es"
                #xsd/langString "days duration@en"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [#xsd/langString
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en días.@es"
    #xsd/langString
     "length of, or element of the length of, a temporal extent expressed in days@en"]})

(def generalDay
  "Day of month - formulated as a text string with a pattern constraint to reproduce the same lexical form as gDay, except that values up to 99 are permitted, in order to support calendars with more than 31 days in a month. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."
  {:db/ident :time/generalDay,
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "---(0[1-9]|[1-9][0-9])(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   [#xsd/langString
     "Día del mes - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gDay, excepto que se permiten valores hasta el 99, con el propósito de proporcionar soporte a calendarios con meses con más de 31 días.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo.@es"
    #xsd/langString
     "Day of month - formulated as a text string with a pattern constraint to reproduce the same lexical form as gDay, except that values up to 99 are permitted, in order to support calendars with more than 31 days in a month. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type.@en"],
   :rdfs/label [#xsd/langString "Día generalizado@es"
                #xsd/langString "Generalized day@en"],
   :skos/definition
   [#xsd/langString
     "Día del mes - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gDay, excepto que se permiten valores hasta el 99, con el propósito de proporcionar soporte a calendarios con meses con más de 31 días.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo.@es"
    #xsd/langString
     "Day of month - formulated as a text string with a pattern constraint to reproduce the same lexical form as gDay, except that values up to 99 are permitted, in order to support calendars with more than 31 days in a month. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type.@en"]})

(def generalMonth
  "Month of year - formulated as a text string with a pattern constraint to reproduce the same lexical form as gMonth, except that values up to 20 are permitted, in order to support calendars with more than 12 months in the year. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."
  {:db/ident :time/generalMonth,
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "--(0[1-9]|1[0-9]|20)(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   [#xsd/langString
     "Mes del año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gMonth, excepto que se permiten valores hasta el 20, con el propósito de proporcionar soporte a calendarios con años con más de 12 meses.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo.@es"
    #xsd/langString
     "Month of year - formulated as a text string with a pattern constraint to reproduce the same lexical form as gMonth, except that values up to 20 are permitted, in order to support calendars with more than 12 months in the year. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type.@en"],
   :rdfs/label [#xsd/langString "Mes generalizado@es"
                #xsd/langString "Generalized month@en"],
   :skos/definition
   [#xsd/langString
     "Mes del año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gMonth, excepto que se permiten valores hasta el 20, con el propósito de proporcionar soporte a calendarios con años con más de 12 meses.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo.@es"
    #xsd/langString
     "Month of year - formulated as a text string with a pattern constraint to reproduce the same lexical form as gMonth, except that values up to 20 are permitted, in order to support calendars with more than 12 months in the year. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type.@en"]})

(def generalYear
  "Year number - formulated as a text string with a pattern constraint to reproduce the same lexical form as gYear, but not restricted to values from the Gregorian calendar. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type."
  {:db/ident :time/generalYear,
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?([1-9][0-9]{3,}|0[0-9]{3})(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   [#xsd/langString
     "Número de año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gYear, aunque no está restringido a valores del calendario gregoriano.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo.@es"
    #xsd/langString
     "Year number - formulated as a text string with a pattern constraint to reproduce the same lexical form as gYear, but not restricted to values from the Gregorian calendar. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type.@en"],
   :rdfs/label [#xsd/langString "Año generalizado@es"
                #xsd/langString "Generalized year@en"],
   :skos/definition
   [#xsd/langString
     "Número de año - formulado como una cadena de texto con una restricción patrón para reproducir la misma forma léxica que gYear, aunque no está restringido a valores del calendario gregoriano.\n            Nótese que el espacio de valores no está definido, por tanto, un procesador genérico de OWL2 no puede computar relaciones de orden de valores de este tipo.@es"
    #xsd/langString
     "Year number - formulated as a text string with a pattern constraint to reproduce the same lexical form as gYear, but not restricted to values from the Gregorian calendar. \nNote that the value-space is not defined, so a generic OWL2 processor cannot compute ordering relationships of values of this type.@en"]})

(def hasBeginning
  "Beginning of a temporal entity"
  {:db/ident           :time/hasBeginning,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       [#xsd/langString "Comienzo de una entidad temporal.@es"
                        #xsd/langString "Beginning of a temporal entity@en"],
   :rdfs/domain        :time/TemporalEntity,
   :rdfs/label         [#xsd/langString "tiene principio@es"
                        #xsd/langString "has beginning@en"],
   :rdfs/range         :time/Instant,
   :rdfs/subPropertyOf :time/hasTime,
   :skos/definition    [#xsd/langString "Comienzo de una entidad temporal.@es"
                        #xsd/langString "Beginning of a temporal entity.@en"]})

(def hasDateTimeDescription
  "Value of DateTimeInterval expressed as a structured value. The beginning and end of the interval coincide with the limits of the shortest element in the description."
  {:db/ident :time/hasDateTimeDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Valor de intervalo de fecha-hora expresado como un valor estructurado. El principio y el final del intervalo coincide con los límites del elemento más corto en la descripción.@es"
    #xsd/langString
     "Value of DateTimeInterval expressed as a structured value. The beginning and end of the interval coincide with the limits of the shortest element in the description.@en"],
   :rdfs/domain :time/DateTimeInterval,
   :rdfs/label [#xsd/langString "tiene descripción fecha-hora@es"
                #xsd/langString "has Date-Time description@en"],
   :rdfs/range :time/GeneralDateTimeDescription,
   :skos/definition
   [#xsd/langString
     "Valor de intervalo de fecha-hora expresado como un valor estructurado. El principio y el final del intervalo coincide con los límites del elemento más corto en la descripción.@es"
    #xsd/langString
     "Value of DateTimeInterval expressed as a structured value. The beginning and end of the interval coincide with the limits of the shortest element in the description.@en"]})

(def hasDuration
  "Duration of a temporal entity, expressed as a scaled value or nominal value"
  {:db/ident :time/hasDuration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Duración de una entidad temporal, expresada como un valor escalado o un valor nominal.@es"
    #xsd/langString
     "Duration of a temporal entity, expressed as a scaled value or nominal value@en"],
   :rdfs/label [#xsd/langString "tiene duración@es"
                #xsd/langString "has duration@en"],
   :rdfs/range :time/Duration,
   :rdfs/subPropertyOf :time/hasTemporalDuration,
   :skos/definition
   [#xsd/langString
     "Duración de una entidad temporal, evento o actividad, o cosa, expresada como un valor escalado.@es"
    #xsd/langString
     "Duration of a temporal entity, event or activity, or thing, expressed as a scaled value@en"]})

(def hasDurationDescription
  "Duration of a temporal entity, expressed using a structured description"
  {:db/ident :time/hasDurationDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Duración de una entidad temporal, expresada utilizando una descripción estructurada.@es"
    #xsd/langString
     "Duration of a temporal entity, expressed using a structured description@en"],
   :rdfs/label [#xsd/langString "tiene descripción de duración@es"
                #xsd/langString "has duration description@en"],
   :rdfs/range :time/GeneralDurationDescription,
   :rdfs/subPropertyOf :time/hasTemporalDuration,
   :skos/definition
   [#xsd/langString
     "Duración de una entidad temporal, expresada utilizando una descripción estructurada.@es"
    #xsd/langString
     "Duration of a temporal entity, expressed using a structured description@en"]})

(def hasEnd
  "End of a temporal entity."
  {:db/ident           :time/hasEnd,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       [#xsd/langString "Final de una entidad temporal.@es"
                        #xsd/langString "End of a temporal entity.@en"],
   :rdfs/domain        :time/TemporalEntity,
   :rdfs/label         [#xsd/langString "has end@en"
                        #xsd/langString "tiene fin@es"],
   :rdfs/range         :time/Instant,
   :rdfs/subPropertyOf :time/hasTime,
   :skos/definition    [#xsd/langString "End of a temporal entity.@en"
                        #xsd/langString "Final de una entidad temporal.@es"]})

(def hasTRS
  "The temporal reference system used by a temporal position or extent description. "
  {:db/ident :time/hasTRS,
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/comment
   [#xsd/langString
     "The temporal reference system used by a temporal position or extent description. @en"
    #xsd/langString
     "El sistema de referencia temporal utilizado por una posición temporal o descripción de extensión.@es"],
   :rdfs/domain {:owl/unionOf [:time/TemporalPosition
                               :time/GeneralDurationDescription],
                 :rdf/type    :owl/Class},
   :rdfs/label [#xsd/langString "Temporal reference system used@en"
                #xsd/langString "sistema de referencia temporal utilizado@es"],
   :rdfs/range :time/TRS,
   :skos/definition
   [#xsd/langString
     "El sistema de referencia temporal utilizado por una posición temporal o descripción de extensión.@es"
    #xsd/langString
     "The temporal reference system used by a temporal position or extent description. @en"]})

(def hasTemporalDuration
  "Duration of a temporal entity."
  {:db/ident        :time/hasTemporalDuration,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/comment    [#xsd/langString "Duración de una entidad temporal.@es"
                     #xsd/langString "Duration of a temporal entity.@en"],
   :rdfs/domain     :time/TemporalEntity,
   :rdfs/label      [#xsd/langString "tiene duración temporal@es"
                     #xsd/langString "has temporal duration@en"],
   :rdfs/range      :time/TemporalDuration,
   :skos/definition [#xsd/langString "Duración de una entidad temporal.@es"
                     #xsd/langString "Duration of a temporal entity.@en"]})

(def hasTime
  "Supports the association of a temporal entity (instant or interval) to any thing"
  {:db/ident :time/hasTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Supports the association of a temporal entity (instant or interval) to any thing@en"
    #xsd/langString
     "Proporciona soporte a la asociación de una entidad temporal (instante o intervalo) a cualquier cosa.@es"],
   :rdfs/label [#xsd/langString "has time@en"
                #xsd/langString "tiene tiempo@es"],
   :rdfs/range :time/TemporalEntity,
   :skos/definition
   [#xsd/langString
     "Supports the association of a temporal entity (instant or interval) to any thing@en"
    #xsd/langString
     "Proporciona soporte a la asociación de una entidad temporal (instante o intervalo) a cualquier cosa.@es"],
   :skos/editorialNote
   [#xsd/langString
     "Característica arriesgada -añadida en la revisión del 2017 que no ha sido todavía utilizada de forma amplia.@es"
    #xsd/langString
     "Feature at risk - added in 2017 revision, and not yet widely used. @en"]})

(def hasXSDDuration
  "Extent of a temporal entity, expressed using xsd:duration"
  {:db/ident :time/hasXSDDuration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Extent of a temporal entity, expressed using xsd:duration@en"
    #xsd/langString
     "Extensión de una entidad temporal, expresada utilizando xsd:duration.@es"],
   :rdfs/domain :time/TemporalEntity,
   :rdfs/label [#xsd/langString "tiene duración XSD@es"
                #xsd/langString "has XSD duration@en"],
   :rdfs/range :xsd/duration,
   :skos/definition
   [#xsd/langString
     "Extent of a temporal entity, expressed using xsd:duration@en"
    #xsd/langString
     "Extensión de una entidad temporal, expresada utilizando xsd:duration.@es"],
   :skos/editorialNote
   [#xsd/langString
     "Feature at risk - added in 2017 revision, and not yet widely used. @en"
    #xsd/langString
     "Característica arriesgada - añadida en la revisión de 2017, y todavía no ampliamente utilizada.@es"]})

(def hour
  "Hour position in a calendar-clock system."
  {:db/ident        :time/hour,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    [#xsd/langString
                      "Posición de hora en un sistema calendario-reloj.@es"
                     #xsd/langString
                      "Hour position in a calendar-clock system.@en"],
   :rdfs/domain     :time/GeneralDateTimeDescription,
   :rdfs/label      [#xsd/langString "hora@es" #xsd/langString "hour@en"],
   :rdfs/range      :xsd/nonNegativeInteger,
   :skos/definition [#xsd/langString
                      "Posición de hora en un sistema calendario-reloj.@es"
                     #xsd/langString
                      "Hour position in a calendar-clock system.@en"]})

(def hours
  "length of, or element of the length of, a temporal extent expressed in hours"
  {:db/ident :time/hours,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en horas.@es"
    #xsd/langString
     "length of, or element of the length of, a temporal extent expressed in hours@en"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [#xsd/langString "duración en horas@es"
                #xsd/langString "hours duration@en"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [#xsd/langString
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en horas.@es"
    #xsd/langString
     "length of, or element of the length of, a temporal extent expressed in hours@en"]})

(def inDateTime
  "Position of an instant, expressed using a structured description"
  {:db/ident :time/inDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Posición de un instante, expresada utilizando una descripción estructurada.@es"
    #xsd/langString
     "Position of an instant, expressed using a structured description@en"],
   :rdfs/domain :time/Instant,
   :rdfs/label [#xsd/langString "en descripción de fecha-hora@es"
                #xsd/langString "in date-time description@en"],
   :rdfs/range :time/GeneralDateTimeDescription,
   :rdfs/subPropertyOf :time/inTemporalPosition,
   :skos/definition
   [#xsd/langString
     "Position of an instant, expressed using a structured description@en"
    #xsd/langString
     "Posición de un instante, expresada utilizando una descripción estructurada.@es"]})

(def inTemporalPosition
  "Position of a time instant"
  {:db/ident        :time/inTemporalPosition,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/comment    [#xsd/langString "Posición de un instante de tiempo.@es"
                     #xsd/langString "Position of a time instant@en"],
   :rdfs/domain     :time/Instant,
   :rdfs/label      [#xsd/langString "posición temporal@es"
                     #xsd/langString "Temporal position@en"],
   :rdfs/range      :time/TemporalPosition,
   :skos/definition [#xsd/langString "Posición de un instante de tiempo.@es"
                     #xsd/langString "Position of a time instant@en"]})

(def inTimePosition
  "Position of an instant, expressed as a temporal coordinate or nominal value"
  {:db/ident :time/inTimePosition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Position of an instant, expressed as a temporal coordinate or nominal value@en"
    #xsd/langString
     "Posición de un instante, expresada como una coordenada temporal o un valor nominal.@es"],
   :rdfs/domain :time/Instant,
   :rdfs/label [#xsd/langString "Time position@en"
                #xsd/langString "posición de tiempo@es"],
   :rdfs/range :time/TimePosition,
   :rdfs/subPropertyOf :time/inTemporalPosition,
   :skos/definition
   [#xsd/langString
     "Posición de un instante, expresada como una coordenada temporal o un valor nominal.@es"
    #xsd/langString
     "Position of a time instant expressed as a TimePosition@en"]})

(def inXSDDate
  "Position of an instant, expressed using xsd:date"
  {:db/ident :time/inXSDDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString "Posición de un instante, expresado utilizando xsd:date.@es"
    #xsd/langString "Position of an instant, expressed using xsd:date@en"],
   :rdfs/domain :time/Instant,
   :rdfs/label [#xsd/langString "en fecha XSD@es"
                #xsd/langString "in XSD date@en"],
   :rdfs/range :xsd/date,
   :skos/definition
   [#xsd/langString "Posición de un instante, expresado utilizando xsd:date.@es"
    #xsd/langString "Position of an instant, expressed using xsd:date@en"]})

(def inXSDDateTime
  "Position of an instant, expressed using xsd:dateTime"
  {:db/ident :time/inXSDDateTime,
   :owl/deprecated true,
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment
   [#xsd/langString "Position of an instant, expressed using xsd:dateTime@en"
    #xsd/langString
     "Posición de un instante, expresado utilizando xsd:dateTime.@es"],
   :rdfs/domain :time/Instant,
   :rdfs/label [#xsd/langString "in XSD Date-Time@en"
                #xsd/langString "en fecha-tiempo XSD@es"],
   :rdfs/range :xsd/dateTime,
   :skos/definition
   [#xsd/langString "Position of an instant, expressed using xsd:dateTime@en"
    #xsd/langString
     "Posición de un instante, expresado utilizando xsd:dateTime.@es"],
   :skos/note
   [#xsd/langString
     "The property :inXSDDateTime is replaced by :inXSDDateTimeStamp which makes the time-zone field mandatory.@en"
    #xsd/langString
     "La propiedad 'en fecha-hora XSD' ha sido reemplazada por 'en fecha-sello de tiempo XSD' que hace obligatorio el campo 'huso horario'.@es"]})

(def inXSDDateTimeStamp
  "Position of an instant, expressed using xsd:dateTimeStamp"
  {:db/ident :time/inXSDDateTimeStamp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Posición de un instante, expresado utilizando xsd:dateTimeStamp.@es"
    #xsd/langString
     "Position of an instant, expressed using xsd:dateTimeStamp@en"],
   :rdfs/domain :time/Instant,
   :rdfs/label [#xsd/langString "en fecha-sello de tiempo XSD@es"
                #xsd/langString "in XSD Date-Time-Stamp@en"],
   :rdfs/range :xsd/dateTimeStamp,
   :skos/definition
   [#xsd/langString
     "Posición de un instante, expresado utilizando xsd:dateTimeStamp.@es"
    #xsd/langString
     "Position of an instant, expressed using xsd:dateTimeStamp@en"]})

(def inXSDgYear
  "Position of an instant, expressed using xsd:gYear"
  {:db/ident :time/inXSDgYear,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment [#xsd/langString
                   "Posición de un instante, expresado utilizando xsd:gYear.@es"
                  #xsd/langString
                   "Position of an instant, expressed using xsd:gYear@en"],
   :rdfs/domain :time/Instant,
   :rdfs/label [#xsd/langString "en año gregoriano XSD@es"
                #xsd/langString "in XSD g-Year@en"],
   :rdfs/range :xsd/gYear,
   :skos/definition
   [#xsd/langString
     "Posición de un instante, expresado utilizando xsd:gYear.@es"
    #xsd/langString "Position of an instant, expressed using xsd:gYear@en"]})

(def inXSDgYearMonth
  "Position of an instant, expressed using xsd:gYearMonth"
  {:db/ident :time/inXSDgYearMonth,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Posición de un instante, expresado utilizando xsd:gYearMonth.@es"
    #xsd/langString
     "Position of an instant, expressed using xsd:gYearMonth@en"],
   :rdfs/domain :time/Instant,
   :rdfs/label [#xsd/langString "en año-mes gregoriano XSD@es"
                #xsd/langString "in XSD g-YearMonth@en"],
   :rdfs/range :xsd/gYearMonth,
   :skos/definition
   [#xsd/langString
     "Posición de un instante, expresado utilizando xsd:gYearMonth.@es"
    #xsd/langString
     "Position of an instant, expressed using xsd:gYearMonth@en"]})

(def inside
  "An instant that falls inside the interval. It is not intended to include beginnings and ends of intervals."
  {:db/ident :time/inside,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Un instante que cae dentro del intervalo. Se asume que no es ni el principio ni el final de ningún intervalo.@es"
    #xsd/langString
     "An instant that falls inside the interval. It is not intended to include beginnings and ends of intervals.@en"],
   :rdfs/domain :time/Interval,
   :rdfs/label [#xsd/langString "tiene instante de tiempo dentro@es"
                #xsd/langString "has time instant inside@en"],
   :rdfs/range :time/Instant,
   :skos/definition
   [#xsd/langString
     "Un instante que cae dentro del intervalo. Se asume que no es ni el principio ni el final de ningún intervalo.@es"
    #xsd/langString
     "An instant that falls inside the interval. It is not intended to include beginnings and ends of intervals.@en"]})

(def intervalAfter
  "Si un intervalo propio T1 es posterior a otro intervalo propio T2, entonces el principio de T1 está después que el final de T2."
  {:db/ident :time/intervalAfter,
   :owl/inverseOf :time/intervalBefore,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["Si un intervalo propio T1 es posterior a otro intervalo propio T2, entonces el principio de T1 está después que el final de T2."
    #xsd/langString
     "If a proper interval T1 is intervalAfter another proper interval T2, then the beginning of T1 is after the end of T2.@en"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "intervalo posterior@es"
                #xsd/langString "interval after@en"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf [:time/intervalDisjoint :time/after],
   :skos/definition
   [#xsd/langString
     "Si un intervalo propio T1 es posterior a otro intervalo propio T2, entonces el principio de T1 está después que el final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalAfter another proper interval T2, then the beginning of T1 is after the end of T2.@en"]})

(def intervalBefore
  "If a proper interval T1 is intervalBefore another proper interval T2, then the end of T1 is before the beginning of T2."
  {:db/ident :time/intervalBefore,
   :owl/inverseOf :time/intervalAfter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "If a proper interval T1 is intervalBefore another proper interval T2, then the end of T1 is before the beginning of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 está antes que otro intervalo propio T2, entonces el final de T1 está antes que el principio de T2.@es"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "intervalo anterior@es"
                #xsd/langString "interval before@en"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf [:time/before :time/intervalDisjoint],
   :skos/definition
   [#xsd/langString
     "If a proper interval T1 is intervalBefore another proper interval T2, then the end of T1 is before the beginning of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 está antes que otro intervalo propio T2, entonces el final de T1 está antes que el principio de T2.@es"]})

(def intervalContains
  "If a proper interval T1 is intervalContains another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is after the end of T2."
  {:db/ident :time/intervalContains,
   :owl/inverseOf :time/intervalDuring,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "If a proper interval T1 is intervalContains another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is after the end of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 contiene otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 está después del final de T2.@es"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "interval contains@en"
                #xsd/langString "intervalo contiene@es"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [#xsd/langString
     "If a proper interval T1 is intervalContains another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is after the end of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 contiene otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 está después del final de T2.@es"]})

(def intervalDisjoint
  "If a proper interval T1 is intervalDisjoint another proper interval T2, then the beginning of T1 is after the end of T2, or the end of T1 is before the beginning of T2, i.e. the intervals do not overlap in any way, but their ordering relationship is not known."
  {:db/ident :time/intervalDisjoint,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "If a proper interval T1 is intervalDisjoint another proper interval T2, then the beginning of T1 is after the end of T2, or the end of T1 is before the beginning of T2, i.e. the intervals do not overlap in any way, but their ordering relationship is not known.@en"
    #xsd/langString
     "Si un intervalo propio T1 es disjunto con otro intervalo propio T2, entonces el principio de T1 está después del final de T2, o el final de T1 está antes que el principio de T2, es decir, los intervalos no se solapan de ninguna forma, aunque su relación de orden no se conozca.@es"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "intervalo disjunto@es"
                #xsd/langString "interval disjoint@en"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [#xsd/langString
     "Si un intervalo propio T1 es disjunto con otro intervalo propio T2, entonces el principio de T1 está después del final de T2, o el final de T1 está antes que el principio de T2, es decir, los intervalos no se solapan de ninguna forma, aunque su relación de orden no se conozca.@es"
    #xsd/langString
     "If a proper interval T1 is intervalDisjoint another proper interval T2, then the beginning of T1 is after the end of T2, or the end of T1 is before the beginning of T2, i.e. the intervals do not overlap in any way, but their ordering relationship is not known.@en"],
   :skos/note
   [#xsd/langString
     "Esta relación entre intervalos no estaba incluida en las 13 relaciones básicas definidas por Allen (1984), pero está definida en T.3 como la unión de 'intervalo anterior' con 'intervalo posterior'. Sin embargo, esto está fuera de la expresividad de OWL2, por tanto, está implementado como una propiedad explícita, con 'intervalo anterior' e 'intervalo posterior' como sub-propiedades.@es"
    #xsd/langString
     "This interval relation is not included in the 13 basic relationships defined in Allen (1984), but is defined in (T.3) as the union of :intervalBefore v :intervalAfter . However, that is outside OWL2 expressivity, so is implemented as an explicit property, with :intervalBefore , :intervalAfter as sub-properties@en"]})

(def intervalDuring
  "If a proper interval T1 is intervalDuring another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is before the end of T2."
  {:db/ident :time/intervalDuring,
   :owl/inverseOf :time/intervalContains,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "If a proper interval T1 is intervalDuring another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is before the end of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 está durante otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 está antes que el final de T2.@es"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "interval during@en"
                #xsd/langString "intervalo durante@es"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf :time/intervalIn,
   :skos/definition
   [#xsd/langString
     "If a proper interval T1 is intervalDuring another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is before the end of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 está durante otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 está antes que el final de T2.@es"]})

(def intervalEquals
  "If a proper interval T1 is intervalEquals another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is coincident with the end of T2."
  {:db/ident :time/intervalEquals,
   :owl/propertyDisjointWith :time/intervalIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Si un intervalo propio T1 es igual a otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 coincide con el final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalEquals another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is coincident with the end of T2.@en"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "interval equals@en"
                #xsd/langString "intervalo igual@es"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [#xsd/langString
     "Si un intervalo propio T1 es igual a otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 coincide con el final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalEquals another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is coincident with the end of T2.@en"]})

(def intervalFinishedBy
  "If a proper interval T1 is intervalFinishedBy another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is coincident with the end of T2."
  {:db/ident :time/intervalFinishedBy,
   :owl/inverseOf :time/intervalFinishes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Si un intervalo propio T1 está terminado por otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 coincide con el final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalFinishedBy another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is coincident with the end of T2.@en"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "interval finished by@en"
                #xsd/langString "intervalo terminado por@es"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [#xsd/langString
     "If a proper interval T1 is intervalFinishedBy another proper interval T2, then the beginning of T1 is before the beginning of T2, and the end of T1 is coincident with the end of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 está terminado por otro intervalo propio T2, entonces el principio de T1 está antes que el principio de T2, y el final de T1 coincide con el final de T2.@es"]})

(def intervalFinishes
  "If a proper interval T1 is intervalFinishes another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is coincident with the end of T2."
  {:db/ident :time/intervalFinishes,
   :owl/inverseOf :time/intervalFinishedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "If a proper interval T1 is intervalFinishes another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is coincident with the end of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 termina otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 coincide con el final de T2.@es"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "interval finishes@en"
                #xsd/langString "intervalo termina@es"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf :time/intervalIn,
   :skos/definition
   [#xsd/langString
     "Si un intervalo propio T1 termina otro intervalo propio T2, entonces del principio de T1 está después del principio de T2, y el final de T1 coincide con el final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalFinishes another proper interval T2, then the beginning of T1 is after the beginning of T2, and the end of T1 is coincident with the end of T2.@en"]})

(def intervalIn
  "If a proper interval T1 is intervalIn another proper interval T2, then the beginning of T1 is after the beginning of T2 or is coincident with the beginning of T2, and the end of T1 is before the end of T2, or is coincident with the end of T2, except that end of T1 may not be coincident with the end of T2 if the beginning of T1 is coincident with the beginning of T2."
  {:db/ident :time/intervalIn,
   :owl/propertyDisjointWith :time/intervalEquals,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "If a proper interval T1 is intervalIn another proper interval T2, then the beginning of T1 is after the beginning of T2 or is coincident with the beginning of T2, and the end of T1 is before the end of T2, or is coincident with the end of T2, except that end of T1 may not be coincident with the end of T2 if the beginning of T1 is coincident with the beginning of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 es un intervalo interior a otro intervalo propio T2, entonces el principio de T1 está después del principio de T2 o coincide con el principio de T2, y el final de T1 está antes que el final de T2, o coincide con el final de T2, excepto que el final de T1 puede no coincidir con el final de T2 si el principio de T1 coincide con el principio de T2.@es"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "intervalo interior@es"
                #xsd/langString "interval in@en"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [#xsd/langString
     "Si un intervalo propio T1 es un intervalo interior a otro intervalo propio T2, entonces el principio de T1 está después del principio de T2 o coincide con el principio de T2, y el final de T1 está antes que el final de T2, o coincide con el final de T2, excepto que el final de T1 puede no coincidir con el final de T2 si el principio de T1 coincide con el principio de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalIn another proper interval T2, then the beginning of T1 is after the beginning of T2 or is coincident with the beginning of T2, and the end of T1 is before the end of T2, or is coincident with the end of T2, except that end of T1 may not be coincident with the end of T2 if the beginning of T1 is coincident with the beginning of T2.@en"],
   :skos/note
   [#xsd/langString
     "Esta relación entre intervalos no estaba incluida en las 13 relaciones básicas definidas por Allen (1984), pero se hace referencia a ella como \"una relación importante\" en Allen y Ferguson (1997). Es la unión disjunta de 'intervalo empieza', 'intervalo durante' y con 'intervalo termina'. Sin embargo, esto está fuera de la expresividad de OWL2, por tanto, se implementa como una propiedad explícita, con 'intervalo empieza', 'intervalo durante' e 'intervalo termina' como sub-propiedades.@es"
    #xsd/langString
     "This interval relation is not included in the 13 basic relationships defined in Allen (1984), but is referred to as 'an important relationship' in Allen and Ferguson (1997). It is the disjoint union of :intervalStarts v :intervalDuring v :intervalFinishes . However, that is outside OWL2 expressivity, so is implemented as an explicit property, with :intervalStarts , :intervalDuring , :intervalFinishes as sub-properties@en"]})

(def intervalMeets
  "If a proper interval T1 is intervalMeets another proper interval T2, then the end of T1 is coincident with the beginning of T2."
  {:db/ident :time/intervalMeets,
   :owl/inverseOf :time/intervalMetBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "If a proper interval T1 is intervalMeets another proper interval T2, then the end of T1 is coincident with the beginning of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 se encuentra con otro intervalo propio T2, entonces el final de T1 coincide con el principio de T2.@es"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "interval meets@en"
                #xsd/langString "intervalo se encuentra@es"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [#xsd/langString
     "Si un intervalo propio T1 se encuentra con otro intervalo propio T2, entonces el final de T1 coincide con el principio de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalMeets another proper interval T2, then the end of T1 is coincident with the beginning of T2.@en"]})

(def intervalMetBy
  "If a proper interval T1 is intervalMetBy another proper interval T2, then the beginning of T1 is coincident with the end of T2."
  {:db/ident :time/intervalMetBy,
   :owl/inverseOf :time/intervalMeets,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "If a proper interval T1 is intervalMetBy another proper interval T2, then the beginning of T1 is coincident with the end of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 es 'intervalo encontrado por' otro intervalo propio T2, entonces el principio de T1 coincide con el final de T2.@es"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "interval met by@en"
                #xsd/langString "intervalo encontrado por@es"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [#xsd/langString
     "Si un intervalo propio T1 es 'intervalo encontrado por' otro intervalo propio T2, entonces el principio de T1 coincide con el final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalMetBy another proper interval T2, then the beginning of T1 is coincident with the end of T2.@en"]})

(def intervalOverlappedBy
  "If a proper interval T1 is intervalOverlappedBy another proper interval T2, then the beginning of T1 is after the beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end of T2."
  {:db/ident :time/intervalOverlappedBy,
   :owl/inverseOf :time/intervalOverlaps,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "If a proper interval T1 is intervalOverlappedBy another proper interval T2, then the beginning of T1 is after the beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 es 'intervalo solapado por' otro intervalo propio T2, entonces el principio de T1 es posterior al principio de T2, y el principio de T1 es anterior al final de T2, y el final de T1 es posterior al final de T2.@es"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "interval overlapped by@en"
                #xsd/langString "intervalo solapado por@es"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [#xsd/langString
     "Si un intervalo propio T1 es 'intervalo solapado por' otro intervalo propio T2, entonces el principio de T1 es posterior al principio de T2, y el principio de T1 es anterior al final de T2, y el final de T1 es posterior al final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalOverlappedBy another proper interval T2, then the beginning of T1 is after the beginning of T2, the beginning of T1 is before the end of T2, and the end of T1 is after the end of T2.@en"]})

(def intervalOverlaps
  "If a proper interval T1 is intervalOverlaps another proper interval T2, then the beginning of T1 is before the beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end of T2."
  {:db/ident :time/intervalOverlaps,
   :owl/inverseOf :time/intervalOverlappedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Asume una dirección en el tiempo. Si una entidad temporal T1 está después de otra entidad temporal T2, entonces el principio de T1 está después del final de T2.@es"
    #xsd/langString
     "Si un intervalo propio T1 se solapa con otro intervalo propio T2, entonces el principio de T1 es anterior al principio de T2, el final de T1 es posterior al principio de T2, y el final de T1 es anterior al final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalOverlaps another proper interval T2, then the beginning of T1 is before the beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end of T2.@en"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "intervalo se solapa@es"
                #xsd/langString "interval overlaps@en"],
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [#xsd/langString
     "Si un intervalo propio T1 se solapa con otro intervalo propio T2, entonces el principio de T1 es anterior al principio de T2, el final de T1 es posterior al principio de T2, y el final de T1 es anterior al final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalOverlaps another proper interval T2, then the beginning of T1 is before the beginning of T2, the end of T1 is after the beginning of T2, and the end of T1 is before the end of T2.@en"]})

(def intervalStartedBy
  "If a proper interval T1 is intervalStarted another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is after the end of T2."
  {:db/ident :time/intervalStartedBy,
   :owl/inverseOf :time/intervalStarts,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Si un intervalo propio T1 es empezado por otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 es posterior al final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalStarted another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is after the end of T2.@en"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label #xsd/langString "interval started by@en",
   :rdfs/range :time/ProperInterval,
   :skos/definition
   [#xsd/langString
     "Si un intervalo propio T1 es empezado por otro intervalo propio T2, entonces el principio de T1 coincide con el principio de T2, y el final de T1 es posterior al final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalStarted another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is after the end of T2.@en"]})

(def intervalStarts
  "If a proper interval T1 is intervalStarts another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is before the end of T2."
  {:db/ident :time/intervalStarts,
   :owl/inverseOf :time/intervalStartedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "If a proper interval T1 is intervalStarts another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is before the end of T2.@en"
    #xsd/langString
     "Si un intervalo propio T1 empieza otro intervalo propio T2, entonces del principio de T1 con el principio de T2, y el final de T1 es anterior al final de T2.@es"],
   :rdfs/domain :time/ProperInterval,
   :rdfs/label [#xsd/langString "intervalo empieza@es"
                #xsd/langString "interval starts@en"],
   :rdfs/range :time/ProperInterval,
   :rdfs/subPropertyOf :time/intervalIn,
   :skos/definition
   [#xsd/langString
     "Si un intervalo propio T1 empieza otro intervalo propio T2, entonces del principio de T1 con el final de T2, y el final de T1 es anterior al final de T2.@es"
    #xsd/langString
     "If a proper interval T1 is intervalStarts another proper interval T2, then the beginning of T1 is coincident with the beginning of T2, and the end of T1 is before the end of T2.@en"]})

(def minute
  "Minute position in a calendar-clock system."
  {:db/ident        :time/minute,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/comment    [#xsd/langString
                      "Posición de minuto en un sistema calendario-reloj.@es"
                     #xsd/langString
                      "Minute position in a calendar-clock system.@en"],
   :rdfs/domain     :time/GeneralDateTimeDescription,
   :rdfs/label      [#xsd/langString "minuto@es" #xsd/langString "minute@en"],
   :rdfs/range      :xsd/nonNegativeInteger,
   :skos/definition [#xsd/langString
                      "Posición de minuto en un sistema calendario-reloj.@es"
                     #xsd/langString
                      "Minute position in a calendar-clock system.@en"]})

(def minutes
  "length, or element of, a temporal extent expressed in minutes"
  {:db/ident :time/minutes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en minutos.@es"
    #xsd/langString
     "length, or element of, a temporal extent expressed in minutes@en"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [#xsd/langString "minutos@es" #xsd/langString "minutes@en"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [#xsd/langString
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en minutos.@es"
    #xsd/langString
     "length, or element of, a temporal extent expressed in minutes@en"]})

(def month
  "Month position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar month from any calendar. "
  {:db/ident :time/month,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Posición de mes en un sistema calendario-reloj.\n    El rango de esta propiedad no está especificado, por tanto, se puede reemplazar por cualquier representación específica de un mes de calendario de un calendario cualquiera.@es"
    #xsd/langString
     "Month position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar month from any calendar. @en"],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [#xsd/langString "mes@es" #xsd/langString "month@en"],
   :skos/definition
   [#xsd/langString
     "Posición de mes en un sistema calendario-reloj.\n            El rango de esta propiedad no está especificado, por tanto, se puede reemplazar por cualquier representación específica de un mes de calendario de un calendario cualquiera.@es"
    #xsd/langString
     "Month position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar month from any calendar. @en"]})

(def monthOfYear
  "The month of the year, whose value is a member of the class time:MonthOfYear"
  {:db/ident :time/monthOfYear,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "El mes del año, cuyo valor es un miembro de la clase 'mes del año'.@es"
    #xsd/langString
     "The month of the year, whose value is a member of the class time:MonthOfYear@en"],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [#xsd/langString "mes del año@es"
                #xsd/langString "month of year@en"],
   :rdfs/range :time/MonthOfYear,
   :skos/definition
   [#xsd/langString
     "El mes del año, cuyo valor es un miembro de la clase 'mes del año'.@es"
    #xsd/langString
     "The month of the year, whose value is a member of the class time:MonthOfYear@en"],
   :skos/editorialNote
   [#xsd/langString
     "Feature at risk - added in 2017 revision, and not yet widely used. @en"
    #xsd/langString
     "Característica arriesgada - añadida en la revisión de 2017, y todavía no ampliamente utilizada.@es"]})

(def months
  "length of, or element of the length of, a temporal extent expressed in months"
  {:db/ident :time/months,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en meses.@es"
    #xsd/langString
     "length of, or element of the length of, a temporal extent expressed in months@en"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [#xsd/langString "duración en meses@es"
                #xsd/langString "months duration@en"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [#xsd/langString
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en meses.@es"
    #xsd/langString
     "length of, or element of the length of, a temporal extent expressed in months@en"]})

(def nominalPosition
  "The (nominal) value indicating temporal position in an ordinal reference system "
  {:db/ident :time/nominalPosition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "El valor (nominal) que indica posición temporal en un sistema de referencia ordinal.@es"
    #xsd/langString
     "The (nominal) value indicating temporal position in an ordinal reference system @en"],
   :rdfs/domain :time/TimePosition,
   :rdfs/label [#xsd/langString "nombre de posición temporal@es"
                #xsd/langString "Name of temporal position@en"],
   :rdfs/range :xsd/string,
   :skos/definition
   [#xsd/langString
     "El valor (nominal) que indica posición temporal en un sistema de referencia ordinal.@es"
    #xsd/langString
     "The (nominal) value indicating temporal position in an ordinal reference system @en"]})

(def numericDuration
  "Value of a temporal extent expressed as a decimal number scaled by a temporal unit"
  {:db/ident :time/numericDuration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Valor de una extensión temporal expresada como un número decimal escalado por una unidad de tiempo.@es"
    #xsd/langString
     "Value of a temporal extent expressed as a decimal number scaled by a temporal unit@en"],
   :rdfs/domain :time/Duration,
   :rdfs/label [#xsd/langString "valor numérico de duración temporal@es"
                #xsd/langString "Numeric value of temporal duration@en"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [#xsd/langString
     "Valor de una extensión temporal expresada como un número decimal escalado por una unidad de tiempo.@es"
    #xsd/langString
     "Value of a temporal extent expressed as a decimal number scaled by a temporal unit@en"]})

(def numericPosition
  "The (numeric) value indicating position within a temporal coordinate system "
  {:db/ident :time/numericPosition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "El valor (numérico) que indica posición temporal en un sistema de referencia ordinal.@es"
    #xsd/langString
     "The (numeric) value indicating position within a temporal coordinate system @en"],
   :rdfs/domain :time/TimePosition,
   :rdfs/label [#xsd/langString "valor numérico de posición temporal@es"
                #xsd/langString "Numeric value of temporal position@en"],
   :rdfs/range :xsd/decimal,
   :skos/definition
   [#xsd/langString
     "El valor (numérico) que indica posición temporal en un sistema de referencia ordinal.@es"
    #xsd/langString
     "The (numeric) value indicating position within a temporal coordinate system @en"]})

(def second
  "Second position in a calendar-clock system."
  {:db/ident     :time/second,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment [#xsd/langString
                   "Posición de segundo en un sistema calendario-reloj.@es"
                  #xsd/langString
                   "Second position in a calendar-clock system.@en"],
   :rdfs/domain  :time/GeneralDateTimeDescription,
   :rdfs/label   [#xsd/langString "segundo@es" #xsd/langString "second@en"],
   :rdfs/range   :xsd/decimal})

(def seconds
  "length of, or element of the length of, a temporal extent expressed in seconds"
  {:db/ident :time/seconds,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en segundos.@es"
    #xsd/langString
     "length of, or element of the length of, a temporal extent expressed in seconds@en"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [#xsd/langString "duración en segundos@es"
                #xsd/langString "seconds duration@en"],
   :rdfs/range :xsd/decimal,
   :rdfs/seeAlso
   {:rdfa/uri "http://www.bipm.org/en/publications/si-brochure/second.html"}})

(def timeZone
  "The time zone for clock elements in the temporal position"
  {:db/ident :time/timeZone,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The time zone for clock elements in the temporal position@en",
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [#xsd/langString "en huso horario@es"
                #xsd/langString "in time zone@en"],
   :rdfs/range :time/TimeZone,
   :skos/historyNote
   ["In the original 2006 version of OWL-Time, the range of time:timeZone was a TimeZone class in a separate namespace \"http://www.w3.org/2006/timezone#\". \nAn alignment axiom \n\ttzont:TimeZone rdfs:subClassOf time:TimeZone . \nallows data encoded according to the previous version to be consistent with the updated ontology. "
    #xsd/langString
     "En la versión original de OWL-Time de 2006, el rango de 'en huso horario' se definió en un espacio de nombres diferente \"http://www.w3.org/2006/timezone#\".\n            Un axioma de alineación permite que los datos codificados de acuerdo con la versión anterior sean consistentes con la ontología actualizada.@es"],
   :skos/note
   [#xsd/langString
     "IANA mantiene una base de datos de husos horarios. Éstas están bien mantenidas y generalmente se consideran autorizadas, pero los ítems individuales no están disponibles en URIs individuales, por tanto, no se pueden utilizar directamente en datos expresados utilizando OWL-Time.\n            La BDPedia proporciona un conjunto de recursos correspondientes a los husos horarios de IANA, con una URI para cada uno (por ejemplo, http://dbpedia.org/resource/Australia/Eucla). El Servicio de Reloj Mundial también proporciona una lista de husos horarios con la descripción de cada uno de los disponibles como una página Web individual con una URI adecuada individual (por ejemplo, https://www.timeanddate.com/time/zones/acwst). Éstos, y otros recursos similares, se puden usar como un valor de la propiedad 'huso horario'.@es"
    "IANA maintains a database of timezones. These are well maintained and generally considered authoritative, but individual items are not available at individual URIs, so cannot be used directly in data expressed using OWL-Time.\n\nDBPedia provides a set of resources corresponding to the IANA timezones, with a URI for each (e.g. http://dbpedia.org/resource/Australia/Eucla). The World Clock service also provides a list of time zones with the description of each available as an individual webpage with a convenient individual URI (e.g. https://www.timeanddate.com/time/zones/acwst). These or other, similar, resources might be used as a value of the time:timeZone property."]})

(def unitCentury
  "century"
  {:db/ident       :time/unitCentury,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     #xsd/langString "Century (unit of temporal duration)@en",
   :skos/prefLabel [#xsd/langString "século@pt"
                    #xsd/langString "century@en"
                    #xsd/langString "한 세기@kr"
                    #xsd/langString "Jahrhundert@de"
                    #xsd/langString "век@ru"
                    #xsd/langString "一个世纪@zh"
                    #xsd/langString "stulecie@pl"
                    #xsd/langString "一世紀@ja"
                    #xsd/langString "siglo@es"
                    #xsd/langString "eeuw@nl"
                    #xsd/langString "قرن واحد@ar"
                    #xsd/langString "secolo@it"
                    #xsd/langString "siècle@fr"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     100})

(def unitDay
  "day"
  {:db/ident       :time/unitDay,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     #xsd/langString "Day (unit of temporal duration)@en",
   :skos/prefLabel [#xsd/langString "一天@zh"
                    #xsd/langString "jour@fr"
                    #xsd/langString "언젠가@kr"
                    #xsd/langString "giorno@it"
                    #xsd/langString "يوماً ما@ar"
                    #xsd/langString "ある日@ja"
                    #xsd/langString "doba@pl"
                    #xsd/langString "día@es"
                    #xsd/langString "dia@pt"
                    #xsd/langString "dag@nl"
                    #xsd/langString "day@en"
                    #xsd/langString "Tag@de"],
   :time/days      1,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitDecade
  "decade"
  {:db/ident       :time/unitDecade,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     #xsd/langString "Decade (unit of temporal duration)@en",
   :skos/prefLabel [#xsd/langString "عقد واحد@ar"
                    #xsd/langString "décennie@fr"
                    #xsd/langString "decennium@nl"
                    #xsd/langString "10年@ja"
                    #xsd/langString "decennio@it"
                    #xsd/langString "одно десятилетие@ru"
                    #xsd/langString "十年@zh"
                    #xsd/langString "una década@es"
                    #xsd/langString "década@pt"
                    #xsd/langString "Dekade@de"
                    #xsd/langString "1 열개의@kr"
                    #xsd/langString "dekada@pl"
                    #xsd/langString "decade@en"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     10})

(def unitHour
  "hour"
  {:db/ident       :time/unitHour,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     #xsd/langString "Hour (unit of temporal duration)@en",
   :skos/prefLabel [#xsd/langString "heure@fr"
                    #xsd/langString "uur@nl"
                    #xsd/langString "ساعة واحدة@ar"
                    #xsd/langString "hour@en"
                    #xsd/langString "ora@it"
                    #xsd/langString "hora@es"
                    #xsd/langString "hora@pt"
                    #xsd/langString "한 시간@kr"
                    #xsd/langString "一小時@zh"
                    #xsd/langString "Stunde@de"
                    #xsd/langString "godzina@pl"
                    #xsd/langString "一時間@ja"
                    "один час\"@ru"],
   :time/days      0,
   :time/hours     1,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitMillenium
  "millenium"
  {:db/ident       :time/unitMillenium,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     #xsd/langString "Century (unit of temporal duration)@en",
   :skos/prefLabel [#xsd/langString "밀레니엄@kr"
                    #xsd/langString "milênio@pt"
                    #xsd/langString "千年@zh"
                    #xsd/langString "millennium@nl"
                    #xsd/langString "milenio@es"
                    #xsd/langString "Jahrtausend@de"
                    #xsd/langString "الألفية@ar"
                    #xsd/langString "millennio@it"
                    #xsd/langString "тысячелетие@ru"
                    #xsd/langString "millénaire@fr"
                    #xsd/langString "ミレニアム@ja"
                    #xsd/langString "tysiąclecie@pl"
                    #xsd/langString "millenium@en"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     1000})

(def unitMinute
  "minute"
  {:db/ident       :time/unitMinute,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     #xsd/langString "Minute (unit of temporal duration)@en",
   :skos/prefLabel [#xsd/langString "minuta@pl"
                    #xsd/langString "minute@en"
                    #xsd/langString "minute@fr"
                    #xsd/langString "一分@ja"
                    #xsd/langString "等一下@zh"
                    #xsd/langString "분@kr"
                    #xsd/langString "minuto@es"
                    #xsd/langString "minuto@it"
                    #xsd/langString "minuto@pt"
                    #xsd/langString "Minute@de"
                    #xsd/langString "одна минута@ru"
                    #xsd/langString "minuut@nl"
                    #xsd/langString "دقيقة واحدة@ar"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   1,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitMonth
  "month"
  {:db/ident       :time/unitMonth,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     #xsd/langString "Month (unit of temporal duration)@en",
   :skos/prefLabel [#xsd/langString "一か月@ja"
                    #xsd/langString "شهر واحد@ar"
                    #xsd/langString "一個月@zh"
                    #xsd/langString "miesiąc@pl"
                    #xsd/langString "maand@nl"
                    #xsd/langString "Monat@de"
                    #xsd/langString "один месяц@ru"
                    #xsd/langString "한달@kr"
                    #xsd/langString "mes@es"
                    #xsd/langString "mois@fr"
                    #xsd/langString "mese@it"
                    #xsd/langString "month@en"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    1,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     0})

(def unitSecond
  "second"
  {:db/ident       :time/unitSecond,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     #xsd/langString "Second (unit of temporal duration)@en",
   :skos/prefLabel [#xsd/langString "secondo@it"
                    #xsd/langString "일초@kr"
                    #xsd/langString "一秒@ja"
                    #xsd/langString "一秒@zh"
                    #xsd/langString "ثانية واحدة@ar"
                    #xsd/langString "second@en"
                    #xsd/langString "Sekunde@de"
                    #xsd/langString "sekundę@pl"
                    #xsd/langString "seconde@fr"
                    #xsd/langString "seconde@nl"
                    #xsd/langString "segundo@es"
                    #xsd/langString "segundo@pt"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   1,
   :time/weeks     0,
   :time/years     0})

(def unitType
  "The temporal unit which provides the precision of a date-time value or scale of a temporal extent"
  {:db/ident :time/unitType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "La unidad de tiempo que proporciona la precisión de un valor fecha-hora o la escala de una extensión temporal.@es"
    #xsd/langString
     "The temporal unit which provides the precision of a date-time value or scale of a temporal extent@en"],
   :rdfs/domain {:owl/unionOf [:time/GeneralDateTimeDescription :time/Duration],
                 :rdf/type    :owl/Class},
   :rdfs/label [#xsd/langString "tipo de unidad temporal@es"
                #xsd/langString "temporal unit type@en"],
   :rdfs/range :time/TemporalUnit})

(def unitWeek
  "week"
  {:db/ident       :time/unitWeek,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     #xsd/langString "Week (unit of temporal duration)@en",
   :skos/prefLabel [#xsd/langString "Woche@de"
                    #xsd/langString "سبوع واحد@ar"
                    #xsd/langString "semaine@fr"
                    #xsd/langString "一周@zh"
                    #xsd/langString "일주일@kr"
                    #xsd/langString "tydzień@pl"
                    #xsd/langString "одна неделя@ru"
                    #xsd/langString "semana@es"
                    #xsd/langString "semana@pt"
                    #xsd/langString "settimana@it"
                    #xsd/langString "week@nl"
                    #xsd/langString "week@en"
                    #xsd/langString "一週間@ja"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     1,
   :time/years     0})

(def unitYear
  "year"
  {:db/ident       :time/unitYear,
   :rdf/type       [:time/TemporalUnit
                    :time/GeneralDurationDescription
                    :time/TemporalDuration
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/hours,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/minutes,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/months,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/weeks,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/days,
                     :rdf/type           :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/years,
                     :rdf/type           :owl/Restriction}
                    {:owl/cardinality 1,
                     :owl/onProperty  :time/hasTRS,
                     :rdf/type        :owl/Restriction}
                    {:owl/maxCardinality 1,
                     :owl/onProperty     :time/seconds,
                     :rdf/type           :owl/Restriction}],
   :rdfs/label     #xsd/langString "Year (unit of temporal duration)@en",
   :skos/prefLabel [#xsd/langString "rok@pl"
                    #xsd/langString "ano@pt"
                    #xsd/langString "1 년@kr"
                    #xsd/langString "an@fr"
                    #xsd/langString "year@en"
                    #xsd/langString "un año@es"
                    #xsd/langString "один год@ru"
                    #xsd/langString "Jahr@de"
                    #xsd/langString "jaar@nl"
                    #xsd/langString "一年@ja"
                    #xsd/langString "一年@zh"
                    #xsd/langString "سنة واحدة@ar"
                    #xsd/langString "anno@it"],
   :time/days      0,
   :time/hours     0,
   :time/minutes   0,
   :time/months    0,
   :time/seconds   0,
   :time/weeks     0,
   :time/years     1})

(def week
  "Week number within the year."
  {:db/ident :time/week,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment [#xsd/langString "Número de semana en el año.@es"
                  #xsd/langString "Week number within the year.@en"],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label [#xsd/langString "semana@es" #xsd/langString "week@en"],
   :rdfs/range :xsd/nonNegativeInteger,
   :skos/note
   #xsd/langString
    "Weeks are numbered differently depending on the calendar in use and the local language or cultural conventions (locale). ISO-8601 specifies that the first week of the year includes at least four days, and that Monday is the first day of the week. In that system, week 1 is the week that contains the first Thursday in the year.@en",
   :skos/scopeNote
   #xsd/langString
    "Las semanas están numeradas de forma diferente dependiendo del calendario en uso y de las convenciones lingüísticas y culturales locales (locale en inglés). El ISO-8601 especifica que la primera semana del año incluye al menos cuatro días, y que el lunes es el primer día de la semana. En ese sistema, la semana 1 es la semana que contiene el primer jueves del año.@es"})

(def weeks
  "length of, or element of the length of, a temporal extent expressed in weeks"
  {:db/ident :time/weeks,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en semanas.@es"
    #xsd/langString
     "length of, or element of the length of, a temporal extent expressed in weeks@en"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [#xsd/langString "duración en semanas@es"
                #xsd/langString "weeks duration@en"],
   :rdfs/range :xsd/decimal})

(def xsdDateTime
  "Value of DateTimeInterval expressed as a compact value."
  {:db/ident :time/xsdDateTime,
   :owl/deprecated true,
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment
   [#xsd/langString "Value of DateTimeInterval expressed as a compact value.@en"
    #xsd/langString
     "Valor de 'intervalo de fecha-hora' expresado como un valor compacto.@es"],
   :rdfs/domain :time/DateTimeInterval,
   :rdfs/label [#xsd/langString "tiene fecha-hora XSD@es"
                #xsd/langString "has XSD date-time@en"],
   :rdfs/range :xsd/dateTime,
   :skos/note
   [#xsd/langString
     "Using xsd:dateTime in this place means that the duration of the interval is implicit: it corresponds to the length of the smallest non-zero element of the date-time literal. However, this rule cannot be used for intervals whose duration is more than one rank smaller than the starting time - e.g. the first minute or second of a day, the first hour of a month, or the first day of a year. In these cases the desired interval cannot be distinguished from the interval corresponding to the next rank up. Because of this essential ambiguity, use of this property is not recommended and it is deprecated.@en"
    "Utilizando xsd:dateTime en este lugar significa que la duración del intervalo está implícita: se corresponde con la longitud del elemento más pequeño distinto de cero del literal fecha-hora. Sin embargo, esta regla no se puede utilizar para intervalos cuya duración es mayor que un rango más pequeño que el tiempo de comienzo - p.ej. el primer minuto o segundo del día, la primera hora del mes, o el primer día del año. En estos casos el intervalo deseado no se puede distinguir del intervalo correspondiente al próximo rango más alto. Debido a esta ambigüedad esencial, no se recomienda el uso de esta propiedad y está desaprobada."]})

(def year
  "Year position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar year from any calendar. "
  {:db/ident :time/year,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Posición de año en un sistema calendario-reloj.\n\nl rango de esta propiedad no está especificado, por tanto, se puede reemplazar por cualquier representación específica de un año de calendario de un calendario cualquiera.@es"
    #xsd/langString
     "Year position in a calendar-clock system.\n\nThe range of this property is not specified, so can be replaced by any specific representation of a calendar year from any calendar. @en"],
   :rdfs/domain :time/GeneralDateTimeDescription,
   :rdfs/label #xsd/langString "year@en"})

(def years
  "length of, or element of the length of, a temporal extent expressed in years"
  {:db/ident :time/years,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "Longitud de, o elemento de la longitud de, una extensión temporal expresada en años.@es"
    #xsd/langString
     "length of, or element of the length of, a temporal extent expressed in years@en"],
   :rdfs/domain :time/GeneralDurationDescription,
   :rdfs/label [#xsd/langString "duración en años@es"
                #xsd/langString "years duration@en"],
   :rdfs/range :xsd/decimal})