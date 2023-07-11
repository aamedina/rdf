(ns net.wikipunk.mop
  "The Art of the Metaobject Protocol in Wikipunk.net

  The Metaobject Protocol (MOP) in wikipunk.net is a powerful and
  flexible system for defining and interacting with objects and
  classes. It provides a way to customize the behavior of objects,
  classes, and other constructs, enabling programmers to create more
  expressive and dynamic systems.

  Key Components

  `*env*`

  A dynamic variable that represents the environment in which
  metaobject idents are resolved. This could be a Datomic database, an
  XTDB node, or, if `*env*` is nil, Clojure namespaces themselves are
  searched.

  !!! WARNING: VERY EXPERIMENTAL !!!

  Docstrings based on AMOP."
  {:rdfs/seeAlso ["http://www.lispworks.com/documentation/lw80/MOP/mop/index.html"]})

(def ^:dynamic *env*
  "The `*env*` dynamic variable represents the environment in which
  metaobject idents are resolved. This could be a Datomic database, an
  XTDB node, or, if `*env*` is nil, Clojure namespaces themselves are
  searched."
  nil)

(declare find-class)

(defmulti type-of
  "Returns the type of the given object. If the object is a persistent map with a :rdf/type entry, 
  it returns the value of :rdf/type. If :rdf/type is a collection, it returns the first type that 
  satisfies the isa? relation, sorted in ascending order. If there is no :rdf/type entry, it returns 
  the Clojure type of the object."
  {:arglists '([obj & args])}
  (fn [obj & args]
    (type obj)))

(defmethod type-of :default
  [obj & args]
  (if-some [rdf-type (:rdf/type obj)]
    (if (coll? rdf-type)
      (first (sort isa? rdf-type))
      rdf-type)
    (type obj)))

(defn class-of
  "Returns the class of which the object is a direct instance."
  ([object] (class-of object nil (:env (meta object) *env*)))
  ([object error?] (class-of object error? (:env (meta object) *env*)))
  ([object error? env]
   (let [class (type-of object)]
     (if (qualified-keyword? class)
       (find-class class error? env)
       class))))

(defmulti add-dependent
  "This multimethod adds dependent to the dependents of
  metaobject. If dependent is already in the set of dependents it is
  not added again (no error is signaled).

  The multimethod map-dependents can be called to access the set of
  dependents of a class or multimethod. The multimethod
  remove-dependent can be called to remove an object from the set of
  dependents of a class or multimethod. The effect of calling
  add-dependent or remove-dependent while a call to map-dependents on
  the same class or multimethod is in progress is unspecified.

  The situations in which add-dependent is called are not specified."
  {:arglists '([metaobject dependent])}
  type-of)

(defmulti add-direct-subclass
  "This multimethod is called to maintain a set of backpointers
  from a class to its direct subclasses. This multimethod adds
  subclass to the set of direct subclasses of superclass.

  When a class is initialized, this multimethod is called once for
  each direct superclass of the class.

  When a class is reinitialized, this multimethod is called once
  for each added direct superclass of the class. The multimethod
  remove-direct-subclass is called once for each deleted direct
  superclass of the class."
  {:arglists '([superclass subclass])}
  (fn [superclass subclass]
    [(type-of superclass) (type-of subclass)]))

(defmulti change-class
  "The multimethod change-class changes the class of an instance to
  new-class. 

  When given a Clojure reference type, it updates its state and
  returns the same instance."
  {:arglists '([instance new-class & {:as initargs}])}
  (fn [instance new-class & initargs]
    [(type-of instance) (type-of new-class)]))

(defmulti compute-class-precedence-list
  "This multimethod is called to determine the class precedence
  list of a class.

  The result is a sorted set which contains each of class and its
  superclasses once and only once. The first element of the sequence
  is class and the last element is the class named :rdfs/Class.

  All methods on this multimethod must compute the class precedence
  list as a function of the ordered direct superclasses of the
  superclasses of class. The results are undefined if the rules used
  to compute the class precedence list depend on any other factors.

  When a class is finalized, `finalize-inheritance` calls this
  multimethod and associates the returned value with the class
  metaobject. The value can then be accessed by calling
  `class-precedence-list`."
  {:arglists '([class])}
  type-of)

(defmulti allocate-instance
  "This multimethod is called to create a new, uninitialized
  instance of a class. The interpretation of the concept of an
  ``uninitialized'' instance depends on the class metaobject class.

  Before allocating the new instance, class-finalized? is called to see
  if class has been finalized. If it has not been finalized,
  finalize-inheritance is called before the new instance is allocated."
  {:arglists '([class & {:as initargs}])}
  type-of)

(defmulti class-default-initargs
  "Returns a list of the default initialization arguments for
  class. Each element of this list is a canonicalized default
  initialization argument. The empty list is returned if class has no
  default initialization arguments.

  During finalization finalize-inheritance calls
  compute-default-initargs to compute the default initialization
  arguments for the class. That value is associated with the class
  metaobject and is returned by class-default-initargs.

  This multimethod signals an error if class has not been
  finalized."
  {:arglists '([class])}
  type-of)

(defmulti class-direct-default-initargs
  "Returns a list of the direct default initialization arguments for
  class. Each element of this list is a canonicalized default
  initialization argument. The empty list is returned if class has no
  direct default initialization arguments. This is the defaulted value
  of the :direct-default-initargs initialization argument that was
  associated with the class during initialization or
  reinitialization."
  {:arglists '([class])}
  type-of)

(defmulti class-direct-slots
  "Returns a set of the direct slots of class. The elements of this
  set are direct slot definition metaobjects. If the class has no
  direct slots, the empty set is returned. This is the defaulted value
  of the :direct-slots initialization argument that was associated
  with the class during initialization and reinitialization."
  {:arglists '([class])}
  type-of)

(defmulti class-direct-subclasses
  "Returns a set of the direct subclasses of class. The elements of
  this set are class metaobjects that all mention this class among
  their direct superclasses. The empty set is returned if class has no
  direct subclasses. This value is maintained by the multimethods
  add-direct-subclass and remove-direct-subclass."
  {:arglists '([class])}
  type-of)

(defmulti class-direct-superclasses
  "Returns a list of the direct superclasses of class. The elements of
  this list are class metaobjects. The empty list is returned if class
  has no direct superclasses. This is the defaulted value of the
  :direct-superclasses initialization argument that was associated
  with the class during initialization or reinitialization."
  {:arglists '([class])}
  type-of)

(defmulti class-finalized?
  "Returns true if class has been finalized. Returns false
  otherwise. Also returns false if the class has not been
  initialized."
  {:arglists '([class])}
  type-of)

(defmulti class-name
  "Returns the name of class. This value can be any Lisp object, but
  is usually a symbol, or nil if the class has no name. This is the
  defaulted value of the :name initialization argument that was
  associated with the class during initialization or
  reinitialization."
  {:arglists '([class])}
  type-of)

(defmulti class-precedence-list
  "Returns the class precedence list of class. The elements of this
  list are class metaobjects.

  During class finalization finalize-inheritance calls
  compute-class-precedence-list to compute the class precedence list
  of the class. That value is associated with the class metaobject and
  is returned by class-precedence-list.

  This multimethod signals an error if class has not been
  finalized."
  {:arglists '([class])}
  type-of)

(defmulti class-prototype
  "Returns a prototype instance of class. Whether the instance is
  initialized is not specified. The results are undefined if a
  portable program modifies the binding of any slot of prototype
  instance.

  This multimethod signals an error if class has not been
  finalized."
  {:arglists '([class])}
  type-of)

(defmulti class-slots
  "Returns a possibly empty set of the slots accessible in instances
  of class. The elements of this set are effective slot definition
  metaobjects.

  During class finalization finalize-inheritance calls compute-slots to
  compute the slots of the class. That value is associated with the
  class metaobject and is returned by class-slots.

  This multimethod signals an error if class has not been
  finalized."
  {:arglists '([class])}
  type-of)

(defmulti compute-default-initargs
  "This generic-function is called to determine the default
  initialization arguments for a class.

  The result is a list of canonicalized default initialization
  arguments, with no duplication among initialization argument names.

  All methods on this multimethod must compute the default
  initialization arguments as a function of only: 
    (i) the class precedence list of class, and 
    (ii) the direct default initialization arguments of each class in
         that list.

  The results are undefined if the rules used to compute the default
  initialization arguments depend on any other factors.

  When a class is finalized, finalize-inheritance calls this generic
  function and associates the returned value with the class
  metaobject. The value can then be accessed by calling
  class-default-initargs."
  {:arglists '([class])}
  type-of)

(defmulti compute-effective-slot-definition
  "This multimethod determines the effective slot definition for
  a slot in a class. It is called by compute-slots once for each slot
  accessible in instances of class.

  This multimethod uses the supplied list of direct slot definition
  metaobjects to compute the inheritance of slot properties for a
  single slot. The returned effective slot definition represents the
  result of computing the inheritance. The name of the new effective
  slot definition is the same as the name of the direct slot
  definitions supplied.

  The class of the effective slot definition metaobject is determined by
  calling effective-slot-definition-class. The effective slot
  definition is then created by calling make-instance. The
  initialization arguments passed in this call to make-instance are
  used to initialize the new effective slot definition metaobject. 

  See ``Initialization of Slot Definition Metaobjects'' for details."
  {:arglists '([class slot direct-slot-definitions])}
  type-of)

(defmulti compute-slots
  "This multimethod computes a set of effective slot definition
  metaobjects for the class class. The result is a list of effective
  slot definition metaobjects: one for each slot that will be
  accessible in instances of class.

  This multimethod proceeds in 3 steps:

  The first step collects the full set of direct slot definitions from
  the superclasses of class.

  The direct slot definitions are then collected into individual lists,
  one list for each slot name associated with any of the direct slot
  definitions. The slot names are compared with eql. Each such list is
  then sorted into class precedence list order. Direct slot
  definitions coming from classes earlier in the class precedence list
  of class appear before those coming from classes later in the class
  precedence list. For each slot name, the multimethod
  compute-effective-slot-definition is called to compute an effective
  slot definition. The result of compute-slots is a list of these
  effective slot definitions, in unspecified order.

  In the final step, the location for each effective slot definition is
  set. This is done by specified around-methods; portable methods
  cannot take over this behavior. For more information on the slot
  definition locations, see the section ``Instance Structure
  Protocol.''

  The list returned by this multimethod will not be mutated by the
  implementation. The results are undefined if a portable program
  mutates the list returned by this multimethod."
  {:arglists '([class])}
  type-of)

(defmulti direct-slot-definition-class
  "When a class is initialized, each of the canonicalized slot
  specifications must be converted to a direct slot definition
  metaobject. This multimethod is called to determine the class
  of that direct slot definition metaobject.

  The initargs argument is simply the canonicalized slot specification
  for the slot."
  {:arglists '([class & {:as initargs}])}
  type-of)

(defmulti effective-slot-definition-class
  "This multimethod is called by
  compute-effective-slot-definition to determine the class of the
  resulting effective slot definition metaobject. The initargs
  argument is the set of initialization arguments and values that will
  be passed to make-instance when the effective slot definition
  metaobject is created."
  {:arglists '([class & {:as initargs}])}
  type-of)

(defmulti ensure-class-using-class
  "This multimethod is called to define or modify the definition
  of a named class. It is called by the ensure-class function. It can
  also be called directly.

  The first step performed by this multimethod is to compute the
  set of initialization arguments which will be used to create or
  reinitialize the named class. The initialization arguments are
  computed from the full set of keyword arguments received by this
  multimethod as follows:

  The :metaclass argument is not included in the initialization
  arguments.

  If the :direct-superclasses argument was received by this generic
  function, it is converted into a list of class metaobjects. This
  conversion does not affect the structure of the supplied
  :direct-superclasses argument. For each element in the
  :direct-superclasses argument:

        If the element is a class metaobject, that class metaobject is used.

        If the element names a class, that class metaobject is used.

        Otherwise an instance of the class forward-referenced-class is
        created and used. The proper name of the newly created forward
        referenced class metaobject is set to name.

    All other keyword arguments are included directly in the
    initialization arguments.

  If the class argument is nil, a new class metaobject is created by
  calling the make-instance multimethod with the value of the
  :metaclass argument as its first argument, and the previously
  computed initialization arguments. The proper name of the newly
  created class metaobject is set to name. The newly created class
  metaobject is returned.

  If the class argument is a forward referenced class, change-class is
  called to change its class to the value specified by the :metaclass
  argument. The class metaobject is then reinitialized with the
  previously computed initialization arguments. (This is a documented
  violation of the general constraint that change-class not be used
  with class metaobjects.)

  If the class of the class argument is not the same as the class
  specified by the :metaclass argument, an error is signaled.

  Otherwise, the class metaobject class is redefined by calling the
  reinitialize-instance multimethod with class and the
  initialization arguments. The class argument is then returned."
  {:arglists '([class class-name & {:keys [direct-default-initargs
                                           direct-slots
                                           direct-superclasses
                                           name
                                           metaclass]
                                    :as initargs}])}
  type-of)

(defn ensure-class
  "This function is called to define or redefine a class with the
  specified name, and can be called by the user or the
  implementation. It is the functional equivalent of defclass, and is
  called by the expansion of the defclass macro.

  The behavior of this function is actually implemented by the generic
  function ensure-class-using-class. When ensure-class is called, it
  immediately calls ensure-class-using-class and returns that result
  as its own.

  The first argument to ensure-class-using-class is computed as follows:

    If name names a class (find-class returns a class when called with
    name) use that class.

    Otherwise use nil.

  The second argument is name. The remaining arguments are the
  complete set of keyword arguments received by the ensure-class
  function."
  [class-name & {:as initargs}]
  (ensure-class-using-class (find-class class-name) class-name initargs))

(defmulti finalize-inheritance
  "This multimethod is called to finalize a class metaobject.

  This is described in the Section named ``Class Finalization Protocol.''

  After `finalize-inheritance` returns, the class metaobject is finalized
  and the result of calling `class-finalized?` on the class metaobject
  will be `true`."
  {:arglists '([class])}
  type-of)

(defmulti find-class-using-env
  "Resolves a class by ident in some environment."
  {:arglists '([ident env])}
  (fn [ident env]
    [(type-of ident) (type-of env)]))

(defmulti intern-class-using-env
  "Interns a class using some environment."
  {:arglists '([class env])}
  (fn [class env]
    [(type-of class) (type-of env)]))

(defn find-class
  "Finds a class by name."
  ([ident]
   (find-class ident nil *env*))
  ([ident error?]
   (find-class ident error? *env*))
  ([ident error? env]
   (or (find-class-using-env ident env)
       (and env (find-class-using-env ident nil))
       (and error? (throw (ex-info "Could not resolve class by name." {:ident ident}))))))

(defmulti initialize-instance
  "Called by make-instance to initialize a newly created instance."
  {:arglists '([instance & {:as initargs}])}
  type-of)

(defmulti make-instance
  "Creates and returns a new instance of the given class."
  {:arglists '([class & {:as initargs}])}
  type-of)

(defmulti make-instances-obsolete
  "The function make-instances-obsolete has the effect of initiating
  the process of updating the instances of the class. During updating,
  the multimethod update-instance-for-redefined-class will be
  invoked.

  The multimethod make-instances-obsolete is invoked automatically
  by the system when defclass has been used to redefine an existing
  standard class and the set of local slots accessible in an instance
  is changed or the order of slots in storage is changed. It can also
  be explicitly invoked by the user.

  If the second of the above methods is selected, that method invokes
  make-instances-obsolete on (find-class class)."
  {:arglists '([class])}
  type-of)

(defmulti map-dependents
  "This multimethod applies function to each of the dependents of
  metaobject. The order in which the dependents are processed is not
  specified, but function is applied to each dependent once and only
  once. If, during the mapping, add-dependent or remove-dependent is
  called to alter the dependents of metaobject, it is not specified
  whether the newly added or removed dependent will have function
  applied to it."
  {:arglists '([f metaobject])}
  (fn [f metaobject] (type metaobject)))

(defmulti reinitialize-instance
  "Used to update an instance with validated initargs."
  {:arglists '([instance & {:as initargs}])}
  type-of)

(defmulti remove-dependent
  "This multimethod removes dependent from the dependents of
  metaobject. If dependent is not one of the dependents of metaobject,
  no error is signaled.

  The multimethod map-dependents can be called to access the set of
  dependents of a class or multimethod. The multimethod
  add-dependent can be called to add an object from the set of
  dependents of a class or multimethod. The effect of calling
  add-dependent or remove-dependent while a call to map-dependents on
  the same class or multimethod is in progress is unspecified."
  {:arglists '([metaobject dependent])}
  type-of)

(defmulti remove-direct-subclass
  "This multimethod is called to maintain a set of backpointers
  from a class to its direct subclasses. It removes subclass from the
  set of direct subclasses of superclass. No error is signaled if
  subclass is not in this set.

  Whenever a class is reinitialized, this multimethod is called
  once with each deleted direct superclass of the class."
  {:arglists '([superclass subclass])}
  (fn [superclass subclass]
    [(type-of superclass) (type-of subclass)]))

(defmulti shared-initialize
  "The multimethod shared-initialize is used to fill the slots of
  an instance using initargs and :initform forms. It is called when an
  instance is created, when an instance is re-initialized, when an
  instance is updated to conform to a redefined class, and when an
  instance is updated to conform to a different class.

  The multimethod shared-initialize is called by the
  system-supplied primary method for initialize-instance,
  reinitialize-instance, update-instance-for-redefined-class, and
  update-instance-for-different-class."
  {:arglists '([instance slot-names & {:as initargs}])}
  type-of)

(defmulti slot-bound-using-class?
  "This multimethod implements the behavior of the slot-bound?
  function. It is called by slot-bound? with the class of object as
  its first argument and the pertinent effective slot definition
  metaobject as its third argument.

  The multimethod slot-bound-using-class? tests whether a specific
  slot in an instance is bound.

  The results are undefined if the class argument is not the class of
  the object argument, or if the slot argument does not appear among
  the set of effective slots associated with the class argument."
  {:arglists '([class object slot])}
  (fn [class object slot]
    [(type-of class) (type-of slot)]))

(defn slot-bound?
  "Returns true if the slot named slot-name in instance is bound; otherwise, returns false."
  [object slot-name]
  (slot-bound-using-class? (class-of object) object (find-class slot-name)))

(defmulti slot-definition-allocation
  "Returns the allocation of slot. This is a symbol. This is the
  defaulted value of the :allocation initialization argument that was
  associated with the slot definition metaobject during
  initialization."
  {:arglists '([slot])}
  type-of)

(defmulti slot-definition-initargs
  "Returns the set of initialization argument keywords for slot. This
  is the defaulted value of the :initargs initialization argument that
  was associated with the slot definition metaobject during
  initialization."
  {:arglists '([slot])}
  type-of)

(defmulti slot-definition-initform
  "Returns the initialization form of slot. This can be any form. This
  is the defaulted value of the :initform initialization argument that
  was associated with the slot definition metaobject during
  initialization. When slot has no initialization form, the value
  returned is unspecified (however, slot-definition-initfunction is
  guaranteed to return nil)."
  {:arglists '([slot])}
  type-of)

(defmulti slot-definition-initfunction
  "Returns the initialization function of slot. This value is either a
  function of no arguments, or nil, indicating that the slot has no
  initialization function. This is the defaulted value of the
  :initfunction initialization argument that was associated with the
  slot definition metaobject during initialization."
  {:arglists '([slot])}
  type-of)

(defmulti slot-definition-location
  "Returns the location of effective-slot-definition. The meaning and
  interpretation of this value is described in the section called
  ``Instance Structure Protocol.''"
  {:arglists '([slot])}
  type-of)

(defmulti slot-definition-name
  "Returns the name of slot. This value is a symbol that can be used
  as a variable name. This is the value of the :name initialization
  argument that was associated with the slot definition metaobject
  during initialization."
  {:arglists '([slot])}
  type-of)

(defmulti slot-definition-readers
  "Returns a (possibly empty) set of readers of the direct slot. This
  value is a list of function names. This is the defaulted value of
  the :readers initialization argument that was associated with the
  direct slot definition metaobject during initialization."
  {:arglists '([slot])}
  type-of)

(defmulti slot-definition-type
  "Returns the type of slot. This is a type specifier name. This is
  the defaulted value of the :type initialization argument that was
  associated with the slot definition metaobject during
  initialization."
  {:arglists '([slot])}
  type-of)

(defmulti slot-definition-writers
  "Returns a (possibly empty) set of writers of the direct slot. This
  value is a list of function names. This is the defaulted value of
  the :writers initialization argument that was associated with the
  direct slot definition metaobject during initialization."
  {:arglists '([slot])}
  type-of)

(defmulti slot-exists-using-class?
  "Returns true if the object has a slot named slot-name."
  {:arglists '([class object slot-def])}
  type-of)

(defn slot-exists?
  "Returns true if the object has a slot named slot-name."
  [object slot-name]
  (slot-exists-using-class? (class-of object) object (find-class slot-name)))

(defmulti slot-makunbound-using-class
  "This multimethod implements the behavior of the
  slot-makunbound function. It is called by slot-makunbound with the
  class of object as its first argument and the pertinent effective
  slot definition metaobject as its third argument.

  The multimethod slot-makunbound-using-class restores a slot in an
  object to its unbound state. The interpretation of ``restoring a
  slot to its unbound state'' depends on the class metaobject class.

  The results are undefined if the class argument is not the class of
  the object argument, or if the slot argument does not appear among
  the set of effective slots associated with the class argument."
  {:arglists '([class instance slot-def])}
  type-of)

(defn slot-makunbound
  "Restores a slot of the name slot-name in an instance to the unbound state."
  [instance slot-name]
  (slot-makunbound-using-class (class-of instance) instance (find-class slot-name)))

(defmulti slot-missing
  "The multimethod slot-missing is invoked when an attempt is
  made to access a slot in an object whose metaclass is standard-class
  and the slot of the name slot-name is not a name of a slot in that
  class. The default method signals an error."
  {:arglists '([class object slot-name & {:as info}])}
  type-of)

(defmulti slot-unbound
  "The multimethod slot-unbound is called when an unbound slot is
  read in an instance whose metaclass is standard-class. The default
  method signals an error of type unbound-slot. The name slot of the
  unbound-slot condition is initialized to the name of the offending
  variable, and the instance slot of the unbound-slot condition is
  initialized to the offending instance."
  {:arglists '([class object slot-name])}
  type-of)

(defmulti slot-value-using-class
  "This multimethod implements the behavior of the slot-value
  function. It is called by slot-value with the class of object as its
  first argument and the pertinent effective slot definition
  metaobject as its third argument.

  The multimethod slot-value-using-class returns the value
  contained in the given slot of the given object. If the slot is
  unbound slot-unbound is called.

  The results are undefined if the class argument is not the class of
  the object argument, or if the slot argument does not appear among
  the set of effective slots associated with the class argument."
  {:arglists '([class object slot])}
  (fn [class object slot]
    [(type-of class) (type-of slot)]))

(defn slot-value
  [object slot-name]
  (slot-value-using-class (class-of object) object (find-class slot-name)))

(defmulti set-slot-value-using-class
  "The multimethod set-slot-value-using-class implements the behavior
  of the set-slot-value function. It is called by set-slot-value with
  the class of object as its second argument and the pertinent
  effective slot definition metaobject as its fourth argument.

  The multimethod set-slot-value-using-class sets the value
  contained in the given slot of the given object to the given new
  value; any previous value is lost.

  The results are undefined if the class argument is not the class of
  the object argument, or if the slot argument does not appear among
  the set of effective slots associated with the class argument."
  {:arglists '([class object slot new-value])}
  (fn [class object slot new-value]
    [(type-of class) (type-of slot)]))

(defn set-slot-value
  "(setf slot-value)"
  [object slot-name slot-value]
  (set-slot-value-using-class (class-of object) object (find-class slot-name) slot-value))

(defmulti update-dependent
  "This multimethod is called to update a dependent of
  metaobject.

  When a class or a multimethod is reinitialized each of its
  dependents is updated. The initargs argument to update-dependent is
  the set of initialization arguments received by
  reinitialize-instance.

  When a method is added to a multimethod, each of the generic
  function's dependents is updated. The initargs argument is a list of
  two elements: the symbol add-method, and the method that was added.

  When a method is removed from a multimethod, each of the generic
  function's dependents is updated. The initargs argument is a list of
  two elements: the symbol remove-method, and the method that was
  removed."
  {:arglists '([class object slot-def])}
  type-of)

(defmulti update-instance-for-different-class
  "The multimethod update-instance-for-different-class is not
  intended to be called by programmers. Programmers may write methods
  for it. The function update-instance-for-different-class is called
  only by the function change-class.
  
  The system-supplied primary method on
  update-instance-for-different-class checks the validity of initargs
  and signals an error if an initarg is supplied that is not declared
  as valid. This method then initializes slots with values according
  to the initargs, and initializes the newly added slots with values
  according to their :initform forms. It does this by calling the
  multimethod shared-initialize with the following arguments: the
  instance (current), a list of names of the newly added slots, and
  the initargs it received. Newly added slots are those local slots
  for which no slot of the same name exists in the previous class.

  Methods for update-instance-for-different-class can be defined to
  specify actions to be taken when an instance is updated. If only
  after methods for update-instance-for-different-class are defined,
  they will be run after the system-supplied primary method for
  initialization and therefore will not interfere with the default
  behavior of update-instance-for-different-class.

  Methods on update-instance-for-different-class can be defined to
  initialize slots differently from change-class. The default behavior
  of change-class is described in Section 7.2 (Changing the Class of
  an Instance).

  The arguments to update-instance-for-different-class are computed by
  change-class. When change-class is invoked on an instance, a copy of
  that instance is made; change-class then destructively alters the
  original instance. The first argument to
  update-instance-for-different-class, previous, is that copy; it
  holds the old slot values temporarily. This argument has dynamic
  extent within change-class; if it is referenced in any way once
  update-instance-for-different-class returns, the results are
  undefined. The second argument to
  update-instance-for-different-class, current, is the altered
  original instance. The intended use of previous is to extract old
  slot values by using slot-value or with-slots or by invoking a
  reader multimethod, or to run other methods that were
  applicable to instances of the original class."
  {:arglists '([previous current & {:as initargs}])}
  (fn [previous current & initargs]
    [(type-of previous) (type-of current)]))

(defmulti update-instance-for-redefined-class
  "The multimethod update-instance-for-redefined-class is not
  intended to be called by programmers. Programmers may write methods
  for it. The multimethod update-instance-for-redefined-class is
  called by the mechanism activated by make-instances-obsolete.

  The system-supplied primary method on
  update-instance-for-redefined-class checks the validity of initargs
  and signals an error if an initarg is supplied that is not declared
  as valid. This method then initializes slots with values according
  to the initargs, and initializes the newly added-slots with values
  according to their :initform forms. It does this by calling the
  multimethod shared-initialize with the following arguments: the
  instance, a list of names of the newly added-slots to instance, and
  the initargs it received. Newly added-slots are those local slots
  for which no slot of the same name exists in the old version of the
  class.

  When make-instances-obsolete is invoked or when a class has been
  redefined and an instance is being updated, a property-list is
  created that captures the slot names and values of all the
  discarded-slots with values in the original instance. The structure
  of the instance is transformed so that it conforms to the current
  class definition. The arguments to
  update-instance-for-redefined-class are this transformed instance, a
  list of added-slots to the instance, a list discarded-slots from the
  instance, and the property-list containing the slot names and values
  for slots that were discarded and had values. Included in this list
  of discarded slots are slots that were local in the old class and
  are shared in the new class.

  The value returned by update-instance-for-redefined-class is ignored."
  {:arglists '([instance added-slots discarded-slots property-list & {:as initargs}])}
  type-of)

(defmulti validate-superclass
  "This multimethod is called to determine whether the class
  superclass is suitable for use as a superclass of class.

  This multimethod can be be called by the implementation or user
  code. It is called during class metaobject initialization and
  reinitialization, before the direct superclasses are stored. If this
  multimethod returns false, the initialization or
  reinitialization will signal an error."
  {:arglists '([class superclass])}
  (fn [class superclass]
    [(type-of class) (type-of superclass)]))

(defmulti sniff
  "Follow your nose."
  {:arglists '([x])}
  type-of)
