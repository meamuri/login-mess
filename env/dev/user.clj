(ns user
  (:require [clojure.tools.namespace.repl :as tn]
            [app.system :as system]))

(defn ^:private refresh-ns
  []
  (tn/refresh-all))

(defn start
  []
  (system/start))

(defn stop
  []
  (system/stop))

(defn restart
  []
  (stop)
  (refresh-ns)
  (start))

(comment
  (start)
  (stop)
  (restart)
  (refresh-ns))
