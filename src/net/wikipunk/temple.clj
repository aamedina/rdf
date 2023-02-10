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

(def sniff
  (delay
    (memo/memo (requiring-resolve 'net.wikipunk.mop/sniff))))

(def cpl
  (delay
    (memo/memo (requiring-resolve 'net.wikipunk.mop/compute-class-precedence-list))))

(set! *print-namespace-maps* nil)

(defn transmutate
  "Transmutate metaobjects into new forms.

  component -- a started instance of net.wikipunk.openai.Client

  :parents -- a collection of at least one ident naming metaobjects

  :child -- a map of properties and values that form the basis of the
  desired child, you should probably include at least a :db/ident."
  [component & {:keys [parents child]
                :as   params}]
  (let [child-str   (pr-str child)
        suffix      (last child-str)
        prefix      (when child
                      (str/replace child-str (re-pattern (str suffix "$")) ","))
        prompt      (with-out-str
                      (println "Create an RDF resource with these classes as inspiration and context:")
                      (doseq [parent (->> parents
                                          ;; mop/compute-class-precedence-list
                                          (mapcat @cpl)
                                          (distinct)
                                          (sort (partial isa? *tree-of-life*))
                                          (reverse)
                                          ;; mop/sniff
                                          (map @sniff))]
                        (println "```clojure")
                        (prn (@sniff parent))
                        (println "```"))
                      (println "```clojure")
                      (when prefix
                        (println prefix)))
        params'     (assoc params
                           :prompt prompt
                           :model (or (:model params) "code-davinci-002")
                           :stop (or (:stop params) "```")
                           :frequency_penalty (or (:frequency_penalty params) 0.1)
                           :max_tokens (or (:max_tokens params) 1024))
        {:strs [choices]
         :as   res} (openai/completions component params')
        reasons     (group-by #(get % "finish_reason") choices)]
    (if-some [choice (some-> (get reasons "stop") (first) (get "text"))]
      (let [s (str prefix choice suffix)]
        (try
          (let [val (with-meta (edn/read-string (-> (str/replace s #"@en" "")))
                      res)]
            (cond-> val
              (map? val) (dissoc :mop/class-precedence-list
                                 :mop/class-slots
                                 :mop/class-direct-subclasses
                                 :mop/class-direct-superclasses
                                 :mop/class-default-initargs
                                 :mop/class-direct-default-initargs)))
          (catch Throwable ex
            (log/warn (.getMessage ex) choice)
            (let [{:strs [choices]}
                  (openai/edits component (assoc params'
                                                 :instruction (str "Fix the Clojure (EDN) data so that it can be read by the Clojure reader, a map must have no duplicate keys, maps must contain an even number of forms, remove `@` from all symbols, remove pairs with any ellipsis anywhere (`...`), remove tagged literals (anything started with # that isn't a set), remove all invalid EDN tokens (in keywords, symbols, or strings), remove all metadata (tokens with ^/^^) and use this error message as additional context to guide the fix:" (.getMessage ex))
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
                                                                        (prn (@sniff ident))))))
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

  {:db/ident        :hyperreal/HumorSimulation,
   :rdf/type        :owl/Class,
   :rdfs/comment
   "A simulation of the concept of humor. It is the symbolic relationship that happens between a certain type of joke and its symbolic meaning, namely laughing.@en",
   :rdfs/label      "Humor Simulation@en",
   :rdfs/subClassOf [:simulation/Simulation
                     {:owl/onProperty     :simulation/hasContext,
                      :owl/someValuesFrom :hyperreal/HumorContext,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :simulation/hasRealityCounterpart,
                      :owl/someValuesFrom :hyperreal/HumorRealityCounterpart,
                      :rdf/type           :owl/Restriction}]}

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

  {:db/ident                   :hyperreal/HumorSimulation,
   :hyperreal/hasMetaFacets
   [{:console/fold :hyperreal/RIDICULE}
    {:console/fold :hyperreal/IRONY,
     :console/overrideFolds
     [:hyperreal/MIME_SCREENPLAY_EXCERPT
      :hyperreal/POLITICAL_IMPOSTURE
      :hyperreal/TRADITIONAL_JEST
      :hyperreal/_JOKE_MARGIN]}
    {:console/fold          :hyperreal/_SATIRE,
     :console/overrideFolds [:hyperreal/SOCIAL_SATIRUM
                             :hyperreal/MORAL_PENETRATION]}
    {:console/fold          :hyperreal/_COMEDY,
     :console/overrideFolds [:hyperreal/_SLAPSTICK_COMEDY :hyperreal/_PARODY]}],
   :hyperreal/restoredEntities #{:hyperspecificity/REDEMPTION},
   :rdf/type                   [:owl/Class :hyperreal/MetaSimulation],
   :rdfs/comment
   "a metadata simulation instance simulating possible values of :simulation/hasSimulacrum.",
   :rdfs/isDefinedBy           :hyperreal/HyperrealOntology,
   :rdfs/label                 "humor simulation"})
