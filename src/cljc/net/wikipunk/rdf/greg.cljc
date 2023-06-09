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
   :rdfs/comment
   #voc/lstr "The set of months-of-the-year from the Gregorian calendar.@en",
   :rdfs/label #voc/lstr "The gregorian months@en"})

(def April
  "April"
  {:db/ident        :greg/April,
   :rdf/type        :time/MonthOfYear,
   :rdfs/label      #voc/lstr "April@en",
   :rdfs/subClassOf {:owl/hasValue   :time/unitMonth,
                     :owl/onProperty :time/unitType,
                     :rdf/type       :owl/Restriction},
   :skos/prefLabel  [#voc/lstr "April@nl"
                     #voc/lstr "April@en"
                     #voc/lstr "April@de"
                     #voc/lstr "Aprile@it"
                     #voc/lstr "Avril@fr"
                     #voc/lstr "4月@zh"
                     #voc/lstr "4月@ja"
                     #voc/lstr "Kwiecień@pl"
                     #voc/lstr "Abril@pt"
                     #voc/lstr "Abril@es"
                     #voc/lstr "أبريل@ar"
                     #voc/lstr "Апрель@ru"],
   :time/month      #inst "2000-04-15T00:00:00.000-04:00",
   :time/unitType   :time/unitMonth})

(def August
  "August"
  {:db/ident       :greg/August,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #voc/lstr "August@en",
   :skos/prefLabel [#voc/lstr "Август@ru"
                    #voc/lstr "8月@zh"
                    #voc/lstr "8月@ja"
                    #voc/lstr "Sierpień@pl"
                    #voc/lstr "أغسطس@ar"
                    #voc/lstr "Agosto@pt"
                    #voc/lstr "Agosto@it"
                    #voc/lstr "Agosto@es"
                    #voc/lstr "Augustus (maand)@nl"
                    #voc/lstr "August@de"
                    #voc/lstr "August@en"
                    #voc/lstr "Août@fr"],
   :time/month     #inst "2000-08-15T00:00:00.000-04:00",
   :time/unitType  :time/unitMonth})

(def December
  "December"
  {:db/ident       :greg/December,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #voc/lstr "December@en",
   :skos/prefLabel [#voc/lstr "December@nl"
                    #voc/lstr "December@en"
                    #voc/lstr "ديسمبر@ar"
                    #voc/lstr "Diciembre@es"
                    #voc/lstr "Декабрь@ru"
                    #voc/lstr "Décembre@fr"
                    #voc/lstr "Dezembro@pt"
                    #voc/lstr "Dicembre@it"
                    #voc/lstr "Grudzień@pl"
                    #voc/lstr "Dezember@de"
                    #voc/lstr "12月@ja"
                    #voc/lstr "12月@zh"],
   :time/month     #inst "2000-12-15T00:00:00.000-05:00"})

(def February
  "February"
  {:db/ident       :greg/February,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #voc/lstr "February@en",
   :skos/prefLabel [#voc/lstr "Febbraio@it"
                    #voc/lstr "Février@fr"
                    #voc/lstr "فبراير@ar"
                    #voc/lstr "Fevereiro@pt"
                    #voc/lstr "Februari@nl"
                    #voc/lstr "Februar@de"
                    #voc/lstr "2月@zh"
                    #voc/lstr "2月@ja"
                    #voc/lstr "Февраль@ru"
                    #voc/lstr "Febrero@es"
                    #voc/lstr "February@en"
                    #voc/lstr "Luty@pl"],
   :time/month     #inst "2000-02-15T00:00:00.000-05:00"})

(def January
  "January"
  {:db/ident :greg/January,
   :rdf/type :time/MonthOfYear,
   :rdfs/label "January",
   :skos/historyNote
   "A _class_ with the local-name January was present in the 2006 version of OWL-Time. \nIt was presented as an example of how DateTimeDescription could be specialized. \nIn the 2017 version of OWL-Time that class is deprecated, but this individual provided instead, in a separate namespace. ",
   :skos/prefLabel [#voc/lstr "Janeiro@pt"
                    #voc/lstr "Januar@de"
                    #voc/lstr "/=20@L@ru"
                    #voc/lstr "Enero@es"
                    #voc/lstr "Gennaio@it"
                    #voc/lstr "1\b@zh"
                    #voc/lstr "1\b@ja"
                    #voc/lstr "JF'J1 (4G1)@ar"
                    #voc/lstr "StyczeD@pl"
                    #voc/lstr "January@en"
                    #voc/lstr "Janvier@fr"
                    #voc/lstr "Januari@nl"],
   :time/month #inst "2000-01-15T00:00:00.000-05:00"})

(def July
  "July"
  {:db/ident       :greg/July,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #voc/lstr "July@en",
   :skos/prefLabel [#voc/lstr "July@en"
                    #voc/lstr "Luglio@it"
                    #voc/lstr "Juli@de"
                    #voc/lstr "Juli@nl"
                    #voc/lstr "7\b@zh"
                    #voc/lstr "7\b@ja"
                    #voc/lstr "Julho@pt"
                    #voc/lstr "Julio@es"
                    #voc/lstr "Juillet@fr"
                    #voc/lstr "JHDJH@ar"
                    #voc/lstr "N;L@ru"
                    #voc/lstr "Lipiec@pl"],
   :time/month     #inst "2000-07-15T00:00:00.000-04:00"})

(def June
  "June"
  {:db/ident       :greg/June,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #voc/lstr "June@en",
   :skos/prefLabel [#voc/lstr "Junho@pt"
                    #voc/lstr "6\b@zh"
                    #voc/lstr "6\b@ja"
                    #voc/lstr "Juin@fr"
                    #voc/lstr "June@en"
                    #voc/lstr "Junio@es"
                    #voc/lstr "Czerwiec@pl"
                    #voc/lstr "Juni@nl"
                    #voc/lstr "Juni@de"
                    #voc/lstr "N=L@ru"
                    #voc/lstr "Giugno@it"
                    #voc/lstr "JHFJH@ar"],
   :time/month     #inst "2000-06-15T00:00:00.000-04:00"})

(def March
  "March"
  {:db/ident       :greg/March,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #voc/lstr "March@en",
   :skos/prefLabel [#voc/lstr "مارس@ar"
                    #voc/lstr "3月@zh"
                    #voc/lstr "3月@ja"
                    #voc/lstr "März@de"
                    #voc/lstr "Март@ru"
                    #voc/lstr "March@en"
                    #voc/lstr "Marzo@es"
                    #voc/lstr "Marzo@it"
                    #voc/lstr "Março@pt"
                    #voc/lstr "Maart@nl"
                    #voc/lstr "Mars (mois)@fr"
                    #voc/lstr "Marzec@pl"],
   :time/month     #inst "2000-03-15T00:00:00.000-05:00"})

(def May
  "May"
  {:db/ident       :greg/May,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #voc/lstr "May@en",
   :skos/prefLabel [#voc/lstr "Mei@nl"
                    #voc/lstr "Май@ru"
                    #voc/lstr "مايو@ar"
                    #voc/lstr "Maio@pt"
                    #voc/lstr "Mai@fr"
                    #voc/lstr "Mai@de"
                    #voc/lstr "5月@zh"
                    #voc/lstr "5月@ja"
                    #voc/lstr "Mayo@es"
                    #voc/lstr "Maj@pl"
                    #voc/lstr "Maggio@it"
                    #voc/lstr "May@en"],
   :time/month     #inst "2000-05-15T00:00:00.000-04:00"})

(def November
  "November"
  {:db/ident       :greg/November,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #voc/lstr "November@en",
   :skos/prefLabel [#voc/lstr "نوفمبر@ar"
                    #voc/lstr "Ноябрь@ru"
                    #voc/lstr "Noviembre@es"
                    #voc/lstr "11月@zh"
                    #voc/lstr "11月@ja"
                    #voc/lstr "Novembre@fr"
                    #voc/lstr "Novembre@it"
                    #voc/lstr "Novembro@pt"
                    #voc/lstr "November@nl"
                    #voc/lstr "November@en"
                    #voc/lstr "November@de"
                    #voc/lstr "Listopad@pl"],
   :time/month     #inst "2000-11-15T00:00:00.000-05:00"})

(def October
  "October"
  {:db/ident       :greg/October,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #voc/lstr "October@en",
   :skos/prefLabel [#voc/lstr "أكتوبر@ar"
                    #voc/lstr "October@en"
                    #voc/lstr "Oktober@nl"
                    #voc/lstr "Octubre@es"
                    #voc/lstr "Oktober@de"
                    #voc/lstr "Октябрь@ru"
                    #voc/lstr "Październik@pl"
                    #voc/lstr "10月@zh"
                    #voc/lstr "10月@ja"
                    #voc/lstr "Outubro@pt"
                    #voc/lstr "Octobre@fr"
                    #voc/lstr "Ottobre@it"],
   :time/month     #inst "2000-10-15T00:00:00.000-04:00"})

(def September
  "September"
  {:db/ident       :greg/September,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #voc/lstr "September@en",
   :skos/prefLabel [#voc/lstr "Сентябрь@ru"
                    #voc/lstr "Setembro@pt"
                    #voc/lstr "Settembre@it"
                    #voc/lstr "September@nl"
                    #voc/lstr "September@en"
                    #voc/lstr "September@de"
                    #voc/lstr "Septembre@fr"
                    #voc/lstr "Wrzesień@pl"
                    #voc/lstr "سبتمبر@ar"
                    #voc/lstr "9月@zh"
                    #voc/lstr "9月@ja"
                    #voc/lstr "Septiembre@es"],
   :time/month     #inst "2000-09-15T00:00:00.000-04:00"})