(defproject teste-jdbc-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/java.jdbc "0.7.0-alpha1"]
                 [org.postgresql/postgresql "9.4.1212"]]
  :plugins [[org.clojars.benfb/lein-gorilla "0.6.0"]]
  :main ^:skip-aot teste-jdbc-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
