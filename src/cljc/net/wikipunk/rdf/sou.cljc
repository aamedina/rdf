(ns net.wikipunk.rdf.sou
  {:namespaces            {"dc11" "http://purl.org/dc/elements/1.1/",
                           "dcterms" "http://purl.org/dc/terms/",
                           "owl" "http://www.w3.org/2002/07/owl#",
                           "prefix" "http://qudt.org/vocab/prefix/",
                           "prov" "http://www.w3.org/ns/prov#",
                           "quantitykind" "http://qudt.org/vocab/quantitykind/",
                           "qudt" "http://qudt.org/schema/qudt/",
                           "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                           "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                           "skos" "http://www.w3.org/2004/02/skos/core#",
                           "sou" "http://qudt.org/vocab/sou/",
                           "unit" "http://qudt.org/vocab/unit/",
                           "vaem" "http://www.linkedmodel.org/schema/vaem#",
                           "voag" "http://voag.linkedmodel.org/schema/voag#",
                           "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports           #{{:xsd/anyURI "http://qudt.org/vocab/prefix"}
                            {:xsd/anyURI "http://qudt.org/schema/facade/qudt"}},
   :owl/versionInfo       "Created with TopBraid Composer",
   :rdf/type              :owl/Ontology,
   :rdfa/prefix           "sou",
   :rdfa/uri              "http://qudt.org/vocab/sou/",
   :rdfs/label            "QUDT VOCAB Systems of Units Release 2.1.35",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-SOU,
   :xsd/anyURI            "http://qudt.org/vocab/sou"})

(def ASU
  {:db/ident         :sou/ASU,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The astronomical system of units, formally called the IAU (1976) System of Astronomical Constants, is a system of measurement developed for use in astronomy. It was adopted by the International Astronomical Union (IAU) in 1976, and has been slightly updated since then. The system was developed because of the difficulties in measuring and expressing astronomical data in International System of Units (SI units). In particular, there is a huge quantity of very precise data relating to the positions of objects within the solar system which cannot conveniently be expressed or processed in SI units. Through a number of modifications, the astronomical system of units now explicitly recognizes the consequences of general relativity, which is a necessary addition to the International System of Units in order to accurately treat astronomical data. The astronomical system of units is a tridimensional system, in that it defines units of length, mass and time. The associated astronomical constants also fix the different frames of reference that are needed to report observations. The system is a conventional system, in that neither the unit of length nor the unit of mass are true physical constants, and there are at least three different measures of time."},
   :qudt/informativeReference {:xsd/anyURI
                               "http://www.iau.org/public/themes/measuring/"},
   :rdf/type         :qudt/SystemOfUnits,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/sou"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Astronomic System Of Units"}})

(def CGS
  {:db/ident :sou/CGS,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<p>The centimetre-gram-second system (abbreviated CGS or cgs) is a variant of the metric system of physical units based on centimetre as the unit of length, gram as a unit of mass, and second as a unit of time. All CGS mechanical units are unambiguously derived from these three base units, but there are several different ways of extending the CGS system to cover electromagnetism. The CGS system has been largely supplanted by the MKS system, based on metre, kilogram, and second. Note that the term cgs is ambiguous, since there are several variants with conflicting definitions of electromagnetic quantities and units. The unqualified term is generally associated with the Gaussian system of units, so this more precise URI is preferred.</p>"},
   :qudt/abbreviation "CGS",
   :qudt/dbpediaMatch
   {:xsd/anyURI
    "http://dbpedia.org/resource/Centimetre_gram_second_system_of_units"},
   :qudt/hasBaseUnit #{:unit/UNITLESS :unit/SEC :unit/CentiM :unit/GM},
   :qudt/informativeReference
   #{{:xsd/anyURI
      "http://www.tf.uni-kiel.de/matwis/amat/mw1_ge/kap_2/basics/b2_1_14.html"}
     {:xsd/anyURI "http://scienceworld.wolfram.com/physics/cgs.html"}
     {:xsd/anyURI
      "http://en.wikipedia.org/wiki/Centimetre–gram–second_system_of_units"}},
   :rdf/type :qudt/SystemOfUnits,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/sou"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CGS System of Units"},
   :rdfs/seeAlso #{:sou/CGS-EMU :sou/CGS-GAUSS :sou/CGS-ESU}})

(def CGS-EMU
  {:db/ident :sou/CGS-EMU,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The units in this system are formed in a manner similar to that of the cgs electrostatic system of units: the unit of electric current was defined using the law that describes the force between current-carrying wires. To do this, the permeability of free space (the magnetic constant, relating the magnetic flux density in a vacuum to the strength of the external magnetic field), was set at 1. To distinguish cgs electromagnetic units from units in the international system, they were often given the prefix “ab-”. However, most are often referred to purely descriptively as the 'e.m. unit of capacitance', etc. "},
   :qudt/abbreviation "CGS-EMU",
   :qudt/hasBaseUnit #{:unit/UNITLESS :unit/SEC :unit/CentiM :unit/GM
                       :unit/BIOT},
   :qudt/informativeReference {:xsd/anyURI
                               "http://www.sizes.com/units/sys_cgs_em.htm"},
   :rdf/type :qudt/SystemOfUnits,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/sou"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CGS System of Units - EMU"}})

(def CGS-ESU
  {:db/ident :sou/CGS-ESU,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The electrostatic system of units is a system of units used to measure electrical quantities of electric charge, current, and voltage, within the centimeter gram second (or \"CGS\") metric system of units. In electrostatic units, electrical charge is defined via the force it exerts on other charges. The various units of the e.s.u. system have specific names obtained by prefixing more familiar names with $stat$, but are often referred to purely descriptively as the 'e.s. unit of capacitance', etc. "},
   :qudt/abbreviation "CGS-ESU",
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Electrostatic_units"},
   :qudt/informativeReference
   #{{:xsd/anyURI
      "http://www.oxfordreference.com/view/10.1093/acref/9780198605225.001.0001/acref-9780198605225-e-399#"}
     {:xsd/anyURI "http://www.sizes.com/units/sys_cgs_stat.htm"}},
   :rdf/type :qudt/SystemOfUnits,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/sou"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CGS System of Units ESU"}})

(def CGS-GAUSS
  {:db/ident :sou/CGS-GAUSS,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "Gaussian units constitute a metric system of physical units. This system is the most common of the several electromagnetic unit systems based on cgs (centimetre–gram–second) units. It is also called the Gaussian unit system, Gaussian-cgs units, or often just cgs units. The term \"cgs units\" is ambiguous and therefore to be avoided if possible: there are several variants of cgs with conflicting definitions of electromagnetic quantities and units. [Wikipedia]"},
   :qudt/abbreviation "CGS-GAUSS",
   :qudt/hasBaseUnit #{:unit/UNITLESS :unit/SEC :unit/CentiM :unit/GM},
   :qudt/informativeReference {:xsd/anyURI
                               "https://en.wikipedia.org/wiki/Gaussian_units"},
   :rdf/type :qudt/SystemOfUnits,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/sou"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CGS System of Units - Gaussian"},
   :rdfs/seeAlso :sou/CGS})

(def IMPERIAL
  {:db/ident :sou/IMPERIAL,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "A system of units formerly widely used in the UK and the rest of the English-speaking world. It includes the pound (lb), quarter (qt), hundredweight (cwt), and ton (ton); the foot (ft), yard (yd), and mile (mi); and the gallon (gal), British thermal unit (btu), etc. These units have been largely replaced by metric units, although Imperial units persist in some contexts. In January 2000 an EU regulation outlawing the sale of goods in Imperial measures was adopted into British law; an exception was made for the sale of beer and milk in pints. "},
   :qudt/abbreviation "Imperial",
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Imperial_units"},
   :qudt/informativeReference
   {:xsd/anyURI
    "http://www.oxfordreference.com/view/10.1093/acref/9780199234899.001.0001/acref-9780199234899-e-3147"},
   :rdf/type :qudt/SystemOfUnits,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/sou"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Imperial System of Units"}})

(def PLANCK
  {:db/ident :sou/PLANCK,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "In physics, Planck units are physical units of measurement defined exclusively in terms of five universal physical constants listed below, in such a manner that these five physical constants take on the numerical value of 1 when expressed in terms of these units. Planck units elegantly simplify particular algebraic expressions appearing in physical law.  \nOriginally proposed in 1899 by German physicist Max Planck, these units are also known as natural units because the origin of their definition comes only from properties of nature and not from any human construct. Planck units are unique among systems of natural units, because they are not defined in terms of properties of any prototype, physical object, or even elementary particle.\nUnlike the meter and second, which exist as fundamental units in the SI system for (human) historical reasons, the Planck length and Planck time are conceptually linked at a fundamental physical level. Natural units help physicists to reframe questions."},
   :qudt/abbreviation "PLANCK",
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Planck_units"},
   :qudt/hasBaseUnit #{:unit/PlanckMass :unit/PlanckCharge :unit/PlanckLength
                       :unit/PlanckTime :unit/PlanckTemperature},
   :qudt/informativeReference
   {:xsd/anyURI "http://en.wikipedia.org/wiki/Planck_units?oldid=495407713"},
   :rdf/type :qudt/SystemOfUnits,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/sou"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Planck System of Units"}})

(def SI
  {:db/ident :sou/SI,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The International System of Units (abbreviated \\(SI\\) from French: Système international d'unités) is the modern form of the metric system and is generally a system of units of measurement devised around seven base units and the convenience of the number ten. The older metric system included several groups of units. The SI was established in 1960, based on the metre-kilogram-second system, rather than the centimetre-gram-second system, which, in turn, had a few variants."},
   :qudt/abbreviation "SI",
   :qudt/dbpediaMatch
   {:xsd/anyURI "http://dbpedia.org/resource/International_System_of_Units"},
   :qudt/hasBaseUnit #{:unit/UNITLESS :unit/M :unit/SEC :unit/A :unit/MOL
                       :unit/KiloGM :unit/K :unit/CD},
   :qudt/informativeReference
   #{{:xsd/anyURI "http://aurora.regenstrief.org/~ucum/ucum.html"}
     {:xsd/anyURI
      "http://www.oxfordreference.com/view/10.1093/acref/9780198605225.001.0001/acref-9780198605225-e-1292"}
     {:xsd/anyURI
      "http://www.oxfordreference.com/view/10.1093/acref/9780199233991.001.0001/acref-9780199233991-e-2791"}
     {:xsd/anyURI "http://www.nist.gov/pml/pubs/sp811/index.cfm"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/GOVPUB-C13-f10c2ff9e7af2091314396a2d53213e4/pdf/GOVPUB-C13-f10c2ff9e7af2091314396a2d53213e4.pdf"}
     {:xsd/anyURI "http://physics.nist.gov/Pubs/SP811"}
     {:xsd/anyURI
      "http://www.oxfordreference.com/view/10.1093/acref/9780199233991.001.0001/acref-9780199233991-appendix-0003"}
     {:xsd/anyURI "http://physics.info/system-international/"}},
   :qudt/prefix
   #{:prefix/Atto :prefix/Quecto :prefix/Quetta :prefix/Zetta :prefix/Deci
     :prefix/Centi :prefix/Deka :prefix/Hecto :prefix/Yocto :prefix/Exa
     :prefix/Yotta :prefix/Ronto :prefix/Mega :prefix/Tera :prefix/Pico
     :prefix/Zepto :prefix/Kilo :prefix/Micro :prefix/Giga :prefix/Milli
     :prefix/Nano :prefix/Ronna :prefix/Peta :prefix/Femto :prefix/Deca},
   :rdf/type :qudt/SystemOfUnits,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/sou"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "International System of Units"}})

(def SOU_ASU
  {:db/ident        :sou/SOU_ASU,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfUnits,
   :rdfs/label      "Astronomical System of Units (deprecated URI)",
   :rdfs/seeAlso    :sou/ASU})

(def SOU_CGS
  {:db/ident        :sou/SOU_CGS,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfUnits,
   :rdfs/label      "CGS System of Units (deprecated URI)",
   :rdfs/seeAlso    :sou/CGS})

(def SOU_CGS-EMU
  {:db/ident        :sou/SOU_CGS-EMU,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfUnits,
   :rdfs/label      "CGS-EMU System of Units (deprecated URI)",
   :rdfs/seeAlso    :sou/CGS-EMU})

(def SOU_CGS-ESU
  {:db/ident        :sou/SOU_CGS-ESU,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfUnits,
   :rdfs/label      "CGS-ESU System of Units (deprecated URI)",
   :rdfs/seeAlso    :sou/CGS-ESU})

(def SOU_CGS-GAUSS
  {:db/ident        :sou/SOU_CGS-GAUSS,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfUnits,
   :rdfs/label      "CGS-Gauss System of Units (deprecated URI)",
   :rdfs/seeAlso    :sou/CGS-GAUSS})

(def SOU_IMPERIAL
  {:db/ident        :sou/SOU_IMPERIAL,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfUnits,
   :rdfs/label      "Imperial System of Units (deprecated URI)",
   :rdfs/seeAlso    :sou/IMPERIAL})

(def SOU_PLANCK
  {:db/ident        :sou/SOU_PLANCK,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfUnits,
   :rdfs/label      "Planck System of Units (deprecated URI)",
   :rdfs/seeAlso    :sou/PLANCK})

(def SOU_SI
  {:db/ident        :sou/SOU_SI,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfUnits,
   :rdfs/label      "SI System of Units (deprecated URI)",
   :rdfs/seeAlso    :sou/SI})

(def SOU_USCS
  {:db/ident        :sou/SOU_USCS,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfUnits,
   :rdfs/label      "US Customary System of Units (deprecated URI)",
   :rdfs/seeAlso    :sou/USCS})

(def UNSTATED
  {:db/ident         :sou/UNSTATED,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "This placeholder system of units is for all units that do not fit will into any other system of units as modeled here."},
   :rdf/type         :qudt/SystemOfUnits,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/sou"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Unstated System Of Units"}})

(def USCS
  {:db/ident :sou/USCS,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "United States customary units are a system of measurements commonly used in the United States. Many U.S. units are virtually identical to their imperial counterparts, but the U.S. customary system developed from English units used in the British Empire before the system of imperial units was standardized in 1824. Several numerical differences from the imperial system are present. The vast majority of U.S. customary units have been defined in terms of the meter and the kilogram since the Mendenhall Order of 1893 (and, in practice, for many years before that date). These definitions were refined in 1959. The United States is the only industrialized nation that does not mainly use the metric system in its commercial and standards activities, although the International System of Units (SI, often referred to as \"metric\") is commonly used in the U.S. Armed Forces, in fields relating to science, and increasingly in medicine, aviation, and government as well as various sectors of industry. [Wikipedia]"},
   :qudt/abbreviation "US Customary",
   :qudt/dbpediaMatch
   {:xsd/anyURI "http://dbpedia.org/resource/United_States_customary_units"},
   :rdf/type :qudt/SystemOfUnits,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/sou"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "US Customary Unit System"},
   :vaem/url {:xsd/anyURI "http://en.wikipedia.org/wiki/US_customary_units"}})

(def urn:uuid:5b834717-9dca-5fd7-b800-cda0eb9355a6
  {:owl/imports           #{{:xsd/anyURI "http://qudt.org/vocab/prefix"}
                            {:xsd/anyURI "http://qudt.org/schema/facade/qudt"}},
   :owl/versionInfo       "Created with TopBraid Composer",
   :rdf/type              :owl/Ontology,
   :rdfs/label            "QUDT VOCAB Systems of Units Release 2.1.35",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-SOU,
   :xsd/anyURI            "http://qudt.org/vocab/sou"})