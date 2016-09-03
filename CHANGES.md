# lein-viz - History and TODO

## TODO

## 0.2.0 / 2016-September-??

* Payload
  * Data to be under the key `:data`
  * [TODO] Visualization metadata to be under `:layout`
  * [TODO] Authorized seed keys to be under `:seed`
* Features
  * [TODO] Labeled edges: http://zerosalife.github.io/blog/2014/04/26/clojure-rhizome-labeled-edge-tutorial/
  * [TODO] Zoom into a subgraph by specifying the tip/root at the command line
* CLI support
  * Support for choosing selector `["-e" "--selector SELECTOR" "Selector in project.clj"]`
  * BREAKING CHANGE: Target is now called source `["-s" "--source SOURCE" "Fully qualified defn var name (arity-0)"]`
  * BREAKING CHANGE: Source may now be placed only under the `:source` key under a selector
  * Read payload from STDIN when source is `:stdin`
  * Flag to show/hide missing nodes `["-m" "--hide-missing" "Hide missing nodes in a graph"]`
  * [TODO] Flag to show the graph starting from a specified root
  * [TODO] Main action `["-a" "--action ACTION" "Action: view|emit" :default "view" ..]`
  * [TODO] Image type `["-e" "--ext EXTENSION" "Image file extension (file type)" :default "png" ..]`


## 0.1.0 / 2016-July-19

* CLI support
  * Target (fully qualified var name, arity-0 fn) support for fetching visualization data
  * Type detection of visualization data
  * Help/usage request
* Project metadata support
  * All command line arg info can be specified via project config (under `:viz` key)
* Show graph GUI
  * Color leaf nodes as green
  * Color root nodes as tan
  * Color missing dependency nodes as pink
* Show tree GUI
