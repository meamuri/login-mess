(ns app.client
  "Client application main module"
  {:author "Roman Dronov"}
  (:require [reagent.core :as reagent]
            [reagent.dom :as rdom]))

(defn ^:private app 
  "Application entry point component"
  []
  [:div#app 
   [:section#centred
    [:div#content
     [:div#logo 
      [:img {:style {:width 300 :height 150}}]]
     [:div#form-container
      [:form#login-form
       [:label {:for "login-input"} "Username"]
       [:input#login-input {:type "text"}]
       [:br]
       [:label {:for "password-input"} "Password"]
       [:input#password-input {:type "password"}]]]]
    [:div#footer
     [:p {:dangerouslySetInnerHTML {:__html "&copy; 2021, created by Roman Dronov"}}]]]])

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
