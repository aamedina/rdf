(ns net.wikipunk.ext
  "Beyond the RDFa 1.1 / JSON-LD initial context."
  {:rdf/type :jsonld/Context})

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
   :rdf/type    :rdfa/PrefixMapping})

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

(def db
  {:rdfa/prefix "db"
   :rdfa/uri    "https://wikipunk.net/db#"
   :rdf/type    :rdfa/PrefixMapping})

(def db.alter
  "alter"
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "db.alter",
   :rdfa/uri "https://wikipunk.net/db/alter#"})

(def db.attr
  "attr"
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "db.attr",
   :rdfa/uri "https://wikipunk.net/db/attr#"})

(def db.bootstrap
  "bootstrap"
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "db.bootstrap",
   :rdfa/uri "https://wikipunk.net/db/bootstrap#"})

(def db.cardinality
  "cardinality"
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "db.cardinality",
   :rdfa/uri "https://wikipunk.net/db/cardinality#"})

(def db.entity
  "entity"
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "db.entity",
   :rdfa/uri "https://wikipunk.net/db/entity#"})

(def db.excise
  "excise"
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "db.excise",
   :rdfa/uri "https://wikipunk.net/db/excise#"})

(def db.install
  "install"
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "db.install",
   :rdfa/uri "https://wikipunk.net/db/install#"})

(def db.part
  "part"
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "db.part",
   :rdfa/uri "https://wikipunk.net/db/part#"})

(def db.type
  "type"
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "db.type",
   :rdfa/uri "https://wikipunk.net/db/type#"})

(def db.unique
  "unique"
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "db.unique",
   :rdfa/uri "https://wikipunk.net/db/unique#"})

(def fressian
  "fressian"
  {:rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "fressian",
   :rdfa/uri "https://wikipunk.net/fressian#"})

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
