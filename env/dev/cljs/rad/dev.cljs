(ns ^:figwheel-no-load rad.dev
  (:require
    [rad.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
