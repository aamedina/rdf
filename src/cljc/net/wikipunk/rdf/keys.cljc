(ns net.wikipunk.rdf.keys
  "http://purl.org/NET/c4dm/keys.owl"
  {:dcat/downloadURL  "https://motools.sourceforge.net/keys/keys.owl",
   :rdf/ns-prefix-map {"keys" "http://purl.org/NET/c4dm/keys.owl#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "keys",
   :rdfa/uri          "http://purl.org/NET/c4dm/keys.owl"})

(def A
  {:db/ident :keys/A,
   :rdf/type :keys/Note})

(def AFlat
  {:db/ident :keys/AFlat,
   :rdf/type :keys/Note})

(def AFlatMajor
  {:db/ident       :keys/AFlatMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/AFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/A-flat_major",
   :rdf/type       :keys/Key})

(def AFlatMinor
  {:db/ident       :keys/AFlatMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/AFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/A-flat_minor",
   :rdf/type       :keys/Key})

(def AMajor
  {:db/ident       :keys/AMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/A,
   :keys/wikipedia "http://en.wikipedia.org/wiki/A_major",
   :rdf/type       :keys/Key})

(def AMinor
  {:db/ident       :keys/AMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/A,
   :keys/wikipedia "http://en.wikipedia.org/wiki/A_minor",
   :rdf/type       :keys/Key})

(def ASharp
  {:db/ident :keys/ASharp,
   :rdf/type :keys/Note})

(def ASharpMinor
  {:db/ident       :keys/ASharpMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/ASharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/A-sharp_minor",
   :rdf/type       :keys/Key})

(def B
  {:db/ident :keys/B,
   :rdf/type :keys/Note})

(def BFlat
  {:db/ident :keys/BFlat,
   :rdf/type :keys/Note})

(def BFlatMajor
  {:db/ident       :keys/BFlatMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/BFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/B-flat_major",
   :rdf/type       :keys/Key})

(def BFlatMinor
  {:db/ident       :keys/BFlatMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/BFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/B-flat_minor",
   :rdf/type       :keys/Key})

(def BMajor
  {:db/ident       :keys/BMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/B,
   :keys/wikipedia "http://en.wikipedia.org/wiki/B_major",
   :rdf/type       :keys/Key})

(def BMinor
  {:db/ident       :keys/BMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/B,
   :keys/wikipedia "http://en.wikipedia.org/wiki/B_minor",
   :rdf/type       :keys/Key})

(def C
  {:db/ident :keys/C,
   :rdf/type :keys/Note})

(def CFlat
  {:db/ident :keys/CFlat,
   :rdf/type :keys/Note})

(def CFlatMajor
  {:db/ident       :keys/CFlatMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/CFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/C-flat_major",
   :rdf/type       :keys/Key})

(def CMajor
  {:db/ident       :keys/CMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/C,
   :keys/wikipedia "http://en.wikipedia.org/wiki/C_major",
   :rdf/type       :keys/Key})

(def CMinor
  {:db/ident       :keys/CMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/C,
   :keys/wikipedia "http://en.wikipedia.org/wiki/C_minor",
   :rdf/type       :keys/Key})

(def CSharp
  {:db/ident :keys/CSharp,
   :rdf/type :keys/Note})

(def CSharpMajor
  {:db/ident       :keys/CSharpMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/CSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/C-sharp_major",
   :rdf/type       :keys/Key})

(def CSharpMinor
  {:db/ident       :keys/CSharpMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/CSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/C-sharp_minor",
   :rdf/type       :keys/Key})

(def D
  {:db/ident :keys/D,
   :rdf/type :keys/Note})

(def DFlat
  {:db/ident :keys/DFlat,
   :rdf/type :keys/Note})

(def DFlatMajor
  {:db/ident       :keys/DFlatMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/DFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/D-flat_major",
   :rdf/type       :keys/Key})

(def DMajor
  {:db/ident       :keys/DMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/D,
   :keys/wikipedia "http://en.wikipedia.org/wiki/D_major",
   :rdf/type       :keys/Key})

(def DMinor
  {:db/ident       :keys/DMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/D,
   :keys/wikipedia "http://en.wikipedia.org/wiki/D_minor",
   :rdf/type       :keys/Key})

(def DSharp
  {:db/ident :keys/DSharp,
   :rdf/type :keys/Note})

(def DSharpMinor
  {:db/ident       :keys/DSharpMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/DSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/D-sharp_minor",
   :rdf/type       :keys/Key})

(def E
  {:db/ident :keys/E,
   :rdf/type :keys/Note})

(def EFlat
  {:db/ident :keys/EFlat,
   :rdf/type :keys/Note})

(def EFlatMajor
  {:db/ident       :keys/EFlatMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/EFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/E-flat_major",
   :rdf/type       :keys/Key})

(def EFlatMinor
  {:db/ident       :keys/EFlatMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/EFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/E-flat_minor",
   :rdf/type       :keys/Key})

(def EMajor
  {:db/ident       :keys/EMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/E,
   :keys/wikipedia "http://en.wikipedia.org/wiki/E_major",
   :rdf/type       :keys/Key})

(def EMinor
  {:db/ident       :keys/EMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/E,
   :keys/wikipedia "http://en.wikipedia.org/wiki/E_minor",
   :rdf/type       :keys/Key})

(def F
  {:db/ident :keys/F,
   :rdf/type :keys/Note})

(def FMajor
  {:db/ident       :keys/FMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/F,
   :keys/wikipedia "http://en.wikipedia.org/wiki/F_major",
   :rdf/type       :keys/Key})

(def FMinor
  {:db/ident       :keys/FMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/F,
   :keys/wikipedia "http://en.wikipedia.org/wiki/F_minor",
   :rdf/type       :keys/Key})

(def FSharp
  {:db/ident :keys/FSharp,
   :rdf/type :keys/Note})

(def FSharpMajor
  {:db/ident       :keys/FSharpMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/FSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/F-sharp_major",
   :rdf/type       :keys/Key})

(def FSharpMinor
  {:db/ident       :keys/FSharpMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/FSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/F-sharp_minor",
   :rdf/type       :keys/Key})

(def G
  {:db/ident :keys/G,
   :rdf/type :keys/Note})

(def GFlat
  {:db/ident :keys/GFlat,
   :rdf/type :keys/Note})

(def GFlatMajor
  {:db/ident       :keys/GFlatMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/GFlat,
   :keys/wikipedia "http://en.wikipedia.org/wiki/G-flat_major",
   :rdf/type       :keys/Key})

(def GMajor
  {:db/ident       :keys/GMajor,
   :keys/mode      "major",
   :keys/tonic     :keys/G,
   :keys/wikipedia "http://en.wikipedia.org/wiki/G_major",
   :rdf/type       :keys/Key})

(def GMinor
  {:db/ident       :keys/GMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/G,
   :keys/wikipedia "http://en.wikipedia.org/wiki/G_minor",
   :rdf/type       :keys/Key})

(def GSharp
  {:db/ident :keys/GSharp,
   :rdf/type :keys/Note})

(def GSharpMinor
  {:db/ident       :keys/GSharpMinor,
   :keys/mode      "minor",
   :keys/tonic     :keys/GSharp,
   :keys/wikipedia "http://en.wikipedia.org/wiki/G-sharp_minor",
   :rdf/type       :keys/Key})

(def Key
  {:db/ident :keys/Key,
   :rdf/type :owl/Class})

(def Note
  {:db/ident :keys/Note,
   :rdf/type :owl/Class})

(def mode
  {:db/ident    :keys/mode,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :keys/Key,
   :rdfs/range  {:owl/oneOf [{:xsd/string "major"} {:xsd/string "minor"}],
                 :rdf/type  :owl/DataRange}})

(def tonic
  {:db/ident    :keys/tonic,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :keys/Key})

(def wikipedia
  {:db/ident   :keys/wikipedia,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/range :xsd/anyURI})