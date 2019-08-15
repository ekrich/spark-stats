package ekrich

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD

object StatsApp {
  def main(args: Array[String]) {
    val conf = new SparkConf()
      .setAppName("Statistics  Application")
      .setMaster("local[*]")
      .set("spark.driver.bindAddress", "127.0.0.1")
    val sc = new SparkContext(conf)
    // start here for data setup
    val numbersFile = "numbers.csv" // Should be some file on your system
    val numbersLines = sc.textFile(numbersFile, 2).cache()
    // flatMap to flatten lines of numbers to just numbers
    val numbers = numbersLines
      .flatMap(line => line.split(",").map(s => s.trim.toDouble))
    // run calculation
    val stats = Stats.process(numbers)
    // Length: 7 Ave: 4.93 Variance: 1.96 Std Dev: 1.40
    stats.print()
  }
}
