(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"
  (it "returns largest prime factor"
    (should= 0 (euler-3 0))
    (should= 3 (euler-3 6))
    (should= 29 (euler-3 13195))
    (should= 6857 (euler-3 600851475143)))
  (it "detects if number is prime"
    (should= true (prime? 3))
    (should= false (prime? 6))
    (should= true (prime? 97))
    (should= true (prime? 2))
    (should= false (prime? 1)))
  (it "generates all primes number <= target"
    (should= [2 3 5 7 11 13] (get-primes 15))))



(run-specs)
