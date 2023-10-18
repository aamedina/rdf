(ns net.wikipunk.rdf.oboInOwl
  {:namespaces {"oban"       "http://purl.org/obo/oban/",
                "oboContent" "http://purl.org/obo/owl/",
                "oboInOwl"   "http://purl.org/obo/owl/",
                "owl"        "http://www.w3.org/2002/07/owl#",
                "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
                "xsd"        "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "oboInOwl",
   :rdfa/uri "http://www.geneontology.org/formats/oboInOwl#",
   :rdfs/comment
   #{"OBO Format metamodel. This meta-ontology is self-describing. OBO metamodel properties are described using OBO metamodel properties"
     "\n          This is an OWL translation of an ontology whose native representational form is .obo. The translation was performed using the oboInOwl xslt library. For details, see http://www.berkeleybop.org/obo-conv.cgi\n        "},
   :rdfs/label "",
   :xsd/anyURI "http://www.geneontology.org/formats/oboInOwl"})

(def DbXref
  {:db/ident   :oboInOwl/DbXref,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "database_cross_reference"}})

(def Definition
  {:db/ident :oboInOwl/Definition,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI {:xsd/anyURI
                      "http://www.obofoundry.org/wiki/index.php/Definitions"},
    :rdf/type :oboInOwl/DbXref,
    :rdfs/label "URL:http://www.obofoundry.org/wiki/index.php/Definitions"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_cjm"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:cjm"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "The textual definition of the current term. There must be zero or one instances of this tag per term description"}},
   :rdf/type :owl/Class,
   :rdfs/comment
   "we are forced to use the n-ary relation pattern in OWL1.0. For OWL2 we may make this a direct axiom between a class and the string",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "definition"}})

(def ObsoleteClass
  {:db/ident   :oboInOwl/ObsoleteClass,
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_cjm"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:cjm"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "pseudo-class. in the oboInOwl translation, all obsolete classes are subclasses of this class. Note that this is not a metaclass"}},
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "obsolete_class"}})

(def ObsoleteProperty
  {:db/ident     :oboInOwl/ObsoleteProperty,
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_cjm"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:cjm"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "pseudo-property. in the oboInOwl translation, all obsolete relations are subProperties of this class"}},
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Note that this is not a metaclass",
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "obsolete_property"}})

(def Subset
  {:db/ident :oboInOwl/Subset,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI {:xsd/anyURI
                      "http://purl.org/obo/owl/oboFormat#oboFormat_subsetdef"},
    :rdf/type        :oboInOwl/DbXref,
    :rdfs/label      "oboFormat:subsetdef"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_cjm"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:cjm"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "A grouping of terms from an ontology or ontologies. Note that this is not a metaclass - classes are linked to subsets via oboInOwl:inSubset"}},
   :oboInOwl/hasNarrowSynonym #{{:rdf/type   :oboInOwl/Synonym,
                                 :rdfs/label {:rdf/language "en",
                                              :rdf/value    "slim"}}
                                {:rdf/type   :oboInOwl/Synonym,
                                 :rdfs/label {:rdf/language "en",
                                              :rdf/value    "GO-slim"}}},
   :oboInOwl/hasRelatedSynonym #{{:rdf/type   :oboInOwl/Synonym,
                                  :rdfs/label {:rdf/language "en",
                                               :rdf/value    "partition"}}
                                 {:rdf/type   :oboInOwl/Synonym,
                                  :rdfs/label {:rdf/language "en",
                                               :rdf/value    "view"}}},
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subset"}})

(def SubsetProperty
  {:db/ident   :oboInOwl/SubsetProperty,
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_GOC"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:GOC"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "This annotation property groups all subsets declared in the ontology"}},
   :rdf/type   :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subset_property"}})

(def Synonym
  {:db/ident :oboInOwl/Synonym,
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_cjm"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:cjm"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "An instance of synonym usage. synonym instances are linked to classes via oboInOwl:has*Synonym properties"}},
   :rdf/type :owl/Class,
   :rdfs/comment
   "we are forced to use the n-ary relation pattern in OWL1.0. For OWL2 we may make this a direct axiom between a class and the string",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synonym"}})

(def SynonymType
  {:db/ident   :oboInOwl/SynonymType,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synonym_type"}})

(def SynonymTypeProperty
  {:db/ident   :oboInOwl/SynonymTypeProperty,
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_GOC"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:GOC"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "This annotation property groups all synonym types declared in the ontology"}},
   :rdf/type   :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synonym_type_property"}})

(def consider
  {:db/ident :oboInOwl/consider,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI {:xsd/anyURI
                      "http://purl.org/obo/owl/oboFormat#oboFormat_consider"},
    :rdf/type        :oboInOwl/DbXref,
    :rdfs/label      "oboFormat:consider"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_cjm"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:cjm"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "Gives a term which may be an appropriate substitute for an obsolete term, but needs to be looked at carefully by a human expert before the replacement is done"}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "consider"}})

(def hasAlternativeId
  {:db/ident           :oboInOwl/hasAlternativeId,
   :oboInOwl/hasDbXref {:oboInOwl/hasURI
                        {:xsd/anyURI
                         "http://purl.org/obo/owl/oboFormat#oboFormat_alt_id"},
                        :rdf/type :oboInOwl/DbXref,
                        :rdfs/label "oboFormat:alt_id"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_cjm"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:cjm"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "An alternative identifier for this class; should follow ID syntax. These can result from class merges"}},
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has_alternative_id"}})

(def hasBroadSynonym
  {:db/ident :oboInOwl/hasBroadSynonym,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI
    {:xsd/anyURI "http://purl.org/obo/owl/oboFormat#oboFormat_broad_synonym"},
    :rdf/type :oboInOwl/DbXref,
    :rdfs/label "oboFormat:broad_synonym"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_GOC"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:GOC"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "An alias in which the alias is broader than the primary class name. Example: cell division is a broad synonym of cytokinesis"}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has_broad_synonym"},
   :rdfs/subPropertyOf :oboInOwl/hasSynonym})

(def hasDate
  {:db/ident           :oboInOwl/hasDate,
   :oboInOwl/hasDbXref {:oboInOwl/hasURI
                        {:xsd/anyURI
                         "http://purl.org/obo/owl/oboFormat#oboFormat_date"},
                        :rdf/type :oboInOwl/DbXref,
                        :rdfs/label "oboFormat:date"},
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has_date"}})

(def hasDbXref
  {:db/ident           :oboInOwl/hasDbXref,
   :oboInOwl/hasDbXref {:oboInOwl/hasURI
                        {:xsd/anyURI
                         "http://purl.org/obo/owl/oboFormat#oboFormat_xref"},
                        :rdf/type :oboInOwl/DbXref,
                        :rdfs/label "oboFormat:xref"},
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has_dbxref"}})

(def hasDefaultNamespace
  {:db/ident :oboInOwl/hasDefaultNamespace,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI
    {:xsd/anyURI
     "http://purl.org/obo/owl/oboFormat#oboFormat_default-namespace"},
    :rdf/type :oboInOwl/DbXref,
    :rdfs/label "oboFormat:default-namespace"},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has_default_namespace"}})

(def hasDefinition
  {:db/ident :oboInOwl/hasDefinition,
   :oboInOwl/hasDbXref {:oboInOwl/hasURI
                        {:xsd/anyURI
                         "http://purl.org/obo/owl/oboFormat#oboFormat_def"},
                        :rdf/type :oboInOwl/DbXref,
                        :rdfs/label "oboFormat:def"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_cjm"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:cjm"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "a relation between a class and an instance of a oboInOwl:Definition"}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "we are forced to use the n-ary relation pattern in OWL1.0. For OWL2 we may make this a direct axiom between a class and the string",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has_definition"}})

(def hasExactSynonym
  {:db/ident :oboInOwl/hasExactSynonym,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI
    {:xsd/anyURI "http://purl.org/obo/owl/oboFormat#oboFormat_exact_synonym"},
    :rdf/type :oboInOwl/DbXref,
    :rdfs/label "oboFormat:exact_synonym"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_GOC"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:GOC"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "An alias in which the alias exhibits true synonymy. Example: ornithine cycle is an exact synonym of urea cycle"}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has_exact_synonym"},
   :rdfs/subPropertyOf :oboInOwl/hasSynonym})

(def hasNarrowSynonym
  {:db/ident :oboInOwl/hasNarrowSynonym,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI
    {:xsd/anyURI "http://purl.org/obo/owl/oboFormat#oboFormat_narrow_synonym"},
    :rdf/type :oboInOwl/DbXref,
    :rdfs/label "oboFormat:narrow_synonym"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_GOC"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:GOC"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "An alias in which the alias is narrower than the primary class name. Example: pyrimidine-dimer repair by photolyase is a narrow synonym of photoreactive repair"}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has_narrow_synonym"},
   :rdfs/subPropertyOf :oboInOwl/hasSynonym})

(def hasOBONamespace
  {:db/ident :oboInOwl/hasOBONamespace,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI {:xsd/anyURI
                      "http://purl.org/obo/owl/oboFormat#oboFormat_namespace"},
    :rdf/type        :oboInOwl/DbXref,
    :rdfs/label      "oboFormat:namespace"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_GOC"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:GOC"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "A relation between a class and an OBO namespace string. OBO namespaces are to be distinguished from IDspaces; for example, biological_process is a namespace, GO is an idspace."}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has_obo_namespace"}})

(def hasRelatedSynonym
  {:db/ident :oboInOwl/hasRelatedSynonym,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI
    {:xsd/anyURI "http://purl.org/obo/owl/oboFormat#oboFormat_related_synonym"},
    :rdf/type :oboInOwl/DbXref,
    :rdfs/label "oboFormat:related_synonym"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_GOC"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:GOC"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "An alias in which the alias is related the primary class name, but not necessarily broader or narrower. Example: cytochrome bc1 complex is a related synonym of ubiquinol-cytochrome-c reductase activity; virulence is a related synonym of pathogenesis"}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has_related_synonym"},
   :rdfs/subPropertyOf :oboInOwl/hasSynonym})

(def hasSubset
  {:db/ident   :oboInOwl/hasSubset,
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_cjm"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:cjm"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "relation between an ontology and a oboInOwl:Subset, indicating classes in the ontology belong to the subset"}},
   :rdf/type   :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has_subset"}})

(def hasSynonym
  {:db/ident :oboInOwl/hasSynonym,
   :oboInOwl/hasDbXref {:oboInOwl/hasURI
                        {:xsd/anyURI
                         "http://purl.org/obo/owl/oboFormat#oboFormat_synonym"},
                        :rdf/type :oboInOwl/DbXref,
                        :rdfs/label "oboFormat:synonym"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_GOC"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:GOC"},
    :rdf/type           :oboInOwl/Definition,
    :rdfs/label         {:rdf/language "en",
                         :rdf/value
                         "A relation between a class and an alias term."}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "Note that this should be a super-property of hasRelatedSynonym, hasExactSynonym etc; however, we cannot state this and remain in OWL-DL",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has_synonym"}})

(def hasSynonymType
  {:db/ident           :oboInOwl/hasSynonymType,
   :oboInOwl/hasDbXref {:oboInOwl/hasURI
                        {:xsd/anyURI
                         "http://www.geneontology.org/GO.usage.shtml#type"},
                        :rdf/type :oboInOwl/DbXref,
                        :rdfs/label
                        "URL:http://www.geneontology.org/GO.usage.shtml#type"},
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has_synonym_type"}})

(def hasURI
  {:db/ident   :oboInOwl/hasURI,
   :rdf/type   :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has_URI"}})

(def hasVersion
  {:db/ident           :oboInOwl/hasVersion,
   :oboInOwl/hasDbXref {:oboInOwl/hasURI
                        {:xsd/anyURI
                         "http://purl.org/obo/owl/oboFormat#oboFormat_version"},
                        :rdf/type :oboInOwl/DbXref,
                        :rdfs/label "oboFormat:version"},
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has_version"}})

(def inSubset
  {:db/ident           :oboInOwl/inSubset,
   :oboInOwl/hasDbXref {:oboInOwl/hasURI
                        {:xsd/anyURI
                         "http://purl.org/obo/owl/oboFormat#oboFormat_subset"},
                        :rdf/type :oboInOwl/DbXref,
                        :rdfs/label "oboFormat:subset"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_cjm"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:cjm"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "relation between a class and a oboInOwl:Subset, indicating the class belongs (is a member of) the subset"}},
   :rdf/type           :owl/AnnotationProperty,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "in_subset"}})

(def isCyclic
  {:db/ident :oboInOwl/isCyclic,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI {:xsd/anyURI
                      "http://purl.org/obo/owl/oboFormat#oboFormat_is_cyclic"},
    :rdf/type        :oboInOwl/DbXref,
    :rdfs/label      "oboFormat:is_cyclic"},
   :oboInOwl/hasDefinition {:rdf/type   :oboInOwl/Definition,
                            :rdfs/label {:rdf/language "en",
                                         :rdf/value    ""}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is_cyclic"}})

(def replacedBy
  {:db/ident :oboInOwl/replacedBy,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI
    {:xsd/anyURI "http://purl.org/obo/owl/oboFormat#oboFormat_replaced_by"},
    :rdf/type :oboInOwl/DbXref,
    :rdfs/label "oboFormat:replaced_by"},
   :oboInOwl/hasDefinition
   {:oboInOwl/hasDbXref {:oboInOwl/hasURI
                         {:xsd/anyURI
                          "http://purl.org/obo/owl/oboInOwl#oboInOwl_cjm"},
                         :rdf/type :oboInOwl/DbXref,
                         :rdfs/label "oboInOwl:cjm"},
    :rdf/type :oboInOwl/Definition,
    :rdfs/label
    {:rdf/language "en",
     :rdf/value
     "Gives a term which replaces an obsolete term. The value is the id of the replacement term. The value of this tag can safely be used to automatically reassign links to an obsolete term. The replaced_by tag may only be specified for obsolete terms. A single obsolete term may have more than one replaced_by tag. This tag can be used in conjunction with the consider tag."}},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "replaced_by"}})

(def savedBy
  {:db/ident :oboInOwl/savedBy,
   :oboInOwl/hasDbXref
   {:oboInOwl/hasURI {:xsd/anyURI
                      "http://purl.org/obo/owl/oboFormat#oboFormat_saved_by"},
    :rdf/type        :oboInOwl/DbXref,
    :rdfs/label      "oboFormat:saved_by"},
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "saved_by"}})

(def urn:uuid:7bf199be-e93e-50fa-a899-bd14f883bb13
  {:rdf/type :owl/Ontology,
   :rdfs/comment
   #{"OBO Format metamodel. This meta-ontology is self-describing. OBO metamodel properties are described using OBO metamodel properties"
     "\n          This is an OWL translation of an ontology whose native representational form is .obo. The translation was performed using the oboInOwl xslt library. For details, see http://www.berkeleybop.org/obo-conv.cgi\n        "},
   :rdfs/label "",
   :xsd/anyURI "http://www.geneontology.org/formats/oboInOwl"})