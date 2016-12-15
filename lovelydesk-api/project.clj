(defproject lovelydesk-api "1.0.1"
  :description "lovelydesk API"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [metosin/compojure-api "1.1.9"]
                 [com.datomic/datomic-free "0.9.5130"]
                 [com.datomic/clj-client "0.8.606"]
                 [org.clojure/core.async "0.2.395"]]
  :ring {:handler lovelydesk.api.handler/app}
  :uberjar-name "lovelydesk.jar"
  :uberwar-name "lovelydesk.war"
  :profiles {:uberjar {:resource-paths ["swagger-ui"]
                       :aot :all}
             :dev {:dependencies [[javax.servlet/servlet-api "2.5"]]
                   :plugins [[ikitommi/lein-ring "0.9.8-FIX"]]}}
   :jvm-opts ^:replace ["-Xmx2g" "-server"]
)
