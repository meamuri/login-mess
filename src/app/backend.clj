(ns app.backend
  "Server application for serving content and providing REST API"
  {:author "Roman Dronov"}
  (:require
   [reitit.ring :as ring]))


(def handler
  (ring/ring-handler
   (ring/router
    [])
   (ring/routes
    (ring/create-resource-handler {:path "/" :root "public"})
    (ring/create-default-handler {:not-found {constantly {:status 404 :body {:message "Cannot found the resource"}}}}))))
