import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//6_1
object Distinct {
  def solution(a: Array[Int]): Int = {
    a.distinct.size
  }
}
