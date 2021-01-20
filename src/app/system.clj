(ns app.system
  "Whole system of an application"
  {:author "Roman Dronov"}
  (:require [integrant.core :as ig]
            app.service.http))

(defonce ^:private system nil)

(def ^:private alter-system (partial alter-var-root #'system))

(defn start
  "Start whole system"
  []
  (alter-system (constantly (ig/init {:app.service.http/http {}}))))

(defn stop
  "Stop whole system"
  []
  (alter-system ig/halt!))
