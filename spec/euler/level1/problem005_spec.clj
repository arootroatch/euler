(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"
  (it "returns smallest multiple of all numbers in range"
    (should= 2 (euler-5 [1 2]))
    (should= 4 (euler-5 [2 4]))
    (should= 2520 (euler-5 (range 1 11)))
    (should= 232792560 (euler-5 (range 1 21))))
  (context "gcd"
    (it "is n if a = b"
      (should= 3 (gcd 3 3)))
    (it "is b if b divides a"
      (should= 3 (gcd 6 3)))
    (it "is the largest n that can divide a and b evenly"
      (should= 4 (gcd 12 8)))))





(run-specs)
