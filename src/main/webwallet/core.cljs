(ns webwallet.core
  (:require [webwallet.crypto :as crypto]))

(def exports (clj->js {:crypto {}}))
