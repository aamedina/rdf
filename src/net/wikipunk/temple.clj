(ns net.wikipunk.temple
  "The Temple of EDN: A Metaobject Protocol for Clojure."
  {:rdfs/seeAlso    ["http://www.lispworks.com/documentation/lw80/MOP/mop/index.html"]
   :dcterms/creator "Adrian Medina"}
  (:require
   [clojure.core.memoize :as memo]
   [clojure.datafy :refer [datafy]]
   [clojure.edn :as edn]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.logging :as log]
   [com.stuartsierra.component :as com]
   [net.wikipunk.openai :as openai]
   [zprint.core :as zprint]))

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

(def cpl
  (delay
    (requiring-resolve 'net.wikipunk.mop/compute-class-precedence-list)))

(def cds
  (delay
    (requiring-resolve 'net.wikipunk.mop/class-direct-slots)))

(def cs
  (delay
    (requiring-resolve 'net.wikipunk.mop/class-slots)))

(set! *print-namespace-maps* nil)

(defn- read-edn-string
  "clojure.edn/read-string with some cleanup via regex replacement"
  [s]
  (edn/read-string (-> s
                       (str/replace #"^^(\w+)" "")
                       #_(str/replace #"\\\"" "\"")
                       (str/replace #":(\w*/?)@(\w+)" ":$1$2")
                       (str/replace #"(:\w+/\w+)/(\w+)" "$1$2")
                       (str/replace #"(:\w+/)(\d\w*)" "$1|$2|")
                       (str/replace #":\"" "\""))))

(defn transmutate
  "Transmutate metaobjects into new forms.

  component -- a started instance of net.wikipunk.openai.Client

  :parents -- a collection of at least one ident naming metaobjects

  :child -- a map of properties and values that form the basis of the
  desired child.

  :prompt -- an optional instruction to refine the transmutation"
  [component & {:keys [parents child debug prompt]
                :as   params}]
  (let [[child slots] (reduce-kv (fn [[child slots] k v]
                                   [(assoc child k v) (conj slots k)])
                                 [{} [:rdf/type]] child)
        cs          (pr-str child)
        suffix      (nth cs (dec (count cs)))
        prefix      (if child
                      (str/replace cs (re-pattern (str suffix "$")) (if (empty? child) "" ","))
                      "{")
        parent-maps (remove keyword? parents)
        parent-metaobjects (->> (filter keyword? parents)
                                ;; mop/compute-class-precedence-list
                                (mapcat @cpl)
                                (distinct)
                                (remove #{:owl/Class :rdfs/Class :rdf/Property :owl/ObjectProperty :rdfs/Resource})
                                (sort (partial isa? *tree-of-life*))                     
                                (reverse)
                                (map datafy))
        parents     (concat parent-metaobjects parent-maps)
        prompt      (with-out-str
                      (println "You are tasked with generating an EDN map representing an RDF resource.

To generate the EDN maps, you should follow these guidelines:

    1. Each EDN map represents an RDF resource.
    2. Each value in the EDN map should be converted to an appropriate EDN data type.
    3. If a value in the EDN map is a nested map, it should be recursively converted to a corresponding nested EDN map.
    4. All keywords must be namespace qualified. Keywords must have namespaces and names which begin with a non-numeric character and may contain alphanumeric characters and *, +, !, -, _, ', ?, <, > and =.
    5. No values in the map should be left ungenerated.
    6. Duplicate keys are never allowed in the same EDN map.
    7. Do not include any keys or values with #db/id or :db/id.
    8. If a keyword looks like an HTTP URL, make it a string instead.
    9. Do not include any values with ellipses anywhere or summarize anything. Be descriptive.

Create RDF resources inspired by the following examples:")
                      (doseq [parent parents]
                        (println "```clojure")
                        (prn parent)
                        (println "```"))
                      (when prompt
                        (println prompt))
                      (println "```clojure")
                      (print prefix))
        _ (when debug (log/info prompt))
        params'     (assoc params
                           :prompt prompt
                           :model (or (:model params) "code-davinci-002")
                           :stop (or (:stop params) ["```" "=>" "\n{" ";;"])
                           :max_tokens (or (:max_tokens params) 1024))
        {:strs [choices]
         :as   res} (openai/completions component params')
        reasons     (group-by #(get % "finish_reason") choices)]
    (if-some [choice (some-> (get reasons "stop") (first) (get "text"))]
      (let [s (str prefix choice suffix)]
        (try
          (with-meta (read-edn-string s)
            res)
          (catch Throwable ex
            (log/error (.getMessage ex) s)
            (let [{:strs [choices]}
                  (openai/edits component (assoc params'
                                                 :instruction (str "Fix this EDN map so that it has any duplicate keys in any map have their values merged in a vector, a map must have an even number of forms, remove pairs with any ellipsis anywhere (`...`), remove all @ characters outside of strings, remove tagged literals that aren't dates, remove all invalid EDN tokens (in keywords, symbols, or strings), remove all metadata (tokens with ^/^^) and use this error message as additional context to guide the fix:" (.getMessage ex) ".")
                                                 :input s
                                                 :model "code-davinci-edit-001"))]
              (if-some [text (some-> choices
                                     (first)
                                     (get "text"))]
                (try
                  (read-edn-string text)
                  (catch Throwable ex
                    (log/error (.getMessage ex) text)))
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
                                                                        (prn (datafy ident))))))
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
