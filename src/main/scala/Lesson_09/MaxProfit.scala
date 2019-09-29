import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//9_1 https://app.codility.com/demo/results/trainingHX5EGY-F36/
object MaxProfit{
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    var minNum = 1000000000
    var max    = 0

    for(num <- a) {
      minNum = Math.min(minNum, num)
      max    = Math.max(num - minNum, max)
    }
    max
  }
}
