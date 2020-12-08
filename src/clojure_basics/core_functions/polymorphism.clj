(ns clojure-basics.core-functions.polymorphism
  (:import [clojure_basics.core_functions.polymorphism Http]))

(comment "An operation name that could run more than one algorithm"

         "Multi method"
         (defmulti process-by-status (fn [agreement] (:status agreement)))

         (defmethod process-by-status :agreement.status/new
           [agreement]
           do some stuff for new agreement)

         (defmethod process-by-status :agreement.status/paid
           [agreement]
           do some stuff for paid agreements)

         (defmethod process-by-status :default
           [agreement]
           throw a error exceptions)

         (process-by-status agreement)


         "Multi arity"
         (defn some-funtion
           ([param] (some-function param nil))
           ([param param2]))

         "Protocol"
         (defprotocol Parser "some documentation for the parser"
           (to-string [value] "this will parse to string")
           (to-int [value] "This will parse to int"))

         (extend-type java.lang.String Parser
           (to-string [value] value)
           (to-int [value] coverting a value to int))

         (to-int "Some string")



         "record"
         (defprotocol Http [component]
           (request! [component request-map]))

         (defrecord FormacariumHttp [routes]
           Http
           (request! [this request]
             {:status 200
              :body (file-consumer/mocks-answers (:url request))}))

         (http-core/request! ProdHttp )

         (Http. some-component)

         (->Http some-component)

         (map->Http {:component some-component}))



