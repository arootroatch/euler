(ns euler.level1.problem003
  (:require [euler.math :refer [get-primes]]))

(defn euler-3 [number]
  (if (zero? number)
   0
   (let [primes (get-primes number)]
     (loop [index 0
            divisor number
            current-prime (nth primes index)]
       (cond
         (= divisor current-prime)
             divisor
         (zero? (rem divisor current-prime))
             (recur index (/ divisor current-prime) current-prime)
         :else
             (recur (inc index) divisor (nth primes (inc index))))))))



