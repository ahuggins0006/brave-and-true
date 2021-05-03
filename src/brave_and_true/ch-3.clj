(ns brave-and-true.ch-3)

;; Exercise 1
;; Use the str, vector, list, hash-map, and hash-set functions.
;;

(str "Hello " "World")
;; => "Hello World"
(vector "Hello" "World")
;; => ["Hello" "World"]
(list "Hello" "World")
;; => ("Hello" "World")
(hash-map :Hello "World")
;; => {:Hello "World"}
(hash-set :Hello "World" :Hello "World")
;; => #{"World" :Hello}

;; Exercise 2
;; Write a function that takes a number and adds 100 to it.
(defn add-hundred [n] (+ n 100))
(add-hundred 1)
;; => 101

;; Exercise 3
;; Write a function, dec-maker, that works exactly like the function inc-maker except with subtraction:
;; (def dec9 (dec-maker 9))
;; (dec9 10)
;; => 1
(defn dec-maker [dec-by] #(- % dec-by))

;; test
(def dec9 (dec-maker 9))
(dec9 10)
;; => 1

;; Exercise 4
;; Write a function, mapset, that works like map except the return value is a set
;; (mapset inc [1 1 2 2])
;; => #{2 3}

(defn mapset [f coll]
  (->> coll
       (map f)
       (set)))

(mapset inc [1 1 2 2])
;; => #{3 2}

;; Exercise 5
;; Create a function that’s similar to symmetrize-body-parts except that it has to work with weird space aliens with radial symmetry. Instead of two eyes, arms, legs, and so on, they have five.
