(ns specexp.spec1-test
  (:require [clojure.test :refer :all]
            [specexp.spec1 :refer :all]))

(deftest throw-test
  (is (thrown? java.lang.Exception (throw (Exception. "foo")))))

(deftest related-arguments-test
  (testing "Related arguments."
    (is (= 3 (get-only-first-half [1 2 3] 2))))
  (testing "Fails with spec-error, since nil not allowed as return value."
    (is (thrown? clojure.lang.ExceptionInfo (get-only-first-half [1 2 nil] 2)))))
