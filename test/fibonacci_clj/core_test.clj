(ns fibonacci-clj.core-test
  (:require [clojure.test :refer :all]
            [fibonacci-clj.core :refer :all]))

(deftest zeroth-fib 
  (testing "Zeroth fibonacci"
    (is (= 0 (fib 0)))))

(deftest first-fib 
  (testing "First fibonacci"
    (is (= 1 (fib 1)))))

(deftest second-fib 
  (testing "Second fibonacci"
    (is (= 1 (fib 2)))))

(deftest third-fib 
  (testing "Third fibonacci"
    (is (= 2 (fib 3)))))

(deftest fourth-fib
  (testing "Fourth fibonacci"
    (is (= 3 (fib 4)))))

(deftest fifth-fib
  (testing "Fifth fibonacci"
    (is (= 5 (fib 5)))))

(deftest sixth-fib
  (testing "Sixth fibonacci"
    (is (= 8 (fib 6)))))

;(deftest tenth-fib
  ;(testing "Tenth fibonacci"
    ;(is (= 10 (fib 55)))))

;(deftest twentieth-fib
  ;(testing "Twentieth fibonacci"
    ;(is (= 20 (fib 6765)))))
