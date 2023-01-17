(ns net.wikipunk.rdf.soqk
  "http://qudt.org/2.1/vocab/soqk/"
  {:dcat/downloadURL  "https://qudt.org/2.1/vocab/soqk.ttl",
   :owl/imports       ["http://qudt.org/2.1/vocab/sou"
                       "http://qudt.org/2.1/vocab/quantitykind"
                       "http://qudt.org/2.1/schema/facade/qudt"],
   :owl/versionInfo   "Created with TopBraid Composer",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/elements/1.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "quantitykind" "http://qudt.org/vocab/quantitykind/",
                       "qudt" "http://qudt.org/schema/qudt/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "soqk" "http://qudt.org/vocab/soqk/",
                       "sou" "http://qudt.org/vocab/sou/",
                       "unit" "http://qudt.org/vocab/unit/",
                       "vaem" "http://www.linkedmodel.org/schema/vaem#",
                       "voag" "http://voag.linkedmodel.org/schema/voag#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :owl/Ontology,
   :rdf/uri           "http://qudt.org/2.1/vocab/soqk",
   :rdfa/prefix       "soqk",
   :rdfa/uri          "http://qudt.org/2.1/vocab/soqk/",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-SOQK})

(def CGS
  "CGS System of Quantity Kinds"
  {:db/ident :soqk/CGS,
   :qudt/hasBaseQuantityKind [:quantitykind/Mass
                              :quantitykind/Length
                              :quantitykind/Dimensionless
                              :quantitykind/Time],
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/hasUnitSystem :sou/CGS,
   :qudt/systemDerivedQuantityKind [:quantitykind/Frequency
                                    :quantitykind/Stress
                                    :quantitykind/AreaTime
                                    :quantitykind/MassPerLength
                                    :quantitykind/AngularAcceleration
                                    :quantitykind/Area
                                    :quantitykind/PowerPerAreaAngle
                                    :quantitykind/DynamicViscosity
                                    :quantitykind/Power
                                    :quantitykind/Torque
                                    :quantitykind/MomentOfInertia
                                    :quantitykind/Pressure
                                    :quantitykind/AngularMomentum
                                    :quantitykind/Energy
                                    :quantitykind/ForcePerArea
                                    :quantitykind/ForcePerLength
                                    :quantitykind/LinearMomentum
                                    :quantitykind/LinearVelocity
                                    :quantitykind/VolumePerUnitTime
                                    :quantitykind/LengthMass
                                    :quantitykind/Volume
                                    :quantitykind/Density
                                    :quantitykind/SpecificEnergy
                                    :quantitykind/EnergyDensity
                                    :quantitykind/MassPerArea
                                    :quantitykind/Curvature
                                    :quantitykind/Force
                                    :quantitykind/RadiantIntensity
                                    :quantitykind/PowerPerArea
                                    :quantitykind/AreaAngle
                                    :quantitykind/LinearAcceleration
                                    :quantitykind/MassPerTime
                                    :quantitykind/EnergyPerArea
                                    :quantitykind/TimeSquared
                                    :quantitykind/AngularVelocity],
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/soqk",
   :rdfs/label "CGS System of Quantity Kinds"})

(def CGS-EMU
  "The electromagnetic system of units is used to measure electrical quantities of electric charge, current, and voltage, within the centimeter gram second (or \"CGS\") metric system of units. In electromagnetic units, electric current is derived the CGS base units length, mass, and time by solving Ampere's Law (expressing the force between two parallel conducting wires) for current and setting the constant of proportionality (k_m) equal to unity. Thus, in the CGS-EMU system, electric current is derived from length, mass, and time."
  {:db/ident :soqk/CGS-EMU,
   :dcterms/description
   "The electromagnetic system of units is used to measure electrical quantities of electric charge, current, and voltage, within the centimeter gram second (or \"CGS\") metric system of units. In electromagnetic units, electric current is derived the CGS base units length, mass, and time by solving Ampere's Law (expressing the force between two parallel conducting wires) for current and setting the constant of proportionality (k_m) equal to unity. Thus, in the CGS-EMU system, electric current is derived from length, mass, and time.",
   :qudt/hasBaseQuantityKind [:quantitykind/Time
                              :quantitykind/Dimensionless
                              :quantitykind/Mass
                              :quantitykind/Length],
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/hasUnitSystem :sou/CGS-EMU,
   :qudt/systemDerivedQuantityKind [:quantitykind/ElectromotiveForce
                                    :quantitykind/ElectricCurrentDensity
                                    :quantitykind/LengthPerUnitElectricCurrent
                                    :quantitykind/MagneticDipoleMoment
                                    :quantitykind/ElectricCharge
                                    :quantitykind/MagneticFluxPerUnitLength
                                    :quantitykind/MagneticFlux
                                    :quantitykind/MagnetizationField
                                    :quantitykind/AuxillaryMagneticField
                                    :quantitykind/Inductance
                                    :quantitykind/EnergyPerElectricCharge
                                    :quantitykind/Permeability
                                    :quantitykind/ElectricCurrentPerUnitLength
                                    :quantitykind/ElectricDipoleMoment
                                    :quantitykind/ElectricField
                                    :quantitykind/ElectricDisplacementField
                                    :quantitykind/ElectricPotential
                                    :quantitykind/ElectricCurrent
                                    :quantitykind/ElectricFlux
                                    :quantitykind/Permittivity
                                    :quantitykind/Capacitance
                                    :quantitykind/MagneticField
                                    :quantitykind/MagnetomotiveForce
                                    :quantitykind/Resistance
                                    :quantitykind/ElectricConductivity],
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/soqk",
   :rdfs/label "CGS-EMU System of Quantity Kinds"})

(def CGS-ESU
  "The electrostatic system of units is used to measure electrical quantities of electric charge, current, and voltage within the centimeter gram second (or \"CGS\") metric system of units. In electrostatic units, electric charge is derived from Coulomb's Law (expressing the force exerted between two charged particles separated by a distance) by solving for electric charge and setting the constant of proportionality (k_s) equal to unity. Thus, in electrostatic units, the dimensionality of electric charge is derived from the base CGS quantities of length, mass, and time."
  {:db/ident :soqk/CGS-ESU,
   :dcterms/description
   "The electrostatic system of units is used to measure electrical quantities of electric charge, current, and voltage within the centimeter gram second (or \"CGS\") metric system of units. In electrostatic units, electric charge is derived from Coulomb's Law (expressing the force exerted between two charged particles separated by a distance) by solving for electric charge and setting the constant of proportionality (k_s) equal to unity. Thus, in electrostatic units, the dimensionality of electric charge is derived from the base CGS quantities of length, mass, and time.",
   :qudt/hasBaseQuantityKind [:quantitykind/Time
                              :quantitykind/Length
                              :quantitykind/Dimensionless
                              :quantitykind/Mass],
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/hasUnitSystem :sou/CGS-ESU,
   :qudt/systemDerivedQuantityKind [:quantitykind/LengthPerUnitElectricCurrent
                                    :quantitykind/Inductance
                                    :quantitykind/ElectromotiveForce
                                    :quantitykind/MagneticField
                                    :quantitykind/ElectricPotential
                                    :quantitykind/Permittivity
                                    :quantitykind/MagneticFlux
                                    :quantitykind/EnergyPerElectricCharge
                                    :quantitykind/ElectricCurrentDensity
                                    :quantitykind/ElectricDipoleMoment
                                    :quantitykind/ElectricCurrentPerUnitLength
                                    :quantitykind/ElectricFlux
                                    :quantitykind/Permeability
                                    :quantitykind/MagnetizationField
                                    :quantitykind/MagneticDipoleMoment
                                    :quantitykind/ElectricField
                                    :quantitykind/ElectricCurrent
                                    :quantitykind/AuxillaryMagneticField
                                    :quantitykind/MagneticFluxPerUnitLength
                                    :quantitykind/MagnetomotiveForce
                                    :quantitykind/ElectricDisplacementField
                                    :quantitykind/ElectricCharge
                                    :quantitykind/Resistance
                                    :quantitykind/Capacitance],
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/soqk",
   :rdfs/label "CGS-ESU System of Quantity Kinds"})

(def CGS-Gauss
  "CGS-Gauss System of Quantity Kinds"
  {:db/ident :soqk/CGS-Gauss,
   :qudt/hasBaseQuantityKind [:quantitykind/Length
                              :quantitykind/Time
                              :quantitykind/Mass
                              :quantitykind/Dimensionless],
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/hasUnitSystem :sou/CGS-GAUSS,
   :qudt/systemDerivedQuantityKind [:quantitykind/MagneticField
                                    :quantitykind/MagneticDipoleMoment
                                    :quantitykind/ElectricCurrentDensity
                                    :quantitykind/ElectricField
                                    :quantitykind/MagnetizationField
                                    :quantitykind/LengthPerUnitElectricCurrent
                                    :quantitykind/EnergyPerElectricCharge
                                    :quantitykind/ElectricCurrentPerUnitLength
                                    :quantitykind/Resistance
                                    :quantitykind/Permittivity
                                    :quantitykind/AuxillaryMagneticField
                                    :quantitykind/ElectromotiveForce
                                    :quantitykind/MagneticFlux
                                    :quantitykind/Inductance
                                    :quantitykind/Permeability
                                    :quantitykind/ElectricDisplacementField
                                    :quantitykind/ElectricCurrent
                                    :quantitykind/MagneticFluxPerUnitLength
                                    :quantitykind/Capacitance
                                    :quantitykind/ElectricPotential
                                    :quantitykind/ElectricCharge
                                    :quantitykind/ElectricDipoleMoment
                                    :quantitykind/ElectricFlux],
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/soqk",
   :rdfs/label "CGS-Gauss System of Quantity Kinds"})

(def IMPERIAL
  "Imperial System of Quantity Kinds"
  {:db/ident         :soqk/IMPERIAL,
   :qudt/hasQuantityKind [:quantitykind/Power
                          :quantitykind/AngularVelocity
                          :quantitykind/ThermalInsulance
                          :quantitykind/MassPerTime
                          :quantitykind/AreaTime
                          :quantitykind/ThermalConductivity
                          :quantitykind/EnergyPerArea
                          :quantitykind/ThermalDiffusivity
                          :quantitykind/ForcePerArea
                          :quantitykind/Length
                          :quantitykind/CoefficientOfHeatTransfer
                          :quantitykind/ThermalEnergy
                          :quantitykind/ThrustToMassRatio
                          :quantitykind/Energy
                          :quantitykind/AngularAcceleration
                          :quantitykind/MassTemperature
                          :quantitykind/Force
                          :quantitykind/MassPerLength
                          :quantitykind/LiquidVolume
                          :quantitykind/SpecificHeatCapacity
                          :quantitykind/ThermalResistance
                          :quantitykind/ForcePerLength
                          :quantitykind/Torque
                          :quantitykind/DynamicViscosity
                          :quantitykind/HeatCapacity
                          :quantitykind/Time
                          :quantitykind/HeatFlowRate
                          :quantitykind/MolarHeatCapacity
                          :quantitykind/SpecificEnergy
                          :quantitykind/ThermodynamicTemperature
                          :quantitykind/KinematicViscosity
                          :quantitykind/Density
                          :quantitykind/Volume
                          :quantitykind/Area
                          :quantitykind/PowerPerArea
                          :quantitykind/AreaTemperature
                          :quantitykind/Mass
                          :quantitykind/MassPerArea
                          :quantitykind/LinearAcceleration
                          :quantitykind/LinearVelocity
                          :quantitykind/AreaTimeTemperature
                          :quantitykind/ThermalResistivity
                          :quantitykind/VolumePerUnitTime
                          :quantitykind/ThermalEnergyLength],
   :rdf/type         :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/soqk",
   :rdfs/label       "Imperial System of Quantity Kinds"})

(def ISQ
  "The ISO 80000 standards were prepared by Technical Committee ISO/TC 12, Quantities and units in co-operation with IEC/TC 25, Quantities and units."
  {:db/ident :soqk/ISQ,
   :dcterms/description
   "The ISO 80000 standards were prepared by Technical Committee ISO/TC 12, Quantities and units in co-operation with IEC/TC 25, Quantities and units.",
   :qudt/hasBaseQuantityKind [:quantitykind/LuminousIntensity
                              :quantitykind/Time
                              :quantitykind/Mass
                              :quantitykind/Length
                              :quantitykind/ElectricCurrent
                              :quantitykind/AmountOfSubstance
                              :quantitykind/ThermodynamicTemperature],
   :qudt/hasQuantityKind
   [:quantitykind/ColdReceptorThreshold
    :quantitykind/SecondAxialMomentOfArea
    :quantitykind/LeakageFactor
    :quantitykind/PolarMomentOfInertia
    :quantitykind/WarmReceptorThreshold
    :quantitykind/Refectance
    :quantitykind/Voltage
    :quantitykind/SecondPolarMomentOfArea
    :quantitykind/ElectricCurrentPhasor
    :quantitykind/Momentum
    :quantitykind/Action
    :quantitykind/ElectricCharge
    :quantitykind/InverseSquareEnergy
    :quantitykind/MagneticMoment
    :quantitykind/DynamicFriction
    :quantitykind/ScalarMagneticPotential
    :quantitykind/Reflectance
    :quantitykind/InverseEnergy
    :quantitykind/Impedance
    :quantitykind/MolarAngularMomentum
    :quantitykind/HeatFlowRatePerUnitArea
    :quantitykind/LuminousEmmitance
    :quantitykind/ElectricPotential
    :quantitykind/ThrustToMassRatio
    :quantitykind/ElectricChargeSurfaceDensity
    :quantitykind/SpecificHeatCapacityAtSaturation
    :quantitykind/MassieuFunction
    :quantitykind/Transmittance
    :quantitykind/LinearMomentum
    :quantitykind/MagneticFluxDensity
    :quantitykind/Work
    :quantitykind/Weight
    :quantitykind/SoundReductionIndex
    :quantitykind/SoundPower
    :quantitykind/EvaporativeHeatTransferCoefficient
    :quantitykind/MassConcentrationOfWaterVapour
    :quantitykind/Reactance
    :quantitykind/ElectricDisplacement
    :quantitykind/ElectricChargeDensity
    :quantitykind/HeatCapacity
    :quantitykind/NonActivePower
    :quantitykind/MagnetomotiveForce
    :quantitykind/Conductance
    :quantitykind/LinearExpansionCoefficient
    :quantitykind/ElectromagneticWavePhaseSpeed
    :quantitykind/BulkModulus
    :quantitykind/InstantaneousPower
    :quantitykind/EinsteinTransitionProbability
    :quantitykind/MechanicalEnergy
    :quantitykind/MassicActivity
    :quantitykind/SquareEnergy
    :quantitykind/DisplacementCurrent
    :quantitykind/NormalStress
    :quantitykind/LagrangeFunction
    :quantitykind/PowerFactor
    :quantitykind/VolumeFlowRate
    :quantitykind/LinearAttenuationCoefficient
    :quantitykind/Radiosity
    :quantitykind/DewPointTemperature
    :quantitykind/CurrentLinkage
    :quantitykind/PowerPerAreaAngle
    :quantitykind/MutualInductance
    :quantitykind/SpecificEntropy
    :quantitykind/SpectralLuminousEfficiency
    :quantitykind/ElectricCurrent
    :quantitykind/HeatFlowRate
    :quantitykind/PlanckFunction
    :quantitykind/Torque
    :quantitykind/RelativePressureCoefficient
    :quantitykind/Radius
    :quantitykind/Conductivity
    :quantitykind/Magnetization
    :quantitykind/ApparentPower
    :quantitykind/ShearModulus
    :quantitykind/Susceptance
    :quantitykind/Force
    :quantitykind/ConvectiveHeatTransfer
    :quantitykind/ThermalConductance
    :quantitykind/SoundPressureLevel
    :quantitykind/HelmholtzEnergy
    :quantitykind/SoundParticleAcceleration
    :quantitykind/PhaseDifference
    :quantitykind/MassPerArea
    :quantitykind/EvaporativeHeatTransfer
    :quantitykind/SoundEnergyDensity
    :quantitykind/RelativeMassRatioOfVapour
    :quantitykind/RadiantFlux
    :quantitykind/MagneticPolarization
    :quantitykind/ElectricFieldStrength
    :quantitykind/MassRatioOfWaterToDryMatter
    :quantitykind/IsothermalCompressibility
    :quantitykind/SoundParticleVelocity
    :quantitykind/SourceVoltage
    :quantitykind/MassConcentrationOfWater
    :quantitykind/RelativeHumidity
    :quantitykind/StandardGravitationalParameter
    :quantitykind/PhotoThresholdOfAwarenessFunction
    :quantitykind/Efficiency
    :quantitykind/MassAbsorptionCoefficient
    :quantitykind/CompressibilityFactor
    :quantitykind/ModulusOfElasticity
    :quantitykind/SectionModulus
    :quantitykind/Thickness
    :quantitykind/PermittivityRatio
    :quantitykind/LogarithmicFrequencyInterval
    :quantitykind/SpeedOfSound
    :quantitykind/SpecificEnergy
    :quantitykind/MassAttenuationCoefficient
    :quantitykind/MagneticVectorPotential
    :quantitykind/ReactivePower
    :quantitykind/Coercivity
    :quantitykind/Permeance
    :quantitykind/NapierianAbsorbance
    :quantitykind/Radiance
    :quantitykind/VoltagePhasor
    :quantitykind/RadiantIntensity
    :quantitykind/HeatCapacityRatio
    :quantitykind/SpeedOfLight
    :quantitykind/RefractiveIndex
    :quantitykind/LinearAbsorptionCoefficient
    :quantitykind/SpecificHelmholtzEnergy
    :quantitykind/TransmittanceDensity
    :quantitykind/MassFractionOfDryMatter
    :quantitykind/Capacitance
    :quantitykind/PowerArea
    :quantitykind/Permeability
    :quantitykind/VolumeStrain
    :quantitykind/AcousticImpedance
    :quantitykind/MechanicalSurfaceImpedance
    :quantitykind/SpecificImpulseByWeight
    :quantitykind/Power
    :quantitykind/Entropy
    :quantitykind/Adaptation
    :quantitykind/ThermalResistance
    :quantitykind/DisplacementCurrentDensity
    :quantitykind/Pressure
    :quantitykind/SoundExposureLevel
    :quantitykind/PoissonRatio
    :quantitykind/MassFlowRate
    :quantitykind/SpecificHeatCapacity
    :quantitykind/ThermalInsulance
    :quantitykind/LinearElectricCurrentDensity
    :quantitykind/ThermalDiffusivity
    :quantitykind/RelativeMassConcentrationOfVapour
    :quantitykind/AngularImpulse
    :quantitykind/RadiusOfCurvature
    :quantitykind/Compressibility
    :quantitykind/LinearStrain
    :quantitykind/PositionVector
    :quantitykind/ElectricFluxDensity
    :quantitykind/SphericalIlluminance
    :quantitykind/PropagationCoefficient
    :quantitykind/GeneralizedMomentum
    :quantitykind/ModulusOfAdmittance
    :quantitykind/MomentOfInertia
    :quantitykind/Emissivity
    :quantitykind/Resistance
    :quantitykind/PowerAreaPerSolidAngle
    :quantitykind/CoefficientOfHeatTransfer
    :quantitykind/ActivePower
    :quantitykind/LossFactor
    :quantitykind/IsentropicExponent
    :quantitykind/ElectricCurrentDensity
    :quantitykind/SpecificEnthalpy
    :quantitykind/CubicExpansionCoefficient
    :quantitykind/MolarAbsorptionCoefficient
    :quantitykind/ConductiveHeatTransferRate
    :quantitykind/Energy
    :quantitykind/SpecificVolume
    :quantitykind/SpecificHeatCapacityAtConstantVolume
    :quantitykind/StaticFriction
    :quantitykind/ElectricDipoleMoment
    :quantitykind/LengthByForce
    :quantitykind/ConductionSpeed
    :quantitykind/MagneticAreaMoment
    :quantitykind/ModulusOfImpedance
    :quantitykind/Admittance
    :quantitykind/MassFractionOfWater
    :quantitykind/MassPerTime
    :quantitykind/ComplexPower
    :quantitykind/ActivityThresholds
    :quantitykind/CombinedNonEvaporativeHeatTransferCoefficient
    :quantitykind/Thrust
    :quantitykind/ThermodynamicEnergy
    :quantitykind/RadianceFactor
    :quantitykind/PathLength
    :quantitykind/ForcePerLength
    :quantitykind/Breadth
    :quantitykind/ElectricChargeLinearDensity
    :quantitykind/AngularFrequency
    :quantitykind/Displacement
    :quantitykind/ForcePerAreaTime
    :quantitykind/SpecificHeatCapacityAtConstantPressure
    :quantitykind/MagneticDipoleMoment
    :quantitykind/CouplingFactor
    :quantitykind/RatioOfSpecificHeatCapacities
    :quantitykind/Resistivity
    :quantitykind/ElectromagneticEnergyDensity
    :quantitykind/RadiativeHeatTransfer
    :quantitykind/ElectricFlux
    :quantitykind/GustatoryThreshold
    :quantitykind/MagneticSusceptability
    :quantitykind/SpecificGibbsEnergy
    :quantitykind/CartesianCoordinates
    :quantitykind/ElectricPolarization
    :quantitykind/PressureCoefficient
    :quantitykind/GeneralizedForce
    :quantitykind/MagneticFlux
    :quantitykind/AuditoryThresholds
    :quantitykind/ReflectanceFactor
    :quantitykind/ThermalConductivity
    :quantitykind/Diameter
    :quantitykind/PoyntingVector
    :quantitykind/SpecificImpulseByMass
    :quantitykind/BendingMomentOfForce
    :quantitykind/GeneralizedVelocity
    :quantitykind/ElectricSusceptibility
    :quantitykind/GibbsEnergy
    :quantitykind/SoundPowerLevel
    :quantitykind/Inductance
    :quantitykind/CelsiusTemperature
    :quantitykind/OlfactoryThreshold
    :quantitykind/IsentropicCompressibility
    :quantitykind/SoundExposure
    :quantitykind/TouchThresholds
    :quantitykind/HamiltonFunction
    :quantitykind/QualityFactor
    :quantitykind/GeneralizedCoordinate
    :quantitykind/Turns
    :quantitykind/MassPerLength
    :quantitykind/MagneticTension
    :quantitykind/ElectricPotentialDifference
    :quantitykind/TotalCurrent
    :quantitykind/ShearStrain
    :quantitykind/SoundVolumeVelocity
    :quantitykind/GravitationalAttraction
    :quantitykind/RadiantEnergyDensity
    :quantitykind/AngularWavenumber
    :quantitykind/PowerPerArea
    :quantitykind/VolumicElectromagneticEnergy
    :quantitykind/Reluctance
    :quantitykind/CurvatureFromRadius
    :quantitykind/LuminousIntensity
    :quantitykind/ElectricChargeVolumeDensity
    :quantitykind/MassRatioOfWaterVapourToDryGas
    :quantitykind/ShearStress
    :quantitykind/TotalCurrentDensity
    :quantitykind/Distance
    :quantitykind/RadiantFluence
    :quantitykind/PhaseSpeedOfSound
    :quantitykind/MassPerAreaTime
    :quantitykind/CartesianVolume
    :quantitykind/TemporalSummationFunction
    :quantitykind/VisionThreshods
    :quantitykind/EnergyDensity
    :quantitykind/Absorptance
    :quantitykind/Permittivity
    :quantitykind/SpecificInternalEnergy
    :quantitykind/RadialDistance
    :quantitykind/Friction
    :quantitykind/RelativePartialPressure
    :quantitykind/PhaseCoefficient],
   :qudt/informativeReference
   ["http://www.electropedia.org/iev/iev.nsf/display?openform&ievref=112-02-01"
    "http://www.iso.org/iso/home/store/catalogue_tc/catalogue_tc_browse.htm?commid=46202"],
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/soqk",
   :rdfs/label "ISO System of Quantity Kinds (ISQ)"})

(def Planck
  "Planck System of Quantities"
  {:db/ident         :soqk/Planck,
   :qudt/hasQuantityKind :quantitykind/Length,
   :rdf/type         :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/soqk",
   :rdfs/label       "Planck System of Quantities"})

(def SI
  "International System of Quantity Kinds"
  {:db/ident :soqk/SI,
   :qudt/dbpediaMatch
   "http://dbpedia.org/resource/International_System_of_UnitsX",
   :qudt/hasBaseQuantityKind [:quantitykind/AmountOfSubstance
                              :quantitykind/Length
                              :quantitykind/LuminousIntensity
                              :quantitykind/ThermodynamicTemperature
                              :quantitykind/Time
                              :quantitykind/ElectricCurrent
                              :quantitykind/Mass
                              :quantitykind/Dimensionless],
   :qudt/systemDerivedQuantityKind
   [:quantitykind/LuminousEfficacy
    :quantitykind/InversePermittivity
    :quantitykind/MassPerLength
    :quantitykind/ForcePerArea
    :quantitykind/Energy
    :quantitykind/Volume
    :quantitykind/AreaTime
    :quantitykind/PowerPerAreaQuarticTemperature
    :quantitykind/LinearAcceleration
    :quantitykind/LuminousFluxPerArea
    :quantitykind/VolumePerUnitTime
    :quantitykind/ElectricChargeLineDensity
    :quantitykind/HeatFlowRatePerUnitArea
    :quantitykind/MagneticFluxPerUnitLength
    :quantitykind/LengthEnergy
    :quantitykind/LuminousEnergy
    :quantitykind/InverseLength
    :quantitykind/Capacitance
    :quantitykind/AngularMomentum
    :quantitykind/Exposure
    :quantitykind/MolarEnergy
    :quantitykind/SolidAngle
    :quantitykind/TimeSquared
    :quantitykind/KinematicViscosity
    :quantitykind/MolarHeatCapacity
    :quantitykind/ThermalInsulance
    :quantitykind/Resistance
    :quantitykind/Permeability
    :quantitykind/Density
    :quantitykind/MolarAngularMomentum
    :quantitykind/ThermalResistance
    :quantitykind/AmountOfSubstancePerUnitMass
    :quantitykind/LinearVelocity
    :quantitykind/ElectricDisplacement
    :quantitykind/TimeTemperature
    :quantitykind/SpecificHeatCapacity
    :quantitykind/MagnetomotiveForce
    :quantitykind/LinearMomentum
    :quantitykind/Force
    :quantitykind/PowerArea
    :quantitykind/ElectricConductivity
    :quantitykind/LengthMass
    :quantitykind/LengthMolarEnergy
    :quantitykind/AbsorbedDoseRate
    :quantitykind/CatalyticActivity
    :quantitykind/LengthTemperature
    :quantitykind/ElectricQuadrupoleMoment
    :quantitykind/MolarVolume
    :quantitykind/CubicElectricDipoleMomentPerSquareEnergy
    :quantitykind/Area
    :quantitykind/MagneticFluxDensity
    :quantitykind/ElectricPotential
    :quantitykind/Power
    :quantitykind/Magnetization
    :quantitykind/VolumeThermalExpansion
    :quantitykind/MassPerElectricCharge
    :quantitykind/EnergyPerAreaElectricCharge
    :quantitykind/ThermalConductivity
    :quantitykind/MassTemperature
    :quantitykind/SpecificVolume
    :quantitykind/ElectromotiveForce
    :quantitykind/EnergyPerElectricCharge
    :quantitykind/Torque
    :quantitykind/MolarMass
    :quantitykind/AbsorbedDose
    :quantitykind/Polarizability
    :quantitykind/ForcePerAreaTime
    :quantitykind/AreaPerTime
    :quantitykind/Stress
    :quantitykind/MassPerTime
    :quantitykind/ElectricCurrentPerUnitEnergy
    :quantitykind/SpecificHeatPressure
    :quantitykind/ElectricFlux
    :quantitykind/DynamicViscosity
    :quantitykind/LengthPerUnitElectricCurrent
    :quantitykind/ElectricCurrentPerAngle
    :quantitykind/ThrustToMassRatio
    :quantitykind/MomentOfInertia
    :quantitykind/MassPerAreaTime
    :quantitykind/EnergyPerArea
    :quantitykind/AuxillaryMagneticField
    :quantitykind/InverseMagneticFlux
    :quantitykind/LinearThermalExpansion
    :quantitykind/InverseLengthTemperature
    :quantitykind/ThermalDiffusivity
    :quantitykind/PlaneAngle
    :quantitykind/DoseEquivalent
    :quantitykind/EnergyPerSquareMagneticFluxDensity
    :quantitykind/HeatFlowRate
    :quantitykind/QuarticElectricDipoleMomentPerCubicEnergy
    :quantitykind/AreaThermalExpansion
    :quantitykind/AngularAcceleration
    :quantitykind/ElectricCurrentDensity
    :quantitykind/SpecificHeatVolume
    :quantitykind/MagneticReluctivity
    :quantitykind/Activity
    :quantitykind/AreaTemperature
    :quantitykind/ElectricCharge
    :quantitykind/PowerPerArea
    :quantitykind/ElectricChargePerAmountOfSubstance
    :quantitykind/AreaAngle
    :quantitykind/Illuminance
    :quantitykind/ForcePerLength
    :quantitykind/PolarizationField
    :quantitykind/TemperaturePerMagneticFluxDensity
    :quantitykind/PowerAreaPerSolidAngle
    :quantitykind/InverseEnergy
    :quantitykind/LuminousFlux
    :quantitykind/MagneticDipoleMoment
    :quantitykind/AmountOfSubstancePerUnitVolume
    :quantitykind/RadiantIntensity
    :quantitykind/InverseAmountOfSubstance
    :quantitykind/SpecificImpulseByMass
    :quantitykind/PowerPerAreaAngle
    :quantitykind/InverseSquareEnergy
    :quantitykind/TemperaturePerTime
    :quantitykind/Luminance
    :quantitykind/PowerPerElectricCharge
    :quantitykind/VolumetricHeatCapacity
    :quantitykind/SquareEnergy
    :quantitykind/SpecificEnergy
    :quantitykind/InverseVolume
    :quantitykind/Inductance
    :quantitykind/MagneticFlux
    :quantitykind/ForcePerElectricCharge
    :quantitykind/AngularVelocity
    :quantitykind/InverseTimeTemperature
    :quantitykind/CoefficientOfHeatTransfer
    :quantitykind/Permittivity
    :quantitykind/ThermalResistivity
    :quantitykind/ElectricChargePerMass
    :quantitykind/ElectricDipoleMoment
    :quantitykind/HeatCapacity
    :quantitykind/StandardGravitationalParameter
    :quantitykind/ElectricChargePerArea
    :quantitykind/Frequency
    :quantitykind/ElectricChargeVolumeDensity
    :quantitykind/MassPerArea
    :quantitykind/ElectricFieldStrength
    :quantitykind/LinearElectricCurrent
    :quantitykind/GravitationalAttraction
    :quantitykind/TemperatureAmountOfSubstance
    :quantitykind/EnergyDensity],
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/soqk",
   :rdfs/label "International System of Quantity Kinds"})

(def SOQK_CGS
  "CGS System of Quantity Kinds (deprecated URI)"
  {:db/ident       :soqk/SOQK_CGS,
   :owl/deprecated true,
   :rdf/type       :qudt/SystemOfQuantityKinds,
   :rdfs/label     "CGS System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso   ["http://qudt.org/2.1/vocab/soqk/CGS"]})

(def SOQK_CGS-EMU
  "CGS-EMU System of Quantity Kinds (deprecated URI)"
  {:db/ident       :soqk/SOQK_CGS-EMU,
   :owl/deprecated true,
   :rdf/type       :qudt/SystemOfQuantityKinds,
   :rdfs/label     "CGS-EMU System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso   ["http://qudt.org/2.1/vocab/soqk/CGS-EMU"]})

(def SOQK_CGS-ESU
  "CGS-ESU System of Quantity Kinds (deprecated URI)"
  {:db/ident       :soqk/SOQK_CGS-ESU,
   :owl/deprecated true,
   :rdf/type       :qudt/SystemOfQuantityKinds,
   :rdfs/label     "CGS-ESU System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso   ["http://qudt.org/2.1/vocab/soqk/CGS-ESU"]})

(def SOQK_CGS-Gauss
  "CGS-Gauss System of Quantity Kinds (deprecated URI)"
  {:db/ident       :soqk/SOQK_CGS-Gauss,
   :owl/deprecated true,
   :rdf/type       :qudt/SystemOfQuantityKinds,
   :rdfs/label     "CGS-Gauss System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso   ["http://qudt.org/2.1/vocab/soqk/CGS-Gauss"]})

(def SOQK_IMPERIAL
  "Imperial System of Quantity Kinds (deprecated URI)"
  {:db/ident       :soqk/SOQK_IMPERIAL,
   :owl/deprecated true,
   :rdf/type       :qudt/SystemOfQuantityKinds,
   :rdfs/label     "Imperial System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso   ["http://qudt.org/2.1/vocab/soqk/IMPERIAL"]})

(def SOQK_ISQ
  "ISQ System of Quantity Kinds (deprecated URI)"
  {:db/ident       :soqk/SOQK_ISQ,
   :owl/deprecated true,
   :rdf/type       :qudt/SystemOfQuantityKinds,
   :rdfs/label     "ISQ System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso   ["http://qudt.org/2.1/vocab/soqk/ISQ"]})

(def SOQK_Planck
  "Planck System of Quantity Kinds (deprecated URI)"
  {:db/ident       :soqk/SOQK_Planck,
   :owl/deprecated true,
   :rdf/type       :qudt/SystemOfQuantityKinds,
   :rdfs/label     "Planck System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso   ["http://qudt.org/2.1/vocab/soqk/Planck"]})

(def SOQK_SI
  "SI System of Quantity Kinds (deprecated URI)"
  {:db/ident       :soqk/SOQK_SI,
   :owl/deprecated true,
   :rdf/type       :qudt/SystemOfQuantityKinds,
   :rdfs/label     "SI System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso   ["http://qudt.org/2.1/vocab/soqk/SI"]})

(def SOQK_USCS
  "US Customary System of Quantity Kinds (deprecated URI)"
  {:db/ident       :soqk/SOQK_USCS,
   :owl/deprecated true,
   :rdf/type       :qudt/SystemOfQuantityKinds,
   :rdfs/label     "US Customary System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso   ["http://qudt.org/2.1/vocab/soqk/USCS"]})

(def USCS
  "US Customary System of Quantity Kinds"
  {:db/ident         :soqk/USCS,
   :qudt/hasQuantityKind [:quantitykind/CoefficientOfHeatTransfer
                          :quantitykind/DynamicViscosity
                          :quantitykind/MolarHeatCapacity
                          :quantitykind/ThermalEnergy
                          :quantitykind/MassPerLength
                          :quantitykind/HeatCapacity
                          :quantitykind/ForcePerLength
                          :quantitykind/AreaTemperature
                          :quantitykind/Area
                          :quantitykind/AreaTime
                          :quantitykind/MassPerTime
                          :quantitykind/Power
                          :quantitykind/ThermalResistivity
                          :quantitykind/ThermodynamicTemperature
                          :quantitykind/ThermalResistance
                          :quantitykind/LinearAcceleration
                          :quantitykind/Density
                          :quantitykind/AngularAcceleration
                          :quantitykind/ThrustToMassRatio
                          :quantitykind/LinearVelocity
                          :quantitykind/Volume
                          :quantitykind/PowerPerArea
                          :quantitykind/LiquidVolume
                          :quantitykind/ThermalEnergyLength
                          :quantitykind/SpecificEnergy
                          :quantitykind/AreaTimeTemperature
                          :quantitykind/KinematicViscosity
                          :quantitykind/Force
                          :quantitykind/Torque
                          :quantitykind/SpecificHeatCapacity
                          :quantitykind/AngularVelocity
                          :quantitykind/ForcePerArea
                          :quantitykind/Time
                          :quantitykind/Length
                          :quantitykind/VolumePerUnitTime
                          :quantitykind/HeatFlowRate
                          :quantitykind/ThermalInsulance
                          :quantitykind/EnergyPerArea
                          :quantitykind/MassTemperature
                          :quantitykind/ThermalDiffusivity
                          :quantitykind/ThermalConductivity
                          :quantitykind/MassPerArea
                          :quantitykind/Mass],
   :rdf/type         :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/soqk",
   :rdfs/label       "US Customary System of Quantity Kinds"})