(ns euler.level1.problem004)

(defn palindrome? [num]
  (let [num-string (str num)]
    (= num-string (apply str (reverse num-string)))))

(defn get-palindrome-products []
  (loop [factor-1 999
         factor-2 999
         products []]
    (if (= 100 factor-1 factor-2)
      (filter palindrome? products)
      (if (= factor-1 100)
        (recur (dec factor-2) (dec factor-2) (conj products (* factor-1 factor-2)))
        (recur (dec factor-1) factor-2 (conj products (* factor-1 factor-2)))))))

(defn euler-4 []
  (first (sort > (get-palindrome-products))))



