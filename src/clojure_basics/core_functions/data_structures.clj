(ns clojure-basics.core-functions.data-structures)

;"Obs: All data structures on clojure are immutable, so we don't have setters methods in the abstraction"

(def a-number 2)

(def a-string "String")

(def a-keyowrd :key)

; --------------- About maps
(def a-map
  {:some-key "some value"
   :nested-key {:some-key2 "some value 2"}
   :map-with-function (+ 1 1)})

;Get a key inside a map
(get a-map :some-key)
;=> "some key"

;Or
(:some-key a-map)
;=> "some key"

;Get a not existent key
(get a-map :another-key)
;=> nil

;Get a not existent key with default
(get a-map :another-key "Not found")
;=> "Not found"

;get nested key
(get-in a-map [:nested-key :some-key2])
;=> some-value2

;------------------ Lists and vectors
(def a-vector ["a" "b" "c"])

;get by index vector
(get a-vector 1)
;=> "a"

;Creating a new vector with one more value in the end
(conj a-vector 1)
;=> ["a" "b" "c" 1]

(def a-list '("a" "b" "c"))

;get by index list
(nth a-list 0)
;=> a

;-------------- Sets
(def a-set #{1 :a "b"})

(conj a-set :a)
;=> #{1 :a "b"}

(contains? a-set 1)
;=> true


