
import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//1_1 https://app.codility.com/demo/results/training8A3AH5-MMY/
object BinaryGap {
  def solution(n: Int): Int = {
    // write your code in Scala 2.12

    //toBinaryString: 10進数 -> 2進数
    val binaryNumber:String = n.toBinaryString.split("1")
    val result = binaryNumber.isEmpty match {
      //only 1
      case true  => 0
      //include 0
      case false => {
        val hasSol = binaryNumber.last match {
          case "" => binaryNumber
          case _  => binaryNumber.reverse.tail
        }
        hasSol.map(_.size).max
      }
    }
    result
  }
}
