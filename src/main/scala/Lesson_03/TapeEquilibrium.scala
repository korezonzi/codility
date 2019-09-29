import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val sumNumber = a.sum
    val result = for(
      i <- 1 until a.length
    ) yield {
      val sepNum = a.splitAt(i)
      val a1     = sepNum._1.sum
      val a2     = sepNum._2.sum
        (a1-a2).abs
    }
    result.min
  }
}
