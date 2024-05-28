(ns euler.level1.problem005)

(defn gcd [a b]
  (if (zero? (mod a b))
    b
    (gcd b (mod a b))))

(defn lcd [a b]
  (/ (* a b) (gcd a b)))

(defn euler-5 [ns]
  (reduce lcd ns))




