(ns net.wikipunk.rdf.dcterms
  "DCMI Metadata Terms - other"
  {:dc11/date #inst "2012-06-14T00:00:00.000-04:00",
   :dc11/publisher "http://purl.org/dc/aboutdcmi#DCMI",
   :dc11/title #voc/lstr "DCMI Metadata Terms - other@en",
   :dcat/downloadURL
   "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_terms.ttl",
   :dcterms/date #inst "2012-06-14T00:00:00.000-04:00",
   :dcterms/modified #inst "2012-06-14T00:00:00.000-04:00",
   :dcterms/publisher "http://purl.org/dc/aboutdcmi#DCMI",
   :dcterms/title #voc/lstr "DCMI Metadata Terms - other@en",
   :rdf/ns-prefix-map {"dcam"    "http://purl.org/dc/dcam/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "dcterms",
   :rdfa/uri "http://purl.org/dc/terms/",
   :rdfs/isDefinedBy {:rdf/uri
                      "http://dublincore.org/documents/dcmi-terms/#H2"}}
  (:refer-clojure :exclude [format type]))

(def Agent
  "A resource that acts or has the power to act."
  {:db/ident         :dcterms/Agent,
   :dc11/date        #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date     #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type         [:rdfs/Class :dcterms/AgentClass :rdfs/Resource],
   :rdfs/comment     #voc/lstr
                      "A resource that acts or has the power to act.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       #voc/lstr "Agent@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def AgentClass
  "A group of agents."
  {:db/ident         :dcterms/AgentClass,
   :dc11/date        #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date     #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #voc/lstr "A group of agents.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       #voc/lstr "Agent Class@en",
   :rdfs/subClassOf  [:rdfs/Resource :rdfs/Class]})

(def BibliographicResource
  "A book, article, or other documentary resource."
  {:db/ident         :dcterms/BibliographicResource,
   :dc11/date        #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date     #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #voc/lstr
                      "A book, article, or other documentary resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       #voc/lstr "Bibliographic Resource@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def Box
  "The set of regions in space defined by their geographic coordinates according to the DCMI Box Encoding Scheme."
  {:db/ident :dcterms/Box,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The set of regions in space defined by their geographic coordinates according to the DCMI Box Encoding Scheme.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "DCMI Box@en",
   :rdfs/seeAlso
   ["https://www.dublincore.org/specifications/dublin-core/dcmi-box/"]})

(def DCMIType
  "The set of classes specified by the DCMI Type Vocabulary, used to categorize the nature or genre of the resource."
  {:db/ident :dcterms/DCMIType,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   #voc/lstr
    "The set of classes specified by the DCMI Type Vocabulary, used to categorize the nature or genre of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "DCMI Type Vocabulary@en",
   :rdfs/seeAlso ["http://purl.org/dc/dcmitype/"]})

(def DDC
  "The set of conceptual resources specified by the Dewey Decimal Classification."
  {:db/ident :dcterms/DDC,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   #voc/lstr
    "The set of conceptual resources specified by the Dewey Decimal Classification.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "DDC@en",
   :rdfs/seeAlso ["http://www.oclc.org/dewey/"]})

(def FileFormat
  "A digital resource format."
  {:db/ident         :dcterms/FileFormat,
   :dc11/date        #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date     #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #voc/lstr "A digital resource format.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       #voc/lstr "File Format@en",
   :rdfs/subClassOf  [:rdfs/Resource
                      :dcterms/MediaType
                      :dcterms/MediaTypeOrExtent]})

(def Frequency
  "A rate at which something recurs."
  {:db/ident         :dcterms/Frequency,
   :dc11/date        #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date     #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #voc/lstr "A rate at which something recurs.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       #voc/lstr "Frequency@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def IMT
  "The set of media types specified by the Internet Assigned Numbers Authority."
  {:db/ident :dcterms/IMT,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   #voc/lstr
    "The set of media types specified by the Internet Assigned Numbers Authority.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "IMT@en",
   :rdfs/seeAlso ["http://www.iana.org/assignments/media-types/"]})

(def ISO3166
  "The set of codes listed in ISO 3166-1 for the representation of names of countries."
  {:db/ident :dcterms/ISO3166,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The set of codes listed in ISO 3166-1 for the representation of names of countries.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "ISO 3166@en",
   :rdfs/seeAlso ["https://www.iso.org/obp/ui/#search"]})

(def ISO639-2
  "The three-letter alphabetic codes listed in ISO639-2 for the representation of names of languages."
  {:db/ident :dcterms/ISO639-2,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The three-letter alphabetic codes listed in ISO639-2 for the representation of names of languages.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "ISO 639-2@en",
   :rdfs/seeAlso ["http://lcweb.loc.gov/standards/iso639-2/langhome.html"]})

(def ISO639-3
  "The set of three-letter codes listed in ISO 639-3 for the representation of names of languages."
  {:db/ident :dcterms/ISO639-3,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The set of three-letter codes listed in ISO 639-3 for the representation of names of languages.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "ISO 639-3@en",
   :rdfs/seeAlso ["http://www.sil.org/iso639-3/"]})

(def Jurisdiction
  "The extent or range of judicial, law enforcement, or other authority."
  {:db/ident :dcterms/Jurisdiction,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "The extent or range of judicial, law enforcement, or other authority.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Jurisdiction@en",
   :rdfs/subClassOf [:rdfs/Resource :dcterms/LocationPeriodOrJurisdiction]})

(def LCC
  "The set of conceptual resources specified by the Library of Congress Classification."
  {:db/ident :dcterms/LCC,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   #voc/lstr
    "The set of conceptual resources specified by the Library of Congress Classification.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "LCC@en",
   :rdfs/seeAlso ["http://lcweb.loc.gov/catdir/cpso/lcco/lcco.html"]})

(def LCSH
  "The set of labeled concepts specified by the Library of Congress Subject Headings."
  {:db/ident :dcterms/LCSH,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   #voc/lstr
    "The set of labeled concepts specified by the Library of Congress Subject Headings.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "LCSH@en"})

(def LicenseDocument
  "A legal document giving official permission to do something with a resource."
  {:db/ident :dcterms/LicenseDocument,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A legal document giving official permission to do something with a resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "License Document@en",
   :rdfs/subClassOf [:dcterms/RightsStatement :rdfs/Resource]})

(def LinguisticSystem
  "Written, spoken, sign, and computer languages are linguistic systems."
  {:db/ident :dcterms/LinguisticSystem,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Written, spoken, sign, and computer languages are linguistic systems.@en",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Written, spoken, sign, and computer languages are linguistic systems.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A system of signs, symbols, sounds, gestures, or rules used in communication.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Linguistic System@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Location
  "A spatial region or named place."
  {:db/ident         :dcterms/Location,
   :dc11/date        #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date     #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #voc/lstr "A spatial region or named place.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       #voc/lstr "Location@en",
   :rdfs/subClassOf  [:rdfs/Resource :dcterms/LocationPeriodOrJurisdiction]})

(def LocationPeriodOrJurisdiction
  "A location, period of time, or jurisdiction."
  {:db/ident         :dcterms/LocationPeriodOrJurisdiction,
   :dc11/date        #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date     #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #voc/lstr
                      "A location, period of time, or jurisdiction.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       #voc/lstr "Location, Period, or Jurisdiction@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def MESH
  "The set of labeled concepts specified by the Medical Subject Headings."
  {:db/ident :dcterms/MESH,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   #voc/lstr
    "The set of labeled concepts specified by the Medical Subject Headings.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "MeSH@en",
   :rdfs/seeAlso ["http://www.nlm.nih.gov/mesh/meshhome.html"]})

(def MediaType
  "A file format or physical medium."
  {:db/ident         :dcterms/MediaType,
   :dc11/date        #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date     #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #voc/lstr "A file format or physical medium.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       #voc/lstr "Media Type@en",
   :rdfs/subClassOf  [:dcterms/MediaTypeOrExtent :rdfs/Resource]})

(def MediaTypeOrExtent
  "A media type or extent."
  {:db/ident         :dcterms/MediaTypeOrExtent,
   :dc11/date        #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date     #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #voc/lstr "A media type or extent.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       #voc/lstr "Media Type or Extent@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def MethodOfAccrual
  "A method by which resources are added to a collection."
  {:db/ident :dcterms/MethodOfAccrual,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr
                  "A method by which resources are added to a collection.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Method of Accrual@en",
   :rdfs/subClassOf :rdfs/Resource})

(def MethodOfInstruction
  "A process that is used to engender knowledge, attitudes, and skills."
  {:db/ident :dcterms/MethodOfInstruction,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A process that is used to engender knowledge, attitudes, and skills.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Method of Instruction@en",
   :rdfs/subClassOf :rdfs/Resource})

(def NLM
  "The set of conceptual resources specified by the National Library of Medicine Classification."
  {:db/ident :dcterms/NLM,
   :dc11/date #inst "2005-06-13T00:00:00.000-04:00",
   :dcterms/date #inst "2005-06-13T00:00:00.000-04:00",
   :dcterms/issued #inst "2005-06-13T00:00:00.000-04:00",
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   #voc/lstr
    "The set of conceptual resources specified by the National Library of Medicine Classification.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "NLM@en",
   :rdfs/seeAlso ["http://wwwcf.nlm.nih.gov/class/"]})

(def Period
  "The set of time intervals defined by their limits according to the DCMI Period Encoding Scheme."
  {:db/ident :dcterms/Period,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The set of time intervals defined by their limits according to the DCMI Period Encoding Scheme.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "DCMI Period@en",
   :rdfs/seeAlso
   ["https://www.dublincore.org/specifications/dublin-core/dcmi-period/"]})

(def PeriodOfTime
  "An interval of time that is named or defined by its start and end dates."
  {:db/ident :dcterms/PeriodOfTime,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "An interval of time that is named or defined by its start and end dates.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Period of Time@en",
   :rdfs/subClassOf [:rdfs/Resource :dcterms/LocationPeriodOrJurisdiction]})

(def PhysicalMedium
  "Examples include paper, canvas, or DVD."
  {:db/ident            :dcterms/PhysicalMedium,
   :dc11/date           #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description    #voc/lstr "Examples include paper, canvas, or DVD.@en",
   :dcterms/date        #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description #voc/lstr "Examples include paper, canvas, or DVD.@en",
   :dcterms/issued      #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type            :rdfs/Class,
   :rdfs/comment        #voc/lstr "A physical material or carrier.@en",
   :rdfs/isDefinedBy    "http://purl.org/dc/terms/",
   :rdfs/label          #voc/lstr "Physical Medium@en",
   :rdfs/subClassOf     [:dcterms/MediaType
                         :rdfs/Resource
                         :dcterms/MediaTypeOrExtent]})

(def PhysicalResource
  "A material thing."
  {:db/ident         :dcterms/PhysicalResource,
   :dc11/date        #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date     #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued   #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #voc/lstr "A material thing.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label       #voc/lstr "Physical Resource@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def Point
  "The set of points in space defined by their geographic coordinates according to the DCMI Point Encoding Scheme."
  {:db/ident :dcterms/Point,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The set of points in space defined by their geographic coordinates according to the DCMI Point Encoding Scheme.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "DCMI Point@en",
   :rdfs/seeAlso
   ["https://www.dublincore.org/specifications/dublin-core/dcmi-point/"]})

(def Policy
  "A plan or course of action by an authority, intended to influence and determine decisions, actions, and other matters."
  {:db/ident :dcterms/Policy,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A plan or course of action by an authority, intended to influence and determine decisions, actions, and other matters.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Policy@en",
   :rdfs/subClassOf :rdfs/Resource})

(def ProvenanceStatement
  "Any changes in ownership and custody of a resource since its creation that are significant for its authenticity, integrity, and interpretation."
  {:db/ident :dcterms/ProvenanceStatement,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Any changes in ownership and custody of a resource since its creation that are significant for its authenticity, integrity, and interpretation.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Provenance Statement@en",
   :rdfs/subClassOf :rdfs/Resource})

(def RFC1766
  "The set of tags, constructed according to RFC 1766, for the identification of languages."
  {:db/ident :dcterms/RFC1766,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The set of tags, constructed according to RFC 1766, for the identification of languages.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "RFC 1766@en",
   :rdfs/seeAlso ["http://www.ietf.org/rfc/rfc1766.txt"]})

(def RFC3066
  "RFC 3066 has been obsoleted by RFC 4646."
  {:db/ident :dcterms/RFC3066,
   :dc11/date #inst "2002-07-13T00:00:00.000-04:00",
   :dc11/description #voc/lstr "RFC 3066 has been obsoleted by RFC 4646.@en",
   :dcterms/date #inst "2002-07-13T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "RFC 3066 has been obsoleted by RFC 4646.@en",
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The set of tags constructed according to RFC 3066 for the identification of languages.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "RFC 3066@en",
   :rdfs/seeAlso ["http://www.ietf.org/rfc/rfc3066.txt"]})

(def RFC4646
  "RFC 4646 obsoletes RFC 3066."
  {:db/ident :dcterms/RFC4646,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description #voc/lstr "RFC 4646 obsoletes RFC 3066.@en",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description #voc/lstr "RFC 4646 obsoletes RFC 3066.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The set of tags constructed according to RFC 4646 for the identification of languages.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "RFC 4646@en",
   :rdfs/seeAlso ["http://www.ietf.org/rfc/rfc4646.txt"]})

(def RFC5646
  "RFC 5646 obsoletes RFC 4646."
  {:db/ident :dcterms/RFC5646,
   :dc11/date #inst "2010-10-11T00:00:00.000-04:00",
   :dc11/description #voc/lstr "RFC 5646 obsoletes RFC 4646.@en",
   :dcterms/date #inst "2010-10-11T00:00:00.000-04:00",
   :dcterms/description #voc/lstr "RFC 5646 obsoletes RFC 4646.@en",
   :dcterms/issued #inst "2010-10-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The set of tags constructed according to RFC 5646 for the identification of languages.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "RFC 5646@en",
   :rdfs/seeAlso ["http://www.ietf.org/rfc/rfc5646.txt"]})

(def RightsStatement
  "A statement about the intellectual property rights (IPR) held in or over a resource, a legal document giving official permission to do something with a resource, or a statement about access rights."
  {:db/ident :dcterms/RightsStatement,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A statement about the intellectual property rights (IPR) held in or over a resource, a legal document giving official permission to do something with a resource, or a statement about access rights.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Rights Statement@en",
   :rdfs/subClassOf :rdfs/Resource})

(def SizeOrDuration
  "Examples include a number of pages, a specification of length, width, and breadth, or a period in hours, minutes, and seconds."
  {:db/ident :dcterms/SizeOrDuration,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Examples include a number of pages, a specification of length, width, and breadth, or a period in hours, minutes, and seconds.@en",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Examples include a number of pages, a specification of length, width, and breadth, or a period in hours, minutes, and seconds.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "A dimension or extent, or a time taken to play or execute.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Size or Duration@en",
   :rdfs/subClassOf [:rdfs/Resource :dcterms/MediaTypeOrExtent]})

(def Standard
  "A reference point against which other things can be evaluated or compared."
  {:db/ident :dcterms/Standard,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A reference point against which other things can be evaluated or compared.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Standard@en",
   :rdfs/subClassOf :rdfs/Resource})

(def TGN
  "The set of places specified by the Getty Thesaurus of Geographic Names."
  {:db/ident :dcterms/TGN,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   #voc/lstr
    "The set of places specified by the Getty Thesaurus of Geographic Names.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "TGN@en",
   :rdfs/seeAlso
   ["http://www.getty.edu/research/tools/vocabulary/tgn/index.html"]})

(def UDC
  "The set of conceptual resources specified by the Universal Decimal Classification."
  {:db/ident :dcterms/UDC,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :dcam/VocabularyEncodingScheme,
   :rdfs/comment
   #voc/lstr
    "The set of conceptual resources specified by the Universal Decimal Classification.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "UDC@en",
   :rdfs/seeAlso ["http://www.udcc.org/"]})

(def URI
  "The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force."
  {:db/ident :dcterms/URI,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The set of identifiers constructed according to the generic syntax for Uniform Resource Identifiers as specified by the Internet Engineering Task Force.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "URI@en",
   :rdfs/seeAlso ["http://www.ietf.org/rfc/rfc3986.txt"]})

(def W3CDTF
  "The set of dates and times constructed according to the W3C Date and Time Formats Specification."
  {:db/ident :dcterms/W3CDTF,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #voc/lstr
    "The set of dates and times constructed according to the W3C Date and Time Formats Specification.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "W3C-DTF@en",
   :rdfs/seeAlso ["http://www.w3.org/TR/NOTE-datetime"]})

(def abstract
  "A summary of the resource."
  {:db/ident           :dcterms/abstract,
   :dc11/date          #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date       #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued     #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "A summary of the resource.@en",
   :rdfs/isDefinedBy   "http://purl.org/dc/terms/",
   :rdfs/label         #voc/lstr "Abstract@en",
   :rdfs/subPropertyOf [:dcterms/description :dc11/description]})

(def accessRights
  "Access Rights may include information regarding access or restrictions based on privacy, security, or other policies."
  {:db/ident :dcterms/accessRights,
   :dc11/date #inst "2003-02-15T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Access Rights may include information regarding access or restrictions based on privacy, security, or other policies.@en",
   :dcam/rangeIncludes :dcterms/RightsStatement,
   :dcterms/date #inst "2003-02-15T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Access Rights may include information regarding access or restrictions based on privacy, security, or other policies.@en",
   :dcterms/issued #inst "2003-02-15T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Information about who access the resource or an indication of its security status.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Access Rights@en",
   :rdfs/subPropertyOf [:dcterms/rights :dc11/rights]})

(def accrualMethod
  "Recommended practice is to use a value from the Collection Description Accrual Method Vocabulary [[DCMI-ACCRUALMETHOD](https://dublincore.org/groups/collections/accrual-method/)]."
  {:db/ident :dcterms/accrualMethod,
   :dc11/date #inst "2005-06-13T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to use a value from the Collection Description Accrual Method Vocabulary [[DCMI-ACCRUALMETHOD](https://dublincore.org/groups/collections/accrual-method/)].@en",
   :dcam/rangeIncludes :dcterms/MethodOfAccrual,
   :dcterms/date #inst "2005-06-13T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to use a value from the Collection Description Accrual Method Vocabulary [[DCMI-ACCRUALMETHOD](https://dublincore.org/groups/collections/accrual-method/)].@en",
   :dcterms/issued #inst "2005-06-13T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "The method by which items are added to a collection.@en",
   :rdfs/domain :dcmitype/Collection,
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Accrual Method@en"})

(def accrualPeriodicity
  "Recommended practice is to use a value from the Collection Description Frequency Vocabulary [[DCMI-COLLFREQ](https://dublincore.org/groups/collections/frequency/)]."
  {:db/ident :dcterms/accrualPeriodicity,
   :dc11/date #inst "2005-06-13T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to use a value from the Collection Description Frequency Vocabulary [[DCMI-COLLFREQ](https://dublincore.org/groups/collections/frequency/)].@en",
   :dcam/rangeIncludes :dcterms/Frequency,
   :dcterms/date #inst "2005-06-13T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to use a value from the Collection Description Frequency Vocabulary [[DCMI-COLLFREQ](https://dublincore.org/groups/collections/frequency/)].@en",
   :dcterms/issued #inst "2005-06-13T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr "The frequency with which items are added to a collection.@en",
   :rdfs/domain :dcmitype/Collection,
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Accrual Periodicity@en"})

(def accrualPolicy
  "Recommended practice is to use a value from the Collection Description Accrual Policy Vocabulary [[DCMI-ACCRUALPOLICY](https://dublincore.org/groups/collections/accrual-policy/)]."
  {:db/ident :dcterms/accrualPolicy,
   :dc11/date #inst "2005-06-13T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to use a value from the Collection Description Accrual Policy Vocabulary [[DCMI-ACCRUALPOLICY](https://dublincore.org/groups/collections/accrual-policy/)].@en",
   :dcam/rangeIncludes :dcterms/Policy,
   :dcterms/date #inst "2005-06-13T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to use a value from the Collection Description Accrual Policy Vocabulary [[DCMI-ACCRUALPOLICY](https://dublincore.org/groups/collections/accrual-policy/)].@en",
   :dcterms/issued #inst "2005-06-13T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr "The policy governing the addition of items to a collection.@en",
   :rdfs/domain :dcmitype/Collection,
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Accrual Policy@en"})

(def alternative
  "The distinction between titles and alternative titles is application-specific."
  {:db/ident :dcterms/alternative,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "The distinction between titles and alternative titles is application-specific.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "The distinction between titles and alternative titles is application-specific.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "An alternative name for the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Alternative Title@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/title :dc11/title]})

(def audience
  "Recommended practice is to use this property with non-literal values from a vocabulary of audience types."
  {:db/ident :dcterms/audience,
   :dc11/date #inst "2001-05-21T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to use this property with non-literal values from a vocabulary of audience types.@en",
   :dcam/rangeIncludes :dcterms/AgentClass,
   :dcterms/date #inst "2001-05-21T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to use this property with non-literal values from a vocabulary of audience types.@en",
   :dcterms/issued #inst "2001-05-21T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A class of agents for whom the resource is intended or useful.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Audience@en"})

(def available
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:db/ident :dcterms/available,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "Date that the resource became or will become available.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Date Available@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date :dc11/date]})

(def bibliographicCitation
  "Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible."
  {:db/ident :dcterms/bibliographicCitation,
   :dc11/date #inst "2003-02-15T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible.@en",
   :dcterms/date #inst "2003-02-15T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to include sufficient bibliographic detail to identify the resource as unambiguously as possible.@en",
   :dcterms/issued #inst "2003-02-15T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "A bibliographic reference for the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Bibliographic Citation@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/identifier :dc11/identifier]})

(def conformsTo
  "An established standard to which the described resource conforms."
  {:db/ident :dcterms/conformsTo,
   :dc11/date #inst "2001-05-21T00:00:00.000-04:00",
   :dcam/rangeIncludes :dcterms/Standard,
   :dcterms/date #inst "2001-05-21T00:00:00.000-04:00",
   :dcterms/issued #inst "2001-05-21T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "An established standard to which the described resource conforms.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Conforms To@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def contributor
  "The guidelines for using names of persons or organizations as creators apply to contributors."
  {:db/ident :dcterms/contributor,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "The guidelines for using names of persons or organizations as creators apply to contributors.@en",
   :dcam/rangeIncludes :dcterms/Agent,
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "The guidelines for using names of persons or organizations as creators apply to contributors.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "An entity responsible for making contributions to the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Contributor@en",
   :rdfs/subPropertyOf :dc11/contributor})

(def coverage
  "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended practice is to use a controlled vocabulary such as the Getty Thesaurus of Geographic Names [[TGN](https://www.getty.edu/research/tools/vocabulary/tgn/index.html)]. Where appropriate, named places or time periods may be used in preference to numeric identifiers such as sets of coordinates or date ranges. Because coverage is so broadly defined, it is preferable to use the more specific subproperties Temporal Coverage and Spatial Coverage."
  {:db/ident :dcterms/coverage,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended practice is to use a controlled vocabulary such as the Getty Thesaurus of Geographic Names [[TGN](https://www.getty.edu/research/tools/vocabulary/tgn/index.html)]. Where appropriate, named places or time periods may be used in preference to numeric identifiers such as sets of coordinates or date ranges.  Because coverage is so broadly defined, it is preferable to use the more specific subproperties Temporal Coverage and Spatial Coverage.@en",
   :dcam/rangeIncludes
   [:dcterms/Location :dcterms/Period :dcterms/Jurisdiction],
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Spatial topic and spatial applicability may be a named place or a location specified by its geographic coordinates. Temporal topic may be a named period, date, or date range. A jurisdiction may be a named administrative entity or a geographic place to which the resource applies. Recommended practice is to use a controlled vocabulary such as the Getty Thesaurus of Geographic Names [[TGN](https://www.getty.edu/research/tools/vocabulary/tgn/index.html)]. Where appropriate, named places or time periods may be used in preference to numeric identifiers such as sets of coordinates or date ranges.  Because coverage is so broadly defined, it is preferable to use the more specific subproperties Temporal Coverage and Spatial Coverage.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The spatial or temporal topic of the resource, spatial applicability of the resource, or jurisdiction under which the resource is relevant.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Coverage@en",
   :rdfs/subPropertyOf :dc11/coverage})

(def created
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:db/ident :dcterms/created,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "Date of creation of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Date Created@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date :dc11/date]})

(def creator
  "Recommended practice is to identify the creator with a URI. If this is not possible or feasible, a literal value that identifies the creator may be provided."
  {:db/ident :dcterms/creator,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to identify the creator with a URI.  If this is not possible or feasible, a literal value that identifies the creator may be provided.@en",
   :dcam/rangeIncludes :dcterms/Agent,
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to identify the creator with a URI.  If this is not possible or feasible, a literal value that identifies the creator may be provided.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :owl/equivalentProperty :foaf/maker,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "An entity responsible for making the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Creator@en",
   :rdfs/subPropertyOf [:dcterms/contributor :dc11/creator :dc11/contributor]})

(def date
  "Date may be used to express temporal information at any level of granularity. Recommended practice is to express the date, date/time, or period of time according to ISO 8601-1 [[ISO 8601-1](https://www.iso.org/iso-8601-date-and-time-format.html)] or a published profile of the ISO standard, such as the W3C Note on Date and Time Formats [[W3CDTF](https://www.w3.org/TR/NOTE-datetime)] or the Extended Date/Time Format Specification [[EDTF](http://www.loc.gov/standards/datetime/)]. If the full date is unknown, month and year (YYYY-MM) or just year (YYYY) may be used. Date ranges may be specified using ISO 8601 period of time specification in which start and end dates are separated by a '/' (slash) character. Either the start or end date may be missing."
  {:db/ident :dcterms/date,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Date may be used to express temporal information at any level of granularity.  Recommended practice is to express the date, date/time, or period of time according to ISO 8601-1 [[ISO 8601-1](https://www.iso.org/iso-8601-date-and-time-format.html)] or a published profile of the ISO standard, such as the W3C Note on Date and Time Formats [[W3CDTF](https://www.w3.org/TR/NOTE-datetime)] or the Extended Date/Time Format Specification [[EDTF](http://www.loc.gov/standards/datetime/)].  If the full date is unknown, month and year (YYYY-MM) or just year (YYYY) may be used. Date ranges may be specified using ISO 8601 period of time specification in which start and end dates are separated by a '/' (slash) character.  Either the start or end date may be missing.@en",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Date may be used to express temporal information at any level of granularity.  Recommended practice is to express the date, date/time, or period of time according to ISO 8601-1 [[ISO 8601-1](https://www.iso.org/iso-8601-date-and-time-format.html)] or a published profile of the ISO standard, such as the W3C Note on Date and Time Formats [[W3CDTF](https://www.w3.org/TR/NOTE-datetime)] or the Extended Date/Time Format Specification [[EDTF](http://www.loc.gov/standards/datetime/)].  If the full date is unknown, month and year (YYYY-MM) or just year (YYYY) may be used. Date ranges may be specified using ISO 8601 period of time specification in which start and end dates are separated by a '/' (slash) character.  Either the start or end date may be missing.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A point or period of time associated with an event in the lifecycle of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Date@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dc11/date})

(def dateAccepted
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty. Examples of resources to which a date of acceptance may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal)."
  {:db/ident :dcterms/dateAccepted,
   :dc11/date #inst "2002-07-13T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.  Examples of resources to which a date of acceptance may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal).@en",
   :dcterms/date #inst "2002-07-13T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.  Examples of resources to which a date of acceptance may be relevant are a thesis (accepted by a university department) or an article (accepted by a journal).@en",
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "Date of acceptance of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Date Accepted@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date :dc11/date]})

(def dateCopyrighted
  "Typically a year. Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:db/ident :dcterms/dateCopyrighted,
   :dc11/date #inst "2002-07-13T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Typically a year.  Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/date #inst "2002-07-13T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Typically a year.  Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "Date of copyright of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Date Copyrighted@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date :dc11/date]})

(def dateSubmitted
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty. Examples of resources to which a 'Date Submitted' may be relevant include a thesis (submitted to a university department) or an article (submitted to a journal)."
  {:db/ident :dcterms/dateSubmitted,
   :dc11/date #inst "2002-07-13T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.  Examples of resources to which a 'Date Submitted' may be relevant include a thesis (submitted to a university department) or an article (submitted to a journal).@en",
   :dcterms/date #inst "2002-07-13T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.  Examples of resources to which a 'Date Submitted' may be relevant include a thesis (submitted to a university department) or an article (submitted to a journal).@en",
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "Date of submission of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Date Submitted@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date :dc11/date]})

(def description
  "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource."
  {:db/ident           :dcterms/description,
   :db/cardinality     :db.cardinality/many
   :db/valueType       :db.type/string
   :dc11/date          #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
   "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource.@en",
   :dcterms/date       #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
   "Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource.@en",
   :dcterms/issued     #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "An account of the resource.@en",
   :rdfs/isDefinedBy   "http://purl.org/dc/terms/",
   :rdfs/label         #voc/lstr "Description@en",
   :rdfs/subPropertyOf :dc11/description})

(def educationLevel
  "A class of agents, defined in terms of progression through an educational or training context, for which the described resource is intended."
  {:db/ident :dcterms/educationLevel,
   :dc11/date #inst "2002-07-13T00:00:00.000-04:00",
   :dcam/rangeIncludes :dcterms/AgentClass,
   :dcterms/date #inst "2002-07-13T00:00:00.000-04:00",
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A class of agents, defined in terms of progression through an educational or training context, for which the described resource is intended.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Audience Education Level@en",
   :rdfs/subPropertyOf :dcterms/audience})

(def extent
  "Recommended practice is to specify the file size in megabytes and duration in ISO 8601 format."
  {:db/ident :dcterms/extent,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to specify the file size in megabytes and duration in ISO 8601 format.@en",
   :dcam/rangeIncludes :dcterms/SizeOrDuration,
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to specify the file size in megabytes and duration in ISO 8601 format.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "The size or duration of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Extent@en",
   :rdfs/subPropertyOf [:dcterms/format :dc11/format]})

(def format
  "Recommended practice is to use a controlled vocabulary where available. For example, for file formats one could use the list of Internet Media Types [[MIME](https://www.iana.org/assignments/media-types/media-types.xhtml)]. Examples of dimensions include size and duration."
  {:db/ident :dcterms/format,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to use a controlled vocabulary where available. For example, for file formats one could use the list of Internet Media Types [[MIME](https://www.iana.org/assignments/media-types/media-types.xhtml)].  Examples of dimensions include size and duration.@en",
   :dcam/rangeIncludes [:dcterms/MediaTypeOrExtent],
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to use a controlled vocabulary where available. For example, for file formats one could use the list of Internet Media Types [[MIME](https://www.iana.org/assignments/media-types/media-types.xhtml)].  Examples of dimensions include size and duration.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The file format, physical medium, or dimensions of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Format@en",
   :rdfs/subPropertyOf :dc11/format})

(def hasFormat
  "This property is intended to be used with non-literal values. This property is an inverse property of Is Format Of."
  {:db/ident :dcterms/hasFormat,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Format Of.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Format Of.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource that is substantially the same as the pre-existing described resource, but in another format.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Has Format@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def hasPart
  "This property is intended to be used with non-literal values. This property is an inverse property of Is Part Of."
  {:db/ident :dcterms/hasPart,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Part Of.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Part Of.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource that is included either physically or logically in the described resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Has Part@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def hasVersion
  "Changes in version imply substantive changes in content rather than differences in format. This property is intended to be used with non-literal values. This property is an inverse property of Is Version Of."
  {:db/ident :dcterms/hasVersion,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Changes in version imply substantive changes in content rather than differences in format. This property is intended to be used with non-literal values. This property is an inverse property of Is Version Of.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Changes in version imply substantive changes in content rather than differences in format. This property is intended to be used with non-literal values. This property is an inverse property of Is Version Of.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource that is a version, edition, or adaptation of the described resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Has Version@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def identifier
  "Recommended practice is to identify the resource by means of a string conforming to an identification system. Examples include International Standard Book Number (ISBN), Digital Object Identifier (DOI), and Uniform Resource Name (URN). Persistent identifiers should be provided as HTTP URIs."
  {:db/ident :dcterms/identifier,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to identify the resource by means of a string conforming to an identification system. Examples include International Standard Book Number (ISBN), Digital Object Identifier (DOI), and Uniform Resource Name (URN).  Persistent identifiers should be provided as HTTP URIs.@en",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to identify the resource by means of a string conforming to an identification system. Examples include International Standard Book Number (ISBN), Digital Object Identifier (DOI), and Uniform Resource Name (URN).  Persistent identifiers should be provided as HTTP URIs.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "An unambiguous reference to the resource within a given context.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Identifier@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dc11/identifier})

(def instructionalMethod
  "Instructional Method typically includes ways of presenting instructional materials or conducting instructional activities, patterns of learner-to-learner and learner-to-instructor interactions, and mechanisms by which group and individual levels of learning are measured. Instructional methods include all aspects of the instruction and learning processes from planning and implementation through evaluation and feedback."
  {:db/ident :dcterms/instructionalMethod,
   :dc11/date #inst "2005-06-13T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Instructional Method typically includes ways of presenting instructional materials or conducting instructional activities, patterns of learner-to-learner and learner-to-instructor interactions, and mechanisms by which group and individual levels of learning are measured.  Instructional methods include all aspects of the instruction and learning processes from planning and implementation through evaluation and feedback.@en",
   :dcam/rangeIncludes :dcterms/MethodOfInstruction,
   :dcterms/date #inst "2005-06-13T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Instructional Method typically includes ways of presenting instructional materials or conducting instructional activities, patterns of learner-to-learner and learner-to-instructor interactions, and mechanisms by which group and individual levels of learning are measured.  Instructional methods include all aspects of the instruction and learning processes from planning and implementation through evaluation and feedback.@en",
   :dcterms/issued #inst "2005-06-13T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A process, used to engender knowledge, attitudes and skills, that the described resource is designed to support.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Instructional Method@en"})

(def isFormatOf
  "This property is intended to be used with non-literal values. This property is an inverse property of Has Format."
  {:db/ident :dcterms/isFormatOf,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Has Format.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Has Format.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A pre-existing related resource that is substantially the same as the described resource, but in another format.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Is Format Of@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def isPartOf
  "This property is intended to be used with non-literal values. This property is an inverse property of Has Part."
  {:db/ident :dcterms/isPartOf,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Has Part.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Has Part.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource in which the described resource is physically or logically included.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Is Part Of@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def isReferencedBy
  "This property is intended to be used with non-literal values. This property is an inverse property of References."
  {:db/ident :dcterms/isReferencedBy,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of References.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of References.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource that references, cites, or otherwise points to the described resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Is Referenced By@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def isReplacedBy
  "This property is intended to be used with non-literal values. This property is an inverse property of Replaces."
  {:db/ident :dcterms/isReplacedBy,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Replaces.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Replaces.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource that supplants, displaces, or supersedes the described resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Is Replaced By@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def isRequiredBy
  "This property is intended to be used with non-literal values. This property is an inverse property of Requires."
  {:db/ident :dcterms/isRequiredBy,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Requires.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Requires.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource that requires the described resource to support its function, delivery, or coherence.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Is Required By@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def isVersionOf
  "Changes in version imply substantive changes in content rather than differences in format. This property is intended to be used with non-literal values. This property is an inverse property of Has Version."
  {:db/ident :dcterms/isVersionOf,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Changes in version imply substantive changes in content rather than differences in format. This property is intended to be used with non-literal values. This property is an inverse property of Has Version.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Changes in version imply substantive changes in content rather than differences in format. This property is intended to be used with non-literal values. This property is an inverse property of Has Version.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource of which the described resource is a version, edition, or adaptation.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Is Version Of@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def issued
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:db/ident :dcterms/issued,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "Date of formal issuance of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Date Issued@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date :dc11/date]})

(def language
  "Recommended practice is to use either a non-literal value representing a language from a controlled vocabulary such as ISO 639-2 or ISO 639-3, or a literal value consisting of an IETF Best Current Practice 47 [[IETF-BCP47](https://tools.ietf.org/html/bcp47)] language tag."
  {:db/ident :dcterms/language,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to use either a non-literal value representing a language from a controlled vocabulary such as ISO 639-2 or ISO 639-3, or a literal value consisting of an IETF Best Current Practice 47 [[IETF-BCP47](https://tools.ietf.org/html/bcp47)] language tag.@en",
   :dcam/rangeIncludes :dcterms/LinguisticSystem,
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to use either a non-literal value representing a language from a controlled vocabulary such as ISO 639-2 or ISO 639-3, or a literal value consisting of an IETF Best Current Practice 47 [[IETF-BCP47](https://tools.ietf.org/html/bcp47)] language tag.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "A language of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Language@en",
   :rdfs/subPropertyOf :dc11/language})

(def license
  "Recommended practice is to identify the license document with a URI. If this is not possible or feasible, a literal value that identifies the license may be provided."
  {:db/ident :dcterms/license,
   :dc11/date #inst "2004-06-14T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to identify the license document with a URI. If this is not possible or feasible, a literal value that identifies the license may be provided.@en",
   :dcam/rangeIncludes :dcterms/LicenseDocument,
   :dcterms/date #inst "2004-06-14T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to identify the license document with a URI. If this is not possible or feasible, a literal value that identifies the license may be provided.@en",
   :dcterms/issued #inst "2004-06-14T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A legal document giving official permission to do something with the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "License@en",
   :rdfs/subPropertyOf [:dcterms/rights :dc11/rights]})

(def mediator
  "In an educational context, a mediator might be a parent, teacher, teaching assistant, or care-giver."
  {:db/ident :dcterms/mediator,
   :dc11/date #inst "2001-05-21T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "In an educational context, a mediator might be a parent, teacher, teaching assistant, or care-giver.@en",
   :dcam/rangeIncludes :dcterms/AgentClass,
   :dcterms/date #inst "2001-05-21T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "In an educational context, a mediator might be a parent, teacher, teaching assistant, or care-giver.@en",
   :dcterms/issued #inst "2001-05-21T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "An entity that mediates access to the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Mediator@en",
   :rdfs/subPropertyOf :dcterms/audience})

(def medium
  "The material or physical carrier of the resource."
  {:db/ident            :dcterms/medium,
   :dc11/date           #inst "2000-07-11T00:00:00.000-04:00",
   :dcam/domainIncludes :dcterms/PhysicalResource,
   :dcam/rangeIncludes  :dcterms/PhysicalMedium,
   :dcterms/date        #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued      #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type            :rdf/Property,
   :rdfs/comment        #voc/lstr
                         "The material or physical carrier of the resource.@en",
   :rdfs/isDefinedBy    "http://purl.org/dc/terms/",
   :rdfs/label          #voc/lstr "Medium@en",
   :rdfs/subPropertyOf  [:dcterms/format :dc11/format]})

(def modified
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:db/ident :dcterms/modified,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "Date on which the resource was changed.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Date Modified@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date :dc11/date]})

(def provenance
  "The statement may include a description of any changes successive custodians made to the resource."
  {:db/ident :dcterms/provenance,
   :dc11/date #inst "2004-09-20T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "The statement may include a description of any changes successive custodians made to the resource.@en",
   :dcam/rangeIncludes :dcterms/ProvenanceStatement,
   :dcterms/date #inst "2004-09-20T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "The statement may include a description of any changes successive custodians made to the resource.@en",
   :dcterms/issued #inst "2004-09-20T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A statement of any changes in ownership and custody of the resource since its creation that are significant for its authenticity, integrity, and interpretation.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Provenance@en"})

(def publisher
  "An entity responsible for making the resource available."
  {:db/ident :dcterms/publisher,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcam/rangeIncludes :dcterms/Agent,
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "An entity responsible for making the resource available.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Publisher@en",
   :rdfs/subPropertyOf :dc11/publisher})

(def references
  "This property is intended to be used with non-literal values. This property is an inverse property of Is Referenced By."
  {:db/ident :dcterms/references,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Referenced By.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Referenced By.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource that is referenced, cited, or otherwise pointed to by the described resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "References@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def relation
  "Recommended practice is to identify the related resource by means of a URI. If this is not possible or feasible, a string conforming to a formal identification system may be provided."
  {:db/ident :dcterms/relation,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to identify the related resource by means of a URI.  If this is not possible or feasible, a string conforming to a formal identification system may be provided.@en",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to identify the related resource by means of a URI.  If this is not possible or feasible, a string conforming to a formal identification system may be provided.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "A related resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Relation@en",
   :rdfs/subPropertyOf :dc11/relation})

(def replaces
  "This property is intended to be used with non-literal values. This property is an inverse property of Is Replaced By."
  {:db/ident :dcterms/replaces,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Replaced By.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Replaced By.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource that is supplanted, displaced, or superseded by the described resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Replaces@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def requires
  "This property is intended to be used with non-literal values. This property is an inverse property of Is Required By."
  {:db/ident :dcterms/requires,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Required By.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "This property is intended to be used with non-literal values. This property is an inverse property of Is Required By.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource that is required by the described resource to support its function, delivery, or coherence.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Requires@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/relation]})

(def rights
  "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights. Recommended practice is to refer to a rights statement with a URI. If this is not possible or feasible, a literal value (name, label, or short text) may be provided."
  {:db/ident :dcterms/rights,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights.  Recommended practice is to refer to a rights statement with a URI.  If this is not possible or feasible, a literal value (name, label, or short text) may be provided.@en",
   :dcam/rangeIncludes :dcterms/RightsStatement,
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights.  Recommended practice is to refer to a rights statement with a URI.  If this is not possible or feasible, a literal value (name, label, or short text) may be provided.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "Information about rights held in and over the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Rights@en",
   :rdfs/subPropertyOf :dc11/rights})

(def rightsHolder
  "Recommended practice is to refer to the rights holder with a URI. If this is not possible or feasible, a literal value that identifies the rights holder may be provided."
  {:db/ident :dcterms/rightsHolder,
   :dc11/date #inst "2004-06-14T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to refer to the rights holder with a URI. If this is not possible or feasible, a literal value that identifies the rights holder may be provided.@en",
   :dcam/rangeIncludes :dcterms/Agent,
   :dcterms/date #inst "2004-06-14T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to refer to the rights holder with a URI. If this is not possible or feasible, a literal value that identifies the rights holder may be provided.@en",
   :dcterms/issued #inst "2004-06-14T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A person or organization owning or managing rights over the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Rights Holder@en"})

(def source
  "This property is intended to be used with non-literal values. The described resource may be derived from the related resource in whole or in part. Best practice is to identify the related resource by means of a URI or a string conforming to a formal identification system."
  {:db/ident :dcterms/source,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "This property is intended to be used with non-literal values. The described resource may be derived from the related resource in whole or in part. Best practice is to identify the related resource by means of a URI or a string conforming to a formal identification system.@en",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "This property is intended to be used with non-literal values. The described resource may be derived from the related resource in whole or in part. Best practice is to identify the related resource by means of a URI or a string conforming to a formal identification system.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A related resource from which the described resource is derived.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Source@en",
   :rdfs/subPropertyOf [:dcterms/relation :dc11/source :dc11/relation]})

(def spatial
  "Spatial characteristics of the resource."
  {:db/ident           :dcterms/spatial,
   :dc11/date          #inst "2000-07-11T00:00:00.000-04:00",
   :dcam/rangeIncludes :dcterms/Location,
   :dcterms/date       #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued     #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Spatial characteristics of the resource.@en",
   :rdfs/isDefinedBy   "http://purl.org/dc/terms/",
   :rdfs/label         #voc/lstr "Spatial Coverage@en",
   :rdfs/subPropertyOf [:dcterms/coverage :dc11/coverage]})

(def subject
  "Recommended practice is to refer to the subject with a URI. If this is not possible or feasible, a literal value that identifies the subject may be provided. Both should preferably refer to a subject in a controlled vocabulary."
  {:db/ident :dcterms/subject,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to refer to the subject with a URI. If this is not possible or feasible, a literal value that identifies the subject may be provided. Both should preferably refer to a subject in a controlled vocabulary.@en",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to refer to the subject with a URI. If this is not possible or feasible, a literal value that identifies the subject may be provided. Both should preferably refer to a subject in a controlled vocabulary.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "A topic of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Subject@en",
   :rdfs/subPropertyOf :dc11/subject})

(def tableOfContents
  "A list of subunits of the resource."
  {:db/ident           :dcterms/tableOfContents,
   :dc11/date          #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/date       #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued     #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "A list of subunits of the resource.@en",
   :rdfs/isDefinedBy   "http://purl.org/dc/terms/",
   :rdfs/label         #voc/lstr "Table Of Contents@en",
   :rdfs/subPropertyOf [:dcterms/description :dc11/description]})

(def temporal
  "Temporal characteristics of the resource."
  {:db/ident           :dcterms/temporal,
   :dc11/date          #inst "2000-07-11T00:00:00.000-04:00",
   :dcam/rangeIncludes :dcterms/PeriodOfTime,
   :dcterms/date       #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/issued     #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Temporal characteristics of the resource.@en",
   :rdfs/isDefinedBy   "http://purl.org/dc/terms/",
   :rdfs/label         #voc/lstr "Temporal Coverage@en",
   :rdfs/subPropertyOf [:dcterms/coverage :dc11/coverage]})

(def title
  "A name given to the resource."
  {:db/ident           :dcterms/title,
   :db/cardinality     :db.cardinality/many
   :db/valueType       :db.type/string
   :dc11/date          #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/date       #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/issued     #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "A name given to the resource.@en",
   :rdfs/isDefinedBy   "http://purl.org/dc/terms/",
   :rdfs/label         #voc/lstr "Title@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dc11/title})

(def type
  "Recommended practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [[DCMI-TYPE](http://dublincore.org/documents/dcmi-type-vocabulary/)]. To describe the file format, physical medium, or dimensions of the resource, use the property Format."
  {:db/ident :dcterms/type,
   :dc11/date #inst "2008-01-14T00:00:00.000-05:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [[DCMI-TYPE](http://dublincore.org/documents/dcmi-type-vocabulary/)]. To describe the file format, physical medium, or dimensions of the resource, use the property Format.@en",
   :dcterms/date #inst "2008-01-14T00:00:00.000-05:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [[DCMI-TYPE](http://dublincore.org/documents/dcmi-type-vocabulary/)]. To describe the file format, physical medium, or dimensions of the resource, use the property Format.@en",
   :dcterms/issued #inst "2008-01-14T00:00:00.000-05:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "The nature or genre of the resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Type@en",
   :rdfs/subPropertyOf :dc11/type})

(def valid
  "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty."
  {:db/ident :dcterms/valid,
   :dc11/date #inst "2000-07-11T00:00:00.000-04:00",
   :dc11/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/date #inst "2000-07-11T00:00:00.000-04:00",
   :dcterms/description
   #voc/lstr
    "Recommended practice is to describe the date, date/time, or period of time as recommended for the property Date, of which this is a subproperty.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "Date (often a range) of validity of a resource.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/terms/",
   :rdfs/label #voc/lstr "Date Valid@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date :dc11/date]})
