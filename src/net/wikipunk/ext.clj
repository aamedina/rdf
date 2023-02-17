(ns net.wikipunk.ext
  "Beyond the RDFa 1.1 / JSON-LD initial context."
  {:rdf/type :jsonld/Context}
  (:refer-clojure :exclude [keys]))

(def acl
  {:rdfa/uri    "http://www.w3.org/ns/auth/acl#"
   :rdfa/prefix "acl"
   :rdf/type    :rdfa/PrefixMapping})

(def adms
  {:rdfa/uri    "http://www.w3.org/ns/adms#"
   :rdfa/prefix "adms"
   :rdf/type    :rdfa/PrefixMapping})

(def ao
  {:dcat/downloadURL "https://purl.org/ontology/ao/associationontology.owl"
   :rdfa/uri         "http://purl.org/ontology/ao/core#"
   :rdfa/prefix      "ao"
   :rdf/type         :rdfa/PrefixMapping})

(def bibo
  {:rdfa/uri    "http://purl.org/ontology/bibo/"
   :rdfa/prefix "bibo"
   :rdf/type    :rdfa/PrefixMapping})

(def bio
  {:dcat/downloadURL "https://vocab.org/bio/schema.rdf"
   :rdfa/uri         "http://purl.org/vocab/bio/0.1/"
   :rdfa/prefix      "bio"
   :rdf/type         :rdfa/PrefixMapping})

(def cnt
  {:rdfa/uri    "http://www.w3.org/2011/content#"
   :rdfa/prefix "cnt"
   :rdf/type    :rdfa/PrefixMapping})

(def dcam
  "DCMI Metadata Terms"
  {:dcat/downloadURL "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_abstract_model.ttl"
   :rdfa/uri         "http://purl.org/dc/dcam/"
   :rdfa/prefix      "dcam",
   :rdf/type         :rdfa/PrefixMapping})

(def dcmitype
  {:dcat/downloadURL "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_type.ttl"
   :rdfa/uri         "http://purl.org/dc/dcmitype/",
   :rdfa/prefix      "dcmitype",,
   :rdf/type         :rdfa/PrefixMapping})

(def disco
  {:rdfa/uri    "http://rdf-vocabulary.ddialliance.org/discovery#"
   :rdfa/prefix "disco",
   :rdf/type    :rdfa/PrefixMapping})

(def dpvo
  "Data Privacy Vocabulary OWL"
  {:rdfa/uri         "https://w3id.org/dpv/dpv-owl#"
   :rdfa/prefix      "dpvo",
   :rdf/type         :rdfa/PrefixMapping})

(def dpvo-pd
  {:rdfa/uri    "https://w3id.org/dpv/dpv-owl/dpv-pd#"
   :rdfa/prefix "dpvo-pd",
   :rdf/type    :rdfa/PrefixMapping})

(def dpvo-gdpr
  {:rdfa/uri    "https://w3id.org/dpv/dpv-owl/dpv-gdpr#"
   :rdfa/prefix "dpvo-gdpr",
   :rdf/type    :rdfa/PrefixMapping})

(def dpvo-risk
  {:rdfa/uri    "https://w3id.org/dpv/dpv-owl/risk#"
   :rdfa/prefix "dpvo-risk",
   :rdf/type    :rdfa/PrefixMapping})

(def doap
  "Description of a Project"
  {:dcat/downloadURL "https://raw.githubusercontent.com/ewilderj/doap/master/schema/doap.rdf"
   :rdfa/prefix      "doap",
   :rdfa/uri         "http://usefulinc.com/ns/doap#"
   :rdf/type         :rdfa/PrefixMapping})

(def event
  {:dcat/downloadURL "https://purl.org/NET/c4dm/event.owl"
   :rdfa/uri         "http://purl.org/NET/c4dm/event.owl#"
   :rdfa/prefix      "event"
   :rdf/type         :rdfa/PrefixMapping})

(def exif
  {:rdfa/uri    "http://www.w3.org/2003/12/exif/ns#"
   :rdfa/prefix "exif"
   :rdf/type    :rdfa/PrefixMapping})

(def frbr
  {:dcat/downloadURL "https://vocab.org/frbr/frbr-core-20050810.rdf"
   :rdfa/uri         "http://purl.org/vocab/frbr/core#"
   :rdfa/prefix      "frbr"
   :rdf/type         :rdfa/PrefixMapping})

(def gen
  {:rdfa/uri    "http://www.w3.org/2006/gen/ont#"
   :rdfa/prefix "gen"
   :rdf/type    :rdfa/PrefixMapping})

(def geo
  {:rdfa/uri    "http://www.w3.org/2003/01/geo/wgs84_pos#"
   :rdfa/prefix "geo"
   :rdf/type    :rdfa/PrefixMapping})

(def greg
  "Gregorian months"
  {:dcat/downloadURL "https://raw.githubusercontent.com/w3c/sdw/gh-pages/time/rdf/time-gregorian.ttl"
   :rdfa/uri         "http://www.w3.org/ns/time/gregorian/",
   :rdfa/prefix      "greg",
   :rdf/type         :rdfa/PrefixMapping})

(def jsonschema
  "JSON Schema in RDF"
  {:rdfa/uri    "https://www.w3.org/2019/wot/json-schema#"
   :rdfa/prefix "jsonschema",
   :rdf/type    :rdfa/PrefixMapping})

(def mo
  "Music Ontology"
  {:rdfa/uri    "http://purl.org/ontology/mo/"
   :rdfa/prefix "mo"
   :rdf/type    :rdfa/PrefixMapping})

(def ore
  {:rdfa/uri    "http://www.openarchives.org/ore/terms/"
   :rdfa/prefix "ore"
   :rdf/type    :rdfa/PrefixMapping})

(def pav
  {:dcat/downloadURL "https://pav-ontology.github.io/pav/pav.rdf"
   :rdfa/uri         "http://purl.org/pav/"
   :rdfa/prefix      "pav"
   :rdf/type         :rdfa/PrefixMapping})

(def rdfg
  {:rdfa/uri    "http://www.w3.org/2004/03/trix/rdfg-1/"
   :rdfa/prefix "rdfg"
   :rdf/type    :rdfa/PrefixMapping})

(def spin
  {:rdfa/uri    "http://spinrdf.org/spin#"
   :rdfa/prefix "spin"
   :rdf/type    :rdfa/PrefixMapping})

(def sp
  {:rdfa/uri    "http://spinrdf.org/sp#"
   :rdfa/prefix "sp"
   :rdf/type    :rdfa/PrefixMapping})

(def spl
  {:rdfa/uri    "http://spinrdf.org/spl#"
   :rdfa/prefix "spl"
   :rdf/type    :rdfa/PrefixMapping})

(def svcs
  {:rdfa/uri         "http://rdfs.org/sioc/services#"
   :rdfa/prefix      "svcs"
   :rdf/type         :rdfa/PrefixMapping})

(def swrl
  {:dcat/downloadURL "http://www.w3.org/Submission/2004/SUBM-SWRL-20040521/swrl.rdf"
   :rdfa/uri         "http://www.w3.org/2003/11/swrl#"
   :rdfa/prefix      "swrl"
   :rdf/type         :rdfa/PrefixMapping})

(def voaf
  {:dcat/downloadURL "https://lov.linkeddata.es/vocommons/voaf/v2.3/voaf_v2.3.rdf"
   :rdfa/uri         "http://purl.org/vocommons/voaf#"
   :rdfa/prefix      "voaf"
   :rdf/type         :rdfa/PrefixMapping})

(def vs
  {:rdfa/uri    "http://www.w3.org/2003/06/sw-vocab-status/ns#"
   :rdfa/prefix "vs",
   :rdf/type    :rdfa/PrefixMapping})

(def vaem
  {:rdfa/uri    "http://www.linkedmodel.org/schema/vaem#"
   :rdfa/prefix "vaem",
   :rdf/type    :rdfa/PrefixMapping})

(def vann
  "A vocabulary for annotating vocabulary descriptions"
  {:rdfa/prefix      "vann"
   :rdfa/uri         "http://purl.org/vocab/vann/"
   :rdf/type         :rdfa/PrefixMapping
   :dcat/downloadURL "https://vocab.org/vann/vann-vocab-20100607.rdf"})

(def sm
  {:rdfa/uri    "http://www.omg.org/techprocess/ab/SpecificationMetadata/"
   :rdfa/prefix "sm"
   :rdf/type    :rdfa/PrefixMapping})

(def d3fend
  {:dcat/downloadURL "https://d3fend.mitre.org/ontologies/d3fend.owl"
   :rdfa/uri    "http://d3fend.mitre.org/ontologies/d3fend.owl#"
   :rdfa/prefix "d3fend"
   :rdf/type    :rdfa/PrefixMapping
   :rdf/ns-prefix-map {"d3fend"
                       "http://d3fend.mitre.org/ontologies/d3fend.owl#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"}})

(def qudt
  {:dcat/downloadURL "https://qudt.org/2.1/schema/qudt.ttl"
   :rdfa/uri         "http://qudt.org/2.1/schema/qudt/"
   :rdfa/prefix      "qudt"
   :rdf/type         :rdfa/PrefixMapping})

(def constant
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/constant.ttl"
   :rdfa/uri         "http://qudt.org/2.1/vocab/constant/"
   :rdfa/prefix      "constant"
   :rdf/type         :rdfa/PrefixMapping})

(def unit
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/unit.ttl"
   :rdfa/uri         "http://qudt.org/2.1/vocab/unit/"
   :rdfa/prefix      "unit"
   :rdf/type         :rdfa/PrefixMapping})

(def quantitykind
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/quantitykind.ttl"
   :rdfa/uri         "http://qudt.org/2.1/vocab/quantitykind/"
   :rdfa/prefix      "quantitykind"
   :rdf/type         :rdfa/PrefixMapping})

(def prefix
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/prefix.ttl"
   :rdfa/uri         "http://qudt.org/2.1/vocab/prefix/"
   :rdfa/prefix      "prefix"
   :rdf/type         :rdfa/PrefixMapping})

(def dimensionvector
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/dimensionvector.ttl"
   :rdfa/uri         "http://qudt.org/2.1/vocab/dimensionvector/"
   :rdfa/prefix      "qkdv"
   :rdf/type         :rdfa/PrefixMapping})

(def soqk
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/soqk.ttl"
   :rdfa/uri         "http://qudt.org/2.1/vocab/soqk/"
   :rdfa/prefix      "soqk"
   :rdf/type         :rdfa/PrefixMapping})

(def sou
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/sou.ttl"
   :rdfa/uri         "http://qudt.org/2.1/vocab/sou/"
   :rdfa/prefix      "sou"
   :rdf/type         :rdfa/PrefixMapping})

(def qudt.type
  {:dcat/downloadURL "https://raw.githubusercontent.com/qudt/qudt-public-repo/main/vocab/types/VOCAB_QUDT-DATATYPES-v2.1.ttl"
   :rdfa/uri         "http://qudt.org/2.1/schema/type/"
   :rdfa/prefix      "qudt.type"
   :rdf/type         :rdfa/PrefixMapping})

(def qudt.datatype
  {:dcat/downloadURL "https://qudt.org/2.1/schema/datatype.ttl"
   :rdfa/uri         "http://qudt.org/2.1/schema/datatype/" #_"http://qudt.org/2.1/schema/qudt/"
   :rdfa/prefix      "datatype" #_"qudt"
   :rdf/type         :rdfa/PrefixMapping})

(def qudt.math
  {:dcat/downloadURL "https://raw.githubusercontent.com/qudt/qudt-public-repo/main/vocab/mathematics/VOCAB_QUDT-MATHEMATICS-v2.1.18.ttl"
   :rdfa/uri         "http://qudt.org/2.1/vocab/mathematics/"
   :rdfa/prefix      "qudt.math"
   :rdf/type         :rdfa/PrefixMapping})

(def discipline
  {:dcat/downloadURL "https://raw.githubusercontent.com/qudt/qudt-public-repo/main/vocab/disciplines/VOCAB_QUDT-DISCIPLINES-v2.1.ttl"
   :rdfa/uri         "http://qudt.org/2.1/vocab/discipline/"
   :rdfa/prefix      "discipline"
   :rdf/type         :rdfa/PrefixMapping})

(def shacl
  {:rdfa/uri    "http://www.w3.org/ns/shacl#"
   :rdfa/prefix "sh"
   :rdf/type    :rdfa/PrefixMapping})

(def dtype
  {:rdfa/uri    "http://www.linkedmodel.org/schema/dtype#"
   :rdfa/prefix "dtype"
   :rdf/type    :rdfa/PrefixMapping})

(def voag
  {:dcat/downloadURL "https://lov.linkeddata.es/dataset/lov/vocabs/voag/versions/2012-11-01.n3"
   :rdfa/uri         "http://voag.linkedmodel.org/voag#"
   :rdfa/prefix      "voag"
   :rdf/type         :rdfa/PrefixMapping})

(def daq
  {:dcat/downloadURL "https://lov.linkeddata.es/dataset/lov/vocabs/daq/versions/2015-04-01.n3"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/prefix      "daq"
   :rdfa/uri         "http://purl.org/eis/vocab/daq#"})

(def sioc.types
  {:rdfa/uri    "http://rdfs.org/sioc/types#",
   :rdfa/prefix "sioc.types",
   :rdf/type    :rdfa/PrefixMapping})

(def annotea
  {:rdfa/uri    "http://www.w3.org/2002/01/bookmark#"
   :rdfa/prefix "annotea",
   :rdf/type    :rdfa/PrefixMapping})

(def annotation
  {:rdfa/uri    "http://www.w3.org/2000/10/annotation-ns#"
   :rdfa/prefix "annotation",
   :rdf/type    :rdfa/PrefixMapping})

(def scovo
  {:dcat/downloadURL "https://lov.linkeddata.es/dataset/lov/vocabs/scovo/versions/2012-08-09.n3"
   :rdfa/uri         "http://purl.org/NET/scovo#"
   :rdfa/prefix      "scovo",
   :rdf/type         :rdfa/PrefixMapping})

(def spdx
  {:dcat/downloadURL "https://raw.githubusercontent.com/spdx/spdx-spec/v2.3/ontology/spdx-ontology.owl.xml"
   :rdfa/uri         "http://spdx.org/rdf/terms#",
   :rdfa/prefix      "spdx",
   :rdf/type         :rdfa/PrefixMapping})

(def mop
  "Metaobject Protocol"
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/prefix "mop"
   :rdfa/uri    "https://wikipunk.net/mop#"})

(def event
  {:dcat/downloadURL "https://lov.linkeddata.es/dataset/lov/vocabs/event/versions/2007-10-25.n3"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://purl.org/NET/c4dm/event.owl#"
   :rdfa/prefix      "event"})

(def http
  {:dcat/downloadURL "https://lov.linkeddata.es/dataset/lov/vocabs/http/versions/2011-04-29.n3"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://www.w3.org/2011/http#"
   :rdfa/prefix      "http"})

(def afn
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://jena.hpl.hp.com/ARQ/function#"
   :rdfa/prefix "afn"})

(def ogc
  {:dcat/downloadURL "https://raw.githubusercontent.com/facebookarchive/open-graph-protocol/master/ns/ogp.me.rdf"
   :rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://ogp.me/ns/class#"
   :rdfa/prefix "ogc"})

(def sim
  {:dcat/downloadURL "https://lov.linkeddata.es/dataset/lov/vocabs/sim/versions/2010-03-10.n3"
   :rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://purl.org/ontology/similarity/"
   :rdfa/prefix "sim"})

(def pointers
  {:rdfa/uri    "http://www.w3.org/2009/pointers#"
   :rdfa/prefix "pointers"
   :rdf/type    :rdfa/PrefixMapping})

(def keys
  {:dcat/downloadURL "https://motools.sourceforge.net/keys/keys.owl"
   :rdfa/prefix      "keys"
   :rdfa/uri         "http://purl.org/NET/c4dm/keys.owl#"
   :rdf/type         :rdfa/PrefixMapping})

(def ^{:media-types
       {"JSON-LD"                "http://www.w3.org/ns/formats/JSON-LD",
        "LD Patch"               "http://www.w3.org/ns/formats/LD_Patch",
        "Microdata"              "http://www.w3.org/ns/formats/microdata",
        "N-Quads"                "http://www.w3.org/ns/formats/N-Quads",
        "N-Triples"              "http://www.w3.org/ns/formats/N-Triples",
        "N3"                     "http://www.w3.org/ns/formats/N3",
        "OWL Functional Syntax"  "http://www.w3.org/ns/formats/OWL_Functional",
        "OWL Manchester Syntax"  "http://www.w3.org/ns/formats/OWL_Manchester",
        "OWL XML Serialization"  "http://www.w3.org/ns/formats/OWL_XML",
        "POWDER"                 "http://www.w3.org/ns/formats/POWDER",
        "POWDER-S"               "http://www.w3.org/ns/formats/POWDER-S",
        "PROV-N"                 "http://www.w3.org/ns/formats/PROV-N",
        "PROV-XML"               "http://www.w3.org/ns/formats/PROV-XML",
        "RDF/JSON"               "http://www.w3.org/ns/formats/RDF_JSON",
        "RDF/XML"                "http://www.w3.org/ns/formats/RDF_XML",
        "RDFa"                   "http://www.w3.org/ns/formats/RDFa",
        "RIF XML Syntax"         "http://www.w3.org/ns/formats/RIF_XML",
        "SPARQL Results in CSV"  "http://www.w3.org/ns/formats/SPARQL_Results_CSV",
        "SPARQL Results in JSON" "http://www.w3.org/ns/formats/SPARQL_Results_JSON",
        "SPARQL Results in TSV"  "http://www.w3.org/ns/formats/SPARQL_Results_TSV",
        "TriG"                   "http://www.w3.org/ns/formats/TriG",
        "Turtle"                 "http://www.w3.org/ns/formats/Turtle"}}
  formats
  {:rdfa/prefix "formats"
   :rdfa/uri    "http://www.w3.org/ns/formats/"
   :rdf/type    :rdfa/PrefixMapping})

(def rel
  {:dcat/downloadURL "https://vocab.org/relationship/rel-vocab-20100607.rdf"
   :rdfa/prefix      "rel"
   :rdfa/uri         "http://purl.org/vocab/relationship/"
   :rdf/type         :rdfa/PrefixMapping})

(def label
  {:dcat/downloadURL "https://lov.linkeddata.es/dataset/lov/vocabs/label/versions/2004-03-28.n3"
   :rdfa/prefix      "label"
   :rdfa/uri         "http://purl.org/net/vocab/2004/03/label#"
   :rdf/type         :rdfa/PrefixMapping})

(def ov
  {:dcat/downloadURL "https://lov.linkeddata.es/dataset/lov/vocabs/ov/versions/2011-11-25.n3"
   :rdfa/prefix      "ov"
   :rdfa/uri         "http://open.vocab.org/terms/"
   :rdf/type         :rdfa/PrefixMapping})

(def cmns-av
  {:rdfa/prefix "cmns-av"
   :rdfa/uri    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-cr
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
   :rdfa/prefix "lcc-cr"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-lr
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
   :rdfa/prefix "lcc-lr"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-m49
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"
   :rdfa/prefix "lcc-m49"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-3166-1
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
   :rdfa/prefix "lcc-3166-1"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-3166-2
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"
   :rdfa/prefix "lcc-3166-2"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-639-1
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"
   :rdfa/prefix "lcc-639-1"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-639-2
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"
   :rdfa/prefix "lcc-639-2"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-3166-2-ca
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA.rdf"
   :rdfa/prefix      "lcc-3166-2-ca"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"
   :rdf/type         :rdfa/PrefixMapping})

(def lcc-3166-2-gb
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB.rdf"
   :rdfa/prefix      "lcc-3166-2-gb"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB/"
   :rdf/type         :rdfa/PrefixMapping})

(def lcc-3166-2-mx
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-MX.rdf"
   :rdfa/prefix      "lcc-3166-2-mx"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-MX/"
   :rdf/type         :rdfa/PrefixMapping})

(def lcc-3166-2-us
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US.rdf"
   :rdfa/prefix      "lcc-3166-2-us"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"
   :rdf/type         :rdfa/PrefixMapping})

(def iso639-1
  {:rdfa/prefix "iso639-1"
   :rdfa/uri    "https://id.loc.gov/vocabulary/iso639-1/"
   :rdf/type    :rdfa/PrefixMapping})

(def madsrdf
  {:dcat/downloadURL "resources/mads.rdf"
   :rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.loc.gov/mads/rdf/v1#"
   :rdfa/prefix "madsrdf"})

(def bibframe
  {:dcat/downloadURL "https://id.loc.gov/ontologies/bibframe.rdf"
   :rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/ontologies/bibframe/"
   :rdfa/prefix "bf"})

(def premis
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.loc.gov/premis/rdf/v3/"
   :rdfa/prefix "premis"})

(def bflc
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/ontologies/bflc/"
   :rdfa/prefix "bflc"})

(def changeset
  {:dcat/downloadURL "https://vocab.org/changeset/schema-20090518.rdf"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://purl.org/vocab/changeset/schema#"
   :rdfa/prefix      "cs"})

(def dbo
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://dbpedia.org/ontology/"
   :rdfa/prefix "dbo"})

(def dbc
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://dbpedia.org/resource/Category:"
   :rdfa/prefix "dbc"})

(def dbp
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://dbpedia.org/property/"
   :rdfa/prefix "dbp"})

(def dbr
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://dbpedia.org/resource/"
   :rdfa/prefix "dbr"})

(def dbt
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://dbpedia.org/resource/Template:"
   :rdfa/prefix "dbt"})

(def yago
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://dbpedia.org/class/yago/"
   :rdfa/prefix "yago"})

(def wikidata
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.wikidata.org/entity/"
   :rdfa/prefix "wd"
   :rdf/ns-prefix-map {"cc"       "http://creativecommons.org/ns#",
                       "dcterms"  "http://purl.org/dc/terms/",
                       "geo"      "http://www.opengis.net/ont/geosparql#",
                       "ontolex"  "http://www.w3.org/ns/lemon/ontolex#",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "prov"     "http://www.w3.org/ns/prov#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#"
                       "schema"   "http://schema.org/",
                       "skos"     "http://www.w3.org/2004/02/skos/core#",
                       "wd"       "http://www.wikidata.org/entity/",
                       "wikibase" "http://wikiba.se/ontology#",
                       "xsd"      "http://www.w3.org/2001/XMLSchema#"}})

(def wikibase
  {:rdf/type          :rdfa/PrefixMapping
   :rdfa/uri          "http://wikiba.se/ontology#"
   :rdfa/prefix       "wikibase"})

(def ontolex
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.w3.org/ns/lemon/ontolex#"
   :rdfa/prefix "ontolex"})

(def semiotics
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl#"
   :rdfa/prefix "semiotics"})

(def agentrole
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/agentrole.owl#"
   :rdfa/prefix "agentrole"})

(def objectrole
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/objectrole.owl#"
   :rdfa/prefix "objectrole"})

(def dul
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl#"
   :rdfa/prefix "dul"})

(def cpannotationschema
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#"
   :rdfa/prefix "cpannotationschema"})

(def situation
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/situation.owl#"
   :rdfa/prefix "situation"})

(def classification
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/classification.owl#"
   :rdfa/prefix "classification"})

(def informationrealization
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl#"
   :rdfa/prefix "informationrealization"})

(def cco
  {:dcat/downloadURL "http://purl.org/ontology/cco/cognitivecharacteristics.owl"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://purl.org/ontology/cco/core#"
   :rdfa/prefix      "cco"
   :rdf/ns-prefix-map
   {"ao"    "http://purl.org/ontology/ao/core#",
    "cco"   "http://purl.org/ontology/cco/core#",
    "dc11"  "http://purl.org/dc/elements/1.1/",
    "event" "http://purl.org/NET/c4dm/event.owl#",
    "foaf"  "http://xmlns.com/foaf/0.1/",
    "owl"   "http://www.w3.org/2002/07/owl#",
    "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
    "scovo" "http://purl.org/NET/scovo#",
    "vs"    "http://www.w3.org/2003/06/sw-vocab-status/ns#",
    "time"  "http://www.w3.org/2006/time#",
    "vann"  "http://purl.org/vocab/vann/",
    "wo"    "http://purl.org/ontology/wo/core#",
    "xsd"   "http://www.w3.org/2001/XMLSchema#"}})

(def wo
  {:dcat/downloadURL "http://purl.org/ontology/wo/weightingontology.owl"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://purl.org/ontology/wo/core#"
   :rdfa/prefix      "wo"
   :rdf/ns-prefix-map
   {"dc11"  "http://purl.org/dc/elements/1.1/",
    "event" "http://purl.org/NET/c4dm/event.owl#",
    "owl"   "http://www.w3.org/2002/07/owl#",
    "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
    "rev"   "http://purl.org/stuff/rev#",
    "scovo" "http://purl.org/NET/scovo#",
    "vs"    "http://www.w3.org/2003/06/sw-vocab-status/ns#",
    "vann"  "http://purl.org/vocab/vann/",
    "wo"    "http://purl.org/ontology/wo/core#",
    "xsd"   "http://www.w3.org/2001/XMLSchema#"}})

(def simulation
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://www.w3id.org/simulation/ontology/"
   :rdfa/prefix "simulation"
   :rdf/ns-prefix-map {"cpannotationschema"
                       "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#",
                       "dcterms"    "http://purl.org/dc/terms/",
                       "owl"        "http://www.w3.org/2002/07/owl#",
                       "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
                       "schema"     "http://schema.org/",
                       "simulation" "https://www.w3id.org/simulation/ontology/",
                       "vann"       "http://purl.org/vocab/vann/",
                       "xhv"        "https://www.w3.org/1999/xhtml/vocab#",
                       "prov"       "https://www.w3.org/ns/prov-o-inverses#"
                       "xsd"        "http://www.w3.org/2001/XMLSchema#"}})

(def hyperreal
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://www.w3id.org/simulation/data/"
   :rdfa/prefix "hyperreal"
   :rdf/ns-prefix-map
   {"dcterms"    "http://purl.org/dc/terms/",
    "hyperreal"  "https://w3id.org/simulation/data/",
    "owl"        "http://www.w3.org/2002/07/owl#",
    "prov"       "http://www.w3.org/ns/prov#",
    "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
    "schema"     "http://schema.org/",
    "simulation" "https://w3id.org/simulation/ontology/"}})

(def wn
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://wordnet-rdf.princeton.edu/ontology#"
   :rdfa/prefix "wn"})

(def isocat
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.isocat.org/ns/dcr.rdf#"
   :rdfa/prefix "isocat"})

(def wn.id
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://wordnet-rdf.princeton.edu/id/"
   :rdfa/prefix "wn.id"})

(def wn.lemma
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://wordnet-rdf.princeton.edu/rdf/lemma/"
   :rdfa/prefix "wn.lemma"})

(def wn.ttl
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://wordnet-rdf.princeton.edu/ttl/lemma/"
   :rdfa/prefix "wn.ttl"})

(def wn30
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://wordnet-rdf.princeton.edu/wn30/"
   :rdfa/prefix "wn30"})

(def synsem
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.w3.org/ns/lemon/synsem#"
   :rdfa/prefix "synsem"})

(def lime
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.w3.org/ns/lemon/lime#"
   :rdfa/prefix "lime"})

(def ili
  {:dcat/downloadURL "https://raw.githubusercontent.com/globalwordnet/cili/master/ili.ttl"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://globalwordnet.org/ili/"
   :rdfa/prefix      "ili"})

(def hydra
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://www.w3.org/ns/hydra/core#"
   :rdfa/prefix      "hydra"})
