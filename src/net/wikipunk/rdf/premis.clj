(ns net.wikipunk.rdf.premis
  "Ontology for PREMIS 3, the international standard for metadata to support the preservation of digital objects and ensure their long-term usability."
  {:dcterms/modified #inst "2018-10-12T00:00:00.000-04:00",
   :owl/imports "http://www.w3.org/ns/prov-o-20130430",
   :owl/priorVersion "https://id.loc.gov/ontologies/premis-1-0-0",
   :owl/versionIRI "https://id.loc.gov/ontologies/premis-3-0-0",
   :owl/versionInfo "3.0.0",
   :rdf/ns-prefix-map {"premis" "http://www.loc.gov/premis/rdf/v3/"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.loc.gov/premis/rdf/v3/",
   :rdfa/prefix "premis",
   :rdfa/uri "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Ontology for PREMIS 3, the international standard\r\n      for metadata to support the preservation of digital objects and ensure their\r\n      long-term usability."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PREMIS 3 Ontology"},
   :rdfs/seeAlso
   ["https://github.com/PREMIS-OWL-Revision-Team/revise-premis-owl/"
    "http://www.loc.gov/standards/premis/"]}
  (:refer-clojure :exclude [key]))

(def Action
  "Operation type to perform on an Object. Effectively performing this action may produce an Event."
  {:db/ident :premis/Action,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Operation type to perform on an Object. Effectively performing this action may produce an Event."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Action"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/actionsGranted"]})

(def Agent
  "Actor (human, machine, or software) associated with one or more Event and/or Rights statement associated with a digital object."
  {:db/ident :premis/Agent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Actor (human, machine, or software) associated with one or more Event and/or Rights\r\n      statement associated with a digital object."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Agent"},
   :rdfs/subClassOf [:foaf/Agent :prov/Agent]})

(def Bitstream
  "Contiguous or non-contiguous data within a file that has meaningful properties for preservation purposes."
  {:db/ident :premis/Bitstream,
   :owl/disjointWith
   [:premis/Representation :premis/IntellectualEntity :premis/File],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Contiguous or non-contiguous data within a file that has meaningful properties for\r\n      preservation purposes."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bitstream"},
   :rdfs/subClassOf :premis/Object})

(def Copyright
  "Copyright law."
  {:db/ident :premis/Copyright,
   :owl/disjointWith
   [:premis/Statute :premis/License :premis/InstitutionalPolicy],
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Copyright law."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Copyright"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/copyrightStatus"],
   :rdfs/subClassOf :premis/RightsBasis})

(def Dependency
  "Relationship where one Object requires another Object to support its function, delivery, or the coherence of its content."
  {:db/ident :premis/Dependency,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relationship where one Object requires another Object to support its function, delivery, or\r\n      the coherence of its content."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dependency"}})

(def EnvironmentCharacteristic
  "An assessment of the extent to which the described environment supports its purpose."
  {:db/ident :premis/EnvironmentCharacteristic,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An assessment of the extent to which the described environment supports its\r\n      purpose."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Environment characteristic"},
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentCharacteristic"]})

(def Event
  "Action performed within or outside the repository that affects its capability to preserve Objects over the long term."
  {:db/ident :premis/Event,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Action performed within or outside the repository that affects its capability to preserve Objects over the long term."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType"],
   :rdfs/subClassOf :prov/Activity})

(def File
  "Named and ordered sequence of bytes that is known to an operating system."
  {:db/ident :premis/File,
   :owl/disjointWith
   [:premis/Representation :premis/IntellectualEntity :premis/Bitstream],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Named and ordered sequence of bytes that is known to an operating system."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "File"},
   :rdfs/subClassOf :premis/Object})

(def Fixity
  "Information used to verify whether an object has been altered in an undocumented or unauthorized way."
  {:db/ident :premis/Fixity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Information used to verify whether an object has been altered in an undocumented or\r\n      unauthorized way."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fixity"},
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/cryptographicHashFunctions"]})

(def HardwareAgent
  "Hardware agent"
  {:db/ident         :premis/HardwareAgent,
   :owl/disjointWith [:premis/SoftwareAgent
                      :premis/Person
                      :premis/Organization],
   :owl/sameAs       "http://id.loc.gov/vocabulary/preservation/agentType/har",
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Hardware agent"},
   :rdfs/subClassOf  :premis/Agent})

(def Identifier
  "An unambiguous reference to the PREMIS entity within the preservation repository."
  {:db/ident :premis/Identifier,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An unambiguous reference to the PREMIS entity within the preservation\r\n      repository."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identifier"}})

(def Inhibitor
  "Feature of a Digital Object intended to inhibit access, copying, dissemination, or migration. Common Inhibitors are encryption and password protection."
  {:db/ident :premis/Inhibitor,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Feature of a Digital Object intended to inhibit access, copying, dissemination, or\r\n      migration. Common Inhibitors are encryption and password protection."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inhibitor"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/inhibitorType"]})

(def InstitutionalPolicy
  "A policy decision made by an organization."
  {:db/ident         :premis/InstitutionalPolicy,
   :owl/disjointWith [:premis/Statute :premis/License :premis/Copyright],
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A policy decision made by an organization."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Institutional policy"},
   :rdfs/subClassOf  :premis/RightsBasis})

(def IntellectualEntity
  "A set of content that is considered a single intellectual unit for purposes of management and description: for example, a particular book, map, photograph, database, or piece of hardware or software. An Intellectual Entity can include other Intellectual Entities; for example, a web site can include a web page; a web page can include an image. An Intellectual Entity may have one or more digital representations. An Intellectual Entity may also describe an environment, defined as technology supporting a digital object in some way (e.g. by rendering or executing it). Environments can consist of software, hardware, or a combination of both."
  {:db/ident :premis/IntellectualEntity,
   :owl/disjointWith [:premis/Representation :premis/File :premis/Bitstream],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A set of content that is considered a single intellectual unit for purposes of management and\r\n      description: for example, a particular book, map, photograph, database, or piece of hardware or\r\n      software. An Intellectual Entity can include other Intellectual Entities; for example, a web site can\r\n      include a web page; a web page can include an image. An Intellectual Entity may have one or more digital\r\n      representations. An Intellectual Entity may also describe an environment, defined as technology\r\n      supporting a digital object in some way (e.g. by rendering or executing it). Environments can consist of\r\n      software, hardware, or a combination of both."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Intellectual entity"},
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType"],
   :rdfs/subClassOf :premis/Object})

(def License
  "A license agreement or other legal document that grants rights."
  {:db/ident :premis/License,
   :owl/disjointWith
   [:premis/Statute :premis/InstitutionalPolicy :premis/Copyright],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A license agreement or other legal document that grants rights."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "License"},
   :rdfs/subClassOf :premis/RightsBasis})

(def ObjectClass
  "Discrete unit of information subject to digital preservation. Subclasses of Object are Intellectual Entity, Representation, File and Bitstream."
  {:db/ident :premis/Object,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Discrete unit of information subject to digital preservation. Subclasses of Object are\r\n      Intellectual Entity, Representation, File and Bitstream."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Object"},
   :rdfs/subClassOf :prov/Entity})

(def Organization
  "Organization"
  {:db/ident         :premis/Organization,
   :owl/disjointWith [:premis/SoftwareAgent
                      :premis/Person
                      :premis/HardwareAgent],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Organization"},
   :rdfs/subClassOf  [:prov/Organization :foaf/Organization :premis/Agent]})

(def OutcomeStatus
  "Overall result of the Event in terms of success, partial success, or failure."
  {:db/ident :premis/OutcomeStatus,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Overall result of the Event in terms of success, partial success, or failure."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Outcome status"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventOutcome"]})

(def Person
  "Person"
  {:db/ident         :premis/Person,
   :owl/disjointWith [:premis/SoftwareAgent
                      :premis/Organization
                      :premis/HardwareAgent],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Person"},
   :rdfs/subClassOf  [:foaf/Person :prov/Person :premis/Agent]})

(def PreservationPolicy
  "Information indicating the decision or policy on the set of preservation functions to be applied to an object and the context in which the decision or policy was made. Note that in addition to subclasses declared at presLevType, SignificantProperties is also a subclass of PreservationPolicy. Implementers may also wish to create locally-defined subclasses."
  {:db/ident :premis/PreservationPolicy,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Information indicating the decision or policy on the set of preservation functions to be\r\n      applied to an object and the context in which the decision or policy was made. Note that in addition to\r\n      subclasses declared at presLevType, SignificantProperties is also a subclass of PreservationPolicy.\r\n      Implementers may also wish to create locally-defined subclasses."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preservation policy"},
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/preservationLevelRole"],
   :rdfs/subClassOf :dcterms/Policy})

(def Representation
  "Digital or physical Object instantiating or embodying an Intellectual Entity. A digital representation is the set of stored digital files and structural metadata needed to provide a complete and reasonable rendition of the Intellectual Entity. A physical representation is an item such as a manuscript, video cassette, or printed document."
  {:db/ident :premis/Representation,
   :owl/disjointWith
   [:premis/IntellectualEntity :premis/File :premis/Bitstream],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Digital or physical Object instantiating or embodying an Intellectual Entity. A digital\r\n      representation is the set of stored digital files and structural metadata needed to provide a complete\r\n      and reasonable rendition of the Intellectual Entity. A physical representation is an item such as a\r\n      manuscript, video cassette, or printed document."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Representation"},
   :rdfs/subClassOf :premis/Object})

(def RightsBasis
  "Designation of the basis for the right or permission governing the Object."
  {:db/ident :premis/RightsBasis,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Designation of the basis for the right or permission governing the Object."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights basis"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/rightsBasis"]})

(def RightsStatus
  "Information about how a RightsBasis applies to a particular object."
  {:db/ident :premis/RightsStatus,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Information about how a RightsBasis applies to a particular object."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights status"}})

(def Rule
  "Statement about the Actions an Agent is permitted to undertake or prohibited from undertaking with respect to an Object."
  {:db/ident :premis/Rule,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Statement about the Actions an Agent is permitted to undertake or prohibited from\r\n      undertaking with respect to an Object."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rule"}})

(def Signature
  "Mathematical technique used to validate the authenticity and integrity of a message, software or digital document."
  {:db/ident :premis/Signature,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Mathematical technique used to validate the authenticity and integrity of a message,\r\n      software or digital document."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Signature"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/signatureMethod"]})

(def SignatureEncoding
  "Encoding used for the signature value and key information."
  {:db/ident :premis/SignatureEncoding,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Encoding used for the signature value and key information."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Signature encoding"},
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/signatureEncoding"]})

(def SignificantProperties
  "Characteristics of a particular object subjectively determined to be important to maintain through preservation actions."
  {:db/ident :premis/SignificantProperties,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Characteristics of a particular object subjectively determined to be important to maintain\r\n      through preservation actions."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Significant properties"},
   :rdfs/subClassOf :premis/PreservationPolicy})

(def SoftwareAgent
  "Software agent"
  {:db/ident         :premis/SoftwareAgent,
   :owl/disjointWith [:premis/Person
                      :premis/Organization
                      :premis/HardwareAgent],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Software agent"},
   :rdfs/subClassOf  [:prov/SoftwareAgent :premis/Agent]})

(def Statute
  "A law that grants or revokes rights, such as laws governing privacy or orphan works."
  {:db/ident :premis/Statute,
   :owl/disjointWith
   [:premis/InstitutionalPolicy :premis/License :premis/Copyright],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A law that grants or revokes rights, such as laws governing privacy or orphan\r\n      works."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Statute"},
   :rdfs/subClassOf :premis/RightsBasis})

(def StorageLocation
  "Information needed to retrieve a physical item from its physical storage location or a file from the storage system, or to access a bitstream within a file."
  {:db/ident :premis/StorageLocation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Information needed to retrieve a physical item from its physical storage location or a file\r\n      from the storage system, or to access a bitstream within a file."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage location"},
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/contentLocationType"]})

(def StorageMedium
  "The physical medium on which the Object is stored (e.g., magnetic tape, hard disk, CD-ROM, DVD)."
  {:db/ident :premis/StorageMedium,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The physical medium on which the Object is stored (e.g., magnetic tape, hard disk, CD-ROM,\r\n      DVD)."},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage medium"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/storageMedium"]})

(def act
  "act"
  {:db/ident         :premis/act,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/Rule,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "act"},
   :rdfs/range       :premis/Action})

(def allows
  "allows"
  {:db/ident         :premis/allows,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/RightsBasis,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "allows"},
   :rdfs/range       :premis/Rule})

(def basis
  "Links from a RightsStatus to the RightsBasis instance that supports or documents it."
  {:db/ident :premis/basis,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links from a RightsStatus to the RightsBasis instance that supports or documents\r\n      it."},
   :rdfs/domain :premis/RightsStatus,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has basis"},
   :rdfs/range :premis/RightsBasis})

(def characteristic
  "has characteristic"
  {:db/ident         :premis/characteristic,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/Dependency,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has characteristic"},
   :rdfs/range       :premis/EnvironmentCharacteristic})

(def citation
  "has citation"
  {:db/ident         :premis/citation,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :premis/RightsBasis,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has citation"},
   :rdfs/range       :rdfs/Literal})

(def compositionLevel
  "has composition level"
  {:db/ident         :premis/compositionLevel,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :premis/File,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has composition level"},
   :rdfs/range       :xsd/nonNegativeInteger})

(def dependency
  "has dependency"
  {:db/ident         :premis/dependency,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/Object,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has dependency"},
   :rdfs/range       :premis/Dependency})

(def determinationDate
  "has determination date"
  {:db/ident           :premis/determinationDate,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :premis/RightsStatus,
   :rdfs/isDefinedBy   "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has determination date"},
   :rdfs/range         :xsd/date,
   :rdfs/subPropertyOf :dcterms/date})

(def documentation
  "has documentation"
  {:db/ident         :premis/documentation,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has documentation"},
   :rdfs/range       :rdfs/Resource})

(def encoding
  "has encoding"
  {:db/ident         :premis/encoding,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/Signature,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has encoding"},
   :rdfs/range       :premis/SignatureEncoding})

(def endDate
  "end date"
  {:db/ident           :premis/endDate,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:premis/RightsStatus :premis/Rule],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "end date"},
   :rdfs/subPropertyOf :dcterms/date})

(def fixity
  "has fixity"
  {:db/ident         :premis/fixity,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      {:owl/unionOf [:premis/Bitstream :premis/File],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has fixity"},
   :rdfs/range       :premis/Fixity})

(def governs
  "governs"
  {:db/ident         :premis/governs,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/RightsBasis,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "governs"},
   :rdfs/range       :premis/Object})

(def identifier
  "has identifier"
  {:db/ident         :premis/identifier,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has identifier"},
   :rdfs/range       :premis/Identifier})

(def inhibitedBy
  "inhibited by"
  {:db/ident         :premis/inhibitedBy,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      {:owl/unionOf [:premis/Bitstream :premis/File],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "inhibited by"},
   :rdfs/range       :premis/Inhibitor})

(def inhibits
  "inhibits"
  {:db/ident         :premis/inhibits,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/Inhibitor,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "inhibits"},
   :rdfs/range       :premis/Action})

(def jurisdiction
  "has jurisdiction"
  {:db/ident         :premis/jurisdiction,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/RightsBasis,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has jurisdiction"},
   :rdfs/range       :rdfs/Resource})

(def key
  "has key"
  {:db/ident         :premis/key,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      {:owl/unionOf [:premis/Inhibitor :premis/Signature],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has key"},
   :rdfs/range       :rdfs/Literal})

(def medium
  "has medium"
  {:db/ident         :premis/medium,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/StorageLocation,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has medium"},
   :rdfs/range       :premis/StorageMedium})

(def note
  "has note"
  {:db/ident           :premis/note,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has note"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/description})

(def originalName
  "has original name"
  {:db/ident         :premis/originalName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      {:owl/unionOf [:premis/File
                                    :premis/IntellectualEntity
                                    :premis/Representation],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has original name"},
   :rdfs/range       :rdfs/Literal})

(def outcome
  "has outcome"
  {:db/ident         :premis/outcome,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/Event,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has outcome"},
   :rdfs/range       :premis/OutcomeStatus})

(def outcomeNote
  "has outcome note"
  {:db/ident           :premis/outcomeNote,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :premis/Event,
   :rdfs/isDefinedBy   "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has outcome note"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :premis/note})

(def policy
  "has policy"
  {:db/ident :premis/policy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :premis/Object,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has policy"},
   :rdfs/range :premis/PreservationPolicy,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/preservationLevelRole"]})

(def prohibits
  "prohibits"
  {:db/ident         :premis/prohibits,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/RightsBasis,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "prohibits"},
   :rdfs/range       :premis/Rule})

(def purpose
  "has purpose"
  {:db/ident         :premis/purpose,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :premis/Dependency,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has purpose"},
   :rdfs/range       :premis/Action})

(def rationale
  "has rationale"
  {:db/ident           :premis/rationale,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has rationale"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :premis/note})

(def relationship
  "has relationship"
  {:db/ident :premis/relationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:premis/Agent :premis/Object],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has relationship"},
   :rdfs/range :premis/Object,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/relationshipSubType"]})

(def restriction
  "has restriction"
  {:db/ident         :premis/restriction,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :premis/Rule,
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has restriction"},
   :rdfs/range       :rdfs/Literal})

(def rightsStatus
  "has rights status"
  {:db/ident           :premis/rightsStatus,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :premis/Object,
   :rdfs/isDefinedBy   "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has rights status"},
   :rdfs/range         :premis/RightsStatus,
   :rdfs/subPropertyOf :dc11/rights})

(def signature
  "has signature"
  {:db/ident         :premis/signature,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      {:owl/unionOf [:premis/Bitstream :premis/File],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has signature"},
   :rdfs/range       :premis/Signature})

(def size
  "has size"
  {:db/ident :premis/size,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:premis/Bitstream :premis/File],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has size"},
   :rdfs/range :xsd/nonNegativeInteger,
   :skos/narrowMatch
   "http://www.ebu.ch/metadata/ontologies/ebucore/ebucore#fileSize"})

(def startDate
  "start date"
  {:db/ident           :premis/startDate,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        {:owl/unionOf [:premis/RightsStatus :premis/Rule],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "start date"},
   :rdfs/subPropertyOf :dcterms/date})

(def storedAt
  "stored at"
  {:db/ident         :premis/storedAt,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      {:owl/unionOf [:premis/Bitstream
                                    :premis/File
                                    :premis/Representation],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "stored at"},
   :rdfs/range       :premis/StorageLocation})

(def terms
  "has terms"
  {:db/ident           :premis/terms,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :premis/RightsBasis,
   :rdfs/isDefinedBy   "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has terms"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :premis/note})

(def validationRules
  "has validation rules"
  {:db/ident           :premis/validationRules,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :premis/Signature,
   :rdfs/isDefinedBy   "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has validation rules"},
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :premis/note})

(def version
  "has version"
  {:db/ident         :premis/version,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      {:owl/unionOf [:dcterms/FileFormat
                                    :premis/HardwareAgent
                                    :premis/IntellectualEntity
                                    :premis/SoftwareAgent],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.loc.gov/premis/rdf/v3/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has version"},
   :rdfs/range       :rdfs/Literal})