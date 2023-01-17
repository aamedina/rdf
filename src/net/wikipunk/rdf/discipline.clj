(ns net.wikipunk.rdf.discipline
  "QUDT Disciplines Ontology"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/qudt/qudt-public-repo/main/vocab/disciplines/VOCAB_QUDT-DISCIPLINES-v2.1.ttl",
   :owl/imports ["http://www.w3.org/2004/02/skos/core"
                 "http://www.linkedmodel.org/schema/vaem"
                 "http://qudt.org/2.1/vocab/quantitykind"
                 "http://qudt.org/2.1/schema/facade/qudt"],
   :owl/versionIRI "http://qudt.org/2.1/vocab/discipline",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "discipline" "http://qudt.org/vocab/discipline/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "qudt" "http://qudt.org/schema/qudt/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vaem" "http://www.linkedmodel.org/schema/vaem#",
                       "quantitykind" "http://qudt.org/vocab/quantitykind/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://qudt.org/2.1/vocab/discipline",
   :rdfa/prefix "discipline",
   :rdfa/uri "http://qudt.org/2.1/vocab/discipline/",
   :rdfs/label "QUDT Disciplines Ontology",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-2.1-VOCAB-DISCIPLINES})

(def Acoustics
  "Acoustics"
  {:db/ident         :discipline/Acoustics,
   :qudt/relevantQuantityKind [:quantitykind/Dissipance
                               :quantitykind/Density
                               :quantitykind/Reflectance
                               :quantitykind/AngularWavenumber
                               :quantitykind/SoundIntensity
                               :quantitykind/CharacteristicAcousticImpedance
                               :quantitykind/EquivalentAbsorptionArea
                               :quantitykind/SoundEnergyDensity
                               :quantitykind/SoundParticleAcceleration
                               :quantitykind/Absorptance
                               :quantitykind/Period
                               :quantitykind/SoundParticleDisplacement
                               :quantitykind/SoundPower
                               :quantitykind/AcousticImpedance
                               :quantitykind/SoundPowerLevel
                               :quantitykind/PhaseSpeedOfSound
                               :quantitykind/SpeedOfSound
                               :quantitykind/LogarithmicFrequencyInterval
                               :quantitykind/TimeAveragedSoundIntensity
                               :quantitykind/Frequency
                               :quantitykind/PhaseCoefficient
                               :quantitykind/SoundParticleVelocity
                               :quantitykind/SoundPressureLevel
                               :quantitykind/Wavelength
                               :quantitykind/SoundReductionIndex
                               :quantitykind/SoundPressure
                               :quantitykind/MechanicalSurfaceImpedance
                               :quantitykind/Transmittance
                               :quantitykind/SoundExposure
                               :quantitykind/Wavenumber
                               :quantitykind/PropagationCoefficient
                               :quantitykind/ReverberationTime
                               :quantitykind/GroupSpeedOfSound
                               :quantitykind/AttenuationCoefficient
                               :quantitykind/SoundVolumeVelocity
                               :quantitykind/SoundExposureLevel
                               :quantitykind/StaticPressure
                               :quantitykind/AngularFrequency],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Acoustics"},
   :skos/broader     :discipline/ClassicalMechanics})

(def AeroThermalDynamics
  "AeroThermalDynamics"
  {:db/ident         :discipline/AeroThermalDynamics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "AeroThermalDynamics"}
                      {:rdf/language "en",
                       :rdf/value    "Aero thermal dynamics"}],
   :skos/broader     :discipline/Aerodynamics})

(def Aerodynamics
  "<p>Aerodynamics is the study of the motion of air, particularly its interaction with a solid object, such as an airplane wing. Aerodynamics is a sub-field of fluid dynamics and gas dynamics, and many aspects of aerodynamics theory are common to these fields. The term aerodynamics is often used synonymously with gas dynamics, the difference being that \"gas dynamics\" applies to the study of the motion of all gases, and is not limited to air.</p>"
  {:db/ident :discipline/Aerodynamics,
   :qudt/onlineReference
   ["https://www.nasa.gov/audience/forstudents/k-4/stories/nasa-knows/what-is-aerodynamics-k4.html"
    "https://en.wikipedia.org/wiki/Aerodynamics"],
   :rdf/type :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Aerodynamics"},
   :skos/broader [:discipline/SpaceSystemEngineering
                  :discipline/Science
                  :discipline/FluidDynamics],
   :skos/definition
   "<p>Aerodynamics is the study of the motion of air, particularly its interaction with a solid object, such as an airplane wing. Aerodynamics is a sub-field of fluid dynamics and gas dynamics, and many aspects of aerodynamics theory are common to these fields. The term aerodynamics is often used synonymously with gas dynamics, the difference being that \"gas dynamics\" applies to the study of the motion of all gases, and is not limited to air.</p>"})

(def Any
  "Any"
  {:db/ident         :discipline/Any,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Any"}})

(def ArtificalGravity
  "ArtificalGravity"
  {:db/ident         :discipline/ArtificalGravity,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "ArtificalGravity"}
                      {:rdf/language "en",
                       :rdf/value    "Artifical gravity"}],
   :skos/broader     :discipline/StructuresAndMechanics})

(def Astrionics
  "<p><em>Astrionics</em> is the science and technology of the development and application of electronic systems, sub-systems, and components used in spacecraft. The electronic systems on board a spacecraft include attitude determination and control, communications, command and telemetry, and computer systems. Sensors refers to the electronic components on board a spacecraft. For engineers one of the most important considerations that must be made in the design process is the environment in which the spacecraft systems and components must operate and endure. The challenges of designing systems and components for the space environment include more than the fact that space is a vacuum.</p>"
  {:db/ident :discipline/Astrionics,
   :qudt/onlineReference
   ["https://en.wikipedia.org/wiki/Astrionics"
    "https://ntrs.nasa.gov/search.jsp?R=19740019253&amp;hterms=Handbook+MAP&amp;qs=Ntx%3Dmode%2520matchall%26t%3D0%26Ntk%3DAll%26N%3D4294945352%2B4294967253%26Ntt%3DHandbook%2520for%2520MAP"],
   :rdf/type :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Astrionics"},
   :skos/broader :discipline/SpaceSystemEngineering,
   :skos/definition
   "<p><em>Astrionics</em> is the science and technology of the development and application of electronic systems, sub-systems, and components used in spacecraft. The electronic systems on board a spacecraft include attitude determination and control, communications, command and telemetry, and computer systems. Sensors refers to the electronic components on board a spacecraft. For engineers one of the most important considerations that must be made in the design process is the environment in which the spacecraft systems and components must operate and endure. The challenges of designing systems and components for the space environment include more than the fact that space is a vacuum.</p>",
   :skos/narrower [:discipline/Communications
                   :discipline/IntegratedVehicleHealthManagement
                   :discipline/AttitudeControl
                   :discipline/GuidanceAndNavigation]})

(def Astrobiology
  "Astrobiology"
  {:db/ident         :discipline/Astrobiology,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Astrobiology"},
   :skos/broader     :discipline/Biology})

(def Astrodynamics
  "Astrodynamics"
  {:db/ident         :discipline/Astrodynamics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Astrodynamics"},
   :skos/broader     [:discipline/SpaceSystemEngineering
                      :discipline/Science
                      :discipline/ClassicalMechanics],
   :skos/narrower    :discipline/OrbitalMechanics})

(def AtmosphericChemistry
  "AtmosphericChemistry"
  {:db/ident         :discipline/AtmosphericChemistry,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "AtmosphericChemistry"},
   :skos/broader     :discipline/AtmosphericScience})

(def AtmosphericPhysics
  "AtmosphericPhysics"
  {:db/ident         :discipline/AtmosphericPhysics,
   :qudt/relevantQuantityKind :quantitykind/AtmosphericPressure,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "AtmosphericPhysics"},
   :skos/broader     :discipline/AtmosphericScience})

(def AtmosphericScience
  "AtmosphericScience"
  {:db/ident         :discipline/AtmosphericScience,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "AtmosphericScience"},
   :skos/broader     :discipline/Science})

(def AtomicPhysics
  "AtomicPhysics"
  {:db/ident         :discipline/AtomicPhysics,
   :qudt/relevantQuantityKind
   [:quantitykind/ElementaryCharge
    :quantitykind/ExposureRate
    :quantitykind/ReactorTimeConstant
    :quantitykind/MaximumBeta-ParticleEnergy
    :quantitykind/ParticleFluence
    :quantitykind/AtomicMass
    :quantitykind/EnergyImparted
    :quantitykind/AbsorbedDoseRate
    :quantitykind/GyromagneticRatio
    :quantitykind/MeanEnergyImparted
    :quantitykind/LarmorAngularFrequency
    :quantitykind/DecayConstant
    :quantitykind/TotalAngularMomentumQuantumNumber
    :quantitykind/ParticleFluenceRate
    :quantitykind/RecombinationCoefficient
    :quantitykind/CyclotronAngularFrequency
    :quantitykind/BohrRadius
    :quantitykind/MassExcess
    :quantitykind/ParticleSourceDensity
    :quantitykind/LinearIonization
    :quantitykind/Slowing-DownArea
    :quantitykind/DoseEquivalentQualityFactor
    :quantitykind/Slowing-DownLength
    :quantitykind/MassNumber
    :quantitykind/OrbitalAngularMomentumQuantumNumber
    :quantitykind/LandeGFactor
    :quantitykind/Kerma
    :quantitykind/EnergyFluenceRate
    :quantitykind/ThermalUtilizationFactor
    :quantitykind/MeanMassRange
    :quantitykind/AbsorbedDose
    :quantitykind/MacroscopicCrossSection
    :quantitykind/MeanLinearRange
    :quantitykind/EnergyFluence
    :quantitykind/MeanLifetime
    :quantitykind/RestEnergy
    :quantitykind/NuclearRadius
    :quantitykind/HyperfineStructureQuantumNumber
    :quantitykind/NeutronNumber
    :quantitykind/ResonanceEscapeProbability
    :quantitykind/LinearAttenuationCoefficient
    :quantitykind/NuclearMagneton
    :quantitykind/Half-ValueThickness
    :quantitykind/TotalIonization
    :quantitykind/InternalConversionFactor
    :quantitykind/RadiantEnergy
    :quantitykind/MultiplicationFactor
    :quantitykind/SpectralCrossSection
    :quantitykind/NeutronYieldPerAbsorption
    :quantitykind/NucleonNumber
    :quantitykind/GFactorOfNucleus
    :quantitykind/SpinQuantumNumber
    :quantitykind/SpecificActivity
    :quantitykind/RelativeMassExcess
    :quantitykind/ResonanceEnergy
    :quantitykind/RydbergConstant
    :quantitykind/EffectiveMultiplicationFactor
    :quantitykind/ParticleCurrent
    :quantitykind/MeanFreePath
    :quantitykind/InfiniteMultiplicationFactor
    :quantitykind/TotalCrossSection
    :quantitykind/Spin
    :quantitykind/NeutronDiffusionCoefficient
    :quantitykind/ElectronGyromagneticRatio
    :quantitykind/MassEnergyTransferCoefficient
    :quantitykind/Exposure
    :quantitykind/DiffusionLength
    :quantitykind/LinearEnergyTransfer
    :quantitykind/NuclearSpinQuantumNumber
    :quantitykind/MassDefect
    :quantitykind/MacroscopicTotalCrossSection
    :quantitykind/RelativeMassDefect
    :quantitykind/FineStructureConstant
    :quantitykind/DiffusionCoefficientForFluenceRate
    :quantitykind/HartreeEnergy
    :quantitykind/SpectralAngularCrossSection
    :quantitykind/Reactivity
    :quantitykind/Half-Life
    :quantitykind/BetaDisintegrationEnergy
    :quantitykind/Activity
    :quantitykind/DoseEquivalent
    :quantitykind/AtomicMassConstant
    :quantitykind/BohrMagneton
    :quantitykind/PlanckConstant
    :quantitykind/MagneticQuantumNumber
    :quantitykind/PrincipalQuantumNumber
    :quantitykind/FastFissionFactor
    :quantitykind/TotalLinearStoppingPower
    :quantitykind/MigrationLength
    :quantitykind/AverageLogarithmicEnergyDecrement
    :quantitykind/AverageEnergyLossPerElementaryChargeProduced
    :quantitykind/ChargeNumber
    :quantitykind/LevelWidth
    :quantitykind/TotalAngularMomentum
    :quantitykind/ReducedPlanckConstant
    :quantitykind/KermaRate
    :quantitykind/NuclearQuadrupoleMoment
    :quantitykind/MolarAttenuationCoefficient
    :quantitykind/AtomicCharge
    :quantitykind/Lethargy
    :quantitykind/Slowing-DownDensity
    :quantitykind/MassAttenuationCoefficient
    :quantitykind/TotalAtomicStoppingPower
    :quantitykind/RestMass
    :quantitykind/ComptonWavelength
    :quantitykind/ActivityConcentration
    :quantitykind/CrossSection
    :quantitykind/AlphaDisintegrationEnergy
    :quantitykind/DiffusionArea
    :quantitykind/TotalMassStoppingPower
    :quantitykind/AngularCrossSection
    :quantitykind/AtomicNumber
    :quantitykind/ReactionEnergy
    :quantitykind/SpecificEnergyImparted
    :quantitykind/SurfaceActivityDensity
    :quantitykind/ParticleNumberDensity
    :quantitykind/IonDensity
    :quantitykind/ElectronRadius
    :quantitykind/QuantumNumber
    :quantitykind/Mobility
    :quantitykind/Non-LeakageProbability
    :quantitykind/NeutronYieldPerFission
    :quantitykind/BindingFraction
    :quantitykind/AtomicAttenuationCoefficient
    :quantitykind/MigrationArea
    :quantitykind/PackingFraction],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "AtomicPhysics"},
   :skos/broader     :discipline/Physics})

(def AttitudeControl
  "AttitudeControl"
  {:db/ident         :discipline/AttitudeControl,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "AttitudeControl"}
                      {:rdf/language "en",
                       :rdf/value    "Attitude control"}],
   :skos/broader     :discipline/Astrionics})

(def Autonomy
  "Autonomy"
  {:db/ident         :discipline/Autonomy,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Autonomy"},
   :skos/broader     :discipline/Engineering})

(def Avionics
  "Avionics"
  {:db/ident         :discipline/Avionics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Avionics"},
   :skos/broader     :discipline/SpaceSystemEngineering})

(def BioChemistry
  "BioChemistry"
  {:db/ident         :discipline/BioChemistry,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "BioChemistry"},
   :skos/broader     :discipline/LifeSciences})

(def BioInformatics
  "BioInformatics"
  {:db/ident         :discipline/BioInformatics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "BioInformatics"},
   :skos/broader     :discipline/Informatics})

(def Biology
  "Biology"
  {:db/ident         :discipline/Biology,
   :qudt/relevantQuantityKind [:quantitykind/SerumOrPlasmaLevel
                               :quantitykind/RespiratoryRate
                               :quantitykind/MicrobialFormation
                               :quantitykind/HeartRate],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Biology"},
   :skos/broader     :discipline/Science})

(def Biomechanics
  "Biomechanics"
  {:db/ident         :discipline/Biomechanics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Biomechanics"},
   :skos/broader     :discipline/ClassicalMechanics})

(def CelestialMechanics
  "CelestialMechanics"
  {:db/ident         :discipline/CelestialMechanics,
   :qudt/relevantQuantityKind [:quantitykind/StandardGravitationalParameter
                               :quantitykind/GravitationalAttraction],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "CelestialMechanics"}
                      {:rdf/language "en",
                       :rdf/value    "Celestial mechanics"}],
   :skos/broader     [:discipline/ClassicalMechanics
                      :discipline/Astrodynamics]})

(def CharacteristicNumber
  {:db/ident :discipline/CharacteristicNumber,
   :qudt/relevantQuantityKind [:quantitykind/ReynoldsNumber
                               :quantitykind/MachNumber]})

(def ChemicalEngineering
  "ChemicalEngineering"
  {:db/ident         :discipline/ChemicalEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "ChemicalEngineering"}
                      {:rdf/language "en",
                       :rdf/value    "Chemical engineering"}],
   :skos/broader     [:discipline/PhysicalScience :discipline/Engineering]})

(def ChemicalPropulsion
  "Chemical propulsion"
  {:db/ident         :discipline/ChemicalPropulsion,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Chemical propulsion"},
   :skos/broader     :discipline/Propulsion})

(def Chemistry
  "Chemistry"
  {:db/ident         :discipline/Chemistry,
   :qudt/relevantQuantityKind
   [:quantitykind/MassConcentration
    :quantitykind/MolarEntropy
    :quantitykind/MolalityOfSolute
    :quantitykind/ChemicalAffinity
    :quantitykind/AtomicNumber
    :quantitykind/ChemicalPotential
    :quantitykind/ThermalDiffusionRatioCoefficient
    :quantitykind/MeanFreePath
    :quantitykind/RelativeAtomicMass
    :quantitykind/StandardAbsoluteActivity
    :quantitykind/StandardChemicalPotential
    :quantitykind/OsmoticPressure
    :quantitykind/StoichiometricNumber
    :quantitykind/DiffusionCoefficient
    :quantitykind/MagneticDipoleMoment
    :quantitykind/StatisticalWeight
    :quantitykind/MolarVolume
    :quantitykind/AmountOfSubstance
    :quantitykind/ElectrolyticConductivity
    :quantitykind/ExtentOfReaction
    :quantitykind/IonTransportNumber
    :quantitykind/EquilibriumConstantOnPressureBasis
    :quantitykind/ChargeNumber
    :quantitykind/AmountOfSubstanceConcentrationOfB
    :quantitykind/QuantumNumber
    :quantitykind/Fugacity
    :quantitykind/MolarEnergy
    :quantitykind/Concentration
    :quantitykind/ActivityCoefficient
    :quantitykind/MassAmountOfSubstance
    :quantitykind/MolarMass
    :quantitykind/ElectricPolarizability
    :quantitykind/AmountOfSubstanceFractionOfB
    :quantitykind/GrandCanonicalPartitionFunction
    :quantitykind/NumberDensity
    :quantitykind/MolecularMass
    :quantitykind/DegreeOfDissociation
    :quantitykind/ElementaryCharge
    :quantitykind/AvogadroConstant
    :quantitykind/BoltzmannConstant
    :quantitykind/AbsoluteActivity
    :quantitykind/MolarOpticalRotatoryPower
    :quantitykind/InverseAmountOfSubstance
    :quantitykind/CatalyticActivity
    :quantitykind/FaradayConstant
    :quantitykind/ThermalDiffusionFactor
    :quantitykind/RelativeMolecularMass
    :quantitykind/OsmoticCoefficient
    :quantitykind/SpecificOpticalRotatoryPower
    :quantitykind/MoleFraction
    :quantitykind/ElectricDipoleMoment
    :quantitykind/MolarHeatCapacity
    :quantitykind/TemperatureAmountOfSubstance
    :quantitykind/Turbidity
    :quantitykind/MolecularConcentration
    :quantitykind/VolumeFraction
    :quantitykind/AmountOfSubstancePerUnitVolume
    :quantitykind/PartialPressure
    :quantitykind/EquilibriumConstant
    :quantitykind/LengthMolarEnergy
    :quantitykind/AngleOfOpticalRotation
    :quantitykind/MassAmountOfSubstanceTemperature
    :quantitykind/EquilibriumConstantOnConcentrationBasis
    :quantitykind/MolarConductivity
    :quantitykind/ElectricChargePerAmountOfSubstance
    :quantitykind/AmountOfSubstancePerUnitMass
    :quantitykind/NumberOfParticles
    :quantitykind/CanonicalPartitionFunction
    :quantitykind/MolarGasConstant
    :quantitykind/MassFraction
    :quantitykind/EnergyAndWorkPerMassAmountOfSubstance
    :quantitykind/ThermalDiffusionRatio
    :quantitykind/MassDensity
    :quantitykind/MicroCanonicalPartitionFunction
    :quantitykind/IonicStrength],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Chemistry"},
   :skos/broader     :discipline/Science})

(def ClassicalMechanics
  "ClassicalMechanics"
  {:db/ident         :discipline/ClassicalMechanics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "ClassicalMechanics"},
   :skos/broader     [:discipline/Physics :discipline/Mechanics]})

(def Climatology
  "Climatology"
  {:db/ident         :discipline/Climatology,
   :qudt/relevantQuantityKind :quantitykind/AbsoluteHumidity,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Climatology"},
   :skos/broader     :discipline/AtmosphericScience})

(def Commerce
  "Commerce"
  {:db/ident         :discipline/Commerce,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Commerce"},
   :skos/broader     :discipline/Economics})

(def Communications
  "Communications"
  {:db/ident         :discipline/Communications,
   :qudt/relevantQuantityKind [:quantitykind/SignalDetectionThreshold
                               :quantitykind/DataRate
                               :quantitykind/Gain
                               :quantitykind/SignalStrength
                               :quantitykind/RF-Power],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Communications"},
   :skos/broader     [:discipline/Astrionics :discipline/Engineering]})

(def ComputerScience
  "ComputerScience"
  {:db/ident         :discipline/ComputerScience,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "ComputerScience"}
                      {:rdf/language "en",
                       :rdf/value    "Computer science"}
                      {:rdf/language "en",
                       :rdf/value    "Computer science discipline"}],
   :skos/broader     :discipline/Science})

(def ConfigurationManagement
  "ConfigurationManagement"
  {:db/ident         :discipline/ConfigurationManagement,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "ConfigurationManagement"}
                      {:rdf/language "en",
                       :rdf/value    "Configuration management"}],
   :skos/broader     [:discipline/SystemEngineering :discipline/Management]})

(def ContinuumMechanics
  "ContinuumMechanics"
  {:db/ident         :discipline/ContinuumMechanics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "ContinuumMechanics"},
   :skos/broader     :discipline/Mechanics})

(def ControlEngineering
  "ControlEngineering"
  {:db/ident         :discipline/ControlEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "ControlEngineering"}
                      {:rdf/language "en",
                       :rdf/value    "Control engineering"}],
   :skos/broader     [:discipline/PhysicalScience :discipline/Engineering]})

(def CostEstimation
  "CostEstimation"
  {:db/ident         :discipline/CostEstimation,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "CostEstimation"}
                      {:rdf/language "en",
                       :rdf/value    "Cost estimation"}],
   :skos/broader     :discipline/Finance})

(def Cryogenics
  "Cryogenics"
  {:db/ident         :discipline/Cryogenics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Cryogenics"},
   :skos/broader     [:discipline/SpaceSystemEngineering
                      :discipline/Physics
                      :discipline/PhysicalScience]})

(def Currency
  "Currency"
  {:db/ident         :discipline/Currency,
   :qudt/relevantQuantityKind :quantitykind/Currency,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Currency"},
   :skos/broader     :discipline/Finance})

(def Dimensionless
  "Dimensionless"
  {:db/ident         :discipline/Dimensionless,
   :qudt/relevantQuantityKind [:quantitykind/DimensionlessRatio
                               :quantitykind/Dimensionless],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Dimensionless"},
   :skos/broader     "http://qudt.org/vocab/discipline/"})

(def Dynamics
  "Dynamics"
  {:db/ident         :discipline/Dynamics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Dynamics"},
   :skos/broader     :discipline/Engineering})

(def Economics
  "Economics"
  {:db/ident         :discipline/Economics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Economics"},
   :skos/broader     :discipline/SocialScience})

(def ElectricalEngineering
  "ElectricalEngineering"
  {:db/ident         :discipline/ElectricalEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "ElectricalEngineering"}
                      {:rdf/language "en",
                       :rdf/value    "Electrical Engineering"}],
   :skos/broader     :discipline/Engineering})

(def ElectricityAndMagnetism
  "ElectricityAndMagnetism"
  {:db/ident         :discipline/ElectricityAndMagnetism,
   :qudt/relevantQuantityKind
   [:quantitykind/MagneticPolarization
    :quantitykind/CubicElectricDipoleMomentPerSquareEnergy
    :quantitykind/ElectricDisplacementField
    :quantitykind/ModulusOfAdmittance
    :quantitykind/ElectricChargeVolumeDensity
    :quantitykind/ElectromotiveForce
    :quantitykind/MagneticDipoleMoment
    :quantitykind/MagneticFlux
    :quantitykind/ComplexPower
    :quantitykind/QualityFactor
    :quantitykind/VoltagePhasor
    :quantitykind/Polarizability
    :quantitykind/LinearElectricCurrentDensity
    :quantitykind/ElectricCurrentPerUnitEnergy
    :quantitykind/Permittivity
    :quantitykind/Permeability
    :quantitykind/ElectricCharge
    :quantitykind/MagneticTension
    :quantitykind/InversePermittivity
    :quantitykind/EnergyPerAreaElectricCharge
    :quantitykind/MagneticFluxDensity
    :quantitykind/LinkedFlux
    :quantitykind/ElectricField
    :quantitykind/Conductance
    :quantitykind/Reluctance
    :quantitykind/MagneticConstant
    :quantitykind/ElectricCurrent
    :quantitykind/Voltage
    :quantitykind/ElectricCurrentPerAngle
    :quantitykind/ElectromagneticEnergyDensity
    :quantitykind/MagneticField
    :quantitykind/ElectricQuadrupoleMoment
    :quantitykind/ElectricChargePerMass
    :quantitykind/DisplacementCurrent
    :quantitykind/ElectricPower
    :quantitykind/VolumicElectromagneticEnergy
    :quantitykind/ElectricChargeDensity
    :quantitykind/PermeabilityOfVacuum
    :quantitykind/DisplacementCurrentDensity
    :quantitykind/ModulusOfImpedance
    :quantitykind/EnergyPerElectricCharge
    :quantitykind/PermittivityRatio
    :quantitykind/TotalCurrent
    :quantitykind/ElectricDisplacement
    :quantitykind/Resistance
    :quantitykind/QuarticElectricDipoleMomentPerCubicEnergy
    :quantitykind/PolarizationField
    :quantitykind/ScalarMagneticPotential
    :quantitykind/ElectricChargePerArea
    :quantitykind/Resistivity
    :quantitykind/MagnetizationField
    :quantitykind/ElectromagneticWavePhaseSpeed
    :quantitykind/ElectricFluxDensity
    :quantitykind/ActivePower
    :quantitykind/Permeance
    :quantitykind/InverseMagneticFlux
    :quantitykind/ElectricChargeLineDensity
    :quantitykind/MagneticMoment
    :quantitykind/ElectricCurrentDensity
    :quantitykind/MagnetomotiveForce
    :quantitykind/PowerFactor
    :quantitykind/MagneticAreaMoment
    :quantitykind/MutualInductance
    :quantitykind/NonActivePower
    :quantitykind/ElectricFlux
    :quantitykind/AuxillaryMagneticField
    :quantitykind/ElectricChargeSurfaceDensity
    :quantitykind/ElectricCurrentPerUnitLength
    :quantitykind/Turns
    :quantitykind/ForcePerElectricCharge
    :quantitykind/LossAngle
    :quantitykind/LinearElectricCurrent
    :quantitykind/ElectricPotentialDifference
    :quantitykind/ElectricPolarization
    :quantitykind/SourceVoltage
    :quantitykind/ElectricChargeLinearDensity
    :quantitykind/ApparentPower
    :quantitykind/CouplingFactor
    :quantitykind/Capacitance
    :quantitykind/Impedance
    :quantitykind/PoyntingVector
    :quantitykind/MagneticSusceptability
    :quantitykind/PermittivityOfVacuum
    :quantitykind/ElectricConductivity
    :quantitykind/ElectricCurrentPhasor
    :quantitykind/MagneticVectorPotential
    :quantitykind/ReactivePower
    :quantitykind/Susceptance
    :quantitykind/ActiveEnergy
    :quantitykind/Admittance
    :quantitykind/MagneticReluctivity
    :quantitykind/LeakageFactor
    :quantitykind/Magnetization
    :quantitykind/Conductivity
    :quantitykind/EnergyPerSquareMagneticFluxDensity
    :quantitykind/LengthPerUnitElectricCurrent
    :quantitykind/ElectricFieldStrength
    :quantitykind/ElectricDipoleMoment
    :quantitykind/PowerPerElectricCharge
    :quantitykind/Coercivity
    :quantitykind/Reactance
    :quantitykind/PhaseDifference
    :quantitykind/Inductance
    :quantitykind/ElectricPotential
    :quantitykind/CurrentLinkage
    :quantitykind/MagneticFieldStrength
    :quantitykind/MagneticFluxPerUnitLength
    :quantitykind/LossFactor
    :quantitykind/SpeedOfLight
    :quantitykind/ElectricSusceptibility
    :quantitykind/TotalCurrentDensity
    :quantitykind/ElectricChargePerAmountOfSubstance
    :quantitykind/MassPerElectricCharge],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "ElectricityAndMagnetism"},
   :skos/broader     :discipline/Physics})

(def ElectronicEngineering
  "ElectronicEngineering"
  {:db/ident         :discipline/ElectronicEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "ElectronicEngineering"},
   :skos/broader     :discipline/Engineering})

(def Energy
  "Energy"
  {:db/ident         :discipline/Energy,
   :qudt/relevantQuantityKind [:quantitykind/EnergyKinetic
                               :quantitykind/InverseSquareEnergy
                               :quantitykind/EnergyDensity
                               :quantitykind/KineticEnergy
                               :quantitykind/LengthEnergy
                               :quantitykind/PowerAreaPerSolidAngle
                               :quantitykind/EnergyInternal
                               :quantitykind/InverseEnergy
                               :quantitykind/SquareEnergy
                               :quantitykind/PowerPerArea
                               :quantitykind/PowerPerAreaAngle
                               :quantitykind/PotentialEnergy
                               :quantitykind/PowerArea
                               :quantitykind/Power
                               :quantitykind/EnergyPerArea],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Energy"},
   :skos/broader     :discipline/Physics})

(def Engineering
  "Engineering"
  {:db/ident         :discipline/Engineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Engineering"},
   :skos/broader     [:discipline/Any "http://qudt.org/vocab/discipline/"]})

(def EnvironmentControl
  "EnvironmentControl"
  {:db/ident         :discipline/EnvironmentControl,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "EnvironmentControl"}
                      {:rdf/language "en",
                       :rdf/value    "Environment control"}],
   :skos/broader     :discipline/SpaceSystemEngineering})

(def Finance
  "Finance"
  {:db/ident         :discipline/Finance,
   :qudt/relevantQuantityKind :quantitykind/Asset,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Finance"},
   :skos/broader     [:discipline/Any "http://qudt.org/vocab/discipline/"]})

(def FluidDynamics
  "Fluid dynamics is the sub-discipline of fluid mechanics dealing with fluids (liquids and gases) in motion. It has several subdisciplines itself, including aerodynamics (the study of gases in motion) and hydrodynamics (the study of liquids in motion). Fluid dynamics has a wide range of applications, including calculating forces and moments on aircraft, determining the mass flow rate of petroleum through pipelines, predicting weather patterns, understanding nebulae in interstellar space and reportedly modelling fission weapon detonation. Some of its principles are even used in traffic engineering, where traffic is treated as a continuous fluid. Fluid dynamics offers a systematic structure that underlies these practical disciplines and that embraces empirical and semi-empirical laws, derived from flow measurement, used to solve practical problems. The solution of a fluid dynamics problem typically involves calculation of various properties of the fluid, such as velocity, pressure, density, and temperature, as functions of space and time."
  {:db/ident :discipline/FluidDynamics,
   :dcterms/description
   "Fluid dynamics is the sub-discipline of fluid mechanics dealing with fluids (liquids and gases) in motion. It has several subdisciplines itself, including aerodynamics (the study of gases in motion) and hydrodynamics (the study of liquids in motion). Fluid dynamics has a wide range of applications, including calculating forces and moments on aircraft, determining the mass flow rate of petroleum through pipelines, predicting weather patterns, understanding nebulae in interstellar space and reportedly modelling fission weapon detonation. Some of its principles are even used in traffic engineering, where traffic is treated as a continuous fluid.\nFluid dynamics offers a systematic structure that underlies these practical disciplines and that embraces empirical and semi-empirical laws, derived from flow measurement, used to solve practical problems. The solution of a fluid dynamics problem typically involves calculation of various properties of the fluid, such as velocity, pressure, density, and temperature, as functions of space and time.",
   :qudt/relevantQuantityKind [:quantitykind/MolecularViscosity
                               :quantitykind/DynamicPressure
                               :quantitykind/ForcePerArea
                               :quantitykind/Circulation
                               :quantitykind/TotalPressure
                               :quantitykind/Viscosity
                               :quantitykind/Vorticity
                               :quantitykind/DynamicViscosity
                               :quantitykind/StaticPressure
                               :quantitykind/KinematicViscosity
                               :quantitykind/SoundPressure
                               :quantitykind/Pressure
                               :quantitykind/ReynoldsNumber],
   :rdf/type :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "FluidDynamics"}
                {:rdf/language "en",
                 :rdf/value    "Fluid dynamics"}],
   :skos/broader :discipline/FluidMechanics,
   :skos/narrower [:discipline/Hydrodynamics :discipline/Aerodynamics]})

(def FluidMechanics
  "FluidMechanics"
  {:db/ident         :discipline/FluidMechanics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "FluidMechanics"}
                      {:rdf/language "en",
                       :rdf/value    "Fluid mechanics"}],
   :skos/broader     [:discipline/PhysicalScience
                      :discipline/ClassicalMechanics],
   :skos/narrower    :discipline/FluidDynamics})

(def GuidanceAndNavigation
  "GuidanceAndNavigation"
  {:db/ident         :discipline/GuidanceAndNavigation,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "GuidanceAndNavigation"}
                      {:rdf/language "en",
                       :rdf/value    "Guidance and Navigation"}],
   :skos/broader     [:discipline/Avionics :discipline/Astrionics]})

(def HumanFactors
  "HumanFactors"
  {:db/ident         :discipline/HumanFactors,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "HumanFactors"}
                      {:rdf/language "en",
                       :rdf/value    "Human factors"}],
   :skos/broader     :discipline/SocialScience})

(def Hydraulics
  "Hydraulics"
  {:db/ident         :discipline/Hydraulics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Hydraulics"},
   :skos/broader     :discipline/ClassicalMechanics})

(def HydraulicsEngineering
  "Hydraulics engineering"
  {:db/ident         :discipline/HydraulicsEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Hydraulics engineering"},
   :skos/broader     [:discipline/PhysicalScience :discipline/Engineering]})

(def Hydrodynamics
  "Hydrodynamics"
  {:db/ident         :discipline/Hydrodynamics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Hydrodynamics"},
   :skos/broader     :discipline/FluidDynamics})

(def HypersonicAerodynamics
  "<p><em>Hypersonic Aerodynamics</em> is a special branch of the study of aeronautics. The chief characteristic of hypersonic aerodynamics is that the temperature of the flow around the aircraft is so great that the chemistry of the gas must be considered. At low hypersonic speeds, the molecular bonds vibrate, which changes the magnitude of the forces generated by the air on the aircraft. At higher hypersonic speeds, the molecules break apart producing an electrically charged plasma around the aircraft. Large variations in air density and pressure occur because of shock waves, and expansions. Hypersonic aircraft typically have very thick boundary layers along the surface and high heat transfer to the surface. All of these high speed flow phenomena lead to a vehicle design unlike the typical airliner or fighter aircraft.</p>"
  {:db/ident :discipline/HypersonicAerodynamics,
   :qudt/onlineReference
   ["https://www.tudelft.nl/en/ae/organisation/departments/aerodynamics-wind-energy-flight-performance-and-propulsion/aerodynamics/research/supersonic-and-hypersonic-aerodynamics/"
    "https://www.nasa.gov/feature/hypersonics-and-space-technologies"
    "http://www.grc.nasa.gov/WWW/BGH/bgh.html"],
   :rdf/type :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "HypersonicAerodynamics"}
                {:rdf/language "en",
                 :rdf/value    "Hypersonic aerodynamics"}],
   :skos/broader :discipline/Aerodynamics,
   :skos/definition
   "<p><em>Hypersonic Aerodynamics</em> is a special branch of the study of aeronautics. The chief characteristic of hypersonic aerodynamics is that the temperature of the flow around the aircraft is so great that the chemistry of the gas must be considered. At low hypersonic speeds, the molecular bonds vibrate, which changes the magnitude of the forces generated by the air on the aircraft. At higher hypersonic speeds, the molecules break apart producing an electrically charged plasma around the aircraft. Large variations in air density and pressure occur because of shock waves, and expansions. Hypersonic aircraft typically have very thick boundary layers along the surface and high heat transfer to the surface. All of these high speed flow phenomena lead to a vehicle design unlike the typical airliner or fighter aircraft.</p>"})

(def Informatics
  "Informatics"
  {:db/ident         :discipline/Informatics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Informatics"},
   :skos/broader     :discipline/ComputerScience})

(def InformationEngineering
  "Information engineering"
  {:db/ident         :discipline/InformationEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Information engineering"},
   :skos/broader     [:discipline/Science :discipline/Engineering]})

(def InformationTheory
  "InformationTheory"
  {:db/ident         :discipline/InformationTheory,
   :qudt/relevantQuantityKind [:quantitykind/VideoFrameRate
                               :quantitykind/InformationFlowRate
                               :quantitykind/InformationEntropy
                               :quantitykind/DataRate
                               :quantitykind/Capacity],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "InformationTheory"},
   :skos/broader     :discipline/Informatics})

(def IntegratedSystemHealthMonitoriing
  "Integrated system health monitoriing"
  {:db/ident         :discipline/IntegratedSystemHealthMonitoriing,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Integrated system health monitoriing"},
   :skos/broader     :discipline/Systems})

(def IntegratedSystemHealthMonitoring
  "Integrated system health monitoring"
  {:db/ident         :discipline/IntegratedSystemHealthMonitoring,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "IntegratedSystemHealthMonitoring"}
                      {:rdf/language "en",
                       :rdf/value    "Integrated system health monitoring"}],
   :skos/broader     [:discipline/SystemEngineering
                      :discipline/SpaceSystemEngineering],
   :skos/prefLabel   "Integrated system health monitoring"})

(def IntegratedVehicleHealthManagement
  "IntegratedVehicleHealthManagement"
  {:db/ident         :discipline/IntegratedVehicleHealthManagement,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "IntegratedVehicleHealthManagement"}
                      {:rdf/language "en",
                       :rdf/value    "Integrated vehicle health management"}],
   :skos/broader     [:discipline/SystemEngineering
                      :discipline/IntegratedSystemHealthMonitoring
                      :discipline/Astrionics]})

(def Kinematics
  "Kinematics"
  {:db/ident         :discipline/Kinematics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Kinematics"},
   :skos/broader     :discipline/ClassicalMechanics})

(def KnowledgeEngineering
  "KnowledgeEngineering"
  {:db/ident         :discipline/KnowledgeEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "KnowledgeEngineering"}
                      {:rdf/language "en",
                       :rdf/value    "Knowledge Engineering"}],
   :skos/broader     [:discipline/Science :discipline/Engineering]})

(def LifeSciences
  "LifeSciences"
  {:db/ident         :discipline/LifeSciences,
   :qudt/relevantQuantityKind [:quantitykind/SerumOrPlasmaLevel
                               :quantitykind/BloodGlucoseLevel
                               :quantitykind/DiastolicBloodPressure
                               :quantitykind/SystolicBloodPressure
                               :quantitykind/RespiratoryRate
                               :quantitykind/MicrobialFormation
                               :quantitykind/EnergyExpenditure
                               :quantitykind/HeartRate],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "LifeSciences"},
   :skos/broader     :discipline/Biology})

(def Light
  "Light"
  {:db/ident         :discipline/Light,
   :qudt/relevantQuantityKind [:quantitykind/Wavelength
                               :quantitykind/RefractiveIndex],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Light"},
   :skos/broader     :discipline/Science})

(def Loads
  "Loads"
  {:db/ident         :discipline/Loads,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Loads"},
   :skos/broader     :discipline/SpaceSystemEngineering})

(def LoadsAnalysis
  "LoadsAnalysis"
  {:db/ident         :discipline/LoadsAnalysis,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "LoadsAnalysis"}
                      {:rdf/language "en",
                       :rdf/value    "Loads analysis"}],
   :skos/broader     :discipline/StructuresAndMechanics})

(def LoadsAndMassProperties
  "Loads and mass properties"
  {:db/ident         :discipline/LoadsAndMassProperties,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Loads and mass properties"},
   :skos/broader     [:discipline/SpaceSystemEngineering
                      :discipline/MechanicalEngineering]})

(def Logistics
  "Logistics"
  {:db/ident         :discipline/Logistics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Logistics"},
   :skos/broader     [:discipline/SpaceSystemEngineering
                      :discipline/Management]})

(def Macroeconomics
  "Macroeconomics"
  {:db/ident         :discipline/Macroeconomics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Macroeconomics"},
   :skos/broader     :discipline/Economics})

(def Management
  "Management"
  {:db/ident         :discipline/Management,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Management"},
   :skos/broader     [:discipline/Any "http://qudt.org/vocab/discipline/"]})

(def Mass
  "Mass"
  {:db/ident         :discipline/Mass,
   :qudt/relevantQuantityKind [:quantitykind/LinearDensity
                               :quantitykind/FractionalMass_Stage3
                               :quantitykind/PayloadMass
                               :quantitykind/FractionalMass_Stage1
                               :quantitykind/MassDensity
                               :quantitykind/MassOfElectricalPowerSupply
                               :quantitykind/FractionallMass_Stages1-3
                               :quantitykind/SecondStageMassRatio
                               :quantitykind/StagePropellantMass
                               :quantitykind/SingleStageLauncherMassRatio
                               :quantitykind/ShearStress
                               :quantitykind/VolumeFlowRate
                               :quantitykind/MassRatio
                               :quantitykind/FinalOrCurrentVehicleMass
                               :quantitykind/SurfaceTension
                               :quantitykind/PropellantMass
                               :quantitykind/MassOfSolidBooster
                               :quantitykind/RelativeMassDensity
                               :quantitykind/StageStructuralMass
                               :quantitykind/NormalStress
                               :quantitykind/FirstStageMassRatio
                               :quantitykind/Mass
                               :quantitykind/FractionalMass_Stage2
                               :quantitykind/SurfaceDensity
                               :quantitykind/ElectricPropulsionPropellantMass
                               :quantitykind/InitialVehicleMass
                               :quantitykind/MassFlowRate],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Mass"},
   :skos/broader     :discipline/ClassicalMechanics})

(def MassProperties
  "Mass properties"
  {:db/ident         :discipline/MassProperties,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Mass properties"},
   :skos/broader     :discipline/StructuresAndMechanics})

(def MassProperty
  "MassProperty"
  {:db/ident         :discipline/MassProperty,
   :qudt/relevantQuantityKind
   [:quantitykind/PRODUCT-OF-INERTIA_Z
    :quantitykind/GROSS-LIFT-OFF-WEIGHT
    :quantitykind/PRODUCT-OF-INERTIA_X
    :quantitykind/MASS-GROWTH-ALLOWANCE
    :quantitykind/PREDICTED-MASS
    :quantitykind/CENTER-OF-MASS
    :quantitykind/MOMENT-OF-INERTIA_Z
    :quantitykind/PRODUCT-OF-INERTIA
    :quantitykind/INERT-MASS
    :quantitykind/CENTER-OF-GRAVITY_Y
    :quantitykind/NOMINAL-ASCENT-PROPELLANT-MASS
    :quantitykind/CONTROL-MASS
    :quantitykind/PRODUCT-OF-INERTIA_Y
    :quantitykind/DELTA-V
    :quantitykind/CONTRACT-END-ITEM-SPECIFICATION-MASS
    :quantitykind/FLIGHT-PERFORMANCE-RESERVE-PROPELLANT-MASS
    :quantitykind/CENTER-OF-GRAVITY_Z
    :quantitykind/RESERVE-MASS
    :quantitykind/MomentOfInertia
    :quantitykind/MOMENT-OF-INERTIA_Y
    :quantitykind/MASS-DELIVERED
    :quantitykind/FUEL-BIAS
    :quantitykind/DRY-MASS
    :quantitykind/CENTER-OF-GRAVITY_X
    :quantitykind/TARGET-BOGIE-MASS
    :quantitykind/MASS-PROPERTY-UNCERTAINTY
    :quantitykind/MASS-MARGIN],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "MassProperty"},
   :skos/broader     :discipline/ClassicalMechanics})

(def Materials
  "Materials"
  {:db/ident         :discipline/Materials,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Materials"},
   :skos/broader     :discipline/StructuresAndMechanics})

(def MaterialsAndStructures
  "Materials and structures"
  {:db/ident         :discipline/MaterialsAndStructures,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Materials and structures"},
   :skos/broader     [:discipline/SpaceSystemEngineering
                      :discipline/MechanicalEngineering]})

(def MaterialsScience
  "MaterialsScience"
  {:db/ident         :discipline/MaterialsScience,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "MaterialsScience"},
   :skos/broader     :discipline/Science})

(def MechanicalEngineering
  "MechanicalEngineering"
  {:db/ident         :discipline/MechanicalEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "MechanicalEngineering"}
                      {:rdf/language "en",
                       :rdf/value    "Mechanical engineering"}],
   :skos/broader     [:discipline/PhysicalScience :discipline/Engineering]})

(def Mechanics
  "Mechanics"
  {:db/ident         :discipline/Mechanics,
   :qudt/relevantQuantityKind [:quantitykind/MassPerTime
                               :quantitykind/SecondMomentOfArea
                               :quantitykind/Thrust
                               :quantitykind/SpecificImpulseByWeight
                               :quantitykind/MolarAngularMomentum
                               :quantitykind/ForcePerLength
                               :quantitykind/NormalStress
                               :quantitykind/PotentialEnergy
                               :quantitykind/Power
                               :quantitykind/InternalEnergy
                               :quantitykind/ShearStrain
                               :quantitykind/InverseEnergy
                               :quantitykind/MassPerAreaTime
                               :quantitykind/StaticFriction
                               :quantitykind/SpecificImpulseByMass
                               :quantitykind/LinearMomentum
                               :quantitykind/MassPerArea
                               :quantitykind/PowerPerArea
                               :quantitykind/SecondPolarMomentOfArea
                               :quantitykind/GeneralizedForce
                               :quantitykind/SectionModulus
                               :quantitykind/AngularMomentum
                               :quantitykind/Stress
                               :quantitykind/EnergyDensity
                               :quantitykind/PolarMomentOfInertia
                               :quantitykind/Action
                               :quantitykind/SecondAxialMomentOfArea
                               :quantitykind/PowerPerAreaAngle
                               :quantitykind/StandardGravitationalParameter
                               :quantitykind/MomentOfInertia
                               :quantitykind/Tension
                               :quantitykind/SquareEnergy
                               :quantitykind/MassPerLength
                               :quantitykind/GeneralizedVelocity
                               :quantitykind/FirstMomentOfArea
                               :quantitykind/KineticEnergy
                               :quantitykind/ThrustToMassRatio
                               :quantitykind/ShearModulus
                               :quantitykind/Torque
                               :quantitykind/Strain
                               :quantitykind/Work
                               :quantitykind/Pressure
                               :quantitykind/MassFlowRate
                               :quantitykind/HamiltonFunction
                               :quantitykind/PowerAreaPerSolidAngle
                               :quantitykind/LinearStrain
                               :quantitykind/BulkModulus
                               :quantitykind/GeneralizedCoordinate
                               :quantitykind/LengthByForce
                               :quantitykind/AngularImpulse
                               :quantitykind/VolumeFlowRate
                               :quantitykind/MechanicalEnergy
                               :quantitykind/Momentum
                               :quantitykind/Compressibility
                               :quantitykind/SpecificVolume
                               :quantitykind/BendingMomentOfForce
                               :quantitykind/ShearStress
                               :quantitykind/Weight
                               :quantitykind/Force
                               :quantitykind/LagrangeFunction
                               :quantitykind/ModulusOfElasticity
                               :quantitykind/GeneralizedMomentum
                               :quantitykind/VolumeStrain
                               :quantitykind/PowerArea
                               :quantitykind/SpecificEnergy
                               :quantitykind/StrainEnergyDensity
                               :quantitykind/InverseSquareEnergy
                               :quantitykind/ForcePerAreaTime
                               :quantitykind/PoissonRatio
                               :quantitykind/Friction
                               :quantitykind/DynamicFriction
                               :quantitykind/SurfaceTension
                               :quantitykind/Efficiency],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Mechanics"},
   :skos/broader     :discipline/Physics})

(def Mechanisms
  "Mechanisms"
  {:db/ident         :discipline/Mechanisms,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Mechanisms"},
   :skos/broader     :discipline/StructuresAndMechanics})

(def MedicalInformatics
  "MedicalInformatics"
  {:db/ident         :discipline/MedicalInformatics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "MedicalInformatics"},
   :skos/broader     :discipline/Informatics})

(def Medicine
  "Medicine"
  {:db/ident         :discipline/Medicine,
   :qudt/relevantQuantityKind [:quantitykind/BodyMassIndex
                               :quantitykind/HeartRate
                               :quantitykind/DiastolicBloodPressure
                               :quantitykind/BloodGlucoseLevel
                               :quantitykind/EnergyExpenditure
                               :quantitykind/SystolicBloodPressure],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Medicine"},
   :skos/broader     :discipline/LifeSciences})

(def Meteorology
  "Meteorology"
  {:db/ident         :discipline/Meteorology,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Meteorology"},
   :skos/broader     :discipline/AtmosphericScience})

(def MissionPlanning
  "MissionPlanning"
  {:db/ident         :discipline/MissionPlanning,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "MissionPlanning"}
                      {:rdf/language "en",
                       :rdf/value    "Mission planning"}],
   :skos/broader     [:discipline/SystemEngineering
                      :discipline/SpaceSystemEngineering
                      :discipline/Management]})

(def ModelingAndSimulation
  "ModelingAndSimulation"
  {:db/ident         :discipline/ModelingAndSimulation,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "ModelingAndSimulation"}
                      {:rdf/language "en",
                       :rdf/value    "Modeling and simulation"}],
   :skos/broader     :discipline/SystemEngineering})

(def NuclearPhysics
  "NuclearPhysics"
  {:db/ident         :discipline/NuclearPhysics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "NuclearPhysics"},
   :skos/broader     :discipline/QuantumMechanics})

(def NuclearPower
  "Nuclear power"
  {:db/ident         :discipline/NuclearPower,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Nuclear power"},
   :skos/broader     :discipline/Engineering})

(def NuclearPropulsion
  "Nuclear propulsion"
  {:db/ident         :discipline/NuclearPropulsion,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Nuclear propulsion"},
   :skos/broader     :discipline/Propulsion})

(def Nutrition
  "Nutrition"
  {:db/ident         :discipline/Nutrition,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Nutrition"},
   :skos/broader     :discipline/LifeSciences})

(def Optics
  "Optics"
  {:db/ident         :discipline/Optics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Optics"},
   :skos/broader     [:discipline/Physics :discipline/Light]})

(def OrbitalMechanics
  "OrbitalMechanics"
  {:db/ident         :discipline/OrbitalMechanics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "OrbitalMechanics"}
                      {:rdf/language "en",
                       :rdf/value    "Orbital mechanics"}],
   :skos/broader     [:discipline/SpaceSystemEngineering
                      :discipline/Science
                      :discipline/Astrodynamics]})

(def ParticlePhysics
  "ParticlePhysics"
  {:db/ident         :discipline/ParticlePhysics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "ParticlePhysics"},
   :skos/broader     :discipline/QuantumMechanics})

(def Photometry
  "Photometry"
  {:db/ident         :discipline/Photometry,
   :qudt/relevantQuantityKind [:quantitykind/RadiantIntensity
                               :quantitykind/LuminousIntensity
                               :quantitykind/LuminousEfficacy
                               :quantitykind/LuminousFlux
                               :quantitykind/Frequency
                               :quantitykind/LuminousFluxPerArea
                               :quantitykind/LuminousEnergy
                               :quantitykind/ReflectanceFactor
                               :quantitykind/RadiantFluenceRate
                               :quantitykind/TransmittanceDensity
                               :quantitykind/LuminousEmmitance
                               :quantitykind/NapierianAbsorbance
                               :quantitykind/SphericalIlluminance
                               :quantitykind/RefractiveIndex
                               :quantitykind/Illuminance
                               :quantitykind/Wavenumber
                               :quantitykind/Transmittance
                               :quantitykind/Radiance
                               :quantitykind/Luminance
                               :quantitykind/SpectralLuminousEfficiency
                               :quantitykind/Irradiance],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Photometry"},
   :skos/broader     :discipline/Optics})

(def PhysicalConstant
  {:db/ident :discipline/PhysicalConstant,
   :qudt/relevantQuantityKind [:quantitykind/FineStructureConstant
                               :quantitykind/MagneticConstant
                               :quantitykind/ElectronGyromagneticRatio
                               :quantitykind/DegreeOfDissociation
                               :quantitykind/SpeedOfLight
                               :quantitykind/BohrRadius
                               :quantitykind/ReducedPlanckConstant
                               :quantitykind/AtomicMassConstant
                               :quantitykind/MagneticFluxQuantum
                               :quantitykind/BoltzmannConstant
                               :quantitykind/MolarGasConstant
                               :quantitykind/PlanckConstant
                               :quantitykind/PermeabilityOfVacuum
                               :quantitykind/ComptonWavelength
                               :quantitykind/IonicStrength
                               :quantitykind/RydbergConstant
                               :quantitykind/FaradayConstant
                               :quantitykind/BohrMagneton
                               :quantitykind/NuclearMagneton
                               :quantitykind/HartreeEnergy
                               :quantitykind/GyromagneticRatio
                               :quantitykind/AvogadroConstant
                               :quantitykind/JosephsonConstant]})

(def PhysicalScience
  "PhysicalScience"
  {:db/ident         :discipline/PhysicalScience,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "PhysicalScience"}
                      {:rdf/language "en",
                       :rdf/value    "Physical Scence"}],
   :skos/broader     :discipline/Science})

(def Physics
  "Physics"
  {:db/ident         :discipline/Physics,
   :qudt/relevantQuantityKind [:quantitykind/Temperature
                               :quantitykind/LengthEnergy
                               :quantitykind/Density
                               :quantitykind/ForcePerArea
                               :quantitykind/LengthMass
                               :quantitykind/SpecificThrust],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Physics"},
   :skos/broader     [:discipline/Science :discipline/PhysicalScience]})

(def PlasmaDynamics
  "PlasmaDynamics"
  {:db/ident         :discipline/PlasmaDynamics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "PlasmaDynamics"}
                      {:rdf/language "en",
                       :rdf/value    "Plasma dynamics"}],
   :skos/broader     [:discipline/SpaceSystemEngineering
                      :discipline/PlasmaPhysics]})

(def PlasmaPhysics
  "PlasmaPhysics"
  {:db/ident         :discipline/PlasmaPhysics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "PlasmaPhysics"},
   :skos/broader     :discipline/Physics})

(def PressurizedSystems
  "PressurizedSystems"
  {:db/ident         :discipline/PressurizedSystems,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "PressurizedSystems"}
                      {:rdf/language "en",
                       :rdf/value    "Pressurized systems"}],
   :skos/broader     :discipline/SystemEngineering})

(def Propulsion
  "Propulsion"
  {:db/ident         :discipline/Propulsion,
   :qudt/relevantQuantityKind
   [:quantitykind/NozzleThroatPressure
    :quantitykind/PropellantBurnRate
    :quantitykind/NozzleThroatCrossSectionalArea
    :quantitykind/ResonanceEscapeProbabilityForFission
    :quantitykind/EccentricityOfOrbit
    :quantitykind/IonDensity
    :quantitykind/LiftForce
    :quantitykind/WebTime
    :quantitykind/NeutronDiffusionLength
    :quantitykind/LiftCoefficient
    :quantitykind/FastFissionFactor
    :quantitykind/OrbitalRadialDistance
    :quantitykind/ClosestApproachRadius
    :quantitykind/ExitPlaneTemperature
    :quantitykind/OrbitalAngularMomentumPerUnitMass
    :quantitykind/BurnRate
    :quantitykind/DensityOfTheExhaustGases
    :quantitykind/MachNumber
    :quantitykind/BucklingFactor
    :quantitykind/PressureBurningRateIndex
    :quantitykind/ThermalUtilizationFactorForFission
    :quantitykind/AngularDistance
    :quantitykind/RocketAtmosphericTransverseForce
    :quantitykind/VerticalVelocity
    :quantitykind/AverageSpecificImpulse
    :quantitykind/VehicleVelocity
    :quantitykind/GravitationalConstant
    :quantitykind/TrueExhaustVelocity
    :quantitykind/ThrusterPowerToThrustEfficiency
    :quantitykind/MaxSeaLevelThrust
    :quantitykind/DistanceTraveledDuringBurn
    :quantitykind/ExpansionRatio
    :quantitykind/IonicCharge
    :quantitykind/UniversalGasConstant
    :quantitykind/PressureBurningRateConstant
    :quantitykind/MaxExpectedOperatingThrust
    :quantitykind/EllipticalOrbitPerigeeVelocity
    :quantitykind/InitialExpansionRatio
    :quantitykind/BevelGearPitchAngle
    :quantitykind/ElectricPower
    :quantitykind/HeadEndPressure
    :quantitykind/ElectricalPowerToMassRatio
    :quantitykind/AverageVacuumThrust
    :quantitykind/DragCoefficient
    :quantitykind/ExhaustGasesSpecificHeat
    :quantitykind/FissionMultiplicationFactor
    :quantitykind/ApogeeRadius
    :quantitykind/SpecificImpulse
    :quantitykind/ExitPlanePressure
    :quantitykind/FlightPathAngle
    :quantitykind/MaxOperatingThrust
    :quantitykind/AngleOfAttack
    :quantitykind/NozzleThroatDiameter
    :quantitykind/StructuralEfficiency
    :quantitykind/PayloadRatio
    :quantitykind/BurnTime
    :quantitykind/VacuumThrust
    :quantitykind/DensityInCombustionChamber
    :quantitykind/ExitPlaneCrossSectionalArea
    :quantitykind/EffectiveExhaustVelocity
    :quantitykind/ExhaustStreamPower
    :quantitykind/FissionCoreRadiusToHeightRatio
    :quantitykind/ThrustCoefficient
    :quantitykind/InitialNozzleThroatDiameter
    :quantitykind/ActionTime
    :quantitykind/AverageHeadEndPressure
    :quantitykind/WebTimeAveragePressure
    :quantitykind/CrossSectionalArea
    :quantitykind/MaximumOperatingPressure
    :quantitykind/HorizontalVelocity
    :quantitykind/WebTimeAverageThrust
    :quantitykind/IgnitionIntervalTime
    :quantitykind/DragForce
    :quantitykind/SpecificHeatsRatio
    :quantitykind/IonCurrent
    :quantitykind/EarthClosestApproachVehicleVelocity
    :quantitykind/CombustionChamberTemperature
    :quantitykind/DynamicPressure
    :quantitykind/AmbientPressure
    :quantitykind/NozzleWallsThrustReaction
    :quantitykind/FissionFuelUtilizationFactor
    :quantitykind/CharacteristicVelocity
    :quantitykind/EllipticalOrbitApogeeVelocity
    :quantitykind/MassOfTheEarth
    :quantitykind/PropellantTemperature
    :quantitykind/ThrustToWeightRatio
    :quantitykind/ExhaustGasMeanMolecularWeight
    :quantitykind/InitialVelocity
    :quantitykind/PropellantMeanBulkTemperature
    :quantitykind/MaximumExpectedOperatingPressure
    :quantitykind/PermittivityOfFreeSpace
    :quantitykind/OverRangeDistance],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Propulsion"},
   :skos/broader     :discipline/SpaceSystemEngineering})

(def PropulsionSystemsDesign
  "Propulsion systems design"
  {:db/ident         :discipline/PropulsionSystemsDesign,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Propulsion systems design"},
   :skos/broader     :discipline/SpaceSystemEngineering})

(def QuantityValue
  {:db/ident :discipline/QuantityValue,
   :qudt/relevantQuantityKind :quantitykind/CV_C_0})

(def QuantumMechanics
  "QuantumMechanics"
  {:db/ident         :discipline/QuantumMechanics,
   :qudt/relevantQuantityKind :quantitykind/Action,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "QuantumMechanics"},
   :skos/broader     :discipline/Mechanics})

(def Radiation
  "Radiation"
  {:db/ident         :discipline/Radiation,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Radiation"},
   :skos/broader     :discipline/Physics})

(def Radiology
  "Radiology"
  {:db/ident         :discipline/Radiology,
   :qudt/relevantQuantityKind [:quantitykind/Exposure
                               :quantitykind/DoseEquivalent
                               :quantitykind/AbsorbedDoseRate
                               :quantitykind/AbsorbedDose],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Radiology"},
   :skos/broader     :discipline/Physics})

(def Radiometry
  "Radiometry"
  {:db/ident         :discipline/Radiometry,
   :qudt/relevantQuantityKind [:quantitykind/VisibleRadiantEnergy
                               :quantitykind/RadianceFactor
                               :quantitykind/Irradiance
                               :quantitykind/Emissivity
                               :quantitykind/EinsteinTransitionProbability
                               :quantitykind/Radiance
                               :quantitykind/LinearAbsorptionCoefficient
                               :quantitykind/RadiantEnergy
                               :quantitykind/RadiantFluenceRate
                               :quantitykind/RadiantFlux
                               :quantitykind/Absorptance
                               :quantitykind/RadiantFluence
                               :quantitykind/Refectance
                               :quantitykind/MassAttenuationCoefficient
                               :quantitykind/RadiantExposure
                               :quantitykind/SpectralLuminousEfficiency
                               :quantitykind/RadiantIntensity
                               :quantitykind/MassAbsorptionCoefficient
                               :quantitykind/RadiantEmmitance
                               :quantitykind/LinearAttenuationCoefficient
                               :quantitykind/ReflectanceFactor
                               :quantitykind/Transmittance
                               :quantitykind/Radiosity
                               :quantitykind/MolarAbsorptionCoefficient
                               :quantitykind/NapierianAbsorbance
                               :quantitykind/TransmittanceDensity
                               :quantitykind/RadiantEnergyDensity],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Radiometry"},
   :skos/broader     :discipline/Optics})

(def RequirementsEngineering
  "RequirementsEngineering"
  {:db/ident         :discipline/RequirementsEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "RequirementsEngineering"}
                      {:rdf/language "en",
                       :rdf/value    "Requirements engineering"}],
   :skos/broader     :discipline/SystemEngineering})

(def RiskManagement
  "RiskManagement"
  {:db/ident         :discipline/RiskManagement,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "RiskManagement"}
                      {:rdf/language "en",
                       :rdf/value    "Risk Management"}],
   :skos/broader     :discipline/Management})

(def Science
  "Science"
  {:db/ident         :discipline/Science,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Science"},
   :skos/broader     [:discipline/Any "http://qudt.org/vocab/discipline/"]})

(def SocialScience
  "SocialScience"
  {:db/ident         :discipline/SocialScience,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "SocialScience"},
   :skos/broader     :discipline/Science})

(def SoftwareEngineering
  "SoftwareEngineering"
  {:db/ident         :discipline/SoftwareEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "SoftwareEngineering"}
                      {:rdf/language "en",
                       :rdf/value    "Software engineering"}],
   :skos/broader     [:discipline/Engineering :discipline/ComputerScience]})

(def SolidStatePhysics
  "SolidStatePhysics"
  {:db/ident         :discipline/SolidStatePhysics,
   :qudt/relevantQuantityKind
   [:quantitykind/MobilityRatio
    :quantitykind/HoleDensity
    :quantitykind/DonorIonizationEnergy
    :quantitykind/DebyeAngularWavenumber
    :quantitykind/Long-RangeOrderParameter
    :quantitykind/DisplacementVectorOfIon
    :quantitykind/RelaxationTIme
    :quantitykind/LatticeVector
    :quantitykind/ElectronDensity
    :quantitykind/FermiEnergy
    :quantitykind/GapEnergy
    :quantitykind/FermiAngularWavenumber
    :quantitykind/ExchangeIntegral
    :quantitykind/AngularReciprocalLatticeVector
    :quantitykind/StructureFactor
    :quantitykind/UpperCriticalMagneticFluxDensity
    :quantitykind/SourceVoltageBetweenSubstances
    :quantitykind/GruneisenParameter
    :quantitykind/EffectiveMass
    :quantitykind/ElectronAffinity
    :quantitykind/EnergyDensityOfStates
    :quantitykind/LorenzCoefficient
    :quantitykind/CurieTemperature
    :quantitykind/SuperconductionTransitionTemperature
    :quantitykind/WorkFunction
    :quantitykind/SolidStateDiffusionLength
    :quantitykind/AcceptorIonizationEnergy
    :quantitykind/PeltierCoefficient
    :quantitykind/Debye-WallerFactor
    :quantitykind/LowerCriticalMagneticFluxDensity
    :quantitykind/LondonPenetrationDepth
    :quantitykind/FermiTemperature
    :quantitykind/OrderOfReflection
    :quantitykind/BraggAngle
    :quantitykind/RichardsonConstant
    :quantitykind/CarrierLifetime
    :quantitykind/CoherenceLength
    :quantitykind/PhononMeanFreePath
    :quantitykind/SuperconductorEnergyGap
    :quantitykind/BurgersVector
    :quantitykind/ElectronMeanFreePath
    :quantitykind/DebyeAngularFrequency
    :quantitykind/EquilibriumPositionVectorOfIon
    :quantitykind/MadelungConstant
    :quantitykind/DonorDensity
    :quantitykind/AtomScatteringFactor
    :quantitykind/DebyeTemperature
    :quantitykind/FundamentalReciprocalLatticeVector
    :quantitykind/IntinsicCarrierDensity
    :quantitykind/ResidualResistivity
    :quantitykind/IonizationEnergy
    :quantitykind/ThermodynamicCriticalMagneticFluxDensity
    :quantitykind/Landau-GinzburgNumber
    :quantitykind/ThomsonCoefficient
    :quantitykind/NeelTemperature
    :quantitykind/EnergyLevel
    :quantitykind/DensityOfStates
    :quantitykind/AcceptorDensity
    :quantitykind/JosephsonConstant
    :quantitykind/ParticlePositionVector
    :quantitykind/HallCoefficient
    :quantitykind/SeebeckCoefficient
    :quantitykind/MagneticFluxQuantum
    :quantitykind/Short-RangeOrderParameter
    :quantitykind/LatticePlaneSpacing
    :quantitykind/FundamentalLatticeVector
    :quantitykind/AngularWavenumber],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "SolidStatePhysics"},
   :skos/broader     :discipline/Physics})

(def SpaceAndTime
  "SpaceAndTime"
  {:db/ident         :discipline/SpaceAndTime,
   :qudt/relevantQuantityKind [:quantitykind/RadiusOfCurvature
                               :quantitykind/CrossSectionalArea
                               :quantitykind/VolumePerUnitTime
                               :quantitykind/Frequency
                               :quantitykind/Length
                               :quantitykind/Speed
                               :quantitykind/Thickness
                               :quantitykind/InverseVolume
                               :quantitykind/Radius
                               :quantitykind/DryVolume
                               :quantitykind/AreaAngle
                               :quantitykind/StochasticProcess
                               :quantitykind/Altitude
                               :quantitykind/Breadth
                               :quantitykind/NumberDensity
                               :quantitykind/Distance
                               :quantitykind/PositionVector
                               :quantitykind/RadialDistance
                               :quantitykind/Angle
                               :quantitykind/PathLength
                               :quantitykind/Time
                               :quantitykind/AngularFrequency
                               :quantitykind/MachNumber
                               :quantitykind/AngularVelocity
                               :quantitykind/Volume
                               :quantitykind/SolidAngle
                               :quantitykind/PlaneAngle
                               :quantitykind/Acceleration
                               :quantitykind/TimeSquared
                               :quantitykind/LinearAcceleration
                               :quantitykind/Diameter
                               :quantitykind/LinearVelocity
                               :quantitykind/AngularAcceleration
                               :quantitykind/CurvatureFromRadius
                               :quantitykind/AreaPerTime
                               :quantitykind/Velocity
                               :quantitykind/LiquidVolume
                               :quantitykind/InverseLength
                               :quantitykind/AccelerationOfGravity
                               :quantitykind/CartesianVolume
                               :quantitykind/Height
                               :quantitykind/Curvature
                               :quantitykind/CartesianCoordinates
                               :quantitykind/AreaTime
                               :quantitykind/Displacement
                               :quantitykind/CartesianArea
                               :quantitykind/Area],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "SpaceAndTime"},
   :skos/broader     :discipline/Physics})

(def SpaceSystemEngineering
  "SpaceSystemEngineering"
  {:db/ident         :discipline/SpaceSystemEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "SpaceSystemEngineering"}
                      {:rdf/language "en",
                       :rdf/value    "Space System Engineering"}],
   :skos/broader     [:discipline/SystemEngineering
                      :discipline/PhysicalScience
                      :discipline/Engineering]})

(def Spectroscopy
  "Spectroscopy"
  {:db/ident         :discipline/Spectroscopy,
   :qudt/relevantQuantityKind :quantitykind/AngularWavenumber,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Spectroscopy"},
   :skos/broader     [:discipline/Physics :discipline/Light]})

(def StatisticalMechanics
  "StatisticalMechanics"
  {:db/ident         :discipline/StatisticalMechanics,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "StatisticalMechanics"},
   :skos/broader     :discipline/Mechanics})

(def Structures
  "Structures"
  {:db/ident         :discipline/Structures,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Structures"},
   :skos/broader     :discipline/StructuresAndMechanics})

(def StructuresAndMechanics
  "Determination of initial mass probabilities, centroids, moments of inertia, etc."
  {:db/ident :discipline/StructuresAndMechanics,
   :dcterms/description
   "Determination of initial mass probabilities, centroids, moments of inertia, etc.",
   :rdf/type :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "StructuresAndMechanics"}
                {:rdf/language "en",
                 :rdf/value    "Structures and Mechanics"}],
   :skos/broader :discipline/SpaceSystemEngineering})

(def SystemDesign
  "SystemDesign"
  {:db/ident         :discipline/SystemDesign,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "SystemDesign"}
                      {:rdf/language "en",
                       :rdf/value    "System design"}],
   :skos/broader     :discipline/SystemEngineering})

(def SystemEngineering
  "SystemEngineering"
  {:db/ident         :discipline/SystemEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "SystemEngineering"}
                      {:rdf/language "en",
                       :rdf/value    "System Engineering"}],
   :skos/broader     [:discipline/Systems :discipline/Engineering]})

(def SystemIntegration
  "SystemIntegration"
  {:db/ident         :discipline/SystemIntegration,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "SystemIntegration"}
                      {:rdf/language "en",
                       :rdf/value    "System Integration"}],
   :skos/broader     :discipline/SystemEngineering})

(def SystemTesting
  "SystemTesting"
  {:db/ident         :discipline/SystemTesting,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "SystemTesting"}
                      {:rdf/language "en",
                       :rdf/value    "System testing"}],
   :skos/broader     :discipline/SystemEngineering})

(def Systems
  "Systems"
  {:db/ident         :discipline/Systems,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Systems"},
   :skos/broader     :discipline/Any})

(def Telebiometrics
  "Telebiometrics"
  {:db/ident         :discipline/Telebiometrics,
   :qudt/relevantQuantityKind
   [:quantitykind/RadiusOfCurvature
    :quantitykind/CurvatureFromRadius
    :quantitykind/ConvectiveHeatTransfer
    :quantitykind/EvaporativeHeatTransfer
    :quantitykind/PositionVector
    :quantitykind/VisionThreshods
    :quantitykind/Displacement
    :quantitykind/AuditoryThresholds
    :quantitykind/RadiativeHeatTransfer
    :quantitykind/SoundPressure
    :quantitykind/WarmReceptorThreshold
    :quantitykind/Radius
    :quantitykind/CartesianCoordinates
    :quantitykind/ActivityThresholds
    :quantitykind/SoundPower
    :quantitykind/RadialDistance
    :quantitykind/CartesianVolume
    :quantitykind/Adaptation
    :quantitykind/ColdReceptorThreshold
    :quantitykind/Diameter
    :quantitykind/PathLength
    :quantitykind/CombinedNonEvaporativeHeatTransferCoefficient
    :quantitykind/Distance
    :quantitykind/PhotoThresholdOfAwarenessFunction
    :quantitykind/TouchThresholds
    :quantitykind/GustatoryThreshold
    :quantitykind/Thickness
    :quantitykind/ConductiveHeatTransferRate
    :quantitykind/Height
    :quantitykind/TemporalSummationFunction
    :quantitykind/AcousticImpedance
    :quantitykind/SpatialSummationFunction
    :quantitykind/EvaporativeHeatTransferCoefficient
    :quantitykind/ConductionSpeed
    :quantitykind/Breadth
    :quantitykind/OlfactoryThreshold
    :quantitykind/MassicActivity
    :quantitykind/LuminousEmmitance
    :quantitykind/CartesianArea],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Telebiometrics"},
   :skos/broader     :discipline/ComputerScience})

(def Telemetry
  "Telemetry"
  {:db/ident         :discipline/Telemetry,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Telemetry"},
   :skos/broader     :discipline/SpaceSystemEngineering})

(def ThermalControl
  "ThermalControl"
  {:db/ident         :discipline/ThermalControl,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "ThermalControl"}
                      {:rdf/language "en",
                       :rdf/value    "Thermal control"}],
   :skos/broader     :discipline/SpaceSystemEngineering})

(def ThermalEngineering
  "ThermalEngineering"
  {:db/ident         :discipline/ThermalEngineering,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "ThermalEngineering"},
   :skos/broader     :discipline/Engineering})

(def ThermalProtection
  "ThermalProtection"
  {:db/ident         :discipline/ThermalProtection,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "ThermalProtection"}
                      {:rdf/language "en",
                       :rdf/value    "Thermal protection"}],
   :skos/broader     :discipline/SpaceSystemEngineering})

(def Thermodynamics
  "Thermodynamics"
  {:db/ident         :discipline/Thermodynamics,
   :qudt/relevantQuantityKind
   [:quantitykind/EnergyPerTemperature
    :quantitykind/CubicExpansionCoefficient
    :quantitykind/MassRatioOfWaterToDryMatter
    :quantitykind/ThermodynamicEnergy
    :quantitykind/MolarHeatCapacity
    :quantitykind/RelativeHumidity
    :quantitykind/CelsiusTemperature
    :quantitykind/PlanckFunction
    :quantitykind/Energy
    :quantitykind/Enthalpy
    :quantitykind/ThermodynamicTemperature
    :quantitykind/MassieuFunction
    :quantitykind/SpecificInternalEnergy
    :quantitykind/CompressibilityFactor
    :quantitykind/Entropy
    :quantitykind/MassConcentrationOfWaterVapour
    :quantitykind/HeatFlowRate
    :quantitykind/IsentropicExponent
    :quantitykind/LengthTemperatureTime
    :quantitykind/RelativePartialPressure
    :quantitykind/ThermalConductance
    :quantitykind/Heat
    :quantitykind/SpecificEnthalpy
    :quantitykind/PressureCoefficient
    :quantitykind/ThermodynamicEntropy
    :quantitykind/SpecificEntropy
    :quantitykind/ThermalInsulance
    :quantitykind/TemperaturePerTime
    :quantitykind/SpecificGibbsEnergy
    :quantitykind/AreaTemperature
    :quantitykind/InverseLengthTemperature
    :quantitykind/ThermalDiffusivity
    :quantitykind/RelativeMassRatioOfVapour
    :quantitykind/SpecificHelmholtzEnergy
    :quantitykind/LengthTemperature
    :quantitykind/MassFractionOfWater
    :quantitykind/PowerPerAreaQuarticTemperature
    :quantitykind/MassRatioOfWaterVapourToDryGas
    :quantitykind/RelativePressureCoefficient
    :quantitykind/ThermalEnergy
    :quantitykind/HeatCapacity
    :quantitykind/SpecificHeatCapacity
    :quantitykind/CoefficientOfHeatTransfer
    :quantitykind/InternalEnergy
    :quantitykind/SpecificEnergy
    :quantitykind/ThermalResistivity
    :quantitykind/RatioOfSpecificHeatCapacities
    :quantitykind/VolumetricHeatCapacity
    :quantitykind/AreaTimeTemperature
    :quantitykind/SpecificHeatCapacityAtConstantVolume
    :quantitykind/ThermalEfficiency
    :quantitykind/RelativeMassConcentrationOfVapour
    :quantitykind/TemperaturePerMagneticFluxDensity
    :quantitykind/SpecificHeatCapacityAtConstantPressure
    :quantitykind/HeatCapacityRatio
    :quantitykind/TimeTemperature
    :quantitykind/ThermalEnergyLength
    :quantitykind/ThermalConductivity
    :quantitykind/GibbsEnergy
    :quantitykind/AreaThermalExpansion
    :quantitykind/HelmholtzEnergy
    :quantitykind/HeatFlowRatePerUnitArea
    :quantitykind/SpecificHeatPressure
    :quantitykind/SpecificHeatVolume
    :quantitykind/SpecificHeatCapacityAtSaturation
    :quantitykind/IsentropicCompressibility
    :quantitykind/InverseTimeTemperature
    :quantitykind/VolumeThermalExpansion
    :quantitykind/MassFractionOfDryMatter
    :quantitykind/LinearExpansionCoefficient
    :quantitykind/LinearThermalExpansion
    :quantitykind/DewPointTemperature
    :quantitykind/MassTemperature
    :quantitykind/SurfaceCoefficientOfHeatTransfer
    :quantitykind/AreicHeatFlowRate
    :quantitykind/ThermalResistance
    :quantitykind/MassConcentrationOfWater
    :quantitykind/IsothermalCompressibility
    :quantitykind/AbsoluteHumidity],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Thermodynamics"},
   :skos/broader     :discipline/Mechanics})

(def TradeStudies
  "TradeStudies"
  {:db/ident         :discipline/TradeStudies,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "TradeStudies"}
                      {:rdf/language "en",
                       :rdf/value    "Trade studies"}],
   :skos/broader     :discipline/Management})

(def Trajectory
  "Trajectory"
  {:db/ident         :discipline/Trajectory,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Trajectory"},
   :skos/broader     :discipline/SpaceSystemEngineering})

(def TrajectoryAnalysis
  "Planet-centric and Heliocentric trajectory analysis"
  {:db/ident            :discipline/TrajectoryAnalysis,
   :dcterms/description "Planet-centric and Heliocentric trajectory analysis",
   :rdf/type            :qudt/Discipline,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Trajectory analysis"},
   :skos/broader        :discipline/TrajectoryAnalysisAndDesign})

(def TrajectoryAnalysisAndDesign
  "TrajectoryAnalysisAndDesign"
  {:db/ident         :discipline/TrajectoryAnalysisAndDesign,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "TrajectoryAnalysisAndDesign"}
                      {:rdf/language "en",
                       :rdf/value    "Trajectory analysis and design"}],
   :skos/broader     :discipline/SpaceSystemEngineering})

(def TrajectoryDesign
  "Trajectory design"
  {:db/ident         :discipline/TrajectoryDesign,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Trajectory design"},
   :skos/broader     :discipline/TrajectoryAnalysisAndDesign})

(def VehicleSystemsDesign
  "Vehicle systems design"
  {:db/ident         :discipline/VehicleSystemsDesign,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Vehicle systems design"},
   :skos/broader     [:discipline/SystemDesign
                      :discipline/SpaceSystemEngineering]})

(def Vibration
  "Vibration"
  {:db/ident         :discipline/Vibration,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Vibration"},
   :skos/broader     :discipline/Mechanics})

(def VibrationAnalysis
  "Vibration analysis"
  {:db/ident         :discipline/VibrationAnalysis,
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Vibration analysis"},
   :skos/broader     :discipline/StructuresAndMechanics})
