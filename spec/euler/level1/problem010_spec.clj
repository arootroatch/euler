(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

; https://projecteuler.net/problem=10

(describe "Euler Problem #10"

  (it "Solves #10"
    (should= 17 (euler-10 10))
    (should= 142913828922 (euler-10 2000000))) ;;this one is slow. 148933 prime numbers to generate.
  )

(run-specs)
