(ns ethlance.server.syncer
  "Service that syncs the ethlance in-memory database with the ethereum
  blockchain by reading events emitted by the ethlance smart contracts."
  (:require
   [bignumber.core :as bn]
   [cljs-ipfs-api.files :as ifiles]
   [cljs-solidity-sha3.core :refer [solidity-sha3]]
   [cljs-web3.core :as web3]
   [cljs-web3.eth :as web3-eth]
   [clojure.core.async :as async :refer [go go-loop <! >! chan] :include-macros true]
   [cuerdas.core :as str]
   [district.server.config :refer [config]]
   [district.server.db :as district.db]
   [district.server.smart-contracts :as smart-contracts :refer [replay-past-events]]
   [district.server.web3 :refer [web3]]
   [district.shared.error-handling :refer [try-catch]]
   [district.web3-utils :as web3-utils]
   [mount.core :as mount :refer [defstate]]
   [print.foo :refer [look] :include-macros true]
   [taoensso.timbre :as log]

   [ethlance.server.db :as db]
   ;; Ethlance Models
   [ethlance.server.model.job :as job]
   [ethlance.server.model.user :as user]
   [ethlance.server.model.arbiter :as arbiter]
   [ethlance.server.model.candidate :as candidate]
   [ethlance.server.model.employer :as employer]))


(declare start stop)
(defstate ^{:on-reload :noop} syncer
  :start (start)
  :stop (stop))


(defn start [])


(defn stop [])
