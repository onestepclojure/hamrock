(ns hamrock.app
  (:require [hamrock.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
