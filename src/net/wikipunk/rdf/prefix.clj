(ns net.wikipunk.rdf.prefix
  "http://qudt.org/2.1/vocab/prefix/"
  {:dcat/downloadURL      "https://qudt.org/2.1/vocab/prefix.ttl",
   :owl/imports           "http://qudt.org/2.1/schema/facade/qudt",
   :owl/versionIRI        "http://qudt.org/2.1/vocab/prefix",
   :owl/versionInfo       "Created with TopBraid Composer",
   :rdf/ns-prefix-map     {"dcterms" "http://purl.org/dc/terms/",
                           "owl" "http://www.w3.org/2002/07/owl#",
                           "prefix" "http://qudt.org/vocab/prefix/",
                           "qudt" "http://qudt.org/schema/qudt/",
                           "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                           "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                           "vaem" "http://www.linkedmodel.org/schema/vaem#",
                           "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type              :owl/Ontology,
   :rdf/uri               "http://qudt.org/2.1/vocab/prefix",
   :rdfa/prefix           "prefix",
   :rdfa/uri              "http://qudt.org/2.1/vocab/prefix/",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-PREFIXES})

(def Atto
  "\"atto\" is a decimal prefix for expressing a value with a scaling of \\(10^{-18}\\)."
  {:db/ident :prefix/Atto,
   :dcterms/description
   "\"atto\" is a decimal prefix for expressing a value with a scaling of \\(10^{-18}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Atto",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Atto?oldid=412748080",
   :qudt/prefixMultiplier 1.0E-18,
   :qudt/symbol "a",
   :qudt/ucumCode "a",
   :rdf/type [:qudt/DecimalPrefix :qudt/Prefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Atto"}})

(def Centi
  "'centi' is a decimal prefix for expressing a value with a scaling of \\(10^{-2}\\)."
  {:db/ident :prefix/Centi,
   :dcterms/description
   "'centi' is a decimal prefix for expressing a value with a scaling of \\(10^{-2}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Centi-",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Centi-?oldid=480291808",
   :qudt/prefixMultiplier 0.01,
   :qudt/symbol "c",
   :qudt/ucumCode "c",
   :rdf/type [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Centi"}})

(def Deca
  "Deca"
  {:db/ident              :prefix/Deca,
   :qudt/dbpediaMatch     "http://dbpedia.org/resource/Deca",
   :qudt/prefixMultiplier 10.0,
   :qudt/symbol           "da",
   :qudt/ucumCode         "da",
   :rdf/type              [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy      "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Deca"}})

(def Deci
  "\"deci\" is a decimal prefix for expressing a value with a scaling of \\(10^{-1}\\)."
  {:db/ident :prefix/Deci,
   :dcterms/description
   "\"deci\" is a decimal prefix for expressing a value with a scaling of \\(10^{-1}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Deci-",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Deci-?oldid=469980160",
   :qudt/prefixMultiplier 0.1,
   :qudt/symbol "d",
   :qudt/ucumCode "d",
   :rdf/type [:qudt/DecimalPrefix :qudt/Prefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Deci"}})

(def Deka
  "<strong>deka</strong> is a decimal prefix for expressing a value with a scaling of \\(10^{1}\\)."
  {:db/ident :prefix/Deka,
   :dcterms/description
   "<strong>deka</strong> is a decimal prefix for expressing a value with a scaling of \\(10^{1}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Deca",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Deca?oldid=480093935",
   :qudt/prefixMultiplier 10.0,
   :qudt/symbol "da",
   :qudt/ucumCode "da",
   :rdf/type [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Deka"}})

(def Exa
  "'exa' is a decimal prefix for expressing a value with a scaling of \\(10^{18}\\)."
  {:db/ident :prefix/Exa,
   :dcterms/description
   "'exa' is a decimal prefix for expressing a value with a scaling of \\(10^{18}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Exa-",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Exa-?oldid=494400216",
   :qudt/prefixMultiplier 1.0E18,
   :qudt/symbol "E",
   :qudt/ucumCode "E",
   :rdf/type [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exa"}})

(def Exbi
  "A binary prefix for expressing a value with a scaling of \\(1024^{6}\\), or \\(2^{60}\\)."
  {:db/ident :prefix/Exbi,
   :dcterms/description
   "A binary prefix for expressing a value with a scaling of \\(1024^{6}\\), or \\(2^{60}\\).",
   :qudt/prefixMultiplier 1.52921504606846976E17,
   :qudt/symbol "Ei",
   :rdf/type [:qudt/Prefix :qudt/BinaryPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exbi"}})

(def Femto
  "'femto' is a decimal prefix for expressing a value with a scaling of \\(10^{-15}\\)."
  {:db/ident :prefix/Femto,
   :dcterms/description
   "'femto' is a decimal prefix for expressing a value with a scaling of \\(10^{-15}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Femto-",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Femto-?oldid=467211359",
   :qudt/prefixMultiplier 1.0E-15,
   :qudt/symbol "f",
   :qudt/ucumCode "f",
   :rdf/type [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Femto"}})

(def Gibi
  "A binary prefix for expressing a value with a scaling of \\(1024^{3}\\), or \\(2^{30}\\)."
  {:db/ident :prefix/Gibi,
   :dcterms/description
   "A binary prefix for expressing a value with a scaling of \\(1024^{3}\\), or \\(2^{30}\\).",
   :qudt/prefixMultiplier 1.073741824E9,
   :qudt/symbol "Gi",
   :rdf/type [:qudt/Prefix :qudt/BinaryPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gibi"}})

(def Giga
  "'giga' is a decimal prefix for expressing a value with a scaling of \\(10^{9}\\)."
  {:db/ident :prefix/Giga,
   :dcterms/description
   "'giga' is a decimal prefix for expressing a value with a scaling of \\(10^{9}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Giga-",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Giga-?oldid=473222816",
   :qudt/prefixMultiplier 1.0E9,
   :qudt/symbol "G",
   :qudt/ucumCode "G",
   :rdf/type [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Giga"}})

(def Hecto
  "'hecta' is a decimal prefix for expressing a value with a scaling of \\(10^{2}\"\\)."
  {:db/ident :prefix/Hecto,
   :dcterms/description
   "'hecta' is a decimal prefix for expressing a value with a scaling of \\(10^{2}\"\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Hecto-",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Hecto-?oldid=494711166",
   :qudt/prefixMultiplier 100.0,
   :qudt/symbol "h",
   :qudt/ucumCode "h",
   :rdf/type [:qudt/DecimalPrefix :qudt/Prefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hecto"}})

(def Kibi
  "A binary prefix for expressing a value with a scaling of \\(1024\\), or \\(2^{10}\\)."
  {:db/ident :prefix/Kibi,
   :dcterms/description
   "A binary prefix for expressing a value with a scaling of \\(1024\\), or \\(2^{10}\\).",
   :qudt/prefixMultiplier 1024.0,
   :qudt/symbol "Ki",
   :rdf/type [:qudt/Prefix :qudt/BinaryPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Kibi"}})

(def Kilo
  "\"kilo\" is a decimal prefix for expressing a value with a scaling of \\(10^{3}\"\\)."
  {:db/ident :prefix/Kilo,
   :dcterms/description
   "\"kilo\" is a decimal prefix for expressing a value with a scaling of \\(10^{3}\"\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Kilo",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Kilo?oldid=461428121",
   :qudt/prefixMultiplier 1000.0,
   :qudt/symbol "k",
   :qudt/ucumCode "k",
   :rdf/type [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Kilo"}})

(def Mebi
  "A binary prefix for expressing a value with a scaling of \\(1024^{2}\\), or \\(2^{20}\\)."
  {:db/ident :prefix/Mebi,
   :dcterms/description
   "A binary prefix for expressing a value with a scaling of \\(1024^{2}\\), or \\(2^{20}\\).",
   :qudt/prefixMultiplier 1048576.0,
   :qudt/symbol "Mi",
   :rdf/type [:qudt/Prefix :qudt/BinaryPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mebi"}})

(def Mega
  "'mega' is a decimal prefix for expressing a value with a scaling of \\(10^{6}\\)."
  {:db/ident :prefix/Mega,
   :dcterms/description
   "'mega' is a decimal prefix for expressing a value with a scaling of \\(10^{6}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Mega",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Mega?oldid=494040441",
   :qudt/prefixMultiplier 1000000.0,
   :qudt/symbol "M",
   :qudt/ucumCode "M",
   :rdf/type [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mega"}})

(def Micro
  "\"micro\" is a decimal prefix for expressing a value with a scaling of \\(10^{-6}\\)."
  {:db/ident :prefix/Micro,
   :dcterms/description
   "\"micro\" is a decimal prefix for expressing a value with a scaling of \\(10^{-6}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Micro",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Micro?oldid=491618374",
   :qudt/prefixMultiplier 1.0E-6,
   :qudt/symbol "μ",
   :qudt/ucumCode "u",
   :rdf/type [:qudt/DecimalPrefix :qudt/Prefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Micro"}})

(def Milli
  "'milli' is a decimal prefix for expressing a value with a scaling of \\(10^{-3}\\)."
  {:db/ident :prefix/Milli,
   :dcterms/description
   "'milli' is a decimal prefix for expressing a value with a scaling of \\(10^{-3}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Milli-",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Milli-?oldid=467190544",
   :qudt/prefixMultiplier 0.001,
   :qudt/symbol "m",
   :qudt/ucumCode "m",
   :rdf/type [:qudt/DecimalPrefix :qudt/Prefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Milli"}})

(def Nano
  "'nano' is a decimal prefix for expressing a value with a scaling of \\(10^{-9}\\)."
  {:db/ident :prefix/Nano,
   :dcterms/description
   "'nano' is a  decimal prefix for expressing a value with a scaling of \\(10^{-9}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Nano",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Nano?oldid=489001692",
   :qudt/prefixMultiplier 1.0E-9,
   :qudt/symbol "n",
   :qudt/ucumCode "n",
   :rdf/type [:qudt/DecimalPrefix :qudt/Prefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Nano"}})

(def Pebi
  "A binary prefix for expressing a value with a scaling of \\(1024^{5}\\), or \\(2^{50}\\)."
  {:db/ident :prefix/Pebi,
   :dcterms/description
   "A binary prefix for expressing a value with a scaling of \\(1024^{5}\\), or \\(2^{50}\\).",
   :qudt/prefixMultiplier 1.25899906842624E14,
   :qudt/symbol "Pi",
   :rdf/type [:qudt/Prefix :qudt/BinaryPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pebi"}})

(def Peta
  "'peta' is a decimal prefix for expressing a value with a scaling of \\(10^{15}\\)."
  {:db/ident :prefix/Peta,
   :dcterms/description
   "'peta' is a decimal prefix for expressing a value with a scaling of \\(10^{15}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Peta",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Peta?oldid=488263435",
   :qudt/prefixMultiplier 1.0E15,
   :qudt/symbol "P",
   :qudt/ucumCode "P",
   :rdf/type [:qudt/DecimalPrefix :qudt/Prefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Peta"}})

(def Pico
  "'pico' is a decimal prefix for expressing a value with a scaling of \\(10^{-12}\\)."
  {:db/ident :prefix/Pico,
   :dcterms/description
   "'pico' is a decimal prefix for expressing a value with a scaling of \\(10^{-12}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Pico",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Pico?oldid=485697614",
   :qudt/prefixMultiplier 1.0E-12,
   :qudt/symbol "p",
   :qudt/ucumCode "p",
   :rdf/type [:qudt/DecimalPrefix :qudt/Prefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pico"}})

(def Tebi
  "A binary prefix for expressing a value with a scaling of \\(1024^4}\\), or \\(2^{40}\\)."
  {:db/ident :prefix/Tebi,
   :dcterms/description
   "A binary prefix for expressing a value with a scaling of \\(1024^4}\\), or \\(2^{40}\\).",
   :qudt/prefixMultiplier 1.099511627776E12,
   :qudt/symbol "Ti",
   :rdf/type [:qudt/Prefix :qudt/BinaryPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tebi"}})

(def Tera
  "'tera' is a decimal prefix for expressing a value with a scaling of \\(10^{12}\\)."
  {:db/ident :prefix/Tera,
   :dcterms/description
   "'tera' is a decimal prefix for expressing a value with a scaling of \\(10^{12}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Tera",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Tera?oldid=494204788",
   :qudt/prefixMultiplier 1.0E12,
   :qudt/symbol "T",
   :qudt/ucumCode "T",
   :rdf/type [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tera"}})

(def Yobi
  "A binary prefix for expressing a value with a scaling of \\(1024^{8}\\), or \\(2^{80}\\)."
  {:db/ident :prefix/Yobi,
   :dcterms/description
   "A binary prefix for expressing a value with a scaling of \\(1024^{8}\\), or \\(2^{80}\\).",
   :qudt/prefixMultiplier 1.2089258196146292E24,
   :qudt/symbol "Yi",
   :rdf/type [:qudt/Prefix :qudt/BinaryPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Yobi"}})

(def Yocto
  "'yocto' is a decimal prefix for expressing a value with a scaling of \\(10^{-24}\\)."
  {:db/ident :prefix/Yocto,
   :dcterms/description
   "'yocto' is a decimal prefix for expressing a value with a scaling of \\(10^{-24}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Yocto-",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Yocto-?oldid=488155799",
   :qudt/prefixMultiplier 1.0E-24,
   :qudt/symbol "y",
   :qudt/ucumCode "y",
   :rdf/type [:qudt/DecimalPrefix :qudt/Prefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Yocto"}})

(def Yotta
  "'yotta' is a decimal prefix for expressing a value with a scaling of \\(10^{24}\\)."
  {:db/ident :prefix/Yotta,
   :dcterms/description
   "'yotta' is a decimal prefix for expressing a value with a scaling of \\(10^{24}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Yotta-",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Yotta-?oldid=494538119",
   :qudt/prefixMultiplier 1.0E24,
   :qudt/symbol "Y",
   :qudt/ucumCode "Y",
   :rdf/type [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Yotta"}})

(def Zebi
  "A binary prefix for expressing a value with a scaling of \\(1024^{7}\\), or \\(2^{70}\\)."
  {:db/ident :prefix/Zebi,
   :dcterms/description
   "A binary prefix for expressing a value with a scaling of \\(1024^{7}\\), or \\(2^{70}\\).",
   :qudt/prefixMultiplier 1.1805916207174113E21,
   :qudt/symbol "Zi",
   :rdf/type [:qudt/Prefix :qudt/BinaryPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zebi"}})

(def Zepto
  "'zepto' is a decimal prefix for expressing a value with a scaling of \\(10^{-21}\\)."
  {:db/ident :prefix/Zepto,
   :dcterms/description
   "'zepto' is a decimal prefix for expressing a value with a scaling of \\(10^{-21}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Zepto-",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Zepto-?oldid=476974663",
   :qudt/prefixMultiplier 1.0E-21,
   :qudt/symbol "z",
   :qudt/ucumCode "z",
   :rdf/type [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zepto"}})

(def Zetta
  "'zetta' is a decimal prefix for expressing a value with a scaling of \\(10^{21}\\)."
  {:db/ident :prefix/Zetta,
   :dcterms/description
   "'zetta' is a decimal prefix for expressing a value with a scaling of \\(10^{21}\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Zetta-",
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Zetta-?oldid=495223080",
   :qudt/prefixMultiplier 1.0E21,
   :qudt/symbol "Z",
   :qudt/ucumCode "Z",
   :rdf/type [:qudt/Prefix :qudt/DecimalPrefix],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/prefix",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zetta"}})