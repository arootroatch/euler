(ns euler.level1.problem007
  (:require [euler.math :refer [get-primes prime?]]))

(defn euler-7 [index]
  (nth (get-primes 1000000) (dec index)))

