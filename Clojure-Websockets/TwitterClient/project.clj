(defproject birdwatch-tc "0.1.0-SNAPSHOT"
  :description "Twitter client part of the BirdWatch system"
  :url "https://github.com/matthiasn/Birdwatch"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha4"]
                 [twitter-api "0.7.6" :exclusions [org.clojure/clojure org.clojure/data.json]]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [clojurewerkz/elastisch "2.1.0"]
                 [org.clojure/tools.logging "0.3.0"]
                 [com.matthiasnehlsen/inspect "0.1.3"]
                 [ch.qos.logback/logback-classic "1.1.1"]
                 [org.clojure/core.match "0.2.1"]
                 [clj-time "0.8.0"]
                 [pandect "0.4.1"]
                 [clj-pid "0.1.1"]
                 [com.stuartsierra/component "0.2.2"]
                 [com.taoensso/carmine "2.8.0"]]

  :source-paths ["src/clj/"]

  :main ^:skip-aot birdwatch-tc.main
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}

  :plugins [[quickie "0.3.5" :exclusions [org.clojure/clojure org.codehaus.plexus/plexus-utils]]])
