(ns fibonacci-clj.core)

(defn fib [number]
  (if (<= number 0) 0 
    (if (== number 1) 1
      (+ (fib (- number 1)) (fib (- number 2))))))
