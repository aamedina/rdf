(ns net.wikipunk.temple
  "The Temple of EDN: A Metaobject Protocol for Clojure."
  {:rdfs/seeAlso    ["http://www.lispworks.com/documentation/lw80/MOP/mop/index.html"]
   :dcterms/creator "Adrian Medina"}
  (:require
   [clojure.core.memoize :as memo]
   [clojure.edn :as edn]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.logging :as log]
   [com.stuartsierra.component :as com]
   [net.wikipunk.openai :as openai]))

(def ^:dynamic *tree-of-life*
  "A Clojure multimethod hierarchy combining rdf/*classes*,
  rdf/*properties*, and instances of :owl/NamedIndividual."
  (make-hierarchy))

(defrecord Temple [vocab rdf]
  com/Lifecycle
  (start [this]
    (let []
      (when-some [conn (:conn rdf)]
        ((requiring-resolve 'net.wikipunk.rdf/bootstrap) *tree-of-life* conn :force? false))
      this))
  (stop [this]
    (alter-var-root #'*tree-of-life* (constantly (make-hierarchy)))
    this))

(def sniff (memo/memo (requiring-resolve 'net.wikipunk.mop/sniff)))

(def cpl (memo/memo (requiring-resolve 'net.wikipunk.mop/compute-class-precedence-list)))

(set! *print-namespace-maps* nil)

(defn transmutate
  "Transmutate metaobjects into new forms.

  component -- a started instance of net.wikipunk.openai.Client

  :parents -- a collection of at least one ident naming metaobjects

  :child -- a map of properties and values that form the basis of the
  desired child, you should probably include at least a :db/ident."
  [component & {:keys [parents child]
                :as   params}]
  (let [child-str         (pr-str child)
        suffix            (last child-str)
        prefix            (when child
                            (str/replace child-str (re-pattern (str suffix "$")) ""))
        prompt            (with-out-str
                            (doseq [parent (->> parents
                                                ;; mop/compute-class-precedence-list
                                                (mapcat cpl)
                                                (distinct)
                                                (sort (partial isa? *tree-of-life*))
                                                (reverse)
                                                ;; mop/sniff
                                                (map sniff))]
                              (println "```clojure")
                              (prn (sniff parent))
                              (println "```"))
                            (println "```clojure")
                            (when prefix
                              (println prefix)))
        params'           (assoc params
                                 :prompt prompt
                                 :model (or (:model params) "code-davinci-002")
                                 :stop (or (:stop params) "```")
                                 :frequency_penalty (or (:frequency_penalty params) 0.1)
                                 :max_tokens (or (:max_tokens params) 1024))
        {:strs [choices] :as res} (openai/completions component params')
        reasons (group-by #(get % "finish_reason") choices)]
    (if-some [choice (some-> (get reasons "stop") (first) (get "text"))]
      (let [s (str prefix choice suffix)]
        (try
          (let [val (with-meta (edn/read-string s)
                      res)]
            (cond-> val
              (map? val) (dissoc :mop/class-precedence-list
                                 :mop/class-slots
                                 :mop/class-direct-slots
                                 :mop/class-direct-subclasses
                                 :mop/class-direct-superclasses
                                 :mop/class-default-initargs
                                 :mop/class-direct-default-initargs)))
          (catch Throwable ex
            (log/warn (.getMessage ex) choice)
            (let [{:strs [choices]}
                  (openai/edits component (assoc params'
                                                 :instruction (str "Fix the Clojure (EDN) data so that it can be read by the Clojure reader, a map must have no duplicate keys, and maps must contain an even number of forms, remove '@' from all symbols, remove unsupported escape characters from all strings and symbols, and use this error message as additional context:" (.getMessage ex) ", or return `:openai.error/unreadable`")
                                                 :input s
                                                 :model "code-davinci-edit-001"))]
              (if-some [text (some-> choices
                                     (first)
                                     (get "text"))]
                (try
                  (edn/read-string text)
                  (catch Throwable ex
                    (log/warn (.getMessage ex) choice)))
                choices)))))
      choices)))

(defn prompt
  "Given a prompt string in natural language and a namespace-qualified
  keyword naming a concept use the OpenAI completion AI to generate
  text."
  [component & {:keys [prompt ident] :as params}]
  (let [{:strs [choices]} (openai/completions component
                                              (assoc params :prompt (with-out-str
                                                                      (println "### " prompt)
                                                                      (when ident
                                                                        (prn (sniff ident))))))
        choices-index     (group-by #(get % "finish_reason") choices)
        stop              (first (get choices-index "stop"))]
    (if-some [txt (get stop "text")]
      (str/trim txt)
      choices)))

(comment
  ;; assuming the system is started in the dev namespace

  (temple/transmutate (:openai system)
                      :parents [:simulation/Simulation
                                :simulation/Simulacrum]
                      :child {:db/ident :hyperreal/HumorSimulation}
                      :temperature 0.9)

  {:db/ident                  :simulation/HumorSimulation,
   :mop/class-precedence-list [:simulation/HumorSimulation
                               :simulation/EmblematicSimulation
                               :simulation/Simulation :owl/Class :rdfs/Class],
   :rdf/type                  :owl/Class,
   :rdfs/comment              "A specific kind of Emblematic Simulation in which a funny event in the Game design is mapped to the real world, like a funny or embarrassing situation in the player's life. A Humor Simulation is usually bound to tell something about the player, based on the embodied interaction paradigm.@en",
   :rdfs/isDefinedBy          :simulation/SimulationOntology,
   :rdfs/label                "Humor Simulation@en",
   :rdfs/subClassOf           :simulation/EmblematicSimulation}

  {:db/ident              :hyperreal/HumorSimulation,
   :rdf/type              :simulation/Simulation,
   :simulation/hasContext {:db/ident                  :simulation/Situation,
                           :mop/class-precedence-list [:situation/Situation
                                                       :prov/Entity :owl/Thing
                                                       :rdfs/Resource],
                           :rdf/type                  :situation/Situation},
   :simulation/hasRealityCounterpart
   {:db/ident :simulation/Humor,
    :mop/class-precedence-list
    [:simulation/Humor :simulation/RealityCounterpart :semiotics/Expression
     :semiotics/InformationEntity :owl/Class :rdfs/Class],
    :rdf/type :simulation/Humor},
   :simulation/hasSimulacrum
   {:db/ident :simulation/Joke,
    :mop/class-precedence-list
    [:simulation/Joke :simulation/Simulacrum :semiotics/Expression
     "http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl#InformationObject"
     :owl/Class :rdfs/Class],
    :rdf/type :simulation/Joke}}

  {:db/ident                         :hyperreal/HumorSimulation,
   :rdf/type                         :owl/NamedIndividual,
   :rdfs/comment
   "Humor is, I have understood, that which is absurd. A joke, for example, can be absurd. There are jokes that are not humorous, and this, I have understood, is the reason why: humor comes from the juxtaposition between the personal reality of an individual and the hyperreality that is imposed to us by societal and cultural norms.@en",
   :rdfs/isDefinedBy                 :hyperreal/HyperrealOntology,
   :rdfs/label                       "Humor@en",
   :simulation/hasRealityCounterpart :hyperreal/Humor,
   :simulation/hasSimulacrum         :hyperreal/TheJoker}

  {:db/ident   :hyperreal/HumorSimulation,
   :rdf/type   :simulation/Simulation,
   :rdfs/comment
   "A gateway drug to parody and satire. Frequently used by comics to make a story or statement more acceptable or palatable to the average audience so they can stand to hear the message.@en",
   :rdfs/label "Humor@en"}

  {:db/ident :hyperreal/HumorSimulation,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A simulation of the concept of humor. It is the symbolic relationship that happens between a certain type of joke and its symbolic meaning, namely laughing.@en",
   :rdfs/label "Humor Simulation@en",
   :rdfs/subClassOf [:simulation/Simulation
                     {:owl/onProperty     :simulation/hasContext,
                      :owl/someValuesFrom :hyperreal/HumorContext,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :simulation/hasRealityCounterpart,
                      :owl/someValuesFrom :hyperreal/HumorRealityCounterpart,
                      :rdf/type           :owl/Restriction}]}

  {:db/ident                         :hyperreal/HumorSimulation,
   :mop/class-precedence-list        [:hyperreal/HumorSimulation :simulation/Simulation
                                      :owl/Class :rdfs/Class],
   :rdfs/comment                     "Simulation of humor by cultural hybrids@en",
   :rdfs/label                       "Hyperreal Humor Simulation@en",
   :simulation/hasContext
   {:db/ident             :hyperreal/InterpretationBasedOriginationContext,
    :prov/wasAttributedTo "http://dbpedia.org/resource/Burp@en",
    :rdf/type             :simulation/Context},
   :simulation/hasRealityCounterpart [:hyperreal/HyperReality],
   :simulation/hasSimulacrum
   {:db/ident                  :hyperreal/Symbol,
    :mop/class-precedence-list [:semiotics//Expression
                                :semiotics//InformationEntity],
    :semiotics//denotes        {:db/ident :hyperreal/Meaning,
                                :mop/class-precedence-list
                                [:semiotics//Expression
                                 :semiotics//InformationEntity]}}}

  {:db/ident                 :hyperreal/HumorSimulation,
   :mop/class-links          [:simulation/Simulacrum],
   :mop/function-links       [:simulation/isSimulacrumOf],
   :mop/function-precedence  [:hyperreal/HumorSimulation],
   :owl/onProperty           :simulation/isSimulacrumOf,
   :owl/qualifiedCardinality 1,
   :rdf/type                 :owl/ObjectProperty,
   :rdfs/comment             "A simulation which produces a hyperreal humor.@en",
   :rdfs/domain              :simulation/Simulation,
   :rdfs/isDefinedBy         :simulation/SimulationOntology,
   :rdfs/label               "Hyperreal Humor Simulation@en",
   :rdfs/range               :simulation/Humor}

  {:db/ident         :hyperreal/HumorSimulation,
   :rdf/type         :owl/Class,
   :rdfs/comment
   "A humor simulation uses fictional events and makes them appear real. It is based on the First-Order Simulation.@en",
   :rdfs/isDefinedBy :hyperreal/HyperrealityOntology,
   :rdfs/label       "HumorSimulation@en",
   :rdfs/subClassOf
   {:owl/intersectionOf
    [:simulation/Simulation
     {:owl/intersectionOf
      [{:owl/onProperty     :situation/hasBeginTime,
        :owl/someValuesFrom {:owl/oneOf
                             [:situation/presentTime
                              :ontology_of_space_time_paradoxes/present]},
        :rdf/type           :owl/Restriction}
       {:owl/onProperty     :situation/hasEndTime,
        :owl/someValuesFrom {:owl/oneOf
                             [:situation/presentTime
                              :ontology_of_space_time_paradoxes/present]},
        :rdf/type           :owl/Restriction}]}
     {:owl/intersectionOf
      [{:owl/allValuesFrom :ontology_of_space_time_paradoxes/DoomedStar,
        :owl/onProperty
        :ontology_of_space_time_paradoxes/isSpaceTimeObjectivePresentationOf,
        :rdf/type          :owl/Restriction}
       {:owl/onClass              :literal_semantics_for_time#ObjectivePresentation,
        :owl/onProperty           :simulation/hasSimulacrum,
        :owl/qualifiedCardinality 1,
        :rdf/type                 :owl/Restriction}]}]}})
