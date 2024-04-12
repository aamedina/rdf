(ns net.wikipunk.rdf.stat
  "POSIX File Status"
  {:namespaces   {"rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                  "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                  "stat" "http://www.w3.org/ns/posix/stat#"},
   :rdf/type     :owl/Ontology,
   :rdfa/prefix  "stat",
   :rdfa/uri     "http://www.w3.org/ns/posix/stat#",
   :rdfs/comment "POSIX File Status"})

(def atime
  {:db/ident     :stat/atime,
   :rdfs/comment "time of last access"})

(def blksize
  {:db/ident     :stat/blksize,
   :rdfs/comment "blocksize for file system I/O"})

(def blocks
  {:db/ident     :stat/blocks,
   :rdfs/comment "number of 512B blocks allocated"})

(def ctime
  {:db/ident     :stat/ctime,
   :rdfs/comment "time of last status change"})

(def dev
  {:db/ident     :stat/dev,
   :rdfs/comment "ID of device containing file"})

(def gid
  {:db/ident     :stat/gid,
   :rdfs/comment "group ID of owner"})

(def ino
  {:db/ident     :stat/ino,
   :rdfs/comment "inode number"})

(def mode
  {:db/ident     :stat/mode,
   :rdfs/comment "protection"})

(def mtime
  {:db/ident     :stat/mtime,
   :rdfs/comment "time of last modification"})

(def nlink
  {:db/ident     :stat/nlink,
   :rdfs/comment "number of hard links"})

(def rdev
  {:db/ident     :stat/rdev,
   :rdfs/comment "device ID (if special file)"})

(def size
  {:db/ident     :stat/size,
   :rdfs/comment "total size, in bytes"})

(def uid
  {:db/ident     :stat/uid,
   :rdfs/comment "user ID of owner"})