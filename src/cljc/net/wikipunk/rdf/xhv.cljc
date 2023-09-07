(ns net.wikipunk.rdf.xhv
  ^{:base "http://www.w3.org/1999/xhtml/vocab#",
    :namespaces {"rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfa" "http://www.w3.org/ns/rdfa#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "xhv"  "http://www.w3.org/1999/xhtml/vocab#",
                 "xsd"  "http://www.w3.org/2001/XMLSchema#"},
    :prefix "xhv",
    :source
    "https://lov.linkeddata.es/dataset/lov/vocabs/xhv/versions/2010-01-27.n3"}
  {:rdf/type :owl/Ontology}
  (:refer-clojure :exclude [first last list meta next]))

(def alert
  {:db/ident :xhv/alert,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A message\n      with important, and usually time-sensitive, information. Also see alertdialog\n      and status."})

(def alertdialog
  {:db/ident :xhv/alertdialog,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A\n      type of dialog that contains an alert message, where initial focus goes\n      an element within the dialog. Also see alert and dialog."})

(def alternate
  {:db/ident :xhv/alternate,
   :rdf/type :rdf/Property,
   :rdfa/term "alternate",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#alternate",
   :rdfs/comment
   "alternate \n    designates alternate versions for a resource.",
   :rdfs/member :xhv/relrev-properties})

(def appendix
  {:db/ident :xhv/appendix,
   :rdf/type :rdf/Property,
   :rdfa/term "appendix",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#appendix",
   :rdfs/comment
   "appendix refers to a resource serving\n      as an appendix in a collection. ",
   :rdfs/member :xhv/relrev-properties})

(def application
  {:db/ident :xhv/application,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A\n      region declared as a web application, as opposed to a web document."})

(def article
  {:db/ident :xhv/article,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A section\n      of a page that consists of a composition that forms an independent part\n      of a document, page, or site."})

(def banner
  {:db/ident :xhv/banner,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "contains\n      the prime heading or internal title of a page. ",
   :rdfs/member :xhv/role-properties})

(def bookmark
  {:db/ident :xhv/bookmark,
   :rdf/type :rdf/Property,
   :rdfa/term "bookmark",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#bookmark",
   :rdfs/comment
   "bookmark refers to a bookmark - a link\n      to a key entry point within an extended document. ",
   :rdfs/member :xhv/relrev-properties})

(def button
  {:db/ident :xhv/button,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An input\n      that allows for user-triggered actions when clicked or pressed. Also see\n      link."})

(def chapter
  {:db/ident :xhv/chapter,
   :rdf/type :rdf/Property,
   :rdfa/term "chapter",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#chapter",
   :rdfs/comment
   "chapter refers to a resource serving\n      as a chapter in a collection. ",
   :rdfs/member :xhv/relrev-properties})

(def checkbox
  {:db/ident :xhv/checkbox,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A checkable\n      input that has three possible values: true, false, or mixed."})

(def cite
  {:db/ident     :xhv/cite,
   :rdf/type     :rdf/Property,
   :rdfa/term    "cite",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#cite",
   :rdfs/comment "cite refers to a resource that defines\n      a citation. ",
   :rdfs/member  :xhv/relrev-properties})

(def columnheader
  {:db/ident     :xhv/columnheader,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A\n      cell containing header information for a column."})

(def combobox
  {:db/ident :xhv/combobox,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A presentation\n      of a select; usually similar to a textbox where users can type ahead to\n      select an option, or type to enter arbitrary text as a new item in the\n      list. Also see listbox."})

(def complementary
  {:db/ident :xhv/complementary,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "indicates that the section supports but is\n      separable from the main content of resource.",
   :rdfs/member :xhv/role-properties})

(def contentinfo
  {:db/ident :xhv/contentinfo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "contains meta information about the\n      content on the page or the page as a whole.",
   :rdfs/member :xhv/role-properties})

(def contents
  {:db/ident :xhv/contents,
   :rdf/type :rdf/Property,
   :rdfa/term "contents",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#contents",
   :rdfs/comment
   "contents refers to a resource serving\n      as a table of contents. ",
   :rdfs/member :xhv/relrev-properties})

(def copyright
  {:db/ident :xhv/copyright,
   :rdf/type :rdf/Property,
   :rdfa/term "copyright",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#copyright",
   :rdfs/comment
   "copyright refers to a copyright\n      statement for the resource. ",
   :rdfs/member :xhv/relrev-properties})

(def definition
  {:db/ident     :xhv/definition,
   :rdf/type     :rdf/Property,
   :rdfs/comment "indicates the definition of a term or concept.",
   :rdfs/member  :xhv/role-properties})

(def dialog
  {:db/ident :xhv/dialog,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A dialog\n      is an application window that is designed to interrupt the current processing\n      of an application in order to prompt the user to enter information or require\n      a response. Also see alertdialog."})

(def directory
  {:db/ident :xhv/directory,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A list\n      of references to members of a group, such as a static table of contents."})

(def document
  {:db/ident :xhv/document,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A region\n      containing related information that is declared as document content, as\n      opposed to a web application."})

(def first
  {:db/ident :xhv/first,
   :rdf/type :rdf/Property,
   :rdfa/term "first",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#first",
   :rdfs/comment
   "first refers the first item in a\n      collection (see also start and top).",
   :rdfs/member :xhv/relrev-properties})

(def form
  {:db/ident :xhv/form,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A landmark\n      region that contains a collection of items and objects that, as a whole,\n      combine to create a form. Also see search."})

(def glossary
  {:db/ident :xhv/glossary,
   :rdf/type :rdf/Property,
   :rdfa/term "glossary",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#glossary",
   :rdfs/comment
   "glossary refers to a resource\n      providing a glossary of terms. ",
   :rdfs/member :xhv/relrev-properties})

(def grid
  {:db/ident :xhv/grid,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A grid is\n      an interactive control which contains cells of tabular data arranged in\n      rows and columns, like a table."})

(def gridcell
  {:db/ident     :xhv/gridcell,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A cell\n      in a grid or treegrid."})

(def group
  {:db/ident :xhv/group,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A set of\n      user interface objects which are not intended to be included in a page\n      summary or table of contents by assistive technologies."})

(def heading
  {:db/ident     :xhv/heading,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A heading\n      for a section of the page."})

(def help
  {:db/ident     :xhv/help,
   :rdf/type     :rdf/Property,
   :rdfa/term    "help",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#help",
   :rdfs/comment "help refers to a resource offering\n      help. ",
   :rdfs/member  :xhv/relrev-properties})

(def icon
  {:db/ident     :xhv/icon,
   :rdf/type     :rdf/Property,
   :rdfa/term    "icon",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#icon",
   :rdfs/comment "icon refers to a resource that\n      represents an icon. ",
   :rdfs/member  :xhv/relrev-properties})

(def img
  {:db/ident :xhv/img,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A container\n      for a collection of elements that form an image."})

(def index
  {:db/ident     :xhv/index,
   :rdf/type     :rdf/Property,
   :rdfa/term    "index",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#index",
   :rdfs/comment "index refers to a resource providing\n      an index. ",
   :rdfs/member  :xhv/relrev-properties})

(def itsRules
  {:db/ident :xhv/itsRules,
   :rdf/type :rdf/Property,
   :rdfa/term "itsRules",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#itsRules",
   :rdfs/comment
   "itsRules indicates that the designated\n      resource is an [ITS] rule set.",
   :rdfs/member :xhv/relrev-properties})

(def last
  {:db/ident :xhv/last,
   :rdf/type :rdf/Property,
   :rdfa/term "last",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#last",
   :rdfs/comment
   "last refers to the last resource in a\n      collection of resources. ",
   :rdfs/member :xhv/relrev-properties})

(def license
  {:db/ident :xhv/license,
   :rdf/type :rdf/Property,
   :rdfa/term "license",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#license",
   :rdfs/comment
   "license refers to a resource that\n      defines the associated license. ",
   :rdfs/member :xhv/relrev-properties})

(def link
  {:db/ident :xhv/link,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An interactive\n      reference to an internal or external resource that, when activated, causes\n      the user agent to navigate to that resource. Also see button."})

(def list
  {:db/ident :xhv/list,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A group of\n      non-interactive list items. Also see listbox."})

(def listbox
  {:db/ident :xhv/listbox,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A widget\n      that allows the user to select one or more items from a list of choices.\n      Also see combobox and list."})

(def listitem
  {:db/ident     :xhv/listitem,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A single\n      item in a list or directory."})

(def log
  {:db/ident :xhv/log,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A type of\n      live region where new information is added in meaningful order and old\n      information may disappear. Also see marquee."})

(def main
  {:db/ident     :xhv/main,
   :rdf/type     :rdf/Property,
   :rdfs/comment "acts as the\n      main content of the document. ",
   :rdfs/member  :xhv/role-properties})

(def marquee
  {:db/ident :xhv/marquee,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A type\n      of live region where non-essential information changes frequently. Also\n      see log."})

(def math
  {:db/ident     :xhv/math,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Content that\n      represents a mathematical expression. "})

(def menu
  {:db/ident :xhv/menu,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A type of\n      widget that offers a list of choices to the user."})

(def menubar
  {:db/ident :xhv/menubar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A presentation\n      of menu that usually remains visible and is usually presented horizontally."})

(def menuitem
  {:db/ident :xhv/menuitem,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An option\n      in a group of choices contained by a menu or menubar."})

(def menuitemcheckbox
  {:db/ident :xhv/menuitemcheckbox,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A\n      checkable menuitem that has three possible values: true, false, or mixed."})

(def menuitemradio
  {:db/ident :xhv/menuitemradio,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A\n      checkable menuitem in a group of menuitemradio roles, only one of which\n      can be checked at a time."})

(def meta
  {:db/ident     :xhv/meta,
   :rdf/type     :rdf/Property,
   :rdfa/term    "meta",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#meta",
   :rdfs/comment "meta refers to a resource that\n      provides metadata. ",
   :rdfs/member  :xhv/relrev-properties})

(def navigation
  {:db/ident :xhv/navigation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "indicates a collection of items suitable for\n      navigating the document or related documents.",
   :rdfs/member :xhv/role-properties})

(def next
  {:db/ident :xhv/next,
   :rdf/type :rdf/Property,
   :rdfa/term "next",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#next",
   :rdfs/comment
   "next refers to the next resource\n      (after the current one) in an ordered collection of resources. ",
   :rdfs/member :xhv/relrev-properties})

(def note
  {:db/ident :xhv/note,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "indicates\n      the content is parenthetic or ancillary to the main content of the\n      resource. ",
   :rdfs/member :xhv/role-properties})

(def option
  {:db/ident     :xhv/option,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A selectable\n      item in a select list."})

(def p3pv1
  {:db/ident     :xhv/p3pv1,
   :rdf/type     :rdf/Property,
   :rdfa/term    "p3pv1",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#p3pv1",
   :rdfs/comment "p3pv1 refers to a P3P Policy Reference\n      File [P3P]. ",
   :rdfs/member  :xhv/relrev-properties})

(def presentation
  {:db/ident :xhv/presentation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An\n      element whose implicit native role semantics will not be mapped to the\n      accessibility API."})

(def prev
  {:db/ident :xhv/prev,
   :rdf/type :rdf/Property,
   :rdfa/term "prev",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#prev",
   :rdfs/comment
   "prev refers to a previous resource\n      (before the current one) in an ordered collection of resources. ",
   :rdfs/member :xhv/relrev-properties})

(def progressbar
  {:db/ident :xhv/progressbar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An\n      element that displays the progress status for tasks that take a long time."})

(def radio
  {:db/ident :xhv/radio,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A checkable\n      input in a group of radio roles, only one of which can be checked at a\n      time."})

(def radiogroup
  {:db/ident     :xhv/radiogroup,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A group\n      of radio buttons."})

(def region
  {:db/ident :xhv/region,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A large\n      perceivable section of a web page or document, that the author feels is\n      important enough to be included in a page summary or table of contents,\n      for example, an area of the page containing live sporting event statistics."})

(def relrev-properties
  {:db/ident    :xhv/relrev-properties,
   :rdf/type    :rdf/Bag,
   :rdfs/member :xhv/role-properties})

(def role
  {:db/ident :xhv/role,
   :rdf/type #{:rdf/Bag :rdf/Property},
   :rdfa/term "role",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#role",
   :rdfs/comment
   "role indicates the purpose of the\n      resource. See the XHTML Role\n      Vocabulary for roles in this vocabulary space, and XHTMLROLE for information on extending the\n      collection of roles. ",
   :rdfs/member :xhv/relrev-properties})

(def role-properties
  {:db/ident :xhv/role-properties,
   :rdf/type #{:rdfs/member :rdf/Bag}})

(def row
  {:db/ident     :xhv/row,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A row of cells\n      in a grid."})

(def rowgroup
  {:db/ident :xhv/rowgroup,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A group\n      containing one or more row elements in a grid."})

(def rowheader
  {:db/ident :xhv/rowheader,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A cell\n      containing header information for a row in a grid."})

(def scrollbar
  {:db/ident :xhv/scrollbar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A graphical\n      object that controls the scrolling of content within a viewing area, regardless\n      of whether the content is fully displayed within the viewing area."})

(def search
  {:db/ident :xhv/search,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "indicates\n      that the section provides a search facility. ",
   :rdfs/member :xhv/role-properties})

(def section
  {:db/ident :xhv/section,
   :rdf/type :rdf/Property,
   :rdfa/term "section",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#section",
   :rdfs/comment
   "section refers to a resource serving\n      as a section in a collection. ",
   :rdfs/member :xhv/relrev-properties})

(def separator
  {:db/ident :xhv/separator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A divider\n      that separates and distinguishes sections of content or groups of menuitems."})

(def slider
  {:db/ident :xhv/slider,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A user\n      input where the user selects a value from within a given range."})

(def spinbutton
  {:db/ident :xhv/spinbutton,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A form\n      of range that expects a user to select from amongst discrete choices."})

(def start
  {:db/ident :xhv/start,
   :rdf/type :rdf/Property,
   :rdfa/term "start",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#start",
   :rdfs/comment
   "start refers to the first resource in\n      a collection of resources. ",
   :rdfs/member :xhv/relrev-properties})

(def status
  {:db/ident :xhv/status,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A container\n      whose content is advisory information for the user but is not important\n      enough to justify an alert. Also see alert."})

(def stylesheet
  {:db/ident :xhv/stylesheet,
   :rdf/type :rdf/Property,
   :rdfa/term "stylesheet",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#stylesheet",
   :rdfs/comment
   "stylesheet refers to a resource\n      serving as a stylesheet for a resource. ",
   :rdfs/member :xhv/relrev-properties})

(def subsection
  {:db/ident :xhv/subsection,
   :rdf/type :rdf/Property,
   :rdfa/term "subsection",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#subsection",
   :rdfs/comment
   "subsection refers to a resource\n      serving as a subsection in a collection. ",
   :rdfs/member :xhv/relrev-properties})

(def tab
  {:db/ident :xhv/tab,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A grouping\n      label providing a mechanism for selecting the tab content that is to be\n      rendered to the user."})

(def tablist
  {:db/ident :xhv/tablist,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A list\n      of tab elements, which are references to tabpanel elements."})

(def tabpanel
  {:db/ident :xhv/tabpanel,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A container\n      for the resources associated with a tab, where each tab is contained in\n      a tablist."})

(def textbox
  {:db/ident     :xhv/textbox,
   :rdf/type     :rdf/Property,
   :rdfs/comment "Input\n      that allows free-form text as its value."})

(def timer
  {:db/ident :xhv/timer,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A type of\n      live region containing a numerical counter which indicates an amount of\n      elapsed time from a start point, or the time remaining until an end point."})

(def toolbar
  {:db/ident :xhv/toolbar,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A collection\n      of commonly used function buttons represented in compact visual form."})

(def tooltip
  {:db/ident :xhv/tooltip,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A contextual\n      popup that displays a description for an element."})

(def top
  {:db/ident     :xhv/top,
   :rdf/type     :rdf/Property,
   :rdfa/term    "top",
   :rdfa/uri     "http://www.w3.org/1999/xhtml/vocab#top",
   :rdfs/comment "top is a synonym for start. ",
   :rdfs/member  :xhv/relrev-properties})

(def tree
  {:db/ident :xhv/tree,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A type of\n      list that may contain sub-level nested groups that can be collapsed and\n      expanded."})

(def treegrid
  {:db/ident :xhv/treegrid,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A grid\n      whose rows can be expanded and collapsed in the same manner as for a tree."})

(def treeitem
  {:db/ident :xhv/treeitem,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An option\n      item of a tree. This is an element within a tree that may be expanded or\n      collapsed if it contains a sub-level group of treeitems."})

(def up
  {:db/ident :xhv/up,
   :rdf/type :rdf/Property,
   :rdfa/term "up",
   :rdfa/uri "http://www.w3.org/1999/xhtml/vocab#up",
   :rdfs/comment
   "up refers to a resource \"above\" in a\n      hierarchically structured set. ",
   :rdfs/member :xhv/relrev-properties})

(def urn:uuid:3a375c28-3c82-570b-b1be-3de1ce3d5347112362
  {:xhv/stylesheet {:xsd/anyURI "http://www.w3.org/StyleSheets/TR/base.css"},
   :xsd/anyURI     "http://www.w3.org/1999/xhtml/vocab"})