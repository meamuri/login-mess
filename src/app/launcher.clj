(ns app.launcher
  "Entry point for the server side code. Genclass and -main provided"
  {:author "Roman Dronov"}
  (:require 
   [app.backend :as b]))

(defn -main
  [& _args]
  (println "hello"))
