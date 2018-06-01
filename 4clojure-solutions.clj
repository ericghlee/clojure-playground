; Fibonacci
(defn fibonacci [n] 
  (loop [x n, f (vector 1)]
    (if (> x 1)
      (recur
        (- x 1)
        (conj f (+ (last f) (if-let [last-but-one (second (reverse f))] last-but-one 0))))
      f)))

; Max
(defn max [& args] (reduce #(if (> %1 %2) %1 %2) args))
(comp last sort list)