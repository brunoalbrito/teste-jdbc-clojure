(ns teste-jdbc-clojure.core
  (:require [clojure.string :as str]
            [clojure.java.jdbc :as j])
  (:gen-class))

(def db {:dbtype "postgresql"
         :dbname "teste_jdbc"
         :host "localhost"
         :user "postgres"
         :password ""})
         
(def state-sql (j/create-table-ddl :state [[:state_id :serial "PRIMARY KEY"]
                                           [:state "VARCHAR(32)"]
                                           [:abrv "VARCHAR(2)"]
                                           [:time_test :timestamp "NOT NULL" "DEFAULT CURRENT_TIMESTAMP"]]))


; (j/execute! db [state-sql])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
