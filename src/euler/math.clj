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
  (when-not (zero? number)
    (filter prime? (range 2 number))))

(defmulti coffee-bot identity)
(defmethod coffee-bot :V60 [_] "Here’s your pour over!")
(defmethod coffee-bot :Nespresso [_] "Here’s your Nespresso!")
(defmethod coffee-bot :default [_] "Here's your coffee!")
(defn make-coffee ([] (coffee-bot nil)) ([x] (coffee-bot x)))