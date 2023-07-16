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
   #xsd/langString
    "The set of months-of-the-year from the Gregorian calendar.@en",
   :rdfs/label #xsd/langString "The gregorian months@en"})

(def April
  {:db/ident        :greg/April,
   :rdf/type        :time/MonthOfYear,
   :rdfs/label      #xsd/langString "April@en",
   :rdfs/subClassOf {:owl/hasValue   :time/unitMonth,
                     :owl/onProperty :time/unitType,
                     :rdf/type       :owl/Restriction},
   :skos/prefLabel  [#xsd/langString "April@nl"
                     #xsd/langString "April@en"
                     #xsd/langString "April@de"
                     #xsd/langString "Aprile@it"
                     #xsd/langString "Avril@fr"
                     #xsd/langString "4月@zh"
                     #xsd/langString "4月@ja"
                     #xsd/langString "Kwiecień@pl"
                     #xsd/langString "Abril@pt"
                     #xsd/langString "Abril@es"
                     #xsd/langString "أبريل@ar"
                     #xsd/langString "Апрель@ru"],
   :time/month      #xsd/gMonth #inst "2000-04-15T00:00:00.000-04:00",
   :time/unitType   :time/unitMonth})

(def August
  {:db/ident       :greg/August,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #xsd/langString "August@en",
   :skos/prefLabel [#xsd/langString "Август@ru"
                    #xsd/langString "8月@zh"
                    #xsd/langString "8月@ja"
                    #xsd/langString "Sierpień@pl"
                    #xsd/langString "أغسطس@ar"
                    #xsd/langString "Agosto@pt"
                    #xsd/langString "Agosto@it"
                    #xsd/langString "Agosto@es"
                    #xsd/langString "Augustus (maand)@nl"
                    #xsd/langString "August@de"
                    #xsd/langString "August@en"
                    #xsd/langString "Août@fr"],
   :time/month     #xsd/gMonth #inst "2000-08-15T00:00:00.000-04:00",
   :time/unitType  :time/unitMonth})

(def December
  {:db/ident       :greg/December,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #xsd/langString "December@en",
   :skos/prefLabel [#xsd/langString "December@nl"
                    #xsd/langString "December@en"
                    #xsd/langString "ديسمبر@ar"
                    #xsd/langString "Diciembre@es"
                    #xsd/langString "Декабрь@ru"
                    #xsd/langString "Décembre@fr"
                    #xsd/langString "Dezembro@pt"
                    #xsd/langString "Dicembre@it"
                    #xsd/langString "Grudzień@pl"
                    #xsd/langString "Dezember@de"
                    #xsd/langString "12月@ja"
                    #xsd/langString "12月@zh"],
   :time/month     #xsd/gMonth #inst "2000-12-15T00:00:00.000-05:00"})

(def February
  {:db/ident       :greg/February,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #xsd/langString "February@en",
   :skos/prefLabel [#xsd/langString "Febbraio@it"
                    #xsd/langString "Février@fr"
                    #xsd/langString "فبراير@ar"
                    #xsd/langString "Fevereiro@pt"
                    #xsd/langString "Februari@nl"
                    #xsd/langString "Februar@de"
                    #xsd/langString "2月@zh"
                    #xsd/langString "2月@ja"
                    #xsd/langString "Февраль@ru"
                    #xsd/langString "Febrero@es"
                    #xsd/langString "February@en"
                    #xsd/langString "Luty@pl"],
   :time/month     #xsd/gMonth #inst "2000-02-15T00:00:00.000-05:00"})

(def January
  {:db/ident :greg/January,
   :rdf/type :time/MonthOfYear,
   :rdfs/label "January",
   :skos/historyNote
   "A _class_ with the local-name January was present in the 2006 version of OWL-Time. \nIt was presented as an example of how DateTimeDescription could be specialized. \nIn the 2017 version of OWL-Time that class is deprecated, but this individual provided instead, in a separate namespace. ",
   :skos/prefLabel [#xsd/langString "Janeiro@pt"
                    #xsd/langString "Januar@de"
                    #xsd/langString "/=20@L@ru"
                    #xsd/langString "Enero@es"
                    #xsd/langString "Gennaio@it"
                    #xsd/langString "1\b@zh"
                    #xsd/langString "1\b@ja"
                    #xsd/langString "JF'J1 (4G1)@ar"
                    #xsd/langString "StyczeD@pl"
                    #xsd/langString "January@en"
                    #xsd/langString "Janvier@fr"
                    #xsd/langString "Januari@nl"],
   :time/month #xsd/gMonth #inst "2000-01-15T00:00:00.000-05:00"})

(def July
  {:db/ident       :greg/July,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #xsd/langString "July@en",
   :skos/prefLabel [#xsd/langString "July@en"
                    #xsd/langString "Luglio@it"
                    #xsd/langString "Juli@de"
                    #xsd/langString "Juli@nl"
                    #xsd/langString "7\b@zh"
                    #xsd/langString "7\b@ja"
                    #xsd/langString "Julho@pt"
                    #xsd/langString "Julio@es"
                    #xsd/langString "Juillet@fr"
                    #xsd/langString "JHDJH@ar"
                    #xsd/langString "N;L@ru"
                    #xsd/langString "Lipiec@pl"],
   :time/month     #xsd/gMonth #inst "2000-07-15T00:00:00.000-04:00"})

(def June
  {:db/ident       :greg/June,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #xsd/langString "June@en",
   :skos/prefLabel [#xsd/langString "Junho@pt"
                    #xsd/langString "6\b@zh"
                    #xsd/langString "6\b@ja"
                    #xsd/langString "Juin@fr"
                    #xsd/langString "June@en"
                    #xsd/langString "Junio@es"
                    #xsd/langString "Czerwiec@pl"
                    #xsd/langString "Juni@nl"
                    #xsd/langString "Juni@de"
                    #xsd/langString "N=L@ru"
                    #xsd/langString "Giugno@it"
                    #xsd/langString "JHFJH@ar"],
   :time/month     #xsd/gMonth #inst "2000-06-15T00:00:00.000-04:00"})

(def March
  {:db/ident       :greg/March,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #xsd/langString "March@en",
   :skos/prefLabel [#xsd/langString "مارس@ar"
                    #xsd/langString "3月@zh"
                    #xsd/langString "3月@ja"
                    #xsd/langString "März@de"
                    #xsd/langString "Март@ru"
                    #xsd/langString "March@en"
                    #xsd/langString "Marzo@es"
                    #xsd/langString "Marzo@it"
                    #xsd/langString "Março@pt"
                    #xsd/langString "Maart@nl"
                    #xsd/langString "Mars (mois)@fr"
                    #xsd/langString "Marzec@pl"],
   :time/month     #xsd/gMonth #inst "2000-03-15T00:00:00.000-05:00"})

(def May
  {:db/ident       :greg/May,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #xsd/langString "May@en",
   :skos/prefLabel [#xsd/langString "Mei@nl"
                    #xsd/langString "Май@ru"
                    #xsd/langString "مايو@ar"
                    #xsd/langString "Maio@pt"
                    #xsd/langString "Mai@fr"
                    #xsd/langString "Mai@de"
                    #xsd/langString "5月@zh"
                    #xsd/langString "5月@ja"
                    #xsd/langString "Mayo@es"
                    #xsd/langString "Maj@pl"
                    #xsd/langString "Maggio@it"
                    #xsd/langString "May@en"],
   :time/month     #xsd/gMonth #inst "2000-05-15T00:00:00.000-04:00"})

(def November
  {:db/ident       :greg/November,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #xsd/langString "November@en",
   :skos/prefLabel [#xsd/langString "نوفمبر@ar"
                    #xsd/langString "Ноябрь@ru"
                    #xsd/langString "Noviembre@es"
                    #xsd/langString "11月@zh"
                    #xsd/langString "11月@ja"
                    #xsd/langString "Novembre@fr"
                    #xsd/langString "Novembre@it"
                    #xsd/langString "Novembro@pt"
                    #xsd/langString "November@nl"
                    #xsd/langString "November@en"
                    #xsd/langString "November@de"
                    #xsd/langString "Listopad@pl"],
   :time/month     #xsd/gMonth #inst "2000-11-15T00:00:00.000-05:00"})

(def October
  {:db/ident       :greg/October,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #xsd/langString "October@en",
   :skos/prefLabel [#xsd/langString "أكتوبر@ar"
                    #xsd/langString "October@en"
                    #xsd/langString "Oktober@nl"
                    #xsd/langString "Octubre@es"
                    #xsd/langString "Oktober@de"
                    #xsd/langString "Октябрь@ru"
                    #xsd/langString "Październik@pl"
                    #xsd/langString "10月@zh"
                    #xsd/langString "10月@ja"
                    #xsd/langString "Outubro@pt"
                    #xsd/langString "Octobre@fr"
                    #xsd/langString "Ottobre@it"],
   :time/month     #xsd/gMonth #inst "2000-10-15T00:00:00.000-04:00"})

(def September
  {:db/ident       :greg/September,
   :rdf/type       :time/MonthOfYear,
   :rdfs/label     #xsd/langString "September@en",
   :skos/prefLabel [#xsd/langString "Сентябрь@ru"
                    #xsd/langString "Setembro@pt"
                    #xsd/langString "Settembre@it"
                    #xsd/langString "September@nl"
                    #xsd/langString "September@en"
                    #xsd/langString "September@de"
                    #xsd/langString "Septembre@fr"
                    #xsd/langString "Wrzesień@pl"
                    #xsd/langString "سبتمبر@ar"
                    #xsd/langString "9月@zh"
                    #xsd/langString "9月@ja"
                    #xsd/langString "Septiembre@es"],
   :time/month     #xsd/gMonth #inst "2000-09-15T00:00:00.000-04:00"})