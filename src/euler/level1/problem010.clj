(ns euler.level1.problem010
  (:require [euler.math :refer [get-primes]]))

(defn euler-10 [n]
  (reduce + (get-primes n)))
