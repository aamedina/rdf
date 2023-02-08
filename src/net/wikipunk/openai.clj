(ns net.wikipunk.openai
  "Frequency and presence penalties

The frequency and presence penalties found in the Completions API
can be used to reduce the likelihood of sampling repetitive
sequences of tokens. They work by directly modifying the logits
(un-normalized log-probabilities) with an additive contribution.

mu[j] -> mu[j] - c[j] * alpha_frequency - float(c[j] > 0) * alpha_presence

Where:

    mu[j] is the logits of the j-th token
    c[j] is how often that token was sampled prior to the current position
    float(c[j] > 0) is 1 if c[j] > 0 and 0 otherwise
    alpha_frequency is the frequency penalty coefficient
    alpha_presence is the presence penalty coefficient

As we can see, the presence penalty is a one-off additive
contribution that applies to all tokens that have been sampled at
least once and the frequency penalty is a contribution that is
proportional to how often a particular token has already been
sampled.

Reasonable values for the penalty coefficients are around 0.1 to 1
if the aim is to just reduce repetitive samples somewhat. If the
aim is to strongly suppress repetition, then one can increase the
coefficients up to 2, but this can noticeably degrade the quality
of samples. Negative values can be used to increase the likelihood
of repetition."
  (:require
   [clojure.core.memoize :as memo]
   [clojure.datafy :refer [datafy]]
   [clojure.edn :as edn]
   [clojure.string :as str]
   [clojure.walk :as walk]
   [clojure.tools.logging :as log]
   [clj-http.client :as http]
   [clj-http.conn-mgr :as conn-mgr]
   [com.stuartsierra.component :as com]))

(defrecord Client [base-uri api-key model conn-mgr http-client]
  com/Lifecycle
  (start [this]
    (let [api-key  (or api-key (System/getenv "OPENAI_API_KEY"))
          base-uri (or base-uri "https://api.openai.com/v1")
          cm       (conn-mgr/make-reusable-conn-manager {})
          res      (when api-key
                     ;; only create the http-client when there is an
                     ;; api-key provided by the user
                     (http/get (str base-uri "/models")
                               {:oauth-token        api-key
                                :as                 :json-string-keys
                                :connection-manager cm}))]
      (assoc this
             :base-uri base-uri
             :api-key api-key
             :conn-mgr cm
             :http-client (:http-client res))))
  (stop [this]
    (when conn-mgr
      (.close ^java.io.Closeable conn-mgr))
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
                {:form-params  (select-keys (assoc params
                                                   :model (:model params (:model component "text-ada-001"))
                                                   :max_tokens (:max_tokens params 1024))
                                            [:model
                                             :temperature
                                             :prompt
                                             :max_tokens
                                             :suffix
                                             :top_p
                                             :n
                                             :stream
                                             :logprobs
                                             :echo
                                             :stop
                                             :presence_penalty
                                             :frequency_penalty
                                             :best_of
                                             :logit-bias
                                             :user])
                 :content-type :json}))

(defn edits
  "Creates a new edit for the provided input, instruction, and parameters."
  [component instruction & {:as params}]
  (make-request component
                :post "/edits"
                {:form-params  (select-keys (assoc params
                                                   :model (or (:model params) "text-davinci-edit-001")
                                                   :instruction instruction
                                                   :max_tokens (:max_tokens params 1024))
                                            [:model
                                             :temperature
                                             :input
                                             :top_p
                                             :n
                                             :instruction])
                 :content-type :json}))

(defn moderations
  "Classifies if text violates OpenAI's Content Policy"
  [component input & {:keys [model]
                      :or   {model "text-moderation-latest"}}]
  (make-request component
                :post "/moderations"
                {:form-params  {:model model :input input}
                 :content-type :json}))
