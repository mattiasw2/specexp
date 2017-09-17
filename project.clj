(defproject specexp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha20"]

                 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
                 ;; standard mattias libraries
                 ;; many of them already required by std.clj

                 ;; still have some refs to schema
                 [prismatic/schema "1.1.6"]

                 [org.clojure/tools.logging "0.4.0"]
                 [org.clojure/core.match "0.3.0-alpha4"]

                 ;; https://github.com/nathanmarz/specter
                 ;; https://github.com/nathanmarz/specter/wiki/List-of-Navigators#all
                 [com.rpl/specter "1.0.3"]

                 [com.taoensso/timbre "4.10.0"]

                 ;;; better assertions
                 ;;;   (let [n (have integer? n)]
                 ;;; https://github.com/ptaoussanis/truss
                 [com.taoensso/truss "1.5.0"]

                 ;;; frm .lein: spyscope: #spy/p #spy/d #spy/t
                 ;;; (take 20 (repeat #spy/p (+ 1 2 3)))
                 [spyscope "0.1.6"]

                 ;; since I so bad at Java file management, nice helper
                 [me.raynes/fs "1.4.6"]

                 ;; make instrumentation check :ret and :fn too
                 [orchestra "2017.08.13"]

                 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
                 ;; project specific libraries

                 ;; call sh, low-level also returns process id so I can kill the process.
                 [me.raynes/conch "0.8.0"]]

  :main ^:skip-aot specexp.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
