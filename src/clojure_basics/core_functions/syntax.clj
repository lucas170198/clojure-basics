(ns clojure-basics.core-functions.syntax)


(comment
 "Clojure is a Lisp language.
  Clojure recognizes two types of structures: Literal representation of data structures & Operations"

 "Literal representations:"
  1
  "a string"
 ["a" "vector" "of" "strings"]

 "Operations (the way that you do things): Delimited by parameters + operator + operand"
 (operation operand1 operand2 operandN)

 "Obs: Forms is the terminology for a block of code")

(comment
 "Control Flow"
 "If statement"
 (if boolean-form
   then-form
   else-optional-form)
 "If you hide the else, the result of the if operation will be nil"
 "If you what do evaluate more then one form, you could use do operator"
 (if boolean-form
   (do then-form1 then-form2 then-form3)
   else-optional-form)

 "When statement - Same as (if (do)) without the else statement
  That means for false bool the when will return nil"

 (when then-form1 then-form2 then-formN)
 "The equality operations are using for any type (eg: we dont need to a special operator to comparing strings)"
 "nil, true, and false are values for clojure"
 "For the boolean forms, nil are considered a false value"

 ;will return the value related to the first truth condition
 (cond
    (some-condition) "do that"
    (another-condition) "do another"
    :else "Some else")

 (if nil
   "Truth form"
   "False form")
 ;=> "False form"

 "or & and operators"

 "or - return the first Truth value"
 (or false nil :first)
 ;=> :first

 (or (= 0 1) nil (= 1 1))

 "and - Return the first false value, or the last truth one"

 (and :one 2)
 ;=> 2

 (and 1 false 2)
 ;=> false

 "Binding values"
 (def some-value 2)

 "This is not a variable, clojure is a functional language. This is like a constant")

(let [some-value-let 2]
   (+ 1 some-value-let))



