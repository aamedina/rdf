(ns net.wikipunk.openai
  "OpenAI API"
  (:require
   [clojure.datafy :refer [datafy]]
   [clojure.edn :as edn]
   [clojure.string :as str]
   [clojure.walk :as walk]
   [clj-http.client :as http]
   [clj-http.conn-mgr :as conn-mgr]
   [com.stuartsierra.component :as com]
   [net.wikipunk.rdf :as rdf]))

(defrecord OpenAI [base-uri api-key model conn-mgr http-client]
  com/Lifecycle
  (start [this]
    (let [cm  (conn-mgr/make-reusable-conn-manager {})
          res (http/get (str base-uri "/models")
                        {:oauth-token        api-key
                         :as                 :json-string-keys
                         :connection-manager cm})]
      (assoc this
             :conn-mgr cm
             :http-client (:http-client res))))
  (stop [this]
    (when ^java.io.Closeable conn-mgr
      (.close conn-mgr))
    (assoc this :conn-mgr nil :http-client nil)))

(defn make-request
  [component method path & {:as opts}]
  (let [res (http/request
              (assoc (merge {:method method :url (str (:base-uri component) path)} opts)
                     :connection-manager (:conn-mgr component)
                     :oauth-token (:api-key component)
                     :as :json-string-keys))]
    (with-meta (:body res {}) (:headers res))))

(defn models
  "Retrieves a model instance, providing basic information about the model such as the owner and permissioning."
  [component]
  (make-request component :get "/models"))

(defn model
  "Retrieves a model instance, providing basic information about the model such as the owner and permissioning."
  [component id]
  (make-request component :get (str "/models/" id)))

(defn completions
  "Retrieves a model instance, providing basic information about the model such as the owner and permissioning."
  [component & {:as params}]
  (make-request component
                :post "/completions"
                {:form-params  (assoc params
                                      :model (:model params (:model component "text-ada-001"))
                                      :temperature (:temperature params 0.7)
                                      :max_tokens (:max_tokens params 1024))
                 :content-type :json}))

(defmulti sniff
  "Locates a model for GPT-3 by type."
  rdf/type-of
  :hierarchy #'net.wikipunk.rdf/*metaobjects*)

(defmethod sniff :default
  [ident]
  (dissoc (let [e  (or (datafy ident) (rdf/sniff ident))
                md (meta e)]
            (->> (walk/postwalk (fn [form]
                                  (if-some [label (some-> (get md form) :rdfs/label)]
                                    label
                                    form))
                                e)
                 (walk/postwalk (fn [form]
                                  (if (qualified-keyword? form)
                                    (if (contains? #{"loc.works" "loc.instances" "loc.subjects"}
                                                   (str/starts-with? (namespace form) "loc"))
                                      (rdf/iri form)
                                      form)
                                    form)))
                 (walk/postwalk (fn [form]
                                  (if (and (:rdf/language form)
                                           (:rdf/value form)
                                           (str/starts-with? (:rdf/language form) "en"))
                                    (:rdf/value form)
                                    form)))
                 (walk/postwalk (fn [form]
                                  (if (sequential? form)
                                    (filterv (complement :rdf/language) form)
                                    form)))))
          :madsrdf/adminMetadata
          :madsrdf/elementList
          :madsrdf/hasBroaderAuthority
          :madsrdf/hasCloseExternalAuthority
          :madsrdf/hasNarrowerAuthority
          :madsrdf/isMemberOfMADSCollection
          :madsrdf/isMemberOfMADSScheme
          :bf/adminMetadata
          :bf/contribution
          :bf/content
          :skos/changeNote
          :skosxl/altLabel
          :skos/altLabel
          :madsrdf/hasVariant
          :skos/editorial
          :madsrdf/editorialNote
          :mop/class-slots
          :mop/class-direct-slots
          :mop/class-default-initargs
          :mop/class-direct-default-initargs))

(defn prompt
  "Given a prompt string in natural language and a namespace-qualified
  keyword naming a concept use the OpenAI completion AI to generate
  text."
  [component prompt ident & {:as params}]
  (let [{:strs [choices]} (completions component (assoc params :prompt (with-out-str
                                                                         (println "### " prompt)
                                                                         (prn (sniff ident)))))
        choices-index     (group-by #(get % "finish_reason") choices)
        stop              (first (get choices-index "stop"))]
    (str/trim (get stop "text"))))

(defn edn
  "Given a prompt string in natural language and a namespace-qualified
  keyword naming a concept use the OpenAI completion AI to generate EDN."
  [component prompt ident & {:as params}]
  (let [{:strs [choices]
         :as m}
        (completions component (assoc params
                                      :prompt (with-out-str
                                                (println "##### " prompt)
                                                (println "### Clojure")
                                                (prn (sniff ident))
                                                (println "### Clojure")
                                                (print "{"))
                                      :model (or (:model params) "code-davinci-002")))]
    (if-some [choice (some-> (first choices)
                             (get "text"))]
      (try
        (or (edn/read-string (str "{" choice)) choice)
        (catch Throwable ex
          choice))
      choices)))

(comment
  (def openai
    (com.stuartsierra.component/start 
      (net.wikipunk.openai/map->OpenAI {:base-uri "https://api.openai.com/v1"
                                        :api-key  "YOUR_OPENAPI_KEY"
                                        :model    "text-davinci-003"})))

  (net.wikipunk.openai/edn openai
                           "Write related example instances or subclasses as Clojure data (EDN)"
                           :simulation/EmblematicSimulation
                           :top_p 1.0
                           :frequency_penalty 0.1
                           :stop "###"))
