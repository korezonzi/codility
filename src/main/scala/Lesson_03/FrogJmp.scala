import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//3_1 https://app.codility.com/demo/results/training3NFF9N-YT4/
object FrogJump {
  def solution(x: Int, y: Int, d: Int): Int = {
    // write your code in Scala 2.12
    //ceil: 小数点切り上げ
    math.ceil( (y - x).toDouble/ d.toDouble).toInt
  }
}
