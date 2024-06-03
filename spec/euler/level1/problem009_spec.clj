(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; https://projecteuler.net/problem=9

(describe "Euler Problem #9"
  (it "detects if nums are a pythagorean triplet"
    (should= true (py-triplet? [5 4 3]))
    (should= false (py-triplet? [6 4 3])))
  (it "finds colls of three unique numbers whose sum is n"
    (should= [] (->addend-triplets 0))
    (should= [] (->addend-triplets 2))
    (should= [[3 2 1]] (->addend-triplets 6))
    (should= [[7 2 1][6 3 1][5 4 1][5 3 2]](->addend-triplets 10))
    (should= [[9 2 1] [8 3 1] [7 4 1] [7 3 2] [6 5 1] [6 4 2] [5 4 3]] (->addend-triplets 12)))
  (it "finds colls of two unique numbers whose sum is n"
    (should= [] (->addend-pairs 0))
    (should= [[2 1]] (->addend-pairs 3))
    (should= [[3 1]] (->addend-pairs 4))
    (should= [[4 1] [3 2]] (->addend-pairs 5))
    (should= [[9 1][8 2][7 3][6 4]] (->addend-pairs 10)))
  (it "returns product of py-triplet whose sum is n"
    (should= 60 (euler-9 12))
    (should= 31875000 (euler-9 1000))))



(run-specs)
