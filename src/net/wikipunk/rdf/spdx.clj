(ns net.wikipunk.rdf.spdx
  "This specification describes the SPDX® language, defined as a dictionary of named properties and classes using W3C's RDF Technology. SPDX® is an open standard for communicating software bill of material information, including components, licenses, copyrights, and security references. SPDX reduces redundant work by providing a common format for companies and communities to share important data, thereby streamlining and improving compliance. . Known issues: - rdfs:comment and rdfs:seeAlso are used within the SPDX classes and causes a redefinition of these standard terms"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/spdx/spdx-spec/v2.3/ontology/spdx-ontology.owl.xml",
   :owl/versionIRI "http://spdx.org/rdf/terms/2.3",
   :owl/versionInfo 2.3M,
   :rdf/ns-prefix-map {"doap" "http://usefulinc.com/ns/doap#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "spdx" "http://spdx.org/rdf/terms#",
                       "vs"   "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://spdx.org/rdf/terms",
   :rdfa/prefix "spdx",
   :rdfa/uri "http://spdx.org/rdf/terms#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This specification describes the SPDX® language, defined as a dictionary of named properties and classes using W3C's RDF Technology.\n\nSPDX® is an open standard for communicating software bill of material information, including components, licenses, copyrights, and security references. SPDX reduces redundant work by providing a common format for companies and communities to share important data, thereby streamlining and improving compliance.\n.\nKnown issues:\n- rdfs:comment and rdfs:seeAlso are used within the SPDX classes and causes a redefinition of these standard terms"},
   :rdfs/label "SPDX 2.3"}
  (:refer-clojure :exclude [name range]))

(def Annotation
  "An Annotation is a comment on an SpdxItem by an agent."
  {:db/ident        :spdx/Annotation,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An Annotation is a comment on an SpdxItem by an agent.",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/annotator,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/dateTime,
                      :owl/onProperty  :spdx/annotationDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :spdx/AnnotationType,
                      :owl/onProperty :spdx/annotationType,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status  {:rdf/language "en",
                     :rdf/value    "stable"}})

(def AnnotationType
  "This type describes the type of annotation. Annotations are usually created when someone reviews the file, and if this is the case the annotation type should be REVIEW."
  {:db/ident :spdx/AnnotationType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This type describes the type of annotation. Annotations are usually created when someone reviews the file, and if this is the case the annotation type should be REVIEW."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def AnyLicenseInfo
  "The AnyLicenseInfo class includes all resources that represent licensing information."
  {:db/ident :spdx/AnyLicenseInfo,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The AnyLicenseInfo class includes all resources that represent licensing information.",
   :rdfs/isDefinedBy "http://spdx.org/rdf/terms#AnyLicenseInfo",
   :vs/term_status "stable"})

(def Checksum
  "A Checksum is value that allows the contents of a file to be authenticated. Even small changes to the content of the file will change its checksum. This class allows the results of a variety of checksum and cryptographic message digest algorithms to be represented."
  {:db/ident :spdx/Checksum,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Checksum is value that allows the contents of a file to be authenticated. Even small changes to the content of the file will change its checksum. This class allows the results of a variety of checksum and cryptographic message digest algorithms to be represented."},
   :rdfs/subClassOf [{:owl/onDataRange :xsd/hexBinary,
                      :owl/onProperty  :spdx/checksumValue,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :spdx/ChecksumAlgorithm,
                      :owl/onProperty :spdx/algorithm,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def ChecksumAlgorithm
  "Algorighm for Checksums."
  {:db/ident       :spdx/ChecksumAlgorithm,
   :rdf/type       :owl/Class,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Algorighm for Checksums."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def ConjunctiveLicenseSet
  "A ConjunctiveLicenseSet represents a set of licensing information all of which apply."
  {:db/ident :spdx/ConjunctiveLicenseSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A ConjunctiveLicenseSet represents a set of licensing information all of which apply."},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 2,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/member,
                      :rdf/type       :owl/Restriction}
                     :rdfs/Container
                     :spdx/AnyLicenseInfo],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def CreationInfo
  "One instance is required for each SPDX file produced. It provides the necessary information for forward and backward compatibility for processing tools."
  {:db/ident :spdx/CreationInfo,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "One instance is required for each SPDX file produced. It provides the necessary information for forward and backward compatibility for processing tools."},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseListVersion,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/dateTimeStamp,
                      :owl/onProperty  :spdx/created,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/creator,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def CrossRef
  "Cross reference details for the a URL reference"
  {:db/ident        :spdx/CrossRef,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "Cross reference details for the a URL reference"},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/dateTime,
                      :owl/onProperty  :spdx/timestamp,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/match,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/url,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :spdx/order,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/isWayBackLink,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isValid,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isLive,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status  {:rdf/language "en",
                     :rdf/value    "stable"}})

(def DisjunctiveLicenseSet
  "A DisjunctiveLicenseSet represents a set of licensing information where only one license applies at a time. This class implies that the recipient gets to choose one of these licenses they would prefer to use."
  {:db/ident :spdx/DisjunctiveLicenseSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A DisjunctiveLicenseSet represents a set of licensing information where only one license applies at a time. This class implies that the recipient gets to choose one of these licenses they would prefer to use."},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 2,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/member,
                      :rdf/type       :owl/Restriction}
                     :rdfs/Container
                     :spdx/AnyLicenseInfo],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def ExternalDocumentRef
  "Information about an external SPDX document reference including the checksum. This allows for verification of the external references."
  {:db/ident :spdx/ExternalDocumentRef,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Information about an external SPDX document reference including the checksum. This allows for verification of the external references."},
   :rdfs/subClassOf [{:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/externalDocumentId,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :spdx/SpdxDocument,
                      :owl/onProperty :spdx/spdxDocument,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :spdx/Checksum,
                      :owl/onProperty :spdx/checksum,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def ExternalRef
  "An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package."
  {:db/ident :spdx/ExternalRef,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package."},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/referenceLocator,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :spdx/ReferenceType,
                      :owl/onProperty :spdx/referenceType,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :spdx/ReferenceCategory,
                      :owl/onProperty :spdx/referenceCategory,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def ExtractedLicensingInfo
  "An ExtractedLicensingInfo represents a license or licensing notice that was found in a package, file or snippet. Any license text that is recognized as a license may be represented as a License rather than an ExtractedLicensingInfo."
  {:db/ident :spdx/ExtractedLicensingInfo,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An ExtractedLicensingInfo represents a license or licensing notice that was found in a package, file or snippet. Any license text that is recognized as a license may be represented as a License rather than an ExtractedLicensingInfo."},
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/extractedText,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :spdx/SimpleLicensingInfo],
   :vs/term_status "stable"})

(def File
  "A File represents a named sequence of information that is contained in a software package."
  {:db/ident :spdx/File,
   :owl/disjointWith :spdx/Snippet,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A File represents a named sequence of information that is contained in a software package."},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/FileType,
                      :owl/onProperty :spdx/fileType,
                      :rdf/type       :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/fileName,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/fileContributor,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/licenseInfoInFile,
                      :rdf/type       :owl/Restriction}
                     :spdx/SpdxItem
                     {:owl/minQualifiedCardinality 1,
                      :owl/onClass    :spdx/Checksum,
                      :owl/onProperty :spdx/checksum,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :doap/Project,
                      :owl/onProperty :spdx/artifactOf,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/File,
                      :owl/onProperty :spdx/fileDependency,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/noticeText,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def FileType
  "Type of file."
  {:db/ident       :spdx/FileType,
   :rdf/type       :owl/Class,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Type of file."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def License
  "A License represents a copyright license. The SPDX license list website is annotated with these properties (using RDFa) to allow license data published there to be easily processed. The license list is populated in accordance with the License List fields guidelines. These guidelines are not normative and may change over time. SPDX tooling should not rely on values in the license list conforming to the current guidelines."
  {:db/ident :spdx/License,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A License represents a copyright license. The SPDX license list website is annotated with these properties (using RDFa) to allow license data published there to be easily processed. The license list is populated in accordance with the License List fields guidelines. These guidelines are not normative and may change over time. SPDX tooling should not rely on values in the license list conforming to the current guidelines."},
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseText,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :spdx/SimpleLicensingInfo
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/standardLicenseTemplate,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isFsfLibre,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/standardLicenseHeaderTemplate,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isOsiApproved,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isDeprecatedLicenseId,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/standardLicenseHeader,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def LicenseException
  "An exception to a license."
  {:db/ident        :spdx/LicenseException,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "An exception to a license."},
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/example,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseExceptionText,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseExceptionTemplate,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseExceptionId,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :rdfs/seeAlso,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status  {:rdf/language "en",
                     :rdf/value    "stable"}})

(def ListedLicense
  "A license which is included in the SPDX License List (http://spdx.org/licenses)."
  {:db/ident :spdx/ListedLicense,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A license which is included in the SPDX License List (http://spdx.org/licenses)."},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/standardLicenseHeaderHtml,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseTextHtml,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/isDeprecatedLicenseId,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/deprecatedVersion,
                      :rdf/type        :owl/Restriction}
                     :spdx/License],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def ListedLicenseException
  "License exception specific to ListedLicenses"
  {:db/ident        :spdx/ListedLicenseException,
   :rdf/type        :owl/Class,
   :rdfs/comment    "License exception specific to ListedLicenses",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/exceptionTextHtml,
                      :rdf/type        :owl/Restriction}
                     :spdx/LicenseException]})

(def OrLaterOperator
  "A license with an or later operator indicating this license version or any later version of the license"
  {:db/ident :spdx/OrLaterOperator,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A license with an or later operator indicating this license version or any later version of the license"},
   :rdfs/subClassOf [{:owl/onClass    :spdx/SimpleLicensingInfo,
                      :owl/onProperty :spdx/member,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :spdx/AnyLicenseInfo],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def PackageClass
  "A Package represents a collection of software files that are delivered as a single functional component."
  {:db/ident :spdx/Package,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Package represents a collection of software files that are delivered as a single functional component."},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/date,
                      :owl/onProperty  :spdx/validUntilDate,
                      :rdf/type        :owl/Restriction}
                     {:owl/unionOf [{:owl/hasValue   :spdx/noassertion,
                                     :owl/onProperty :spdx/licenseDeclared,
                                     :rdf/type       :owl/Restriction}
                                    {:owl/hasValue   :spdx/none,
                                     :owl/onProperty :spdx/licenseDeclared,
                                     :rdf/type       :owl/Restriction}
                                    {:owl/maxQualifiedCardinality 1,
                                     :owl/onClass    :spdx/AnyLicenseInfo,
                                     :owl/onProperty :spdx/licenseDeclared,
                                     :rdf/type       :owl/Restriction}],
                      :rdf/type    :owl/Class}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :spdx/Purpose,
                      :owl/onProperty :spdx/primaryPackagePurpose,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :spdx/filesAnalyzed,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/date,
                      :owl/onProperty  :spdx/releaseDate,
                      :rdf/type        :owl/Restriction}
                     :spdx/SpdxItem
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/originator,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/File,
                      :owl/onProperty :spdx/hasFile,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/summary,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :spdx/PackageVerificationCode,
                      :owl/onProperty :spdx/packageVerificationCode,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/supplier,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/ExternalRef,
                      :owl/onProperty :spdx/externalRef,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/packageFileName,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/description,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :doap/homepage,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/sourceInfo,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/Checksum,
                      :owl/onProperty :spdx/checksum,
                      :rdf/type       :owl/Restriction}
                     {:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/downloadLocation,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/versionInfo,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/date,
                      :owl/onProperty  :spdx/builtDate,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def PackageVerificationCode
  "A manifest based verification code (the algorithm is defined in section 4.7 of the full specification) of the SPDX Item. This allows consumers of this data and/or database to determine if an SPDX item they have in hand is identical to the SPDX item from which the data was produced. This algorithm works even if the SPDX document is included in the SPDX item."
  {:db/ident :spdx/PackageVerificationCode,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A manifest based verification code (the algorithm is defined in section 4.7 of the full specification) of the SPDX Item. This allows consumers of this data and/or database to determine if an SPDX item they have in hand is identical to the SPDX item from which the data was produced. This algorithm works even if the SPDX document is included in the SPDX item."},
   :rdfs/subClassOf [{:owl/onDataRange :xsd/hexBinary,
                      :owl/onProperty  :spdx/packageVerificationCodeValue,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty :spdx/packageVerificationCodeExcludedFile,
                      :rdf/type :owl/Restriction}],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def Purpose
  "Package Purpose is intrinsic to how the package is being used rather than the content of the package."
  {:db/ident :spdx/Purpose,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Package Purpose is intrinsic to how the package is being used rather than the content of the package.",
   :vs/term_status "stable"})

(def ReferenceCategory
  "Category used for ExternalRef"
  {:db/ident       :spdx/ReferenceCategory,
   :rdf/type       :owl/Class,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Category used for ExternalRef"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def ReferenceType
  "Types used to external reference identifiers."
  {:db/ident        :spdx/ReferenceType,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "Types used to external reference identifiers."},
   :rdfs/subClassOf [{:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/externalReferenceSite,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/documentation,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :spdx/contextualExample,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status  {:rdf/language "en",
                     :rdf/value    "stable"}})

(def Relationship
  "A Relationship represents a relationship between two SpdxElements."
  {:db/ident :spdx/Relationship,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship represents a relationship between two SpdxElements."},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :spdx/RelationshipType,
                      :owl/onProperty :spdx/relationshipType,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :spdx/SpdxElement,
                      :owl/onProperty :spdx/relatedSpdxElement,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def RelationshipType
  "Type of relationship."
  {:db/ident       :spdx/RelationshipType,
   :rdf/type       :owl/Class,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Type of relationship."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def Review
  "This class has been deprecated in favor of an Annotation with an Annotation type of review."
  {:db/ident :spdx/Review,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class has been deprecated in favor of an Annotation with an Annotation type of review."},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/reviewer,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/dateTime,
                      :owl/onProperty  :spdx/reviewDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "deprecated"}})

(def SimpleLicensingInfo
  "The SimpleLicenseInfo class includes all resources that represent simple, atomic, licensing information."
  {:db/ident :spdx/SimpleLicensingInfo,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The SimpleLicenseInfo class includes all resources that represent simple, atomic, licensing information."},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseId,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/anyURI,
                      :owl/onProperty  :rdfs/seeAlso,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/CrossRef,
                      :owl/onProperty :spdx/crossRef,
                      :rdf/type       :owl/Restriction}
                     :spdx/AnyLicenseInfo],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def Snippet
  "The set of bytes in a file. The name of the snippet is the name of the file appended with the byte range in parenthesis (ie: \"./file/name(2145:5532)\")"
  {:db/ident :spdx/Snippet,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of bytes in a file. The name of the snippet is the name of the file appended with the byte range in parenthesis (ie: \"./file/name(2145:5532)\")"},
   :rdfs/subClassOf [{:owl/onClass    :spdx/File,
                      :owl/onProperty :spdx/snippetFromFile,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 1,
                      :owl/onClass
                      "http://www.w3.org/2009/pointers#StartEndPointer",
                      :owl/onProperty :spdx/range,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/licenseInfoInSnippet,
                      :rdf/type       :owl/Restriction}
                     :spdx/SpdxItem],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def SpdxDocument
  "An SpdxDocument is a summary of the contents, provenance, ownership and licensing analysis of a specific software package. This is, effectively, the top level of SPDX information."
  {:db/ident :spdx/SpdxDocument,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An SpdxDocument is a summary of the contents, provenance, ownership and licensing analysis of a specific software package. This is, effectively, the top level of SPDX information."},
   :rdfs/subClassOf [{:owl/hasValue   "http://spdx.org/licenses/CC0-1.0",
                      :owl/onProperty :spdx/dataLicense,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/Package,
                      :owl/onProperty :spdx/describesPackage,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/dataLicense,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :spdx/CreationInfo,
                      :owl/onProperty :spdx/creationInfo,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/ExternalDocumentRef,
                      :owl/onProperty :spdx/externalDocumentRef,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/Review,
                      :owl/onProperty :spdx/reviewed,
                      :rdf/type       :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/specVersion,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/ExtractedLicensingInfo,
                      :owl/onProperty :spdx/hasExtractedLicensingInfo,
                      :rdf/type       :owl/Restriction}
                     :spdx/SpdxElement],
   :vs/term_status "stable"})

(def SpdxElement
  "An SpdxElement is any thing described in SPDX, either a document or an SpdxItem. SpdxElements can be related to other SpdxElements."
  {:db/ident :spdx/SpdxElement,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An SpdxElement is any thing described in SPDX, either a document or an SpdxItem. SpdxElements can be related to other SpdxElements."},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :rdfs/comment,
                      :rdf/type        :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/name,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/Relationship,
                      :owl/onProperty :spdx/relationship,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/Annotation,
                      :owl/onProperty :spdx/annotation,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status "stable"})

(def SpdxItem
  "An SpdxItem is a potentially copyrightable work."
  {:db/ident        :spdx/SpdxItem,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "An SpdxItem is a potentially copyrightable work."},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/licenseComments,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/copyrightText,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :spdx/attributionText,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :spdx/AnyLicenseInfo,
                      :owl/onProperty :spdx/licenseInfoFromFiles,
                      :rdf/type       :owl/Restriction}
                     {:owl/unionOf [{:owl/hasValue   :spdx/noassertion,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}
                                    {:owl/hasValue   :spdx/none,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}
                                    {:owl/maxQualifiedCardinality 1,
                                     :owl/onClass    :spdx/AnyLicenseInfo,
                                     :owl/onProperty :spdx/licenseConcluded,
                                     :rdf/type       :owl/Restriction}],
                      :rdf/type    :owl/Class}
                     :spdx/SpdxElement],
   :vs/term_status  {:rdf/language "en",
                     :rdf/value    "stable"}})

(def WithExceptionOperator
  "Sometimes a set of license terms apply except under special circumstances. In this case, use the binary \"WITH\" operator to construct a new license expression to represent the special exception situation. A valid <license-expression> is where the left operand is a <simple-expression> value and the right operand is a <license-exception-id> that represents the special exception terms."
  {:db/ident :spdx/WithExceptionOperator,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Sometimes a set of license terms apply except under special circumstances. In this case, use the binary \"WITH\" operator to construct a new license expression to represent the special exception situation. A valid <license-expression> is where the left operand is a <simple-expression> value and the right operand is a <license-exception-id> that represents the special exception terms."},
   :rdfs/subClassOf [{:owl/onClass    :spdx/SimpleLicensingInfo,
                      :owl/onProperty :spdx/member,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :spdx/LicenseException,
                      :owl/onProperty :spdx/licenseException,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :spdx/AnyLicenseInfo],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def algorithm
  "Identifies the algorithm used to produce the subject Checksum. Currently, SHA-1 is the only supported algorithm. It is anticipated that other algorithms will be supported at a later time."
  {:db/ident :spdx/algorithm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Identifies the algorithm used to produce the subject Checksum. Currently, SHA-1 is the only supported algorithm. It is anticipated that other algorithms will be supported at a later time."},
   :rdfs/domain :spdx/Checksum,
   :vs/term_status "stable"})

(def annotation
  "Provide additional information about an SpdxElement."
  {:db/ident       :spdx/annotation,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "Provide additional information about an SpdxElement."},
   :rdfs/domain    :spdx/SpdxElement,
   :rdfs/range     :spdx/Annotation,
   :vs/term_status "stable"})

(def annotationDate
  "Identify when the comment was made. This is to be specified according to the combined date and time in the UTC format, as specified in the ISO 8601 standard."
  {:db/ident :spdx/annotationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Identify when the comment was made. This is to be specified according to the combined date and time in the UTC format, as specified in the ISO 8601 standard."},
   :rdfs/domain :spdx/Annotation,
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :spdx/date,
   :vs/term_status "stable"})

(def annotationType
  "Type of the annotation."
  {:db/ident       :spdx/annotationType,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Type of the annotation."},
   :rdfs/domain    :spdx/Annotation,
   :rdfs/range     {:owl/unionOf [{:owl/hasValue   :spdx/annotationType_other,
                                   :owl/onProperty :spdx/annotationType,
                                   :rdf/type       :owl/Restriction}
                                  {:owl/hasValue   :spdx/annotationType_review,
                                   :owl/onProperty :spdx/annotationType,
                                   :rdf/type       :owl/Restriction}],
                    :rdf/type    :owl/Class},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def annotationType_other
  "Type of annotation which does not fit in any of the pre-defined annotation types."
  {:db/ident :spdx/annotationType_other,
   :rdf/type [:spdx/AnnotationType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Type of annotation which does not fit in any of the pre-defined annotation types."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def annotationType_review
  "A Review represents an audit and signoff by an individual, organization or tool on the information for an SpdxElement."
  {:db/ident :spdx/annotationType_review,
   :rdf/type [:spdx/AnnotationType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Review represents an audit and signoff by an individual, organization or tool on the information for an SpdxElement."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def annotator
  "This field identifies the person, organization, or tool that has commented on a file, package, snippet, or the entire document."
  {:db/ident :spdx/annotator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "This field identifies the person, organization, or tool that has commented on a file, package, snippet, or the entire document.",
   :rdfs/domain :spdx/Annotation,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def artifactOf
  "Indicates the project in which the SpdxElement originated. Tools must preserve doap:homepage and doap:name properties and the URI (if one is known) of doap:Project resources that are values of this property. All other properties of doap:Projects are not directly supported by SPDX and may be dropped when translating to or from some SPDX formats."
  {:db/ident :spdx/artifactOf,
   :owl/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "Indicates the project in which the SpdxElement originated. Tools must preserve doap:homepage and doap:name properties and the URI (if one is known) of doap:Project resources that are values of this property. All other properties of doap:Projects are not directly supported by SPDX and may be dropped when translating to or from some SPDX formats."}
    {:rdf/language "en",
     :rdf/value    "Deprecated as of version 2.1"}],
   :rdfs/domain :spdx/SpdxElement,
   :rdfs/range :doap/Project,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "deprecated"}})

(def attributionText
  "This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce."
  {:db/ident :spdx/attributionText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce."},
   :rdfs/domain :spdx/SpdxItem,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def builtDate
  "This field provides a place for recording the actual date the package was built."
  {:db/ident :spdx/builtDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This field provides a place for recording the actual date the package was built."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :spdx/date,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksum
  "The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed."
  {:db/ident :spdx/checksum,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed."},
   :rdfs/domain {:owl/unionOf [:spdx/File :spdx/Package],
                 :rdf/type    :owl/Class},
   :rdfs/range :spdx/Checksum,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_adler32
  "Indicates the algorithm used was ADLER32."
  {:db/ident       :spdx/checksumAlgorithm_adler32,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the algorithm used was ADLER32."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_blake2b256
  "Indicates the algorithm used was BLAKE2b-256."
  {:db/ident       :spdx/checksumAlgorithm_blake2b256,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value "Indicates the algorithm used was BLAKE2b-256."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_blake2b384
  "Indicates the algorithm used was BLAKE2b-384."
  {:db/ident       :spdx/checksumAlgorithm_blake2b384,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value "Indicates the algorithm used was BLAKE2b-384."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_blake2b512
  "Indicates the algorithm used was BLAKE2b-512."
  {:db/ident       :spdx/checksumAlgorithm_blake2b512,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value "Indicates the algorithm used was BLAKE2b-512."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_blake3
  "Indicates the algorithm used was BLAKE3."
  {:db/ident       :spdx/checksumAlgorithm_blake3,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the algorithm used was BLAKE3."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_md2
  "Indicates the algorithm used was MD2"
  {:db/ident       :spdx/checksumAlgorithm_md2,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   "Indicates the algorithm used was MD2",
   :vs/term_status "stable"})

(def checksumAlgorithm_md4
  "Indicates the algorithm used was MD4"
  {:db/ident       :spdx/checksumAlgorithm_md4,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   "Indicates the algorithm used was MD4",
   :vs/term_status "stable"})

(def checksumAlgorithm_md5
  "Indicates the algorithm used was MD5"
  {:db/ident       :spdx/checksumAlgorithm_md5,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the algorithm used was MD5"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_md6
  "Indicates the algorithm used was MD6"
  {:db/ident       :spdx/checksumAlgorithm_md6,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the algorithm used was MD6"},
   :vs/term_status "stable"})

(def checksumAlgorithm_sha1
  "Indicates the algorithm used was SHA-1"
  {:db/ident       :spdx/checksumAlgorithm_sha1,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   "Indicates the algorithm used was SHA-1",
   :vs/term_status "stable"})

(def checksumAlgorithm_sha224
  "Indicates the algorithm used was SHA224"
  {:db/ident       :spdx/checksumAlgorithm_sha224,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the algorithm used was SHA224"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_sha256
  "Indicates the algorithm used was SHA256"
  {:db/ident       :spdx/checksumAlgorithm_sha256,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the algorithm used was SHA256"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_sha384
  "Indicates the algorithm used was SHA384"
  {:db/ident       :spdx/checksumAlgorithm_sha384,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the algorithm used was SHA384"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_sha3_256
  "Indicates the algorithm used was SHA3-256."
  {:db/ident       :spdx/checksumAlgorithm_sha3_256,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the algorithm used was SHA3-256."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_sha3_384
  "Indicates the algorithm used was SHA3-384."
  {:db/ident       :spdx/checksumAlgorithm_sha3_384,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the algorithm used was SHA3-384."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_sha3_512
  "Indicates the algorithm used was SHA3-512."
  {:db/ident       :spdx/checksumAlgorithm_sha3_512,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the algorithm used was SHA3-512."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumAlgorithm_sha512
  "Indicates the algorithm used was SHA512"
  {:db/ident       :spdx/checksumAlgorithm_sha512,
   :rdf/type       [:spdx/ChecksumAlgorithm :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the algorithm used was SHA512"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def checksumValue
  "The checksumValue property provides a lower case hexidecimal encoded digest value produced using a specific algorithm."
  {:db/ident :spdx/checksumValue,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The checksumValue property provides a lower case hexidecimal encoded digest value produced using a specific algorithm."},
   :rdfs/domain :spdx/Checksum,
   :rdfs/range :xsd/hexBinary,
   :vs/term_status "stable"})

(def contextualExample
  "Example for use of the external repository identifier"
  {:db/ident       :spdx/contextualExample,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "Example for use of the external repository identifier"},
   :rdfs/domain    :spdx/ReferenceType,
   :rdfs/range     :xsd/anyURI,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def copyrightText
  "The text of copyright declarations recited in the package, file or snippet. If the copyrightText field is not present, it implies an equivalent meaning to NOASSERTION."
  {:db/ident :spdx/copyrightText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The text of copyright declarations recited in the package, file or snippet.\n\nIf the copyrightText field is not present, it implies an equivalent meaning to NOASSERTION."},
   :rdfs/domain :spdx/SpdxItem,
   :rdfs/range [:xsd/string :rdfs/Literal],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def created
  "Identify when the SPDX document was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard."
  {:db/ident :spdx/created,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Identify when the SPDX document was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard."},
   :rdfs/domain :spdx/CreationInfo,
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :spdx/date,
   :vs/term_status "stable"})

(def creationInfo
  "The creationInfo property relates an SpdxDocument to a set of information about the creation of the SpdxDocument."
  {:db/ident :spdx/creationInfo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The creationInfo property relates an SpdxDocument to a set of information about the creation of the SpdxDocument."},
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/CreationInfo,
   :vs/term_status "stable"})

(def creator
  "Identify who (or what, in the case of a tool) created the SPDX document. If the SPDX document was created by an individual, indicate the person's name. If the SPDX document was created on behalf of a company or organization, indicate the entity name. If the SPDX document was created using a software tool, indicate the name and version for that tool. If multiple participants or tools were involved, use multiple instances of this field. Person name or organization name may be designated as “anonymous” if appropriate."
  {:db/ident :spdx/creator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Identify who (or what, in the case of a tool) created the SPDX document. If the SPDX document was created by an individual, indicate the person's name. If the SPDX document was created on behalf of a company or organization, indicate the entity name. If the SPDX document was created using a software tool, indicate the name and version for that tool. If multiple participants or tools were involved, use multiple instances of this field. Person name or organization name may be designated as “anonymous” if appropriate."},
   :rdfs/domain :spdx/CreationInfo,
   :rdfs/range :xsd/string,
   :vs/term_status "stable"})

(def crossRef
  "Cross Reference Detail for a license SeeAlso URL"
  {:db/ident     :spdx/crossRef,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Cross Reference Detail for a license SeeAlso URL"},
   :rdfs/range   :spdx/SimpleLicensingInfo})

(def dataLicense
  "Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields (\"SPDX-Metadata\"). The SPDX specification contains numerous fields where an SPDX document creator may provide relevant explanatory text in SPDX-Metadata. Without opining on the lawfulness of \"database rights\" (in jurisdictions where applicable), such explanatory text is copyrightable subject matter in most Berne Convention countries. By using the SPDX specification, or any portion hereof, you hereby agree that any copyright rights (as determined by your jurisdiction) in any SPDX-Metadata, including without limitation explanatory text, shall be subject to the terms of the Creative Commons CC0 1.0 Universal license. For SPDX-Metadata not containing any copyright rights, you hereby agree and acknowledge that the SPDX-Metadata is provided to you \"as-is\" and without any representations or warranties of any kind concerning the SPDX-Metadata, express, implied, statutory or otherwise, including without limitation warranties of title, merchantability, fitness for a particular purpose, non-infringement, or the absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not discoverable, all to the greatest extent permissible under applicable law."
  {:db/ident :spdx/dataLicense,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields (\"SPDX-Metadata\"). The SPDX specification contains numerous fields where an SPDX document creator may provide relevant explanatory text in SPDX-Metadata. Without opining on the lawfulness of \"database rights\" (in jurisdictions where applicable), such explanatory text is copyrightable subject matter in most Berne Convention countries. By using the SPDX specification, or any portion hereof, you hereby agree that any copyright rights (as determined by your jurisdiction) in any SPDX-Metadata, including without limitation explanatory text, shall be subject to the terms of the Creative Commons CC0 1.0 Universal license. For SPDX-Metadata not containing any copyright rights, you hereby agree and acknowledge that the SPDX-Metadata is provided to you \"as-is\" and without any representations or warranties of any kind concerning the SPDX-Metadata, express, implied, statutory or otherwise, including without limitation warranties of title, merchantability, fitness for a particular purpose, non-infringement, or the absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not discoverable, all to the greatest extent permissible under applicable law."},
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range {:owl/hasValue   "http://spdx.org/licenses/CC0-1.0",
                :owl/onProperty :spdx/dataLicense,
                :rdf/type       :owl/Restriction},
   :vs/term_status "stable"})

(def date
  "A date-time stamp."
  {:db/ident       :spdx/date,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "A date-time stamp."},
   :rdfs/domain    {:owl/unionOf [:spdx/Annotation :spdx/CreationInfo],
                    :rdf/type    :owl/Class},
   :rdfs/range     :xsd/dateTime,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def deprecatedVersion
  "License list version where this license was decprecated"
  {:db/ident       :spdx/deprecatedVersion,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "License list version where this license was decprecated"},
   :rdfs/domain    {:owl/unionOf [:spdx/ListedLicense
                                  :spdx/ListedLicenseException],
                    :rdf/type    :owl/Class},
   :rdfs/range     :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def describesPackage
  "The describesPackage property relates an SpdxDocument to the package which it describes."
  {:db/ident :spdx/describesPackage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The describesPackage property relates an SpdxDocument to the package which it describes."},
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/Package,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def description
  "Provides a detailed description of the package."
  {:db/ident       :spdx/description,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "Provides a detailed description of the package."},
   :rdfs/domain    :spdx/Package,
   :rdfs/range     :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def documentation
  "Website containing the documentation related to the repository identifier"
  {:db/ident :spdx/documentation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Website containing the documentation related to the repository identifier"},
   :rdfs/domain :spdx/ReferenceType,
   :rdfs/range :xsd/anyURI,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def downloadLocation
  "The URI at which this package is available for download. Private (i.e., not publicly reachable) URIs are acceptable as values of this property. The values http://spdx.org/rdf/terms#none and http://spdx.org/rdf/terms#noassertion may be used to specify that the package is not downloadable or that no attempt was made to determine its download location, respectively."
  {:db/ident :spdx/downloadLocation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The URI at which this package is available for download. Private (i.e., not publicly reachable) URIs are acceptable as values of this property. The values http://spdx.org/rdf/terms#none and http://spdx.org/rdf/terms#noassertion may be used to specify that the package is not downloadable or that no attempt was made to determine its download location, respectively."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/anyURI,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def example
  "Text for examples in describing an SPDX element."
  {:db/ident       :spdx/example,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "Text for examples in describing an SPDX element."},
   :rdfs/domain    :spdx/LicenseException,
   :rdfs/range     :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def exceptionTextHtml
  "HTML representation of the License Exception Text"
  {:db/ident       :spdx/exceptionTextHtml,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "HTML representation of the License Exception Text"},
   :rdfs/domain    :spdx/ListedLicenseException,
   :rdfs/range     :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def externalDocumentId
  "externalDocumentId is a string containing letters, numbers, ., - and/or + which uniquely identifies an external document within this document."
  {:db/ident :spdx/externalDocumentId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "externalDocumentId is a string containing letters, numbers, ., - and/or + which uniquely identifies an external document within this document."},
   :rdfs/domain :spdx/ExternalDocumentRef,
   :rdfs/range :xsd/anyURI,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def externalDocumentRef
  "Identify any external SPDX documents referenced within this SPDX document."
  {:db/ident :spdx/externalDocumentRef,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Identify any external SPDX documents referenced within this SPDX document."},
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/ExternalDocumentRef,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def externalRef
  "An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package."
  {:db/ident :spdx/externalRef,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :spdx/ExternalRef,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def externalReferenceSite
  "Website for the maintainers of the external reference site"
  {:db/ident :spdx/externalReferenceSite,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Website for the maintainers of the external reference site"},
   :rdfs/domain :spdx/ReferenceType,
   :rdfs/range :xsd/anyURI,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def extractedText
  "Provide a copy of the actual text of the license reference extracted from the package, file or snippet that is associated with the License Identifier to aid in future analysis."
  {:db/ident :spdx/extractedText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Provide a copy of the actual text of the license reference extracted from the package, file or snippet that is associated with the License Identifier to aid in future analysis."},
   :rdfs/domain :spdx/ExtractedLicensingInfo,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileContributor
  "This field provides a place for the SPDX file creator to record file contributors. Contributors could include names of copyright holders and/or authors who may not be copyright holders yet contributed to the file content."
  {:db/ident :spdx/fileContributor,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This field provides a place for the SPDX file creator to record file contributors. Contributors could include names of copyright holders and/or authors who may not be copyright holders yet contributed to the file content."},
   :rdfs/domain :spdx/File,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileDependency
  "This field is deprecated since SPDX 2.0 in favor of using Section 7 which provides more granularity about relationships."
  {:db/ident :spdx/fileDependency,
   :owl/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This field is deprecated since SPDX 2.0 in favor of using Section 7 which provides more granularity about relationships."},
   :rdfs/domain :spdx/File,
   :rdfs/range :spdx/File,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "deprecated"}})

(def fileName
  "The name of the file relative to the root of the package."
  {:db/ident :spdx/fileName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The name of the file relative to the root of the package."},
   :rdfs/domain :spdx/File,
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :spdx/name,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileType
  "The type of the file."
  {:db/ident       :spdx/fileType,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "The type of the file."},
   :rdfs/domain    :spdx/File,
   :vs/term_status "stable"})

(def fileType_application
  "The file is associated with a specific application type (MIME type of application/* )"
  {:db/ident :spdx/fileType_application,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    " The file is associated with a specific application type (MIME type of application/* )"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileType_archive
  "Indicates the file is an archive file."
  {:db/ident       :spdx/fileType_archive,
   :rdf/type       [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the file is an archive file."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileType_audio
  "The file is associated with an audio file (MIME type of audio/* , ie. .mp3 ); IMAGE if the file is assoicated with an picture image file (MIME type of image/*, ie. .jpg, .gif )"
  {:db/ident :spdx/fileType_audio,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The file is associated with an audio file (MIME type of audio/* , ie. .mp3 ); \nIMAGE if the file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  )"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileType_binary
  "Indicates the file is not a text file. spdx:filetype_archive is preferred for archive files even though they are binary."
  {:db/ident :spdx/fileType_binary,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates the file is not a text file. spdx:filetype_archive is preferred for archive files even though they are binary."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileType_documentation
  "The file serves as documentation."
  {:db/ident       :spdx/fileType_documentation,
   :rdf/type       [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "The file serves as documentation."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileType_image
  "The file is assoicated with an picture image file (MIME type of image/*, ie. .jpg, .gif )."
  {:db/ident :spdx/fileType_image,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  )."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileType_other
  "Indicates the file is not a source, archive or binary file."
  {:db/ident :spdx/fileType_other,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Indicates the file is not a source, archive or binary file."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileType_source
  "Indicates the file is a source code file."
  {:db/ident       :spdx/fileType_source,
   :rdf/type       [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Indicates the file is a source code file."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileType_spdx
  "The file is an SPDX document."
  {:db/ident       :spdx/fileType_spdx,
   :rdf/type       [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "The file is an SPDX document."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileType_text
  "The file is human readable text file (MIME type of text/*)."
  {:db/ident :spdx/fileType_text,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The file is human readable text file (MIME type of text/*)."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def fileType_video
  "The file is associated with a video file type (MIME type of video/*)."
  {:db/ident :spdx/fileType_video,
   :rdf/type [:spdx/FileType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The file is associated with a video file type (MIME type of video/*)."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def filesAnalyzed
  "Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document. If false indicates packages that represent metadata or URI references to a project, product, artifact, distribution or a component. If set to false, the package must not contain any files."
  {:db/ident :spdx/filesAnalyzed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document. If false indicates packages that represent metadata or URI references to a project, product, artifact, distribution or a component. If set to false, the package must not contain any files."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/boolean,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def hasExtractedLicensingInfo
  "Indicates that a particular ExtractedLicensingInfo was defined in the subject SpdxDocument."
  {:db/ident :spdx/hasExtractedLicensingInfo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates that a particular ExtractedLicensingInfo was defined in the subject SpdxDocument."},
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/ExtractedLicensingInfo,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def hasFile
  "Indicates that a particular file belongs to a package."
  {:db/ident       :spdx/hasFile,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "Indicates that a particular file belongs to a package."},
   :rdfs/domain    :spdx/Package,
   :rdfs/range     :spdx/File,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

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
   {:rdf/language "en",
    :rdf/value
    "Indicate a URL is still a live accessible location on the public internet"},
   :rdfs/domain :spdx/CrossRef,
   :rdfs/range :xsd/boolean})

(def isOsiApproved
  "Indicates if the OSI has approved the license."
  {:db/ident       :spdx/isOsiApproved,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "Indicates if the OSI has approved the license."},
   :rdfs/domain    :spdx/License,
   :rdfs/range     :xsd/boolean,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def isValid
  "True if the URL is a valid well formed URL"
  {:db/ident     :spdx/isValid,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "True if the URL is a valid well formed URL"},
   :rdfs/domain  :spdx/CrossRef,
   :rdfs/range   :xsd/boolean})

(def isWayBackLink
  "True if the License SeeAlso URL points to a Wayback archive"
  {:db/ident :spdx/isWayBackLink,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "True if the License SeeAlso URL points to a Wayback archive"},
   :rdfs/domain :spdx/CrossRef,
   :rdfs/range :xsd/boolean})

(def licenseComments
  "The licenseComments property allows the preparer of the SPDX document to describe why the licensing in spdx:licenseConcluded was chosen."
  {:db/ident :spdx/licenseComments,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The licenseComments property allows the preparer of the SPDX document to describe why the licensing in spdx:licenseConcluded was chosen."},
   :rdfs/domain :spdx/SpdxItem,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseConcluded
  "The licensing that the preparer of this SPDX document has concluded, based on the evidence, actually applies to the SPDX Item. If the licenseConcluded field is not present for an SPDX Item, it implies an equivalent meaning to NOASSERTION."
  {:db/ident :spdx/licenseConcluded,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The licensing that the preparer of this SPDX document has concluded, based on the evidence, actually applies to the SPDX Item.\n\nIf the licenseConcluded field is not present for an SPDX Item, it implies an equivalent meaning to NOASSERTION."},
   :rdfs/domain :spdx/SpdxItem,
   :rdfs/range {:owl/unionOf [:spdx/AnyLicenseInfo
                              {:owl/hasValue   :spdx/noassertion,
                               :owl/onProperty :spdx/licenseConcluded,
                               :rdf/type       :owl/Restriction}
                              {:owl/hasValue   :spdx/none,
                               :owl/onProperty :spdx/licenseConcluded,
                               :rdf/type       :owl/Restriction}],
                :rdf/type    :owl/Class},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseDeclared
  "The licensing that the creators of the software in the package, or the packager, have declared. Declarations by the original software creator should be preferred, if they exist."
  {:db/ident :spdx/licenseDeclared,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The licensing that the creators of the software in the package, or the packager, have declared. Declarations by the original software creator should be preferred, if they exist."},
   :rdfs/domain :spdx/SpdxItem,
   :rdfs/range :spdx/AnyLicenseInfo,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseException
  "An exception to a license."
  {:db/ident       :spdx/licenseException,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "An exception to a license."},
   :rdfs/domain    :spdx/WithExceptionOperator,
   :rdfs/range     :spdx/LicenseException,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseExceptionId
  "Short form license exception identifier in Appendix I.2 of the SPDX specification."
  {:db/ident :spdx/licenseExceptionId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Short form license exception identifier in Appendix I.2 of the SPDX specification."},
   :rdfs/domain :spdx/LicenseException,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseExceptionTemplate
  "Template for matching license exception text"
  {:db/ident       :spdx/licenseExceptionTemplate,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value "Template for matching license exception text"},
   :rdfs/domain    :spdx/LicenseException,
   :rdfs/range     :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseExceptionText
  "Full text of the license exception."
  {:db/ident       :spdx/licenseExceptionText,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Full text of the license exception."},
   :rdfs/domain    :spdx/LicenseException,
   :rdfs/range     :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseId
  "A human readable short form license identifier for a license. The license ID is either on the standard license list or the form \"LicenseRef-[idString]\" where [idString] is a unique string containing letters, numbers, \".\" or \"-\". When used within a license expression, the license ID can optionally include a reference to an external document in the form \"DocumentRef-[docrefIdString]:LicenseRef-[idString]\" where docRefIdString is an ID for an external document reference."
  {:db/ident :spdx/licenseId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A human readable short form license identifier for a license. The license ID is either on the standard license list or the form \"LicenseRef-[idString]\" where [idString] is a unique string containing letters, numbers, \".\" or \"-\".  When used within a license expression, the license ID can optionally include a reference to an external document in the form \"DocumentRef-[docrefIdString]:LicenseRef-[idString]\" where docRefIdString is an ID for an external document reference."},
   :rdfs/domain :spdx/SimpleLicensingInfo,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseInfoFromFiles
  "The licensing information that was discovered directly within the package. There will be an instance of this property for each distinct value of alllicenseInfoInFile properties of all files contained in the package. If the licenseInfoFromFiles field is not present for a package and filesAnalyzed property for that same pacakge is true or omitted, it implies an equivalent meaning to NOASSERTION."
  {:db/ident :spdx/licenseInfoFromFiles,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The licensing information that was discovered directly within the package. There will be an instance of this property for each distinct value of alllicenseInfoInFile properties of all files contained in the package.\n\nIf the licenseInfoFromFiles field is not present for a package and filesAnalyzed property for that same pacakge is true or omitted, it implies an equivalent meaning to NOASSERTION."},
   :rdfs/domain :spdx/Package,
   :rdfs/range {:owl/unionOf [:spdx/AnyLicenseInfo
                              {:owl/hasValue   :spdx/noassertion,
                               :owl/onProperty :spdx/licenseInfoFromFiles,
                               :rdf/type       :owl/Restriction}
                              {:owl/hasValue   :spdx/none,
                               :owl/onProperty :spdx/licenseInfoFromFiles,
                               :rdf/type       :owl/Restriction}],
                :rdf/type    :owl/Class},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseInfoInFile
  "Licensing information that was discovered directly in the subject file. This is also considered a declared license for the file. If the licenseInfoInFile field is not present for a file, it implies an equivalent meaning to NOASSERTION."
  {:db/ident :spdx/licenseInfoInFile,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Licensing information that was discovered directly in the subject file. This is also considered a declared license for the file.\n\nIf the licenseInfoInFile field is not present for a file, it implies an equivalent meaning to NOASSERTION."},
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
   :vs/term_status "stable"})

(def licenseInfoInSnippet
  "Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet. If the licenseInfoInSnippet field is not present for a snippet, it implies an equivalent meaning to NOASSERTION."
  {:db/ident :spdx/licenseInfoInSnippet,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet.\n\nIf the licenseInfoInSnippet field is not present for a snippet, it implies an equivalent meaning to NOASSERTION."},
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
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseListVersion
  "An optional field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created."
  {:db/ident :spdx/licenseListVersion,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An optional field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created."},
   :rdfs/domain :spdx/CreationInfo,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseText
  "Full text of the license."
  {:db/ident       :spdx/licenseText,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Full text of the license."},
   :rdfs/domain    :spdx/License,
   :rdfs/range     :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def licenseTextHtml
  "License text in HTML format"
  {:db/ident       :spdx/licenseTextHtml,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "License text in HTML format"},
   :rdfs/domain    :spdx/ListedLicense,
   :rdfs/range     :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def match
  "Status of a License List SeeAlso URL reference if it refers to a website that matches the license text."
  {:db/ident :spdx/match,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Status of a License List SeeAlso URL reference if it refers to a website that matches the license text.",
   :rdfs/domain :spdx/CrossRef,
   :rdfs/range :xsd/string})

(def member
  "A license, or other licensing information, that is a member of the subject license set."
  {:db/ident :spdx/member,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A license, or other licensing information, that is a member of the subject license set."},
   :rdfs/domain {:owl/unionOf [:spdx/ConjunctiveLicenseSet
                               :spdx/DisjunctiveLicenseSet
                               :spdx/WithExceptionOperator],
                 :rdf/type    :owl/Class},
   :rdfs/range :spdx/AnyLicenseInfo,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def name
  "Identify name of this SpdxElement."
  {:db/ident       :spdx/name,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Identify name of this SpdxElement."},
   :rdfs/domain    :spdx/SpdxElement,
   :rdfs/range     :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def noassertion
  "Individual to indicate the creator of the SPDX document does not assert any value for the object."
  {:db/ident :spdx/noassertion,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   "Individual to indicate the creator of the SPDX document does not assert any value for the object."})

(def none
  "Individual to indicate that no value is applicable for the Object."
  {:db/ident :spdx/none,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   "Individual to indicate that no value is applicable for the Object."})

(def noticeText
  "This field provides a place for the SPDX file creator to record potential legal notices found in the file. This may or may not include copyright statements."
  {:db/ident :spdx/noticeText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This field provides a place for the SPDX file creator to record potential legal notices found in the file. This may or may not include copyright statements."},
   :rdfs/domain :spdx/File,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def order
  "The ordinal order of this element within a list"
  {:db/ident     :spdx/order,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "The ordinal order of this element within a list"},
   :rdfs/domain  :spdx/CrossRef,
   :rdfs/range   :xsd/nonNegativeInteger})

(def originator
  "The name and, optionally, contact information of the person or organization that originally created the package. Values of this property must conform to the agent and tool syntax."
  {:db/ident :spdx/originator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The name and, optionally, contact information of the person or organization that originally created the package. Values of this property must conform to the agent and tool syntax."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string})

(def packageFileName
  "The base name of the package file name. For example, zlib-1.2.5.tar.gz."
  {:db/ident :spdx/packageFileName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The base name of the package file name. For example, zlib-1.2.5.tar.gz."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def packageName
  "Identify the full name of the package as given by Package Originator."
  {:db/ident :spdx/packageName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Identify the full name of the package as given by Package Originator."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :spdx/name,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def packageVerificationCode
  "A manifest based verification code (the algorithm is defined in section 3.9.4 of the full specification) of the package. This allows consumers of this data and/or database to determine if a package they have in hand is identical to the package from which the data was produced. This algorithm works even if the SPDX document is included in the package."
  {:db/ident :spdx/packageVerificationCode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A manifest based verification code (the algorithm is defined in section 3.9.4 of the full specification) of the package. This allows consumers of this data and/or database to determine if a package they have in hand is identical to the package from which the data was produced. This algorithm works even if the SPDX document is included in the package."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :spdx/PackageVerificationCode,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def packageVerificationCodeExcludedFile
  "A file that was excluded when calculating the package verification code. This is usually a file containing SPDX data regarding the package. If a package contains more than one SPDX file all SPDX files must be excluded from the package verification code. If this is not done it would be impossible to correctly calculate the verification codes in both files."
  {:db/ident :spdx/packageVerificationCodeExcludedFile,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A file that was excluded when calculating the package verification code. This is usually a file containing SPDX data regarding the package. If a package contains more than one SPDX file all SPDX files must be excluded from the package verification code. If this is not done it would be impossible to correctly calculate the verification codes in both files."},
   :rdfs/domain :spdx/PackageVerificationCode,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def packageVerificationCodeValue
  "The actual package verification code as a hex encoded value."
  {:db/ident :spdx/packageVerificationCodeValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The actual package verification code as a hex encoded value."},
   :rdfs/domain :spdx/PackageVerificationCode,
   :rdfs/range :xsd/hexBinary,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def primaryPackagePurpose
  "This field provides information about the primary purpose of the identified package. Package Purpose is intrinsic to how the package is being used rather than the content of the package."
  {:db/ident :spdx/primaryPackagePurpose,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This field provides information about the primary purpose of the identified package. Package Purpose is intrinsic to how the package is being used rather than the content of the package."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :spdx/Purpose,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_application
  "The package is a software application."
  {:db/ident       :spdx/purpose_application,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "The package is a software application."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_archive
  "The package refers to an archived collection of files (.tar, .zip, etc)."
  {:db/ident :spdx/purpose_archive,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The package refers to an archived collection of files (.tar, .zip, etc)."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_container
  "The package refers to a container image which can be used by a container runtime application."
  {:db/ident :spdx/purpose_container,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The package refers to a container image which can be used by a container runtime application."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_device
  "The package refers to a chipset, processor, or electronic board."
  {:db/ident :spdx/purpose_device,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The package refers to a chipset, processor, or electronic board."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_file
  "The package is a single file which can be independently distributed (configuration file, statically linked binary, Kubernetes deployment, etc)."
  {:db/ident :spdx/purpose_file,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The package is a single file which can be independently distributed (configuration file, statically linked binary, Kubernetes deployment, etc)."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_firmware
  "The package provides low level control over a device's hardware."
  {:db/ident :spdx/purpose_firmware,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The package provides low level control over a device's hardware."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_framework
  "The package is a software framework."
  {:db/ident       :spdx/purpose_framework,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "The package is a software framework."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_install
  "The package is used to install software on disk."
  {:db/ident       :spdx/purpose_install,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "The package is used to install software on disk."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_library
  "The package is a software library."
  {:db/ident       :spdx/purpose_library,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "The package is a software library."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_operatingSystem
  "The package refers to an operating system."
  {:db/ident       :spdx/purpose_operatingSystem,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "The package refers to an operating system."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_other
  "The package doesn't fit into other purpose defined terms."
  {:db/ident :spdx/purpose_other,
   :rdf/type [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The package doesn't fit into other purpose defined terms."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def purpose_source
  "The package is a collection of source files."
  {:db/ident       :spdx/purpose_source,
   :rdf/type       [:spdx/Purpose :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value "The package is a collection of source files."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def range
  "This field defines the byte range in the original host file (in X.2) that the snippet information applies to"
  {:db/ident :spdx/range,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This field defines the byte range in the original host file (in X.2) that the snippet information applies to"},
   :rdfs/domain :spdx/Snippet,
   :rdfs/range "http://www.w3.org/2009/pointers#StartEndPointer",
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def referenceCategory
  "Category for the external reference"
  {:db/ident       :spdx/referenceCategory,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Category for the external reference"},
   :rdfs/domain    :spdx/ExternalRef,
   :rdfs/range     :spdx/ReferenceCategory,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def referenceCategory_other
  {:db/ident       :spdx/referenceCategory_other,
   :rdf/type       [:spdx/ReferenceCategory :owl/NamedIndividual],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def referenceCategory_packageManager
  {:db/ident       :spdx/referenceCategory_packageManager,
   :rdf/type       [:spdx/ReferenceCategory :owl/NamedIndividual],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def referenceCategory_persistentId
  "These point to objects present in the Software Heritage archive by the means of persistent identifiers that are guaranteed to remain stable (persistent) over time."
  {:db/ident :spdx/referenceCategory_persistentId,
   :rdf/type [:spdx/ReferenceCategory :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "These point to objects present in the Software Heritage archive by the means of persistent identifiers that are guaranteed to remain stable (persistent) over time."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def referenceCategory_security
  {:db/ident       :spdx/referenceCategory_security,
   :rdf/type       [:spdx/ReferenceCategory :owl/NamedIndividual],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def referenceLocator
  "The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location. The format of the locator is subject to constraints defined by the <type>."
  {:db/ident :spdx/referenceLocator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location. The format of the locator is subject to constraints defined by the <type>."},
   :rdfs/domain :spdx/ExternalRef,
   :rdfs/range :xsd/anyURI,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def referenceType
  "Type of the external reference. These are definined in an appendix in the SPDX specification."
  {:db/ident :spdx/referenceType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Type of the external reference. These are definined in an appendix in the SPDX specification."},
   :rdfs/domain :spdx/ExternalRef,
   :rdfs/range :spdx/ReferenceType,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def referencesFile
  "This property has been replaced by a relationship between the SPDX document and file with a \"contains\" relationship type."
  {:db/ident :spdx/referencesFile,
   :owl/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "This property has been replaced by a relationship between the SPDX document and file with a \"contains\" relationship type."}
    {:rdf/language "en",
     :rdf/value
     "Indicates that a particular file belongs as part of the set of analyzed files in the SpdxDocument."}],
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/File,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "deprecated"}})

(def relatedSpdxElement
  "A related SpdxElement."
  {:db/ident       :spdx/relatedSpdxElement,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "A related SpdxElement."},
   :rdfs/domain    :spdx/Relationship,
   :rdfs/range     :spdx/SpdxElement,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationship
  "Defines a relationship between two SPDX elements. The SPDX element may be a Package, File, or SpdxDocument."
  {:db/ident :spdx/relationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines a relationship between two SPDX elements. The SPDX element may be a Package, File, or SpdxDocument."},
   :rdfs/domain :spdx/SpdxElement,
   :rdfs/range :spdx/Relationship,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType
  "Describes the type of relationship between two SPDX elements."
  {:db/ident :spdx/relationshipType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Describes the type of relationship between two SPDX elements."},
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
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_amendment
  "To be used when SPDXRef-A amends the SPDX information in SPDXRef-B."
  {:db/ident :spdx/relationshipType_amendment,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To be used when SPDXRef-A amends the SPDX information in SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_ancestorOf
  "A Relationship of relationshipType_ancestorOf expresses that an SPDXElement is an ancestor of (same lineage but pre-dates) the relatedSPDXElement. For example, an upstream File is an ancestor of a modified downstream File"
  {:db/ident :spdx/relationshipType_ancestorOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_ancestorOf expresses that an SPDXElement is an ancestor of (same lineage but pre-dates) the relatedSPDXElement.  For example, an upstream File is an ancestor of a modified downstream File"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_buildDependencyOf
  "Is to be used when SPDXRef-A is a build dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_buildDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is a build dependency of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_buildToolOf
  "To be used when SPDXRef-A is used to to build SPDXRef-B."
  {:db/ident       :spdx/relationshipType_buildToolOf,
   :rdf/type       [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "To be used when SPDXRef-A is used to to build SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_containedBy
  "A Relationship of relationshipType_containedBy expresses that an SPDXElement is contained by the relatedSPDXElement. For example, a File contained by a Package."
  {:db/ident :spdx/relationshipType_containedBy,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_containedBy expresses that an SPDXElement is contained by the relatedSPDXElement.  For example, a File contained by a Package. "},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_contains
  "A Relationship of relationshipType_contains expresses that an SPDXElement contains the relatedSPDXElement. For example, a Package contains a File. (relationshipType_contains introduced in SPDX 2.0 deprecates property 'hasFile' from SPDX 1.2)"
  {:db/ident :spdx/relationshipType_contains,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_contains expresses that an SPDXElement contains the relatedSPDXElement.  For example, a Package contains a File. (relationshipType_contains introduced in SPDX 2.0 deprecates property 'hasFile' from SPDX 1.2)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_copyOf
  "A Relationship of relationshipType_copyOf expresses that the SPDXElement is an exact copy of the relatedSDPXElement. For example, a downstream distribution of a binary library which was copied from the upstream package."
  {:db/ident :spdx/relationshipType_copyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_copyOf expresses that the SPDXElement is an exact copy of the relatedSDPXElement.  For example, a downstream distribution of a binary library which was copied from the upstream package."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_dataFile
  "Is to be used when SPDXRef-A is a data file used in SPDXRef-B. Replaced by relationshipType_dataFileOf"
  {:db/ident :spdx/relationshipType_dataFile,
   :owl/deprecated true,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is a data file used in SPDXRef-B.  Replaced by relationshipType_dataFileOf"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "deprecated"}})

(def relationshipType_dataFileOf
  "Is to be used when SPDXRef-A is a data file used in SPDXRef-B."
  {:db/ident :spdx/relationshipType_dataFileOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is a data file used in SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_dependencyManifestOf
  "Is to be used when SPDXRef-A is a manifest file that lists a set of dependencies for SPDXRef-B."
  {:db/ident :spdx/relationshipType_dependencyManifestOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is a manifest file that lists a set of dependencies for SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_dependencyOf
  "Is to be used when SPDXRef-A is dependency of SPDXRef-B."
  {:db/ident       :spdx/relationshipType_dependencyOf,
   :rdf/type       [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "Is to be used when SPDXRef-A is dependency of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_dependsOn
  "Is to be used when SPDXRef-A depends on SPDXRef-B."
  {:db/ident       :spdx/relationshipType_dependsOn,
   :rdf/type       [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "Is to be used when SPDXRef-A depends on SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_descendantOf
  "A Relationship of relationshipType_descendantOf expresses that an SPDXElement is a descendant of (same lineage but post-dates) the relatedSPDXElement. For example, an downstream File that was modified is a descendant of an upstream File"
  {:db/ident :spdx/relationshipType_descendantOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_descendantOf expresses that an SPDXElement is a descendant of (same lineage but post-dates) the relatedSPDXElement.  For example, an downstream File that was modified is a descendant of an upstream File"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_describedBy
  "Is to be used an SPDXRef-A is described by SPDXRef-Document."
  {:db/ident :spdx/relationshipType_describedBy,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Is to be used an SPDXRef-A is described by SPDXRef-Document."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_describes
  "Is to be used when SPDXRef-DOCUMENT describes SPDXRef-A."
  {:db/ident       :spdx/relationshipType_describes,
   :rdf/type       [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "Is to be used when SPDXRef-DOCUMENT describes SPDXRef-A."},
   :vs/term_status "stable"})

(def relationshipType_devDependencyOf
  "Is to be used when SPDXRef-A is a development dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_devDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is a development dependency of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_devToolOf
  "Is to be used when SPDXRef-A is a development dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_devToolOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is a development dependency of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_distributionArtifact
  "A Relationship of relationshipType_distributionArtifact expresses that distributing the SPDXElement requires that the relatedSPDXElement also be distributed. For example, distributing a binary File may require that a source tarball (another File) be made available with the distribuiton."
  {:db/ident :spdx/relationshipType_distributionArtifact,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_distributionArtifact expresses that distributing the SPDXElement requires that the relatedSPDXElement also be distributed.  For example, distributing a binary File may require that a source tarball (another File) be made available with the distribuiton. "},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_documentation
  "To be used when SPDXRef-A provides documentation of SPDXRef-B."
  {:db/ident :spdx/relationshipType_documentation,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To be used when SPDXRef-A provides documentation of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_dynamicLink
  "Is to be used when SPDXRef-A dynamically links to SPDXRef-B."
  {:db/ident :spdx/relationshipType_dynamicLink,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Is to be used when SPDXRef-A dynamically links to SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_exampleOf
  "Is to be used when SPDXRef-A is an example of SPDXRef-B."
  {:db/ident       :spdx/relationshipType_exampleOf,
   :rdf/type       [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "Is to be used when SPDXRef-A is an example of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_expandedFromArchive
  "A Relationship of relationshipType_expandedFromArchive expresses that the SPDXElement is a file which was epanded from a relatedSPDXElement file. For example, if there is an archive file xyz.tar.gz containing a file foo.c the archive file was expanded in a directory arch/xyz, the file arch/xyz/foo.c would have a relationshipType_expandedFromArchive with the file xyz.tar.gz."
  {:db/ident :spdx/relationshipType_expandedFromArchive,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_expandedFromArchive expresses that the SPDXElement is a file which was epanded from a relatedSPDXElement file.  For example, if there is an archive file xyz.tar.gz containing a file foo.c the archive file was expanded in a directory arch/xyz, the file arch/xyz/foo.c would have a relationshipType_expandedFromArchive with the file xyz.tar.gz."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_fileAdded
  "A Relationship of relationshipType_fileAdded expresses that the SPDXElement is a file which has been added to the relatedSPDXElement package. For example, a package (the relatedSPDXElement) has been patched to remove a file (the SPDXElement). This relationship is typically used to express the result of a patched package when the actual patchfile is not present."
  {:db/ident :spdx/relationshipType_fileAdded,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_fileAdded expresses that the SPDXElement is a file which has been added to the relatedSPDXElement package.  For example, a package (the relatedSPDXElement) has been patched to remove a file (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_fileDeleted
  "A Relationship of relationshipType_fileDeleted expresses that the SPDXElement is a package where the relatedSPDXElement file has been removed. For example, a package has been patched to remove a file a file (the relatedSPDXElement resulting in the patched package (the SPDXElement). This relationship is typically used to express the result of a patched package when the actual patchfile is not present."
  {:db/ident :spdx/relationshipType_fileDeleted,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_fileDeleted expresses that the SPDXElement is a package where the relatedSPDXElement file has been removed.  For example, a package has been patched to remove a file a file (the relatedSPDXElement resulting in the patched package (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_fileModified
  "A Relationship of relationshipType_fileModified expresses that the SPDXElement is a file which is a modified version of the relatedSPDXElement file. For example, a file (the SPDXElement) has been patched to modify the contents of the original file (the SPDXElement). This relationship is typically used to express the result of a patched package when the actual patchfile is not present."
  {:db/ident :spdx/relationshipType_fileModified,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_fileModified expresses that the SPDXElement is a file which is a modified version of the relatedSPDXElement file.  For example, a file (the SPDXElement) has been patched to modify the contents of the original file (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_generatedFrom
  "A Relationship of relationshipType_generatedFrom expresses that an SPDXElement was generated from the relatedSPDXElement. For example, a binary File might have been generated from a source File."
  {:db/ident :spdx/relationshipType_generatedFrom,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_generatedFrom expresses that an SPDXElement was generated from the relatedSPDXElement.  For example, a binary File might have been generated from a source File."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_generates
  "A Relationship of relationshipType_generates expresses that an SPDXElement generates the relatedSPDXElement. For example, a source File generates a binary File."
  {:db/ident :spdx/relationshipType_generates,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_generates expresses that an SPDXElement generates the relatedSPDXElement.  For example, a source File generates a binary File."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_hasPrerequisite
  "Is to be used when SPDXRef-A has as a prerequisite SPDXRef-B."
  {:db/ident :spdx/relationshipType_hasPrerequisite,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Is to be used when SPDXRef-A has as a prerequisite SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_metafileOf
  "To be used when SPDXRef-A is a metafile of SPDXRef-B."
  {:db/ident       :spdx/relationshipType_metafileOf,
   :rdf/type       [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "To be used when SPDXRef-A is a metafile of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_optionalComponentOf
  "To be used when SPDXRef-A is an optional component of SPDXRef-B."
  {:db/ident :spdx/relationshipType_optionalComponentOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To be used when SPDXRef-A is an optional component of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_optionalDependencyOf
  "Is to be used when SPDXRef-A is an optional dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_optionalDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is an optional dependency of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_other
  "to be used for a relationship which has not been defined in the formal SPDX specification. A description of the relationship should be included in the Relationship comments field."
  {:db/ident :spdx/relationshipType_other,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "to be used for a relationship which has not been defined in the formal SPDX specification. A description of the relationship should be included in the Relationship comments field."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_packageOf
  "To be used when SPDXRef-A is used as a package as part of SPDXRef-B."
  {:db/ident :spdx/relationshipType_packageOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To be used when SPDXRef-A is used as a package as part of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_patchApplied
  "A Relationship of relationshipType_patchApplied expresses that the SPDXElement is a 'patchfile' that was applied and produced the relatedSPDXElement. For example, a .diff File relates to a specific file where the diff was applied."
  {:db/ident :spdx/relationshipType_patchApplied,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_patchApplied expresses that the SPDXElement is a 'patchfile' that was applied and produced the relatedSPDXElement. For example, a .diff File relates to a specific file where the diff was applied."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_patchFor
  "A Relationship of relationshipType_patchFor expresses that the SPDXElement is a 'patchfile' that is designed to patch (apply modifications to) the relatedSPDXElement. For example, relationship from a .diff File to a Package it is designed to patch."
  {:db/ident :spdx/relationshipType_patchFor,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_patchFor expresses that the SPDXElement is a 'patchfile' that is designed to patch (apply modifications to) the relatedSPDXElement.  For example, relationship from a .diff File to a Package it is designed to patch. "},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_prerequisiteFor
  "Is to be used when SPDXRef-A is a prerequisite for SPDXRef-B"
  {:db/ident :spdx/relationshipType_prerequisiteFor,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Is to be used when SPDXRef-A is a prerequisite for SPDXRef-B"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_providedDependencyOf
  "Is to be used when SPDXRef-A is a to be provided dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_providedDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is a to be provided dependency of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_requirementDescriptionFor
  "Is to be used when SPDXRef-A describes, illustrates, or specifies a requirement statement for SPDXRef-B."
  {:db/ident :spdx/relationshipType_requirementDescriptionFor,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A describes, illustrates, or specifies a requirement statement for SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_runtimeDependencyOf
  "Is to be used when SPDXRef-A is a dependency required for the execution of SPDXRef-B."
  {:db/ident :spdx/relationshipType_runtimeDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is a dependency required for the execution of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_specificationFor
  "Is to be used when SPDXRef-A describes, illustrates, or defines a design specification for SPDXRef-B."
  {:db/ident :spdx/relationshipType_specificationFor,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A describes, illustrates, or defines a design specification for SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_staticLink
  "Is to be used when SPDXRef-A statically links to SPDXRef-B."
  {:db/ident :spdx/relationshipType_staticLink,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Is to be used when SPDXRef-A statically links to SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_testDependencyOf
  "Is to be used when SPDXRef-A is a test dependency of SPDXRef-B."
  {:db/ident :spdx/relationshipType_testDependencyOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is a test dependency of SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_testOf
  "Is to be used when SPDXRef-A is used for testing SPDXRef-B."
  {:db/ident :spdx/relationshipType_testOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Is to be used when SPDXRef-A is used for testing SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_testToolOf
  "Is to be used when SPDXRef-A is used as a test tool for SPDXRef-B."
  {:db/ident :spdx/relationshipType_testToolOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is used as a test tool for SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_testcaseOf
  "Is to be used when SPDXRef-A is a test case used in testing SPDXRef-B."
  {:db/ident :spdx/relationshipType_testcaseOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is to be used when SPDXRef-A is a test case used in testing SPDXRef-B."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def relationshipType_variantOf
  "A Relationship of relationshipType_variantOf expresses that an SPDXElement is a variant of the relatedSPDXElement, but it is not clear which came first. For example, if the content of two Files differs by some edit, but there is no way to tell which came first (no reliable date information), then one File is a variant of the other File."
  {:db/ident :spdx/relationshipType_variantOf,
   :rdf/type [:spdx/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Relationship of relationshipType_variantOf expresses that an SPDXElement is a variant of the relatedSPDXElement, but it is not clear which came first.  For example, if the content of two Files differs by some edit, but there is no way to tell which came first (no reliable date information), then one File is a variant of the other File."},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def releaseDate
  "This field provides a place for recording the date the package was released."
  {:db/ident :spdx/releaseDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This field provides a place for recording the date the package was released."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :spdx/date,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def reviewDate
  "The date and time at which the SpdxDocument was reviewed. This value must be in UTC and have 'Z' as its timezone indicator."
  {:db/ident :spdx/reviewDate,
   :owl/deprecated true,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The date and time at which the SpdxDocument was reviewed. This value must be in UTC and have 'Z' as its timezone indicator."}
    {:rdf/language "en",
     :rdf/value
     "Deprecated in favor of Annotation with an annotationType_review."}],
   :rdfs/domain :spdx/Review,
   :rdfs/range :xsd/dateTime,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "deprecated"}})

(def reviewed
  "This property has been deprecated since SPDX version 2.0. It has been replaced by an Annotation with an annotation type review."
  {:db/ident :spdx/reviewed,
   :owl/deprecated true,
   :rdf/type [:owl/NamedIndividual :owl/ObjectProperty],
   :rdfs/comment
   ["Reviewed"
    {:rdf/language "en",
     :rdf/value
     "This property has been deprecated since SPDX version 2.0.  It has been replaced by an Annotation with an annotation type review."}],
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :spdx/Review,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "deprecated"}})

(def reviewer
  "The name and, optionally, contact information of the person who performed the review. Values of this property must conform to the agent and tool syntax. The reviewer property is deprecated in favor of Annotation with an annotationType review."
  {:db/ident :spdx/reviewer,
   :owl/deprecated true,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The name and, optionally, contact information of the person who performed the review. Values of this property must conform to the agent and tool syntax.  The reviewer property is deprecated in favor of Annotation with an annotationType review."},
   :rdfs/domain :spdx/Review,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "deprecated"}})

(def snippetFromFile
  "File containing the SPDX element (e.g. the file contaning a snippet)."
  {:db/ident :spdx/snippetFromFile,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "File containing the SPDX element (e.g. the file contaning a snippet)."},
   :rdfs/domain :spdx/Snippet,
   :rdfs/range :spdx/File,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def snippetName
  "Identify a specific snippet in a human convenient manner."
  {:db/ident :spdx/snippetName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Identify a specific snippet in a human convenient manner."},
   :rdfs/domain :spdx/Snippet,
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :spdx/name,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def sourceInfo
  "Allows the producer(s) of the SPDX document to describe how the package was acquired and/or changed from the original source."
  {:db/ident :spdx/sourceInfo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Allows the producer(s) of the SPDX document to describe how the package was acquired and/or changed from the original source."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def spdxDocument
  "A property containing an SPDX document."
  {:db/ident       :spdx/spdxDocument,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "A property containing an SPDX document."},
   :rdfs/domain    :spdx/ExternalDocumentRef,
   :rdfs/range     :spdx/SpdxDocument,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def specVersion
  "Provide a reference number that can be used to understand how to parse and interpret the rest of the file. It will enable both future changes to the specification and to support backward compatibility. The version number consists of a major and minor version indicator. The major field will be incremented when incompatible changes between versions are made (one or more sections are created, modified or deleted). The minor field will be incremented when backwards compatible changes are made."
  {:db/ident :spdx/specVersion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Provide a reference number that can be used to understand how to parse and interpret the rest of the file. It will enable both future changes to the specification and to support backward compatibility. The version number consists of a major and minor version indicator. The major field will be incremented when incompatible changes between versions are made (one or more sections are created, modified or deleted). The minor field will be incremented when backwards compatible changes are made."},
   :rdfs/domain :spdx/SpdxDocument,
   :rdfs/range :xsd/string})

(def standardLicenseHeader
  "License author's preferred text to indicated that a file is covered by the license."
  {:db/ident :spdx/standardLicenseHeader,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "License author's preferred text to indicated that a file is covered by the license."},
   :rdfs/domain :spdx/License,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def standardLicenseHeaderHtml
  "HTML representation of the standard license header"
  {:db/ident       :spdx/standardLicenseHeaderHtml,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value
                    "HTML representation of the standard license header"},
   :rdfs/domain    :spdx/ListedLicense,
   :rdfs/range     :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def standardLicenseHeaderTemplate
  "License template which describes sections of the license header which can be varied. See License Template section of the specification for format information."
  {:db/ident :spdx/standardLicenseHeaderTemplate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "License template which describes sections of the license header which can be varied. See License Template section of the specification for format information."},
   :rdfs/domain :spdx/License,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def standardLicenseTemplate
  "License template which describes sections of the license which can be varied. See License Template section of the specification for format information."
  {:db/ident :spdx/standardLicenseTemplate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "License template which describes sections of the license which can be varied. See License Template section of the specification for format information."},
   :rdfs/domain :spdx/License,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def summary
  "Provides a short description of the package."
  {:db/ident       :spdx/summary,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value "Provides a short description of the package."},
   :rdfs/domain    :spdx/Package,
   :rdfs/range     :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def supplier
  "The name and, optionally, contact information of the person or organization who was the immediate supplier of this package to the recipient. The supplier may be different than originator when the software has been repackaged. Values of this property must conform to the agent and tool syntax."
  {:db/ident :spdx/supplier,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The name and, optionally, contact information of the person or organization who was the immediate supplier of this package to the recipient. The supplier may be different than originator when the software has been repackaged. Values of this property must conform to the agent and tool syntax."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def timestamp
  "Timestamp"
  {:db/ident     :spdx/timestamp,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Timestamp"},
   :rdfs/domain  :spdx/CrossRef,
   :rdfs/range   :xsd/dateTime})

(def url
  "URL Reference"
  {:db/ident     :spdx/url,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "URL Reference"},
   :rdfs/domain  :spdx/CrossRef,
   :rdfs/range   :xsd/anyURI})

(def validUntilDate
  "This field provides a place for recording the end of the support period for a package from the supplier."
  {:db/ident :spdx/validUntilDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This field provides a place for recording the end of the support period for a package from the supplier."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :spdx/date,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})

(def versionInfo
  "Provides an indication of the version of the package that is described by this SpdxDocument."
  {:db/ident :spdx/versionInfo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Provides an indication of the version of the package that is described by this SpdxDocument."},
   :rdfs/domain :spdx/Package,
   :rdfs/range :xsd/string,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "stable"}})