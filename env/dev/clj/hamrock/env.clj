(ns hamrock.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [hamrock.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[hamrock started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[hamrock has shut down successfully]=-"))
   :middleware wrap-dev})
