(ns app.service.http
  "Http layer of an application"
  {:author "Roman Dronov"}
  (:require [integrant.core :as ig]
            [org.httpkit.server :as http]
            [app.backend :refer [handler]]))

(defmethod ig/init-key ::http
  [_ opts]
  (http/run-server handler {:port 8080}))

(defmethod ig/halt-key! ::http
  [_ server]
  (server))
