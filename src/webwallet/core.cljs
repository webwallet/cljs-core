(ns webwallet.core
  (:require [webwallet.crypto :as crypto]
            [webwallet.schemas :as schemas]))

(def exports (clj->js {:crypto {}}))
