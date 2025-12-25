(ns net.wikipunk.ontology.compiler
  "Compile SPARQL algebra (EDN) into executable Clojure functions."
  (:require
   [clojure.set :as set]
   [clojure.string :as str]
   [net.wikipunk.ontology.node :as node])
  (:import
   (java.net URLEncoder)
   (java.nio.charset StandardCharsets)
   (java.util.regex Pattern PatternSyntaxException)))

(set! *warn-on-reflection* true)

;; -----------------------------------------------------------------------------
;; Eval helpers

(def ^:private eval-error ::eval-error)
(def ^:private ebv-error ::ebv-error)

(defn- var-name [s]
  (keyword s))

(defn- node->value
  "Return the scalar value corresponding to a canonical node."
  [n]
  (cond
    (node/literal-node? n) (node/literal-value n)
    (node/node? n) (second n)
    :else n))

(defn- node->numeric [n]
  (cond
    (number? n) (bigdec n)
    (node/literal-node? n)
    (let [v (node/literal-value n)]
      (cond
        (instance? Number v) (bigdec v)
        :else (try (bigdec (node/literal-lex n))
                   (catch NumberFormatException _
                     eval-error))))
    :else eval-error))

(defn- node->pattern
  "Coerce a canonical node into term pattern data."
  [node]
  (when (node/node? node)
    (let [[tag payload] node]
      (case tag
        :var {:term :var :name (var-name payload) :node node}
        :iri {:term :iri :value payload :node node}
        :literal {:term :literal
                  :raw payload
                  :value (node/literal-value node)
                  :node node}
        :bnode {:term :bnode :id payload :node node}
        :node {:term :node :value payload :node node}
        :triple {:term :triple :value payload :node node}
        :triple-node {:term :triple-node :value payload :node node}
        {:term tag :value payload :node node}))))

(defn- ensure-literal-node [info default]
  (if info
    (node/literal-node (:lex info) (:dt info) (:lang info))
    default))

(defn- realize-term
  "Produce a canonical node for term given binding and blank-node scope."
  [term binding ^java.util.Map bnode-scope]
  (case (:term term)
    :var (get binding (:name term))
    :iri (or (:node term)
             (node/iri-node (:value term)))
    :literal (or (:node term)
                 (ensure-literal-node (:raw term)
                                      (node/ensure-node :object (:value term))))
    :node (:node term)
    :triple-node (:node term)
    :bnode (let [key (or (:node term) (:id term) term)]
             (if bnode-scope
               (let [existing (.get bnode-scope key)]
                 (if existing
                   existing
                   (let [fresh (node/bnode-node (str (java.util.UUID/randomUUID)))]
                     (.put bnode-scope key fresh)
                     fresh)))
               (node/bnode-node (str (java.util.UUID/randomUUID)))))
    (:node term)))

;; -----------------------------------------------------------------------------
;; Expression compilation

(def ^:private arithmetic-ops
  {:+ +
   :- -
   :* *
   :/ /})

(def ^:private boolean-ops
  {:|| (fn [values] (boolean (some true? values)))
   :&& (fn [values] (every? true? values))})

(def ^:private comparison-ops
  {:>= >=
   :>  >
   :<= <=
   :<  <
   :=  =
   :!= not=})

(defn- apply-fn [f args]
  (apply f args))

(def ^:private iri-function-map
  {node/xsd-decimal  (fn [x] (bigdec x))
   node/xsd-integer  (fn [x] (Long/parseLong (str x)))
   node/xsd-double   (fn [x] (double x))
   node/xsd-boolean  (fn [x] (Boolean/parseBoolean x))})

(declare compile-expr compile-node-expr builtin-function)

(defn- compile-function-call [[fn-node & args]]
  (let [fn-iri (second fn-node)
        f      (get iri-function-map fn-iri identity)
        arg-fs (map compile-expr args)]
    (fn [binding]
      (let [values (map #(% binding) arg-fs)]
        (apply-fn f values)))))

;; -----------------------------------------------------------------------------
;; Built-in SPARQL function support

(defn- coerce-double
  ^Double [value]
  (cond
    (nil? value) nil
    (double? value) value
    (number? value) (double value)
    (string? value)
    (try
      (Double/parseDouble ^String value)
      (catch NumberFormatException _ nil))
    :else nil))

(defn- string-literal
  "Return {:lex :lang :datatype :node} or {:error eval-error}."
  [value node]
  (cond
    (node/literal-node? node)
    (let [info (second node)
          dt (:dt info)
          lang (:lang info)
          lex (:lex info)]
      (cond
        (and dt
             (not (or (= dt node/xsd-string)
                      (= dt node/rdf-string)
                      (= dt node/rdf-lang-string))))
        {:error eval-error}
        :else
        {:lex lex
         :lang lang
         :datatype (cond
                     lang nil
                     (nil? dt) nil
                     (= dt node/xsd-string) node/xsd-string
                     (= dt node/rdf-string) node/xsd-string
                     :else nil)
         :node node}))

    (string? value)
    {:lex value :lang nil :datatype nil :node nil}

    :else {:error eval-error}))

(defn- make-string-node [lex {:keys [lang datatype]}]
  (cond
    lang (node/literal-node lex nil lang)
    datatype (node/literal-node lex datatype nil)
    :else (node/literal-node lex nil nil)))

(defn- string-result [lex info]
  {:value lex
   :node (make-string-node lex info)})

(defn- boolean-result [v]
  {:value (boolean v)})

(defn- integer-result [n]
  {:value n
   :node (node/literal-node (str n) node/xsd-integer nil)})

(defn- encode-for-uri [^String s]
  (let [encoded (URLEncoder/encode s StandardCharsets/UTF_8)]
    (-> encoded
        (str/replace "+" "%20")
        (str/replace "*" "%2A")
        (str/replace "%7E" "~"))))

(defn- substring-by-codepoints
  [^String s ^long start-index ^long length]
  (let [codepoints (.toArray (.codePoints s))
        cp-count   (alength codepoints)
        start      (max 0 (min cp-count start-index))
        len        (max 0 (min (- cp-count start) length))
        sb         (StringBuilder.)]
    (loop [idx start
           remaining len]
      (if (pos? remaining)
        (do
          (.appendCodePoint sb (aget codepoints idx))
          (recur (inc idx) (dec remaining)))
        (.toString sb)))))

(defn- eval-substr [string-info start length]
  (let [{:keys [lex lang datatype]} string-info
        start-double (coerce-double start)
        length-double (when (some? length) (coerce-double length))]
    (cond
      (nil? lex) {:error eval-error}
      (or (nil? start-double) (Double/isNaN start-double) (Double/isInfinite start-double)) {:error eval-error}
      (and (some? length)
           (or (nil? length-double) (Double/isNaN length-double) (Double/isInfinite length-double))) {:error eval-error}
      (and (some? length-double) (neg? length-double))
      (string-result "" {:lang lang :datatype datatype})
      :else
      (let [^String text lex
            cp-count (.codePointCount text 0 (.length text))
            start-index (-> start-double Math/ceil int dec (max 0))
            effective-length (if (some? length-double)
                               (-> length-double Math/floor int (max 0))
                               (- cp-count start-index))
            substring (substring-by-codepoints text start-index effective-length)]
        (string-result substring {:lang lang :datatype datatype})))))

(defn- ensure-iri [value node]
  (cond
    (and (node/node? node) (= :iri (first node))) {:iri (second node)}
    (string? value) {:iri value}
    :else {:error eval-error}))

(defn- compile-builtin-substr [args]
  (let [str-expr   (first args)
        start-expr (second args)
        len-expr   (nth args 2 nil)
        str-value-fn (compile-expr str-expr)
        str-node-fn  (compile-node-expr str-expr)
        start-fn      (compile-expr start-expr)
        length-fn     (when len-expr (compile-expr len-expr))]
    (fn [binding]
      (let [string-info (string-literal (str-value-fn binding)
                                        (str-node-fn binding))]
        (if (:error string-info)
          {:error eval-error}
          (eval-substr string-info
                       (start-fn binding)
                       (when length-fn (length-fn binding))))))))

(defn- compile-strlen [arg]
  (let [value-fn (compile-expr arg)
        node-fn  (compile-node-expr arg)]
    (fn [binding]
      (let [info (string-literal (value-fn binding) (node-fn binding))]
        (if (:error info)
          {:error eval-error}
          (let [^String text (:lex info)
                length (.codePointCount text 0 (.length text))]
            (integer-result length)))))))

(defn- compile-strstarts [str-expr prefix-expr]
  (let [str-fn (compile-expr str-expr)
        str-node-fn (compile-node-expr str-expr)
        pref-fn (compile-expr prefix-expr)
        pref-node-fn (compile-node-expr prefix-expr)]
    (fn [binding]
      (let [s-info (string-literal (str-fn binding) (str-node-fn binding))
            p-info (string-literal (pref-fn binding) (pref-node-fn binding))]
        (if (or (:error s-info) (:error p-info))
          {:error eval-error}
          (boolean-result (.startsWith ^String (:lex s-info)
                                      ^String (:lex p-info))))))))

(defn- compile-strends [str-expr suffix-expr]
  (let [str-fn (compile-expr str-expr)
        str-node-fn (compile-node-expr str-expr)
        suff-fn (compile-expr suffix-expr)
        suff-node-fn (compile-node-expr suffix-expr)]
    (fn [binding]
      (let [s-info (string-literal (str-fn binding) (str-node-fn binding))
            p-info (string-literal (suff-fn binding) (suff-node-fn binding))]
        (if (or (:error s-info) (:error p-info))
          {:error eval-error}
          (boolean-result (.endsWith ^String (:lex s-info)
                                     ^String (:lex p-info))))))))

(defn- compile-contains [str-expr pattern-expr]
  (let [str-fn (compile-expr str-expr)
        str-node-fn (compile-node-expr str-expr)
        pat-fn (compile-expr pattern-expr)
        pat-node-fn (compile-node-expr pattern-expr)]
    (fn [binding]
      (let [s-info (string-literal (str-fn binding) (str-node-fn binding))
            p-info (string-literal (pat-fn binding) (pat-node-fn binding))]
        (if (or (:error s-info) (:error p-info))
          {:error eval-error}
          (boolean-result (str/includes? (:lex s-info) (:lex p-info))))))))


(defn- compile-strbefore [str-expr pattern-expr]
  (let [str-fn (compile-expr str-expr)
        str-node-fn (compile-node-expr str-expr)
        pat-fn (compile-expr pattern-expr)
        pat-node-fn (compile-node-expr pattern-expr)]
    (fn [binding]
      (let [s-info (string-literal (str-fn binding) (str-node-fn binding))
            p-info (string-literal (pat-fn binding) (pat-node-fn binding))
            pattern-lang (:lang p-info)
            pattern-dt (:datatype p-info)
            string-lang (:lang s-info)]
        (if (or (:error s-info) (:error p-info))
          {:error eval-error}
          (if (or (and pattern-lang (not (and string-lang (= pattern-lang string-lang))))
                  (and pattern-dt (not= pattern-dt node/xsd-string)))
            {:error eval-error}
            (let [^String text (:lex s-info)
                  ^String pattern (:lex p-info)
                  idx (.indexOf text pattern)]
              (if (neg? idx)
                (string-result "" {:lang nil :datatype node/xsd-string})
                (let [lex (.substring text 0 idx)
                      result-lang string-lang
                      result-dt (cond
                                  result-lang nil
                                  (= (:datatype s-info) node/xsd-string) node/xsd-string
                                  :else nil)]
                  (string-result lex {:lang result-lang :datatype result-dt}))))))))))

(defn- compile-strafter [str-expr pattern-expr]
  (let [str-fn (compile-expr str-expr)
        str-node-fn (compile-node-expr str-expr)
        pat-fn (compile-expr pattern-expr)
        pat-node-fn (compile-node-expr pattern-expr)]
    (fn [binding]
      (let [s-info (string-literal (str-fn binding) (str-node-fn binding))
            p-info (string-literal (pat-fn binding) (pat-node-fn binding))
            pattern-lang (:lang p-info)
            pattern-dt (:datatype p-info)
            string-lang (:lang s-info)]
        (if (or (:error s-info) (:error p-info))
          {:error eval-error}
          (if (or (and pattern-lang (not (and string-lang (= pattern-lang string-lang))))
                  (and pattern-dt (not= pattern-dt node/xsd-string)))
            {:error eval-error}
            (let [^String text (:lex s-info)
                  ^String pattern (:lex p-info)
                  idx (.indexOf text pattern)]
              (if (neg? idx)
                (string-result "" {:lang nil :datatype node/xsd-string})
                (let [start (+ idx (.length pattern))
                      lex (.substring text start)
                      result-lang string-lang
                      result-dt (cond
                                  result-lang nil
                                  (= (:datatype s-info) node/xsd-string) node/xsd-string
                                  :else nil)]
                  (string-result lex {:lang result-lang :datatype result-dt}))))))))))
(defn- compile-concat [args]
  (let [value-fns (map compile-expr args)
        node-fns  (map compile-node-expr args)]
    (fn [binding]
      (let [infos (map (fn [vf nf]
                         (string-literal (vf binding) (nf binding)))
                       value-fns node-fns)]
        (if (some :error infos)
          {:error eval-error}
          (let [lexicals (map :lex infos)
                langs    (remove nil? (map :lang infos))
                datatypes (remove nil? (map :datatype infos))
                lang-set (set langs)]
            (cond
              (> (count lang-set) 1) {:error eval-error}
              (and (seq datatypes)
                   (some #(not= % node/xsd-string) datatypes)) {:error eval-error}
              :else
              (let [result-lex (apply str lexicals)
                    result-lang (first lang-set)
                    result-dt (if result-lang nil node/xsd-string)]
                (string-result result-lex {:lang result-lang :datatype result-dt})))))))))

(defn- compile-lcase [arg]
  (let [value-fn (compile-expr arg)
        node-fn  (compile-node-expr arg)]
    (fn [binding]
      (let [info (string-literal (value-fn binding) (node-fn binding))]
        (if (:error info)
          {:error eval-error}
          (string-result (str/lower-case (:lex info))
                         {:lang (:lang info) :datatype (:datatype info)}))))))

(defn- compile-ucase [arg]
  (let [value-fn (compile-expr arg)
        node-fn  (compile-node-expr arg)]
    (fn [binding]
      (let [info (string-literal (value-fn binding) (node-fn binding))]
        (if (:error info)
          {:error eval-error}
          (string-result (str/upper-case (:lex info))
                         {:lang (:lang info) :datatype (:datatype info)}))))))

(def ^:private lang-tag-pattern
  #"[a-zA-Z]{1,8}(?:-[a-zA-Z0-9]{1,8})*")

(defn- canonical-lang-tag [tag]
  (->> (str/split tag #"-")
       (map-indexed (fn [idx part]
                      (cond
                        (zero? idx) (str/lower-case part)
                        (= (count part) 2) (str/upper-case part)
                        :else (str/lower-case part))))
       (str/join "-")))

(defn- compile-strlang [[str-expr lang-expr]]
  (let [str-fn (compile-expr str-expr)
        str-node-fn (compile-node-expr str-expr)
        lang-fn (compile-expr lang-expr)]
    (fn [binding]
      (let [s-info (string-literal (str-fn binding) (str-node-fn binding))
            lang-val (lang-fn binding)]
        (if (or (:error s-info)
                (:lang s-info)
                (and (:datatype s-info) (not= (:datatype s-info) node/xsd-string))
                (not (string? lang-val))
                (str/blank? lang-val))
          {:error eval-error}
          (let [lang (canonical-lang-tag lang-val)]
            (if (re-matches lang-tag-pattern lang)
              (string-result (:lex s-info) {:lang lang :datatype nil})
              {:error eval-error})))))))

(defn- compile-strdt [[str-expr iri-expr]]
  (let [str-fn (compile-expr str-expr)
        str-node-fn (compile-node-expr str-expr)
        iri-fn (compile-expr iri-expr)
        iri-node-fn (compile-node-expr iri-expr)]
    (fn [binding]
      (let [s-info (string-literal (str-fn binding) (str-node-fn binding))
            iri-info (ensure-iri (iri-fn binding) (iri-node-fn binding))]
        (if (or (:error s-info)
                (:error iri-info)
                (:lang s-info)
                (and (:datatype s-info) (not= (:datatype s-info) node/xsd-string)))
          {:error eval-error}
          (string-result (:lex s-info) {:lang nil :datatype (:iri iri-info)}))))))

(defn- compile-lang [arg]
  (let [node-fn (compile-node-expr arg)]
    (fn [binding]
      (let [node (node-fn binding)]
        (if (node/literal-node? node)
          (let [lang (or (get-in node [1 :lang]) "")]
            (string-result (str/lower-case lang) {:lang nil :datatype node/xsd-string}))
          {:error eval-error})))))

(defn- lang-matches? [lang pattern]
  (let [lang (str/lower-case (or lang ""))
        pattern (str/lower-case (or pattern ""))]
    (cond
      (= pattern "*") (not (str/blank? lang))
      (str/blank? pattern) (str/blank? lang)
      (= lang pattern) true
      (str/blank? lang) false
      :else (str/starts-with? lang (str pattern "-")))))

(defn- compile-langMatches [[lang-expr pattern-expr]]
  (let [lang-fn (compile-expr lang-expr)
        lang-node-fn (compile-node-expr lang-expr)
        pattern-fn (compile-expr pattern-expr)
        pattern-node-fn (compile-node-expr pattern-expr)]
    (fn [binding]
      (let [lang-info (string-literal (lang-fn binding) (lang-node-fn binding))
            pattern-info (string-literal (pattern-fn binding) (pattern-node-fn binding))]
        (if (or (:error lang-info) (:error pattern-info))
          {:error eval-error}
          (boolean-result (lang-matches? (:lex lang-info) (:lex pattern-info))))))))

(defn- compile-str-fn [arg]
  (let [value-fn (compile-expr arg)
        node-fn  (compile-node-expr arg)]
    (fn [binding]
      (let [node (node-fn binding)
            value (value-fn binding)]
        (cond
          (node/literal-node? node)
          (string-result (node/literal-lex node) {:lang nil :datatype node/xsd-string})

          (and (node/node? node) (= :iri (first node)))
          (string-result (second node) {:lang nil :datatype node/xsd-string})

          (string? value)
          (string-result value {:lang nil :datatype node/xsd-string})

          :else {:error eval-error})))))

(defn- pattern-flags [flags]
  (reduce
   (fn [acc ch]
     (case ch
       \i (bit-or acc Pattern/CASE_INSENSITIVE)
       \m (bit-or acc Pattern/MULTILINE)
       \s (bit-or acc Pattern/DOTALL)
       \x (bit-or acc Pattern/COMMENTS)
       acc))
   0
   flags))

(defn- compile-replace [args]
  (let [str-expr (first args)
        pattern-expr (second args)
        replacement-expr (nth args 2)
        flags-expr (nth args 3 nil)
        str-fn (compile-expr str-expr)
        str-node-fn (compile-node-expr str-expr)
        pat-fn (compile-expr pattern-expr)
        pat-node-fn (compile-node-expr pattern-expr)
        repl-fn (compile-expr replacement-expr)
        repl-node-fn (compile-node-expr replacement-expr)
        flags-fn (when flags-expr (compile-expr flags-expr))
        flags-node-fn (when flags-expr (compile-node-expr flags-expr))]
    (fn [binding]
      (let [s-info (string-literal (str-fn binding) (str-node-fn binding))
            p-info (string-literal (pat-fn binding) (pat-node-fn binding))
            r-info (string-literal (repl-fn binding) (repl-node-fn binding))
            f-info (when flags-expr (string-literal (flags-fn binding) ((or flags-node-fn (constantly nil)) binding)))]
        (if (or (:error s-info) (:error p-info) (:error r-info) (and f-info (:error f-info)))
          {:error eval-error}
          (let [flags (if f-info (:lex f-info) "")
                literal? (some #{\q} flags)
                pattern-text (if literal?
                               (Pattern/quote (:lex p-info))
                               (:lex p-info))
                flag-chars (remove #{\q} flags)
                flag-int (pattern-flags flag-chars)]
            (try
              (let [pattern (Pattern/compile pattern-text flag-int)
                    ^java.util.regex.Matcher matcher (.matcher pattern ^String (:lex s-info))
                    replaced (.replaceAll matcher ^String (:lex r-info))
                    result-info (if (:lang s-info)
                                  {:lang (:lang s-info) :datatype nil}
                                  {:lang nil :datatype node/xsd-string})]
                (string-result replaced result-info))
              (catch PatternSyntaxException _
                {:error eval-error}))))))))

(defn- compile-encode-for-uri [arg]
  (let [value-fn (compile-expr arg)
        node-fn  (compile-node-expr arg)]
    (fn [binding]
      (let [info (string-literal (value-fn binding) (node-fn binding))]
        (if (:error info)
          {:error eval-error}
          (string-result (encode-for-uri (:lex info)) {:lang nil :datatype node/xsd-string}))))))

(defn- builtin-function [tag args]
  (case tag
    :substr (compile-builtin-substr args)
    :strlen (compile-strlen (first args))
    :strstarts (compile-strstarts (first args) (second args))
    :strends (compile-strends (first args) (second args))
    :contains (compile-contains (first args) (second args))
    :strbefore (compile-strbefore (first args) (second args))
    :strafter (compile-strafter (first args) (second args))
    :concat (compile-concat args)
    :lcase (compile-lcase (first args))
    :ucase (compile-ucase (first args))
    :strlang (compile-strlang args)
    :strdt (compile-strdt args)
    :lang (compile-lang (first args))
    :langMatches (compile-langMatches args)
    :str (compile-str-fn (first args))
    :replace (compile-replace args)
    :encode_for_uri (compile-encode-for-uri (first args))
    nil))

(defn compile-expr
  "Compile an algebra expression vector into a function of bindings."
  [expr]
  (cond
    (vector? expr)
    (let [[tag & rest] expr
          builtin (builtin-function tag rest)]
      (cond
        (= tag :var)
        (let [k (var-name (first rest))]
          (fn [binding]
            (let [v (get binding k)]
              (node->value v))))

        (= tag :literal)
        (let [lit (first rest)
              value (node/literal->value lit)]
          (fn [_] value))

        (= tag :iri)
        (let [iri (first rest)]
          (fn [_] iri))

        (= tag :bnode)
        (fn [_] (node/bnode-node (str (java.util.UUID/randomUUID))))

        (= tag :bound)
        (let [inner (compile-expr (first rest))]
          (fn [binding] (some? (inner binding))))

        (= tag :coalesce)
        (let [fns (map compile-expr rest)]
          (fn [binding]
            (loop [[f & fs] fns]
              (let [v (when f (f binding))]
                (cond
                  (nil? f) nil
                  (some? v) v
                  :else (recur fs))))))

        (= tag :if)
        (let [[test-expr then-expr else-expr] rest
              test-fn (compile-expr test-expr)
              then-fn (compile-expr then-expr)
              else-fn (compile-expr else-expr)]
          (fn [binding]
            (if (true? (test-fn binding))
              (then-fn binding)
              (else-fn binding))))

        (= tag :not)
        (let [pred (compile-expr (first rest))]
          (fn [binding] (not (pred binding))))

        (contains? boolean-ops tag)
        (let [op (boolean-ops tag)
              arg-fns (map compile-expr rest)]
          (fn [binding]
            (op (map #(boolean (% binding)) arg-fns))))

        (contains? arithmetic-ops tag)
        (let [op (arithmetic-ops tag)
              arg-fns (map compile-expr rest)]
          (fn [binding]
            (apply op (map #(% binding) arg-fns))))

        (contains? comparison-ops tag)
        (let [op (comparison-ops tag)
              arg-fns (map compile-expr rest)]
          (fn [binding]
            (apply op (map #(% binding) arg-fns))))

        builtin
        (fn [binding]
          (let [{:keys [value error]} (builtin binding)]
            (if error
              eval-error
              value)))

        (and (vector? tag) (= (first tag) :iri))
        (compile-function-call expr)

        :else
        (throw (ex-info "Unsupported expression form"
                        {:expr expr}))))

    :else (fn [_] expr)))

(defn- compile-node-expr
  "Compile expression into canonical node producer."
  [expr]
  (cond
    (nil? expr) (fn [_] nil)
    (vector? expr)
    (let [[tag & rest] expr
          builtin (builtin-function tag rest)]
      (cond
        (= tag :var)
        (let [k (var-name (first rest))]
          (fn [binding] (get binding k)))

        (= tag :literal)
        (let [lit (first rest)
              node (node/literal-node (:lex lit) (:dt lit) (:lang lit))]
          (fn [_] node))

        (= tag :iri)
        (let [node (node/iri-node (first rest))]
          (fn [_] node))

        (= tag :bnode)
        (let [node (node/bnode-node (first rest))]
          (fn [_] node))

        (= tag :node)
        (let [node (:node expr)]
          (fn [_] node))

        (= tag :constant)
        (let [node (:node expr)]
          (fn [_] node))

        builtin
        (fn [binding]
          (let [{:keys [value node error]} (builtin binding)]
            (cond
              error nil
              (node/node? node) node
              :else (when (some? value)
                      (node/ensure-node :object value)))))

        :else
        (let [value-fn (compile-expr expr)]
          (fn [binding]
            (let [value (value-fn binding)]
              (when (some? value)
                (node/ensure-node :object value)))))))
    :else
    (let [node (node/ensure-node :object expr)]
      (fn [_] node))))

;; -----------------------------------------------------------------------------
;; Dataset helpers

(def ^:private index-key ::index)

(def ^:private empty-index
  {:by-sub {}
   :by-pred {}
   :by-sp {}
   :by-graph {}
   :by-obj {}
   :by-po {}
   :nodes #{}})

(defn- add-entry
  [m k triple]
  (let [m (or m {})]
    (assoc m k (if-let [bucket (get m k)]
                 (conj bucket triple)
                 #{triple}))))

(defn- remove-entry
  [m k triple]
  (let [m (or m {})]
    (if-let [bucket (get m k)]
      (let [bucket' (disj bucket triple)]
        (if (seq bucket')
          (assoc m k bucket')
          (dissoc m k)))
      m)))

(defn- update-index-add
  [index triple]
  (let [{:keys [graph s p]} triple
        index (or index empty-index)]
    (-> index
        (update :by-sub #(add-entry % s triple))
        (update :by-pred #(add-entry % p triple))
        (update :by-sp #(add-entry % [s p] triple))
        (update :by-graph #(add-entry % graph triple))
        (update :by-obj #(add-entry % (:o triple) triple))
        (update :by-po #(add-entry % [p (:o triple)] triple))
        (update :nodes #(-> (or % #{}) (conj s) (conj (:o triple)))))))

(defn- update-index-remove
  [index triple]
  (let [{:keys [graph s p]} triple
        index (or index empty-index)]
    (-> index
        (update :by-sub #(remove-entry % s triple))
        (update :by-pred #(remove-entry % p triple))
        (update :by-sp #(remove-entry % [s p] triple))
        (update :by-graph #(remove-entry % graph triple))
        (update :by-obj #(remove-entry % (:o triple) triple))
        (update :by-po #(remove-entry % [p (:o triple)] triple)))))

(defn- build-index
  [triples]
  (reduce update-index-add empty-index triples))

(defn- ensure-dataset
  [dataset]
  (let [ds (node/canonical-dataset (or dataset {:triples #{}}))]
    (if (get ds index-key)
      ds
      (assoc ds index-key (build-index (:triples ds))))))

(defn- dataset-triples [dataset]
  (:triples (ensure-dataset dataset)))

(defn- dataset-index [dataset]
  (get (ensure-dataset dataset) index-key))

(defn- dataset-node-set [dataset]
  (or (get (dataset-index dataset) :nodes) #{}))

(defn- collect-objects [triples]
  (into #{} (map :o) triples))

(defn- collect-subjects [triples]
  (into #{} (map :s) triples))

(defn- forward-objects
  [idx subject predicate]
  (if-let [triples (get-in idx [:by-sp [subject predicate]])]
    (collect-objects triples)
    #{}))

(defn- backward-subjects
  [idx predicate object]
  (if-let [triples (get-in idx [:by-po [predicate object]])]
    (collect-subjects triples)
    #{}))

(defn- outgoing-by-predicate
  [idx subject]
  (if-let [triples (get (:by-sub idx) subject)]
    (reduce (fn [m {:keys [p o] :as t}]
              (update m p (fnil conj #{}) o))
            {}
            triples)
    {}))

(defn- incoming-by-predicate
  [idx object]
  (if-let [triples (get (:by-obj idx) object)]
    (reduce (fn [m {:keys [p s] :as t}]
              (update m p (fnil conj #{}) s))
            {}
            triples)
    {}))

(declare eval-path unify-term)

(defn- transitive-path
  [dataset nodes expr direction include-zero?]
  (let [start (set nodes)]
    (loop [seen (if include-zero? start #{})
           frontier (if include-zero? start start)
           results (if include-zero? start #{})]
      (if (empty? frontier)
        (if include-zero? seen results)
        (let [step (set (mapcat #(eval-path dataset #{%} expr direction) frontier))
              step (if include-zero? step (set/difference step start))
              new (set/difference step seen)]
          (if (empty? new)
            (if include-zero? seen (set/union results step))
            (recur (set/union seen new)
                   new
                   (if include-zero?
                     (set/union results new)
                     (set/union results new)))))))))

(defn- eval-notoneof
  [dataset nodes forbidden direction]
  (let [idx (dataset-index dataset)
        forbidden-set (set (map (fn [term]
                                  (if (= (first term) :iri)
                                    (node/iri-node (second term))
                                    (throw (ex-info "Unsupported term in NOT ONE OF path"
                                                    {:term term}))))
                                forbidden))]
    (case direction
      :forward
      (reduce
       (fn [acc node]
         (let [outs (outgoing-by-predicate idx node)]
           (reduce-kv (fn [acc pred targets]
                        (if (contains? forbidden-set pred)
                          acc
                          (set/union acc targets)))
                      acc
                      outs)))
       #{}
       nodes)

      :reverse
      (reduce
       (fn [acc node]
         (let [incoming (incoming-by-predicate idx node)]
           (reduce-kv (fn [acc pred sources]
                        (if (contains? forbidden-set pred)
                          acc
                          (set/union acc sources)))
                      acc
                      incoming)))
       #{}
       nodes))))

(defn- eval-path
  [dataset nodes expr direction]
  (let [nodes (set nodes)]
    (if (empty? nodes)
      #{}
      (let [[tag & rest] expr
            idx (dataset-index dataset)]
        (case tag
          :iri
          (let [pred (node/iri-node (first rest))]
            (if (= direction :forward)
              (reduce (fn [acc node]
                        (set/union acc (forward-objects idx node pred)))
                      #{}
                      nodes)
              (reduce (fn [acc node]
                        (set/union acc (backward-subjects idx pred node)))
                      #{}
                      nodes)))

          :reverse
          (eval-path dataset nodes (first rest) (if (= direction :forward) :reverse :forward))

          :seq
          (if (= direction :forward)
            (reduce (fn [current sub]
                      (if (empty? current)
                        #{}
                        (eval-path dataset current sub :forward)))
                    nodes
                    rest)
            (reduce (fn [current sub]
                      (if (empty? current)
                        #{}
                        (eval-path dataset current sub :reverse)))
                    nodes
                    (reverse rest)))

          :alt
          (reduce (fn [acc sub]
                    (set/union acc (eval-path dataset nodes sub direction)))
                  #{}
                  rest)

          :path*
          (transitive-path dataset nodes (first rest) direction true)

          :path+
          (transitive-path dataset nodes (first rest) direction false)

          :path?
          (set/union nodes (eval-path dataset nodes (first rest) direction))

          :notoneof
          (eval-notoneof dataset nodes rest direction)

          :var
          ;; variable path treated as predicate variable - unsupported
          (throw (ex-info "Variable property paths are not supported"
                          {:expr expr}))

          (throw (ex-info "Unsupported property path operator"
                          {:expr expr})))))))

(defn- candidate-nodes
  [node-universe term binding]
  (case (:term term)
    :var (if-let [value (get binding (:name term))]
           #{value}
           (or node-universe #{}))
    (:iri :literal :node :constant :bnode :triple-node)
    (if-let [node (:node term)]
      #{node}
      #{})
    #{(:node term)}))

(defn- path-pairs
  [dataset start-nodes path-expr]
  (set (mapcat (fn [start]
                 (let [ends (eval-path dataset #{start} path-expr :forward)]
                   (map (fn [end] [start end]) ends)))
               start-nodes)))

(defn- compile-path [[subject path-expr object]]
  (let [s-term (node->pattern subject)
        o-term (node->pattern object)]
    (fn [dataset bindings]
      (let [ds (ensure-dataset dataset)
            node-universe (dataset-node-set ds)]
        (mapcat
         (fn [binding]
           (let [start-candidates (candidate-nodes node-universe s-term binding)]
             (mapcat
              (fn [[start end]]
                (let [b1 (unify-term s-term start binding)]
                  (if b1
                    (if-let [b2 (unify-term o-term end b1)]
                      [b2]
                      [])
                    [])))
              (path-pairs ds start-candidates path-expr))))
         bindings)))))

(defn- add-triple [dataset triple]
  (let [ds (ensure-dataset dataset)
        triple (node/canonical-triple triple)]
    (-> ds
        (update :triples (fnil conj #{}) triple)
        (update index-key #(update-index-add % triple)))))

(defn- remove-triple [dataset triple]
  (let [ds (ensure-dataset dataset)
        triple (node/canonical-triple triple)]
    (-> ds
        (update :triples (fnil disj #{}) triple)
        (update index-key #(update-index-remove % triple)))))

;; -----------------------------------------------------------------------------
;; Pattern matching

(defn- unify-term
  [term value binding]
  (case (:term term)
    :var (let [k (:name term)
               current (get binding k)]
           (if (or (nil? current) (= current value))
             (assoc binding k value)
             nil))
    :iri (when (= value (:node term)) binding)
    :literal (when (= value (:node term)) binding)
    :node (when (= value (:node term)) binding)
    :constant (when (= value (:node term)) binding)
    :bnode (let [k [:bnode (:id term)]
                 current (get binding k)]
             (if (or (nil? current) (= current value))
               (assoc binding k value)
               nil))
    :triple-node (when (= value (:node term)) binding)
    binding))

(defn- graph->pattern [graph]
  (cond
    (nil? graph) nil
    (node/node? graph) {:term :constant :node graph}
    (= graph :default) {:term :constant :node :default}
    (= graph :union)   {:term :constant :node :union}
    (keyword? graph) {:term :constant :node graph}
    :else {:term :constant :node (node/iri-node (str graph))}))

(defn- constant-node
  [term]
  (when (and term
             (not= :var (:term term))
             (not= :bnode (:term term)))
    (:node term)))

(defn- candidate-triples
  [dataset s-term p-term graph-term]
  (let [ds (ensure-dataset dataset)
        idx (dataset-index ds)
        triples (:triples ds)
        graph-node (when (and graph-term (= (:term graph-term) :constant))
                     (:node graph-term))
        s-node (constant-node s-term)
        p-node (constant-node p-term)
        base (cond
               (and idx s-node p-node) (get-in idx [:by-sp [s-node p-node]])
               (and idx s-node)        (get-in idx [:by-sub s-node])
               (and idx p-node)        (get-in idx [:by-pred p-node])
               (and idx graph-node
                     (not= graph-node :union)) (get-in idx [:by-graph graph-node])
               :else triples)
        base (or base #{})
        filtered (if (and graph-node (not= graph-node :union))
                   (let [pred (if (= graph-node :default)
                                #(= :default (:graph %))
                                #(= graph-node (:graph %)))]
                     (if (identical? base triples)
                       (set (filter pred base))
                       (set (filter pred base))))
                   (if (set? base) base (set base)))]
    {:triples filtered}))

(defn- match-triple
  ([dataset triple binding]
   (match-triple dataset triple binding nil))
  ([dataset triple binding graph-term]
   (let [[_ s p o] triple
         s-term (node->pattern s)
         p-term (node->pattern p)
         o-term (node->pattern o)
         {:keys [triples]} (candidate-triples dataset s-term p-term graph-term)]
     (for [{:keys [graph s p o]} triples
           :let [b0 (if graph-term
                      (unify-term graph-term graph binding)
                      binding)]
           :when b0
           :let [b1 (unify-term s-term s b0)]
           :when b1
           :let [b2 (unify-term p-term p b1)]
           :when b2
           :let [b3 (unify-term o-term o b2)]
           :when b3]
       b3))))

;; -----------------------------------------------------------------------------
;; Algebra compilation (queries)

(defn- literal-node->number
  [node default-value]
  (cond
    (nil? node) default-value
    (= node :_) default-value
    (node/literal-node? node)
    (let [value (node/literal-value node)]
      (cond
        (instance? Number value) (long value)
        :else (try
                (Long/parseLong (node/literal-lex node))
                (catch NumberFormatException _ default-value))))
    (node/node? node)
    (try
      (Long/parseLong (str (second node)))
      (catch NumberFormatException _ default-value))
    (number? node) (long node)
    :else default-value))

(defn- compatible-bindings?
  [left right]
  (let [shared (set/intersection (set (keys left)) (set (keys right)))]
    (every? (fn [k]
              (= (get left k) (get right k)))
            shared)))

(defn- merge-bindings
  [left right]
  (reduce-kv (fn [acc k v]
               (if-let [existing (get acc k)]
                 (if (= existing v)
                   acc
                   (reduced ::conflict))
                 (assoc acc k v)))
             left
             right))

(declare compile-algebra)

(defn- compile-bgp [patterns]
  (let [pattern-vec (vec patterns)]
    (fn [dataset bindings]
      (let [ds (ensure-dataset dataset)]
        (reduce
         (fn [solutions triple]
           (mapcat #(match-triple ds triple %) solutions))
         bindings
         pattern-vec)))))

(defn- compile-filter [[expr subop]]
  (let [pred (compile-expr expr)
        subf (compile-algebra subop)]
    (fn [dataset bindings]
      (for [binding (subf dataset bindings)
            :when (true? (pred binding))]
        binding))))

(defn- compile-extend [[bind-spec subop]]
  (let [entries (map (fn [[var-node expr]]
                       {:key (var-name (second var-node))
                        :value-fn (compile-expr expr)
                        :node-fn (compile-node-expr expr)})
                     bind-spec)
        subf    (compile-algebra subop)]
    (fn [dataset bindings]
      (for [binding (subf dataset bindings)]
        (reduce (fn [acc {:keys [key value-fn node-fn]}]
                  (let [value (when value-fn (value-fn acc))]
                    (cond
                      (or (= value eval-error)
                          (= value ebv-error)) acc
                      (nil? value) (dissoc acc key)
                      :else
                      (let [node (when node-fn (node-fn acc))]
                        (cond
                          (node/node? node) (assoc acc key node)
                          (node/node? value) (assoc acc key value)
                          :else (assoc acc key (node/ensure-node :object value)))))))
                binding
                entries)))))

(defn- compile-project [[vars subop]]
  (let [var-keys (map (comp var-name second) vars)
        subf     (compile-algebra subop)]
    (fn [dataset bindings]
      (map (fn [binding] (select-keys binding var-keys))
           (subf dataset bindings)))))

(defn- aggregate-args [agg-type args]
  (let [[distinct? args] (if (= :distinct (first args))
                           [true (rest args)]
                           [false args])]
    (case agg-type
      :count (if (empty? args)
               {:type :count-star
                :distinct? distinct?}
               (let [expr (first args)]
                 {:type :count
                  :distinct? distinct?
                  :value-fn (compile-expr expr)
                  :node-fn (compile-node-expr expr)}))
      :sum {:type :sum
            :distinct? distinct?
            :value-fn (compile-expr (first args))
            :node-fn (compile-node-expr (first args))}
      :avg {:type :avg
            :distinct? distinct?
            :value-fn (compile-expr (first args))
            :node-fn (compile-node-expr (first args))}
      :min {:type :min
            :distinct? distinct?
            :value-fn (compile-expr (first args))
            :node-fn (compile-node-expr (first args))}
      :max {:type :max
            :distinct? distinct?
            :value-fn (compile-expr (first args))
            :node-fn (compile-node-expr (first args))}
      :sample {:type :sample
               :distinct? distinct?
               :value-fn (compile-expr (first args))
               :node-fn (compile-node-expr (first args))}
      :group_concat (let [[separator-expr & rest-args]
                           (if (and (seq args) (vector? (first args)) (= :separator (ffirst args)))
                             [(second (first args)) (rest args)]
                             [nil args])
                         expr0 (first rest-args)
                         expr (cond
                                (vector? expr0) expr0
                                (seq? expr0) (first expr0)
                                :else expr0)
                         separator (if separator-expr
                                     (node/literal->value (second separator-expr))
                                     " ")]
                     {:type :group-concat
                      :distinct? distinct?
                      :value-fn nil
                      :node-fn (compile-node-expr expr)
                      :separator separator})
      (throw (ex-info "Unsupported aggregate operator"
                      {:aggregate agg-type})))))

(defn- aggregate-inputs
  [{:keys [value-fn node-fn distinct?]} rows]
  (let [inputs (keep (fn [binding]
                       (let [node (when node-fn (node-fn binding))]
                         (if value-fn
                           (let [value (value-fn binding)]
                             (cond
                               (= value eval-error) nil
                               (= value ebv-error) nil
                               (nil? value) nil
                               :else {:value value
                                      :node node}))
                           (when node
                             {:value (node->value node)
                              :node node}))))
                     rows)]
    (if distinct?
      (->> inputs
           (reduce (fn [{:keys [seen acc]} {:keys [node value] :as input}]
                     (let [key (or node value ::null)]
                       (if (contains? seen key)
                         {:seen seen :acc acc}
                         {:seen (conj seen key)
                          :acc (conj acc input)})))
                   {:seen #{} :acc []})
           :acc)
      (vec inputs))))

(def ^:private numeric-type-precedence
  {"http://www.w3.org/2001/XMLSchema#double" 3
   "http://www.w3.org/2001/XMLSchema#decimal" 2
   "http://www.w3.org/2001/XMLSchema#float" 2
   "http://www.w3.org/2001/XMLSchema#integer" 1})

(defn- infer-numeric-type [{:keys [node value]}]
  (or (when (and node (node/literal-node? node))
        (let [dt (get-in node [1 :dt])]
          (when (contains? numeric-type-precedence dt)
            dt)))
      (cond
        (instance? Double value) node/xsd-double
        (instance? Float value)  node/xsd-double
        (instance? java.math.BigDecimal value) node/xsd-decimal
        (instance? java.math.BigInteger value) node/xsd-integer
        (integer? value) node/xsd-integer
        :else node/xsd-decimal)))

(defn- format-double-lexical [^double d]
  (cond
    (Double/isNaN d) "NaN"
    (= Double/POSITIVE_INFINITY d) "INF"
    (= Double/NEGATIVE_INFINITY d) "-INF"
    :else
    (let [s (Double/toString d)
          s (if (str/includes? s "E") (str/lower-case s) s)
          s (if (str/includes? s "e")
              s
              (str (if (str/includes? s ".") s (str s ".0")) "e0"))]
      s)))

(defn- numeric-info [{:keys [value node] :as input}]
  (cond
    (nil? value) nil
    (= value eval-error) nil
    (= value ebv-error) nil
    :else
    (let [datatype (infer-numeric-type input)
          lex (when (and node (node/literal-node? node))
                (node/literal-lex node))
          numeric-source (cond
                           (and node (node/literal-node? node))
                           (node/literal-lex node)
                           (instance? java.math.BigDecimal value)
                           value
                           :else value)]
      (try
        (let [^java.math.BigDecimal bd (cond
                                         (instance? java.math.BigDecimal numeric-source) numeric-source
                                         :else (bigdec numeric-source))]
          {:value bd
           :datatype datatype
           :lex lex
           :integral? (zero? (.scale bd))})
         (catch NumberFormatException _
           nil)))))

(defn- dominant-numeric-type
  ([infos default-type]
   (dominant-numeric-type infos default-type true))
  ([infos default-type include-integer?]
   (let [types (keep :datatype infos)]
     (cond
       (some #(= node/xsd-double %) types) node/xsd-double
       (some #(= node/xsd-float %) types) node/xsd-double
       (some #(= node/xsd-decimal %) types) node/xsd-decimal
       (and include-integer?
            (some #(= node/xsd-integer %) types)) node/xsd-integer
       :else default-type))))

(defn- make-count-agg [{:keys [distinct? value-fn type]}]
  (case type
    :count-star
    (fn [rows]
      (let [rows' (if distinct?
                    (distinct rows)
                    rows)
            total (count rows')]
        (node/literal-node (str total) node/xsd-integer nil)))

    :count
    (fn [rows]
      (let [values (aggregate-inputs {:value-fn value-fn :distinct? distinct?} rows)
            total (count values)]
        (node/literal-node (str total) node/xsd-integer nil)))

    :value
    (fn [rows]
      (let [values (aggregate-inputs {:value-fn value-fn :distinct? distinct?} rows)
            total (count values)]
        (node/literal-node (str total) node/xsd-integer nil)))))

(defn- make-sum-agg [{:keys [distinct? value-fn node-fn]}]
  (fn [rows]
    (let [inputs (aggregate-inputs {:value-fn value-fn :node-fn node-fn :distinct? distinct?} rows)
          infos  (keep numeric-info inputs)]
      (when (seq infos)
        (let [^java.math.BigDecimal total (reduce (fn [^java.math.BigDecimal acc {:keys [^java.math.BigDecimal value]}]
                                                    (.add acc value))
                                                  (bigdec 0)
                                                  infos)
              result-type (dominant-numeric-type infos node/xsd-integer)]
          (cond
            (= result-type node/xsd-double)
            (let [d (.doubleValue total)
                  lex (format-double-lexical d)]
              (node/literal-node lex node/xsd-double nil))

            (= result-type node/xsd-decimal)
            (node/literal-node (.toPlainString total) node/xsd-decimal nil)

            (= result-type node/xsd-integer)
            (try
              (let [^java.math.BigInteger big-int (.toBigIntegerExact total)]
                (node/literal-node (.toString big-int) node/xsd-integer nil))
              (catch ArithmeticException _
                (node/literal-node (.toPlainString total) node/xsd-decimal nil)))

            :else
            (node/literal-node (.toPlainString total) node/xsd-decimal nil)))))))

(defn- make-avg-agg [{:keys [distinct? value-fn node-fn]}]
  (fn [rows]
    (let [inputs (aggregate-inputs {:value-fn value-fn :node-fn node-fn :distinct? distinct?} rows)
          infos  (keep numeric-info inputs)
          count  (count infos)]
      (when (pos? count)
        (let [^java.math.BigDecimal total (reduce (fn [^java.math.BigDecimal acc {:keys [^java.math.BigDecimal value]}]
                                                    (.add acc value))
                                                  (bigdec 0)
                                                  infos)
              avg (.divide total (bigdec count) java.math.MathContext/DECIMAL128)
              result-type (dominant-numeric-type infos node/xsd-decimal false)]
          (if (= result-type node/xsd-double)
            (let [d (.doubleValue avg)
                  lex (format-double-lexical d)]
              (node/literal-node lex node/xsd-double nil))
            (let [avg' (if (zero? (.scale avg))
                         (.setScale avg 1 java.math.RoundingMode/UNNECESSARY)
                         avg)]
              (node/literal-node (.toPlainString avg') node/xsd-decimal nil))))))))

(defn- make-min-agg [{:keys [distinct? value-fn node-fn]}]
  (fn [rows]
    (let [inputs (aggregate-inputs {:value-fn value-fn :node-fn node-fn :distinct? distinct?} rows)
          best (reduce (fn [best candidate]
                         (if (nil? best)
                           candidate
                           (if (neg? (compare (:value candidate) (:value best)))
                             candidate
                             best)))
                       nil
                       inputs)]
      (when best
        (or (:node best)
            (node/ensure-node :object (:value best)))))))

(defn- make-max-agg [{:keys [distinct? value-fn node-fn]}]
  (fn [rows]
    (let [inputs (aggregate-inputs {:value-fn value-fn :node-fn node-fn :distinct? distinct?} rows)
          best (reduce (fn [best candidate]
                         (if (nil? best)
                           candidate
                           (if (pos? (compare (:value candidate) (:value best)))
                             candidate
                             best)))
                       nil
                       inputs)]
      (when best
        (or (:node best)
            (node/ensure-node :object (:value best)))))))

(defn- make-sample-agg [{:keys [distinct? value-fn node-fn]}]
  (fn [rows]
    (let [inputs (aggregate-inputs {:value-fn value-fn :node-fn node-fn :distinct? distinct?} rows)
          selected (last inputs)]
      (when selected
        (or (:node selected)
            (node/ensure-node :object (:value selected)))))))

(defn- input->lexical [{:keys [node value]}]
  (cond
    (and node (node/literal-node? node)) (node/literal-lex node)
    (and node (node/iri-node? node)) (second node)
    node (str node)
    :else (str value)))

(defn- make-group-concat-agg [{:keys [distinct? value-fn node-fn separator]}]
  (fn [rows]
    (let [inputs (aggregate-inputs {:value-fn value-fn :node-fn node-fn :distinct? distinct?} rows)]
      (when (seq inputs)
        (let [lexicals (map input->lexical inputs)
              parts (if distinct?
                      (sort #(compare %2 %1) lexicals)
                      lexicals)
              result (str/join separator parts)]
          (node/literal-node result node/rdf-string nil))))))

(defn- compile-aggregation [[var-node agg-expr]]
  (let [var (var-name (second var-node))
        [agg-type & args] agg-expr
        spec (aggregate-args agg-type args)
        evaluator (case agg-type
                    :count (make-count-agg spec)
                    :sum (make-sum-agg spec)
                    :avg (make-avg-agg spec)
                    :min (make-min-agg spec)
                    :max (make-max-agg spec)
                    :sample (make-sample-agg spec)
                    :group_concat (make-group-concat-agg spec)
                    (throw (ex-info "Unsupported aggregate function"
                                    {:aggregate agg-type})))]
    {:var var
     :eval evaluator}))

(defn- compile-group [[group-vars aggregations subop]]
  (let [group-keys (map (comp var-name second) group-vars)
        agg-fns    (map compile-aggregation aggregations)
        subf       (compile-algebra subop)]
    (fn [dataset bindings]
      (let [rows (vec (subf dataset bindings))
            grouped (reduce
                     (fn [acc binding]
                       (let [key (map #(get binding %) group-keys)]
                         (update acc key (fnil conj []) binding)))
                     {}
                     rows)]
        (map (fn [[key group-rows]]
               (let [base (zipmap group-keys key)]
                 (reduce
                  (fn [binding {:keys [var eval]}]
                    (let [value (eval group-rows)]
                      (if (nil? value)
                        (dissoc binding var)
                        (assoc binding var value))))
                  base
                  agg-fns)))
             grouped)))))


(defn- join-fn [left right]
  (fn [dataset bindings]
    (mapcat
     (fn [binding]
       (keep (fn [binding2]
               (let [merged (merge-bindings binding binding2)]
                 (when-not (= merged ::conflict) merged)))
             (right dataset [binding])))
     (left dataset bindings))))

(defn- leftjoin-fn [left right]
  (fn [dataset bindings]
    (mapcat
     (fn [binding]
       (let [matches (keep (fn [binding2]
                             (let [merged (merge-bindings binding binding2)]
                               (when-not (= merged ::conflict) merged)))
                           (right dataset [binding]))]
         (if (seq matches)
           matches
           [binding])))
     (left dataset bindings))))

(defn- compile-algebra [expr]
  (cond
    (nil? expr) (fn [_ bindings] bindings)
    (vector? expr)
    (let [[op & args] expr]
      (case op
        :bgp (compile-bgp args)
        :filter (compile-filter args)
        :extend (compile-extend args)
        :project (compile-project args)
        :distinct (let [subf (compile-algebra (first args))]
                    (fn [dataset bindings]
                      (distinct (subf dataset bindings))))
        :slice (let [[offset-node limit-node subop] args
                     offset (literal-node->number offset-node 0)
                     limit  (literal-node->number limit-node nil)
                     subf   (compile-algebra subop)]
                 (fn [dataset bindings]
                   (let [rows (vec (subf dataset bindings))
                         dropped (if (pos? offset) (subvec rows (min offset (count rows)) (count rows)) rows)
                         taken (if (and limit (pos? limit))
                                 (take limit dropped)
                                 dropped)]
                     taken)))
        :order (let [[order-specs subop] args
                     ordering (mapv (fn [spec]
                                      (cond
                                        (and (vector? spec) (= :desc (first spec)))
                                        {:dir :desc :fn (compile-expr (second spec))}
                                        (and (vector? spec) (= :asc (first spec)))
                                        {:dir :asc :fn (compile-expr (second spec))}
                                        :else
                                        {:dir :asc :fn (compile-expr spec)}))
                                    order-specs)
                     subf (compile-algebra subop)]
                 (fn [dataset bindings]
                   (let [rows (vec (subf dataset bindings))]
                     (sort (fn [a b]
                             (loop [[spec & more] ordering]
                               (if spec
                                 (let [va ((:fn spec) a)
                                       vb ((:fn spec) b)
                                       cmp (compare va vb)]
                                   (if (zero? cmp)
                                     (recur more)
                                     (if (= :desc (:dir spec))
                                       (- cmp)
                                       cmp)))
                                 0)))
                           rows))))
        :join (let [[l r] args]
                (join-fn (compile-algebra l) (compile-algebra r)))
        :leftjoin (let [[l r] args]
                    (leftjoin-fn (compile-algebra l) (compile-algebra r)))
        :sequence (let [[l r] args]
                    (join-fn (compile-algebra l) (compile-algebra r)))
        :union (let [[l r] args]
                 (let [lf (compile-algebra l)
                       rf (compile-algebra r)]
                   (fn [dataset bindings]
                     (concat (lf dataset bindings)
                             (rf dataset bindings)))))
        :minus (let [[l r] args
                     lf (compile-algebra l)
                     rf (compile-algebra r)]
                 (fn [dataset bindings]
                   (let [left-results  (vec (lf dataset bindings))
                         right-results (vec (rf dataset bindings))]
                     (remove
                      (fn [left-binding]
                        (some #(compatible-bindings? left-binding %)
                              right-results))
                      left-results))))
        :graph (let [[graph-node subop] args
                     graph-term (graph->pattern graph-node)
                     subf (compile-algebra subop)]
                 (if (= :constant (:term graph-term))
                   (let [graph-node-val (:node graph-term)]
                     (fn [dataset bindings]
                       (let [triples (->> (dataset-triples dataset)
                                          (filter (fn [{:keys [graph]}]
                                                    (if (= graph-node-val :default)
                                                      (= :default graph)
                                                      (= graph-node-val graph))))
                                          set)]
                         (subf {:triples triples} bindings))))
                   (throw (ex-info "GRAPH pattern with non-constant term is not supported in compiler"
                                   {:graph graph-node}))))
        :path (compile-path args)
        :group (compile-group args)
        :table (let [rows args]
                 (if (and (= 1 (count rows)) (= :unit (first rows)))
                   (fn [_ bindings] bindings)
                   (let [fixed-rows
                         (vec
                          (for [row rows
                                :when (and (vector? row) (= :row (first row)))]
                            (let [pairs (partition 2 (rest row))]
                              (into {}
                                    (map (fn [[var expr]]
                                           [(var-name (second var))
                                            (compile-expr expr)]))
                                    pairs))))]
                     (fn [dataset bindings]
                       (for [binding bindings
                             row fixed-rows]
                         (reduce (fn [acc [k f]]
                                   (assoc acc k (f acc)))
                                 binding
                                 row))))))
        :table-unit (fn [_ bindings] bindings)
        (throw (ex-info "Unsupported algebra operation"
                        {:op op :expr expr}))))
    :else (fn [_ bindings] bindings)))

(defn compile-query
  "Compile a parsed query map {:form .. :algebra ..} into executable function."
  [{:keys [form algebra] :as query}]
  (let [plan (compile-algebra algebra)
        solve (fn [dataset]
                (let [ds (ensure-dataset dataset)]
                  (vec (plan ds [{}]))))
        exec (case form
               :ask    (fn [dataset]
                         (boolean (seq (solve dataset))))
               :select (fn [dataset]
                         (solve dataset))
               :construct (fn [_] (throw (ex-info "Construct not implemented" {})))
               :describe (fn [_] (throw (ex-info "Describe not implemented" {})))
               (fn [_] nil))]
    (assoc query
           :execute exec
           :solve solve)))

;; -----------------------------------------------------------------------------
;; Updates

(defn- realize-triple
  [binding ^java.util.Map bnode-scope {:keys [graph triple]}]
  (let [[_ s p o] triple
        s-term (node->pattern s)
        p-term (node->pattern p)
        o-term (node->pattern o)
        graph-term (graph->pattern graph)
        graph-val (cond
                    (nil? graph-term) :default
                    (= (:term graph-term) :constant) (:node graph-term)
                    :else (realize-term graph-term binding bnode-scope))]
    {:graph (or graph-val :default)
     :s (realize-term s-term binding bnode-scope)
     :p (realize-term p-term binding bnode-scope)
     :o (realize-term o-term binding bnode-scope)}))

(defn- compile-update-op
  [{:keys [type delete insert where quads] :as op}]
  (case type
    :modify
    (let [delete-patterns delete
          insert-patterns insert
          where-plan      (compile-algebra where)]
      (fn [dataset binding]
        (let [ds (ensure-dataset dataset)
              seed (if (seq binding) [binding] [{}])
              solutions (vec (where-plan ds seed))
              solutions (if (seq binding)
                          (filter #(compatible-bindings? % binding) solutions)
                          solutions)]
          (reduce
           (fn [ds b]
             (let [bnode-scope (java.util.HashMap.)]
               (let [after-delete
                     (reduce (fn [acc pattern]
                               (remove-triple acc (realize-triple b bnode-scope pattern)))
                            ds
                            delete-patterns)
                     after-insert
                     (reduce (fn [acc pattern]
                               (add-triple acc (realize-triple b bnode-scope pattern)))
                            after-delete
                            insert-patterns)]
                 after-insert)))
           ds
           solutions))))

    :data-insert
    (fn [dataset _]
      (let [ds (ensure-dataset dataset)]
        (reduce
         (fn [ds pattern]
           (add-triple ds (realize-triple {} (java.util.HashMap.) pattern)))
         ds
         quads)))

    :data-delete
    (fn [dataset _]
      (let [ds (ensure-dataset dataset)]
        (reduce
         (fn [ds pattern]
           (remove-triple ds (realize-triple {} (java.util.HashMap.) pattern)))
         ds
         quads)))

    :delete-where
    (let [patterns delete]
      (fn [dataset binding]
        (let [ds (ensure-dataset dataset)
              seed (if (seq binding) [binding] [{}])
              solutions
              (reduce
               (fn [bindings {:keys [graph triple] :as pattern}]
                 (let [graph-term (graph->pattern graph)]
                   (mapcat #(match-triple ds triple % graph-term)
                           bindings)))
               seed
               patterns)
              solutions (if (seq binding)
                          (filter #(compatible-bindings? % binding) solutions)
                          solutions)]
          (reduce
           (fn [ds b]
             (let [bnode-scope (java.util.HashMap.)]
               (reduce
                (fn [acc pattern]
                  (remove-triple acc (realize-triple b bnode-scope pattern)))
                ds
                patterns)))
           ds
           solutions))))

    (fn [_ _]
      (throw (ex-info "Unsupported update operation"
                      {:op op})))))

(defn compile-update
  "Compile an update map {:algebra [...]} into executable function returning new dataset."
  [{:keys [algebra] :as update}]
  (let [ops (map compile-update-op algebra)
        exec (fn [dataset binding]
               (reduce (fn [ds op] (op ds binding))
                       (ensure-dataset dataset)
                       ops))]
    (assoc update
           :execute (fn
                      ([dataset]
                       (exec dataset {}))
                      ([dataset binding]
                       (exec dataset binding))))))
