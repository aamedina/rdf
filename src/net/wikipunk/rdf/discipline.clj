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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/Dissipance"
    "http://qudt.org/vocab/quantitykind/Density"
    "http://qudt.org/vocab/quantitykind/Reflectance"
    "http://qudt.org/vocab/quantitykind/AngularWavenumber"
    "http://qudt.org/vocab/quantitykind/SoundIntensity"
    "http://qudt.org/vocab/quantitykind/CharacteristicAcousticImpedance"
    "http://qudt.org/vocab/quantitykind/EquivalentAbsorptionArea"
    "http://qudt.org/vocab/quantitykind/SoundEnergyDensity"
    "http://qudt.org/vocab/quantitykind/SoundParticleAcceleration"
    "http://qudt.org/vocab/quantitykind/Absorptance"
    "http://qudt.org/vocab/quantitykind/Period"
    "http://qudt.org/vocab/quantitykind/SoundParticleDisplacement"
    "http://qudt.org/vocab/quantitykind/SoundPower"
    "http://qudt.org/vocab/quantitykind/AcousticImpedance"
    "http://qudt.org/vocab/quantitykind/SoundPowerLevel"
    "http://qudt.org/vocab/quantitykind/PhaseSpeedOfSound"
    "http://qudt.org/vocab/quantitykind/SpeedOfSound"
    "http://qudt.org/vocab/quantitykind/LogarithmicFrequencyInterval"
    "http://qudt.org/vocab/quantitykind/TimeAveragedSoundIntensity"
    "http://qudt.org/vocab/quantitykind/Frequency"
    "http://qudt.org/vocab/quantitykind/PhaseCoefficient"
    "http://qudt.org/vocab/quantitykind/SoundParticleVelocity"
    "http://qudt.org/vocab/quantitykind/SoundPressureLevel"
    "http://qudt.org/vocab/quantitykind/Wavelength"
    "http://qudt.org/vocab/quantitykind/SoundReductionIndex"
    "http://qudt.org/vocab/quantitykind/SoundPressure"
    "http://qudt.org/vocab/quantitykind/MechanicalSurfaceImpedance"
    "http://qudt.org/vocab/quantitykind/Transmittance"
    "http://qudt.org/vocab/quantitykind/SoundExposure"
    "http://qudt.org/vocab/quantitykind/Wavenumber"
    "http://qudt.org/vocab/quantitykind/PropagationCoefficient"
    "http://qudt.org/vocab/quantitykind/ReverberationTime"
    "http://qudt.org/vocab/quantitykind/GroupSpeedOfSound"
    "http://qudt.org/vocab/quantitykind/AttenuationCoefficient"
    "http://qudt.org/vocab/quantitykind/SoundVolumeVelocity"
    "http://qudt.org/vocab/quantitykind/SoundExposureLevel"
    "http://qudt.org/vocab/quantitykind/StaticPressure"
    "http://qudt.org/vocab/quantitykind/AngularFrequency"],
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
   :qudt/relevantQuantityKind
   "http://qudt.org/vocab/quantitykind/AtmosphericPressure",
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
   ["http://qudt.org/vocab/quantitykind/ElementaryCharge"
    "http://qudt.org/vocab/quantitykind/ExposureRate"
    "http://qudt.org/vocab/quantitykind/ReactorTimeConstant"
    "http://qudt.org/vocab/quantitykind/MaximumBeta-ParticleEnergy"
    "http://qudt.org/vocab/quantitykind/ParticleFluence"
    "http://qudt.org/vocab/quantitykind/AtomicMass"
    "http://qudt.org/vocab/quantitykind/EnergyImparted"
    "http://qudt.org/vocab/quantitykind/AbsorbedDoseRate"
    "http://qudt.org/vocab/quantitykind/GyromagneticRatio"
    "http://qudt.org/vocab/quantitykind/MeanEnergyImparted"
    "http://qudt.org/vocab/quantitykind/LarmorAngularFrequency"
    "http://qudt.org/vocab/quantitykind/DecayConstant"
    "http://qudt.org/vocab/quantitykind/TotalAngularMomentumQuantumNumber"
    "http://qudt.org/vocab/quantitykind/ParticleFluenceRate"
    "http://qudt.org/vocab/quantitykind/RecombinationCoefficient"
    "http://qudt.org/vocab/quantitykind/CyclotronAngularFrequency"
    "http://qudt.org/vocab/quantitykind/BohrRadius"
    "http://qudt.org/vocab/quantitykind/MassExcess"
    "http://qudt.org/vocab/quantitykind/ParticleSourceDensity"
    "http://qudt.org/vocab/quantitykind/LinearIonization"
    "http://qudt.org/vocab/quantitykind/Slowing-DownArea"
    "http://qudt.org/vocab/quantitykind/DoseEquivalentQualityFactor"
    "http://qudt.org/vocab/quantitykind/Slowing-DownLength"
    "http://qudt.org/vocab/quantitykind/MassNumber"
    "http://qudt.org/vocab/quantitykind/OrbitalAngularMomentumQuantumNumber"
    "http://qudt.org/vocab/quantitykind/LandeGFactor"
    "http://qudt.org/vocab/quantitykind/Kerma"
    "http://qudt.org/vocab/quantitykind/EnergyFluenceRate"
    "http://qudt.org/vocab/quantitykind/ThermalUtilizationFactor"
    "http://qudt.org/vocab/quantitykind/MeanMassRange"
    "http://qudt.org/vocab/quantitykind/AbsorbedDose"
    "http://qudt.org/vocab/quantitykind/MacroscopicCrossSection"
    "http://qudt.org/vocab/quantitykind/MeanLinearRange"
    "http://qudt.org/vocab/quantitykind/EnergyFluence"
    "http://qudt.org/vocab/quantitykind/MeanLifetime"
    "http://qudt.org/vocab/quantitykind/RestEnergy"
    "http://qudt.org/vocab/quantitykind/NuclearRadius"
    "http://qudt.org/vocab/quantitykind/HyperfineStructureQuantumNumber"
    "http://qudt.org/vocab/quantitykind/NeutronNumber"
    "http://qudt.org/vocab/quantitykind/ResonanceEscapeProbability"
    "http://qudt.org/vocab/quantitykind/LinearAttenuationCoefficient"
    "http://qudt.org/vocab/quantitykind/NuclearMagneton"
    "http://qudt.org/vocab/quantitykind/Half-ValueThickness"
    "http://qudt.org/vocab/quantitykind/TotalIonization"
    "http://qudt.org/vocab/quantitykind/InternalConversionFactor"
    "http://qudt.org/vocab/quantitykind/RadiantEnergy"
    "http://qudt.org/vocab/quantitykind/MultiplicationFactor"
    "http://qudt.org/vocab/quantitykind/SpectralCrossSection"
    "http://qudt.org/vocab/quantitykind/NeutronYieldPerAbsorption"
    "http://qudt.org/vocab/quantitykind/NucleonNumber"
    "http://qudt.org/vocab/quantitykind/GFactorOfNucleus"
    "http://qudt.org/vocab/quantitykind/SpinQuantumNumber"
    "http://qudt.org/vocab/quantitykind/SpecificActivity"
    "http://qudt.org/vocab/quantitykind/RelativeMassExcess"
    "http://qudt.org/vocab/quantitykind/ResonanceEnergy"
    "http://qudt.org/vocab/quantitykind/RydbergConstant"
    "http://qudt.org/vocab/quantitykind/EffectiveMultiplicationFactor"
    "http://qudt.org/vocab/quantitykind/ParticleCurrent"
    "http://qudt.org/vocab/quantitykind/MeanFreePath"
    "http://qudt.org/vocab/quantitykind/InfiniteMultiplicationFactor"
    "http://qudt.org/vocab/quantitykind/TotalCrossSection"
    "http://qudt.org/vocab/quantitykind/Spin"
    "http://qudt.org/vocab/quantitykind/NeutronDiffusionCoefficient"
    "http://qudt.org/vocab/quantitykind/ElectronGyromagneticRatio"
    "http://qudt.org/vocab/quantitykind/MassEnergyTransferCoefficient"
    "http://qudt.org/vocab/quantitykind/Exposure"
    "http://qudt.org/vocab/quantitykind/DiffusionLength"
    "http://qudt.org/vocab/quantitykind/LinearEnergyTransfer"
    "http://qudt.org/vocab/quantitykind/NuclearSpinQuantumNumber"
    "http://qudt.org/vocab/quantitykind/MassDefect"
    "http://qudt.org/vocab/quantitykind/MacroscopicTotalCrossSection"
    "http://qudt.org/vocab/quantitykind/RelativeMassDefect"
    "http://qudt.org/vocab/quantitykind/FineStructureConstant"
    "http://qudt.org/vocab/quantitykind/DiffusionCoefficientForFluenceRate"
    "http://qudt.org/vocab/quantitykind/HartreeEnergy"
    "http://qudt.org/vocab/quantitykind/SpectralAngularCrossSection"
    "http://qudt.org/vocab/quantitykind/Reactivity"
    "http://qudt.org/vocab/quantitykind/Half-Life"
    "http://qudt.org/vocab/quantitykind/BetaDisintegrationEnergy"
    "http://qudt.org/vocab/quantitykind/Activity"
    "http://qudt.org/vocab/quantitykind/DoseEquivalent"
    "http://qudt.org/vocab/quantitykind/AtomicMassConstant"
    "http://qudt.org/vocab/quantitykind/BohrMagneton"
    "http://qudt.org/vocab/quantitykind/PlanckConstant"
    "http://qudt.org/vocab/quantitykind/MagneticQuantumNumber"
    "http://qudt.org/vocab/quantitykind/PrincipalQuantumNumber"
    "http://qudt.org/vocab/quantitykind/FastFissionFactor"
    "http://qudt.org/vocab/quantitykind/TotalLinearStoppingPower"
    "http://qudt.org/vocab/quantitykind/MigrationLength"
    "http://qudt.org/vocab/quantitykind/AverageLogarithmicEnergyDecrement"
    "http://qudt.org/vocab/quantitykind/AverageEnergyLossPerElementaryChargeProduced"
    "http://qudt.org/vocab/quantitykind/ChargeNumber"
    "http://qudt.org/vocab/quantitykind/LevelWidth"
    "http://qudt.org/vocab/quantitykind/TotalAngularMomentum"
    "http://qudt.org/vocab/quantitykind/ReducedPlanckConstant"
    "http://qudt.org/vocab/quantitykind/KermaRate"
    "http://qudt.org/vocab/quantitykind/NuclearQuadrupoleMoment"
    "http://qudt.org/vocab/quantitykind/MolarAttenuationCoefficient"
    "http://qudt.org/vocab/quantitykind/AtomicCharge"
    "http://qudt.org/vocab/quantitykind/Lethargy"
    "http://qudt.org/vocab/quantitykind/Slowing-DownDensity"
    "http://qudt.org/vocab/quantitykind/MassAttenuationCoefficient"
    "http://qudt.org/vocab/quantitykind/TotalAtomicStoppingPower"
    "http://qudt.org/vocab/quantitykind/RestMass"
    "http://qudt.org/vocab/quantitykind/ComptonWavelength"
    "http://qudt.org/vocab/quantitykind/ActivityConcentration"
    "http://qudt.org/vocab/quantitykind/CrossSection"
    "http://qudt.org/vocab/quantitykind/AlphaDisintegrationEnergy"
    "http://qudt.org/vocab/quantitykind/DiffusionArea"
    "http://qudt.org/vocab/quantitykind/TotalMassStoppingPower"
    "http://qudt.org/vocab/quantitykind/AngularCrossSection"
    "http://qudt.org/vocab/quantitykind/AtomicNumber"
    "http://qudt.org/vocab/quantitykind/ReactionEnergy"
    "http://qudt.org/vocab/quantitykind/SpecificEnergyImparted"
    "http://qudt.org/vocab/quantitykind/SurfaceActivityDensity"
    "http://qudt.org/vocab/quantitykind/ParticleNumberDensity"
    "http://qudt.org/vocab/quantitykind/IonDensity"
    "http://qudt.org/vocab/quantitykind/ElectronRadius"
    "http://qudt.org/vocab/quantitykind/QuantumNumber"
    "http://qudt.org/vocab/quantitykind/Mobility"
    "http://qudt.org/vocab/quantitykind/Non-LeakageProbability"
    "http://qudt.org/vocab/quantitykind/NeutronYieldPerFission"
    "http://qudt.org/vocab/quantitykind/BindingFraction"
    "http://qudt.org/vocab/quantitykind/AtomicAttenuationCoefficient"
    "http://qudt.org/vocab/quantitykind/MigrationArea"
    "http://qudt.org/vocab/quantitykind/PackingFraction"],
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/SerumOrPlasmaLevel"
    "http://qudt.org/vocab/quantitykind/RespiratoryRate"
    "http://qudt.org/vocab/quantitykind/MicrobialFormation"
    "http://qudt.org/vocab/quantitykind/HeartRate"],
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/StandardGravitationalParameter"
    "http://qudt.org/vocab/quantitykind/GravitationalAttraction"],
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/ReynoldsNumber"
    "http://qudt.org/vocab/quantitykind/MachNumber"]})

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
   ["http://qudt.org/vocab/quantitykind/MassConcentration"
    "http://qudt.org/vocab/quantitykind/MolarEntropy"
    "http://qudt.org/vocab/quantitykind/MolalityOfSolute"
    "http://qudt.org/vocab/quantitykind/ChemicalAffinity"
    "http://qudt.org/vocab/quantitykind/AtomicNumber"
    "http://qudt.org/vocab/quantitykind/ChemicalPotential"
    "http://qudt.org/vocab/quantitykind/ThermalDiffusionRatioCoefficient"
    "http://qudt.org/vocab/quantitykind/MeanFreePath"
    "http://qudt.org/vocab/quantitykind/RelativeAtomicMass"
    "http://qudt.org/vocab/quantitykind/StandardAbsoluteActivity"
    "http://qudt.org/vocab/quantitykind/StandardChemicalPotential"
    "http://qudt.org/vocab/quantitykind/OsmoticPressure"
    "http://qudt.org/vocab/quantitykind/StoichiometricNumber"
    "http://qudt.org/vocab/quantitykind/DiffusionCoefficient"
    "http://qudt.org/vocab/quantitykind/MagneticDipoleMoment"
    "http://qudt.org/vocab/quantitykind/StatisticalWeight"
    "http://qudt.org/vocab/quantitykind/MolarVolume"
    "http://qudt.org/vocab/quantitykind/AmountOfSubstance"
    "http://qudt.org/vocab/quantitykind/ElectrolyticConductivity"
    "http://qudt.org/vocab/quantitykind/ExtentOfReaction"
    "http://qudt.org/vocab/quantitykind/IonTransportNumber"
    "http://qudt.org/vocab/quantitykind/EquilibriumConstantOnPressureBasis"
    "http://qudt.org/vocab/quantitykind/ChargeNumber"
    "http://qudt.org/vocab/quantitykind/AmountOfSubstanceConcentrationOfB"
    "http://qudt.org/vocab/quantitykind/QuantumNumber"
    "http://qudt.org/vocab/quantitykind/Fugacity"
    "http://qudt.org/vocab/quantitykind/MolarEnergy"
    "http://qudt.org/vocab/quantitykind/Concentration"
    "http://qudt.org/vocab/quantitykind/ActivityCoefficient"
    "http://qudt.org/vocab/quantitykind/MassAmountOfSubstance"
    "http://qudt.org/vocab/quantitykind/MolarMass"
    "http://qudt.org/vocab/quantitykind/ElectricPolarizability"
    "http://qudt.org/vocab/quantitykind/AmountOfSubstanceFractionOfB"
    "http://qudt.org/vocab/quantitykind/GrandCanonicalPartitionFunction"
    "http://qudt.org/vocab/quantitykind/NumberDensity"
    "http://qudt.org/vocab/quantitykind/MolecularMass"
    "http://qudt.org/vocab/quantitykind/DegreeOfDissociation"
    "http://qudt.org/vocab/quantitykind/ElementaryCharge"
    "http://qudt.org/vocab/quantitykind/AvogadroConstant"
    "http://qudt.org/vocab/quantitykind/BoltzmannConstant"
    "http://qudt.org/vocab/quantitykind/AbsoluteActivity"
    "http://qudt.org/vocab/quantitykind/MolarOpticalRotatoryPower"
    "http://qudt.org/vocab/quantitykind/InverseAmountOfSubstance"
    "http://qudt.org/vocab/quantitykind/CatalyticActivity"
    "http://qudt.org/vocab/quantitykind/FaradayConstant"
    "http://qudt.org/vocab/quantitykind/ThermalDiffusionFactor"
    "http://qudt.org/vocab/quantitykind/RelativeMolecularMass"
    "http://qudt.org/vocab/quantitykind/OsmoticCoefficient"
    "http://qudt.org/vocab/quantitykind/SpecificOpticalRotatoryPower"
    "http://qudt.org/vocab/quantitykind/MoleFraction"
    "http://qudt.org/vocab/quantitykind/ElectricDipoleMoment"
    "http://qudt.org/vocab/quantitykind/MolarHeatCapacity"
    "http://qudt.org/vocab/quantitykind/TemperatureAmountOfSubstance"
    "http://qudt.org/vocab/quantitykind/Turbidity"
    "http://qudt.org/vocab/quantitykind/MolecularConcentration"
    "http://qudt.org/vocab/quantitykind/VolumeFraction"
    "http://qudt.org/vocab/quantitykind/AmountOfSubstancePerUnitVolume"
    "http://qudt.org/vocab/quantitykind/PartialPressure"
    "http://qudt.org/vocab/quantitykind/EquilibriumConstant"
    "http://qudt.org/vocab/quantitykind/LengthMolarEnergy"
    "http://qudt.org/vocab/quantitykind/AngleOfOpticalRotation"
    "http://qudt.org/vocab/quantitykind/MassAmountOfSubstanceTemperature"
    "http://qudt.org/vocab/quantitykind/EquilibriumConstantOnConcentrationBasis"
    "http://qudt.org/vocab/quantitykind/MolarConductivity"
    "http://qudt.org/vocab/quantitykind/ElectricChargePerAmountOfSubstance"
    "http://qudt.org/vocab/quantitykind/AmountOfSubstancePerUnitMass"
    "http://qudt.org/vocab/quantitykind/NumberOfParticles"
    "http://qudt.org/vocab/quantitykind/CanonicalPartitionFunction"
    "http://qudt.org/vocab/quantitykind/MolarGasConstant"
    "http://qudt.org/vocab/quantitykind/MassFraction"
    "http://qudt.org/vocab/quantitykind/EnergyAndWorkPerMassAmountOfSubstance"
    "http://qudt.org/vocab/quantitykind/ThermalDiffusionRatio"
    "http://qudt.org/vocab/quantitykind/MassDensity"
    "http://qudt.org/vocab/quantitykind/MicroCanonicalPartitionFunction"
    "http://qudt.org/vocab/quantitykind/IonicStrength"],
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
   :qudt/relevantQuantityKind
   "http://qudt.org/vocab/quantitykind/AbsoluteHumidity",
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/SignalDetectionThreshold"
    "http://qudt.org/vocab/quantitykind/DataRate"
    "http://qudt.org/vocab/quantitykind/Gain"
    "http://qudt.org/vocab/quantitykind/SignalStrength"
    "http://qudt.org/vocab/quantitykind/RF-Power"],
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
   :qudt/relevantQuantityKind "http://qudt.org/vocab/quantitykind/Currency",
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Currency"},
   :skos/broader     :discipline/Finance})

(def Dimensionless
  "Dimensionless"
  {:db/ident         :discipline/Dimensionless,
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/DimensionlessRatio"
    "http://qudt.org/vocab/quantitykind/Dimensionless"],
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
   ["http://qudt.org/vocab/quantitykind/MagneticPolarization"
    "http://qudt.org/vocab/quantitykind/CubicElectricDipoleMomentPerSquareEnergy"
    "http://qudt.org/vocab/quantitykind/ElectricDisplacementField"
    "http://qudt.org/vocab/quantitykind/ModulusOfAdmittance"
    "http://qudt.org/vocab/quantitykind/ElectricChargeVolumeDensity"
    "http://qudt.org/vocab/quantitykind/ElectromotiveForce"
    "http://qudt.org/vocab/quantitykind/MagneticDipoleMoment"
    "http://qudt.org/vocab/quantitykind/MagneticFlux"
    "http://qudt.org/vocab/quantitykind/ComplexPower"
    "http://qudt.org/vocab/quantitykind/QualityFactor"
    "http://qudt.org/vocab/quantitykind/VoltagePhasor"
    "http://qudt.org/vocab/quantitykind/Polarizability"
    "http://qudt.org/vocab/quantitykind/LinearElectricCurrentDensity"
    "http://qudt.org/vocab/quantitykind/ElectricCurrentPerUnitEnergy"
    "http://qudt.org/vocab/quantitykind/Permittivity"
    "http://qudt.org/vocab/quantitykind/Permeability"
    "http://qudt.org/vocab/quantitykind/ElectricCharge"
    "http://qudt.org/vocab/quantitykind/MagneticTension"
    "http://qudt.org/vocab/quantitykind/InversePermittivity"
    "http://qudt.org/vocab/quantitykind/EnergyPerAreaElectricCharge"
    "http://qudt.org/vocab/quantitykind/MagneticFluxDensity"
    "http://qudt.org/vocab/quantitykind/LinkedFlux"
    "http://qudt.org/vocab/quantitykind/ElectricField"
    "http://qudt.org/vocab/quantitykind/Conductance"
    "http://qudt.org/vocab/quantitykind/Reluctance"
    "http://qudt.org/vocab/quantitykind/MagneticConstant"
    "http://qudt.org/vocab/quantitykind/ElectricCurrent"
    "http://qudt.org/vocab/quantitykind/Voltage"
    "http://qudt.org/vocab/quantitykind/ElectricCurrentPerAngle"
    "http://qudt.org/vocab/quantitykind/ElectromagneticEnergyDensity"
    "http://qudt.org/vocab/quantitykind/MagneticField"
    "http://qudt.org/vocab/quantitykind/ElectricQuadrupoleMoment"
    "http://qudt.org/vocab/quantitykind/ElectricChargePerMass"
    "http://qudt.org/vocab/quantitykind/DisplacementCurrent"
    "http://qudt.org/vocab/quantitykind/ElectricPower"
    "http://qudt.org/vocab/quantitykind/VolumicElectromagneticEnergy"
    "http://qudt.org/vocab/quantitykind/ElectricChargeDensity"
    "http://qudt.org/vocab/quantitykind/PermeabilityOfVacuum"
    "http://qudt.org/vocab/quantitykind/DisplacementCurrentDensity"
    "http://qudt.org/vocab/quantitykind/ModulusOfImpedance"
    "http://qudt.org/vocab/quantitykind/EnergyPerElectricCharge"
    "http://qudt.org/vocab/quantitykind/PermittivityRatio"
    "http://qudt.org/vocab/quantitykind/TotalCurrent"
    "http://qudt.org/vocab/quantitykind/ElectricDisplacement"
    "http://qudt.org/vocab/quantitykind/Resistance"
    "http://qudt.org/vocab/quantitykind/QuarticElectricDipoleMomentPerCubicEnergy"
    "http://qudt.org/vocab/quantitykind/PolarizationField"
    "http://qudt.org/vocab/quantitykind/ScalarMagneticPotential"
    "http://qudt.org/vocab/quantitykind/ElectricChargePerArea"
    "http://qudt.org/vocab/quantitykind/Resistivity"
    "http://qudt.org/vocab/quantitykind/MagnetizationField"
    "http://qudt.org/vocab/quantitykind/ElectromagneticWavePhaseSpeed"
    "http://qudt.org/vocab/quantitykind/ElectricFluxDensity"
    "http://qudt.org/vocab/quantitykind/ActivePower"
    "http://qudt.org/vocab/quantitykind/Permeance"
    "http://qudt.org/vocab/quantitykind/InverseMagneticFlux"
    "http://qudt.org/vocab/quantitykind/ElectricChargeLineDensity"
    "http://qudt.org/vocab/quantitykind/MagneticMoment"
    "http://qudt.org/vocab/quantitykind/ElectricCurrentDensity"
    "http://qudt.org/vocab/quantitykind/MagnetomotiveForce"
    "http://qudt.org/vocab/quantitykind/PowerFactor"
    "http://qudt.org/vocab/quantitykind/MagneticAreaMoment"
    "http://qudt.org/vocab/quantitykind/MutualInductance"
    "http://qudt.org/vocab/quantitykind/NonActivePower"
    "http://qudt.org/vocab/quantitykind/ElectricFlux"
    "http://qudt.org/vocab/quantitykind/AuxillaryMagneticField"
    "http://qudt.org/vocab/quantitykind/ElectricChargeSurfaceDensity"
    "http://qudt.org/vocab/quantitykind/ElectricCurrentPerUnitLength"
    "http://qudt.org/vocab/quantitykind/Turns"
    "http://qudt.org/vocab/quantitykind/ForcePerElectricCharge"
    "http://qudt.org/vocab/quantitykind/LossAngle"
    "http://qudt.org/vocab/quantitykind/LinearElectricCurrent"
    "http://qudt.org/vocab/quantitykind/ElectricPotentialDifference"
    "http://qudt.org/vocab/quantitykind/ElectricPolarization"
    "http://qudt.org/vocab/quantitykind/SourceVoltage"
    "http://qudt.org/vocab/quantitykind/ElectricChargeLinearDensity"
    "http://qudt.org/vocab/quantitykind/ApparentPower"
    "http://qudt.org/vocab/quantitykind/CouplingFactor"
    "http://qudt.org/vocab/quantitykind/Capacitance"
    "http://qudt.org/vocab/quantitykind/Impedance"
    "http://qudt.org/vocab/quantitykind/PoyntingVector"
    "http://qudt.org/vocab/quantitykind/MagneticSusceptability"
    "http://qudt.org/vocab/quantitykind/PermittivityOfVacuum"
    "http://qudt.org/vocab/quantitykind/ElectricConductivity"
    "http://qudt.org/vocab/quantitykind/ElectricCurrentPhasor"
    "http://qudt.org/vocab/quantitykind/MagneticVectorPotential"
    "http://qudt.org/vocab/quantitykind/ReactivePower"
    "http://qudt.org/vocab/quantitykind/Susceptance"
    "http://qudt.org/vocab/quantitykind/ActiveEnergy"
    "http://qudt.org/vocab/quantitykind/Admittance"
    "http://qudt.org/vocab/quantitykind/MagneticReluctivity"
    "http://qudt.org/vocab/quantitykind/LeakageFactor"
    "http://qudt.org/vocab/quantitykind/Magnetization"
    "http://qudt.org/vocab/quantitykind/Conductivity"
    "http://qudt.org/vocab/quantitykind/EnergyPerSquareMagneticFluxDensity"
    "http://qudt.org/vocab/quantitykind/LengthPerUnitElectricCurrent"
    "http://qudt.org/vocab/quantitykind/ElectricFieldStrength"
    "http://qudt.org/vocab/quantitykind/ElectricDipoleMoment"
    "http://qudt.org/vocab/quantitykind/PowerPerElectricCharge"
    "http://qudt.org/vocab/quantitykind/Coercivity"
    "http://qudt.org/vocab/quantitykind/Reactance"
    "http://qudt.org/vocab/quantitykind/PhaseDifference"
    "http://qudt.org/vocab/quantitykind/Inductance"
    "http://qudt.org/vocab/quantitykind/ElectricPotential"
    "http://qudt.org/vocab/quantitykind/CurrentLinkage"
    "http://qudt.org/vocab/quantitykind/MagneticFieldStrength"
    "http://qudt.org/vocab/quantitykind/MagneticFluxPerUnitLength"
    "http://qudt.org/vocab/quantitykind/LossFactor"
    "http://qudt.org/vocab/quantitykind/SpeedOfLight"
    "http://qudt.org/vocab/quantitykind/ElectricSusceptibility"
    "http://qudt.org/vocab/quantitykind/TotalCurrentDensity"
    "http://qudt.org/vocab/quantitykind/ElectricChargePerAmountOfSubstance"
    "http://qudt.org/vocab/quantitykind/MassPerElectricCharge"],
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/EnergyKinetic"
    "http://qudt.org/vocab/quantitykind/InverseSquareEnergy"
    "http://qudt.org/vocab/quantitykind/EnergyDensity"
    "http://qudt.org/vocab/quantitykind/KineticEnergy"
    "http://qudt.org/vocab/quantitykind/LengthEnergy"
    "http://qudt.org/vocab/quantitykind/PowerAreaPerSolidAngle"
    "http://qudt.org/vocab/quantitykind/EnergyInternal"
    "http://qudt.org/vocab/quantitykind/InverseEnergy"
    "http://qudt.org/vocab/quantitykind/SquareEnergy"
    "http://qudt.org/vocab/quantitykind/PowerPerArea"
    "http://qudt.org/vocab/quantitykind/PowerPerAreaAngle"
    "http://qudt.org/vocab/quantitykind/PotentialEnergy"
    "http://qudt.org/vocab/quantitykind/PowerArea"
    "http://qudt.org/vocab/quantitykind/Power"
    "http://qudt.org/vocab/quantitykind/EnergyPerArea"],
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
   :qudt/relevantQuantityKind "http://qudt.org/vocab/quantitykind/Asset",
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/MolecularViscosity"
    "http://qudt.org/vocab/quantitykind/DynamicPressure"
    "http://qudt.org/vocab/quantitykind/ForcePerArea"
    "http://qudt.org/vocab/quantitykind/Circulation"
    "http://qudt.org/vocab/quantitykind/TotalPressure"
    "http://qudt.org/vocab/quantitykind/Viscosity"
    "http://qudt.org/vocab/quantitykind/Vorticity"
    "http://qudt.org/vocab/quantitykind/DynamicViscosity"
    "http://qudt.org/vocab/quantitykind/StaticPressure"
    "http://qudt.org/vocab/quantitykind/KinematicViscosity"
    "http://qudt.org/vocab/quantitykind/SoundPressure"
    "http://qudt.org/vocab/quantitykind/Pressure"
    "http://qudt.org/vocab/quantitykind/ReynoldsNumber"],
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/VideoFrameRate"
    "http://qudt.org/vocab/quantitykind/InformationFlowRate"
    "http://qudt.org/vocab/quantitykind/InformationEntropy"
    "http://qudt.org/vocab/quantitykind/DataRate"
    "http://qudt.org/vocab/quantitykind/Capacity"],
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/SerumOrPlasmaLevel"
    "http://qudt.org/vocab/quantitykind/BloodGlucoseLevel"
    "http://qudt.org/vocab/quantitykind/DiastolicBloodPressure"
    "http://qudt.org/vocab/quantitykind/SystolicBloodPressure"
    "http://qudt.org/vocab/quantitykind/RespiratoryRate"
    "http://qudt.org/vocab/quantitykind/MicrobialFormation"
    "http://qudt.org/vocab/quantitykind/EnergyExpenditure"
    "http://qudt.org/vocab/quantitykind/HeartRate"],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "LifeSciences"},
   :skos/broader     :discipline/Biology})

(def Light
  "Light"
  {:db/ident         :discipline/Light,
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/Wavelength"
    "http://qudt.org/vocab/quantitykind/RefractiveIndex"],
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/LinearDensity"
    "http://qudt.org/vocab/quantitykind/FractionalMass_Stage3"
    "http://qudt.org/vocab/quantitykind/PayloadMass"
    "http://qudt.org/vocab/quantitykind/FractionalMass_Stage1"
    "http://qudt.org/vocab/quantitykind/MassDensity"
    "http://qudt.org/vocab/quantitykind/MassOfElectricalPowerSupply"
    "http://qudt.org/vocab/quantitykind/FractionallMass_Stages1-3"
    "http://qudt.org/vocab/quantitykind/SecondStageMassRatio"
    "http://qudt.org/vocab/quantitykind/StagePropellantMass"
    "http://qudt.org/vocab/quantitykind/SingleStageLauncherMassRatio"
    "http://qudt.org/vocab/quantitykind/ShearStress"
    "http://qudt.org/vocab/quantitykind/VolumeFlowRate"
    "http://qudt.org/vocab/quantitykind/MassRatio"
    "http://qudt.org/vocab/quantitykind/FinalOrCurrentVehicleMass"
    "http://qudt.org/vocab/quantitykind/SurfaceTension"
    "http://qudt.org/vocab/quantitykind/PropellantMass"
    "http://qudt.org/vocab/quantitykind/MassOfSolidBooster"
    "http://qudt.org/vocab/quantitykind/RelativeMassDensity"
    "http://qudt.org/vocab/quantitykind/StageStructuralMass"
    "http://qudt.org/vocab/quantitykind/NormalStress"
    "http://qudt.org/vocab/quantitykind/FirstStageMassRatio"
    "http://qudt.org/vocab/quantitykind/Mass"
    "http://qudt.org/vocab/quantitykind/FractionalMass_Stage2"
    "http://qudt.org/vocab/quantitykind/SurfaceDensity"
    "http://qudt.org/vocab/quantitykind/ElectricPropulsionPropellantMass"
    "http://qudt.org/vocab/quantitykind/InitialVehicleMass"
    "http://qudt.org/vocab/quantitykind/MassFlowRate"],
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
   ["http://qudt.org/vocab/quantitykind/PRODUCT-OF-INERTIA_Z"
    "http://qudt.org/vocab/quantitykind/GROSS-LIFT-OFF-WEIGHT"
    "http://qudt.org/vocab/quantitykind/PRODUCT-OF-INERTIA_X"
    "http://qudt.org/vocab/quantitykind/MASS-GROWTH-ALLOWANCE"
    "http://qudt.org/vocab/quantitykind/PREDICTED-MASS"
    "http://qudt.org/vocab/quantitykind/CENTER-OF-MASS"
    "http://qudt.org/vocab/quantitykind/MOMENT-OF-INERTIA_Z"
    "http://qudt.org/vocab/quantitykind/PRODUCT-OF-INERTIA"
    "http://qudt.org/vocab/quantitykind/INERT-MASS"
    "http://qudt.org/vocab/quantitykind/CENTER-OF-GRAVITY_Y"
    "http://qudt.org/vocab/quantitykind/NOMINAL-ASCENT-PROPELLANT-MASS"
    "http://qudt.org/vocab/quantitykind/CONTROL-MASS"
    "http://qudt.org/vocab/quantitykind/PRODUCT-OF-INERTIA_Y"
    "http://qudt.org/vocab/quantitykind/DELTA-V"
    "http://qudt.org/vocab/quantitykind/CONTRACT-END-ITEM-SPECIFICATION-MASS"
    "http://qudt.org/vocab/quantitykind/FLIGHT-PERFORMANCE-RESERVE-PROPELLANT-MASS"
    "http://qudt.org/vocab/quantitykind/CENTER-OF-GRAVITY_Z"
    "http://qudt.org/vocab/quantitykind/RESERVE-MASS"
    "http://qudt.org/vocab/quantitykind/MomentOfInertia"
    "http://qudt.org/vocab/quantitykind/MOMENT-OF-INERTIA_Y"
    "http://qudt.org/vocab/quantitykind/MASS-DELIVERED"
    "http://qudt.org/vocab/quantitykind/FUEL-BIAS"
    "http://qudt.org/vocab/quantitykind/DRY-MASS"
    "http://qudt.org/vocab/quantitykind/CENTER-OF-GRAVITY_X"
    "http://qudt.org/vocab/quantitykind/TARGET-BOGIE-MASS"
    "http://qudt.org/vocab/quantitykind/MASS-PROPERTY-UNCERTAINTY"
    "http://qudt.org/vocab/quantitykind/MASS-MARGIN"],
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/MassPerTime"
    "http://qudt.org/vocab/quantitykind/SecondMomentOfArea"
    "http://qudt.org/vocab/quantitykind/Thrust"
    "http://qudt.org/vocab/quantitykind/SpecificImpulseByWeight"
    "http://qudt.org/vocab/quantitykind/MolarAngularMomentum"
    "http://qudt.org/vocab/quantitykind/ForcePerLength"
    "http://qudt.org/vocab/quantitykind/NormalStress"
    "http://qudt.org/vocab/quantitykind/PotentialEnergy"
    "http://qudt.org/vocab/quantitykind/Power"
    "http://qudt.org/vocab/quantitykind/InternalEnergy"
    "http://qudt.org/vocab/quantitykind/ShearStrain"
    "http://qudt.org/vocab/quantitykind/InverseEnergy"
    "http://qudt.org/vocab/quantitykind/MassPerAreaTime"
    "http://qudt.org/vocab/quantitykind/StaticFriction"
    "http://qudt.org/vocab/quantitykind/SpecificImpulseByMass"
    "http://qudt.org/vocab/quantitykind/LinearMomentum"
    "http://qudt.org/vocab/quantitykind/MassPerArea"
    "http://qudt.org/vocab/quantitykind/PowerPerArea"
    "http://qudt.org/vocab/quantitykind/SecondPolarMomentOfArea"
    "http://qudt.org/vocab/quantitykind/GeneralizedForce"
    "http://qudt.org/vocab/quantitykind/SectionModulus"
    "http://qudt.org/vocab/quantitykind/AngularMomentum"
    "http://qudt.org/vocab/quantitykind/Stress"
    "http://qudt.org/vocab/quantitykind/EnergyDensity"
    "http://qudt.org/vocab/quantitykind/PolarMomentOfInertia"
    "http://qudt.org/vocab/quantitykind/Action"
    "http://qudt.org/vocab/quantitykind/SecondAxialMomentOfArea"
    "http://qudt.org/vocab/quantitykind/PowerPerAreaAngle"
    "http://qudt.org/vocab/quantitykind/StandardGravitationalParameter"
    "http://qudt.org/vocab/quantitykind/MomentOfInertia"
    "http://qudt.org/vocab/quantitykind/Tension"
    "http://qudt.org/vocab/quantitykind/SquareEnergy"
    "http://qudt.org/vocab/quantitykind/MassPerLength"
    "http://qudt.org/vocab/quantitykind/GeneralizedVelocity"
    "http://qudt.org/vocab/quantitykind/FirstMomentOfArea"
    "http://qudt.org/vocab/quantitykind/KineticEnergy"
    "http://qudt.org/vocab/quantitykind/ThrustToMassRatio"
    "http://qudt.org/vocab/quantitykind/ShearModulus"
    "http://qudt.org/vocab/quantitykind/Torque"
    "http://qudt.org/vocab/quantitykind/Strain"
    "http://qudt.org/vocab/quantitykind/Work"
    "http://qudt.org/vocab/quantitykind/Pressure"
    "http://qudt.org/vocab/quantitykind/MassFlowRate"
    "http://qudt.org/vocab/quantitykind/HamiltonFunction"
    "http://qudt.org/vocab/quantitykind/PowerAreaPerSolidAngle"
    "http://qudt.org/vocab/quantitykind/LinearStrain"
    "http://qudt.org/vocab/quantitykind/BulkModulus"
    "http://qudt.org/vocab/quantitykind/GeneralizedCoordinate"
    "http://qudt.org/vocab/quantitykind/LengthByForce"
    "http://qudt.org/vocab/quantitykind/AngularImpulse"
    "http://qudt.org/vocab/quantitykind/VolumeFlowRate"
    "http://qudt.org/vocab/quantitykind/MechanicalEnergy"
    "http://qudt.org/vocab/quantitykind/Momentum"
    "http://qudt.org/vocab/quantitykind/Compressibility"
    "http://qudt.org/vocab/quantitykind/SpecificVolume"
    "http://qudt.org/vocab/quantitykind/BendingMomentOfForce"
    "http://qudt.org/vocab/quantitykind/ShearStress"
    "http://qudt.org/vocab/quantitykind/Weight"
    "http://qudt.org/vocab/quantitykind/Force"
    "http://qudt.org/vocab/quantitykind/LagrangeFunction"
    "http://qudt.org/vocab/quantitykind/ModulusOfElasticity"
    "http://qudt.org/vocab/quantitykind/GeneralizedMomentum"
    "http://qudt.org/vocab/quantitykind/VolumeStrain"
    "http://qudt.org/vocab/quantitykind/PowerArea"
    "http://qudt.org/vocab/quantitykind/SpecificEnergy"
    "http://qudt.org/vocab/quantitykind/StrainEnergyDensity"
    "http://qudt.org/vocab/quantitykind/InverseSquareEnergy"
    "http://qudt.org/vocab/quantitykind/ForcePerAreaTime"
    "http://qudt.org/vocab/quantitykind/PoissonRatio"
    "http://qudt.org/vocab/quantitykind/Friction"
    "http://qudt.org/vocab/quantitykind/DynamicFriction"
    "http://qudt.org/vocab/quantitykind/SurfaceTension"
    "http://qudt.org/vocab/quantitykind/Efficiency"],
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/BodyMassIndex"
    "http://qudt.org/vocab/quantitykind/HeartRate"
    "http://qudt.org/vocab/quantitykind/DiastolicBloodPressure"
    "http://qudt.org/vocab/quantitykind/BloodGlucoseLevel"
    "http://qudt.org/vocab/quantitykind/EnergyExpenditure"
    "http://qudt.org/vocab/quantitykind/SystolicBloodPressure"],
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/RadiantIntensity"
    "http://qudt.org/vocab/quantitykind/LuminousIntensity"
    "http://qudt.org/vocab/quantitykind/LuminousEfficacy"
    "http://qudt.org/vocab/quantitykind/LuminousFlux"
    "http://qudt.org/vocab/quantitykind/Frequency"
    "http://qudt.org/vocab/quantitykind/LuminousFluxPerArea"
    "http://qudt.org/vocab/quantitykind/LuminousEnergy"
    "http://qudt.org/vocab/quantitykind/ReflectanceFactor"
    "http://qudt.org/vocab/quantitykind/RadiantFluenceRate"
    "http://qudt.org/vocab/quantitykind/TransmittanceDensity"
    "http://qudt.org/vocab/quantitykind/LuminousEmmitance"
    "http://qudt.org/vocab/quantitykind/NapierianAbsorbance"
    "http://qudt.org/vocab/quantitykind/SphericalIlluminance"
    "http://qudt.org/vocab/quantitykind/RefractiveIndex"
    "http://qudt.org/vocab/quantitykind/Illuminance"
    "http://qudt.org/vocab/quantitykind/Wavenumber"
    "http://qudt.org/vocab/quantitykind/Transmittance"
    "http://qudt.org/vocab/quantitykind/Radiance"
    "http://qudt.org/vocab/quantitykind/Luminance"
    "http://qudt.org/vocab/quantitykind/SpectralLuminousEfficiency"
    "http://qudt.org/vocab/quantitykind/Irradiance"],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Photometry"},
   :skos/broader     :discipline/Optics})

(def PhysicalConstant
  {:db/ident :discipline/PhysicalConstant,
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/FineStructureConstant"
    "http://qudt.org/vocab/quantitykind/MagneticConstant"
    "http://qudt.org/vocab/quantitykind/ElectronGyromagneticRatio"
    "http://qudt.org/vocab/quantitykind/DegreeOfDissociation"
    "http://qudt.org/vocab/quantitykind/SpeedOfLight"
    "http://qudt.org/vocab/quantitykind/BohrRadius"
    "http://qudt.org/vocab/quantitykind/ReducedPlanckConstant"
    "http://qudt.org/vocab/quantitykind/AtomicMassConstant"
    "http://qudt.org/vocab/quantitykind/MagneticFluxQuantum"
    "http://qudt.org/vocab/quantitykind/BoltzmannConstant"
    "http://qudt.org/vocab/quantitykind/MolarGasConstant"
    "http://qudt.org/vocab/quantitykind/PlanckConstant"
    "http://qudt.org/vocab/quantitykind/PermeabilityOfVacuum"
    "http://qudt.org/vocab/quantitykind/ComptonWavelength"
    "http://qudt.org/vocab/quantitykind/IonicStrength"
    "http://qudt.org/vocab/quantitykind/RydbergConstant"
    "http://qudt.org/vocab/quantitykind/FaradayConstant"
    "http://qudt.org/vocab/quantitykind/BohrMagneton"
    "http://qudt.org/vocab/quantitykind/NuclearMagneton"
    "http://qudt.org/vocab/quantitykind/HartreeEnergy"
    "http://qudt.org/vocab/quantitykind/GyromagneticRatio"
    "http://qudt.org/vocab/quantitykind/AvogadroConstant"
    "http://qudt.org/vocab/quantitykind/JosephsonConstant"]})

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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/Temperature"
    "http://qudt.org/vocab/quantitykind/LengthEnergy"
    "http://qudt.org/vocab/quantitykind/Density"
    "http://qudt.org/vocab/quantitykind/ForcePerArea"
    "http://qudt.org/vocab/quantitykind/LengthMass"
    "http://qudt.org/vocab/quantitykind/SpecificThrust"],
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
   ["http://qudt.org/vocab/quantitykind/NozzleThroatPressure"
    "http://qudt.org/vocab/quantitykind/PropellantBurnRate"
    "http://qudt.org/vocab/quantitykind/NozzleThroatCrossSectionalArea"
    "http://qudt.org/vocab/quantitykind/ResonanceEscapeProbabilityForFission"
    "http://qudt.org/vocab/quantitykind/EccentricityOfOrbit"
    "http://qudt.org/vocab/quantitykind/IonDensity"
    "http://qudt.org/vocab/quantitykind/LiftForce"
    "http://qudt.org/vocab/quantitykind/WebTime"
    "http://qudt.org/vocab/quantitykind/NeutronDiffusionLength"
    "http://qudt.org/vocab/quantitykind/LiftCoefficient"
    "http://qudt.org/vocab/quantitykind/FastFissionFactor"
    "http://qudt.org/vocab/quantitykind/OrbitalRadialDistance"
    "http://qudt.org/vocab/quantitykind/ClosestApproachRadius"
    "http://qudt.org/vocab/quantitykind/ExitPlaneTemperature"
    "http://qudt.org/vocab/quantitykind/OrbitalAngularMomentumPerUnitMass"
    "http://qudt.org/vocab/quantitykind/BurnRate"
    "http://qudt.org/vocab/quantitykind/DensityOfTheExhaustGases"
    "http://qudt.org/vocab/quantitykind/MachNumber"
    "http://qudt.org/vocab/quantitykind/BucklingFactor"
    "http://qudt.org/vocab/quantitykind/PressureBurningRateIndex"
    "http://qudt.org/vocab/quantitykind/ThermalUtilizationFactorForFission"
    "http://qudt.org/vocab/quantitykind/AngularDistance"
    "http://qudt.org/vocab/quantitykind/RocketAtmosphericTransverseForce"
    "http://qudt.org/vocab/quantitykind/VerticalVelocity"
    "http://qudt.org/vocab/quantitykind/AverageSpecificImpulse"
    "http://qudt.org/vocab/quantitykind/VehicleVelocity"
    "http://qudt.org/vocab/quantitykind/GravitationalConstant"
    "http://qudt.org/vocab/quantitykind/TrueExhaustVelocity"
    "http://qudt.org/vocab/quantitykind/ThrusterPowerToThrustEfficiency"
    "http://qudt.org/vocab/quantitykind/MaxSeaLevelThrust"
    "http://qudt.org/vocab/quantitykind/DistanceTraveledDuringBurn"
    "http://qudt.org/vocab/quantitykind/ExpansionRatio"
    "http://qudt.org/vocab/quantitykind/IonicCharge"
    "http://qudt.org/vocab/quantitykind/UniversalGasConstant"
    "http://qudt.org/vocab/quantitykind/PressureBurningRateConstant"
    "http://qudt.org/vocab/quantitykind/MaxExpectedOperatingThrust"
    "http://qudt.org/vocab/quantitykind/EllipticalOrbitPerigeeVelocity"
    "http://qudt.org/vocab/quantitykind/InitialExpansionRatio"
    "http://qudt.org/vocab/quantitykind/BevelGearPitchAngle"
    "http://qudt.org/vocab/quantitykind/ElectricPower"
    "http://qudt.org/vocab/quantitykind/HeadEndPressure"
    "http://qudt.org/vocab/quantitykind/ElectricalPowerToMassRatio"
    "http://qudt.org/vocab/quantitykind/AverageVacuumThrust"
    "http://qudt.org/vocab/quantitykind/DragCoefficient"
    "http://qudt.org/vocab/quantitykind/ExhaustGasesSpecificHeat"
    "http://qudt.org/vocab/quantitykind/FissionMultiplicationFactor"
    "http://qudt.org/vocab/quantitykind/ApogeeRadius"
    "http://qudt.org/vocab/quantitykind/SpecificImpulse"
    "http://qudt.org/vocab/quantitykind/ExitPlanePressure"
    "http://qudt.org/vocab/quantitykind/FlightPathAngle"
    "http://qudt.org/vocab/quantitykind/MaxOperatingThrust"
    "http://qudt.org/vocab/quantitykind/AngleOfAttack"
    "http://qudt.org/vocab/quantitykind/NozzleThroatDiameter"
    "http://qudt.org/vocab/quantitykind/StructuralEfficiency"
    "http://qudt.org/vocab/quantitykind/PayloadRatio"
    "http://qudt.org/vocab/quantitykind/BurnTime"
    "http://qudt.org/vocab/quantitykind/VacuumThrust"
    "http://qudt.org/vocab/quantitykind/DensityInCombustionChamber"
    "http://qudt.org/vocab/quantitykind/ExitPlaneCrossSectionalArea"
    "http://qudt.org/vocab/quantitykind/EffectiveExhaustVelocity"
    "http://qudt.org/vocab/quantitykind/ExhaustStreamPower"
    "http://qudt.org/vocab/quantitykind/FissionCoreRadiusToHeightRatio"
    "http://qudt.org/vocab/quantitykind/ThrustCoefficient"
    "http://qudt.org/vocab/quantitykind/InitialNozzleThroatDiameter"
    "http://qudt.org/vocab/quantitykind/ActionTime"
    "http://qudt.org/vocab/quantitykind/AverageHeadEndPressure"
    "http://qudt.org/vocab/quantitykind/WebTimeAveragePressure"
    "http://qudt.org/vocab/quantitykind/CrossSectionalArea"
    "http://qudt.org/vocab/quantitykind/MaximumOperatingPressure"
    "http://qudt.org/vocab/quantitykind/HorizontalVelocity"
    "http://qudt.org/vocab/quantitykind/WebTimeAverageThrust"
    "http://qudt.org/vocab/quantitykind/IgnitionIntervalTime"
    "http://qudt.org/vocab/quantitykind/DragForce"
    "http://qudt.org/vocab/quantitykind/SpecificHeatsRatio"
    "http://qudt.org/vocab/quantitykind/IonCurrent"
    "http://qudt.org/vocab/quantitykind/EarthClosestApproachVehicleVelocity"
    "http://qudt.org/vocab/quantitykind/CombustionChamberTemperature"
    "http://qudt.org/vocab/quantitykind/DynamicPressure"
    "http://qudt.org/vocab/quantitykind/AmbientPressure"
    "http://qudt.org/vocab/quantitykind/NozzleWallsThrustReaction"
    "http://qudt.org/vocab/quantitykind/FissionFuelUtilizationFactor"
    "http://qudt.org/vocab/quantitykind/CharacteristicVelocity"
    "http://qudt.org/vocab/quantitykind/EllipticalOrbitApogeeVelocity"
    "http://qudt.org/vocab/quantitykind/MassOfTheEarth"
    "http://qudt.org/vocab/quantitykind/PropellantTemperature"
    "http://qudt.org/vocab/quantitykind/ThrustToWeightRatio"
    "http://qudt.org/vocab/quantitykind/ExhaustGasMeanMolecularWeight"
    "http://qudt.org/vocab/quantitykind/InitialVelocity"
    "http://qudt.org/vocab/quantitykind/PropellantMeanBulkTemperature"
    "http://qudt.org/vocab/quantitykind/MaximumExpectedOperatingPressure"
    "http://qudt.org/vocab/quantitykind/PermittivityOfFreeSpace"
    "http://qudt.org/vocab/quantitykind/OverRangeDistance"],
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
   :qudt/relevantQuantityKind "http://qudt.org/vocab/quantitykind/CV_C_0"})

(def QuantumMechanics
  "QuantumMechanics"
  {:db/ident         :discipline/QuantumMechanics,
   :qudt/relevantQuantityKind "http://qudt.org/vocab/quantitykind/Action",
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
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/Exposure"
    "http://qudt.org/vocab/quantitykind/DoseEquivalent"
    "http://qudt.org/vocab/quantitykind/AbsorbedDoseRate"
    "http://qudt.org/vocab/quantitykind/AbsorbedDose"],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Radiology"},
   :skos/broader     :discipline/Physics})

(def Radiometry
  "Radiometry"
  {:db/ident         :discipline/Radiometry,
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/VisibleRadiantEnergy"
    "http://qudt.org/vocab/quantitykind/RadianceFactor"
    "http://qudt.org/vocab/quantitykind/Irradiance"
    "http://qudt.org/vocab/quantitykind/Emissivity"
    "http://qudt.org/vocab/quantitykind/EinsteinTransitionProbability"
    "http://qudt.org/vocab/quantitykind/Radiance"
    "http://qudt.org/vocab/quantitykind/LinearAbsorptionCoefficient"
    "http://qudt.org/vocab/quantitykind/RadiantEnergy"
    "http://qudt.org/vocab/quantitykind/RadiantFluenceRate"
    "http://qudt.org/vocab/quantitykind/RadiantFlux"
    "http://qudt.org/vocab/quantitykind/Absorptance"
    "http://qudt.org/vocab/quantitykind/RadiantFluence"
    "http://qudt.org/vocab/quantitykind/Refectance"
    "http://qudt.org/vocab/quantitykind/MassAttenuationCoefficient"
    "http://qudt.org/vocab/quantitykind/RadiantExposure"
    "http://qudt.org/vocab/quantitykind/SpectralLuminousEfficiency"
    "http://qudt.org/vocab/quantitykind/RadiantIntensity"
    "http://qudt.org/vocab/quantitykind/MassAbsorptionCoefficient"
    "http://qudt.org/vocab/quantitykind/RadiantEmmitance"
    "http://qudt.org/vocab/quantitykind/LinearAttenuationCoefficient"
    "http://qudt.org/vocab/quantitykind/ReflectanceFactor"
    "http://qudt.org/vocab/quantitykind/Transmittance"
    "http://qudt.org/vocab/quantitykind/Radiosity"
    "http://qudt.org/vocab/quantitykind/MolarAbsorptionCoefficient"
    "http://qudt.org/vocab/quantitykind/NapierianAbsorbance"
    "http://qudt.org/vocab/quantitykind/TransmittanceDensity"
    "http://qudt.org/vocab/quantitykind/RadiantEnergyDensity"],
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
   ["http://qudt.org/vocab/quantitykind/MobilityRatio"
    "http://qudt.org/vocab/quantitykind/HoleDensity"
    "http://qudt.org/vocab/quantitykind/DonorIonizationEnergy"
    "http://qudt.org/vocab/quantitykind/DebyeAngularWavenumber"
    "http://qudt.org/vocab/quantitykind/Long-RangeOrderParameter"
    "http://qudt.org/vocab/quantitykind/DisplacementVectorOfIon"
    "http://qudt.org/vocab/quantitykind/RelaxationTIme"
    "http://qudt.org/vocab/quantitykind/LatticeVector"
    "http://qudt.org/vocab/quantitykind/ElectronDensity"
    "http://qudt.org/vocab/quantitykind/FermiEnergy"
    "http://qudt.org/vocab/quantitykind/GapEnergy"
    "http://qudt.org/vocab/quantitykind/FermiAngularWavenumber"
    "http://qudt.org/vocab/quantitykind/ExchangeIntegral"
    "http://qudt.org/vocab/quantitykind/AngularReciprocalLatticeVector"
    "http://qudt.org/vocab/quantitykind/StructureFactor"
    "http://qudt.org/vocab/quantitykind/UpperCriticalMagneticFluxDensity"
    "http://qudt.org/vocab/quantitykind/SourceVoltageBetweenSubstances"
    "http://qudt.org/vocab/quantitykind/GruneisenParameter"
    "http://qudt.org/vocab/quantitykind/EffectiveMass"
    "http://qudt.org/vocab/quantitykind/ElectronAffinity"
    "http://qudt.org/vocab/quantitykind/EnergyDensityOfStates"
    "http://qudt.org/vocab/quantitykind/LorenzCoefficient"
    "http://qudt.org/vocab/quantitykind/CurieTemperature"
    "http://qudt.org/vocab/quantitykind/SuperconductionTransitionTemperature"
    "http://qudt.org/vocab/quantitykind/WorkFunction"
    "http://qudt.org/vocab/quantitykind/SolidStateDiffusionLength"
    "http://qudt.org/vocab/quantitykind/AcceptorIonizationEnergy"
    "http://qudt.org/vocab/quantitykind/PeltierCoefficient"
    "http://qudt.org/vocab/quantitykind/Debye-WallerFactor"
    "http://qudt.org/vocab/quantitykind/LowerCriticalMagneticFluxDensity"
    "http://qudt.org/vocab/quantitykind/LondonPenetrationDepth"
    "http://qudt.org/vocab/quantitykind/FermiTemperature"
    "http://qudt.org/vocab/quantitykind/OrderOfReflection"
    "http://qudt.org/vocab/quantitykind/BraggAngle"
    "http://qudt.org/vocab/quantitykind/RichardsonConstant"
    "http://qudt.org/vocab/quantitykind/CarrierLifetime"
    "http://qudt.org/vocab/quantitykind/CoherenceLength"
    "http://qudt.org/vocab/quantitykind/PhononMeanFreePath"
    "http://qudt.org/vocab/quantitykind/SuperconductorEnergyGap"
    "http://qudt.org/vocab/quantitykind/BurgersVector"
    "http://qudt.org/vocab/quantitykind/ElectronMeanFreePath"
    "http://qudt.org/vocab/quantitykind/DebyeAngularFrequency"
    "http://qudt.org/vocab/quantitykind/EquilibriumPositionVectorOfIon"
    "http://qudt.org/vocab/quantitykind/MadelungConstant"
    "http://qudt.org/vocab/quantitykind/DonorDensity"
    "http://qudt.org/vocab/quantitykind/AtomScatteringFactor"
    "http://qudt.org/vocab/quantitykind/DebyeTemperature"
    "http://qudt.org/vocab/quantitykind/FundamentalReciprocalLatticeVector"
    "http://qudt.org/vocab/quantitykind/IntinsicCarrierDensity"
    "http://qudt.org/vocab/quantitykind/ResidualResistivity"
    "http://qudt.org/vocab/quantitykind/IonizationEnergy"
    "http://qudt.org/vocab/quantitykind/ThermodynamicCriticalMagneticFluxDensity"
    "http://qudt.org/vocab/quantitykind/Landau-GinzburgNumber"
    "http://qudt.org/vocab/quantitykind/ThomsonCoefficient"
    "http://qudt.org/vocab/quantitykind/NeelTemperature"
    "http://qudt.org/vocab/quantitykind/EnergyLevel"
    "http://qudt.org/vocab/quantitykind/DensityOfStates"
    "http://qudt.org/vocab/quantitykind/AcceptorDensity"
    "http://qudt.org/vocab/quantitykind/JosephsonConstant"
    "http://qudt.org/vocab/quantitykind/ParticlePositionVector"
    "http://qudt.org/vocab/quantitykind/HallCoefficient"
    "http://qudt.org/vocab/quantitykind/SeebeckCoefficient"
    "http://qudt.org/vocab/quantitykind/MagneticFluxQuantum"
    "http://qudt.org/vocab/quantitykind/Short-RangeOrderParameter"
    "http://qudt.org/vocab/quantitykind/LatticePlaneSpacing"
    "http://qudt.org/vocab/quantitykind/FundamentalLatticeVector"
    "http://qudt.org/vocab/quantitykind/AngularWavenumber"],
   :rdf/type         :qudt/Discipline,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/discipline",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "SolidStatePhysics"},
   :skos/broader     :discipline/Physics})

(def SpaceAndTime
  "SpaceAndTime"
  {:db/ident         :discipline/SpaceAndTime,
   :qudt/relevantQuantityKind
   ["http://qudt.org/vocab/quantitykind/RadiusOfCurvature"
    "http://qudt.org/vocab/quantitykind/CrossSectionalArea"
    "http://qudt.org/vocab/quantitykind/VolumePerUnitTime"
    "http://qudt.org/vocab/quantitykind/Frequency"
    "http://qudt.org/vocab/quantitykind/Length"
    "http://qudt.org/vocab/quantitykind/Speed"
    "http://qudt.org/vocab/quantitykind/Thickness"
    "http://qudt.org/vocab/quantitykind/InverseVolume"
    "http://qudt.org/vocab/quantitykind/Radius"
    "http://qudt.org/vocab/quantitykind/DryVolume"
    "http://qudt.org/vocab/quantitykind/AreaAngle"
    "http://qudt.org/vocab/quantitykind/StochasticProcess"
    "http://qudt.org/vocab/quantitykind/Altitude"
    "http://qudt.org/vocab/quantitykind/Breadth"
    "http://qudt.org/vocab/quantitykind/NumberDensity"
    "http://qudt.org/vocab/quantitykind/Distance"
    "http://qudt.org/vocab/quantitykind/PositionVector"
    "http://qudt.org/vocab/quantitykind/RadialDistance"
    "http://qudt.org/vocab/quantitykind/Angle"
    "http://qudt.org/vocab/quantitykind/PathLength"
    "http://qudt.org/vocab/quantitykind/Time"
    "http://qudt.org/vocab/quantitykind/AngularFrequency"
    "http://qudt.org/vocab/quantitykind/MachNumber"
    "http://qudt.org/vocab/quantitykind/AngularVelocity"
    "http://qudt.org/vocab/quantitykind/Volume"
    "http://qudt.org/vocab/quantitykind/SolidAngle"
    "http://qudt.org/vocab/quantitykind/PlaneAngle"
    "http://qudt.org/vocab/quantitykind/Acceleration"
    "http://qudt.org/vocab/quantitykind/TimeSquared"
    "http://qudt.org/vocab/quantitykind/LinearAcceleration"
    "http://qudt.org/vocab/quantitykind/Diameter"
    "http://qudt.org/vocab/quantitykind/LinearVelocity"
    "http://qudt.org/vocab/quantitykind/AngularAcceleration"
    "http://qudt.org/vocab/quantitykind/CurvatureFromRadius"
    "http://qudt.org/vocab/quantitykind/AreaPerTime"
    "http://qudt.org/vocab/quantitykind/Velocity"
    "http://qudt.org/vocab/quantitykind/LiquidVolume"
    "http://qudt.org/vocab/quantitykind/InverseLength"
    "http://qudt.org/vocab/quantitykind/AccelerationOfGravity"
    "http://qudt.org/vocab/quantitykind/CartesianVolume"
    "http://qudt.org/vocab/quantitykind/Height"
    "http://qudt.org/vocab/quantitykind/Curvature"
    "http://qudt.org/vocab/quantitykind/CartesianCoordinates"
    "http://qudt.org/vocab/quantitykind/AreaTime"
    "http://qudt.org/vocab/quantitykind/Displacement"
    "http://qudt.org/vocab/quantitykind/CartesianArea"
    "http://qudt.org/vocab/quantitykind/Area"],
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
   :qudt/relevantQuantityKind
   "http://qudt.org/vocab/quantitykind/AngularWavenumber",
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
   ["http://qudt.org/vocab/quantitykind/RadiusOfCurvature"
    "http://qudt.org/vocab/quantitykind/CurvatureFromRadius"
    "http://qudt.org/vocab/quantitykind/ConvectiveHeatTransfer"
    "http://qudt.org/vocab/quantitykind/EvaporativeHeatTransfer"
    "http://qudt.org/vocab/quantitykind/PositionVector"
    "http://qudt.org/vocab/quantitykind/VisionThreshods"
    "http://qudt.org/vocab/quantitykind/Displacement"
    "http://qudt.org/vocab/quantitykind/AuditoryThresholds"
    "http://qudt.org/vocab/quantitykind/RadiativeHeatTransfer"
    "http://qudt.org/vocab/quantitykind/SoundPressure"
    "http://qudt.org/vocab/quantitykind/WarmReceptorThreshold"
    "http://qudt.org/vocab/quantitykind/Radius"
    "http://qudt.org/vocab/quantitykind/CartesianCoordinates"
    "http://qudt.org/vocab/quantitykind/ActivityThresholds"
    "http://qudt.org/vocab/quantitykind/SoundPower"
    "http://qudt.org/vocab/quantitykind/RadialDistance"
    "http://qudt.org/vocab/quantitykind/CartesianVolume"
    "http://qudt.org/vocab/quantitykind/Adaptation"
    "http://qudt.org/vocab/quantitykind/ColdReceptorThreshold"
    "http://qudt.org/vocab/quantitykind/Diameter"
    "http://qudt.org/vocab/quantitykind/PathLength"
    "http://qudt.org/vocab/quantitykind/CombinedNonEvaporativeHeatTransferCoefficient"
    "http://qudt.org/vocab/quantitykind/Distance"
    "http://qudt.org/vocab/quantitykind/PhotoThresholdOfAwarenessFunction"
    "http://qudt.org/vocab/quantitykind/TouchThresholds"
    "http://qudt.org/vocab/quantitykind/GustatoryThreshold"
    "http://qudt.org/vocab/quantitykind/Thickness"
    "http://qudt.org/vocab/quantitykind/ConductiveHeatTransferRate"
    "http://qudt.org/vocab/quantitykind/Height"
    "http://qudt.org/vocab/quantitykind/TemporalSummationFunction"
    "http://qudt.org/vocab/quantitykind/AcousticImpedance"
    "http://qudt.org/vocab/quantitykind/SpatialSummationFunction"
    "http://qudt.org/vocab/quantitykind/EvaporativeHeatTransferCoefficient"
    "http://qudt.org/vocab/quantitykind/ConductionSpeed"
    "http://qudt.org/vocab/quantitykind/Breadth"
    "http://qudt.org/vocab/quantitykind/OlfactoryThreshold"
    "http://qudt.org/vocab/quantitykind/MassicActivity"
    "http://qudt.org/vocab/quantitykind/LuminousEmmitance"
    "http://qudt.org/vocab/quantitykind/CartesianArea"],
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
   ["http://qudt.org/vocab/quantitykind/EnergyPerTemperature"
    "http://qudt.org/vocab/quantitykind/CubicExpansionCoefficient"
    "http://qudt.org/vocab/quantitykind/MassRatioOfWaterToDryMatter"
    "http://qudt.org/vocab/quantitykind/ThermodynamicEnergy"
    "http://qudt.org/vocab/quantitykind/MolarHeatCapacity"
    "http://qudt.org/vocab/quantitykind/RelativeHumidity"
    "http://qudt.org/vocab/quantitykind/CelsiusTemperature"
    "http://qudt.org/vocab/quantitykind/PlanckFunction"
    "http://qudt.org/vocab/quantitykind/Energy"
    "http://qudt.org/vocab/quantitykind/Enthalpy"
    "http://qudt.org/vocab/quantitykind/ThermodynamicTemperature"
    "http://qudt.org/vocab/quantitykind/MassieuFunction"
    "http://qudt.org/vocab/quantitykind/SpecificInternalEnergy"
    "http://qudt.org/vocab/quantitykind/CompressibilityFactor"
    "http://qudt.org/vocab/quantitykind/Entropy"
    "http://qudt.org/vocab/quantitykind/MassConcentrationOfWaterVapour"
    "http://qudt.org/vocab/quantitykind/HeatFlowRate"
    "http://qudt.org/vocab/quantitykind/IsentropicExponent"
    "http://qudt.org/vocab/quantitykind/LengthTemperatureTime"
    "http://qudt.org/vocab/quantitykind/RelativePartialPressure"
    "http://qudt.org/vocab/quantitykind/ThermalConductance"
    "http://qudt.org/vocab/quantitykind/Heat"
    "http://qudt.org/vocab/quantitykind/SpecificEnthalpy"
    "http://qudt.org/vocab/quantitykind/PressureCoefficient"
    "http://qudt.org/vocab/quantitykind/ThermodynamicEntropy"
    "http://qudt.org/vocab/quantitykind/SpecificEntropy"
    "http://qudt.org/vocab/quantitykind/ThermalInsulance"
    "http://qudt.org/vocab/quantitykind/TemperaturePerTime"
    "http://qudt.org/vocab/quantitykind/SpecificGibbsEnergy"
    "http://qudt.org/vocab/quantitykind/AreaTemperature"
    "http://qudt.org/vocab/quantitykind/InverseLengthTemperature"
    "http://qudt.org/vocab/quantitykind/ThermalDiffusivity"
    "http://qudt.org/vocab/quantitykind/RelativeMassRatioOfVapour"
    "http://qudt.org/vocab/quantitykind/SpecificHelmholtzEnergy"
    "http://qudt.org/vocab/quantitykind/LengthTemperature"
    "http://qudt.org/vocab/quantitykind/MassFractionOfWater"
    "http://qudt.org/vocab/quantitykind/PowerPerAreaQuarticTemperature"
    "http://qudt.org/vocab/quantitykind/MassRatioOfWaterVapourToDryGas"
    "http://qudt.org/vocab/quantitykind/RelativePressureCoefficient"
    "http://qudt.org/vocab/quantitykind/ThermalEnergy"
    "http://qudt.org/vocab/quantitykind/HeatCapacity"
    "http://qudt.org/vocab/quantitykind/SpecificHeatCapacity"
    "http://qudt.org/vocab/quantitykind/CoefficientOfHeatTransfer"
    "http://qudt.org/vocab/quantitykind/InternalEnergy"
    "http://qudt.org/vocab/quantitykind/SpecificEnergy"
    "http://qudt.org/vocab/quantitykind/ThermalResistivity"
    "http://qudt.org/vocab/quantitykind/RatioOfSpecificHeatCapacities"
    "http://qudt.org/vocab/quantitykind/VolumetricHeatCapacity"
    "http://qudt.org/vocab/quantitykind/AreaTimeTemperature"
    "http://qudt.org/vocab/quantitykind/SpecificHeatCapacityAtConstantVolume"
    "http://qudt.org/vocab/quantitykind/ThermalEfficiency"
    "http://qudt.org/vocab/quantitykind/RelativeMassConcentrationOfVapour"
    "http://qudt.org/vocab/quantitykind/TemperaturePerMagneticFluxDensity"
    "http://qudt.org/vocab/quantitykind/SpecificHeatCapacityAtConstantPressure"
    "http://qudt.org/vocab/quantitykind/HeatCapacityRatio"
    "http://qudt.org/vocab/quantitykind/TimeTemperature"
    "http://qudt.org/vocab/quantitykind/ThermalEnergyLength"
    "http://qudt.org/vocab/quantitykind/ThermalConductivity"
    "http://qudt.org/vocab/quantitykind/GibbsEnergy"
    "http://qudt.org/vocab/quantitykind/AreaThermalExpansion"
    "http://qudt.org/vocab/quantitykind/HelmholtzEnergy"
    "http://qudt.org/vocab/quantitykind/HeatFlowRatePerUnitArea"
    "http://qudt.org/vocab/quantitykind/SpecificHeatPressure"
    "http://qudt.org/vocab/quantitykind/SpecificHeatVolume"
    "http://qudt.org/vocab/quantitykind/SpecificHeatCapacityAtSaturation"
    "http://qudt.org/vocab/quantitykind/IsentropicCompressibility"
    "http://qudt.org/vocab/quantitykind/InverseTimeTemperature"
    "http://qudt.org/vocab/quantitykind/VolumeThermalExpansion"
    "http://qudt.org/vocab/quantitykind/MassFractionOfDryMatter"
    "http://qudt.org/vocab/quantitykind/LinearExpansionCoefficient"
    "http://qudt.org/vocab/quantitykind/LinearThermalExpansion"
    "http://qudt.org/vocab/quantitykind/DewPointTemperature"
    "http://qudt.org/vocab/quantitykind/MassTemperature"
    "http://qudt.org/vocab/quantitykind/SurfaceCoefficientOfHeatTransfer"
    "http://qudt.org/vocab/quantitykind/AreicHeatFlowRate"
    "http://qudt.org/vocab/quantitykind/ThermalResistance"
    "http://qudt.org/vocab/quantitykind/MassConcentrationOfWater"
    "http://qudt.org/vocab/quantitykind/IsothermalCompressibility"
    "http://qudt.org/vocab/quantitykind/AbsoluteHumidity"],
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