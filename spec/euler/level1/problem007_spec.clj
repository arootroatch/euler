(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"

  (it "Solves #7"
    (should= 3 (euler-7 2))
    (should= 5 (euler-7 3))
    (should= 104743 (euler-7 10001))))


(run-specs)
