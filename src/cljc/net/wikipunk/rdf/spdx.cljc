(ns net.wikipunk.rdf.spdx
  "This specification describes the SPDX® language, defined as a dictionary of named properties and classes using W3C's RDF Technology.\n\nSPDX® is an open standard for communicating software bill of material information, including components, licenses, copyrights, and security references. SPDX reduces redundant work by providing a common format for companies and communities to share important data, thereby streamlining and improving compliance.\n.\nKnown issues:\n- rdfs:comment and rdfs:seeAlso are used within the SPDX classes and causes a redefinition of these standard terms"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/spdx/spdx-spec/v2.3/ontology/spdx-ontology.owl.xml",
   :owl/versionIRI {:rdfa/uri "http://spdx.org/rdf/terms/2.3"},
   :owl/versionInfo #xsd/decimal 2.3M,
   :rdf/ns-prefix-map {"doap" "http://usefulinc.com/ns/doap#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "spdx" "http://spdx.org/rdf/terms#",
                       "vs"   "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "spdx",
   :rdfa/uri "http://spdx.org/rdf/terms",
   :rdfs/comment
   #xsd/langString
    "This specification describes the SPDX® language, defined as a dictionary of named properties and classes using W3C's RDF Technology.\n\nSPDX® is an open standard for communicating software bill of material information, including components, licenses, copyrights, and security references. SPDX reduces redundant work by providing a common format for companies and communities to share important data, thereby streamlining and improving compliance.\n.\nKnown issues:\n- rdfs:comment and rdfs:seeAlso are used within the SPDX classes and causes a redefinition of these standard terms@en",
   :rdfs/label #xsd/string "SPDX 2.3"}
  (:refer-clojure :exclude [name range]))

(def Annotation
  "An Annotation is a comment on an SpdxItem by an agent."
  {:db/ident        :spdx/Annotation,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/string
                     "An Annotation is a comment on an SpdxItem by an agent.",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/annotator,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/dateTime,
                      :owl/onProperty  :spdx/annotationDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :spdx/AnnotationType,
                      :owl/onProperty :spdx/annotationType,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status  #xsd/langString "stable@en"})

(def AnnotationType
  "This type describes the type of annotation. Annotations are usually created when someone reviews the file, and if this is the case the annotation type should be REVIEW."
  {:db/ident :spdx/AnnotationType,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "This type describes the type of annotation. Annotations are usually created when someone reviews the file, and if this is the case the annotation type should be REVIEW.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def AnyLicenseInfo
  "The AnyLicenseInfo class includes all resources that represent licensing information."
  {:db/ident :spdx/AnyLicenseInfo,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "The AnyLicenseInfo class includes all resources that represent licensing information.",
   :rdfs/isDefinedBy #xsd/string "http://spdx.org/rdf/terms#AnyLicenseInfo",
   :vs/term_status #xsd/string "stable"})

(def Checksum
  "A Checksum is value that allows the contents of a file to be authenticated. Even small changes to the content of the file will change its checksum. This class allows the results of a variety of checksum and cryptographic message digest algorithms to be represented."
  {:db/ident :spdx/Checksum,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A Checksum is value that allows the contents of a file to be authenticated. Even small changes to the content of the file will change its checksum. This class allows the results of a variety of checksum and cryptographic message digest algorithms to be represented.@en",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/hexBinary,
                      :owl/onProperty  :spdx/checksumValue,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :spdx/ChecksumAlgorithm,
                      :owl/onProperty :spdx/algorithm,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status #xsd/langString "stable@en"})

(def ChecksumAlgorithm
  "Algorighm for Checksums."
  {:db/ident       :spdx/ChecksumAlgorithm,
   :rdf/type       :owl/Class,
   :rdfs/comment   #xsd/langString "Algorighm for Checksums.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def ConjunctiveLicenseSet
  "A ConjunctiveLicenseSet represents a set of licensing information all of which apply."
  {:db/ident :spdx/ConjunctiveLicenseSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A ConjunctiveLicenseSet represents a set of licensing information all of which apply.@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 2,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/member,
                      :rdf/type       :owl/Restriction}
                     :rdfs/Container
                     :spdx/AnyLicenseInfo],
   :vs/term_status #xsd/langString "stable@en"})

(def CreationInfo
  "One instance is required for each SPDX file produced. It provides the necessary information for forward and backward compatibility for processing tools."
  {:db/ident :spdx/CreationInfo,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "One instance is required for each SPDX file produced. It provides the necessary information for forward and backward compatibility for processing tools.@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseListVersion,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/dateTimeStamp,
                      :owl/onProperty  :spdx/created,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/creator,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/langString "stable@en"})

(def CrossRef
  "Cross reference details for the a URL reference"
  {:db/ident        :spdx/CrossRef,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString
                     "Cross reference details for the a URL reference@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isValid,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isLive,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/isWayBackLink,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/match,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/url,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :spdx/order,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/dateTime,
                      :owl/onProperty  :spdx/timestamp,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status  #xsd/langString "stable@en"})

(def DisjunctiveLicenseSet
  "A DisjunctiveLicenseSet represents a set of licensing information where only one license applies at a time. This class implies that the recipient gets to choose one of these licenses they would prefer to use."
  {:db/ident :spdx/DisjunctiveLicenseSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A DisjunctiveLicenseSet represents a set of licensing information where only one license applies at a time. This class implies that the recipient gets to choose one of these licenses they would prefer to use.@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 2,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/member,
                      :rdf/type       :owl/Restriction}
                     :rdfs/Container
                     :spdx/AnyLicenseInfo],
   :vs/term_status #xsd/langString "stable@en"})

(def ExternalDocumentRef
  "Information about an external SPDX document reference including the checksum. This allows for verification of the external references."
  {:db/ident :spdx/ExternalDocumentRef,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Information about an external SPDX document reference including the checksum. This allows for verification of the external references.@en",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/externalDocumentId,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :spdx/SpdxDocument,
                      :owl/onProperty :spdx/spdxDocument,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :spdx/Checksum,
                      :owl/onProperty :spdx/checksum,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status #xsd/langString "stable@en"})

(def ExternalRef
  "An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package."
  {:db/ident :spdx/ExternalRef,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package.@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/referenceLocator,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :spdx/ReferenceType,
                      :owl/onProperty :spdx/referenceType,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :spdx/ReferenceCategory,
                      :owl/onProperty :spdx/referenceCategory,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status #xsd/langString "stable@en"})

(def ExtractedLicensingInfo
  "An ExtractedLicensingInfo represents a license or licensing notice that was found in a package, file or snippet. Any license text that is recognized as a license may be represented as a License rather than an ExtractedLicensingInfo."
  {:db/ident :spdx/ExtractedLicensingInfo,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An ExtractedLicensingInfo represents a license or licensing notice that was found in a package, file or snippet. Any license text that is recognized as a license may be represented as a License rather than an ExtractedLicensingInfo.@en",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/extractedText,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :spdx/SimpleLicensingInfo
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/CrossRef,
                      :owl/onProperty :spdx/crossRef,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :rdf/type        :owl/Restriction}
                     :spdx/AnyLicenseInfo
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseId,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :rdfs/seeAlso,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "stable"})

(def File
  "A File represents a named sequence of information that is contained in a software package."
  {:db/ident :spdx/File,
   :owl/disjointWith :spdx/Snippet,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A File represents a named sequence of information that is contained in a software package.@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/File,
                      :owl/onProperty :spdx/fileDependency,
                      :rdf/type       :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/fileName,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/licenseInfoInFile,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :doap/Project,
                      :owl/onProperty :spdx/artifactOf,
                      :rdf/type       :owl/Restriction}
                     :spdx/SpdxItem
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onClass    :spdx/Checksum,
                      :owl/onProperty :spdx/checksum,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/fileContributor,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/FileType,
                      :owl/onProperty :spdx/fileType,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/noticeText,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseComments,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Annotation,
                      :owl/onProperty :spdx/annotation,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/attributionText,
                      :rdf/type        :owl/Restriction}
                     {:owl/unionOf [{:owl/hasValue   :spdx/noassertion,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}
                                    {:owl/hasValue   :spdx/none,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}
                                    {:owl/maxQualifiedCardinality
                                     #xsd/nonNegativeInteger 1,
                                     :owl/onClass    :spdx/AnyLicenseInfo,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}],
                      :rdf/type    :owl/Class}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/licenseInfoFromFiles,
                      :rdf/type       :owl/Restriction}
                     :spdx/SpdxElement
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Relationship,
                      :owl/onProperty :spdx/relationship,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/copyrightText,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/langString "stable@en"})

(def FileType
  "Type of file."
  {:db/ident       :spdx/FileType,
   :rdf/type       :owl/Class,
   :rdfs/comment   #xsd/langString "Type of file.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def License
  "A License represents a copyright license. The SPDX license list website is annotated with these properties (using RDFa) to allow license data published there to be easily processed. The license list is populated in accordance with the License List fields guidelines. These guidelines are not normative and may change over time. SPDX tooling should not rely on values in the license list conforming to the current guidelines."
  {:db/ident :spdx/License,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A License represents a copyright license. The SPDX license list website is annotated with these properties (using RDFa) to allow license data published there to be easily processed. The license list is populated in accordance with the License List fields guidelines. These guidelines are not normative and may change over time. SPDX tooling should not rely on values in the license list conforming to the current guidelines.@en",
   :rdfs/subClassOf [:spdx/SimpleLicensingInfo
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isDeprecatedLicenseId,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isFsfLibre,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/standardLicenseHeader,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isOsiApproved,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/standardLicenseHeaderTemplate,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseText,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/standardLicenseTemplate,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :rdf/type        :owl/Restriction}
                     :spdx/AnyLicenseInfo
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseId,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :rdfs/seeAlso,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/CrossRef,
                      :owl/onProperty :spdx/crossRef,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status #xsd/langString "stable@en"})

(def LicenseException
  "An exception to a license."
  {:db/ident        :spdx/LicenseException,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "An exception to a license.@en",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseExceptionId,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseExceptionTemplate,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseExceptionText,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/example,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :rdfs/seeAlso,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status  #xsd/langString "stable@en"})

(def ListedLicense
  "A license which is included in the SPDX License List (http://spdx.org/licenses)."
  {:db/ident :spdx/ListedLicense,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A license which is included in the SPDX License List (http://spdx.org/licenses).@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/standardLicenseHeaderHtml,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseTextHtml,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isDeprecatedLicenseId,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/deprecatedVersion,
                      :rdf/type        :owl/Restriction}
                     :spdx/License
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/standardLicenseHeader,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isDeprecatedLicenseId,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :rdf/type        :owl/Restriction}
                     :spdx/AnyLicenseInfo
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseId,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :rdfs/seeAlso,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/standardLicenseHeaderTemplate,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/CrossRef,
                      :owl/onProperty :spdx/crossRef,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isFsfLibre,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isOsiApproved,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/standardLicenseTemplate,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseText,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :spdx/SimpleLicensingInfo],
   :vs/term_status #xsd/langString "stable@en"})

(def ListedLicenseException
  "License exception specific to ListedLicenses"
  {:db/ident        :spdx/ListedLicenseException,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/string "License exception specific to ListedLicenses",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/exceptionTextHtml,
                      :rdf/type        :owl/Restriction}
                     :spdx/LicenseException
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseExceptionId,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :rdfs/seeAlso,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseExceptionText,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseExceptionTemplate,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/example,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}]})

(def OrLaterOperator
  "A license with an or later operator indicating this license version or any later version of the license"
  {:db/ident :spdx/OrLaterOperator,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A license with an or later operator indicating this license version or any later version of the license@en",
   :rdfs/subClassOf [{:owl/onClass    :spdx/SimpleLicensingInfo,
                      :owl/onProperty :spdx/member,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :spdx/AnyLicenseInfo],
   :vs/term_status #xsd/langString "stable@en"})

(def PackageClass
  "A Package represents a collection of software files that are delivered as a single functional component."
  {:db/ident :spdx/Package,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A Package represents a collection of software files that are delivered as a single functional component.@en",
   :rdfs/subClassOf
   [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :spdx/summary,
     :rdf/type        :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :spdx/filesAnalyzed,
     :rdf/type        :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :spdx/description,
     :rdf/type        :owl/Restriction}
    {:owl/onDataRange :xsd/anyURI,
     :owl/onProperty  :spdx/downloadLocation,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onClass    :spdx/Checksum,
     :owl/onProperty :spdx/checksum,
     :rdf/type       :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :spdx/sourceInfo,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onClass    :spdx/ExternalRef,
     :owl/onProperty :spdx/externalRef,
     :rdf/type       :owl/Restriction}
    :spdx/SpdxItem
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/date,
     :owl/onProperty  :spdx/builtDate,
     :rdf/type        :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/date,
     :owl/onProperty  :spdx/validUntilDate,
     :rdf/type        :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/date,
     :owl/onProperty  :spdx/releaseDate,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onClass    :spdx/File,
     :owl/onProperty :spdx/hasFile,
     :rdf/type       :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :spdx/supplier,
     :rdf/type        :owl/Restriction}
    {:owl/unionOf [{:owl/hasValue   :spdx/noassertion,
                    :owl/onProperty :spdx/licenseDeclared,
                    :rdf/type       :owl/Restriction}
                   {:owl/hasValue   :spdx/none,
                    :owl/onProperty :spdx/licenseDeclared,
                    :rdf/type       :owl/Restriction}
                   {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                    :owl/onClass    :spdx/AnyLicenseInfo,
                    :owl/onProperty :spdx/licenseDeclared,
                    :rdf/type       :owl/Restriction}],
     :rdf/type    :owl/Class}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onClass    :spdx/PackageVerificationCode,
     :owl/onProperty :spdx/packageVerificationCode,
     :rdf/type       :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :spdx/originator,
     :rdf/type        :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/anyURI,
     :owl/onProperty  :doap/homepage,
     :rdf/type        :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :spdx/versionInfo,
     :rdf/type        :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :spdx/packageFileName,
     :rdf/type        :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onClass    :spdx/Purpose,
     :owl/onProperty :spdx/primaryPackagePurpose,
     :rdf/type       :owl/Restriction}
    {:owl/onDataRange :xsd/string,
     :owl/onProperty  :spdx/name,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type        :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :rdfs/comment,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onClass    :spdx/Annotation,
     :owl/onProperty :spdx/annotation,
     :rdf/type       :owl/Restriction}
    {:owl/unionOf [{:owl/hasValue   :spdx/noassertion,
                    :owl/onProperty :spdx/licenseConcluded,
                    :rdf/type       :owl/Restriction}
                   {:owl/hasValue   :spdx/none,
                    :owl/onProperty :spdx/licenseConcluded,
                    :rdf/type       :owl/Restriction}
                   {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                    :owl/onClass    :spdx/AnyLicenseInfo,
                    :owl/onProperty :spdx/licenseConcluded,
                    :rdf/type       :owl/Restriction}],
     :rdf/type    :owl/Class}
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onClass    :spdx/AnyLicenseInfo,
     :owl/onProperty :spdx/licenseInfoFromFiles,
     :rdf/type       :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :spdx/copyrightText,
     :rdf/type        :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :spdx/licenseComments,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :spdx/attributionText,
     :rdf/type        :owl/Restriction}
    :spdx/SpdxElement
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onClass    :spdx/Relationship,
     :owl/onProperty :spdx/relationship,
     :rdf/type       :owl/Restriction}],
   :vs/term_status #xsd/langString "stable@en"})

(def PackageVerificationCode
  "A manifest based verification code (the algorithm is defined in section 4.7 of the full specification) of the SPDX Item. This allows consumers of this data and/or database to determine if an SPDX item they have in hand is identical to the SPDX item from which the data was produced. This algorithm works even if the SPDX document is included in the SPDX item."
  {:db/ident :spdx/PackageVerificationCode,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A manifest based verification code (the algorithm is defined in section 4.7 of the full specification) of the SPDX Item. This allows consumers of this data and/or database to determine if an SPDX item they have in hand is identical to the SPDX item from which the data was produced. This algorithm works even if the SPDX document is included in the SPDX item.@en",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/hexBinary,
                      :owl/onProperty  :spdx/packageVerificationCodeValue,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty :spdx/packageVerificationCodeExcludedFile,
                      :rdf/type :owl/Restriction}],
   :vs/term_status #xsd/langString "stable@en"})

(def Purpose
  "Package Purpose is intrinsic to how the package is being used rather than the content of the package."
  {:db/ident :spdx/Purpose,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Package Purpose is intrinsic to how the package is being used rather than the content of the package.",
   :vs/term_status #xsd/string "stable"})

(def ReferenceCategory
  "Category used for ExternalRef"
  {:db/ident       :spdx/ReferenceCategory,
   :rdf/type       :owl/Class,
   :rdfs/comment   #xsd/langString "Category used for ExternalRef@en",
   :vs/term_status #xsd/langString "stable@en"})

(def ReferenceType
  "Types used to external reference identifiers."
  {:db/ident        :spdx/ReferenceType,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString
                     "Types used to external reference identifiers.@en",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/externalReferenceSite,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/documentation,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/contextualExample,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status  #xsd/langString "stable@en"})

(def Relationship
  "A Relationship represents a relationship between two SpdxElements."
  {:db/ident :spdx/Relationship,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A Relationship represents a relationship between two SpdxElements.@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :spdx/RelationshipType,
                      :owl/onProperty :spdx/relationshipType,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :spdx/SpdxElement,
                      :owl/onProperty :spdx/relatedSpdxElement,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status #xsd/langString "stable@en"})

(def RelationshipType
  "Type of relationship."
  {:db/ident       :spdx/RelationshipType,
   :rdf/type       :owl/Class,
   :rdfs/comment   #xsd/langString "Type of relationship.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def Review
  "This class has been deprecated in favor of an Annotation with an Annotation type of review."
  {:db/ident :spdx/Review,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "This class has been deprecated in favor of an Annotation with an Annotation type of review.@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/reviewer,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/dateTime,
                      :owl/onProperty  :spdx/reviewDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/langString "deprecated@en"})

(def SimpleLicensingInfo
  "The SimpleLicenseInfo class includes all resources that represent simple, atomic, licensing information."
  {:db/ident :spdx/SimpleLicensingInfo,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The SimpleLicenseInfo class includes all resources that represent simple, atomic, licensing information.@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseId,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :rdfs/seeAlso,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/CrossRef,
                      :owl/onProperty :spdx/crossRef,
                      :rdf/type       :owl/Restriction}
                     :spdx/AnyLicenseInfo],
   :vs/term_status #xsd/langString "stable@en"})

(def Snippet
  "The set of bytes in a file. The name of the snippet is the name of the file appended with the byte range in parenthesis (ie: \"./file/name(2145:5532)\")"
  {:db/ident :spdx/Snippet,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The set of bytes in a file. The name of the snippet is the name of the file appended with the byte range in parenthesis (ie: \"./file/name(2145:5532)\")@en",
   :rdfs/subClassOf [{:owl/onClass    :spdx/File,
                      :owl/onProperty :spdx/snippetFromFile,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onClass    :pointers/StartEndPointer,
                      :owl/onProperty :spdx/range,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/licenseInfoInSnippet,
                      :rdf/type       :owl/Restriction}
                     :spdx/SpdxItem
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseComments,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Annotation,
                      :owl/onProperty :spdx/annotation,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/attributionText,
                      :rdf/type        :owl/Restriction}
                     {:owl/unionOf [{:owl/hasValue   :spdx/noassertion,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}
                                    {:owl/hasValue   :spdx/none,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}
                                    {:owl/maxQualifiedCardinality
                                     #xsd/nonNegativeInteger 1,
                                     :owl/onClass    :spdx/AnyLicenseInfo,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}],
                      :rdf/type    :owl/Class}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/licenseInfoFromFiles,
                      :rdf/type       :owl/Restriction}
                     :spdx/SpdxElement
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Relationship,
                      :owl/onProperty :spdx/relationship,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/copyrightText,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/langString "stable@en"})

(def SpdxDocument
  "An SpdxDocument is a summary of the contents, provenance, ownership and licensing analysis of a specific software package. This is, effectively, the top level of SPDX information."
  {:db/ident :spdx/SpdxDocument,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An SpdxDocument is a summary of the contents, provenance, ownership and licensing analysis of a specific software package. This is, effectively, the top level of SPDX information.@en",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/specVersion,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/dataLicense,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/ExtractedLicensingInfo,
                      :owl/onProperty :spdx/hasExtractedLicensingInfo,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Review,
                      :owl/onProperty :spdx/reviewed,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Package,
                      :owl/onProperty :spdx/describesPackage,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :spdx/CreationInfo,
                      :owl/onProperty :spdx/creationInfo,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/ExternalDocumentRef,
                      :owl/onProperty :spdx/externalDocumentRef,
                      :rdf/type       :owl/Restriction}
                     :spdx/SpdxElement
                     {:owl/hasValue   {:rdfa/uri
                                       "http://spdx.org/licenses/CC0-1.0"},
                      :owl/onProperty :spdx/dataLicense,
                      :rdf/type       :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Annotation,
                      :owl/onProperty :spdx/annotation,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Relationship,
                      :owl/onProperty :spdx/relationship,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status #xsd/string "stable"})

(def SpdxElement
  "An SpdxElement is any thing described in SPDX, either a document or an SpdxItem. SpdxElements can be related to other SpdxElements."
  {:db/ident :spdx/SpdxElement,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An SpdxElement is any thing described in SPDX, either a document or an SpdxItem. SpdxElements can be related to other SpdxElements.@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Relationship,
                      :owl/onProperty :spdx/relationship,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Annotation,
                      :owl/onProperty :spdx/annotation,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status #xsd/string "stable"})

(def SpdxItem
  "An SpdxItem is a potentially copyrightable work."
  {:db/ident        :spdx/SpdxItem,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString
                     "An SpdxItem is a potentially copyrightable work.@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseComments,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/copyrightText,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/attributionText,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/licenseInfoFromFiles,
                      :rdf/type       :owl/Restriction}
                     {:owl/unionOf [{:owl/hasValue   :spdx/noassertion,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}
                                    {:owl/hasValue   :spdx/none,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}
                                    {:owl/maxQualifiedCardinality
                                     #xsd/nonNegativeInteger 1,
                                     :owl/onClass    :spdx/AnyLicenseInfo,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}],
                      :rdf/type    :owl/Class}
                     :spdx/SpdxElement
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Annotation,
                      :owl/onProperty :spdx/annotation,
                      :rdf/type       :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :spdx/Relationship,
                      :owl/onProperty :spdx/relationship,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status  #xsd/langString "stable@en"})

(def WithExceptionOperator
  "Sometimes a set of license terms apply except under special circumstances. In this case, use the binary \"WITH\" operator to construct a new license expression to represent the special exception situation. A valid <license-expression> is where the left operand is a <simple-expression> value and the right operand is a <license-exception-id> that represents the special exception terms."
  {:db/ident :spdx/WithExceptionOperator,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Sometimes a set of license terms apply except under special circumstances. In this case, use the binary \"WITH\" operator to construct a new license expression to represent the special exception situation. A valid <license-expression> is where the left operand is a <simple-expression> value and the right operand is a <license-exception-id> that represents the special exception terms.@en",
   :rdfs/subClassOf [{:owl/onClass    :spdx/SimpleLicensingInfo,
                      :owl/onProperty :spdx/member,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :spdx/LicenseException,
                      :owl/onProperty :spdx/licenseException,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :spdx/AnyLicenseInfo],
   :vs/term_status #xsd/langString "stable@en"})

(def algorithm
  "Identifies the algorithm used to produce the subject Checksum. Currently, SHA-1 is the only supported algorithm. It is anticipated that other algorithms will be supported at a later time."
  {:db/ident :spdx/algorithm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Identifies the algorithm used to produce the subject Checksum. Currently, SHA-1 is the only supported algorithm. It is anticipated that other algorithms will be supported at a later time.@en",
   :rdfs/domain :spdx/Checksum,
   :vs/term_status #xsd/string "stable"})

(def annotation
  "Provide additional information about an SpdxElement."
  {:db/ident       :spdx/annotation,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #xsd/langString
                    "Provide additional information about an SpdxElement.@en",
   :rdfs/domain    :spdx/SpdxElement,
   :rdfs/range     :spdx/Annotation,
   :vs/term_status #xsd/string "stable"})

(def annotationDate
  "Identify when the comment was made. This is to be specified according to the combined date and time in the UTC format, as specified in the ISO 8601 standard."
  {:db/ident :spdx/annotationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Identify when the comment was made. This is to be specified according to the combined date and time in the UTC format, as specified in the ISO 8601 standard.@en",
   :rdfs/domain :spdx/Annotation,
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :spdx/date,
   :vs/term_status #xsd/string "stable"})

(def annotationType
  "Type of the annotation."
  {:db/ident       :spdx/annotationType,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #xsd/langString "Type of the annotation.@en",
   :rdfs/domain    :spdx/Annotation,
   :rdfs/range     {:owl/unionOf [{:owl/hasValue   :spdx/annotationType_other,
                                   :owl/onProperty :spdx/annotationType,
                                   :rdf/type       :owl/Restriction}
                                  {:owl/hasValue   :spdx/annotationType_review,
                                   :owl/onProperty :spdx/annotationType,
                                   :rdf/type       :owl/Restriction}],
                    :rdf/type    :owl/Class},
   :vs/term_status #xsd/langString "stable@en"})

(def annotationType_other
  "Type of annotation which does not fit in any of the pre-defined annotation types."
  {:db/ident :spdx/annotationType_other,
   :rdf/type [:spdx/AnnotationType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Type of annotation which does not fit in any of the pre-defined annotation types.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def annotationType_review
  "A Review represents an audit and signoff by an individual, organization or tool on the information for an SpdxElement."
  {:db/ident :spdx/annotationType_review,
   :rdf/type [:spdx/AnnotationType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Review represents an audit and signoff by an individual, organization or tool on the information for an SpdxElement.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def annotator
  "This field identifies the person, organization, or tool that has commented on a file, package, snippet, or the entire document."
  {:db/ident :spdx/annotator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "This field identifies the person, organization, or tool that has commented on a file, package, snippet, or the entire document.",
   :rdfs/domain :spdx/Annotation,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def artifactOf
  {:db/ident :spdx/artifactOf,
   :owl/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "Indicates the project in which the SpdxElement originated. Tools must preserve doap:homepage and doap:name properties and the URI (if one is known) of doap:Project resources that are values of this property. All other properties of doap:Projects are not directly supported by SPDX and may be dropped when translating to or from some SPDX formats.@en"
    #xsd/langString "Deprecated as of version 2.1@en"],
   :rdfs/domain :spdx/SpdxElement,
   :rdfs/range :doap/Project,
   :vs/term_status #xsd/langString "deprecated@en"})

(def attributionText
  "This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce."
  {:db/ident :spdx/attributionText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce.@en",
   :rdfs/domain :spdx/SpdxItem,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def builtDate
  "This field provides a place for recording the actual date the package was built."
  {:db/ident :spdx/builtDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "This field provides a place for recording the actual date the package was built.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :spdx/date,
   :vs/term_status #xsd/langString "stable@en"})

(def checksum
  "The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed."
  {:db/ident :spdx/checksum,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.@en",
   :rdfs/domain {:owl/unionOf [:spdx/File :spdx/Package],
                 :rdf/type    :owl/Class},
   :rdfs/range :spdx/Checksum,
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_adler32
  "Indicates the algorithm used was ADLER32."
  {:db/ident       :spdx/checksumAlgorithm_adler32,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "Indicates the algorithm used was ADLER32.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_blake2b256
  "Indicates the algorithm used was BLAKE2b-256."
  {:db/ident       :spdx/checksumAlgorithm_blake2b256,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "Indicates the algorithm used was BLAKE2b-256.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_blake2b384
  "Indicates the algorithm used was BLAKE2b-384."
  {:db/ident       :spdx/checksumAlgorithm_blake2b384,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "Indicates the algorithm used was BLAKE2b-384.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_blake2b512
  "Indicates the algorithm used was BLAKE2b-512."
  {:db/ident       :spdx/checksumAlgorithm_blake2b512,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "Indicates the algorithm used was BLAKE2b-512.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_blake3
  "Indicates the algorithm used was BLAKE3."
  {:db/ident       :spdx/checksumAlgorithm_blake3,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "Indicates the algorithm used was BLAKE3.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_md2
  "Indicates the algorithm used was MD2"
  {:db/ident       :spdx/checksumAlgorithm_md2,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/string "Indicates the algorithm used was MD2",
   :vs/term_status #xsd/string "stable"})

(def checksumAlgorithm_md4
  "Indicates the algorithm used was MD4"
  {:db/ident       :spdx/checksumAlgorithm_md4,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/string "Indicates the algorithm used was MD4",
   :vs/term_status #xsd/string "stable"})

(def checksumAlgorithm_md5
  "Indicates the algorithm used was MD5"
  {:db/ident       :spdx/checksumAlgorithm_md5,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "Indicates the algorithm used was MD5@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_md6
  "Indicates the algorithm used was MD6"
  {:db/ident       :spdx/checksumAlgorithm_md6,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "Indicates the algorithm used was MD6@en",
   :vs/term_status #xsd/string "stable"})

(def checksumAlgorithm_sha1
  "Indicates the algorithm used was SHA-1"
  {:db/ident       :spdx/checksumAlgorithm_sha1,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/string "Indicates the algorithm used was SHA-1",
   :vs/term_status #xsd/string "stable"})

(def checksumAlgorithm_sha224
  "Indicates the algorithm used was SHA224"
  {:db/ident       :spdx/checksumAlgorithm_sha224,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "Indicates the algorithm used was SHA224@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_sha256
  "Indicates the algorithm used was SHA256"
  {:db/ident       :spdx/checksumAlgorithm_sha256,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "Indicates the algorithm used was SHA256@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_sha384
  "Indicates the algorithm used was SHA384"
  {:db/ident       :spdx/checksumAlgorithm_sha384,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "Indicates the algorithm used was SHA384@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_sha3_256
  "Indicates the algorithm used was SHA3-256."
  {:db/ident       :spdx/checksumAlgorithm_sha3_256,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "Indicates the algorithm used was SHA3-256.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_sha3_384
  "Indicates the algorithm used was SHA3-384."
  {:db/ident       :spdx/checksumAlgorithm_sha3_384,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "Indicates the algorithm used was SHA3-384.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_sha3_512
  "Indicates the algorithm used was SHA3-512."
  {:db/ident       :spdx/checksumAlgorithm_sha3_512,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "Indicates the algorithm used was SHA3-512.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumAlgorithm_sha512
  "Indicates the algorithm used was SHA512"
  {:db/ident       :spdx/checksumAlgorithm_sha512,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "Indicates the algorithm used was SHA512@en",
   :vs/term_status #xsd/langString "stable@en"})

(def checksumValue
  "The checksumValue property provides a lower case hexidecimal encoded digest value produced using a specific algorithm."
  {:db/ident :spdx/checksumValue,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #xsd/langString
    "The checksumValue property provides a lower case hexidecimal encoded digest value produced using a specific algorithm.@en",
   :rdfs/domain :spdx/Checksum,
   :rdfs/range :xsd/hexBinary,
   :vs/term_status #xsd/string "stable"})

(def contextualExample
  "Example for use of the external repository identifier"
  {:db/ident       :spdx/contextualExample,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString
                    "Example for use of the external repository identifier@en",
   :rdfs/domain    :spdx/ReferenceType,
   :rdfs/range     :xsd/anyURI,
   :vs/term_status #xsd/langString "stable@en"})

(def copyrightText
  "The text of copyright declarations recited in the package, file or snippet.\n\nIf the copyrightText field is not present, it implies an equivalent meaning to NOASSERTION."
  {:db/ident :spdx/copyrightText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The text of copyright declarations recited in the package, file or snippet.\n\nIf the copyrightText field is not present, it implies an equivalent meaning to NOASSERTION.@en",
   :rdfs/domain :spdx/SpdxItem,
   :rdfs/range [:xsd/string :rdfs/Literal],
   :vs/term_status #xsd/langString "stable@en"})

(def created
  "Identify when the SPDX document was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard."
  {:db/ident :spdx/created,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Identify when the SPDX document was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard.@en",
   :rdfs/domain :spdx/CreationInfo,
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :spdx/date,
   :vs/term_status #xsd/string "stable"})

(def creationInfo
  "The creationInfo property relates an SpdxDocument to a set of information about the creation of the SpdxDocument."
  {:db/ident :spdx/creationInfo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The creationInfo property relates an SpdxDocument to a set of information about the creation of the SpdxDocument.@en",
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/CreationInfo,
   :vs/term_status #xsd/string "stable"})

(def creator
  "Identify who (or what, in the case of a tool) created the SPDX document. If the SPDX document was created by an individual, indicate the person's name. If the SPDX document was created on behalf of a company or organization, indicate the entity name. If the SPDX document was created using a software tool, indicate the name and version for that tool. If multiple participants or tools were involved, use multiple instances of this field. Person name or organization name may be designated as “anonymous” if appropriate."
  {:db/ident :spdx/creator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Identify who (or what, in the case of a tool) created the SPDX document. If the SPDX document was created by an individual, indicate the person's name. If the SPDX document was created on behalf of a company or organization, indicate the entity name. If the SPDX document was created using a software tool, indicate the name and version for that tool. If multiple participants or tools were involved, use multiple instances of this field. Person name or organization name may be designated as “anonymous” if appropriate.@en",
   :rdfs/domain :spdx/CreationInfo,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/string "stable"})

(def crossRef
  "Cross Reference Detail for a license SeeAlso URL"
  {:db/ident     :spdx/crossRef,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "Cross Reference Detail for a license SeeAlso URL@en",
   :rdfs/range   :spdx/SimpleLicensingInfo})

(def dataLicense
  "Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields (\"SPDX-Metadata\"). The SPDX specification contains numerous fields where an SPDX document creator may provide relevant explanatory text in SPDX-Metadata. Without opining on the lawfulness of \"database rights\" (in jurisdictions where applicable), such explanatory text is copyrightable subject matter in most Berne Convention countries. By using the SPDX specification, or any portion hereof, you hereby agree that any copyright rights (as determined by your jurisdiction) in any SPDX-Metadata, including without limitation explanatory text, shall be subject to the terms of the Creative Commons CC0 1.0 Universal license. For SPDX-Metadata not containing any copyright rights, you hereby agree and acknowledge that the SPDX-Metadata is provided to you \"as-is\" and without any representations or warranties of any kind concerning the SPDX-Metadata, express, implied, statutory or otherwise, including without limitation warranties of title, merchantability, fitness for a particular purpose, non-infringement, or the absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not discoverable, all to the greatest extent permissible under applicable law."
  {:db/ident :spdx/dataLicense,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields (\"SPDX-Metadata\"). The SPDX specification contains numerous fields where an SPDX document creator may provide relevant explanatory text in SPDX-Metadata. Without opining on the lawfulness of \"database rights\" (in jurisdictions where applicable), such explanatory text is copyrightable subject matter in most Berne Convention countries. By using the SPDX specification, or any portion hereof, you hereby agree that any copyright rights (as determined by your jurisdiction) in any SPDX-Metadata, including without limitation explanatory text, shall be subject to the terms of the Creative Commons CC0 1.0 Universal license. For SPDX-Metadata not containing any copyright rights, you hereby agree and acknowledge that the SPDX-Metadata is provided to you \"as-is\" and without any representations or warranties of any kind concerning the SPDX-Metadata, express, implied, statutory or otherwise, including without limitation warranties of title, merchantability, fitness for a particular purpose, non-infringement, or the absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not discoverable, all to the greatest extent permissible under applicable law.@en",
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range {:owl/hasValue   {:rdfa/uri "http://spdx.org/licenses/CC0-1.0"},
                :owl/onProperty :spdx/dataLicense,
                :rdf/type       :owl/Restriction},
   :vs/term_status #xsd/string "stable"})

(def date
  "A date-time stamp."
  {:db/ident       :spdx/date,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString "A date-time stamp.@en",
   :rdfs/domain    {:owl/unionOf [:spdx/Annotation :spdx/CreationInfo],
                    :rdf/type    :owl/Class},
   :rdfs/range     :xsd/dateTime,
   :vs/term_status #xsd/langString "stable@en"})

(def deprecatedVersion
  "License list version where this license was decprecated"
  {:db/ident :spdx/deprecatedVersion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString
                  "License list version where this license was decprecated@en",
   :rdfs/domain {:owl/unionOf [:spdx/ListedLicense
                               :spdx/ListedLicenseException],
                 :rdf/type    :owl/Class},
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def describesPackage
  "The describesPackage property relates an SpdxDocument to the package which it describes."
  {:db/ident :spdx/describesPackage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The describesPackage property relates an SpdxDocument to the package which it describes.@en",
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/Package,
   :vs/term_status #xsd/langString "stable@en"})

(def description
  "Provides a detailed description of the package."
  {:db/ident       :spdx/description,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString
                    "Provides a detailed description of the package.@en",
   :rdfs/domain    :spdx/Package,
   :rdfs/range     :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def documentation
  "Website containing the documentation related to the repository identifier"
  {:db/ident :spdx/documentation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Website containing the documentation related to the repository identifier@en",
   :rdfs/domain :spdx/ReferenceType,
   :rdfs/range :xsd/anyURI,
   :vs/term_status #xsd/langString "stable@en"})

(def downloadLocation
  "The URI at which this package is available for download. Private (i.e., not publicly reachable) URIs are acceptable as values of this property. The values http://spdx.org/rdf/terms#none and http://spdx.org/rdf/terms#noassertion may be used to specify that the package is not downloadable or that no attempt was made to determine its download location, respectively."
  {:db/ident :spdx/downloadLocation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The URI at which this package is available for download. Private (i.e., not publicly reachable) URIs are acceptable as values of this property. The values http://spdx.org/rdf/terms#none and http://spdx.org/rdf/terms#noassertion may be used to specify that the package is not downloadable or that no attempt was made to determine its download location, respectively.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/anyURI,
   :vs/term_status #xsd/langString "stable@en"})

(def example
  "Text for examples in describing an SPDX element."
  {:db/ident       :spdx/example,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString
                    "Text for examples in describing an SPDX element.@en",
   :rdfs/domain    :spdx/LicenseException,
   :rdfs/range     :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def exceptionTextHtml
  "HTML representation of the License Exception Text"
  {:db/ident       :spdx/exceptionTextHtml,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString
                    "HTML representation of the License Exception Text@en",
   :rdfs/domain    :spdx/ListedLicenseException,
   :rdfs/range     :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def externalDocumentId
  "externalDocumentId is a string containing letters, numbers, ., - and/or + which uniquely identifies an external document within this document."
  {:db/ident :spdx/externalDocumentId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "externalDocumentId is a string containing letters, numbers, ., - and/or + which uniquely identifies an external document within this document.@en",
   :rdfs/domain :spdx/ExternalDocumentRef,
   :rdfs/range :xsd/anyURI,
   :vs/term_status #xsd/langString "stable@en"})

(def externalDocumentRef
  "Identify any external SPDX documents referenced within this SPDX document."
  {:db/ident :spdx/externalDocumentRef,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Identify any external SPDX documents referenced within this SPDX document.@en",
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/ExternalDocumentRef,
   :vs/term_status #xsd/langString "stable@en"})

(def externalRef
  "An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package."
  {:db/ident :spdx/externalRef,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :spdx/ExternalRef,
   :vs/term_status #xsd/langString "stable@en"})

(def externalReferenceSite
  "Website for the maintainers of the external reference site"
  {:db/ident :spdx/externalReferenceSite,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Website for the maintainers of the external reference site@en",
   :rdfs/domain :spdx/ReferenceType,
   :rdfs/range :xsd/anyURI,
   :vs/term_status #xsd/langString "stable@en"})

(def extractedText
  "Provide a copy of the actual text of the license reference extracted from the package, file or snippet that is associated with the License Identifier to aid in future analysis."
  {:db/ident :spdx/extractedText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Provide a copy of the actual text of the license reference extracted from the package, file or snippet that is associated with the License Identifier to aid in future analysis.@en",
   :rdfs/domain :spdx/ExtractedLicensingInfo,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def fileContributor
  "This field provides a place for the SPDX file creator to record file contributors. Contributors could include names of copyright holders and/or authors who may not be copyright holders yet contributed to the file content."
  {:db/ident :spdx/fileContributor,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "This field provides a place for the SPDX file creator to record file contributors. Contributors could include names of copyright holders and/or authors who may not be copyright holders yet contributed to the file content.@en",
   :rdfs/domain :spdx/File,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def fileDependency
  "This field is deprecated since SPDX 2.0 in favor of using Section 7 which provides more granularity about relationships."
  {:db/ident :spdx/fileDependency,
   :owl/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "This field is deprecated since SPDX 2.0 in favor of using Section 7 which provides more granularity about relationships.@en",
   :rdfs/domain :spdx/File,
   :rdfs/range :spdx/File,
   :vs/term_status #xsd/langString "deprecated@en"})

(def fileName
  "The name of the file relative to the root of the package."
  {:db/ident :spdx/fileName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The name of the file relative to the root of the package.@en",
   :rdfs/domain :spdx/File,
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :spdx/name,
   :vs/term_status #xsd/langString "stable@en"})

(def fileType
  "The type of the file."
  {:db/ident       :spdx/fileType,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #xsd/langString "The type of the file.@en",
   :rdfs/domain    :spdx/File,
   :vs/term_status #xsd/string "stable"})

(def fileType_application
  " The file is associated with a specific application type (MIME type of application/* )"
  {:db/ident :spdx/fileType_application,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    " The file is associated with a specific application type (MIME type of application/* )@en",
   :vs/term_status #xsd/langString "stable@en"})

(def fileType_archive
  "Indicates the file is an archive file."
  {:db/ident       :spdx/fileType_archive,
   :rdf/type       [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "Indicates the file is an archive file.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def fileType_audio
  "The file is associated with an audio file (MIME type of audio/* , ie. .mp3 ); \nIMAGE if the file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  )"
  {:db/ident :spdx/fileType_audio,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "The file is associated with an audio file (MIME type of audio/* , ie. .mp3 ); \nIMAGE if the file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  )@en",
   :vs/term_status #xsd/langString "stable@en"})

(def fileType_binary
  "Indicates the file is not a text file. spdx:filetype_archive is preferred for archive files even though they are binary."
  {:db/ident :spdx/fileType_binary,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Indicates the file is not a text file. spdx:filetype_archive is preferred for archive files even though they are binary.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def fileType_documentation
  "The file serves as documentation."
  {:db/ident       :spdx/fileType_documentation,
   :rdf/type       [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "The file serves as documentation.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def fileType_image
  "The file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  )."
  {:db/ident :spdx/fileType_image,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "The file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  ).@en",
   :vs/term_status #xsd/langString "stable@en"})

(def fileType_other
  "Indicates the file is not a source, archive or binary file."
  {:db/ident :spdx/fileType_other,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Indicates the file is not a source, archive or binary file.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def fileType_source
  "Indicates the file is a source code file."
  {:db/ident       :spdx/fileType_source,
   :rdf/type       [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "Indicates the file is a source code file.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def fileType_spdx
  "The file is an SPDX document."
  {:db/ident       :spdx/fileType_spdx,
   :rdf/type       [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "The file is an SPDX document.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def fileType_text
  "The file is human readable text file (MIME type of text/*)."
  {:db/ident :spdx/fileType_text,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "The file is human readable text file (MIME type of text/*).@en",
   :vs/term_status #xsd/langString "stable@en"})

(def fileType_video
  "The file is associated with a video file type (MIME type of video/*)."
  {:db/ident :spdx/fileType_video,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "The file is associated with a video file type (MIME type of video/*).@en",
   :vs/term_status #xsd/langString "stable@en"})

(def filesAnalyzed
  "Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document. If false indicates packages that represent metadata or URI references to a project, product, artifact, distribution or a component. If set to false, the package must not contain any files."
  {:db/ident :spdx/filesAnalyzed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document. If false indicates packages that represent metadata or URI references to a project, product, artifact, distribution or a component. If set to false, the package must not contain any files.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/boolean,
   :vs/term_status #xsd/langString "stable@en"})

(def hasExtractedLicensingInfo
  "Indicates that a particular ExtractedLicensingInfo was defined in the subject SpdxDocument."
  {:db/ident :spdx/hasExtractedLicensingInfo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Indicates that a particular ExtractedLicensingInfo was defined in the subject SpdxDocument.@en",
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/ExtractedLicensingInfo,
   :vs/term_status #xsd/langString "stable@en"})

(def hasFile
  "Indicates that a particular file belongs to a package."
  {:db/ident       :spdx/hasFile,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #xsd/langString
                    "Indicates that a particular file belongs to a package.@en",
   :rdfs/domain    :spdx/Package,
   :rdfs/range     :spdx/File,
   :vs/term_status #xsd/langString "stable@en"})

(def isDeprecatedLicenseId
  {:db/ident    :spdx/isDeprecatedLicenseId,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :spdx/ListedLicense,
   :rdfs/range  :xsd/boolean})

(def isFsfLibre
  {:db/ident    :spdx/isFsfLibre,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :spdx/License,
   :rdfs/range  :xsd/boolean})

(def isLive
  "Indicate a URL is still a live accessible location on the public internet"
  {:db/ident :spdx/isLive,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Indicate a URL is still a live accessible location on the public internet@en",
   :rdfs/domain :spdx/CrossRef,
   :rdfs/range :xsd/boolean})

(def isOsiApproved
  "Indicates if the OSI has approved the license."
  {:db/ident       :spdx/isOsiApproved,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString
                    "Indicates if the OSI has approved the license.@en",
   :rdfs/domain    :spdx/License,
   :rdfs/range     :xsd/boolean,
   :vs/term_status #xsd/langString "stable@en"})

(def isValid
  "True if the URL is a valid well formed URL"
  {:db/ident     :spdx/isValid,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString
                  "True if the URL is a valid well formed URL@en",
   :rdfs/domain  :spdx/CrossRef,
   :rdfs/range   :xsd/boolean})

(def isWayBackLink
  "True if the License SeeAlso URL points to a Wayback archive"
  {:db/ident :spdx/isWayBackLink,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "True if the License SeeAlso URL points to a Wayback archive@en",
   :rdfs/domain :spdx/CrossRef,
   :rdfs/range :xsd/boolean})

(def licenseComments
  "The licenseComments property allows the preparer of the SPDX document to describe why the licensing in spdx:licenseConcluded was chosen."
  {:db/ident :spdx/licenseComments,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The licenseComments property allows the preparer of the SPDX document to describe why the licensing in spdx:licenseConcluded was chosen.@en",
   :rdfs/domain :spdx/SpdxItem,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def licenseConcluded
  "The licensing that the preparer of this SPDX document has concluded, based on the evidence, actually applies to the SPDX Item.\n\nIf the licenseConcluded field is not present for an SPDX Item, it implies an equivalent meaning to NOASSERTION."
  {:db/ident :spdx/licenseConcluded,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "The licensing that the preparer of this SPDX document has concluded, based on the evidence, actually applies to the SPDX Item.\n\nIf the licenseConcluded field is not present for an SPDX Item, it implies an equivalent meaning to NOASSERTION.@en",
   :rdfs/domain :spdx/SpdxItem,
   :rdfs/range {:owl/unionOf [:spdx/AnyLicenseInfo
                              {:owl/hasValue   :spdx/noassertion,
                               :owl/onProperty :spdx/licenseConcluded,
                               :rdf/type       :owl/Restriction}
                              {:owl/hasValue   :spdx/none,
                               :owl/onProperty :spdx/licenseConcluded,
                               :rdf/type       :owl/Restriction}],
                :rdf/type    :owl/Class},
   :vs/term_status #xsd/langString "stable@en"})

(def licenseDeclared
  "The licensing that the creators of the software in the package, or the packager, have declared. Declarations by the original software creator should be preferred, if they exist."
  {:db/ident :spdx/licenseDeclared,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The licensing that the creators of the software in the package, or the packager, have declared. Declarations by the original software creator should be preferred, if they exist.@en",
   :rdfs/domain :spdx/SpdxItem,
   :rdfs/range :spdx/AnyLicenseInfo,
   :vs/term_status #xsd/langString "stable@en"})

(def licenseException
  "An exception to a license."
  {:db/ident       :spdx/licenseException,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #xsd/langString "An exception to a license.@en",
   :rdfs/domain    :spdx/WithExceptionOperator,
   :rdfs/range     :spdx/LicenseException,
   :vs/term_status #xsd/langString "stable@en"})

(def licenseExceptionId
  "Short form license exception identifier in Appendix I.2 of the SPDX specification."
  {:db/ident :spdx/licenseExceptionId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Short form license exception identifier in Appendix I.2 of the SPDX specification.@en",
   :rdfs/domain :spdx/LicenseException,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def licenseExceptionTemplate
  "Template for matching license exception text"
  {:db/ident       :spdx/licenseExceptionTemplate,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString
                    "Template for matching license exception text@en",
   :rdfs/domain    :spdx/LicenseException,
   :rdfs/range     :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def licenseExceptionText
  "Full text of the license exception."
  {:db/ident       :spdx/licenseExceptionText,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString "Full text of the license exception.@en",
   :rdfs/domain    :spdx/LicenseException,
   :rdfs/range     :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def licenseId
  "A human readable short form license identifier for a license. The license ID is either on the standard license list or the form \"LicenseRef-[idString]\" where [idString] is a unique string containing letters, numbers, \".\" or \"-\".  When used within a license expression, the license ID can optionally include a reference to an external document in the form \"DocumentRef-[docrefIdString]:LicenseRef-[idString]\" where docRefIdString is an ID for an external document reference."
  {:db/ident :spdx/licenseId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "A human readable short form license identifier for a license. The license ID is either on the standard license list or the form \"LicenseRef-[idString]\" where [idString] is a unique string containing letters, numbers, \".\" or \"-\".  When used within a license expression, the license ID can optionally include a reference to an external document in the form \"DocumentRef-[docrefIdString]:LicenseRef-[idString]\" where docRefIdString is an ID for an external document reference.@en",
   :rdfs/domain :spdx/SimpleLicensingInfo,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def licenseInfoFromFiles
  "The licensing information that was discovered directly within the package. There will be an instance of this property for each distinct value of alllicenseInfoInFile properties of all files contained in the package.\n\nIf the licenseInfoFromFiles field is not present for a package and filesAnalyzed property for that same pacakge is true or omitted, it implies an equivalent meaning to NOASSERTION."
  {:db/ident :spdx/licenseInfoFromFiles,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The licensing information that was discovered directly within the package. There will be an instance of this property for each distinct value of alllicenseInfoInFile properties of all files contained in the package.\n\nIf the licenseInfoFromFiles field is not present for a package and filesAnalyzed property for that same pacakge is true or omitted, it implies an equivalent meaning to NOASSERTION.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range {:owl/unionOf [:spdx/AnyLicenseInfo
                              {:owl/hasValue   :spdx/noassertion,
                               :owl/onProperty :spdx/licenseInfoFromFiles,
                               :rdf/type       :owl/Restriction}
                              {:owl/hasValue   :spdx/none,
                               :owl/onProperty :spdx/licenseInfoFromFiles,
                               :rdf/type       :owl/Restriction}],
                :rdf/type    :owl/Class},
   :vs/term_status #xsd/langString "stable@en"})

(def licenseInfoInFile
  "Licensing information that was discovered directly in the subject file. This is also considered a declared license for the file.\n\nIf the licenseInfoInFile field is not present for a file, it implies an equivalent meaning to NOASSERTION."
  {:db/ident :spdx/licenseInfoInFile,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Licensing information that was discovered directly in the subject file. This is also considered a declared license for the file.\n\nIf the licenseInfoInFile field is not present for a file, it implies an equivalent meaning to NOASSERTION.@en",
   :rdfs/domain :spdx/File,
   :rdfs/range {:owl/unionOf [:spdx/AnyLicenseInfo
                              {:owl/hasValue   :spdx/noassertion,
                               :owl/onProperty :spdx/licenseInfoInFile,
                               :rdf/type       :owl/Restriction}
                              {:owl/hasValue   :spdx/none,
                               :owl/onProperty :spdx/licenseInfoInFile,
                               :rdf/type       :owl/Restriction}],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :spdx/licenseInfoFromFiles,
   :vs/term_status #xsd/string "stable"})

(def licenseInfoInSnippet
  "Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet.\n\nIf the licenseInfoInSnippet field is not present for a snippet, it implies an equivalent meaning to NOASSERTION."
  {:db/ident :spdx/licenseInfoInSnippet,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet.\n\nIf the licenseInfoInSnippet field is not present for a snippet, it implies an equivalent meaning to NOASSERTION.@en",
   :rdfs/domain :spdx/Snippet,
   :rdfs/range {:owl/unionOf [:spdx/AnyLicenseInfo
                              {:owl/hasValue   :spdx/noassertion,
                               :owl/onProperty :spdx/licenseInfoInFile,
                               :rdf/type       :owl/Restriction}
                              {:owl/hasValue   :spdx/none,
                               :owl/onProperty :spdx/licenseInfoInFile,
                               :rdf/type       :owl/Restriction}],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :spdx/licenseInfoFromFiles,
   :vs/term_status #xsd/langString "stable@en"})

(def licenseListVersion
  "An optional field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created."
  {:db/ident :spdx/licenseListVersion,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #xsd/langString
    "An optional field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created.@en",
   :rdfs/domain :spdx/CreationInfo,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def licenseText
  "Full text of the license."
  {:db/ident       :spdx/licenseText,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString "Full text of the license.@en",
   :rdfs/domain    :spdx/License,
   :rdfs/range     :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def licenseTextHtml
  "License text in HTML format"
  {:db/ident       :spdx/licenseTextHtml,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString "License text in HTML format@en",
   :rdfs/domain    :spdx/ListedLicense,
   :rdfs/range     :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def match
  "Status of a License List SeeAlso URL reference if it refers to a website that matches the license text."
  {:db/ident :spdx/match,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Status of a License List SeeAlso URL reference if it refers to a website that matches the license text.",
   :rdfs/domain :spdx/CrossRef,
   :rdfs/range :xsd/string})

(def member
  "A license, or other licensing information, that is a member of the subject license set."
  {:db/ident :spdx/member,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A license, or other licensing information, that is a member of the subject license set.@en",
   :rdfs/domain {:owl/unionOf [:spdx/ConjunctiveLicenseSet
                               :spdx/DisjunctiveLicenseSet
                               :spdx/WithExceptionOperator],
                 :rdf/type    :owl/Class},
   :rdfs/range :spdx/AnyLicenseInfo,
   :vs/term_status #xsd/langString "stable@en"})

(def name
  "Identify name of this SpdxElement."
  {:db/ident       :spdx/name,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString "Identify name of this SpdxElement.@en",
   :rdfs/domain    :spdx/SpdxElement,
   :rdfs/range     :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def noassertion
  "Individual to indicate the creator of the SPDX document does not assert any value for the object."
  {:db/ident :spdx/noassertion,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   #xsd/string
    "Individual to indicate the creator of the SPDX document does not assert any value for the object."})

(def none
  "Individual to indicate that no value is applicable for the Object."
  {:db/ident :spdx/none,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   #xsd/string
    "Individual to indicate that no value is applicable for the Object."})

(def noticeText
  "This field provides a place for the SPDX file creator to record potential legal notices found in the file. This may or may not include copyright statements."
  {:db/ident :spdx/noticeText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "This field provides a place for the SPDX file creator to record potential legal notices found in the file. This may or may not include copyright statements.@en",
   :rdfs/domain :spdx/File,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def order
  "The ordinal order of this element within a list"
  {:db/ident     :spdx/order,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString
                  "The ordinal order of this element within a list@en",
   :rdfs/domain  :spdx/CrossRef,
   :rdfs/range   :xsd/nonNegativeInteger})

(def originator
  "The name and, optionally, contact information of the person or organization that originally created the package. Values of this property must conform to the agent and tool syntax."
  {:db/ident :spdx/originator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The name and, optionally, contact information of the person or organization that originally created the package. Values of this property must conform to the agent and tool syntax.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string})

(def packageFileName
  "The base name of the package file name. For example, zlib-1.2.5.tar.gz."
  {:db/ident :spdx/packageFileName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The base name of the package file name. For example, zlib-1.2.5.tar.gz.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def packageName
  "Identify the full name of the package as given by Package Originator."
  {:db/ident :spdx/packageName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Identify the full name of the package as given by Package Originator.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :spdx/name,
   :vs/term_status #xsd/langString "stable@en"})

(def packageVerificationCode
  "A manifest based verification code (the algorithm is defined in section 3.9.4 of the full specification) of the package. This allows consumers of this data and/or database to determine if a package they have in hand is identical to the package from which the data was produced. This algorithm works even if the SPDX document is included in the package."
  {:db/ident :spdx/packageVerificationCode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A manifest based verification code (the algorithm is defined in section 3.9.4 of the full specification) of the package. This allows consumers of this data and/or database to determine if a package they have in hand is identical to the package from which the data was produced. This algorithm works even if the SPDX document is included in the package.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :spdx/PackageVerificationCode,
   :vs/term_status #xsd/langString "stable@en"})

(def packageVerificationCodeExcludedFile
  "A file that was excluded when calculating the package verification code. This is usually a file containing SPDX data regarding the package. If a package contains more than one SPDX file all SPDX files must be excluded from the package verification code. If this is not done it would be impossible to correctly calculate the verification codes in both files."
  {:db/ident :spdx/packageVerificationCodeExcludedFile,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "A file that was excluded when calculating the package verification code. This is usually a file containing SPDX data regarding the package. If a package contains more than one SPDX file all SPDX files must be excluded from the package verification code. If this is not done it would be impossible to correctly calculate the verification codes in both files.@en",
   :rdfs/domain :spdx/PackageVerificationCode,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def packageVerificationCodeValue
  "The actual package verification code as a hex encoded value."
  {:db/ident :spdx/packageVerificationCodeValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The actual package verification code as a hex encoded value.@en",
   :rdfs/domain :spdx/PackageVerificationCode,
   :rdfs/range :xsd/hexBinary,
   :vs/term_status #xsd/langString "stable@en"})

(def primaryPackagePurpose
  "This field provides information about the primary purpose of the identified package. Package Purpose is intrinsic to how the package is being used rather than the content of the package."
  {:db/ident :spdx/primaryPackagePurpose,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "This field provides information about the primary purpose of the identified package. Package Purpose is intrinsic to how the package is being used rather than the content of the package.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :spdx/Purpose,
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_application
  "The package is a software application."
  {:db/ident       :spdx/purpose_application,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "The package is a software application.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_archive
  "The package refers to an archived collection of files (.tar, .zip, etc)."
  {:db/ident :spdx/purpose_archive,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "The package refers to an archived collection of files (.tar, .zip, etc).@en",
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_container
  "The package refers to a container image which can be used by a container runtime application."
  {:db/ident :spdx/purpose_container,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "The package refers to a container image which can be used by a container runtime application.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_device
  "The package refers to a chipset, processor, or electronic board."
  {:db/ident :spdx/purpose_device,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "The package refers to a chipset, processor, or electronic board.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_file
  "The package is a single file which can be independently distributed (configuration file, statically linked binary, Kubernetes deployment, etc)."
  {:db/ident :spdx/purpose_file,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "The package is a single file which can be independently distributed (configuration file, statically linked binary, Kubernetes deployment, etc).@en",
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_firmware
  "The package provides low level control over a device's hardware."
  {:db/ident :spdx/purpose_firmware,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "The package provides low level control over a device's hardware.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_framework
  "The package is a software framework."
  {:db/ident       :spdx/purpose_framework,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "The package is a software framework.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_install
  "The package is used to install software on disk."
  {:db/ident       :spdx/purpose_install,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "The package is used to install software on disk.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_library
  "The package is a software library."
  {:db/ident       :spdx/purpose_library,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString "The package is a software library.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_operatingSystem
  "The package refers to an operating system."
  {:db/ident       :spdx/purpose_operatingSystem,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "The package refers to an operating system.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_other
  "The package doesn't fit into other purpose defined terms."
  {:db/ident :spdx/purpose_other,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "The package doesn't fit into other purpose defined terms.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def purpose_source
  "The package is a collection of source files."
  {:db/ident       :spdx/purpose_source,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "The package is a collection of source files.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def range
  "This field defines the byte range in the original host file (in X.2) that the snippet information applies to"
  {:db/ident :spdx/range,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "This field defines the byte range in the original host file (in X.2) that the snippet information applies to@en",
   :rdfs/domain :spdx/Snippet,
   :rdfs/range :pointers/StartEndPointer,
   :vs/term_status #xsd/langString "stable@en"})

(def referenceCategory
  "Category for the external reference"
  {:db/ident       :spdx/referenceCategory,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #xsd/langString "Category for the external reference@en",
   :rdfs/domain    :spdx/ExternalRef,
   :rdfs/range     :spdx/ReferenceCategory,
   :vs/term_status #xsd/langString "stable@en"})

(def referenceCategory_other
  {:db/ident       :spdx/referenceCategory_other,
   :rdf/type       [:spdx/ReferenceCategory :owl/NamedIndividual],
   :vs/term_status #xsd/langString "stable@en"})

(def referenceCategory_packageManager
  {:db/ident       :spdx/referenceCategory_packageManager,
   :rdf/type       [:spdx/ReferenceCategory :owl/NamedIndividual],
   :vs/term_status #xsd/langString "stable@en"})

(def referenceCategory_persistentId
  "These point to objects present in the Software Heritage archive by the means of persistent identifiers that are guaranteed to remain stable (persistent) over time."
  {:db/ident :spdx/referenceCategory_persistentId,
   :rdf/type [:spdx/ReferenceCategory :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "These point to objects present in the Software Heritage archive by the means of persistent identifiers that are guaranteed to remain stable (persistent) over time.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def referenceCategory_security
  {:db/ident       :spdx/referenceCategory_security,
   :rdf/type       [:spdx/ReferenceCategory :owl/NamedIndividual],
   :vs/term_status #xsd/langString "stable@en"})

(def referenceLocator
  "The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location. The format of the locator is subject to constraints defined by the <type>."
  {:db/ident :spdx/referenceLocator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location. The format of the locator is subject to constraints defined by the <type>.@en",
   :rdfs/domain :spdx/ExternalRef,
   :rdfs/range :xsd/anyURI,
   :vs/term_status #xsd/langString "stable@en"})

(def referenceType
  "Type of the external reference. These are definined in an appendix in the SPDX specification."
  {:db/ident :spdx/referenceType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Type of the external reference. These are definined in an appendix in the SPDX specification.@en",
   :rdfs/domain :spdx/ExternalRef,
   :rdfs/range :spdx/ReferenceType,
   :vs/term_status #xsd/langString "stable@en"})

(def referencesFile
  {:db/ident :spdx/referencesFile,
   :owl/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "This property has been replaced by a relationship between the SPDX document and file with a \"contains\" relationship type.@en"
    #xsd/langString
     "Indicates that a particular file belongs as part of the set of analyzed files in the SpdxDocument.@en"],
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/File,
   :vs/term_status #xsd/langString "deprecated@en"})

(def relatedSpdxElement
  "A related SpdxElement."
  {:db/ident       :spdx/relatedSpdxElement,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #xsd/langString "A related SpdxElement.@en",
   :rdfs/domain    :spdx/Relationship,
   :rdfs/range     :spdx/SpdxElement,
   :vs/term_status #xsd/langString "stable@en"})

(def relationship
  "Defines a relationship between two SPDX elements. The SPDX element may be a Package, File, or SpdxDocument."
  {:db/ident :spdx/relationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Defines a relationship between two SPDX elements. The SPDX element may be a Package, File, or SpdxDocument.@en",
   :rdfs/domain :spdx/SpdxElement,
   :rdfs/range :spdx/Relationship,
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType
  "Describes the type of relationship between two SPDX elements."
  {:db/ident :spdx/relationshipType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Describes the type of relationship between two SPDX elements.@en",
   :rdfs/domain :spdx/Relationship,
   :rdfs/range {:owl/unionOf
                [{:owl/hasValue   :spdx/relationshipType_amendment,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_ancestorOf,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_buildToolOf,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_containedBy,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_contains,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_copyOf,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_dataFile,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_dataFileOf,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_descendantOf,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_describedBy,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_describes,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_distributionArtifact,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_documentation,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_dynamicLink,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_expandedFromArchive,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_fileAdded,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_fileDeleted,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_fileModified,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_generatedFrom,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_generates,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_hasPrerequisite,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_metafileOf,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_optionalComponentOf,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_other,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_packageOf,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_patchApplied,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_patchFor,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_prerequisiteFor,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_staticLink,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_testcaseOf,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}
                 {:owl/hasValue   :spdx/relationshipType_variantOf,
                  :owl/onProperty :spdx/relationshipType,
                  :rdf/type       :owl/Restriction}],
                :rdf/type :owl/Class},
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_amendment
  "To be used when SPDXRef-A amends the SPDX information in SPDXRef-B."
  {:db/ident :spdx/relationshipType_amendment,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "To be used when SPDXRef-A amends the SPDX information in SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_ancestorOf
  "A Relationship of relationshipType_ancestorOf expresses that an SPDXElement is an ancestor of (same lineage but pre-dates) the relatedSPDXElement.  For example, an upstream File is an ancestor of a modified downstream File"
  {:db/ident :spdx/relationshipType_ancestorOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_ancestorOf expresses that an SPDXElement is an ancestor of (same lineage but pre-dates) the relatedSPDXElement.  For example, an upstream File is an ancestor of a modified downstream File@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_buildDependencyOf
  "Is to be used when SPDXRef-A is a build dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_buildDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is a build dependency of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_buildToolOf
  "To be used when SPDXRef-A is used to to build SPDXRef-B."
  {:db/ident :spdx/relationshipType_buildToolOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment #xsd/langString
                  "To be used when SPDXRef-A is used to to build SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_containedBy
  "A Relationship of relationshipType_containedBy expresses that an SPDXElement is contained by the relatedSPDXElement.  For example, a File contained by a Package. "
  {:db/ident :spdx/relationshipType_containedBy,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_containedBy expresses that an SPDXElement is contained by the relatedSPDXElement.  For example, a File contained by a Package. @en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_contains
  "A Relationship of relationshipType_contains expresses that an SPDXElement contains the relatedSPDXElement.  For example, a Package contains a File. (relationshipType_contains introduced in SPDX 2.0 deprecates property 'hasFile' from SPDX 1.2)"
  {:db/ident :spdx/relationshipType_contains,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_contains expresses that an SPDXElement contains the relatedSPDXElement.  For example, a Package contains a File. (relationshipType_contains introduced in SPDX 2.0 deprecates property 'hasFile' from SPDX 1.2)@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_copyOf
  "A Relationship of relationshipType_copyOf expresses that the SPDXElement is an exact copy of the relatedSDPXElement.  For example, a downstream distribution of a binary library which was copied from the upstream package."
  {:db/ident :spdx/relationshipType_copyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_copyOf expresses that the SPDXElement is an exact copy of the relatedSDPXElement.  For example, a downstream distribution of a binary library which was copied from the upstream package.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_dataFile
  "Is to be used when SPDXRef-A is a data file used in SPDXRef-B.  Replaced by relationshipType_dataFileOf"
  {:db/ident :spdx/relationshipType_dataFile,
   :owl/deprecated true,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is a data file used in SPDXRef-B.  Replaced by relationshipType_dataFileOf@en",
   :vs/term_status #xsd/langString "deprecated@en"})

(def relationshipType_dataFileOf
  "Is to be used when SPDXRef-A is a data file used in SPDXRef-B."
  {:db/ident :spdx/relationshipType_dataFileOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is a data file used in SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_dependencyManifestOf
  "Is to be used when SPDXRef-A is a manifest file that lists a set of dependencies for SPDXRef-B."
  {:db/ident :spdx/relationshipType_dependencyManifestOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is a manifest file that lists a set of dependencies for SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_dependencyOf
  "Is to be used when SPDXRef-A is dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_dependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment #xsd/langString
                  "Is to be used when SPDXRef-A is dependency of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_dependsOn
  "Is to be used when SPDXRef-A depends on SPDXRef-B."
  {:db/ident       :spdx/relationshipType_dependsOn,
   :rdf/type       [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "Is to be used when SPDXRef-A depends on SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_descendantOf
  "A Relationship of relationshipType_descendantOf expresses that an SPDXElement is a descendant of (same lineage but post-dates) the relatedSPDXElement.  For example, an downstream File that was modified is a descendant of an upstream File"
  {:db/ident :spdx/relationshipType_descendantOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_descendantOf expresses that an SPDXElement is a descendant of (same lineage but post-dates) the relatedSPDXElement.  For example, an downstream File that was modified is a descendant of an upstream File@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_describedBy
  "Is to be used an SPDXRef-A is described by SPDXRef-Document."
  {:db/ident :spdx/relationshipType_describedBy,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used an SPDXRef-A is described by SPDXRef-Document.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_describes
  "Is to be used when SPDXRef-DOCUMENT describes SPDXRef-A."
  {:db/ident :spdx/relationshipType_describes,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment #xsd/langString
                  "Is to be used when SPDXRef-DOCUMENT describes SPDXRef-A.@en",
   :vs/term_status #xsd/string "stable"})

(def relationshipType_devDependencyOf
  "Is to be used when SPDXRef-A is a development dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_devDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is a development dependency of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_devToolOf
  "Is to be used when SPDXRef-A is a development dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_devToolOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is a development dependency of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_distributionArtifact
  "A Relationship of relationshipType_distributionArtifact expresses that distributing the SPDXElement requires that the relatedSPDXElement also be distributed.  For example, distributing a binary File may require that a source tarball (another File) be made available with the distribuiton. "
  {:db/ident :spdx/relationshipType_distributionArtifact,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_distributionArtifact expresses that distributing the SPDXElement requires that the relatedSPDXElement also be distributed.  For example, distributing a binary File may require that a source tarball (another File) be made available with the distribuiton. @en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_documentation
  "To be used when SPDXRef-A provides documentation of SPDXRef-B."
  {:db/ident :spdx/relationshipType_documentation,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "To be used when SPDXRef-A provides documentation of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_dynamicLink
  "Is to be used when SPDXRef-A dynamically links to SPDXRef-B."
  {:db/ident :spdx/relationshipType_dynamicLink,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A dynamically links to SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_exampleOf
  "Is to be used when SPDXRef-A is an example of SPDXRef-B."
  {:db/ident :spdx/relationshipType_exampleOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment #xsd/langString
                  "Is to be used when SPDXRef-A is an example of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_expandedFromArchive
  "A Relationship of relationshipType_expandedFromArchive expresses that the SPDXElement is a file which was epanded from a relatedSPDXElement file.  For example, if there is an archive file xyz.tar.gz containing a file foo.c the archive file was expanded in a directory arch/xyz, the file arch/xyz/foo.c would have a relationshipType_expandedFromArchive with the file xyz.tar.gz."
  {:db/ident :spdx/relationshipType_expandedFromArchive,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_expandedFromArchive expresses that the SPDXElement is a file which was epanded from a relatedSPDXElement file.  For example, if there is an archive file xyz.tar.gz containing a file foo.c the archive file was expanded in a directory arch/xyz, the file arch/xyz/foo.c would have a relationshipType_expandedFromArchive with the file xyz.tar.gz.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_fileAdded
  "A Relationship of relationshipType_fileAdded expresses that the SPDXElement is a file which has been added to the relatedSPDXElement package.  For example, a package (the relatedSPDXElement) has been patched to remove a file (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present."
  {:db/ident :spdx/relationshipType_fileAdded,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_fileAdded expresses that the SPDXElement is a file which has been added to the relatedSPDXElement package.  For example, a package (the relatedSPDXElement) has been patched to remove a file (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_fileDeleted
  "A Relationship of relationshipType_fileDeleted expresses that the SPDXElement is a package where the relatedSPDXElement file has been removed.  For example, a package has been patched to remove a file a file (the relatedSPDXElement resulting in the patched package (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present."
  {:db/ident :spdx/relationshipType_fileDeleted,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_fileDeleted expresses that the SPDXElement is a package where the relatedSPDXElement file has been removed.  For example, a package has been patched to remove a file a file (the relatedSPDXElement resulting in the patched package (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_fileModified
  "A Relationship of relationshipType_fileModified expresses that the SPDXElement is a file which is a modified version of the relatedSPDXElement file.  For example, a file (the SPDXElement) has been patched to modify the contents of the original file (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present."
  {:db/ident :spdx/relationshipType_fileModified,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_fileModified expresses that the SPDXElement is a file which is a modified version of the relatedSPDXElement file.  For example, a file (the SPDXElement) has been patched to modify the contents of the original file (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_generatedFrom
  "A Relationship of relationshipType_generatedFrom expresses that an SPDXElement was generated from the relatedSPDXElement.  For example, a binary File might have been generated from a source File."
  {:db/ident :spdx/relationshipType_generatedFrom,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_generatedFrom expresses that an SPDXElement was generated from the relatedSPDXElement.  For example, a binary File might have been generated from a source File.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_generates
  "A Relationship of relationshipType_generates expresses that an SPDXElement generates the relatedSPDXElement.  For example, a source File generates a binary File."
  {:db/ident :spdx/relationshipType_generates,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_generates expresses that an SPDXElement generates the relatedSPDXElement.  For example, a source File generates a binary File.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_hasPrerequisite
  "Is to be used when SPDXRef-A has as a prerequisite SPDXRef-B."
  {:db/ident :spdx/relationshipType_hasPrerequisite,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A has as a prerequisite SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_metafileOf
  "To be used when SPDXRef-A is a metafile of SPDXRef-B."
  {:db/ident       :spdx/relationshipType_metafileOf,
   :rdf/type       [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment   #xsd/langString
                    "To be used when SPDXRef-A is a metafile of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_optionalComponentOf
  "To be used when SPDXRef-A is an optional component of SPDXRef-B."
  {:db/ident :spdx/relationshipType_optionalComponentOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "To be used when SPDXRef-A is an optional component of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_optionalDependencyOf
  "Is to be used when SPDXRef-A is an optional dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_optionalDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is an optional dependency of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_other
  "to be used for a relationship which has not been defined in the formal SPDX specification. A description of the relationship should be included in the Relationship comments field."
  {:db/ident :spdx/relationshipType_other,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "to be used for a relationship which has not been defined in the formal SPDX specification. A description of the relationship should be included in the Relationship comments field.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_packageOf
  "To be used when SPDXRef-A is used as a package as part of SPDXRef-B."
  {:db/ident :spdx/relationshipType_packageOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "To be used when SPDXRef-A is used as a package as part of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_patchApplied
  "A Relationship of relationshipType_patchApplied expresses that the SPDXElement is a 'patchfile' that was applied and produced the relatedSPDXElement. For example, a .diff File relates to a specific file where the diff was applied."
  {:db/ident :spdx/relationshipType_patchApplied,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_patchApplied expresses that the SPDXElement is a 'patchfile' that was applied and produced the relatedSPDXElement. For example, a .diff File relates to a specific file where the diff was applied.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_patchFor
  "A Relationship of relationshipType_patchFor expresses that the SPDXElement is a 'patchfile' that is designed to patch (apply modifications to) the relatedSPDXElement.  For example, relationship from a .diff File to a Package it is designed to patch. "
  {:db/ident :spdx/relationshipType_patchFor,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_patchFor expresses that the SPDXElement is a 'patchfile' that is designed to patch (apply modifications to) the relatedSPDXElement.  For example, relationship from a .diff File to a Package it is designed to patch. @en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_prerequisiteFor
  "Is to be used when SPDXRef-A is a prerequisite for SPDXRef-B"
  {:db/ident :spdx/relationshipType_prerequisiteFor,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is a prerequisite for SPDXRef-B@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_providedDependencyOf
  "Is to be used when SPDXRef-A is a to be provided dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_providedDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is a to be provided dependency of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_requirementDescriptionFor
  "Is to be used when SPDXRef-A describes, illustrates, or specifies a requirement statement for SPDXRef-B."
  {:db/ident :spdx/relationshipType_requirementDescriptionFor,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A describes, illustrates, or specifies a requirement statement for SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_runtimeDependencyOf
  "Is to be used when SPDXRef-A is a dependency required for the execution of SPDXRef-B."
  {:db/ident :spdx/relationshipType_runtimeDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is a dependency required for the execution of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_specificationFor
  "Is to be used when SPDXRef-A describes, illustrates, or defines a design specification for SPDXRef-B."
  {:db/ident :spdx/relationshipType_specificationFor,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A describes, illustrates, or defines a design specification for SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_staticLink
  "Is to be used when SPDXRef-A statically links to SPDXRef-B."
  {:db/ident :spdx/relationshipType_staticLink,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A statically links to SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_testDependencyOf
  "Is to be used when SPDXRef-A is a test dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_testDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is a test dependency of SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_testOf
  "Is to be used when SPDXRef-A is used for testing SPDXRef-B."
  {:db/ident :spdx/relationshipType_testOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is used for testing SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_testToolOf
  "Is to be used when SPDXRef-A is used as a test tool for SPDXRef-B."
  {:db/ident :spdx/relationshipType_testToolOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is used as a test tool for SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_testcaseOf
  "Is to be used when SPDXRef-A is a test case used in testing SPDXRef-B."
  {:db/ident :spdx/relationshipType_testcaseOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "Is to be used when SPDXRef-A is a test case used in testing SPDXRef-B.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def relationshipType_variantOf
  "A Relationship of relationshipType_variantOf expresses that an SPDXElement is a variant of the relatedSPDXElement, but it is not clear which came first.  For example, if the content of two Files differs by some edit, but there is no way to tell which came first (no reliable date information), then one File is a variant of the other File."
  {:db/ident :spdx/relationshipType_variantOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   #xsd/langString
    "A Relationship of relationshipType_variantOf expresses that an SPDXElement is a variant of the relatedSPDXElement, but it is not clear which came first.  For example, if the content of two Files differs by some edit, but there is no way to tell which came first (no reliable date information), then one File is a variant of the other File.@en",
   :vs/term_status #xsd/langString "stable@en"})

(def releaseDate
  "This field provides a place for recording the date the package was released."
  {:db/ident :spdx/releaseDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "This field provides a place for recording the date the package was released.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :spdx/date,
   :vs/term_status #xsd/langString "stable@en"})

(def reviewDate
  {:db/ident :spdx/reviewDate,
   :owl/deprecated true,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/langString
     "The date and time at which the SpdxDocument was reviewed. This value must be in UTC and have 'Z' as its timezone indicator.@en"
    #xsd/langString
     "Deprecated in favor of Annotation with an annotationType_review.@en"],
   :rdfs/domain :spdx/Review,
   :rdfs/range :xsd/dateTime,
   :vs/term_status #xsd/langString "deprecated@en"})

(def reviewed
  {:db/ident :spdx/reviewed,
   :owl/deprecated true,
   :rdf/type [:owl/NamedIndividual :owl/ObjectProperty],
   :rdfs/comment
   [#xsd/string "Reviewed"
    #xsd/langString
     "This property has been deprecated since SPDX version 2.0.  It has been replaced by an Annotation with an annotation type review.@en"],
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/Review,
   :vs/term_status #xsd/langString "deprecated@en"})

(def reviewer
  "The name and, optionally, contact information of the person who performed the review. Values of this property must conform to the agent and tool syntax.  The reviewer property is deprecated in favor of Annotation with an annotationType review."
  {:db/ident :spdx/reviewer,
   :owl/deprecated true,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The name and, optionally, contact information of the person who performed the review. Values of this property must conform to the agent and tool syntax.  The reviewer property is deprecated in favor of Annotation with an annotationType review.@en",
   :rdfs/domain :spdx/Review,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "deprecated@en"})

(def snippetFromFile
  "File containing the SPDX element (e.g. the file contaning a snippet)."
  {:db/ident :spdx/snippetFromFile,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "File containing the SPDX element (e.g. the file contaning a snippet).@en",
   :rdfs/domain :spdx/Snippet,
   :rdfs/range :spdx/File,
   :vs/term_status #xsd/langString "stable@en"})

(def snippetName
  "Identify a specific snippet in a human convenient manner."
  {:db/ident :spdx/snippetName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Identify a specific snippet in a human convenient manner.@en",
   :rdfs/domain :spdx/Snippet,
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :spdx/name,
   :vs/term_status #xsd/langString "stable@en"})

(def sourceInfo
  "Allows the producer(s) of the SPDX document to describe how the package was acquired and/or changed from the original source."
  {:db/ident :spdx/sourceInfo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Allows the producer(s) of the SPDX document to describe how the package was acquired and/or changed from the original source.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def spdxDocument
  "A property containing an SPDX document."
  {:db/ident       :spdx/spdxDocument,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #xsd/langString "A property containing an SPDX document.@en",
   :rdfs/domain    :spdx/ExternalDocumentRef,
   :rdfs/range     :spdx/SpdxDocument,
   :vs/term_status #xsd/langString "stable@en"})

(def specVersion
  "Provide a reference number that can be used to understand how to parse and interpret the rest of the file. It will enable both future changes to the specification and to support backward compatibility. The version number consists of a major and minor version indicator. The major field will be incremented when incompatible changes between versions are made (one or more sections are created, modified or deleted). The minor field will be incremented when backwards compatible changes are made."
  {:db/ident :spdx/specVersion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Provide a reference number that can be used to understand how to parse and interpret the rest of the file. It will enable both future changes to the specification and to support backward compatibility. The version number consists of a major and minor version indicator. The major field will be incremented when incompatible changes between versions are made (one or more sections are created, modified or deleted). The minor field will be incremented when backwards compatible changes are made.@en",
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :xsd/string})

(def standardLicenseHeader
  "License author's preferred text to indicated that a file is covered by the license."
  {:db/ident :spdx/standardLicenseHeader,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "License author's preferred text to indicated that a file is covered by the license.@en",
   :rdfs/domain :spdx/License,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def standardLicenseHeaderHtml
  "HTML representation of the standard license header"
  {:db/ident       :spdx/standardLicenseHeaderHtml,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString
                    "HTML representation of the standard license header@en",
   :rdfs/domain    :spdx/ListedLicense,
   :rdfs/range     :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def standardLicenseHeaderTemplate
  "License template which describes sections of the license header which can be varied. See License Template section of the specification for format information."
  {:db/ident :spdx/standardLicenseHeaderTemplate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "License template which describes sections of the license header which can be varied. See License Template section of the specification for format information.@en",
   :rdfs/domain :spdx/License,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def standardLicenseTemplate
  "License template which describes sections of the license which can be varied. See License Template section of the specification for format information."
  {:db/ident :spdx/standardLicenseTemplate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "License template which describes sections of the license which can be varied. See License Template section of the specification for format information.@en",
   :rdfs/domain :spdx/License,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def summary
  "Provides a short description of the package."
  {:db/ident       :spdx/summary,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #xsd/langString
                    "Provides a short description of the package.@en",
   :rdfs/domain    :spdx/Package,
   :rdfs/range     :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def supplier
  "The name and, optionally, contact information of the person or organization who was the immediate supplier of this package to the recipient. The supplier may be different than originator when the software has been repackaged. Values of this property must conform to the agent and tool syntax."
  {:db/ident :spdx/supplier,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The name and, optionally, contact information of the person or organization who was the immediate supplier of this package to the recipient. The supplier may be different than originator when the software has been repackaged. Values of this property must conform to the agent and tool syntax.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})

(def timestamp
  "Timestamp"
  {:db/ident     :spdx/timestamp,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString "Timestamp@en",
   :rdfs/domain  :spdx/CrossRef,
   :rdfs/range   :xsd/dateTime})

(def url
  "URL Reference"
  {:db/ident     :spdx/url,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString "URL Reference@en",
   :rdfs/domain  :spdx/CrossRef,
   :rdfs/range   :xsd/anyURI})

(def validUntilDate
  "This field provides a place for recording the end of the support period for a package from the supplier."
  {:db/ident :spdx/validUntilDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "This field provides a place for recording the end of the support period for a package from the supplier.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :spdx/date,
   :vs/term_status #xsd/langString "stable@en"})

(def versionInfo
  "Provides an indication of the version of the package that is described by this SpdxDocument."
  {:db/ident :spdx/versionInfo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Provides an indication of the version of the package that is described by this SpdxDocument.@en",
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string,
   :vs/term_status #xsd/langString "stable@en"})