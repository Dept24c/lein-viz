;   Copyright (c) Shantanu Kumar. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file LICENSE at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.


(ns lein-viz.sample)


(defn make-graph
  []
  {:data {:service [:db :mailer]
          :db [:datasource]
          :datasource [:db-host :db-port :database :username :password]
          :mailer [:smtp-host :smtp-port]}})


(defn make-tree
  []
  {:data [:foo [10 20] :bar [30 40] :baz [50]]})
