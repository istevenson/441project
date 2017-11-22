(ns game.core
  (:gen-class))

(use '[clojure.string :only (split triml)])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; Ask user for name of file to open
  (do
  	(println "Enter the name of the file (with the extension)...")
  	(let [fileName (read-line)]
  		(println (str "Opening '" fileName "'..." \newline))
  		;; File path for debbugging purposes
  		;;(println(System/getProperty "user.dir"))

  		;; Open file and store contents in var currentFile
  		(def currentFile (slurp (str "src/game/files/"fileName)))
  		(println (str "The file '" fileName "' contains: " \newline currentFile))

  		;; Start working with file contents
  		
  		(println (split currentFile #"\s+"))
  		)))
