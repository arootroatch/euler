(ns euler.level1.problem003
  (:require [euler.math :refer [get-primes]]))

(defn euler-3 [number]
  (if (= 0 number)
   0
   (let [primes (get-primes number)]
     (loop [index 0
            divisor number
            current-prime (nth primes index)]
       (if (= divisor current-prime)
         divisor
         (if (= 0 (rem divisor current-prime))
           (recur index (/ divisor current-prime) current-prime)
           (recur (inc index) divisor (nth primes (inc index)))))))))



