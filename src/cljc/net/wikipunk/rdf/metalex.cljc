(ns net.wikipunk.rdf.metalex
  "Most OWL axioms in this schema belong in the OWL Lite syntactic fragment. Some disjointness axioms are used. These constraints should be validated, but can sometimes be removed in carefully controlled production environments. The use of certain datatype properties may also trigger classification as OWL full by validation software. The datatype properties are only used to establish a correspondence between the meaningful components of the relative URIs conforming to the Metalex naming convention used in Metalex documents and OWL classes. They can be removed with impunity if the need arises."
  {:dcat/downloadURL "http://www.metalex.eu/metalex-cen.owl",
   :namespaces {"metalex"  "http://www.metalex.eu/metalex/2008-05-02#",
                "owl"      "http://www.w3.org/2002/07/owl#",
                "owl11"    "http://www.w3.org/2006/12/owl11#",
                "owl11xml" "http://www.w3.org/2006/12/owl11-xml#",
                "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "metalex",
   :rdfa/uri "http://www.metalex.eu/metalex-cen.owl#",
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Most OWL axioms in this schema belong in the OWL Lite syntactic fragment. Some disjointness axioms are used. These constraints should be validated, but can sometimes be removed in carefully controlled production environments. The use of certain datatype properties may also trigger classification as OWL full by validation software. The datatype properties are only used to establish a correspondence between the meaningful components of the relative URIs conforming to the Metalex naming convention used in Metalex documents and OWL classes. They can be removed with impunity if the need arises."}
     {:rdf/language "en",
      :rdf/value
      "The CEN agreement on an open XML interchange format for legal and legislative resources (Metalex) is applicable to sources of law and references to sources of law. It consists of a written specification, an XML schema, and an OWL schema defining classes and properties for use in metadata describing sources of law. This document represents the OWL schema."}},
   :xsd/anyURI "http://www.metalex.eu/metalex/2008-05-02"}
  (:refer-clojure :exclude [agent]))

(def Action
  {:db/ident :metalex/Action,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A bibliographically relevant event intended and caused by an agent."},
   :rdfs/subClassOf #{{:owl/onProperty     :metalex/agent,
                       :owl/someValuesFrom :metalex/Agent,
                       :rdf/type           :owl/Restriction} :metalex/Event}})

(def Addressee
  {:db/ident        :metalex/Addressee,
   :owl/equivalentClass {:owl/onProperty     :metalex/recipientOf,
                         :owl/someValuesFrom :metalex/LegislativeCreation,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/Recipient})

(def Agent
  {:db/ident        :metalex/Agent,
   :owl/equivalentClass {:owl/onProperty     :metalex/agentOf,
                         :owl/someValuesFrom :metalex/Action,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/EventParticipant})

(def Author
  {:db/ident        :metalex/Author,
   :owl/equivalentClass {:owl/onProperty     :metalex/agentOf,
                         :owl/someValuesFrom :metalex/BibliographicCreation,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/Agent})

(def BibliographicCitation
  {:db/ident :metalex/BibliographicCitation,
   :owl/equivalentClass #{{:owl/onProperty     :metalex/represents,
                           :owl/someValuesFrom :metalex/BibliographicIdentifier,
                           :rdf/type           :owl/Restriction}
                          {:owl/onProperty :metalex/cites,
                           :owl/someValuesFrom
                           :metalex/CitableBibliographicObject,
                           :rdf/type :owl/Restriction}},
   :owl/versionInfo
   {:rdf/language "en",
    :rdf/value
    "a representation of a bibliographic identiﬁer of a bibliographic object, with the intent of referring to that bibliographic object. Article 1, the ﬁrst article and the previous article are examples of citation, and the Minister, the President of the Republic, and the accused, are examples of references to other, interesting but non-bibliographic, things."},
   :rdf/type :owl/Class,
   :rdfs/subClassOf :metalex/BibliographicReference})

(def BibliographicCreation
  {:db/ident :metalex/BibliographicCreation,
   :owl/equivalentClass {:owl/onProperty     :metalex/result,
                         :owl/someValuesFrom :metalex/BibliographicObject,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A bibliographic creation results in a bibliographic object."},
   :rdfs/subClassOf #{:metalex/Action
                      {:owl/onProperty     :metalex/agent,
                       :owl/someValuesFrom :metalex/Author,
                       :rdf/type           :owl/Restriction}}})

(def BibliographicExpression
  {:db/ident :metalex/BibliographicExpression,
   :owl/disjointWith :metalex/BibliographicWork,
   :owl/equivalentClass #{{:owl/onProperty     :metalex/realizes,
                           :owl/someValuesFrom :metalex/BibliographicWork,
                           :rdf/type           :owl/Restriction}
                          {:owl/onProperty :metalex/embodiedBy,
                           :owl/someValuesFrom
                           :metalex/BibliographicManifestation,
                           :rdf/type :owl/Restriction}},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "a realization of one bibliographic work in the form of signs, words, sentences, paragraphs, etc. by the author of that work. Physical form aspects, as typeface or page-layout, are generally speaking excluded from the expression level. Any change in content constitutes a gives rise to a new expression. If an expression is revised or modiﬁed, the resulting expression is considered to be a new expression, no matter how minor the modiﬁcation may be."},
   :rdfs/subClassOf :metalex/CitableBibliographicObject})

(def BibliographicExpressionCreation
  {:db/ident        :metalex/BibliographicExpressionCreation,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Creation of an expression."},
   :rdfs/subClassOf :metalex/BibliographicCreation})

(def BibliographicIdentifier
  {:db/ident :metalex/BibliographicIdentifier,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A unique bibliographic identiﬁer identiﬁes a bibliographic object uniquely. The uniform resource identiﬁer can for instance be used as a unique bibliographic identiﬁer but it by default dereferences to the thing it identifies in RDF/OWL."},
   :rdfs/subClassOf :metalex/BibliographicThing})

(def BibliographicIdentifierComponent
  {:db/ident :metalex/BibliographicIdentifierComponent,
   :owl/equivalentClass {:owl/onProperty     :metalex/identifierComponentOf,
                         :owl/someValuesFrom :metalex/BibliographicIdentifier,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Component of the mURI naming convention, This is the only part of the schema where datatype properties play a role."},
   :rdfs/subClassOf :metalex/BibliographicThing})

(def BibliographicItem
  {:db/ident :metalex/BibliographicItem,
   :owl/equivalentClass {:owl/onProperty :metalex/exemplifies,
                         :owl/someValuesFrom
                         :metalex/BibliographicManifestation,
                         :rdf/type :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "exempliﬁes one manifestation of one expression of one work: a speciﬁc copy of a book on a speciﬁc shelf in a library, a ﬁle stored on a computer in a speciﬁc location, etc. Items stored on a computer can be easily copied to another location, resulting in another item, but the same manifestation. This makes adding metadata about the item to the item in principle impossible. On the Internet generally speaking only the uniform resource locator (URL) is an item-speciﬁc datum."},
   :rdfs/subClassOf :metalex/BibliographicObject})

(def BibliographicManifestation
  {:db/ident :metalex/BibliographicManifestation,
   :owl/equivalentClass #{{:owl/onProperty     :metalex/embodies,
                           :owl/someValuesFrom :metalex/BibliographicExpression,
                           :rdf/type           :owl/Restriction}
                          {:owl/onProperty     :metalex/exemplifiedBy,
                           :owl/someValuesFrom :metalex/BibliographicItem,
                           :rdf/type           :owl/Restriction}},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "embodies one expression of one bibliographic work. The boundaries between one manifestation and another are drawn on the basis of both content and physical form. When the production process involves changes in physical form the resulting product is considered a new manifestation. Thus, a speciﬁc XML representation, a PDF ﬁle (as generated by printing into PDF a speciﬁc Word ﬁle with a speciﬁc PDF distiller), a printed booklet, all represent diﬀerent manifestations of the same expression of a work."},
   :rdfs/subClassOf :metalex/BibliographicObject})

(def BibliographicModification
  {:db/ident :metalex/BibliographicModification,
   :owl/equivalentClass {:owl/onProperty     :metalex/matter,
                         :owl/someValuesFrom :metalex/BibliographicObject,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A modification operates on some existing matter to create a new bibliographic object."},
   :rdfs/subClassOf :metalex/BibliographicCreation})

(def BibliographicObject
  {:db/ident :metalex/BibliographicObject,
   :owl/equivalentClass {:owl/onProperty     :metalex/resultOf,
                         :owl/someValuesFrom :metalex/BibliographicCreation,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "a bounded representation of a body of information, designed with the intent to communicate, preserved in a form independent of a sender or receiver. The bibliographic object represents something else (a rule, definition, etc.). A bibliographic work, expression, manifestation, and item are bibliographic objects."},
   :rdfs/subClassOf #{:metalex/BibliographicThing
                      {:owl/onProperty     :metalex/represents,
                       :owl/someValuesFrom :owl/Thing,
                       :rdf/type           :owl/Restriction}}})

(def BibliographicReference
  {:db/ident :metalex/BibliographicReference,
   :owl/equivalentClass {:owl/onProperty     :metalex/refersTo,
                         :owl/someValuesFrom :metalex/Thing,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A representation of something, a bibliographic identifier, with the intent of referring to that something. The adjective bibliographic pertains to the nature of the reference itself, not its target."},
   :rdfs/subClassOf :metalex/BibliographicObject})

(def BibliographicSourceOfLaw
  {:db/ident :metalex/BibliographicSourceOfLaw,
   :owl/equivalentClass {:owl/onProperty     :metalex/resultOf,
                         :owl/someValuesFrom :metalex/LegislativeCreation,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "a bibliographic object that can be, is, was, or presumably will be referred to, by way of bibliographic citation, to back an argument claiming the existence of a legal rule in a certain legal system, or, alternatively, a bibliographic object published or realized by a competent legislator to communicate a legal rule to a certain group of addressees. Both the legislator and the user of the bibliographic source of law understand it as a medium used for communicating the existence of legal rules, including auxiliary declarations required for the proper understanding of legal rules, between legislator and user."},
   :rdfs/subClassOf :metalex/CitableBibliographicObject})

(def BibliographicThing
  {:db/ident :metalex/BibliographicThing,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "a body of information, designed with the intent to communicate, preserved in a form independent of a sender or receiver, or something pertaining to such bodies of information."},
   :rdfs/subClassOf :metalex/Thing})

(def BibliographicWork
  {:db/ident :metalex/BibliographicWork,
   :owl/equivalentClass #{{:owl/onProperty     :metalex/realizedBy,
                           :owl/someValuesFrom :metalex/BibliographicExpression,
                           :rdf/type           :owl/Restriction}
                          {:owl/onProperty :metalex/resultOf,
                           :owl/someValuesFrom
                           :metalex/BibliographicWorkCreation,
                           :rdf/type :owl/Restriction}},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "a bibliographic object, realized by one or more expressions, and created by one or more persons in a single creative process ending in a BibliographicWorkCreation event. A work has an author or authors, and is the result of a BibliographicWorkCreation event. We recognize the work through individual expressions of the work, but the work itself exists only in the commonality of content between and among the various expressions of the work."},
   :rdfs/subClassOf :metalex/CitableBibliographicObject})

(def BibliographicWorkCreation
  {:db/ident :metalex/BibliographicWorkCreation,
   :owl/equivalentClass {:owl/onProperty     :metalex/result,
                         :owl/someValuesFrom :metalex/BibliographicWork,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "It is the intention that the date at which this event happens is by definition the same date as found in the mURI for a Metalex work.  It is the date at which the self-identifying data in the document become stable and valid for bibliographic purposes. What this event is (a signing, a passing in parliament, or a publication in the state gazette) differs per jurisdiction. It is also typically the date at which auxiliary provisions (at minimum entry into force provisions) by default must enter into force."},
   :rdfs/subClassOf :metalex/BibliographicCreation})

(def BlockFragment
  {:db/ident        :metalex/BlockFragment,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/Fragment})

(def CitableBibliographicObject
  {:db/ident         :metalex/CitableBibliographicObject,
   :owl/disjointWith #{:metalex/BibliographicManifestation
                       :metalex/BibliographicItem},
   :rdf/type         :owl/Class,
   :rdfs/subClassOf  :metalex/BibliographicObject})

(def Component
  {:db/ident :metalex/Component,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Component of a folder, composite document or composite document component.",
   :rdfs/subClassOf #{:metalex/BibliographicObject
                      {:owl/onProperty     :metalex/componentOf,
                       :owl/someValuesFrom :metalex/CompoundObject,
                       :rdf/type           :owl/Restriction}}})

(def CompoundDocument
  {:db/ident        :metalex/CompoundDocument,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A document that has components.",
   :rdfs/subClassOf #{:metalex/CompoundObject :metalex/Document}})

(def CompoundObject
  {:db/ident        :metalex/CompoundObject,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A bibliographic object that has components.",
   :rdfs/subClassOf :metalex/BibliographicObject})

(def ContainerFragment
  {:db/ident        :metalex/ContainerFragment,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/Fragment})

(def Copy
  {:db/ident :metalex/Copy,
   :owl/equivalentClass #{{:owl/onProperty     :metalex/result,
                           :owl/someValuesFrom :metalex/BibliographicItem,
                           :rdf/type           :owl/Restriction}
                          {:owl/onProperty     :metalex/matter,
                           :owl/someValuesFrom :metalex/BibliographicItem,
                           :rdf/type           :owl/Restriction}},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Items can be copied. This metadatum cannot possibly be part of a Metalex XML manifestation. This class in included only for explanatory purposes."},
   :rdfs/subClassOf :metalex/BibliographicModification})

(def Country
  {:db/ident :metalex/Country,
   :owl/equivalentClass {:owl/onProperty     :metalex/countryCode,
                         :owl/someValuesFrom :xsd/string,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The standard assumes that bibliographic works of interest always originate in a clearly identifiable country. Now interpreted as country codes, but ccTLD is an option (eu, int, etc.)"},
   :rdfs/subClassOf :metalex/BibliographicIdentifierComponent})

(def Date
  {:db/ident        :metalex/Date,
   :owl/equivalentClass #{{:owl/onProperty     :metalex/xsdDate,
                           :owl/someValuesFrom :xsd/date,
                           :rdf/type           :owl/Restriction}
                          {:owl/onProperty     :metalex/dateOf,
                           :owl/someValuesFrom :metalex/Event,
                           :rdf/type           :owl/Restriction}},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/EventParticipant})

(def Document
  {:db/ident        :metalex/Document,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A document has fragments.",
   :rdfs/subClassOf :metalex/BibliographicObject})

(def Edit
  {:db/ident :metalex/Edit,
   :owl/equivalentClass
   #{{:owl/onProperty     :metalex/matter,
      :owl/someValuesFrom :metalex/BibliographicManifestation,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :metalex/result,
      :owl/someValuesFrom :metalex/BibliographicManifestation,
      :rdf/type           :owl/Restriction}},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A modification made to a Metalex XML file that does not change the embodied expression is an edit, made by an editor."},
   :rdfs/subClassOf :metalex/BibliographicModification})

(def Editor
  {:db/ident        :metalex/Editor,
   :owl/equivalentClass {:owl/onProperty     :metalex/agentOf,
                         :owl/someValuesFrom :metalex/Edit,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/Author})

(def Event
  {:db/ident :metalex/Event,
   :owl/equivalentClass {:owl/onProperty     :metalex/date,
                         :owl/someValuesFrom :metalex/Date,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A bibliographically relevant change that happens during some time period; In the context of this schema always a date because both legislative technique and publishing practice rarely require more detailed identification of time intervals."},
   :rdfs/subClassOf :metalex/Thing})

(def EventParticipant
  {:db/ident :metalex/EventParticipant,
   :owl/equivalentClass {:owl/onProperty     :metalex/participantOf,
                         :owl/someValuesFrom :metalex/Event,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "These are reified participant roles in specific types of event. For each participant role there is a corresponding property of the same name of an event of which it is the value. The event participants are inspired by those of Judith Dick."},
   :rdfs/subClassOf :metalex/Thing})

(def ExpressionCreationDate
  {:db/ident        :metalex/ExpressionCreationDate,
   :owl/equivalentClass {:owl/onProperty :metalex/dateOf,
                         :owl/someValuesFrom
                         :metalex/BibliographicExpressionCreation,
                         :rdf/type :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf #{:metalex/Date :metalex/BibliographicIdentifierComponent}})

(def ExpressionCreationExTunc
  {:db/ident :metalex/ExpressionCreationExTunc,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A fictional creation that happened before the event of which it is a fiction. This occurs in the case of annument after the fact of a modification by a constitutional court, or if errata corrige repairing minor errors are applied."},
   :rdfs/subClassOf :metalex/FictionalExpressionCreation})

(def FictionalExpressionCreation
  {:db/ident :metalex/FictionalExpressionCreation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An expression creation that did not actuially happen on the given date: it is in reality a fiction of another event that happened before (in the case of fictional expressions made by a publisher in order to forecast what future legislation after the application of expected modifications will look like) of after (in the case of ex tunc expressions) it."},
   :rdfs/subClassOf #{{:owl/onProperty     :metalex/temporalFictionOf,
                       :owl/someValuesFrom :metalex/Event,
                       :rdf/type           :owl/Restriction}
                      :metalex/BibliographicExpressionCreation}})

(def Folder
  {:db/ident         :metalex/Folder,
   :owl/disjointWith :metalex/CompoundDocument,
   :rdf/type         :owl/Class,
   :rdfs/subClassOf  :metalex/CompoundObject})

(def Fragment
  {:db/ident :metalex/Fragment,
   :owl/disjointWith :metalex/Document,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Identified fragment of a document, corresponds with the content of an XML element if it is a manifestation level fragment, has then element name and type, but these are rarely directly relevant."},
   :rdfs/subClassOf #{{:owl/onProperty     :metalex/partOf,
                       :owl/someValuesFrom :metalex/BibliographicObject,
                       :rdf/type           :owl/Restriction}
                      :metalex/BibliographicObject}})

(def InlineFragment
  {:db/ident        :metalex/InlineFragment,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/Fragment})

(def Instrument
  {:db/ident        :metalex/Instrument,
   :owl/equivalentClass {:owl/onProperty     :metalex/instrumentOf,
                         :owl/someValuesFrom :metalex/Event,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/EventParticipant})

(def Issue
  {:db/ident :metalex/Issue,
   :owl/equivalentClass {:owl/onProperty     :metalex/issueID,
                         :owl/someValuesFrom :xsd/string,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Is a modifier when date of event does not uniquely identify the object, i.e. issue number or qualifier on that date. Applies both to works and to expressions."},
   :rdfs/subClassOf :metalex/BibliographicIdentifierComponent})

(def Language
  {:db/ident :metalex/Language,
   :owl/equivalentClass {:owl/onProperty     :metalex/languageCode,
                         :owl/someValuesFrom :xsd/language,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Is an expression level metadatum, conformant to RFC 3066"},
   :rdfs/subClassOf :metalex/BibliographicIdentifierComponent})

(def LegislativeCommencement
  {:db/ident :metalex/LegislativeCommencement,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Legal entry of the BibliographicSourceOfLaw into the legal system."},
   :rdfs/subClassOf #{:metalex/LegislativeEvent
                      {:owl/onProperty     :metalex/patient,
                       :owl/someValuesFrom :metalex/BibliographicSourceOfLaw,
                       :rdf/type           :owl/Restriction}}})

(def LegislativeCompetenceGround
  {:db/ident        :metalex/LegislativeCompetenceGround,
   :owl/equivalentClass {:owl/onProperty :metalex/legislativeCompetenceGroundOf,
                         :owl/someValuesFrom :metalex/LegislativeCreation,
                         :rdf/type :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/Instrument})

(def LegislativeCreation
  {:db/ident        :metalex/LegislativeCreation,
   :owl/equivalentClass {:owl/onProperty     :metalex/result,
                         :owl/someValuesFrom :metalex/BibliographicSourceOfLaw,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf #{:metalex/LegislativeEvent :metalex/BibliographicCreation
                      {:owl/onProperty     :metalex/agent,
                       :owl/someValuesFrom :metalex/Legislator,
                       :rdf/type           :owl/Restriction}}})

(def LegislativeDelivery
  {:db/ident :metalex/LegislativeDelivery,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Official Act of delivery (promulgation, signature of the King, etc.). This is the event that creates the legislative work."},
   :rdfs/subClassOf #{:metalex/BibliographicWorkCreation
                      :metalex/LegislativeCreation}})

(def LegislativeEvent
  {:db/ident :metalex/LegislativeEvent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For purposes of standardization this list of legislative events is proposed. If procedures deviate significantly, other events may be defined as legislative events. Do note that it is very important to identify the relevant work creation and expression creation events."},
   :rdfs/subClassOf :metalex/Event})

(def LegislativeModification
  {:db/ident        :metalex/LegislativeModification,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "Modification creates a new expression of a work."},
   :rdfs/subClassOf #{:metalex/BibliographicModification
                      :metalex/LegislativeCreation
                      :metalex/BibliographicExpressionCreation}})

(def LegislativePublication
  {:db/ident :metalex/LegislativePublication,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A public act by a legislative body which publishes or gives a delegation to third body to publish a manifestation of the act with legal value in the designated piblication channel (official hournal, state gazette, etc). May coincide with delivery, but is in legislative practice often a different event."},
   :rdfs/subClassOf #{:metalex/LegislativeEvent
                      {:owl/onProperty     :metalex/patient,
                       :owl/someValuesFrom :metalex/BibliographicSourceOfLaw,
                       :rdf/type           :owl/Restriction}}})

(def LegislativeTransposition
  {:db/ident :metalex/LegislativeTransposition,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The transposition deadline is a date within EU member states before they must implement/transpose EU Directives into national Law. Added for informational purposes. Some events are (also) transposition events."},
   :rdfs/subClassOf #{:metalex/LegislativeEvent
                      {:owl/onProperty     :metalex/patient,
                       :owl/someValuesFrom :metalex/BibliographicSourceOfLaw,
                       :rdf/type           :owl/Restriction}}})

(def Legislator
  {:db/ident        :metalex/Legislator,
   :owl/equivalentClass {:owl/onProperty     :metalex/agentOf,
                         :owl/someValuesFrom :metalex/LegislativeCreation,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/Author})

(def MainComponent
  {:db/ident        :metalex/MainComponent,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Has components, but is not a component of a document.",
   :rdfs/subClassOf #{:metalex/Component
                      {:owl/allValuesFrom :metalex/Folder,
                       :owl/onProperty    :metalex/componentOf,
                       :rdf/type          :owl/Restriction}}})

(def ManifestationType
  {:db/ident :metalex/ManifestationType,
   :owl/equivalentClass {:owl/onProperty     :metalex/manifestationTypeID,
                         :owl/someValuesFrom :xsd/string,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Generally a three letter string identifying a manifestation by type. Often the file type extension, e.g. pdf, xml,  doc. NOT the mime type, as it is appended to the manifestation level mURI. pck is the extension for a package (see naming convention)."},
   :rdfs/subClassOf :metalex/BibliographicIdentifierComponent})

(def Matter
  {:db/ident        :metalex/Matter,
   :owl/equivalentClass {:owl/onProperty     :metalex/matterOf,
                         :owl/someValuesFrom :metalex/BibliographicModification,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/Instrument})

(def MetalexIdentifier
  {:db/ident        :metalex/MetalexIdentifier,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/BibliographicIdentifier})

(def Patient
  {:db/ident        :metalex/Patient,
   :owl/equivalentClass {:owl/onProperty     :metalex/patientOf,
                         :owl/someValuesFrom :metalex/Event,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/EventParticipant})

(def Recipient
  {:db/ident        :metalex/Recipient,
   :owl/equivalentClass {:owl/onProperty     :metalex/recipientOf,
                         :owl/someValuesFrom :metalex/Event,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/EventParticipant})

(def Result
  {:db/ident        :metalex/Result,
   :owl/equivalentClass {:owl/onProperty     :metalex/resultOf,
                         :owl/someValuesFrom :metalex/Event,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/EventParticipant})

(def Thing
  {:db/ident        :metalex/Thing,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A thing relevant to the Metalex standard.",
   :rdfs/subClassOf :owl/Thing})

(def Translation
  {:db/ident :metalex/Translation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A translation of an expression of a bibliographic work is an expression that shares its in force time interval, differs in nothing but language, and has been realized by way of translation of one expression into another expression. Translation is an asymmetric relation between bibliographic expressions, expressed by a metalex-owl:Translation event, which has a metalex-owl:translator, taking the initial expression as a metalex-owl:matter, and the translated document as metalex-owl:result. The translation should not be confused with language variant: while language variants can be realized concurrently by the legislator, and are equally authoritive if they are, the translation of an expression is generally speaking less authoritive than the expression it is a translation of, even if officially translated."},
   :rdfs/subClassOf #{:metalex/BibliographicModification
                      {:owl/onProperty     :metalex/matter,
                       :owl/someValuesFrom :metalex/BibliographicExpression,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :metalex/result,
                       :owl/someValuesFrom :metalex/BibliographicExpression,
                       :rdf/type           :owl/Restriction}}})

(def Translator
  {:db/ident        :metalex/Translator,
   :owl/equivalentClass {:owl/onProperty     :metalex/agentOf,
                         :owl/someValuesFrom :metalex/Translation,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :metalex/Author})

(def WorkCreationDate
  {:db/ident        :metalex/WorkCreationDate,
   :owl/equivalentClass {:owl/onProperty     :metalex/dateOf,
                         :owl/someValuesFrom :metalex/BibliographicWorkCreation,
                         :rdf/type           :owl/Restriction},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf #{:metalex/Date :metalex/BibliographicIdentifierComponent}})

(def WorkType
  {:db/ident :metalex/WorkType,
   :owl/equivalentClass {:owl/onProperty     :metalex/workTypeID,
                         :owl/someValuesFrom :xsd/string,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   "Generally a string from a controlled vocabulary identifying a work by type (statute, act, directive, etc.).",
   :rdfs/subClassOf :metalex/BibliographicIdentifierComponent})

(def agent
  {:db/ident           :metalex/agent,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :metalex/Event,
   :rdfs/range         :metalex/Action,
   :rdfs/subPropertyOf :metalex/participant})

(def agentOf
  {:db/ident           :metalex/agentOf,
   :owl/inverseOf      :metalex/agent,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/participantOf})

(def cites
  {:db/ident           :metalex/cites,
   :rdf/type           #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain        :metalex/BibliographicCitation,
   :rdfs/range         :metalex/CitableBibliographicObject,
   :rdfs/subPropertyOf :metalex/refersTo})

(def component
  {:db/ident           :metalex/component,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :metalex/CompoundObject,
   :rdfs/range         :metalex/Component,
   :rdfs/subPropertyOf :metalex/part})

(def componentOf
  {:db/ident           :metalex/componentOf,
   :owl/inverseOf      :metalex/component,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/partOf})

(def countryCode
  {:db/ident :metalex/countryCode,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Should be constrained to to or three characters from the ISO 3166-1 standard."},
   :rdfs/domain :metalex/Country,
   :rdfs/range :xsd/string})

(def date
  {:db/ident           :metalex/date,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :metalex/Event,
   :rdfs/range         :metalex/Date,
   :rdfs/subPropertyOf :metalex/participant})

(def dateOf
  {:db/ident           :metalex/dateOf,
   :owl/inverseOf      :metalex/date,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/participantOf})

(def embodiedBy
  {:db/ident           :metalex/embodiedBy,
   :owl/inverseOf      :metalex/embodies,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/recordedBy})

(def embodies
  {:db/ident           :metalex/embodies,
   :rdf/type           #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain        :metalex/BibliographicManifestation,
   :rdfs/range         :metalex/BibliographicExpression,
   :rdfs/subPropertyOf :metalex/records})

(def exemplifiedBy
  {:db/ident           :metalex/exemplifiedBy,
   :owl/inverseOf      :metalex/exemplifies,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/recordedBy})

(def exemplifies
  {:db/ident           :metalex/exemplifies,
   :rdf/type           #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain        :metalex/BibliographicItem,
   :rdfs/range         :metalex/BibliographicManifestation,
   :rdfs/subPropertyOf :metalex/records})

(def fragment
  {:db/ident           :metalex/fragment,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :metalex/Document,
   :rdfs/range         :metalex/Fragment,
   :rdfs/subPropertyOf :metalex/part})

(def fragmentOf
  {:db/ident           :metalex/fragmentOf,
   :owl/inverseOf      :metalex/fragment,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/partOf})

(def identifierComponent
  {:db/ident           :metalex/identifierComponent,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :metalex/BibliographicIdentifier,
   :rdfs/range         :metalex/BibliographicIdentifierComponent,
   :rdfs/subPropertyOf :metalex/part})

(def identifierComponentOf
  {:db/ident           :metalex/identifierComponentOf,
   :owl/inverseOf      :metalex/identifierComponent,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/partOf})

(def instrument
  {:db/ident           :metalex/instrument,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :metalex/Event,
   :rdfs/range         :metalex/Instrument,
   :rdfs/subPropertyOf :metalex/participant})

(def instrumentOf
  {:db/ident           :metalex/instrumentOf,
   :owl/inverseOf      :metalex/instrument,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/participantOf})

(def issueID
  {:db/ident    :metalex/issueID,
   :rdf/type    #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/domain :metalex/Issue,
   :rdfs/range  :xsd/string})

(def languageCode
  {:db/ident    :metalex/languageCode,
   :rdf/type    #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/domain :metalex/Language,
   :rdfs/range  :xsd/language})

(def languageVariant
  {:db/ident :metalex/languageVariant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/variant})

(def legislativeCompetenceGround
  {:db/ident :metalex/legislativeCompetenceGround,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/instrument})

(def legislativeCompetenceGroundOf
  {:db/ident           :metalex/legislativeCompetenceGroundOf,
   :owl/inverseOf      :metalex/legislativeCompetenceGround,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/instrumentOf})

(def manifestationTypeID
  {:db/ident    :metalex/manifestationTypeID,
   :rdf/type    #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/domain :metalex/ManifestationType,
   :rdfs/range  :xsd/string})

(def matter
  {:db/ident :metalex/matter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/instrument})

(def matterOf
  {:db/ident           :metalex/matterOf,
   :owl/inverseOf      :metalex/matter,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/instrumentOf})

(def part
  {:db/ident    :metalex/part,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :metalex/BibliographicThing,
   :rdfs/range  :metalex/BibliographicThing})

(def partOf
  {:db/ident      :metalex/partOf,
   :owl/inverseOf :metalex/part,
   :rdf/type      :owl/ObjectProperty})

(def participant
  {:db/ident    :metalex/participant,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :metalex/Event,
   :rdfs/range  :metalex/EventParticipant})

(def participantOf
  {:db/ident      :metalex/participantOf,
   :owl/inverseOf :metalex/participant,
   :rdf/type      :owl/ObjectProperty})

(def patient
  {:db/ident           :metalex/patient,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :metalex/Event,
   :rdfs/range         :metalex/Patient,
   :rdfs/subPropertyOf :metalex/participant})

(def patientOf
  {:db/ident           :metalex/patientOf,
   :owl/inverseOf      :metalex/patient,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/participantOf})

(def predecessor
  {:db/ident :metalex/predecessor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/variant})

(def realizedBy
  {:db/ident           :metalex/realizedBy,
   :owl/inverseOf      :metalex/realizes,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/recordedBy})

(def realizes
  {:db/ident           :metalex/realizes,
   :rdf/type           #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain        :metalex/BibliographicExpression,
   :rdfs/range         :metalex/BibliographicWork,
   :rdfs/subPropertyOf :metalex/records})

(def recipient
  {:db/ident           :metalex/recipient,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :metalex/Event,
   :rdfs/range         :metalex/Recipient,
   :rdfs/subPropertyOf :metalex/participant})

(def recipientOf
  {:db/ident           :metalex/recipientOf,
   :owl/inverseOf      :metalex/recipient,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/participantOf})

(def recordedBy
  {:db/ident      :metalex/recordedBy,
   :owl/inverseOf :metalex/records,
   :rdf/type      :owl/ObjectProperty})

(def records
  {:db/ident    :metalex/records,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :metalex/BibliographicObject,
   :rdfs/range  :metalex/BibliographicObject})

(def refersTo
  {:db/ident    :metalex/refersTo,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :metalex/BibliographicReference})

(def represents
  {:db/ident    :metalex/represents,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :metalex/BibliographicObject})

(def result
  {:db/ident           :metalex/result,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :metalex/Event,
   :rdfs/range         :metalex/Result,
   :rdfs/subPropertyOf :metalex/participant})

(def resultOf
  {:db/ident           :metalex/resultOf,
   :owl/inverseOf      :metalex/result,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/participantOf})

(def successor
  {:db/ident :metalex/successor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :metalex/variant})

(def temporalFictionOf
  {:db/ident    :metalex/temporalFictionOf,
   :rdf/type    #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :metalex/FictionalExpressionCreation,
   :rdfs/range  :metalex/Event})

(def thisEmbodies
  {:db/ident           :metalex/thisEmbodies,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :metalex/BibliographicItem,
   :rdfs/range         :metalex/BibliographicExpression,
   :rdfs/subPropertyOf :metalex/records})

(def thisRealizes
  {:db/ident           :metalex/thisRealizes,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :metalex/BibliographicItem,
   :rdfs/range         :metalex/BibliographicWork,
   :rdfs/subPropertyOf :metalex/records})

(def variant
  {:db/ident    :metalex/variant,
   :rdf/type    #{:owl/SymmetricProperty :owl/ObjectProperty},
   :rdfs/domain :metalex/BibliographicExpression,
   :rdfs/range  :metalex/BibliographicExpression})

(def workTypeID
  {:db/ident    :metalex/workTypeID,
   :rdf/type    #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/domain :metalex/WorkType,
   :rdfs/range  :xsd/string})

(def xsdDate
  {:db/ident     :metalex/xsdDate,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Range is an XML schema date."},
   :rdfs/domain  :metalex/Date,
   :rdfs/range   :xsd/date})