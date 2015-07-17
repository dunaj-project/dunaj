;; Copyright (C) 2013, 2015, Jozef Wagner. All rights reserved.
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0
;; (http://opensource.org/licenses/eclipse-1.0.php) which can be
;; found in the file epl-v10.html at the root of this distribution.
;;
;; By using this software in any fashion, you are agreeing to be bound
;; by the terms of this license.
;;
;; You must not remove this notice, or any other, from this software.

(ns bare-ws.core
  "An entry point to the `bare with specials API`.

  IMPORTANT: Do not require this namespace directly.
  Idiomatic use is through the `:api` section of the
  `<<dunaj.lib.api.ad#ns,ns>>` macro.

  NOTE: Not used in Dunaj Lite

  Bare API does not refer to any var or host class,
  except special forms. Is used internally for Dunaj namespaces."
  {:authors ["Jozef Wagner"]}
  #?(:dunaj (:api clojure :exclude [init-api])))


;;;; Public API

(defn init-api
  "Bare with specials API. Nothing is refered, except special forms."
  [references & args]
  nil)
