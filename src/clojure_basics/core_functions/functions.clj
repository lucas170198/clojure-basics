(ns clojure-basics.core-functions.functions)


(defn some-function
  "Some documentation for this function"
  [argument argument2]
  ;do-some-stuffs
  "returned value")

;calling the function
(some-function 1 2)
;=> "returned value"

(defn multi-arity
  ([x])
  ([x y])
  ([x y z]))

;Rest parameter
(defn some-func
  "In this case, others will be a vector of any parameters that customer pass"
  [val1 val2 & others])

;here, the others will be [3 4 5 6]
(some-func 1 2 3 4 5 6)

;Anonymous
(fn [param] (str "this functions doesent have a name"))

(#(+ % 3) 3)

(def sum-with-three #(+ % 3))

(sum-with-three 3)
;=> 6

(fn [number] (+ number 3))

(#(str %1 %2) "Hello" "!")
;=> "Hello!"

;Partial
(def plus-one (partial + 1))

;=> (defn plus-one [number] (+ number 1))

(plus-one 1)
;=> 2

(defn my-func [param1 param2])

(def my-func-with-param1-default (partial my-func :default))

