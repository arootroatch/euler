(ns euler.level1.problem005)

(defn gcd [a b]
  (if (zero? (mod a b))
    b
    (recur b (mod a b))))

(defn lcm [a b]
  (/ (* a b) (gcd a b)))

(defn euler-5 [ns]
  (reduce lcm ns))




