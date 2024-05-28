(ns euler.math)

(defn prime? [number]
  (if (= 1 number)
    false
    (if (= 2 number)
      true
      (let [sqrt (Math/sqrt number)
            divisors (range 2 (inc sqrt))
            remainders (map #(rem number %1) divisors)
            zeroes (filter zero? remainders)]
        (empty? zeroes)))))

(defn get-primes [number]
  (filter prime? (range 2 number)))