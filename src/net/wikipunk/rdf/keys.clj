(ns net.wikipunk.rdf.keys
  "http://purl.org/NET/c4dm/keys.owl#"
  {:dcat/downloadURL  "https://motools.sourceforge.net/keys/keys.owl",
   :rdf/about         "http://purl.org/NET/c4dm/keys.owl",
   :rdf/ns-prefix-map {"keys" "http://purl.org/NET/c4dm/keys.owl#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "keys",
   :rdfa/uri          "http://purl.org/NET/c4dm/keys.owl#"})

(def A
  {:rdf/about :keys/A,
   :rdf/type  :keys/Note})

(def AFlat
  {:rdf/about :keys/AFlat,
   :rdf/type  :keys/Note})

(def AFlatMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/AFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/A-flat_major",
   :rdf/about      :keys/AFlatMajor,
   :rdf/type       :keys/Key})

(def AFlatMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/AFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/A-flat_minor",
   :rdf/about      :keys/AFlatMinor,
   :rdf/type       :keys/Key})

(def AMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/A,
   :keys/wikipedia "http://en.wikipedia.org/wiki/A_major",
   :rdf/about      :keys/AMajor,
   :rdf/type       :keys/Key})

(def AMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/A,
   :keys/wikipedia "http://en.wikipedia.org/wiki/A_minor",
   :rdf/about      :keys/AMinor,
   :rdf/type       :keys/Key})

(def ASharp
  {:rdf/about :keys/ASharp,
   :rdf/type  :keys/Note})

(def ASharpMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/ASharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/A-sharp_minor",
   :rdf/about      :keys/ASharpMinor,
   :rdf/type       :keys/Key})

(def B
  {:rdf/about :keys/B,
   :rdf/type  :keys/Note})

(def BFlat
  {:rdf/about :keys/BFlat,
   :rdf/type  :keys/Note})

(def BFlatMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/BFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/B-flat_major",
   :rdf/about      :keys/BFlatMajor,
   :rdf/type       :keys/Key})

(def BFlatMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/BFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/B-flat_minor",
   :rdf/about      :keys/BFlatMinor,
   :rdf/type       :keys/Key})

(def BMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/B,
   :keys/wikipedia "http://en.wikipedia.org/wiki/B_major",
   :rdf/about      :keys/BMajor,
   :rdf/type       :keys/Key})

(def BMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/B,
   :keys/wikipedia "http://en.wikipedia.org/wiki/B_minor",
   :rdf/about      :keys/BMinor,
   :rdf/type       :keys/Key})

(def C
  {:rdf/about :keys/C,
   :rdf/type  :keys/Note})

(def CFlat
  {:rdf/about :keys/CFlat,
   :rdf/type  :keys/Note})

(def CFlatMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/CFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/C-flat_major",
   :rdf/about      :keys/CFlatMajor,
   :rdf/type       :keys/Key})

(def CMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/C,
   :keys/wikipedia "http://en.wikipedia.org/wiki/C_major",
   :rdf/about      :keys/CMajor,
   :rdf/type       :keys/Key})

(def CMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/C,
   :keys/wikipedia "http://en.wikipedia.org/wiki/C_minor",
   :rdf/about      :keys/CMinor,
   :rdf/type       :keys/Key})

(def CSharp
  {:rdf/about :keys/CSharp,
   :rdf/type  :keys/Note})

(def CSharpMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/CSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/C-sharp_major",
   :rdf/about      :keys/CSharpMajor,
   :rdf/type       :keys/Key})

(def CSharpMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/CSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/C-sharp_minor",
   :rdf/about      :keys/CSharpMinor,
   :rdf/type       :keys/Key})

(def D
  {:rdf/about :keys/D,
   :rdf/type  :keys/Note})

(def DFlat
  {:rdf/about :keys/DFlat,
   :rdf/type  :keys/Note})

(def DFlatMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/DFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/D-flat_major",
   :rdf/about      :keys/DFlatMajor,
   :rdf/type       :keys/Key})

(def DMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/D,
   :keys/wikipedia "http://en.wikipedia.org/wiki/D_major",
   :rdf/about      :keys/DMajor,
   :rdf/type       :keys/Key})

(def DMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/D,
   :keys/wikipedia "http://en.wikipedia.org/wiki/D_minor",
   :rdf/about      :keys/DMinor,
   :rdf/type       :keys/Key})

(def DSharp
  {:rdf/about :keys/DSharp,
   :rdf/type  :keys/Note})

(def DSharpMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/DSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/D-sharp_minor",
   :rdf/about      :keys/DSharpMinor,
   :rdf/type       :keys/Key})

(def E
  {:rdf/about :keys/E,
   :rdf/type  :keys/Note})

(def EFlat
  {:rdf/about :keys/EFlat,
   :rdf/type  :keys/Note})

(def EFlatMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/EFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/E-flat_major",
   :rdf/about      :keys/EFlatMajor,
   :rdf/type       :keys/Key})

(def EFlatMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/EFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/E-flat_minor",
   :rdf/about      :keys/EFlatMinor,
   :rdf/type       :keys/Key})

(def EMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/E,
   :keys/wikipedia "http://en.wikipedia.org/wiki/E_major",
   :rdf/about      :keys/EMajor,
   :rdf/type       :keys/Key})

(def EMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/E,
   :keys/wikipedia "http://en.wikipedia.org/wiki/E_minor",
   :rdf/about      :keys/EMinor,
   :rdf/type       :keys/Key})

(def F
  {:rdf/about :keys/F,
   :rdf/type  :keys/Note})

(def FMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/F,
   :keys/wikipedia "http://en.wikipedia.org/wiki/F_major",
   :rdf/about      :keys/FMajor,
   :rdf/type       :keys/Key})

(def FMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/F,
   :keys/wikipedia "http://en.wikipedia.org/wiki/F_minor",
   :rdf/about      :keys/FMinor,
   :rdf/type       :keys/Key})

(def FSharp
  {:rdf/about :keys/FSharp,
   :rdf/type  :keys/Note})

(def FSharpMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/FSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/F-sharp_major",
   :rdf/about      :keys/FSharpMajor,
   :rdf/type       :keys/Key})

(def FSharpMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/FSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/F-sharp_minor",
   :rdf/about      :keys/FSharpMinor,
   :rdf/type       :keys/Key})

(def G
  {:rdf/about :keys/G,
   :rdf/type  :keys/Note})

(def GFlat
  {:rdf/about :keys/GFlat,
   :rdf/type  :keys/Note})

(def GFlatMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/GFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/G-flat_major",
   :rdf/about      :keys/GFlatMajor,
   :rdf/type       :keys/Key})

(def GMajor
  {:keys/mode      "major",
   :keys/tonic     :keys/G,
   :keys/wikipedia "http://en.wikipedia.org/wiki/G_major",
   :rdf/about      :keys/GMajor,
   :rdf/type       :keys/Key})

(def GMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/G,
   :keys/wikipedia "http://en.wikipedia.org/wiki/G_minor",
   :rdf/about      :keys/GMinor,
   :rdf/type       :keys/Key})

(def GSharp
  {:rdf/about :keys/GSharp,
   :rdf/type  :keys/Note})

(def GSharpMinor
  {:keys/mode      "minor",
   :keys/tonic     :keys/GSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/G-sharp_minor",
   :rdf/about      :keys/GSharpMinor,
   :rdf/type       :keys/Key})

(def Key
  {:rdf/about :keys/Key,
   :rdf/type  :owl/Class})

(def Note
  {:rdf/about :keys/Note,
   :rdf/type  :owl/Class})

(def mode
  {:rdf/about   :keys/mode,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :keys/Key,
   :rdfs/range  {:owl/oneOf ["major" "minor"],
                 :rdf/type  :owl/DataRange}})

(def tonic
  {:rdf/about   :keys/tonic,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :keys/Key})

(def wikipedia
  {:rdf/about  :keys/wikipedia,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/range :xsd/anyURI})