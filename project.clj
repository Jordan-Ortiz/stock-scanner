(defproject stock-scanner "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
  		[io.pedestal/pedestal.service "0.7.0-rc-2"]
		[clj-http "3.13.0" :exclusions [cheshire]]
		[cheshire "5.13.0"] ]
  :main ^:skip-aot stock-scanner.core
  :plugins [[lein-auto "0.1.3"]]
  :auto {"auto-reload" {:file-patterns [#"src/"]
                      :tasks ["run (-main)"]}}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
