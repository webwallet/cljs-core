(ns webwallet.crypto.signing
  (:require ["elliptic" :as elliptic]))

(def curves {:elliptic
             {:ecdsaEd25519 (new elliptic/ec "ed25519")
              :eddsaEd25519 (new elliptic/eddsa "ed25519")}})
