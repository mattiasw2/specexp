(ns specexp.spec1
  (:require
   [mw.std :refer :all]
   [clojure.tools.logging :as log]
   [clojure.spec.alpha :as s]
   [orchestra.spec.test :as stest]))

;; How to relate two separate arguments, for example a vector and an idx into the vector

(s/fdef get-only-first-half
        :args (s/cat :xs vector? :ii integer?)
        :ret some?)

(defn get-only-first-half
  "return the `ii` element of `xs`."
  [xs ii]
  (nth xs ii))

(orchestra.spec.test/instrument)
