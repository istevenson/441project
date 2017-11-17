(ns game.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; ask user for name of file to open
  (do
  	(println "Enter the name of the file...")
  	(let [fileName (read-line)]
  		(println (str "Opening '" fileName "'..."))))

  ;; open file and store in s
  (def currentFile (slurp fileName)))
