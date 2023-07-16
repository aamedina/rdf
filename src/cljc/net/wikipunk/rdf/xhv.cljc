(ns net.wikipunk.rdf.xhv
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/xhv/versions/2010-01-27.n3",
   :rdf/ns-prefix-map {"rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfa" "http://www.w3.org/ns/rdfa#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xhv"  "http://www.w3.org/1999/xhtml/vocab#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "xhv",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/TR/rdfa-core/"}}
  (:refer-clojure :exclude [first last list meta next]))

(def alert
  "A message\n      with important, and usually time-sensitive, information. Also see alertdialog\n      and status."
  {:db/ident :xhv/alert,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A message\n      with important, and usually time-sensitive, information. Also see alertdialog\n      and status."})

(def alertdialog
  "A\n      type of dialog that contains an alert message, where initial focus goes\n      an element within the dialog. Also see alert and dialog."
  {:db/ident :xhv/alertdialog,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A\n      type of dialog that contains an alert message, where initial focus goes\n      an element within the dialog. Also see alert and dialog."})

(def alternate
  "alternate \n    designates alternate versions for a resource."
  {:db/ident :xhv/alternate,
   :rdf/type :rdf/Property,
   :rdfa/term "alternate",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#alternate",
   :rdfs/comment
   "alternate \n    designates alternate versions for a resource.",
   :rdfs/member :xhv/relrev-properties})

(def appendix
  "appendix refers to a resource serving\n      as an appendix in a collection. "
  {:db/ident :xhv/appendix,
   :rdf/type :rdf/Property,
   :rdfa/term "appendix",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#appendix",
   :rdfs/comment
   "appendix refers to a resource serving\n      as an appendix in a collection. ",
   :rdfs/member :xhv/relrev-properties})

(def application
  "A\n      region declared as a web application, as opposed to a web document."
  {:db/ident :xhv/application,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A\n      region declared as a web application, as opposed to a web document."})

(def article
  "A section\n      of a page that consists of a composition that forms an independent part\n      of a document, page, or site."
  {:db/ident :xhv/article,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A section\n      of a page that consists of a composition that forms an independent part\n      of a document, page, or site."})

(def banner
  "contains\n      the prime heading or internal title of a page. "
  {:db/ident :xhv/banner,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "contains\n      the prime heading or internal title of a page. ",
   :rdfs/member :xhv/role-properties})

(def bookmark
  "bookmark refers to a bookmark - a link\n      to a key entry point within an extended document. "
  {:db/ident :xhv/bookmark,
   :rdf/type :rdf/Property,
   :rdfa/term "bookmark",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#bookmark",
   :rdfs/comment
   "bookmark refers to a bookmark - a link\n      to a key entry point within an extended document. ",
   :rdfs/member :xhv/relrev-properties})

(def button
  "An input\n      that allows for user-triggered actions when clicked or pressed. Also see\n      link."
  {:db/ident :xhv/button,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An input\n      that allows for user-triggered actions when clicked or pressed. Also see\n      link."})

(def chapter
  "chapter refers to a resource serving\n      as a chapter in a collection. "
  {:db/ident :xhv/chapter,
   :rdf/type :rdf/Property,
   :rdfa/term "chapter",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#chapter",
   :rdfs/comment
   "chapter refers to a resource serving\n      as a chapter in a collection. ",
   :rdfs/member :xhv/relrev-properties})

(def checkbox
  "A checkable\n      input that has three possible values: true, false, or mixed."
  {:db/ident :xhv/checkbox,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A checkable\n      input that has three possible values: true, false, or mixed."})

(def cite
  "cite refers to a resource that defines\n      a citation. "
  {:db/ident     :xhv/cite,
   :rdf/type     :rdf/Property,
   :rdfa/term    "cite",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#cite",
   :rdfs/comment "cite refers to a resource that defines\n      a citation. ",
   :rdfs/member  :xhv/relrev-properties})

(def columnheader
  "A\n      cell containing header information for a column."
  {:db/ident     :xhv/columnheader,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A\n      cell containing header information for a column."})

(def combobox
  "A presentation\n      of a select; usually similar to a textbox where users can type ahead to\n      select an option, or type to enter arbitrary text as a new item in the\n      list. Also see listbox."
  {:db/ident :xhv/combobox,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A presentation\n      of a select; usually similar to a textbox where users can type ahead to\n      select an option, or type to enter arbitrary text as a new item in the\n      list. Also see listbox."})

(def complementary
  "indicates that the section supports but is\n      separable from the main content of resource."
  {:db/ident :xhv/complementary,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "indicates that the section supports but is\n      separable from the main content of resource.",
   :rdfs/member :xhv/role-properties})

(def contentinfo
  "contains meta information about the\n      content on the page or the page as a whole."
  {:db/ident :xhv/contentinfo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "contains meta information about the\n      content on the page or the page as a whole.",
   :rdfs/member :xhv/role-properties})

(def contents
  "contents refers to a resource serving\n      as a table of contents. "
  {:db/ident :xhv/contents,
   :rdf/type :rdf/Property,
   :rdfa/term "contents",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#contents",
   :rdfs/comment
   "contents refers to a resource serving\n      as a table of contents. ",
   :rdfs/member :xhv/relrev-properties})

(def copyright
  "copyright refers to a copyright\n      statement for the resource. "
  {:db/ident :xhv/copyright,
   :rdf/type :rdf/Property,
   :rdfa/term "copyright",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#copyright",
   :rdfs/comment
   "copyright refers to a copyright\n      statement for the resource. ",
   :rdfs/member :xhv/relrev-properties})

(def definition
  "indicates the definition of a term or concept."
  {:db/ident     :xhv/definition,
   :rdf/type     :rdf/Property,
   :rdfs/comment "indicates the definition of a term or concept.",
   :rdfs/member  :xhv/role-properties})

(def dialog
  "A dialog\n      is an application window that is designed to interrupt the current processing\n      of an application in order to prompt the user to enter information or require\n      a response. Also see alertdialog."
  {:db/ident :xhv/dialog,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A dialog\n      is an application window that is designed to interrupt the current processing\n      of an application in order to prompt the user to enter information or require\n      a response. Also see alertdialog."})

(def directory
  "A list\n      of references to members of a group, such as a static table of contents."
  {:db/ident :xhv/directory,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A list\n      of references to members of a group, such as a static table of contents."})

(def document
  "A region\n      containing related information that is declared as document content, as\n      opposed to a web application."
  {:db/ident :xhv/document,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A region\n      containing related information that is declared as document content, as\n      opposed to a web application."})

(def first
  "first refers the first item in a\n      collection (see also start and top)."
  {:db/ident :xhv/first,
   :rdf/type :rdf/Property,
   :rdfa/term "first",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#first",
   :rdfs/comment
   "first refers the first item in a\n      collection (see also start and top).",
   :rdfs/member :xhv/relrev-properties})

(def form
  "A landmark\n      region that contains a collection of items and objects that, as a whole,\n      combine to create a form. Also see search."
  {:db/ident :xhv/form,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A landmark\n      region that contains a collection of items and objects that, as a whole,\n      combine to create a form. Also see search."})

(def glossary
  "glossary refers to a resource\n      providing a glossary of terms. "
  {:db/ident :xhv/glossary,
   :rdf/type :rdf/Property,
   :rdfa/term "glossary",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#glossary",
   :rdfs/comment
   "glossary refers to a resource\n      providing a glossary of terms. ",
   :rdfs/member :xhv/relrev-properties})

(def grid
  "A grid is\n      an interactive control which contains cells of tabular data arranged in\n      rows and columns, like a table."
  {:db/ident :xhv/grid,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A grid is\n      an interactive control which contains cells of tabular data arranged in\n      rows and columns, like a table."})

(def gridcell
  "A cell\n      in a grid or treegrid."
  {:db/ident     :xhv/gridcell,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A cell\n      in a grid or treegrid."})

(def group
  "A set of\n      user interface objects which are not intended to be included in a page\n      summary or table of contents by assistive technologies."
  {:db/ident :xhv/group,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A set of\n      user interface objects which are not intended to be included in a page\n      summary or table of contents by assistive technologies."})

(def heading
  "A heading\n      for a section of the page."
  {:db/ident     :xhv/heading,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A heading\n      for a section of the page."})

(def help
  "help refers to a resource offering\n      help. "
  {:db/ident     :xhv/help,
   :rdf/type     :rdf/Property,
   :rdfa/term    "help",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#help",
   :rdfs/comment "help refers to a resource offering\n      help. ",
   :rdfs/member  :xhv/relrev-properties})

(def icon
  "icon refers to a resource that\n      represents an icon. "
  {:db/ident     :xhv/icon,
   :rdf/type     :rdf/Property,
   :rdfa/term    "icon",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#icon",
   :rdfs/comment "icon refers to a resource that\n      represents an icon. ",
   :rdfs/member  :xhv/relrev-properties})

(def img
  "A container\n      for a collection of elements that form an image."
  {:db/ident :xhv/img,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A container\n      for a collection of elements that form an image."})

(def index
  "index refers to a resource providing\n      an index. "
  {:db/ident     :xhv/index,
   :rdf/type     :rdf/Property,
   :rdfa/term    "index",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#index",
   :rdfs/comment "index refers to a resource providing\n      an index. ",
   :rdfs/member  :xhv/relrev-properties})

(def itsRules
  "itsRules indicates that the designated\n      resource is an [ITS] rule set."
  {:db/ident :xhv/itsRules,
   :rdf/type :rdf/Property,
   :rdfa/term "itsRules",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#itsRules",
   :rdfs/comment
   "itsRules indicates that the designated\n      resource is an [ITS] rule set.",
   :rdfs/member :xhv/relrev-properties})

(def last
  "last refers to the last resource in a\n      collection of resources. "
  {:db/ident :xhv/last,
   :rdf/type :rdf/Property,
   :rdfa/term "last",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#last",
   :rdfs/comment
   "last refers to the last resource in a\n      collection of resources. ",
   :rdfs/member :xhv/relrev-properties})

(def license
  "license refers to a resource that\n      defines the associated license. "
  {:db/ident :xhv/license,
   :rdf/type :rdf/Property,
   :rdfa/term "license",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#license",
   :rdfs/comment
   "license refers to a resource that\n      defines the associated license. ",
   :rdfs/member :xhv/relrev-properties})

(def link
  "An interactive\n      reference to an internal or external resource that, when activated, causes\n      the user agent to navigate to that resource. Also see button."
  {:db/ident :xhv/link,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An interactive\n      reference to an internal or external resource that, when activated, causes\n      the user agent to navigate to that resource. Also see button."})

(def list
  "A group of\n      non-interactive list items. Also see listbox."
  {:db/ident :xhv/list,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A group of\n      non-interactive list items. Also see listbox."})

(def listbox
  "A widget\n      that allows the user to select one or more items from a list of choices.\n      Also see combobox and list."
  {:db/ident :xhv/listbox,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A widget\n      that allows the user to select one or more items from a list of choices.\n      Also see combobox and list."})

(def listitem
  "A single\n      item in a list or directory."
  {:db/ident     :xhv/listitem,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A single\n      item in a list or directory."})

(def log
  "A type of\n      live region where new information is added in meaningful order and old\n      information may disappear. Also see marquee."
  {:db/ident :xhv/log,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A type of\n      live region where new information is added in meaningful order and old\n      information may disappear. Also see marquee."})

(def main
  "acts as the\n      main content of the document. "
  {:db/ident     :xhv/main,
   :rdf/type     :rdf/Property,
   :rdfs/comment "acts as the\n      main content of the document. ",
   :rdfs/member  :xhv/role-properties})

(def marquee
  "A type\n      of live region where non-essential information changes frequently. Also\n      see log."
  {:db/ident :xhv/marquee,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A type\n      of live region where non-essential information changes frequently. Also\n      see log."})

(def math
  "Content that\n      represents a mathematical expression. "
  {:db/ident     :xhv/math,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Content that\n      represents a mathematical expression. "})

(def menu
  "A type of\n      widget that offers a list of choices to the user."
  {:db/ident :xhv/menu,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A type of\n      widget that offers a list of choices to the user."})

(def menubar
  "A presentation\n      of menu that usually remains visible and is usually presented horizontally."
  {:db/ident :xhv/menubar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A presentation\n      of menu that usually remains visible and is usually presented horizontally."})

(def menuitem
  "An option\n      in a group of choices contained by a menu or menubar."
  {:db/ident :xhv/menuitem,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An option\n      in a group of choices contained by a menu or menubar."})

(def menuitemcheckbox
  "A\n      checkable menuitem that has three possible values: true, false, or mixed."
  {:db/ident :xhv/menuitemcheckbox,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A\n      checkable menuitem that has three possible values: true, false, or mixed."})

(def menuitemradio
  "A\n      checkable menuitem in a group of menuitemradio roles, only one of which\n      can be checked at a time."
  {:db/ident :xhv/menuitemradio,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A\n      checkable menuitem in a group of menuitemradio roles, only one of which\n      can be checked at a time."})

(def meta
  "meta refers to a resource that\n      provides metadata. "
  {:db/ident     :xhv/meta,
   :rdf/type     :rdf/Property,
   :rdfa/term    "meta",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#meta",
   :rdfs/comment "meta refers to a resource that\n      provides metadata. ",
   :rdfs/member  :xhv/relrev-properties})

(def navigation
  "indicates a collection of items suitable for\n      navigating the document or related documents."
  {:db/ident :xhv/navigation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "indicates a collection of items suitable for\n      navigating the document or related documents.",
   :rdfs/member :xhv/role-properties})

(def next
  "next refers to the next resource\n      (after the current one) in an ordered collection of resources. "
  {:db/ident :xhv/next,
   :rdf/type :rdf/Property,
   :rdfa/term "next",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#next",
   :rdfs/comment
   "next refers to the next resource\n      (after the current one) in an ordered collection of resources. ",
   :rdfs/member :xhv/relrev-properties})

(def note
  "indicates\n      the content is parenthetic or ancillary to the main content of the\n      resource. "
  {:db/ident :xhv/note,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "indicates\n      the content is parenthetic or ancillary to the main content of the\n      resource. ",
   :rdfs/member :xhv/role-properties})

(def option
  "A selectable\n      item in a select list."
  {:db/ident     :xhv/option,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A selectable\n      item in a select list."})

(def p3pv1
  "p3pv1 refers to a P3P Policy Reference\n      File [P3P]. "
  {:db/ident     :xhv/p3pv1,
   :rdf/type     :rdf/Property,
   :rdfa/term    "p3pv1",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#p3pv1",
   :rdfs/comment "p3pv1 refers to a P3P Policy Reference\n      File [P3P]. ",
   :rdfs/member  :xhv/relrev-properties})

(def presentation
  "An\n      element whose implicit native role semantics will not be mapped to the\n      accessibility API."
  {:db/ident :xhv/presentation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An\n      element whose implicit native role semantics will not be mapped to the\n      accessibility API."})

(def prev
  "prev refers to a previous resource\n      (before the current one) in an ordered collection of resources. "
  {:db/ident :xhv/prev,
   :rdf/type :rdf/Property,
   :rdfa/term "prev",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#prev",
   :rdfs/comment
   "prev refers to a previous resource\n      (before the current one) in an ordered collection of resources. ",
   :rdfs/member :xhv/relrev-properties})

(def progressbar
  "An\n      element that displays the progress status for tasks that take a long time."
  {:db/ident :xhv/progressbar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An\n      element that displays the progress status for tasks that take a long time."})

(def radio
  "A checkable\n      input in a group of radio roles, only one of which can be checked at a\n      time."
  {:db/ident :xhv/radio,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A checkable\n      input in a group of radio roles, only one of which can be checked at a\n      time."})

(def radiogroup
  "A group\n      of radio buttons."
  {:db/ident     :xhv/radiogroup,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A group\n      of radio buttons."})

(def region
  "A large\n      perceivable section of a web page or document, that the author feels is\n      important enough to be included in a page summary or table of contents,\n      for example, an area of the page containing live sporting event statistics."
  {:db/ident :xhv/region,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A large\n      perceivable section of a web page or document, that the author feels is\n      important enough to be included in a page summary or table of contents,\n      for example, an area of the page containing live sporting event statistics."})

(def relrev-properties
  {:db/ident    :xhv/relrev-properties,
   :rdf/type    :rdf/Bag,
   :rdfs/member :xhv/role-properties})

(def role
  "role indicates the purpose of the\n      resource. See the XHTML Role\n      Vocabulary for roles in this vocabulary space, and XHTMLROLE for information on extending the\n      collection of roles. "
  {:db/ident :xhv/role,
   :rdf/type [:rdf/Property :rdf/Bag],
   :rdfa/term "role",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#role",
   :rdfs/comment
   "role indicates the purpose of the\n      resource. See the XHTML Role\n      Vocabulary for roles in this vocabulary space, and XHTMLROLE for information on extending the\n      collection of roles. ",
   :rdfs/member :xhv/relrev-properties})

(def role-properties
  {:db/ident :xhv/role-properties,
   :rdf/type [:rdfs/member :rdf/Bag]})

(def row
  "A row of cells\n      in a grid."
  {:db/ident     :xhv/row,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A row of cells\n      in a grid."})

(def rowgroup
  "A group\n      containing one or more row elements in a grid."
  {:db/ident :xhv/rowgroup,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A group\n      containing one or more row elements in a grid."})

(def rowheader
  "A cell\n      containing header information for a row in a grid."
  {:db/ident :xhv/rowheader,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A cell\n      containing header information for a row in a grid."})

(def scrollbar
  "A graphical\n      object that controls the scrolling of content within a viewing area, regardless\n      of whether the content is fully displayed within the viewing area."
  {:db/ident :xhv/scrollbar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A graphical\n      object that controls the scrolling of content within a viewing area, regardless\n      of whether the content is fully displayed within the viewing area."})

(def search
  "indicates\n      that the section provides a search facility. "
  {:db/ident :xhv/search,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "indicates\n      that the section provides a search facility. ",
   :rdfs/member :xhv/role-properties})

(def section
  "section refers to a resource serving\n      as a section in a collection. "
  {:db/ident :xhv/section,
   :rdf/type :rdf/Property,
   :rdfa/term "section",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#section",
   :rdfs/comment
   "section refers to a resource serving\n      as a section in a collection. ",
   :rdfs/member :xhv/relrev-properties})

(def separator
  "A divider\n      that separates and distinguishes sections of content or groups of menuitems."
  {:db/ident :xhv/separator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A divider\n      that separates and distinguishes sections of content or groups of menuitems."})

(def slider
  "A user\n      input where the user selects a value from within a given range."
  {:db/ident :xhv/slider,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A user\n      input where the user selects a value from within a given range."})

(def spinbutton
  "A form\n      of range that expects a user to select from amongst discrete choices."
  {:db/ident :xhv/spinbutton,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A form\n      of range that expects a user to select from amongst discrete choices."})

(def start
  "start refers to the first resource in\n      a collection of resources. "
  {:db/ident :xhv/start,
   :rdf/type :rdf/Property,
   :rdfa/term "start",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#start",
   :rdfs/comment
   "start refers to the first resource in\n      a collection of resources. ",
   :rdfs/member :xhv/relrev-properties})

(def status
  "A container\n      whose content is advisory information for the user but is not important\n      enough to justify an alert. Also see alert."
  {:db/ident :xhv/status,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A container\n      whose content is advisory information for the user but is not important\n      enough to justify an alert. Also see alert."})

(def stylesheet
  "stylesheet refers to a resource\n      serving as a stylesheet for a resource. "
  {:db/ident :xhv/stylesheet,
   :rdf/type :rdf/Property,
   :rdfa/term "stylesheet",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#stylesheet",
   :rdfs/comment
   "stylesheet refers to a resource\n      serving as a stylesheet for a resource. ",
   :rdfs/member :xhv/relrev-properties})

(def subsection
  "subsection refers to a resource\n      serving as a subsection in a collection. "
  {:db/ident :xhv/subsection,
   :rdf/type :rdf/Property,
   :rdfa/term "subsection",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#subsection",
   :rdfs/comment
   "subsection refers to a resource\n      serving as a subsection in a collection. ",
   :rdfs/member :xhv/relrev-properties})

(def tab
  "A grouping\n      label providing a mechanism for selecting the tab content that is to be\n      rendered to the user."
  {:db/ident :xhv/tab,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A grouping\n      label providing a mechanism for selecting the tab content that is to be\n      rendered to the user."})

(def tablist
  "A list\n      of tab elements, which are references to tabpanel elements."
  {:db/ident :xhv/tablist,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A list\n      of tab elements, which are references to tabpanel elements."})

(def tabpanel
  "A container\n      for the resources associated with a tab, where each tab is contained in\n      a tablist."
  {:db/ident :xhv/tabpanel,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A container\n      for the resources associated with a tab, where each tab is contained in\n      a tablist."})

(def textbox
  "Input\n      that allows free-form text as its value."
  {:db/ident     :xhv/textbox,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Input\n      that allows free-form text as its value."})

(def timer
  "A type of\n      live region containing a numerical counter which indicates an amount of\n      elapsed time from a start point, or the time remaining until an end point."
  {:db/ident :xhv/timer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A type of\n      live region containing a numerical counter which indicates an amount of\n      elapsed time from a start point, or the time remaining until an end point."})

(def toolbar
  "A collection\n      of commonly used function buttons represented in compact visual form."
  {:db/ident :xhv/toolbar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A collection\n      of commonly used function buttons represented in compact visual form."})

(def tooltip
  "A contextual\n      popup that displays a description for an element."
  {:db/ident :xhv/tooltip,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A contextual\n      popup that displays a description for an element."})

(def top
  "top is a synonym for start. "
  {:db/ident     :xhv/top,
   :rdf/type     :rdf/Property,
   :rdfa/term    "top",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#top",
   :rdfs/comment "top is a synonym for start. ",
   :rdfs/member  :xhv/relrev-properties})

(def tree
  "A type of\n      list that may contain sub-level nested groups that can be collapsed and\n      expanded."
  {:db/ident :xhv/tree,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A type of\n      list that may contain sub-level nested groups that can be collapsed and\n      expanded."})

(def treegrid
  "A grid\n      whose rows can be expanded and collapsed in the same manner as for a tree."
  {:db/ident :xhv/treegrid,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A grid\n      whose rows can be expanded and collapsed in the same manner as for a tree."})

(def treeitem
  "An option\n      item of a tree. This is an element within a tree that may be expanded or\n      collapsed if it contains a sub-level group of treeitems."
  {:db/ident :xhv/treeitem,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An option\n      item of a tree. This is an element within a tree that may be expanded or\n      collapsed if it contains a sub-level group of treeitems."})

(def up
  "up refers to a resource \"above\" in a\n      hierarchically structured set. "
  {:db/ident :xhv/up,
   :rdf/type :rdf/Property,
   :rdfa/term "up",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#up",
   :rdfs/comment
   "up refers to a resource \"above\" in a\n      hierarchically structured set. ",
   :rdfs/member :xhv/relrev-properties})