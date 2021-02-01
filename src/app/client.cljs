(ns app.client
  "Client application main module"
  {:author "Roman Dronov"}
  (:require [reagent.core :as reagent]
            [reagent.dom :as rdom]))

(defn form 
  []
  (fn []
    [:form#login-form.pt-2.pb-2
     [:div.form-row.mb-3
      [:label {:for "login-input"} "Username"]
      [:input#login-input {:type "text"}]]
     [:div.form-row.mb-3
      [:label {:for "password-input"} "Password"]
      [:input#password-input {:type "password"}]]
     [:div.form-footer
      [:button#sign-in-button "Sign in"]]]))

(defn ^:private app 
  "Application entry point component"
  []
  [:div#app 
   [:section#centred
    [:div#content
     [:div#logo 
      [:img {:style {:width 300 :height 150}}]]
     [:div#app-name 
      [:h2 "An Application"]]
     [:div#form-container {:style {:width 480 :height 150}}
      [form]]]
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
