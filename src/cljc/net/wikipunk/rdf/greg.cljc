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
   :rdfs/comment "The set of months-of-the-year from the Gregorian calendar.",
   :rdfs/label "The gregorian months"})

(def April
  "April April April Aprile Avril 4月 4月 Kwiecień Abril Abril أبريل Апрель"
  {:db/ident        :greg/April,
   :rdf/type        :time/MonthOfYear,
   :rdfs/label      "April",
   :rdfs/subClassOf [{:owl/hasValue   :time/unitMonth,
                      :owl/onProperty :time/unitType,
                      :rdf/type       :owl/Restriction}
                     :greg/April],
   :skos/prefLabel  ["April"
                     "April"
                     "April"
                     "Aprile"
                     "Avril"
                     "4月"
                     "4月"
                     "Kwiecień"
                     "Abril"
                     "Abril"
                     "أبريل"
                     "Апрель"],
   :time/month      #inst "2000-04-15T00:00:00.000-04:00",
   :time/unitType   :time/unitMonth})

(def August
  "Август 8月 8月 Sierpień أغسطس Agosto Agosto Agosto Augustus (maand) August August Août"
  {:db/ident       :greg/August,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     "August",
   :skos/prefLabel ["Август"
                    "8月"
                    "8月"
                    "Sierpień"
                    "أغسطس"
                    "Agosto"
                    "Agosto"
                    "Agosto"
                    "Augustus (maand)"
                    "August"
                    "August"
                    "Août"],
   :time/month     #inst "2000-08-15T00:00:00.000-04:00",
   :time/unitType  :time/unitMonth})

(def December
  "December December ديسمبر Diciembre Декабрь Décembre Dezembro Dicembre Grudzień Dezember 12月 12月"
  {:db/ident       :greg/December,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     "December",
   :skos/prefLabel ["December"
                    "December"
                    "ديسمبر"
                    "Diciembre"
                    "Декабрь"
                    "Décembre"
                    "Dezembro"
                    "Dicembre"
                    "Grudzień"
                    "Dezember"
                    "12月"
                    "12月"],
   :time/month     #inst "2000-12-15T00:00:00.000-05:00"})

(def February
  "Febbraio Février فبراير Fevereiro Februari Februar 2月 2月 Февраль Febrero February Luty"
  {:db/ident       :greg/February,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     "February",
   :skos/prefLabel ["Febbraio"
                    "Février"
                    "فبراير"
                    "Fevereiro"
                    "Februari"
                    "Februar"
                    "2月"
                    "2月"
                    "Февраль"
                    "Febrero"
                    "February"
                    "Luty"],
   :time/month     #inst "2000-02-15T00:00:00.000-05:00"})

(def January
  "Janeiro Januar /=20@L Enero Gennaio 1\b 1\b JF'J1 (4G1) StyczeD January Janvier Januari"
  {:db/ident :greg/January,
   :rdf/type :time/MonthOfYear,
   :rdfs/label "January",
   :skos/historyNote
   "A _class_ with the local-name January was present in the 2006 version of OWL-Time. \nIt was presented as an example of how DateTimeDescription could be specialized. \nIn the 2017 version of OWL-Time that class is deprecated, but this individual provided instead, in a separate namespace. ",
   :skos/prefLabel ["Janeiro"
                    "Januar"
                    "/=20@L"
                    "Enero"
                    "Gennaio"
                    "1\b"
                    "1\b"
                    "JF'J1 (4G1)"
                    "StyczeD"
                    "January"
                    "Janvier"
                    "Januari"],
   :time/month #inst "2000-01-15T00:00:00.000-05:00"})

(def July
  "July Luglio Juli Juli 7\b 7\b Julho Julio Juillet JHDJH N;L Lipiec"
  {:db/ident       :greg/July,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     "July",
   :skos/prefLabel ["July"
                    "Luglio"
                    "Juli"
                    "Juli"
                    "7\b"
                    "7\b"
                    "Julho"
                    "Julio"
                    "Juillet"
                    "JHDJH"
                    "N;L"
                    "Lipiec"],
   :time/month     #inst "2000-07-15T00:00:00.000-04:00"})

(def June
  "Junho 6\b 6\b Juin June Junio Czerwiec Juni Juni N=L Giugno JHFJH"
  {:db/ident       :greg/June,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     "June",
   :skos/prefLabel ["Junho"
                    "6\b"
                    "6\b"
                    "Juin"
                    "June"
                    "Junio"
                    "Czerwiec"
                    "Juni"
                    "Juni"
                    "N=L"
                    "Giugno"
                    "JHFJH"],
   :time/month     #inst "2000-06-15T00:00:00.000-04:00"})

(def March
  "مارس 3月 3月 März Март March Marzo Marzo Março Maart Mars (mois) Marzec"
  {:db/ident       :greg/March,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     "March",
   :skos/prefLabel ["مارس"
                    "3月"
                    "3月"
                    "März"
                    "Март"
                    "March"
                    "Marzo"
                    "Marzo"
                    "Março"
                    "Maart"
                    "Mars (mois)"
                    "Marzec"],
   :time/month     #inst "2000-03-15T00:00:00.000-05:00"})

(def May
  "Mei Май مايو Maio Mai Mai 5月 5月 Mayo Maj Maggio May"
  {:db/ident       :greg/May,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     "May",
   :skos/prefLabel ["Mei"
                    "Май"
                    "مايو"
                    "Maio"
                    "Mai"
                    "Mai"
                    "5月"
                    "5月"
                    "Mayo"
                    "Maj"
                    "Maggio"
                    "May"],
   :time/month     #inst "2000-05-15T00:00:00.000-04:00"})

(def November
  "نوفمبر Ноябрь Noviembre 11月 11月 Novembre Novembre Novembro November November November Listopad"
  {:db/ident       :greg/November,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     "November",
   :skos/prefLabel ["نوفمبر"
                    "Ноябрь"
                    "Noviembre"
                    "11月"
                    "11月"
                    "Novembre"
                    "Novembre"
                    "Novembro"
                    "November"
                    "November"
                    "November"
                    "Listopad"],
   :time/month     #inst "2000-11-15T00:00:00.000-05:00"})

(def October
  "أكتوبر October Oktober Octubre Oktober Октябрь Październik 10月 10月 Outubro Octobre Ottobre"
  {:db/ident       :greg/October,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     "October",
   :skos/prefLabel ["أكتوبر"
                    "October"
                    "Oktober"
                    "Octubre"
                    "Oktober"
                    "Октябрь"
                    "Październik"
                    "10月"
                    "10月"
                    "Outubro"
                    "Octobre"
                    "Ottobre"],
   :time/month     #inst "2000-10-15T00:00:00.000-04:00"})

(def September
  "Сентябрь Setembro Settembre September September September Septembre Wrzesień سبتمبر 9月 9月 Septiembre"
  {:db/ident       :greg/September,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     "September",
   :skos/prefLabel ["Сентябрь"
                    "Setembro"
                    "Settembre"
                    "September"
                    "September"
                    "September"
                    "Septembre"
                    "Wrzesień"
                    "سبتمبر"
                    "9月"
                    "9月"
                    "Septiembre"],
   :time/month     #inst "2000-09-15T00:00:00.000-04:00"})