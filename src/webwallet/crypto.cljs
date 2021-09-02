(ns webwallet.crypto
  (:require [webwallet.crypto.signing :as signing]))

(def crypto (js/require "crypto"))
