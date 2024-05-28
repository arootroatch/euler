(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"

  (context "sum-of-squares"
           (it "1 should return 1"
             (should= 1 (sum-of-squares [1])))
           (it "2 should return 4"
             (should= 4 (sum-of-squares [2])))
           (it "1 through ten should equal 385"
             (should= 385 (sum-of-squares (range 1 11)))))
  (context "square-of-sum"
           (it "1 should return 1"
             (should= 1 (square-of-sum [1])))
           (it "2 should return 4"
             (should= 4 (square-of-sum [2])))
           (it "1 through ten is 3025"
             (should= 3025 (square-of-sum (range 1 11)))))
  (context "euler-6"
           (it "returns difference of sum-of-square and square-of-sum"
             (should= 2640 (euler-6 (range 1 11)))
             (should= 25164150 (euler-6 (range 1 101))))))



(run-specs)
