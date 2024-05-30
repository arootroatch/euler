(ns euler.math)

(defn prime? [number]
  (cond (= 1 number) false
        (= 2 number) true
        :else (let [sqrt (Math/sqrt number)
                    divisors (range 2 (inc sqrt))
                    remainders (map #(rem number %1) divisors)
                    zeroes (filter zero? remainders)]
                (empty? zeroes))))

(defn get-primes [number]
  (filter prime? (range 2 number)))