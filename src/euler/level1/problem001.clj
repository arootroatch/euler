(ns euler.level1.problem001)


(defn multiple-of-3-or-5? [number]
  (if (= number 0)
    false
    (or (= (mod number 3) 0) (= (mod number 5) 0)))
    )

(defn multiples-less-than [number]
  (filter multiple-of-3-or-5? (range number)))

(defn euler-1 [number]
  (reduce + (multiples-less-than number)))
