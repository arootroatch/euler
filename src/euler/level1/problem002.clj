(ns euler.level1.problem002)

(defn generate-fibs [target]
  (loop [fibs [1 1]]
    (if (<= target (last fibs))
      (drop 1 fibs)
      (recur (conj fibs (+ (last fibs) (nth fibs (- (count fibs) 2))))))))

(defn trim-to-target [fibs target]
  (if (< target (last fibs))
    (drop-last fibs)
    fibs))

(defn fib-nums [target]
  (trim-to-target (generate-fibs target) target))

(defn euler-2 [target]
  (reduce + (filter even? (fib-nums target))))

