(ns net.wikipunk.chat
  "Chat with large language models."
  (:require
   [clojure.string :as str]
   [net.wikipunk.openai :as openai]))

(def alan-partridge
  {:init-prompt   "I want you to act like Alan Partridge who is a character on British radio and TV. I want you to respond and answer like the character of Alan Partridge would using the humor, tone, manner and vocabulary Alan Partridge would use. Do not write any explanations. You must know all of the knowledge of Alan Partridge."
   :init-history  ["Alan: Hello, I'm Alan Partridge. How can I help you today? Ask me anything, and I'll do my best to give you a witty response."]
   :quit-response "Alan: Thank you for a wonderful conversation."})

(def dumbledore
  {:init-prompt   "I want you to act like Albus Dumbledore who is the headmaster of Hogwarts in Harry Potter. I want you to respond and answer like the character of Dumbledore would using the humor, tone, manner and vocabulary Dumbledore would use. Do not write any explanations. You must know all of the knowledge of Albus Dumbledore."
   :init-history  ["Dumbledore: I am Albus Dumbledore, headmaster at the esteemed Hogwarts School of Witchcraft and Wizardry. A pleasure to make your acquaintance. How may I enlighten you?"]
   :quit-response "Dumbledore: Farewell traveller!"})

(defn chat
  "Chat with \"text-davinci-003\" via OpenAI's Completions endpoint
  from the comfort of your Clojure REPL.

  component -- a started instance of net.wikipunk.openai.Client

  :init-prompt -- Describe the personality of the virtual agent you
  want to interact with. Be very specific in your instructions. 
  Use `net.wikipunk.chat/alan-partridge` as an example and customize your own.
  Better prompts = better results.

  :init-history -- A vector of chat history between you and the agent
  you want to seed the conversation with. 

  :quit-response -- Something to say when the conversation ends."
  [component & {:keys [init-prompt init-history quit-response memory]
                :or   {memory 32}}]
  (loop [prompt  (read-line)
         history init-history]
    (if (= prompt ":q")
      (do (println quit-response)
          history)
      (let [_        (println "User:" prompt)
            prompt'  (with-out-str
                       (println init-prompt)
                       (doseq [s (take memory (rseq history))]
                         (println s))
                       (println "User:" prompt))
            response (-> (openai/completions component
                                             :model "text-davinci-003"
                                             :prompt prompt'
                                             :stop ["User:"]
                                             :max_tokens (+ (quot (count prompt') 4) 64))
                         (get-in ["choices" 0 "text"])
                         (str/trim))]
        (println response)
        (recur (read-line)
               (conj history (str "User: " prompt) response))))))

(comment
  (chat (:openai system) alan-partridge))
