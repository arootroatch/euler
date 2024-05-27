(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (it "Detects if number is palindrome"
    (should= true (palindrome? 0))
    (should= true (palindrome? 313))
    (should= false (palindrome? 312))
    (should= true (palindrome? 906609)))
  (it "returns palindrome product"
      (should= 906609 (euler-4))))



(run-specs)
