(defproject lovelydesk-api "1.0.1"
  :description "lovelydesk API"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [metosin/compojure-api "1.1.9"]]
  :ring {:handler lovelydesk.api.handler/app}
  :uberjar-name "lovelydesk.jar"
  :uberwar-name "loverlydesk.war"
  :profiles {:uberjar {:resource-paths ["swagger-ui"]
                       :aot :all}
             :dev {:dependencies [[javax.servlet/servlet-api "2.5"]]
                   :plugins [[ikitommi/lein-ring "0.9.8-FIX"]]}})
