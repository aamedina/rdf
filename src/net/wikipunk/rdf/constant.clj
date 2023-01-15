(ns net.wikipunk.rdf.constant
  "http://qudt.org/2.1/vocab/constant/"
  {:dcat/downloadURL  "https://qudt.org/2.1/vocab/constant.ttl",
   :owl/imports       ["http://qudt.org/2.1/vocab/unit"
                       "http://qudt.org/2.1/schema/facade/qudt"],
   :owl/versionIRI    "http://qudt.org/2.1/vocab/constant",
   :rdf/ns-prefix-map {"constant" "http://qudt.org/vocab/constant/",
                       "dcterms" "http://purl.org/dc/elements/1.1/",
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
   :rdf/type          :owl/Ontology,
   :rdf/uri           "http://qudt.org/2.1/vocab/constant",
   :rdfa/prefix       "constant",
   :rdfa/uri          "http://qudt.org/2.1/vocab/constant/",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-CONSTANTS})

(def AlphaParticleElectronMassRatio
  "Alpha particle-electron mass ratio"
  {:db/ident           :constant/AlphaParticleElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AlphaParticleElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Alpha particle-electron mass ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Alpha_particle"})

(def AlphaParticleMass
  "Alpha particle mass"
  {:db/ident           :constant/AlphaParticleMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AlphaParticleMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Alpha particle mass"},
   :skos/closeMatch    "http://dbpedia.org/resource/Alpha_particle"})

(def AlphaParticleMassEnergyEquivalent
  "alpha particle mass energy equivalent"
  {:db/ident           :constant/AlphaParticleMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AlphaParticleMassEnergyEquivalent,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alpha particle mass energy equivalent"},
   :skos/closeMatch    "http://dbpedia.org/resource/Alpha_particle"})

(def AlphaParticleMassEnergyEquivalentInMeV
  "Alpha particle mass energy equivalent in Me V"
  {:db/ident           :constant/AlphaParticleMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AlphaParticleMassEnergyEquivalentInMeV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "Alpha particle mass energy equivalent in Me V"},
   :skos/closeMatch    "http://dbpedia.org/resource/Alpha_particle"})

(def AlphaParticleMassInAtomicMassUnit
  "alpha particle mass in atomic mass unit"
  {:db/ident           :constant/AlphaParticleMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AlphaParticleMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "alpha particle mass in atomic mass unit"},
   :skos/closeMatch    "http://dbpedia.org/resource/Alpha_particle"})

(def AlphaParticleMolarMass
  "alpha particle molar mass"
  {:db/ident           :constant/AlphaParticleMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AlphaParticleMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alpha particle molar mass"},
   :skos/closeMatch    "http://dbpedia.org/resource/Alpha_particle"})

(def AlphaParticleProtonMassRatio
  "alpha particle-proton mass ratio"
  {:db/ident           :constant/AlphaParticleProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AlphaParticleProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "alpha particle-proton mass ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Alpha_particle"})

(def AngstromStar
  "Angstrom star"
  {:db/ident           :constant/AngstromStar,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AngstromStar,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Angstrom star"}})

(def AtomicMassConstant
  "The \"Atomic Mass Constant\" is one twelfth of the mass of an unbound atom of carbon-12 at rest and in its ground state."
  {:db/ident :constant/AtomicMassConstant,
   :dcterms/description
   "The \"Atomic Mass Constant\" is one twelfth of the mass of an unbound atom of carbon-12 at rest and in its ground state.",
   :qudt/applicableUnit :unit/KiloGM,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Atomic_mass_constant",
   :qudt/hasDimensionVector
   "http://qudt.org/vocab/dimensionvector/A0E0L0I0M1H0T0D0",
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Atomic_mass_constant"],
   :qudt/latexSymbol "\\(m_u\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/quantityValue :constant/Value_AtomicMassConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "atomic mass constant"}})

(def AtomicMassConstantEnergyEquivalent
  "atomic mass constant energy equivalent"
  {:db/ident           :constant/AtomicMassConstantEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicMassConstantEnergyEquivalent,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass constant energy equivalent"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_constant"})

(def AtomicMassConstantEnergyEquivalentInMeV
  "atomic mass constant energy equivalent in MeV"
  {:db/ident           :constant/AtomicMassConstantEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicMassConstantEnergyEquivalentInMeV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "atomic mass constant energy equivalent in MeV"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_constant"})

(def AtomicMassUnitElectronVoltRelationship
  "atomic mass unit-electron volt relationship"
  {:db/ident           :constant/AtomicMassUnitElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicMassUnitElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "atomic mass unit-electron volt relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def AtomicMassUnitHartreeRelationship
  "atomic mass unit-hartree relationship"
  {:db/ident           :constant/AtomicMassUnitHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicMassUnitHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass unit-hartree relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def AtomicMassUnitHertzRelationship
  "atomic mass unit-hertz relationship"
  {:db/ident           :constant/AtomicMassUnitHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicMassUnitHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass unit-hertz relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def AtomicMassUnitInverseMeterRelationship
  "atomic mass unit-inverse meter relationship"
  {:db/ident           :constant/AtomicMassUnitInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicMassUnitInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "atomic mass unit-inverse meter relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def AtomicMassUnitJouleRelationship
  "atomic mass unit-joule relationship"
  {:db/ident           :constant/AtomicMassUnitJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicMassUnitJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass unit-joule relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def AtomicMassUnitKelvinRelationship
  "atomic mass unit-kelvin relationship"
  {:db/ident           :constant/AtomicMassUnitKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicMassUnitKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass unit-kelvin relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def AtomicMassUnitKilogramRelationship
  "atomic mass unit-kilogram relationship"
  {:db/ident           :constant/AtomicMassUnitKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicMassUnitKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic mass unit-kilogram relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def AtomicUnitOf1stHyperpolarizablity
  "atomic unit of 1st hyperpolarizablity"
  {:db/ident           :constant/AtomicUnitOf1stHyperpolarizablity,
   :qudt/hasQuantityKind :quantitykind/CubicElectricDipoleMomentPerSquareEnergy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOf1stHyperpolarizability,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of 1st hyperpolarizablity"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOf2ndHyperpolarizablity
  "atomic unit of 2nd hyperpolarizablity"
  {:db/ident           :constant/AtomicUnitOf2ndHyperpolarizablity,
   :qudt/hasQuantityKind
   :quantitykind/QuarticElectricDipoleMomentPerCubicEnergy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOf2ndHyperpolarizability,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of 2nd hyperpolarizablity"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfAction
  "atomic unit of action"
  {:db/ident           :constant/AtomicUnitOfAction,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfAction,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of action"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfCharge
  "atomic unit of charge"
  {:db/ident             :constant/AtomicUnitOfCharge,
   :qudt/exactMatch      :constant/ElementaryCharge,
   :qudt/hasQuantityKind :quantitykind/ElectricCharge,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue   :constant/Value_AtomicUnitOfCharge,
   :rdf/type             :qudt/PhysicalConstant,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/constant",
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "atomic unit of charge"},
   :skos/closeMatch      "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfChargeDensity
  "atomic unit of charge density"
  {:db/ident           :constant/AtomicUnitOfChargeDensity,
   :qudt/hasQuantityKind :quantitykind/ElectricChargeVolumeDensity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfChargeDensity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of charge density"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfCurrent
  "atomic unit of current"
  {:db/ident           :constant/AtomicUnitOfCurrent,
   :qudt/hasQuantityKind :quantitykind/ElectricCurrent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfCurrent,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of current"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfElectricDipoleMoment
  "atomic unit of electric dipole mom."
  {:db/ident           :constant/AtomicUnitOfElectricDipoleMoment,
   :qudt/hasQuantityKind :quantitykind/ElectricDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricDipoleMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of electric dipole mom."},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfElectricField
  "atomic unit of electric field"
  {:db/ident           :constant/AtomicUnitOfElectricField,
   :qudt/hasQuantityKind :quantitykind/ElectricFieldStrength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricField,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of electric field"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfElectricFieldGradient
  "atomic unit of electric field gradient"
  {:db/ident           :constant/AtomicUnitOfElectricFieldGradient,
   :qudt/hasQuantityKind :quantitykind/EnergyPerAreaElectricCharge,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricFieldGradient,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of electric field gradient"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfElectricPolarizablity
  "atomic unit of electric polarizablity"
  {:db/ident           :constant/AtomicUnitOfElectricPolarizablity,
   :qudt/hasQuantityKind :quantitykind/Polarizability,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricPolarizability,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of electric polarizablity"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfElectricPotential
  "atomic unit of electric potential"
  {:db/ident           :constant/AtomicUnitOfElectricPotential,
   :qudt/hasQuantityKind :quantitykind/EnergyPerElectricCharge,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricPotential,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of electric potential"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfElectricQuadrupoleMoment
  "atomic unit of electric quadrupole moment"
  {:db/ident           :constant/AtomicUnitOfElectricQuadrupoleMoment,
   :qudt/hasQuantityKind :quantitykind/ElectricQuadrupoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfElectricQuadrupoleMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "atomic unit of electric quadrupole moment"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfEnergy
  "atomic unit of energy"
  {:db/ident           :constant/AtomicUnitOfEnergy,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfEnergy,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of energy"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfForce
  "atomic unit of force"
  {:db/ident           :constant/AtomicUnitOfForce,
   :qudt/hasQuantityKind :quantitykind/Force,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfForce,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of force"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfLength
  "atomic unit of length"
  {:db/ident           :constant/AtomicUnitOfLength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfLength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of length"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfMagneticDipoleMoment
  "atomic unit of magnetic dipole moment"
  {:db/ident           :constant/AtomicUnitOfMagneticDipoleMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfMagneticDipoleMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of magnetic dipole moment"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfMagneticFluxDensity
  "atomic unit of magnetic flux density"
  {:db/ident           :constant/AtomicUnitOfMagneticFluxDensity,
   :qudt/hasQuantityKind :quantitykind/MagneticFluxDensity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfMagneticFluxDensity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of magnetic flux density"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfMagnetizability
  "atomic unit of magnetizability"
  {:db/ident           :constant/AtomicUnitOfMagnetizability,
   :qudt/hasQuantityKind :quantitykind/EnergyPerSquareMagneticFluxDensity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfMagnetizability,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of magnetizability"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfMass
  "atomic unit of mass"
  {:db/ident           :constant/AtomicUnitOfMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of mass"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfMomentum
  "atomic unit of momentum"
  {:db/ident           :constant/AtomicUnitOfMomentum,
   :qudt/hasQuantityKind :quantitykind/LinearMomentum,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfMomentum,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of momentum"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfPermittivity
  "atomic unit of permittivity"
  {:db/ident           :constant/AtomicUnitOfPermittivity,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Permittivity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfPermittivity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of permittivity"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfTime
  "atomic unit of time"
  {:db/ident           :constant/AtomicUnitOfTime,
   :qudt/hasQuantityKind :quantitykind/Time,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfTime,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of time"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AtomicUnitOfVelocity
  "atomic unit of velocity"
  {:db/ident           :constant/AtomicUnitOfVelocity,
   :qudt/hasQuantityKind :quantitykind/LinearVelocity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_AtomicUnitOfVelocity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "atomic unit of velocity"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_units"})

(def AvogadroConstant
  "In chemistry and physics, the \"Avogadro Constant\" is defined as the ratio of the number of constituent particles N in a sample to the amount of substance n through the relationship NA = N/n. Thus, it is the proportionality factor that relates the molar mass of an entity, i.e. , the mass per amount of substance, to the mass of said entity."
  {:db/ident :constant/AvogadroConstant,
   :dcterms/description
   "In chemistry and physics, the \"Avogadro Constant\" is defined as the ratio of the number of constituent particles N in a sample to the amount of substance n through the relationship NA = N/n. Thus, it is the proportionality factor that relates the molar mass of an entity, i.e. , the mass per amount of substance, to the mass of said entity.",
   :qudt/abbreviation "mole^{-1}",
   :qudt/applicableUnit :unit/PER-MOL,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Avogadro_constant",
   :qudt/hasDimensionVector
   "http://qudt.org/vocab/dimensionvector/A-1E0L0I0M0H0T0D0",
   :qudt/hasQuantityKind :quantitykind/InverseAmountOfSubstance,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Avogadro_constant"],
   :qudt/latexDefinition
   "\\(L = \\frac{N}{n}\\), where \\(N\\) is the number of particles and \\(n\\) is amount of substance.",
   :qudt/latexSymbol "\\(L, N_A\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31894",
   :qudt/quantityValue :constant/Value_AvogadroConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Avogadro constant"}})

(def BohrMagneton
  "The \"Bohr Magneton\" is a physical constant and the natural unit for expressing an electron magnetic dipole moment."
  {:db/ident :constant/BohrMagneton,
   :dcterms/description
   "The \"Bohr Magneton\" is a physical constant and the natural unit for expressing an electron magnetic dipole moment.",
   :qudt/applicableUnit :unit/J-PER-T,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Bohr_magneton",
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Bohr_magneton"],
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/latexDefinition
   "\\(\\mu_B = \\frac{e\\hbar}{2m_e}\\), where \\(e\\) is the elementary charge, \\(\\hbar\\) is the Planck constant, and \\(m_e\\) is the rest mass of electron.",
   :qudt/latexSymbol "\\(\\mu_B\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/quantityValue :constant/Value_BohrMagneton,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bohr Magneton"}})

(def BohrMagnetonInEVPerT
  "Bohr magneton in eV per T"
  {:db/ident           :constant/BohrMagnetonInEVPerT,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_BohrMagnetonInEVPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Bohr magneton in eV per T"},
   :skos/closeMatch    "http://dbpedia.org/resource/Bohr_magneton"})

(def BohrMagnetonInHzPerT
  "Bohr magneton in Hz perT"
  {:db/ident           :constant/BohrMagnetonInHzPerT,
   :qudt/hasQuantityKind :quantitykind/ElectricChargePerMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_BohrMagnetonInHzPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Bohr magneton in Hz perT"},
   :skos/closeMatch    "http://dbpedia.org/resource/Bohr_magneton"})

(def BohrMagnetonInInverseMetersPerTesla
  "Bohr magneton in inverse meters per tesla"
  {:db/ident           :constant/BohrMagnetonInInverseMetersPerTesla,
   :qudt/hasQuantityKind :quantitykind/MagneticReluctivity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_BohrMagnetonInInverseMetersPerTesla,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "Bohr magneton in inverse meters per tesla"},
   :skos/closeMatch    "http://dbpedia.org/resource/Bohr_magneton"})

(def BohrMagnetonInKPerT
  "Bohr magneton in K per T"
  {:db/ident           :constant/BohrMagnetonInKPerT,
   :qudt/hasQuantityKind :quantitykind/TemperaturePerMagneticFluxDensity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_BohrMagnetonInKPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Bohr magneton in K per T"},
   :skos/closeMatch    "http://dbpedia.org/resource/Bohr_magneton"})

(def BohrRadius
  "The Bohr radius is a physical constant, approximately equal to the most probable distance between the proton and electron in a hydrogen atom in its ground state. It is named after Niels Bohr, due to its role in the Bohr model of an atom. The precise definition of the Bohr radius is: where: is the permittivity of free space is the reduced Planck's constant is the electron rest mass is the elementary charge is the speed of light in vacuum is the fine structure constant. [Wikipedia]"
  {:db/ident :constant/BohrRadius,
   :dcterms/description
   "The Bohr radius is a physical constant, approximately equal to the most probable distance between the proton and electron in a hydrogen atom in its ground state. It is named after Niels Bohr, due to its role in the Bohr model of an atom. The precise definition of the Bohr radius is: where: is the permittivity of free space is the reduced Planck's constant is the electron rest mass is the elementary charge is the speed of light in vacuum is the fine structure constant. [Wikipedia]",
   :qudt/applicableUnit :unit/M,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Bohr_radius",
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   ["http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31895"
    "http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Bohr_radius"],
   :qudt/isUnitOfSystem :sou/SI,
   :qudt/latexDefinition
   "\\(a_0 = \\frac{4\\pi \\varepsilon_0 \\hbar^2}{m_ee^2}\\), where \\(\\varepsilon_0\\) is the electric constant, \\(\\hbar\\) is the reduced Planck constant, \\(m_e\\)  is the rest mass of electron, and \\(e\\) is the elementary charge.",
   :qudt/latexSymbol "\\(a_0\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/quantityValue :constant/Value_BohrRadius,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bohr Radius"}})

(def BoltzmannConstant
  "The <i>Boltzmann Constant</i> (\\(k\\) or \\(kB\\)) is the physical constant relating energy at the individual particle level with temperature, which must necessarily be observed at the collective or bulk level. It is the gas constant \\(R\\) divided by the Avogadro constant \\(N_A\\): It has the same dimension as entropy. It is named after the Austrian physicist Ludwig Boltzmann."
  {:db/ident :constant/BoltzmannConstant,
   :dcterms/description
   "The <i>Boltzmann Constant</i> (\\(k\\) or \\(kB\\)) is the physical constant relating energy at the individual particle level with temperature, which must necessarily be observed at the collective or bulk level. It is the gas constant \\(R\\) divided by the Avogadro constant \\(N_A\\): It has the same dimension as entropy. It is named after the Austrian physicist Ludwig Boltzmann.",
   :qudt/applicableUnit :unit/J-PER-K,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Boltzmann_constant",
   :qudt/hasQuantityKind :quantitykind/HeatCapacity,
   :qudt/informativeReference
   "http://en.wikipedia.org/wiki/Boltzmann_constant?oldid=495542430",
   :qudt/isMetricUnit true,
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31894",
   :qudt/latexSymbol "\\(k\\)",
   :qudt/quantityValue :constant/Value_BoltzmannConstant,
   :qudt/ucumCode "[k]",
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Boltzmann Constant"}})

(def BoltzmannConstantInEVPerK
  "Boltzmann constant in eV per K"
  {:db/ident           :constant/BoltzmannConstantInEVPerK,
   :qudt/hasQuantityKind :quantitykind/HeatCapacity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_BoltzmannConstantInEVPerK,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Boltzmann constant in eV per K"},
   :skos/closeMatch    "http://dbpedia.org/resource/Boltzmann_constant"})

(def BoltzmannConstantInHzPerK
  "Boltzmann constant in Hz per K"
  {:db/ident           :constant/BoltzmannConstantInHzPerK,
   :qudt/hasQuantityKind :quantitykind/InverseTimeTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_BoltzmannConstantInHzPerK,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Boltzmann constant in Hz per K"},
   :skos/closeMatch    "http://dbpedia.org/resource/Boltzmann_constant"})

(def BoltzmannConstantInInverseMetersPerKelvin
  "Boltzmann constant in inverse meters per kelvin"
  {:db/ident :constant/BoltzmannConstantInInverseMetersPerKelvin,
   :qudt/hasQuantityKind :quantitykind/InverseLengthTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_BoltzmannConstantInInverseMetersPerKelvin,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value "Boltzmann constant in inverse meters per kelvin"},
   :skos/closeMatch "http://dbpedia.org/resource/Boltzmann_constant"})

(def CharacteristicImpedanceOfVacuum
  "The impedance of free space, Z0, is a physical constant relating the magnitudes of the electric and magnetic fields of electromagnetic radiation travelling through free space. That is, Z0 = |E|/|H|, where |E| is the electric field strength and |H| magnetic field strength. It has an exact value, given approximately as 376.73031 ohms. The impedance of free space equals the product of the vacuum permeability or magnetic constant μ0 and the speed of light in vacuum c0. Since the numerical values of the magnetic constant and of the speed of light are fixed by the definitions of the ampere and the metre respectively, the exact value of the impedance of free space is likewise fixed by definition and is not subject to experimental error. [Wikipedia]"
  {:db/ident :constant/CharacteristicImpedanceOfVacuum,
   :dcterms/description
   "The impedance of free space, Z0, is a physical constant relating the magnitudes of the electric and magnetic fields of electromagnetic radiation travelling through free space. That is, Z0 = |E|/|H|, where |E| is the electric field strength and |H| magnetic field strength. It has an exact value, given approximately as 376.73031 ohms. The impedance of free space equals the product of the vacuum permeability or magnetic constant μ0 and the speed of light in vacuum c0. Since the numerical values of the magnetic constant and of the speed of light are fixed by the definitions of the ampere and the metre respectively, the exact value of the impedance of free space is likewise fixed by definition and is not subject to experimental error. [Wikipedia]",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Impedance_of_free_space",
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Resistance,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_CharacteristicImpedanceOfVacuum,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "characteristic impedance of vacuum"}})

(def ClassicalElectronRadius
  "classical electron radius"
  {:db/ident           :constant/ClassicalElectronRadius,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Classical_electron_radius",
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ClassicalElectronRadius,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "classical electron radius"}})

(def ComptonWavelength
  "The \"Compton Wavelength\" is a quantum mechanical property of a particle. It was introduced by Arthur Compton in his explanation of the scattering of photons by electrons (a process known as Compton scattering). The Compton wavelength of a particle is equivalent to the wavelength of a photon whose energy is the same as the rest-mass energy of the particle."
  {:db/ident :constant/ComptonWavelength,
   :dcterms/description
   "The \"Compton Wavelength\"  is a quantum mechanical property of a particle. It was introduced by Arthur Compton in his explanation of the scattering of photons by electrons (a process known as Compton scattering). The Compton wavelength of a particle is equivalent to the wavelength of a photon whose energy is the same as the rest-mass energy of the particle.",
   :qudt/applicableUnit :unit/M,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Compton_wavelength",
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Compton_wavelength"],
   :qudt/latexDefinition
   "\\(\\lambda_C = \\frac{h}{mc_0}\\), where \\(h\\) is the Planck constant, \\(m\\) is the rest mass of a particle, and \\(c_0\\) is the speed of light in vacuum.",
   :qudt/latexSymbol "\\(\\lambda_C\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/quantityValue :constant/Value_ComptonWavelength,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Compton Wavelength"}})

(def ComptonWavelengthOver2Pi
  "Compton wavelength over 2 pi"
  {:db/ident           :constant/ComptonWavelengthOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ComptonWavelengthOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Compton wavelength over 2 pi"},
   :skos/closeMatch    "http://dbpedia.org/resource/Compton_wavelength"})

(def ConductanceQuantum
  "conductance quantum"
  {:db/ident           :constant/ConductanceQuantum,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Conductance_quantum",
   :qudt/hasQuantityKind :quantitykind/ElectricConductivity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ConductanceQuantum,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "conductance quantum"}})

(def ConventionalValueOfJosephsonConstant
  "conventional value of Josephson constant"
  {:db/ident           :constant/ConventionalValueOfJosephsonConstant,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/InverseMagneticFlux,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ConventionalValueOfJosephsonConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "conventional value of Josephson constant"},
   :skos/closeMatch    "http://dbpedia.org/resource/Magnetic_flux_quantum"})

(def ConventionalValueOfVonKlitzingConstant
  "conventional value of von Klitzing constant"
  {:db/ident           :constant/ConventionalValueOfVonKlitzingConstant,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Resistance,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ConventionalValueOfVonKlitzingConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "conventional value of von Klitzing constant"},
   :skos/closeMatch    "http://dbpedia.org/resource/Quantum_Hall_effect"})

(def CuXUnit
  "Cu x unit"
  {:db/ident           :constant/CuXUnit,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_CuXUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Cu x unit"},
   :skos/closeMatch    "http://dbpedia.org/resource/X_unit"})

(def DeuteronElectronMagneticMomentRatio
  "deuteron-electron magnetic moment ratio"
  {:db/ident :constant/DeuteronElectronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronElectronMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deuteron-electron magnetic moment ratio"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"})

(def DeuteronElectronMassRatio
  "deuteron-electron mass ratio"
  {:db/ident           :constant/DeuteronElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron-electron mass ratio"}})

(def DeuteronGFactor
  "deuteron g factor"
  {:db/ident           :constant/DeuteronGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron g factor"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def DeuteronMagneticMoment
  "deuteron magnetic moment"
  {:db/ident           :constant/DeuteronMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron magnetic moment"},
   :skos/closeMatch    "http://dbpedia.org/resource/Magnetic_moment"})

(def DeuteronMagneticMomentToBohrMagnetonRatio
  "deuteron magnetic moment to Bohr magneton ratio"
  {:db/ident :constant/DeuteronMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_DeuteronMagneticMomentToBohrMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value "deuteron magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/Bohr_magneton"})

(def DeuteronMagneticMomentToNuclearMagnetonRatio
  "deuteron magnetic moment to nuclear magneton ratio"
  {:db/ident :constant/DeuteronMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_DeuteronMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "deuteron magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/Nuclear_magneton"})

(def DeuteronMass
  "deuteron mass"
  {:db/ident           :constant/DeuteronMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron mass"}})

(def DeuteronMassEnergyEquivalent
  "deuteron mass energy equivalent"
  {:db/ident :constant/DeuteronMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deuteron mass energy equivalent"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def DeuteronMassEnergyEquivalentInMeV
  "deuteron mass energy equivalent in MeV"
  {:db/ident :constant/DeuteronMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deuteron mass energy equivalent in MeV"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def DeuteronMassInAtomicMassUnit
  "deuteron mass in atomic mass unit"
  {:db/ident           :constant/DeuteronMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron mass in atomic mass unit"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def DeuteronMolarMass
  "deuteron molar mass"
  {:db/ident           :constant/DeuteronMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron molar mass"}})

(def DeuteronNeutronMagneticMomentRatio
  "deuteron-neutron magnetic moment ratio"
  {:db/ident           :constant/DeuteronNeutronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronNeutronMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron-neutron magnetic moment ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Neutron_magnetic_moment"})

(def DeuteronProtonMagneticMomentRatio
  "deuteron-proton magnetic moment ratio"
  {:db/ident           :constant/DeuteronProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronProtonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron-proton magnetic moment ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def DeuteronProtonMassRatio
  "deuteron-proton mass ratio"
  {:db/ident           :constant/DeuteronProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron-proton mass ratio"}})

(def DeuteronRmsChargeRadius
  "deuteron rms charge radius"
  {:db/ident           :constant/DeuteronRmsChargeRadius,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_DeuteronRmsChargeRadius,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "deuteron rms charge radius"},
   :skos/closeMatch    "http://dbpedia.org/resource/Nucleon"})

(def ElectricConstant
  "electric constant"
  {:db/ident           :constant/ElectricConstant,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Vacuum_permittivity",
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Permittivity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectricConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electric constant"}})

(def ElectromagneticPermeabilityOfVacuum
  "\\(\\textbf{Permeability of Vacuum}\\), also known as \\(\\textit{Magnetic Constant}\\), is a scalar constant \\(\\mu_0\\) such that, in a vacuum the product wuth the magnetic field vector, \\(\\overrightarrow{H}\\) is equal to the magnetic flux density vector, \\(\\overrightarrow{B}\\)."
  {:db/ident :constant/ElectromagneticPermeabilityOfVacuum,
   :dcterms/description
   "\\(\\textbf{Permeability of Vacuum}\\), also known as \\(\\textit{Magnetic Constant}\\), is a scalar constant \\(\\mu_0\\) such that, in a vacuum the product wuth the magnetic field vector, \\(\\overrightarrow{H}\\) is equal to the magnetic flux density vector, \\(\\overrightarrow{B}\\).",
   :qudt/applicableUnit :unit/H-PER-M,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Vacuum_permeability",
   :qudt/exactConstant true,
   :qudt/exactMatch :constant/MagneticConstant,
   :qudt/expression "vacuum-permeability",
   :qudt/hasQuantityKind :quantitykind/Permittivity,
   :qudt/informativeReference
   ["http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31891"
    "http://www.electropedia.org/iev/iev.nsf/display?openform&ievref=705-03-14"],
   :qudt/latexDefinition
   "\\(\\mu_0 = \\frac{\\overrightarrow{B}}{\\overrightarrow{H}}\\), where \\(\\overrightarrow{B}\\) is the B-Filed magnetic vector, and \\(\\overrightarrow{H}\\) is the H-Field magnetic vector. The value of \\(\\mu_0\\) is \\(\\approx 1.256637e-6\\,henry\\,per\\,metre\\).",
   :qudt/latexSymbol "\\(\\mu_0\\)",
   :qudt/quantityValue :constant/Value_MagneticConstant,
   :qudt/ucumCode "[mu_0]",
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Permeability of Vacuum"}})

(def ElectronChargeToMassQuotient
  "electron charge to mass quotient"
  {:db/ident           :constant/ElectronChargeToMassQuotient,
   :qudt/hasQuantityKind :quantitykind/ElectricChargePerMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronChargeToMassQuotient,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron charge to mass quotient"},
   :skos/closeMatch    "http://dbpedia.org/resource/Mass-to-charge_ratio"})

(def ElectronDeuteronMagneticMomentRatio
  "electron-deuteron magnetic moment ratio"
  {:db/ident           :constant/ElectronDeuteronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronDeuteronMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "electron-deuteron magnetic moment ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def ElectronDeuteronMassRatio
  "electron-deuteron mass ratio"
  {:db/ident           :constant/ElectronDeuteronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronDeuteronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-deuteron mass ratio"}})

(def ElectronGFactor
  "electron g factor"
  {:db/ident           :constant/ElectronGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron g factor"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def ElectronGyromagneticRatio
  "The \"Electron Gyromagnetic Ratio\" An isolated electron has an angular momentum and a magnetic moment resulting from its spin. While an electron's spin is sometimes visualized as a literal rotation about an axis, it is in fact a fundamentally different, quantum-mechanical phenomenon with no true analogue in classical physics. Consequently, there is no reason to expect the above classical relation to hold."
  {:db/ident :constant/ElectronGyromagneticRatio,
   :dcterms/description
   "The \"Electron Gyromagnetic Ratio\" An isolated electron has an angular momentum and a magnetic moment resulting from its spin. While an electron's spin is sometimes visualized as a literal rotation about an axis, it is in fact a fundamentally different, quantum-mechanical phenomenon with no true analogue in classical physics. Consequently, there is no reason to expect the above classical relation to hold.",
   :qudt/applicableUnit :unit/A-M2-PER-J-SEC,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Gyromagnetic_ratio#Gyromagnetic_ratio_for_an_isolated_electron"],
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/latexDefinition
   "\\(\\mu = \\gamma_e J\\), where \\(\\mu\\) is the magnetic dipole moment, and \\(J\\) is the total angular momentum.",
   :qudt/latexSymbol "\\(\\gamma_e\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/quantityValue :constant/Value_ElectronGyromagneticRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Electron Gyromagnetic Ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/Gyromagnetic_ratio"})

(def ElectronGyromagneticRatioOver2Pi
  "electron gyromagnetic ratio over 2 pi"
  {:db/ident           :constant/ElectronGyromagneticRatioOver2Pi,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronGyromagneticRatioOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron gyromagnetic ratio over 2 pi"},
   :skos/closeMatch    "http://dbpedia.org/resource/Gyromagnetic_ratio"})

(def ElectronMagneticMoment
  "electron magnetic moment"
  {:db/ident :constant/ElectronMagneticMoment,
   :qudt/dbpediaMatch
   "http://dbpedia.org/resource/Electron_magnetic_dipole_moment",
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronMagneticMoment,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "electron magnetic moment"}})

(def ElectronMagneticMomentAnomaly
  "electron magnetic moment anomaly"
  {:db/ident :constant/ElectronMagneticMomentAnomaly,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronMagneticMomentAnomaly,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "electron magnetic moment anomaly"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"})

(def ElectronMagneticMomentToBohrMagnetonRatio
  "electron magnetic moment to Bohr magneton ratio"
  {:db/ident :constant/ElectronMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_ElectronMagneticMomentToBohrMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value "electron magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch
   ["http://dbpedia.org/resource/Electron_magnetic_dipole_moment"
    "http://dbpedia.org/resource/Bohr_magneton"]})

(def ElectronMagneticMomentToNuclearMagnetonRatio
  "electron magnetic moment to nuclear magneton ratio"
  {:db/ident :constant/ElectronMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_ElectronMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "electron magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch
   ["http://dbpedia.org/resource/Nuclear_magneton"
    "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"]})

(def ElectronMass
  "Electron Mass"
  {:db/ident             :constant/ElectronMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/latexSymbol     "\\(m_e\\)",
   :qudt/quantityValue   :constant/Value_ElectronMass,
   :qudt/ucumCode        "[m_e]",
   :rdf/type             :qudt/PhysicalConstant,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/constant",
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "Electron Mass"},
   :skos/closeMatch      "http://dbpedia.org/resource/Electron"})

(def ElectronMassEnergyEquivalent
  "electron mass energy equivalent"
  {:db/ident :constant/ElectronMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "electron mass energy equivalent"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def ElectronMassEnergyEquivalentInMeV
  "electron mass energy equivalent in MeV"
  {:db/ident :constant/ElectronMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "electron mass energy equivalent in MeV"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def ElectronMassInAtomicMassUnit
  "electron mass in atomic mass unit"
  {:db/ident           :constant/ElectronMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron mass in atomic mass unit"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def ElectronMolarMass
  "electron molar mass"
  {:db/ident           :constant/ElectronMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron molar mass"}})

(def ElectronMuonMagneticMomentRatio
  "electron-muon magnetic moment ratio"
  {:db/ident           :constant/ElectronMuonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronMuonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-muon magnetic moment ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def ElectronMuonMassRatio
  "electron-muon mass ratio"
  {:db/ident           :constant/ElectronMuonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronMuonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-muon mass ratio"}})

(def ElectronNeutronMagneticMomentRatio
  "electron-neutron magnetic moment ratio"
  {:db/ident           :constant/ElectronNeutronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronNeutronMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-neutron magnetic moment ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Neutron_magnetic_moment"})

(def ElectronNeutronMassRatio
  "electron-neutron mass ratio"
  {:db/ident           :constant/ElectronNeutronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronNeutronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-neutron mass ratio"}})

(def ElectronProtonMagneticMomentRatio
  "electron-proton magnetic moment ratio"
  {:db/ident           :constant/ElectronProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronProtonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-proton magnetic moment ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def ElectronProtonMassRatio
  "electron-proton mass ratio"
  {:db/ident           :constant/ElectronProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-proton mass ratio"}})

(def ElectronTauMassRatio
  "electron-tau mass ratio"
  {:db/ident           :constant/ElectronTauMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronTauMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron-tau mass ratio"}})

(def ElectronToAlphaParticleMassRatio
  "electron to alpha particle mass ratio"
  {:db/ident           :constant/ElectronToAlphaParticleMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronToAlphaParticleMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron to alpha particle mass ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Alpha_particle"})

(def ElectronToShieldedHelionMagneticMomentRatio
  "electron to shielded helion magnetic moment ratio"
  {:db/ident :constant/ElectronToShieldedHelionMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_ElectronToShieldedHelionMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value "electron to shielded helion magnetic moment ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/G-factor"})

(def ElectronToShieldedProtonMagneticMomentRatio
  "electron to shielded proton magnetic moment ratio"
  {:db/ident :constant/ElectronToShieldedProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_ElectronToShieldedProtonMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value "electron to shielded proton magnetic moment ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/G-factor"})

(def ElectronVoltAtomicMassUnitRelationship
  "electron volt-atomic mass unit relationship"
  {:db/ident           :constant/ElectronVoltAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronVoltAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "electron volt-atomic mass unit relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def ElectronVoltHartreeRelationship
  "electron volt-hartree relationship"
  {:db/ident           :constant/ElectronVoltHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronVoltHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron volt-hartree relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def ElectronVoltHertzRelationship
  "electron volt-hertz relationship"
  {:db/ident           :constant/ElectronVoltHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronVoltHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron volt-hertz relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def ElectronVoltInverseMeterRelationship
  "electron volt-inverse meter relationship"
  {:db/ident           :constant/ElectronVoltInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronVoltInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "electron volt-inverse meter relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def ElectronVoltJouleRelationship
  "electron volt-joule relationship"
  {:db/ident           :constant/ElectronVoltJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronVoltJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron volt-joule relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def ElectronVoltKelvinRelationship
  "electron volt-kelvin relationship"
  {:db/ident           :constant/ElectronVoltKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronVoltKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron volt-kelvin relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def ElectronVoltKilogramRelationship
  "electron volt-kilogram relationship"
  {:db/ident           :constant/ElectronVoltKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElectronVoltKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "electron volt-kilogram relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def ElementaryCharge
  "Elementary Charge"
  {:db/ident             :constant/ElementaryCharge,
   :qudt/dbpediaMatch    "http://dbpedia.org/resource/Elementary_charge",
   :qudt/exactMatch      :constant/AtomicUnitOfCharge,
   :qudt/hasQuantityKind :quantitykind/ElectricCharge,
   :qudt/informativeReference
   ["http://en.wikipedia.org/wiki/Elementary_charge"
    "http://physics.nist.gov/cuu/Constants/bibliography.html"],
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31894",
   :qudt/plainTextDescription
   "The \"Elementary Charge\" is the electric charge carried by a single proton, or equivalently, the negation (opposite) of the electric charge carried by a single electron.",
   :qudt/quantityValue   :constant/Value_ElementaryCharge,
   :qudt/symbol          "e",
   :qudt/ucumCode        "[e]",
   :rdf/type             [:qudt/AtomicUnit :qudt/PhysicalConstant],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/constant",
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "Elementary Charge"}})

(def ElementaryChargeOverH
  "elementary charge over h"
  {:db/ident           :constant/ElementaryChargeOverH,
   :qudt/hasQuantityKind :quantitykind/ElectricCurrentPerUnitEnergy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ElementaryChargeOverH,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "elementary charge over h"},
   :skos/closeMatch    "http://dbpedia.org/resource/Elementary_charge"})

(def FaradayConstant
  "The \"Faraday Constant\" is the magnitude of electric charge per mole of electrons."
  {:db/ident :constant/FaradayConstant,
   :dcterms/description
   "The \"Faraday Constant\" is the magnitude of electric charge per mole of electrons.",
   :qudt/abbreviation "c mol^{-1}",
   :qudt/applicableUnit :unit/C-PER-MOL,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Faraday_constant",
   :qudt/hasQuantityKind :quantitykind/ElectricChargePerAmountOfSubstance,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Faraday_constant"],
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31894",
   :qudt/latexDefinition
   "\\(F = N_A e\\), where \\(N_A\\) is the Avogadro constant and \\(e\\) is the elementary charge.",
   :qudt/latexSymbol "\\(F\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31894",
   :qudt/quantityValue :constant/Value_FaradayConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Faraday constant"}})

(def FermiCouplingConstant
  "Fermi coupling constant"
  {:db/ident           :constant/FermiCouplingConstant,
   :qudt/hasQuantityKind :quantitykind/InverseSquareEnergy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_FermiCouplingConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Fermi coupling constant"},
   :skos/closeMatch    "http://dbpedia.org/resource/Coupling_constant"})

(def FineStructureConstant
  "The \"Fine-structure Constant\" is a fundamental physical constant, namely the coupling constant characterizing the strength of the electromagnetic interaction."
  {:db/ident :constant/FineStructureConstant,
   :dcterms/description
   "The \"Fine-structure Constant\"  is a fundamental physical constant, namely the coupling constant characterizing the strength of the electromagnetic interaction.",
   :qudt/applicableUnit :unit/UNITLESS,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Fine-structure_constant",
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Fine-structure_constant"],
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/latexDefinition
   "\\(a = \\frac{e^2}{4\\pi\\varepsilon_0\\hbar c_0}\\), where \\(e\\) is the elementary charge, \\(\\varepsilon_0\\) is the electric constant, item \\(\\hbar\\) is the reduced Planck constant, and \\(c_0\\) is the speed of light in vacuum.",
   :qudt/latexSymbol "\\(a\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/quantityValue :constant/Value_FineStructureConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fine-Structure Constant"}})

(def FirstRadiationConstant
  "first radiation constant"
  {:db/ident           :constant/FirstRadiationConstant,
   :qudt/hasQuantityKind :quantitykind/PowerArea,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_FirstRadiationConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "first radiation constant"}})

(def FirstRadiationConstantForSpectralRadiance
  "first radiation constant for spectral radiance"
  {:db/ident :constant/FirstRadiationConstantForSpectralRadiance,
   :qudt/hasQuantityKind :quantitykind/PowerAreaPerSolidAngle,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_FirstRadiationConstantForSpectralRadiance,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value "first radiation constant for spectral radiance"}})

(def GravitationalConstant
  "The gravitational constant (also known as the universal gravitational constant, the Newtonian constant of gravitation, or the Cavendish gravitational constant), denoted by the letter G, is an empirical physical constant involved in the calculation of gravitational effects in Sir Isaac Newton's law of universal gravitation and in Albert Einstein's general theory of relativity. (Wikipedia)"
  {:db/ident :constant/GravitationalConstant,
   :dcterms/description
   "The gravitational constant (also known as the universal gravitational constant, the Newtonian constant of gravitation, or the Cavendish gravitational constant), denoted by the letter G, is an empirical physical constant involved in the calculation of gravitational effects in Sir Isaac Newton's law of universal gravitation and in Albert Einstein's general theory of relativity. (Wikipedia)",
   :qudt/applicableUnit :unit/N-M2-PER-KiloGM2,
   :qudt/hasQuantityKind :quantitykind/GravitationalAttraction,
   :qudt/informativeReference
   "https://en.wikipedia.org/wiki/Gravitational_constant",
   :qudt/quantityValue :constant/Value_GravitationalConstant,
   :qudt/ucumCode "[G]",
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gravitational constant"}})

(def HartreeAtomicMassUnitRelationship
  "hartree-atomic mass unit relationship"
  {:db/ident           :constant/HartreeAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HartreeAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-atomic mass unit relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def HartreeElectronVoltRelationship
  "hartree-electron volt relationship"
  {:db/ident           :constant/HartreeElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HartreeElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-electron volt relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def HartreeEnergy
  "<em>Hartree Energy</em> (symbol: \\(E_h\\) or \\(Ha\\)), also known as the \\(\\textit{Hartree}\\), is the atomic unit of energy. The hartree energy is equal to the absolute value of the electric potential energy of the hydrogen atom in its ground state. The energy of the electron in an H-atom in its ground state is \\(-E_H\\), where \\(E_H= 2 R_\\infty \\cdot hc_0\\). The 2006 CODATA recommended value was \\(E_H = 4.35974394(22) \\times 10^{-18\" J = 27.21138386(68) eV\\)."
  {:db/ident :constant/HartreeEnergy,
   :dcterms/description
   "<em>Hartree Energy</em> (symbol: \\(E_h\\) or \\(Ha\\)), also known as the \\(\\textit{Hartree}\\), is the atomic unit of energy. The hartree energy is equal to the absolute value of the electric potential energy of the hydrogen atom in its ground state. The energy of the electron in an H-atom in its ground state is \\(-E_H\\), where \\(E_H= 2 R_\\infty \\cdot hc_0\\). The 2006 CODATA recommended value was \\(E_H = 4.35974394(22) \\times 10^{-18\" J = 27.21138386(68) eV\\).",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Hartree",
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/latexDefinition
   "\\(E_H= \\frac{e^2}{4\\pi \\varepsilon_0 a_0 }\\), where \\(e\\) is the elementary charge, \\(\\varepsilon_0\\) is the electric constant, and \\(a_0\\) is the Bohr radius.",
   :qudt/latexSymbol "\\(E_h\\)",
   :qudt/quantityValue :constant/Value_HartreeEnergy,
   :rdf/type [:qudt/PhysicalConstant :qudt/AtomicUnit],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hartree Energy"}})

(def HartreeEnergyInEV
  "Hartree energy in eV"
  {:db/ident           :constant/HartreeEnergyInEV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HartreeEnergyInEV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Hartree energy in eV"},
   :skos/closeMatch    "http://dbpedia.org/resource/Hartree"})

(def HartreeHertzRelationship
  "hartree-hertz relationship"
  {:db/ident           :constant/HartreeHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HartreeHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-hertz relationship"}})

(def HartreeInverseMeterRelationship
  "hartree-inverse meter relationship"
  {:db/ident           :constant/HartreeInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HartreeInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-inverse meter relationship"}})

(def HartreeJouleRelationship
  "hartree-joule relationship"
  {:db/ident           :constant/HartreeJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HartreeJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-joule relationship"}})

(def HartreeKelvinRelationship
  "hartree-kelvin relationship"
  {:db/ident           :constant/HartreeKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HartreeKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-kelvin relationship"}})

(def HartreeKilogramRelationship
  "hartree-kilogram relationship"
  {:db/ident           :constant/HartreeKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HartreeKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hartree-kilogram relationship"}})

(def HelionElectronMassRatio
  "helion-electron mass ratio"
  {:db/ident           :constant/HelionElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HelionElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "helion-electron mass ratio"}})

(def HelionMass
  "helion mass"
  {:db/ident           :constant/HelionMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HelionMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "helion mass"}})

(def HelionMassEnergyEquivalent
  "helion mass energy equivalent"
  {:db/ident :constant/HelionMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HelionMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "helion mass energy equivalent"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def HelionMassEnergyEquivalentInMeV
  "helion mass energy equivalent in MeV"
  {:db/ident :constant/HelionMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HelionMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "helion mass energy equivalent in MeV"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def HelionMassInAtomicMassUnit
  "helion mass in atomic mass unit"
  {:db/ident           :constant/HelionMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HelionMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "helion mass in atomic mass unit"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def HelionMolarMass
  "helion molar mass"
  {:db/ident           :constant/HelionMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HelionMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "helion molar mass"}})

(def HelionProtonMassRatio
  "helion-proton mass ratio"
  {:db/ident           :constant/HelionProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HelionProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "helion-proton mass ratio"}})

(def HertzAtomicMassUnitRelationship
  "hertz-atomic mass unit relationship"
  {:db/ident           :constant/HertzAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HertzAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-atomic mass unit relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def HertzElectronVoltRelationship
  "hertz-electron volt relationship"
  {:db/ident           :constant/HertzElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HertzElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-electron volt relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def HertzHartreeRelationship
  "hertz-hartree relationship"
  {:db/ident           :constant/HertzHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HertzHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-hartree relationship"}})

(def HertzInverseMeterRelationship
  "hertz-inverse meter relationship"
  {:db/ident           :constant/HertzInverseMeterRelationship,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HertzInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-inverse meter relationship"}})

(def HertzJouleRelationship
  "hertz-joule relationship"
  {:db/ident           :constant/HertzJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HertzJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-joule relationship"}})

(def HertzKelvinRelationship
  "hertz-kelvin relationship"
  {:db/ident           :constant/HertzKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HertzKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-kelvin relationship"}})

(def HertzKilogramRelationship
  "hertz-kilogram relationship"
  {:db/ident           :constant/HertzKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_HertzKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hertz-kilogram relationship"}})

(def InverseFineStructureConstant
  "inverse fine-structure constant"
  {:db/ident           :constant/InverseFineStructureConstant,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_InverseFineStructureConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse fine-structure constant"},
   :skos/closeMatch    "http://dbpedia.org/resource/Fine-structure_constant"})

(def InverseMeterAtomicMassUnitRelationship
  "inverse meter-atomic mass unit relationship"
  {:db/ident           :constant/InverseMeterAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_InverseMeterAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "inverse meter-atomic mass unit relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def InverseMeterElectronVoltRelationship
  "inverse meter-electron volt relationship"
  {:db/ident           :constant/InverseMeterElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_InverseMeterElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "inverse meter-electron volt relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def InverseMeterHartreeRelationship
  "inverse meter-hartree relationship"
  {:db/ident           :constant/InverseMeterHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_InverseMeterHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse meter-hartree relationship"}})

(def InverseMeterHertzRelationship
  "inverse meter-hertz relationship"
  {:db/ident           :constant/InverseMeterHertzRelationship,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_InverseMeterHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse meter-hertz relationship"}})

(def InverseMeterJouleRelationship
  "inverse meter-joule relationship"
  {:db/ident           :constant/InverseMeterJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_InverseMeterJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse meter-joule relationship"}})

(def InverseMeterKelvinRelationship
  "inverse meter-kelvin relationship"
  {:db/ident           :constant/InverseMeterKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_InverseMeterKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse meter-kelvin relationship"}})

(def InverseMeterKilogramRelationship
  "inverse meter-kilogram relationship"
  {:db/ident           :constant/InverseMeterKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_InverseMeterKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse meter-kilogram relationship"}})

(def InverseOfConductanceQuantum
  "inverse of conductance quantum"
  {:db/ident           :constant/InverseOfConductanceQuantum,
   :qudt/hasQuantityKind :quantitykind/Resistance,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_InverseOfConductanceQuantum,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inverse of conductance quantum"},
   :skos/closeMatch    "http://dbpedia.org/resource/Conductance_quantum"})

(def JosephsonConstant
  "Josephson Constant"
  {:db/ident :constant/JosephsonConstant,
   :qudt/applicableUnit :unit/PER-WB,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Magnetic_flux_quantum",
   :qudt/hasQuantityKind :quantitykind/InverseMagneticFlux,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Magnetic_flux_quantum"],
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31897",
   :qudt/latexDefinition
   "\\(K_J = \\frac{1}{\\Phi_0}\\), where \\(\\Phi_0\\) is the magnetic flux quantum.",
   :qudt/latexSymbol "\\(K_J\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31897",
   :qudt/quantityValue :constant/Value_JosephsonConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Josephson Constant"},
   :skos/closeMatch :quantitykind/MagneticFluxQuantum})

(def JouleAtomicMassUnitRelationship
  "joule-atomic mass unit relationship"
  {:db/ident           :constant/JouleAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_JouleAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-atomic mass unit relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def JouleElectronVoltRelationship
  "joule-electron volt relationship"
  {:db/ident           :constant/JouleElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_JouleElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-electron volt relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def JouleHartreeRelationship
  "joule-hartree relationship"
  {:db/ident           :constant/JouleHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_JouleHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-hartree relationship"}})

(def JouleHertzRelationship
  "joule-hertz relationship"
  {:db/ident           :constant/JouleHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_JouleHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-hertz relationship"}})

(def JouleInverseMeterRelationship
  "joule-inverse meter relationship"
  {:db/ident           :constant/JouleInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_JouleInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-inverse meter relationship"}})

(def JouleKelvinRelationship
  "joule-kelvin relationship"
  {:db/ident           :constant/JouleKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_JouleKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-kelvin relationship"}})

(def JouleKilogramRelationship
  "joule-kilogram relationship"
  {:db/ident           :constant/JouleKilogramRelationship,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_JouleKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "joule-kilogram relationship"}})

(def KelvinAtomicMassUnitRelationship
  "kelvin-atomic mass unit relationship"
  {:db/ident           :constant/KelvinAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KelvinAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-atomic mass unit relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def KelvinElectronVoltRelationship
  "kelvin-electron volt relationship"
  {:db/ident           :constant/KelvinElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KelvinElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-electron volt relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def KelvinHartreeRelationship
  "kelvin-hartree relationship"
  {:db/ident           :constant/KelvinHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KelvinHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-hartree relationship"}})

(def KelvinHertzRelationship
  "kelvin-hertz relationship"
  {:db/ident           :constant/KelvinHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KelvinHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-hertz relationship"}})

(def KelvinInverseMeterRelationship
  "kelvin-inverse meter relationship"
  {:db/ident           :constant/KelvinInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KelvinInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-inverse meter relationship"}})

(def KelvinJouleRelationship
  "kelvin-joule relationship"
  {:db/ident           :constant/KelvinJouleRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KelvinJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-joule relationship"}})

(def KelvinKilogramRelationship
  "kelvin-kilogram relationship"
  {:db/ident           :constant/KelvinKilogramRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KelvinKilogramRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kelvin-kilogram relationship"}})

(def KilogramAtomicMassUnitRelationship
  "kilogram-atomic mass unit relationship"
  {:db/ident           :constant/KilogramAtomicMassUnitRelationship,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KilogramAtomicMassUnitRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-atomic mass unit relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def KilogramElectronVoltRelationship
  "kilogram-electron volt relationship"
  {:db/ident           :constant/KilogramElectronVoltRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KilogramElectronVoltRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-electron volt relationship"},
   :skos/closeMatch    "http://dbpedia.org/resource/Electron_volt"})

(def KilogramHartreeRelationship
  "kilogram-hartree relationship"
  {:db/ident           :constant/KilogramHartreeRelationship,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KilogramHartreeRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-hartree relationship"}})

(def KilogramHertzRelationship
  "kilogram-hertz relationship"
  {:db/ident           :constant/KilogramHertzRelationship,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KilogramHertzRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-hertz relationship"}})

(def KilogramInverseMeterRelationship
  "kilogram-inverse meter relationship"
  {:db/ident           :constant/KilogramInverseMeterRelationship,
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KilogramInverseMeterRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-inverse meter relationship"}})

(def KilogramJouleRelationship
  "Kilogram-Joule Relationship"
  {:db/ident           :constant/KilogramJouleRelationship,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KilogramJouleRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Kilogram-Joule Relationship"}})

(def KilogramKelvinRelationship
  "kilogram-kelvin relationship"
  {:db/ident           :constant/KilogramKelvinRelationship,
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_KilogramKelvinRelationship,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "kilogram-kelvin relationship"}})

(def LatticeParameterOfSilicon
  "lattice parameter of silicon"
  {:db/ident           :constant/LatticeParameterOfSilicon,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_LatticeParameterOfSilicon,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "lattice parameter of silicon"}})

(def LatticeSpacingOfSilicon
  "lattice spacing of silicon"
  {:db/ident           :constant/LatticeSpacingOfSilicon,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_LatticeSpacingOfSilicon,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "lattice spacing of silicon"}})

(def LoschmidtConstant273.15K101.325KPa
  "Loschmidt constant 273.15 K 101.325 kPa"
  {:db/ident           :constant/LoschmidtConstant273.15K101.325KPa,
   :qudt/hasQuantityKind :quantitykind/NumberDensity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_LoschmidtConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "Loschmidt constant 273.15 K 101.325 kPa"},
   :skos/closeMatch    "http://dbpedia.org/resource/Loschmidt_constant"})

(def MagneticConstant
  "\\(\\textbf{Magentic Constant}\\), also known as \\(\\textit{Permeability of Vacuum}\\), is a scalar constant \\(\\mu_0\\) such that, in a vacuum the product with the magnetic field vector, \\(\\overrightarrow{H}\\) is equal to the magnetic flux density vector, \\(\\overrightarrow{B}\\)."
  {:db/ident :constant/MagneticConstant,
   :dcterms/description
   "\\(\\textbf{Magentic Constant}\\), also known as \\(\\textit{Permeability of Vacuum}\\), is a scalar constant \\(\\mu_0\\) such that, in a vacuum the product with the magnetic field vector, \\(\\overrightarrow{H}\\) is equal to the magnetic flux density vector, \\(\\overrightarrow{B}\\).",
   :owl/sameAs :constant/ElectromagneticPermeabilityOfVacuum,
   :qudt/abbreviation "magnetic-constant",
   :qudt/applicableUnit :unit/H-PER-M,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Vacuum_permeability",
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Permittivity,
   :qudt/informativeReference
   ["http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31891"
    "http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://www.electropedia.org/iev/iev.nsf/display?openform&ievref=705-03-14"],
   :qudt/latexDefinition
   "\\(\\mu_0 = \\frac{\\overrightarrow{B}}{\\overrightarrow{H}}\\), where \\(\\overrightarrow{B}\\) is the B-Filed magnetic vector, and \\(\\overrightarrow{H}\\) is the H-Filed magnetic vector. The value of \\(\\mu_0\\) is \\(\\approx 1.256637e-6\\,H/M\\).",
   :qudt/latexSymbol "\\(\\mu_0\\)",
   :qudt/quantityValue :constant/Value_MagneticConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Magnetic Constant"}})

(def MagneticFluxQuantum
  "\"Magnetic Flux Quantum\" is the quantum of magnetic flux passing through a superconductor."
  {:db/ident :constant/MagneticFluxQuantum,
   :dcterms/description
   "\"Magnetic Flux Quantum\" is the quantum of magnetic flux passing through a superconductor.",
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Magnetic_flux_quantum",
   :qudt/hasQuantityKind :quantitykind/MagneticFlux,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Magnetic_flux_quantum"],
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31897",
   :qudt/latexDefinition
   "\\(\\Phi_0 = \\frac{h}{2e}\\), where \\(h\\) is the Planck constant and \\(e\\) is the elementary charge.",
   :qudt/latexSymbol "\\(\\Phi_0\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31897",
   :qudt/quantityValue :constant/Value_MagneticFluxQuantum,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "magnetic flux quantum"}})

(def MoXUnit
  "Mo x unit"
  {:db/ident           :constant/MoXUnit,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MoXUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Mo x unit"},
   :skos/closeMatch    "http://dbpedia.org/resource/X_unit"})

(def MolarGasConstant
  "The \"Molar Gas Constant\" (also known as the gas constant, universal, or ideal gas constant, denoted by the symbol R) is a physical constant which is featured in many fundamental equations in the physical sciences, such as the ideal gas law and the Nernst equation. It is equivalent to the Boltzmann constant, but expressed in units of energy (i.e. the pressure-volume product) per temperature increment per mole (rather than energy per temperature increment per particle)."
  {:db/ident :constant/MolarGasConstant,
   :dcterms/description
   "The \"Molar Gas Constant\" (also known as the gas constant, universal, or ideal gas constant, denoted by the symbol R) is a physical constant which is featured in many fundamental equations in the physical sciences, such as the ideal gas law and the Nernst equation. It is equivalent to the Boltzmann constant, but expressed in units of energy (i.e. the pressure-volume product) per temperature increment per mole (rather than energy per temperature increment per particle).",
   :qudt/abbreviation "j-mol^{-1}-k^{-1}",
   :qudt/applicableUnit :unit/J-PER-MOL-K,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Gas_constant",
   :qudt/exactMatch :constant/UniversalGasConstant,
   :qudt/hasDimensionVector
   "http://qudt.org/vocab/dimensionvector/A-1E0L2I0M1H-1T-2D0",
   :qudt/hasQuantityKind :quantitykind/MolarHeatCapacity,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Gas_constant"],
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31894",
   :qudt/latexDefinition
   "\\(pV_m = RT\\), where \\(p\\) is pressure, \\(V_m\\) is molar volume, and \\(T\\) is thermodynamic temperature.",
   :qudt/latexSymbol "\\(R\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31894",
   :qudt/quantityValue :constant/Value_MolarGasConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "molar gas constant"}})

(def MolarMassConstant
  "molar mass constant"
  {:db/ident           :constant/MolarMassConstant,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Molar_mass_constant",
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MolarMassConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "molar mass constant"}})

(def MolarMassOfCarbon12
  "molar mass of carbon-12"
  {:db/ident           :constant/MolarMassOfCarbon12,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MolarMassOfCarbon12,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "molar mass of carbon-12"}})

(def MolarPlanckConstant
  "molar Planck constant"
  {:db/ident           :constant/MolarPlanckConstant,
   :qudt/hasQuantityKind :quantitykind/MolarAngularMomentum,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MolarPlanckConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "molar Planck constant"},
   :skos/closeMatch    "http://dbpedia.org/resource/Planck_constant"})

(def MolarPlanckConstantTimesC
  "molar Planck constant times c"
  {:db/ident           :constant/MolarPlanckConstantTimesC,
   :qudt/hasQuantityKind :quantitykind/LengthMolarEnergy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MolarPlanckConstantTimesC,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "molar Planck constant times c"},
   :skos/closeMatch    "http://dbpedia.org/resource/Planck_constant"})

(def MolarVolumeOfIdealGas273.15K100KPa
  "molar volume of ideal gas 273.15 K 100 kPa"
  {:db/ident           :constant/MolarVolumeOfIdealGas273.15K100KPa,
   :qudt/hasQuantityKind :quantitykind/MolarVolume,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MolarVolumeOfIdealGas,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "molar volume of ideal gas 273.15 K 100 kPa"}})

(def MolarVolumeOfIdealGas273.15K101.325KPa
  "molar volume of ideal gas 273.15 K 101.325 kPa"
  {:db/ident           :constant/MolarVolumeOfIdealGas273.15K101.325KPa,
   :qudt/hasQuantityKind :quantitykind/MolarVolume,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MolarVolumeOfIdealGas,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "molar volume of ideal gas 273.15 K 101.325 kPa"}})

(def MolarVolumeOfSilicon
  "molar volume of silicon"
  {:db/ident           :constant/MolarVolumeOfSilicon,
   :qudt/hasQuantityKind :quantitykind/MolarVolume,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MolarVolumeOfSilicon,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "molar volume of silicon"}})

(def MuonComptonWavelength
  "muon Compton wavelength"
  {:db/ident           :constant/MuonComptonWavelength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonComptonWavelength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon Compton wavelength"},
   :skos/closeMatch    "http://dbpedia.org/resource/Compton_wavelength"})

(def MuonComptonWavelengthOver2Pi
  "muon Compton wavelength over 2 pi"
  {:db/ident           :constant/MuonComptonWavelengthOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonComptonWavelengthOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon Compton wavelength over 2 pi"},
   :skos/closeMatch    "http://dbpedia.org/resource/Compton_wavelength"})

(def MuonElectronMassRatio
  "muon-electron mass ratio"
  {:db/ident           :constant/MuonElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon-electron mass ratio"}})

(def MuonGFactor
  "muon g factor"
  {:db/ident           :constant/MuonGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon g factor"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def MuonMagneticMoment
  "muon magnetic moment"
  {:db/ident           :constant/MuonMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon magnetic moment"},
   :skos/closeMatch    "http://dbpedia.org/resource/Magnetic_moment"})

(def MuonMagneticMomentAnomaly
  "muon magnetic moment anomaly"
  {:db/ident           :constant/MuonMagneticMomentAnomaly,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonMagneticMomentAnomaly,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon magnetic moment anomaly"},
   :skos/closeMatch    "http://dbpedia.org/resource/Magnetic_moment"})

(def MuonMagneticMomentToBohrMagnetonRatio
  "muon magnetic moment to Bohr magneton ratio"
  {:db/ident           :constant/MuonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonMagneticMomentToBohrMagnetonRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "muon magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Bohr_magneton"})

(def MuonMagneticMomentToNuclearMagnetonRatio
  "muon magnetic moment to nuclear magneton ratio"
  {:db/ident           :constant/MuonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonMagneticMomentToNuclearMagnetonRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "muon magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Nuclear_magneton"})

(def MuonMass
  "muon mass"
  {:db/ident           :constant/MuonMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon mass"}})

(def MuonMassEnergyEquivalent
  "muon mass energy equivalent"
  {:db/ident :constant/MuonMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "muon mass energy equivalent"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def MuonMassEnergyEquivalentInMeV
  "muon mass energy equivalent in MeV"
  {:db/ident :constant/MuonMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "muon mass energy equivalent in MeV"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def MuonMassInAtomicMassUnit
  "muon mass in atomic mass unit"
  {:db/ident           :constant/MuonMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon mass in atomic mass unit"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def MuonMolarMass
  "muon molar mass"
  {:db/ident           :constant/MuonMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon molar mass"}})

(def MuonNeutronMassRatio
  "muon-neutron mass ratio"
  {:db/ident           :constant/MuonNeutronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonNeutronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon-neutron mass ratio"}})

(def MuonProtonMagneticMomentRatio
  "muon-proton magnetic moment ratio"
  {:db/ident           :constant/MuonProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonProtonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon-proton magnetic moment ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def MuonProtonMassRatio
  "muon-proton mass ratio"
  {:db/ident           :constant/MuonProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon-proton mass ratio"}})

(def MuonTauMassRatio
  "muon-tau mass ratio"
  {:db/ident           :constant/MuonTauMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_MuonTauMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "muon-tau mass ratio"}})

(def NaturalUnitOfAction
  "natural unit of action"
  {:db/ident           :constant/NaturalUnitOfAction,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NaturalUnitOfAction,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of action"},
   :skos/closeMatch    "http://dbpedia.org/resource/Natural_units"})

(def NaturalUnitOfActionInEVS
  "natural unit of action in eV s"
  {:db/ident           :constant/NaturalUnitOfActionInEVS,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NaturalUnitOfActionInEVS,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of action in eV s"},
   :skos/closeMatch    "http://dbpedia.org/resource/Natural_units"})

(def NaturalUnitOfEnergy
  "natural unit of energy"
  {:db/ident           :constant/NaturalUnitOfEnergy,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NaturalUnitOfEnergy,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of energy"},
   :skos/closeMatch    "http://dbpedia.org/resource/Natural_units"})

(def NaturalUnitOfEnergyInMeV
  "natural unit of energy in MeV"
  {:db/ident           :constant/NaturalUnitOfEnergyInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NaturalUnitOfEnergyInMeV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of energy in MeV"},
   :skos/closeMatch    "http://dbpedia.org/resource/Natural_units"})

(def NaturalUnitOfLength
  "natural unit of length"
  {:db/ident           :constant/NaturalUnitOfLength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NaturalUnitOfLength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of length"},
   :skos/closeMatch    "http://dbpedia.org/resource/Natural_units"})

(def NaturalUnitOfMass
  "natural unit of mass"
  {:db/ident           :constant/NaturalUnitOfMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NaturalUnitOfMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of mass"},
   :skos/closeMatch    "http://dbpedia.org/resource/Natural_units"})

(def NaturalUnitOfMomentum
  "natural unit of momentum"
  {:db/ident           :constant/NaturalUnitOfMomentum,
   :qudt/hasQuantityKind :quantitykind/LinearMomentum,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NaturalUnitOfMomentum,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of momentum"},
   :skos/closeMatch    "http://dbpedia.org/resource/Natural_units"})

(def NaturalUnitOfMomentumInMeV-PER-c
  "natural unit of momentum in MeV PER c"
  {:db/ident           :constant/NaturalUnitOfMomentumInMeV-PER-c,
   :qudt/hasQuantityKind :quantitykind/LinearMomentum,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NaturalUnitOfMomentumInMeVPerC,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of momentum in MeV PER c"},
   :skos/closeMatch    "http://dbpedia.org/resource/Natural_units"})

(def NaturalUnitOfTime
  "natural unit of time"
  {:db/ident           :constant/NaturalUnitOfTime,
   :qudt/hasQuantityKind :quantitykind/Time,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NaturalUnitOfTime,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of time"},
   :skos/closeMatch    "http://dbpedia.org/resource/Natural_units"})

(def NaturalUnitOfVelocity
  "natural unit of velocity"
  {:db/ident           :constant/NaturalUnitOfVelocity,
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/LinearVelocity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NaturalUnitOfVelocity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "natural unit of velocity"},
   :skos/closeMatch    "http://dbpedia.org/resource/Natural_units"})

(def NeutronComptonWavelength
  "neutron Compton wavelength"
  {:db/ident           :constant/NeutronComptonWavelength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronComptonWavelength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron Compton wavelength"},
   :skos/closeMatch    "http://dbpedia.org/resource/Compton_wavelength"})

(def NeutronComptonWavelengthOver2Pi
  "neutron Compton wavelength over 2 pi"
  {:db/ident           :constant/NeutronComptonWavelengthOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronComptonWavelengthOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron Compton wavelength over 2 pi"},
   :skos/closeMatch    "http://dbpedia.org/resource/Compton_wavelength"})

(def NeutronElectronMagneticMomentRatio
  "neutron-electron magnetic moment ratio"
  {:db/ident :constant/NeutronElectronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronElectronMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "neutron-electron magnetic moment ratio"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"})

(def NeutronElectronMassRatio
  "neutron-electron mass ratio"
  {:db/ident           :constant/NeutronElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron-electron mass ratio"}})

(def NeutronGFactor
  "neutron g factor"
  {:db/ident           :constant/NeutronGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron g factor"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def NeutronGyromagneticRatio
  "neutron gyromagnetic ratio"
  {:db/ident           :constant/NeutronGyromagneticRatio,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronGyromagneticRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron gyromagnetic ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Gyromagnetic_ratio"})

(def NeutronGyromagneticRatioOver2Pi
  "neutron gyromagnetic ratio over 2 pi"
  {:db/ident           :constant/NeutronGyromagneticRatioOver2Pi,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronGyromagneticRatioOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron gyromagnetic ratio over 2 pi"},
   :skos/closeMatch    "http://dbpedia.org/resource/Gyromagnetic_ratio"})

(def NeutronMagneticMoment
  "neutron magnetic moment"
  {:db/ident           :constant/NeutronMagneticMoment,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Neutron_magnetic_moment",
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron magnetic moment"}})

(def NeutronMagneticMomentToBohrMagnetonRatio
  "neutron magnetic moment to Bohr magneton ratio"
  {:db/ident           :constant/NeutronMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronMagneticMomentToBohrMagnetonRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "neutron magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch    ["http://dbpedia.org/resource/Neutron_magnetic_moment"
                        "http://dbpedia.org/resource/Bohr_magneton"]})

(def NeutronMagneticMomentToNuclearMagnetonRatio
  "neutron magnetic moment to nuclear magneton ratio"
  {:db/ident :constant/NeutronMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_NeutronMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value "neutron magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch ["http://dbpedia.org/resource/Nuclear_magneton"
                     "http://dbpedia.org/resource/Neutron_magnetic_moment"]})

(def NeutronMass
  "neutron mass"
  {:db/ident           :constant/NeutronMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron mass"},
   :skos/closeMatch    "http://dbpedia.org/resource/Neutron"})

(def NeutronMassEnergyEquivalent
  "neutron mass energy equivalent"
  {:db/ident :constant/NeutronMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "neutron mass energy equivalent"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def NeutronMassEnergyEquivalentInMeV
  "neutron mass energy equivalent in MeV"
  {:db/ident :constant/NeutronMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "neutron mass energy equivalent in MeV"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def NeutronMassInAtomicMassUnit
  "neutron mass in atomic mass unit"
  {:db/ident           :constant/NeutronMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron mass in atomic mass unit"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def NeutronMolarMass
  "neutron molar mass"
  {:db/ident           :constant/NeutronMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron molar mass"}})

(def NeutronMuonMassRatio
  "neutron-muon mass ratio"
  {:db/ident           :constant/NeutronMuonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronMuonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron-muon mass ratio"}})

(def NeutronProtonMagneticMomentRatio
  "neutron-proton magnetic moment ratio"
  {:db/ident           :constant/NeutronProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronProtonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron-proton magnetic moment ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def NeutronProtonMassRatio
  "neutron-proton mass ratio"
  {:db/ident           :constant/NeutronProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron-proton mass ratio"}})

(def NeutronTauMassRatio
  "neutron-tau mass ratio"
  {:db/ident           :constant/NeutronTauMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NeutronTauMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "neutron-tau mass ratio"}})

(def NeutronToShieldedProtonMagneticMomentRatio
  "neutron to shielded proton magnetic moment ratio"
  {:db/ident :constant/NeutronToShieldedProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_NeutronToShieldedProtonMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value "neutron to shielded proton magnetic moment ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/G-factor"})

(def NewtonianConstantOfGravitation
  "Newtonian constant of gravitation"
  {:db/ident           :constant/NewtonianConstantOfGravitation,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Gravitational_constant",
   :qudt/hasQuantityKind :quantitykind/GravitationalAttraction,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NewtonianConstantOfGravitation,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Newtonian constant of gravitation"}})

(def NuclearMagneton
  "The \"Nuclear Magneton\" is the natural unit for expressing magnetic dipole moments of heavy particles such as nucleons and atomic nuclei."
  {:db/ident :constant/NuclearMagneton,
   :dcterms/description
   "The \"Nuclear Magneton\" is the natural unit for expressing magnetic dipole moments of heavy particles such as nucleons and atomic nuclei.",
   :qudt/applicableUnit :unit/J-PER-T,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Nuclear_magneton",
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Nuclear_magneton"],
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/latexDefinition
   "\\(\\mu_N = \\frac{e\\hbar}{2m_p}\\), where \\(e\\) is the elementary charge, \\(\\hbar\\) is the Planck constant, and \\(m_p\\) is the rest mass of proton.",
   :qudt/latexSymbol "\\(\\mu_N\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/quantityValue :constant/Value_NuclearMagneton,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Nuclear Magneton"},
   :skos/related :quantitykind/BohrMagneton})

(def NuclearMagnetonInEVPerT
  "nuclear magneton in eV per T"
  {:db/ident           :constant/NuclearMagnetonInEVPerT,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NuclearMagnetonInEVPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "nuclear magneton in eV per T"},
   :skos/closeMatch    "http://dbpedia.org/resource/Nuclear_magneton"})

(def NuclearMagnetonInInverseMetersPerTesla
  "nuclear magneton in inverse meters per tesla"
  {:db/ident           :constant/NuclearMagnetonInInverseMetersPerTesla,
   :qudt/hasQuantityKind :quantitykind/MagneticReluctivity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NuclearMagnetonInInverseMetersPerTesla,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "nuclear magneton in inverse meters per tesla"},
   :skos/closeMatch    "http://dbpedia.org/resource/Nuclear_magneton"})

(def NuclearMagnetonInKPerT
  "nuclear magneton in K per T"
  {:db/ident           :constant/NuclearMagnetonInKPerT,
   :qudt/hasQuantityKind :quantitykind/TemperaturePerMagneticFluxDensity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NuclearMagnetonInKPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "nuclear magneton in K per T"},
   :skos/closeMatch    "http://dbpedia.org/resource/Nuclear_magneton"})

(def NuclearMagnetonInMHzPerT
  "nuclear magneton in MHz per T"
  {:db/ident           :constant/NuclearMagnetonInMHzPerT,
   :qudt/hasQuantityKind :quantitykind/ElectricChargePerMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_NuclearMagnetonInMHzPerT,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "nuclear magneton in MHz per T"},
   :skos/closeMatch    "http://dbpedia.org/resource/Nuclear_magneton"})

(def PermittivityOfVacuum
  "\\(\\textbf{Permittivity of Vacuum}\\), also known as the \\(\\textit{electric constant}\\) is a constant whose value is \\(\\approx\\,6.854188e-12\\, farad\\,per\\,metre\\). Sometimes also referred to as the \\(textit{Permittivity of Free Space}\\)."
  {:db/ident :constant/PermittivityOfVacuum,
   :dcterms/description
   "\\(\\textbf{Permittivity of Vacuum}\\), also known as the \\(\\textit{electric constant}\\) is a constant whose value is \\(\\approx\\,6.854188e-12\\, farad\\,per\\,metre\\). Sometimes also referred to as the \\(textit{Permittivity of Free Space}\\).",
   :qudt/applicableUnit :unit/FARAD-PER-M,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Permittivity",
   :qudt/expression "vacuum-permittivity",
   :qudt/hasQuantityKind :quantitykind/Permittivity,
   :qudt/informativeReference
   "http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31891",
   :qudt/latexDefinition
   "\\(\\epsilon = \\frac{\\mathbf{D}}{\\mathbf{E}}\\), where \\(\\mathbf{D}\\) is electric flux density and \\(\\mathbf{E}\\) is electric field strength.",
   :qudt/latexSymbol "\\(\\epsilon_0\\)",
   :qudt/quantityValue :constant/Value_PermittivityOfVacuum,
   :qudt/ucumCode "[eps_0]",
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Permittivity of Vacuum"},
   :rdfs/seeAlso [:quantitykind/ElectricFieldStrength
                  :quantitykind/ElectricFluxDensity
                  :quantitykind/Permittivity]})

(def PlanckConstant
  "The \"Planck Constant\" is a physical constant that is the quantum of action in quantum mechanics. The Planck constant was first described as the proportionality constant between the energy (\\(E\\)) of a photon and the frequency (\\(\\nu\\)) of its associated electromagnetic wave."
  {:db/ident :constant/PlanckConstant,
   :dcterms/description
   "The \"Planck Constant\" is a physical constant that is the quantum of action in quantum mechanics. The Planck constant was first described as the proportionality constant between the energy (\\(E\\)) of a photon and the frequency (\\(\\nu\\)) of its associated electromagnetic wave.",
   :qudt/applicableUnit :unit/J-SEC,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Planck_constant",
   :qudt/hasDimensionVector
   "http://qudt.org/vocab/dimensionvector/A0E0L2I0M1H0T-1D0",
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   ["http://en.wikipedia.org/wiki/Planck_constant"
    "http://physics.nist.gov/cuu/Constants/bibliography.html"],
   :qudt/isMetricUnit true,
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/latexDefinition
   "\\(E = h\\nu = \\frac{hc}{\\lambda}\\), where \\(E\\) is energy, \\(\\nu\\) is frequency, \\(\\lambda\\) is wavelength, and \\(c\\) is the speed of light.",
   :qudt/latexSymbol "\\(h\\)",
   :qudt/quantityValue :constant/Value_PlanckConstant,
   :qudt/ucumCode "[h]",
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Planck Constant"}})

(def PlanckConstantInEVS
  "Planck constant in eV s"
  {:db/ident           :constant/PlanckConstantInEVS,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_PlanckConstantInEVS,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck constant in eV s"},
   :skos/closeMatch    "http://dbpedia.org/resource/Planck_constant"})

(def PlanckConstantOver2Pi
  "Planck constant over 2 pi"
  {:db/ident           :constant/PlanckConstantOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_PlanckConstantOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck constant over 2 pi"},
   :skos/closeMatch    "http://dbpedia.org/resource/Planck_constant"})

(def PlanckConstantOver2PiInEVS
  "Planck constant over 2 pi in eV s"
  {:db/ident           :constant/PlanckConstantOver2PiInEVS,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_PlanckConstantOver2PiInEVS,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck constant over 2 pi in eV s"},
   :skos/closeMatch    "http://dbpedia.org/resource/Planck_constant"})

(def PlanckConstantOver2PiTimesCInMeVFm
  "Planck constant over 2 pi times c in MeV fm"
  {:db/ident           :constant/PlanckConstantOver2PiTimesCInMeVFm,
   :qudt/hasQuantityKind :quantitykind/LengthEnergy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_PlanckConstantOver2PiTimesCInMeVFm,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "Planck constant over 2 pi times c in MeV fm"},
   :skos/closeMatch    "http://dbpedia.org/resource/Planck_constant"})

(def PlanckLength
  "Planck length"
  {:db/ident           :constant/PlanckLength,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Planck_length",
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_PlanckLength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck length"}})

(def PlanckMass
  "Planck mass"
  {:db/ident           :constant/PlanckMass,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Planck_mass",
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_PlanckMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck mass"}})

(def PlanckMassEnergyEquivalentInGeV
  "Planck mass energy equivalent in GeV"
  {:db/ident           :constant/PlanckMassEnergyEquivalentInGeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_PlanckMassEnergyEquivalentInGeV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck mass energy equivalent in GeV"},
   :skos/closeMatch    "http://dbpedia.org/resource/Planck_mass"})

(def PlanckTemperature
  "Planck temperature"
  {:db/ident           :constant/PlanckTemperature,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Planck_temperature",
   :qudt/hasQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_PlanckTemperature,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck temperature"}})

(def PlanckTime
  "Planck time"
  {:db/ident           :constant/PlanckTime,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Planck_time",
   :qudt/hasQuantityKind :quantitykind/Time,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_PlanckTime,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Planck time"}})

(def ProtonChargeToMassQuotient
  "proton charge to mass quotient"
  {:db/ident           :constant/ProtonChargeToMassQuotient,
   :qudt/hasQuantityKind :quantitykind/ElectricChargePerMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonChargeToMassQuotient,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton charge to mass quotient"},
   :skos/closeMatch    "http://dbpedia.org/resource/Mass-to-charge_ratio"})

(def ProtonComptonWavelength
  "proton Compton wavelength"
  {:db/ident           :constant/ProtonComptonWavelength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonComptonWavelength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton Compton wavelength"},
   :skos/closeMatch    "http://dbpedia.org/resource/Compton_wavelength"})

(def ProtonComptonWavelengthOver2Pi
  "proton Compton wavelength over 2 pi"
  {:db/ident           :constant/ProtonComptonWavelengthOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonComptonWavelengthOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton Compton wavelength over 2 pi"},
   :skos/closeMatch    "http://dbpedia.org/resource/Compton_wavelength"})

(def ProtonElectronMassRatio
  "proton-electron mass ratio"
  {:db/ident           :constant/ProtonElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton-electron mass ratio"}})

(def ProtonGFactor
  "proton g factor"
  {:db/ident           :constant/ProtonGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton g factor"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def ProtonGyromagneticRatio
  "proton gyromagnetic ratio"
  {:db/ident           :constant/ProtonGyromagneticRatio,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonGyromagneticRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton gyromagnetic ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Gyromagnetic_ratio"})

(def ProtonGyromagneticRatioOver2Pi
  "proton gyromagnetic ratio over 2 pi"
  {:db/ident           :constant/ProtonGyromagneticRatioOver2Pi,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonGyromagneticRatioOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton gyromagnetic ratio over 2 pi"},
   :skos/closeMatch    "http://dbpedia.org/resource/Gyromagnetic_ratio"})

(def ProtonMagneticMoment
  "proton magnetic moment"
  {:db/ident           :constant/ProtonMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton magnetic moment"},
   :skos/closeMatch    "http://dbpedia.org/resource/Magnetic_moment"})

(def ProtonMagneticMomentToBohrMagnetonRatio
  "proton magnetic moment to Bohr magneton ratio"
  {:db/ident           :constant/ProtonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonMagneticMomentToBohrMagnetonRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "proton magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Bohr_magneton"})

(def ProtonMagneticMomentToNuclearMagnetonRatio
  "proton magnetic moment to nuclear magneton ratio"
  {:db/ident :constant/ProtonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_ProtonMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value "proton magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/Nuclear_magneton"})

(def ProtonMagneticShieldingCorrection
  "proton mag. shielding correction"
  {:db/ident           :constant/ProtonMagneticShieldingCorrection,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonMagneticShieldingCorrection,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton mag. shielding correction"}})

(def ProtonMass
  "proton mass"
  {:db/ident             :constant/ProtonMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue   :constant/Value_ProtonMass,
   :qudt/ucumCode        "[m_p]",
   :rdf/type             :qudt/PhysicalConstant,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/constant",
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "proton mass"},
   :skos/closeMatch      "http://dbpedia.org/resource/Proton"})

(def ProtonMassEnergyEquivalent
  "proton mass energy equivalent"
  {:db/ident :constant/ProtonMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "proton mass energy equivalent"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def ProtonMassEnergyEquivalentInMeV
  "proton mass energy equivalent in MeV"
  {:db/ident :constant/ProtonMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "proton mass energy equivalent in MeV"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def ProtonMassInAtomicMassUnit
  "proton mass in atomic mass unit"
  {:db/ident           :constant/ProtonMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton mass in atomic mass unit"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def ProtonMolarMass
  "proton molar mass"
  {:db/ident           :constant/ProtonMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton molar mass"}})

(def ProtonMuonMassRatio
  "proton-muon mass ratio"
  {:db/ident           :constant/ProtonMuonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonMuonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton-muon mass ratio"}})

(def ProtonNeutronMagneticMomentRatio
  "proton-neutron magnetic moment ratio"
  {:db/ident           :constant/ProtonNeutronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonNeutronMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton-neutron magnetic moment ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Neutron_magnetic_moment"})

(def ProtonNeutronMassRatio
  "proton-neutron mass ratio"
  {:db/ident           :constant/ProtonNeutronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonNeutronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton-neutron mass ratio"}})

(def ProtonRmsChargeRadius
  "proton rms charge radius"
  {:db/ident           :constant/ProtonRmsChargeRadius,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonRmsChargeRadius,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton rms charge radius"},
   :skos/closeMatch    "http://dbpedia.org/resource/Nucleon"})

(def ProtonTauMassRatio
  "proton-tau mass ratio"
  {:db/ident           :constant/ProtonTauMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ProtonTauMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "proton-tau mass ratio"}})

(def QuantumOfCirculation
  "quantum of circulation"
  {:db/ident :constant/QuantumOfCirculation,
   :qudt/hasQuantityKind :quantitykind/Circulation,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_QuantumOfCirculation,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quantum of circulation"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Circulation_%28fluid_dynamics%29"})

(def QuantumOfCirculationTimes2
  "quantum of circulation times 2"
  {:db/ident :constant/QuantumOfCirculationTimes2,
   :qudt/hasQuantityKind :quantitykind/Circulation,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_QuantumOfCirculationTimes2,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quantum of circulation times 2"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Circulation_%28fluid_dynamics%29"})

(def ReducedPlanckConstant
  "\"The \\(\\textit{Reduced Planck Constant}\\), or \\(\\textit{Dirac Constant}\\), is used in applications where frequency is expressed in terms of radians per second (\\(\\textit{angular frequency}\\)) instead of cycles per second. In such cases a factor of \\(\\(2\\pi\\) is absorbed into the constant.\"^^qudt:LatexString"
  {:db/ident :constant/ReducedPlanckConstant,
   :dcterms/description
   "\"The \\(\\textit{Reduced Planck Constant}\\), or \\(\\textit{Dirac Constant}\\), is used in applications where frequency is expressed in terms of radians per second (\\(\\textit{angular frequency}\\)) instead of cycles per second. In such cases a factor of \\(\\(2\\pi\\) is absorbed into the constant.\"^^qudt:LatexString",
   :qudt/applicableUnit :unit/J-SEC,
   :qudt/hasQuantityKind :quantitykind/Action,
   :qudt/informativeReference "http://en.wikipedia.org/wiki/Planck_constant",
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/latexDefinition
   "\\(\\hbar = \\frac{h}{2\\pi}\\), where \\(h\\) is the Planck constant.",
   :qudt/latexSymbol "\\(\\hbar\\)",
   :qudt/quantityValue :constant/Value_PlanckConstantOver2Pi,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reduced Planck Constant"},
   :skos/broader :constant/PlanckConstant})

(def RydbergConstant
  "The Rydberg constant, symbol R, named after the Swedish physicist Johannes Rydberg, is a physical constant relating to atomic spectra, in the science of spectroscopy. The constant first arose as an empirical fitting parameter in the Rydberg formula for the hydrogen spectral series, but Niels Bohr later showed that its value could be calculated from more fundamental constants, explaining the relationship via his 'Bohr model'. The quantity \\(R_y = R_\\infty \\cdot hc_0\\) is called \"Rydberg Energy\"."
  {:db/ident :constant/RydbergConstant,
   :dcterms/description
   "The Rydberg constant, symbol R, named after the Swedish physicist Johannes Rydberg, is a physical constant relating to atomic spectra, in the science of spectroscopy. The constant first arose as an empirical fitting parameter in the Rydberg formula for the hydrogen spectral series, but Niels Bohr later showed that its value could be calculated from more fundamental constants, explaining the relationship via his 'Bohr model'. The quantity \\(R_y = R_\\infty \\cdot hc_0\\) is called \"Rydberg Energy\".",
   :qudt/applicableUnit :unit/PER-M,
   :qudt/dbpediaMatch "http://dbpedia.org/resource/Rydberg_constant",
   :qudt/hasQuantityKind :quantitykind/InverseLength,
   :qudt/informativeReference
   ["http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31895"
    "http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Rydberg_constant"],
   :qudt/isoNormativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/latexDefinition
   "\\(R_\\infty = \\frac{e^2}{8\\pi \\varepsilon_0 a_0 h c_0 }\\), where \\(e\\) is the elementary charge, \\(\\varepsilon_0\\) is the electric constant, \\(a_0\\)is the Bohr radius, \\(\\h\\) is the Planck constant, and \\(c_0\\) is the speed of light in vacuum.",
   :qudt/latexSymbol "\\(\\(R_\\infty\\)\\)",
   :qudt/normativeReference
   "http://www.iso.org/iso/catalogue_detail?csnumber=31895",
   :qudt/quantityValue :constant/Value_RydbergConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rydberg constant"}})

(def RydbergConstantTimesCInHz
  "Rydberg constant times c in Hz"
  {:db/ident           :constant/RydbergConstantTimesCInHz,
   :qudt/hasQuantityKind :quantitykind/Frequency,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_RydbergConstantTimesCInHz,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Rydberg constant times c in Hz"},
   :skos/closeMatch    "http://dbpedia.org/resource/Rydberg_constant"})

(def RydbergConstantTimesHcInEV
  "Rydberg constant times hc in eV"
  {:db/ident           :constant/RydbergConstantTimesHcInEV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_RydbergConstantTimesHcInEV,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Rydberg constant times hc in eV"},
   :skos/closeMatch    "http://dbpedia.org/resource/Rydberg_constant"})

(def RydbergConstantTimesHcInJ
  "Rydberg constant times hc in J"
  {:db/ident           :constant/RydbergConstantTimesHcInJ,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_RydbergConstantTimesHcInJ,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Rydberg constant times hc in J"},
   :skos/closeMatch    "http://dbpedia.org/resource/Rydberg_constant"})

(def SackurTetrodeConstant1K100KPa
  "Sackur-Tetrode constant 1 K 100 kPa"
  {:db/ident           :constant/SackurTetrodeConstant1K100KPa,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_SackurTetrodeConstant1K100KPa,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Sackur-Tetrode constant 1 K 100 kPa"}})

(def SackurTetrodeConstant1K101.325KPa
  "Sackur-Tetrode constant 1 K 101.325 kPa"
  {:db/ident           :constant/SackurTetrodeConstant1K101.325KPa,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_SackurTetrodeConstant1K101.325K,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "Sackur-Tetrode constant 1 K 101.325 kPa"}})

(def SecondRadiationConstant
  "second radiation constant"
  {:db/ident           :constant/SecondRadiationConstant,
   :qudt/hasQuantityKind :quantitykind/LengthTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_SecondRadiationConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "second radiation constant"}})

(def ShieldedHelionGyromagneticRatio
  "shielded helion gyromagnetic ratio"
  {:db/ident           :constant/ShieldedHelionGyromagneticRatio,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ShieldedHelionGyromagneticRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "shielded helion gyromagnetic ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Gyromagnetic_ratio"})

(def ShieldedHelionGyromagneticRatioOver2Pi
  "shielded helion gyromagnetic ratio over 2 pi"
  {:db/ident           :constant/ShieldedHelionGyromagneticRatioOver2Pi,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ShieldedHelionGyromagneticRatioOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "shielded helion gyromagnetic ratio over 2 pi"},
   :skos/closeMatch    "http://dbpedia.org/resource/Gyromagnetic_ratio"})

(def ShieldedHelionMagneticMoment
  "shielded helion magnetic moment"
  {:db/ident           :constant/ShieldedHelionMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ShieldedHelionMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "shielded helion magnetic moment"},
   :skos/closeMatch    "http://dbpedia.org/resource/Magnetic_moment"})

(def ShieldedHelionMagneticMomentToBohrMagnetonRatio
  "shielded helion magnetic moment to Bohr magneton ratio"
  {:db/ident :constant/ShieldedHelionMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_ShieldedHelionMagneticMomentToBohrMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "shielded helion magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/Bohr_magneton"})

(def ShieldedHelionMagneticMomentToNuclearMagnetonRatio
  "shielded helion magnetic moment to nuclear magneton ratio"
  {:db/ident :constant/ShieldedHelionMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_ShieldedHelionMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "shielded helion magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/Nuclear_magneton"})

(def ShieldedHelionToProtonMagneticMomentRatio
  "shielded helion to proton magnetic moment ratio"
  {:db/ident :constant/ShieldedHelionToProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_ShieldedHelionToProtonMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value "shielded helion to proton magnetic moment ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/G-factor"})

(def ShieldedHelionToShieldedProtonMagneticMomentRatio
  "shielded helion to shielded proton magnetic moment ratio"
  {:db/ident :constant/ShieldedHelionToShieldedProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_ShieldedHelionToShieldedProtonMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "shielded helion to shielded proton magnetic moment ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/G-factor"})

(def ShieldedProtonGyromagneticRatio
  "shielded proton gyromagnetic ratio"
  {:db/ident           :constant/ShieldedProtonGyromagneticRatio,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ShieldedProtonGyromagneticRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "shielded proton gyromagnetic ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Gyromagnetic_ratio"})

(def ShieldedProtonGyromagneticRatioOver2Pi
  "shielded proton gyromagnetic ratio over 2 pi"
  {:db/ident           :constant/ShieldedProtonGyromagneticRatioOver2Pi,
   :qudt/hasQuantityKind :quantitykind/GyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ShieldedProtonGyromagneticRatioOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "shielded proton gyromagnetic ratio over 2 pi"},
   :skos/closeMatch    "http://dbpedia.org/resource/Gyromagnetic_ratio"})

(def ShieldedProtonMagneticMoment
  "shielded proton magnetic moment"
  {:db/ident           :constant/ShieldedProtonMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ShieldedProtonMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "shielded proton magnetic moment"},
   :skos/closeMatch    "http://dbpedia.org/resource/Magnetic_moment"})

(def ShieldedProtonMagneticMomentToBohrMagnetonRatio
  "shielded proton magnetic moment to Bohr magneton ratio"
  {:db/ident :constant/ShieldedProtonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_ShieldedProtonMagneticMomentToBohrMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "shielded proton magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/Bohr_magneton"})

(def ShieldedProtonMagneticMomentToNuclearMagnetonRatio
  "shielded proton magnetic moment to nuclear magneton ratio"
  {:db/ident :constant/ShieldedProtonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_ShieldedProtonMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "shielded proton magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/Nuclear_magneton"})

(def SpeedOfLight_Vacuum
  "The speed of light in vacuum, commonly is a universal physical constant important in many areas of physics. Its value is 299,792,458 metres per second, a figure that is exact because the length of the metre is defined from this constant and the international standard for time."
  {:db/ident :constant/SpeedOfLight_Vacuum,
   :dcterms/description
   "The speed of light in vacuum, commonly is a universal physical constant important in many areas of physics. Its value is 299,792,458 metres per second, a figure that is exact because the length of the metre is defined from this constant and the international standard for time.",
   :qudt/conversionOffset 0.0,
   :qudt/hasQuantityKind :quantitykind/Speed,
   :qudt/informativeReference
   ["http://dbpedia.org/resource/Speed_of_light"
    "http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://en.wikipedia.org/wiki/Speed_of_light"
    "http://www.electropedia.org/iev/iev.nsf/display?openform&ievref=113-01-34"
    "http://www.iso.org/iso/home/store/catalogue_tc/catalogue_detail.htm?csnumber=31891"],
   :qudt/latexDefinition
   "\\(c_0 = 1 / \\sqrt{\\epsilon_0 \\mu_0}\\), where {\\epsilon_0} is the permittivity of vacuum, and \\(\\mu_0\\) is the magnetic constant.",
   :qudt/latexSymbol "\\(C_0\\)",
   :qudt/quantityValue [:constant/Value_SpeedOfLight_Vacuum_Imperial
                        :constant/Value_SpeedOfLight_Vacuum],
   :qudt/ucumCode "[c]",
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Speed of Light (vacuum)"},
   :rdfs/seeAlso [:constant/PermittivityOfVacuum :constant/MagneticConstant]})

(def StandardAccelerationOfGravity
  "standard acceleration of gravity"
  {:db/ident           :constant/StandardAccelerationOfGravity,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Standard_gravity",
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/LinearAcceleration,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_StandardAccelerationOfGravity,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "standard acceleration of gravity"}})

(def StandardAtmosphere
  "standard atmosphere"
  {:db/ident           :constant/StandardAtmosphere,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Standard_atmosphere",
   :qudt/exactConstant true,
   :qudt/hasQuantityKind :quantitykind/Pressure,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_StandardAtmosphere,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "standard atmosphere"}})

(def StefanBoltzmannConstant
  "Stefan-Boltzmann Constant"
  {:db/ident :constant/StefanBoltzmannConstant,
   :qudt/dbpediaMatch
   "http://dbpedia.org/resource/Stefan%E2%80%93Boltzmann_constant",
   :qudt/hasQuantityKind :quantitykind/PowerPerAreaQuarticTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_StefanBoltzmannConstant,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Stefan-Boltzmann Constant"}})

(def TauComptonWavelength
  "tau Compton wavelength"
  {:db/ident           :constant/TauComptonWavelength,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TauComptonWavelength,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau Compton wavelength"},
   :skos/closeMatch    "http://dbpedia.org/resource/Compton_wavelength"})

(def TauComptonWavelengthOver2Pi
  "tau Compton wavelength over 2 pi"
  {:db/ident           :constant/TauComptonWavelengthOver2Pi,
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TauComptonWavelengthOver2Pi,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau Compton wavelength over 2 pi"},
   :skos/closeMatch    "http://dbpedia.org/resource/Compton_wavelength"})

(def TauElectronMassRatio
  "tau-electron mass ratio"
  {:db/ident           :constant/TauElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TauElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau-electron mass ratio"}})

(def TauMass
  "tau mass"
  {:db/ident           :constant/TauMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TauMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau mass"}})

(def TauMassEnergyEquivalent
  "tau mass energy equivalent"
  {:db/ident :constant/TauMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TauMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tau mass energy equivalent"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def TauMassEnergyEquivalentInMeV
  "tau mass energy equivalent in MeV"
  {:db/ident :constant/TauMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TauMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tau mass energy equivalent in MeV"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def TauMassInAtomicMassUnit
  "tau mass in atomic mass unit"
  {:db/ident           :constant/TauMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TauMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau mass in atomic mass unit"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def TauMolarMass
  "tau molar mass"
  {:db/ident           :constant/TauMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TauMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau molar mass"}})

(def TauMuonMassRatio
  "tau-muon mass ratio"
  {:db/ident           :constant/TauMuonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TauMuonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau-muon mass ratio"}})

(def TauNeutronMassRatio
  "tau-neutron mass ratio"
  {:db/ident           :constant/TauNeutronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TauNeutronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau-neutron mass ratio"}})

(def TauProtonMassRatio
  "tau-proton mass ratio"
  {:db/ident           :constant/TauProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TauProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "tau-proton mass ratio"}})

(def ThomsonCrossSection
  "Thomson cross section"
  {:db/ident           :constant/ThomsonCrossSection,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Thomson_scattering",
   :qudt/hasQuantityKind :quantitykind/Area,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_ThomsonCrossSection,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Thomson cross section"}})

(def TritonElectronMagneticMomentRatio
  "triton-electron magnetic moment ratio"
  {:db/ident :constant/TritonElectronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonElectronMagneticMomentRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "triton-electron magnetic moment ratio"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Electron_magnetic_dipole_moment"})

(def TritonElectronMassRatio
  "triton-electron mass ratio"
  {:db/ident           :constant/TritonElectronMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonElectronMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton-electron mass ratio"}})

(def TritonGFactor
  "triton g factor"
  {:db/ident           :constant/TritonGFactor,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonGFactor,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton g factor"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def TritonMagneticMoment
  "triton magnetic moment"
  {:db/ident           :constant/TritonMagneticMoment,
   :qudt/hasQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonMagneticMoment,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton magnetic moment"},
   :skos/closeMatch    "http://dbpedia.org/resource/Magnetic_moment"})

(def TritonMagneticMomentToBohrMagnetonRatio
  "triton magnetic moment to Bohr magneton ratio"
  {:db/ident           :constant/TritonMagneticMomentToBohrMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonMagneticMomentToBohrMagnetonRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value
                        "triton magnetic moment to Bohr magneton ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Bohr_magneton"})

(def TritonMagneticMomentToNuclearMagnetonRatio
  "triton magnetic moment to nuclear magneton ratio"
  {:db/ident :constant/TritonMagneticMomentToNuclearMagnetonRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue
   :constant/Value_TritonMagneticMomentToNuclearMagnetonRatio,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value "triton magnetic moment to nuclear magneton ratio"},
   :skos/closeMatch "http://dbpedia.org/resource/Nuclear_magneton"})

(def TritonMass
  "triton mass"
  {:db/ident           :constant/TritonMass,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton mass"}})

(def TritonMassEnergyEquivalent
  "triton mass energy equivalent"
  {:db/ident :constant/TritonMassEnergyEquivalent,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonMassEnergyEquivalent,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "triton mass energy equivalent"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def TritonMassEnergyEquivalentInMeV
  "triton mass energy equivalent in MeV"
  {:db/ident :constant/TritonMassEnergyEquivalentInMeV,
   :qudt/hasQuantityKind :quantitykind/Energy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonMassEnergyEquivalentInMeV,
   :rdf/type :qudt/PhysicalConstant,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/constant",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "triton mass energy equivalent in MeV"},
   :skos/closeMatch
   "http://dbpedia.org/resource/Mass%E2%80%93energy_equivalence"})

(def TritonMassInAtomicMassUnit
  "triton mass in atomic mass unit"
  {:db/ident           :constant/TritonMassInAtomicMassUnit,
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonMassInAtomicMassUnit,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton mass in atomic mass unit"},
   :skos/closeMatch    "http://dbpedia.org/resource/Atomic_mass_unit"})

(def TritonMolarMass
  "triton molar mass"
  {:db/ident           :constant/TritonMolarMass,
   :qudt/hasQuantityKind :quantitykind/MolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonMolarMass,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton molar mass"}})

(def TritonNeutronMagneticMomentRatio
  "triton-neutron magnetic moment ratio"
  {:db/ident           :constant/TritonNeutronMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonNeutronMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton-neutron magnetic moment ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/Neutron_magnetic_moment"})

(def TritonProtonMagneticMomentRatio
  "triton-proton magnetic moment ratio"
  {:db/ident           :constant/TritonProtonMagneticMomentRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonProtonMagneticMomentRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton-proton magnetic moment ratio"},
   :skos/closeMatch    "http://dbpedia.org/resource/G-factor"})

(def TritonProtonMassRatio
  "triton-proton mass ratio"
  {:db/ident           :constant/TritonProtonMassRatio,
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_TritonProtonMassRatio,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "triton-proton mass ratio"}})

(def UnifiedAtomicMassUnit
  "unified atomic mass unit"
  {:db/ident             :constant/UnifiedAtomicMassUnit,
   :qudt/dbpediaMatch    "http://dbpedia.org/resource/Atomic_mass_unit",
   :qudt/hasQuantityKind :quantitykind/Mass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue   :constant/Value_UnifiedAtomicMassUnit,
   :qudt/ucumCode        "u",
   :rdf/type             :qudt/PhysicalConstant,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/constant",
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "unified atomic mass unit"}})

(def UniversalGasConstant
  "Universal Gas Constant"
  {:db/ident           :constant/UniversalGasConstant,
   :qudt/exactMatch    :constant/MolarGasConstant,
   :qudt/hasDimensionVector
   "http://qudt.org/vocab/dimensionvector/A-1E0L2I0M1H-1T-2D0",
   :qudt/latexSymbol   "\\(R\\)",
   :qudt/plainTextDescription
   "The gas constant (also known as the molar, universal, or ideal gas constant) is a physical constant which is featured in many fundamental equations in the physical sciences, such as the ideal gas law and the Nernst equation.\nPhysically, the gas constant is the constant of proportionality that happens to relate the energy scale in physics to the temperature scale, when a mole of particles at the stated temperature is being considered.",
   :qudt/quantityValue :constant/Value_MolarGasConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Universal Gas Constant"}})

(def ValueForElectronVolt
  "Value for electron volt"
  {:db/ident          :constant/ValueForElectronVolt,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/numericValue 1.602176487E-19,
   :qudt/standardUncertainty 4.0E-27,
   :qudt/unit         :unit/J,
   :qudt/value        1.602176634E-19,
   :rdf/type          :qudt/ConstantValue,
   :rdfs/label        "Value for electron volt",
   :vaem/website      "http://physics.nist.gov/cgi-bin/cuu/Value?tevj#mid"})

(def Value_AlphaParticleElectronMassRatio
  "Value for alpha particle-electron mass ratio"
  {:db/ident     :constant/Value_AlphaParticleElectronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.1E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   7294.299537,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle-electron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?malsme#mid"})

(def Value_AlphaParticleMass
  "Value for alpha particle mass"
  {:db/ident :constant/Value_AlphaParticleMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/relativeStandardUncertainty 5.0E-8,
   :qudt/standardUncertainty 3.3E-34,
   :qudt/unit :unit/KiloGM,
   :qudt/value 6.6446562E-27,
   :rdf/type :qudt/ConstantValue,
   :rdfs/label "Value for alpha particle mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mal#mid"})

(def Value_AlphaParticleMassEnergyEquivalent
  "Value for alpha particle mass energy equivalent"
  {:db/ident     :constant/Value_AlphaParticleMassEnergyEquivalent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.0E-17,
   :qudt/unit    :unit/J,
   :qudt/value   5.97191917E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle mass energy equivalent",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?malc2#mid"})

(def Value_AlphaParticleMassEnergyEquivalentInMeV
  "Value for alpha particle mass energy equivalent in MeV"
  {:db/ident     :constant/Value_AlphaParticleMassEnergyEquivalentInMeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 9.3E-5,
   :qudt/unit    :unit/MegaEV,
   :qudt/value   3727.379109,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle mass energy equivalent in MeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?malc2mev#mid"})

(def Value_AlphaParticleMassInAtomicMassUnit
  "Value for alpha particle mass in atomic mass unit"
  {:db/ident     :constant/Value_AlphaParticleMassInAtomicMassUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.2E-11,
   :qudt/unit    :unit/U,
   :qudt/value   4.001506179127,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle mass in atomic mass unit",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?malu#mid"})

(def Value_AlphaParticleMolarMass
  "Value for alpha particle molar mass"
  {:db/ident     :constant/Value_AlphaParticleMolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.2E-14,
   :qudt/unit    :unit/KiloGM-PER-MOL,
   :qudt/value   0.004001506179127,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle molar mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmal#mid"})

(def Value_AlphaParticleProtonMassRatio
  "Value for alpha particle-proton mass ratio"
  {:db/ident     :constant/Value_AlphaParticleProtonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.1E-10,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   3.97259968951,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for alpha particle-proton mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?malsmp#mid"})

(def Value_AngstromStar
  "Value for Angstrom star"
  {:db/ident     :constant/Value_AngstromStar,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 9.0E-17,
   :qudt/unit    :unit/M,
   :qudt/value   1.00001498E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Angstrom star",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?angstar#mid"})

(def Value_AtomicMassConstant
  "Value for atomic mass constant"
  {:db/ident     :constant/Value_AtomicMassConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.3E-35,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   1.660538782E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?u#mid"})

(def Value_AtomicMassConstantEnergyEquivalent
  "Value for atomic mass constant energy equivalent"
  {:db/ident     :constant/Value_AtomicMassConstantEnergyEquivalent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.4E-18,
   :qudt/unit    :unit/J,
   :qudt/value   1.49241783E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass constant energy equivalent",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tuj#mid"})

(def Value_AtomicMassConstantEnergyEquivalentInMeV
  "Value for atomic mass constant energy equivalent in MeV"
  {:db/ident     :constant/Value_AtomicMassConstantEnergyEquivalentInMeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-5,
   :qudt/unit    :unit/MegaEV,
   :qudt/value   931.494028,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass constant energy equivalent in MeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muc2mev#mid"})

(def Value_AtomicMassUnitElectronVoltRelationship
  "Value for atomic mass unit-electron volt relationship"
  {:db/ident     :constant/Value_AtomicMassUnitElectronVoltRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 23.0,
   :qudt/unit    :unit/EV,
   :qudt/value   9.31494028E8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-electron volt relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?uev#mid"})

(def Value_AtomicMassUnitHartreeRelationship
  "Value for atomic mass unit-hartree relationship"
  {:db/ident     :constant/Value_AtomicMassUnitHartreeRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 0.049,
   :qudt/unit    :unit/E_h,
   :qudt/value   3.4231777149E7,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-hartree relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?uhr#mid"})

(def Value_AtomicMassUnitHertzRelationship
  "Value for atomic mass unit-hertz relationship"
  {:db/ident     :constant/Value_AtomicMassUnitHertzRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.2E14,
   :qudt/unit    :unit/HZ,
   :qudt/value   2.2523427369E23,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-hertz relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?uhz#mid"})

(def Value_AtomicMassUnitInverseMeterRelationship
  "Value for atomic mass unit-inverse meter relationship"
  {:db/ident     :constant/Value_AtomicMassUnitInverseMeterRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1100000.0,
   :qudt/unit    :unit/PER-M,
   :qudt/value   7.513006671E14,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-inverse meter relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?uminv#mid"})

(def Value_AtomicMassUnitJouleRelationship
  "Value for atomic mass unit-joule relationship"
  {:db/ident     :constant/Value_AtomicMassUnitJouleRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.4E-18,
   :qudt/unit    :unit/J,
   :qudt/value   1.49241783E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-joule relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?uj#mid"})

(def Value_AtomicMassUnitKelvinRelationship
  "Value for atomic mass unit-kelvin relationship"
  {:db/ident     :constant/Value_AtomicMassUnitKelvinRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.9E7,
   :qudt/unit    :unit/K,
   :qudt/value   1.0809527E13,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-kelvin relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?uk#mid"})

(def Value_AtomicMassUnitKilogramRelationship
  "Value for atomic mass unit-kilogram relationship"
  {:db/ident     :constant/Value_AtomicMassUnitKilogramRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.3E-35,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   1.660538782E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic mass unit-kilogram relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?ukg#mid"})

(def Value_AtomicUnitOf1stHyperpolarizability
  "Value for atomic unit of 1st hyperpolarizability"
  {:db/ident     :constant/Value_AtomicUnitOf1stHyperpolarizability,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.1E-61,
   :qudt/unit    :unit/C3-M-PER-J2,
   :qudt/value   3.206361533E-53,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of 1st hyperpolarizability",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?auhypol#mid"})

(def Value_AtomicUnitOf2ndHyperpolarizability
  "Value for atomic unit of 2nd hyperpolarizability"
  {:db/ident     :constant/Value_AtomicUnitOf2ndHyperpolarizability,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.1E-72,
   :qudt/unit    :unit/C4-M4-PER-J3,
   :qudt/value   6.23538095E-65,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of 2nd hyperpolarizability",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?au2hypol#mid"})

(def Value_AtomicUnitOfAction
  "Value for atomic unit of action"
  {:db/ident     :constant/Value_AtomicUnitOfAction,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.3E-42,
   :qudt/unit    :unit/J-SEC,
   :qudt/value   1.054571628E-34,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of action",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tthbar#mid"})

(def Value_AtomicUnitOfCharge
  "Value for atomic unit of charge"
  {:db/ident     :constant/Value_AtomicUnitOfCharge,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.0E-27,
   :qudt/unit    :unit/C,
   :qudt/value   1.602176487E-19,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of charge",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?te#mid"})

(def Value_AtomicUnitOfChargeDensity
  "Value for atomic unit of charge density"
  {:db/ident     :constant/Value_AtomicUnitOfChargeDensity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 27000.0,
   :qudt/unit    :unit/C-PER-M3,
   :qudt/value   1.0812023E12,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of charge density",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?aucd#mid"})

(def Value_AtomicUnitOfCurrent
  "Value for atomic unit of current"
  {:db/ident     :constant/Value_AtomicUnitOfCurrent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.7E-10,
   :qudt/unit    :unit/A,
   :qudt/value   0.00662361763,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of current",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?aucur#mid"})

(def Value_AtomicUnitOfElectricDipoleMoment
  "Value for atomic unit of electric dipole mom."
  {:db/ident     :constant/Value_AtomicUnitOfElectricDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.1E-37,
   :qudt/unit    :unit/C-M,
   :qudt/value   8.47835281E-30,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric dipole mom.",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?auedm#mid"})

(def Value_AtomicUnitOfElectricField
  "Value for atomic unit of electric field"
  {:db/ident     :constant/Value_AtomicUnitOfElectricField,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 13000.0,
   :qudt/unit    :unit/V-PER-M,
   :qudt/value   5.14220632E11,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric field",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?auefld#mid"})

(def Value_AtomicUnitOfElectricFieldGradient
  "Value for atomic unit of electric field gradient"
  {:db/ident     :constant/Value_AtomicUnitOfElectricFieldGradient,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.4E14,
   :qudt/unit    :unit/V-PER-M2,
   :qudt/value   9.71736166E21,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric field gradient",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?auefg#mid"})

(def Value_AtomicUnitOfElectricPolarizability
  "Value for atomic unit of electric polarizability"
  {:db/ident     :constant/Value_AtomicUnitOfElectricPolarizability,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.4E-50,
   :qudt/unit    :unit/C2-M-PER-J,
   :qudt/value   1.6487772536E-41,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric polarizability",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?auepol#mid"})

(def Value_AtomicUnitOfElectricPotential
  "Value for atomic unit of electric potential"
  {:db/ident     :constant/Value_AtomicUnitOfElectricPotential,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.8E-7,
   :qudt/unit    :unit/V,
   :qudt/value   27.21138386,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric potential",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?auep#mid"})

(def Value_AtomicUnitOfElectricQuadrupoleMoment
  "Value for atomic unit of electric quadrupole moment"
  {:db/ident     :constant/Value_AtomicUnitOfElectricQuadrupoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-47,
   :qudt/unit    :unit/C-M2,
   :qudt/value   4.48655107E-40,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of electric quadrupole moment",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?aueqm#mid"})

(def Value_AtomicUnitOfEnergy
  "Value for atomic unit of energy"
  {:db/ident     :constant/Value_AtomicUnitOfEnergy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.2E-25,
   :qudt/unit    :unit/J,
   :qudt/value   4.35974394E-18,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of energy",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?thr#mid"})

(def Value_AtomicUnitOfForce
  "Value for atomic unit of force"
  {:db/ident     :constant/Value_AtomicUnitOfForce,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.1E-15,
   :qudt/unit    :unit/N,
   :qudt/value   8.23872206E-8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of force",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?auforce#mid"})

(def Value_AtomicUnitOfLength
  "Value for atomic unit of length"
  {:db/ident     :constant/Value_AtomicUnitOfLength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.6E-20,
   :qudt/unit    :unit/M,
   :qudt/value   5.2917720859E-11,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of length",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tbohrrada0#mid"})

(def Value_AtomicUnitOfMagneticDipoleMoment
  "Value for atomic unit of magnetic dipole moment"
  {:db/ident     :constant/Value_AtomicUnitOfMagneticDipoleMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.6E-31,
   :qudt/unit    :unit/J-PER-T,
   :qudt/value   1.85480183E-23,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of magnetic dipole moment",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?aumdm#mid"})

(def Value_AtomicUnitOfMagneticFluxDensity
  "Value for atomic unit of magnetic flux density"
  {:db/ident     :constant/Value_AtomicUnitOfMagneticFluxDensity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 0.0059,
   :qudt/unit    :unit/T,
   :qudt/value   235051.7382,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of magnetic flux density",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?aumfd#mid"})

(def Value_AtomicUnitOfMagnetizability
  "Value for atomic unit of magnetizability"
  {:db/ident     :constant/Value_AtomicUnitOfMagnetizability,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.7E-37,
   :qudt/unit    :unit/J-PER-T2,
   :qudt/value   7.891036433E-29,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of magnetizability",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?aumag#mid"})

(def Value_AtomicUnitOfMass
  "Value for atomic unit of mass"
  {:db/ident     :constant/Value_AtomicUnitOfMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.5E-38,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   9.10938215E-31,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?ttme#mid"})

(def Value_AtomicUnitOfMomentum
  "Value for atomic unit of momentum"
  {:db/ident     :constant/Value_AtomicUnitOfMomentum,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 9.9E-32,
   :qudt/unit    :unit/KiloGM-M-PER-SEC,
   :qudt/value   1.992851565E-24,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of momentum",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?aumom#mid"})

(def Value_AtomicUnitOfPermittivity
  "Value for atomic unit of permittivity"
  {:db/ident     :constant/Value_AtomicUnitOfPermittivity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/FARAD-PER-M,
   :qudt/value   1.112650056E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of permittivity",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?auperm#mid"})

(def Value_AtomicUnitOfTime
  "Value for atomic unit of time"
  {:db/ident     :constant/Value_AtomicUnitOfTime,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.6E-12,
   :qudt/unit    :unit/SEC,
   :qudt/value   2.418884326505E-17,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of time",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?aut#mid"})

(def Value_AtomicUnitOfVelocity
  "Value for atomic unit of velocity"
  {:db/ident     :constant/Value_AtomicUnitOfVelocity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 0.0015,
   :qudt/unit    :unit/M-PER-SEC,
   :qudt/value   2187691.2541,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for atomic unit of velocity",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?auvel#mid"})

(def Value_AvogadroConstant
  "Value for Avogadro constant"
  {:db/ident     :constant/Value_AvogadroConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.0E16,
   :qudt/unit    :unit/PER-MOL,
   :qudt/value   6.02214179E23,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Avogadro constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?na#mid"})

(def Value_BohrMagneton
  "Value for Bohr magneton"
  {:db/ident     :constant/Value_BohrMagneton,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-31,
   :qudt/unit    :unit/J-PER-T,
   :qudt/value   9.27400915E-24,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr magneton",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mub#mid"})

(def Value_BohrMagnetonInEVPerT
  "Value for Bohr magneton in eV per T"
  {:db/ident     :constant/Value_BohrMagnetonInEVPerT,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.9E-14,
   :qudt/unit    :unit/EV-PER-T,
   :qudt/value   5.7883817555E-5,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr magneton in eV per T",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mubev#mid"})

(def Value_BohrMagnetonInHzPerT
  "Value for Bohr magneton in Hz perT"
  {:db/ident     :constant/Value_BohrMagnetonInHzPerT,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 350.0,
   :qudt/unit    :unit/HZ-PER-T,
   :qudt/value   1.399624604E10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr magneton in Hz perT",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mubshhz#mid"})

(def Value_BohrMagnetonInInverseMetersPerTesla
  "Value for Bohr magneton in inverse meters per tesla"
  {:db/ident     :constant/Value_BohrMagnetonInInverseMetersPerTesla,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.2E-6,
   :qudt/unit    :unit/PER-T-M,
   :qudt/value   46.6864515,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr magneton in inverse meters per tesla",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mubshcminv#mid"})

(def Value_BohrMagnetonInKPerT
  "Value for Bohr magneton in K per T"
  {:db/ident     :constant/Value_BohrMagnetonInKPerT,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.2E-6,
   :qudt/unit    :unit/K-PER-T,
   :qudt/value   0.6717131,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr magneton in K per T",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mubskk#mid"})

(def Value_BohrRadius
  "Value for Bohr radius"
  {:db/ident     :constant/Value_BohrRadius,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.6E-20,
   :qudt/unit    :unit/M,
   :qudt/value   5.2917720859E-11,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Bohr radius",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?bohrrada0#mid"})

(def Value_BoltzmannConstant
  "Value for Boltzmann constant"
  {:db/ident     :constant/Value_BoltzmannConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.4E-29,
   :qudt/unit    :unit/J-PER-K,
   :qudt/value   1.3806504E-23,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Boltzmann constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?k#mid"})

(def Value_BoltzmannConstantInEVPerK
  "Value for Boltzmann constant in eV per K"
  {:db/ident     :constant/Value_BoltzmannConstantInEVPerK,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.5E-10,
   :qudt/unit    :unit/EV-PER-K,
   :qudt/value   8.617343E-5,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Boltzmann constant in eV per K",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tkev#mid"})

(def Value_BoltzmannConstantInHzPerK
  "Value for Boltzmann constant in Hz per K"
  {:db/ident     :constant/Value_BoltzmannConstantInHzPerK,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 36000.0,
   :qudt/unit    :unit/HZ-PER-K,
   :qudt/value   2.0836644E10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Boltzmann constant in Hz per K",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kshhz#mid"})

(def Value_BoltzmannConstantInInverseMetersPerKelvin
  "Value for Boltzmann constant in inverse meters per kelvin"
  {:db/ident     :constant/Value_BoltzmannConstantInInverseMetersPerKelvin,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.2E-4,
   :qudt/unit    :unit/PER-M-K,
   :qudt/value   69.50356,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Boltzmann constant in inverse meters per kelvin",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kshcminv#mid"})

(def Value_CharacteristicImpedanceOfVacuum
  "Value for characteristic impedance of vacuum"
  {:db/ident     :constant/Value_CharacteristicImpedanceOfVacuum,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/OHM,
   :qudt/value   376.730313461,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for characteristic impedance of vacuum",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?z0#mid"})

(def Value_ClassicalElectronRadius
  "Value for classical electron radius"
  {:db/ident     :constant/Value_ClassicalElectronRadius,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.8E-24,
   :qudt/unit    :unit/M,
   :qudt/value   2.8179402894E-15,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for classical electron radius",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?re#mid"})

(def Value_ComptonWavelength
  "Value for Compton wavelength"
  {:db/ident     :constant/Value_ComptonWavelength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.3E-21,
   :qudt/unit    :unit/M,
   :qudt/value   2.4263102175E-12,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Compton wavelength",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?ecomwl#mid"})

(def Value_ComptonWavelengthOver2Pi
  "Value for Compton wavelength over 2 pi"
  {:db/ident     :constant/Value_ComptonWavelengthOver2Pi,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.3E-22,
   :qudt/unit    :unit/M,
   :qudt/value   3.8615926459E-13,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Compton wavelength over 2 pi",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?ecomwlbar#mid"})

(def Value_ConductanceQuantum
  "Value for conductance quantum"
  {:db/ident     :constant/Value_ConductanceQuantum,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.3E-14,
   :qudt/unit    :unit/S,
   :qudt/value   7.7480917004E-5,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for conductance quantum",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?conqu2e2sh#mid"})

(def Value_ConventionalValueOfJosephsonConstant
  "Value for conventional value of Josephson constant"
  {:db/ident     :constant/Value_ConventionalValueOfJosephsonConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/HZ-PER-V,
   :qudt/value   4.835979E14,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for conventional value of Josephson constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kj90#mid"})

(def Value_ConventionalValueOfVonKlitzingConstant
  "Value for conventional value of von Klitzing constant"
  {:db/ident     :constant/Value_ConventionalValueOfVonKlitzingConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/OHM,
   :qudt/value   25812.807,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for conventional value of von Klitzing constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?rk90#mid"})

(def Value_CuXUnit
  "Value for Cu x unit"
  {:db/ident     :constant/Value_CuXUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.8E-20,
   :qudt/unit    :unit/M,
   :qudt/value   1.00207699E-13,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Cu x unit",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?xucukalph1#mid"})

(def Value_DeuteronElectronMagneticMomentRatio
  "Value for deuteron-electron magnetic moment ratio"
  {:db/ident     :constant/Value_DeuteronElectronMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.9E-12,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -4.664345537E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron-electron magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mudsmuem#mid"})

(def Value_DeuteronElectronMassRatio
  "Value for deuteron-electron mass ratio"
  {:db/ident     :constant/Value_DeuteronElectronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.6E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   3670.4829654,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron-electron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mdsme#mid"})

(def Value_DeuteronGFactor
  "Value for deuteron g factor"
  {:db/ident     :constant/Value_DeuteronGFactor,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.2E-9,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.8574382308,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron g factor",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gdn#mid"})

(def Value_DeuteronMagneticMoment
  "Value for deuteron magnetic moment"
  {:db/ident     :constant/Value_DeuteronMagneticMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-34,
   :qudt/unit    :unit/J-PER-T,
   :qudt/value   4.33073465E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron magnetic moment",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mud#mid"})

(def Value_DeuteronMagneticMomentToBohrMagnetonRatio
  "Value for deuteron magnetic moment to Bohr magneton ratio"
  {:db/ident     :constant/Value_DeuteronMagneticMomentToBohrMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.9E-12,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   4.669754556E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron magnetic moment to Bohr magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mudsmub#mid"})

(def Value_DeuteronMagneticMomentToNuclearMagnetonRatio
  "Value for deuteron magnetic moment to nuclear magneton ratio"
  {:db/ident     :constant/Value_DeuteronMagneticMomentToNuclearMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.2E-9,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.8574382308,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron magnetic moment to nuclear magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mudsmun#mid"})

(def Value_DeuteronMass
  "Value for deuteron mass"
  {:db/ident     :constant/Value_DeuteronMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.7E-34,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   3.3435832E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?md#mid"})

(def Value_DeuteronMassEnergyEquivalent
  "Value for deuteron mass energy equivalent"
  {:db/ident     :constant/Value_DeuteronMassEnergyEquivalent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.5E-17,
   :qudt/unit    :unit/J,
   :qudt/value   3.00506272E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron mass energy equivalent",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mdc2#mid"})

(def Value_DeuteronMassEnergyEquivalentInMeV
  "Value for deuteron mass energy equivalent in MeV"
  {:db/ident     :constant/Value_DeuteronMassEnergyEquivalentInMeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.7E-5,
   :qudt/unit    :unit/MegaEV,
   :qudt/value   1875.612793,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron mass energy equivalent in MeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mdc2mev#mid"})

(def Value_DeuteronMassInAtomicMassUnit
  "Deuteron Mass (amu)"
  {:db/ident     :constant/Value_DeuteronMassInAtomicMassUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.8E-11,
   :qudt/unit    :unit/U,
   :qudt/value   2.013553212724,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Deuteron Mass (amu)",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mdu#mid"})

(def Value_DeuteronMolarMass
  "Value for deuteron molar mass"
  {:db/ident     :constant/Value_DeuteronMolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.8E-14,
   :qudt/unit    :unit/KiloGM-PER-MOL,
   :qudt/value   0.002013553212724,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron molar mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmd#mid"})

(def Value_DeuteronNeutronMagneticMomentRatio
  "Value for deuteron-neutron magnetic moment ratio"
  {:db/ident     :constant/Value_DeuteronNeutronMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -0.44820652,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron-neutron magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mudsmunn#mid"})

(def Value_DeuteronProtonMagneticMomentRatio
  "Value for deuteron-proton magnetic moment ratio"
  {:db/ident     :constant/Value_DeuteronProtonMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.4E-9,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.307012207,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron-proton magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mudsmup#mid"})

(def Value_DeuteronProtonMassRatio
  "Value for deuteron-proton mass ratio"
  {:db/ident     :constant/Value_DeuteronProtonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.2E-10,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   1.99900750108,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron-proton mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mdsmp#mid"})

(def Value_DeuteronRmsChargeRadius
  "Value for deuteron rms charge radius"
  {:db/ident     :constant/Value_DeuteronRmsChargeRadius,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.8E-18,
   :qudt/unit    :unit/M,
   :qudt/value   2.1402E-15,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for deuteron rms charge radius",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?rd#mid"})

(def Value_ElectricConstant
  "Value for electric constant"
  {:db/ident     :constant/Value_ElectricConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/FARAD-PER-M,
   :qudt/value   8.854187817E-12,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electric constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?ep0#mid"})

(def Value_ElectronChargeToMassQuotient
  "Value for electron charge to mass quotient"
  {:db/ident     :constant/Value_ElectronChargeToMassQuotient,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4400.0,
   :qudt/unit    :unit/C-PER-KiloGM,
   :qudt/value   -1.75882015E11,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron charge to mass quotient",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?esme#mid"})

(def Value_ElectronDeuteronMagneticMomentRatio
  "Value for electron-deuteron magnetic moment ratio"
  {:db/ident     :constant/Value_ElectronDeuteronMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.8E-5,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -2143.923498,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-deuteron magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmud#mid"})

(def Value_ElectronDeuteronMassRatio
  "Value for electron-deuteron mass ratio"
  {:db/ident     :constant/Value_ElectronDeuteronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.2E-13,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   2.7244371093E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-deuteron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mesmd#mid"})

(def Value_ElectronGFactor
  "Value for electron g factor"
  {:db/ident     :constant/Value_ElectronGFactor,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.5E-12,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -2.0023193043622,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron g factor",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gem#mid"})

(def Value_ElectronGyromagneticRatio
  "Value for electron gyromagnetic ratio"
  {:db/ident     :constant/Value_ElectronGyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4400.0,
   :qudt/unit    :unit/PER-T-SEC,
   :qudt/value   1.76085977E11,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron gyromagnetic ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gammae#mid"})

(def Value_ElectronGyromagneticRatioOver2Pi
  "Value for electron gyromagnetic ratio over 2 pi"
  {:db/ident     :constant/Value_ElectronGyromagneticRatioOver2Pi,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.0E-4,
   :qudt/unit    :unit/MegaHZ-PER-T,
   :qudt/value   28024.95364,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron gyromagnetic ratio over 2 pi",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gammaebar#mid"})

(def Value_ElectronMagneticMoment
  "Value for electron magnetic moment"
  {:db/ident     :constant/Value_ElectronMagneticMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-31,
   :qudt/unit    :unit/J-PER-T,
   :qudt/value   -9.28476377E-24,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron magnetic moment",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muem#mid"})

(def Value_ElectronMagneticMomentAnomaly
  "Value for electron magnetic moment anomaly"
  {:db/ident     :constant/Value_ElectronMagneticMomentAnomaly,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.4E-13,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.00115965218111,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron magnetic moment anomaly",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?ae#mid"})

(def Value_ElectronMagneticMomentToBohrMagnetonRatio
  "Value for electron magnetic moment to Bohr magneton ratio"
  {:db/ident     :constant/Value_ElectronMagneticMomentToBohrMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.4E-13,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -1.00115965218111,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron magnetic moment to Bohr magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmub#mid"})

(def Value_ElectronMagneticMomentToNuclearMagnetonRatio
  "Value for electron magnetic moment to nuclear magneton ratio"
  {:db/ident     :constant/Value_ElectronMagneticMomentToNuclearMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.0E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -1838.28197092,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron magnetic moment to nuclear magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmun#mid"})

(def Value_ElectronMass
  "Value for electron mass"
  {:db/ident     :constant/Value_ElectronMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.5E-38,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   9.10938215E-31,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?me#mid"})

(def Value_ElectronMassEnergyEquivalent
  "Value for electron mass energy equivalent"
  {:db/ident     :constant/Value_ElectronMassEnergyEquivalent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.1E-21,
   :qudt/unit    :unit/J,
   :qudt/value   8.18710438E-14,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron mass energy equivalent",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mec2#mid"})

(def Value_ElectronMassEnergyEquivalentInMeV
  "Value for electron mass energy equivalent in MeV"
  {:db/ident     :constant/Value_ElectronMassEnergyEquivalentInMeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.3E-8,
   :qudt/unit    :unit/MegaEV,
   :qudt/value   0.51099891,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron mass energy equivalent in MeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mec2mev#mid"})

(def Value_ElectronMassInAtomicMassUnit
  "Electron Mass (amu)"
  {:db/ident     :constant/Value_ElectronMassInAtomicMassUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-13,
   :qudt/unit    :unit/U,
   :qudt/value   5.4857990943E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Electron Mass (amu)",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?meu#mid"})

(def Value_ElectronMolarMass
  "Value for electron molar mass"
  {:db/ident     :constant/Value_ElectronMolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-16,
   :qudt/unit    :unit/KiloGM-PER-MOL,
   :qudt/value   5.4857990943E-7,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron molar mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mme#mid"})

(def Value_ElectronMuonMagneticMomentRatio
  "Value for electron-muon magnetic moment ratio"
  {:db/ident     :constant/Value_ElectronMuonMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.2E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   206.7669877,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-muon magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmumum#mid"})

(def Value_ElectronMuonMassRatio
  "Value for electron-muon mass ratio"
  {:db/ident     :constant/Value_ElectronMuonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.2E-10,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.00483633171,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-muon mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mesmmu#mid"})

(def Value_ElectronNeutronMagneticMomentRatio
  "Value for electron-neutron magnetic moment ratio"
  {:db/ident     :constant/Value_ElectronNeutronMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-4,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   960.9205,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-neutron magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmunn#mid"})

(def Value_ElectronNeutronMassRatio
  "Value for electron-neutron mass ratio"
  {:db/ident     :constant/Value_ElectronNeutronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.3E-13,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   5.4386734459E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-neutron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mesmn#mid"})

(def Value_ElectronProtonMagneticMomentRatio
  "Value for electron-proton magnetic moment ratio"
  {:db/ident     :constant/Value_ElectronProtonMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.4E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -658.2106848,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-proton magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmup#mid"})

(def Value_ElectronProtonMassRatio
  "Value for electron-proton mass ratio"
  {:db/ident     :constant/Value_ElectronProtonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.4E-13,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   5.4461702177E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-proton mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mesmp#mid"})

(def Value_ElectronTauMassRatio
  "Value for electron-tau mass ratio"
  {:db/ident     :constant/Value_ElectronTauMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.7E-8,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   2.87564E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron-tau mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mesmtau#mid"})

(def Value_ElectronToAlphaParticleMassRatio
  "Value for electron to alpha particle mass ratio"
  {:db/ident     :constant/Value_ElectronToAlphaParticleMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.8E-14,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   1.3709335557E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron to alpha particle mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mesmalpha#mid"})

(def Value_ElectronToShieldedHelionMagneticMomentRatio
  "Value for electron to shielded helion magnetic moment ratio"
  {:db/ident     :constant/Value_ElectronToShieldedHelionMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.0E-5,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   864.058257,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron to shielded helion magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmuhp#mid"})

(def Value_ElectronToShieldedProtonMagneticMomentRatio
  "Value for electron to shielded proton magnetic moment ratio"
  {:db/ident     :constant/Value_ElectronToShieldedProtonMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.2E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -658.2275971,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron to shielded proton magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muemsmupp#mid"})

(def Value_ElectronVoltAtomicMassUnitRelationship
  "Value for electron volt-atomic mass unit relationship"
  {:db/ident     :constant/Value_ElectronVoltAtomicMassUnitRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.7E-17,
   :qudt/unit    :unit/U,
   :qudt/value   1.073544188E-9,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-atomic mass unit relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?evu#mid"})

(def Value_ElectronVoltHartreeRelationship
  "Value for electron volt-hartree relationship"
  {:db/ident     :constant/Value_ElectronVoltHartreeRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 9.2E-10,
   :qudt/unit    :unit/E_h,
   :qudt/value   0.0367493254,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-hartree relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?evhr#mid"})

(def Value_ElectronVoltHertzRelationship
  "Value for electron volt-hertz relationship"
  {:db/ident     :constant/Value_ElectronVoltHertzRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6000000.0,
   :qudt/unit    :unit/HZ,
   :qudt/value   2.417989454E14,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-hertz relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?evhz#mid"})

(def Value_ElectronVoltInverseMeterRelationship
  "Value for electron volt-inverse meter relationship"
  {:db/ident     :constant/Value_ElectronVoltInverseMeterRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 0.02,
   :qudt/unit    :unit/PER-M,
   :qudt/value   806554.465,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-inverse meter relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?evminv#mid"})

(def Value_ElectronVoltJouleRelationship
  "Value for electron volt-joule relationship"
  {:db/ident     :constant/Value_ElectronVoltJouleRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.0E-27,
   :qudt/unit    :unit/J,
   :qudt/value   1.602176487E-19,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-joule relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?evj#mid"})

(def Value_ElectronVoltKelvinRelationship
  "Value for electron volt-kelvin relationship"
  {:db/ident     :constant/Value_ElectronVoltKelvinRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 0.02,
   :qudt/unit    :unit/K,
   :qudt/value   11604.505,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-kelvin relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?evk#mid"})

(def Value_ElectronVoltKilogramRelationship
  "Value for electron volt-kilogram relationship"
  {:db/ident     :constant/Value_ElectronVoltKilogramRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.4E-44,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   1.782661758E-36,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for electron volt-kilogram relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?evkg#mid"})

(def Value_ElementaryCharge
  "Value for elementary charge"
  {:db/ident     :constant/Value_ElementaryCharge,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.0E-27,
   :qudt/unit    :unit/C,
   :qudt/value   1.602176487E-19,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for elementary charge",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?e#mid"})

(def Value_ElementaryChargeOverH
  "Value for elementary charge over h"
  {:db/ident     :constant/Value_ElementaryChargeOverH,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6000000.0,
   :qudt/unit    :unit/A-PER-J,
   :qudt/value   2.417989454E14,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for elementary charge over h",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?esh#mid"})

(def Value_FaradayConstant
  "Value for Faraday constant"
  {:db/ident     :constant/Value_FaradayConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 0.0024,
   :qudt/unit    :unit/C-PER-MOL,
   :qudt/value   96485.3399,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Faraday constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?f#mid"})

(def Value_FaradayConstantForConventionalElectricCurrent
  "Faraday constant for conventional electric current"
  {:db/ident     :constant/Value_FaradayConstantForConventionalElectricCurrent,
   :qudt/unit    :unit/C-PER-MOL,
   :qudt/value   96485.33212,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Faraday constant for conventional electric current",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?f90#mid"})

(def Value_FermiCouplingConstant
  "Value for Fermi coupling constant"
  {:db/ident     :constant/Value_FermiCouplingConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.0E-10,
   :qudt/unit    :unit/PER-GigaEV2,
   :qudt/value   1.16637E-5,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Fermi coupling constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gf#mid"})

(def Value_FineStructureConstant
  "Value for fine-structure constant"
  {:db/ident     :constant/Value_FineStructureConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.0E-12,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.0072973525376,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for fine-structure constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?alph#mid"})

(def Value_FirstRadiationConstant
  "Value for first radiation constant"
  {:db/ident     :constant/Value_FirstRadiationConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.9E-23,
   :qudt/unit    :unit/W-M2,
   :qudt/value   3.74177118E-16,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for first radiation constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?c11strc#mid"})

(def Value_FirstRadiationConstantForSpectralRadiance
  "Value for first radiation constant for spectral radiance"
  {:db/ident     :constant/Value_FirstRadiationConstantForSpectralRadiance,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.9E-24,
   :qudt/unit    :unit/W-M2-PER-SR,
   :qudt/value   1.191042759E-16,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for first radiation constant for spectral radiance",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?c1l#mid"})

(def Value_GravitationalConstant
  "Value for gravitational constant"
  {:db/ident   :constant/Value_GravitationalConstant,
   :qudt/informativeReference
   "https://en.wikipedia.org/wiki/Gravitational_constant",
   :qudt/unit  :unit/N-M2-PER-KiloGM2,
   :qudt/value 6.674E-11,
   :rdf/type   :qudt/ConstantValue,
   :rdfs/label "Value for gravitational constant"})

(def Value_HartreeAtomicMassUnitRelationship
  "Value for hartree-atomic mass unit relationship"
  {:db/ident     :constant/Value_HartreeAtomicMassUnitRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.2E-17,
   :qudt/unit    :unit/U,
   :qudt/value   2.9212622986E-8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-atomic mass unit relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hru#mid"})

(def Value_HartreeElectronVoltRelationship
  "Value for hartree-electron volt relationship"
  {:db/ident     :constant/Value_HartreeElectronVoltRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.8E-7,
   :qudt/unit    :unit/EV,
   :qudt/value   27.21138386,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-electron volt relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hrev#mid"})

(def Value_HartreeEnergy
  "Value for Hartree energy"
  {:db/ident     :constant/Value_HartreeEnergy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.2E-25,
   :qudt/unit    :unit/J,
   :qudt/value   4.35974394E-18,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Hartree energy",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hr#mid"})

(def Value_HartreeEnergyInEV
  "Value for Hartree energy in eV"
  {:db/ident     :constant/Value_HartreeEnergyInEV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.8E-7,
   :qudt/unit    :unit/EV,
   :qudt/value   27.21138386,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Hartree energy in eV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?threv#mid"})

(def Value_HartreeHertzRelationship
  "Value for hartree-hertz relationship"
  {:db/ident     :constant/Value_HartreeHertzRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 44000.0,
   :qudt/unit    :unit/HZ,
   :qudt/value   6.579683920722E15,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-hertz relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hrhz#mid"})

(def Value_HartreeInverseMeterRelationship
  "Value for hartree-inverse meter relationship"
  {:db/ident     :constant/Value_HartreeInverseMeterRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.5E-4,
   :qudt/unit    :unit/PER-M,
   :qudt/value   2.194746313705E7,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-inverse meter relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hrminv#mid"})

(def Value_HartreeJouleRelationship
  "Value for hartree-joule relationship"
  {:db/ident     :constant/Value_HartreeJouleRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.2E-25,
   :qudt/unit    :unit/J,
   :qudt/value   4.35974394E-18,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-joule relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hrj#mid"})

(def Value_HartreeKelvinRelationship
  "Value for hartree-kelvin relationship"
  {:db/ident     :constant/Value_HartreeKelvinRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 0.55,
   :qudt/unit    :unit/K,
   :qudt/value   315774.65,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-kelvin relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hrk#mid"})

(def Value_HartreeKilogramRelationship
  "Value for hartree-kilogram relationship"
  {:db/ident     :constant/Value_HartreeKilogramRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.4E-42,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   4.85086934E-35,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hartree-kilogram relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hrkg#mid"})

(def Value_HelionElectronMassRatio
  "Value for helion-electron mass ratio"
  {:db/ident     :constant/Value_HelionElectronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.2E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   5495.8852765,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion-electron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mhsme#mid"})

(def Value_HelionMass
  "Value for helion mass"
  {:db/ident     :constant/Value_HelionMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.5E-34,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   5.00641192E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mh#mid"})

(def Value_HelionMassEnergyEquivalent
  "Value for helion mass energy equivalent"
  {:db/ident     :constant/Value_HelionMassEnergyEquivalent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.2E-17,
   :qudt/unit    :unit/J,
   :qudt/value   4.49953864E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion mass energy equivalent",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mhc2#mid"})

(def Value_HelionMassEnergyEquivalentInMeV
  "Value for helion mass energy equivalent in MeV"
  {:db/ident     :constant/Value_HelionMassEnergyEquivalentInMeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.0E-5,
   :qudt/unit    :unit/MegaEV,
   :qudt/value   2808.391383,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion mass energy equivalent in MeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mhc2mev#mid"})

(def Value_HelionMassInAtomicMassUnit
  "Helion Mass (amu)"
  {:db/ident     :constant/Value_HelionMassInAtomicMassUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.6E-9,
   :qudt/unit    :unit/U,
   :qudt/value   3.0149322473,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Helion Mass (amu)",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mhu#mid"})

(def Value_HelionMolarMass
  "Value for helion molar mass"
  {:db/ident     :constant/Value_HelionMolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.6E-12,
   :qudt/unit    :unit/KiloGM-PER-MOL,
   :qudt/value   0.0030149322473,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion molar mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmh#mid"})

(def Value_HelionProtonMassRatio
  "Value for helion-proton mass ratio"
  {:db/ident     :constant/Value_HelionProtonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.6E-9,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   2.9931526713,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for helion-proton mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mhsmp#mid"})

(def Value_HertzAtomicMassUnitRelationship
  "Value for hertz-atomic mass unit relationship"
  {:db/ident     :constant/Value_HertzAtomicMassUnitRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.4E-33,
   :qudt/unit    :unit/U,
   :qudt/value   4.4398216294E-24,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-atomic mass unit relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hzu#mid"})

(def Value_HertzElectronVoltRelationship
  "Value for hertz-electron volt relationship"
  {:db/ident     :constant/Value_HertzElectronVoltRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.0E-22,
   :qudt/unit    :unit/EV,
   :qudt/value   4.13566733E-15,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-electron volt relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hzev#mid"})

(def Value_HertzHartreeRelationship
  "Value for hertz-hartree relationship"
  {:db/ident     :constant/Value_HertzHartreeRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.0E-12,
   :qudt/unit    :unit/E_h,
   :qudt/value   1.519829846006E-16,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-hartree relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hzhr#mid"})

(def Value_HertzInverseMeterRelationship
  "Value for hertz-inverse meter relationship"
  {:db/ident     :constant/Value_HertzInverseMeterRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/PER-M,
   :qudt/value   3.335640951E-9,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-inverse meter relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hzminv#mid"})

(def Value_HertzJouleRelationship
  "Value for hertz-joule relationship"
  {:db/ident     :constant/Value_HertzJouleRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.3E-41,
   :qudt/unit    :unit/J,
   :qudt/value   6.62606896E-34,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-joule relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hzj#mid"})

(def Value_HertzKelvinRelationship
  "Value for hertz-kelvin relationship"
  {:db/ident     :constant/Value_HertzKelvinRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.4E-17,
   :qudt/unit    :unit/K,
   :qudt/value   4.7992374E-11,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-kelvin relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hzk#mid"})

(def Value_HertzKilogramRelationship
  "Value for hertz-kilogram relationship"
  {:db/ident     :constant/Value_HertzKilogramRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.7E-58,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   7.372496E-51,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for hertz-kilogram relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hzkg#mid"})

(def Value_InverseFineStructureConstant
  "Value for inverse fine-structure constant"
  {:db/ident     :constant/Value_InverseFineStructureConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 9.4E-8,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   137.035999679,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse fine-structure constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?alphinv#mid"})

(def Value_InverseMeterAtomicMassUnitRelationship
  "Value for inverse meter-atomic mass unit relationship"
  {:db/ident     :constant/Value_InverseMeterAtomicMassUnitRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.9E-24,
   :qudt/unit    :unit/U,
   :qudt/value   1.3310250394E-15,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-atomic mass unit relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?minvu#mid"})

(def Value_InverseMeterElectronVoltRelationship
  "Value for inverse meter-electron volt relationship"
  {:db/ident     :constant/Value_InverseMeterElectronVoltRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.1E-14,
   :qudt/unit    :unit/EV,
   :qudt/value   1.239841875E-6,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-electron volt relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?minvev#mid"})

(def Value_InverseMeterHartreeRelationship
  "Value for inverse meter-hartree relationship"
  {:db/ident     :constant/Value_InverseMeterHartreeRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.0E-19,
   :qudt/unit    :unit/E_h,
   :qudt/value   4.55633525276E-8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-hartree relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?minvhr#mid"})

(def Value_InverseMeterHertzRelationship
  "Value for inverse meter-hertz relationship"
  {:db/ident     :constant/Value_InverseMeterHertzRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/HZ,
   :qudt/value   2.99792458E8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-hertz relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?minvhz#mid"})

(def Value_InverseMeterJouleRelationship
  "Value for inverse meter-joule relationship"
  {:db/ident     :constant/Value_InverseMeterJouleRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 9.9E-33,
   :qudt/unit    :unit/J,
   :qudt/value   1.986445501E-25,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-joule relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?minvj#mid"})

(def Value_InverseMeterKelvinRelationship
  "Value for inverse meter-kelvin relationship"
  {:db/ident     :constant/Value_InverseMeterKelvinRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.5E-8,
   :qudt/unit    :unit/K,
   :qudt/value   0.014387752,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-kelvin relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?minvk#mid"})

(def Value_InverseMeterKilogramRelationship
  "Value for inverse meter-kilogram relationship"
  {:db/ident     :constant/Value_InverseMeterKilogramRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-49,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   2.2102187E-42,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse meter-kilogram relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?minvkg#mid"})

(def Value_InverseOfConductanceQuantum
  "Value for inverse of conductance quantum"
  {:db/ident     :constant/Value_InverseOfConductanceQuantum,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.8E-6,
   :qudt/unit    :unit/OHM,
   :qudt/value   12906.4037787,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for inverse of conductance quantum",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?invconqu#mid"})

(def Value_JosephsonConstant
  "Value for Josephson constant"
  {:db/ident     :constant/Value_JosephsonConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.2E7,
   :qudt/unit    :unit/HZ-PER-V,
   :qudt/value   4.83597891E14,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Josephson constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kjos#mid"})

(def Value_JouleAtomicMassUnitRelationship
  "Value for joule-atomic mass unit relationship"
  {:db/ident     :constant/Value_JouleAtomicMassUnitRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 330.0,
   :qudt/unit    :unit/U,
   :qudt/value   6.70053641E9,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-atomic mass unit relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?ju#mid"})

(def Value_JouleElectronVoltRelationship
  "Value for joule-electron volt relationship"
  {:db/ident     :constant/Value_JouleElectronVoltRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.6E11,
   :qudt/unit    :unit/EV,
   :qudt/value   6.24150965E18,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-electron volt relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?jev#mid"})

(def Value_JouleHartreeRelationship
  "Value for joule-hartree relationship"
  {:db/ident     :constant/Value_JouleHartreeRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E10,
   :qudt/unit    :unit/E_h,
   :qudt/value   2.29371269E17,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-hartree relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?jhr#mid"})

(def Value_JouleHertzRelationship
  "Value for joule-hertz relationship"
  {:db/ident     :constant/Value_JouleHertzRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.5E25,
   :qudt/unit    :unit/HZ,
   :qudt/value   1.50919045E33,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-hertz relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?jhz#mid"})

(def Value_JouleInverseMeterRelationship
  "Value for joule-inverse meter relationship"
  {:db/ident     :constant/Value_JouleInverseMeterRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.5E17,
   :qudt/unit    :unit/PER-M,
   :qudt/value   5.03411747E24,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-inverse meter relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?jminv#mid"})

(def Value_JouleKelvinRelationship
  "Value for joule-kelvin relationship"
  {:db/ident     :constant/Value_JouleKelvinRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.3E17,
   :qudt/unit    :unit/K,
   :qudt/value   7.242963E22,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-kelvin relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?jk#mid"})

(def Value_JouleKilogramRelationship
  "Value for joule-kilogram relationship"
  {:db/ident     :constant/Value_JouleKilogramRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/KiloGM,
   :qudt/value   1.112650056E-17,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for joule-kilogram relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?jkg#mid"})

(def Value_KelvinAtomicMassUnitRelationship
  "Value for kelvin-atomic mass unit relationship"
  {:db/ident     :constant/Value_KelvinAtomicMassUnitRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.6E-19,
   :qudt/unit    :unit/U,
   :qudt/value   9.251098E-14,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-atomic mass unit relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?ku#mid"})

(def Value_KelvinElectronVoltRelationship
  "Value for kelvin-electron volt relationship"
  {:db/ident     :constant/Value_KelvinElectronVoltRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.5E-10,
   :qudt/unit    :unit/EV,
   :qudt/value   8.617343E-5,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-electron volt relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kev#mid"})

(def Value_KelvinHartreeRelationship
  "Value for kelvin-hartree relationship"
  {:db/ident     :constant/Value_KelvinHartreeRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.5E-12,
   :qudt/unit    :unit/E_h,
   :qudt/value   3.1668153E-6,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-hartree relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?khr#mid"})

(def Value_KelvinHertzRelationship
  "Value for kelvin-hertz relationship"
  {:db/ident     :constant/Value_KelvinHertzRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 36000.0,
   :qudt/unit    :unit/HZ,
   :qudt/value   2.0836644E10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-hertz relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?khz#mid"})

(def Value_KelvinInverseMeterRelationship
  "Value for kelvin-inverse meter relationship"
  {:db/ident     :constant/Value_KelvinInverseMeterRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.2E-4,
   :qudt/unit    :unit/PER-M,
   :qudt/value   69.50356,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-inverse meter relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kminv#mid"})

(def Value_KelvinJouleRelationship
  "Value for kelvin-joule relationship"
  {:db/ident     :constant/Value_KelvinJouleRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.4E-29,
   :qudt/unit    :unit/J,
   :qudt/value   1.3806504E-23,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-joule relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kj#mid"})

(def Value_KelvinKilogramRelationship
  "Value for kelvin-kilogram relationship"
  {:db/ident     :constant/Value_KelvinKilogramRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.7E-46,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   1.5361807E-40,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kelvin-kilogram relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kkg#mid"})

(def Value_KilogramAtomicMassUnitRelationship
  "Value for kilogram-atomic mass unit relationship"
  {:db/ident     :constant/Value_KilogramAtomicMassUnitRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.0E19,
   :qudt/unit    :unit/U,
   :qudt/value   6.02214179E26,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-atomic mass unit relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kgu#mid"})

(def Value_KilogramElectronVoltRelationship
  "Value for kilogram-electron volt relationship"
  {:db/ident     :constant/Value_KilogramElectronVoltRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.4E28,
   :qudt/unit    :unit/EV,
   :qudt/value   5.60958912E35,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-electron volt relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kgev#mid"})

(def Value_KilogramHartreeRelationship
  "Value for kilogram-hartree relationship"
  {:db/ident     :constant/Value_KilogramHartreeRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.0E27,
   :qudt/unit    :unit/E_h,
   :qudt/value   2.06148616E34,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-hartree relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kghr#mid"})

(def Value_KilogramHertzRelationship
  "Value for kilogram-hertz relationship"
  {:db/ident     :constant/Value_KilogramHertzRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.8E42,
   :qudt/unit    :unit/HZ,
   :qudt/value   1.356392733E50,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-hertz relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kghz#mid"})

(def Value_KilogramInverseMeterRelationship
  "Value for kilogram-inverse meter relationship"
  {:db/ident     :constant/Value_KilogramInverseMeterRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E34,
   :qudt/unit    :unit/PER-M,
   :qudt/value   4.52443915E41,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-inverse meter relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kgminv#mid"})

(def Value_KilogramJouleRelationship
  "Value for kilogram-joule relationship"
  {:db/ident     :constant/Value_KilogramJouleRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/J,
   :qudt/value   8.987551787E16,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-joule relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kgj#mid"})

(def Value_KilogramKelvinRelationship
  "Value for kilogram-kelvin relationship"
  {:db/ident     :constant/Value_KilogramKelvinRelationship,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E34,
   :qudt/unit    :unit/K,
   :qudt/value   6.509651E39,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for kilogram-kelvin relationship",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?kgk#mid"})

(def Value_LatticeParameterOfSilicon
  "Value for lattice parameter of silicon"
  {:db/ident     :constant/Value_LatticeParameterOfSilicon,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.4E-17,
   :qudt/unit    :unit/M,
   :qudt/value   5.43102064E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for lattice parameter of silicon",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?asil#mid"})

(def Value_LatticeSpacingOfSilicon
  "Value for lattice spacing of silicon"
  {:db/ident     :constant/Value_LatticeSpacingOfSilicon,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.0E-18,
   :qudt/unit    :unit/M,
   :qudt/value   1.920155762E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for lattice spacing of silicon",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?d220sil#mid"})

(def Value_LoschmidtConstant
  "Value for Loschmidt constant 273.15 K 101.325 kPa"
  {:db/ident     :constant/Value_LoschmidtConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.7E19,
   :qudt/unit    :unit/PER-M3,
   :qudt/value   2.6867774E25,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Loschmidt constant 273.15 K 101.325 kPa",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?n0#mid"})

(def Value_MagneticConstant
  "Value for magnetic constant"
  {:db/ident     :constant/Value_MagneticConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/FARAD-PER-M,
   :qudt/value   1.2566370614E-6,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for magnetic constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mu0#mid"})

(def Value_MagneticFluxQuantum
  "Value for magnetic flux quantum"
  {:db/ident     :constant/Value_MagneticFluxQuantum,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.2E-23,
   :qudt/unit    :unit/WB,
   :qudt/value   2.067833667E-15,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for magnetic flux quantum",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?flxquhs2e#mid"})

(def Value_MoXUnit
  "Value for Mo x unit"
  {:db/ident     :constant/Value_MoXUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.3E-20,
   :qudt/unit    :unit/M,
   :qudt/value   1.00209955E-13,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Mo x unit",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?xumokalph1#mid"})

(def Value_MolarGasConstant
  "Value for molar gas constant"
  {:db/ident     :constant/Value_MolarGasConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.5E-5,
   :qudt/unit    :unit/J-PER-MOL-K,
   :qudt/value   8.31446261815324,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar gas constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?r#mid"})

(def Value_MolarMassConstant
  "Value for molar mass constant"
  {:db/ident     :constant/Value_MolarMassConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/KiloGM-PER-MOL,
   :qudt/value   0.001,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar mass constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mu#mid"})

(def Value_MolarMassOfCarbon12
  "Value for molar mass of carbon-12"
  {:db/ident     :constant/Value_MolarMassOfCarbon12,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/KiloGM-PER-MOL,
   :qudt/value   0.012,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar mass of carbon-12",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mm12c#mid"})

(def Value_MolarPlanckConstant
  "Value for molar Planck constant"
  {:db/ident     :constant/Value_MolarPlanckConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.7E-19,
   :qudt/unit    :unit/J-SEC-PER-MOL,
   :qudt/value   3.9903126821E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar Planck constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?nah#mid"})

(def Value_MolarPlanckConstantTimesC
  "Value for molar Planck constant times c"
  {:db/ident     :constant/Value_MolarPlanckConstantTimesC,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.7E-10,
   :qudt/unit    :unit/J-M-PER-MOL,
   :qudt/value   0.11962656472,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar Planck constant times c",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?nahc#mid"})

(def Value_MolarVolumeOfIdealGas
  "Value for molar volume of ideal gas 273.15 K 101.325 kPa"
  {:db/ident     :constant/Value_MolarVolumeOfIdealGas,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.9E-8,
   :qudt/unit    :unit/M3-PER-MOL,
   :qudt/value   0.022710981,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar volume of ideal gas 273.15 K 101.325 kPa",
   :vaem/website ["http://physics.nist.gov/cgi-bin/cuu/Value?mvolstd#mid"
                  "http://physics.nist.gov/cgi-bin/cuu/Value?mvol#mid"]})

(def Value_MolarVolumeOfSilicon
  "Value for molar volume of silicon"
  {:db/ident     :constant/Value_MolarVolumeOfSilicon,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-12,
   :qudt/unit    :unit/M3-PER-MOL,
   :qudt/value   1.20588349E-5,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for molar volume of silicon",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mvolsil#mid"})

(def Value_MuonComptonWavelength
  "Value for muon Compton wavelength"
  {:db/ident     :constant/Value_MuonComptonWavelength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.0E-22,
   :qudt/unit    :unit/M,
   :qudt/value   1.173444104E-14,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon Compton wavelength",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mcomwl#mid"})

(def Value_MuonComptonWavelengthOver2Pi
  "Value for muon Compton wavelength over 2 pi"
  {:db/ident     :constant/Value_MuonComptonWavelengthOver2Pi,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.7E-23,
   :qudt/unit    :unit/M,
   :qudt/value   1.867594295E-15,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon Compton wavelength over 2 pi",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mcomwlbar#mid"})

(def Value_MuonElectronMassRatio
  "Value for muon-electron mass ratio"
  {:db/ident     :constant/Value_MuonElectronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.2E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   206.7682823,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon-electron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmusme#mid"})

(def Value_MuonGFactor
  "Value for muon g factor"
  {:db/ident     :constant/Value_MuonGFactor,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.2E-9,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -2.0023318414,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon g factor",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gmum#mid"})

(def Value_MuonMagneticMoment
  "Value for muon magnetic moment"
  {:db/ident     :constant/Value_MuonMagneticMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.6E-33,
   :qudt/unit    :unit/J-PER-T,
   :qudt/value   -4.49044786E-26,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon magnetic moment",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mumum#mid"})

(def Value_MuonMagneticMomentAnomaly
  "Value for muon magnetic moment anomaly"
  {:db/ident     :constant/Value_MuonMagneticMomentAnomaly,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.0E-10,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.00116592069,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon magnetic moment anomaly",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?amu#mid"})

(def Value_MuonMagneticMomentToBohrMagnetonRatio
  "Value for muon magnetic moment to Bohr magneton ratio"
  {:db/ident     :constant/Value_MuonMagneticMomentToBohrMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.2E-10,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -0.00484197049,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon magnetic moment to Bohr magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mumumsmub#mid"})

(def Value_MuonMagneticMomentToNuclearMagnetonRatio
  "Value for muon magnetic moment to nuclear magneton ratio"
  {:db/ident     :constant/Value_MuonMagneticMomentToNuclearMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -8.89059705,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon magnetic moment to nuclear magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mumumsmun#mid"})

(def Value_MuonMass
  "Value for muon mass"
  {:db/ident     :constant/Value_MuonMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-35,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   1.8835313E-28,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmu#mid"})

(def Value_MuonMassEnergyEquivalent
  "Value for muon mass energy equivalent"
  {:db/ident     :constant/Value_MuonMassEnergyEquivalent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 9.5E-19,
   :qudt/unit    :unit/J,
   :qudt/value   1.69283351E-11,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon mass energy equivalent",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmuc2#mid"})

(def Value_MuonMassEnergyEquivalentInMeV
  "Value for muon mass energy equivalent in MeV"
  {:db/ident     :constant/Value_MuonMassEnergyEquivalentInMeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.8E-6,
   :qudt/unit    :unit/MegaEV,
   :qudt/value   105.6583668,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon mass energy equivalent in MeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmuc2mev#mid"})

(def Value_MuonMassInAtomicMassUnit
  "Muon Mass (amu)"
  {:db/ident     :constant/Value_MuonMassInAtomicMassUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.9E-9,
   :qudt/unit    :unit/U,
   :qudt/value   0.1134289256,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Muon Mass (amu)",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmuu#mid"})

(def Value_MuonMolarMass
  "Value for muon molar mass"
  {:db/ident     :constant/Value_MuonMolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.9E-12,
   :qudt/unit    :unit/KiloGM-PER-MOL,
   :qudt/value   1.134289256E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon molar mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmmu#mid"})

(def Value_MuonNeutronMassRatio
  "Value for muon-neutron mass ratio"
  {:db/ident     :constant/Value_MuonNeutronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.9E-9,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.1124545167,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon-neutron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmusmn#mid"})

(def Value_MuonProtonMagneticMomentRatio
  "Value for muon-proton magnetic moment ratio"
  {:db/ident     :constant/Value_MuonProtonMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.5E-8,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -3.183345137,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon-proton magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mumumsmup#mid"})

(def Value_MuonProtonMassRatio
  "Value for muon-proton mass ratio"
  {:db/ident     :constant/Value_MuonProtonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.9E-9,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.1126095261,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon-proton mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmusmp#mid"})

(def Value_MuonTauMassRatio
  "Value for muon-tau mass ratio"
  {:db/ident     :constant/Value_MuonTauMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 9.7E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.0594592,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for muon-tau mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmusmtau#mid"})

(def Value_NaturalUnitOfAction
  "Value for natural unit of action"
  {:db/ident     :constant/Value_NaturalUnitOfAction,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.3E-42,
   :qudt/unit    :unit/J-SEC,
   :qudt/value   1.054571628E-34,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of action",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?thbar#mid"})

(def Value_NaturalUnitOfActionInEVS
  "Value for natural unit of action in eV s"
  {:db/ident     :constant/Value_NaturalUnitOfActionInEVS,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.6E-23,
   :qudt/unit    :unit/EV-SEC,
   :qudt/value   6.58211899E-16,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of action in eV s",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?thbarev#mid"})

(def Value_NaturalUnitOfEnergy
  "Value for natural unit of energy"
  {:db/ident     :constant/Value_NaturalUnitOfEnergy,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.1E-21,
   :qudt/unit    :unit/J,
   :qudt/value   8.18710438E-14,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of energy",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tmec2#mid"})

(def Value_NaturalUnitOfEnergyInMeV
  "Value for natural unit of energy in MeV"
  {:db/ident     :constant/Value_NaturalUnitOfEnergyInMeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.3E-8,
   :qudt/unit    :unit/MegaEV,
   :qudt/value   0.51099891,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of energy in MeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tmec2mev#mid"})

(def Value_NaturalUnitOfLength
  "Value for natural unit of length"
  {:db/ident     :constant/Value_NaturalUnitOfLength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.3E-22,
   :qudt/unit    :unit/M,
   :qudt/value   3.8615926459E-13,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of length",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tecomwlbar#mid"})

(def Value_NaturalUnitOfMass
  "Value for natural unit of mass"
  {:db/ident     :constant/Value_NaturalUnitOfMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.5E-38,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   9.10938215E-31,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tme#mid"})

(def Value_NaturalUnitOfMomentum
  "Value for natural unit of momentum"
  {:db/ident     :constant/Value_NaturalUnitOfMomentum,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.4E-29,
   :qudt/unit    :unit/KiloGM-M-PER-SEC,
   :qudt/value   2.73092406E-22,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of momentum",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mec#mid"})

(def Value_NaturalUnitOfMomentumInMeVPerC
  "Value for natural unit of momentum in MeV c^-1"
  {:db/ident     :constant/Value_NaturalUnitOfMomentumInMeVPerC,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.3E-8,
   :qudt/unit    :unit/MegaEV-PER-SpeedOfLight,
   :qudt/value   0.51099891,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of momentum in MeV c^-1",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mecmevsc#mid"})

(def Value_NaturalUnitOfTime
  "Value for natural unit of time"
  {:db/ident     :constant/Value_NaturalUnitOfTime,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.8E-30,
   :qudt/unit    :unit/SEC,
   :qudt/value   1.288088657E-21,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of time",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?nut#mid"})

(def Value_NaturalUnitOfVelocity
  "Value for natural unit of velocity"
  {:db/ident     :constant/Value_NaturalUnitOfVelocity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/M-PER-SEC,
   :qudt/value   2.99792458E8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for natural unit of velocity",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tc#mid"})

(def Value_NeutronComptonWavelength
  "Value for neutron Compton wavelength"
  {:db/ident     :constant/Value_NeutronComptonWavelength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.0E-24,
   :qudt/unit    :unit/M,
   :qudt/value   1.3195908951E-15,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron Compton wavelength",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?ncomwl#mid"})

(def Value_NeutronComptonWavelengthOver2Pi
  "Value for neutron Compton wavelength over 2 pi"
  {:db/ident     :constant/Value_NeutronComptonWavelengthOver2Pi,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.1E-25,
   :qudt/unit    :unit/M,
   :qudt/value   2.1001941382E-16,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron Compton wavelength over 2 pi",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?ncomwlbar#mid"})

(def Value_NeutronElectronMagneticMomentRatio
  "Value for neutron-electron magnetic moment ratio"
  {:db/ident     :constant/Value_NeutronElectronMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.5E-10,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.00104066882,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-electron magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?munsmue#mid"})

(def Value_NeutronElectronMassRatio
  "Value for neutron-electron mass ratio"
  {:db/ident     :constant/Value_NeutronElectronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   1838.6836605,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-electron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mnsme#mid"})

(def Value_NeutronGFactor
  "Value for neutron g factor"
  {:db/ident     :constant/Value_NeutronGFactor,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 9.0E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -3.82608545,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron g factor",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gnn#mid"})

(def Value_NeutronGyromagneticRatio
  "Value for neutron gyromagnetic ratio"
  {:db/ident     :constant/Value_NeutronGyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 43.0,
   :qudt/unit    :unit/PER-T-SEC,
   :qudt/value   1.83247185E8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron gyromagnetic ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gamman#mid"})

(def Value_NeutronGyromagneticRatioOver2Pi
  "Value for neutron gyromagnetic ratio over 2 pi"
  {:db/ident     :constant/Value_NeutronGyromagneticRatioOver2Pi,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.9E-6,
   :qudt/unit    :unit/MegaHZ-PER-T,
   :qudt/value   29.1646954,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron gyromagnetic ratio over 2 pi",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gammanbar#mid"})

(def Value_NeutronMagneticMoment
  "Value for neutron magnetic moment"
  {:db/ident     :constant/Value_NeutronMagneticMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-33,
   :qudt/unit    :unit/J-PER-T,
   :qudt/value   -9.6623641E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron magnetic moment",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?munn#mid"})

(def Value_NeutronMagneticMomentToBohrMagnetonRatio
  "Value for neutron magnetic moment to Bohr magneton ratio"
  {:db/ident     :constant/Value_NeutronMagneticMomentToBohrMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.5E-10,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -0.00104187563,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron magnetic moment to Bohr magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?munsmub#mid"})

(def Value_NeutronMagneticMomentToNuclearMagnetonRatio
  "Value for neutron magnetic moment to nuclear magneton ratio"
  {:db/ident     :constant/Value_NeutronMagneticMomentToNuclearMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.5E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -1.91304273,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron magnetic moment to nuclear magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?munsmun#mid"})

(def Value_NeutronMass
  "Value for neutron mass"
  {:db/ident     :constant/Value_NeutronMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.4E-35,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   1.674927211E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mn#mid"})

(def Value_NeutronMassEnergyEquivalent
  "Value for neutron mass energy equivalent"
  {:db/ident     :constant/Value_NeutronMassEnergyEquivalent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.5E-18,
   :qudt/unit    :unit/J,
   :qudt/value   1.505349505E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron mass energy equivalent",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mnc2#mid"})

(def Value_NeutronMassEnergyEquivalentInMeV
  "Value for neutron mass energy equivalent in MeV"
  {:db/ident     :constant/Value_NeutronMassEnergyEquivalentInMeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-5,
   :qudt/unit    :unit/MegaEV,
   :qudt/value   939.565346,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron mass energy equivalent in MeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mnc2mev#mid"})

(def Value_NeutronMassInAtomicMassUnit
  "Neutron Mass (amu)"
  {:db/ident     :constant/Value_NeutronMassInAtomicMassUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.3E-10,
   :qudt/unit    :unit/U,
   :qudt/value   1.00866491597,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Neutron Mass (amu)",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mnu#mid"})

(def Value_NeutronMolarMass
  "Value for neutron molar mass"
  {:db/ident     :constant/Value_NeutronMolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.3E-13,
   :qudt/unit    :unit/KiloGM-PER-MOL,
   :qudt/value   0.00100866491597,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron molar mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmn#mid"})

(def Value_NeutronMuonMassRatio
  "Value for neutron-muon mass ratio"
  {:db/ident     :constant/Value_NeutronMuonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   8.89248409,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-muon mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mnsmmu#mid"})

(def Value_NeutronProtonMagneticMomentRatio
  "Value for neutron-proton magnetic moment ratio"
  {:db/ident     :constant/Value_NeutronProtonMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.6E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -0.68497934,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-proton magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?munsmup#mid"})

(def Value_NeutronProtonMassRatio
  "Value for neutron-proton mass ratio"
  {:db/ident     :constant/Value_NeutronProtonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.6E-10,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   1.00137841918,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-proton mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mnsmp#mid"})

(def Value_NeutronTauMassRatio
  "Value for neutron-tau mass ratio"
  {:db/ident     :constant/Value_NeutronTauMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.6E-5,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.52874,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron-tau mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mnsmtau#mid"})

(def Value_NeutronToShieldedProtonMagneticMomentRatio
  "Value for neutron to shielded proton magnetic moment ratio"
  {:db/ident     :constant/Value_NeutronToShieldedProtonMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.6E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -0.68499694,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for neutron to shielded proton magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?munsmupp#mid"})

(def Value_NewtonianConstantOfGravitation
  "Value for Newtonian constant of gravitation"
  {:db/ident :constant/Value_NewtonianConstantOfGravitation,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/relativeStandardUncertainty 2.2E-5,
   :qudt/standardUncertainty 1.5E-15,
   :qudt/unit :unit/M3-PER-KiloGM-SEC2,
   :qudt/value 6.6743E-11,
   :rdf/type :qudt/ConstantValue,
   :rdfs/label "Value for Newtonian constant of gravitation",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?bg#mid"})

(def Value_NewtonianConstantOfGravitationOverHbarC
  "Newtonian constant of gravitation over hbar c"
  {:db/ident     :constant/Value_NewtonianConstantOfGravitationOverHbarC,
   :qudt/relativeStandardUncertainty 2.2E-5,
   :qudt/standardUncertainty 1.5E-43,
   :qudt/unit    :unit/PER-PlanckMass2,
   :qudt/value   6.70883E-39,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Newtonian constant of gravitation over hbar c",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?bgspu#mid"})

(def Value_NuclearMagneton
  "Value for nuclear magneton"
  {:db/ident     :constant/Value_NuclearMagneton,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.3E-34,
   :qudt/unit    :unit/J-PER-T,
   :qudt/value   5.05078324E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for nuclear magneton",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mun#mid"})

(def Value_NuclearMagnetonInEVPerT
  "Value for nuclear magneton in eV per T"
  {:db/ident     :constant/Value_NuclearMagnetonInEVPerT,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.5E-17,
   :qudt/unit    :unit/EV-PER-T,
   :qudt/value   3.1524512326E-8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for nuclear magneton in eV per T",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?munev#mid"})

(def Value_NuclearMagnetonInInverseMetersPerTesla
  "Value for nuclear magneton in inverse meters per tesla"
  {:db/ident     :constant/Value_NuclearMagnetonInInverseMetersPerTesla,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.4E-10,
   :qudt/unit    :unit/PER-T-M,
   :qudt/value   0.02542623616,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for nuclear magneton in inverse meters per tesla",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?munshcminv#mid"})

(def Value_NuclearMagnetonInKPerT
  "Value for nuclear magneton in K per T"
  {:db/ident     :constant/Value_NuclearMagnetonInKPerT,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.4E-10,
   :qudt/unit    :unit/K-PER-T,
   :qudt/value   3.6582637E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for nuclear magneton in K per T",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?munskk#mid"})

(def Value_NuclearMagnetonInMHzPerT
  "Value for nuclear magneton in MHz per T"
  {:db/ident     :constant/Value_NuclearMagnetonInMHzPerT,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.9E-7,
   :qudt/unit    :unit/MegaHZ-PER-T,
   :qudt/value   7.62259384,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for nuclear magneton in MHz per T",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?munshhz#mid"})

(def Value_PermittivityOfVacuum
  "Value for permittivity of vacuum"
  {:db/ident   :constant/Value_PermittivityOfVacuum,
   :qudt/relativeStandardUncertainty 1.5E-10,
   :qudt/unit  :unit/FARAD-PER-M,
   :qudt/value 6.8541878128E-12,
   :rdf/type   :qudt/ConstantValue,
   :rdfs/label "Value for permittivity of vacuum"})

(def Value_PlanckConstant
  "Value for Planck constant"
  {:db/ident     :constant/Value_PlanckConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.3E-41,
   :qudt/unit    :unit/J-SEC,
   :qudt/value   6.62606896E-34,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?h#mid"})

(def Value_PlanckConstantInEVS
  "Value for Planck constant in eV s"
  {:db/ident     :constant/Value_PlanckConstantInEVS,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.0E-22,
   :qudt/unit    :unit/EV-SEC,
   :qudt/value   4.13566733E-15,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck constant in eV s",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hev#mid"})

(def Value_PlanckConstantOver2Pi
  "Value for Planck constant over 2 pi"
  {:db/ident     :constant/Value_PlanckConstantOver2Pi,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.3E-42,
   :qudt/unit    :unit/J-SEC,
   :qudt/value   1.054571628E-34,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck constant over 2 pi",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hbar#mid"})

(def Value_PlanckConstantOver2PiInEVS
  "Value for Planck constant over 2 pi in eV s"
  {:db/ident     :constant/Value_PlanckConstantOver2PiInEVS,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.6E-23,
   :qudt/unit    :unit/EV-SEC,
   :qudt/value   6.58211899E-16,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck constant over 2 pi in eV s",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hbarev#mid"})

(def Value_PlanckConstantOver2PiTimesCInMeVFm
  "Value for Planck constant over 2 pi times c in MeV fm"
  {:db/ident     :constant/Value_PlanckConstantOver2PiTimesCInMeVFm,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.9E-6,
   :qudt/unit    :unit/MegaEV-FemtoM,
   :qudt/value   197.3269631,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck constant over 2 pi times c in MeV fm",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hbcmevf#mid"})

(def Value_PlanckLength
  "Value for Planck length"
  {:db/ident     :constant/Value_PlanckLength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.1E-40,
   :qudt/unit    :unit/M,
   :qudt/value   1.616252E-35,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck length",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?plkl#mid"})

(def Value_PlanckMass
  "Value for Planck mass"
  {:db/ident     :constant/Value_PlanckMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-12,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   2.17644E-8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?plkm#mid"})

(def Value_PlanckMassEnergyEquivalentInGeV
  "Value for Planck mass energy equivalent in GeV"
  {:db/ident     :constant/Value_PlanckMassEnergyEquivalentInGeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.1E14,
   :qudt/unit    :unit/GigaEV,
   :qudt/value   1.220892E19,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck mass energy equivalent in GeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?plkmc2gev#mid"})

(def Value_PlanckTemperature
  "Value for Planck temperature"
  {:db/ident     :constant/Value_PlanckTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.1E27,
   :qudt/unit    :unit/K,
   :qudt/value   1.416785E32,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck temperature",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?plktmp#mid"})

(def Value_PlanckTime
  "Value for Planck time"
  {:db/ident     :constant/Value_PlanckTime,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.7E-48,
   :qudt/unit    :unit/SEC,
   :qudt/value   5.39124E-44,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Planck time",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?plkt#mid"})

(def Value_ProtonChargeToMassQuotient
  "Value for proton charge to mass quotient"
  {:db/ident     :constant/Value_ProtonChargeToMassQuotient,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.4,
   :qudt/unit    :unit/C-PER-KiloGM,
   :qudt/value   9.57883392E7,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton charge to mass quotient",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?esmp#mid"})

(def Value_ProtonComptonWavelength
  "Value for proton Compton wavelength"
  {:db/ident     :constant/Value_ProtonComptonWavelength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.9E-24,
   :qudt/unit    :unit/M,
   :qudt/value   1.3214098446E-15,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton Compton wavelength",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?pcomwl#mid"})

(def Value_ProtonComptonWavelengthOver2Pi
  "Value for proton Compton wavelength over 2 pi"
  {:db/ident     :constant/Value_ProtonComptonWavelengthOver2Pi,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.0E-25,
   :qudt/unit    :unit/M,
   :qudt/value   2.1030890861E-16,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton Compton wavelength over 2 pi",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?pcomwlbar#mid"})

(def Value_ProtonElectronMassRatio
  "Value for proton-electron mass ratio"
  {:db/ident     :constant/Value_ProtonElectronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.0E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   1836.15267247,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton-electron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mpsme#mid"})

(def Value_ProtonGFactor
  "Value for proton g factor"
  {:db/ident     :constant/Value_ProtonGFactor,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.6E-8,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   5.585694713,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton g factor",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gp#mid"})

(def Value_ProtonGyromagneticRatio
  "Value for proton gyromagnetic ratio"
  {:db/ident     :constant/Value_ProtonGyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.0,
   :qudt/unit    :unit/PER-T-SEC,
   :qudt/value   2.675222099E8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton gyromagnetic ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gammap#mid"})

(def Value_ProtonGyromagneticRatioOver2Pi
  "Value for proton gyromagnetic ratio over 2 pi"
  {:db/ident     :constant/Value_ProtonGyromagneticRatioOver2Pi,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-6,
   :qudt/unit    :unit/MegaHZ-PER-T,
   :qudt/value   42.5774821,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton gyromagnetic ratio over 2 pi",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gammapbar#mid"})

(def Value_ProtonMagneticMoment
  "Value for proton magnetic moment"
  {:db/ident     :constant/Value_ProtonMagneticMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.7E-34,
   :qudt/unit    :unit/J-PER-T,
   :qudt/value   1.410606662E-26,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton magnetic moment",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mup#mid"})

(def Value_ProtonMagneticMomentToBohrMagnetonRatio
  "Value for proton magnetic moment to Bohr magneton ratio"
  {:db/ident     :constant/Value_ProtonMagneticMomentToBohrMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.2E-11,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.001521032209,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton magnetic moment to Bohr magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mupsmub#mid"})

(def Value_ProtonMagneticMomentToNuclearMagnetonRatio
  "Value for proton magnetic moment to nuclear magneton ratio"
  {:db/ident     :constant/Value_ProtonMagneticMomentToNuclearMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-8,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   2.792847356,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton magnetic moment to nuclear magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mupsmun#mid"})

(def Value_ProtonMagneticShieldingCorrection
  "Value for proton magnetic shielding correction"
  {:db/ident     :constant/Value_ProtonMagneticShieldingCorrection,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.4E-8,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   2.5694E-5,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton magnetic shielding correction",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?sigmapp#mid"})

(def Value_ProtonMass
  "Value for proton mass"
  {:db/ident     :constant/Value_ProtonMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.3E-35,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   1.672621637E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mp#mid"})

(def Value_ProtonMassEnergyEquivalent
  "Value for proton mass energy equivalent"
  {:db/ident     :constant/Value_ProtonMassEnergyEquivalent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.5E-18,
   :qudt/unit    :unit/J,
   :qudt/value   1.503277359E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton mass energy equivalent",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mpc2#mid"})

(def Value_ProtonMassEnergyEquivalentInMeV
  "Value for proton mass energy equivalent in MeV"
  {:db/ident     :constant/Value_ProtonMassEnergyEquivalentInMeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-5,
   :qudt/unit    :unit/MegaEV,
   :qudt/value   938.272013,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton mass energy equivalent in MeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mpc2mev#mid"})

(def Value_ProtonMassInAtomicMassUnit
  "Proton Mass (amu)"
  {:db/ident     :constant/Value_ProtonMassInAtomicMassUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.0E-10,
   :qudt/unit    :unit/U,
   :qudt/value   1.00727646677,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Proton Mass (amu)",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mpu#mid"})

(def Value_ProtonMolarMass
  "Value for proton molar mass"
  {:db/ident     :constant/Value_ProtonMolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.0E-13,
   :qudt/unit    :unit/KiloGM-PER-MOL,
   :qudt/value   0.00100727646677,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton molar mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmp#mid"})

(def Value_ProtonMuonMassRatio
  "Value for proton-muon mass ratio"
  {:db/ident     :constant/Value_ProtonMuonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.3E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   8.88024339,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton-muon mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mpsmmu#mid"})

(def Value_ProtonNeutronMagneticMomentRatio
  "Value for proton-neutron magnetic moment ratio"
  {:db/ident     :constant/Value_ProtonNeutronMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.4E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -1.45989806,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton-neutron magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mupsmunn#mid"})

(def Value_ProtonNeutronMassRatio
  "Value for proton-neutron mass ratio"
  {:db/ident     :constant/Value_ProtonNeutronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.6E-10,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.99862347824,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton-neutron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mpsmn#mid"})

(def Value_ProtonRmsChargeRadius
  "Value for proton rms charge radius"
  {:db/ident     :constant/Value_ProtonRmsChargeRadius,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 6.9E-18,
   :qudt/unit    :unit/M,
   :qudt/value   8.768E-16,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton rms charge radius",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?rp#mid"})

(def Value_ProtonTauMassRatio
  "Value for proton-tau mass ratio"
  {:db/ident     :constant/Value_ProtonTauMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.6E-5,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.528012,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for proton-tau mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mpsmtau#mid"})

(def Value_QuantumOfCirculation
  "Value for quantum of circulation"
  {:db/ident     :constant/Value_QuantumOfCirculation,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.0E-13,
   :qudt/unit    :unit/M2-PER-SEC,
   :qudt/value   3.6369475199E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for quantum of circulation",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?qucirchs2me#mid"})

(def Value_QuantumOfCirculationTimes2
  "Value for quantum of circulation times 2"
  {:db/ident     :constant/Value_QuantumOfCirculationTimes2,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.0E-12,
   :qudt/unit    :unit/M2-PER-SEC,
   :qudt/value   7.27389504E-4,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for quantum of circulation times 2",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?hsme#mid"})

(def Value_RydbergConstant
  "Value for Rydberg constant"
  {:db/ident     :constant/Value_RydbergConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.3E-5,
   :qudt/unit    :unit/PER-M,
   :qudt/value   1.0973731568527E7,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Rydberg constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?ryd#mid"})

(def Value_RydbergConstantTimesCInHz
  "Value for Rydberg constant times c in Hz"
  {:db/ident     :constant/Value_RydbergConstantTimesCInHz,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 22000.0,
   :qudt/unit    :unit/HZ,
   :qudt/value   3.289841960361E15,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Rydberg constant times c in Hz",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?rydchz#mid"})

(def Value_RydbergConstantTimesHcInEV
  "Value for Rydberg constant times hc in eV"
  {:db/ident     :constant/Value_RydbergConstantTimesHcInEV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.4E-7,
   :qudt/unit    :unit/EV,
   :qudt/value   13.60569193,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Rydberg constant times hc in eV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?rydhcev#mid"})

(def Value_RydbergConstantTimesHcInJ
  "Value for Rydberg constant times hc in J"
  {:db/ident     :constant/Value_RydbergConstantTimesHcInJ,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-25,
   :qudt/unit    :unit/J,
   :qudt/value   2.17987197E-18,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Rydberg constant times hc in J",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?rydhcj#mid"})

(def Value_SackurTetrodeConstant1K100KPa
  "Value for Sackur-Tetrode constant 1 K 100 kPa"
  {:db/ident     :constant/Value_SackurTetrodeConstant1K100KPa,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.4E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -1.1517047,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Sackur-Tetrode constant 1 K 100 kPa",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?s0sr#mid"})

(def Value_SackurTetrodeConstant1K101.325K
  "Value for Sackur-Tetrode constant 1 K 101.325 kPa"
  {:db/ident     :constant/Value_SackurTetrodeConstant1K101.325K,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.4E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -1.1648677,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Sackur-Tetrode constant 1 K 101.325 kPa",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?s0srstd#mid"})

(def Value_SecondRadiationConstant
  "Value for second radiation constant"
  {:db/ident     :constant/Value_SecondRadiationConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.5E-8,
   :qudt/unit    :unit/M-K,
   :qudt/value   0.014387752,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for second radiation constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?c22ndrc#mid"})

(def Value_ShieldedHelionGyromagneticRatio
  "Value for shielded helion gyromagnetic ratio"
  {:db/ident     :constant/Value_ShieldedHelionGyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.6,
   :qudt/unit    :unit/PER-T-SEC,
   :qudt/value   2.03789473E8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded helion gyromagnetic ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gammahp#mid"})

(def Value_ShieldedHelionGyromagneticRatioOver2Pi
  "Value for shielded helion gyromagnetic ratio over 2 pi"
  {:db/ident     :constant/Value_ShieldedHelionGyromagneticRatioOver2Pi,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 9.0E-7,
   :qudt/unit    :unit/MegaHZ-PER-T,
   :qudt/value   32.43410198,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded helion gyromagnetic ratio over 2 pi",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gammahpbar#mid"})

(def Value_ShieldedHelionMagneticMoment
  "Value for shielded helion magnetic moment"
  {:db/ident     :constant/Value_ShieldedHelionMagneticMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.0E-34,
   :qudt/unit    :unit/J-PER-T,
   :qudt/value   -1.074552982E-26,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded helion magnetic moment",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muhp#mid"})

(def Value_ShieldedHelionMagneticMomentToBohrMagnetonRatio
  "Value for shielded helion magnetic moment to Bohr magneton ratio"
  {:db/ident :constant/Value_ShieldedHelionMagneticMomentToBohrMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.4E-11,
   :qudt/unit :unit/UNITLESS,
   :qudt/value -0.001158671471,
   :rdf/type :qudt/ConstantValue,
   :rdfs/label
   "Value for shielded helion magnetic moment to Bohr magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muhpsmub#mid"})

(def Value_ShieldedHelionMagneticMomentToNuclearMagnetonRatio
  "Value for shielded helion magnetic moment to nuclear magneton ratio"
  {:db/ident :constant/Value_ShieldedHelionMagneticMomentToNuclearMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.5E-8,
   :qudt/unit :unit/UNITLESS,
   :qudt/value -2.127497718,
   :rdf/type :qudt/ConstantValue,
   :rdfs/label
   "Value for shielded helion magnetic moment to nuclear magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muhpsmun#mid"})

(def Value_ShieldedHelionToProtonMagneticMomentRatio
  "Value for shielded helion to proton magnetic moment ratio"
  {:db/ident     :constant/Value_ShieldedHelionToProtonMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-8,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -0.761766558,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded helion to proton magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muhpsmup#mid"})

(def Value_ShieldedHelionToShieldedProtonMagneticMomentRatio
  "Value for shielded helion to shielded proton magnetic moment ratio"
  {:db/ident :constant/Value_ShieldedHelionToShieldedProtonMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.3E-9,
   :qudt/unit :unit/UNITLESS,
   :qudt/value -0.7617861313,
   :rdf/type :qudt/ConstantValue,
   :rdfs/label
   "Value for shielded helion to shielded proton magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muhpsmupp#mid"})

(def Value_ShieldedProtonGyromagneticRatio
  "Value for shielded proton gyromagnetic ratio"
  {:db/ident     :constant/Value_ShieldedProtonGyromagneticRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.3,
   :qudt/unit    :unit/PER-T-SEC,
   :qudt/value   2.675153362E8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded proton gyromagnetic ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gammapp#mid"})

(def Value_ShieldedProtonGyromagneticRatioOver2Pi
  "Value for shielded proton gyromagnetic ratio over 2 pi"
  {:db/ident     :constant/Value_ShieldedProtonGyromagneticRatioOver2Pi,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.2E-6,
   :qudt/unit    :unit/MegaHZ-PER-T,
   :qudt/value   42.5763881,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded proton gyromagnetic ratio over 2 pi",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gammappbar#mid"})

(def Value_ShieldedProtonMagneticMoment
  "Value for shielded proton magnetic moment"
  {:db/ident     :constant/Value_ShieldedProtonMagneticMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.8E-34,
   :qudt/unit    :unit/J-PER-T,
   :qudt/value   1.410570419E-26,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for shielded proton magnetic moment",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mupp#mid"})

(def Value_ShieldedProtonMagneticMomentToBohrMagnetonRatio
  "Value for shielded proton magnetic moment to Bohr magneton ratio"
  {:db/ident :constant/Value_ShieldedProtonMagneticMomentToBohrMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.7E-11,
   :qudt/unit :unit/UNITLESS,
   :qudt/value 0.001520993128,
   :rdf/type :qudt/ConstantValue,
   :rdfs/label
   "Value for shielded proton magnetic moment to Bohr magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muppsmub#mid"})

(def Value_ShieldedProtonMagneticMomentToNuclearMagnetonRatio
  "Value for shielded proton magnetic moment to nuclear magneton ratio"
  {:db/ident :constant/Value_ShieldedProtonMagneticMomentToNuclearMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.0E-8,
   :qudt/unit :unit/UNITLESS,
   :qudt/value 2.792775598,
   :rdf/type :qudt/ConstantValue,
   :rdfs/label
   "Value for shielded proton magnetic moment to nuclear magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?muppsmun#mid"})

(def Value_SpeedOfLight
  "Value for velocity of light"
  {:db/ident     :constant/Value_SpeedOfLight,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/M-PER-SEC,
   :qudt/value   2.99792458E8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for velocity of light",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?c#mid"})

(def Value_SpeedOfLight_Vacuum
  "Value for speed of light in a vacuum"
  {:db/ident   :constant/Value_SpeedOfLight_Vacuum,
   :qudt/informativeReference
   ["http://physics.nist.gov/cuu/Constants/bibliography.html"
    "http://physics.nist.gov/cgi-bin/cuu/Value?c#mid"],
   :qudt/standardUncertainty 0.0,
   :qudt/unit  :unit/M-PER-SEC,
   :qudt/value 2.99792458E8,
   :rdf/type   :qudt/ConstantValue,
   :rdfs/label "Value for speed of light in a vacuum"})

(def Value_SpeedOfLight_Vacuum_Imperial
  "Value for speed of light in vacuum (Imperial units)"
  {:db/ident     :constant/Value_SpeedOfLight_Vacuum_Imperial,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/MI-PER-HR,
   :qudt/value   6.70616629E8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for speed of light in vacuum (Imperial units)",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?c#mid"})

(def Value_StandardAccelerationOfGravity
  "Value for standard acceleration of gravity"
  {:db/ident     :constant/Value_StandardAccelerationOfGravity,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/M-PER-SEC2,
   :qudt/value   9.80665,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for standard acceleration of gravity",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gn#mid"})

(def Value_StandardAtmosphere
  "Value for standard atmosphere"
  {:db/ident     :constant/Value_StandardAtmosphere,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/unit    :unit/PA,
   :qudt/value   101325.0,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for standard atmosphere",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?stdatm#mid"})

(def Value_StefanBoltzmannConstant
  "Value for Stefan-Boltzmann Constant"
  {:db/ident     :constant/Value_StefanBoltzmannConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.0E-13,
   :qudt/unit    :unit/W-PER-M2-K4,
   :qudt/value   5.6704E-8,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Stefan-Boltzmann Constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?sigma#mid"})

(def Value_TauComptonWavelength
  "Value for tau Compton wavelength"
  {:db/ident     :constant/Value_TauComptonWavelength,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.1E-19,
   :qudt/unit    :unit/M,
   :qudt/value   6.9772E-16,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau Compton wavelength",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tcomwl#mid"})

(def Value_TauComptonWavelengthOver2Pi
  "Value for tau Compton wavelength over 2 pi"
  {:db/ident     :constant/Value_TauComptonWavelengthOver2Pi,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.8E-20,
   :qudt/unit    :unit/M,
   :qudt/value   1.11046E-16,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau Compton wavelength over 2 pi",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tcomwlbar#mid"})

(def Value_TauElectronMassRatio
  "Value for tau-electron mass ratio"
  {:db/ident     :constant/Value_TauElectronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 0.57,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   3477.48,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau-electron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtausme#mid"})

(def Value_TauMass
  "Value for tau mass"
  {:db/ident     :constant/Value_TauMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.2E-31,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   3.16777E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtau#mid"})

(def Value_TauMassEnergyEquivalent
  "Value for tau mass energy equivalent"
  {:db/ident     :constant/Value_TauMassEnergyEquivalent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.6E-14,
   :qudt/unit    :unit/J,
   :qudt/value   2.84705E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau mass energy equivalent",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtauc2#mid"})

(def Value_TauMassEnergyEquivalentInMeV
  "Value for tau mass energy equivalent in MeV"
  {:db/ident     :constant/Value_TauMassEnergyEquivalentInMeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 0.29,
   :qudt/unit    :unit/MegaEV,
   :qudt/value   1776.99,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau mass energy equivalent in MeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtauc2mev#mid"})

(def Value_TauMassInAtomicMassUnit
  "Tau Mass (amu)"
  {:db/ident     :constant/Value_TauMassInAtomicMassUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.1E-4,
   :qudt/unit    :unit/U,
   :qudt/value   1.90768,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Tau Mass (amu)",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtauu#mid"})

(def Value_TauMolarMass
  "Value for tau molar mass"
  {:db/ident     :constant/Value_TauMolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.1E-7,
   :qudt/unit    :unit/KiloGM-PER-MOL,
   :qudt/value   0.00190768,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau molar mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmtau#mid"})

(def Value_TauMuonMassRatio
  "Value for tau-muon mass ratio"
  {:db/ident     :constant/Value_TauMuonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 0.0027,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   16.8183,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau-muon mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtausmmu#mid"})

(def Value_TauNeutronMassRatio
  "Value for tau-neutron mass ratio"
  {:db/ident     :constant/Value_TauNeutronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.1E-4,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   1.89129,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau-neutron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtausmn#mid"})

(def Value_TauProtonMassRatio
  "Value for tau-proton mass ratio"
  {:db/ident     :constant/Value_TauProtonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.1E-4,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   1.8939,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for tau-proton mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtausmp#mid"})

(def Value_ThomsonCrossSection
  "Value for Thomson cross section"
  {:db/ident     :constant/Value_ThomsonCrossSection,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.7E-37,
   :qudt/unit    :unit/M2,
   :qudt/value   6.652458558E-29,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Thomson cross section",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?sigmae#mid"})

(def Value_TritonElectronMagneticMomentRatio
  "Value for triton-electron magnetic moment ratio"
  {:db/ident     :constant/Value_TritonElectronMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.1E-11,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -0.001620514423,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton-electron magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mutsmuem#mid"})

(def Value_TritonElectronMassRatio
  "Value for triton-electron mass ratio"
  {:db/ident     :constant/Value_TritonElectronMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.1E-6,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   5496.9215269,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton-electron mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtsme#mid"})

(def Value_TritonGFactor
  "Value for triton g factor"
  {:db/ident     :constant/Value_TritonGFactor,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.6E-8,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   5.957924896,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton g factor",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?gtn#mid"})

(def Value_TritonMagneticMoment
  "Value for triton magnetic moment"
  {:db/ident     :constant/Value_TritonMagneticMoment,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 4.2E-34,
   :qudt/unit    :unit/J-PER-T,
   :qudt/value   1.504609361E-26,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton magnetic moment",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mut#mid"})

(def Value_TritonMagneticMomentToBohrMagnetonRatio
  "Value for triton magnetic moment to Bohr magneton ratio"
  {:db/ident     :constant/Value_TritonMagneticMomentToBohrMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.1E-11,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.001622393657,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton magnetic moment to Bohr magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mutsmub#mid"})

(def Value_TritonMagneticMomentToNuclearMagnetonRatio
  "Value for triton magnetic moment to nuclear magneton ratio"
  {:db/ident     :constant/Value_TritonMagneticMomentToNuclearMagnetonRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.8E-8,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   2.978962448,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton magnetic moment to nuclear magneton ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mutsmun#mid"})

(def Value_TritonMass
  "Value for triton mass"
  {:db/ident     :constant/Value_TritonMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.5E-34,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   5.00735588E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mt#mid"})

(def Value_TritonMassEnergyEquivalent
  "Value for triton mass energy equivalent"
  {:db/ident     :constant/Value_TritonMassEnergyEquivalent,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.2E-17,
   :qudt/unit    :unit/J,
   :qudt/value   4.50038703E-10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton mass energy equivalent",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtc2#mid"})

(def Value_TritonMassEnergyEquivalentInMeV
  "Value for triton mass energy equivalent in MeV"
  {:db/ident     :constant/Value_TritonMassEnergyEquivalentInMeV,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 7.0E-5,
   :qudt/unit    :unit/MegaEV,
   :qudt/value   2808.920906,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton mass energy equivalent in MeV",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtc2mev#mid"})

(def Value_TritonMassInAtomicMassUnit
  "Triton Mass (amu)"
  {:db/ident     :constant/Value_TritonMassInAtomicMassUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.5E-9,
   :qudt/unit    :unit/U,
   :qudt/value   3.0155007134,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Triton Mass (amu)",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtu#mid"})

(def Value_TritonMolarMass
  "Value for triton molar mass"
  {:db/ident     :constant/Value_TritonMolarMass,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.5E-12,
   :qudt/unit    :unit/KiloGM-PER-MOL,
   :qudt/value   0.0030155007134,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton molar mass",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mmt#mid"})

(def Value_TritonNeutronMagneticMomentRatio
  "Value for triton-neutron magnetic moment ratio"
  {:db/ident     :constant/Value_TritonNeutronMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 3.7E-7,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   -1.55718553,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton-neutron magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mutsmunn#mid"})

(def Value_TritonProtonMagneticMomentRatio
  "Value for triton-proton magnetic moment ratio"
  {:db/ident     :constant/Value_TritonProtonMagneticMomentRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.0E-8,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   1.066639908,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton-proton magnetic moment ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mutsmup#mid"})

(def Value_TritonProtonMassRatio
  "Value for triton-proton mass ratio"
  {:db/ident     :constant/Value_TritonProtonMassRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 2.5E-9,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   2.9937170309,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for triton-proton mass ratio",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?mtsmp#mid"})

(def Value_UnifiedAtomicMassUnit
  "Value for unified atomic mass unit"
  {:db/ident     :constant/Value_UnifiedAtomicMassUnit,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 8.3E-35,
   :qudt/unit    :unit/KiloGM,
   :qudt/value   1.660538782E-27,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for unified atomic mass unit",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?tukg#mid"})

(def Value_VonKlitzingConstant
  "Value for von Klitzing constant"
  {:db/ident     :constant/Value_VonKlitzingConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 1.8E-5,
   :qudt/unit    :unit/OHM,
   :qudt/value   25812.807557,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for von Klitzing constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?rk#mid"})

(def Value_WeakMixingAngle
  "Value for weak mixing angle"
  {:db/ident     :constant/Value_WeakMixingAngle,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.6E-4,
   :qudt/unit    :unit/UNITLESS,
   :qudt/value   0.22255,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for weak mixing angle",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?sin2th#mid"})

(def Value_WienFrequencyDisplacementLawConstant
  "Value for Wien frequency displacement law constant"
  {:db/ident     :constant/Value_WienFrequencyDisplacementLawConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 100000.0,
   :qudt/unit    :unit/HZ-PER-K,
   :qudt/value   5.878933E10,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Wien frequency displacement law constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?bpwien#mid"})

(def Value_WienWavelengthDisplacementLawConstant
  "Value for Wien wavelength displacement law constant"
  {:db/ident     :constant/Value_WienWavelengthDisplacementLawConstant,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/standardUncertainty 5.1E-9,
   :qudt/unit    :unit/M-K,
   :qudt/value   0.0028977685,
   :rdf/type     :qudt/ConstantValue,
   :rdfs/label   "Value for Wien wavelength displacement law constant",
   :vaem/website "http://physics.nist.gov/cgi-bin/cuu/Value?bwien#mid"})

(def VonKlitzingConstant
  "Von Klitzing constant"
  {:db/ident           :constant/VonKlitzingConstant,
   :qudt/hasQuantityKind :quantitykind/Resistance,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_VonKlitzingConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Von Klitzing constant"},
   :skos/closeMatch    "http://dbpedia.org/resource/Quantum_Hall_effect"})

(def WeakMixingAngle
  "Weak mixing angle"
  {:db/ident           :constant/WeakMixingAngle,
   :qudt/dbpediaMatch  "http://dbpedia.org/resource/Weinberg_angle",
   :qudt/hasQuantityKind :quantitykind/DimensionlessRatio,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_WeakMixingAngle,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Weak mixing angle"}})

(def WienFrequencyDisplacementLawConstant
  "Wien frequency displacement law constant"
  {:db/ident           :constant/WienFrequencyDisplacementLawConstant,
   :qudt/hasQuantityKind :quantitykind/InverseTimeTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_WienFrequencyDisplacementLawConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "Wien frequency displacement law constant"},
   :skos/closeMatch    "http://dbpedia.org/resource/Black_body"})

(def WienWavelengthDisplacementLawConstant
  "Wien wavelength displacement law constant"
  {:db/ident           :constant/WienWavelengthDisplacementLawConstant,
   :qudt/hasQuantityKind :quantitykind/LengthTemperature,
   :qudt/informativeReference
   "http://physics.nist.gov/cuu/Constants/bibliography.html",
   :qudt/quantityValue :constant/Value_WienWavelengthDisplacementLawConstant,
   :rdf/type           :qudt/PhysicalConstant,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/constant",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value "Wien wavelength displacement law constant"},
   :skos/closeMatch    "http://dbpedia.org/resource/Wien%27s_displacement_law"})