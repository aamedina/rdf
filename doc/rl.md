# OWL RL

## https://www.w3.org/TR/owl2-primer/#OWL_2_RL

The OWL 2 RL profile is aimed at applications that require scalable
reasoning without sacrificing too much expressive power. It is
designed to accommodate both OWL 2 applications that can trade the
full expressivity of the language for efficiency, and RDF(S)
applications that need some added expressivity from OWL 2. This is
achieved by defining a syntactic subset of OWL 2 which is amenable to
implementation using rule-based technologies, and presenting a partial
axiomatization of the OWL 2 semantics in the form of first-order
implications that can be used as the basis for such an implementation.

Suitable rule-based implementations of OWL 2 RL under RDF-Based
Semantics can be used with arbitrary RDF graphs. As a consequence, OWL
2 RL is ideal for enriching RDF data, especially when the data must be
massaged by additional rules. From a modeling perspective, however,
this pushes us farther away from working with class expressions: OWL 2
RL ensures we cannot (easily) talk about unknown individuals in our
superclass expressions (this restriction follows from the nature of
rules). Compared with OWL 2 QL, OWL 2 RL works better when you have
already massaged your data into RDF and are working with it as RDF.

Among other constructs, OWL 2 RL disallows statements where the
existence of an individual enforces the existence of another
individual: for instance, the statement “every person has a parent” is
not expressible in OWL RL.

OWL 2 RL restricts class axioms asymmetrically, that is, you can use
constructs as the subclass that you cannot use as the superclass.

The RL acronym reflects the fact that reasoning in this profile can be
implemented using a standard Rule Language [DLP]. 

## https://www.w3.org/TR/rdfa-core/#s_vocab_entailment

### 10.1.1 RDFa Vocabulary Entailment

For the purpose of vocabulary processing, RDFa used a very restricted
subset of the OWL vocabulary and is based on the RDF-Based Semantics
of OWL [OWL2-RDF-BASED-SEMANTICS]. The RDFa Vocabulary Entailment uses
the following terms:

* rdf:type
* rdfs:subClassOf
* rdfs:subPropertyOf
* owl:equivalentClass
* owl:equivalentProperty

#### Note

RDFa Vocabulary Entailment considers only the entailment on
individuals (i.e., not on the relationships that can be deduced on the
properties or the classes themselves.)

#### Note

While the formal definition of the RDFa Entailment refers to the
general OWL 2 Semantics, practical implementations may rely on a
subset of the OWL 2 RL Profile’s entailment expressed in rules
(section 4.3 of [OWL2-PROFILES]). The relevant rules are, using the
rule identifications in section 4.3 of [OWL2-PROFILES]): prp-spo1,
prp-eqp1, prp-eqp2, cax-sco, cax-eqc1, and cax-eqc2. 
