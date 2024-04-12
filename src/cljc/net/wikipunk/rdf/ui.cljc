(ns net.wikipunk.rdf.ui
  {:dcat/downloadURL "net/wikipunk/ext/ui.n3",
   :dcterms/author {:xsd/anyURI
                    "httprdfs://www.w3.org/People/Berners-Lee/card#i"},
   :dcterms/created #inst "2010-08-07T00:00:00.000-00:00",
   :dcterms/description
   "The User Interface ontology allows the definition\n\tof forms for processing RDF model data, and include a bootstrap form for\n\tediting forms. It allows user interface hints such as background colors,\n\tcan be associated with objects and classes.",
   :dcterms/license {:xsd/anyURI
                     "httprdfs://creativecommons.org/publicdomain/zero/1.0/"},
   :dcterms/modified #inst "2021-03-04T18:29:49.000-00:00",
   :dcterms/title
   "An ontology for User Interface description, Hints and Forms.",
   :namespaces {"dc11" "http://purl.org/dc/elements/1.1/",
                "owl"  "http://www.w3.org/2002/07/owl#",
                "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                "ui"   "http://www.w3.org/ns/ui#",
                "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ui",
   :rdfa/uri "http://www.w3.org/ns/ui#",
   :xsd/anyURI "http://www.w3.org/ns/ui#"}
  (:refer-clojure :exclude [case for max min name sequence use]))

(def BooleanField
  {:db/ident        :ui/BooleanField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/NumericField})

(def CaseForm
  {:db/ident      :ui/CaseForm,
   :dcterms/title "Form for a conditional case in a form",
   :rdf/type      :ui/Group,
   :ui/parts      [{:rdf/type      :ui/Choice,
                    :ui/canMintNew true,
                    :ui/from       :rdfs/Class,
                    :ui/label      "when it is",
                    :ui/property   :ui/for,
                    :ui/sequence   1}
                   {:rdf/type      :ui/Choice,
                    :ui/canMintNew true,
                    :ui/from       :ui/Form,
                    :ui/property   :ui/use,
                    :ui/sequence   2,
                    :ui/use        :ui/FieldForm}]})

(def Choice
  {:db/ident        :ui/Choice,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf #{:ui/Single :ui/Form}})

(def Classifier
  {:db/ident :ui/Classifier,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A classifier allows the user to select the type of an object.\n    The possible types must be subclasses of some overall class, the \"category\".\n    (Ideally, the superclass is also set up as the disjoint union of the subclasses,\n    if they are disjoint.)\n\n    The form normally stores the resulting classes using an rdf:type triple,\n    but a different predicate can be used if required, so the classifier field\n    needs is 'property' defined too.\n\n    If the subclass selected itself is has subclasses defined, the user can\n    recursively select from them in turn, as many levels as needed.",
   :rdfs/label "classifier",
   :rdfs/subClassOf #{:ui/Single :ui/Form}})

(def Color
  {:db/ident :ui/Color,
   :owl/onDatatype :xsd/string,
   :owl/withRestrictions [:ui/ColorValuespaceRestriction],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "Must be a valid CSS color string such as one could put in\n\t\t\tan HTML style attribute.  This must be in the #xxxxxx form,\n\t\t\t(with 6 digits of lowercase hex) so that it\n\t\t\tcan work eg with Graphviz.\n\t\t\tAs this is just an encoded array of RGB values,\n\t\t\tyou can do math with these, such as blending, complement, etc.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hex color"}})

(def ColorField
  {:db/ident        :ui/ColorField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/ValueField})

(def ColorValuespaceRestriction
  {:db/ident    :ui/ColorValuespaceRestriction,
   :rdf/type    :owl/Restriction,
   :xsd/pattern "#[0-9a-z]{6}"})

(def Comment
  {:db/ident         :ui/Comment,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Comment"}
                       {:rdf/language "es",
                        :rdf/value    "Comentario"}},
   :rdfs/subClassOf  #{:ui/Single :ui/Form}})

(def DateField
  {:db/ident        :ui/DateField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/ValueField})

(def DateTimeField
  {:db/ident        :ui/DateTimeField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/ValueField})

(def DecimalField
  {:db/ident        :ui/DecimalField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/NumericField})

(def EmailField
  {:db/ident        :ui/EmailField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/ValueField})

(def FF1
  {:db/ident    :ui/FF1,
   :rdf/type    :ui/Heading,
   :ui/contents {:rdf/language "en",
                 :rdf/value    "Edit Form"},
   :ui/sequence 1})

(def FF2
  {:db/ident    :ui/FF2,
   :rdf/type    :ui/SingleLineTextField,
   :ui/property :dcterms/title,
   :ui/sequence 2,
   :ui/size     60})

(def FF3
  {:db/ident :ui/FF3,
   :rdf/type :ui/Comment,
   :ui/contents
   {:rdf/language "en",
    :rdf/value
    "To add a field to the form, press the plus at the bottom,\n        and then select what sort of field you want."},
   :ui/sequence 3,
   :ui/style "background-colordf: #ffe;"})

(def FieldForm
  {:db/ident :ui/FieldForm,
   :dcterms/title "Form for selecting a type of field",
   :rdf/type :ui/Group,
   :ui/parts
   [{:rdf/type    :ui/Classifier,
     :ui/category :ui/Form,
     :ui/property :rdf/type,
     :ui/sequence 1}
    {:rdf/type :ui/Options,
     :ui/case
     #{{:ui/for :ui/DateField,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :owl/DatatypeProperty,
                             :ui/label      "property",
                             :ui/property   :ui/property,
                             :ui/sequence   1}
                            {:rdf/type    :ui/DateField,
                             :ui/label    "min",
                             :ui/property :ui/min,
                             :ui/sequence 2}
                            {:rdf/type    :ui/DateField,
                             :ui/label    "max",
                             :ui/property :ui/max,
                             :ui/sequence 3}]}}
       {:ui/for :ui/Comment,
        :ui/use {:rdf/type    :ui/MultiLineTextField,
                 :ui/property :ui/contents}}
       {:ui/for :ui/ColorField,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :owl/DatatypeProperty,
                             :ui/label      "property",
                             :ui/property   :ui/property,
                             :ui/sequence   1}]}}
       {:ui/for :ui/DecimalField,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :owl/DatatypeProperty,
                             :ui/label      "property",
                             :ui/property   :ui/property,
                             :ui/sequence   1}
                            {:rdf/type    :ui/DecimalField,
                             :ui/label    "minimum value",
                             :ui/property :ui/min,
                             :ui/sequence 2}
                            {:rdf/type    :ui/DecimalField,
                             :ui/label    "maximum value",
                             :ui/property :ui/max,
                             :ui/sequence 3}]}}
       {:ui/for :ui/Options,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/default    :rdf/type,
                             :ui/from       :rdf/Property,
                             :ui/label      "depending on",
                             :ui/property   :ui/dependingOn,
                             :ui/sequence   1}
                            {:rdf/type    :ui/Multiple,
                             :ui/part     :ui/CaseForm,
                             :ui/property :ui/case,
                             :ui/sequence 2}]}}
       {:ui/for :ui/Multiple,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type    :ui/BooleanField,
                             :ui/label    "ordered",
                             :ui/property :ui/ordered,
                             :ui/sequence 0}
                            {:rdf/type    :ui/IntegerField,
                             :ui/label    "minimum number",
                             :ui/property :ui/min,
                             :ui/sequence 0}
                            {:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :rdf/Property,
                             :ui/label      "property",
                             :ui/property   :ui/property,
                             :ui/sequence   1}
                            {:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :ui/Form,
                             :ui/property   :ui/part,
                             :ui/sequence   2,
                             :ui/use        :ui/FieldForm}]}}
       {:ui/for :ui/FloatField,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :owl/DatatypeProperty,
                             :ui/label      "property",
                             :ui/property   :ui/property,
                             :ui/sequence   1}
                            {:rdf/type    :ui/FloatField,
                             :ui/label    "minimum value",
                             :ui/property :ui/min,
                             :ui/sequence 2}
                            {:rdf/type    :ui/FloatField,
                             :ui/label    "maximum value",
                             :ui/property :ui/max,
                             :ui/sequence 3}]}}
       {:ui/for :ui/PhoneField,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :owl/ObjectProperty,
                             :ui/label      "property",
                             :ui/property   :ui/property,
                             :ui/sequence   1}]}}
       {:ui/for :ui/TextField,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :owl/DatatypeProperty,
                             :ui/label      "property",
                             :ui/property   :ui/property}
                            {:rdf/type    :ui/IntegerField,
                             :ui/label    "field size",
                             :ui/max      4096,
                             :ui/min      1,
                             :ui/property :ui/size}
                            {:rdf/type    :ui/IntegerField,
                             :ui/label    "Max. length of string",
                             :ui/min      1,
                             :ui/property :ui/maxLength}]}}
       {:ui/for :ui/Heading,
        :ui/use {:rdf/type    :ui/SingleLineTextField,
                 :ui/property :ui/contents}}
       {:ui/for :ui/Classifier,
        :ui/use
        {:rdf/type :ui/Group,
         :ui/parts
         [{:rdf/type :ui/Comment,
           :ui/contents
           "A classifier allows the user to which classes the item belongs to, given a common superclass of the allowed classes.  Give the superclass here:",
           :ui/sequence 2}
          {:rdf/type      :ui/Choice,
           :ui/canMintNew true,
           :ui/from       :rdfs/Class,
           :ui/label      "superclass",
           :ui/property   :ui/category,
           :ui/sequence   4}
          {:rdf/type :ui/Comment,
           :ui/contents
           "(When the choice is made normally the item is given a rdf:type. Set this to rdf:type unless you want the form to set a different property.)",
           :ui/sequence 6}
          {:rdf/type      :ui/Choice,
           :ui/canMintNew true,
           :ui/default    :rdf/type,
           :ui/from       :owl/ObjectProperty,
           :ui/label      "property",
           :ui/property   :ui/property,
           :ui/sequence   8}]}}
       {:ui/for :ui/Group,
        :ui/use :ui/FieldList}
       {:ui/for :ui/DateTimeField,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :owl/DatatypeProperty,
                             :ui/label      "property",
                             :ui/property   :ui/property,
                             :ui/sequence   1}
                            {:rdf/type    :ui/DateTimeField,
                             :ui/label    "min",
                             :ui/property :ui/min,
                             :ui/sequence 2}
                            {:rdf/type    :ui/DateTimeField,
                             :ui/label    "max",
                             :ui/property :ui/max,
                             :ui/sequence 3}]}}
       {:ui/for :ui/Choice,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :owl/ObjectProperty,
                             :ui/label      "property",
                             :ui/property   :ui/property,
                             :ui/sequence   1}
                            {:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :rdfs/Class,
                             :ui/label      "destination class",
                             :ui/property   :ui/from,
                             :ui/sequence   2}
                            {:rdf/type    :ui/BooleanField,
                             :ui/label    "user can add new",
                             :ui/property :ui/canMintNew,
                             :ui/sequence 3}
                            {:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :ui/Form,
                             :ui/label      "Nested Form (if any)",
                             :ui/optional   true,
                             :ui/property   :ui/use,
                             :ui/sequence   4,
                             :ui/use        :ui/FormForm}]}}
       {:ui/for :ui/IntegerField,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :owl/DatatypeProperty,
                             :ui/label      "property",
                             :ui/property   :ui/property,
                             :ui/sequence   1}
                            {:rdf/type    :ui/IntegerField,
                             :ui/label    "minimum value",
                             :ui/property :ui/min,
                             :ui/sequence 2}
                            {:rdf/type    :ui/IntegerField,
                             :ui/label    "maximum value",
                             :ui/property :ui/max,
                             :ui/sequence 3}]}}
       {:ui/for :ui/EmailField,
        :ui/use {:rdf/type :ui/Group,
                 :ui/parts [{:rdf/type      :ui/Choice,
                             :ui/canMintNew true,
                             :ui/from       :owl/ObjectProperty,
                             :ui/label      "property",
                             :ui/property   :ui/property,
                             :ui/sequence   1}]}}},
     :ui/dependingOn :rdf/type,
     :ui/sequence 2}]})

(def FieldList
  {:db/ident    :ui/FieldList,
   :rdf/type    :ui/Multiple,
   :ui/ordered  true,
   :ui/part     :ui/FieldForm,
   :ui/property :ui/parts,
   :ui/sequence 10})

(def FloatField
  {:db/ident        :ui/FloatField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/NumericField})

(def Form
  {:db/ident :ui/Form,
   :owl/disjointUnionOf [:ui/ValueField
                         :ui/Group
                         :ui/Choice
                         :ui/Classifier
                         :ui/Options
                         :ui/Multiple
                         :ui/Heading
                         :ui/Comment],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A form can be any type of single field, or typically a Group of several fields,\n    including interspersed headings and comments.  "})

(def FormForm
  {:db/ident        :ui/FormForm,
   :dcterms/title   "Form for editing Forms",
   :rdf/type        #{:ui/Group :ui/Form},
   :ui/creationForm :ui/Form,
   :ui/parts        [:ui/FF1 :ui/FF2 :ui/FF3 :ui/FieldList]})

(def Group
  {:db/ident        :ui/Group,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf #{:ui/Single :ui/Form}})

(def Heading
  {:db/ident        :ui/Heading,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf #{:ui/Single :ui/Form}})

(def IntegerField
  {:db/ident        :ui/IntegerField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/NumericField})

(def MultiLineTextField
  {:db/ident        :ui/MultiLineTextField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/TextField})

(def Multiple
  {:db/ident        :ui/Multiple,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/Form})

(def NamedNodeURIField
  {:db/ident :ui/NamedNodeURIField,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A NamedNodeURIField is like a SingleLineTextField, except\n\t\tthat the value it generates is not a literal string but an RDF node with the given URI.\n\t\tNormally users should not see URIs. When they do, this a way to do it.\n\t\t",
   :rdfs/label "Something by its URI",
   :rdfs/subClassOf :ui/TextField})

(def NumericField
  {:db/ident        :ui/NumericField,
   :owl/disjointUnionOf [:ui/BooleanField
                         :ui/TriStateField
                         :ui/IntegerField
                         :ui/DecimalField
                         :ui/FloatField],
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/ValueField})

(def Options
  {:db/ident        :ui/Options,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf #{:ui/Single :ui/Form}})

(def PhoneField
  {:db/ident        :ui/PhoneField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/ValueField})

(def Single
  {:db/ident :ui/Single,
   :owl/disjointUnionOf [:ui/ValueField
                         :ui/Group
                         :ui/Choice
                         :ui/Classifier
                         :ui/Options
                         :ui/Heading
                         :ui/Comment],
   :rdf/type :rdfs/Class})

(def SingleLineTextField
  {:db/ident        :ui/SingleLineTextField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/TextField})

(def TextField
  {:db/ident        :ui/TextField,
   :owl/disjointUnionOf
   [:ui/SingleLineTextField :ui/MultiLineTextField :ui/NamedNodeURIField],
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/ValueField})

(def TimeField
  {:db/ident         :ui/TimeField,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Time field"}
                       {:rdf/language "es",
                        :rdf/value    "Campo de tiempo"}}})

(def TriStateField
  {:db/ident        :ui/TriStateField,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :ui/NumericField})

(def ValueField
  {:db/ident        :ui/ValueField,
   :owl/disjointUnionOf [:ui/TextField
                         :ui/NumericField
                         :ui/ColorField
                         :ui/DateField
                         :ui/DateTimeField
                         :ui/PhoneField
                         :ui/EmailField],
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf #{:ui/Single :ui/Form}})

(def annotationForm
  {:db/ident :ui/annotationForm,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A form which may be used to add more infromation to an\ninstance of this class which we know something about.  Anything from\nadding just add one more fact, to adding a whole lot of information about a specific\nfacet of the thing.\n",
   :rdfs/domain :rdfs/Class,
   :rdfs/label "annotation form",
   :rdfs/range :ui/Form})

(def backgroundColor
  {:db/ident   :ui/backgroundColor,
   :rdf/type   #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "background color"},
   :rdfs/range :ui/Color})

(def backgroundImage
  {:db/ident     :ui/backgroundImage,
   :rdf/type     #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment "URI or base64 representation of an image",
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "background image"}})

(def base
  {:db/ident         :ui/base,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Base"}
                       {:rdf/language "en",
                        :rdf/value    "Base"}}})

(def canMintNew
  {:db/ident     :ui/canMintNew,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Whether the user can add a new item to the list",
   :rdfs/domain  :ui/Choice,
   :rdfs/label   "can mint new",
   :rdfs/range   :xsd/boolean})

(def case
  {:db/ident     :ui/case,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A case in an Options field.",
   :rdfs/domain  :ui/Options,
   :rdfs/label   "case",
   :rdfs/range   :ui/CaseForm})

(def category
  {:db/ident     :ui/category,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The superclass subclasses of which will be selected.",
   :rdfs/domain  :ui/Classifier,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "overall superclass"},
   :rdfs/range   :rdfs/Class})

(def color
  {:db/ident   :ui/color,
   :rdf/type   #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "color"},
   :rdfs/range :ui/Color})

(def contents
  {:db/ident         :ui/contents,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Contents"}
                       {:rdf/language "es",
                        :rdf/value    "Contenido"}}})

(def creationForm
  {:db/ident :ui/creationForm,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A form which may be used to collect information about a\n    hitherto locally undocumented instance instance of this class.",
   :rdfs/domain :rdfs/Class,
   :rdfs/label "creation form",
   :rdfs/range :ui/Form})

(def default
  {:db/ident     :ui/default,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The default value for the field",
   :rdfs/domain  :ui/Options,
   :rdfs/label   "default",
   :rdfs/range   :rdfs/Resource})

(def defaultError
  {:db/ident         :ui/defaultError,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Error predeterminado"}
                       {:rdf/language "en",
                        :rdf/value    "Default error"}}})

(def dependingOn
  {:db/ident :ui/dependingOn,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Many fields prompt for information about a given property of the subject",
   :rdfs/domain :ui/Options,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "depending on"},
   :rdfs/range :rdf/Property})

(def for
  {:db/ident     :ui/for,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The value for which this case is selected.",
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "for"}})

(def from
  {:db/ident    :ui/from,
   :rdf/type    :rdf/Property,
   :rdfs/domain :ui/Choice,
   :rdfs/label  "from",
   :rdfs/range  :rdfs/Class,
   :ui/prompt   "from what class"})

(def initialProperties
  {:db/ident :ui/initialProperties,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A really simple way of enabling user interfaces to\n            create new information about a class of things is to make a define of properties\n            to be specified when a information about a new item\n            (\"New item\" here means an item which the system\n            does not have prvious information about yet,\n            not an items which has just been created,\n            like new friend as opposed to new baby)",
   :rdfs/domain :rdfs/Class,
   :rdfs/label "initial properties",
   :rdfs/range :rdf/List,
   :ui/prompt "Properties to be specified for new ones"})

(def label
  {:db/ident         :ui/label,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Label"}
                       {:rdf/language "es",
                        :rdf/value    "Etiqueta"}}})

(def max
  {:db/ident    :ui/max,
   :rdf/type    :rdf/Property,
   :rdfs/domain :ui/ValueField,
   :rdfs/label  "max"})

(def maxDateOffset
  {:db/ident         :ui/maxDateOffset,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Fecha máxima de desplazamiento"}
                       {:rdf/language "en",
                        :rdf/value    "Maximum date offset"}}})

(def maxDatetimeOffset
  {:db/ident         :ui/maxDatetimeOffset,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Maximum datetime offset"}
                       {:rdf/language "es",
                        :rdf/value "Desplazamiento máximo de fecha y hora"}}})

(def maxLength
  {:db/ident         :ui/maxLength,
   :rdf/type         :rdf/Property,
   :rdfs/domain      :ui/TextField,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Max length"} "max length of value"
                       {:rdf/language "es",
                        :rdf/value    "Longitud máxima"}},
   :rdfs/range       :xsd/integer})

(def maxValue
  {:db/ident    :ui/maxValue,
   :rdf/type    :rdf/Property,
   :rdfs/domain :ui/ValueField,
   :rdfs/label  "max"})

(def min
  {:db/ident    :ui/min,
   :rdf/type    :rdf/Property,
   :rdfs/domain :ui/ValueField,
   :rdfs/label  "min"})

(def minDateOffset
  {:db/ident         :ui/minDateOffset,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Minimum date offset"}
                       {:rdf/language "es",
                        :rdf/value    "Fecha mínima compensada"}}})

(def minDatetimeOffset
  {:db/ident         :ui/minDatetimeOffset,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Desplazamiento mínimo de fecha y hora"}
                       {:rdf/language "en",
                        :rdf/value    "Minimum datetime offset"}}})

(def minLength
  {:db/ident         :ui/minLength,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Min length"}
                       {:rdf/language "es",
                        :rdf/value    "Longitud mínima"}}})

(def minValue
  {:db/ident    :ui/minValue,
   :rdf/type    :rdf/Property,
   :rdfs/domain :ui/ValueField,
   :rdfs/label  "min"})

(def name
  {:db/ident         :ui/name,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Nombre"}
                       {:rdf/language "en",
                        :rdf/value    "Name"}}})

(def oldValue
  {:db/ident         :ui/oldValue,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Old value"}
                       {:rdf/language "es",
                        :rdf/value    "Valor antiguo"}}})

(def optional
  {:db/ident     :ui/optional,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Whether the user can leave the field blank",
   :rdfs/domain  :ui/Choice,
   :rdfs/label   "optional",
   :rdfs/range   :xsd/boolean})

(def ordered
  {:db/ident   :ui/ordered,
   :rdf/type   :rdf/Property,
   :rdfs/label "ordered",
   :rdfs/range :xsd/boolean})

(def parentProperty
  {:db/ident         :ui/parentProperty,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Propiedad principal"}
                       {:rdf/language "en",
                        :rdf/value    "Parent property"}}})

(def part
  {:db/ident    :ui/part,
   :rdf/type    :rdf/Property,
   :rdfs/domain :ui/Form,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "part"},
   :rdfs/range  :ui/Form})

(def parts
  {:db/ident    :ui/parts,
   :rdf/type    :rdf/Property,
   :rdfs/domain :ui/Form,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "parts"},
   :rdfs/range  :rdf/List})

(def partsClone
  {:db/ident         :ui/partsClone,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Parts clone"}
                       {:rdf/language "es",
                        :rdf/value    "Clon de piezas"}}})

(def pattern
  {:db/ident         :ui/pattern,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Pattern"}
                       {:rdf/language "es",
                        :rdf/value    "Modelo"}}})

(def prompt
  {:db/ident :ui/prompt,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A string for the UI to use if the user needs a longer\n        prompts than just a field name, the rdfs:label. ",
   :rdfs/label "user prompt",
   :rdfs/range :xsd/string})

(def property
  {:db/ident :ui/property,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Many fields prompt for information about a given property of the subject.\n    When field is filled in, this gives which property is written into the data.",
   :rdfs/domain :ui/Form,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "property to be stored"},
   :rdfs/range :rdf/Property})

(def reference
  {:db/ident         :ui/reference,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Reference"}
                       {:rdf/language "es",
                        :rdf/value    "Referencia"}}})

(def required
  {:db/ident         :ui/required,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Requerido"}
                       {:rdf/language "en",
                        :rdf/value    "Required"}}})

(def requiredError
  {:db/ident         :ui/requiredError,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Error requerido"}
                       {:rdf/language "en",
                        :rdf/value    "Required error"}}})

(def sequence
  {:db/ident :ui/sequence,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The sequence in which this item is arranged with repect to other parts.",
   :rdfs/label "sequence number",
   :rdfs/range :xsd/integer})

(def size
  {:db/ident    :ui/size,
   :rdf/type    :rdf/Property,
   :rdfs/domain :ui/ValueField,
   :rdfs/label  "size of field",
   :rdfs/range  :xsd/integer,
   :ui/prompt   "size of field in characters"})

(def sortBy
  {:db/ident :ui/sortBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A property which typically is used to sort\n        members of a given class.",
   :rdfs/domain :rdfs/Class,
   :rdfs/label "sort by",
   :rdfs/range :rdf/Property})

(def sortPriority
  {:db/ident :ui/sortPriority,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "When individuals or classes must be sorted, then\n        if they are given different values of sortPriority a user agent can\n        use this as a hint to how to present information.",
   :rdfs/label "sort priority",
   :rdfs/range :xsd/integer})

(def style
  {:db/ident :ui/style,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "Must be a valid CSS style string such as one could put in\n        an HTML style attribute.  Depending on the user interface system, this can\n        by given to individuals, classes or properties. It is up to a user interface\n        which wants to draw on them to pick how it uses styles from which parts\n        of the data it has.  For example, the style of a class may be picked\n        to distinguish information about things in that class.",
   :rdfs/label "style",
   :ui/prompt "CSS style"})

(def tableProperties
  {:db/ident :ui/tableProperties,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This  is a crude way of specifying a table-based\n            view for objects of this class.",
   :rdfs/domain :rdfs/Class,
   :rdfs/label "table properties",
   :rdfs/range :rdf/List,
   :ui/prompt "Properties to be given in a default table view"})

(def use
  {:db/ident   :ui/use,
   :rdf/type   :rdf/Property,
   :rdfs/range :ui/Form})

(def valid
  {:db/ident         :ui/valid,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Valid"}
                       {:rdf/language "es",
                        :rdf/value    "Válida"}}})

(def validationError
  {:db/ident         :ui/validationError,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Error de validacion"}
                       {:rdf/language "en",
                        :rdf/value    "Validation error"}}})

(def value
  {:db/ident         :ui/value,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "en",
                        :rdf/value    "Value"}
                       {:rdf/language "es",
                        :rdf/value    "Valor"}}})

(def values
  {:db/ident         :ui/values,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ui#"},
   :rdfs/label       #{{:rdf/language "es",
                        :rdf/value    "Valores"}
                       {:rdf/language "en",
                        :rdf/value    "Values"}}})

(def urn:uuid:ece3815e-7550-516a-8856-24b95dfaf34b
  {:dcterms/author {:xsd/anyURI
                    "httprdfs://www.w3.org/People/Berners-Lee/card#i"},
   :dcterms/created #inst "2010-08-07T00:00:00.000-00:00",
   :dcterms/description
   "The User Interface ontology allows the definition\n\tof forms for processing RDF model data, and include a bootstrap form for\n\tediting forms. It allows user interface hints such as background colors,\n\tcan be associated with objects and classes.",
   :dcterms/license {:xsd/anyURI
                     "httprdfs://creativecommons.org/publicdomain/zero/1.0/"},
   :dcterms/modified #inst "2021-03-04T18:29:49.000-00:00",
   :dcterms/title
   "An ontology for User Interface description, Hints and Forms.",
   :rdf/type :owl/Ontology,
   :xsd/anyURI "http://www.w3.org/ns/ui#"})