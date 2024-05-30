(ns euler.level1.problem008-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem008 :refer :all]))

; https://projecteuler.net/problem=8

(describe "Euler Problem #8"

  (it "Solves #8"
    (should= 5832 (euler-8 4))
    (should= 23514624000 (euler-8 13)))
  (it "creates sub-vectors of given length"
    (should= [[1 2][2 3]] (->subvecs-of-length 2 [1 2 3]))))


(run-specs)