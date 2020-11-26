(ns clojure-basics.core-functions.functional-basics)

(comment
 "Functions are First order citizen, so it's works like any value, can be passed as a parameters or be returned by another function"
 (defn apply-some-method [data applayer]
   (applayer data))

 (defn select-applyer [status]
   (cond
     (= status "some-status") (fn [data] (do-something))
     (= status "another-status") (fn [data] (do-another-thing))))

 "Pure functions:"
 "1. For the same input, the output it's always the same"
 "2. Dont cause any side effects"

 "Immutable data structures, that means all that structures on Clojure are constant values")