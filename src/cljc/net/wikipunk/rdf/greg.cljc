(ns net.wikipunk.rdf.greg
  "The set of months-of-the-year from the Gregorian calendar."
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/w3c/sdw/gh-pages/time/rdf/time-gregorian.ttl",
   :dcterms/created #inst "2017-01-20T00:00:00.000-05:00",
   :dcterms/creator "http://orcid.org/0000-0002-3884-3420",
   :owl/imports "http://www.w3.org/2006/time",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "greg"    "http://www.w3.org/ns/time/gregorian/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "time"    "http://www.w3.org/2006/time#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "greg",
   :rdfa/uri "http://www.w3.org/ns/time/gregorian",
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The set of months-of-the-year from the Gregorian calendar."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "The gregorian months"}})

(def April
  "April"
  {:db/ident        :greg/April,
   :rdf/type        :time/MonthOfYear,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "April"},
   :rdfs/subClassOf {:owl/hasValue   :time/unitMonth,
                     :owl/onProperty :time/unitType,
                     :rdf/type       :owl/Restriction},
   :skos/prefLabel  [{:rdf/language "nl",
                      :rdf/value    "April"}
                     {:rdf/language "en",
                      :rdf/value    "April"}
                     {:rdf/language "de",
                      :rdf/value    "April"}
                     {:rdf/language "it",
                      :rdf/value    "Aprile"}
                     {:rdf/language "fr",
                      :rdf/value    "Avril"}
                     {:rdf/language "zh",
                      :rdf/value    "4月"}
                     {:rdf/language "ja",
                      :rdf/value    "4月"}
                     {:rdf/language "pl",
                      :rdf/value    "Kwiecień"}
                     {:rdf/language "pt",
                      :rdf/value    "Abril"}
                     {:rdf/language "es",
                      :rdf/value    "Abril"}
                     {:rdf/language "ar",
                      :rdf/value    "أبريل"}
                     {:rdf/language "ru",
                      :rdf/value    "Апрель"}],
   :time/month      #inst "2000-04-15T00:00:00.000-04:00",
   :time/unitType   :time/unitMonth})

(def August
  "August"
  {:db/ident       :greg/August,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "August"},
   :skos/prefLabel [{:rdf/language "ru",
                     :rdf/value    "Август"}
                    {:rdf/language "zh",
                     :rdf/value    "8月"}
                    {:rdf/language "ja",
                     :rdf/value    "8月"}
                    {:rdf/language "pl",
                     :rdf/value    "Sierpień"}
                    {:rdf/language "ar",
                     :rdf/value    "أغسطس"}
                    {:rdf/language "pt",
                     :rdf/value    "Agosto"}
                    {:rdf/language "it",
                     :rdf/value    "Agosto"}
                    {:rdf/language "es",
                     :rdf/value    "Agosto"}
                    {:rdf/language "nl",
                     :rdf/value    "Augustus (maand)"}
                    {:rdf/language "de",
                     :rdf/value    "August"}
                    {:rdf/language "en",
                     :rdf/value    "August"}
                    {:rdf/language "fr",
                     :rdf/value    "Août"}],
   :time/month     #inst "2000-08-15T00:00:00.000-04:00",
   :time/unitType  :time/unitMonth})

(def December
  "December"
  {:db/ident       :greg/December,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "December"},
   :skos/prefLabel [{:rdf/language "nl",
                     :rdf/value    "December"}
                    {:rdf/language "en",
                     :rdf/value    "December"}
                    {:rdf/language "ar",
                     :rdf/value    "ديسمبر"}
                    {:rdf/language "es",
                     :rdf/value    "Diciembre"}
                    {:rdf/language "ru",
                     :rdf/value    "Декабрь"}
                    {:rdf/language "fr",
                     :rdf/value    "Décembre"}
                    {:rdf/language "pt",
                     :rdf/value    "Dezembro"}
                    {:rdf/language "it",
                     :rdf/value    "Dicembre"}
                    {:rdf/language "pl",
                     :rdf/value    "Grudzień"}
                    {:rdf/language "de",
                     :rdf/value    "Dezember"}
                    {:rdf/language "ja",
                     :rdf/value    "12月"}
                    {:rdf/language "zh",
                     :rdf/value    "12月"}],
   :time/month     #inst "2000-12-15T00:00:00.000-05:00"})

(def February
  "February"
  {:db/ident       :greg/February,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "February"},
   :skos/prefLabel [{:rdf/language "it",
                     :rdf/value    "Febbraio"}
                    {:rdf/language "fr",
                     :rdf/value    "Février"}
                    {:rdf/language "ar",
                     :rdf/value    "فبراير"}
                    {:rdf/language "pt",
                     :rdf/value    "Fevereiro"}
                    {:rdf/language "nl",
                     :rdf/value    "Februari"}
                    {:rdf/language "de",
                     :rdf/value    "Februar"}
                    {:rdf/language "zh",
                     :rdf/value    "2月"}
                    {:rdf/language "ja",
                     :rdf/value    "2月"}
                    {:rdf/language "ru",
                     :rdf/value    "Февраль"}
                    {:rdf/language "es",
                     :rdf/value    "Febrero"}
                    {:rdf/language "en",
                     :rdf/value    "February"}
                    {:rdf/language "pl",
                     :rdf/value    "Luty"}],
   :time/month     #inst "2000-02-15T00:00:00.000-05:00"})

(def January
  "January"
  {:db/ident :greg/January,
   :rdf/type :time/MonthOfYear,
   :rdfs/label "January",
   :skos/historyNote
   "A _class_ with the local-name January was present in the 2006 version of OWL-Time. \nIt was presented as an example of how DateTimeDescription could be specialized. \nIn the 2017 version of OWL-Time that class is deprecated, but this individual provided instead, in a separate namespace. ",
   :skos/prefLabel [{:rdf/language "pt",
                     :rdf/value    "Janeiro"}
                    {:rdf/language "de",
                     :rdf/value    "Januar"}
                    {:rdf/language "ru",
                     :rdf/value    "/=20@L"}
                    {:rdf/language "es",
                     :rdf/value    "Enero"}
                    {:rdf/language "it",
                     :rdf/value    "Gennaio"}
                    {:rdf/language "zh",
                     :rdf/value    "1\b"}
                    {:rdf/language "ja",
                     :rdf/value    "1\b"}
                    {:rdf/language "ar",
                     :rdf/value    "JF'J1 (4G1)"}
                    {:rdf/language "pl",
                     :rdf/value    "StyczeD"}
                    {:rdf/language "en",
                     :rdf/value    "January"}
                    {:rdf/language "fr",
                     :rdf/value    "Janvier"}
                    {:rdf/language "nl",
                     :rdf/value    "Januari"}],
   :time/month #inst "2000-01-15T00:00:00.000-05:00"})

(def July
  "July"
  {:db/ident       :greg/July,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "July"},
   :skos/prefLabel [{:rdf/language "en",
                     :rdf/value    "July"}
                    {:rdf/language "it",
                     :rdf/value    "Luglio"}
                    {:rdf/language "de",
                     :rdf/value    "Juli"}
                    {:rdf/language "nl",
                     :rdf/value    "Juli"}
                    {:rdf/language "zh",
                     :rdf/value    "7\b"}
                    {:rdf/language "ja",
                     :rdf/value    "7\b"}
                    {:rdf/language "pt",
                     :rdf/value    "Julho"}
                    {:rdf/language "es",
                     :rdf/value    "Julio"}
                    {:rdf/language "fr",
                     :rdf/value    "Juillet"}
                    {:rdf/language "ar",
                     :rdf/value    "JHDJH"}
                    {:rdf/language "ru",
                     :rdf/value    "N;L"}
                    {:rdf/language "pl",
                     :rdf/value    "Lipiec"}],
   :time/month     #inst "2000-07-15T00:00:00.000-04:00"})

(def June
  "June"
  {:db/ident       :greg/June,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "June"},
   :skos/prefLabel [{:rdf/language "pt",
                     :rdf/value    "Junho"}
                    {:rdf/language "zh",
                     :rdf/value    "6\b"}
                    {:rdf/language "ja",
                     :rdf/value    "6\b"}
                    {:rdf/language "fr",
                     :rdf/value    "Juin"}
                    {:rdf/language "en",
                     :rdf/value    "June"}
                    {:rdf/language "es",
                     :rdf/value    "Junio"}
                    {:rdf/language "pl",
                     :rdf/value    "Czerwiec"}
                    {:rdf/language "nl",
                     :rdf/value    "Juni"}
                    {:rdf/language "de",
                     :rdf/value    "Juni"}
                    {:rdf/language "ru",
                     :rdf/value    "N=L"}
                    {:rdf/language "it",
                     :rdf/value    "Giugno"}
                    {:rdf/language "ar",
                     :rdf/value    "JHFJH"}],
   :time/month     #inst "2000-06-15T00:00:00.000-04:00"})

(def March
  "March"
  {:db/ident       :greg/March,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "March"},
   :skos/prefLabel [{:rdf/language "ar",
                     :rdf/value    "مارس"}
                    {:rdf/language "zh",
                     :rdf/value    "3月"}
                    {:rdf/language "ja",
                     :rdf/value    "3月"}
                    {:rdf/language "de",
                     :rdf/value    "März"}
                    {:rdf/language "ru",
                     :rdf/value    "Март"}
                    {:rdf/language "en",
                     :rdf/value    "March"}
                    {:rdf/language "es",
                     :rdf/value    "Marzo"}
                    {:rdf/language "it",
                     :rdf/value    "Marzo"}
                    {:rdf/language "pt",
                     :rdf/value    "Março"}
                    {:rdf/language "nl",
                     :rdf/value    "Maart"}
                    {:rdf/language "fr",
                     :rdf/value    "Mars (mois)"}
                    {:rdf/language "pl",
                     :rdf/value    "Marzec"}],
   :time/month     #inst "2000-03-15T00:00:00.000-05:00"})

(def May
  "May"
  {:db/ident       :greg/May,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "May"},
   :skos/prefLabel [{:rdf/language "nl",
                     :rdf/value    "Mei"}
                    {:rdf/language "ru",
                     :rdf/value    "Май"}
                    {:rdf/language "ar",
                     :rdf/value    "مايو"}
                    {:rdf/language "pt",
                     :rdf/value    "Maio"}
                    {:rdf/language "fr",
                     :rdf/value    "Mai"}
                    {:rdf/language "de",
                     :rdf/value    "Mai"}
                    {:rdf/language "zh",
                     :rdf/value    "5月"}
                    {:rdf/language "ja",
                     :rdf/value    "5月"}
                    {:rdf/language "es",
                     :rdf/value    "Mayo"}
                    {:rdf/language "pl",
                     :rdf/value    "Maj"}
                    {:rdf/language "it",
                     :rdf/value    "Maggio"}
                    {:rdf/language "en",
                     :rdf/value    "May"}],
   :time/month     #inst "2000-05-15T00:00:00.000-04:00"})

(def November
  "November"
  {:db/ident       :greg/November,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "November"},
   :skos/prefLabel [{:rdf/language "ar",
                     :rdf/value    "نوفمبر"}
                    {:rdf/language "ru",
                     :rdf/value    "Ноябрь"}
                    {:rdf/language "es",
                     :rdf/value    "Noviembre"}
                    {:rdf/language "zh",
                     :rdf/value    "11月"}
                    {:rdf/language "ja",
                     :rdf/value    "11月"}
                    {:rdf/language "fr",
                     :rdf/value    "Novembre"}
                    {:rdf/language "it",
                     :rdf/value    "Novembre"}
                    {:rdf/language "pt",
                     :rdf/value    "Novembro"}
                    {:rdf/language "nl",
                     :rdf/value    "November"}
                    {:rdf/language "en",
                     :rdf/value    "November"}
                    {:rdf/language "de",
                     :rdf/value    "November"}
                    {:rdf/language "pl",
                     :rdf/value    "Listopad"}],
   :time/month     #inst "2000-11-15T00:00:00.000-05:00"})

(def October
  "October"
  {:db/ident       :greg/October,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "October"},
   :skos/prefLabel [{:rdf/language "ar",
                     :rdf/value    "أكتوبر"}
                    {:rdf/language "en",
                     :rdf/value    "October"}
                    {:rdf/language "nl",
                     :rdf/value    "Oktober"}
                    {:rdf/language "es",
                     :rdf/value    "Octubre"}
                    {:rdf/language "de",
                     :rdf/value    "Oktober"}
                    {:rdf/language "ru",
                     :rdf/value    "Октябрь"}
                    {:rdf/language "pl",
                     :rdf/value    "Październik"}
                    {:rdf/language "zh",
                     :rdf/value    "10月"}
                    {:rdf/language "ja",
                     :rdf/value    "10月"}
                    {:rdf/language "pt",
                     :rdf/value    "Outubro"}
                    {:rdf/language "fr",
                     :rdf/value    "Octobre"}
                    {:rdf/language "it",
                     :rdf/value    "Ottobre"}],
   :time/month     #inst "2000-10-15T00:00:00.000-04:00"})

(def September
  "September"
  {:db/ident       :greg/September,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "September"},
   :skos/prefLabel [{:rdf/language "ru",
                     :rdf/value    "Сентябрь"}
                    {:rdf/language "pt",
                     :rdf/value    "Setembro"}
                    {:rdf/language "it",
                     :rdf/value    "Settembre"}
                    {:rdf/language "nl",
                     :rdf/value    "September"}
                    {:rdf/language "en",
                     :rdf/value    "September"}
                    {:rdf/language "de",
                     :rdf/value    "September"}
                    {:rdf/language "fr",
                     :rdf/value    "Septembre"}
                    {:rdf/language "pl",
                     :rdf/value    "Wrzesień"}
                    {:rdf/language "ar",
                     :rdf/value    "سبتمبر"}
                    {:rdf/language "zh",
                     :rdf/value    "9月"}
                    {:rdf/language "ja",
                     :rdf/value    "9月"}
                    {:rdf/language "es",
                     :rdf/value    "Septiembre"}],
   :time/month     #inst "2000-09-15T00:00:00.000-04:00"})