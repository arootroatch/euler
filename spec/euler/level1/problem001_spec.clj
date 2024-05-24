(ns euler.level1.problem001-spec
  (:use
    [euler.level1.problem001]
    [speclj.core]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "knows multiple of 3 and 5"
    (should= false (multiple-of-3-or-5? 0))
    (should= true (multiple-of-3-or-5? 6))
    (should= true (multiple-of-3-or-5? 10)))

  (it "returns the multiples of 3 or 5 from the range of a number"
    (should= [3 5 6 9] (multiples-less-than 10))
    (should= [3 5 6 9 10 12 15 18] (multiples-less-than 20)))

  (it "Solves #1"
    (should= 23 (euler-1 10))
    (should= 233168  (euler-1 1000))))


(run-specs)
