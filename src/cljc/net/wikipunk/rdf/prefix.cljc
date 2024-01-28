(ns net.wikipunk.rdf.prefix
  {:namespaces            {"dcterms" "http://purl.org/dc/terms/",
                           "owl" "http://www.w3.org/2002/07/owl#",
                           "prefix" "http://qudt.org/vocab/prefix/",
                           "qudt" "http://qudt.org/schema/qudt/",
                           "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                           "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                           "vaem" "http://www.linkedmodel.org/schema/vaem#",
                           "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports           {:xsd/anyURI "http://qudt.org/schema/facade/qudt"},
   :owl/versionInfo       "Created with TopBraid Composer",
   :rdf/type              :owl/Ontology,
   :rdfa/prefix           "prefix",
   :rdfa/uri              "http://qudt.org/vocab/prefix/",
   :rdfs/label            "QUDT VOCAB Decimal Prefixes Release 2.1.35",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-PREFIXES,
   :xsd/anyURI            "http://qudt.org/vocab/prefix"})

(def Atto
  {:db/ident :prefix/Atto,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "\"atto\" is a decimal prefix for expressing a value with a scaling of \\(10^{-18}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Atto"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Atto?oldid=412748080"},
   :qudt/prefixMultiplier 1.0E-18,
   :qudt/symbol "a",
   :qudt/ucumCode "a",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Atto"}})

(def Centi
  {:db/ident :prefix/Centi,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'centi' is a decimal prefix for expressing a value with a scaling of \\(10^{-2}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Centi-"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Centi-?oldid=480291808"},
   :qudt/prefixMultiplier 0.01,
   :qudt/symbol "c",
   :qudt/ucumCode "c",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Centi"}})

(def Deca
  {:db/ident              :prefix/Deca,
   :qudt/dbpediaMatch     {:xsd/anyURI "http://dbpedia.org/resource/Deca"},
   :qudt/exactMatch       :prefix/Deka,
   :qudt/prefixMultiplier 10.0,
   :qudt/symbol           "da",
   :qudt/ucumCode         "da",
   :rdf/type              #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy      {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Deca"}})

(def Deci
  {:db/ident :prefix/Deci,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "\"deci\" is a decimal prefix for expressing a value with a scaling of \\(10^{-1}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Deci-"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Deci-?oldid=469980160"},
   :qudt/prefixMultiplier 0.1,
   :qudt/symbol "d",
   :qudt/ucumCode "d",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Deci"}})

(def Deka
  {:db/ident :prefix/Deka,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "<strong>deka</strong> is a decimal prefix for expressing a value with a scaling of \\(10^{1}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Deca"},
   :qudt/exactMatch :prefix/Deca,
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Deca?oldid=480093935"},
   :qudt/prefixMultiplier 10.0,
   :qudt/symbol "da",
   :qudt/ucumCode "da",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Deka"}})

(def Exa
  {:db/ident :prefix/Exa,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'exa' is a decimal prefix for expressing a value with a scaling of \\(10^{18}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Exa-"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Exa-?oldid=494400216"},
   :qudt/prefixMultiplier 1.0E18,
   :qudt/symbol "E",
   :qudt/ucumCode "E",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exa"}})

(def Exbi
  {:db/ident :prefix/Exbi,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "A binary prefix for expressing a value with a scaling of \\(1024^{6}\\), or \\(2^{60}\\)."},
   :qudt/prefixMultiplier 1.52921504606846976E17,
   :qudt/symbol "Ei",
   :rdf/type #{:qudt/Prefix :qudt/BinaryPrefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exbi"}})

(def Femto
  {:db/ident :prefix/Femto,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'femto' is a decimal prefix for expressing a value with a scaling of \\(10^{-15}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Femto-"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Femto-?oldid=467211359"},
   :qudt/prefixMultiplier 1.0E-15,
   :qudt/symbol "f",
   :qudt/ucumCode "f",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Femto"}})

(def Gibi
  {:db/ident :prefix/Gibi,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "A binary prefix for expressing a value with a scaling of \\(1024^{3}\\), or \\(2^{30}\\)."},
   :qudt/prefixMultiplier 1.073741824E9,
   :qudt/symbol "Gi",
   :rdf/type #{:qudt/Prefix :qudt/BinaryPrefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gibi"}})

(def Giga
  {:db/ident :prefix/Giga,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'giga' is a decimal prefix for expressing a value with a scaling of \\(10^{9}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Giga-"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Giga-?oldid=473222816"},
   :qudt/prefixMultiplier 1.0E9,
   :qudt/symbol "G",
   :qudt/ucumCode "G",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Giga"}})

(def Hecto
  {:db/ident :prefix/Hecto,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'hecto' is a decimal prefix for expressing a value with a scaling of \\(10^{2}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Hecto-"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Hecto-?oldid=494711166"},
   :qudt/prefixMultiplier 100.0,
   :qudt/symbol "h",
   :qudt/ucumCode "h",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hecto"}})

(def Kibi
  {:db/ident :prefix/Kibi,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "A binary prefix for expressing a value with a scaling of \\(1024\\), or \\(2^{10}\\)."},
   :qudt/prefixMultiplier 1024.0,
   :qudt/symbol "Ki",
   :rdf/type #{:qudt/Prefix :qudt/BinaryPrefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Kibi"}})

(def Kilo
  {:db/ident :prefix/Kilo,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "\"kilo\" is a decimal prefix for expressing a value with a scaling of \\(10^{3}\"\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Kilo"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Kilo?oldid=461428121"},
   :qudt/prefixMultiplier 1000.0,
   :qudt/symbol "k",
   :qudt/ucumCode "k",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Kilo"}})

(def Mebi
  {:db/ident :prefix/Mebi,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "A binary prefix for expressing a value with a scaling of \\(1024^{2}\\), or \\(2^{20}\\)."},
   :qudt/prefixMultiplier 1048576.0,
   :qudt/symbol "Mi",
   :rdf/type #{:qudt/Prefix :qudt/BinaryPrefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mebi"}})

(def Mega
  {:db/ident :prefix/Mega,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'mega' is a decimal prefix for expressing a value with a scaling of \\(10^{6}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Mega"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Mega?oldid=494040441"},
   :qudt/prefixMultiplier 1000000.0,
   :qudt/symbol "M",
   :qudt/ucumCode "M",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mega"}})

(def Micro
  {:db/ident :prefix/Micro,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "\"micro\" is a decimal prefix for expressing a value with a scaling of \\(10^{-6}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Micro"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Micro?oldid=491618374"},
   :qudt/prefixMultiplier 1.0E-6,
   :qudt/symbol "μ",
   :qudt/ucumCode "u",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Micro"}})

(def Milli
  {:db/ident :prefix/Milli,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'milli' is a decimal prefix for expressing a value with a scaling of \\(10^{-3}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Milli-"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Milli-?oldid=467190544"},
   :qudt/prefixMultiplier 0.001,
   :qudt/symbol "m",
   :qudt/ucumCode "m",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Milli"}})

(def Nano
  {:db/ident :prefix/Nano,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'nano' is a  decimal prefix for expressing a value with a scaling of \\(10^{-9}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Nano"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Nano?oldid=489001692"},
   :qudt/prefixMultiplier 1.0E-9,
   :qudt/symbol "n",
   :qudt/ucumCode "n",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Nano"}})

(def Pebi
  {:db/ident :prefix/Pebi,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "A binary prefix for expressing a value with a scaling of \\(1024^{5}\\), or \\(2^{50}\\)."},
   :qudt/prefixMultiplier 1.25899906842624E14,
   :qudt/symbol "Pi",
   :rdf/type #{:qudt/Prefix :qudt/BinaryPrefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pebi"}})

(def Peta
  {:db/ident :prefix/Peta,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'peta' is a decimal prefix for expressing a value with a scaling of \\(10^{15}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Peta"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Peta?oldid=488263435"},
   :qudt/prefixMultiplier 1.0E15,
   :qudt/symbol "P",
   :qudt/ucumCode "P",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Peta"}})

(def Pico
  {:db/ident :prefix/Pico,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'pico' is a decimal prefix for expressing a value with a scaling of \\(10^{-12}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Pico"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Pico?oldid=485697614"},
   :qudt/prefixMultiplier 1.0E-12,
   :qudt/symbol "p",
   :qudt/ucumCode "p",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pico"}})

(def Quecto
  {:db/ident :prefix/Quecto,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'quecto' is a decimal prefix for expressing a value with a scaling of \\(10^{-30}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Quecto"},
   :qudt/informativeReference
   {:xsd/anyURI "https://www.nist.gov/pml/owm/metric-si-prefixes"},
   :qudt/prefixMultiplier 1.0E-30,
   :qudt/symbol "q",
   :qudt/ucumCode "q",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quecto"}})

(def Quetta
  {:db/ident :prefix/Quetta,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'quetta' is a decimal prefix for expressing a value with a scaling of \\(10^{30}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Quetta"},
   :qudt/informativeReference
   {:xsd/anyURI "https://www.nist.gov/pml/owm/metric-si-prefixes"},
   :qudt/prefixMultiplier 1.0E30,
   :qudt/symbol "Q",
   :qudt/ucumCode "Q",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quetta"}})

(def Ronna
  {:db/ident :prefix/Ronna,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'ronna' is a decimal prefix for expressing a value with a scaling of \\(10^{27}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Ronna"},
   :qudt/informativeReference
   {:xsd/anyURI "https://www.nist.gov/pml/owm/metric-si-prefixes"},
   :qudt/prefixMultiplier 1.0E27,
   :qudt/symbol "R",
   :qudt/ucumCode "R",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ronna"}})

(def Ronto
  {:db/ident :prefix/Ronto,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'ronto' is a decimal prefix for expressing a value with a scaling of \\(10^{-27}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Ronto"},
   :qudt/informativeReference
   {:xsd/anyURI "https://www.nist.gov/pml/owm/metric-si-prefixes"},
   :qudt/prefixMultiplier 1.0E-27,
   :qudt/symbol "r",
   :qudt/ucumCode "r",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ronto"}})

(def Tebi
  {:db/ident :prefix/Tebi,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "A binary prefix for expressing a value with a scaling of \\(1024^4}\\), or \\(2^{40}\\)."},
   :qudt/prefixMultiplier 1.099511627776E12,
   :qudt/symbol "Ti",
   :rdf/type #{:qudt/Prefix :qudt/BinaryPrefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tebi"}})

(def Tera
  {:db/ident :prefix/Tera,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'tera' is a decimal prefix for expressing a value with a scaling of \\(10^{12}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Tera"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Tera?oldid=494204788"},
   :qudt/prefixMultiplier 1.0E12,
   :qudt/symbol "T",
   :qudt/ucumCode "T",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tera"}})

(def Yobi
  {:db/ident :prefix/Yobi,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "A binary prefix for expressing a value with a scaling of \\(1024^{8}\\), or \\(2^{80}\\)."},
   :qudt/prefixMultiplier 1.2089258196146292E24,
   :qudt/symbol "Yi",
   :rdf/type #{:qudt/Prefix :qudt/BinaryPrefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Yobi"}})

(def Yocto
  {:db/ident :prefix/Yocto,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'yocto' is a decimal prefix for expressing a value with a scaling of \\(10^{-24}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Yocto-"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Yocto-?oldid=488155799"},
   :qudt/prefixMultiplier 1.0E-24,
   :qudt/symbol "y",
   :qudt/ucumCode "y",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Yocto"}})

(def Yotta
  {:db/ident :prefix/Yotta,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'yotta' is a decimal prefix for expressing a value with a scaling of \\(10^{24}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Yotta-"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Yotta-?oldid=494538119"},
   :qudt/prefixMultiplier 1.0E24,
   :qudt/symbol "Y",
   :qudt/ucumCode "Y",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Yotta"}})

(def Zebi
  {:db/ident :prefix/Zebi,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "A binary prefix for expressing a value with a scaling of \\(1024^{7}\\), or \\(2^{70}\\)."},
   :qudt/prefixMultiplier 1.1805916207174113E21,
   :qudt/symbol "Zi",
   :rdf/type #{:qudt/Prefix :qudt/BinaryPrefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zebi"}})

(def Zepto
  {:db/ident :prefix/Zepto,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'zepto' is a decimal prefix for expressing a value with a scaling of \\(10^{-21}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Zepto-"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Zepto-?oldid=476974663"},
   :qudt/prefixMultiplier 1.0E-21,
   :qudt/symbol "z",
   :qudt/ucumCode "z",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zepto"}})

(def Zetta
  {:db/ident :prefix/Zetta,
   :dcterms/description
   {:rdf/type :qudt/LatexString,
    :rdf/value
    "'zetta' is a decimal prefix for expressing a value with a scaling of \\(10^{21}\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Zetta-"},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Zetta-?oldid=495223080"},
   :qudt/prefixMultiplier 1.0E21,
   :qudt/symbol "Z",
   :qudt/ucumCode "Z",
   :rdf/type #{:qudt/DecimalPrefix :qudt/Prefix},
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/prefix"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zetta"}})

(def urn:uuid:b6064a4e-19b9-5ad2-a6b9-6855d75c4529
  {:owl/imports           {:xsd/anyURI "http://qudt.org/schema/facade/qudt"},
   :owl/versionInfo       "Created with TopBraid Composer",
   :rdf/type              :owl/Ontology,
   :rdfs/label            "QUDT VOCAB Decimal Prefixes Release 2.1.35",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-PREFIXES,
   :xsd/anyURI            "http://qudt.org/vocab/prefix"})