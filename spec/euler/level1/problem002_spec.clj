(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"
  (context "fib-nums"
           (it "generates fib sequence up to target number"
             (should= [1 2 3 5 8] (fib-nums 10))
             (should= [1 2 3 5 8 13] (fib-nums 13))))
  (context "generate-fibs"
           (it "generates fib sequence greater than or equal to target number"
             (should= [1 2 3 5 8 13] (generate-fibs 10))
             (should= [1 2 3 5 8] (generate-fibs 8))))
  (context "trim-to-target"
           (it "ensure fib seq doesn't exceed target number"
             (should= [1 2 3 5 8] (trim-to-target [1 2 3 5 8 13] 10))
             (should= [1 2 3 5 8] (trim-to-target [1 2 3 5 8] 8))))
  (context "euler-2"
           (it "sums all even fib nums less than or equal to target number"
             (should= 10 (euler-2 10))
             (should= 4613732 (euler-2 4000000)))))


(run-specs)
