(ns adventofcode.dayone
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))



(defn readnums [filename]
  (->> filename
       slurp
       str/split-lines
       (map #(Integer/parseInt %))))

(let [nums (readnums "day1.txt")]
  (for [a nums
        b nums
        c nums
        :when (= 2020 (+ a b c))]
    [a b c]))