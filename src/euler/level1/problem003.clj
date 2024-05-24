(ns euler.level1.problem003)

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



