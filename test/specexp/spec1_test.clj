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


(deftest
  get-only-first-half-test
  (comment
    "{:clojure.spec.alpha/problems [{:path [:ret], :pred clojure.core/some?, :val nil, :via [], :in []}], :clojure.spec.alpha/spec #object[clojure.spec.alpha$spec_impl$reify__751 0x8b74783 \"clojure.spec.alpha$spec_impl$reify__751@8b74783\"], :clojure.spec.alpha/value nil, :clojure.spec.alpha/ret nil, :clojure.spec.alpha/failure :instrument, :orchestra.spec.test/caller {:file \"form-init8646605561861935366.clj\", :line 211, :var-scope specexp.spec1/eval21444}}")
  (is
   (thrown?
    clojure.lang.ExceptionInfo
    (get-only-first-half [1 2 nil] 2))))
