(ns hamrock.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [hamrock.core-test]))

(doo-tests 'hamrock.core-test)

