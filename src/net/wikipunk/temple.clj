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

(defn transmutate
  "Transmutate metaobjects into new forms.

  component -- a started instance of net.wikipunk.openai.Client

  :parents -- a collection of at least one ident naming metaobjects

  :child -- a map of properties and values that form the basis of the
  desired child, you should probably include at least a :db/ident."
  [component & {:keys [parents child]
                :as   params}]
  (let [suffix            (or (:suffix params) "}")
        prefix            (when child
                            (str/replace (pr-str child) (re-pattern (str suffix "$")) ","))
        prompt            (with-out-str
                            (when-some [prompt (:prompt params)]
                              (println "##### " (:prompt params)))
                            (println "### Clojure")
                            (doseq [parent parents]
                              (prn (sniff parent)))
                            (println "### Clojure")
                            (when prefix
                              (print prefix)))
        params'           (assoc params
                                 :prompt prompt
                                 :model (or (:model params) "code-davinci-002")
                                 :stop (str suffix \newline)
                                 :suffix suffix
                                 :top_p (or (:top_p params) 1.0))
        {:strs [choices]} (openai/completions component params')
        reasons (group-by #(get % "finish_reason") choices)]
    (if-some [choice (some-> (get reasons "stop") (first) (get "text"))]
      (try
        (dissoc (edn/read-string (str prefix (str/replace choice #"\"@(\w+)," "\",") suffix))
                :mop/class-precedence-list
                :mop/class-slots
                :mop/class-direct-slots
                :mop/class-direct-subclasses
                :mop/class-direct-superclasses
                :mop/class-default-initargs
                :mop/class-direct-default-initargs)
        (catch Throwable ex
          (log/warn (.getMessage ex) choice)
          nil))
      choices)))

(defn prompt
  "Given a prompt string in natural language and a namespace-qualified
  keyword naming a concept use the OpenAI completion AI to generate
  text."
  [component prompt ident & {:as params}]
  (let [{:strs [choices]} (openai/completions component
                                              (assoc params :prompt (with-out-str
                                                                      (println "### " prompt)
                                                                      (when ident
                                                                        (prn (sniff ident))))))
        choices-index     (group-by #(get % "finish_reason") choices)
        stop              (first (get choices-index "stop"))]
    (str/trim (get stop "text"))))

(comment
  ;; assuming the system is started in the dev namespace

  (temple/transmutate (:openai system)
                      :prompt "Write related example instances or subclasses as Clojure data (EDN)"
                      :parents [:simulation/EmblematicSimulation
                                :simulation/Simulacrum]
                      :child {:db/ident :simulation/HumorSimulation}
                      :temperature 0.9
                      :frequency_penalty 0.1)

  ;; This is a cherry-picked but nevertheless real example!
  {:db/ident                  :simulation/HumorSimulation,
   :mop/class-precedence-list [:simulation/HumorSimulation
                               :simulation/EmblematicSimulation
                               :simulation/Simulation :owl/Class :rdfs/Class],
   :rdf/type                  :owl/Class,
   :rdfs/comment              "A specific kind of Emblematic Simulation in which a funny event in the Game design is mapped to the real world, like a funny or embarrassing situation in the player's life. A Humor Simulation is usually bound to tell something about the player, based on the embodied interaction paradigm.@en",
   :rdfs/isDefinedBy          :simulation/SimulationOntology,
   :rdfs/label                "Humor Simulation@en",
   :rdfs/subClassOf           :simulation/EmblematicSimulation})
