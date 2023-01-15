(ns net.wikipunk.rdf.qkdv
  "http://qudt.org/2.1/vocab/dimensionvector/"
  {:dcat/downloadURL      "https://qudt.org/2.1/vocab/dimensionvector.ttl",
   :owl/imports           "http://qudt.org/2.1/schema/facade/qudt",
   :owl/versionIRI        "http://qudt.org/2.1/vocab/dimensionvector",
   :rdf/ns-prefix-map     {"creativecommons" "http://creativecommons.org/ns#",
                           "dcterms" "http://purl.org/dc/elements/1.1/",
                           "owl" "http://www.w3.org/2002/07/owl#",
                           "qkdv" "http://qudt.org/vocab/dimensionvector/",
                           "quantitykind" "http://qudt.org/vocab/quantitykind/",
                           "qudt" "http://qudt.org/schema/qudt/",
                           "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                           "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                           "skos" "http://www.w3.org/2004/02/skos/core#",
                           "unit" "http://qudt.org/vocab/unit/",
                           "vaem" "http://www.linkedmodel.org/schema/vaem#",
                           "voag" "http://voag.linkedmodel.org/schema/voag#",
                           "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type              :owl/Ontology,
   :rdf/uri               "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfa/prefix           "qkdv",
   :rdfa/uri              "http://qudt.org/2.1/vocab/dimensionvector/",
   :rdfs/isDefinedBy      "http://qudt.org/2.1/vocab/dimensionvector",
   :vaem/hasGraphMetadata :vaem/GMD_QUDT-DIMENSION-VECTORS})

(def A-1E0L-3I0M0H0T0D0
  "A-1E0L-3I0M0H0T0D0"
  {:db/ident :qkdv/A-1E0L-3I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E0L-3I0M0H0T0D0"})

(def A-1E0L0I0M0H0T0D0
  "A-1E0L0I0M0H0T0D0"
  {:db/ident :qkdv/A-1E0L0I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/InverseAmountOfSubstance,
   :qudt/latexDefinition "\\(N^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E0L0I0M0H0T0D0"})

(def A-1E0L0I0M1H0T0D0
  "A-1E0L0I0M1H0T0D0"
  {:db/ident :qkdv/A-1E0L0I0M1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MolarMass,
   :qudt/latexDefinition "\\(M N^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E0L0I0M1H0T0D0"})

(def A-1E0L2I0M0H0T0D0
  "A-1E0L2I0M0H0T0D0"
  {:db/ident :qkdv/A-1E0L2I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E0L2I0M0H0T0D0"})

(def A-1E0L2I0M1H-1T-2D0
  "A-1E0L2I0M1H-1T-2D0"
  {:db/ident :qkdv/A-1E0L2I0M1H-1T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MolarHeatCapacity,
   :qudt/latexDefinition "\\(L^2 M T^-2 Θ^-1 N^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E0L2I0M1H-1T-2D0"})

(def A-1E0L2I0M1H0T-1D0
  "A-1E0L2I0M1H0T-1D0"
  {:db/ident :qkdv/A-1E0L2I0M1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MolarAngularMomentum,
   :qudt/latexDefinition "\\(L^2 M T^-1 N^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E0L2I0M1H0T-1D0"})

(def A-1E0L2I0M1H0T-2D0
  "A-1E0L2I0M1H0T-2D0"
  {:db/ident :qkdv/A-1E0L2I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MolarEnergy,
   :qudt/latexDefinition "\\(L^2 M T^-2 N^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E0L2I0M1H0T-2D0"})

(def A-1E0L3I0M0H0T-1D0
  "A-1E0L3I0M0H0T-1D0"
  {:db/ident :qkdv/A-1E0L3I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/SecondOrderReactionRateConstant,
   :qudt/latexDefinition "\\(L^3 N^-1 T^-1 \\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E0L3I0M0H0T-1D0"})

(def A-1E0L3I0M0H0T0D0
  "A-1E0L3I0M0H0T0D0"
  {:db/ident :qkdv/A-1E0L3I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MolarVolume,
   :qudt/latexDefinition "\\(L^3 N^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E0L3I0M0H0T0D0"})

(def A-1E0L3I0M1H0T-2D0
  "A-1E0L3I0M1H0T-2D0"
  {:db/ident :qkdv/A-1E0L3I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/LengthMolarEnergy,
   :qudt/latexDefinition "\\(L^3 M T^-2 N^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E0L3I0M1H0T-2D0"})

(def A-1E1L-3I0M0H0T0D0
  "A-1E1L-3I0M0H0T0D0"
  {:db/ident :qkdv/A-1E1L-3I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E1L-3I0M0H0T0D0"})

(def A-1E1L0I0M0H0T1D0
  "A-1E1L0I0M0H0T1D0"
  {:db/ident :qkdv/A-1E1L0I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance -1,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind
   :quantitykind/ElectricChargePerAmountOfSubstance,
   :qudt/latexDefinition "\\(T I N^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A-1E1L0I0M0H0T1D0"})

(def A0E-1L0I0M1H0T-1D0
  "A0E-1L0I0M1H0T-1D0"
  {:db/ident :qkdv/A0E-1L0I0M1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MassPerElectricCharge,
   :qudt/latexDefinition "\\(M T^-1 I^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L0I0M1H0T-1D0"})

(def A0E-1L0I0M1H0T-2D0
  "A0E-1L0I0M1H0T-2D0"
  {:db/ident :qkdv/A0E-1L0I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MagneticFluxDensity,
   :qudt/latexDefinition "\\(M T^-2 I^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L0I0M1H0T-2D0"})

(def A0E-1L0I0M1H0T-3D0
  "A0E-1L0I0M1H0T-3D0"
  {:db/ident :qkdv/A0E-1L0I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/EnergyPerAreaElectricCharge,
   :qudt/latexDefinition "\\(M T^-3 I^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L0I0M1H0T-3D0"})

(def A0E-1L1I0M0H0T0D0
  "A0E-1L1I0M0H0T0D0"
  {:db/ident :qkdv/A0E-1L1I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/LengthPerUnitElectricCurrent,
   :qudt/latexDefinition "\\(L I^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L1I0M0H0T0D0"})

(def A0E-1L1I0M1H0T-2D0
  "A0E-1L1I0M1H0T-2D0"
  {:db/ident :qkdv/A0E-1L1I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MagneticFluxPerUnitLength,
   :qudt/latexDefinition "\\(L M T^-2 I^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L1I0M1H0T-2D0"})

(def A0E-1L1I0M1H0T-3D0
  "A0E-1L1I0M1H0T-3D0"
  {:db/ident :qkdv/A0E-1L1I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricFieldStrength,
   :qudt/latexDefinition "\\(L M T^-3 I^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L1I0M1H0T-3D0"})

(def A0E-1L2I0M1H-1T-3D0
  "A0E-1L2I0M1H-1T-3D0"
  {:db/ident :qkdv/A0E-1L2I0M1H-1T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L2I0M1H-1T-3D0"})

(def A0E-1L2I0M1H0T-2D0
  "A0E-1L2I0M1H0T-2D0"
  {:db/ident :qkdv/A0E-1L2I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MagneticFlux,
   :qudt/latexDefinition "\\(L^2 M T^-2 I^-1\\)",
   :qudt/latexSymbol "\\(m^2 \\cdot kg \\cdot s^{-2} \\cdot  A^{-1}\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L2I0M1H0T-2D0"})

(def A0E-1L2I0M1H0T-3D0
  "A0E-1L2I0M1H0T-3D0"
  {:db/ident :qkdv/A0E-1L2I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/EnergyPerElectricCharge,
   :qudt/latexDefinition "\\(L^2 M T^-3 I^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L2I0M1H0T-3D0"})

(def A0E-1L2I0M1H0T-4D0
  "A0E-1L2I0M1H0T-4D0"
  {:db/ident :qkdv/A0E-1L2I0M1H0T-4D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -4,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/PowerPerElectricCharge,
   :qudt/latexDefinition "\\(L^2 M T^-4 I^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L2I0M1H0T-4D0"})

(def A0E-1L3I0M0H0T-1D0
  "A0E-1L3I0M0H0T-1D0"
  {:db/ident :qkdv/A0E-1L3I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L3I0M0H0T-1D0"})

(def A0E-1L3I0M1H0T-2D0
  "A0E-1L3I0M1H0T-2D0"
  {:db/ident :qkdv/A0E-1L3I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MagneticDipoleMoment,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L3I0M1H0T-2D0"})

(def A0E-1L3I0M1H0T-3D0
  "A0E-1L3I0M1H0T-3D0"
  {:db/ident :qkdv/A0E-1L3I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -1,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricFlux,
   :qudt/latexDefinition "\\(L^3 M T^-3 I^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-1L3I0M1H0T-3D0"})

(def A0E-2L1I0M1H0T-2D0
  "A0E-2L1I0M1H0T-2D0"
  {:db/ident :qkdv/A0E-2L1I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -2,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectromagneticPermeability,
   :qudt/latexDefinition "\\(L M T^-2 I^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-2L1I0M1H0T-2D0"})

(def A0E-2L2I0M1H0T-2D0
  "A0E-2L2I0M1H0T-2D0"
  {:db/ident :qkdv/A0E-2L2I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -2,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Inductance,
   :qudt/latexDefinition "\\(L^2 M T^-2 I^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-2L2I0M1H0T-2D0"})

(def A0E-2L2I0M1H0T-3D0
  "A0E-2L2I0M1H0T-3D0"
  {:db/ident :qkdv/A0E-2L2I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -2,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Resistance,
   :qudt/latexDefinition "\\(L^2 M T^-3 I^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-2L2I0M1H0T-3D0"})

(def A0E-2L3I0M1H0T-3D0
  "A0E-2L3I0M1H0T-3D0"
  {:db/ident :qkdv/A0E-2L3I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -2,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-2L3I0M1H0T-3D0"})

(def A0E-2L3I0M1H0T-4D0
  "A0E-2L3I0M1H0T-4D0"
  {:db/ident :qkdv/A0E-2L3I0M1H0T-4D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -2,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -4,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/InversePermittivity,
   :qudt/latexDefinition "\\(L^3 M T^-4 I^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-2L3I0M1H0T-4D0"})

(def A0E-2L4I0M2H-2T-6D0
  "A0E-2L4I0M2H-2T-6D0"
  {:db/ident :qkdv/A0E-2L4I0M2H-2T-6D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent -2,
   :qudt/dimensionExponentForLength 4,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 2,
   :qudt/dimensionExponentForThermodynamicTemperature -2,
   :qudt/dimensionExponentForTime -6,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E-2L4I0M2H-2T-6D0"})

(def A0E0L-0.5I0M0.5TE0TM-1D0
  "A0E0L-0.5I0M0.5TE0TM-1D0"
  {:db/ident :qkdv/A0E0L-0.5I0M0.5TE0TM-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -0.5,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0.5,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-0.5 M^0.5 T^-1\\)",
   :rdf/type :qudt/QuantityKindDimensionVector_CGS,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-0.5I0M0.5TE0TM-1D0"})

(def A0E0L-0.5I0M0.5TE0TM-2D0
  "A0E0L-0.5I0M0.5TE0TM-2D0"
  {:db/ident :qkdv/A0E0L-0.5I0M0.5TE0TM-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -0.5,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0.5,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-0.5 M^0.5 T^-2\\)",
   :rdf/type :qudt/QuantityKindDimensionVector_CGS,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-0.5I0M0.5TE0TM-2D0"})

(def A0E0L-1.5I0M0.5TE0TM-1D0
  "A0E0L-1.5I0M0.5TE0TM-1D0"
  {:db/ident :qkdv/A0E0L-1.5I0M0.5TE0TM-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1.5,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0.5,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-1.5 M^0.5 T^-1\\)",
   :rdf/type :qudt/QuantityKindDimensionVector_CGS,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1.5I0M0.5TE0TM-1D0"})

(def A0E0L-1.5I0M0.5TE0TM0D0
  "A0E0L-1.5I0M0.5TE0TM0D0"
  {:db/ident :qkdv/A0E0L-1.5I0M0.5TE0TM0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1.5,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0.5,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-1.5 M^0.5\\)",
   :rdf/type :qudt/QuantityKindDimensionVector_CGS,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1.5I0M0.5TE0TM0D0",
   :vaem/todo "Suspicious. Electric Charge per Area would be ET/L**2"})

(def A0E0L-1I0M-1H0T3D0
  "A0E0L-1I0M-1H0T3D0"
  {:db/ident :qkdv/A0E0L-1I0M-1H0T3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 3,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-1 M^-1 T^3 Θ\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M-1H0T3D0"})

(def A0E0L-1I0M-1H1T3D0
  "A0E0L-1I0M-1H1T3D0"
  {:db/ident :qkdv/A0E0L-1I0M-1H1T3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ThermalResistivity,
   :qudt/latexDefinition "\\(L^{-1} M^{-1} T^3 \\Theta\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M-1H1T3D0"})

(def A0E0L-1I0M0H-1T-2D0
  "A0E0L-1I0M0H-1T-2D0"
  {:db/ident :qkdv/A0E0L-1I0M0H-1T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/SpecificHeatVolume,
   :qudt/latexDefinition "\\(L^-1 T^-2 Θ^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M0H-1T-2D0"})

(def A0E0L-1I0M0H-1T0D0
  "A0E0L-1I0M0H-1T0D0"
  {:db/ident :qkdv/A0E0L-1I0M0H-1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/InverseLengthTemperature,
   :qudt/latexDefinition "\\(L^-1 Θ^-1\\)",
   :qudt/latexSymbol "\\(L^{-1} \\Theta^{-1}\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M0H-1T0D0"})

(def A0E0L-1I0M0H0T-1D0
  "A0E0L-1I0M0H0T-1D0"
  {:db/ident :qkdv/A0E0L-1I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M0H0T-1D0"})

(def A0E0L-1I0M0H0T0D0
  "A0E0L-1I0M0H0T0D0"
  {:db/ident :qkdv/A0E0L-1I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind [:quantitykind/InverseLength
                                   :quantitykind/Curvature],
   :qudt/latexDefinition "\\(L^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M0H0T0D0"})

(def A0E0L-1I0M0H0T1D0
  "A0E0L-1I0M0H0T1D0"
  {:db/ident :qkdv/A0E0L-1I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-1 T\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M0H0T1D0"})

(def A0E0L-1I0M0H0T2D0
  "A0E0L-1I0M0H0T2D0"
  {:db/ident :qkdv/A0E0L-1I0M0H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^{-1} T^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M0H0T2D0",
   :vaem/todo "Should be M-1L-2T4E2"})

(def A0E0L-1I0M0H1T0D0
  "A0E0L-1I0M0H1T0D0"
  {:db/ident :qkdv/A0E0L-1I0M0H1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M0H1T0D0"})

(def A0E0L-1I0M1H-1T-2D0
  "A0E0L-1I0M1H-1T-2D0"
  {:db/ident :qkdv/A0E0L-1I0M1H-1T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/VolumetricHeatCapacity,
   :qudt/latexSymbol ["\\(M / (L \\cdot T^2 H)\\)"
                      "\\(M / (L \\cdot T^2 \\Theta)\\)"],
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M1H-1T-2D0"})

(def A0E0L-1I0M1H0T-1D0
  "A0E0L-1I0M1H0T-1D0"
  {:db/ident :qkdv/A0E0L-1I0M1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/DynamicViscosity,
   :qudt/latexDefinition "\\(L^-1 M T^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M1H0T-1D0"})

(def A0E0L-1I0M1H0T-2D0
  "A0E0L-1I0M1H0T-2D0"
  {:db/ident :qkdv/A0E0L-1I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind [:quantitykind/EnergyDensity
                                   :quantitykind/ForcePerArea],
   :qudt/latexDefinition "\\(L^-1 M T^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M1H0T-2D0"})

(def A0E0L-1I0M1H0T-3D0
  "A0E0L-1I0M1H0T-3D0"
  {:db/ident :qkdv/A0E0L-1I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ForcePerAreaTime,
   :qudt/latexDefinition "\\(L^-1 M T^-3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M1H0T-3D0"})

(def A0E0L-1I0M1H0T0D0
  "A0E0L-1I0M1H0T0D0"
  {:db/ident :qkdv/A0E0L-1I0M1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MassPerLength,
   :qudt/latexDefinition "\\(L^-1 M\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M1H0T0D0"})

(def A0E0L-1I0M1H1T-3D0
  "A0E0L-1I0M1H1T-3D0"
  {:db/ident :qkdv/A0E0L-1I0M1H1T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-1I0M1H1T-3D0"})

(def A0E0L-2I0M-1H0T2D0
  "A0E0L-2I0M-1H0T2D0"
  {:db/ident :qkdv/A0E0L-2I0M-1H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/InverseEnergy,
   :qudt/latexDefinition "\\(L^-2 M^-1 T^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M-1H0T2D0"})

(def A0E0L-2I0M-1H1T3D0
  "A0E0L-2I0M-1H1T3D0"
  {:db/ident :qkdv/A0E0L-2I0M-1H1T3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ThermalResistance,
   :qudt/latexDefinition "\\(L^-2 M^-1 T^3 Θ\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M-1H1T3D0"})

(def A0E0L-2I0M0H0T-1D0
  "A0E0L-2I0M0H0T-1D0"
  {:db/ident :qkdv/A0E0L-2I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-2 T-1 Q\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M0H0T-1D0"})

(def A0E0L-2I0M0H0T-2D0
  "A0E0L-2I0M0H0T-2D0"
  {:db/ident :qkdv/A0E0L-2I0M0H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M0H0T-2D0"})

(def A0E0L-2I0M0H0T0D0
  "A0E0L-2I0M0H0T0D0"
  {:db/ident :qkdv/A0E0L-2I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M0H0T0D0"})

(def A0E0L-2I0M0H0T2D0
  "A0E0L-2I0M0H0T2D0"
  {:db/ident :qkdv/A0E0L-2I0M0H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^{-2} T^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M0H0T2D0",
   :vaem/todo
   "Permeability should be force/current**2, which is ML/T2E2. Permittivity should be T4E2L-3M-1"})

(def A0E0L-2I0M1H0T-1D0
  "A0E0L-2I0M1H0T-1D0"
  {:db/ident :qkdv/A0E0L-2I0M1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MassPerAreaTime,
   :qudt/latexDefinition "\\(L^{-2} M T^{-1}\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M1H0T-1D0"})

(def A0E0L-2I0M1H0T-2D0
  "A0E0L-2I0M1H0T-2D0"
  {:db/ident :qkdv/A0E0L-2I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/SpectralRadiantEnergyDensity,
   :qudt/latexDefinition "\\(L^-2 M T^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M1H0T-2D0"})

(def A0E0L-2I0M1H0T-3D0
  "A0E0L-2I0M1H0T-3D0"
  {:db/ident :qkdv/A0E0L-2I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/RadiantIntensity,
   :qudt/latexDefinition "\\(L^-2 M T^-3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M1H0T-3D0"})

(def A0E0L-2I0M1H0T0D0
  "A0E0L-2I0M1H0T0D0"
  {:db/ident :qkdv/A0E0L-2I0M1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MassPerArea,
   :qudt/latexDefinition "\\(L^-2 M\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M1H0T0D0"})

(def A0E0L-2I0M1H1T0D0
  "A0E0L-2I0M1H1T0D0"
  {:db/ident :qkdv/A0E0L-2I0M1H1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M1H1T0D0"})

(def A0E0L-2I0M2H0T-2D0
  "A0E0L-2I0M2H0T-2D0"
  {:db/ident :qkdv/A0E0L-2I0M2H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 2,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MassForcePerVolume,
   :qudt/latexDefinition "\\(L^-2 M^2 T^-2\\)",
   :rdf/type :qudt/QuantityKindDimensionVector,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M2H0T-2D0"})

(def A0E0L-2I0M2H0T-3D0
  "A0E0L-2I0M2H0T-3D0"
  {:db/ident :qkdv/A0E0L-2I0M2H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 2,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M2H0T-3D0"})

(def A0E0L-2I0M2H0T-6D0
  "A0E0L-2I0M2H0T-6D0"
  {:db/ident :qkdv/A0E0L-2I0M2H0T-6D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 2,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -6,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I0M2H0T-6D0"})

(def A0E0L-2I1M-1H0T3D0
  "A0E0L-2I1M-1H0T3D0"
  {:db/ident :qkdv/A0E0L-2I1M-1H0T3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 1,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 3,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(U L^-2 M^-1 T^3 J\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I1M-1H0T3D0"})

(def A0E0L-2I1M-1H0T3D1
  "A0E0L-2I1M-1H0T3D1"
  {:db/ident :qkdv/A0E0L-2I1M-1H0T3D1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 1,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 3,
   :qudt/dimensionlessExponent 1,
   :qudt/latexDefinition "\\(U L^-2 M^-1 T^3 J\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I1M-1H0T3D1"})

(def A0E0L-2I1M0H0T0D0
  "A0E0L-2I1M0H0T0D0"
  {:db/ident :qkdv/A0E0L-2I1M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 1,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Luminance,
   :qudt/latexDefinition "\\(L^-2 J\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I1M0H0T0D0"})

(def A0E0L-2I1M0H0T0D1
  "A0E0L-2I1M0H0T0D1"
  {:db/ident :qkdv/A0E0L-2I1M0H0T0D1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 1,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 1,
   :qudt/latexDefinition "\\(U L^-2 J\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I1M0H0T0D1"})

(def A0E0L-2I1M0H0T1D0
  "A0E0L-2I1M0H0T1D0"
  {:db/ident :qkdv/A0E0L-2I1M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 1,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-2 J T\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-2I1M0H0T1D0"})

(def A0E0L-3I0M0H0T-1D0
  "A0E0L-3I0M0H0T-1D0"
  {:db/ident :qkdv/A0E0L-3I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-3T^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-3I0M0H0T-1D0"})

(def A0E0L-3I0M0H0T0D0
  "A0E0L-3I0M0H0T0D0"
  {:db/ident :qkdv/A0E0L-3I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-3I0M0H0T0D0"})

(def A0E0L-3I0M0H0T1D0
  "A0E0L-3I0M0H0T1D0"
  {:db/ident :qkdv/A0E0L-3I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-3I0M0H0T1D0"})

(def A0E0L-3I0M1H0T-1D0
  "A0E0L-3I0M1H0T-1D0"
  {:db/ident :qkdv/A0E0L-3I0M1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-3I0M1H0T-1D0"})

(def A0E0L-3I0M1H0T-3D0
  "A0E0L-3I0M1H0T-3D0"
  {:db/ident :qkdv/A0E0L-3I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-3I0M1H0T-3D0"})

(def A0E0L-3I0M1H0T0D0
  "A0E0L-3I0M1H0T0D0"
  {:db/ident :qkdv/A0E0L-3I0M1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Density,
   :qudt/latexDefinition "\\(L^-3 M\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-3I0M1H0T0D0"})

(def A0E0L-4I0M-2H0T4D0
  "A0E0L-4I0M-2H0T4D0"
  {:db/ident :qkdv/A0E0L-4I0M-2H0T4D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -4,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -2,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 4,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/InverseSquareEnergy,
   :qudt/latexDefinition "\\(L^-4 M^-2 T^4\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-4I0M-2H0T4D0"})

(def A0E0L-4I0M1H0T-1D0
  "A0E0L-4I0M1H0T-1D0"
  {:db/ident :qkdv/A0E0L-4I0M1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -4,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L-4I0M1H0T-1D0"})

(def A0E0L0.5I0M0.5TE0TM-1D0
  "A0E0L0.5I0M0.5TE0TM-1D0"
  {:db/ident :qkdv/A0E0L0.5I0M0.5TE0TM-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0.5,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0.5,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^0.5 M^0.5 T^-1\\)",
   :rdf/type :qudt/QuantityKindDimensionVector_CGS,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0.5I0M0.5TE0TM-1D0"})

(def A0E0L0.5I0M0.5TE0TM-2D0
  "A0E0L0.5I0M0.5TE0TM-2D0"
  {:db/ident :qkdv/A0E0L0.5I0M0.5TE0TM-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0.5,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0.5,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^0.5 M^0.5 T^-2\\)",
   :rdf/type :qudt/QuantityKindDimensionVector_CGS,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0.5I0M0.5TE0TM-2D0"})

(def A0E0L0.5I0M0.5TE0TM0D0
  "A0E0L0.5I0M0.5TE0TM0D0"
  {:db/ident :qkdv/A0E0L0.5I0M0.5TE0TM0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0.5,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0.5,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^0.5 M^0.5\\)",
   :rdf/type :qudt/QuantityKindDimensionVector_CGS,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0.5I0M0.5TE0TM0D0",
   :vaem/todo "Electric Charge should be ET"})

(def A0E0L0I0M-1H0T-1D0
  "A0E0L0I0M-1H0T-1D0"
  {:db/ident :qkdv/A0E0L0I0M-1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M-1H0T-1D0"})

(def A0E0L0I0M-1H0T0D0
  "A0E0L0I0M-1H0T0D0"
  {:db/ident :qkdv/A0E0L0I0M-1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M-1H0T0D0"})

(def A0E0L0I0M-1H0T1D0
  "A0E0L0I0M-1H0T1D0"
  {:db/ident :qkdv/A0E0L0I0M-1H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M-1H0T1D0"})

(def A0E0L0I0M-1H0T2D0
  "A0E0L0I0M-1H0T2D0"
  {:db/ident :qkdv/A0E0L0I0M-1H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M-1H0T2D0"})

(def A0E0L0I0M-1H1T3D0
  "A0E0L0I0M-1H1T3D0"
  {:db/ident :qkdv/A0E0L0I0M-1H1T3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ThermalInsulance,
   :qudt/latexDefinition "\\(M^-1 T^3 Θ\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M-1H1T3D0"})

(def A0E0L0I0M-2H0T0D0
  "A0E0L0I0M-2H0T0D0"
  {:db/ident :qkdv/A0E0L0I0M-2H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -2,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M-2H0T0D0"})

(def A0E0L0I0M0H-1T-1D0
  "A0E0L0I0M0H-1T-1D0"
  {:db/ident :qkdv/A0E0L0I0M0H-1T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/InverseTimeTemperature,
   :qudt/latexDefinition "\\(T^-1  Θ^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H-1T-1D0"})

(def A0E0L0I0M0H-1T0D0
  "A0E0L0I0M0H-1T0D0"
  {:db/ident :qkdv/A0E0L0I0M0H-1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "<http://qudt.org/2.1/vocab/dimensionvector>",
   :rdfs/label "A0E0L0I0M0H-1T0D0"})

(def A0E0L0I0M0H0T-1D0
  "A0E0L0I0M0H0T-1D0"
  {:db/ident :qkdv/A0E0L0I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Frequency,
   :qudt/latexDefinition "\\(T^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H0T-1D0"})

(def A0E0L0I0M0H0T-1D1
  "A0E0L0I0M0H0T-1D1"
  {:db/ident :qkdv/A0E0L0I0M0H0T-1D1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 1,
   :qudt/hasReferenceQuantityKind :quantitykind/AngularVelocity,
   :qudt/latexDefinition "\\(U T^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H0T-1D1"})

(def A0E0L0I0M0H0T-2D0
  "A0E0L0I0M0H0T-2D0"
  {:db/ident :qkdv/A0E0L0I0M0H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/AngularAcceleration,
   :qudt/latexDefinition "\\(U T^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H0T-2D0"})

(def A0E0L0I0M0H0T-2D1
  "A0E0L0I0M0H0T-2D1"
  {:db/ident :qkdv/A0E0L0I0M0H0T-2D1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 1,
   :qudt/hasReferenceQuantityKind :quantitykind/AngularAcceleration,
   :qudt/latexDefinition "\\(U T^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H0T-2D1"})

(def A0E0L0I0M0H0T0D1
  "A0E0L0I0M0H0T0D1"
  {:db/ident :qkdv/A0E0L0I0M0H0T0D1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 1,
   :qudt/hasReferenceQuantityKind :quantitykind/Dimensionless,
   :qudt/latexDefinition "\\(U\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H0T0D1"})

(def A0E0L0I0M0H0T1D0
  "A0E0L0I0M0H0T1D0"
  {:db/ident :qkdv/A0E0L0I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Time,
   :qudt/latexDefinition "\\(T\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H0T1D0"})

(def A0E0L0I0M0H0T1D1
  "A0E0L0I0M0H0T1D1"
  {:db/ident :qkdv/A0E0L0I0M0H0T1D1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 1,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H0T1D1"})

(def A0E0L0I0M0H0T2D0
  "A0E0L0I0M0H0T2D0"
  {:db/ident :qkdv/A0E0L0I0M0H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/TimeSquared,
   :qudt/latexDefinition "\\(T^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H0T2D0"})

(def A0E0L0I0M0H1T-1D0
  "A0E0L0I0M0H1T-1D0"
  {:db/ident :qkdv/A0E0L0I0M0H1T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/TemperaturePerTime,
   :qudt/latexDefinition "\\(T^-1 Θ\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H1T-1D0"})

(def A0E0L0I0M0H1T0D0
  "A0E0L0I0M0H1T0D0"
  {:db/ident :qkdv/A0E0L0I0M0H1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ThermodynamicTemperature,
   :qudt/latexDefinition "\\(H\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H1T0D0"})

(def A0E0L0I0M0H1T1D0
  "A0E0L0I0M0H1T1D0"
  {:db/ident :qkdv/A0E0L0I0M0H1T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/TimeTemperature,
   :qudt/latexDefinition "\\(T Θ\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H1T1D0"})

(def A0E0L0I0M0H2T-1D0
  "A0E0L0I0M0H2T-1D0"
  {:db/ident :qkdv/A0E0L0I0M0H2T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 2,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H2T-1D0"})

(def A0E0L0I0M0H2T0D0
  "A0E0L0I0M0H2T0D0"
  {:db/ident :qkdv/A0E0L0I0M0H2T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 2,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M0H2T0D0"})

(def A0E0L0I0M1H-1T-3D0
  "A0E0L0I0M1H-1T-3D0"
  {:db/ident :qkdv/A0E0L0I0M1H-1T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/CoefficientOfHeatTransfer,
   :qudt/latexDefinition "\\(M T^-3  Θ^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M1H-1T-3D0"})

(def A0E0L0I0M1H-4T-3D0
  "A0E0L0I0M1H-4T-3D0"
  {:db/ident :qkdv/A0E0L0I0M1H-4T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature -4,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/PowerPerAreaQuarticTemperature,
   :qudt/latexDefinition "\\(M T^{-3}.H^{-4}\\)",
   :qudt/latexSymbol "\\(M T^{-3}.\\Theta^{-4}\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M1H-4T-3D0"})

(def A0E0L0I0M1H0T-1D0
  "A0E0L0I0M1H0T-1D0"
  {:db/ident :qkdv/A0E0L0I0M1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MassFlowRate,
   :qudt/latexDefinition "\\(M T^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M1H0T-1D0"})

(def A0E0L0I0M1H0T-2D0
  "A0E0L0I0M1H0T-2D0"
  {:db/ident :qkdv/A0E0L0I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind [:quantitykind/EnergyPerArea
                                   :quantitykind/ForcePerLength],
   :qudt/latexDefinition "\\(M T^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M1H0T-2D0"})

(def A0E0L0I0M1H0T-3D-1
  "A0E0L0I0M1H0T-3D-1"
  {:db/ident :qkdv/A0E0L0I0M1H0T-3D-1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent -1,
   :qudt/latexDefinition "\\(U^-1 M T^-3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M1H0T-3D-1"})

(def A0E0L0I0M1H0T-3D0
  "A0E0L0I0M1H0T-3D0"
  {:db/ident :qkdv/A0E0L0I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/PowerPerArea,
   :qudt/latexDefinition "\\(M T^-3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M1H0T-3D0"})

(def A0E0L0I0M1H0T-4D0
  "A0E0L0I0M1H0T-4D0"
  {:db/ident :qkdv/A0E0L0I0M1H0T-4D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -4,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M1H0T-4D0"})

(def A0E0L0I0M1H0T0D0
  "A0E0L0I0M1H0T0D0"
  {:db/ident :qkdv/A0E0L0I0M1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Mass,
   :qudt/latexDefinition "\\(M\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M1H0T0D0"})

(def A0E0L0I0M1H0T2D0
  "A0E0L0I0M1H0T2D0"
  {:db/ident :qkdv/A0E0L0I0M1H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(M T^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M1H0T2D0"})

(def A0E0L0I0M1H1T0D0
  "A0E0L0I0M1H1T0D0"
  {:db/ident :qkdv/A0E0L0I0M1H1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MassTemperature,
   :qudt/latexDefinition "\\(M Θ\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M1H1T0D0"})

(def A0E0L0I0M2H0T-2D0
  "A0E0L0I0M2H0T-2D0"
  {:db/ident :qkdv/A0E0L0I0M2H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 2,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I0M2H0T-2D0"})

(def A0E0L0I1M0H0T0D0
  "A0E0L0I1M0H0T0D0"
  {:db/ident :qkdv/A0E0L0I1M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 1,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/LuminousIntensity,
   :qudt/latexDefinition "\\(J\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I1M0H0T0D0"})

(def A0E0L0I1M0H0T0D1
  "A0E0L0I1M0H0T0D1"
  {:db/ident :qkdv/A0E0L0I1M0H0T0D1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 1,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 1,
   :qudt/latexDefinition "\\(U J\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L0I1M0H0T0D1"})

(def A0E0L1.5I0M0.5TE0TM-1D0
  "A0E0L1.5I0M0.5TE0TM-1D0"
  {:db/ident :qkdv/A0E0L1.5I0M0.5TE0TM-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1.5,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0.5,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^1.5 M^0.5 T^-1\\)",
   :rdf/type :qudt/QuantityKindDimensionVector_CGS,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1.5I0M0.5TE0TM-1D0",
   :vaem/todo "Suspicious"})

(def A0E0L1.5I0M0.5TE0TM-2D0
  "A0E0L1.5I0M0.5TE0TM-2D0"
  {:db/ident :qkdv/A0E0L1.5I0M0.5TE0TM-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1.5,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0.5,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^1.5 M^0.5 T^-2\\)",
   :rdf/type :qudt/QuantityKindDimensionVector_CGS,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1.5I0M0.5TE0TM-2D0"})

(def A0E0L1I0M-1H0T1D0
  "A0E0L1I0M-1H0T1D0"
  {:db/ident :qkdv/A0E0L1I0M-1H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M-1H0T1D0"})

(def A0E0L1I0M-1H0T2D0
  "A0E0L1I0M-1H0T2D0"
  {:db/ident :qkdv/A0E0L1I0M-1H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/InversePressure,
   :qudt/latexDefinition "\\(L T^2 M^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M-1H0T2D0"})

(def A0E0L1I0M0H-1T0D0
  "A0E0L1I0M0H-1T0D0"
  {:db/ident :qkdv/A0E0L1I0M0H-1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/LinearThermalExpansion,
   :qudt/latexDefinition "\\(L .H^{-1}\\)",
   :qudt/latexSymbol "\\(L .\\Theta^{-1}\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M0H-1T0D0"})

(def A0E0L1I0M0H0T-1D0
  "A0E0L1I0M0H0T-1D0"
  {:db/ident :qkdv/A0E0L1I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/LinearVelocity,
   :qudt/latexDefinition "\\(L T^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M0H0T-1D0"})

(def A0E0L1I0M0H0T-2D0
  "A0E0L1I0M0H0T-2D0"
  {:db/ident :qkdv/A0E0L1I0M0H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind [:quantitykind/ThrustToMassRatio
                                   :quantitykind/LinearAcceleration],
   :qudt/latexDefinition "\\(L T^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M0H0T-2D0"})

(def A0E0L1I0M0H0T-3D0
  "A0E0L1I0M0H0T-3D0"
  {:db/ident :qkdv/A0E0L1I0M0H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M0H0T-3D0"})

(def A0E0L1I0M0H0T0D0
  "A0E0L1I0M0H0T0D0"
  {:db/ident :qkdv/A0E0L1I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Length,
   :qudt/latexDefinition "\\(L\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M0H0T0D0"})

(def A0E0L1I0M0H0T1D0
  "A0E0L1I0M0H0T1D0"
  {:db/ident :qkdv/A0E0L1I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M0H0T1D0"})

(def A0E0L1I0M0H0T2D0
  "A0E0L1I0M0H0T2D0"
  {:db/ident :qkdv/A0E0L1I0M0H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M0H0T2D0"})

(def A0E0L1I0M0H1T-1D0
  "A0E0L1I0M0H1T-1D0"
  {:db/ident :qkdv/A0E0L1I0M0H1T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M0H1T-1D0"})

(def A0E0L1I0M0H1T0D0
  "A0E0L1I0M0H1T0D0"
  {:db/ident :qkdv/A0E0L1I0M0H1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/LengthTemperature,
   :qudt/latexSymbol ["\\(L \\cdot H\\)" "\\(L \\cdot \\Theta\\)"],
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M0H1T0D0"})

(def A0E0L1I0M0H1T1D0
  "A0E0L1I0M0H1T1D0"
  {:db/ident :qkdv/A0E0L1I0M0H1T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M0H1T1D0"})

(def A0E0L1I0M1H-1T-3D0
  "A0E0L1I0M1H-1T-3D0"
  {:db/ident :qkdv/A0E0L1I0M1H-1T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ThermalConductivity,
   :qudt/latexSymbol ["\\(L \\cdot M /( T^3 \\cdot \\Theta^1)\\)"
                      "\\(L.M.T^{-3} .\\Theta^{-1}\\)"],
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M1H-1T-3D0"})

(def A0E0L1I0M1H0T-1D0
  "A0E0L1I0M1H0T-1D0"
  {:db/ident :qkdv/A0E0L1I0M1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/LinearMomentum,
   :qudt/latexDefinition "\\(L M T^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M1H0T-1D0"})

(def A0E0L1I0M1H0T-2D0
  "A0E0L1I0M1H0T-2D0"
  {:db/ident :qkdv/A0E0L1I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Force,
   :qudt/latexDefinition "\\(L M T^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M1H0T-2D0"})

(def A0E0L1I0M1H0T-3D0
  "A0E0L1I0M1H0T-3D0"
  {:db/ident :qkdv/A0E0L1I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M1H0T-3D0"})

(def A0E0L1I0M1H0T0D0
  "A0E0L1I0M1H0T0D0"
  {:db/ident :qkdv/A0E0L1I0M1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/LengthMass,
   :qudt/latexDefinition "\\(L M\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L1I0M1H0T0D0"})

(def A0E0L2I0M-1H0T0D0
  "A0E0L2I0M-1H0T0D0"
  {:db/ident :qkdv/A0E0L2I0M-1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M-1H0T0D0"})

(def A0E0L2I0M-1H1T-1D0
  "A0E0L2I0M-1H1T-1D0"
  {:db/ident :qkdv/A0E0L2I0M-1H1T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M-1H1T-1D0"})

(def A0E0L2I0M0H-1T-2D0
  "A0E0L2I0M0H-1T-2D0"
  {:db/ident :qkdv/A0E0L2I0M0H-1T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/SpecificHeatCapacity,
   :qudt/latexDefinition "\\(L^2 T^-2  Θ^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H-1T-2D0"})

(def A0E0L2I0M0H-1T-3D0
  "A0E0L2I0M0H-1T-3D0"
  {:db/ident :qkdv/A0E0L2I0M0H-1T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^2 T^-3 Θ^-1 N^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H-1T-3D0"})

(def A0E0L2I0M0H-1T0D0
  "A0E0L2I0M0H-1T0D0"
  {:db/ident :qkdv/A0E0L2I0M0H-1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/AreaThermalExpansion,
   :qudt/latexDefinition "\\(L^2  Θ^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H-1T0D0"})

(def A0E0L2I0M0H0T-1D0
  "A0E0L2I0M0H0T-1D0"
  {:db/ident :qkdv/A0E0L2I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/AreaPerTime,
   :qudt/latexDefinition "\\(L^2 T^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H0T-1D0"})

(def A0E0L2I0M0H0T-2D0
  "A0E0L2I0M0H0T-2D0"
  {:db/ident :qkdv/A0E0L2I0M0H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/SpecificEnergy,
   :qudt/latexDefinition "\\(L^2 T^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H0T-2D0"})

(def A0E0L2I0M0H0T-3D0
  "A0E0L2I0M0H0T-3D0"
  {:db/ident :qkdv/A0E0L2I0M0H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/AbsorbedDoseRate,
   :qudt/latexDefinition "\\(L^2 T^-3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H0T-3D0"})

(def A0E0L2I0M0H0T-4D0
  "A0E0L2I0M0H0T-4D0"
  {:db/ident :qkdv/A0E0L2I0M0H0T-4D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -4,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H0T-4D0"})

(def A0E0L2I0M0H0T0D0
  "A0E0L2I0M0H0T0D0"
  {:db/ident :qkdv/A0E0L2I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Area,
   :qudt/latexDefinition "\\(L^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H0T0D0"})

(def A0E0L2I0M0H0T0D1
  "A0E0L2I0M0H0T0D1"
  {:db/ident :qkdv/A0E0L2I0M0H0T0D1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 1,
   :qudt/latexDefinition "\\(U L^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H0T0D1"})

(def A0E0L2I0M0H0T1D0
  "A0E0L2I0M0H0T1D0"
  {:db/ident :qkdv/A0E0L2I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/AreaTime,
   :qudt/latexDefinition "\\(L^2 T\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H0T1D0"})

(def A0E0L2I0M0H0T2D0
  "A0E0L2I0M0H0T2D0"
  {:db/ident :qkdv/A0E0L2I0M0H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H0T2D0"})

(def A0E0L2I0M0H1T0D0
  "A0E0L2I0M0H1T0D0"
  {:db/ident :qkdv/A0E0L2I0M0H1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/AreaTemperature,
   :qudt/latexDefinition "\\(L^2 Θ\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H1T0D0"})

(def A0E0L2I0M0H1T1D0
  "A0E0L2I0M0H1T1D0"
  {:db/ident :qkdv/A0E0L2I0M0H1T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/AreaTimeTemperature,
   :qudt/latexDefinition "\\(L^2 T Θ\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M0H1T1D0"})

(def A0E0L2I0M1H-1T-2D0
  "A0E0L2I0M1H-1T-2D0"
  {:db/ident :qkdv/A0E0L2I0M1H-1T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/EnergyPerTemperature,
   :qudt/latexDefinition "\\(L^2 M T^-2 Θ^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M1H-1T-2D0"})

(def A0E0L2I0M1H-1T-3D0
  "A0E0L2I0M1H-1T-3D0"
  {:db/ident :qkdv/A0E0L2I0M1H-1T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^2 M T^-3 Θ^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M1H-1T-3D0"})

(def A0E0L2I0M1H0T-1D0
  "A0E0L2I0M1H0T-1D0"
  {:db/ident :qkdv/A0E0L2I0M1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/AngularMomentum,
   :qudt/latexDefinition "\\(L^2 M T^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M1H0T-1D0"})

(def A0E0L2I0M1H0T-2D0
  "A0E0L2I0M1H0T-2D0"
  {:db/ident :qkdv/A0E0L2I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind [:quantitykind/Torque :quantitykind/Energy],
   :qudt/latexDefinition "\\(L^2\\,M\\,T^{-2}\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M1H0T-2D0"})

(def A0E0L2I0M1H0T-3D-1
  "A0E0L2I0M1H0T-3D-1"
  {:db/ident :qkdv/A0E0L2I0M1H0T-3D-1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent -1,
   :qudt/latexDefinition "\\(U^-1 L^2 M T^-3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M1H0T-3D-1"})

(def A0E0L2I0M1H0T-3D0
  "A0E0L2I0M1H0T-3D0"
  {:db/ident :qkdv/A0E0L2I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Power,
   :qudt/latexDefinition "\\(L^2 M T^-3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M1H0T-3D0"})

(def A0E0L2I0M1H0T0D0
  "A0E0L2I0M1H0T0D0"
  {:db/ident :qkdv/A0E0L2I0M1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MomentOfInertia,
   :qudt/latexDefinition "\\(L^2 M\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L2I0M1H0T0D0"})

(def A0E0L3I0M-1H-1T0D0
  "A0E0L3I0M-1H-1T0D0"
  {:db/ident :qkdv/A0E0L3I0M-1H-1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/SpecificHeatPressure,
   :qudt/latexDefinition "\\(L^3 M^-1 Θ^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L3I0M-1H-1T0D0"})

(def A0E0L3I0M-1H0T-2D0
  "A0E0L3I0M-1H0T-2D0"
  {:db/ident :qkdv/A0E0L3I0M-1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^3 M^-1 T^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L3I0M-1H0T-2D0"})

(def A0E0L3I0M-1H0T0D0
  "A0E0L3I0M-1H0T0D0"
  {:db/ident :qkdv/A0E0L3I0M-1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/SpecificVolume,
   :qudt/latexDefinition "\\(L^3 M^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L3I0M-1H0T0D0"})

(def A0E0L3I0M0H-1T0D0
  "A0E0L3I0M0H-1T0D0"
  {:db/ident :qkdv/A0E0L3I0M0H-1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/VolumeThermalExpansion,
   :qudt/latexDefinition "\\(L^3 Θ^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L3I0M0H-1T0D0"})

(def A0E0L3I0M0H0T-1D0
  "A0E0L3I0M0H0T-1D0"
  {:db/ident :qkdv/A0E0L3I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/VolumeFlowRate,
   :qudt/latexDefinition "\\(L^3 T^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L3I0M0H0T-1D0"})

(def A0E0L3I0M0H0T-2D0
  "A0E0L3I0M0H0T-2D0"
  {:db/ident :qkdv/A0E0L3I0M0H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/StandardGravitationalParameter,
   :qudt/latexDefinition "\\(L^3 T^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L3I0M0H0T-2D0"})

(def A0E0L3I0M0H0T0D0
  "A0E0L3I0M0H0T0D0"
  {:db/ident :qkdv/A0E0L3I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Volume,
   :qudt/latexDefinition "\\(L^3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L3I0M0H0T0D0"})

(def A0E0L3I0M0H1T0D0
  "A0E0L3I0M0H1T0D0"
  {:db/ident :qkdv/A0E0L3I0M0H1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L3I0M0H1T0D0"})

(def A0E0L3I0M1H0T-1D0
  "A0E0L3I0M1H0T-1D0"
  {:db/ident :qkdv/A0E0L3I0M1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MomentOfForce,
   :qudt/latexDefinition "\\(L^3 M T^-1\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L3I0M1H0T-1D0"})

(def A0E0L3I0M1H0T-2D0
  "A0E0L3I0M1H0T-2D0"
  {:db/ident :qkdv/A0E0L3I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind [:quantitykind/LengthEnergy
                                   :quantitykind/ThermalEnergyLength],
   :qudt/latexDefinition "\\(L^3 M T^-2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L3I0M1H0T-2D0"})

(def A0E0L4I0M0H0T-1D0
  "A0E0L4I0M0H0T-1D0"
  {:db/ident :qkdv/A0E0L4I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 4,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L4I0M0H0T-1D0"})

(def A0E0L4I0M0H0T-2D0
  "A0E0L4I0M0H0T-2D0"
  {:db/ident :qkdv/A0E0L4I0M0H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 4,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L4I0M0H0T-2D0"})

(def A0E0L4I0M0H0T0D0
  "A0E0L4I0M0H0T0D0"
  {:db/ident :qkdv/A0E0L4I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 4,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/SecondAxialMomentOfArea,
   :qudt/latexDefinition "\\(L^4\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L4I0M0H0T0D0"})

(def A0E0L4I0M1H0T-2D0
  "A0E0L4I0M1H0T-2D0"
  {:db/ident :qkdv/A0E0L4I0M1H0T-2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 4,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -2,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L4I0M1H0T-2D0"})

(def A0E0L4I0M1H0T-3D-1
  "A0E0L4I0M1H0T-3D-1"
  {:db/ident :qkdv/A0E0L4I0M1H0T-3D-1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 4,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent -1,
   :qudt/latexDefinition "\\(U^-1 L^4 M T^-3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L4I0M1H0T-3D-1"})

(def A0E0L4I0M1H0T-3D0
  "A0E0L4I0M1H0T-3D0"
  {:db/ident :qkdv/A0E0L4I0M1H0T-3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 4,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/PowerArea,
   :qudt/latexDefinition "\\(L^4 M T^-3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L4I0M1H0T-3D0"})

(def A0E0L4I0M2H0T-4D0
  "A0E0L4I0M2H0T-4D0"
  {:db/ident :qkdv/A0E0L4I0M2H0T-4D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 4,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 2,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -4,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/SquareEnergy,
   :qudt/latexDefinition "\\(L^4 M^2 T^-4\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L4I0M2H0T-4D0"})

(def A0E0L5I0M0H0T0D0
  "A0E0L5I0M0H0T0D0"
  {:db/ident :qkdv/A0E0L5I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 5,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L5I0M0H0T0D0"})

(def A0E0L6I0M0H0T0D0
  "A0E0L6I0M0H0T0D0"
  {:db/ident :qkdv/A0E0L6I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 6,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E0L6I0M0H0T0D0"})

(def A0E1L-1I0M-1H0T2D0
  "A0E1L-1I0M-1H0T2D0"
  {:db/ident :qkdv/A0E1L-1I0M-1H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MagneticReluctivity,
   :qudt/latexDefinition "\\(L^{-1} M^{-1} T^2 I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L-1I0M-1H0T2D0"})

(def A0E1L-1I0M0H0T0D0
  "A0E1L-1I0M0H0T0D0"
  {:db/ident :qkdv/A0E1L-1I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-1 I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L-1I0M0H0T0D0"})

(def A0E1L-1I0M0H0T1D0
  "A0E1L-1I0M0H0T1D0"
  {:db/ident :qkdv/A0E1L-1I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricChargeLineDensity,
   :qudt/latexDefinition "\\(L^-1 T I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L-1I0M0H0T1D0"})

(def A0E1L-2I0M-1H0T2D0
  "A0E1L-2I0M-1H0T2D0"
  {:db/ident :qkdv/A0E1L-2I0M-1H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/InverseMagneticFlux,
   :qudt/latexDefinition "\\(L^-2 M^-1 T^2 I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L-2I0M-1H0T2D0"})

(def A0E1L-2I0M-1H0T3D0
  "A0E1L-2I0M-1H0T3D0"
  {:db/ident :qkdv/A0E1L-2I0M-1H0T3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 3,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricCurrentPerUnitEnergy,
   :qudt/latexDefinition "\\(L^-2 M^-1 T^3 I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L-2I0M-1H0T3D0"})

(def A0E1L-2I0M0H-2T0D0
  "A0E1L-2I0M0H-2T0D0"
  {:db/ident :qkdv/A0E1L-2I0M0H-2T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature -2,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L-2I0M0H-2T0D0"})

(def A0E1L-2I0M0H0T0D0
  "A0E1L-2I0M0H0T0D0"
  {:db/ident :qkdv/A0E1L-2I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricCurrentDensity,
   :qudt/latexDefinition "\\(L^-2 I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L-2I0M0H0T0D0"})

(def A0E1L-2I0M0H0T1D0
  "A0E1L-2I0M0H0T1D0"
  {:db/ident :qkdv/A0E1L-2I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricChargePerArea,
   :qudt/latexDefinition "\\(L^-2 T I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L-2I0M0H0T1D0"})

(def A0E1L-3I0M0H0T1D0
  "A0E1L-3I0M0H0T1D0"
  {:db/ident :qkdv/A0E1L-3I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricChargeVolumeDensity,
   :qudt/latexDefinition "\\(L^-3 T I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L-3I0M0H0T1D0"})

(def A0E1L0I0M-1H0T0D0
  "A0E1L0I0M-1H0T0D0"
  {:db/ident :qkdv/A0E1L0I0M-1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ExposureRate,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L0I0M-1H0T0D0"})

(def A0E1L0I0M-1H0T1D0
  "A0E1L0I0M-1H0T1D0"
  {:db/ident :qkdv/A0E1L0I0M-1H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricChargePerMass,
   :qudt/latexDefinition "\\(M^-1 T I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L0I0M-1H0T1D0"})

(def A0E1L0I0M-1H0T4D0
  "A0E1L0I0M-1H0T4D0"
  {:db/ident :qkdv/A0E1L0I0M-1H0T4D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 4,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L0I0M-1H0T4D0"})

(def A0E1L0I0M-1H1T2D0
  "A0E1L0I0M-1H1T2D0"
  {:db/ident :qkdv/A0E1L0I0M-1H1T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind
   :quantitykind/TemperaturePerMagneticFluxDensity,
   :qudt/latexDefinition "\\(M^-1 T^2 I Θ\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L0I0M-1H1T2D0"})

(def A0E1L0I0M0H-1T0D0
  "A0E1L0I0M0H-1T0D0"
  {:db/ident :qkdv/A0E1L0I0M0H-1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature -1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind
   :quantitykind/ElectricCurrentPerUnitTemperature,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L0I0M0H-1T0D0"})

(def A0E1L0I0M0H0T0D-1
  "A0E1L0I0M0H0T0D-1"
  {:db/ident :qkdv/A0E1L0I0M0H0T0D-1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent -1,
   :qudt/latexDefinition "\\(U^-1 I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L0I0M0H0T0D-1"})

(def A0E1L0I0M0H0T0D0
  "A0E1L0I0M0H0T0D0"
  {:db/ident :qkdv/A0E1L0I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricCurrent,
   :qudt/latexDefinition "\\(I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L0I0M0H0T0D0"})

(def A0E1L0I0M0H0T0D1
  "A0E1L0I0M0H0T0D1"
  {:db/ident :qkdv/A0E1L0I0M0H0T0D1,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 1,
   :qudt/latexDefinition "\\(U I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L0I0M0H0T0D1"})

(def A0E1L0I0M0H0T1D0
  "A0E1L0I0M0H0T1D0"
  {:db/ident :qkdv/A0E1L0I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricCharge,
   :qudt/latexDefinition "\\(T I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L0I0M0H0T1D0"})

(def A0E1L1I0M0H0T1D0
  "A0E1L1I0M0H0T1D0"
  {:db/ident :qkdv/A0E1L1I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricDipoleMoment,
   :qudt/latexDefinition "\\(L T I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L1I0M0H0T1D0"})

(def A0E1L2I0M0H0T0D0
  "A0E1L2I0M0H0T0D0"
  {:db/ident :qkdv/A0E1L2I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MagneticDipoleMoment,
   :qudt/latexDefinition "\\(L^2 I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L2I0M0H0T0D0"})

(def A0E1L2I0M0H0T1D0
  "A0E1L2I0M0H0T1D0"
  {:db/ident :qkdv/A0E1L2I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 1,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/ElectricQuadrupoleMoment,
   :qudt/latexDefinition "\\(L^2 T I\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E1L2I0M0H0T1D0"})

(def A0E2L-2I0M-1H0T2D0
  "A0E2L-2I0M-1H0T2D0"
  {:db/ident :qkdv/A0E2L-2I0M-1H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 2,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-2 M^-1 T^2 I^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E2L-2I0M-1H0T2D0"})

(def A0E2L-2I0M-1H0T3D0
  "A0E2L-2I0M-1H0T3D0"
  {:db/ident :qkdv/A0E2L-2I0M-1H0T3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 2,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 3,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-2 M^-1 T^3 I^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E2L-2I0M-1H0T3D0"})

(def A0E2L-2I0M-1H0T4D0
  "A0E2L-2I0M-1H0T4D0"
  {:db/ident :qkdv/A0E2L-2I0M-1H0T4D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 2,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 4,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Capacitance,
   :qudt/latexDefinition "\\(L^-2 M^-1 T^4 I^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E2L-2I0M-1H0T4D0"})

(def A0E2L-3I0M-1H0T3D0
  "A0E2L-3I0M-1H0T3D0"
  {:db/ident :qkdv/A0E2L-3I0M-1H0T3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 2,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 3,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E2L-3I0M-1H0T3D0"})

(def A0E2L-3I0M-1H0T4D0
  "A0E2L-3I0M-1H0T4D0"
  {:db/ident :qkdv/A0E2L-3I0M-1H0T4D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 2,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 4,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Permittivity,
   :qudt/latexDefinition "\\(L^-3 M^-1 T^4 I^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E2L-3I0M-1H0T4D0"})

(def A0E2L-4I0M-1H0T3D0
  "A0E2L-4I0M-1H0T3D0"
  {:db/ident :qkdv/A0E2L-4I0M-1H0T3D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 2,
   :qudt/dimensionExponentForLength -4,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 3,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E2L-4I0M-1H0T3D0"})

(def A0E2L0I0M-1H0T4D0
  "A0E2L0I0M-1H0T4D0"
  {:db/ident :qkdv/A0E2L0I0M-1H0T4D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 2,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 4,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/Polarizability,
   :qudt/latexDefinition "\\(M^-1 T^4 I^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E2L0I0M-1H0T4D0"})

(def A0E2L0I0M0H0T1D0
  "A0E2L0I0M0H0T1D0"
  {:db/ident :qkdv/A0E2L0I0M0H0T1D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 2,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/VoltageLoss,
   :qudt/symbol "T I I^2",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E2L0I0M0H0T1D0"})

(def A0E2L2I0M-1H0T2D0
  "A0E2L2I0M-1H0T2D0"
  {:db/ident :qkdv/A0E2L2I0M-1H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 2,
   :qudt/dimensionExponentForLength 2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind
   :quantitykind/EnergyPerSquareMagneticFluxDensity,
   :qudt/latexDefinition "\\(L^2 M^-1 T^2 I^2\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E2L2I0M-1H0T2D0"})

(def A0E3L-1I0M-2H0T7D0
  "A0E3L-1I0M-2H0T7D0"
  {:db/ident :qkdv/A0E3L-1I0M-2H0T7D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 3,
   :qudt/dimensionExponentForLength -1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -2,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 7,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind
   :quantitykind/CubicElectricDipoleMomentPerSquareEnergy,
   :qudt/latexDefinition "\\(L^-1 M^-2 T^7 I^3\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E3L-1I0M-2H0T7D0"})

(def A0E4L-2I0M-3H0T10D0
  "A0E4L-2I0M-3H0T10D0"
  {:db/ident :qkdv/A0E4L-2I0M-3H0T10D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 4,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -3,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 10,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind
   :quantitykind/QuarticElectricDipoleMomentPerCubicEnergy,
   :qudt/latexDefinition "\\(L^-2 M^-3 T^10 I^4\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E4L-2I0M-3H0T10D0"})

(def A0E4L-5I0M-3H0T10D0
  "A0E4L-5I0M-3H0T10D0"
  {:db/ident :qkdv/A0E4L-5I0M-3H0T10D0,
   :qudt/dimensionExponentForAmountOfSubstance 0,
   :qudt/dimensionExponentForElectricCurrent 4,
   :qudt/dimensionExponentForLength -5,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -3,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 10,
   :qudt/dimensionlessExponent 0,
   :qudt/latexDefinition "\\(L^-5 M^-3 T^10 I^4\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A0E4L-5I0M-3H0T10D0"})

(def A1E0L-2I0M0H0T-1D0
  "A1E0L-2I0M0H0T-1D0"
  {:db/ident :qkdv/A1E0L-2I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L-2I0M0H0T-1D0"})

(def A1E0L-2I0M0H0T0D0
  "A1E0L-2I0M0H0T0D0"
  {:db/ident :qkdv/A1E0L-2I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -2,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L-2I0M0H0T0D0"})

(def A1E0L-3I0M-1H0T2D0
  "A1E0L-3I0M-1H0T2D0"
  {:db/ident :qkdv/A1E0L-3I0M-1H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_CGS],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L-3I0M-1H0T2D0"})

(def A1E0L-3I0M0H0T-1D0
  "A1E0L-3I0M0H0T-1D0"
  {:db/ident :qkdv/A1E0L-3I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L-3I0M0H0T-1D0"})

(def A1E0L-3I0M0H0T0D0
  "A1E0L-3I0M0H0T0D0"
  {:db/ident :qkdv/A1E0L-3I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength -3,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/AmountOfSubstancePerUnitVolume,
   :qudt/latexDefinition "\\(L^-3 N\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L-3I0M0H0T0D0"})

(def A1E0L0I0M-1H0T-1D0
  "A1E0L0I0M-1H0T-1D0"
  {:db/ident :qkdv/A1E0L0I0M-1H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_CGS
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L0I0M-1H0T-1D0"})

(def A1E0L0I0M-1H0T0D0
  "A1E0L0I0M-1H0T0D0"
  {:db/ident :qkdv/A1E0L0I0M-1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/AmountOfSubstancePerUnitMass,
   :qudt/latexDefinition "\\(M^-1 N\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L0I0M-1H0T0D0"})

(def A1E0L0I0M0H0T-1D0
  "A1E0L0I0M0H0T-1D0"
  {:db/ident :qkdv/A1E0L0I0M0H0T-1D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime -1,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/CatalyticActivity,
   :qudt/latexDefinition "\\(T^-1 N\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L0I0M0H0T-1D0"})

(def A1E0L0I0M0H0T0D0
  "A1E0L0I0M0H0T0D0"
  {:db/ident :qkdv/A1E0L0I0M0H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/AmountOfSubstance,
   :qudt/latexDefinition "\\(N\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_Imperial],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L0I0M0H0T0D0"})

(def A1E0L0I0M0H1T0D0
  "A1E0L0I0M0H1T0D0"
  {:db/ident :qkdv/A1E0L0I0M0H1T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 0,
   :qudt/dimensionExponentForThermodynamicTemperature 1,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/TemperatureAmountOfSubstance,
   :qudt/latexDefinition "\\(\\theta N\\)",
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_SI
              :qudt/QuantityKindDimensionVector_ISO],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L0I0M0H1T0D0"})

(def A1E0L0I0M1H0T0D0
  "A1E0L0I0M1H0T0D0"
  {:db/ident :qkdv/A1E0L0I0M1H0T0D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 0,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass 1,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 0,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind :quantitykind/MassAmountOfSubstance,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L0I0M1H0T0D0"})

(def A1E0L1I0M-2H0T2D0
  "A1E0L1I0M-2H0T2D0"
  {:db/ident :qkdv/A1E0L1I0M-2H0T2D0,
   :qudt/dimensionExponentForAmountOfSubstance 1,
   :qudt/dimensionExponentForElectricCurrent 0,
   :qudt/dimensionExponentForLength 1,
   :qudt/dimensionExponentForLuminousIntensity 0,
   :qudt/dimensionExponentForMass -2,
   :qudt/dimensionExponentForThermodynamicTemperature 0,
   :qudt/dimensionExponentForTime 2,
   :qudt/dimensionlessExponent 0,
   :qudt/hasReferenceQuantityKind
   :quantitykind/AmountOfSubstancePerUnitMassPressure,
   :rdf/type [:qudt/QuantityKindDimensionVector_Imperial
              :qudt/QuantityKindDimensionVector_ISO
              :qudt/QuantityKindDimensionVector_SI],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/dimensionvector",
   :rdfs/label "A1E0L1I0M-2H0T2D0"})