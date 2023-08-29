(ns net.wikipunk.rdf.greg
  "The set of months-of-the-year from the Gregorian calendar."
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/w3c/sdw/gh-pages/time/rdf/time-gregorian.ttl",
   :dcterms/created #xsd/date #inst "2017-01-20T00:00:00.000-05:00",
   :dcterms/creator {:rdfa/uri "http://orcid.org/0000-0002-3884-3420"},
   :owl/imports {:rdfa/uri "http://www.w3.org/2006/time"},
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
   :rdfs/comment
   #rdf/langString
    "The set of months-of-the-year from the Gregorian calendar.@en",
   :rdfs/label #rdf/langString "The gregorian months@en"})

(def April
  {:db/ident        :greg/April,
   :rdf/type        :time/MonthOfYear,
   :rdfs/label      #rdf/langString "April@en",
   :rdfs/subClassOf {:owl/hasValue   :time/unitMonth,
                     :owl/onProperty :time/unitType,
                     :rdf/type       :owl/Restriction},
   :skos/prefLabel  [#rdf/langString "April@nl"
                     #rdf/langString "April@en"
                     #rdf/langString "April@de"
                     #rdf/langString "Aprile@it"
                     #rdf/langString "Avril@fr"
                     #rdf/langString "4月@zh"
                     #rdf/langString "4月@ja"
                     #rdf/langString "Kwiecień@pl"
                     #rdf/langString "Abril@pt"
                     #rdf/langString "Abril@es"
                     #rdf/langString "أبريل@ar"
                     #rdf/langString "Апрель@ru"],
   :time/month      #xsd/gMonth #inst "2000-04-15T00:00:00.000-04:00",
   :time/unitType   :time/unitMonth})

(def August
  {:db/ident       :greg/August,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #rdf/langString "August@en",
   :skos/prefLabel [#rdf/langString "Август@ru"
                    #rdf/langString "8月@zh"
                    #rdf/langString "8月@ja"
                    #rdf/langString "Sierpień@pl"
                    #rdf/langString "أغسطس@ar"
                    #rdf/langString "Agosto@pt"
                    #rdf/langString "Agosto@it"
                    #rdf/langString "Agosto@es"
                    #rdf/langString "Augustus (maand)@nl"
                    #rdf/langString "August@de"
                    #rdf/langString "August@en"
                    #rdf/langString "Août@fr"],
   :time/month     #xsd/gMonth #inst "2000-08-15T00:00:00.000-04:00",
   :time/unitType  :time/unitMonth})

(def December
  {:db/ident       :greg/December,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #rdf/langString "December@en",
   :skos/prefLabel [#rdf/langString "December@nl"
                    #rdf/langString "December@en"
                    #rdf/langString "ديسمبر@ar"
                    #rdf/langString "Diciembre@es"
                    #rdf/langString "Декабрь@ru"
                    #rdf/langString "Décembre@fr"
                    #rdf/langString "Dezembro@pt"
                    #rdf/langString "Dicembre@it"
                    #rdf/langString "Grudzień@pl"
                    #rdf/langString "Dezember@de"
                    #rdf/langString "12月@ja"
                    #rdf/langString "12月@zh"],
   :time/month     #xsd/gMonth #inst "2000-12-15T00:00:00.000-05:00"})

(def February
  {:db/ident       :greg/February,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #rdf/langString "February@en",
   :skos/prefLabel [#rdf/langString "Febbraio@it"
                    #rdf/langString "Février@fr"
                    #rdf/langString "فبراير@ar"
                    #rdf/langString "Fevereiro@pt"
                    #rdf/langString "Februari@nl"
                    #rdf/langString "Februar@de"
                    #rdf/langString "2月@zh"
                    #rdf/langString "2月@ja"
                    #rdf/langString "Февраль@ru"
                    #rdf/langString "Febrero@es"
                    #rdf/langString "February@en"
                    #rdf/langString "Luty@pl"],
   :time/month     #xsd/gMonth #inst "2000-02-15T00:00:00.000-05:00"})

(def January
  {:db/ident :greg/January,
   :rdf/type :time/MonthOfYear,
   :rdfs/label "January",
   :skos/historyNote
   "A _class_ with the local-name January was present in the 2006 version of OWL-Time. \nIt was presented as an example of how DateTimeDescription could be specialized. \nIn the 2017 version of OWL-Time that class is deprecated, but this individual provided instead, in a separate namespace. ",
   :skos/prefLabel [#rdf/langString "Janeiro@pt"
                    #rdf/langString "Januar@de"
                    #rdf/langString "/=20@L@ru"
                    #rdf/langString "Enero@es"
                    #rdf/langString "Gennaio@it"
                    #rdf/langString "1\b@zh"
                    #rdf/langString "1\b@ja"
                    #rdf/langString "JF'J1 (4G1)@ar"
                    #rdf/langString "StyczeD@pl"
                    #rdf/langString "January@en"
                    #rdf/langString "Janvier@fr"
                    #rdf/langString "Januari@nl"],
   :time/month #xsd/gMonth #inst "2000-01-15T00:00:00.000-05:00"})

(def July
  {:db/ident       :greg/July,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #rdf/langString "July@en",
   :skos/prefLabel [#rdf/langString "July@en"
                    #rdf/langString "Luglio@it"
                    #rdf/langString "Juli@de"
                    #rdf/langString "Juli@nl"
                    #rdf/langString "7\b@zh"
                    #rdf/langString "7\b@ja"
                    #rdf/langString "Julho@pt"
                    #rdf/langString "Julio@es"
                    #rdf/langString "Juillet@fr"
                    #rdf/langString "JHDJH@ar"
                    #rdf/langString "N;L@ru"
                    #rdf/langString "Lipiec@pl"],
   :time/month     #xsd/gMonth #inst "2000-07-15T00:00:00.000-04:00"})

(def June
  {:db/ident       :greg/June,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #rdf/langString "June@en",
   :skos/prefLabel [#rdf/langString "Junho@pt"
                    #rdf/langString "6\b@zh"
                    #rdf/langString "6\b@ja"
                    #rdf/langString "Juin@fr"
                    #rdf/langString "June@en"
                    #rdf/langString "Junio@es"
                    #rdf/langString "Czerwiec@pl"
                    #rdf/langString "Juni@nl"
                    #rdf/langString "Juni@de"
                    #rdf/langString "N=L@ru"
                    #rdf/langString "Giugno@it"
                    #rdf/langString "JHFJH@ar"],
   :time/month     #xsd/gMonth #inst "2000-06-15T00:00:00.000-04:00"})

(def March
  {:db/ident       :greg/March,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #rdf/langString "March@en",
   :skos/prefLabel [#rdf/langString "مارس@ar"
                    #rdf/langString "3月@zh"
                    #rdf/langString "3月@ja"
                    #rdf/langString "März@de"
                    #rdf/langString "Март@ru"
                    #rdf/langString "March@en"
                    #rdf/langString "Marzo@es"
                    #rdf/langString "Marzo@it"
                    #rdf/langString "Março@pt"
                    #rdf/langString "Maart@nl"
                    #rdf/langString "Mars (mois)@fr"
                    #rdf/langString "Marzec@pl"],
   :time/month     #xsd/gMonth #inst "2000-03-15T00:00:00.000-05:00"})

(def May
  {:db/ident       :greg/May,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #rdf/langString "May@en",
   :skos/prefLabel [#rdf/langString "Mei@nl"
                    #rdf/langString "Май@ru"
                    #rdf/langString "مايو@ar"
                    #rdf/langString "Maio@pt"
                    #rdf/langString "Mai@fr"
                    #rdf/langString "Mai@de"
                    #rdf/langString "5月@zh"
                    #rdf/langString "5月@ja"
                    #rdf/langString "Mayo@es"
                    #rdf/langString "Maj@pl"
                    #rdf/langString "Maggio@it"
                    #rdf/langString "May@en"],
   :time/month     #xsd/gMonth #inst "2000-05-15T00:00:00.000-04:00"})

(def November
  {:db/ident       :greg/November,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #rdf/langString "November@en",
   :skos/prefLabel [#rdf/langString "نوفمبر@ar"
                    #rdf/langString "Ноябрь@ru"
                    #rdf/langString "Noviembre@es"
                    #rdf/langString "11月@zh"
                    #rdf/langString "11月@ja"
                    #rdf/langString "Novembre@fr"
                    #rdf/langString "Novembre@it"
                    #rdf/langString "Novembro@pt"
                    #rdf/langString "November@nl"
                    #rdf/langString "November@en"
                    #rdf/langString "November@de"
                    #rdf/langString "Listopad@pl"],
   :time/month     #xsd/gMonth #inst "2000-11-15T00:00:00.000-05:00"})

(def October
  {:db/ident       :greg/October,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #rdf/langString "October@en",
   :skos/prefLabel [#rdf/langString "أكتوبر@ar"
                    #rdf/langString "October@en"
                    #rdf/langString "Oktober@nl"
                    #rdf/langString "Octubre@es"
                    #rdf/langString "Oktober@de"
                    #rdf/langString "Октябрь@ru"
                    #rdf/langString "Październik@pl"
                    #rdf/langString "10月@zh"
                    #rdf/langString "10月@ja"
                    #rdf/langString "Outubro@pt"
                    #rdf/langString "Octobre@fr"
                    #rdf/langString "Ottobre@it"],
   :time/month     #xsd/gMonth #inst "2000-10-15T00:00:00.000-04:00"})

(def September
  {:db/ident       :greg/September,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #rdf/langString "September@en",
   :skos/prefLabel [#rdf/langString "Сентябрь@ru"
                    #rdf/langString "Setembro@pt"
                    #rdf/langString "Settembre@it"
                    #rdf/langString "September@nl"
                    #rdf/langString "September@en"
                    #rdf/langString "September@de"
                    #rdf/langString "Septembre@fr"
                    #rdf/langString "Wrzesień@pl"
                    #rdf/langString "سبتمبر@ar"
                    #rdf/langString "9月@zh"
                    #rdf/langString "9月@ja"
                    #rdf/langString "Septiembre@es"],
   :time/month     #xsd/gMonth #inst "2000-09-15T00:00:00.000-04:00"})
