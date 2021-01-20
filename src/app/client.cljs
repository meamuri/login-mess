(ns app.client
  "Client application main module"
  {:author "Roman Dronov"}
  (:require [reagent.core :as reagent]
            [reagent.dom :as rdom]))

(defn ^:export refresh
  "Refresh hook for devtools"
  [])

(defn ^:private app 
  "Application entry point component"
  []
  [:div "hello world"])

(defn ^:export init
  "Entry point for an application"
  []
  (rdom/render [app] (.getElementById js/document "root")))
