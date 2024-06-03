(ns euler.level1.problem009)

(defn ->addend-pairs [n]
  (loop [sub 1
         pairs []]
    (cond
      (< n 3) []
      (>= sub (/ n 2)) pairs
      :else (recur (inc sub) (conj pairs [(- n sub) sub])))))

(defn ->addend-triplets [n]
  (loop [sub 3
        triplets []]
    (cond
      (< n 6) []
      (< (- n sub) 3) (filter (fn [coll] (> (nth coll 0) (nth coll 1))) triplets)
      :else (recur (inc sub) (concat triplets (map #(cons (- n sub) %) (->addend-pairs sub)))))))

(defn py-triplet? [coll]
  (let [[c b a] coll]
   (and (< a b) (< b c) (= (* c c) (+ (* a a) (* b b))))))

(defn euler-9 [n]
  (reduce * (flatten (filter py-triplet? (->addend-triplets n)))))

