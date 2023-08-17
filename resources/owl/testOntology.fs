Prefix( : = <http://www.w3.org/2007/OWL/testOntology#> )
Prefix( xsd: = <http://www.w3.org/2001/XMLSchema#> )
Prefix( rdfs: = <http://www.w3.org/2000/01/rdf-schema#> )
Ontology(<http://www.w3.org/2007/OWL/testOntology>
   Annotation( rdfs:label "The OWL 2 Test Ontology" )
   Annotation( rdfs:isDefinedBy <http://www.w3.org/TR/owl2-test/> )
   
   Declaration( Class( :TestCase ) )
   
   Declaration( DataProperty( :identifier ) )
   Declaration( DataProperty( :description ) )
   Declaration( DataProperty( :creator ) )
   Declaration( ObjectProperty( :specRef ) )
   Declaration( ObjectProperty( :issue ) )
   
   Declaration( DataProperty( :inputOntology ) )
   DataPropertyRange( :inputOntology xsd:string )
   Declaration( DataProperty( :premiseOntology ) )
   Declaration( DataProperty( :conclusionOntology ) )
   Declaration( DataProperty( :nonConclusionOntology ) )
   
   SubDataPropertyOf( :premiseOntology :inputOntology )
   SubDataPropertyOf( :conclusionOntology :inputOntology )
   SubDataPropertyOf( :nonConclusionOntology :inputOntology )
   
   
   Declaration( Class( :ProfileIdentificationTest ) )
   
   SubClassOf( :ProfileIdentificationTest :TestCase )
   SubClassOf( :ProfileIdentificationTest DataMinCardinality( 1 :inputOntology ) )
   
   
   Declaration( Class( :SyntaxTranslationTest ) )
   
   SubClassOf( :SyntaxTranslationTest :TestCase )
   
   
   Declaration( Class( :ConsistencyTest ) )
   Declaration( Class( :InconsistencyTest ) )
   
   SubClassOf( :ConsistencyTest :ProfileIdentificationTest )
   SubClassOf( :InconsistencyTest :ProfileIdentificationTest )
   SubClassOf( :ConsistencyTest DataMinCardinality( 1 :premiseOntology ) )
   SubClassOf( :InconsistencyTest DataMinCardinality( 1 :premiseOntology ) )
   DisjointClasses( :ConsistencyTest :InconsistencyTest )
   
   
   Declaration( Class( :PositiveEntailmentTest ) )
   
   SubClassOf( :PositiveEntailmentTest :ConsistencyTest )
   SubClassOf( :PositiveEntailmentTest DataMinCardinality( 1 :conclusionOntology ) )
   
   
   Declaration( Class( :NegativeEntailmentTest ) )
   
   SubClassOf( :NegativeEntailmentTest :ConsistencyTest )
   SubClassOf( :NegativeEntailmentTest DataMinCardinality( 1 :nonConclusionOntology ) )
   
   
   Declaration( ObjectProperty( :status ) )
   FunctionalObjectProperty( :status )
   ObjectPropertyRange( :status ObjectOneOf( :Proposed :Approved :Rejected :Extracredit ) )
   DifferentIndividuals( :Proposed :Approved :Rejected :Extracredit )
   
   
   Declaration( ObjectProperty( :species ) )
   ObjectPropertyRange( :species ObjectOneOf( :DL :FULL ) )
   DifferentIndividuals( :DL :FULL )
   SubClassOf( ObjectHasValue( :species :DL ) ObjectHasValue( :species :FULL ) )
   
   
   Declaration( ObjectProperty( :profile ) )
   ObjectPropertyRange( :profile ObjectOneOf( :EL :QL :RL ) )
   DifferentIndividuals( :EL :QL :RL )
   
   
   SubClassOf(
       ObjectSomeValuesFrom( :profile ObjectOneOf( :EL :QL :RL ) )
       ObjectHasValue( :species :DL )
   )
   
   Declaration( Class( :Syntax ) )
   ClassAssertion( :Syntax :RDFXML )
   ClassAssertion( :Syntax :FUNCTIONAL )
   ClassAssertion( :Syntax :OWLXML )
   DifferentIndividuals( :RDFXML :FUNCTIONAL :OWLXML )
   
   Declaration( ObjectProperty( :normativeSyntax ) )
   ObjectPropertyRange( :normativeSyntax :Syntax )
   
   SubClassOf( :TestCase ObjectMinCardinality( 1 :normativeSyntax ) )
   
   Declaration( ObjectProperty( :semantics ) )
   Declaration( ObjectProperty( :alternativeSemanticsTest ) )
   
   ObjectPropertyRange( :semantics ObjectOneOf( :DIRECT :RDF-BASED ) )
   DifferentIndividuals( :DIRECT :RDF-BASED )
   FunctionalObjectProperty( :alternativeSemanticsTest )
   SymmetricObjectProperty( :alternativeSemanticsTest )
   
   SubClassOf(
     ObjectIntersectionOf( :TestCase ObjectComplementOf( ObjectHasValue( :semantics :RDF-BASED ) ) )
     ObjectSomeValuesFrom( :alternativeSemanticsTest ObjectHasValue( :semantics :RDF-BASED ) )
   )
   
   SubClassOf(
     ObjectIntersectionOf( :TestCase ObjectComplementOf( ObjectHasValue( :semantics :DIRECT ) ) )
     ObjectSomeValuesFrom( :alternativeSemanticsTest ObjectHasValue( :semantics :DIRECT ) )
   )
   
   
   Declaration( DataProperty( :fsInputOntology ) )
   SubDataPropertyOf( :fsInputOntology :inputOntology )
   
   Declaration( DataProperty( :owlXmlInputOntology ) )
   SubDataPropertyOf( :owlXmlInputOntology :inputOntology )
   
   Declaration( DataProperty( :rdfXmlInputOntology ) )
   SubDataPropertyOf( :rdfXmlInputOntology :inputOntology )
   
   DisjointDataProperties( :fsInputOntology :owlXmlInputOntology :rdfXmlInputOntology )
   
   
   Declaration( ObjectProperty( :importedOntology ) )
   Declaration( ObjectProperty( :importedOntologyIRI ) )
   
   SubClassOf(
       ObjectSomeValuesFrom( ObjectInverseOf(:importedOntology) :TestCase )
       ObjectIntersectionOf(
           ObjectExactCardinality( 1 :importedOntologyIRI )
           DataMinCardinality( 1 :inputOntology )
           ObjectMinCardinality( 1 :normativeSyntax )
       )
   )
   
   
   Declaration( DataProperty( :fsPremiseOntology ) )
   Declaration( DataProperty( :fsConclusionOntology ) )
   Declaration( DataProperty( :fsNonConclusionOntology ) )
   SubDataPropertyOf( :fsPremiseOntology :premiseOntology )
   SubDataPropertyOf( :fsPremiseOntology :fsInputOntology )
   SubDataPropertyOf( :fsConclusionOntology :conclusionOntology )
   SubDataPropertyOf( :fsConclusionOntology :fsInputOntology )
   SubDataPropertyOf( :fsNonConclusionOntology :nonConclusionOntology )
   SubDataPropertyOf( :fsNonConclusionOntology :fsInputOntology )
   
   Declaration( DataProperty( :owlXmlPremiseOntology ) )
   Declaration( DataProperty( :owlXmlConclusionOntology ) )
   Declaration( DataProperty( :owlXmlNonConclusionOntology ) )
   SubDataPropertyOf( :owlXmlPremiseOntology :premiseOntology )
   SubDataPropertyOf( :owlXmlPremiseOntology :owlXmlInputOntology )
   SubDataPropertyOf( :owlXmlConclusionOntology :conclusionOntology )
   SubDataPropertyOf( :owlXmlConclusionOntology :owlXmlInputOntology )
   SubDataPropertyOf( :owlXmlNonConclusionOntology :nonConclusionOntology )
   SubDataPropertyOf( :owlXmlNonConclusionOntology :owlXmlInputOntology )
   
   Declaration( DataProperty( :rdfXmlPremiseOntology ) )
   Declaration( DataProperty( :rdfXmlConclusionOntology ) )
   Declaration( DataProperty( :rdfXmlNonConclusionOntology ) )
   SubDataPropertyOf( :rdfXmlPremiseOntology :premiseOntology )
   SubDataPropertyOf( :rdfXmlPremiseOntology :rdfXmlInputOntology )
   SubDataPropertyOf( :rdfXmlConclusionOntology :conclusionOntology )
   SubDataPropertyOf( :rdfXmlConclusionOntology :rdfXmlInputOntology )
   SubDataPropertyOf( :rdfXmlNonConclusionOntology :nonConclusionOntology )
   SubDataPropertyOf( :rdfXmlNonConclusionOntology :rdfXmlInputOntology )
)

