(ns rad.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [rad.core-test]))

(doo-tests 'rad.core-test)
