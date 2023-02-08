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

(defrecord Client [base-uri api-key conn-mgr http-client]
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
                                :as :json-string-keys
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
                     :http-client (:http-client component)
                     :connection-manager (:conn-mgr component)
                     :oauth-token (:api-key component)
                     :as :json-string-keys))]
    (with-meta (:body res {}) (dissoc res :body :http-client))))

(defn models
  "Lists the currently available models, and provides basic
  information about each one such as the owner and availability."
  [component]
  (make-request component :get "/models"))

(defn model
  "Retrieves a model instance, providing basic information about the
  model such as the owner and permissioning."
  [component id]
  (make-request component :get (str "/models/" id)))

(defn completions
  "Given a prompt, the model will return one or more predicted
  completions, and can also return the probabilities of alternative
  tokens at each position.

  :model -- ID of the model to use

  :prompt -- The prompt(s) to generate completions for, encoded as a
  string, array of strings, array of tokens, or array of token
  arrays. Note that <|endoftext|> is the document separator that the
  model sees during training, so if a prompt is not specified the
  model will generate as if from the beginning of a new document.

  :suffix -- The suffix that comes after a completion of inserted text.

  :max_tokens -- The maximum number of tokens to generate in the completion. 
  (defaults to 16)

  :temperature -- What sampling temperature to use, between 0 and
  2. Higher values like 0.8 will make the output more random, while
  lower values like 0.2 will make it more focused and deterministic.
  (defaults to 1.0)

  :top_p -- An alternative to sampling with temperature, called
  nucleus sampling, where the model considers the results of the
  tokens with top_p probability mass. So 0.1 means only the tokens
  comprising the top 10% probability mass are considered. 
  (defaults to 1.0)

  :n -- How many completions to generate for each prompt. 
  (defaults to 1)

  :stream -- Whether to stream back partial progress. If set, tokens
  will be sent as data-only server-sent events as they become
  available, with the stream terminated by a data: [DONE] message.

  :logprobs -- Include the log probabilities on the logprobs most
  likely tokens, as well the chosen tokens. For example, if logprobs
  is 5, the API will return a list of the 5 most likely tokens. The
  API will always return the logprob of the sampled token, so there
  may be up to logprobs+1 elements in the response.

  :echo -- Echo back the prompt in addition to the completion.

  :stop -- Up to 4 sequences where the API will stop generating
  further tokens. The returned text will not contain the stop
  sequence.

  :presence_penalty -- Number between -2.0 and 2.0. Positive values
  penalize new tokens based on whether they appear in the text so far,
  increasing the model's likelihood to talk about new topics.
  (defaults to 0)

  :frequency_penalty -- Number between -2.0 and 2.0. Positive values
  penalize new tokens based on their existing frequency in the text so
  far, decreasing the model's likelihood to repeat the same line
  verbatim.
  (defaults to 0)

  :best_of -- Generates best_of completions server-side and returns
  the 'best' (the one with the highest log probability per
  token). Results cannot be streamed.

  :logit_bias -- Modify the likelihood of specified tokens appearing
  in the completion.

  :user -- A unique identifier representing your end-user, which can
  help OpenAI to monitor and detect abuse."
  [component & {:as params}]
  (make-request component
                :post "/completions"
                {:form-params  (select-keys (cond-> (assoc params :model (or (:model params) "text-ada-001"))
                                              (sequential? (:stop params))
                                              (update :stop (partial str/join \,)))
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
  "Creates a new edit for the provided input, instruction, and parameters.

  :model -- ID of the model to use

  :input -- The input text to use as a starting point for the edit.
  (defaults to empty string)

  :instruction -- The instruction that tells the model how to edit the
  prompt.

  :n -- How many edits to generate for the input and instruction.
  (defaults to 1)

  :temperature -- What sampling temperature to use, between 0 and
  2. Higher values like 0.8 will make the output more random, while
  lower values like 0.2 will make it more focused and deterministic.
  (defaults to 1)

  :top_p -- An alternative to sampling with temperature, called
  nucleus sampling, where the model considers the results of the
  tokens with top_p probability mass. So 0.1 means only the tokens
  comprising the top 10% probability mass are considered."
  [component & {:as params}]
  (make-request component
                :post "/edits"
                {:form-params  (select-keys (assoc params :model (or (:model params) "text-davinci-edit-001"))
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
