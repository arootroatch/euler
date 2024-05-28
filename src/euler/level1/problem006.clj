(ns euler.level1.problem006)

(defn sum-of-squares [ns]
  (int (reduce + (map #(Math/pow %1 2) ns))))

(defn square-of-sum [ns]
  (int (Math/pow (reduce + ns) 2)))

(defn euler-6 [ns]
  (- (square-of-sum ns) (sum-of-squares ns)))



