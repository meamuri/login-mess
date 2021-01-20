(ns app.client
  "Client application main module"
  {:author "Roman Dronov"}
  (:require [reagent.core :as reagent]
            [reagent.dom :as rdom]))

(defn ^:private app 
  "Application entry point component"
  []
  [:div "hello world"])

(defn ^:private mount
  "Mount main component to the root element"
  []
  (rdom/render [app] (.getElementById js/document "root")))

(defn ^:export init
  "Entry point for an application"
  []
  (mount))

(defn ^:export refresh
  "Refresh hook for devtools"
  []
  (mount))
