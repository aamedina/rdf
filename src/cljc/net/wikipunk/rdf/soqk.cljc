(ns net.wikipunk.rdf.soqk
  {:namespaces            {"dc11" "http://purl.org/dc/elements/1.1/",
                           "dcterms" "http://purl.org/dc/terms/",
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
   :owl/imports           #{{:xsd/anyURI "http://qudt.org/vocab/quantitykind"}
                            {:xsd/anyURI "http://qudt.org/vocab/sou"}
                            {:xsd/anyURI "http://qudt.org/schema/facade/qudt"}},
   :owl/versionInfo       "Created with TopBraid Composer",
   :rdf/type              :owl/Ontology,
   :rdfa/prefix           "soqk",
   :rdfa/uri              "http://qudt.org/vocab/soqk/",
   :rdfs/label            "QUDT VOCAB Systems of Quantity Kinds Release 2.1.35",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-SOQK,
   :xsd/anyURI            "http://qudt.org/vocab/soqk"})

(def CGS
  {:db/ident :soqk/CGS,
   :qudt/hasBaseQuantityKind #{:quantitykind/Time :quantitykind/Dimensionless
                               :quantitykind/Length :quantitykind/Mass},
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/hasUnitSystem :sou/CGS,
   :qudt/systemDerivedQuantityKind
   #{:quantitykind/SpecificEnergy :quantitykind/LinearAcceleration
     :quantitykind/MassPerArea :quantitykind/Area :quantitykind/Stress
     :quantitykind/AngularAcceleration :quantitykind/LinearVelocity
     :quantitykind/Curvature :quantitykind/EnergyPerArea
     :quantitykind/MassPerLength :quantitykind/AngularVelocity
     :quantitykind/Power :quantitykind/Volume :quantitykind/AreaAngle
     :quantitykind/AreaTime :quantitykind/MomentOfInertia :quantitykind/Torque
     :quantitykind/EnergyDensity :quantitykind/DynamicViscosity
     :quantitykind/Frequency :quantitykind/LengthMass :quantitykind/Density
     :quantitykind/Energy :quantitykind/RadiantIntensity
     :quantitykind/ForcePerLength :quantitykind/LinearMomentum
     :quantitykind/PowerPerArea :quantitykind/Force :quantitykind/Pressure
     :quantitykind/VolumePerUnitTime :quantitykind/ForcePerArea
     :quantitykind/AngularMomentum :quantitykind/TimeSquared
     :quantitykind/MassPerTime :quantitykind/PowerPerAreaAngle},
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/soqk"},
   :rdfs/label "CGS System of Quantity Kinds"})

(def CGS-EMU
  {:db/ident :soqk/CGS-EMU,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The electromagnetic system of units is used to measure electrical quantities of electric charge, current, and voltage, within the centimeter gram second (or \"CGS\") metric system of units. In electromagnetic units, electric current is derived the CGS base units length, mass, and time by solving Ampere's Law (expressing the force between two parallel conducting wires) for current and setting the constant of proportionality (k_m) equal to unity. Thus, in the CGS-EMU system, electric current is derived from length, mass, and time."},
   :qudt/hasBaseQuantityKind #{:quantitykind/Time :quantitykind/Dimensionless
                               :quantitykind/Length :quantitykind/Mass},
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/hasUnitSystem :sou/CGS-EMU,
   :qudt/systemDerivedQuantityKind
   #{:quantitykind/ElectricCurrent :quantitykind/ElectricCurrentPerUnitLength
     :quantitykind/Permeability :quantitykind/LengthPerUnitElectricCurrent
     :quantitykind/ElectricFlux :quantitykind/MagnetomotiveForce
     :quantitykind/ElectricConductivity :quantitykind/AuxillaryMagneticField
     :quantitykind/MagneticDipoleMoment :quantitykind/ElectricCurrentDensity
     :quantitykind/MagneticField :quantitykind/MagneticFlux
     :quantitykind/Permittivity :quantitykind/ElectricDisplacementField
     :quantitykind/MagnetizationField :quantitykind/EnergyPerElectricCharge
     :quantitykind/ElectricCharge :quantitykind/ElectromotiveForce
     :quantitykind/Inductance :quantitykind/MagneticFluxPerUnitLength
     :quantitykind/ElectricDipoleMoment :quantitykind/Resistance
     :quantitykind/Capacitance :quantitykind/ElectricPotential
     :quantitykind/ElectricField},
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/soqk"},
   :rdfs/label "CGS-EMU System of Quantity Kinds"})

(def CGS-ESU
  {:db/ident :soqk/CGS-ESU,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The electrostatic system of units is used to measure electrical quantities of electric charge, current, and voltage within the centimeter gram second (or \"CGS\") metric system of units. In electrostatic units, electric charge is derived from Coulomb's Law (expressing the force exerted between two charged particles separated by a distance) by solving for electric charge and setting the constant of proportionality (k_s) equal to unity. Thus, in electrostatic units, the dimensionality of electric charge is derived from the base CGS quantities of length, mass, and time."},
   :qudt/hasBaseQuantityKind #{:quantitykind/Time :quantitykind/Dimensionless
                               :quantitykind/Length :quantitykind/Mass},
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/hasUnitSystem :sou/CGS-ESU,
   :qudt/systemDerivedQuantityKind
   #{:quantitykind/ElectricCurrent :quantitykind/ElectricCurrentPerUnitLength
     :quantitykind/Permeability :quantitykind/LengthPerUnitElectricCurrent
     :quantitykind/ElectricFlux :quantitykind/MagnetomotiveForce
     :quantitykind/AuxillaryMagneticField :quantitykind/MagneticDipoleMoment
     :quantitykind/ElectricCurrentDensity :quantitykind/MagneticField
     :quantitykind/MagneticFlux :quantitykind/Permittivity
     :quantitykind/ElectricDisplacementField :quantitykind/MagnetizationField
     :quantitykind/EnergyPerElectricCharge :quantitykind/ElectricCharge
     :quantitykind/ElectromotiveForce :quantitykind/Inductance
     :quantitykind/MagneticFluxPerUnitLength :quantitykind/ElectricDipoleMoment
     :quantitykind/Resistance :quantitykind/Capacitance
     :quantitykind/ElectricPotential :quantitykind/ElectricField},
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/soqk"},
   :rdfs/label "CGS-ESU System of Quantity Kinds"})

(def CGS-Gauss
  {:db/ident :soqk/CGS-Gauss,
   :qudt/hasBaseQuantityKind #{:quantitykind/Time :quantitykind/Dimensionless
                               :quantitykind/Length :quantitykind/Mass},
   :qudt/hasQuantityKind :quantitykind/Length,
   :qudt/hasUnitSystem :sou/CGS-GAUSS,
   :qudt/systemDerivedQuantityKind
   #{:quantitykind/ElectricCurrent :quantitykind/ElectricCurrentPerUnitLength
     :quantitykind/Permeability :quantitykind/LengthPerUnitElectricCurrent
     :quantitykind/ElectricFlux :quantitykind/AuxillaryMagneticField
     :quantitykind/MagneticDipoleMoment :quantitykind/ElectricCurrentDensity
     :quantitykind/MagneticField :quantitykind/MagneticFlux
     :quantitykind/Permittivity :quantitykind/ElectricDisplacementField
     :quantitykind/MagnetizationField :quantitykind/EnergyPerElectricCharge
     :quantitykind/ElectricCharge :quantitykind/ElectromotiveForce
     :quantitykind/Inductance :quantitykind/MagneticFluxPerUnitLength
     :quantitykind/ElectricDipoleMoment :quantitykind/Resistance
     :quantitykind/Capacitance :quantitykind/ElectricPotential
     :quantitykind/ElectricField},
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/soqk"},
   :rdfs/label "CGS-Gauss System of Quantity Kinds"})

(def IMPERIAL
  {:db/ident         :soqk/IMPERIAL,
   :qudt/hasQuantityKind
   #{:quantitykind/Time :quantitykind/CoefficientOfHeatTransfer
     :quantitykind/SpecificEnergy :quantitykind/AreaTimeTemperature
     :quantitykind/MolarHeatCapacity :quantitykind/HeatFlowRate
     :quantitykind/LinearAcceleration :quantitykind/ThermalResistivity
     :quantitykind/MassPerArea :quantitykind/HeatCapacity :quantitykind/Area
     :quantitykind/ThermalConductivity :quantitykind/AngularAcceleration
     :quantitykind/LinearVelocity :quantitykind/EnergyPerArea
     :quantitykind/Length :quantitykind/MassPerLength
     :quantitykind/AngularVelocity :quantitykind/Power
     :quantitykind/ThermalEnergy :quantitykind/Mass :quantitykind/Volume
     :quantitykind/ThermalDiffusivity :quantitykind/AreaTemperature
     :quantitykind/AreaTime :quantitykind/KinematicViscosity
     :quantitykind/LiquidVolume :quantitykind/SpecificHeatCapacity
     :quantitykind/Torque :quantitykind/DynamicViscosity :quantitykind/Density
     :quantitykind/Energy :quantitykind/ForcePerLength
     :quantitykind/MassTemperature :quantitykind/ThermalResistance
     :quantitykind/PowerPerArea :quantitykind/Force
     :quantitykind/ThermodynamicTemperature :quantitykind/ThrustToMassRatio
     :quantitykind/VolumePerUnitTime :quantitykind/ThermalInsulance
     :quantitykind/ForcePerArea :quantitykind/ThermalEnergyLength
     :quantitykind/MassPerTime},
   :rdf/type         :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/soqk"},
   :rdfs/label       "Imperial System of Quantity Kinds"})

(def ISQ
  {:db/ident :soqk/ISQ,
   :dcterms/description
   {:rdf/type :rdf/HTML,
    :rdf/value
    "The ISO 80000 standards were prepared by Technical Committee ISO/TC 12, Quantities and units in co-operation with IEC/TC 25, Quantities and units."},
   :qudt/hasBaseQuantityKind
   #{:quantitykind/Time :quantitykind/ElectricCurrent :quantitykind/Length
     :quantitykind/Mass :quantitykind/LuminousIntensity
     :quantitykind/AmountOfSubstance :quantitykind/ThermodynamicTemperature},
   :qudt/hasQuantityKind
   #{:quantitykind/NormalStress :quantitykind/LengthByForce
     :quantitykind/BendingMomentOfForce :quantitykind/CoefficientOfHeatTransfer
     :quantitykind/RadiantFluence :quantitykind/ElectricCurrent
     :quantitykind/ThermodynamicEnergy :quantitykind/VisionThresholds
     :quantitykind/SoundVolumeVelocity :quantitykind/SoundPressureLevel
     :quantitykind/ElectricChargeVolumeDensity
     :quantitykind/ElectricChargeDensity :quantitykind/Momentum
     :quantitykind/MagneticAreaMoment :quantitykind/SpecificEnergy
     :quantitykind/WarmReceptorThreshold :quantitykind/BulkModulus
     :quantitykind/ElectricPolarization :quantitykind/ConvectiveHeatTransfer
     :quantitykind/Friction :quantitykind/ShearStress
     :quantitykind/CompressibilityFactor
     :quantitykind/ElectromagneticWavePhaseSpeed :quantitykind/LagrangeFunction
     :quantitykind/RelativeMassConcentrationOfVapour :quantitykind/Coercivity
     :quantitykind/SoundExposure :quantitykind/HeatFlowRatePerUnitArea
     :quantitykind/PhaseCoefficient :quantitykind/MechanicalSurfaceImpedance
     :quantitykind/NapierianAbsorbance :quantitykind/SectionModulus
     :quantitykind/Diameter :quantitykind/PropagationCoefficient
     :quantitykind/SphericalIlluminance :quantitykind/ShearStrain
     :quantitykind/SoundEnergyDensity :quantitykind/HeatFlowRate
     :quantitykind/VoltagePhasor :quantitykind/RelativePartialPressure
     :quantitykind/TransmittanceDensity
     :quantitykind/EvaporativeHeatTransferCoefficient
     :quantitykind/SpecificGibbsEnergy :quantitykind/Thickness
     :quantitykind/MassPerArea :quantitykind/RelativeMassRatioOfVapour
     :quantitykind/Reactance :quantitykind/HeatCapacity
     :quantitykind/TouchThresholds :quantitykind/Permeability
     :quantitykind/AngularFrequency :quantitykind/QualityFactor
     :quantitykind/Displacement :quantitykind/LinearElectricCurrentDensity
     :quantitykind/ElectricFlux :quantitykind/EinsteinTransitionProbability
     :quantitykind/Permeance :quantitykind/ElectricFluxDensity
     :quantitykind/MolarAbsorptionCoefficient :quantitykind/ReactivePower
     :quantitykind/MagnetomotiveForce :quantitykind/Turns
     :quantitykind/MechanicalEnergy :quantitykind/Efficiency
     :quantitykind/ThermalConductivity :quantitykind/GeneralizedMomentum
     :quantitykind/DewPointTemperature :quantitykind/SpecificVolume
     :quantitykind/SoundPower :quantitykind/Compressibility
     :quantitykind/Breadth :quantitykind/MassRatioOfWaterVapourToDryGas
     :quantitykind/SoundPowerLevel :quantitykind/SoundParticleVelocity
     :quantitykind/RelativeHumidity :quantitykind/RadiantEnergyDensity
     :quantitykind/ComplexPower :quantitykind/InverseSquareEnergy
     :quantitykind/SpecificEntropy :quantitykind/PoissonRatio
     :quantitykind/LossFactor :quantitykind/MassConcentrationOfWaterVapour
     :quantitykind/IsothermalCompressibility :quantitykind/MolarAngularMomentum
     :quantitykind/SquareEnergy :quantitykind/CubicExpansionCoefficient
     :quantitykind/MagneticMoment :quantitykind/MassPerLength
     :quantitykind/Conductance :quantitykind/RadiativeHeatTransfer
     :quantitykind/InstantaneousPower :quantitykind/PositionVector
     :quantitykind/Power :quantitykind/LinearStrain
     :quantitykind/SpecificHeatCapacityAtSaturation
     :quantitykind/TemporalSummationFunction :quantitykind/AngularImpulse
     :quantitykind/SecondAxialMomentOfArea :quantitykind/MagneticDipoleMoment
     :quantitykind/MassPerAreaTime :quantitykind/ElectricCurrentDensity
     :quantitykind/PowerFactor :quantitykind/AcousticImpedance
     :quantitykind/MutualInductance :quantitykind/MassieuFunction
     :quantitykind/Impedance :quantitykind/Transmittance
     :quantitykind/StaticFriction :quantitykind/ElectricPotentialDifference
     :quantitykind/ModulusOfImpedance :quantitykind/ElectricChargeSurfaceDensity
     :quantitykind/PlanckFunction :quantitykind/Magnetization
     :quantitykind/Distance :quantitykind/StandardGravitationalParameter
     :quantitykind/SourceVoltage :quantitykind/MagneticFlux
     :quantitykind/Permittivity :quantitykind/TotalCurrentDensity
     :quantitykind/GravitationalAttraction :quantitykind/ActivePower
     :quantitykind/ElectricChargeLinearDensity :quantitykind/IsentropicExponent
     :quantitykind/ThermalDiffusivity :quantitykind/ElectricDisplacement
     :quantitykind/Admittance :quantitykind/Radiosity
     :quantitykind/AngularWavenumber :quantitykind/SoundExposureLevel
     :quantitykind/DisplacementCurrent :quantitykind/MassRatioOfWaterToDryMatter
     :quantitykind/Absorptance :quantitykind/Thrust
     :quantitykind/AuditoryThresholds :quantitykind/SoundParticleAcceleration
     :quantitykind/MassFlowRate :quantitykind/MagneticPolarization
     :quantitykind/CurrentLinkage :quantitykind/PressureCoefficient
     :quantitykind/MomentOfInertia :quantitykind/VolumeFlowRate
     :quantitykind/ShearModulus :quantitykind/ReflectanceFactor
     :quantitykind/Emissivity :quantitykind/Entropy
     :quantitykind/LuminousEmittance :quantitykind/MassConcentrationOfWater
     :quantitykind/PhotoThresholdOfAwarenessFunction :quantitykind/SpeedOfLight
     :quantitykind/ElectricCurrentPhasor :quantitykind/SpecificHeatCapacity
     :quantitykind/Torque :quantitykind/Conductivity :quantitykind/EnergyDensity
     :quantitykind/SecondPolarMomentOfArea :quantitykind/GibbsEnergy
     :quantitykind/SpecificHeatCapacityAtConstantPressure
     :quantitykind/Adaptation :quantitykind/SpecificHelmholtzEnergy
     :quantitykind/IsentropicCompressibility :quantitykind/PolarMomentOfInertia
     :quantitykind/VolumeStrain :quantitykind/SpecificImpulseByWeight
     :quantitykind/CurvatureFromRadius :quantitykind/ModulusOfAdmittance
     :quantitykind/InverseEnergy :quantitykind/RadianceFactor
     :quantitykind/HeatCapacityRatio :quantitykind/DisplacementCurrentDensity
     :quantitykind/LuminousIntensity :quantitykind/ModulusOfElasticity
     :quantitykind/ElectricCharge :quantitykind/PathLength
     :quantitykind/PermittivityRatio :quantitykind/RadialDistance
     :quantitykind/CartesianVolume :quantitykind/RatioOfSpecificHeatCapacities
     :quantitykind/Action :quantitykind/CelsiusTemperature
     :quantitykind/SpectralLuminousEfficiency
     :quantitykind/MagneticSusceptability :quantitykind/Energy
     :quantitykind/Inductance :quantitykind/Work :quantitykind/Reluctance
     :quantitykind/VolumicElectromagneticEnergy
     :quantitykind/ElectricSusceptibility :quantitykind/RadiantIntensity
     :quantitykind/MagneticFluxDensity :quantitykind/HelmholtzEnergy
     :quantitykind/SoundReductionIndex :quantitykind/PoyntingVector
     :quantitykind/PowerArea :quantitykind/SpeedOfSound
     :quantitykind/LinearExpansionCoefficient :quantitykind/MassicActivity
     :quantitykind/GeneralizedVelocity :quantitykind/MassAbsorptionCoefficient
     :quantitykind/ConductiveHeatTransferRate :quantitykind/SpecificEnthalpy
     :quantitykind/ForcePerAreaTime :quantitykind/GeneralizedForce
     :quantitykind/ForcePerLength :quantitykind/ElectricDipoleMoment
     :quantitykind/ThermalConductance :quantitykind/LogarithmicFrequencyInterval
     :quantitykind/SpecificHeatCapacityAtConstantVolume :quantitykind/Weight
     :quantitykind/GeneralizedCoordinate :quantitykind/ThermalResistance
     :quantitykind/MagneticTension :quantitykind/MassFractionOfDryMatter
     :quantitykind/MassFractionOfWater :quantitykind/GustatoryThreshold
     :quantitykind/Reflectance :quantitykind/RadiusOfCurvature
     :quantitykind/ConductionSpeed :quantitykind/ApparentPower
     :quantitykind/LinearMomentum :quantitykind/Susceptance
     :quantitykind/DynamicFriction :quantitykind/EvaporativeHeatTransfer
     :quantitykind/PowerPerArea :quantitykind/ElectromagneticEnergyDensity
     :quantitykind/ActivityThresholds :quantitykind/CartesianCoordinates
     :quantitykind/PowerAreaPerSolidAngle :quantitykind/Force
     :quantitykind/NonActivePower :quantitykind/CouplingFactor
     :quantitykind/Resistivity :quantitykind/Pressure
     :quantitykind/ThrustToMassRatio :quantitykind/LinearAbsorptionCoefficient
     :quantitykind/Resistance :quantitykind/MassAttenuationCoefficient
     :quantitykind/Radius :quantitykind/RefractiveIndex
     :quantitykind/ThermalInsulance :quantitykind/OlfactoryThreshold
     :quantitykind/SpecificInternalEnergy :quantitykind/RadiantFlux
     :quantitykind/LinearAttenuationCoefficient
     :quantitykind/MagneticVectorPotential
     :quantitykind/CombinedNonEvaporativeHeatTransferCoefficient
     :quantitykind/ElectricFieldStrength :quantitykind/LeakageFactor
     :quantitykind/SpecificImpulseByMass
     :quantitykind/RelativePressureCoefficient :quantitykind/Capacitance
     :quantitykind/ElectricPotential :quantitykind/Voltage
     :quantitykind/PhaseDifference :quantitykind/ScalarMagneticPotential
     :quantitykind/TotalCurrent :quantitykind/HamiltonFunction
     :quantitykind/PhaseSpeedOfSound :quantitykind/Radiance
     :quantitykind/ColdReceptorThreshold :quantitykind/MassPerTime
     :quantitykind/PowerPerAreaAngle},
   :qudt/informativeReference
   #{{:xsd/anyURI
      "http://www.electropedia.org/iev/iev.nsf/display?openform&ievref=112-02-01"}
     {:xsd/anyURI
      "http://www.iso.org/iso/home/store/catalogue_tc/catalogue_tc_browse.htm?commid=46202"}},
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/soqk"},
   :rdfs/label "ISO System of Quantity Kinds (ISQ)"})

(def Planck
  {:db/ident         :soqk/Planck,
   :qudt/hasQuantityKind :quantitykind/Length,
   :rdf/type         :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/soqk"},
   :rdfs/label       "Planck System of Quantities"})

(def SI
  {:db/ident :soqk/SI,
   :qudt/dbpediaMatch
   {:xsd/anyURI "http://dbpedia.org/resource/International_System_of_UnitsX"},
   :qudt/hasBaseQuantityKind
   #{:quantitykind/Time :quantitykind/ElectricCurrent
     :quantitykind/Dimensionless :quantitykind/Length :quantitykind/Mass
     :quantitykind/LuminousIntensity :quantitykind/AmountOfSubstance
     :quantitykind/ThermodynamicTemperature},
   :qudt/systemDerivedQuantityKind
   #{:quantitykind/LengthTemperature :quantitykind/ElectricQuadrupoleMoment
     :quantitykind/CoefficientOfHeatTransfer :quantitykind/LuminousFlux
     :quantitykind/QuarticElectricDipoleMomentPerCubicEnergy
     :quantitykind/ElectricChargeVolumeDensity :quantitykind/SpecificEnergy
     :quantitykind/Polarizability :quantitykind/MolarHeatCapacity
     :quantitykind/HeatFlowRatePerUnitArea :quantitykind/Illuminance
     :quantitykind/DoseEquivalent :quantitykind/HeatFlowRate
     :quantitykind/EnergyPerSquareMagneticFluxDensity :quantitykind/Activity
     :quantitykind/PowerPerAreaQuarticTemperature
     :quantitykind/LinearAcceleration :quantitykind/AreaThermalExpansion
     :quantitykind/InverseAmountOfSubstance :quantitykind/SolidAngle
     :quantitykind/ThermalResistivity :quantitykind/MassPerArea
     :quantitykind/HeatCapacity :quantitykind/Permeability :quantitykind/Area
     :quantitykind/SpecificHeatVolume :quantitykind/AbsorbedDose
     :quantitykind/ElectricChargePerMass
     :quantitykind/LengthPerUnitElectricCurrent :quantitykind/ElectricFlux
     :quantitykind/Stress :quantitykind/MagnetomotiveForce
     :quantitykind/PolarizationField :quantitykind/ThermalConductivity
     :quantitykind/AngularAcceleration :quantitykind/LinearVelocity
     :quantitykind/SpecificVolume :quantitykind/PowerPerElectricCharge
     :quantitykind/InversePermittivity :quantitykind/AreaPerTime
     :quantitykind/EnergyPerArea :quantitykind/InverseSquareEnergy
     :quantitykind/LinearElectricCurrent :quantitykind/MolarAngularMomentum
     :quantitykind/SquareEnergy :quantitykind/VolumetricHeatCapacity
     :quantitykind/ElectricConductivity :quantitykind/InverseTimeTemperature
     :quantitykind/MassPerLength :quantitykind/AngularVelocity
     :quantitykind/Power :quantitykind/MolarMass
     :quantitykind/CubicElectricDipoleMomentPerSquareEnergy
     :quantitykind/AuxillaryMagneticField :quantitykind/MagneticDipoleMoment
     :quantitykind/MassPerAreaTime :quantitykind/ElectricCurrentDensity
     :quantitykind/Volume :quantitykind/Magnetization
     :quantitykind/StandardGravitationalParameter :quantitykind/MagneticFlux
     :quantitykind/AreaAngle :quantitykind/LengthEnergy
     :quantitykind/ElectricChargePerAmountOfSubstance :quantitykind/Permittivity
     :quantitykind/SpecificHeatPressure :quantitykind/GravitationalAttraction
     :quantitykind/ThermalDiffusivity :quantitykind/AreaTemperature
     :quantitykind/ElectricDisplacement :quantitykind/AreaTime
     :quantitykind/ElectricCurrentPerAngle :quantitykind/KinematicViscosity
     :quantitykind/InverseVolume :quantitykind/ForcePerElectricCharge
     :quantitykind/LinearThermalExpansion :quantitykind/InverseMagneticFlux
     :quantitykind/MomentOfInertia :quantitykind/MolarVolume
     :quantitykind/SpecificHeatCapacity :quantitykind/Torque
     :quantitykind/CatalyticActivity :quantitykind/EnergyDensity
     :quantitykind/DynamicViscosity :quantitykind/AmountOfSubstancePerUnitVolume
     :quantitykind/Frequency :quantitykind/MagneticReluctivity
     :quantitykind/LengthMass :quantitykind/InverseEnergy :quantitykind/Density
     :quantitykind/EnergyPerElectricCharge :quantitykind/ElectricCharge
     :quantitykind/InverseLengthTemperature :quantitykind/ElectromotiveForce
     :quantitykind/AmountOfSubstancePerUnitMass :quantitykind/LuminousEnergy
     :quantitykind/Energy :quantitykind/Inductance
     :quantitykind/MagneticFluxPerUnitLength :quantitykind/RadiantIntensity
     :quantitykind/MagneticFluxDensity :quantitykind/PowerArea
     :quantitykind/VolumeThermalExpansion :quantitykind/ForcePerAreaTime
     :quantitykind/ForcePerLength :quantitykind/ElectricDipoleMoment
     :quantitykind/ElectricCurrentPerUnitEnergy
     :quantitykind/ElectricChargePerArea :quantitykind/TemperaturePerTime
     :quantitykind/MassTemperature :quantitykind/LuminousEfficacy
     :quantitykind/TimeTemperature :quantitykind/ThermalResistance
     :quantitykind/TemperatureAmountOfSubstance :quantitykind/AbsorbedDoseRate
     :quantitykind/LinearMomentum :quantitykind/Luminance
     :quantitykind/EnergyPerAreaElectricCharge :quantitykind/PlaneAngle
     :quantitykind/InverseLength :quantitykind/PowerPerArea
     :quantitykind/PowerAreaPerSolidAngle :quantitykind/Force
     :quantitykind/ThrustToMassRatio :quantitykind/Resistance
     :quantitykind/VolumePerUnitTime :quantitykind/ThermalInsulance
     :quantitykind/Exposure :quantitykind/ForcePerArea
     :quantitykind/AngularMomentum :quantitykind/LengthMolarEnergy
     :quantitykind/ElectricFieldStrength :quantitykind/SpecificImpulseByMass
     :quantitykind/Capacitance :quantitykind/ElectricPotential
     :quantitykind/TemperaturePerMagneticFluxDensity
     :quantitykind/MassPerElectricCharge :quantitykind/TimeSquared
     :quantitykind/LuminousFluxPerArea :quantitykind/MassPerTime
     :quantitykind/ElectricChargeLineDensity :quantitykind/PowerPerAreaAngle
     :quantitykind/MolarEnergy},
   :rdf/type :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/soqk"},
   :rdfs/label "International System of Quantity Kinds"})

(def SOQK_CGS
  {:db/ident        :soqk/SOQK_CGS,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfQuantityKinds,
   :rdfs/label      "CGS System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso    :soqk/CGS})

(def SOQK_CGS-EMU
  {:db/ident        :soqk/SOQK_CGS-EMU,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfQuantityKinds,
   :rdfs/label      "CGS-EMU System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso    :soqk/CGS-EMU})

(def SOQK_CGS-ESU
  {:db/ident        :soqk/SOQK_CGS-ESU,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfQuantityKinds,
   :rdfs/label      "CGS-ESU System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso    :soqk/CGS-ESU})

(def SOQK_CGS-Gauss
  {:db/ident        :soqk/SOQK_CGS-Gauss,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfQuantityKinds,
   :rdfs/label      "CGS-Gauss System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso    :soqk/CGS-Gauss})

(def SOQK_IMPERIAL
  {:db/ident        :soqk/SOQK_IMPERIAL,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfQuantityKinds,
   :rdfs/label      "Imperial System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso    :soqk/IMPERIAL})

(def SOQK_ISQ
  {:db/ident        :soqk/SOQK_ISQ,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfQuantityKinds,
   :rdfs/label      "ISQ System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso    :soqk/ISQ})

(def SOQK_Planck
  {:db/ident        :soqk/SOQK_Planck,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfQuantityKinds,
   :rdfs/label      "Planck System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso    :soqk/Planck})

(def SOQK_SI
  {:db/ident        :soqk/SOQK_SI,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfQuantityKinds,
   :rdfs/label      "SI System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso    :soqk/SI})

(def SOQK_USCS
  {:db/ident        :soqk/SOQK_USCS,
   :qudt/deprecated true,
   :rdf/type        :qudt/SystemOfQuantityKinds,
   :rdfs/label      "US Customary System of Quantity Kinds (deprecated URI)",
   :rdfs/seeAlso    :soqk/USCS})

(def USCS
  {:db/ident         :soqk/USCS,
   :qudt/hasQuantityKind
   #{:quantitykind/Time :quantitykind/CoefficientOfHeatTransfer
     :quantitykind/SpecificEnergy :quantitykind/AreaTimeTemperature
     :quantitykind/MolarHeatCapacity :quantitykind/HeatFlowRate
     :quantitykind/LinearAcceleration :quantitykind/ThermalResistivity
     :quantitykind/MassPerArea :quantitykind/HeatCapacity :quantitykind/Area
     :quantitykind/ThermalConductivity :quantitykind/AngularAcceleration
     :quantitykind/LinearVelocity :quantitykind/EnergyPerArea
     :quantitykind/Length :quantitykind/MassPerLength
     :quantitykind/AngularVelocity :quantitykind/Power
     :quantitykind/ThermalEnergy :quantitykind/Mass :quantitykind/Volume
     :quantitykind/ThermalDiffusivity :quantitykind/AreaTemperature
     :quantitykind/AreaTime :quantitykind/KinematicViscosity
     :quantitykind/LiquidVolume :quantitykind/SpecificHeatCapacity
     :quantitykind/Torque :quantitykind/DynamicViscosity :quantitykind/Density
     :quantitykind/ForcePerLength :quantitykind/MassTemperature
     :quantitykind/ThermalResistance :quantitykind/PowerPerArea
     :quantitykind/Force :quantitykind/ThermodynamicTemperature
     :quantitykind/ThrustToMassRatio :quantitykind/VolumePerUnitTime
     :quantitykind/ThermalInsulance :quantitykind/ForcePerArea
     :quantitykind/ThermalEnergyLength :quantitykind/MassPerTime},
   :rdf/type         :qudt/SystemOfQuantityKinds,
   :rdfs/isDefinedBy {:xsd/anyURI "http://qudt.org/vocab/soqk"},
   :rdfs/label       "US Customary System of Quantity Kinds"})

(def urn:uuid:f6305068-a46f-55d6-b373-9be3bf1b6182
  {:owl/imports           #{{:xsd/anyURI "http://qudt.org/vocab/quantitykind"}
                            {:xsd/anyURI "http://qudt.org/vocab/sou"}
                            {:xsd/anyURI "http://qudt.org/schema/facade/qudt"}},
   :owl/versionInfo       "Created with TopBraid Composer",
   :rdf/type              :owl/Ontology,
   :rdfs/label            "QUDT VOCAB Systems of Quantity Kinds Release 2.1.35",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-SOQK,
   :xsd/anyURI            "http://qudt.org/vocab/soqk"})