(ns net.wikipunk.rdf.constant
  {:namespaces            {"constant" "http://qudt.org/vocab/constant/",
                           "dc11" "http://purl.org/dc/elements/1.1/",
                           "dcterms" "http://purl.org/dc/terms/",
                           "nist" "http://physics.nist.gov/cuu/",
                           "oecc" "http://www.oegov.org/models/common/cc#",
                           "org" "http://www.w3.org/ns/org#",
                           "owl" "http://www.w3.org/2002/07/owl#",
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
   :owl/imports           #{{:xsd/anyURI "http://qudt.org/schema/facade/qudt"}
                            {:xsd/anyURI "http://qudt.org/vocab/unit"}},
   :rdf/type              :owl/Ontology,
   :rdfa/prefix           "constant",
   :rdfa/uri              "http://qudt.org/vocab/constant/",
   :rdfs/label            "QUDT VOCAB Physical Constants Release 2.1.35",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-CONSTANTS,
   :xsd/anyURI            "http://qudt.org/vocab/constant"})

(def AlphaParticleElectronMassRatio
  {:db/ident           :constant/AlphaParticleElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AlphaParticleElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Alpha particle-electron mass ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Alpha_particle"}})

(def AlphaParticleMass
  {:db/ident           :constant/AlphaParticleMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AlphaParticleMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Alpha particle mass"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Alpha_particle"}})

(def AlphaParticleMassEnergyEquivalent
  {:db/ident           :constant/AlphaParticleMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AlphaParticleMassEnergyEquivalent,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alpha particle mass energy equivalent"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Alpha_particle"}})

(def AlphaParticleMassEnergyEquivalentInMeV
  {:db/ident           :constant/AlphaParticleMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AlphaParticleMassEnergyEquivalentInMeV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "Alpha particle mass energy equivalent in Me V"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Alpha_particle"}})

(def AlphaParticleMassInAtomicMassUnit
  {:db/ident           :constant/AlphaParticleMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AlphaParticleMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "alpha particle mass in atomic mass unit"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Alpha_particle"}})

(def AlphaParticleMolarMass
  {:db/ident           :constant/AlphaParticleMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AlphaParticleMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alpha particle molar mass"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Alpha_particle"}})

(def AlphaParticleProtonMassRatio
  {:db/ident           :constant/AlphaParticleProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AlphaParticleProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alpha particle-proton mass ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Alpha_particle"}})

(def AngstromStar
  {:db/ident           :constant/AngstromStar,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AngstromStar,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Angstrom star"}})

(def AtomicMassConstant
  {:db/ident :constant/AtomicMassConstant,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The \"Atomic Mass Constant\" is one twelfth of the mass of an unbound atom of carbon-12 at rest and in its ground state."},
   :qudt/applicableUnit :unit/KiloGM,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Atomic_mass_constant"},
   :qudt/hasDimensionVector :qkdv/A0E0L0I0M1H0T0D0,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Atomic_mass_constant"}},
   :qudt/latexSymbol "\\(m_u\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/quantityValue :constant/Value_AtomicMassConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "atomic mass constant"}})

(def AtomicMassConstantEnergyEquivalent
  {:db/ident           :constant/AtomicMassConstantEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicMassConstantEnergyEquivalent,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass constant energy equivalent"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_constant"}})

(def AtomicMassConstantEnergyEquivalentInMeV
  {:db/ident           :constant/AtomicMassConstantEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicMassConstantEnergyEquivalentInMeV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "atomic mass constant energy equivalent in MeV"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_constant"}})

(def AtomicMassUnitElectronVoltRelationship
  {:db/ident           :constant/AtomicMassUnitElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicMassUnitElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "atomic mass unit-electron volt relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def AtomicMassUnitHartreeRelationship
  {:db/ident           :constant/AtomicMassUnitHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicMassUnitHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass unit-hartree relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def AtomicMassUnitHertzRelationship
  {:db/ident           :constant/AtomicMassUnitHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicMassUnitHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass unit-hertz relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def AtomicMassUnitInverseMeterRelationship
  {:db/ident           :constant/AtomicMassUnitInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicMassUnitInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "atomic mass unit-inverse meter relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def AtomicMassUnitJouleRelationship
  {:db/ident           :constant/AtomicMassUnitJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicMassUnitJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass unit-joule relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def AtomicMassUnitKelvinRelationship
  {:db/ident           :constant/AtomicMassUnitKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicMassUnitKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass unit-kelvin relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def AtomicMassUnitKilogramRelationship
  {:db/ident           :constant/AtomicMassUnitKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicMassUnitKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass unit-kilogram relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def AtomicUnitOf1stHyperpolarizablity
  {:db/ident           :constant/AtomicUnitOf1stHyperpolarizablity,
   :qudt/hasQuantityKind :quantitykind/CubicElectricDipoleMomentPerSquareEnergy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOf1stHyperpolarizability,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of 1st hyperpolarizablity"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOf2ndHyperpolarizablity
  {:db/ident           :constant/AtomicUnitOf2ndHyperpolarizablity,
   :qudt/hasQuantityKind
   :quantitykind/QuarticElectricDipoleMomentPerCubicEnergy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOf2ndHyperpolarizability,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of 2nd hyperpolarizablity"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfAction
  {:db/ident           :constant/AtomicUnitOfAction,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfAction,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of action"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfCharge
  {:db/ident             :constant/AtomicUnitOfCharge,
   :qudt/exactMatch      :constant/ElementaryCharge,
   :qudt/hasQuantityKind :quantitykind/ElectricCharge,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue   :constant/Value_AtomicUnitOfCharge,
   :rdf/type             :qudt/PhysicalConstant,
   :rdfs/isDefinedBy     {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "atomic unit of charge"},
   :skos/closeMatch      {:xsd/anyURI
                          "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfChargeDensity
  {:db/ident           :constant/AtomicUnitOfChargeDensity,
   :qudt/hasQuantityKind :quantitykind/ElectricChargeVolumeDensity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfChargeDensity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of charge density"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfCurrent
  {:db/ident           :constant/AtomicUnitOfCurrent,
   :qudt/hasQuantityKind :quantitykind/ElectricCurrent,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfCurrent,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of current"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfElectricDipoleMoment
  {:db/ident           :constant/AtomicUnitOfElectricDipoleMoment,
   :qudt/hasQuantityKind :quantitykind/ElectricDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricDipoleMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of electric dipole mom."},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfElectricField
  {:db/ident           :constant/AtomicUnitOfElectricField,
   :qudt/hasQuantityKind :quantitykind/ElectricFieldStrength,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricField,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of electric field"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfElectricFieldGradient
  {:db/ident           :constant/AtomicUnitOfElectricFieldGradient,
   :qudt/hasQuantityKind :quantitykind/EnergyPerAreaElectricCharge,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricFieldGradient,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of electric field gradient"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfElectricPolarizablity
  {:db/ident           :constant/AtomicUnitOfElectricPolarizablity,
   :qudt/hasQuantityKind :quantitykind/Polarizability,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricPolarizability,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of electric polarizablity"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfElectricPotential
  {:db/ident           :constant/AtomicUnitOfElectricPotential,
   :qudt/hasQuantityKind :quantitykind/EnergyPerElectricCharge,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricPotential,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of electric potential"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfElectricQuadrupoleMoment
  {:db/ident           :constant/AtomicUnitOfElectricQuadrupoleMoment,
   :qudt/hasQuantityKind :quantitykind/ElectricQuadrupoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricQuadrupoleMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "atomic unit of electric quadrupole moment"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfEnergy
  {:db/ident           :constant/AtomicUnitOfEnergy,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfEnergy,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of energy"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfForce
  {:db/ident           :constant/AtomicUnitOfForce,
   :qudt/hasQuantityKind :quantitykind/Force,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfForce,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of force"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfLength
  {:db/ident           :constant/AtomicUnitOfLength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfLength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of length"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfMagneticDipoleMoment
  {:db/ident           :constant/AtomicUnitOfMagneticDipoleMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfMagneticDipoleMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of magnetic dipole moment"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfMagneticFluxDensity
  {:db/ident           :constant/AtomicUnitOfMagneticFluxDensity,
   :qudt/hasQuantityKind :quantitykind/MagneticFluxDensity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfMagneticFluxDensity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of magnetic flux density"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfMagnetizability
  {:db/ident           :constant/AtomicUnitOfMagnetizability,
   :qudt/hasQuantityKind :quantitykind/EnergyPerSquareMagneticFluxDensity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfMagnetizability,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of magnetizability"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfMass
  {:db/ident           :constant/AtomicUnitOfMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of mass"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfMomentum
  {:db/ident           :constant/AtomicUnitOfMomentum,
   :qudt/hasQuantityKind :quantitykind/LinearMomentum,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfMomentum,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of momentum"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfPermittivity
  {:db/ident           :constant/AtomicUnitOfPermittivity,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Permittivity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfPermittivity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of permittivity"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfTime
  {:db/ident           :constant/AtomicUnitOfTime,
   :qudt/hasQuantityKind :quantitykind/Time,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfTime,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of time"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AtomicUnitOfVelocity
  {:db/ident           :constant/AtomicUnitOfVelocity,
   :qudt/hasQuantityKind :quantitykind/LinearVelocity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_AtomicUnitOfVelocity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of velocity"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_units"}})

(def AvogadroConstant
  {:db/ident :constant/AvogadroConstant,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "In chemistry and physics, the \"Avogadro Constant\" is defined as the ratio of the number of constituent particles N in a sample to the amount of substance n through the relationship NA = N/n. Thus, it is the proportionality factor that relates the molar mass of an entity, i.e. , the mass per amount of substance, to the mass of said entity."},
   :qudt/abbreviation "mole^{-1}",
   :qudt/applicableUnit :unit/PER-MOL,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Avogadro_constant"},
   :qudt/hasDimensionVector :qkdv/A-1E0L0I0M0H0T0D0,
   :qudt/hasQuantityKind :quantitykind/InverseAmountOfSubstance,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Avogadro_constant"}},
   :qudt/latexDefinition
   "\\(L = \\frac{N}{n}\\), where \\(N\\) is the number of particles and \\(n\\) is amount of substance.",
   :qudt/latexSymbol "\\(L, N_A\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31894"},
   :qudt/quantityValue :constant/Value_AvogadroConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Avogadro constant"}})

(def BohrMagneton
  {:db/ident :constant/BohrMagneton,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The \"Bohr Magneton\" is a physical constant and the natural unit for expressing an electron magnetic dipole moment."},
   :qudt/applicableUnit :unit/J-PER-T,
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Bohr_magneton"},
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://en.wikipedia.org/wiki/Bohr_magneton"}
     {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/latexDefinition
   "\\(\\mu_B = \\frac{e\\hbar}{2m_e}\\), where \\(e\\) is the elementary charge, \\(\\hbar\\) is the Planck constant, and \\(m_e\\) is the rest mass of electron.",
   :qudt/latexSymbol "\\(\\mu_B\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/quantityValue :constant/Value_BohrMagneton,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bohr Magneton"}})

(def BohrMagnetonInEVPerT
  {:db/ident           :constant/BohrMagnetonInEVPerT,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_BohrMagnetonInEVPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Bohr magneton in eV per T"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Bohr_magneton"}})

(def BohrMagnetonInHzPerT
  {:db/ident           :constant/BohrMagnetonInHzPerT,
   :qudt/hasQuantityKind :quantitykind/ElectricChargePerMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_BohrMagnetonInHzPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Bohr magneton in Hz perT"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Bohr_magneton"}})

(def BohrMagnetonInInverseMetersPerTesla
  {:db/ident           :constant/BohrMagnetonInInverseMetersPerTesla,
   :qudt/hasQuantityKind :quantitykind/MagneticReluctivity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_BohrMagnetonInInverseMetersPerTesla,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "Bohr magneton in inverse meters per tesla"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Bohr_magneton"}})

(def BohrMagnetonInKPerT
  {:db/ident           :constant/BohrMagnetonInKPerT,
   :qudt/hasQuantityKind :quantitykind/TemperaturePerMagneticFluxDensity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_BohrMagnetonInKPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Bohr magneton in K per T"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Bohr_magneton"}})

(def BohrRadius
  {:db/ident :constant/BohrRadius,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The Bohr radius is a physical constant, approximately equal to the most probable distance between the proton and electron in a hydrogen atom in its ground state. It is named after Niels Bohr, due to its role in the Bohr model of an atom. The precise definition of the Bohr radius is: where: is the permittivity of free space is the reduced Planck's constant is the electron rest mass is the elementary charge is the speed of light in vacuum is the fine structure constant. [Wikipedia]"},
   :qudt/applicableSystem :sou/SI,
   :qudt/applicableUnit :unit/M,
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Bohr_radius"},
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI
      "http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31895"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Bohr_radius"}},
   :qudt/latexDefinition
   "\\(a_0 = \\frac{4\\pi \\varepsilon_0 \\hbar^2}{m_ee^2}\\), where \\(\\varepsilon_0\\) is the electric constant, \\(\\hbar\\) is the reduced Planck constant, \\(m_e\\)  is the rest mass of electron, and \\(e\\) is the elementary charge.",
   :qudt/latexSymbol "\\(a_0\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/quantityValue :constant/Value_BohrRadius,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bohr Radius"}})

(def BoltzmannConstant
  {:db/ident :constant/BoltzmannConstant,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The <i>Boltzmann Constant</i> (\\(k\\) or \\(kB\\)) is the physical constant relating energy at the individual particle level with temperature, which must necessarily be observed at the collective or bulk level. It is the gas constant \\(R\\) divided by the Avogadro constant \\(N_A\\): It has the same dimension as entropy. It is named after the Austrian physicist Ludwig Boltzmann."},
   :qudt/applicableUnit :unit/J-PER-K,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Boltzmann_constant"},
   :qudt/hasQuantityKind :quantitykind/HeatCapacity,
   :qudt/informativeReference
   {:xsd/anyURI
    "http://en.wikipedia.org/wiki/Boltzmann_constant?oldid=495542430"},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31894"},
   :qudt/latexSymbol "\\(k\\)",
   :qudt/quantityValue :constant/Value_BoltzmannConstant,
   :qudt/ucumCode {:rdf/type  :qudt/UCUMcs,
                   :rdf/value "[k]"},
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Boltzmann Constant"}})

(def BoltzmannConstantInEVPerK
  {:db/ident           :constant/BoltzmannConstantInEVPerK,
   :qudt/hasQuantityKind :quantitykind/HeatCapacity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_BoltzmannConstantInEVPerK,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Boltzmann constant in eV per K"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Boltzmann_constant"}})

(def BoltzmannConstantInHzPerK
  {:db/ident           :constant/BoltzmannConstantInHzPerK,
   :qudt/hasQuantityKind :quantitykind/InverseTimeTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_BoltzmannConstantInHzPerK,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Boltzmann constant in Hz per K"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Boltzmann_constant"}})

(def BoltzmannConstantInInverseMetersPerKelvin
  {:db/ident :constant/BoltzmannConstantInInverseMetersPerKelvin,
   :qudt/hasQuantityKind :quantitykind/InverseLengthTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_BoltzmannConstantInInverseMetersPerKelvin,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "Boltzmann constant in inverse meters per kelvin"},
   :skos/closeMatch {:xsd/anyURI
                     "http://dbpedia.org/resource/Boltzmann_constant"}})

(def CharacteristicImpedanceOfVacuum
  {:db/ident :constant/CharacteristicImpedanceOfVacuum,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The impedance of free space, Z0, is a physical constant relating the magnitudes of the electric and magnetic fields of electromagnetic radiation travelling through free space. That is, Z0 = |E|/|H|, where |E| is the electric field strength and |H| magnetic field strength. It has an exact value, given approximately as 376.73031 ohms. The impedance of free space equals the product of the vacuum permeability or magnetic constant μ0 and the speed of light in vacuum c0. Since the numerical values of the magnetic constant and of the speed of light are fixed by the definitions of the ampere and the metre respectively, the exact value of the impedance of free space is likewise fixed by definition and is not subject to experimental error. [Wikipedia]"},
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Impedance_of_free_space"},
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Resistance,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_CharacteristicImpedanceOfVacuum,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "characteristic impedance of vacuum"}})

(def ClassicalElectronRadius
  {:db/ident :constant/ClassicalElectronRadius,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Classical_electron_radius"},
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ClassicalElectronRadius,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "classical electron radius"}})

(def ComptonWavelength
  {:db/ident :constant/ComptonWavelength,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The \"Compton Wavelength\"  is a quantum mechanical property of a particle. It was introduced by Arthur Compton in his explanation of the scattering of photons by electrons (a process known as Compton scattering). The Compton wavelength of a particle is equivalent to the wavelength of a photon whose energy is the same as the rest-mass energy of the particle."},
   :qudt/applicableUnit :unit/M,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Compton_wavelength"},
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Compton_wavelength"}},
   :qudt/latexDefinition
   "\\(\\lambda_C = \\frac{h}{mc_0}\\), where \\(h\\) is the Planck constant, \\(m\\) is the rest mass of a particle, and \\(c_0\\) is the speed of light in vacuum.",
   :qudt/latexSymbol "\\(\\lambda_C\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/quantityValue :constant/Value_ComptonWavelength,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compton Wavelength"}})

(def ComptonWavelengthOver2Pi
  {:db/ident           :constant/ComptonWavelengthOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ComptonWavelengthOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Compton wavelength over 2 pi"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Compton_wavelength"}})

(def ConductanceQuantum
  {:db/ident           :constant/ConductanceQuantum,
   :qudt/dbpediaMatch  {:xsd/anyURI
                        "http://dbpedia.org/resource/Conductance_quantum"},
   :qudt/hasQuantityKind :quantitykind/ElectricConductivity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ConductanceQuantum,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "conductance quantum"}})

(def ConventionalValueOfJosephsonConstant
  {:db/ident           :constant/ConventionalValueOfJosephsonConstant,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/InverseMagneticFlux,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ConventionalValueOfJosephsonConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "conventional value of Josephson constant"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Magnetic_flux_quantum"}})

(def ConventionalValueOfVonKlitzingConstant
  {:db/ident           :constant/ConventionalValueOfVonKlitzingConstant,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Resistance,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ConventionalValueOfVonKlitzingConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "conventional value of von Klitzing constant"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Quantum_Hall_effect"}})

(def CuXUnit
  {:db/ident           :constant/CuXUnit,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_CuXUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Cu x unit"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/X_unit"}})

(def DeuteronElectronMagneticMomentRatio
  {:db/ident :constant/DeuteronElectronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronElectronMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deuteron-electron magnetic moment ratio"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"}})

(def DeuteronElectronMassRatio
  {:db/ident           :constant/DeuteronElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron-electron mass ratio"}})

(def DeuteronGFactor
  {:db/ident           :constant/DeuteronGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron g factor"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def DeuteronMagneticMoment
  {:db/ident           :constant/DeuteronMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron magnetic moment"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Magnetic_moment"}})

(def DeuteronMagneticMomentToBohrMagnetonRatio
  {:db/ident :constant/DeuteronMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_DeuteronMagneticMomentToBohrMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "deuteron magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch {:xsd/anyURI "http://dbpedia.org/resource/Bohr_magneton"}})

(def DeuteronMagneticMomentToNuclearMagnetonRatio
  {:db/ident :constant/DeuteronMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_DeuteronMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "deuteron magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch {:xsd/anyURI
                     "http://dbpedia.org/resource/Nuclear_magneton"}})

(def DeuteronMass
  {:db/ident           :constant/DeuteronMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron mass"}})

(def DeuteronMassEnergyEquivalent
  {:db/ident :constant/DeuteronMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deuteron mass energy equivalent"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def DeuteronMassEnergyEquivalentInMeV
  {:db/ident :constant/DeuteronMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deuteron mass energy equivalent in MeV"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def DeuteronMassInAtomicMassUnit
  {:db/ident           :constant/DeuteronMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron mass in atomic mass unit"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def DeuteronMolarMass
  {:db/ident           :constant/DeuteronMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron molar mass"}})

(def DeuteronNeutronMagneticMomentRatio
  {:db/ident           :constant/DeuteronNeutronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronNeutronMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron-neutron magnetic moment ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Neutron_magnetic_moment"}})

(def DeuteronProtonMagneticMomentRatio
  {:db/ident           :constant/DeuteronProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronProtonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron-proton magnetic moment ratio"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def DeuteronProtonMassRatio
  {:db/ident           :constant/DeuteronProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron-proton mass ratio"}})

(def DeuteronRmsChargeRadius
  {:db/ident           :constant/DeuteronRmsChargeRadius,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_DeuteronRmsChargeRadius,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron rms charge radius"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/Nucleon"}})

(def ElectricConstant
  {:db/ident           :constant/ElectricConstant,
   :qudt/dbpediaMatch  {:xsd/anyURI
                        "http://dbpedia.org/resource/Vacuum_permittivity"},
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Permittivity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectricConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electric constant"}})

(def ElectromagneticPermeabilityOfVacuum
  {:db/ident :constant/ElectromagneticPermeabilityOfVacuum,
   :dcterms/description
   "\\(\\textbf{Permeability of Vacuum}\\), also known as \\(\\textit{Magnetic Constant}\\), is a scalar constant \\(\\mu_0\\) such that, in a vacuum the product wuth the magnetic field vector, \\(\\overrightarrow{H}\\) is equal to the magnetic flux density vector, \\(\\overrightarrow{B}\\).",
   :qudt/applicableUnit :unit/H-PER-M,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Vacuum_permeability"},
   :qudt/exactConstant true,
   :qudt/exactMatch :constant/MagneticConstant,
   :qudt/hasQuantityKind :quantitykind/Permittivity,
   :qudt/informativeReference
   #{{:xsd/anyURI
      "http://www.electropedia.org/iev/iev.nsf/display?openform&ievref=705-03-14"}
     {:xsd/anyURI
      "http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31891"}},
   :qudt/latexDefinition
   "\\(\\mu_0 = \\frac{\\overrightarrow{B}}{\\overrightarrow{H}}\\), where \\(\\overrightarrow{B}\\) is the B-Filed magnetic vector, and \\(\\overrightarrow{H}\\) is the H-Field magnetic vector. The value of \\(\\mu_0\\) is \\(\\approx 1.256637e-6\\,henry\\,per\\,metre\\).",
   :qudt/latexSymbol "\\(\\mu_0\\)",
   :qudt/quantityValue :constant/Value_MagneticConstant,
   :qudt/ucumCode {:rdf/type  :qudt/UCUMcs,
                   :rdf/value "[mu_0]"},
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Permeability of Vacuum"}})

(def ElectronChargeToMassQuotient
  {:db/ident           :constant/ElectronChargeToMassQuotient,
   :qudt/hasQuantityKind :quantitykind/ElectricChargePerMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronChargeToMassQuotient,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron charge to mass quotient"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Mass-to-charge_ratio"}})

(def ElectronDeuteronMagneticMomentRatio
  {:db/ident           :constant/ElectronDeuteronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronDeuteronMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "electron-deuteron magnetic moment ratio"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def ElectronDeuteronMassRatio
  {:db/ident           :constant/ElectronDeuteronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronDeuteronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-deuteron mass ratio"}})

(def ElectronGFactor
  {:db/ident           :constant/ElectronGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron g factor"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def ElectronGyromagneticRatio
  {:db/ident :constant/ElectronGyromagneticRatio,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The \"Electron Gyromagnetic Ratio\" An isolated electron has an angular momentum and a magnetic moment resulting from its spin. While an electron's spin is sometimes visualized as a literal rotation about an axis, it is in fact a fundamentally different, quantum-mechanical phenomenon with no true analogue in classical physics. Consequently, there is no reason to expect the above classical relation to hold."},
   :qudt/applicableUnit :unit/A-M2-PER-J-SEC,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI
      "http://en.wikipedia.org/wiki/Gyromagnetic_ratio#Gyromagnetic_ratio_for_an_isolated_electron"}},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/latexDefinition
   "\\(\\mu = \\gamma_e J\\), where \\(\\mu\\) is the magnetic dipole moment, and \\(J\\) is the total angular momentum.",
   :qudt/latexSymbol "\\(\\gamma_e\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/quantityValue :constant/Value_ElectronGyromagneticRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Electron Gyromagnetic Ratio"},
   :skos/closeMatch {:xsd/anyURI
                     "http://dbpedia.org/resource/Gyromagnetic_ratio"}})

(def ElectronGyromagneticRatioOver2Pi
  {:db/ident           :constant/ElectronGyromagneticRatioOver2Pi,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronGyromagneticRatioOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron gyromagnetic ratio over 2 pi"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Gyromagnetic_ratio"}})

(def ElectronMagneticMoment
  {:db/ident :constant/ElectronMagneticMoment,
   :qudt/dbpediaMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"},
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronMagneticMoment,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "electron magnetic moment"}})

(def ElectronMagneticMomentAnomaly
  {:db/ident :constant/ElectronMagneticMomentAnomaly,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronMagneticMomentAnomaly,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "electron magnetic moment anomaly"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"}})

(def ElectronMagneticMomentToBohrMagnetonRatio
  {:db/ident :constant/ElectronMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_ElectronMagneticMomentToBohrMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "electron magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch
   #{{:xsd/anyURI "http://dbpedia.org/resource/Bohr_magneton"}
     {:xsd/anyURI
      "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"}}})

(def ElectronMagneticMomentToNuclearMagnetonRatio
  {:db/ident :constant/ElectronMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_ElectronMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "electron magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch
   #{{:xsd/anyURI "http://dbpedia.org/resource/Nuclear_magneton"}
     {:xsd/anyURI
      "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"}}})

(def ElectronMass
  {:db/ident             :constant/ElectronMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/latexSymbol     "\\(m_e\\)",
   :qudt/quantityValue   :constant/Value_ElectronMass,
   :qudt/ucumCode        {:rdf/type  :qudt/UCUMcs,
                          :rdf/value "[m_e]"},
   :rdf/type             :qudt/PhysicalConstant,
   :rdfs/isDefinedBy     {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "Electron Mass"},
   :skos/closeMatch      {:xsd/anyURI "http://dbpedia.org/resource/Electron"}})

(def ElectronMassEnergyEquivalent
  {:db/ident :constant/ElectronMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "electron mass energy equivalent"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def ElectronMassEnergyEquivalentInMeV
  {:db/ident :constant/ElectronMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "electron mass energy equivalent in MeV"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def ElectronMassInAtomicMassUnit
  {:db/ident           :constant/ElectronMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron mass in atomic mass unit"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def ElectronMolarMass
  {:db/ident           :constant/ElectronMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron molar mass"}})

(def ElectronMuonMagneticMomentRatio
  {:db/ident           :constant/ElectronMuonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronMuonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-muon magnetic moment ratio"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def ElectronMuonMassRatio
  {:db/ident           :constant/ElectronMuonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronMuonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-muon mass ratio"}})

(def ElectronNeutronMagneticMomentRatio
  {:db/ident           :constant/ElectronNeutronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronNeutronMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-neutron magnetic moment ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Neutron_magnetic_moment"}})

(def ElectronNeutronMassRatio
  {:db/ident           :constant/ElectronNeutronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronNeutronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-neutron mass ratio"}})

(def ElectronProtonMagneticMomentRatio
  {:db/ident           :constant/ElectronProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronProtonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-proton magnetic moment ratio"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def ElectronProtonMassRatio
  {:db/ident           :constant/ElectronProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-proton mass ratio"}})

(def ElectronTauMassRatio
  {:db/ident           :constant/ElectronTauMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronTauMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-tau mass ratio"}})

(def ElectronToAlphaParticleMassRatio
  {:db/ident           :constant/ElectronToAlphaParticleMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronToAlphaParticleMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron to alpha particle mass ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Alpha_particle"}})

(def ElectronToShieldedHelionMagneticMomentRatio
  {:db/ident :constant/ElectronToShieldedHelionMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_ElectronToShieldedHelionMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "electron to shielded helion magnetic moment ratio"},
   :skos/closeMatch {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def ElectronToShieldedProtonMagneticMomentRatio
  {:db/ident :constant/ElectronToShieldedProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_ElectronToShieldedProtonMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "electron to shielded proton magnetic moment ratio"},
   :skos/closeMatch {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def ElectronVoltAtomicMassUnitRelationship
  {:db/ident           :constant/ElectronVoltAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronVoltAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "electron volt-atomic mass unit relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def ElectronVoltHartreeRelationship
  {:db/ident           :constant/ElectronVoltHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronVoltHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron volt-hartree relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def ElectronVoltHertzRelationship
  {:db/ident           :constant/ElectronVoltHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronVoltHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron volt-hertz relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def ElectronVoltInverseMeterRelationship
  {:db/ident           :constant/ElectronVoltInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronVoltInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "electron volt-inverse meter relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def ElectronVoltJouleRelationship
  {:db/ident           :constant/ElectronVoltJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronVoltJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron volt-joule relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def ElectronVoltKelvinRelationship
  {:db/ident           :constant/ElectronVoltKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronVoltKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron volt-kelvin relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def ElectronVoltKilogramRelationship
  {:db/ident           :constant/ElectronVoltKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElectronVoltKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron volt-kilogram relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def ElementaryCharge
  {:db/ident             :constant/ElementaryCharge,
   :qudt/dbpediaMatch    {:xsd/anyURI
                          "http://dbpedia.org/resource/Elementary_charge"},
   :qudt/exactMatch      :constant/AtomicUnitOfCharge,
   :qudt/hasQuantityKind :quantitykind/ElectricCharge,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Elementary_charge"}},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31894"},
   :qudt/plainTextDescription
   "The \"Elementary Charge\" is the electric charge carried by a single proton, or equivalently, the negation (opposite) of the electric charge carried by a single electron.",
   :qudt/quantityValue   :constant/Value_ElementaryCharge,
   :qudt/symbol          "e",
   :qudt/ucumCode        {:rdf/type  :qudt/UCUMcs,
                          :rdf/value "[e]"},
   :rdf/type             :qudt/PhysicalConstant,
   :rdfs/isDefinedBy     {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "Elementary Charge"}})

(def ElementaryChargeOverH
  {:db/ident           :constant/ElementaryChargeOverH,
   :qudt/hasQuantityKind :quantitykind/ElectricCurrentPerUnitEnergy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ElementaryChargeOverH,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "elementary charge over h"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Elementary_charge"}})

(def FaradayConstant
  {:db/ident :constant/FaradayConstant,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The \"Faraday Constant\" is the magnitude of electric charge per mole of electrons."},
   :qudt/abbreviation "c mol^{-1}",
   :qudt/applicableUnit :unit/C-PER-MOL,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Faraday_constant"},
   :qudt/hasQuantityKind :quantitykind/ElectricChargePerAmountOfSubstance,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Faraday_constant"}},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31894"},
   :qudt/latexDefinition
   "\\(F = N_A e\\), where \\(N_A\\) is the Avogadro constant and \\(e\\) is the elementary charge.",
   :qudt/latexSymbol "\\(F\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31894"},
   :qudt/quantityValue :constant/Value_FaradayConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Faraday constant"}})

(def FermiCouplingConstant
  {:db/ident           :constant/FermiCouplingConstant,
   :qudt/hasQuantityKind :quantitykind/InverseSquareEnergy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_FermiCouplingConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Fermi coupling constant"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Coupling_constant"}})

(def FineStructureConstant
  {:db/ident :constant/FineStructureConstant,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The \"Fine-structure Constant\"  is a fundamental physical constant, namely the coupling constant characterizing the strength of the electromagnetic interaction."},
   :qudt/applicableUnit :unit/UNITLESS,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Fine-structure_constant"},
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Fine-structure_constant"}},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/latexDefinition
   "\\(a = \\frac{e^2}{4\\pi\\varepsilon_0\\hbar c_0}\\), where \\(e\\) is the elementary charge, \\(\\varepsilon_0\\) is the electric constant, item \\(\\hbar\\) is the reduced Planck constant, and \\(c_0\\) is the speed of light in vacuum.",
   :qudt/latexSymbol "\\(a\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/quantityValue :constant/Value_FineStructureConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fine-Structure Constant"}})

(def FirstRadiationConstant
  {:db/ident           :constant/FirstRadiationConstant,
   :qudt/hasQuantityKind :quantitykind/PowerArea,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_FirstRadiationConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "first radiation constant"}})

(def FirstRadiationConstantForSpectralRadiance
  {:db/ident :constant/FirstRadiationConstantForSpectralRadiance,
   :qudt/hasQuantityKind :quantitykind/PowerAreaPerSolidAngle,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_FirstRadiationConstantForSpectralRadiance,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "first radiation constant for spectral radiance"}})

(def GravitationalConstant
  {:db/ident :constant/GravitationalConstant,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The gravitational constant (also known as the universal gravitational constant, the Newtonian constant of gravitation, or the Cavendish gravitational constant), denoted by the letter G, is an empirical physical constant involved in the calculation of gravitational effects in Sir Isaac Newton's law of universal gravitation and in Albert Einstein's general theory of relativity. (Wikipedia)"},
   :qudt/applicableUnit :unit/N-M2-PER-KiloGM2,
   :qudt/hasQuantityKind :quantitykind/GravitationalAttraction,
   :qudt/informativeReference
   {:xsd/anyURI "https://en.wikipedia.org/wiki/Gravitational_constant"},
   :qudt/quantityValue :constant/Value_GravitationalConstant,
   :qudt/ucumCode {:rdf/type  :qudt/UCUMcs,
                   :rdf/value "[G]"},
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gravitational constant"}})

(def HartreeAtomicMassUnitRelationship
  {:db/ident           :constant/HartreeAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HartreeAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-atomic mass unit relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def HartreeElectronVoltRelationship
  {:db/ident           :constant/HartreeElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HartreeElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-electron volt relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def HartreeEnergy
  {:db/ident :constant/HartreeEnergy,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "<em>Hartree Energy</em> (symbol: \\(E_h\\) or \\(Ha\\)), also known as the \\(\\textit{Hartree}\\), is the atomic unit of energy. The hartree energy is equal to the absolute value of the electric potential energy of the hydrogen atom in its ground state. The energy of the electron in an H-atom in its ground state is \\(-E_H\\), where \\(E_H= 2 R_\\infty \\cdot hc_0\\). The 2006 CODATA recommended value was \\(E_H = 4.35974394(22) \\times 10^{-18\" J = 27.21138386(68) eV\\)."},
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Hartree"},
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/latexDefinition
   "\\(E_H= \\frac{e^2}{4\\pi \\varepsilon_0 a_0 }\\), where \\(e\\) is the elementary charge, \\(\\varepsilon_0\\) is the electric constant, and \\(a_0\\) is the Bohr radius.",
   :qudt/latexSymbol "\\(E_h\\)",
   :qudt/quantityValue :constant/Value_HartreeEnergy,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hartree Energy"}})

(def HartreeEnergyInEV
  {:db/ident           :constant/HartreeEnergyInEV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HartreeEnergyInEV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Hartree energy in eV"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/Hartree"}})

(def HartreeHertzRelationship
  {:db/ident           :constant/HartreeHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HartreeHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-hertz relationship"}})

(def HartreeInverseMeterRelationship
  {:db/ident           :constant/HartreeInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HartreeInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-inverse meter relationship"}})

(def HartreeJouleRelationship
  {:db/ident           :constant/HartreeJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HartreeJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-joule relationship"}})

(def HartreeKelvinRelationship
  {:db/ident           :constant/HartreeKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HartreeKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-kelvin relationship"}})

(def HartreeKilogramRelationship
  {:db/ident           :constant/HartreeKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HartreeKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-kilogram relationship"}})

(def HelionElectronMassRatio
  {:db/ident           :constant/HelionElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HelionElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "helion-electron mass ratio"}})

(def HelionMass
  {:db/ident           :constant/HelionMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HelionMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "helion mass"}})

(def HelionMassEnergyEquivalent
  {:db/ident :constant/HelionMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HelionMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "helion mass energy equivalent"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def HelionMassEnergyEquivalentInMeV
  {:db/ident :constant/HelionMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HelionMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "helion mass energy equivalent in MeV"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def HelionMassInAtomicMassUnit
  {:db/ident           :constant/HelionMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HelionMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "helion mass in atomic mass unit"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def HelionMolarMass
  {:db/ident           :constant/HelionMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HelionMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "helion molar mass"}})

(def HelionProtonMassRatio
  {:db/ident           :constant/HelionProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HelionProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "helion-proton mass ratio"}})

(def HertzAtomicMassUnitRelationship
  {:db/ident           :constant/HertzAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HertzAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-atomic mass unit relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def HertzElectronVoltRelationship
  {:db/ident           :constant/HertzElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HertzElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-electron volt relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def HertzHartreeRelationship
  {:db/ident           :constant/HertzHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HertzHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-hartree relationship"}})

(def HertzInverseMeterRelationship
  {:db/ident           :constant/HertzInverseMeterRelationship,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HertzInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-inverse meter relationship"}})

(def HertzJouleRelationship
  {:db/ident           :constant/HertzJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HertzJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-joule relationship"}})

(def HertzKelvinRelationship
  {:db/ident           :constant/HertzKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HertzKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-kelvin relationship"}})

(def HertzKilogramRelationship
  {:db/ident           :constant/HertzKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_HertzKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-kilogram relationship"}})

(def InverseFineStructureConstant
  {:db/ident           :constant/InverseFineStructureConstant,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_InverseFineStructureConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse fine-structure constant"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Fine-structure_constant"}})

(def InverseMeterAtomicMassUnitRelationship
  {:db/ident           :constant/InverseMeterAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_InverseMeterAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "inverse meter-atomic mass unit relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def InverseMeterElectronVoltRelationship
  {:db/ident           :constant/InverseMeterElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_InverseMeterElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "inverse meter-electron volt relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def InverseMeterHartreeRelationship
  {:db/ident           :constant/InverseMeterHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_InverseMeterHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse meter-hartree relationship"}})

(def InverseMeterHertzRelationship
  {:db/ident           :constant/InverseMeterHertzRelationship,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_InverseMeterHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse meter-hertz relationship"}})

(def InverseMeterJouleRelationship
  {:db/ident           :constant/InverseMeterJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_InverseMeterJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse meter-joule relationship"}})

(def InverseMeterKelvinRelationship
  {:db/ident           :constant/InverseMeterKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_InverseMeterKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse meter-kelvin relationship"}})

(def InverseMeterKilogramRelationship
  {:db/ident           :constant/InverseMeterKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_InverseMeterKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse meter-kilogram relationship"}})

(def InverseOfConductanceQuantum
  {:db/ident           :constant/InverseOfConductanceQuantum,
   :qudt/hasQuantityKind :quantitykind/Resistance,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_InverseOfConductanceQuantum,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse of conductance quantum"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Conductance_quantum"}})

(def JosephsonConstant
  {:db/ident :constant/JosephsonConstant,
   :qudt/applicableUnit :unit/PER-WB,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Magnetic_flux_quantum"},
   :qudt/hasQuantityKind :quantitykind/InverseMagneticFlux,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://en.wikipedia.org/wiki/Magnetic_flux_quantum"}
     {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31897"},
   :qudt/latexDefinition
   "\\(K_J = \\frac{1}{\\Phi_0}\\), where \\(\\Phi_0\\) is the magnetic flux quantum.",
   :qudt/latexSymbol "\\(K_J\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31897"},
   :qudt/quantityValue :constant/Value_JosephsonConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Josephson Constant"}})

(def JouleAtomicMassUnitRelationship
  {:db/ident           :constant/JouleAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_JouleAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-atomic mass unit relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def JouleElectronVoltRelationship
  {:db/ident           :constant/JouleElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_JouleElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-electron volt relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def JouleHartreeRelationship
  {:db/ident           :constant/JouleHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_JouleHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-hartree relationship"}})

(def JouleHertzRelationship
  {:db/ident           :constant/JouleHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_JouleHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-hertz relationship"}})

(def JouleInverseMeterRelationship
  {:db/ident           :constant/JouleInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_JouleInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-inverse meter relationship"}})

(def JouleKelvinRelationship
  {:db/ident           :constant/JouleKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_JouleKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-kelvin relationship"}})

(def JouleKilogramRelationship
  {:db/ident           :constant/JouleKilogramRelationship,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_JouleKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-kilogram relationship"}})

(def KelvinAtomicMassUnitRelationship
  {:db/ident           :constant/KelvinAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KelvinAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-atomic mass unit relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def KelvinElectronVoltRelationship
  {:db/ident           :constant/KelvinElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KelvinElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-electron volt relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def KelvinHartreeRelationship
  {:db/ident           :constant/KelvinHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KelvinHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-hartree relationship"}})

(def KelvinHertzRelationship
  {:db/ident           :constant/KelvinHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KelvinHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-hertz relationship"}})

(def KelvinInverseMeterRelationship
  {:db/ident           :constant/KelvinInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KelvinInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-inverse meter relationship"}})

(def KelvinJouleRelationship
  {:db/ident           :constant/KelvinJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KelvinJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-joule relationship"}})

(def KelvinKilogramRelationship
  {:db/ident           :constant/KelvinKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KelvinKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-kilogram relationship"}})

(def KilogramAtomicMassUnitRelationship
  {:db/ident           :constant/KilogramAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KilogramAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-atomic mass unit relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def KilogramElectronVoltRelationship
  {:db/ident           :constant/KilogramElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KilogramElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-electron volt relationship"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Electron_volt"}})

(def KilogramHartreeRelationship
  {:db/ident           :constant/KilogramHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KilogramHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-hartree relationship"}})

(def KilogramHertzRelationship
  {:db/ident           :constant/KilogramHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KilogramHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-hertz relationship"}})

(def KilogramInverseMeterRelationship
  {:db/ident           :constant/KilogramInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KilogramInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-inverse meter relationship"}})

(def KilogramJouleRelationship
  {:db/ident           :constant/KilogramJouleRelationship,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KilogramJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Kilogram-Joule Relationship"}})

(def KilogramKelvinRelationship
  {:db/ident           :constant/KilogramKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_KilogramKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-kelvin relationship"}})

(def LatticeParameterOfSilicon
  {:db/ident           :constant/LatticeParameterOfSilicon,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_LatticeParameterOfSilicon,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "lattice parameter of silicon"}})

(def LatticeSpacingOfSilicon
  {:db/ident           :constant/LatticeSpacingOfSilicon,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_LatticeSpacingOfSilicon,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "lattice spacing of silicon"}})

(def LoschmidtConstant273_15K101_325KPa
  {:db/ident           :constant/LoschmidtConstant273.15K101.325KPa,
   :qudt/hasQuantityKind :quantitykind/NumberDensity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_LoschmidtConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "Loschmidt constant 273.15 K 101.325 kPa"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Loschmidt_constant"}})

(def MagneticConstant
  {:db/ident :constant/MagneticConstant,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "\\(\\textbf{Magentic Constant}\\), also known as \\(\\textit{Permeability of Vacuum}\\), is a scalar constant \\(\\mu_0\\) such that, in a vacuum the product with the magnetic field vector, \\(\\overrightarrow{H}\\) is equal to the magnetic flux density vector, \\(\\overrightarrow{B}\\)."},
   :qudt/abbreviation "magnetic-constant",
   :qudt/applicableUnit :unit/H-PER-M,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Vacuum_permeability"},
   :qudt/exactConstant true,
   :qudt/exactMatch :constant/ElectromagneticPermeabilityOfVacuum,
   :qudt/hasQuantityKind :quantitykind/Permittivity,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI
      "http://www.electropedia.org/iev/iev.nsf/display?openform&ievref=705-03-14"}
     {:xsd/anyURI
      "http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31891"}},
   :qudt/latexDefinition
   "\\(\\mu_0 = \\frac{\\overrightarrow{B}}{\\overrightarrow{H}}\\), where \\(\\overrightarrow{B}\\) is the B-Filed magnetic vector, and \\(\\overrightarrow{H}\\) is the H-Filed magnetic vector. The value of \\(\\mu_0\\) is \\(\\approx 1.256637e-6\\,H/M\\).",
   :qudt/latexSymbol "\\(\\mu_0\\)",
   :qudt/quantityValue :constant/Value_MagneticConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Magnetic Constant"}
   :skos/closeMatch :constant/MagneticFluxQuantum})

(def MagneticFluxQuantum
  {:db/ident :constant/MagneticFluxQuantum,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "\"Magnetic Flux Quantum\" is the quantum of magnetic flux passing through a superconductor."},
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Magnetic_flux_quantum"},
   :qudt/hasQuantityKind :quantitykind/MagneticFlux,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://en.wikipedia.org/wiki/Magnetic_flux_quantum"}
     {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31897"},
   :qudt/latexDefinition
   "\\(\\Phi_0 = \\frac{h}{2e}\\), where \\(h\\) is the Planck constant and \\(e\\) is the elementary charge.",
   :qudt/latexSymbol "\\(\\Phi_0\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31897"},
   :qudt/quantityValue :constant/Value_MagneticFluxQuantum,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "magnetic flux quantum"}})

(def MoXUnit
  {:db/ident           :constant/MoXUnit,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MoXUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Mo x unit"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/X_unit"}})

(def MolarGasConstant
  {:db/ident :constant/MolarGasConstant,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The \"Molar Gas Constant\" (also known as the gas constant, universal, or ideal gas constant, denoted by the symbol R) is a physical constant which is featured in many fundamental equations in the physical sciences, such as the ideal gas law and the Nernst equation. It is equivalent to the Boltzmann constant, but expressed in units of energy (i.e. the pressure-volume product) per temperature increment per mole (rather than energy per temperature increment per particle)."},
   :qudt/abbreviation "j-mol^{-1}-k^{-1}",
   :qudt/applicableUnit :unit/J-PER-MOL-K,
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Gas_constant"},
   :qudt/exactMatch :constant/UniversalGasConstant,
   :qudt/hasDimensionVector :qkdv/A-1E0L2I0M1H-1T-2D0,
   :qudt/hasQuantityKind :quantitykind/MolarHeatCapacity,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Gas_constant"}},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31894"},
   :qudt/latexDefinition
   "\\(pV_m = RT\\), where \\(p\\) is pressure, \\(V_m\\) is molar volume, and \\(T\\) is thermodynamic temperature.",
   :qudt/latexSymbol "\\(R\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31894"},
   :qudt/quantityValue :constant/Value_MolarGasConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "molar gas constant"}})

(def MolarMassConstant
  {:db/ident           :constant/MolarMassConstant,
   :qudt/dbpediaMatch  {:xsd/anyURI
                        "http://dbpedia.org/resource/Molar_mass_constant"},
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MolarMassConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "molar mass constant"}})

(def MolarMassOfCarbon12
  {:db/ident           :constant/MolarMassOfCarbon12,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MolarMassOfCarbon12,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "molar mass of carbon-12"}})

(def MolarPlanckConstant
  {:db/ident           :constant/MolarPlanckConstant,
   :qudt/hasQuantityKind :quantitykind/MolarAngularMomentum,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MolarPlanckConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "molar Planck constant"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Planck_constant"}})

(def MolarPlanckConstantTimesC
  {:db/ident           :constant/MolarPlanckConstantTimesC,
   :qudt/hasQuantityKind :quantitykind/LengthMolarEnergy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MolarPlanckConstantTimesC,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "molar Planck constant times c"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Planck_constant"}})

(def MolarVolumeOfIdealGas273_15K100KPa
  {:db/ident           :constant/MolarVolumeOfIdealGas273.15K100KPa,
   :qudt/hasQuantityKind :quantitykind/MolarVolume,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MolarVolumeOfIdealGas,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "molar volume of ideal gas 273.15 K 100 kPa"}})

(def MolarVolumeOfIdealGas273_15K101_325KPa
  {:db/ident           :constant/MolarVolumeOfIdealGas273.15K101.325KPa,
   :qudt/hasQuantityKind :quantitykind/MolarVolume,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MolarVolumeOfIdealGas,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "molar volume of ideal gas 273.15 K 101.325 kPa"}})

(def MolarVolumeOfSilicon
  {:db/ident           :constant/MolarVolumeOfSilicon,
   :qudt/hasQuantityKind :quantitykind/MolarVolume,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MolarVolumeOfSilicon,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "molar volume of silicon"}})

(def MuonComptonWavelength
  {:db/ident           :constant/MuonComptonWavelength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonComptonWavelength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon Compton wavelength"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Compton_wavelength"}})

(def MuonComptonWavelengthOver2Pi
  {:db/ident           :constant/MuonComptonWavelengthOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonComptonWavelengthOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon Compton wavelength over 2 pi"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Compton_wavelength"}})

(def MuonElectronMassRatio
  {:db/ident           :constant/MuonElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon-electron mass ratio"}})

(def MuonGFactor
  {:db/ident           :constant/MuonGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon g factor"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def MuonMagneticMoment
  {:db/ident           :constant/MuonMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon magnetic moment"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Magnetic_moment"}})

(def MuonMagneticMomentAnomaly
  {:db/ident           :constant/MuonMagneticMomentAnomaly,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonMagneticMomentAnomaly,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon magnetic moment anomaly"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Magnetic_moment"}})

(def MuonMagneticMomentToBohrMagnetonRatio
  {:db/ident           :constant/MuonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonMagneticMomentToBohrMagnetonRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "muon magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Bohr_magneton"}})

(def MuonMagneticMomentToNuclearMagnetonRatio
  {:db/ident           :constant/MuonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonMagneticMomentToNuclearMagnetonRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "muon magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Nuclear_magneton"}})

(def MuonMass
  {:db/ident           :constant/MuonMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon mass"}})

(def MuonMassEnergyEquivalent
  {:db/ident :constant/MuonMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "muon mass energy equivalent"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def MuonMassEnergyEquivalentInMeV
  {:db/ident :constant/MuonMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "muon mass energy equivalent in MeV"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def MuonMassInAtomicMassUnit
  {:db/ident           :constant/MuonMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon mass in atomic mass unit"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def MuonMolarMass
  {:db/ident           :constant/MuonMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon molar mass"}})

(def MuonNeutronMassRatio
  {:db/ident           :constant/MuonNeutronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonNeutronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon-neutron mass ratio"}})

(def MuonProtonMagneticMomentRatio
  {:db/ident           :constant/MuonProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonProtonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon-proton magnetic moment ratio"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def MuonProtonMassRatio
  {:db/ident           :constant/MuonProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon-proton mass ratio"}})

(def MuonTauMassRatio
  {:db/ident           :constant/MuonTauMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_MuonTauMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon-tau mass ratio"}})

(def NaturalUnitOfAction
  {:db/ident           :constant/NaturalUnitOfAction,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NaturalUnitOfAction,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of action"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Natural_units"}})

(def NaturalUnitOfActionInEVS
  {:db/ident           :constant/NaturalUnitOfActionInEVS,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NaturalUnitOfActionInEVS,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of action in eV s"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Natural_units"}})

(def NaturalUnitOfEnergy
  {:db/ident           :constant/NaturalUnitOfEnergy,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NaturalUnitOfEnergy,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of energy"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Natural_units"}})

(def NaturalUnitOfEnergyInMeV
  {:db/ident           :constant/NaturalUnitOfEnergyInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NaturalUnitOfEnergyInMeV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of energy in MeV"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Natural_units"}})

(def NaturalUnitOfLength
  {:db/ident           :constant/NaturalUnitOfLength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NaturalUnitOfLength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of length"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Natural_units"}})

(def NaturalUnitOfMass
  {:db/ident           :constant/NaturalUnitOfMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NaturalUnitOfMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of mass"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Natural_units"}})

(def NaturalUnitOfMomentum
  {:db/ident           :constant/NaturalUnitOfMomentum,
   :qudt/hasQuantityKind :quantitykind/LinearMomentum,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NaturalUnitOfMomentum,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of momentum"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Natural_units"}})

(def NaturalUnitOfMomentumInMeV-PER-c
  {:db/ident           :constant/NaturalUnitOfMomentumInMeV-PER-c,
   :qudt/hasQuantityKind :quantitykind/LinearMomentum,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NaturalUnitOfMomentumInMeVPerC,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of momentum in MeV PER c"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Natural_units"}})

(def NaturalUnitOfTime
  {:db/ident           :constant/NaturalUnitOfTime,
   :qudt/hasQuantityKind :quantitykind/Time,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NaturalUnitOfTime,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of time"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Natural_units"}})

(def NaturalUnitOfVelocity
  {:db/ident           :constant/NaturalUnitOfVelocity,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/LinearVelocity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NaturalUnitOfVelocity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of velocity"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Natural_units"}})

(def NeutronComptonWavelength
  {:db/ident           :constant/NeutronComptonWavelength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronComptonWavelength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron Compton wavelength"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Compton_wavelength"}})

(def NeutronComptonWavelengthOver2Pi
  {:db/ident           :constant/NeutronComptonWavelengthOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronComptonWavelengthOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron Compton wavelength over 2 pi"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Compton_wavelength"}})

(def NeutronElectronMagneticMomentRatio
  {:db/ident :constant/NeutronElectronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronElectronMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "neutron-electron magnetic moment ratio"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"}})

(def NeutronElectronMassRatio
  {:db/ident           :constant/NeutronElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron-electron mass ratio"}})

(def NeutronGFactor
  {:db/ident           :constant/NeutronGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron g factor"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def NeutronGyromagneticRatio
  {:db/ident           :constant/NeutronGyromagneticRatio,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronGyromagneticRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron gyromagnetic ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Gyromagnetic_ratio"}})

(def NeutronGyromagneticRatioOver2Pi
  {:db/ident           :constant/NeutronGyromagneticRatioOver2Pi,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronGyromagneticRatioOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron gyromagnetic ratio over 2 pi"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Gyromagnetic_ratio"}})

(def NeutronMagneticMoment
  {:db/ident           :constant/NeutronMagneticMoment,
   :qudt/dbpediaMatch  {:xsd/anyURI
                        "http://dbpedia.org/resource/Neutron_magnetic_moment"},
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron magnetic moment"}})

(def NeutronMagneticMomentToBohrMagnetonRatio
  {:db/ident :constant/NeutronMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronMagneticMomentToBohrMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "neutron magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch #{{:xsd/anyURI "http://dbpedia.org/resource/Bohr_magneton"}
                      {:xsd/anyURI
                       "http://dbpedia.org/resource/Neutron_magnetic_moment"}}})

(def NeutronMagneticMomentToNuclearMagnetonRatio
  {:db/ident :constant/NeutronMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_NeutronMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "neutron magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch
   #{{:xsd/anyURI "http://dbpedia.org/resource/Nuclear_magneton"}
     {:xsd/anyURI "http://dbpedia.org/resource/Neutron_magnetic_moment"}}})

(def NeutronMass
  {:db/ident           :constant/NeutronMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron mass"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/Neutron"}})

(def NeutronMassEnergyEquivalent
  {:db/ident :constant/NeutronMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "neutron mass energy equivalent"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def NeutronMassEnergyEquivalentInMeV
  {:db/ident :constant/NeutronMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "neutron mass energy equivalent in MeV"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def NeutronMassInAtomicMassUnit
  {:db/ident           :constant/NeutronMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron mass in atomic mass unit"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def NeutronMolarMass
  {:db/ident           :constant/NeutronMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron molar mass"}})

(def NeutronMuonMassRatio
  {:db/ident           :constant/NeutronMuonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronMuonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron-muon mass ratio"}})

(def NeutronProtonMagneticMomentRatio
  {:db/ident           :constant/NeutronProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronProtonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron-proton magnetic moment ratio"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def NeutronProtonMassRatio
  {:db/ident           :constant/NeutronProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron-proton mass ratio"}})

(def NeutronTauMassRatio
  {:db/ident           :constant/NeutronTauMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NeutronTauMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron-tau mass ratio"}})

(def NeutronToShieldedProtonMagneticMomentRatio
  {:db/ident :constant/NeutronToShieldedProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_NeutronToShieldedProtonMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "neutron to shielded proton magnetic moment ratio"},
   :skos/closeMatch {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def NewtonianConstantOfGravitation
  {:db/ident           :constant/NewtonianConstantOfGravitation,
   :qudt/dbpediaMatch  {:xsd/anyURI
                        "http://dbpedia.org/resource/Gravitational_constant"},
   :qudt/hasQuantityKind :quantitykind/GravitationalAttraction,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NewtonianConstantOfGravitation,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Newtonian constant of gravitation"}})

(def NuclearMagneton
  {:db/ident :constant/NuclearMagneton,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The \"Nuclear Magneton\" is the natural unit for expressing magnetic dipole moments of heavy particles such as nucleons and atomic nuclei."},
   :qudt/applicableUnit :unit/J-PER-T,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Nuclear_magneton"},
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Nuclear_magneton"}},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/latexDefinition
   "\\(\\mu_N = \\frac{e\\hbar}{2m_p}\\), where \\(e\\) is the elementary charge, \\(\\hbar\\) is the Planck constant, and \\(m_p\\) is the rest mass of proton.",
   :qudt/latexSymbol "\\(\\mu_N\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/quantityValue :constant/Value_NuclearMagneton,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Nuclear Magneton"},
   :skos/related :constant/BohrMagneton})

(def NuclearMagnetonInEVPerT
  {:db/ident           :constant/NuclearMagnetonInEVPerT,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NuclearMagnetonInEVPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "nuclear magneton in eV per T"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Nuclear_magneton"}})

(def NuclearMagnetonInInverseMetersPerTesla
  {:db/ident           :constant/NuclearMagnetonInInverseMetersPerTesla,
   :qudt/hasQuantityKind :quantitykind/MagneticReluctivity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NuclearMagnetonInInverseMetersPerTesla,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "nuclear magneton in inverse meters per tesla"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Nuclear_magneton"}})

(def NuclearMagnetonInKPerT
  {:db/ident           :constant/NuclearMagnetonInKPerT,
   :qudt/hasQuantityKind :quantitykind/TemperaturePerMagneticFluxDensity,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NuclearMagnetonInKPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "nuclear magneton in K per T"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Nuclear_magneton"}})

(def NuclearMagnetonInMHzPerT
  {:db/ident           :constant/NuclearMagnetonInMHzPerT,
   :qudt/hasQuantityKind :quantitykind/ElectricChargePerMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_NuclearMagnetonInMHzPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "nuclear magneton in MHz per T"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Nuclear_magneton"}})

(def PermittivityOfVacuum
  {:db/ident :constant/PermittivityOfVacuum,
   :dcterms/description
   "\\(\\textbf{Permittivity of Vacuum}\\), also known as the \\(\\textit{electric constant}\\) is a constant whose value is \\(\\approx\\,6.854188e-12\\, farad\\,per\\,metre\\). Sometimes also referred to as the \\(textit{Permittivity of Free Space}\\).",
   :qudt/applicableUnit :unit/FARAD-PER-M,
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Permittivity"},
   :qudt/hasQuantityKind :quantitykind/Permittivity,
   :qudt/informativeReference
   {:xsd/anyURI
    "http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31891"},
   :qudt/latexDefinition
   "\\(\\epsilon = \\frac{\\mathbf{D}}{\\mathbf{E}}\\), where \\(\\mathbf{D}\\) is electric flux density and \\(\\mathbf{E}\\) is electric field strength.",
   :qudt/latexSymbol "\\(\\epsilon_0\\)",
   :qudt/quantityValue :constant/Value_PermittivityOfVacuum,
   :qudt/ucumCode {:rdf/type  :qudt/UCUMcs,
                   :rdf/value "[eps_0]"},
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Permittivity of Vacuum"},
   :rdfs/seeAlso #{:quantitykind/ElectricFluxDensity :quantitykind/Permittivity
                   :quantitykind/ElectricFieldStrength}})

(def Pi
  {:db/ident :constant/Pi,
   :dcterms/description
   "The constant \\(\\pi\\) is the ratio of a circle's circumference to its diameter, commonly approximated as 3.14159.",
   :qudt/applicableUnit :unit/UNITLESS,
   :qudt/dbpediaMatch {:xsd/anyURI "http://dbpedia.org/resource/Pi"},
   :qudt/hasQuantityKind :quantitykind/Angle,
   :qudt/informativeReference {:xsd/anyURI "http://en.wikipedia.org/wiki/Pi"},
   :qudt/latexDefinition
   "\\(\\pi = \\frac{C}{d}\\), where \\(C\\) is the circumference of a circle and \\(d\\) is the diameter of a circle.",
   :qudt/latexSymbol "\\(\\pi\\)",
   :qudt/quantityValue :constant/Value_Pi,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pi"}})

(def PlanckConstant
  {:db/ident :constant/PlanckConstant,
   :dcterms/description
   "The \"Planck Constant\" is a physical constant that is the quantum of action in quantum mechanics. The Planck constant was first described as the proportionality constant between the energy (\\(E\\)) of a photon and the frequency (\\(\\nu\\)) of its associated electromagnetic wave.",
   :qudt/applicableUnit :unit/J-SEC,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Planck_constant"},
   :qudt/hasDimensionVector :qkdv/A0E0L2I0M1H0T-1D0,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://en.wikipedia.org/wiki/Planck_constant"}
     {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/latexDefinition
   "\\(E = h\\nu = \\frac{hc}{\\lambda}\\), where \\(E\\) is energy, \\(\\nu\\) is frequency, \\(\\lambda\\) is wavelength, and \\(c\\) is the speed of light.",
   :qudt/latexSymbol "\\(h\\)",
   :qudt/quantityValue :constant/Value_PlanckConstant,
   :qudt/ucumCode {:rdf/type  :qudt/UCUMcs,
                   :rdf/value "[h]"},
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Planck Constant"}})

(def PlanckConstantInEVS
  {:db/ident           :constant/PlanckConstantInEVS,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_PlanckConstantInEVS,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck constant in eV s"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Planck_constant"}})

(def PlanckConstantOver2Pi
  {:db/ident           :constant/PlanckConstantOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_PlanckConstantOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck constant over 2 pi"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Planck_constant"}})

(def PlanckConstantOver2PiInEVS
  {:db/ident           :constant/PlanckConstantOver2PiInEVS,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_PlanckConstantOver2PiInEVS,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck constant over 2 pi in eV s"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Planck_constant"}})

(def PlanckConstantOver2PiTimesCInMeVFm
  {:db/ident           :constant/PlanckConstantOver2PiTimesCInMeVFm,
   :qudt/hasQuantityKind :quantitykind/LengthEnergy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_PlanckConstantOver2PiTimesCInMeVFm,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "Planck constant over 2 pi times c in MeV fm"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Planck_constant"}})

(def PlanckLength
  {:db/ident           :constant/PlanckLength,
   :qudt/dbpediaMatch  {:xsd/anyURI
                        "http://dbpedia.org/resource/Planck_length"},
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_PlanckLength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck length"}})

(def PlanckMass
  {:db/ident           :constant/PlanckMass,
   :qudt/dbpediaMatch  {:xsd/anyURI "http://dbpedia.org/resource/Planck_mass"},
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_PlanckMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck mass"}})

(def PlanckMassEnergyEquivalentInGeV
  {:db/ident           :constant/PlanckMassEnergyEquivalentInGeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_PlanckMassEnergyEquivalentInGeV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck mass energy equivalent in GeV"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/Planck_mass"}})

(def PlanckTemperature
  {:db/ident           :constant/PlanckTemperature,
   :qudt/dbpediaMatch  {:xsd/anyURI
                        "http://dbpedia.org/resource/Planck_temperature"},
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_PlanckTemperature,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck temperature"}})

(def PlanckTime
  {:db/ident           :constant/PlanckTime,
   :qudt/dbpediaMatch  {:xsd/anyURI "http://dbpedia.org/resource/Planck_time"},
   :qudt/hasQuantityKind :quantitykind/Time,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_PlanckTime,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck time"}})

(def ProtonChargeToMassQuotient
  {:db/ident           :constant/ProtonChargeToMassQuotient,
   :qudt/hasQuantityKind :quantitykind/ElectricChargePerMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonChargeToMassQuotient,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton charge to mass quotient"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Mass-to-charge_ratio"}})

(def ProtonComptonWavelength
  {:db/ident           :constant/ProtonComptonWavelength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonComptonWavelength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton Compton wavelength"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Compton_wavelength"}})

(def ProtonComptonWavelengthOver2Pi
  {:db/ident           :constant/ProtonComptonWavelengthOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonComptonWavelengthOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton Compton wavelength over 2 pi"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Compton_wavelength"}})

(def ProtonElectronMassRatio
  {:db/ident           :constant/ProtonElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton-electron mass ratio"}})

(def ProtonGFactor
  {:db/ident           :constant/ProtonGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton g factor"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def ProtonGyromagneticRatio
  {:db/ident           :constant/ProtonGyromagneticRatio,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonGyromagneticRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton gyromagnetic ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Gyromagnetic_ratio"}})

(def ProtonGyromagneticRatioOver2Pi
  {:db/ident           :constant/ProtonGyromagneticRatioOver2Pi,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonGyromagneticRatioOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton gyromagnetic ratio over 2 pi"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Gyromagnetic_ratio"}})

(def ProtonMagneticMoment
  {:db/ident           :constant/ProtonMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton magnetic moment"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Magnetic_moment"}})

(def ProtonMagneticMomentToBohrMagnetonRatio
  {:db/ident           :constant/ProtonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonMagneticMomentToBohrMagnetonRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "proton magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Bohr_magneton"}})

(def ProtonMagneticMomentToNuclearMagnetonRatio
  {:db/ident :constant/ProtonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_ProtonMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "proton magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch {:xsd/anyURI
                     "http://dbpedia.org/resource/Nuclear_magneton"}})

(def ProtonMagneticShieldingCorrection
  {:db/ident           :constant/ProtonMagneticShieldingCorrection,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonMagneticShieldingCorrection,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton mag. shielding correction"}})

(def ProtonMass
  {:db/ident             :constant/ProtonMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue   :constant/Value_ProtonMass,
   :qudt/ucumCode        {:rdf/type  :qudt/UCUMcs,
                          :rdf/value "[m_p]"},
   :rdf/type             :qudt/PhysicalConstant,
   :rdfs/isDefinedBy     {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "proton mass"},
   :skos/closeMatch      {:xsd/anyURI "http://dbpedia.org/resource/Proton"}})

(def ProtonMassEnergyEquivalent
  {:db/ident :constant/ProtonMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "proton mass energy equivalent"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def ProtonMassEnergyEquivalentInMeV
  {:db/ident :constant/ProtonMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "proton mass energy equivalent in MeV"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def ProtonMassInAtomicMassUnit
  {:db/ident           :constant/ProtonMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton mass in atomic mass unit"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def ProtonMolarMass
  {:db/ident           :constant/ProtonMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton molar mass"}})

(def ProtonMuonMassRatio
  {:db/ident           :constant/ProtonMuonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonMuonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton-muon mass ratio"}})

(def ProtonNeutronMagneticMomentRatio
  {:db/ident           :constant/ProtonNeutronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonNeutronMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton-neutron magnetic moment ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Neutron_magnetic_moment"}})

(def ProtonNeutronMassRatio
  {:db/ident           :constant/ProtonNeutronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonNeutronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton-neutron mass ratio"}})

(def ProtonRmsChargeRadius
  {:db/ident           :constant/ProtonRmsChargeRadius,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonRmsChargeRadius,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton rms charge radius"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/Nucleon"}})

(def ProtonTauMassRatio
  {:db/ident           :constant/ProtonTauMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ProtonTauMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton-tau mass ratio"}})

(def QuantumOfCirculation
  {:db/ident :constant/QuantumOfCirculation,
   :qudt/hasQuantityKind :quantitykind/Circulation,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_QuantumOfCirculation,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quantum of circulation"},
   :skos/closeMatch
   {:xsd/anyURI
    "http://dbpedia.org/resource/Circulation_%28fluid_dynamics%29"}})

(def QuantumOfCirculationTimes2
  {:db/ident :constant/QuantumOfCirculationTimes2,
   :qudt/hasQuantityKind :quantitykind/Circulation,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_QuantumOfCirculationTimes2,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quantum of circulation times 2"},
   :skos/closeMatch
   {:xsd/anyURI
    "http://dbpedia.org/resource/Circulation_%28fluid_dynamics%29"}})

(def ReducedPlanckConstant
  {:db/ident :constant/ReducedPlanckConstant,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The <i>Reduced Planck Constant</i>, or <i>Dirac Constant</i>, is used in applications where frequency is expressed in terms of radians per second <i>(angular frequency)</i> instead of cycles per second. In such cases a factor of 2𝜋 is absorbed into the constant."},
   :qudt/applicableUnit :unit/J-SEC,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference {:xsd/anyURI
                               "http://en.wikipedia.org/wiki/Planck_constant"},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/latexDefinition
   "\\(\\hbar = \\frac{h}{2\\pi}\\), where \\(h\\) is the Planck constant.",
   :qudt/latexSymbol "\\(\\hbar\\)",
   :qudt/quantityValue :constant/Value_PlanckConstantOver2Pi,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reduced Planck Constant"},
   :skos/broader :constant/PlanckConstant})

(def RydbergConstant
  {:db/ident :constant/RydbergConstant,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The Rydberg constant, named after the Swedish physicist Johannes Rydberg, is a physical constant relating to atomic spectra, in the science of spectroscopy."},
   :qudt/applicableUnit :unit/PER-M,
   :qudt/dbpediaMatch {:xsd/anyURI
                       "http://dbpedia.org/resource/Rydberg_constant"},
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI
      "http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31895"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Rydberg_constant"}},
   :qudt/isoNormativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/latexDefinition
   "\\(R_\\infty = \\frac{e^2}{8\\pi \\varepsilon_0 a_0 h c_0 }\\), where \\(e\\) is the elementary charge, \\(\\varepsilon_0\\) is the electric constant, \\(a_0\\) is the Bohr radius, \\(h\\) is the Planck constant, and \\(c_0\\) is the speed of light in vacuum.",
   :qudt/latexSymbol "\\(R_\\infty\\)",
   :qudt/normativeReference
   {:xsd/anyURI "http://www.iso.org/iso/catalogue_detail?csnumber=31895"},
   :qudt/quantityValue :constant/Value_RydbergConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rydberg constant"}})

(def RydbergConstantTimesCInHz
  {:db/ident           :constant/RydbergConstantTimesCInHz,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_RydbergConstantTimesCInHz,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Rydberg constant times c in Hz"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Rydberg_constant"}})

(def RydbergConstantTimesHcInEV
  {:db/ident           :constant/RydbergConstantTimesHcInEV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_RydbergConstantTimesHcInEV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Rydberg constant times hc in eV"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Rydberg_constant"}})

(def RydbergConstantTimesHcInJ
  {:db/ident           :constant/RydbergConstantTimesHcInJ,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_RydbergConstantTimesHcInJ,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Rydberg constant times hc in J"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Rydberg_constant"}})

(def SackurTetrodeConstant1K100KPa
  {:db/ident           :constant/SackurTetrodeConstant1K100KPa,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_SackurTetrodeConstant1K100KPa,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Sackur-Tetrode constant 1 K 100 kPa"}})

(def SackurTetrodeConstant1K101_325KPa
  {:db/ident           :constant/SackurTetrodeConstant1K101.325KPa,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_SackurTetrodeConstant1K101.325K,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "Sackur-Tetrode constant 1 K 101.325 kPa"}})

(def SecondRadiationConstant
  {:db/ident           :constant/SecondRadiationConstant,
   :qudt/hasQuantityKind :quantitykind/LengthTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_SecondRadiationConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "second radiation constant"}})

(def ShieldedHelionGyromagneticRatio
  {:db/ident           :constant/ShieldedHelionGyromagneticRatio,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ShieldedHelionGyromagneticRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "shielded helion gyromagnetic ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Gyromagnetic_ratio"}})

(def ShieldedHelionGyromagneticRatioOver2Pi
  {:db/ident           :constant/ShieldedHelionGyromagneticRatioOver2Pi,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ShieldedHelionGyromagneticRatioOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "shielded helion gyromagnetic ratio over 2 pi"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Gyromagnetic_ratio"}})

(def ShieldedHelionMagneticMoment
  {:db/ident           :constant/ShieldedHelionMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ShieldedHelionMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "shielded helion magnetic moment"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Magnetic_moment"}})

(def ShieldedHelionMagneticMomentToBohrMagnetonRatio
  {:db/ident :constant/ShieldedHelionMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_ShieldedHelionMagneticMomentToBohrMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "shielded helion magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch {:xsd/anyURI "http://dbpedia.org/resource/Bohr_magneton"}})

(def ShieldedHelionMagneticMomentToNuclearMagnetonRatio
  {:db/ident :constant/ShieldedHelionMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_ShieldedHelionMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "shielded helion magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch {:xsd/anyURI
                     "http://dbpedia.org/resource/Nuclear_magneton"}})

(def ShieldedHelionToProtonMagneticMomentRatio
  {:db/ident :constant/ShieldedHelionToProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_ShieldedHelionToProtonMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "shielded helion to proton magnetic moment ratio"},
   :skos/closeMatch {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def ShieldedHelionToShieldedProtonMagneticMomentRatio
  {:db/ident :constant/ShieldedHelionToShieldedProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_ShieldedHelionToShieldedProtonMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "shielded helion to shielded proton magnetic moment ratio"},
   :skos/closeMatch {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def ShieldedProtonGyromagneticRatio
  {:db/ident           :constant/ShieldedProtonGyromagneticRatio,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ShieldedProtonGyromagneticRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "shielded proton gyromagnetic ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Gyromagnetic_ratio"}})

(def ShieldedProtonGyromagneticRatioOver2Pi
  {:db/ident           :constant/ShieldedProtonGyromagneticRatioOver2Pi,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ShieldedProtonGyromagneticRatioOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "shielded proton gyromagnetic ratio over 2 pi"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Gyromagnetic_ratio"}})

(def ShieldedProtonMagneticMoment
  {:db/ident           :constant/ShieldedProtonMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ShieldedProtonMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "shielded proton magnetic moment"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Magnetic_moment"}})

(def ShieldedProtonMagneticMomentToBohrMagnetonRatio
  {:db/ident :constant/ShieldedProtonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_ShieldedProtonMagneticMomentToBohrMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "shielded proton magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch {:xsd/anyURI "http://dbpedia.org/resource/Bohr_magneton"}})

(def ShieldedProtonMagneticMomentToNuclearMagnetonRatio
  {:db/ident :constant/ShieldedProtonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_ShieldedProtonMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "shielded proton magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch {:xsd/anyURI
                     "http://dbpedia.org/resource/Nuclear_magneton"}})

(def SpeedOfLight_Vacuum
  {:db/ident :constant/SpeedOfLight_Vacuum,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The speed of light in vacuum, commonly is a universal physical constant important in many areas of physics. Its value is 299,792,458 metres per second, a figure that is exact because the length of the metre is defined from this constant and the international standard for time."},
   :qudt/hasQuantityKind :quantitykind/Speed,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}
     {:xsd/anyURI "http://dbpedia.org/resource/Speed_of_light"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Speed_of_light"}
     {:xsd/anyURI
      "http://www.electropedia.org/iev/iev.nsf/display?openform&ievref=113-01-34"}
     {:xsd/anyURI
      "http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31891"}},
   :qudt/latexDefinition
   "\\(c_0 = 1 / \\sqrt{\\epsilon_0 \\mu_0}\\), where {\\epsilon_0} is the permittivity of vacuum, and \\(\\mu_0\\) is the magnetic constant.",
   :qudt/latexSymbol "\\(C_0\\)",
   :qudt/quantityValue #{:constant/Value_SpeedOfLight_Vacuum_Imperial
                         :constant/Value_SpeedOfLight_Vacuum},
   :qudt/ucumCode {:rdf/type  :qudt/UCUMcs,
                   :rdf/value "[c]"},
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Speed of Light (vacuum)"},
   :rdfs/seeAlso #{:constant/PermittivityOfVacuum :constant/MagneticConstant}})

(def StandardAccelerationOfGravity
  {:db/ident           :constant/StandardAccelerationOfGravity,
   :qudt/dbpediaMatch  {:xsd/anyURI
                        "http://dbpedia.org/resource/Standard_gravity"},
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/LinearAcceleration,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_StandardAccelerationOfGravity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "standard acceleration of gravity"}})

(def StandardAtmosphere
  {:db/ident           :constant/StandardAtmosphere,
   :qudt/dbpediaMatch  {:xsd/anyURI
                        "http://dbpedia.org/resource/Standard_atmosphere"},
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Pressure,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_StandardAtmosphere,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "standard atmosphere"}})

(def StefanBoltzmannConstant
  {:db/ident :constant/StefanBoltzmannConstant,
   :qudt/dbpediaMatch
   {:xsd/anyURI
    "http://dbpedia.org/resource/Stefan%E2%80%93Boltzmann_constant"},
   :qudt/hasQuantityKind :quantitykind/PowerPerAreaQuarticTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_StefanBoltzmannConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Stefan-Boltzmann Constant"}})

(def TauComptonWavelength
  {:db/ident           :constant/TauComptonWavelength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TauComptonWavelength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau Compton wavelength"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Compton_wavelength"}})

(def TauComptonWavelengthOver2Pi
  {:db/ident           :constant/TauComptonWavelengthOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TauComptonWavelengthOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau Compton wavelength over 2 pi"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Compton_wavelength"}})

(def TauElectronMassRatio
  {:db/ident           :constant/TauElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TauElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau-electron mass ratio"}})

(def TauMass
  {:db/ident           :constant/TauMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TauMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau mass"}})

(def TauMassEnergyEquivalent
  {:db/ident :constant/TauMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TauMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tau mass energy equivalent"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def TauMassEnergyEquivalentInMeV
  {:db/ident :constant/TauMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TauMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tau mass energy equivalent in MeV"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def TauMassInAtomicMassUnit
  {:db/ident           :constant/TauMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TauMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau mass in atomic mass unit"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def TauMolarMass
  {:db/ident           :constant/TauMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TauMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau molar mass"}})

(def TauMuonMassRatio
  {:db/ident           :constant/TauMuonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TauMuonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau-muon mass ratio"}})

(def TauNeutronMassRatio
  {:db/ident           :constant/TauNeutronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TauNeutronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau-neutron mass ratio"}})

(def TauProtonMassRatio
  {:db/ident           :constant/TauProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TauProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau-proton mass ratio"}})

(def ThomsonCrossSection
  {:db/ident           :constant/ThomsonCrossSection,
   :qudt/dbpediaMatch  {:xsd/anyURI
                        "http://dbpedia.org/resource/Thomson_scattering"},
   :qudt/hasQuantityKind :quantitykind/Area,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_ThomsonCrossSection,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Thomson cross section"}})

(def TritonElectronMagneticMomentRatio
  {:db/ident :constant/TritonElectronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonElectronMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "triton-electron magnetic moment ratio"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"}})

(def TritonElectronMassRatio
  {:db/ident           :constant/TritonElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton-electron mass ratio"}})

(def TritonGFactor
  {:db/ident           :constant/TritonGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton g factor"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def TritonMagneticMoment
  {:db/ident           :constant/TritonMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton magnetic moment"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Magnetic_moment"}})

(def TritonMagneticMomentToBohrMagnetonRatio
  {:db/ident           :constant/TritonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonMagneticMomentToBohrMagnetonRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "triton magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Bohr_magneton"}})

(def TritonMagneticMomentToNuclearMagnetonRatio
  {:db/ident :constant/TritonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue
   :constant/Value_TritonMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "triton magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch {:xsd/anyURI
                     "http://dbpedia.org/resource/Nuclear_magneton"}})

(def TritonMass
  {:db/ident           :constant/TritonMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton mass"}})

(def TritonMassEnergyEquivalent
  {:db/ident :constant/TritonMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "triton mass energy equivalent"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def TritonMassEnergyEquivalentInMeV
  {:db/ident :constant/TritonMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "triton mass energy equivalent in MeV"},
   :skos/closeMatch
   {:xsd/anyURI "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"}})

(def TritonMassInAtomicMassUnit
  {:db/ident           :constant/TritonMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton mass in atomic mass unit"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Atomic_mass_unit"}})

(def TritonMolarMass
  {:db/ident           :constant/TritonMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton molar mass"}})

(def TritonNeutronMagneticMomentRatio
  {:db/ident           :constant/TritonNeutronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonNeutronMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton-neutron magnetic moment ratio"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Neutron_magnetic_moment"}})

(def TritonProtonMagneticMomentRatio
  {:db/ident           :constant/TritonProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonProtonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton-proton magnetic moment ratio"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/G-factor"}})

(def TritonProtonMassRatio
  {:db/ident           :constant/TritonProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_TritonProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton-proton mass ratio"}})

(def UnifiedAtomicMassUnit
  {:db/ident             :constant/UnifiedAtomicMassUnit,
   :qudt/dbpediaMatch    {:xsd/anyURI
                          "http://dbpedia.org/resource/Atomic_mass_unit"},
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue   :constant/Value_UnifiedAtomicMassUnit,
   :qudt/ucumCode        {:rdf/type  :qudt/UCUMcs,
                          :rdf/value "u"},
   :rdf/type             :qudt/PhysicalConstant,
   :rdfs/isDefinedBy     {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "unified atomic mass unit"}})

(def UniversalGasConstant
  {:db/ident           :constant/UniversalGasConstant,
   :qudt/exactMatch    :constant/MolarGasConstant,
   :qudt/hasDimensionVector :qkdv/A-1E0L2I0M1H-1T-2D0,
   :qudt/latexSymbol   "\\(R\\)",
   :qudt/plainTextDescription
   "The gas constant (also known as the molar, universal, or ideal gas constant) is a physical constant which is featured in many fundamental equations in the physical sciences, such as the ideal gas law and the Nernst equation.\nPhysically, the gas constant is the constant of proportionality that happens to relate the energy scale in physics to the temperature scale, when a mole of particles at the stated temperature is being considered.",
   :qudt/quantityValue :constant/Value_MolarGasConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Universal Gas Constant"}})

(def Value_AlphaParticleElectronMassRatio
  {:db/ident     :constant/Value_AlphaParticleElectronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.1E-6,
   :qudt/value   {:xsd/double 7294.299537},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle-electron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?malsme#mid"}})

(def Value_AlphaParticleMass
  {:db/ident :constant/Value_AlphaParticleMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/relativeStandardUncertainty 5.0E-8,
   :qudt/standardUncertainty 3.3E-34,
   :qudt/value {:xsd/double 6.6446562E-27},
   :rdf/type :qudt/ConstantValue,
   :rdfs/label "Value for alpha particle mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mal#mid"}})

(def Value_AlphaParticleMassEnergyEquivalent
  {:db/ident     :constant/Value_AlphaParticleMassEnergyEquivalent,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.0E-17,
   :qudt/value   {:xsd/double 5.97191917E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle mass energy equivalent",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?malc2#mid"}})

(def Value_AlphaParticleMassEnergyEquivalentInMeV
  {:db/ident     :constant/Value_AlphaParticleMassEnergyEquivalentInMeV,
   :qudt/hasUnit :unit/MegaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 9.3E-5,
   :qudt/value   {:xsd/double 3727.379109},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle mass energy equivalent in MeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?malc2mev#mid"}})

(def Value_AlphaParticleMassInAtomicMassUnit
  {:db/ident     :constant/Value_AlphaParticleMassInAtomicMassUnit,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.2E-11,
   :qudt/value   {:xsd/double 4.001506179127},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle mass in atomic mass unit",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?malu#mid"}})

(def Value_AlphaParticleMolarMass
  {:db/ident     :constant/Value_AlphaParticleMolarMass,
   :qudt/hasUnit :unit/KiloGM-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.2E-14,
   :qudt/value   {:xsd/double 0.004001506179127},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle molar mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmal#mid"}})

(def Value_AlphaParticleProtonMassRatio
  {:db/ident     :constant/Value_AlphaParticleProtonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.1E-10,
   :qudt/value   {:xsd/double 3.97259968951},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle-proton mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?malsmp#mid"}})

(def Value_AngstromStar
  {:db/ident     :constant/Value_AngstromStar,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 9.0E-17,
   :qudt/value   {:xsd/double 1.00001498E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Angstrom star",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?angstar#mid"}})

(def Value_AtomicMassConstant
  {:db/ident     :constant/Value_AtomicMassConstant,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.3E-35,
   :qudt/value   {:xsd/double 1.660538782E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?u#mid"}})

(def Value_AtomicMassConstantEnergyEquivalent
  {:db/ident     :constant/Value_AtomicMassConstantEnergyEquivalent,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.4E-18,
   :qudt/value   {:xsd/double 1.49241783E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass constant energy equivalent",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tuj#mid"}})

(def Value_AtomicMassConstantEnergyEquivalentInMeV
  {:db/ident     :constant/Value_AtomicMassConstantEnergyEquivalentInMeV,
   :qudt/hasUnit :unit/MegaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-5,
   :qudt/value   {:xsd/double 931.494028},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass constant energy equivalent in MeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muc2mev#mid"}})

(def Value_AtomicMassUnitElectronVoltRelationship
  {:db/ident     :constant/Value_AtomicMassUnitElectronVoltRelationship,
   :qudt/hasUnit :unit/EV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 23.0,
   :qudt/value   {:xsd/double 9.31494028E8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-electron volt relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?uev#mid"}})

(def Value_AtomicMassUnitHartreeRelationship
  {:db/ident     :constant/Value_AtomicMassUnitHartreeRelationship,
   :qudt/hasUnit :unit/E_h,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 0.049,
   :qudt/value   {:xsd/double 3.4231777149E7},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-hartree relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?uhr#mid"}})

(def Value_AtomicMassUnitHertzRelationship
  {:db/ident     :constant/Value_AtomicMassUnitHertzRelationship,
   :qudt/hasUnit :unit/HZ,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.2E14,
   :qudt/value   {:xsd/double 2.2523427369E23},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-hertz relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?uhz#mid"}})

(def Value_AtomicMassUnitInverseMeterRelationship
  {:db/ident     :constant/Value_AtomicMassUnitInverseMeterRelationship,
   :qudt/hasUnit :unit/PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1100000.0,
   :qudt/value   {:xsd/double 7.513006671E14},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-inverse meter relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?uminv#mid"}})

(def Value_AtomicMassUnitJouleRelationship
  {:db/ident     :constant/Value_AtomicMassUnitJouleRelationship,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.4E-18,
   :qudt/value   {:xsd/double 1.49241783E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-joule relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?uj#mid"}})

(def Value_AtomicMassUnitKelvinRelationship
  {:db/ident     :constant/Value_AtomicMassUnitKelvinRelationship,
   :qudt/hasUnit :unit/K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.9E7,
   :qudt/value   {:xsd/double 1.0809527E13},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-kelvin relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?uk#mid"}})

(def Value_AtomicMassUnitKilogramRelationship
  {:db/ident     :constant/Value_AtomicMassUnitKilogramRelationship,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.3E-35,
   :qudt/value   {:xsd/double 1.660538782E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-kilogram relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?ukg#mid"}})

(def Value_AtomicUnitOf1stHyperpolarizability
  {:db/ident     :constant/Value_AtomicUnitOf1stHyperpolarizability,
   :qudt/hasUnit :unit/C3-M-PER-J2,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.1E-61,
   :qudt/value   {:xsd/double 3.206361533E-53},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of 1st hyperpolarizability",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?auhypol#mid"}})

(def Value_AtomicUnitOf2ndHyperpolarizability
  {:db/ident     :constant/Value_AtomicUnitOf2ndHyperpolarizability,
   :qudt/hasUnit :unit/C4-M4-PER-J3,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.1E-72,
   :qudt/value   {:xsd/double 6.23538095E-65},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of 2nd hyperpolarizability",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?au2hypol#mid"}})

(def Value_AtomicUnitOfAction
  {:db/ident     :constant/Value_AtomicUnitOfAction,
   :qudt/hasUnit :unit/J-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.3E-42,
   :qudt/value   {:xsd/double 1.054571628E-34},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of action",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tthbar#mid"}})

(def Value_AtomicUnitOfCharge
  {:db/ident     :constant/Value_AtomicUnitOfCharge,
   :qudt/hasUnit :unit/C,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.0E-27,
   :qudt/value   {:xsd/double 1.602176487E-19},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of charge",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?te#mid"}})

(def Value_AtomicUnitOfChargeDensity
  {:db/ident     :constant/Value_AtomicUnitOfChargeDensity,
   :qudt/hasUnit :unit/C-PER-M3,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 27000.0,
   :qudt/value   {:xsd/double 1.0812023E12},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of charge density",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?aucd#mid"}})

(def Value_AtomicUnitOfCurrent
  {:db/ident     :constant/Value_AtomicUnitOfCurrent,
   :qudt/hasUnit :unit/A,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.7E-10,
   :qudt/value   {:xsd/double 0.00662361763},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of current",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?aucur#mid"}})

(def Value_AtomicUnitOfElectricDipoleMoment
  {:db/ident     :constant/Value_AtomicUnitOfElectricDipoleMoment,
   :qudt/hasUnit :unit/C-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.1E-37,
   :qudt/value   {:xsd/double 8.47835281E-30},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric dipole mom.",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?auedm#mid"}})

(def Value_AtomicUnitOfElectricField
  {:db/ident     :constant/Value_AtomicUnitOfElectricField,
   :qudt/hasUnit :unit/V-PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 13000.0,
   :qudt/value   {:xsd/double 5.14220632E11},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric field",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?auefld#mid"}})

(def Value_AtomicUnitOfElectricFieldGradient
  {:db/ident     :constant/Value_AtomicUnitOfElectricFieldGradient,
   :qudt/hasUnit :unit/V-PER-M2,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.4E14,
   :qudt/value   {:xsd/double 9.71736166E21},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric field gradient",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?auefg#mid"}})

(def Value_AtomicUnitOfElectricPolarizability
  {:db/ident     :constant/Value_AtomicUnitOfElectricPolarizability,
   :qudt/hasUnit :unit/C2-M2-PER-J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.4E-50,
   :qudt/value   {:xsd/double 1.6487772536E-41},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric polarizability",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?auepol#mid"}})

(def Value_AtomicUnitOfElectricPotential
  {:db/ident     :constant/Value_AtomicUnitOfElectricPotential,
   :qudt/hasUnit :unit/V,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.8E-7,
   :qudt/value   {:xsd/double 27.21138386},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric potential",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?auep#mid"}})

(def Value_AtomicUnitOfElectricQuadrupoleMoment
  {:db/ident     :constant/Value_AtomicUnitOfElectricQuadrupoleMoment,
   :qudt/hasUnit :unit/C-M2,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-47,
   :qudt/value   {:xsd/double 4.48655107E-40},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric quadrupole moment",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?aueqm#mid"}})

(def Value_AtomicUnitOfEnergy
  {:db/ident     :constant/Value_AtomicUnitOfEnergy,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.2E-25,
   :qudt/value   {:xsd/double 4.35974394E-18},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of energy",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?thr#mid"}})

(def Value_AtomicUnitOfForce
  {:db/ident     :constant/Value_AtomicUnitOfForce,
   :qudt/hasUnit :unit/N,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.1E-15,
   :qudt/value   {:xsd/double 8.23872206E-8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of force",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?auforce#mid"}})

(def Value_AtomicUnitOfLength
  {:db/ident     :constant/Value_AtomicUnitOfLength,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.6E-20,
   :qudt/value   {:xsd/double 5.2917720859E-11},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of length",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tbohrrada0#mid"}})

(def Value_AtomicUnitOfMagneticDipoleMoment
  {:db/ident     :constant/Value_AtomicUnitOfMagneticDipoleMoment,
   :qudt/hasUnit :unit/J-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.6E-31,
   :qudt/value   {:xsd/double 1.85480183E-23},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of magnetic dipole moment",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?aumdm#mid"}})

(def Value_AtomicUnitOfMagneticFluxDensity
  {:db/ident     :constant/Value_AtomicUnitOfMagneticFluxDensity,
   :qudt/hasUnit :unit/T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 0.0059,
   :qudt/value   {:xsd/double 235051.7382},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of magnetic flux density",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?aumfd#mid"}})

(def Value_AtomicUnitOfMagnetizability
  {:db/ident     :constant/Value_AtomicUnitOfMagnetizability,
   :qudt/hasUnit :unit/J-PER-T2,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.7E-37,
   :qudt/value   {:xsd/double 7.891036433E-29},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of magnetizability",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?aumag#mid"}})

(def Value_AtomicUnitOfMass
  {:db/ident     :constant/Value_AtomicUnitOfMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.5E-38,
   :qudt/value   {:xsd/double 9.10938215E-31},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?ttme#mid"}})

(def Value_AtomicUnitOfMomentum
  {:db/ident     :constant/Value_AtomicUnitOfMomentum,
   :qudt/hasUnit :unit/KiloGM-M-PER-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 9.9E-32,
   :qudt/value   {:xsd/double 1.992851565E-24},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of momentum",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?aumom#mid"}})

(def Value_AtomicUnitOfPermittivity
  {:db/ident     :constant/Value_AtomicUnitOfPermittivity,
   :qudt/hasUnit :unit/FARAD-PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 1.112650056E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of permittivity",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?auperm#mid"}})

(def Value_AtomicUnitOfTime
  {:db/ident     :constant/Value_AtomicUnitOfTime,
   :qudt/hasUnit :unit/SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.6E-12,
   :qudt/value   {:xsd/double 2.418884326505E-17},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of time",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?aut#mid"}})

(def Value_AtomicUnitOfVelocity
  {:db/ident     :constant/Value_AtomicUnitOfVelocity,
   :qudt/hasUnit :unit/M-PER-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 0.0015,
   :qudt/value   {:xsd/double 2187691.2541},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of velocity",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?auvel#mid"}})

(def Value_AvogadroConstant
  {:db/ident     :constant/Value_AvogadroConstant,
   :qudt/hasUnit :unit/PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.0E16,
   :qudt/value   {:xsd/double 6.02214179E23},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Avogadro constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?na#mid"}})

(def Value_BohrMagneton
  {:db/ident     :constant/Value_BohrMagneton,
   :qudt/hasUnit :unit/J-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-31,
   :qudt/value   {:xsd/double 9.27400915E-24},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr magneton",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mub#mid"}})

(def Value_BohrMagnetonInEVPerT
  {:db/ident     :constant/Value_BohrMagnetonInEVPerT,
   :qudt/hasUnit :unit/EV-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.9E-14,
   :qudt/value   {:xsd/double 5.7883817555E-5},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr magneton in eV per T",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mubev#mid"}})

(def Value_BohrMagnetonInHzPerT
  {:db/ident     :constant/Value_BohrMagnetonInHzPerT,
   :qudt/hasUnit :unit/HZ-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 350.0,
   :qudt/value   {:xsd/double 1.399624604E10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr magneton in Hz perT",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mubshhz#mid"}})

(def Value_BohrMagnetonInInverseMetersPerTesla
  {:db/ident     :constant/Value_BohrMagnetonInInverseMetersPerTesla,
   :qudt/hasUnit :unit/PER-T-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.2E-6,
   :qudt/value   {:xsd/double 46.6864515},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr magneton in inverse meters per tesla",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mubshcminv#mid"}})

(def Value_BohrMagnetonInKPerT
  {:db/ident     :constant/Value_BohrMagnetonInKPerT,
   :qudt/hasUnit :unit/K-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.2E-6,
   :qudt/value   {:xsd/double 0.6717131},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr magneton in K per T",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mubskk#mid"}})

(def Value_BohrRadius
  {:db/ident     :constant/Value_BohrRadius,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.6E-20,
   :qudt/value   {:xsd/double 5.2917720859E-11},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr radius",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?bohrrada0#mid"}})

(def Value_BoltzmannConstant
  {:db/ident     :constant/Value_BoltzmannConstant,
   :qudt/hasUnit :unit/J-PER-K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.4E-29,
   :qudt/value   {:xsd/double 1.3806504E-23},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Boltzmann constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?k#mid"}})

(def Value_BoltzmannConstantInEVPerK
  {:db/ident     :constant/Value_BoltzmannConstantInEVPerK,
   :qudt/hasUnit :unit/EV-PER-K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.5E-10,
   :qudt/value   {:xsd/double 8.617343E-5},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Boltzmann constant in eV per K",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tkev#mid"}})

(def Value_BoltzmannConstantInHzPerK
  {:db/ident     :constant/Value_BoltzmannConstantInHzPerK,
   :qudt/hasUnit :unit/HZ-PER-K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 36000.0,
   :qudt/value   {:xsd/double 2.0836644E10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Boltzmann constant in Hz per K",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kshhz#mid"}})

(def Value_BoltzmannConstantInInverseMetersPerKelvin
  {:db/ident     :constant/Value_BoltzmannConstantInInverseMetersPerKelvin,
   :qudt/hasUnit :unit/PER-M-K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.2E-4,
   :qudt/value   {:xsd/double 69.50356},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Boltzmann constant in inverse meters per kelvin",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kshcminv#mid"}})

(def Value_CharacteristicImpedanceOfVacuum
  {:db/ident     :constant/Value_CharacteristicImpedanceOfVacuum,
   :qudt/hasUnit :unit/OHM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 376.730313461},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for characteristic impedance of vacuum",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?z0#mid"}})

(def Value_ClassicalElectronRadius
  {:db/ident     :constant/Value_ClassicalElectronRadius,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.8E-24,
   :qudt/value   {:xsd/double 2.8179402894E-15},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for classical electron radius",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?re#mid"}})

(def Value_ComptonWavelength
  {:db/ident     :constant/Value_ComptonWavelength,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.3E-21,
   :qudt/value   {:xsd/double 2.4263102175E-12},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Compton wavelength",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?ecomwl#mid"}})

(def Value_ComptonWavelengthOver2Pi
  {:db/ident     :constant/Value_ComptonWavelengthOver2Pi,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.3E-22,
   :qudt/value   {:xsd/double 3.8615926459E-13},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Compton wavelength over 2 pi",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?ecomwlbar#mid"}})

(def Value_ConductanceQuantum
  {:db/ident     :constant/Value_ConductanceQuantum,
   :qudt/hasUnit :unit/S,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.3E-14,
   :qudt/value   {:xsd/double 7.7480917004E-5},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for conductance quantum",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?conqu2e2sh#mid"}})

(def Value_ConventionalValueOfJosephsonConstant
  {:db/ident     :constant/Value_ConventionalValueOfJosephsonConstant,
   :qudt/hasUnit :unit/HZ-PER-V,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 4.835979E14},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for conventional value of Josephson constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kj90#mid"}})

(def Value_ConventionalValueOfVonKlitzingConstant
  {:db/ident     :constant/Value_ConventionalValueOfVonKlitzingConstant,
   :qudt/hasUnit :unit/OHM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 25812.807},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for conventional value of von Klitzing constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?rk90#mid"}})

(def Value_CuXUnit
  {:db/ident     :constant/Value_CuXUnit,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.8E-20,
   :qudt/value   {:xsd/double 1.00207699E-13},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Cu x unit",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?xucukalph1#mid"}})

(def Value_DeuteronElectronMagneticMomentRatio
  {:db/ident     :constant/Value_DeuteronElectronMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.9E-12,
   :qudt/value   {:xsd/double -4.664345537E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron-electron magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mudsmuem#mid"}})

(def Value_DeuteronElectronMassRatio
  {:db/ident     :constant/Value_DeuteronElectronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.6E-6,
   :qudt/value   {:xsd/double 3670.4829654},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron-electron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mdsme#mid"}})

(def Value_DeuteronGFactor
  {:db/ident     :constant/Value_DeuteronGFactor,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.2E-9,
   :qudt/value   {:xsd/double 0.8574382308},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron g factor",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gdn#mid"}})

(def Value_DeuteronMagneticMoment
  {:db/ident     :constant/Value_DeuteronMagneticMoment,
   :qudt/hasUnit :unit/J-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-34,
   :qudt/value   {:xsd/double 4.33073465E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron magnetic moment",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mud#mid"}})

(def Value_DeuteronMagneticMomentToBohrMagnetonRatio
  {:db/ident     :constant/Value_DeuteronMagneticMomentToBohrMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.9E-12,
   :qudt/value   {:xsd/double 4.669754556E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron magnetic moment to Bohr magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mudsmub#mid"}})

(def Value_DeuteronMagneticMomentToNuclearMagnetonRatio
  {:db/ident     :constant/Value_DeuteronMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.2E-9,
   :qudt/value   {:xsd/double 0.8574382308},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron magnetic moment to nuclear magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mudsmun#mid"}})

(def Value_DeuteronMass
  {:db/ident     :constant/Value_DeuteronMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.7E-34,
   :qudt/value   {:xsd/double 3.3435832E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?md#mid"}})

(def Value_DeuteronMassEnergyEquivalent
  {:db/ident     :constant/Value_DeuteronMassEnergyEquivalent,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.5E-17,
   :qudt/value   {:xsd/double 3.00506272E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron mass energy equivalent",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mdc2#mid"}})

(def Value_DeuteronMassEnergyEquivalentInMeV
  {:db/ident     :constant/Value_DeuteronMassEnergyEquivalentInMeV,
   :qudt/hasUnit :unit/MegaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.7E-5,
   :qudt/value   {:xsd/double 1875.612793},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron mass energy equivalent in MeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mdc2mev#mid"}})

(def Value_DeuteronMassInAtomicMassUnit
  {:db/ident     :constant/Value_DeuteronMassInAtomicMassUnit,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.8E-11,
   :qudt/value   {:xsd/double 2.013553212724},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Deuteron Mass (amu)",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mdu#mid"}})

(def Value_DeuteronMolarMass
  {:db/ident     :constant/Value_DeuteronMolarMass,
   :qudt/hasUnit :unit/KiloGM-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.8E-14,
   :qudt/value   {:xsd/double 0.002013553212724},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron molar mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmd#mid"}})

(def Value_DeuteronNeutronMagneticMomentRatio
  {:db/ident     :constant/Value_DeuteronNeutronMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-7,
   :qudt/value   {:xsd/double -0.44820652},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron-neutron magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mudsmunn#mid"}})

(def Value_DeuteronProtonMagneticMomentRatio
  {:db/ident     :constant/Value_DeuteronProtonMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.4E-9,
   :qudt/value   {:xsd/double 0.307012207},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron-proton magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mudsmup#mid"}})

(def Value_DeuteronProtonMassRatio
  {:db/ident     :constant/Value_DeuteronProtonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.2E-10,
   :qudt/value   {:xsd/double 1.99900750108},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron-proton mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mdsmp#mid"}})

(def Value_DeuteronRmsChargeRadius
  {:db/ident     :constant/Value_DeuteronRmsChargeRadius,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.8E-18,
   :qudt/value   {:xsd/double 2.1402E-15},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron rms charge radius",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?rd#mid"}})

(def Value_ElectricConstant
  {:db/ident     :constant/Value_ElectricConstant,
   :qudt/hasUnit :unit/FARAD-PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 8.854187817E-12},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electric constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?ep0#mid"}})

(def Value_ElectronChargeToMassQuotient
  {:db/ident     :constant/Value_ElectronChargeToMassQuotient,
   :qudt/hasUnit :unit/C-PER-KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4400.0,
   :qudt/value   {:xsd/double -1.75882015E11},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron charge to mass quotient",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?esme#mid"}})

(def Value_ElectronDeuteronMagneticMomentRatio
  {:db/ident     :constant/Value_ElectronDeuteronMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.8E-5,
   :qudt/value   {:xsd/double -2143.923498},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-deuteron magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmud#mid"}})

(def Value_ElectronDeuteronMassRatio
  {:db/ident     :constant/Value_ElectronDeuteronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.2E-13,
   :qudt/value   {:xsd/double 2.7244371093E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-deuteron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mesmd#mid"}})

(def Value_ElectronGFactor
  {:db/ident     :constant/Value_ElectronGFactor,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.5E-13,
   :qudt/value   {:xsd/double -2.00231930436256},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron g factor",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gem#mid"}})

(def Value_ElectronGyromagneticRatio
  {:db/ident     :constant/Value_ElectronGyromagneticRatio,
   :qudt/hasUnit :unit/PER-T-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4400.0,
   :qudt/value   {:xsd/double 1.76085977E11},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron gyromagnetic ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gammae#mid"}})

(def Value_ElectronGyromagneticRatioOver2Pi
  {:db/ident     :constant/Value_ElectronGyromagneticRatioOver2Pi,
   :qudt/hasUnit :unit/MegaHZ-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.0E-4,
   :qudt/value   {:xsd/double 28024.95364},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron gyromagnetic ratio over 2 pi",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gammaebar#mid"}})

(def Value_ElectronMagneticMoment
  {:db/ident     :constant/Value_ElectronMagneticMoment,
   :qudt/hasUnit :unit/J-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-31,
   :qudt/value   {:xsd/double -9.28476377E-24},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron magnetic moment",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muem#mid"}})

(def Value_ElectronMagneticMomentAnomaly
  {:db/ident     :constant/Value_ElectronMagneticMomentAnomaly,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.4E-13,
   :qudt/value   {:xsd/double 0.00115965218111},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron magnetic moment anomaly",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?ae#mid"}})

(def Value_ElectronMagneticMomentToBohrMagnetonRatio
  {:db/ident     :constant/Value_ElectronMagneticMomentToBohrMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.4E-13,
   :qudt/value   {:xsd/double -1.00115965218111},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron magnetic moment to Bohr magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmub#mid"}})

(def Value_ElectronMagneticMomentToNuclearMagnetonRatio
  {:db/ident     :constant/Value_ElectronMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.0E-7,
   :qudt/value   {:xsd/double -1838.28197092},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron magnetic moment to nuclear magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmun#mid"}})

(def Value_ElectronMass
  {:db/ident     :constant/Value_ElectronMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.5E-38,
   :qudt/value   {:xsd/double 9.10938215E-31},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?me#mid"}})

(def Value_ElectronMassEnergyEquivalent
  {:db/ident     :constant/Value_ElectronMassEnergyEquivalent,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.1E-21,
   :qudt/value   {:xsd/double 8.18710438E-14},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron mass energy equivalent",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mec2#mid"}})

(def Value_ElectronMassEnergyEquivalentInMeV
  {:db/ident     :constant/Value_ElectronMassEnergyEquivalentInMeV,
   :qudt/hasUnit :unit/MegaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.3E-8,
   :qudt/value   {:xsd/double 0.51099891},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron mass energy equivalent in MeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mec2mev#mid"}})

(def Value_ElectronMassInAtomicMassUnit
  {:db/ident     :constant/Value_ElectronMassInAtomicMassUnit,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-13,
   :qudt/value   {:xsd/double 5.4857990943E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Electron Mass (amu)",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?meu#mid"}})

(def Value_ElectronMolarMass
  {:db/ident     :constant/Value_ElectronMolarMass,
   :qudt/hasUnit :unit/KiloGM-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-16,
   :qudt/value   {:xsd/double 5.4857990943E-7},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron molar mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mme#mid"}})

(def Value_ElectronMuonMagneticMomentRatio
  {:db/ident     :constant/Value_ElectronMuonMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.2E-6,
   :qudt/value   {:xsd/double 206.7669877},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-muon magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmumum#mid"}})

(def Value_ElectronMuonMassRatio
  {:db/ident     :constant/Value_ElectronMuonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.2E-10,
   :qudt/value   {:xsd/double 0.00483633171},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-muon mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mesmmu#mid"}})

(def Value_ElectronNeutronMagneticMomentRatio
  {:db/ident     :constant/Value_ElectronNeutronMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-4,
   :qudt/value   {:xsd/double 960.9205},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-neutron magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmunn#mid"}})

(def Value_ElectronNeutronMassRatio
  {:db/ident     :constant/Value_ElectronNeutronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.3E-13,
   :qudt/value   {:xsd/double 5.4386734459E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-neutron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mesmn#mid"}})

(def Value_ElectronProtonMagneticMomentRatio
  {:db/ident     :constant/Value_ElectronProtonMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.4E-6,
   :qudt/value   {:xsd/double -658.2106848},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-proton magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmup#mid"}})

(def Value_ElectronProtonMassRatio
  {:db/ident     :constant/Value_ElectronProtonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.4E-13,
   :qudt/value   {:xsd/double 5.4461702177E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-proton mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mesmp#mid"}})

(def Value_ElectronTauMassRatio
  {:db/ident     :constant/Value_ElectronTauMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.7E-8,
   :qudt/value   {:xsd/double 2.87564E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-tau mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mesmtau#mid"}})

(def Value_ElectronToAlphaParticleMassRatio
  {:db/ident     :constant/Value_ElectronToAlphaParticleMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.8E-14,
   :qudt/value   {:xsd/double 1.3709335557E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron to alpha particle mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mesmalpha#mid"}})

(def Value_ElectronToShieldedHelionMagneticMomentRatio
  {:db/ident     :constant/Value_ElectronToShieldedHelionMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.0E-5,
   :qudt/value   {:xsd/double 864.058257},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron to shielded helion magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmuhp#mid"}})

(def Value_ElectronToShieldedProtonMagneticMomentRatio
  {:db/ident     :constant/Value_ElectronToShieldedProtonMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.2E-6,
   :qudt/value   {:xsd/double -658.2275971},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron to shielded proton magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmupp#mid"}})

(def Value_ElectronVoltAtomicMassUnitRelationship
  {:db/ident     :constant/Value_ElectronVoltAtomicMassUnitRelationship,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.7E-17,
   :qudt/value   {:xsd/double 1.073544188E-9},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-atomic mass unit relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?evu#mid"}})

(def Value_ElectronVoltHartreeRelationship
  {:db/ident     :constant/Value_ElectronVoltHartreeRelationship,
   :qudt/hasUnit :unit/E_h,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 9.2E-10,
   :qudt/value   {:xsd/double 0.0367493254},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-hartree relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?evhr#mid"}})

(def Value_ElectronVoltHertzRelationship
  {:db/ident     :constant/Value_ElectronVoltHertzRelationship,
   :qudt/hasUnit :unit/HZ,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6000000.0,
   :qudt/value   {:xsd/double 2.417989454E14},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-hertz relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?evhz#mid"}})

(def Value_ElectronVoltInverseMeterRelationship
  {:db/ident     :constant/Value_ElectronVoltInverseMeterRelationship,
   :qudt/hasUnit :unit/PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 0.02,
   :qudt/value   {:xsd/double 806554.465},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-inverse meter relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?evminv#mid"}})

(def Value_ElectronVoltJouleRelationship
  {:db/ident     :constant/Value_ElectronVoltJouleRelationship,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.0E-27,
   :qudt/value   {:xsd/double 1.602176487E-19},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-joule relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?evj#mid"}})

(def Value_ElectronVoltKelvinRelationship
  {:db/ident     :constant/Value_ElectronVoltKelvinRelationship,
   :qudt/hasUnit :unit/K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 0.02,
   :qudt/value   {:xsd/double 11604.505},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-kelvin relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?evk#mid"}})

(def Value_ElectronVoltKilogramRelationship
  {:db/ident     :constant/Value_ElectronVoltKilogramRelationship,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.4E-44,
   :qudt/value   {:xsd/double 1.782661758E-36},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-kilogram relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?evkg#mid"}})

(def Value_ElementaryCharge
  {:db/ident     :constant/Value_ElementaryCharge,
   :qudt/hasUnit :unit/C,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.0E-27,
   :qudt/value   {:xsd/double 1.602176487E-19},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for elementary charge",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?e#mid"}})

(def Value_ElementaryChargeOverH
  {:db/ident     :constant/Value_ElementaryChargeOverH,
   :qudt/hasUnit :unit/A-PER-J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6000000.0,
   :qudt/value   {:xsd/double 2.417989454E14},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for elementary charge over h",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?esh#mid"}})

(def Value_FaradayConstant
  {:db/ident     :constant/Value_FaradayConstant,
   :qudt/hasUnit :unit/C-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 0.0024,
   :qudt/value   {:xsd/double 96485.3399},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Faraday constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?f#mid"}})

(def Value_FaradayConstantForConventionalElectricCurrent
  {:db/ident     :constant/Value_FaradayConstantForConventionalElectricCurrent,
   :qudt/hasUnit :unit/C-PER-MOL,
   :qudt/value   {:xsd/double 96485.33212},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Faraday constant for conventional electric current",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?f90#mid"}})

(def Value_FermiCouplingConstant
  {:db/ident     :constant/Value_FermiCouplingConstant,
   :qudt/hasUnit :unit/PER-GigaEV2,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.0E-10,
   :qudt/value   {:xsd/double 1.16637E-5},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Fermi coupling constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gf#mid"}})

(def Value_FineStructureConstant
  {:db/ident     :constant/Value_FineStructureConstant,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.0E-12,
   :qudt/value   {:xsd/double 0.0072973525376},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for fine-structure constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?alph#mid"}})

(def Value_FirstRadiationConstant
  {:db/ident     :constant/Value_FirstRadiationConstant,
   :qudt/hasUnit :unit/W-M2,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.9E-23,
   :qudt/value   {:xsd/double 3.74177118E-16},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for first radiation constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?c11strc#mid"}})

(def Value_FirstRadiationConstantForSpectralRadiance
  {:db/ident     :constant/Value_FirstRadiationConstantForSpectralRadiance,
   :qudt/hasUnit :unit/W-M2-PER-SR,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.9E-24,
   :qudt/value   {:xsd/double 1.191042759E-16},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for first radiation constant for spectral radiance",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?c1l#mid"}})

(def Value_GravitationalConstant
  {:db/ident     :constant/Value_GravitationalConstant,
   :qudt/hasUnit :unit/N-M2-PER-KiloGM2,
   :qudt/informativeReference
   {:xsd/anyURI "https://en.wikipedia.org/wiki/Gravitational_constant"},
   :qudt/value   {:xsd/double 6.674E-11},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for gravitational constant"})

(def Value_HartreeAtomicMassUnitRelationship
  {:db/ident     :constant/Value_HartreeAtomicMassUnitRelationship,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.2E-17,
   :qudt/value   {:xsd/double 2.9212622986E-8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-atomic mass unit relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hru#mid"}})

(def Value_HartreeElectronVoltRelationship
  {:db/ident     :constant/Value_HartreeElectronVoltRelationship,
   :qudt/hasUnit :unit/EV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.8E-7,
   :qudt/value   {:xsd/double 27.21138386},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-electron volt relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hrev#mid"}})

(def Value_HartreeEnergy
  {:db/ident     :constant/Value_HartreeEnergy,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.2E-25,
   :qudt/value   {:xsd/double 4.35974394E-18},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Hartree energy",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hr#mid"}})

(def Value_HartreeEnergyInEV
  {:db/ident     :constant/Value_HartreeEnergyInEV,
   :qudt/hasUnit :unit/EV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.8E-7,
   :qudt/value   {:xsd/double 27.21138386},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Hartree energy in eV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?threv#mid"}})

(def Value_HartreeHertzRelationship
  {:db/ident     :constant/Value_HartreeHertzRelationship,
   :qudt/hasUnit :unit/HZ,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 44000.0,
   :qudt/value   {:xsd/double 6.579683920722E15},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-hertz relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hrhz#mid"}})

(def Value_HartreeInverseMeterRelationship
  {:db/ident     :constant/Value_HartreeInverseMeterRelationship,
   :qudt/hasUnit :unit/PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.5E-4,
   :qudt/value   {:xsd/double 2.194746313705E7},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-inverse meter relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hrminv#mid"}})

(def Value_HartreeJouleRelationship
  {:db/ident     :constant/Value_HartreeJouleRelationship,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.2E-25,
   :qudt/value   {:xsd/double 4.35974394E-18},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-joule relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hrj#mid"}})

(def Value_HartreeKelvinRelationship
  {:db/ident     :constant/Value_HartreeKelvinRelationship,
   :qudt/hasUnit :unit/K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 0.55,
   :qudt/value   {:xsd/double 315774.65},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-kelvin relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hrk#mid"}})

(def Value_HartreeKilogramRelationship
  {:db/ident     :constant/Value_HartreeKilogramRelationship,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.4E-42,
   :qudt/value   {:xsd/double 4.85086934E-35},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-kilogram relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hrkg#mid"}})

(def Value_HelionElectronMassRatio
  {:db/ident     :constant/Value_HelionElectronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.2E-6,
   :qudt/value   {:xsd/double 5495.8852765},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion-electron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mhsme#mid"}})

(def Value_HelionMass
  {:db/ident     :constant/Value_HelionMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.5E-34,
   :qudt/value   {:xsd/double 5.00641192E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mh#mid"}})

(def Value_HelionMassEnergyEquivalent
  {:db/ident     :constant/Value_HelionMassEnergyEquivalent,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.2E-17,
   :qudt/value   {:xsd/double 4.49953864E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion mass energy equivalent",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mhc2#mid"}})

(def Value_HelionMassEnergyEquivalentInMeV
  {:db/ident     :constant/Value_HelionMassEnergyEquivalentInMeV,
   :qudt/hasUnit :unit/MegaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.0E-5,
   :qudt/value   {:xsd/double 2808.391383},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion mass energy equivalent in MeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mhc2mev#mid"}})

(def Value_HelionMassInAtomicMassUnit
  {:db/ident     :constant/Value_HelionMassInAtomicMassUnit,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.6E-9,
   :qudt/value   {:xsd/double 3.0149322473},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Helion Mass (amu)",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mhu#mid"}})

(def Value_HelionMolarMass
  {:db/ident     :constant/Value_HelionMolarMass,
   :qudt/hasUnit :unit/KiloGM-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.6E-12,
   :qudt/value   {:xsd/double 0.0030149322473},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion molar mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmh#mid"}})

(def Value_HelionProtonMassRatio
  {:db/ident     :constant/Value_HelionProtonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.6E-9,
   :qudt/value   {:xsd/double 2.9931526713},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion-proton mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mhsmp#mid"}})

(def Value_HertzAtomicMassUnitRelationship
  {:db/ident     :constant/Value_HertzAtomicMassUnitRelationship,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.4E-33,
   :qudt/value   {:xsd/double 4.4398216294E-24},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-atomic mass unit relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hzu#mid"}})

(def Value_HertzElectronVoltRelationship
  {:db/ident     :constant/Value_HertzElectronVoltRelationship,
   :qudt/hasUnit :unit/EV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.0E-22,
   :qudt/value   {:xsd/double 4.13566733E-15},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-electron volt relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hzev#mid"}})

(def Value_HertzHartreeRelationship
  {:db/ident     :constant/Value_HertzHartreeRelationship,
   :qudt/hasUnit :unit/E_h,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.0E-12,
   :qudt/value   {:xsd/double 1.519829846006E-16},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-hartree relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hzhr#mid"}})

(def Value_HertzInverseMeterRelationship
  {:db/ident     :constant/Value_HertzInverseMeterRelationship,
   :qudt/hasUnit :unit/PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 3.335640951E-9},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-inverse meter relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hzminv#mid"}})

(def Value_HertzJouleRelationship
  {:db/ident     :constant/Value_HertzJouleRelationship,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.3E-41,
   :qudt/value   {:xsd/double 6.62606896E-34},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-joule relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hzj#mid"}})

(def Value_HertzKelvinRelationship
  {:db/ident     :constant/Value_HertzKelvinRelationship,
   :qudt/hasUnit :unit/K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.4E-17,
   :qudt/value   {:xsd/double 4.7992374E-11},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-kelvin relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hzk#mid"}})

(def Value_HertzKilogramRelationship
  {:db/ident     :constant/Value_HertzKilogramRelationship,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.7E-58,
   :qudt/value   {:xsd/double 7.372496E-51},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-kilogram relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hzkg#mid"}})

(def Value_InverseFineStructureConstant
  {:db/ident     :constant/Value_InverseFineStructureConstant,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 9.4E-8,
   :qudt/value   {:xsd/double 137.035999679},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse fine-structure constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?alphinv#mid"}})

(def Value_InverseMeterAtomicMassUnitRelationship
  {:db/ident     :constant/Value_InverseMeterAtomicMassUnitRelationship,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.9E-24,
   :qudt/value   {:xsd/double 1.3310250394E-15},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-atomic mass unit relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?minvu#mid"}})

(def Value_InverseMeterElectronVoltRelationship
  {:db/ident     :constant/Value_InverseMeterElectronVoltRelationship,
   :qudt/hasUnit :unit/EV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.1E-14,
   :qudt/value   {:xsd/double 1.239841875E-6},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-electron volt relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?minvev#mid"}})

(def Value_InverseMeterHartreeRelationship
  {:db/ident     :constant/Value_InverseMeterHartreeRelationship,
   :qudt/hasUnit :unit/E_h,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.0E-19,
   :qudt/value   {:xsd/double 4.55633525276E-8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-hartree relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?minvhr#mid"}})

(def Value_InverseMeterHertzRelationship
  {:db/ident     :constant/Value_InverseMeterHertzRelationship,
   :qudt/hasUnit :unit/HZ,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 2.99792458E8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-hertz relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?minvhz#mid"}})

(def Value_InverseMeterJouleRelationship
  {:db/ident     :constant/Value_InverseMeterJouleRelationship,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 9.9E-33,
   :qudt/value   {:xsd/double 1.986445501E-25},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-joule relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?minvj#mid"}})

(def Value_InverseMeterKelvinRelationship
  {:db/ident     :constant/Value_InverseMeterKelvinRelationship,
   :qudt/hasUnit :unit/K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.5E-8,
   :qudt/value   {:xsd/double 0.014387752},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-kelvin relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?minvk#mid"}})

(def Value_InverseMeterKilogramRelationship
  {:db/ident     :constant/Value_InverseMeterKilogramRelationship,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-49,
   :qudt/value   {:xsd/double 2.2102187E-42},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-kilogram relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?minvkg#mid"}})

(def Value_InverseOfConductanceQuantum
  {:db/ident     :constant/Value_InverseOfConductanceQuantum,
   :qudt/hasUnit :unit/OHM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.8E-6,
   :qudt/value   {:xsd/double 12906.4037787},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse of conductance quantum",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?invconqu#mid"}})

(def Value_JosephsonConstant
  {:db/ident     :constant/Value_JosephsonConstant,
   :qudt/hasUnit :unit/HZ-PER-V,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.2E7,
   :qudt/value   {:xsd/double 4.83597891E14},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Josephson constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kjos#mid"}})

(def Value_JouleAtomicMassUnitRelationship
  {:db/ident     :constant/Value_JouleAtomicMassUnitRelationship,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 330.0,
   :qudt/value   {:xsd/double 6.70053641E9},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-atomic mass unit relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?ju#mid"}})

(def Value_JouleElectronVoltRelationship
  {:db/ident     :constant/Value_JouleElectronVoltRelationship,
   :qudt/hasUnit :unit/EV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.6E11,
   :qudt/value   {:xsd/double 6.24150965E18},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-electron volt relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?jev#mid"}})

(def Value_JouleHartreeRelationship
  {:db/ident     :constant/Value_JouleHartreeRelationship,
   :qudt/hasUnit :unit/E_h,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E10,
   :qudt/value   {:xsd/double 2.29371269E17},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-hartree relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?jhr#mid"}})

(def Value_JouleHertzRelationship
  {:db/ident     :constant/Value_JouleHertzRelationship,
   :qudt/hasUnit :unit/HZ,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.5E25,
   :qudt/value   {:xsd/double 1.50919045E33},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-hertz relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?jhz#mid"}})

(def Value_JouleInverseMeterRelationship
  {:db/ident     :constant/Value_JouleInverseMeterRelationship,
   :qudt/hasUnit :unit/PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.5E17,
   :qudt/value   {:xsd/double 5.03411747E24},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-inverse meter relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?jminv#mid"}})

(def Value_JouleKelvinRelationship
  {:db/ident     :constant/Value_JouleKelvinRelationship,
   :qudt/hasUnit :unit/K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.3E17,
   :qudt/value   {:xsd/double 7.242963E22},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-kelvin relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?jk#mid"}})

(def Value_JouleKilogramRelationship
  {:db/ident     :constant/Value_JouleKilogramRelationship,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 1.112650056E-17},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-kilogram relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?jkg#mid"}})

(def Value_KelvinAtomicMassUnitRelationship
  {:db/ident     :constant/Value_KelvinAtomicMassUnitRelationship,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.6E-19,
   :qudt/value   {:xsd/double 9.251098E-14},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-atomic mass unit relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?ku#mid"}})

(def Value_KelvinElectronVoltRelationship
  {:db/ident     :constant/Value_KelvinElectronVoltRelationship,
   :qudt/hasUnit :unit/EV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.5E-10,
   :qudt/value   {:xsd/double 8.617343E-5},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-electron volt relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kev#mid"}})

(def Value_KelvinHartreeRelationship
  {:db/ident     :constant/Value_KelvinHartreeRelationship,
   :qudt/hasUnit :unit/E_h,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.5E-12,
   :qudt/value   {:xsd/double 3.1668153E-6},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-hartree relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?khr#mid"}})

(def Value_KelvinHertzRelationship
  {:db/ident     :constant/Value_KelvinHertzRelationship,
   :qudt/hasUnit :unit/HZ,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 36000.0,
   :qudt/value   {:xsd/double 2.0836644E10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-hertz relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?khz#mid"}})

(def Value_KelvinInverseMeterRelationship
  {:db/ident     :constant/Value_KelvinInverseMeterRelationship,
   :qudt/hasUnit :unit/PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.2E-4,
   :qudt/value   {:xsd/double 69.50356},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-inverse meter relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kminv#mid"}})

(def Value_KelvinJouleRelationship
  {:db/ident     :constant/Value_KelvinJouleRelationship,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.4E-29,
   :qudt/value   {:xsd/double 1.3806504E-23},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-joule relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kj#mid"}})

(def Value_KelvinKilogramRelationship
  {:db/ident     :constant/Value_KelvinKilogramRelationship,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.7E-46,
   :qudt/value   {:xsd/double 1.5361807E-40},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-kilogram relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kkg#mid"}})

(def Value_KilogramAtomicMassUnitRelationship
  {:db/ident     :constant/Value_KilogramAtomicMassUnitRelationship,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.0E19,
   :qudt/value   {:xsd/double 6.02214179E26},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-atomic mass unit relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kgu#mid"}})

(def Value_KilogramElectronVoltRelationship
  {:db/ident     :constant/Value_KilogramElectronVoltRelationship,
   :qudt/hasUnit :unit/EV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.4E28,
   :qudt/value   {:xsd/double 5.60958912E35},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-electron volt relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kgev#mid"}})

(def Value_KilogramHartreeRelationship
  {:db/ident     :constant/Value_KilogramHartreeRelationship,
   :qudt/hasUnit :unit/E_h,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.0E27,
   :qudt/value   {:xsd/double 2.06148616E34},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-hartree relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kghr#mid"}})

(def Value_KilogramHertzRelationship
  {:db/ident     :constant/Value_KilogramHertzRelationship,
   :qudt/hasUnit :unit/HZ,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.8E42,
   :qudt/value   {:xsd/double 1.356392733E50},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-hertz relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kghz#mid"}})

(def Value_KilogramInverseMeterRelationship
  {:db/ident     :constant/Value_KilogramInverseMeterRelationship,
   :qudt/hasUnit :unit/PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E34,
   :qudt/value   {:xsd/double 4.52443915E41},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-inverse meter relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kgminv#mid"}})

(def Value_KilogramJouleRelationship
  {:db/ident     :constant/Value_KilogramJouleRelationship,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 8.987551787E16},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-joule relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kgj#mid"}})

(def Value_KilogramKelvinRelationship
  {:db/ident     :constant/Value_KilogramKelvinRelationship,
   :qudt/hasUnit :unit/K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E34,
   :qudt/value   {:xsd/double 6.509651E39},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-kelvin relationship",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?kgk#mid"}})

(def Value_LatticeParameterOfSilicon
  {:db/ident     :constant/Value_LatticeParameterOfSilicon,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.4E-17,
   :qudt/value   {:xsd/double 5.43102064E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for lattice parameter of silicon",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?asil#mid"}})

(def Value_LatticeSpacingOfSilicon
  {:db/ident     :constant/Value_LatticeSpacingOfSilicon,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.0E-18,
   :qudt/value   {:xsd/double 1.920155762E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for lattice spacing of silicon",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?d220sil#mid"}})

(def Value_LoschmidtConstant
  {:db/ident     :constant/Value_LoschmidtConstant,
   :qudt/hasUnit :unit/PER-M3,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.7E19,
   :qudt/value   {:xsd/double 2.6867774E25},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Loschmidt constant 273.15 K 101.325 kPa",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?n0#mid"}})

(def Value_MagneticConstant
  {:db/ident     :constant/Value_MagneticConstant,
   :qudt/hasUnit :unit/FARAD-PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 1.2566370614E-6},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for magnetic constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mu0#mid"}})

(def Value_MagneticFluxQuantum
  {:db/ident     :constant/Value_MagneticFluxQuantum,
   :qudt/hasUnit :unit/WB,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.2E-23,
   :qudt/value   {:xsd/double 2.067833667E-15},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for magnetic flux quantum",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?flxquhs2e#mid"}})

(def Value_MoXUnit
  {:db/ident     :constant/Value_MoXUnit,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.3E-20,
   :qudt/value   {:xsd/double 1.00209955E-13},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Mo x unit",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?xumokalph1#mid"}})

(def Value_MolarGasConstant
  {:db/ident     :constant/Value_MolarGasConstant,
   :qudt/hasUnit :unit/J-PER-MOL-K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.5E-5,
   :qudt/value   {:xsd/double 8.31446261815324},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar gas constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?r#mid"}})

(def Value_MolarMassConstant
  {:db/ident     :constant/Value_MolarMassConstant,
   :qudt/hasUnit :unit/KiloGM-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 0.001},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar mass constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mu#mid"}})

(def Value_MolarMassOfCarbon12
  {:db/ident     :constant/Value_MolarMassOfCarbon12,
   :qudt/hasUnit :unit/KiloGM-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 0.012},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar mass of carbon-12",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mm12c#mid"}})

(def Value_MolarPlanckConstant
  {:db/ident     :constant/Value_MolarPlanckConstant,
   :qudt/hasUnit :unit/J-SEC-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.7E-19,
   :qudt/value   {:xsd/double 3.9903126821E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar Planck constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?nah#mid"}})

(def Value_MolarPlanckConstantTimesC
  {:db/ident     :constant/Value_MolarPlanckConstantTimesC,
   :qudt/hasUnit :unit/J-M-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.7E-10,
   :qudt/value   {:xsd/double 0.11962656472},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar Planck constant times c",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?nahc#mid"}})

(def Value_MolarVolumeOfIdealGas
  {:db/ident     :constant/Value_MolarVolumeOfIdealGas,
   :qudt/hasUnit :unit/M3-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.9E-8,
   :qudt/value   {:xsd/double 0.022710981},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar volume of ideal gas 273.15 K 101.325 kPa",
   :vaem/website #{{:xsd/anyURI
                    "http://physics.nist.gov/cgi-bin/cuu/Value?mvol#mid"}
                   {:xsd/anyURI
                    "http://physics.nist.gov/cgi-bin/cuu/Value?mvolstd#mid"}}})

(def Value_MolarVolumeOfSilicon
  {:db/ident     :constant/Value_MolarVolumeOfSilicon,
   :qudt/hasUnit :unit/M3-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-12,
   :qudt/value   {:xsd/double 1.20588349E-5},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar volume of silicon",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mvolsil#mid"}})

(def Value_MuonComptonWavelength
  {:db/ident     :constant/Value_MuonComptonWavelength,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.0E-22,
   :qudt/value   {:xsd/double 1.173444104E-14},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon Compton wavelength",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mcomwl#mid"}})

(def Value_MuonComptonWavelengthOver2Pi
  {:db/ident     :constant/Value_MuonComptonWavelengthOver2Pi,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.7E-23,
   :qudt/value   {:xsd/double 1.867594295E-15},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon Compton wavelength over 2 pi",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mcomwlbar#mid"}})

(def Value_MuonElectronMassRatio
  {:db/ident     :constant/Value_MuonElectronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.2E-6,
   :qudt/value   {:xsd/double 206.7682823},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon-electron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmusme#mid"}})

(def Value_MuonGFactor
  {:db/ident     :constant/Value_MuonGFactor,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.2E-9,
   :qudt/value   {:xsd/double -2.0023318414},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon g factor",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gmum#mid"}})

(def Value_MuonMagneticMoment
  {:db/ident     :constant/Value_MuonMagneticMoment,
   :qudt/hasUnit :unit/J-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.6E-33,
   :qudt/value   {:xsd/double -4.49044786E-26},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon magnetic moment",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mumum#mid"}})

(def Value_MuonMagneticMomentAnomaly
  {:db/ident     :constant/Value_MuonMagneticMomentAnomaly,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.0E-10,
   :qudt/value   {:xsd/double 0.00116592069},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon magnetic moment anomaly",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?amu#mid"}})

(def Value_MuonMagneticMomentToBohrMagnetonRatio
  {:db/ident     :constant/Value_MuonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.2E-10,
   :qudt/value   {:xsd/double -0.00484197049},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon magnetic moment to Bohr magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mumumsmub#mid"}})

(def Value_MuonMagneticMomentToNuclearMagnetonRatio
  {:db/ident     :constant/Value_MuonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-7,
   :qudt/value   {:xsd/double -8.89059705},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon magnetic moment to nuclear magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mumumsmun#mid"}})

(def Value_MuonMass
  {:db/ident     :constant/Value_MuonMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-35,
   :qudt/value   {:xsd/double 1.8835313E-28},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmu#mid"}})

(def Value_MuonMassEnergyEquivalent
  {:db/ident     :constant/Value_MuonMassEnergyEquivalent,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 9.5E-19,
   :qudt/value   {:xsd/double 1.69283351E-11},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon mass energy equivalent",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmuc2#mid"}})

(def Value_MuonMassEnergyEquivalentInMeV
  {:db/ident     :constant/Value_MuonMassEnergyEquivalentInMeV,
   :qudt/hasUnit :unit/MegaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.8E-6,
   :qudt/value   {:xsd/double 105.6583668},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon mass energy equivalent in MeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmuc2mev#mid"}})

(def Value_MuonMassInAtomicMassUnit
  {:db/ident     :constant/Value_MuonMassInAtomicMassUnit,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.9E-9,
   :qudt/value   {:xsd/double 0.1134289256},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Muon Mass (amu)",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmuu#mid"}})

(def Value_MuonMolarMass
  {:db/ident     :constant/Value_MuonMolarMass,
   :qudt/hasUnit :unit/KiloGM-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.9E-12,
   :qudt/value   {:xsd/double 1.134289256E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon molar mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmmu#mid"}})

(def Value_MuonNeutronMassRatio
  {:db/ident     :constant/Value_MuonNeutronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.9E-9,
   :qudt/value   {:xsd/double 0.1124545167},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon-neutron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmusmn#mid"}})

(def Value_MuonProtonMagneticMomentRatio
  {:db/ident     :constant/Value_MuonProtonMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.5E-8,
   :qudt/value   {:xsd/double -3.183345137},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon-proton magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mumumsmup#mid"}})

(def Value_MuonProtonMassRatio
  {:db/ident     :constant/Value_MuonProtonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.9E-9,
   :qudt/value   {:xsd/double 0.1126095261},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon-proton mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmusmp#mid"}})

(def Value_MuonTauMassRatio
  {:db/ident     :constant/Value_MuonTauMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 9.7E-6,
   :qudt/value   {:xsd/double 0.0594592},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon-tau mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmusmtau#mid"}})

(def Value_NaturalUnitOfAction
  {:db/ident     :constant/Value_NaturalUnitOfAction,
   :qudt/hasUnit :unit/J-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.3E-42,
   :qudt/value   {:xsd/double 1.054571628E-34},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of action",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?thbar#mid"}})

(def Value_NaturalUnitOfActionInEVS
  {:db/ident     :constant/Value_NaturalUnitOfActionInEVS,
   :qudt/hasUnit :unit/EV-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.6E-23,
   :qudt/value   {:xsd/double 6.58211899E-16},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of action in eV s",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?thbarev#mid"}})

(def Value_NaturalUnitOfEnergy
  {:db/ident     :constant/Value_NaturalUnitOfEnergy,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.1E-21,
   :qudt/value   {:xsd/double 8.18710438E-14},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of energy",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tmec2#mid"}})

(def Value_NaturalUnitOfEnergyInMeV
  {:db/ident     :constant/Value_NaturalUnitOfEnergyInMeV,
   :qudt/hasUnit :unit/MegaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.3E-8,
   :qudt/value   {:xsd/double 0.51099891},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of energy in MeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tmec2mev#mid"}})

(def Value_NaturalUnitOfLength
  {:db/ident     :constant/Value_NaturalUnitOfLength,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.3E-22,
   :qudt/value   {:xsd/double 3.8615926459E-13},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of length",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tecomwlbar#mid"}})

(def Value_NaturalUnitOfMass
  {:db/ident     :constant/Value_NaturalUnitOfMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.5E-38,
   :qudt/value   {:xsd/double 9.10938215E-31},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tme#mid"}})

(def Value_NaturalUnitOfMomentum
  {:db/ident     :constant/Value_NaturalUnitOfMomentum,
   :qudt/hasUnit :unit/KiloGM-M-PER-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.4E-29,
   :qudt/value   {:xsd/double 2.73092406E-22},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of momentum",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mec#mid"}})

(def Value_NaturalUnitOfMomentumInMeVPerC
  {:db/ident     :constant/Value_NaturalUnitOfMomentumInMeVPerC,
   :qudt/hasUnit :unit/MegaEV-PER-SpeedOfLight,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.3E-8,
   :qudt/value   {:xsd/double 0.51099891},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of momentum in MeV c^-1",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mecmevsc#mid"}})

(def Value_NaturalUnitOfTime
  {:db/ident     :constant/Value_NaturalUnitOfTime,
   :qudt/hasUnit :unit/SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.8E-30,
   :qudt/value   {:xsd/double 1.288088657E-21},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of time",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?nut#mid"}})

(def Value_NaturalUnitOfVelocity
  {:db/ident     :constant/Value_NaturalUnitOfVelocity,
   :qudt/hasUnit :unit/M-PER-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 2.99792458E8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of velocity",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tc#mid"}})

(def Value_NeutronComptonWavelength
  {:db/ident     :constant/Value_NeutronComptonWavelength,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.0E-24,
   :qudt/value   {:xsd/double 1.3195908951E-15},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron Compton wavelength",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?ncomwl#mid"}})

(def Value_NeutronComptonWavelengthOver2Pi
  {:db/ident     :constant/Value_NeutronComptonWavelengthOver2Pi,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.1E-25,
   :qudt/value   {:xsd/double 2.1001941382E-16},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron Compton wavelength over 2 pi",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?ncomwlbar#mid"}})

(def Value_NeutronElectronMagneticMomentRatio
  {:db/ident     :constant/Value_NeutronElectronMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.5E-10,
   :qudt/value   {:xsd/double 0.00104066882},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-electron magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?munsmue#mid"}})

(def Value_NeutronElectronMassRatio
  {:db/ident     :constant/Value_NeutronElectronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-6,
   :qudt/value   {:xsd/double 1838.6836605},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-electron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mnsme#mid"}})

(def Value_NeutronGFactor
  {:db/ident     :constant/Value_NeutronGFactor,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 9.0E-7,
   :qudt/value   {:xsd/double -3.82608545},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron g factor",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gnn#mid"}})

(def Value_NeutronGyromagneticRatio
  {:db/ident     :constant/Value_NeutronGyromagneticRatio,
   :qudt/hasUnit :unit/PER-T-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 43.0,
   :qudt/value   {:xsd/double 1.83247185E8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron gyromagnetic ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gamman#mid"}})

(def Value_NeutronGyromagneticRatioOver2Pi
  {:db/ident     :constant/Value_NeutronGyromagneticRatioOver2Pi,
   :qudt/hasUnit :unit/MegaHZ-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.9E-6,
   :qudt/value   {:xsd/double 29.1646954},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron gyromagnetic ratio over 2 pi",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gammanbar#mid"}})

(def Value_NeutronMagneticMoment
  {:db/ident     :constant/Value_NeutronMagneticMoment,
   :qudt/hasUnit :unit/J-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-33,
   :qudt/value   {:xsd/double -9.6623641E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron magnetic moment",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?munn#mid"}})

(def Value_NeutronMagneticMomentToBohrMagnetonRatio
  {:db/ident     :constant/Value_NeutronMagneticMomentToBohrMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.5E-10,
   :qudt/value   {:xsd/double -0.00104187563},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron magnetic moment to Bohr magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?munsmub#mid"}})

(def Value_NeutronMagneticMomentToNuclearMagnetonRatio
  {:db/ident     :constant/Value_NeutronMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.5E-7,
   :qudt/value   {:xsd/double -1.91304273},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron magnetic moment to nuclear magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?munsmun#mid"}})

(def Value_NeutronMass
  {:db/ident     :constant/Value_NeutronMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.4E-35,
   :qudt/value   {:xsd/double 1.674927211E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mn#mid"}})

(def Value_NeutronMassEnergyEquivalent
  {:db/ident     :constant/Value_NeutronMassEnergyEquivalent,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.5E-18,
   :qudt/value   {:xsd/double 1.505349505E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron mass energy equivalent",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mnc2#mid"}})

(def Value_NeutronMassEnergyEquivalentInMeV
  {:db/ident     :constant/Value_NeutronMassEnergyEquivalentInMeV,
   :qudt/hasUnit :unit/MegaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-5,
   :qudt/value   {:xsd/double 939.565346},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron mass energy equivalent in MeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mnc2mev#mid"}})

(def Value_NeutronMassInAtomicMassUnit
  {:db/ident     :constant/Value_NeutronMassInAtomicMassUnit,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.3E-10,
   :qudt/value   {:xsd/double 1.00866491597},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Neutron Mass (amu)",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mnu#mid"}})

(def Value_NeutronMolarMass
  {:db/ident     :constant/Value_NeutronMolarMass,
   :qudt/hasUnit :unit/KiloGM-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.3E-13,
   :qudt/value   {:xsd/double 0.00100866491597},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron molar mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmn#mid"}})

(def Value_NeutronMuonMassRatio
  {:db/ident     :constant/Value_NeutronMuonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-7,
   :qudt/value   {:xsd/double 8.89248409},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-muon mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mnsmmu#mid"}})

(def Value_NeutronProtonMagneticMomentRatio
  {:db/ident     :constant/Value_NeutronProtonMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.6E-7,
   :qudt/value   {:xsd/double -0.68497934},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-proton magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?munsmup#mid"}})

(def Value_NeutronProtonMassRatio
  {:db/ident     :constant/Value_NeutronProtonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.6E-10,
   :qudt/value   {:xsd/double 1.00137841918},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-proton mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mnsmp#mid"}})

(def Value_NeutronTauMassRatio
  {:db/ident     :constant/Value_NeutronTauMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.6E-5,
   :qudt/value   {:xsd/double 0.52874},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-tau mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mnsmtau#mid"}})

(def Value_NeutronToShieldedProtonMagneticMomentRatio
  {:db/ident     :constant/Value_NeutronToShieldedProtonMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.6E-7,
   :qudt/value   {:xsd/double -0.68499694},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron to shielded proton magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?munsmupp#mid"}})

(def Value_NewtonianConstantOfGravitation
  {:db/ident :constant/Value_NewtonianConstantOfGravitation,
   :qudt/hasUnit :unit/M3-PER-KiloGM-SEC2,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/relativeStandardUncertainty 2.2E-5,
   :qudt/standardUncertainty 1.5E-15,
   :qudt/value {:xsd/double 6.6743E-11},
   :rdf/type :qudt/ConstantValue,
   :rdfs/label "Value for Newtonian constant of gravitation",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?bg#mid"}})

(def Value_NewtonianConstantOfGravitationOverHbarC
  {:db/ident     :constant/Value_NewtonianConstantOfGravitationOverHbarC,
   :qudt/hasUnit :unit/PER-PlanckMass2,
   :qudt/relativeStandardUncertainty 2.2E-5,
   :qudt/standardUncertainty 1.5E-43,
   :qudt/value   {:xsd/double 6.70883E-39},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Newtonian constant of gravitation over hbar c",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?bgspu#mid"}})

(def Value_NuclearMagneton
  {:db/ident     :constant/Value_NuclearMagneton,
   :qudt/hasUnit :unit/J-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.3E-34,
   :qudt/value   {:xsd/double 5.05078324E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for nuclear magneton",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mun#mid"}})

(def Value_NuclearMagnetonInEVPerT
  {:db/ident     :constant/Value_NuclearMagnetonInEVPerT,
   :qudt/hasUnit :unit/EV-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.5E-17,
   :qudt/value   {:xsd/double 3.1524512326E-8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for nuclear magneton in eV per T",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?munev#mid"}})

(def Value_NuclearMagnetonInInverseMetersPerTesla
  {:db/ident     :constant/Value_NuclearMagnetonInInverseMetersPerTesla,
   :qudt/hasUnit :unit/PER-T-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.4E-10,
   :qudt/value   {:xsd/double 0.02542623616},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for nuclear magneton in inverse meters per tesla",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?munshcminv#mid"}})

(def Value_NuclearMagnetonInKPerT
  {:db/ident     :constant/Value_NuclearMagnetonInKPerT,
   :qudt/hasUnit :unit/K-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.4E-10,
   :qudt/value   {:xsd/double 3.6582637E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for nuclear magneton in K per T",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?munskk#mid"}})

(def Value_NuclearMagnetonInMHzPerT
  {:db/ident     :constant/Value_NuclearMagnetonInMHzPerT,
   :qudt/hasUnit :unit/MegaHZ-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.9E-7,
   :qudt/value   {:xsd/double 7.62259384},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for nuclear magneton in MHz per T",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?munshhz#mid"}})

(def Value_PermittivityOfVacuum
  {:db/ident     :constant/Value_PermittivityOfVacuum,
   :qudt/hasUnit :unit/FARAD-PER-M,
   :qudt/relativeStandardUncertainty 1.5E-10,
   :qudt/value   {:xsd/double 6.8541878128E-12},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for permittivity of vacuum"})

(def Value_Pi
  {:db/ident     :constant/Value_Pi,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference {:xsd/anyURI "https://en.wikipedia.org/wiki/Pi"},
   :qudt/standardUncertainty 0.0,
   :qudt/value   {:xsd/decimal 3.141592653589793238462643383279502884197M},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Pi"})

(def Value_PlanckConstant
  {:db/ident     :constant/Value_PlanckConstant,
   :qudt/hasUnit :unit/J-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.3E-41,
   :qudt/value   {:xsd/double 6.62606896E-34},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?h#mid"}})

(def Value_PlanckConstantInEVS
  {:db/ident     :constant/Value_PlanckConstantInEVS,
   :qudt/hasUnit :unit/EV-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.0E-22,
   :qudt/value   {:xsd/double 4.13566733E-15},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck constant in eV s",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hev#mid"}})

(def Value_PlanckConstantOver2Pi
  {:db/ident     :constant/Value_PlanckConstantOver2Pi,
   :qudt/hasUnit :unit/J-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.3E-42,
   :qudt/value   {:xsd/double 1.054571628E-34},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck constant over 2 pi",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hbar#mid"}})

(def Value_PlanckConstantOver2PiInEVS
  {:db/ident     :constant/Value_PlanckConstantOver2PiInEVS,
   :qudt/hasUnit :unit/EV-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.6E-23,
   :qudt/value   {:xsd/double 6.58211899E-16},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck constant over 2 pi in eV s",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hbarev#mid"}})

(def Value_PlanckConstantOver2PiTimesCInMeVFm
  {:db/ident     :constant/Value_PlanckConstantOver2PiTimesCInMeVFm,
   :qudt/hasUnit :unit/MegaEV-FemtoM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.9E-6,
   :qudt/value   {:xsd/double 197.3269631},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck constant over 2 pi times c in MeV fm",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hbcmevf#mid"}})

(def Value_PlanckLength
  {:db/ident     :constant/Value_PlanckLength,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.1E-40,
   :qudt/value   {:xsd/double 1.616252E-35},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck length",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?plkl#mid"}})

(def Value_PlanckMass
  {:db/ident     :constant/Value_PlanckMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-12,
   :qudt/value   {:xsd/double 2.17644E-8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?plkm#mid"}})

(def Value_PlanckMassEnergyEquivalentInGeV
  {:db/ident     :constant/Value_PlanckMassEnergyEquivalentInGeV,
   :qudt/hasUnit :unit/GigaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.1E14,
   :qudt/value   {:xsd/double 1.220892E19},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck mass energy equivalent in GeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?plkmc2gev#mid"}})

(def Value_PlanckTemperature
  {:db/ident     :constant/Value_PlanckTemperature,
   :qudt/hasUnit :unit/K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.1E27,
   :qudt/value   {:xsd/double 1.416785E32},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck temperature",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?plktmp#mid"}})

(def Value_PlanckTime
  {:db/ident     :constant/Value_PlanckTime,
   :qudt/hasUnit :unit/SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.7E-48,
   :qudt/value   {:xsd/double 5.39124E-44},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck time",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?plkt#mid"}})

(def Value_ProtonChargeToMassQuotient
  {:db/ident     :constant/Value_ProtonChargeToMassQuotient,
   :qudt/hasUnit :unit/C-PER-KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.4,
   :qudt/value   {:xsd/double 9.57883392E7},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton charge to mass quotient",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?esmp#mid"}})

(def Value_ProtonComptonWavelength
  {:db/ident     :constant/Value_ProtonComptonWavelength,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.9E-24,
   :qudt/value   {:xsd/double 1.3214098446E-15},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton Compton wavelength",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?pcomwl#mid"}})

(def Value_ProtonComptonWavelengthOver2Pi
  {:db/ident     :constant/Value_ProtonComptonWavelengthOver2Pi,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.0E-25,
   :qudt/value   {:xsd/double 2.1030890861E-16},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton Compton wavelength over 2 pi",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?pcomwlbar#mid"}})

(def Value_ProtonElectronMassRatio
  {:db/ident     :constant/Value_ProtonElectronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.0E-7,
   :qudt/value   {:xsd/double 1836.15267247},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton-electron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mpsme#mid"}})

(def Value_ProtonGFactor
  {:db/ident     :constant/Value_ProtonGFactor,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.6E-8,
   :qudt/value   {:xsd/double 5.585694713},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton g factor",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gp#mid"}})

(def Value_ProtonGyromagneticRatio
  {:db/ident     :constant/Value_ProtonGyromagneticRatio,
   :qudt/hasUnit :unit/PER-T-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.0,
   :qudt/value   {:xsd/double 2.675222099E8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton gyromagnetic ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gammap#mid"}})

(def Value_ProtonGyromagneticRatioOver2Pi
  {:db/ident     :constant/Value_ProtonGyromagneticRatioOver2Pi,
   :qudt/hasUnit :unit/MegaHZ-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-6,
   :qudt/value   {:xsd/double 42.5774821},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton gyromagnetic ratio over 2 pi",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gammapbar#mid"}})

(def Value_ProtonMagneticMoment
  {:db/ident     :constant/Value_ProtonMagneticMoment,
   :qudt/hasUnit :unit/J-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.7E-34,
   :qudt/value   {:xsd/double 1.410606662E-26},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton magnetic moment",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mup#mid"}})

(def Value_ProtonMagneticMomentToBohrMagnetonRatio
  {:db/ident     :constant/Value_ProtonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.2E-11,
   :qudt/value   {:xsd/double 0.001521032209},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton magnetic moment to Bohr magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mupsmub#mid"}})

(def Value_ProtonMagneticMomentToNuclearMagnetonRatio
  {:db/ident     :constant/Value_ProtonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-8,
   :qudt/value   {:xsd/double 2.792847356},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton magnetic moment to nuclear magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mupsmun#mid"}})

(def Value_ProtonMagneticShieldingCorrection
  {:db/ident     :constant/Value_ProtonMagneticShieldingCorrection,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.4E-8,
   :qudt/value   {:xsd/double 2.5694E-5},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton magnetic shielding correction",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?sigmapp#mid"}})

(def Value_ProtonMass
  {:db/ident     :constant/Value_ProtonMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.3E-35,
   :qudt/value   {:xsd/double 1.672621637E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mp#mid"}})

(def Value_ProtonMassEnergyEquivalent
  {:db/ident     :constant/Value_ProtonMassEnergyEquivalent,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.5E-18,
   :qudt/value   {:xsd/double 1.503277359E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton mass energy equivalent",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mpc2#mid"}})

(def Value_ProtonMassEnergyEquivalentInMeV
  {:db/ident     :constant/Value_ProtonMassEnergyEquivalentInMeV,
   :qudt/hasUnit :unit/MegaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-5,
   :qudt/value   {:xsd/double 938.272013},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton mass energy equivalent in MeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mpc2mev#mid"}})

(def Value_ProtonMassInAtomicMassUnit
  {:db/ident     :constant/Value_ProtonMassInAtomicMassUnit,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.0E-10,
   :qudt/value   {:xsd/double 1.00727646677},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Proton Mass (amu)",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mpu#mid"}})

(def Value_ProtonMolarMass
  {:db/ident     :constant/Value_ProtonMolarMass,
   :qudt/hasUnit :unit/KiloGM-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.0E-13,
   :qudt/value   {:xsd/double 0.00100727646677},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton molar mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmp#mid"}})

(def Value_ProtonMuonMassRatio
  {:db/ident     :constant/Value_ProtonMuonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.3E-7,
   :qudt/value   {:xsd/double 8.88024339},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton-muon mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mpsmmu#mid"}})

(def Value_ProtonNeutronMagneticMomentRatio
  {:db/ident     :constant/Value_ProtonNeutronMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.4E-7,
   :qudt/value   {:xsd/double -1.45989806},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton-neutron magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mupsmunn#mid"}})

(def Value_ProtonNeutronMassRatio
  {:db/ident     :constant/Value_ProtonNeutronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.6E-10,
   :qudt/value   {:xsd/double 0.99862347824},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton-neutron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mpsmn#mid"}})

(def Value_ProtonRmsChargeRadius
  {:db/ident     :constant/Value_ProtonRmsChargeRadius,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 6.9E-18,
   :qudt/value   {:xsd/double 8.768E-16},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton rms charge radius",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?rp#mid"}})

(def Value_ProtonTauMassRatio
  {:db/ident     :constant/Value_ProtonTauMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.6E-5,
   :qudt/value   {:xsd/double 0.528012},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton-tau mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mpsmtau#mid"}})

(def Value_QuantumOfCirculation
  {:db/ident     :constant/Value_QuantumOfCirculation,
   :qudt/hasUnit :unit/M2-PER-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.0E-13,
   :qudt/value   {:xsd/double 3.6369475199E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for quantum of circulation",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?qucirchs2me#mid"}})

(def Value_QuantumOfCirculationTimes2
  {:db/ident     :constant/Value_QuantumOfCirculationTimes2,
   :qudt/hasUnit :unit/M2-PER-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.0E-12,
   :qudt/value   {:xsd/double 7.27389504E-4},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for quantum of circulation times 2",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?hsme#mid"}})

(def Value_RydbergConstant
  {:db/ident     :constant/Value_RydbergConstant,
   :qudt/hasUnit :unit/PER-M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.3E-5,
   :qudt/value   {:xsd/double 1.0973731568527E7},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Rydberg constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?ryd#mid"}})

(def Value_RydbergConstantTimesCInHz
  {:db/ident     :constant/Value_RydbergConstantTimesCInHz,
   :qudt/hasUnit :unit/HZ,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 22000.0,
   :qudt/value   {:xsd/double 3.289841960361E15},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Rydberg constant times c in Hz",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?rydchz#mid"}})

(def Value_RydbergConstantTimesHcInEV
  {:db/ident     :constant/Value_RydbergConstantTimesHcInEV,
   :qudt/hasUnit :unit/EV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.4E-7,
   :qudt/value   {:xsd/double 13.60569193},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Rydberg constant times hc in eV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?rydhcev#mid"}})

(def Value_RydbergConstantTimesHcInJ
  {:db/ident     :constant/Value_RydbergConstantTimesHcInJ,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-25,
   :qudt/value   {:xsd/double 2.17987197E-18},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Rydberg constant times hc in J",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?rydhcj#mid"}})

(def Value_SackurTetrodeConstant1K100KPa
  {:db/ident     :constant/Value_SackurTetrodeConstant1K100KPa,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.4E-6,
   :qudt/value   {:xsd/double -1.1517047},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Sackur-Tetrode constant 1 K 100 kPa",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?s0sr#mid"}})

(def Value_SackurTetrodeConstant1K101_325K
  {:db/ident     :constant/Value_SackurTetrodeConstant1K101.325K,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.4E-6,
   :qudt/value   {:xsd/double -1.1648677},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Sackur-Tetrode constant 1 K 101.325 kPa",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?s0srstd#mid"}})

(def Value_SecondRadiationConstant
  {:db/ident     :constant/Value_SecondRadiationConstant,
   :qudt/hasUnit :unit/M-K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.5E-8,
   :qudt/value   {:xsd/double 0.014387752},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for second radiation constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?c22ndrc#mid"}})

(def Value_ShieldedHelionGyromagneticRatio
  {:db/ident     :constant/Value_ShieldedHelionGyromagneticRatio,
   :qudt/hasUnit :unit/PER-T-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.6,
   :qudt/value   {:xsd/double 2.03789473E8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded helion gyromagnetic ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gammahp#mid"}})

(def Value_ShieldedHelionGyromagneticRatioOver2Pi
  {:db/ident     :constant/Value_ShieldedHelionGyromagneticRatioOver2Pi,
   :qudt/hasUnit :unit/MegaHZ-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 9.0E-7,
   :qudt/value   {:xsd/double 32.43410198},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded helion gyromagnetic ratio over 2 pi",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gammahpbar#mid"}})

(def Value_ShieldedHelionMagneticMoment
  {:db/ident     :constant/Value_ShieldedHelionMagneticMoment,
   :qudt/hasUnit :unit/J-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.0E-34,
   :qudt/value   {:xsd/double -1.074552982E-26},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded helion magnetic moment",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muhp#mid"}})

(def Value_ShieldedHelionMagneticMomentToBohrMagnetonRatio
  {:db/ident :constant/Value_ShieldedHelionMagneticMomentToBohrMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.4E-11,
   :qudt/value {:xsd/double -0.001158671471},
   :rdf/type :qudt/ConstantValue,
   :rdfs/label
   "Value for shielded helion magnetic moment to Bohr magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muhpsmub#mid"}})

(def Value_ShieldedHelionMagneticMomentToNuclearMagnetonRatio
  {:db/ident :constant/Value_ShieldedHelionMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.5E-8,
   :qudt/value {:xsd/double -2.127497718},
   :rdf/type :qudt/ConstantValue,
   :rdfs/label
   "Value for shielded helion magnetic moment to nuclear magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muhpsmun#mid"}})

(def Value_ShieldedHelionToProtonMagneticMomentRatio
  {:db/ident     :constant/Value_ShieldedHelionToProtonMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-8,
   :qudt/value   {:xsd/double -0.761766558},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded helion to proton magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muhpsmup#mid"}})

(def Value_ShieldedHelionToShieldedProtonMagneticMomentRatio
  {:db/ident :constant/Value_ShieldedHelionToShieldedProtonMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.3E-9,
   :qudt/value {:xsd/double -0.7617861313},
   :rdf/type :qudt/ConstantValue,
   :rdfs/label
   "Value for shielded helion to shielded proton magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muhpsmupp#mid"}})

(def Value_ShieldedProtonGyromagneticRatio
  {:db/ident     :constant/Value_ShieldedProtonGyromagneticRatio,
   :qudt/hasUnit :unit/PER-T-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.3,
   :qudt/value   {:xsd/double 2.675153362E8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded proton gyromagnetic ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gammapp#mid"}})

(def Value_ShieldedProtonGyromagneticRatioOver2Pi
  {:db/ident     :constant/Value_ShieldedProtonGyromagneticRatioOver2Pi,
   :qudt/hasUnit :unit/MegaHZ-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.2E-6,
   :qudt/value   {:xsd/double 42.5763881},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded proton gyromagnetic ratio over 2 pi",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gammappbar#mid"}})

(def Value_ShieldedProtonMagneticMoment
  {:db/ident     :constant/Value_ShieldedProtonMagneticMoment,
   :qudt/hasUnit :unit/J-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.8E-34,
   :qudt/value   {:xsd/double 1.410570419E-26},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded proton magnetic moment",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mupp#mid"}})

(def Value_ShieldedProtonMagneticMomentToBohrMagnetonRatio
  {:db/ident :constant/Value_ShieldedProtonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.7E-11,
   :qudt/value {:xsd/double 0.001520993128},
   :rdf/type :qudt/ConstantValue,
   :rdfs/label
   "Value for shielded proton magnetic moment to Bohr magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muppsmub#mid"}})

(def Value_ShieldedProtonMagneticMomentToNuclearMagnetonRatio
  {:db/ident :constant/Value_ShieldedProtonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.0E-8,
   :qudt/value {:xsd/double 2.792775598},
   :rdf/type :qudt/ConstantValue,
   :rdfs/label
   "Value for shielded proton magnetic moment to nuclear magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?muppsmun#mid"}})

(def Value_SpeedOfLight
  {:db/ident     :constant/Value_SpeedOfLight,
   :qudt/hasUnit :unit/M-PER-SEC,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 2.99792458E8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for velocity of light",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?c#mid"}})

(def Value_SpeedOfLight_Vacuum
  {:db/ident     :constant/Value_SpeedOfLight_Vacuum,
   :qudt/hasUnit :unit/M-PER-SEC,
   :qudt/informativeReference
   #{{:xsd/anyURI "http://physics.nist.gov/cgi-bin/cuu/Value?c#mid"}
     {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"}},
   :qudt/standardUncertainty 0.0,
   :qudt/value   {:xsd/double 2.99792458E8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for speed of light in a vacuum"})

(def Value_SpeedOfLight_Vacuum_Imperial
  {:db/ident     :constant/Value_SpeedOfLight_Vacuum_Imperial,
   :qudt/hasUnit :unit/MI-PER-HR,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 6.70616629E8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for speed of light in vacuum (Imperial units)",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?c#mid"}})

(def Value_StandardAccelerationOfGravity
  {:db/ident     :constant/Value_StandardAccelerationOfGravity,
   :qudt/hasUnit :unit/M-PER-SEC2,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 9.80665},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for standard acceleration of gravity",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gn#mid"}})

(def Value_StandardAtmosphere
  {:db/ident     :constant/Value_StandardAtmosphere,
   :qudt/hasUnit :unit/PA,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/value   {:xsd/double 101325.0},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for standard atmosphere",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?stdatm#mid"}})

(def Value_StefanBoltzmannConstant
  {:db/ident     :constant/Value_StefanBoltzmannConstant,
   :qudt/hasUnit :unit/W-PER-M2-K4,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.0E-13,
   :qudt/value   {:xsd/double 5.6704E-8},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Stefan-Boltzmann Constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?sigma#mid"}})

(def Value_TauComptonWavelength
  {:db/ident     :constant/Value_TauComptonWavelength,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.1E-19,
   :qudt/value   {:xsd/double 6.9772E-16},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau Compton wavelength",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tcomwl#mid"}})

(def Value_TauComptonWavelengthOver2Pi
  {:db/ident     :constant/Value_TauComptonWavelengthOver2Pi,
   :qudt/hasUnit :unit/M,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.8E-20,
   :qudt/value   {:xsd/double 1.11046E-16},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau Compton wavelength over 2 pi",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tcomwlbar#mid"}})

(def Value_TauElectronMassRatio
  {:db/ident     :constant/Value_TauElectronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 0.57,
   :qudt/value   {:xsd/double 3477.48},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau-electron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtausme#mid"}})

(def Value_TauMass
  {:db/ident     :constant/Value_TauMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.2E-31,
   :qudt/value   {:xsd/double 3.16777E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtau#mid"}})

(def Value_TauMassEnergyEquivalent
  {:db/ident     :constant/Value_TauMassEnergyEquivalent,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.6E-14,
   :qudt/value   {:xsd/double 2.84705E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau mass energy equivalent",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtauc2#mid"}})

(def Value_TauMassEnergyEquivalentInMeV
  {:db/ident     :constant/Value_TauMassEnergyEquivalentInMeV,
   :qudt/hasUnit :unit/MegaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 0.29,
   :qudt/value   {:xsd/double 1776.99},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau mass energy equivalent in MeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtauc2mev#mid"}})

(def Value_TauMassInAtomicMassUnit
  {:db/ident     :constant/Value_TauMassInAtomicMassUnit,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.1E-4,
   :qudt/value   {:xsd/double 1.90768},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Tau Mass (amu)",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtauu#mid"}})

(def Value_TauMolarMass
  {:db/ident     :constant/Value_TauMolarMass,
   :qudt/hasUnit :unit/KiloGM-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.1E-7,
   :qudt/value   {:xsd/double 0.00190768},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau molar mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmtau#mid"}})

(def Value_TauMuonMassRatio
  {:db/ident     :constant/Value_TauMuonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 0.0027,
   :qudt/value   {:xsd/double 16.8183},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau-muon mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtausmmu#mid"}})

(def Value_TauNeutronMassRatio
  {:db/ident     :constant/Value_TauNeutronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.1E-4,
   :qudt/value   {:xsd/double 1.89129},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau-neutron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtausmn#mid"}})

(def Value_TauProtonMassRatio
  {:db/ident     :constant/Value_TauProtonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.1E-4,
   :qudt/value   {:xsd/double 1.8939},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau-proton mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtausmp#mid"}})

(def Value_ThomsonCrossSection
  {:db/ident     :constant/Value_ThomsonCrossSection,
   :qudt/hasUnit :unit/M2,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.7E-37,
   :qudt/value   {:xsd/double 6.652458558E-29},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Thomson cross section",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?sigmae#mid"}})

(def Value_TritonElectronMagneticMomentRatio
  {:db/ident     :constant/Value_TritonElectronMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.1E-11,
   :qudt/value   {:xsd/double -0.001620514423},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton-electron magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mutsmuem#mid"}})

(def Value_TritonElectronMassRatio
  {:db/ident     :constant/Value_TritonElectronMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.1E-6,
   :qudt/value   {:xsd/double 5496.9215269},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton-electron mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtsme#mid"}})

(def Value_TritonGFactor
  {:db/ident     :constant/Value_TritonGFactor,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.6E-8,
   :qudt/value   {:xsd/double 5.957924896},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton g factor",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?gtn#mid"}})

(def Value_TritonMagneticMoment
  {:db/ident     :constant/Value_TritonMagneticMoment,
   :qudt/hasUnit :unit/J-PER-T,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 4.2E-34,
   :qudt/value   {:xsd/double 1.504609361E-26},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton magnetic moment",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mut#mid"}})

(def Value_TritonMagneticMomentToBohrMagnetonRatio
  {:db/ident     :constant/Value_TritonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.1E-11,
   :qudt/value   {:xsd/double 0.001622393657},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton magnetic moment to Bohr magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mutsmub#mid"}})

(def Value_TritonMagneticMomentToNuclearMagnetonRatio
  {:db/ident     :constant/Value_TritonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.8E-8,
   :qudt/value   {:xsd/double 2.978962448},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton magnetic moment to nuclear magneton ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mutsmun#mid"}})

(def Value_TritonMass
  {:db/ident     :constant/Value_TritonMass,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.5E-34,
   :qudt/value   {:xsd/double 5.00735588E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mt#mid"}})

(def Value_TritonMassEnergyEquivalent
  {:db/ident     :constant/Value_TritonMassEnergyEquivalent,
   :qudt/hasUnit :unit/J,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.2E-17,
   :qudt/value   {:xsd/double 4.50038703E-10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton mass energy equivalent",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtc2#mid"}})

(def Value_TritonMassEnergyEquivalentInMeV
  {:db/ident     :constant/Value_TritonMassEnergyEquivalentInMeV,
   :qudt/hasUnit :unit/MegaEV,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 7.0E-5,
   :qudt/value   {:xsd/double 2808.920906},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton mass energy equivalent in MeV",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtc2mev#mid"}})

(def Value_TritonMassInAtomicMassUnit
  {:db/ident     :constant/Value_TritonMassInAtomicMassUnit,
   :qudt/hasUnit :unit/U,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.5E-9,
   :qudt/value   {:xsd/double 3.0155007134},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Triton Mass (amu)",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtu#mid"}})

(def Value_TritonMolarMass
  {:db/ident     :constant/Value_TritonMolarMass,
   :qudt/hasUnit :unit/KiloGM-PER-MOL,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.5E-12,
   :qudt/value   {:xsd/double 0.0030155007134},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton molar mass",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mmt#mid"}})

(def Value_TritonNeutronMagneticMomentRatio
  {:db/ident     :constant/Value_TritonNeutronMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 3.7E-7,
   :qudt/value   {:xsd/double -1.55718553},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton-neutron magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mutsmunn#mid"}})

(def Value_TritonProtonMagneticMomentRatio
  {:db/ident     :constant/Value_TritonProtonMagneticMomentRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.0E-8,
   :qudt/value   {:xsd/double 1.066639908},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton-proton magnetic moment ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mutsmup#mid"}})

(def Value_TritonProtonMassRatio
  {:db/ident     :constant/Value_TritonProtonMassRatio,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 2.5E-9,
   :qudt/value   {:xsd/double 2.9937170309},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton-proton mass ratio",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mtsmp#mid"}})

(def Value_UnifiedAtomicMassUnit
  {:db/ident     :constant/Value_UnifiedAtomicMassUnit,
   :qudt/hasUnit :unit/KiloGM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 8.3E-35,
   :qudt/value   {:xsd/double 1.660538782E-27},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for unified atomic mass unit",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?tukg#mid"}})

(def Value_VonKlitzingConstant
  {:db/ident     :constant/Value_VonKlitzingConstant,
   :qudt/hasUnit :unit/OHM,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 1.8E-5,
   :qudt/value   {:xsd/double 25812.807557},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for von Klitzing constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?rk#mid"}})

(def Value_WeakMixingAngle
  {:db/ident     :constant/Value_WeakMixingAngle,
   :qudt/hasUnit :unit/UNITLESS,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.6E-4,
   :qudt/value   {:xsd/double 0.22255},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for weak mixing angle",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?sin2th#mid"}})

(def Value_WienFrequencyDisplacementLawConstant
  {:db/ident     :constant/Value_WienFrequencyDisplacementLawConstant,
   :qudt/hasUnit :unit/HZ-PER-K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 100000.0,
   :qudt/value   {:xsd/double 5.878933E10},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Wien frequency displacement law constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?bpwien#mid"}})

(def Value_WienWavelengthDisplacementLawConstant
  {:db/ident     :constant/Value_WienWavelengthDisplacementLawConstant,
   :qudt/hasUnit :unit/M-K,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/standardUncertainty 5.1E-9,
   :qudt/value   {:xsd/double 0.0028977685},
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Wien wavelength displacement law constant",
   :vaem/website {:xsd/anyURI
                  "http://physics.nist.gov/cgi-bin/cuu/Value?bwien#mid"}})

(def VonKlitzingConstant
  {:db/ident           :constant/VonKlitzingConstant,
   :qudt/hasQuantityKind :quantitykind/Resistance,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_VonKlitzingConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Von Klitzing constant"},
   :skos/closeMatch    {:xsd/anyURI
                        "http://dbpedia.org/resource/Quantum_Hall_effect"}})

(def WeakMixingAngle
  {:db/ident           :constant/WeakMixingAngle,
   :qudt/dbpediaMatch  {:xsd/anyURI
                        "http://dbpedia.org/resource/Weinberg_angle"},
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_WeakMixingAngle,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Weak mixing angle"}})

(def WienFrequencyDisplacementLawConstant
  {:db/ident           :constant/WienFrequencyDisplacementLawConstant,
   :qudt/hasQuantityKind :quantitykind/InverseTimeTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_WienFrequencyDisplacementLawConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "Wien frequency displacement law constant"},
   :skos/closeMatch    {:xsd/anyURI "http://dbpedia.org/resource/Black_body"}})

(def WienWavelengthDisplacementLawConstant
  {:db/ident :constant/WienWavelengthDisplacementLawConstant,
   :qudt/hasQuantityKind :quantitykind/LengthTemperature,
   :qudt/informativeReference
   {:xsd/anyURI "http://physics.nist.gov/cuu/Constants/bibliography.html"},
   :qudt/quantityValue :constant/Value_WienWavelengthDisplacementLawConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/constant"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Wien wavelength displacement law constant"},
   :skos/closeMatch {:xsd/anyURI
                     "http://dbpedia.org/resource/Wien%27s_displacement_law"}})

(def urn:uuid:6a0d87cf-5aa1-51f6-8f36-53d998f7258d
  {:owl/imports #{{:xsd/anyURI "http://qudt.org/schema/facade/qudt"}
                  {:xsd/anyURI "http://qudt.org/vocab/unit"}},
   :rdf/type    :owl/Ontology,
   :rdfs/label  "QUDT VOCAB Physical Constants Release 2.1.35",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-CONSTANTS,
   :xsd/anyURI  "http://qudt.org/vocab/constant"})
