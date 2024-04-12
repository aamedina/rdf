(ns net.wikipunk.rdf.stat
  "POSIX File Status"
  {:dcat/downloadURL "net/wikipunk/ext/stat.ttl",
   :namespaces       {"owl"  "http://www.w3.org/2002/07/owl#",
                      "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                      "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                      "stat" "http://www.w3.org/ns/posix/stat#",
                      "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type         :owl/Ontology,
   :rdfa/prefix      "stat",
   :rdfa/uri         "http://www.w3.org/ns/posix/stat#",
   :rdfs/comment     "POSIX File Status",
   :xsd/anyURI       "http://www.w3.org/ns/posix/stat#"})

(def atime
  {:db/ident     :stat/atime,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "time of last access",
   :rdfs/range   :xsd/dateTime})

(def blksize
  {:db/ident     :stat/blksize,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "blocksize for file system I/O",
   :rdfs/range   :xsd/int})

(def blocks
  {:db/ident     :stat/blocks,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "number of 512B blocks allocated",
   :rdfs/range   :xsd/long})

(def ctime
  {:db/ident     :stat/ctime,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "time of last status change",
   :rdfs/range   :xsd/dateTime})

(def dev
  {:db/ident     :stat/dev,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "ID of device containing file",
   :rdfs/range   :xsd/int})

(def gid
  {:db/ident     :stat/gid,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "group ID of owner",
   :rdfs/range   :xsd/int})

(def ino
  {:db/ident     :stat/ino,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "inode number",
   :rdfs/range   :xsd/long})

(def mode
  {:db/ident     :stat/mode,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "protection",
   :rdfs/range   :xsd/short})

(def mtime
  {:db/ident     :stat/mtime,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "time of last modification",
   :rdfs/range   :xsd/dateTime})

(def nlink
  {:db/ident     :stat/nlink,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "number of hard links",
   :rdfs/range   :xsd/int})

(def rdev
  {:db/ident     :stat/rdev,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "device ID (if special file)",
   :rdfs/range   :xsd/int})

(def size
  {:db/ident     :stat/size,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "total size, in bytes",
   :rdfs/range   :xsd/long})

(def uid
  {:db/ident     :stat/uid,
   :rdf/type     #{:rdf/Property :owl/FunctionalProperty},
   :rdfs/comment "user ID of owner",
   :rdfs/range   :xsd/int})

(def urn:uuid:814bb630-09a9-5534-8d4e-1ff745c8dae6
  {:rdf/type     :owl/Ontology,
   :rdfs/comment "POSIX File Status",
   :xsd/anyURI   "http://www.w3.org/ns/posix/stat#"})