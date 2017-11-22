(ns game.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; Ask user for name of file to open
  (do
  	(println "Enter the name of the file (with the extension)...")
  	(let [fileName (read-line)]
  		(println (str "Opening '" fileName "'..."))
  		;; File path for debbugging purposes
  		;;(println(System/getProperty "user.dir"))

  		;; Open file and store contents in var currentFile
  		(def currentFile (slurp (str "src/game/files/"fileName))))
  		(println currentFile)))
