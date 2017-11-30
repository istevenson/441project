(ns game.core
  (:gen-class))

(use '[clojure.string :only (split triml)])
(require '[clojure.math.numeric-tower :as math])

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

  		;;;; Start working with file contents
  		(println (split currentFile #"\s+"))
  		;; Get number of coins in game play - 0th index in list of coins
  		(def coinList (split currentFile #"\s+"))
  		(def numCoins (nth coinList 0))
  		(println (str "..........Simulating Game Play.........."))
  		(println (str "There are " numCoins " coins in this game."))
  		(println (str "If both players play with the optimal strategy..."))
  		(println (str "Player 1:" (math/abs -2) "points"))
  		(println (str "Player 2: points"))

  		;; Sum even indices in list of coins
  		(defn sumEvens [max]
  		  (reduce +
  		    (for [i (range max) :when (even? i)] 
  		      i
		    )
  		  )
		)
  		(sumEvens 10)

  		;; Sum odd indices in list of coins
  		(defn sumOdds [max]
  		  (reduce +
  		    (for [i (range max) :when (odd? i)] 
  		      i
		    )
  		  )
		)
  		(sumEvens 10)
	)
))





