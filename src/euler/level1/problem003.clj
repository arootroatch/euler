(ns euler.level1.problem003
  (:require [euler.math :refer [get-primes]]))

(defn euler-3 [number]

   (let [primes (get-primes number)]
     (loop [index 0
            divisor number
            current-prime (nth primes index)]
       (cond
         (nil? primes) 0
         (= divisor current-prime) divisor
         (zero? (rem divisor current-prime)) (recur index (/ divisor current-prime) current-prime)
         :else (recur (inc index) divisor (nth primes (inc index)))))))



