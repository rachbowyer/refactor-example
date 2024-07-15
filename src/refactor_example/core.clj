(ns refactor-example.core
  (:gen-class))



(defn- example []
  (map #(* 2 %) (filter #(= 2 %) (range 10))))



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

