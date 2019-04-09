(ns demo.kaocha-either-test
  (:require [clojure.test :refer :all]
            [cats.monad.either :refer [left left? right right?]]))

(deftest monad-either-fail-example
  (is (= (right {}) {})))
